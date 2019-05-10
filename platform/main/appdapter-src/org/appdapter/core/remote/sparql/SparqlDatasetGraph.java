package org.appdapter.core.remote.sparql;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.query.QuerySolution;
import java.util.List;
import com.hp.hpl.jena.query.ResultSet;
import java.util.Collections;
import com.hp.hpl.jena.util.iterator.SingletonIterator;
import com.hp.hpl.jena.util.iterator.WrappedIterator;
import java.util.ArrayList;
import java.util.Iterator;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.sparql.core.Quad;
import com.hp.hpl.jena.shared.LockMRSW;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import org.appdapter.core.store.dataset.DatasetGraphQuadProc;

public class SparqlDatasetGraph extends DatasetGraphQuadProc implements DatasetGraph
{
    public static SparqlDatasetGraph SINGLETON;
    private String endpointURI;
    private SparqlEndpointClient repository;
    private Lock lock;
    
    public SparqlDatasetGraph(final String endpointURI) {
        this.lock = (Lock)new LockMRSW();
        this.endpointURI = endpointURI;
        this.repository = new SparqlEndpointClient(endpointURI);
    }
    
    private Graph getGraphFor(final Quad q) {
        return this.getGraphFor(q.getGraph());
    }
    
    private Graph getGraphFor(final Node g) {
        return (Graph)((g == Node.ANY) ? new SparqlGraph(this.endpointURI) : new SparqlGraph(this.endpointURI, g.getURI()));
    }
    
    @Override
	public void add(final Quad arg0) {
        this.getGraphFor(arg0).add(new Triple(arg0.getSubject(), arg0.getPredicate(), arg0.getObject()));
    }
    
    @Override
	public boolean contains(final Quad arg0) {
        return this.getGraphFor(arg0).contains(new Triple(arg0.getSubject(), arg0.getPredicate(), arg0.getObject()));
    }
    
    @Override
	public boolean contains(final Node arg0, final Node arg1, final Node arg2, final Node arg3) {
        return this.getGraphFor(arg0).contains(arg1, arg2, arg3);
    }
    
    @Override
	public void delete(final Quad arg0) {
        this.getGraphFor(arg0).delete(new Triple(arg0.getSubject(), arg0.getPredicate(), arg0.getObject()));
    }
    
    @Override
	public void deleteAny(final Node arg0, final Node arg1, final Node arg2, final Node arg3) {
        this.getGraphFor(arg0).delete(new Triple(arg1, arg2, arg3));
    }
    
    @Override
	public Iterator<Quad> find() {
        return this.find(Node.ANY, Node.ANY, Node.ANY, Node.ANY);
    }
    
    @Override
	public Iterator<Quad> find(final Quad arg0) {
        return this.find(arg0.getSubject(), arg0.getPredicate(), arg0.getObject(), arg0.getGraph());
    }
    
    @Override
	public Iterator<Quad> find(final Node graph, final Node subject, final Node predicate, final Node object) {
        if (this.isVar(subject) || this.isVar(predicate) || this.isVar(object) || this.isVar(graph)) {
            final StringBuffer findQuery = new StringBuffer("SELECT * WHERE { \n");
            final String graphURI = this.isVar(graph) ? null : graph.getURI();
            findQuery.append("  GRAPH ");
            if (graphURI != null) {
                findQuery.append("  <" + graphURI + ">");
            }
            else {
                findQuery.append("?g");
            }
            findQuery.append(" { ");
            findQuery.append(SparqlGraph.sparqlNode(subject, "?s")).append(" ").append(SparqlGraph.sparqlNode(predicate, "?p")).append(" ").append(SparqlGraph.sparqlNode(object, "?o"));
            findQuery.append("  } ");
            findQuery.append("\n}");
            final ResultSet rs = this.execSelect(findQuery.toString());
            final List<Quad> quadlist = new ArrayList<Quad>();
            while (rs.hasNext()) {
                final QuerySolution soln = rs.nextSolution();
                final Quad q = new Quad(this.isVar(graph) ? soln.get("?g").asNode() : graph, this.isVar(subject) ? soln.get("?s").asNode() : subject, this.isVar(predicate) ? soln.get("?p").asNode() : predicate, this.isVar(object) ? soln.get("?o").asNode() : object);
                quadlist.add(q);
            }
            return (Iterator<Quad>)WrappedIterator.create((Iterator)quadlist.iterator());
        }
        if (this.contains(subject, predicate, object, graph)) {
            return (Iterator<Quad>)new SingletonIterator((Object)new Triple(subject, predicate, object));
        }
        return (Iterator<Quad>)WrappedIterator.create((Iterator)Collections.EMPTY_LIST.iterator());
    }
    
    @Override
	public Iterator<Quad> findNG(final Node arg0, final Node arg1, final Node arg2, final Node arg3) {
        return this.find(arg0, arg1, arg2, arg3);
    }
    
    @Override
	public Graph getDefaultGraph() {
        return (Graph)new SparqlGraph(this.endpointURI);
    }
    
    @Override
	public Graph getGraph(final Node arg0) {
        return (Graph)new SparqlGraph(this.endpointURI, arg0.getURI());
    }
    
    @Override
	public Lock getLock() {
        return this.lock;
    }
    
    @Override
	public boolean isEmpty() {
        return false;
    }
    
    @Override
	public Iterator<Node> listGraphNodes() {
        final List<Node> graphNodeList = new ArrayList<Node>();
        try {
            final SparqlEndpointClient conn = this.getConnection();
            try {
                final List<Resource> conResult = (List<Resource>)conn.getContextIDs();
                for (final Resource con : conResult) {
                    graphNodeList.add(con.asNode());
                }
            }
            finally {}
        }
        catch (Exception re) {
            throw new RuntimeException(re);
        }
        return graphNodeList.iterator();
    }
    
    private SparqlEndpointClient getConnection() {
        try {
            return this.repository.getConnection();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private boolean isVar(final Node node) {
        return node == null || node.isVariable() || node == Node.ANY;
    }
    
    private ResultSet execSelect(final String queryStr) {
        return this.getConnection().execRemoteSparqlSelect(this.endpointURI, queryStr);
    }
    
    public SparqlGraph createGraph(final String string) {
        throw new AbstractMethodError("createGraph");
    }
    
    public SparqlDatasetGraph createDataset(final String string) {
        throw new AbstractMethodError("createDataset");
    }
    
    public Dataset getRemoteDataset(final String shareName) {
        throw new AbstractMethodError("getRemoteDataset");
    }
    
    public Dataset toDataset() {
        return (Dataset)new SparqlDataset(this);
    }
    
    static {
        SparqlDatasetGraph.SINGLETON = new SparqlDatasetGraph(null);
    }
}

/*

	Total time: 69 ms
	
*/