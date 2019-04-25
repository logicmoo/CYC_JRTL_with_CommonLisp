package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_distance_between
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between";
  public static final String myFingerPrint = "2f28d53345ccbaa8518c715d8c9ac42368d38b4ba478b7d8b8b8d0898ac8aac9";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 899L)
  private static SubLSymbol $distance_between_great_circle_rule_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 1865L)
  private static SubLSymbol $distance_between_great_circle_rule_antecedent_template$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$CODE;
  private static final SubLObject $const2$GeographyMt;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$PROBLEM_STORE;
  private static final SubLSymbol $kw6$CONTINUABLE_;
  private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw9$RETURN;
  private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$LOC2;
  private static final SubLSymbol $sym13$LOC1;
  private static final SubLObject $const14$distanceBetween;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$DISTANCE_BETWEEN_POS;
  private static final SubLList $list19;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 1705L)
  public static SubLObject make_distance_between_great_circle_rule_support()
  {
    return arguments.make_hl_support( $kw1$CODE, $distance_between_great_circle_rule_formula$.getGlobalValue(), $const2$GeographyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 2753L)
  public static SubLObject distance_between_great_circle_rule_antecedent_dnf(final SubLObject loc1, final SubLObject loc2)
  {
    final SubLObject rule_antecedent_info = $distance_between_great_circle_rule_antecedent_template$.getGlobalValue();
    final SubLObject input_values = ConsesLow.list( loc1, loc2 );
    SubLObject current;
    final SubLObject datum = current = rule_antecedent_info;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject input_el_vars = NIL;
    SubLObject output_el_vars = NIL;
    SubLObject scoped_el_vars = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    input_el_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    output_el_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    scoped_el_vars = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject el_dnf_template = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
      el_dnf_template = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject el_bindings = bindings.make_variable_bindings( input_el_vars, input_values );
        final SubLObject el_dnf = bindings.apply_bindings( el_bindings, el_dnf_template );
        final SubLObject hl_dnf = variables.subst_hl_variables( output_el_vars, el_dnf );
        final SubLObject scoped_hl_vars = variables.subst_hl_variables( output_el_vars, scoped_el_vars );
        return Values.values( hl_dnf, scoped_hl_vars );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 3541L)
  public static SubLObject removal_distance_between_great_circle_antecedent_answers(final SubLObject loc1, final SubLObject loc2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store = inference_worker.currently_active_problem_store();
    thread.resetMultipleValues();
    final SubLObject rule_antecedent_dnf = distance_between_great_circle_rule_antecedent_dnf( loc1, loc2 );
    final SubLObject scoped_vars = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return inference_kernel.new_cyc_query_from_dnf( rule_antecedent_dnf, mt, scoped_vars, ConsesLow.list( new SubLObject[] { $kw5$PROBLEM_STORE, problem_store, $kw6$CONTINUABLE_, NIL,
      $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $kw9$RETURN, $kw10$BINDINGS_AND_SUPPORTS
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 4253L)
  public static SubLObject removal_distance_between_great_circle_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list11;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject loc2 = list_utilities.alist_lookup_without_values( v_bindings, $sym12$LOC2, UNPROVIDED, UNPROVIDED );
      final SubLObject loc3 = list_utilities.alist_lookup_without_values( v_bindings, $sym13$LOC1, UNPROVIDED, UNPROVIDED );
      final SubLObject antecedent_answers = removal_distance_between_great_circle_antecedent_answers( loc3, loc2, UNPROVIDED );
      if( NIL != antecedent_answers )
      {
        final SubLObject output_template = ConsesLow.list( $const14$distanceBetween, loc3, loc2, variables.find_variable_by_id( ZERO_INTEGER ) );
        final SubLObject rule_support = make_distance_between_great_circle_rule_support();
        SubLObject cdolist_list_var = antecedent_answers;
        SubLObject antecedent_answer = NIL;
        antecedent_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = antecedent_answer;
          SubLObject antecedent_bindings = NIL;
          SubLObject antecedent_supports = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
          antecedent_bindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
          antecedent_supports = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject proven_asent = bindings.apply_bindings( antecedent_bindings, output_template );
            thread.resetMultipleValues();
            final SubLObject v_bindings_$1 = unification_utilities.term_unify( proven_asent, asent, T, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != v_bindings_$1 )
            {
              backward.removal_add_node( rule_support, v_bindings_$1, ConsesLow.append( antecedent_supports, unify_justification ) );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          antecedent_answer = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_distance_between_file()
  {
    SubLFiles.declareFunction( me, "make_distance_between_great_circle_rule_support", "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "distance_between_great_circle_rule_antecedent_dnf", "DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-DNF", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_distance_between_great_circle_antecedent_answers", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-ANTECEDENT-ANSWERS", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_distance_between_great_circle_pos_expand", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_distance_between_file()
  {
    $distance_between_great_circle_rule_formula$ = SubLFiles.deflexical( "*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-FORMULA*", $list0 );
    $distance_between_great_circle_rule_antecedent_template$ = SubLFiles.deflexical( "*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-TEMPLATE*", $list3 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_distance_between_file()
  {
    inference_modules.inference_removal_module( $kw16$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS, $list17 );
    preference_modules.inference_preference_module( $kw18$DISTANCE_BETWEEN_POS, $list19 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_distance_between_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_distance_between_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_distance_between_file();
  }
  static
  {
    me = new removal_modules_distance_between();
    $distance_between_great_circle_rule_formula$ = null;
    $distance_between_great_circle_rule_antecedent_template$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "latitude" ) ), makeSymbol( "?LOC1" ), makeSymbol( "?LAT1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), makeSymbol(
            "?LOC1" ), makeSymbol( "?LONG1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), makeSymbol( "?LOC2" ), makeSymbol( "?LAT2" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "longitude" ) ), makeSymbol( "?LOC2" ), makeSymbol( "?LONG2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ),
                    makeSymbol( "?TIMESFN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "PerFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), constant_handles.reader_make_constant_shell( makeString( "Radian" ) ) ), makeDouble( 3980.91 ) ),
                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ArcCosineFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SineFn" ) ), makeSymbol( "?LAT1" ) ),
                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SineFn" ) ), makeSymbol( "?LAT2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CosineFn" ) ), makeSymbol( "?LAT1" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "CosineFn" ) ), makeSymbol( "?LAT2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CosineFn" ) ), ConsesLow
                                        .list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeSymbol( "?LONG2" ), makeSymbol( "?LONG1" ) ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "distanceBetween" ) ), makeSymbol( "?LOC1" ), makeSymbol( "?LOC2" ), makeSymbol( "?TIMESFN" ) ) );
    $kw1$CODE = makeKeyword( "CODE" );
    $const2$GeographyMt = constant_handles.reader_make_constant_shell( makeString( "GeographyMt" ) );
    $list3 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "?LOC1" ), makeSymbol( "?LOC2" ) ), ConsesLow.list( makeSymbol( "?TIMESFN" ), makeSymbol( "?LAT1" ), makeSymbol( "?LONG1" ), makeSymbol( "?LAT2" ),
        makeSymbol( "?LONG2" ) ), ConsesLow.list( makeSymbol( "?LAT1" ), makeSymbol( "?LONG1" ), makeSymbol( "?LAT2" ), makeSymbol( "?LONG2" ) ) ), ConsesLow.list( NIL, ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "latitude" ) ), makeSymbol( "?LOC1" ), makeSymbol( "?LAT1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), makeSymbol(
                "?LOC1" ), makeSymbol( "?LONG1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), makeSymbol( "?LOC2" ), makeSymbol( "?LAT2" ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), makeSymbol( "?LOC2" ), makeSymbol( "?LONG2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "evaluate" ) ), makeSymbol( "?TIMESFN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "PerFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "Radian" ) ) ), makeDouble( 3980.91 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ArcCosineFn" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "PlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "SineFn" ) ), makeSymbol( "?LAT1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SineFn" ) ), makeSymbol(
                                            "?LAT2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "CosineFn" ) ), makeSymbol( "?LAT1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CosineFn" ) ), makeSymbol( "?LAT2" ) ), ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "CosineFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ),
                                                        makeSymbol( "?LONG2" ), makeSymbol( "?LONG1" ) ) ) ) ) ) ) ) ) ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "INPUT-EL-VARS" ), makeSymbol( "OUTPUT-EL-VARS" ), makeSymbol( "SCOPED-EL-VARS" ) ), makeSymbol( "EL-DNF-TEMPLATE" ) );
    $kw5$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw6$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw9$RETURN = makeKeyword( "RETURN" );
    $kw10$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LOC1" ) ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "LOC2" ) ), makeKeyword( "ANYTHING" ) );
    $sym12$LOC2 = makeSymbol( "LOC2" );
    $sym13$LOC1 = makeSymbol( "LOC1" );
    $const14$distanceBetween = constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) );
    $list15 = ConsesLow.list( makeSymbol( "ANTECEDENT-BINDINGS" ), makeSymbol( "ANTECEDENT-SUPPORTS" ) );
    $kw16$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS = makeKeyword( "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS" );
    $list17 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND" ), makeKeyword(
          "DOCUMENTATION" ), makeString( "(#$distanceBetween <fully-bound> <fully-bound> <whatever>)\n    by computing the Great Circle distance using \n    #$latitude and #$longitude information about ARG1 and ARG2" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$distanceBetween #$CityOfAnchorageAK #$CityOfSanFranciscoCA ?DIST)" )
    } );
    $kw18$DISTANCE_BETWEEN_POS = makeKeyword( "DISTANCE-BETWEEN-POS" );
    $list19 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "distanceBetween" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "PREFERRED" ) );
  }
}
/*
 * 
 * Total time: 102 ms
 * 
 */