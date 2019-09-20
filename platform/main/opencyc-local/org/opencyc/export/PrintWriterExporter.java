package org.opencyc.export;

import java.io.Writer;
import java.io.StringWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Closeable;

public abstract class PrintWriterExporter<T> extends StatefulSynchronizedExporter<T> implements Exporter<T>, Appendable, Closeable
{
    private ThreadLocal<PrintWriter> printWriter;
    
    public PrintWriterExporter(final PrintWriter printWriter) {
        this();
        this.printWriter.set(printWriter);
    }
    
    public PrintWriterExporter(final PrintStream printStream) {
        this(new PrintWriter(printStream));
    }
    
    public PrintWriterExporter() {
        this.printWriter = new ThreadLocal<PrintWriter>();
    }
    
    protected void finalizeState() throws ExportException {
        try {
            this.close();
        }
        catch (IOException ex) {
            throw new ExportException("Couldn't close print stream following export.", (Throwable)ex);
        }
    }
    
    public void exportToWriter(final T object, final PrintWriter writer) throws ExportException {
        this.printWriter.set(writer);
		this.export((T)object);
    }
    
    public String exportToString(final T object) throws ExportException {
        try {
            final StringWriter stringWriter = new StringWriter();
            final PrintWriter exportWriter = new PrintWriter(stringWriter);
            this.exportToWriter(object, exportWriter);
            final String resultXML = stringWriter.toString();
            exportWriter.close();
            return resultXML;
        }
        catch (Exception ex) {
            throw new ExportException((Throwable)ex);
        }
    }
    
    public Appendable append(final CharSequence csq) throws IOException {
        this.getPrintWriter().append(csq);
        return this;
    }
    
    public Appendable append(final CharSequence csq, final int start, final int end) throws IOException {
        this.getPrintWriter().append(csq, start, end);
        return this;
    }
    
    public Appendable append(final char c) throws IOException {
        this.getPrintWriter().append(c);
        return this;
    }
    
    public void close() throws IOException {
        if (this.printWriter.get() != null) {
            this.printWriter.get().close();
        }
    }
    
    public void println(final Object x) {
        this.getPrintWriter().println(x);
    }
    
    protected void println() {
        this.getPrintWriter().println();
    }
    
    protected PrintWriter getPrintWriter() {
        if (this.printWriter.get() == null) {
            throw new IllegalStateException("printStream has not been initialized.");
        }
        return this.printWriter.get();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 58 ms
	
	Decompiled with Procyon 0.5.32.
*/