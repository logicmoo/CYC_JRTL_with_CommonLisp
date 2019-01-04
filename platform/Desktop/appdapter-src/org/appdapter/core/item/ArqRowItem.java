package org.appdapter.core.item;

import com.hp.hpl.jena.rdf.model.Resource;
import java.util.ArrayList;
import java.util.List;
import com.hp.hpl.jena.rdf.model.Literal;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.QuerySolutionMap;

public class ArqRowItem extends ResultItem
{
    private int myRowNumber;
    private QuerySolutionMap mySolutionCopy;
    
    public ArqRowItem(final int rowNumber, final QuerySolution soln) {
        this.myRowNumber = rowNumber;
        (this.mySolutionCopy = new QuerySolutionMap()).addAll(soln);
    }
    
    protected Literal getLiteralVal(final Ident fieldID, final boolean throwOnFailure) {
        final String varName = fieldID.getLocalName();
        final Literal lit = this.mySolutionCopy.getLiteral(varName);
        if (lit != null) {
            return lit;
        }
        throw new RuntimeException("Cannot locate literal value for varName: " + varName + " extracted from fieldID: " + fieldID);
    }
    
    protected List<Item> getLinkedItems(final Ident linkName, final Item.LinkDirection linkDir) {
        if (linkDir != Item.LinkDirection.FORWARD) {
            throw new UnsupportedOperationException("Only FORWARD link direction is supported for ArqRowItem");
        }
        final List<Item> result = new ArrayList<Item>();
        final String varName = linkName.getLocalName();
        final Resource r1 = this.mySolutionCopy.getResource(varName);
        if (r1 != null) {
            final Item resultItem = (Item)new JenaResourceItem(r1);
            result.add(resultItem);
        }
        return result;
    }
    
    public Ident getIdent() {
        throw new UnsupportedOperationException("ArqRowItem doesn't have an ident yet");
    }
    
    public List<Item> getLinkedOrderedList(final Ident listLinkName) {
        throw new UnsupportedOperationException("ArqRowItem doesn't know how to access RDF-Lists, yet.");
    }
}

/*

	Total time: 29 ms
	
*/