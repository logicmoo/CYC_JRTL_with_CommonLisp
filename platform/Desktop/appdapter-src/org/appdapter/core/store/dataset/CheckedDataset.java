package org.appdapter.core.store.dataset;

import java.util.ArrayList;
import java.util.Iterator;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.graph.compose.MultiUnion;
import org.appdapter.core.store.RepoOper;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.sparql.core.DatasetGraphFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.sparql.core.DatasetImpl;

public class CheckedDataset extends DatasetImpl implements Dataset
{
    boolean realPassedInModels;
    
    @Override
	protected Model graph2model(final Graph graph) {
        return super.graph2model(graph);
    }
    
    public CheckedDataset() {
        this(DatasetGraphFactory.createMemFixed());
    }
    
    @Override
	public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }
    
    public CheckedDataset(final DatasetGraph g) {
        super(g);
        this.realPassedInModels = true;
        this.dsg = g;
    }
    
    public CheckedDataset(final Dataset g) {
        super(g);
        this.realPassedInModels = true;
        this.dsg = g.asDatasetGraph();
    }
    
    @Override
	public DatasetGraph asDatasetGraph() {
        if (this.dsg == null) {
            return super.asDatasetGraph();
        }
        return this.dsg;
    }
    
    @Override
	public void close() {
        this.asDatasetGraph().close();
    }
    
    @Override
	public boolean containsNamedModel(final String n) {
        final Node gn = RepoDatasetFactory.correctModelName(n);
        final DatasetGraph g = this.asDatasetGraph();
        final boolean contained = g.containsGraph(gn);
        return contained;
    }
    
    @Override
	public void addNamedModel(final String n, final Model m) {
        final Node gn = RepoDatasetFactory.correctModelName(n);
        this.offerName(m, n);
        Model innerModel = null;
        final boolean cm = this.containsNamedModel(n);
        if (!cm) {
            if (this.realPassedInModels) {
                super.addNamedModel(n, m);
                return;
            }
            innerModel = RepoDatasetFactory.createDefaultModel();
        }
        else {
            innerModel = this.getNamedModel(n);
            if (innerModel == m) {
                return;
            }
        }
        final Graph mg = m.getGraph();
        innerModel.add(m);
        innerModel.withDefaultMappings((PrefixMapping)m);
        RepoDatasetFactory.invalidateModel(m);
        final DatasetGraph g = this.asDatasetGraph();
        g.addGraph(gn, innerModel.getGraph());
    }
    
    private void offerName(final Model m, final String n) {
        if (m instanceof CheckedModel) {
            ((CheckedModel)m).setName(n);
        }
    }
    
    @Override
	public Model getNamedModel(final String n) {
        if (n == null) {
            return super.getNamedModel(n);
        }
        if (n.equals("#all")) {
            return this.modelFor(new MultiUnion(RepoOper.getAllGraphs((Dataset)this, new Model[0])));
        }
        final Node gn = RepoDatasetFactory.correctModelName(n);
        final DatasetGraph g = this.asDatasetGraph();
        final Graph graph = g.getGraph(gn);
        if (graph == null) {
            return null;
        }
        final Model m = RepoDatasetFactory.createModelForGraph(graph);
        this.offerName(m, n);
        return m;
    }
    
    private Model modelFor(final MultiUnion graph) {
        return RepoDatasetFactory.createModelForGraph((Graph)graph);
    }
    
    @Override
	public void removeNamedModel(final String n) {
        final Node gn = RepoDatasetFactory.correctModelName(n);
        RepoDatasetFactory.untested(new Object[] { "remove named model + n" });
        final DatasetGraph g = this.asDatasetGraph();
        g.removeGraph(gn);
    }
    
    @Override
	public void replaceNamedModel(final String n, final Model m) {
        final Node gn = RepoDatasetFactory.correctModelName(n);
        Model innerModel = null;
        this.offerName(m, n);
        final boolean cm = this.containsNamedModel(n);
        if (!cm) {
            if (this.realPassedInModels) {
                super.replaceNamedModel(n, m);
                return;
            }
            innerModel = RepoDatasetFactory.createDefaultModel();
        }
        else {
            innerModel = this.getNamedModel(n);
            if (innerModel == m) {
                return;
            }
        }
        if (this.realPassedInModels) {
            super.replaceNamedModel(n, m);
            return;
        }
        RepoDatasetFactory.untested(new Object[] { "replaceNamedModel" });
        this.removeNamedModel(n);
        this.addNamedModel(n, m);
    }
    
    @Override
	public Model getDefaultModel() {
        final DatasetGraph g = this.asDatasetGraph();
        final Model m = RepoDatasetFactory.createModelForGraph(g.getDefaultGraph());
        this.setDefaultModel(m);
        return m;
    }
    
    @Override
	public Lock getLock() {
        final DatasetGraph g = this.asDatasetGraph();
        return g.getLock();
    }
    
    @Override
	public Iterator<String> listNames() {
        final ArrayList<String> nameList = new ArrayList<String>();
        final DatasetGraph g = this.asDatasetGraph();
        final Iterator<Node> nodeIt = (Iterator<Node>)g.listGraphNodes();
        while (nodeIt.hasNext()) {
            final Node n = nodeIt.next();
            nameList.add(n.getURI());
        }
        return nameList.iterator();
    }
}

/*

	Total time: 54 ms
	
*/