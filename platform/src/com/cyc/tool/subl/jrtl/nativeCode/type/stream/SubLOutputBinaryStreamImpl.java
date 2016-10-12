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

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLOutputBinaryStreamImpl extends AbstractSubLBinaryStream
		implements SubLOutputBinaryStream, CommonSymbols {

	//// Constructors

	private OutputStream outStream;

	private BufferedOutputStream bufferedOutStream;

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLOutputBinaryStreamImpl(FileDescriptor fileDesc, SubLSymbol elementType, SubLSymbol direction,
			SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		this.outStream = new FileOutputStream(fileDesc);
		this.bufferedOutStream = new BufferedOutputStream(this.outStream);
		this.init();
	}

	//// Public Area

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLOutputBinaryStreamImpl(OutputStream outStream) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.outStream = outStream;
		this.bufferedOutStream = new BufferedOutputStream(outStream);
		this.init();
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLOutputBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, ifExists, ifNotExists);
		this.init();
	}

	public synchronized void close() {
		if (this.isClosed())
			return;
		try {
			if (this.bufferedOutStream != null) {
				try {
					this.bufferedOutStream.flush();
				} catch (Exception e) {
				} // ignore
				this.bufferedOutStream.close();
				this.outStream = null;
				this.bufferedOutStream = null;
			}
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.close();
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		} finally {
			super.close();
		}
	}

	public void flush() {
		this.ensureOpen("FLUSH");
		if (this.isRandomAccess()) {
			super.flush();
			return;
		}
		try {
			this.outStream.flush();
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	private void init() {
		if (this.isRandomAccess())
			return;

	}

	/** Method created to avoid casting */
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLOutputStream toOutputStream() {
		return this;
	}

	//// Protected Area

	//// Private Area

	public void write(byte[] b) {
		this.ensureOpen("WRITE");
		if (this.isRandomAccess()) {
			super.write(b);
			return;
		}
		try {
			this.outStream.write(b);
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			if (ioe.bytesTransferred < b.length)
				this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}

	//// Internal Rep

	public void write(byte[] b, int off, int len) {
		this.ensureOpen("WRITE");
		if (this.isRandomAccess()) {
			super.write(b, off, len);
			return;
		}
		try {
			this.outStream.write(b, off, len);
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			if (ioe.bytesTransferred < len)
				this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}

	public void write(int b) {
		this.ensureOpen("WRITE");
		if (this.isRandomAccess()) {
			super.write(b);
			return;
		}
		try {
			this.outStream.write(b);
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			if (ioe.bytesTransferred < 1)
				this.write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}

	//// Main

}
