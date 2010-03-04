package eu.larkc.core.data;

import java.util.Collection;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;

/**
 * @author  vassil
 */
public class RdfGraphInMemory extends RdfGraphBase {

	private SetOfStatements data;
	private static final long serialVersionUID = 1L;

	public RdfGraphInMemory(URI graph, Iterable<Statement> data) {
		super(graph);
		this.data = new SetOfStatementsImpl(data);
	}

	public RdfGraphInMemory(URI graph, Collection<Statement> data) {
		super(graph);
		this.data = new SetOfStatementsImpl(data);
	}

	public CloseableIterator<Statement> getStatements() {
		return data.getStatements();
	}

	public boolean equals(Object o) {
		if (o instanceof RdfGraphInMemory == false) {
			return false;
		}
		return data.equals(((RdfGraphInMemory) o).data);
	}

	public int hashCode() {
		return getName().toString().hashCode();
	}
}
