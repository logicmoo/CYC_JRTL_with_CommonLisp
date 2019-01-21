package eu.larkc.core.data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;

/**
 * @author vassil
 */
public class LabelledGroupOfStatementsImpl implements LabelledGroupOfStatements {

	private static final long serialVersionUID = 1L;
	private transient RdfStoreConnection con;
	private URI label;
	private int transId;
	

	public LabelledGroupOfStatementsImpl(RdfStoreConnection con) {
		if (con == null) {
			throw new IllegalArgumentException("null!");
		}
		this.con = con;
		this.label = generateLabel();
	}

	public LabelledGroupOfStatementsImpl(URI label, RdfStoreConnection con,
			boolean validate) {
		if (con == null || label == null) {
			throw new IllegalArgumentException("null!");
		}
		if (validate) {
			CloseableIterator<Statement> iter = con.search(null, null, null,
					null, label);
			if (iter.hasNext()) {
				validate = false;
			}
			iter.close();
			if (validate) {
				throw new IllegalArgumentException("The label is already used!");
			}
		}
		this.con = con;
		this.label = label;
	}

	@Override
	public boolean excludeStatement(Resource subj, URI pred, Value obj,
			URI graph) {
		if (con.deassociateStatements(subj, pred, obj, graph, label)) {
			transId++;
			return true;
		}
		return false;
	}

	@Override
	public boolean excludeStatement(Statement s) {
		if (s != null && s instanceof URI == false) {
			return false;
		}
		if (con.deassociateStatements(s.getSubject(), s.getPredicate(), s
				.getObject(), (URI) s.getContext(), label)) {
			transId++;
			return true;
		}
		return false;
	}

	@Override
	public URI getLabel() {
		return label;
	}

	@Override
	public RdfStoreConnection getRdfStoreConnection() {
		return con;
	}

	@Override
	public boolean includeStatement(Resource subj, URI pred, Value obj,
			URI graph) {
		if (con.associateStatements(subj, pred, obj, graph, label)) {
			transId++;
			return true;
		}
		return false;
	}

	@Override
	public boolean includeStatement(Statement s) {
		if (con.associateStatements(s.getSubject(), s.getPredicate(), s
				.getObject(), (URI) s.getContext(), label)) {
			transId++;
			return true;
		}
		return false;
	}

	@Override
	public CloseableIterator<Statement> getStatements() {
		return con.search(null, null, null, null, label);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof LabelledGroupOfStatementsImpl == false) {
			return false;
		}
		if (label.equals(((LabelledGroupOfStatementsImpl) o).label) == false) {
			return false;
		}
		return transId == ((LabelledGroupOfStatementsImpl) o).transId;
	}

	@Override
	public int hashCode() {
		// the mutable hashcodes are risky (transId is excluded)
		return label.hashCode();
	}

	private URI generateLabel() {
		Random rand = new Random();
		return new URIImpl("http://labelledgroup.larkc.eu/" + rand.nextDouble());
	}

	// Custom serialization methods
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeObject(label);
		Iterator<Statement> iter = getStatements();
		out.writeBoolean(iter.hasNext());
		while (iter.hasNext()) {
			Statement s = iter.next();
			out.writeObject(s);
			out.writeBoolean(iter.hasNext());
		}
		out.flush();
	}

	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		con = DataFactory.INSTANCE.createRdfStoreConnection();
		label = (URI) in.readObject();
		while (in.readBoolean()) {
			Statement s = (Statement) in.readObject();
			includeStatement(s);
		}
	}
}
