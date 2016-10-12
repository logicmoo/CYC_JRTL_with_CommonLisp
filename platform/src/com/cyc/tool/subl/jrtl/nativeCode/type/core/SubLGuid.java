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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.UUID;

//// Internal Imports

//// External Imports

public class SubLGuid extends AbstractSubLObject implements SubLObject, Comparable<SubLGuid> {

	public static String GUID_TYPE_NAME = "GUID";

	//// Constructors

	static protected int compareTimeVersionedGUIDs(UUID guid1, UUID guid2) {
		int var1 = guid1.variant();
		int var2 = guid2.variant();
		if (var1 != var2)
			return var1 > var2 ? 1 : -1;
		int seq1 = guid1.clockSequence();
		int seq2 = guid2.clockSequence();
		if (seq1 != seq2)
			return seq1 > seq2 ? 1 : -1;
		long stamp1 = guid1.timestamp();
		long stamp2 = guid2.timestamp();
		if (stamp1 != stamp2)
			return stamp1 > stamp2 ? 1 : -1;
		long node1 = guid1.node();
		long node2 = guid2.node();
		if (node1 != node2)
			return node1 > node2 ? 1 : -1;
		return 0;
	}

	private static long guidLSB(SubLVector data) {
		long lsb = 0;
		assert data.size() == 16;
		for (int i = 8; i < 16; i++)
			lsb = lsb << 8 | (byte) data.get(i).toInteger().intValue() & 0xff;
		return lsb;
	}

	private static long guidMSB(SubLVector data) {
		long msb = 0;
		assert data.size() == 16;
		for (int i = 0; i < 8; i++)
			msb = msb << 8 | (byte) data.get(i).toInteger().intValue() & 0xff;
		return msb;
	}

	public static boolean isGuidString(String string) {
		// @hack this is incredibly expensive ....
		boolean isValid = false;
		try {
			UUID testUUID = UUID.fromString(string);
			isValid = true;
		} catch (Exception xcpt) {
		}
		return isValid;
	}

	private UUID guid;

	//// Public Area

	private String guidString;

	/** Creates a new instance of SubLGuid. */

	SubLGuid() {
		this(UUID.randomUUID());
	}

	SubLGuid(String guidString) {
		this(UUID.fromString(guidString), guidString);
	}

	SubLGuid(SubLVector data) {
		this(new UUID(SubLGuid.guidMSB(data), SubLGuid.guidLSB(data)));
	}

	SubLGuid(UUID guid) {
		this(guid, guid.toString());
	}

	SubLGuid(UUID guid, String guidString) {
		this.guid = guid;
		this.guidString = guidString;
	}

	public boolean canFastHash() {
		return true;
	}

	public int compareTo(SubLGuid obj) {
		if (obj == null)
			throw new NullPointerException();
		// this will throw the required class-cast exception if it fails
		SubLGuid otherGuid = obj;
		int thisVersion = this.guid.version();
		int otherVersion = otherGuid.getNativeGuid().version();
		// perform the comparison
		if (thisVersion != otherVersion)
			// they can already not be equal at this point
			return thisVersion > otherVersion ? 1 : -1;
		// at this point we are comparing compatible versions
		if (this.guid.version() == 1)
			return SubLGuid.compareTimeVersionedGUIDs(this.guid, otherGuid.getNativeGuid());
		else if (this.guid.version() == 4)
			return this.stringRepresentation().compareTo(otherGuid.stringRepresentation());
		else
			return this.guid.compareTo(otherGuid.getNativeGuid());
	}

	public boolean equalp(SubLObject obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!obj.isGuid())
			return false;
		return this.compareTo(obj.toGuid()) == 0;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof SubLGuid))
			return false;
		return this.compareTo((SubLGuid) obj) == 0;
	}

	public void fillByteVector(SubLVector byteVector) {
		assert byteVector.size() == 16;

		// Assume the GUID layout in the GUID string is like so :
		// M7 M6 M5 M4 M3 M2 M1 M0 L7 L6 L5 L4 L3 L2 L1 L0
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		long msb = this.guid.getMostSignificantBits();
		for (int i = 7; i >= 0; i--) {
			int nextByte = (int) msb & 0xff;
			SubLInteger nextSubLByte = SubLNumberFactory.makeSmallInteger(nextByte);
			byteVector.set(i, nextSubLByte);
			msb >>= 8;
		}

		long lsb = this.guid.getLeastSignificantBits();
		for (int i = 15; i >= 8; i--) {
			int nextByte = (int) lsb & 0xff;
			SubLInteger nextSubLByte = SubLNumberFactory.makeSmallInteger(nextByte);
			byteVector.set(i, nextSubLByte);
			lsb >>= 8;
		}
	}

	public SubLString getGuidString() {
		return SubLObjectFactory.makeString(this.stringRepresentation());
	}

	//// Protected Area
	protected UUID getNativeGuid() {
		return this.guid;
	}

	public SubLSymbol getType() {
		return Types.$dtp_guid$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.ONE_HUNDRED_TWENTY_SEVEN_INTEGER;
	}

	public int hashCode(int depth) {
		return this.guid.hashCode();
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
		return true;
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
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public String stringRepresentation() {
		return this.guidString;
	}

	//// Private Area

	/** Method created to avoid casting */
	public SubLGuid toGuid() {
		return this;
	}

	public String toString() {
		return "#G\"" + this.stringRepresentation() + "\"";
	}

	//// Internal Rep

	public String toTypeName() {
		return SubLGuid.GUID_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}
}
