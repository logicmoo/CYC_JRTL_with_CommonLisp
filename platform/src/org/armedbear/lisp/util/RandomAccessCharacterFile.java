/*
 * RandomAccessCharacterFile.java
 *
 * Copyright (C) 2008 Hideo at Yokohama
 * Copyright (C) 2008-2009 Erik Huelsmann
 * $Id: RandomAccessCharacterFile.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Debug;

public class RandomAccessCharacterFile {

	private class RandomAccessInputStream extends PushbackInputStream {

		private byte[] read_buf = new byte[1];

		public RandomAccessInputStream() {
			super(null);
		}

		public int available() throws IOException {
			return (int) (RandomAccessCharacterFile.this.length() - RandomAccessCharacterFile.this.position());
		}

		public void close() throws IOException {
			RandomAccessCharacterFile.this.close();
		}

		public synchronized void mark(int readlimit) {
		}

		public boolean markSupported() {
			return false;
		}

		public int read() throws IOException {
			int len = this.read(this.read_buf);
			if (len == 1)
				// byte is signed, char is unsigned, int is signed.
				// buf can hold 0xff, we want it as 0xff in int, not -1.
				return 0xff & this.read_buf[0];
			else
				return -1;
		}

		public int read(byte[] b) throws IOException {
			return this.read(b, 0, b.length);
		}

		public int read(byte[] b, int off, int len) throws IOException {
			return RandomAccessCharacterFile.this.read(b, off, len);
		}

		public synchronized void reset() throws IOException {
			throw new IOException("Operation not supported");
		}

		public long skip(long n) throws IOException {
			RandomAccessCharacterFile.this.position(RandomAccessCharacterFile.this.position() + n);
			return n;
		}

		public void unread(byte[] b) throws IOException {
			this.unread(b, 0, b.length);
		}

		public void unread(byte[] b, int off, int len) throws IOException {
			for (int i = 0; i < len; i++)
				this.unread(b[off + i]);
		}

		public void unread(int b) throws IOException {
			RandomAccessCharacterFile.this.unreadByte((byte) b);
		}
	}

	private class RandomAccessOutputStream extends OutputStream {

		private byte[] buf = new byte[1];

		RandomAccessOutputStream() {
		}

		public void close() throws IOException {
			RandomAccessCharacterFile.this.close();
		}

		public void flush() throws IOException {
			RandomAccessCharacterFile.this.flush();
		}

		public void write(byte[] b) throws IOException {
			RandomAccessCharacterFile.this.write(b, 0, b.length);
		}

		public void write(byte[] b, int off, int len) throws IOException {
			RandomAccessCharacterFile.this.write(b, off, len);
		}

		public void write(int b) throws IOException {
			this.buf[0] = (byte) b;
			RandomAccessCharacterFile.this.write(this.buf, 0, 1);
		}
	}

	private class RandomAccessReader extends PushbackReader {

		private char[] read_buf = new char[1];

		RandomAccessReader() {
			// because we override all methods of Pushbackreader,
			// staticReader will never be referenced
			super(RandomAccessCharacterFile.staticReader);
		}

		public void close() throws IOException {
			RandomAccessCharacterFile.this.close();
		}

		public int read() throws IOException {
			int n = this.read(this.read_buf);

			if (n == 1)
				return this.read_buf[0];
			else
				return -1;
			// ### BUG: 'int read()' is to return a codepoint!
			// not the half of a surrogate pair!
		}

		public int read(char[] cbuf) throws IOException {
			return RandomAccessCharacterFile.this.read(cbuf, 0, cbuf.length);
		}

		public int read(char[] cb, int off, int len) throws IOException {
			return RandomAccessCharacterFile.this.read(cb, off, len);
		}

		public int read(CharBuffer target) throws IOException {
			// FIXME: to be implemented
			throw new IOException("Not implemented");
		}

		public boolean ready() throws IOException {
			return true;
		}

		public void unread(char[] cbuf) throws IOException {
			this.unread(cbuf, 0, cbuf.length);
		}

		public void unread(char[] cbuf, int off, int len) throws IOException {
			for (int i = 0; i < len; i++)
				this.unread(cbuf[off + i]);
		}

		public void unread(int c) throws IOException {
			RandomAccessCharacterFile.this.unreadChar((char) c);
		}
	}

	private class RandomAccessWriter extends Writer {

		RandomAccessWriter() {
		}

		public void close() throws IOException {
			RandomAccessCharacterFile.this.close();
		}

		public void flush() throws IOException {
			RandomAccessCharacterFile.this.flush();
		}

		public void write(char[] cb, int off, int len) throws IOException {
			RandomAccessCharacterFile.this.write(cb, off, len);
		}

	}

	// dummy reader which we need to call the Pushback constructor
	// because a null value won't work
	static Reader staticReader = new StringReader("");

	static int BUFSIZ = 4 * 1024; // setting this to a small value like 8 is
									// helpful for testing.

	private RandomAccessWriter writer;
	private RandomAccessReader reader;
	private RandomAccessInputStream inputStream;
	private RandomAccessOutputStream outputStream;
	private FileChannel fcn;

	private Charset cset;
	private CharsetEncoder cenc;
	private CharsetDecoder cdec;

	/**
	 * bbuf is treated as a cache of the file content. If it points to somewhere
	 * in the middle of the file, it holds the copy of the file content, even
	 * when you are writing a large chunk of data. If you write in the middle of
	 * a file, bbuf first gets filled with contents of the data, and only after
	 * that any new data is written on bbuf. The exception is when you are
	 * appending data at the end of the file.
	 */
	private ByteBuffer bbuf;
	private boolean bbufIsDirty; /*
									 * whether bbuf holds data that must be
									 * written.
									 */
	private boolean bbufIsReadable; /*
									 * whether bbuf.remaining() contains
									 * readable content.
									 */
	private long bbufpos; /*
							 * where the beginning of bbuf is pointing in the
							 * file now.
							 */

	// a method corresponding to the good ol' ungetc in C.
	// This function may fail when using (combined) character codes that use
	// escape sequences to switch between sub-codes.
	// ASCII, ISO-8859 series, any 8bit code are OK, all unicode variations are
	// OK,
	// but applications of the ISO-2022 encoding framework can have trouble.
	// Example of such code is ISO-2022-JP which is used in Japanese e-mail.
	private CharBuffer singleCharBuf;

	private ByteBuffer shortByteBuf;

	public RandomAccessCharacterFile(RandomAccessFile raf, String encoding) throws IOException {

		this.fcn = raf.getChannel();

		this.setEncoding(encoding);
		this.bbuf = ByteBuffer.allocate(RandomAccessCharacterFile.BUFSIZ);

		// there is no readable data available in the buffers.
		this.bbuf.flip();

		// there is no write pending data in the buffers.
		this.bbufIsDirty = false;

		this.bbufIsReadable = false;

		this.bbufpos = this.fcn.position();

		this.reader = new RandomAccessReader();
		this.writer = new RandomAccessWriter();
		this.inputStream = new RandomAccessInputStream();
		this.outputStream = new RandomAccessOutputStream();
	}

	public void close() throws IOException {
		this.internalFlush(true);
		this.fcn.close();
	}

	private void encodeAndWrite(CharBuffer cbuf, boolean flush, boolean endOfFile) throws IOException {
		while (cbuf.remaining() > 0) {
			CoderResult r = this.cenc.encode(cbuf, this.bbuf, endOfFile);
			this.bbufIsDirty = true;
			if (CoderResult.OVERFLOW == r || this.bbuf.remaining() == 0) {
				this.flushBbuf(false);
				this.bbuf.clear();
			}
			if (r.isUnmappable())
				throw new RACFUnmappableCharacterException(cbuf.position(), cbuf.charAt(cbuf.position()),
						this.cset.name());
			if (r.isMalformed())
				// We don't really expect Malformed, but not handling it
				// will cause an infinite loop if we don't...
				throw new RACFMalformedInputException(cbuf.position(), cbuf.charAt(cbuf.position()), this.cset.name());
		}
		if (this.bbuf.position() > 0 && this.bbufIsDirty && flush)
			this.flushBbuf(false);
	}

	private boolean ensureReadBbuf(boolean force) throws IOException {
		boolean bufReady = true;

		if (this.bbuf.remaining() == 0 || force || !this.bbufIsReadable) {
			// need to read from the file.

			if (this.bbufIsDirty) {
				this.bbuf.flip();
				this.fcn.position(this.bbufpos);
				this.fcn.write(this.bbuf);
				this.bbufpos += this.bbuf.position();
				this.bbuf.clear();
			} else {
				int bbufEnd = this.bbufIsReadable ? this.bbuf.limit() : this.bbuf.position();
				this.fcn.position(this.bbufpos + bbufEnd);
				this.bbufpos += this.bbuf.position();
				this.bbuf.compact();
			}

			bufReady = this.fcn.read(this.bbuf) != -1;
			this.bbuf.flip();
			this.bbufIsReadable = true;
		}

		return bufReady;
	}

	public void flush() throws IOException {
		this.internalFlush(false);
	}

	private void flushBbuf(boolean commitOnly) throws IOException {
		if (!this.bbufIsDirty)
			return;

		this.fcn.position(this.bbufpos);

		// if the buffer is dirty, the modifications have to be
		// before position(): before re-positioning, this.position()
		// calls this function.
		if (commitOnly || this.bbufIsReadable) {
			ByteBuffer dup = this.bbuf.duplicate();
			dup.flip();
			this.fcn.write(dup);
			return;
		}
		this.bbuf.flip();
		this.fcn.write(this.bbuf);

		this.bbufpos += this.bbuf.position();
		this.bbuf.clear();
		this.bbuf.flip(); // there's no useable data in this buffer
		this.bbufIsDirty = false;
		this.bbufIsReadable = false;
	}

	public PushbackInputStream getInputStream() {
		return this.inputStream;
	}

	public OutputStream getOutputStream() {
		return this.outputStream;
	}

	public PushbackReader getReader() {
		return this.reader;
	}

	public Writer getWriter() {
		return this.writer;
	}

	private void internalFlush(boolean endOfFile) throws IOException {
		if (endOfFile) {
			CharBuffer cbuf = CharBuffer.allocate(0);
			this.encodeAndWrite(cbuf, true, endOfFile);
		} else
			this.flushBbuf(false);
	}

	public long length() throws IOException {
		this.flushBbuf(false);
		return this.fcn.size();
	}

	public long position() throws IOException {
		return this.bbufpos + this.bbuf.position(); // the logical position
													// within the
		// file.
	}

	public void position(long newPosition) throws IOException {
		this.flushBbuf(true);
		long bbufend = this.bbufpos // in case bbuf is readable, its contents is
				// valid
				+ (this.bbufIsReadable ? this.bbuf.limit() : this.bbuf.position()); // beyond
		// position()
		if (newPosition >= this.bbufpos && newPosition < bbufend)
			// near seek. within existing data of bbuf.
			this.bbuf.position((int) (newPosition - this.bbufpos));
		else {
			this.fcn.position(newPosition);
			// far seek; discard the buffer (it's already cleared)
			this.bbuf.clear();
			this.bbuf.flip(); // "there is no useful data on this buffer yet."
			this.bbufpos = newPosition;
		}
	}

	public int read(byte[] b, int off, int len) throws IOException {
		int pos = off;
		boolean atEof = false;
		while (pos - off < len && !atEof) {

			atEof = !this.ensureReadBbuf(false);
			int want = len - pos;
			if (want > this.bbuf.remaining())
				want = this.bbuf.remaining();
			this.bbuf.get(b, pos, want);
			pos += want;
		}
		return pos - off;
	}

	int read(char[] cb, int off, int len) throws IOException {
		CharBuffer cbuf = CharBuffer.wrap(cb, off, len);
		boolean decodeWasUnderflow = false;
		boolean atEof = false;
		while (cbuf.remaining() > 0 && !atEof) {

			atEof = !this.ensureReadBbuf(decodeWasUnderflow);
			CoderResult r = this.cdec.decode(this.bbuf, cbuf, atEof);
			decodeWasUnderflow = CoderResult.UNDERFLOW == r;
			if (r.isMalformed())
				// When reading encoded Unicode, we'd expect to require
				// catching MalformedInput
				throw new RACFMalformedInputException(this.bbuf.position(), (char) this.bbuf.get(this.bbuf.position()),
						this.cset.name());
			if (r.isUnmappable())
				// Since we're mapping TO unicode, we'd expect to be able
				// to map all characters
				Debug.assertTrue(false);
			// OVERFLOW is a normal condition:
			// it's equal to cbuf.remaining() == 0
			// ### EHU: really??? EXACTLY equal??
		}
		if (cbuf.remaining() == len)
			return -1;
		else
			return len - cbuf.remaining();
	}

	public void setEncoding(String encoding) {
		this.cset = encoding == null ? Charset.defaultCharset() : Charset.forName(encoding);
		this.cdec = this.cset.newDecoder();
		this.cdec.onMalformedInput(CodingErrorAction.REPLACE);
		this.cdec.onUnmappableCharacter(CodingErrorAction.REPLACE);
		this.cenc = this.cset.newEncoder();
	}

	public void unreadByte(byte b) throws IOException {
		long pos = this.position() - 1;
		this.position(pos);
	}

	public void unreadChar(char c) throws IOException {
		// algorithm :
		// 1. encode c into bytes, to find out how many bytes it corresponds to
		// 2. move the position backwards that many bytes.
		// ** we stop here. Don't bother to write the bytes to the buffer,
		// assuming that it is the same as the original data.
		// If we allow to write back different characters, the buffer must get
		// 'dirty'
		// but that would require read/write permissions on files you use
		// unreadChar,
		// even if you are just reading for some tokenizer.
		//
		// So we don't do the following.
		// 3. write the bytes.
		// 4. move the position back again.
		if (this.singleCharBuf == null) {
			this.singleCharBuf = CharBuffer.allocate(1);
			this.shortByteBuf = ByteBuffer.allocate((int) this.cenc.maxBytesPerChar());
		}
		this.singleCharBuf.clear();
		this.singleCharBuf.append(c);
		this.singleCharBuf.flip();
		this.shortByteBuf.clear();
		this.cenc.encode(this.singleCharBuf, this.shortByteBuf, false);
		int n = this.shortByteBuf.position();
		long pos = this.position() - n;
		this.position(pos);
	}

	void write(byte[] b, int off, int len) throws IOException {
		int pos = off;
		while (pos < off + len) {
			int want = len;
			if (want > this.bbuf.remaining())
				want = this.bbuf.remaining();
			this.bbuf.put(b, pos, want);
			pos += want;
			this.bbufIsDirty = true;
			if (this.bbuf.remaining() == 0) {
				this.flushBbuf(false);
				this.bbuf.clear();
			}
		}
	}

	void write(char[] cb, int off, int len) throws IOException {
		CharBuffer cbuf = CharBuffer.wrap(cb, off, len);
		this.encodeAndWrite(cbuf, false, false);
	}
}
