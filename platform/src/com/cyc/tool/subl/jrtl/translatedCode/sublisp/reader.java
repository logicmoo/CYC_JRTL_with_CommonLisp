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

import java.util.Iterator;
import java.util.Map.Entry;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class reader extends SubLTranslatedFile {

	//// Constructor

	public static class $read_token_native extends SubLStructNative {
		private static SubLStructDeclNative structDecl = Structures.makeStructDeclNative($read_token_native.class,
				reader.$sym113$READ_TOKEN, reader.$sym114$READ_TOKEN_P, reader.$list115, reader.$list116,
				new String[] { "$pointer", "$buffer", "$escapes" }, reader.$list117, reader.$list118,
				reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION);

		public SubLObject $pointer = CommonSymbols.NIL;

		public SubLObject $buffer = CommonSymbols.NIL;

		public SubLObject $escapes = CommonSymbols.NIL;

		public SubLObject getField2() {
			return this.$pointer;
		}

		public SubLObject getField3() {
			return this.$buffer;
		}

		public SubLObject getField4() {
			return this.$escapes;
		}

		public SubLStructDecl getStructDecl() {
			return $read_token_native.structDecl;
		}

		public SubLObject setField2(SubLObject value) {
			return this.$pointer = value;
		}

		public SubLObject setField3(SubLObject value) {
			return this.$buffer = value;
		}

		public SubLObject setField4(SubLObject value) {
			return this.$escapes = value;
		}
	}

	public static class $read_token_p$UnaryFunction extends UnaryFunction {
		public $read_token_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("READ-TOKEN-P"));
		}

		public SubLObject processItem(SubLObject arg1) {
			return reader.read_token_p(arg1);
		}
	}

	public static class $readtable_native extends SubLStructNative {
		private static SubLStructDeclNative structDecl = Structures.makeStructDeclNative($readtable_native.class,
				reader.$sym6$READTABLE, reader.$sym7$READTABLE_P, reader.$list8, reader.$list9,
				new String[] { "$case", "$character_syntax", "$single_byte_char_syntax", "$macro_functions",
						"$single_byte_macro_functions", "$constituent_traits", "$single_byte_constit_traits",
						"$dispatch_tables" },
				reader.$list10, reader.$list11, reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION);

		public SubLObject $case = CommonSymbols.NIL;

		public SubLObject $character_syntax = CommonSymbols.NIL;

		public SubLObject $single_byte_char_syntax = CommonSymbols.NIL;

		public SubLObject $macro_functions = CommonSymbols.NIL;

		public SubLObject $single_byte_macro_functions = CommonSymbols.NIL;

		public SubLObject $constituent_traits = CommonSymbols.NIL;

		public SubLObject $single_byte_constit_traits = CommonSymbols.NIL;

		public SubLObject $dispatch_tables = CommonSymbols.NIL;

		public SubLObject getField2() {
			return this.$case;
		}

		public SubLObject getField3() {
			return this.$character_syntax;
		}

		public SubLObject getField4() {
			return this.$single_byte_char_syntax;
		}

		public SubLObject getField5() {
			return this.$macro_functions;
		}

		public SubLObject getField6() {
			return this.$single_byte_macro_functions;
		}

		public SubLObject getField7() {
			return this.$constituent_traits;
		}

		public SubLObject getField8() {
			return this.$single_byte_constit_traits;
		}

		public SubLObject getField9() {
			return this.$dispatch_tables;
		}

		public SubLStructDecl getStructDecl() {
			return $readtable_native.structDecl;
		}

		public SubLObject setField2(SubLObject value) {
			return this.$case = value;
		}

		public SubLObject setField3(SubLObject value) {
			return this.$character_syntax = value;
		}

		public SubLObject setField4(SubLObject value) {
			return this.$single_byte_char_syntax = value;
		}

		public SubLObject setField5(SubLObject value) {
			return this.$macro_functions = value;
		}

		public SubLObject setField6(SubLObject value) {
			return this.$single_byte_macro_functions = value;
		}

		public SubLObject setField7(SubLObject value) {
			return this.$constituent_traits = value;
		}

		public SubLObject setField8(SubLObject value) {
			return this.$single_byte_constit_traits = value;
		}

		public SubLObject setField9(SubLObject value) {
			return this.$dispatch_tables = value;
		}
	}

	//// Definitions

	public static class $readtable_p$UnaryFunction extends UnaryFunction {
		public $readtable_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("READTABLE-P"));
		}

		public SubLObject processItem(SubLObject arg1) {
			return reader.readtable_p(arg1);
		}
	}

	public static SubLFile me = new reader();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader";

	@SubL(source = "sublisp/reader.lisp", position = 4653)
	public static SubLSymbol $whitespace_1_chars$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5476)
	public static SubLSymbol $read_base$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5623)
	public static SubLSymbol $read_default_float_format$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5688)
	public static SubLSymbol $read_eval$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5725)
	public static SubLSymbol $read_suppress$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5768)
	public static SubLSymbol $features$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5840)
	public static SubLSymbol $readtable$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 5862)
	private static SubLSymbol $initial_table_size$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 6222)
	public static SubLSymbol $single_byte_max_code$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLSymbol $dtp_readtable$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7471)
	private static SubLSymbol $alphabetic$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7626)
	private static SubLSymbol $digit$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7671)
	private static SubLSymbol $package_marker$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7716)
	private static SubLSymbol $plus_sign$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7761)
	private static SubLSymbol $minus_sign$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7806)
	private static SubLSymbol $dot$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7851)
	private static SubLSymbol $decimal_point$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7896)
	private static SubLSymbol $ratio_marker$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7941)
	private static SubLSymbol $exponent_marker$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 7986)
	private static SubLSymbol $invalid$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 8844)
	public static SubLSymbol $standard_readtable$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 22812)
	private static SubLSymbol $throw_reader_error_p$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 23289)
	private static SubLSymbol $throw_end_of_file_p$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 24300)
	private static SubLSymbol $read_lookup_table$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 31841)
	private static SubLSymbol $initial_token_size$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLSymbol $dtp_read_token$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 40973)
	private static SubLSymbol $consing_dot$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 41019)
	public static SubLSymbol $keyword_package$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 41075)
	private static SubLSymbol $reading_list$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 41104)
	private static SubLSymbol $reading_fake_list$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 54169)
	private static SubLSymbol $right_paren$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 55869)
	public static SubLSymbol $ignore_extra_right_parens$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 58405)
	private static SubLSymbol $bq_comma$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 59958)
	private static SubLSymbol $bq_atsign$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 60003)
	private static SubLSymbol $bq_dot$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 60048)
	private static SubLSymbol $bq_vector$ = null;

	@SubL(source = "sublisp/reader.lisp", position = 63498)
	private static SubLSymbol $backquote_depth$ = null;

	public static SubLSymbol $sym0$CDO = SubLObjectFactory.makeSymbol("CDO");

	public static SubLList $list1 = ConsesLow.list(CommonSymbols.NIL);

	public static SubLSymbol $sym2$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");

	public static SubLList $list3 = ConsesLow.list(SubLObjectFactory.makeKeyword("SL2JAVA"));

	public static SubLInteger $int4$32 = SubLObjectFactory.makeInteger(32);

	public static SubLInteger $int5$128 = SubLObjectFactory.makeInteger(128);

	public static SubLSymbol $sym6$READTABLE = SubLObjectFactory.makeSymbol("READTABLE");

	public static SubLSymbol $sym7$READTABLE_P = SubLObjectFactory.makeSymbol("READTABLE-P");

	public static SubLList $list8 = ConsesLow.list(SubLObjectFactory.makeSymbol("CASE"),
			SubLObjectFactory.makeSymbol("CHARACTER-SYNTAX"), SubLObjectFactory.makeSymbol("SINGLE-BYTE-CHAR-SYNTAX"),
			SubLObjectFactory.makeSymbol("MACRO-FUNCTIONS"),
			SubLObjectFactory.makeSymbol("SINGLE-BYTE-MACRO-FUNCTIONS"),
			SubLObjectFactory.makeSymbol("CONSTITUENT-TRAITS"),
			SubLObjectFactory.makeSymbol("SINGLE-BYTE-CONSTIT-TRAITS"),
			SubLObjectFactory.makeSymbol("DISPATCH-TABLES"));

	public static SubLList $list9 = ConsesLow.list(SubLObjectFactory.makeKeyword("CASE"),
			SubLObjectFactory.makeKeyword("CHARACTER-SYNTAX"), SubLObjectFactory.makeKeyword("SINGLE-BYTE-CHAR-SYNTAX"),
			SubLObjectFactory.makeKeyword("MACRO-FUNCTIONS"),
			SubLObjectFactory.makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS"),
			SubLObjectFactory.makeKeyword("CONSTITUENT-TRAITS"),
			SubLObjectFactory.makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS"),
			SubLObjectFactory.makeKeyword("DISPATCH-TABLES"));

	public static SubLList $list10 = ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE-CASE"),
			SubLObjectFactory.makeSymbol("READTABLE-CHARACTER-SYNTAX"),
			SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX"),
			SubLObjectFactory.makeSymbol("READTABLE-MACRO-FUNCTIONS"),
			SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"),
			SubLObjectFactory.makeSymbol("READTABLE-CONSTITUENT-TRAITS"),
			SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"),
			SubLObjectFactory.makeSymbol("READTABLE-DISPATCH-TABLES"));

	public static SubLList $list11 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CASE"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"),
			SubLObjectFactory.makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES"));

	public static SubLSymbol $sym12$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory
			.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");

	public static SubLSymbol $sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
			.makeSymbol("READTABLE-PRINT-FUNCTION-TRAMPOLINE");

	public static SubLSymbol $sym14$READTABLE_CASE = SubLObjectFactory.makeSymbol("READTABLE-CASE");

	public static SubLSymbol $sym15$_CSETF_READTABLE_CASE = SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CASE");

	public static SubLSymbol $sym16$READTABLE_CHARACTER_SYNTAX = SubLObjectFactory
			.makeSymbol("READTABLE-CHARACTER-SYNTAX");

	public static SubLSymbol $sym17$_CSETF_READTABLE_CHARACTER_SYNTAX = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX");

	public static SubLSymbol $sym18$READTABLE_SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory
			.makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX");

	public static SubLSymbol $sym19$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX");

	public static SubLSymbol $sym20$READTABLE_MACRO_FUNCTIONS = SubLObjectFactory
			.makeSymbol("READTABLE-MACRO-FUNCTIONS");

	public static SubLSymbol $sym21$_CSETF_READTABLE_MACRO_FUNCTIONS = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS");

	public static SubLSymbol $sym22$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
			.makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");

	public static SubLSymbol $sym23$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");

	public static SubLSymbol $sym24$READTABLE_CONSTITUENT_TRAITS = SubLObjectFactory
			.makeSymbol("READTABLE-CONSTITUENT-TRAITS");

	public static SubLSymbol $sym25$_CSETF_READTABLE_CONSTITUENT_TRAITS = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS");

	public static SubLSymbol $sym26$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
			.makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");

	public static SubLSymbol $sym27$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");

	public static SubLSymbol $sym28$READTABLE_DISPATCH_TABLES = SubLObjectFactory
			.makeSymbol("READTABLE-DISPATCH-TABLES");

	public static SubLSymbol $sym29$_CSETF_READTABLE_DISPATCH_TABLES = SubLObjectFactory
			.makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES");

	public static SubLSymbol $kw30$CASE = SubLObjectFactory.makeKeyword("CASE");

	public static SubLSymbol $kw31$CHARACTER_SYNTAX = SubLObjectFactory.makeKeyword("CHARACTER-SYNTAX");

	public static SubLSymbol $kw32$SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory.makeKeyword("SINGLE-BYTE-CHAR-SYNTAX");

	public static SubLSymbol $kw33$MACRO_FUNCTIONS = SubLObjectFactory.makeKeyword("MACRO-FUNCTIONS");

	public static SubLSymbol $kw34$SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
			.makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS");

	public static SubLSymbol $kw35$CONSTITUENT_TRAITS = SubLObjectFactory.makeKeyword("CONSTITUENT-TRAITS");

	public static SubLSymbol $kw36$SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
			.makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS");

	public static SubLSymbol $kw37$DISPATCH_TABLES = SubLObjectFactory.makeKeyword("DISPATCH-TABLES");

	public static SubLString $str38$Invalid_slot__S_for_construction_ = SubLObjectFactory
			.makeString("Invalid slot ~S for construction function");

	public static SubLInteger $int39$64 = SubLObjectFactory.makeInteger(64);

	public static SubLInteger $int40$256 = SubLObjectFactory.makeInteger(256);

	public static SubLInteger $int41$512 = SubLObjectFactory.makeInteger(512);

	public static SubLSymbol $kw42$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");

	public static SubLSymbol $kw43$CONSTITUENT = SubLObjectFactory.makeKeyword("CONSTITUENT");

	public static SubLSymbol $sym44$CONSTITUENT_RMF = SubLObjectFactory.makeSymbol("CONSTITUENT-RMF");

	public static SubLList $list45 = ConsesLow.list(SubLObjectFactory.makeSymbol("CH"),
			SubLObjectFactory.makeSymbol("&OPTIONAL"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE"), ConsesLow
					.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*READTABLE*"))));

	public static SubLSymbol $sym46$_READTABLE_ = SubLObjectFactory.makeSymbol("*READTABLE*");

	public static SubLSymbol $sym47$FIF = SubLObjectFactory.makeSymbol("FIF");

	public static SubLSymbol $sym48$SINGLE_BYTE_P = SubLObjectFactory.makeSymbol("SINGLE-BYTE-P");

	public static SubLSymbol $sym49$AREF = SubLObjectFactory.makeSymbol("AREF");

	public static SubLSymbol $sym50$CHAR_CODE = SubLObjectFactory.makeSymbol("CHAR-CODE");

	public static SubLSymbol $sym51$GETHASH = SubLObjectFactory.makeSymbol("GETHASH");

	public static SubLList $list52 = ConsesLow.list(SubLObjectFactory.makeKeyword("CONSTITUENT"));

	public static SubLSymbol $kw53$INVALID = SubLObjectFactory.makeKeyword("INVALID");

	public static SubLSymbol $kw54$TERMINATING_MACRO = SubLObjectFactory.makeKeyword("TERMINATING-MACRO");

	public static SubLSymbol $kw55$NON_TERMINATING_MACRO = SubLObjectFactory.makeKeyword("NON-TERMINATING-MACRO");

	public static SubLSymbol $kw56$MULTIPLE_ESCAPE = SubLObjectFactory.makeKeyword("MULTIPLE-ESCAPE");

	public static SubLSymbol $kw57$SINGLE_ESCAPE = SubLObjectFactory.makeKeyword("SINGLE-ESCAPE");

	public static SubLSymbol $kw58$WHITESPACE = SubLObjectFactory.makeKeyword("WHITESPACE");

	public static SubLList $list59 = ConsesLow.list(SubLObjectFactory.makeSymbol("CH"),
			SubLObjectFactory.makeSymbol("TRAIT"), SubLObjectFactory.makeSymbol("&OPTIONAL"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE"), ConsesLow
					.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*READTABLE*"))));

	public static SubLSymbol $sym60$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");

	public static SubLSymbol $sym61$LOGAND = SubLObjectFactory.makeSymbol("LOGAND");

	public static SubLSymbol $sym62$CHARACTER_TRAITS = SubLObjectFactory.makeSymbol("CHARACTER-TRAITS");

	public static SubLList $list63 = ConsesLow.cons(SubLObjectFactory.makeSymbol("CH"),
			SubLObjectFactory.makeSymbol("TABLE"));

	public static SubLSymbol $sym64$CAR = SubLObjectFactory.makeSymbol("CAR");

	public static SubLSymbol $sym65$DISPATCHING_RMF = SubLObjectFactory.makeSymbol("DISPATCHING-RMF");

	public static SubLString $str66$Attempt_to_make_decimal_digit__A_ = SubLObjectFactory
			.makeString("Attempt to make decimal digit ~A be a dispatching macro character.");

	public static SubLString $str67$_A_is_not_a_dispatching_macro_cha = SubLObjectFactory
			.makeString("~A is not a dispatching macro character in ~S.");

	public static SubLSymbol $sym68$WHITESPACE_RMF = SubLObjectFactory.makeSymbol("WHITESPACE-RMF");

	public static SubLSymbol $sym69$SINGLE_ESCAPE_RMF = SubLObjectFactory.makeSymbol("SINGLE-ESCAPE-RMF");

	public static SubLSymbol $sym70$MULTIPLE_ESCAPE_RMF = SubLObjectFactory.makeSymbol("MULTIPLE-ESCAPE-RMF");

	public static SubLSymbol $sym71$LEFT_PAREN_RMF = SubLObjectFactory.makeSymbol("LEFT-PAREN-RMF");

	public static SubLSymbol $sym72$RIGHT_PAREN_RMF = SubLObjectFactory.makeSymbol("RIGHT-PAREN-RMF");

	public static SubLSymbol $sym73$SINGLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("SINGLE-QUOTE-RMF");

	public static SubLSymbol $sym74$SEMICOLON_RMF = SubLObjectFactory.makeSymbol("SEMICOLON-RMF");

	public static SubLSymbol $sym75$DOUBLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("DOUBLE-QUOTE-RMF");

	public static SubLSymbol $sym76$BACKQUOTE_RMF = SubLObjectFactory.makeSymbol("BACKQUOTE-RMF");

	public static SubLSymbol $sym77$COMMA_RMF = SubLObjectFactory.makeSymbol("COMMA-RMF");

	public static SubLSymbol $sym78$SHARPSIGN_BACKSLASH_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-BACKSLASH-RMF");

	public static SubLSymbol $sym79$SHARPSIGN_SINGLE_QUOTE_RMF = SubLObjectFactory
			.makeSymbol("SHARPSIGN-SINGLE-QUOTE-RMF");

	public static SubLSymbol $sym80$SHARPSIGN_LEFT_PAREN_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-LEFT-PAREN-RMF");

	public static SubLSymbol $sym81$SHARPSIGN_ASTERISK_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-ASTERISK-RMF");

	public static SubLSymbol $sym82$SHARPSIGN_COLON_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-COLON-RMF");

	public static SubLSymbol $sym83$SHARPSIGN_DOT_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-DOT-RMF");

	public static SubLSymbol $sym84$SHARPSIGN_B_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-B-RMF");

	public static SubLSymbol $sym85$SHARPSIGN_O_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-O-RMF");

	public static SubLSymbol $sym86$SHARPSIGN_X_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-X-RMF");

	public static SubLSymbol $sym87$SHARPSIGN_R_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-R-RMF");

	public static SubLSymbol $sym88$SHARPSIGN_C_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-C-RMF");

	public static SubLSymbol $sym89$SHARPSIGN_A_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-A-RMF");

	public static SubLSymbol $sym90$SHARPSIGN_S_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-S-RMF");

	public static SubLSymbol $sym91$SHARPSIGN_P_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-P-RMF");

	public static SubLSymbol $sym92$SHARPSIGN_CAPITAL_G_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-CAPITAL-G-RMF");

	public static SubLSymbol $sym93$SHARPSIGN_EQUALS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-EQUALS-RMF");

	public static SubLSymbol $sym94$SHARPSIGN_SHARPSIGN_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-SHARPSIGN-RMF");

	public static SubLSymbol $sym95$SHARPSIGN_PLUS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-PLUS-RMF");

	public static SubLSymbol $sym96$SHARPSIGN_MINUS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-MINUS-RMF");

	public static SubLSymbol $sym97$SHARPSIGN_VERTICAL_BAR_RMF = SubLObjectFactory
			.makeSymbol("SHARPSIGN-VERTICAL-BAR-RMF");

	public static SubLList $list98 = ConsesLow.list(Characters.CHAR_backspace, Characters.CHAR_tab,
			Characters.CHAR_newline, Characters.CHAR_newline, Characters.CHAR_page, Characters.CHAR_return,
			Characters.CHAR_space, Characters.CHAR_rubout);

	public static SubLList $list99 = ConsesLow.list(new SubLObject[] { Characters.CHAR_0, Characters.CHAR_1,
			Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6,
			Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_a, Characters.CHAR_b,
			Characters.CHAR_c, Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g,
			Characters.CHAR_h, Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l,
			Characters.CHAR_m, Characters.CHAR_n, Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q,
			Characters.CHAR_r, Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v,
			Characters.CHAR_w, Characters.CHAR_x, Characters.CHAR_y, Characters.CHAR_z, Characters.CHAR_A,
			Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F,
			Characters.CHAR_G, Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K,
			Characters.CHAR_L, Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P,
			Characters.CHAR_Q, Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U,
			Characters.CHAR_V, Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z });

	public static SubLSymbol $sym100$READER_ERROR = SubLObjectFactory.makeSymbol("READER-ERROR");

	public static SubLSymbol $sym101$ERROR = SubLObjectFactory.makeSymbol("ERROR");

	public static SubLSymbol $sym102$END_OF_FILE = SubLObjectFactory.makeSymbol("END-OF-FILE");

	public static SubLString $str103$End_of_file_on_stream__S_ = SubLObjectFactory
			.makeString("End of file on stream ~S.");

	public static SubLString $str104$_S_is_invalid_token_syntax_ = SubLObjectFactory
			.makeString("~S is invalid token syntax.");

	public static SubLString $str105$The__A_reader_macro_is_not_implem = SubLObjectFactory
			.makeString("The ~A reader macro is not implemented.");

	public static SubLString $str106$The__A_reader_macro_does_not_take = SubLObjectFactory
			.makeString("The ~A reader macro does not take an argument.");

	public static SubLString $str107$Illegal_argument__D_for_the__A_re = SubLObjectFactory
			.makeString("Illegal argument ~D for the ~A reader macro.");

	public static SubLSymbol $sym108$CLET = SubLObjectFactory.makeSymbol("CLET");

	public static SubLList $list109 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-BASE*"), CommonSymbols.TEN_INTEGER),
			ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"),
							SubLObjectFactory.makeSymbol("SINGLE-FLOAT"))),
			ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-EVAL*"), CommonSymbols.T),
			ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-SUPPRESS*"), CommonSymbols.NIL), ConsesLow.list(
					SubLObjectFactory.makeSymbol("*READTABLE*"), SubLObjectFactory.makeSymbol("*STANDARD-READTABLE*")));

	public static SubLSymbol $sym110$PROGN = SubLObjectFactory.makeSymbol("PROGN");

	public static SubLSymbol $kw111$EOF = SubLObjectFactory.makeKeyword("EOF");

	public static SubLSymbol $kw112$ERROR = SubLObjectFactory.makeKeyword("ERROR");

	public static SubLSymbol $sym113$READ_TOKEN = SubLObjectFactory.makeSymbol("READ-TOKEN");

	public static SubLSymbol $sym114$READ_TOKEN_P = SubLObjectFactory.makeSymbol("READ-TOKEN-P");

	public static SubLList $list115 = ConsesLow.list(SubLObjectFactory.makeSymbol("POINTER"),
			SubLObjectFactory.makeSymbol("BUFFER"), SubLObjectFactory.makeSymbol("ESCAPES"));

	public static SubLList $list116 = ConsesLow.list(SubLObjectFactory.makeKeyword("POINTER"),
			SubLObjectFactory.makeKeyword("BUFFER"), SubLObjectFactory.makeKeyword("ESCAPES"));

	public static SubLList $list117 = ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER"),
			SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER"), SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES"));

	public static SubLList $list118 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-POINTER"),
			SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-BUFFER"),
			SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-ESCAPES"));

	public static SubLSymbol $sym119$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
			.makeSymbol("READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE");

	public static SubLSymbol $sym120$READ_TOKEN_POINTER = SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER");

	public static SubLSymbol $sym121$_CSETF_READ_TOKEN_POINTER = SubLObjectFactory
			.makeSymbol("_CSETF-READ-TOKEN-POINTER");

	public static SubLSymbol $sym122$READ_TOKEN_BUFFER = SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER");

	public static SubLSymbol $sym123$_CSETF_READ_TOKEN_BUFFER = SubLObjectFactory
			.makeSymbol("_CSETF-READ-TOKEN-BUFFER");

	public static SubLSymbol $sym124$READ_TOKEN_ESCAPES = SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES");

	public static SubLSymbol $sym125$_CSETF_READ_TOKEN_ESCAPES = SubLObjectFactory
			.makeSymbol("_CSETF-READ-TOKEN-ESCAPES");

	public static SubLSymbol $kw126$POINTER = SubLObjectFactory.makeKeyword("POINTER");

	public static SubLSymbol $kw127$BUFFER = SubLObjectFactory.makeKeyword("BUFFER");

	public static SubLSymbol $kw128$ESCAPES = SubLObjectFactory.makeKeyword("ESCAPES");

	public static SubLList $list129 = ConsesLow.list(SubLObjectFactory.makeSymbol("TOKEN"),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));

	public static SubLList $list130 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-READ-TOKEN")));

	public static SubLList $list131 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER"), SubLObjectFactory.makeSymbol("TOKEN")),
			CommonSymbols.ZERO_INTEGER);

	public static SubLList $list132 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER"), SubLObjectFactory.makeSymbol("TOKEN")),
			ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-STRING"),
					SubLObjectFactory.makeSymbol("*INITIAL-TOKEN-SIZE*")));

	public static SubLList $list133 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES"), SubLObjectFactory.makeSymbol("TOKEN")),
			ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), CommonSymbols.NIL));

	public static SubLString $str134$_A_is_an_invalid_character_ = SubLObjectFactory
			.makeString("~A is an invalid character.");

	public static SubLString $str135$Fell_through_character_syntax_on_ = SubLObjectFactory
			.makeString("Fell through character syntax on ~A.");

	public static SubLSymbol $kw136$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");

	public static SubLString $str137$_S_is_not_a_known_package_ = SubLObjectFactory
			.makeString("~S is not a known package.");

	public static SubLSymbol $kw138$PRESERVE = SubLObjectFactory.makeKeyword("PRESERVE");

	public static SubLSymbol $kw139$INVERT = SubLObjectFactory.makeKeyword("INVERT");

	public static SubLSymbol $sym140$CONSING_DOT = SubLObjectFactory.makeUninternedSymbol("CONSING-DOT");

	public static SubLString $str141$KEYWORD = SubLObjectFactory.makeString("KEYWORD");

	public static SubLSymbol $kw142$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");

	public static SubLString $str143$_S_is_not_external_in__S_ = SubLObjectFactory
			.makeString("~S is not external in ~S.");

	public static SubLFloat $float144$0_0 = SubLObjectFactory.makeDouble(0.0);

	public static SubLSymbol $kw145$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");

	public static SubLSymbol $kw146$DOT1 = SubLObjectFactory.makeKeyword("DOT1");

	public static SubLSymbol $kw147$SIGN = SubLObjectFactory.makeKeyword("SIGN");

	public static SubLSymbol $kw148$DECIMALS = SubLObjectFactory.makeKeyword("DECIMALS");

	public static SubLSymbol $kw149$DIGITS = SubLObjectFactory.makeKeyword("DIGITS");

	public static SubLSymbol $kw150$EXPONENT = SubLObjectFactory.makeKeyword("EXPONENT");

	//// Internal Constants

	public static SubLSymbol $kw151$DOT2 = SubLObjectFactory.makeKeyword("DOT2");
	public static SubLSymbol $kw152$SLASH = SubLObjectFactory.makeKeyword("SLASH");
	public static SubLSymbol $kw153$DENOMINATOR = SubLObjectFactory.makeKeyword("DENOMINATOR");
	public static SubLSymbol $kw154$FRACTION = SubLObjectFactory.makeKeyword("FRACTION");
	public static SubLSymbol $kw155$DECIMALS2 = SubLObjectFactory.makeKeyword("DECIMALS2");
	public static SubLSymbol $kw156$EXPONENT_SIGN = SubLObjectFactory.makeKeyword("EXPONENT-SIGN");
	public static SubLSymbol $kw157$EXPONENT_VALUE = SubLObjectFactory.makeKeyword("EXPONENT-VALUE");
	public static SubLString $str158$Can_t_happen_ = SubLObjectFactory.makeString("Can't happen.");
	public static SubLSymbol $kw159$DIGIT = SubLObjectFactory.makeKeyword("DIGIT");
	public static SubLString $str160$_S_does_not_contain_an_integer_ = SubLObjectFactory
			.makeString("~S does not contain an integer.");
	public static SubLSymbol $kw161$TRAILING_WHITESPACE = SubLObjectFactory.makeKeyword("TRAILING-WHITESPACE");
	public static SubLString $str162$The__S_reader_macro_does_not_take = SubLObjectFactory
			.makeString("The ~S reader macro does not take an argument.");
	public static SubLString $str163$The__S_reader_macro_expected_a_st = SubLObjectFactory
			.makeString("The ~S reader macro expected a string.");
	public static SubLString $str164$The__S_reader_macro_could_not_int = SubLObjectFactory
			.makeString("The ~S reader macro could not interpret ~S as a GUID string.");
	public static SubLSymbol $sym165$RIGHT_PAREN = SubLObjectFactory.makeUninternedSymbol("RIGHT-PAREN");
	public static SubLString $str166$Nothing_before_consing_dot_ = SubLObjectFactory
			.makeString("Nothing before consing dot.");
	public static SubLSymbol $kw167$LIST = SubLObjectFactory.makeKeyword("LIST");
	public static SubLSymbol $kw168$CONSING_DOT = SubLObjectFactory.makeKeyword("CONSING-DOT");
	public static SubLString $str169$Nothing_after_consing_dot_ = SubLObjectFactory
			.makeString("Nothing after consing dot.");
	public static SubLString $str170$Too_many_consing_dots_ = SubLObjectFactory.makeString("Too many consing dots.");
	public static SubLSymbol $kw171$AFTER_CONSING_DOT = SubLObjectFactory.makeKeyword("AFTER-CONSING-DOT");
	public static SubLString $str172$Too_many_objects_after_consing_do = SubLObjectFactory
			.makeString("Too many objects after consing dot.");
	public static SubLString $str173$Ignoring_unmatched_close_parenthe = SubLObjectFactory
			.makeString("Ignoring unmatched close parenthesis.");
	public static SubLString $str174$Unmatched__A_ = SubLObjectFactory.makeString("Unmatched ~A.");
	public static SubLSymbol $sym175$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
	public static SubLSymbol $kw176$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
	public static SubLSymbol $kw177$ESCAPE = SubLObjectFactory.makeKeyword("ESCAPE");
	public static SubLSymbol $sym178$LIST = SubLObjectFactory.makeSymbol("LIST");
	public static SubLSymbol $sym179$LIST_ = SubLObjectFactory.makeSymbol("LIST*");
	public static SubLSymbol $sym180$APPEND = SubLObjectFactory.makeSymbol("APPEND");
	public static SubLSymbol $sym181$NCONC = SubLObjectFactory.makeSymbol("NCONC");
	public static SubLSymbol $sym182$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
	public static SubLSymbol $sym183$BQ_VECTOR = SubLObjectFactory.makeSymbol("BQ-VECTOR");
	public static SubLSymbol $sym184$BQ_APPEND = SubLObjectFactory.makeSymbol("BQ-APPEND");
	public static SubLString $str185$_ = SubLObjectFactory.makeString(",");
	public static SubLString $str186$_ = SubLObjectFactory.makeString("@");
	public static SubLString $str187$_ = SubLObjectFactory.makeString(".");
	public static SubLString $str188$BQ_VECTOR = SubLObjectFactory.makeString("BQ-VECTOR");
	public static SubLString $str189$_A_after_dot_in__S_ = SubLObjectFactory.makeString("~A after dot in ~S.");
	public static SubLList $list190 = ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), CommonSymbols.T,
			CommonSymbols.NIL);
	public static SubLList $list191 = ConsesLow.list(SubLObjectFactory.makeSymbol("APPEND"),
			SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeSymbol("LIST*"),
			SubLObjectFactory.makeSymbol("NCONC"));
	public static SubLSymbol $sym192$CONS = SubLObjectFactory.makeSymbol("CONS");
	public static SubLSymbol $sym193$BQ_LIST_ = SubLObjectFactory.makeSymbol("BQ-LIST*");
	public static SubLSymbol $sym194$BQ_CONS = SubLObjectFactory.makeSymbol("BQ-CONS");
	public static SubLList $list195 = ConsesLow.list(
			ConsesLow.cons(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("BQ-CONS")),
			ConsesLow.cons(SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeSymbol("BQ-LIST")),
			ConsesLow.cons(SubLObjectFactory.makeSymbol("APPEND"), SubLObjectFactory.makeSymbol("BQ-APPEND")),
			ConsesLow.cons(SubLObjectFactory.makeSymbol("NCONC"), SubLObjectFactory.makeSymbol("BQ-NCONC")));
	public static SubLString $str196$_A_read_after_backquote_in__S_ = SubLObjectFactory
			.makeString("~A read after backquote in ~S.");
	public static SubLString $str197$_S_read_outside_a_backquote_ = SubLObjectFactory
			.makeString("~S read outside a backquote.");
	public static SubLString $str198$Undefined_reader_macro__A_A_ = SubLObjectFactory
			.makeString("Undefined reader macro ~A~A.");
	public static SubLString $str199$_S_is_not_the_name_of_a_character = SubLObjectFactory
			.makeString("~S is not the name of a character.");
	public static SubLSymbol $sym200$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
	public static SubLString $str201$Attempt_the_use_the__A_reader_mac = SubLObjectFactory
			.makeString("Attempt the use the ~A reader macro when ~S is ~S.");
	public static SubLSymbol $sym202$_READ_EVAL_ = SubLObjectFactory.makeSymbol("*READ-EVAL*");
	public static SubLInteger $int203$36 = SubLObjectFactory.makeInteger(36);
	public static SubLString $str204$The_form_after__A_reader_macro_wa = SubLObjectFactory
			.makeString("The form after ~A reader macro was not a list.");
	public static SubLString $str205$Label__S_appears_more_than_once_ = SubLObjectFactory
			.makeString("Label ~S appears more than once.");
	public static SubLString $str206$Label__S_has_not_been_seen_ = SubLObjectFactory
			.makeString("Label ~S has not been seen.");
	public static SubLSymbol $kw207$NOT = SubLObjectFactory.makeKeyword("NOT");
	public static SubLString $str208$Bogus_feature_expression__S_ = SubLObjectFactory
			.makeString("Bogus feature expression ~S.");
	public static SubLSymbol $kw209$AND = SubLObjectFactory.makeKeyword("AND");
	public static SubLSymbol $kw210$OR = SubLObjectFactory.makeKeyword("OR");
	public static SubLString $str211$Unknown_feature_operator__S_ = SubLObjectFactory
			.makeString("Unknown feature operator ~S.");
	public static SubLSymbol $kw212$HASH = SubLObjectFactory.makeKeyword("HASH");
	public static SubLSymbol $kw213$VERTICAL_BAR = SubLObjectFactory.makeKeyword("VERTICAL-BAR");

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject _csetf_read_token_buffer(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym114$READ_TOKEN_P);
		return object.setField3(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject _csetf_read_token_escapes(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym114$READ_TOKEN_P);
		return object.setField4(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject _csetf_read_token_pointer(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym114$READ_TOKEN_P);
		return object.setField2(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_case(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField2(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_character_syntax(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField3(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_constituent_traits(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField7(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_dispatch_tables(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField9(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_macro_functions(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField5(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_single_byte_char_syntax(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField4(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_single_byte_constit_traits(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField8(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject _csetf_readtable_single_byte_macro_functions(SubLObject object, SubLObject value) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.setField6(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 32281)
	public static SubLObject add_to_token(SubLObject ch, SubLObject token, SubLObject escapep) {
		{
			SubLObject buffer = reader.read_token_buffer(token);
			SubLObject length = Sequences.length(buffer);
			if (reader.read_token_pointer(token).numGE(length)) {
				SubLObject new_buffer = Strings.make_string(Numbers.multiply(length, CommonSymbols.TWO_INTEGER),
						CommonSymbols.UNPROVIDED);
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
					Strings.set_char(new_buffer, i, Strings.sublisp_char(buffer, i));
				reader._csetf_read_token_buffer(token, new_buffer);
			}
		}
		Strings.set_char(reader.read_token_buffer(token), reader.read_token_pointer(token), ch);
		if (CommonSymbols.NIL != escapep)
			reader._csetf_read_token_escapes(token,
					ConsesLow.cons(reader.read_token_pointer(token), reader.read_token_escapes(token)));
		reader._csetf_read_token_pointer(token,
				Numbers.add(reader.read_token_pointer(token), CommonSymbols.ONE_INTEGER));
		return ch;
	}

	@SubL(source = "sublisp/reader.lisp", position = 11909)
	public static SubLObject alphabetic_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return SubLObjectFactory
					.makeBoolean(Numbers.logand(reader.$alphabetic$.getGlobalValue(),
							reader.character_traits(ch,
									reader.$readtable$.getDynamicValue(thread)))
							.isPositive()
							&& !(Numbers
									.logand(reader.$digit$.getGlobalValue(),
											reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
									.isPositive()
									&& CommonSymbols.NIL != Characters.digit_char_p(ch,
											reader.$read_base$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12761)
	public static SubLObject alphadigit_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return SubLObjectFactory.makeBoolean(Numbers
					.logand(reader.$alphabetic$.getGlobalValue(),
							reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
					.isPositive()
					&& Numbers
							.logand(reader.$digit$.getGlobalValue(),
									reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
							.isPositive());
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 63528)
	public static SubLObject backquote_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = reader.$backquote_depth$.currentBinding(thread);
					try {
						reader.$backquote_depth$.bind(Numbers.add(reader.$backquote_depth$.getDynamicValue(thread),
								CommonSymbols.ONE_INTEGER), thread);
						thread.resetMultipleValues();
						{
							SubLObject flag = reader.backquotify(stream,
									reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
							SubLObject thing = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (flag == reader.$bq_atsign$.getDynamicValue(thread)
									|| flag == reader.$bq_dot$.getDynamicValue(thread))
								reader.simple_reader_error(reader.$str196$_A_read_after_backquote_in__S_,
										ConsesLow.list(flag, thing));
							result = reader.backquotify_1(flag, thing);
						}
					} finally {
						reader.$backquote_depth$.rebind(_prev_bind_0, thread);
					}
				}
				return Values.values(result, reader.$sym178$LIST);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 60101)
	public static SubLObject backquotify(SubLObject stream, SubLObject code) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (code.isAtom()) {
				if (CommonSymbols.NIL == code)
					return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
				else if (CommonSymbols.NIL != reader.self_evaluating_atom_p(code))
					return Values.values(CommonSymbols.T, code);
				else
					return Values.values(reader.$sym175$QUOTE, code);
			} else if (code.first() == reader.$bq_atsign$.getDynamicValue(thread)
					|| code.first() == reader.$bq_dot$.getDynamicValue(thread))
				return Values.values(code.first(), code.rest());
			else if (code.first() == reader.$bq_comma$.getDynamicValue(thread)) {
				thread.resetMultipleValues();
				{
					SubLObject flag = reader.comma(code.rest());
					SubLObject thing = thread.secondMultipleValue();
					thread.resetMultipleValues();
					return Values.values(flag, thing);
				}
			} else if (code.first() == reader.$bq_vector$.getDynamicValue(thread)) {
				thread.resetMultipleValues();
				{
					SubLObject dflag = reader.backquotify(stream, code.rest());
					SubLObject d = thread.secondMultipleValue();
					thread.resetMultipleValues();
					return Values.values(reader.$sym182$VECTOR, reader.backquotify_1(dflag, d));
				}
			} else {
				thread.resetMultipleValues();
				{
					SubLObject aflag = reader.backquotify(stream, code.first());
					SubLObject a = thread.secondMultipleValue();
					thread.resetMultipleValues();
					thread.resetMultipleValues();
					{
						SubLObject dflag = reader.backquotify(stream, code.rest());
						SubLObject d = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (dflag == reader.$bq_atsign$.getDynamicValue(thread)
								|| dflag == reader.$bq_dot$.getDynamicValue(thread))
							reader.simple_reader_error(reader.$str189$_A_after_dot_in__S_, ConsesLow.list(dflag, code));
						if (aflag == reader.$bq_atsign$.getDynamicValue(thread))
							return Values.values(reader.$sym180$APPEND,
									dflag == reader.$sym180$APPEND ? (SubLObject) ConsesLow.cons(a, d)
											: ConsesLow.list(a, reader.backquotify_1(dflag, d)));
						else if (aflag == reader.$bq_dot$.getDynamicValue(thread))
							return Values.values(reader.$sym181$NCONC,
									dflag == reader.$sym181$NCONC ? (SubLObject) ConsesLow.cons(a, d)
											: ConsesLow.list(a, reader.backquotify_1(dflag, d)));
						else if (CommonSymbols.NIL == dflag) {
							if (CommonSymbols.NIL != conses_high.member(aflag, reader.$list190,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
								return Values.values(reader.$sym175$QUOTE, ConsesLow.list(a));
							else
								return Values.values(reader.$sym178$LIST,
										ConsesLow.list(reader.backquotify_1(aflag, a)));
						} else if (dflag == reader.$sym175$QUOTE || dflag == CommonSymbols.T) {
							if (CommonSymbols.NIL != conses_high.member(aflag, reader.$list190,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
								return Values.values(reader.$sym175$QUOTE, ConsesLow.cons(a, d));
							else
								return Values.values(reader.$sym179$LIST_,
										ConsesLow.list(reader.backquotify_1(aflag, a), reader.backquotify_1(dflag, d)));
						} else {
							a = reader.backquotify_1(aflag, a);
							if (dflag == reader.$sym178$LIST || dflag == reader.$sym179$LIST_)
								return Values.values(dflag, ConsesLow.cons(a, d));
							else
								return Values.values(reader.$sym179$LIST_,
										ConsesLow.list(a, reader.backquotify_1(dflag, d)));
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 62890)
	public static SubLObject backquotify_1(SubLObject flag, SubLObject thing) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (flag == reader.$bq_comma$.getDynamicValue(thread) || flag == CommonSymbols.T
					|| flag == CommonSymbols.NIL)
				return thing;
			else if (flag == reader.$sym175$QUOTE)
				return ConsesLow.list(reader.$sym175$QUOTE, thing);
			else if (flag == reader.$sym179$LIST_) {
				if (CommonSymbols.NIL != conses_high.cddr(thing))
					return ConsesLow.cons(reader.$sym193$BQ_LIST_, thing);
				else
					return ConsesLow.cons(reader.$sym194$BQ_CONS, thing);
			} else if (flag == reader.$sym182$VECTOR)
				return ConsesLow.list(reader.$sym183$BQ_VECTOR, thing);
			else
				return ConsesLow.cons(conses_high
						.assoc(flag, reader.$list195, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest(),
						thing);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 58037)
	public static SubLObject bq_append(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject lists = current;
			return reader.bq_cons(reader.$sym180$APPEND, ConsesLow.append(lists, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 57733)
	public static SubLObject bq_cons(SubLObject car, SubLObject cdr) {
		return ConsesLow.cons(car, cdr);
	}

	@SubL(source = "sublisp/reader.lisp", position = 57913)
	public static SubLObject bq_list(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject objects = current;
			return reader.bq_cons(reader.$sym178$LIST, ConsesLow.append(objects, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 57974)
	public static SubLObject bq_listX(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject objects = current;
			return reader.bq_cons(reader.$sym179$LIST_, ConsesLow.append(objects, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 58098)
	public static SubLObject bq_nconc(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject lists = current;
			return reader.bq_cons(reader.$sym181$NCONC, ConsesLow.append(lists, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 58157)
	public static SubLObject bq_vector(SubLObject contents) {
		return Functions.apply(Symbols.symbol_function(reader.$sym182$VECTOR), contents);
	}

	@SubL(source = "sublisp/reader.lisp", position = 58221)
	public static SubLObject bq_vector_append(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject lists = current;
			return ConsesLow.list(reader.$sym183$BQ_VECTOR,
					reader.bq_cons(reader.$sym184$BQ_APPEND, ConsesLow.append(lists, CommonSymbols.NIL)));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 10130)
	public static SubLObject character_function(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			return Vectors.aref(reader.readtable_single_byte_macro_functions(readtable), Characters.char_code(ch));
		else {
			SubLObject func = Hashtables.gethash(ch, reader.readtable_macro_functions(readtable),
					CommonSymbols.UNPROVIDED);
			return CommonSymbols.NIL != func ? (SubLObject) func : reader.$sym44$CONSTITUENT_RMF;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 8992)
	public static SubLObject character_syntax(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject ch = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list45);
			ch = current.first();
			current = current.rest();
			{
				SubLObject readtable = current.isCons() ? (SubLObject) current.first() : reader.$sym46$_READTABLE_;
				cdestructuring_bind.destructuring_bind_must_listp(current, datum, reader.$list45);
				current = current.rest();
				if (CommonSymbols.NIL == current)
					return ConsesLow.list(reader.$sym47$FIF, ConsesLow.list(reader.$sym48$SINGLE_BYTE_P, ch),
							ConsesLow.list(reader.$sym49$AREF,
									ConsesLow.list(reader.$sym18$READTABLE_SINGLE_BYTE_CHAR_SYNTAX, readtable),
									ConsesLow.list(reader.$sym50$CHAR_CODE, ch)),
							ConsesLow.listS(reader.$sym51$GETHASH, ch,
									ConsesLow.list(reader.$sym16$READTABLE_CHARACTER_SYNTAX, readtable),
									reader.$list52));
				else
					cdestructuring_bind.cdestructuring_bind_error(datum, reader.$list45);
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 10748)
	public static SubLObject character_traits(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		return CommonSymbols.NIL != reader.single_byte_p(ch)
				? (SubLObject) Vectors.aref(reader.readtable_single_byte_constit_traits(readtable),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_constituent_traits(readtable),
						reader.$alphabetic$.getGlobalValue());
	}

	@SubL(source = "sublisp/reader.lisp", position = 62076)
	public static SubLObject comma(SubLObject code) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (code.isAtom()) {
				if (CommonSymbols.NIL == code)
					return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
				else if (CommonSymbols.NIL != reader.self_evaluating_atom_p(code))
					return Values.values(CommonSymbols.T, code);
				else
					return Values.values(reader.$bq_comma$.getDynamicValue(thread), code);
			} else if (code.first() == reader.$sym175$QUOTE)
				return Values.values(code.first(), conses_high.cadr(code));
			else if (CommonSymbols.NIL != conses_high.member(code.first(), reader.$list191, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				return Values.values(code.first(), code.rest());
			else if (code.first() == reader.$sym192$CONS)
				return Values.values(reader.$sym179$LIST_, code.rest());
			else
				return Values.values(reader.$bq_comma$.getDynamicValue(thread), code);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 63954)
	public static SubLObject comma_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (reader.$backquote_depth$.getDynamicValue(thread).isZero()) {
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else
					reader.simple_reader_error(reader.$str197$_S_read_outside_a_backquote_, ConsesLow.list(ch));
			} else {
				SubLObject peek_char = streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				SubLObject result = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = reader.$backquote_depth$.currentBinding(thread);
					try {
						reader.$backquote_depth$.bind(Numbers.subtract(reader.$backquote_depth$.getDynamicValue(thread),
								CommonSymbols.ONE_INTEGER), thread);
						{
							SubLObject pcase_var = peek_char;
							if (pcase_var.eql(Characters.CHAR_at))
								result = ConsesLow.cons(reader.$bq_atsign$.getDynamicValue(thread),
										reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
							else if (pcase_var.eql(Characters.CHAR_period))
								result = ConsesLow.cons(reader.$bq_dot$.getDynamicValue(thread),
										reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
							else {
								streams_high.unread_char(peek_char, stream);
								result = ConsesLow.cons(reader.$bq_comma$.getDynamicValue(thread),
										reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
							}
						}
					} finally {
						reader.$backquote_depth$.rebind(_prev_bind_0, thread);
					}
				}
				return Values.values(result, reader.$sym178$LIST);
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 52653)
	public static SubLObject constituent_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
			reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
			reader._csetf_read_token_buffer(token,
					Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
			reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
			reader.add_to_token(ch, token, CommonSymbols.NIL);
			return Values.values(reader.parse_token(stream, reader.read_token(stream, token, CommonSymbols.NIL)),
					CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 10048)
	public static SubLObject constituent_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw43$CONSTITUENT);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 13018)
	public static SubLObject copy_readtable(SubLObject from_readtable, SubLObject to_readtable) {
		if (from_readtable == CommonSymbols.UNPROVIDED)
			from_readtable = reader.$readtable$.getDynamicValue();
		if (to_readtable == CommonSymbols.UNPROVIDED)
			to_readtable = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == from_readtable)
				from_readtable = reader.$standard_readtable$.getDynamicValue(thread);
			if (CommonSymbols.NIL != to_readtable) {
				Hashtables.clrhash(reader.readtable_character_syntax(to_readtable));
				Hashtables.clrhash(reader.readtable_macro_functions(to_readtable));
				Hashtables.clrhash(reader.readtable_constituent_traits(to_readtable));
			} else
				to_readtable = reader.create_readtable();
			reader._csetf_readtable_case(to_readtable, reader.readtable_case(from_readtable));
			reader.Xcopy_hash_table(reader.readtable_character_syntax(from_readtable),
					reader.readtable_character_syntax(to_readtable));
			reader.Xcopy_hash_table(reader.readtable_macro_functions(from_readtable),
					reader.readtable_macro_functions(to_readtable));
			reader.Xcopy_hash_table(reader.readtable_constituent_traits(from_readtable),
					reader.readtable_constituent_traits(to_readtable));
			{
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(reader.$single_byte_max_code$.getGlobalValue()); i = Numbers
						.add(i, CommonSymbols.ONE_INTEGER)) {
					Vectors.set_aref(reader.readtable_single_byte_char_syntax(to_readtable), i,
							Vectors.aref(reader.readtable_single_byte_char_syntax(from_readtable), i));
					Vectors.set_aref(reader.readtable_single_byte_macro_functions(to_readtable), i,
							Vectors.aref(reader.readtable_single_byte_macro_functions(from_readtable), i));
					Vectors.set_aref(reader.readtable_single_byte_constit_traits(to_readtable), i,
							Vectors.aref(reader.readtable_single_byte_constit_traits(from_readtable), i));
				}
			}
			{
				SubLObject dispatch_table = CommonSymbols.NIL;
				SubLObject cdolist_list_var = reader.readtable_dispatch_tables(from_readtable);
				SubLObject bucket = CommonSymbols.NIL;
				for (bucket = cdolist_list_var
						.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
								.rest(), bucket = cdolist_list_var.first()) {
					SubLObject datum = bucket;
					SubLObject current = datum;
					SubLObject ch = CommonSymbols.NIL;
					SubLObject table = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list63);
					ch = current.first();
					current = current.rest();
					table = current;
					dispatch_table = ConsesLow.cons(
							ConsesLow.cons(ch,
									reader.Xcopy_hash_table(table,
											Hashtables.make_hash_table(Hashtables.hash_table_count(table),
													CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))),
							dispatch_table);
				}
				reader._csetf_readtable_dispatch_tables(to_readtable, dispatch_table);
			}
			return to_readtable;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 8031)
	public static SubLObject create_readtable() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject readtable = reader.make_readtable(CommonSymbols.UNPROVIDED);
				reader._csetf_readtable_case(readtable, reader.$kw42$UPCASE);
				reader._csetf_readtable_character_syntax(readtable,
						Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
				reader._csetf_readtable_single_byte_char_syntax(readtable,
						Vectors.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$kw43$CONSTITUENT));
				reader._csetf_readtable_macro_functions(readtable,
						Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
				reader._csetf_readtable_single_byte_macro_functions(readtable, Vectors
						.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$sym44$CONSTITUENT_RMF));
				reader._csetf_readtable_constituent_traits(readtable,
						Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
				reader._csetf_readtable_single_byte_constit_traits(readtable, Vectors.make_vector(
						reader.$single_byte_max_code$.getGlobalValue(), reader.$alphabetic$.getGlobalValue()));
				reader._csetf_readtable_dispatch_tables(readtable, CommonSymbols.NIL);
				return readtable;
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12471)
	public static SubLObject decimal_point_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$decimal_point$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	public static SubLObject declare_reader_file() {
		SubLFiles.declareMacro(reader.myName, "loop", "LOOP");
		SubLFiles.declareFunction(reader.myName, "whitespace_1_char_p", "WHITESPACE-1-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "whitespace_2_char_p", "WHITESPACE-2-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_print_function_trampoline",
				"READTABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_p", "READTABLE-P", 1, 0, false);
		new $readtable_p$UnaryFunction();
		SubLFiles.declareFunction(reader.myName, "readtable_case", "READTABLE-CASE", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_character_syntax", "READTABLE-CHARACTER-SYNTAX", 1, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "readtable_single_byte_char_syntax",
				"READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_macro_functions", "READTABLE-MACRO-FUNCTIONS", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_single_byte_macro_functions",
				"READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_constituent_traits", "READTABLE-CONSTITUENT-TRAITS", 1, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "readtable_single_byte_constit_traits",
				"READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "readtable_dispatch_tables", "READTABLE-DISPATCH-TABLES", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_case", "_CSETF-READTABLE-CASE", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_character_syntax",
				"_CSETF-READTABLE-CHARACTER-SYNTAX", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_single_byte_char_syntax",
				"_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_macro_functions", "_CSETF-READTABLE-MACRO-FUNCTIONS",
				2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_single_byte_macro_functions",
				"_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_constituent_traits",
				"_CSETF-READTABLE-CONSTITUENT-TRAITS", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_single_byte_constit_traits",
				"_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_readtable_dispatch_tables", "_CSETF-READTABLE-DISPATCH-TABLES",
				2, 0, false);
		SubLFiles.declareFunction(reader.myName, "make_readtable", "MAKE-READTABLE", 0, 1, false);
		SubLFiles.declareFunction(reader.myName, "create_readtable", "CREATE-READTABLE", 0, 0, false);
		SubLFiles.declareFunction(reader.myName, "single_byte_p", "SINGLE-BYTE-P", 1, 0, false);
		SubLFiles.declareMacro(reader.myName, "character_syntax", "CHARACTER-SYNTAX");
		SubLFiles.declareFunction(reader.myName, "set_character_syntax", "SET-CHARACTER-SYNTAX", 2, 1, false);
		SubLFiles.declareFunction(reader.myName, "invalid_syntaxp", "INVALID-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "terminating_macro_syntaxp", "TERMINATING-MACRO-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "non_terminating_macro_syntaxp", "NON-TERMINATING-MACRO-SYNTAXP", 1, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "multiple_escape_syntaxp", "MULTIPLE-ESCAPE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "single_escape_syntaxp", "SINGLE-ESCAPE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "whitespace_syntaxp", "WHITESPACE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "constituent_syntaxp", "CONSTITUENT-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "character_function", "CHARACTER-FUNCTION", 1, 1, false);
		SubLFiles.declareFunction(reader.myName, "set_character_function", "SET-CHARACTER-FUNCTION", 2, 1, false);
		SubLFiles.declareFunction(reader.myName, "character_traits", "CHARACTER-TRAITS", 1, 1, false);
		SubLFiles.declareMacro(reader.myName, "has_traitp", "HAS-TRAITP");
		SubLFiles.declareFunction(reader.myName, "set_trait", "SET-TRAIT", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "reset_trait", "RESET-TRAIT", 1, 1, false);
		SubLFiles.declareFunction(reader.myName, "alphabetic_traitp", "ALPHABETIC-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "digit_traitp", "DIGIT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "package_marker_traitp", "PACKAGE-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "plus_sign_traitp", "PLUS-SIGN-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "minus_sign_traitp", "MINUS-SIGN-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "dot_traitp", "DOT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "decimal_point_traitp", "DECIMAL-POINT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "ratio_marker_traitp", "RATIO-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "exponent_marker_traitp", "EXPONENT-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "invalid_traitp", "INVALID-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "alphadigit_traitp", "ALPHADIGIT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "Xcopy_hash_table", "%COPY-HASH-TABLE", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "copy_readtable", "COPY-READTABLE", 0, 2, false);
		SubLFiles.declareFunction(reader.myName, "make_dispatch_macro_character", "MAKE-DISPATCH-MACRO-CHARACTER", 1, 2,
				false);
		SubLFiles.declareFunction(reader.myName, "readtablep", "READTABLEP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "set_dispatch_macro_character", "SET-DISPATCH-MACRO-CHARACTER", 3, 1,
				false);
		SubLFiles.declareFunction(reader.myName, "get_dispatch_macro_character", "GET-DISPATCH-MACRO-CHARACTER", 2, 1,
				false);
		SubLFiles.declareFunction(reader.myName, "get_macro_character", "GET-MACRO-CHARACTER", 1, 1, false);
		SubLFiles.declareFunction(reader.myName, "set_macro_character", "SET-MACRO-CHARACTER", 2, 2, false);
		SubLFiles.declareFunction(reader.myName, "set_syntax_from_char", "SET-SYNTAX-FROM-CHAR", 2, 2, false);
		SubLFiles.declareFunction(reader.myName, "set_syntax", "SET-SYNTAX", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "simple_reader_error", "SIMPLE-READER-ERROR", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "end_of_file_error", "END-OF-FILE-ERROR", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "invalid_token_syntax_error", "INVALID-TOKEN-SYNTAX-ERROR", 2, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "unimplemented_reader_macro_error", "UNIMPLEMENTED-READER-MACRO-ERROR",
				2, 0, false);
		SubLFiles.declareFunction(reader.myName, "unnecessary_argument_error", "UNNECESSARY-ARGUMENT-ERROR", 2, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "illegal_argument_error", "ILLEGAL-ARGUMENT-ERROR", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_internal", "READ-INTERNAL", 1, 2, false);
		SubLFiles.declareFunction(reader.myName, "read_preserving_whitespace", "READ-PRESERVING-WHITESPACE", 0, 4,
				false);
		SubLFiles.declareFunction(reader.myName, "read", "READ", 0, 4, false);
		SubLFiles.declareFunction(reader.myName, "read_delimited_list", "READ-DELIMITED-LIST", 1, 2, false);
		SubLFiles.declareFunction(reader.myName, "read_from_string", "READ-FROM-STRING", 1, 5, false);
		SubLFiles.declareMacro(reader.myName, "with_standard_io_syntax", "WITH-STANDARD-IO-SYNTAX");
		SubLFiles.declareMacro(reader.myName, "with_special_reader_error_handling",
				"WITH-SPECIAL-READER-ERROR-HANDLING");
		SubLFiles.declareFunction(reader.myName, "read_ignoring_errors", "READ-IGNORING-ERRORS", 0, 3, false);
		SubLFiles.declareFunction(reader.myName, "read_from_string_ignoring_errors", "READ-FROM-STRING-IGNORING-ERRORS",
				1, 4, false);
		SubLFiles.declareFunction(reader.myName, "read_token_print_function_trampoline",
				"READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_token_p", "READ-TOKEN-P", 1, 0, false);
		new $read_token_p$UnaryFunction();
		SubLFiles.declareFunction(reader.myName, "read_token_pointer", "READ-TOKEN-POINTER", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_token_buffer", "READ-TOKEN-BUFFER", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_token_escapes", "READ-TOKEN-ESCAPES", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_read_token_pointer", "_CSETF-READ-TOKEN-POINTER", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_read_token_buffer", "_CSETF-READ-TOKEN-BUFFER", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "_csetf_read_token_escapes", "_CSETF-READ-TOKEN-ESCAPES", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "make_read_token", "MAKE-READ-TOKEN", 0, 1, false);
		SubLFiles.declareMacro(reader.myName, "with_read_token", "WITH-READ-TOKEN");
		SubLFiles.declareFunction(reader.myName, "add_to_token", "ADD-TO-TOKEN", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_token_string", "READ-TOKEN-STRING", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_token", "READ-TOKEN", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "potential_number_p", "POTENTIAL-NUMBER-P", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "parse_token", "PARSE-TOKEN", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "symbol_escapep", "SYMBOL-ESCAPEP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "reader_find_package", "READER-FIND-PACKAGE", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "frob_case", "FROB-CASE", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "parse_symbol_or_consing_dot", "PARSE-SYMBOL-OR-CONSING-DOT", 2, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "float_parse_integer", "FLOAT-PARSE-INTEGER", 4, 0, false);
		SubLFiles.declareFunction(reader.myName, "parse_number", "PARSE-NUMBER", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "parse_integer", "PARSE-INTEGER", 1, 4, false);
		SubLFiles.declareFunction(reader.myName, "whitespace_rmf", "WHITESPACE-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "constituent_rmf", "CONSTITUENT-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "invalid_rmf", "INVALID-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "single_escape_rmf", "SINGLE-ESCAPE-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "multiple_escape_rmf", "MULTIPLE-ESCAPE-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_capital_g_rmf", "SHARPSIGN-CAPITAL-G-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "left_paren_rmf", "LEFT-PAREN-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "right_paren_rmf", "RIGHT-PAREN-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "single_quote_rmf", "SINGLE-QUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "semicolon_rmf", "SEMICOLON-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "double_quote_rmf", "DOUBLE-QUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "bq_cons", "BQ-CONS", 2, 0, false);
		SubLFiles.declareMacro(reader.myName, "bq_list", "BQ-LIST");
		SubLFiles.declareMacro(reader.myName, "bq_listX", "BQ-LIST*");
		SubLFiles.declareMacro(reader.myName, "bq_append", "BQ-APPEND");
		SubLFiles.declareMacro(reader.myName, "bq_nconc", "BQ-NCONC");
		SubLFiles.declareFunction(reader.myName, "bq_vector", "BQ-VECTOR", 1, 0, false);
		SubLFiles.declareMacro(reader.myName, "bq_vector_append", "BQ-VECTOR-APPEND");
		SubLFiles.declareFunction(reader.myName, "backquotify", "BACKQUOTIFY", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "comma", "COMMA", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "self_evaluating_atom_p", "SELF-EVALUATING-ATOM-P", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "backquotify_1", "BACKQUOTIFY-1", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "backquote_rmf", "BACKQUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "comma_rmf", "COMMA-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "dispatching_rmf", "DISPATCHING-RMF", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_backslash_rmf", "SHARPSIGN-BACKSLASH-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_single_quote_rmf", "SHARPSIGN-SINGLE-QUOTE-RMF", 3, 0,
				false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_left_paren_rmf", "SHARPSIGN-LEFT-PAREN-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_asterisk_rmf", "SHARPSIGN-ASTERISK-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_colon_rmf", "SHARPSIGN-COLON-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_dot_rmf", "SHARPSIGN-DOT-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_number_in_radix", "READ-NUMBER-IN-RADIX", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_b_rmf", "SHARPSIGN-B-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_o_rmf", "SHARPSIGN-O-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_x_rmf", "SHARPSIGN-X-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_r_rmf", "SHARPSIGN-R-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_c_rmf", "SHARPSIGN-C-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_a_rmf", "SHARPSIGN-A-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_s_rmf", "SHARPSIGN-S-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_p_rmf", "SHARPSIGN-P-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_lookup", "READ-LOOKUP", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "set_read_lookup", "SET-READ-LOOKUP", 2, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_equals_rmf", "SHARPSIGN-EQUALS-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_sharpsign_rmf", "SHARPSIGN-SHARPSIGN-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "features_match", "FEATURES-MATCH", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "fix_features", "FIX-FEATURES", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "read_features", "READ-FEATURES", 1, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_plus_rmf", "SHARPSIGN-PLUS-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_minus_rmf", "SHARPSIGN-MINUS-RMF", 3, 0, false);
		SubLFiles.declareFunction(reader.myName, "sharpsign_vertical_bar_rmf", "SHARPSIGN-VERTICAL-BAR-RMF", 3, 0,
				false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12092)
	public static SubLObject digit_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return SubLObjectFactory.makeBoolean(Numbers
					.logand(reader.$digit$.getGlobalValue(),
							reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
					.isPositive()
					&& CommonSymbols.NIL != Characters.digit_char_p(ch, reader.$read_base$.getDynamicValue(thread)));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 64590)
	public static SubLObject dispatching_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject arg = CommonSymbols.NIL;
				SubLObject next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				for (; CommonSymbols.NIL != Characters.digit_char_p(next_ch, CommonSymbols.TEN_INTEGER);) {
					if (CommonSymbols.NIL == arg)
						arg = CommonSymbols.ZERO_INTEGER;
					arg = Numbers.add(Numbers.multiply(arg, CommonSymbols.TEN_INTEGER),
							Characters.digit_char_p(next_ch, CommonSymbols.TEN_INTEGER));
					next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				}
				{
					SubLObject function = reader.get_dispatch_macro_character(ch, next_ch, CommonSymbols.UNPROVIDED);
					if (CommonSymbols.NIL != function) {
						thread.resetMultipleValues();
						{
							SubLObject value = Functions.funcall(function, stream, next_ch, arg);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							return Values.values(value, goodp);
						}
					} else if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
						return Values.values(CommonSymbols.NIL, CommonSymbols.T);
					else
						reader.simple_reader_error(reader.$str198$Undefined_reader_macro__A_A_,
								ConsesLow.list(ch, next_ch));
				}
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12416)
	public static SubLObject dot_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$dot$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 56817)
	public static SubLObject double_quote_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject state = reader.$kw176$NORMAL;
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					for (; true;) {
						SubLObject next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						SubLObject pcase_var = state;
						if (pcase_var.eql(reader.$kw176$NORMAL)) {
							if (CommonSymbols.NIL != Characters.charE(next_ch, ch))
								return Values.values(CommonSymbols.NIL, CommonSymbols.T);
							else if (CommonSymbols.NIL != reader.single_escape_syntaxp(next_ch))
								state = reader.$kw177$ESCAPE;
						} else if (pcase_var.eql(reader.$kw177$ESCAPE))
							state = reader.$kw176$NORMAL;
					}
				else {
					SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
					reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
					reader._csetf_read_token_buffer(token, Strings
							.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
					reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
					for (; true;) {
						SubLObject next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						SubLObject pcase_var = state;
						if (pcase_var.eql(reader.$kw176$NORMAL)) {
							if (CommonSymbols.NIL != Characters.charE(next_ch, ch))
								return Values.values(reader.read_token_string(token), CommonSymbols.T);
							else if (CommonSymbols.NIL != reader.single_escape_syntaxp(next_ch))
								state = reader.$kw177$ESCAPE;
							else
								reader.add_to_token(next_ch, token, CommonSymbols.NIL);
						} else if (pcase_var.eql(reader.$kw177$ESCAPE)) {
							reader.add_to_token(next_ch, token, CommonSymbols.NIL);
							state = reader.$kw176$NORMAL;
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 23444)
	public static SubLObject end_of_file_error(SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$throw_end_of_file_p$.getDynamicValue(thread))
				Dynamic.sublisp_throw(reader.$sym102$END_OF_FILE, CommonSymbols.T);
			else
				reader.simple_reader_error(reader.$str103$End_of_file_on_stream__S_, ConsesLow.list(stream));
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12619)
	public static SubLObject exponent_marker_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$exponent_marker$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 72396)
	public static SubLObject features_match(SubLObject feature) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (feature.isCons()) {
				SubLObject pcase_var = feature.first();
				if (pcase_var.eql(reader.$kw207$NOT)) {
					if (CommonSymbols.NIL != conses_high.cddr(feature))
						reader.simple_reader_error(reader.$str208$Bogus_feature_expression__S_,
								ConsesLow.list(feature));
					return SubLObjectFactory
							.makeBoolean(CommonSymbols.NIL == reader.features_match(conses_high.cadr(feature)));
				} else if (pcase_var.eql(reader.$kw209$AND)) {
					{
						SubLObject cdolist_list_var = feature.rest();
						SubLObject subfeature = CommonSymbols.NIL;
						for (subfeature = cdolist_list_var
								.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
										.rest(), subfeature = cdolist_list_var.first())
							if (CommonSymbols.NIL == reader.features_match(subfeature))
								return CommonSymbols.NIL;
					}
					return CommonSymbols.T;
				} else if (pcase_var.eql(reader.$kw210$OR)) {
					{
						SubLObject cdolist_list_var = feature.rest();
						SubLObject subfeature = CommonSymbols.NIL;
						for (subfeature = cdolist_list_var
								.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
										.rest(), subfeature = cdolist_list_var.first())
							if (CommonSymbols.NIL != reader.features_match(subfeature))
								return CommonSymbols.T;
					}
					return CommonSymbols.NIL;
				} else
					reader.simple_reader_error(reader.$str211$Unknown_feature_operator__S_,
							ConsesLow.list(feature.first()));
			} else
				return conses_high.member(feature, reader.$features$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 73044)
	public static SubLObject fix_features(SubLObject features) {
		if (CommonSymbols.NIL == features)
			return features;
		else if (features.isSymbol())
			return Symbols.make_keyword(features);
		else if (features.isCons())
			return ConsesLow.cons(reader.fix_features(features.first()), reader.fix_features(features.rest()));
		else
			return features;
	}

	@SubL(source = "sublisp/reader.lisp", position = 44874)
	public static SubLObject float_parse_integer(SubLObject string, SubLObject start, SubLObject end,
			SubLObject radix) {
		{
			SubLObject value = CommonSymbols.NIL;
			SubLObject i = CommonSymbols.NIL;
			for (i = start; !i.numGE(end); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				SubLObject digit = Characters.digit_char_p(Strings.sublisp_char(string, i), radix);
				value = Numbers.add(
						Numbers.multiply(CommonSymbols.NIL != value ? (SubLObject) value : reader.$float144$0_0, radix),
						Numbers.sublisp_float(digit, CommonSymbols.UNPROVIDED));
			}
			return value;
		}
	}

	/** Deal with READTABLE-CASE. */
	@SubL(source = "sublisp/reader.lisp", position = 39501)
	public static SubLObject frob_case(SubLObject token) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject frobber = CommonSymbols.NIL;
				SubLObject pcase_var = reader.readtable_case(reader.$readtable$.getDynamicValue(thread));
				if (pcase_var.eql(reader.$kw138$PRESERVE)) {
				} else if (pcase_var.eql(reader.$kw42$UPCASE))
					frobber = reader.$kw42$UPCASE;
				else if (pcase_var.eql(reader.$kw136$DOWNCASE))
					frobber = reader.$kw136$DOWNCASE;
				else if (pcase_var.eql(reader.$kw139$INVERT)) {
					SubLObject buffer = reader.read_token_buffer(token);
					SubLObject escapes = reader.read_token_escapes(token);
					SubLObject upcase = CommonSymbols.NIL;
					SubLObject downcase = CommonSymbols.NIL;
					SubLObject cdotimes_end_var = reader.read_token_pointer(token);
					SubLObject i = CommonSymbols.NIL;
					for (i = CommonSymbols.ZERO_INTEGER; i
							.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
						SubLObject escape_idx = escapes.first();
						if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
							escapes = escapes.rest();
						else {
							SubLObject ch = Strings.sublisp_char(buffer, i);
							if (CommonSymbols.NIL == Characters.charE(ch, Characters.char_downcase(ch)))
								upcase = CommonSymbols.T;
							if (CommonSymbols.NIL == Characters.charE(ch, Characters.char_upcase(ch)))
								downcase = CommonSymbols.T;
						}
					}
					if (CommonSymbols.NIL != upcase && CommonSymbols.NIL != downcase) {
					} else if (CommonSymbols.NIL != upcase)
						frobber = reader.$kw136$DOWNCASE;
					else if (CommonSymbols.NIL != downcase)
						frobber = reader.$kw42$UPCASE;
				}
				if (CommonSymbols.NIL != frobber) {
					SubLObject buffer = reader.read_token_buffer(token);
					SubLObject escapes = reader.read_token_escapes(token);
					SubLObject cdotimes_end_var = reader.read_token_pointer(token);
					SubLObject i = CommonSymbols.NIL;
					for (i = CommonSymbols.ZERO_INTEGER; i
							.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
						SubLObject escape_idx = escapes.first();
						if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
							escapes = escapes.rest();
						else {
							SubLObject curr = Strings.sublisp_char(buffer, i);
							if (frobber == reader.$kw42$UPCASE)
								Strings.set_char(buffer, i, Characters.char_upcase(curr));
							else
								Strings.set_char(buffer, i, Characters.char_downcase(curr));
						}
					}
				}
			}
			return token;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 15884)
	public static SubLObject get_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char,
			SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		{
			SubLObject bucket = conses_high.assoc(disp_char, reader.readtable_dispatch_tables(readtable),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL == bucket)
				Errors.error(reader.$str67$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
			return Hashtables.gethash(Characters.char_upcase(sub_char), bucket.rest(), CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 16229)
	public static SubLObject get_macro_character(SubLObject v_char, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		{
			SubLObject syntax = CommonSymbols.NIL != reader.single_byte_p(v_char)
					? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(readtable),
							Characters.char_code(v_char))
					: Hashtables.gethash(v_char, reader.readtable_character_syntax(readtable),
							reader.$kw43$CONSTITUENT);
			if (syntax == reader.$kw54$TERMINATING_MACRO || syntax == reader.$kw55$NON_TERMINATING_MACRO)
				return Values.values(reader.character_function(v_char, readtable),
						Equality.eq(syntax, reader.$kw55$NON_TERMINATING_MACRO));
			else
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 11109)
	public static SubLObject has_traitp(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject ch = CommonSymbols.NIL;
			SubLObject trait = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list59);
			ch = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list59);
			trait = current.first();
			current = current.rest();
			{
				SubLObject readtable = current.isCons() ? (SubLObject) current.first() : reader.$sym46$_READTABLE_;
				cdestructuring_bind.destructuring_bind_must_listp(current, datum, reader.$list59);
				current = current.rest();
				if (CommonSymbols.NIL == current)
					return ConsesLow.list(reader.$sym60$PLUSP, ConsesLow.list(reader.$sym61$LOGAND, trait,
							ConsesLow.list(reader.$sym62$CHARACTER_TRAITS, ch, readtable)));
				else
					cdestructuring_bind.cdestructuring_bind_error(datum, reader.$list59);
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 24136)
	public static SubLObject illegal_argument_error(SubLObject stream, SubLObject ch, SubLObject arg) {
		reader.simple_reader_error(reader.$str107$Illegal_argument__D_for_the__A_re, ConsesLow.list(arg, ch));
		return CommonSymbols.NIL;
	}

	public static SubLObject init_reader_file() {
		reader.$whitespace_1_chars$ = SubLFiles.defvar("*WHITESPACE-1-CHARS*",
				ConsesLow.list(Characters.CHAR_space, Characters.code_char(CommonSymbols.TEN_INTEGER),
						Characters.code_char(CommonSymbols.THIRTEEN_INTEGER), Characters.CHAR_tab, Characters.CHAR_page,
						Characters.CHAR_rubout));
		reader.$read_base$ = SubLFiles.defvar("*READ-BASE*", CommonSymbols.TEN_INTEGER);
		reader.$read_default_float_format$ = SubLFiles.defvar("*READ-DEFAULT-FLOAT-FORMAT*", reader.$sym2$DOUBLE_FLOAT);
		reader.$read_eval$ = SubLFiles.defvar("*READ-EVAL*", CommonSymbols.T);
		reader.$read_suppress$ = SubLFiles.defvar("*READ-SUPPRESS*", CommonSymbols.NIL);
		reader.$features$ = SubLFiles.defvar("*FEATURES*", reader.$list3);
		reader.$readtable$ = SubLFiles.defvar("*READTABLE*", CommonSymbols.NIL);
		reader.$initial_table_size$ = SubLFiles.defparameter("*INITIAL-TABLE-SIZE*", reader.$int4$32);
		reader.$single_byte_max_code$ = SubLFiles.defconstant("*SINGLE-BYTE-MAX-CODE*", reader.$int5$128);
		reader.$dtp_readtable$ = SubLFiles.defconstant("*DTP-READTABLE*", reader.$sym6$READTABLE);
		reader.$alphabetic$ = SubLFiles.defconstant("*ALPHABETIC*", CommonSymbols.ONE_INTEGER);
		reader.$digit$ = SubLFiles.defconstant("*DIGIT*", CommonSymbols.TWO_INTEGER);
		reader.$package_marker$ = SubLFiles.defconstant("*PACKAGE-MARKER*", CommonSymbols.FOUR_INTEGER);
		reader.$plus_sign$ = SubLFiles.defconstant("*PLUS-SIGN*", CommonSymbols.EIGHT_INTEGER);
		reader.$minus_sign$ = SubLFiles.defconstant("*MINUS-SIGN*", CommonSymbols.SIXTEEN_INTEGER);
		reader.$dot$ = SubLFiles.defconstant("*DOT*", reader.$int4$32);
		reader.$decimal_point$ = SubLFiles.defconstant("*DECIMAL-POINT*", reader.$int39$64);
		reader.$ratio_marker$ = SubLFiles.defconstant("*RATIO-MARKER*", reader.$int5$128);
		reader.$exponent_marker$ = SubLFiles.defconstant("*EXPONENT-MARKER*", reader.$int40$256);
		reader.$invalid$ = SubLFiles.defconstant("*INVALID*", reader.$int41$512);
		reader.$standard_readtable$ = SubLFiles.defvar("*STANDARD-READTABLE*", CommonSymbols.NIL);
		reader.$throw_reader_error_p$ = SubLFiles.defvar("*THROW-READER-ERROR-P*", CommonSymbols.NIL);
		reader.$throw_end_of_file_p$ = SubLFiles.defvar("*THROW-END-OF-FILE-P*", CommonSymbols.NIL);
		reader.$read_lookup_table$ = SubLFiles.defvar("*READ-LOOKUP-TABLE*", CommonSymbols.NIL);
		reader.$initial_token_size$ = SubLFiles.defconstant("*INITIAL-TOKEN-SIZE*", reader.$int4$32);
		reader.$dtp_read_token$ = SubLFiles.defconstant("*DTP-READ-TOKEN*", reader.$sym113$READ_TOKEN);
		reader.$consing_dot$ = SubLFiles.defparameter("*CONSING-DOT*", reader.$sym140$CONSING_DOT);
		reader.$keyword_package$ = SubLFiles.deflexical("*KEYWORD-PACKAGE*",
				Packages.find_package(reader.$str141$KEYWORD));
		reader.$reading_list$ = SubLFiles.defvar("*READING-LIST*", CommonSymbols.NIL);
		reader.$reading_fake_list$ = SubLFiles.defvar("*READING-FAKE-LIST*", CommonSymbols.NIL);
		reader.$right_paren$ = SubLFiles.defparameter("*RIGHT-PAREN*", reader.$sym165$RIGHT_PAREN);
		reader.$ignore_extra_right_parens$ = SubLFiles.defparameter("*IGNORE-EXTRA-RIGHT-PARENS*", CommonSymbols.NIL);
		reader.$bq_comma$ = SubLFiles.defparameter("*BQ-COMMA*", Symbols.make_symbol(reader.$str185$_));
		reader.$bq_atsign$ = SubLFiles.defparameter("*BQ-ATSIGN*", Symbols.make_symbol(reader.$str186$_));
		reader.$bq_dot$ = SubLFiles.defparameter("*BQ-DOT*", Symbols.make_symbol(reader.$str187$_));
		reader.$bq_vector$ = SubLFiles.defparameter("*BQ-VECTOR*", Symbols.make_symbol(reader.$str188$BQ_VECTOR));
		reader.$backquote_depth$ = SubLFiles.defvar("*BACKQUOTE-DEPTH*", CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 52821)
	public static SubLObject invalid_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)) {
				SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
				reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
				reader._csetf_read_token_buffer(token,
						Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
				reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
				return Values.values(reader.read_token(stream, token, CommonSymbols.NIL), CommonSymbols.T);
			} else
				reader.simple_reader_error(reader.$str134$_A_is_an_invalid_character_, ConsesLow.list(ch));
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 9521)
	public static SubLObject invalid_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw53$INVALID);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 23644)
	public static SubLObject invalid_token_syntax_error(SubLObject stream, SubLObject token) {
		reader.simple_reader_error(reader.$str104$_S_is_invalid_token_syntax_,
				ConsesLow.list(reader.read_token_string(token)));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12698)
	public static SubLObject invalid_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$invalid$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 54250)
	public static SubLObject left_paren_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject state = reader.$kw145$INITIAL;
				SubLObject list = CommonSymbols.NIL;
				SubLObject tail = CommonSymbols.NIL;
				SubLObject object = CommonSymbols.NIL;
				for (; true;) {
					{
						SubLObject _prev_bind_0 = reader.$reading_list$.currentBinding(thread);
						try {
							reader.$reading_list$.bind(CommonSymbols.T, thread);
							object = reader.read_internal(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						} finally {
							reader.$reading_list$.rebind(_prev_bind_0, thread);
						}
					}
					{
						SubLObject pcase_var = state;
						if (pcase_var.eql(reader.$kw145$INITIAL)) {
							if (object == reader.$right_paren$.getDynamicValue(thread))
								return Values.values(CommonSymbols.NIL, CommonSymbols.T);
							else if (object == reader.$consing_dot$.getDynamicValue(thread))
								Errors.error(reader.$str166$Nothing_before_consing_dot_);
							else {
								if (CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread)) {
									list = ConsesLow.cons(object, CommonSymbols.NIL);
									tail = list;
								}
								state = reader.$kw167$LIST;
							}
						} else if (pcase_var.eql(reader.$kw167$LIST)) {
							if (object == reader.$right_paren$.getDynamicValue(thread))
								return Values.values(list, CommonSymbols.T);
							else if (object == reader.$consing_dot$.getDynamicValue(thread))
								state = reader.$kw168$CONSING_DOT;
							else if (CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread)) {
								ConsesLow.rplacd(tail, ConsesLow.cons(object, CommonSymbols.NIL));
								tail = tail.rest();
							}
						} else if (pcase_var.eql(reader.$kw168$CONSING_DOT)) {
							if (object == reader.$right_paren$.getDynamicValue(thread))
								reader.simple_reader_error(reader.$str169$Nothing_after_consing_dot_,
										CommonSymbols.NIL);
							else if (object == reader.$consing_dot$.getDynamicValue(thread))
								reader.simple_reader_error(reader.$str170$Too_many_consing_dots_, CommonSymbols.NIL);
							else {
								if (CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
									ConsesLow.rplacd(tail, object);
								state = reader.$kw171$AFTER_CONSING_DOT;
							}
						} else if (pcase_var.eql(reader.$kw171$AFTER_CONSING_DOT))
							if (object == reader.$right_paren$.getDynamicValue(thread))
								return Values.values(list, CommonSymbols.T);
							else
								reader.simple_reader_error(reader.$str172$Too_many_objects_after_consing_do,
										CommonSymbols.NIL);
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 4562)
	public static SubLObject loop(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return ConsesLow.listS(reader.$sym0$CDO, CommonSymbols.NIL, reader.$list1,
					ConsesLow.append(body, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 14699)
	public static SubLObject make_dispatch_macro_character(SubLObject v_char, SubLObject non_terminating_p,
			SubLObject readtable) {
		if (non_terminating_p == CommonSymbols.UNPROVIDED)
			non_terminating_p = CommonSymbols.NIL;
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			reader._csetf_readtable_dispatch_tables(readtable,
					Sequences.delete(v_char, reader.readtable_dispatch_tables(readtable),
							Symbols.symbol_function(CommonSymbols.EQL), Symbols.symbol_function(reader.$sym64$CAR),
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
			reader._csetf_readtable_dispatch_tables(readtable,
					ConsesLow.cons(
							ConsesLow.cons(v_char,
									Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
											CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)),
							reader.readtable_dispatch_tables(readtable)));
			reader.set_character_function(v_char, reader.$sym65$DISPATCHING_RMF, readtable);
			reader.set_character_syntax(v_char, CommonSymbols.NIL != non_terminating_p
					? (SubLObject) reader.$kw55$NON_TERMINATING_MACRO : reader.$kw54$TERMINATING_MACRO, readtable);
			return CommonSymbols.T;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject make_read_token(SubLObject arglist) {
		if (arglist == CommonSymbols.UNPROVIDED)
			arglist = CommonSymbols.NIL;
		{
			SubLObject v_new = new $read_token_native();
			SubLObject next = CommonSymbols.NIL;
			for (next = arglist; CommonSymbols.NIL != next; next = conses_high.cddr(next)) {
				SubLObject current_arg = next.first();
				SubLObject current_value = conses_high.cadr(next);
				SubLObject pcase_var = current_arg;
				if (pcase_var.eql(reader.$kw126$POINTER))
					reader._csetf_read_token_pointer(v_new, current_value);
				else if (pcase_var.eql(reader.$kw127$BUFFER))
					reader._csetf_read_token_buffer(v_new, current_value);
				else if (pcase_var.eql(reader.$kw128$ESCAPES))
					reader._csetf_read_token_escapes(v_new, current_value);
				else
					Errors.error(reader.$str38$Invalid_slot__S_for_construction_, current_arg);
			}
			return v_new;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject make_readtable(SubLObject arglist) {
		if (arglist == CommonSymbols.UNPROVIDED)
			arglist = CommonSymbols.NIL;
		{
			SubLObject v_new = new $readtable_native();
			SubLObject next = CommonSymbols.NIL;
			for (next = arglist; CommonSymbols.NIL != next; next = conses_high.cddr(next)) {
				SubLObject current_arg = next.first();
				SubLObject current_value = conses_high.cadr(next);
				SubLObject pcase_var = current_arg;
				if (pcase_var.eql(reader.$kw30$CASE))
					reader._csetf_readtable_case(v_new, current_value);
				else if (pcase_var.eql(reader.$kw31$CHARACTER_SYNTAX))
					reader._csetf_readtable_character_syntax(v_new, current_value);
				else if (pcase_var.eql(reader.$kw32$SINGLE_BYTE_CHAR_SYNTAX))
					reader._csetf_readtable_single_byte_char_syntax(v_new, current_value);
				else if (pcase_var.eql(reader.$kw33$MACRO_FUNCTIONS))
					reader._csetf_readtable_macro_functions(v_new, current_value);
				else if (pcase_var.eql(reader.$kw34$SINGLE_BYTE_MACRO_FUNCTIONS))
					reader._csetf_readtable_single_byte_macro_functions(v_new, current_value);
				else if (pcase_var.eql(reader.$kw35$CONSTITUENT_TRAITS))
					reader._csetf_readtable_constituent_traits(v_new, current_value);
				else if (pcase_var.eql(reader.$kw36$SINGLE_BYTE_CONSTIT_TRAITS))
					reader._csetf_readtable_single_byte_constit_traits(v_new, current_value);
				else if (pcase_var.eql(reader.$kw37$DISPATCH_TABLES))
					reader._csetf_readtable_dispatch_tables(v_new, current_value);
				else
					Errors.error(reader.$str38$Invalid_slot__S_for_construction_, current_arg);
			}
			return v_new;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12347)
	public static SubLObject minus_sign_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$minus_sign$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 53303)
	public static SubLObject multiple_escape_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
			reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
			reader._csetf_read_token_buffer(token,
					Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
			reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
			reader.read_token(stream, token, CommonSymbols.T);
			return Values.values(reader.parse_token(stream, token), CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 9792)
	public static SubLObject multiple_escape_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw56$MULTIPLE_ESCAPE);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 9690)
	public static SubLObject non_terminating_macro_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw55$NON_TERMINATING_MACRO);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12202)
	public static SubLObject package_marker_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$package_marker$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 50448)
	public static SubLObject parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix,
			SubLObject junk_allowed) {
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = CommonSymbols.NIL;
		if (radix == CommonSymbols.UNPROVIDED)
			radix = CommonSymbols.TEN_INTEGER;
		if (junk_allowed == CommonSymbols.UNPROVIDED)
			junk_allowed = CommonSymbols.NIL;
		if (CommonSymbols.NIL == end)
			end = Sequences.length(string);
		if (CommonSymbols.NIL == junk_allowed)
			return Numbers.jrtl_parse_integer(string, start, end, radix);
		{
			SubLObject sign = CommonSymbols.MINUS_ONE_INTEGER;
			SubLObject i = start;
			SubLObject state = reader.$kw145$INITIAL;
			SubLObject value = CommonSymbols.NIL;
			for (; !i.numGE(end);) {
				{
					SubLObject ch = Strings.sublisp_char(string, i);
					SubLObject pcase_var = state;
					if (pcase_var.eql(reader.$kw145$INITIAL)) {
						if (CommonSymbols.NIL != reader.whitespace_1_char_p(ch)) {
						} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_plus))
							state = reader.$kw147$SIGN;
						else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_hyphen)) {
							sign = CommonSymbols.ONE_INTEGER;
							state = reader.$kw147$SIGN;
						} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, radix)) {
							value = Numbers.minus(Characters.digit_char_p(ch, radix));
							state = reader.$kw159$DIGIT;
						} else if (CommonSymbols.NIL != junk_allowed)
							return Values.values(CommonSymbols.NIL, i);
						else
							reader.simple_reader_error(reader.$str160$_S_does_not_contain_an_integer_,
									ConsesLow.list(Sequences.subseq(string, start, end)));
					} else if (pcase_var.eql(reader.$kw147$SIGN)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, radix)) {
							value = Numbers.minus(Characters.digit_char_p(ch, radix));
							state = reader.$kw159$DIGIT;
						} else if (CommonSymbols.NIL != junk_allowed)
							return Values.values(CommonSymbols.NIL, i);
						else
							reader.simple_reader_error(reader.$str160$_S_does_not_contain_an_integer_,
									ConsesLow.list(Sequences.subseq(string, start, end)));
					} else if (pcase_var.eql(reader.$kw159$DIGIT)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, radix))
							value = Numbers.subtract(Numbers.multiply(value, radix),
									Characters.digit_char_p(ch, radix));
						else if (CommonSymbols.NIL != reader.whitespace_1_char_p(ch))
							state = reader.$kw161$TRAILING_WHITESPACE;
						else if (CommonSymbols.NIL != junk_allowed)
							return Values.values(Numbers.multiply(sign, value), i);
						else
							reader.simple_reader_error(reader.$str160$_S_does_not_contain_an_integer_,
									ConsesLow.list(Sequences.subseq(string, start, end)));
					} else if (pcase_var.eql(reader.$kw161$TRAILING_WHITESPACE))
						if (CommonSymbols.NIL != reader.whitespace_1_char_p(ch)) {
						} else if (CommonSymbols.NIL != junk_allowed)
							return Values.values(Numbers.multiply(sign, value), i);
						else
							reader.simple_reader_error(reader.$str160$_S_does_not_contain_an_integer_,
									ConsesLow.list(Sequences.subseq(string, start, end)));
				}
				i = Numbers.add(i, CommonSymbols.ONE_INTEGER);
			}
			if (state == reader.$kw159$DIGIT || state == reader.$kw161$TRAILING_WHITESPACE)
				return Values.values(Numbers.multiply(sign, value), i);
			else if (CommonSymbols.NIL != junk_allowed)
				return Values.values(CommonSymbols.NIL, i);
			else
				reader.simple_reader_error(reader.$str160$_S_does_not_contain_an_integer_,
						ConsesLow.list(Sequences.subseq(string, start, end)));
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 45200)
	public static SubLObject parse_number(SubLObject stream, SubLObject token) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject state = reader.$kw145$INITIAL;
				SubLObject buffer = reader.read_token_buffer(token);
				SubLObject length = reader.read_token_pointer(token);
				SubLObject sign = CommonSymbols.ONE_INTEGER;
				SubLObject exponent_sign = CommonSymbols.ONE_INTEGER;
				SubLObject start1 = CommonSymbols.NIL;
				SubLObject end1 = CommonSymbols.NIL;
				SubLObject start2 = CommonSymbols.NIL;
				SubLObject end2 = CommonSymbols.NIL;
				SubLObject start3 = CommonSymbols.NIL;
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					SubLObject ch = Strings.sublisp_char(buffer, i);
					SubLObject pcase_var = state;
					if (pcase_var.eql(reader.$kw145$INITIAL)) {
						if (CommonSymbols.NIL != reader.decimal_point_traitp(ch))
							state = reader.$kw146$DOT1;
						else if (CommonSymbols.NIL != reader.plus_sign_traitp(ch))
							state = reader.$kw147$SIGN;
						else if (CommonSymbols.NIL != reader.minus_sign_traitp(ch)) {
							sign = CommonSymbols.MINUS_ONE_INTEGER;
							state = reader.$kw147$SIGN;
						} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
							start1 = i;
							state = reader.$kw148$DECIMALS;
						} else if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
							start1 = i;
							state = reader.$kw149$DIGITS;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw147$SIGN)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
							start1 = i;
							state = reader.$kw148$DECIMALS;
						} else if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
							start1 = i;
							state = reader.$kw149$DIGITS;
						} else if (CommonSymbols.NIL != reader.decimal_point_traitp(ch))
							state = reader.$kw146$DOT1;
						else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw148$DECIMALS)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
						} else if (CommonSymbols.NIL != reader.digit_traitp(ch))
							state = reader.$kw149$DIGITS;
						else if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch)) {
							end1 = i;
							state = reader.$kw150$EXPONENT;
						} else if (CommonSymbols.NIL != reader.decimal_point_traitp(ch)) {
							end1 = i;
							state = reader.$kw151$DOT2;
						} else if (CommonSymbols.NIL != reader.ratio_marker_traitp(ch)) {
							end1 = i;
							state = reader.$kw152$SLASH;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw149$DIGITS)) {
						if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
						} else if (CommonSymbols.NIL != reader.ratio_marker_traitp(ch)) {
							end1 = i;
							state = reader.$kw152$SLASH;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw152$SLASH)) {
						if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
							start2 = i;
							state = reader.$kw153$DENOMINATOR;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw153$DENOMINATOR)) {
						if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw146$DOT1)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
							start2 = i;
							state = reader.$kw154$FRACTION;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw154$FRACTION)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw151$DOT2)) {
						if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch)) {
							start2 = CommonSymbols.ZERO_INTEGER;
							end2 = CommonSymbols.ZERO_INTEGER;
							state = reader.$kw150$EXPONENT;
						} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
							start2 = i;
							state = reader.$kw155$DECIMALS2;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw155$DECIMALS2)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
						} else if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch)) {
							end2 = i;
							state = reader.$kw150$EXPONENT;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw150$EXPONENT)) {
						if (CommonSymbols.NIL != reader.plus_sign_traitp(ch))
							state = reader.$kw156$EXPONENT_SIGN;
						else if (CommonSymbols.NIL != reader.minus_sign_traitp(ch)) {
							exponent_sign = CommonSymbols.MINUS_ONE_INTEGER;
							state = reader.$kw156$EXPONENT_SIGN;
						} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
							start3 = i;
							state = reader.$kw157$EXPONENT_VALUE;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw156$EXPONENT_SIGN)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
							start3 = i;
							state = reader.$kw157$EXPONENT_VALUE;
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else if (pcase_var.eql(reader.$kw157$EXPONENT_VALUE)) {
						if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
						} else
							reader.invalid_token_syntax_error(stream, token);
					} else
						reader.simple_reader_error(reader.$str158$Can_t_happen_, CommonSymbols.NIL);
				}
				{
					SubLObject pcase_var = state;
					if (pcase_var.eql(reader.$kw149$DIGITS))
						return Numbers.multiply(sign, reader.parse_integer(buffer, start1, length,
								reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED));
					else if (pcase_var.eql(reader.$kw148$DECIMALS))
						return Numbers.multiply(sign, reader.parse_integer(buffer, start1, length,
								reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED));
					else if (pcase_var.eql(reader.$kw151$DOT2))
						return Numbers.multiply(sign, reader.parse_integer(buffer, start1, end1,
								CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED));
					else if (pcase_var.eql(reader.$kw153$DENOMINATOR))
						return Numbers.multiply(sign,
								Numbers.divide(
										reader.parse_integer(buffer, start1, end1,
												reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED),
										reader.parse_integer(buffer, start2, length,
												reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED)));
					else if (pcase_var.eql(reader.$kw154$FRACTION))
						return Numbers.multiply(sign,
								math_utilities.bellerophon(
										reader.parse_integer(buffer, start2, length, CommonSymbols.TEN_INTEGER,
												CommonSymbols.UNPROVIDED),
										Numbers.minus(Numbers.subtract(length, start2))));
					else if (pcase_var.eql(reader.$kw155$DECIMALS2)) {
						SubLObject left = reader.parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER,
								CommonSymbols.UNPROVIDED);
						SubLObject right = reader.parse_integer(buffer, start2, length, CommonSymbols.TEN_INTEGER,
								CommonSymbols.UNPROVIDED);
						return Numbers
								.multiply(sign,
										math_utilities
												.bellerophon(
														Numbers.add(
																Numbers.multiply(left,
																		Numbers.expt(CommonSymbols.TEN_INTEGER,
																				Numbers.subtract(length, start2))),
																right),
														Numbers.minus(Numbers.subtract(length, start2))));
					} else if (pcase_var.eql(reader.$kw157$EXPONENT_VALUE)) {
						SubLObject left = CommonSymbols.NIL != start1 ? (SubLObject) reader.parse_integer(buffer,
								start1, end1, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED) : CommonSymbols.NIL;
						SubLObject right = CommonSymbols.NIL != start2 ? (SubLObject) reader.parse_integer(buffer,
								start2, end2, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED) : CommonSymbols.NIL;
						SubLObject exponent = reader.parse_integer(buffer, start3, length, CommonSymbols.TEN_INTEGER,
								CommonSymbols.UNPROVIDED);
						if (CommonSymbols.NIL != left && CommonSymbols.NIL != right)
							return Numbers
									.multiply(sign,
											math_utilities
													.bellerophon(
															Numbers.add(
																	Numbers.multiply(left,
																			Numbers.expt(CommonSymbols.TEN_INTEGER,
																					Numbers.subtract(end2, start2))),
																	right),
															Numbers.subtract(Numbers.multiply(exponent_sign, exponent),
																	Numbers.subtract(end2, start2))));
						else if (CommonSymbols.NIL != left)
							return Numbers.multiply(sign,
									math_utilities.bellerophon(left, Numbers.multiply(exponent_sign, exponent)));
						else if (CommonSymbols.NIL != right)
							return Numbers.multiply(sign, math_utilities.bellerophon(right, Numbers.subtract(
									Numbers.multiply(exponent_sign, exponent), Numbers.subtract(end2, start2))));
						else
							return reader.invalid_token_syntax_error(stream, token);
					} else
						return reader.invalid_token_syntax_error(stream, token);
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 41253)
	public static SubLObject parse_symbol_or_consing_dot(SubLObject stream, SubLObject token) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			reader.frob_case(token);
			{
				SubLObject buffer = reader.read_token_buffer(token);
				SubLObject length = reader.read_token_pointer(token);
				SubLObject escapes = reader.read_token_escapes(token);
				SubLObject pkg_idx1 = CommonSymbols.NIL;
				SubLObject pkg_idx2 = CommonSymbols.NIL;
				SubLObject dot_count = CommonSymbols.ZERO_INTEGER;
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					SubLObject ch = Strings.sublisp_char(buffer, i);
					SubLObject escape_idx = escapes.first();
					if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
						escapes = escapes.rest();
					else if (CommonSymbols.NIL != reader.package_marker_traitp(ch)) {
						if (CommonSymbols.NIL != pkg_idx2)
							reader.invalid_token_syntax_error(stream, token);
						else if (CommonSymbols.NIL != pkg_idx1)
							pkg_idx2 = i;
						else
							pkg_idx1 = i;
					} else if (CommonSymbols.NIL != reader.dot_traitp(ch))
						dot_count = Numbers.add(dot_count, CommonSymbols.ONE_INTEGER);
				}
				if (dot_count.numE(length)) {
					if (length.numE(CommonSymbols.ONE_INTEGER)
							&& CommonSymbols.NIL != reader.$reading_list$.getDynamicValue(thread)
							&& CommonSymbols.NIL == reader.$reading_fake_list$.getDynamicValue(thread))
						return reader.$consing_dot$.getDynamicValue(thread);
					else
						return reader.invalid_token_syntax_error(stream, token);
				} else if (CommonSymbols.NIL != pkg_idx1 && CommonSymbols.NIL == pkg_idx2
						&& pkg_idx1.numE(CommonSymbols.ZERO_INTEGER)) {
					if (!length.numG(CommonSymbols.ONE_INTEGER))
						reader.invalid_token_syntax_error(stream, token);
					return Symbols.make_keyword(Sequences.subseq(buffer, CommonSymbols.ONE_INTEGER, length));
				} else if (CommonSymbols.NIL != pkg_idx1 && CommonSymbols.NIL == pkg_idx2
						&& pkg_idx1.numL(Numbers.subtract(length, CommonSymbols.ONE_INTEGER))) {
					SubLObject v_package = reader.reader_find_package(buffer, CommonSymbols.ZERO_INTEGER, pkg_idx1);
					SubLObject name = Sequences.subseq(buffer, Numbers.add(pkg_idx1, CommonSymbols.ONE_INTEGER),
							length);
					thread.resetMultipleValues();
					{
						SubLObject symbol = Packages.find_symbol(name, v_package);
						SubLObject status = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (status == reader.$kw142$EXTERNAL)
							return symbol;
						else if (v_package == reader.$keyword_package$.getGlobalValue())
							return Symbols.make_keyword(name);
						else
							reader.simple_reader_error(reader.$str143$_S_is_not_external_in__S_,
									ConsesLow.list(name, v_package));
					}
				} else if (CommonSymbols.NIL != pkg_idx1 && CommonSymbols.NIL != pkg_idx2
						&& pkg_idx2.numE(Numbers.add(pkg_idx1, CommonSymbols.ONE_INTEGER))
						&& pkg_idx1.numG(CommonSymbols.ZERO_INTEGER)
						&& pkg_idx2.numL(Numbers.subtract(length, CommonSymbols.ONE_INTEGER)))
					return Packages.intern(
							Sequences.subseq(buffer, Numbers.add(pkg_idx2, CommonSymbols.ONE_INTEGER), length),
							reader.reader_find_package(buffer, CommonSymbols.ZERO_INTEGER, pkg_idx1));
				else if (CommonSymbols.NIL == pkg_idx1 && CommonSymbols.NIL == pkg_idx2 && length.isPositive())
					return Packages.intern(Sequences.subseq(buffer, CommonSymbols.ZERO_INTEGER, length),
							Packages.$package$.getDynamicValue(thread));
				else
					return reader.invalid_token_syntax_error(stream, token);
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 37714)
	public static SubLObject parse_token(SubLObject stream, SubLObject token) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
				return CommonSymbols.NIL;
			else {
				SubLObject escapes = Sequences.nreverse(reader.read_token_escapes(token));
				reader._csetf_read_token_escapes(token, escapes);
				if (CommonSymbols.NIL == escapes && CommonSymbols.NIL != reader
						.potential_number_p(reader.read_token_buffer(token), reader.read_token_pointer(token)))
					return reader.parse_number(stream, token);
				else
					return reader.parse_symbol_or_consing_dot(stream, token);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12280)
	public static SubLObject plus_sign_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$plus_sign$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 34594)
	public static SubLObject potential_number_p(SubLObject string, SubLObject length) {
		{
			SubLObject letter_seen_p = CommonSymbols.NIL;
			SubLObject i = CommonSymbols.NIL;
			for (i = CommonSymbols.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				SubLObject ch = Strings.sublisp_char(string, i);
				if (CommonSymbols.NIL != reader.digit_traitp(ch) || CommonSymbols.NIL != reader.plus_sign_traitp(ch)
						|| CommonSymbols.NIL != reader.minus_sign_traitp(ch)
						|| CommonSymbols.NIL != reader.ratio_marker_traitp(ch)
						|| CommonSymbols.NIL != reader.decimal_point_traitp(ch)
						|| CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_caret)
						|| CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_underbar))
					letter_seen_p = CommonSymbols.NIL;
				else if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch))
					letter_seen_p = CommonSymbols.T;
				else if (CommonSymbols.NIL != reader.alphadigit_traitp(ch) && CommonSymbols.NIL == letter_seen_p)
					letter_seen_p = CommonSymbols.T;
				else
					return CommonSymbols.NIL;
			}
		}
		{
			SubLObject decimal_point_p = CommonSymbols.NIL;
			SubLObject decimal_digit_p = CommonSymbols.NIL;
			SubLObject digit_p = CommonSymbols.NIL;
			SubLObject i = CommonSymbols.NIL;
			for (i = CommonSymbols.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				SubLObject ch = Strings.sublisp_char(string, i);
				if (CommonSymbols.NIL != reader.digit_traitp(ch))
					digit_p = CommonSymbols.T;
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					decimal_digit_p = CommonSymbols.T;
				if (CommonSymbols.NIL != reader.decimal_point_traitp(ch))
					decimal_point_p = CommonSymbols.T;
			}
			if (CommonSymbols.NIL != decimal_point_p && CommonSymbols.NIL == decimal_digit_p
					|| CommonSymbols.NIL == digit_p)
				return CommonSymbols.NIL;
		}
		{
			SubLObject first = Strings.sublisp_char(string, CommonSymbols.ZERO_INTEGER);
			if (!(CommonSymbols.NIL != reader.digit_traitp(first) || CommonSymbols.NIL != reader.plus_sign_traitp(first)
					|| CommonSymbols.NIL != reader.minus_sign_traitp(first)
					|| CommonSymbols.NIL != reader.decimal_point_traitp(first)
					|| CommonSymbols.NIL != Characters.charE(first, Characters.CHAR_caret)
					|| CommonSymbols.NIL != Characters.charE(first, Characters.CHAR_underbar)))
				return CommonSymbols.NIL;
			if (CommonSymbols.NIL != reader.package_marker_traitp(first))
				return CommonSymbols.NIL;
		}
		{
			SubLObject last = Strings.sublisp_char(string, Numbers.subtract(length, CommonSymbols.ONE_INTEGER));
			if (CommonSymbols.NIL != reader.plus_sign_traitp(last)
					|| CommonSymbols.NIL != reader.minus_sign_traitp(last))
				return CommonSymbols.NIL;
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12546)
	public static SubLObject ratio_marker_traitp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Numbers.plusp(Numbers.logand(reader.$ratio_marker$.getGlobalValue(),
					reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 28046)
	public static SubLObject read(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = CommonSymbols.NIL;
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = CommonSymbols.NIL;
		{
			SubLObject value = reader.read_preserving_whitespace(stream, eof_error_p, eof_value, recursivep);
			SubLObject ch = streams_high.read_char(stream, CommonSymbols.NIL, CommonSymbols.NIL,
					CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL != ch
					&& (CommonSymbols.NIL == reader.whitespace_syntaxp(ch) || CommonSymbols.NIL != recursivep))
				streams_high.unread_char(ch, stream);
			return value;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 28443)
	public static SubLObject read_delimited_list(SubLObject v_char, SubLObject stream, SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = CommonSymbols.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = CommonSymbols.NIL;
		{
			SubLObject list = CommonSymbols.NIL;
			SubLObject tail = CommonSymbols.NIL;
			for (; true;) {
				SubLObject ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				if (CommonSymbols.NIL != Characters.charE(ch, v_char))
					return list;
				else if (CommonSymbols.NIL != reader.whitespace_syntaxp(ch)) {
				} else {
					streams_high.unread_char(ch, stream);
					{
						SubLObject next = ConsesLow.cons(
								reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T),
								CommonSymbols.NIL);
						if (CommonSymbols.NIL != list) {
							ConsesLow.rplacd(tail, next);
							tail = tail.rest();
						} else {
							list = next;
							tail = list;
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 73319)
	public static SubLObject read_features(SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject features = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = reader.$reading_fake_list$.currentBinding(thread);
					try {
						reader.$reading_fake_list$.bind(CommonSymbols.T, thread);
						features = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
					} finally {
						reader.$reading_fake_list$.rebind(_prev_bind_0, thread);
					}
				}
				return reader.features_match(reader.fix_features(features));
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 28913)
	public static SubLObject read_from_string(SubLObject string, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject start, SubLObject end, SubLObject preserve_whitespace) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = CommonSymbols.NIL;
		if (preserve_whitespace == CommonSymbols.UNPROVIDED)
			preserve_whitespace = CommonSymbols.NIL;
		{
			SubLObject result = CommonSymbols.NIL;
			SubLObject index = CommonSymbols.NIL;
			SubLObject in = CommonSymbols.NIL;
			try {
				in = streams_high.make_private_string_input_stream(string, start, end);
				if (CommonSymbols.NIL != preserve_whitespace)
					result = reader.read_preserving_whitespace(in, eof_error_p, eof_value, CommonSymbols.UNPROVIDED);
				else
					result = reader.read(in, eof_error_p, eof_value, CommonSymbols.UNPROVIDED);
				index = streams_high.stream_input_index(in);
			} finally {
				{
					SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
					try {
						Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
						streams_high.close(in, CommonSymbols.UNPROVIDED);
					} finally {
						Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return Values.values(result, index);
		}
	}

	/**
	 * Returns the values FORM NEW-START if read was successful. Returns the
	 * values NIL :ERROR if there was a reader error. Returns the values
	 * EOF-VALUE :ERROR if EOF-ERROR-P is nil and EOF occurs. Causes an error if
	 * EOF-ERROR-P is not nil and EOF occurs. Returns a second value which is an
	 * integer indicating the position in the string to start reading from again
	 * or :ERROR if there was some kind of reader error.
	 */
	@SubL(source = "sublisp/reader.lisp", position = 30932)
	public static SubLObject read_from_string_ignoring_errors(SubLObject string, SubLObject eof_error_p,
			SubLObject eof_value, SubLObject start, SubLObject end) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = reader.$kw111$EOF;
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject index = CommonSymbols.NIL;
				SubLObject value = CommonSymbols.NIL;
				SubLObject status = CommonSymbols.NIL;
				SubLObject stream = CommonSymbols.NIL;
				try {
					stream = streams_high.make_private_string_input_stream(string, start, end);
					thread.resetMultipleValues();
					{
						SubLObject value_1 = reader.read_ignoring_errors(stream, eof_error_p, eof_value);
						SubLObject status_1 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						value = value_1;
						status = status_1;
					}
					index = streams_high.stream_input_index(stream);
				} finally {
					{
						SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							Threads.$is_thread_performing_cleanupP$.bind(CommonSymbols.T, thread);
							streams_high.close(stream, CommonSymbols.UNPROVIDED);
						} finally {
							Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
				if (status == reader.$kw112$ERROR)
					return Values.values(value, status);
				else
					return Values.values(value, index);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 30308)
	public static SubLObject read_ignoring_errors(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = reader.$kw111$EOF;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject end_of_file_p = CommonSymbols.NIL;
				SubLObject reader_error_p = CommonSymbols.NIL;
				SubLObject result = CommonSymbols.NIL;
				try {
					try {
						{
							SubLObject _prev_bind_0 = reader.$throw_end_of_file_p$.currentBinding(thread);
							SubLObject _prev_bind_1 = reader.$throw_reader_error_p$.currentBinding(thread);
							try {
								reader.$throw_end_of_file_p$.bind(
										CommonSymbols.NIL != reader.$throw_end_of_file_p$.getDynamicValue(thread)
												? (SubLObject) CommonSymbols.T
												: SubLObjectFactory.makeBoolean(CommonSymbols.NIL == eof_error_p),
										thread);
								reader.$throw_reader_error_p$.bind(CommonSymbols.T, thread);
								result = reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
										CommonSymbols.UNPROVIDED);
							} finally {
								reader.$throw_reader_error_p$.rebind(_prev_bind_1, thread);
								reader.$throw_end_of_file_p$.rebind(_prev_bind_0, thread);
							}
						}
					} catch (Throwable ccatch_env_var) {
						reader_error_p = Errors.handleThrowable(ccatch_env_var, reader.$sym100$READER_ERROR);
					}
				} catch (Throwable ccatch_env_var) {
					end_of_file_p = Errors.handleThrowable(ccatch_env_var, reader.$sym102$END_OF_FILE);
				}
				if (CommonSymbols.NIL != reader_error_p)
					return Values.values(CommonSymbols.NIL, reader.$kw112$ERROR);
				else if (CommonSymbols.NIL != end_of_file_p)
					return Values.values(eof_value, reader.$kw112$ERROR);
				else
					return Values.values(result, CommonSymbols.NIL);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 24426)
	public static SubLObject read_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			for (; true;) {
				SubLObject ch = streams_high.read_char(stream, eof_error_p, CommonSymbols.NIL,
						CommonSymbols.UNPROVIDED);
				if (CommonSymbols.NIL != ch) {
					SubLObject func = reader.character_function(ch, CommonSymbols.UNPROVIDED);
					SubLObject the_result = CommonSymbols.NIL;
					SubLObject good_p = CommonSymbols.NIL;
					if (func == reader.$sym44$CONSTITUENT_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.constituent_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym68$WHITESPACE_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.whitespace_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym71$LEFT_PAREN_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.left_paren_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym72$RIGHT_PAREN_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.right_paren_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym73$SINGLE_QUOTE_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.single_quote_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym75$DOUBLE_QUOTE_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.double_quote_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym76$BACKQUOTE_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.backquote_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym77$COMMA_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.comma_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else if (func == reader.$sym74$SEMICOLON_RMF) {
						thread.resetMultipleValues();
						{
							SubLObject result = reader.semicolon_rmf(stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					} else {
						thread.resetMultipleValues();
						{
							SubLObject result = Functions
									.funcall(reader.character_function(ch, CommonSymbols.UNPROVIDED), stream, ch);
							SubLObject goodp = thread.secondMultipleValue();
							thread.resetMultipleValues();
							the_result = result;
							good_p = goodp;
						}
					}
					if (CommonSymbols.NIL != good_p)
						return the_result;
				} else
					return eof_value;
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 70870)
	public static SubLObject read_lookup(SubLObject number) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$read_lookup_table$.getDynamicValue(thread)) {
				thread.resetMultipleValues();
				{
					SubLObject value = Hashtables.gethash(number, reader.$read_lookup_table$.getDynamicValue(thread),
							CommonSymbols.UNPROVIDED);
					SubLObject valuep = thread.secondMultipleValue();
					thread.resetMultipleValues();
					return Values.values(value, valuep);
				}
			} else
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 68517)
	public static SubLObject read_number_in_radix(SubLObject stream, SubLObject radix) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
				reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
				reader._csetf_read_token_buffer(token,
						Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
				reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
				reader.read_token(stream, token, CommonSymbols.NIL);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return CommonSymbols.NIL;
				else {
					SubLObject number = CommonSymbols.NIL;
					{
						SubLObject _prev_bind_0 = reader.$read_base$.currentBinding(thread);
						try {
							reader.$read_base$.bind(radix, thread);
							number = reader.parse_number(stream, token);
						} finally {
							reader.$read_base$.rebind(_prev_bind_0, thread);
						}
					}
					return number;
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 27576)
	public static SubLObject read_preserving_whitespace(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = CommonSymbols.NIL;
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != recursivep) {
				SubLObject value = reader.read_internal(stream, eof_error_p, eof_value);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return CommonSymbols.NIL;
				else
					return value;
			} else {
				SubLObject value = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = reader.$read_lookup_table$.currentBinding(thread);
					try {
						reader.$read_lookup_table$.bind(CommonSymbols.NIL, thread);
						value = reader.read_preserving_whitespace(stream, eof_error_p, eof_value, CommonSymbols.T);
					} finally {
						reader.$read_lookup_table$.rebind(_prev_bind_0, thread);
					}
				}
				return value;
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 32966)
	public static SubLObject read_token(SubLObject stream, SubLObject token, SubLObject escapep) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			for (; true;) {
				SubLObject ch = streams_high.read_char(stream, CommonSymbols.NIL, CommonSymbols.NIL,
						CommonSymbols.UNPROVIDED);
				if (CommonSymbols.NIL != escapep) {
					if (CommonSymbols.NIL == ch)
						reader.end_of_file_error(stream);
					else if (CommonSymbols.NIL != reader.constituent_syntaxp(ch)
							|| CommonSymbols.NIL != reader.non_terminating_macro_syntaxp(ch)
							|| CommonSymbols.NIL != reader.terminating_macro_syntaxp(ch)
							|| CommonSymbols.NIL != reader.whitespace_syntaxp(ch))
						reader.add_to_token(ch, token, CommonSymbols.T);
					else if (CommonSymbols.NIL != reader.single_escape_syntaxp(ch))
						reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
					else if (CommonSymbols.NIL != reader.multiple_escape_syntaxp(ch))
						escapep = CommonSymbols.NIL;
					else if (CommonSymbols.NIL != reader.invalid_syntaxp(ch)
							&& CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
						reader.simple_reader_error(reader.$str134$_A_is_an_invalid_character_, ConsesLow.list(ch));
					else
						reader.simple_reader_error(reader.$str135$Fell_through_character_syntax_on_,
								ConsesLow.list(ch));
				} else if (CommonSymbols.NIL == ch)
					return token;
				else if (CommonSymbols.NIL != reader.constituent_syntaxp(ch)
						|| CommonSymbols.NIL != reader.non_terminating_macro_syntaxp(ch))
					reader.add_to_token(ch, token, CommonSymbols.NIL);
				else if (CommonSymbols.NIL != reader.single_escape_syntaxp(ch))
					reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
				else if (CommonSymbols.NIL != reader.multiple_escape_syntaxp(ch))
					escapep = CommonSymbols.T;
				else if (CommonSymbols.NIL != reader.invalid_syntaxp(ch)
						&& CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
					reader.simple_reader_error(reader.$str134$_A_is_an_invalid_character_, ConsesLow.list(ch));
				else if (CommonSymbols.NIL != reader.terminating_macro_syntaxp(ch)
						|| CommonSymbols.NIL != reader.whitespace_syntaxp(ch)) {
					streams_high.unread_char(ch, stream);
					return token;
				} else
					reader.simple_reader_error(reader.$str135$Fell_through_character_syntax_on_, ConsesLow.list(ch));
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject read_token_buffer(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym114$READ_TOKEN_P);
		return object.getField3();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject read_token_escapes(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym114$READ_TOKEN_P);
		return object.getField4();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject read_token_p(SubLObject object) {
		return object.getClass() == $read_token_native.class ? (SubLObject) CommonSymbols.T : CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject read_token_pointer(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym114$READ_TOKEN_P);
		return object.getField2();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900)
	public static SubLObject read_token_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 32850)
	public static SubLObject read_token_string(SubLObject token) {
		return Sequences.subseq(reader.read_token_buffer(token), CommonSymbols.ZERO_INTEGER,
				reader.read_token_pointer(token));
	}

	@SubL(source = "sublisp/reader.lisp", position = 39241)
	public static SubLObject reader_find_package(SubLObject string, SubLObject start, SubLObject end) {
		{
			SubLObject v_package = Packages.find_package(Sequences.subseq(string, start, end));
			if (CommonSymbols.NIL == v_package)
				reader.simple_reader_error(reader.$str137$_S_is_not_a_known_package_,
						ConsesLow.list(Sequences.subseq(string, start, end)));
			return v_package;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_case(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField2();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_character_syntax(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField3();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_constituent_traits(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField7();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_dispatch_tables(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField9();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_macro_functions(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField5();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_p(SubLObject object) {
		return object.getClass() == $readtable_native.class ? (SubLObject) CommonSymbols.T : CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_single_byte_char_syntax(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField4();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_single_byte_constit_traits(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField8();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265)
	public static SubLObject readtable_single_byte_macro_functions(SubLObject object) {
		SubLTrampolineFile.checkType(object, reader.$sym7$READTABLE_P);
		return object.getField6();
	}

	@SubL(source = "sublisp/reader.lisp", position = 15307)
	public static SubLObject readtablep(SubLObject object) {
		return reader.readtable_p(object);
	}

	/** A shorthand for saying that trait should be alphabetic from now on. */
	@SubL(source = "sublisp/reader.lisp", position = 11572)
	public static SubLObject reset_trait(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_constit_traits(readtable), Characters.char_code(ch),
					reader.$alphabetic$.getGlobalValue());
		Hashtables.remhash(ch, reader.readtable_constituent_traits(readtable));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 55937)
	public static SubLObject right_paren_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$reading_list$.getDynamicValue(thread))
				return Values.values(reader.$right_paren$.getDynamicValue(thread), CommonSymbols.T);
			else if (CommonSymbols.NIL != reader.$ignore_extra_right_parens$.getDynamicValue(thread)) {
				Errors.warn(reader.$str173$Ignoring_unmatched_close_parenthe);
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
			} else
				reader.simple_reader_error(reader.$str174$Unmatched__A_, ConsesLow.list(ch));
			return CommonSymbols.NIL;
		}
	}

	/** Return T iff evaluation of OBJECT necessarily returns OBJECT. */
	@SubL(source = "sublisp/reader.lisp", position = 62651)
	public static SubLObject self_evaluating_atom_p(SubLObject object) {
		return SubLObjectFactory.makeBoolean(object.isAtom() && (CommonSymbols.NIL == object
				|| CommonSymbols.T == object || object.isKeyword() || !object.isSymbol()));
	}

	@SubL(source = "sublisp/reader.lisp", position = 56467)
	public static SubLObject semicolon_rmf(SubLObject stream, SubLObject ch) {
		for (; true;) {
			SubLObject next_ch = streams_high.read_char(stream, CommonSymbols.NIL, CommonSymbols.NIL,
					CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL == next_ch || CommonSymbols.NIL != Characters.charE(next_ch, Characters.CHAR_return)
					|| CommonSymbols.NIL != Characters.charE(next_ch, Characters.CHAR_newline))
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 10477)
	public static SubLObject set_character_function(SubLObject ch, SubLObject func, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		Hashtables.sethash(ch, reader.readtable_macro_functions(readtable), func);
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_macro_functions(readtable), Characters.char_code(ch), func);
		return func;
	}

	@SubL(source = "sublisp/reader.lisp", position = 9244)
	public static SubLObject set_character_syntax(SubLObject ch, SubLObject syntax, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		Hashtables.sethash(ch, reader.readtable_character_syntax(readtable), syntax);
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_char_syntax(readtable), Characters.char_code(ch), syntax);
		return syntax;
	}

	@SubL(source = "sublisp/reader.lisp", position = 15377)
	public static SubLObject set_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char,
			SubLObject new_function, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (CommonSymbols.NIL != Characters.digit_char_p(sub_char, CommonSymbols.UNPROVIDED))
			Errors.error(reader.$str66$Attempt_to_make_decimal_digit__A_, sub_char);
		{
			SubLObject bucket = conses_high.assoc(disp_char, reader.readtable_dispatch_tables(readtable),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL == bucket)
				Errors.error(reader.$str67$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
			Hashtables.sethash(Characters.char_upcase(sub_char), bucket.rest(), new_function);
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 16611)
	public static SubLObject set_macro_character(SubLObject v_char, SubLObject new_function,
			SubLObject non_terminating_p, SubLObject readtable) {
		if (non_terminating_p == CommonSymbols.UNPROVIDED)
			non_terminating_p = CommonSymbols.NIL;
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		reader.set_character_function(v_char, new_function, readtable);
		reader.set_character_syntax(v_char, CommonSymbols.NIL != non_terminating_p
				? (SubLObject) reader.$kw55$NON_TERMINATING_MACRO : reader.$kw54$TERMINATING_MACRO, readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 71119)
	public static SubLObject set_read_lookup(SubLObject number, SubLObject object) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == reader.$read_lookup_table$.getDynamicValue(thread))
				reader.$read_lookup_table$.setDynamicValue(
						Hashtables.make_hash_table(reader.$int4$32, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED),
						thread);
			Hashtables.sethash(number, reader.$read_lookup_table$.getDynamicValue(thread), object);
			return object;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 18313)
	public static SubLObject set_syntax(SubLObject ch, SubLObject syntax, SubLObject function) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			reader.set_macro_character(ch, function, CommonSymbols.NIL,
					reader.$standard_readtable$.getDynamicValue(thread));
			reader.set_character_syntax(ch, syntax, reader.$standard_readtable$.getDynamicValue(thread));
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 17001)
	public static SubLObject set_syntax_from_char(SubLObject to_char, SubLObject from_char, SubLObject from_readtable,
			SubLObject to_readtable) {
		if (from_readtable == CommonSymbols.UNPROVIDED)
			from_readtable = CommonSymbols.NIL;
		if (to_readtable == CommonSymbols.UNPROVIDED)
			to_readtable = reader.$readtable$.getDynamicValue();
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == from_readtable)
				from_readtable = reader.$standard_readtable$.getDynamicValue(thread);
			{
				SubLObject syntax = CommonSymbols.NIL != reader.single_byte_p(from_char)
						? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(from_readtable),
								Characters.char_code(from_char))
						: Hashtables.gethash(from_char, reader.readtable_character_syntax(from_readtable),
								reader.$kw43$CONSTITUENT);
				SubLObject pcase_var = syntax;
				if (pcase_var.eql(reader.$kw54$TERMINATING_MACRO)
						|| pcase_var.eql(reader.$kw55$NON_TERMINATING_MACRO)) {
					SubLObject rmf = reader.character_function(from_char, from_readtable);
					if (rmf == reader.$sym65$DISPATCHING_RMF) {
						SubLObject from_table = conses_high
								.assoc(from_char, reader.readtable_dispatch_tables(from_readtable),
										CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)
								.rest();
						SubLObject to_table = Hashtables.make_hash_table(Hashtables.hash_table_count(from_table),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						reader._csetf_readtable_dispatch_tables(to_readtable,
								ConsesLow.cons(ConsesLow.cons(to_char, reader.Xcopy_hash_table(from_table, to_table)),
										Sequences.delete(to_char, reader.readtable_dispatch_tables(to_readtable),
												Symbols.symbol_function(CommonSymbols.EQL),
												Symbols.symbol_function(reader.$sym64$CAR), CommonSymbols.UNPROVIDED,
												CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)));
					}
					reader.set_character_function(to_char, rmf, to_readtable);
				} else if (pcase_var.eql(reader.$kw43$CONSTITUENT))
					reader.reset_trait(to_char, to_readtable);
				reader.set_character_syntax(to_char, syntax, to_readtable);
			}
			return CommonSymbols.T;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 11245)
	public static SubLObject set_trait(SubLObject ch, SubLObject readtable, SubLObject trait) {
		{
			SubLObject new_traits = Numbers.logior(trait, reader.character_traits(ch, readtable));
			Hashtables.sethash(ch, reader.readtable_constituent_traits(readtable), new_traits);
			if (CommonSymbols.NIL != reader.single_byte_p(ch))
				Vectors.set_aref(reader.readtable_single_byte_constit_traits(readtable), Characters.char_code(ch),
						new_traits);
		}
		return trait;
	}

	public static SubLObject setup_reader_file() {
		// CVS_ID("Id: reader.lisp 126640 2008-12-04 13:39:36Z builder ");
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				reader.$dtp_readtable$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE));
		Structures.def_csetf(reader.$sym14$READTABLE_CASE, reader.$sym15$_CSETF_READTABLE_CASE);
		Structures.def_csetf(reader.$sym16$READTABLE_CHARACTER_SYNTAX, reader.$sym17$_CSETF_READTABLE_CHARACTER_SYNTAX);
		Structures.def_csetf(reader.$sym18$READTABLE_SINGLE_BYTE_CHAR_SYNTAX,
				reader.$sym19$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX);
		Structures.def_csetf(reader.$sym20$READTABLE_MACRO_FUNCTIONS, reader.$sym21$_CSETF_READTABLE_MACRO_FUNCTIONS);
		Structures.def_csetf(reader.$sym22$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS,
				reader.$sym23$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS);
		Structures.def_csetf(reader.$sym24$READTABLE_CONSTITUENT_TRAITS,
				reader.$sym25$_CSETF_READTABLE_CONSTITUENT_TRAITS);
		Structures.def_csetf(reader.$sym26$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS,
				reader.$sym27$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS);
		Structures.def_csetf(reader.$sym28$READTABLE_DISPATCH_TABLES, reader.$sym29$_CSETF_READTABLE_DISPATCH_TABLES);
		Equality.identity(reader.$sym6$READTABLE);
		reader.$standard_readtable$.setDynamicValue(reader.create_readtable());
		{
			SubLObject cdolist_list_var = reader.$whitespace_1_chars$.getDynamicValue();
			SubLObject v_char = CommonSymbols.NIL;
			for (v_char = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), v_char = cdolist_list_var.first())
				reader.set_syntax(v_char, reader.$kw58$WHITESPACE, reader.$sym68$WHITESPACE_RMF);
		}
		reader.set_syntax(Characters.CHAR_backslash, reader.$kw57$SINGLE_ESCAPE, reader.$sym69$SINGLE_ESCAPE_RMF);
		reader.set_syntax(Characters.CHAR_vertical, reader.$kw56$MULTIPLE_ESCAPE, reader.$sym70$MULTIPLE_ESCAPE_RMF);
		reader.set_macro_character(Characters.CHAR_lparen, reader.$sym71$LEFT_PAREN_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_rparen, reader.$sym72$RIGHT_PAREN_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_quote, reader.$sym73$SINGLE_QUOTE_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_semicolon, reader.$sym74$SEMICOLON_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_quotation, reader.$sym75$DOUBLE_QUOTE_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_backquote, reader.$sym76$BACKQUOTE_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_comma, reader.$sym77$COMMA_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.make_dispatch_macro_character(Characters.CHAR_hash, CommonSymbols.T,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_backslash,
				reader.$sym78$SHARPSIGN_BACKSLASH_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_quote,
				reader.$sym79$SHARPSIGN_SINGLE_QUOTE_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_lparen,
				reader.$sym80$SHARPSIGN_LEFT_PAREN_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_asterisk,
				reader.$sym81$SHARPSIGN_ASTERISK_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_colon,
				reader.$sym82$SHARPSIGN_COLON_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_period,
				reader.$sym83$SHARPSIGN_DOT_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_B, reader.$sym84$SHARPSIGN_B_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_O, reader.$sym85$SHARPSIGN_O_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_X, reader.$sym86$SHARPSIGN_X_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_R, reader.$sym87$SHARPSIGN_R_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_C, reader.$sym88$SHARPSIGN_C_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_A, reader.$sym89$SHARPSIGN_A_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_S, reader.$sym90$SHARPSIGN_S_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_P, reader.$sym91$SHARPSIGN_P_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_G,
				reader.$sym92$SHARPSIGN_CAPITAL_G_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_equal,
				reader.$sym93$SHARPSIGN_EQUALS_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hash,
				reader.$sym94$SHARPSIGN_SHARPSIGN_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_plus,
				reader.$sym95$SHARPSIGN_PLUS_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hyphen,
				reader.$sym96$SHARPSIGN_MINUS_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_vertical,
				reader.$sym97$SHARPSIGN_VERTICAL_BAR_RMF, reader.$standard_readtable$.getDynamicValue());
		{
			SubLObject invalid = reader.$list98;
			SubLObject cdolist_list_var = invalid;
			SubLObject ch = CommonSymbols.NIL;
			for (ch = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), ch = cdolist_list_var.first())
				reader.set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$invalid$.getGlobalValue());
		}
		{
			SubLObject alphadigit = reader.$list99;
			SubLObject cdolist_list_var = alphadigit;
			SubLObject ch = CommonSymbols.NIL;
			for (ch = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), ch = cdolist_list_var.first()) {
				reader.set_trait(ch, reader.$standard_readtable$.getDynamicValue(),
						reader.$alphabetic$.getGlobalValue());
				reader.set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$digit$.getGlobalValue());
			}
		}
		reader.set_trait(Characters.CHAR_colon, reader.$standard_readtable$.getDynamicValue(),
				reader.$package_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_plus, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_plus, reader.$standard_readtable$.getDynamicValue(),
				reader.$plus_sign$.getGlobalValue());
		reader.set_trait(Characters.CHAR_hyphen, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_hyphen, reader.$standard_readtable$.getDynamicValue(),
				reader.$minus_sign$.getGlobalValue());
		reader.set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$dot$.getGlobalValue());
		reader.set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$decimal_point$.getGlobalValue());
		reader.set_trait(Characters.CHAR_slash, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_slash, reader.$standard_readtable$.getDynamicValue(),
				reader.$ratio_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_D, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_d, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_E, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_e, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_F, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_f, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_L, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_l, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_S, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_s, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		if (!(CommonSymbols.NIL != Symbols.boundp(reader.$sym46$_READTABLE_)
				&& CommonSymbols.NIL != reader.$readtable$.getDynamicValue()))
			reader.$readtable$.setDynamicValue(
					reader.copy_readtable(reader.$standard_readtable$.getDynamicValue(), CommonSymbols.UNPROVIDED));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				reader.$dtp_read_token$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym119$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
		Structures.def_csetf(reader.$sym120$READ_TOKEN_POINTER, reader.$sym121$_CSETF_READ_TOKEN_POINTER);
		Structures.def_csetf(reader.$sym122$READ_TOKEN_BUFFER, reader.$sym123$_CSETF_READ_TOKEN_BUFFER);
		Structures.def_csetf(reader.$sym124$READ_TOKEN_ESCAPES, reader.$sym125$_CSETF_READ_TOKEN_ESCAPES);
		Equality.identity(reader.$sym113$READ_TOKEN);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 69895)
	public static SubLObject sharpsign_a_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (!(arg.eql(CommonSymbols.ONE_INTEGER)
					|| CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)))
				reader.unimplemented_reader_macro_error(stream, ch);
			{
				SubLObject contents = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = reader.$reading_fake_list$.currentBinding(thread);
					try {
						reader.$reading_fake_list$.bind(CommonSymbols.T, thread);
						contents = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
					} finally {
						reader.$reading_fake_list$.rebind(_prev_bind_0, thread);
					}
				}
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else if (!contents.isList())
					reader.simple_reader_error(reader.$str204$The_form_after__A_reader_macro_wa, ConsesLow.list(ch));
				else
					return Values.values(Functions.apply(Symbols.symbol_function(reader.$sym182$VECTOR), contents),
							CommonSymbols.T);
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 66714)
	public static SubLObject sharpsign_asterisk_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
				reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			else
				reader.unimplemented_reader_macro_error(stream, ch);
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 68962)
	public static SubLObject sharpsign_b_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			return Values.values(reader.read_number_in_radix(stream, CommonSymbols.TWO_INTEGER), CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 65249)
	public static SubLObject sharpsign_backslash_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			{
				SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
				reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
				reader._csetf_read_token_buffer(token,
						Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
				reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
				reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
				reader.read_token(stream, token, CommonSymbols.NIL);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else {
					SubLObject name = reader.read_token_string(token);
					SubLObject ch_1 = Characters.name_character(name);
					if (CommonSymbols.NIL != ch_1)
						return Values.values(ch_1, CommonSymbols.T);
					else
						reader.simple_reader_error(reader.$str199$_S_is_not_the_name_of_a_character,
								ConsesLow.list(name));
				}
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 69718)
	public static SubLObject sharpsign_c_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
				reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			else
				reader.unimplemented_reader_macro_error(stream, ch);
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 53465)
	public static SubLObject sharpsign_capital_g_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg)
				reader.simple_reader_error(reader.$str162$The__S_reader_macro_does_not_take, ConsesLow.list(ch));
			{
				SubLObject string = reader.read(stream, CommonSymbols.NIL, CommonSymbols.NIL, CommonSymbols.T);
				if (!string.isString())
					reader.simple_reader_error(reader.$str163$The__S_reader_macro_expected_a_st, ConsesLow.list(ch));
				if (CommonSymbols.NIL == Guids.guid_string_p(string))
					reader.simple_reader_error(reader.$str164$The__S_reader_macro_could_not_int,
							ConsesLow.list(ch, string));
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else
					return Values.values(Guids.string_to_guid(string), CommonSymbols.T);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 66898)
	public static SubLObject sharpsign_colon_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			{
				SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
				reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
				reader._csetf_read_token_buffer(token,
						Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
				reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
				reader.read_token(stream, token, CommonSymbols.NIL);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else {
					SubLObject escapes = Sequences.nreverse(reader.read_token_escapes(token));
					reader._csetf_read_token_escapes(token, escapes);
					if (CommonSymbols.NIL == escapes && CommonSymbols.NIL != reader
							.potential_number_p(reader.read_token_buffer(token), reader.read_token_pointer(token)))
						reader.invalid_token_syntax_error(stream, token);
					reader.frob_case(token);
					{
						SubLObject buffer = reader.read_token_buffer(token);
						SubLObject length = reader.read_token_pointer(token);
						SubLObject escapes_2 = reader.read_token_escapes(token);
						SubLObject dot_count = CommonSymbols.ZERO_INTEGER;
						SubLObject i = CommonSymbols.NIL;
						for (i = CommonSymbols.ZERO_INTEGER; i
								.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
							SubLObject ch_3 = Strings.sublisp_char(buffer, i);
							SubLObject escape_idx = escapes_2.first();
							if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
								escapes_2 = escapes_2.rest();
							else if (CommonSymbols.NIL != reader.package_marker_traitp(ch_3))
								reader.invalid_token_syntax_error(stream, token);
							else if (CommonSymbols.NIL != reader.dot_traitp(ch_3))
								dot_count = Numbers.add(dot_count, CommonSymbols.ONE_INTEGER);
						}
						if (dot_count.numE(length))
							reader.invalid_token_syntax_error(stream, token);
						else
							return Values.values(Symbols.make_symbol(reader.read_token_string(token)), CommonSymbols.T);
					}
				}
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 68078)
	public static SubLObject sharpsign_dot_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			{
				SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else if (CommonSymbols.NIL == reader.$read_eval$.getDynamicValue(thread))
					reader.simple_reader_error(reader.$str201$Attempt_the_use_the__A_reader_mac,
							ConsesLow.list(ch, reader.$sym202$_READ_EVAL_, reader.$read_eval$.getDynamicValue(thread)));
				else
					return Values.values(Eval.eval(subform), CommonSymbols.T);
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 71308)
	public static SubLObject sharpsign_equals_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (!(CommonSymbols.NIL != arg || CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)))
				reader.illegal_argument_error(stream, ch, arg);
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
				return Values.values(CommonSymbols.NIL, CommonSymbols.T);
			else {
				SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
				thread.resetMultipleValues();
				{
					SubLObject old = reader.read_lookup(arg);
					SubLObject oldp = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (CommonSymbols.NIL != oldp)
						reader.simple_reader_error(reader.$str205$Label__S_appears_more_than_once_,
								ConsesLow.list(arg));
					else
						reader.set_read_lookup(arg, subform);
					return Values.values(subform, CommonSymbols.T);
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 66179)
	public static SubLObject sharpsign_left_paren_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject elts = reader.read_delimited_list(Characters.CHAR_rparen, stream, CommonSymbols.T);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else {
					SubLObject length = Sequences.length(elts);
					if (CommonSymbols.NIL == arg || arg.numE(length)) {
					} else if (length.numL(arg))
						elts = ConsesLow.append(elts, ConsesLow.make_list(Numbers.subtract(arg, length),
								conses_high.last(elts, CommonSymbols.UNPROVIDED).first()));
					else
						reader.illegal_argument_error(stream, ch, arg);
					return Values
							.values(reader.$backquote_depth$.getDynamicValue(thread).numG(CommonSymbols.ZERO_INTEGER)
									? (SubLObject) ConsesLow.cons(reader.$bq_vector$.getDynamicValue(thread), elts)
									: Functions.apply(Symbols.symbol_function(reader.$sym182$VECTOR), elts),
									CommonSymbols.T);
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 73936)
	public static SubLObject sharpsign_minus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			if (CommonSymbols.NIL != reader.read_features(stream)) {
				{
					SubLObject _prev_bind_0 = reader.$read_suppress$.currentBinding(thread);
					try {
						reader.$read_suppress$.bind(CommonSymbols.T, thread);
						reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
					} finally {
						reader.$read_suppress$.rebind(_prev_bind_0, thread);
					}
				}
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
			} else
				return Values.values(reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T),
						CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 69143)
	public static SubLObject sharpsign_o_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			return Values.values(reader.read_number_in_radix(stream, CommonSymbols.EIGHT_INTEGER), CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 70594)
	public static SubLObject sharpsign_p_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			{
				SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else
					return Values.values(subform, CommonSymbols.T);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 73609)
	public static SubLObject sharpsign_plus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			if (CommonSymbols.NIL != reader.read_features(stream))
				return Values.values(reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T),
						CommonSymbols.T);
			else {
				{
					SubLObject _prev_bind_0 = reader.$read_suppress$.currentBinding(thread);
					try {
						reader.$read_suppress$.bind(CommonSymbols.T, thread);
						reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
					} finally {
						reader.$read_suppress$.rebind(_prev_bind_0, thread);
					}
				}
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 69534)
	public static SubLObject sharpsign_r_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		if (!(CommonSymbols.NIL != arg && arg.numGE(CommonSymbols.TWO_INTEGER) && arg.numLE(reader.$int203$36)))
			reader.illegal_argument_error(stream, ch, arg);
		return Values.values(reader.read_number_in_radix(stream, arg), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 70402)
	public static SubLObject sharpsign_s_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
				reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			else
				reader.unimplemented_reader_macro_error(stream, ch);
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 72022)
	public static SubLObject sharpsign_sharpsign_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (!(CommonSymbols.NIL != arg || CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)))
				reader.illegal_argument_error(stream, ch, arg);
			if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
				return Values.values(CommonSymbols.NIL, CommonSymbols.T);
			else {
				thread.resetMultipleValues();
				{
					SubLObject old = reader.read_lookup(arg);
					SubLObject oldp = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (CommonSymbols.NIL != oldp)
						return Values.values(old, CommonSymbols.T);
					else
						reader.simple_reader_error(reader.$str206$Label__S_has_not_been_seen_, ConsesLow.list(arg));
				}
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 65854)
	public static SubLObject sharpsign_single_quote_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			{
				SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
				if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				else
					return Values.values(ConsesLow.list(reader.$sym200$FUNCTION, subform), CommonSymbols.T);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 74264)
	public static SubLObject sharpsign_vertical_bar_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			{
				SubLObject depth = CommonSymbols.ONE_INTEGER;
				SubLObject state = reader.$kw145$INITIAL;
				SubLObject ch_4 = CommonSymbols.NIL;
				for (ch_4 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED); true; ch_4 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
					SubLObject pcase_var = state;
					if (pcase_var.eql(reader.$kw212$HASH)) {
						SubLObject pcase_var_5 = ch_4;
						if (pcase_var_5.eql(Characters.CHAR_vertical)) {
							depth = Numbers.add(depth, CommonSymbols.ONE_INTEGER);
							state = reader.$kw145$INITIAL;
						} else if (pcase_var_5.eql(Characters.CHAR_hash)) {
						} else
							state = reader.$kw145$INITIAL;
					} else if (pcase_var.eql(reader.$kw213$VERTICAL_BAR)) {
						SubLObject pcase_var_6 = ch_4;
						if (pcase_var_6.eql(Characters.CHAR_vertical)) {
						} else if (pcase_var_6.eql(Characters.CHAR_hash)) {
							depth = Numbers.subtract(depth, CommonSymbols.ONE_INTEGER);
							if (depth.isZero())
								return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
						} else
							state = reader.$kw145$INITIAL;
					} else if (pcase_var.eql(reader.$kw145$INITIAL)) {
						SubLObject pcase_var_7 = ch_4;
						if (pcase_var_7.eql(Characters.CHAR_vertical))
							state = reader.$kw213$VERTICAL_BAR;
						else if (pcase_var_7.eql(Characters.CHAR_hash))
							state = reader.$kw212$HASH;
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 69338)
	public static SubLObject sharpsign_x_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
				reader.unnecessary_argument_error(stream, ch);
			return Values.values(reader.read_number_in_radix(stream, CommonSymbols.SIXTEEN_INTEGER), CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 23097)
	public static SubLObject simple_reader_error(SubLObject format_control, SubLObject format_arguments) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != reader.$throw_reader_error_p$.getDynamicValue(thread))
				Dynamic.sublisp_throw(reader.$sym100$READER_ERROR, CommonSymbols.T);
			else
				Functions.apply(Symbols.symbol_function(reader.$sym101$ERROR), format_control, format_arguments);
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 8876)
	public static SubLObject single_byte_p(SubLObject ch) {
		return Numbers.numL(Characters.char_code(ch), reader.$single_byte_max_code$.getGlobalValue());
	}

	@SubL(source = "sublisp/reader.lisp", position = 53095)
	public static SubLObject single_escape_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
			reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
			reader._csetf_read_token_buffer(token,
					Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
			reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
			reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
			reader.read_token(stream, token, CommonSymbols.NIL);
			return Values.values(reader.parse_token(stream, token), CommonSymbols.T);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 9882)
	public static SubLObject single_escape_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw57$SINGLE_ESCAPE);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 56281)
	public static SubLObject single_quote_rmf(SubLObject stream, SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject object = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
				return Values.values(
						CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)
								? (SubLObject) CommonSymbols.NIL : ConsesLow.list(reader.$sym175$QUOTE, object),
						CommonSymbols.T);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 38239)
	public static SubLObject symbol_escapep(SubLObject symbol) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject name = Symbols.symbol_name(symbol);
				SubLObject length = Sequences.length(name);
				SubLObject escapep = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = reader.$read_base$.currentBinding(thread);
					try {
						reader.$read_base$.bind(print_high.$print_base$.getDynamicValue(thread), thread);
						escapep = reader.potential_number_p(name, length);
					} finally {
						reader.$read_base$.rebind(_prev_bind_0, thread);
					}
				}
				if (CommonSymbols.NIL != escapep)
					return CommonSymbols.T;
				{
					SubLObject non_consing_dot = CommonSymbols.NIL;
					SubLObject v_case = reader.readtable_case(reader.$readtable$.getDynamicValue(thread));
					SubLObject i = CommonSymbols.NIL;
					for (i = CommonSymbols.ZERO_INTEGER; i
							.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
						SubLObject ch = Strings.sublisp_char(name, i);
						if (CommonSymbols.NIL == reader.constituent_syntaxp(ch))
							return CommonSymbols.T;
						if (CommonSymbols.NIL != reader.package_marker_traitp(ch))
							return CommonSymbols.T;
						if (CommonSymbols.NIL == reader.dot_traitp(ch))
							non_consing_dot = CommonSymbols.T;
						if (CommonSymbols.NIL != Characters.both_case_p(ch)) {
							if (CommonSymbols.NIL != Characters.lower_case_p(ch) && v_case == reader.$kw42$UPCASE)
								return CommonSymbols.T;
							if (CommonSymbols.NIL != Characters.upper_case_p(ch) && v_case == reader.$kw136$DOWNCASE)
								return CommonSymbols.T;
						}
					}
					return SubLObjectFactory.makeBoolean(CommonSymbols.NIL == non_consing_dot);
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 9596)
	public static SubLObject terminating_macro_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw54$TERMINATING_MACRO);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 23813)
	public static SubLObject unimplemented_reader_macro_error(SubLObject stream, SubLObject ch) {
		reader.simple_reader_error(reader.$str105$The__A_reader_macro_is_not_implem, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 23974)
	public static SubLObject unnecessary_argument_error(SubLObject stream, SubLObject ch) {
		reader.simple_reader_error(reader.$str106$The__A_reader_macro_does_not_take, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	/**
	 * True of characters whose glyphs server only to move the print position.
	 * Note: This is not the same as having the whitespace syntax type.
	 */
	@SubL(source = "sublisp/reader.lisp", position = 4948)
	public static SubLObject whitespace_1_char_p(SubLObject v_char) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return conses_high.member(v_char, reader.$whitespace_1_chars$.getDynamicValue(thread),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		}
	}

	/**
	 * True of characters that have the whitespace syntax type. Note: This is
	 * not the same as a character whose glyph serves only to move the print
	 * position.
	 */
	@SubL(source = "sublisp/reader.lisp", position = 5249)
	public static SubLObject whitespace_2_char_p(SubLObject v_char) {
		return reader.whitespace_syntaxp(v_char);
	}

	@SubL(source = "sublisp/reader.lisp", position = 52422)
	public static SubLObject whitespace_rmf(SubLObject stream, SubLObject ch) {
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9968)
	public static SubLObject whitespace_syntaxp(SubLObject ch) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return Equality.eq(
					CommonSymbols.NIL != reader.single_byte_p(ch)
							? (SubLObject) Vectors.aref(reader.readtable_single_byte_char_syntax(
									reader.$readtable$.getDynamicValue(thread)), Characters.char_code(ch))
							: Hashtables.gethash(ch,
									reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
									reader.$kw43$CONSTITUENT),
					reader.$kw58$WHITESPACE);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 32004)
	public static SubLObject with_read_token(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject token = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list129);
			token = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				return ConsesLow.listS(reader.$sym108$CLET, ConsesLow.list(reader.bq_cons(token, reader.$list130)),
						reader.$list131, reader.$list132, reader.$list133, ConsesLow.append(body, CommonSymbols.NIL));
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 29570)
	public static SubLObject with_special_reader_error_handling(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return reader.bq_cons(reader.$sym110$PROGN, ConsesLow.append(body, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 29330)
	public static SubLObject with_standard_io_syntax(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return ConsesLow.listS(reader.$sym108$CLET, reader.$list109, ConsesLow.append(body, CommonSymbols.NIL));
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 12875)
	public static SubLObject Xcopy_hash_table(SubLObject from, SubLObject to) {
		{
			SubLObject k = CommonSymbols.NIL;
			SubLObject v = CommonSymbols.NIL;
			{
				Iterator cdohash_iterator = Hashtables.getEntrySetIterator(from);
				try {
					while (Hashtables.iteratorHasNext(cdohash_iterator)) {
						Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
						k = Hashtables.getEntryKey(cdohash_entry);
						v = Hashtables.getEntryValue(cdohash_entry);
						Hashtables.sethash(k, to, v);
					}
				} finally {
					Hashtables.releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return to;
	}

	private reader() {
	}

	//// Initializers

	public void declareFunctions() {
		reader.declare_reader_file();
	}

	public void initializeVariables() {
		reader.init_reader_file();
	}

	public void runTopLevelForms() {
		reader.setup_reader_file();
	}

}
