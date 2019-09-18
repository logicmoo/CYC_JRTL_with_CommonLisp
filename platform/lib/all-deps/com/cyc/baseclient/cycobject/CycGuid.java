package com.cyc.baseclient.cycobject;

import com.cyc.baseclient.xml.XMLWriter;
import com.cyc.baseclient.xml.XMLStringWriter;
import com.cyc.base.cycobject.Guid;
import java.io.*;
import java.util.UUID;

/**
 * Provides the behavior and attributes of an OpenCyc GUID (Globally Unique
 * IDentifier). Each OpenCyc constant has an associated guid.
 *
 * @version $0.1$
 * @author Stephen L. Reed
 */
public class CycGuid extends com.cyc.base.cycobject.Guid {

    /**
     * The name of the XML tag for this object.
     */
    public static final String guidXMLTag = "guid";

     /**
     * Constructs a new <tt>Guid</tt> object.
     */
    
    public CycGuid(UUID guid) {
      super(guid);
    }
    
    public CycGuid(String guidString) {
      super(guidString);
    }
    
    public CycGuid(UUID guid, String guidString) {
      super(guid, guidString);
    }
    
    public CycGuid(byte[] data) {
      super(data);      
    }



    /**
     * Returns the XML representation of this object.
     *
     * @return the XML representation of this object
     */
    @Deprecated
    public String toXMLString () throws IOException {
        XMLStringWriter xmlStringWriter = new XMLStringWriter();
        toXML(xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }

    /**
     * Prints the XML representation of the CycGuid to an <code>XMLWriter</code>
     *
     * @param xmlWriter an <tt>XMLWriter</tt>
     * @param indent an int that specifies by how many spaces to indent
     * @param relative a boolean; if true indentation is relative, otherwise absolute
     */
    @Deprecated
    public void toXML (XMLWriter xmlWriter, int indent, boolean relative)
        throws IOException {
        xmlWriter.printXMLStartTag(guidXMLTag, indent, relative, false);
        xmlWriter.print(guidString);
        xmlWriter.printXMLEndTag(guidXMLTag);
    }
    
    public static CycGuid fromGuid(Guid guid) {
      if ((guid != null) && !CycGuid.class.isInstance(guid)) {
        return new CycGuid(guid.getGuidString());
      }
      return (CycGuid) guid;
    }

    
    // private

    // Internal Rep
    
    
    
    public static void main (String[] args) {
      final byte[] data = {(byte) 189,  (byte)  88, (byte) 128, (byte) 244, (byte) 156, (byte)  41, (byte)  17, (byte) 177,
                           (byte) 157,  (byte) 173, (byte) 195, (byte) 121, (byte)  99, (byte) 111, (byte) 114, (byte) 112 };
      final CycGuid guid1 = new CycGuid(data);
      final CycGuid guid2 = new CycGuid("bd5880f4-9c29-11b1-9dad-c379636f7270");
      System.out.println("guid1 = " + guid1);
      System.out.println("guid2 = " + guid2);
     if (!guid1.equals(guid2)) {
        throw new RuntimeException(guid1 + " does not equal " + guid2);     
      }
    }
}
