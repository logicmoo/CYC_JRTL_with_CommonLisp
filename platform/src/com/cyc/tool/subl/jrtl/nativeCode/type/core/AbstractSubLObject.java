/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.armedbear.lisp.Debug;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLObject extends Lisp implements SubLObject {

	public Object termRef;

	/**
	 * Getter. Retrieves the termRef.
	 * 
	 * @return the termRef
	 */
	public Object getTermRef() {
		return termRef;
	}

	/**
	 * Setter. Sets or updates the termRef to the passed value.
	 * 
	 * @param termRef the termRef to set
	 */
	public Object setTermRef(Object termRef) {
		this.termRef = termRef;
		return termRef;
	}

	@Override
	public BigDecimal bigDecimalValue() {
		type_error_str(this, "NUMBER");
		return null;
	}

	@Override
	public SubLObject add(SubLObject num) {
		if (!SubLMain.OPENCYC)
			type_error_str(this, "NUMBER");
		return num;
	}

	@Override
	public void addKey(SubLObject key) {
		type_error_str(this, "KEYHASH");
	}

	@Override
	public SubLList asArrayList() {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public SubLList asConsList() {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public BigInteger bigIntegerValue() {
		type_error_str(this, "NUMBER");
		return BigInteger.ZERO;
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + "");
	}

	@Override
	public char charValue() {
		type_error_str(this, "CHAR");
		return '\0';
	}

	@Override
	public void checkType(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public Object clone() {
		Object result = null;
		try {
			result = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return this;
		}
		return result;
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		type_error_str(this, "SYMBOL");
		Errors.error("Illegal attempt to get binding for non symbol: " + this + "");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject dec() {
		type_error_str(this, "NUMBER");
		return type_error_str(this, "NUMBER");
	}

	@Override
	public double doubleValue() {
		type_error_str(this, "NUMBER");
		return Double.NaN;
	}

	@Override
	public SubLObject eighth() {
		return this.get(7);
	}

	@Override
	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "." + " Wanted type: "
					+ predicate + " Actual type: " + toTypeName()));
	}

	@Override
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public boolean eql(SubLObject obj) {
		return obj == this;
	}

	@Override
	public boolean equal(SubLObject obj) {
		return eql(obj);
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return equal(obj);
	}

	public boolean equals(Symbol obj) {
		if (obj.getClass() == getClass()) {
			return equal((LispObject) obj);
		}
		if (obj == T)
			return false;
		Debug.bug();
		return obj == this;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() == getClass()) {
			return equal((LispObject) obj);
		}
		Debug.bug();
		return obj == this;
	}
//
//    @Override
//    public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
//        return this;
//    }

	@Override
	public SubLObject fifth() {
		return this.get(4);
	}

	@Override
	public SubLObject first() {
		type_error((LispObject) this, Symbol.LIST);
		return SubLNil.NIL;
	}

	@Override
	public SubLObject fourth() {
		return this.get(3);
	}

	@Override
	public SubLObject get(int index) {
		type_error_str(this, "SEQUENCE");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject get(SubLObject obj) {
		// type_error_str(this, "HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public SubLCharacter getCharacter(int index) {
		type_error_str(this, "STRING");
		return null;
	}

	@Override
	public SubLObject getField(int fieldNum) {
		if (!(this instanceof SubLStruct))
			type_error_str(this, "STRUCTURE");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + "");
		return SubLNil.NIL;
	}

	@Override
	public void setField(int fieldNum, SubLObject value) {
		type_error_str(this, "STRUCTURE");
	}

	private SubLObject setFieldThis(int fieldNum, SubLObject value) {
		setField(fieldNum, value);
		return value;
	}

	@Override
	public SubLObject getField0() {
		return getField(0);
	}

	@Override
	public SubLObject getField1() {
		return getField(1);
	}

	@Override
	public SubLObject getField10() {
		return getField(10);
	}

	@Override
	public SubLObject getField11() {
		return getField(11);
	}

	@Override
	public SubLObject getField12() {
		return getField(12);
	}

	@Override
	public SubLObject getField13() {
		return getField(13);
	}

	@Override
	public SubLObject getField14() {
		return getField(14);
	}

	@Override
	public SubLObject getField15() {
		return getField(15);
	}

	@Override
	public SubLObject getField16() {
		return getField(16);
	}

	@Override
	public SubLObject getField17() {
		return getField(17);
	}

	@Override
	public SubLObject getField18() {
		return getField(18);
	}

	@Override
	public SubLObject getField19() {
		return getField(19);
	}

	@Override
	public SubLObject getField2() {
		return getField(2);
	}

	@Override
	public SubLObject getField20() {
		return getField(20);
	}

	@Override
	public SubLObject getField3() {
		return getField(3);
	}

	@Override
	public SubLObject getField4() {
		return getField(4);
	}

	@Override
	public SubLObject getField5() {
		return getField(5);
	}

	@Override
	public SubLObject getField6() {
		return getField(6);
	}

	@Override
	public SubLObject getField7() {
		return getField(7);
	}

	@Override
	public SubLObject getField8() {
		return getField(8);
	}

	@Override
	public SubLObject getField9() {
		return getField(9);
	}

	@Override
	public String getFileDesignator() {
		Errors.error(this + " is not a file name designator");
		return null;
	}

	@Override
	public SubLFunction getFunc() {
		type_error_str(this, "FUNCTION");
		return null;
	}

	@Override
	public int getNumSize() {
		type_error_str(this, "NUMBER");
		return -1;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		type_error_str(this, "STREAM");
		return null;
	}

	// @Override
	@Override
	public String getStringValue() {
		type_error_str(this, "STRING");
		return "";
	}

	@Override
	public String getString() {
		return getStringValue();
	}

	@Override
	public String princToString() {
		return printObject();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject#printObject()
	 */
	@Override
	abstract public String printObject();

	@Override
	public SubLSymbol getType() {
		if (false)
			Errors.error(this + " does not have a type defined");
		return toLispObject().typeOf().toSymbol();
	}

	@Override
	public SubLFixnum getTypeCode() {
		if (true) {
			SubLSymbol s = getType();
			return (SubLFixnum) Fixnum.MINUS_ONE;
		}
		Errors.error(this + " does not have a typecode defined");
		return null;
	}

	@Override
	public int hashCode() {
		return this.hashCode(0);
	}

	@Override
	public abstract int hashCode(int p0);

	@Override
	public boolean hasKey(SubLObject obj) {
		type_error_str(this, "KEYHASH");
		return false;
	}

	@Override
	public SubLObject inc() {
		return type_error_str(this, "NUMBER");
	}

	@Override
	public int intValue() {
		type_error_str(this, "NUMBER");
		return Integer.MIN_VALUE;
	}

	@Override
	public boolean isArrayBased() {
		type_error_str(this, "LIST");
		return true;
	}

	@Override
	public boolean isNegative() {
		return false;
	}

	@Override
	public boolean isPositive() {
		return false;
	}

	@Override
	public boolean isZero() {
		return false;
	}

	@Override
	public SubLObject last(int i) {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public long longValue() {
		type_error_str(this, "NUMBER");
		return Long.MIN_VALUE;
	}

	@Override
	public SubLObject makeCopy() {
		Errors.unimplementedMethod("makeCopy()");
		return null;
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("makeDeepCopy()");
		return null;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		return type_error_str(this, "NUMBER");
	}

	@Override
	public SubLObject ninth() {
		return this.get(8);
	}

	@Override
	public SubLObject nthCdr(int index) {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public boolean numE(SubLObject x) {
		type_error_str(this, "NUMBER");
		return false;
	}

	@Override
	public boolean numG(SubLObject x) {
		type_error_str(this, "NUMBER");
		return false;
	}

	@Override
	public boolean numGE(SubLObject x) {
		type_error_str(this, "NUMBER");
		return false;
	}

	@Override
	public boolean numL(SubLObject x) {
		type_error_str(this, "NUMBER");
		return false;
	}

	@Override
	public boolean numLE(SubLObject x) {
		type_error_str(this, "NUMBER");
		return false;
	}

	@Override
	public SubLObject put(SubLObject key, SubLObject value) {
		type_error_str(this, "HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to rebind non symbol: " + this + "");
	}

	@Override
	public boolean remKey(SubLObject obj) {
		type_error_str(this, "HASHTABLE");
		return false;
	}

	@Override
	public SubLObject remove(SubLObject obj) {
		type_error_str(this, "HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject rest() {
		return Lisp.type_error((LispObject) this, Symbol.LIST);
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		type_error_str(this, "SEQUENCE");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject second() {
		return this.get(1);
	}

	@Override
	public void set(int index, SubLObject val) {
		type_error_str(this, "SEQUENCE");
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		return setFieldThis(0, newVal);
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		return setFieldThis(1, newVal);
	}

	@Override
	public SubLObject setField10(SubLObject newVal) {
		return setFieldThis(10, newVal);
	}

	@Override
	public SubLObject setField11(SubLObject newVal) {
		return setFieldThis(11, newVal);
	}

	@Override
	public SubLObject setField12(SubLObject newVal) {
		return setFieldThis(12, newVal);
	}

	@Override
	public SubLObject setField13(SubLObject newVal) {
		return setFieldThis(13, newVal);
	}

	@Override
	public SubLObject setField14(SubLObject newVal) {
		return setFieldThis(14, newVal);
	}

	@Override
	public SubLObject setField15(SubLObject newVal) {
		return setFieldThis(15, newVal);
	}

	@Override
	public SubLObject setField16(SubLObject newVal) {
		return setFieldThis(16, newVal);
	}

	@Override
	public SubLObject setField17(SubLObject newVal) {
		return setFieldThis(17, newVal);
	}

	@Override
	public SubLObject setField18(SubLObject newVal) {
		return setFieldThis(18, newVal);
	}

	@Override
	public SubLObject setField19(SubLObject newVal) {
		return setFieldThis(19, newVal);
	}

	@Override
	public SubLObject setField2(SubLObject newVal) {
		return setFieldThis(2, newVal);
	}

	@Override
	public SubLObject setField20(SubLObject newVal) {
		return setFieldThis(20, newVal);
	}

	@Override
	public SubLObject setField3(SubLObject newVal) {
		return setFieldThis(3, newVal);
	}

	@Override
	public SubLObject setField4(SubLObject newVal) {
		return setFieldThis(4, newVal);
	}

	@Override
	public SubLObject setField5(SubLObject newVal) {
		return setFieldThis(5, newVal);
	}

	@Override
	public SubLObject setField6(SubLObject newVal) {
		return setFieldThis(6, newVal);
	}

	@Override
	public SubLObject setField7(SubLObject newVal) {
		return setFieldThis(7, newVal);
	}

	@Override
	public SubLObject setField8(SubLObject newVal) {
		return setFieldThis(8, newVal);
	}

	@Override
	public SubLObject setField9(SubLObject newVal) {
		return setFieldThis(9, newVal);
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public SubLObject seventh() {
		return this.get(6);
	}

	@Override
	public SubLObject sixth() {
		return this.get(5);
	}

	@Override
	public int size() {
		type_error_str(this, "SEQUENCE");
		return -1;
	}

	@Override
	public int size(int max) {
		type_error_str(this, "SEQUENCE");
		return -1;
	}

	@Override
	public SubLObject sub(SubLObject num) {
		return type_error_str(this, "NUMBER");
	}

	@Override
	final public int superHash() {
		return super.hashCode();
	}

	@Override
	public SubLObject tenth() {
		return this.get(9);
	}

	@Override
	public SubLObject third() {
		return this.get(2);
	}

	@Override
	public SubLCharacter toChar() {
		type_error_str(this, "CHAR");
		return null;
	}

	@Override
	public SubLCons toCons() {
		type_error_str(this, "CONS");
		return null;
	}

	@Override
	public SubLDoubleFloat toDouble() {
		type_error_str(this, "FLOAT");
		return null;
	}

	@Override
	public SubLEnvironment toEnv() {
		type_error_str(this, "ENVIRONMENT");
		return null;
	}

	@Override
	public SubLFixnum toFixnum() {
		type_error_str(this, "FIXNUM");
		return null;
	}

	@Override
	public SubLGuid toGuid() {
		type_error_str(this, "GUID");
		return null;
	}

	@Override
	public SubLHashtable toHashtable() {
		type_error_str(this, "HASHTABLE");
		return null;
	}

	@Override
	public SubLHashtableIterator toHashtableIterator() {
		type_error_str(this, "HASHTABLE-ITERATOR");
		return null;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		type_error_str(this, "INPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLInputStream toInputStream() {
		type_error_str(this, "INPUT-STREAM");
		return null;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		type_error_str(this, "INPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLInteger toInteger() {
		type_error_str(this, "INTEGER");
		return null;
	}

	@Override
	public SubLKeyhash toKeyhash() {
		type_error_str(this, "KEYHASH");
		return null;
	}

	@Override
	public SubLKeyhashIterator toKeyhashIterator() {
		type_error_str(this, "KEYHASH-ITERATOR");
		return null;
	}

	@Override
	public SubLList toList() {
		type_error_str(this, "LIST");
		return null;
	}

	@Override
	public SubLLock toLock() {
		type_error_str(this, "LOCK");
		return null;
	}

	@Override
	public SubLMacro toMacro() {
		type_error_str(this, "MACRO");
		return null;
	}

	@Override
	public SubLNumber toNumber() {
		type_error_str(this, "NUMBER");
		return null;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		type_error_str(this, "OUTPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		type_error_str(this, "OUTPUT-STREAM");
		return null;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		type_error_str(this, "OUTPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLPackage toPackage() {
		type_error_str(this, "PACKAGE");
		return null;
	}

	@Override
	public SubLPackageIterator toPackageIterator() {
		type_error_str(this, "PACKAGE");
		return null;
	}

	@Override
	public SubLProcess toProcess() {
		type_error_str(this, "PROCESS");
		return null;
	}

	@Override
	public SubLReadWriteLock toReadWriteLock() {
		type_error_str(this, "READ-WRITE-LOCK");
		return null;
	}

	@Override
	public SubLRegexPattern toRegexPattern() {
		type_error_str(this, "REGEX-PATTERN");
		return null;
	}

	@Override
	public SubLSemaphore toSemaphore() {
		type_error_str(this, "SEMAPHORE");
		return null;
	}

	@Override
	public SubLSequence toSeq() {
		type_error_str(this, "SEQUENCE");
		return null;
	}

	@Override
	public SubLString toStr() {
		type_error_str(this, "STRING");
		return null;
	}

	@Override
	public SubLStruct toStruct() {
		type_error_str(this, "STRUCTURE");
		return null;
	}

	@Override
	public SubLSymbol toSymbol() {
		type_error_str(this, "SYMBOL");
		return null;
	}

	protected SubLObject type_error_str(AbstractSubLObject datum, String expectedType) {
		if (Main.isNoDebug()) {
			throw new SubLException("" + datum + " not a type " + expectedType);
		}
		if (Main.isSubLisp()) {
			if (datum == NIL)
				Errors.error("" + datum + " not a type " + expectedType);
			Errors.error("" + datum + " not a type " + expectedType);
		}
		return Lisp.type_error(toLispObject(), SubLObjectFactory.makeSublispSymbol(expectedType).toLispObject());

	}

	@Override
	public String toTypeName() {
		return "OBJECT";
	}

	@Override
	public SubLVector toVect() {
		type_error_str(this, "VECTOR");
		return null;
	}

}
