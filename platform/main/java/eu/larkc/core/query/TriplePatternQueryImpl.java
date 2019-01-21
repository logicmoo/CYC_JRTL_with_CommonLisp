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
	
	@Override
	public void add(TriplePattern theTriplePattern){
		this.patterns.add(theTriplePattern);
	}
	
	@Override
	public void remove(TriplePattern theTriplePattern){
		this.patterns.remove(theTriplePattern);
	}
	
	@Override
	public void clear(){
		this.patterns.clear();
	}
	
	@Override
	public boolean isEmpty(){
		return this.patterns.isEmpty();
	}
	
	@Override
	public Collection<TriplePattern> getTriplePatterns() {
		return patterns;
	}
	
	@Override
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
