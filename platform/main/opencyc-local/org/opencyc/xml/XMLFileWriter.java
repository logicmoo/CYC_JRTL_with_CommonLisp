package org.opencyc.xml;

import java.io.IOException;
import java.io.FileWriter;

public class XMLFileWriter extends XMLWriter
{
    FileWriter writer;
    
    public XMLFileWriter(final String outputFile) throws IOException {
        this.writer = new FileWriter(outputFile);
    }
    
    public void indentPrint(final String string, final int indent, final boolean relative) throws IOException {
        this.setIndent(indent, relative);
        final String newString = this.indentString + string;
        final int newStringLength = newString.length();
        this.writer.write(newString, 0, newStringLength);
    }
    
    public void print(final String string) throws IOException {
        this.writer.write(string, 0, string.length());
    }
    
    public void flush() throws IOException {
        this.writer.flush();
    }
    
    public void close() throws IOException {
        this.writer.close();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 13 ms
	
	Decompiled with Procyon 0.5.32.
*/