package org.appdapter.core.store;

import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.query.QuerySolutionMap;

public interface InitialBinding
{
    QuerySolutionMap getQSMap();
    
    void bindNode(final String p0, final RDFNode p1);
    
    void bindQName(final String p0, final String p1);
    
    void bindURI(final String p0, final String p1);
    
    void bindIdent(final String p0, final Ident p1);
    
    void bindLiteralString(final String p0, final String p1);
}

/*

	Total time: 4 ms
	
*/