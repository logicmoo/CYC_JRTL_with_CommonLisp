package org.appdapter.core.item;

import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import com.hp.hpl.jena.rdf.model.Literal;
import org.appdapter.core.name.Ident;
import org.slf4j.Logger;

public abstract class BaseItem implements Item
{
    static Logger theLogger;
    Item MISSING_ITEM;
    boolean MISSING_ITEM_OK;
    
    public BaseItem() {
        this.MISSING_ITEM = null;
        this.MISSING_ITEM_OK = false;
    }
    
    protected abstract Literal getLiteralVal(final Ident p0, final boolean p1);
    
    protected abstract List<Item> getLinkedItems(final Ident p0, final Item.LinkDirection p1);
    
    public int getLinkedItemCount(final Ident linkName, final Item.LinkDirection linkDir) {
        final Collection<Item> linkedItems = this.getLinkedItems(linkName, linkDir);
        return linkedItems.size();
    }
    
    public Set<Item> getLinkedItemSet(final Ident linkName, final Item.LinkDirection linkDir) {
        final Collection<Item> linkedItems = this.getLinkedItems(linkName, linkDir);
        final Set s = new HashSet(linkedItems);
        return (Set<Item>)s;
    }
    
    public Item getSingleLinkedItem(final Ident linkName, final Item.LinkDirection linkDir) {
        final Collection<Item> linkedItems = this.getLinkedItems(linkName, linkDir);
        final int size = linkedItems.size();
        if (size == 1) {
            final Item[] items = { null };
            linkedItems.toArray(items);
            return items[0];
        }
        final RuntimeException rtException = new RuntimeException("Found " + size + " items instead of expected 1 for property " + ((linkName == null) ? "NULL" : linkName.getAbsUriString()) + " while assembling " + this);
        if (this.MISSING_ITEM_OK) {
            BaseItem.theLogger.error("MISSING_ITEM_OK? " + rtException, (Throwable)rtException);
            return this.MISSING_ITEM;
        }
        throw rtException;
    }
    
    public Item getOptionalSingleLinkedItem(final Ident linkName, final Item.LinkDirection linkDir) {
        final Collection<Item> linkedItems = this.getLinkedItems(linkName, linkDir);
        final int size = linkedItems.size();
        if (size > 0) {
            final Item[] items = { null };
            linkedItems.toArray(items);
            return items[0];
        }
        return null;
    }
    
    public List<Item> getLinkedItemsSorted(final Ident linkName, final Item.LinkDirection linkDir, final List<Item.SortKey> sortFieldNames) {
        if (sortFieldNames != null && sortFieldNames.size() > 0) {
            BaseItem.theLogger.warn("Who actually uses sorting?  These items are not yet really sorted by: {}", (Object)sortFieldNames);
        }
        return this.getLinkedItems(linkName, linkDir);
    }
    
    public Ident getValIdent(final Ident fieldName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getValDatatypeUri(final Ident fieldID) {
        final Literal lit = this.getLiteralVal(fieldID, true);
        return lit.getDatatypeURI();
    }
    
    public Date getValDate(final Ident fieldID, final Date defaultVal) {
        throw new UnsupportedOperationException("Date literals not supported yet.");
    }
    
    public Double getValDouble(final Ident fieldID, final Double defaultVal) {
        final Literal lit = this.getLiteralVal(fieldID, false);
        if (lit != null) {
            return lit.getDouble();
        }
        return defaultVal;
    }
    
    public Long getValLong(final Ident fieldID, final Long defaultVal) {
        final Literal lit = this.getLiteralVal(fieldID, false);
        if (lit != null) {
            return lit.getLong();
        }
        return defaultVal;
    }
    
    public Integer getValInteger(final Ident fieldID, final Integer defaultVal) {
        final Literal lit = this.getLiteralVal(fieldID, false);
        if (lit != null) {
            return lit.getInt();
        }
        return defaultVal;
    }
    
    public String getValString(final Ident fieldID, final String defaultVal) {
        final Literal lit = this.getLiteralVal(fieldID, false);
        if (lit != null) {
            return lit.getString();
        }
        return defaultVal;
    }
    
    public Boolean getValBoolean(final Ident fieldID, final Boolean defaultVal) {
        final Literal lit = this.getLiteralVal(fieldID, false);
        if (lit != null) {
            return lit.getBoolean();
        }
        return defaultVal;
    }
    
    static {
        BaseItem.theLogger = LoggerFactory.getLogger((Class)BaseItem.class);
    }
}

/*

	Total time: 43 ms
	
*/