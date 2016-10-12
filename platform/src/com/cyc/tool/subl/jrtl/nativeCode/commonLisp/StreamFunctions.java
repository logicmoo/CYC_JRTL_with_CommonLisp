package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class StreamFunctions {

	public static class input_stream_p extends JavaPrimitive {
		protected input_stream_p() {
			super("input-stream-p");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).isInputStream() ? Lisp.T : Lisp.NIL;
		}

	}

	public static class interactive_stream_p extends JavaPrimitive {
		protected interactive_stream_p() {
			super("interactive-stream-p", "stream");
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispStream)
				return ((LispStream) arg).isInteractive() ? Lisp.T : Lisp.NIL;
			return Lisp.error(new TypeError(arg, LispSymbols.STREAM));
		}

	}

	public static class listen extends JavaPrimitive {
		protected listen() {
			super("listen", "&optional input-stream");
		}

		public SubLObject execute() {
			LispStream stream = Lisp.checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue());
			return stream.listen();
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.inSynonymOf(arg).listen();
		}

	}

	public static class open_stream_p extends JavaPrimitive {
		protected open_stream_p() {
			super("open-stream-p");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).isOpen() ? Lisp.T : Lisp.NIL;
		}

	}

	public static class output_stream_p extends JavaPrimitive {
		public output_stream_p() {
			super("output-stream-p");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).isOutputStream() ? Lisp.T : Lisp.NIL;
		}

	}

	public static class peek_char extends JavaPrimitive {
		peek_char() {
			super("peek-char", "&optional peek-type input-stream eof-error-p eof-value recursive-p");
		}

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length > 5)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			SubLObject peekType = length > 0 ? args[0] : Lisp.NIL;
			LispStream stream = length > 1 ? Lisp.inSynonymOf(args[1]) : Lisp.getStandardInput();
			boolean eofError = length > 2 ? args[2] != Lisp.NIL : true;
			SubLObject eofValue = length > 3 ? args[3] : Lisp.NIL;
			// recursive-p is ignored
			// boolean recursive = length > 4 ? (args[4] != NIL) : false;
			if (peekType == Lisp.NIL) {
				// "If PEEK-TYPE is not supplied or NIL, PEEK-CHAR returns the
				// next
				// character to be read from INPUT-STREAM, without actually
				// removing it from INPUT-STREAM."
				final LispStream in;
				if (stream instanceof EchoStream)
					// "When INPUT-STREAM is an echo stream, characters that are
					// only peeked at are not echoed." Read from the echo
					// stream's
					// input stream to bypass the echo.
					in = ((EchoStream) stream).getInputStream();
				else
					in = stream;
				final SubLObject result = in.readChar(eofError, eofValue);
				if (result instanceof LispCharacter)
					in.unreadChar((LispCharacter) result);
				return result;
			}
			if (peekType == Lisp.T) {
				// "If PEEK-TYPE is T, then PEEK-CHAR skips over whitespace[2]
				// characters, but not comments, and then performs the peeking
				// operation on the next character."
				Readtable rt = Lisp.currentReadtable();
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
				// characters until a character that is CHAR= to that character
				// is
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
			return Lisp.error(new SimpleError(String.valueOf(peekType) + " is an illegal peek-type."));
		}

	}

	public static class stream_element_type extends JavaPrimitive {
		protected stream_element_type() {
			super("stream-element-type", "stream");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).getElementType();
		}
	}

	public static class stream_external_format extends JavaPrimitive {
		// DEFSETF-ed in 'setf.lisp'
		private static Primitive SET_STREAM_EXTERNAL_FORMAT = new JavaPrimitive("%set-stream-external-format",
				Lisp.PACKAGE_SYS, false, "stream external-format") {

			public SubLObject execute(SubLObject stream, SubLObject format) {
				LispStream s = Lisp.checkStream(stream);
				s.setExternalFormat(format);

				return format;
			}
		};

		stream_external_format() {
			super("stream-external-format", "stream");
		}

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispStream)
				return ((LispStream) arg).getExternalFormat();
			else
				return Lisp.error(new TypeError(arg, LispSymbols.STREAM));
		}
	}

	// ### make-string-input-stream
	// make-string-input-stream string &optional start end => string-stream
	private static Primitive MAKE_STRING_INPUT_STREAM = new JavaPrimitive("make-string-input-stream",
			"string &optional start end") {

		public SubLObject execute(SubLObject arg) {
			return new StringInputStream(arg.getString());
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			String s = first.getString();
			int start = second.intValue();
			return new StringInputStream(s, start);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			String s = first.getString();
			int start = second.intValue();
			if (third == Lisp.NIL)
				return new StringInputStream(s, start);
			int end = third.intValue();
			return new StringInputStream(s, start, end);
		}
	};

	// ### string-input-stream-current
	private static Primitive STRING_INPUT_STREAM_CURRENT = new JavaPrimitive("string-input-stream-current",
			Lisp.PACKAGE_EXT, true, "stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StringInputStream)
				return LispObjectFactory.makeInteger(((StringInputStream) arg).getOffset());
			return Lisp.error(new TypeError(String.valueOf(arg) + " is not a string input stream."));
		}
	};

	// ### %make-string-output-stream
	// %make-string-output-stream element-type => string-stream
	private static Primitive MAKE_STRING_OUTPUT_STREAM = new JavaPrimitive("%make-string-output-stream",
			Lisp.PACKAGE_SYS, false, "element-type") {

		public SubLObject execute(SubLObject arg) {
			return new StringOutputStream(arg);
		}
	};

	// ### get-output-stream-string
	// get-output-stream-string string-output-stream => string
	private static Primitive GET_OUTPUT_STREAM_STRING = new JavaPrimitive("get-output-stream-string",
			"string-output-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StringOutputStream)
				return ((StringOutputStream) arg).getOutputString();
			return Lisp.type_error(this, LispSymbols.STRING_OUTPUT_STREAM);
		}
	};

	// ### %stream-write-char character output-stream => character
	// OUTPUT-STREAM must be a real stream, not an output stream designator!
	private static Primitive _WRITE_CHAR = new JavaPrimitive("%stream-write-char", Lisp.PACKAGE_SYS, true,
			"character output-stream") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			Lisp.checkStream(second)._writeChar(first.charValue());
			return first;
		}
	};

	// ### %write-char character output-stream => character
	private static Primitive _STREAM_WRITE_CHAR = new JavaPrimitive("%write-char", Lisp.PACKAGE_SYS, false,
			"character output-stream") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final char c = first.charValue();
			if (second == Lisp.T)
				second = LispSymbols.TERMINAL_IO.symbolValue();
			else if (second == Lisp.NIL)
				second = LispSymbols.STANDARD_OUTPUT.symbolValue();
			final LispStream stream = Lisp.checkStream(second);
			stream._writeChar(c);
			return first;
		}
	};

	// ### %write-string string output-stream start end => string
	private static Primitive _WRITE_STRING = new JavaPrimitive("%write-string", Lisp.PACKAGE_SYS, false,
			"string output-stream start end") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			final SubLString s = Lisp.checkString(first);
			char[] chars = s.charsOld();
			final LispStream out = Lisp.outSynonymOf(second);
			final int start = third.intValue();
			final int end;
			if (fourth == Lisp.NIL)
				end = chars.length;
			else
				end = fourth.intValue();
			Lisp.checkBounds(start, end, chars.length);
			out._writeChars(chars, start, end);
			return first;
		}
	};

	// ### %finish-output output-stream => nil
	private static Primitive _FINISH_OUTPUT = new JavaPrimitive("%finish-output", Lisp.PACKAGE_SYS, false,
			"output-stream") {

		public SubLObject execute(SubLObject arg) {
			return StreamFunctions.finishOutput(arg);
		}
	};

	// ### %force-output output-stream => nil
	private static Primitive _FORCE_OUTPUT = new JavaPrimitive("%force-output", Lisp.PACKAGE_SYS, false,
			"output-stream") {

		public SubLObject execute(SubLObject arg) {
			return StreamFunctions.finishOutput(arg);
		}
	};

	// ### clear-input &optional input-stream => nil
	private static Primitive CLEAR_INPUT = new JavaPrimitive(LispSymbols.CLEAR_INPUT, "&optional input-stream") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length > 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			final LispStream in;
			if (args.length == 0)
				in = Lisp.checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue());
			else
				in = Lisp.inSynonymOf(args[0]);
			in.clearInput();
			return Lisp.NIL;
		}
	};

	// ### %clear-output output-stream => nil
	// "If any of these operations does not make sense for output-stream, then
	// it does nothing."
	private static Primitive _CLEAR_OUTPUT = new JavaPrimitive("%clear-output", Lisp.PACKAGE_SYS, false,
			"output-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg == Lisp.T) // *TERMINAL-IO*
				return Lisp.NIL;
			if (arg == Lisp.NIL) // *STANDARD-OUTPUT*
				return Lisp.NIL;
			if (arg instanceof LispStream)
				return Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.STREAM);
		}
	};

	// ### peek-char
	private static Primitive PEEK_CHAR = new peek_char();

	// ### close stream &key abort => result
	private static Primitive CLOSE = new JavaPrimitive(LispSymbols.CLOSE, "stream &key abort") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).close(Lisp.NIL);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final LispStream stream = Lisp.checkStream(first);
			if (second == Keyword.ABORT)
				return stream.close(third);
			return Lisp.error(new ProgramError("Unrecognized keyword argument " + second.writeToString() + "."));
		}
	};

	// ### out-synonym-of stream-designator => stream
	private static Primitive OUT_SYNONYM_OF = new JavaPrimitive("out-synonym-of", Lisp.PACKAGE_SYS, true,
			"stream-designator") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispStream)
				return arg;
			if (arg == Lisp.T)
				return LispSymbols.TERMINAL_IO.symbolValue();
			if (arg == Lisp.NIL)
				return LispSymbols.STANDARD_OUTPUT.symbolValue();
			return arg;
		}
	};

	// ### write-8-bits
	// write-8-bits byte stream => nil
	private static Primitive WRITE_8_BITS = new JavaPrimitive("write-8-bits", Lisp.PACKAGE_SYS, true, "byte stream") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			int n = first.intValue();
			if (n < 0 || n > 255)
				return Lisp.type_error(first, Lisp.UNSIGNED_BYTE_8);
			Lisp.checkStream(second)._writeByte(n);
			return Lisp.NIL;
		}
	};

	// ### read-8-bits
	// read-8-bits stream &optional eof-error-p eof-value => byte
	private static Primitive READ_8_BITS = new JavaPrimitive("read-8-bits", Lisp.PACKAGE_SYS, true,
			"stream &optional eof-error-p eof-value") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return Lisp.checkBinaryInputStream(first).readByte(second != Lisp.NIL, third);
		}

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length < 1 || length > 3)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			final LispStream in = Lisp.checkBinaryInputStream(args[0]);
			boolean eofError = length > 1 ? args[1] != Lisp.NIL : true;
			SubLObject eofValue = length > 2 ? args[2] : Lisp.NIL;
			return in.readByte(eofError, eofValue);
		}
	};

	// ### read-line &optional input-stream eof-error-p eof-value recursive-p
	// => line, missing-newline-p
	private static Primitive READ_LINE = new JavaPrimitive(LispSymbols.READ_LINE,
			"&optional input-stream eof-error-p eof-value recursive-p") {

		public SubLObject execute() {
			final SubLObject obj = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = Lisp.checkStream(obj);
			return stream.readLine(true, Lisp.NIL);
		}

		public SubLObject execute(SubLObject arg) {
			if (arg == Lisp.T)
				arg = LispSymbols.TERMINAL_IO.symbolValue();
			else if (arg == Lisp.NIL)
				arg = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = Lisp.checkStream(arg);
			return stream.readLine(true, Lisp.NIL);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first == Lisp.T)
				first = LispSymbols.TERMINAL_IO.symbolValue();
			else if (first == Lisp.NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = Lisp.checkStream(first);
			return stream.readLine(second != Lisp.NIL, Lisp.NIL);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			if (first == Lisp.T)
				first = LispSymbols.TERMINAL_IO.symbolValue();
			else if (first == Lisp.NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = Lisp.checkStream(first);
			return stream.readLine(second != Lisp.NIL, third);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			// recursive-p is ignored
			if (first == Lisp.T)
				first = LispSymbols.TERMINAL_IO.symbolValue();
			else if (first == Lisp.NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue();
			final LispStream stream = Lisp.checkStream(first);
			return stream.readLine(second != Lisp.NIL, third);
		}
	};

	// ### %read-from-string string eof-error-p eof-value start end
	// preserve-whitespace
	// => object, position
	private static Primitive _READ_FROM_STRING = new JavaPrimitive("%read-from-string", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth)

		{
			String s = first.getString();
			boolean eofError = second != Lisp.NIL;
			boolean preserveWhitespace = sixth != Lisp.NIL;
			final int startIndex;
			if (fourth != Lisp.NIL)
				startIndex = fourth.intValue();
			else
				startIndex = 0;
			final int endIndex;
			if (fifth != Lisp.NIL)
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

	// ### read &optional input-stream eof-error-p eof-value recursive-p =>
	// object
	private static Primitive READ = new JavaPrimitive(LispSymbols.READ,
			"&optional input-stream eof-error-p eof-value recursive-p") {

		public SubLObject execute() {
			final LispThread thread = LispThread.currentThread();
			final SubLObject obj = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = Lisp.checkStream(obj);
			return stream.read(true, Lisp.NIL, false, thread);
		}

		public SubLObject execute(SubLObject arg) {
			final LispThread thread = LispThread.currentThread();
			if (arg == Lisp.T)
				arg = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (arg == Lisp.NIL)
				arg = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = Lisp.checkStream(arg);
			return stream.read(true, Lisp.NIL, false, thread);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final LispThread thread = LispThread.currentThread();
			if (first == Lisp.T)
				first = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (first == Lisp.NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = Lisp.checkStream(first);
			return stream.read(second != Lisp.NIL, Lisp.NIL, false, thread);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final LispThread thread = LispThread.currentThread();
			if (first == Lisp.T)
				first = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (first == Lisp.NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = Lisp.checkStream(first);
			return stream.read(second != Lisp.NIL, third, false, thread);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			final LispThread thread = LispThread.currentThread();
			if (first == Lisp.T)
				first = LispSymbols.TERMINAL_IO.symbolValue(thread);
			else if (first == Lisp.NIL)
				first = LispSymbols.STANDARD_INPUT.symbolValue(thread);
			final LispStream stream = Lisp.checkStream(first);
			return stream.read(second != Lisp.NIL, third, fourth != Lisp.NIL, thread);
		}
	};

	// ### read-preserving-whitespace
	// &optional input-stream eof-error-p eof-value recursive-p => object
	private static Primitive READ_PRESERVING_WHITESPACE = new JavaPrimitive(LispSymbols.READ_PRESERVING_WHITESPACE,
			"&optional input-stream eof-error-p eof-value recursive-p") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length > 4)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			LispStream stream = length > 0 ? Lisp.inSynonymOf(args[0]) : Lisp.getStandardInput();
			boolean eofError = length > 1 ? args[1] != Lisp.NIL : true;
			SubLObject eofValue = length > 2 ? args[2] : Lisp.NIL;
			boolean recursive = length > 3 ? args[3] != Lisp.NIL : false;
			return stream.readPreservingWhitespace(eofError, eofValue, recursive, LispThread.currentThread());
		}
	};

	// ### read-char &optional input-stream eof-error-p eof-value recursive-p
	// => char
	private static Primitive READ_CHAR = new JavaPrimitive(LispSymbols.READ_CHAR,
			"&optional input-stream eof-error-p eof-value recursive-p") {

		public SubLObject execute() {
			return Lisp.checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue()).readChar();
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.inSynonymOf(arg).readChar();
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return Lisp.inSynonymOf(first).readChar(second != Lisp.NIL, Lisp.NIL);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return Lisp.inSynonymOf(first).readChar(second != Lisp.NIL, third);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			return Lisp.inSynonymOf(first).readChar(second != Lisp.NIL, third);
		}
	};

	// ### read-char-no-hang &optional input-stream eof-error-p eof-value
	// recursive-p => char
	private static Primitive READ_CHAR_NO_HANG = new JavaPrimitive("read-char-no-hang",
			"&optional input-stream eof-error-p eof-value recursive-p") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length > 4)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			LispStream stream = length > 0 ? Lisp.inSynonymOf(args[0]) : Lisp.getStandardInput();
			boolean eofError = length > 1 ? args[1] != Lisp.NIL : true;
			SubLObject eofValue = length > 2 ? args[2] : Lisp.NIL;
			// recursive-p is ignored
			// boolean recursive = length > 3 ? (args[3] != NIL) : false;
			return stream.readCharNoHang(eofError, eofValue);
		}
	};

	// ### read-delimited-list char &optional input-stream recursive-p => list
	private static Primitive READ_DELIMITED_LIST = new JavaPrimitive("read-delimited-list",
			"char &optional input-stream recursive-p") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length < 1 || length > 3)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			char c = args[0].charValue();
			LispStream stream = length > 1 ? Lisp.inSynonymOf(args[1]) : Lisp.getStandardInput();
			return stream.readDelimitedList(c);
		}
	};

	// ### unread-char character &optional input-stream => nil
	private static Primitive UNREAD_CHAR = new JavaPrimitive(LispSymbols.UNREAD_CHAR,
			"character &optional input-stream") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.getStandardInput().unreadChar(Lisp.checkCharacter(arg));
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispStream stream = Lisp.inSynonymOf(second);
			return stream.unreadChar(Lisp.checkCharacter(first));
		}
	};

	// ### write-vector-unsigned-byte-8
	private static Primitive WRITE_VECTOR_UNSIGNED_BYTE_8 = new JavaPrimitive("write-vector-unsigned-byte-8",
			Lisp.PACKAGE_SYS, true, "vector stream start end") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			final AbstractVector v = Lisp.checkVector(first);
			final LispStream stream = Lisp.checkStream(second);
			int start = third.intValue();
			int end = fourth.intValue();
			for (int i = start; i < end; i++)
				stream._writeByte(v.aref(i));
			return v;
		}
	};

	// ### read-vector-unsigned-byte-8 vector stream start end => position
	private static Primitive READ_VECTOR_UNSIGNED_BYTE_8 = new JavaPrimitive("read-vector-unsigned-byte-8",
			Lisp.PACKAGE_SYS, true, "vector stream start end") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			AbstractVector v = Lisp.checkVector(first);
			LispStream stream = Lisp.checkBinaryInputStream(second);
			int start = third.intValue();
			int end = fourth.intValue();
			if (!v.getElementType().equal(Lisp.UNSIGNED_BYTE_8))
				return Lisp.type_error(first, Lisp.list(LispSymbols.VECTOR, Lisp.UNSIGNED_BYTE_8));
			for (int i = start; i < end; i++) {
				int n = stream._readByte();
				if (n < 0)
					// End of file.
					return LispObjectFactory.makeInteger(i);
				v.aset(i, n);
			}
			return fourth;
		}
	};

	// ### file-position
	private static Primitive FILE_POSITION = new JavaPrimitive("file-position", "stream &optional position-spec") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).getFilePosition();
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return Lisp.checkStream(first).setFilePosition(second);
		}
	};

	// ### stream-line-number
	private static Primitive STREAM_LINE_NUMBER = new JavaPrimitive("stream-line-number", Lisp.PACKAGE_SYS, false,
			"stream") {

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(Lisp.checkStream(arg).getLineNumber() + 1);
		}
	};
	// ### stream-offset
	private static Primitive STREAM_OFFSET = new JavaPrimitive("stream-offset", Lisp.PACKAGE_SYS, false, "stream") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.number(Lisp.checkStream(arg).getOffset());
		}
	};

	// ### stream-charpos stream => position
	private static Primitive STREAM_CHARPOS = new JavaPrimitive("stream-charpos", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject arg) {
			LispStream stream = Lisp.checkCharacterOutputStream(arg);
			return LispObjectFactory.makeInteger(stream.getCharPos());
		}
	};

	// ### stream-%set-charpos stream newval => newval
	private static Primitive STREAM_SET_CHARPOS = new JavaPrimitive("stream-%set-charpos", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispStream stream = Lisp.checkCharacterOutputStream(first);
			stream.setCharPos(second.intValue());
			return second;
		}
	};

	// ### make-two-way-stream input-stream output-stream => two-way-stream
	private static Primitive MAKE_TWO_WAY_STREAM = new JavaPrimitive(LispSymbols.MAKE_TWO_WAY_STREAM,
			"input-stream output-stream") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final LispStream in = Lisp.checkStream(first);
			final LispStream out = Lisp.checkStream(second);
			if (!in.isInputStream())
				return Lisp.type_error(in, Lisp.list(LispSymbols.SATISFIES, LispSymbols.INPUT_STREAM_P));
			if (!out.isOutputStream())
				return Lisp.type_error(out, Lisp.list(LispSymbols.SATISFIES, LispSymbols.OUTPUT_STREAM_P));
			return new TwoWayStream(in, out);
		}
	};

	// ### two-way-stream-input-stream two-way-stream => input-stream
	private static Primitive TWO_WAY_STREAM_INPUT_STREAM = new JavaPrimitive(LispSymbols.TWO_WAY_STREAM_INPUT_STREAM,
			"two-way-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof TwoWayStream)
				return ((TwoWayStream) arg).in;
			return Lisp.type_error(arg, LispSymbols.TWO_WAY_STREAM);
		}
	};

	// ### two-way-stream-output-stream two-way-stream => output-stream
	private static Primitive TWO_WAY_STREAM_OUTPUT_STREAM = new JavaPrimitive(LispSymbols.TWO_WAY_STREAM_OUTPUT_STREAM,
			"two-way-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof TwoWayStream)
				return ((TwoWayStream) arg).out;
			return Lisp.type_error(arg, LispSymbols.TWO_WAY_STREAM);
		}
	};

	// ### stream-external-format
	private static Primitive STREAM_EXTERNAL_FORMAT = new stream_external_format();

	// ### listen
	private static Primitive LISTEN = new listen();

	// ### input-stream-p
	private static Primitive INPUT_STREAM_P = new input_stream_p();

	// ### interactive-stream-p
	private static Primitive INTERACTIVE_STREAM_P = new interactive_stream_p();

	// ### open-stream-p
	private static Primitive OPEN_STREAM_P = new open_stream_p();

	// ### output-stream-p
	private static Primitive OUTPUT_STREAM_P = new output_stream_p();

	// ### stream-element-type
	private static Primitive STREAM_ELEMENT_TYPE = new stream_element_type();

	// ### make-fill-pointer-output-stream string => string-stream
	private static Primitive MAKE_FILL_POINTER_OUTPUT_STREAM = new JavaPrimitive("make-fill-pointer-output-stream",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ComplexString) {
				ComplexString string = (ComplexString) arg;
				if (string.getFillPointer() >= 0)
					return new FillPointerOutputStream(string);
			}
			return Lisp.type_error(arg, Lisp.list(LispSymbols.AND, LispSymbols.STRING,
					Lisp.list(LispSymbols.SATISFIES, LispSymbols.ARRAY_HAS_FILL_POINTER_P)));
		}
	};

	// ### make-file-stream pathname namestring element-type direction if-exists
	// external-format => stream
	private static Primitive MAKE_FILE_STREAM = new JavaPrimitive("make-file-stream", Lisp.PACKAGE_SYS, true,
			"pathname namestring element-type direction if-exists external-format") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth)

		{
			final Pathname pathname;
			if (first instanceof Pathname)
				pathname = (Pathname) first;
			else
				return Lisp.type_error(first, LispSymbols.PATHNAME);
			if (pathname.isJar())
				Lisp.error(new FileError("Direct stream input/output on entries in JAR files no currently supported.",
						pathname));

			final SubLObject namestring = Lisp.checkString(second);
			SubLObject elementType = third;
			SubLObject direction = fourth;
			SubLObject ifExists = fifth;
			SubLObject externalFormat = sixth;

			if (direction != Keyword.INPUT && direction != Keyword.OUTPUT && direction != Keyword.IO)
				Lisp.error(new LispError("Direction must be :INPUT, :OUTPUT, or :IO."));
			try {
				return new FileStream(pathname, namestring.getString(), elementType, direction, ifExists,
						externalFormat);
			} catch (FileNotFoundException e) {
				return Lisp.NIL;
			} catch (IOException e) {
				return Lisp.error(new StreamError(null, e));
			}
		}
	};

	// ### make-echo-stream
	// input-stream output-stream => echo-stream
	private static Primitive MAKE_ECHO_STREAM = new JavaPrimitive("make-echo-stream", "input-stream output-stream") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (!(first instanceof LispStream))
				return Lisp.type_error(first, LispSymbols.STREAM);
			if (!(second instanceof LispStream))
				return Lisp.type_error(second, LispSymbols.STREAM);
			return new EchoStream((LispStream) first, (LispStream) second);
		}
	};

	// ### echo-stream-input-stream
	// echo-stream => input-stream
	private static Primitive ECHO_STREAM_INPUT_STREAM = new JavaPrimitive("echo-stream-input-stream", "echo-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof EchoStream)
				return ((EchoStream) arg).getInputStream();
			return Lisp.type_error(arg, LispSymbols.ECHO_STREAM);
		}
	};

	// ### echo-stream-output-stream
	// echo-stream => output-stream
	private static Primitive ECHO_STREAM_OUTPUT_STREAM = new JavaPrimitive("echo-stream-output-stream", "echo-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof EchoStream)
				return ((EchoStream) arg).getOutputStream();
			return Lisp.type_error(arg, LispSymbols.ECHO_STREAM);
		}
	};

	// ### make-broadcast-stream &rest streams => broadcast-stream
	private static Primitive MAKE_BROADCAST_STREAM = new JavaPrimitive("make-broadcast-stream", "&rest streams") {

		public SubLObject execute() {
			return new BroadcastStream(new LispStream[0]);
		}

		public SubLObject execute(SubLObject[] args) {
			LispStream[] streams = new LispStream[args.length];
			for (int i = 0; i < args.length; i++)
				if (args[i] instanceof LispStream) {
					if (((LispStream) args[i]).isOutputStream()) {
						streams[i] = (LispStream) args[i];
						continue;
					} else
						return Lisp.error(
								new TypeError(args[i], Lisp.list(LispSymbols.SATISFIES, LispSymbols.OUTPUT_STREAM_P)));
				} else
					return Lisp.error(new TypeError(args[i], LispSymbols.STREAM));
			// All is well.
			return new BroadcastStream(streams);
		}
	};

	// ### broadcast-stream-streams broadcast-stream => streams
	private static Primitive BROADCAST_STREAM_STREAMS = new JavaPrimitive("broadcast-stream-streams",
			"broadcast-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof BroadcastStream) {
				BroadcastStream stream = (BroadcastStream) arg;
				LispStream[] streams = stream.streams;
				SubLObject result = Lisp.NIL;
				for (int i = streams.length; i-- > 0;)
					result = LispObjectFactory.makeCons(streams[i], result);
				return result;
			}
			return Lisp.error(new TypeError(arg, LispSymbols.BROADCAST_STREAM));
		}
	};

	// ### %make-byte-array-output-stream
	// %make-byte-array-output-stream &optional element-type =>
	// byte-array-output-stream
	private static Primitive MAKE_BYTE_ARRAY_OUTPUT_STREAM = new JavaPrimitive("%make-byte-array-output-stream",
			Lisp.PACKAGE_SYS, false, "&optional element-type") {

		public SubLObject execute() {
			return new ByteArrayOutputStream();
		}

		public SubLObject execute(SubLObject arg) {
			return new ByteArrayOutputStream(arg);
		}
	};

	// ### %get-output-stream-bytes
	// %get-output-stream-bytes byte-array-output-stream => java-byte-array
	private static Primitive GET_OUTPUT_STREAM_BYTES = new JavaPrimitive("%get-output-stream-bytes", Lisp.PACKAGE_SYS,
			false, "byte-array-output-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ByteArrayOutputStream)
				return ABCLJavaObject.makeJavaObject(((ByteArrayOutputStream) arg).getByteArray());
			return Lisp.error(new TypeError(this, LispSymbols.STREAM)); // TODO
		}
	};

	private static Primitive GET_OUTPUT_STREAM_ARRAY = new JavaPrimitive("%get-output-stream-array", Lisp.PACKAGE_SYS,
			false, "byte-array-output-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ByteArrayOutputStream)
				return new BasicVector_UnsignedByte8(((ByteArrayOutputStream) arg).getByteArray());

			return Lisp.error(new TypeError(this, LispSymbols.STREAM)); // TODO
		}
	};

	// ### make-case-frob-stream target => case-frob-stream
	private static Primitive MAKE_CASE_FROB_STREAM = new JavaPrimitive("make-case-frob-stream", Lisp.PACKAGE_SYS, false,
			"target kind") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispStream target = Lisp.checkCharacterOutputStream(first);
			if (second == Keyword.UPCASE)
				return new UpcaseStream(target);
			if (second == Keyword.DOWNCASE)
				return new DowncaseStream(target);
			if (second == Keyword.CAPITALIZE)
				return new CapitalizeStream(target);
			if (second == Keyword.CAPITALIZE_FIRST)
				return new CapitalizeFirstStream(target);
			return Lisp.error(new TypeError("Kind must be :UPCASE, :DOWNCASE, :CAPITALIZE or :CAPITALIZE-FIRST."));
		}
	};

	// ### make-concatenated-stream &rest streams => concatenated-stream
	private static Primitive MAKE_CONCATENATED_STREAM = new JavaPrimitive("make-concatenated-stream", "&rest streams") {

		public SubLObject execute(SubLObject[] args) {
			SubLObject streams = Lisp.NIL;
			for (int i = 0; i < args.length; i++) {
				if (args[i] instanceof LispStream) {
					LispStream stream = (LispStream) args[i];
					if (stream.isInputStream()) {
						// streams[i] = (Stream) args[i];
						streams = LispObjectFactory.makeCons(stream, streams);
						continue;
					}
				}
				SubLObject o = args[i];
				Lisp.error(new TypeError(o == null ? "#<NULL>" : o.writeToString() + " is not an input stream."));
			}
			return new ConcatenatedStream(streams.nreverse());
		}
	};

	// ### concatenated-stream-streams concatenated-stream => streams
	private static Primitive CONCATENATED_STREAM_STREAMS = new JavaPrimitive("concatenated-stream-streams",
			"concatenated-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ConcatenatedStream)
				return ((ConcatenatedStream) arg).streams;
			return Lisp.error(new TypeError(arg, LispSymbols.CONCATENATED_STREAM));
		}
	};

	// ### %make-slime-output-stream
	// %make-slime-output-stream function => stream
	private static Primitive MAKE_SLIME_OUTPUT_STREAM = new JavaPrimitive("make-slime-output-stream", Lisp.PACKAGE_EXT,
			true, "function") {

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
	private static Primitive MAKE_SLIME_INPUT_STREAM = new JavaPrimitive("make-slime-input-stream", Lisp.PACKAGE_EXT,
			true, "function output-stream") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final Function fun;
			final LispStream os;
			if (first instanceof SubLSymbol)
				fun = (Function) first.getSymbolFunction();
			else
				fun = (Function) first;
			os = Lisp.checkCharacterOutputStream(second);
			return new SlimeInputStream(fun, os);
		}
	};

	// ### make-synonym-stream symbol => synonym-stream
	private static Primitive MAKE_SYNONYM_STREAM = new JavaPrimitive("make-synonym-stream", "symbol") {

		public SubLObject execute(SubLObject arg) {
			return new SynonymStream(Lisp.checkSymbol(arg));
		}
	};

	// ### synonym-stream-symbol synonym-stream => symbol
	private static Primitive SYNONYM_STREAM_STREAMS = new JavaPrimitive("synonym-stream-symbol", "synonym-stream") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SynonymStream)
				return ((SynonymStream) arg).symbol;
			return Lisp.error(new TypeError(arg, LispSymbols.SYNONYM_STREAM));
		}
	};

	static SubLObject finishOutput(SubLObject arg)

	{
		final SubLObject out;
		if (arg == Lisp.T)
			out = LispSymbols.TERMINAL_IO.symbolValue();
		else if (arg == Lisp.NIL)
			out = LispSymbols.STANDARD_OUTPUT.symbolValue();
		else
			out = arg;
		return Lisp.checkStream(out).finishOutput();
	}
}
