package org.appdapter.core.remote.sparql;

import java.util.ArrayList;
import java.util.Iterator;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.sparql.core.DatasetImpl;

public class SparqlDataset extends DatasetImpl
{
    private SparqlDatasetGraph g;
    
    public SparqlDataset(final SparqlDatasetGraph g) {
        super((DatasetGraph)g);
        this.g = g;
    }
    
    public DatasetGraph asDatasetGraph() {
        return (DatasetGraph)this.g;
    }
    
    public void close() {
        this.g.close();
    }
    
    public boolean containsNamedModel(final String arg0) {
        return this.g.containsGraph(Node.createURI(arg0));
    }
    
    public Model getDefaultModel() {
        return ModelFactory.createModelForGraph(this.g.getDefaultGraph());
    }
    
    public Lock getLock() {
        return this.g.getLock();
    }
    
    public Model getNamedModel(final String arg0) {
        return ModelFactory.createModelForGraph(this.g.getGraph(Node.createURI(arg0)));
    }
    
    public Iterator<String> listNames() {
        final ArrayList<String> nameList = new ArrayList<String>();
        final Iterator<Node> nodeIt = (Iterator<Node>)this.g.listGraphNodes();
        while (nodeIt.hasNext()) {
            final Node n = nodeIt.next();
            nameList.add(n.getURI());
        }
        return nameList.iterator();
    }
}

/*

	Total time: 12 ms
	
*/