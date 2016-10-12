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

import java.io.File;
import java.io.FileDescriptor;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

//// Internal Imports

//// External Imports

public class SubLBroadcastStream extends AbstractSubLStream implements SubLOutputTextStream, SubLOutputBinaryStream {

	//// Constructors

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private SubLOutputStream[] outStreams;

	//// Public Area

	private boolean isClosed = false;

	private boolean freshLine = true;

	/** null output stream */
	SubLBroadcastStream() {
		this(null);
	}

	/**
	 * Creates a new instance of SubLBroadcastStream. Note: reuses the array
	 * passed in, do not modify externally!
	 */
	SubLBroadcastStream(SubLOutputStream[] outStreams) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
		if (outStreams == null)
			this.outStreams = new SubLOutputStream[0];
		else
			this.outStreams = outStreams;
	}

	public synchronized void close() {
		this.isClosed = true;
	}

	public void flush() {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				this.outStreams[i].flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public boolean freshLine() {
		return this.freshLine;
	}

	public FileDescriptor getFD() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	public File getFile() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	public long getFilePointer() {
		return 0;
	}

	/** Method created to avoid casting */
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	public SubLList getStreams() {
		return SubLObjectFactory.makeList(this.outStreams);
	}

	public boolean isClosed() {
		return this.isClosed;
	}

	public boolean isRandomAccess() {
		return false;
	}

	public long length() {
		return 0;
	}

	public void seek(long pos) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	public void setLength(long newLength) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	/** Method created to avoid casting */
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this;
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
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputBinaryStream) this.outStreams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void write(byte[] b, int off, int len) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputBinaryStream) this.outStreams[i]).write(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void write(int b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputBinaryStream) this.outStreams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeChar(char b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputTextStream) this.outStreams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeChar(char[] b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputTextStream) this.outStreams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public void writeChar(char[] b, int off, int len) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputTextStream) this.outStreams[i]).writeChar(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeNewline() {
		this.writeString(this.getNewline());
		this.freshLine = true;
	}
	@Override
	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				outStreams[i].writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public void writeString(String str) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputTextStream) this.outStreams[i]).writeString(str);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	//// Main

	public void writeString(String str, int off, int len) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; i++)
				((SubLOutputTextStream) this.outStreams[i]).writeString(str, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

}
