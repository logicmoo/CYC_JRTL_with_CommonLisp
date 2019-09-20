package org.opencyc.cycobject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.opencyc.xml.TextUtil;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import java.io.Serializable;

public class CycConstant extends CycFort implements Serializable
{
    static final long serialVersionUID = -8728481441510819469L;
    public static final String constantXMLTag = "constant";
    public static final String nameXMLTag = "name";
    public static int indentLength;
    public Guid guid;
    public String name;
    protected boolean isFree;
    
    private CycConstant() {
        this.isFree = false;
    }
    
    public CycConstant(final String name, final Guid guid) {
        this.isFree = false;
        if (name == null && guid == null) {
            throw new IllegalArgumentException("Name and GUID must not be null.");
        }
        if (name != null && name.startsWith("#$")) {
            this.name = name.substring(2);
        }
        else {
            this.name = name;
        }
        this.guid = guid;
    }
    
    public static CycConstant makeFreeConstant() {
        final CycConstant cycConstant = new CycConstant();
        cycConstant.isFree = true;
        return cycConstant;
    }
    
    public static CycConstant makeInvalidConstant() {
        final CycConstant cycConstant = new CycConstant();
        cycConstant.isInvalid = true;
        return cycConstant;
    }
    
    public String getName() {
        if (this.isFree) {
            return "FREE";
        }
        if (this.isInvalid) {
            return "INVALID-CONSTANT";
        }
        return this.name;
    }
    
    public String setName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException("name must not be an empty string");
        }
        return this.name = name;
    }
    
    public Guid getGuid() {
        return this.guid;
    }
    
    public void setGuid(final Guid newGuid) {
        if (newGuid == null) {
            throw new RuntimeException("Guid must not be null.");
        }
        if (this.guid != null) {
            throw new RuntimeException("Can only set GUID on a constant with an existing NULL guid.");
        }
        this.guid = newGuid;
    }
    
    public String toXMLString() throws IOException {
        final XMLStringWriter xmlStringWriter = new XMLStringWriter();
        this.toXML((XMLWriter)xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("constant", indent, relative, true);
        int subIndent = CycConstant.indentLength;
        if (this.guid != null) {
            this.guid.toXML(xmlWriter, subIndent, true);
            subIndent = 0;
        }
        if (this.name != null) {
            xmlWriter.printXMLStartTag("name", subIndent, true, false);
            xmlWriter.print(TextUtil.doEntityReference(this.getName()));
            xmlWriter.printXMLEndTag("name");
            if (subIndent == CycConstant.indentLength) {
                subIndent = 0;
            }
        }
        xmlWriter.printXMLEndTag("constant", -CycConstant.indentLength, true);
    }
    
    public int hashCode() {
        return this.getGuid().hashCode();
    }
    
    public boolean equals(final Object object) {
        if (!(object instanceof CycConstant)) {
            return false;
        }
        final Guid thisGuid = this.getGuid();
        final Guid thatGuid = ((CycConstant)object).getGuid();
        return thisGuid.equals((Object)thatGuid);
    }
    
    public boolean equalsAtEL(final Object object) {
        return this.equals(object);
    }
    
    protected void setFree() {
        this.isFree = true;
    }
    
    public String toString() {
        if (this.isFree) {
            return "FREE";
        }
        if (this.isInvalid) {
            return "INVALID-CONSTANT";
        }
        if (this.name != null) {
            return this.name;
        }
        return "[CycConstant: " + this.guid.toString() + "]";
    }
    
    public String cyclify() {
        if (this.isFree) {
            return "FREE";
        }
        if (this.isInvalid) {
            return "INVALID-CONSTANT";
        }
        return "#$" + this.getName();
    }
    
    public Object cycListApiValue() {
        return this;
    }
    
    public static String makeValidConstantName(final String candidateName) {
        String answer = candidateName;
        for (int i = 0; i < answer.length(); ++i) {
            final char c = answer.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                if (c != '?') {
                    final StringBuffer answerBuf = new StringBuffer(answer);
                    answerBuf.setCharAt(i, '_');
                    answer = answerBuf.toString();
                }
            }
        }
        return answer;
    }
    
    public List getReferencedConstants() {
        final List result = new ArrayList();
        result.add(this);
        return result;
    }
    
    private void writeObject(final ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeUTF(this.guid.getGuidString());
        stream.writeUTF(this.name);
    }
    
    private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.guid = new Guid(stream.readUTF());
        this.name = stream.readUTF();
    }
    
    static {
        CycConstant.indentLength = 2;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 66 ms
	
	Decompiled with Procyon 0.5.32.
*/