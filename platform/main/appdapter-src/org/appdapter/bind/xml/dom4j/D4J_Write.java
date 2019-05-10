package org.appdapter.bind.xml.dom4j;

import java.io.StringWriter;
import java.io.Writer;
import org.dom4j.io.XMLWriter;
import org.dom4j.io.OutputFormat;
import java.io.OutputStream;
import org.w3c.dom.Element;
import org.dom4j.io.DOMWriter;
import org.w3c.dom.Node;
import org.dom4j.Document;

public class D4J_Write
{
    public static Node write(final Document d4jDoc) throws Throwable {
        final DOMWriter domWriter = new DOMWriter();
        final org.w3c.dom.Document w3cDoc = domWriter.write(d4jDoc);
        final Element w3cEl = w3cDoc.getDocumentElement();
        return w3cEl;
    }
    
    public static void writePretty(final org.dom4j.Node d4jNode, final OutputStream outStream) throws Throwable {
        final OutputFormat format = OutputFormat.createPrettyPrint();
        final XMLWriter writer = new XMLWriter(outStream, format);
        writer.write(d4jNode);
    }
    
    public static void writePretty(final org.dom4j.Node d4jNode, final Writer writer) throws Throwable {
        final OutputFormat format = OutputFormat.createPrettyPrint();
        final XMLWriter xwriter = new XMLWriter(writer, format);
        xwriter.write(d4jNode);
    }
    
    public static String writePrettyString(final org.dom4j.Node d4jNode) throws Throwable {
        final StringWriter sw = new StringWriter();
        writePretty(d4jNode, sw);
        final String result = sw.toString();
        return result;
    }
}

/*

	Total time: 10 ms
	
*/