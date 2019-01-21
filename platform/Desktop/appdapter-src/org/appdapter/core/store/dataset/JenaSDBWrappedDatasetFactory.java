package org.appdapter.core.store.dataset;

import com.hp.hpl.jena.sdb.Store;
import com.hp.hpl.jena.sdb.SDBFactory;
import com.hp.hpl.jena.sparql.core.DatasetImpl;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import org.appdapter.core.store.StatementSync;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;

public class JenaSDBWrappedDatasetFactory extends AbstractDatasetFactory implements UserDatasetFactory
{
    @Override
	public Dataset create(final Model model) {
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
    
    @Override
	public Dataset create(final DatasetGraph dataset) {
        return DatasetImpl.wrap(dataset);
    }
    
    @Override
	public String getDatasetType() {
        return "instance";
    }
    
    @Override
	public Dataset createDefault() {
        return this.createRemotePeer();
    }
    
    @Override
	public Dataset create(final Dataset peer) {
        final Dataset remote = this.createRemotePeer();
        RepoDatasetFactory.addDatasetSync(peer, remote);
        return peer;
    }
    
    @Override
	public Dataset createType(final String typeOf, final String sharedNameIgnoredPresently) {
        return this.createDefault();
    }
    
    @Override
	public Dataset createRemotePeer() {
        final Store store = SDBFactory.connectStore(RepoDatasetFactory.STORE_CONFIG_PATH);
        final Dataset ds = SDBFactory.connectDataset(store);
        return ds;
    }
    
    @Override
	public Model createModelOfType(final String typeOf, final String sharedNameIgnoredPresently) throws Throwable {
        return this.createModelOfType(typeOf, null, sharedNameIgnoredPresently);
    }
    
    @Override
	public Model createModelOfType(final String typeOf, final String modelName, final String shareName) {
        final Store store = SDBFactory.connectStore(RepoDatasetFactory.STORE_CONFIG_PATH);
        return SDBFactory.connectNamedModel(store, RepoDatasetFactory.getGlobalName(modelName, shareName));
    }
}

/*

	Total time: 12 ms
	
*/