package org.opencyc.xml;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class XMLPrintWriter extends XMLWriter
{
    PrintWriter writer;
    
    public XMLPrintWriter(final PrintStream printStream) {
        this.writer = new PrintWriter(printStream, true);
    }
    
    public void indentPrint(final String string, final int indent, final boolean relative) {
        this.setIndent(indent, relative);
        this.writer.print(this.indentString + string);
    }
    
    public void print(final String string) {
        this.writer.print(string);
    }
    
    public void flush() {
        this.writer.flush();
    }
    
    public void close() {
        this.writer.close();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 41 ms
	
	Decompiled with Procyon 0.5.32.
*/