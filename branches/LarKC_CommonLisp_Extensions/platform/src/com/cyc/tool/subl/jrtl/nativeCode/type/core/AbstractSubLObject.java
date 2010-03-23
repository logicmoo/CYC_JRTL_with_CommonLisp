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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractLispObject;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

import java.math.BigInteger;



//// External Imports

public  abstract class AbstractSubLObject extends AbstractLispObject implements SubLObject {
  
  //// Constructors
  
  //// Public Area
  
  /** SubL objects are self-evaluating unless this method is overridden. */
  public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
    return this;
  }
  
  // Default implementations for other equality methods:
  
  /** By default, eql just trampolines down to eq. */
  public boolean eql(SubLObject obj) {
    return (obj == this);
  }
  
  /** By default, equal just trampolines down to eql. */
  public boolean equal(SubLObject obj) {
    return eql(obj) || super.equal(obj);
  }
  
  /** By default, equalp just trampolines down to equal. */
  public boolean equalp(SubLObject obj) {
    return equal(obj) || super.equalp(obj);
  }
  
  /** SubLObjects are not equal to non-SubLObjects unless this method is overridden. */
  public boolean equals(Object obj) {
    // @todo return equal(obj);
    return (obj == this);
  }
  
  public final void checkType(SubLSymbol predicate) throws SubLException {
    if (SubLObject.DO_CHECK_TYPES) {
      enforceType(predicate);
    }
  }
  
  public final void enforceType(SubLSymbol predicate) throws SubLException {
    UnaryFunction Function = UnaryFunction.makeInstance(predicate);
    if (SubLNil.NIL == Function.processItem(this)) {
      Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "."
        + " Wanted type: " + predicate + " Actual type: " + toTypeName()));
    }
  }
  
  public final void checkTypeInternal(SubLSymbol predicate) throws SubLException {
     if (SubLObject.DO_PARANOID_TYPE_CHECKING && SubLObject.DO_CHECK_TYPES) {
      enforceType(predicate);
    }
  }
  
  public final void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
    if (SubLObject.DO_PARANOID_TYPE_CHECKING) {
      UnaryFunction Function = UnaryFunction.makeInstance(predicate);
      if (SubLNil.NIL == Function.processItem(this)) {
        Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "."
          + " Wanted type: " + predicate + " Actual type: " + toTypeName()));
      }
    }
  }
  
  public final int hashCode() {
    return hashCode(0);
  }
  
  public final int superHash() {
    return super.superHash();
  }
  
	public int hashCodeLisp() {
		return super.superHash();
  }

  public String toTypeName() {
    return "OBJECT";
  }
  
  public SubLSymbol getType(){ 
    Errors.error(this + " does not have a type defined");
    return null;
  }
  
  public SubLFixnum getTypeCode() {
    Errors.error(this + " does not have a typecode defined");
    return null;
  }
  
  public Object clone() {
    Errors.unimplementedMethod("clone()");
    return null;
  }
  
  public SubLObject makeCopy() {
    Errors.unimplementedMethod("makeCopy()");
    return null;
  }
  
  public SubLObject makeDeepCopy() {
    Errors.unimplementedMethod("makeDeepCopy()");
    return null;
  }
  
  /** Method created to avoid casting */
  public int getNumSize() { //SubLNumber
    type_error(this,"NUMBER");
    return -1;
  }
  public SubLObject inc() { //SubLNumber
    return type_error(this,"NUMBER");
  }
  public SubLObject dec() { //SubLNumber
    return type_error(this,"NUMBER");
  }
  public SubLObject add(SubLObject num) { //SubLNumber
    return type_error(this,"NUMBER");
  }
  public SubLObject sub(SubLObject num) { //SubLNumber
    return type_error(this,"NUMBER");
  }
  public SubLObject mult(SubLObject num) { //SubLNumber
    return type_error(this,"NUMBER");
  }
  /** Method created to avoid casting */
  public SubLObject currentBinding(SubLObject[] bindings) { //SubLSymbol
    Errors.error("Illegal attempt to get binding for non symbol: " + this + "");
    return SubLNil.NIL;
  }
  public void bind(SubLObject newValue, SubLObject[] bindings) { //SubLSymbol
    Errors.error("Illegal attempt to bind non symbol: " + this + "");
  }
  public void rebind(SubLObject oldValue, SubLObject[] bindings) { //SubLSymbol
    Errors.error("Illegal attempt to rebind non symbol: " + this + "");
  }
  private SubLObject type_error(AbstractSubLObject abstractSubLObject, String string) {
  	 return Lisp.type_error(this, LispObjectFactory.makeString(string));
  }
  /** Method created to avoid casting */
  public SubLCharacter getCharacter(int index) { // SubLString
    type_error(this,"STRING");
    return null;
  }
  public SubLObject get(SubLObject obj) { // SubLHashTable
    type_error(this,"HASHTABLE");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject put(SubLObject key, SubLObject value) { // SubLHashTable
    type_error(this,"HASHTABLE");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject remove(SubLObject obj) { // SubLHashTable
    type_error(this,"HASHTABLE");
    return SubLNil.NIL;
  }
  public boolean hasKey(SubLObject obj) { // SubLKeyhash
    type_error(this,"KEYHASH");
    return false;
  }
  /** Method created to avoid casting */
  public void addKey(SubLObject key) { // SubLKeyhash
    type_error(this,"KEYHASH");
  }
  /** Method created to avoid casting */
  public boolean remKey(SubLObject obj) { // SubLKeyhash
    type_error(this,"HASHTABLE");
    return false;
  }
  /** Method created to avoid casting */
  public int size() { // SubLSequence
    type_error(this,"SEQUENCE");
    return -1;
  }
  /** Method created to avoid casting */
  public SubLObject get(int index) { // SubLSequence
    type_error(this,"SEQUENCE");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public void set(int index, SubLObject val) { // SubLSequence
    type_error(this,"SEQUENCE");
  }
  /** Method created to avoid casting */
  public SubLSequence reverse(boolean isDestructive) { // SubLSequence
    type_error(this,"SEQUENCE");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public boolean numL(SubLObject x) { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numLE(SubLObject x) { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numG(SubLObject x) { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numGE(SubLObject x) { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numE(SubLObject x) { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean isPositive() { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean isNegative() { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public boolean isZero() { // SubLNumber
    type_error(this,"NUMBER");
    return false;
  }
  /** Method created to avoid casting */
  public int intValue() { // SubLNumber
    type_error(this,"NUMBER");
    return Integer.MIN_VALUE;
  }
  /** Method created to avoid casting */
  public long longValue() { // SubLNumber
    type_error(this,"NUMBER");
    return Long.MIN_VALUE;
  }
  /** Method created to avoid casting */
  public double doubleValue() { // SubLNumber
    type_error(this,"NUMBER");
    return Double.MIN_VALUE;
  }
  /** Method created to avoid casting */
  public BigInteger bigIntegerValue() { // SubLNumber
    type_error(this,"NUMBER");
    return BigInteger.ZERO;
  }
  /** Method created to avoid casting */
  public SubLObject rest() { // SubLList
    type_error(this,"LIST");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject first() { // SubLList
    type_error(this,"LIST");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLCons setFirst(SubLObject first) { // SubLList
    type_error(this,"LIST");
    return null;
  }
  /** Method created to avoid casting */
  public SubLCons setRest(SubLObject rest) { // SubLList
    type_error(this,"LIST");
    return null;
  }
  public SubLList asConsList() { // SubLList
    type_error(this,"LIST");
    return null;
  }
  public SubLList asArrayList() { // SubLList
    type_error(this,"LIST");
    return null;
  }
  public boolean isArrayBased() { // SubLList
    type_error(this,"LIST");
    return true;
  }
  public SubLObject last(int i) { // SubLList
    type_error(this,"LIST");
    return null;
  }
  public SubLObject nthCdr(int index) { // SubLList
    type_error(this,"LIST");
    return null;
  }
  /** Method created to avoid casting */
  public String getString() { // SubLString
    type_error(this,"STRING");
    return "";
  }
  /** Method created to avoid casting */
  public SubLObject getField(int fieldNum) { // SubLStruct
    type_error(this,"STRUCT");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public void setField(int fieldNum, SubLObject value) { // SubLStruct
    type_error(this,"STRUCT");
  }
  /** Method created to avoid casting */
  public SubLStream getStream(boolean followSynonymStream) { // SubLStream
    type_error(this,"STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInputStream toInputStream() { // SubLStream
    type_error(this,"INPUT-STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInputTextStream toInputTextStream() { // SubLStream
    type_error(this,"INPUT-TEXT-STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
    type_error(this,"INPUT-BINARY-STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLOutputStream toOutputStream() { // SubLStream
    type_error(this,"OUTPUT-STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLOutputTextStream toOutputTextStream() { // SubLStream
    type_error(this,"OUTPUT-TEXT-STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
    type_error(this,"OUTPUT-BINARY-STREAM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLFunction getFunc() { // SubLFunction
    type_error(this,"FUNCTION");
    return null;
  }
  /** Method created to avoid casting */
  public SubLPackage toPackage() { // SubLPackage
    type_error(this,"PACKAGE");
    return null;
  }
  /** Method created to avoid casting */
  public SubLStruct toStruct() { // SubLStruct
    type_error(this,"STRUCTURE");
    return null;
  }
  /** Method created to avoid casting */
  public SubLVector toVect() { // SubLVector
    type_error(this,"VECTOR");
    return null;
  }
  /** Method created to avoid casting */
  public SubLSymbol toSymbol() { // SubLSymbol
    type_error(this,"SYMBOL");
    return null;
  }
//  /** Method created to avoid casting */
//  public SubLList toList() { // SubLList
//    type_error(this,"LIST");
//    return null;
//  }
  /** Method created to avoid casting */
  public SubLSequence toSeq() { // SubLSequence
    type_error(this,"SEQUENCE");
    return null;
  }
  /** Method created to avoid casting */
  public SubLCharacter toChar() { // SubLCharacter
    type_error(this,"CHAR");
    return null;
  }
  /** Method created to avoid casting */
  public SubLGuid toGuid() { // SubLGuid
    type_error(this,"GUID");
    return null;
  }
  /** Method created to avoid casting */
  public SubLSemaphore toSemaphore() { // SubLSemaphore
    type_error(this,"SEMAPHORE");
    return null;
  }
  /** Method created to avoid casting */
  public SubLString toStr() { // SubLString
    type_error(this,"STRING");
    return null;
  }
  /** Method created to avoid casting */
  public SubLMacro toMacro() { // SubLMacro
    type_error(this,"MACRO");
    return null;
  }
  /** Method created to avoid casting */
  public SubLEnvironment toEnv() { // SubLEnvironment
    type_error(this,"ENVIRONMENT");
    return null;
  }
  /** Method created to avoid casting */
  public SubLCons toCons() { // SubLCons
    type_error(this,"CONS");
    return null;
  }
  /** Method created to avoid casting */
  public final SubLNumber toNumber() { // SubLNumber
    type_error(this,"NUMBER");
    return null;
  }
  /** Method created to avoid casting */
  public final SubLProcess toProcess() { // SubLProcess
    type_error(this,"PROCESS");
    return null;
  }
  /** Method created to avoid casting */
  public SubLLock toLock() { // SubLLock
    type_error(this,"LOCK");
    return null;
  }
  /** Method created to avoid casting */
  public SubLReadWriteLock toReadWriteLock() { // SubLLock
    type_error(this,"READ-WRITE-LOCK");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInteger toInteger() { // SubLInteger
    type_error(this,"INTEGER");
    return null;
  }
  /** Method created to avoid casting */
  public SubLFixnum toFixnum() { // SubLFixnum
    type_error(this,"FIXNUM");
    return null;
  }
  /** Method created to avoid casting */
  public SubLDoubleFloat toDouble() { // SubLDoubleFloat
    type_error(this,"FLOAT");
    return null;
  }
  /** Method created to avoid casting */
  public SubLHashtable toHashtable() { // SubLHashtable
    type_error(this,"HASHTABLE");
    return null;
  }
  /** Method created to avoid casting */
  public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
    type_error(this,"HASHTABLE-ITERATOR");
    return null;
  }
  /** Method created to avoid casting */
  public SubLKeyhash toKeyhash() { // SubLKeyhash
    type_error(this,"KEYHASH");
    return null;
  }
  /** Method created to avoid casting */
  public SubLKeyhashIterator toKeyhashIterator() { // SubLKeyhashIterator
    type_error(this,"KEYHASH-ITERATOR");
    return null;
  }
  /** Method created to avoid casting */
  public SubLRegexPattern toRegexPattern() { // SubLHashtableIterator
    type_error(this,"REGEX-PATTERN");
    return null;
  }
  /** Method created to avoid casting */
  public char charValue() { // SubLCharacter
    type_error(this,"CHAR");
    return 0;
  }
  /** Method created to avoid instanceof tests */
  public String getFileDesignator() {
    Errors.error(this + " is not a file name designator");
    return null;
  }
  
  private final SubLObject structFieldError(int fieldNum) {
    if (!(this instanceof SubLStruct)) {
      type_error(this ,"STRUCTURE");
    } else {
      Errors.error(this + " does not have a slot: " + fieldNum + "");
    }
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject getField0()  {
    return structFieldError(0);
  }
  /** Method created to avoid casting */
  public SubLObject setField0(SubLObject newVal) {
    return structFieldError(0);
  }
  /** Method created to avoid casting */
  public SubLObject getField1()  {
    return structFieldError(1);
  }
  /** Method created to avoid casting */
  public SubLObject setField1(SubLObject newVal) {
    return structFieldError(1);
  }
  /** Method created to avoid casting */
  public SubLObject getField2() {
    return structFieldError(2);
  }
  /** Method created to avoid casting */
  public SubLObject setField2(SubLObject newVal) {
    return structFieldError(2);
  }
  /** Method created to avoid casting */
  public SubLObject getField3() {
    return structFieldError(3);
  }
  /** Method created to avoid casting */
  public SubLObject setField3(SubLObject newVal) {
    return structFieldError(3);
  }
  /** Method created to avoid casting */
  public SubLObject getField4() {
    return structFieldError(4);
  }
  /** Method created to avoid casting */
  public SubLObject setField4(SubLObject newVal) {
    return structFieldError(4);
  }
  /** Method created to avoid casting */
  public SubLObject getField5() {
    return structFieldError(5);
  }
  /** Method created to avoid casting */
  public SubLObject setField5(SubLObject newVal) {
    return structFieldError(5);
  }
  /** Method created to avoid casting */
  public SubLObject getField6() {
    return structFieldError(6);
  }
  /** Method created to avoid casting */
  public SubLObject setField6(SubLObject newVal) {
    return structFieldError(6);
  }
  /** Method created to avoid casting */
  public SubLObject getField7() {
    return structFieldError(7);
  }
  /** Method created to avoid casting */
  public SubLObject setField7(SubLObject newVal) {
    return structFieldError(7);
  }
  /** Method created to avoid casting */
  public SubLObject getField8() {
    return structFieldError(8);
  }
  /** Method created to avoid casting */
  public SubLObject setField8(SubLObject newVal) {
    return structFieldError(8);
  }
  /** Method created to avoid casting */
  public SubLObject getField9() {
    return structFieldError(9);
  }
  /** Method created to avoid casting */
  public SubLObject setField9(SubLObject newVal) {
    return structFieldError(9);
  }
  /** Method created to avoid casting */
  public SubLObject getField10() {
    return structFieldError(10);
  }
  /** Method created to avoid casting */
  public SubLObject setField10(SubLObject newVal) {
    return structFieldError(10);
  }
  /** Method created to avoid casting */
  public SubLObject getField11() {
    return structFieldError(11);
  }
  /** Method created to avoid casting */
  public SubLObject setField11(SubLObject newVal) {
    return structFieldError(11);
  }
  /** Method created to avoid casting */
  public SubLObject getField12() {
    return structFieldError(12);
  }
  /** Method created to avoid casting */
  public SubLObject setField12(SubLObject newVal) {
    return structFieldError(12);
  }
  /** Method created to avoid casting */
  public SubLObject getField13() {
    return structFieldError(13);
  }
  /** Method created to avoid casting */
  public SubLObject setField13(SubLObject newVal) {
    return structFieldError(13);
  }
  /** Method created to avoid casting */
  public SubLObject getField14() {
    return structFieldError(14);
  }
  /** Method created to avoid casting */
  public SubLObject setField14(SubLObject newVal) {
    return structFieldError(14);
  }
  /** Method created to avoid casting */
  public SubLObject getField15() {
    return structFieldError(15);
  }
  /** Method created to avoid casting */
  public SubLObject setField15(SubLObject newVal) {
    return structFieldError(15);
  }
  /** Method created to avoid casting */
  public SubLObject getField16() {
    return structFieldError(16);
  }
  /** Method created to avoid casting */
  public SubLObject setField16(SubLObject newVal) {
    return structFieldError(16);
  }
  /** Method created to avoid casting */
  public SubLObject getField17() {
    return structFieldError(17);
  }
  /** Method created to avoid casting */
  public SubLObject setField17(SubLObject newVal) {
    return structFieldError(17);
  }
  /** Method created to avoid casting */
  public SubLObject getField18() {
    return structFieldError(18);
  }
  /** Method created to avoid casting */
  public SubLObject setField18(SubLObject newVal) {
    return structFieldError(18);
  }
  /** Method created to avoid casting */
  public SubLObject getField19() {
    return structFieldError(19);
  }
  /** Method created to avoid casting */
  public SubLObject setField19(SubLObject newVal) {
    return structFieldError(19);
  }
  /** Method created to avoid casting */
  public SubLObject getField20() {
    return structFieldError(20);
  }
  /** Method created to avoid casting */
  public SubLObject setField20(SubLObject newVal) {
    return structFieldError(20);
  }

  
  public final SubLObject second() { return get(1); }
  public final SubLObject third() { return get(2); }
  public final SubLObject fourth() { return get(3); }
  public final SubLObject fifth() { return get(4); }
  public final SubLObject sixth() { return get(5); }
  public final SubLObject seventh() { return get(6); }
  public final SubLObject eighth() { return get(7); }
  public final SubLObject ninth() { return get(8); }
  public final SubLObject tenth() { return get(9); }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
//	public String writeToString()
//  {
//    return toString();
//  }
}
