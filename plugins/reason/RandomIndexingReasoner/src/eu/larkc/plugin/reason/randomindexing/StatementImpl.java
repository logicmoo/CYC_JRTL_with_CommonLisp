/**
 * 
 */
package eu.larkc.plugin.reason.randomindexing;

import org.openrdf.model.Resource;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;

/**
 * This is a help class to create Value,URI and Subject objects(that make a
 * statement) out of Strings...
 * 
 * @author R.B.Vidal - Max-Planck Institute Berlin
 * 
 */
public class StatementImpl implements Statement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -463600162592464416L;
	private String subject, predicate, object;

	/**
	 * The constructor accepts the strings subject, predicate and object,
	 * representing a rdf statement.
	 */
	public StatementImpl(String subject, String predicate, String object) {
		this.subject = subject;
		this.predicate = predicate;
		this.object = object;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openrdf.model.Statement#getContext()
	 */
	@Override
	public Resource getContext() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openrdf.model.Statement#getObject()
	 */
	@Override
	public Value getObject() {
		URI obj = new URIImpl(this.object);
		return obj;
	}

	/*
	 * Returns a URI object for a rdf statement (non-Javadoc)
	 * 
	 * @see org.openrdf.model.Statement#getPredicate()
	 */
	@Override
	public URI getPredicate() {
		URI pre = new URIImpl(this.predicate);
		return pre;
	}

	/*
	 * t (non-Javadoc)
	 * 
	 * @see org.openrdf.model.Statement#getSubject()
	 */
	@Override
	public Resource getSubject() {
		URI sub = new URIImpl(this.subject);
		return sub;
	}

}
