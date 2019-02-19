package SxxMachine;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

public class LineNumberPushbackReader extends PushbackReader {
    /** The current line number */
    private int lineNumber = 0;
    /** The line number of the mark, if any */
    private int markedLineNumber; // Defaults to 0

    public LineNumberPushbackReader(Reader in) {
        super(in);
    }

    public LineNumberPushbackReader(Reader in, int size) {
        super(in, size);
    }

    /**
     * Set the current line number.
     *
     * @param lineNumber
     *            An int specifying the line number
     *
     * @see #getLineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Get the current line number.
     *
     * @return The current line number
     *
     * @see #setLineNumber
     */
    public int getLineNumber() {
        return this.lineNumber;
    }

    /**
     * Read a single character. <a href="#lt">Line terminators</a> are compressed
     * into single newline ('\n') characters. Whenever a line terminator is read the
     * current line number is incremented.
     *
     * @return The character read, or -1 if the end of the stream has been reached
     *
     * @throws IOException
     *             If an I/O error occurs
     */
    @Override
    public int read() throws IOException {
        synchronized (this.lock) {
            int c = super.read();
            if (c == '\n') {
                this.lineNumber++;
            }
            return c;
        }
    }

    /**
     * Read characters into a portion of an array. Whenever a <a href="#lt">line
     * terminator</a> is read the current line number is incremented.
     *
     * @param cbuf
     *            Destination buffer
     *
     * @param off
     *            Offset at which to start storing characters
     *
     * @param len
     *            Maximum number of characters to read
     *
     * @return The number of bytes read, or -1 if the end of the stream has already
     *         been reached
     *
     * @throws IOException
     *             If an I/O error occurs
     */
    @Override
    public int read(char cbuf[], int off, int len) throws IOException {
        synchronized (this.lock) {
            int n = super.read(cbuf, off, len);
            for (int i = off; i < off + n; i++) {
                if (cbuf[i] == '\n') {
                    this.lineNumber++;
                }
            }
            return n;
        }
    }

    /** Maximum skip-buffer size */
    private static final int maxSkipBufferSize = 8192;
    /** Skip buffer, null until allocated */
    private char skipBuffer[] = null;

    /**
     * Skip characters.
     *
     * @param n
     *            The number of characters to skip
     *
     * @return The number of characters actually skipped
     *
     * @throws IOException
     *             If an I/O error occurs
     *
     * @throws IllegalArgumentException
     *             If <tt>n</tt> is negative
     */
    @Override
    public long skip(long n) throws IOException {
        if (n < 0)
            throw new IllegalArgumentException("skip() value is negative");
        int nn = (int) Math.min(n, maxSkipBufferSize);
        synchronized (this.lock) {
            if ((this.skipBuffer == null) || (this.skipBuffer.length < nn))
                this.skipBuffer = new char[nn];
            long r = n;
            while (r > 0) {
                int nc = read(this.skipBuffer, 0, (int) Math.min(r, nn));
                if (nc == -1)
                    break;
                r -= nc;
            }
            return n - r;
        }
    }

    /**
     * Mark the present position in the stream. Subsequent calls to reset() will
     * attempt to reposition the stream to this point, and will also reset the line
     * number appropriately.
     *
     * @param readAheadLimit
     *            Limit on the number of characters that may be read while still
     *            preserving the mark. After reading this many characters,
     *            attempting to reset the stream may fail.
     *
     * @throws IOException
     *             If an I/O error occurs
     */
    @Override
    public void mark(int readAheadLimit) throws IOException {
        synchronized (this.lock) {
            super.mark(readAheadLimit);
            this.markedLineNumber = this.lineNumber;
        }
    }

    /**
     * Reset the stream to the most recent mark.
     *
     * @throws IOException
     *             If the stream has not been marked, or if the mark has been
     *             invalidated
     */
    @Override
    public void reset() throws IOException {
        synchronized (this.lock) {
            super.reset();
            this.lineNumber = this.markedLineNumber;
        }
    }

    @Override
    public void unread(int c) throws IOException {
        super.unread(c);
        if (c == '\n') {
            this.lineNumber--;
        }
    }

    @Override
    public void unread(char[] cbuf, int off, int len) throws IOException {
        super.unread(cbuf, off, len);
        for (int i = off; i < off + len; i++) {
            if (cbuf[i] == '\n') {
                this.lineNumber--;
            }
        }
    }
}
