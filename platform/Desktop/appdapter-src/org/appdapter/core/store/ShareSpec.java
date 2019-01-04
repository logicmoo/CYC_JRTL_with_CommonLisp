package org.appdapter.core.store;

import org.appdapter.core.name.Ident;
import org.appdapter.core.store.dataset.RemoteDatasetProviderSpec;

public interface ShareSpec
{
    String getGlobalName();
    
    BasicRepoImpl.TaskState getTaskState();
    
    boolean sameOutcome(final ShareSpec p0);
    
    Runnable requiredWork(final Repo.DatasetProvider p0, final ShareSpec p1, final RemoteDatasetProviderSpec p2);
    
    Ident getLocalModelId();
}

/*

	Total time: 6 ms
	
*/