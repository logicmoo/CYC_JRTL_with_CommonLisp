/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

//// Internal Imports

//// External Imports

public class SubLInputTextStreamImpl extends AbstractSubLTextStream implements SubLInputTextStream, CommonSymbols {

	//// Constructors

	private Socket socket;

	private InputStream inStream;

	private BufferedInputStream bufferedStream;

	private PushbackInputStream pbInStream;
	// private InputStreamReader inReader;
	// private BufferedReader inBufReader;
	// private PushbackReader pushbackReader;

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInputTextStreamImpl(ByteBuffer byteBuffer) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.byteBuffer = byteBuffer;
	}

	// @hack to be compatible with Allegro/C
	SubLInputTextStreamImpl(ByteBuffer byteBuffer, int start) {
		this(byteBuffer);
		if (start > 0)
			this.setInputIndex(start);
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	public SubLInputTextStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, ifExists, ifNotExists);
		this.inStream = new FileInputStream(fileDesc);
		this.bufferedStream = new BufferedInputStream(this.inStream);
		this.pbInStream = new PushbackInputStream(this.bufferedStream);
		// inReader = new InputStreamReader(inStream, DEFAULT_CHARSET);
		// inBufReader = new BufferedReader(inReader);
		// pushbackReader = new PushbackReader(inReader);
	}

	//// Public Area

	/**
	 * Creates a new instance of SubLInputTextStreamImpl.
	 */
	SubLInputTextStreamImpl(InputStream inStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.inStream = inStream;
		this.bufferedStream = new BufferedInputStream(inStream);
		this.pbInStream = new PushbackInputStream(this.bufferedStream);
		// @todo we need to use reader for reading characters...
		// inReader = new InputStreamReader(inStream, DEFAULT_CHARSET);
		// inBufReader = new BufferedReader(inReader);
		// pushbackReader = new PushbackReader(inReader);
	}

	// @hack to be compatible with Allegro/C
	SubLInputTextStreamImpl(InputStream inStream, int start) {
		this(inStream);
		this.setInputIndex(start);
	}

	/**
	 * Creates a new instance of SubLInputTextStreamImpl.
	 */
	SubLInputTextStreamImpl(Socket socket) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.socket = socket;
		try {
			this.inStream = socket.getInputStream();
		} catch (IOException ioe) {
			Errors.error("Unable to open stream for socket; " + socket, ioe);
		}
		this.bufferedStream = new BufferedInputStream(this.inStream);
		this.pbInStream = new PushbackInputStream(this.bufferedStream);
		// @todo we need to use reader for reading characters...
		// inReader = new InputStreamReader(inStream, DEFAULT_CHARSET);
		// inBufReader = new BufferedReader(inReader);
		// pushbackReader = new PushbackReader(inReader);
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, ifExists, ifNotExists);
	}

	public synchronized void close() {
		if (this.isClosed())
			return;
		super.close();
		try {
			if (this.pbInStream != null) {
				this.pbInStream.close();
				this.inStream = null;
				this.bufferedStream = null;
				this.pbInStream = null;
			}
			/*
			 * if (pushbackReader != null) { pushbackReader.close(); inStream =
			 * null; inReader = null; pushbackReader = null; }
			 */
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	private boolean isSocketConnectionDead() {
		if (this.socket == null)
			return false;
		try { // deal with connection being closed by client or network
				// gracefully
			this.socket.sendUrgentData(32);
		} catch (Exception ex) {
			return true;
		}
		return false;
	}

	public int read() {
		if (this.shouldParentDoWork())
			return super.read();
		this.ensureOpen("READ");
		if (this.socket != null)
			return this.socketRead();
		boolean ready = false;
		while (true) {
			if (this.isClosed())
				return streams_high.EOF_CHAR;
			try {
				ready = this.pbInStream.available() > 0;
			} catch (Exception e) {
				return streams_high.EOF_CHAR;
			}
			if (ready)
				try {
					int result = this.pbInStream.read();
					if (result >= 0)
						this.incrementInputIndex(1); // @hack should be width of
					// character when we support UTF
					// 8
					return result;
				} catch (Exception e) {
					Errors.error("Unable to read character from stream: " + this, e);
				}
			else {
				try {
					Threads.possiblyHandleInterrupts(true);
					Thread.currentThread();
					Thread.sleep(5);
				} catch (InterruptedException ie) {
					Threads.possiblyHandleInterrupts(false);
				}
				if (this.isClosed())
					return streams_high.EOF_CHAR;
			}
		}
	}

	public int read(byte[] b) { // @note make this interruptable
		// @todo copy implementation from BinaryStreams
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
		return -1;
	}

	public int read(byte[] b, int off, int len) {// @note make this
													// interruptable
		// @todo copy implementation from BinaryStreams
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[], off, len)");
		return -1;
	}

	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		if (this.shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		this.ensureOpen("READ-BYTES-SEQUENCE-TO-POSITIVE-INTEGER");
		if (bytesInInteger > 8 || bytesInInteger < 0)
			Errors.error("Bytes in integer is too large: " + bytesInInteger);
		long result = 0L;
		long curChar = -1L;
		if (useNetworkByteOrder)
			for (int i = (bytesInInteger - 1) * 8; i >= 0; i -= 8) {
				curChar = this.read();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		else
		for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
			curChar = this.read();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
			result |= curChar << i;
		}
		return result;
	}

	public int readByteSequenceToString(SubLString str) {
		if (this.shouldParentDoWork())
			return super.readByteSequenceToString(str);
		int curChar = 1;
		this.ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
		for (int i = 0, size = str.size(); i < size; ++i) {
			curChar = this.read();
			if (curChar == -1)
				// EOF
				return -1;
			str.set(i, (char) curChar);
		}
		return curChar;
	}

	public int readChar() {
		return this.read(); // @hack once we support unicode this won't be
							// sufficient
		/*
		 * ensureOpen("READ-CHAR"); if (shouldParentDoWork()) { return
		 * super.read(); } boolean ready = false; while (true) { try { ready =
		 * pushbackReader.ready(); } catch (Exception e) {
		 * Errors.error("Unable to read character from stream: " + this, e); }
		 * if (ready || (socket != null)) { try { int result =
		 * pushbackReader.read(); char result_char = (char)result; if (result >=
		 * 0) { incrementInputIndex(1); //@hack should be width of character
		 * when we support UTF 8 } return result; } catch
		 * (java.net.SocketTimeoutException ste) {
		 * Threads.possiblyHandleInterrupts(false); } catch (Exception e) {
		 * Errors.error("Unable to read character from stream: " + this, e); } }
		 * else { if (isClosed()) { return streams_high.EOF_CHAR; } try {
		 * Threads.possiblyHandleInterrupts(true);
		 * Thread.currentThread().sleep(5); } catch (InterruptedException ie) {
		 * Threads.possiblyHandleInterrupts(false); } if (isClosed()) { return
		 * streams_high.EOF_CHAR; } } }
		 */
	}

	public int readChar(char[] b) {
		this.ensureOpen("READ-CHAR");
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
		return -1;
		/*
		 * if (shouldParentDoWork()) { return super.readChar(b); } try {
		 * // @note this needs to be interruptable -- see read() int result =
		 * pbInStream.read(b); if (result >= 0) { incrementInputIndex(result); }
		 * return result; } catch (Exception e) {
		 * Errors.error("Unable to read character from stream.", e); }
		 */
	}

	public int readChar(char[] b, int off, int len) {
		// @todo this should be made much more efficient by
		// using the array read on streams
		int curChar = -1;
		int i = off;
		for (int size = off + len; i < size; i++) {
			curChar = this.read();
			if (curChar == streams_high.EOF_CHAR)
				break;
			b[i] = (char) curChar;
		}
		return i;
	}

	public boolean ready() {
		if (this.shouldParentDoWork())
			return super.ready();
		this.ensureOpen("READY");
		try {
			return this.pbInStream.available() > 0;
		} catch (Exception e) {
			Errors.error("Error on stream: " + this);
			return false;
		}
	}

	public long skip(long n) {
		if (this.shouldParentDoWork())
			return super.skip(n);
		this.ensureOpen("SKIP");
		try {
			long result = this.pbInStream.skip(n);
			if (result >= 0L)
				this.incrementInputIndex(result);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to skip characters.", e);
			return -1L;
		}
	}

	private int socketRead() {
		while (true) {
			if (this.isClosed())
				return streams_high.EOF_CHAR;
			try {
				int curByte = this.pbInStream.read();
				if (curByte >= 0)
					this.incrementInputIndex(1); // @hack should be width of
				// character when we support UTF 8
				return curByte;
			} catch (SocketTimeoutException ste) {
				Threads.possiblyHandleInterrupts(true);
			} catch (IOException ioe) { // probably the client died...
				return streams_high.EOF_CHAR;
			} catch (Exception e) {
				Errors.error("Unable to read character from stream: " + this, e);
			}
		}
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLInputTextStream toInputTextStream() {
		return this;
	}

	public void unread(int c) {
		if (this.shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		this.ensureOpen("UNREAD");
		try {
			this.pbInStream.unread(c);
			this.incrementInputIndex(-1L);
		} catch (Exception e) {
			Errors.error("Unable to unread character from stream.", e);
		}
	}

	//// Main

}
