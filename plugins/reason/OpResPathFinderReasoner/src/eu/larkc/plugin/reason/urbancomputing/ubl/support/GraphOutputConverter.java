package eu.larkc.plugin.reason.urbancomputing.ubl.support;

import eu.larkc.core.data.VariableBinding;

/**
 * @author Daniele Dell'Aglio
 * 
 * The interface of the output converter (from graph structure data to the rdf model)
 * 
 */
public interface GraphOutputConverter {
	/**
	 * @return the result of the operation in XML format (as defined in SPARQL recommendation) 
	 */
	public VariableBinding getOutput();
}
