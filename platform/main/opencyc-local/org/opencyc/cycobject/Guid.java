package org.opencyc.cycobject;

import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import java.util.UUID;
import java.io.Serializable;

public class Guid implements Serializable
{
    public static final String guidXMLTag = "guid";
    public final String guidString;
    private final UUID guid;
    
    public Guid(final UUID guid) {
        this(guid, guid.toString());
    }
    
    public Guid(final String guidString) {
        this(UUID.fromString(guidString), guidString);
    }
    
    public Guid(final UUID guid, final String guidString) {
        this.guid = guid;
        this.guidString = guidString;
    }
    
    public Guid(final byte[] data) {
        this(new UUID(guidMSB(data), guidLSB(data)));
    }
    
    @Override
    public boolean equals(final Object object) {
        return object instanceof Guid && this.guid.equals(((Guid)object).guid);
    }
    
    @Override
    public int hashCode() {
        return this.guid.hashCode();
    }
    
    @Override
    public String toString() {
        return this.getGuidString();
    }
    
    public String getGuidString() {
        return this.guidString;
    }
    
    public String toXMLString() throws IOException {
        final XMLStringWriter xmlStringWriter = new XMLStringWriter();
        this.toXML((XMLWriter)xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("guid", indent, relative, false);
        xmlWriter.print(this.guidString);
        xmlWriter.printXMLEndTag("guid");
    }
    
    private static final long guidMSB(final byte[] data) {
        long msb = 0L;
        assert data.length == 16;
        for (int i = 0; i < 8; ++i) {
            msb = (msb << 8 | (data[i] & 0xFF));
        }
        return msb;
    }
    
    private static final long guidLSB(final byte[] data) {
        long lsb = 0L;
        assert data.length == 16;
        for (int i = 8; i < 16; ++i) {
            lsb = (lsb << 8 | (data[i] & 0xFF));
        }
        return lsb;
    }
    
    public static void main(final String[] args) {
        final byte[] data = { -67, 88, -128, -12, -100, 41, 17, -79, -99, -83, -61, 121, 99, 111, 114, 112 };
        final Guid guid1 = new Guid(data);
        final Guid guid2 = new Guid("bd5880f4-9c29-11b1-9dad-c379636f7270");
        System.out.println("guid1 = " + guid1);
        System.out.println("guid2 = " + guid2);
        if (!guid1.equals(guid2)) {
            throw new RuntimeException(guid1 + " does not equal " + guid2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 60 ms
	
	Decompiled with Procyon 0.5.32.
*/