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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLSynonymStream extends AbstractSubLStream {

	//// Constructors

	//// Internal Rep
	private SubLSymbol streamSymbol;

	//// Public Area

	/** Creates a new instance of SubLSynonymStream. */
	SubLSynonymStream(SubLSymbol streamSymbol) {
		super(CommonSymbols.TEXT_KEYWORD, streamSymbol.getValue().getStream(true).getDirection(),
				CommonSymbols.ERROR_KEYWORD, CommonSymbols.ERROR_KEYWORD);
		this.streamSymbol = streamSymbol;
	}

	public SubLSymbol getDirection() {
		return this.getStream(true).getDirection();
	}

	public SubLSymbol getElementType() {
		return this.getStream(true).getElementType();
	}

	/** throws exception if isRandomAccess() returns false */
	public FileDescriptor getFD() {
		return this.getStream(true).getFD();
	}

	public File getFile() {
		return this.getStream(true).getFile();
	}

	/** throws exception if isRandomAccess() returns false */
	public long getFilePointer() {
		return this.getStream(true).getFilePointer();
	}

	public String getNewline() {
		return this.getStream(true).getNewline();
	}

	public SubLStream getStream(boolean followSynonymStream) {
		if (!followSynonymStream)
			return this;
		try {
			SubLStream result = this.streamSymbol.getValue().getStream(true);
			while (result instanceof SubLSynonymStream)
				result = ((SubLSynonymStream) result).getStreamSymbol().getValue().getStream(true);
			return result;
		} catch (Exception e) {
			return this;
		}
	}

	public SubLSymbol getStreamSymbol() {
		return this.streamSymbol;
	}

	public SubLSymbol ifExists() {
		return this.getStream(true).ifExists();
	}

	public SubLSymbol ifNotExists() {
		return this.getStream(true).ifNotExists();
	}

	public boolean isInteractive() {
		return this.getStream(true).isInteractive();
	}

	public boolean isRandomAccess() {
		return this.getStream(true).isRandomAccess();
	}

	/** throws exception if isRandomAccess() returns false */
	public long length() {
		return this.getStream(true).length();
	}

	/** throws exception if isRandomAccess() returns false */
	public void seek(long pos) {
		this.getStream(true).seek(pos);
	}

	public void setIsInteractive(boolean newValue) {
		this.getStream(true).setIsInteractive(newValue);
	}

	/*
	 * public synchronized void close() { getStream(true).close(); }
	 *
	 * public boolean isClosed() { return getStream(true).isClosed(); }
	 */

	/** throws exception if isRandomAccess() returns false */
	public void setLength(long newLength) {
		this.getStream(true).setLength(newLength);
	}

	public void setNewline(String newline) {
		this.getStream(true).setNewline(newline);
	}

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() {
		return this.getStream(true).toInputBinaryStream();
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() {
		return this.getStream(true).toInputStream();
	}

	/** Method created to avoid casting */
	public SubLInputTextStream toInputTextStream() {
		return this.getStream(true).toInputTextStream();
	}

	/** Method created to avoid casting */
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this.getStream(true).toOutputBinaryStream();
	}

	/** Method created to avoid casting */
	public SubLOutputStream toOutputStream() {
		return this.getStream(true).toOutputStream();
	}

	//// Protected Area

	//// Private Area

	/** Method created to avoid casting */
	public SubLOutputTextStream toOutputTextStream() {
		return this.getStream(true).toOutputTextStream();
	}

	//// Main

}
