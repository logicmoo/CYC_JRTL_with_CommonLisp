/***
 * Copyright (c) 1995-2009 Cycorp Inc. Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. Substantial portions of this code were developed by the Cyc project and by Cycorp Inc, whose contribution is gratefully acknowledged.
 */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;

import org.armedbear.lisp.Keyword;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSynonymStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
//// Internal Imports
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

//// External Imports
public class StreamsLow extends SubLSystemTrampolineFile {
	public static SubLObject isMemoryMappedStream(SubLObject stream) {
		if (!stream.isStream())
			return SubLNil.NIL;
		return stream.getStream(true).isMemoryMapped() ? CommonSymbols.RET_T : SubLNil.NIL;
	}

	public static SubLObject open(SubLObject fileSpec, SubLObject[] keys) {
		String fileSpecTyped = fileSpec.getFileDesignator();
		if (keys.length % 2 == 1)
			Errors.error("Need an even number of arguments to OPEN.");
		SubLSymbol direction = CommonSymbols.INPUT_KEYWORD;
		SubLSymbol elementType = Keyword.TEXT_KEYWORD_CHARACTER;
		SubLSymbol ifExists = CommonSymbols.ERROR_KEYWORD;
		SubLSymbol ifNotExists = CommonSymbols.ERROR_KEYWORD;
		for (int i = 0, size = keys.length; i < size; i += 2) {
			SubLObject curKey = keys[i];
			SubLObject curVal = keys[i + 1];
			if (curKey == CommonSymbols.DIRECTION_KEYWORD)
				direction = (SubLSymbol) curVal;
			else if (curKey == CommonSymbols.ELEMENT_TYPE_KEYWORD)
				elementType = (SubLSymbol) curVal;
			else if (curKey == CommonSymbols.IF_EXISTS_KEYWORD)
				ifExists = (SubLSymbol) curVal;
			else if (curKey == CommonSymbols.IF_DOES_NOT_EXIST_KEYWORD)
				ifNotExists = (SubLSymbol) curVal;
			else if (curKey != CommonSymbols.EXTERNAL_FORMAT_KEYWORD)
				Errors.error("OPEN got unexpected parameter " + curKey + ".");
		}
		SubLStream result = SubLStreamFactory.makeFileStream(fileSpecTyped, direction, elementType, ifExists, ifNotExists, SubLNil.NIL);
		if (result == null)
			return SubLNil.NIL;
		return result;
	}

	public static SubLObject wide_newline_stream_p(SubLObject stream) {
		return stream.getStream(true).getNewline().length() > 1 ? CommonSymbols.RET_T : SubLNil.NIL;
	}

	public static SubLFile me;
	public static SubLSymbol $terminal_io$;
	public static SubLSymbol $standard_input$;
	public static SubLSymbol $standard_output$;
	public static SubLSymbol $error_output$;
	public static SubLSymbol $debug_io$;
	public static SubLSymbol $null_input$;
	public static SubLSymbol $null_output$;
	public static SubLSymbol $query_io$;
	public static SubLSymbol $trace_output$;
	public static SubLSymbol $stream_initial_input_buffer_size$;
	public static SubLSymbol $stream_initial_output_buffer_size$;
	public static SubLSymbol $should_memory_map_files$;
	public static SubLInputTextStream originalInputStream;
	public static SubLOutputTextStream originalOutputStream;
	public static SubLOutputTextStream originalErrorStream;
	public static SubLSynonymStream originalSynInputStream;
	public static SubLSynonymStream originalSynOutputStream;
	public static SubLSynonymStream originalSynErrorStream;
	public static SubLInOutTextStream originalIOStream;
	static {
		me = new StreamsLow();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(StreamsLow.me, "open", "OPEN", 1, 0, true);
		SubLFiles.declareFunction(StreamsLow.me, "wide_newline_stream_p", "WIDE-NEWLINE-STREAM-P", 1, 0, false);
		SubLFiles.declareFunction(StreamsLow.me, "isMemoryMappedStream", "MEMORY-MAPPED-STREAM-P", 1, 0, false);
	}

	@Override
	public void initializeVariables() {
		/*		StreamsLow.originalInputStream =  SubLStreamFactory.makeInputTextStream(System.in);
				StreamsLow.originalOutputStream = SubLStreamFactory.makeOutputTextStream(System.out);
				StreamsLow.originalErrorStream = SubLStreamFactory.makeOutputTextStream(System.err);*/
		StreamsLow.originalInputStream = SubLStreamFactory.makeInputTextStream(System.in);
		StreamsLow.originalOutputStream = SubLStreamFactory.makeOutputTextStream(System.out);
		StreamsLow.originalErrorStream = SubLStreamFactory.makeOutputTextStream(System.err);

		SubLInOutTextStream ioStream = SubLStreamFactory.makeInOutTextStream(StreamsLow.originalInputStream, StreamsLow.originalOutputStream);
		(StreamsLow.originalIOStream = ioStream).setIsInteractive(true);
		StreamsLow.$terminal_io$ = SubLFiles.defProcessVar(StreamsLow.me, "*TERMINAL-IO*", ioStream);
		SubLSynonymStream ioSynonymStream = SubLStreamFactory.makeUnclosableSynonymStream(CommonSymbols.TERMINAL_IO);
		SubLSynonymStream ioSynonymStream2 = SubLStreamFactory.makeUnclosableSynonymStream(CommonSymbols.TERMINAL_IO);
		SubLSynonymStream ioSynonymStream3 = SubLStreamFactory.makeUnclosableSynonymStream(CommonSymbols.TERMINAL_IO);
		SubLSynonymStream ioSynonymStream4 = SubLStreamFactory.makeUnclosableSynonymStream(CommonSymbols.TERMINAL_IO);
		SubLSynonymStream ioSynonymStream5 = SubLStreamFactory.makeUnclosableSynonymStream(CommonSymbols.TERMINAL_IO);
		SubLSynonymStream ioSynonymStream6 = SubLStreamFactory.makeUnclosableSynonymStream(CommonSymbols.TERMINAL_IO);
		StreamsLow.originalSynInputStream = ioSynonymStream;
		StreamsLow.originalSynOutputStream = ioSynonymStream2;
		StreamsLow.originalSynErrorStream = ioSynonymStream3;
		$standard_input$ = SubLFiles.defProcessVar(StreamsLow.me, "*STANDARD-INPUT*", ioSynonymStream);
		$standard_output$ = SubLFiles.defProcessVar(StreamsLow.me, "*STANDARD-OUTPUT*", ioSynonymStream2);
		StreamsLow.$error_output$ = SubLFiles.defProcessVar(StreamsLow.me, "*ERROR-OUTPUT*", ioSynonymStream3);
		StreamsLow.originalErrorStream = StreamsLow.$error_output$.getValue().toOutputTextStream();
		StreamsLow.$debug_io$ = SubLFiles.defvar(StreamsLow.me, "*DEBUG-IO*", ioSynonymStream4);
		StreamsLow.$null_input$ = SubLFiles.defvar(StreamsLow.me, "*NULL-INPUT*", SubLStreamFactory.NULL_IN_STREAM);
		StreamsLow.$null_output$ = SubLFiles.defvar(StreamsLow.me, "*NULL-OUTPUT*", SubLStreamFactory.NULL_OUT_STREAM);
		StreamsLow.$query_io$ = SubLFiles.defvar(StreamsLow.me, "*QUERY-IO*", ioSynonymStream5);
		StreamsLow.$trace_output$ = SubLFiles.defvar(StreamsLow.me, "*TRACE-OUTPUT*", ioSynonymStream6);
		StreamsLow.$stream_initial_input_buffer_size$ = SubLFiles.defvar(StreamsLow.me, "*STREAM-INITIAL-INPUT-BUFFER-SIZE*", SubLObjectFactory.makeInteger(16384));
		StreamsLow.$stream_initial_output_buffer_size$ = SubLFiles.defvar(StreamsLow.me, "*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*", SubLObjectFactory.makeInteger(16384));
		StreamsLow.$should_memory_map_files$ = SubLFiles.defvar(StreamsLow.me, "*SHOULD-MEMORY-MAP-FILES?*", SubLNil.NIL);
		Object o1 = $standard_output$.getValue(), o2 = $standard_output$.getDynamicValue(), o3 = $standard_output$.toLispObject().symbolValue(), o4 = NIL.toOutputTextStream();
		$standard_output$.toLispObject().setProcessScope(true);
		$standard_input$.toLispObject().setProcessScope(true);
		assert o1 == o2;
		assert o1 == o3;
		assert o1 == o4;
	}

	@Override
	public void runTopLevelForms() {
	}
}
