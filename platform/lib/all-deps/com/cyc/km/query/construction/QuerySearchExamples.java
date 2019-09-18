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

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.nl.Paraphraser;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;
import com.cyc.kb.config.KBAPIConfiguration;
import com.cyc.km.modeling.task.CycBasedTask;
import com.cyc.kb.Query;
import com.cyc.kb.KBObject;
import com.cyc.nl.Span;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBException;

//import org.opencyc.api.CycAccess;
//import org.opencyc.cycobject.CycObject;
//import org.opencyc.nl.Paraphraser;

/**
 * Examples for using the QuerySearch class.
 *
 * @author baxter
 */
public class QuerySearchExamples {

  private static final String searchString = "What public corporations sell natural gas and what are their ticker symbols?";
  private static final String desiredTaskSummaryFragment = "Natural Gas";

  /**
   * Get a task with respect to which the query search will be performed.
   *
   * @return a task
   */
  public static CycBasedTask getATask() {
    // First, get all known tasks:
    final Set<CycBasedTask> allTasks = new HashSet<CycBasedTask>();
    try {
      allTasks.addAll(CycBasedTask.getAll());
      System.out.println("Got " + allTasks.size() + " tasks.");
    } catch (Exception ex) {
      System.err.println("Oops. Got exception finding set of Cyc-based tasks.");
      ex.printStackTrace(System.err);
    }
    // Then pick one you like:
    for (final CycBasedTask task : allTasks) {
      try {
        if (task.getSummary().contains(desiredTaskSummaryFragment)) {
          return task;
        }
      } catch (Exception ex) {
        System.err.println("Oops. Got exception checking " + task);
        ex.printStackTrace(System.err);
      }
    }
    throw new RuntimeException("Failed to get a task.");
  }

  /**
   * Print out the queries found by this search.
   *
   * @param querySearch
   * @throws Exception
   */
  public static void getAndDisplayQueries(final QuerySearch querySearch) throws Exception {
    final Collection<Query> queries = querySearch.getQueries();
    System.out.println("========================\nFound " + queries.size()
            + " queries:\n========================");
    Paraphraser paraphraser = getQueryParaphraser();
    for (final Query query : queries) {
      System.out.println(showLocations(querySearch.getSearchString(),
              querySearch.getQueryLocations(query)));
      System.out.println("CycL: "
              + query.getQuerySentenceCyc());
      System.out.println("Gloss: "
              + paraphraser.paraphrase(query).getString());
      System.out.println();
    }
  }

  /**
   * Print out the terms found by this search.
   *
   * @param querySearch
   * @throws Exception
   */
  public static void getAndDisplayTerms(final QuerySearch querySearch) throws Exception {
    final Collection<KBObject> terms = querySearch.getTerms();
    System.out.println("========================\nFound " + terms.size()
            + " terms:\n========================");
    Paraphraser termParaphraser = getTermParaphraser();
    for (final KBObject term : terms) {
      System.out.println(showLocations(querySearch.getSearchString(),
              querySearch.getTermLocations(term)));
      System.out.println("CycL: " + term.toString());
      System.out.println("NL: "
              + termParaphraser.paraphrase(term).getString());
      System.out.println();
    }
  }

  /**
   * Show the substrings demarcated by locations in searchString.
   *
   * @param searchString
   * @param locations
   * @return searchString with locations highlighted.
   */
  public static String showLocations(String searchString,
          Collection<? extends Span> locations) {
    String result = searchString;
    for (final Span location : locations) {
      result = showLocation(result, location);
    }
    return result;
  }

  /**
   * Highlight location in searchString.
   *
   * @param searchString
   * @param location
   * @return searchString with location highlighted.
   */
  public static String showLocation(String searchString, Span location) {
    final int startIndex = location.getOffset();
    final int endIndex = location.getEnd() + 1;
    return searchString.substring(0, startIndex) + '|'
            + searchString.substring(startIndex, endIndex) + '|'
            + searchString.substring(endIndex);
  }

  /**
   * Get a paraphraser suitable for paraphrasing queries.
   *
   * @return the paraphraser
   */
  public static Paraphraser getQueryParaphraser() {
    // Get a generic paraphraser:
    final Paraphraser paraphraser = Paraphraser.getInstance(Paraphraser.ParaphrasableType.QUERY);
    // This could be set either way. Experimentation encouraged!
    //paraphraser.setBlanksForVars(true); //this doesn't exist in the general paraphraser interface.  Only in the actual QueryParaphraser interface.
    return paraphraser;
  }

  /**
   * Get a paraphraser suitable for paraphrasing terms.
   *
   * @return the paraphraser
   */
  public static Paraphraser getTermParaphraser() {
    final Paraphraser<CycObject> cycObjectParaphraser = Paraphraser.getInstance(Paraphraser.ParaphrasableType.KBOBJECT);
    // Set the force appropriately for terms:
    //cycObjectParaphraser.setForce(NLForce.None);
    /** Wrap our CycObject paraphraser in an KBObject paraphraser that will delegate
     * paraphrasing of the Cyc objects to it:
     * */
    return cycObjectParaphraser;
  }

  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    try {
      CycAccessManager.get().setCurrentAccess(InteractiveCycAccessProvider.get().getAccess("localhost", 3600));
      KBAPIConfiguration.setShouldTranscriptOperations(false);
      QuerySearch querySearch = getQuerySearch();
      getAndDisplayTerms(querySearch);
      getAndDisplayQueries(querySearch);
      System.exit(0);
    } catch (Exception e) {
      e.printStackTrace(System.err);
      System.exit(-1);
    }
  }

  /**
   * Get a query search object initialized for a sample search string and task.
   *
   * @return the QuerySearch object for the sample task
   * @throws JAXBException
   */
  public static QuerySearch getQuerySearch() throws JAXBException {
    final CycBasedTask task = getATask();
    final QuerySearch querySearch = new QuerySearch(searchString, task);
    return querySearch;
  }
}
