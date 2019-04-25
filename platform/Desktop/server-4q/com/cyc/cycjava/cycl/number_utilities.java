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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class number_utilities
    extends
      SubLTranslatedFile
{
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
  public static SubLObject f_1X(final SubLObject number)
  {
    return Numbers.add( number, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 801L)
  public static SubLObject f_1_(final SubLObject number)
  {
    return Numbers.subtract( number, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 893L)
  public static SubLObject f_2X(final SubLObject number)
  {
    return Numbers.add( number, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 990L)
  public static SubLObject onep(final SubLObject v_object)
  {
    return Equality.eql( ONE_INTEGER, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1239L)
  public static SubLObject encode_boolean(final SubLObject v_object)
  {
    return ( NIL != v_object ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1338L)
  public static SubLObject decode_boolean(final SubLObject integer)
  {
    return makeBoolean( !integer.isZero() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1482L)
  public static SubLObject get_bit(final SubLObject bits, final SubLObject bit_number)
  {
    return decode_boolean( bytes.ldb( bytes.sublisp_byte( ONE_INTEGER, bit_number ), bits ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1634L)
  public static SubLObject set_bit(final SubLObject bits, final SubLObject bit_number, SubLObject v_boolean)
  {
    if( v_boolean == UNPROVIDED )
    {
      v_boolean = T;
    }
    return bytes.dpb( encode_boolean( v_boolean ), bytes.sublisp_byte( ONE_INTEGER, bit_number ), bits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 1812L)
  public static SubLObject clear_bit(final SubLObject bits, final SubLObject bit_number)
  {
    return set_bit( bits, bit_number, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2208L)
  public static SubLObject div(final SubLObject number, final SubLObject divisor)
  {
    assert NIL != Types.numberp( number ) : number;
    assert NIL != Types.numberp( divisor ) : divisor;
    return Numbers.integerDivide( number, divisor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2337L)
  public static SubLObject safe_X(final SubLObject number, final SubLObject divisor)
  {
    return ( NIL == non_zero_number_p( divisor ) ) ? ZERO_INTEGER : ( number.isNumber() ? Numbers.divide( number, divisor ) : ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2499L)
  public static SubLObject square(final SubLObject number)
  {
    assert NIL != Types.numberp( number ) : number;
    return Numbers.multiply( number, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2644L)
  public static SubLObject cube(final SubLObject number)
  {
    assert NIL != Types.numberp( number ) : number;
    return Numbers.expt( number, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2785L)
  public static SubLObject cubert(final SubLObject number)
  {
    assert NIL != Types.numberp( number ) : number;
    return Numbers.expt( number, Numbers.divide( ONE_INTEGER, THREE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 2914L)
  public static SubLObject bytep(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( v_object.isInteger() && ZERO_INTEGER.numLE( v_object ) && v_object.numL( $int4$256 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3070L)
  public static SubLObject nil_or_integer_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || v_object.isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3243L)
  public static SubLObject possibly_positive_integer_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || NIL != subl_promotions.positive_integer_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3460L)
  public static SubLObject list_of_integer_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !subobject.isInteger() )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3666L)
  public static SubLObject list_of_positive_integer_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == subl_promotions.positive_integer_p( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 3891L)
  public static SubLObject list_of_negative_integer_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == subl_promotions.negative_integer_p( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4116L)
  public static SubLObject list_of_non_negative_integer_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == subl_promotions.non_negative_integer_p( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4349L)
  public static SubLObject list_of_non_positive_integer_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == subl_promotions.non_positive_integer_p( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4582L)
  public static SubLObject positive_number_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && v_object.isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4724L)
  public static SubLObject non_negative_number_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && !v_object.isNegative() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 4867L)
  public static SubLObject non_positive_number_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && !v_object.isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5009L)
  public static SubLObject negative_number_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && v_object.isNegative() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5140L)
  public static SubLObject zero_number_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw9$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym10$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          result = Numbers.zerop( v_object );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw9$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5333L)
  public static SubLObject non_zero_number_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && !v_object.isZero() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5488L)
  public static SubLObject probability_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( v_object.isNumber() && ZERO_INTEGER.numLE( v_object ) && v_object.numLE( ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5659L)
  public static SubLObject percentile_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( v_object.isNumber() && ZERO_INTEGER.numLE( v_object ) && v_object.numL( ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 5845L)
  public static SubLObject decimal_integer_length(SubLObject integer)
  {
    assert NIL != Types.integerp( integer ) : integer;
    SubLObject length;
    for( length = ZERO_INTEGER; !integer.isZero(); integer = Numbers.integerDivide( integer, TEN_INTEGER ), length = Numbers.add( length, ONE_INTEGER ) )
    {
    }
    return length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 6352L)
  public static SubLObject significant_digits(final SubLObject number, final SubLObject digits)
  {
    assert NIL != extended_potentially_infinite_number_p( number ) : number;
    enforceType( digits, $sym13$POSITIVE_INTEGER_P );
    if( NIL != infinite_number_p( number ) )
    {
      return number;
    }
    if( NIL != scientific_numbers.scientific_number_p( number ) )
    {
      return scientific_number_utilities.scientific_number_significant_digits( number, digits );
    }
    if( number.isZero() )
    {
      return ZERO_INTEGER;
    }
    if( number.isNegative() )
    {
      return Numbers.minus( significant_digits( Numbers.minus( number ), digits ) );
    }
    if( number.isInteger() && digits.numGE( decimal_integer_length( number ) ) )
    {
      return number;
    }
    if( number.isDouble() && digits.numGE( $maximum_float_significant_digits$.getGlobalValue() ) )
    {
      return number;
    }
    if( NIL != extended_numbers.include_fractions_in_extended_numbersP() && NIL != collection_defns.fractionP( number, UNPROVIDED ) )
    {
      return significant_digits( math_expression_utilities.fraction_from_el( number ), digits );
    }
    if( NIL != extended_numbers.include_fractions_in_extended_numbersP() && NIL != fraction_utilities.fraction_p( number ) )
    {
      return significant_digits( fraction_utilities.defractionify( number ), digits );
    }
    final SubLObject normalization_power = Numbers.floor( Numbers.log( number, TEN_INTEGER ), UNPROVIDED );
    final SubLObject normalization_ratio = Numbers.expt( TEN_INTEGER, normalization_power );
    final SubLObject normalized_number = Numbers.divide( number, normalization_ratio );
    final SubLObject significant_ratio = Numbers.expt( TEN_INTEGER, Numbers.subtract( digits, ONE_INTEGER ) );
    final SubLObject scaled_normalized = Numbers.multiply( normalized_number, significant_ratio );
    final SubLObject scaled_significant = Numbers.round( scaled_normalized, UNPROVIDED );
    final SubLObject normalized_significant = Numbers.divide( scaled_significant, significant_ratio );
    SubLObject significant = Numbers.multiply( normalized_significant, normalization_ratio );
    if( number.isInteger() )
    {
      final SubLObject unnormalization_power = Numbers.subtract( normalization_power, Numbers.subtract( digits, ONE_INTEGER ) );
      final SubLObject unnormalization_ratio = Numbers.expt( TEN_INTEGER, unnormalization_power );
      significant = Numbers.multiply( scaled_significant, unnormalization_ratio );
    }
    if( significant.isDouble() && number.numGE( Numbers.$most_negative_fixnum$.getGlobalValue() ) && number.numLE( Numbers.$most_positive_fixnum$.getGlobalValue() ) )
    {
      final SubLObject nearest_integer = Numbers.round( significant, UNPROVIDED );
      if( nearest_integer.numE( significant ) )
      {
        significant = nearest_integer;
      }
    }
    if( significant.isDouble() )
    {
      significant = significant_digits_optimize_float( significant );
    }
    return significant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 9047L)
  public static SubLObject four_significant_digits(final SubLObject number)
  {
    return significant_digits( number, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 9148L)
  public static SubLObject significant_digits_optimize_float(final SubLObject v_float)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject significand = Numbers.integer_decode_float( v_float );
    final SubLObject exponent = thread.secondMultipleValue();
    final SubLObject sign = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject tersest_length = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject tersest_float = NIL;
    SubLObject cdolist_list_var = $list14;
    SubLObject delta = NIL;
    delta = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject candidate_significand = Numbers.add( significand, delta );
      final SubLObject candidate_float = Numbers.multiply( sign, Numbers.scale_float( Numbers.sublisp_float( candidate_significand, v_float ), exponent ) );
      final SubLObject candidate_length = Sequences.length( print_high.prin1_to_string( candidate_float ) );
      if( candidate_length.numL( tersest_length ) )
      {
        tersest_length = candidate_length;
        tersest_float = candidate_float;
      }
      cdolist_list_var = cdolist_list_var.rest();
      delta = cdolist_list_var.first();
    }
    return tersest_float;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 9845L)
  public static SubLObject float_n(final SubLObject num, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = FOUR_INTEGER;
    }
    final SubLObject base = Numbers.expt( TEN_INTEGER, n );
    return Numbers.sublisp_float( Numbers.divide( Numbers.round( Numbers.multiply( num, base ), UNPROVIDED ), base ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10034L)
  public static SubLObject round_up_to_the_nearest(final SubLObject x, final SubLObject n)
  {
    return Numbers.multiply( Numbers.ceiling( Numbers.divide( x, n ), UNPROVIDED ), n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10113L)
  public static SubLObject round_to_the_nearest(final SubLObject x, final SubLObject n)
  {
    return Numbers.multiply( Numbers.round( Numbers.divide( x, n ), UNPROVIDED ), n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10187L)
  public static SubLObject round_down_to_the_nearest(final SubLObject x, final SubLObject n)
  {
    return Numbers.multiply( Numbers.floor( Numbers.divide( x, n ), UNPROVIDED ), n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10267L)
  public static SubLObject greater_absP(final SubLObject num1, final SubLObject num2)
  {
    return Numbers.numG( Numbers.abs( num1 ), Numbers.abs( num2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10337L)
  public static SubLObject divides_evenly(final SubLObject number, final SubLObject divisor)
  {
    assert NIL != Types.numberp( number ) : number;
    assert NIL != Types.numberp( divisor ) : divisor;
    return Numbers.numE( Numbers.mod( number, divisor ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10475L)
  public static SubLObject integer_percent(final SubLObject numerator, SubLObject denominator, SubLObject roundP)
  {
    if( denominator == UNPROVIDED )
    {
      denominator = ONE_INTEGER;
    }
    if( roundP == UNPROVIDED )
    {
      roundP = NIL;
    }
    final SubLObject raw = Numbers.multiply( numerator, $int15$100 );
    return Values.values( ( NIL != roundP ) ? Numbers.round( raw, denominator ) : Numbers.truncate( raw, denominator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 10813L)
  public static SubLObject safe_percent(final SubLObject numerator, SubLObject denominator, SubLObject significant_digits)
  {
    if( denominator == UNPROVIDED )
    {
      denominator = ONE_INTEGER;
    }
    if( significant_digits == UNPROVIDED )
    {
      significant_digits = NIL;
    }
    if( denominator.isZero() || NIL == denominator || NIL == numerator )
    {
      return ZERO_INTEGER;
    }
    return percent( numerator, denominator, significant_digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11050L)
  public static SubLObject percent(final SubLObject numerator, SubLObject denominator, SubLObject significant_digits)
  {
    if( denominator == UNPROVIDED )
    {
      denominator = ONE_INTEGER;
    }
    if( significant_digits == UNPROVIDED )
    {
      significant_digits = NIL;
    }
    SubLObject result = Numbers.multiply( $int15$100, Numbers.divide( numerator, denominator ) );
    if( NIL != significant_digits )
    {
      result = significant_digits( result, significant_digits );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11405L)
  public static SubLObject percentage_p(final SubLObject v_object)
  {
    return collection_defns.cyc_real_0_100( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11476L)
  public static SubLObject percentage_to_probability(final SubLObject percentage)
  {
    return Numbers.divide( percentage, $int15$100 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11559L)
  public static SubLObject percent_increase(final SubLObject old, final SubLObject v_new)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !v_new.numGE( old ) )
    {
      Errors.error( $str16$NEW_must_be_larger_than_OLD );
    }
    return percent( f_1_( Numbers.divide( v_new, old ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11690L)
  public static SubLObject percent_decrease(final SubLObject old, final SubLObject v_new)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !v_new.numLE( old ) )
    {
      Errors.error( $str17$NEW_must_be_smaller_than_OLD );
    }
    return percent( Numbers.minus( f_1_( Numbers.divide( v_new, old ) ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11826L)
  public static SubLObject percent_faster(final SubLObject old_time, final SubLObject new_time)
  {
    return percent_decrease( old_time, new_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 11923L)
  public static SubLObject percent_slower(final SubLObject old_time, final SubLObject new_time)
  {
    return percent_increase( old_time, new_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12020L)
  public static SubLObject log10(final SubLObject number)
  {
    return Numbers.log( number, TEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12119L)
  public static SubLObject log2(final SubLObject number)
  {
    return Numbers.log( number, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12215L)
  public static SubLObject expt10(final SubLObject number)
  {
    return Numbers.expt( TEN_INTEGER, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12314L)
  public static SubLObject potentially_infinite_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( v_object.isNumber() || NIL != infinite_number_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12635L)
  public static SubLObject negative_infinity()
  {
    return $kw18$NEGATIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12700L)
  public static SubLObject positive_infinity()
  {
    return $kw19$POSITIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12765L)
  public static SubLObject negative_infinity_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, $kw18$NEGATIVE_INFINITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12871L)
  public static SubLObject positive_infinity_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, $kw19$POSITIVE_INFINITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 12977L)
  public static SubLObject infinite_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != negative_infinity_p( v_object ) || NIL != positive_infinity_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13098L)
  public static SubLObject negative_potentially_infinite_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != negative_infinity_p( v_object ) || NIL != negative_number_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13259L)
  public static SubLObject positive_potentially_infinite_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != positive_infinity_p( v_object ) || NIL != positive_number_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13420L)
  public static SubLObject non_negative_potentially_infinite_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != positive_infinity_p( v_object ) || NIL != non_negative_number_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13589L)
  public static SubLObject potentially_infinite_number_E(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    return Equality.eql( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 13793L)
  public static SubLObject potentially_infinite_number_L(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != negative_infinity_p( num1 ) )
    {
      return makeBoolean( NIL == negative_infinity_p( num2 ) );
    }
    if( NIL != negative_infinity_p( num2 ) )
    {
      return NIL;
    }
    if( NIL != positive_infinity_p( num2 ) )
    {
      return makeBoolean( NIL == positive_infinity_p( num1 ) );
    }
    if( NIL != positive_infinity_p( num1 ) )
    {
      return NIL;
    }
    return Numbers.numL( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14246L)
  public static SubLObject potentially_infinite_number_G(final SubLObject num1, final SubLObject num2)
  {
    return potentially_infinite_number_L( num2, num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14376L)
  public static SubLObject potentially_infinite_number_LE(final SubLObject num1, final SubLObject num2)
  {
    return SubLObjectFactory.makeBoolean( NIL != potentially_infinite_number_E( num1, num2 ) || NIL != potentially_infinite_number_L( num1, num2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14560L)
  public static SubLObject potentially_infinite_number_GE(final SubLObject num1, final SubLObject num2)
  {
    return SubLObjectFactory.makeBoolean( NIL != potentially_infinite_number_E( num1, num2 ) || NIL != potentially_infinite_number_G( num1, num2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 14744L)
  public static SubLObject potentially_infinite_number_plus(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != negative_infinity_p( num1 ) )
    {
      return negative_infinity_plus( num2 );
    }
    if( NIL != negative_infinity_p( num2 ) )
    {
      return negative_infinity_plus( num1 );
    }
    if( NIL != positive_infinity_p( num1 ) )
    {
      return positive_infinity_plus( num2 );
    }
    if( NIL != positive_infinity_p( num2 ) )
    {
      return positive_infinity_plus( num1 );
    }
    return Numbers.add( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 15378L)
  public static SubLObject potentially_infinite_number_minus(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != negative_infinity_p( num1 ) )
    {
      return negative_infinity_minus( num2 );
    }
    if( NIL != negative_infinity_p( num2 ) )
    {
      return negative_infinity_minus( num1 );
    }
    if( NIL != positive_infinity_p( num1 ) )
    {
      return positive_infinity_minus( num2 );
    }
    if( NIL != positive_infinity_p( num2 ) )
    {
      return positive_infinity_minus( num1 );
    }
    return Numbers.subtract( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 15904L)
  public static SubLObject potentially_infinite_number_times(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != negative_infinity_p( num1 ) )
    {
      return negative_infinity_times( num2 );
    }
    if( NIL != negative_infinity_p( num2 ) )
    {
      return negative_infinity_times( num1 );
    }
    if( NIL != positive_infinity_p( num1 ) )
    {
      return positive_infinity_times( num2 );
    }
    if( NIL != positive_infinity_p( num2 ) )
    {
      return positive_infinity_times( num1 );
    }
    return Numbers.multiply( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 16543L)
  public static SubLObject potentially_infinite_number_divided_by(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != zero_number_p( num2 ) )
    {
      if( NIL != negative_potentially_infinite_number_p( num1 ) )
      {
        return $kw18$NEGATIVE_INFINITY;
      }
      if( NIL != positive_potentially_infinite_number_p( num1 ) )
      {
        return $kw19$POSITIVE_INFINITY;
      }
      if( ZERO_INTEGER.eql( num1 ) )
      {
        Errors.error( $str21$Can_t_divide_zero_by_zero );
      }
      return NIL;
    }
    else
    {
      if( NIL != negative_infinity_p( num1 ) )
      {
        return negative_infinity_X( num2 );
      }
      if( NIL != negative_infinity_p( num2 ) )
      {
        return divided_by_negative_infinity( num1 );
      }
      if( NIL != positive_infinity_p( num1 ) )
      {
        return positive_infinity_X( num2 );
      }
      if( NIL != positive_infinity_p( num2 ) )
      {
        return divided_by_positive_infinity( num1 );
      }
      return Numbers.divide( num1, num2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 17545L)
  public static SubLObject potentially_infinite_number_max(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != potentially_infinite_number_G( num1, num2 ) )
    {
      return num1;
    }
    return num2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 18044L)
  public static SubLObject potentially_infinite_number_min(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_number_p( num1 ) : num1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    if( NIL != potentially_infinite_number_L( num1, num2 ) )
    {
      return num1;
    }
    return num2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 18543L)
  public static SubLObject potentially_infinite_number_log(final SubLObject num, SubLObject base)
  {
    if( base == UNPROVIDED )
    {
      base = $e$.getGlobalValue();
    }
    assert NIL != non_negative_potentially_infinite_number_p( num ) : num;
    if( ZERO_INTEGER.eql( num ) )
    {
      return negative_infinity();
    }
    if( NIL != positive_infinity_p( num ) )
    {
      return positive_infinity();
    }
    return Numbers.log( num, base );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 18922L)
  public static SubLObject potentially_infinite_number_exp(final SubLObject num)
  {
    assert NIL != potentially_infinite_number_p( num ) : num;
    if( NIL != negative_infinity_p( num ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != positive_infinity_p( num ) )
    {
      return positive_infinity();
    }
    return Numbers.exp( num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 19245L)
  public static SubLObject negative_infinity_plus(final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != positive_infinity_p( num ) )
    {
      Errors.error( $str23$Can_t_add_positive_infinity_and_n );
    }
    return $kw18$NEGATIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 19528L)
  public static SubLObject positive_infinity_plus(final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != negative_infinity_p( num ) )
    {
      Errors.error( $str23$Can_t_add_positive_infinity_and_n );
    }
    return $kw19$POSITIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 19797L)
  public static SubLObject negative_infinity_minus(final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != negative_infinity_p( num ) )
    {
      Errors.error( $str24$Can_t_subtract_negative_infinity_ );
    }
    return $kw18$NEGATIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 20062L)
  public static SubLObject positive_infinity_minus(final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != positive_infinity_p( num ) )
    {
      Errors.error( $str25$Can_t_subtract_positive_infinity_ );
    }
    return $kw19$POSITIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 20327L)
  public static SubLObject negative_infinity_times(final SubLObject num)
  {
    if( NIL != negative_potentially_infinite_number_p( num ) )
    {
      return $kw19$POSITIVE_INFINITY;
    }
    if( NIL != zero_number_p( num ) )
    {
      Errors.error( $str26$Can_t_multiply_infinity_and_zero );
      return NIL;
    }
    return $kw18$NEGATIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 20735L)
  public static SubLObject positive_infinity_times(final SubLObject num)
  {
    if( NIL != negative_potentially_infinite_number_p( num ) )
    {
      return $kw18$NEGATIVE_INFINITY;
    }
    if( ZERO_INTEGER.eql( num ) )
    {
      Errors.error( $str26$Can_t_multiply_infinity_and_zero );
      return NIL;
    }
    return $kw19$POSITIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 21135L)
  public static SubLObject negative_infinity_X(final SubLObject num)
  {
    if( NIL != negative_infinity_p( num ) )
    {
      Errors.error( $str27$Can_t_divide_negative_infinity_by );
    }
    else
    {
      if( NIL == positive_infinity_p( num ) )
      {
        return negative_infinity_times( num );
      }
      Errors.error( $str28$Can_t_divide_negative_infinity_by );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 21549L)
  public static SubLObject positive_infinity_X(final SubLObject num)
  {
    if( NIL != negative_infinity_p( num ) )
    {
      Errors.error( $str29$Can_t_divide_positive_infinity_by );
    }
    else
    {
      if( NIL == positive_infinity_p( num ) )
      {
        return positive_infinity_times( num );
      }
      Errors.error( $str30$Can_t_divide_positive_infinity_by );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 21963L)
  public static SubLObject divided_by_negative_infinity(final SubLObject num)
  {
    if( NIL != negative_infinity_p( num ) )
    {
      Errors.error( $str27$Can_t_divide_negative_infinity_by );
    }
    else
    {
      if( NIL == positive_infinity_p( num ) )
      {
        return ZERO_INTEGER;
      }
      Errors.error( $str29$Can_t_divide_positive_infinity_by );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 22270L)
  public static SubLObject divided_by_positive_infinity(final SubLObject num)
  {
    if( NIL != negative_infinity_p( num ) )
    {
      Errors.error( $str28$Can_t_divide_negative_infinity_by );
    }
    else
    {
      if( NIL == positive_infinity_p( num ) )
      {
        return ZERO_INTEGER;
      }
      Errors.error( $str30$Can_t_divide_positive_infinity_by );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 22577L)
  public static SubLObject extended_potentially_infinite_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != extended_numbers.extended_number_p( v_object ) || NIL != infinite_number_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 22842L)
  public static SubLObject potentially_infinite_integer_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( v_object.isInteger() || NIL != infinite_integer_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23169L)
  public static SubLObject infinite_integer_p(final SubLObject v_object)
  {
    return infinite_number_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23249L)
  public static SubLObject negative_potentially_infinite_integer_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != negative_infinity_p( v_object ) || NIL != subl_promotions.negative_integer_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23412L)
  public static SubLObject positive_potentially_infinite_integer_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != positive_infinity_p( v_object ) || NIL != subl_promotions.positive_integer_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23575L)
  public static SubLObject potentially_infinite_integer_E(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_integer_p( int2 ) : int2;
    return Equality.eql( int1, int2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 23782L)
  public static SubLObject potentially_infinite_integer_L(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_integer_p( int2 ) : int2;
    return potentially_infinite_number_L( int1, int2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24015L)
  public static SubLObject potentially_infinite_integer_G(final SubLObject int1, final SubLObject int2)
  {
    return potentially_infinite_integer_L( int2, int1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24147L)
  public static SubLObject potentially_infinite_integer_LE(final SubLObject int1, final SubLObject int2)
  {
    return SubLObjectFactory.makeBoolean( NIL != potentially_infinite_integer_E( int1, int2 ) || NIL != potentially_infinite_integer_L( int1, int2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24334L)
  public static SubLObject potentially_infinite_integer_GE(final SubLObject int1, final SubLObject int2)
  {
    return SubLObjectFactory.makeBoolean( NIL != potentially_infinite_integer_E( int1, int2 ) || NIL != potentially_infinite_integer_G( int1, int2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24521L)
  public static SubLObject potentially_infinite_integer_plus(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_integer_p( int2 ) : int2;
    return potentially_infinite_number_plus( int1, int2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 24936L)
  public static SubLObject potentially_infinite_integer_minus(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_integer_p( int2 ) : int2;
    return potentially_infinite_number_minus( int1, int2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 25242L)
  public static SubLObject potentially_infinite_integer_times(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_integer_p( int2 ) : int2;
    return potentially_infinite_number_times( int1, int2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 25661L)
  public static SubLObject potentially_infinite_integer_times_number_rounded(final SubLObject int1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    final SubLObject raw_product = potentially_infinite_number_times( int1, num2 );
    if( NIL != infinite_number_p( raw_product ) )
    {
      return raw_product;
    }
    return Numbers.truncate( raw_product, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 26086L)
  public static SubLObject potentially_infinite_integer_divided_by(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_integer_p( int2 ) : int2;
    return potentially_infinite_number_divided_by( int1, int2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 26516L)
  public static SubLObject potentially_infinite_integer_divided_by_number_rounded(final SubLObject int1, final SubLObject num2)
  {
    assert NIL != potentially_infinite_integer_p( int1 ) : int1;
    assert NIL != potentially_infinite_number_p( num2 ) : num2;
    final SubLObject raw_product = potentially_infinite_number_divided_by( int1, num2 );
    if( NIL != infinite_number_p( raw_product ) )
    {
      return raw_product;
    }
    return Numbers.truncate( raw_product, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 26951L)
  public static SubLObject potentially_undefined_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != potentially_infinite_number_p( v_object ) || NIL != undefined( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 27380L)
  public static SubLObject undefined(final SubLObject v_object)
  {
    return Equality.eq( v_object, $kw32$UNDEFINED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 27468L)
  public static SubLObject potentially_undefined_number_E(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_E( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 27791L)
  public static SubLObject potentially_undefined_number_L(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_L( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28114L)
  public static SubLObject potentially_undefined_number_G(final SubLObject num1, final SubLObject num2)
  {
    return potentially_undefined_number_L( num2, num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28259L)
  public static SubLObject potentially_undefined_number_LE(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_LE( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28584L)
  public static SubLObject potentially_undefined_number_GE(final SubLObject num1, final SubLObject num2)
  {
    return potentially_undefined_number_LE( num2, num1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 28731L)
  public static SubLObject potentially_undefined_number_plus(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_plus( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 29183L)
  public static SubLObject potentially_undefined_number_minus(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_minus( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 29523L)
  public static SubLObject potentially_undefined_number_times(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_times( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 29977L)
  public static SubLObject potentially_undefined_number_divided_by(final SubLObject num1, final SubLObject num2)
  {
    assert NIL != potentially_undefined_number_p( num1 ) : num1;
    assert NIL != potentially_undefined_number_p( num2 ) : num2;
    if( NIL != undefined( num1 ) || NIL != undefined( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    if( NIL != zero_number_p( num1 ) && NIL != zero_number_p( num2 ) )
    {
      return $kw32$UNDEFINED;
    }
    return potentially_infinite_number_divided_by( num1, num2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 30524L)
  public static SubLObject maximum(final SubLObject items, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str34$Cannot_compute_the_maximum_of_an_ );
    }
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key == IDENTITY )
    {
      SubLObject maximum = items.first();
      SubLObject cdolist_list_var = items.rest();
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( item.numG( maximum ) )
        {
          maximum = item;
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      return maximum;
    }
    return list_utilities.extremal( items, Symbols.symbol_function( $sym35$_ ), key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 31613L)
  public static SubLObject minimum(final SubLObject items, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str36$Cannot_compute_the_minimum_of_an_ );
    }
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key == IDENTITY )
    {
      SubLObject minimum = items.first();
      SubLObject cdolist_list_var = items.rest();
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( item.numL( minimum ) )
        {
          minimum = item;
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      return minimum;
    }
    return list_utilities.extremal( items, Symbols.symbol_function( $sym37$_ ), key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32143L)
  public static SubLObject average(final SubLObject items, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( items.isCons() )
    {
      SubLObject sum = ZERO_INTEGER;
      SubLObject cdolist_list_var = items;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sum = Numbers.add( sum, Functions.funcall( key, item ) );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      return Numbers.sublisp_float( Numbers.divide( sum, Sequences.length( items ) ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32344L)
  public static SubLObject mean(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str38$Cannot_compute_the_mean_of_an_ato );
    }
    SubLObject total = ZERO_INTEGER;
    SubLObject num_items = ZERO_INTEGER;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      total = Numbers.add( total, item );
      num_items = Numbers.add( num_items, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return Numbers.divide( total, num_items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32674L)
  public static SubLObject summation(final SubLObject items)
  {
    SubLObject sum = ZERO_INTEGER;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sum = Numbers.add( sum, item );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return sum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 32870L)
  public static SubLObject product(final SubLObject items)
  {
    SubLObject product = ONE_INTEGER;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      product = Numbers.multiply( product, item );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return product;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 33074L)
  public static SubLObject geometric_mean(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str39$Cannot_compute_the_geometric_mean );
    }
    final SubLObject product = product( items );
    final SubLObject total = Sequences.length( items );
    return Numbers.expt( product, Numbers.invert( total ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 33383L)
  public static SubLObject median(final SubLObject items, SubLObject key, SubLObject v_return)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( v_return == UNPROVIDED )
    {
      v_return = $kw40$VALUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str41$Cannot_compute_the_median_of_an_a );
    }
    final SubLObject sorted_items = Sort.sort( conses_high.copy_list( items ), Symbols.symbol_function( $sym37$_ ), key );
    return median_sorted( sorted_items, Sequences.length( sorted_items ), key, v_return );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 33975L)
  public static SubLObject median_sorted(final SubLObject items, SubLObject length, SubLObject key, SubLObject v_return)
  {
    if( length == UNPROVIDED )
    {
      length = NIL;
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( v_return == UNPROVIDED )
    {
      v_return = $kw40$VALUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str41$Cannot_compute_the_median_of_an_a );
    }
    if( NIL == length )
    {
      length = Sequences.length( items );
    }
    final SubLObject middle_position = Numbers.integerDivide( length, TWO_INTEGER );
    final SubLObject middle_item = ConsesLow.nth( middle_position, items );
    final SubLObject pcase_var = v_return;
    if( pcase_var.eql( $kw42$ITEM ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Numbers.oddp( length ) )
      {
        Errors.error( $str43$Can_t_return_middle_item_from_an_ );
      }
      return middle_item;
    }
    if( pcase_var.eql( $kw40$VALUE ) )
    {
      return ( NIL != Numbers.oddp( length ) ) ? Functions.funcall( key, middle_item )
          : mean( ConsesLow.list( Functions.funcall( key, middle_item ), Functions.funcall( key, ConsesLow.nth( Numbers.subtract( middle_position, ONE_INTEGER ), items ) ) ) );
    }
    Errors.error( $str44$Unrecognized_RETURN_type__S, v_return );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 35095L)
  public static SubLObject percentile(final SubLObject items, final SubLObject percent, SubLObject sort_method, SubLObject key)
  {
    if( sort_method == UNPROVIDED )
    {
      sort_method = $sym37$_;
    }
    if( key == UNPROVIDED )
    {
      key = IDENTITY;
    }
    return percentile_sorted( Sort.sort( conses_high.copy_list( items ), sort_method, key ), percent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 35428L)
  public static SubLObject percentile_sorted(final SubLObject items, final SubLObject percent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != percentile_p( percent ) : percent;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str46$Cannot_compute_the_percentile_of_ );
    }
    final SubLObject total = Sequences.length( items );
    final SubLObject index = Numbers.truncate( Numbers.multiply( total, percent ), UNPROVIDED );
    return ConsesLow.nth( index, items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 35869L)
  public static SubLObject max_key_from_hash(final SubLObject hashtable)
  {
    SubLObject max_count = ZERO_INTEGER;
    SubLObject best_key = NIL;
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( val.numG( max_count ) )
        {
          max_count = val;
          best_key = key;
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return best_key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 36109L)
  public static SubLObject get_frequency_list(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str47$Cannot_compute_frequencies_of_an_ );
    }
    final SubLObject hash = Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hash_table_utilities.cinc_hash( item, hash, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return hash_table_utilities.hash_table_to_alist( hash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 36597L)
  public static SubLObject get_sorted_frequency_list(final SubLObject items)
  {
    final SubLObject unsorted = get_frequency_list( items );
    return Sort.sort( unsorted, $sym35$_, $sym48$CDR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 37004L)
  public static SubLObject mode(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str49$Cannot_compute_the_mode_of_an_ato );
    }
    final SubLObject hash = Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hash_table_utilities.cinc_hash( item, hash, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return max_key_from_hash( hash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 37295L)
  public static SubLObject mode_sorted(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str49$Cannot_compute_the_mode_of_an_ato );
    }
    SubLObject items_left;
    SubLObject last_item;
    SubLObject current_item;
    SubLObject current_count;
    SubLObject best_item;
    SubLObject best_count;
    for( items_left = NIL, last_item = NIL, current_item = NIL, current_count = NIL, best_item = NIL, best_count = NIL, items_left = items, last_item = Symbols.gensym( UNPROVIDED ), current_item = items_left
        .first(), current_count = ONE_INTEGER, best_item = items.first(), best_count = ONE_INTEGER; NIL != items_left; items_left = items_left.rest(), last_item = current_item, current_item = items_left
            .first(), current_count = current_item.eql( last_item ) ? Numbers.add( current_count, ONE_INTEGER ) : ONE_INTEGER, best_item = ( current_count.numG( best_count ) ? current_item
                : best_item ), best_count = ( current_count.numG( best_count ) ? current_count : best_count ) )
    {
    }
    return best_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 37870L)
  public static SubLObject variance_from_sample(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str50$Cannot_compute_the_variance_of_an );
    }
    if( NIL != list_utilities.singletonP( items ) )
    {
      return variance_from_population( items );
    }
    SubLObject item_squares_total = ZERO_INTEGER;
    SubLObject item_total = ZERO_INTEGER;
    SubLObject length = ZERO_INTEGER;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      item_squares_total = Numbers.add( item_squares_total, square( item ) );
      item_total = Numbers.add( item_total, item );
      length = Numbers.add( length, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    final SubLObject mean = Numbers.divide( item_total, length );
    return Values.values( Numbers.subtract( Numbers.divide( item_squares_total, Numbers.subtract( length, ONE_INTEGER ) ), Numbers.multiply( Numbers.divide( length, Numbers.subtract( length, ONE_INTEGER ) ), square(
        mean ) ) ), mean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 39413L)
  public static SubLObject variance_from_population(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str50$Cannot_compute_the_variance_of_an );
    }
    SubLObject item_squares_total = ZERO_INTEGER;
    SubLObject item_total = ZERO_INTEGER;
    SubLObject length = ZERO_INTEGER;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      item_squares_total = Numbers.add( item_squares_total, square( item ) );
      item_total = Numbers.add( item_total, item );
      length = Numbers.add( length, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    final SubLObject mean = Numbers.divide( item_total, length );
    return Values.values( Numbers.subtract( Numbers.divide( item_squares_total, length ), square( mean ) ), mean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 40370L)
  public static SubLObject variance(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str50$Cannot_compute_the_variance_of_an );
    }
    thread.resetMultipleValues();
    final SubLObject variance = variance_from_population( items );
    final SubLObject mean = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( variance, mean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 40760L)
  public static SubLObject standard_deviation_from_population(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str51$Cannot_compute_the_standard_devia );
    }
    thread.resetMultipleValues();
    final SubLObject variance = variance_from_population( items );
    final SubLObject mean = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( Numbers.sqrt( variance ), mean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 41203L)
  public static SubLObject safe_standard_deviation_from_sample(final SubLObject items)
  {
    return items.isCons() ? standard_deviation_from_sample( items ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 41343L)
  public static SubLObject standard_deviation_from_sample(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str51$Cannot_compute_the_standard_devia );
    }
    thread.resetMultipleValues();
    final SubLObject variance = variance_from_sample( items );
    final SubLObject mean = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( Numbers.sqrt( variance ), mean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 41775L)
  public static SubLObject standard_deviation(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !items.isCons() )
    {
      Errors.error( $str51$Cannot_compute_the_standard_devia );
    }
    thread.resetMultipleValues();
    final SubLObject variance = variance( items );
    final SubLObject mean = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( Numbers.sqrt( variance ), mean );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 42186L)
  public static SubLObject standard_deviations_above_mean(final SubLObject value, final SubLObject mean, final SubLObject standard_deviation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( value.numE( mean ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && standard_deviation.isZero() )
    {
      Errors.error( $str52$Standard_deviation_must_not_be_ze );
    }
    return Numbers.divide( Numbers.subtract( value, mean ), standard_deviation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 42523L)
  public static SubLObject simple_outliers(final SubLObject data, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = IDENTITY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject raw_numbers = Mapping.mapcar( key, data );
    thread.resetMultipleValues();
    final SubLObject stdev = standard_deviation( raw_numbers );
    final SubLObject mean = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject simple_outlier_cutoff = Numbers.add( mean, Numbers.multiply( stdev, TWO_INTEGER ) );
    SubLObject outlier_data = Sequences.remove( simple_outlier_cutoff, data, Symbols.symbol_function( $sym53$__ ), key, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    outlier_data = Sort.sort( outlier_data, Symbols.symbol_function( $sym35$_ ), key );
    return Values.values( outlier_data, simple_outlier_cutoff );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 43161L)
  public static SubLObject perform_standard_statistical_analysis(final SubLObject values, SubLObject should_print_resultsP)
  {
    if( should_print_resultsP == UNPROVIDED )
    {
      should_print_resultsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject n = Sequences.length( values );
    final SubLObject min = minimum( values, UNPROVIDED );
    final SubLObject max = maximum( values, UNPROVIDED );
    final SubLObject median = median( values, UNPROVIDED, UNPROVIDED );
    final SubLObject mean = mean( values );
    final SubLObject sd = standard_deviation( values );
    if( NIL != should_print_resultsP )
    {
      final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
      try
      {
        reader.$read_default_float_format$.bind( $sym54$DOUBLE_FLOAT, thread );
        PrintLow.format( T, $str55$__Standard_Statistical_Analysis );
        PrintLow.format( T, $str56$_______________________________ );
        PrintLow.format( T, $str57$__Count______6D, n );
        PrintLow.format( T, $str58$__Min________6D, four_significant_digits( min ) );
        PrintLow.format( T, $str59$__Median_____6D, four_significant_digits( median ) );
        PrintLow.format( T, $str60$__Mean_______6D, four_significant_digits( mean ) );
        PrintLow.format( T, $str61$__Max________6D, four_significant_digits( max ) );
        PrintLow.format( T, $str62$__Std_Dev____6D, four_significant_digits( sd ) );
        streams_high.terpri( T );
        streams_high.force_output( T );
      }
      finally
      {
        reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
      }
    }
    return ConsesLow.list( n, min, median, mean, max, sd );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 44194L)
  public static SubLObject correlation(final SubLObject x_values, final SubLObject y_values)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.same_length_p( x_values, y_values ) )
    {
      Errors.error( $str63$X_Values_and_Y_Values_must_be_of_, Sequences.length( x_values ) );
    }
    SubLObject sum_sq_x = ZERO_INTEGER;
    SubLObject sum_sq_y = ZERO_INTEGER;
    SubLObject sum_coproduct = ZERO_INTEGER;
    SubLObject mean_x = NIL;
    SubLObject mean_y = NIL;
    SubLObject n = NIL;
    SubLObject counter = ZERO_INTEGER;
    SubLObject x = NIL;
    SubLObject x_$1 = NIL;
    SubLObject y = NIL;
    SubLObject y_$2 = NIL;
    x = x_values;
    x_$1 = x.first();
    y = y_values;
    y_$2 = y.first();
    while ( NIL != y || NIL != x)
    {
      if( counter.isZero() )
      {
        mean_x = x_$1;
        mean_y = y_$2;
      }
      else
      {
        final SubLObject index = Numbers.add( counter, ONE_INTEGER );
        final SubLObject sweep = Numbers.divide( Numbers.subtract( index, $float64$1_0 ), index );
        final SubLObject delta_x = Numbers.subtract( x_$1, mean_x );
        final SubLObject delta_y = Numbers.subtract( y_$2, mean_y );
        sum_sq_x = Numbers.add( sum_sq_x, Numbers.multiply( delta_x, delta_x, sweep ) );
        sum_sq_y = Numbers.add( sum_sq_y, Numbers.multiply( delta_y, delta_y, sweep ) );
        sum_coproduct = Numbers.add( sum_coproduct, Numbers.multiply( delta_x, delta_y, sweep ) );
        mean_x = Numbers.add( mean_x, Numbers.divide( delta_x, index ) );
        mean_y = Numbers.add( mean_y, Numbers.divide( delta_y, index ) );
        n = index;
      }
      counter = Numbers.add( counter, ONE_INTEGER );
      x = x.rest();
      x_$1 = x.first();
      y = y.rest();
      y_$2 = y.first();
    }
    final SubLObject pop_sd_x = Numbers.sqrt( Numbers.divide( sum_sq_x, n ) );
    final SubLObject pop_sd_y = Numbers.sqrt( Numbers.divide( sum_sq_y, n ) );
    final SubLObject cov_x_y = Numbers.divide( sum_coproduct, n );
    if( pop_sd_x.isZero() || pop_sd_y.isZero() )
    {
      return ZERO_INTEGER;
    }
    return Numbers.divide( cov_x_y, Numbers.multiply( pop_sd_x, pop_sd_y ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 45438L)
  public static SubLObject decode_integer_multiples(SubLObject integer, final SubLObject multiples)
  {
    assert NIL != Types.integerp( integer ) : integer;
    assert NIL != Types.listp( multiples ) : multiples;
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = multiples;
    SubLObject multiple = NIL;
    multiple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( integer.numE( ZERO_INTEGER ) )
      {
        if( NIL == v_answer )
        {
          v_answer = ConsesLow.cons( integer, v_answer );
        }
        return Sequences.nreverse( v_answer );
      }
      final SubLObject value = Numbers.mod( integer, multiple );
      integer = Numbers.integerDivide( integer, multiple );
      v_answer = ConsesLow.cons( value, v_answer );
      cdolist_list_var = cdolist_list_var.rest();
      multiple = cdolist_list_var.first();
    }
    v_answer = ConsesLow.cons( integer, v_answer );
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 46155L)
  public static SubLObject encode_integer_multiples(final SubLObject values, final SubLObject multiples)
  {
    if( NIL == values )
    {
      return ZERO_INTEGER;
    }
    if( NIL == multiples )
    {
      return values.first();
    }
    SubLObject v_answer = encode_integer_multiples( values.rest(), multiples.rest() );
    v_answer = Numbers.multiply( v_answer, multiples.first() );
    v_answer = Numbers.add( v_answer, values.first() );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 46703L)
  public static SubLObject arithmetic_progression(final SubLObject start, final SubLObject end, final SubLObject length)
  {
    if( length.numL( TWO_INTEGER ) )
    {
      Errors.error( $str66$length_must_be_at_least_2_ );
    }
    final SubLObject difference = Numbers.subtract( end, start );
    final SubLObject interval = Numbers.divide( difference, Numbers.subtract( length, ONE_INTEGER ) );
    SubLObject result = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      result = ConsesLow.cons( Numbers.add( start, Numbers.multiply( i, interval ) ), result );
    }
    result = Sequences.nreverse( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 47039L)
  public static SubLObject geometric_progression(final SubLObject start, final SubLObject end, final SubLObject length)
  {
    if( start.numE( ONE_INTEGER ) )
    {
      return Errors.error( $str67$Cannot_start_at_1_ );
    }
    if( end.numE( ONE_INTEGER ) )
    {
      return Errors.error( $str68$Cannot_end_at_1_ );
    }
    if( start.numLE( ZERO_INTEGER ) )
    {
      return Errors.error( $str69$Cannot_start_at_or_below_0_ );
    }
    if( end.numLE( ZERO_INTEGER ) )
    {
      return Errors.error( $str70$Cannot_end_at_or_below_0_ );
    }
    if( length.numLE( ZERO_INTEGER ) )
    {
      return Errors.error( $str71$Length_must_be_at_least_1_ );
    }
    if( !length.numE( ONE_INTEGER ) )
    {
      final SubLObject step_ratio = geometric_progression_ratio( start, end, length );
      final SubLObject steps = f_1_( length );
      SubLObject sofar = $kw73$UNINITIALIZED;
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        if( i.isZero() )
        {
          sofar = start;
        }
        else if( i.numL( steps ) )
        {
          sofar = Numbers.multiply( sofar, step_ratio );
        }
        else
        {
          sofar = end;
        }
        result = ConsesLow.cons( sofar, result );
      }
      return Sequences.nreverse( result );
    }
    if( start.numE( end ) )
    {
      return ConsesLow.list( start );
    }
    return Errors.error( $str72$Length_must_be_at_least_2_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 47878L)
  public static SubLObject geometric_progression_ratio(final SubLObject start, final SubLObject end, final SubLObject length)
  {
    final SubLObject full_ratio = Numbers.divide( end, start );
    final SubLObject steps = f_1_( length );
    SubLObject step_ratio = Numbers.expt( full_ratio, Numbers.invert( steps ) );
    if( start.isInteger() && end.isInteger() )
    {
      final SubLObject sanitized_ratio = arithmetic.possibly_sanitize_float( step_ratio );
      final SubLObject integer_ratio = Numbers.round( sanitized_ratio, UNPROVIDED );
      if( integer_ratio.numE( sanitized_ratio ) && end.numE( Numbers.multiply( start, Numbers.expt( integer_ratio, steps ) ) ) )
      {
        step_ratio = integer_ratio;
      }
    }
    return step_ratio;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 48435L)
  public static SubLObject number_string_p(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject num = NIL;
    SubLObject err_msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym74$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          num = number_string_value( text );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err_msg && NIL == string_utilities.substringP( $str75$This_integer_is_too_large_to_be_c, err_msg, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str76$_A, err_msg );
    }
    return list_utilities.sublisp_boolean( num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 48996L)
  public static SubLObject number_string_value(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( text.isString() && NIL != Sequences.find_if( Symbols.symbol_function( $sym77$DIGIT_CHAR_P ), text, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.find_if_not( Symbols.symbol_function(
        $sym78$VALID_NUMBER_STRING_CHAR ), text, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject number = reader.read_from_string_ignoring_errors( text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject next_position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( number.isNumber() && next_position.eql( Sequences.length( text ) ) )
      {
        return number;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 49703L)
  public static SubLObject valid_number_string_char(final SubLObject obj)
  {
    return Sequences.find( obj, $valid_number_string_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 49804L)
  public static SubLObject extended_number_string_p(final SubLObject string)
  {
    if( NIL == string_utilities.partially_numeric_stringP( string ) )
    {
      return NIL;
    }
    final SubLObject exponent_marker_position = Sequences.position_if( $sym80$VALID_EXPONENT_MARKER, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject significand = ( NIL != exponent_marker_position ) ? string_utilities.substring( string, ZERO_INTEGER, exponent_marker_position ) : string;
    final SubLObject exponent = ( NIL != exponent_marker_position ) ? string_utilities.substring( string, Numbers.add( ONE_INTEGER, exponent_marker_position ), UNPROVIDED ) : NIL;
    SubLObject failedP = NIL;
    if( NIL != string_utilities.empty_string_p( significand ) )
    {
      failedP = T;
    }
    else
    {
      SubLObject decimal_foundP = NIL;
      final SubLObject leading_elt = Sequences.elt( significand, ZERO_INTEGER );
      if( Characters.CHAR_period.eql( leading_elt ) )
      {
        decimal_foundP = T;
      }
      else if( NIL == Characters.digit_char_p( leading_elt, UNPROVIDED ) && NIL == valid_sign( leading_elt ) )
      {
        failedP = T;
      }
      final SubLObject string_var = significand;
      final SubLObject end_var = Sequences.length( string_var );
      if( NIL == failedP )
      {
        SubLObject end_var_$3;
        SubLObject char_num;
        SubLObject v_char;
        for( end_var_$3 = end_var, char_num = NIL, char_num = ONE_INTEGER; NIL == failedP && !char_num.numGE( end_var_$3 ); char_num = f_1X( char_num ) )
        {
          v_char = Strings.sublisp_char( string_var, char_num );
          if( NIL == Characters.digit_char_p( v_char, UNPROVIDED ) )
          {
            if( Characters.CHAR_period.eql( v_char ) )
            {
              if( NIL != decimal_foundP )
              {
                failedP = T;
              }
              else
              {
                decimal_foundP = T;
              }
            }
            else
            {
              failedP = T;
            }
          }
        }
      }
    }
    if( NIL == failedP && NIL != exponent )
    {
      if( NIL != string_utilities.empty_string_p( exponent ) )
      {
        failedP = T;
      }
      else
      {
        final SubLObject leading_elt2 = Sequences.elt( exponent, ZERO_INTEGER );
        if( NIL == Characters.digit_char_p( leading_elt2, UNPROVIDED ) && NIL == valid_sign( leading_elt2 ) )
        {
          failedP = T;
        }
        final SubLObject string_var2 = exponent;
        final SubLObject end_var2 = Sequences.length( string_var2 );
        if( NIL == failedP )
        {
          SubLObject end_var_$4;
          SubLObject char_num2;
          SubLObject v_char2;
          for( end_var_$4 = end_var2, char_num2 = NIL, char_num2 = ONE_INTEGER; NIL == failedP && !char_num2.numGE( end_var_$4 ); char_num2 = f_1X( char_num2 ) )
          {
            v_char2 = Strings.sublisp_char( string_var2, char_num2 );
            if( NIL == Characters.digit_char_p( v_char2, UNPROVIDED ) )
            {
              failedP = T;
            }
          }
        }
      }
    }
    return makeBoolean( NIL == failedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51732L)
  public static SubLObject valid_exponent_marker(final SubLObject obj)
  {
    return Sequences.find( obj, $valid_exponent_markers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 51870L)
  public static SubLObject valid_sign(final SubLObject obj)
  {
    return Sequences.find( obj, $valid_sign$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 55689L)
  public static SubLObject find_smallest_prime_for_binary_width(final SubLObject power)
  {
    SubLObject candidate = f_1_( Numbers.expt( TWO_INTEGER, power ) );
    SubLObject prime = NIL;
    while ( NIL == prime)
    {
      if( NIL != prime_numberP( candidate ) )
      {
        prime = candidate;
      }
      else
      {
        candidate = Numbers.subtract( candidate, ONE_INTEGER );
      }
    }
    return prime;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56362L)
  public static SubLObject checksum_sanity_check()
  {
    return makeBoolean( NIL != subl_promotions.positive_integer_p( $checksum_implementation_width$.getGlobalValue() ) && NIL != subl_promotions.positive_integer_p( $checksum_base$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 56719L)
  public static SubLObject checksum_update(final SubLObject v_byte)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $checksum_sum$.setDynamicValue( Numbers.add( $checksum_sum$.getDynamicValue( thread ), v_byte ), thread );
    if( $checksum_base$.getGlobalValue().numL( $checksum_sum$.getDynamicValue( thread ) ) )
    {
      $checksum_sum$.setDynamicValue( Numbers.subtract( $checksum_sum$.getDynamicValue( thread ), $checksum_base$.getGlobalValue() ), thread );
    }
    $checksum_length$.setDynamicValue( Numbers.add( $checksum_length$.getDynamicValue( thread ), $checksum_sum$.getDynamicValue( thread ) ), thread );
    if( $checksum_base$.getGlobalValue().numL( $checksum_length$.getDynamicValue( thread ) ) )
    {
      $checksum_length$.setDynamicValue( Numbers.subtract( $checksum_length$.getDynamicValue( thread ), $checksum_base$.getGlobalValue() ), thread );
    }
    return v_byte;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 57235L)
  public static SubLObject checksum_finalize()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.cons( $checksum_length$.getDynamicValue( thread ), $checksum_sum$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 57581L)
  public static SubLObject checksum_setup(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sum_init = NIL;
    SubLObject length_init = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    sum_init = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    length_init = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym95$CLET, ConsesLow.list( ConsesLow.list( $sym96$_CHECKSUM_SUM_, sum_init ), ConsesLow.list( $sym97$_CHECKSUM_LENGTH_, length_init ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 57828L)
  public static SubLObject checksum_start(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym92$CHECKSUM_SETUP, $list98, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 58197L)
  public static SubLObject checksum_resume(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject accumulators = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    accumulators = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym92$CHECKSUM_SETUP, ConsesLow.list( ConsesLow.list( $sym48$CDR, accumulators ), ConsesLow.list( $sym100$CAR, accumulators ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 58643L)
  public static SubLObject with_checksum(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject checksum = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    checksum = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return reader.bq_cons( $sym102$CHECKSUM_START, ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym103$CSETQ, checksum, $list104 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 59117L)
  public static SubLObject expt_mod(final SubLObject number, final SubLObject exponent, final SubLObject modulus)
  {
    SubLObject result = Numbers.mod( number, modulus );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Numbers.subtract( exponent, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      result = Numbers.mod( Numbers.multiply( result, number ), modulus );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 60233L)
  public static SubLObject binary_expt_mod(final SubLObject number, final SubLObject exponent, final SubLObject modulus)
  {
    final SubLObject binary_exponent = Sequences.subseq( convert_to_binary( exponent ), ONE_INTEGER, UNPROVIDED );
    SubLObject result = Numbers.mod( number, modulus );
    final SubLObject string_var = binary_exponent;
    SubLObject end_var_$5;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$5 = Sequences.length( string_var ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$5 ); char_num = f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string_var, char_num );
      if( v_char.eql( Characters.CHAR_0 ) )
      {
        result = Numbers.mod( square( result ), modulus );
      }
      else
      {
        result = Numbers.mod( square( result ), modulus );
        result = Numbers.mod( Numbers.multiply( result, number ), modulus );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61230L)
  public static SubLObject convert_to_binary(final SubLObject n)
  {
    return PrintLow.write_to_string( n, new SubLObject[] { $kw105$BASE, TWO_INTEGER
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61405L)
  public static SubLObject convert_to_hexadecimal(final SubLObject n)
  {
    return PrintLow.format( NIL, $str106$_X, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61575L)
  public static SubLObject modular_subtraction(final SubLObject a, final SubLObject b, final SubLObject modulus)
  {
    return Numbers.mod( Numbers.subtract( a, b ), modulus );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61803L)
  public static SubLObject modular_addition(final SubLObject a, final SubLObject b, final SubLObject modulus)
  {
    return Numbers.mod( Numbers.add( a, b ), modulus );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 61996L)
  public static SubLObject modularE(final SubLObject a, final SubLObject b, final SubLObject n)
  {
    return Equality.eq( Numbers.mod( a, n ), Numbers.mod( b, n ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 62176L)
  public static SubLObject number_of_digits(final SubLObject n)
  {
    if( n.isNumber() )
    {
      return n.isNegative() ? Numbers.subtract( Sequences.length( PrintLow.write_to_string( n, EMPTY_SUBL_OBJECT_ARRAY ) ), ONE_INTEGER ) : Sequences.length( PrintLow.write_to_string( n, EMPTY_SUBL_OBJECT_ARRAY ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 62414L)
  public static SubLObject multiple_ofP(final SubLObject small_int, final SubLObject large_int)
  {
    if( small_int.isInteger() && large_int.isInteger() && !small_int.isZero() )
    {
      return Types.integerp( Numbers.divide( large_int, small_int ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 62722L)
  public static SubLObject multiple_of_allP(final SubLObject list, final SubLObject large_int)
  {
    SubLObject cdolist_list_var = list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == multiple_ofP( item, large_int ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 63017L)
  public static SubLObject prime_numberP(final SubLObject v_object)
  {
    if( NIL == subl_promotions.positive_integer_p( v_object ) )
    {
      return NIL;
    }
    if( v_object.eql( ONE_INTEGER ) )
    {
      return NIL;
    }
    return Equality.eql( v_object, find_smallest_divisor( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 63274L)
  public static SubLObject prime_factorization(SubLObject positive_integer)
  {
    assert NIL != subl_promotions.positive_integer_p( positive_integer ) : positive_integer;
    if( positive_integer.eql( ONE_INTEGER ) )
    {
      return NIL;
    }
    SubLObject factorization = NIL;
    while ( !ONE_INTEGER.eql( positive_integer ))
    {
      final SubLObject smallest_divisor = find_smallest_divisor( positive_integer );
      factorization = ConsesLow.cons( smallest_divisor, factorization );
      positive_integer = Numbers.divide( positive_integer, smallest_divisor );
    }
    return Sort.sort( factorization, Symbols.symbol_function( $sym37$_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 63984L)
  public static SubLObject common_prime_factors(final SubLObject positive_integer_list)
  {
    SubLObject prime_factors_list = NIL;
    SubLObject cdolist_list_var = positive_integer_list;
    SubLObject positive_integer = NIL;
    positive_integer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      prime_factors_list = ConsesLow.cons( Sort.sort( prime_factorization( Numbers.abs( positive_integer ) ), $sym37$_, UNPROVIDED ), prime_factors_list );
      cdolist_list_var = cdolist_list_var.rest();
      positive_integer = cdolist_list_var.first();
    }
    return list_utilities.intersect_sorted_all( prime_factors_list, $sym37$_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 64274L)
  public static SubLObject find_smallest_divisor(final SubLObject positive_integer)
  {
    SubLObject divisor = NIL;
    if( NIL == subl_promotions.positive_integer_p( positive_integer ) || !positive_integer.numG( ONE_INTEGER ) )
    {
      Errors.error( $str107$_A_is_not_a_positive_integer_grea, positive_integer );
    }
    else if( NIL != Numbers.evenp( positive_integer ) )
    {
      divisor = TWO_INTEGER;
    }
    else if( Numbers.mod( positive_integer, THREE_INTEGER ).isZero() )
    {
      divisor = THREE_INTEGER;
    }
    else
    {
      final SubLObject isqrt = Numbers.isqrt( positive_integer );
      final SubLObject start = SIX_INTEGER;
      final SubLObject end = Numbers.add( TWO_INTEGER, isqrt );
      final SubLObject squareP = Numbers.numE( positive_integer, Numbers.multiply( isqrt, isqrt ) );
      if( NIL != squareP )
      {
        divisor = find_smallest_divisor( isqrt );
      }
      if( NIL == divisor )
      {
        SubLObject end_var;
        SubLObject i;
        for( end_var = end, i = NIL, i = start; NIL == divisor && !i.numGE( end_var ); i = Numbers.add( i, SIX_INTEGER ) )
        {
          if( Numbers.mod( positive_integer, f_1_( i ) ).isZero() )
          {
            divisor = f_1_( i );
          }
          else if( Numbers.mod( positive_integer, f_1X( i ) ).isZero() )
          {
            divisor = f_1X( i );
          }
        }
      }
    }
    return ( NIL != divisor ) ? divisor : positive_integer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 66529L)
  public static SubLObject divisors(final SubLObject positive_integer)
  {
    assert NIL != subl_promotions.positive_integer_p( positive_integer ) : positive_integer;
    final SubLObject factorization = prime_factorization( positive_integer );
    final SubLObject factor_lists = Sequences.delete_duplicates( list_utilities.powerset( factorization ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject divisors = Sequences.delete_duplicates( list_utilities.nmapcar( Symbols.symbol_function( $sym110$PRODUCT ), factor_lists ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Sort.sort( divisors, Symbols.symbol_function( $sym37$_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 67063L)
  public static SubLObject lcm(final SubLObject ints)
  {
    assert NIL != list_utilities.non_dotted_list_p( ints ) : ints;
    SubLObject cdolist_list_var = ints;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.integerp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL == ints )
    {
      return ONE_INTEGER;
    }
    SubLObject pos_ints = conses_high.copy_list( ints );
    pos_ints = list_utilities.nmapcar( Symbols.symbol_function( $sym112$ABS ), pos_ints );
    pos_ints = list_utilities.fast_delete_duplicates( pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( pos_ints ) )
    {
      return pos_ints.first();
    }
    if( NIL != subl_promotions.memberP( ZERO_INTEGER, pos_ints, UNPROVIDED, UNPROVIDED ) )
    {
      return ZERO_INTEGER;
    }
    return Sequences.creduce( Symbols.symbol_function( $sym113$LCM2_INTERNAL ), pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 67782L)
  public static SubLObject lcm2(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != Types.integerp( int1 ) : int1;
    assert NIL != Types.integerp( int2 ) : int2;
    if( int1.isZero() || int2.isZero() )
    {
      return ZERO_INTEGER;
    }
    return lcm2_internal( Numbers.abs( int1 ), Numbers.abs( int2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 68171L)
  public static SubLObject lcm2_internal(final SubLObject int1, final SubLObject int2)
  {
    final SubLObject gcd = gcd2_internal( int1, int2 );
    return Numbers.multiply( int2, Numbers.integerDivide( int1, gcd ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 68387L)
  public static SubLObject gcd(final SubLObject ints)
  {
    assert NIL != list_utilities.non_dotted_list_p( ints ) : ints;
    SubLObject cdolist_list_var = ints;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.integerp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL == ints )
    {
      return ZERO_INTEGER;
    }
    SubLObject pos_ints = conses_high.copy_list( ints );
    pos_ints = list_utilities.nmapcar( Symbols.symbol_function( $sym112$ABS ), pos_ints );
    pos_ints = list_utilities.fast_delete_duplicates( pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( pos_ints ) )
    {
      return pos_ints.first();
    }
    return Sequences.creduce( Symbols.symbol_function( $sym114$GCD2_INTERNAL ), pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69090L)
  public static SubLObject gcd2(final SubLObject int1, final SubLObject int2)
  {
    assert NIL != Types.integerp( int1 ) : int1;
    assert NIL != Types.integerp( int2 ) : int2;
    return gcd2_internal( Numbers.abs( int1 ), Numbers.abs( int2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69348L)
  public static SubLObject gcd2_internal(final SubLObject int1, final SubLObject int2)
  {
    if( int1.numG( int2 ) )
    {
      return gcd2_sorted_internal( int1, int2 );
    }
    return gcd2_sorted_internal( int2, int1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69608L)
  public static SubLObject gcd2_sorted_internal(final SubLObject greater, final SubLObject lesser)
  {
    if( lesser.isZero() )
    {
      return greater;
    }
    return gcd2_sorted_internal( lesser, Numbers.mod( greater, lesser ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 69766L)
  public static SubLObject convert_hexadecimal_to_decimal(final SubLObject number_string)
  {
    final SubLObject rev_number = Sequences.reverse( number_string );
    final SubLObject length_number = Sequences.length( rev_number );
    SubLObject result = ZERO_INTEGER;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length_number ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      result = Numbers.add( result, Numbers.multiply( Numbers.expt( SIXTEEN_INTEGER, i ), decimal_code_for_hex_digit( Vectors.aref( rev_number, i ) ) ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70441L)
  public static SubLObject decimal_code_for_hex_digit(final SubLObject v_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject code = Characters.digit_char_p( v_char, UNPROVIDED );
    if( NIL == code )
    {
      code = conses_high.second( conses_high.assoc( v_char, $hex_to_dec_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    }
    return code;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70625L)
  public static SubLObject with_probability(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject probability = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    probability = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject prob = $sym117$PROB;
    return ConsesLow.list( $sym95$CLET, ConsesLow.list( ConsesLow.list( prob, probability ) ), ConsesLow.listS( $sym118$CHECK_TYPE, prob, $list119 ), ConsesLow.listS( $sym120$PWHEN, ConsesLow.list(
        $sym121$TRUE_WITH_PROBABILITY, prob ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 70975L)
  public static SubLObject probability_p(final SubLObject v_object)
  {
    return collection_defns.cyc_real_0_1( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71045L)
  public static SubLObject true_with_probability(final SubLObject p)
  {
    assert NIL != probability_p( p ) : p;
    if( ONE_INTEGER.numE( p ) )
    {
      return T;
    }
    if( ZERO_INTEGER.numE( p ) )
    {
      return NIL;
    }
    return true_with_probability_int( p, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71421L)
  public static SubLObject true_with_probability_int(final SubLObject p, final SubLObject scaling_factor)
  {
    final SubLObject reciprocal = Numbers.round( Numbers.divide( ONE_INTEGER, p ), UNPROVIDED );
    if( reciprocal.numG( scaling_factor ) )
    {
      return Numbers.numL( random.random( reciprocal ), scaling_factor );
    }
    final SubLObject new_scaling_factor = Numbers.multiply( $int123$1000, scaling_factor );
    final SubLObject new_p = Numbers.divide( p, $int123$1000 );
    return true_with_probability_int( new_p, new_scaling_factor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71804L)
  public static SubLObject logistic(final SubLObject num)
  {
    return Numbers.divide( ONE_INTEGER, Numbers.add( ONE_INTEGER, Numbers.expt( $e$.getGlobalValue(), Numbers.minus( num ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71929L)
  public static SubLObject coin_flip()
  {
    return Numbers.zerop( random.random( TWO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 71986L)
  public static SubLObject probability_distribution_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.property_list_p( v_object ) )
    {
      SubLObject sum = ZERO_INTEGER;
      SubLObject remainder;
      SubLObject property;
      SubLObject value;
      for( remainder = NIL, remainder = v_object; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        property = remainder.first();
        value = conses_high.cadr( remainder );
        if( NIL == non_negative_number_p( value ) )
        {
          return NIL;
        }
        sum = Numbers.add( sum, value );
      }
      if( Numbers.abs( f_1_( sum ) ).numL( $float124$1_0e_5 ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72369L)
  public static SubLObject probability_distribution_sample(final SubLObject dist)
  {
    assert NIL != probability_distribution_p( dist ) : dist;
    final SubLObject p = random_probability();
    SubLObject sum_so_far = ZERO_INTEGER;
    SubLObject remainder;
    SubLObject item;
    SubLObject probability;
    for( remainder = NIL, remainder = dist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      item = remainder.first();
      probability = conses_high.cadr( remainder );
      sum_so_far = Numbers.add( sum_so_far, probability );
      if( p.numL( sum_so_far ) )
      {
        return item;
      }
    }
    return Errors.error( $str126$Error_sampling_from__s____s__s_, dist, p, sum_so_far );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72713L)
  public static SubLObject fibonacci(final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    SubLObject fib = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        fib = fibonacci_memoized( n );
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return fib;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72887L)
  public static SubLObject fibonacci_memoized_internal(final SubLObject n)
  {
    if( n.eql( ZERO_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    if( n.eql( ONE_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    return Numbers.add( fibonacci_memoized( Numbers.subtract( n, ONE_INTEGER ) ), fibonacci_memoized( Numbers.subtract( n, TWO_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 72887L)
  public static SubLObject fibonacci_memoized(final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return fibonacci_memoized_internal( n );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym128$FIBONACCI_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym128$FIBONACCI_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym128$FIBONACCI_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( fibonacci_memoized_internal( n ) ) );
      memoization_state.caching_state_put( caching_state, n, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 73101L)
  public static SubLObject random_0_1()
  {
    return Numbers.divide( random.random( random.$rand_max$.getGlobalValue() ), random.$rand_max$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 73245L)
  public static SubLObject random_probability()
  {
    return random_0_1();
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 73360L)
  public static SubLObject n_random_integers(final SubLObject n, final SubLObject limit, SubLObject sort_function)
  {
    if( sort_function == UNPROVIDED )
    {
      sort_function = NIL;
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    assert NIL != subl_promotions.positive_integer_p( limit ) : limit;
    if( NIL != sort_function && !assertionsDisabledInClass && NIL == Types.function_spec_p( sort_function ) )
    {
      throw new AssertionError( sort_function );
    }
    final SubLObject list = non_negative_integers_less_than( limit );
    final SubLObject result = list_utilities.random_n( n, list );
    return ( NIL != sort_function ) ? Sort.sort( result, sort_function, UNPROVIDED ) : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 74017L)
  public static SubLObject non_negative_integers_less_than(final SubLObject limit)
  {
    assert NIL != subl_promotions.positive_integer_p( limit ) : limit;
    SubLObject cursor;
    final SubLObject list = cursor = ConsesLow.make_list( limit, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( limit ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ConsesLow.rplaca( cursor, i );
      cursor = cursor.rest();
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 74357L)
  public static SubLObject compute_deltas(final SubLObject numbers, SubLObject last)
  {
    if( last == UNPROVIDED )
    {
      last = NIL;
    }
    SubLObject deltas = NIL;
    if( NIL != numbers )
    {
      SubLObject first = NIL;
      SubLObject rest = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( numbers, numbers, $list130 );
      first = numbers.first();
      final SubLObject current = rest = numbers.rest();
      SubLObject previous = first;
      SubLObject cdolist_list_var = rest;
      SubLObject next = NIL;
      next = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject delta = Numbers.subtract( next, previous );
        deltas = ConsesLow.cons( delta, deltas );
        previous = next;
        cdolist_list_var = cdolist_list_var.rest();
        next = cdolist_list_var.first();
      }
      if( NIL != last )
      {
        final SubLObject last_delta = Numbers.subtract( last, previous );
        deltas = ConsesLow.cons( last_delta, deltas );
      }
    }
    return Sequences.nreverse( deltas );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75002L)
  public static SubLObject factorial(final SubLObject n)
  {
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    SubLObject accumulator = ONE_INTEGER;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      accumulator = Numbers.multiply( accumulator, f_1X( i ) );
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75192L)
  public static SubLObject choose(final SubLObject n, final SubLObject k)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    assert NIL != subl_promotions.non_negative_integer_p( k ) : k;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !k.numLE( n ) )
    {
      Errors.error( $str131$_s_must_be_____s, n, k );
    }
    SubLObject accumulator = ONE_INTEGER;
    SubLObject end_var;
    SubLObject i;
    for( end_var = Numbers.subtract( n, k ), i = NIL, i = n; !i.numLE( end_var ); i = Numbers.add( i, MINUS_ONE_INTEGER ) )
    {
      assert NIL != subl_promotions.positive_integer_p( i ) : i;
      accumulator = Numbers.multiply( accumulator, i );
    }
    return Numbers.integerDivide( accumulator, factorial( k ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75627L)
  public static SubLObject strictly_between_0_and_1_p(final SubLObject x)
  {
    return SubLObjectFactory.makeBoolean( x.isNumber() && x.numG( ZERO_INTEGER ) && x.numL( ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75730L)
  public static SubLObject strictly_between_0_and_minus_1_p(final SubLObject x)
  {
    return SubLObjectFactory.makeBoolean( x.isNumber() && x.numL( ZERO_INTEGER ) && x.numG( MINUS_ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75840L)
  public static SubLObject tolerance_E(final SubLObject num1, final SubLObject num2, SubLObject tolerance)
  {
    if( tolerance == UNPROVIDED )
    {
      tolerance = ZERO_INTEGER;
    }
    return Numbers.numLE( Numbers.abs( Numbers.subtract( num1, num2 ) ), tolerance );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 75948L)
  public static SubLObject zero(SubLObject dummy)
  {
    if( dummy == UNPROVIDED )
    {
      dummy = NIL;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 76015L)
  public static SubLObject one(SubLObject dummy)
  {
    if( dummy == UNPROVIDED )
    {
      dummy = NIL;
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 76081L)
  public static SubLObject pairwise_slope(final SubLObject points)
  {
    SubLObject slopes = NIL;
    final SubLObject point_list = points.rest();
    SubLObject prev_point = points.first();
    SubLObject cdolist_list_var = point_list;
    SubLObject point = NIL;
    point = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = prev_point;
      SubLObject prev_x = NIL;
      SubLObject prev_y = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
      prev_x = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
      prev_y = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject current_$8;
        final SubLObject datum_$7 = current_$8 = point;
        SubLObject curr_x = NIL;
        SubLObject curr_y = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list133 );
        curr_x = current_$8.first();
        current_$8 = current_$8.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list133 );
        curr_y = current_$8.first();
        current_$8 = current_$8.rest();
        if( NIL == current_$8 )
        {
          final SubLObject slope = Numbers.divide( Numbers.subtract( curr_y, prev_y ), Numbers.subtract( curr_x, prev_x ) );
          slopes = ConsesLow.cons( slope, slopes );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$7, $list133 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list132 );
      }
      prev_point = point;
      cdolist_list_var = cdolist_list_var.rest();
      point = cdolist_list_var.first();
    }
    return Sequences.nreverse( slopes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 76730L)
  public static SubLObject values_to_coordinates(final SubLObject values)
  {
    SubLObject coordinates = NIL;
    SubLObject list_var = NIL;
    SubLObject value = NIL;
    SubLObject position = NIL;
    list_var = values;
    value = list_var.first();
    for( position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), value = list_var.first(), position = Numbers.add( ONE_INTEGER, position ) )
    {
      coordinates = ConsesLow.cons( ConsesLow.list( position, value ), coordinates );
    }
    return Sequences.nreverse( coordinates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 77113L)
  public static SubLObject coordinates_to_values(final SubLObject coordinates)
  {
    return Mapping.mapcar( $sym134$SECOND, coordinates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 77285L)
  public static SubLObject pairwise_slope_points(final SubLObject points)
  {
    final SubLObject slopes = pairwise_slope( points );
    return values_to_coordinates( slopes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 77714L)
  public static SubLObject average_neighbors(final SubLObject items, SubLObject num_of_neighbors)
  {
    if( num_of_neighbors == UNPROVIDED )
    {
      num_of_neighbors = $int135$25;
    }
    assert NIL != subl_promotions.non_negative_integer_p( num_of_neighbors ) : num_of_neighbors;
    final SubLObject width = ( NIL != Numbers.oddp( num_of_neighbors ) ) ? Numbers.integerDivide( Numbers.subtract( num_of_neighbors, ONE_INTEGER ), TWO_INTEGER ) : Numbers.integerDivide( num_of_neighbors, TWO_INTEGER );
    final SubLObject window_size = Numbers.add( width, width, ONE_INTEGER );
    final SubLObject window = queues.create_queue( UNPROVIDED );
    SubLObject window_sum = ZERO_INTEGER;
    SubLObject cursor = items;
    SubLObject smoothed_values = NIL;
    SubLObject i;
    SubLObject item;
    for( i = NIL, i = ZERO_INTEGER; i.numL( window_size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      item = cursor.first();
      queues.enqueue( item, window );
      window_sum = Numbers.add( window_sum, item );
      if( i.numL( width ) )
      {
        smoothed_values = ConsesLow.cons( item, smoothed_values );
      }
      cursor = cursor.rest();
    }
    SubLObject cdolist_list_var = cursor;
    item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.numberp( item ) : item;
      smoothed_values = ConsesLow.cons( Numbers.floor( window_sum, window_size ), smoothed_values );
      queues.enqueue( item, window );
      window_sum = Numbers.add( window_sum, item );
      final SubLObject tossed = queues.dequeue( window );
      window_sum = Numbers.subtract( window_sum, tossed );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    smoothed_values = ConsesLow.cons( Numbers.divide( window_sum, window_size ), smoothed_values );
    SubLObject cdotimes_end_var;
    SubLObject j;
    for( cdotimes_end_var = Numbers.add( width, ONE_INTEGER ), j = NIL, j = ZERO_INTEGER; j.numL( cdotimes_end_var ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      queues.dequeue( window );
    }
    while ( NIL == queues.queue_empty_p( window ))
    {
      final SubLObject item2 = queues.dequeue( window );
      smoothed_values = ConsesLow.cons( item2, smoothed_values );
    }
    return Sequences.nreverse( smoothed_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 80575L)
  public static SubLObject renumber_id_using_table(final SubLObject id, final SubLObject table_of_deletes)
  {
    SubLObject left = ZERO_INTEGER;
    SubLObject right = Numbers.subtract( Sequences.length( table_of_deletes ), ONE_INTEGER );
    while ( left.numLE( right ))
    {
      final SubLObject index = Numbers.integerDivide( Numbers.add( left, right ), TWO_INTEGER );
      final SubLObject deleted_id = Vectors.aref( table_of_deletes, index );
      if( deleted_id.numE( id ) )
      {
        return $kw138$DELETED;
      }
      if( deleted_id.numL( id ) )
      {
        left = Numbers.add( index, ONE_INTEGER );
      }
      else
      {
        if( !deleted_id.numG( id ) )
        {
          continue;
        }
        right = Numbers.subtract( index, ONE_INTEGER );
      }
    }
    final SubLObject num_of_gaps = left;
    return Numbers.subtract( id, num_of_gaps );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 84633L)
  public static SubLObject test_renumber_id_using_table(final SubLObject deleted_ids, final SubLObject max_id)
  {
    final SubLObject renumbered_ids = test_build_translation_map_for_id_renumbering( deleted_ids, max_id );
    final SubLObject table_of_deletes = list_utilities.list2vector( deleted_ids );
    SubLObject id;
    SubLObject mapped_id;
    SubLObject renumbered_id;
    for( id = NIL, id = ZERO_INTEGER; id.numL( max_id ); id = Numbers.add( id, ONE_INTEGER ) )
    {
      mapped_id = Hashtables.gethash( id, renumbered_ids, UNPROVIDED );
      renumbered_id = renumber_id_using_table( id, table_of_deletes );
      if( !mapped_id.eql( renumbered_id ) )
      {
        if( !mapped_id.numE( renumbered_id ) )
        {
          Errors.error( $str141$Original_id__A_was_supposed_to_ma, id, mapped_id, renumbered_id );
        }
      }
    }
    return $kw142$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 85351L)
  public static SubLObject transform_delete_list_to_gap_list(final SubLObject deleted_ids)
  {
    SubLObject gap_list = NIL;
    SubLObject cursor_id;
    SubLObject prev_id = cursor_id = deleted_ids.first();
    SubLObject width = ONE_INTEGER;
    SubLObject cdolist_list_var = deleted_ids.rest();
    SubLObject id = NIL;
    id = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cursor_id = Numbers.add( cursor_id, ONE_INTEGER );
      if( cursor_id.numE( id ) )
      {
        width = Numbers.add( width, ONE_INTEGER );
      }
      else
      {
        if( width.numE( ONE_INTEGER ) )
        {
          gap_list = ConsesLow.cons( prev_id, gap_list );
        }
        else
        {
          gap_list = ConsesLow.cons( ConsesLow.cons( prev_id, width ), gap_list );
        }
        prev_id = id;
        cursor_id = id;
        width = ONE_INTEGER;
      }
      cdolist_list_var = cdolist_list_var.rest();
      id = cdolist_list_var.first();
    }
    if( width.numE( ONE_INTEGER ) )
    {
      gap_list = ConsesLow.cons( prev_id, gap_list );
    }
    else
    {
      gap_list = ConsesLow.cons( ConsesLow.cons( prev_id, width ), gap_list );
    }
    return Sequences.nreverse( gap_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 87188L)
  public static SubLObject transform_gap_list_to_delta_list(final SubLObject gap_list)
  {
    SubLObject cummulative = ZERO_INTEGER;
    SubLObject delta_list = NIL;
    SubLObject cdolist_list_var = gap_list;
    SubLObject gap_info = NIL;
    gap_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject gap_start = NIL;
      SubLObject gap_width = NIL;
      if( gap_info.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = gap_info;
        SubLObject start = NIL;
        SubLObject width = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
        start = current.first();
        current = ( width = current.rest() );
        gap_start = start;
        gap_width = width;
      }
      else if( gap_info.isNumber() )
      {
        gap_start = gap_info;
        gap_width = ONE_INTEGER;
      }
      else
      {
        Errors.error( $str146$Invalid_gap_list_format__Unclear_, gap_info );
      }
      cummulative = Numbers.add( cummulative, gap_width );
      delta_list = ConsesLow.cons( ConsesLow.cons( gap_start, cummulative ), delta_list );
      cdolist_list_var = cdolist_list_var.rest();
      gap_info = cdolist_list_var.first();
    }
    return Sequences.nreverse( delta_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 89457L)
  public static SubLObject renumber_id_using_delta_table(final SubLObject id, final SubLObject delta_table)
  {
    SubLObject left = ZERO_INTEGER;
    SubLObject right = Numbers.subtract( Sequences.length( delta_table ), ONE_INTEGER );
    while ( left.numLE( right ))
    {
      final SubLObject index = Numbers.integerDivide( Numbers.add( left, right ), TWO_INTEGER );
      final SubLObject deletion_info = Vectors.aref( delta_table, index );
      final SubLObject deleted_id = deletion_info.first();
      if( deleted_id.numE( id ) )
      {
        return $kw138$DELETED;
      }
      if( deleted_id.numL( id ) )
      {
        left = Numbers.add( index, ONE_INTEGER );
      }
      else
      {
        if( !deleted_id.numG( id ) )
        {
          continue;
        }
        right = Numbers.subtract( index, ONE_INTEGER );
      }
    }
    if( NIL != subl_promotions.non_negative_integer_p( right ) )
    {
      final SubLObject delete_info = Vectors.aref( delta_table, right );
      final SubLObject delta = delete_info.rest();
      final SubLObject renumbered_id = Numbers.subtract( id, delta );
      return renumbered_id;
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 94290L)
  public static SubLObject test_renumber_id_using_delta_table(final SubLObject deleted_ids, final SubLObject max_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject renumbered_ids = test_build_translation_map_for_id_renumbering( deleted_ids, max_id );
    final SubLObject delta_list = transform_gap_list_to_delta_list( transform_delete_list_to_gap_list( deleted_ids ) );
    final SubLObject delta_table = list_utilities.list2vector( delta_list );
    SubLObject id;
    SubLObject mapped_id;
    SubLObject renumbered_id;
    for( id = NIL, id = ZERO_INTEGER; id.numL( max_id ); id = Numbers.add( id, ONE_INTEGER ) )
    {
      mapped_id = Hashtables.gethash( id, renumbered_ids, UNPROVIDED );
      renumbered_id = NIL;
      if( $kw138$DELETED != mapped_id )
      {
        renumbered_id = renumber_id_using_delta_table( id, delta_table );
        if( !mapped_id.eql( renumbered_id ) )
        {
          if( !renumbered_id.isNumber() || !mapped_id.numE( renumbered_id ) )
          {
            Errors.error( $str141$Original_id__A_was_supposed_to_ma, id, mapped_id, renumbered_id );
          }
        }
      }
    }
    SubLObject cdolist_list_var = delta_list;
    SubLObject delta_info = NIL;
    delta_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject deleted_id = delta_info.first();
      final SubLObject renumbered_id2 = renumber_id_using_delta_table( deleted_id, delta_table );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw138$DELETED != renumbered_id2 )
      {
        Errors.error( $str150$ID__A_should_have_been_deleted_bu, renumbered_id2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      delta_info = cdolist_list_var.first();
    }
    return $kw142$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/number-utilities.lisp", position = 95719L)
  public static SubLObject test_build_translation_map_for_id_renumbering(final SubLObject deleted_ids, final SubLObject max_id)
  {
    final SubLObject renumbered_ids = Hashtables.make_hash_table( max_id, EQL, UNPROVIDED );
    SubLObject current = ZERO_INTEGER;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( max_id ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( Sequences.find( i, deleted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).isNumber() )
      {
        Hashtables.sethash( i, renumbered_ids, $kw138$DELETED );
      }
      else
      {
        Hashtables.sethash( i, renumbered_ids, current );
        current = Numbers.add( current, ONE_INTEGER );
      }
    }
    return renumbered_ids;
  }

  public static SubLObject declare_number_utilities_file()
  {
    SubLFiles.declareFunction( me, "f_1X", "1+", 1, 0, false );
    SubLFiles.declareFunction( me, "f_1_", "1-", 1, 0, false );
    SubLFiles.declareFunction( me, "f_2X", "2*", 1, 0, false );
    SubLFiles.declareFunction( me, "onep", "ONEP", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_boolean", "ENCODE-BOOLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_boolean", "DECODE-BOOLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "get_bit", "GET-BIT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_bit", "SET-BIT", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_bit", "CLEAR-BIT", 2, 0, false );
    SubLFiles.declareFunction( me, "div", "DIV", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_X", "SAFE-/", 2, 0, false );
    SubLFiles.declareFunction( me, "square", "SQUARE", 1, 0, false );
    SubLFiles.declareFunction( me, "cube", "CUBE", 1, 0, false );
    SubLFiles.declareFunction( me, "cubert", "CUBERT", 1, 0, false );
    SubLFiles.declareFunction( me, "bytep", "BYTEP", 1, 0, false );
    SubLFiles.declareFunction( me, "nil_or_integer_p", "NIL-OR-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_positive_integer_p", "POSSIBLY-POSITIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_integer_p", "LIST-OF-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_positive_integer_p", "LIST-OF-POSITIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_negative_integer_p", "LIST-OF-NEGATIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_non_negative_integer_p", "LIST-OF-NON-NEGATIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_of_non_positive_integer_p", "LIST-OF-NON-POSITIVE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_number_p", "POSITIVE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_negative_number_p", "NON-NEGATIVE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_positive_number_p", "NON-POSITIVE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_number_p", "NEGATIVE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "zero_number_p", "ZERO-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_zero_number_p", "NON-ZERO-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "probability_number_p", "PROBABILITY-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "percentile_p", "PERCENTILE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decimal_integer_length", "DECIMAL-INTEGER-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "significant_digits", "SIGNIFICANT-DIGITS", 2, 0, false );
    SubLFiles.declareFunction( me, "four_significant_digits", "FOUR-SIGNIFICANT-DIGITS", 1, 0, false );
    SubLFiles.declareFunction( me, "significant_digits_optimize_float", "SIGNIFICANT-DIGITS-OPTIMIZE-FLOAT", 1, 0, false );
    SubLFiles.declareFunction( me, "float_n", "FLOAT-N", 1, 1, false );
    SubLFiles.declareFunction( me, "round_up_to_the_nearest", "ROUND-UP-TO-THE-NEAREST", 2, 0, false );
    SubLFiles.declareFunction( me, "round_to_the_nearest", "ROUND-TO-THE-NEAREST", 2, 0, false );
    SubLFiles.declareFunction( me, "round_down_to_the_nearest", "ROUND-DOWN-TO-THE-NEAREST", 2, 0, false );
    SubLFiles.declareFunction( me, "greater_absP", "GREATER-ABS?", 2, 0, false );
    SubLFiles.declareFunction( me, "divides_evenly", "DIVIDES-EVENLY", 2, 0, false );
    SubLFiles.declareFunction( me, "integer_percent", "INTEGER-PERCENT", 1, 2, false );
    SubLFiles.declareFunction( me, "safe_percent", "SAFE-PERCENT", 1, 2, false );
    SubLFiles.declareFunction( me, "percent", "PERCENT", 1, 2, false );
    SubLFiles.declareFunction( me, "percentage_p", "PERCENTAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "percentage_to_probability", "PERCENTAGE-TO-PROBABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "percent_increase", "PERCENT-INCREASE", 2, 0, false );
    SubLFiles.declareFunction( me, "percent_decrease", "PERCENT-DECREASE", 2, 0, false );
    SubLFiles.declareFunction( me, "percent_faster", "PERCENT-FASTER", 2, 0, false );
    SubLFiles.declareFunction( me, "percent_slower", "PERCENT-SLOWER", 2, 0, false );
    SubLFiles.declareFunction( me, "log10", "LOG10", 1, 0, false );
    SubLFiles.declareFunction( me, "log2", "LOG2", 1, 0, false );
    SubLFiles.declareFunction( me, "expt10", "EXPT10", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_p", "POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_infinity", "NEGATIVE-INFINITY", 0, 0, false );
    SubLFiles.declareFunction( me, "positive_infinity", "POSITIVE-INFINITY", 0, 0, false );
    SubLFiles.declareFunction( me, "negative_infinity_p", "NEGATIVE-INFINITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_infinity_p", "POSITIVE-INFINITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "infinite_number_p", "INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_potentially_infinite_number_p", "NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_potentially_infinite_number_p", "POSITIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_negative_potentially_infinite_number_p", "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_E", "POTENTIALLY-INFINITE-NUMBER-=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_L", "POTENTIALLY-INFINITE-NUMBER-<", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_G", "POTENTIALLY-INFINITE-NUMBER->", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_LE", "POTENTIALLY-INFINITE-NUMBER-<=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_GE", "POTENTIALLY-INFINITE-NUMBER->=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_plus", "POTENTIALLY-INFINITE-NUMBER-PLUS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_minus", "POTENTIALLY-INFINITE-NUMBER-MINUS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_times", "POTENTIALLY-INFINITE-NUMBER-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_divided_by", "POTENTIALLY-INFINITE-NUMBER-DIVIDED-BY", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_max", "POTENTIALLY-INFINITE-NUMBER-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_min", "POTENTIALLY-INFINITE-NUMBER-MIN", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_log", "POTENTIALLY-INFINITE-NUMBER-LOG", 1, 1, false );
    SubLFiles.declareFunction( me, "potentially_infinite_number_exp", "POTENTIALLY-INFINITE-NUMBER-EXP", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_infinity_plus", "NEGATIVE-INFINITY-PLUS", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_infinity_plus", "POSITIVE-INFINITY-PLUS", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_infinity_minus", "NEGATIVE-INFINITY-MINUS", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_infinity_minus", "POSITIVE-INFINITY-MINUS", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_infinity_times", "NEGATIVE-INFINITY-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_infinity_times", "POSITIVE-INFINITY-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_infinity_X", "NEGATIVE-INFINITY-/", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_infinity_X", "POSITIVE-INFINITY-/", 1, 0, false );
    SubLFiles.declareFunction( me, "divided_by_negative_infinity", "DIVIDED-BY-NEGATIVE-INFINITY", 1, 0, false );
    SubLFiles.declareFunction( me, "divided_by_positive_infinity", "DIVIDED-BY-POSITIVE-INFINITY", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_potentially_infinite_number_p", "EXTENDED-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_p", "POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "infinite_integer_p", "INFINITE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_potentially_infinite_integer_p", "NEGATIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "positive_potentially_infinite_integer_p", "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_E", "POTENTIALLY-INFINITE-INTEGER-=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_L", "POTENTIALLY-INFINITE-INTEGER-<", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_G", "POTENTIALLY-INFINITE-INTEGER->", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_LE", "POTENTIALLY-INFINITE-INTEGER-<=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_GE", "POTENTIALLY-INFINITE-INTEGER->=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_plus", "POTENTIALLY-INFINITE-INTEGER-PLUS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_minus", "POTENTIALLY-INFINITE-INTEGER-MINUS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_times", "POTENTIALLY-INFINITE-INTEGER-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_times_number_rounded", "POTENTIALLY-INFINITE-INTEGER-TIMES-NUMBER-ROUNDED", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_divided_by", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_infinite_integer_divided_by_number_rounded", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY-NUMBER-ROUNDED", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_p", "POTENTIALLY-UNDEFINED-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "undefined", "UNDEFINED", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_E", "POTENTIALLY-UNDEFINED-NUMBER-=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_L", "POTENTIALLY-UNDEFINED-NUMBER-<", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_G", "POTENTIALLY-UNDEFINED-NUMBER->", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_LE", "POTENTIALLY-UNDEFINED-NUMBER-<=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_GE", "POTENTIALLY-UNDEFINED-NUMBER->=", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_plus", "POTENTIALLY-UNDEFINED-NUMBER-PLUS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_minus", "POTENTIALLY-UNDEFINED-NUMBER-MINUS", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_times", "POTENTIALLY-UNDEFINED-NUMBER-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "potentially_undefined_number_divided_by", "POTENTIALLY-UNDEFINED-NUMBER-DIVIDED-BY", 2, 0, false );
    SubLFiles.declareFunction( me, "maximum", "MAXIMUM", 1, 1, false );
    SubLFiles.declareFunction( me, "minimum", "MINIMUM", 1, 1, false );
    SubLFiles.declareFunction( me, "average", "AVERAGE", 1, 1, false );
    SubLFiles.declareFunction( me, "mean", "MEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "summation", "SUMMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "product", "PRODUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "geometric_mean", "GEOMETRIC-MEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "median", "MEDIAN", 1, 2, false );
    SubLFiles.declareFunction( me, "median_sorted", "MEDIAN-SORTED", 1, 3, false );
    SubLFiles.declareFunction( me, "percentile", "PERCENTILE", 2, 2, false );
    SubLFiles.declareFunction( me, "percentile_sorted", "PERCENTILE-SORTED", 2, 0, false );
    SubLFiles.declareFunction( me, "max_key_from_hash", "MAX-KEY-FROM-HASH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_frequency_list", "GET-FREQUENCY-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sorted_frequency_list", "GET-SORTED-FREQUENCY-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "mode", "MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "mode_sorted", "MODE-SORTED", 1, 0, false );
    SubLFiles.declareFunction( me, "variance_from_sample", "VARIANCE-FROM-SAMPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "variance_from_population", "VARIANCE-FROM-POPULATION", 1, 0, false );
    SubLFiles.declareFunction( me, "variance", "VARIANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_deviation_from_population", "STANDARD-DEVIATION-FROM-POPULATION", 1, 0, false );
    SubLFiles.declareFunction( me, "safe_standard_deviation_from_sample", "SAFE-STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_deviation_from_sample", "STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_deviation", "STANDARD-DEVIATION", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_deviations_above_mean", "STANDARD-DEVIATIONS-ABOVE-MEAN", 3, 0, false );
    SubLFiles.declareFunction( me, "simple_outliers", "SIMPLE-OUTLIERS", 1, 1, false );
    SubLFiles.declareFunction( me, "perform_standard_statistical_analysis", "PERFORM-STANDARD-STATISTICAL-ANALYSIS", 1, 1, false );
    SubLFiles.declareFunction( me, "correlation", "CORRELATION", 2, 0, false );
    SubLFiles.declareFunction( me, "decode_integer_multiples", "DECODE-INTEGER-MULTIPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "encode_integer_multiples", "ENCODE-INTEGER-MULTIPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "arithmetic_progression", "ARITHMETIC-PROGRESSION", 3, 0, false );
    SubLFiles.declareFunction( me, "geometric_progression", "GEOMETRIC-PROGRESSION", 3, 0, false );
    SubLFiles.declareFunction( me, "geometric_progression_ratio", "GEOMETRIC-PROGRESSION-RATIO", 3, 0, false );
    SubLFiles.declareFunction( me, "number_string_p", "NUMBER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "number_string_value", "NUMBER-STRING-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_number_string_char", "VALID-NUMBER-STRING-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_number_string_p", "EXTENDED-NUMBER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_exponent_marker", "VALID-EXPONENT-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_sign", "VALID-SIGN", 1, 0, false );
    SubLFiles.declareFunction( me, "find_smallest_prime_for_binary_width", "FIND-SMALLEST-PRIME-FOR-BINARY-WIDTH", 1, 0, false );
    SubLFiles.declareFunction( me, "checksum_sanity_check", "CHECKSUM-SANITY-CHECK", 0, 0, false );
    SubLFiles.declareFunction( me, "checksum_update", "CHECKSUM-UPDATE", 1, 0, false );
    SubLFiles.declareFunction( me, "checksum_finalize", "CHECKSUM-FINALIZE", 0, 0, false );
    SubLFiles.declareMacro( me, "checksum_setup", "CHECKSUM-SETUP" );
    SubLFiles.declareMacro( me, "checksum_start", "CHECKSUM-START" );
    SubLFiles.declareMacro( me, "checksum_resume", "CHECKSUM-RESUME" );
    SubLFiles.declareMacro( me, "with_checksum", "WITH-CHECKSUM" );
    SubLFiles.declareFunction( me, "expt_mod", "EXPT-MOD", 3, 0, false );
    SubLFiles.declareFunction( me, "binary_expt_mod", "BINARY-EXPT-MOD", 3, 0, false );
    SubLFiles.declareFunction( me, "convert_to_binary", "CONVERT-TO-BINARY", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_to_hexadecimal", "CONVERT-TO-HEXADECIMAL", 1, 0, false );
    SubLFiles.declareFunction( me, "modular_subtraction", "MODULAR-SUBTRACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "modular_addition", "MODULAR-ADDITION", 3, 0, false );
    SubLFiles.declareFunction( me, "modularE", "MODULAR=", 3, 0, false );
    SubLFiles.declareFunction( me, "number_of_digits", "NUMBER-OF-DIGITS", 1, 0, false );
    SubLFiles.declareFunction( me, "multiple_ofP", "MULTIPLE-OF?", 2, 0, false );
    SubLFiles.declareFunction( me, "multiple_of_allP", "MULTIPLE-OF-ALL?", 2, 0, false );
    SubLFiles.declareFunction( me, "prime_numberP", "PRIME-NUMBER?", 1, 0, false );
    SubLFiles.declareFunction( me, "prime_factorization", "PRIME-FACTORIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "common_prime_factors", "COMMON-PRIME-FACTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_smallest_divisor", "FIND-SMALLEST-DIVISOR", 1, 0, false );
    SubLFiles.declareFunction( me, "divisors", "DIVISORS", 1, 0, false );
    SubLFiles.declareFunction( me, "lcm", "LCM", 1, 0, false );
    SubLFiles.declareFunction( me, "lcm2", "LCM2", 2, 0, false );
    SubLFiles.declareFunction( me, "lcm2_internal", "LCM2-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "gcd", "GCD", 1, 0, false );
    SubLFiles.declareFunction( me, "gcd2", "GCD2", 2, 0, false );
    SubLFiles.declareFunction( me, "gcd2_internal", "GCD2-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "gcd2_sorted_internal", "GCD2-SORTED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_hexadecimal_to_decimal", "CONVERT-HEXADECIMAL-TO-DECIMAL", 1, 0, false );
    SubLFiles.declareFunction( me, "decimal_code_for_hex_digit", "DECIMAL-CODE-FOR-HEX-DIGIT", 1, 0, false );
    SubLFiles.declareMacro( me, "with_probability", "WITH-PROBABILITY" );
    SubLFiles.declareFunction( me, "probability_p", "PROBABILITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "true_with_probability", "TRUE-WITH-PROBABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "true_with_probability_int", "TRUE-WITH-PROBABILITY-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "logistic", "LOGISTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "coin_flip", "COIN-FLIP", 0, 0, false );
    SubLFiles.declareFunction( me, "probability_distribution_p", "PROBABILITY-DISTRIBUTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "probability_distribution_sample", "PROBABILITY-DISTRIBUTION-SAMPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "fibonacci", "FIBONACCI", 1, 0, false );
    SubLFiles.declareFunction( me, "fibonacci_memoized_internal", "FIBONACCI-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fibonacci_memoized", "FIBONACCI-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "random_0_1", "RANDOM-0-1", 0, 0, false );
    SubLFiles.declareFunction( me, "random_probability", "RANDOM-PROBABILITY", 0, 0, false );
    SubLFiles.declareFunction( me, "n_random_integers", "N-RANDOM-INTEGERS", 2, 1, false );
    SubLFiles.declareFunction( me, "non_negative_integers_less_than", "NON-NEGATIVE-INTEGERS-LESS-THAN", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_deltas", "COMPUTE-DELTAS", 1, 1, false );
    SubLFiles.declareFunction( me, "factorial", "FACTORIAL", 1, 0, false );
    SubLFiles.declareFunction( me, "choose", "CHOOSE", 2, 0, false );
    SubLFiles.declareFunction( me, "strictly_between_0_and_1_p", "STRICTLY-BETWEEN-0-AND-1-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strictly_between_0_and_minus_1_p", "STRICTLY-BETWEEN-0-AND-MINUS-1-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tolerance_E", "TOLERANCE-=", 2, 1, false );
    SubLFiles.declareFunction( me, "zero", "ZERO", 0, 1, false );
    SubLFiles.declareFunction( me, "one", "ONE", 0, 1, false );
    SubLFiles.declareFunction( me, "pairwise_slope", "PAIRWISE-SLOPE", 1, 0, false );
    SubLFiles.declareFunction( me, "values_to_coordinates", "VALUES-TO-COORDINATES", 1, 0, false );
    SubLFiles.declareFunction( me, "coordinates_to_values", "COORDINATES-TO-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "pairwise_slope_points", "PAIRWISE-SLOPE-POINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "average_neighbors", "AVERAGE-NEIGHBORS", 1, 1, false );
    SubLFiles.declareFunction( me, "renumber_id_using_table", "RENUMBER-ID-USING-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "test_renumber_id_using_table", "TEST-RENUMBER-ID-USING-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_delete_list_to_gap_list", "TRANSFORM-DELETE-LIST-TO-GAP-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_gap_list_to_delta_list", "TRANSFORM-GAP-LIST-TO-DELTA-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "renumber_id_using_delta_table", "RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "test_renumber_id_using_delta_table", "TEST-RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "test_build_translation_map_for_id_renumbering", "TEST-BUILD-TRANSLATION-MAP-FOR-ID-RENUMBERING", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_number_utilities_file()
  {
    $large_immediate_positive_integer$ = SubLFiles.deflexical( "*LARGE-IMMEDIATE-POSITIVE-INTEGER*", Numbers.expt( TWO_INTEGER, $int2$26 ) );
    $e$ = SubLFiles.defconstant( "*E*", Numbers.$exp1$.getGlobalValue() );
    $maximum_float_significant_digits$ = SubLFiles.deflexical( "*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*", SIXTEEN_INTEGER );
    $valid_number_string_characters$ = SubLFiles.deflexical( "*VALID-NUMBER-STRING-CHARACTERS*", $str79$0123456789___deDE );
    $valid_exponent_markers$ = SubLFiles.deflexical( "*VALID-EXPONENT-MARKERS*", $str81$deDE );
    $valid_sign$ = SubLFiles.deflexical( "*VALID-SIGN*", $str82$__ );
    $largest_prime_by_binary_width$ = SubLFiles.defconstant( "*LARGEST-PRIME-BY-BINARY-WIDTH*", $list83 );
    $checksum_implementation_width$ = SubLFiles.defconstant( "*CHECKSUM-IMPLEMENTATION-WIDTH*", Numbers.truncate( Numbers.log( Numbers.abs( Numbers.$most_negative_fixnum$.getGlobalValue() ), TWO_INTEGER ),
        UNPROVIDED ) );
    $checksum_base$ = SubLFiles.defconstant( "*CHECKSUM-BASE*", conses_high.assoc( $checksum_implementation_width$.getGlobalValue(), $largest_prime_by_binary_width$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest() );
    $checksum_initial_value_sum$ = SubLFiles.defconstant( "*CHECKSUM-INITIAL-VALUE-SUM*", ONE_INTEGER );
    $checksum_initial_value_length$ = SubLFiles.defconstant( "*CHECKSUM-INITIAL-VALUE-LENGTH*", ZERO_INTEGER );
    $checksum_sum$ = SubLFiles.defparameter( "*CHECKSUM-SUM*", ONE_INTEGER );
    $checksum_length$ = SubLFiles.defparameter( "*CHECKSUM-LENGTH*", ZERO_INTEGER );
    $hex_to_dec_table$ = SubLFiles.defparameter( "*HEX-TO-DEC-TABLE*", $list115 );
    return NIL;
  }

  public static SubLObject setup_number_utilities_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list0 );
    SubLSpecialOperatorDeclarations.proclaim( $list1 );
    utilities_macros.register_cyc_api_function( $sym5$NIL_OR_INTEGER_P, $list6, $str7$Return_T_iff_OBJECT_is_either_an_, NIL, $list8 );
    generic_testing.define_test_case_table_int( $sym84$CHECKSUM_SANITY_CHECK, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list91 );
    access_macros.register_macro_helper( $sym92$CHECKSUM_SETUP, $list93 );
    generic_testing.define_test_case_table_int( $sym108$FIND_SMALLEST_DIVISOR, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list109 );
    memoization_state.note_memoized_function( $sym128$FIBONACCI_MEMOIZED );
    generic_testing.define_test_case_table_int( $sym136$AVERAGE_NEIGHBORS, ConsesLow.list( new SubLObject[] { $kw85$TEST, EQUALP, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list137 );
    generic_testing.define_test_case_table_int( $sym139$TEST_RENUMBER_ID_USING_TABLE, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list140 );
    generic_testing.define_test_case_table_int( $sym143$TRANSFORM_DELETE_LIST_TO_GAP_LIST, ConsesLow.list( new SubLObject[] { $kw85$TEST, Symbols.symbol_function( EQUAL ), $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB,
      $kw89$TINY, $kw90$WORKING_, T
    } ), $list144 );
    generic_testing.define_test_case_table_int( $sym147$TRANSFORM_GAP_LIST_TO_DELTA_LIST, ConsesLow.list( new SubLObject[] { $kw85$TEST, Symbols.symbol_function( EQUAL ), $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB,
      $kw89$TINY, $kw90$WORKING_, T
    } ), $list148 );
    generic_testing.define_test_case_table_int( $sym149$TEST_RENUMBER_ID_USING_DELTA_TABLE, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_,
      T
    } ), $list140 );
    generic_testing.define_test_case_table_int( $sym151$PRIME_NUMBER_, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list152 );
    generic_testing.define_test_case_table_int( $sym108$FIND_SMALLEST_DIVISOR, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list153 );
    generic_testing.define_test_case_table_int( $sym154$MEDIAN, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list155 );
    generic_testing.define_test_case_table_int( $sym156$COMPUTE_DELTAS, ConsesLow.list( new SubLObject[] { $kw85$TEST, NIL, $kw86$OWNER, NIL, $kw87$CLASSES, NIL, $kw88$KB, $kw89$TINY, $kw90$WORKING_, T
    } ), $list157 );
    return NIL;
  }

  private static SubLObject _constant_140_initializer()
  {
    return ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, FOUR_INTEGER, SEVEN_INTEGER, TEN_INTEGER ), TWELVE_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
        .list( new SubLObject[]
        { ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger( 27 ), makeInteger( 57 ), makeInteger( 59 ), makeInteger( 64 ),
          makeInteger( 250 ), makeInteger( 361 ), makeInteger( 365 ), makeInteger( 366 ), makeInteger( 367 ), makeInteger( 368 ), makeInteger( 369 ), makeInteger( 374 ), makeInteger( 375 ), makeInteger( 378 ),
          makeInteger( 429 ), makeInteger( 430 ), makeInteger( 436 ), makeInteger( 442 ), makeInteger( 473 ), makeInteger( 510 ), makeInteger( 538 ), makeInteger( 539 ), makeInteger( 555 ), makeInteger( 614 ),
          makeInteger( 623 ), makeInteger( 624 ), makeInteger( 643 ), makeInteger( 1041 ), makeInteger( 1062 ), makeInteger( 1064 ), makeInteger( 1092 ), makeInteger( 1096 ), makeInteger( 1098 ), makeInteger( 1102 ),
          makeInteger( 1146 ), makeInteger( 1147 ), makeInteger( 1150 ), makeInteger( 1251 ), makeInteger( 1252 ), makeInteger( 1471 ), makeInteger( 1475 ), makeInteger( 1485 )
    } ), makeInteger( 1460 ) ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
      SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER,
      NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ), makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 ), makeInteger( 29 ),
      makeInteger( 30 ), makeInteger( 31 ), makeInteger( 32 ), makeInteger( 33 ), makeInteger( 34 ), makeInteger( 35 ), makeInteger( 36 ), makeInteger( 37 ), makeInteger( 38 ), makeInteger( 39 ), makeInteger( 40 ),
      makeInteger( 41 ), makeInteger( 42 ), makeInteger( 43 ), makeInteger( 44 ), makeInteger( 45 ), makeInteger( 46 ), makeInteger( 47 ), makeInteger( 48 ), makeInteger( 49 ), makeInteger( 50 ), makeInteger( 51 ),
      makeInteger( 52 ), makeInteger( 53 ), makeInteger( 54 ), makeInteger( 55 ), makeInteger( 56 ), makeInteger( 57 ), makeInteger( 58 ), makeInteger( 59 ), makeInteger( 60 ), makeInteger( 61 ), makeInteger( 62 ),
      makeInteger( 63 ), makeInteger( 64 ), makeInteger( 65 ), makeInteger( 66 ), makeInteger( 67 ), makeInteger( 68 ), makeInteger( 69 ), makeInteger( 70 ), makeInteger( 71 ), makeInteger( 72 ), makeInteger( 73 ),
      makeInteger( 80 ), makeInteger( 82 ), makeInteger( 83 ), makeInteger( 301 ), makeInteger( 302 ), makeInteger( 309 ), makeInteger( 316 ), makeInteger( 317 ), makeInteger( 351 ), makeInteger( 352 ), makeInteger(
          353 ), makeInteger( 884 ), makeInteger( 885 ), makeInteger( 886 ), makeInteger( 887 ), makeInteger( 888 ), makeInteger( 889 ), makeInteger( 890 ), makeInteger( 891 ), makeInteger( 892 ), makeInteger( 893 ),
      makeInteger( 894 ), makeInteger( 895 ), makeInteger( 896 ), makeInteger( 897 ), makeInteger( 898 ), makeInteger( 899 ), makeInteger( 900 ), makeInteger( 901 ), makeInteger( 902 ), makeInteger( 903 ), makeInteger(
          904 ), makeInteger( 905 ), makeInteger( 906 ), makeInteger( 907 ), makeInteger( 908 ), makeInteger( 909 ), makeInteger( 910 ), makeInteger( 911 ), makeInteger( 912 ), makeInteger( 913 ), makeInteger( 914 ),
      makeInteger( 915 ), makeInteger( 916 ), makeInteger( 917 ), makeInteger( 918 ), makeInteger( 919 ), makeInteger( 920 ), makeInteger( 921 ), makeInteger( 922 ), makeInteger( 923 ), makeInteger( 924 ), makeInteger(
          925 ), makeInteger( 926 ), makeInteger( 927 ), makeInteger( 928 ), makeInteger( 929 ), makeInteger( 930 ), makeInteger( 931 ), makeInteger( 932 ), makeInteger( 933 ), makeInteger( 934 ), makeInteger( 935 ),
      makeInteger( 936 ), makeInteger( 937 ), makeInteger( 938 ), makeInteger( 939 ), makeInteger( 940 ), makeInteger( 941 ), makeInteger( 942 ), makeInteger( 943 ), makeInteger( 944 ), makeInteger( 945 ), makeInteger(
          946 ), makeInteger( 947 ), makeInteger( 948 ), makeInteger( 949 ), makeInteger( 950 ), makeInteger( 951 ), makeInteger( 952 ), makeInteger( 953 ), makeInteger( 954 ), makeInteger( 955 ), makeInteger( 956 ),
      makeInteger( 957 ), makeInteger( 958 ), makeInteger( 959 ), makeInteger( 960 ), makeInteger( 961 ), makeInteger( 962 ), makeInteger( 963 ), makeInteger( 964 ), makeInteger( 965 ), makeInteger( 966 ), makeInteger(
          967 ), makeInteger( 968 ), makeInteger( 969 ), makeInteger( 970 ), makeInteger( 971 ), makeInteger( 972 ), makeInteger( 973 ), makeInteger( 974 ), makeInteger( 984 ), makeInteger( 985 ), makeInteger( 986 ),
      makeInteger( 1324 ), makeInteger( 1325 ), makeInteger( 1326 ), makeInteger( 1327 ), makeInteger( 1619 ), makeInteger( 1629 ), makeInteger( 1630 ), makeInteger( 1631 ), makeInteger( 1632 ), makeInteger( 1641 ),
      makeInteger( 1642 ), makeInteger( 1643 ), makeInteger( 1645 ), makeInteger( 1646 ), makeInteger( 1647 ), makeInteger( 1649 ), makeInteger( 1650 ), makeInteger( 1651 ), makeInteger( 1653 ), makeInteger( 1655 ),
      makeInteger( 1656 ), makeInteger( 1657 ), makeInteger( 1658 ), makeInteger( 1723 ), makeInteger( 1729 ), makeInteger( 1733 ), makeInteger( 1740 ), makeInteger( 1741 ), makeInteger( 1742 ), makeInteger( 1743 ),
      makeInteger( 1745 ), makeInteger( 1756 ), makeInteger( 1757 ), makeInteger( 1758 ), makeInteger( 1759 ), makeInteger( 1760 ), makeInteger( 1810 ), makeInteger( 1834 ), makeInteger( 1835 ), makeInteger( 1868 ),
      makeInteger( 2084 ), makeInteger( 2145 ), makeInteger( 2146 ), makeInteger( 2170 ), makeInteger( 2185 ), makeInteger( 2186 ), makeInteger( 2187 ), makeInteger( 2194 ), makeInteger( 2198 ), makeInteger( 2201 ),
      makeInteger( 2202 ), makeInteger( 2203 ), makeInteger( 2204 ), makeInteger( 2205 ), makeInteger( 2207 ), makeInteger( 2211 ), makeInteger( 2215 ), makeInteger( 2216 ), makeInteger( 2218 ), makeInteger( 2223 ),
      makeInteger( 2226 ), makeInteger( 2227 ), makeInteger( 2228 ), makeInteger( 2256 ), makeInteger( 2263 ), makeInteger( 2269 ), makeInteger( 2270 ), makeInteger( 2271 ), makeInteger( 2273 ), makeInteger( 2277 ),
      makeInteger( 2278 ), makeInteger( 2283 ), makeInteger( 2287 ), makeInteger( 2289 ), makeInteger( 2291 ), makeInteger( 2292 ), makeInteger( 2293 ), makeInteger( 2295 ), makeInteger( 2296 ), makeInteger( 2297 ),
      makeInteger( 2299 ), makeInteger( 2316 ), makeInteger( 2319 ), makeInteger( 2321 ), makeInteger( 2323 ), makeInteger( 2324 ), makeInteger( 2325 ), makeInteger( 2330 ), makeInteger( 2332 ), makeInteger( 2337 ),
      makeInteger( 2351 ), makeInteger( 2364 ), makeInteger( 2365 ), makeInteger( 2367 ), makeInteger( 2368 ), makeInteger( 2372 ), makeInteger( 2375 ), makeInteger( 2378 ), makeInteger( 2385 ), makeInteger( 2386 ),
      makeInteger( 2390 ), makeInteger( 2391 ), makeInteger( 2395 ), makeInteger( 2402 ), makeInteger( 2409 ), makeInteger( 2410 ), makeInteger( 2415 ), makeInteger( 2418 ), makeInteger( 2422 ), makeInteger( 2429 ),
      makeInteger( 2435 ), makeInteger( 2437 ), makeInteger( 2439 ), makeInteger( 2445 ), makeInteger( 2446 ), makeInteger( 2450 ), makeInteger( 2452 ), makeInteger( 2453 ), makeInteger( 2454 ), makeInteger( 2455 ),
      makeInteger( 2457 ), makeInteger( 2458 ), makeInteger( 2462 ), makeInteger( 2463 ), makeInteger( 2470 ), makeInteger( 2471 ), makeInteger( 2474 ), makeInteger( 2475 ), makeInteger( 2477 ), makeInteger( 2479 ),
      makeInteger( 2484 ), makeInteger( 2487 ), makeInteger( 2488 ), makeInteger( 2491 ), makeInteger( 2494 ), makeInteger( 2497 ), makeInteger( 2500 ), makeInteger( 2502 ), makeInteger( 2505 ), makeInteger( 2506 ),
      makeInteger( 2507 ), makeInteger( 2509 ), makeInteger( 2512 ), makeInteger( 2513 ), makeInteger( 2515 ), makeInteger( 2516 ), makeInteger( 2517 ), makeInteger( 2518 ), makeInteger( 2531 ), makeInteger( 2532 ),
      makeInteger( 2548 ), makeInteger( 2549 ), makeInteger( 2556 ), makeInteger( 2559 ), makeInteger( 3315 ), makeInteger( 3317 ), makeInteger( 3318 ), makeInteger( 3319 ), makeInteger( 3339 ), makeInteger( 3342 ),
      makeInteger( 3344 ), makeInteger( 3372 ), makeInteger( 3373 ), makeInteger( 3374 ), makeInteger( 3375 ), makeInteger( 3376 ), makeInteger( 3377 ), makeInteger( 3378 ), makeInteger( 3379 ), makeInteger( 3380 ),
      makeInteger( 3381 ), makeInteger( 3382 ), makeInteger( 3383 ), makeInteger( 3384 ), makeInteger( 3385 ), makeInteger( 3386 ), makeInteger( 3387 ), makeInteger( 3388 ), makeInteger( 3389 ), makeInteger( 3390 ),
      makeInteger( 3391 ), makeInteger( 3392 ), makeInteger( 3393 ), makeInteger( 3394 ), makeInteger( 3395 ), makeInteger( 3396 ), makeInteger( 3397 ), makeInteger( 3398 ), makeInteger( 3399 ), makeInteger( 3400 ),
      makeInteger( 3401 ), makeInteger( 3402 ), makeInteger( 3403 ), makeInteger( 3404 ), makeInteger( 3405 ), makeInteger( 3406 ), makeInteger( 3407 ), makeInteger( 3408 ), makeInteger( 3409 ), makeInteger( 3410 ),
      makeInteger( 3411 ), makeInteger( 3412 ), makeInteger( 3413 ), makeInteger( 3414 ), makeInteger( 3415 ), makeInteger( 3416 ), makeInteger( 3417 ), makeInteger( 3418 ), makeInteger( 3419 ), makeInteger( 3420 ),
      makeInteger( 3421 ), makeInteger( 3422 ), makeInteger( 3423 ), makeInteger( 3424 ), makeInteger( 3425 ), makeInteger( 3426 ), makeInteger( 3427 ), makeInteger( 3428 ), makeInteger( 3429 ), makeInteger( 3430 ),
      makeInteger( 3431 ), makeInteger( 3432 ), makeInteger( 3433 ), makeInteger( 3434 ), makeInteger( 3435 ), makeInteger( 3437 ), makeInteger( 3438 ), makeInteger( 3439 ), makeInteger( 3440 ), makeInteger( 3441 ),
      makeInteger( 3442 ), makeInteger( 3443 ), makeInteger( 3444 ), makeInteger( 3445 ), makeInteger( 3446 ), makeInteger( 3447 ), makeInteger( 3448 ), makeInteger( 3449 ), makeInteger( 3450 ), makeInteger( 3451 ),
      makeInteger( 3452 ), makeInteger( 3461 ), makeInteger( 3463 ), makeInteger( 3464 ), makeInteger( 3465 ), makeInteger( 3466 ), makeInteger( 3467 ), makeInteger( 3476 ), makeInteger( 3477 ), makeInteger( 3482 ),
      makeInteger( 3485 ), makeInteger( 3486 ), makeInteger( 3490 ), makeInteger( 3491 ), makeInteger( 3493 ), makeInteger( 3496 ), makeInteger( 3506 ), makeInteger( 3507 ), makeInteger( 3514 ), makeInteger( 3598 ),
      makeInteger( 3600 ), makeInteger( 3607 ), makeInteger( 3608 ), makeInteger( 3609 ), makeInteger( 3610 ), makeInteger( 3611 ), makeInteger( 3612 ), makeInteger( 3613 ), makeInteger( 3614 ), makeInteger( 3615 ),
      makeInteger( 3616 ), makeInteger( 3617 ), makeInteger( 3618 ), makeInteger( 3632 ), makeInteger( 3637 ), makeInteger( 3638 ), makeInteger( 3639 ), makeInteger( 3640 ), makeInteger( 3641 ), makeInteger( 3642 ),
      makeInteger( 3647 ), makeInteger( 3648 ), makeInteger( 3652 ), makeInteger( 3653 ), makeInteger( 3654 ), makeInteger( 3657 ), makeInteger( 3658 ), makeInteger( 3727 ), makeInteger( 3739 ), makeInteger( 3750 ),
      makeInteger( 3753 ), makeInteger( 3756 ), makeInteger( 3764 ), makeInteger( 3769 ), makeInteger( 3770 ), makeInteger( 3793 ), makeInteger( 3796 ), makeInteger( 3810 ), makeInteger( 3827 ), makeInteger( 3829 ),
      makeInteger( 3830 ), makeInteger( 3833 ), makeInteger( 3834 ), makeInteger( 3835 ), makeInteger( 3859 ), makeInteger( 3860 ), makeInteger( 3877 ), makeInteger( 3878 ), makeInteger( 3879 ), makeInteger( 3880 ),
      makeInteger( 3881 ), makeInteger( 3882 ), makeInteger( 3885 ), makeInteger( 3886 ), makeInteger( 4013 ), makeInteger( 4038 ), makeInteger( 4039 ), makeInteger( 4040 ), makeInteger( 4100 ), makeInteger( 4149 ),
      makeInteger( 4150 )
    } ), makeInteger( 4160 ) ), makeKeyword( "SUCCESS" ) ) );
  }

  @Override
  public void declareFunctions()
  {
    declare_number_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_number_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_number_utilities_file();
  }
  static
  {
    me = new number_utilities();
    $large_immediate_positive_integer$ = null;
    $e$ = null;
    $maximum_float_significant_digits$ = null;
    $valid_number_string_characters$ = null;
    $valid_exponent_markers$ = null;
    $valid_sign$ = null;
    $largest_prime_by_binary_width$ = null;
    $checksum_implementation_width$ = null;
    $checksum_base$ = null;
    $checksum_initial_value_sum$ = null;
    $checksum_initial_value_length$ = null;
    $checksum_sum$ = null;
    $checksum_length$ = null;
    $hex_to_dec_table$ = null;
    $list0 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "ENCODE-BOOLEAN" ), makeSymbol( "DECODE-BOOLEAN" ) );
    $list1 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "GET-BIT" ), makeSymbol( "SET-BIT" ), makeSymbol( "CLEAR-BIT" ) );
    $int2$26 = makeInteger( 26 );
    $sym3$NUMBERP = makeSymbol( "NUMBERP" );
    $int4$256 = makeInteger( 256 );
    $sym5$NIL_OR_INTEGER_P = makeSymbol( "NIL-OR-INTEGER-P" );
    $list6 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str7$Return_T_iff_OBJECT_is_either_an_ = SubLObjectFactory.makeString( "Return T iff OBJECT is either an integer or NIL" );
    $list8 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $kw9$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym10$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym11$INTEGERP = makeSymbol( "INTEGERP" );
    $sym12$EXTENDED_POTENTIALLY_INFINITE_NUMBER_P = SubLObjectFactory.makeSymbol( "EXTENDED-POTENTIALLY-INFINITE-NUMBER-P" );
    $sym13$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $list14 = ConsesLow.list( ZERO_INTEGER, MINUS_ONE_INTEGER, ONE_INTEGER, makeInteger( -2 ), TWO_INTEGER );
    $int15$100 = makeInteger( 100 );
    $str16$NEW_must_be_larger_than_OLD = makeString( "NEW must be larger than OLD" );
    $str17$NEW_must_be_smaller_than_OLD = makeString( "NEW must be smaller than OLD" );
    $kw18$NEGATIVE_INFINITY = makeKeyword( "NEGATIVE-INFINITY" );
    $kw19$POSITIVE_INFINITY = makeKeyword( "POSITIVE-INFINITY" );
    $sym20$POTENTIALLY_INFINITE_NUMBER_P = makeSymbol( "POTENTIALLY-INFINITE-NUMBER-P" );
    $str21$Can_t_divide_zero_by_zero = makeString( "Can't divide zero by zero" );
    $sym22$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P" );
    $str23$Can_t_add_positive_infinity_and_n = SubLObjectFactory.makeString( "Can't add positive infinity and negative infinity" );
    $str24$Can_t_subtract_negative_infinity_ = SubLObjectFactory.makeString( "Can't subtract negative infinity from itself" );
    $str25$Can_t_subtract_positive_infinity_ = SubLObjectFactory.makeString( "Can't subtract positive infinity from itself" );
    $str26$Can_t_multiply_infinity_and_zero = makeString( "Can't multiply infinity and zero" );
    $str27$Can_t_divide_negative_infinity_by = SubLObjectFactory.makeString( "Can't divide negative infinity by itself" );
    $str28$Can_t_divide_negative_infinity_by = SubLObjectFactory.makeString( "Can't divide negative infinity by positive infinity" );
    $str29$Can_t_divide_positive_infinity_by = SubLObjectFactory.makeString( "Can't divide positive infinity by negative infinity" );
    $str30$Can_t_divide_positive_infinity_by = SubLObjectFactory.makeString( "Can't divide positive infinity by itself" );
    $sym31$POTENTIALLY_INFINITE_INTEGER_P = makeSymbol( "POTENTIALLY-INFINITE-INTEGER-P" );
    $kw32$UNDEFINED = makeKeyword( "UNDEFINED" );
    $sym33$POTENTIALLY_UNDEFINED_NUMBER_P = makeSymbol( "POTENTIALLY-UNDEFINED-NUMBER-P" );
    $str34$Cannot_compute_the_maximum_of_an_ = SubLObjectFactory.makeString( "Cannot compute the maximum of an atom or empty list" );
    $sym35$_ = makeSymbol( ">" );
    $str36$Cannot_compute_the_minimum_of_an_ = SubLObjectFactory.makeString( "Cannot compute the minimum of an atom or empty list" );
    $sym37$_ = makeSymbol( "<" );
    $str38$Cannot_compute_the_mean_of_an_ato = SubLObjectFactory.makeString( "Cannot compute the mean of an atom or empty list" );
    $str39$Cannot_compute_the_geometric_mean = SubLObjectFactory.makeString( "Cannot compute the geometric mean of an atom or empty list" );
    $kw40$VALUE = makeKeyword( "VALUE" );
    $str41$Cannot_compute_the_median_of_an_a = SubLObjectFactory.makeString( "Cannot compute the median of an atom or empty list" );
    $kw42$ITEM = makeKeyword( "ITEM" );
    $str43$Can_t_return_middle_item_from_an_ = SubLObjectFactory.makeString( "Can't return middle item from an even-length list." );
    $str44$Unrecognized_RETURN_type__S = makeString( "Unrecognized RETURN type ~S" );
    $sym45$PERCENTILE_P = makeSymbol( "PERCENTILE-P" );
    $str46$Cannot_compute_the_percentile_of_ = SubLObjectFactory.makeString( "Cannot compute the percentile of an atom or empty list" );
    $str47$Cannot_compute_frequencies_of_an_ = SubLObjectFactory.makeString( "Cannot compute frequencies of an atom or empty list" );
    $sym48$CDR = makeSymbol( "CDR" );
    $str49$Cannot_compute_the_mode_of_an_ato = SubLObjectFactory.makeString( "Cannot compute the mode of an atom or empty list" );
    $str50$Cannot_compute_the_variance_of_an = SubLObjectFactory.makeString( "Cannot compute the variance of an atom or empty list" );
    $str51$Cannot_compute_the_standard_devia = SubLObjectFactory.makeString( "Cannot compute the standard deviation of an atom or empty list" );
    $str52$Standard_deviation_must_not_be_ze = makeString( "Standard deviation must not be zero." );
    $sym53$__ = makeSymbol( ">=" );
    $sym54$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str55$__Standard_Statistical_Analysis = makeString( "~%Standard Statistical Analysis" );
    $str56$_______________________________ = makeString( "~%=============================" );
    $str57$__Count______6D = makeString( "~%Count   : ~6D" );
    $str58$__Min________6D = makeString( "~%Min     : ~6D" );
    $str59$__Median_____6D = makeString( "~%Median  : ~6D" );
    $str60$__Mean_______6D = makeString( "~%Mean    : ~6D" );
    $str61$__Max________6D = makeString( "~%Max     : ~6D" );
    $str62$__Std_Dev____6D = makeString( "~%Std Dev : ~6D" );
    $str63$X_Values_and_Y_Values_must_be_of_ = SubLObjectFactory.makeString( "X-Values and Y-Values must be of the same length ~A." );
    $float64$1_0 = makeDouble( 1.0 );
    $sym65$LISTP = makeSymbol( "LISTP" );
    $str66$length_must_be_at_least_2_ = makeString( "length must be at least 2." );
    $str67$Cannot_start_at_1_ = makeString( "Cannot start at 1." );
    $str68$Cannot_end_at_1_ = makeString( "Cannot end at 1." );
    $str69$Cannot_start_at_or_below_0_ = makeString( "Cannot start at or below 0." );
    $str70$Cannot_end_at_or_below_0_ = makeString( "Cannot end at or below 0." );
    $str71$Length_must_be_at_least_1_ = makeString( "Length must be at least 1." );
    $str72$Length_must_be_at_least_2_ = makeString( "Length must be at least 2." );
    $kw73$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym74$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str75$This_integer_is_too_large_to_be_c = SubLObjectFactory.makeString( "This integer is too large to be converted to a double-float" );
    $str76$_A = makeString( "~A" );
    $sym77$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $sym78$VALID_NUMBER_STRING_CHAR = makeSymbol( "VALID-NUMBER-STRING-CHAR" );
    $str79$0123456789___deDE = makeString( "0123456789.-+deDE" );
    $sym80$VALID_EXPONENT_MARKER = makeSymbol( "VALID-EXPONENT-MARKER" );
    $str81$deDE = makeString( "deDE" );
    $str82$__ = makeString( "+-" );
    $list83 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( TWO_INTEGER, THREE_INTEGER ), ConsesLow.cons( THREE_INTEGER, SEVEN_INTEGER ), ConsesLow.cons( FOUR_INTEGER, THIRTEEN_INTEGER ), ConsesLow.cons(
        FIVE_INTEGER, makeInteger( 31 ) ), ConsesLow.cons( SIX_INTEGER, makeInteger( 61 ) ), ConsesLow.cons( SEVEN_INTEGER, makeInteger( 127 ) ), ConsesLow.cons( EIGHT_INTEGER, makeInteger( 251 ) ), ConsesLow.cons(
            NINE_INTEGER, makeInteger( 509 ) ), ConsesLow.cons( TEN_INTEGER, makeInteger( 1021 ) ), ConsesLow.cons( ELEVEN_INTEGER, makeInteger( 2039 ) ), ConsesLow.cons( TWELVE_INTEGER, makeInteger( 4093 ) ), ConsesLow
                .cons( THIRTEEN_INTEGER, makeInteger( 8191 ) ), ConsesLow.cons( FOURTEEN_INTEGER, makeInteger( 16381 ) ), ConsesLow.cons( FIFTEEN_INTEGER, makeInteger( 32749 ) ), ConsesLow.cons( SIXTEEN_INTEGER,
                    makeInteger( 65521 ) ), ConsesLow.cons( SEVENTEEN_INTEGER, makeInteger( 131071 ) ), ConsesLow.cons( EIGHTEEN_INTEGER, makeInteger( 262139 ) ), ConsesLow.cons( NINETEEN_INTEGER, makeInteger(
                        524287 ) ), ConsesLow.cons( TWENTY_INTEGER, makeInteger( 1048573 ) ), ConsesLow.cons( makeInteger( 21 ), makeInteger( 2097143 ) ), ConsesLow.cons( makeInteger( 22 ), makeInteger( 4194301 ) ),
      ConsesLow.cons( makeInteger( 23 ), makeInteger( 8388593 ) ), ConsesLow.cons( makeInteger( 24 ), makeInteger( 16777213 ) ), ConsesLow.cons( makeInteger( 25 ), makeInteger( 33554393 ) ), ConsesLow.cons( makeInteger(
          26 ), makeInteger( 67108859 ) ), ConsesLow.cons( makeInteger( 27 ), makeInteger( 134217689 ) ), ConsesLow.cons( makeInteger( 28 ), makeInteger( 268435399 ) ), ConsesLow.cons( makeInteger( 29 ), makeInteger(
              536870909 ) ), ConsesLow.cons( makeInteger( 30 ), makeInteger( 1073741789 ) ), ConsesLow.cons( makeInteger( 31 ), makeInteger( Integer.MAX_VALUE ) ), ConsesLow.cons( makeInteger( 32 ), makeInteger(
                  "4294967291" ) ), ConsesLow.cons( makeInteger( 33 ), makeInteger( "8589934583" ) ), ConsesLow.cons( makeInteger( 34 ), makeInteger( "17179869143" ) ), ConsesLow.cons( makeInteger( 35 ), makeInteger(
                      "34359738337" ) ), ConsesLow.cons( makeInteger( 36 ), makeInteger( "68719476731" ) ), ConsesLow.cons( makeInteger( 37 ), makeInteger( "137438953447" ) ), ConsesLow.cons( makeInteger( 38 ),
                          makeInteger( "274877906899" ) ), ConsesLow.cons( makeInteger( 39 ), makeInteger( "549755813881" ) ), ConsesLow.cons( makeInteger( 40 ), makeInteger( "1099511627689" ) ), ConsesLow.cons(
                              makeInteger( 41 ), makeInteger( "2199023255531" ) ), ConsesLow.cons( makeInteger( 42 ), makeInteger( "4398046511093" ) ), ConsesLow.cons( makeInteger( 43 ), makeInteger( "8796093022151" ) ),
      ConsesLow.cons( makeInteger( 44 ), makeInteger( "17592186044399" ) ), ConsesLow.cons( makeInteger( 45 ), makeInteger( "35184372088777" ) ), ConsesLow.cons( makeInteger( 46 ), makeInteger( "70368744177643" ) ),
      ConsesLow.cons( makeInteger( 47 ), makeInteger( "140737488355213" ) ), ConsesLow.cons( makeInteger( 48 ), makeInteger( "281474976710597" ) ), ConsesLow.cons( makeInteger( 49 ), makeInteger( "562949953421231" ) ),
      ConsesLow.cons( makeInteger( 50 ), makeInteger( "1125899906842597" ) ), ConsesLow.cons( makeInteger( 51 ), makeInteger( "2251799813685119" ) ), ConsesLow.cons( makeInteger( 52 ), makeInteger(
          "4503599627370449" ) ), ConsesLow.cons( makeInteger( 53 ), makeInteger( "9007199254740881" ) ), ConsesLow.cons( makeInteger( 54 ), makeInteger( "18014398509481951" ) ), ConsesLow.cons( makeInteger( 55 ),
              makeInteger( "36028797018963913" ) ), ConsesLow.cons( makeInteger( 56 ), makeInteger( "72057594037927931" ) ), ConsesLow.cons( makeInteger( 57 ), makeInteger( "144115188075855859" ) ), ConsesLow.cons(
                  makeInteger( 58 ), makeInteger( "288230376151711717" ) ), ConsesLow.cons( makeInteger( 59 ), makeInteger( "576460752303423433" ) ), ConsesLow.cons( makeInteger( 60 ), makeInteger(
                      "1152921504606846883" ) ), ConsesLow.cons( makeInteger( 61 ), makeInteger( "2305843009213693951" ) ), ConsesLow.cons( makeInteger( 62 ), makeInteger( "4611686018427387847" ) ), ConsesLow.cons(
                          makeInteger( 63 ), makeInteger( "9223372036854775783" ) ), ConsesLow.cons( makeInteger( 64 ), makeInteger( "18446744073709551557" ) )
    } );
    $sym84$CHECKSUM_SANITY_CHECK = makeSymbol( "CHECKSUM-SANITY-CHECK" );
    $kw85$TEST = makeKeyword( "TEST" );
    $kw86$OWNER = makeKeyword( "OWNER" );
    $kw87$CLASSES = makeKeyword( "CLASSES" );
    $kw88$KB = makeKeyword( "KB" );
    $kw89$TINY = makeKeyword( "TINY" );
    $kw90$WORKING_ = makeKeyword( "WORKING?" );
    $list91 = ConsesLow.list( ConsesLow.list( NIL, T ) );
    $sym92$CHECKSUM_SETUP = makeSymbol( "CHECKSUM-SETUP" );
    $list93 = ConsesLow.list( makeSymbol( "CHECKSUM-START" ), makeSymbol( "CHECKSUM-RESUME" ), makeSymbol( "WITH-CHECKSUM" ) );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUM-INIT" ), makeSymbol( "LENGTH-INIT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym95$CLET = makeSymbol( "CLET" );
    $sym96$_CHECKSUM_SUM_ = makeSymbol( "*CHECKSUM-SUM*" );
    $sym97$_CHECKSUM_LENGTH_ = makeSymbol( "*CHECKSUM-LENGTH*" );
    $list98 = ConsesLow.list( makeSymbol( "*CHECKSUM-INITIAL-VALUE-SUM*" ), makeSymbol( "*CHECKSUM-INITIAL-VALUE-LENGTH*" ) );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "ACCUMULATORS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym100$CAR = makeSymbol( "CAR" );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECKSUM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym102$CHECKSUM_START = makeSymbol( "CHECKSUM-START" );
    $sym103$CSETQ = makeSymbol( "CSETQ" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECKSUM-FINALIZE" ) ) );
    $kw105$BASE = makeKeyword( "BASE" );
    $str106$_X = makeString( "~X" );
    $str107$_A_is_not_a_positive_integer_grea = SubLObjectFactory.makeString( "~A is not a positive integer greater than 1." );
    $sym108$FIND_SMALLEST_DIVISOR = makeSymbol( "FIND-SMALLEST-DIVISOR" );
    $list109 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( TWO_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( THREE_INTEGER ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list(
        FOUR_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( FIVE_INTEGER ), FIVE_INTEGER ), ConsesLow.list( ConsesLow.list( SIX_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( SEVEN_INTEGER ),
            SEVEN_INTEGER ), ConsesLow.list( ConsesLow.list( EIGHT_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( NINE_INTEGER ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list( TEN_INTEGER ), TWO_INTEGER ),
      ConsesLow.list( ConsesLow.list( ELEVEN_INTEGER ), ELEVEN_INTEGER ), ConsesLow.list( ConsesLow.list( TWELVE_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( THIRTEEN_INTEGER ), THIRTEEN_INTEGER ), ConsesLow
          .list( ConsesLow.list( FOURTEEN_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( FIFTEEN_INTEGER ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list( SIXTEEN_INTEGER ), TWO_INTEGER ), ConsesLow.list(
              ConsesLow.list( SEVENTEEN_INTEGER ), SEVENTEEN_INTEGER ), ConsesLow.list( ConsesLow.list( EIGHTEEN_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( NINETEEN_INTEGER ), NINETEEN_INTEGER ), ConsesLow
                  .list( ConsesLow.list( TWENTY_INTEGER ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 21 ) ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 22 ) ), TWO_INTEGER ),
      ConsesLow.list( ConsesLow.list( makeInteger( 23 ) ), makeInteger( 23 ) ), ConsesLow.list( ConsesLow.list( makeInteger( 24 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 25 ) ), FIVE_INTEGER ),
      ConsesLow.list( ConsesLow.list( makeInteger( 26 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 27 ) ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 28 ) ), TWO_INTEGER ),
      ConsesLow.list( ConsesLow.list( makeInteger( 29 ) ), makeInteger( 29 ) ), ConsesLow.list( ConsesLow.list( makeInteger( 30 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 31 ) ), makeInteger(
          31 ) ), ConsesLow.list( ConsesLow.list( makeInteger( 32 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 33 ) ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 34 ) ),
              TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 35 ) ), FIVE_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 36 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 37 ) ),
                  makeInteger( 37 ) ), ConsesLow.list( ConsesLow.list( makeInteger( 38 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 39 ) ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list(
                      makeInteger( 40 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 41 ) ), makeInteger( 41 ) ), ConsesLow.list( ConsesLow.list( makeInteger( 42 ) ), TWO_INTEGER ), ConsesLow.list(
                          ConsesLow.list( makeInteger( 43 ) ), makeInteger( 43 ) ), ConsesLow.list( ConsesLow.list( makeInteger( 44 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 45 ) ),
                              THREE_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 46 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 47 ) ), makeInteger( 47 ) ), ConsesLow.list( ConsesLow.list(
                                  makeInteger( 48 ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 49 ) ), SEVEN_INTEGER ), ConsesLow.list( ConsesLow.list( makeInteger( 50 ) ), TWO_INTEGER ), ConsesLow
                                      .list( ConsesLow.list( makeInteger( 1225 ) ), FIVE_INTEGER )
    } );
    $sym110$PRODUCT = makeSymbol( "PRODUCT" );
    $sym111$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym112$ABS = makeSymbol( "ABS" );
    $sym113$LCM2_INTERNAL = makeSymbol( "LCM2-INTERNAL" );
    $sym114$GCD2_INTERNAL = makeSymbol( "GCD2-INTERNAL" );
    $list115 = ConsesLow.list( new SubLObject[] { ConsesLow.list( Characters.CHAR_a, TEN_INTEGER ), ConsesLow.list( Characters.CHAR_A, TEN_INTEGER ), ConsesLow.list( Characters.CHAR_b, ELEVEN_INTEGER ), ConsesLow.list(
        Characters.CHAR_B, ELEVEN_INTEGER ), ConsesLow.list( Characters.CHAR_c, TWELVE_INTEGER ), ConsesLow.list( Characters.CHAR_C, TWELVE_INTEGER ), ConsesLow.list( Characters.CHAR_d, THIRTEEN_INTEGER ), ConsesLow
            .list( Characters.CHAR_D, THIRTEEN_INTEGER ), ConsesLow.list( Characters.CHAR_e, FOURTEEN_INTEGER ), ConsesLow.list( Characters.CHAR_E, FOURTEEN_INTEGER ), ConsesLow.list( Characters.CHAR_f,
                FIFTEEN_INTEGER ), ConsesLow.list( Characters.CHAR_F, FIFTEEN_INTEGER )
    } );
    $list116 = ConsesLow.list( makeSymbol( "PROBABILITY" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym117$PROB = makeUninternedSymbol( "PROB" );
    $sym118$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list119 = ConsesLow.list( makeSymbol( "PROBABILITY-P" ) );
    $sym120$PWHEN = makeSymbol( "PWHEN" );
    $sym121$TRUE_WITH_PROBABILITY = makeSymbol( "TRUE-WITH-PROBABILITY" );
    $sym122$PROBABILITY_P = makeSymbol( "PROBABILITY-P" );
    $int123$1000 = makeInteger( 1000 );
    $float124$1_0e_5 = makeDouble( 1.0E-5 );
    $sym125$PROBABILITY_DISTRIBUTION_P = makeSymbol( "PROBABILITY-DISTRIBUTION-P" );
    $str126$Error_sampling_from__s____s__s_ = makeString( "Error sampling from ~s: (~s ~s)" );
    $sym127$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym128$FIBONACCI_MEMOIZED = makeSymbol( "FIBONACCI-MEMOIZED" );
    $sym129$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $list130 = ConsesLow.cons( makeSymbol( "FIRST" ), makeSymbol( "REST" ) );
    $str131$_s_must_be_____s = makeString( "~s must be <= ~s" );
    $list132 = ConsesLow.list( makeSymbol( "PREV-X" ), makeSymbol( "PREV-Y" ) );
    $list133 = ConsesLow.list( makeSymbol( "CURR-X" ), makeSymbol( "CURR-Y" ) );
    $sym134$SECOND = makeSymbol( "SECOND" );
    $int135$25 = makeInteger( 25 );
    $sym136$AVERAGE_NEIGHBORS = makeSymbol( "AVERAGE-NEIGHBORS" );
    $list137 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER ), THREE_INTEGER ), ConsesLow.list( ONE_INTEGER,
        TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[]
        { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER
    } ), FIVE_INTEGER ), ConsesLow.list( new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER
    } ) ) );
    $kw138$DELETED = makeKeyword( "DELETED" );
    $sym139$TEST_RENUMBER_ID_USING_TABLE = makeSymbol( "TEST-RENUMBER-ID-USING-TABLE" );
    $list140 = _constant_140_initializer();
    $str141$Original_id__A_was_supposed_to_ma = SubLObjectFactory.makeString( "Original id ~A was supposed to map to ~A, but was renumbered to ~A." );
    $kw142$SUCCESS = makeKeyword( "SUCCESS" );
    $sym143$TRANSFORM_DELETE_LIST_TO_GAP_LIST = makeSymbol( "TRANSFORM-DELETE-LIST-TO-GAP-LIST" );
    $list144 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER ) ), ConsesLow.list( ConsesLow.cons( TWO_INTEGER, FOUR_INTEGER ),
        EIGHT_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[]
        { TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER
    } ) ), ConsesLow.list( ConsesLow.cons( TWO_INTEGER, FOUR_INTEGER ), EIGHT_INTEGER, ConsesLow.cons( ELEVEN_INTEGER, TWO_INTEGER ), ConsesLow.cons( FOURTEEN_INTEGER, THREE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list(
        ConsesLow.list( new SubLObject[]
        { ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger( 27 ), makeInteger( 57 ), makeInteger( 59 ), makeInteger( 64 ),
          makeInteger( 250 ), makeInteger( 361 ), makeInteger( 365 ), makeInteger( 366 ), makeInteger( 367 ), makeInteger( 368 ), makeInteger( 369 ), makeInteger( 374 ), makeInteger( 375 ), makeInteger( 378 ),
          makeInteger( 429 ), makeInteger( 430 ), makeInteger( 436 ), makeInteger( 442 ), makeInteger( 473 ), makeInteger( 510 ), makeInteger( 538 ), makeInteger( 539 ), makeInteger( 555 ), makeInteger( 614 ),
          makeInteger( 623 ), makeInteger( 624 ), makeInteger( 643 ), makeInteger( 1041 ), makeInteger( 1062 ), makeInteger( 1064 ), makeInteger( 1092 ), makeInteger( 1096 ), makeInteger( 1098 ), makeInteger( 1102 ),
          makeInteger( 1146 ), makeInteger( 1147 ), makeInteger( 1150 ), makeInteger( 1251 ), makeInteger( 1252 ), makeInteger( 1471 ), makeInteger( 1475 ), makeInteger( 1485 )
        } ) ), ConsesLow.list( new SubLObject[] { ZERO_INTEGER, ConsesLow.cons( TWO_INTEGER, TWO_INTEGER ), ELEVEN_INTEGER, ConsesLow.cons( THIRTEEN_INTEGER, FOUR_INTEGER ), makeInteger( 27 ), makeInteger( 57 ),
          makeInteger( 59 ), makeInteger( 64 ), makeInteger( 250 ), makeInteger( 361 ), ConsesLow.cons( makeInteger( 365 ), FIVE_INTEGER ), ConsesLow.cons( makeInteger( 374 ), TWO_INTEGER ), makeInteger( 378 ), ConsesLow
              .cons( makeInteger( 429 ), TWO_INTEGER ), makeInteger( 436 ), makeInteger( 442 ), makeInteger( 473 ), makeInteger( 510 ), ConsesLow.cons( makeInteger( 538 ), TWO_INTEGER ), makeInteger( 555 ), makeInteger(
                  614 ), ConsesLow.cons( makeInteger( 623 ), TWO_INTEGER ), makeInteger( 643 ), makeInteger( 1041 ), makeInteger( 1062 ), makeInteger( 1064 ), makeInteger( 1092 ), makeInteger( 1096 ), makeInteger(
                      1098 ), makeInteger( 1102 ), ConsesLow.cons( makeInteger( 1146 ), TWO_INTEGER ), makeInteger( 1150 ), ConsesLow.cons( makeInteger( 1251 ), TWO_INTEGER ), makeInteger( 1471 ), makeInteger( 1475 ),
          makeInteger( 1485 )
    } ) ) );
    $list145 = ConsesLow.cons( makeSymbol( "START" ), makeSymbol( "WIDTH" ) );
    $str146$Invalid_gap_list_format__Unclear_ = SubLObjectFactory.makeString( "Invalid gap list format: Unclear what to do with element ~A." );
    $sym147$TRANSFORM_GAP_LIST_TO_DELTA_LIST = makeSymbol( "TRANSFORM-GAP-LIST-TO-DELTA-LIST" );
    $list148 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( TWO_INTEGER, FOUR_INTEGER ), EIGHT_INTEGER, ConsesLow.cons( ELEVEN_INTEGER, TWO_INTEGER ) ) ), ConsesLow.list( ConsesLow
        .cons( TWO_INTEGER, FOUR_INTEGER ), ConsesLow.cons( EIGHT_INTEGER, FIVE_INTEGER ), ConsesLow.cons( ELEVEN_INTEGER, SEVEN_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( TWO_INTEGER,
            FOUR_INTEGER ), EIGHT_INTEGER, ConsesLow.cons( ELEVEN_INTEGER, TWO_INTEGER ), ConsesLow.cons( FOURTEEN_INTEGER, THREE_INTEGER ) ) ), ConsesLow.list( ConsesLow.cons( TWO_INTEGER, FOUR_INTEGER ), ConsesLow
                .cons( EIGHT_INTEGER, FIVE_INTEGER ), ConsesLow.cons( ELEVEN_INTEGER, SEVEN_INTEGER ), ConsesLow.cons( FOURTEEN_INTEGER, TEN_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[]
                { ZERO_INTEGER, ConsesLow.cons( TWO_INTEGER, TWO_INTEGER ), ELEVEN_INTEGER, ConsesLow.cons( THIRTEEN_INTEGER, FOUR_INTEGER ), makeInteger( 27 ), makeInteger( 57 ), makeInteger( 59 ), makeInteger( 64 ),
                  makeInteger( 250 ), makeInteger( 361 ), ConsesLow.cons( makeInteger( 365 ), FIVE_INTEGER ), ConsesLow.cons( makeInteger( 374 ), TWO_INTEGER ), makeInteger( 378 ), ConsesLow.cons( makeInteger( 429 ),
                      TWO_INTEGER ), makeInteger( 436 ), makeInteger( 442 ), makeInteger( 473 ), makeInteger( 510 ), ConsesLow.cons( makeInteger( 538 ), TWO_INTEGER ), makeInteger( 555 ), makeInteger( 614 ), ConsesLow
                          .cons( makeInteger( 623 ), TWO_INTEGER ), makeInteger( 643 ), makeInteger( 1041 ), makeInteger( 1062 ), makeInteger( 1064 ), makeInteger( 1092 ), makeInteger( 1096 ), makeInteger( 1098 ),
                  makeInteger( 1102 ), ConsesLow.cons( makeInteger( 1146 ), TWO_INTEGER ), makeInteger( 1150 ), ConsesLow.cons( makeInteger( 1251 ), TWO_INTEGER ), makeInteger( 1471 ), makeInteger( 1475 ), makeInteger(
                      1485 )
    } ) ), ConsesLow.list( new SubLObject[] { ConsesLow.cons( ZERO_INTEGER, ONE_INTEGER ), ConsesLow.cons( TWO_INTEGER, THREE_INTEGER ), ConsesLow.cons( ELEVEN_INTEGER, FOUR_INTEGER ), ConsesLow.cons( THIRTEEN_INTEGER,
        EIGHT_INTEGER ), ConsesLow.cons( makeInteger( 27 ), NINE_INTEGER ), ConsesLow.cons( makeInteger( 57 ), TEN_INTEGER ), ConsesLow.cons( makeInteger( 59 ), ELEVEN_INTEGER ), ConsesLow.cons( makeInteger( 64 ),
            TWELVE_INTEGER ), ConsesLow.cons( makeInteger( 250 ), THIRTEEN_INTEGER ), ConsesLow.cons( makeInteger( 361 ), FOURTEEN_INTEGER ), ConsesLow.cons( makeInteger( 365 ), NINETEEN_INTEGER ), ConsesLow.cons(
                makeInteger( 374 ), makeInteger( 21 ) ), ConsesLow.cons( makeInteger( 378 ), makeInteger( 22 ) ), ConsesLow.cons( makeInteger( 429 ), makeInteger( 24 ) ), ConsesLow.cons( makeInteger( 436 ), makeInteger(
                    25 ) ), ConsesLow.cons( makeInteger( 442 ), makeInteger( 26 ) ), ConsesLow.cons( makeInteger( 473 ), makeInteger( 27 ) ), ConsesLow.cons( makeInteger( 510 ), makeInteger( 28 ) ), ConsesLow.cons(
                        makeInteger( 538 ), makeInteger( 30 ) ), ConsesLow.cons( makeInteger( 555 ), makeInteger( 31 ) ), ConsesLow.cons( makeInteger( 614 ), makeInteger( 32 ) ), ConsesLow.cons( makeInteger( 623 ),
                            makeInteger( 34 ) ), ConsesLow.cons( makeInteger( 643 ), makeInteger( 35 ) ), ConsesLow.cons( makeInteger( 1041 ), makeInteger( 36 ) ), ConsesLow.cons( makeInteger( 1062 ), makeInteger(
                                37 ) ), ConsesLow.cons( makeInteger( 1064 ), makeInteger( 38 ) ), ConsesLow.cons( makeInteger( 1092 ), makeInteger( 39 ) ), ConsesLow.cons( makeInteger( 1096 ), makeInteger( 40 ) ),
      ConsesLow.cons( makeInteger( 1098 ), makeInteger( 41 ) ), ConsesLow.cons( makeInteger( 1102 ), makeInteger( 42 ) ), ConsesLow.cons( makeInteger( 1146 ), makeInteger( 44 ) ), ConsesLow.cons( makeInteger( 1150 ),
          makeInteger( 45 ) ), ConsesLow.cons( makeInteger( 1251 ), makeInteger( 47 ) ), ConsesLow.cons( makeInteger( 1471 ), makeInteger( 48 ) ), ConsesLow.cons( makeInteger( 1475 ), makeInteger( 49 ) ), ConsesLow.cons(
              makeInteger( 1485 ), makeInteger( 50 ) )
    } ) ) );
    $sym149$TEST_RENUMBER_ID_USING_DELTA_TABLE = makeSymbol( "TEST-RENUMBER-ID-USING-DELTA-TABLE" );
    $str150$ID__A_should_have_been_deleted_bu = SubLObjectFactory.makeString( "ID ~A should have been deleted but was renumbered to ~A." );
    $sym151$PRIME_NUMBER_ = makeSymbol( "PRIME-NUMBER?" );
    $list152 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "foo" ) ), NIL ), ConsesLow.list( ConsesLow.list( MINUS_ONE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( ZERO_INTEGER ),
        NIL ), ConsesLow.list( ConsesLow.list( ONE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( TWO_INTEGER ), T ), ConsesLow.list( ConsesLow.list( THREE_INTEGER ), T ), ConsesLow.list( ConsesLow.list(
            FOUR_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( makeInteger( 4001 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4003 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4007 ) ), T ),
      ConsesLow.list( ConsesLow.list( makeInteger( 4013 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4019 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4021 ) ), T ), ConsesLow.list( ConsesLow.list(
          makeInteger( 4027 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4049 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4051 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4057 ) ), T ),
      ConsesLow.list( ConsesLow.list( makeInteger( 4073 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4079 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4091 ) ), T ), ConsesLow.list( ConsesLow.list(
          makeInteger( 4093 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4099 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4111 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4127 ) ), T ),
      ConsesLow.list( ConsesLow.list( makeInteger( 4129 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4133 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4139 ) ), T ), ConsesLow.list( ConsesLow.list(
          makeInteger( 4153 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4157 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4159 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4177 ) ), T ),
      ConsesLow.list( ConsesLow.list( makeInteger( 4201 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4211 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4217 ) ), T ), ConsesLow.list( ConsesLow.list(
          makeInteger( 4219 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4229 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4231 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 4241 ) ), T ),
      ConsesLow.list( ConsesLow.list( makeInteger( 5861 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 5867 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 5869 ) ), T ), ConsesLow.list( ConsesLow.list(
          makeInteger( 5879 ) ), T ), ConsesLow.list( ConsesLow.list( makeInteger( 5881 ) ), T )
    } );
    $list153 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeInteger( 175 ) ), FIVE_INTEGER ) );
    $sym154$MEDIAN = makeSymbol( "MEDIAN" );
    $list155 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER,
        THREE_INTEGER, FOUR_INTEGER ) ), makeDouble( 2.5 ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c ), makeSymbol( "CHAR-CODE" ), makeKeyword( "ITEM" ) ),
            Characters.CHAR_b ) );
    $sym156$COMPUTE_DELTAS = makeSymbol( "COMPUTE-DELTAS" );
    $list157 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( TEN_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER ) ), ConsesLow.list( ONE_INTEGER, TWO_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow
        .list( TEN_INTEGER, ELEVEN_INTEGER ) ), ConsesLow.list( ONE_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( TEN_INTEGER ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( TEN_INTEGER,
            EIGHT_INTEGER, ELEVEN_INTEGER ) ), ConsesLow.list( makeInteger( -2 ), THREE_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( TEN_INTEGER, EIGHT_INTEGER ), ELEVEN_INTEGER ), ConsesLow.list(
                makeInteger( -2 ), THREE_INTEGER ) ) );
  }
}
