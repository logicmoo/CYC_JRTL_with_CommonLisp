/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.armedbear.lisp.LispObject;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface SubLObject extends Cloneable {
    public static boolean DO_CHECK_TYPES = false;
    public static boolean DO_PARANOID_TYPE_CHECKING = false;
    public static int MAX_HASH_LENGTH = 8;
    public static int MAX_HASH_DEPTH = 8;
    public static int DEFAULT_EXCEEDED_HASH_VALUE = 0;

    SubLObject add(SubLObject p0);

    void addKey(SubLObject p0);

    public boolean lispEquals(Object obj);

    SubLList asArrayList();

    SubLList asConsList();

    BigInteger bigIntegerValue();

    void bind(SubLObject p0, SubLObject[] p1);

    boolean canFastHash();

    char charValue();

    void checkType(SubLSymbol p0) throws SubLException;

    void checkTypeInternal(SubLSymbol p0) throws SubLException;

    Object clone();

    SubLObject currentBinding(SubLObject[] p0);

    SubLObject dec();

    double doubleValue();

    SubLObject eighth();

    void enforceType(SubLSymbol p0) throws SubLException;

    void enforceTypeInternal(SubLSymbol p0) throws SubLException;

    boolean eql(SubLObject p0);

    boolean equal(SubLObject p0);

    boolean equalp(SubLObject p0);

    SubLObject eval(SubLEnvironment p0) throws InvalidSubLExpressionException;

    SubLObject fifth();

    SubLObject first();

    SubLObject fourth();

    SubLObject get(int p0);

    SubLObject get(SubLObject p0);

    SubLCharacter getCharacter(int p0);

    SubLObject getField(int p0);

    SubLObject getField0();

    SubLObject getField1();

    SubLObject getField10();

    SubLObject getField11();

    SubLObject getField12();

    SubLObject getField13();

    SubLObject getField14();

    SubLObject getField15();

    SubLObject getField16();

    SubLObject getField17();

    SubLObject getField18();

    SubLObject getField19();

    SubLObject getField2();

    SubLObject getField20();

    SubLObject getField3();

    SubLObject getField4();

    SubLObject getField5();

    SubLObject getField6();

    SubLObject getField7();

    SubLObject getField8();

    SubLObject getField9();

    String getFileDesignator();

    SubLFunction getFunc();

    int getNumSize();

    SubLStream getStream(boolean p0);

    String getString();

    SubLSymbol getType();

    SubLFixnum getTypeCode();

    int hashCode(int p0);

    boolean hasKey(SubLObject p0);

    SubLObject inc();

    int intValue();

    boolean isAlien();

    boolean isArrayBased();

    boolean isAtom();

    boolean isBigIntegerBignum();

    boolean isBignum();

    boolean isBoolean();

    boolean isChar();

    boolean isCons();

    boolean isDouble();

    boolean isEnvironment();

    boolean isError();

    boolean isFixnum();

    boolean isFunction();

    boolean isFunctionSpec();

    boolean isGuid();

    boolean isHashtable();

    boolean isHashtableIterator();

    boolean isIntBignum();

    boolean isInteger();

    boolean isKeyhash();

    boolean isKeyhashIterator();

    boolean isKeyword();

    boolean isList();

    boolean isLock();

    boolean isLongBignum();

    boolean isMacroOperator();

    boolean isNegative();

    boolean isNil();

    boolean isNumber();

    boolean isPackage();

    boolean isPackageIterator();

    boolean isPositive();

    boolean isProcess();

    boolean isReadWriteLock();

    boolean isRegexPattern();

    boolean isSemaphore();

    boolean isSequence();

    boolean isStream();

    boolean isString();

    boolean isStructure();

    boolean isSymbol();

    boolean isVector();

    boolean isZero();

    SubLObject last(int p0);

    long longValue();

    SubLObject makeCopy();

    SubLObject makeDeepCopy();

    SubLObject mult(SubLObject p0);

    SubLObject ninth();

    SubLObject nthCdr(int p0);

    boolean numE(SubLObject p0);

    boolean numG(SubLObject p0);

    boolean numGE(SubLObject p0);

    boolean numL(SubLObject p0);

    boolean numLE(SubLObject p0);

    SubLObject put(SubLObject p0, SubLObject p1);

    void rebind(SubLObject p0, SubLObject[] p1);

    boolean remKey(SubLObject p0);

    SubLObject remove(SubLObject p0);

    SubLObject rest();

    SubLSequence reverse(boolean p0);

    SubLObject second();

    void set(int p0, SubLObject p1);

    void setField(int p0, SubLObject p1);

    SubLObject setField0(SubLObject p0);

    SubLObject setField1(SubLObject p0);

    SubLObject setField10(SubLObject p0);

    SubLObject setField11(SubLObject p0);

    SubLObject setField12(SubLObject p0);

    SubLObject setField13(SubLObject p0);

    SubLObject setField14(SubLObject p0);

    SubLObject setField15(SubLObject p0);

    SubLObject setField16(SubLObject p0);

    SubLObject setField17(SubLObject p0);

    SubLObject setField18(SubLObject p0);

    SubLObject setField19(SubLObject p0);

    SubLObject setField2(SubLObject p0);

    SubLObject setField20(SubLObject p0);

    SubLObject setField3(SubLObject p0);

    SubLObject setField4(SubLObject p0);

    SubLObject setField5(SubLObject p0);

    SubLObject setField6(SubLObject p0);

    SubLObject setField7(SubLObject p0);

    SubLObject setField8(SubLObject p0);

    SubLObject setField9(SubLObject p0);

    SubLCons setFirst(SubLObject p0);

    SubLCons setRest(SubLObject p0);

    SubLObject seventh();

    SubLObject sixth();

    int size();

    int size(int p0);

    SubLObject sub(SubLObject p0);

    int superHash();

    SubLObject tenth();

    SubLObject third();

    SubLCharacter toChar();

    SubLCons toCons();

    SubLDoubleFloat toDouble();

    SubLEnvironment toEnv();

    SubLFixnum toFixnum();

    SubLGuid toGuid();

    SubLHashtable toHashtable();

    SubLHashtableIterator toHashtableIterator();

    SubLInputBinaryStream toInputBinaryStream();

    SubLInputStream toInputStream();

    SubLInputTextStream toInputTextStream();

    SubLInteger toInteger();

    SubLKeyhash toKeyhash();

    SubLKeyhashIterator toKeyhashIterator();

    SubLList toList();

    SubLLock toLock();

    SubLMacro toMacro();

    SubLNumber toNumber();

    SubLOutputBinaryStream toOutputBinaryStream();

    SubLOutputStream toOutputStream();

    SubLOutputTextStream toOutputTextStream();

    SubLPackage toPackage();

    SubLPackageIterator toPackageIterator();

    SubLProcess toProcess();

    SubLReadWriteLock toReadWriteLock();

    SubLRegexPattern toRegexPattern();

    SubLSemaphore toSemaphore();

    SubLSequence toSeq();

    SubLString toStr();

    SubLStruct toStruct();

    SubLSymbol toSymbol();

    String toTypeName();

    SubLVector toVect();

    String printObject();

    String getStringValue();

    LispObject toLispObject();

    BigDecimal bigDecimalValue();

    Object javaInstance();

    String princToString();

}
