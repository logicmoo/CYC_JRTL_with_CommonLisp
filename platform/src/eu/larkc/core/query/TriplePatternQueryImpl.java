package eu.larkc.core.query;

import java.util.ArrayList;
import java.util.Collection;

public class TriplePatternQueryImpl implements TriplePatternQuery {

	private Collection <TriplePattern> patterns = new ArrayList <TriplePattern> ();
	private static final long serialVersionUID = 1L;

	public TriplePatternQueryImpl() {
	}

	public TriplePatternQueryImpl(Collection <TriplePattern> thePatterns) {
		this.patterns.addAll(thePatterns);
	}
	
	public void add(TriplePattern theTriplePattern){
		this.patterns.add(theTriplePattern);
	}
	
	public void remove(TriplePattern theTriplePattern){
		this.patterns.remove(theTriplePattern);
	}
	
	public void clear(){
		this.patterns.clear();
	}
	
	public boolean isEmpty(){
		return this.patterns.isEmpty();
	}
	
	public Collection<TriplePattern> getTriplePatterns() {
		return patterns;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (TriplePattern tp : patterns){
			sb.append(tp.toString() + "\n");
		}
		sb.append("]\n");
		return sb.toString();
	}
}
