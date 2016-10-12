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
import java.io.InputStream;
import java.io.PushbackInputStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

//// Internal Imports

public class SubLInputBinaryStreamImpl extends AbstractSubLBinaryStream
		implements SubLInputBinaryStream, CommonSymbols {

	//// Constructors

	private InputStream inStream;

	private BufferedInputStream bufferedInStream;

	private PushbackInputStream pushbackInputStream;

	//// Public Area

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInputBinaryStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.INPUT_KEYWORD, ifExists, ifNotExists);
		this.inStream = new FileInputStream(fileDesc);
		this.bufferedInStream = new BufferedInputStream(this.inStream);
		this.pushbackInputStream = new PushbackInputStream(this.bufferedInStream);
		this.init();
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInputBinaryStreamImpl(InputStream inStream) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.inStream = inStream;
		// this.bufferedInStream = new BufferedInputStream(inStream);
		this.pushbackInputStream = new PushbackInputStream(inStream/* bufferedInStream */);
		this.init();
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInputBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.BINARY_KEYWORD, CommonSymbols.INPUT_KEYWORD, ifExists, ifNotExists);
		this.init();
	}

	public synchronized void close() {
		if (this.isClosed())
			return;
		super.close();
		try {
			if (this.pushbackInputStream != null) {
				this.pushbackInputStream.close();
				this.inStream = null;
				this.bufferedInStream = null;
				this.pushbackInputStream = null;
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	private void init() {
		if (this.isRandomAccess())
			return;

	}

	public long numBytesAvailable() {
		if (this.isClosed())
			return 0L;
		if (this.isRandomAccess())
			return super.numBytesAvailable();
		try {
			return this.pushbackInputStream.available();
		} catch (Exception e) {
			Errors.error("Unable to get available bytes for stream.", e);
			return -1L;
		}
	}

	public int read() {
		this.ensureOpen("READ-CHAR");
		if (this.shouldParentDoWork())
			return super.read();
		return this.readInternal();
	}

	public int read(byte[] b) { // @note make this interruptable
		if (this.isRandomAccess())
			return super.read(b);
		this.ensureOpen("READ");
		try {
			int result = this.pushbackInputStream.read(b);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to read character from stream.", e);
			return -1;
		}
	}

	public int read(byte[] b, int off, int len) {// @note make this
													// interruptable
		if (this.isRandomAccess())
			return super.read(b, off, len);
		this.ensureOpen("READ");
		try {
			int result = this.pushbackInputStream.read(b, off, len);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to read character from stream.", e);
			return -1;
		}
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
				curChar = this.readInternal();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		else
		for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
			curChar = this.readInternal();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
			result |= curChar << i;
		}
		return result;
	}

	public int readByteSequenceToString(SubLString str) {
		try {
		if (this.shouldParentDoWork())
			return super.readByteSequenceToString(str);
			this.ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
		int curChar = 1;
		for (int i = 0, size = str.size(); i < size; i++) { // @todo this is
															// pretty
															// inefficient
			curChar = this.readInternal();
			if (curChar == -1)
				return -1;
				str.setInternal(i, (char) curChar);
		}
		return curChar;
		} finally {
			str.setMutated();
		}
	}

	private int readInternal() {
		boolean ready = false;
		while (true) {
			try {
				ready = this.pushbackInputStream.available() > 0;
			} catch (Exception e) {
				Errors.error("Unable to read character from stream: " + this, e);
			}
			// @todo this function should be fixed to be nearly the same as
			// SubLInputTextStreamImpl.readChar()
			if (ready)
				try {
					int result = this.pushbackInputStream.read();
					if (result >= 0)
						this.incrementInputIndex(1); // @hack should be width of
					// character when we support UTF
					// 8
					return result;
				} catch (java.net.SocketTimeoutException ste) {
					Threads.possiblyHandleInterrupts(false);
				} catch (Exception e) {
					Errors.error("Unable to read character from stream: " + this, e);
				}
			else {
				if (this.isClosed())
					return streams_high.EOF_CHAR;
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

	//// Protected Area

	//// Private Area

	public long skip(long n) {
		if (this.isRandomAccess())
			return super.skip(n);
		this.ensureOpen("SKIP");
		try {
			long result = this.pushbackInputStream.skip(n);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to skip characters.", e);
			return -1L;
		}
	}

	//// Internal Rep

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() {
		return this;
	}

	public void unread(int c) {
		if (this.isRandomAccess()) {
			super.unread(c);
			return;
		}
		this.ensureOpen("UNREAD");
		try {
			this.pushbackInputStream.unread(c);
		} catch (Exception e) {
			Errors.error("Unable to unread character from stream.", e);
		}
	}

	//// Main

}
