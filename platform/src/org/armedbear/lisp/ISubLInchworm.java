package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.math.BigInteger;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface ISubLInchworm {

	SubLObject add(SubLObject num);

	void addKey(SubLObject key); // SubLKeyhash

	SubLList asArrayList(); // SubLList

	SubLList asConsList(); // SubLList

	BigInteger bigIntegerValue(); // SubLNumber

	void bind(SubLObject newValue, SubLObject[] bindings);

	boolean canFastHash();

	char charValue(); // SubLCharacter

	void checkType(SubLSymbol predicate) throws SubLException;

	void checkTypeInternal(SubLSymbol predicate) throws SubLException;

	Object clone();

	SubLObject currentBinding(SubLObject[] bindings);

	SubLObject dec();

	double doubleValue(); // SubLNumber

	SubLObject eighth();

	void enforceType(SubLSymbol predicate) throws SubLException;

	void enforceTypeInternal(SubLSymbol predicate) throws SubLException;

	boolean eql(SubLObject obj);

	boolean equal(SubLObject obj);

	boolean equalp(SubLObject obj);

	SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException;

	SubLObject fifth();

	SubLObject first(); // SubLList

	SubLObject fourth();

	SubLObject get(int index); // SubLSequence

	SubLCharacter getCharacter(int index); // SubLString

	SubLObject getField(int fieldNum); // SubLStruct

	SubLObject getField0(); // struct

	SubLObject getField1(); // struct

	SubLObject getField10(); // struct

	SubLObject getField11(); // struct

	SubLObject getField12(); // struct

	SubLObject getField13(); // struct

	SubLObject getField14(); // struct

	SubLObject getField15(); // struct

	SubLObject getField16(); // struct

	SubLObject getField17(); // struct

	SubLObject getField18(); // struct

	SubLObject getField19(); // struct

	SubLObject getField2(); // struct

	SubLObject getField20(); // struct

	SubLObject getField3(); // struct

	SubLObject getField4(); // struct

	SubLObject getField5(); // struct

	SubLObject getField6(); // struct

	SubLObject getField7(); // struct

	SubLObject getField8(); // struct

	SubLObject getField9(); // struct

	String getFileDesignator();

	SubLFunction getFunc(); // SubLFunction

	SubLObject getHT(SubLObject obj); // SubLHashTable

	/** Functions created to avoid casting */
	int getNumSize();

	SubLStream getStream(boolean followSynonymStream); // SubLStream

	String getString(); // SubLString

	SubLSymbol getType();

	SubLFixnum getTypeCode();

	int hashCode(int currentDepth);

	boolean hasKey(SubLObject obj); // SubLKeyhash

	SubLObject inc();

	int intValue(); // SubLNumber

	boolean isArrayBased(); // SubLList

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

	boolean isNegative(); // SubLNumber

	boolean isNil();

	boolean isNumber();

	boolean isPackage();

	boolean isPositive(); // SubLNumber

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

	boolean isZero(); // SubLNumber

	SubLObject last(int i); // SubLList

	long longValue(); // SubLNumber

	SubLObject makeCopy();

	SubLObject makeDeepCopy();

	SubLObject mult(SubLObject num);

	SubLObject ninth();

	SubLObject nthCdr(int index); // SubLList

	boolean numE(SubLObject x); // SubLNumber

	boolean numG(SubLObject x); // SubLNumber

	boolean numGE(SubLObject x); // SubLNumber

	boolean numL(SubLObject x); // SubLNumber

	boolean numLE(SubLObject x); // SubLNumber

	SubLObject put(SubLObject key, SubLObject value); // SubLHashTable

	void rebind(SubLObject oldValue, SubLObject[] bindings);

	boolean remKey(SubLObject obj); // SubLKeyhash

	SubLObject removeHT(SubLObject obj); // SubLHashTable

	SubLObject rest(); // SubLList

	SubLSequence reverse(boolean isDestructive); // SubLSequence

	SubLObject second();

	void set(int index, SubLObject val); // SubLSequence

	void setField(int fieldNum, SubLObject value); // SubLStruct

	SubLObject setField0(SubLObject newVal); // struct

	SubLObject setField1(SubLObject newVal); // struct

	SubLObject setField10(SubLObject newVal); // struct

	SubLObject setField11(SubLObject newVal); // struct

	SubLObject setField12(SubLObject newVal); // struct

	SubLObject setField13(SubLObject newVal); // struct

	SubLObject setField14(SubLObject newVal); // struct

	SubLObject setField15(SubLObject newVal); // struct

	SubLObject setField16(SubLObject newVal); // struct

	SubLObject setField17(SubLObject newVal); // struct

	SubLObject setField18(SubLObject newVal); // struct

	SubLObject setField19(SubLObject newVal); // struct

	SubLObject setField2(SubLObject newVal); // struct

	SubLObject setField20(SubLObject newVal); // struct

	SubLObject setField3(SubLObject newVal); // struct

	SubLObject setField4(SubLObject newVal); // struct

	SubLObject setField5(SubLObject newVal); // struct

	SubLObject setField6(SubLObject newVal); // struct

	SubLObject setField7(SubLObject newVal); // struct

	SubLObject setField8(SubLObject newVal); // struct

	SubLObject setField9(SubLObject newVal); // struct

	SubLCons setFirst(SubLObject first); // SubLList

	SubLCons setRest(SubLObject rest); // SubLList

	SubLObject seventh();

	SubLObject sixth();

	int size(); // SubLSequence

	SubLObject sub(SubLObject num);

	int superHash();

	SubLObject tenth();

	SubLObject third();

	SubLCharacter toChar(); // SubLCharacter

	SubLCons toCons(); // SubLCons

	SubLDoubleFloat toDouble(); // SubLDoubleFloat

	SubLEnvironment toEnv(); // SubLEnvironment

	SubLFixnum toFixnum(); // SubLInteger

	SubLGuid toGuid(); // SubLGuid

	SubLHashtable toHashtable(); // SubLHashtable

	SubLHashtableIterator toHashtableIterator(); // SubLHashtableIterator

	SubLInputBinaryStream toInputBinaryStream(); // SubLStream

	SubLInputStream toInputStream(); // SubLStream

	SubLInputTextStream toInputTextStream(); // SubLStream

	SubLInteger toInteger(); // SubLInteger

	SubLKeyhash toKeyhash(); // SubLKeyhash

	SubLKeyhashIterator toKeyhashIterator(); // SubLKeyhashIterator

	SubLList toList(); // SubLList

	SubLLock toLock(); // SubLLock

	SubLMacro toMacro(); // SubLMacro

	SubLNumber toNumber(); // SubLNumber

	SubLOutputBinaryStream toOutputBinaryStream(); // SubLStream

	SubLOutputStream toOutputStream(); // SubLStream

	SubLOutputTextStream toOutputTextStream(); // SubLStream

	SubLPackage toPackage(); // SubLPackage

	SubLProcess toProcess(); // SubLProcess

	SubLReadWriteLock toReadWriteLock(); // SubLReadWriteLock

	SubLRegexPattern toRegexPattern(); // SubLRegexPattern

	SubLSemaphore toSemaphore(); // SubLSemaphore

	SubLSequence toSeq(); // SubLSequence

	SubLString toStr(); // SubLString

	SubLStruct toStruct(); // SubLPackage

	SubLSymbol toSymbol(); // SubLSymbol

	String toTypeName();

	SubLVector toVect(); // SubLPackage

	// @ todo this should be a symbol and looked up dynamically??? --APB
	// public static boolean DO_CHECK_TYPES = false;
	// public static boolean DO_PARANOID_TYPE_CHECKING = false;
	//
	//
	// public static int MAX_HASH_LENGTH = 8;
	// public static int MAX_HASH_DEPTH = 8;
	// public static int DEFAULT_EXCEEDED_HASH_VALUE = 0;

}
