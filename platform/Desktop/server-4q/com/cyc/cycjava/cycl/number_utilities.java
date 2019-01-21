//
////
//

package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class number_utilities extends SubLTranslatedFile {
	public static final SubLFile me;
	public static final String myName = "com.cyc.cycjava.cycl.number_utilities";
	public static final String myFingerPrint = "399c18ada9e6f23a5d504d360a34e10ee142c8ff2460265f36c5bbeb66494b3e";
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1942L)
	public static SubLSymbol $large_immediate_positive_integer$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2140L)
	public static SubLSymbol $e$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 6148L)
	private static SubLSymbol $maximum_float_significant_digits$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 49606L)
	private static SubLSymbol $valid_number_string_characters$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51669L)
	private static SubLSymbol $valid_exponent_markers$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51822L)
	private static SubLSymbol $valid_sign$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51937L)
	private static SubLSymbol $largest_prime_by_binary_width$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 55930L)
	private static SubLSymbol $checksum_implementation_width$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56096L)
	private static SubLSymbol $checksum_base$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56516L)
	public static SubLSymbol $checksum_initial_value_sum$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56573L)
	public static SubLSymbol $checksum_initial_value_length$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56631L)
	public static SubLSymbol $checksum_sum$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56674L)
	public static SubLSymbol $checksum_length$;
	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70247L)
	private static SubLSymbol $hex_to_dec_table$;
	private static final SubLList $list0;
	private static final SubLList $list1;
	private static final SubLInteger $int2$26;
	private static final SubLSymbol $sym3$NUMBERP;
	private static final SubLInteger $int4$256;
	private static final SubLSymbol $sym5$NIL_OR_INTEGER_P;
	private static final SubLList $list6;
	private static final SubLString $str7$Return_T_iff_OBJECT_is_either_an_;
	private static final SubLList $list8;
	private static final SubLSymbol $kw9$IGNORE_ERRORS_TARGET;
	private static final SubLSymbol $sym10$IGNORE_ERRORS_HANDLER;
	private static final SubLSymbol $sym11$INTEGERP;
	private static final SubLSymbol $sym12$EXTENDED_POTENTIALLY_INFINITE_NUMBER_P;
	private static final SubLSymbol $sym13$POSITIVE_INTEGER_P;
	private static final SubLList $list14;
	private static final SubLInteger $int15$100;
	private static final SubLString $str16$NEW_must_be_larger_than_OLD;
	private static final SubLString $str17$NEW_must_be_smaller_than_OLD;
	private static final SubLSymbol $kw18$NEGATIVE_INFINITY;
	private static final SubLSymbol $kw19$POSITIVE_INFINITY;
	private static final SubLSymbol $sym20$POTENTIALLY_INFINITE_NUMBER_P;
	private static final SubLString $str21$Can_t_divide_zero_by_zero;
	private static final SubLSymbol $sym22$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P;
	private static final SubLString $str23$Can_t_add_positive_infinity_and_n;
	private static final SubLString $str24$Can_t_subtract_negative_infinity_;
	private static final SubLString $str25$Can_t_subtract_positive_infinity_;
	private static final SubLString $str26$Can_t_multiply_infinity_and_zero;
	private static final SubLString $str27$Can_t_divide_negative_infinity_by;
	private static final SubLString $str28$Can_t_divide_negative_infinity_by;
	private static final SubLString $str29$Can_t_divide_positive_infinity_by;
	private static final SubLString $str30$Can_t_divide_positive_infinity_by;
	private static final SubLSymbol $sym31$POTENTIALLY_INFINITE_INTEGER_P;
	private static final SubLSymbol $kw32$UNDEFINED;
	private static final SubLSymbol $sym33$POTENTIALLY_UNDEFINED_NUMBER_P;
	private static final SubLString $str34$Cannot_compute_the_maximum_of_an_;
	private static final SubLSymbol $sym35$_;
	private static final SubLString $str36$Cannot_compute_the_minimum_of_an_;
	private static final SubLSymbol $sym37$_;
	private static final SubLString $str38$Cannot_compute_the_mean_of_an_ato;
	private static final SubLString $str39$Cannot_compute_the_geometric_mean;
	private static final SubLSymbol $kw40$VALUE;
	private static final SubLString $str41$Cannot_compute_the_median_of_an_a;
	private static final SubLSymbol $kw42$ITEM;
	private static final SubLString $str43$Can_t_return_middle_item_from_an_;
	private static final SubLString $str44$Unrecognized_RETURN_type__S;
	private static final SubLSymbol $sym45$PERCENTILE_P;
	private static final SubLString $str46$Cannot_compute_the_percentile_of_;
	private static final SubLString $str47$Cannot_compute_frequencies_of_an_;
	private static final SubLSymbol $sym48$CDR;
	private static final SubLString $str49$Cannot_compute_the_mode_of_an_ato;
	private static final SubLString $str50$Cannot_compute_the_variance_of_an;
	private static final SubLString $str51$Cannot_compute_the_standard_devia;
	private static final SubLString $str52$Standard_deviation_must_not_be_ze;
	private static final SubLSymbol $sym53$__;
	private static final SubLSymbol $sym54$DOUBLE_FLOAT;
	private static final SubLString $str55$__Standard_Statistical_Analysis;
	private static final SubLString $str56$_______________________________;
	private static final SubLString $str57$__Count______6D;
	private static final SubLString $str58$__Min________6D;
	private static final SubLString $str59$__Median_____6D;
	private static final SubLString $str60$__Mean_______6D;
	private static final SubLString $str61$__Max________6D;
	private static final SubLString $str62$__Std_Dev____6D;
	private static final SubLString $str63$X_Values_and_Y_Values_must_be_of_;
	private static final SubLFloat $float64$1_0;
	private static final SubLSymbol $sym65$LISTP;
	private static final SubLString $str66$length_must_be_at_least_2_;
	private static final SubLString $str67$Cannot_start_at_1_;
	private static final SubLString $str68$Cannot_end_at_1_;
	private static final SubLString $str69$Cannot_start_at_or_below_0_;
	private static final SubLString $str70$Cannot_end_at_or_below_0_;
	private static final SubLString $str71$Length_must_be_at_least_1_;
	private static final SubLString $str72$Length_must_be_at_least_2_;
	private static final SubLSymbol $kw73$UNINITIALIZED;
	private static final SubLSymbol $sym74$CATCH_ERROR_MESSAGE_HANDLER;
	private static final SubLString $str75$This_integer_is_too_large_to_be_c;
	private static final SubLString $str76$_A;
	private static final SubLSymbol $sym77$DIGIT_CHAR_P;
	private static final SubLSymbol $sym78$VALID_NUMBER_STRING_CHAR;
	private static final SubLString $str79$0123456789___deDE;
	private static final SubLSymbol $sym80$VALID_EXPONENT_MARKER;
	private static final SubLString $str81$deDE;
	private static final SubLString $str82$__;
	private static final SubLList $list83;
	private static final SubLSymbol $sym84$CHECKSUM_SANITY_CHECK;
	private static final SubLSymbol $kw85$TEST;
	private static final SubLSymbol $kw86$OWNER;
	private static final SubLSymbol $kw87$CLASSES;
	private static final SubLSymbol $kw88$KB;
	private static final SubLSymbol $kw89$TINY;
	private static final SubLSymbol $kw90$WORKING_;
	private static final SubLList $list91;
	private static final SubLSymbol $sym92$CHECKSUM_SETUP;
	private static final SubLList $list93;
	private static final SubLList $list94;
	private static final SubLSymbol $sym95$CLET;
	private static final SubLSymbol $sym96$_CHECKSUM_SUM_;
	private static final SubLSymbol $sym97$_CHECKSUM_LENGTH_;
	private static final SubLList $list98;
	private static final SubLList $list99;
	private static final SubLSymbol $sym100$CAR;
	private static final SubLList $list101;
	private static final SubLSymbol $sym102$CHECKSUM_START;
	private static final SubLSymbol $sym103$CSETQ;
	private static final SubLList $list104;
	private static final SubLSymbol $kw105$BASE;
	private static final SubLString $str106$_X;
	private static final SubLString $str107$_A_is_not_a_positive_integer_grea;
	private static final SubLSymbol $sym108$FIND_SMALLEST_DIVISOR;
	private static final SubLList $list109;
	private static final SubLSymbol $sym110$PRODUCT;
	private static final SubLSymbol $sym111$NON_DOTTED_LIST_P;
	private static final SubLSymbol $sym112$ABS;
	private static final SubLSymbol $sym113$LCM2_INTERNAL;
	private static final SubLSymbol $sym114$GCD2_INTERNAL;
	private static final SubLList $list115;
	private static final SubLList $list116;
	private static final SubLSymbol $sym117$PROB;
	private static final SubLSymbol $sym118$CHECK_TYPE;
	private static final SubLList $list119;
	private static final SubLSymbol $sym120$PWHEN;
	private static final SubLSymbol $sym121$TRUE_WITH_PROBABILITY;
	private static final SubLSymbol $sym122$PROBABILITY_P;
	private static final SubLInteger $int123$1000;
	private static final SubLFloat $float124$1_0e_5;
	private static final SubLSymbol $sym125$PROBABILITY_DISTRIBUTION_P;
	private static final SubLString $str126$Error_sampling_from__s____s__s_;
	private static final SubLSymbol $sym127$NON_NEGATIVE_INTEGER_P;
	private static final SubLSymbol $sym128$FIBONACCI_MEMOIZED;
	private static final SubLSymbol $sym129$FUNCTION_SPEC_P;
	private static final SubLList $list130;
	private static final SubLString $str131$_s_must_be_____s;
	private static final SubLList $list132;
	private static final SubLList $list133;
	private static final SubLSymbol $sym134$SECOND;
	private static final SubLInteger $int135$25;
	private static final SubLSymbol $sym136$AVERAGE_NEIGHBORS;
	private static final SubLList $list137;
	private static final SubLSymbol $kw138$DELETED;
	private static final SubLSymbol $sym139$TEST_RENUMBER_ID_USING_TABLE;
	private static final SubLObject $list140;
	private static final SubLString $str141$Original_id__A_was_supposed_to_ma;
	private static final SubLSymbol $kw142$SUCCESS;
	private static final SubLSymbol $sym143$TRANSFORM_DELETE_LIST_TO_GAP_LIST;
	private static final SubLList $list144;
	private static final SubLList $list145;
	private static final SubLString $str146$Invalid_gap_list_format__Unclear_;
	private static final SubLSymbol $sym147$TRANSFORM_GAP_LIST_TO_DELTA_LIST;
	private static final SubLList $list148;
	private static final SubLSymbol $sym149$TEST_RENUMBER_ID_USING_DELTA_TABLE;
	private static final SubLString $str150$ID__A_should_have_been_deleted_bu;
	private static final SubLSymbol $sym151$PRIME_NUMBER_;
	private static final SubLList $list152;
	private static final SubLList $list153;
	private static final SubLSymbol $sym154$MEDIAN;
	private static final SubLList $list155;
	private static final SubLSymbol $sym156$COMPUTE_DELTAS;
	private static final SubLList $list157;

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 651L)
	public static SubLObject f_1X(final SubLObject number) {
		return Numbers.add(number, (SubLObject) number_utilities.ONE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 801L)
	public static SubLObject f_1_(final SubLObject number) {
		return Numbers.subtract(number, (SubLObject) number_utilities.ONE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 893L)
	public static SubLObject f_2X(final SubLObject number) {
		return Numbers.add(number, number);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 990L)
	public static SubLObject onep(final SubLObject v_object) {
		return Equality.eql((SubLObject) number_utilities.ONE_INTEGER, v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1239L)
	public static SubLObject encode_boolean(final SubLObject v_object) {
		return (SubLObject) ((number_utilities.NIL != v_object) ? number_utilities.ONE_INTEGER
				: number_utilities.ZERO_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1338L)
	public static SubLObject decode_boolean(final SubLObject integer) {
		return (SubLObject) SubLObjectFactory.makeBoolean(!integer.isZero());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1482L)
	public static SubLObject get_bit(final SubLObject bits, final SubLObject bit_number) {
		return decode_boolean(
				bytes.ldb(bytes.sublisp_byte((SubLObject) number_utilities.ONE_INTEGER, bit_number), bits));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1634L)
	public static SubLObject set_bit(final SubLObject bits, final SubLObject bit_number, SubLObject v_boolean) {
		if (v_boolean == number_utilities.UNPROVIDED) {
			v_boolean = (SubLObject) number_utilities.T;
		}
		return bytes.dpb(encode_boolean(v_boolean),
				bytes.sublisp_byte((SubLObject) number_utilities.ONE_INTEGER, bit_number), bits);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1812L)
	public static SubLObject clear_bit(final SubLObject bits, final SubLObject bit_number) {
		return set_bit(bits, bit_number, (SubLObject) number_utilities.NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2208L)
	public static SubLObject div(final SubLObject number, final SubLObject divisor) {
		assert number_utilities.NIL != Types.numberp(number) : number;
		assert number_utilities.NIL != Types.numberp(divisor) : divisor;
		return Numbers.integerDivide(number, divisor);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2337L)
	public static SubLObject safe_X(final SubLObject number, final SubLObject divisor) {
		return (SubLObject) ((number_utilities.NIL == non_zero_number_p(divisor)) ? number_utilities.ZERO_INTEGER
				: (number.isNumber() ? Numbers.divide(number, divisor) : number_utilities.ZERO_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2499L)
	public static SubLObject square(final SubLObject number) {
		assert number_utilities.NIL != Types.numberp(number) : number;
		return Numbers.multiply(number, number);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2644L)
	public static SubLObject cube(final SubLObject number) {
		assert number_utilities.NIL != Types.numberp(number) : number;
		return Numbers.expt(number, (SubLObject) number_utilities.THREE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2785L)
	public static SubLObject cubert(final SubLObject number) {
		assert number_utilities.NIL != Types.numberp(number) : number;
		return Numbers.expt(number,
				Numbers.divide((SubLObject) number_utilities.ONE_INTEGER, (SubLObject) number_utilities.THREE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2914L)
	public static SubLObject bytep(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_object.isInteger() && number_utilities.ZERO_INTEGER.numLE(v_object)
						&& v_object.numL((SubLObject) number_utilities.$int4$256));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3070L)
	public static SubLObject nil_or_integer_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL == v_object || v_object.isInteger());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3243L)
	public static SubLObject possibly_positive_integer_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL == v_object
				|| number_utilities.NIL != subl_promotions.positive_integer_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3460L)
	public static SubLObject list_of_integer_p(final SubLObject v_object) {
		if (number_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
			SubLObject cdolist_list_var = v_object;
			SubLObject subobject = (SubLObject) number_utilities.NIL;
			subobject = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (!subobject.isInteger()) {
					return (SubLObject) number_utilities.NIL;
				}
				cdolist_list_var = cdolist_list_var.rest();
				subobject = cdolist_list_var.first();
			}
			return (SubLObject) number_utilities.T;
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3666L)
	public static SubLObject list_of_positive_integer_p(final SubLObject v_object) {
		if (number_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
			SubLObject cdolist_list_var = v_object;
			SubLObject subobject = (SubLObject) number_utilities.NIL;
			subobject = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (number_utilities.NIL == subl_promotions.positive_integer_p(subobject)) {
					return (SubLObject) number_utilities.NIL;
				}
				cdolist_list_var = cdolist_list_var.rest();
				subobject = cdolist_list_var.first();
			}
			return (SubLObject) number_utilities.T;
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3891L)
	public static SubLObject list_of_negative_integer_p(final SubLObject v_object) {
		if (number_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
			SubLObject cdolist_list_var = v_object;
			SubLObject subobject = (SubLObject) number_utilities.NIL;
			subobject = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (number_utilities.NIL == subl_promotions.negative_integer_p(subobject)) {
					return (SubLObject) number_utilities.NIL;
				}
				cdolist_list_var = cdolist_list_var.rest();
				subobject = cdolist_list_var.first();
			}
			return (SubLObject) number_utilities.T;
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4116L)
	public static SubLObject list_of_non_negative_integer_p(final SubLObject v_object) {
		if (number_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
			SubLObject cdolist_list_var = v_object;
			SubLObject subobject = (SubLObject) number_utilities.NIL;
			subobject = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (number_utilities.NIL == subl_promotions.non_negative_integer_p(subobject)) {
					return (SubLObject) number_utilities.NIL;
				}
				cdolist_list_var = cdolist_list_var.rest();
				subobject = cdolist_list_var.first();
			}
			return (SubLObject) number_utilities.T;
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4349L)
	public static SubLObject list_of_non_positive_integer_p(final SubLObject v_object) {
		if (number_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
			SubLObject cdolist_list_var = v_object;
			SubLObject subobject = (SubLObject) number_utilities.NIL;
			subobject = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (number_utilities.NIL == subl_promotions.non_positive_integer_p(subobject)) {
					return (SubLObject) number_utilities.NIL;
				}
				cdolist_list_var = cdolist_list_var.rest();
				subobject = cdolist_list_var.first();
			}
			return (SubLObject) number_utilities.T;
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4582L)
	public static SubLObject positive_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(v_object.isNumber() && v_object.isPositive());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4724L)
	public static SubLObject non_negative_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(v_object.isNumber() && !v_object.isNegative());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4867L)
	public static SubLObject non_positive_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(v_object.isNumber() && !v_object.isPositive());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5009L)
	public static SubLObject negative_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(v_object.isNumber() && v_object.isNegative());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5140L)
	public static SubLObject zero_number_p(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = (SubLObject) number_utilities.NIL;
		SubLObject ignore_errors_tag = (SubLObject) number_utilities.NIL;
		try {
			thread.throwStack.push(number_utilities.$kw9$IGNORE_ERRORS_TARGET);
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(
						Symbols.symbol_function((SubLObject) number_utilities.$sym10$IGNORE_ERRORS_HANDLER), thread);
				try {
					result = Numbers.zerop(v_object);
				} catch (Throwable catch_var) {
					Errors.handleThrowable(catch_var, (SubLObject) number_utilities.NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var,
					(SubLObject) number_utilities.$kw9$IGNORE_ERRORS_TARGET);
		} finally {
			thread.throwStack.pop();
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5333L)
	public static SubLObject non_zero_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(v_object.isNumber() && !v_object.isZero());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5488L)
	public static SubLObject probability_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_object.isNumber() && number_utilities.ZERO_INTEGER.numLE(v_object)
						&& v_object.numLE((SubLObject) number_utilities.ONE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5659L)
	public static SubLObject percentile_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_object.isNumber() && number_utilities.ZERO_INTEGER.numLE(v_object)
						&& v_object.numL((SubLObject) number_utilities.ONE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5845L)
	public static SubLObject decimal_integer_length(SubLObject integer) {
		assert number_utilities.NIL != Types.integerp(integer) : integer;
		SubLObject length;
		for (length = (SubLObject) number_utilities.ZERO_INTEGER; !integer.isZero(); integer = Numbers
				.integerDivide(integer, (SubLObject) number_utilities.TEN_INTEGER), length = Numbers.add(length,
						(SubLObject) number_utilities.ONE_INTEGER)) {
		}
		return length;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 6352L)
	public static SubLObject significant_digits(final SubLObject number, final SubLObject digits) {
		assert number_utilities.NIL != extended_potentially_infinite_number_p(number) : number;
		enforceType(digits, number_utilities.$sym13$POSITIVE_INTEGER_P);
		if (number_utilities.NIL != infinite_number_p(number)) {
			return number;
		}
		if (number_utilities.NIL != scientific_numbers.scientific_number_p(number)) {
			return scientific_number_utilities.scientific_number_significant_digits(number, digits);
		}
		if (number.isZero()) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		if (number.isNegative()) {
			return Numbers.minus(significant_digits(Numbers.minus(number), digits));
		}
		if (number.isInteger() && digits.numGE(decimal_integer_length(number))) {
			return number;
		}
		if (number.isDouble() && digits.numGE(number_utilities.$maximum_float_significant_digits$.getGlobalValue())) {
			return number;
		}
		if (number_utilities.NIL != extended_numbers.include_fractions_in_extended_numbersP()
				&& number_utilities.NIL != collection_defns.fractionP(number,
						(SubLObject) number_utilities.UNPROVIDED)) {
			return significant_digits(math_expression_utilities.fraction_from_el(number), digits);
		}
		if (number_utilities.NIL != extended_numbers.include_fractions_in_extended_numbersP()
				&& number_utilities.NIL != fraction_utilities.fraction_p(number)) {
			return significant_digits(fraction_utilities.defractionify(number), digits);
		}
		final SubLObject normalization_power = Numbers.floor(
				Numbers.log(number, (SubLObject) number_utilities.TEN_INTEGER),
				(SubLObject) number_utilities.UNPROVIDED);
		final SubLObject normalization_ratio = Numbers.expt((SubLObject) number_utilities.TEN_INTEGER,
				normalization_power);
		final SubLObject normalized_number = Numbers.divide(number, normalization_ratio);
		final SubLObject significant_ratio = Numbers.expt((SubLObject) number_utilities.TEN_INTEGER,
				Numbers.subtract(digits, (SubLObject) number_utilities.ONE_INTEGER));
		final SubLObject scaled_normalized = Numbers.multiply(normalized_number, significant_ratio);
		final SubLObject scaled_significant = Numbers.round(scaled_normalized,
				(SubLObject) number_utilities.UNPROVIDED);
		final SubLObject normalized_significant = Numbers.divide(scaled_significant, significant_ratio);
		SubLObject significant = Numbers.multiply(normalized_significant, normalization_ratio);
		if (number.isInteger()) {
			final SubLObject unnormalization_power = Numbers.subtract(normalization_power,
					Numbers.subtract(digits, (SubLObject) number_utilities.ONE_INTEGER));
			final SubLObject unnormalization_ratio = Numbers.expt((SubLObject) number_utilities.TEN_INTEGER,
					unnormalization_power);
			significant = Numbers.multiply(scaled_significant, unnormalization_ratio);
		}
		if (significant.isDouble() && number.numGE(Numbers.$most_negative_fixnum$.getGlobalValue())
				&& number.numLE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
			final SubLObject nearest_integer = Numbers.round(significant, (SubLObject) number_utilities.UNPROVIDED);
			if (nearest_integer.numE(significant)) {
				significant = nearest_integer;
			}
		}
		if (significant.isDouble()) {
			significant = significant_digits_optimize_float(significant);
		}
		return significant;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 9047L)
	public static SubLObject four_significant_digits(final SubLObject number) {
		return significant_digits(number, (SubLObject) number_utilities.FOUR_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 9148L)
	public static SubLObject significant_digits_optimize_float(final SubLObject v_float) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject significand = Numbers.integer_decode_float(v_float);
		final SubLObject exponent = thread.secondMultipleValue();
		final SubLObject sign = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		SubLObject tersest_length = Numbers.$most_positive_fixnum$.getGlobalValue();
		SubLObject tersest_float = (SubLObject) number_utilities.NIL;
		SubLObject cdolist_list_var = (SubLObject) number_utilities.$list14;
		SubLObject delta = (SubLObject) number_utilities.NIL;
		delta = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			final SubLObject candidate_significand = Numbers.add(significand, delta);
			final SubLObject candidate_float = Numbers.multiply(sign,
					Numbers.scale_float(Numbers.sublisp_float(candidate_significand, v_float), exponent));
			final SubLObject candidate_length = Sequences.length(print_high.prin1_to_string(candidate_float));
			if (candidate_length.numL(tersest_length)) {
				tersest_length = candidate_length;
				tersest_float = candidate_float;
			}
			cdolist_list_var = cdolist_list_var.rest();
			delta = cdolist_list_var.first();
		}
		return tersest_float;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 9845L)
	public static SubLObject float_n(final SubLObject num, SubLObject n) {
		if (n == number_utilities.UNPROVIDED) {
			n = (SubLObject) number_utilities.FOUR_INTEGER;
		}
		final SubLObject base = Numbers.expt((SubLObject) number_utilities.TEN_INTEGER, n);
		return Numbers.sublisp_float(Numbers
				.divide(Numbers.round(Numbers.multiply(num, base), (SubLObject) number_utilities.UNPROVIDED), base),
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10034L)
	public static SubLObject round_up_to_the_nearest(final SubLObject x, final SubLObject n) {
		return Numbers.multiply(Numbers.ceiling(Numbers.divide(x, n), (SubLObject) number_utilities.UNPROVIDED), n);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10113L)
	public static SubLObject round_to_the_nearest(final SubLObject x, final SubLObject n) {
		return Numbers.multiply(Numbers.round(Numbers.divide(x, n), (SubLObject) number_utilities.UNPROVIDED), n);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10187L)
	public static SubLObject round_down_to_the_nearest(final SubLObject x, final SubLObject n) {
		return Numbers.multiply(Numbers.floor(Numbers.divide(x, n), (SubLObject) number_utilities.UNPROVIDED), n);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10267L)
	public static SubLObject greater_absP(final SubLObject num1, final SubLObject num2) {
		return Numbers.numG(Numbers.abs(num1), Numbers.abs(num2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10337L)
	public static SubLObject divides_evenly(final SubLObject number, final SubLObject divisor) {
		assert number_utilities.NIL != Types.numberp(number) : number;
		assert number_utilities.NIL != Types.numberp(divisor) : divisor;
		return Numbers.numE(Numbers.mod(number, divisor), (SubLObject) number_utilities.ZERO_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10475L)
	public static SubLObject integer_percent(final SubLObject numerator, SubLObject denominator, SubLObject roundP) {
		if (denominator == number_utilities.UNPROVIDED) {
			denominator = (SubLObject) number_utilities.ONE_INTEGER;
		}
		if (roundP == number_utilities.UNPROVIDED) {
			roundP = (SubLObject) number_utilities.NIL;
		}
		final SubLObject raw = Numbers.multiply(numerator, (SubLObject) number_utilities.$int15$100);
		return Values.values((number_utilities.NIL != roundP) ? Numbers.round(raw, denominator)
				: Numbers.truncate(raw, denominator));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10813L)
	public static SubLObject safe_percent(final SubLObject numerator, SubLObject denominator,
			SubLObject significant_digits) {
		if (denominator == number_utilities.UNPROVIDED) {
			denominator = (SubLObject) number_utilities.ONE_INTEGER;
		}
		if (significant_digits == number_utilities.UNPROVIDED) {
			significant_digits = (SubLObject) number_utilities.NIL;
		}
		if (denominator.isZero() || number_utilities.NIL == denominator || number_utilities.NIL == numerator) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		return percent(numerator, denominator, significant_digits);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11050L)
	public static SubLObject percent(final SubLObject numerator, SubLObject denominator,
			SubLObject significant_digits) {
		if (denominator == number_utilities.UNPROVIDED) {
			denominator = (SubLObject) number_utilities.ONE_INTEGER;
		}
		if (significant_digits == number_utilities.UNPROVIDED) {
			significant_digits = (SubLObject) number_utilities.NIL;
		}
		SubLObject result = Numbers.multiply((SubLObject) number_utilities.$int15$100,
				Numbers.divide(numerator, denominator));
		if (number_utilities.NIL != significant_digits) {
			result = significant_digits(result, significant_digits);
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11405L)
	public static SubLObject percentage_p(final SubLObject v_object) {
		return collection_defns.cyc_real_0_100(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11476L)
	public static SubLObject percentage_to_probability(final SubLObject percentage) {
		return Numbers.divide(percentage, (SubLObject) number_utilities.$int15$100);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11559L)
	public static SubLObject percent_increase(final SubLObject old, final SubLObject v_new) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !v_new.numGE(old)) {
			Errors.error((SubLObject) number_utilities.$str16$NEW_must_be_larger_than_OLD);
		}
		return percent(f_1_(Numbers.divide(v_new, old)), (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11690L)
	public static SubLObject percent_decrease(final SubLObject old, final SubLObject v_new) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !v_new.numLE(old)) {
			Errors.error((SubLObject) number_utilities.$str17$NEW_must_be_smaller_than_OLD);
		}
		return percent(Numbers.minus(f_1_(Numbers.divide(v_new, old))), (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11826L)
	public static SubLObject percent_faster(final SubLObject old_time, final SubLObject new_time) {
		return percent_decrease(old_time, new_time);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11923L)
	public static SubLObject percent_slower(final SubLObject old_time, final SubLObject new_time) {
		return percent_increase(old_time, new_time);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12020L)
	public static SubLObject log10(final SubLObject number) {
		return Numbers.log(number, (SubLObject) number_utilities.TEN_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12119L)
	public static SubLObject log2(final SubLObject number) {
		return Numbers.log(number, (SubLObject) number_utilities.TWO_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12215L)
	public static SubLObject expt10(final SubLObject number) {
		return Numbers.expt((SubLObject) number_utilities.TEN_INTEGER, number);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12314L)
	public static SubLObject potentially_infinite_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_object.isNumber() || number_utilities.NIL != infinite_number_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12635L)
	public static SubLObject negative_infinity() {
		return (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12700L)
	public static SubLObject positive_infinity() {
		return (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12765L)
	public static SubLObject negative_infinity_p(final SubLObject v_object) {
		return Equality.eq(v_object, (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12871L)
	public static SubLObject positive_infinity_p(final SubLObject v_object) {
		return Equality.eq(v_object, (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12977L)
	public static SubLObject infinite_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != negative_infinity_p(v_object)
				|| number_utilities.NIL != positive_infinity_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13098L)
	public static SubLObject negative_potentially_infinite_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != negative_infinity_p(v_object)
				|| number_utilities.NIL != negative_number_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13259L)
	public static SubLObject positive_potentially_infinite_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != positive_infinity_p(v_object)
				|| number_utilities.NIL != positive_number_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13420L)
	public static SubLObject non_negative_potentially_infinite_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != positive_infinity_p(v_object)
				|| number_utilities.NIL != non_negative_number_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13589L)
	public static SubLObject potentially_infinite_number_E(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		return Equality.eql(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13793L)
	public static SubLObject potentially_infinite_number_L(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != negative_infinity_p(num1)) {
			return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL == negative_infinity_p(num2));
		}
		if (number_utilities.NIL != negative_infinity_p(num2)) {
			return (SubLObject) number_utilities.NIL;
		}
		if (number_utilities.NIL != positive_infinity_p(num2)) {
			return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL == positive_infinity_p(num1));
		}
		if (number_utilities.NIL != positive_infinity_p(num1)) {
			return (SubLObject) number_utilities.NIL;
		}
		return Numbers.numL(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14246L)
	public static SubLObject potentially_infinite_number_G(final SubLObject num1, final SubLObject num2) {
		return potentially_infinite_number_L(num2, num1);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14376L)
	public static SubLObject potentially_infinite_number_LE(final SubLObject num1, final SubLObject num2) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(number_utilities.NIL != potentially_infinite_number_E(num1, num2)
						|| number_utilities.NIL != potentially_infinite_number_L(num1, num2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14560L)
	public static SubLObject potentially_infinite_number_GE(final SubLObject num1, final SubLObject num2) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(number_utilities.NIL != potentially_infinite_number_E(num1, num2)
						|| number_utilities.NIL != potentially_infinite_number_G(num1, num2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14744L)
	public static SubLObject potentially_infinite_number_plus(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != negative_infinity_p(num1)) {
			return negative_infinity_plus(num2);
		}
		if (number_utilities.NIL != negative_infinity_p(num2)) {
			return negative_infinity_plus(num1);
		}
		if (number_utilities.NIL != positive_infinity_p(num1)) {
			return positive_infinity_plus(num2);
		}
		if (number_utilities.NIL != positive_infinity_p(num2)) {
			return positive_infinity_plus(num1);
		}
		return Numbers.add(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 15378L)
	public static SubLObject potentially_infinite_number_minus(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != negative_infinity_p(num1)) {
			return negative_infinity_minus(num2);
		}
		if (number_utilities.NIL != negative_infinity_p(num2)) {
			return negative_infinity_minus(num1);
		}
		if (number_utilities.NIL != positive_infinity_p(num1)) {
			return positive_infinity_minus(num2);
		}
		if (number_utilities.NIL != positive_infinity_p(num2)) {
			return positive_infinity_minus(num1);
		}
		return Numbers.subtract(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 15904L)
	public static SubLObject potentially_infinite_number_times(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != negative_infinity_p(num1)) {
			return negative_infinity_times(num2);
		}
		if (number_utilities.NIL != negative_infinity_p(num2)) {
			return negative_infinity_times(num1);
		}
		if (number_utilities.NIL != positive_infinity_p(num1)) {
			return positive_infinity_times(num2);
		}
		if (number_utilities.NIL != positive_infinity_p(num2)) {
			return positive_infinity_times(num1);
		}
		return Numbers.multiply(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 16543L)
	public static SubLObject potentially_infinite_number_divided_by(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != zero_number_p(num2)) {
			if (number_utilities.NIL != negative_potentially_infinite_number_p(num1)) {
				return (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY;
			}
			if (number_utilities.NIL != positive_potentially_infinite_number_p(num1)) {
				return (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY;
			}
			if (number_utilities.ZERO_INTEGER.eql(num1)) {
				Errors.error((SubLObject) number_utilities.$str21$Can_t_divide_zero_by_zero);
			}
			return (SubLObject) number_utilities.NIL;
		} else {
			if (number_utilities.NIL != negative_infinity_p(num1)) {
				return negative_infinity_X(num2);
			}
			if (number_utilities.NIL != negative_infinity_p(num2)) {
				return divided_by_negative_infinity(num1);
			}
			if (number_utilities.NIL != positive_infinity_p(num1)) {
				return positive_infinity_X(num2);
			}
			if (number_utilities.NIL != positive_infinity_p(num2)) {
				return divided_by_positive_infinity(num1);
			}
			return Numbers.divide(num1, num2);
		}
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 17545L)
	public static SubLObject potentially_infinite_number_max(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != potentially_infinite_number_G(num1, num2)) {
			return num1;
		}
		return num2;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 18044L)
	public static SubLObject potentially_infinite_number_min(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		if (number_utilities.NIL != potentially_infinite_number_L(num1, num2)) {
			return num1;
		}
		return num2;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 18543L)
	public static SubLObject potentially_infinite_number_log(final SubLObject num, SubLObject base) {
		if (base == number_utilities.UNPROVIDED) {
			base = number_utilities.$e$.getGlobalValue();
		}
		assert number_utilities.NIL != non_negative_potentially_infinite_number_p(num) : num;
		if (number_utilities.ZERO_INTEGER.eql(num)) {
			return negative_infinity();
		}
		if (number_utilities.NIL != positive_infinity_p(num)) {
			return positive_infinity();
		}
		return Numbers.log(num, base);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 18922L)
	public static SubLObject potentially_infinite_number_exp(final SubLObject num) {
		assert number_utilities.NIL != potentially_infinite_number_p(num) : num;
		if (number_utilities.NIL != negative_infinity_p(num)) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		if (number_utilities.NIL != positive_infinity_p(num)) {
			return positive_infinity();
		}
		return Numbers.exp(num);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 19245L)
	public static SubLObject negative_infinity_plus(final SubLObject num) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& number_utilities.NIL != positive_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str23$Can_t_add_positive_infinity_and_n);
		}
		return (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 19528L)
	public static SubLObject positive_infinity_plus(final SubLObject num) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& number_utilities.NIL != negative_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str23$Can_t_add_positive_infinity_and_n);
		}
		return (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 19797L)
	public static SubLObject negative_infinity_minus(final SubLObject num) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& number_utilities.NIL != negative_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str24$Can_t_subtract_negative_infinity_);
		}
		return (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 20062L)
	public static SubLObject positive_infinity_minus(final SubLObject num) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& number_utilities.NIL != positive_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str25$Can_t_subtract_positive_infinity_);
		}
		return (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 20327L)
	public static SubLObject negative_infinity_times(final SubLObject num) {
		if (number_utilities.NIL != negative_potentially_infinite_number_p(num)) {
			return (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY;
		}
		if (number_utilities.NIL != zero_number_p(num)) {
			Errors.error((SubLObject) number_utilities.$str26$Can_t_multiply_infinity_and_zero);
			return (SubLObject) number_utilities.NIL;
		}
		return (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 20735L)
	public static SubLObject positive_infinity_times(final SubLObject num) {
		if (number_utilities.NIL != negative_potentially_infinite_number_p(num)) {
			return (SubLObject) number_utilities.$kw18$NEGATIVE_INFINITY;
		}
		if (number_utilities.ZERO_INTEGER.eql(num)) {
			Errors.error((SubLObject) number_utilities.$str26$Can_t_multiply_infinity_and_zero);
			return (SubLObject) number_utilities.NIL;
		}
		return (SubLObject) number_utilities.$kw19$POSITIVE_INFINITY;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 21135L)
	public static SubLObject negative_infinity_X(final SubLObject num) {
		if (number_utilities.NIL != negative_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str27$Can_t_divide_negative_infinity_by);
		} else {
			if (number_utilities.NIL == positive_infinity_p(num)) {
				return negative_infinity_times(num);
			}
			Errors.error((SubLObject) number_utilities.$str28$Can_t_divide_negative_infinity_by);
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 21549L)
	public static SubLObject positive_infinity_X(final SubLObject num) {
		if (number_utilities.NIL != negative_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str29$Can_t_divide_positive_infinity_by);
		} else {
			if (number_utilities.NIL == positive_infinity_p(num)) {
				return positive_infinity_times(num);
			}
			Errors.error((SubLObject) number_utilities.$str30$Can_t_divide_positive_infinity_by);
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 21963L)
	public static SubLObject divided_by_negative_infinity(final SubLObject num) {
		if (number_utilities.NIL != negative_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str27$Can_t_divide_negative_infinity_by);
		} else {
			if (number_utilities.NIL == positive_infinity_p(num)) {
				return (SubLObject) number_utilities.ZERO_INTEGER;
			}
			Errors.error((SubLObject) number_utilities.$str29$Can_t_divide_positive_infinity_by);
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 22270L)
	public static SubLObject divided_by_positive_infinity(final SubLObject num) {
		if (number_utilities.NIL != negative_infinity_p(num)) {
			Errors.error((SubLObject) number_utilities.$str28$Can_t_divide_negative_infinity_by);
		} else {
			if (number_utilities.NIL == positive_infinity_p(num)) {
				return (SubLObject) number_utilities.ZERO_INTEGER;
			}
			Errors.error((SubLObject) number_utilities.$str30$Can_t_divide_positive_infinity_by);
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 22577L)
	public static SubLObject extended_potentially_infinite_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(number_utilities.NIL != extended_numbers.extended_number_p(v_object)
						|| number_utilities.NIL != infinite_number_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 22842L)
	public static SubLObject potentially_infinite_integer_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_object.isInteger() || number_utilities.NIL != infinite_integer_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23169L)
	public static SubLObject infinite_integer_p(final SubLObject v_object) {
		return infinite_number_p(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23249L)
	public static SubLObject negative_potentially_infinite_integer_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != negative_infinity_p(v_object)
				|| number_utilities.NIL != subl_promotions.negative_integer_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23412L)
	public static SubLObject positive_potentially_infinite_integer_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != positive_infinity_p(v_object)
				|| number_utilities.NIL != subl_promotions.positive_integer_p(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23575L)
	public static SubLObject potentially_infinite_integer_E(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_integer_p(int2) : int2;
		return Equality.eql(int1, int2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23782L)
	public static SubLObject potentially_infinite_integer_L(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_integer_p(int2) : int2;
		return potentially_infinite_number_L(int1, int2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24015L)
	public static SubLObject potentially_infinite_integer_G(final SubLObject int1, final SubLObject int2) {
		return potentially_infinite_integer_L(int2, int1);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24147L)
	public static SubLObject potentially_infinite_integer_LE(final SubLObject int1, final SubLObject int2) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(number_utilities.NIL != potentially_infinite_integer_E(int1, int2)
						|| number_utilities.NIL != potentially_infinite_integer_L(int1, int2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24334L)
	public static SubLObject potentially_infinite_integer_GE(final SubLObject int1, final SubLObject int2) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(number_utilities.NIL != potentially_infinite_integer_E(int1, int2)
						|| number_utilities.NIL != potentially_infinite_integer_G(int1, int2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24521L)
	public static SubLObject potentially_infinite_integer_plus(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_integer_p(int2) : int2;
		return potentially_infinite_number_plus(int1, int2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24936L)
	public static SubLObject potentially_infinite_integer_minus(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_integer_p(int2) : int2;
		return potentially_infinite_number_minus(int1, int2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 25242L)
	public static SubLObject potentially_infinite_integer_times(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_integer_p(int2) : int2;
		return potentially_infinite_number_times(int1, int2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 25661L)
	public static SubLObject potentially_infinite_integer_times_number_rounded(final SubLObject int1,
			final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		final SubLObject raw_product = potentially_infinite_number_times(int1, num2);
		if (number_utilities.NIL != infinite_number_p(raw_product)) {
			return raw_product;
		}
		return Numbers.truncate(raw_product, (SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 26086L)
	public static SubLObject potentially_infinite_integer_divided_by(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_integer_p(int2) : int2;
		return potentially_infinite_number_divided_by(int1, int2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 26516L)
	public static SubLObject potentially_infinite_integer_divided_by_number_rounded(final SubLObject int1,
			final SubLObject num2) {
		assert number_utilities.NIL != potentially_infinite_integer_p(int1) : int1;
		assert number_utilities.NIL != potentially_infinite_number_p(num2) : num2;
		final SubLObject raw_product = potentially_infinite_number_divided_by(int1, num2);
		if (number_utilities.NIL != infinite_number_p(raw_product)) {
			return raw_product;
		}
		return Numbers.truncate(raw_product, (SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 26951L)
	public static SubLObject potentially_undefined_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(number_utilities.NIL != potentially_infinite_number_p(v_object)
						|| number_utilities.NIL != undefined(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 27380L)
	public static SubLObject undefined(final SubLObject v_object) {
		return Equality.eq(v_object, (SubLObject) number_utilities.$kw32$UNDEFINED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 27468L)
	public static SubLObject potentially_undefined_number_E(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_E(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 27791L)
	public static SubLObject potentially_undefined_number_L(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_L(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28114L)
	public static SubLObject potentially_undefined_number_G(final SubLObject num1, final SubLObject num2) {
		return potentially_undefined_number_L(num2, num1);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28259L)
	public static SubLObject potentially_undefined_number_LE(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_LE(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28584L)
	public static SubLObject potentially_undefined_number_GE(final SubLObject num1, final SubLObject num2) {
		return potentially_undefined_number_LE(num2, num1);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28731L)
	public static SubLObject potentially_undefined_number_plus(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_plus(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 29183L)
	public static SubLObject potentially_undefined_number_minus(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_minus(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 29523L)
	public static SubLObject potentially_undefined_number_times(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_times(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 29977L)
	public static SubLObject potentially_undefined_number_divided_by(final SubLObject num1, final SubLObject num2) {
		assert number_utilities.NIL != potentially_undefined_number_p(num1) : num1;
		assert number_utilities.NIL != potentially_undefined_number_p(num2) : num2;
		if (number_utilities.NIL != undefined(num1) || number_utilities.NIL != undefined(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		if (number_utilities.NIL != zero_number_p(num1) && number_utilities.NIL != zero_number_p(num2)) {
			return (SubLObject) number_utilities.$kw32$UNDEFINED;
		}
		return potentially_infinite_number_divided_by(num1, num2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 30524L)
	public static SubLObject maximum(final SubLObject items, SubLObject key) {
		if (key == number_utilities.UNPROVIDED) {
			key = Symbols.symbol_function((SubLObject) number_utilities.IDENTITY);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str34$Cannot_compute_the_maximum_of_an_);
		}
		if (key.eql(Symbols.symbol_function((SubLObject) number_utilities.IDENTITY))
				|| key == number_utilities.IDENTITY) {
			SubLObject maximum = items.first();
			SubLObject cdolist_list_var = items.rest();
			SubLObject item = (SubLObject) number_utilities.NIL;
			item = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (item.numG(maximum)) {
					maximum = item;
				}
				cdolist_list_var = cdolist_list_var.rest();
				item = cdolist_list_var.first();
			}
			return maximum;
		}
		return list_utilities.extremal(items, Symbols.symbol_function((SubLObject) number_utilities.$sym35$_), key);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 31613L)
	public static SubLObject minimum(final SubLObject items, SubLObject key) {
		if (key == number_utilities.UNPROVIDED) {
			key = Symbols.symbol_function((SubLObject) number_utilities.IDENTITY);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str36$Cannot_compute_the_minimum_of_an_);
		}
		if (key.eql(Symbols.symbol_function((SubLObject) number_utilities.IDENTITY))
				|| key == number_utilities.IDENTITY) {
			SubLObject minimum = items.first();
			SubLObject cdolist_list_var = items.rest();
			SubLObject item = (SubLObject) number_utilities.NIL;
			item = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				if (item.numL(minimum)) {
					minimum = item;
				}
				cdolist_list_var = cdolist_list_var.rest();
				item = cdolist_list_var.first();
			}
			return minimum;
		}
		return list_utilities.extremal(items, Symbols.symbol_function((SubLObject) number_utilities.$sym37$_), key);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32143L)
	public static SubLObject average(final SubLObject items, SubLObject key) {
		if (key == number_utilities.UNPROVIDED) {
			key = Symbols.symbol_function((SubLObject) number_utilities.IDENTITY);
		}
		if (items.isCons()) {
			SubLObject sum = (SubLObject) number_utilities.ZERO_INTEGER;
			SubLObject cdolist_list_var = items;
			SubLObject item = (SubLObject) number_utilities.NIL;
			item = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				sum = Numbers.add(sum, Functions.funcall(key, item));
				cdolist_list_var = cdolist_list_var.rest();
				item = cdolist_list_var.first();
			}
			return Numbers.sublisp_float(Numbers.divide(sum, Sequences.length(items)),
					(SubLObject) number_utilities.UNPROVIDED);
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32344L)
	public static SubLObject mean(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str38$Cannot_compute_the_mean_of_an_ato);
		}
		SubLObject total = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject num_items = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			total = Numbers.add(total, item);
			num_items = Numbers.add(num_items, (SubLObject) number_utilities.ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return Numbers.divide(total, num_items);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32674L)
	public static SubLObject summation(final SubLObject items) {
		SubLObject sum = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			sum = Numbers.add(sum, item);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return sum;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32870L)
	public static SubLObject product(final SubLObject items) {
		SubLObject product = (SubLObject) number_utilities.ONE_INTEGER;
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			product = Numbers.multiply(product, item);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return product;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 33074L)
	public static SubLObject geometric_mean(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str39$Cannot_compute_the_geometric_mean);
		}
		final SubLObject product = product(items);
		final SubLObject total = Sequences.length(items);
		return Numbers.expt(product, Numbers.invert(total));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 33383L)
	public static SubLObject median(final SubLObject items, SubLObject key, SubLObject v_return) {
		if (key == number_utilities.UNPROVIDED) {
			key = Symbols.symbol_function((SubLObject) number_utilities.IDENTITY);
		}
		if (v_return == number_utilities.UNPROVIDED) {
			v_return = (SubLObject) number_utilities.$kw40$VALUE;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str41$Cannot_compute_the_median_of_an_a);
		}
		final SubLObject sorted_items = Sort.sort(conses_high.copy_list(items),
				Symbols.symbol_function((SubLObject) number_utilities.$sym37$_), key);
		return median_sorted(sorted_items, Sequences.length(sorted_items), key, v_return);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 33975L)
	public static SubLObject median_sorted(final SubLObject items, SubLObject length, SubLObject key,
			SubLObject v_return) {
		if (length == number_utilities.UNPROVIDED) {
			length = (SubLObject) number_utilities.NIL;
		}
		if (key == number_utilities.UNPROVIDED) {
			key = Symbols.symbol_function((SubLObject) number_utilities.IDENTITY);
		}
		if (v_return == number_utilities.UNPROVIDED) {
			v_return = (SubLObject) number_utilities.$kw40$VALUE;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str41$Cannot_compute_the_median_of_an_a);
		}
		if (number_utilities.NIL == length) {
			length = Sequences.length(items);
		}
		final SubLObject middle_position = Numbers.integerDivide(length, (SubLObject) number_utilities.TWO_INTEGER);
		final SubLObject middle_item = ConsesLow.nth(middle_position, items);
		final SubLObject pcase_var = v_return;
		if (pcase_var.eql((SubLObject) number_utilities.$kw42$ITEM)) {
			if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
					&& number_utilities.NIL == Numbers.oddp(length)) {
				Errors.error((SubLObject) number_utilities.$str43$Can_t_return_middle_item_from_an_);
			}
			return middle_item;
		}
		if (pcase_var.eql((SubLObject) number_utilities.$kw40$VALUE)) {
			return (number_utilities.NIL != Numbers.oddp(length)) ? Functions.funcall(key, middle_item)
					: mean((SubLObject) ConsesLow.list(Functions.funcall(key, middle_item),
							Functions.funcall(key, ConsesLow.nth(
									Numbers.subtract(middle_position, (SubLObject) number_utilities.ONE_INTEGER),
									items))));
		}
		Errors.error((SubLObject) number_utilities.$str44$Unrecognized_RETURN_type__S, v_return);
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 35095L)
	public static SubLObject percentile(final SubLObject items, final SubLObject percent, SubLObject sort_method,
			SubLObject key) {
		if (sort_method == number_utilities.UNPROVIDED) {
			sort_method = (SubLObject) number_utilities.$sym37$_;
		}
		if (key == number_utilities.UNPROVIDED) {
			key = (SubLObject) number_utilities.IDENTITY;
		}
		return percentile_sorted(Sort.sort(conses_high.copy_list(items), sort_method, key), percent);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 35428L)
	public static SubLObject percentile_sorted(final SubLObject items, final SubLObject percent) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert number_utilities.NIL != percentile_p(percent) : percent;
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str46$Cannot_compute_the_percentile_of_);
		}
		final SubLObject total = Sequences.length(items);
		final SubLObject index = Numbers.truncate(Numbers.multiply(total, percent),
				(SubLObject) number_utilities.UNPROVIDED);
		return ConsesLow.nth(index, items);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 35869L)
	public static SubLObject max_key_from_hash(final SubLObject hashtable) {
		SubLObject max_count = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject best_key = (SubLObject) number_utilities.NIL;
		SubLObject key = (SubLObject) number_utilities.NIL;
		SubLObject val = (SubLObject) number_utilities.NIL;
		final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
		try {
			while (Hashtables.iteratorHasNext(cdohash_iterator)) {
				final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
				key = Hashtables.getEntryKey(cdohash_entry);
				val = Hashtables.getEntryValue(cdohash_entry);
				if (val.numG(max_count)) {
					max_count = val;
					best_key = key;
				}
			}
		} finally {
			Hashtables.releaseEntrySetIterator(cdohash_iterator);
		}
		return best_key;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 36109L)
	public static SubLObject get_frequency_list(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str47$Cannot_compute_frequencies_of_an_);
		}
		final SubLObject hash = Hashtables.make_hash_table((SubLObject) number_utilities.TWENTY_INTEGER,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			hash_table_utilities.cinc_hash(item, hash, (SubLObject) number_utilities.UNPROVIDED,
					(SubLObject) number_utilities.UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return hash_table_utilities.hash_table_to_alist(hash);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 36597L)
	public static SubLObject get_sorted_frequency_list(final SubLObject items) {
		final SubLObject unsorted = get_frequency_list(items);
		return Sort.sort(unsorted, (SubLObject) number_utilities.$sym35$_, (SubLObject) number_utilities.$sym48$CDR);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 37004L)
	public static SubLObject mode(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str49$Cannot_compute_the_mode_of_an_ato);
		}
		final SubLObject hash = Hashtables.make_hash_table((SubLObject) number_utilities.TWENTY_INTEGER,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			hash_table_utilities.cinc_hash(item, hash, (SubLObject) number_utilities.UNPROVIDED,
					(SubLObject) number_utilities.UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return max_key_from_hash(hash);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 37295L)
	public static SubLObject mode_sorted(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str49$Cannot_compute_the_mode_of_an_ato);
		}
		SubLObject items_left;
		SubLObject last_item;
		SubLObject current_item;
		SubLObject current_count;
		SubLObject best_item;
		SubLObject best_count;
		for (items_left = (SubLObject) number_utilities.NIL, last_item = (SubLObject) number_utilities.NIL, current_item = (SubLObject) number_utilities.NIL, current_count = (SubLObject) number_utilities.NIL, best_item = (SubLObject) number_utilities.NIL, best_count = (SubLObject) number_utilities.NIL, items_left = items, last_item = Symbols
				.gensym((SubLObject) number_utilities.UNPROVIDED), current_item = items_left
						.first(), current_count = (SubLObject) number_utilities.ONE_INTEGER, best_item = items
								.first(), best_count = (SubLObject) number_utilities.ONE_INTEGER; number_utilities.NIL != items_left; items_left = items_left
										.rest(), last_item = current_item, current_item = items_left
												.first(), current_count = (SubLObject) (current_item.eql(last_item)
														? Numbers.add(current_count,
																(SubLObject) number_utilities.ONE_INTEGER)
														: number_utilities.ONE_INTEGER), best_item = (current_count
																.numG(best_count)
																		? current_item
																		: best_item), best_count = (current_count
																				.numG(best_count) ? current_count
																						: best_count)) {
		}
		return best_item;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 37870L)
	public static SubLObject variance_from_sample(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str50$Cannot_compute_the_variance_of_an);
		}
		if (number_utilities.NIL != list_utilities.singletonP(items)) {
			return variance_from_population(items);
		}
		SubLObject item_squares_total = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject item_total = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject length = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			item_squares_total = Numbers.add(item_squares_total, square(item));
			item_total = Numbers.add(item_total, item);
			length = Numbers.add(length, (SubLObject) number_utilities.ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		final SubLObject mean = Numbers.divide(item_total, length);
		return Values
				.values(Numbers.subtract(Numbers.divide(item_squares_total,
						Numbers.subtract(length,
								(SubLObject) number_utilities.ONE_INTEGER)),
						Numbers.multiply(
								Numbers.divide(length,
										Numbers.subtract(length, (SubLObject) number_utilities.ONE_INTEGER)),
								square(mean))),
						mean);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 39413L)
	public static SubLObject variance_from_population(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str50$Cannot_compute_the_variance_of_an);
		}
		SubLObject item_squares_total = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject item_total = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject length = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject cdolist_list_var = items;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			item_squares_total = Numbers.add(item_squares_total, square(item));
			item_total = Numbers.add(item_total, item);
			length = Numbers.add(length, (SubLObject) number_utilities.ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		final SubLObject mean = Numbers.divide(item_total, length);
		return Values.values(Numbers.subtract(Numbers.divide(item_squares_total, length), square(mean)), mean);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 40370L)
	public static SubLObject variance(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str50$Cannot_compute_the_variance_of_an);
		}
		thread.resetMultipleValues();
		final SubLObject variance = variance_from_population(items);
		final SubLObject mean = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return Values.values(variance, mean);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 40760L)
	public static SubLObject standard_deviation_from_population(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str51$Cannot_compute_the_standard_devia);
		}
		thread.resetMultipleValues();
		final SubLObject variance = variance_from_population(items);
		final SubLObject mean = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return Values.values(Numbers.sqrt(variance), mean);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 41203L)
	public static SubLObject safe_standard_deviation_from_sample(final SubLObject items) {
		return (SubLObject) (items.isCons() ? standard_deviation_from_sample(items) : number_utilities.ZERO_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 41343L)
	public static SubLObject standard_deviation_from_sample(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str51$Cannot_compute_the_standard_devia);
		}
		thread.resetMultipleValues();
		final SubLObject variance = variance_from_sample(items);
		final SubLObject mean = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return Values.values(Numbers.sqrt(variance), mean);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 41775L)
	public static SubLObject standard_deviation(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !items.isCons()) {
			Errors.error((SubLObject) number_utilities.$str51$Cannot_compute_the_standard_devia);
		}
		thread.resetMultipleValues();
		final SubLObject variance = variance(items);
		final SubLObject mean = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return Values.values(Numbers.sqrt(variance), mean);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 42186L)
	public static SubLObject standard_deviations_above_mean(final SubLObject value, final SubLObject mean,
			final SubLObject standard_deviation) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (value.numE(mean)) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && standard_deviation.isZero()) {
			Errors.error((SubLObject) number_utilities.$str52$Standard_deviation_must_not_be_ze);
		}
		return Numbers.divide(Numbers.subtract(value, mean), standard_deviation);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 42523L)
	public static SubLObject simple_outliers(final SubLObject data, SubLObject key) {
		if (key == number_utilities.UNPROVIDED) {
			key = (SubLObject) number_utilities.IDENTITY;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject raw_numbers = Mapping.mapcar(key, data);
		thread.resetMultipleValues();
		final SubLObject stdev = standard_deviation(raw_numbers);
		final SubLObject mean = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject simple_outlier_cutoff = Numbers.add(mean,
				Numbers.multiply(stdev, (SubLObject) number_utilities.TWO_INTEGER));
		SubLObject outlier_data = Sequences.remove(simple_outlier_cutoff, data,
				Symbols.symbol_function((SubLObject) number_utilities.$sym53$__), key,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
		outlier_data = Sort.sort(outlier_data, Symbols.symbol_function((SubLObject) number_utilities.$sym35$_), key);
		return Values.values(outlier_data, simple_outlier_cutoff);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 43161L)
	public static SubLObject perform_standard_statistical_analysis(final SubLObject values,
			SubLObject should_print_resultsP) {
		if (should_print_resultsP == number_utilities.UNPROVIDED) {
			should_print_resultsP = (SubLObject) number_utilities.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject n = Sequences.length(values);
		final SubLObject min = minimum(values, (SubLObject) number_utilities.UNPROVIDED);
		final SubLObject max = maximum(values, (SubLObject) number_utilities.UNPROVIDED);
		final SubLObject median = median(values, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
		final SubLObject mean = mean(values);
		final SubLObject sd = standard_deviation(values);
		if (number_utilities.NIL != should_print_resultsP) {
			final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
			try {
				reader.$read_default_float_format$.bind((SubLObject) number_utilities.$sym54$DOUBLE_FLOAT, thread);
				PrintLow.format((SubLObject) number_utilities.T,
						(SubLObject) number_utilities.$str55$__Standard_Statistical_Analysis);
				PrintLow.format((SubLObject) number_utilities.T,
						(SubLObject) number_utilities.$str56$_______________________________);
				PrintLow.format((SubLObject) number_utilities.T, (SubLObject) number_utilities.$str57$__Count______6D,
						n);
				PrintLow.format((SubLObject) number_utilities.T, (SubLObject) number_utilities.$str58$__Min________6D,
						four_significant_digits(min));
				PrintLow.format((SubLObject) number_utilities.T, (SubLObject) number_utilities.$str59$__Median_____6D,
						four_significant_digits(median));
				PrintLow.format((SubLObject) number_utilities.T, (SubLObject) number_utilities.$str60$__Mean_______6D,
						four_significant_digits(mean));
				PrintLow.format((SubLObject) number_utilities.T, (SubLObject) number_utilities.$str61$__Max________6D,
						four_significant_digits(max));
				PrintLow.format((SubLObject) number_utilities.T, (SubLObject) number_utilities.$str62$__Std_Dev____6D,
						four_significant_digits(sd));
				streams_high.terpri((SubLObject) number_utilities.T);
				streams_high.force_output((SubLObject) number_utilities.T);
			} finally {
				reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
			}
		}
		return (SubLObject) ConsesLow.list(n, min, median, mean, max, sd);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 44194L)
	public static SubLObject correlation(final SubLObject x_values, final SubLObject y_values) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& number_utilities.NIL == list_utilities.same_length_p(x_values, y_values)) {
			Errors.error((SubLObject) number_utilities.$str63$X_Values_and_Y_Values_must_be_of_,
					Sequences.length(x_values));
		}
		SubLObject sum_sq_x = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject sum_sq_y = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject sum_coproduct = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject mean_x = (SubLObject) number_utilities.NIL;
		SubLObject mean_y = (SubLObject) number_utilities.NIL;
		SubLObject n = (SubLObject) number_utilities.NIL;
		SubLObject counter = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject x = (SubLObject) number_utilities.NIL;
		SubLObject x_$1 = (SubLObject) number_utilities.NIL;
		SubLObject y = (SubLObject) number_utilities.NIL;
		SubLObject y_$2 = (SubLObject) number_utilities.NIL;
		x = x_values;
		x_$1 = x.first();
		y = y_values;
		y_$2 = y.first();
		while (number_utilities.NIL != y || number_utilities.NIL != x) {
			if (counter.isZero()) {
				mean_x = x_$1;
				mean_y = y_$2;
			} else {
				final SubLObject index = Numbers.add(counter, (SubLObject) number_utilities.ONE_INTEGER);
				final SubLObject sweep = Numbers
						.divide(Numbers.subtract(index, (SubLObject) number_utilities.$float64$1_0), index);
				final SubLObject delta_x = Numbers.subtract(x_$1, mean_x);
				final SubLObject delta_y = Numbers.subtract(y_$2, mean_y);
				sum_sq_x = Numbers.add(sum_sq_x, Numbers.multiply(delta_x, delta_x, sweep));
				sum_sq_y = Numbers.add(sum_sq_y, Numbers.multiply(delta_y, delta_y, sweep));
				sum_coproduct = Numbers.add(sum_coproduct, Numbers.multiply(delta_x, delta_y, sweep));
				mean_x = Numbers.add(mean_x, Numbers.divide(delta_x, index));
				mean_y = Numbers.add(mean_y, Numbers.divide(delta_y, index));
				n = index;
			}
			counter = Numbers.add(counter, (SubLObject) number_utilities.ONE_INTEGER);
			x = x.rest();
			x_$1 = x.first();
			y = y.rest();
			y_$2 = y.first();
		}
		final SubLObject pop_sd_x = Numbers.sqrt(Numbers.divide(sum_sq_x, n));
		final SubLObject pop_sd_y = Numbers.sqrt(Numbers.divide(sum_sq_y, n));
		final SubLObject cov_x_y = Numbers.divide(sum_coproduct, n);
		if (pop_sd_x.isZero() || pop_sd_y.isZero()) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		return Numbers.divide(cov_x_y, Numbers.multiply(pop_sd_x, pop_sd_y));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 45438L)
	public static SubLObject decode_integer_multiples(SubLObject integer, final SubLObject multiples) {
		assert number_utilities.NIL != Types.integerp(integer) : integer;
		assert number_utilities.NIL != Types.listp(multiples) : multiples;
		SubLObject v_answer = (SubLObject) number_utilities.NIL;
		SubLObject cdolist_list_var = multiples;
		SubLObject multiple = (SubLObject) number_utilities.NIL;
		multiple = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			if (integer.numE((SubLObject) number_utilities.ZERO_INTEGER)) {
				if (number_utilities.NIL == v_answer) {
					v_answer = (SubLObject) ConsesLow.cons(integer, v_answer);
				}
				return Sequences.nreverse(v_answer);
			}
			final SubLObject value = Numbers.mod(integer, multiple);
			integer = Numbers.integerDivide(integer, multiple);
			v_answer = (SubLObject) ConsesLow.cons(value, v_answer);
			cdolist_list_var = cdolist_list_var.rest();
			multiple = cdolist_list_var.first();
		}
		v_answer = (SubLObject) ConsesLow.cons(integer, v_answer);
		return Sequences.nreverse(v_answer);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 46155L)
	public static SubLObject encode_integer_multiples(final SubLObject values, final SubLObject multiples) {
		if (number_utilities.NIL == values) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		if (number_utilities.NIL == multiples) {
			return values.first();
		}
		SubLObject v_answer = encode_integer_multiples(values.rest(), multiples.rest());
		v_answer = Numbers.multiply(v_answer, multiples.first());
		v_answer = Numbers.add(v_answer, values.first());
		return v_answer;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 46703L)
	public static SubLObject arithmetic_progression(final SubLObject start, final SubLObject end,
			final SubLObject length) {
		if (length.numL((SubLObject) number_utilities.TWO_INTEGER)) {
			Errors.error((SubLObject) number_utilities.$str66$length_must_be_at_least_2_);
		}
		final SubLObject difference = Numbers.subtract(end, start);
		final SubLObject interval = Numbers.divide(difference,
				Numbers.subtract(length, (SubLObject) number_utilities.ONE_INTEGER));
		SubLObject result = (SubLObject) number_utilities.NIL;
		SubLObject i;
		for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			result = (SubLObject) ConsesLow.cons(Numbers.add(start, Numbers.multiply(i, interval)), result);
		}
		result = Sequences.nreverse(result);
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 47039L)
	public static SubLObject geometric_progression(final SubLObject start, final SubLObject end,
			final SubLObject length) {
		if (start.numE((SubLObject) number_utilities.ONE_INTEGER)) {
			return Errors.error((SubLObject) number_utilities.$str67$Cannot_start_at_1_);
		}
		if (end.numE((SubLObject) number_utilities.ONE_INTEGER)) {
			return Errors.error((SubLObject) number_utilities.$str68$Cannot_end_at_1_);
		}
		if (start.numLE((SubLObject) number_utilities.ZERO_INTEGER)) {
			return Errors.error((SubLObject) number_utilities.$str69$Cannot_start_at_or_below_0_);
		}
		if (end.numLE((SubLObject) number_utilities.ZERO_INTEGER)) {
			return Errors.error((SubLObject) number_utilities.$str70$Cannot_end_at_or_below_0_);
		}
		if (length.numLE((SubLObject) number_utilities.ZERO_INTEGER)) {
			return Errors.error((SubLObject) number_utilities.$str71$Length_must_be_at_least_1_);
		}
		if (!length.numE((SubLObject) number_utilities.ONE_INTEGER)) {
			final SubLObject step_ratio = geometric_progression_ratio(start, end, length);
			final SubLObject steps = f_1_(length);
			SubLObject sofar = (SubLObject) number_utilities.$kw73$UNINITIALIZED;
			SubLObject result = (SubLObject) number_utilities.NIL;
			SubLObject i;
			for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
					.numL(length); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
				if (i.isZero()) {
					sofar = start;
				} else if (i.numL(steps)) {
					sofar = Numbers.multiply(sofar, step_ratio);
				} else {
					sofar = end;
				}
				result = (SubLObject) ConsesLow.cons(sofar, result);
			}
			return Sequences.nreverse(result);
		}
		if (start.numE(end)) {
			return (SubLObject) ConsesLow.list(start);
		}
		return Errors.error((SubLObject) number_utilities.$str72$Length_must_be_at_least_2_);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 47878L)
	public static SubLObject geometric_progression_ratio(final SubLObject start, final SubLObject end,
			final SubLObject length) {
		final SubLObject full_ratio = Numbers.divide(end, start);
		final SubLObject steps = f_1_(length);
		SubLObject step_ratio = Numbers.expt(full_ratio, Numbers.invert(steps));
		if (start.isInteger() && end.isInteger()) {
			final SubLObject sanitized_ratio = arithmetic.possibly_sanitize_float(step_ratio);
			final SubLObject integer_ratio = Numbers.round(sanitized_ratio, (SubLObject) number_utilities.UNPROVIDED);
			if (integer_ratio.numE(sanitized_ratio)
					&& end.numE(Numbers.multiply(start, Numbers.expt(integer_ratio, steps)))) {
				step_ratio = integer_ratio;
			}
		}
		return step_ratio;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 48435L)
	public static SubLObject number_string_p(final SubLObject text) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject num = (SubLObject) number_utilities.NIL;
		SubLObject err_msg = (SubLObject) number_utilities.NIL;
		try {
			thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind((SubLObject) number_utilities.$sym74$CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					num = number_string_value(text);
				} catch (Throwable catch_var) {
					Errors.handleThrowable(catch_var, (SubLObject) number_utilities.NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var) {
			err_msg = Errors.handleThrowable(ccatch_env_var,
					subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
		} finally {
			thread.throwStack.pop();
		}
		if (number_utilities.NIL != err_msg && number_utilities.NIL == string_utilities.substringP(
				(SubLObject) number_utilities.$str75$This_integer_is_too_large_to_be_c, err_msg,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED)) {
			Errors.error((SubLObject) number_utilities.$str76$_A, err_msg);
		}
		return list_utilities.sublisp_boolean(num);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 48996L)
	public static SubLObject number_string_value(final SubLObject text) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (text.isString()
				&& number_utilities.NIL != Sequences.find_if(
						Symbols.symbol_function((SubLObject) number_utilities.$sym77$DIGIT_CHAR_P), text,
						(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
						(SubLObject) number_utilities.UNPROVIDED)
				&& number_utilities.NIL == list_utilities.find_if_not(
						Symbols.symbol_function((SubLObject) number_utilities.$sym78$VALID_NUMBER_STRING_CHAR), text,
						(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
						(SubLObject) number_utilities.UNPROVIDED)) {
			thread.resetMultipleValues();
			final SubLObject number = reader.read_from_string_ignoring_errors(text,
					(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
					(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
			final SubLObject next_position = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (number.isNumber() && next_position.eql(Sequences.length(text))) {
				return number;
			}
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 49703L)
	public static SubLObject valid_number_string_char(final SubLObject obj) {
		return Sequences.find(obj, number_utilities.$valid_number_string_characters$.getGlobalValue(),
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 49804L)
	public static SubLObject extended_number_string_p(final SubLObject string) {
		if (number_utilities.NIL == string_utilities.partially_numeric_stringP(string)) {
			return (SubLObject) number_utilities.NIL;
		}
		final SubLObject exponent_marker_position = Sequences.position_if(
				(SubLObject) number_utilities.$sym80$VALID_EXPONENT_MARKER, string,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
		final SubLObject significand = (number_utilities.NIL != exponent_marker_position) ? string_utilities
				.substring(string, (SubLObject) number_utilities.ZERO_INTEGER, exponent_marker_position) : string;
		final SubLObject exponent = (SubLObject) ((number_utilities.NIL != exponent_marker_position) ? string_utilities
				.substring(string, Numbers.add((SubLObject) number_utilities.ONE_INTEGER, exponent_marker_position),
						(SubLObject) number_utilities.UNPROVIDED)
				: number_utilities.NIL);
		SubLObject failedP = (SubLObject) number_utilities.NIL;
		if (number_utilities.NIL != string_utilities.empty_string_p(significand)) {
			failedP = (SubLObject) number_utilities.T;
		} else {
			SubLObject decimal_foundP = (SubLObject) number_utilities.NIL;
			final SubLObject leading_elt = Sequences.elt(significand, (SubLObject) number_utilities.ZERO_INTEGER);
			if (Characters.CHAR_period.eql(leading_elt)) {
				decimal_foundP = (SubLObject) number_utilities.T;
			} else if (number_utilities.NIL == Characters.digit_char_p(leading_elt,
					(SubLObject) number_utilities.UNPROVIDED) && number_utilities.NIL == valid_sign(leading_elt)) {
				failedP = (SubLObject) number_utilities.T;
			}
			final SubLObject string_var = significand;
			final SubLObject end_var = Sequences.length(string_var);
			if (number_utilities.NIL == failedP) {
				SubLObject end_var_$3;
				SubLObject char_num;
				SubLObject v_char;
				for (end_var_$3 = end_var, char_num = (SubLObject) number_utilities.NIL, char_num = (SubLObject) number_utilities.ONE_INTEGER; number_utilities.NIL == failedP
						&& !char_num.numGE(end_var_$3); char_num = f_1X(char_num)) {
					v_char = Strings.sublisp_char(string_var, char_num);
					if (number_utilities.NIL == Characters.digit_char_p(v_char,
							(SubLObject) number_utilities.UNPROVIDED)) {
						if (Characters.CHAR_period.eql(v_char)) {
							if (number_utilities.NIL != decimal_foundP) {
								failedP = (SubLObject) number_utilities.T;
							} else {
								decimal_foundP = (SubLObject) number_utilities.T;
							}
						} else {
							failedP = (SubLObject) number_utilities.T;
						}
					}
				}
			}
		}
		if (number_utilities.NIL == failedP && number_utilities.NIL != exponent) {
			if (number_utilities.NIL != string_utilities.empty_string_p(exponent)) {
				failedP = (SubLObject) number_utilities.T;
			} else {
				final SubLObject leading_elt2 = Sequences.elt(exponent, (SubLObject) number_utilities.ZERO_INTEGER);
				if (number_utilities.NIL == Characters.digit_char_p(leading_elt2,
						(SubLObject) number_utilities.UNPROVIDED) && number_utilities.NIL == valid_sign(leading_elt2)) {
					failedP = (SubLObject) number_utilities.T;
				}
				final SubLObject string_var2 = exponent;
				final SubLObject end_var2 = Sequences.length(string_var2);
				if (number_utilities.NIL == failedP) {
					SubLObject end_var_$4;
					SubLObject char_num2;
					SubLObject v_char2;
					for (end_var_$4 = end_var2, char_num2 = (SubLObject) number_utilities.NIL, char_num2 = (SubLObject) number_utilities.ONE_INTEGER; number_utilities.NIL == failedP
							&& !char_num2.numGE(end_var_$4); char_num2 = f_1X(char_num2)) {
						v_char2 = Strings.sublisp_char(string_var2, char_num2);
						if (number_utilities.NIL == Characters.digit_char_p(v_char2,
								(SubLObject) number_utilities.UNPROVIDED)) {
							failedP = (SubLObject) number_utilities.T;
						}
					}
				}
			}
		}
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL == failedP);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51732L)
	public static SubLObject valid_exponent_marker(final SubLObject obj) {
		return Sequences.find(obj, number_utilities.$valid_exponent_markers$.getGlobalValue(),
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51870L)
	public static SubLObject valid_sign(final SubLObject obj) {
		return Sequences.find(obj, number_utilities.$valid_sign$.getGlobalValue(),
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 55689L)
	public static SubLObject find_smallest_prime_for_binary_width(final SubLObject power) {
		SubLObject candidate = f_1_(Numbers.expt((SubLObject) number_utilities.TWO_INTEGER, power));
		SubLObject prime = (SubLObject) number_utilities.NIL;
		while (number_utilities.NIL == prime) {
			if (number_utilities.NIL != prime_numberP(candidate)) {
				prime = candidate;
			} else {
				candidate = Numbers.subtract(candidate, (SubLObject) number_utilities.ONE_INTEGER);
			}
		}
		return prime;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56362L)
	public static SubLObject checksum_sanity_check() {
		return (SubLObject) SubLObjectFactory.makeBoolean(number_utilities.NIL != subl_promotions
				.positive_integer_p(number_utilities.$checksum_implementation_width$.getGlobalValue())
				&& number_utilities.NIL != subl_promotions
						.positive_integer_p(number_utilities.$checksum_base$.getGlobalValue()));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56719L)
	public static SubLObject checksum_update(final SubLObject v_byte) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		number_utilities.$checksum_sum$
				.setDynamicValue(Numbers.add(number_utilities.$checksum_sum$.getDynamicValue(thread), v_byte), thread);
		if (number_utilities.$checksum_base$.getGlobalValue()
				.numL(number_utilities.$checksum_sum$.getDynamicValue(thread))) {
			number_utilities.$checksum_sum$
					.setDynamicValue(Numbers.subtract(number_utilities.$checksum_sum$.getDynamicValue(thread),
							number_utilities.$checksum_base$.getGlobalValue()), thread);
		}
		number_utilities.$checksum_length$
				.setDynamicValue(Numbers.add(number_utilities.$checksum_length$.getDynamicValue(thread),
						number_utilities.$checksum_sum$.getDynamicValue(thread)), thread);
		if (number_utilities.$checksum_base$.getGlobalValue()
				.numL(number_utilities.$checksum_length$.getDynamicValue(thread))) {
			number_utilities.$checksum_length$
					.setDynamicValue(Numbers.subtract(number_utilities.$checksum_length$.getDynamicValue(thread),
							number_utilities.$checksum_base$.getGlobalValue()), thread);
		}
		return v_byte;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 57235L)
	public static SubLObject checksum_finalize() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return (SubLObject) ConsesLow.cons(number_utilities.$checksum_length$.getDynamicValue(thread),
				number_utilities.$checksum_sum$.getDynamicValue(thread));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 57581L)
	public static SubLObject checksum_setup(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list94);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject sum_init = (SubLObject) number_utilities.NIL;
		SubLObject length_init = (SubLObject) number_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list94);
		sum_init = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list94);
		length_init = current.first();
		current = current.rest();
		if (number_utilities.NIL == current) {
			final SubLObject body;
			current = (body = temp);
			return (SubLObject) ConsesLow.listS((SubLObject) number_utilities.$sym95$CLET, (SubLObject) ConsesLow.list(
					(SubLObject) ConsesLow.list((SubLObject) number_utilities.$sym96$_CHECKSUM_SUM_, sum_init),
					(SubLObject) ConsesLow.list((SubLObject) number_utilities.$sym97$_CHECKSUM_LENGTH_, length_init)),
					ConsesLow.append(body, (SubLObject) number_utilities.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) number_utilities.$list94);
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 57828L)
	public static SubLObject checksum_start(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return (SubLObject) ConsesLow.listS((SubLObject) number_utilities.$sym92$CHECKSUM_SETUP,
				(SubLObject) number_utilities.$list98, ConsesLow.append(body, (SubLObject) number_utilities.NIL));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 58197L)
	public static SubLObject checksum_resume(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list99);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject accumulators = (SubLObject) number_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list99);
		accumulators = current.first();
		current = current.rest();
		if (number_utilities.NIL == current) {
			final SubLObject body;
			current = (body = temp);
			return (SubLObject) ConsesLow.listS((SubLObject) number_utilities.$sym92$CHECKSUM_SETUP,
					(SubLObject) ConsesLow.list(
							(SubLObject) ConsesLow.list((SubLObject) number_utilities.$sym48$CDR, accumulators),
							(SubLObject) ConsesLow.list((SubLObject) number_utilities.$sym100$CAR, accumulators)),
					ConsesLow.append(body, (SubLObject) number_utilities.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) number_utilities.$list99);
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 58643L)
	public static SubLObject with_checksum(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list101);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject checksum = (SubLObject) number_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list101);
		checksum = current.first();
		current = current.rest();
		if (number_utilities.NIL == current) {
			final SubLObject body;
			current = (body = temp);
			return reader
					.bq_cons((SubLObject) number_utilities.$sym102$CHECKSUM_START,
							ConsesLow
									.append(body,
											(SubLObject) ConsesLow.list((SubLObject) ConsesLow.listS(
													(SubLObject) number_utilities.$sym103$CSETQ, checksum,
													(SubLObject) number_utilities.$list104))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) number_utilities.$list101);
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 59117L)
	public static SubLObject expt_mod(final SubLObject number, final SubLObject exponent, final SubLObject modulus) {
		SubLObject result = Numbers.mod(number, modulus);
		SubLObject cdotimes_end_var;
		SubLObject i;
		for (cdotimes_end_var = Numbers.subtract(exponent,
				(SubLObject) number_utilities.ONE_INTEGER), i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
						.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			result = Numbers.mod(Numbers.multiply(result, number), modulus);
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 60233L)
	public static SubLObject binary_expt_mod(final SubLObject number, final SubLObject exponent,
			final SubLObject modulus) {
		final SubLObject binary_exponent = Sequences.subseq(convert_to_binary(exponent),
				(SubLObject) number_utilities.ONE_INTEGER, (SubLObject) number_utilities.UNPROVIDED);
		SubLObject result = Numbers.mod(number, modulus);
		final SubLObject string_var = binary_exponent;
		SubLObject end_var_$5;
		SubLObject end_var;
		SubLObject char_num;
		SubLObject v_char;
		for (end_var = (end_var_$5 = Sequences
				.length(string_var)), char_num = (SubLObject) number_utilities.NIL, char_num = (SubLObject) number_utilities.ZERO_INTEGER; !char_num
						.numGE(end_var_$5); char_num = f_1X(char_num)) {
			v_char = Strings.sublisp_char(string_var, char_num);
			if (v_char.eql((SubLObject) Characters.CHAR_0)) {
				result = Numbers.mod(square(result), modulus);
			} else {
				result = Numbers.mod(square(result), modulus);
				result = Numbers.mod(Numbers.multiply(result, number), modulus);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61230L)
	public static SubLObject convert_to_binary(final SubLObject n) {
		return PrintLow.write_to_string(n,
				new SubLObject[] { number_utilities.$kw105$BASE, number_utilities.TWO_INTEGER });
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61405L)
	public static SubLObject convert_to_hexadecimal(final SubLObject n) {
		return PrintLow.format((SubLObject) number_utilities.NIL, (SubLObject) number_utilities.$str106$_X, n);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61575L)
	public static SubLObject modular_subtraction(final SubLObject a, final SubLObject b, final SubLObject modulus) {
		return Numbers.mod(Numbers.subtract(a, b), modulus);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61803L)
	public static SubLObject modular_addition(final SubLObject a, final SubLObject b, final SubLObject modulus) {
		return Numbers.mod(Numbers.add(a, b), modulus);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61996L)
	public static SubLObject modularE(final SubLObject a, final SubLObject b, final SubLObject n) {
		return Equality.eq(Numbers.mod(a, n), Numbers.mod(b, n));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 62176L)
	public static SubLObject number_of_digits(final SubLObject n) {
		if (n.isNumber()) {
			return n.isNegative()
					? Numbers.subtract(
							Sequences.length(PrintLow.write_to_string(n, number_utilities.EMPTY_SUBL_OBJECT_ARRAY)),
							(SubLObject) number_utilities.ONE_INTEGER)
					: Sequences.length(PrintLow.write_to_string(n, number_utilities.EMPTY_SUBL_OBJECT_ARRAY));
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 62414L)
	public static SubLObject multiple_ofP(final SubLObject small_int, final SubLObject large_int) {
		if (small_int.isInteger() && large_int.isInteger() && !small_int.isZero()) {
			return Types.integerp(Numbers.divide(large_int, small_int));
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 62722L)
	public static SubLObject multiple_of_allP(final SubLObject list, final SubLObject large_int) {
		SubLObject cdolist_list_var = list;
		SubLObject item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			if (number_utilities.NIL == multiple_ofP(item, large_int)) {
				return (SubLObject) number_utilities.NIL;
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return (SubLObject) number_utilities.T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 63017L)
	public static SubLObject prime_numberP(final SubLObject v_object) {
		if (number_utilities.NIL == subl_promotions.positive_integer_p(v_object)) {
			return (SubLObject) number_utilities.NIL;
		}
		if (v_object.eql((SubLObject) number_utilities.ONE_INTEGER)) {
			return (SubLObject) number_utilities.NIL;
		}
		return Equality.eql(v_object, find_smallest_divisor(v_object));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 63274L)
	public static SubLObject prime_factorization(SubLObject positive_integer) {
		assert number_utilities.NIL != subl_promotions.positive_integer_p(positive_integer) : positive_integer;
		if (positive_integer.eql((SubLObject) number_utilities.ONE_INTEGER)) {
			return (SubLObject) number_utilities.NIL;
		}
		SubLObject factorization = (SubLObject) number_utilities.NIL;
		while (!number_utilities.ONE_INTEGER.eql(positive_integer)) {
			final SubLObject smallest_divisor = find_smallest_divisor(positive_integer);
			factorization = (SubLObject) ConsesLow.cons(smallest_divisor, factorization);
			positive_integer = Numbers.divide(positive_integer, smallest_divisor);
		}
		return Sort.sort(factorization, Symbols.symbol_function((SubLObject) number_utilities.$sym37$_),
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 63984L)
	public static SubLObject common_prime_factors(final SubLObject positive_integer_list) {
		SubLObject prime_factors_list = (SubLObject) number_utilities.NIL;
		SubLObject cdolist_list_var = positive_integer_list;
		SubLObject positive_integer = (SubLObject) number_utilities.NIL;
		positive_integer = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			prime_factors_list = (SubLObject) ConsesLow.cons(
					Sort.sort(prime_factorization(Numbers.abs(positive_integer)),
							(SubLObject) number_utilities.$sym37$_, (SubLObject) number_utilities.UNPROVIDED),
					prime_factors_list);
			cdolist_list_var = cdolist_list_var.rest();
			positive_integer = cdolist_list_var.first();
		}
		return list_utilities.intersect_sorted_all(prime_factors_list, (SubLObject) number_utilities.$sym37$_,
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 64274L)
	public static SubLObject find_smallest_divisor(final SubLObject positive_integer) {
		SubLObject divisor = (SubLObject) number_utilities.NIL;
		if (number_utilities.NIL == subl_promotions.positive_integer_p(positive_integer)
				|| !positive_integer.numG((SubLObject) number_utilities.ONE_INTEGER)) {
			Errors.error((SubLObject) number_utilities.$str107$_A_is_not_a_positive_integer_grea, positive_integer);
		} else if (number_utilities.NIL != Numbers.evenp(positive_integer)) {
			divisor = (SubLObject) number_utilities.TWO_INTEGER;
		} else if (Numbers.mod(positive_integer, (SubLObject) number_utilities.THREE_INTEGER).isZero()) {
			divisor = (SubLObject) number_utilities.THREE_INTEGER;
		} else {
			final SubLObject isqrt = Numbers.isqrt(positive_integer);
			final SubLObject start = (SubLObject) number_utilities.SIX_INTEGER;
			final SubLObject end = Numbers.add((SubLObject) number_utilities.TWO_INTEGER, isqrt);
			final SubLObject squareP = Numbers.numE(positive_integer, Numbers.multiply(isqrt, isqrt));
			if (number_utilities.NIL != squareP) {
				divisor = find_smallest_divisor(isqrt);
			}
			if (number_utilities.NIL == divisor) {
				SubLObject end_var;
				SubLObject i;
				for (end_var = end, i = (SubLObject) number_utilities.NIL, i = start; number_utilities.NIL == divisor
						&& !i.numGE(end_var); i = Numbers.add(i, (SubLObject) number_utilities.SIX_INTEGER)) {
					if (Numbers.mod(positive_integer, f_1_(i)).isZero()) {
						divisor = f_1_(i);
					} else if (Numbers.mod(positive_integer, f_1X(i)).isZero()) {
						divisor = f_1X(i);
					}
				}
			}
		}
		return (number_utilities.NIL != divisor) ? divisor : positive_integer;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 66529L)
	public static SubLObject divisors(final SubLObject positive_integer) {
		assert number_utilities.NIL != subl_promotions.positive_integer_p(positive_integer) : positive_integer;
		final SubLObject factorization = prime_factorization(positive_integer);
		final SubLObject factor_lists = Sequences.delete_duplicates(list_utilities.powerset(factorization),
				Symbols.symbol_function((SubLObject) number_utilities.EQUAL), (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		final SubLObject divisors = Sequences.delete_duplicates(
				list_utilities.nmapcar(Symbols.symbol_function((SubLObject) number_utilities.$sym110$PRODUCT),
						factor_lists),
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		return Sort.sort(divisors, Symbols.symbol_function((SubLObject) number_utilities.$sym37$_),
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 67063L)
	public static SubLObject lcm(final SubLObject ints) {
		assert number_utilities.NIL != list_utilities.non_dotted_list_p(ints) : ints;
		SubLObject cdolist_list_var = ints;
		SubLObject elem = (SubLObject) number_utilities.NIL;
		elem = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			assert number_utilities.NIL != Types.integerp(elem) : elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		if (number_utilities.NIL == ints) {
			return (SubLObject) number_utilities.ONE_INTEGER;
		}
		SubLObject pos_ints = conses_high.copy_list(ints);
		pos_ints = list_utilities.nmapcar(Symbols.symbol_function((SubLObject) number_utilities.$sym112$ABS), pos_ints);
		pos_ints = list_utilities.fast_delete_duplicates(pos_ints, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		if (number_utilities.NIL != list_utilities.singletonP(pos_ints)) {
			return pos_ints.first();
		}
		if (number_utilities.NIL != subl_promotions.memberP((SubLObject) number_utilities.ZERO_INTEGER, pos_ints,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED)) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		return Sequences.creduce(Symbols.symbol_function((SubLObject) number_utilities.$sym113$LCM2_INTERNAL), pos_ints,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 67782L)
	public static SubLObject lcm2(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != Types.integerp(int1) : int1;
		assert number_utilities.NIL != Types.integerp(int2) : int2;
		if (int1.isZero() || int2.isZero()) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		return lcm2_internal(Numbers.abs(int1), Numbers.abs(int2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 68171L)
	public static SubLObject lcm2_internal(final SubLObject int1, final SubLObject int2) {
		final SubLObject gcd = gcd2_internal(int1, int2);
		return Numbers.multiply(int2, Numbers.integerDivide(int1, gcd));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 68387L)
	public static SubLObject gcd(final SubLObject ints) {
		assert number_utilities.NIL != list_utilities.non_dotted_list_p(ints) : ints;
		SubLObject cdolist_list_var = ints;
		SubLObject elem = (SubLObject) number_utilities.NIL;
		elem = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			assert number_utilities.NIL != Types.integerp(elem) : elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		if (number_utilities.NIL == ints) {
			return (SubLObject) number_utilities.ZERO_INTEGER;
		}
		SubLObject pos_ints = conses_high.copy_list(ints);
		pos_ints = list_utilities.nmapcar(Symbols.symbol_function((SubLObject) number_utilities.$sym112$ABS), pos_ints);
		pos_ints = list_utilities.fast_delete_duplicates(pos_ints, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		if (number_utilities.NIL != list_utilities.singletonP(pos_ints)) {
			return pos_ints.first();
		}
		return Sequences.creduce(Symbols.symbol_function((SubLObject) number_utilities.$sym114$GCD2_INTERNAL), pos_ints,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69090L)
	public static SubLObject gcd2(final SubLObject int1, final SubLObject int2) {
		assert number_utilities.NIL != Types.integerp(int1) : int1;
		assert number_utilities.NIL != Types.integerp(int2) : int2;
		return gcd2_internal(Numbers.abs(int1), Numbers.abs(int2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69348L)
	public static SubLObject gcd2_internal(final SubLObject int1, final SubLObject int2) {
		if (int1.numG(int2)) {
			return gcd2_sorted_internal(int1, int2);
		}
		return gcd2_sorted_internal(int2, int1);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69608L)
	public static SubLObject gcd2_sorted_internal(final SubLObject greater, final SubLObject lesser) {
		if (lesser.isZero()) {
			return greater;
		}
		return gcd2_sorted_internal(lesser, Numbers.mod(greater, lesser));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69766L)
	public static SubLObject convert_hexadecimal_to_decimal(final SubLObject number_string) {
		final SubLObject rev_number = Sequences.reverse(number_string);
		final SubLObject length_number = Sequences.length(rev_number);
		SubLObject result = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject i;
		for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
				.numL(length_number); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			result = Numbers.add(result,
					Numbers.multiply(Numbers.expt((SubLObject) number_utilities.SIXTEEN_INTEGER, i),
							decimal_code_for_hex_digit(Vectors.aref(rev_number, i))));
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70441L)
	public static SubLObject decimal_code_for_hex_digit(final SubLObject v_char) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject code = Characters.digit_char_p(v_char, (SubLObject) number_utilities.UNPROVIDED);
		if (number_utilities.NIL == code) {
			code = conses_high
					.second(conses_high.assoc(v_char, number_utilities.$hex_to_dec_table$.getDynamicValue(thread),
							(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED));
		}
		return code;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70625L)
	public static SubLObject with_probability(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject probability = (SubLObject) number_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list116);
		probability = current.first();
		final SubLObject body;
		current = (body = current.rest());
		final SubLObject prob = (SubLObject) number_utilities.$sym117$PROB;
		return (SubLObject) ConsesLow
				.list((SubLObject) number_utilities.$sym95$CLET,
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(prob, probability)),
						(SubLObject) ConsesLow.listS((SubLObject) number_utilities.$sym118$CHECK_TYPE, prob,
								(SubLObject) number_utilities.$list119),
						(SubLObject) ConsesLow.listS(
								(SubLObject) number_utilities.$sym120$PWHEN, (SubLObject) ConsesLow
										.list((SubLObject) number_utilities.$sym121$TRUE_WITH_PROBABILITY, prob),
								ConsesLow.append(body, (SubLObject) number_utilities.NIL)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70975L)
	public static SubLObject probability_p(final SubLObject v_object) {
		return collection_defns.cyc_real_0_1(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71045L)
	public static SubLObject true_with_probability(final SubLObject p) {
		assert number_utilities.NIL != probability_p(p) : p;
		if (number_utilities.ONE_INTEGER.numE(p)) {
			return (SubLObject) number_utilities.T;
		}
		if (number_utilities.ZERO_INTEGER.numE(p)) {
			return (SubLObject) number_utilities.NIL;
		}
		return true_with_probability_int(p, (SubLObject) number_utilities.ONE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71421L)
	public static SubLObject true_with_probability_int(final SubLObject p, final SubLObject scaling_factor) {
		final SubLObject reciprocal = Numbers.round(Numbers.divide((SubLObject) number_utilities.ONE_INTEGER, p),
				(SubLObject) number_utilities.UNPROVIDED);
		if (reciprocal.numG(scaling_factor)) {
			return Numbers.numL(random.random(reciprocal), scaling_factor);
		}
		final SubLObject new_scaling_factor = Numbers.multiply((SubLObject) number_utilities.$int123$1000,
				scaling_factor);
		final SubLObject new_p = Numbers.divide(p, (SubLObject) number_utilities.$int123$1000);
		return true_with_probability_int(new_p, new_scaling_factor);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71804L)
	public static SubLObject logistic(final SubLObject num) {
		return Numbers.divide((SubLObject) number_utilities.ONE_INTEGER,
				Numbers.add((SubLObject) number_utilities.ONE_INTEGER,
						Numbers.expt(number_utilities.$e$.getGlobalValue(), Numbers.minus(num))));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71929L)
	public static SubLObject coin_flip() {
		return Numbers.zerop(random.random((SubLObject) number_utilities.TWO_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71986L)
	public static SubLObject probability_distribution_p(final SubLObject v_object) {
		if (number_utilities.NIL != list_utilities.property_list_p(v_object)) {
			SubLObject sum = (SubLObject) number_utilities.ZERO_INTEGER;
			SubLObject remainder;
			SubLObject property;
			SubLObject value;
			for (remainder = (SubLObject) number_utilities.NIL, remainder = v_object; number_utilities.NIL != remainder; remainder = conses_high
					.cddr(remainder)) {
				property = remainder.first();
				value = conses_high.cadr(remainder);
				if (number_utilities.NIL == non_negative_number_p(value)) {
					return (SubLObject) number_utilities.NIL;
				}
				sum = Numbers.add(sum, value);
			}
			if (Numbers.abs(f_1_(sum)).numL((SubLObject) number_utilities.$float124$1_0e_5)) {
				return (SubLObject) number_utilities.T;
			}
		}
		return (SubLObject) number_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72369L)
	public static SubLObject probability_distribution_sample(final SubLObject dist) {
		assert number_utilities.NIL != probability_distribution_p(dist) : dist;
		final SubLObject p = random_probability();
		SubLObject sum_so_far = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject remainder;
		SubLObject item;
		SubLObject probability;
		for (remainder = (SubLObject) number_utilities.NIL, remainder = dist; number_utilities.NIL != remainder; remainder = conses_high
				.cddr(remainder)) {
			item = remainder.first();
			probability = conses_high.cadr(remainder);
			sum_so_far = Numbers.add(sum_so_far, probability);
			if (p.numL(sum_so_far)) {
				return item;
			}
		}
		return Errors.error((SubLObject) number_utilities.$str126$Error_sampling_from__s____s__s_, dist, p, sum_so_far);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72713L)
	public static SubLObject fibonacci(final SubLObject n) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert number_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
		SubLObject fib = (SubLObject) number_utilities.NIL;
		final SubLObject local_state;
		final SubLObject state = local_state = memoization_state.new_memoization_state(
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
				(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED);
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state
					.memoization_state_original_process(local_state);
			try {
				fib = fibonacci_memoized(n);
			} finally {
				final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind((SubLObject) number_utilities.T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state,
							original_memoization_process);
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return fib;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72887L)
	public static SubLObject fibonacci_memoized_internal(final SubLObject n) {
		if (n.eql((SubLObject) number_utilities.ZERO_INTEGER)) {
			return (SubLObject) number_utilities.ONE_INTEGER;
		}
		if (n.eql((SubLObject) number_utilities.ONE_INTEGER)) {
			return (SubLObject) number_utilities.ONE_INTEGER;
		}
		return Numbers.add(fibonacci_memoized(Numbers.subtract(n, (SubLObject) number_utilities.ONE_INTEGER)),
				fibonacci_memoized(Numbers.subtract(n, (SubLObject) number_utilities.TWO_INTEGER)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72887L)
	public static SubLObject fibonacci_memoized(final SubLObject n) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = (SubLObject) number_utilities.NIL;
		if (number_utilities.NIL == v_memoization_state) {
			return fibonacci_memoized_internal(n);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state,
				(SubLObject) number_utilities.$sym128$FIBONACCI_MEMOIZED, (SubLObject) number_utilities.UNPROVIDED);
		if (number_utilities.NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(
					memoization_state.memoization_state_lock(v_memoization_state),
					(SubLObject) number_utilities.$sym128$FIBONACCI_MEMOIZED, (SubLObject) number_utilities.ONE_INTEGER,
					(SubLObject) number_utilities.NIL, (SubLObject) number_utilities.EQL,
					(SubLObject) number_utilities.UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state,
					(SubLObject) number_utilities.$sym128$FIBONACCI_MEMOIZED, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, n,
				memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = Values.arg2(thread.resetMultipleValues(),
					(SubLObject) Values.multiple_value_list(fibonacci_memoized_internal(n)));
			memoization_state.caching_state_put(caching_state, n, results, (SubLObject) number_utilities.UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 73101L)
	public static SubLObject random_0_1() {
		return Numbers.divide(random.random(random.$rand_max$.getGlobalValue()), random.$rand_max$.getGlobalValue());
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 73245L)
	public static SubLObject random_probability() {
		return random_0_1();
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 73360L)
	public static SubLObject n_random_integers(final SubLObject n, final SubLObject limit, SubLObject sort_function) {
		if (sort_function == number_utilities.UNPROVIDED) {
			sort_function = (SubLObject) number_utilities.NIL;
		}
		assert number_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
		assert number_utilities.NIL != subl_promotions.positive_integer_p(limit) : limit;
		if (number_utilities.NIL != sort_function && !number_utilities.assertionsDisabledInClass
				&& number_utilities.NIL == Types.function_spec_p(sort_function)) {
			throw new AssertionError(sort_function);
		}
		final SubLObject list = non_negative_integers_less_than(limit);
		final SubLObject result = list_utilities.random_n(n, list);
		return (number_utilities.NIL != sort_function)
				? Sort.sort(result, sort_function, (SubLObject) number_utilities.UNPROVIDED) : result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 74017L)
	public static SubLObject non_negative_integers_less_than(final SubLObject limit) {
		assert number_utilities.NIL != subl_promotions.positive_integer_p(limit) : limit;
		SubLObject cursor;
		final SubLObject list = cursor = (SubLObject) ConsesLow.make_list(limit,
				(SubLObject) number_utilities.UNPROVIDED);
		SubLObject i;
		for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
				.numL(limit); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			ConsesLow.rplaca(cursor, i);
			cursor = cursor.rest();
		}
		return list;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 74357L)
	public static SubLObject compute_deltas(final SubLObject numbers, SubLObject last) {
		if (last == number_utilities.UNPROVIDED) {
			last = (SubLObject) number_utilities.NIL;
		}
		SubLObject deltas = (SubLObject) number_utilities.NIL;
		if (number_utilities.NIL != numbers) {
			SubLObject first = (SubLObject) number_utilities.NIL;
			SubLObject rest = (SubLObject) number_utilities.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(numbers, numbers, (SubLObject) number_utilities.$list130);
			first = numbers.first();
			final SubLObject current = rest = numbers.rest();
			SubLObject previous = first;
			SubLObject cdolist_list_var = rest;
			SubLObject next = (SubLObject) number_utilities.NIL;
			next = cdolist_list_var.first();
			while (number_utilities.NIL != cdolist_list_var) {
				final SubLObject delta = Numbers.subtract(next, previous);
				deltas = (SubLObject) ConsesLow.cons(delta, deltas);
				previous = next;
				cdolist_list_var = cdolist_list_var.rest();
				next = cdolist_list_var.first();
			}
			if (number_utilities.NIL != last) {
				final SubLObject last_delta = Numbers.subtract(last, previous);
				deltas = (SubLObject) ConsesLow.cons(last_delta, deltas);
			}
		}
		return Sequences.nreverse(deltas);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75002L)
	public static SubLObject factorial(final SubLObject n) {
		assert number_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
		SubLObject accumulator = (SubLObject) number_utilities.ONE_INTEGER;
		SubLObject i;
		for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
				.numL(n); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			accumulator = Numbers.multiply(accumulator, f_1X(i));
		}
		return accumulator;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75192L)
	public static SubLObject choose(final SubLObject n, final SubLObject k) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert number_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
		assert number_utilities.NIL != subl_promotions.non_negative_integer_p(k) : k;
		if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !k.numLE(n)) {
			Errors.error((SubLObject) number_utilities.$str131$_s_must_be_____s, n, k);
		}
		SubLObject accumulator = (SubLObject) number_utilities.ONE_INTEGER;
		SubLObject end_var;
		SubLObject i;
		for (end_var = Numbers.subtract(n, k), i = (SubLObject) number_utilities.NIL, i = n; !i
				.numLE(end_var); i = Numbers.add(i, (SubLObject) number_utilities.MINUS_ONE_INTEGER)) {
			assert number_utilities.NIL != subl_promotions.positive_integer_p(i) : i;
			accumulator = Numbers.multiply(accumulator, i);
		}
		return Numbers.integerDivide(accumulator, factorial(k));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75627L)
	public static SubLObject strictly_between_0_and_1_p(final SubLObject x) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(x.isNumber() && x.numG((SubLObject) number_utilities.ZERO_INTEGER)
						&& x.numL((SubLObject) number_utilities.ONE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75730L)
	public static SubLObject strictly_between_0_and_minus_1_p(final SubLObject x) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(x.isNumber() && x.numL((SubLObject) number_utilities.ZERO_INTEGER)
						&& x.numG((SubLObject) number_utilities.MINUS_ONE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75840L)
	public static SubLObject tolerance_E(final SubLObject num1, final SubLObject num2, SubLObject tolerance) {
		if (tolerance == number_utilities.UNPROVIDED) {
			tolerance = (SubLObject) number_utilities.ZERO_INTEGER;
		}
		return Numbers.numLE(Numbers.abs(Numbers.subtract(num1, num2)), tolerance);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75948L)
	public static SubLObject zero(SubLObject dummy) {
		if (dummy == number_utilities.UNPROVIDED) {
			dummy = (SubLObject) number_utilities.NIL;
		}
		return (SubLObject) number_utilities.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 76015L)
	public static SubLObject one(SubLObject dummy) {
		if (dummy == number_utilities.UNPROVIDED) {
			dummy = (SubLObject) number_utilities.NIL;
		}
		return (SubLObject) number_utilities.ONE_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 76081L)
	public static SubLObject pairwise_slope(final SubLObject points) {
		SubLObject slopes = (SubLObject) number_utilities.NIL;
		final SubLObject point_list = points.rest();
		SubLObject prev_point = points.first();
		SubLObject cdolist_list_var = point_list;
		SubLObject point = (SubLObject) number_utilities.NIL;
		point = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = prev_point;
			SubLObject prev_x = (SubLObject) number_utilities.NIL;
			SubLObject prev_y = (SubLObject) number_utilities.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list132);
			prev_x = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) number_utilities.$list132);
			prev_y = current.first();
			current = current.rest();
			if (number_utilities.NIL == current) {
				SubLObject current_$8;
				final SubLObject datum_$7 = current_$8 = point;
				SubLObject curr_x = (SubLObject) number_utilities.NIL;
				SubLObject curr_y = (SubLObject) number_utilities.NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7,
						(SubLObject) number_utilities.$list133);
				curr_x = current_$8.first();
				current_$8 = current_$8.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7,
						(SubLObject) number_utilities.$list133);
				curr_y = current_$8.first();
				current_$8 = current_$8.rest();
				if (number_utilities.NIL == current_$8) {
					final SubLObject slope = Numbers.divide(Numbers.subtract(curr_y, prev_y),
							Numbers.subtract(curr_x, prev_x));
					slopes = (SubLObject) ConsesLow.cons(slope, slopes);
				} else {
					cdestructuring_bind.cdestructuring_bind_error(datum_$7, (SubLObject) number_utilities.$list133);
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) number_utilities.$list132);
			}
			prev_point = point;
			cdolist_list_var = cdolist_list_var.rest();
			point = cdolist_list_var.first();
		}
		return Sequences.nreverse(slopes);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 76730L)
	public static SubLObject values_to_coordinates(final SubLObject values) {
		SubLObject coordinates = (SubLObject) number_utilities.NIL;
		SubLObject list_var = (SubLObject) number_utilities.NIL;
		SubLObject value = (SubLObject) number_utilities.NIL;
		SubLObject position = (SubLObject) number_utilities.NIL;
		list_var = values;
		value = list_var.first();
		for (position = (SubLObject) number_utilities.ZERO_INTEGER; number_utilities.NIL != list_var; list_var = list_var
				.rest(), value = list_var
						.first(), position = Numbers.add((SubLObject) number_utilities.ONE_INTEGER, position)) {
			coordinates = (SubLObject) ConsesLow.cons((SubLObject) ConsesLow.list(position, value), coordinates);
		}
		return Sequences.nreverse(coordinates);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 77113L)
	public static SubLObject coordinates_to_values(final SubLObject coordinates) {
		return Mapping.mapcar((SubLObject) number_utilities.$sym134$SECOND, coordinates);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 77285L)
	public static SubLObject pairwise_slope_points(final SubLObject points) {
		final SubLObject slopes = pairwise_slope(points);
		return values_to_coordinates(slopes);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 77714L)
	public static SubLObject average_neighbors(final SubLObject items, SubLObject num_of_neighbors) {
		if (num_of_neighbors == number_utilities.UNPROVIDED) {
			num_of_neighbors = (SubLObject) number_utilities.$int135$25;
		}
		assert number_utilities.NIL != subl_promotions.non_negative_integer_p(num_of_neighbors) : num_of_neighbors;
		final SubLObject width = (number_utilities.NIL != Numbers.oddp(num_of_neighbors))
				? Numbers.integerDivide(Numbers.subtract(num_of_neighbors, (SubLObject) number_utilities.ONE_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER)
				: Numbers.integerDivide(num_of_neighbors, (SubLObject) number_utilities.TWO_INTEGER);
		final SubLObject window_size = Numbers.add(width, width, (SubLObject) number_utilities.ONE_INTEGER);
		final SubLObject window = queues.create_queue((SubLObject) number_utilities.UNPROVIDED);
		SubLObject window_sum = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject cursor = items;
		SubLObject smoothed_values = (SubLObject) number_utilities.NIL;
		SubLObject i;
		SubLObject item;
		for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
				.numL(window_size); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			item = cursor.first();
			queues.enqueue(item, window);
			window_sum = Numbers.add(window_sum, item);
			if (i.numL(width)) {
				smoothed_values = (SubLObject) ConsesLow.cons(item, smoothed_values);
			}
			cursor = cursor.rest();
		}
		SubLObject cdolist_list_var = cursor;
		item = (SubLObject) number_utilities.NIL;
		item = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			assert number_utilities.NIL != Types.numberp(item) : item;
			smoothed_values = (SubLObject) ConsesLow.cons(Numbers.floor(window_sum, window_size), smoothed_values);
			queues.enqueue(item, window);
			window_sum = Numbers.add(window_sum, item);
			final SubLObject tossed = queues.dequeue(window);
			window_sum = Numbers.subtract(window_sum, tossed);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		smoothed_values = (SubLObject) ConsesLow.cons(Numbers.divide(window_sum, window_size), smoothed_values);
		SubLObject cdotimes_end_var;
		SubLObject j;
		for (cdotimes_end_var = Numbers.add(width,
				(SubLObject) number_utilities.ONE_INTEGER), j = (SubLObject) number_utilities.NIL, j = (SubLObject) number_utilities.ZERO_INTEGER; j
						.numL(cdotimes_end_var); j = Numbers.add(j, (SubLObject) number_utilities.ONE_INTEGER)) {
			queues.dequeue(window);
		}
		while (number_utilities.NIL == queues.queue_empty_p(window)) {
			final SubLObject item2 = queues.dequeue(window);
			smoothed_values = (SubLObject) ConsesLow.cons(item2, smoothed_values);
		}
		return Sequences.nreverse(smoothed_values);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 80575L)
	public static SubLObject renumber_id_using_table(final SubLObject id, final SubLObject table_of_deletes) {
		SubLObject left = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject right = Numbers.subtract(Sequences.length(table_of_deletes),
				(SubLObject) number_utilities.ONE_INTEGER);
		while (left.numLE(right)) {
			final SubLObject index = Numbers.integerDivide(Numbers.add(left, right),
					(SubLObject) number_utilities.TWO_INTEGER);
			final SubLObject deleted_id = Vectors.aref(table_of_deletes, index);
			if (deleted_id.numE(id)) {
				return (SubLObject) number_utilities.$kw138$DELETED;
			}
			if (deleted_id.numL(id)) {
				left = Numbers.add(index, (SubLObject) number_utilities.ONE_INTEGER);
			} else {
				if (!deleted_id.numG(id)) {
					continue;
				}
				right = Numbers.subtract(index, (SubLObject) number_utilities.ONE_INTEGER);
			}
		}
		final SubLObject num_of_gaps = left;
		return Numbers.subtract(id, num_of_gaps);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 84633L)
	public static SubLObject test_renumber_id_using_table(final SubLObject deleted_ids, final SubLObject max_id) {
		final SubLObject renumbered_ids = test_build_translation_map_for_id_renumbering(deleted_ids, max_id);
		final SubLObject table_of_deletes = list_utilities.list2vector(deleted_ids);
		SubLObject id;
		SubLObject mapped_id;
		SubLObject renumbered_id;
		for (id = (SubLObject) number_utilities.NIL, id = (SubLObject) number_utilities.ZERO_INTEGER; id
				.numL(max_id); id = Numbers.add(id, (SubLObject) number_utilities.ONE_INTEGER)) {
			mapped_id = Hashtables.gethash(id, renumbered_ids, (SubLObject) number_utilities.UNPROVIDED);
			renumbered_id = renumber_id_using_table(id, table_of_deletes);
			if (!mapped_id.eql(renumbered_id)) {
				if (!mapped_id.numE(renumbered_id)) {
					Errors.error((SubLObject) number_utilities.$str141$Original_id__A_was_supposed_to_ma, id, mapped_id,
							renumbered_id);
				}
			}
		}
		return (SubLObject) number_utilities.$kw142$SUCCESS;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 85351L)
	public static SubLObject transform_delete_list_to_gap_list(final SubLObject deleted_ids) {
		SubLObject gap_list = (SubLObject) number_utilities.NIL;
		SubLObject cursor_id;
		SubLObject prev_id = cursor_id = deleted_ids.first();
		SubLObject width = (SubLObject) number_utilities.ONE_INTEGER;
		SubLObject cdolist_list_var = deleted_ids.rest();
		SubLObject id = (SubLObject) number_utilities.NIL;
		id = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			cursor_id = Numbers.add(cursor_id, (SubLObject) number_utilities.ONE_INTEGER);
			if (cursor_id.numE(id)) {
				width = Numbers.add(width, (SubLObject) number_utilities.ONE_INTEGER);
			} else {
				if (width.numE((SubLObject) number_utilities.ONE_INTEGER)) {
					gap_list = (SubLObject) ConsesLow.cons(prev_id, gap_list);
				} else {
					gap_list = (SubLObject) ConsesLow.cons((SubLObject) ConsesLow.cons(prev_id, width), gap_list);
				}
				prev_id = id;
				cursor_id = id;
				width = (SubLObject) number_utilities.ONE_INTEGER;
			}
			cdolist_list_var = cdolist_list_var.rest();
			id = cdolist_list_var.first();
		}
		if (width.numE((SubLObject) number_utilities.ONE_INTEGER)) {
			gap_list = (SubLObject) ConsesLow.cons(prev_id, gap_list);
		} else {
			gap_list = (SubLObject) ConsesLow.cons((SubLObject) ConsesLow.cons(prev_id, width), gap_list);
		}
		return Sequences.nreverse(gap_list);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 87188L)
	public static SubLObject transform_gap_list_to_delta_list(final SubLObject gap_list) {
		SubLObject cummulative = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject delta_list = (SubLObject) number_utilities.NIL;
		SubLObject cdolist_list_var = gap_list;
		SubLObject gap_info = (SubLObject) number_utilities.NIL;
		gap_info = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			SubLObject gap_start = (SubLObject) number_utilities.NIL;
			SubLObject gap_width = (SubLObject) number_utilities.NIL;
			if (gap_info.isCons()) {
				SubLObject current;
				final SubLObject datum = current = gap_info;
				SubLObject start = (SubLObject) number_utilities.NIL;
				SubLObject width = (SubLObject) number_utilities.NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum,
						(SubLObject) number_utilities.$list145);
				start = current.first();
				current = (width = current.rest());
				gap_start = start;
				gap_width = width;
			} else if (gap_info.isNumber()) {
				gap_start = gap_info;
				gap_width = (SubLObject) number_utilities.ONE_INTEGER;
			} else {
				Errors.error((SubLObject) number_utilities.$str146$Invalid_gap_list_format__Unclear_, gap_info);
			}
			cummulative = Numbers.add(cummulative, gap_width);
			delta_list = (SubLObject) ConsesLow.cons((SubLObject) ConsesLow.cons(gap_start, cummulative), delta_list);
			cdolist_list_var = cdolist_list_var.rest();
			gap_info = cdolist_list_var.first();
		}
		return Sequences.nreverse(delta_list);
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 89457L)
	public static SubLObject renumber_id_using_delta_table(final SubLObject id, final SubLObject delta_table) {
		SubLObject left = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject right = Numbers.subtract(Sequences.length(delta_table), (SubLObject) number_utilities.ONE_INTEGER);
		while (left.numLE(right)) {
			final SubLObject index = Numbers.integerDivide(Numbers.add(left, right),
					(SubLObject) number_utilities.TWO_INTEGER);
			final SubLObject deletion_info = Vectors.aref(delta_table, index);
			final SubLObject deleted_id = deletion_info.first();
			if (deleted_id.numE(id)) {
				return (SubLObject) number_utilities.$kw138$DELETED;
			}
			if (deleted_id.numL(id)) {
				left = Numbers.add(index, (SubLObject) number_utilities.ONE_INTEGER);
			} else {
				if (!deleted_id.numG(id)) {
					continue;
				}
				right = Numbers.subtract(index, (SubLObject) number_utilities.ONE_INTEGER);
			}
		}
		if (number_utilities.NIL != subl_promotions.non_negative_integer_p(right)) {
			final SubLObject delete_info = Vectors.aref(delta_table, right);
			final SubLObject delta = delete_info.rest();
			final SubLObject renumbered_id = Numbers.subtract(id, delta);
			return renumbered_id;
		}
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 94290L)
	public static SubLObject test_renumber_id_using_delta_table(final SubLObject deleted_ids, final SubLObject max_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject renumbered_ids = test_build_translation_map_for_id_renumbering(deleted_ids, max_id);
		final SubLObject delta_list = transform_gap_list_to_delta_list(transform_delete_list_to_gap_list(deleted_ids));
		final SubLObject delta_table = list_utilities.list2vector(delta_list);
		SubLObject id;
		SubLObject mapped_id;
		SubLObject renumbered_id;
		for (id = (SubLObject) number_utilities.NIL, id = (SubLObject) number_utilities.ZERO_INTEGER; id
				.numL(max_id); id = Numbers.add(id, (SubLObject) number_utilities.ONE_INTEGER)) {
			mapped_id = Hashtables.gethash(id, renumbered_ids, (SubLObject) number_utilities.UNPROVIDED);
			renumbered_id = (SubLObject) number_utilities.NIL;
			if (number_utilities.$kw138$DELETED != mapped_id) {
				renumbered_id = renumber_id_using_delta_table(id, delta_table);
				if (!mapped_id.eql(renumbered_id)) {
					if (!renumbered_id.isNumber() || !mapped_id.numE(renumbered_id)) {
						Errors.error((SubLObject) number_utilities.$str141$Original_id__A_was_supposed_to_ma, id,
								mapped_id, renumbered_id);
					}
				}
			}
		}
		SubLObject cdolist_list_var = delta_list;
		SubLObject delta_info = (SubLObject) number_utilities.NIL;
		delta_info = cdolist_list_var.first();
		while (number_utilities.NIL != cdolist_list_var) {
			final SubLObject deleted_id = delta_info.first();
			final SubLObject renumbered_id2 = renumber_id_using_delta_table(deleted_id, delta_table);
			if (number_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
					&& number_utilities.$kw138$DELETED != renumbered_id2) {
				Errors.error((SubLObject) number_utilities.$str150$ID__A_should_have_been_deleted_bu, renumbered_id2);
			}
			cdolist_list_var = cdolist_list_var.rest();
			delta_info = cdolist_list_var.first();
		}
		return (SubLObject) number_utilities.$kw142$SUCCESS;
	}

	@SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 95719L)
	public static SubLObject test_build_translation_map_for_id_renumbering(final SubLObject deleted_ids,
			final SubLObject max_id) {
		final SubLObject renumbered_ids = Hashtables.make_hash_table(max_id, (SubLObject) number_utilities.EQL,
				(SubLObject) number_utilities.UNPROVIDED);
		SubLObject current = (SubLObject) number_utilities.ZERO_INTEGER;
		SubLObject i;
		for (i = (SubLObject) number_utilities.NIL, i = (SubLObject) number_utilities.ZERO_INTEGER; i
				.numL(max_id); i = Numbers.add(i, (SubLObject) number_utilities.ONE_INTEGER)) {
			if (Sequences.find(i, deleted_ids, (SubLObject) number_utilities.UNPROVIDED,
					(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED,
					(SubLObject) number_utilities.UNPROVIDED).isNumber()) {
				Hashtables.sethash(i, renumbered_ids, (SubLObject) number_utilities.$kw138$DELETED);
			} else {
				Hashtables.sethash(i, renumbered_ids, current);
				current = Numbers.add(current, (SubLObject) number_utilities.ONE_INTEGER);
			}
		}
		return renumbered_ids;
	}

	public static SubLObject declare_number_utilities_file() {
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "f_1X", "1+", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "f_1_", "1-", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "f_2X", "2*", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "onep", "ONEP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "encode_boolean", "ENCODE-BOOLEAN", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "decode_boolean", "DECODE-BOOLEAN", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "get_bit", "GET-BIT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "set_bit", "SET-BIT", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "clear_bit", "CLEAR-BIT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "div", "DIV", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "safe_X", "SAFE-/", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "square", "SQUARE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "cube", "CUBE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "cubert", "CUBERT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "bytep", "BYTEP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "nil_or_integer_p", "NIL-OR-INTEGER-P", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "possibly_positive_integer_p",
				"POSSIBLY-POSITIVE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "list_of_integer_p", "LIST-OF-INTEGER-P", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "list_of_positive_integer_p",
				"LIST-OF-POSITIVE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "list_of_negative_integer_p",
				"LIST-OF-NEGATIVE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "list_of_non_negative_integer_p",
				"LIST-OF-NON-NEGATIVE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "list_of_non_positive_integer_p",
				"LIST-OF-NON-POSITIVE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_number_p", "POSITIVE-NUMBER-P", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "non_negative_number_p",
				"NON-NEGATIVE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "non_positive_number_p",
				"NON-POSITIVE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_number_p", "NEGATIVE-NUMBER-P", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "zero_number_p", "ZERO-NUMBER-P", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "non_zero_number_p", "NON-ZERO-NUMBER-P", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "probability_number_p",
				"PROBABILITY-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percentile_p", "PERCENTILE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "decimal_integer_length",
				"DECIMAL-INTEGER-LENGTH", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "significant_digits", "SIGNIFICANT-DIGITS",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "four_significant_digits",
				"FOUR-SIGNIFICANT-DIGITS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "significant_digits_optimize_float",
				"SIGNIFICANT-DIGITS-OPTIMIZE-FLOAT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "float_n", "FLOAT-N", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "round_up_to_the_nearest",
				"ROUND-UP-TO-THE-NEAREST", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "round_to_the_nearest",
				"ROUND-TO-THE-NEAREST", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "round_down_to_the_nearest",
				"ROUND-DOWN-TO-THE-NEAREST", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "greater_absP", "GREATER-ABS?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "divides_evenly", "DIVIDES-EVENLY", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "integer_percent", "INTEGER-PERCENT", 1, 2,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "safe_percent", "SAFE-PERCENT", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percent", "PERCENT", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percentage_p", "PERCENTAGE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percentage_to_probability",
				"PERCENTAGE-TO-PROBABILITY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percent_increase", "PERCENT-INCREASE", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percent_decrease", "PERCENT-DECREASE", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percent_faster", "PERCENT-FASTER", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percent_slower", "PERCENT-SLOWER", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "log10", "LOG10", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "log2", "LOG2", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "expt10", "EXPT10", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_p",
				"POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_infinity", "NEGATIVE-INFINITY", 0,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_infinity", "POSITIVE-INFINITY", 0,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_infinity_p", "NEGATIVE-INFINITY-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_infinity_p", "POSITIVE-INFINITY-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "infinite_number_p", "INFINITE-NUMBER-P", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_potentially_infinite_number_p",
				"NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_potentially_infinite_number_p",
				"POSITIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "non_negative_potentially_infinite_number_p",
				"NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_E",
				"POTENTIALLY-INFINITE-NUMBER-=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_L",
				"POTENTIALLY-INFINITE-NUMBER-<", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_G",
				"POTENTIALLY-INFINITE-NUMBER->", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_LE",
				"POTENTIALLY-INFINITE-NUMBER-<=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_GE",
				"POTENTIALLY-INFINITE-NUMBER->=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_plus",
				"POTENTIALLY-INFINITE-NUMBER-PLUS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_minus",
				"POTENTIALLY-INFINITE-NUMBER-MINUS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_times",
				"POTENTIALLY-INFINITE-NUMBER-TIMES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_divided_by",
				"POTENTIALLY-INFINITE-NUMBER-DIVIDED-BY", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_max",
				"POTENTIALLY-INFINITE-NUMBER-MAX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_min",
				"POTENTIALLY-INFINITE-NUMBER-MIN", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_log",
				"POTENTIALLY-INFINITE-NUMBER-LOG", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_number_exp",
				"POTENTIALLY-INFINITE-NUMBER-EXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_infinity_plus",
				"NEGATIVE-INFINITY-PLUS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_infinity_plus",
				"POSITIVE-INFINITY-PLUS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_infinity_minus",
				"NEGATIVE-INFINITY-MINUS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_infinity_minus",
				"POSITIVE-INFINITY-MINUS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_infinity_times",
				"NEGATIVE-INFINITY-TIMES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_infinity_times",
				"POSITIVE-INFINITY-TIMES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_infinity_X", "NEGATIVE-INFINITY-/",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_infinity_X", "POSITIVE-INFINITY-/",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "divided_by_negative_infinity",
				"DIVIDED-BY-NEGATIVE-INFINITY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "divided_by_positive_infinity",
				"DIVIDED-BY-POSITIVE-INFINITY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "extended_potentially_infinite_number_p",
				"EXTENDED-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_p",
				"POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "infinite_integer_p", "INFINITE-INTEGER-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "negative_potentially_infinite_integer_p",
				"NEGATIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "positive_potentially_infinite_integer_p",
				"POSITIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_E",
				"POTENTIALLY-INFINITE-INTEGER-=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_L",
				"POTENTIALLY-INFINITE-INTEGER-<", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_G",
				"POTENTIALLY-INFINITE-INTEGER->", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_LE",
				"POTENTIALLY-INFINITE-INTEGER-<=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_GE",
				"POTENTIALLY-INFINITE-INTEGER->=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_plus",
				"POTENTIALLY-INFINITE-INTEGER-PLUS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_minus",
				"POTENTIALLY-INFINITE-INTEGER-MINUS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_times",
				"POTENTIALLY-INFINITE-INTEGER-TIMES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities",
				"potentially_infinite_integer_times_number_rounded",
				"POTENTIALLY-INFINITE-INTEGER-TIMES-NUMBER-ROUNDED", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_infinite_integer_divided_by",
				"POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities",
				"potentially_infinite_integer_divided_by_number_rounded",
				"POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY-NUMBER-ROUNDED", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_p",
				"POTENTIALLY-UNDEFINED-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "undefined", "UNDEFINED", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_E",
				"POTENTIALLY-UNDEFINED-NUMBER-=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_L",
				"POTENTIALLY-UNDEFINED-NUMBER-<", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_G",
				"POTENTIALLY-UNDEFINED-NUMBER->", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_LE",
				"POTENTIALLY-UNDEFINED-NUMBER-<=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_GE",
				"POTENTIALLY-UNDEFINED-NUMBER->=", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_plus",
				"POTENTIALLY-UNDEFINED-NUMBER-PLUS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_minus",
				"POTENTIALLY-UNDEFINED-NUMBER-MINUS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_times",
				"POTENTIALLY-UNDEFINED-NUMBER-TIMES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "potentially_undefined_number_divided_by",
				"POTENTIALLY-UNDEFINED-NUMBER-DIVIDED-BY", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "maximum", "MAXIMUM", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "minimum", "MINIMUM", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "average", "AVERAGE", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "mean", "MEAN", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "summation", "SUMMATION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "product", "PRODUCT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "geometric_mean", "GEOMETRIC-MEAN", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "median", "MEDIAN", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "median_sorted", "MEDIAN-SORTED", 1, 3,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percentile", "PERCENTILE", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "percentile_sorted", "PERCENTILE-SORTED", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "max_key_from_hash", "MAX-KEY-FROM-HASH", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "get_frequency_list", "GET-FREQUENCY-LIST",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "get_sorted_frequency_list",
				"GET-SORTED-FREQUENCY-LIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "mode", "MODE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "mode_sorted", "MODE-SORTED", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "variance_from_sample",
				"VARIANCE-FROM-SAMPLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "variance_from_population",
				"VARIANCE-FROM-POPULATION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "variance", "VARIANCE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "standard_deviation_from_population",
				"STANDARD-DEVIATION-FROM-POPULATION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "safe_standard_deviation_from_sample",
				"SAFE-STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "standard_deviation_from_sample",
				"STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "standard_deviation", "STANDARD-DEVIATION",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "standard_deviations_above_mean",
				"STANDARD-DEVIATIONS-ABOVE-MEAN", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "simple_outliers", "SIMPLE-OUTLIERS", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "perform_standard_statistical_analysis",
				"PERFORM-STANDARD-STATISTICAL-ANALYSIS", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "correlation", "CORRELATION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "decode_integer_multiples",
				"DECODE-INTEGER-MULTIPLES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "encode_integer_multiples",
				"ENCODE-INTEGER-MULTIPLES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "arithmetic_progression",
				"ARITHMETIC-PROGRESSION", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "geometric_progression",
				"GEOMETRIC-PROGRESSION", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "geometric_progression_ratio",
				"GEOMETRIC-PROGRESSION-RATIO", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "number_string_p", "NUMBER-STRING-P", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "number_string_value", "NUMBER-STRING-VALUE",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "valid_number_string_char",
				"VALID-NUMBER-STRING-CHAR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "extended_number_string_p",
				"EXTENDED-NUMBER-STRING-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "valid_exponent_marker",
				"VALID-EXPONENT-MARKER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "valid_sign", "VALID-SIGN", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "find_smallest_prime_for_binary_width",
				"FIND-SMALLEST-PRIME-FOR-BINARY-WIDTH", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "checksum_sanity_check",
				"CHECKSUM-SANITY-CHECK", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "checksum_update", "CHECKSUM-UPDATE", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "checksum_finalize", "CHECKSUM-FINALIZE", 0,
				0, false);
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.number_utilities", "checksum_setup", "CHECKSUM-SETUP");
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.number_utilities", "checksum_start", "CHECKSUM-START");
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.number_utilities", "checksum_resume", "CHECKSUM-RESUME");
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.number_utilities", "with_checksum", "WITH-CHECKSUM");
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "expt_mod", "EXPT-MOD", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "binary_expt_mod", "BINARY-EXPT-MOD", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "convert_to_binary", "CONVERT-TO-BINARY", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "convert_to_hexadecimal",
				"CONVERT-TO-HEXADECIMAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "modular_subtraction", "MODULAR-SUBTRACTION",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "modular_addition", "MODULAR-ADDITION", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "modularE", "MODULAR=", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "number_of_digits", "NUMBER-OF-DIGITS", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "multiple_ofP", "MULTIPLE-OF?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "multiple_of_allP", "MULTIPLE-OF-ALL?", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "prime_numberP", "PRIME-NUMBER?", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "prime_factorization", "PRIME-FACTORIZATION",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "common_prime_factors",
				"COMMON-PRIME-FACTORS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "find_smallest_divisor",
				"FIND-SMALLEST-DIVISOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "divisors", "DIVISORS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "lcm", "LCM", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "lcm2", "LCM2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "lcm2_internal", "LCM2-INTERNAL", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "gcd", "GCD", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "gcd2", "GCD2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "gcd2_internal", "GCD2-INTERNAL", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "gcd2_sorted_internal",
				"GCD2-SORTED-INTERNAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "convert_hexadecimal_to_decimal",
				"CONVERT-HEXADECIMAL-TO-DECIMAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "decimal_code_for_hex_digit",
				"DECIMAL-CODE-FOR-HEX-DIGIT", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.number_utilities", "with_probability", "WITH-PROBABILITY");
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "probability_p", "PROBABILITY-P", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "true_with_probability",
				"TRUE-WITH-PROBABILITY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "true_with_probability_int",
				"TRUE-WITH-PROBABILITY-INT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "logistic", "LOGISTIC", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "coin_flip", "COIN-FLIP", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "probability_distribution_p",
				"PROBABILITY-DISTRIBUTION-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "probability_distribution_sample",
				"PROBABILITY-DISTRIBUTION-SAMPLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "fibonacci", "FIBONACCI", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "fibonacci_memoized_internal",
				"FIBONACCI-MEMOIZED-INTERNAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "fibonacci_memoized", "FIBONACCI-MEMOIZED",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "random_0_1", "RANDOM-0-1", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "random_probability", "RANDOM-PROBABILITY",
				0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "n_random_integers", "N-RANDOM-INTEGERS", 2,
				1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "non_negative_integers_less_than",
				"NON-NEGATIVE-INTEGERS-LESS-THAN", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "compute_deltas", "COMPUTE-DELTAS", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "factorial", "FACTORIAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "choose", "CHOOSE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "strictly_between_0_and_1_p",
				"STRICTLY-BETWEEN-0-AND-1-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "strictly_between_0_and_minus_1_p",
				"STRICTLY-BETWEEN-0-AND-MINUS-1-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "tolerance_E", "TOLERANCE-=", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "zero", "ZERO", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "one", "ONE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "pairwise_slope", "PAIRWISE-SLOPE", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "values_to_coordinates",
				"VALUES-TO-COORDINATES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "coordinates_to_values",
				"COORDINATES-TO-VALUES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "pairwise_slope_points",
				"PAIRWISE-SLOPE-POINTS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "average_neighbors", "AVERAGE-NEIGHBORS", 1,
				1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "renumber_id_using_table",
				"RENUMBER-ID-USING-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "test_renumber_id_using_table",
				"TEST-RENUMBER-ID-USING-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "transform_delete_list_to_gap_list",
				"TRANSFORM-DELETE-LIST-TO-GAP-LIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "transform_gap_list_to_delta_list",
				"TRANSFORM-GAP-LIST-TO-DELTA-LIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "renumber_id_using_delta_table",
				"RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities", "test_renumber_id_using_delta_table",
				"TEST-RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.number_utilities",
				"test_build_translation_map_for_id_renumbering", "TEST-BUILD-TRANSLATION-MAP-FOR-ID-RENUMBERING", 2, 0,
				false);
		return (SubLObject) number_utilities.NIL;
	}

	public static SubLObject init_number_utilities_file() {
		number_utilities.$large_immediate_positive_integer$ = SubLFiles.deflexical("*LARGE-IMMEDIATE-POSITIVE-INTEGER*",
				Numbers.expt((SubLObject) number_utilities.TWO_INTEGER, (SubLObject) number_utilities.$int2$26));
		number_utilities.$e$ = SubLFiles.defconstant("*E*", Numbers.$exp1$.getGlobalValue());
		number_utilities.$maximum_float_significant_digits$ = SubLFiles.deflexical("*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*",
				(SubLObject) number_utilities.SIXTEEN_INTEGER);
		number_utilities.$valid_number_string_characters$ = SubLFiles.deflexical("*VALID-NUMBER-STRING-CHARACTERS*",
				(SubLObject) number_utilities.$str79$0123456789___deDE);
		number_utilities.$valid_exponent_markers$ = SubLFiles.deflexical("*VALID-EXPONENT-MARKERS*",
				(SubLObject) number_utilities.$str81$deDE);
		number_utilities.$valid_sign$ = SubLFiles.deflexical("*VALID-SIGN*", (SubLObject) number_utilities.$str82$__);
		number_utilities.$largest_prime_by_binary_width$ = SubLFiles.defconstant("*LARGEST-PRIME-BY-BINARY-WIDTH*",
				(SubLObject) number_utilities.$list83);
		number_utilities.$checksum_implementation_width$ = SubLFiles
				.defconstant("*CHECKSUM-IMPLEMENTATION-WIDTH*",
						Numbers.truncate(
								Numbers.log(Numbers.abs(Numbers.$most_negative_fixnum$.getGlobalValue()),
										(SubLObject) number_utilities.TWO_INTEGER),
								(SubLObject) number_utilities.UNPROVIDED));
		number_utilities.$checksum_base$ = SubLFiles.defconstant("*CHECKSUM-BASE*",
				conses_high
						.assoc(number_utilities.$checksum_implementation_width$.getGlobalValue(),
								number_utilities.$largest_prime_by_binary_width$.getGlobalValue(),
								(SubLObject) number_utilities.UNPROVIDED, (SubLObject) number_utilities.UNPROVIDED)
						.rest());
		number_utilities.$checksum_initial_value_sum$ = SubLFiles.defconstant("*CHECKSUM-INITIAL-VALUE-SUM*",
				(SubLObject) number_utilities.ONE_INTEGER);
		number_utilities.$checksum_initial_value_length$ = SubLFiles.defconstant("*CHECKSUM-INITIAL-VALUE-LENGTH*",
				(SubLObject) number_utilities.ZERO_INTEGER);
		number_utilities.$checksum_sum$ = SubLFiles.defparameter("*CHECKSUM-SUM*",
				(SubLObject) number_utilities.ONE_INTEGER);
		number_utilities.$checksum_length$ = SubLFiles.defparameter("*CHECKSUM-LENGTH*",
				(SubLObject) number_utilities.ZERO_INTEGER);
		number_utilities.$hex_to_dec_table$ = SubLFiles.defparameter("*HEX-TO-DEC-TABLE*",
				(SubLObject) number_utilities.$list115);
		return (SubLObject) number_utilities.NIL;
	}

	public static SubLObject setup_number_utilities_file() {
		SubLSpecialOperatorDeclarations.proclaim((SubLObject) number_utilities.$list0);
		SubLSpecialOperatorDeclarations.proclaim((SubLObject) number_utilities.$list1);
		utilities_macros.register_cyc_api_function((SubLObject) number_utilities.$sym5$NIL_OR_INTEGER_P,
				(SubLObject) number_utilities.$list6,
				(SubLObject) number_utilities.$str7$Return_T_iff_OBJECT_is_either_an_,
				(SubLObject) number_utilities.NIL, (SubLObject) number_utilities.$list8);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym84$CHECKSUM_SANITY_CHECK,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list91);
		access_macros.register_macro_helper((SubLObject) number_utilities.$sym92$CHECKSUM_SETUP,
				(SubLObject) number_utilities.$list93);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym108$FIND_SMALLEST_DIVISOR,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list109);
		memoization_state.note_memoized_function((SubLObject) number_utilities.$sym128$FIBONACCI_MEMOIZED);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym136$AVERAGE_NEIGHBORS,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.EQUALP,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list137);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym139$TEST_RENUMBER_ID_USING_TABLE,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				number_utilities.$list140);
		generic_testing.define_test_case_table_int(
				(SubLObject) number_utilities.$sym143$TRANSFORM_DELETE_LIST_TO_GAP_LIST,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST,
						Symbols.symbol_function((SubLObject) number_utilities.EQUAL), number_utilities.$kw86$OWNER,
						number_utilities.NIL, number_utilities.$kw87$CLASSES, number_utilities.NIL,
						number_utilities.$kw88$KB, number_utilities.$kw89$TINY, number_utilities.$kw90$WORKING_,
						number_utilities.T }),
				(SubLObject) number_utilities.$list144);
		generic_testing.define_test_case_table_int(
				(SubLObject) number_utilities.$sym147$TRANSFORM_GAP_LIST_TO_DELTA_LIST,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST,
						Symbols.symbol_function((SubLObject) number_utilities.EQUAL), number_utilities.$kw86$OWNER,
						number_utilities.NIL, number_utilities.$kw87$CLASSES, number_utilities.NIL,
						number_utilities.$kw88$KB, number_utilities.$kw89$TINY, number_utilities.$kw90$WORKING_,
						number_utilities.T }),
				(SubLObject) number_utilities.$list148);
		generic_testing.define_test_case_table_int(
				(SubLObject) number_utilities.$sym149$TEST_RENUMBER_ID_USING_DELTA_TABLE,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				number_utilities.$list140);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym151$PRIME_NUMBER_,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list152);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym108$FIND_SMALLEST_DIVISOR,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list153);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym154$MEDIAN,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list155);
		generic_testing.define_test_case_table_int((SubLObject) number_utilities.$sym156$COMPUTE_DELTAS,
				(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.$kw85$TEST, number_utilities.NIL,
						number_utilities.$kw86$OWNER, number_utilities.NIL, number_utilities.$kw87$CLASSES,
						number_utilities.NIL, number_utilities.$kw88$KB, number_utilities.$kw89$TINY,
						number_utilities.$kw90$WORKING_, number_utilities.T }),
				(SubLObject) number_utilities.$list157);
		return (SubLObject) number_utilities.NIL;
	}

	private static SubLObject _constant_140_initializer() {
		return (SubLObject) ConsesLow.list(
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.list((SubLObject) number_utilities.ONE_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER,
										(SubLObject) number_utilities.SEVEN_INTEGER,
										(SubLObject) number_utilities.TEN_INTEGER),
								(SubLObject) number_utilities.TWELVE_INTEGER),
						(SubLObject) SubLObjectFactory.makeKeyword("SUCCESS")),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.ZERO_INTEGER,
										number_utilities.TWO_INTEGER, number_utilities.THREE_INTEGER,
										number_utilities.ELEVEN_INTEGER, number_utilities.THIRTEEN_INTEGER,
										number_utilities.FOURTEEN_INTEGER, number_utilities.FIFTEEN_INTEGER,
										number_utilities.SIXTEEN_INTEGER, SubLObjectFactory.makeInteger(27),
										SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(59),
										SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(250),
										SubLObjectFactory.makeInteger(361), SubLObjectFactory.makeInteger(365),
										SubLObjectFactory.makeInteger(366), SubLObjectFactory.makeInteger(367),
										SubLObjectFactory.makeInteger(368), SubLObjectFactory.makeInteger(369),
										SubLObjectFactory.makeInteger(374), SubLObjectFactory.makeInteger(375),
										SubLObjectFactory.makeInteger(378), SubLObjectFactory.makeInteger(429),
										SubLObjectFactory.makeInteger(430), SubLObjectFactory.makeInteger(436),
										SubLObjectFactory.makeInteger(442), SubLObjectFactory.makeInteger(473),
										SubLObjectFactory.makeInteger(510), SubLObjectFactory.makeInteger(538),
										SubLObjectFactory.makeInteger(539), SubLObjectFactory.makeInteger(555),
										SubLObjectFactory.makeInteger(614), SubLObjectFactory.makeInteger(623),
										SubLObjectFactory.makeInteger(624), SubLObjectFactory.makeInteger(643),
										SubLObjectFactory.makeInteger(1041), SubLObjectFactory.makeInteger(1062),
										SubLObjectFactory.makeInteger(1064), SubLObjectFactory.makeInteger(1092),
										SubLObjectFactory.makeInteger(1096), SubLObjectFactory.makeInteger(1098),
										SubLObjectFactory.makeInteger(1102), SubLObjectFactory.makeInteger(1146),
										SubLObjectFactory.makeInteger(1147), SubLObjectFactory.makeInteger(1150),
										SubLObjectFactory.makeInteger(1251), SubLObjectFactory.makeInteger(1252),
										SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475),
										SubLObjectFactory.makeInteger(1485) }),
								(SubLObject) SubLObjectFactory.makeInteger(1460)),
						(SubLObject) SubLObjectFactory.makeKeyword("SUCCESS")),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.ZERO_INTEGER,
										number_utilities.ONE_INTEGER, number_utilities.TWO_INTEGER,
										number_utilities.THREE_INTEGER, number_utilities.FOUR_INTEGER,
										number_utilities.FIVE_INTEGER, number_utilities.SIX_INTEGER,
										number_utilities.SEVEN_INTEGER, number_utilities.EIGHT_INTEGER,
										number_utilities.NINE_INTEGER, number_utilities.TEN_INTEGER,
										number_utilities.ELEVEN_INTEGER, number_utilities.TWELVE_INTEGER,
										number_utilities.THIRTEEN_INTEGER, number_utilities.FOURTEEN_INTEGER,
										number_utilities.FIFTEEN_INTEGER, number_utilities.SIXTEEN_INTEGER,
										number_utilities.SEVENTEEN_INTEGER, number_utilities.EIGHTEEN_INTEGER,
										number_utilities.NINETEEN_INTEGER, number_utilities.TWENTY_INTEGER,
										SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22),
										SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24),
										SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26),
										SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28),
										SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30),
										SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32),
										SubLObjectFactory.makeInteger(33), SubLObjectFactory.makeInteger(34),
										SubLObjectFactory.makeInteger(35), SubLObjectFactory.makeInteger(36),
										SubLObjectFactory.makeInteger(37), SubLObjectFactory.makeInteger(38),
										SubLObjectFactory.makeInteger(39), SubLObjectFactory.makeInteger(40),
										SubLObjectFactory.makeInteger(41), SubLObjectFactory.makeInteger(42),
										SubLObjectFactory.makeInteger(43), SubLObjectFactory.makeInteger(44),
										SubLObjectFactory.makeInteger(45), SubLObjectFactory.makeInteger(46),
										SubLObjectFactory.makeInteger(47), SubLObjectFactory.makeInteger(48),
										SubLObjectFactory.makeInteger(49), SubLObjectFactory.makeInteger(50),
										SubLObjectFactory.makeInteger(51), SubLObjectFactory.makeInteger(52),
										SubLObjectFactory.makeInteger(53), SubLObjectFactory.makeInteger(54),
										SubLObjectFactory.makeInteger(55), SubLObjectFactory.makeInteger(56),
										SubLObjectFactory.makeInteger(57), SubLObjectFactory.makeInteger(58),
										SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(60),
										SubLObjectFactory.makeInteger(61), SubLObjectFactory.makeInteger(62),
										SubLObjectFactory.makeInteger(63), SubLObjectFactory.makeInteger(64),
										SubLObjectFactory.makeInteger(65), SubLObjectFactory.makeInteger(66),
										SubLObjectFactory.makeInteger(67), SubLObjectFactory.makeInteger(68),
										SubLObjectFactory.makeInteger(69), SubLObjectFactory.makeInteger(70),
										SubLObjectFactory.makeInteger(71), SubLObjectFactory.makeInteger(72),
										SubLObjectFactory.makeInteger(73), SubLObjectFactory.makeInteger(80),
										SubLObjectFactory.makeInteger(82), SubLObjectFactory.makeInteger(83),
										SubLObjectFactory.makeInteger(301), SubLObjectFactory.makeInteger(302),
										SubLObjectFactory.makeInteger(309), SubLObjectFactory.makeInteger(316),
										SubLObjectFactory.makeInteger(317), SubLObjectFactory.makeInteger(351),
										SubLObjectFactory.makeInteger(352), SubLObjectFactory.makeInteger(353),
										SubLObjectFactory.makeInteger(884), SubLObjectFactory.makeInteger(885),
										SubLObjectFactory.makeInteger(886), SubLObjectFactory.makeInteger(887),
										SubLObjectFactory.makeInteger(888), SubLObjectFactory.makeInteger(889),
										SubLObjectFactory.makeInteger(890), SubLObjectFactory.makeInteger(891),
										SubLObjectFactory.makeInteger(892), SubLObjectFactory.makeInteger(893),
										SubLObjectFactory.makeInteger(894), SubLObjectFactory.makeInteger(895),
										SubLObjectFactory.makeInteger(896), SubLObjectFactory.makeInteger(897),
										SubLObjectFactory.makeInteger(898), SubLObjectFactory.makeInteger(899),
										SubLObjectFactory.makeInteger(900), SubLObjectFactory.makeInteger(901),
										SubLObjectFactory.makeInteger(902), SubLObjectFactory.makeInteger(903),
										SubLObjectFactory.makeInteger(904), SubLObjectFactory.makeInteger(905),
										SubLObjectFactory.makeInteger(906), SubLObjectFactory.makeInteger(907),
										SubLObjectFactory.makeInteger(908), SubLObjectFactory.makeInteger(909),
										SubLObjectFactory.makeInteger(910), SubLObjectFactory.makeInteger(911),
										SubLObjectFactory.makeInteger(912), SubLObjectFactory.makeInteger(913),
										SubLObjectFactory.makeInteger(914), SubLObjectFactory.makeInteger(915),
										SubLObjectFactory.makeInteger(916), SubLObjectFactory.makeInteger(917),
										SubLObjectFactory.makeInteger(918), SubLObjectFactory.makeInteger(919),
										SubLObjectFactory.makeInteger(920), SubLObjectFactory.makeInteger(921),
										SubLObjectFactory.makeInteger(922), SubLObjectFactory.makeInteger(923),
										SubLObjectFactory.makeInteger(924), SubLObjectFactory.makeInteger(925),
										SubLObjectFactory.makeInteger(926), SubLObjectFactory.makeInteger(927),
										SubLObjectFactory.makeInteger(928), SubLObjectFactory.makeInteger(929),
										SubLObjectFactory.makeInteger(930), SubLObjectFactory.makeInteger(931),
										SubLObjectFactory.makeInteger(932), SubLObjectFactory.makeInteger(933),
										SubLObjectFactory.makeInteger(934), SubLObjectFactory.makeInteger(935),
										SubLObjectFactory.makeInteger(936), SubLObjectFactory.makeInteger(937),
										SubLObjectFactory.makeInteger(938), SubLObjectFactory.makeInteger(939),
										SubLObjectFactory.makeInteger(940), SubLObjectFactory.makeInteger(941),
										SubLObjectFactory.makeInteger(942), SubLObjectFactory.makeInteger(943),
										SubLObjectFactory.makeInteger(944), SubLObjectFactory.makeInteger(945),
										SubLObjectFactory.makeInteger(946), SubLObjectFactory.makeInteger(947),
										SubLObjectFactory.makeInteger(948), SubLObjectFactory.makeInteger(949),
										SubLObjectFactory.makeInteger(950), SubLObjectFactory.makeInteger(951),
										SubLObjectFactory.makeInteger(952), SubLObjectFactory.makeInteger(953),
										SubLObjectFactory.makeInteger(954), SubLObjectFactory.makeInteger(955),
										SubLObjectFactory.makeInteger(956), SubLObjectFactory.makeInteger(957),
										SubLObjectFactory.makeInteger(958), SubLObjectFactory.makeInteger(959),
										SubLObjectFactory.makeInteger(960), SubLObjectFactory.makeInteger(961),
										SubLObjectFactory.makeInteger(962), SubLObjectFactory.makeInteger(963),
										SubLObjectFactory.makeInteger(964), SubLObjectFactory.makeInteger(965),
										SubLObjectFactory.makeInteger(966), SubLObjectFactory.makeInteger(967),
										SubLObjectFactory.makeInteger(968), SubLObjectFactory.makeInteger(969),
										SubLObjectFactory.makeInteger(970), SubLObjectFactory.makeInteger(971),
										SubLObjectFactory.makeInteger(972), SubLObjectFactory.makeInteger(973),
										SubLObjectFactory.makeInteger(974), SubLObjectFactory.makeInteger(984),
										SubLObjectFactory.makeInteger(985), SubLObjectFactory.makeInteger(986),
										SubLObjectFactory.makeInteger(1324), SubLObjectFactory.makeInteger(1325),
										SubLObjectFactory.makeInteger(1326), SubLObjectFactory.makeInteger(1327),
										SubLObjectFactory.makeInteger(1619), SubLObjectFactory.makeInteger(1629),
										SubLObjectFactory.makeInteger(1630), SubLObjectFactory.makeInteger(1631),
										SubLObjectFactory.makeInteger(1632), SubLObjectFactory.makeInteger(1641),
										SubLObjectFactory.makeInteger(1642), SubLObjectFactory.makeInteger(1643),
										SubLObjectFactory.makeInteger(1645), SubLObjectFactory.makeInteger(1646),
										SubLObjectFactory.makeInteger(1647), SubLObjectFactory.makeInteger(1649),
										SubLObjectFactory.makeInteger(1650), SubLObjectFactory.makeInteger(1651),
										SubLObjectFactory.makeInteger(1653), SubLObjectFactory.makeInteger(1655),
										SubLObjectFactory.makeInteger(1656), SubLObjectFactory.makeInteger(1657),
										SubLObjectFactory.makeInteger(1658), SubLObjectFactory.makeInteger(1723),
										SubLObjectFactory.makeInteger(1729), SubLObjectFactory.makeInteger(1733),
										SubLObjectFactory.makeInteger(1740), SubLObjectFactory.makeInteger(1741),
										SubLObjectFactory.makeInteger(1742), SubLObjectFactory.makeInteger(1743),
										SubLObjectFactory.makeInteger(1745), SubLObjectFactory.makeInteger(1756),
										SubLObjectFactory.makeInteger(1757), SubLObjectFactory.makeInteger(1758),
										SubLObjectFactory.makeInteger(1759), SubLObjectFactory.makeInteger(1760),
										SubLObjectFactory.makeInteger(1810), SubLObjectFactory.makeInteger(1834),
										SubLObjectFactory.makeInteger(1835), SubLObjectFactory.makeInteger(1868),
										SubLObjectFactory.makeInteger(2084), SubLObjectFactory.makeInteger(2145),
										SubLObjectFactory.makeInteger(2146), SubLObjectFactory.makeInteger(2170),
										SubLObjectFactory.makeInteger(2185), SubLObjectFactory.makeInteger(2186),
										SubLObjectFactory.makeInteger(2187), SubLObjectFactory.makeInteger(2194),
										SubLObjectFactory.makeInteger(2198), SubLObjectFactory.makeInteger(2201),
										SubLObjectFactory.makeInteger(2202), SubLObjectFactory.makeInteger(2203),
										SubLObjectFactory.makeInteger(2204), SubLObjectFactory.makeInteger(2205),
										SubLObjectFactory.makeInteger(2207), SubLObjectFactory.makeInteger(2211),
										SubLObjectFactory.makeInteger(2215), SubLObjectFactory.makeInteger(2216),
										SubLObjectFactory.makeInteger(2218), SubLObjectFactory.makeInteger(2223),
										SubLObjectFactory.makeInteger(2226), SubLObjectFactory.makeInteger(2227),
										SubLObjectFactory.makeInteger(2228), SubLObjectFactory.makeInteger(2256),
										SubLObjectFactory.makeInteger(2263), SubLObjectFactory.makeInteger(2269),
										SubLObjectFactory.makeInteger(2270), SubLObjectFactory.makeInteger(2271),
										SubLObjectFactory.makeInteger(2273), SubLObjectFactory.makeInteger(2277),
										SubLObjectFactory.makeInteger(2278), SubLObjectFactory.makeInteger(2283),
										SubLObjectFactory.makeInteger(2287), SubLObjectFactory.makeInteger(2289),
										SubLObjectFactory.makeInteger(2291), SubLObjectFactory.makeInteger(2292),
										SubLObjectFactory.makeInteger(2293), SubLObjectFactory.makeInteger(2295),
										SubLObjectFactory.makeInteger(2296), SubLObjectFactory.makeInteger(2297),
										SubLObjectFactory.makeInteger(2299), SubLObjectFactory.makeInteger(2316),
										SubLObjectFactory.makeInteger(2319), SubLObjectFactory.makeInteger(2321),
										SubLObjectFactory.makeInteger(2323), SubLObjectFactory.makeInteger(2324),
										SubLObjectFactory.makeInteger(2325), SubLObjectFactory.makeInteger(2330),
										SubLObjectFactory.makeInteger(2332), SubLObjectFactory.makeInteger(2337),
										SubLObjectFactory.makeInteger(2351), SubLObjectFactory.makeInteger(2364),
										SubLObjectFactory.makeInteger(2365), SubLObjectFactory.makeInteger(2367),
										SubLObjectFactory.makeInteger(2368), SubLObjectFactory.makeInteger(2372),
										SubLObjectFactory.makeInteger(2375), SubLObjectFactory.makeInteger(2378),
										SubLObjectFactory.makeInteger(2385), SubLObjectFactory.makeInteger(2386),
										SubLObjectFactory.makeInteger(2390), SubLObjectFactory.makeInteger(2391),
										SubLObjectFactory.makeInteger(2395), SubLObjectFactory.makeInteger(2402),
										SubLObjectFactory.makeInteger(2409), SubLObjectFactory.makeInteger(2410),
										SubLObjectFactory.makeInteger(2415), SubLObjectFactory.makeInteger(2418),
										SubLObjectFactory.makeInteger(2422), SubLObjectFactory.makeInteger(2429),
										SubLObjectFactory.makeInteger(2435), SubLObjectFactory.makeInteger(2437),
										SubLObjectFactory.makeInteger(2439), SubLObjectFactory.makeInteger(2445),
										SubLObjectFactory.makeInteger(2446), SubLObjectFactory.makeInteger(2450),
										SubLObjectFactory.makeInteger(2452), SubLObjectFactory.makeInteger(2453),
										SubLObjectFactory.makeInteger(2454), SubLObjectFactory.makeInteger(2455),
										SubLObjectFactory.makeInteger(2457), SubLObjectFactory.makeInteger(2458),
										SubLObjectFactory.makeInteger(2462), SubLObjectFactory.makeInteger(2463),
										SubLObjectFactory.makeInteger(2470), SubLObjectFactory.makeInteger(2471),
										SubLObjectFactory.makeInteger(2474), SubLObjectFactory.makeInteger(2475),
										SubLObjectFactory.makeInteger(2477), SubLObjectFactory.makeInteger(2479),
										SubLObjectFactory.makeInteger(2484), SubLObjectFactory.makeInteger(2487),
										SubLObjectFactory.makeInteger(2488), SubLObjectFactory.makeInteger(2491),
										SubLObjectFactory.makeInteger(2494), SubLObjectFactory.makeInteger(2497),
										SubLObjectFactory.makeInteger(2500), SubLObjectFactory.makeInteger(2502),
										SubLObjectFactory.makeInteger(2505), SubLObjectFactory.makeInteger(2506),
										SubLObjectFactory.makeInteger(2507), SubLObjectFactory.makeInteger(2509),
										SubLObjectFactory.makeInteger(2512), SubLObjectFactory.makeInteger(2513),
										SubLObjectFactory.makeInteger(2515), SubLObjectFactory.makeInteger(2516),
										SubLObjectFactory.makeInteger(2517), SubLObjectFactory.makeInteger(2518),
										SubLObjectFactory.makeInteger(2531), SubLObjectFactory.makeInteger(2532),
										SubLObjectFactory.makeInteger(2548), SubLObjectFactory.makeInteger(2549),
										SubLObjectFactory.makeInteger(2556), SubLObjectFactory.makeInteger(2559),
										SubLObjectFactory.makeInteger(3315), SubLObjectFactory.makeInteger(3317),
										SubLObjectFactory.makeInteger(3318), SubLObjectFactory.makeInteger(3319),
										SubLObjectFactory.makeInteger(3339), SubLObjectFactory.makeInteger(3342),
										SubLObjectFactory.makeInteger(3344), SubLObjectFactory.makeInteger(3372),
										SubLObjectFactory.makeInteger(3373), SubLObjectFactory.makeInteger(3374),
										SubLObjectFactory.makeInteger(3375), SubLObjectFactory.makeInteger(3376),
										SubLObjectFactory.makeInteger(3377), SubLObjectFactory.makeInteger(3378),
										SubLObjectFactory.makeInteger(3379), SubLObjectFactory.makeInteger(3380),
										SubLObjectFactory.makeInteger(3381), SubLObjectFactory.makeInteger(3382),
										SubLObjectFactory.makeInteger(3383), SubLObjectFactory.makeInteger(3384),
										SubLObjectFactory.makeInteger(3385), SubLObjectFactory.makeInteger(3386),
										SubLObjectFactory.makeInteger(3387), SubLObjectFactory.makeInteger(3388),
										SubLObjectFactory.makeInteger(3389), SubLObjectFactory.makeInteger(3390),
										SubLObjectFactory.makeInteger(3391), SubLObjectFactory.makeInteger(3392),
										SubLObjectFactory.makeInteger(3393), SubLObjectFactory.makeInteger(3394),
										SubLObjectFactory.makeInteger(3395), SubLObjectFactory.makeInteger(3396),
										SubLObjectFactory.makeInteger(3397), SubLObjectFactory.makeInteger(3398),
										SubLObjectFactory.makeInteger(3399), SubLObjectFactory.makeInteger(3400),
										SubLObjectFactory.makeInteger(3401), SubLObjectFactory.makeInteger(3402),
										SubLObjectFactory.makeInteger(3403), SubLObjectFactory.makeInteger(3404),
										SubLObjectFactory.makeInteger(3405), SubLObjectFactory.makeInteger(3406),
										SubLObjectFactory.makeInteger(3407), SubLObjectFactory.makeInteger(3408),
										SubLObjectFactory.makeInteger(3409), SubLObjectFactory.makeInteger(3410),
										SubLObjectFactory.makeInteger(3411), SubLObjectFactory.makeInteger(3412),
										SubLObjectFactory.makeInteger(3413), SubLObjectFactory.makeInteger(3414),
										SubLObjectFactory.makeInteger(3415), SubLObjectFactory.makeInteger(3416),
										SubLObjectFactory.makeInteger(3417), SubLObjectFactory.makeInteger(3418),
										SubLObjectFactory.makeInteger(3419), SubLObjectFactory.makeInteger(3420),
										SubLObjectFactory.makeInteger(3421), SubLObjectFactory.makeInteger(3422),
										SubLObjectFactory.makeInteger(3423), SubLObjectFactory.makeInteger(3424),
										SubLObjectFactory.makeInteger(3425), SubLObjectFactory.makeInteger(3426),
										SubLObjectFactory.makeInteger(3427), SubLObjectFactory.makeInteger(3428),
										SubLObjectFactory.makeInteger(3429), SubLObjectFactory.makeInteger(3430),
										SubLObjectFactory.makeInteger(3431), SubLObjectFactory.makeInteger(3432),
										SubLObjectFactory.makeInteger(3433), SubLObjectFactory.makeInteger(3434),
										SubLObjectFactory.makeInteger(3435), SubLObjectFactory.makeInteger(3437),
										SubLObjectFactory.makeInteger(3438), SubLObjectFactory.makeInteger(3439),
										SubLObjectFactory.makeInteger(3440), SubLObjectFactory.makeInteger(3441),
										SubLObjectFactory.makeInteger(3442), SubLObjectFactory.makeInteger(3443),
										SubLObjectFactory.makeInteger(3444), SubLObjectFactory.makeInteger(3445),
										SubLObjectFactory.makeInteger(3446), SubLObjectFactory.makeInteger(3447),
										SubLObjectFactory.makeInteger(3448), SubLObjectFactory.makeInteger(3449),
										SubLObjectFactory.makeInteger(3450), SubLObjectFactory.makeInteger(3451),
										SubLObjectFactory.makeInteger(3452), SubLObjectFactory.makeInteger(3461),
										SubLObjectFactory.makeInteger(3463), SubLObjectFactory.makeInteger(3464),
										SubLObjectFactory.makeInteger(3465), SubLObjectFactory.makeInteger(3466),
										SubLObjectFactory.makeInteger(3467), SubLObjectFactory.makeInteger(3476),
										SubLObjectFactory.makeInteger(3477), SubLObjectFactory.makeInteger(3482),
										SubLObjectFactory.makeInteger(3485), SubLObjectFactory.makeInteger(3486),
										SubLObjectFactory.makeInteger(3490), SubLObjectFactory.makeInteger(3491),
										SubLObjectFactory.makeInteger(3493), SubLObjectFactory.makeInteger(3496),
										SubLObjectFactory.makeInteger(3506), SubLObjectFactory.makeInteger(3507),
										SubLObjectFactory.makeInteger(3514), SubLObjectFactory.makeInteger(3598),
										SubLObjectFactory.makeInteger(3600), SubLObjectFactory.makeInteger(3607),
										SubLObjectFactory.makeInteger(3608), SubLObjectFactory.makeInteger(3609),
										SubLObjectFactory.makeInteger(3610), SubLObjectFactory.makeInteger(3611),
										SubLObjectFactory.makeInteger(3612), SubLObjectFactory.makeInteger(3613),
										SubLObjectFactory.makeInteger(3614), SubLObjectFactory.makeInteger(3615),
										SubLObjectFactory.makeInteger(3616), SubLObjectFactory.makeInteger(3617),
										SubLObjectFactory.makeInteger(3618), SubLObjectFactory.makeInteger(3632),
										SubLObjectFactory.makeInteger(3637), SubLObjectFactory.makeInteger(3638),
										SubLObjectFactory.makeInteger(3639), SubLObjectFactory.makeInteger(3640),
										SubLObjectFactory.makeInteger(3641), SubLObjectFactory.makeInteger(3642),
										SubLObjectFactory.makeInteger(3647), SubLObjectFactory.makeInteger(3648),
										SubLObjectFactory.makeInteger(3652), SubLObjectFactory.makeInteger(3653),
										SubLObjectFactory.makeInteger(3654), SubLObjectFactory.makeInteger(3657),
										SubLObjectFactory.makeInteger(3658), SubLObjectFactory.makeInteger(3727),
										SubLObjectFactory.makeInteger(3739), SubLObjectFactory.makeInteger(3750),
										SubLObjectFactory.makeInteger(3753), SubLObjectFactory.makeInteger(3756),
										SubLObjectFactory.makeInteger(3764), SubLObjectFactory.makeInteger(3769),
										SubLObjectFactory.makeInteger(3770), SubLObjectFactory.makeInteger(3793),
										SubLObjectFactory.makeInteger(3796), SubLObjectFactory.makeInteger(3810),
										SubLObjectFactory.makeInteger(3827), SubLObjectFactory.makeInteger(3829),
										SubLObjectFactory.makeInteger(3830), SubLObjectFactory.makeInteger(3833),
										SubLObjectFactory.makeInteger(3834), SubLObjectFactory.makeInteger(3835),
										SubLObjectFactory.makeInteger(3859), SubLObjectFactory.makeInteger(3860),
										SubLObjectFactory.makeInteger(3877), SubLObjectFactory.makeInteger(3878),
										SubLObjectFactory.makeInteger(3879), SubLObjectFactory.makeInteger(3880),
										SubLObjectFactory.makeInteger(3881), SubLObjectFactory.makeInteger(3882),
										SubLObjectFactory.makeInteger(3885), SubLObjectFactory.makeInteger(3886),
										SubLObjectFactory.makeInteger(4013), SubLObjectFactory.makeInteger(4038),
										SubLObjectFactory.makeInteger(4039), SubLObjectFactory.makeInteger(4040),
										SubLObjectFactory.makeInteger(4100), SubLObjectFactory.makeInteger(4149),
										SubLObjectFactory.makeInteger(4150) }),
								(SubLObject) SubLObjectFactory.makeInteger(4160)),
						(SubLObject) SubLObjectFactory.makeKeyword("SUCCESS")));
	}

	@Override
	public void declareFunctions() {
		declare_number_utilities_file();
	}

	@Override
	public void initializeVariables() {
		init_number_utilities_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_number_utilities_file();
	}

	static {
		me = (SubLFile) new number_utilities();
		number_utilities.$large_immediate_positive_integer$ = null;
		number_utilities.$e$ = null;
		number_utilities.$maximum_float_significant_digits$ = null;
		number_utilities.$valid_number_string_characters$ = null;
		number_utilities.$valid_exponent_markers$ = null;
		number_utilities.$valid_sign$ = null;
		number_utilities.$largest_prime_by_binary_width$ = null;
		number_utilities.$checksum_implementation_width$ = null;
		number_utilities.$checksum_base$ = null;
		number_utilities.$checksum_initial_value_sum$ = null;
		number_utilities.$checksum_initial_value_length$ = null;
		number_utilities.$checksum_sum$ = null;
		number_utilities.$checksum_length$ = null;
		number_utilities.$hex_to_dec_table$ = null;
		$list0 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("INLINE"),
				(SubLObject) SubLObjectFactory.makeSymbol("ENCODE-BOOLEAN"),
				(SubLObject) SubLObjectFactory.makeSymbol("DECODE-BOOLEAN"));
		$list1 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("INLINE"),
				(SubLObject) SubLObjectFactory.makeSymbol("GET-BIT"),
				(SubLObject) SubLObjectFactory.makeSymbol("SET-BIT"),
				(SubLObject) SubLObjectFactory.makeSymbol("CLEAR-BIT"));
		$int2$26 = SubLObjectFactory.makeInteger(26);
		$sym3$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
		$int4$256 = SubLObjectFactory.makeInteger(256);
		$sym5$NIL_OR_INTEGER_P = SubLObjectFactory.makeSymbol("NIL-OR-INTEGER-P");
		$list6 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("OBJECT"));
		$str7$Return_T_iff_OBJECT_is_either_an_ = SubLObjectFactory
				.makeString("Return T iff OBJECT is either an integer or NIL");
		$list8 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("BOOLEANP"));
		$kw9$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
		$sym10$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
		$sym11$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
		$sym12$EXTENDED_POTENTIALLY_INFINITE_NUMBER_P = SubLObjectFactory
				.makeSymbol("EXTENDED-POTENTIALLY-INFINITE-NUMBER-P");
		$sym13$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
		$list14 = ConsesLow.list((SubLObject) number_utilities.ZERO_INTEGER,
				(SubLObject) number_utilities.MINUS_ONE_INTEGER, (SubLObject) number_utilities.ONE_INTEGER,
				(SubLObject) SubLObjectFactory.makeInteger(-2), (SubLObject) number_utilities.TWO_INTEGER);
		$int15$100 = SubLObjectFactory.makeInteger(100);
		$str16$NEW_must_be_larger_than_OLD = SubLObjectFactory.makeString("NEW must be larger than OLD");
		$str17$NEW_must_be_smaller_than_OLD = SubLObjectFactory.makeString("NEW must be smaller than OLD");
		$kw18$NEGATIVE_INFINITY = SubLObjectFactory.makeKeyword("NEGATIVE-INFINITY");
		$kw19$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
		$sym20$POTENTIALLY_INFINITE_NUMBER_P = SubLObjectFactory.makeSymbol("POTENTIALLY-INFINITE-NUMBER-P");
		$str21$Can_t_divide_zero_by_zero = SubLObjectFactory.makeString("Can't divide zero by zero");
		$sym22$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = SubLObjectFactory
				.makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P");
		$str23$Can_t_add_positive_infinity_and_n = SubLObjectFactory
				.makeString("Can't add positive infinity and negative infinity");
		$str24$Can_t_subtract_negative_infinity_ = SubLObjectFactory
				.makeString("Can't subtract negative infinity from itself");
		$str25$Can_t_subtract_positive_infinity_ = SubLObjectFactory
				.makeString("Can't subtract positive infinity from itself");
		$str26$Can_t_multiply_infinity_and_zero = SubLObjectFactory.makeString("Can't multiply infinity and zero");
		$str27$Can_t_divide_negative_infinity_by = SubLObjectFactory
				.makeString("Can't divide negative infinity by itself");
		$str28$Can_t_divide_negative_infinity_by = SubLObjectFactory
				.makeString("Can't divide negative infinity by positive infinity");
		$str29$Can_t_divide_positive_infinity_by = SubLObjectFactory
				.makeString("Can't divide positive infinity by negative infinity");
		$str30$Can_t_divide_positive_infinity_by = SubLObjectFactory
				.makeString("Can't divide positive infinity by itself");
		$sym31$POTENTIALLY_INFINITE_INTEGER_P = SubLObjectFactory.makeSymbol("POTENTIALLY-INFINITE-INTEGER-P");
		$kw32$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
		$sym33$POTENTIALLY_UNDEFINED_NUMBER_P = SubLObjectFactory.makeSymbol("POTENTIALLY-UNDEFINED-NUMBER-P");
		$str34$Cannot_compute_the_maximum_of_an_ = SubLObjectFactory
				.makeString("Cannot compute the maximum of an atom or empty list");
		$sym35$_ = SubLObjectFactory.makeSymbol(">");
		$str36$Cannot_compute_the_minimum_of_an_ = SubLObjectFactory
				.makeString("Cannot compute the minimum of an atom or empty list");
		$sym37$_ = SubLObjectFactory.makeSymbol("<");
		$str38$Cannot_compute_the_mean_of_an_ato = SubLObjectFactory
				.makeString("Cannot compute the mean of an atom or empty list");
		$str39$Cannot_compute_the_geometric_mean = SubLObjectFactory
				.makeString("Cannot compute the geometric mean of an atom or empty list");
		$kw40$VALUE = SubLObjectFactory.makeKeyword("VALUE");
		$str41$Cannot_compute_the_median_of_an_a = SubLObjectFactory
				.makeString("Cannot compute the median of an atom or empty list");
		$kw42$ITEM = SubLObjectFactory.makeKeyword("ITEM");
		$str43$Can_t_return_middle_item_from_an_ = SubLObjectFactory
				.makeString("Can't return middle item from an even-length list.");
		$str44$Unrecognized_RETURN_type__S = SubLObjectFactory.makeString("Unrecognized RETURN type ~S");
		$sym45$PERCENTILE_P = SubLObjectFactory.makeSymbol("PERCENTILE-P");
		$str46$Cannot_compute_the_percentile_of_ = SubLObjectFactory
				.makeString("Cannot compute the percentile of an atom or empty list");
		$str47$Cannot_compute_frequencies_of_an_ = SubLObjectFactory
				.makeString("Cannot compute frequencies of an atom or empty list");
		$sym48$CDR = SubLObjectFactory.makeSymbol("CDR");
		$str49$Cannot_compute_the_mode_of_an_ato = SubLObjectFactory
				.makeString("Cannot compute the mode of an atom or empty list");
		$str50$Cannot_compute_the_variance_of_an = SubLObjectFactory
				.makeString("Cannot compute the variance of an atom or empty list");
		$str51$Cannot_compute_the_standard_devia = SubLObjectFactory
				.makeString("Cannot compute the standard deviation of an atom or empty list");
		$str52$Standard_deviation_must_not_be_ze = SubLObjectFactory.makeString("Standard deviation must not be zero.");
		$sym53$__ = SubLObjectFactory.makeSymbol(">=");
		$sym54$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
		$str55$__Standard_Statistical_Analysis = SubLObjectFactory.makeString("~%Standard Statistical Analysis");
		$str56$_______________________________ = SubLObjectFactory.makeString("~%=============================");
		$str57$__Count______6D = SubLObjectFactory.makeString("~%Count   : ~6D");
		$str58$__Min________6D = SubLObjectFactory.makeString("~%Min     : ~6D");
		$str59$__Median_____6D = SubLObjectFactory.makeString("~%Median  : ~6D");
		$str60$__Mean_______6D = SubLObjectFactory.makeString("~%Mean    : ~6D");
		$str61$__Max________6D = SubLObjectFactory.makeString("~%Max     : ~6D");
		$str62$__Std_Dev____6D = SubLObjectFactory.makeString("~%Std Dev : ~6D");
		$str63$X_Values_and_Y_Values_must_be_of_ = SubLObjectFactory
				.makeString("X-Values and Y-Values must be of the same length ~A.");
		$float64$1_0 = (SubLFloat) SubLObjectFactory.makeDouble(1.0);
		$sym65$LISTP = SubLObjectFactory.makeSymbol("LISTP");
		$str66$length_must_be_at_least_2_ = SubLObjectFactory.makeString("length must be at least 2.");
		$str67$Cannot_start_at_1_ = SubLObjectFactory.makeString("Cannot start at 1.");
		$str68$Cannot_end_at_1_ = SubLObjectFactory.makeString("Cannot end at 1.");
		$str69$Cannot_start_at_or_below_0_ = SubLObjectFactory.makeString("Cannot start at or below 0.");
		$str70$Cannot_end_at_or_below_0_ = SubLObjectFactory.makeString("Cannot end at or below 0.");
		$str71$Length_must_be_at_least_1_ = SubLObjectFactory.makeString("Length must be at least 1.");
		$str72$Length_must_be_at_least_2_ = SubLObjectFactory.makeString("Length must be at least 2.");
		$kw73$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
		$sym74$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$str75$This_integer_is_too_large_to_be_c = SubLObjectFactory
				.makeString("This integer is too large to be converted to a double-float");
		$str76$_A = SubLObjectFactory.makeString("~A");
		$sym77$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
		$sym78$VALID_NUMBER_STRING_CHAR = SubLObjectFactory.makeSymbol("VALID-NUMBER-STRING-CHAR");
		$str79$0123456789___deDE = SubLObjectFactory.makeString("0123456789.-+deDE");
		$sym80$VALID_EXPONENT_MARKER = SubLObjectFactory.makeSymbol("VALID-EXPONENT-MARKER");
		$str81$deDE = SubLObjectFactory.makeString("deDE");
		$str82$__ = SubLObjectFactory.makeString("+-");
		$list83 = ConsesLow.list(new SubLObject[] {
				ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER, (SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.cons((SubLObject) number_utilities.THREE_INTEGER,
						(SubLObject) number_utilities.SEVEN_INTEGER),
				ConsesLow.cons((SubLObject) number_utilities.FOUR_INTEGER,
						(SubLObject) number_utilities.THIRTEEN_INTEGER),
				ConsesLow.cons((SubLObject) number_utilities.FIVE_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(31)),
				ConsesLow.cons((SubLObject) number_utilities.SIX_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(61)),
				ConsesLow.cons((SubLObject) number_utilities.SEVEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(127)),
				ConsesLow.cons((SubLObject) number_utilities.EIGHT_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(251)),
				ConsesLow.cons((SubLObject) number_utilities.NINE_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(509)),
				ConsesLow.cons((SubLObject) number_utilities.TEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(1021)),
				ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(2039)),
				ConsesLow.cons((SubLObject) number_utilities.TWELVE_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(4093)),
				ConsesLow.cons((SubLObject) number_utilities.THIRTEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(8191)),
				ConsesLow.cons((SubLObject) number_utilities.FOURTEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(16381)),
				ConsesLow.cons((SubLObject) number_utilities.FIFTEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(32749)),
				ConsesLow.cons((SubLObject) number_utilities.SIXTEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(65521)),
				ConsesLow.cons((SubLObject) number_utilities.SEVENTEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(131071)),
				ConsesLow.cons((SubLObject) number_utilities.EIGHTEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(262139)),
				ConsesLow.cons((SubLObject) number_utilities.NINETEEN_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(524287)),
				ConsesLow.cons((SubLObject) number_utilities.TWENTY_INTEGER,
						(SubLObject) SubLObjectFactory.makeInteger(1048573)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(21),
						(SubLObject) SubLObjectFactory.makeInteger(2097143)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(22),
						(SubLObject) SubLObjectFactory.makeInteger(4194301)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(23),
						(SubLObject) SubLObjectFactory.makeInteger(8388593)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(24),
						(SubLObject) SubLObjectFactory.makeInteger(16777213)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(25),
						(SubLObject) SubLObjectFactory.makeInteger(33554393)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(26),
						(SubLObject) SubLObjectFactory.makeInteger(67108859)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(27),
						(SubLObject) SubLObjectFactory.makeInteger(134217689)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(28),
						(SubLObject) SubLObjectFactory.makeInteger(268435399)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(29),
						(SubLObject) SubLObjectFactory.makeInteger(536870909)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(30),
						(SubLObject) SubLObjectFactory.makeInteger(1073741789)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(31),
						(SubLObject) SubLObjectFactory.makeInteger(Integer.MAX_VALUE)),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(32),
						(SubLObject) SubLObjectFactory.makeInteger("4294967291")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(33),
						(SubLObject) SubLObjectFactory.makeInteger("8589934583")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(34),
						(SubLObject) SubLObjectFactory.makeInteger("17179869143")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(35),
						(SubLObject) SubLObjectFactory.makeInteger("34359738337")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(36),
						(SubLObject) SubLObjectFactory.makeInteger("68719476731")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(37),
						(SubLObject) SubLObjectFactory.makeInteger("137438953447")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(38),
						(SubLObject) SubLObjectFactory.makeInteger("274877906899")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(39),
						(SubLObject) SubLObjectFactory.makeInteger("549755813881")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(40),
						(SubLObject) SubLObjectFactory.makeInteger("1099511627689")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(41),
						(SubLObject) SubLObjectFactory.makeInteger("2199023255531")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(42),
						(SubLObject) SubLObjectFactory.makeInteger("4398046511093")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(43),
						(SubLObject) SubLObjectFactory.makeInteger("8796093022151")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(44),
						(SubLObject) SubLObjectFactory.makeInteger("17592186044399")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(45),
						(SubLObject) SubLObjectFactory.makeInteger("35184372088777")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(46),
						(SubLObject) SubLObjectFactory.makeInteger("70368744177643")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(47),
						(SubLObject) SubLObjectFactory.makeInteger("140737488355213")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(48),
						(SubLObject) SubLObjectFactory.makeInteger("281474976710597")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(49),
						(SubLObject) SubLObjectFactory.makeInteger("562949953421231")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(50),
						(SubLObject) SubLObjectFactory.makeInteger("1125899906842597")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(51),
						(SubLObject) SubLObjectFactory.makeInteger("2251799813685119")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(52),
						(SubLObject) SubLObjectFactory.makeInteger("4503599627370449")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(53),
						(SubLObject) SubLObjectFactory.makeInteger("9007199254740881")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(54),
						(SubLObject) SubLObjectFactory.makeInteger("18014398509481951")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(55),
						(SubLObject) SubLObjectFactory.makeInteger("36028797018963913")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(56),
						(SubLObject) SubLObjectFactory.makeInteger("72057594037927931")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(57),
						(SubLObject) SubLObjectFactory.makeInteger("144115188075855859")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(58),
						(SubLObject) SubLObjectFactory.makeInteger("288230376151711717")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(59),
						(SubLObject) SubLObjectFactory.makeInteger("576460752303423433")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(60),
						(SubLObject) SubLObjectFactory.makeInteger("1152921504606846883")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(61),
						(SubLObject) SubLObjectFactory.makeInteger("2305843009213693951")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(62),
						(SubLObject) SubLObjectFactory.makeInteger("4611686018427387847")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(63),
						(SubLObject) SubLObjectFactory.makeInteger("9223372036854775783")),
				ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(64),
						(SubLObject) SubLObjectFactory.makeInteger("18446744073709551557")) });
		$sym84$CHECKSUM_SANITY_CHECK = SubLObjectFactory.makeSymbol("CHECKSUM-SANITY-CHECK");
		$kw85$TEST = SubLObjectFactory.makeKeyword("TEST");
		$kw86$OWNER = SubLObjectFactory.makeKeyword("OWNER");
		$kw87$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
		$kw88$KB = SubLObjectFactory.makeKeyword("KB");
		$kw89$TINY = SubLObjectFactory.makeKeyword("TINY");
		$kw90$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
		$list91 = ConsesLow
				.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.NIL, (SubLObject) number_utilities.T));
		$sym92$CHECKSUM_SETUP = SubLObjectFactory.makeSymbol("CHECKSUM-SETUP");
		$list93 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CHECKSUM-START"),
				(SubLObject) SubLObjectFactory.makeSymbol("CHECKSUM-RESUME"),
				(SubLObject) SubLObjectFactory.makeSymbol("WITH-CHECKSUM"));
		$list94 = ConsesLow.list(
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("SUM-INIT"),
						(SubLObject) SubLObjectFactory.makeSymbol("LENGTH-INIT")),
				(SubLObject) SubLObjectFactory.makeSymbol("&BODY"), (SubLObject) SubLObjectFactory.makeSymbol("BODY"));
		$sym95$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym96$_CHECKSUM_SUM_ = SubLObjectFactory.makeSymbol("*CHECKSUM-SUM*");
		$sym97$_CHECKSUM_LENGTH_ = SubLObjectFactory.makeSymbol("*CHECKSUM-LENGTH*");
		$list98 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("*CHECKSUM-INITIAL-VALUE-SUM*"),
				(SubLObject) SubLObjectFactory.makeSymbol("*CHECKSUM-INITIAL-VALUE-LENGTH*"));
		$list99 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("ACCUMULATORS")),
				(SubLObject) SubLObjectFactory.makeSymbol("&BODY"), (SubLObject) SubLObjectFactory.makeSymbol("BODY"));
		$sym100$CAR = SubLObjectFactory.makeSymbol("CAR");
		$list101 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CHECKSUM")),
				(SubLObject) SubLObjectFactory.makeSymbol("&BODY"), (SubLObject) SubLObjectFactory.makeSymbol("BODY"));
		$sym102$CHECKSUM_START = SubLObjectFactory.makeSymbol("CHECKSUM-START");
		$sym103$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
		$list104 = ConsesLow
				.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CHECKSUM-FINALIZE")));
		$kw105$BASE = SubLObjectFactory.makeKeyword("BASE");
		$str106$_X = SubLObjectFactory.makeString("~X");
		$str107$_A_is_not_a_positive_integer_grea = SubLObjectFactory
				.makeString("~A is not a positive integer greater than 1.");
		$sym108$FIND_SMALLEST_DIVISOR = SubLObjectFactory.makeSymbol("FIND-SMALLEST-DIVISOR");
		$list109 = ConsesLow.list(new SubLObject[] {
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TWO_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.THREE_INTEGER),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.FOUR_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.FIVE_INTEGER),
						(SubLObject) number_utilities.FIVE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.SIX_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.SEVEN_INTEGER),
						(SubLObject) number_utilities.SEVEN_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.EIGHT_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.NINE_INTEGER),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TEN_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.ELEVEN_INTEGER),
						(SubLObject) number_utilities.ELEVEN_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TWELVE_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.THIRTEEN_INTEGER),
						(SubLObject) number_utilities.THIRTEEN_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.FOURTEEN_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.FIFTEEN_INTEGER),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.SIXTEEN_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.SEVENTEEN_INTEGER),
						(SubLObject) number_utilities.SEVENTEEN_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.EIGHTEEN_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.NINETEEN_INTEGER),
						(SubLObject) number_utilities.NINETEEN_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TWENTY_INTEGER),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(21)),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(22)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(23)),
						(SubLObject) SubLObjectFactory.makeInteger(23)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(24)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(25)),
						(SubLObject) number_utilities.FIVE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(26)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(27)),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(28)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(29)),
						(SubLObject) SubLObjectFactory.makeInteger(29)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(30)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(31)),
						(SubLObject) SubLObjectFactory.makeInteger(31)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(32)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(33)),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(34)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(35)),
						(SubLObject) number_utilities.FIVE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(36)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(37)),
						(SubLObject) SubLObjectFactory.makeInteger(37)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(38)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(39)),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(40)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(41)),
						(SubLObject) SubLObjectFactory.makeInteger(41)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(42)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(43)),
						(SubLObject) SubLObjectFactory.makeInteger(43)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(44)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(45)),
						(SubLObject) number_utilities.THREE_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(46)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(47)),
						(SubLObject) SubLObjectFactory.makeInteger(47)),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(48)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(49)),
						(SubLObject) number_utilities.SEVEN_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(50)),
						(SubLObject) number_utilities.TWO_INTEGER),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(1225)),
						(SubLObject) number_utilities.FIVE_INTEGER) });
		$sym110$PRODUCT = SubLObjectFactory.makeSymbol("PRODUCT");
		$sym111$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
		$sym112$ABS = SubLObjectFactory.makeSymbol("ABS");
		$sym113$LCM2_INTERNAL = SubLObjectFactory.makeSymbol("LCM2-INTERNAL");
		$sym114$GCD2_INTERNAL = SubLObjectFactory.makeSymbol("GCD2-INTERNAL");
		$list115 = ConsesLow.list(new SubLObject[] {
				ConsesLow.list((SubLObject) Characters.CHAR_a, (SubLObject) number_utilities.TEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_A, (SubLObject) number_utilities.TEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_b, (SubLObject) number_utilities.ELEVEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_B, (SubLObject) number_utilities.ELEVEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_c, (SubLObject) number_utilities.TWELVE_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_C, (SubLObject) number_utilities.TWELVE_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_d, (SubLObject) number_utilities.THIRTEEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_D, (SubLObject) number_utilities.THIRTEEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_e, (SubLObject) number_utilities.FOURTEEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_E, (SubLObject) number_utilities.FOURTEEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_f, (SubLObject) number_utilities.FIFTEEN_INTEGER),
				ConsesLow.list((SubLObject) Characters.CHAR_F, (SubLObject) number_utilities.FIFTEEN_INTEGER) });
		$list116 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PROBABILITY"),
				(SubLObject) SubLObjectFactory.makeSymbol("&BODY"), (SubLObject) SubLObjectFactory.makeSymbol("BODY"));
		$sym117$PROB = SubLObjectFactory.makeUninternedSymbol("PROB");
		$sym118$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
		$list119 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PROBABILITY-P"));
		$sym120$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		$sym121$TRUE_WITH_PROBABILITY = SubLObjectFactory.makeSymbol("TRUE-WITH-PROBABILITY");
		$sym122$PROBABILITY_P = SubLObjectFactory.makeSymbol("PROBABILITY-P");
		$int123$1000 = SubLObjectFactory.makeInteger(1000);
		$float124$1_0e_5 = (SubLFloat) SubLObjectFactory.makeDouble(1.0E-5);
		$sym125$PROBABILITY_DISTRIBUTION_P = SubLObjectFactory.makeSymbol("PROBABILITY-DISTRIBUTION-P");
		$str126$Error_sampling_from__s____s__s_ = SubLObjectFactory.makeString("Error sampling from ~s: (~s ~s)");
		$sym127$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
		$sym128$FIBONACCI_MEMOIZED = SubLObjectFactory.makeSymbol("FIBONACCI-MEMOIZED");
		$sym129$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
		$list130 = (SubLList) ConsesLow.cons((SubLObject) SubLObjectFactory.makeSymbol("FIRST"),
				(SubLObject) SubLObjectFactory.makeSymbol("REST"));
		$str131$_s_must_be_____s = SubLObjectFactory.makeString("~s must be <= ~s");
		$list132 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PREV-X"),
				(SubLObject) SubLObjectFactory.makeSymbol("PREV-Y"));
		$list133 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CURR-X"),
				(SubLObject) SubLObjectFactory.makeSymbol("CURR-Y"));
		$sym134$SECOND = SubLObjectFactory.makeSymbol("SECOND");
		$int135$25 = SubLObjectFactory.makeInteger(25);
		$sym136$AVERAGE_NEIGHBORS = SubLObjectFactory.makeSymbol("AVERAGE-NEIGHBORS");
		$list137 = ConsesLow.list(
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(
								(SubLObject) number_utilities.ONE_INTEGER, (SubLObject) number_utilities.TWO_INTEGER,
								(SubLObject) number_utilities.THREE_INTEGER, (SubLObject) number_utilities.FOUR_INTEGER,
								(SubLObject) number_utilities.FIVE_INTEGER, (SubLObject) number_utilities.SIX_INTEGER),
								(SubLObject) number_utilities.THREE_INTEGER),
						(SubLObject) ConsesLow.list((SubLObject) number_utilities.ONE_INTEGER,
								(SubLObject) number_utilities.TWO_INTEGER, (SubLObject) number_utilities.THREE_INTEGER,
								(SubLObject) number_utilities.FOUR_INTEGER, (SubLObject) number_utilities.FIVE_INTEGER,
								(SubLObject) number_utilities.SIX_INTEGER)),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.list(
										new SubLObject[] { number_utilities.ONE_INTEGER, number_utilities.TWO_INTEGER,
												number_utilities.THREE_INTEGER, number_utilities.FOUR_INTEGER,
												number_utilities.FIVE_INTEGER, number_utilities.SIX_INTEGER,
												number_utilities.SEVEN_INTEGER, number_utilities.EIGHT_INTEGER,
												number_utilities.NINE_INTEGER, number_utilities.TEN_INTEGER }),
								(SubLObject) number_utilities.FIVE_INTEGER),
						(SubLObject) ConsesLow
								.list(new SubLObject[] { number_utilities.ONE_INTEGER, number_utilities.TWO_INTEGER,
										number_utilities.THREE_INTEGER, number_utilities.FOUR_INTEGER,
										number_utilities.FIVE_INTEGER, number_utilities.SIX_INTEGER,
										number_utilities.SEVEN_INTEGER, number_utilities.EIGHT_INTEGER,
										number_utilities.NINE_INTEGER, number_utilities.TEN_INTEGER })));
		$kw138$DELETED = SubLObjectFactory.makeKeyword("DELETED");
		$sym139$TEST_RENUMBER_ID_USING_TABLE = SubLObjectFactory.makeSymbol("TEST-RENUMBER-ID-USING-TABLE");
		$list140 = _constant_140_initializer();
		$str141$Original_id__A_was_supposed_to_ma = SubLObjectFactory
				.makeString("Original id ~A was supposed to map to ~A, but was renumbered to ~A.");
		$kw142$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
		$sym143$TRANSFORM_DELETE_LIST_TO_GAP_LIST = SubLObjectFactory.makeSymbol("TRANSFORM-DELETE-LIST-TO-GAP-LIST");
		$list144 = ConsesLow.list(
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(
								(SubLObject) number_utilities.TWO_INTEGER, (SubLObject) number_utilities.THREE_INTEGER,
								(SubLObject) number_utilities.FOUR_INTEGER, (SubLObject) number_utilities.FIVE_INTEGER,
								(SubLObject) number_utilities.EIGHT_INTEGER)),
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								(SubLObject) number_utilities.EIGHT_INTEGER)),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow
								.list(new SubLObject[] { number_utilities.TWO_INTEGER, number_utilities.THREE_INTEGER,
										number_utilities.FOUR_INTEGER, number_utilities.FIVE_INTEGER,
										number_utilities.EIGHT_INTEGER, number_utilities.ELEVEN_INTEGER,
										number_utilities.TWELVE_INTEGER, number_utilities.FOURTEEN_INTEGER,
										number_utilities.FIFTEEN_INTEGER, number_utilities.SIXTEEN_INTEGER })),
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								(SubLObject) number_utilities.EIGHT_INTEGER,
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.TWO_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.FOURTEEN_INTEGER,
										(SubLObject) number_utilities.THREE_INTEGER))),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow
								.list(new SubLObject[] { number_utilities.ZERO_INTEGER, number_utilities.TWO_INTEGER,
										number_utilities.THREE_INTEGER, number_utilities.ELEVEN_INTEGER,
										number_utilities.THIRTEEN_INTEGER, number_utilities.FOURTEEN_INTEGER,
										number_utilities.FIFTEEN_INTEGER, number_utilities.SIXTEEN_INTEGER,
										SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57),
										SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64),
										SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361),
										SubLObjectFactory.makeInteger(365), SubLObjectFactory.makeInteger(366),
										SubLObjectFactory.makeInteger(367), SubLObjectFactory.makeInteger(368),
										SubLObjectFactory.makeInteger(369), SubLObjectFactory.makeInteger(374),
										SubLObjectFactory.makeInteger(375), SubLObjectFactory.makeInteger(378),
										SubLObjectFactory.makeInteger(429), SubLObjectFactory.makeInteger(430),
										SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442),
										SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510),
										SubLObjectFactory.makeInteger(538), SubLObjectFactory.makeInteger(539),
										SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614),
										SubLObjectFactory.makeInteger(623), SubLObjectFactory.makeInteger(624),
										SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041),
										SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064),
										SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096),
										SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102),
										SubLObjectFactory.makeInteger(1146), SubLObjectFactory.makeInteger(1147),
										SubLObjectFactory.makeInteger(1150), SubLObjectFactory.makeInteger(1251),
										SubLObjectFactory.makeInteger(1252), SubLObjectFactory.makeInteger(1471),
										SubLObjectFactory.makeInteger(1475), SubLObjectFactory.makeInteger(1485) })),
						(SubLObject) ConsesLow.list(new SubLObject[] { number_utilities.ZERO_INTEGER,
								ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.TWO_INTEGER),
								number_utilities.ELEVEN_INTEGER,
								ConsesLow.cons((SubLObject) number_utilities.THIRTEEN_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57),
								SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64),
								SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(365),
										(SubLObject) number_utilities.FIVE_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(374),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(378),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(429),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442),
								SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(538),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(623),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041),
								SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064),
								SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096),
								SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1146),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(1150),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1251),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475),
								SubLObjectFactory.makeInteger(1485) })));
		$list145 = (SubLList) ConsesLow.cons((SubLObject) SubLObjectFactory.makeSymbol("START"),
				(SubLObject) SubLObjectFactory.makeSymbol("WIDTH"));
		$str146$Invalid_gap_list_format__Unclear_ = SubLObjectFactory
				.makeString("Invalid gap list format: Unclear what to do with element ~A.");
		$sym147$TRANSFORM_GAP_LIST_TO_DELTA_LIST = SubLObjectFactory.makeSymbol("TRANSFORM-GAP-LIST-TO-DELTA-LIST");
		$list148 = ConsesLow.list(
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								(SubLObject) number_utilities.EIGHT_INTEGER,
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.TWO_INTEGER))),
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.EIGHT_INTEGER,
										(SubLObject) number_utilities.FIVE_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.SEVEN_INTEGER))),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								(SubLObject) number_utilities.EIGHT_INTEGER,
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.TWO_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.FOURTEEN_INTEGER,
										(SubLObject) number_utilities.THREE_INTEGER))),
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.EIGHT_INTEGER,
										(SubLObject) number_utilities.FIVE_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.SEVEN_INTEGER),
								(SubLObject) ConsesLow.cons((SubLObject) number_utilities.FOURTEEN_INTEGER,
										(SubLObject) number_utilities.TEN_INTEGER))),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(new SubLObject[] {
								number_utilities.ZERO_INTEGER,
								ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.TWO_INTEGER),
								number_utilities.ELEVEN_INTEGER,
								ConsesLow.cons((SubLObject) number_utilities.THIRTEEN_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(57),
								SubLObjectFactory.makeInteger(59), SubLObjectFactory.makeInteger(64),
								SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeInteger(361),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(365),
										(SubLObject) number_utilities.FIVE_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(374),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(378),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(429),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(436), SubLObjectFactory.makeInteger(442),
								SubLObjectFactory.makeInteger(473), SubLObjectFactory.makeInteger(510),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(538),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(555), SubLObjectFactory.makeInteger(614),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(623),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(643), SubLObjectFactory.makeInteger(1041),
								SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(1064),
								SubLObjectFactory.makeInteger(1092), SubLObjectFactory.makeInteger(1096),
								SubLObjectFactory.makeInteger(1098), SubLObjectFactory.makeInteger(1102),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1146),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(1150),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1251),
										(SubLObject) number_utilities.TWO_INTEGER),
								SubLObjectFactory.makeInteger(1471), SubLObjectFactory.makeInteger(1475),
								SubLObjectFactory.makeInteger(1485) })),
						(SubLObject) ConsesLow.list(new SubLObject[] {
								ConsesLow.cons((SubLObject) number_utilities.ZERO_INTEGER,
										(SubLObject) number_utilities.ONE_INTEGER),
								ConsesLow.cons((SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.THREE_INTEGER),
								ConsesLow.cons((SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER),
								ConsesLow.cons((SubLObject) number_utilities.THIRTEEN_INTEGER,
										(SubLObject) number_utilities.EIGHT_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(27),
										(SubLObject) number_utilities.NINE_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(57),
										(SubLObject) number_utilities.TEN_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(59),
										(SubLObject) number_utilities.ELEVEN_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(64),
										(SubLObject) number_utilities.TWELVE_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(250),
										(SubLObject) number_utilities.THIRTEEN_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(361),
										(SubLObject) number_utilities.FOURTEEN_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(365),
										(SubLObject) number_utilities.NINETEEN_INTEGER),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(374),
										(SubLObject) SubLObjectFactory.makeInteger(21)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(378),
										(SubLObject) SubLObjectFactory.makeInteger(22)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(429),
										(SubLObject) SubLObjectFactory.makeInteger(24)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(436),
										(SubLObject) SubLObjectFactory.makeInteger(25)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(442),
										(SubLObject) SubLObjectFactory.makeInteger(26)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(473),
										(SubLObject) SubLObjectFactory.makeInteger(27)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(510),
										(SubLObject) SubLObjectFactory.makeInteger(28)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(538),
										(SubLObject) SubLObjectFactory.makeInteger(30)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(555),
										(SubLObject) SubLObjectFactory.makeInteger(31)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(614),
										(SubLObject) SubLObjectFactory.makeInteger(32)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(623),
										(SubLObject) SubLObjectFactory.makeInteger(34)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(643),
										(SubLObject) SubLObjectFactory.makeInteger(35)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1041),
										(SubLObject) SubLObjectFactory.makeInteger(36)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1062),
										(SubLObject) SubLObjectFactory.makeInteger(37)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1064),
										(SubLObject) SubLObjectFactory.makeInteger(38)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1092),
										(SubLObject) SubLObjectFactory.makeInteger(39)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1096),
										(SubLObject) SubLObjectFactory.makeInteger(40)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1098),
										(SubLObject) SubLObjectFactory.makeInteger(41)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1102),
										(SubLObject) SubLObjectFactory.makeInteger(42)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1146),
										(SubLObject) SubLObjectFactory.makeInteger(44)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1150),
										(SubLObject) SubLObjectFactory.makeInteger(45)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1251),
										(SubLObject) SubLObjectFactory.makeInteger(47)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1471),
										(SubLObject) SubLObjectFactory.makeInteger(48)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1475),
										(SubLObject) SubLObjectFactory.makeInteger(49)),
								ConsesLow.cons((SubLObject) SubLObjectFactory.makeInteger(1485),
										(SubLObject) SubLObjectFactory.makeInteger(50)) })));
		$sym149$TEST_RENUMBER_ID_USING_DELTA_TABLE = SubLObjectFactory.makeSymbol("TEST-RENUMBER-ID-USING-DELTA-TABLE");
		$str150$ID__A_should_have_been_deleted_bu = SubLObjectFactory
				.makeString("ID ~A should have been deleted but was renumbered to ~A.");
		$sym151$PRIME_NUMBER_ = SubLObjectFactory.makeSymbol("PRIME-NUMBER?");
		$list152 = ConsesLow.list(new SubLObject[] {
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeString("foo")),
						(SubLObject) number_utilities.NIL),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.MINUS_ONE_INTEGER),
						(SubLObject) number_utilities.NIL),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.ZERO_INTEGER),
						(SubLObject) number_utilities.NIL),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.ONE_INTEGER),
						(SubLObject) number_utilities.NIL),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TWO_INTEGER),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.THREE_INTEGER),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.FOUR_INTEGER),
						(SubLObject) number_utilities.NIL),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4001)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4003)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4007)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4013)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4019)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4021)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4027)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4049)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4051)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4057)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4073)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4079)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4091)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4093)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4099)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4111)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4127)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4129)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4133)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4139)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4153)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4157)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4159)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4177)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4201)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4211)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4217)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4219)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4229)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4231)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(4241)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(5861)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(5867)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(5869)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(5879)),
						(SubLObject) number_utilities.T),
				ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(5881)),
						(SubLObject) number_utilities.T) });
		$list153 = ConsesLow.list((SubLObject) ConsesLow.list(
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(175)),
				(SubLObject) number_utilities.FIVE_INTEGER));
		$sym154$MEDIAN = SubLObjectFactory.makeSymbol("MEDIAN");
		$list155 = ConsesLow.list(
				(SubLObject) ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) ConsesLow.list(
						(SubLObject) number_utilities.ONE_INTEGER, (SubLObject) number_utilities.TWO_INTEGER,
						(SubLObject) number_utilities.THREE_INTEGER)), (SubLObject) number_utilities.TWO_INTEGER),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow
								.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.ONE_INTEGER,
										(SubLObject) number_utilities.TWO_INTEGER,
										(SubLObject) number_utilities.THREE_INTEGER,
										(SubLObject) number_utilities.FOUR_INTEGER)),
						(SubLObject) SubLObjectFactory.makeDouble(2.5)),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.list((SubLObject) Characters.CHAR_a,
										(SubLObject) Characters.CHAR_b, (SubLObject) Characters.CHAR_c),
								(SubLObject) SubLObjectFactory.makeSymbol("CHAR-CODE"),
								(SubLObject) SubLObjectFactory.makeKeyword("ITEM")),
						(SubLObject) Characters.CHAR_b));
		$sym156$COMPUTE_DELTAS = SubLObjectFactory.makeSymbol("COMPUTE-DELTAS");
		$list157 = ConsesLow.list(
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow
								.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TEN_INTEGER,
										(SubLObject) number_utilities.ELEVEN_INTEGER,
										(SubLObject) number_utilities.THIRTEEN_INTEGER)),
						(SubLObject) ConsesLow.list((SubLObject) number_utilities.ONE_INTEGER,
								(SubLObject) number_utilities.TWO_INTEGER)),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow
								.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TEN_INTEGER,
										(SubLObject) number_utilities.ELEVEN_INTEGER)),
						(SubLObject) ConsesLow.list((SubLObject) number_utilities.ONE_INTEGER)),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow
								.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TEN_INTEGER)),
						(SubLObject) number_utilities.NIL),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow
								.list((SubLObject) ConsesLow.list((SubLObject) number_utilities.TEN_INTEGER,
										(SubLObject) number_utilities.EIGHT_INTEGER,
										(SubLObject) number_utilities.ELEVEN_INTEGER)),
						(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(-2),
								(SubLObject) number_utilities.THREE_INTEGER)),
				(SubLObject) ConsesLow.list(
						(SubLObject) ConsesLow.list(
								(SubLObject) ConsesLow.list((SubLObject) number_utilities.TEN_INTEGER,
										(SubLObject) number_utilities.EIGHT_INTEGER),
								(SubLObject) number_utilities.ELEVEN_INTEGER),
						(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(-2),
								(SubLObject) number_utilities.THREE_INTEGER)));
	}
}
