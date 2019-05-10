package eu.larkc.plugin.reason.urbancomputing.ubl.support;

import eu.larkc.core.data.VariableBinding;

/**
 * This is the interface of the core component of GraphProcessor Reasoner Plugin
 * 
 * @author: Daniele Dell'Aglio
 */
public interface GraphProcessor{
	/**
	 * starts the execution of the plugin
	 */
	public void process();
	/**
	 * @param e the event that notify a result
	 * @param resultType the format of the result (JSON, XML, ...)
	 * @return the result in the required format (if available)
	 */
	public VariableBinding getResult();
}
