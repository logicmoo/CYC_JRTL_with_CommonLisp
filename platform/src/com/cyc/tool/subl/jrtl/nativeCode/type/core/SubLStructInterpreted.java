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

import java.util.Arrays;

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLStructInterpreted extends AbstractSubLStruct implements SubLStruct, CommonSymbols {

	//// Constructors

	private int id; // @todo temp until structDecl is assured to be non-nil

	//// Public Area

	private SubLStructDecl structDecl;

	private SubLObject[] fieldValues;

	/** Creates a new instance of SubLStructInterpreted. */
	SubLStructInterpreted(int size) {
		this.fieldValues = new SubLObject[size + 2];
		this.clear();
	}

	public boolean canFastHash() {
		// @hack to experiment if we actually get a speedup
		// return canFastHash;
		if (this.structDecl == null)
			return false;
		return this.structDecl.isInterned;
	}

	public void clear() {
		Arrays.fill(this.fieldValues, CommonSymbols.NIL);
	}

	public SubLObject getField(int slotNum) {
		return this.fieldValues[slotNum];
	}

	// boolean canFastHash = false;

	/** Method created to avoid casting */
	public SubLObject getField0() {
		return this.getField(0);
	}

	/** Method created to avoid casting */
	public SubLObject getField1() {
		return this.getField(1);
	}

	/** Method created to avoid casting */
	public SubLObject getField10() {
		return this.getField(10);
	}

	/** Method created to avoid casting */
	public SubLObject getField11() {
		return this.getField(11);
	}

	/** Method created to avoid casting */
	public SubLObject getField12() {
		return this.getField(12);
	}

	/** Method created to avoid casting */
	public SubLObject getField13() {
		return this.getField(13);
	}

	/** Method created to avoid casting */
	public SubLObject getField14() {
		return this.getField(14);
	}

	/** Method created to avoid casting */
	public SubLObject getField15() {
		return this.getField(15);
	}

	/** Method created to avoid casting */
	public SubLObject getField16() {
		return this.getField(16);
	}

	/** Method created to avoid casting */
	public SubLObject getField17() {
		return this.getField(17);
	}

	/** Method created to avoid casting */
	public SubLObject getField18() {
		return this.getField(18);
	}

	/** Method created to avoid casting */
	public SubLObject getField19() {
		return this.getField(19);
	}

	/** Method created to avoid casting */
	public SubLObject getField2() {
		return this.getField(2);
	}

	/** Method created to avoid casting */
	public SubLObject getField20() {
		return this.getField(20);
	}

	/** Method created to avoid casting */
	public SubLObject getField3() {
		return this.getField(3);
	}

	/** Method created to avoid casting */
	public SubLObject getField4() {
		return this.getField(4);
	}

	/** Method created to avoid casting */
	public SubLObject getField5() {
		return this.getField(5);
	}

	/** Method created to avoid casting */
	public SubLObject getField6() {
		return this.getField(6);
	}

	/** Method created to avoid casting */
	public SubLObject getField7() {
		return this.getField(7);
	}

	/** Method created to avoid casting */
	public SubLObject getField8() {
		return this.getField(8);
	}

	/** Method created to avoid casting */
	public SubLObject getField9() {
		return this.getField(9);
	}

	// @hack get rid of this once we have structDecls being set correctly
	public int getFieldCount() {
		if (this.fieldValues == null)
			return 0;
		return this.fieldValues.length;
	}

	public SubLSymbol getName() {
		// for C compatibility
		return this.fieldValues[1].toSymbol();
	}

	public SubLStructDecl getStructDecl() {
		return this.structDecl;
	}

	public int id() {
		return this.id;
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
		return true;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public void setField(int slotNum, SubLObject value) {
		this.fieldValues[slotNum] = value;
	}

	/** Method created to avoid casting */
	public SubLObject setField0(SubLObject newVal) {
		this.setField(0, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField1(SubLObject newVal) {
		this.setField(1, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField10(SubLObject newVal) {
		this.setField(10, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField11(SubLObject newVal) {
		this.setField(11, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField12(SubLObject newVal) {
		this.setField(12, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField13(SubLObject newVal) {
		this.setField(13, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField14(SubLObject newVal) {
		this.setField(14, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField15(SubLObject newVal) {
		this.setField(15, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField16(SubLObject newVal) {
		this.setField(16, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField17(SubLObject newVal) {
		this.setField(17, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField18(SubLObject newVal) {
		this.setField(18, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField19(SubLObject newVal) {
		this.setField(19, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField2(SubLObject newVal) {
		this.setField(2, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField20(SubLObject newVal) {
		this.setField(20, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField3(SubLObject newVal) {
		this.setField(3, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField4(SubLObject newVal) {
		this.setField(4, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField5(SubLObject newVal) {
		this.setField(5, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField6(SubLObject newVal) {
		this.setField(6, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField7(SubLObject newVal) {
		this.setField(7, newVal);
		return newVal;
	}

	/** Method created to avoid casting */
	public SubLObject setField8(SubLObject newVal) {
		this.setField(8, newVal);
		return newVal;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	/** Method created to avoid casting */
	public SubLObject setField9(SubLObject newVal) {
		this.setField(9, newVal);
		return newVal;
	}

	public void setName(SubLSymbol type) { // @Note this should probably be
											// synchronized
		// for C compatibility
		this.fieldValues[1] = type;
		// @note move this hack to native structs once implemented if
		// a better solution hasn't come around before then
		// @hack
		/*
		 * String name = type.toString(); if (name.equals("CONSTANT")) {
		 * canFastHash = true; } else if (name.equals("PROBLEM")) { canFastHash
		 * = true; } else if (name.equals("PROOF")) { canFastHash = true; } else
		 * if (name.equals("PROBLEM-LINK")) { canFastHash = true; } else if
		 * (name.equals("TACTIC")) { canFastHash = true; } else if
		 * (name.equals("NART")) { canFastHash = true; } else if
		 * (name.equals("ASSERTION")) { canFastHash = true; } else if
		 * (name.equals("DEDUCTION")) { canFastHash = true; } else if
		 * (name.equals("KB-HL-SUPPORT")) { canFastHash = true; } else if
		 * (name.equals("VARIABLE")) { canFastHash = true; }
		 */
		this.id = SubLStructDecl.getTypeID(type);
	}

	public void setStructDecl(SubLStructDecl structDecl) {
		this.structDecl = structDecl;
	}
}
