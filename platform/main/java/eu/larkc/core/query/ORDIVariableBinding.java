package eu.larkc.core.query;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.openrdf.model.Value;
import org.openrdf.query.BindingSet;
import org.openrdf.query.TupleQueryResultHandler;
import org.openrdf.query.TupleQueryResultHandlerException;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;

/**
 * ORDIVariableBinding implements asynchronous RDF solution result reading from
 * Sesame enabled SPARQL query engine.
 * 
 * @author vassil
 * 
 */
public class ORDIVariableBinding extends VariableBindingBase implements
		TupleQueryResultHandler {

	private final static long serialVersionUID = 1L;

	@Override
	public synchronized void startQueryResult(List<String> list) {
		bindNames = list.toArray(new String[list.size()]);
		super.notifyAll();
	}

	@Override
	public void endQueryResult() {
		while (true) {
			try {
				results.put(new FinalBindingSet());
				return;
			} catch (InterruptedException ie) {
			}
		}
	}

	@Override
	public synchronized void handleSolution(BindingSet bindingset)
			throws TupleQueryResultHandlerException {
		if (isClosed) {
			throw new TupleQueryResultHandlerException("Closed!");
		}
		while (true) {
			try {
				results.put(bindingset);
				return;
			} catch (InterruptedException ie) {
			}
		}
	}

	// Custom serialization methods
	private void writeObject(ObjectOutputStream out) throws IOException {
		CloseableIterator<Binding> i = iterator();
		// used to wait until the bindNames field is init
		getVariables();
		out.writeObject(bindNames);
		out.writeBoolean(i.hasNext());
		while (i.hasNext()) {	
			out.writeObject(i.next().getValues());
			out.writeBoolean(i.hasNext());
		}
		out.flush();
		isClosed = true;
	}

	@SuppressWarnings("unchecked")
	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		bindNames = (String[]) in.readObject();
		List<Binding> data = new ArrayList<Binding>();
		while (in.readBoolean()) {
			List<Value> vals = (List<Value>) in.readObject();
			data.add(new WrappedBinding(vals));
		}
		iterator = new SimpleCloseableIterator<Binding>(data.iterator());
	}
}
