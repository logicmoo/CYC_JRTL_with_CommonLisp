package eu.larkc.plugin.reason.urbancomputing.ubl.support;

//import java.io.ByteArrayInputStream;
//import java.util.Iterator;
import java.util.List;

import java.util.logging.Logger;
import org.jgrapht.Graph;
import org.jgrapht.alg.DijkstraShortestPath;

//import com.hp.hpl.jena.query.ResultSet;
//import com.hp.hpl.jena.query.ResultSetFactory;

import eu.larkc.core.data.VariableBinding;

/**
 * 
 * @author Daniele Dell'Aglio
 * 
 * Executes Dijkstra on a graph and return the found path in
 * a VariableBinding object
 * 
 * @param <V> the class of the vertexes
 */
public class OperationDijkstra<V> implements GraphOperation, GraphOutputConverter {
	private V start;
	private V goal;
	
	private static Logger logger = Logger.getLogger(OperationDijkstra.class.getCanonicalName());
	
	private Graph<V, NamedWeightedEdge> graph;
	
	VariableBinding ret;
	
	public OperationDijkstra(Graph<V, NamedWeightedEdge> graph, V start, V goal){
		this.start=start;
		this.goal=goal;
		this.graph=graph;
	}
	
	public void exec(){
		List<NamedWeightedEdge> lst;
		double length;
		logger.fine("start: "+start+" goal: "+goal);
		
		if(graph.containsVertex(start) && graph.containsVertex(goal)){
			DijkstraShortestPath<V,NamedWeightedEdge> sp = new DijkstraShortestPath<V, NamedWeightedEdge>(graph, start, goal);
			length=sp.getPathLength();
			lst=sp.getPathEdgeList();
		}
		else{
			length=Double.POSITIVE_INFINITY;
			lst = new java.util.ArrayList<NamedWeightedEdge>();
		}
		ret = new PathVariableBinding(lst, length);
	}
	
	public VariableBinding getOutput(){
		return ret;
	}
	//format the output
/*	public String outputXML(){
		StringBuffer ret = new StringBuffer();
		ret.append("<?xml version=\"1.0\"?>"+
			"<sparql"+
			" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\""+
			" xmlns:xs=\"http://www.w3.org/2001/XMLSchema#\""+
			" xmlns=\"http://www.w3.org/2005/sparql-results#\" >"+
			"<head>"+
			"<variable name=\"p\"/>"+
			"<variable name=\"w\"/>"+
			"<variable name=\"n1\"/>"+
			"<variable name=\"l\"/>"+
			"<variable name=\"n2\"/>"+
			"</head>"+
			"<results>");
		if(!Double.isInfinite(length))
			for(Iterator<NamedWeightedEdge> i=lst.iterator();i.hasNext();){
				NamedWeightedEdge temp = i.next();
				ret.append("<result>"+
					"<binding name=\"p\">"+
					"<uri>http://seip.cefriel.it/ama/resource/path1</uri>"+
					"</binding>"+
					"<binding name=\"w\">"+
					"<literal datadype=\"http://www.w3.org/2001/XMLSchema#float\">"+length+"</literal>"+
					"</binding>"+
					"<binding name=\"n1\">"+
					"<uri>"+temp.getFrom()+"</uri>"+
					"</binding>"+
					"<binding name=\"l\">"+
					"<uri>"+temp.getLabel()+"</uri>"+
					"</binding>"+
					"<binding name=\"n2\">"+
					"<uri>"+temp.getTo()+"</uri>"+
					"</binding>"+
					"</result>");
			}
		ret.append("</results></sparql>");
		return ret.toString();
	}
	
	public String outputJSON(){
		String ret = "{\"head\":{\"vars\":[\"p\",\"w\",\"n1\",\"l\",\"n2\"]},"+
			 "\"results\":{\"bindings\":[";

		StringBuffer sb=new StringBuffer();
		if(!Double.isInfinite(length))
			for(Iterator<NamedWeightedEdge> i=lst.iterator();i.hasNext();){
				NamedWeightedEdge temp = i.next();
				sb.append("{\"p\":{\"type\":\"uri\",\"value\":\"http://seip.cefriel.it/ama/resource/path1\"},"+
					"\"w\":{\"type\":\"literal\",\"value\":"+length+"},"+
					"\"n1\":{\"type\":\"uri\",\"value\":\""+temp.getFrom()+"\"},"+
					"\"l\":{\"type\":\"uri\",\"value\":\""+temp.getLabel()+"\"},"+
					"\"n2\":{\"type\":\"uri\",\"value\":\""+temp.getTo()+"\"}}"+(i.hasNext()?",":""));
			}
		ret+=sb.toString()+"]}}";
		
		return ret;
		
	}
	
	public ResultSet outputResultSet(){
		return ResultSetFactory.fromJSON(new ByteArrayInputStream(this.outputJSON().getBytes()));
	}
*/
}
