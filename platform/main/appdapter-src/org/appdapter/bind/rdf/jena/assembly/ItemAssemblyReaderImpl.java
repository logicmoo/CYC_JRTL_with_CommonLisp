package org.appdapter.bind.rdf.jena.assembly;

import com.hp.hpl.jena.rdf.model.Resource;
import java.util.Iterator;
import org.appdapter.core.log.Debuggable;
import java.util.Collection;
import java.util.ArrayList;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.assembler.Assembler;
import org.appdapter.core.item.JenaResourceItem;
import java.util.List;
import org.appdapter.core.name.ModelIdent;
import org.appdapter.core.item.Item;
import org.appdapter.core.name.Ident;
import org.appdapter.core.log.BasicDebugger;

public class ItemAssemblyReaderImpl extends BasicDebugger implements ItemAssemblyReader
{
    public Item chooseBestConfigItem(final Ident compID, final Item optionalExplicitItem) {
        Item infoSource = null;
        if (optionalExplicitItem != null) {
            infoSource = optionalExplicitItem;
        }
        else if (compID instanceof Item) {
            infoSource = (Item)compID;
        }
        return infoSource;
    }
    
    @Override
	public Ident getConfigPropertyIdent(final Item infoSource, final Ident compID, final String fieldName_absUri) {
        final Ident infoSourceID = infoSource.getIdent();
        this.logDebug("infoSourceID=" + infoSourceID + ", compID=" + compID);
        ModelIdent someModelIdent = null;
        if (infoSourceID instanceof ModelIdent) {
            someModelIdent = (ModelIdent)infoSourceID;
        }
        else if (compID instanceof ModelIdent) {
            someModelIdent = (ModelIdent)compID;
        }
        Ident propertyIdent = null;
        if (someModelIdent != null) {
            propertyIdent = someModelIdent.getIdentInSameModel(fieldName_absUri);
        }
        else {
            this.logWarning("Cannot find a bootstrap ident to resolve fieldName: " + fieldName_absUri);
        }
        return propertyIdent;
    }
    
    @Override
	public String readConfigValString(final Ident compID, final String fieldName_absUri, final Item optionalItem, final String defaultVal) {
        String resultVal = null;
        final Item infoSource = this.chooseBestConfigItem(compID, optionalItem);
        final Ident propertyIdent = this.getConfigPropertyIdent(infoSource, compID, fieldName_absUri);
        this.logDebug("Resolved fieldName " + fieldName_absUri + " to propertyIdent: " + propertyIdent + ", to be fetched from source " + infoSource);
        if (propertyIdent != null) {
            resultVal = infoSource.getValString(propertyIdent, defaultVal);
        }
        return resultVal;
    }
    
    @Override
	public Long readConfigValLong(final Ident compID, final String fieldName_absUri, final Item optionalItem, final Long defaultVal) {
        Long resultVal = null;
        final Item infoSource = this.chooseBestConfigItem(compID, optionalItem);
        final Ident propertyIdent = this.getConfigPropertyIdent(infoSource, compID, fieldName_absUri);
        this.logDebug("Resolved fieldName " + fieldName_absUri + " to propertyIdent: " + propertyIdent + ", to be fetched from source " + infoSource);
        if (propertyIdent != null) {
            resultVal = infoSource.getValLong(propertyIdent, defaultVal);
        }
        return resultVal;
    }
    
    @Override
	public Double readConfigValDouble(final Ident compID, final String fieldName_absUri, final Item optionalItem, final Double defaultVal) {
        Double resultVal = null;
        final Item infoSource = this.chooseBestConfigItem(compID, optionalItem);
        final Ident propertyIdent = this.getConfigPropertyIdent(infoSource, compID, fieldName_absUri);
        this.logDebug("Resolved fieldName " + fieldName_absUri + " to propertyIdent: " + propertyIdent + ", to be fetched from source " + infoSource);
        if (propertyIdent != null) {
            resultVal = infoSource.getValDouble(propertyIdent, defaultVal);
        }
        return resultVal;
    }
    
    @Override
	public List<Item> readLinkedItemSeq(final Item configItem, final String collectionLinkName_absUri) {
        final Ident linkNameID = this.getConfigPropertyIdent(configItem, configItem.getIdent(), collectionLinkName_absUri);
        final List<Item> linkedItems = (List<Item>)((JenaResourceItem)configItem).getLinkedOrderedList(linkNameID);
        this.logDebug("Got linkedItem collection at [" + collectionLinkName_absUri + "=" + linkNameID + "] = " + linkedItems);
        return linkedItems;
    }
    
    @Override
	public List<Object> findOrMakeLinkedObjects(final Item configItem, final String linkName_absUri, final Assembler asmblr, final Mode mode, final List<Item.SortKey> sortFieldNames) {
        List<Object> resultList = new ArrayList<Object>();
        final Ident linkNameID = this.getConfigPropertyIdent(configItem, configItem.getIdent(), linkName_absUri);
        final List<Item> linkedItems = (List<Item>)configItem.getLinkedItemsSorted(linkNameID, Item.LinkDirection.FORWARD, (List)sortFieldNames);
        resultList = this.resultListFromItems(linkedItems, asmblr, mode);
        return resultList;
    }
    
    @Override
	public List<Object> findOrMakeLinkedObjSeq(final Item configItem, final String collectionLinkName_absUri, final Assembler asmblr, final Mode mode) {
        List<Object> resultList = new ArrayList<Object>();
        final List<Item> linkedItems = this.readLinkedItemSeq(configItem, collectionLinkName_absUri);
        resultList = this.resultListFromItems(linkedItems, asmblr, mode);
        this.logDebug("Opened object collection : " + resultList);
        return resultList;
    }
    
    @Override
	public List<Object> resultListFromItems(final Collection<Item> linkedItems, final Assembler assmblr, final Mode mode) {
        final List<Object> resultList = new ArrayList<Object>();
        for (final Item linkedItem : linkedItems) {
            if (linkedItem instanceof JenaResourceItem) {
                final JenaResourceItem jri = (JenaResourceItem)linkedItem;
                final Resource r = jri.getJenaResource();
                try {
                    final Object assembledObject = assmblr.open(assmblr, r, mode);
                    if (assembledObject != null) {
                        resultList.add(assembledObject);
                    }
                    else {
                        this.logWarning("Got null assembly result for item, ignoring: " + linkedItem);
                    }
                }
                catch (Throwable t) {
                    this.logWarning(Debuggable.toInfoStringArgV(new Object[] { "Error in ", r, t }));
                }
            }
            else {
                this.logWarning("Cannot assemble linked object from non-Jena item: " + linkedItem);
            }
        }
        return resultList;
    }
}

/*

	Total time: 44 ms
	
*/