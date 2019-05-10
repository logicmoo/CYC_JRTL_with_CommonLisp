package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class arithmetic
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.arithmetic";
  public static final String myFingerPrint = "a8f61f371d3256ca0aace2e26cec40ede5d4ef37dcfd9358832cb83553198a61";
  private static final SubLSymbol $sym0$CYC_PLUS_INTERNAL;
  private static final SubLSymbol $sym1$CYC_PLUS;
  private static final SubLSymbol $sym2$CYC_DIFFERENCE;
  private static final SubLSymbol $sym3$CYC_MINUS;
  private static final SubLSymbol $sym4$CYC_TIMES_INTERNAL;
  private static final SubLSymbol $sym5$CYC_TIMES;
  private static final SubLSymbol $sym6$CYC_GREATER_THAN;
  private static final SubLSymbol $sym7$CYC_LESS_THAN;
  private static final SubLSymbol $sym8$CYC_GREATER_THAN_OR_EQUAL_TO;
  private static final SubLSymbol $sym9$CYC_LESS_THAN_OR_EQUAL_TO;
  private static final SubLSymbol $sym10$CYC_NUMERICALLY_EQUAL;
  private static final SubLSymbol $sym11$POSSIBLY_SANITIZE_FLOAT_MEMOIZED;
  private static final SubLInteger $int12$4096;
  private static final SubLSymbol $sym13$POSSIBLY_SANITIZE_FLOAT;
  private static final SubLSymbol $kw14$TEST;
  private static final SubLSymbol $kw15$OWNER;
  private static final SubLSymbol $kw16$CLASSES;
  private static final SubLSymbol $kw17$KB;
  private static final SubLSymbol $kw18$TINY;
  private static final SubLSymbol $kw19$WORKING_;
  private static final SubLList $list20;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1133L)
  public static SubLObject cyc_plus(final SubLObject args)
  {
    if( NIL == args )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    if( NIL != list_utilities.singletonP( args ) )
    {
      return args.first();
    }
    return quantity_reduce( $sym0$CYC_PLUS_INTERNAL, NIL, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1864L)
  public static SubLObject cyc_plus_internal(final SubLObject interval1, final SubLObject interval2)
  {
    if( interval1.isNumber() && interval2.isNumber() )
    {
      return arithmetic_answer( Numbers.add( interval1, interval2 ) );
    }
    return quantities.cyc_plus_quantities( interval1, interval2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2168L)
  public static SubLObject cyc_difference(final SubLObject interval1, final SubLObject interval2)
  {
    return cyc_plus_internal( interval1, cyc_minus( interval2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2459L)
  public static SubLObject cyc_minus(final SubLObject interval)
  {
    if( interval.isNumber() )
    {
      return arithmetic_answer( Numbers.minus( interval ) );
    }
    if( NIL != collection_defns.fractionP( interval, UNPROVIDED ) )
    {
      return quantities.negate_fraction( interval );
    }
    return quantities.cyc_minus_quantities( interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2889L)
  public static SubLObject cyc_times(final SubLObject args)
  {
    return quantity_reduce( $sym4$CYC_TIMES_INTERNAL, ONE_INTEGER, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3127L)
  public static SubLObject cyc_times_internal(final SubLObject interval1, final SubLObject interval2)
  {
    if( ZERO_INTEGER.eql( interval1 ) )
    {
      if( NIL != extended_numbers.cyc_infinite_number_p( interval2 ) || NIL != extended_numbers.cyc_infinite_range_p( interval2 ) )
      {
        return relation_evaluation.throw_unevaluatable();
      }
      return ZERO_INTEGER;
    }
    else if( ZERO_INTEGER.eql( interval2 ) )
    {
      if( NIL != extended_numbers.cyc_infinite_number_p( interval1 ) || NIL != extended_numbers.cyc_infinite_range_p( interval1 ) )
      {
        return relation_evaluation.throw_unevaluatable();
      }
      return ZERO_INTEGER;
    }
    else
    {
      if( ONE_INTEGER.eql( interval1 ) )
      {
        return interval2;
      }
      if( ONE_INTEGER.eql( interval2 ) )
      {
        return interval1;
      }
      if( interval1.isNumber() && interval2.isNumber() )
      {
        return arithmetic_answer( Numbers.multiply( interval1, interval2 ) );
      }
      return quantities.cyc_times_quantities( interval1, interval2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4090L)
  public static SubLObject cyc_greater_than(final SubLObject interval1, final SubLObject interval2)
  {
    return cyc_less_than( interval2, interval1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4479L)
  public static SubLObject cyc_less_than(SubLObject interval1, SubLObject interval2)
  {
    interval1 = possibly_sanitize_float( interval1 );
    interval2 = possibly_sanitize_float( interval2 );
    if( interval1.isNumber() && interval2.isNumber() )
    {
      return Numbers.numL( interval1, interval2 );
    }
    return quantities.cyc_less_than_quantities( interval1, interval2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4902L)
  public static SubLObject cyc_greater_than_or_equal_to(final SubLObject interval1, final SubLObject interval2)
  {
    return cyc_less_than_or_equal_to( interval2, interval1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5183L)
  public static SubLObject cyc_less_than_or_equal_to(SubLObject interval1, SubLObject interval2)
  {
    interval1 = possibly_sanitize_float( interval1 );
    interval2 = possibly_sanitize_float( interval2 );
    if( interval1.isNumber() && interval2.isNumber() )
    {
      return Numbers.numLE( interval1, interval2 );
    }
    return quantities.cyc_less_than_or_equal_to_quantities( interval1, interval2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5640L)
  public static SubLObject cyc_numerically_equal(SubLObject interval1, SubLObject interval2)
  {
    interval1 = possibly_sanitize_float( interval1 );
    interval2 = possibly_sanitize_float( interval2 );
    if( interval1.isNumber() && interval2.isNumber() )
    {
      return makeBoolean( interval1.numLE( interval2 ) && interval2.numLE( interval1 ) );
    }
    return makeBoolean( NIL == quantities.cyc_less_than_quantities( interval1, interval2 ) && NIL == quantities.cyc_less_than_quantities( interval2, interval1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6234L)
  public static SubLObject quantity_reduce(final SubLObject lisp_defun, final SubLObject identity_constant, final SubLObject args)
  {
    final SubLObject num_items = Sequences.length( args );
    if( num_items.numE( ZERO_INTEGER ) )
    {
      if( NIL != identity_constant )
      {
        return identity_constant;
      }
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    else
    {
      if( !num_items.numE( ONE_INTEGER ) )
      {
        SubLObject result = args.first();
        SubLObject items = NIL;
        SubLObject sofar = NIL;
        SubLObject item = NIL;
        items = args.rest();
        sofar = result;
        item = items.first();
        while ( NIL != items)
        {
          result = Functions.funcall( lisp_defun, sofar, item );
          items = items.rest();
          sofar = result;
          item = items.first();
        }
        return result;
      }
      if( NIL != identity_constant )
      {
        return Functions.funcall( lisp_defun, identity_constant, args.first() );
      }
      return args.first();
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7015L)
  public static SubLObject arithmetic_answer(final SubLObject ans)
  {
    return possibly_sanitize_float( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7097L)
  public static SubLObject possibly_sanitize_float(final SubLObject possible_float)
  {
    if( possible_float.isDouble() )
    {
      return possibly_sanitize_float_memoized( possible_float );
    }
    return possible_float;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7278L)
  public static SubLObject possibly_sanitize_float_memoized_internal(final SubLObject possible_float)
  {
    if( possible_float.isDouble() )
    {
      final SubLObject v_15_digits = number_utilities.significant_digits( possible_float, FIFTEEN_INTEGER );
      if( !possible_float.numE( v_15_digits ) )
      {
        final SubLObject v_10_digits = number_utilities.significant_digits( possible_float, TEN_INTEGER );
        if( v_10_digits.numE( v_15_digits ) )
        {
          return v_15_digits;
        }
      }
    }
    return possible_float;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7278L)
  public static SubLObject possibly_sanitize_float_memoized(final SubLObject possible_float)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return possibly_sanitize_float_memoized_internal( possible_float );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym11$POSSIBLY_SANITIZE_FLOAT_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym11$POSSIBLY_SANITIZE_FLOAT_MEMOIZED, ONE_INTEGER, $int12$4096, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym11$POSSIBLY_SANITIZE_FLOAT_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, possible_float, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( possibly_sanitize_float_memoized_internal( possible_float ) ) );
      memoization_state.caching_state_put( caching_state, possible_float, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_arithmetic_file()
  {
    SubLFiles.declareFunction( me, "cyc_plus", "CYC-PLUS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_plus_internal", "CYC-PLUS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_difference", "CYC-DIFFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_minus", "CYC-MINUS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_times", "CYC-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_times_internal", "CYC-TIMES-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_greater_than", "CYC-GREATER-THAN", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_less_than", "CYC-LESS-THAN", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_greater_than_or_equal_to", "CYC-GREATER-THAN-OR-EQUAL-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_less_than_or_equal_to", "CYC-LESS-THAN-OR-EQUAL-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_numerically_equal", "CYC-NUMERICALLY-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "quantity_reduce", "QUANTITY-REDUCE", 3, 0, false );
    SubLFiles.declareFunction( me, "arithmetic_answer", "ARITHMETIC-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_sanitize_float", "POSSIBLY-SANITIZE-FLOAT", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_sanitize_float_memoized_internal", "POSSIBLY-SANITIZE-FLOAT-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_sanitize_float_memoized", "POSSIBLY-SANITIZE-FLOAT-MEMOIZED", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_arithmetic_file()
  {
    return NIL;
  }

  public static SubLObject setup_arithmetic_file()
  {
    utilities_macros.register_kb_function( $sym1$CYC_PLUS );
    utilities_macros.register_kb_function( $sym2$CYC_DIFFERENCE );
    utilities_macros.register_kb_function( $sym3$CYC_MINUS );
    utilities_macros.register_kb_function( $sym5$CYC_TIMES );
    utilities_macros.register_kb_function( $sym6$CYC_GREATER_THAN );
    utilities_macros.register_kb_function( $sym7$CYC_LESS_THAN );
    utilities_macros.register_kb_function( $sym8$CYC_GREATER_THAN_OR_EQUAL_TO );
    utilities_macros.register_kb_function( $sym9$CYC_LESS_THAN_OR_EQUAL_TO );
    utilities_macros.register_kb_function( $sym10$CYC_NUMERICALLY_EQUAL );
    memoization_state.note_memoized_function( $sym11$POSSIBLY_SANITIZE_FLOAT_MEMOIZED );
    generic_testing.define_test_case_table_int( $sym13$POSSIBLY_SANITIZE_FLOAT, ConsesLow.list( new SubLObject[] { $kw14$TEST, NIL, $kw15$OWNER, NIL, $kw16$CLASSES, NIL, $kw17$KB, $kw18$TINY, $kw19$WORKING_, T
    } ), $list20 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_arithmetic_file();
  }

  @Override
  public void initializeVariables()
  {
    init_arithmetic_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_arithmetic_file();
  }
  static
  {
    me = new arithmetic();
    $sym0$CYC_PLUS_INTERNAL = makeSymbol( "CYC-PLUS-INTERNAL" );
    $sym1$CYC_PLUS = makeSymbol( "CYC-PLUS" );
    $sym2$CYC_DIFFERENCE = makeSymbol( "CYC-DIFFERENCE" );
    $sym3$CYC_MINUS = makeSymbol( "CYC-MINUS" );
    $sym4$CYC_TIMES_INTERNAL = makeSymbol( "CYC-TIMES-INTERNAL" );
    $sym5$CYC_TIMES = makeSymbol( "CYC-TIMES" );
    $sym6$CYC_GREATER_THAN = makeSymbol( "CYC-GREATER-THAN" );
    $sym7$CYC_LESS_THAN = makeSymbol( "CYC-LESS-THAN" );
    $sym8$CYC_GREATER_THAN_OR_EQUAL_TO = makeSymbol( "CYC-GREATER-THAN-OR-EQUAL-TO" );
    $sym9$CYC_LESS_THAN_OR_EQUAL_TO = makeSymbol( "CYC-LESS-THAN-OR-EQUAL-TO" );
    $sym10$CYC_NUMERICALLY_EQUAL = makeSymbol( "CYC-NUMERICALLY-EQUAL" );
    $sym11$POSSIBLY_SANITIZE_FLOAT_MEMOIZED = makeSymbol( "POSSIBLY-SANITIZE-FLOAT-MEMOIZED" );
    $int12$4096 = makeInteger( 4096 );
    $sym13$POSSIBLY_SANITIZE_FLOAT = makeSymbol( "POSSIBLY-SANITIZE-FLOAT" );
    $kw14$TEST = makeKeyword( "TEST" );
    $kw15$OWNER = makeKeyword( "OWNER" );
    $kw16$CLASSES = makeKeyword( "CLASSES" );
    $kw17$KB = makeKeyword( "KB" );
    $kw18$TINY = makeKeyword( "TINY" );
    $kw19$WORKING_ = makeKeyword( "WORKING?" );
    $list20 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeDouble( 0.7999999999999999 ) ), makeDouble( 0.8 ) ), ConsesLow.list( ConsesLow.list( makeDouble( 0.8000000000000002 ) ), makeDouble( 0.8 ) ), ConsesLow
        .list( ConsesLow.list( makeDouble( 0.799999999999999 ) ), makeDouble( 0.799999999999999 ) ), ConsesLow.list( ConsesLow.list( makeDouble( 3.141592653589793 ) ), makeDouble( 3.141592653589793 ) ) );
  }
}
/*
 * 
 * Total time: 145 ms
 * 
 */