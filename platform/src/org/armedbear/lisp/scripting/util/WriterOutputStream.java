package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.scripting.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.io.Writer;

public class WriterOutputStream extends OutputStream {

	private static void close(Closeable cl) {
		try {
			cl.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Reader reader;
	private Writer writer;

	private PipedOutputStream outPipe;

	public WriterOutputStream(Writer writer) throws IOException {
		this(writer, null);
	}

	public WriterOutputStream(Writer writer, String encoding) throws IOException {
		this.writer = writer;
		this.outPipe = new PipedOutputStream();
		InputStream inPipe = new PipedInputStream(this.outPipe);
		this.reader = encoding == null ? new InputStreamReader(inPipe) : new InputStreamReader(inPipe, encoding);
	}

	public synchronized void close() throws IOException {
		WriterOutputStream.close(this.reader);
		WriterOutputStream.close(this.writer);
		WriterOutputStream.close(this.outPipe);
	}

	private void doWrite(int n) throws IOException {
		this.outPipe.write(n);
		this.outPipe.flush();
		n = this.reader.read();
		this.writer.write(n);
	}

	public void flush() throws IOException {
		super.flush();
	}

	public void write(byte[] b) throws IOException {
		super.write(b);
	}

	public void write(byte[] b, int off, int len) throws IOException {
		super.write(b, off, len);
	}

	public void write(int b) throws IOException {
		this.doWrite(b);
		this.writer.flush();
	}

}