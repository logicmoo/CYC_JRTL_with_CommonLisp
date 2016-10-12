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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.BitSet;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.util.DecodingReader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/**
 * The stream class
 *
 * A base class for all Lisp built-in streams.
 *
 */
public class Stream extends ABCLStructureObject implements LispStream {
	public enum EolStyle {
		RAW, CR, CRLF, LF
	}

	static protected SubLSymbol keywordDefault = Lisp.internKeyword("DEFAULT");
	static private SubLSymbol keywordCodePage = Lisp.internKeyword("CODE-PAGE");
	static private SubLSymbol keywordID = Lisp.internKeyword("ID");
	static private SubLSymbol keywordEolStyle = Lisp.internKeyword("EOL-STYLE");

	static private SubLSymbol keywordCR = Lisp.internKeyword("CR");
	static private SubLSymbol keywordLF = Lisp.internKeyword("LF");
	static private SubLSymbol keywordCRLF = Lisp.internKeyword("CRLF");

	static private SubLSymbol keywordRAW = Lisp.internKeyword("RAW");
	public static EolStyle platformEolStyle = Utilities.isPlatformWindows ? EolStyle.CRLF : EolStyle.LF;
	// ### *sharp-equal-alist*
	// internal symbol
	private static SubLSymbol _SHARP_EQUAL_ALIST_ = Lisp.internSpecial("*SHARP-EQUAL-ALIST*", Lisp.PACKAGE_SYS,
			Lisp.NIL);

	private static int findUnescapedDoubleColon(String s, BitSet flags) {
		if (flags == null)
			return s.indexOf("::");
		int limit = s.length() - 1;
		for (int i = 0; i < limit; i++)
			if (s.charAt(i) == ':' && !flags.get(i))
				if (s.charAt(i + 1) == ':' && !flags.get(i + 1))
					return i;
		return -1;
	}

	private static int findUnescapedSingleColon(String s, BitSet flags) {
		if (flags == null)
			return s.indexOf(':');
		int limit = s.length();
		for (int i = 0; i < limit; i++)
			if (s.charAt(i) == ':' && !flags.get(i))
				return i;
		return -1;
	}

	private static int getReadBase(LispThread thread)

	{
		int readBase;
		SubLObject readBaseObject = LispSymbols.READ_BASE.symbolValue(thread);
		if (readBaseObject instanceof Fixnum)
			readBase = ((Fixnum) readBaseObject).value;
		else {
			// The value of *READ-BASE* is not a Fixnum.
			Lisp.error(new LispError("The value of *READ-BASE* is not of type '(INTEGER 2 36)."));
			// Not reached.
			return 10;
		}
		if (readBase < 2 || readBase > 36) {
			Lisp.error(new LispError("The value of *READ-BASE* is not of type '(INTEGER 2 36)."));
			// Not reached.
			return 10;
		}
		return readBase;
	}

	public static String invert(String s, BitSet flags) {
		// Section 23.1.2: "When the readtable case is :INVERT, then if all of
		// the unescaped letters in the extended token are of the same case,
		// those (unescaped) letters are converted to the opposite case."
		int limit = s.length();
		int LOWER = 1;
		int UPPER = 2;
		int state = 0;
		for (int i = 0; i < limit; i++) {
			// We only care about unescaped characters.
			if (flags != null && flags.get(i))
				continue;
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				if (state == LOWER)
					return s; // Mixed case.
				state = UPPER;
			}
			if (Character.isLowerCase(c)) {
				if (state == UPPER)
					return s; // Mixed case.
				state = LOWER;
			}
		}
		StringBuilder sb = new StringBuilder(limit);
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			if (flags != null && flags.get(i)) // Escaped.
				sb.append(c);
			else if (Character.isUpperCase(c))
				sb.append(Character.toLowerCase(c));
			else if (Character.isLowerCase(c))
				sb.append(Character.toUpperCase(c));
			else
				sb.append(c);
		}
		return sb.toString();
	}

	private static boolean isTokenDelimiter(char c, Readtable rt)

	{
		switch (c) {
		case '"':
		case '\'':
		case '(':
		case ')':
		case ',':
		case ';':
		case '`':
			return true;
		default:
			return rt.isWhitespace(c);
		}
	}

	private static SubLObject makeFloat(String token, int length)

	{
		if (length == 0)
			return null;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		boolean maybe = false;
		char marker = 0;
		char c = token.charAt(i);
		if (c == '-' || c == '+') {
			sb.append(c);
			++i;
		}
		boolean hasDigit = false;
		while (i < length) {
			c = token.charAt(i);
			if (c == '.' || c >= '0' && c <= '9') {
				if (c == '.')
					maybe = true;
				else
					hasDigit = true;
				sb.append(c);
				++i;
			} else
				break;
		}
		if (!hasDigit)
			return null;
		if (i < length) {
			c = token.charAt(i);
			if ("esfdlESFDL".indexOf(c) >= 0) {
				// Exponent marker.
				maybe = true;
				marker = CharacterFunctions.toUpperCase(c);
				if (marker == 'S')
					marker = 'F';
				else if (marker == 'L')
					marker = 'D';
				else if (marker == 'E') {
					SubLObject format = LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue();
					if (format == LispSymbols.SINGLE_FLOAT || format == LispSymbols.SHORT_FLOAT)
						marker = 'F';
					else
						marker = 'D';
				}
				sb.append('E');
				++i;
			}
		}
		if (!maybe)
			return null;
		// Append rest of token.
		sb.append(token.substring(i));
		try {
			if (marker == 0) {
				SubLObject format = LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue();
				if (format == LispSymbols.SINGLE_FLOAT || format == LispSymbols.SHORT_FLOAT)
					marker = 'F';
				else
					marker = 'D';
			}
			if (marker == 'D' || marker == 'L')
				return LispObjectFactory.makeDouble(marker, sb.toString());
			else
				return LispObjectFactory.makeSingle(Float.parseFloat(sb.toString()));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	protected SubLObject elementType;
	protected boolean isInputStream;
	protected boolean isOutputStream;
	protected boolean isCharacterStream;
	protected boolean isBinaryStream;

	private boolean pastEnd = false;

	private boolean interactive;
	private boolean open = true;
	// Character input.
	protected PushbackReader reader;
	protected int offset;
	protected int lineNumber;

	// Character output.
	private Writer writer;

	/**
	 * The number of characters on the current line of output
	 *
	 * Used to determine whether additional line feeds are required when calling
	 * FRESH-LINE
	 */
	protected int charPos;

	protected EolStyle eolStyle = Stream.platformEolStyle;

	protected char eolChar = this.eolStyle == EolStyle.CR ? '\r' : '\n';

	protected SubLObject externalFormat = Stream.keywordDefault;

	protected String encoding = null;

	protected char lastChar = 0;

	// Binary input.
	private InputStream in;

	// Binary output.
	private OutputStream out;

	protected Stream(SubLSymbol structureClass) {
		super(structureClass);
	}

	public Stream(SubLSymbol structureClass, InputStream stream) {
		this(structureClass);
		this.initAsBinaryInputStream(stream);
	}

	public Stream(SubLSymbol structureClass, InputStream inputStream, SubLObject elementType) {
		this(structureClass, inputStream, elementType, Stream.keywordDefault);
	}

	public Stream(SubLSymbol structureClass, InputStream inputStream, SubLObject elementType, boolean interactive) {
		this(structureClass, inputStream, elementType);
		this.setInteractive(interactive);
	}

	// Input stream constructors.
	public Stream(SubLSymbol structureClass, InputStream inputStream, SubLObject elementType, SubLObject format) {
		this(structureClass);
		this.elementType = elementType;
		this.setExternalFormat(format);

		if (elementType == LispSymbols.CHARACTER || elementType == LispSymbols.BASE_CHAR) {
			Reader reader = new DecodingReader(inputStream, 4096,
					this.encoding == null ? Charset.defaultCharset() : Charset.forName(this.encoding));
			this.initAsCharacterInputStream(reader);
		} else {
			this.isBinaryStream = true;
			InputStream stream = new BufferedInputStream(inputStream);
			this.initAsBinaryInputStream(stream);
		}
	}

	public Stream(SubLSymbol structureClass, OutputStream stream) {
		this(structureClass);
		this.initAsBinaryOutputStream(stream);
	}

	public Stream(SubLSymbol structureClass, OutputStream outputStream, SubLObject elementType) {
		this(structureClass, outputStream, elementType, Stream.keywordDefault);
	}

	public Stream(SubLSymbol structureClass, OutputStream outputStream, SubLObject elementType, boolean interactive) {
		this(structureClass, outputStream, elementType);
		this.setInteractive(interactive);
	}

	// Output stream constructors.
	public Stream(SubLSymbol structureClass, OutputStream outputStream, SubLObject elementType, SubLObject format) {
		this(structureClass);
		this.elementType = elementType;
		this.setExternalFormat(format);
		if (elementType == LispSymbols.CHARACTER || elementType == LispSymbols.BASE_CHAR) {
			Writer w = this.encoding == null ? new OutputStreamWriter(outputStream)
					: new OutputStreamWriter(outputStream, Charset.forName(this.encoding).newEncoder());
			this.initAsCharacterOutputStream(w);
		} else {
			OutputStream stream = new BufferedOutputStream(outputStream);
			this.initAsBinaryOutputStream(stream);
		}
	}

	public Stream(SubLSymbol structureClass, Reader r) {
		this(structureClass);
		this.initAsCharacterInputStream(r);
	}

	public Stream(SubLSymbol structureClass, Writer w) {
		this(structureClass);
		this.initAsCharacterOutputStream(w);
	}

	/**
	 * Returns a boolean indicating input readily available
	 *
	 * @return true if a character is available
	 */
	public boolean _charReady() throws IOException {
		if (this.reader == null)
			this.streamNotCharacterInputStream();
		return this.reader.ready();
	}

	/**
	 * Reads all input from the underlying stream, until _charReady() indicates
	 * no more input to be available
	 *
	 */
	public void _clearInput() {
		if (this.reader != null) {
			int c = 0;
			try {
				while (this._charReady() && c >= 0)
					c = this._readChar();
			} catch (IOException e) {
				Lisp.error(new StreamError(this, e));
			}
		} else if (this.in != null)
			try {
				int n = 0;
				while (this.in.available() > 0)
					n = this.in.read();

				if (n < 0)
					this.pastEnd = true;
			} catch (IOException e) {
				Lisp.error(new StreamError(this, e));
			}
	}

	/**
	 * Closes the stream and underlying streams
	 *
	 */
	public void _close() {
		try {
			if (this.reader != null)
				this.reader.close();
			if (this.in != null)
				this.in.close();
			if (this.writer != null)
				this.writer.close();
			if (this.out != null)
				this.out.close();
			this.setOpen(false);
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	/**
	 * Flushes any buffered output in the (underlying) stream
	 *
	 */
	public void _finishOutput() {
		try {
			if (this.writer != null)
				this.writer.flush();
			if (this.out != null)
				this.out.flush();
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	/**
	 * Returns a (non-negative) file position integer or a negative value if the
	 * position cannot be determined.
	 *
	 * @return non-negative value as a position spec
	 * @return negative value for 'unspecified'
	 */
	public long _getFilePosition() {
		return -1;
	}

	// Reads an 8-bit byte.
	/**
	 * Reads an 8-bit byte off the underlying stream
	 *
	 * @return
	 */
	public int _readByte() {
		try {
			int n = this.in.read();
			if (n < 0)
				this.pastEnd = true;

			return n; // Reads an 8-bit byte.
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
			// Not reached.
			return -1;
		}
	}

	/**
	 * Reads a character off an underlying stream
	 *
	 * @return a character, or -1 at end-of-file
	 */
	public int _readChar() throws IOException {
		if (this.reader == null)
			this.streamNotCharacterInputStream();

		int n = this.reader.read();

		if (n < 0) {
			this.pastEnd = true;
			return -1;
		}

		++this.offset;
		if (n == '\r' && this.eolStyle == EolStyle.CRLF) {
			n = this._readChar();
			if (n != '\n') {
				this._unreadChar(n);
				return '\r';
			} else
				return '\n';
		}

		if (n == this.eolChar) {
			++this.lineNumber;
			return '\n';
		}

		return n;
	}

	private BitSet _readToken(StringBuilder sb, Readtable rt)

	{
		BitSet flags = null;
		SubLObject readtableCase = rt.getReadtableCase();
		if (sb.length() > 0) {
			Debug.assertTrue(sb.length() == 1);
			char c = sb.charAt(0);
			byte syntaxType = rt.getSyntaxType(c);
			if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
				int n = -1;
				try {
					n = this._readChar();
				} catch (IOException e) {
					Lisp.error(new StreamError(this, e));
					return flags;
				}
				if (n < 0) {
					Lisp.error(new EndOfFile(this));
					// Not reached.
					return flags;
				}
				sb.setCharAt(0, (char) n); // ### BUG: Codepoint conversion
				flags = new BitSet(1);
				flags.set(0);
			} else if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE) {
				sb.setLength(0);
				sb.append(this.readMultipleEscape(rt));
				flags = new BitSet(sb.length());
				for (int i = sb.length(); i-- > 0;)
					flags.set(i);
			} else if (rt.isInvalid(c))
				rt.checkInvalid(c, this); // Signals a reader-error.
			else if (readtableCase == Keyword.UPCASE)
				sb.setCharAt(0, CharacterFunctions.toUpperCase(c));
			else if (readtableCase == Keyword.DOWNCASE)
				sb.setCharAt(0, CharacterFunctions.toLowerCase(c));
		}
		try {
			while (true) {
				int n = this._readChar();
				if (n < 0)
					break;
				char c = (char) n; // ### BUG: Codepoint conversion
				if (rt.isWhitespace(c)) {
					this._unreadChar(n);
					break;
				}
				byte syntaxType = rt.getSyntaxType(c);
				if (syntaxType == Readtable.SYNTAX_TYPE_TERMINATING_MACRO) {
					this._unreadChar(c);
					break;
				}
				rt.checkInvalid(c, this);
				if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
					n = this._readChar();
					if (n < 0)
						break;
					sb.append((char) n); // ### BUG: Codepoint conversion
					if (flags == null)
						flags = new BitSet(sb.length());
					flags.set(sb.length() - 1);
					continue;
				}
				if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE) {
					int begin = sb.length();
					sb.append(this.readMultipleEscape(rt));
					int end = sb.length();
					if (flags == null)
						flags = new BitSet(sb.length());
					for (int i = begin; i < end; i++)
						flags.set(i);
					continue;
				}
				if (readtableCase == Keyword.UPCASE)
					c = CharacterFunctions.toUpperCase(c);
				else if (readtableCase == Keyword.DOWNCASE)
					c = CharacterFunctions.toLowerCase(c);
				sb.append(c);
			}
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
			return flags;
		}

		return flags;
	}

	/**
	 * Sets the file position based on a position designator passed in arg
	 *
	 * @param arg
	 *            File position specifier as described in the CLHS
	 * @return true on success, false on failure
	 */
	public boolean _setFilePosition(SubLObject arg) {
		return false;
	}

	/**
	 * Puts a character back into the (underlying) stream
	 *
	 * @param n
	 */
	public void _unreadChar(int n) throws IOException {
		if (this.reader == null)
			this.streamNotCharacterInputStream();

		--this.offset;
		if (n == '\n') {
			n = this.eolChar;
			--this.lineNumber;
		}

		this.reader.unread(n);
		this.pastEnd = false;
	}

	// Writes an 8-bit byte.
	/**
	 * Writes an 8-bit byte off the underlying stream
	 *
	 * @param n
	 */
	public void _writeByte(int n) {
		try {
			this.out.write(n); // Writes an 8-bit byte.
		} catch (NullPointerException e) {
			// out is null
			this.streamNotBinaryOutputStream();
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	/**
	 * Writes a character into the underlying stream, updating charPos while
	 * doing so
	 *
	 * @param c
	 */
	public void _writeChar(char c) {
		try {
			if (c == '\n') {
				if (this.eolStyle == EolStyle.CRLF && this.lastChar != '\r')
					this.writer.write('\r');

				this.writer.write(this.eolChar);
				this.lastChar = this.eolChar;
				this.writer.flush();
				this.charPos = 0;
			} else {
				this.writer.write(c);
				this.lastChar = c;
				++this.charPos;
			}
		} catch (NullPointerException e) {
			// writer is null
			this.streamNotCharacterOutputStream();
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	/**
	 * Writes a series of characters in the underlying stream, updating charPos
	 * while doing so
	 *
	 * @param chars
	 * @param start
	 * @param end
	 */
	public void _writeChars(char[] chars, int start, int end)

	{
		try {
			if (this.eolStyle != EolStyle.RAW) {
				for (int i = start; i < end; i++)
					// ###FIXME: the number of writes can be greatly reduced by
					// writing the space between newlines as chunks.
					this._writeChar(chars[i]);
				return;
			}

			this.writer.write(chars, start, end - start);
			if (start < end)
				this.lastChar = chars[end - 1];

			int index = -1;
			for (int i = end; i-- > start;)
				if (chars[i] == '\n') {
					index = i;
					break;
				}
			if (index < 0)
				// No newline.
				this.charPos += end - start;
			else {
				this.charPos = end - (index + 1);
				this.writer.flush();
			}
		} catch (NullPointerException e) {
			if (this.writer == null)
				this.streamNotCharacterOutputStream();
			else
				throw e;
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	/**
	 * Writes a string to the underlying stream, appending a new line and
	 * updating charPos while doing so
	 *
	 * @param s
	 */
	public void _writeLine(String s) {
		try {
			this._writeString(s);
			this._writeChar('\n');
		} catch (NullPointerException e) {
			// writer is null
			this.streamNotCharacterOutputStream();
		}
	}

	/**
	 * Writes a string to the underlying stream, updating charPos while doing so
	 *
	 * @param s
	 */
	public void _writeString(String s) {
		try {
			this._writeChars(s.toCharArray(), 0, s.length());
		} catch (NullPointerException e) {
			if (this.writer == null)
				this.streamNotCharacterOutputStream();
			else
				throw e;
		}
	}

	public SubLObject classOf() {
		return BuiltInClass.SYSTEM_STREAM;
	}

	// clear-input &optional input-stream => nil
	public SubLObject clearInput() {
		this._clearInput();
		return Lisp.NIL;
	}

	// close stream &key abort => result
	// Must return true if stream was open, otherwise implementation-dependent.
	public SubLObject close(SubLObject abort) {
		this._close();
		return Lisp.T;
	}

	public SubLObject faslRead(boolean eofError, SubLObject eofValue, boolean recursive, LispThread thread)

	{
		try {
			SubLObject result = this.faslReadPreservingWhitespace(eofError, eofValue, recursive, thread);
			if (result != eofValue && !recursive)
				if (this._charReady()) {
					int n = this._readChar();
					if (n >= 0) {
						char c = (char) n; // ### BUG: Codepoint conversion
						Readtable rt = FaslReadtable.getInstance();
						if (!rt.isWhitespace(c))
							this._unreadChar(c);
					}
				}
			if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
				return Lisp.NIL;
			else
				return result;
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	public SubLObject faslReadArray(int rank) {
		LispThread thread = LispThread.currentThread();
		SubLObject obj = this.faslRead(true, Lisp.NIL, true, thread);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		switch (rank) {
		case -1:
			return Lisp.error(new ReaderError("No dimensions argument to #A.", this));
		case 0:
			return new ZeroRankArray(Lisp.T, obj, false);
		case 1: {
			if (obj.isList() || obj instanceof AbstractVector)
				return LispObjectFactory.makeSimpleVector(obj);
			return Lisp.error(new ReaderError(obj.writeToString() + " is not a sequence.", this));
		}
		default:
			return new SimpleArray_T(rank, obj);
		}
	}

	public SubLObject faslReadComplex() {
		LispThread thread = LispThread.currentThread();
		SubLObject obj = this.faslRead(true, Lisp.NIL, true, thread);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		if (obj instanceof SubLCons && obj.cl_length() == 2)
			return LispObjectFactory.makeComplex(obj.first(), obj.second());
		// Error.
		StringBuilder sb = new StringBuilder("Invalid complex number format");
		if (this instanceof FileStream) {
			Pathname p = ((FileStream) this).getPathname();
			if (p != null) {
				String namestring = p.getNamestring();
				if (namestring != null) {
					sb.append(" in #P\"");
					sb.append(namestring);
					sb.append('"');
				}
			}
			sb.append(" at offset ");
			sb.append(this._getFilePosition());
		}
		sb.append(": #C");
		sb.append(obj.writeToString());
		return Lisp.error(new ReaderError(sb.toString(), this));
	}

	public SubLObject faslReadPathname() {
		SubLObject obj = this.faslRead(true, Lisp.NIL, false, LispThread.currentThread());
		if (obj instanceof SubLString)
			return Pathname.parseNamestring((SubLString) obj);
		if (obj.isList())
			return Pathname.makePathname(obj);
		return Lisp.error(new TypeError("#p requires a string or list argument."));
	}

	private SubLObject faslReadPreservingWhitespace(boolean eofError, SubLObject eofValue, boolean recursive,
			LispThread thread) throws IOException {
		if (recursive) {
			Readtable rt = FaslReadtable.getInstance();
			while (true) {
				int n = this._readChar();
				if (n < 0)
					if (eofError)
						return Lisp.error(new EndOfFile(this));
					else
						return eofValue;
				char c = (char) n; // ### BUG: Codepoint conversion
				if (rt.isWhitespace(c))
					continue;
				SubLObject result = this.processChar(c, rt);
				if (result != null)
					return result;
			}
		} else {
			SpecialBindingsMark mark = thread.markSpecialBindings();
			thread.bindSpecial(Stream._SHARP_EQUAL_ALIST_, Lisp.NIL);
			try {
				return this.faslReadPreservingWhitespace(eofError, eofValue, true, thread);
			} finally {
				thread.resetSpecialBindings(mark);
			}
		}
	}

	public SubLObject faslReadRadix(int radix) {
		StringBuilder sb = new StringBuilder();
		LispThread thread = LispThread.currentThread();
		Readtable rt = FaslReadtable.getInstance();
		boolean escaped = this._readToken(sb, rt) != null;
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		if (escaped)
			return Lisp.error(new ReaderError("Illegal syntax for number.", this));
		String s = sb.toString();
		if (s.indexOf('/') >= 0)
			return this.makeRatio(s, radix);
		try {
			int n = Integer.parseInt(s, radix);
			return n >= 0 && n <= 255 ? Fixnum.constants[n] : LispObjectFactory.makeInteger(n);
		} catch (NumberFormatException e) {
		}
		// parseInt() failed.
		try {
			return LispObjectFactory.makeInteger(s, radix);
		} catch (NumberFormatException e) {
		}
		// Not a number.
		return Lisp.error(new LispError());
	}

	public SubLObject faslReadStructure() {
		LispThread thread = LispThread.currentThread();
		SubLObject obj = this.faslRead(true, Lisp.NIL, true, thread);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		if (obj.isList()) {
			SubLSymbol structure = Lisp.checkSymbol(obj.first());
			LispClass c = LispClass.findClass(structure);
			if (!(c instanceof StructureClass))
				return Lisp.error(
						new ReaderError(structure.getJavaSymbolName() + " is not a defined structure type.", this));
			SubLObject args = obj.rest();
			SubLSymbol DEFSTRUCT_DEFAULT_CONSTRUCTOR = Lisp.PACKAGE_SYS.intern("DEFSTRUCT-DEFAULT-CONSTRUCTOR");
			SubLObject constructor = DEFSTRUCT_DEFAULT_CONSTRUCTOR.getSymbolFunctionOrDie().execute(structure);
			int length = args.cl_length();
			if (length % 2 != 0)
				return Lisp.error(
						new ReaderError("Odd number of keyword arguments following #S: " + obj.writeToString(), this));
			SubLObject[] array = LispObjectFactory.makeLispObjectArray(length);
			SubLObject rest = args;
			for (int i = 0; i < length; i += 2) {
				SubLObject key = rest.first();
				if (key instanceof SubLSymbol && ((SubLSymbol) key).isKeyword())
					array[i] = key;
				else
					array[i] = Lisp.PACKAGE_KEYWORD.intern(Lisp.javaString(key));
				array[i + 1] = rest.second();
				rest = rest.cddr();
			}
			return Lisp.funcall(constructor.getSymbolFunctionOrDie(), array, thread);
		}
		return Lisp.error(new ReaderError("Non-list following #S: " + obj.writeToString(), this));
	}

	public SubLObject fileLength() {
		return Lisp.type_error(this, LispSymbols.FILE_STREAM);
	}

	public SubLObject fileStringLength(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			if (Utilities.isPlatformWindows)
				if (((LispCharacter) arg).value == '\n')
					return Fixnum.TWO;
			return Fixnum.ONE;
		}
		if (arg instanceof SubLString) {
			if (Utilities.isPlatformWindows) {
				int fileStringLength = 0;
				char[] chars = ((SubLString) arg).getStringChars();
				for (int i = chars.length; i-- > 0;)
					if (chars[i] == '\n')
						fileStringLength += 2;
					else
						++fileStringLength;
				return Lisp.number(fileStringLength);

			}
			return Lisp.number(arg.cl_length());
		}
		return Lisp.error(new TypeError(arg.writeToString() + " is neither a string nor a character."));
	}

	public SubLObject finishOutput() {
		this._finishOutput();
		return Lisp.NIL;
	}

	private char flushWhitespace(Readtable rt) {
		try {
			while (true) {
				int n = this._readChar();
				if (n < 0) {
					Lisp.error(new EndOfFile(this));
					// Not reached.
					return 0;
				}
				char c = (char) n; // ### BUG: Codepoint conversion
				if (!rt.isWhitespace(c))
					return c;
			}
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
			return 0;
		}
	}

	public SubLObject freshLine() {
		if (this.charPos == 0)
			return Lisp.NIL;
		this._writeChar('\n');
		return Lisp.T;
	}

	// Character output.
	public int getCharPos() {
		return this.charPos;
	}

	public SubLObject getElementType() {
		return this.elementType;
	}

	public String getEncoding() {
		return this.encoding;
	}

	public SubLObject getExternalFormat() {
		return this.externalFormat;
	}

	public SubLObject getFilePosition() {
		long pos = this._getFilePosition();
		return pos >= 0 ? Lisp.number(pos) : Lisp.NIL;
	}

	// Character input.
	public int getLineNumber() {
		return this.lineNumber;
	}

	// Character input.
	public int getOffset() {
		return this.offset;
	}

	public InputStream getWrappedInputStream() {
		return this.in;
	}

	public OutputStream getWrappedOutputStream() {
		return this.out;
	}

	public PushbackReader getWrappedReader() {
		return this.reader;
	}

	public Writer getWrappedWriter() {
		return this.writer;
	}

	protected void initAsBinaryInputStream(InputStream in) {
		this.in = in;
		this.isInputStream = true;
		this.isBinaryStream = true;
	}

	protected void initAsBinaryOutputStream(OutputStream out) {
		this.out = out;
		this.isOutputStream = true;
		this.isBinaryStream = true;
	}

	protected void initAsCharacterInputStream(Reader reader) {
		if (!(reader instanceof PushbackReader))
			this.reader = new PushbackReader(reader, 5);
		else
			this.reader = (PushbackReader) reader;

		this.isInputStream = true;
		this.isCharacterStream = true;
	}

	protected void initAsCharacterOutputStream(Writer writer) {
		this.writer = writer;
		this.isOutputStream = true;
		this.isCharacterStream = true;
	}

	public boolean isBinaryInputStream() {
		return this.isBinaryStream && this.isInputStream;
	}

	public boolean isBinaryOutputStream() {
		return this.isBinaryStream && this.isOutputStream;
	}

	public boolean isCharacterInputStream() {
		return this.isCharacterStream && this.isInputStream;
	}

	public boolean isCharacterOutputStream() {
		return this.isCharacterStream && this.isOutputStream;
	}

	public boolean isInputStream() {
		return this.isInputStream;
	}

	public boolean isInteractive() {
		return this.interactive;
	}

	public boolean isOpen() {
		return this.open;
	}

	public boolean isOutputStream() {
		return this.isOutputStream;
	}

	public SubLObject listen() {
		if (this.pastEnd)
			return Lisp.NIL;
		try {
			if (!this._charReady())
				return Lisp.NIL;

			int n = this._readChar();
			if (n < 0)
				return Lisp.NIL;

			this._unreadChar(n);

			return Lisp.T;
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	private SubLObject makeNumber(String token, int length, int radix)

	{
		if (length == 0)
			return null;
		if (token.indexOf('/') >= 0)
			return this.makeRatio(token, radix);
		if (token.charAt(length - 1) == '.') {
			radix = 10;
			token = token.substring(0, --length);
		}
		boolean numeric = true;
		if (radix == 10)
			for (int i = length; i-- > 0;) {
				char c = token.charAt(i);
				if (c < '0' || c > '9')
					if (i > 0 || c != '-' && c != '+') {
						numeric = false;
						break;
					}
			}
		else
			for (int i = length; i-- > 0;) {
				char c = token.charAt(i);
				if (Character.digit(c, radix) < 0)
					if (i > 0 || c != '-' && c != '+') {
						numeric = false;
						break;
					}
			}
		if (!numeric) // Can't be an integer.
			return Stream.makeFloat(token, length);
		if (token.charAt(0) == '+')
			token = token.substring(1);
		try {
			int n = Integer.parseInt(token, radix);
			return n >= 0 && n <= 255 ? Fixnum.constants[n] : LispObjectFactory.makeInteger(n);
		} catch (NumberFormatException e) {
		}
		// parseInt() failed.
		try {
			return LispObjectFactory.makeInteger(token, radix);
		} catch (NumberFormatException e) {
		}
		// Not a number.
		return null;
	}

	private SubLObject makeRatio(String token, int radix)

	{
		int index = token.indexOf('/');
		if (index < 0)
			return null;
		try {
			BigInteger numerator = new BigInteger(token.substring(0, index), radix);
			BigInteger denominator = new BigInteger(token.substring(index + 1), radix);
			// Check the denominator here, before calling number(), so we can
			// signal a READER-ERROR, as required by ANSI, instead of DIVISION-
			// BY-ZERO.
			if (denominator.signum() == 0)
				Lisp.error(new ReaderError("Division by zero.", this));
			return Lisp.number(numerator, denominator);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	// PRIN1 produces output suitable for input to READ.
	// Binds *PRINT-ESCAPE* to true.
	public void prin1(SubLObject obj) {
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.T);
		try {
			this._writeString(obj.writeToString());
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	public void print(char c) {
		this._writeChar(c);
	}

	public void printStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		try {
			this.writer.write(sw.toString());
			this.writer.write('\n');
			this.lastChar = '\n';
			this.writer.flush();
			this.charPos = 0;
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	private SubLObject processChar(char c, Readtable rt)

	{
		SubLObject handler = rt.getReaderMacroFunction(c);
		if (handler instanceof ReaderMacroFunction)
			return ((ReaderMacroFunction) handler).execute(this, c);
		if (handler != null && handler != Lisp.NIL)
			return handler.execute(this, LispCharacter.makeChar(c));
		return this.readToken(c, rt);
	}

	public SubLObject read(boolean eofError, SubLObject eofValue, boolean recursive, LispThread thread)

	{
		SubLObject result = this.readPreservingWhitespace(eofError, eofValue, recursive, thread);
		if (result != eofValue && !recursive)
			try {
				if (this._charReady()) {
					int n = this._readChar();
					if (n >= 0) {
						char c = (char) n; // ### BUG: Codepoint conversion
						Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
						if (!rt.isWhitespace(c))
							this._unreadChar(c);
					}
				}
			} catch (IOException e) {
				return Lisp.error(new StreamError(this, e));
			}
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		else
			return result;
	}

	public SubLObject readArray(int rank) {
		LispThread thread = LispThread.currentThread();
		SubLObject obj = this.read(true, Lisp.NIL, true, thread);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		switch (rank) {
		case -1:
			return Lisp.error(new ReaderError("No dimensions argument to #A.", this));
		case 0:
			return new ZeroRankArray(Lisp.T, obj, false);
		case 1: {
			if (obj.isList() || obj instanceof AbstractVector)
				return LispObjectFactory.makeSimpleVector(obj);
			return Lisp.error(new ReaderError(obj.writeToString() + " is not a sequence.", this));
		}
		default:
			return new SimpleArray_T(rank, obj);
		}
	}

	// read-byte stream &optional eof-error-p eof-value => byte
	// Reads an 8-bit byte.
	public SubLObject readByte(boolean eofError, SubLObject eofValue)

	{
		int n = this._readByte();
		if (n < 0)
			if (eofError)
				return Lisp.error(new EndOfFile(this));
			else
				return eofValue;
		return Fixnum.constants[n];
	}

	// read-char &optional stream eof-error-p eof-value recursive-p => char
	// recursive-p is ignored
	public SubLObject readChar() {
		try {
			int n = this._readChar();
			if (n < 0)
				return Lisp.error(new EndOfFile(this));
			return LispCharacter.makeChar((char) n); // ### BUG: Codepoint
														// conversion
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}

	}

	public SubLObject readChar(boolean eofError, SubLObject eofValue)

	{
		try {
			int n = this._readChar();
			if (n < 0)
				if (eofError)
					return Lisp.error(new EndOfFile(this));
				else
					return eofValue;
			return LispCharacter.makeChar((char) n); // ### BUG: Codepoint
														// conversion
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	public SubLObject readCharacterLiteral(Readtable rt, LispThread thread)

	{
		try {
			int n = this._readChar();
			if (n < 0)
				return Lisp.error(new EndOfFile(this));
			char c = (char) n; // ### BUG: Codepoint conversion
			StringBuilder sb = new StringBuilder(String.valueOf(c));
			while (true) {
				n = this._readChar();
				if (n < 0)
					break;
				c = (char) n; // ### BUG: Codepoint conversion
				if (rt.isWhitespace(c))
					break;
				if (c == '(' || c == ')') {
					this._unreadChar(c);
					break;
				}
				sb.append(c);
			}
			if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
				return Lisp.NIL;
			if (sb.length() == 1)
				return LispCharacter.makeChar(sb.charAt(0));
			String token = sb.toString();
			n = CharacterFunctions.nameToChar(token);
			if (n >= 0)
				return LispCharacter.makeChar((char) n); // ### BUG: Codepoint
															// conversion
			return Lisp.error(new LispError("Unrecognized character name: \"" + token + '"'));
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	// read-char-no-hang &optional stream eof-error-p eof-value recursive-p =>
	// char
	// recursive-p is ignored
	public SubLObject readCharNoHang(boolean eofError, SubLObject eofValue)

	{
		try {
			return this._charReady() ? this.readChar(eofError, eofValue) : Lisp.NIL;
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	public SubLObject readComplex() {
		LispThread thread = LispThread.currentThread();
		SubLObject obj = this.read(true, Lisp.NIL, true, thread);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		if (obj instanceof SubLCons && obj.cl_length() == 2)
			return LispObjectFactory.makeComplex(obj.first(), obj.second());
		// Error.
		StringBuilder sb = new StringBuilder("Invalid complex number format");
		if (this instanceof FileStream) {
			Pathname p = ((FileStream) this).getPathname();
			if (p != null) {
				String namestring = p.getNamestring();
				if (namestring != null) {
					sb.append(" in #P\"");
					sb.append(namestring);
					sb.append('"');
				}
			}
			sb.append(" at offset ");
			sb.append(this._getFilePosition());
		}
		sb.append(": #C");
		sb.append(obj.writeToString());
		return Lisp.error(new ReaderError(sb.toString(), this));
	}

	public SubLObject readDelimitedList(char delimiter)

	{
		LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.NIL;
		while (true) {
			Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
			char c = this.flushWhitespace(rt);
			if (c == delimiter)
				break;
			SubLObject obj = this.processChar(c, rt);
			if (obj != null)
				result = LispObjectFactory.makeCons(obj, result);
		}
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		else
			return result.nreverse();
	}

	public SubLObject readDispatchChar(char dispChar, boolean useFaslReadtable)

	{
		int numArg = -1;
		char c = 0;
		try {
			while (true) {
				int n = this._readChar();
				if (n < 0)
					return Lisp.error(new EndOfFile(this));
				c = (char) n; // ### BUG: Codepoint conversion
				if (c < '0' || c > '9')
					break;
				if (numArg < 0)
					numArg = 0;
				numArg = numArg * 10 + c - '0';
			}
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
		LispThread thread = LispThread.currentThread();
		Readtable rt;
		if (useFaslReadtable)
			rt = FaslReadtable.getInstance();
		else
			rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
		SubLObject fun = rt.getDispatchMacroCharacter(dispChar, c);
		if (fun instanceof DispatchMacroFunction)
			return ((DispatchMacroFunction) fun).execute(this, c, numArg);
		if (fun != Lisp.NIL) {
			SubLObject result = thread.execute(fun, this, LispCharacter.makeChar(c),
					numArg < 0 ? Lisp.NIL : LispObjectFactory.makeInteger(numArg));
			SubLObject[] values = thread._values;
			if (values != null && values.length == 0)
				result = null;
			thread._values = null;
			return result;
		}
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return null;
		return Lisp.error(new ReaderError("No dispatch function defined for #\\" + c, this));
	}

	// read-line &optional stream eof-error-p eof-value recursive-p
	// => line, missing-newline-p
	// recursive-p is ignored
	public SubLObject readLine(boolean eofError, SubLObject eofValue)

	{
		LispThread thread = LispThread.currentThread();
		StringBuilder sb = new StringBuilder();
		try {
			while (true) {
				int n = this._readChar();
				if (n < 0) {
					if (sb.length() == 0) {
						if (eofError)
							return Lisp.error(new EndOfFile(this));
						return thread.setValues(eofValue, Lisp.T);
					}
					return thread.setValues(LispObjectFactory.makeString(sb), Lisp.T);
				}
				if (n == '\n')
					return thread.setValues(LispObjectFactory.makeString(sb), Lisp.NIL);
				else
					sb.append((char) n); // ### BUG: Codepoint conversion
			}
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	public SubLObject readList(boolean requireProperList, boolean useFaslReadtable)

	{
		LispThread thread = LispThread.currentThread();
		SubLCons first = null;
		SubLCons last = null;
		Readtable rt = null;
		if (useFaslReadtable)
			rt = FaslReadtable.getInstance();
		try {
			while (true) {
				if (!useFaslReadtable)
					rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
				char c = this.flushWhitespace(rt);
				if (c == ')')
					return first == null ? Lisp.NIL : first;
				if (c == '.') {
					int n = this._readChar();
					if (n < 0)
						return Lisp.error(new EndOfFile(this));
					char nextChar = (char) n; // ### BUG: Codepoint conversion
					if (Stream.isTokenDelimiter(nextChar, rt)) {
						if (last == null)
							if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
								return Lisp.NIL;
							else
								return Lisp.error(new ReaderError("Nothing appears before . in list.", this));
						this._unreadChar(nextChar);
						SubLObject obj = this.read(true, Lisp.NIL, true, thread);
						if (requireProperList)
							if (!obj.isList())
								Lisp.error(new ReaderError("The value " + obj.writeToString() + " is not of type "
										+ LispSymbols.LIST.writeToString() + ".", this));
						last.setCdr(obj);
						continue;
					}
					// normal token beginning with '.'
					this._unreadChar(nextChar);
				}
				SubLObject obj = this.processChar(c, rt);
				if (obj == null)
					// A comment.
					continue;
				if (first == null) {
					first = LispObjectFactory.makeCons(obj);
					last = first;
				} else {
					SubLCons newCons = LispObjectFactory.makeCons(obj);
					last.setCdr(newCons);
					last = newCons;
				}
			}
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
			return null;
		}
	}

	private String readMultipleEscape(Readtable rt) {
		StringBuilder sb = new StringBuilder();
		try {
			while (true) {
				int n = this._readChar();
				if (n < 0) {
					Lisp.error(new EndOfFile(this));
					// Not reached.
					return null;
				}
				char c = (char) n; // ### BUG: Codepoint conversion
				byte syntaxType = rt.getSyntaxType(c);
				if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
					n = this._readChar();
					if (n < 0) {
						Lisp.error(new EndOfFile(this));
						// Not reached.
						return null;
					}
					sb.append((char) n); // ### BUG: Codepoint conversion
					continue;
				}
				if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE)
					break;
				sb.append(c);
			}
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
		return sb.toString();
	}

	public SubLObject readPathname() {
		SubLObject obj = this.read(true, Lisp.NIL, false, LispThread.currentThread());
		if (obj instanceof SubLString)
			return Pathname.parseNamestring((SubLString) obj);
		if (obj.isList())
			return Pathname.makePathname(obj);
		return Lisp.error(new TypeError("#p requires a string or list argument."));
	}

	public SubLObject readPreservingWhitespace(boolean eofError, SubLObject eofValue, boolean recursive,
			LispThread thread)

	{
		if (recursive) {
			Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
			while (true) {
				int n = -1;
				try {
					n = this._readChar();
				} catch (IOException e) {
					Debug.trace(e);
					Lisp.error(new StreamError(this, e));
				}
				if (n < 0)
					if (eofError)
						return Lisp.error(new EndOfFile(this));
					else
						return eofValue;
				char c = (char) n; // ### BUG: Codepoint conversion
				if (rt.isWhitespace(c))
					continue;
				SubLObject result = this.processChar(c, rt);
				if (result != null)
					return result;
			}
		} else {
			SpecialBindingsMark mark = thread.markSpecialBindings();
			thread.bindSpecial(Stream._SHARP_EQUAL_ALIST_, Lisp.NIL);
			try {
				return this.readPreservingWhitespace(eofError, eofValue, true, thread);
			} finally {
				thread.resetSpecialBindings(mark);
			}
		}
	}

	public SubLObject readRadix(int radix) {
		StringBuilder sb = new StringBuilder();
		LispThread thread = LispThread.currentThread();
		Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
		boolean escaped = this._readToken(sb, rt) != null;
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		if (escaped)
			return Lisp.error(new ReaderError("Illegal syntax for number.", this));
		String s = sb.toString();
		if (s.indexOf('/') >= 0)
			return this.makeRatio(s, radix);
		// Integer.parseInt() below handles a prefixed '-' character correctly,
		// but
		// does not accept a prefixed '+' character, so we skip over it here
		if (s.charAt(0) == '+')
			s = s.substring(1);
		try {
			int n = Integer.parseInt(s, radix);
			return n >= 0 && n <= 255 ? Fixnum.constants[n] : LispObjectFactory.makeInteger(n);
		} catch (NumberFormatException e) {
		}
		// parseInt() failed.
		try {
			return LispObjectFactory.makeInteger(s, radix);
		} catch (NumberFormatException e) {
		}
		// Not a number.
		return Lisp.error(new LispError());
	}

	public SubLObject readStructure() {
		LispThread thread = LispThread.currentThread();
		SubLObject obj = this.read(true, Lisp.NIL, true, thread);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		if (obj.isList()) {
			SubLSymbol structure = Lisp.checkSymbol(obj.first());
			LispClass c = LispClass.findClass(structure);
			if (!(c instanceof StructureClass))
				return Lisp.error(
						new ReaderError(structure.getJavaSymbolName() + " is not a defined structure type.", this));
			SubLObject args = obj.rest();
			SubLSymbol DEFSTRUCT_DEFAULT_CONSTRUCTOR = Lisp.PACKAGE_SYS.intern("DEFSTRUCT-DEFAULT-CONSTRUCTOR");
			SubLObject constructor = DEFSTRUCT_DEFAULT_CONSTRUCTOR.getSymbolFunctionOrDie().execute(structure);
			int length = args.cl_length();
			if (length % 2 != 0)
				return Lisp.error(
						new ReaderError("Odd number of keyword arguments following #S: " + obj.writeToString(), this));
			SubLObject[] array = LispObjectFactory.makeLispObjectArray(length);
			SubLObject rest = args;
			for (int i = 0; i < length; i += 2) {
				SubLObject key = rest.first();
				if (key instanceof SubLSymbol && ((SubLSymbol) key).isKeyword())
					array[i] = key;
				else
					array[i] = Lisp.PACKAGE_KEYWORD.intern(Lisp.javaString(key));
				array[i + 1] = rest.second();
				rest = rest.cddr();
			}
			return Lisp.funcall(constructor.getSymbolFunctionOrDie(), array, thread);
		}
		return Lisp.error(new ReaderError("Non-list following #S: " + obj.writeToString(), this));
	}

	public SubLObject readSymbol() {
		Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(LispThread.currentThread());
		StringBuilder sb = new StringBuilder();
		this._readToken(sb, rt);
		return LispObjectFactory.makeSymbol(sb.toString());
	}

	public SubLObject readSymbol(Readtable rt) {
		StringBuilder sb = new StringBuilder();
		this._readToken(sb, rt);
		return LispObjectFactory.makeSymbol(sb.toString());
	}

	private SubLObject readToken(char c, Readtable rt)

	{
		StringBuilder sb = new StringBuilder(String.valueOf(c));
		LispThread thread = LispThread.currentThread();
		BitSet flags = this._readToken(sb, rt);
		if (LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL)
			return Lisp.NIL;
		SubLObject readtableCase = rt.getReadtableCase();
		String token;
		if (readtableCase == Keyword.INVERT)
			token = Stream.invert(sb.toString(), flags);
		else
			token = sb.toString();
		int length = token.length();
		if (length > 0) {
			char firstChar = token.charAt(0);
			if (flags == null) {
				if (firstChar == '.') {
					// Section 2.3.3: "If a token consists solely of dots (with
					// no escape characters), then an error of type READER-
					// ERROR is signaled, except in one circumstance: if the
					// token is a single dot and appears in a situation where
					// dotted pair notation permits a dot, then it is accepted
					// as part of such syntax and no error is signaled."
					boolean ok = false;
					for (int i = length; i-- > 1;)
						if (token.charAt(i) != '.') {
							ok = true;
							break;
						}
					if (!ok) {
						String message;
						if (length > 1)
							message = "Too many dots.";
						else
							message = "Dot context error.";
						return Lisp.error(new ReaderError(message, this));
					}
				}
				int radix = Stream.getReadBase(thread);
				if ("+-.0123456789".indexOf(firstChar) >= 0) {
					SubLObject number = this.makeNumber(token, length, radix);
					if (number != null)
						return number;
				} else if (Character.digit(firstChar, radix) >= 0) {
					SubLObject number = this.makeNumber(token, length, radix);
					if (number != null)
						return number;
				}
			}
			if (firstChar == ':')
				if (flags == null || !flags.get(0))
					return Lisp.PACKAGE_KEYWORD.intern(token.substring(1));
			int index = Stream.findUnescapedDoubleColon(token, flags);
			if (index > 0) {
				String packageName = token.substring(0, index);
				String symbolName = token.substring(index + 2);
				SubLPackage pkg = LispPackages.findPackage(packageName);
				if (pkg == null)
					return Lisp.error(new LispError("Package \"" + packageName + "\" not found."));
				return pkg.intern(symbolName);
			}
			index = Stream.findUnescapedSingleColon(token, flags);
			if (index > 0) {
				String packageName = token.substring(0, index);
				SubLPackage pkg = LispPackages.findPackage(packageName);
				if (pkg == null)
					return Lisp.error(new PackageError("Package \"" + packageName + "\" not found."));
				String symbolName = token.substring(index + 1);
				SubLString s = LispObjectFactory.makeString(symbolName);
				SubLSymbol symbol = pkg.findExternalSymbol(s);
				if (symbol != null)
					return symbol;
				// Error!
				if (pkg.findInternalSymbol(s) != null)
					return Lisp.error(new ReaderError(
							"The symbol \"" + symbolName + "\" is not external in package " + packageName + '.', this));
				else
					return Lisp.error(new ReaderError(
							"The symbol \"" + symbolName + "\" was not found in package " + packageName + '.', this));
			}
		}
		// Intern token in current package.
		return ((SubLPackage) LispSymbols._PACKAGE_.symbolValue(thread)).intern(LispObjectFactory.makeString(token));
	}

	// Character output.
	public void setCharPos(int n) {
		this.charPos = n;
	}

	public void setExternalFormat(SubLObject format) {
		// make sure we encode any remaining buffers with the current format
		this.finishOutput();

		if (format == Stream.keywordDefault) {
			this.encoding = null;
			this.eolStyle = Stream.platformEolStyle;
			this.eolChar = this.eolStyle == EolStyle.CR ? '\r' : '\n';
			this.externalFormat = format;
			return;
		}

		SubLObject enc;
		boolean encIsCp = false;

		if (format instanceof SubLCons) {
			// meaning a non-empty list
			enc = format.first();
			if (enc == Stream.keywordCodePage) {
				encIsCp = true;

				enc = Lisp.getf(format.rest(), Stream.keywordID, null);
			}

			SubLObject eol = Lisp.getf(format.rest(), Stream.keywordEolStyle, Stream.keywordRAW);
			if (eol == Stream.keywordCR)
				this.eolStyle = EolStyle.CR;
			else if (eol == Stream.keywordLF)
				this.eolStyle = EolStyle.LF;
			else if (eol == Stream.keywordCRLF)
				this.eolStyle = EolStyle.CRLF;
			else if (eol != Stream.keywordRAW)
				; // ###FIXME: raise an error

		} else
			enc = format;

		if (enc.isNumber())
			this.encoding = enc.toString();
		else if (enc instanceof SubLString)
			this.encoding = enc.getString();
		else if (enc == Stream.keywordDefault)
			// This allows the user to use the encoding determined by
			// Java to be the default for the current environment
			// while still being able to set other stream options
			// (e.g. :EOL-STYLE)
			this.encoding = null;
		else if (enc instanceof SubLSymbol)
			this.encoding = ((SubLSymbol) enc).getJavaSymbolName();
		else
			; // ###FIXME: raise an error!

		if (encIsCp)
			this.encoding = "Cp" + this.encoding;

		this.eolChar = this.eolStyle == EolStyle.CR ? '\r' : '\n';
		this.externalFormat = format;

		if (this.reader != null && this.reader instanceof DecodingReader)
			((DecodingReader) this.reader).setCharset(Charset.forName(this.encoding));
	}

	public SubLObject setFilePosition(SubLObject arg) {
		return this._setFilePosition(arg) ? Lisp.T : Lisp.NIL;
	}

	public void setInteractive(boolean b) {
		this.interactive = b;
	}

	public void setOpen(boolean b) {
		this.open = b;
	}

	protected void setWriter(Writer writer) {
		this.writer = writer;
	}

	public void skipBalancedComment() {
		try {
			while (true) {
				int n = this._readChar();
				if (n < 0)
					return;
				if (n == '|') {
					n = this._readChar();
					if (n == '#')
						return;
					else
						this._unreadChar(n);
				} else if (n == '#') {
					n = this._readChar();
					if (n == '|')
						this.skipBalancedComment(); // Nested comment. Recurse!
					else
						this._unreadChar(n);
				}
			}
		} catch (IOException e) {
			Lisp.error(new StreamError(this, e));
		}
	}

	protected SubLObject streamNotBinaryOutputStream() {
		return Lisp.error(new StreamError(this, this.writeToString() + " is not a binary output stream."));
	}

	protected SubLObject streamNotCharacterInputStream() {
		return Lisp.error(new StreamError(this, this.writeToString() + " is not a character input stream."));
	}

	protected SubLObject streamNotCharacterOutputStream() {
		return Lisp.error(new StreamError(this, this.writeToString() + " is not a character output stream."));
	}

	protected SubLObject streamNotInputStream() {
		return Lisp.error(new StreamError(this, this.writeToString() + " is not an input stream."));
	}

	protected SubLObject streamNotOutputStream() {
		return Lisp.error(new StreamError(this, this.writeToString() + " is not an output stream."));
	}

	public SubLObject terpri() {
		this._writeChar('\n');
		return Lisp.NIL;
	}

	public String toString() {
		return this.unreadableString("STREAM");
	}

	public SubLObject typeOf() {
		return LispSymbols.SYSTEM_STREAM;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.SYSTEM_STREAM)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.STREAM)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.STREAM)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	// unread-char character &optional input-stream => nil
	public SubLObject unreadChar(LispCharacter c) {
		try {
			this._unreadChar(c.value);
			return Lisp.NIL;
		} catch (IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

}
