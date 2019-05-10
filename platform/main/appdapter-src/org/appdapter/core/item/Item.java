package org.appdapter.core.item;

import java.util.List;
import java.util.Set;
import java.util.Date;
import org.appdapter.core.name.Ident;

public interface Item
{
    Ident getIdent();
    
    String getValString(final Ident p0, final String p1);
    
    Long getValLong(final Ident p0, final Long p1);
    
    Integer getValInteger(final Ident p0, final Integer p1);
    
    Double getValDouble(final Ident p0, final Double p1);
    
    Date getValDate(final Ident p0, final Date p1);
    
    Boolean getValBoolean(final Ident p0, final Boolean p1);
    
    Set<Item> getLinkedItemSet(final Ident p0, final LinkDirection p1);
    
    int getLinkedItemCount(final Ident p0, final LinkDirection p1);
    
    Item getSingleLinkedItem(final Ident p0, final LinkDirection p1);
    
    Item getOptionalSingleLinkedItem(final Ident p0, final LinkDirection p1);
    
    List<Item> getLinkedItemsSorted(final Ident p0, final LinkDirection p1, final List<SortKey> p2);
    
    List<Item> getLinkedOrderedList(final Ident p0);
    
    public enum LinkDirection
    {
        FORWARD, 
        REVERSE;
    }
    
    public static class SortKey
    {
        public Ident mySortFieldIdent;
        
        public enum Direction
        {
            ASCENDING, 
            DESCENDING;
        }
    }
}

/*

	Total time: 23 ms
	
*/