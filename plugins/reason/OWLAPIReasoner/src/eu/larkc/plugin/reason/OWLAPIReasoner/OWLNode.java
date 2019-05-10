package eu.larkc.plugin.reason.OWLAPIReasoner;

import org.semanticweb.owl.model.OWLObject;


public interface OWLNode  extends org.w3c.dom.Node {

	public Boolean IsIntersection();
	public Boolean IsComplement();
	public Boolean IsUnion();
	public Boolean IsPrimitiveClass();
	public OWLObject getOWLObject();

	

}
