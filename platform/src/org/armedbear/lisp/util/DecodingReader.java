/*
 * DecodingStreamReader.java
 *
 * Copyright (C) 2010 Erik Huelsmann
 * $Id: DecodingReader.java 12330 2010-01-04 21:57:52Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Debug;

/**
 * Class to support mid-stream change of character encoding to support
 * setExternalFormat operation in Stream.java
 *
 * Note: extends PushbackReader, but only for its interface; all methods are
 * overridden.
 */
public class DecodingReader extends PushbackReader {

	// dummy reader which we need to call the Pushback constructor
	// because a null value won't work
	private static Reader staticReader = new StringReader("");

	// contains the currently buffered bytes read from the stream
	private ByteBuffer bbuf;

	// stream to read from, wrapped in a PushbackInputStream
	private PushbackInputStream stream;

	// Decoder, used for decoding characters on the input stream
	private CharsetDecoder cd;

	// Encoder, used to put characters back on the input stream when unreading
	private CharsetEncoder ce;

	public DecodingReader(InputStream stream, int size, Charset cs) {
		super(DecodingReader.staticReader); // pass a dummy stream value into
											// the constructor

		// we need to be able to unread the byte buffer
		this.stream = new PushbackInputStream(stream, size);
		this.cd = cs.newDecoder();
		this.ce = cs.newEncoder();
		this.bbuf = ByteBuffer.allocate(size);
		this.bbuf.flip(); // mark the buffer as 'needs refill'
	}

	public void close() throws IOException {
		this.stream.close();
	}

	// fill bbuf, either when empty or when forced
	private boolean ensureBbuf(boolean force) throws IOException {
		if (this.bbuf.remaining() == 0 || force) {
			this.bbuf.compact();

			int size = this.stream.available();
			if (size > this.bbuf.remaining() || size == 0)
				// by reading more than the available bytes when
				// none available, block only if we need to on
				// interactive streams
				size = this.bbuf.remaining();

			byte[] by = new byte[size];

			int c;
			try {
				c = this.stream.read(by);
			} catch (IOException io) {
				io.printStackTrace();
				return false;
			}

			if (c < 0) {
				this.bbuf.flip(); // prepare bbuf for reading
				return false;
			}

			this.bbuf.put(by, 0, c);
			this.bbuf.flip();
		}
		return true;
	}

	/** Get the Charset used to decode bytes from the input stream. */
	public Charset getCharset() {
		return this.cd.charset();
	}

	public void mark(int readAheadLimit) throws IOException {
		throw new IOException("mark/reset not supported.");
	}

	public boolean markSupported() {
		return false;
	}

	public int read() throws IOException {
		// read the first UTF-16 character
		char[] ch = new char[1];

		int i = this.read(ch, 0, 1);
		if (i < 0)
			return i;

		// if this is not a high surrogate,
		// it must be a character which doesn't need one
		if (!Character.isHighSurrogate(ch[0]))
			return ch[0];

		// save the high surrogate and read the low surrogate
		char high = ch[0];
		i = this.read(ch, 0, 1);
		if (i < 0)
			return i;

		// combine the two and return the resulting code point
		return Character.toCodePoint(high, ch[0]);
	}

	public int read(char[] cbuf) throws IOException {
		return this.read(cbuf, 0, cbuf.length);
	}

	public int read(char[] cbuf, int off, int len) throws IOException {
		CharBuffer cb = CharBuffer.wrap(cbuf, off, len);
		return this.read(cb);
	}

	public int read(CharBuffer cb) throws IOException {
		int len = cb.remaining();
		boolean notEof = true;
		boolean forceRead = false;

		while (cb.remaining() > 0 && notEof) {
			notEof = this.ensureBbuf(forceRead);
			CoderResult r = this.cd.decode(this.bbuf, cb, !notEof);
			forceRead = CoderResult.UNDERFLOW == r;

			if (r.isMalformed())
				throw new RACFMalformedInputException(this.bbuf.position(), (char) this.bbuf.get(this.bbuf.position()),
						this.cd.charset().name());
			else if (r.isUnmappable())
				// a situation exactly like this is in DecodingReader too
				Debug.assertTrue(false);
		}
		if (cb.remaining() == len)
			return -1;
		else
			return len - cb.remaining();
	}

	public boolean ready() throws IOException {
		return this.stream.available() != 0 || this.bbuf.remaining() != 0;
	}

	public void reset() throws IOException {
		throw new IOException("reset/mark not supported.");
	}

	/**
	 * Change the Charset used to decode bytes from the input stream into
	 * characters.
	 */
	public void setCharset(Charset cs) {
		this.cd = cs.newDecoder();
		this.ce = cs.newEncoder();
	}

	/**
	 * Skips 'n' characters, or as many as can be read off the stream before its
	 * end.
	 *
	 * Returns the number of characters actually skipped
	 */

	public long skip(long n) throws IOException {
		char[] cbuf = new char[(int) Math.min(4096, n)];
		long m = n;

		while (m > 0) {
			int r = this.read(cbuf, 0, (int) Math.min(cbuf.length, m));

			if (r < 0)
				return n - m;

			m += Math.min(cbuf.length, m);
		}

		return n;
	}

	public void unread(char[] cbuf) throws IOException {
		this.unread(cbuf, 0, cbuf.length);
	}

	/**
	 * Unread the character array into the reader.
	 *
	 * Decodes the characters in the array into bytes, allowing the encoding to
	 * be changed before reading from the stream again, using a different
	 * charset.
	 */

	public void unread(char[] cbuf, int off, int len) throws IOException {

		ByteBuffer tb = // temp buffer
				this.ce.encode(CharBuffer.wrap(cbuf, off, len));

		if (tb.limit() > this.bbuf.position()) {
			// unread bbuf into the pushback input stream
			// in order to free up space for the content of 'tb'
			for (int i = this.bbuf.limit(); i-- > this.bbuf.position();)
				this.stream.unread(this.bbuf.get(i));

			this.bbuf.clear();
			this.ce.encode(CharBuffer.wrap(cbuf, off, len), this.bbuf, true);
			this.bbuf.flip();
		} else {
			// Don't unread bbuf, since tb will fit in front of the
			// existing data
			int j = this.bbuf.position() - 1;
			for (int i = tb.limit(); i-- > 0; j--) // two-counter loop
				this.bbuf.put(j, tb.get(i));

			this.bbuf.position(j + 1);
		}
	}

	/**
	 * Unread a single code point.
	 *
	 * Decomposes the code point into UTF-16 surrogate pairs and unreads them
	 * using the char[] unreader function.
	 *
	 */

	public void unread(int c) throws IOException {
		char[] ch = Character.toChars(c);
		this.unread(ch, 0, ch.length);
	}

}