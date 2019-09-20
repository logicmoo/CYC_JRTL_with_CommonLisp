package org.opencyc.cycobject;

import org.opencyc.xml.TextUtil;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import org.opencyc.api.SubLAPIHelper;
import java.io.Serializable;

public class CycVariable extends DefaultCycObject implements Serializable
{
    public static final String META_VARIABLE_PREFIX = ":";
    public static final String NORMAL_VARIABLE_PREFIX = "?";
    public static final String cycVariableXMLTag = "variable";
    public Integer hlVariableId;
    public final String name;
    public boolean isMetaVariable;
    
    public CycVariable(final String name, final Integer hlVariableId) {
        this(name);
        if (hlVariableId == null) {
            throw new IllegalArgumentException("id must not be null");
        }
        this.hlVariableId = hlVariableId;
    }
    
    public CycVariable(final String name) {
        this.hlVariableId = null;
        this.isMetaVariable = false;
        if (name == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        String myName = name;
        if (name.startsWith(":")) {
            this.isMetaVariable = true;
            myName = name.substring(1);
        }
        else if (name.startsWith("?")) {
            myName = name.substring(1);
        }
        myName = CycSymbol.canonicalizeName(myName);
        myName = myName.replace(' ', '-');
        if (!this.isValidName(myName)) {
            throw new IllegalArgumentException("Invalid variable name: " + myName);
        }
        this.name = myName;
    }
    
    static Object convertIfPromising(final Object obj) {
        if (obj instanceof CycSymbol) {
            final String symbolName = ((CycSymbol)obj).getSymbolName();
            if (symbolName.startsWith(":") || symbolName.startsWith("?")) {
                return new CycVariable(symbolName);
            }
        }
        return obj;
    }
    
    public boolean isMetaVariable() {
        return this.isMetaVariable;
    }
    
    public boolean isHLVariable() {
        return this.hlVariableId != null;
    }
    
    public String toString() {
        return this.cyclify();
    }
    
    public String toCanonicalString() {
        return CycSymbol.canonicalizeName(this.toString());
    }
    
    public boolean isDontCareVariable() {
        return this.name.startsWith("?");
    }
    
    public String cyclify() {
        if (this.isMetaVariable) {
            return ":" + this.name;
        }
        return "?" + this.name;
    }
    
    public String stringApiValue() {
        if (this.isHLVariable()) {
            return SubLAPIHelper.makeSubLStmt("GET-VARIABLE", new Object[] { this.hlVariableId });
        }
        return "'" + this.cyclifyWithEscapeChars();
    }
    
    public Object cycListApiValue() {
        return this;
    }
    
    public boolean equals(final Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof CycVariable) {
            final CycVariable var = (CycVariable)object;
            return this.isMetaVariable() == var.isMetaVariable() && var.name.equals(this.name);
        }
        if (object instanceof CycSymbol) {
            final CycSymbol other = (CycSymbol)object;
            if (this.name.equals(other.getSymbolName())) {
                if (this.isMetaVariable()) {
                    return other.isKeyword();
                }
                return !other.isKeyword();
            }
        }
        return false;
    }
    
    public int hashCode() {
        return this.name.hashCode();
    }
    
    public int compareTo(final Object object) {
        if (!(object instanceof CycVariable)) {
            throw new ClassCastException("Must be a CycVariable object");
        }
        return this.name.compareTo(((CycVariable)object).name);
    }
    
    public String toXMLString() throws IOException {
        final XMLStringWriter xmlStringWriter = new XMLStringWriter();
        this.toXML((XMLWriter)xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("variable", indent, relative, false);
        xmlWriter.print(TextUtil.doEntityReference(this.name));
        xmlWriter.printXMLEndTag("variable");
    }
    
    public boolean isValidName(final String name) {
        if (name.length() < 1) {
            return false;
        }
        if (name.charAt(0) == '?' || name.charAt(0) == ':') {
            return this.isValidName(name.substring(1));
        }
        for (int i = 0; i < name.length(); ++i) {
            final char thisChar = name.charAt(i);
            if (i == 0) {
                if (thisChar == '?') {
                    continue;
                }
                if (thisChar == ':') {
                    continue;
                }
            }
            if (!Character.isUpperCase(thisChar)) {
                if (!Character.isDigit(thisChar)) {
                    if (thisChar != '-' || i <= 0 || name.charAt(i - 1) == '-') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 59 ms
	
	Decompiled with Procyon 0.5.32.
*/