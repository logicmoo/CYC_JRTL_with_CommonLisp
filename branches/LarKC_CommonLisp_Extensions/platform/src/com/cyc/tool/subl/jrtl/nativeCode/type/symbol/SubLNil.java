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

package  com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.util.SubLFiles.*;

public  final class SubLNil extends AbstractSubLList implements SubLList, SubLSymbol, SubLBoolean {
  
  //// Constructors
  
  private SubLNil() {
  }
  
  //// Public Area
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_symbol$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.TWO_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLSymbol toSymbol() {
    return this;
  }
  
  public final SubLStream getStream(boolean followSynonymStream) {
    return StreamsLow.$terminal_io$.getValue().getStream(true);
  }
  
  public SubLInputStream toInputStream() { // SubLStream
    return StreamsLow.$standard_input$.toInputStream();
  }
  
  public SubLInputTextStream toInputTextStream() { // SubLStream
    return StreamsLow.$standard_input$.toInputTextStream();
  }
  
  public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
    return StreamsLow.$standard_input$.toInputBinaryStream();
  }
  
  public SubLOutputStream toOutputStream() { // SubLStream
    return StreamsLow.$standard_output$.toOutputStream();
  }
  
  public SubLOutputTextStream toOutputTextStream() { // SubLStream
    return StreamsLow.$standard_output$.toOutputTextStream();
  }
  
  public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
    return StreamsLow.$standard_output$.toOutputBinaryStream();
  }
  
  public final SubLList member(SubLObject item, BinaryFunction test) {
    return this;
  }
  
  public final SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
    return this;
  }
  
  public final int getBindingId() {
    return INVALID_BINDING_INDEX;
  }
  
  public final SubLObject currentBinding(SubLObject[] bindings) {
    return Errors.error("NIL does not have a dynamic binding.");
  }
  
  public final void bind(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Can't bind NIL.");
  }
  
  public final void rebind(SubLObject oldValue, SubLObject[] bindings) {
    Errors.error("Can't rebind NIL.");
  }
  
  public final SubLObject currentBinding(SubLThread thread) {
    return Errors.error("NIL does not have a dynamic binding.");
  }
  
  public final void bind(SubLObject newValue, SubLThread thread) {
    Errors.error("Can't bind NIL.");
  }
  
  public final void rebind(SubLObject oldValue, SubLThread thread) {
    Errors.error("Can't rebind NIL.");
  }
  
  public SubLObject[] toSubLObjectArray() {
    return EMPTY_SUBL_OBJECT_ARRAY;
  }
  
  public static final String NIL_SYMBOL_NAME = "NIL";
  public static final SubLString NIL_SYMBOL_NAME_SUBLSTRING = SubLObjectFactory.makeString(NIL_SYMBOL_NAME);
  
  public static final SubLNil NIL = new SubLNil();
  
  public final Object clone() {
    return this;
  }
  
  public final SubLObject makeCopy() {
    return this;
  }
  
  public final SubLObject makeDeepCopy() {
    return this;
  }
  
  public final SubLCons push(SubLObject item) {
    return SubLObjectFactory.makeList(1, item).toCons();
  }
  
  public final SubLCons pushNew(SubLObject item) {
    return SubLObjectFactory.makeList(1, item).toCons();
  }
  
  public final SubLCons pushNew(SubLObject item, BinaryFunction test) {
    return SubLObjectFactory.makeList(1, item).toCons();
  }
  
  public final SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
    return SubLObjectFactory.makeList(1, item).toCons();
  }
  
  public SubLObject pop() {
    return Errors.error("Nihil ex nihil; NIL is immutable.");
  }
  
  public void setPackage(SubLPackage thePackage) {
    Errors.error("Can't set package on NIL.");
  }
  
  public SubLPackage getPackage() {
    return SubLPackage.SUBLISP_PACKAGE;
  }
  
  public final String getName() { 
    return NIL_SYMBOL_NAME; 
  }
  
  public final SubLString getSubLName() { 
    return NIL_SYMBOL_NAME_SUBLSTRING; 
  }
  
  public boolean isDynamic() {
    return false;
  }
  
  public boolean isGlobal() {
    return true;
  }
  
  public boolean isUndeclared() {
    return false;
  }
  
  public final boolean isConstantSymbol() {
    return true;
  }

  public boolean boundp() {
    return true;
  }
  
  /** assumes we can't define nil as a function */
  public boolean fboundp() {
    return false;
  }
  
  //@ToDo uncomment me -APB
  //public Package getPackage();
  
  public SubLObject getValue() {
    return NIL;
  }
 
  public final SubLObject getDynamicValue(SubLObject[] bindings) {
    return this;
  }
  
  public final void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Can't change the value of NIL.");
  }
 
  public final SubLObject getDynamicValue(SubLThread thread) {
    return this;
  }
  
  public final void setDynamicValue(SubLObject newValue, SubLThread thread) {
    Errors.error("Can't change the value of NIL.");
  }
      
  public SubLObject getDynamicValue() {
    return NIL;
  }
  
  public void setDynamicValue(SubLObject value) {
    Errors.error("Nihil ex nihil; can't set NIL.");
  }
  
  public SubLObject getGlobalValue() {
    return NIL;
  }
  
  public void setGlobalValue(SubLObject value) {
    Errors.error("Nihil ex nihil; can't set NIL.");
  }
  
  public final void setConstantValue(SubLObject value) {
    Errors.error("Nihil ex nihil; can't set NIL.");
  }
  
  public SubLList getPlist() { 
    Errors.unimplementedMethod("SubLNil.getPlist");
    return null; 
  }
  
  public void setFunction(SubLOperator func) {
    Errors.error("Can't define a method for NIL.");
  }
  
  public void setValue(SubLObject value) {
    Errors.error("Nihil ex nihil; can't set NIL.");
  }
  
  public void setProperty(SubLObject indicator, SubLObject value) { 
    Errors.unimplementedMethod("SubLNil.setProperty");
  }
  
  public void removeProperty(SubLObject indicator) { 
    Errors.unimplementedMethod("SubLNil.removeProperty");
  }
  
  public SubLObject getProperty(SubLObject indicator) {
    Errors.unimplementedMethod("SubLNil.getProperty");
    return null;  
  }
  
  public SubLCons setFirst(SubLObject first) {
    return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
  }
  
  public SubLCons setRest(SubLObject rest) {
    return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
  }
  
  public void forceGlobalValue(SubLObject newValue) {
    Errors.error("Nihil ex nihil; NIL is immutable.");
  }
  
  public void setAccessMode(VariableAccessMode accessMode) {}
  
  
  /**
   * Returns the number of elements in this list.  If this list contains
   * more than <tt>Integer.MAX_VALUE</tt> elements, returns
   * <tt>Integer.MAX_VALUE</tt>.
   *
   * @return the number of elements in this list.
   */
  public int size() { return 0; }

  /**
   * Returns an array containing all of the elements in this list in proper
   * sequence.  Obeys the general contract of the
   * <tt>Collection.toArray</tt> method.
   *
   * @return an array containing all of the elements in this list in proper
   *	       sequence.
   * @see Arrays#asList(Object[])
   */
  public Object[] toArray() { return EMPTY_LIST.toArray(); }
  
  /**
   * Returns an array containing all of the elements in this list in proper
   * sequence; the runtime type of the returned array is that of the
   * specified array.  Obeys the general contract of the
   * <tt>Collection.toArray(Object[])</tt> method.
   *
   * @param a the array into which the elements of this list are to
   *		be stored, if it is big enough; otherwise, a new array of the
   * 		same runtime type is allocated for this purpose.
   * @return  an array containing the elements of this list.
   *
   * @throws ArrayStoreException if the runtime type of the specified array
   * 		  is not a supertype of the runtime type of every element in
   * 		  this list.
   */
  public Object[] toArray(Object a[]) { return a; }
  
  public void set(int index, SubLObject item) {
    Errors.error("Nil is immutable.");
  }
 
  public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key, int start, int end, int count) {
    if (start != 0) {
      Errors.error("Invalid start argument " + start);
    } else if ((end != CommonSymbols.PROCESS_TO_END) && (start != end)) {
      Errors.error("Invalid end argument " + end);
    }
    return NIL;
  }
  
  public boolean toBoolean() {
    return false;
  }
  
  public SubLObject nth(int index) {
    return NIL;
  }
  
  public SubLObject nthCdr(int index) {
    return NIL;
  }
  
  public SubLObject first() {
    return NIL;
  }
  
  public SubLObject rest() {
    return NIL;
  }
  
  public boolean equals(Object obj) {
    return (obj == this);
  }
  
  public SubLObject getDottedElement() {
    return NIL;
  }
  
  public SubLObject setDottedElement(SubLObject dottedElement) {
    return Errors.error("NIL is immutable.");
  }
  
  public static String NIL_TYPE_NAME = "NIL";
  
  public String toTypeName() {
    return NIL_TYPE_NAME;
  }
  
  public final SubLObject last(int n) {
    if (n > 1) {
      Errors.error("Can't take the last n items of NIL: " + n);
    }
    return NIL;
  }
  
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return NIL;
  }
  
  public static final boolean toBool(SubLObject object) {
    return (object != NIL);
  }
  
  public final SubLSequence reverse(boolean isDestructive) {
    return NIL;
  }
  
  public final SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
    return NIL;
  }
  
  public final SubLSequence subSeq(int start, int end) {
    return NIL;
  }
  
  public final SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
    return NIL;
  }
  
  public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
    UnaryFunction key, int start, int end, int count) {
    return NIL;
  }
  
  public final SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start, int end) {
    return NIL;
  }
  
  public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test, UnaryFunction key, int start, int end, int count) {
    return NIL;
  }
  
  public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive,
    UnaryFunction key, int start, int end, int count) {
    return NIL;
  }
  
  public final int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return 0;
  }
  
  public final int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return 0;
  }
  
  public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
      UnaryFunction key, int start1, int end1, int start2, int end2) {
    if (otherSeq == this) {
      return SubLSequence.MATCH_EVERYWHERE;
    }
    return 0;
  }
  
  public final int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2, int end2) {
    return SubLSequence.NOT_FOUND;
  }
  
  public final SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
    return otherSeq;
  }
  
  public final int mismatch(SubLSequence seq2, int start1, int end1, int start2, int end2) {
    Errors.unimplementedMethod("SubLNil.mismatch()");
    return -1;
  }
  
  public final SubLObject get(int index) {
    return NIL;
  }
  
  public final SubLSequence delete(int startIndex, int endIndexExclusive) {
    if (startIndex == endIndexExclusive) { return this; }
    return Errors.error("NIL is immutable.").toSeq();
  }
  
  public final SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int count) {
    return Errors.error("NIL is immutable.").toSeq();
  }
  
  public final int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return NOT_FOUND;
  }
  
  public final int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return NOT_FOUND;
  }
  
  public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return NIL;
  }
  
  public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return NIL;
  }
  
  public SubLSequence fill(SubLObject item, int start, int end) {
    return Errors.error("NIL is immutable.").toSeq();
  }
  
  public final SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
    int size = newBuf.size();
    ArrayList<SubLObject> theBuf = new ArrayList<SubLObject>(size);
    for (int i = 0; i < size; i++) {
      theBuf.add((SubLObject)newBuf.get(i));
    }
    SubLSequence result = SubLObjectFactory.makeList_Dangerous(theBuf);
    return result;
  }
  
  public final SubLSequence concatenate(SubLObject[] sequences) {
    return concatenate(this, sequences);
  }
  
  public final SubLList asConsList() { 
    return this;
  }
  
  public final SubLList asArrayList() { 
    return this; 
  }
  
  public final boolean isArrayBased() { 
    return true; 
  }
  
  public SubLList addItem(SubLObject item) {
    return SubLObjectFactory.makeList(1, item);
  }
  
  public final String toString() {
    return "NIL";
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public final boolean isNil() { return true; }
  public final boolean isBoolean() { return true; }
  public final boolean isSymbol() { return true; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return true; }
  public final boolean isSequence() { return true; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private static final SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];
  
  private static final List<SubLObject> EMPTY_LIST = Collections.unmodifiableList(new ArrayList<SubLObject>());

	@Override
	public int getSpecialIndex() {
		unimplimentedLispFunction();
		return 0;
	}

	@Override
	public void setLispPackage(SubLObject nil) {
		unimplimentedLispFunction();
		
	}

	@Override
	public void setSpecialIndex(int n) {
		unimplimentedLispFunction();
		
	}
  
}
