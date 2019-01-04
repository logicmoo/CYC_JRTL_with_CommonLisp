package org.armedbear.lisp;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackReader;
import java.io.Writer;

import org.armedbear.lisp.Stream.EolStyle;
import org.armedbear.lisp.Stream.ReadtableAccessor;

public interface ILispStream {

	EolStyle platformEolStyle = Utilities.isPlatformWindows ? EolStyle.CRLF : EolStyle.LF;

	boolean isInputStream();

	boolean isOutputStream();

	boolean isCharacterInputStream();

	boolean isBinaryInputStream();

	boolean isCharacterOutputStream();

	boolean isBinaryOutputStream();

	boolean isInteractive();

	void setInteractive(boolean b);

	LispObject getExternalFormat();

	String getEncoding();

	void setExternalFormat(LispObject format);

	boolean isOpen();

	void setOpen(boolean b);

	LispObject getStreamElementType();

	// Character input.
	int getOffset();

	// Character input.
	int getLineNumber();

	// Character output.
	int getCharPos();

	// Character output.
	void setCharPos(int n);

	LispObject read(boolean eofError, LispObject eofValue, boolean recursive, LispThread thread, ReadtableAccessor rta);

	LispObject readPreservingWhitespace(boolean eofError, LispObject eofValue, boolean recursive, LispThread thread,
			ReadtableAccessor rta);

	LispObject readPathname(ReadtableAccessor rta);

	LispObject readSymbol();

	LispObject readSymbol(Readtable rt);

	LispObject readStructure(ReadtableAccessor rta);

	LispObject readString(char terminator, ReadtableAccessor rta);

	LispObject readList(boolean requireProperList, ReadtableAccessor rta);

	LispObject readDispatchChar(char dispChar, ReadtableAccessor rta);

	LispObject readSharpLeftParen(char c, int n, ReadtableAccessor rta);

	LispObject readSharpStar(char ignored, int n, ReadtableAccessor rta);

	LispObject readSharpDot(char c, int n, ReadtableAccessor rta);

	LispObject readCharacterLiteral(Readtable rt, LispThread thread);

	void skipBalancedComment();

	LispObject readArray(int rank, ReadtableAccessor rta);

	LispObject readComplex(ReadtableAccessor rta);

	LispObject readRadix(int radix, ReadtableAccessor rta);

	LispObject readDelimitedList(char delimiter);

	// read-line &optional stream eof-error-p eof-value recursive-p
	// => line, missing-newline-p
	// recursive-p is ignored
	LispObject readLine(boolean eofError, LispObject eofValue);

	// read-char &optional stream eof-error-p eof-value recursive-p => char
	// recursive-p is ignored
	LispObject READ_CHAR();

	LispObject readChar(boolean eofError, LispObject eofValue);

	// read-char-no-hang &optional stream eof-error-p eof-value recursive-p => char
	// recursive-p is ignored
	LispObject readCharNoHang(boolean eofError, LispObject eofValue);

	// unread-char character &optional input-stream => nil
	LispObject unreadChar(LispCharacter c);

	LispObject finishOutput();

	// clear-input &optional input-stream => nil
	LispObject clearInput();

	LispObject getFilePosition();

	LispObject setFilePosition(LispObject arg);

	// close stream &key abort => result
	// Must return true if stream was open, otherwise implementation-dependent.
	LispObject close(LispObject abort);

	// read-byte stream &optional eof-error-p eof-value => byte
	// Reads an 8-bit byte.
	LispObject readByte(boolean eofError, LispObject eofValue);

	LispObject terpri();

	LispObject FRESH_LINE();

	void print(char c);

	// PRIN1 produces output suitable for input to READ.
	// Binds *PRINT-ESCAPE* to true.
	void prin1(LispObject obj);

	LispObject listen();

	LispObject fileLength();

	LispObject fileStringLength(LispObject arg);

	/** Writes a character into the underlying stream,
	 * updating charPos while doing so
	 *
	 * @param c
	 */
	void _writeChar(char c);

	/** Writes a series of characters in the underlying stream,
	 * updating charPos while doing so
	 *
	 * @param chars
	 * @param start
	 * @param end
	 */
	void _writeChars(char[] chars, int start, int end);

	/** Writes a string to the underlying stream,
	 * updating charPos while doing so
	 *
	 * @param s
	 */
	void _writeString(String s);

	/** Writes a string to the underlying stream, appending
	 * a new line and updating charPos while doing so
	 *
	 * @param s
	 */
	void _writeLine(String s);

	// Reads an 8-bit byte.
	/** Reads an 8-bit byte off the underlying stream
	 *
	 * @return
	 */
	int _readByte();

	// Writes an 8-bit byte.
	/** Writes an 8-bit byte off the underlying stream
	 *
	 * @param n
	 */
	void _writeByte(int n);

	/** Flushes any buffered output in the (underlying) stream
	 *
	 */
	void _finishOutput();

	/** Reads all input from the underlying stream,
	 * until _charReady() indicates no more input to be available
	 *
	 */
	void _clearInput();

	/** Closes the stream and underlying streams
	 *
	 */
	void _close();

	void printStackTrace(Throwable t);

	InputStream getWrappedInputStream();

	OutputStream getWrappedOutputStream();

	Writer getWrappedWriter();

	PushbackReader getWrappedReader();

}