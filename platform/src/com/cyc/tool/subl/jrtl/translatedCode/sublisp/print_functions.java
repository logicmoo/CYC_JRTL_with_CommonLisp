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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class print_functions extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new print_functions();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions";
	/**
	 * Used for storing the value of the maximum power of a radix that is still
	 * a fixnum i.e. (FLOOR (LOG MOST-POSITIVE-FIXNUM RADIX)).
	 */
	@SubL(source = "sublisp/print-functions.lisp", position = 1032)
	private static SubLSymbol $max_fixnum_base_power$ = null;

	//// Definitions

	/**
	 * Used for storing the value of the integer such that a radix raised to one
	 * plus that power is the corresponding entry in *max-fixnum-base-power*.
	 */
	@SubL(source = "sublisp/print-functions.lisp", position = 1754)
	private static SubLSymbol $max_fixnum_power_less_one$ = null;

	public static SubLInteger $int0$37 = SubLObjectFactory.makeInteger(37);

	public static SubLInteger $int1$36 = SubLObjectFactory.makeInteger(36);

	public static SubLSymbol $sym2$PRINT_OBJECT_BIGNUM_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-BIGNUM-METHOD");

	public static SubLSymbol $sym3$PRINT_OBJECT_FIXNUM_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-FIXNUM-METHOD");

	public static SubLString $str4$Inf = SubLObjectFactory.makeString("Inf");

	public static SubLString $str5$NaN = SubLObjectFactory.makeString("NaN");

	public static SubLInteger $int6$_2 = SubLObjectFactory.makeInteger(-2);

	public static SubLSymbol $sym7$PRINT_OBJECT_FLOAT_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-FLOAT-METHOD");

	public static SubLSymbol $sym8$PRINT_OBJECT_CHARACTER_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-CHARACTER-METHOD");

	public static SubLString $str9$__ = SubLObjectFactory.makeString("#:");

	public static SubLSymbol $kw10$INTERNAL = SubLObjectFactory.makeKeyword("INTERNAL");

	public static SubLSymbol $kw11$CAPITALIZE = SubLObjectFactory.makeKeyword("CAPITALIZE");

	public static SubLSymbol $kw12$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");

	public static SubLSymbol $kw13$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");

	public static SubLSymbol $sym14$PRINT_OBJECT_SYMBOL_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-SYMBOL-METHOD");

	public static SubLSymbol $sym15$PRINT_OBJECT_STRING_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-STRING-METHOD");

	public static SubLSymbol $sym16$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");

	public static SubLSymbol $kw17$STREAM = SubLObjectFactory.makeKeyword("STREAM");

	public static SubLString $str18$___ = SubLObjectFactory.makeString(" . ");

	public static SubLString $str19$____ = SubLObjectFactory.makeString(" ...");

	public static SubLSymbol $sym20$PRINT_OBJECT_CONS_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-CONS-METHOD");

	public static SubLString $str21$___ = SubLObjectFactory.makeString("...");

	public static SubLString $str22$__ = SubLObjectFactory.makeString("#<");

	public static SubLString $str23$_D = SubLObjectFactory.makeString("~D");

	public static SubLSymbol $kw24$BASE = SubLObjectFactory.makeKeyword("BASE");

	public static SubLSymbol $sym25$PRINT_OBJECT_VECTOR_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-VECTOR-METHOD");

	public static SubLString $str26$TEST__A__D__D = SubLObjectFactory.makeString("TEST ~A ~D/~D");

	public static SubLSymbol $sym27$PRINT_OBJECT_HASH_TABLE_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-HASH-TABLE-METHOD");

	//// Internal Constants

	public static SubLSymbol $sym28$PRINT_OBJECT_FUNCTION_METHOD = SubLObjectFactory
			.makeSymbol("PRINT-OBJECT-FUNCTION-METHOD");
	public static SubLString $str29$_G = SubLObjectFactory.makeString("#G");
	public static SubLSymbol $sym30$PRINT_OBJECT_GUID_METHOD = SubLObjectFactory.makeSymbol("PRINT-OBJECT-GUID-METHOD");

	public static SubLObject declare_print_functions_file() {
		SubLFiles.declareFunction(print_functions.myName, "print_integer_internal", "PRINT-INTEGER-INTERNAL", 3, 0,
				false);
		SubLFiles.declareFunction(print_functions.myName, "print_bignum_internal", "PRINT-BIGNUM-INTERNAL", 5, 0,
				false);
		SubLFiles.declareFunction(print_functions.myName, "print_integer", "PRINT-INTEGER", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_bignum_method", "PRINT-OBJECT-BIGNUM-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_fixnum_method", "PRINT-OBJECT-FIXNUM-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_flonum", "PRINT-FLONUM", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_float_method", "PRINT-OBJECT-FLOAT-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_character", "PRINT-CHARACTER", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_character_method",
				"PRINT-OBJECT-CHARACTER-METHOD", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_symbol_package_portion",
				"PRINT-SYMBOL-PACKAGE-PORTION", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_symbol", "PRINT-SYMBOL", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_symbol_method", "PRINT-OBJECT-SYMBOL-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_string", "PRINT-STRING", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_string_method", "PRINT-OBJECT-STRING-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_cons_cells", "PRINT-CONS-CELLS", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_cons_method", "PRINT-OBJECT-CONS-METHOD", 2, 0,
				false);
		SubLFiles.declareFunction(print_functions.myName, "print_vector", "PRINT-VECTOR", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_vector_method", "PRINT-OBJECT-VECTOR-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_hashtable", "PRINT-HASHTABLE", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_hash_table_method",
				"PRINT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_function_method",
				"PRINT-OBJECT-FUNCTION-METHOD", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "write_guid_string", "WRITE-GUID-STRING", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_guid_internal", "PRINT-GUID-INTERNAL", 2, 0, false);
		SubLFiles.declareFunction(print_functions.myName, "print_object_guid_method", "PRINT-OBJECT-GUID-METHOD", 2, 0,
				false);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_print_functions_file() {
		print_functions.$max_fixnum_base_power$ = SubLFiles.defvar("*MAX-FIXNUM-BASE-POWER*",
				Vectors.make_vector(print_functions.$int0$37, CommonSymbols.UNPROVIDED));
		print_functions.$max_fixnum_power_less_one$ = SubLFiles.defvar("*MAX-FIXNUM-POWER-LESS-ONE*",
				Vectors.make_vector(print_functions.$int0$37, CommonSymbols.UNPROVIDED));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 2490)
	public static SubLObject print_bignum_internal(SubLObject bignum, SubLObject stream, SubLObject radix,
			SubLObject divisor, SubLObject power_less_one) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject quotient = Numbers.truncate(bignum, divisor);
				SubLObject remainder = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (quotient.isFixnum())
					print_functions.print_integer_internal(quotient, stream, radix);
				else
					print_functions.print_bignum_internal(quotient, stream, radix, divisor, power_less_one);
				{
					SubLObject num_zeros = CommonSymbols.NIL;
					SubLObject base_power = CommonSymbols.NIL;
					for (num_zeros = power_less_one, base_power = radix; !base_power
							.numG(remainder); num_zeros = Numbers.subtract(num_zeros,
									CommonSymbols.ONE_INTEGER), base_power = Numbers.multiply(base_power, radix)) {
					}
					{
						SubLObject i = CommonSymbols.NIL;
						for (i = CommonSymbols.ZERO_INTEGER; i
								.numL(num_zeros); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
							streams_high.write_char(Characters.CHAR_0, stream);
					}
					print_functions.print_integer_internal(remainder, stream, radix);
				}
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 5600)
	public static SubLObject print_character(SubLObject character, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_escape$.getDynamicValue(thread)) {
				streams_high.write_char(Characters.CHAR_hash, stream);
				streams_high.write_char(Characters.CHAR_backslash, stream);
				streams_high.write_string(character_names.character_names(character).first(), stream,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			} else
				streams_high.write_char(character, stream);
			return character;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 9388)
	public static SubLObject print_cons_cells(SubLObject cons, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == print_high.$print_readably$.getDynamicValue(thread)
					&& print_high.$print_level$.getDynamicValue(thread).eql(CommonSymbols.ZERO_INTEGER))
				streams_high.write_char(Characters.CHAR_hash, stream);
			else {
				SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
				try {
					print_high.$print_level$.bind(CommonSymbols.NIL != print_high.$print_level$.getDynamicValue(thread)
							? (SubLObject) Numbers.subtract(print_high.$print_level$.getDynamicValue(thread),
									CommonSymbols.ONE_INTEGER)
							: CommonSymbols.NIL, thread);
					{
						SubLObject done = CommonSymbols.NIL;
						SubLObject count = CommonSymbols.ONE_INTEGER;
						SubLObject first = cons.first();
						SubLObject tail = cons.rest();
						if (CommonSymbols.NIL != print_high.$print_pretty$.getDynamicValue(thread)
								&& first.eql(print_functions.$sym16$QUOTE) && tail.isCons()
								&& CommonSymbols.NIL == tail.rest()) {
							streams_high.write_char(Characters.CHAR_quote, stream);
							PrintLow.write(conses_high.cadr(cons),
									new SubLObject[] { print_functions.$kw17$STREAM, stream });
						} else {
							streams_high.write_char(Characters.CHAR_lparen, stream);
							PrintLow.write(first, new SubLObject[] { print_functions.$kw17$STREAM, stream });
							for (; !(tail.isAtom() || CommonSymbols.NIL != done);)
								if (CommonSymbols.NIL != print_high.circular_reference_p(tail, stream)) {
									streams_high.write_string(print_functions.$str18$___, stream,
											CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
									PrintLow.write(tail, new SubLObject[] { print_functions.$kw17$STREAM, stream });
									done = CommonSymbols.T;
								} else if (CommonSymbols.NIL == print_high.$print_readably$.getDynamicValue(thread)
										&& CommonSymbols.NIL != print_high.$print_length$.getDynamicValue(thread)
										&& count.numGE(print_high.$print_length$.getDynamicValue(thread))) {
									streams_high.write_string(print_functions.$str19$____, stream,
											CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
									done = CommonSymbols.T;
								} else {
									streams_high.write_char(Characters.CHAR_space, stream);
									PrintLow.write(tail.first(),
											new SubLObject[] { print_functions.$kw17$STREAM, stream });
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
					}
				} finally {
					print_high.$print_level$.rebind(_prev_bind_0, thread);
				}
			}
			return cons;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 4198)
	public static SubLObject print_flonum(SubLObject flonum, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (Numbers.float_sign(flonum, CommonSymbols.UNPROVIDED).isNegative())
				streams_high.write_char(Characters.CHAR_hyphen, stream);
			if (CommonSymbols.NIL != Numbers.infinity_p(flonum))
				streams_high.write_string(print_functions.$str4$Inf, stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
			else if (CommonSymbols.NIL != Numbers.not_a_number_p(flonum))
				streams_high.write_string(print_functions.$str5$NaN, stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
			else {
				thread.resetMultipleValues();
				{
					SubLObject digits = math_utilities.flonum_digit_list(flonum);
					SubLObject scale = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (scale.numGE(print_functions.$int6$_2) && scale.numL(CommonSymbols.EIGHT_INTEGER)) {
						if (scale.isPositive()) {
							{
								SubLObject i = CommonSymbols.NIL;
								for (i = CommonSymbols.ZERO_INTEGER; i
										.numL(scale); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
									SubLObject digit = digits.first();
									streams_high.write_char(CommonSymbols.NIL != digit
											? (SubLObject) Characters.digit_char(digit) : Characters.CHAR_0, stream);
									digits = digits.rest();
								}
							}
							streams_high.write_char(Characters.CHAR_period, stream);
						} else {
							streams_high.write_char(Characters.CHAR_0, stream);
							streams_high.write_char(Characters.CHAR_period, stream);
							{
								SubLObject cdotimes_end_var = Numbers.abs(scale);
								SubLObject i = CommonSymbols.NIL;
								for (i = CommonSymbols.ZERO_INTEGER; i
										.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
									streams_high.write_char(Characters.CHAR_0, stream);
							}
						}
						if (CommonSymbols.NIL != digits) {
							SubLObject cdolist_list_var = digits;
							SubLObject digit = CommonSymbols.NIL;
							for (digit = cdolist_list_var
									.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
											.rest(), digit = cdolist_list_var.first())
								streams_high.write_char(Characters.digit_char(digit), stream);
						} else
							streams_high.write_char(Characters.CHAR_0, stream);
					} else {
						streams_high.write_char(CommonSymbols.NIL != digits
								? (SubLObject) Characters.digit_char(digits.first()) : Characters.CHAR_0, stream);
						streams_high.write_char(Characters.CHAR_period, stream);
						if (CommonSymbols.NIL != digits.rest()) {
							SubLObject cdolist_list_var = digits.rest();
							SubLObject digit = CommonSymbols.NIL;
							for (digit = cdolist_list_var
									.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
											.rest(), digit = cdolist_list_var.first())
								streams_high.write_char(Characters.digit_char(digit), stream);
						} else
							streams_high.write_char(Characters.CHAR_0, stream);
						streams_high.write_char(Characters.CHAR_E, stream);
						{
							SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
							try {
								print_high.$print_base$.bind(CommonSymbols.TEN_INTEGER, thread);
								print_high.princ(Numbers.subtract(scale, CommonSymbols.ONE_INTEGER), stream);
							} finally {
								print_high.$print_base$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
			}
			return flonum;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13455)
	public static SubLObject print_guid_internal(SubLObject object, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_escape$.getDynamicValue(thread)) {
				streams_high.write_string(print_functions.$str29$_G, stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				streams_high.write_char(Characters.CHAR_quotation, stream);
				print_functions.write_guid_string(object, stream);
				streams_high.write_char(Characters.CHAR_quotation, stream);
			} else
				print_functions.write_guid_string(object, stream);
			return object;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 12106)
	public static SubLObject print_hashtable(SubLObject hash_table, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_readably$.getDynamicValue(thread))
				print_high.print_not_readable(hash_table, stream);
			else {
				SubLObject object = hash_table;
				SubLObject stream_2 = stream;
				streams_high.write_string(print_functions.$str22$__, stream_2, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				PrintLow.write(Types.type_of(object), new SubLObject[] { print_functions.$kw17$STREAM, stream_2 });
				streams_high.write_char(Characters.CHAR_space, stream_2);
				PrintLow.format(stream, print_functions.$str26$TEST__A__D__D,
						new SubLObject[] { Hashtables.hash_table_test(hash_table),
								Hashtables.hash_table_count(hash_table), Hashtables.hash_table_size(hash_table) });
				streams_high.write_char(Characters.CHAR_space, stream_2);
				PrintLow.write(Equality.pointer(object), new SubLObject[] { print_functions.$kw17$STREAM, stream_2,
						print_functions.$kw24$BASE, CommonSymbols.SIXTEEN_INTEGER });
				streams_high.write_char(Characters.CHAR_greater, stream_2);
			}
			return hash_table;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 3068)
	public static SubLObject print_integer(SubLObject integer, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_radix$.getDynamicValue(thread)
					&& !print_high.$print_base$.getDynamicValue(thread).numE(CommonSymbols.TEN_INTEGER)) {
				streams_high.write_char(Characters.CHAR_hash, stream);
				{
					SubLObject pcase_var = print_high.$print_base$.getDynamicValue(thread);
					if (pcase_var.eql(CommonSymbols.TWO_INTEGER))
						streams_high.write_char(Characters.CHAR_b, stream);
					else if (pcase_var.eql(CommonSymbols.EIGHT_INTEGER))
						streams_high.write_char(Characters.CHAR_o, stream);
					else if (pcase_var.eql(CommonSymbols.SIXTEEN_INTEGER))
						streams_high.write_char(Characters.CHAR_x, stream);
					else {
						SubLObject radix = print_high.$print_base$.getDynamicValue(thread);
						{
							SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
							SubLObject _prev_bind_1 = print_high.$print_radix$.currentBinding(thread);
							try {
								print_high.$print_base$.bind(CommonSymbols.TEN_INTEGER, thread);
								print_high.$print_radix$.bind(CommonSymbols.NIL, thread);
								print_functions.print_integer_internal(radix, stream,
										print_high.$print_base$.getDynamicValue(thread));
								streams_high.write_char(Characters.CHAR_r, stream);
							} finally {
								print_high.$print_radix$.rebind(_prev_bind_1, thread);
								print_high.$print_base$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
			}
			if (integer.isNegative())
				streams_high.write_char(Characters.CHAR_hyphen, stream);
			if (integer.isInteger() && !integer.isFixnum())
				print_functions.print_bignum_internal(Numbers.abs(integer), stream,
						print_high.$print_base$.getDynamicValue(thread),
						Vectors.aref(print_functions.$max_fixnum_base_power$.getDynamicValue(thread),
								print_high.$print_base$.getDynamicValue(thread)),
						Vectors.aref(print_functions.$max_fixnum_power_less_one$.getDynamicValue(thread),
								print_high.$print_base$.getDynamicValue(thread)));
			else
				print_functions.print_integer_internal(Numbers.abs(integer), stream,
						print_high.$print_base$.getDynamicValue(thread));
			if (CommonSymbols.NIL != print_high.$print_radix$.getDynamicValue(thread)
					&& print_high.$print_base$.getDynamicValue(thread).numE(CommonSymbols.TEN_INTEGER))
				streams_high.write_char(Characters.CHAR_period, stream);
			return integer;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 671)
	public static SubLObject print_integer_internal(SubLObject integer, SubLObject stream, SubLObject print_base) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject quotient = Numbers.truncate(integer, print_base);
				SubLObject remainder = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (!quotient.isZero())
					print_functions.print_integer_internal(quotient, stream, print_base);
				streams_high.write_char(Characters.digit_char(remainder), stream);
			}
			return integer;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 3994)
	public static SubLObject print_object_bignum_method(SubLObject bignum, SubLObject stream) {
		print_functions.print_integer(bignum, stream);
		return bignum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 5885)
	public static SubLObject print_object_character_method(SubLObject character, SubLObject stream) {
		print_functions.print_character(character, stream);
		return character;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 10746)
	public static SubLObject print_object_cons_method(SubLObject cons, SubLObject stream) {
		print_functions.print_cons_cells(cons, stream);
		return cons;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 4096)
	public static SubLObject print_object_fixnum_method(SubLObject fixnum, SubLObject stream) {
		print_functions.print_integer(fixnum, stream);
		return fixnum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 5500)
	public static SubLObject print_object_float_method(SubLObject flonum, SubLObject stream) {
		print_functions.print_flonum(flonum, stream);
		return flonum;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13204)
	public static SubLObject print_object_function_method(SubLObject function, SubLObject stream) {
		Functions.print_function(function, stream);
		return function;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13776)
	public static SubLObject print_object_guid_method(SubLObject guid, SubLObject stream) {
		print_functions.print_guid_internal(guid, stream);
		return guid;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13084)
	public static SubLObject print_object_hash_table_method(SubLObject hash_table, SubLObject stream) {
		print_functions.print_hashtable(hash_table, stream);
		return hash_table;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 9287)
	public static SubLObject print_object_string_method(SubLObject string, SubLObject stream) {
		print_functions.print_string(string, stream);
		return string;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 8717)
	public static SubLObject print_object_symbol_method(SubLObject symbol, SubLObject stream) {
		print_functions.print_symbol(symbol, stream);
		return symbol;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 12005)
	public static SubLObject print_object_vector_method(SubLObject vector, SubLObject stream) {
		print_functions.print_vector(vector, stream);
		return vector;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 8818)
	public static SubLObject print_string(SubLObject string, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_escape$.getDynamicValue(thread)) {
				streams_high.write_char(Characters.CHAR_quotation, stream);
				{
					SubLObject cdotimes_end_var = Sequences.length(string);
					SubLObject i = CommonSymbols.NIL;
					for (i = CommonSymbols.ZERO_INTEGER; i
							.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
						SubLObject ch = Strings.sublisp_char(string, i);
						if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_quotation)
								|| CommonSymbols.NIL != reader.single_escape_syntaxp(ch))
							streams_high.write_char(Characters.CHAR_backslash, stream);
						streams_high.write_char(ch, stream);
					}
				}
				streams_high.write_char(Characters.CHAR_quotation, stream);
			} else
				streams_high.write_string(string, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			return string;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 7286)
	public static SubLObject print_symbol(SubLObject symbol, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject name = Symbols.symbol_name(symbol);
				if (CommonSymbols.NIL != print_high.$print_escape$.getDynamicValue(thread))
					print_functions.print_symbol_package_portion(symbol, stream);
				if (CommonSymbols.NIL != print_high.$print_escape$.getDynamicValue(thread)
						|| CommonSymbols.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
					if (CommonSymbols.NIL != reader.symbol_escapep(symbol)) {
						streams_high.write_char(Characters.CHAR_vertical, stream);
						streams_high.write_string(name, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						streams_high.write_char(Characters.CHAR_vertical, stream);
					} else
						streams_high.write_string(name, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				} else if (print_high.$print_case$.getDynamicValue(thread) == print_functions.$kw11$CAPITALIZE)
					streams_high.write_string(
							Strings.string_capitalize(name, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), stream,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				else {
					SubLObject upper = CommonSymbols.NIL;
					SubLObject lower = CommonSymbols.NIL;
					SubLObject cdotimes_end_var = Sequences.length(name);
					SubLObject i = CommonSymbols.NIL;
					for (i = CommonSymbols.ZERO_INTEGER; i
							.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
						SubLObject ch = Strings.sublisp_char(name, i);
						if (CommonSymbols.NIL != Characters.both_case_p(ch))
							if (CommonSymbols.NIL != Characters.upper_case_p(ch))
								upper = CommonSymbols.T;
							else
								lower = CommonSymbols.T;
					}
					{
						SubLObject pcase_var = print_high.$print_case$.getDynamicValue(thread);
						if (pcase_var.eql(print_functions.$kw12$UPCASE))
							streams_high.write_string(
									CommonSymbols.NIL != lower ? (SubLObject) Strings.string_upcase(name,
											CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED) : name,
									stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						else if (pcase_var.eql(print_functions.$kw13$DOWNCASE))
							streams_high.write_string(
									CommonSymbols.NIL != upper ? (SubLObject) Strings.string_downcase(name,
											CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED) : name,
									stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
					}
				}
			}
			return symbol;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 6003)
	public static SubLObject print_symbol_package_portion(SubLObject symbol, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (symbol.isKeyword())
				streams_high.write_char(Characters.CHAR_colon, stream);
			else {
				thread.resetMultipleValues();
				{
					SubLObject symb = Packages.find_symbol(Symbols.symbol_name(symbol),
							Packages.$package$.getDynamicValue(thread));
					SubLObject state = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (CommonSymbols.NIL == state || symb != symbol) {
						SubLObject v_package = Symbols.symbol_package(symbol);
						if (!v_package.isPackage())
							streams_high.write_string(print_functions.$str9$__, stream, CommonSymbols.UNPROVIDED,
									CommonSymbols.UNPROVIDED);
						else {
							thread.resetMultipleValues();
							{
								SubLObject sym = Packages.find_symbol(Symbols.symbol_name(symbol), v_package);
								SubLObject tag = thread.secondMultipleValue();
								thread.resetMultipleValues();
								streams_high.write_string(Packages.package_name(v_package), stream,
										CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
								streams_high.write_char(Characters.CHAR_colon, stream);
								if (tag == print_functions.$kw10$INTERNAL)
									streams_high.write_char(Characters.CHAR_colon, stream);
							}
						}
					}
				}
			}
			return symbol;
		}
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 10843)
	public static SubLObject print_vector(SubLObject vector, SubLObject stream) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject length = Sequences.length(vector);
				if (CommonSymbols.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
					streams_high.write_char(Characters.CHAR_hash, stream);
					streams_high.write_char(Characters.CHAR_lparen, stream);
					if (length.isPositive()) {
						PrintLow.write(Vectors.aref(vector, CommonSymbols.ZERO_INTEGER),
								new SubLObject[] { print_functions.$kw17$STREAM, stream });
						{
							SubLObject cdotimes_end_var = Numbers.subtract(length, CommonSymbols.ONE_INTEGER);
							SubLObject i = CommonSymbols.NIL;
							for (i = CommonSymbols.ZERO_INTEGER; i
									.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
								streams_high.write_char(Characters.CHAR_space, stream);
								PrintLow.write(Vectors.aref(vector, Numbers.add(i, CommonSymbols.ONE_INTEGER)),
										new SubLObject[] { print_functions.$kw17$STREAM, stream });
							}
						}
					}
					streams_high.write_char(Characters.CHAR_rparen, stream);
				} else if (CommonSymbols.NIL != print_high.$print_array$.getDynamicValue(thread)) {
					streams_high.write_char(Characters.CHAR_hash, stream);
					if (!print_high.$print_level$.getDynamicValue(thread).eql(CommonSymbols.ZERO_INTEGER)) {
						streams_high.write_char(Characters.CHAR_lparen, stream);
						{
							SubLObject actual = CommonSymbols.NIL != print_high.$print_length$.getDynamicValue(thread)
									? (SubLObject) Numbers.min(print_high.$print_length$.getDynamicValue(thread),
											length)
									: length;
							{
								SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
								try {
									print_high.$print_level$
											.bind(CommonSymbols.NIL != print_high.$print_level$.getDynamicValue(thread)
													? (SubLObject) Numbers.subtract(
															print_high.$print_level$.getDynamicValue(thread),
															CommonSymbols.ONE_INTEGER)
													: CommonSymbols.NIL, thread);
									{
										SubLObject i = CommonSymbols.NIL;
										for (i = CommonSymbols.ZERO_INTEGER; i
												.numL(actual); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
											if (!i.isZero())
												streams_high.write_char(Characters.CHAR_space, stream);
											PrintLow.write(Vectors.aref(vector, i),
													new SubLObject[] { print_functions.$kw17$STREAM, stream });
										}
										if (actual.numL(length)) {
											if (actual.isPositive())
												streams_high.write_char(Characters.CHAR_space, stream);
											streams_high.write_string(print_functions.$str21$___, stream,
													CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
										}
									}
								} finally {
									print_high.$print_level$.rebind(_prev_bind_0, thread);
								}
							}
						}
						streams_high.write_char(Characters.CHAR_rparen, stream);
					}
				} else if (CommonSymbols.NIL != print_high.$print_readably$.getDynamicValue(thread))
					print_high.print_not_readable(vector, stream);
				else {
					SubLObject object = vector;
					SubLObject stream_1 = stream;
					streams_high.write_string(print_functions.$str22$__, stream_1, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
					PrintLow.write(Types.type_of(object), new SubLObject[] { print_functions.$kw17$STREAM, stream_1 });
					streams_high.write_char(Characters.CHAR_space, stream_1);
					PrintLow.format(stream, print_functions.$str23$_D, length);
					streams_high.write_char(Characters.CHAR_space, stream_1);
					PrintLow.write(Equality.pointer(object), new SubLObject[] { print_functions.$kw17$STREAM, stream_1,
							print_functions.$kw24$BASE, CommonSymbols.SIXTEEN_INTEGER });
					streams_high.write_char(Characters.CHAR_greater, stream_1);
				}
			}
			return vector;
		}
	}

	public static SubLObject setup_print_functions_file() {
		// CVS_ID("Id: print-functions.lisp 126640 2008-12-04 13:39:36Z builder
		// ");
		{
			SubLObject radix = CommonSymbols.NIL;
			for (radix = CommonSymbols.TWO_INTEGER; !radix.numG(print_functions.$int1$36); radix = Numbers.add(radix,
					CommonSymbols.ONE_INTEGER)) {
				SubLObject final_power_less_one = CommonSymbols.MINUS_ONE_INTEGER;
				SubLObject final_divisor = CommonSymbols.ONE_INTEGER;
				SubLObject done = CommonSymbols.NIL;
				SubLObject power_less_one = CommonSymbols.NIL;
				SubLObject divisor = CommonSymbols.NIL;
				SubLObject new_divisor = CommonSymbols.NIL;
				for (power_less_one = CommonSymbols.MINUS_ONE_INTEGER, divisor = CommonSymbols.ONE_INTEGER, new_divisor = radix; CommonSymbols.NIL == done; power_less_one = Numbers
						.add(power_less_one, CommonSymbols.ONE_INTEGER), divisor = new_divisor, new_divisor = Numbers
								.multiply(new_divisor, radix)) {
					done = SubLObjectFactory.makeBoolean(!new_divisor.isFixnum());
					if (CommonSymbols.NIL != done) {
						final_divisor = divisor;
						final_power_less_one = power_less_one;
					}
				}
				Vectors.set_aref(print_functions.$max_fixnum_base_power$.getDynamicValue(), radix, final_divisor);
				Vectors.set_aref(print_functions.$max_fixnum_power_less_one$.getDynamicValue(), radix,
						final_power_less_one);
			}
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
				Symbols.symbol_function(print_functions.$sym25$PRINT_OBJECT_VECTOR_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_hash_table$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym27$PRINT_OBJECT_HASH_TABLE_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_function$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym28$PRINT_OBJECT_FUNCTION_METHOD));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Guids.$dtp_guid$.getGlobalValue(),
				Symbols.symbol_function(print_functions.$sym30$PRINT_OBJECT_GUID_METHOD));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-functions.lisp", position = 13315)
	public static SubLObject write_guid_string(SubLObject guid, SubLObject stream) {
		streams_high.write_string(Guids.guid_to_string(guid), stream, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		return CommonSymbols.NIL;
	}

	private print_functions() {
	}

	//// Initializers

	public void declareFunctions() {
		print_functions.declare_print_functions_file();
	}

	public void initializeVariables() {
		print_functions.init_print_functions_file();
	}

	public void runTopLevelForms() {
		print_functions.setup_print_functions_file();
	}

}
