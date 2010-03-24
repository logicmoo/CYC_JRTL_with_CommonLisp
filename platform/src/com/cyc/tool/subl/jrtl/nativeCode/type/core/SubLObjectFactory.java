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
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SimpleString;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;

//// External Imports
import java.util.*;
import java.math.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ExceptionFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLInterpretedFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperatorFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLBroadcastStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSocketStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSynonymStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.util.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

public  final class SubLObjectFactory {
  
  //// Constructors
  
  /** There should only ever be one instance of this */
  private SubLObjectFactory() {}
  public static final SubLObjectFactory me = new SubLObjectFactory();
  
  //// Public Area

  public static final SubLException makeException() {
    return ExceptionFactory.makeException();
  }

  public static final SubLException makeException(String str) {
    return ExceptionFactory.makeException(str);
  }

  public static final SubLException makeException(SubLString str) {
    return ExceptionFactory.makeException(str);
  }

  public static final SubLException makeException(String str, Throwable t) {
    return ExceptionFactory.makeException(str, t);
  }

  public static final SubLException makeException(SubLString str, Throwable t) {
    return ExceptionFactory.makeException(str, t);
  }
  
  public static final SubLKeyhash makeKeyhash() {
    return new SubLKeyhash();
  }
  
  public static final SubLKeyhash makeKeyhash(int size) {
    return new SubLKeyhash(size);
  }
  
  public static final SubLKeyhash makeKeyhash(int size, BinaryFunction test) {
    return new SubLKeyhash(size, test);
  }
  
  public static final SubLRegexPattern makeRegexPattern(String patternStr, int options) {
    return new SubLRegexPattern(patternStr, options);
  }
  
  public static final SubLHashtable makeHashtable() {
    Threads.possiblyHandleInterrupts(true);
    return new SubLHashtable();
  }
  
  public static final SubLHashtable makeHashtable(int size) {
    Threads.possiblyHandleInterrupts(true);
    return new SubLHashtable(size);
  }
  
  public static final SubLHashtable makeHashtable(int size, BinaryFunction test) {
    Threads.possiblyHandleInterrupts(true);
    return new SubLHashtable(size, test);
  }
  
  public static final SubLHashtableIterator makeHashtableIterator(SubLHashtable hashTable) {
    return new SubLHashtableIterator(hashTable);
  }
  
  public static final SubLProcess makeProcess(SubLString symbolName, final SubLFunction func) {
    SafeRunnable safeRunnable = new SafeRunnable() {
      public void safeRun() {
        SubLObject result = Functions.funcall(func);
      }
    };
    return makeProcess(symbolName, safeRunnable);
  }
  
  public static final SubLProcess makeProcess(SubLString symbolName, final Runnable runnable) {
    SafeRunnable safeRunnable = new SafeRunnable() {
      public void safeRun() {
        runnable.run();
      }
    };
    return makeProcess(symbolName, safeRunnable);
  }
  
  public static final SubLProcess makeProcess(SubLString symbolName, final SafeRunnable runnable) {
    // @todo we should make a version of SubLProcess that 
    // can take a SafeRunnable in the constructor --APB
    SubLProcess process = new SubLProcess(symbolName) {
      public void safeRun() {
        runnable.safeRun();
      }
    };
    try {
      SubLThreadPool.getDefaultPool().execute(process);
    } catch (Exception e) {
      Thread.currentThread().interrupt();
    }
    return process;
  }
  
  public static final SubLSymbol makeSymbol(SubLString symbolName, SubLPackage thePackage) {
    return SubLSymbolFactory.makeSymbol(symbolName, thePackage);
  }
  
  /*public static final SubLSymbol makeSymbol(SubLString symbolName, SubLString packageName) {
    return SubLSymbolFactory.makeSymbol(symbolName, packageName);
  }*/
 
  public static final SubLSymbol makeSymbol(SubLString symbolName) {
    return SubLSymbolFactory.makeSymbol(symbolName, (SubLPackage)Packages.$package$.getDynamicValue());
  }
  
  public static final SubLSymbol makeSymbol(String symbolName, SubLPackage thePackage) {
    return SubLSymbolFactory.makeSymbol(symbolName, thePackage);
  }
  
  public static final SubLSymbol makeSymbol(String symbolName, String packageName) {
    return SubLSymbolFactory.makeSymbol(symbolName, packageName);
  }
 
  public static final SubLSymbol makeSymbol(String symbolName) {
    return SubLSymbolFactory.makeSymbol(symbolName, (SubLPackage)Packages.$package$.getDynamicValue());
  }
  
  public static final SubLSymbol makeUninternedSymbol(String symbolName) {
    return SubLSymbolFactory.makeUninternedSymbol(symbolName);
  }
  
  public static final SubLSymbol makeUninternedSymbol(SubLString symbolName) {
    return SubLSymbolFactory.makeUninternedSymbol(symbolName);
  }
  
  public static final SubLSymbol makeKeyword(SubLString symbolName) {
    return SubLSymbolFactory.makeKeyword(symbolName);
  }
  
  public static final SubLSymbol makeKeyword(String symbolName) {
    return SubLSymbolFactory.makeKeyword(symbolName);
  }
  
  public static final SubLCharacter makeChar(String theCharStr) {
    SubLCharacter result = (SubLCharacter)charParsingCache.get(theCharStr);
    if (result != null) { return result; }
    String curCharStr = theCharStr.substring(1);
    if (curCharStr.startsWith("\\")) {
      curCharStr = curCharStr.substring(1);
    } else {
      throw new InvalidSubLExpressionException("Got invalid character format: " + theCharStr);
    }
    if (curCharStr.length() == 0) {
      throw new InvalidSubLExpressionException("Got bad character: " + theCharStr);
    }
    if (curCharStr.length() == 1) {
      result = makeChar(curCharStr.charAt(0));
      charParsingCache.put(theCharStr, result);
      return result;
    }
    SubLCharacter theChar = SubLCharacter.
      getCharFromName(SubLObjectFactory.makeString(curCharStr));
    if (theChar != null) {
      charParsingCache.put(theCharStr, theChar);
      return theChar;
    }
    return Errors.error("Invalid character: " + theCharStr).toChar();
  }
  
  public static final SubLCharacter makeChar(int theChar) {
    return SubLCharacter.makeChar((char)theChar);
  }
  
  public static final SubLCharacter makeChar(char theChar) {
    return SubLCharacter.makeChar(theChar);
  }
  
  public static final SubLCharacter makeChar(Character theChar) {
    return makeChar(theChar.charValue());
  }
  
  public static final SubLBoolean makeBoolean(boolean theBoolean) {
    if (theBoolean) { return SubLT.T; }
    return SubLNil.NIL;
  }
  
  public static final SubLBoolean makeBoolean(Boolean theBoolean) {
    return theBoolean.booleanValue() ? (SubLBoolean)SubLT.T : SubLNil.NIL;
  }
  
  public static final SubLDoubleFloat makeDouble(String theDouble) {
    Threads.possiblyHandleInterrupts(true);
    return SubLNumberFactory.makeDouble(theDouble);
  }
  
  public static final SubLDoubleFloat makeDouble(double theDouble) {
    Threads.possiblyHandleInterrupts(true);
    return SubLNumberFactory.makeDouble(theDouble);
  }
  
  /*public static SubLDoubleFloat makeDouble(Double theDouble) {
    return SubLNumberFactory.makeDouble(theDouble);
  }*/
  
  /** @note string must be  an integer that 
   * begins with a hash like #22R23AJDLS or #O712  */
  public static final SubLNumber makeBasedIntegralNumber(String str) {
    char secondChar = str.charAt(1);
    char thirdChar = str.charAt(2);
    if (Character.isDigit(secondChar)) {
      if (Character.isDigit(thirdChar)) {
        return makeIntegralNumber(str.substring(4), Integer.parseInt("" + secondChar + "" + thirdChar));
      } else {
        return makeIntegralNumber(str.substring(3), Integer.parseInt("" + secondChar));
      }
    } else if ((secondChar == 'b') || (secondChar == 'B')) {
      return makeIntegralNumber(str.substring(2), 2);
    } else if ((secondChar == 'o') || (secondChar == 'O')) {
      return makeIntegralNumber(str.substring(2), 8);
    } else if ((secondChar == 'x') || (secondChar == 'X')) {
      return makeIntegralNumber(str.substring(2), 16);
    }
    throw new InvalidSubLExpressionException("Got invalid number: " + str);
  }
  
  public static final SubLNumber makeIntegralNumber(String str, int base) {
    if (str.endsWith(".")) { str = str.substring(0,  str.length() - 1); }
    if (str.startsWith("+")) { str = str.substring(1); }
    String id = str + "-" + base;
    SubLInteger num = integerParsingCache.get(id);
    if (num != null) { return num; } 
    BigInteger bigInt = null;
    try {
      bigInt = new BigInteger(str, base);
    } catch (Exception e) {
      throw new InvalidSubLExpressionException(e.getMessage());
    }
    num = makeInteger(bigInt);
    integerParsingCache.put(id, num);
    return num;
  }
  
  public static final SubLInteger makeInteger(int theInt) {
    return SubLNumberFactory.makeInteger(theInt);
  }
  
  public static final SubLInteger makeInteger(long theLong) {
    return SubLNumberFactory.makeInteger(theLong);
  }
  
  public static final SubLInteger makeInteger(BigInteger theNum) {
    return SubLNumberFactory.makeInteger(theNum);
  }
  
  public static final SubLInteger makeInteger(String theNum) {
    return SubLNumberFactory.makeInteger(theNum);
  }
  
  public static final SubLInteger makeInteger(String theNum, int radix) {
    return SubLNumberFactory.makeInteger(theNum, radix);
  }
  
  public static final SubLList makeList(boolean isEmpty) {
    if (isEmpty) {
      return SubLNil.NIL;
    } else {
      return makeCons();
    }
  }
  
  public static final SubLList wrapList(SubLList theList) {
    /*if (USE_ARRAY_LISTS) {
      if (theList.isArrayBased()) { return new SubLConsFacade(theList);}
    }*/
    return theList;
  }
  
  public static final SubLObject wrapList(SubLObject theList) {
    /*if (USE_ARRAY_LISTS) {
      if (theList.isArrayBased()) { return new SubLConsFacade(theList.toList()); }
    }*/
    return theList;
  }
  
  public static final SubLList makeList(ArrayList<? extends SubLObject> theList) {
    if (theList.size() <= 0) { return SubLNil.NIL; }
    /*if (USE_ARRAY_LISTS) {
      return wrapList(new SubLArrayList(theList, false));
    } else {*/
      SubLList result = SubLNil.NIL;
      for (int i = theList.size() - 1; i >= 0; i--) { 
        result = new SubLConsPair((SubLObject)theList.get(i), result);
      }
      return result;
    /*}*/
  }
  
  public static final SubLList makeList_Dangerous(ArrayList theList) {
    if (theList.size() <= 0) { return SubLNil.NIL; }
    /*if (USE_ARRAY_LISTS) {
      return wrapList(new SubLArrayList(theList, true));
    } else {*/
      SubLList result = SubLNil.NIL;
      for (int i = theList.size() - 1; i >= 0; i--) { 
        result = new SubLConsPair((SubLObject)theList.get(i), result);
      }
      return result;
    /*}    */
  }
  
  public static final SubLList makeList(int size, SubLObject defaultValue) {
    if (size <= 0) { return SubLNil.NIL; }
    /*if (USE_ARRAY_LISTS) {
      return wrapList(new SubLArrayList(size, defaultValue));
    } else {*/
      SubLList result = SubLNil.NIL;
      for (int i = size - 1; i >= 0; i--) { 
        result = new SubLConsPair(defaultValue, result);
      }
      return result;
    /*}*/
  }
  
  public static final SubLList makeList(Object[] theList) {
    int size = theList.length;
    if (size <= 0) { return SubLNil.NIL; }
    SubLList result;
    /*if (USE_ARRAY_LISTS) {
      result = wrapList(new SubLArrayList(size));
      for (int i = 0; i < size; ) { result.add((SubLObject)theList[i++]); }
    } else {*/
      result = SubLNil.NIL;
      for (int i = size - 1; i >= 0; ) { 
        result = new SubLConsPair((SubLObject)theList[i--], result);
      }
    /*}*/
    return result;
  }
  
  public static final SubLList makeListStar(Object[] theList) {
    int size = theList.length;
    if (size <= 0) { return SubLNil.NIL; }
    size = size - 1;
    /*if (USE_ARRAY_LISTS) {
      SubLList result = wrapList(new SubLArrayList(size));      
      for (int i = 0; i < size; i++) { result.add((SubLObject)theList[i++]); }
      if (size >= 0) {
        result.setDottedElement((SubLObject)theList[size]);
      }
      return result;
    } else {*/
      SubLObject result = (SubLObject)theList[size];
      for (int i = size - 1; i >=0; ) {
        result = new SubLConsPair((SubLObject)theList[i--], result);
      }
      return result.toList();
    /*}*/
  }
  
  /* WARNING: never use this without putting something in it */
  public static final SubLCons makeCons() {
    /*if (USE_ARRAY_LISTS) {
      return wrapList(new SubLArrayList()).toCons();
    } else {*/
      return new SubLConsPair(SubLNil.NIL, SubLNil.NIL);
    /*}*/
  }  
  
  /* WARNING: never use this without putting something in it */
  public static final SubLCons makeCons(final SubLObject first, final SubLObject rest) {
    Threads.possiblyHandleInterrupts(true);
    /*if (USE_ARRAY_LISTS) {
      if ((!rest.isList()) || (!rest.isArrayBased())) {
        return new SubLConsPair(first, rest);
      }
      return wrapList(new SubLArrayList(first, rest)).toCons();
    } else {*/
      return new SubLConsPair(first, rest);
    /*}*/
  }
  
  public static final SubLList makeListS(SubLObject arg, SubLObject[] objects) {
    int objectCount = objects.length;
    if (objectCount == 0) {
      return (SubLList) arg;
    }
    if (objectCount == 1) {
      return SubLObjectFactory.makeCons(arg, objects[0]);
    }
    /*if (USE_ARRAY_LISTS) {
      ArrayList listInternals = new ArrayList(objectCount + 1);
      listInternals.add(arg);
      for (int i = 0, size = objectCount - 1; i < size; i++) {
        listInternals.add(objects[i]);
      }
      SubLList result = makeList_Dangerous(listInternals);
      result.setDottedElement(objects[objectCount - 1]);
      return result;
    } else {*/
      SubLObject result = objects[objectCount - 1];
      for (int i = objectCount - 2; i >= 0; i--) {
        result = makeCons(objects[i], result);
      }
      result = makeCons(arg, result);
      return (SubLList) result;
    /*}*/
  }
  
  public static final SubLObject makeListS(SubLObject finalCdr) {
    return makeListS(finalCdr, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
  }
  
  public static final SubLCons makeListS(SubLObject arg1, SubLObject finalCdr) {
    SubLObject[] args = ((SubLThread)Thread.currentThread()).sublArraySize1;
    args[0] = finalCdr;
    return makeListS(arg1, args).toCons();
  }
  
  public static final SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject finalCdr) {
    SubLObject[] args = ((SubLThread)Thread.currentThread()).sublArraySize2;
    args[0] = arg2;
    args[1] = finalCdr;
    return makeListS(arg1, args).toCons();
  }
  
  public static final SubLCons makeListS(SubLObject arg, SubLObject arg1, SubLListListIterator finalCdr) {
    int objectCount = 2 + finalCdr.itemsRemaining();
    ArrayList<SubLObject> listInternals = new ArrayList<SubLObject>(objectCount + 1);
    listInternals.add(arg);
    listInternals.add(arg1);
    while (finalCdr.hasNext() && (!finalCdr.isNextImproperElement())) {
      listInternals.add((SubLObject)finalCdr.next());
    }
    SubLList result = makeList_Dangerous(listInternals);
    if (finalCdr.isNextImproperElement()) {
      result.setDottedElement(finalCdr.getDottedElement());
    }
    return result.toCons();
  }
  
  public static final SubLCons makeListS(SubLObject arg, SubLObject arg1, SubLObject arg2, SubLListListIterator finalCdr) {
    int objectCount = 3 + finalCdr.itemsRemaining();
    ArrayList<SubLObject> listInternals = new ArrayList<SubLObject>(objectCount + 1);
    listInternals.add(arg);
    listInternals.add(arg1);
    listInternals.add(arg2);
    while (finalCdr.hasNext() && (!finalCdr.isNextImproperElement())) {
      listInternals.add((SubLObject)finalCdr.next());
    }
    SubLList result = makeList_Dangerous(listInternals);
    if (finalCdr.isNextImproperElement()) {
      result.setDottedElement(finalCdr.getDottedElement());
    }
    return result.toCons();
  }
  
  public static final SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject finalCdr) {
    SubLObject[] args = ((SubLThread)Thread.currentThread()).sublArraySize3;
    args[0] = arg2;
    args[1] = arg3;
    args[2] = finalCdr;
    return makeListS(arg1, args).toCons();
  }
  
  public static final SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject finalCdr) {
    SubLObject[] args = ((SubLThread)Thread.currentThread()).sublArraySize4;
    args[0] = arg2;
    args[1] = arg3;
    args[2] = arg4;
    args[3] = finalCdr;
    return makeListS(arg1, args).toCons();
  }
  
  public static final SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject finalCdr) {
    SubLObject[] args = ((SubLThread)Thread.currentThread()).sublArraySize5;
    args[0] = arg2;
    args[1] = arg3;
    args[2] = arg4;    
    args[3] = arg5;
    args[4] = finalCdr;
    return makeListS(arg1, args).toCons();
  }
  
  /* WARNING: never use this without putting something in it */
  public static final SubLCons makeArrayList() {
    /*if (USE_ARRAY_LISTS) {
      return wrapList(new SubLArrayList()).toCons();
    } else {*/
      Errors.error("Array lists are disabled.");
      return null;
    /*}*/
  }
  
  public static final SubLString makeString(String str) {
    Threads.possiblyHandleInterrupts(true);
    return new SimpleString(str);
  }
  
  public static final SubLString makeString(int size, char defaultChar) {
    Threads.possiblyHandleInterrupts(true);
    return new SimpleString(size, defaultChar);
  }
  
  public static final SubLStruct makeStructInterpreted(int size) {
    Threads.possiblyHandleInterrupts(true);
    return new SubLStructInterpreted(size);
  }
  
  public static final SubLStruct makeStructNative(SubLStructDeclNative structDecl) {
    Errors.unimplementedMethod("SubLObjectFactory.makeStructNative()");
    return null;
  }
  
  public static final SubLVector makeVector(int length) {
    Threads.possiblyHandleInterrupts(true);
    if (length > 1000000) {
      try {
        return new SubLVector(length);
      } catch (OutOfMemoryError oome) {
        // we really do have enough memory to continue
        return Errors.error("Not enough memory to allocate vector of size: " + length).toVect();
      }
    } else {
      return new SubLVector(length);
    }
  }
  
  public static final SubLVector makeVector(Object[] items) {  
    Threads.possiblyHandleInterrupts(true);
    SubLVector result = new SubLVector(items.length);
    for (int i = 0, size = items.length; i < size; i++) { 
      result.set(i, (SubLObject)items[i]); 
    }
    return result;
  }
  
  public static final SubLVector makeVector(SubLList list) {
    SubLObject[] data = list.toSubLObjectArray();
    return new SubLVector(data);
  }
  
  public static final SubLVector makeVector(List<SubLObject> list) {
    return new SubLVector(list);
  }
 
  public static final SubLVector makeVector(int length, SubLObject value) {
    Threads.possiblyHandleInterrupts(true);
    if (length > 1000000) {
      try {
        return new SubLVector(length, value);
      } catch (OutOfMemoryError oome) {
        // we really do have enough memory to continue
        return Errors.error("Not enough memory to allocate vector of size: " + length).toVect();
      }
    } else {
      return new SubLVector(length, value);
    }
  }  
  
  public static final SubLLock makeLock(SubLString name) {
    return new SubLLock(name);
  }
  
  // helpers (syntactic sugar)
  
  public static final SubLSymbol makeSublispSymbol(String symbolName) {
    return makeSymbol(symbolName, SubLPackage.SUBLISP_PACKAGE);
  }
  
  public static final SubLSymbol makeCycSymbol(String symbolName) {
    return makeSymbol(symbolName, SubLPackage.CYC_PACKAGE);
  }
  
  public static final SubLCompiledFunction makeCompiledFunction(Method method,
      SubLSymbol functionSymbol, int requiredArgCount,
      int optionalArgCount, boolean allowsRest) {
    return SubLOperatorFactory.makeCompiledFunction(method, functionSymbol, 
        requiredArgCount, optionalArgCount, allowsRest);
  }
  
  public static final SubLCompiledFunction makeCompiledFunction(String methodClassStr, String methodName,
      Class[] methodParameters, Class returnType, SubLSymbol functionSymbol, int requiredArgCount,
      int optionalArgCount, boolean allowsRest) {
    return SubLOperatorFactory.makeCompiledFunction(methodClassStr, methodName, methodParameters, 
        returnType, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
  }
  
  public static final SubLInterpretedFunction makeInterpretedFunction(SubLCons form, SubLEnvironment env) {
    return SubLOperatorFactory.makeInterpretedFunction(form, env);
  }
  
  public static final SubLInterpretedFunction makeInterpretedFunction(SubLSymbol functionSymbol, SubLCons form, SubLEnvironment env) {
    return SubLOperatorFactory.makeInterpretedFunction(functionSymbol, form, env);
  }
  
  public static final SubLMacro makeMacro(SubLFunction macroExpander) {
    return SubLOperatorFactory.makeMacro(macroExpander);
  }
  
  // @ToDo investigate how this is done in our other systems. -APB
  public static final SubLSymbol makeUniqueSymbol() {
    return makeSublispSymbol("&UNIQUE-SYMBOL-" 
      + System.currentTimeMillis() + "-" + random.nextInt() + "-" + (uniquifier++) + "&");
  }
  
  // @ToDo investigate how this is done in our other systems. -APB
  public static final SubLSymbol makeUniqueKeyword() {
    return makeKeyword("&UNIQUE-KEYWORD-" 
      + System.currentTimeMillis() + "-" + random.nextInt() + "-" + (uniquifier++) + "&");
  }
  
  public static final SubLPackage makePackage(SubLString name, SubLList usedPackagesList, SubLList nickNames) {
    return SubLSymbolFactory.makePackage(name, usedPackagesList, nickNames);
  }
  
  //// STREAM CONSTRUCTORS
  
  public static final SubLInputTextStream makeStringInputStream(String str) {
    return SubLStreamFactory.makeStringInputStream(str);
  }
  
  public static final SubLInputTextStream makeStringInputStream(String str, int start, int end) {
    return SubLStreamFactory.makeStringInputStream(str, start, end);
  }
  
  public static final SubLOutputTextStream makeStringOutputStream() {
    return SubLStreamFactory.makeStringOutputStream();
  }
  
  public static final SubLOutputTextStream makeStringOutputStream(int initialSize) {
    return SubLStreamFactory.makeStringOutputStream(initialSize);
  }
  
  public static final SubLBroadcastStream makeBroadcastStream() {
    return SubLStreamFactory.makeBroadcastStream();
  }
  
  public static final SubLBroadcastStream makeBroadcastStream(SubLList streamList) {
    return SubLStreamFactory.makeBroadcastStream(streamList);
  }
  
  public static final SubLStream makeFileStream(String fileName, SubLSymbol direction,
      SubLSymbol elementType, SubLSymbol ifExists, SubLSymbol ifNotExists, 
      SubLObject externalFormat) {
    return SubLStreamFactory.makeFileStream(fileName, direction, elementType, 
      ifExists, ifNotExists, externalFormat);
  }
  
  public static final SubLSynonymStream makeSynonymStream(SubLSymbol streamSymbol) {
    return SubLStreamFactory.makeSynonymStream(streamSymbol);
  }
  
  public static final SubLOutputTextStream makeOutputTextStream(OutputStream stream) {
    return SubLStreamFactory.makeOutputTextStream(stream);
  }
  
  public static final SubLOutputTextStream makeOutputTextStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    return SubLStreamFactory.makeOutputTextStream(fileName, ifExists, ifNotExists);
  }
  
  public static final SubLInputTextStream makeInputTextStream(InputStream stream) {
    return SubLStreamFactory.makeInputTextStream(stream);
  }
  
  public static final SubLInputTextStream makeInputTextStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    return SubLStreamFactory.makeInputTextStream(fileName, ifExists, ifNotExists);
  }
  
  public static final SubLOutputBinaryStream makeOutputBinaryStream(OutputStream stream) {
    return SubLStreamFactory.makeOutputBinaryStream(stream);
  }
  
  public static final SubLOutputBinaryStream makeOutputBinaryStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    return SubLStreamFactory.makeOutputBinaryStream(fileName, ifExists, ifNotExists);
  }
  
  public static final SubLInputBinaryStream makeInputBinaryStream(InputStream stream) {
    return SubLStreamFactory.makeInputBinaryStream(stream);
  }
  
  public static final SubLInputBinaryStream makeInputBinaryStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    return SubLStreamFactory.makeInputBinaryStream(fileName, ifExists, ifNotExists);
  }
  
  public static final SubLInOutTextStream makeInOutTextStream(SubLInputTextStream inStream, 
      SubLOutputTextStream outStream) {
    return SubLStreamFactory.makeInOutTextStream(inStream, outStream);
  }
  
  public static final SubLInOutBinaryStream makeInOutBinaryStream(SubLInputBinaryStream inStream, 
      SubLOutputBinaryStream outStream) {
    return SubLStreamFactory.makeInOutBinaryStream(inStream, outStream);
  }
  
  public static final SubLInOutTextStream makeInOutTextStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    return SubLStreamFactory.makeInOutTextStream(fileName, ifExists, ifNotExists);
  }
  
  public static final SubLInOutBinaryStream makeInOutBinaryStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    return SubLStreamFactory.makeInOutBinaryStream(fileName, ifExists, ifNotExists);
  } 
  
  public static final SubLSocketStream makeSocketStream(String host, int port) {
    return SubLStreamFactory.makeSocketStream(host, port);
  }
  
  public static final SubLSocketStream makeSocketStream(Socket socket) {
    return SubLStreamFactory.makeSocketStream(socket);
  }
  
  //// GUID FACTORY METHODS
  
  public static final SubLGuid makeGuid() {
    return new SubLGuid();
  }
  
  public static final SubLGuid makeGuid(String guidString) {
    return new SubLGuid(guidString);
  }
  
  public static final SubLGuid makeGuid(SubLVector data) {
    return new SubLGuid(data);
  }
  
  //// SEMAPHORE FACTORY METHODS
  
  public static final SubLSemaphore makeSemaphore(SubLString name) {
    return makeSemaphore(name, 0);
  }
  
  public static final SubLSemaphore makeSemaphore(SubLString name, int count) {
    return new SubLSemaphore(name, count);
  }
  
  //// READ-WRITE-LOCK FACTORY METHODS
  
  public static final SubLReadWriteLock makeReadWriteLock(SubLString name) {
    return new SubLReadWriteLock(name);
  }
  
  public static final SubLReadWriteLock makeReadWriteLock(String name) {
    return new SubLReadWriteLock(new SimpleString(name));
  }
  
  //// Protected Area
  
  //// Private Area
  
  private static final Random random = new Random();
  
  //// Internal Rep
  
  private static final int MAX_FP_PARSING_CACHE_SIZE = 10000;
  
  // @note if this cache is to be used in multiple threads then a synchronized version must be made -APB
  private static Map<String, SubLDoubleFloat> fpParsingCache = new LinkedHashMap<String, SubLDoubleFloat>(MAX_FP_PARSING_CACHE_SIZE+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
      return size() > MAX_FP_PARSING_CACHE_SIZE;
    }
  };
  
  private static final int MAX_INTEGER_CACHE_SIZE = 4000;
  
  // @note if this cache is to be used in multiple threads then a synchronized version must be made -APB
  private static final Map<String, SubLInteger> integerParsingCache = new LinkedHashMap<String, SubLInteger>(MAX_INTEGER_CACHE_SIZE+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
      return size() > MAX_INTEGER_CACHE_SIZE;
    }
  };
 
  
  // @note if this cache is to be used in multiple threads then a synchronized version must be made -APB
  private static final Map charCache = new HashMap();
  
  
  private static final int MAX_CHAR_PARSING_CACHE_SIZE = 1000;
  
  // @note if this cache is to be used in multiple threads then a synchronized version must be made -APB
  private static final Map<String, SubLCharacter> charParsingCache = new LinkedHashMap<String, SubLCharacter>(MAX_FP_PARSING_CACHE_SIZE+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
      return size() > MAX_CHAR_PARSING_CACHE_SIZE;
    }
  };
  
  private static long uniquifier = 0;
  
  private static final int MAX_POSITIVE_INTEGER_LENGTH = ("" + Integer.MAX_VALUE).toString().length();
  
  private static final int MAX_NEGATIVE_INTEGER_LENGTH = ("" + Integer.MIN_VALUE).toString().length();
  
  private static final int MAX_POSITIVE_LONG_LENGTH = ("" + Long.MAX_VALUE).toString().length();
  
  private static final int MAX_NEGATIVE_LONG_LENGTH = ("" + Long.MIN_VALUE).toString().length();
  
  public static final boolean USE_ARRAY_LISTS = false;
  
}
