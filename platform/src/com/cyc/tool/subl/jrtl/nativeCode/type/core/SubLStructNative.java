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

import java.lang.reflect.Field;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;

public abstract class SubLStructNative extends AbstractSubLStruct implements SubLStruct {

	//// Constructors

	/** Creates a new instance of SubLStructNative. */
	protected SubLStructNative() {
	}

	/**
	 * Creates a new instance of SubLStructNative given a property list of
	 * fieldName/fieldValue pairs.
	 */
	protected SubLStructNative(SubLObject initValues) {
		if (initValues == null || initValues == SubLNil.NIL || initValues == CommonSymbols.UNPROVIDED)
			return;
		SubLObject next = SubLNil.NIL;
		SubLStructDeclNative structDecl = (SubLStructDeclNative) this.getStructDecl();
		for (next = initValues; next != SubLNil.NIL; next = conses_high.cddr(next)) {
			SubLObject currentField = ConsesLow.car(next);
			SubLObject currentValue = conses_high.cadr(next);
			structDecl.setFieldFromName(currentField.toSymbol(), currentValue);
		}
	}

	//// Public Area

	public boolean canFastHash() {
		SubLStructDecl structDecl = this.getStructDecl();
		if (structDecl == null)
			return false;
		return structDecl.isInterned;
	}

	public void clear() {
		SubLStructDecl structDecl = this.getStructDecl();
		int size = structDecl.getFieldCount();
		for (int i = 0; i < size; i++)
			this.setField(i, SubLNil.NIL);
	}

	public SubLObject getField(int fieldNum) {
		if (fieldNum == 0)
			return SubLNumberFactory.makeInteger(this.getFieldCount());
		if (fieldNum == 1)
			return this.getName();
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) this.getStructDecl()).getFieldDecl(fieldNum);
		try {
			return (SubLObject) field.get(this);
		} catch (IllegalAccessException iae) {
			return Errors.error("Unable to set table value", iae);
		}
	}

	public SubLObject getField0() {
		return SubLNumberFactory.makeInteger(this.getFieldCount());
	}

	public SubLObject getField1() {
		return this.getName();
	}

	public SubLSymbol getName() {
		return this.getStructDecl().getStructName();
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
		return true;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public void setField(int fieldNum, SubLObject value) {
		if (fieldNum == 0)
			Errors.unimplementedMethod("SublStructNative.setField(0)");
		if (fieldNum == 1)
			Errors.unimplementedMethod("SublStructNative.setField(1)");
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) this.getStructDecl()).getFieldDecl(fieldNum);
		try {
			field.set(this, value);
		} catch (IllegalAccessException iae) {
			Errors.error("Unable to set table value", iae);
		}
	}

	public SubLObject setField0(SubLObject newVal) {
		Errors.unimplementedMethod("SublStructNative.setField0()");
		return SubLNil.NIL;
	}

	public SubLObject setField1(SubLObject newVal) {
		Errors.unimplementedMethod("SublStructNative.setField1()");
		return SubLNil.NIL;
	}

	public void setName(SubLSymbol name) {
		this.getStructDecl().setStructName(name);
	}

	/** Method created to avoid instanceof tests */
	public boolean structures_bag_p() {
		return true;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep
}
