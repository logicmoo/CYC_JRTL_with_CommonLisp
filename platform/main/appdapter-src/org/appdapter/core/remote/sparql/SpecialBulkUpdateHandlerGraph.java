package org.appdapter.core.remote.sparql;

import com.hp.hpl.jena.graph.TransactionHandler;
import com.hp.hpl.jena.graph.GraphStatisticsHandler;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.graph.GraphEventManager;
import com.hp.hpl.jena.graph.Capabilities;
import com.hp.hpl.jena.graph.TripleMatch;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.shared.DeleteDeniedException;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.shared.AddDeniedException;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.BulkUpdateHandler;
import com.hp.hpl.jena.graph.Graph;

public class SpecialBulkUpdateHandlerGraph extends JenaWrappedGraph implements Graph
{
    private Graph g;
    private BulkUpdateHandler b;
    
    public SpecialBulkUpdateHandlerGraph(final Graph g, final BulkUpdateHandler b) {
        this.g = g;
        this.b = b;
    }
    
    @Override
	public void add(final Triple arg0) throws AddDeniedException {
        this.g.add(arg0);
    }
    
    @Override
	public void close() {
        this.g.close();
    }
    
    @Override
	public boolean contains(final Node arg0, final Node arg1, final Node arg2) {
        return this.g.contains(arg0, arg1, arg2);
    }
    
    @Override
	public boolean contains(final Triple arg0) {
        return this.g.contains(arg0);
    }
    
    @Override
	public void delete(final Triple arg0) throws DeleteDeniedException {
        this.g.delete(arg0);
    }
    
    @Override
	public boolean dependsOn(final Graph arg0) {
        return this.g.dependsOn(arg0);
    }
    
    @Override
	public ExtendedIterator<Triple> find(final Node arg0, final Node arg1, final Node arg2) {
        return (ExtendedIterator<Triple>)this.g.find(arg0, arg1, arg2);
    }
    
    @Override
	public ExtendedIterator<Triple> find(final TripleMatch arg0) {
        return (ExtendedIterator<Triple>)this.g.find(arg0);
    }
    
    @Override
	public BulkUpdateHandler getBulkUpdateHandler() {
        return this.b;
    }
    
    @Override
	public Capabilities getCapabilities() {
        return this.g.getCapabilities();
    }
    
    @Override
	public GraphEventManager getEventManager() {
        return this.g.getEventManager();
    }
    
    @Override
	public PrefixMapping getPrefixMapping() {
        return this.g.getPrefixMapping();
    }
    
    @Override
	public GraphStatisticsHandler getStatisticsHandler() {
        return this.g.getStatisticsHandler();
    }
    
    @Override
	public TransactionHandler getTransactionHandler() {
        return this.g.getTransactionHandler();
    }
    
    @Override
	public boolean isClosed() {
        return this.g.isClosed();
    }
    
    @Override
	public boolean isEmpty() {
        return this.g.isEmpty();
    }
    
    @Override
	public boolean isIsomorphicWith(final Graph arg0) {
        return this.g.isIsomorphicWith(arg0);
    }
    
    @Override
	public int size() {
        return this.g.size();
    }
}

/*

	Total time: 19 ms
	
*/