package eu.larkc.core.query;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.query.BindingSet;
import org.openrdf.query.TupleQueryResultHandler;
import org.openrdf.query.TupleQueryResultHandlerException;

import eu.larkc.core.data.CloseableIterator;

/**
 * ORDIGraphResult implements asynchronous RDF statement result reading from
 * in-memory Sesame-compatible SPARQL endpoint.
 * 
 * @author vassil
 * 
 */
public class ORDIGraphResult extends GraphResultBase implements TupleQueryResultHandler {

	private String[] bindNames;
	private final static long serialVersionUID = 1L;

	public synchronized void startQueryResult(List<String> list) {
		bindNames = list.toArray(new String[list.size()]);
		if (bindNames.length < 3) {
			throw new RuntimeException("Incorrect query projection!");
		}
	}

	public synchronized void endQueryResult() {
		while (true) {
			try {
				results.put(new FinalStatement());
				return;
			} catch (InterruptedException ie) {
			}
		}
	}

	public synchronized void handleSolution(BindingSet bindingset)
			throws TupleQueryResultHandlerException {
		if (isClosed) {
			throw new TupleQueryResultHandlerException("Closed!");
		}
		Statement s = new StatementImpl((Resource) bindingset
				.getValue(bindNames[0]), (URI) bindingset
				.getValue(bindNames[1]), bindingset.getValue(bindNames[2]));

		while (true) {
			try {
				results.put(s);
				return;
			} catch (InterruptedException ie) {
			}
		}
	}

	public synchronized void close() {
		isClosed = true;
	}
	
	// Custom serialization methods
	private void writeObject(ObjectOutputStream out) throws IOException {
		CloseableIterator<Statement> i = getStatements();
		// used to wait until the bindNames field is init
		out.writeObject(bindNames);
		out.writeBoolean(i.hasNext());
		while (i.hasNext()) {
			out.writeObject(i.next());
			out.writeBoolean(i.hasNext());
		}
		out.flush();
		isClosed = true;
	}

	@SuppressWarnings("unchecked")
	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		this.results = new ArrayBlockingQueue<Statement>(1024);
		bindNames = (String[]) in.readObject();
		while (in.readBoolean()) {
			Statement s = (Statement) in.readObject();
			results.add(s);
		}
		results.add(new FinalStatement());
	}
}
