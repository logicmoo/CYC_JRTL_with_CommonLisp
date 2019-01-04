package org.appdapter.core.store.dataset;

import com.hp.hpl.jena.datatypes.BaseDatatype;
import com.hp.hpl.jena.datatypes.DatatypeFormatException;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.enhanced.BuiltinPersonalities;
import org.appdapter.core.log.Debuggable;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.impl.ModelCom;

public class CheckedModel extends ModelCom implements Model
{
    private final Graph modelGraph;
    private String debuggingName;
    
    public static RDFNode createTypedLiteral(final Model model, String cellString, final RDFDatatype myDatatype) {
        try {
            if (myDatatype == XSDDatatype.XSDstring) {
                return (RDFNode)model.createLiteral(cellString, "");
            }
            if (myDatatype == XSDDatatype.XSDboolean && cellString.equals("TRUE")) {
                Debuggable.oldBug("createTypedLiteral", new Object[] { cellString, myDatatype, "use true", model });
                cellString = "true";
            }
            return (RDFNode)model.createTypedLiteral(cellString, myDatatype);
        }
        catch (Throwable t) {
            Debuggable.oldBug("createTypedLiteral", new Object[] { cellString, myDatatype, t, model });
            return (RDFNode)model.createLiteral(cellString);
        }
    }
    
    public CheckedModel(final CheckedGraph modelGraph) {
        super((Graph)modelGraph, BuiltinPersonalities.model);
        this.modelGraph = this.getGraphNoRemove().modelGraph;
    }
    
    public CheckedModel(final Graph modelGraph, final boolean makeNonAdd, final boolean makeNonDelete, final boolean makeNameSpaceChecked) {
        this(CheckedGraph.ensure(modelGraph, makeNonAdd, makeNonDelete, makeNameSpaceChecked));
    }
    
    public Statement createStatement(final Resource s, final Property p, final RDFNode o) {
        return super.createStatement(s, p, o);
    }
    
    public Literal createTypedLiteral(final Object v, final RDFDatatype dtype) {
        return this.createTypedLiteralObject(v, dtype);
    }
    
    public Literal createTypedLiteralObject(final Object value, final RDFDatatype dtype) {
        final Literal lit = super.createTypedLiteral(value, dtype);
        return this.checkDataType(lit, dtype);
    }
    
    public Literal createTypedLiteral(final String lex, final RDFDatatype dtype) throws DatatypeFormatException {
        Literal lit = null;
        try {
            lit = super.createTypedLiteral(lex, dtype);
        }
        catch (Throwable e) {
            Debuggable.oldBug("createTypedLiteral", new Object[] { lex, dtype, e });
        }
        if (lit == null) {
            try {
                lit = this.createTypedLiteralObject(lex, dtype);
            }
            catch (Throwable e) {
                Debuggable.oldBug("createTypedLiteralObject", new Object[] { lex, dtype, e });
            }
        }
        return this.checkDataType(lit, dtype);
    }
    
    private Literal checkDataType(final Literal lit, final RDFDatatype dtype) {
        if (dtype.getClass() == BaseDatatype.class) {}
        if (!dtype.isValidValue(lit.getValue())) {
            Debuggable.oldBug(lit + " is not a valid " + dtype, new Object[0]);
        }
        else if (dtype.getClass() == BaseDatatype.class) {
            Debuggable.oldBug(lit + " is faked " + dtype, new Object[0]);
        }
        return lit;
    }
    
    public String toString() {
        return "<CheckedModel=" + this.debuggingName + " " + this.getGraph() + " | " + this.reifiedToString() + ">";
    }
    
    private CheckedGraph getGraphNoRemove() {
        return (CheckedGraph)this.getGraph();
    }
    
    public Resource createResource(String uri) {
        uri = RepoDatasetFactory.fixURI(uri);
        final Resource r = super.createResource(uri);
        return r;
    }
    
    public Resource getResource(String uri) {
        uri = RepoDatasetFactory.fixURI(uri);
        final Resource r = super.getResource(uri);
        return r;
    }
    
    public void close() {
        this.modelGraph.close();
    }
    
    public boolean isClosed() {
        return this.modelGraph.isClosed();
    }
    
    public boolean isEmpty() {
        return this.modelGraph.isEmpty();
    }
    
    public long size() {
        return this.modelGraph.size();
    }
    
    public void setName(final String n) {
        this.debuggingName = n;
    }
}

/*

	Total time: 42 ms
	
*/