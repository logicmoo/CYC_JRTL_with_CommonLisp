package org.appdapter.core.remote.sparql;

import org.appdapter.core.store.StatementSync;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.log.Debuggable;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.sparql.graph.GraphDistinctDataBag;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.graph.Triple;
import org.apache.jena.atlas.data.ThresholdPolicy;
import org.appdapter.core.store.RepoOper;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.core.store.dataset.UserDatasetFactory;
import org.appdapter.core.store.dataset.JenaSDBWrappedDatasetFactory;

public class SparqlDatasetProvider extends JenaSDBWrappedDatasetFactory implements UserDatasetFactory
{
    static SparqlDatasetProvider SINGLETON;
    static long serialNumber;
    
    public static void install() {
        RepoDatasetFactory.DEFAULT = (UserDatasetFactory)SparqlDatasetProvider.SINGLETON;
        RepoDatasetFactory.globalDS = SparqlDatasetProvider.SINGLETON.createRemotePeer();
        RepoDatasetFactory.alwaysShareDataset = true;
        RepoOper.isMergeDefault = false;
        RepoDatasetFactory.registerDatasetFactory("default", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
        RepoOper.registerDatasetFactory("remote", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
        RepoOper.registerDatasetFactory("shared", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
        RepoOper.registerDatasetFactory("unshared", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
        RepoOper.registerDatasetFactory("memory", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
        RepoOper.registerDatasetFactory("private", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
        RepoOper.registerDatasetFactory("sparql", (UserDatasetFactory)SparqlDatasetProvider.SINGLETON);
    }
    
    public static SparqlGraph createGraphMem() {
        final String newName = createNewName();
        return SparqlDatasetGraph.SINGLETON.createGraph("SparqlMemGraph-" + newName);
    }
    
    public static String createNewName() {
        ++SparqlDatasetProvider.serialNumber;
        return "S" + SparqlDatasetProvider.serialNumber;
    }
    
    public Graph createDataBagGraph(final ThresholdPolicy<Triple> thresholdPolicy) {
        return (Graph)new GraphDistinctDataBag((ThresholdPolicy)thresholdPolicy);
    }
    
    public Dataset createRemotePeer() {
        final String newID = createNewName();
        return SparqlDatasetGraph.SINGLETON.createDataset("DatasetRemote-" + newID).toDataset();
    }
    
    public static DatasetGraph asDatasetGraph(final Dataset remoteDataset) {
        Debuggable.notImplemented(new Object[] { "asDatasetGraph", remoteDataset });
        return remoteDataset.asDatasetGraph();
    }
    
    public static Model createDefaultModel() {
        return ModelFactory.createModelForGraph((Graph)createGraphMem());
    }
    
    public Dataset create(final DatasetGraph dsg) {
        Debuggable.notImplemented(new Object[] { "create", this, dsg });
        return DatasetFactory.create(dsg);
    }
    
    public Dataset createMem() {
        final String newID = createNewName();
        return SparqlDatasetGraph.SINGLETON.createDataset("Dataset" + newID).toDataset();
    }
    
    public String getDatasetType() {
        return "sparql";
    }
    
    public Dataset create(final Model model) {
        Debuggable.notImplemented(new Object[] { "create", this, model });
        final Dataset remote = this.createRemotePeer();
        final Model remoteModel = remote.getDefaultModel();
        if (remoteModel != null) {
            StatementSync.syncTwoModels(remoteModel, model);
        }
        else {
            remote.setDefaultModel(model);
        }
        return remote;
    }
    
    public Dataset createDefault() {
        return this.createRemotePeer();
    }
    
    public Dataset create(final Dataset peer) {
        Debuggable.notImplemented(new Object[] { "create", this, peer });
        return peer;
    }
    
    public Model createModelOfType(final String typeOf, final String shareName) throws Throwable {
        Debuggable.notImplemented(new Object[] { "createModelOfType", this, typeOf, shareName });
        return this.createModelOfType(typeOf, null, shareName);
    }
    
    public Dataset createType(final String typeOf, final String shareName) {
        return SparqlDatasetGraph.SINGLETON.getRemoteDataset(shareName);
    }
    
    public Model createModelOfType(final String typeOf, final String modelName, final String shareName) {
        return SparqlDatasetGraph.SINGLETON.createGraph(RepoDatasetFactory.getGlobalName(modelName, shareName)).toModel();
    }
    
    static {
        SparqlDatasetProvider.SINGLETON = new SparqlDatasetProvider();
        SparqlDatasetProvider.serialNumber = 666L;
    }
}

/*

	Total time: 111 ms
	
*/