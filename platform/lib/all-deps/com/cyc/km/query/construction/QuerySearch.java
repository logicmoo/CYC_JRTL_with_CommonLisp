package com.cyc.km.query.construction;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */
import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.baseclient.api.SubLAPIHelper.AsIsTerm;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.kb.Query.Category;
import com.cyc.km.modeling.task.CycBasedTask;
import com.cyc.kb.Query;
import com.cyc.kb.KBObject;
import com.cyc.kb.QueryReader;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBObjectImpl;
import com.cyc.nl.Span;
import com.cyc.xml.query.FormulaTemplateUnmarshaller;
import com.cyc.kb.exception.KBApiException;
import com.cyc.xml.query.CyclQuery;
import com.cyc.xml.query.FormulaTemplate;

import java.io.ByteArrayInputStream;
import java.util.*;

import javax.xml.bind.JAXBException;



/**
 * QuerySearch is a class encapsulating the parameters and results of the
 * process of searching for <code>Queries</code> based on an NL string.
 *
 * @see com.cyc.kb.Query
 * @author David Baxter
 *
 * @todo think about adding situated terms and situated queries, which would be
 * wrappers around queries and terms that contain the spans, so everything can
 * be encapsulated in a single object. This seems like something that an
 * application developer would write fairly quicky, so we should probably just
 * include it from the start.
 *
 * @todo provide a short synopsis of what this does generally--what does it mean
 * to search for queries in a string, and how can the results be manipulated?
 * Pointers to a sharedNote might suffice.
 *
 */
public class QuerySearch {

  /**
   * Creates a new query search with the specified search string and task.
   *
   * @param searchString A natural language string (usually a question or other
   * sort of request for information)
   * @param task Provides the context for interpreting searchString as a set of
   * queries.
   */
  public QuerySearch(String searchString, CycBasedTask task) {
    this.searchString = searchString;
    this.task = task;
  }

  /**
   * Returns the task associated with this search.
   *
   * @return the task associated with this search.
   */
  public CycBasedTask getTask() {
    return task;
  }

  /**
   * Returns the search string associated with this search.
   *
   * @return the string for which matching queries are sought.
   */
  public String getSearchString() {
    return searchString;
  }

  /**
   * Returns the terms identified in the search string.
   *
   * @return the terms identified in the search string.
   * @todo explain what this is, and how it differs from getQueries. If the
   * terms are filtered, how does that happen, and can it be controlled?
   */
  public Collection<KBObject> getTerms() {
    return termLocations.getKeys();
  }
  
  /**
   * Returns a {@link Map} mapping terms identified in the search string
   * to the {@link Span}s where they were found. Each {@link java.util.Map.Entry}
   * can be considered a situated term, combining the {@link KBObject} with
   * its location information.
   * @see #getTerms() 
   * @return the map
   */
  public Map<KBObject, Collection<Span>> getSituatedTerms() {
    termLocations.maybeInitialize();
    return Collections.unmodifiableMap(termLocations);
  }

  /**
   * Returns the locations of the specified term in the search string.
   *
   * @param term A term identified in the search string.
   * @see com.cyc.km.query.construction.QuerySearch#getTerms().
   * @return the locations
   */
  public Collection<Span> getTermLocations(KBObject term) {
    return termLocations.getLocations(term);
  }

  /**
   * Returns the <code>Queries</code> identified with the search string.
   *
   * @return the queries found in the search string.
   * @todo expose the variable that allows you to specify what kinds of
   * variables you want.
   */
  public Collection<Query> getQueries() {
    return queryLocations.getKeys();
  }

  /**
   * Returns the locations of a <code>Query</code> identified with the search
   * string.
   *
   * @param query A particular <code>Query</code> that was found somewhere in
   * this <code>QuerySearch</code>
   * @return start, end indices for locations of query in search string.
   */
  public Collection<Span> getQueryLocations(Query query) {
    return queryLocations.getLocations(query);
  }
  
  /**
   * Returns a {@link Map} mapping queries identified in the search string
   * to the {@link Span}s where they were found. Each {@link java.util.Map.Entry}
   * can be considered a situated query, combining the {@link KBObject} with
   * its location information.
   * @see #getQueries() 
   * @return the map
   */
  public Map<Query, Collection<Span>> getSituatedQueries() {
    queryLocations.maybeInitialize();
    return Collections.unmodifiableMap(queryLocations);
  }

  // Private Area
  private CycList getCycTermSearchResults(final CycAccess cyc) throws CycApiException, CycConnectionException {
    final AsIsTerm coreCommand = SubLAPIHelper.makeNestedSubLStmt(
            "get-terms-from-cae-query-search", searchString);
    final String command = wrapTask(coreCommand);
    final CycList response = cyc.converse().converseList(command);
    return response;
  }

  private void processOneFolder(final CycList folderData) throws KBApiException {
    final String folderName = (String) folderData.getf(FOLDER);
    for (int i = 2; i < folderData.size(); i++) {
      processQueryDataForFolder((CycList) folderData.get(i), Category.get(
              folderName));
    }
  }

  private void processQueryDataForFolder(final CycList queryData,
          final Category category) throws KBApiException {
    final Integer offset = (Integer) queryData.getf(OFFSET);
    final Integer end = (Integer) queryData.getf(END);
    for (final Object cyclQuery : extractQueriesAndFormulas(queryData)) {
      if (cyclQuery instanceof CyclQuery) {
        processOneQuery((CyclQuery) cyclQuery, category, offset, end);
      }
    }
  }

  private List<Object> extractQueriesAndFormulas(final CycList queryData) {
    try {
      final String xml = (String) queryData.getf(XML);
      final FormulaTemplate formulaTemplate = (FormulaTemplate) formulaTemplateUnmarshaller.get().unmarshal(
              new ByteArrayInputStream(xml.getBytes()));
      final List<Object> queriesOrFormulas = formulaTemplate.getCyclQueryOrFormula();
      return queriesOrFormulas;
    } catch (JAXBException ex) {
      throw new RuntimeException(ex);
    }
  }

  private void processOneQuery(final CyclQuery cyclQuery,
          final Category category,
          final Integer offset, final Integer end) throws KBApiException {
    final Query query = queryReader.get().convertQuery(cyclQuery);
    query.addCategory(category);
    queryLocations.get(query).add(new Span(offset, end));
  }

  private CycList getCycQuerySearchResults() throws CycApiException, CycConnectionException {
    final CycAccess cyc = getCyc();
    final AsIsTerm coreCommand = SubLAPIHelper.makeNestedSubLStmt(
            "indexed-queries-from-string-with-confidences", searchString);
    final String command = requireNamespace(wrapTask(coreCommand));
    final CycList response = cyc.converse().converseList(command);
    return response;
  }

  private void processOneTermSearchResult(final Object obj, final CycAccess cyc) {
    final CycList substringData = (CycList) obj;
    final Integer offset = (Integer) substringData.getf(OFFSET);
    final Integer end = (Integer) substringData.getf(END);
    for (final CycObject denot : (List<CycObject>) substringData.getf(
            DENOTATIONS)) {
      processOneTermSearchResultDenot(cyc, CycNaut.convertIfPromising(denot),
              offset, end);
    }
  }

  private void processOneTermSearchResultDenot(final CycAccess cyc,
          final Object denot, final Integer offset, final Integer end) {
    try {
      final String denotString = denot.toString();
      final KBObject term = (cyc.getInspectorTool().isCollection(denot))
              ? KBCollectionImpl.get(denotString)
              : (denot instanceof CycObject && cyc.getInspectorTool().isIndividual(
                      (CycObject) denot))
              ? KBIndividualImpl.get(denotString)
              //: KBObjectFactory.getKBObject((CycObject) denot, KBObject.class);
              : KBObjectImpl.get((CycObject) denot);
      termLocations.get(term).add(new Span(offset, end));
    } catch (Exception e) {
      System.err.println("Couldn't find or create KBObject for " + denot);
      e.printStackTrace(System.err);
    }
  }

  private String requireNamespace(String command) {
    return SubLAPIHelper.wrapVariableBinding(
            command, CycObjectFactory.makeCycSymbol("*formula-template-include-namespace?*"),
            CycObjectFactory.makeCycSymbol("T"));
  }

  private String wrapTask(final AsIsTerm coreCommand) {
    return "(with-current-cae-task " + task.getTaskTerm().stringApiValue()
            + "\n "
            + coreCommand + ")";
  }

  private CycAccess getCyc() {
    return CycAccessManager.get().getCurrentAccess();
  }
  private final String searchString;
  private final CycBasedTask task;

  private abstract class LocationIndex<K> extends HashMap<K, Collection<Span>> {

    private LocationIndex() {
      super();
      put(null, null);
    }

    private boolean isVirgin() {
      return containsKey(null);
    }

    private void maybeInitialize() {
      synchronized (this) {
        if (isVirgin()) {
          initialize();
        }
      }
    }

    private Collection<K> getKeys() {
      maybeInitialize();
      return Collections.unmodifiableCollection(keySet());
    }

    private Collection<Span> getLocations(final K key) {
      maybeInitialize();
      return Collections.unmodifiableCollection(get(key));
    }

    private void initialize() {
      clear();
      populate();
    }

    protected abstract void populate();

    @Override
    public Collection<Span> get(Object key) {
      synchronized (QuerySearch.this) {
        Collection<Span> spans = super.get(key);
        if (spans == null) {
          spans = new HashSet<Span>();
          put((K) key, spans);
        }
        return spans;
      }
    }
  }
  private final LocationIndex<Query> queryLocations = new LocationIndex<Query>() {
    @Override
    protected void populate() {
      try {
        for (final Object obj : getCycQuerySearchResults()) {
          processOneFolder((CycList) obj);
        }
      } catch (Exception ex) {
        throw new RuntimeException(ex);
      }
    }
  };
  private final LocationIndex<KBObject> termLocations = new LocationIndex<KBObject>() {
    @Override
    protected void populate() {
      try {
        final CycAccess cyc = getCyc();
        for (final Object obj : getCycTermSearchResults(cyc)) {
          processOneTermSearchResult(obj, cyc);
        }
      } catch (CycApiException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CycConnectionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
  };
  private static final CycSymbolI END = CycObjectFactory.makeCycSymbol(":end");
  private static final CycSymbolI FOLDER = CycObjectFactory.makeCycSymbol(
          ":folder");
  private static final CycSymbolI OFFSET = CycObjectFactory.makeCycSymbol(
          ":offset");
  private static final CycSymbolI XML = CycObjectFactory.makeCycSymbol(":xml");
  private static final CycSymbolI DENOTATIONS = CycObjectFactory.makeCycSymbol(":denotations");
  private static ThreadLocal<FormulaTemplateUnmarshaller> formulaTemplateUnmarshaller
          = new ThreadLocal<FormulaTemplateUnmarshaller>() {
            @Override
            protected FormulaTemplateUnmarshaller initialValue() {
              try {
                return new FormulaTemplateUnmarshaller();
              } catch (JAXBException ex) {
                throw new RuntimeException(ex);
              }
            }
          };
  private static ThreadLocal<QueryReader> queryReader
          = new ThreadLocal<QueryReader>() {
            @Override
            protected QueryReader initialValue() {
              try {
                return new QueryReader();
              } catch (JAXBException ex) {
                throw new RuntimeException(ex);
              }
            }
          };
}
