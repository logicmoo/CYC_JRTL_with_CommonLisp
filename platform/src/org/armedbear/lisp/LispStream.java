/*
 * Stream.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Stream.java 12559 2010-03-17 19:43:24Z astalla $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

/**
 * The stream class
 *
 * A base class for all Lisp built-in streams.
 *
 */
public interface LispStream extends SubLObject {

	boolean _charReady() throws IOException;

	void _clearInput();

	void _close();

	void _finishOutput();

	long _getFilePosition();

	int _readByte();

	int _readChar() throws IOException;

	boolean _setFilePosition(SubLObject arg);

	void _unreadChar(int n) throws IOException;

	void _writeByte(int n);

	void _writeChar(char n);

	void _writeChars(char[] chars, int start, int end);

	void _writeLine(String string);

	void _writeString(String prefix);

	SubLObject clearInput();

	SubLObject close(SubLObject nil);

	SubLObject faslRead(boolean b, SubLObject nil, boolean c, LispThread thread);

	SubLObject faslReadArray(int n);

	SubLObject faslReadComplex();

	SubLObject faslReadPathname();

	SubLObject faslReadRadix(int i);

	SubLObject fileLength();

	SubLObject fileStringLength(SubLObject arg);

	SubLObject finishOutput();

	SubLObject freshLine();

	int getCharPos();

	SubLObject getElementType();

	SubLObject getExternalFormat();

	SubLObject getFilePosition();

	int getLineNumber();

	int getOffset();

	boolean isBinaryInputStream();

	boolean isBinaryOutputStream();

	boolean isCharacterInputStream();

	boolean isCharacterOutputStream();

	boolean isInputStream();
	// protected SubLObject elementType;
	// protected boolean isInputStream;
	// protected boolean isOutputStream;
	// protected boolean isCharacterStream;
	// protected boolean isBinaryStream;
	//
	// private boolean pastEnd = false;
	// private boolean interactive;
	// private boolean open = true;
	//
	// // Character input.
	// protected PushbackReader reader;
	// protected int offset;
	// protected int lineNumber;
	//
	// // Character output.
	// private Writer writer;
	//
	// /** The number of characters on the current line of output
	// *
	// * Used to determine whether additional line feeds are
	// * required when calling FRESH-LINE
	// */
	// protected int charPos;
	//
	// public enum EolStyle {
	// RAW,
	// CR,
	// CRLF,
	// LF
	// }
	//
	// static protected SubLSymbol keywordDefault = internKeyword("DEFAULT");
	//
	// static private SubLSymbol keywordCodePage = internKeyword("CODE-PAGE");
	// static private SubLSymbol keywordID = internKeyword("ID");
	//
	// static private SubLSymbol keywordEolStyle = internKeyword("EOL-STYLE");
	// static private SubLSymbol keywordCR = internKeyword("CR");
	// static private SubLSymbol keywordLF = internKeyword("LF");
	// static private SubLSymbol keywordCRLF = internKeyword("CRLF");
	// static private SubLSymbol keywordRAW = internKeyword("RAW");
	//
	// public static EolStyle platformEolStyle = Utilities.isPlatformWindows ?
	// EolStyle.CRLF : EolStyle.LF;
	//
	// protected EolStyle eolStyle = platformEolStyle;
	// protected char eolChar = (eolStyle == EolStyle.CR) ? '\r' : '\n';
	// protected SubLObject externalFormat = keywordDefault;
	// protected String encoding = null;
	// protected char lastChar = 0;
	//
	// // Binary input.
	// private InputStream in;
	//
	// // Binary output.
	// private OutputStream out;
	//
	// protected SubLStream(SubLSymbol structureClass) {
	// super(structureClass);
	// }
	//
	// public SubLStream(SubLSymbol structureClass, InputStream stream) {
	// this(structureClass);
	// initAsBinaryInputStream(stream);
	// }
	//
	// public SubLStream(SubLSymbol structureClass, Reader r) {
	// this(structureClass);
	// initAsCharacterInputStream(r);
	// }
	//
	// public SubLStream(SubLSymbol structureClass, OutputStream stream) {
	// this(structureClass);
	// initAsBinaryOutputStream(stream);
	// }
	//
	// public SubLStream(SubLSymbol structureClass, Writer w) {
	// this(structureClass);
	// initAsCharacterOutputStream(w);
	// }
	//
	// public SubLStream(SubLSymbol structureClass, InputStream inputStream,
	// SubLObject elementType) {
	// this(structureClass, inputStream, elementType, keywordDefault);
	// }
	//
	//
	// // Input stream constructors.
	// public SubLStream(SubLSymbol structureClass, InputStream inputStream,
	// SubLObject elementType, SubLObject format) {
	// this(structureClass);
	// this.elementType = elementType;
	// setExternalFormat(format);
	//
	// if (elementType == LispSymbols.CHARACTER || elementType ==
	// LispSymbols.BASE_CHAR) {
	// Reader reader =
	// new DecodingReader(inputStream, 4096,
	// (encoding == null)
	// ? Charset.defaultCharset()
	// : Charset.forName(encoding));
	// initAsCharacterInputStream(reader);
	// } else {
	// isBinaryStream = true;
	// InputStream stream = new BufferedInputStream(inputStream);
	// initAsBinaryInputStream(stream);
	// }
	// }
	//
	// public SubLStream(SubLSymbol structureClass, InputStream inputStream,
	// SubLObject elementType, boolean interactive) {
	// this(structureClass, inputStream, elementType);
	// setInteractive(interactive);
	// }
	//
	// public SubLStream(SubLSymbol structureClass, OutputStream outputStream,
	// SubLObject elementType) {
	// this(structureClass, outputStream, elementType, keywordDefault);
	// }
	//
	// // Output stream constructors.
	// public SubLStream(SubLSymbol structureClass, OutputStream outputStream,
	// SubLObject elementType, SubLObject format) {
	// this(structureClass);
	// this.elementType = elementType;
	// setExternalFormat(format);
	// if (elementType == LispSymbols.CHARACTER || elementType ==
	// LispSymbols.BASE_CHAR) {
	// Writer w =
	// (encoding == null) ?
	// new OutputStreamWriter(outputStream)
	// : new OutputStreamWriter(outputStream,
	// Charset.forName(encoding).newEncoder());
	// initAsCharacterOutputStream(w);
	// } else {
	// OutputStream stream = new BufferedOutputStream(outputStream);
	// initAsBinaryOutputStream(stream);
	// }
	// }
	//
	// public SubLStream(SubLSymbol structureClass, OutputStream outputStream,
	// SubLObject elementType,
	// boolean interactive) {
	// this(structureClass, outputStream, elementType);
	// setInteractive(interactive);
	// }
	//
	// protected void initAsCharacterInputStream(Reader reader) {
	// if (! (reader instanceof PushbackReader))
	// this.reader = new PushbackReader(reader, 5);
	// else
	// this.reader = (PushbackReader)reader;
	//
	// isInputStream = true;
	// isCharacterStream = true;
	// }
	//
	// protected void initAsBinaryInputStream(InputStream in) {
	// this.in = in;
	// isInputStream = true;
	// isBinaryStream = true;
	// }
	//
	// protected void initAsCharacterOutputStream(Writer writer) {
	// this.writer = writer;
	// isOutputStream = true;
	// isCharacterStream = true;
	// }
	//
	// protected void initAsBinaryOutputStream(OutputStream out) {
	// this.out = out;
	// isOutputStream = true;
	// isBinaryStream = true;
	// }
	//
	// public boolean isInputStream() {
	// return isInputStream;
	// }
	//
	// public boolean isOutputStream() {
	// return isOutputStream;
	// }
	//
	// public boolean isCharacterInputStream() {
	// return isCharacterStream && isInputStream;
	// }
	//
	// public boolean isBinaryInputStream() {
	// return isBinaryStream && isInputStream;
	// }
	//
	// public boolean isCharacterOutputStream() {
	// return isCharacterStream && isOutputStream;
	// }
	//
	// public boolean isBinaryOutputStream() {
	// return isBinaryStream && isOutputStream;
	// }
	//
	// public boolean isInteractive() {
	// return interactive;
	// }
	//
	// public void setInteractive(boolean b) {
	// interactive = b;
	// }
	//
	// public SubLObject getExternalFormat() {
	// return externalFormat;
	// }
	//
	// public String getEncoding() {
	// return encoding;
	// }
	//
	// public void setExternalFormat(SubLObject format) {
	// // make sure we encode any remaining buffers with the current format
	// finishOutput();
	//
	// if (format == keywordDefault) {
	// encoding = null;
	// eolStyle = platformEolStyle;
	// eolChar = (eolStyle == EolStyle.CR) ? '\r' : '\n';
	// externalFormat = format;
	// return;
	// }
	//
	// SubLObject enc;
	// boolean encIsCp = false;
	//
	// if (format instanceof SubLCons) {
	// // meaning a non-empty list
	// enc = format.first();
	// if (enc == keywordCodePage) {
	// encIsCp = true;
	//
	// enc = getf(format.rest(), keywordID, null);
	// }
	//
	// SubLObject eol = getf(format.rest(), keywordEolStyle, keywordRAW);
	// if (eol == keywordCR)
	// eolStyle = EolStyle.CR;
	// else if (eol == keywordLF)
	// eolStyle = EolStyle.LF;
	// else if (eol == keywordCRLF)
	// eolStyle = EolStyle.CRLF;
	// else if (eol != keywordRAW)
	// ; //###FIXME: raise an error
	//
	// } else
	// enc = format;
	//
	// if (enc.isNumber())
	// encoding = enc.toString();
	// else if (enc instanceof SubLString)
	// encoding = enc.getString();
	// else if (enc == keywordDefault)
	// // This allows the user to use the encoding determined by
	// // Java to be the default for the current environment
	// // while still being able to set other stream options
	// // (e.g. :EOL-STYLE)
	// encoding = null;
	// else if (enc instanceof SubLSymbol)
	// encoding = ((SubLSymbol)enc).getJavaSymbolName();
	// else
	// ; //###FIXME: raise an error!
	//
	// if (encIsCp)
	// encoding = "Cp" + encoding;
	//
	// eolChar = (eolStyle == EolStyle.CR) ? '\r' : '\n';
	// externalFormat = format;
	//
	// if (reader != null
	// && reader instanceof DecodingReader)
	// ((DecodingReader)reader).setCharset(Charset.forName(encoding));
	// }
	//
	// public boolean isOpen() {
	// return open;
	// }
	//
	// public void setOpen(boolean b) {
	// open = b;
	// }
	//
	//
	// public SubLObject typeOf() {
	// return LispSymbols.SYSTEM_STREAM;
	// }
	//
	//
	// public SubLObject classOf() {
	// return BuiltInClass.SYSTEM_STREAM;
	// }
	//
	//
	// public SubLObject typep(SubLObject typeSpecifier) {
	// if (typeSpecifier == LispSymbols.SYSTEM_STREAM)
	// return T;
	// if (typeSpecifier == LispSymbols.STREAM)
	// return T;
	// if (typeSpecifier == BuiltInClass.STREAM)
	// return T;
	// return super.typep(typeSpecifier);
	// }
	//
	// public SubLObject getElementType() {
	// return elementType;
	// }
	//
	// // Character input.
	// public int getOffset() {
	// return offset;
	// }
	//
	// // Character input.
	// public int getLineNumber() {
	// return lineNumber;
	// }
	//
	// protected void setWriter(Writer writer) {
	// this.writer = writer;
	// }
	//
	// // Character output.
	// public int getCharPos() {
	// return charPos;
	// }
	//
	// // Character output.
	// public void setCharPos(int n) {
	// charPos = n;
	// }
	//
	// public SubLObject read(boolean eofError, SubLObject eofValue,
	// boolean recursive, LispThread thread)
	//
	// {
	// SubLObject result = readPreservingWhitespace(eofError, eofValue,
	// recursive, thread);
	// if (result != eofValue && !recursive) {
	// try {
	// if (_charReady()) {
	// int n = _readChar();
	// if (n >= 0) {
	// char c = (char) n; // ### BUG: Codepoint conversion
	// Readtable rt = (Readtable)
	// LispSymbols.CURRENT_READTABLE.symbolValue(thread);
	// if (!rt.isWhitespace(c))
	// _unreadChar(c);
	// }
	// }
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// else
	// return result;
	// }
	//
	// // ### *sharp-equal-alist*
	// // internal symbol
	// private static SubLSymbol _SHARP_EQUAL_ALIST_ =
	// internSpecial("*SHARP-EQUAL-ALIST*", PACKAGE_SYS, NIL);
	//
	// public SubLObject readPreservingWhitespace(boolean eofError,
	// SubLObject eofValue,
	// boolean recursive,
	// LispThread thread)
	//
	// {
	// if (recursive) {
	// Readtable rt = (Readtable)
	// LispSymbols.CURRENT_READTABLE.symbolValue(thread);
	// while (true) {
	// int n = -1;
	// try {
	// n = _readChar();
	// } catch (IOException e) {
	// Debug.trace(e);
	// error(new StreamError(this, e));
	// }
	// if (n < 0) {
	// if (eofError)
	// return error(new EndOfFile(this));
	// else
	// return eofValue;
	// }
	// char c = (char) n; // ### BUG: Codepoint conversion
	// if (rt.isWhitespace(c))
	// continue;
	// SubLObject result = processChar(c, rt);
	// if (result != null)
	// return result;
	// }
	// } else {
	// SpecialBindingsMark mark = thread.markSpecialBindings();
	// thread.bindSpecial(_SHARP_EQUAL_ALIST_, NIL);
	// try {
	// return readPreservingWhitespace(eofError, eofValue, true, thread);
	// } finally {
	// thread.resetSpecialBindings(mark);
	// }
	// }
	// }
	//
	// public SubLObject faslRead(boolean eofError, SubLObject eofValue,
	// boolean recursive, LispThread thread)
	//
	// {
	// try {
	// SubLObject result = faslReadPreservingWhitespace(eofError, eofValue,
	// recursive, thread);
	// if (result != eofValue && !recursive) {
	// if (_charReady()) {
	// int n = _readChar();
	// if (n >= 0) {
	// char c = (char) n; // ### BUG: Codepoint conversion
	// Readtable rt = FaslReadtable.getInstance();
	// if (!rt.isWhitespace(c))
	// _unreadChar(c);
	// }
	// }
	// }
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// else
	// return result;
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	// private SubLObject faslReadPreservingWhitespace(boolean eofError,
	// SubLObject eofValue,
	// boolean recursive,
	// LispThread thread)
	// throws IOException {
	// if (recursive) {
	// Readtable rt = FaslReadtable.getInstance();
	// while (true) {
	// int n = _readChar();
	// if (n < 0) {
	// if (eofError)
	// return error(new EndOfFile(this));
	// else
	// return eofValue;
	// }
	// char c = (char) n; // ### BUG: Codepoint conversion
	// if (rt.isWhitespace(c))
	// continue;
	// SubLObject result = processChar(c, rt);
	// if (result != null)
	// return result;
	// }
	// } else {
	// SpecialBindingsMark mark = thread.markSpecialBindings();
	// thread.bindSpecial(_SHARP_EQUAL_ALIST_, NIL);
	// try {
	// return faslReadPreservingWhitespace(eofError, eofValue, true, thread);
	// } finally {
	// thread.resetSpecialBindings(mark);
	// }
	// }
	// }
	//
	// private SubLObject processChar(char c, Readtable rt)
	//
	// {
	// SubLObject handler = rt.getReaderMacroFunction(c);
	// if (handler instanceof ReaderMacroFunction)
	// return ((ReaderMacroFunction)handler).execute(this, c);
	// if (handler != null && handler != NIL)
	// return handler.execute(this, LispCharacter.makeChar(c));
	// return readToken(c, rt);
	// }
	//
	// public SubLObject readPathname() {
	// SubLObject obj = read(true, NIL, false, LispThread.currentThread());
	// if (obj instanceof SubLString)
	// return Pathname.parseNamestring((SubLString)obj);
	// if (obj.isList())
	// return Pathname.makePathname(obj);
	// return error(new TypeError("#p requires a string or list argument."));
	// }
	//
	// public SubLObject faslReadPathname() {
	// SubLObject obj = faslRead(true, NIL, false, LispThread.currentThread());
	// if (obj instanceof SubLString)
	// return Pathname.parseNamestring((SubLString)obj);
	// if (obj.isList())
	// return Pathname.makePathname(obj);
	// return error(new TypeError("#p requires a string or list argument."));
	// }
	//
	// public SubLObject readSymbol() {
	// Readtable rt =
	// (Readtable)
	// LispSymbols.CURRENT_READTABLE.symbolValue(LispThread.currentThread());
	// StringBuilder sb = new StringBuilder();
	// _readToken(sb, rt);
	// return new LispSymbol(sb.toString());
	// }
	//
	// public SubLObject readSymbol(Readtable rt) {
	// StringBuilder sb = new StringBuilder();
	// _readToken(sb, rt);
	// return new LispSymbol(sb.toString());
	// }
	//
	// public SubLObject readStructure() {
	// LispThread thread = LispThread.currentThread();
	// SubLObject obj = read(true, NIL, true, thread);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (obj.isList()) {
	// SubLSymbol structure = checkSymbol(obj.first());
	// LispClass c = LispClass.findClass(structure);
	// if (!(c instanceof StructureClass))
	// return error(new ReaderError(structure.getJavaSymbolName() +
	// " is not a defined structure type.",
	// this));
	// SubLObject args = obj.rest();
	// SubLSymbol DEFSTRUCT_DEFAULT_CONSTRUCTOR =
	// PACKAGE_SYS.intern("DEFSTRUCT-DEFAULT-CONSTRUCTOR");
	// SubLObject constructor =
	// DEFSTRUCT_DEFAULT_CONSTRUCTOR.getSymbolFunctionOrDie().execute(structure);
	// int length = args.length();
	// if ((length % 2) != 0)
	// return error(new ReaderError("Odd number of keyword arguments following
	// #S: " +
	// obj.writeToString(),
	// this));
	// SubLObject[] array = makeLispObjectArray(length);
	// SubLObject rest = args;
	// for (int i = 0; i < length; i += 2) {
	// SubLObject key = rest.first();
	// if (key instanceof SubLSymbol && ((SubLSymbol)key).isKeyword()) {
	// array[i] = key;
	// } else {
	// array[i] = PACKAGE_KEYWORD.intern(javaString(key));
	// }
	// array[i + 1] = rest.second();
	// rest = rest.cddr();
	// }
	// return funcall(constructor.getSymbolFunctionOrDie(), array,
	// thread);
	// }
	// return error(new ReaderError("Non-list following #S: " +
	// obj.writeToString(),
	// this));
	// }
	//
	// public SubLObject faslReadStructure() {
	// LispThread thread = LispThread.currentThread();
	// SubLObject obj = faslRead(true, NIL, true, thread);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (obj.isList()) {
	// SubLSymbol structure = checkSymbol(obj.first());
	// LispClass c = LispClass.findClass(structure);
	// if (!(c instanceof StructureClass))
	// return error(new ReaderError(structure.getJavaSymbolName() +
	// " is not a defined structure type.",
	// this));
	// SubLObject args = obj.rest();
	// SubLSymbol DEFSTRUCT_DEFAULT_CONSTRUCTOR =
	// PACKAGE_SYS.intern("DEFSTRUCT-DEFAULT-CONSTRUCTOR");
	// SubLObject constructor =
	// DEFSTRUCT_DEFAULT_CONSTRUCTOR.getSymbolFunctionOrDie().execute(structure);
	// int length = args.length();
	// if ((length % 2) != 0)
	// return error(new ReaderError("Odd number of keyword arguments following
	// #S: " +
	// obj.writeToString(),
	// this));
	// SubLObject[] array = makeLispObjectArray(length);
	// SubLObject rest = args;
	// for (int i = 0; i < length; i += 2) {
	// SubLObject key = rest.first();
	// if (key instanceof SubLSymbol && ((SubLSymbol)key).isKeyword()) {
	// array[i] = key;
	// } else {
	// array[i] = PACKAGE_KEYWORD.intern(javaString(key));
	// }
	// array[i + 1] = rest.second();
	// rest = rest.cddr();
	// }
	// return funcall(constructor.getSymbolFunctionOrDie(), array,
	// thread);
	// }
	// return error(new ReaderError("Non-list following #S: " +
	// obj.writeToString(),
	// this));
	// }
	//
	// public SubLObject readList(boolean requireProperList, boolean
	// useFaslReadtable)
	//
	// {
	// LispThread thread = LispThread.currentThread();
	// SubLCons first = null;
	// SubLCons last = null;
	// Readtable rt = null;
	// if (useFaslReadtable)
	// rt = FaslReadtable.getInstance();
	// try {
	// while (true) {
	// if (!useFaslReadtable)
	// rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
	// char c = flushWhitespace(rt);
	// if (c == ')') {
	// return first == null ? NIL : first;
	// }
	// if (c == '.') {
	// int n = _readChar();
	// if (n < 0)
	// return error(new EndOfFile(this));
	// char nextChar = (char) n; // ### BUG: Codepoint conversion
	// if (isTokenDelimiter(nextChar, rt)) {
	// if (last == null) {
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// else
	// return error(new ReaderError("Nothing appears before . in list.",
	// this));
	// }
	// _unreadChar(nextChar);
	// SubLObject obj = read(true, NIL, true, thread);
	// if (requireProperList) {
	// if (!obj.isList())
	// error(new ReaderError("The value " +
	// obj.writeToString() +
	// " is not of type " +
	// LispSymbols.LIST.writeToString() + ".",
	// this));
	// }
	// last.setCdr(obj);
	// continue;
	// }
	// // normal token beginning with '.'
	// _unreadChar(nextChar);
	// }
	// SubLObject obj = processChar(c, rt);
	// if (obj == null) {
	// // A comment.
	// continue;
	// }
	// if (first == null) {
	// first = makeCons(obj);
	// last = first;
	// } else {
	// SubLCons newCons = makeCons(obj);
	// last.setCdr(newCons);
	// last = newCons;
	// }
	// }
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// return null;
	// }
	// }
	//
	// private static boolean isTokenDelimiter(char c, Readtable rt)
	//
	// {
	// switch (c) {
	// case '"':
	// case '\'':
	// case '(':
	// case ')':
	// case ',':
	// case ';':
	// case '`':
	// return true;
	// default:
	// return rt.isWhitespace(c);
	// }
	// }
	//
	// public SubLObject readDispatchChar(char dispChar, boolean
	// useFaslReadtable)
	//
	// {
	// int numArg = -1;
	// char c = 0;
	// try {
	// while (true) {
	// int n = _readChar();
	// if (n < 0)
	// return error(new EndOfFile(this));
	// c = (char) n; // ### BUG: Codepoint conversion
	// if (c < '0' || c > '9')
	// break;
	// if (numArg < 0)
	// numArg = 0;
	// numArg = numArg * 10 + c - '0';
	// }
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// LispThread thread = LispThread.currentThread();
	// Readtable rt;
	// if (useFaslReadtable)
	// rt = FaslReadtable.getInstance();
	// else
	// rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
	// SubLObject fun = rt.getDispatchMacroCharacter(dispChar, c);
	// if (fun instanceof DispatchMacroFunction)
	// return ((DispatchMacroFunction)fun).execute(this, c, numArg);
	// if (fun != NIL) {
	// SubLObject result =
	// thread.execute(fun, this, LispCharacter.makeChar(c),
	// (numArg < 0) ? NIL : LispObjectFactory.makeInteger(numArg));
	// SubLObject[] values = thread._values;
	// if (values != null && values.length == 0)
	// result = null;
	// thread._values = null;
	// return result;
	// }
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return null;
	// return error(new ReaderError("No dispatch function defined for #\\" + c,
	// this));
	// }
	//
	// public SubLObject readCharacterLiteral(Readtable rt, LispThread thread)
	//
	// {
	// try {
	// int n = _readChar();
	// if (n < 0)
	// return error(new EndOfFile(this));
	// char c = (char) n; // ### BUG: Codepoint conversion
	// StringBuilder sb = new StringBuilder(String.valueOf(c));
	// while (true) {
	// n = _readChar();
	// if (n < 0)
	// break;
	// c = (char) n; // ### BUG: Codepoint conversion
	// if (rt.isWhitespace(c))
	// break;
	// if (c == '(' || c == ')') {
	// _unreadChar(c);
	// break;
	// }
	// sb.append(c);
	// }
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (sb.length() == 1)
	// return LispCharacter.makeChar(sb.charAt(0));
	// String token = sb.toString();
	// n = CharacterFunctions.nameToChar(token);
	// if (n >= 0)
	// return LispCharacter.makeChar((char)n); // ### BUG: Codepoint conversion
	// return error(new LispError("Unrecognized character name: \"" + token +
	// '"'));
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	// public void skipBalancedComment() {
	// try {
	// while (true) {
	// int n = _readChar();
	// if (n < 0)
	// return;
	// if (n == '|') {
	// n = _readChar();
	// if (n == '#')
	// return;
	// else
	// _unreadChar(n);
	// } else if (n == '#') {
	// n = _readChar();
	// if (n == '|')
	// skipBalancedComment(); // Nested comment. Recurse!
	// else
	// _unreadChar(n);
	// }
	// }
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// public SubLObject readArray(int rank) {
	// LispThread thread = LispThread.currentThread();
	// SubLObject obj = read(true, NIL, true, thread);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// switch (rank) {
	// case -1:
	// return error(new ReaderError("No dimensions argument to #A.", this));
	// case 0:
	// return new ZeroRankArray(T, obj, false);
	// case 1: {
	// if (obj.isList() || obj instanceof AbstractVector)
	// return makeSimpleVector(obj);
	// return error(new ReaderError(obj.writeToString() + " is not a sequence.",
	// this));
	// }
	// default:
	// return new SimpleArray_T(rank, obj);
	// }
	// }
	//
	// public SubLObject faslReadArray(int rank) {
	// LispThread thread = LispThread.currentThread();
	// SubLObject obj = faslRead(true, NIL, true, thread);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// switch (rank) {
	// case -1:
	// return error(new ReaderError("No dimensions argument to #A.", this));
	// case 0:
	// return new ZeroRankArray(T, obj, false);
	// case 1: {
	// if (obj.isList() || obj instanceof AbstractVector)
	// return makeSimpleVector(obj);
	// return error(new ReaderError(obj.writeToString() + " is not a sequence.",
	// this));
	// }
	// default:
	// return new SimpleArray_T(rank, obj);
	// }
	// }
	//
	// public SubLObject readComplex() {
	// LispThread thread = LispThread.currentThread();
	// SubLObject obj = read(true, NIL, true, thread);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (obj instanceof SubLCons && obj.length() == 2)
	// return LispObjectFactory.makeComplex(obj.first(), obj.second());
	// // Error.
	// StringBuilder sb = new StringBuilder("Invalid complex number format");
	// if (this instanceof FileStream) {
	// Pathname p = ((FileStream)this).getPathname();
	// if (p != null) {
	// String namestring = p.getNamestring();
	// if (namestring != null) {
	// sb.append(" in #P\"");
	// sb.append(namestring);
	// sb.append('"');
	// }
	// }
	// sb.append(" at offset ");
	// sb.append(_getFilePosition());
	// }
	// sb.append(": #C");
	// sb.append(obj.writeToString());
	// return error(new ReaderError(sb.toString(), this));
	// }
	//
	// public SubLObject faslReadComplex() {
	// LispThread thread = LispThread.currentThread();
	// SubLObject obj = faslRead(true, NIL, true, thread);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (obj instanceof SubLCons && obj.length() == 2)
	// return LispObjectFactory.makeComplex(obj.first(), obj.second());
	// // Error.
	// StringBuilder sb = new StringBuilder("Invalid complex number format");
	// if (this instanceof FileStream) {
	// Pathname p = ((FileStream)this).getPathname();
	// if (p != null) {
	// String namestring = p.getNamestring();
	// if (namestring != null) {
	// sb.append(" in #P\"");
	// sb.append(namestring);
	// sb.append('"');
	// }
	// }
	// sb.append(" at offset ");
	// sb.append(_getFilePosition());
	// }
	// sb.append(": #C");
	// sb.append(obj.writeToString());
	// return error(new ReaderError(sb.toString(), this));
	// }
	//
	// private String readMultipleEscape(Readtable rt) {
	// StringBuilder sb = new StringBuilder();
	// try {
	// while (true) {
	// int n = _readChar();
	// if (n < 0) {
	// error(new EndOfFile(this));
	// // Not reached.
	// return null;
	// }
	// char c = (char) n; // ### BUG: Codepoint conversion
	// byte syntaxType = rt.getSyntaxType(c);
	// if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
	// n = _readChar();
	// if (n < 0) {
	// error(new EndOfFile(this));
	// // Not reached.
	// return null;
	// }
	// sb.append((char)n); // ### BUG: Codepoint conversion
	// continue;
	// }
	// if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE)
	// break;
	// sb.append(c);
	// }
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// return sb.toString();
	// }
	//
	// private static int findUnescapedSingleColon(String s, BitSet flags) {
	// if (flags == null)
	// return s.indexOf(':');
	// int limit = s.length();
	// for (int i = 0; i < limit; i++) {
	// if (s.charAt(i) == ':' && !flags.get(i)) {
	// return i;
	// }
	// }
	// return -1;
	// }
	//
	// private static int findUnescapedDoubleColon(String s, BitSet flags) {
	// if (flags == null)
	// return s.indexOf("::");
	// int limit = s.length() - 1;
	// for (int i = 0; i < limit; i++) {
	// if (s.charAt(i) == ':' && !flags.get(i)) {
	// if (s.charAt(i + 1) == ':' && !flags.get(i + 1)) {
	// return i;
	// }
	// }
	// }
	// return -1;
	// }
	//
	// private SubLObject readToken(char c, Readtable rt)
	//
	// {
	// StringBuilder sb = new StringBuilder(String.valueOf(c));
	// LispThread thread = LispThread.currentThread();
	// BitSet flags = _readToken(sb, rt);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// SubLObject readtableCase = rt.getReadtableCase();
	// String token;
	// if (readtableCase == Keyword.INVERT)
	// token = invert(sb.toString(), flags);
	// else
	// token = sb.toString();
	// int length = token.length();
	// if (length > 0) {
	// char firstChar = token.charAt(0);
	// if (flags == null) {
	// if (firstChar == '.') {
	// // Section 2.3.3: "If a token consists solely of dots (with
	// // no escape characters), then an error of type READER-
	// // ERROR is signaled, except in one circumstance: if the
	// // token is a single dot and appears in a situation where
	// // dotted pair notation permits a dot, then it is accepted
	// // as part of such syntax and no error is signaled."
	// boolean ok = false;
	// for (int i = length; i-- > 1;) {
	// if (token.charAt(i) != '.') {
	// ok = true;
	// break;
	// }
	// }
	// if (!ok) {
	// String message;
	// if (length > 1)
	// message = "Too many dots.";
	// else
	// message = "Dot context error.";
	// return error(new ReaderError(message, this));
	// }
	// }
	// int radix = getReadBase(thread);
	// if ("+-.0123456789".indexOf(firstChar) >= 0) {
	// SubLObject number = makeNumber(token, length, radix);
	// if (number != null)
	// return number;
	// } else if (Character.digit(firstChar, radix) >= 0) {
	// SubLObject number = makeNumber(token, length, radix);
	// if (number != null)
	// return number;
	// }
	// }
	// if (firstChar == ':')
	// if (flags == null || !flags.get(0))
	// return PACKAGE_KEYWORD.intern(token.substring(1));
	// int index = findUnescapedDoubleColon(token, flags);
	// if (index > 0) {
	// String packageName = token.substring(0, index);
	// String symbolName = token.substring(index + 2);
	// SubLPackage pkg = Packages.findPackage(packageName);
	// if (pkg == null)
	// return error(new LispError("Package \"" + packageName +
	// "\" not found."));
	// return pkg.intern(symbolName);
	// }
	// index = findUnescapedSingleColon(token, flags);
	// if (index > 0) {
	// String packageName = token.substring(0, index);
	// SubLPackage pkg = Packages.findPackage(packageName);
	// if (pkg == null)
	// return error(new PackageError("Package \"" + packageName +
	// "\" not found."));
	// String symbolName = token.substring(index + 1);
	// SubLString s = makeString(symbolName);
	// SubLSymbol symbol = pkg.findExternalSymbol(s);
	// if (symbol != null)
	// return symbol;
	// // Error!
	// if (pkg.findInternalSymbol(s) != null)
	// return error(new ReaderError("The symbol \"" + symbolName +
	// "\" is not external in package " +
	// packageName + '.',
	// this));
	// else
	// return error(new ReaderError("The symbol \"" + symbolName +
	// "\" was not found in package " +
	// packageName + '.',
	// this));
	// }
	// }
	// // Intern token in current package.
	// return
	// ((SubLPackage)LispSymbols._PACKAGE_.symbolValue(thread)).intern(makeString(token));
	// }
	//
	// private BitSet _readToken(StringBuilder sb, Readtable rt)
	//
	// {
	// BitSet flags = null;
	// SubLObject readtableCase = rt.getReadtableCase();
	// if (sb.length() > 0) {
	// Debug.assertTrue(sb.length() == 1);
	// char c = sb.charAt(0);
	// byte syntaxType = rt.getSyntaxType(c);
	// if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
	// int n = -1;
	// try {
	// n = _readChar();
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// return flags;
	// }
	// if (n < 0) {
	// error(new EndOfFile(this));
	// // Not reached.
	// return flags;
	// }
	// sb.setCharAt(0, (char) n); // ### BUG: Codepoint conversion
	// flags = new BitSet(1);
	// flags.set(0);
	// } else if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE) {
	// sb.setLength(0);
	// sb.append(readMultipleEscape(rt));
	// flags = new BitSet(sb.length());
	// for (int i = sb.length(); i-- > 0;)
	// flags.set(i);
	// } else if (rt.isInvalid(c)) {
	// rt.checkInvalid(c, this); // Signals a reader-error.
	// } else if (readtableCase == Keyword.UPCASE) {
	// sb.setCharAt(0, CharacterFunctions.toUpperCase(c));
	// } else if (readtableCase == Keyword.DOWNCASE) {
	// sb.setCharAt(0, CharacterFunctions.toLowerCase(c));
	// }
	// }
	// try {
	// while (true) {
	// int n = _readChar();
	// if (n < 0)
	// break;
	// char c = (char) n; // ### BUG: Codepoint conversion
	// if (rt.isWhitespace(c)) {
	// _unreadChar(n);
	// break;
	// }
	// byte syntaxType = rt.getSyntaxType(c);
	// if (syntaxType == Readtable.SYNTAX_TYPE_TERMINATING_MACRO) {
	// _unreadChar(c);
	// break;
	// }
	// rt.checkInvalid(c, this);
	// if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
	// n = _readChar();
	// if (n < 0)
	// break;
	// sb.append((char)n); // ### BUG: Codepoint conversion
	// if (flags == null)
	// flags = new BitSet(sb.length());
	// flags.set(sb.length() - 1);
	// continue;
	// }
	// if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE) {
	// int begin = sb.length();
	// sb.append(readMultipleEscape(rt));
	// int end = sb.length();
	// if (flags == null)
	// flags = new BitSet(sb.length());
	// for (int i = begin; i < end; i++)
	// flags.set(i);
	// continue;
	// }
	// if (readtableCase == Keyword.UPCASE)
	// c = CharacterFunctions.toUpperCase(c);
	// else if (readtableCase == Keyword.DOWNCASE)
	// c = CharacterFunctions.toLowerCase(c);
	// sb.append(c);
	// }
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// return flags;
	// }
	//
	// return flags;
	// }
	//
	// public static String invert(String s, BitSet flags) {
	// // Section 23.1.2: "When the readtable case is :INVERT, then if all of
	// // the unescaped letters in the extended token are of the same case,
	// // those (unescaped) letters are converted to the opposite case."
	// int limit = s.length();
	// int LOWER = 1;
	// int UPPER = 2;
	// int state = 0;
	// for (int i = 0; i < limit; i++) {
	// // We only care about unescaped characters.
	// if (flags != null && flags.get(i))
	// continue;
	// char c = s.charAt(i);
	// if (Character.isUpperCase(c)) {
	// if (state == LOWER)
	// return s; // Mixed case.
	// state = UPPER;
	// }
	// if (Character.isLowerCase(c)) {
	// if (state == UPPER)
	// return s; // Mixed case.
	// state = LOWER;
	// }
	// }
	// StringBuilder sb = new StringBuilder(limit);
	// for (int i = 0; i < limit; i++) {
	// char c = s.charAt(i);
	// if (flags != null && flags.get(i)) // Escaped.
	// sb.append(c);
	// else if (Character.isUpperCase(c))
	// sb.append(Character.toLowerCase(c));
	// else if (Character.isLowerCase(c))
	// sb.append(Character.toUpperCase(c));
	// else
	// sb.append(c);
	// }
	// return sb.toString();
	// }
	//
	// private static int getReadBase(LispThread thread)
	//
	// {
	// int readBase;
	// SubLObject readBaseObject = LispSymbols.READ_BASE.symbolValue(thread);
	// if (readBaseObject instanceof Fixnum) {
	// readBase = ((Fixnum)readBaseObject).value;
	// } else {
	// // The value of *READ-BASE* is not a Fixnum.
	// error(new LispError("The value of *READ-BASE* is not of type '(INTEGER 2
	// 36)."));
	// // Not reached.
	// return 10;
	// }
	// if (readBase < 2 || readBase > 36) {
	// error(new LispError("The value of *READ-BASE* is not of type '(INTEGER 2
	// 36)."));
	// // Not reached.
	// return 10;
	// }
	// return readBase;
	// }
	//
	// private SubLObject makeNumber(String token, int length, int radix)
	//
	// {
	// if (length == 0)
	// return null;
	// if (token.indexOf('/') >= 0)
	// return makeRatio(token, radix);
	// if (token.charAt(length - 1) == '.') {
	// radix = 10;
	// token = token.substring(0, --length);
	// }
	// boolean numeric = true;
	// if (radix == 10) {
	// for (int i = length; i-- > 0;) {
	// char c = token.charAt(i);
	// if (c < '0' || c > '9') {
	// if (i > 0 || (c != '-' && c != '+')) {
	// numeric = false;
	// break;
	// }
	// }
	// }
	// } else {
	// for (int i = length; i-- > 0;) {
	// char c = token.charAt(i);
	// if (Character.digit(c, radix) < 0) {
	// if (i > 0 || (c != '-' && c != '+')) {
	// numeric = false;
	// break;
	// }
	// }
	// }
	// }
	// if (!numeric) // Can't be an integer.
	// return makeFloat(token, length);
	// if (token.charAt(0) == '+')
	// token = token.substring(1);
	// try {
	// int n = Integer.parseInt(token, radix);
	// return (n >= 0 && n <= 255) ? Fixnum.constants[n] :
	// LispObjectFactory.makeInteger(n);
	// } catch (NumberFormatException e) {}
	// // parseInt() failed.
	// try {
	// return LispObjectFactory.makeInteger(token, radix);
	// } catch (NumberFormatException e) {}
	// // Not a number.
	// return null;
	// }
	//
	// private SubLObject makeRatio(String token, int radix)
	//
	// {
	// int index = token.indexOf('/');
	// if (index < 0)
	// return null;
	// try {
	// BigInteger numerator =
	// new BigInteger(token.substring(0, index), radix);
	// BigInteger denominator =
	// new BigInteger(token.substring(index + 1), radix);
	// // Check the denominator here, before calling number(), so we can
	// // signal a READER-ERROR, as required by ANSI, instead of DIVISION-
	// // BY-ZERO.
	// if (denominator.signum() == 0)
	// error(new ReaderError("Division by zero.", this));
	// return number(numerator, denominator);
	// } catch (NumberFormatException e) {
	// return null;
	// }
	// }
	//
	// private static SubLObject makeFloat(String token,
	// int length)
	//
	// {
	// if (length == 0)
	// return null;
	// StringBuilder sb = new StringBuilder();
	// int i = 0;
	// boolean maybe = false;
	// char marker = 0;
	// char c = token.charAt(i);
	// if (c == '-' || c == '+') {
	// sb.append(c);
	// ++i;
	// }
	// boolean hasDigit = false;
	// while (i < length) {
	// c = token.charAt(i);
	// if (c == '.' || (c >= '0' && c <= '9')) {
	// if (c == '.')
	// maybe = true;
	// else hasDigit = true;
	// sb.append(c);
	// ++i;
	// } else
	// break;
	// }
	// if (!hasDigit) return null;
	// if (i < length) {
	// c = token.charAt(i);
	// if ("esfdlESFDL".indexOf(c) >= 0) {
	// // Exponent marker.
	// maybe = true;
	// marker = CharacterFunctions.toUpperCase(c);
	// if (marker == 'S')
	// marker = 'F';
	// else if (marker == 'L') marker = 'D';
	// else if (marker == 'E') {
	// SubLObject format = LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue();
	// if (format == LispSymbols.SINGLE_FLOAT || format ==
	// LispSymbols.SHORT_FLOAT)
	// marker = 'F';
	// else
	// marker = 'D';
	// }
	// sb.append('E');
	// ++i;
	// }
	// }
	// if (!maybe)
	// return null;
	// // Append rest of token.
	// sb.append(token.substring(i));
	// try {
	// if (marker == 0) {
	// SubLObject format = LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue();
	// if (format == LispSymbols.SINGLE_FLOAT || format ==
	// LispSymbols.SHORT_FLOAT)
	// marker = 'F';
	// else
	// marker = 'D';
	// }
	// if (marker == 'D' || marker == 'L')
	// return makeDouble(marker,sb.toString());
	// else
	// return makeSingle(Float.parseFloat(sb.toString()));
	// } catch (NumberFormatException e) {
	// return null;
	// }
	// }
	//
	// public SubLObject readRadix(int radix) {
	// StringBuilder sb = new StringBuilder();
	// LispThread thread = LispThread.currentThread();
	// Readtable rt =
	// (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
	// boolean escaped = (_readToken(sb, rt) != null);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (escaped)
	// return error(new ReaderError("Illegal syntax for number.", this));
	// String s = sb.toString();
	// if (s.indexOf('/') >= 0)
	// return makeRatio(s, radix);
	// // Integer.parseInt() below handles a prefixed '-' character correctly,
	// but
	// // does not accept a prefixed '+' character, so we skip over it here
	// if (s.charAt(0) == '+')
	// s = s.substring(1);
	// try {
	// int n = Integer.parseInt(s, radix);
	// return (n >= 0 && n <= 255) ? Fixnum.constants[n] :
	// LispObjectFactory.makeInteger(n);
	// } catch (NumberFormatException e) {}
	// // parseInt() failed.
	// try {
	// return LispObjectFactory.makeInteger(s, radix);
	// } catch (NumberFormatException e) {}
	// // Not a number.
	// return error(new LispError());
	// }
	//
	// public SubLObject faslReadRadix(int radix) {
	// StringBuilder sb = new StringBuilder();
	// LispThread thread = LispThread.currentThread();
	// Readtable rt = FaslReadtable.getInstance();
	// boolean escaped = (_readToken(sb, rt) != null);
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// if (escaped)
	// return error(new ReaderError("Illegal syntax for number.", this));
	// String s = sb.toString();
	// if (s.indexOf('/') >= 0)
	// return makeRatio(s, radix);
	// try {
	// int n = Integer.parseInt(s, radix);
	// return (n >= 0 && n <= 255) ? Fixnum.constants[n] :
	// LispObjectFactory.makeInteger(n);
	// } catch (NumberFormatException e) {}
	// // parseInt() failed.
	// try {
	// return LispObjectFactory.makeInteger(s, radix);
	// } catch (NumberFormatException e) {}
	// // Not a number.
	// return error(new LispError());
	// }
	//
	// private char flushWhitespace(Readtable rt) {
	// try {
	// while (true) {
	// int n = _readChar();
	// if (n < 0) {
	// error(new EndOfFile(this));
	// // Not reached.
	// return 0;
	// }
	// char c = (char) n; // ### BUG: Codepoint conversion
	// if (!rt.isWhitespace(c))
	// return c;
	// }
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// return 0;
	// }
	// }
	//
	// public SubLObject readDelimitedList(char delimiter)
	//
	// {
	// LispThread thread = LispThread.currentThread();
	// SubLObject result = NIL;
	// while (true) {
	// Readtable rt = (Readtable)
	// LispSymbols.CURRENT_READTABLE.symbolValue(thread);
	// char c = flushWhitespace(rt);
	// if (c == delimiter)
	// break;
	// SubLObject obj = processChar(c, rt);
	// if (obj != null)
	// result = makeCons(obj, result);
	// }
	// if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL)
	// return NIL;
	// else
	// return result.nreverse();
	// }
	//
	// // read-line &optional stream eof-error-p eof-value recursive-p
	// // => line, missing-newline-p
	// // recursive-p is ignored
	// public SubLObject readLine(boolean eofError, SubLObject eofValue)
	//
	// {
	// LispThread thread = LispThread.currentThread();
	// StringBuilder sb = new StringBuilder();
	// try {
	// while (true) {
	// int n = _readChar();
	// if (n < 0) {
	// if (sb.length() == 0) {
	// if (eofError)
	// return error(new EndOfFile(this));
	// return thread.setValues(eofValue, T);
	// }
	// return thread.setValues(makeString(sb), T);
	// }
	// if (n == '\n')
	// return thread.setValues(makeString(sb), NIL);
	// else
	// sb.append((char)n); // ### BUG: Codepoint conversion
	// }
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	// // read-char &optional stream eof-error-p eof-value recursive-p => char
	// // recursive-p is ignored
	// public SubLObject readChar() {
	// try {
	// int n = _readChar();
	// if (n < 0)
	// return error(new EndOfFile(this));
	// return LispCharacter.makeChar((char)n); // ### BUG: Codepoint conversion
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	//
	// }
	//
	// public SubLObject readChar(boolean eofError, SubLObject eofValue)
	//
	// {
	// try {
	// int n = _readChar();
	// if (n < 0) {
	// if (eofError)
	// return error(new EndOfFile(this));
	// else
	// return eofValue;
	// }
	// return LispCharacter.makeChar((char)n); // ### BUG: Codepoint conversion
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	// // read-char-no-hang &optional stream eof-error-p eof-value recursive-p
	// => char
	// // recursive-p is ignored
	// public SubLObject readCharNoHang(boolean eofError, SubLObject eofValue)
	//
	// {
	// try {
	// return _charReady() ? readChar(eofError, eofValue) : NIL;
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	//
	// // unread-char character &optional input-stream => nil
	// public SubLObject unreadChar(LispCharacter c) {
	// try {
	// _unreadChar(c.value);
	// return NIL;
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	// public SubLObject finishOutput() {
	// _finishOutput();
	// return NIL;
	// }
	//
	// // clear-input &optional input-stream => nil
	// public SubLObject clearInput() {
	// _clearInput();
	// return NIL;
	// }
	//
	// public SubLObject getFilePosition() {
	// long pos = _getFilePosition();
	// return pos >= 0 ? number(pos) : NIL;
	// }
	//
	// public SubLObject setFilePosition(SubLObject arg) {
	// return _setFilePosition(arg) ? T : NIL;
	// }
	//
	// // close stream &key abort => result
	// // Must return true if stream was open, otherwise
	// implementation-dependent.
	// public SubLObject close(SubLObject abort) {
	// _close();
	// return T;
	// }
	//
	//
	// public String toString() {
	// return unreadableString("STREAM");
	// }
	//
	// // read-byte stream &optional eof-error-p eof-value => byte
	// // Reads an 8-bit byte.
	// public SubLObject readByte(boolean eofError, SubLObject eofValue)
	//
	// {
	// int n = _readByte();
	// if (n < 0) {
	// if (eofError)
	// return error(new EndOfFile(this));
	// else
	// return eofValue;
	// }
	// return Fixnum.constants[n];
	// }
	//
	// public SubLObject terpri() {
	// _writeChar('\n');
	// return NIL;
	// }
	//
	// public SubLObject freshLine() {
	// if (charPos == 0)
	// return NIL;
	// _writeChar('\n');
	// return T;
	// }
	//
	// public void print(char c) {
	// _writeChar(c);
	// }
	//
	// // PRIN1 produces output suitable for input to READ.
	// // Binds *PRINT-ESCAPE* to true.
	// public void prin1(SubLObject obj) {
	// LispThread thread = LispThread.currentThread();
	// SpecialBindingsMark mark = thread.markSpecialBindings();
	// thread.bindSpecial(LispSymbols.PRINT_ESCAPE, T);
	// try {
	// _writeString(obj.writeToString());
	// } finally {
	// thread.resetSpecialBindings(mark);
	// }
	// }
	//
	// public SubLObject listen() {
	// if (pastEnd)
	// return NIL;
	// try {
	// if (! _charReady())
	// return NIL;
	//
	// int n = _readChar();
	// if (n < 0)
	// return NIL;
	//
	// _unreadChar(n);
	//
	// return T;
	// } catch (IOException e) {
	// return error(new StreamError(this, e));
	// }
	// }
	//
	// public SubLObject fileLength() {
	// return type_error(this, LispSymbols.FILE_STREAM);
	// }
	//
	// public SubLObject fileStringLength(SubLObject arg) {
	// if (arg instanceof LispCharacter) {
	// if (Utilities.isPlatformWindows) {
	// if (((LispCharacter)arg).value == '\n')
	// return Fixnum.TWO;
	// }
	// return Fixnum.ONE;
	// }
	// if (arg instanceof SubLString) {
	// if (Utilities.isPlatformWindows) {
	// int fileStringLength = 0;
	// char[] chars = ((SubLString)arg).getStringChars();
	// for (int i = chars.length; i-- > 0;) {
	// if (chars[i] == '\n')
	// fileStringLength += 2;
	// else
	// ++fileStringLength;
	// }
	// return number(fileStringLength);
	//
	// }
	// return number(arg.length());
	// }
	// return error(new TypeError(arg.writeToString() +
	// " is neither a string nor a character."));
	// }
	//
	// /** Reads a character off an underlying stream
	// *
	// * @return a character, or -1 at end-of-file
	// */
	// protected int _readChar() throws IOException {
	// if (reader == null)
	// streamNotCharacterInputStream();
	//
	// int n = reader.read();
	//
	// if (n < 0) {
	// pastEnd = true;
	// return -1;
	// }
	//
	// ++offset;
	// if (n == '\r' && eolStyle == EolStyle.CRLF) {
	// n = _readChar();
	// if (n != '\n') {
	// _unreadChar(n);
	// return '\r';
	// } else
	// return '\n';
	// }
	//
	// if (n == eolChar) {
	// ++lineNumber;
	// return '\n';
	// }
	//
	// return n;
	// }
	//
	// /** Puts a character back into the (underlying) stream
	// *
	// * @param n
	// */
	// protected void _unreadChar(int n) throws IOException {
	// if (reader == null)
	// streamNotCharacterInputStream();
	//
	// --offset;
	// if (n == '\n') {
	// n = eolChar;
	// --lineNumber;
	// }
	//
	// reader.unread(n);
	// pastEnd = false;
	// }
	//
	//
	// /** Returns a boolean indicating input readily available
	// *
	// * @return true if a character is available
	// */
	// protected boolean _charReady() throws IOException {
	// if (reader == null)
	// streamNotCharacterInputStream();
	// return reader.ready();
	// }
	//
	// /** Writes a character into the underlying stream,
	// * updating charPos while doing so
	// *
	// * @param c
	// */
	// public void _writeChar(char c) {
	// try {
	// if (c == '\n') {
	// if (eolStyle == EolStyle.CRLF && lastChar != '\r')
	// writer.write('\r');
	//
	// writer.write(eolChar);
	// lastChar = eolChar;
	// writer.flush();
	// charPos = 0;
	// } else {
	// writer.write(c);
	// lastChar = c;
	// ++charPos;
	// }
	// } catch (NullPointerException e) {
	// // writer is null
	// streamNotCharacterOutputStream();
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// /** Writes a series of characters in the underlying stream,
	// * updating charPos while doing so
	// *
	// * @param chars
	// * @param start
	// * @param end
	// */
	// public void _writeChars(char[] chars, int start, int end)
	//
	// {
	// try {
	// if (eolStyle != EolStyle.RAW) {
	// for (int i = start; i < end; i++)
	// //###FIXME: the number of writes can be greatly reduced by
	// // writing the space between newlines as chunks.
	// _writeChar(chars[i]);
	// return;
	// }
	//
	// writer.write(chars, start, end - start);
	// if (start < end)
	// lastChar = chars[end-1];
	//
	// int index = -1;
	// for (int i = end; i-- > start;) {
	// if (chars[i] == '\n') {
	// index = i;
	// break;
	// }
	// }
	// if (index < 0) {
	// // No newline.
	// charPos += (end - start);
	// } else {
	// charPos = end - (index + 1);
	// writer.flush();
	// }
	// } catch (NullPointerException e) {
	// if (writer == null)
	// streamNotCharacterOutputStream();
	// else
	// throw e;
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// /** Writes a string to the underlying stream,
	// * updating charPos while doing so
	// *
	// * @param s
	// */
	// public void _writeString(String s) {
	// try {
	// _writeChars(s.toCharArray(), 0, s.length());
	// } catch (NullPointerException e) {
	// if (writer == null)
	// streamNotCharacterOutputStream();
	// else
	// throw e;
	// }
	// }
	//
	// /** Writes a string to the underlying stream, appending
	// * a new line and updating charPos while doing so
	// *
	// * @param s
	// */
	// public void _writeLine(String s) {
	// try {
	// _writeString(s);
	// _writeChar('\n');
	// } catch (NullPointerException e) {
	// // writer is null
	// streamNotCharacterOutputStream();
	// }
	// }
	//
	// // Reads an 8-bit byte.
	// /** Reads an 8-bit byte off the underlying stream
	// *
	// * @return
	// */
	// public int _readByte() {
	// try {
	// int n = in.read();
	// if (n < 0)
	// pastEnd = true;
	//
	// return n; // Reads an 8-bit byte.
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// // Not reached.
	// return -1;
	// }
	// }
	//
	// // Writes an 8-bit byte.
	// /** Writes an 8-bit byte off the underlying stream
	// *
	// * @param n
	// */
	// public void _writeByte(int n) {
	// try {
	// out.write(n); // Writes an 8-bit byte.
	// } catch (NullPointerException e) {
	// // out is null
	// streamNotBinaryOutputStream();
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// /** Flushes any buffered output in the (underlying) stream
	// *
	// */
	// public void _finishOutput() {
	// try {
	// if (writer != null)
	// writer.flush();
	// if (out != null)
	// out.flush();
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// /** Reads all input from the underlying stream,
	// * until _charReady() indicates no more input to be available
	// *
	// */
	// public void _clearInput() {
	// if (reader != null) {
	// int c = 0;
	// try {
	// while (_charReady() && (c >= 0))
	// c = _readChar();
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// } else if (in != null) {
	// try {
	// int n = 0;
	// while (in.available() > 0)
	// n = in.read();
	//
	// if (n < 0)
	// pastEnd = true;
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	// }
	//
	// /** Returns a (non-negative) file position integer or a negative value
	// * if the position cannot be determined.
	// *
	// * @return non-negative value as a position spec
	// * @return negative value for 'unspecified'
	// */
	// protected long _getFilePosition() {
	// return -1;
	// }
	//
	// /** Sets the file position based on a position designator passed in arg
	// *
	// * @param arg File position specifier as described in the CLHS
	// * @return true on success, false on failure
	// */
	// protected boolean _setFilePosition(SubLObject arg) {
	// return false;
	// }
	//
	// /** Closes the stream and underlying streams
	// *
	// */
	// public void _close() {
	// try {
	// if (reader != null)
	// reader.close();
	// if (in != null)
	// in.close();
	// if (writer != null)
	// writer.close();
	// if (out != null)
	// out.close();
	// setOpen(false);
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// public void printStackTrace(Throwable t) {
	// StringWriter sw = new StringWriter();
	// PrintWriter pw = new PrintWriter(sw);
	// t.printStackTrace(pw);
	// try {
	// writer.write(sw.toString());
	// writer.write('\n');
	// lastChar = '\n';
	// writer.flush();
	// charPos = 0;
	// } catch (IOException e) {
	// error(new StreamError(this, e));
	// }
	// }
	//
	// protected SubLObject streamNotInputStream() {
	// return error(new StreamError(this, writeToString() + " is not an input
	// stream."));
	// }
	//
	// protected SubLObject streamNotCharacterInputStream() {
	// return error(new StreamError(this, writeToString() + " is not a character
	// input stream."));
	// }
	//
	// protected SubLObject streamNotOutputStream() {
	// return error(new StreamError(this, writeToString() + " is not an output
	// stream."));
	// }
	//
	// protected SubLObject streamNotBinaryOutputStream() {
	// return error(new StreamError(this, writeToString() + " is not a binary
	// output stream."));
	// }
	//
	// protected SubLObject streamNotCharacterOutputStream() {
	// return error(new StreamError(this, writeToString() + " is not a character
	// output stream."));
	// }
	//
	//
	// public InputStream getWrappedInputStream() {
	// return in;
	// }
	//
	// public OutputStream getWrappedOutputStream() {
	// return out;
	// }
	//
	// public Writer getWrappedWriter() {
	// return writer;
	// }
	//
	// public PushbackReader getWrappedReader() {
	// return reader;
	// }

	boolean isInteractive();

	boolean isOpen();

	boolean isOutputStream();

	// SubLObject readCharacterLiteral(Readtable instance, LispThread
	// currentThread);

	SubLObject listen();

	void print(char c);

	void printStackTrace(Throwable t);

	SubLObject read(boolean b, SubLObject nil, boolean c, LispThread thread);

	SubLObject readArray(int n);

	SubLObject readByte(boolean b, SubLObject third);

	SubLObject readChar();

	SubLObject readChar(boolean b, SubLObject third);

	SubLObject readCharacterLiteral(Readtable rt, LispThread thread);

	SubLObject readCharNoHang(boolean eofError, SubLObject eofValue);

	SubLObject readComplex();

	SubLObject readDelimitedList(char c);

	SubLObject readDispatchChar(char c, boolean b);

	SubLObject readLine(boolean b, SubLObject third);

	SubLObject readList(boolean b, boolean c);

	SubLObject readPathname();

	SubLObject readPreservingWhitespace(boolean eofError, SubLObject eofValue, boolean recursive,
			LispThread currentThread);

	SubLObject readRadix(int i);

	SubLObject readStructure();

	SubLObject readSymbol();

	SubLObject readSymbol(Readtable instance);

	void setCharPos(int i);

	void setExternalFormat(SubLObject format);

	SubLObject setFilePosition(SubLObject second);

	void skipBalancedComment();

	SubLObject terpri();

	SubLObject unreadChar(LispCharacter result);

}
