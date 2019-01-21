package eu.larkc.core.data.iterator;

import java.util.HashSet;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.ContextStatementImpl;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.helpers.RDFHandlerBase;

import eu.larkc.core.data.CloseableIterator;

public class RDFHandlerIterator extends RDFHandlerBase implements
		CloseableIterator<Statement> {

	private boolean isClosed;
	private HashSet<Statement> statements = new HashSet<Statement>();
	private SimpleCloseableIterator<Statement> iter;
	private URI graph;

	public RDFHandlerIterator(URI graph) {
		if (graph == null) {
			throw new IllegalArgumentException();
		}
		this.graph = graph;
	}

	@Override
	public void close() {
		iter.close();
	}

	@Override
	public synchronized boolean hasNext() {
		return iter.hasNext();
	}

	@Override
	public Statement next() {
		return iter.next();
	}

	@Override
	public void remove() {
		iter.remove();
	}

	@Override
	public boolean isClosed() {
		return isClosed;
	}

	@Override
	public void handleStatement(Statement st) throws RDFHandlerException {
		statements.add(new ContextStatementImpl(st.getSubject(), st
				.getPredicate(), st.getObject(), graph));
	}

	@Override
	public void endRDF() {
		iter = new SimpleCloseableIterator<Statement>(statements.iterator());
	}
}
