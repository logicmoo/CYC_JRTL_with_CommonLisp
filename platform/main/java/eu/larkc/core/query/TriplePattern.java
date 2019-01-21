package eu.larkc.core.query;

import org.openrdf.model.Resource;
import org.openrdf.model.URI;
import org.openrdf.model.Value;

import java.io.Serializable;

public class TriplePattern implements Serializable {

	private Resource subj;
	private URI pred;
	private Value obj;

	public TriplePattern(Resource subj, URI pred, Value obj) {
		this.subj = subj;
		this.pred = pred;
		this.obj = obj;
	}
	
	public Resource getSubject() {
		return subj;
	}

	public URI getPredicate() {
		return pred;
	}

	public Value getObject() {
		return obj;
	}
	
	@Override
	public String toString() {
		String subjectRepresentation = "*";
		if (subj != null){
			subjectRepresentation = subj.toString();
		}
		
		String predicateRepresentation = "*";
		if (pred != null){
			predicateRepresentation = pred.toString();
		}
		
		String objectRepresentation = "*";
		if (obj != null){
			objectRepresentation = obj.toString();
		}
		
		return String.format("[%s, %s, %s]", subjectRepresentation, predicateRepresentation, objectRepresentation);
	}
}
