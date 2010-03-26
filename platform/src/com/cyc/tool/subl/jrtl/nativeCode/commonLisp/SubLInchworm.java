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

	final public void unimplimentedLispFunction() {
		 Thread.dumpStack();
	}

	final public void unimplimentedSubLFunction() {
		Thread.dumpStack();		
	}

	public int getSpecialIndex() {
		unimplimentedLispFunction();
		return 0;
	}


	public void setLispPackage(SubLObject nil) {
		unimplimentedLispFunction();
		
	}

	public void setSpecialIndex(int n) {
		unimplimentedLispFunction();
		
	}
  
	@Override	
	public int size() {
		return cl_length();
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			unimplimentedSubLFunction();
			return this;
		}
	}
	
	//SubLObject
	public SubLSequence concatenate(SubLSequence seq1) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence concatenate(SubLObject[] sequences) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public int count(SubLObject item) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int count(SubLObject item, BinaryFunction test) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int countIf(UnaryFunction test) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int countIf(UnaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int countIf(UnaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence fill(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence fill(SubLObject item, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence fill(SubLObject item, int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject find(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject findIf(UnaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject findIf(UnaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject get(int index) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
//	public SubLSequence makeSequenceFromJavaList(List newBuf) {
//		unimplimentedSubLFunction();
//		return null;
//	}

	//SubLObject
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public int positionOf(SubLObject item) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOf(SubLObject item, BinaryFunction test) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOfIf(UnaryFunction test) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOfIf(UnaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public SubLObject reduce(BinaryFunction func) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject reduce(BinaryFunction func, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject reduce(BinaryFunction func, int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end, int count) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence replace(SubLSequence seq) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence replace(SubLSequence seq, int start1) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence replace(SubLSequence seq, int start1, int end1) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence reverse(boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public int search(SubLSequence otherSeq) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLObject
	public void set(int index, SubLObject newVal) {
		unimplimentedSubLFunction();
		
	}

	//SubLObject
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence subSeq(int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence subSeq(int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLObject
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject add(SubLObject num) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public void addKey(SubLObject key) {
		unimplimentedSubLFunction();
		
	}

	
	public SubLList asArrayList() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList asConsList() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public BigInteger bigIntegerValue() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		unimplimentedSubLFunction();
		
	}

	
	public boolean canFastHash() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public char charValue() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public void checkType(SubLSymbol predicate) throws SubLException {
		unimplimentedSubLFunction();
		
	}

	
	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
		unimplimentedSubLFunction();
		
	}

	
	public SubLObject currentBinding(SubLObject[] bindings) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject dec() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public double doubleValue() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public SubLObject eighth() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public void enforceType(SubLSymbol predicate) throws SubLException {
		unimplimentedSubLFunction();
		
	}

	
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
		unimplimentedSubLFunction();
		
	}

	
	public boolean eql(SubLObject obj) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean equal(SubLObject obj) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean equalp(SubLObject obj) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject fifth() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject first() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject fourth() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getHT(SubLObject obj) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCharacter getCharacter(int index) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField(int fieldNum) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField0() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField1() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField10() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField11() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField12() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField13() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField14() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField15() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField16() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField17() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField18() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField19() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField2() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField20() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField3() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField4() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField5() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField6() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField7() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField8() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getField9() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public String getFileDesignator() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLFunction getFunc() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public int getNumSize() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public SubLStream getStream(boolean followSynonymStream) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public String getString() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLSymbol getType() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLFixnum getTypeCode() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public boolean hasKey(SubLObject obj) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public int hashCode(int currentDepth) {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public SubLObject inc() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public int intValue() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public boolean isArrayBased() {
		return false;
	}

	
	public boolean isAtom() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isBigIntegerBignum() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isBignum() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isBoolean() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isChar() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isCons() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isDouble() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isEnvironment() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isError() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isFixnum() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isFunction() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isFunctionSpec() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isGuid() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isHashtable() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isHashtableIterator() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isIntBignum() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isInteger() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isKeyhash() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isKeyhashIterator() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isKeyword() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isList() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isLock() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isLongBignum() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isMacroOperator() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isNegative() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isNil() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isNumber() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isPackage() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isPositive() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isProcess() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isReadWriteLock() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isRegexPattern() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isSemaphore() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isSequence() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isStream() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isString() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isStructure() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isSymbol() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isVector() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isZero() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public SubLObject last(int i) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public long longValue() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public SubLObject makeCopy() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject makeDeepCopy() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject mult(SubLObject num) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject ninth() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject nthCdr(int index) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public boolean numE(SubLObject x) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean numG(SubLObject x) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean numGE(SubLObject x) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean numL(SubLObject x) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean numLE(SubLObject x) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public SubLObject put(SubLObject key, SubLObject value) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		unimplimentedSubLFunction();
		
	}

	
	public boolean remKey(SubLObject obj) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public SubLObject removeHT(SubLObject obj) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject rest() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject second() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public void setField(int fieldNum, SubLObject value) {
		unimplimentedSubLFunction();
		
	}

	
	public SubLObject setField0(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField1(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField10(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField11(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField12(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField13(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField14(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField15(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField16(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField17(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField18(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField19(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField2(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField20(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField3(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField4(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField5(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField6(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField7(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField8(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setField9(SubLObject newVal) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons setFirst(SubLObject first) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons setRest(SubLObject rest) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject seventh() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject sixth() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject sub(SubLObject num) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public int superHash() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public SubLObject tenth() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject third() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCharacter toChar() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons toCons() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLDoubleFloat toDouble() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLEnvironment toEnv() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLFixnum toFixnum() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLGuid toGuid() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLHashtable toHashtable() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLHashtableIterator toHashtableIterator() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLInputBinaryStream toInputBinaryStream() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLInputStream toInputStream() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLInputTextStream toInputTextStream() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLInteger toInteger() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLKeyhash toKeyhash() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLKeyhashIterator toKeyhashIterator() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList toList() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock toLock() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLMacro toMacro() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLNumber toNumber() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLOutputBinaryStream toOutputBinaryStream() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLOutputStream toOutputStream() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLOutputTextStream toOutputTextStream() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLPackage toPackage() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLProcess toProcess() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLReadWriteLock toReadWriteLock() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLRegexPattern toRegexPattern() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLSemaphore toSemaphore() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLSequence toSeq() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLString toStr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLStruct toStruct() {
		unimplimentedSubLFunction();
		return null;
	}

	
	abstract public SubLSymbol toSymbol();

	
	public String toTypeName() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLVector toVect() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList addItem(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList adjoin(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList adjoin(SubLObject item, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList allElementsButLast(int howMany, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList append(SubLList list, boolean isReverse) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject caar() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject cadddr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject caddr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject cadr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject cdar() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject cddddr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject cdddr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject cddr() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList copyList() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList copyTree() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getDottedElement() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject getf(SubLObject indicator, SubLObject defaultValue) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList intersection(SubLList item, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public boolean isProper() {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isSubList(SubLList sublist) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public boolean isSubSet(SubLList list) {
		unimplimentedSubLFunction();
		return false;
	}

	
	public int listLength() {
		unimplimentedSubLFunction();
		return 0;
	}

	
	public SubLList listPrefix(SubLList postFix) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject mapcar(SubLFunction functionTyped) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList member(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList member(SubLObject item, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList memberIf(BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject pop() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons push(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons pushNew(SubLObject item) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList putf(SubLObject indicator, SubLObject value) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList remf(SubLObject indicator) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList setDifference(SubLList item, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject setDottedElement(SubLObject dottedElement) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList setXor(SubLList item, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public Object[] toArray(Object[] a) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject[] toSubLObjectArray() {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList treeEqual(SubLList tree1, SubLList tree2) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList union(SubLList item, boolean isDestructive) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		unimplimentedSubLFunction();
		return null;
	}

	
	public SubLObject ABS() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject AREF(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject AREF(SubLObject index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject ATOM() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject CHAR(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject CHARACTERP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject COMPLEXP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject CONSTANTP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject DENOMINATOR() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject ENDP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject EQ(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject EQL(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject EQUAL(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject EQUALP(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject EVENP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject FLOATP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject INTEGERP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject IS_E(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject IS_GE(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject IS_GT(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject IS_LE(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject IS_LT(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject IS_NE(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LDB(int size, int position) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LENGTH() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LISTP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGAND(int n) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGAND(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGIOR(int n) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGIOR(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGNOT() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGXOR(int n) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject LOGXOR(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject MINUSP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject MOD(SubLObject divisor) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject MOD(int divisor) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject NOT() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject NTH(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject NTH(SubLObject arg) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject NUMBERP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject NUMERATOR() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject ODDP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject PLUSP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject RATIONALP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject REALP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject SCHAR(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject SIMPLE_STRING_P() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject SLOT_VALUE(SubLObject slotName) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject STRING() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject STRINGP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject SVREF(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject SYMBOLP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject VECTORP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject ZEROP() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject add(int n) {
		unimplimentedLispFunction();
		return null;
	}

	
	public int aref(int index) {
		unimplimentedLispFunction();
		return 0;
	}

	
	public long aref_long(int index) {
		unimplimentedLispFunction();
		return 0;
	}

	
	public void aset(int index, int n) {
		unimplimentedLispFunction();
		
	}

	
	public void aset(int index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	
	public void aset(SubLObject index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	
	public SubLObject ash(int shift) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject ash(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject car() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject cdr() {
		unimplimentedLispFunction();
		return null;
	}

	
	public char[] chars() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject classOf() {
		unimplimentedLispFunction();
		return null;
	}

	
	public boolean constantp() {
		unimplimentedLispFunction();
		return false;
	}

	
	public SubLObject[] copyToArray() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject dispatch(SubLObject[] args) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject divideBy(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject elt(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public boolean endp() {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean eql(char c) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean eql(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean equal(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean equalp(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public SubLObject execute(SubLObject args, Environment env) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject arg) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth,
			SubLObject sixth) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth,
			SubLObject sixth, SubLObject seventh) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth,
			SubLObject sixth, SubLObject seventh, SubLObject eighth) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject execute(SubLObject[] args) {
		unimplimentedLispFunction();
		return null;
	}

	
	public float floatValue() {
		unimplimentedLispFunction();
		return 0;
	}

	
	public boolean getBooleanValue() {
		unimplimentedLispFunction();
		return false;
	}

	
	public SubLObject getCallCount() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getDescription() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getDocumentation(SubLObject docType) {
		unimplimentedLispFunction();
		return null;
	}

	
	public int getFixnumSlotValue(int index) {
		unimplimentedLispFunction();
		return 0;
	}

	
	public int getHotCount() {
		unimplimentedLispFunction();
		return 0;
	}

	
	public SubLObject getParts() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getPropertyList() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSlotValue(int index) {
		unimplimentedLispFunction();
		return null;
	}

	
	public boolean getSlotValueAsBoolean(int index) {
		unimplimentedLispFunction();
		return false;
	}

	
	public SubLObject getSlotValue_0() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSlotValue_1() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSlotValue_2() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSlotValue_3() {
		unimplimentedLispFunction();
		return null;
	}

	
	public char[] getStringChars() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSymbolFunction() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSymbolFunctionOrDie() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject getSymbolValue() {
		unimplimentedLispFunction();
		return null;
	}

	
	public int hashCodeLisp() {
		unimplimentedLispFunction();
		return 0;
	}

	
	public void incrementCallCount(int arity) {
		unimplimentedLispFunction();
		
	}

	
	public void incrementHotCount() {
		unimplimentedLispFunction();
		
	}

	
	public boolean isCharacter() {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isEven() {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isGreaterThan(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isGreaterThanOrEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isLessThan(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isLessThanOrEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isNotEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isNotEqualTo(SubLObject obj) {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isOdd() {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isSpecialOperator() {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean isSpecialVariable() {
		unimplimentedLispFunction();
		return false;
	}

	
	public Object javaInstance() {
		unimplimentedLispFunction();
		return null;
	}

	
	public <T> Object javaInstance(Class<T> c) {
		unimplimentedLispFunction();
		return null;
	}

	
	public int cl_length() {
		unimplimentedLispFunction();
		return 0;
	}

	
	public Object lockableInstance() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject multiplyBy(int n) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject negate() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject noFillPointer() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject nreverse() {
		unimplimentedLispFunction();
		return null;
	}

	
	public int psxhash() {
		unimplimentedLispFunction();
		return 0;
	}

	
	public int psxhash(int depth) {
		unimplimentedLispFunction();
		return 0;
	}

	
	public boolean rationalp() {
		unimplimentedLispFunction();
		return false;
	}

	
	public boolean realp() {
		unimplimentedLispFunction();
		return false;
	}

	
	public SubLObject resolve() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject reverse() {
		unimplimentedLispFunction();
		return null;
	}

	
	public void setCallCount(int n) {
		unimplimentedLispFunction();
		
	}

	
	public void setCar(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

	
	public void setCdr(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

	
	public void setDocumentation(SubLObject docType, SubLObject documentation) {
		unimplimentedLispFunction();
		
	}

	
	public void setHotCount(int n) {
		unimplimentedLispFunction();
		
	}

	
	public void setPropertyList(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

	
	public void setSlotValue(int index, SubLObject value) {
		unimplimentedLispFunction();
		
	}

	
	public void setSlotValue(SubLObject slotName, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	
	public void setSlotValue_0(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	
	public void setSlotValue_1(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	
	public void setSlotValue_2(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	
	public void setSlotValue_3(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	
	public SubLObject subtract(int n) {
		unimplimentedLispFunction();
		return null;
	}

	
	public void svset(int index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	
	public int sxhash() {
		unimplimentedLispFunction();
		return 0;
	}

	
	public SubLObject toSubLFunction() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject truncate(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject typeOf() {
		unimplimentedLispFunction();
		return null;
	}

	
	public SubLObject typep(SubLObject typeSpecifier) {
		unimplimentedLispFunction();
		return null;
	}

	
	public String unreadableString(String s) {
		unimplimentedLispFunction();
		return null;
	}

	
	public String unreadableString(SubLSymbol sym) {
		unimplimentedLispFunction();
		return null;
	}

	
	public String unreadableString(String s, boolean identity) {
		unimplimentedLispFunction();
		return null;
	}

	
	public String unreadableString(SubLSymbol symbol, boolean identity) {
		unimplimentedLispFunction();
		return null;
	}

	
	public void vectorPushExtend(SubLObject element) {
		unimplimentedLispFunction();
		
	}
	
	public String writeToString() {
		unimplimentedLispFunction();
		return null;
	}

	////SubLSymbol
	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		unimplimentedLispFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject get(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject remove(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject getLispPackage() {
		unimplimentedLispFunction();
		return null;
	}

//	//SubLSymbol
//	public SubLSymbol getName() {
//		unimplimentedSubLFunction();
//		return null;
//	}

	//SubLSymbol
	public String getQualifiedName() {
		unimplimentedLispFunction();
		return null;
	}

//	//SubLSymbol
//	private AbstractString getSymbolName() {
//		unimplimentedSubLFunction();
//		return null;
//	}

	//SubLSymbol
	public SubLObject getSymbolSetfFunctionOrDie() {
		unimplimentedLispFunction();
		return null;
	}

	//SubLSymbol
	public void initializeConstant(SubLObject makeSingle) {
		unimplimentedLispFunction();
		
	}

	//SubLSymbol
	public void initializeSpecial(SubLObject t) {
		unimplimentedLispFunction();
		
	}

	//SubLSymbol
	public boolean isBuiltInFunction() {
		unimplimentedLispFunction();
		return false;
	}

	//SubLSymbol
	public boolean isConstant() {
		unimplimentedLispFunction();
		return false;
	}

	//SubLSymbol
	public void setBuiltInFunction(boolean b) {
		unimplimentedLispFunction();
		
	}

	//SubLSymbol
	public void setPackage(SubLObject nil) {
		unimplimentedLispFunction();
		
	}

	//SubLSymbol
	public void setSpecial(boolean b) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setSymbolFunction(SubLObject standardGenericFunction) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setSymbolValue(SubLObject arglist) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public SubLObject symbolValue(LispThread thread) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject symbolValue() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject symbolValueNoThrow() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public void bind(SubLObject newValue, SubLThread thread) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public boolean boundp() {
		unimplimentedSubLFunction();
		return false;
	}

	//SubLSymbol
	public SubLObject currentBinding(SubLThread thread) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public boolean fboundp() {
		unimplimentedSubLFunction();
		return false;
	}

	//SubLSymbol
	public void forceGlobalValue(SubLObject newValue) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public int getBindingId() {
		unimplimentedSubLFunction();
		return 0;
	}

	//SubLSymbol
	public SubLObject getDynamicValue() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject getDynamicValue(SubLObject[] bindings) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject getDynamicValue(SubLThread thread) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLOperator getFunction() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject getGlobalValue() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public String getJavaSymbolName() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLPackage getPackage() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLList getPlist() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject getProperty(SubLObject indicator) {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLString getSubLName() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public SubLObject getValue() {
		unimplimentedSubLFunction();
		return null;
	}

	//SubLSymbol
	public boolean isConstantSymbol() {
		unimplimentedSubLFunction();
		return false;
	}

	//SubLSymbol
	public boolean isDynamic() {
		unimplimentedSubLFunction();
		return false;
	}

	//SubLSymbol
	public boolean isGlobal() {
		unimplimentedSubLFunction();
		return false;
	}

	//SubLSymbol
	public boolean isUndeclared() {
		unimplimentedSubLFunction();
		return false;
	}

	//SubLSymbol
	public void rebind(SubLObject oldValue, SubLThread thread) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void removeProperty(SubLObject indicator) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setAccessMode(VariableAccessMode accessMode) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setConstantValue(SubLObject value) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setDynamicValue(SubLObject value) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setDynamicValue(SubLObject value, SubLObject[] bindings) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setDynamicValue(SubLObject value, SubLThread thread) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setFunction(SubLOperator func) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setGlobalValue(SubLObject value) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setPackage(SubLPackage thePackage) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setProperty(SubLObject indicator, SubLObject value) {
		unimplimentedSubLFunction();
		
	}

	//SubLSymbol
	public void setValue(SubLObject value) {
		unimplimentedSubLFunction();
		
	}
  
}
