package eu.larkc.plugin.reason.urbancomputing.ubl;

import java.util.ArrayList;
import java.util.Iterator;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;

import org.openrdf.query.algebra.StatementPattern;
import org.openrdf.query.algebra.helpers.StatementPatternCollector;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;

import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import org.jgrapht.Graph;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.plugin.reason.urbancomputing.ubl.support.*;

/**
 * Test shortest path reasoner. It reads DataSet and converts graps into the
 * org.jgrapht.Graph, which is the input for Djikstra shortest path algorithm
 * 
 * @author Luka Bradesko, Daniele Dell'Aglio
 * 
 */
public class OpResPathFinderReasoner implements Reasoner {

	private GraphProcessor gp;
	private String start, goal;

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

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setInputQuery(Query theQuery) {
		// TODO Auto-generated method stub

	}

	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		Logger log = LoggerFactory.getLogger(OpResPathFinderReasoner.class);
		System.err.println("Called Urban Reasoner");
		
		Iterator<RdfGraph>[] lit;
		
		if (theSetOfStatements instanceof DataSet){
			log.info("The set of statements is a data set!");
			DataSet ds = (DataSet) theSetOfStatements;
			lit = new Iterator[2];
			lit[0] = ds.getNamedGraphs().iterator();
			lit[1] = ds.getDefaultGraphs().iterator();
		}else if(theSetOfStatements instanceof RdfGraph){
			log.info("The set of statements is a rdf graph!");
			RdfGraph graph = (RdfGraph) theSetOfStatements;
			lit = new Iterator[1];
			ArrayList<RdfGraph> list = new ArrayList<RdfGraph>();
			list.add(graph);
			lit[0] = list.iterator();
		}else{
			log.info("The set of statements is not a data set!");
			return null;
		}

		// set the start and the goal nodes:
		start = "";
		goal = "";
		SPARQLQueryImpl q = (SPARQLQueryImpl) theQuery;

		StatementPatternCollector collector = new StatementPatternCollector();
		q.getParsedQuery().getTupleExpr().visit(collector);
		for (StatementPattern sp : collector.getStatementPatterns()) {
			if (sp.getPredicateVar().getValue().toString().equals(
					"http://www.linkingurbandata.org/onto/ama/pathFrom")) {
				start = sp.getObjectVar().getValue().toString();
			}
			if (sp.getPredicateVar().getValue().toString().equals(
					"http://www.linkingurbandata.org/onto/ama/pathTo")) {
				goal = sp.getObjectVar().getValue().toString();
			}
		}

		// fill the graph with the data contained in RDF models
		int i = 0;

		Graph<String, NamedWeightedEdge> graph = new DefaultDirectedWeightedGraph<String, NamedWeightedEdge>(
				NamedWeightedEdge.class);
		
		RdfGraph g;

		for (int c = 0; c < lit.length; c++) {
			Iterator<RdfGraph> it = lit[c];
			while (it.hasNext()) {
				ArrayList<Resource> nodeList = new ArrayList<Resource>();
				g = it.next();
				// RdfGraph g = ds.getNamedGraphs().iterator().next();//TODO:
				// for now it takes only one graph and wiuthout checking if data
				// exists
				URI gname = g.getName();

				RdfStoreConnection con = DataFactory.INSTANCE
						.createRdfStoreConnection();
				CloseableIterator<Statement> nodes = con
						.search(
								null,
								null,
								new URIImpl(
										"http://www.linkingurbandata.org/onto/ama/Node"),
								gname, null);
				while (nodes.hasNext()) {
					Statement nodeSt = nodes.next();
					Resource r = nodeSt.getSubject();
					nodeList.add(r);
					graph.addVertex(r.stringValue());
					// System.out.println("Adding "+r.stringValue());
				}
				nodes.close();

				log.info("End of searching nodes");

				for (Resource from : nodeList) {
					CloseableIterator<Statement> edges = con
							.search(
									null,
									new URIImpl(
											"http://www.linkingurbandata.org/onto/ama/lFrom"),
									from, gname, null);

					while (edges.hasNext()) {
						Statement edgeSt = edges.next();
						Resource e = edgeSt.getSubject();

						Value to = con
								.search(
										e,
										new URIImpl(
												"http://www.linkingurbandata.org/onto/ama/lTo"),
										null, gname, null).next().getObject();

						NamedWeightedEdge edge = graph.addEdge(from
								.stringValue(), to.stringValue());
						if (edge != null) {
							edge.setLabel(e.stringValue());

							String w = con
									.search(
											e,
											new URIImpl(
													"http://www.linkingurbandata.org/onto/ama/length"),
											null, gname, null).next()
									.getObject().stringValue();
							Double weight;
							if (w.indexOf("\"^") >= 0)
								weight = Double.parseDouble(w.substring(1, w
										.indexOf("\"^")));
							else
								weight = Double.parseDouble(w);
							((AbstractBaseGraph<String, NamedWeightedEdge>) graph)
									.setEdgeWeight(edge, weight);
							i++;
						}
					}
					edges.close();
				}
			}
		}
		// search for all nodes

		// end of Conversion

		log.info("Reasoning....");
		try {
			gp = new ProcessorShortestPath(graph, start, goal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// gp.addResultListener(this);
		gp.process();

		log.info("END OF SEARCH");
		return gp.getResult();
	}

}