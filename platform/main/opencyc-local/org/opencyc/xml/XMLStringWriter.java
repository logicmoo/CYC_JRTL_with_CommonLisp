package org.opencyc.xml;

import java.io.IOException;
import java.io.StringWriter;

public class XMLStringWriter extends XMLWriter
{
    StringWriter writer;
    
    public XMLStringWriter() {
        this.writer = new StringWriter();
    }
    
    public void indentPrint(final String string, final int indent, final boolean relative) {
        this.setIndent(indent, relative);
        this.writer.write(this.indentString + string);
    }
    
    public void print(final String string) {
        this.writer.write(string);
    }
    
    public void flush() {
        this.writer.flush();
    }
    
    public void close() throws IOException {
        this.writer.close();
    }
    
    public String toString() {
        return this.writer.toString();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 12 ms
	
	Decompiled with Procyon 0.5.32.
*/