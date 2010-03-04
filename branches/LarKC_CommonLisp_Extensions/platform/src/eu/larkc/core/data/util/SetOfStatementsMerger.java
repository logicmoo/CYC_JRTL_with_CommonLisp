package eu.larkc.core.data.util;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.LabelledGroupOfStatementsImpl;
import eu.larkc.core.data.SetOfStatements;

/**
 * SetOfStatementsMerger is an utility class to merge arbitrary sets of RDF data
 * and to package them as LabelledGroupOfStatements that could be passed by
 * value. Please note that some of the RDF data merges could be IO and
 * computationally expensive operations and should be performed with care.
 * 
 * @author vassil
 * 
 */
public class SetOfStatementsMerger extends LabelledGroupOfStatementsImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * Default construct of this class.
	 */
	public SetOfStatementsMerger() {
		super(DataFactory.INSTANCE.createRdfStoreConnection());
	}

	/**
	 * Adds a new RDF data to the current group
	 * @param rdf data to be merge
	 */
	public void add(SetOfStatements rdf) {
		CloseableIterator<Statement> iter = rdf.getStatements();
		while (iter.hasNext()) {
			Statement s = iter.next();
			if (s.getContext() instanceof URI == false) {
				getRdfStoreConnection()
						.addStatement(s.getSubject(), s.getPredicate(),
								s.getObject(), getLabel(), getLabel());
			} else {
				getRdfStoreConnection().addStatement(s.getSubject(),
						s.getPredicate(), s.getObject(), (URI) s.getContext(),
						getLabel());
			}
		}
	}

	protected void finalize() {
		try {
			if (getRdfStoreConnection() != null) {
				getRdfStoreConnection().removeStatement(null, null, null,
						getLabel());
			}
		} catch (Throwable t) {
		}
	}
}
