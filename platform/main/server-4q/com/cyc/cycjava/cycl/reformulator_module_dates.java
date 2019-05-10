package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_dates
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_dates";
  public static final String myFingerPrint = "7ca8c2b69a54bbafd5f3df36134994d260487a3595bdd2a4ecb38da8778865fd";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1396L)
  private static SubLSymbol $dates_reformulation_microseconds$;
  private static final SubLObject $const0$DatesReformulatorRLModule;
  private static final SubLList $list1;
  private static final SubLInteger $int2$1200;
  private static final SubLSymbol $kw3$IGNORE;
  private static final SubLObject $const4$TemporalThing;
  private static final SubLObject $const5$YearFn;
  private static final SubLString $str6$Dates__Integers_to_Years;
  private static final SubLString $str7$Dates_Reformulation;
  private static final SubLString $str8$dates_reformulation_test_suite;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1458L)
  public static SubLObject dates_reformulation_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return $dates_reformulation_microseconds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1764L)
  public static SubLObject dates_reformulation_check_expression(final SubLObject expression)
  {
    return makeBoolean( NIL != clauses.clauses_p( expression ) && NIL != list_utilities.singletonP( expression ) && NIL != clause_utilities.pos_atomic_cnf_p( expression.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1944L)
  public static SubLObject dates_reformulation_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    if( NIL != dates_reformulation_check_expression( expression ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( expression.first() );
      if( NIL != el_utilities.el_formula_p( asent ) )
      {
        SubLObject matchP = NIL;
        if( NIL != contains_integers_to_reformulateP( asent, mt ) )
        {
          matchP = T;
        }
        return matchP;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 2408L)
  public static SubLObject contains_integers_to_reformulateP(final SubLObject asent, final SubLObject mt)
  {
    final SubLObject pred = cycl_utilities.formula_operator( asent );
    SubLObject arg_numbers = NIL;
    if( NIL != forts.fort_p( pred ) )
    {
      SubLObject arg_num = ZERO_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( asent, $kw3$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        arg_num = Numbers.add( arg_num, ONE_INTEGER );
        SubLObject csome_list_var;
        final SubLObject arg_isa_constraints = csome_list_var = kb_accessors.min_argn_isa( pred, arg_num, UNPROVIDED );
        SubLObject constraint = NIL;
        constraint = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( arg.isInteger() && NIL != genls.genlsP( constraint, $const4$TemporalThing, mt, UNPROVIDED ) )
          {
            arg_numbers = ConsesLow.cons( arg_num, arg_numbers );
          }
          csome_list_var = csome_list_var.rest();
          constraint = csome_list_var.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    return arg_numbers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 3118L)
  public static SubLObject dates_reformulation_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != dates_reformulation_check_expression( expression ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( expression.first() );
      SubLObject new_sentence = NIL;
      SubLObject justification = T;
      final SubLObject date_args = contains_integers_to_reformulateP( asent, mt );
      if( NIL != el_utilities.el_formula_p( asent ) && NIL != list_utilities.sublisp_boolean( date_args ) )
      {
        thread.resetMultipleValues();
        final SubLObject new_sentence_$1 = dates_reformulation_reformulate_years( asent, date_args, mt, settings, original_clause );
        final SubLObject justification_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_sentence = new_sentence_$1;
        justification = justification_$2;
      }
      return Values.values( ConsesLow.list( clause_utilities.make_gaf_cnf( new_sentence ) ), justification );
    }
    return Values.values( expression, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 3803L)
  public static SubLObject dates_reformulation_reformulate_years(final SubLObject expression, final SubLObject date_args, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    if( date_args.isCons() && NIL != list_utilities.sublisp_boolean( date_args ) )
    {
      SubLObject new_sentence;
      final SubLObject asent = new_sentence = conses_high.copy_tree( expression );
      SubLObject cdolist_list_var = date_args;
      SubLObject arg_num = NIL;
      arg_num = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject int_arg = cycl_utilities.formula_arg( asent, arg_num, UNPROVIDED );
        final SubLObject year_arg = el_utilities.list_to_elf( ConsesLow.list( $const5$YearFn, int_arg ) );
        new_sentence = el_utilities.replace_formula_arg( arg_num, year_arg, new_sentence );
        cdolist_list_var = cdolist_list_var.rest();
        arg_num = cdolist_list_var.first();
      }
      return Values.values( new_sentence, ConsesLow.list( $str6$Dates__Integers_to_Years ) );
    }
    return NIL;
  }

  public static SubLObject declare_reformulator_module_dates_file()
  {
    SubLFiles.declareFunction( me, "dates_reformulation_cost_estimate", "DATES-REFORMULATION-COST-ESTIMATE", 3, 0, false );
    SubLFiles.declareFunction( me, "dates_reformulation_check_expression", "DATES-REFORMULATION-CHECK-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "dates_reformulation_expression_required", "DATES-REFORMULATION-EXPRESSION-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( me, "contains_integers_to_reformulateP", "CONTAINS-INTEGERS-TO-REFORMULATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "dates_reformulation_reformulate", "DATES-REFORMULATION-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( me, "dates_reformulation_reformulate_years", "DATES-REFORMULATION-REFORMULATE-YEARS", 4, 1, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_dates_file()
  {
    $dates_reformulation_microseconds$ = SubLFiles.deflexical( "*DATES-REFORMULATION-MICROSECONDS*", $int2$1200 );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_dates_file()
  {
    reformulator_module_harness.declare_rl_module( $const0$DatesReformulatorRLModule, $list1 );
    sunit_external.define_test_category( $str7$Dates_Reformulation, UNPROVIDED );
    sunit_external.define_test_suite( $str8$dates_reformulation_test_suite, ConsesLow.list( $str7$Dates_Reformulation ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_dates_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_dates_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_dates_file();
  }
  static
  {
    me = new reformulator_module_dates();
    $dates_reformulation_microseconds$ = null;
    $const0$DatesReformulatorRLModule = constant_handles.reader_make_constant_shell( makeString( "DatesReformulatorRLModule" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "REQUIRED" ), makeSymbol( "DATES-REFORMULATION-EXPRESSION-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "DATES-REFORMULATION-COST-ESTIMATE" ), makeKeyword(
        "REFORMULATE" ), makeSymbol( "DATES-REFORMULATION-REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Reformulates numbers into proper date-denoting CycL expressions." ), makeKeyword( "EXAMPLE-SOURCE" ),
      makeString( "(#$birthDate #$JohnKennedy 1917)" ), makeKeyword( "EXAMPLE-TARGET" ), makeString( "(#$birthDate #$JohnKennedy (#$YearFn 1917))" )
    } );
    $int2$1200 = makeInteger( 1200 );
    $kw3$IGNORE = makeKeyword( "IGNORE" );
    $const4$TemporalThing = constant_handles.reader_make_constant_shell( makeString( "TemporalThing" ) );
    $const5$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
    $str6$Dates__Integers_to_Years = makeString( "Dates: Integers to Years" );
    $str7$Dates_Reformulation = makeString( "Dates Reformulation" );
    $str8$dates_reformulation_test_suite = makeString( "dates-reformulation-test-suite" );
  }
}
/*
 * 
 * Total time: 28 ms
 * 
 */