package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.scripting.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.io.Writer;

public class ReaderInputStream extends InputStream {

	private static void close(Closeable cl) {
		try {
			cl.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Reader reader;
	private Writer writer;

	private PipedInputStream inPipe;

	public ReaderInputStream(Reader reader) throws IOException {
		this(reader, null);
	}

	public ReaderInputStream(Reader reader, String encoding) throws IOException {
		this.reader = reader;
		this.inPipe = new PipedInputStream();
		OutputStream outPipe = new PipedOutputStream(this.inPipe);
		this.writer = encoding == null ? new OutputStreamWriter(outPipe) : new OutputStreamWriter(outPipe, encoding);
	}

	public int available() throws IOException {
		return 0;
	}

	public synchronized void close() throws IOException {
		ReaderInputStream.close(this.reader);
		ReaderInputStream.close(this.writer);
		ReaderInputStream.close(this.inPipe);
	}

	private boolean doRead() throws IOException {
		int n = this.reader.read();
		if (n == -1)
			return false;
		this.writer.write(n);
		this.writer.flush();
		return true;
	}

	public int read() throws IOException {
		if (this.doRead())
			return this.inPipe.read();
		else
			return -1;
	}

	public int read(byte b[]) throws IOException {
		return super.read(b);
	}

	public int read(byte b[], int off, int len) throws IOException {
		if (len <= 0)
			return 0;
		int n = this.read();
		if (n == -1)
			return -1;
		else
			b[off] = (byte) n;
		return 1;
	}

	public long skip(long n) throws IOException {
		return super.skip(n);
	}

}