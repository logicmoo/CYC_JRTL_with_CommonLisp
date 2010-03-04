package eu.larkc.core.data;

import org.openrdf.model.Statement;

public interface SetOfStatements extends InformationSet {

	public CloseableIterator<Statement> getStatements();
}
