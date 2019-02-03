package org.armedbear.lisp;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ReaderInputStream extends InputStream
{
    private Reader in;
    private String encoding;
    private byte[] slack;
    private int begin;

    public ReaderInputStream(final Reader reader) {
        this.encoding = System.getProperty("file.encoding");
        this.in = reader;
    }

    public ReaderInputStream(final Reader reader, final String encoding) {
        this(reader);
        if (encoding == null) {
            throw new IllegalArgumentException("encoding must not be null");
        }
        this.encoding = encoding;
    }

    @Override
	public synchronized int read() throws IOException {
        if (this.in == null) {
            throw new IOException("Stream Closed");
        }
        byte result;
        if (this.slack != null && this.begin < this.slack.length) {
            result = this.slack[this.begin];
            if (++this.begin == this.slack.length) {
                this.slack = null;
            }
        }
        else {
            final byte[] buf = { 0 };
            if (this.read(buf, 0, 1) <= 0) {
                result = -1;
            }
            result = buf[0];
        }
        if (result < -1) {
            result += 256;
        }
        return result;
    }

    @Override
	public synchronized int read(final byte[] b, final int off, int len) throws IOException {
        if (this.in == null) {
            throw new IOException("Stream Closed");
        }
        while (this.slack == null) {
            final char[] buf = new char[len];
            final int n = this.in.read(buf);
            if (n == -1) {
                return -1;
            }
            if (n <= 0) {
                continue;
            }
            this.slack = new String(buf, 0, n).getBytes(this.encoding);
            this.begin = 0;
        }
        if (len > this.slack.length - this.begin) {
            len = this.slack.length - this.begin;
        }
        System.arraycopy(this.slack, this.begin, b, off, len);
        if ((this.begin += len) >= this.slack.length) {
            this.slack = null;
        }
        return len;
    }

    @Override
	public synchronized void mark(final int limit) {
        try {
            this.in.mark(limit);
        }
        catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }

    @Override
	public synchronized int available() throws IOException {
        if (this.in == null) {
            throw new IOException("Stream Closed");
        }
        if (this.slack != null) {
            return this.slack.length - this.begin;
        }
        if (this.in.ready()) {
            return 1;
        }
        return 0;
    }

    @Override
	public boolean markSupported() {
        return false;
    }

    @Override
	public synchronized void reset() throws IOException {
        if (this.in == null) {
            throw new IOException("Stream Closed");
        }
        this.slack = null;
        this.in.reset();
    }

    @Override
	public synchronized void close() throws IOException {
        this.in.close();
        this.slack = null;
        this.in = null;
    }
}

/*

	Total time: 546 ms

*/