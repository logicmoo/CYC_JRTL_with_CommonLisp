package org.opencyc.cycobject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.opencyc.api.CycObjectFactory;
import java.util.ListIterator;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import java.util.List;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import org.opencyc.api.CycAccess;
import java.io.Serializable;

public class CycNart extends CycFort implements CycNonAtomicTerm, Serializable
{
    static final long serialVersionUID = -1344072553770319121L;
    public static final String natXMLtag = "nat";
    public static final String functorXMLtag = "functor";
    public static final String argXMLtag = "arg";
    public static int indentLength;
    private CycNaut formula;
    
    public CycNart() {
    }
    
    public CycNart(final CycNaut formula) {
        this.formula = formula;
    }
    
    public CycNart(final CycFort functor, final Object... arguments) {
        this.formula = new CycNaut((CycDenotationalTerm)functor, arguments);
    }
    
    public CycNart(final CycList cycList) {
        if (cycList.size() == 0) {
            throw new RuntimeException("Cannot make a CycNart from an empty CycList");
        }
        if (!(cycList.first() instanceof CycFort)) {
            throw new RuntimeException("CycNart functor must be a CycFort " + cycList.cyclify());
        }
        this.formula = new CycNaut((Iterable)cycList);
    }
    
    public CycNart ensureReified() throws UnknownHostException, IOException {
        return this.ensureReified(CycAccess.getCurrent());
    }
    
    public CycNart ensureReified(final CycAccess access) throws UnknownHostException, IOException {
        Object result;
        try {
            final String command = "(canonicalize-term-assert " + this.stringApiValue() + ")";
            result = access.converseObject((Object)command);
        }
        catch (Exception e) {
            throw new CycApiException("Exception while ensuring that " + this + " is a NART.", (Throwable)e);
        }
        if (!(result instanceof CycNart)) {
            throw new CycApiException("Unable to convert " + this + " into a Cyc NART.");
        }
        return this;
    }
    
    public static CycNart makeInvalidNart() {
        final CycNart cycNart = new CycNart();
        cycNart.isInvalid = true;
        return cycNart;
    }
    
    public static CycNart coerceToCycNart(final Object object) {
        if (object instanceof CycNart) {
            return (CycNart)object;
        }
        if (!(object instanceof CycList)) {
            throw new RuntimeException("Cannot coerce to CycNart " + object);
        }
        return new CycNart((CycList)object);
    }
    
    public CycFort getFunctor() {
        return (CycFort)this.formula.getOperator();
    }
    
    public CycNaut getFormula() {
        return this.formula;
    }
    
    public int getArity() {
        return this.getFormula().getArity();
    }
    
    public void setFunctor(final CycFort functor) {
        this.formula.getArgs().set(0, (Object)functor);
    }
    
    public List getArguments() {
        return (List)this.formula.getArgs().rest();
    }
    
    public Object getArgument(final int argnum) {
        return this.formula.getArg(argnum);
    }
    
    public void setArguments(final CycList arguments) {
        this.formula.setArgs((List)arguments);
    }
    
    public void setArgument(final int argNum, final Object argument) {
        this.formula.getArgs().set(argNum, argument);
    }
    
    public String toXMLString() throws IOException {
        final XMLStringWriter xmlStringWriter = new XMLStringWriter();
        this.toXML((XMLWriter)xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("nat", indent, relative, true);
        xmlWriter.printXMLStartTag("functor", CycNart.indentLength, true, true);
        this.getFunctor().toXML(xmlWriter, CycNart.indentLength, true);
        xmlWriter.printXMLEndTag("functor", -CycNart.indentLength, true);
        final ListIterator iterator = this.getArguments().listIterator();
        while (iterator.hasNext()) {
            xmlWriter.printXMLStartTag("arg", 0, true, true);
            final Object arg = iterator.next();
            CycList.toXML(arg, xmlWriter, CycNart.indentLength, true);
            xmlWriter.printXMLEndTag("arg", 0, true);
        }
        xmlWriter.printXMLEndTag("nat", -CycNart.indentLength, true);
    }
    
    public CycList toCycList() {
        return this.getFormula().toCycList();
    }
    
    public CycList toDeepCycList() {
        return this.getFormula().toDeepCycList();
    }
    
    public String toString() {
        if (this.isInvalid) {
            return "INVALID-NART";
        }
        return this.getFormula().toString();
    }
    
    public String cyclify() {
        if (this.isInvalid) {
            return "INVALID-NART";
        }
        return this.getFormula().cyclify();
    }
    
    public String cyclifyWithEscapeChars() {
        if (this.isInvalid) {
            return "INVALID-NART";
        }
        return this.getFormula().cyclifyWithEscapeChars();
    }
    
    public String stringApiValue() {
        return "(canonicalize-term '" + this.cyclifyWithEscapeChars() + ")";
    }
    
    public Object cycListApiValue() {
        final CycList apiValue = new CycList();
        apiValue.add((Object)CycObjectFactory.makeCycSymbol("canonicalize-term"));
        apiValue.addQuoted((Object)this.toCycList());
        return apiValue;
    }
    
    public String metaGuid() {
        final CycFort functor = this.getFunctor();
        final String functorGuid = (functor instanceof CycConstant) ? ((CycConstant)functor).getGuid().toString() : ((CycNart)functor).metaGuid();
        final ListIterator iterator = this.getArguments().listIterator();
        final StringBuffer result = new StringBuffer("(");
        result.append(functorGuid);
        while (iterator.hasNext()) {
            final Object arg = iterator.next();
            String argGuid;
            if (arg instanceof CycConstant) {
                argGuid = ((CycConstant)arg).getGuid().toString();
            }
            else if (arg instanceof CycNart) {
                argGuid = ((CycNart)arg).metaGuid();
            }
            else {
                argGuid = (String)arg;
            }
            result.append(" ");
            result.append(argGuid);
        }
        return result.append(")").toString();
    }
    
    public String metaName() {
        final String functorName = (this.getFunctor() instanceof CycConstant) ? ((CycConstant)this.getFunctor()).getName() : ((CycNart)this.getFunctor()).metaName();
        final ListIterator iterator = this.getArguments().listIterator();
        final StringBuffer result = new StringBuffer("(");
        result.append(functorName);
        while (iterator.hasNext()) {
            final Object arg = iterator.next();
            String argName;
            if (arg instanceof CycConstant) {
                argName = ((CycConstant)arg).getName();
            }
            else if (arg instanceof CycNart) {
                argName = ((CycNart)arg).metaName();
            }
            else {
                argName = (String)arg;
            }
            result.append(" ");
            result.append(argName);
        }
        return result.append(")").toString();
    }
    
    public int hashCode() {
        return this.formula.hashCode();
    }
    
    public boolean equals(final Object object) {
        if (!(object instanceof CycNart)) {
            return false;
        }
        final CycNart thatNart = (CycNart)object;
        return this.formula.equals((Object)thatNart.formula);
    }
    
    public boolean equalsAtEL(final Object object) {
        return this.getFormula().equalsAtEL(object);
    }
    
    public boolean hasFunctorAndArgs() {
        return this.formula.getArity() > 0;
    }
    
    public List getReferencedConstants() {
        return this.getFormula().getReferencedConstants();
    }
    
    private void writeObject(final ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.getFunctor());
        stream.writeObject(this.getArguments());
    }
    
    private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        final CycFort functor = (CycFort)stream.readObject();
        final CycList arguments = (CycList)stream.readObject();
        this.formula = new CycNaut((CycDenotationalTerm)functor, new Object[] { arguments });
    }
    
    static {
        CycNart.indentLength = 2;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 102 ms
	
	Decompiled with Procyon 0.5.32.
*/