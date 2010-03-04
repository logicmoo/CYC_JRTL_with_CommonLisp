package eu.larkc.core.data;

import java.util.List;

import org.openrdf.model.Value;

/**
 * VariableBinding is SPARQL SELECT query result iterator.
 * 
 * @author vassil
 * 
 */
public interface VariableBinding extends InformationSet {

	/**
	 * Gets the list of variables in the projection.
	 * 
	 * @return
	 */
	List<String> getVariables();

	/**
	 * Gets an iterator of the solutions.
	 * 
	 * @return
	 */
	CloseableIterator<Binding> iterator();

	/**
	 * Binding is SPARQL SELECT solution.
	 * 
	 * @author vassil
	 * 
	 */
	public static interface Binding {
		/**
		 * Gets a list of the RDF values that are part of the query solution.
		 * 
		 * @return
		 */
		List<Value> getValues();
	}
}
