package eu.larkc.core.data;

import java.util.ArrayList;
import java.util.Collection;

import org.openrdf.model.Statement;
import org.openrdf.model.impl.StatementImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;

/**
 * This class is a in-memory set of RDF statements.
 * 
 * @author vassil
 * 
 */
public class SetOfStatementsImpl implements SetOfStatements {

	private static final long serialVersionUID = 1L;
	private final Collection<Statement> data;

	public SetOfStatementsImpl(Iterable<Statement> data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data = new ArrayList<Statement>();
		// FIXME: Too slow, find a better way to guarantee serializations
		for (Statement st : data) {
			this.data.add(new StatementImpl(st.getSubject(), st.getPredicate(),
					st.getObject()));
		}
	}

	public SetOfStatementsImpl(Collection<Statement> data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data = new ArrayList<Statement>(data);
	}

	public CloseableIterator<Statement> getStatements() {
		return new SimpleCloseableIterator<Statement>(data.iterator());
	}
	
	public boolean equals(Object o) {
		if (o instanceof SetOfStatementsImpl == false) {
			return false;
		}
		return data.equals(((SetOfStatementsImpl) o).data);
	}
	
	public int hashCode() {
		return data.hashCode();
	}

}
