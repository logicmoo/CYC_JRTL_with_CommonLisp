/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class streams_high extends SubLTrampolineFile {

	//// Constructor

	public static SubLFile me = new streams_high();

	public static int EOF_CHAR = -1;

	//// Definitions

	public static SubLObject broadcast_stream_streams(SubLObject stream) {
		return stream.getStream(true).getStreams();
	}

	public static SubLObject clear_input(SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getValue();
		if (stream instanceof SubLInputTextStream) {
			SubLInputTextStream streamTyped = stream.toInputTextStream();
			while (streamTyped.ready())
				streamTyped.readChar();
		} else if (stream instanceof SubLInputBinaryStream) {
			SubLInputBinaryStream streamTyped = stream.toInputBinaryStream();
			while (streamTyped.numBytesAvailable() > 0)
				streamTyped.read();
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject clear_output(SubLObject stream) {
		return streams_high.force_output(stream);// @note is this right??? -APB
	}

	public static SubLObject close(SubLObject stream, SubLObject abort) {
		stream.enforceType(CommonSymbols.STREAMP);
		SubLStream streamTyped = stream.getStream(false);
		boolean isOpen = !streamTyped.isClosed();
		SubLObject result = isOpen ? CommonSymbols.T : (SubLObject) CommonSymbols.NIL;
		if (isOpen)
			streamTyped.close();
		return result;
	}

	public static SubLObject declare_streams_high_file() {
		SubLFiles.declareFunction(streams_high.me, "stream_p", "STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "stream_direction", "STREAM-DIRECTION", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "stream_element_type", "STREAM-ELEMENT-TYPE", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "open_stream_p", "OPEN-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "input_stream_p", "INPUT-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "output_stream_p", "OUTPUT-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "open_input_stream_p", "OPEN-INPUT-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "open_output_stream_p", "OPEN-OUTPUT-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "interactive_stream_p", "INTERACTIVE-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "close", "CLOSE", 1, 1, false);
		SubLFiles.declareFunction(streams_high.me, "get_output_stream_string", "GET-OUTPUT-STREAM-STRING", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "listen", "LISTEN", 0, 1, false);

		SubLFiles.declareFunction(streams_high.me, "read_byte", "READ-BYTE", 1, 2, false);
		SubLFiles.declareFunction(streams_high.me, "read_char", "READ-CHAR", 0, 4, false);
		SubLFiles.declareFunction(streams_high.me, "read_byte_sequence_into_string", "READ-BYTE-SEQUENCE-INTO-STRING",
				1, 3, false);
		SubLFiles.declareFunction(streams_high.me, "write_string_to_byte_sequence", "WRITE-STRING-TO-BYTE-SEQUENCE", 1,
				3, false);
		/* SubLFiles.declareFunction(streams_high.me, "read_byte_sequence_to_positive_integer",
				"READ-BYTE-SEQUENCE-TO-POSITIVE-INTEGER", 1, 3, false);*/
		SubLFiles.declareFunction(streams_high.me, "write_positive_integer_as_byte_sequence",
				"WRITE-POSITIVE-INTEGER-AS-BYTE-SEQUENCE", 2, 2, false);
		SubLFiles.declareFunction(streams_high.me, "read_char_no_hang", "READ-CHAR-NO-HANG", 0, 4, false);
		SubLFiles.declareFunction(streams_high.me, "unread_char", "UNREAD-CHAR", 1, 1, false);
		SubLFiles.declareFunction(streams_high.me, "unread_byte", "UNREAD-BYTE", 2, 0, false);
		SubLFiles.declareFunction(streams_high.me, "read_line", "READ-LINE", 0, 4, false);
		SubLFiles.declareFunction(streams_high.me, "peek_char", "PEEK-CHAR", 0, 5, false);
		SubLFiles.declareFunction(streams_high.me, "clear_input", "CLEAR-INPUT", 0, 1, false);
		SubLFiles.declareFunction(streams_high.me, "read_sequence", "READ-SEQUENCE", 2, 2, false);

		SubLFiles.declareFunction(streams_high.me, "write_byte", "WRITE-BYTE", 2, 0, false);
		SubLFiles.declareFunction(streams_high.me, "write_char", "WRITE-CHAR", 1, 1, false);
		SubLFiles.declareFunction(streams_high.me, "write_string", "WRITE-STRING", 1, 3, false);
		SubLFiles.declareFunction(streams_high.me, "write_line", "WRITE-LINE", 1, 3, false);
		SubLFiles.declareFunction(streams_high.me, "terpri", "TERPRI", 0, 1, false);
		SubLFiles.declareFunction(streams_high.me, "fresh_line", "FRESH-LINE", 0, 1, false);
		SubLFiles.declareFunction(streams_high.me, "finish_output", "FINISH-OUTPUT", 0, 1, false);
		SubLFiles.declareFunction(streams_high.me, "force_output", "FORCE-OUTPUT", 0, 1, false);
		SubLFiles.declareFunction(streams_high.me, "clear_output", "CLEAR-OUTPUT", 0, 1, false);
		SubLFiles.declareFunction(streams_high.me, "file_length", "FILE-LENGTH", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "file_position", "FILE-POSITION", 1, 1, false);
		SubLFiles.declareFunction(streams_high.me, "write_sequence", "WRITE-SEQUENCE", 2, 2, false);

		SubLFiles.declareFunction(streams_high.me, "make_string_input_stream", "MAKE-STRING-INPUT-STREAM", 1, 2, false);
		SubLFiles.declareFunction(streams_high.me, "make_string_output_stream", "MAKE-STRING-OUTPUT-STREAM", 0, 0,
				false);
		SubLFiles.declareFunction(streams_high.me, "make_private_string_output_stream",
				"MAKE-PRIVATE-STRING-OUTPUT-STREAM", 0, 0, false);
		SubLFiles.declareFunction(streams_high.me, "make_private_string_input_stream",
				"MAKE-PRIVATE-STRING-INPUT-STREAM", 1, 2, false);
		SubLFiles.declareFunction(streams_high.me, "make_broadcast_stream", "MAKE-BROADCAST-STREAM", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "make_private_broadcast_stream", "MAKE-PRIVATE-BROADCAST-STREAM", 1,
				0, false);
		SubLFiles.declareFunction(streams_high.me, "broadcast_stream_streams", "BROADCAST-STREAM-STREAMS", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "make_synonym_stream", "MAKE-SYNONYM-STREAM", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "make_private_synonym_stream", "MAKE-PRIVATE-SYNONYM-STREAM", 1, 0,
				false);
		SubLFiles.declareFunction(streams_high.me, "synonym_stream_symbol", "SYNONYM-STREAM-SYMBOL", 1, 0, false);
		SubLFiles.declareFunction(streams_high.me, "follow_synonym_stream", "FOLLOW-SYNONYM-STREAM", 1, 0, false);

		/*
		 * SubLFiles.declareFunction(me, "make_descriptor_stream",
		 * "MAKE-DESCRIPTOR-STREAM", 3, 0, false); SubLFiles.declareFunction(me,
		 * "make_private_descriptor_stream", "MAKE-PRIVATE-DESCRIPTOR-STREAM",
		 * 3, 0, false);
		 *
		 * SubLFiles.declareFunction(me, "make_two_way_stream",
		 * "MAKE-TWO-WAY-STREAM", 2, 0, false); SubLFiles.declareFunction(me,
		 * "make_private_two_way_stream", "MAKE-PRIVATE-TWO-WAY-STREAM", 2, 0,
		 * false); SubLFiles.declareFunction(me, "two_way_stream_input_stream",
		 * "TWO-WAY-STREAM-INPUT-STREAM", 1, 0, false);
		 * SubLFiles.declareFunction(me, "two_way_stream_output_stream",
		 * "TWO-WAY-STREAM-OUTPUT-STREAM", 1, 0, false);
		 *
		 * SubLFiles.declareFunction(me, "make_echo_stream", "MAKE-ECHO-STREAM",
		 * 2, 0, false); SubLFiles.declareFunction(me,
		 * "make_private_echo_stream", "MAKE-PRIVATE-ECHO-STREAM", 2, 0, false);
		 * SubLFiles.declareFunction(me, "echo_stream_input_stream",
		 * "ECHO-STREAM-INPUT-STREAM", 1, 0, false);
		 * SubLFiles.declareFunction(me, "echo_stream_output_stream",
		 * "ECHO-STREAM-OUTPUT-STREAM", 1, 0, false);
		 *
		 * SubLFiles.declareFunction(me, "make_concatenated_stream",
		 * "MAKE-CONCATENATED-STREAM", 1, 0, false);
		 * SubLFiles.declareFunction(me, "make_private_concatenated_stream",
		 * "MAKE-PRIVATE-CONCATENATED-STREAM", 1, 0, false);
		 * SubLFiles.declareFunction(me, "concatenated_stream_streams",
		 * "CONCATENATED-STREAM-STREAMS", 1, 0, false);
		 *
		 * SubLFiles.declareFunction(me, "file_string_length",
		 * "FILE-STRING-LENGTH", 2, 0, false);
		 */
		return CommonSymbols.NIL;
	}

	public static SubLObject file_length(SubLObject stream) {
		long result = stream.getStream(true).length();
		return SubLObjectFactory.makeInteger(result);
	}

	public static SubLObject file_position(SubLObject stream, SubLObject position_spec) {
		SubLStream streamTyped = stream.getStream(true);
		if (position_spec == CommonSymbols.UNPROVIDED) {
			long result = streamTyped.getFilePointer();
			return SubLObjectFactory.makeInteger(result);
		}
		long positionTyped = 0;
		if (position_spec == CommonSymbols.START_KEYWORD) {
		} else if (position_spec == CommonSymbols.END_KEYWORD)
			positionTyped = streamTyped.length();
		else
			positionTyped = position_spec.longValue();
		streamTyped.seek(positionTyped);
		boolean result = streamTyped.getFilePointer() == positionTyped;
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject finish_output(SubLObject stream) {
		return streams_high.force_output(stream);
	}

	public static SubLObject follow_synonym_stream(SubLObject stream) {
		return stream.getStream(true);
	}

	public static SubLObject force_output(SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		stream.toOutputStream().flush();
		return CommonSymbols.NIL;
	}

	public static SubLObject fresh_line(SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		SubLOutputTextStream streamTyped = stream.toOutputTextStream();
		if (streamTyped.freshLine())
			return CommonSymbols.NIL;
		else {
			streams_high.terpri(stream);
			return CommonSymbols.T;
		}
	}

	public static SubLObject get_output_stream_string(SubLObject stream) {
		return SubLObjectFactory.makeString(stream.toOutputTextStream().getStringOutput());
	}

	public static SubLObject init_streams_high_file() {
		return CommonSymbols.NIL;
	}

	public static SubLObject input_stream_p(SubLObject stream) {
		return stream.getStream(true) instanceof SubLInputStream ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject interactive_stream_p(SubLObject stream) {
		boolean result = stream.getStream(true).isInteractive();
		return SubLObjectFactory.makeBoolean(result);
	}

	/* */
	public static SubLObject listen(SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED) {
			// stream = StreamsLow.$standard_input$.getValue();
		}
		SubLInputStream streamTyped = stream.toInputStream();
		if (streamTyped.getElementType() == CommonSymbols.BINARY_KEYWORD) {
			SubLInputBinaryStream inStream = (SubLInputBinaryStream) streamTyped;
			long result = inStream.numBytesAvailable();
			return SubLObjectFactory.makeBoolean(result > 0);
		} else {
			SubLInputTextStream inStream = (SubLInputTextStream) streamTyped;
			boolean result = inStream.ready();
			return SubLObjectFactory.makeBoolean(result);
		}
	}

	public static SubLObject make_broadcast_stream(SubLObject streams) {
		return SubLStreamFactory.makeBroadcastStream(streams.toList());
	}

	public static SubLObject make_private_broadcast_stream(SubLObject streams) {
		SubLObject stream = CommonSymbols.NIL;
		SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
		try {
			Dynamic.bind(stream_macros.$stream_requires_locking$, CommonSymbols.NIL);
			stream = streams_high.make_broadcast_stream(streams);
		} finally {
			Dynamic.rebind(stream_macros.$stream_requires_locking$, oldValue);
		}
		return stream;
	}

	public static SubLObject make_private_string_input_stream(SubLObject string, SubLObject start, SubLObject end) {
		SubLObject stream = CommonSymbols.NIL;
		SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
		try {
			Dynamic.bind(stream_macros.$stream_requires_locking$, CommonSymbols.NIL);
			stream = streams_high.make_string_input_stream(string, start, end);
		} finally {
			Dynamic.rebind(stream_macros.$stream_requires_locking$, oldValue);
		}
		return stream;
	}

	public static SubLObject make_private_string_output_stream() {
		SubLObject stream = CommonSymbols.NIL;
		SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
		try {
			Dynamic.bind(stream_macros.$stream_requires_locking$, CommonSymbols.NIL);
			stream = streams_high.make_string_output_stream();
		} finally {
			Dynamic.rebind(stream_macros.$stream_requires_locking$, oldValue);
		}
		return stream;
	}

	public static SubLObject make_private_synonym_stream(SubLObject symbol) {
		SubLObject stream = CommonSymbols.NIL;
		SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
		try {
			Dynamic.bind(stream_macros.$stream_requires_locking$, CommonSymbols.NIL);
			stream = streams_high.make_synonym_stream(symbol);
		} finally {
			Dynamic.rebind(stream_macros.$stream_requires_locking$, oldValue);
		}
		return stream;
	}

	public static SubLObject make_string_input_stream(SubLObject string, SubLObject start, SubLObject end) {
		String stringTyped = string.getString();
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEndUsingSize(end, string);
		SubLInputStream result = SubLStreamFactory.makeStringInputStream(stringTyped, startTyped, endTyped);
		return result;
	}

	public static SubLObject make_string_output_stream() {
		return SubLStreamFactory.makeStringOutputStream();
	}

	public static SubLObject make_synonym_stream(SubLObject symbol) {
		return SubLStreamFactory.makeSynonymStream(symbol.toSymbol());
	}

	public static SubLObject open_input_stream_p(SubLObject stream) {
		if (!stream.isStream())
			return CommonSymbols.NIL;
		SubLStream streamTyped = stream.getStream(true);
		boolean result = streamTyped instanceof SubLInputStream && !streamTyped.isClosed();
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject open_output_stream_p(SubLObject stream) {
		if (!stream.isStream())
			return CommonSymbols.NIL;
		SubLStream streamTyped = stream.getStream(true);
		boolean result = streamTyped instanceof SubLOutputStream && !streamTyped.isClosed();
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject open_stream_p(SubLObject stream) {
		boolean result = !stream.getStream(true).isClosed();
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject output_stream_p(SubLObject stream) {
		return stream.getStream(true) instanceof SubLOutputStream ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject peek_char(SubLObject peek_type, SubLObject stream, SubLObject eof_error_p,
			SubLObject eof_value, SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (peek_type == CommonSymbols.UNPROVIDED)
			peek_type = CommonSymbols.NIL;
		SubLInputTextStream streamTyped = stream.toInputTextStream();
		SubLObject result = null;
		if (peek_type == CommonSymbols.NIL)
			result = streams_high.peekChar(streamTyped, eof_error_p, eof_value);
		else if (peek_type == CommonSymbols.T)
			result = streams_high.peekCharSkippingWS(streamTyped, eof_error_p, eof_value);
		else {
			char peek_typeTyped = peek_type.charValue();
			result = streams_high.peekCharSkippingChar(peek_typeTyped, streamTyped, eof_error_p, eof_value);
		}
		return result;
	}

	private static SubLObject peekChar(SubLInputTextStream stream, SubLObject eof_error_p, SubLObject eof_value) {
		int theChar = stream.readChar();
		if (theChar != streams_high.EOF_CHAR)
			stream.unread(theChar);
		else if (eof_error_p != CommonSymbols.NIL) {
			reader.end_of_file_error(stream);
			return CommonSymbols.NIL;
		} else
			return eof_value;
		SubLCharacter result = SubLObjectFactory.makeChar(theChar);
		return result;
	}

	private static SubLObject peekCharSkippingChar(int charToSkip, SubLInputTextStream stream, SubLObject eof_error_p,
			SubLObject eof_value) {
		int theChar;
		do
			theChar = stream.readChar();
		while (theChar == charToSkip);
		if (theChar != streams_high.EOF_CHAR)
			stream.unread(theChar);
		else if (eof_error_p != CommonSymbols.NIL) {
			reader.end_of_file_error(stream);
			return CommonSymbols.NIL;
		} else
			return eof_value;
		SubLCharacter result = SubLObjectFactory.makeChar(theChar);
		return result;
	}

	private static SubLObject peekCharSkippingWS(SubLInputTextStream stream, SubLObject eof_error_p,
			SubLObject eof_value) {
		int theChar;
		do
			theChar = stream.readChar();
		while (Character.isWhitespace((char) theChar));
		if (theChar != streams_high.EOF_CHAR)
			stream.unread(theChar);
		else if (eof_error_p != CommonSymbols.NIL) {
			reader.end_of_file_error(stream);
			return CommonSymbols.NIL;
		} else
			return eof_value;
		SubLCharacter result = SubLObjectFactory.makeChar(theChar);
		return result;
	}

	public static SubLObject read_byte(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		int theByte = stream.toInputBinaryStream().read();
		if (theByte == streams_high.EOF_CHAR)
			if (eof_error_p == CommonSymbols.UNPROVIDED || eof_error_p != CommonSymbols.NIL) {
				reader.end_of_file_error(stream);
				return CommonSymbols.NIL;
			} else
				return eof_value == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : eof_value;
		return SubLNumberFactory.makeSmallInteger(theByte);
	}

	public static SubLObject read_byte_sequence_into_string(SubLObject string, SubLObject stream,
			SubLObject eof_error_p, SubLObject eof_value) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		int theByte = stream.toInputBinaryStream().readByteSequenceToString(string.toStr());
		if (theByte == streams_high.EOF_CHAR)
			if (eof_error_p == CommonSymbols.UNPROVIDED || eof_error_p != CommonSymbols.NIL) {
				reader.end_of_file_error(stream);
				return CommonSymbols.NIL;
			} else
				return eof_value == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : eof_value;
		return string;
	}

	public static SubLObject read_byte_sequence_to_positive_integer(SubLObject byteCount, SubLObject stream,
			SubLObject eof_error_p, SubLObject eof_value, SubLObject networkByteOrder) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		if (networkByteOrder == CommonSymbols.UNPROVIDED)
			networkByteOrder = CommonSymbols.NIL;
		int byteCountVal = byteCount.intValue();
		boolean useNetworkByteOrder = networkByteOrder != CommonSymbols.NIL;
		long positiveInteger = 0L;
		try {
			positiveInteger = stream.toInputBinaryStream().readByteSequenceToPositiveInteger(byteCountVal,
					useNetworkByteOrder);
		} catch (RuntimeException re) {
			if (!re.getMessage().equals("EOF"))
				throw re;
			if (eof_error_p == CommonSymbols.UNPROVIDED || eof_error_p != CommonSymbols.NIL) {
				reader.end_of_file_error(stream);
				return CommonSymbols.NIL;
			}
			return eof_value == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : eof_value;
		}
		if (positiveInteger < 0L) {
			int offset = 64;
			byte[] array = new byte[9];
			array[0] = 0;
			int n = 1;
			long n2 = positiveInteger;
			offset -= 8;
			array[n] = (byte) (n2 >>> offset & 0xFFL);
			int n3 = 2;
			long n4 = positiveInteger;
			offset -= 8;
			array[n3] = (byte) (n4 >>> offset & 0xFFL);
			int n5 = 3;
			long n6 = positiveInteger;
			offset -= 8;
			array[n5] = (byte) (n6 >>> offset & 0xFFL);
			int n7 = 4;
			long n8 = positiveInteger;
			offset -= 8;
			array[n7] = (byte) (n8 >>> offset & 0xFFL);
			int n9 = 5;
			long n10 = positiveInteger;
			offset -= 8;
			array[n9] = (byte) (n10 >>> offset & 0xFFL);
			int n11 = 6;
			long n12 = positiveInteger;
			offset -= 8;
			array[n11] = (byte) (n12 >>> offset & 0xFFL);
			int n13 = 7;
			long n14 = positiveInteger;
			offset -= 8;
			array[n13] = (byte) (n14 >>> offset & 0xFFL);
			int n15 = 8;
			long n16 = positiveInteger;
			offset -= 8;
			array[n15] = (byte) (n16 >>> offset & 0xFFL);
			BigInteger newPosInt = new BigInteger(array);
			newPosInt = newPosInt.abs();
			return SubLNumberFactory.makeInteger(newPosInt);
		}
		return SubLNumberFactory.makeInteger(positiveInteger);
	}

	public static SubLObject read_char(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursive_p) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		int theByte = stream.toInputTextStream().readChar();
		if (theByte == streams_high.EOF_CHAR)
			if (eof_error_p == CommonSymbols.UNPROVIDED || eof_error_p != CommonSymbols.NIL) {
				reader.end_of_file_error(stream);
				return CommonSymbols.NIL;
			} else
				return eof_value == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : eof_value;
		return SubLCharacter.makeChar(theByte);
	}

	public static SubLObject read_char_no_hang(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursive_p) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		SubLInputTextStream streamTyped = stream.toInputTextStream();
		if (!streamTyped.ready())
			return CommonSymbols.NIL;
		int theByte = streamTyped.readChar();
		if (theByte == streams_high.EOF_CHAR)
			if (eof_error_p != CommonSymbols.NIL) {
				reader.end_of_file_error(stream);
				return CommonSymbols.NIL;
			} else
				return eof_value;
		return SubLCharacter.makeChar(theByte);
	}

	public static SubLObject read_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursive_p) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getValue();
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		SubLInputTextStream streamTyped = stream.toInputTextStream();
		StringBuilder buf = new StringBuilder(256); // @todo resource this
		String eolChars = streamTyped.getNewline();
		int eolCharsSize = eolChars.length();
		int currentChar = 0, i, j;
		boolean isEOL = false;
		while (currentChar != streams_high.EOF_CHAR) { // EOF
			currentChar = streamTyped.readChar();
			if (currentChar == streams_high.EOF_CHAR)
				break;
			if (currentChar != streams_high.EOF_CHAR)
				buf.append((char) currentChar);
			isEOL = true;
			for (i = buf.length() - 1, j = eolCharsSize - 1; j >= 0 && i >= 0; i--, j--)
				if (buf.charAt(i) != eolChars.charAt(j))
					isEOL = false;
			isEOL = isEOL && j < 0;
			if (isEOL)
				break;
		}
		if (buf.length() <= 0 && currentChar == streams_high.EOF_CHAR) { // EOF
			if (eof_error_p != CommonSymbols.NIL)
				reader.end_of_file_error(stream);
			return Values.values(eof_value, CommonSymbols.T);
		}
		String result = isEOL ? buf.substring(0, buf.length() - eolCharsSize) : buf.toString();
		return Values.values(SubLObjectFactory.makeString(result),
				SubLObjectFactory.makeBoolean(currentChar == streams_high.EOF_CHAR));
	}

	/*
	 * @todo this should boil down to calls in the class hierarchy for
	 * subclasses of sequence
	 */
	public static SubLObject read_sequence(SubLObject sequence, SubLObject stream, SubLObject start, SubLObject end) {
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEndUsingSize(end, sequence);
		if (startTyped < 0)
			Errors.error("Got invalid start index: " + startTyped);
		if (endTyped < 0)
			Errors.error("Got invalid end index: " + endTyped);
		if (endTyped < startTyped)
			Errors.error("Got end index which is too small: " + endTyped);
		SubLInputTextStream inputTextStream = null;
		SubLInputBinaryStream inputBinaryStream = null;
		SubLStream sublstream = stream.getStream(true);
		if (!(sublstream instanceof SubLInputStream))
			Errors.error("read-sequence called with a non-readable stream: " + stream);
		if (sublstream instanceof SubLInputTextStream)
			inputTextStream = stream.toInputTextStream();
		if (sublstream instanceof SubLInputBinaryStream)
			inputBinaryStream = stream.toInputBinaryStream();
		if (!sequence.isString() || inputTextStream == null) {
			SubLSequence seq = sequence.toSeq();
			if (seq.isArrayBased()) {
				int i = startTyped;
				for (int size = seq.size(); i < size && i < endTyped; i++) {
					int cur = inputTextStream != null ? inputTextStream.readChar() : inputBinaryStream.read();
					if (cur < 0)
						return SubLObjectFactory.makeInteger(i);
					seq.set(i,
							inputTextStream != null ? SubLCharacter.makeChar(cur) : SubLObjectFactory.makeInteger(cur));
				}
				return SubLObjectFactory.makeInteger(i);
			} else {
				int i = startTyped;
				for (SubLList curList = seq.toList().nthCdr(startTyped).toList(); curList != SubLNil.NIL
						&& i < endTyped; curList = curList.rest().toList()) {
					SubLCons cons = curList.toCons();
					int cur = inputTextStream != null ? inputTextStream.readChar() : inputBinaryStream.read();
					if (cur < 0)
						return SubLObjectFactory.makeInteger(i);
					i++;
					cons.setFirst(
							inputTextStream != null ? SubLCharacter.makeChar(cur) : SubLObjectFactory.makeInteger(cur));
				}
				return SubLObjectFactory.makeInteger(i);
			}
		}
		SubLString str = sequence.toStr();
		int position = inputTextStream.readChar(str.toCharArray(), startTyped, endTyped - startTyped);
		return SubLObjectFactory.makeInteger(position);
	}

	public static SubLObject setup_streams_high_file() {
		return CommonSymbols.NIL;
	}

	public static SubLObject stream_direction(SubLObject stream) {
		return stream.getStream(true).getDirection();
	}

	public static SubLObject stream_element_type(SubLObject stream) {
		return stream.getStream(true).getElementType();
	}

	public static SubLObject stream_input_index(SubLObject stream) {
		return SubLNumberFactory.makeInteger(stream.toInputStream().getInputIndex());
	}

	public static SubLObject stream_line_column(SubLObject stream) {
		Errors.unimplementedMethod("STREAM-LINE-COLUMN");
		return CommonSymbols.NIL;
	}

	public static SubLObject stream_p(SubLObject possibleStream) {
		return SubLObjectFactory.makeBoolean(possibleStream.isStream());
	}

	public static SubLObject synonym_stream_symbol(SubLObject stream) {
		return stream.getStream(false).getStreamSymbol();
	}

	public static SubLObject terpri(SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		SubLOutputTextStream streamTyped = stream.toOutputTextStream();
		streamTyped.writeNewline();
		return CommonSymbols.NIL;
	}

	public static SubLObject unread_byte(SubLObject thebyte, SubLObject stream) {
		stream.toInputBinaryStream().unread(thebyte.intValue());
		return CommonSymbols.NIL;
	}

	public static SubLObject unread_char(SubLObject character, SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		stream.toInputTextStream().unread(character.toChar().getChar());
		return CommonSymbols.NIL;
	}

	public static SubLObject write_byte(SubLObject theByte, SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		stream.toOutputBinaryStream().write(theByte.intValue());
		return theByte;
	}

	public static SubLObject write_char(SubLObject character, SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		stream.toOutputTextStream().writeChar(character.charValue());
		return character;
	}

	public static SubLObject write_line(SubLObject string, SubLObject stream, SubLObject start, SubLObject end) {
		streams_high.writeString(string, stream, start, end, true);
		return string;
	}

	public static SubLObject write_positive_integer_as_byte_sequence(SubLObject positiveInteger, SubLObject byteCount,
			SubLObject stream, SubLObject networkByteOrder) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		if (networkByteOrder == CommonSymbols.UNPROVIDED)
			networkByteOrder = CommonSymbols.NIL;
		int byteCountVal = byteCount.intValue();
		boolean useNetworkByteOrder = networkByteOrder != CommonSymbols.NIL;
		long positiveIntegerVal = positiveInteger.longValue();
		stream.toOutputBinaryStream().writePositiveIntegerAsByteSequence(positiveIntegerVal, byteCountVal,
				useNetworkByteOrder);
		return positiveInteger;
	}

	public static SubLObject write_sequence(SubLObject sequence, SubLObject stream, SubLObject start, SubLObject end) {
		Errors.unimplementedMethod("WRITE-SEQUENCE");
		return CommonSymbols.NIL;
		/*
		 * if ((start == UNPROVIDED)) { start = ZERO_INTEGER; } if ((end ==
		 * UNPROVIDED)) { end = NIL; } { SubLObject length =
		 * Sequences.length(sequence); if ((!(SubLNil.toBool(start)))) { start =
		 * ZERO_INTEGER; } if ((!(SubLNil.toBool(end)))) { end = length; } if
		 * ((!(SubLNil.toBool(Errors.$ignore_mustsP$.getValue())))) { if
		 * ((!(SubLNil.toBool(Numbers.numGE(start, ZERO_INTEGER))))) {
		 * Errors.error($constants[93], start, sequence); } } if
		 * ((!(SubLNil.toBool(Errors.$ignore_mustsP$.getValue())))) { if
		 * ((!(SubLNil.toBool(Numbers.numLE(end, length))))) {
		 * Errors.error($constants[94], end, sequence, length); } } if
		 * ((!(SubLNil.toBool(Errors.$ignore_mustsP$.getValue())))) { if
		 * ((!(SubLNil.toBool(Numbers.numLE(start, end))))) {
		 * Errors.error($constants[95], start, sequence, end); } }
		 * stream_write_sequence(stream, sequence, start, end); } return
		 * sequence;
		 */
	}

	public static SubLObject write_string(SubLObject string, SubLObject stream) {
		streams_high.writeString(string, stream, CommonSymbols.ZERO_INTEGER,
				SubLNumberFactory.makeInteger(string.toStr().length()), false);
		return string;
	}

	public static SubLObject write_string(SubLObject string, SubLObject stream, SubLObject start, SubLObject end) {
		streams_high.writeString(string, stream, start, end, false);
		return string;
	}

	public static SubLObject write_string_to_byte_sequence(SubLObject string, SubLObject stream, SubLObject offset,
			SubLObject length) {
		SubLString str = string.toStr();
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		int off = offset == CommonSymbols.UNPROVIDED ? 0 : offset.intValue();
		int len = length == CommonSymbols.UNPROVIDED ? str.size() : length.intValue();
		if (off + len > str.size())
			len = str.size() - off;
		byte[] data = SubLProcess.currentSubLThread().byteBufferLarge;
		if (data.length < len)
			data = new byte[len];
		for (int j = 0, i = off; j < len; data[j++] = (byte) str.charAt(i++)) {
		}
		stream.toOutputBinaryStream().write(data, 0, len);
		return string;
	}

	public static void writeString(String string, SubLOutputTextStream stream) {
		streams_high.writeString(string, stream, 0, string.length(), false);
	}

	/*
	 * public static SubLObject output_stream_designator_stream(SubLObject
	 * object) { if (SubLNil.toBool(Equality.eq(object, T))) { return
	 * StreamsLow.$terminal_io$.getValue(); } else if
	 * (SubLNil.toBool(Equality.eq(object, NIL))) { return
	 * StreamsLow.$standard_output$.getValue(); } else if
	 * ((SubLNil.toBool(Types.streamp(object)) &&
	 * SubLNil.toBool(streams_high.output_stream_p(object)))) { return object; }
	 * else { Errors.error($constants[76], object); } return NIL; }
	 *
	 * public static SubLObject input_stream_designator_stream(SubLObject
	 * object) { if (SubLNil.toBool(Equality.eq(object, T))) { return
	 * StreamsLow.$terminal_io$.getValue(); } else if
	 * (SubLNil.toBool(Equality.eq(object, NIL))) { return
	 * StreamsLow.$standard_input$.getValue(); } else if
	 * ((SubLNil.toBool(Types.streamp(object)) &&
	 * SubLNil.toBool(streams_high.input_stream_p(object)))) { return object; }
	 * else { Errors.error($constants[77], object); } return NIL; }
	 *
	 *
	 * public static SubLObject make_descriptor_stream(SubLObject descriptor,
	 * SubLObject direction, SubLObject element_type) { if
	 * ((!(SubLNil.toBool(Errors.$ignore_mustsP$.getValue())))) { if
	 * ((!(SubLNil.toBool(conses_high.member(direction, $constants[82],
	 * UNPROVIDED, UNPROVIDED))))) { Errors.error($constants[83], direction); }
	 * } if ((!(SubLNil.toBool(Errors.$ignore_mustsP$.getValue())))) { if
	 * ((!(SubLNil.toBool(conses_high.member(element_type, $constants[84],
	 * UNPROVIDED, UNPROVIDED))))) { Errors.error($constants[85], element_type);
	 * } } { SubLObject stream = make_stream(UNPROVIDED);
	 * initialize_stream_lock(stream); _csetf_stream_stream_type(stream,
	 * $constants[54]); _csetf_stream_direction(stream, direction);
	 * _csetf_stream_element_type(stream, element_type);
	 * _csetf_stream_open_p(stream, T); _csetf_stream_handle(stream,
	 * descriptor); if ((SubLNil.toBool(Equality.eq(direction, $constants[56]))
	 * || SubLNil.toBool(Equality.eq(direction, $constants[86])))) {
	 * _csetf_stream_input_buffer(stream,
	 * Strings.make_string($stream_initial_input_buffer_size$.getValue(),
	 * UNPROVIDED)); _csetf_stream_input_index(stream, ZERO_INTEGER);
	 * _csetf_stream_input_limit(stream, ZERO_INTEGER); } if
	 * ((SubLNil.toBool(Equality.eq(direction, $constants[87])) ||
	 * SubLNil.toBool(Equality.eq(direction, $constants[86])))) {
	 * _csetf_stream_column(stream, ZERO_INTEGER);
	 * _csetf_stream_output_buffer(stream,
	 * Strings.make_string($stream_initial_output_buffer_size$.getValue(),
	 * UNPROVIDED)); _csetf_stream_output_index(stream, ZERO_INTEGER);
	 * _csetf_stream_output_limit(stream,
	 * $stream_initial_output_buffer_size$.getValue()); } return stream; } }
	 *
	 * public static SubLObject make_private_descriptor_stream(SubLObject
	 * descriptor, SubLObject direction, SubLObject element_type) { { SubLObject
	 * stream = NIL; try { Dynamic.bind(stream_macros.$stream_requires_locking$,
	 * NIL); stream = make_descriptor_stream(descriptor, direction,
	 * element_type); } finally {
	 * Dynamic.rebind(stream_macros.$stream_requires_locking$); } return stream;
	 * } }
	 *
	 * public static SubLObject make_two_way_stream(SubLObject input_stream,
	 * SubLObject output_stream) { input_stream.checkType(((SubLSymbol)
	 * $constants[90])); // INPUT-STREAM-P output_stream.checkType(((SubLSymbol)
	 * $constants[89])); // OUTPUT-STREAM-P { SubLObject stream =
	 * make_stream(UNPROVIDED); initialize_stream_lock(stream);
	 * _csetf_stream_stream_type(stream, $constants[65]);
	 * _csetf_stream_direction(stream, $constants[86]);
	 * _csetf_stream_components(stream, ConsesLow.cons(input_stream,
	 * output_stream)); _csetf_stream_open_p(stream, T);
	 * _csetf_stream_column(stream, ZERO_INTEGER); return stream; } }
	 *
	 * public static SubLObject make_private_two_way_stream(SubLObject
	 * input_stream, SubLObject output_stream) { { SubLObject stream = NIL; try
	 * { Dynamic.bind(stream_macros.$stream_requires_locking$, NIL); stream =
	 * streams_high.make_two_way_stream(input_stream, output_stream); } finally
	 * { Dynamic.rebind(stream_macros.$stream_requires_locking$); } return
	 * stream; } }
	 *
	 * public static SubLObject two_way_stream_input_stream(SubLObject stream) {
	 * stream_check_type(stream, $constants[65]); return
	 * ConsesLow.car(stream_components(stream)); }
	 *
	 * public static SubLObject two_way_stream_output_stream(SubLObject stream)
	 * { stream_check_type(stream, $constants[65]); return
	 * ConsesLow.cdr(stream_components(stream)); }
	 *
	 * public static SubLObject make_echo_stream(SubLObject input_stream,
	 * SubLObject output_stream) { input_stream.checkType(((SubLSymbol)
	 * $constants[90])); // INPUT-STREAM-P output_stream.checkType(((SubLSymbol)
	 * $constants[89])); // OUTPUT-STREAM-P { SubLObject stream =
	 * make_stream(UNPROVIDED); initialize_stream_lock(stream);
	 * _csetf_stream_stream_type(stream, $constants[62]);
	 * _csetf_stream_direction(stream, $constants[86]);
	 * _csetf_stream_open_p(stream, T); _csetf_stream_components(stream,
	 * ConsesLow.cons(input_stream, output_stream));
	 * _csetf_stream_column(stream, ZERO_INTEGER); return stream; } }
	 *
	 * public static SubLObject make_private_echo_stream(SubLObject
	 * input_stream, SubLObject output_stream) { { SubLObject stream = NIL; try
	 * { Dynamic.bind(stream_macros.$stream_requires_locking$, NIL); stream =
	 * streams_high.make_echo_stream(input_stream, output_stream); } finally {
	 * Dynamic.rebind(stream_macros.$stream_requires_locking$); } return stream;
	 * } }
	 *
	 * public static SubLObject echo_stream_input_stream(SubLObject stream) {
	 * stream_check_type(stream, $constants[62]); return
	 * ConsesLow.car(stream_components(stream)); }
	 *
	 * public static SubLObject echo_stream_output_stream(SubLObject stream) {
	 * stream_check_type(stream, $constants[62]); return
	 * ConsesLow.cdr(stream_components(stream)); }
	 *
	 * public static SubLObject make_concatenated_stream(SubLObject streams) { {
	 * SubLObject cdolist_list_var = streams; SubLObject stream = NIL; for
	 * (stream = conses_high.first(cdolist_list_var);
	 * (!(SubLNil.toBool(Types.sublisp_null(cdolist_list_var))));
	 * cdolist_list_var = conses_high.rest(cdolist_list_var), stream =
	 * conses_high.first(cdolist_list_var)) { stream.checkType(((SubLSymbol)
	 * $constants[90])); // INPUT-STREAM-P } } { SubLObject stream =
	 * make_stream(UNPROVIDED); initialize_stream_lock(stream);
	 * _csetf_stream_stream_type(stream, $constants[63]);
	 * _csetf_stream_direction(stream, $constants[56]);
	 * _csetf_stream_open_p(stream, T); _csetf_stream_components(stream,
	 * conses_high.copy_list(streams)); _csetf_stream_column(stream,
	 * ZERO_INTEGER); return stream; } }
	 *
	 * public static SubLObject make_private_concatenated_stream(SubLObject
	 * streams) { { SubLObject stream = NIL; try {
	 * Dynamic.bind(stream_macros.$stream_requires_locking$, NIL); stream =
	 * streams_high.make_concatenated_stream(streams); } finally {
	 * Dynamic.rebind(stream_macros.$stream_requires_locking$); } return stream;
	 * } }
	 *
	 * public static SubLObject concatenated_stream_streams(SubLObject stream) {
	 * stream_check_type(stream, $constants[63]); return
	 * stream_components(stream); }
	 *
	 * public static SubLObject stream_read_sequence(SubLObject stream,
	 * SubLObject sequence, SubLObject start, SubLObject end) {
	 * stream.checkType(((SubLSymbol) $constants[99])); // OPEN-INPUT-STREAM-P {
	 * SubLObject result = NIL; SubLObject lock_var = stream_lock(stream); if
	 * (SubLNil.toBool(Types.lock_p(lock_var))) { { SubLObject lock = lock_var;
	 * try { Locks.seize_lock(lock); { SubLObject reader =
	 * (SubLNil.toBool(Equality.eq(streams_high.stream_element_type(stream),
	 * $constants[92])) ? Symbols.symbol_function($constants[104]) :
	 * Symbols.symbol_function($constants[105])); SubLObject next = NIL;
	 * SubLObject i = NIL; for (next = Functions.funcall(reader, stream), i =
	 * start; (!((SubLNil.toBool(Equality.eq(next, $constants[96])) ||
	 * SubLNil.toBool(Numbers.numGE(i, Numbers.subtract(end, start)))))); next =
	 * Functions.funcall(reader, stream), i = Numbers.add(i, ONE_INTEGER)) {
	 * Vectors.set_aref(sequence, i, next); } result = i; } } finally {
	 * Locks.release_lock(lock); } } } else { { SubLObject reader =
	 * (SubLNil.toBool(Equality.eq(streams_high.stream_element_type(stream),
	 * $constants[92])) ? Symbols.symbol_function($constants[104]) :
	 * Symbols.symbol_function($constants[105])); SubLObject next = NIL;
	 * SubLObject i = NIL; for (next = Functions.funcall(reader, stream), i =
	 * start; (!((SubLNil.toBool(Equality.eq(next, $constants[96])) ||
	 * SubLNil.toBool(Numbers.numGE(i, Numbers.subtract(end, start)))))); next =
	 * Functions.funcall(reader, stream), i = Numbers.add(i, ONE_INTEGER)) {
	 * Vectors.set_aref(sequence, i, next); } result = i; } } return result; } }
	 *
	 * public static SubLObject stream_write_sequence(SubLObject stream,
	 * SubLObject sequence, SubLObject start, SubLObject end) {
	 * stream.checkType(((SubLSymbol) $constants[103])); // OPEN-OUTPUT-STREAM-P
	 * { SubLObject lock_var = stream_lock(stream); if
	 * (SubLNil.toBool(Types.lock_p(lock_var))) { { SubLObject lock = lock_var;
	 * try { Locks.seize_lock(lock); { SubLObject writer =
	 * (SubLNil.toBool(Equality.eq(streams_high.stream_element_type(stream),
	 * $constants[92])) ? Symbols.symbol_function($constants[106]) :
	 * Symbols.symbol_function($constants[107])); SubLObject i = NIL; for (i =
	 * ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, Numbers.subtract(end,
	 * start))); i = Numbers.add(i, ONE_INTEGER)) { Functions.funcall(writer,
	 * stream, Sequences.elt(sequence, Numbers.add(start, i))); } } } finally {
	 * Locks.release_lock(lock); } } } else { { SubLObject writer =
	 * (SubLNil.toBool(Equality.eq(streams_high.stream_element_type(stream),
	 * $constants[92])) ? Symbols.symbol_function($constants[106]) :
	 * Symbols.symbol_function($constants[107])); SubLObject i = NIL; for (i =
	 * ZERO_INTEGER; SubLNil.toBool(Numbers.numL(i, Numbers.subtract(end,
	 * start))); i = Numbers.add(i, ONE_INTEGER)) { Functions.funcall(writer,
	 * stream, Sequences.elt(sequence, Numbers.add(start, i))); } } } } return
	 * sequence; }
	 *
	 * public static SubLObject open_stream_p(SubLObject stream) {
	 * stream.checkType(((SubLSymbol) $constants[1])); // STREAM-P { SubLObject
	 * real_stream = (SubLNil.toBool(Equality.eq(stream_stream_type(stream),
	 * $constants[66])) ? follow_synonym_stream(stream) : stream); return
	 * stream_open_p(real_stream); } }
	 *
	 * public static SubLObject stream_file_string_length(SubLObject stream,
	 * SubLObject object) { stream.checkType(((SubLSymbol) $constants[108])); //
	 * OPEN-STREAM-P { SubLObject result = NIL; SubLObject lock_var =
	 * stream_lock(stream); if (SubLNil.toBool(Types.lock_p(lock_var))) { {
	 * SubLObject lock = lock_var; try { Locks.seize_lock(lock); result =
	 * Numbers.add(stream_file_position(stream),
	 * Sequences.length(PrintLow.write_to_string(object, new SubLObject[] {})));
	 * } finally { Locks.release_lock(lock); } } } else { result =
	 * Numbers.add(stream_file_position(stream),
	 * Sequences.length(PrintLow.write_to_string(object, new SubLObject[] {})));
	 * } return result; } }
	 *
	 */

	public static void writeString(String string, SubLOutputTextStream stream, int start, int end, boolean addNewline) {
		stream.writeString(string, start, end - start);
		if (addNewline)
			stream.writeNewline();
	}

	private static void writeString(SubLObject string, SubLObject stream, SubLObject start, SubLObject end,
			boolean addNewline) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		String stringTyped = string.getString();
		SubLOutputTextStream streamTyped = stream.toOutputTextStream();
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEndUsingSize(end, string);
		streamTyped.writeString(stringTyped, startTyped, endTyped - startTyped);
		if (addNewline)
			streamTyped.writeNewline();
	}

	private streams_high() {
	}

	//// Initializers

	public void declareFunctions() {
		streams_high.declare_streams_high_file();
	}

	public void initializeVariables() {
		streams_high.init_streams_high_file();
	}

	public void runTopLevelForms() {
		streams_high.setup_streams_high_file();
	}

}
