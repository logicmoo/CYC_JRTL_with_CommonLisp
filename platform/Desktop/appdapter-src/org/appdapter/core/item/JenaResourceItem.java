package org.appdapter.core.item;

import com.hp.hpl.jena.rdf.model.RDFList;
import java.util.Iterator;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.NodeIterator;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.ArrayList;
import java.util.HashMap;
import com.hp.hpl.jena.rdf.model.RDFNode;
import java.util.List;
import com.hp.hpl.jena.rdf.model.Property;
import java.util.Map;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.rdf.model.Resource;
import org.appdapter.core.name.ModelIdent;

public class JenaResourceItem extends BaseItem implements ModelIdent
{
    Resource myResource;
    
    public JenaResourceItem(final Resource r) {
        if (r == null) {
            throw new RuntimeException("Cannot create JenaResourceItem with null resource.");
        }
        this.myResource = r;
    }
    
    public boolean equals(final Object o) {
        if (o != null && o instanceof Ident) {
            final String absUri = this.getAbsUriString();
            if (absUri != null) {
                final String otherAbsUri = ((Ident)o).getAbsUriString();
                return this.getAbsUriString().equals(otherAbsUri);
            }
            if (o instanceof JenaResourceItem) {
                this.myResource.equals((Object)((JenaResourceItem)o).myResource);
            }
        }
        return false;
    }
    
    public int hashCode() {
        final String uriString = this.getAbsUriString();
        if (uriString != null) {
            return this.getAbsUriString().hashCode();
        }
        return this.myResource.hashCode();
    }
    
    public Ident getIdent() {
        return (Ident)this;
    }
    
    public final String toString() {
        return "JenaResourceItem[res=" + this.myResource.toString() + "]";
    }
    
    public Ident getIdentInSameModel(final String absURI) {
        final Resource res = this.myResource.getModel().createResource(absURI);
        return (Ident)new JenaResourceItem(res);
    }
    
    public String getAbsUriString() {
        return this.myResource.getURI();
    }
    
    public String getLocalName() {
        return this.myResource.getLocalName();
    }
    
    public Map<Property, List<RDFNode>> getPropertyMap() {
        final Model model = this.getModel();
        final Map<Property, List<RDFNode>> properties = new HashMap<Property, List<RDFNode>>();
        final StmtIterator iter = model.listStatements();
        while (iter.hasNext()) {
            final Statement stmt = iter.nextStatement();
            final Resource subject = stmt.getSubject();
            if (subject.equals((Object)this.myResource)) {
                final Property predicate = stmt.getPredicate();
                List<RDFNode> results = properties.get(predicate);
                if (results == null) {
                    results = new ArrayList<RDFNode>();
                    properties.put(predicate, results);
                }
                final RDFNode object = stmt.getObject();
                results.add(object);
            }
        }
        return properties;
    }
    
    protected List<RDFNode> getPropertyValues(final Ident fieldID, final Item.LinkDirection linkDir) {
        final List<RDFNode> results = new ArrayList<RDFNode>();
        final Model model = this.getModel();
        Resource fieldPropertyRes = null;
        if (fieldID instanceof JenaResourceItem) {
            fieldPropertyRes = ((JenaResourceItem)fieldID).myResource;
        }
        else {
            final String fieldPropURI = fieldID.getAbsUriString();
            if (fieldPropURI != null) {
                fieldPropertyRes = model.createResource(fieldPropURI);
            }
        }
        if (fieldPropertyRes != null) {
            final Property fieldProperty = (Property)fieldPropertyRes.as((Class)Property.class);
            if (linkDir == Item.LinkDirection.FORWARD) {
                final NodeIterator nodeIt = model.listObjectsOfProperty(this.myResource, fieldProperty);
                while (nodeIt.hasNext()) {
                    results.add(nodeIt.nextNode());
                }
            }
            else if (linkDir == Item.LinkDirection.REVERSE) {
                final ResIterator resIt = model.listResourcesWithProperty(fieldProperty, (RDFNode)this.myResource);
                while (resIt.hasNext()) {
                    results.add((RDFNode)resIt.nextResource());
                }
            }
        }
        return results;
    }
    
    public Model getModel() {
        return this.getJenaResource().getModel();
    }
    
    protected RDFNode getSinglePropertyVal(final Ident fieldID, final boolean throwOnFailure) {
        final List<RDFNode> nodes = this.getPropertyValues(fieldID, Item.LinkDirection.FORWARD);
        final int nodeListSize = nodes.size();
        if (nodeListSize == 1) {
            return nodes.get(0);
        }
        if (throwOnFailure) {
            throw new RuntimeException("Got " + nodeListSize + " nodes instead of expected 1 for " + fieldID);
        }
        return null;
    }
    
    protected Literal getLiteralVal(final Ident fieldID, final boolean throwOnFailure) {
        Literal resultLit = null;
        final RDFNode resultNode = this.getSinglePropertyVal(fieldID, throwOnFailure);
        if (resultNode != null) {
            resultLit = resultNode.asLiteral();
        }
        return resultLit;
    }
    
    protected List<Item> getLinkedItems(final Ident linkName, final Item.LinkDirection linkDir) {
        final List<RDFNode> linkedNodes = this.getPropertyValues(linkName, linkDir);
        final List<Item> results = new ArrayList<Item>();
        for (final RDFNode rn : linkedNodes) {
            final Resource res = rn.asResource();
            final JenaResourceItem jri = new JenaResourceItem(res);
            results.add((Item)jri);
        }
        return results;
    }
    
    public List<Item> getLinkedOrderedList(final Ident linkName) {
        final List<Item> results = new ArrayList<Item>();
        final RDFNode resultNode = this.getSinglePropertyVal(linkName, false);
        if (resultNode != null) {
            final RDFList rdfList = (RDFList)resultNode.as((Class)RDFList.class);
            if (rdfList != null) {
                final List<RDFNode> javaNodeList = (List<RDFNode>)rdfList.asJavaList();
                for (final RDFNode elementNode : javaNodeList) {
                    final Resource res = elementNode.asResource();
                    final JenaResourceItem jri = new JenaResourceItem(res);
                    results.add((Item)jri);
                }
            }
        }
        return results;
    }
    
    public Resource getJenaResource() {
        return this.myResource;
    }
}

/*

	Total time: 52 ms
	
*/