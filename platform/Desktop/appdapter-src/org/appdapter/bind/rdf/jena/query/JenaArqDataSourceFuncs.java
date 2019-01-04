package org.appdapter.bind.rdf.jena.query;

import org.appdapter.core.store.dataset.RepoDatasetFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.DatasetFactory;
import org.appdapter.bind.rdf.jena.model.JenaModelUtils;
import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.log.BasicDebugger;

public class JenaArqDataSourceFuncs
{
    public static BasicDebugger theDbg;
    
    public static Dataset makeIndependentDataSourceFromDataset(final Dataset dset) {
        Model newDefaultModel = null;
        final Model oldDefaultModel = dset.getDefaultModel();
        if (oldDefaultModel != null) {
            newDefaultModel = JenaModelUtils.makeNaiveCopy(oldDefaultModel);
        }
        final Dataset copy = DatasetFactory.make(dset, newDefaultModel);
        return copy;
    }
    
    public static void ensureDefaultModelNotNull(final Dataset ds) {
        if (ds.getDefaultModel() == null) {
            final Model emptyModel = RepoDatasetFactory.createDefaultModel();
            ds.setDefaultModel(emptyModel);
        }
    }
    
    public static void mergeModelIntoDataSource(final Dataset ds, final String nameURI, final Model m) {
        JenaArqDataSourceFuncs.theDbg.logDebug("Merging in model with name " + nameURI);
        Model previousModel = null;
        if (nameURI != null) {
            if (ds.containsNamedModel(nameURI)) {
                previousModel = ds.getNamedModel(nameURI);
            }
        }
        else {
            previousModel = ds.getDefaultModel();
        }
        Model augmentedModel = null;
        if (previousModel != null) {
            augmentedModel = previousModel;
            previousModel.add(m);
        }
        else {
            augmentedModel = m;
        }
        if (nameURI != null) {
            ds.replaceNamedModel(nameURI, augmentedModel);
        }
        else {
            ds.setDefaultModel(augmentedModel);
        }
    }
    
    static {
        JenaArqDataSourceFuncs.theDbg = new BasicDebugger();
    }
}

/*

	Total time: 11 ms
	
*/