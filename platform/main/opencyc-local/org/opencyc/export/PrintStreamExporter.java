package org.opencyc.export;

import java.io.UnsupportedEncodingException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Closeable;

public abstract class PrintStreamExporter<T> extends StatefulSynchronizedExporter<T> implements Exporter<T>, Appendable, Closeable {
	private ThreadLocal<PrintStream> printStream;

	public PrintStreamExporter(final PrintStream printStream) {
		this();
		this.printStream.set(printStream);
	}

	public PrintStreamExporter() {
		this.printStream = new ThreadLocal<PrintStream>();
	}

	protected void finalizeState() throws ExportException {
		try {
			this.close();
		} catch (IOException ex) {
			throw new ExportException("Couldn't close print stream following export.", (Throwable) ex);
		}
	}

	public void exportToStream(final T object, final PrintStream stream) throws ExportException {
		this.printStream.set(stream);
		this.export((T) object);
	}

	public String exportToString(final T object) throws ExportException {
		try {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final PrintStream exportStream = new PrintStream(baos);
			this.exportToStream(object, exportStream);
			final String resultXML = baos.toString("UTF-8");
			exportStream.close();
			return resultXML;
		} catch (UnsupportedEncodingException ex) {
			throw new ExportException((Throwable) ex);
		}
	}

	public Appendable append(final CharSequence csq) throws IOException {
		this.getPrintStream().append(csq);
		return this;
	}

	public Appendable append(final CharSequence csq, final int start, final int end) throws IOException {
		this.getPrintStream().append(csq, start, end);
		return this;
	}

	public Appendable append(final char c) throws IOException {
		this.getPrintStream().append(c);
		return this;
	}

	public void close() throws IOException {
		if (this.printStream.get() != null) {
			this.printStream.get().close();
		}
	}

	public void println(final Object x) {
		this.getPrintStream().println(x);
	}

	protected void println() {
		this.getPrintStream().println();
	}

	protected PrintStream getPrintStream() {
		if (this.printStream.get() == null) {
			throw new IllegalStateException("printStream has not been initialized.");
		}
		return this.printStream.get();
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 52 ms
	
	Decompiled with Procyon 0.5.32.
*/