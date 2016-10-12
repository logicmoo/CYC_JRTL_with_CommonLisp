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

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.LispObject;
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

//// External Imports

public abstract class AbstractSubLNumber extends Number
		implements SubLNumber, SubLObject, Comparable, CommonSymbols, LispObject {

	//// Constructors

	/** Creates a new instance of SubLInteger. */
	AbstractSubLNumber() {
	}

	//// Public Area

	public SubLNumber abs() {
		Errors.unimplementedMethod("AbstractSubLNumber.abs");
		return null;
	}

	public SubLObject ABS() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject add(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber add(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.add");
		return null;
	}

	/** Method created to avoid casting */
	public void addKey(SubLObject key) { // SubLKeyhash
		Errors.error(this + " is not of type: KEYHASH.");
	}

	public SubLNumber arcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcCosine");
		return null;
	}

	public SubLNumber arcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcSine");
		return null;
	}

	public SubLNumber arcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcTangent");
		return null;
	}

	public int aref(int index) {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLObject AREF(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject AREF(SubLObject index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public long aref_long(int index) {
		this.unimplimentedLispFunction();
		return 0;
	}

	// @todo add NumericCompareDesc idiom here

	public SubLList asArrayList() { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLList asConsList() { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public void aset(int index, int n) {
		this.unimplimentedLispFunction();

	}

	public void aset(int index, SubLObject newValue) {
		this.unimplimentedLispFunction();

	}

	public void aset(SubLObject index, SubLObject newValue) {
		this.unimplimentedLispFunction();

	}

	public SubLObject ash(int shift) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject ash(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject ATOM() {
		this.unimplimentedLispFunction();
		return null;
	}

	public BigInteger bigIntegerValue() {
		return new BigInteger(this.toString());
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) { // SubLSymbol
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	public boolean canFastHash() {
		return true;
	}

	public SubLObject car() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject cddr() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject cdr() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLInteger ceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.ceiling");
		return null;
	}

	public SubLObject CHAR(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject CHARACTERP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public char[] charsOld() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public char charValue() { // SubLCharacter
		Errors.error(this + " is not of type: CHAR.");
		return 0;
	}

	// @todo get rid of duplication with AbstractSubLObject -APB
	public void checkType(SubLSymbol predicate) throws SubLException {
		// @todo make this the same as SubL -- problably should look up a symbol
		// value -APB
		if (SubLObject.DO_CHECK_TYPES)
			this.enforceType(predicate);
	}

	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
		if (SubLObject.DO_PARANOID_TYPE_CHECKING && SubLObject.DO_CHECK_TYPES)
			this.enforceType(predicate);
	}

	public int cl_length() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLObject classOf() {
		this.unimplimentedLispFunction();
		return null;
	}

	public Object clone() {
		return this;
	}

	public int compareTo(Object o) {
		SubLNumber num = (SubLNumber) o;
		if (num.isBigIntegerBignum() || this.isBigIntegerBignum())
			return this.bigIntegerValue().compareTo(num.bigIntegerValue());
		else if (num.isDouble() || this.isDouble()) {
			double a = this.doubleValue();
			double b = num.doubleValue();
			return a < b ? -1 : a > b ? 1 : 0;
		} else if (num.isLongBignum() || this.isLongBignum()) {
			long a = this.longValue();
			long b = num.longValue();
			return a < b ? -1 : a > b ? 1 : 0;
		} else {
			int a = this.intValue();
			int b = num.intValue();
			return a < b ? -1 : a > b ? 1 : 0;
		}
	}

	public SubLObject COMPLEXP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean constantp() {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject CONSTANTP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject[] copyToArray() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber cosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.cosine");
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject currentBinding(SubLObject[] bindings) { // SubLSymbol
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	public SubLNumber decrement() {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	public SubLNumber decrement(SubLNumber decrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	public SubLObject DENOMINATOR() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject dispatch(SubLObject[] args) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber divide(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.divide");
		return null;
	}

	public SubLObject divideBy(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject eighth() {
		return this.get(7);
	}

	public SubLObject elt(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean endp() {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject ENDP() {
		this.unimplimentedLispFunction();
		return null;
	}

	// @todo get rid of duplication with AbstractSubLObject -APB
	public void enforceType(SubLSymbol predicate) throws SubLException {
		// @todo make special case unary filter functions for SubL predicates
		// They should be created and initialized in UnaryFunction -APB
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error("Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: "
					+ this.toTypeName());
	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
		if (SubLObject.DO_PARANOID_TYPE_CHECKING) {
			UnaryFunction Function = UnaryFunction.makeInstance(predicate);
			if (SubLNil.NIL == Function.processItem(this))
				Errors.error("Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: "
						+ this.toTypeName());
		}
	}

	public SubLObject EQ(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean eql(char c) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean eql(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

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

	public SubLObject EQL(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean equal(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject EQUAL(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean equalp(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject EQUALP(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SubLObject))
			return false;
		return this.eql((SubLObject) obj);
	}

	public SubLObject eval(SubLEnvironment env) {
		return this;
	}

	public SubLObject EVENP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject arg) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject args, Environment env) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject[] args) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLFloat fceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.fceiling");
		return null;
	}

	public SubLFloat ffloor() {
		Errors.unimplementedMethod("AbstractSubLNumber.ffloor");
		return null;
	}

	public SubLObject fifth() {
		return this.get(4);
	}

	/** Method created to avoid casting */
	public SubLObject first() { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
	}

	public SubLObject FLOATP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLInteger floor() {
		Errors.unimplementedMethod("AbstractSubLNumber.floor");
		return null;
	}

	public SubLObject fourth() {
		return this.get(3);
	}

	public SubLFloat fround() {
		Errors.unimplementedMethod("AbstractSubLNumber.fround");
		return null;
	}

	public SubLFloat ftruncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.ftruncate");
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject get(int index) { // SubLSequence
		Errors.error(this + " is not of type: SEQUENCE.");
		return SubLNil.NIL;
	}

	public SubLObject get(SubLObject obj) { // SubLHashTable
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public boolean getBooleanValue() {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject getCallCount() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public SubLCharacter getCharacter(int index) { // SubLString
		Errors.error(this + " is not of type: STRING.");
		return null;
	}

	public SubLObject getDescription() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getDocumentation(SubLObject docType) {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField(int fieldNum) { // SubLStruct
		Errors.error(this + " is not of type: STRUCT.");
		return SubLNil.NIL;
	}

	/** Method created to avoid casting */
	public SubLObject getField0() {
		this.structFieldError(0);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField1() {
		this.structFieldError(1);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField10() {
		this.structFieldError(10);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField11() {
		this.structFieldError(11);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField12() {
		this.structFieldError(12);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField13() {
		this.structFieldError(13);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField14() {
		this.structFieldError(14);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField15() {
		this.structFieldError(15);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField16() {
		this.structFieldError(16);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField17() {
		this.structFieldError(17);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField18() {
		this.structFieldError(18);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField19() {
		this.structFieldError(19);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField2() {
		this.structFieldError(2);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField20() {
		this.structFieldError(20);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField3() {
		this.structFieldError(3);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField4() {
		this.structFieldError(4);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField5() {
		this.structFieldError(5);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField6() {
		this.structFieldError(6);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField7() {
		this.structFieldError(7);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField8() {
		this.structFieldError(8);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField9() {
		this.structFieldError(9);
		return null;
	}

	/** Method created to avoid instanceof tests */
	public String getFileDesignator() {
		Errors.error(this + " is not a file name designator.");
		return null;
	}

	public int getFixnumSlotValue(int index) {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLFunction getFunc() { // SubLFunction
		Errors.error(this + " is not of type: FUNCTION.");
		return null;
	}

	public int getHotCount() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLObject getParts() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getPropertyList() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_0() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_1() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_2() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_3() {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean getSlotValueAsBoolean(int index) {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLStream getStream(boolean followSynonymStream) { // SubLStream
		Errors.error(this + " is not of type: STREAM.");
		return null;
	}

	/** Method created to avoid casting */
	public String getString() { // SubLString
		Errors.error(this + " is not of type: STRING.");
		return "";
	}

	public char[] getStringChars() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSymbolFunction() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSymbolFunctionOrDie() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSymbolValue() {
		this.unimplimentedLispFunction();
		return null;
	}

	public int hashCode() {
		return this.hashCode(0);
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.getNativeNumber().hashCode();
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	public int hashCodeLisp() {
		return this.hashCode();
	}

	public boolean hasKey(SubLObject obj) { // SubLKeyhash
		Errors.error(this + " is not of type: KEYHASH.");
		return false;
	}

	public SubLNumber hyperbolicArcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcCosine");
		return null;
	}

	public SubLNumber hyperbolicArcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcSine");
		return null;
	}

	public SubLNumber hyperbolicArcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcTangent");
		return null;
	}

	public SubLNumber hyperbolicCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicCosine");
		return null;
	}

	public SubLNumber hyperbolicSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicSine");
		return null;
	}

	public SubLNumber hyperbolicTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicTangent");
		return null;
	}

	public SubLNumber increment() {
		Errors.unimplementedMethod("AbstractSubLNumber.increment");
		return null;
	}

	public SubLNumber increment(SubLNumber incrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.increment");
		return null;
	}

	public void incrementCallCount(int arity) {
		this.unimplimentedLispFunction();

	}

	public void incrementHotCount() {
		this.unimplimentedLispFunction();

	}

	public SubLObject INTEGERP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_E(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_GE(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_GT(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_LE(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_LT(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_NE(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean isAlien() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isArrayBased() { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return true;
	}

	public boolean isCharacter() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isEqualTo(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isEven() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isGreaterThan(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isGreaterThanOrEqualTo(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isLessThan(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isLessThanOrEqualTo(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isNotEqualTo(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isNotEqualTo(SubLObject obj) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isOdd() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isPackageIterator() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSpecialOperator() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isSpecialVariable() {
		this.unimplimentedLispFunction();
		return false;
	}

	public Object javaInstance() {
		this.unimplimentedLispFunction();
		return null;
	}

	public <T> Object javaInstance(Class<T> c) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject last(int i) { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return this;
	}

	public SubLObject LDB(int size, int position) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LENGTH() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LISTP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public Object lockableInstance() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber log() {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	public SubLNumber log(SubLNumber base) {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	public SubLObject LOGAND(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGAND(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGIOR(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGIOR(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGNOT() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGXOR(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGXOR(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public SubLNumber max(SubLNumber num) {
		return this.numL(num) ? num : this;
	}

	public SubLNumber min(SubLNumber num) {
		return this.numL(num) ? this : num;
	}

	public SubLObject MINUSP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLInteger mod(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.mod");
		return null;
	}

	public SubLObject MOD(int divisor) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject MOD(SubLObject divisor) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber multiply(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.multiply");
		return null;
	}

	public SubLObject multiplyBy(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject negate() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject ninth() {
		return this.get(8);
	}

	public SubLObject noFillPointer() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject NOT() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject nreverse() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject NTH(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject NTH(SubLObject arg) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject nthCdr(int index) { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLObject NUMBERP() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public boolean numE(SubLObject num) { // SubLNumber
		if (this.getNumSize() >= num.getNumSize())
			return this.numericallyEqualInternal(num);
		else
			return num.toNumber().numericallyEqualInternal(this);
	}

	public SubLObject NUMERATOR() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public boolean numG(SubLObject num) { // SubLNumber
		if (this.getNumSize() >= num.getNumSize())
			return this.greaterThanInternal(num);
		else
			return num.toNumber().lessThanInternal(this);
	}

	/** Method created to avoid casting */
	public boolean numGE(SubLObject num) { // SubLNumber
		if (this.getNumSize() >= num.getNumSize())
			return this.greaterThanOrEqualInternal(num);
		else
			return num.toNumber().lessThanOrEqualInternal(this);
	}

	/** Method created to avoid casting */
	public boolean numL(SubLObject num) { // SubLNumber
		if (this.getNumSize() >= num.getNumSize())
			return this.lessThanInternal(num);
		else
			return num.toNumber().greaterThanInternal(this);
	}

	/** Method created to avoid casting */
	public boolean numLE(SubLObject num) { // SubLNumber
		if (this.getNumSize() >= num.getNumSize())
			return this.lessThanOrEqualInternal(num);
		else
			return num.toNumber().greaterThanOrEqualInternal(this);
	}

	public SubLObject ODDP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject PLUSP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber pow(SubLNumber power) {
		Errors.unimplementedMethod("AbstractSubLNumber.pow");
		return null;
	}

	public int psxhash() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public int psxhash(int depth) {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLObject push(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject put(SubLObject key, SubLObject value) { // SubLHashTable
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public boolean rationalp() {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject RATIONALP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean realp() {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject REALP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) { // SubLSymbol
		Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
	}

	public SubLInteger remainder(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.remainder");
		return null;
	}

	/** Method created to avoid casting */
	public boolean remKey(SubLObject obj) { // SubLKeyhash
		Errors.error(this + " is not of type: HASHTABLE.");
		return false;
	}

	/** Method created to avoid casting */
	public SubLObject remove(SubLObject obj) { // SubLHashTable
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public SubLObject resolve() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject rest() { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
	}

	public SubLObject reverse() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public SubLSequence reverse(boolean isDestructive) { // SubLSequence
		Errors.error(this + " is not of type: SEQUENCE.");
		return SubLNil.NIL;
	}

	public SubLInteger round() {
		Errors.unimplementedMethod("AbstractSubLNumber.round");
		return null;
	}

	public SubLObject SCHAR(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject second() {
		return this.get(1);
	}

	/** Method created to avoid casting */
	public void set(int index, SubLObject val) { // SubLSequence
		Errors.error(this + " is not of type: SEQUENCE.");
	}

	public void setCallCount(int n) {
		this.unimplimentedLispFunction();

	}

	public void setCar(SubLObject obj) {
		this.unimplimentedLispFunction();

	}

	public void setCdr(SubLObject obj) {
		this.unimplimentedLispFunction();

	}

	public void setDocumentation(SubLObject docType, SubLObject documentation) {
		this.unimplimentedLispFunction();

	}

	/** Method created to avoid casting */
	public void setField(int fieldNum, SubLObject value) { // SubLStruct
		Errors.error(this + " is not of type: STRUCT.");
	}

	/** Method created to avoid casting */
	public SubLObject setField0(SubLObject newVal) {
		this.structFieldError(0);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField1(SubLObject newVal) {
		this.structFieldError(1);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField10(SubLObject newVal) {
		this.structFieldError(10);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField11(SubLObject newVal) {
		this.structFieldError(11);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField12(SubLObject newVal) {
		this.structFieldError(12);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField13(SubLObject newVal) {
		this.structFieldError(13);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField14(SubLObject newVal) {
		this.structFieldError(14);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField15(SubLObject newVal) {
		this.structFieldError(15);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField16(SubLObject newVal) {
		this.structFieldError(16);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField17(SubLObject newVal) {
		this.structFieldError(17);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField18(SubLObject newVal) {
		this.structFieldError(18);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField19(SubLObject newVal) {
		this.structFieldError(19);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField2(SubLObject newVal) {
		this.structFieldError(2);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField20(SubLObject newVal) {
		this.structFieldError(20);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField3(SubLObject newVal) {
		this.structFieldError(3);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField4(SubLObject newVal) {
		this.structFieldError(4);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField5(SubLObject newVal) {
		this.structFieldError(5);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField6(SubLObject newVal) {
		this.structFieldError(6);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField7(SubLObject newVal) {
		this.structFieldError(7);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField8(SubLObject newVal) {
		this.structFieldError(8);
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject setField9(SubLObject newVal) {
		this.structFieldError(9);
		return null;
	}

	/** Method created to avoid casting */
	public SubLCons setFirst(SubLObject first) { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public void setHotCount(int n) {
		this.unimplimentedLispFunction();

	}

	public void setPropertyList(SubLObject obj) {
		this.unimplimentedLispFunction();

	}

	/** Method created to avoid casting */
	public SubLCons setRest(SubLObject rest) { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public void setSlotValue(int index, SubLObject value) {
		this.unimplimentedLispFunction();

	}

	public void setSlotValue(SubLObject slotName, SubLObject newValue) {
		this.unimplimentedLispFunction();

	}

	public void setSlotValue_0(SubLObject value) {
		this.unimplimentedLispFunction();

	}

	public void setSlotValue_1(SubLObject value) {
		this.unimplimentedLispFunction();

	}

	public void setSlotValue_2(SubLObject value) {
		this.unimplimentedLispFunction();

	}

	public void setSlotValue_3(SubLObject value) {
		this.unimplimentedLispFunction();

	}

	public SubLObject seventh() {
		return this.get(6);
	}

	public SubLNumber sigNum() {
		Errors.unimplementedMethod("AbstractSubLNumber.sigNum");
		return null;
	}

	public SubLObject SIMPLE_STRING_P() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber sine() {
		Errors.unimplementedMethod("AbstractSubLNumber.sine");
		return null;
	}

	public SubLObject sixth() {
		return this.get(5);
	}

	/** Method created to avoid casting */
	public int size() { // SubLSequence
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	public SubLObject SLOT_VALUE(SubLObject slotName) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber sqrt(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.sqrt");
		return null;
	}

	public SubLObject STRING() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject STRINGP() {
		this.unimplimentedLispFunction();
		return null;
	}

	private void structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
	}

	public SubLObject subtract(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber subtract(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.subtract");
		return null;
	}

	public int superHash() {
		return super.hashCode();
	}

	public SubLObject SVREF(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	public void svset(int index, SubLObject newValue) {
		this.unimplimentedLispFunction();

	}

	public int sxhash() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLObject SYMBOLP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLNumber tangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.tangent");
		return null;
	}

	public SubLObject tenth() {
		return this.get(9);
	}

	public SubLObject third() {
		return this.get(2);
	}

	/** Method created to avoid casting */
	public SubLCharacter toChar() { // SubLCharacter
		Errors.error(this + " is not of type: CHAR.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLCons toCons() { // SubLCons
		Errors.error(this + " is not of type: CONS.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLEnvironment toEnv() { // SubLEnvironment
		Errors.error(this + " is not of type: ENVIRONMENT.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLGuid toGuid() { // SubLGuid
		Errors.error(this + " is not of type: GUID.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLHashtable toHashtable() { // SubLHashtable
		Errors.error(this + " is not of type: HASHTABLE.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
		Errors.error(this + " is not of type: HASHTABLE-ITERATOR.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
		Errors.error(this + " is not of type: INPUT-BINARY-STREAM.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() { // SubLStream
		Errors.error(this + " is not of type: INPUT-STREAM.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputTextStream toInputTextStream() { // SubLStream
		Errors.error(this + " is not of type: INPUT-TEXT-STREAM.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLKeyhash toKeyhash() { // SubLKeyhash
		Errors.error(this + " is not of type: KEYHASH.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLKeyhashIterator toKeyhashIterator() { // SubLKeyhashIterator
		Errors.error(this + " is not of type: KEYHASH-ITERATOR.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLList toList() { // SubLList
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLLock toLock() { // SubLLock
		Errors.error(this + " is not of type: LOCK.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLMacro toMacro() { // SubLMacro
		Errors.error(this + " is not of type: MACRO.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLNumber toNumber() { // SubLNumber
		return this;
	}

	/** Method created to avoid casting */
	public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
		Errors.error(this + " is not of type: OUTPUT-BINARY-STREAM.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLOutputStream toOutputStream() { // SubLStream
		Errors.error(this + " is not of type: OUTPUT-STREAM.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLOutputTextStream toOutputTextStream() { // SubLStream
		Errors.error(this + " is not of type: OUTPUT-TEXT-STREAM.");
		return null;
	}

	public SubLPackage toPackage() { // SubLPackage
		Errors.error(this + " is not of type: PACKAGE.");
		return null;
	}

	
	public SubLPackageIterator toPackageIterator() {
		Errors.error(this + " is not of type: PACKAGE-ITERATOR.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLProcess toProcess() { // SubLProcess
		Errors.error(this + " is not of type: PROCESS.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLReadWriteLock toReadWriteLock() { // SubLReadWriteLock
		Errors.error(this + " is not of type: READ-WRITE-LOCK.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLRegexPattern toRegexPattern() { // SubLHashtableIterator
		Errors.error(this + " is not of type: REGEX-PATTERN.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLSemaphore toSemaphore() { // SubLSemaphore
		Errors.error(this + " is not of type: SEMAPHORE.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLSequence toSeq() { // SubLSequence
		Errors.error(this + " is not of type: SEQUENCE.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLString toStr() { // SubLString
		Errors.error(this + " is not of type: STRING.");
		return null;
	}

	public String toString() {
		return this.getNativeNumber().toString();
	}

	/** Method created to avoid casting */
	public SubLStruct toStruct() { // SubLStruct
		Errors.error(this + " is not of type: STRUCTURE.");
		return null;
	}

	public SubLObject toSubLFunction() {
		this.unimplimentedLispFunction();
		return null;
	}

	/** Method created to avoid casting */
	public SubLSymbol toSymbol() { // SubLSymbol
		Errors.error(this + " is not of type: SYMBOL.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLVector toVect() { // SubLVector
		Errors.error(this + " is not of type: VECTOR.");
		return null;
	}

	public SubLInteger truncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.truncate");
		return null;
	}

	public SubLObject truncate(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject typeOf() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		this.unimplimentedLispFunction();
		return null;
	}

	private void unimplimentedLispFunction() {
		// TODO Auto-generated method stub

	}

	public String unreadableString(String s) {
		this.unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(String s, boolean identity) {
		this.unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(SubLSymbol sym) {
		this.unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(SubLSymbol symbol, boolean identity) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject VECTORP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public void vectorPushExtend(SubLObject element) {
		this.unimplimentedLispFunction();

	}

	public String writeToString() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject ZEROP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public int size(int max) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

}
