package org.appdapter.core.store.dataset;

import com.hp.hpl.jena.sdb.Store;
import com.hp.hpl.jena.sdb.SDBFactory;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.sparql.core.DatasetImpl;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.sparql.core.DatasetGraphFactory;
import com.hp.hpl.jena.query.Dataset;

public class JenaDatasetFactory extends AbstractDatasetFactory implements UserDatasetFactory
{
    @Override
	public String getDatasetType() {
        return "memory";
    }
    
    @Override
	public Dataset createDefault() {
        return this.createMemFixed();
    }
    
    @Override
	public Dataset createMem() {
        return this.create(DatasetGraphFactory.createMem());
    }
    
    @Override
	public Dataset createMemFixed() {
        return this.create(DatasetGraphFactory.createMemFixed());
    }
    
    public Dataset createMemFixedDS() {
        return this.create(DatasetFactory.createMemFixed());
    }
    
    @Override
	public Dataset create(final Model model) {
        return (Dataset)new DatasetImpl(model);
    }
    
    @Override
	public Dataset create(final Dataset dataset) {
        if (RepoDatasetFactory.datasetNoDeleteModels) {
            return (Dataset)new CheckedDataset(dataset);
        }
        return (Dataset)new DatasetImpl(dataset);
    }
    
    @Override
	public Dataset create(final DatasetGraph dataset) {
        if (RepoDatasetFactory.datasetNoDeleteModels) {
            return (Dataset)new CheckedDataset(dataset);
        }
        return DatasetImpl.wrap(dataset);
    }
    
    @Override
	public Dataset createRemotePeer() {
        final Store store = SDBFactory.connectStore(RepoDatasetFactory.STORE_CONFIG_PATH);
        final Dataset ds = SDBFactory.connectDataset(store);
        return ds;
    }
    
    @Override
	public Dataset createType(final String typeOf, final String sharedNameIgnoredPresently) {
        return this.createDefault();
    }
    
    @Override
	public Model createModelOfType(final String typeOf, final String sharedNameIgnoredPresently) throws Throwable {
        return this.createModelOfType(typeOf, null, sharedNameIgnoredPresently);
    }
    
    @Override
	public Model createModelOfType(final String typeOf, final String modelName, final String shareName) {
        return RepoDatasetFactory.createDefaultModel();
    }
}

/*

	Total time: 14 ms
	
*/