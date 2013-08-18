package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class StreamFunctions {

	// ### make-string-input-stream
	// make-string-input-stream string &optional start end => string-stream
	private static final Primitive MAKE_STRING_INPUT_STREAM = new JavaPrimitive("make-string-input-stream",
			"string &optional start end") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return new StringInputStream(arg.getString());
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			String s = first.getString();
			int start = second.intValue();
			return new StringInputStream(s, start);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			String s = first.getString();
			int start = second.intValue();
			if (third == NIL)
				return new StringInputStream(s, start);
			int end = third.intValue();
			return new StringInputStream(s, start, end);
		}
	};

	// ### string-input-stream-current
	private static final Primitive STRING_INPUT_STREAM_CURRENT = new JavaPrimitive("string-input-stream-current",
			PACKAGE_EXT, true, "stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StringInputStream)
				return LispObjectFactory.makeInteger(((StringInputStream) arg).getOffset());
			return error(new TypeError(String.valueOf(arg) + " is not a string input stream."));
		}
	};

	// ### %make-string-output-stream
	// %make-string-output-stream element-type => string-stream
	private static final Primitive MAKE_STRING_OUTPUT_STREAM = new JavaPrimitive("%make-string-output-stream",
			PACKAGE_SYS, false, "element-type") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return new StringOutputStream(arg);
		}
	};

	// ### get-output-stream-string
	// get-output-stream-string string-output-stream => string
	private static final Primitive GET_OUTPUT_STREAM_STRING = new JavaPrimitive("get-output-stream-string",
			"string-output-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StringOutputStream)
				return ((StringOutputStream) arg).getOutputString();
			return type_error(this, LispSymbols.STRING_OUTPUT_STREAM);
		}
	};

	// ### %stream-write-char character output-stream => character
	// OUTPUT-STREAM must be a real stream, not an output stream designator!
	private static final Primitive _WRITE_CHAR = new JavaPrimitive("%stream-write-char", PACKAGE_SYS, true,
			"character output-stream") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStream(second)._writeChar(first.charValue());
			return first;
		}
	};

	// ### %write-char character output-stream => character
	private static final Primitive _STREAM_WRITE_CHAR = new JavaPrimitive("%write-char", PACKAGE_SYS, false,
			"character output-stream") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final char c = first.charValue();
			if (second == T)
				second = LispSymbols.TERMINAL_IO.symbolValue();
			else if (second == NIL)
				second = LispSymbols.STANDARD_OUTPUT.symbolValue();
			final LispStream stream = checkStream(second);
			stream._writeChar(c);
			return first;
		}
	};

	// ### %write-string string output-stream start end => string
	private static final Primitive _WRITE_STRING = new JavaPrimitive("%write-string", PACKAGE_SYS, false,
			"string output-stream start end") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			final SubLString s = checkString(first);
			char[] chars = s.charsOld();
			final LispStream out = outSynonymOf(second);
			final int start = third.intValue();
			final int end;
			if (fourth == NIL)
				end = chars.length;
			else {
				end = fourth.intValue();
			}
			checkBounds(start, end, chars.length);
			out._writeChars(chars, start, end);
			return first;
		}
	};

	// ### %finish-output output-stream => nil
	private static final Primitive _FINISH_OUTPUT = new JavaPrimitive("%finish-output", PACKAGE_SYS, false,
			"output-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return finishOutput(arg);
		}
	};

	// ### %force-output output-stream => nil
	private static final Primitive _FORCE_OUTPUT = new JavaPrimitive("%force-output", PACKAGE_SYS, false, "output-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return finishOutput(arg);
		}
	};

	static final SubLObject finishOutput(SubLObject arg)

	{
		final SubLObject out;
		if (arg == T)
			out = LispSymbols.TERMINAL_IO.symbolValue();
		else if (arg == NIL)
			out = LispSymbols.STANDARD_OUTPUT.symbolValue();
		else
			out = arg;
		return checkStream(out).finishOutput();
	}

	// ### clear-input &optional input-stream => nil
	private static final Primitive CLEAR_INPUT = new JavaPrimitive(LispSymbols.CLEAR_INPUT, "&optional input-stream") {
		@Override
		public SubLObject execute(SubLObject[] args) {
			if (args.length > 1)
				return error(new WrongNumberOfArgumentsException(this));
			final LispStream in;
			if (args.length == 0)
				in = checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue());
			else
				in = inSynonymOf(args[0]);
			in.clearInput();
			return NIL;
		}
	};

	// ### %clear-output output-stream => nil
	// "If any of these operations does not make sense for output-stream, then
	// it does nothing."
	private static final Primitive _CLEAR_OUTPUT = new JavaPrimitive("%clear-output", PACKAGE_SYS, false, "output-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg == T) // *TERMINAL-IO*
				return NIL;
			if (arg == NIL) // *STANDARD-OUTPUT*
				return NIL;
			if (arg instanceof LispStream)
				return NIL;
			return type_error(arg, LispSymbols.STREAM);
		}
	};

	//### peek-char
	private static final Primitive PEEK_CHAR = new peek_char();

	public final static class peek_char extends JavaPrimitive {
		peek_char() {
			super("peek-char", "&optional peek-type input-stream eof-error-p eof-value recursive-p");
		}

		@Override
		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length > 5)
				error(new WrongNumberOfArgumentsException(this));
			SubLObject peekType = length > 0 ? args[0] : NIL;
			LispStream stream = length > 1 ? inSynonymOf(args[1]) : getStandardInput();
			boolean eofError = length > 2 ? (args[2] != NIL) : true;
			SubLObject eofValue = length > 3 ? args[3] : NIL;
			// recursive-p is ignored
			// boolean recursive = length > 4 ? (args[4] != NIL) : false;
			if (peekType == NIL) {
				// "If PEEK-TYPE is not supplied or NIL, PEEK-CHAR returns the next
				// character to be read from INPUT-STREAM, without actually
				// removing it from INPUT-STREAM."
				final LispStream in;
				if (stream instanceof EchoStream)
					// "When INPUT-STREAM is an echo stream, characters that are
					// only peeked at are not echoed." Read from the echo stream's
					// input stream to bypass the echo.
					in = ((EchoStream) stream).getInputStream();
				else
					in = stream;
				final SubLObject result = in.readChar(eofError, eofValue);
				if (result instanceof LispCharacter)
					in.unreadChar((LispCharacter) result);
				return result;
			}
			if (peekType == T) {
				// "If PEEK-TYPE is T, then PEEK-CHAR skips over whitespace[2]
				// characters, but not comments, and then performs the peeking
				// operation on the next character."
				Readtable rt = currentReadtable();
				while (true) {
					SubLObject result = stream.readChar(eofError, eofValue);
					if (result instanceof LispCharacter) {
						char c = ((LispCharacter) result).value;
						if (!rt.isWhitespace(c)) {
							stream.unreadChar((LispCharacter) result);
							return result;
						}
					} else
						return result;
				}
			}
			if (peekType instanceof LispCharacter) {
				// "If PEEK-TYPE is a character, then PEEK-CHAR skips over input
				// characters until a character that is CHAR= to that character is
				// found; that character is left in INPUT-STREAM."
				char c = ((LispCharacter) peekType).value;
				while (true) {
					SubLObject result = stream.readChar(eofError, eofValue);
					if (result instanceof LispCharacter) {
						if (((LispCharacter) result).value == c) {
							stream.unreadChar((LispCharacter) result);
							return result;
						}
					} else
						return result;
				}
			}
			return error(new SimpleError(String.valueOf(peekType) + " is an illegal peek-type."));
		}

	}

	// ### close stream &key abort => result
	private static final Primitive CLOSE = new JavaPrimitive(LispSymbols.CLOSE, "stream &key abort") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStream(arg).close(NIL);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final LispStream stream = checkStream(first);
			if (second == Keyword.ABORT)
				return stream.close(third);
			return error(new ProgramError("Unrecognized keyword argument " + second.writeToString() + "."));
		}
	};

	// ### out-synonym-of stream-designator => stream
	private static final Primitive OUT_SYNONYM_OF = new JavaPrimitive("out-synonym-of", PACKAGE_SYS, true,
			"stream-designator") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispStream)
				return arg;
			if (arg == T)
				return LispSymbols.TERMINAL_IO.symbolValue();
			if (arg == NIL)
				return LispSymbols.STANDARD_OUTPUT.symbolValue();
			return arg;
		}
	};

	// ### write-8-bits
	// write-8-bits byte stream => nil
	private static final Primitive WRITE_8_BITS = new JavaPrimitive("write-8-bits", PACKAGE_SYS, true, "byte stream") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			int n = first.intValue();
			if (n < 0 || n > 255)
				return type_error(first, UNSIGNED_BYTE_8);
			checkStream(second)._writeByte(n);
			return NIL;
		}
	};

	// ### read-8-bits
	// read-8-bits stream &optional eof-error-p eof-value => byte
	private static final Primitive READ_8_BITS = new JavaPrimitive("read-8-bits", PACKAGE_SYS, true,
			"stream &optional eof-error-p eof-value") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return checkBinaryInputStream(first).readByte((second != NIL), third);
		}

		@Override
		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length < 1 || length > 3)
				return error(new WrongNumberOfArgumentsException(this));
			final LispStream in = checkBinaryInputStream(args[0]);
			boolean eofError = length > 1 ? (args[1] != NIL) : true;
			SubLObject eofValue = length > 2 ? args[2] : NIL;
			return in.readByte(eofError, eofValue);
		}
	};

	// ### read-line &optional input-stream eof-error-p eof-value recursive-p
	// => line, missing-newline-p
	private static final Primitive READ_LINE = new JavaPrimitive(LispSymbols.READ_LINE,
			"&optional input-stream eof-error-p eof-value recursive-p") {
		@Override
		public SubLObject execute() {
			final SubLObject obj = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = checkStream(obj);
			return stream.readLine(true, NIL);
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg == T)
				arg = LispSymbols.TERMINAL_IO.symbolValue();
			else if (arg == NIL)
				arg = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = checkStream(arg);
			return stream.readLine(true, NIL);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first == T)
				first = LispSymbols.TERMINAL_IO.symbolValue();
			else if (first == NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = checkStream(first);
			return stream.readLine(second != NIL, NIL);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			if (first == T)
				first = LispSymbols.TERMINAL_IO.symbolValue();
			else if (first == NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = checkStream(first);
			return stream.readLine(second != NIL, third);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			// recursive-p is ignored
			if (first == T)
				first = LispSymbols.TERMINAL_IO.symbolValue();
			else if (first == NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = checkStream(first);
			return stream.readLine(second != NIL, third);
		}
	};

	// ### %read-from-string string eof-error-p eof-value start end preserve-whitespace
	// => object, position
	private static final Primitive _READ_FROM_STRING = new JavaPrimitive("%read-from-string", PACKAGE_SYS, false) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth)

		{
			String s = first.getString();
			boolean eofError = (second != NIL);
			boolean preserveWhitespace = (sixth != NIL);
			final int startIndex;
			if (fourth != NIL)
				startIndex = fourth.intValue();
			else
				startIndex = 0;
			final int endIndex;
			if (fifth != NIL)
				endIndex = fifth.intValue();
			else
				endIndex = s.length();
			StringInputStream in = new StringInputStream(s, startIndex, endIndex);
			final LispThread thread = LispThread.currentThread();
			SubLObject result;
			if (preserveWhitespace)
				result = in.readPreservingWhitespace(eofError, third, false, thread);
			else
				result = in.read(eofError, third, false, thread);
			return thread.setValues(result, LispObjectFactory.makeInteger(in.getOffset()));
		}
	};

	// ### read &optional input-stream eof-error-p eof-value recursive-p => object
	private static final Primitive READ = new JavaPrimitive(LispSymbols.READ,
			"&optional input-stream eof-error-p eof-value recursive-p") {
		@Override
		public SubLObject execute() {
			final LispThread thread = LispThread.currentThread();
			final SubLObject obj = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = checkStream(obj);
			return stream.read(true, NIL, false, thread);
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			final LispThread thread = LispThread.currentThread();
			if (arg == T)
				arg = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (arg == NIL)
				arg = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = checkStream(arg);
			return stream.read(true, NIL, false, thread);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final LispThread thread = LispThread.currentThread();
			if (first == T)
				first = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (first == NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = checkStream(first);
			return stream.read(second != NIL, NIL, false, thread);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final LispThread thread = LispThread.currentThread();
			if (first == T)
				first = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (first == NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = checkStream(first);
			return stream.read(second != NIL, third, false, thread);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			final LispThread thread = LispThread.currentThread();
			if (first == T)
				first = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (first == NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = checkStream(first);
			return stream.read(second != NIL, third, fourth != NIL, thread);
		}
	};

	// ### read-preserving-whitespace
	// &optional input-stream eof-error-p eof-value recursive-p => object
	private static final Primitive READ_PRESERVING_WHITESPACE = new JavaPrimitive(LispSymbols.READ_PRESERVING_WHITESPACE,
			"&optional input-stream eof-error-p eof-value recursive-p") {
		@Override
		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length > 4)
				return error(new WrongNumberOfArgumentsException(this));
			LispStream stream = length > 0 ? inSynonymOf(args[0]) : getStandardInput();
			boolean eofError = length > 1 ? (args[1] != NIL) : true;
			SubLObject eofValue = length > 2 ? args[2] : NIL;
			boolean recursive = length > 3 ? (args[3] != NIL) : false;
			return stream.readPreservingWhitespace(eofError, eofValue, recursive, LispThread.currentThread());
		}
	};

	// ### read-char &optional input-stream eof-error-p eof-value recursive-p
	// => char
	private static final Primitive READ_CHAR = new JavaPrimitive(LispSymbols.READ_CHAR,
			"&optional input-stream eof-error-p eof-value recursive-p") {
		@Override
		public SubLObject execute() {
			return checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue()).readChar();
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return inSynonymOf(arg).readChar();
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return inSynonymOf(first).readChar(second != NIL, NIL);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return inSynonymOf(first).readChar(second != NIL, third);
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			return inSynonymOf(first).readChar(second != NIL, third);
		}
	};

	// ### read-char-no-hang &optional input-stream eof-error-p eof-value
	// recursive-p => char
	private static final Primitive READ_CHAR_NO_HANG = new JavaPrimitive("read-char-no-hang",
			"&optional input-stream eof-error-p eof-value recursive-p") {

		@Override
		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length > 4)
				error(new WrongNumberOfArgumentsException(this));
			LispStream stream = length > 0 ? inSynonymOf(args[0]) : getStandardInput();
			boolean eofError = length > 1 ? (args[1] != NIL) : true;
			SubLObject eofValue = length > 2 ? args[2] : NIL;
			// recursive-p is ignored
			// boolean recursive = length > 3 ? (args[3] != NIL) : false;
			return stream.readCharNoHang(eofError, eofValue);
		}
	};

	// ### read-delimited-list char &optional input-stream recursive-p => list
	private static final Primitive READ_DELIMITED_LIST = new JavaPrimitive("read-delimited-list",
			"char &optional input-stream recursive-p") {

		@Override
		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length < 1 || length > 3)
				error(new WrongNumberOfArgumentsException(this));
			char c = args[0].charValue();
			LispStream stream = length > 1 ? inSynonymOf(args[1]) : getStandardInput();
			return stream.readDelimitedList(c);
		}
	};

	// ### unread-char character &optional input-stream => nil
	private static final Primitive UNREAD_CHAR = new JavaPrimitive(LispSymbols.UNREAD_CHAR, "character &optional input-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return getStandardInput().unreadChar(checkCharacter(arg));
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispStream stream = inSynonymOf(second);
			return stream.unreadChar(checkCharacter(first));
		}
	};

	// ### write-vector-unsigned-byte-8
	private static final Primitive WRITE_VECTOR_UNSIGNED_BYTE_8 = new JavaPrimitive("write-vector-unsigned-byte-8",
			PACKAGE_SYS, true, "vector stream start end") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			final AbstractVector v = checkVector(first);
			final LispStream stream = checkStream(second);
			int start = third.intValue();
			int end = fourth.intValue();
			for (int i = start; i < end; i++)
				stream._writeByte(v.aref(i));
			return v;
		}
	};

	// ### read-vector-unsigned-byte-8 vector stream start end => position
	private static final Primitive READ_VECTOR_UNSIGNED_BYTE_8 = new JavaPrimitive("read-vector-unsigned-byte-8",
			PACKAGE_SYS, true, "vector stream start end") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			AbstractVector v = checkVector(first);
			LispStream stream = checkBinaryInputStream(second);
			int start = third.intValue();
			int end = fourth.intValue();
			if (!v.getElementType().equal(UNSIGNED_BYTE_8))
				return type_error(first, list(LispSymbols.VECTOR, UNSIGNED_BYTE_8));
			for (int i = start; i < end; i++) {
				int n = stream._readByte();
				if (n < 0) {
					// End of file.
					return LispObjectFactory.makeInteger(i);
				}
				v.aset(i, n);
			}
			return fourth;
		}
	};

	// ### file-position
	private static final Primitive FILE_POSITION = new JavaPrimitive("file-position", "stream &optional position-spec") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStream(arg).getFilePosition();
		}

		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return checkStream(first).setFilePosition(second);
		}
	};

	// ### stream-line-number
	private static final Primitive STREAM_LINE_NUMBER = new JavaPrimitive("stream-line-number", PACKAGE_SYS, false,
			"stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(checkStream(arg).getLineNumber() + 1);
		}
	};

	// ### stream-offset
	private static final Primitive STREAM_OFFSET = new JavaPrimitive("stream-offset", PACKAGE_SYS, false, "stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			return number(checkStream(arg).getOffset());
		}
	};

	// ### stream-charpos stream => position
	private static final Primitive STREAM_CHARPOS = new JavaPrimitive("stream-charpos", PACKAGE_SYS, false) {
		@Override
		public SubLObject execute(SubLObject arg) {
			LispStream stream = checkCharacterOutputStream(arg);
			return LispObjectFactory.makeInteger(stream.getCharPos());
		}
	};

	// ### stream-%set-charpos stream newval => newval
	private static final Primitive STREAM_SET_CHARPOS = new JavaPrimitive("stream-%set-charpos", PACKAGE_SYS, false) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispStream stream = checkCharacterOutputStream(first);
			stream.setCharPos(second.intValue());
			return second;
		}
	};

	// ### make-two-way-stream input-stream output-stream => two-way-stream
	private static final Primitive MAKE_TWO_WAY_STREAM = new JavaPrimitive(LispSymbols.MAKE_TWO_WAY_STREAM,
			"input-stream output-stream") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final LispStream in = checkStream(first);
			final LispStream out = checkStream(second);
			if (!in.isInputStream())
				return type_error(in, list(LispSymbols.SATISFIES, LispSymbols.INPUT_STREAM_P));
			if (!out.isOutputStream())
				return type_error(out, list(LispSymbols.SATISFIES, LispSymbols.OUTPUT_STREAM_P));
			return new TwoWayStream(in, out);
		}
	};

	// ### two-way-stream-input-stream two-way-stream => input-stream
	private static final Primitive TWO_WAY_STREAM_INPUT_STREAM = new JavaPrimitive(LispSymbols.TWO_WAY_STREAM_INPUT_STREAM,
			"two-way-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof TwoWayStream)
				return ((TwoWayStream) arg).in;
			return type_error(arg, LispSymbols.TWO_WAY_STREAM);
		}
	};

	// ### two-way-stream-output-stream two-way-stream => output-stream
	private static final Primitive TWO_WAY_STREAM_OUTPUT_STREAM = new JavaPrimitive(LispSymbols.TWO_WAY_STREAM_OUTPUT_STREAM,
			"two-way-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof TwoWayStream)
				return ((TwoWayStream) arg).out;
			return type_error(arg, LispSymbols.TWO_WAY_STREAM);
		}
	};
	//### stream-external-format
	private static final Primitive STREAM_EXTERNAL_FORMAT = new stream_external_format();

	public final static class stream_external_format extends JavaPrimitive {
		stream_external_format() {
			super("stream-external-format", "stream");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispStream)
				return ((LispStream) arg).getExternalFormat();
			else
				return error(new TypeError(arg, LispSymbols.STREAM));
		}

		// DEFSETF-ed in 'setf.lisp'
		private static final Primitive SET_STREAM_EXTERNAL_FORMAT = new JavaPrimitive("%set-stream-external-format",
				PACKAGE_SYS, false, "stream external-format") {
			@Override
			public SubLObject execute(SubLObject stream, SubLObject format) {
				LispStream s = checkStream(stream);
				s.setExternalFormat(format);

				return format;
			}
		};
	}

	//### listen
	private static final Primitive LISTEN = new listen();

	public final static class listen extends JavaPrimitive {
		protected listen() {
			super("listen", "&optional input-stream");
		}

		@Override
		public SubLObject execute() {
			LispStream stream = checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue());
			return stream.listen();
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return inSynonymOf(arg).listen();
		}

	}

	//### input-stream-p
	private static final Primitive INPUT_STREAM_P = new input_stream_p();

	public static final class input_stream_p extends JavaPrimitive {
		protected input_stream_p() {
			super("input-stream-p");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStream(arg).isInputStream() ? T : NIL;
		}

	}

	//### interactive-stream-p
	private static final Primitive INTERACTIVE_STREAM_P = new interactive_stream_p();

	public static final class interactive_stream_p extends JavaPrimitive {
		protected interactive_stream_p() {
			super("interactive-stream-p", "stream");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispStream)
				return ((LispStream) arg).isInteractive() ? T : NIL;
			return error(new TypeError(arg, LispSymbols.STREAM));
		}

	}

	//### open-stream-p
	private static final Primitive OPEN_STREAM_P = new open_stream_p();

	public static final class open_stream_p extends JavaPrimitive {
		protected open_stream_p() {
			super("open-stream-p");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStream(arg).isOpen() ? T : NIL;
		}

	}

	//### output-stream-p
	private static final Primitive OUTPUT_STREAM_P = new output_stream_p();

	public static final class output_stream_p extends JavaPrimitive {
		public output_stream_p() {
			super("output-stream-p");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStream(arg).isOutputStream() ? T : NIL;
		}

	}

	//### stream-element-type
	private static final Primitive STREAM_ELEMENT_TYPE = new stream_element_type();

	public final static class stream_element_type extends JavaPrimitive {
		protected stream_element_type() {
			super("stream-element-type", "stream");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStream(arg).getElementType();
		}
	}

	// ### make-fill-pointer-output-stream string => string-stream
	private static final Primitive MAKE_FILL_POINTER_OUTPUT_STREAM = new JavaPrimitive("make-fill-pointer-output-stream",
			PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ComplexString) {
				ComplexString string = (ComplexString) arg;
				if (string.getFillPointer() >= 0)
					return new FillPointerOutputStream(string);
			}
			return type_error(arg, list(LispSymbols.AND, LispSymbols.STRING, list(LispSymbols.SATISFIES, LispSymbols.ARRAY_HAS_FILL_POINTER_P)));
		}
	};

	// ### make-file-stream pathname namestring element-type direction if-exists external-format => stream
	private static final Primitive MAKE_FILE_STREAM = new JavaPrimitive("make-file-stream", PACKAGE_SYS, true,
			"pathname namestring element-type direction if-exists external-format") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth)

		{
			final Pathname pathname;
			if (first instanceof Pathname) {
				pathname = (Pathname) first;
			} else {
				return type_error(first, LispSymbols.PATHNAME);
			}
			if (pathname.isJar()) {
				error(new FileError("Direct stream input/output on entries in JAR files no currently supported.", pathname));
			}

			final SubLObject namestring = checkString(second);
			SubLObject elementType = third;
			SubLObject direction = fourth;
			SubLObject ifExists = fifth;
			SubLObject externalFormat = sixth;

			if (direction != Keyword.INPUT && direction != Keyword.OUTPUT && direction != Keyword.IO)
				error(new LispError("Direction must be :INPUT, :OUTPUT, or :IO."));
			try {
				return new FileStream(pathname, namestring.getString(), elementType, direction, ifExists, externalFormat);
			} catch (FileNotFoundException e) {
				return NIL;
			} catch (IOException e) {
				return error(new StreamError(null, e));
			}
		}
	};

	// ### make-echo-stream
	// input-stream output-stream => echo-stream
	private static final Primitive MAKE_ECHO_STREAM = new JavaPrimitive("make-echo-stream", "input-stream output-stream") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (!(first instanceof LispStream))
				return type_error(first, LispSymbols.STREAM);
			if (!(second instanceof LispStream))
				return type_error(second, LispSymbols.STREAM);
			return new EchoStream((LispStream) first, (LispStream) second);
		}
	};

	// ### echo-stream-input-stream
	// echo-stream => input-stream
	private static final Primitive ECHO_STREAM_INPUT_STREAM = new JavaPrimitive("echo-stream-input-stream", "echo-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof EchoStream)
				return ((EchoStream) arg).getInputStream();
			return type_error(arg, LispSymbols.ECHO_STREAM);
		}
	};

	// ### echo-stream-output-stream
	// echo-stream => output-stream
	private static final Primitive ECHO_STREAM_OUTPUT_STREAM = new JavaPrimitive("echo-stream-output-stream",
			"echo-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof EchoStream)
				return ((EchoStream) arg).getOutputStream();
			return type_error(arg, LispSymbols.ECHO_STREAM);
		}
	};

	// ### make-broadcast-stream &rest streams => broadcast-stream
	private static final Primitive MAKE_BROADCAST_STREAM = new JavaPrimitive("make-broadcast-stream", "&rest streams") {
		@Override
		public SubLObject execute() {
			return new BroadcastStream(new LispStream[0]);
		}

		@Override
		public SubLObject execute(SubLObject[] args) {
			LispStream[] streams = new LispStream[args.length];
			for (int i = 0; i < args.length; i++) {
				if (args[i] instanceof LispStream) {
					if (((LispStream) args[i]).isOutputStream()) {
						streams[i] = (LispStream) args[i];
						continue;
					} else
						return error(new TypeError(args[i], list(LispSymbols.SATISFIES, LispSymbols.OUTPUT_STREAM_P)));
				} else
					return error(new TypeError(args[i], LispSymbols.STREAM));
			}
			// All is well.
			return new BroadcastStream(streams);
		}
	};

	// ### broadcast-stream-streams broadcast-stream => streams
	private static final Primitive BROADCAST_STREAM_STREAMS = new JavaPrimitive("broadcast-stream-streams",
			"broadcast-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof BroadcastStream) {
				BroadcastStream stream = (BroadcastStream) arg;
				LispStream[] streams = stream.streams;
				SubLObject result = NIL;
				for (int i = streams.length; i-- > 0;)
					result = makeCons(streams[i], result);
				return result;
			}
			return error(new TypeError(arg, LispSymbols.BROADCAST_STREAM));
		}
	};

	// ### %make-byte-array-output-stream
	// %make-byte-array-output-stream &optional element-type => byte-array-output-stream
	private static final Primitive MAKE_BYTE_ARRAY_OUTPUT_STREAM = new JavaPrimitive("%make-byte-array-output-stream",
			PACKAGE_SYS, false, "&optional element-type") {

		@Override
		public SubLObject execute() {
			return new ByteArrayOutputStream();
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return new ByteArrayOutputStream(arg);
		}
	};

	// ### %get-output-stream-bytes
	// %get-output-stream-bytes byte-array-output-stream => java-byte-array
	private static final Primitive GET_OUTPUT_STREAM_BYTES = new JavaPrimitive("%get-output-stream-bytes", PACKAGE_SYS,
			false, "byte-array-output-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ByteArrayOutputStream) {
				return ABCLJavaObject.makeJavaObject(((ByteArrayOutputStream) arg).getByteArray());
			}
			return error(new TypeError(this, LispSymbols.STREAM)); //TODO
		}
	};

	private static final Primitive GET_OUTPUT_STREAM_ARRAY = new JavaPrimitive("%get-output-stream-array", PACKAGE_SYS,
			false, "byte-array-output-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ByteArrayOutputStream)
				return new BasicVector_UnsignedByte8(((ByteArrayOutputStream) arg).getByteArray());

			return error(new TypeError(this, LispSymbols.STREAM)); // TODO
		}
	};

	// ### make-case-frob-stream target => case-frob-stream
	private static final Primitive MAKE_CASE_FROB_STREAM = new JavaPrimitive("make-case-frob-stream", PACKAGE_SYS, false,
			"target kind") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispStream target = checkCharacterOutputStream(first);
			if (second == Keyword.UPCASE)
				return new UpcaseStream(target);
			if (second == Keyword.DOWNCASE)
				return new DowncaseStream(target);
			if (second == Keyword.CAPITALIZE)
				return new CapitalizeStream(target);
			if (second == Keyword.CAPITALIZE_FIRST)
				return new CapitalizeFirstStream(target);
			return error(new TypeError("Kind must be :UPCASE, :DOWNCASE, :CAPITALIZE or :CAPITALIZE-FIRST."));
		}
	};

	// ### make-concatenated-stream &rest streams => concatenated-stream
	private static final Primitive MAKE_CONCATENATED_STREAM = new JavaPrimitive("make-concatenated-stream",
			"&rest streams") {
		@Override
		public SubLObject execute(SubLObject[] args) {
			SubLObject streams = NIL;
			for (int i = 0; i < args.length; i++) {
				if (args[i] instanceof LispStream) {
					LispStream stream = (LispStream) args[i];
					if (stream.isInputStream()) {
						//                         streams[i] = (Stream) args[i];
						streams = makeCons(stream, streams);
						continue;
					}
				}
				SubLObject o = args[i];
				error(new TypeError(o==null?"#<NULL>":o.writeToString() + " is not an input stream."));
			}
			return new ConcatenatedStream(streams.nreverse());
		}
	};

	// ### concatenated-stream-streams concatenated-stream => streams
	private static final Primitive CONCATENATED_STREAM_STREAMS = new JavaPrimitive("concatenated-stream-streams",
			"concatenated-stream") {
		@Override
		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ConcatenatedStream)
				return ((ConcatenatedStream) arg).streams;
			return error(new TypeError(arg, LispSymbols.CONCATENATED_STREAM));
		}
	};

	// ### %make-slime-output-stream
	// %make-slime-output-stream function => stream
	private static final Primitive MAKE_SLIME_OUTPUT_STREAM = new JavaPrimitive("make-slime-output-stream", PACKAGE_EXT,
			true, "function") {
		@Override
		public SubLObject execute(SubLObject arg) {
			final Function fun;
			if (arg instanceof SubLSymbol)
				fun = (Function) arg.getSymbolFunction();
			else
				fun = (Function) arg;
			return new SlimeOutputStream(fun);
		}
	};

	// ### make-slime-input-stream
	// make-slime-input-stream function output-stream => slime-input-stream
	private static final Primitive MAKE_SLIME_INPUT_STREAM = new JavaPrimitive("make-slime-input-stream", PACKAGE_EXT,
			true, "function output-stream") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final Function fun;
			final LispStream os;
			if (first instanceof SubLSymbol)
				fun = (Function) first.getSymbolFunction();
			else
				fun = (Function) first;
			os = checkCharacterOutputStream(second);
			return new SlimeInputStream(fun, os);
		}
	};
	
  // ### make-synonym-stream symbol => synonym-stream
  private static final Primitive MAKE_SYNONYM_STREAM =
      new JavaPrimitive("make-synonym-stream", "symbol")
  {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return new SynonymStream(checkSymbol(arg));
      }
  };

  // ### synonym-stream-symbol synonym-stream => symbol
  private static final Primitive SYNONYM_STREAM_STREAMS =
      new JavaPrimitive("synonym-stream-symbol", "synonym-stream")
  {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          if (arg instanceof SynonymStream) 
              return ((SynonymStream)arg).symbol;
          return error(new TypeError(arg, LispSymbols.SYNONYM_STREAM));
      }
  };
}
