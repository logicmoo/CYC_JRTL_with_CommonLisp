package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_sksi_sentence
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi_sentence";
  public static final String myFingerPrint = "281feab1d471ec7d1f07cb5dbf01c09788991ee65b6a5bd148217b4b3848f8ab";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 814L)
  private static SubLSymbol $default_sksi_sentence_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 915L)
  private static SubLSymbol $sksi_sentence_allowed_modules_spec$;
  private static final SubLObject $const0$sksiSentence;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$REMOVAL_SKSI_SENTENCE_LOOKUP_POS;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$POS;
  private static final SubLSymbol $kw5$STRICT;
  private static final SubLSymbol $kw6$RETURN;
  private static final SubLSymbol $kw7$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw8$ALLOWED_MODULES;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$REMOVAL_SKSI_SENTENCE_CHECK_NEG;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$OPAQUE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 1901L)
  public static SubLObject removal_sksi_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_sksi_sentence_lookup_pos_cost_int( subsentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 2118L)
  public static SubLObject removal_sksi_sentence_lookup_pos_cost_int(final SubLObject sentence)
  {
    if( NIL != variables.fully_bound_p( sentence ) )
    {
      return $default_sksi_sentence_check_cost$.getGlobalValue();
    }
    if( NIL != el_utilities.atomic_sentenceP( sentence ) )
    {
      return sksi_query_utilities.sksi_sentence_cost( sentence, $kw4$POS, UNPROVIDED );
    }
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      final SubLObject conjuncts = cycl_utilities.formula_args( sentence, UNPROVIDED );
      SubLObject costs = NIL;
      SubLObject cdolist_list_var = conjuncts;
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject conjunct_cost = removal_sksi_sentence_lookup_pos_cost_int( conjunct );
        if( NIL != conjunct_cost )
        {
          costs = ConsesLow.cons( conjunct_cost, costs );
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return sksi_conjunctive_removal_modules_cost.guess_cost_from_literal_costs( costs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 2849L)
  public static SubLObject removal_sksi_sentence_lookup_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
    final SubLObject _prev_bind_0 = czer_vars.$canonicalize_gaf_commutative_termsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding( thread );
    try
    {
      czer_vars.$canonicalize_gaf_commutative_termsP$.bind( NIL, thread );
      sksi_macros.$sksi_default_ms_type_check_strength$.bind( $kw5$STRICT, thread );
      SubLObject cdolist_list_var;
      final SubLObject result = cdolist_list_var = ask_utilities.inference_recursive_query( subsentence, mt, ConsesLow.list( $kw6$RETURN, $kw7$BINDINGS_AND_SUPPORTS, $kw8$ALLOWED_MODULES,
          $sksi_sentence_allowed_modules_spec$.getGlobalValue() ) );
      SubLObject bindings_and_supports = NIL;
      bindings_and_supports = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = bindings_and_supports;
        SubLObject v_bindings = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
        supports = current.first();
        current = current.rest();
        if( NIL == current )
        {
          backward.removal_add_node( supports.first(), v_bindings, supports.rest() );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        bindings_and_supports = cdolist_list_var.first();
      }
    }
    finally
    {
      sksi_macros.$sksi_default_ms_type_check_strength$.rebind( _prev_bind_2, thread );
      czer_vars.$canonicalize_gaf_commutative_termsP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 4234L)
  public static SubLObject removal_sksi_sentence_lookup_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return $default_sksi_sentence_check_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 4380L)
  public static SubLObject removal_sksi_sentence_lookup_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
    final SubLObject _prev_bind_0 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding( thread );
    try
    {
      sksi_macros.$sksi_default_ms_type_check_strength$.bind( $kw5$STRICT, thread );
      final SubLObject result = ask_utilities.inference_recursive_query( subsentence, mt, ConsesLow.list( $kw8$ALLOWED_MODULES, $sksi_sentence_allowed_modules_spec$.getGlobalValue() ) );
      if( NIL == result )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw12$OPAQUE, el_utilities.make_negation( subsentence ), mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      sksi_macros.$sksi_default_ms_type_check_strength$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_sksi_sentence_file()
  {
    SubLFiles.declareFunction( me, "removal_sksi_sentence_lookup_pos_cost", "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sksi_sentence_lookup_pos_cost_int", "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-COST-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_sentence_lookup_pos_expand", "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sksi_sentence_lookup_neg_cost", "REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sksi_sentence_lookup_neg_expand", "REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_sksi_sentence_file()
  {
    $default_sksi_sentence_check_cost$ = SubLFiles.deflexical( "*DEFAULT-SKSI-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    $sksi_sentence_allowed_modules_spec$ = SubLFiles.deflexical( "*SKSI-SENTENCE-ALLOWED-MODULES-SPEC*", $list1 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_sksi_sentence_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$sksiSentence );
    inference_modules.inference_removal_module( $kw2$REMOVAL_SKSI_SENTENCE_LOOKUP_POS, $list3 );
    inference_modules.inference_removal_module( $kw10$REMOVAL_SKSI_SENTENCE_CHECK_NEG, $list11 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_sksi_sentence_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_sksi_sentence_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_sksi_sentence_file();
  }
  static
  {
    me = new removal_modules_sksi_sentence();
    $default_sksi_sentence_check_cost$ = null;
    $sksi_sentence_allowed_modules_spec$ = null;
    $const0$sksiSentence = constant_handles.reader_make_constant_shell( makeString( "sksiSentence" ) );
    $list1 = ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "SKSI" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list(
        makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL" ) ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL-CONJUNCTIVE" ) ) ) ) );
    $kw2$REMOVAL_SKSI_SENTENCE_LOOKUP_POS = makeKeyword( "REMOVAL-SKSI-SENTENCE-LOOKUP-POS" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sksiSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksiSentence" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                makeString( "and" ) ), makeKeyword( "ANYTHING" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                    "EXPAND" ), makeSymbol( "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(#$sksiSentence \n     (:or\n      (:fully-bound . :fully-bound)\n      ((:test inference-predicate-p) . :anything)\n      (#$and . :anything)))\n    using accessible virtual assertions" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$sksiSentence (#$weather #$CityOfLosAngelesCA ?WHAT))" )
    } );
    $kw4$POS = makeKeyword( "POS" );
    $kw5$STRICT = makeKeyword( "STRICT" );
    $kw6$RETURN = makeKeyword( "RETURN" );
    $kw7$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw8$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $list9 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $kw10$REMOVAL_SKSI_SENTENCE_CHECK_NEG = makeKeyword( "REMOVAL-SKSI-SENTENCE-CHECK-NEG" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sksiSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksiSentence" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-PREDICATE-P" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol(
                "REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$not (#$sksiSentence <fully-bound>))\n    using the absence of accessible virtual assertions" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$not (#$sksiSentence (#$weather #$CityOfLosAngelesCA #$Snowy)))" )
    } );
    $kw12$OPAQUE = makeKeyword( "OPAQUE" );
  }
}
/*
 * 
 * Total time: 90 ms
 * 
 */