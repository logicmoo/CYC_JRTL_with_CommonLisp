package eu.larkc.plugin.select.sparqlkeyword;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.openrdf.model.BNode;
import org.openrdf.model.Literal;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.algebra.QueryModelNode;
import org.openrdf.query.algebra.ValueConstant;
import org.openrdf.query.algebra.Var;
import org.openrdf.query.algebra.helpers.QueryModelVisitorBase;
import org.openrdf.query.parser.ParsedQuery;
import org.openrdf.query.parser.sparql.SPARQLParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.HTTPRemoteGraph;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.util.SetOfStatementsMerger;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;

public class BaseLineFTSelecter implements Selecter {
	RdfStoreConnection rdfStoreConnection = null;

	public static class PluginContract implements Contract {
		private static final long serialVersionUID = 4964585541551132712L;
		SPARQLQuery theQuery;
		int maxMolecules = Integer.MAX_VALUE;
		int selectedMolecules = 0;
		int selectedStatements = 0;
		public PluginContract(SPARQLQuery query) {
			theQuery = query;
		}
		public PluginContract(SPARQLQuery query, int limit) {
			this(query);
			maxMolecules = limit;
		}
		public SPARQLQuery getInputQuery() {
			return theQuery;
		}
		public int getMaxMolecules() {
			return maxMolecules;
		}
		public void setSelectedMolecules(int count) {
			selectedMolecules = count;
		}
		public int getSelectedMolecules() {
			return selectedMolecules;
		}
		public int getSelectedStatements() {
			return selectedStatements;
		}
		public void setSelectedStatements(int count) {
			selectedStatements = count;
		}
	}
	
	protected RdfStoreConnection getConnection() {
		if (rdfStoreConnection == null) {
			rdfStoreConnection = DataFactory.INSTANCE.createRdfStoreConnection();
		}
		return rdfStoreConnection;
	}
	
	protected SetOfStatements prepareForSPARQL(SetOfStatements rdf) {
		if (rdf instanceof DataSet) return rdf;
		if (rdf instanceof LabelledGroupOfStatements) return rdf;
		
		// bring the set of statements locally so they can be queried
		SetOfStatementsMerger merger = new SetOfStatementsMerger();
		merger.add(rdf);
		return merger;
	}
	
	protected SPARQLEndpoint getEndpoint(SetOfStatements rdf) {
		if (rdf instanceof DataSet) {
			return ((DataSet)rdf).getSPARQLEndpoint();
		} else if (rdf instanceof LabelledGroupOfStatements) {
			return ((LabelledGroupOfStatements)rdf).getRdfStoreConnection();
		} else {
			return null;
		}
	}
	
	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}
	
	@Override
	public void shutdown() {
	}

	public LabelledGroupOfStatements select(SetOfStatements rdf, Contract contract, Context ctx) {
		PluginContract pluginContract = (PluginContract)contract; 
		SPARQLQuery inputQuery = pluginContract.getInputQuery();
		
		// prepare the RDF set of statements for SPARQL queries
		rdf = prepareForSPARQL(rdf);
		
		// transform input into query-able SPARQL endpoint
		SPARQLEndpoint endpoint = getEndpoint(rdf);

		// create a new tripleset to be returned
		LabelledGroupOfStatements sos = getConnection().createLabelledGroupOfStatements();

		// extract keywords from input query
		Collection<String> keywords = extractKeywords(inputQuery.toString());

		// build search queries for those keywords
		Collection<SPARQLQuery> queries = prepareQueries(keywords, rdf);
		
		// use an atomic integer as a counter object
		int maxMolecules = pluginContract.getMaxMolecules();
		if (maxMolecules <= 0) 
			maxMolecules = Integer.MAX_VALUE;
		AtomicInteger limit = new AtomicInteger(maxMolecules);
		AtomicInteger count = new AtomicInteger();
		
		// for each keyword we build search query for getting the relevant nodes
		try {
			for (SPARQLQuery query : queries) {
				// search for relevant nodes in graph
				CloseableIterator<Binding> it = endpoint.executeSelect(query).iterator();
				while (it.hasNext()) {
					Value node = (Value)it.next().getValues().get(0);
					locateMolecules(node, endpoint, sos, null, limit, count);
				}
			}
		} catch (Exception ex) {
			System.err.println(ex);
			return null;
		}
		// return the number of selected molecules as part of the contract
		pluginContract.setSelectedMolecules(maxMolecules - limit.get());
		pluginContract.setSelectedStatements(count.get());
		
		return sos;
	}
	
	private void locateMolecules(Value node, SPARQLEndpoint endpoint,
			LabelledGroupOfStatements sos, Set<String> visited, 
			AtomicInteger limit, AtomicInteger count) {
		// check if limit was reached
		if (limit.get() <= 0)
			return;
		if (visited == null) {
			visited = new HashSet<String>();
		}
		// check if this is a blank node that we might have visited already
		if (node instanceof BNode) {
			String id = ((BNode)node).getID();
			if (visited.contains(id)) return;
			// this is a fresh blank node we haven't yet visited
			visited.add(id);
		}
		// search all incoming edges for this node
		Iterator<Statement> iter = filterEndpoint(endpoint, null, null, node);
		while (iter.hasNext()) {
			Statement st = iter.next();
			Resource sourceNode = st.getSubject();
			if (sourceNode instanceof BNode) { 
				// dive recursively into current blank node
				locateMolecules(sourceNode, endpoint, sos, visited, limit, count);
			} else {
				String id = sourceNode.stringValue();
				if (visited.contains(id)) continue;
				visited.add(id);
				if (limit.get() <= 0) continue;
				limit.decrementAndGet();
				// this is not a blank, it should be an URI - select its molecule
				selectMolecule(sourceNode, endpoint, sos, null, count);
			}
		}
	}

	private void selectMolecule(Resource node, SPARQLEndpoint endpoint,
			LabelledGroupOfStatements sos, Set<String> visited, AtomicInteger count) {
		if (visited == null) {
			visited = new HashSet<String>();
		}
		// check if this is a blank node that we might have visited already
		if (node instanceof BNode) {
			String id = ((BNode)node).getID();
			if (visited.contains(id)) return;
			// this is a fresh blank node we haven't yet visited
			visited.add(id);
		}
		// search all outgoing edges for this node
		Iterator<Statement> iter = filterEndpoint(endpoint, node, null, null);
		while (iter.hasNext()) {
			Statement st = iter.next();
			Resource targetNode = st.getSubject();
			if (targetNode instanceof BNode) { 
				// dive recursively into current blank node
				selectMolecule(targetNode, endpoint, sos, visited, count);
			}
			count.incrementAndGet();
			// select statement as part of the molecule
			sos.includeStatement(st);
		}
	}

	private Iterator<Statement> filterEndpoint(SPARQLEndpoint endpoint,
			Resource subj, URI pred, Value obj) {
		if (endpoint instanceof RdfStoreConnection) {
			// filtering a store connection is easier than a general endpoint
			try {
				return ((RdfStoreConnection)endpoint).search(subj, pred, obj, null, null);
			} catch (Exception ex) {
				ex.printStackTrace(); 
			}
		} else {
			// TODO: create and execute a SPARQL query to filter endpoint
		}
		// return empty iterator
		return new Iterator<Statement>() {
			public boolean hasNext() {
				return false;
			}
			public Statement next() {
				return null;
			}
			public void remove() {
			}
		};
	}
	
	public static Collection<String> extractKeywords(String queryString) {
		final Collection<String> keywords = new LinkedList<String>();

		SPARQLParser queryParser = new SPARQLParser();
		ParsedQuery query;
		try {
			query = queryParser.parseQuery(queryString, null);
		} catch (MalformedQueryException e) {
			return keywords;
		}
		try {
			query.getTupleExpr().visit(new QueryModelVisitorBase<Exception>() {
				public void meet(ValueConstant node) {
					collectValue(node.getValue());
				}
				public void meet(Var node) {
					if (node.hasValue()) collectValue(node.getValue());
				}
				public void meetNode(QueryModelNode node) {
					try {
						node.visitChildren(this);
					} catch (Exception ex) {}
				}
				void collectValue(Value v) {
					String str = null;
					if (v instanceof URI) {
						str = ((URI)v).getLocalName();
					} else
						if (v instanceof Literal) {
							str = ((Literal)v).getLabel();
						} else {
							// some value (e.g. b-node) we're not interested in
						}
					// see if we have something to collect
					if (str != null) tokenizeString(str);
				}
				void tokenizeString(String str) {
					char[] chars = (str + ".").toCharArray();
					int start = -1, index = 0;
					for (char ch : chars) {
						if (Character.isLetter(ch)) {
							if (start < 0) start = index;
						} else {
							if (start >= 0) {
								tokenizeWord(new String(chars, start, index - start));
								start = -1;
							}
						}
						index++;
					}
				}
				void tokenizeWord(String word) {
					// additional tokenization pending...
					keywords.add(word.toLowerCase());
				}
			});
		} catch (Exception ex) {
			// ignore exceptions at this level
		}
		return keywords;
	}

	protected String prepareQuery(String word) {
		return "SELECT DISTINCT ?o WHERE { ?s ?p ?o . <" + word + ":> <http://www.ontotext.com/matchIgnoreCase> ?o}";
	}
	
	protected Collection<SPARQLQuery> prepareQueries(Collection<String> terms, SetOfStatements sos) {
		LinkedList<SPARQLQuery> result = new LinkedList<SPARQLQuery>();
		for (String term : terms) {
			String queryString = prepareQuery(term);
			SPARQLQuery query = new SPARQLQueryImpl(queryString);
			// restrict the query to labeled group of statements if needed
			if (sos instanceof LabelledGroupOfStatements) {
				query.setLabelledGroup(((LabelledGroupOfStatements)sos).getLabel());
			}
			result.add(query);
		}
		return result;
	}

	public URI getIdentifier() {
		return new URIImpl("http://BaseLineFTSelecter.larkc.eu/");
	}

	public MetaData getMetaData() {
		// prepare meta-data about this plug-in
		MetaDataImpl metaData = new MetaDataImpl(Selecter.class.getCanonicalName());

		// add what it can get on the input and what it gives on the output
		metaData.addMethod( new MethodMetaDataImpl("sparqlselect",
				new String[] {
				MethodMetaDataImpl.getGemericsName(
						Collection.class.getCanonicalName(),
						DataSet.class.getCanonicalName()), DataSet.class.getCanonicalName() },
						LabelledGroupOfStatements.class.getCanonicalName()));		

		return metaData;
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(BaseLineFTSelecter.class);
		// Instantiate the base-line full text searches selecter
		BaseLineFTSelecter s = new BaseLineFTSelecter();
		// Create plug-in contract
		Contract contract = new BaseLineFTSelecter.PluginContract(
			new SPARQLQueryImpl(
				"SELECT ?s ?p ?o WHERE { ?s ?p ?o FILTER(?s = 'sweet elyse ventana') }"
			), 2
		);
		// Select a tripleset associated with keywords found in the query
		SetOfStatements sos = new HTTPRemoteGraph(new URIImpl(
				"http://www.ninebynine.org/Software/HaskellRDF/RDF/Harp/test/wine.rdf"));
		// Do selection
		LabelledGroupOfStatements ts = s.select(sos, contract, null);
		if (ts != null) log.info("tripleset-uri: " + ts.getLabel());
	}
}
