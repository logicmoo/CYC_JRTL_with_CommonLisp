package eu.larkc.plugin.reason.urbancomputing.ubl.support;

import org.jgrapht.Graph;

import eu.larkc.core.data.VariableBinding;

/**
 * 
 * @author Daniele Dell'Aglio
 *
 * entry point of the business logic of the GraphProcessor plugin
 *
 */

public class ProcessorShortestPath implements GraphProcessor{
	Graph<String,NamedWeightedEdge> g;
	GraphOperation op;
	GraphOutputConverter goc;
	
	public ProcessorShortestPath(Graph<String,NamedWeightedEdge> g,  String start, String goal){
		OperationDijkstra<String> temp = new OperationDijkstra<String>(g, start, goal);
		op = temp;
		goc = temp;
	}
	
	public VariableBinding getResult() {
		return goc.getOutput();
	}

	public void process() {
		op.exec();
	}
}
