package org.appdapter.core.name;

import com.hp.hpl.jena.rdf.model.Resource;

public interface ModelIdent extends Ident
{
    Ident getIdentInSameModel(final String p0);
    
    Resource getJenaResource();
}

/*

	Total time: 4 ms
	
*/