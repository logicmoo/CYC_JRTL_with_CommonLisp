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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.math.BigInteger;

//// External Imports

public  interface SubLObject extends Cloneable {
  
  SubLObject eval(SubLEnvironment env) 
  throws InvalidSubLExpressionException;
  
  boolean eql(SubLObject obj);
  boolean equal(SubLObject obj);
  boolean equalp(SubLObject obj);
  
  int hashCode(int currentDepth);
  
  String toTypeName();
  
  boolean canFastHash();
  
  int superHash();
  
  void checkType(SubLSymbol predicate) throws SubLException;
  void enforceType(SubLSymbol predicate) throws SubLException;
  void checkTypeInternal(SubLSymbol predicate) throws SubLException;
  void enforceTypeInternal(SubLSymbol predicate) throws SubLException;
  
  SubLSymbol getType();
  SubLFixnum getTypeCode();
  
  Object clone();
  SubLObject makeCopy();
  SubLObject makeDeepCopy();
  
  /** Functions created to avoid casting */
  int getNumSize();
  SubLObject inc();
  SubLObject dec();
  SubLObject add(SubLObject num);
  SubLObject sub(SubLObject num);
  SubLObject mult(SubLObject num);
  SubLObject currentBinding(SubLObject[] bindings);
  void bind(SubLObject newValue, SubLObject[] bindings);
  void rebind(SubLObject oldValue, SubLObject[] bindings);
  SubLObject get(SubLObject obj); // SubLHashTable
  SubLObject put(SubLObject key, SubLObject value); // SubLHashTable
  SubLObject remove(SubLObject obj); // SubLHashTable
  boolean hasKey(SubLObject obj); // SubLKeyhash
  void addKey(SubLObject key); // SubLKeyhash
  boolean remKey(SubLObject obj); // SubLKeyhash
  int size(); // SubLSequence
  SubLObject get(int index); // SubLSequence
  SubLCharacter getCharacter(int index); // SubLString
  void set(int index, SubLObject val); // SubLSequence
  SubLSequence reverse(boolean isDestructive); // SubLSequence
  boolean numL(SubLObject x); // SubLNumber
  boolean numLE(SubLObject x); // SubLNumber
  boolean numG(SubLObject x); // SubLNumber
  boolean numGE(SubLObject x); // SubLNumber
  boolean numE(SubLObject x); // SubLNumber
  boolean isPositive(); // SubLNumber
  boolean isNegative(); // SubLNumber
  boolean isZero(); // SubLNumber
  int intValue(); // SubLNumber
  long longValue(); // SubLNumber
  double doubleValue(); // SubLNumber
  BigInteger bigIntegerValue(); // SubLNumber
  SubLObject rest(); // SubLList
  SubLObject first(); // SubLList
  SubLCons setFirst(SubLObject first); // SubLList
  SubLCons setRest(SubLObject rest); // SubLList
  SubLList asConsList(); // SubLList
  SubLList asArrayList(); // SubLList
  boolean isArrayBased(); // SubLList
  SubLObject last(int i); // SubLList
  SubLObject nthCdr(int index); // SubLList
  String getString(); // SubLString
  SubLObject getField(int fieldNum); // SubLStruct
  void setField(int fieldNum, SubLObject value); // SubLStruct
  SubLStream getStream(boolean followSynonymStream); // SubLStream
  SubLInputStream toInputStream(); // SubLStream
  SubLInputTextStream toInputTextStream(); // SubLStream
  SubLInputBinaryStream toInputBinaryStream(); // SubLStream
  SubLOutputStream toOutputStream(); // SubLStream
  SubLOutputTextStream toOutputTextStream(); // SubLStream
  SubLOutputBinaryStream toOutputBinaryStream(); // SubLStream
  SubLFunction getFunc(); // SubLFunction
  SubLPackage toPackage(); // SubLPackage
  SubLStruct toStruct(); // SubLPackage
  SubLVector toVect(); // SubLPackage
  SubLSymbol toSymbol(); //SubLSymbol
  SubLList toList(); //SubLList
  SubLSequence toSeq(); //SubLSequence
  SubLCharacter toChar(); // SubLCharacter
  SubLGuid toGuid(); // SubLGuid
  SubLSemaphore toSemaphore(); // SubLSemaphore
  SubLString toStr(); // SubLString
  SubLMacro toMacro(); // SubLMacro
  SubLEnvironment toEnv(); // SubLEnvironment
  SubLCons toCons(); // SubLCons
  SubLNumber toNumber(); // SubLNumber
  SubLProcess toProcess(); // SubLProcess
  SubLLock toLock(); // SubLLock
  SubLReadWriteLock toReadWriteLock(); // SubLReadWriteLock
  SubLInteger toInteger(); // SubLInteger
  SubLFixnum toFixnum(); // SubLInteger
  SubLDoubleFloat toDouble(); //SubLDoubleFloat
  SubLHashtable toHashtable(); //SubLHashtable
  SubLHashtableIterator toHashtableIterator(); //SubLHashtableIterator
  SubLKeyhash toKeyhash(); //SubLKeyhash
  SubLKeyhashIterator toKeyhashIterator(); //SubLKeyhashIterator
  SubLRegexPattern toRegexPattern(); //SubLRegexPattern
  String getFileDesignator(); 
  char charValue(); // SubLCharacter
  SubLObject second();
  SubLObject third();
  SubLObject fourth();
  SubLObject fifth();
  SubLObject sixth();
  SubLObject seventh();
  SubLObject eighth();
  SubLObject ninth();
  SubLObject tenth();
  SubLObject getField0();  //struct
  SubLObject setField0(SubLObject newVal);  //struct
  SubLObject getField1();  //struct
  SubLObject setField1(SubLObject newVal);  //struct
  SubLObject getField2();  //struct
  SubLObject setField2(SubLObject newVal);  //struct
  SubLObject getField3();  //struct
  SubLObject setField3(SubLObject newVal);  //struct
  SubLObject getField4();  //struct
  SubLObject setField4(SubLObject newVal);  //struct
  SubLObject getField5();  //struct
  SubLObject setField5(SubLObject newVal);  //struct
  SubLObject getField6();  //struct
  SubLObject setField6(SubLObject newVal);  //struct
  SubLObject getField7();  //struct
  SubLObject setField7(SubLObject newVal);  //struct
  SubLObject getField8();  //struct
  SubLObject setField8(SubLObject newVal);  //struct
  SubLObject getField9();  //struct
  SubLObject setField9(SubLObject newVal);  //struct
  SubLObject getField10();  //struct
  SubLObject setField10(SubLObject newVal);  //struct
  SubLObject getField11();  //struct
  SubLObject setField11(SubLObject newVal);  //struct
  SubLObject getField12();  //struct
  SubLObject setField12(SubLObject newVal);  //struct
  SubLObject getField13();  //struct
  SubLObject setField13(SubLObject newVal);  //struct
  SubLObject getField14();  //struct
  SubLObject setField14(SubLObject newVal);  //struct
  SubLObject getField15();  //struct
  SubLObject setField15(SubLObject newVal);  //struct
  SubLObject getField16();  //struct
  SubLObject setField16(SubLObject newVal);  //struct
  SubLObject getField17();  //struct
  SubLObject setField17(SubLObject newVal);  //struct
  SubLObject getField18();  //struct
  SubLObject setField18(SubLObject newVal);  //struct
  SubLObject getField19();  //struct
  SubLObject setField19(SubLObject newVal);  //struct
  SubLObject getField20();  //struct
  SubLObject setField20(SubLObject newVal);  //struct
  
  boolean isNil();
  boolean isBoolean();
  boolean isSymbol();
  boolean isKeyword();
  boolean isAtom();
  boolean isCons();
  boolean isList();
  boolean isSequence();
  boolean isNumber();
  boolean isFixnum();
  boolean isBignum();
  boolean isIntBignum();
  boolean isLongBignum();
  boolean isBigIntegerBignum();
  boolean isInteger();
  boolean isDouble();
  boolean isChar();
  boolean isString();
  boolean isVector();
  boolean isFunction();
  boolean isFunctionSpec();
  boolean isMacroOperator();
  boolean isHashtable();
  boolean isProcess();
  boolean isLock();
  boolean isReadWriteLock();
  boolean isStructure();
  boolean isStream();
  boolean isPackage();
  boolean isError();
  boolean isGuid();
  boolean isSemaphore();
  boolean isEnvironment();
  boolean isHashtableIterator();
  boolean isRegexPattern();
  boolean isKeyhash();
  boolean isKeyhashIterator();
  
  
  //@ todo this should be a symbol and looked up dynamically??? --APB
  public static final boolean DO_CHECK_TYPES = false;
  public static final boolean DO_PARANOID_TYPE_CHECKING = false;
  
  
  public static final int MAX_HASH_LENGTH = 8;
  public static final int MAX_HASH_DEPTH = 8;
  public static final int DEFAULT_EXCEEDED_HASH_VALUE = 0;
  
  
}
