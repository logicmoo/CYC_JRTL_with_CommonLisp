/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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

public class SubLDigestInputTextStream extends LispObject implements SubLStream, SubLInputTextStream {
	public SubLDigestInputTextStream(SubLInputTextStream outerStream, MessageDigest digest) {
		bytes = null;
		buffer_size = 0;
		wrapped = outerStream;
		this.digest = digest;
		bytes = new byte[131072];
		buffer = ByteBuffer.wrap(bytes);
		buffer_size = 131072;
	}

	/**
	 * Attempts to read characters into the specified character buffer.
	 * The buffer is used as a repository of characters as-is: the only
	 * changes made are the results of a put operation. No flipping or
	 * rewinding of the buffer is performed.
	 *
	 * @param cb the buffer to read characters into
	 * @return The number of {@code char} values added to the buffer,
	 *                 or -1 if this source of characters is at its end
	 * @throws IOException if an I/O error occurs
	 * @throws NullPointerException if cb is null
	 * @throws java.nio.ReadOnlyBufferException if cb is a read only buffer
	 * @since 1.5
	 */
	public int read(java.nio.CharBuffer target) throws IOException {
		int len = target.remaining();
		char[] cbuf = new char[len];
		int n = read(cbuf, 0, len);
		if (n > 0)
			target.put(cbuf, 0, n);
		return n;
	}

	public int read(char[] b, int off, int len) {
		int curChar = -1;
		int i = 0;
		for (int size = off + len; i < size;) {
			curChar = this.read();
			if (curChar == -1)
				break;
			b[i] = (char) curChar;
			i++;
		}
		return i;
	}

	@Override
	public Stream toLispObject() {
		return wrapped.toLispObject();
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
	final PrintStream sout = Errors.trout;

		sout.println("--  " + makeHexStringFromByteArray(digest.digest()));
		byte[] curr = { 0, 10 };
		for (int i = 0; i < 256; ++i) {
			curr[0] = (byte) i;
			sout.print(makeHexStringFromByteArray(curr));
			sout.print("  ");
			digest.update(curr);
			byte[] result = digest.digest();
			sout.println(makeHexStringFromByteArray(result));
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
	public static int INITIAL_CAPACITY = 131072;

	private void maybeResizeBuffer() {
		if (buffer_size - 1 == buffer.position()) {
			ByteBuffer old_buffer = buffer;
			buffer_size *= 2;
			bytes = new byte[buffer_size];
			buffer = ByteBuffer.wrap(bytes);
			old_buffer.rewind();
			buffer.put(old_buffer);
		}
	}

	@Override
	public SubLObject add(SubLObject num) {
		return wrapped.add(num);
	}

	@Override
	public void addKey(SubLObject key) {
		wrapped.addKey(key);
	}

	@Override
	public SubLList asArrayList() {
		return wrapped.asArrayList();
	}

	@Override
	public SubLList asConsList() {
		return wrapped.asConsList();
	}

	@Override
	public BigInteger bigIntegerValue() {
		return wrapped.bigIntegerValue();
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		wrapped.bind(newValue, bindings);
	}

	@Override
	public boolean canFastHash() {
		return wrapped.canFastHash();
	}

	@Override
	public char charValue() {
		return wrapped.charValue();
	}

	@Override
	public void checkType(SubLSymbol predicate) throws SubLException {
		wrapped.checkType(predicate);
	}

	@Override
	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
		wrapped.checkTypeInternal(predicate);
	}

	@Override
	public Object clone() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void close() {
		wrapped.close();
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		return wrapped.currentBinding(bindings);
	}

	@Override
	public SubLObject dec() {
		return wrapped.dec();
	}

	@Override
	public double doubleValue() {
		return wrapped.doubleValue();
	}

	@Override
	public SubLObject eighth() {
		return wrapped.eighth();
	}

	@Override
	public void enforceType(SubLSymbol predicate) throws SubLException {
		wrapped.enforceType(predicate);
	}

	@Override
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
		wrapped.enforceTypeInternal(predicate);
	}

	@Override
	public boolean eql(SubLObject obj) {
		return wrapped.eql(obj);
	}

	@Override
	public boolean equal(SubLObject obj) {
		return wrapped.equal(obj);
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return wrapped.equalp(obj);
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return wrapped.eval(env);
	}

	@Override
	public SubLObject fifth() {
		return wrapped.fifth();
	}

	@Override
	public SubLObject first() {
		return wrapped.first();
	}

	@Override
	public SubLObject fourth() {
		return wrapped.fourth();
	}

	@Override
	public SubLObject get(int index) {
		return wrapped.get(index);
	}

	@Override
	public SubLObject get(SubLObject obj) {
		return wrapped.get(obj);
	}

	@Override
	public SubLCharacter getCharacter(int index) {
		return wrapped.getCharacter(index);
	}

	public String getDigest() {
		buffer.limit(buffer.position());
		buffer.rewind();
		digest.update(buffer);
		byte[] result = digest.digest();
		return makeHexStringFromByteArray(result);
	}

	@Override
	public SubLSymbol getDirection() {
		return wrapped.getDirection();
	}

	@Override
	public SubLSymbol getElementType() {
		return wrapped.getElementType();
	}

	@Override
	public FileDescriptor getFD() {
		return wrapped.getFD();
	}

	@Override
	public SubLObject getField(int fieldNum) {
		return wrapped.getField(fieldNum);
	}

	@Override
	public SubLObject getField0() {
		return wrapped.getField0();
	}

	@Override
	public SubLObject getField1() {
		return wrapped.getField1();
	}

	@Override
	public SubLObject getField10() {
		return wrapped.getField10();
	}

	@Override
	public SubLObject getField11() {
		return wrapped.getField11();
	}

	@Override
	public SubLObject getField12() {
		return wrapped.getField12();
	}

	@Override
	public SubLObject getField13() {
		return wrapped.getField13();
	}

	@Override
	public SubLObject getField14() {
		return wrapped.getField14();
	}

	@Override
	public SubLObject getField15() {
		return wrapped.getField15();
	}

	@Override
	public SubLObject getField16() {
		return wrapped.getField16();
	}

	@Override
	public SubLObject getField17() {
		return wrapped.getField17();
	}

	@Override
	public SubLObject getField18() {
		return wrapped.getField18();
	}

	@Override
	public SubLObject getField19() {
		return wrapped.getField19();
	}

	@Override
	public SubLObject getField2() {
		return wrapped.getField2();
	}

	@Override
	public SubLObject getField20() {
		return wrapped.getField20();
	}

	@Override
	public SubLObject getField3() {
		return wrapped.getField3();
	}

	@Override
	public SubLObject getField4() {
		return wrapped.getField4();
	}

	@Override
	public SubLObject getField5() {
		return wrapped.getField5();
	}

	@Override
	public SubLObject getField6() {
		return wrapped.getField6();
	}

	@Override
	public SubLObject getField7() {
		return wrapped.getField7();
	}

	@Override
	public SubLObject getField8() {
		return wrapped.getField8();
	}

	@Override
	public SubLObject getField9() {
		return wrapped.getField9();
	}

	@Override
	public File getFile() {
		return wrapped.getFile();
	}

	@Override
	public String getFileDesignator() {
		return wrapped.getFileDesignator();
	}

	@Override
	public long getFilePointer() {
		return wrapped.getFilePointer();
	}

	@Override
	public long getFlushCount() {
		return wrapped.getFlushCount();
	}

	@Override
	public SubLFunction getFunc() {
		return wrapped.getFunc();
	}

	@Override
	public long getInputIndex() {
		return wrapped.getInputIndex();
	}

	@Override
	public String getNewline() {
		return wrapped.getNewline();
	}

	@Override
	public int getNumSize() {
		return wrapped.getNumSize();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public SubLList getStreams() {
		return wrapped.getStreams();
	}

	@Override
	public SubLSymbol getStreamSymbol() {
		return wrapped.getStreamSymbol();
	}

	@Override
	public String getString() {
		return wrapped.getString();
	}

	@Override
	public String getStringValue() {
		return wrapped.getString();
	}

	@Override
	public SubLSymbol getType() {
		return wrapped.getType();
	}

	@Override
	public SubLFixnum getTypeCode() {
		return wrapped.getTypeCode();
	}

	@Override
	public int hashCode(int currentDepth) {
		return wrapped.hashCode(currentDepth);
	}

	@Override
	public boolean hasKey(SubLObject obj) {
		return wrapped.hasKey(obj);
	}

	@Override
	public SubLSymbol ifExists() {
		return wrapped.ifExists();
	}

	@Override
	public SubLSymbol ifNotExists() {
		return wrapped.ifNotExists();
	}

	@Override
	public SubLObject inc() {
		return wrapped.inc();
	}

	@Override
	public int intValue() {
		return wrapped.intValue();
	}

	@Override
	public boolean isAlien() {
		return wrapped.isAlien();
	}

	@Override
	public boolean isArrayBased() {
		return wrapped.isArrayBased();
	}

	@Override
	public boolean isAtom() {
		return wrapped.isAtom();
	}

	@Override
	public boolean isBigIntegerBignum() {
		return wrapped.isBigIntegerBignum();
	}

	@Override
	public boolean isBignum() {
		return wrapped.isBignum();
	}

	@Override
	public boolean isBoolean() {
		return wrapped.isBoolean();
	}

	@Override
	public boolean isChar() {
		return wrapped.isChar();
	}

	@Override
	public boolean isClosed() {
		return wrapped.isClosed();
	}

	@Override
	public boolean isCons() {
		return wrapped.isCons();
	}

	@Override
	public boolean isDouble() {
		return wrapped.isDouble();
	}

	@Override
	public boolean isEnvironment() {
		return wrapped.isEnvironment();
	}

	@Override
	public boolean isError() {
		return wrapped.isError();
	}

	@Override
	public boolean isFixnum() {
		return wrapped.isFixnum();
	}

	@Override
	public boolean isFunction() {
		return wrapped.isFunction();
	}

	@Override
	public boolean isFunctionSpec() {
		return wrapped.isFunctionSpec();
	}

	@Override
	public boolean isGuid() {
		return wrapped.isGuid();
	}

	@Override
	public boolean isHashtable() {
		return wrapped.isHashtable();
	}

	@Override
	public boolean isHashtableIterator() {
		return wrapped.isHashtableIterator();
	}

	@Override
	public boolean isIntBignum() {
		return wrapped.isIntBignum();
	}

	@Override
	public boolean isInteger() {
		return wrapped.isInteger();
	}

	@Override
	public boolean isInteractive() {
		return wrapped.isInteractive();
	}

	@Override
	public boolean isKeyhash() {
		return wrapped.isKeyhash();
	}

	@Override
	public boolean isKeyhashIterator() {
		return wrapped.isKeyhashIterator();
	}

	@Override
	public boolean isKeyword() {
		return wrapped.isKeyword();
	}

	@Override
	public boolean isList() {
		return wrapped.isList();
	}

	@Override
	public boolean isLock() {
		return wrapped.isLock();
	}

	@Override
	public boolean isLongBignum() {
		return wrapped.isLongBignum();
	}

	@Override
	public boolean isMacroOperator() {
		return wrapped.isMacroOperator();
	}

	@Override
	public boolean isMemoryMapped() {
		return wrapped.isMemoryMapped();
	}

	@Override
	public boolean isNegative() {
		return wrapped.isNegative();
	}

	@Override
	public boolean isNil() {
		return wrapped.isNil();
	}

	@Override
	public boolean isNumber() {
		return wrapped.isNumber();
	}

	@Override
	public boolean isPackage() {
		return wrapped.isPackage();
	}

	@Override
	public boolean isPackageIterator() {
		return wrapped.isPackageIterator();
	}

	@Override
	public boolean isPositive() {
		return wrapped.isPositive();
	}

	@Override
	public boolean isProcess() {
		return wrapped.isProcess();
	}

	@Override
	public boolean isRandomAccess() {
		return wrapped.isRandomAccess();
	}

	@Override
	public boolean isReadWriteLock() {
		return wrapped.isReadWriteLock();
	}

	@Override
	public boolean isRegexPattern() {
		return wrapped.isRegexPattern();
	}

	@Override
	public boolean isSemaphore() {
		return wrapped.isSemaphore();
	}

	@Override
	public boolean isSequence() {
		return wrapped.isSequence();
	}

	@Override
	public boolean isStream() {
		return true;
	}

	@Override
	public boolean isString() {
		return wrapped.isString();
	}

	@Override
	public boolean isStructure() {
		return wrapped.isStructure();
	}

	@Override
	public boolean isSymbol() {
		return wrapped.isSymbol();
	}

	@Override
	public boolean isVector() {
		return wrapped.isVector();
	}

	@Override
	public boolean isZero() {
		return wrapped.isZero();
	}

	@Override
	public SubLObject last(int i) {
		return wrapped.last(i);
	}

	@Override
	public long file_length() {
		return wrapped.file_length();
	}

	@Override
	public long longValue() {
		return wrapped.longValue();
	}

	@Override
	public SubLObject makeCopy() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject makeDeepCopy() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject mult(SubLObject num) {
		return wrapped.mult(num);
	}

	@Override
	public SubLObject ninth() {
		return wrapped.ninth();
	}

	@Override
	public SubLObject nthCdr(int index) {
		return wrapped.nthCdr(index);
	}

	@Override
	public long numBytesAvailable() {
		return wrapped.numBytesAvailable();
	}

	@Override
	public boolean numE(SubLObject x) {
		return wrapped.numE(x);
	}

	@Override
	public boolean numG(SubLObject x) {
		return wrapped.numG(x);
	}

	@Override
	public boolean numGE(SubLObject x) {
		return wrapped.numGE(x);
	}

	@Override
	public boolean numL(SubLObject x) {
		return wrapped.numL(x);
	}

	@Override
	public boolean numLE(SubLObject x) {
		return wrapped.numLE(x);
	}

	@Override
	public SubLObject put(SubLObject key, SubLObject value) {
		return wrapped.put(key, value);
	}

	@Override
	public int read() {
		int result = wrapped.read();
		if (result == -1)
			return result;
		maybeResizeBuffer();
		if (result < 256)
			buffer.put((byte) result);
		else
			buffer.putChar((char) result);
		return result;
	}

	@Override
	public int read(byte[] b) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int read(byte[] b, int off, int len) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int readChar() {
		return this.read();
	}

	@Override
	public int readChar(char[] cbuf) {
		return this.readChar(cbuf, 0, cbuf.length);
	}

	@Override
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

	@Override
	public boolean ready() {
		return wrapped.ready();
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		wrapped.rebind(oldValue, bindings);
	}

	@Override
	public boolean remKey(SubLObject obj) {
		return wrapped.remKey(obj);
	}

	@Override
	public SubLObject remove(SubLObject obj) {
		return wrapped.remove(obj);
	}

	@Override
	public SubLObject rest() {
		return wrapped.rest();
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		return wrapped.reverse(isDestructive);
	}

	@Override
	public SubLObject second() {
		return wrapped.second();
	}

	@Override
	public void seek(long pos) {
		wrapped.seek(pos);
	}

	@Override
	public void set(int index, SubLObject val) {
		wrapped.set(index, val);
	}

	@Override
	public void setField(int fieldNum, SubLObject value) {
		wrapped.setField(fieldNum, value);
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField10(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField11(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField12(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField13(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField14(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField15(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField16(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField17(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField18(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField19(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField2(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField20(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField3(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField4(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField5(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField6(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField7(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField8(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLObject setField9(SubLObject newVal) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		return wrapped.setFirst(first);
	}

	@Override
	public void setIsInteractive(boolean newValue) {
		wrapped.setIsInteractive(newValue);
	}

	@Override
	public void setLength(long newLength) {
		wrapped.setLength(newLength);
	}

	@Override
	public void setNewline(String newline) {
		wrapped.setNewline(newline);
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		return wrapped.setRest(rest);
	}

	@Override
	public SubLObject seventh() {
		return wrapped.seventh();
	}

	@Override
	public SubLObject sixth() {
		return wrapped.sixth();
	}

	@Override
	public int size() {
		return wrapped.size();
	}

	@Override
	public int size(int max) {
		return wrapped.size();
	}

	@Override
	public long skip(long n) {
		return wrapped.skip(n);
	}

	@Override
	public SubLObject sub(SubLObject num) {
		return wrapped.sub(num);
	}
//
//	@Override
//	public int superHash() {
//		return wrapped.superHash();
//	}

	@Override
	public SubLObject tenth() {
		return wrapped.tenth();
	}

	@Override
	public SubLObject third() {
		return wrapped.third();
	}

	@Override
	public SubLCharacter toChar() {
		return wrapped.toChar();
	}

	@Override
	public SubLCons toCons() {
		return wrapped.toCons();
	}

	@Override
	public SubLDoubleFloat toDouble() {
		return wrapped.toDouble();
	}

	@Override
	public SubLEnvironment toEnv() {
		return wrapped.toEnv();
	}

	@Override
	public SubLFixnum toFixnum() {
		return wrapped.toFixnum();
	}

	@Override
	public SubLGuid toGuid() {
		return wrapped.toGuid();
	}

	@Override
	public SubLHashtable toHashtable() {
		return wrapped.toHashtable();
	}

	@Override
	public SubLHashtableIterator toHashtableIterator() {
		return wrapped.toHashtableIterator();
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return wrapped.toInputBinaryStream();
	}

	@Override
	public SubLInputStream toInputStream() {
		return this;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		return this;
	}

	@Override
	public SubLInteger toInteger() {
		return wrapped.toInteger();
	}

	@Override
	public SubLKeyhash toKeyhash() {
		return wrapped.toKeyhash();
	}

	@Override
	public SubLKeyhashIterator toKeyhashIterator() {
		return wrapped.toKeyhashIterator();
	}

	@Override
	public SubLList toList() {
		return wrapped.toList();
	}

	@Override
	public SubLLock toLock() {
		return wrapped.toLock();
	}

	@Override
	public SubLMacro toMacro() {
		return wrapped.toMacro();
	}

	@Override
	public SubLNumber toNumber() {
		return wrapped.toNumber();
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return wrapped.toOutputBinaryStream();
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return wrapped.toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return wrapped.toOutputTextStream();
	}

	@Override
	public SubLPackage toPackage() {
		return wrapped.toPackage();
	}

	@Override
	public SubLPackageIterator toPackageIterator() {
		return wrapped.toPackageIterator();
	}

	@Override
	public SubLProcess toProcess() {
		return wrapped.toProcess();
	}

	@Override
	public SubLReadWriteLock toReadWriteLock() {
		return wrapped.toReadWriteLock();
	}

	@Override
	public SubLRegexPattern toRegexPattern() {
		return wrapped.toRegexPattern();
	}

	@Override
	public SubLSemaphore toSemaphore() {
		return wrapped.toSemaphore();
	}

	@Override
	public SubLSequence toSeq() {
		return wrapped.toSeq();
	}

	@Override
	public SubLString toStr() {
		return wrapped.toStr();
	}

	@Override
	public SubLStruct toStruct() {
		return wrapped.toStruct();
	}

	@Override
	public SubLSymbol toSymbol() {
		return wrapped.toSymbol();
	}

	@Override
	public String toTypeName() {
		return wrapped.toTypeName();
	}

	@Override
	public SubLVector toVect() {
		return wrapped.toVect();
	}

	@Override
	public void unread(int c) {
		wrapped.unread(c);
		buffer.position(buffer.position() - 1);
	}
}
