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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public abstract class AbstractSubLStream extends AbstractSubLObject implements SubLStream {

	protected SubLSymbol elementType;

	//// Constructors

	protected SubLSymbol direction;

	//// Public Area

	protected SubLSymbol ifExists;

	protected SubLSymbol ifNotExists;

	protected boolean isInteractive = false;

	protected String newline = SubLStream.DEFAULT_NEWLINE;

	private volatile boolean isClosed = false;

	private long inputIndex = 0;

	public AbstractSubLStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		this.init(elementType, direction, ifExists, ifNotExists);
	}

	public boolean canFastHash() {
		return true;
	}

	public void close() {
		this.isClosed = true;
	}

	public void ensureOpen() {
		if (this.isClosed())
			Errors.error("Can't perform operation on closed stream: " + this);
	}

	public void ensureOpen(String operation) {
		if (this.isClosed())
			Errors.error("Can't perform " + operation + " on closed stream: " + this);
	}

	public SubLSymbol getDirection() {
		return this.direction;
	}

	public SubLSymbol getElementType() {
		return this.elementType;
	}

	/** Method created to avoid instanceof tests */
	public String getFileDesignator() {
		if (!this.isRandomAccess())
			Errors.error("Invalid pathname designator: " + this + ".");
		File file = this.getFile();
		if (file == null)
			Errors.error("Invalid pathname designator: " + this + ".");
		return file.getAbsolutePath();
	}

	public long getFlushCount() {
		Errors.unimplementedMethod("getFlushCount");
		return -1;
	}

	public long getInputIndex() {
		return this.inputIndex;
	}

	//// Protected Area

	//// Private Area

	public String getNewline() {
		return this.newline;
	}

	public SubLList getStreams() {
		return CommonSymbols.NIL;
	}

	public SubLSymbol getStreamSymbol() {
		Errors.error(this + " is not of type: SYNONYM-STREAM.");
		return null;
	}

	public String getStringOutput() {
		return Errors.error("Can't get the stream string output for non-string streams.").getString();
	}

	public SubLSymbol getType() {
		return Types.$dtp_stream$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_HUNDRED_FORTY_FOUR_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return 0; // @hack
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	public SubLSymbol ifExists() {
		return this.ifExists;
	}

	public SubLSymbol ifNotExists() {
		return this.ifNotExists;
	}

	protected void incrementInputIndex(long incAmount) {
		this.inputIndex += incAmount;
	}

	private void init(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		this.elementType = elementType;
		if (elementType != CommonSymbols.TEXT_KEYWORD && elementType != CommonSymbols.BINARY_KEYWORD)
			Errors.error("Invalid stream element type: " + elementType);
		this.direction = direction;
		if (direction != CommonSymbols.INPUT_KEYWORD && direction != CommonSymbols.OUTPUT_KEYWORD
				&& direction != CommonSymbols.IO_KEYWORD && direction != CommonSymbols.PROBE_KEYWORD)
			Errors.error("Invalid stream direction: " + direction);
		this.ifExists = ifExists;
		if (ifExists != CommonSymbols.ERROR_KEYWORD && ifExists != CommonSymbols.NEW_VERSION_KEYWORD
				&& ifExists != CommonSymbols.RENAME_AND_DELETE_KEYWORD && ifExists != CommonSymbols.OVERWRITE_KEYWORD
				&& ifExists != CommonSymbols.APPEND_KEYWORD && ifExists != CommonSymbols.SUPERSEDE_KEYWORD
				&& ifExists != CommonSymbols.NIL)
			Errors.error("Invalid stream if-exists parameter: " + ifExists);
		this.ifNotExists = ifNotExists;
		if (ifNotExists != CommonSymbols.ERROR_KEYWORD && ifNotExists != CommonSymbols.CREATE_KEYWORD
				&& ifNotExists != CommonSymbols.NIL)
			Errors.error("Invalid stream if-not-exists parameter: " + ifNotExists);
		if (ifExists == CommonSymbols.RENAME_AND_DELETE_KEYWORD)
			Errors.error("Streams implementation does not currently support :rename-and-delete.");
		if (direction == CommonSymbols.PROBE_KEYWORD)
			Errors.error("Streams implementation does not currently support :probe.");
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isClosed() {
		return this.isClosed;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isInteractive() {
		return this.isInteractive;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isMemoryMapped() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return true;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStringOutputStream() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	//// Internal Rep

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	protected void setInputIndex(long newIndex) {
		this.inputIndex = newIndex;
	}

	public void setIsInteractive(boolean newValue) {
		this.isInteractive = newValue;
	}

	public void setNewline(String newline) {
		this.newline = newline;
	}

	public String toString() {
		return "#<STREAM " + this.elementType + " " + this.direction + (this.isClosed() ? " CLOSED" : " OPEN") + " @ "
				+ this.superHash() + ">";
	}

	public String toTypeName() {
		return SubLStream.STREAM_TYPE_NAME;
	}

	// common lisp additions

	final public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Main

}
