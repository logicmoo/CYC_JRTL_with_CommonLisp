package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class removal_modules_ke_useless_precision_value
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value";
  public static final String myFingerPrint = "7dc7993fea930a9b42f6f392294bd07b437b2889664906070ba1602557ff54a3";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 879L)
  private static SubLSymbol $useless_precision_from_relevant_precision_rule_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 1590L)
  private static SubLSymbol $useless_precision_from_relevant_precision_rule_antecedent_template$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$CODE;
  private static final SubLObject $const2$UniversalVocabularyMt;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$PROBLEM_STORE;
  private static final SubLSymbol $kw6$CONTINUABLE_;
  private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw9$RETURN;
  private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$INTERVAL;
  private static final SubLSymbol $sym13$TERM;
  private static final SubLObject $const14$keUselessPrecisionValueForSlotOnT;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION;
  private static final SubLList $list17;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 1396L)
  public static SubLObject make_useless_precision_from_relevant_precision_rule_support()
  {
    return arguments.make_hl_support( $kw1$CODE, $useless_precision_from_relevant_precision_rule_formula$.getGlobalValue(), $const2$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 2069L)
  public static SubLObject useless_precision_from_relevant_precision_rule_antecedent_dnf(final SubLObject v_term, final SubLObject interval)
  {
    final SubLObject rule_antecedent_info = $useless_precision_from_relevant_precision_rule_antecedent_template$.getGlobalValue();
    final SubLObject input_values = ConsesLow.list( v_term, interval );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 2891L)
  public static SubLObject removal_useless_precision_from_relevant_precision_antecedent_answers(final SubLObject v_term, final SubLObject interval, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store = inference_worker.currently_active_problem_store();
    thread.resetMultipleValues();
    final SubLObject rule_antecedent_dnf = useless_precision_from_relevant_precision_rule_antecedent_dnf( v_term, interval );
    final SubLObject scoped_vars = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return inference_kernel.new_cyc_query_from_dnf( rule_antecedent_dnf, mt, scoped_vars, ConsesLow.list( new SubLObject[] { $kw5$PROBLEM_STORE, problem_store, $kw6$CONTINUABLE_, NIL,
      $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $kw9$RETURN, $kw10$BINDINGS_AND_SUPPORTS
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp", position = 3595L)
  public static SubLObject removal_useless_precision_from_relevant_precision_pos_expand(final SubLObject asent, SubLObject sense)
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
      final SubLObject interval = list_utilities.alist_lookup_without_values( v_bindings, $sym12$INTERVAL, UNPROVIDED, UNPROVIDED );
      final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym13$TERM, UNPROVIDED, UNPROVIDED );
      final SubLObject antecedent_answers = removal_useless_precision_from_relevant_precision_antecedent_answers( v_term, interval, UNPROVIDED );
      if( NIL != antecedent_answers )
      {
        final SubLObject output_template = ConsesLow.list( $const14$keUselessPrecisionValueForSlotOnT, variables.find_variable_by_id( ZERO_INTEGER ), v_term, interval );
        final SubLObject rule_support = make_useless_precision_from_relevant_precision_rule_support();
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

  public static SubLObject declare_removal_modules_ke_useless_precision_value_file()
  {
    SubLFiles.declareFunction( me, "make_useless_precision_from_relevant_precision_rule_support", "MAKE-USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "useless_precision_from_relevant_precision_rule_antecedent_dnf", "USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-DNF", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_useless_precision_from_relevant_precision_antecedent_answers", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-ANTECEDENT-ANSWERS", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_useless_precision_from_relevant_precision_pos_expand", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_ke_useless_precision_value_file()
  {
    $useless_precision_from_relevant_precision_rule_formula$ = SubLFiles.deflexical( "*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-FORMULA*", $list0 );
    $useless_precision_from_relevant_precision_rule_antecedent_template$ = SubLFiles.deflexical( "*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-TEMPLATE*", $list3 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_ke_useless_precision_value_file()
  {
    inference_modules.inference_removal_module( $kw16$REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION, $list17 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_ke_useless_precision_value_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_ke_useless_precision_value_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_ke_useless_precision_value_file();
  }
  static
  {
    me = new removal_modules_ke_useless_precision_value();
    $useless_precision_from_relevant_precision_rule_formula$ = null;
    $useless_precision_from_relevant_precision_rule_antecedent_template$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TERM" ), makeSymbol( "?TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "intervalSize" ) ), makeSymbol(
            "?INTERVAL" ), makeSymbol( "?INTERVAL-SIZE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?INTERVAL-SIZE" ), makeSymbol( "?SIZE" ) ), ConsesLow
                .list( constant_handles.reader_make_constant_shell( makeString( "keRelevantPrecisionValueForSlotOnType" ) ), makeSymbol( "?SLOT" ), makeSymbol( "?TYPE" ), makeSymbol( "?SIZE" ) ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "keUselessPrecisionValueForSlotOnTerm" ) ), makeSymbol( "?SLOT" ), makeSymbol( "?TERM" ), makeSymbol( "?INTERVAL" ) ) );
    $kw1$CODE = makeKeyword( "CODE" );
    $const2$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $list3 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "?TERM" ), makeSymbol( "?INTERVAL" ) ), ConsesLow.list( makeSymbol( "?SLOT" ), makeSymbol( "?TYPE" ), makeSymbol( "?SIZE" ), makeSymbol(
        "?INTERVAL-SIZE" ) ), ConsesLow.list( makeSymbol( "?TYPE" ), makeSymbol( "?SIZE" ), makeSymbol( "?INTERVAL-SIZE" ) ) ), ConsesLow.list( NIL, ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TERM" ), makeSymbol( "?TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "intervalSize" ) ), makeSymbol(
                "?INTERVAL" ), makeSymbol( "?INTERVAL-SIZE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?INTERVAL-SIZE" ), makeSymbol( "?SIZE" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keRelevantPrecisionValueForSlotOnType" ) ), makeSymbol( "?SLOT" ), makeSymbol( "?TYPE" ), makeSymbol( "?SIZE" ) ) ) ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "INPUT-EL-VARS" ), makeSymbol( "OUTPUT-EL-VARS" ), makeSymbol( "SCOPED-EL-VARS" ) ), makeSymbol( "EL-DNF-TEMPLATE" ) );
    $kw5$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw6$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw9$RETURN = makeKeyword( "RETURN" );
    $kw10$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keUselessPrecisionValueForSlotOnTerm" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INTERVAL" ) ) );
    $sym12$INTERVAL = makeSymbol( "INTERVAL" );
    $sym13$TERM = makeSymbol( "TERM" );
    $const14$keUselessPrecisionValueForSlotOnT = constant_handles.reader_make_constant_shell( makeString( "keUselessPrecisionValueForSlotOnTerm" ) );
    $list15 = ConsesLow.list( makeSymbol( "ANTECEDENT-BINDINGS" ), makeSymbol( "ANTECEDENT-SUPPORTS" ) );
    $kw16$REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION = makeKeyword( "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION" );
    $list17 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "keUselessPrecisionValueForSlotOnTerm" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keUselessPrecisionValueForSlotOnTerm" ) ), makeKeyword(
            "ANYTHING" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$keUselessPrecisionValueForSlotOnTerm <whatever> <fully-bound> <fully-bound>)\n    using relevant precision information from the KB." ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$keUselessPrecisionValueForSlotOnTerm #$age #$Muffet (#$YearsDuration 1 19))" )
    } );
  }
}
/*
 * 
 * Total time: 90 ms
 * 
 */