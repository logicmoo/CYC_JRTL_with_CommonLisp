/*
 * 
 */
package com.cyc.baseclient.export;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Class of exporters that send output to a PrintWriter.
 *
 * @param <T> the type of object to export.
 * @author baxter
 */
public abstract class PrintWriterExporter<T> extends StatefulSynchronizedExporter<T>
        implements Exporter<T>, Appendable, Closeable {

    private ThreadLocal<PrintWriter> printWriter = new ThreadLocal<PrintWriter>();

    /**
     * Make a new exporter that will send output to the specified writer.
     *
     * @param printWriter
     */
    public PrintWriterExporter(PrintWriter printWriter) {
        this();
        this.printWriter.set(printWriter);
    }

    /**
     * Make a new exporter that will send output to the specified stream.
     *
     * @param printStream
     */
    public PrintWriterExporter(PrintStream printStream) {
        this(new PrintWriter(printStream));
    }

    /**
     * Make a new exporter. Should be passed a print stream at export time.
     *
     * @see #exportToStream(java.lang.Object, java.io.PrintWriter)
     */
    public PrintWriterExporter() {
        super();
    }

    @Override
    protected void finalizeState() throws ExportException {
        try {
            close();
        } catch (IOException ex) {
            throw new ExportException("Couldn't close print stream following export.",
                    ex);
        }
    }

    /**
     * Export the specified object to the specified stream.
     *
     * @param object
     * @param writer
     * @throws ExportException
     */
    public void exportToWriter(final T object, final PrintWriter writer) throws ExportException {
        this.printWriter.set(writer);
        export(object);
    }

    /**
     * Export the specified object to a string.
     *
     * @param object
     * @param stream
     * @return the result string.
     * @throws ExportException
     */
    public String exportToString(final T object) throws ExportException {
        try {
            StringWriter stringWriter = new StringWriter();
            final PrintWriter exportWriter = new PrintWriter(stringWriter);
            exportToWriter(object, exportWriter);
            final String resultXML = stringWriter.toString();
            exportWriter.close();
            return resultXML;
        } catch (Exception ex) {
            throw new ExportException(ex);
        }
    }

    @Override
    public Appendable append(CharSequence csq) throws IOException {
        getPrintWriter().append(csq);
        return this;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        getPrintWriter().append(csq, start, end);
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        getPrintWriter().append(c);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (printWriter.get() != null) {
            printWriter.get().close();
        }
    }
    //@TODO -- Add trampolines for print(f/ln), format, write methods here as needed.

    public void println(Object x) {
        getPrintWriter().println(x);
    }

    protected void println() {
        getPrintWriter().println();
    }

    protected PrintWriter getPrintWriter() {
        if (printWriter.get() == null) {
            throw new IllegalStateException("printStream has not been initialized.");
        }
        return printWriter.get();
    }
}
