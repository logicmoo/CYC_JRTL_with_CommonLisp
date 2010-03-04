package eu.larkc.core.data;

import org.openrdf.model.URI;

/**
 * Named RDF graph pass by value or reference.
 * 
 * @author vassil
 * 
 */
public interface RdfGraph extends SetOfStatements {

	/**
	 * 
	 * @return
	 */
	public URI getName();

}