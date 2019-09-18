/*
 * 
 */
package com.cyc.baseclient.export;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * Class of exporters that send output to a PrintStream.
 *
 * @param <T> the type of object to export.
 * @author baxter
 */
public abstract class PrintStreamExporter<T> extends StatefulSynchronizedExporter<T>
        implements Exporter<T>, Appendable, Closeable {

    private ThreadLocal<PrintStream> printStream = new ThreadLocal<PrintStream>();

    /**
     * Make a new exporter that will send output to the specified stream.
     *
     * @param printStream
     */
    public PrintStreamExporter(PrintStream printStream) {
        this();
        this.printStream.set(printStream);
    }

    /**
     * Make a new exporter. Should be passed a print stream at export time.
     *
     * @see #exportToStream(java.lang.Object, java.io.PrintStream)
     */
    public PrintStreamExporter() {
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
     * @param stream
     * @throws ExportException
     */
    public void exportToStream(final T object, final PrintStream stream) throws ExportException {
        this.printStream.set(stream);
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
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final PrintStream exportStream = new PrintStream(baos);
            exportToStream(object, exportStream);
            final String resultXML = baos.toString("UTF-8");
            exportStream.close();
            return resultXML;
        } catch (UnsupportedEncodingException ex) {
            throw new ExportException(ex);
        }
    }

    @Override
    public Appendable append(CharSequence csq) throws IOException {
        getPrintStream().append(csq);
        return this;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        getPrintStream().append(csq, start, end);
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        getPrintStream().append(c);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (printStream.get() != null) {
            printStream.get().close();
        }
    }
    //@TODO -- Add trampolines for print(f/ln), format, write methods here as needed.

    public void println(Object x) {
        getPrintStream().println(x);
    }

    protected void println() {
        getPrintStream().println();
    }

    protected PrintStream getPrintStream() {
        if (printStream.get() == null) {
            throw new IllegalStateException("printStream has not been initialized.");
        }
        return printStream.get();
    }
}
