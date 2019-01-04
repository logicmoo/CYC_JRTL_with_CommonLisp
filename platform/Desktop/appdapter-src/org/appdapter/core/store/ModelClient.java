package org.appdapter.core.store;

import org.appdapter.core.item.Item;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.rdf.model.Resource;

public interface ModelClient
{
    Resource makeResourceForURI(final String p0);
    
    Resource makeResourceForQName(final String p0);
    
    Resource makeResourceForIdent(final Ident p0);
    
    Literal makeTypedLiteral(final String p0, final RDFDatatype p1);
    
    Literal makeStringLiteral(final String p0);
    
    Ident makeIdentForQName(final String p0);
    
    Item makeItemForQName(final String p0);
    
    Ident makeIdentForURI(final String p0);
    
    Item makeItemForIdent(final Ident p0);
}

/*

	Total time: 5 ms
	
*/