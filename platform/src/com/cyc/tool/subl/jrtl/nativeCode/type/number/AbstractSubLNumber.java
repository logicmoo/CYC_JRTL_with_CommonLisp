
/**   Copyright (c) 1995-2009 Cycorp Inc.
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

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispError;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.FromSubLisp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
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

public abstract class AbstractSubLNumber extends FromSubLisp implements SubLNumber, SubLObject, Comparable {
	private void structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
	}
	
	@Override
	public BigDecimal bigDecimalValue() {
		return new BigDecimal(""+getNativeNumber());
	}

	@Override
	final public int sxhash() {
		return psxhash();
	}
	@Override
	abstract public int hashCode();


	@Override
	abstract public int psxhash();

	public int psxhash666() {
		return hashCode() & 0x7ffffff;
	}
	@Override
	final public int psxhash(int d0) {
		return intValue();
	}

	@Override
	public SubLNumber abs() {
		Errors.unimplementedMethod("AbstractSubLNumber.abs");
		return null;
	}

	@Override
	public SubLNumber add(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.add");
		return null;
	}

	@Override
	public void addKey(SubLObject key) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH");
	}

	@Override
	public SubLNumber arcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcCosine");
		return null;
	}

	@Override
	public SubLNumber arcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcSine");
		return null;
	}

	@Override
	public SubLNumber arcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcTangent");
		return null;
	}

	@Override
	public SubLList asArrayList() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public SubLList asConsList() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public BigInteger bigIntegerValue() {
		String string = ""+getNativeNumber();
		try {
			return new BigInteger(string);
		} catch (NumberFormatException nfe) {
			Lisp.error(new LispError("" + nfe));
			return null;
		}
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public SubLInteger ceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.ceiling");
		return null;
	}

	@Override
	public char charValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"CHAR");
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
		return this;
	}

	@Override
	public int compareTo(Object o) {
		SubLNumber num = (SubLNumber) o;
		if (num.isBigIntegerBignum() || isBigIntegerBignum())
			return bigIntegerValue().compareTo(num.bigIntegerValue());
		if (num.isDouble() || isDouble()) {
			double a = doubleValue();
			double b = num.doubleValue();
			return a < b ? -1 : a > b ? 1 : 0;
		}
		if (num.isLongBignum() || isLongBignum()) {
			long a2 = longValue();
			long b2 = num.longValue();
			return a2 < b2 ? -1 : a2 > b2 ? 1 : 0;
		}
		int a3 = intValue();
		int b3 = num.intValue();
		return a3 < b3 ? -1 : a3 > b3 ? 1 : 0;
	}


	@Override
	public boolean eql(SubLObject obj) {
		if (!obj.isNumber())
			return false;
		if (this.isFixnum() && obj.isFixnum())
			return this.intValue() == obj.intValue();
		else if (this.isDouble() || obj.isDouble())
			return this.doubleValue() == obj.doubleValue();
		else if (this.isBigIntegerBignum())
			return this.equals(obj);
		else if (obj.isBigIntegerBignum())
			return ((SubLBigIntBignum) obj).equals(this);
		else if (this.isLongBignum() || obj.isLongBignum())
			return this.longValue() == obj.longValue();
		return this.intValue() == obj.intValue();
	}

	@Override
	public SubLNumber cosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.cosine");
		return null;
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	@Override
	public SubLNumber decrement() {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	@Override
	public SubLNumber decrement(SubLNumber decrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	@Override
	public SubLNumber divide(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.divide");
		return null;
	}

	@Override
	public SubLObject eighth() {
		return this.get(7);
	}


	// @todo get rid of duplication with AbstractSubLObject -APB
	@Override
	public void enforceType(SubLSymbol predicate) throws SubLException {
		// @todo make special case unary filter functions for SubL predicates
		// They should be created and initialized in UnaryFunction -APB
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error("Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: "
					+ this.toTypeName());
	}

	@Override
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return obj.isNumber() && numE(obj);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof SubLObject && eql((SubLObject) obj);
	}

	@Override
	public SubLObject eval(SubLEnvironment env) {
		return this;
	}

	@Override
	public SubLFloat fceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.fceiling");
		return null;
	}

	@Override
	public SubLFloat ffloor() {
		Errors.unimplementedMethod("AbstractSubLNumber.ffloor");
		return null;
	}

	@Override
	public SubLObject fifth() {
		return this.get(4);
	}

	@Override
	public SubLObject first() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return SubLNil.NIL;
	}

	@Override
	public SubLInteger floor() {
		Errors.unimplementedMethod("AbstractSubLNumber.floor");
		return null;
	}

	@Override
	public SubLObject fourth() {
		return this.get(3);
	}

	@Override
	public SubLFloat fround() {
		Errors.unimplementedMethod("AbstractSubLNumber.fround");
		return null;
	}

	@Override
	public SubLFloat ftruncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.ftruncate");
		return null;
	}

	@Override
	public SubLObject get(int index) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEQUENCE");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject get(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public SubLCharacter getCharacter(int index) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRING");
		return null;
	}

	@Override
	public SubLObject getField(int fieldNum) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRUCT");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject getField0() {
		structFieldError(0);
		return null;
	}

	@Override
	public SubLObject getField1() {
		structFieldError(1);
		return null;
	}

	@Override
	public SubLObject getField10() {
		structFieldError(10);
		return null;
	}

	@Override
	public SubLObject getField11() {
		structFieldError(11);
		return null;
	}

	@Override
	public SubLObject getField12() {
		structFieldError(12);
		return null;
	}

	@Override
	public SubLObject getField13() {
		structFieldError(13);
		return null;
	}

	@Override
	public SubLObject getField14() {
		structFieldError(14);
		return null;
	}

	@Override
	public SubLObject getField15() {
		structFieldError(15);
		return null;
	}

	@Override
	public SubLObject getField16() {
		structFieldError(16);
		return null;
	}

	@Override
	public SubLObject getField17() {
		structFieldError(17);
		return null;
	}

	@Override
	public SubLObject getField18() {
		structFieldError(18);
		return null;
	}

	@Override
	public SubLObject getField19() {
		structFieldError(19);
		return null;
	}

	@Override
	public SubLObject getField2() {
		structFieldError(2);
		return null;
	}

	@Override
	public SubLObject getField20() {
		structFieldError(20);
		return null;
	}

	@Override
	public SubLObject getField3() {
		structFieldError(3);
		return null;
	}

	@Override
	public SubLObject getField4() {
		structFieldError(4);
		return null;
	}

	@Override
	public SubLObject getField5() {
		structFieldError(5);
		return null;
	}

	@Override
	public SubLObject getField6() {
		structFieldError(6);
		return null;
	}

	@Override
	public SubLObject getField7() {
		structFieldError(7);
		return null;
	}

	@Override
	public SubLObject getField8() {
		structFieldError(8);
		return null;
	}

	@Override
	public SubLObject getField9() {
		structFieldError(9);
		return null;
	}

	@Override
	public String getFileDesignator() {
		Errors.error(this + " is not a file name designator.");
		return null;
	}

	@Override
	public SubLFunction getFunc() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FUNCTION");
		return null;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STREAM");
		return null;
	}

	@Override
	public String getStringValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRING");
		return "";
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return getNativeNumber().hashCode();
		return 0;
	}

	@Override
	public boolean hasKey(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH");
		return false;
	}

	@Override
	public SubLNumber hyperbolicArcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcCosine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicArcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcSine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicArcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcTangent");
		return null;
	}

	@Override
	public SubLNumber hyperbolicCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicCosine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicSine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicTangent");
		return null;
	}

	@Override
	public SubLNumber increment() {
		Errors.unimplementedMethod("AbstractSubLNumber.increment");
		return null;
	}

	@Override
	public SubLNumber increment(SubLNumber incrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.increment");
		return null;
	}

	@Override
	public boolean isArrayBased() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return true;
	}

	@Override
	public SubLObject last(int i) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return this;
	}

	@Override
	public SubLNumber log() {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	@Override
	public SubLNumber log(SubLNumber base) {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	@Override
	public SubLObject makeCopy() {
		return this;
	}

	@Override
	public SubLObject makeDeepCopy() {
		return this;
	}

	@Override
	public SubLNumber max(SubLNumber num) {
		return numL(num) ? num : this;
	}

	@Override
	public SubLNumber min(SubLNumber num) {
		return numL(num) ? this : num;
	}

	@Override
	public SubLInteger mod(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.mod");
		return null;
	}

	@Override
	public SubLNumber multiply(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.multiply");
		return null;
	}

	@Override
	public SubLObject ninth() {
		return this.get(8);
	}

	@Override
	public SubLObject nthCdr(int index) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public boolean numE(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return numericallyEqualInternal(num);
		return num.toNumber().numericallyEqualInternal(this);
	}

	@Override
	public boolean numG(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return greaterThanInternal(num);
		return num.toNumber().lessThanInternal(this);
	}

	@Override
	public boolean numGE(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return greaterThanOrEqualInternal(num);
		return num.toNumber().lessThanOrEqualInternal(this);
	}

	@Override
	public boolean numL(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return lessThanInternal(num);
		return num.toNumber().greaterThanInternal(this);
	}

	@Override
	public boolean numLE(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return lessThanOrEqualInternal(num);
		return num.toNumber().greaterThanOrEqualInternal(this);
	}

	@Override
	public SubLNumber pow(SubLNumber power) {
		Errors.unimplementedMethod("AbstractSubLNumber.pow");
		return null;
	}

	@Override
	public SubLObject put(SubLObject key, SubLObject value) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
	}

	@Override
	public SubLInteger remainder(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.remainder");
		return null;
	}

	@Override
	public boolean remKey(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return false;
	}

	@Override
	public SubLObject remove(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject rest() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEQUENCE");
		return SubLNil.NIL;
	}

	@Override
	public SubLInteger round() {
		Errors.unimplementedMethod("AbstractSubLNumber.round");
		return null;
	}

	@Override
	public SubLObject second() {
		return this.get(1);
	}

	@Override
	public void set(int index, SubLObject val) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEQUENCE");
	}

	@Override
	public void setField(int fieldNum, SubLObject value) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRUCT");
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		structFieldError(0);
		return null;
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		structFieldError(1);
		return null;
	}

	@Override
	public SubLObject setField10(SubLObject newVal) {
		structFieldError(10);
		return null;
	}

	@Override
	public SubLObject setField11(SubLObject newVal) {
		structFieldError(11);
		return null;
	}

	@Override
	public SubLObject setField12(SubLObject newVal) {
		structFieldError(12);
		return null;
	}

	@Override
	public SubLObject setField13(SubLObject newVal) {
		structFieldError(13);
		return null;
	}

	@Override
	public SubLObject setField14(SubLObject newVal) {
		structFieldError(14);
		return null;
	}

	@Override
	public SubLObject setField15(SubLObject newVal) {
		structFieldError(15);
		return null;
	}

	@Override
	public SubLObject setField16(SubLObject newVal) {
		structFieldError(16);
		return null;
	}

	@Override
	public SubLObject setField17(SubLObject newVal) {
		structFieldError(17);
		return null;
	}

	@Override
	public SubLObject setField18(SubLObject newVal) {
		structFieldError(18);
		return null;
	}

	@Override
	public SubLObject setField19(SubLObject newVal) {
		structFieldError(19);
		return null;
	}

	@Override
	public SubLObject setField2(SubLObject newVal) {
		structFieldError(2);
		return null;
	}

	@Override
	public SubLObject setField20(SubLObject newVal) {
		structFieldError(20);
		return null;
	}

	@Override
	public SubLObject setField3(SubLObject newVal) {
		structFieldError(3);
		return null;
	}

	@Override
	public SubLObject setField4(SubLObject newVal) {
		structFieldError(4);
		return null;
	}

	@Override
	public SubLObject setField5(SubLObject newVal) {
		structFieldError(5);
		return null;
	}

	@Override
	public SubLObject setField6(SubLObject newVal) {
		structFieldError(6);
		return null;
	}

	@Override
	public SubLObject setField7(SubLObject newVal) {
		structFieldError(7);
		return null;
	}

	@Override
	public SubLObject setField8(SubLObject newVal) {
		structFieldError(8);
		return null;
	}

	@Override
	public SubLObject setField9(SubLObject newVal) {
		structFieldError(9);
		return null;
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public SubLObject seventh() {
		return this.get(6);
	}

	@Override
	public SubLNumber sigNum() {
		Errors.unimplementedMethod("AbstractSubLNumber.sigNum");
		return null;
	}

	@Override
	public SubLNumber sine() {
		Errors.unimplementedMethod("AbstractSubLNumber.sine");
		return null;
	}

	@Override
	public SubLObject sixth() {
		return this.get(5);
	}

	@Override
	public int size() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEQUENCE");
		return -1;
	}

	@Override
	public int size(int max) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEQUENCE");
		return -1;
	}

	@Override
	public SubLNumber sqrt(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.sqrt");
		return null;
	}

	@Override
	public SubLNumber subtract(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.subtract");
		return null;
	}

//	@Override
//	public int superHash() {
//		return super.hashCode();
//	}

	@Override
	public SubLNumber tangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.tangent");
		return null;
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
		org.armedbear.lisp.Lisp.lisp_type_error(this,"CHAR");
		return null;
	}

	@Override
	public SubLCons toCons() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"CONS");
		return null;
	}

	@Override
	public SubLEnvironment toEnv() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"ENVIRONMENT");
		return null;
	}

	@Override
	public SubLGuid toGuid() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"GUID");
		return null;
	}

	@Override
	public SubLHashtable toHashtable() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return null;
	}

	@Override
	public SubLHashtableIterator toHashtableIterator() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE-ITERATOR");
		return null;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"INPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLInputStream toInputStream() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"INPUT-STREAM");
		return null;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"INPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLKeyhash toKeyhash() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH");
		return null;
	}

	@Override
	public SubLKeyhashIterator toKeyhashIterator() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH-ITERATOR");
		return null;
	}

	@Override
	public SubLList toList() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public SubLLock toLock() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LOCK");
		return null;
	}

	@Override
	public SubLMacro toMacro() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"MACRO");
		return null;
	}

	@Override
	public SubLNumber toNumber() {
		return this;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"OUTPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"OUTPUT-STREAM");
		return null;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"OUTPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLPackage toPackage() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"PACKAGE");
		return null;
	}

	@Override
	public SubLPackageIterator toPackageIterator() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"PACKAGE-ITERATOR");
		return null;
	}

	@Override
	public SubLProcess toProcess() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"PROCESS");
		return null;
	}

	@Override
	public SubLReadWriteLock toReadWriteLock() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"READ-WRITE-LOCK");
		return null;
	}

	@Override
	public SubLRegexPattern toRegexPattern() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"REGEX-PATTERN");
		return null;
	}

	@Override
	public SubLSemaphore toSemaphore() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEMAPHORE");
		return null;
	}

	@Override
	public SubLSequence toSeq() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEQUENCE");
		return null;
	}

	@Override
	public SubLString toStr() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRING");
		return null;
	}

	@Override
	public String princToString()
	{
		return printObject();
	}
	@Override
	public String printObject() {
		return getNativeNumber().toString();
	}

	@Override
	public SubLStruct toStruct() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRUCTURE");
		return null;
	}

	@Override
	public SubLSymbol toSymbol() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SYMBOL");
		return null;
	}

	@Override
	public SubLVector toVect() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"VECTOR");
		return null;
	}

	@Override
	public SubLInteger truncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.truncate");
		return null;
	}
	//// Protected Area

	//// Private Area

	//// Internal Rep

}
