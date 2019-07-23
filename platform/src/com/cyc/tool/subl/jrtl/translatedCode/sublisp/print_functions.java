//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class print_functions extends SubLTranslatedFile {
	public static SubLObject declare_print_functions_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_integer_internal", "PRINT-INTEGER-INTERNAL", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_bignum_internal", "PRINT-BIGNUM-INTERNAL", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_integer",
				"PRINT-INTEGER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_bignum_method", "PRINT-OBJECT-BIGNUM-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_fixnum_method", "PRINT-OBJECT-FIXNUM-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_flonum",
				"PRINT-FLONUM", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_float_method", "PRINT-OBJECT-FLOAT-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_character",
				"PRINT-CHARACTER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_character_method", "PRINT-OBJECT-CHARACTER-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_symbol_package_portion", "PRINT-SYMBOL-PACKAGE-PORTION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"escape_vertical_bars", "ESCAPE-VERTICAL-BARS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_symbol",
				"PRINT-SYMBOL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_symbol_method", "PRINT-OBJECT-SYMBOL-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_string",
				"PRINT-STRING", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_string_method", "PRINT-OBJECT-STRING-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_cons_cells",
				"PRINT-CONS-CELLS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_cons_method", "PRINT-OBJECT-CONS-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_vector",
				"PRINT-VECTOR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_vector_method", "PRINT-OBJECT-VECTOR-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "print_hashtable",
				"PRINT-HASHTABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_hash_table_method", "PRINT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_function_method", "PRINT-OBJECT-FUNCTION-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions", "write_guid_string",
				"WRITE-GUID-STRING", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_guid_internal", "PRINT-GUID-INTERNAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions",
				"print_object_guid_method", "PRINT-OBJECT-GUID-METHOD", 2, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 7287L)
	public static SubLObject escape_vertical_bars(SubLObject string) {
		if (SubLNil.NIL == Sequences.find(Characters.CHAR_vertical, string, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
			return string;
		SubLObject result = SubLNil.NIL;
		SubLObject stream = SubLNil.NIL;
		try {
			stream = streams_high.make_private_string_output_stream();
			SubLObject cdotimes_end_var;
			SubLObject i;
			SubLObject curr;
			for (cdotimes_end_var = Sequences.length(string), i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				curr = Strings.sublisp_char(string, i);
				if (SubLNil.NIL != Characters.charE(curr, Characters.CHAR_vertical))
					streams_high.write_char(Characters.CHAR_backslash, stream);
				streams_high.write_char(curr, stream);
			}
			result = streams_high.get_output_stream_string(stream);
		} finally {
			SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
			try {
				Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(stream, CommonSymbols.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return result;
	}

	public static SubLObject init_print_functions_file() {
		print_functions.$max_fixnum_base_power$ = SubLFiles.defvar("*MAX-FIXNUM-BASE-POWER*",
				Vectors.make_vector(print_functions.$int$37, CommonSymbols.UNPROVIDED));
		print_functions.$max_fixnum_power_less_one$ = SubLFiles.defvar("*MAX-FIXNUM-POWER-LESS-ONE*",
				Vectors.make_vector(print_functions.$int$37, CommonSymbols.UNPROVIDED));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 2491L)
	public static SubLObject print_bignum_internal(SubLObject bignum, SubLObject stream, SubLObject radix,
			SubLObject divisor, SubLObject power_less_one) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject quotient = Numbers.truncate(bignum, divisor);
		SubLObject remainder = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (quotient.isFixnum())
			print_integer_internal(quotient, stream, radix);
		else
			print_bignum_internal(quotient, stream, radix, divisor, power_less_one);
		SubLObject num_zeros = SubLNil.NIL;
		SubLObject base_power = SubLNil.NIL;
		num_zeros = power_less_one;
		for (base_power = radix; !base_power.numG(remainder); base_power = Numbers.multiply(base_power, radix))
			num_zeros = Numbers.subtract(num_zeros, CommonSymbols.ONE_INTEGER);
		SubLObject i;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(num_zeros); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
			streams_high.write_char(Characters.CHAR_0, stream);
		print_integer_internal(remainder, stream, radix);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 5601L)
	public static SubLObject print_character(SubLObject character, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != print_high.$print_escape$.getDynamicValue(thread)) {
			streams_high.write_char(Characters.CHAR_hash, stream);
			streams_high.write_char(Characters.CHAR_backslash, stream);
			streams_high.write_string(character_names.character_names(character).first(), stream,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		} else
			streams_high.write_char(character, stream);
		return character;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 9885L)
	public static SubLObject print_cons_cells(SubLObject cons, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == print_high.$print_readably$.getDynamicValue(thread)
				&& print_high.$print_level$.getDynamicValue(thread).eql(CommonSymbols.ZERO_INTEGER))
			streams_high.write_char(Characters.CHAR_hash, stream);
		else {
			SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
			try {
				print_high.$print_level$.bind(SubLNil.NIL != print_high.$print_level$.getDynamicValue(thread)
						? Numbers.subtract(print_high.$print_level$.getDynamicValue(thread), CommonSymbols.ONE_INTEGER)
						: SubLNil.NIL, thread);
				SubLObject done = SubLNil.NIL;
				SubLObject count = CommonSymbols.ONE_INTEGER;
				SubLObject first = cons.first();
				SubLObject tail = cons.rest();
				if (SubLNil.NIL != print_high.$print_pretty$.getDynamicValue(thread)
						&& first.eql(print_functions.$sym16$QUOTE) && tail.isCons()
						&& SubLNil.NIL == tail.rest()) {
					streams_high.write_char(Characters.CHAR_quote, stream);
					PrintLow.write(conses_high.cadr(cons), new SubLObject[] { print_functions.$kw17$STREAM, stream });
				} else {
					streams_high.write_char(Characters.CHAR_lparen, stream);
					PrintLow.write(first, new SubLObject[] { print_functions.$kw17$STREAM, stream });
					while (!tail.isAtom() && SubLNil.NIL == done)
						if (SubLNil.NIL != print_high.circular_reference_p(tail, stream)) {
							streams_high.write_string(print_functions.$str18$___, stream, CommonSymbols.UNPROVIDED,
									CommonSymbols.UNPROVIDED);
							PrintLow.write(tail, new SubLObject[] { print_functions.$kw17$STREAM, stream });
							done = CommonSymbols.T;
						} else if (SubLNil.NIL == print_high.$print_readably$.getDynamicValue(thread)
								&& SubLNil.NIL != print_high.$print_length$.getDynamicValue(thread)
								&& count.numGE(print_high.$print_length$.getDynamicValue(thread))) {
							streams_high.write_string(print_functions.$str19$____, stream, CommonSymbols.UNPROVIDED,
									CommonSymbols.UNPROVIDED);
							done = CommonSymbols.T;
						} else {
							streams_high.write_char(Characters.CHAR_space, stream);
							PrintLow.write(tail.first(), new SubLObject[] { print_functions.$kw17$STREAM, stream });
							tail = tail.rest();
							count = Numbers.add(count, CommonSymbols.ONE_INTEGER);
						}
					if (!tail.isList()) {
						streams_high.write_string(print_functions.$str18$___, stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED);
						PrintLow.write(tail, new SubLObject[] { print_functions.$kw17$STREAM, stream });
					}
					streams_high.write_char(Characters.CHAR_rparen, stream);
				}
			} finally {
				print_high.$print_level$.rebind(_prev_bind_0, thread);
			}
		}
		return cons;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 4199L)
	public static SubLObject print_flonum(SubLObject flonum, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (Numbers.float_sign(flonum, CommonSymbols.UNPROVIDED).isNegative())
			streams_high.write_char(Characters.CHAR_hyphen, stream);
		if (SubLNil.NIL != Numbers.infinity_p(flonum))
			streams_high.write_string(print_functions.$str4$Inf, stream, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		else if (SubLNil.NIL != Numbers.not_a_number_p(flonum))
			streams_high.write_string(print_functions.$str5$NaN, stream, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		else {
			thread.resetMultipleValues();
			SubLObject digits = math_utilities.flonum_digit_list(flonum);
			SubLObject scale = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (scale.numGE(print_functions.$int$_2) && scale.numL(CommonSymbols.EIGHT_INTEGER)) {
				if (scale.isPositive()) {
					SubLObject i;
					SubLObject digit;
					for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
							.numL(scale); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
						digit = digits.first();
						streams_high.write_char(
								SubLNil.NIL != digit ? Characters.digit_char(digit) : Characters.CHAR_0, stream);
						digits = digits.rest();
					}
					streams_high.write_char(Characters.CHAR_period, stream);
				} else {
					streams_high.write_char(Characters.CHAR_0, stream);
					streams_high.write_char(Characters.CHAR_period, stream);
					SubLObject cdotimes_end_var;
					SubLObject j;
					for (cdotimes_end_var = Numbers.abs(scale), j = SubLNil.NIL, j = CommonSymbols.ZERO_INTEGER; j
							.numL(cdotimes_end_var); j = Numbers.add(j, CommonSymbols.ONE_INTEGER))
						streams_high.write_char(Characters.CHAR_0, stream);
				}
				if (SubLNil.NIL != digits) {
					SubLObject cdolist_list_var = digits;
					SubLObject digit = SubLNil.NIL;
					digit = cdolist_list_var.first();
					while (SubLNil.NIL != cdolist_list_var) {
						streams_high.write_char(Characters.digit_char(digit), stream);
						cdolist_list_var = cdolist_list_var.rest();
						digit = cdolist_list_var.first();
					}
				} else
					streams_high.write_char(Characters.CHAR_0, stream);
			} else {
				streams_high.write_char(
						SubLNil.NIL != digits ? Characters.digit_char(digits.first()) : Characters.CHAR_0,
						stream);
				streams_high.write_char(Characters.CHAR_period, stream);
				if (SubLNil.NIL != digits.rest()) {
					SubLObject cdolist_list_var = digits.rest();
					SubLObject digit = SubLNil.NIL;
					digit = cdolist_list_var.first();
					while (SubLNil.NIL != cdolist_list_var) {
						streams_high.write_char(Characters.digit_char(digit), stream);
						cdolist_list_var = cdolist_list_var.rest();
						digit = cdolist_list_var.first();
					}
				} else
					streams_high.write_char(Characters.CHAR_0, stream);
				streams_high.write_char(Characters.CHAR_E, stream);
				SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
				try {
					print_high.$print_base$.bind(CommonSymbols.TEN_INTEGER, thread);
					print_high.princ(Numbers.subtract(scale, CommonSymbols.ONE_INTEGER), stream);
				} finally {
					print_high.$print_base$.rebind(_prev_bind_0, thread);
				}
			}
		}
		return flonum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13952L)
	public static SubLObject print_guid_internal(SubLObject object, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != print_high.$print_escape$.getDynamicValue(thread)) {
			streams_high.write_string(print_functions.$str27$_G, stream, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			streams_high.write_char(Characters.CHAR_quotation, stream);
			write_guid_string(object, stream);
			streams_high.write_char(Characters.CHAR_quotation, stream);
		} else
			write_guid_string(object, stream);
		return object;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 12603L)
	public static SubLObject print_hashtable(SubLObject hash_table, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != print_high.$print_readably$.getDynamicValue(thread))
			print_high.print_not_readable(hash_table, stream);
		else {
			print_macros.print_unreadable_object_preamble(stream, hash_table, CommonSymbols.T, CommonSymbols.T);
			PrintLow.format(stream, print_functions.$str24$TEST__A__D__D,
					new SubLObject[] { Hashtables.hash_table_test(hash_table), Hashtables.hash_table_count(hash_table),
							Hashtables.hash_table_size(hash_table) });
			print_macros.print_unreadable_object_postamble(stream, hash_table, CommonSymbols.T, CommonSymbols.T);
		}
		return hash_table;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 3069L)
	public static SubLObject print_integer(SubLObject integer, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != print_high.$print_radix$.getDynamicValue(thread)
				&& !print_high.$print_base$.getDynamicValue(thread).numE(CommonSymbols.TEN_INTEGER)) {
			streams_high.write_char(Characters.CHAR_hash, stream);
			SubLObject pcase_var = print_high.$print_base$.getDynamicValue(thread);
			if (pcase_var.eql(CommonSymbols.TWO_INTEGER))
				streams_high.write_char(Characters.CHAR_b, stream);
			else if (pcase_var.eql(CommonSymbols.EIGHT_INTEGER))
				streams_high.write_char(Characters.CHAR_o, stream);
			else if (pcase_var.eql(CommonSymbols.SIXTEEN_INTEGER))
				streams_high.write_char(Characters.CHAR_x, stream);
			else {
				SubLObject radix = print_high.$print_base$.getDynamicValue(thread);
				SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
				SubLObject _prev_bind_2 = print_high.$print_radix$.currentBinding(thread);
				try {
					print_high.$print_base$.bind(CommonSymbols.TEN_INTEGER, thread);
					print_high.$print_radix$.bind(SubLNil.NIL, thread);
					print_integer_internal(radix, stream, print_high.$print_base$.getDynamicValue(thread));
					streams_high.write_char(Characters.CHAR_r, stream);
				} finally {
					print_high.$print_radix$.rebind(_prev_bind_2, thread);
					print_high.$print_base$.rebind(_prev_bind_0, thread);
				}
			}
		}
		if (integer.isNegative())
			streams_high.write_char(Characters.CHAR_hyphen, stream);
		if (integer.isInteger() && !integer.isFixnum())
			print_bignum_internal(Numbers.abs(integer), stream, print_high.$print_base$.getDynamicValue(thread),
					Vectors.aref(print_functions.$max_fixnum_base_power$.getDynamicValue(thread),
							print_high.$print_base$.getDynamicValue(thread)),
					Vectors.aref(print_functions.$max_fixnum_power_less_one$.getDynamicValue(thread),
							print_high.$print_base$.getDynamicValue(thread)));
		else
			print_integer_internal(Numbers.abs(integer), stream, print_high.$print_base$.getDynamicValue(thread));
		if (SubLNil.NIL != print_high.$print_radix$.getDynamicValue(thread)
				&& print_high.$print_base$.getDynamicValue(thread).numE(CommonSymbols.TEN_INTEGER))
			streams_high.write_char(Characters.CHAR_period, stream);
		return integer;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 672L)
	public static SubLObject print_integer_internal(SubLObject integer, SubLObject stream, SubLObject print_base) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject quotient = Numbers.truncate(integer, print_base);
		SubLObject remainder = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (!quotient.isZero())
			print_integer_internal(quotient, stream, print_base);
		streams_high.write_char(Characters.digit_char(remainder), stream);
		return integer;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 3995L)
	public static SubLObject print_object_bignum_method(SubLObject bignum, SubLObject stream) {
		print_integer(bignum, stream);
		return bignum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 5886L)
	public static SubLObject print_object_character_method(SubLObject character, SubLObject stream) {
		print_character(character, stream);
		return character;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 11243L)
	public static SubLObject print_object_cons_method(SubLObject cons, SubLObject stream) {
		print_cons_cells(cons, stream);
		return cons;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 4097L)
	public static SubLObject print_object_fixnum_method(SubLObject fixnum, SubLObject stream) {
		print_integer(fixnum, stream);
		return fixnum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 5501L)
	public static SubLObject print_object_float_method(SubLObject flonum, SubLObject stream) {
		print_flonum(flonum, stream);
		return flonum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13701L)
	public static SubLObject print_object_function_method(SubLObject function, SubLObject stream) {
		Functions.print_function(function, stream);
		return function;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 14273L)
	public static SubLObject print_object_guid_method(SubLObject guid, SubLObject stream) {
		print_guid_internal(guid, stream);
		return guid;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13581L)
	public static SubLObject print_object_hash_table_method(SubLObject hash_table, SubLObject stream) {
		print_hashtable(hash_table, stream);
		return hash_table;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 9784L)
	public static SubLObject print_object_string_method(SubLObject string, SubLObject stream) {
		print_string(string, stream);
		return string;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 9214L)
	public static SubLObject print_object_symbol_method(SubLObject symbol, SubLObject stream) {
		print_symbol(symbol, stream);
		return symbol;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 12502L)
	public static SubLObject print_object_vector_method(SubLObject vector, SubLObject stream) {
		print_vector(vector, stream);
		return vector;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 9315L)
	public static SubLObject print_string(SubLObject string, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != print_high.$print_escape$.getDynamicValue(thread)) {
			streams_high.write_char(Characters.CHAR_quotation, stream);
			SubLObject cdotimes_end_var;
			SubLObject i;
			SubLObject ch;
			for (cdotimes_end_var = Sequences.length(string), i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				ch = Strings.sublisp_char(string, i);
				if (SubLNil.NIL != Characters.charE(ch, Characters.CHAR_quotation)
						|| SubLNil.NIL != reader.single_escape_syntaxp(ch))
					streams_high.write_char(Characters.CHAR_backslash, stream);
				streams_high.write_char(ch, stream);
			}
			streams_high.write_char(Characters.CHAR_quotation, stream);
		} else
			streams_high.write_string(string, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		return string;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 7642L)
	public static SubLObject print_symbol(SubLObject symbol, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject name = Symbols.symbol_name(symbol);
		if (SubLNil.NIL != print_high.$print_escape$.getDynamicValue(thread))
			print_symbol_package_portion(symbol, stream);
		if (SubLNil.NIL != print_high.$print_escape$.getDynamicValue(thread)
				|| SubLNil.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
			if (SubLNil.NIL != reader.symbol_escapep(symbol)) {
				streams_high.write_char(Characters.CHAR_vertical, stream);
				streams_high.write_string(escape_vertical_bars(name), stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				streams_high.write_char(Characters.CHAR_vertical, stream);
			} else
				streams_high.write_string(escape_vertical_bars(name), stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
		} else if (print_high.$print_case$.getDynamicValue(thread) == print_functions.$kw11$CAPITALIZE)
			streams_high.write_string(
					escape_vertical_bars(
							Strings.string_capitalize(name, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)),
					stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else {
			SubLObject upper = SubLNil.NIL;
			SubLObject lower = SubLNil.NIL;
			SubLObject cdotimes_end_var;
			SubLObject i;
			SubLObject ch;
			for (cdotimes_end_var = Sequences.length(name), i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				ch = Strings.sublisp_char(name, i);
				if (SubLNil.NIL != Characters.both_case_p(ch))
					if (SubLNil.NIL != Characters.upper_case_p(ch))
						upper = CommonSymbols.T;
					else
						lower = CommonSymbols.T;
			}
			name = escape_vertical_bars(
					Strings.string_upcase(name, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
			SubLObject pcase_var = print_high.$print_case$.getDynamicValue(thread);
			if (pcase_var.eql(print_functions.$kw12$UPCASE))
				streams_high.write_string(SubLNil.NIL != lower
						? Strings.string_upcase(name, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED) : name,
						stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			else if (pcase_var.eql(print_functions.$kw13$DOWNCASE))
				streams_high.write_string(SubLNil.NIL != upper
						? Strings.string_downcase(name, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED) : name,
						stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		}
		return symbol;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 6004L)
	public static SubLObject print_symbol_package_portion(SubLObject symbol, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (symbol.isKeyword())
			streams_high.write_char(Characters.CHAR_colon, stream);
		else {
			thread.resetMultipleValues();
			SubLObject symb = Packages.find_symbol(Symbols.symbol_name(symbol),
					Packages.$package$.getDynamicValue(thread));
			SubLObject state = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (SubLNil.NIL == state || !symb.eql(symbol)) {
				SubLObject v_package = Symbols.symbol_package(symbol);
				if (!v_package.isPackage())
					streams_high.write_string(print_functions.$str9$__, stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				else {
					thread.resetMultipleValues();
					SubLObject sym = Packages.find_symbol(Symbols.symbol_name(symbol), v_package);
					SubLObject tag = thread.secondMultipleValue();
					thread.resetMultipleValues();
					streams_high.write_string(Packages.package_name(v_package), stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
					streams_high.write_char(Characters.CHAR_colon, stream);
					if (tag == print_functions.$kw10$INTERNAL)
						streams_high.write_char(Characters.CHAR_colon, stream);
				}
			}
		}
		return symbol;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 11340L)
	public static SubLObject print_vector(SubLObject vector, SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject length = Sequences.length(vector);
		if (SubLNil.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
			streams_high.write_char(Characters.CHAR_hash, stream);
			streams_high.write_char(Characters.CHAR_lparen, stream);
			if (length.isPositive()) {
				PrintLow.write(Vectors.aref(vector, CommonSymbols.ZERO_INTEGER),
						new SubLObject[] { print_functions.$kw17$STREAM, stream });
				SubLObject cdotimes_end_var;
				SubLObject i;
				for (cdotimes_end_var = Numbers.subtract(length,
						CommonSymbols.ONE_INTEGER), i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
								.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					streams_high.write_char(Characters.CHAR_space, stream);
					PrintLow.write(Vectors.aref(vector, Numbers.add(i, CommonSymbols.ONE_INTEGER)),
							new SubLObject[] { print_functions.$kw17$STREAM, stream });
				}
			}
			streams_high.write_char(Characters.CHAR_rparen, stream);
		} else if (SubLNil.NIL != print_high.$print_array$.getDynamicValue(thread)) {
			streams_high.write_char(Characters.CHAR_hash, stream);
			if (!print_high.$print_level$.getDynamicValue(thread).eql(CommonSymbols.ZERO_INTEGER)) {
				streams_high.write_char(Characters.CHAR_lparen, stream);
				SubLObject actual = SubLNil.NIL != print_high.$print_length$.getDynamicValue(thread)
						? Numbers.min(print_high.$print_length$.getDynamicValue(thread), length) : length;
				SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
				try {
					print_high.$print_level$.bind(SubLNil.NIL != print_high.$print_level$.getDynamicValue(thread)
							? Numbers.subtract(print_high.$print_level$.getDynamicValue(thread),
									CommonSymbols.ONE_INTEGER)
							: SubLNil.NIL, thread);
					SubLObject j;
					for (j = SubLNil.NIL, j = CommonSymbols.ZERO_INTEGER; j
							.numL(actual); j = Numbers.add(j, CommonSymbols.ONE_INTEGER)) {
						if (!j.isZero())
							streams_high.write_char(Characters.CHAR_space, stream);
						PrintLow.write(Vectors.aref(vector, j),
								new SubLObject[] { print_functions.$kw17$STREAM, stream });
					}
					if (actual.numL(length)) {
						if (actual.isPositive())
							streams_high.write_char(Characters.CHAR_space, stream);
						streams_high.write_string(print_functions.$str21$___, stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED);
					}
				} finally {
					print_high.$print_level$.rebind(_prev_bind_0, thread);
				}
				streams_high.write_char(Characters.CHAR_rparen, stream);
			}
		} else if (SubLNil.NIL != print_high.$print_readably$.getDynamicValue(thread))
			print_high.print_not_readable(vector, stream);
		else {
			print_macros.print_unreadable_object_preamble(stream, vector, CommonSymbols.T, CommonSymbols.T);
			PrintLow.format(stream, print_functions.$str22$_D, length);
			print_macros.print_unreadable_object_postamble(stream, vector, CommonSymbols.T, CommonSymbols.T);
		}
		return vector;
	}

	public static SubLObject setup_print_functions_file() {
		SubLObject radix;
		SubLObject final_power_less_one;
		SubLObject final_divisor;
		SubLObject done;
		SubLObject power_less_one;
		SubLObject divisor;
		SubLObject new_divisor;
		for (radix = SubLNil.NIL, radix = CommonSymbols.TWO_INTEGER; !radix
				.numG(print_functions.$int$36); radix = Numbers.add(radix, CommonSymbols.ONE_INTEGER)) {
			final_power_less_one = CommonSymbols.MINUS_ONE_INTEGER;
			final_divisor = CommonSymbols.ONE_INTEGER;
			done = SubLNil.NIL;
			power_less_one = SubLNil.NIL;
			divisor = SubLNil.NIL;
			new_divisor = SubLNil.NIL;
			power_less_one = CommonSymbols.MINUS_ONE_INTEGER;
			divisor = CommonSymbols.ONE_INTEGER;
			new_divisor = radix;
			while (SubLNil.NIL == done) {
				done = SubLObjectFactory.makeBoolean(!new_divisor.isFixnum());
				if (SubLNil.NIL != done) {
					final_divisor = divisor;
					final_power_less_one = power_less_one;
				}
				power_less_one = Numbers.add(power_less_one, CommonSymbols.ONE_INTEGER);
				divisor = new_divisor;
				new_divisor = Numbers.multiply(new_divisor, radix);
			}
			Vectors.set_aref(print_functions.$max_fixnum_base_power$.getDynamicValue(), radix, final_divisor);
			Vectors.set_aref(print_functions.$max_fixnum_power_less_one$.getDynamicValue(), radix,
					final_power_less_one);
		}
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_bignum$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym2$PRINT_OBJECT_BIGNUM_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_fixnum$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym3$PRINT_OBJECT_FIXNUM_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_float$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym7$PRINT_OBJECT_FLOAT_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_character$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym8$PRINT_OBJECT_CHARACTER_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_symbol$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym14$PRINT_OBJECT_SYMBOL_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_string$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym15$PRINT_OBJECT_STRING_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_cons$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym20$PRINT_OBJECT_CONS_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_vector$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym23$PRINT_OBJECT_VECTOR_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_hash_table$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym25$PRINT_OBJECT_HASH_TABLE_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_function$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym26$PRINT_OBJECT_FUNCTION_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Guids.$dtp_guid$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym28$PRINT_OBJECT_GUID_METHOD));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13812L)
	public static SubLObject write_guid_string(SubLObject guid, SubLObject stream) {
		streams_high.write_string(Guids.guid_to_string(guid), stream, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions";
	@SubL(source = "sublisp/print-functions.lisp", position = 1033L)
	private static SubLSymbol $max_fixnum_base_power$;
	@SubL(source = "sublisp/print-functions.lisp", position = 1755L)
	private static SubLSymbol $max_fixnum_power_less_one$;
	private static SubLInteger $int$37;
	private static SubLInteger $int$36;
	private static SubLSymbol $sym2$PRINT_OBJECT_BIGNUM_METHOD;
	private static SubLSymbol $sym3$PRINT_OBJECT_FIXNUM_METHOD;
	private static SubLString $str4$Inf;
	private static SubLString $str5$NaN;
	private static SubLInteger $int$_2;
	private static SubLSymbol $sym7$PRINT_OBJECT_FLOAT_METHOD;
	private static SubLSymbol $sym8$PRINT_OBJECT_CHARACTER_METHOD;
	private static SubLString $str9$__;
	private static SubLSymbol $kw10$INTERNAL;
	private static SubLSymbol $kw11$CAPITALIZE;
	private static SubLSymbol $kw12$UPCASE;
	private static SubLSymbol $kw13$DOWNCASE;
	private static SubLSymbol $sym14$PRINT_OBJECT_SYMBOL_METHOD;
	private static SubLSymbol $sym15$PRINT_OBJECT_STRING_METHOD;
	private static SubLSymbol $sym16$QUOTE;
	private static SubLSymbol $kw17$STREAM;
	private static SubLString $str18$___;
	private static SubLString $str19$____;
	private static SubLSymbol $sym20$PRINT_OBJECT_CONS_METHOD;
	private static SubLString $str21$___;
	private static SubLString $str22$_D;
	private static SubLSymbol $sym23$PRINT_OBJECT_VECTOR_METHOD;
	private static SubLString $str24$TEST__A__D__D;
	private static SubLSymbol $sym25$PRINT_OBJECT_HASH_TABLE_METHOD;
	private static SubLSymbol $sym26$PRINT_OBJECT_FUNCTION_METHOD;
	private static SubLString $str27$_G;
	private static SubLSymbol $sym28$PRINT_OBJECT_GUID_METHOD;
	static {
		me = new print_functions();
		print_functions.$max_fixnum_base_power$ = null;
		print_functions.$max_fixnum_power_less_one$ = null;
		$int$37 = SubLObjectFactory.makeInteger(37);
		$int$36 = SubLObjectFactory.makeInteger(36);
		$sym2$PRINT_OBJECT_BIGNUM_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-BIGNUM-METHOD");
		$sym3$PRINT_OBJECT_FIXNUM_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-FIXNUM-METHOD");
		$str4$Inf = SubLObjectFactory.makeString("Inf");
		$str5$NaN = SubLObjectFactory.makeString("NaN");
		$int$_2 = SubLObjectFactory.makeInteger(-2);
		$sym7$PRINT_OBJECT_FLOAT_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-FLOAT-METHOD");
		$sym8$PRINT_OBJECT_CHARACTER_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-CHARACTER-METHOD");
		$str9$__ = SubLObjectFactory.makeString("#:");
		$kw10$INTERNAL = SubLObjectFactory.makeKeyword("INTERNAL");
		$kw11$CAPITALIZE = SubLObjectFactory.makeKeyword("CAPITALIZE");
		$kw12$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
		$kw13$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");
		$sym14$PRINT_OBJECT_SYMBOL_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-SYMBOL-METHOD");
		$sym15$PRINT_OBJECT_STRING_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-STRING-METHOD");
		$sym16$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		$kw17$STREAM = SubLObjectFactory.makeKeyword("STREAM");
		$str18$___ = SubLObjectFactory.makeString(" . ");
		$str19$____ = SubLObjectFactory.makeString(" ...");
		$sym20$PRINT_OBJECT_CONS_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-CONS-METHOD");
		$str21$___ = SubLObjectFactory.makeString("...");
		$str22$_D = SubLObjectFactory.makeString("~D");
		$sym23$PRINT_OBJECT_VECTOR_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-VECTOR-METHOD");
		$str24$TEST__A__D__D = SubLObjectFactory.makeString("TEST ~A ~D/~D");
		$sym25$PRINT_OBJECT_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-HASH-TABLE-METHOD");
		$sym26$PRINT_OBJECT_FUNCTION_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-FUNCTION-METHOD");
		$str27$_G = SubLObjectFactory.makeString("#G");
		$sym28$PRINT_OBJECT_GUID_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-GUID-METHOD");
	}

	@Override
	public void declareFunctions() {
		declare_print_functions_file();
	}

	@Override
	public void initializeVariables() {
		init_print_functions_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_print_functions_file();
	}
}
