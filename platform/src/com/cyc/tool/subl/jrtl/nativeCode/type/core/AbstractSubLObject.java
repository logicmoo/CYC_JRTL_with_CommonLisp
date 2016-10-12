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

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractLispObject;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public abstract class AbstractSubLObject extends AbstractLispObject implements SubLObject {

	//// Constructors

	//// Public Area

	public SubLObject add(SubLObject num) { // SubLNumber
		return this.type_error(this, "NUMBER");
	}

	// Default implementations for other equality methods:

	/** Method created to avoid casting */
	public void addKey(SubLObject key) { // SubLKeyhash
		this.type_error(this, "KEYHASH");
	}

	public SubLList asArrayList() { // SubLList
		this.type_error(this, "LIST");
		return null;
	}

	public SubLList asConsList() { // SubLList
		this.type_error(this, "LIST");
		return null;
	}

	/** Method created to avoid casting */
	public BigInteger bigIntegerValue() { // SubLNumber
		this.type_error(this, "NUMBER");
		return BigInteger.ZERO;
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) { // SubLSymbol
		Errors.error("Illegal attempt to bind non symbol: " + this + "");
	}

	/** Method created to avoid casting */
	public char charValue() { // SubLCharacter
		this.type_error(this, "CHAR");
		return 0;
	}

	public void checkType(SubLSymbol predicate) throws SubLException {
		if (SubLObject.DO_CHECK_TYPES)
			this.enforceType(predicate);
	}

	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
		if (SubLObject.DO_PARANOID_TYPE_CHECKING && SubLObject.DO_CHECK_TYPES)
			this.enforceType(predicate);
	}

	public Object clone() {
		Errors.unimplementedMethod("clone()");
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject currentBinding(SubLObject[] bindings) { // SubLSymbol
		Errors.error("Illegal attempt to get binding for non symbol: " + this + "");
		return SubLNil.NIL;
	}

	public SubLObject dec() { // SubLNumber
		return this.type_error(this, "NUMBER");
	}

	/** Method created to avoid casting */
	public double doubleValue() { // SubLNumber
		this.type_error(this, "NUMBER");
		return Double.MIN_VALUE;
	}

	public SubLObject eighth() {
		return this.get(7);
	}

	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "." + " Wanted type: "
					+ predicate + " Actual type: " + this.toTypeName()));
	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
		if (SubLObject.DO_PARANOID_TYPE_CHECKING) {
			UnaryFunction Function = UnaryFunction.makeInstance(predicate);
			if (SubLNil.NIL == Function.processItem(this))
				Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "."
						+ " Wanted type: " + predicate + " Actual type: " + this.toTypeName()));
		}
	}

	/** By default, eql just trampolines down to eq. */
	public boolean eql(SubLObject obj) {
		return obj == this;
	}

	/** By default, equal just trampolines down to eql. */
	public boolean equal(SubLObject obj) {
		return this.eql(obj) || super.equal(obj);
	}

	/** By default, equalp just trampolines down to equal. */
	public boolean equalp(SubLObject obj) {
		return this.equal(obj) || super.equalp(obj);
	}

	/**
	 * SubLObjects are not equal to non-SubLObjects unless this method is
	 * overridden.
	 */
	public boolean equals(Object obj) {
		// @todo return equal(obj);
		return obj == this;
	}

	/** SubL objects are self-evaluating unless this method is overridden. */
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	public SubLObject fifth() {
		return this.get(4);
	}

	/** Method created to avoid casting */
	public SubLObject first() { // SubLList
		this.type_error(this, "LIST");
		return SubLNil.NIL;
	}

	public SubLObject fourth() {
		return this.get(3);
	}

	/** Method created to avoid casting */
	public SubLObject get(int index) { // SubLSequence
		this.type_error(this, "SEQUENCE");
		return SubLNil.NIL;
	}

	public SubLObject get(SubLObject obj) { // SubLHashTable
		this.type_error(this, "HASHTABLE");
		return SubLNil.NIL;
	}

	/** Method created to avoid casting */
	public SubLCharacter getCharacter(int index) { // SubLString
		this.type_error(this, "STRING");
		return null;
	}

	/** Method created to avoid casting */
	public SubLObject getField(int fieldNum) { // SubLStruct
		this.type_error(this, "STRUCT");
		return SubLNil.NIL;
	}

	/** Method created to avoid casting */
	public SubLObject getField0() {
		return this.structFieldError(0);
	}

	/** Method created to avoid casting */
	public SubLObject getField1() {
		return this.structFieldError(1);
	}

	/** Method created to avoid casting */
	public SubLObject getField10() {
		return this.structFieldError(10);
	}

	/** Method created to avoid casting */
	public SubLObject getField11() {
		return this.structFieldError(11);
	}

	/** Method created to avoid casting */
	public SubLObject getField12() {
		return this.structFieldError(12);
	}

	/** Method created to avoid casting */
	public SubLObject getField13() {
		return this.structFieldError(13);
	}

	/** Method created to avoid casting */
	public SubLObject getField14() {
		return this.structFieldError(14);
	}

	/** Method created to avoid casting */
	public SubLObject getField15() {
		return this.structFieldError(15);
	}

	/** Method created to avoid casting */
	public SubLObject getField16() {
		return this.structFieldError(16);
	}

	/** Method created to avoid casting */
	public SubLObject getField17() {
		return this.structFieldError(17);
	}

	/** Method created to avoid casting */
	public SubLObject getField18() {
		return this.structFieldError(18);
	}

	/** Method created to avoid casting */
	public SubLObject getField19() {
		return this.structFieldError(19);
	}

	/** Method created to avoid casting */
	public SubLObject getField2() {
		return this.structFieldError(2);
	}

	/** Method created to avoid casting */
	public SubLObject getField20() {
		return this.structFieldError(20);
	}

	/** Method created to avoid casting */
	public SubLObject getField3() {
		return this.structFieldError(3);
	}

	/** Method created to avoid casting */
	public SubLObject getField4() {
		return this.structFieldError(4);
	}

	/** Method created to avoid casting */
	public SubLObject getField5() {
		return this.structFieldError(5);
	}

	/** Method created to avoid casting */
	public SubLObject getField6() {
		return this.structFieldError(6);
	}

	/** Method created to avoid casting */
	public SubLObject getField7() {
		return this.structFieldError(7);
	}

	/** Method created to avoid casting */
	public SubLObject getField8() {
		return this.structFieldError(8);
	}

	/** Method created to avoid casting */
	public SubLObject getField9() {
		return this.structFieldError(9);
	}

	/** Method created to avoid instanceof tests */
	public String getFileDesignator() {
		Errors.error(this + " is not a file name designator");
		return null;
	}

	/** Method created to avoid casting */
	public SubLFunction getFunc() { // SubLFunction
		this.type_error(this, "FUNCTION");
		return null;
	}

	/** Method created to avoid casting */
	public int getNumSize() { // SubLNumber
		this.type_error(this, "NUMBER");
		return -1;
	}

	public int size(int max) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	/** Method created to avoid casting */
	public SubLStream getStream(boolean followSynonymStream) { // SubLStream
		this.type_error(this, "STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public String getString() { // SubLString
		this.type_error(this, "STRING");
		return "";
	}

	public SubLSymbol getType() {
		Errors.error(this + " does not have a type defined");
		return null;
	}

	public SubLFixnum getTypeCode() {
		Errors.error(this + " does not have a typecode defined");
		return null;
	}

	public int hashCode() {
		return this.hashCode(0);
	}

	public int hashCodeLisp() {
		return super.superHash();
	}

	public boolean hasKey(SubLObject obj) { // SubLKeyhash
		this.type_error(this, "KEYHASH");
		return false;
	}

	public SubLObject inc() { // SubLNumber
		return this.type_error(this, "NUMBER");
	}

	/** Method created to avoid casting */
	public int intValue() { // SubLNumber
		this.type_error(this, "NUMBER");
		return Integer.MIN_VALUE;
	}

	public boolean isAlien() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isArrayBased() { // SubLList
		this.type_error(this, "LIST");
		return true;
	}

	/** Method created to avoid casting */
	public boolean isNegative() { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	public boolean isPackageIterator() {
		// TODO Auto-generated method stub
		return false;
	}

	/** Method created to avoid casting */
	public boolean isPositive() { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	/** Method created to avoid casting */
	public boolean isZero() { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	public SubLObject last(int i) { // SubLList
		this.type_error(this, "LIST");
		return null;
	}

	/** Method created to avoid casting */
	public long longValue() { // SubLNumber
		this.type_error(this, "NUMBER");
		return Long.MIN_VALUE;
	}

	public SubLObject makeCopy() {
		Errors.unimplementedMethod("makeCopy()");
		return null;
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("makeDeepCopy()");
		return null;
	}

	public SubLObject mult(SubLObject num) { // SubLNumber
		return this.type_error(this, "NUMBER");
	}

	public SubLObject ninth() {
		return this.get(8);
	}

	public SubLObject nthCdr(int index) { // SubLList
		this.type_error(this, "LIST");
		return null;
	}

	/** Method created to avoid casting */
	public boolean numE(SubLObject x) { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	/** Method created to avoid casting */
	public boolean numG(SubLObject x) { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	/** Method created to avoid casting */
	public boolean numGE(SubLObject x) { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	/** Method created to avoid casting */
	public boolean numL(SubLObject x) { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	/** Method created to avoid casting */
	public boolean numLE(SubLObject x) { // SubLNumber
		this.type_error(this, "NUMBER");
		return false;
	}

	/** Method created to avoid casting */
	public SubLObject put(SubLObject key, SubLObject value) { // SubLHashTable
		this.type_error(this, "HASHTABLE");
		return SubLNil.NIL;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) { // SubLSymbol
		Errors.error("Illegal attempt to rebind non symbol: " + this + "");
	}

	/** Method created to avoid casting */
	public boolean remKey(SubLObject obj) { // SubLKeyhash
		this.type_error(this, "HASHTABLE");
		return false;
	}

	/** Method created to avoid casting */
	public SubLObject remove(SubLObject obj) { // SubLHashTable
		this.type_error(this, "HASHTABLE");
		return SubLNil.NIL;
	}

	/** Method created to avoid casting */
	public SubLObject rest() { // SubLList
		this.type_error(this, "LIST");
		return SubLNil.NIL;
	}

	/** Method created to avoid casting */
	public SubLSequence reverse(boolean isDestructive) { // SubLSequence
		this.type_error(this, "SEQUENCE");
		return SubLNil.NIL;
	}

	public SubLObject second() {
		return this.get(1);
	}

	/** Method created to avoid casting */
	public void set(int index, SubLObject val) { // SubLSequence
		this.type_error(this, "SEQUENCE");
	}

	/** Method created to avoid casting */
	public void setField(int fieldNum, SubLObject value) { // SubLStruct
		this.type_error(this, "STRUCT");
	}

	/** Method created to avoid casting */
	public SubLObject setField0(SubLObject newVal) {
		return this.structFieldError(0);
	}

	/** Method created to avoid casting */
	public SubLObject setField1(SubLObject newVal) {
		return this.structFieldError(1);
	}

	/** Method created to avoid casting */
	public SubLObject setField10(SubLObject newVal) {
		return this.structFieldError(10);
	}

	/** Method created to avoid casting */
	public SubLObject setField11(SubLObject newVal) {
		return this.structFieldError(11);
	}

	/** Method created to avoid casting */
	public SubLObject setField12(SubLObject newVal) {
		return this.structFieldError(12);
	}

	/** Method created to avoid casting */
	public SubLObject setField13(SubLObject newVal) {
		return this.structFieldError(13);
	}

	/** Method created to avoid casting */
	public SubLObject setField14(SubLObject newVal) {
		return this.structFieldError(14);
	}

	/** Method created to avoid casting */
	public SubLObject setField15(SubLObject newVal) {
		return this.structFieldError(15);
	}

	/** Method created to avoid casting */
	public SubLObject setField16(SubLObject newVal) {
		return this.structFieldError(16);
	}

	/** Method created to avoid casting */
	public SubLObject setField17(SubLObject newVal) {
		return this.structFieldError(17);
	}

	/** Method created to avoid casting */
	public SubLObject setField18(SubLObject newVal) {
		return this.structFieldError(18);
	}

	/** Method created to avoid casting */
	public SubLObject setField19(SubLObject newVal) {
		return this.structFieldError(19);
	}

	/** Method created to avoid casting */
	public SubLObject setField2(SubLObject newVal) {
		return this.structFieldError(2);
	}

	/** Method created to avoid casting */
	public SubLObject setField20(SubLObject newVal) {
		return this.structFieldError(20);
	}

	/** Method created to avoid casting */
	public SubLObject setField3(SubLObject newVal) {
		return this.structFieldError(3);
	}

	/** Method created to avoid casting */
	public SubLObject setField4(SubLObject newVal) {
		return this.structFieldError(4);
	}

	/** Method created to avoid casting */
	public SubLObject setField5(SubLObject newVal) {
		return this.structFieldError(5);
	}

	/** Method created to avoid casting */
	public SubLObject setField6(SubLObject newVal) {
		return this.structFieldError(6);
	}

	/** Method created to avoid casting */
	public SubLObject setField7(SubLObject newVal) {
		return this.structFieldError(7);
	}

	/** Method created to avoid casting */
	public SubLObject setField8(SubLObject newVal) {
		return this.structFieldError(8);
	}

	/** Method created to avoid casting */
	public SubLObject setField9(SubLObject newVal) {
		return this.structFieldError(9);
	}

	/** Method created to avoid casting */
	public SubLCons setFirst(SubLObject first) { // SubLList
		this.type_error(this, "LIST");
		return null;
	}

	/** Method created to avoid casting */
	public SubLCons setRest(SubLObject rest) { // SubLList
		this.type_error(this, "LIST");
		return null;
	}

	public SubLObject seventh() {
		return this.get(6);
	}

	public SubLObject sixth() {
		return this.get(5);
	}

	/** Method created to avoid casting */
	public int size() { // SubLSequence
		this.type_error(this, "SEQUENCE");
		return -1;
	}

	private SubLObject structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			this.type_error(this, "STRUCTURE");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + "");
		return SubLNil.NIL;
	}

	public SubLObject sub(SubLObject num) { // SubLNumber
		return this.type_error(this, "NUMBER");
	}

	public int superHash() {
		return super.superHash();
	}

	public SubLObject tenth() {
		return this.get(9);
	}

	public SubLObject third() {
		return this.get(2);
	}

	/** Method created to avoid casting */
	public SubLCharacter toChar() { // SubLCharacter
		this.type_error(this, "CHAR");
		return null;
	}

	/** Method created to avoid casting */
	public SubLCons toCons() { // SubLCons
		this.type_error(this, "CONS");
		return null;
	}

	/** Method created to avoid casting */
	public SubLDoubleFloat toDouble() { // SubLDoubleFloat
		this.type_error(this, "FLOAT");
		return null;
	}

	/** Method created to avoid casting */
	public SubLEnvironment toEnv() { // SubLEnvironment
		this.type_error(this, "ENVIRONMENT");
		return null;
	}

	/** Method created to avoid casting */
	public SubLFixnum toFixnum() { // SubLFixnum
		this.type_error(this, "FIXNUM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLGuid toGuid() { // SubLGuid
		this.type_error(this, "GUID");
		return null;
	}

	/** Method created to avoid casting */
	public SubLHashtable toHashtable() { // SubLHashtable
		this.type_error(this, "HASHTABLE");
		return null;
	}

	/** Method created to avoid casting */
	public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
		this.type_error(this, "HASHTABLE-ITERATOR");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
		this.type_error(this, "INPUT-BINARY-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() { // SubLStream
		this.type_error(this, "INPUT-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputTextStream toInputTextStream() { // SubLStream
		this.type_error(this, "INPUT-TEXT-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInteger toInteger() { // SubLInteger
		this.type_error(this, "INTEGER");
		return null;
	}

	/** Method created to avoid casting */
	public SubLKeyhash toKeyhash() { // SubLKeyhash
		this.type_error(this, "KEYHASH");
		return null;
	}

	/** Method created to avoid casting */
	public SubLKeyhashIterator toKeyhashIterator() { // SubLKeyhashIterator
		this.type_error(this, "KEYHASH-ITERATOR");
		return null;
	}

	/** Method created to avoid casting */
	public SubLLock toLock() { // SubLLock
		this.type_error(this, "LOCK");
		return null;
	}

	/** Method created to avoid casting */
	public SubLMacro toMacro() { // SubLMacro
		this.type_error(this, "MACRO");
		return null;
	}

	/** Method created to avoid casting */
	public SubLNumber toNumber() { // SubLNumber
		this.type_error(this, "NUMBER");
		return null;
	}

	/** Method created to avoid casting */
	public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
		this.type_error(this, "OUTPUT-BINARY-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLOutputStream toOutputStream() { // SubLStream
		this.type_error(this, "OUTPUT-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLOutputTextStream toOutputTextStream() { // SubLStream
		this.type_error(this, "OUTPUT-TEXT-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLPackage toPackage() { // SubLPackage
		this.type_error(this, "PACKAGE");
		return null;
	}

	/** Method created to avoid casting */
	public SubLProcess toProcess() { // SubLProcess
		this.type_error(this, "PROCESS");
		return null;
	}

	/** Method created to avoid casting */
	public SubLReadWriteLock toReadWriteLock() { // SubLLock
		this.type_error(this, "READ-WRITE-LOCK");
		return null;
	}

	/** Method created to avoid casting */
	public SubLRegexPattern toRegexPattern() { // SubLHashtableIterator
		this.type_error(this, "REGEX-PATTERN");
		return null;
	}

	/** Method created to avoid casting */
	public SubLSemaphore toSemaphore() { // SubLSemaphore
		this.type_error(this, "SEMAPHORE");
		return null;
	}

	// /** Method created to avoid casting */
	// public SubLList toList() { // SubLList
	// type_error(this,"LIST");
	// return null;
	// }
	/** Method created to avoid casting */
	public SubLSequence toSeq() { // SubLSequence
		this.type_error(this, "SEQUENCE");
		return null;
	}

	/** Method created to avoid casting */
	public SubLString toStr() { // SubLString
		this.type_error(this, "STRING");
		return null;
	}

	/** Method created to avoid casting */
	public SubLStruct toStruct() { // SubLStruct
		this.type_error(this, "STRUCTURE");
		return null;
	}

	/** Method created to avoid casting */
	public SubLSymbol toSymbol() { // SubLSymbol
		this.type_error(this, "SYMBOL");
		return null;
	}

	public String toTypeName() {
		return "OBJECT";
	}

	/** Method created to avoid casting */
	public SubLVector toVect() { // SubLVector
		this.type_error(this, "VECTOR");
		return null;
	}

	private SubLObject type_error(AbstractSubLObject abstractSubLObject, String string) {
		return Lisp.type_error(this, LispObjectFactory.makeString(string));
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main
	// public String writeToString()
	// {
	// return toString();
	// }
}
