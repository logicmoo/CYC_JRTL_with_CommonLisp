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

import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public class SubLOutputTextStreamImpl extends AbstractSubLTextStream implements SubLOutputTextStream, CommonSymbols {

	//// Constructors

	private OutputStream outStream;

	private OutputStreamWriter outWriter;

	private Writer bufferedWriter;

	private boolean freshLine = true;

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl as a text output
	 * stream.
	 */
	SubLOutputTextStreamImpl(int initialByteSizeForString) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.APPEND_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
		this.outStream = new ByteArrayOutputStream(initialByteSizeForString);
		this.outWriter = new OutputStreamWriter(this.outStream, SubLStream.DEFAULT_CHARSET);
		this.bufferedWriter = this.outWriter;// new BufferedWriter(outWriter);
												// //@note
		// this is probably inefficient in this case
		// -APB
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLOutputTextStreamImpl(OutputStream outStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.outStream = outStream;
		this.outWriter = new OutputStreamWriter(outStream, SubLStream.DEFAULT_CHARSET);
		this.bufferedWriter = this.outWriter;// = new BufferedWriter(outWriter);
	}

	// /** Method created to avoid casting */
	// public SubLOutputBinaryStream toOutputBinaryStream() {
	// return this;
	// }

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLOutputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, ifExists, ifNotExists);
	}

	public synchronized void close() {
		if (this.isClosed())
			return;
		super.close();
		try {
			if (this.bufferedWriter != null) {
				try {
					this.bufferedWriter.flush();
				} catch (Exception e) {
				} // ignore
				this.bufferedWriter.close();
				this.outStream = null;
				this.outWriter = null;
				this.bufferedWriter = null;
			}
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.close();
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	// @todo create appropriate hashcode!!!!!!!!!!!!!!

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof SubLOutputTextStreamImpl))
			return false;
		SubLOutputTextStreamImpl imp2 = (SubLOutputTextStreamImpl) obj;
		return this.outStream == imp2.outStream;
	}

	public void flush() {
		this.ensureOpen("FLUSH");
		if (this.shouldParentDoWork()) {
			super.flush();
			return;
		}
		try {
			this.bufferedWriter.flush();
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public boolean freshLine() {
		return this.freshLine;
	}

	/**
	 * Creates a new instance of SubLOutputBinaryStreamImpl.
	 */
	/*
	 * SubLOutputTextStreamImpl(FileDescriptor fileDesc, SubLSymbol elementType,
	 * SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
	 * super(elementType, direction, ifExists, ifNotExists); this.outStream =
	 * new FileOutputStream(fileDesc); outWriter = new
	 * OutputStreamWriter(outStream, DEFAULT_CHARSET); bufferedWriter =
	 * outWriter;//= new BufferedWriter(outWriter); }
	 */

	//// Public Area

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	public String getStringOutput() {
		if (!this.isStringOutputStream())
			Errors.error("Can't get the stream string output for non-string streams.");
		this.ensureOpen("GET-STRING-OUTPUT");
		ByteArrayOutputStream byteStream = (ByteArrayOutputStream) this.outStream;
		try {
			this.flush();
			String result = byteStream.toString(SubLStream.DEFAULT_CHARSET.name());
			byteStream.reset();
			return result;
		} catch (Exception e) {
			return Errors.error("Unsupported charset: " + SubLStream.DEFAULT_CHARSET, e).getString();
		}
	}

	public boolean isStringOutputStream() {
		return this.outStream != null && this.outStream instanceof ByteArrayOutputStream;
	}

	/** Method created to avoid casting */
	public SubLOutputStream toOutputStream() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLOutputTextStream toOutputTextStream() {
		return this;
	}

	public void write(byte[] b) {
		this.ensureOpen("WRITE");
		if (this.shouldParentDoWork())
			super.write(b);
		else
			try {
				this.outStream.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void write(byte[] b, int off, int len) {
		this.ensureOpen("WRITE");
		if (this.shouldParentDoWork())
			super.write(b, off, len);
		else
			try {
				this.outStream.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void write(int b) {
		this.ensureOpen("WRITE");
		if (this.shouldParentDoWork())
			super.write(b);
		else
			try {
				this.outStream.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.write(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeChar(char b) {
		this.ensureOpen("WRITE-CHAR");
		if (this.shouldParentDoWork())
			super.write(b);
		else
			try {
				this.bufferedWriter.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.writeChar(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeChar(char[] b) {
		this.ensureOpen("WRITE-CHAR");
		if (this.shouldParentDoWork())
			super.writeChar(b);
		else
			try {
				this.bufferedWriter.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.writeChar(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public void writeChar(char[] b, int off, int len) {
		this.ensureOpen("WRITE-CHAR");
		if (this.shouldParentDoWork())
			super.writeChar(b, off, len);
		else
			try {
				this.bufferedWriter.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeChar(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeNewline() {
		this.writeString(this.getNewline());
		this.freshLine = true;
	}

	public void writeString(String str) {
		this.ensureOpen("WRITE-STRING");
		if (this.shouldParentDoWork())
			super.write(str);
		else
			try {
				this.bufferedWriter.write(str);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < str.length())
					this.writeString(str, ioe.bytesTransferred, str.length() - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeString(String str, int off, int len) {
		this.ensureOpen("WRITE-STRING");
		if (this.shouldParentDoWork())
			super.write(str, off, len);
		else
			try {
				this.bufferedWriter.write(str, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeString(str, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	//// Main

}
