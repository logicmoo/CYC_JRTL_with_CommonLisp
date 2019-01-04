//
// For LarKC
//
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public abstract class SubLStructNative extends AbstractSubLStruct implements SubLStruct {
	protected SubLStructNative() {
	}

	protected SubLStructNative(SubLObject initValues) {
		if (initValues == null || initValues == SubLNil.NIL || initValues == CommonSymbols.UNPROVIDED)
			return;
		SubLObject next = SubLNil.NIL;
		SubLStructDeclNative structDecl = (SubLStructDeclNative) getStructDecl();
		for (next = initValues; next != SubLNil.NIL; next = conses_high.cddr(next)) {
			SubLObject currentField = ConsesLow.car(next);
			SubLObject currentValue = conses_high.cadr(next);
			structDecl.setFieldFromName(currentField.toSymbol(), currentValue);
		}
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return super.equalpA(obj);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equalsA(obj);
	}
	@Override
	public boolean canFastHash() {
		SubLStructDecl structDecl = getStructDecl();
		return structDecl != null && structDecl.isInterned;
	}

	@Override
	public void clear() {
		SubLStructDecl structDecl = getStructDecl();
		for (int size = structDecl.getFieldCount(), i = 0; i < size; ++i)
			this.setField(i, SubLNil.NIL);
	}

	@Override
	public SubLObject getField(int fieldNum) {
		if (fieldNum == 0)
			return SubLNumberFactory.makeInteger(getFieldCount());
		if (fieldNum == 1)
			return getName();
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
		try {
			return (SubLObject) field.get(this);
		} catch (IllegalAccessException iae) {
			return Errors.error("Unable to set table value", iae);
		}
	}

	@Override
	public SubLObject getField0() {
		return SubLNumberFactory.makeInteger(getFieldCount());
	}

	@Override
	public SubLObject getField1() {
		return getName();
	}

	@Override
	public SubLSymbol getName() {
		return getStructDecl().getStructName();
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return true;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public void setField(int fieldNum, SubLObject value) {
		if (fieldNum == 0)
			Errors.unimplementedMethod("SublStructNative.setField(0)");
		if (fieldNum == 1)
			Errors.unimplementedMethod("SublStructNative.setField(1)");
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
		try {
			field.set(this, value);
		} catch (IllegalAccessException iae) {
			Errors.error("Unable to set table value", iae);
		}
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		Errors.unimplementedMethod("SublStructNative.setField0()");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		Errors.unimplementedMethod("SublStructNative.setField1()");
		return SubLNil.NIL;
	}

	@Override
	public void setName(SubLSymbol name) {
		getStructDecl().setStructName(name);
	}

	public boolean structures_bag_p() {
		return true;
	}

	public String printObjectImpl() {
		try {
			return print_high.princ_to_string(this).getStringValue();
		} catch (Exception e) {
			return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
		}
	}
}
