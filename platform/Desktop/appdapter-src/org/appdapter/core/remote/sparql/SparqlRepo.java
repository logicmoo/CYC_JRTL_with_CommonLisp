package org.appdapter.core.remote.sparql;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.matdat.OmniLoaderRepo;

public class SparqlRepo extends OmniLoaderRepo
{
    private String endpointURI;
    private String dirModelName;
    
    public SparqlRepo(final String endpointURI, final String dirModelName) {
        super((Model)null);
        this.endpointURI = endpointURI;
        this.dirModelName = dirModelName;
    }
    
    @Override
	public Model getDirectoryModel() {
        return this.getMainQueryDataset().getNamedModel(this.dirModelName);
    }
    
    @Override
	protected Dataset makeMainQueryDataset() {
        return (Dataset)new SparqlDataset(new SparqlDatasetGraph(this.endpointURI));
    }
}

/*

	Total time: 7 ms
	
*/