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
    public String getDatasetType() {
        return "memory";
    }
    
    public Dataset createDefault() {
        return this.createMemFixed();
    }
    
    public Dataset createMem() {
        return this.create(DatasetGraphFactory.createMem());
    }
    
    public Dataset createMemFixed() {
        return this.create(DatasetGraphFactory.createMemFixed());
    }
    
    public Dataset createMemFixedDS() {
        return this.create(DatasetFactory.createMemFixed());
    }
    
    public Dataset create(final Model model) {
        return (Dataset)new DatasetImpl(model);
    }
    
    public Dataset create(final Dataset dataset) {
        if (RepoDatasetFactory.datasetNoDeleteModels) {
            return (Dataset)new CheckedDataset(dataset);
        }
        return (Dataset)new DatasetImpl(dataset);
    }
    
    public Dataset create(final DatasetGraph dataset) {
        if (RepoDatasetFactory.datasetNoDeleteModels) {
            return (Dataset)new CheckedDataset(dataset);
        }
        return DatasetImpl.wrap(dataset);
    }
    
    public Dataset createRemotePeer() {
        final Store store = SDBFactory.connectStore(RepoDatasetFactory.STORE_CONFIG_PATH);
        final Dataset ds = SDBFactory.connectDataset(store);
        return ds;
    }
    
    public Dataset createType(final String typeOf, final String sharedNameIgnoredPresently) {
        return this.createDefault();
    }
    
    public Model createModelOfType(final String typeOf, final String sharedNameIgnoredPresently) throws Throwable {
        return this.createModelOfType(typeOf, null, sharedNameIgnoredPresently);
    }
    
    public Model createModelOfType(final String typeOf, final String modelName, final String shareName) {
        return RepoDatasetFactory.createDefaultModel();
    }
}

/*

	Total time: 14 ms
	
*/