package eu.larkc.core.query;

import java.util.Collection;

public interface TriplePatternQuery extends Query {

	public void add(TriplePattern theTriplePattern);

	public void remove(TriplePattern theTriplePattern);

	public void clear();

	public boolean isEmpty();

	public Collection<TriplePattern> getTriplePatterns();
}
