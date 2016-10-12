//
//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLDigestInputTextStream extends AbstractSubLObject
		implements SubLStream, SubLInputTextStream, CommonSymbols {
	public static int INITIAL_CAPACITY = 131072;

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		System.out.println("--  " + SubLDigestInputTextStream.makeHexStringFromByteArray(digest.digest()));
		byte[] curr = { 0, 10 };
		for (int i = 0; i < 256; ++i) {
			curr[0] = (byte) i;
			System.out.print(SubLDigestInputTextStream.makeHexStringFromByteArray(curr));
			System.out.print("  ");
			digest.update(curr);
			byte[] result = digest.digest();
			System.out.println(SubLDigestInputTextStream.makeHexStringFromByteArray(result));
		}
	}

	public static String makeHexStringFromByteArray(byte[] byteArray) {
		String hexDigits = "0123456789abcdef";
		StringBuilder buffer = new StringBuilder(byteArray.length * 2);
		for (int i = 0, size = byteArray.length; i < size; ++i) {
			byte current = byteArray[i];
			int byteValue = current & 0xFF;
			buffer.append("0123456789abcdef".charAt(byteValue >> 4));
			buffer.append("0123456789abcdef".charAt(byteValue & 0xF));
		}
		return buffer.toString();
	}

	private byte[] bytes;
	private ByteBuffer buffer;
	private int buffer_size;
	private MessageDigest digest;
	private SubLInputTextStream wrapped;

	public SubLDigestInputTextStream(SubLInputTextStream outerStream, MessageDigest digest) {
		this.bytes = null;
		this.buffer_size = 0;
		this.wrapped = outerStream;
		this.digest = digest;
		this.bytes = new byte[131072];
		this.buffer = ByteBuffer.wrap(this.bytes);
		this.buffer_size = 131072;
	}

	public SubLObject add(SubLObject num) {
		return this.wrapped.add(num);
	}

	public void addKey(SubLObject key) {
		this.wrapped.addKey(key);
	}

	public SubLList asArrayList() {
		return this.wrapped.asArrayList();
	}

	public SubLList asConsList() {
		return this.wrapped.asConsList();
	}

	public BigInteger bigIntegerValue() {
		return this.wrapped.bigIntegerValue();
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		this.wrapped.bind(newValue, bindings);
	}

	public boolean canFastHash() {
		return this.wrapped.canFastHash();
	}

	public char charValue() {
		return this.wrapped.charValue();
	}

	public void checkType(SubLSymbol predicate) throws SubLException {
		this.wrapped.checkType(predicate);
	}

	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
		this.wrapped.checkTypeInternal(predicate);
	}

	public Object clone() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void close() {
		this.wrapped.close();
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		return this.wrapped.currentBinding(bindings);
	}

	public SubLObject dec() {
		return this.wrapped.dec();
	}

	public double doubleValue() {
		return this.wrapped.doubleValue();
	}

	public SubLObject eighth() {
		return this.wrapped.eighth();
	}

	public void enforceType(SubLSymbol predicate) throws SubLException {
		this.wrapped.enforceType(predicate);
	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
		this.wrapped.enforceTypeInternal(predicate);
	}

	public boolean eql(SubLObject obj) {
		return this.wrapped.eql(obj);
	}

	public boolean equal(SubLObject obj) {
		return this.wrapped.equal(obj);
	}

	public boolean equalp(SubLObject obj) {
		return this.wrapped.equalp(obj);
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this.wrapped.eval(env);
	}

	public SubLObject fifth() {
		return this.wrapped.fifth();
	}

	public SubLObject first() {
		return this.wrapped.first();
	}

	public SubLObject fourth() {
		return this.wrapped.fourth();
	}

	public SubLObject get(int index) {
		return this.wrapped.get(index);
	}

	public SubLObject get(SubLObject obj) {
		return this.wrapped.get(obj);
	}

	public SubLCharacter getCharacter(int index) {
		return this.wrapped.getCharacter(index);
	}

	public String getDigest() {
		this.buffer.limit(this.buffer.position());
		this.buffer.rewind();
		this.digest.update(this.buffer);
		byte[] result = this.digest.digest();
		return SubLDigestInputTextStream.makeHexStringFromByteArray(result);
	}

	public SubLSymbol getDirection() {
		return this.wrapped.getDirection();
	}

	public SubLSymbol getElementType() {
		return this.wrapped.getElementType();
	}

	public FileDescriptor getFD() {
		return this.wrapped.getFD();
	}

	public SubLObject getField(int fieldNum) {
		return this.wrapped.getField(fieldNum);
	}

	public SubLObject getField0() {
		return this.wrapped.getField0();
	}

	public SubLObject getField1() {
		return this.wrapped.getField1();
	}

	public SubLObject getField10() {
		return this.wrapped.getField10();
	}

	public SubLObject getField11() {
		return this.wrapped.getField11();
	}

	public SubLObject getField12() {
		return this.wrapped.getField12();
	}

	public SubLObject getField13() {
		return this.wrapped.getField13();
	}

	public SubLObject getField14() {
		return this.wrapped.getField14();
	}

	public SubLObject getField15() {
		return this.wrapped.getField15();
	}

	public SubLObject getField16() {
		return this.wrapped.getField16();
	}

	public SubLObject getField17() {
		return this.wrapped.getField17();
	}

	public SubLObject getField18() {
		return this.wrapped.getField18();
	}

	public SubLObject getField19() {
		return this.wrapped.getField19();
	}

	public SubLObject getField2() {
		return this.wrapped.getField2();
	}

	public SubLObject getField20() {
		return this.wrapped.getField20();
	}

	public SubLObject getField3() {
		return this.wrapped.getField3();
	}

	public SubLObject getField4() {
		return this.wrapped.getField4();
	}

	public SubLObject getField5() {
		return this.wrapped.getField5();
	}

	public SubLObject getField6() {
		return this.wrapped.getField6();
	}

	public SubLObject getField7() {
		return this.wrapped.getField7();
	}

	public SubLObject getField8() {
		return this.wrapped.getField8();
	}

	public SubLObject getField9() {
		return this.wrapped.getField9();
	}

	public File getFile() {
		return this.wrapped.getFile();
	}

	public String getFileDesignator() {
		return this.wrapped.getFileDesignator();
	}

	public long getFilePointer() {
		return this.wrapped.getFilePointer();
	}

	public long getFlushCount() {
		return this.wrapped.getFlushCount();
	}

	public SubLFunction getFunc() {
		return this.wrapped.getFunc();
	}

	public long getInputIndex() {
		return this.wrapped.getInputIndex();
	}

	public String getNewline() {
		return this.wrapped.getNewline();
	}

	public int getNumSize() {
		return this.wrapped.getNumSize();
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	public SubLList getStreams() {
		return this.wrapped.getStreams();
	}

	public SubLSymbol getStreamSymbol() {
		return this.wrapped.getStreamSymbol();
	}

	public String getString() {
		return this.wrapped.getString();
	}

	public SubLSymbol getType() {
		return this.wrapped.getType();
	}

	public SubLFixnum getTypeCode() {
		return this.wrapped.getTypeCode();
	}

	public int hashCode(int currentDepth) {
		return this.wrapped.hashCode(currentDepth);
	}

	public boolean hasKey(SubLObject obj) {
		return this.wrapped.hasKey(obj);
	}

	public SubLSymbol ifExists() {
		return this.wrapped.ifExists();
	}

	public SubLSymbol ifNotExists() {
		return this.wrapped.ifNotExists();
	}

	public SubLObject inc() {
		return this.wrapped.inc();
	}

	public int intValue() {
		return this.wrapped.intValue();
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isArrayBased() {
		return this.wrapped.isArrayBased();
	}

	public boolean isAtom() {
		return this.wrapped.isAtom();
	}

	public boolean isBigIntegerBignum() {
		return this.wrapped.isBigIntegerBignum();
	}

	public boolean isBignum() {
		return this.wrapped.isBignum();
	}

	public boolean isBoolean() {
		return this.wrapped.isBoolean();
	}

	public boolean isChar() {
		return this.wrapped.isChar();
	}

	public boolean isClosed() {
		return this.wrapped.isClosed();
	}

	public boolean isCons() {
		return this.wrapped.isCons();
	}

	public boolean isDouble() {
		return this.wrapped.isDouble();
	}

	public boolean isEnvironment() {
		return this.wrapped.isEnvironment();
	}

	public boolean isError() {
		return this.wrapped.isError();
	}

	public boolean isFixnum() {
		return this.wrapped.isFixnum();
	}

	public boolean isFunction() {
		return this.wrapped.isFunction();
	}

	public boolean isFunctionSpec() {
		return this.wrapped.isFunctionSpec();
	}

	public boolean isGuid() {
		return this.wrapped.isGuid();
	}

	public boolean isHashtable() {
		return this.wrapped.isHashtable();
	}

	public boolean isHashtableIterator() {
		return this.wrapped.isHashtableIterator();
	}

	public boolean isIntBignum() {
		return this.wrapped.isIntBignum();
	}

	public boolean isInteger() {
		return this.wrapped.isInteger();
	}

	public boolean isInteractive() {
		return this.wrapped.isInteractive();
	}

	public boolean isKeyhash() {
		return this.wrapped.isKeyhash();
	}

	public boolean isKeyhashIterator() {
		return this.wrapped.isKeyhashIterator();
	}

	public boolean isKeyword() {
		return this.wrapped.isKeyword();
	}

	public boolean isList() {
		return this.wrapped.isList();
	}

	public boolean isLock() {
		return this.wrapped.isLock();
	}

	public boolean isLongBignum() {
		return this.wrapped.isLongBignum();
	}

	public boolean isMacroOperator() {
		return this.wrapped.isMacroOperator();
	}

	public boolean isMemoryMapped() {
		return this.wrapped.isMemoryMapped();
	}

	public boolean isNegative() {
		return this.wrapped.isNegative();
	}

	public boolean isNil() {
		return this.wrapped.isNil();
	}

	public boolean isNumber() {
		return this.wrapped.isNumber();
	}

	public boolean isPackage() {
		return this.wrapped.isPackage();
	}

	public boolean isPackageIterator() {
		return this.wrapped.isPackageIterator();
	}

	public boolean isPositive() {
		return this.wrapped.isPositive();
	}

	public boolean isProcess() {
		return this.wrapped.isProcess();
	}

	public boolean isRandomAccess() {
		return this.wrapped.isRandomAccess();
	}

	public boolean isReadWriteLock() {
		return this.wrapped.isReadWriteLock();
	}

	public boolean isRegexPattern() {
		return this.wrapped.isRegexPattern();
	}

	public boolean isSemaphore() {
		return this.wrapped.isSemaphore();
	}

	public boolean isSequence() {
		return this.wrapped.isSequence();
	}

	public boolean isStream() {
		return true;
	}

	public boolean isString() {
		return this.wrapped.isString();
	}

	public boolean isStructure() {
		return this.wrapped.isStructure();
	}

	public boolean isSymbol() {
		return this.wrapped.isSymbol();
	}

	public boolean isVector() {
		return this.wrapped.isVector();
	}

	public boolean isZero() {
		return this.wrapped.isZero();
	}

	public SubLObject last(int i) {
		return this.wrapped.last(i);
	}

	public long length() {
		return this.wrapped.length();
	}

	public long longValue() {
		return this.wrapped.longValue();
	}

	public SubLObject makeCopy() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject makeDeepCopy() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private void maybeResizeBuffer() {
		if (this.buffer_size - 1 == this.buffer.position()) {
			ByteBuffer old_buffer = this.buffer;
			this.buffer_size *= 2;
			this.bytes = new byte[this.buffer_size];
			this.buffer = ByteBuffer.wrap(this.bytes);
			old_buffer.rewind();
			this.buffer.put(old_buffer);
		}
	}

	public SubLObject mult(SubLObject num) {
		return this.wrapped.mult(num);
	}

	public SubLObject ninth() {
		return this.wrapped.ninth();
	}

	public SubLObject nthCdr(int index) {
		return this.wrapped.nthCdr(index);
	}

	public long numBytesAvailable() {
		return this.wrapped.numBytesAvailable();
	}

	public boolean numE(SubLObject x) {
		return this.wrapped.numE(x);
	}

	public boolean numG(SubLObject x) {
		return this.wrapped.numG(x);
	}

	public boolean numGE(SubLObject x) {
		return this.wrapped.numGE(x);
	}

	public boolean numL(SubLObject x) {
		return this.wrapped.numL(x);
	}

	public boolean numLE(SubLObject x) {
		return this.wrapped.numLE(x);
	}

	public SubLObject put(SubLObject key, SubLObject value) {
		return this.wrapped.put(key, value);
	}

	public int read() {
		int result = this.wrapped.read();
		if (result == -1)
			return result;
		this.maybeResizeBuffer();
		if (result < 256)
			this.buffer.put((byte) result);
		else
			this.buffer.putChar((char) result);
		return result;
	}

	public int read(byte[] b) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int read(byte[] b, int off, int len) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		if (true)
			throw new UnsupportedOperationException("Not supported yet.");
		return wrapped.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
	}

	public int readByteSequenceToString(SubLString str) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int readChar() {
		return this.read();
	}

	public int readChar(char[] cbuf) {
		return this.readChar(cbuf, 0, cbuf.length);
	}

	public int readChar(char[] cbuf, int off, int len) {
		int curChar = -1;
		int i = off;
		for (int size = off + len; i < size; ++i) {
			curChar = this.read();
			if (curChar == -1)
				break;
			cbuf[i] = (char) curChar;
		}
		return i;
	}

	public boolean ready() {
		return this.wrapped.ready();
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		this.wrapped.rebind(oldValue, bindings);
	}

	public boolean remKey(SubLObject obj) {
		return this.wrapped.remKey(obj);
	}

	public SubLObject remove(SubLObject obj) {
		return this.wrapped.remove(obj);
	}

	public SubLObject rest() {
		return this.wrapped.rest();
	}

	public SubLSequence reverse(boolean isDestructive) {
		return this.wrapped.reverse(isDestructive);
	}

	public SubLObject second() {
		return this.wrapped.second();
	}

	public void seek(long pos) {
		this.wrapped.seek(pos);
	}

	public void set(int index, SubLObject val) {
		this.wrapped.set(index, val);
	}

	public void setField(int fieldNum, SubLObject value) {
		this.wrapped.setField(fieldNum, value);
	}

	public SubLObject setField0(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField1(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField10(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField11(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField12(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField13(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField14(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField15(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField16(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField17(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField18(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField19(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField2(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField20(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField3(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField4(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField5(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField6(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField7(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField8(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLObject setField9(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SubLCons setFirst(SubLObject first) {
		return this.wrapped.setFirst(first);
	}

	public void setIsInteractive(boolean newValue) {
		this.wrapped.setIsInteractive(newValue);
	}

	public void setLength(long newLength) {
		this.wrapped.setLength(newLength);
	}

	public void setNewline(String newline) {
		this.wrapped.setNewline(newline);
	}

	public SubLCons setRest(SubLObject rest) {
		return this.wrapped.setRest(rest);
	}

	public SubLObject seventh() {
		return this.wrapped.seventh();
	}

	public SubLObject sixth() {
		return this.wrapped.sixth();
	}

	public int size() {
		return this.wrapped.size();
	}

	public int size(int max) {
		return this.wrapped.size();
	}

	public long skip(long n) {
		return this.wrapped.skip(n);
	}

	public SubLObject sub(SubLObject num) {
		return this.wrapped.sub(num);
	}

	public int superHash() {
		return this.wrapped.superHash();
	}

	public SubLObject tenth() {
		return this.wrapped.tenth();
	}

	public SubLObject third() {
		return this.wrapped.third();
	}

	public SubLCharacter toChar() {
		return this.wrapped.toChar();
	}

	public SubLCons toCons() {
		return this.wrapped.toCons();
	}

	public SubLDoubleFloat toDouble() {
		return this.wrapped.toDouble();
	}

	public SubLEnvironment toEnv() {
		return this.wrapped.toEnv();
	}

	public SubLFixnum toFixnum() {
		return this.wrapped.toFixnum();
	}

	public SubLGuid toGuid() {
		return this.wrapped.toGuid();
	}

	public SubLHashtable toHashtable() {
		return this.wrapped.toHashtable();
	}

	public SubLHashtableIterator toHashtableIterator() {
		return this.wrapped.toHashtableIterator();
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		return this.wrapped.toInputBinaryStream();
	}

	public SubLInputStream toInputStream() {
		return this;
	}

	public SubLInputTextStream toInputTextStream() {
		return this;
	}

	public SubLInteger toInteger() {
		return this.wrapped.toInteger();
	}

	public SubLKeyhash toKeyhash() {
		return this.wrapped.toKeyhash();
	}

	public SubLKeyhashIterator toKeyhashIterator() {
		return this.wrapped.toKeyhashIterator();
	}

	public SubLList toList() {
		return this.wrapped.toList();
	}

	public SubLLock toLock() {
		return this.wrapped.toLock();
	}

	public SubLMacro toMacro() {
		return this.wrapped.toMacro();
	}

	public SubLNumber toNumber() {
		return this.wrapped.toNumber();
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this.wrapped.toOutputBinaryStream();
	}

	public SubLOutputStream toOutputStream() {
		return this.wrapped.toOutputStream();
	}

	public SubLOutputTextStream toOutputTextStream() {
		return this.wrapped.toOutputTextStream();
	}

	public SubLPackage toPackage() {
		return this.wrapped.toPackage();
	}

	public SubLPackageIterator toPackageIterator() {
		return this.wrapped.toPackageIterator();
	}

	public SubLProcess toProcess() {
		return this.wrapped.toProcess();
	}

	public SubLReadWriteLock toReadWriteLock() {
		return this.wrapped.toReadWriteLock();
	}

	public SubLRegexPattern toRegexPattern() {
		return this.wrapped.toRegexPattern();
	}

	public SubLSemaphore toSemaphore() {
		return this.wrapped.toSemaphore();
	}

	public SubLSequence toSeq() {
		return this.wrapped.toSeq();
	}

	public SubLString toStr() {
		return this.wrapped.toStr();
	}

	public SubLStruct toStruct() {
		return this.wrapped.toStruct();
	}

	public SubLSymbol toSymbol() {
		return this.wrapped.toSymbol();
	}

	public String toTypeName() {
		return this.wrapped.toTypeName();
	}

	public SubLVector toVect() {
		return this.wrapped.toVect();
	}

	public void unread(int c) {
		this.wrapped.unread(c);
		this.buffer.position(this.buffer.position() - 1);
	}

	public String writeToString() {
		// TODO Auto-generated method stub
		return null;
	}

}
