package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.math.BigInteger;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFiles.VariableAccessMode;

abstract public class SubLInchworm implements ISubLInchworm {

	public SubLObject ABS() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject add(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject add(SubLObject num) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList addItem(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public void addKey(SubLObject key) {
		this.unimplimentedSubLFunction();

	}

	public SubLList adjoin(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList adjoin(SubLObject item, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList allElementsButLast(int howMany, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList append(SubLList list, boolean isReverse) {
		this.unimplimentedSubLFunction();
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

	public SubLList asArrayList() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList asConsList() {
		this.unimplimentedSubLFunction();
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

	public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject ATOM() {
		this.unimplimentedLispFunction();
		return null;
	}

	public BigInteger bigIntegerValue() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void bind(SubLObject newValue, SubLThread thread) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public boolean boundp() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject caar() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject cadddr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject caddr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject cadr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public boolean canFastHash() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject car() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject cdar() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject cddddr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject cdddr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject cddr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject cdr() {
		this.unimplimentedLispFunction();
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

	// SubLObject
	// public SubLSequence makeSequenceFromJavaList(List newBuf) {
	// unimplimentedSubLFunction();
	// return null;
	// }

	public char[] charsOld() {
		this.unimplimentedLispFunction();
		return null;
	}

	public char charValue() {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public void checkType(SubLSymbol predicate) throws SubLException {
		this.unimplimentedSubLFunction();

	}

	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
		this.unimplimentedSubLFunction();

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
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			this.unimplimentedSubLFunction();
			return this;
		}
	}

	public SubLObject COMPLEXP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence concatenate(SubLObject[] sequences) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence concatenate(SubLSequence seq1) {
		this.unimplimentedSubLFunction();
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

	public SubLList copyList() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject[] copyToArray() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLList copyTree() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public int count(SubLObject item) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int count(SubLObject item, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int countIf(UnaryFunction test) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int countIf(UnaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int countIf(UnaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject currentBinding(SubLThread thread) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject dec() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		this.unimplimentedSubLFunction();
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

	public SubLObject divideBy(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public double doubleValue() {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public SubLObject eighth() {
		this.unimplimentedSubLFunction();
		return null;
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

	public void enforceType(SubLSymbol predicate) throws SubLException {
		this.unimplimentedSubLFunction();

	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
		this.unimplimentedSubLFunction();

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
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject EQL(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean equal(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean equal(SubLObject obj) {
		this.unimplimentedSubLFunction();
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

	public boolean equalp(SubLObject obj) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject EQUALP(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		this.unimplimentedSubLFunction();
		return null;
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

	// SubLSymbol
	public boolean fboundp() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject fifth() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence fill(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence fill(SubLObject item, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence fill(SubLObject item, int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject find(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject findIf(UnaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject findIf(UnaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject first() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject FLOATP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public float floatValue() {
		this.unimplimentedLispFunction();
		return 0;
	}

	// SubLSymbol
	public void forceGlobalValue(SubLObject newValue) {
		this.unimplimentedSubLFunction();

	}

	public SubLObject fourth() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject get(int index) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject get(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLSymbol
	public int getBindingId() {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public boolean getBooleanValue() {
		this.unimplimentedLispFunction();
		return false;
	}

	public SubLObject getCallCount() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLCharacter getCharacter(int index) {
		this.unimplimentedSubLFunction();
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

	public SubLObject getDottedElement() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getDynamicValue() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getDynamicValue(SubLObject[] bindings) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getDynamicValue(SubLThread thread) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getf(SubLObject indicator, SubLObject defaultValue) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField(int fieldNum) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField0() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField1() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField10() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField11() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField12() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField13() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField14() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField15() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField16() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField17() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField18() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField19() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField2() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField20() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField3() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField4() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField5() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField6() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField7() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField8() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getField9() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public String getFileDesignator() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public int getFixnumSlotValue(int index) {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLFunction getFunc() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLOperator getFunction() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getGlobalValue() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public int getHotCount() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLObject getHT(SubLObject obj) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public String getJavaSymbolName() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getLispPackage() {
		this.unimplimentedLispFunction();
		return null;
	}

	public int getNumSize() {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLSymbol
	public SubLPackage getPackage() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getParts() {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLSymbol
	public SubLList getPlist() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getProperty(SubLObject indicator) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject getPropertyList() {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLSymbol
	public String getQualifiedName() {
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

	public int getSpecialIndex() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLStream getStream(boolean followSynonymStream) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public String getString() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public char[] getStringChars() {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLSymbol
	public SubLString getSubLName() {
		this.unimplimentedSubLFunction();
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

	// SubLSymbol
	public SubLObject getSymbolSetfFunctionOrDie() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSymbolValue() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLSymbol getType() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLFixnum getTypeCode() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject getValue() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public int hashCode(int currentDepth) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public int hashCodeLisp() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public boolean hasKey(SubLObject obj) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject inc() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public void incrementCallCount(int arity) {
		this.unimplimentedLispFunction();

	}

	public void incrementHotCount() {
		this.unimplimentedLispFunction();

	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLSymbol
	public void initializeConstant(SubLObject makeSingle) {
		this.unimplimentedLispFunction();

	}

	// SubLSymbol
	public void initializeSpecial(SubLObject t) {
		this.unimplimentedLispFunction();

	}

	public SubLObject INTEGERP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLList intersection(SubLList item, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public int intValue() {
		this.unimplimentedSubLFunction();
		return 0;
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

	public boolean isArrayBased() {
		return false;
	}

	public boolean isAtom() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isBigIntegerBignum() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isBignum() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isBoolean() {
		this.unimplimentedSubLFunction();
		return false;
	}

	// SubLSymbol
	public boolean isBuiltInFunction() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isChar() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isCharacter() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isCons() {
		this.unimplimentedSubLFunction();
		return false;
	}

	// SubLSymbol
	public boolean isConstant() {
		this.unimplimentedLispFunction();
		return false;
	}

	// SubLSymbol
	public boolean isConstantSymbol() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isDouble() {
		this.unimplimentedSubLFunction();
		return false;
	}

	// SubLSymbol
	public boolean isDynamic() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isEnvironment() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isEqualTo(int n) {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isError() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isEven() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isFixnum() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isFunction() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isFunctionSpec() {
		this.unimplimentedSubLFunction();
		return false;
	}

	// SubLSymbol
	public boolean isGlobal() {
		this.unimplimentedSubLFunction();
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

	public boolean isGuid() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isHashtable() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isHashtableIterator() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isIntBignum() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isInteger() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isKeyhash() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isKeyhashIterator() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isKeyword() {
		this.unimplimentedSubLFunction();
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

	public boolean isList() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isLock() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isLongBignum() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isMacroOperator() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isNegative() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isNil() {
		this.unimplimentedSubLFunction();
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

	public boolean isNumber() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isOdd() {
		this.unimplimentedLispFunction();
		return false;
	}

	public boolean isPackage() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isPackageIterator() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPositive() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isProcess() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isProper() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isReadWriteLock() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isRegexPattern() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isSemaphore() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isSequence() {
		this.unimplimentedSubLFunction();
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

	public boolean isStream() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isString() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isStructure() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isSubList(SubLList sublist) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isSubSet(SubLList list) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isSymbol() {
		this.unimplimentedSubLFunction();
		return false;
	}

	// SubLSymbol
	public boolean isUndeclared() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isVector() {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean isZero() {
		this.unimplimentedSubLFunction();
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

	public SubLObject last(int i) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject LDB(int size, int position) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject LENGTH() {
		this.unimplimentedLispFunction();
		return null;
	}

	public int listLength() {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public SubLObject LISTP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLList listPrefix(SubLList postFix) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public Object lockableInstance() {
		this.unimplimentedLispFunction();
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

	public long longValue() {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public SubLObject makeCopy() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject makeDeepCopy() {
		this.unimplimentedSubLFunction();
		return null;
	}

	//// SubLSymbol
	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject mapcar(SubLFunction functionTyped) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList member(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList member(SubLObject item, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList memberIf(BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject MINUSP() {
		this.unimplimentedLispFunction();
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

	public SubLObject mult(SubLObject num) {
		this.unimplimentedSubLFunction();
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
		this.unimplimentedSubLFunction();
		return null;
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

	public SubLObject nthCdr(int index) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject NUMBERP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean numE(SubLObject x) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject NUMERATOR() {
		this.unimplimentedLispFunction();
		return null;
	}

	public boolean numG(SubLObject x) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean numGE(SubLObject x) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean numL(SubLObject x) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public boolean numLE(SubLObject x) {
		this.unimplimentedSubLFunction();
		return false;
	}

	public SubLObject ODDP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject PLUSP() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject pop() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public int positionOf(SubLObject item) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOf(SubLObject item, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOfIf(UnaryFunction test) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOfIf(UnaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public int psxhash() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public int psxhash(int depth) {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLCons push(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLCons pushNew(SubLObject item) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject put(SubLObject key, SubLObject value) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList putf(SubLObject indicator, SubLObject value) {
		this.unimplimentedSubLFunction();
		return null;
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

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void rebind(SubLObject oldValue, SubLThread thread) {
		this.unimplimentedSubLFunction();

	}

	// SubLObject
	public SubLObject reduce(BinaryFunction func) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject reduce(BinaryFunction func, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject reduce(BinaryFunction func, int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList remf(SubLObject indicator) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public boolean remKey(SubLObject obj) {
		this.unimplimentedSubLFunction();
		return false;
	}

	// SubLSymbol
	public SubLObject remove(SubLObject obj) {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject removeHT(SubLObject obj) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public void removeProperty(SubLObject indicator) {
		this.unimplimentedSubLFunction();

	}

	// SubLObject
	public SubLSequence replace(SubLSequence seq) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence replace(SubLSequence seq, int start1) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence replace(SubLSequence seq, int start1, int end1) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject resolve() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject rest() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject reverse() {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLObject
	public SubLSequence reverse(boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject SCHAR(int index) {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLObject
	public int search(SubLSequence otherSeq) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	// SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		this.unimplimentedSubLFunction();
		return 0;
	}

	public SubLObject second() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public void set(int index, SubLObject newVal) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setAccessMode(VariableAccessMode accessMode) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setBuiltInFunction(boolean b) {
		this.unimplimentedLispFunction();

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

	// SubLSymbol
	public void setConstantValue(SubLObject value) {
		this.unimplimentedSubLFunction();

	}

	public SubLList setDifference(SubLList item, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public void setDocumentation(SubLObject docType, SubLObject documentation) {
		this.unimplimentedLispFunction();

	}

	public SubLObject setDottedElement(SubLObject dottedElement) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public void setDynamicValue(SubLObject value) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setDynamicValue(SubLObject value, SubLObject[] bindings) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setDynamicValue(SubLObject value, SubLThread thread) {
		this.unimplimentedSubLFunction();

	}

	public void setField(int fieldNum, SubLObject value) {
		this.unimplimentedSubLFunction();

	}

	public SubLObject setField0(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField1(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField10(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField11(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField12(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField13(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField14(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField15(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField16(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField17(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField18(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField19(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField2(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField20(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField3(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField4(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField5(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField6(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField7(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField8(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject setField9(SubLObject newVal) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLCons setFirst(SubLObject first) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public void setFunction(SubLOperator func) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setGlobalValue(SubLObject value) {
		this.unimplimentedSubLFunction();

	}

	public void setHotCount(int n) {
		this.unimplimentedLispFunction();

	}

	public void setLispPackage(SubLObject nil) {
		this.unimplimentedLispFunction();

	}

	// SubLSymbol
	public void setPackage(SubLObject nil) {
		this.unimplimentedLispFunction();

	}

	// SubLSymbol
	public void setPackage(SubLPackage thePackage) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setProperty(SubLObject indicator, SubLObject value) {
		this.unimplimentedSubLFunction();

	}

	public void setPropertyList(SubLObject obj) {
		this.unimplimentedLispFunction();

	}

	public SubLCons setRest(SubLObject rest) {
		this.unimplimentedSubLFunction();
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

	// SubLSymbol
	public void setSpecial(boolean b) {
		this.unimplimentedSubLFunction();

	}

	public void setSpecialIndex(int n) {
		this.unimplimentedLispFunction();

	}

	// SubLSymbol
	public void setSymbolFunction(SubLObject standardGenericFunction) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setSymbolValue(SubLObject arglist) {
		this.unimplimentedSubLFunction();

	}

	// SubLSymbol
	public void setValue(SubLObject value) {
		this.unimplimentedSubLFunction();

	}

	public SubLList setXor(SubLList item, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject seventh() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject SIMPLE_STRING_P() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject sixth() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public int size() {
		return this.cl_length();
	}

	public SubLObject SLOT_VALUE(SubLObject slotName) {
		this.unimplimentedLispFunction();
		return null;
	}

	// SubLObject
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		this.unimplimentedSubLFunction();
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

	public SubLObject sub(SubLObject num) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence subSeq(int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence subSeq(int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject subtract(int n) {
		this.unimplimentedLispFunction();
		return null;
	}

	public int superHash() {
		this.unimplimentedSubLFunction();
		return 0;
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

	// SubLSymbol
	public SubLObject symbolValue() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject symbolValue(LispThread thread) {
		this.unimplimentedSubLFunction();
		return null;
	}

	// SubLSymbol
	public SubLObject symbolValueNoThrow() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject tenth() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject third() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public Object[] toArray(Object[] a) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLCharacter toChar() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLCons toCons() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLDoubleFloat toDouble() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLEnvironment toEnv() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLFixnum toFixnum() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// //SubLSymbol
	// public SubLSymbol getName() {
	// unimplimentedSubLFunction();
	// return null;
	// }

	public SubLGuid toGuid() {
		this.unimplimentedSubLFunction();
		return null;
	}

	// //SubLSymbol
	// private AbstractString getSymbolName() {
	// unimplimentedSubLFunction();
	// return null;
	// }

	public SubLHashtable toHashtable() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLHashtableIterator toHashtableIterator() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLInputStream toInputStream() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLInputTextStream toInputTextStream() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLInteger toInteger() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLKeyhash toKeyhash() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLKeyhashIterator toKeyhashIterator() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList toList() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock toLock() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLMacro toMacro() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLNumber toNumber() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLOutputStream toOutputStream() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLOutputTextStream toOutputTextStream() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLPackage toPackage() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLProcess toProcess() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLReadWriteLock toReadWriteLock() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLRegexPattern toRegexPattern() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLSemaphore toSemaphore() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLSequence toSeq() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLString toStr() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLStruct toStruct() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLObject toSubLFunction() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLObject[] toSubLObjectArray() {
		this.unimplimentedSubLFunction();
		return null;
	}

	abstract public SubLSymbol toSymbol();

	public String toTypeName() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLVector toVect() {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList treeEqual(SubLList tree1, SubLList tree2) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
		this.unimplimentedSubLFunction();
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

	final public void unimplimentedLispFunction() {
		Thread.dumpStack();
	}

	final public void unimplimentedSubLFunction() {
		Thread.dumpStack();
	}

	public SubLList union(SubLList item, boolean isDestructive) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
		this.unimplimentedSubLFunction();
		return null;
	}

	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		this.unimplimentedSubLFunction();
		return null;
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

}
