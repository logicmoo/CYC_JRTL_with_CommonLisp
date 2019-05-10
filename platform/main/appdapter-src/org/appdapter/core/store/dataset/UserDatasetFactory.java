package org.appdapter.core.store.dataset;

import com.hp.hpl.jena.util.FileManager;
import java.util.List;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.Dataset;

public interface UserDatasetFactory
{
    Dataset createMem();
    
    Dataset createRemotePeer();
    
    Dataset createMemFixed();
    
    Dataset create(final Model p0);
    
    Dataset create(final Dataset p0);
    
    Dataset create(final DatasetGraph p0);
    
    Dataset create(final List<String> p0);
    
    Dataset create(final String p0);
    
    Dataset create(final List<String> p0, final FileManager p1);
    
    Dataset createDefault();
    
    boolean canCreateType(final String p0, final String p1);
    
    Dataset createType(final String p0, final String p1);
    
    boolean canCreateModelOfType(final String p0, final String p1);
    
    Model createModelOfType(final String p0, final String p1) throws Throwable;
    
    Model createModelOfType(final String p0, final String p1, final String p2);
    
    String getDatasetType();
}

/*

	Total time: 6 ms
	
*/