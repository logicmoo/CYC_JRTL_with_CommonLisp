package org.appdapter.bind.rdf.jena.assembly;

import java.util.Collection;
import org.appdapter.core.name.Ident;
import java.util.List;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.assembler.Assembler;
import org.appdapter.core.item.Item;

public interface ItemAssemblyReader
{
    List<Object> findOrMakeLinkedObjSeq(final Item p0, final String p1, final Assembler p2, final Mode p3);
    
    List<Object> findOrMakeLinkedObjects(final Item p0, final String p1, final Assembler p2, final Mode p3, final List<Item.SortKey> p4);
    
    Ident getConfigPropertyIdent(final Item p0, final Ident p1, final String p2);
    
    Double readConfigValDouble(final Ident p0, final String p1, final Item p2, final Double p3);
    
    Long readConfigValLong(final Ident p0, final String p1, final Item p2, final Long p3);
    
    String readConfigValString(final Ident p0, final String p1, final Item p2, final String p3);
    
    List<Item> readLinkedItemSeq(final Item p0, final String p1);
    
    List<Object> resultListFromItems(final Collection<Item> p0, final Assembler p1, final Mode p2);
}

/*

	Total time: 6 ms
	
*/