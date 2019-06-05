package org.armedbear.lisp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class WriterOutputStream extends OutputStream {
	protected final Writer _writer;
	protected final String _encoding;
	private final byte[] _buf;

	public WriterOutputStream(final Writer writer, final String encoding) {
		this._buf = new byte[1];
		this._writer = writer;
		this._encoding = encoding;
	}

	public WriterOutputStream(final Writer writer) {
		this._buf = new byte[1];
		this._writer = writer;
		this._encoding = null;
	}

	@Override
	public void close() throws IOException {
		this._writer.close();
	}

	@Override
	public void flush() throws IOException {
		this._writer.flush();
	}

	@Override
	public void write(final byte[] b) throws IOException {
		if (this._encoding == null) {
			this._writer.write(new String(b));
		} else {
			this._writer.write(new String(b, this._encoding));
		}
	}

	@Override
	public void write(final byte[] b, final int off, final int len) throws IOException {
		if (this._encoding == null) {
			this._writer.write(new String(b, off, len));
		} else {
			this._writer.write(new String(b, off, len, this._encoding));
		}
	}

	@Override
	public synchronized void write(final int b) throws IOException {
		this._buf[0] = (byte) b;
		this.write(this._buf);
	}
}
