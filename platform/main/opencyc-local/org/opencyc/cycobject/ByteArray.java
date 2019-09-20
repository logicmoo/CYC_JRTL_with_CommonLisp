package org.opencyc.cycobject;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import java.io.Serializable;

public class ByteArray extends DefaultCycObject implements Serializable
{
    static final long serialVersionUID = -6247169945186440269L;
    public static final String byteVectorXMLTag = "byte-vector";
    public static final String lengthXMLTag = "length";
    public static final String byteXMLTag = "byte";
    public static int indentLength;
    private byte[] bytes;
    
    public ByteArray(final byte[] bytes) {
        this.bytes = bytes;
    }
    
    public byte[] byteArrayValue() {
        return this.bytes;
    }
    
    public boolean equals(final Object object) {
        if (!(object instanceof ByteArray)) {
            return false;
        }
        if (this.bytes.length != ((ByteArray)object).bytes.length) {
            return false;
        }
        for (int i = 0; i < this.bytes.length; ++i) {
            if (this.bytes[i] != ((ByteArray)object).bytes[i]) {
                return false;
            }
        }
        return true;
    }
    
    public String toString() {
        final StringBuffer result = new StringBuffer("[ByteArray len:");
        result.append(this.bytes.length);
        result.append(" ");
        if (this.bytes.length > 0) {
            result.append(new Byte(this.bytes[0]).toString());
        }
        for (int i = 1; i < this.bytes.length; ++i) {
            result.append(",");
            result.append(new Byte(this.bytes[i]).toString());
        }
        result.append("]");
        return result.toString();
    }
    
    public String toXMLString() throws IOException {
        final XMLStringWriter xmlStringWriter = new XMLStringWriter();
        this.toXML((XMLWriter)xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("byte-vector", indent, relative, true);
        xmlWriter.printXMLStartTag("length", ByteArray.indentLength, true, false);
        xmlWriter.print(Integer.toString(this.bytes.length));
        xmlWriter.printXMLEndTag("length");
        for (int i = 0; i < this.bytes.length; ++i) {
            xmlWriter.printXMLStartTag("byte", 0, true, false);
            xmlWriter.print(Byte.toString(this.bytes[i]));
            xmlWriter.printXMLEndTag("byte");
        }
        xmlWriter.printXMLEndTag("byte-vector", -ByteArray.indentLength, true);
    }
    
    public String stringApiValue() {
        final StringBuffer buf = new StringBuffer(this.bytes.length * 4);
        buf.append("(read-from-string \"#(");
        for (int i = 0; i < this.bytes.length; ++i) {
            buf.append(' ');
            int value = this.bytes[i];
            if (value < 0) {
                value += 256;
            }
            buf.append(value);
        }
        buf.append(")\")");
        return buf.toString();
    }
    
    private void writeObject(final ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(this.byteArrayValue().length);
        stream.write(this.byteArrayValue());
    }
    
    private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        final int size = stream.readInt();
        this.bytes = new byte[size];
        int numOfBytes;
        for (int index = 0, remainder = size; index < size; index += numOfBytes, remainder -= numOfBytes) {
            numOfBytes = stream.read(this.bytes, index, remainder);
            if (numOfBytes == -1) {
                throw new EOFException("Unexpected EOF at index " + index + " of " + size);
            }
        }
    }
    
    public int compareTo(final Object o) {
        if (!(o instanceof ByteArray)) {
            return this.toString().compareTo(o.toString());
        }
        final int thisbound = this.bytes.length;
        final ByteArray cmp = (ByteArray)o;
        final int obound = cmp.bytes.length;
        final int bound = (thisbound > obound) ? obound : thisbound;
        for (int i = 0; i < bound; ++i) {
            if (this.bytes[i] != cmp.bytes[i]) {
                return this.bytes[i] - cmp.bytes[i];
            }
        }
        return bound - obound;
    }
    
    static {
        ByteArray.indentLength = 2;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 55 ms
	
	Decompiled with Procyon 0.5.32.
*/