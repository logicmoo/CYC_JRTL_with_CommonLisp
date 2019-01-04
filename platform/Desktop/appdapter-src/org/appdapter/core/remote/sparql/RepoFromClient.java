package org.appdapter.core.remote.sparql;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.help.repo.RepoClient;
import org.appdapter.core.matdat.OmniLoaderRepo;

public class RepoFromClient extends OmniLoaderRepo
{
    private RepoClient rc;
    private String dirModelName;
    
    public RepoFromClient(final RepoClient rc, final String dirModelName) {
        super((Model)null);
        this.rc = rc;
        this.dirModelName = dirModelName;
    }
    
    public Model getDirectoryModel() {
        return this.getMainQueryDataset().getNamedModel(this.dirModelName);
    }
    
    protected Dataset makeMainQueryDataset() {
        return this.rc.getRepo().getMainQueryDataset();
    }
    
    public Dataset getMainQueryDataset() {
        return this.rc.getRepo().getMainQueryDataset();
    }
}

/*

	Total time: 9 ms
	
*/