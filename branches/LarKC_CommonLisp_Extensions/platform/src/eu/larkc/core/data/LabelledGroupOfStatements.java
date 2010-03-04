package eu.larkc.core.data;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;

/**
 * SetOfStatements passed by reference using a temporary statement tag. The
 * LarKC data model provides a unique feature to efficiently creates groups of
 * statements and associated individual statements to them.
 * 
 * For more information please refer to LarKC data model documentation.
 * 
 * @author vassil
 * 
 */
public interface LabelledGroupOfStatements extends SetOfStatements {

	/**
	 * Returns the name of the group label.
	 * 
	 * @return label
	 */
	public URI getLabel();

	/**
	 * Includes a new statement to the labeled group
	 * 
	 * @param subj
	 *            of the statement to be included (may be null for wildcards)
	 * @param pred
	 *            of the statement to be included (may be null for wildcards)
	 * @param obj
	 *            of the statement to be included (may be null for wildcards)
	 * @param graph
	 *            of the statement to be included (may be null for wildcards)
	 * @return if any statements were associated
	 */
	public boolean includeStatement(Resource subj, URI pred, Value obj,
			URI graph);

	/**
	 * Includes a statement to the labeled group.
	 * 
	 * @param theStatement
	 *            to be added
	 * @return if any statements were associated
	 */
	public boolean includeStatement(Statement theStatement);

	/**
	 * Excludes a statement from the labeled group.
	 * 
	 * @param subj
	 *            of the statement to be excluded (may be null for wildcards)
	 * @param pred
	 *            of the statement to be excluded (may be null for wildcards)
	 * @param obj
	 *            of the statement to be excluded (may be null for wildcards)
	 * @param graph
	 *            of the statement to be excleded (may be null for wildcards)
	 * @return if any statements were excluded
	 */
	public boolean excludeStatement(Resource subj, URI pred, Value obj,
			URI graph);

	/**
	 * Excludes a statement from the labeled group.
	 * 
	 * @param theStatement
	 *            to be excluded
	 * @return if any statements were excluded
	 */
	public boolean excludeStatement(Statement theStatement);

	/**
	 * Gets the RDF store connection to contains the labeled group.
	 * 
	 * @return connection to RDF store to contains the labeled group
	 */
	public RdfStoreConnection getRdfStoreConnection();
}
