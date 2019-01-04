package org.appdapter.core.store.dataset;

import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.Repo;

public interface RemoteDatasetProvider extends RemoteDatasetProviderSpec, Repo.DatasetProvider
{
    Dataset getRemoteDataset(final String p0);
    
    RemoteDatasetProviderSpec getSpec();
}

/*

	Total time: 5 ms
	
*/