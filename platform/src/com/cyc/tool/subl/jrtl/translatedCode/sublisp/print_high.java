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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class print_high extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new print_high();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high";
	@SubL(source = "sublisp/print-high.lisp", position = 570)
	public static SubLSymbol $print_array$ = null;

	//// Definitions

	@SubL(source = "sublisp/print-high.lisp", position = 1786)
	public static SubLSymbol $print_base$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1812)
	public static SubLSymbol $print_case$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1842)
	public static SubLSymbol $print_circle$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1870)
	public static SubLSymbol $print_escape$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1896)
	public static SubLSymbol $print_gensym$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1922)
	public static SubLSymbol $print_length$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1950)
	public static SubLSymbol $print_level$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 1977)
	public static SubLSymbol $print_lines$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2004)
	public static SubLSymbol $print_miser_width$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2037)
	public static SubLSymbol $print_pprint_dispatch$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2074)
	public static SubLSymbol $print_pretty$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2100)
	public static SubLSymbol $print_radix$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2127)
	public static SubLSymbol $print_readably$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2157)
	public static SubLSymbol $print_right_margin$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2191)
	private static SubLSymbol $print_error$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 2272)
	private static SubLSymbol $print_circularities$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 3286)
	private static SubLSymbol $print_circle_table_size$ = null;

	@SubL(source = "sublisp/print-high.lisp", position = 6793)
	public static SubLSymbol $print_object_method_table$ = null;

	public static SubLSymbol $kw0$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");

	public static SubLInteger $int1$64 = SubLObjectFactory.makeInteger(64);

	public static SubLString $str2$__Error_printing__S_ = SubLObjectFactory.makeString("#<Error printing ~S>");

	public static SubLList $list3 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM-VAR"), SubLObjectFactory.makeSymbol("&KEY"),
					SubLObjectFactory.makeSymbol("NEWP")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));

	public static SubLList $list4 = ConsesLow.list(SubLObjectFactory.makeKeyword("NEWP"));

	public static SubLSymbol $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");

	public static SubLSymbol $kw6$NEWP = SubLObjectFactory.makeKeyword("NEWP");

	public static SubLString $str7$TEMP_STREAM = SubLObjectFactory.makeString("TEMP-STREAM");

	public static SubLString $str8$SAVED_STREAM = SubLObjectFactory.makeString("SAVED-STREAM");

	public static SubLString $str9$TABLE = SubLObjectFactory.makeString("TABLE");

	public static SubLString $str10$INFO = SubLObjectFactory.makeString("INFO");

	public static SubLSymbol $sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");

	public static SubLSymbol $sym12$CSETF = SubLObjectFactory.makeSymbol("CSETF");

	public static SubLSymbol $sym13$OUTPUT_STREAM_DESIGNATOR_STREAM = SubLObjectFactory
			.makeSymbol("OUTPUT-STREAM-DESIGNATOR-STREAM");

	public static SubLSymbol $sym14$PIF = SubLObjectFactory.makeSymbol("PIF");

	public static SubLSymbol $sym15$_PRINT_CIRCLE_ = SubLObjectFactory.makeSymbol("*PRINT-CIRCLE*");

	public static SubLSymbol $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");

	public static SubLSymbol $sym17$CDR = SubLObjectFactory.makeSymbol("CDR");

	public static SubLSymbol $sym18$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");

	//// Internal Constants

	public static SubLList $list19 = ConsesLow.list(SubLObjectFactory.makeSymbol("*PRINT-CIRCULARITIES*"));
	public static SubLSymbol $sym20$CAND = SubLObjectFactory.makeSymbol("CAND");
	public static SubLSymbol $sym21$CNOT = SubLObjectFactory.makeSymbol("CNOT");
	public static SubLList $list22 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"),
			SubLObjectFactory.makeSymbol("*PRINT-CIRCLE-TABLE-SIZE*"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), CommonSymbols.EQ)));
	public static SubLList $list23 = ConsesLow
			.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-BROADCAST-STREAM"), CommonSymbols.NIL));
	public static SubLSymbol $sym24$_PRINT_CIRCULARITIES_ = SubLObjectFactory.makeSymbol("*PRINT-CIRCULARITIES*");
	public static SubLSymbol $sym25$CONS = SubLObjectFactory.makeSymbol("CONS");
	public static SubLSymbol $sym26$LIST = SubLObjectFactory.makeSymbol("LIST");
	public static SubLSymbol $sym27$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
	public static SubLSymbol $sym28$LIST_ = SubLObjectFactory.makeSymbol("LIST*");
	public static SubLList $list29 = ConsesLow.list(CommonSymbols.ZERO_INTEGER);
	public static SubLList $list30 = ConsesLow.cons(SubLObjectFactory.makeSymbol("TABLE"),
			SubLObjectFactory.makeSymbol("COUNTER"));
	public static SubLSymbol $sym31$REFERENCED = SubLObjectFactory.makeSymbol("REFERENCED");
	public static SubLString $str32$__D_ = SubLObjectFactory.makeString("#~D=");
	public static SubLString $str33$__D__ = SubLObjectFactory.makeString("#~D# ");
	public static SubLSymbol $sym34$DETECTED = SubLObjectFactory.makeSymbol("DETECTED");
	public static SubLInteger $int35$256 = SubLObjectFactory.makeInteger(256);
	public static SubLString $str36$__ = SubLObjectFactory.makeString("#<");
	public static SubLSymbol $kw37$STREAM = SubLObjectFactory.makeKeyword("STREAM");
	public static SubLSymbol $kw38$BASE = SubLObjectFactory.makeKeyword("BASE");
	public static SubLList $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("ARRAY"),
							SubLObjectFactory.makeSymbol("*PRINT-ARRAY*")),
					SubLObjectFactory.makeSymbol("*PRINT-ARRAY*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("BASE"), SubLObjectFactory.makeSymbol("*PRINT-BASE*")),
					SubLObjectFactory.makeSymbol("*PRINT-BASE*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("CASE"), SubLObjectFactory.makeSymbol("*PRINT-CASE*")),
					SubLObjectFactory.makeSymbol("*PRINT-CASE*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("CIRCLE"),
							SubLObjectFactory.makeSymbol("*PRINT-CIRCLE*")),
					SubLObjectFactory.makeSymbol("*PRINT-CIRCLE*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("ESCAPE"),
							SubLObjectFactory.makeSymbol("*PRINT-ESCAPE*")),
					SubLObjectFactory.makeSymbol("*PRINT-ESCAPE*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("GENSYM"),
							SubLObjectFactory.makeSymbol("*PRINT-GENSYM*")),
					SubLObjectFactory.makeSymbol("*PRINT-GENSYM*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("LENGTH"),
							SubLObjectFactory.makeSymbol("*PRINT-LENGTH*")),
					SubLObjectFactory.makeSymbol("*PRINT-LENGTH*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("LEVEL"),
							SubLObjectFactory.makeSymbol("*PRINT-LEVEL*")),
					SubLObjectFactory.makeSymbol("*PRINT-LEVEL*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("LINES"),
							SubLObjectFactory.makeSymbol("*PRINT-LINES*")),
					SubLObjectFactory.makeSymbol("*PRINT-LINES*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("MISER-WIDTH"),
							SubLObjectFactory.makeSymbol("*PRINT-MISER-WIDTH*")),
					SubLObjectFactory.makeSymbol("*PRINT-MISER-WIDTH*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("PPRINT-DISPATCH"),
							SubLObjectFactory.makeSymbol("*PRINT-PPRINT-DISPATCH*")),
					SubLObjectFactory.makeSymbol("*PRINT-PPRINT-DISPATCH*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("PRETTY"),
							SubLObjectFactory.makeSymbol("*PRINT-PRETTY*")),
					SubLObjectFactory.makeSymbol("*PRINT-PRETTY*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("RADIX"),
							SubLObjectFactory.makeSymbol("*PRINT-RADIX*")),
					SubLObjectFactory.makeSymbol("*PRINT-RADIX*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("READABLY"),
							SubLObjectFactory.makeSymbol("*PRINT-READABLY*")),
					SubLObjectFactory.makeSymbol("*PRINT-READABLY*")),
			ConsesLow.list(
					ConsesLow.list(SubLObjectFactory.makeKeyword("RIGHT-MARGIN"),
							SubLObjectFactory.makeSymbol("*PRINT-RIGHT-MARGIN*")),
					SubLObjectFactory.makeSymbol("*PRINT-RIGHT-MARGIN*")) });
	public static SubLList $list40 = ConsesLow
			.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STREAM"), SubLObjectFactory.makeKeyword("ARRAY"),
					SubLObjectFactory.makeKeyword("BASE"), SubLObjectFactory.makeKeyword("CASE"),
					SubLObjectFactory.makeKeyword("CIRCLE"), SubLObjectFactory.makeKeyword("ESCAPE"),
					SubLObjectFactory.makeKeyword("GENSYM"), SubLObjectFactory.makeKeyword("LENGTH"),
					SubLObjectFactory.makeKeyword("LEVEL"), SubLObjectFactory.makeKeyword("LINES"),
					SubLObjectFactory.makeKeyword("MISER-WIDTH"), SubLObjectFactory.makeKeyword("PPRINT-DISPATCH"),
					SubLObjectFactory.makeKeyword("PRETTY"), SubLObjectFactory.makeKeyword("RADIX"),
					SubLObjectFactory.makeKeyword("READABLY"), SubLObjectFactory.makeKeyword("RIGHT-MARGIN") });
	public static SubLSymbol $kw41$ARRAY = SubLObjectFactory.makeKeyword("ARRAY");
	public static SubLSymbol $kw42$CASE = SubLObjectFactory.makeKeyword("CASE");
	public static SubLSymbol $kw43$CIRCLE = SubLObjectFactory.makeKeyword("CIRCLE");
	public static SubLSymbol $kw44$ESCAPE = SubLObjectFactory.makeKeyword("ESCAPE");
	public static SubLSymbol $kw45$GENSYM = SubLObjectFactory.makeKeyword("GENSYM");
	public static SubLSymbol $kw46$LENGTH = SubLObjectFactory.makeKeyword("LENGTH");
	public static SubLSymbol $kw47$LEVEL = SubLObjectFactory.makeKeyword("LEVEL");
	public static SubLSymbol $kw48$LINES = SubLObjectFactory.makeKeyword("LINES");
	public static SubLSymbol $kw49$MISER_WIDTH = SubLObjectFactory.makeKeyword("MISER-WIDTH");
	public static SubLSymbol $kw50$PPRINT_DISPATCH = SubLObjectFactory.makeKeyword("PPRINT-DISPATCH");
	public static SubLSymbol $kw51$PRETTY = SubLObjectFactory.makeKeyword("PRETTY");
	public static SubLSymbol $kw52$RADIX = SubLObjectFactory.makeKeyword("RADIX");
	public static SubLSymbol $kw53$READABLY = SubLObjectFactory.makeKeyword("READABLY");
	public static SubLSymbol $kw54$RIGHT_MARGIN = SubLObjectFactory.makeKeyword("RIGHT-MARGIN");
	public static SubLString $str55$_S_cannot_be_printed_readably_ = SubLObjectFactory
			.makeString("~S cannot be printed readably.");

	@SubL(source = "sublisp/print-high.lisp", position = 5851)
	public static SubLObject circular_reference_p(SubLObject object, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_circle$.getDynamicValue(thread)
					&& CommonSymbols.NIL == print_high.read_print_eq(object)) {
				SubLObject info = conses_high.assoc(stream, print_high.$print_circularities$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest();
				if (CommonSymbols.NIL != info) {
					SubLObject datum = info;
					SubLObject current = datum;
					SubLObject table = CommonSymbols.NIL;
					SubLObject counter = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list30);
					table = current.first();
					current = current.rest();
					counter = current;
					{
						SubLObject state = Hashtables.gethash(object, table, CommonSymbols.UNPROVIDED);
						if (state == print_high.$sym31$REFERENCED || state.isNumber())
							return CommonSymbols.T;
						else if (state == print_high.$sym34$DETECTED) {
							Hashtables.sethash(object, table, print_high.$sym31$REFERENCED);
							return CommonSymbols.T;
						} else if (CommonSymbols.NIL == counter)
							Hashtables.sethash(object, table, print_high.$sym34$DETECTED);
					}
				}
			}
			return CommonSymbols.NIL;
		}
	}

	public static SubLObject declare_print_high_file() {
		SubLFiles.declareFunction(print_high.myName, "read_print_eq", "READ-PRINT-EQ", 1, 0, false);
		SubLFiles.declareFunction(print_high.myName, "print_error", "PRINT-ERROR", 2, 0, false);
		SubLFiles.declareMacro(print_high.myName, "with_printer_state", "WITH-PRINTER-STATE");
		SubLFiles.declareFunction(print_high.myName, "handle_circularity", "HANDLE-CIRCULARITY", 2, 0, false);
		SubLFiles.declareFunction(print_high.myName, "circular_reference_p", "CIRCULAR-REFERENCE-P", 2, 0, false);
		SubLFiles.declareFunction(print_high.myName, "print_object", "PRINT-OBJECT", 2, 0, false);
		SubLFiles.declareFunction(print_high.myName, "print_object_wrapper", "PRINT-OBJECT-WRAPPER", 2, 0, false);
		SubLFiles.declareFunction(print_high.myName, "really_write", "REALLY-WRITE", 2, 0, false);
		SubLFiles.declareFunction(print_high.myName, "prin1", "PRIN1", 1, 1, false);
		SubLFiles.declareFunction(print_high.myName, "print", "PRINT", 1, 1, false);
		SubLFiles.declareFunction(print_high.myName, "princ", "PRINC", 1, 1, false);
		SubLFiles.declareFunction(print_high.myName, "really_write_to_string", "REALLY-WRITE-TO-STRING", 2, 0, false);
		SubLFiles.declareFunction(print_high.myName, "prin1_to_string", "PRIN1-TO-STRING", 1, 0, false);
		SubLFiles.declareFunction(print_high.myName, "princ_to_string", "PRINC-TO-STRING", 1, 0, false);
		SubLFiles.declareFunction(print_high.myName, "print_not_readable", "PRINT-NOT-READABLE", 2, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-high.lisp", position = 4858)
	public static SubLObject handle_circularity(SubLObject object, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject info = conses_high.assoc(stream, print_high.$print_circularities$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest();
				if (CommonSymbols.NIL != info) {
					SubLObject datum = info;
					SubLObject current = datum;
					SubLObject table = CommonSymbols.NIL;
					SubLObject counter = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list30);
					table = current.first();
					current = current.rest();
					counter = current;
					if (CommonSymbols.NIL != counter) {
						SubLObject state = Hashtables.gethash(object, table, CommonSymbols.UNPROVIDED);
						if (state == print_high.$sym31$REFERENCED) {
							counter = Numbers.add(counter, CommonSymbols.ONE_INTEGER);
							ConsesLow.rplacd(info, counter);
							PrintLow.format(stream, print_high.$str32$__D_, counter);
						} else if (state.isNumber()) {
							PrintLow.format(stream, print_high.$str33$__D__, state);
							return CommonSymbols.NIL;
						}
					} else
						return CommonSymbols.NIL;
				}
			}
			print_high.print_object(object, stream);
			return CommonSymbols.NIL;
		}
	}

	public static SubLObject init_print_high_file() {
		print_high.$print_array$ = SubLFiles.defvar("*PRINT-ARRAY*", CommonSymbols.T);
		print_high.$print_base$ = SubLFiles.defvar("*PRINT-BASE*", CommonSymbols.TEN_INTEGER);
		print_high.$print_case$ = SubLFiles.defvar("*PRINT-CASE*", print_high.$kw0$UPCASE);
		print_high.$print_circle$ = SubLFiles.defvar("*PRINT-CIRCLE*", CommonSymbols.NIL);
		print_high.$print_escape$ = SubLFiles.defvar("*PRINT-ESCAPE*", CommonSymbols.T);
		print_high.$print_gensym$ = SubLFiles.defvar("*PRINT-GENSYM*", CommonSymbols.T);
		print_high.$print_length$ = SubLFiles.defvar("*PRINT-LENGTH*", CommonSymbols.NIL);
		print_high.$print_level$ = SubLFiles.defvar("*PRINT-LEVEL*", CommonSymbols.NIL);
		print_high.$print_lines$ = SubLFiles.defvar("*PRINT-LINES*", CommonSymbols.NIL);
		print_high.$print_miser_width$ = SubLFiles.defvar("*PRINT-MISER-WIDTH*", CommonSymbols.NIL);
		print_high.$print_pprint_dispatch$ = SubLFiles.defvar("*PRINT-PPRINT-DISPATCH*", CommonSymbols.NIL);
		print_high.$print_pretty$ = SubLFiles.defvar("*PRINT-PRETTY*", CommonSymbols.T);
		print_high.$print_radix$ = SubLFiles.defvar("*PRINT-RADIX*", CommonSymbols.NIL);
		print_high.$print_readably$ = SubLFiles.defvar("*PRINT-READABLY*", CommonSymbols.NIL);
		print_high.$print_right_margin$ = SubLFiles.defvar("*PRINT-RIGHT-MARGIN*", CommonSymbols.NIL);
		print_high.$print_error$ = SubLFiles.defvar("*PRINT-ERROR*", CommonSymbols.NIL);
		print_high.$print_circularities$ = SubLFiles.defvar("*PRINT-CIRCULARITIES*", CommonSymbols.NIL);
		print_high.$print_circle_table_size$ = SubLFiles.defparameter("*PRINT-CIRCLE-TABLE-SIZE*", print_high.$int1$64);
		print_high.$print_object_method_table$ = SubLFiles.deflexical("*PRINT-OBJECT-METHOD-TABLE*",
				Vectors.make_vector(print_high.$int35$256, CommonSymbols.NIL));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-high.lisp", position = 9070)
	public static SubLObject prin1(SubLObject object, SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
				try {
					print_high.$print_escape$.bind(CommonSymbols.T, thread);
					print_high.print_object_wrapper(object, stream);
				} finally {
					print_high.$print_escape$.rebind(_prev_bind_0, thread);
				}
			}
			return object;
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 10123)
	public static SubLObject prin1_to_string(SubLObject object) {
		{
			SubLObject result = CommonSymbols.NIL;
			SubLObject stream = CommonSymbols.NIL;
			try {
				stream = streams_high.make_private_string_output_stream();
				print_high.prin1(object, stream);
				result = streams_high.get_output_stream_string(stream);
			} finally {
				{
					SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
					try {
						Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
						streams_high.close(stream, CommonSymbols.UNPROVIDED);
					} finally {
						Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return result;
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 9383)
	public static SubLObject princ(SubLObject object, SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
				SubLObject _prev_bind_1 = print_high.$print_readably$.currentBinding(thread);
				try {
					print_high.$print_escape$.bind(CommonSymbols.NIL, thread);
					print_high.$print_readably$.bind(CommonSymbols.NIL, thread);
					if (object.isString())
						streams_high.write_string(object, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
					else if (object.isChar())
						streams_high.write_char(object, stream);
					else
						print_high.print_object_wrapper(object, stream);
				} finally {
					print_high.$print_readably$.rebind(_prev_bind_1, thread);
					print_high.$print_escape$.rebind(_prev_bind_0, thread);
				}
			}
			return object;
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 10266)
	public static SubLObject princ_to_string(SubLObject object) {
		{
			SubLObject result = CommonSymbols.NIL;
			SubLObject stream = CommonSymbols.NIL;
			try {
				stream = streams_high.make_private_string_output_stream();
				print_high.princ(object, stream);
				result = streams_high.get_output_stream_string(stream);
			} finally {
				{
					SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
					try {
						Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
						streams_high.close(stream, CommonSymbols.UNPROVIDED);
					} finally {
						Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return result;
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 9219)
	public static SubLObject print(SubLObject object, SubLObject stream) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_output$.getDynamicValue();
		streams_high.write_char(Characters.CHAR_newline, stream);
		print_high.prin1(object, stream);
		streams_high.write_char(Characters.CHAR_space, stream);
		return object;
	}

	@SubL(source = "sublisp/print-high.lisp", position = 3588)
	public static SubLObject print_error(SubLObject object, SubLObject stream) {
		PrintLow.format(stream, print_high.$str2$__Error_printing__S_, Types.type_of(object));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-high.lisp", position = 10409)
	public static SubLObject print_not_readable(SubLObject object, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = print_high.$print_readably$.currentBinding(thread);
				try {
					print_high.$print_readably$.bind(CommonSymbols.NIL, thread);
					Errors.error(print_high.$str55$_S_cannot_be_printed_readably_, object);
				} finally {
					print_high.$print_readably$.rebind(_prev_bind_0, thread);
				}
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 6793)
	public static SubLObject print_object(SubLObject object, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject method_function = Structures.method_func(object,
						print_high.$print_object_method_table$.getGlobalValue());
				if (CommonSymbols.NIL != method_function)
					return Functions.funcall(method_function, object, stream);
				if (CommonSymbols.NIL != print_high.$print_readably$.getDynamicValue(thread))
					print_high.print_not_readable(object, stream);
				else {
					SubLObject object_2 = object;
					SubLObject stream_3 = stream;
					streams_high.write_string(print_high.$str36$__, stream_3, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
					PrintLow.write(Types.type_of(object_2), new SubLObject[] { print_high.$kw37$STREAM, stream_3 });
					streams_high.write_char(Characters.CHAR_space, stream_3);
					PrintLow.write(Equality.pointer(object_2), new SubLObject[] { print_high.$kw37$STREAM, stream_3,
							print_high.$kw38$BASE, CommonSymbols.SIXTEEN_INTEGER });
					streams_high.write_char(Characters.CHAR_greater, stream_3);
				}
				return object;
			}
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 6978)
	public static SubLObject print_object_wrapper(SubLObject object, SubLObject stream) {
		if (object.isString())
			print_functions.print_string(object, stream);
		else if (object.isChar())
			print_functions.print_character(object, stream);
		else if (object.isSymbol())
			print_functions.print_symbol(object, stream);
		else if (object.isCons())
			print_functions.print_cons_cells(object, stream);
		else if (object.isInteger())
			print_functions.print_integer(object, stream);
		else if (object.isVector())
			print_functions.print_vector(object, stream);
		else if (object.isHashtable())
			print_functions.print_hashtable(object, stream);
		else if (object.isFunction())
			Functions.print_function(object, stream);
		else if (object.isDouble())
			print_functions.print_flonum(object, stream);
		else
			print_high.print_object(object, stream);
		return object;
	}

	/** T of objects whose printed representation reads as EQ to the object. */
	@SubL(source = "sublisp/print-high.lisp", position = 3331)
	public static SubLObject read_print_eq(SubLObject object) {
		return SubLObjectFactory.makeBoolean(object.isSymbol() || object.isFixnum() || object.isChar());
	}

	@SubL(source = "sublisp/print-high.lisp", position = 7842)
	public static SubLObject really_write(SubLObject object, SubLObject keys) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = keys;
				SubLObject current = datum;
				SubLObject allow_other_keys_p = CommonSymbols.NIL;
				SubLObject rest = current;
				SubLObject bad = CommonSymbols.NIL;
				SubLObject current_4 = CommonSymbols.NIL;
				for (; CommonSymbols.NIL != rest;) {
					cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_high.$list39);
					current_4 = rest.first();
					rest = rest.rest();
					cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_high.$list39);
					if (CommonSymbols.NIL == conses_high.member(current_4, print_high.$list40, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED))
						bad = CommonSymbols.T;
					if (current_4 == print_high.$kw5$ALLOW_OTHER_KEYS)
						allow_other_keys_p = rest.first();
					rest = rest.rest();
				}
				if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
					cdestructuring_bind.cdestructuring_bind_error(datum, print_high.$list39);
				{
					SubLObject stream_tail = cdestructuring_bind.property_list_member(print_high.$kw37$STREAM, current);
					SubLObject stream = CommonSymbols.NIL != stream_tail ? (SubLObject) conses_high.cadr(stream_tail)
							: StreamsLow.$standard_output$.getDynamicValue(thread);
					SubLObject print_arrayX_tail = cdestructuring_bind.property_list_member(print_high.$kw41$ARRAY,
							current);
					{
						SubLObject _prev_bind_0 = print_high.$print_array$.currentBinding(thread);
						try {
							print_high.$print_array$.bind(CommonSymbols.NIL != print_arrayX_tail
									? (SubLObject) conses_high.cadr(print_arrayX_tail)
									: print_high.$print_array$.getDynamicValue(thread), thread);
							{
								SubLObject print_baseX_tail = cdestructuring_bind
										.property_list_member(print_high.$kw38$BASE, current);
								{
									SubLObject _prev_bind_0_5 = print_high.$print_base$.currentBinding(thread);
									try {
										print_high.$print_base$.bind(CommonSymbols.NIL != print_baseX_tail
												? (SubLObject) conses_high.cadr(print_baseX_tail)
												: print_high.$print_base$.getDynamicValue(thread), thread);
										{
											SubLObject print_caseX_tail = cdestructuring_bind
													.property_list_member(print_high.$kw42$CASE, current);
											{
												SubLObject _prev_bind_0_6 = print_high.$print_case$
														.currentBinding(thread);
												try {
													print_high.$print_case$.bind(
															CommonSymbols.NIL != print_caseX_tail
																	? (SubLObject) conses_high.cadr(print_caseX_tail)
																	: print_high.$print_case$.getDynamicValue(thread),
															thread);
													{
														SubLObject print_circleX_tail = cdestructuring_bind
																.property_list_member(print_high.$kw43$CIRCLE, current);
														{
															SubLObject _prev_bind_0_7 = print_high.$print_circle$
																	.currentBinding(thread);
															try {
																print_high.$print_circle$.bind(
																		CommonSymbols.NIL != print_circleX_tail
																				? (SubLObject) conses_high
																						.cadr(print_circleX_tail)
																				: print_high.$print_circle$
																						.getDynamicValue(thread),
																		thread);
																{
																	SubLObject print_escapeX_tail = cdestructuring_bind
																			.property_list_member(
																					print_high.$kw44$ESCAPE, current);
																	{
																		SubLObject _prev_bind_0_8 = print_high.$print_escape$
																				.currentBinding(thread);
																		try {
																			print_high.$print_escape$.bind(
																					CommonSymbols.NIL != print_escapeX_tail
																							? (SubLObject) conses_high
																									.cadr(print_escapeX_tail)
																							: print_high.$print_escape$
																									.getDynamicValue(
																											thread),
																					thread);
																			{
																				SubLObject print_gensymX_tail = cdestructuring_bind
																						.property_list_member(
																								print_high.$kw45$GENSYM,
																								current);
																				{
																					SubLObject _prev_bind_0_9 = print_high.$print_gensym$
																							.currentBinding(thread);
																					try {
																						print_high.$print_gensym$.bind(
																								CommonSymbols.NIL != print_gensymX_tail
																										? (SubLObject) conses_high
																												.cadr(print_gensymX_tail)
																										: print_high.$print_gensym$
																												.getDynamicValue(
																														thread),
																								thread);
																						{
																							SubLObject print_lengthX_tail = cdestructuring_bind
																									.property_list_member(
																											print_high.$kw46$LENGTH,
																											current);
																							{
																								SubLObject _prev_bind_0_10 = print_high.$print_length$
																										.currentBinding(
																												thread);
																								try {
																									print_high.$print_length$
																											.bind(CommonSymbols.NIL != print_lengthX_tail
																													? (SubLObject) conses_high
																															.cadr(print_lengthX_tail)
																													: print_high.$print_length$
																															.getDynamicValue(
																																	thread),
																													thread);
																									{
																										SubLObject print_levelX_tail = cdestructuring_bind
																												.property_list_member(
																														print_high.$kw47$LEVEL,
																														current);
																										{
																											SubLObject _prev_bind_0_11 = print_high.$print_level$
																													.currentBinding(
																															thread);
																											try {
																												print_high.$print_level$
																														.bind(CommonSymbols.NIL != print_levelX_tail
																																? (SubLObject) conses_high
																																		.cadr(print_levelX_tail)
																																: print_high.$print_level$
																																		.getDynamicValue(
																																				thread),
																																thread);
																												{
																													SubLObject print_linesX_tail = cdestructuring_bind
																															.property_list_member(
																																	print_high.$kw48$LINES,
																																	current);
																													{
																														SubLObject _prev_bind_0_12 = print_high.$print_lines$
																																.currentBinding(
																																		thread);
																														try {
																															print_high.$print_lines$
																																	.bind(CommonSymbols.NIL != print_linesX_tail
																																			? (SubLObject) conses_high
																																					.cadr(print_linesX_tail)
																																			: print_high.$print_lines$
																																					.getDynamicValue(
																																							thread),
																																			thread);
																															{
																																SubLObject print_miser_widthX_tail = cdestructuring_bind
																																		.property_list_member(
																																				print_high.$kw49$MISER_WIDTH,
																																				current);
																																{
																																	SubLObject _prev_bind_0_13 = print_high.$print_miser_width$
																																			.currentBinding(
																																					thread);
																																	try {
																																		print_high.$print_miser_width$
																																				.bind(CommonSymbols.NIL != print_miser_widthX_tail
																																						? (SubLObject) conses_high
																																								.cadr(print_miser_widthX_tail)
																																						: print_high.$print_miser_width$
																																								.getDynamicValue(
																																										thread),
																																						thread);
																																		{
																																			SubLObject print_pprint_dispatchX_tail = cdestructuring_bind
																																					.property_list_member(
																																							print_high.$kw50$PPRINT_DISPATCH,
																																							current);
																																			{
																																				SubLObject _prev_bind_0_14 = print_high.$print_pprint_dispatch$
																																						.currentBinding(
																																								thread);
																																				try {
																																					print_high.$print_pprint_dispatch$
																																							.bind(CommonSymbols.NIL != print_pprint_dispatchX_tail
																																									? (SubLObject) conses_high
																																											.cadr(print_pprint_dispatchX_tail)
																																									: print_high.$print_pprint_dispatch$
																																											.getDynamicValue(
																																													thread),
																																									thread);
																																					{
																																						SubLObject print_prettyX_tail = cdestructuring_bind
																																								.property_list_member(
																																										print_high.$kw51$PRETTY,
																																										current);
																																						{
																																							SubLObject _prev_bind_0_15 = print_high.$print_pretty$
																																									.currentBinding(
																																											thread);
																																							try {
																																								print_high.$print_pretty$
																																										.bind(CommonSymbols.NIL != print_prettyX_tail
																																												? (SubLObject) conses_high
																																														.cadr(print_prettyX_tail)
																																												: print_high.$print_pretty$
																																														.getDynamicValue(
																																																thread),
																																												thread);
																																								{
																																									SubLObject print_radixX_tail = cdestructuring_bind
																																											.property_list_member(
																																													print_high.$kw52$RADIX,
																																													current);
																																									{
																																										SubLObject _prev_bind_0_16 = print_high.$print_radix$
																																												.currentBinding(
																																														thread);
																																										try {
																																											print_high.$print_radix$
																																													.bind(CommonSymbols.NIL != print_radixX_tail
																																															? (SubLObject) conses_high
																																																	.cadr(print_radixX_tail)
																																															: print_high.$print_radix$
																																																	.getDynamicValue(
																																																			thread),
																																															thread);
																																											{
																																												SubLObject print_readablyX_tail = cdestructuring_bind
																																														.property_list_member(
																																																print_high.$kw53$READABLY,
																																																current);
																																												{
																																													SubLObject _prev_bind_0_17 = print_high.$print_readably$
																																															.currentBinding(
																																																	thread);
																																													try {
																																														print_high.$print_readably$
																																																.bind(CommonSymbols.NIL != print_readablyX_tail
																																																		? (SubLObject) conses_high
																																																				.cadr(print_readablyX_tail)
																																																		: print_high.$print_readably$
																																																				.getDynamicValue(
																																																						thread),
																																																		thread);
																																														{
																																															SubLObject print_right_marginX_tail = cdestructuring_bind
																																																	.property_list_member(
																																																			print_high.$kw54$RIGHT_MARGIN,
																																																			current);
																																															{
																																																SubLObject _prev_bind_0_18 = print_high.$print_right_margin$
																																																		.currentBinding(
																																																				thread);
																																																try {
																																																	print_high.$print_right_margin$
																																																			.bind(CommonSymbols.NIL != print_right_marginX_tail
																																																					? (SubLObject) conses_high
																																																							.cadr(print_right_marginX_tail)
																																																					: print_high.$print_right_margin$
																																																							.getDynamicValue(
																																																									thread),
																																																					thread);
																																																	print_high
																																																			.print_object_wrapper(
																																																					object,
																																																					stream);
																																																} finally {
																																																	print_high.$print_right_margin$
																																																			.rebind(_prev_bind_0_18,
																																																					thread);
																																																}
																																															}
																																														}
																																													} finally {
																																														print_high.$print_readably$
																																																.rebind(_prev_bind_0_17,
																																																		thread);
																																													}
																																												}
																																											}
																																										} finally {
																																											print_high.$print_radix$
																																													.rebind(_prev_bind_0_16,
																																															thread);
																																										}
																																									}
																																								}
																																							} finally {
																																								print_high.$print_pretty$
																																										.rebind(_prev_bind_0_15,
																																												thread);
																																							}
																																						}
																																					}
																																				} finally {
																																					print_high.$print_pprint_dispatch$
																																							.rebind(_prev_bind_0_14,
																																									thread);
																																				}
																																			}
																																		}
																																	} finally {
																																		print_high.$print_miser_width$
																																				.rebind(_prev_bind_0_13,
																																						thread);
																																	}
																																}
																															}
																														} finally {
																															print_high.$print_lines$
																																	.rebind(_prev_bind_0_12,
																																			thread);
																														}
																													}
																												}
																											} finally {
																												print_high.$print_level$
																														.rebind(_prev_bind_0_11,
																																thread);
																											}
																										}
																									}
																								} finally {
																									print_high.$print_length$
																											.rebind(_prev_bind_0_10,
																													thread);
																								}
																							}
																						}
																					} finally {
																						print_high.$print_gensym$
																								.rebind(_prev_bind_0_9,
																										thread);
																					}
																				}
																			}
																		} finally {
																			print_high.$print_escape$
																					.rebind(_prev_bind_0_8, thread);
																		}
																	}
																}
															} finally {
																print_high.$print_circle$.rebind(_prev_bind_0_7,
																		thread);
															}
														}
													}
												} finally {
													print_high.$print_case$.rebind(_prev_bind_0_6, thread);
												}
											}
										}
									} finally {
										print_high.$print_base$.rebind(_prev_bind_0_5, thread);
									}
								}
							}
						} finally {
							print_high.$print_array$.rebind(_prev_bind_0, thread);
						}
					}
				}
			}
			return object;
		}
	}

	@SubL(source = "sublisp/print-high.lisp", position = 9798)
	public static SubLObject really_write_to_string(SubLObject object, SubLObject keys) {
		{
			SubLObject result = CommonSymbols.NIL;
			SubLObject key_set = CommonSymbols.NIL;
			SubLObject stream = CommonSymbols.NIL;
			try {
				stream = streams_high.make_private_string_output_stream();
				key_set = ConsesLow.cons(stream, keys);
				key_set = ConsesLow.cons(print_high.$kw37$STREAM, key_set);
				print_high.really_write(object, key_set);
				result = streams_high.get_output_stream_string(stream);
			} finally {
				{
					SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
					try {
						Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
						streams_high.close(stream, CommonSymbols.UNPROVIDED);
					} finally {
						Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return result;
		}
	}

	public static SubLObject setup_print_high_file() {
		// CVS_ID("Id: print-high.lisp 126640 2008-12-04 13:39:36Z builder ");
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-high.lisp", position = 3696)
	public static SubLObject with_printer_state(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list3);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream_var = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list3);
					stream_var = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = CommonSymbols.NIL;
						SubLObject rest = current;
						SubLObject bad = CommonSymbols.NIL;
						SubLObject current_1 = CommonSymbols.NIL;
						for (; CommonSymbols.NIL != rest;) {
							cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_high.$list3);
							current_1 = rest.first();
							rest = rest.rest();
							cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_high.$list3);
							if (CommonSymbols.NIL == conses_high.member(current_1, print_high.$list4,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
								bad = CommonSymbols.T;
							if (current_1 == print_high.$kw5$ALLOW_OTHER_KEYS)
								allow_other_keys_p = rest.first();
							rest = rest.rest();
						}
						if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
							cdestructuring_bind.cdestructuring_bind_error(datum, print_high.$list3);
						{
							SubLObject newp_tail = cdestructuring_bind.property_list_member(print_high.$kw6$NEWP,
									current);
							SubLObject newp = CommonSymbols.NIL != newp_tail ? (SubLObject) conses_high.cadr(newp_tail)
									: CommonSymbols.NIL;
							current = temp;
							{
								SubLObject body = current;
								SubLObject temp_stream = Symbols.make_symbol(print_high.$str7$TEMP_STREAM);
								SubLObject saved_stream = Symbols.make_symbol(print_high.$str8$SAVED_STREAM);
								SubLObject table = Symbols.make_symbol(print_high.$str9$TABLE);
								SubLObject info = Symbols.make_symbol(print_high.$str10$INFO);
								return ConsesLow.list(print_high.$sym11$PROGN,
										ConsesLow.list(print_high.$sym12$CSETF, stream_var,
												ConsesLow.list(print_high.$sym13$OUTPUT_STREAM_DESIGNATOR_STREAM,
														stream_var)),
										ConsesLow.list(print_high.$sym14$PIF, print_high.$sym15$_PRINT_CIRCLE_,
												ConsesLow.list(print_high.$sym16$CLET, ConsesLow.list(ConsesLow.list(
														info,
														ConsesLow.list(print_high.$sym17$CDR,
																ConsesLow.listS(print_high.$sym18$ASSOC, stream_var,
																		print_high.$list19)))),
														ConsesLow.list(print_high.$sym14$PIF,
																ConsesLow.list(print_high.$sym20$CAND, info,
																		ConsesLow.list(print_high.$sym21$CNOT, newp)),
																reader.bq_cons(print_high.$sym11$PROGN,
																		ConsesLow.append(body, CommonSymbols.NIL)),
																ConsesLow.list(print_high.$sym16$CLET, ConsesLow.list(
																		reader.bq_cons(table, print_high.$list22),
																		ConsesLow.list(saved_stream, stream_var),
																		reader.bq_cons(temp_stream,
																				print_high.$list23)),
																		ConsesLow.list(print_high.$sym16$CLET,
																				ConsesLow.list(ConsesLow.list(
																						print_high.$sym24$_PRINT_CIRCULARITIES_,
																						ConsesLow.listS(
																								print_high.$sym25$CONS,
																								ConsesLow.list(
																										print_high.$sym26$LIST,
																										temp_stream,
																										table),
																								print_high.$list19))),
																				ConsesLow.list(
																						print_high.$sym27$CUNWIND_PROTECT,
																						ConsesLow.listS(
																								print_high.$sym11$PROGN,
																								ConsesLow.list(
																										print_high.$sym12$CSETF,
																										stream_var,
																										temp_stream),
																								ConsesLow.append(body,
																										CommonSymbols.NIL)),
																						ConsesLow.list(
																								print_high.$sym12$CSETF,
																								stream_var,
																								saved_stream))),
																		ConsesLow.listS(print_high.$sym16$CLET,
																				ConsesLow.list(ConsesLow.list(
																						print_high.$sym24$_PRINT_CIRCULARITIES_,
																						ConsesLow.listS(
																								print_high.$sym25$CONS,
																								ConsesLow.listS(
																										print_high.$sym28$LIST_,
																										stream_var,
																										table,
																										print_high.$list29),
																								print_high.$list19))),
																				ConsesLow.append(body,
																						CommonSymbols.NIL))))),
												reader.bq_cons(print_high.$sym11$PROGN,
														ConsesLow.append(body, CommonSymbols.NIL))));
							}
						}
					}
				}
			}
		}
	}

	private print_high() {
	}

	//// Initializers

	public void declareFunctions() {
		print_high.declare_print_high_file();
	}

	public void initializeVariables() {
		print_high.init_print_high_file();
	}

	public void runTopLevelForms() {
		print_high.setup_print_high_file();
	}

}
