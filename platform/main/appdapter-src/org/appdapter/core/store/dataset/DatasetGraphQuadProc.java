package org.appdapter.core.store.dataset;

import java.util.Iterator;
import com.hp.hpl.jena.sparql.core.Quad;
import com.hp.hpl.jena.graph.GraphUtil;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.sparql.core.DatasetGraphQuad;

public abstract class DatasetGraphQuadProc extends DatasetGraphQuad implements DatasetGraph
{
    @Override
	public void addGraph(final Node graphName, final Graph graph) {
        final Graph g = this.getGraph(graphName);
        GraphUtil.addInto(g, graph);
    }
    
    @Override
	public void removeGraph(final Node graphName) {
        this.deleteAny(graphName, Node.ANY, Node.ANY, Node.ANY);
    }
    
    @Override
	public void setDefaultGraph(final Graph g) {
        throw new UnsupportedOperationException("DatasetGraph.setDefaultGraph");
    }
    
    @Override
	public void add(final Quad quad) {
        throw new UnsupportedOperationException("DatasetGraph.add(Quad)");
    }
    
    @Override
	public void delete(final Quad quad) {
        throw new UnsupportedOperationException("DatasetGraph.delete(Quad)");
    }
    
    @Override
	public Iterator<Quad> find(final Node g, final Node s, final Node p, final Node o) {
        throw new UnsupportedOperationException("DatasetGraph...");
    }
    
    @Override
	public Iterator<Quad> findNG(final Node g, final Node s, final Node p, final Node o) {
        return this.find(g, s, p, o);
    }
}

/*

	Total time: 10 ms
	
*/