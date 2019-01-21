package org.appdapter.core.remote.sparql;

import com.hp.hpl.jena.shared.DeleteDeniedException;
import java.util.Iterator;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.graph.GraphEvents;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Graph;

public abstract class JenaWrappedGraph implements Graph
{
    @Override
	public void clear() {
        final ExtendedIterator<Triple> allTriples = this.getMatches(Node.ANY, Node.ANY, Node.ANY);
        for (final Triple t : allTriples.toList()) {
            this.delete(t);
        }
        this.getEventManager().notifyEvent((Graph)this, (Object)GraphEvents.removeAll);
    }
    
    @Override
	public void remove(final Node s, final Node p, final Node o) {
        final ExtendedIterator<Triple> allTriples = this.find(s, p, o);
        for (final Triple t : allTriples.toList()) {
            this.delete(t);
        }
        this.getEventManager().notifyEvent((Graph)this, (Object)GraphEvents.remove(s, p, o));
    }
    
    public ExtendedIterator<Triple> getMatches(final Node s, final Node p, final Node o) {
        return this.find(s, p, o);
    }
    
    @Override
	public abstract void delete(final Triple p0) throws DeleteDeniedException;
    
    @Override
	public abstract ExtendedIterator<Triple> find(final Node p0, final Node p1, final Node p2);
}

/*

	Total time: 10 ms
	
*/