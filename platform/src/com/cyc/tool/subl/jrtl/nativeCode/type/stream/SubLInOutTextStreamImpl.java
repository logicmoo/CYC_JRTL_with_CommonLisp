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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLInOutTextStreamImpl extends AbstractSubLTextStream
		implements SubLInOutTextStream, SubLOutputTextStream, SubLInputTextStream, CommonSymbols {

	//// Constructors

	protected SubLInputTextStream inStream;

	protected SubLOutputTextStream outStream;

	private boolean freshLine;

	protected SubLInOutTextStreamImpl() {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.IO_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.freshLine = false;
	}

	//// Public Area

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInOutTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.IO_KEYWORD, ifExists, ifNotExists);
		this.freshLine = false;
	}

	/**
	 * Creates a new instance of SubLInputBinaryStreamImpl.
	 */
	SubLInOutTextStreamImpl(SubLInputTextStream inStream, SubLOutputTextStream outStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.IO_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.freshLine = false;
		this.inStream = inStream;
		this.outStream = outStream;
		if (inStream == null || outStream == null)
			Errors.error("Unable to create in/out stream.");
	}

	public synchronized void close() {
		this.ensureOpen("close");
		if (this.shouldParentDoWork()) {
			super.close();
			return;
		}
		if (this.isClosed())
			return;
		super.close();
		try {
			try {
				if (this.outStream != null)
					this.outStream.close();
			} finally {
				if (this.inStream != null)
					this.inStream.close();
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	public void flush() {
		this.ensureOpen("flush");
		if (this.shouldParentDoWork()) {
			super.flush();
			return;
		}
		this.toOutputTextStream().flush();
	}

	public boolean freshLine() {
		if (this.shouldParentDoWork())
			return this.freshLine;
		return this.toOutputTextStream().freshLine();
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		this.ensureOpen("readByteSequenceToString");
		if (shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		return toInputBinaryStream().getStream(true).toInputBinaryStream()
				.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
	}

	public int readByteSequenceToString(SubLString str) {
		this.ensureOpen("readByteSequenceToString");
		if (this.shouldParentDoWork())
			return super.readByteSequenceToString(str);
		return this.toInputBinaryStream().readByteSequenceToString(str);
	}

	public int readChar() {
		this.ensureOpen("readChar");
		if (this.shouldParentDoWork())
			return super.readChar();
		return this.toInputTextStream().readChar();
	}

	public int readChar(char[] b) {
		this.ensureOpen("readChar");
		if (this.shouldParentDoWork())
			return super.readChar(b);
		return this.toInputTextStream().readChar(b);
	}

	public int readChar(char[] b, int off, int len) {
		this.ensureOpen("readChar");
		if (this.shouldParentDoWork())
			return super.readChar(b, off, len);
		return this.toInputTextStream().readChar(b, off, len);
	}

	public boolean ready() {
		this.ensureOpen("ready");
		if (this.shouldParentDoWork())
			return super.ready();
		return this.toInputTextStream().ready();
	}

	public long skip(long n) {
		this.ensureOpen("skip");
		if (this.shouldParentDoWork())
			return super.skip(n);
		return this.toInputTextStream().skip(n);
	}

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.inStream;
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.inStream;
	}

	/** Method created to avoid casting */
	public SubLInputTextStream toInputTextStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.inStream;
	}

	/** Method created to avoid casting */
	public SubLOutputBinaryStream toOutputBinaryStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.outStream;
	}

	/** Method created to avoid casting */
	public SubLOutputStream toOutputStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.outStream;
	}

	/** Method created to avoid casting */
	public SubLOutputTextStream toOutputTextStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.outStream;
	}

	public void unread(int c) {
		this.ensureOpen("unread");
		if (this.shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		this.toInputTextStream().unread(c);
	}

	public void writeChar(char b) {
		this.ensureOpen("writeChar");
		if (this.shouldParentDoWork()) {
			super.writeChar(b);
			return;
		}
		this.toOutputTextStream().writeChar(b);
	}

	public void writeChar(char[] b) {
		this.ensureOpen("writeChar");
		if (this.shouldParentDoWork()) {
			super.writeChar(b);
			return;
		}
		this.toOutputTextStream().writeChar(b);
	}

	public void writeChar(char[] b, int off, int len) {
		this.ensureOpen("writeChar");
		if (this.shouldParentDoWork()) {
			super.writeChar(b, off, len);
			return;
		}
		this.toOutputTextStream().writeChar(b, off, len);
	}

	public void writeNewline() {
		if (this.shouldParentDoWork()) {
			super.write(this.getNewline());
			return;
		}
		this.toOutputTextStream().writeNewline();
	}

	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		if (this.shouldParentDoWork())
			super.writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		this.toOutputBinaryStream().writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public void writeString(String str) {
		this.ensureOpen("writeString");
		if (this.shouldParentDoWork()) {
			super.write(str);
			return;
		}
		this.toOutputTextStream().writeString(str);
	}

	public void writeString(String str, int off, int len) {
		this.ensureOpen("writeString");
		if (this.shouldParentDoWork()) {
			super.write(str, off, len);
			return;
		}
		this.toOutputTextStream().writeString(str, off, len);
	}

	//// Main

}
