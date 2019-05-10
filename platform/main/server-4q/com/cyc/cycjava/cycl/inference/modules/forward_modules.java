package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forward_modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.forward_modules";
  public static final String myFingerPrint = "dd3a325d8a9a7a7e20b036b53ac8460ee5b0329bf7869144464dec69d553dc94";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 740L)
  private static SubLSymbol $forward_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2023L)
  private static SubLSymbol $forward_tactic_specs$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2229L)
  private static SubLSymbol $prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
  private static SubLSymbol $cached_all_specs_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
  private static SubLSymbol $cached_all_genl_mts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
  private static SubLSymbol $cached_all_spec_mts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
  private static SubLSymbol $cached_all_genl_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
  private static SubLSymbol $cached_all_genl_inverses_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
  private static SubLSymbol $cached_all_negation_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
  private static SubLSymbol $cached_all_negation_inverses_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 64490L)
  public static SubLSymbol $gaf_predicate_forward_inference_enabledP$;
  private static final SubLSymbol $kw0$FORWARD;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$DO_LIST;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DO_FORWARD_MODULES_LIST;
  private static final SubLSymbol $sym8$DO_FORWARD_MODULES;
  private static final SubLSymbol $kw9$QUERY;
  private static final SubLSymbol $sym10$TMS_ASSERTION_BEING_REMOVED_;
  private static final SubLSymbol $sym11$FORWARD_TACTIC_SPEC_RULE;
  private static final SubLSymbol $sym12$FORWARD_TACTIC_SPEC_;
  private static final SubLSymbol $sym13$KBEQ;
  private static final SubLSymbol $kw14$ALL;
  private static final SubLSymbol $kw15$FORWARD_TACTIC_SPECS;
  private static final SubLSymbol $kw16$NO_RULE;
  private static final SubLSymbol $kw17$NEG;
  private static final SubLSymbol $kw18$RULE;
  private static final SubLSymbol $kw19$POS;
  private static final SubLSymbol $kw20$FORWARD_NORMAL_POS;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$FORWARD_NORMAL_NEG;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$FORWARD_ISA;
  private static final SubLList $list25;
  private static final SubLObject $const26$isa;
  private static final SubLSymbol $kw27$GENLS;
  private static final SubLObject $const28$genls;
  private static final SubLSymbol $sym29$FORWARD_INFERENCE_ALL_GENLS;
  private static final SubLSymbol $kw30$FORWARD_NOT_ISA;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CACHED_ALL_SPECS;
  private static final SubLSymbol $sym33$_CACHED_ALL_SPECS_CACHING_STATE_;
  private static final SubLInteger $int34$64;
  private static final SubLSymbol $sym35$CLEAR_CACHED_ALL_SPECS;
  private static final SubLSymbol $kw36$FORWARD_QUOTED_ISA;
  private static final SubLList $list37;
  private static final SubLObject $const38$quotedIsa;
  private static final SubLSymbol $kw39$FORWARD_NOT_QUOTED_ISA;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$FORWARD_GENLS;
  private static final SubLList $list42;
  private static final SubLSymbol $kw43$FORWARD_NOT_GENLS;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$FORWARD_GENLMT;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$CACHED_ALL_GENL_MTS;
  private static final SubLSymbol $sym48$_CACHED_ALL_GENL_MTS_CACHING_STATE_;
  private static final SubLSymbol $sym49$CLEAR_CACHED_ALL_GENL_MTS;
  private static final SubLObject $const50$genlMt;
  private static final SubLSymbol $kw51$GENLMT;
  private static final SubLSymbol $kw52$FORWARD_NOT_GENLMT;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$CACHED_ALL_SPEC_MTS;
  private static final SubLSymbol $sym55$_CACHED_ALL_SPEC_MTS_CACHING_STATE_;
  private static final SubLSymbol $sym56$CLEAR_CACHED_ALL_SPEC_MTS;
  private static final SubLSymbol $kw57$FORWARD_SYMMETRIC_POS;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$ISA;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$FORWARD_SYMMETRIC_NEG;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$FORWARD_ASYMMETRIC;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$FORWARD_COMMUTATIVE_POS;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $kw71$FORWARD_COMMUTATIVE_NEG;
  private static final SubLList $list72;
  private static final SubLSymbol $kw73$FORWARD_GENLPREDS_GAF;
  private static final SubLList $list74;
  private static final SubLObject $const75$genlPreds;
  private static final SubLObject $const76$genlInverse;
  private static final SubLSymbol $sym77$CACHED_ALL_GENL_PREDS;
  private static final SubLSymbol $sym78$_CACHED_ALL_GENL_PREDS_CACHING_STATE_;
  private static final SubLSymbol $sym79$CLEAR_CACHED_ALL_GENL_PREDS;
  private static final SubLSymbol $sym80$CACHED_ALL_GENL_INVERSES;
  private static final SubLSymbol $sym81$_CACHED_ALL_GENL_INVERSES_CACHING_STATE_;
  private static final SubLSymbol $sym82$CLEAR_CACHED_ALL_GENL_INVERSES;
  private static final SubLSymbol $kw83$GENLPREDS;
  private static final SubLSymbol $kw84$FORWARD_NOT_GENLPREDS_GAF;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$FORWARD_GENLPREDS_POS;
  private static final SubLList $list87;
  private static final SubLSymbol $kw88$FORWARD_GENLINVERSE_GAF;
  private static final SubLList $list89;
  private static final SubLSymbol $kw90$FORWARD_NOT_GENLINVERSE_GAF;
  private static final SubLList $list91;
  private static final SubLSymbol $kw92$FORWARD_GENLINVERSE_POS;
  private static final SubLList $list93;
  private static final SubLSymbol $kw94$FORWARD_NEGATIONPREDS;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$CACHED_ALL_NEGATION_PREDS;
  private static final SubLSymbol $sym97$_CACHED_ALL_NEGATION_PREDS_CACHING_STATE_;
  private static final SubLSymbol $sym98$CLEAR_CACHED_ALL_NEGATION_PREDS;
  private static final SubLList $list99;
  private static final SubLSymbol $kw100$NEGATIONPREDS;
  private static final SubLObject $const101$negationPreds;
  private static final SubLSymbol $kw102$FORWARD_NEGATIONINVERSE;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$CACHED_ALL_NEGATION_INVERSES;
  private static final SubLSymbol $sym105$_CACHED_ALL_NEGATION_INVERSES_CACHING_STATE_;
  private static final SubLSymbol $sym106$CLEAR_CACHED_ALL_NEGATION_INVERSES;
  private static final SubLList $list107;
  private static final SubLObject $const108$negationInverse;
  private static final SubLSymbol $kw109$FORWARD_EVAL_POS;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLSymbol $kw112$FORWARD_EVAL_NEG;
  private static final SubLList $list113;
  private static final SubLSymbol $kw114$FORWARD_TERM_OF_UNIT;
  private static final SubLList $list115;
  private static final SubLObject $const116$termOfUnit;
  private static final SubLSymbol $kw117$FORWARD_NAT_FUNCTION;
  private static final SubLList $list118;
  private static final SubLObject $const119$natFunction;
  private static final SubLSymbol $kw120$FORWARD_GAF_PREDICATE;
  private static final SubLList $list121;
  private static final SubLObject $const122$gafPredicate;
  private static final SubLSymbol $kw123$GAF;
  private static final SubLSymbol $kw124$TRUE_MON;
  private static final SubLSymbol $kw125$FORWARD_UNBOUND_PRED_POS;
  private static final SubLList $list126;
  private static final SubLSymbol $kw127$FORWARD_UNBOUND_PRED_NEG;
  private static final SubLList $list128;
  private static final SubLSymbol $kw129$FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS;
  private static final SubLList $list130;
  private static final SubLSymbol $kw131$FORWARD_IST_POS;
  private static final SubLList $list132;
  private static final SubLObject $const133$BaseKB;
  private static final SubLSymbol $kw134$FORWARD_IST_NEG;
  private static final SubLList $list135;
  private static final SubLObject $const136$ist;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 951L)
  public static SubLObject forward_modules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $forward_modules$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1028L)
  public static SubLObject forward_module_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.length( $forward_modules$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1104L)
  public static SubLObject forward_module_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != inference_modules.hl_module_p( v_object ) && NIL != conses_high.member( v_object, $forward_modules$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1223L)
  public static SubLObject forward_module(final SubLObject name, final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject item_var;
    final SubLObject hl_module = item_var = inference_modules.setup_module( name, $kw0$FORWARD, plist );
    if( NIL == conses_high.member( item_var, $forward_modules$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $forward_modules$.setDynamicValue( ConsesLow.cons( item_var, $forward_modules$.getDynamicValue( thread ) ), thread );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1448L)
  public static SubLObject undeclare_forward_module(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_module = inference_modules.find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      inference_modules.remove_hl_module( hl_module );
      $forward_modules$.setDynamicValue( Sequences.delete( hl_module, $forward_modules$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1749L)
  public static SubLObject do_forward_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    hl_module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_LIST, ConsesLow.list( hl_module, $list6, $kw4$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1917L)
  public static SubLObject do_forward_modules_list()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $forward_modules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2331L)
  public static SubLObject forward_examine_asent_triggering_allowedP(final SubLObject examine_asent)
  {
    return makeBoolean( NIL == el_utilities.default_forward_non_trigger_literal_litP( examine_asent ) && ( NIL == el_utilities.atomic_sentenceP( examine_asent ) || NIL == relation_evaluation.evaluatable_predicateP(
        cycl_utilities.atomic_sentence_predicate( examine_asent ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2598L)
  public static SubLObject forward_module_callback(final SubLObject trigger_asent, final SubLObject trigger_sense, final SubLObject examine_asent, SubLObject trigger_support, final SubLObject rule,
      SubLObject trigger_supports)
  {
    if( trigger_supports == UNPROVIDED )
    {
      trigger_supports = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue( thread ) )
    {
      if( NIL != forward.current_forward_inference_gaf() )
      {
        trigger_support = forward.current_forward_inference_gaf();
      }
      if( NIL != trigger_support )
      {
        trigger_support = arguments.make_hl_support( $kw9$QUERY, arguments.support_sentence( trigger_support ), arguments.support_mt( trigger_support ), arguments.support_tv( trigger_support ) );
        trigger_supports = NIL;
      }
    }
    if( NIL != forward_examine_asent_triggering_allowedP( examine_asent ) )
    {
      $forward_tactic_specs$.setDynamicValue( ConsesLow.cons( ConsesLow.list( trigger_asent, trigger_sense, examine_asent, trigger_support, rule, trigger_supports ), $forward_tactic_specs$.getDynamicValue( thread ) ),
          thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 3310L)
  public static SubLObject forward_tactic_specs(final SubLObject source_asent, final SubLObject source_sense, final SubLObject propagation_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != forward.forward_inference_allowed_rules() )
    {
      final SubLObject _prev_bind_0 = $forward_tactic_specs$.currentBinding( thread );
      try
      {
        $forward_tactic_specs$.bind( NIL, thread );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( propagation_mt );
        final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          SubLObject cdolist_list_var = forward_hl_modules( source_asent, source_sense );
          SubLObject forward_hl_module = NIL;
          forward_hl_module = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            forward_hl_module_apply( forward_hl_module, source_asent );
            cdolist_list_var = cdolist_list_var.rest();
            forward_hl_module = cdolist_list_var.first();
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$2, thread );
        }
        result = list_utilities.fast_delete_duplicates( $forward_tactic_specs$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != tms.tms_any_assertion_being_removedP() )
        {
          result = Sequences.remove_if( $sym10$TMS_ASSERTION_BEING_REMOVED_, result, $sym11$FORWARD_TACTIC_SPEC_RULE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        $forward_tactic_specs$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var2 = wff.assertive_wff_rules();
    SubLObject assertive_wff_rule = NIL;
    assertive_wff_rule = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject possible_assertive_wff_rule_forward_tactic_spec = Sequences.find( assertive_wff_rule, result, $sym13$KBEQ, $sym11$FORWARD_TACTIC_SPEC_RULE, UNPROVIDED, UNPROVIDED );
      if( NIL != possible_assertive_wff_rule_forward_tactic_spec )
      {
        result = list_utilities.nmove_to_front( possible_assertive_wff_rule_forward_tactic_spec, result, EQUAL );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      assertive_wff_rule = cdolist_list_var2.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 4976L)
  public static SubLObject forward_tactic_spec_rule(final SubLObject forward_tactic_spec)
  {
    return conses_high.fifth( forward_tactic_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 5077L)
  public static SubLObject forward_tactic_specL(final SubLObject forward_tactic_spec_1, final SubLObject forward_tactic_spec_2)
  {
    final SubLObject forward_tactic_spec_1_rule = forward_tactic_spec_rule( forward_tactic_spec_1 );
    final SubLObject forward_tactic_spec_1_assertive_wff_ruleP = wff.assertive_wff_ruleP( forward_tactic_spec_1_rule );
    final SubLObject forward_tactic_spec_2_rule = forward_tactic_spec_rule( forward_tactic_spec_2 );
    final SubLObject forward_tactic_spec_2_assertive_wff_ruleP = wff.assertive_wff_ruleP( forward_tactic_spec_2_rule );
    if( NIL != forward_tactic_spec_1_assertive_wff_ruleP && NIL == forward_tactic_spec_2_assertive_wff_ruleP )
    {
      return T;
    }
    if( NIL == forward_tactic_spec_1_assertive_wff_ruleP && NIL != forward_tactic_spec_2_assertive_wff_ruleP )
    {
      return NIL;
    }
    return Numbers.numL( assertion_handles.assertion_id( forward_tactic_spec_1_rule ), assertion_handles.assertion_id( forward_tactic_spec_2_rule ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 5900L)
  public static SubLObject forward_hl_modules(final SubLObject asent, final SubLObject sense)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject hl_modules = NIL;
    SubLObject supplanted_modules = NIL;
    SubLObject exclusive_foundP;
    SubLObject rest;
    SubLObject hl_module;
    SubLObject exclusive_func;
    SubLObject pcase_var;
    SubLObject supplants_info;
    SubLObject cdolist_list_var;
    SubLObject newly_supplanted_module_names;
    SubLObject supplanted_module_name;
    SubLObject supplanted_module;
    SubLObject required_func;
    for( exclusive_foundP = NIL, rest = NIL, rest = do_forward_modules_list(); NIL == exclusive_foundP && NIL != rest; rest = rest.rest() )
    {
      hl_module = rest.first();
      if( NIL != inference_modules.hl_module_activeP( hl_module, NIL ) && ( NIL == supplanted_modules || NIL == conses_high.member( hl_module, supplanted_modules, UNPROVIDED, UNPROVIDED ) ) && NIL != inference_modules
          .hl_module_sense_relevant_p( hl_module, sense ) && NIL != inference_modules.hl_module_predicate_relevant_p( hl_module, predicate ) && NIL != inference_modules.hl_module_required_pattern_matched_p( hl_module,
              asent ) )
      {
        exclusive_func = inference_modules.hl_module_exclusive_func( hl_module );
        if( NIL == exclusive_func || NIL != Functions.funcall( exclusive_func, asent ) )
        {
          if( NIL != exclusive_func )
          {
            supplants_info = ( pcase_var = inference_modules.hl_module_supplants_info( hl_module ) );
            if( pcase_var.eql( $kw14$ALL ) )
            {
              hl_modules = NIL;
              exclusive_foundP = T;
            }
            else
            {
              newly_supplanted_module_names = ( cdolist_list_var = supplants_info );
              supplanted_module_name = NIL;
              supplanted_module_name = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                supplanted_module = inference_modules.find_hl_module_by_name( supplanted_module_name );
                if( NIL != supplanted_module )
                {
                  supplanted_modules = ConsesLow.cons( supplanted_module, supplanted_modules );
                  hl_modules = list_utilities.delete_first( supplanted_module, hl_modules, Symbols.symbol_function( EQL ) );
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_module_name = cdolist_list_var.first();
              }
            }
          }
          required_func = inference_modules.hl_module_required_func( hl_module );
          if( NIL == required_func || NIL != Functions.funcall( required_func, asent ) )
          {
            hl_modules = ConsesLow.cons( hl_module, hl_modules );
          }
        }
      }
    }
    return Sequences.nreverse( hl_modules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 7789L)
  public static SubLObject forward_hl_module_apply(final SubLObject forward_hl_module, final SubLObject source_asent)
  {
    final SubLObject candidate_rules = forward_hl_module_rule_select( forward_hl_module, source_asent );
    final SubLObject rules = ( NIL != candidate_rules ) ? forward_hl_module_rule_filter( forward_hl_module, source_asent, candidate_rules ) : NIL;
    return forward_hl_module_expand( forward_hl_module, source_asent, rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8147L)
  public static SubLObject forward_inference_rule_select_via_allowed_rulesP()
  {
    return makeBoolean( NIL == forward.forward_inference_all_rules_allowedP() && forward.forward_inference_allowed_rules().isList() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8375L)
  public static SubLObject forward_hl_module_rule_select(final SubLObject forward_hl_module, final SubLObject source_asent)
  {
    if( NIL != forward_inference_rule_select_via_allowed_rulesP() )
    {
      return forward.forward_inference_allowed_rules();
    }
    final SubLObject rule_select_method = inference_modules.hl_module_rule_select_func( forward_hl_module );
    return rule_select_method.isFunctionSpec() ? Functions.funcall( rule_select_method, source_asent ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8819L)
  public static SubLObject forward_hl_module_rule_filter(final SubLObject forward_hl_module, final SubLObject source_asent, SubLObject rules)
  {
    if( NIL != forward_inference_rule_select_via_allowed_rulesP() )
    {
      final SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func( forward_hl_module );
      if( rule_filter_method.isFunctionSpec() )
      {
        SubLObject filtered_rules = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != Functions.funcall( rule_filter_method, source_asent, rule ) )
          {
            filtered_rules = ConsesLow.cons( rule, filtered_rules );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rule = cdolist_list_var.first();
        }
        rules = Sequences.nreverse( filtered_rules );
      }
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 9395L)
  public static SubLObject forward_hl_module_expand(final SubLObject forward_hl_module, final SubLObject source_asent, final SubLObject rules)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject expand_function = inference_modules.hl_module_expand_func( forward_hl_module );
    if( expand_function.isFunctionSpec() )
    {
      final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue( thread );
      final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue( thread );
      final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue( thread );
      final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue( thread );
      if( NIL != last_metric_type && NIL != last_metric )
      {
        inference_metrics.increment_forward_inference_metrics( last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER );
      }
      final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding( thread );
      final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding( thread );
      final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding( thread );
      final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding( thread );
      try
      {
        hl_macros.$forward_inference_metric_last_metric_type$.bind( $kw15$FORWARD_TACTIC_SPECS, thread );
        hl_macros.$forward_inference_metric_last_metric$.bind( expand_function, thread );
        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind( NIL, thread );
        hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind( $kw16$NO_RULE, thread );
        try
        {
          SubLObject cdolist_list_var = rules;
          SubLObject rule = NIL;
          rule = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            Functions.funcall( expand_function, source_asent, rule );
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            inference_metrics.increment_forward_inference_metrics( $kw15$FORWARD_TACTIC_SPECS, expand_function, NIL, $kw16$NO_RULE, NIL );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
          }
        }
      }
      finally
      {
        hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind( _prev_bind_4, thread );
        hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind( _prev_bind_3, thread );
        hl_macros.$forward_inference_metric_last_metric$.rebind( _prev_bind_2, thread );
        hl_macros.$forward_inference_metric_last_metric_type$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 9791L)
  public static SubLObject all_antecedent_predicate_forward_rules(final SubLObject pred)
  {
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, $kw17$NEG, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, $kw17$NEG, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$4 = NIL;
              final SubLObject token_var_$5 = NIL;
              while ( NIL == done_var_$4)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( rule ) );
                if( NIL != valid_$6 )
                {
                  rules = ConsesLow.cons( rule, rules );
                }
                done_var_$4 = makeBoolean( NIL == valid_$6 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    rules = list_utilities.fast_delete_duplicates( rules, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 10285L)
  public static SubLObject all_consequent_predicate_forward_rules(final SubLObject pred)
  {
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, $kw19$POS, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, $kw19$POS, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$7 = NIL;
              final SubLObject token_var_$8 = NIL;
              while ( NIL == done_var_$7)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
                final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( rule ) );
                if( NIL != valid_$9 )
                {
                  rules = ConsesLow.cons( rule, rules );
                }
                done_var_$7 = makeBoolean( NIL == valid_$9 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    rules = list_utilities.fast_delete_duplicates( rules, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 10587L)
  public static SubLObject all_ist_predicate_forward_rules(final SubLObject pred)
  {
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$10 = genl_predicates.all_genl_preds( pred, UNPROVIDED, UNPROVIDED );
      SubLObject genl_pred = NIL;
      genl_pred = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        if( NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator( genl_pred, NIL, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator( genl_pred, NIL, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$11 = NIL;
                final SubLObject token_var_$12 = NIL;
                while ( NIL == done_var_$11)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$12 );
                  final SubLObject valid_$13 = makeBoolean( !token_var_$12.eql( rule ) );
                  if( NIL != valid_$13 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$11 = makeBoolean( NIL == valid_$13 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        genl_pred = cdolist_list_var_$10.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    rules = list_utilities.fast_delete_duplicates( rules, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11222L)
  public static SubLObject forward_normal_pos_rule_select(final SubLObject asent)
  {
    return all_antecedent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11362L)
  public static SubLObject forward_normal_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_normal_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11477L)
  public static SubLObject forward_normal_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    SubLObject cdolist_list_var = forward_normal_pos_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      forward_module_callback( asent, $kw19$POS, examine_lit, NIL, rule, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11677L)
  public static SubLObject forward_normal_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12311L)
  public static SubLObject forward_normal_neg_rule_select(final SubLObject asent)
  {
    return all_consequent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12451L)
  public static SubLObject forward_normal_neg_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_normal_neg_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12566L)
  public static SubLObject forward_normal_neg_expand(final SubLObject asent, final SubLObject rule)
  {
    SubLObject cdolist_list_var = forward_normal_neg_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      forward_module_callback( asent, $kw17$NEG, examine_lit, NIL, rule, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12766L)
  public static SubLObject forward_normal_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 13644L)
  public static SubLObject forward_isa_rule_select(final SubLObject asent)
  {
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = forward_inference_all_genls( col );
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$14 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$14.first();
      while ( NIL != cdolist_list_var_$14)
      {
        if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( genl, $kw17$NEG, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( genl, $kw17$NEG, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$15 = NIL;
                final SubLObject token_var_$16 = NIL;
                while ( NIL == done_var_$15)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$16 );
                  final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( rule ) );
                  if( NIL != valid_$17 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$15 = makeBoolean( NIL == valid_$17 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
        direction = cdolist_list_var_$14.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 14008L)
  public static SubLObject forward_isa_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_isa_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 14109L)
  public static SubLObject forward_isa_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_isa_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
        final SubLObject forward_asent = ConsesLow.list( $const26$isa, arg1, genl );
        final SubLObject more_supports = genl.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw27$GENLS, ConsesLow.list( $const28$genls, arg2, genl ), UNPROVIDED, UNPROVIDED ) );
        forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 14660L)
  public static SubLObject forward_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_col;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const26$isa.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_col = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_col ) && NIL != forward_inference_genlP( source_col, rule_col ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15196L)
  public static SubLObject forward_inference_genlP(final SubLObject source_col, final SubLObject rule_col)
  {
    return list_utilities.member_kbeqP( rule_col, forward_inference_all_genls( source_col ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15333L)
  public static SubLObject forward_inference_all_genls_internal(final SubLObject col)
  {
    return genls.all_genls( col, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15333L)
  public static SubLObject forward_inference_all_genls(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return forward_inference_all_genls_internal( col );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym29$FORWARD_INFERENCE_ALL_GENLS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym29$FORWARD_INFERENCE_ALL_GENLS, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym29$FORWARD_INFERENCE_ALL_GENLS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( forward_inference_all_genls_internal( col ) ) );
      memoization_state.caching_state_put( caching_state, col, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
  public static SubLObject clear_cached_all_specs()
  {
    final SubLObject cs = $cached_all_specs_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
  public static SubLObject remove_cached_all_specs(final SubLObject col)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_specs_caching_state$.getGlobalValue(), ConsesLow.list( col ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
  public static SubLObject cached_all_specs_internal(final SubLObject col)
  {
    return genls.all_specs( col, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15705L)
  public static SubLObject cached_all_specs(final SubLObject col)
  {
    SubLObject caching_state = $cached_all_specs_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym32$CACHED_ALL_SPECS, $sym33$_CACHED_ALL_SPECS_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genls_dependent_cache_clear_callback( $sym35$CLEAR_CACHED_ALL_SPECS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_specs_internal( col ) ) );
      memoization_state.caching_state_put( caching_state, col, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 15847L)
  public static SubLObject forward_not_isa_rule_select(final SubLObject asent)
  {
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_specs( col );
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$18 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$18.first();
      while ( NIL != cdolist_list_var_$18)
      {
        if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( spec, $kw19$POS, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( spec, $kw19$POS, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$19 = NIL;
                final SubLObject token_var_$20 = NIL;
                while ( NIL == done_var_$19)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$20 );
                  final SubLObject valid_$21 = makeBoolean( !token_var_$20.eql( rule ) );
                  if( NIL != valid_$21 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$19 = makeBoolean( NIL == valid_$21 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
        direction = cdolist_list_var_$18.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 16204L)
  public static SubLObject forward_not_isa_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_not_isa_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 16313L)
  public static SubLObject forward_not_isa_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_not_isa_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
        final SubLObject forward_asent = ConsesLow.list( $const26$isa, arg1, spec );
        final SubLObject more_supports = spec.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw27$GENLS, ConsesLow.list( $const28$genls, spec, arg2 ), UNPROVIDED, UNPROVIDED ) );
        forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 16872L)
  public static SubLObject forward_not_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_specs = cached_all_specs( source_col );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_col;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const26$isa.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_col = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_col ) && NIL != list_utilities.member_kbeqP( rule_col, all_specs ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18037L)
  public static SubLObject forward_quoted_isa_rule_select(final SubLObject asent)
  {
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = forward_inference_all_genls( col );
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$22 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$22.first();
      while ( NIL != cdolist_list_var_$22)
      {
        if( NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator( genl, $kw17$NEG, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator( genl, $kw17$NEG, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$23 = NIL;
                final SubLObject token_var_$24 = NIL;
                while ( NIL == done_var_$23)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$24 );
                  final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( rule ) );
                  if( NIL != valid_$25 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$23 = makeBoolean( NIL == valid_$25 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
        direction = cdolist_list_var_$22.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18415L)
  public static SubLObject forward_quoted_isa_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_quoted_isa_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18530L)
  public static SubLObject forward_quoted_isa_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_quoted_isa_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
        final SubLObject forward_asent = ConsesLow.list( $const38$quotedIsa, arg1, genl );
        final SubLObject more_supports = genl.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw27$GENLS, ConsesLow.list( $const28$genls, arg2, genl ), UNPROVIDED, UNPROVIDED ) );
        forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 19101L)
  public static SubLObject forward_quoted_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_col;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const38$quotedIsa.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_col = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_col ) && NIL != forward_inference_genlP( source_col, rule_col ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 19983L)
  public static SubLObject forward_not_quoted_isa_rule_select(final SubLObject asent)
  {
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_specs( col );
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$26 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$26.first();
      while ( NIL != cdolist_list_var_$26)
      {
        if( NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator( spec, $kw19$POS, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator( spec, $kw19$POS, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$27 = NIL;
                final SubLObject token_var_$28 = NIL;
                while ( NIL == done_var_$27)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$28 );
                  final SubLObject valid_$29 = makeBoolean( !token_var_$28.eql( rule ) );
                  if( NIL != valid_$29 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$27 = makeBoolean( NIL == valid_$29 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
        direction = cdolist_list_var_$26.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 20354L)
  public static SubLObject forward_not_quoted_isa_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_not_quoted_isa_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 20477L)
  public static SubLObject forward_not_quoted_isa_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_not_quoted_isa_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
        final SubLObject forward_asent = ConsesLow.list( $const38$quotedIsa, arg1, spec );
        final SubLObject more_supports = spec.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw27$GENLS, ConsesLow.list( $const28$genls, spec, arg2 ), UNPROVIDED, UNPROVIDED ) );
        forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 21056L)
  public static SubLObject forward_not_quoted_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_specs = cached_all_specs( source_col );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_col;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const38$quotedIsa.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_col = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_col ) && NIL != list_utilities.member_kbeqP( rule_col, all_specs ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 21906L)
  public static SubLObject forward_genls_rule_select(final SubLObject asent)
  {
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = forward_inference_all_genls( col );
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$30 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$30.first();
      while ( NIL != cdolist_list_var_$30)
      {
        if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( genl, $kw17$NEG, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( genl, $kw17$NEG, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$31 = NIL;
                final SubLObject token_var_$32 = NIL;
                while ( NIL == done_var_$31)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$32 );
                  final SubLObject valid_$33 = makeBoolean( !token_var_$32.eql( rule ) );
                  if( NIL != valid_$33 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$31 = makeBoolean( NIL == valid_$33 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
        direction = cdolist_list_var_$30.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22274L)
  public static SubLObject forward_genls_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_genls_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22379L)
  public static SubLObject forward_genls_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_genls_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
        final SubLObject forward_asent = ConsesLow.list( $const28$genls, arg1, genl );
        final SubLObject more_supports = genl.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw27$GENLS, ConsesLow.list( $const28$genls, arg2, genl ), UNPROVIDED, UNPROVIDED ) );
        forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22934L)
  public static SubLObject forward_genls_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_col;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const28$genls.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_col = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_col ) && NIL != forward_inference_genlP( source_col, rule_col ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 23767L)
  public static SubLObject forward_not_genls_rule_select(final SubLObject asent)
  {
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_specs( col );
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$34 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( spec, $kw19$POS, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( spec, $kw19$POS, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$35 = NIL;
                final SubLObject token_var_$36 = NIL;
                while ( NIL == done_var_$35)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$36 );
                  final SubLObject valid_$37 = makeBoolean( !token_var_$36.eql( rule ) );
                  if( NIL != valid_$37 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$35 = makeBoolean( NIL == valid_$37 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        direction = cdolist_list_var_$34.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 24128L)
  public static SubLObject forward_not_genls_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_not_genls_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 24241L)
  public static SubLObject forward_not_genls_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_genls_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
        final SubLObject forward_asent = ConsesLow.list( $const28$genls, arg1, spec );
        final SubLObject more_supports = spec.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw27$GENLS, ConsesLow.list( $const28$genls, spec, arg2 ), UNPROVIDED, UNPROVIDED ) );
        forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 24800L)
  public static SubLObject forward_not_genls_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_specs = cached_all_specs( source_col );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_col;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const28$genls.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_col = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_col ) && NIL != list_utilities.member_kbeqP( rule_col, all_specs ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
  public static SubLObject clear_cached_all_genl_mts()
  {
    final SubLObject cs = $cached_all_genl_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
  public static SubLObject remove_cached_all_genl_mts(final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_genl_mts_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
  public static SubLObject cached_all_genl_mts_internal(final SubLObject mt)
  {
    return genl_mts.all_genl_mts( mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25649L)
  public static SubLObject cached_all_genl_mts(final SubLObject mt)
  {
    SubLObject caching_state = $cached_all_genl_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym47$CACHED_ALL_GENL_MTS, $sym48$_CACHED_ALL_GENL_MTS_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym49$CLEAR_CACHED_ALL_GENL_MTS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_genl_mts_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 25797L)
  public static SubLObject forward_genlmt_rule_select(final SubLObject asent)
  {
    final SubLObject mt = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_genl_mts( mt );
    SubLObject genl_mt = NIL;
    genl_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$38 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$38.first();
      while ( NIL != cdolist_list_var_$38)
      {
        if( NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator( genl_mt, $kw17$NEG, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator( genl_mt, $kw17$NEG, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$39 = NIL;
                final SubLObject token_var_$40 = NIL;
                while ( NIL == done_var_$39)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$40 );
                  final SubLObject valid_$41 = makeBoolean( !token_var_$40.eql( rule ) );
                  if( NIL != valid_$41 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$39 = makeBoolean( NIL == valid_$41 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
        direction = cdolist_list_var_$38.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl_mt = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26164L)
  public static SubLObject forward_genlmt_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_genlmt_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26271L)
  public static SubLObject forward_genlmt_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_genlmt_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject genl_mt = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
      final SubLObject forward_asent = ConsesLow.list( $const50$genlMt, arg1, genl_mt );
      final SubLObject more_supports = genl_mt.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw51$GENLMT, ConsesLow.list( $const50$genlMt, arg2, genl_mt ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26804L)
  public static SubLObject forward_genlmt_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_mt = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_genl_mts = cached_all_genl_mts( source_mt );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_mt;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const50$genlMt.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_mt = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_mt ) && NIL != ( ( NIL != forts.fort_p( rule_mt ) ) ? list_utilities.member_kbeqP( rule_mt, all_genl_mts )
            : genl_mts.genl_mtP( source_mt, rule_mt, UNPROVIDED, UNPROVIDED ) ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
  public static SubLObject clear_cached_all_spec_mts()
  {
    final SubLObject cs = $cached_all_spec_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
  public static SubLObject remove_cached_all_spec_mts(final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_spec_mts_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
  public static SubLObject cached_all_spec_mts_internal(final SubLObject mt)
  {
    return genl_mts.all_spec_mts( mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27751L)
  public static SubLObject cached_all_spec_mts(final SubLObject mt)
  {
    SubLObject caching_state = $cached_all_spec_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym54$CACHED_ALL_SPEC_MTS, $sym55$_CACHED_ALL_SPEC_MTS_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym56$CLEAR_CACHED_ALL_SPEC_MTS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_spec_mts_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 27899L)
  public static SubLObject forward_not_genlmt_rule_select(final SubLObject asent)
  {
    final SubLObject mt = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_spec_mts( mt );
    SubLObject spec_mt = NIL;
    spec_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$42 = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      direction = cdolist_list_var_$42.first();
      while ( NIL != cdolist_list_var_$42)
      {
        if( NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator( spec_mt, $kw19$POS, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator( spec_mt, $kw19$POS, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                SubLObject done_var_$43 = NIL;
                final SubLObject token_var_$44 = NIL;
                while ( NIL == done_var_$43)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$44 );
                  final SubLObject valid_$45 = makeBoolean( !token_var_$44.eql( rule ) );
                  if( NIL != valid_$45 )
                  {
                    rules = ConsesLow.cons( rule, rules );
                  }
                  done_var_$43 = makeBoolean( NIL == valid_$45 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var_$42 = cdolist_list_var_$42.rest();
        direction = cdolist_list_var_$42.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_mt = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 28270L)
  public static SubLObject forward_not_genlmt_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_not_genlmt_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 28385L)
  public static SubLObject forward_not_genlmt_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_not_genlmt_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject spec_mt = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
      final SubLObject forward_asent = ConsesLow.list( $const50$genlMt, spec_mt, arg1 );
      final SubLObject more_supports = spec_mt.eql( arg2 ) ? NIL : ConsesLow.list( arguments.make_hl_support( $kw51$GENLMT, ConsesLow.list( $const50$genlMt, spec_mt, arg2 ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 28926L)
  public static SubLObject forward_not_genlmt_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject source_mt = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_spec_mts = cached_all_spec_mts( source_mt );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_mt;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( $const50$genlMt.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_mt = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_mt ) && NIL != ( ( NIL != forts.fort_p( rule_mt ) ) ? list_utilities.member_kbeqP( rule_mt, all_spec_mts ) : genl_mts.spec_mtP( source_mt, rule_mt, UNPROVIDED ) ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30005L)
  public static SubLObject forward_symmetric_pos_rule_select(final SubLObject asent)
  {
    return all_antecedent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30163L)
  public static SubLObject forward_symmetric_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_symmetric_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30284L)
  public static SubLObject forward_symmetric_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal( asent );
    final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list60 ), UNPROVIDED, UNPROVIDED ) );
    SubLObject cdolist_list_var = forward_symmetric_pos_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 30711L)
  public static SubLObject forward_symmetric_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 31498L)
  public static SubLObject forward_symmetric_neg_rule_select(final SubLObject asent)
  {
    return all_consequent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 31641L)
  public static SubLObject forward_symmetric_neg_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_symmetric_neg_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 31762L)
  public static SubLObject forward_symmetric_neg_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal( asent );
    final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list60 ), UNPROVIDED, UNPROVIDED ) );
    SubLObject cdolist_list_var = forward_symmetric_neg_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 32189L)
  public static SubLObject forward_symmetric_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 32930L)
  public static SubLObject forward_asymmetric_required(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list65;
    return makeBoolean( NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue( thread ) && NIL != formula_pattern_match.formula_matches_pattern( asent, pattern ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33216L)
  public static SubLObject forward_asymmetric_rule_select(final SubLObject asent)
  {
    return all_antecedent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33356L)
  public static SubLObject forward_asymmetric_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue( thread ) || NIL != list_utilities.lengthG( pragma_induction.rule_pos_lits( rule ), ONE_INTEGER, UNPROVIDED ) )
    {
      return forward_asymmetric_expand_int( asent, rule, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33562L)
  public static SubLObject forward_asymmetric_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal( asent );
    final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list66 ), UNPROVIDED, UNPROVIDED ) );
    SubLObject cdolist_list_var = forward_asymmetric_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 33984L)
  public static SubLObject forward_asymmetric_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 34838L)
  public static SubLObject forward_commutative_pos_rule_select(final SubLObject asent)
  {
    return all_antecedent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 34998L)
  public static SubLObject forward_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_commutative_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 35123L)
  public static SubLObject forward_commutative_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject more_supports = ( NIL != inference_trampolines.inference_commutative_predicate_p( pred ) ) ? ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list69 ),
        UNPROVIDED, UNPROVIDED ) ) : ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list70 ), UNPROVIDED, UNPROVIDED ) );
    if( NIL != el_utilities.el_binary_formula_p( asent ) )
    {
      final SubLObject forward_asent = removal_modules_symmetry.symmetric_asent( asent );
      SubLObject cdolist_list_var = forward_commutative_pos_expand_int( forward_asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations( asent, UNPROVIDED );
      SubLObject forward_asent2 = NIL;
      forward_asent2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( !forward_asent2.equal( asent ) )
        {
          SubLObject cdolist_list_var_$46 = forward_commutative_pos_expand_int( forward_asent2, rule, UNPROVIDED );
          SubLObject examine_lit2 = NIL;
          examine_lit2 = cdolist_list_var_$46.first();
          while ( NIL != cdolist_list_var_$46)
          {
            forward_module_callback( forward_asent2, $kw19$POS, examine_lit2, NIL, rule, more_supports );
            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
            examine_lit2 = cdolist_list_var_$46.first();
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        forward_asent2 = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 35715L)
  public static SubLObject forward_commutative_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 36574L)
  public static SubLObject forward_commutative_neg_rule_select(final SubLObject asent)
  {
    return all_consequent_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 36719L)
  public static SubLObject forward_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_commutative_neg_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 36844L)
  public static SubLObject forward_commutative_neg_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject more_supports = ( NIL != inference_trampolines.inference_commutative_predicate_p( pred ) ) ? ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list69 ),
        UNPROVIDED, UNPROVIDED ) ) : ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const26$isa, pred, $list70 ), UNPROVIDED, UNPROVIDED ) );
    if( NIL != el_utilities.el_binary_formula_p( asent ) )
    {
      final SubLObject forward_asent = removal_modules_symmetry.symmetric_asent( asent );
      SubLObject cdolist_list_var = forward_commutative_neg_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations( asent, UNPROVIDED );
      SubLObject forward_asent2 = NIL;
      forward_asent2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( !forward_asent2.equal( asent ) )
        {
          SubLObject cdolist_list_var_$47 = forward_commutative_neg_expand_int( asent, rule, UNPROVIDED );
          SubLObject examine_lit2 = NIL;
          examine_lit2 = cdolist_list_var_$47.first();
          while ( NIL != cdolist_list_var_$47)
          {
            forward_module_callback( forward_asent2, $kw17$NEG, examine_lit2, NIL, rule, more_supports );
            cdolist_list_var_$47 = cdolist_list_var_$47.rest();
            examine_lit2 = cdolist_list_var_$47.first();
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        forward_asent2 = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 37428L)
  public static SubLObject forward_commutative_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = pred;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 38278L)
  public static SubLObject forward_genlpreds_gaf_rule_select(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    final SubLObject genl_preds = Sequences.remove( pred, cached_all_genl_preds( pred ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( $const75$genlPreds, $kw17$NEG, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( $const75$genlPreds, $kw17$NEG, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$48 = NIL;
              final SubLObject token_var_$49 = NIL;
              while ( NIL == done_var_$48)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$49 );
                final SubLObject valid_$50 = makeBoolean( !token_var_$49.eql( rule ) );
                if( NIL != valid_$50 )
                {
                  SubLObject selectedP = NIL;
                  final SubLObject predicate_var = $const75$genlPreds;
                  final SubLObject assertion_var = rule;
                  final SubLObject cnf_var = assertions_high.assertion_cnf( assertion_var );
                  SubLObject rest;
                  SubLObject lit;
                  SubLObject rule_pred;
                  for( rest = NIL, rest = clauses.neg_lits( cnf_var ); NIL == selectedP && NIL != rest; rest = rest.rest() )
                  {
                    lit = rest.first();
                    if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
                    {
                      rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
                      if( NIL != list_utilities.member_kbeqP( rule_pred, genl_preds ) )
                      {
                        rules = ConsesLow.cons( rule, rules );
                        selectedP = T;
                      }
                    }
                  }
                }
                done_var_$48 = makeBoolean( NIL == valid_$50 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    final SubLObject genl_inverses = cached_all_genl_inverses( pred );
    cdolist_list_var = backward_utilities.relevant_directions();
    direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( $const76$genlInverse, $kw17$NEG, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( $const76$genlInverse, $kw17$NEG, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$49 = NIL;
              final SubLObject token_var_$50 = NIL;
              while ( NIL == done_var_$49)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$50 );
                final SubLObject valid_$51 = makeBoolean( !token_var_$50.eql( rule ) );
                if( NIL != valid_$51 )
                {
                  SubLObject selectedP = NIL;
                  final SubLObject predicate_var = $const76$genlInverse;
                  final SubLObject assertion_var = rule;
                  final SubLObject cnf_var = assertions_high.assertion_cnf( assertion_var );
                  SubLObject rest;
                  SubLObject lit;
                  SubLObject rule_pred;
                  for( rest = NIL, rest = clauses.neg_lits( cnf_var ); NIL == selectedP && NIL != rest; rest = rest.rest() )
                  {
                    lit = rest.first();
                    if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
                    {
                      rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
                      if( NIL != list_utilities.member_kbeqP( rule_pred, genl_inverses ) )
                      {
                        rules = ConsesLow.cons( rule, rules );
                        selectedP = T;
                      }
                    }
                  }
                }
                done_var_$49 = makeBoolean( NIL == valid_$51 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
  public static SubLObject clear_cached_all_genl_preds()
  {
    final SubLObject cs = $cached_all_genl_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
  public static SubLObject remove_cached_all_genl_preds(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_genl_preds_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
  public static SubLObject cached_all_genl_preds_internal(final SubLObject pred)
  {
    return genl_predicates.all_genl_preds( pred, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39332L)
  public static SubLObject cached_all_genl_preds(final SubLObject pred)
  {
    SubLObject caching_state = $cached_all_genl_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym77$CACHED_ALL_GENL_PREDS, $sym78$_CACHED_ALL_GENL_PREDS_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym79$CLEAR_CACHED_ALL_GENL_PREDS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_genl_preds_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
  public static SubLObject clear_cached_all_genl_inverses()
  {
    final SubLObject cs = $cached_all_genl_inverses_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
  public static SubLObject remove_cached_all_genl_inverses(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_genl_inverses_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
  public static SubLObject cached_all_genl_inverses_internal(final SubLObject pred)
  {
    return genl_predicates.all_genl_inverses( pred, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39491L)
  public static SubLObject cached_all_genl_inverses(final SubLObject pred)
  {
    SubLObject caching_state = $cached_all_genl_inverses_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym80$CACHED_ALL_GENL_INVERSES, $sym81$_CACHED_ALL_GENL_INVERSES_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym82$CLEAR_CACHED_ALL_GENL_INVERSES );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_genl_inverses_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39656L)
  public static SubLObject forward_genlpreds_gaf_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_genlpreds_gaf_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39777L)
  public static SubLObject forward_genlpreds_gaf_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_genlpreds_gaf_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject examine_pred = cycl_utilities.atomic_sentence_predicate( examine_lit );
      final SubLObject genl_pred_or_inverse = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
      final SubLObject forward_asent = ConsesLow.list( examine_pred, arg1, genl_pred_or_inverse );
      final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw83$GENLPREDS, ConsesLow.list( examine_pred, arg2, genl_pred_or_inverse ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 40415L)
  public static SubLObject forward_genlpreds_gaf_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_genl_preds = cached_all_genl_preds( pred );
    final SubLObject all_genl_inverses = cached_all_genl_inverses( pred );
    SubLObject examine_lits = NIL;
    SubLObject predicate_var = $const75$genlPreds;
    SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_genl_preds ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    predicate_var = $const76$genlInverse;
    cnf_var = assertions_high.assertion_cnf( rule );
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_genl_inverses ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 41656L)
  public static SubLObject forward_not_genlpreds_gaf_rule_select(final SubLObject asent)
  {
    return forward_normal_neg_rule_select( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 41778L)
  public static SubLObject forward_not_genlpreds_gaf_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_normal_neg_rule_filter( asent, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 41910L)
  public static SubLObject forward_not_genlpreds_gaf_expand(final SubLObject asent, final SubLObject rule)
  {
    return forward_normal_neg_expand( asent, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 42689L)
  public static SubLObject forward_genlpreds_pos_rule_select(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = Sequences.remove( pred, cached_all_genl_preds( pred ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject genl_pred = NIL;
    genl_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == hl_supports.hl_predicate_p( genl_pred ) )
      {
        SubLObject cdolist_list_var_$54 = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var_$54.first();
        while ( NIL != cdolist_list_var_$54)
        {
          if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( genl_pred, $kw17$NEG, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( genl_pred, $kw17$NEG, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                  SubLObject done_var_$55 = NIL;
                  final SubLObject token_var_$56 = NIL;
                  while ( NIL == done_var_$55)
                  {
                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$56 );
                    final SubLObject valid_$57 = makeBoolean( !token_var_$56.eql( rule ) );
                    if( NIL != valid_$57 )
                    {
                      rules = ConsesLow.cons( rule, rules );
                    }
                    done_var_$55 = makeBoolean( NIL == valid_$57 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                  try
                  {
                    Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var_$54 = cdolist_list_var_$54.rest();
          direction = cdolist_list_var_$54.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl_pred = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 43091L)
  public static SubLObject forward_genlpreds_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_genlpreds_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 43212L)
  public static SubLObject forward_genlpreds_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject args = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_genlpreds_pos_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate( examine_lit );
      final SubLObject forward_asent = reader.bq_cons( genl_pred, ConsesLow.append( args, NIL ) );
      final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw83$GENLPREDS, ConsesLow.list( $const75$genlPreds, pred, genl_pred ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 43733L)
  public static SubLObject forward_genlpreds_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject all_genl_preds = cached_all_genl_preds( pred );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      rule_pred = cycl_utilities.atomic_sentence_predicate( lit );
      if( NIL != variables.fully_bound_p( rule_pred ) && !pred.eql( rule_pred ) && NIL == hl_supports.hl_predicate_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_genl_preds ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 47146L)
  public static SubLObject forward_genlinverse_gaf_rule_select(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject rules = NIL;
    final SubLObject genl_preds = Sequences.remove( pred, cached_all_genl_preds( pred ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( $const76$genlInverse, $kw17$NEG, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( $const76$genlInverse, $kw17$NEG, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$58 = NIL;
              final SubLObject token_var_$59 = NIL;
              while ( NIL == done_var_$58)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$59 );
                final SubLObject valid_$60 = makeBoolean( !token_var_$59.eql( rule ) );
                if( NIL != valid_$60 )
                {
                  SubLObject selectedP = NIL;
                  final SubLObject predicate_var = $const75$genlPreds;
                  final SubLObject assertion_var = rule;
                  final SubLObject cnf_var = assertions_high.assertion_cnf( assertion_var );
                  SubLObject rest;
                  SubLObject lit;
                  SubLObject rule_pred;
                  for( rest = NIL, rest = clauses.neg_lits( cnf_var ); NIL == selectedP && NIL != rest; rest = rest.rest() )
                  {
                    lit = rest.first();
                    if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
                    {
                      rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
                      if( NIL != list_utilities.member_kbeqP( rule_pred, genl_preds ) )
                      {
                        rules = ConsesLow.cons( rule, rules );
                        selectedP = T;
                      }
                    }
                  }
                }
                done_var_$58 = makeBoolean( NIL == valid_$60 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    final SubLObject genl_inverses = cached_all_genl_inverses( pred );
    cdolist_list_var = backward_utilities.relevant_directions();
    direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( $const75$genlPreds, $kw17$NEG, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( $const75$genlPreds, $kw17$NEG, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$59 = NIL;
              final SubLObject token_var_$60 = NIL;
              while ( NIL == done_var_$59)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$60 );
                final SubLObject valid_$61 = makeBoolean( !token_var_$60.eql( rule ) );
                if( NIL != valid_$61 )
                {
                  SubLObject selectedP = NIL;
                  final SubLObject predicate_var = $const76$genlInverse;
                  final SubLObject assertion_var = rule;
                  final SubLObject cnf_var = assertions_high.assertion_cnf( assertion_var );
                  SubLObject rest;
                  SubLObject lit;
                  SubLObject rule_pred;
                  for( rest = NIL, rest = clauses.neg_lits( cnf_var ); NIL == selectedP && NIL != rest; rest = rest.rest() )
                  {
                    lit = rest.first();
                    if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
                    {
                      rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
                      if( NIL != list_utilities.member_kbeqP( rule_pred, genl_inverses ) )
                      {
                        rules = ConsesLow.cons( rule, rules );
                        selectedP = T;
                      }
                    }
                  }
                }
                done_var_$59 = makeBoolean( NIL == valid_$61 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 48202L)
  public static SubLObject forward_genlinverse_gaf_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_genlinverse_gaf_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 48327L)
  public static SubLObject forward_genlinverse_gaf_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_genlinverse_gaf_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject examine_pred = cycl_utilities.atomic_sentence_predicate( examine_lit );
      final SubLObject genl_pred_or_inverse = cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED );
      final SubLObject forward_asent = ConsesLow.list( examine_pred, arg1, genl_pred_or_inverse );
      final SubLObject more_supports = examine_pred.eql( $const76$genlInverse ) ? ConsesLow.list( arguments.make_hl_support( $kw83$GENLPREDS, ConsesLow.list( $const75$genlPreds, arg2, genl_pred_or_inverse ), UNPROVIDED,
          UNPROVIDED ) ) : ConsesLow.list( arguments.make_hl_support( $kw83$GENLPREDS, ConsesLow.list( $const76$genlInverse, arg2, genl_pred_or_inverse ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 49097L)
  public static SubLObject forward_genlinverse_gaf_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject all_genl_preds = cached_all_genl_preds( pred );
    final SubLObject all_genl_inverses = cached_all_genl_inverses( pred );
    SubLObject examine_lits = NIL;
    SubLObject predicate_var = $const76$genlInverse;
    SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_genl_preds ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    predicate_var = $const75$genlPreds;
    cnf_var = assertions_high.assertion_cnf( rule );
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_pred = cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED );
        if( NIL != variables.fully_bound_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_genl_inverses ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50351L)
  public static SubLObject forward_not_genlinverse_gaf_rule_select(final SubLObject asent)
  {
    return forward_normal_neg_rule_select( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50475L)
  public static SubLObject forward_not_genlinverse_gaf_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_normal_neg_rule_filter( asent, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50609L)
  public static SubLObject forward_not_genlinverse_gaf_expand(final SubLObject asent, final SubLObject rule)
  {
    return forward_normal_neg_expand( asent, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 51176L)
  public static SubLObject forward_genlinverse_pos_rule_select(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_genl_inverses( pred );
    SubLObject genl_inverse = NIL;
    genl_inverse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == hl_supports.hl_predicate_p( genl_inverse ) )
      {
        SubLObject cdolist_list_var_$64 = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var_$64.first();
        while ( NIL != cdolist_list_var_$64)
        {
          if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( genl_inverse, $kw17$NEG, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( genl_inverse, $kw17$NEG, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                  SubLObject done_var_$65 = NIL;
                  final SubLObject token_var_$66 = NIL;
                  while ( NIL == done_var_$65)
                  {
                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                    final SubLObject valid_$67 = makeBoolean( !token_var_$66.eql( rule ) );
                    if( NIL != valid_$67 )
                    {
                      rules = ConsesLow.cons( rule, rules );
                    }
                    done_var_$65 = makeBoolean( NIL == valid_$67 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                  try
                  {
                    Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var_$64 = cdolist_list_var_$64.rest();
          direction = cdolist_list_var_$64.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl_inverse = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 51572L)
  public static SubLObject forward_genlinverse_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_genlinverse_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 51697L)
  public static SubLObject forward_genlinverse_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_genlinverse_pos_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject genl_inverse = cycl_utilities.atomic_sentence_predicate( examine_lit );
      final SubLObject forward_asent = ConsesLow.list( genl_inverse, arg2, arg1 );
      final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw83$GENLPREDS, ConsesLow.list( $const76$genlInverse, pred, genl_inverse ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 52273L)
  public static SubLObject forward_genlinverse_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject all_genl_inverses = cached_all_genl_inverses( pred );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      rule_pred = cycl_utilities.atomic_sentence_predicate( lit );
      if( NIL != variables.fully_bound_p( rule_pred ) && NIL == hl_supports.hl_predicate_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_genl_inverses ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
  public static SubLObject clear_cached_all_negation_preds()
  {
    final SubLObject cs = $cached_all_negation_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
  public static SubLObject remove_cached_all_negation_preds(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_negation_preds_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
  public static SubLObject cached_all_negation_preds_internal(final SubLObject pred)
  {
    return negation_predicate.all_negation_preds( pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55612L)
  public static SubLObject cached_all_negation_preds(final SubLObject pred)
  {
    SubLObject caching_state = $cached_all_negation_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym96$CACHED_ALL_NEGATION_PREDS, $sym97$_CACHED_ALL_NEGATION_PREDS_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym98$CLEAR_CACHED_ALL_NEGATION_PREDS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_negation_preds_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 55779L)
  public static SubLObject forward_negationpreds_required(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue( thread ) )
    {
      final SubLObject pattern = $list99;
      return formula_pattern_match.formula_matches_pattern( asent, pattern );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 56072L)
  public static SubLObject forward_negationpreds_rule_select(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_negation_preds( pred );
    SubLObject negation_pred = NIL;
    negation_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == hl_supports.hl_predicate_p( negation_pred ) )
      {
        SubLObject cdolist_list_var_$68 = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var_$68.first();
        while ( NIL != cdolist_list_var_$68)
        {
          if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( negation_pred, $kw19$POS, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( negation_pred, $kw19$POS, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                  SubLObject done_var_$69 = NIL;
                  final SubLObject token_var_$70 = NIL;
                  while ( NIL == done_var_$69)
                  {
                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$70 );
                    final SubLObject valid_$71 = makeBoolean( !token_var_$70.eql( rule ) );
                    if( NIL != valid_$71 && ( NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue( thread ) || NIL != list_utilities.lengthG( pragma_induction.rule_pos_lits( rule ), ONE_INTEGER,
                        UNPROVIDED ) ) )
                    {
                      rules = ConsesLow.cons( rule, rules );
                    }
                    done_var_$69 = makeBoolean( NIL == valid_$71 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var_$68 = cdolist_list_var_$68.rest();
          direction = cdolist_list_var_$68.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      negation_pred = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 56560L)
  public static SubLObject forward_negationpreds_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_negationpreds_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 56681L)
  public static SubLObject forward_negationpreds_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject args = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_negationpreds_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject negation_pred = cycl_utilities.atomic_sentence_predicate( examine_lit );
      final SubLObject forward_asent = reader.bq_cons( negation_pred, ConsesLow.append( args, NIL ) );
      final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw100$NEGATIONPREDS, ConsesLow.list( $const101$negationPreds, pred, negation_pred ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 57218L)
  public static SubLObject forward_negationpreds_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject negation_preds = cached_all_negation_preds( pred );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      rule_pred = cycl_utilities.atomic_sentence_predicate( lit );
      if( NIL != variables.fully_bound_p( rule_pred ) && NIL == hl_supports.hl_predicate_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, negation_preds ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
  public static SubLObject clear_cached_all_negation_inverses()
  {
    final SubLObject cs = $cached_all_negation_inverses_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
  public static SubLObject remove_cached_all_negation_inverses(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_negation_inverses_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
  public static SubLObject cached_all_negation_inverses_internal(final SubLObject pred)
  {
    return negation_predicate.all_negation_inverses( pred, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58221L)
  public static SubLObject cached_all_negation_inverses(final SubLObject pred)
  {
    SubLObject caching_state = $cached_all_negation_inverses_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym104$CACHED_ALL_NEGATION_INVERSES, $sym105$_CACHED_ALL_NEGATION_INVERSES_CACHING_STATE_, $int34$64, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym106$CLEAR_CACHED_ALL_NEGATION_INVERSES );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_negation_inverses_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58394L)
  public static SubLObject forward_negationinverse_required(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue( thread ) )
    {
      final SubLObject pattern = $list107;
      return formula_pattern_match.formula_matches_pattern( asent, pattern );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 58697L)
  public static SubLObject forward_negationinverse_rule_select(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = cached_all_negation_inverses( pred );
    SubLObject negation_inverse = NIL;
    negation_inverse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == hl_supports.hl_predicate_p( negation_inverse ) )
      {
        SubLObject cdolist_list_var_$72 = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var_$72.first();
        while ( NIL != cdolist_list_var_$72)
        {
          if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( negation_inverse, $kw19$POS, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( negation_inverse, $kw19$POS, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
                  SubLObject done_var_$73 = NIL;
                  final SubLObject token_var_$74 = NIL;
                  while ( NIL == done_var_$73)
                  {
                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$74 );
                    final SubLObject valid_$75 = makeBoolean( !token_var_$74.eql( rule ) );
                    if( NIL != valid_$75 && ( NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue( thread ) || NIL != list_utilities.lengthG( pragma_induction.rule_pos_lits( rule ), ONE_INTEGER,
                        UNPROVIDED ) ) )
                    {
                      rules = ConsesLow.cons( rule, rules );
                    }
                    done_var_$73 = makeBoolean( NIL == valid_$75 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var_$72 = cdolist_list_var_$72.rest();
          direction = cdolist_list_var_$72.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      negation_inverse = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59199L)
  public static SubLObject forward_negationinverse_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_negationinverse_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59324L)
  public static SubLObject forward_negationinverse_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var = forward_negationinverse_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject negation_inverse = cycl_utilities.atomic_sentence_predicate( examine_lit );
      final SubLObject forward_asent = ConsesLow.list( negation_inverse, arg2, arg1 );
      final SubLObject more_supports = ConsesLow.list( arguments.make_hl_support( $kw100$NEGATIONPREDS, ConsesLow.list( $const108$negationInverse, pred, negation_inverse ), UNPROVIDED, UNPROVIDED ) );
      forward_module_callback( forward_asent, $kw17$NEG, examine_lit, NIL, rule, more_supports );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59925L)
  public static SubLObject forward_negationinverse_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject all_negation_inverses = cached_all_negation_inverses( pred );
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      rule_pred = cycl_utilities.atomic_sentence_predicate( lit );
      if( NIL != variables.fully_bound_p( rule_pred ) && NIL == hl_supports.hl_predicate_p( rule_pred ) && NIL != list_utilities.member_kbeqP( rule_pred, all_negation_inverses ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 60766L)
  public static SubLObject forward_eval_exclusive_pos(final SubLObject asent)
  {
    final SubLObject pattern = $list111;
    return formula_pattern_match.formula_matches_pattern( asent, pattern );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 60994L)
  public static SubLObject forward_eval_expand_pos(final SubLObject asent, final SubLObject rule)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61336L)
  public static SubLObject forward_eval_exclusive_neg(final SubLObject asent)
  {
    final SubLObject pattern = $list111;
    return formula_pattern_match.formula_matches_pattern( asent, pattern );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61564L)
  public static SubLObject forward_eval_expand_neg(final SubLObject asent, final SubLObject rule)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61983L)
  public static SubLObject forward_term_of_unit_rule_select(final SubLObject asent)
  {
    final SubLObject function = cycl_utilities.nat_function( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( function, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator( function, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$76 = NIL;
              final SubLObject token_var_$77 = NIL;
              while ( NIL == done_var_$76)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$77 );
                final SubLObject valid_$78 = makeBoolean( !token_var_$77.eql( rule ) );
                if( NIL != valid_$78 )
                {
                  rules = ConsesLow.cons( rule, rules );
                }
                done_var_$76 = makeBoolean( NIL == valid_$78 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62268L)
  public static SubLObject forward_term_of_unit_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_term_of_unit_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62387L)
  public static SubLObject forward_term_of_unit_expand(final SubLObject asent, final SubLObject rule)
  {
    SubLObject cdolist_list_var = forward_term_of_unit_expand_int( asent, rule, UNPROVIDED );
    SubLObject examine_lit = NIL;
    examine_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      forward_module_callback( asent, $kw19$POS, examine_lit, NIL, rule, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      examine_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62591L)
  public static SubLObject forward_term_of_unit_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject function = cycl_utilities.nat_function( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = $const116$termOfUnit;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject rule_function;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        rule_function = cycl_utilities.nat_function( cycl_utilities.atomic_sentence_arg2( lit, UNPROVIDED ) );
        if( function.eql( rule_function ) )
        {
          examine_lits = ConsesLow.cons( lit, examine_lits );
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 63397L)
  public static SubLObject forward_nat_function_rule_select(final SubLObject asent)
  {
    return all_antecedent_predicate_forward_rules( $const119$natFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 63536L)
  public static SubLObject forward_nat_function_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_nat_function_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 63655L)
  public static SubLObject forward_nat_function_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject nart = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject formula = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject function = cycl_utilities.nat_function( formula );
    if( NIL != function )
    {
      final SubLObject more_supports = removal_modules_natfunction.additional_nat_function_supports();
      final SubLObject forward_asent = ConsesLow.list( $const119$natFunction, nart, function );
      SubLObject cdolist_list_var = forward_nat_function_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        forward_module_callback( forward_asent, $kw19$POS, examine_lit, NIL, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 64150L)
  public static SubLObject forward_nat_function_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = $const119$natFunction;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 64991L)
  public static SubLObject forward_gaf_predicate_required(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $gaf_predicate_forward_inference_enabledP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 65116L)
  public static SubLObject forward_gaf_predicate_rule_select(final SubLObject asent)
  {
    return all_antecedent_predicate_forward_rules( $const122$gafPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 65257L)
  public static SubLObject forward_gaf_predicate_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_gaf_predicate_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 65378L)
  public static SubLObject forward_gaf_predicate_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.formula_operator( asent );
    if( NIL != pred )
    {
      final SubLObject source_gaf = forward.current_forward_inference_gaf();
      final SubLObject source_gaf_mt = ( NIL != source_gaf ) ? arguments.support_mt( source_gaf ) : NIL;
      final SubLObject trigger_mt = ( NIL != source_gaf_mt ) ? source_gaf_mt : mt_relevance_macros.$mt$.getDynamicValue( thread );
      final SubLObject forward_asent = el_utilities.make_binary_formula( $const122$gafPredicate, asent, pred );
      final SubLObject trigger_support = arguments.make_hl_support( $kw123$GAF, forward_asent, trigger_mt, $kw124$TRUE_MON );
      SubLObject cdolist_list_var = forward_gaf_predicate_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        forward_module_callback( forward_asent, $kw19$POS, examine_lit, trigger_support, rule, NIL );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 66131L)
  public static SubLObject forward_gaf_predicate_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    SubLObject examine_lits = NIL;
    final SubLObject predicate_var = $const122$gafPredicate;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 66846L)
  public static SubLObject forward_unbound_pred_pos_required(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return control_vars.$unbound_rule_backchain_enabled$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 66964L)
  public static SubLObject forward_unbound_pred_pos_rule_select(final SubLObject asent)
  {
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator( $kw17$NEG, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator( $kw17$NEG, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$79 = NIL;
              final SubLObject token_var_$80 = NIL;
              while ( NIL == done_var_$79)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$80 );
                final SubLObject valid_$81 = makeBoolean( !token_var_$80.eql( rule ) );
                if( NIL != valid_$81 )
                {
                  rules = ConsesLow.cons( rule, rules );
                }
                done_var_$79 = makeBoolean( NIL == valid_$81 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 67225L)
  public static SubLObject forward_unbound_pred_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_unbound_pred_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 67352L)
  public static SubLObject forward_unbound_pred_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_unbound_pred_pos_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        forward_module_callback( asent, $kw19$POS, examine_lit, NIL, rule, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 67604L)
  public static SubLObject forward_unbound_pred_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( NIL != variables.not_fully_bound_p( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68355L)
  public static SubLObject forward_unbound_pred_neg_required(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return control_vars.$unbound_rule_backchain_enabled$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68473L)
  public static SubLObject forward_unbound_pred_neg_rule_select(final SubLObject asent)
  {
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator( $kw19$POS, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator( $kw19$POS, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, NIL, direction );
              SubLObject done_var_$82 = NIL;
              final SubLObject token_var_$83 = NIL;
              while ( NIL == done_var_$82)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$83 );
                final SubLObject valid_$84 = makeBoolean( !token_var_$83.eql( rule ) );
                if( NIL != valid_$84 )
                {
                  rules = ConsesLow.cons( rule, rules );
                }
                done_var_$82 = makeBoolean( NIL == valid_$84 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68734L)
  public static SubLObject forward_unbound_pred_neg_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_unbound_pred_neg_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 68861L)
  public static SubLObject forward_unbound_pred_neg_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding( thread );
    try
    {
      forward.$type_filter_forward_dnf$.bind( T, thread );
      SubLObject cdolist_list_var = forward_unbound_pred_neg_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        forward_module_callback( asent, $kw17$NEG, examine_lit, NIL, rule, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      forward.$type_filter_forward_dnf$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 69113L)
  public static SubLObject forward_unbound_pred_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    SubLObject examine_lits = NIL;
    final SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( NIL != variables.not_fully_bound_p( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        examine_lits = ConsesLow.cons( lit, examine_lits );
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70027L)
  public static SubLObject forward_assertive_wff_unbound_pred_pos_required(final SubLObject asent)
  {
    return wff_vars.wff_assertiveP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70143L)
  public static SubLObject forward_assertive_wff_unbound_pred_pos_rule_select(final SubLObject asent)
  {
    SubLObject rules = NIL;
    SubLObject cdolist_list_var = backward_utilities.relevant_directions();
    SubLObject direction = NIL;
    direction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$85 = wff.assertive_wff_rules();
      SubLObject rule = NIL;
      rule = cdolist_list_var_$85.first();
      while ( NIL != cdolist_list_var_$85)
      {
        if( direction.eql( assertions_high.assertion_direction( rule ) ) )
        {
          rules = ConsesLow.cons( rule, rules );
        }
        cdolist_list_var_$85 = cdolist_list_var_$85.rest();
        rule = cdolist_list_var_$85.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      direction = cdolist_list_var.first();
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70450L)
  public static SubLObject forward_assertive_wff_unbound_pred_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_unbound_pred_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 70591L)
  public static SubLObject forward_assertive_wff_unbound_pred_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject trigger_gaf = forward.current_forward_inference_gaf();
    if( NIL != trigger_gaf && NIL != wff.strictly_wff_in_all_spec_mtsP( asent, arguments.support_mt( trigger_gaf ), UNPROVIDED ) )
    {
      return NIL;
    }
    return forward_unbound_pred_pos_expand( asent, rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 71202L)
  public static SubLObject forward_ist_pos_rule_select(final SubLObject asent)
  {
    return all_ist_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 71332L)
  public static SubLObject forward_ist_pos_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_ist_pos_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 71441L)
  public static SubLObject forward_ist_pos_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject trigger_assertion = forward.current_forward_inference_assertion();
    if( NIL != trigger_assertion )
    {
      final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
      final SubLObject mt = arguments.support_mt( trigger_assertion );
      final SubLObject args = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
      SubLObject cdolist_list_var = forward_ist_pos_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate( cycl_utilities.atomic_sentence_arg2( examine_lit, UNPROVIDED ) );
        final SubLObject forward_asent = reader.bq_cons( genl_pred, ConsesLow.append( args, NIL ) );
        final SubLObject more_supports = ( NIL != kb_utilities.kbeq( pred, genl_pred ) ) ? NIL
            : ConsesLow.list( arguments.make_hl_support( $kw83$GENLPREDS, ConsesLow.list( $const75$genlPreds, pred, genl_pred ), UNPROVIDED, UNPROVIDED ) );
        final SubLObject trigger_support = arguments.make_hl_support( $kw9$QUERY, arguments.support_el_ist_sentence( trigger_assertion ), $const133$BaseKB, UNPROVIDED );
        forward_module_callback( el_utilities.make_ist_sentence( mt, forward_asent ), $kw19$POS, examine_lit, trigger_support, rule, more_supports );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 72303L)
  public static SubLObject forward_ist_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject sub_sentence;
    SubLObject sub_pred;
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( NIL != el_utilities.ist_sentence_p( lit, kb_indexing.spec_preds_of_ist_indexing_enabledP() ) )
      {
        sub_sentence = el_utilities.literal_arg2( lit, UNPROVIDED );
        if( NIL == el_utilities.el_negation_p( sub_sentence ) )
        {
          sub_pred = el_utilities.literal_predicate( sub_sentence, UNPROVIDED );
          if( NIL != forts.fort_p( sub_pred ) && NIL != genl_predicates.genl_predP( pred, sub_pred, UNPROVIDED, UNPROVIDED ) )
          {
            examine_lits = ConsesLow.cons( lit, examine_lits );
          }
        }
      }
    }
    cnf_var = assertions_high.assertion_cnf( rule );
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( NIL != el_utilities.ist_sentence_p( lit, kb_indexing.spec_preds_of_ist_indexing_enabledP() ) )
      {
        sub_sentence = el_utilities.literal_arg2( lit, UNPROVIDED );
        if( NIL != el_utilities.el_negation_p( sub_sentence ) )
        {
          sub_pred = el_utilities.literal_predicate( sub_sentence, UNPROVIDED );
          if( NIL != forts.fort_p( sub_pred ) && NIL != genl_predicates.genl_predP( pred, sub_pred, UNPROVIDED, UNPROVIDED ) )
          {
            examine_lits = ConsesLow.cons( lit, examine_lits );
          }
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 73628L)
  public static SubLObject forward_ist_neg_rule_select(final SubLObject asent)
  {
    return all_ist_predicate_forward_rules( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 73758L)
  public static SubLObject forward_ist_neg_rule_filter(final SubLObject asent, final SubLObject rule)
  {
    return forward_ist_neg_expand_int( asent, rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 73867L)
  public static SubLObject forward_ist_neg_expand(final SubLObject asent, final SubLObject rule)
  {
    final SubLObject trigger_assertion = forward.current_forward_inference_assertion();
    if( NIL != trigger_assertion )
    {
      final SubLObject mt = arguments.support_mt( trigger_assertion );
      SubLObject cdolist_list_var = forward_ist_neg_expand_int( asent, rule, UNPROVIDED );
      SubLObject examine_lit = NIL;
      examine_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject trigger_support = arguments.make_hl_support( $kw9$QUERY, arguments.support_el_ist_sentence( trigger_assertion ), $const133$BaseKB, UNPROVIDED );
        forward_module_callback( el_utilities.make_ist_sentence( mt, el_utilities.make_negation( asent ) ), $kw19$POS, examine_lit, trigger_support, rule, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        examine_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 74385L)
  public static SubLObject forward_ist_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP)
  {
    if( booleanP == UNPROVIDED )
    {
      booleanP = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject examine_lits = NIL;
    SubLObject predicate_var = $const136$ist;
    SubLObject cnf_var = assertions_high.assertion_cnf( rule );
    SubLObject rest;
    SubLObject lit;
    SubLObject sub_sentence;
    SubLObject sub_pred;
    for( rest = NIL, rest = clauses.pos_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        sub_sentence = el_utilities.literal_arg2( lit, UNPROVIDED );
        if( NIL == el_utilities.el_negation_p( sub_sentence ) )
        {
          sub_pred = el_utilities.literal_predicate( sub_sentence, UNPROVIDED );
          if( pred.eql( sub_pred ) )
          {
            examine_lits = ConsesLow.cons( lit, examine_lits );
          }
        }
      }
    }
    predicate_var = $const136$ist;
    cnf_var = assertions_high.assertion_cnf( rule );
    for( rest = NIL, rest = clauses.neg_lits( cnf_var ); ( NIL == booleanP || NIL == examine_lits ) && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      if( predicate_var.eql( cycl_utilities.atomic_sentence_predicate( lit ) ) )
      {
        sub_sentence = el_utilities.literal_arg2( lit, UNPROVIDED );
        if( NIL != el_utilities.el_negation_p( sub_sentence ) )
        {
          sub_pred = el_utilities.literal_predicate( sub_sentence, UNPROVIDED );
          if( pred.eql( sub_pred ) )
          {
            examine_lits = ConsesLow.cons( lit, examine_lits );
          }
        }
      }
    }
    return ( NIL != booleanP ) ? list_utilities.sublisp_boolean( examine_lits ) : examine_lits;
  }

  public static SubLObject declare_forward_modules_file()
  {
    SubLFiles.declareFunction( me, "forward_modules", "FORWARD-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_module_count", "FORWARD-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_module_p", "FORWARD-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_module", "FORWARD-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_forward_module", "UNDECLARE-FORWARD-MODULE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_forward_modules", "DO-FORWARD-MODULES" );
    SubLFiles.declareFunction( me, "do_forward_modules_list", "DO-FORWARD-MODULES-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_examine_asent_triggering_allowedP", "FORWARD-EXAMINE-ASENT-TRIGGERING-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_module_callback", "FORWARD-MODULE-CALLBACK", 5, 1, false );
    SubLFiles.declareFunction( me, "forward_tactic_specs", "FORWARD-TACTIC-SPECS", 3, 0, false );
    SubLFiles.declareFunction( me, "forward_tactic_spec_rule", "FORWARD-TACTIC-SPEC-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_tactic_specL", "FORWARD-TACTIC-SPEC<", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_hl_modules", "FORWARD-HL-MODULES", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_hl_module_apply", "FORWARD-HL-MODULE-APPLY", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_rule_select_via_allowed_rulesP", "FORWARD-INFERENCE-RULE-SELECT-VIA-ALLOWED-RULES?", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_hl_module_rule_select", "FORWARD-HL-MODULE-RULE-SELECT", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_hl_module_rule_filter", "FORWARD-HL-MODULE-RULE-FILTER", 3, 0, false );
    SubLFiles.declareFunction( me, "forward_hl_module_expand", "FORWARD-HL-MODULE-EXPAND", 3, 0, false );
    SubLFiles.declareFunction( me, "all_antecedent_predicate_forward_rules", "ALL-ANTECEDENT-PREDICATE-FORWARD-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_consequent_predicate_forward_rules", "ALL-CONSEQUENT-PREDICATE-FORWARD-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_ist_predicate_forward_rules", "ALL-IST-PREDICATE-FORWARD-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_normal_pos_rule_select", "FORWARD-NORMAL-POS-RULE-SELECT", 1, 0, false );
    new $forward_normal_pos_rule_select$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_normal_pos_rule_filter", "FORWARD-NORMAL-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_normal_pos_expand", "FORWARD-NORMAL-POS-EXPAND", 2, 0, false );
    new $forward_normal_pos_expand$BinaryFunction();
    SubLFiles.declareFunction( me, "forward_normal_pos_expand_int", "FORWARD-NORMAL-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_normal_neg_rule_select", "FORWARD-NORMAL-NEG-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_normal_neg_rule_filter", "FORWARD-NORMAL-NEG-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_normal_neg_expand", "FORWARD-NORMAL-NEG-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_normal_neg_expand_int", "FORWARD-NORMAL-NEG-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_isa_rule_select", "FORWARD-ISA-RULE-SELECT", 1, 0, false );
    new $forward_isa_rule_select$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_isa_rule_filter", "FORWARD-ISA-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_isa_expand", "FORWARD-ISA-EXPAND", 2, 0, false );
    new $forward_isa_expand$BinaryFunction();
    SubLFiles.declareFunction( me, "forward_isa_expand_int", "FORWARD-ISA-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_inference_genlP", "FORWARD-INFERENCE-GENL?", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_all_genls_internal", "FORWARD-INFERENCE-ALL-GENLS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_all_genls", "FORWARD-INFERENCE-ALL-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_all_specs", "CLEAR-CACHED-ALL-SPECS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_specs", "REMOVE-CACHED-ALL-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_specs_internal", "CACHED-ALL-SPECS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_specs", "CACHED-ALL-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_isa_rule_select", "FORWARD-NOT-ISA-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_isa_rule_filter", "FORWARD-NOT-ISA-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_isa_expand", "FORWARD-NOT-ISA-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_isa_expand_int", "FORWARD-NOT-ISA-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_quoted_isa_rule_select", "FORWARD-QUOTED-ISA-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_quoted_isa_rule_filter", "FORWARD-QUOTED-ISA-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_quoted_isa_expand", "FORWARD-QUOTED-ISA-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_quoted_isa_expand_int", "FORWARD-QUOTED-ISA-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_not_quoted_isa_rule_select", "FORWARD-NOT-QUOTED-ISA-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_quoted_isa_rule_filter", "FORWARD-NOT-QUOTED-ISA-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_quoted_isa_expand", "FORWARD-NOT-QUOTED-ISA-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_quoted_isa_expand_int", "FORWARD-NOT-QUOTED-ISA-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_genls_rule_select", "FORWARD-GENLS-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_genls_rule_filter", "FORWARD-GENLS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genls_expand", "FORWARD-GENLS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genls_expand_int", "FORWARD-GENLS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_not_genls_rule_select", "FORWARD-NOT-GENLS-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genls_rule_filter", "FORWARD-NOT-GENLS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genls_expand", "FORWARD-NOT-GENLS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genls_expand_int", "FORWARD-NOT-GENLS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_all_genl_mts", "CLEAR-CACHED-ALL-GENL-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_genl_mts", "REMOVE-CACHED-ALL-GENL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_genl_mts_internal", "CACHED-ALL-GENL-MTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_genl_mts", "CACHED-ALL-GENL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_genlmt_rule_select", "FORWARD-GENLMT-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_genlmt_rule_filter", "FORWARD-GENLMT-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlmt_expand", "FORWARD-GENLMT-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlmt_expand_int", "FORWARD-GENLMT-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_all_spec_mts", "CLEAR-CACHED-ALL-SPEC-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_spec_mts", "REMOVE-CACHED-ALL-SPEC-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_spec_mts_internal", "CACHED-ALL-SPEC-MTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_spec_mts", "CACHED-ALL-SPEC-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlmt_rule_select", "FORWARD-NOT-GENLMT-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlmt_rule_filter", "FORWARD-NOT-GENLMT-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlmt_expand", "FORWARD-NOT-GENLMT-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlmt_expand_int", "FORWARD-NOT-GENLMT-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_symmetric_pos_rule_select", "FORWARD-SYMMETRIC-POS-RULE-SELECT", 1, 0, false );
    new $forward_symmetric_pos_rule_select$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_symmetric_pos_rule_filter", "FORWARD-SYMMETRIC-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_symmetric_pos_expand", "FORWARD-SYMMETRIC-POS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_symmetric_pos_expand_int", "FORWARD-SYMMETRIC-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_symmetric_neg_rule_select", "FORWARD-SYMMETRIC-NEG-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_symmetric_neg_rule_filter", "FORWARD-SYMMETRIC-NEG-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_symmetric_neg_expand", "FORWARD-SYMMETRIC-NEG-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_symmetric_neg_expand_int", "FORWARD-SYMMETRIC-NEG-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_asymmetric_required", "FORWARD-ASYMMETRIC-REQUIRED", 1, 0, false );
    new $forward_asymmetric_required$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_asymmetric_rule_select", "FORWARD-ASYMMETRIC-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_asymmetric_rule_filter", "FORWARD-ASYMMETRIC-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_asymmetric_expand", "FORWARD-ASYMMETRIC-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_asymmetric_expand_int", "FORWARD-ASYMMETRIC-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_commutative_pos_rule_select", "FORWARD-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_commutative_pos_rule_filter", "FORWARD-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_commutative_pos_expand", "FORWARD-COMMUTATIVE-POS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_commutative_pos_expand_int", "FORWARD-COMMUTATIVE-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_commutative_neg_rule_select", "FORWARD-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_commutative_neg_rule_filter", "FORWARD-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_commutative_neg_expand", "FORWARD-COMMUTATIVE-NEG-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_commutative_neg_expand_int", "FORWARD-COMMUTATIVE-NEG-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_gaf_rule_select", "FORWARD-GENLPREDS-GAF-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_all_genl_preds", "CLEAR-CACHED-ALL-GENL-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_genl_preds", "REMOVE-CACHED-ALL-GENL-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_genl_preds_internal", "CACHED-ALL-GENL-PREDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_genl_preds", "CACHED-ALL-GENL-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_all_genl_inverses", "CLEAR-CACHED-ALL-GENL-INVERSES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_genl_inverses", "REMOVE-CACHED-ALL-GENL-INVERSES", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_genl_inverses_internal", "CACHED-ALL-GENL-INVERSES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_genl_inverses", "CACHED-ALL-GENL-INVERSES", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_gaf_rule_filter", "FORWARD-GENLPREDS-GAF-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_gaf_expand", "FORWARD-GENLPREDS-GAF-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_gaf_expand_int", "FORWARD-GENLPREDS-GAF-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_not_genlpreds_gaf_rule_select", "FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlpreds_gaf_rule_filter", "FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlpreds_gaf_expand", "FORWARD-NOT-GENLPREDS-GAF-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_pos_rule_select", "FORWARD-GENLPREDS-POS-RULE-SELECT", 1, 0, false );
    new $forward_genlpreds_pos_rule_select$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_genlpreds_pos_rule_filter", "FORWARD-GENLPREDS-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_pos_expand", "FORWARD-GENLPREDS-POS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlpreds_pos_expand_int", "FORWARD-GENLPREDS-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_gaf_rule_select", "FORWARD-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_gaf_rule_filter", "FORWARD-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_gaf_expand", "FORWARD-GENLINVERSE-GAF-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_gaf_expand_int", "FORWARD-GENLINVERSE-GAF-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_not_genlinverse_gaf_rule_select", "FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlinverse_gaf_rule_filter", "FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_not_genlinverse_gaf_expand", "FORWARD-NOT-GENLINVERSE-GAF-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_pos_rule_select", "FORWARD-GENLINVERSE-POS-RULE-SELECT", 1, 0, false );
    new $forward_genlinverse_pos_rule_select$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_genlinverse_pos_rule_filter", "FORWARD-GENLINVERSE-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_pos_expand", "FORWARD-GENLINVERSE-POS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_genlinverse_pos_expand_int", "FORWARD-GENLINVERSE-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_all_negation_preds", "CLEAR-CACHED-ALL-NEGATION-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_negation_preds", "REMOVE-CACHED-ALL-NEGATION-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_negation_preds_internal", "CACHED-ALL-NEGATION-PREDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_negation_preds", "CACHED-ALL-NEGATION-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_negationpreds_required", "FORWARD-NEGATIONPREDS-REQUIRED", 1, 0, false );
    new $forward_negationpreds_required$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_negationpreds_rule_select", "FORWARD-NEGATIONPREDS-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_negationpreds_rule_filter", "FORWARD-NEGATIONPREDS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_negationpreds_expand", "FORWARD-NEGATIONPREDS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_negationpreds_expand_int", "FORWARD-NEGATIONPREDS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_all_negation_inverses", "CLEAR-CACHED-ALL-NEGATION-INVERSES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_negation_inverses", "REMOVE-CACHED-ALL-NEGATION-INVERSES", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_negation_inverses_internal", "CACHED-ALL-NEGATION-INVERSES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_all_negation_inverses", "CACHED-ALL-NEGATION-INVERSES", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_negationinverse_required", "FORWARD-NEGATIONINVERSE-REQUIRED", 1, 0, false );
    new $forward_negationinverse_required$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_negationinverse_rule_select", "FORWARD-NEGATIONINVERSE-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_negationinverse_rule_filter", "FORWARD-NEGATIONINVERSE-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_negationinverse_expand", "FORWARD-NEGATIONINVERSE-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_negationinverse_expand_int", "FORWARD-NEGATIONINVERSE-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_eval_exclusive_pos", "FORWARD-EVAL-EXCLUSIVE-POS", 1, 0, false );
    new $forward_eval_exclusive_pos$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_eval_expand_pos", "FORWARD-EVAL-EXPAND-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_eval_exclusive_neg", "FORWARD-EVAL-EXCLUSIVE-NEG", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_eval_expand_neg", "FORWARD-EVAL-EXPAND-NEG", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_term_of_unit_rule_select", "FORWARD-TERM-OF-UNIT-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_term_of_unit_rule_filter", "FORWARD-TERM-OF-UNIT-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_term_of_unit_expand", "FORWARD-TERM-OF-UNIT-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_term_of_unit_expand_int", "FORWARD-TERM-OF-UNIT-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_nat_function_rule_select", "FORWARD-NAT-FUNCTION-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_nat_function_rule_filter", "FORWARD-NAT-FUNCTION-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_nat_function_expand", "FORWARD-NAT-FUNCTION-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_nat_function_expand_int", "FORWARD-NAT-FUNCTION-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_gaf_predicate_required", "FORWARD-GAF-PREDICATE-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_gaf_predicate_rule_select", "FORWARD-GAF-PREDICATE-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_gaf_predicate_rule_filter", "FORWARD-GAF-PREDICATE-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_gaf_predicate_expand", "FORWARD-GAF-PREDICATE-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_gaf_predicate_expand_int", "FORWARD-GAF-PREDICATE-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_pos_required", "FORWARD-UNBOUND-PRED-POS-REQUIRED", 1, 0, false );
    new $forward_unbound_pred_pos_required$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_unbound_pred_pos_rule_select", "FORWARD-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_pos_rule_filter", "FORWARD-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_pos_expand", "FORWARD-UNBOUND-PRED-POS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_pos_expand_int", "FORWARD-UNBOUND-PRED-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_neg_required", "FORWARD-UNBOUND-PRED-NEG-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_neg_rule_select", "FORWARD-UNBOUND-PRED-NEG-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_neg_rule_filter", "FORWARD-UNBOUND-PRED-NEG-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_neg_expand", "FORWARD-UNBOUND-PRED-NEG-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_unbound_pred_neg_expand_int", "FORWARD-UNBOUND-PRED-NEG-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_assertive_wff_unbound_pred_pos_required", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_assertive_wff_unbound_pred_pos_rule_select", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_assertive_wff_unbound_pred_pos_rule_filter", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_assertive_wff_unbound_pred_pos_expand", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_ist_pos_rule_select", "FORWARD-IST-POS-RULE-SELECT", 1, 0, false );
    new $forward_ist_pos_rule_select$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_ist_pos_rule_filter", "FORWARD-IST-POS-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_ist_pos_expand", "FORWARD-IST-POS-EXPAND", 2, 0, false );
    new $forward_ist_pos_expand$BinaryFunction();
    SubLFiles.declareFunction( me, "forward_ist_pos_expand_int", "FORWARD-IST-POS-EXPAND-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "forward_ist_neg_rule_select", "FORWARD-IST-NEG-RULE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_ist_neg_rule_filter", "FORWARD-IST-NEG-RULE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_ist_neg_expand", "FORWARD-IST-NEG-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_ist_neg_expand_int", "FORWARD-IST-NEG-EXPAND-INT", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_forward_modules_file()
  {
    $forward_modules$ = SubLFiles.defparameter( "*FORWARD-MODULES*", NIL );
    $forward_tactic_specs$ = SubLFiles.defparameter( "*FORWARD-TACTIC-SPECS*", NIL );
    $prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$ = SubLFiles.defparameter( "*PREVENT-FORWARD-TRIGGERING-VIA-EVALUATABLE-PREDICATE-ANTECEDENT-LITERALS?*", T );
    $cached_all_specs_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-SPECS-CACHING-STATE*", NIL );
    $cached_all_genl_mts_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-GENL-MTS-CACHING-STATE*", NIL );
    $cached_all_spec_mts_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-SPEC-MTS-CACHING-STATE*", NIL );
    $cached_all_genl_preds_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-GENL-PREDS-CACHING-STATE*", NIL );
    $cached_all_genl_inverses_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-GENL-INVERSES-CACHING-STATE*", NIL );
    $cached_all_negation_preds_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-NEGATION-PREDS-CACHING-STATE*", NIL );
    $cached_all_negation_inverses_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-NEGATION-INVERSES-CACHING-STATE*", NIL );
    $gaf_predicate_forward_inference_enabledP$ = SubLFiles.defvar( "*GAF-PREDICATE-FORWARD-INFERENCE-ENABLED?*", NIL );
    return NIL;
  }

  public static SubLObject setup_forward_modules_file()
  {
    access_macros.register_macro_helper( $sym7$DO_FORWARD_MODULES_LIST, $sym8$DO_FORWARD_MODULES );
    forward_module( $kw20$FORWARD_NORMAL_POS, $list21 );
    forward_module( $kw22$FORWARD_NORMAL_NEG, $list23 );
    forward_module( $kw24$FORWARD_ISA, $list25 );
    memoization_state.note_memoized_function( $sym29$FORWARD_INFERENCE_ALL_GENLS );
    forward_module( $kw30$FORWARD_NOT_ISA, $list31 );
    memoization_state.note_globally_cached_function( $sym32$CACHED_ALL_SPECS );
    forward_module( $kw36$FORWARD_QUOTED_ISA, $list37 );
    forward_module( $kw39$FORWARD_NOT_QUOTED_ISA, $list40 );
    forward_module( $kw41$FORWARD_GENLS, $list42 );
    forward_module( $kw43$FORWARD_NOT_GENLS, $list44 );
    forward_module( $kw45$FORWARD_GENLMT, $list46 );
    memoization_state.note_globally_cached_function( $sym47$CACHED_ALL_GENL_MTS );
    forward_module( $kw52$FORWARD_NOT_GENLMT, $list53 );
    memoization_state.note_globally_cached_function( $sym54$CACHED_ALL_SPEC_MTS );
    forward_module( $kw57$FORWARD_SYMMETRIC_POS, $list58 );
    forward_module( $kw61$FORWARD_SYMMETRIC_NEG, $list62 );
    forward_module( $kw63$FORWARD_ASYMMETRIC, $list64 );
    forward_module( $kw67$FORWARD_COMMUTATIVE_POS, $list68 );
    forward_module( $kw71$FORWARD_COMMUTATIVE_NEG, $list72 );
    forward_module( $kw73$FORWARD_GENLPREDS_GAF, $list74 );
    memoization_state.note_globally_cached_function( $sym77$CACHED_ALL_GENL_PREDS );
    memoization_state.note_globally_cached_function( $sym80$CACHED_ALL_GENL_INVERSES );
    forward_module( $kw84$FORWARD_NOT_GENLPREDS_GAF, $list85 );
    forward_module( $kw86$FORWARD_GENLPREDS_POS, $list87 );
    forward_module( $kw88$FORWARD_GENLINVERSE_GAF, $list89 );
    forward_module( $kw90$FORWARD_NOT_GENLINVERSE_GAF, $list91 );
    forward_module( $kw92$FORWARD_GENLINVERSE_POS, $list93 );
    forward_module( $kw94$FORWARD_NEGATIONPREDS, $list95 );
    memoization_state.note_globally_cached_function( $sym96$CACHED_ALL_NEGATION_PREDS );
    forward_module( $kw102$FORWARD_NEGATIONINVERSE, $list103 );
    memoization_state.note_globally_cached_function( $sym104$CACHED_ALL_NEGATION_INVERSES );
    forward_module( $kw109$FORWARD_EVAL_POS, $list110 );
    forward_module( $kw112$FORWARD_EVAL_NEG, $list113 );
    forward_module( $kw114$FORWARD_TERM_OF_UNIT, $list115 );
    forward_module( $kw117$FORWARD_NAT_FUNCTION, $list118 );
    forward_module( $kw120$FORWARD_GAF_PREDICATE, $list121 );
    forward_module( $kw125$FORWARD_UNBOUND_PRED_POS, $list126 );
    forward_module( $kw127$FORWARD_UNBOUND_PRED_NEG, $list128 );
    forward_module( $kw129$FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS, $list130 );
    forward_module( $kw131$FORWARD_IST_POS, $list132 );
    forward_module( $kw134$FORWARD_IST_NEG, $list135 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_forward_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_forward_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_forward_modules_file();
  }
  static
  {
    me = new forward_modules();
    $forward_modules$ = null;
    $forward_tactic_specs$ = null;
    $prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$ = null;
    $cached_all_specs_caching_state$ = null;
    $cached_all_genl_mts_caching_state$ = null;
    $cached_all_spec_mts_caching_state$ = null;
    $cached_all_genl_preds_caching_state$ = null;
    $cached_all_genl_inverses_caching_state$ = null;
    $cached_all_negation_preds_caching_state$ = null;
    $cached_all_negation_inverses_caching_state$ = null;
    $gaf_predicate_forward_inference_enabledP$ = null;
    $kw0$FORWARD = makeKeyword( "FORWARD" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list2 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$DO_LIST = makeSymbol( "DO-LIST" );
    $list6 = ConsesLow.list( makeSymbol( "DO-FORWARD-MODULES-LIST" ) );
    $sym7$DO_FORWARD_MODULES_LIST = makeSymbol( "DO-FORWARD-MODULES-LIST" );
    $sym8$DO_FORWARD_MODULES = makeSymbol( "DO-FORWARD-MODULES" );
    $kw9$QUERY = makeKeyword( "QUERY" );
    $sym10$TMS_ASSERTION_BEING_REMOVED_ = makeSymbol( "TMS-ASSERTION-BEING-REMOVED?" );
    $sym11$FORWARD_TACTIC_SPEC_RULE = makeSymbol( "FORWARD-TACTIC-SPEC-RULE" );
    $sym12$FORWARD_TACTIC_SPEC_ = makeSymbol( "FORWARD-TACTIC-SPEC<" );
    $sym13$KBEQ = makeSymbol( "KBEQ" );
    $kw14$ALL = makeKeyword( "ALL" );
    $kw15$FORWARD_TACTIC_SPECS = makeKeyword( "FORWARD-TACTIC-SPECS" );
    $kw16$NO_RULE = makeKeyword( "NO-RULE" );
    $kw17$NEG = makeKeyword( "NEG" );
    $kw18$RULE = makeKeyword( "RULE" );
    $kw19$POS = makeKeyword( "POS" );
    $kw20$FORWARD_NORMAL_POS = makeKeyword( "FORWARD-NORMAL-POS" );
    $list21 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-NORMAL-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol(
        "FORWARD-NORMAL-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NORMAL-POS-EXPAND" ) );
    $kw22$FORWARD_NORMAL_NEG = makeKeyword( "FORWARD-NORMAL-NEG" );
    $list23 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-NORMAL-NEG-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol(
        "FORWARD-NORMAL-NEG-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NORMAL-NEG-EXPAND" ) );
    $kw24$FORWARD_ISA = makeKeyword( "FORWARD-ISA" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "RULE-SELECT" ),
      makeSymbol( "FORWARD-ISA-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-ISA-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-ISA-EXPAND" )
    } );
    $const26$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw27$GENLS = makeKeyword( "GENLS" );
    $const28$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym29$FORWARD_INFERENCE_ALL_GENLS = makeSymbol( "FORWARD-INFERENCE-ALL-GENLS" );
    $kw30$FORWARD_NOT_ISA = makeKeyword( "FORWARD-NOT-ISA" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "RULE-SELECT" ),
      makeSymbol( "FORWARD-NOT-ISA-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NOT-ISA-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NOT-ISA-EXPAND" )
    } );
    $sym32$CACHED_ALL_SPECS = makeSymbol( "CACHED-ALL-SPECS" );
    $sym33$_CACHED_ALL_SPECS_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-SPECS-CACHING-STATE*" );
    $int34$64 = makeInteger( 64 );
    $sym35$CLEAR_CACHED_ALL_SPECS = makeSymbol( "CLEAR-CACHED-ALL-SPECS" );
    $kw36$FORWARD_QUOTED_ISA = makeKeyword( "FORWARD-QUOTED-ISA" );
    $list37 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-QUOTED-ISA-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-QUOTED-ISA-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-QUOTED-ISA-EXPAND" )
    } );
    $const38$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $kw39$FORWARD_NOT_QUOTED_ISA = makeKeyword( "FORWARD-NOT-QUOTED-ISA" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-NOT-QUOTED-ISA-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NOT-QUOTED-ISA-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
            "FORWARD-NOT-QUOTED-ISA-EXPAND" )
    } );
    $kw41$FORWARD_GENLS = makeKeyword( "FORWARD-GENLS" );
    $list42 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-GENLS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-GENLS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-GENLS-EXPAND" )
    } );
    $kw43$FORWARD_NOT_GENLS = makeKeyword( "FORWARD-NOT-GENLS" );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-NOT-GENLS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NOT-GENLS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NOT-GENLS-EXPAND" )
    } );
    $kw45$FORWARD_GENLMT = makeKeyword( "FORWARD-GENLMT" );
    $list46 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-GENLMT-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-GENLMT-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-GENLMT-EXPAND" )
    } );
    $sym47$CACHED_ALL_GENL_MTS = makeSymbol( "CACHED-ALL-GENL-MTS" );
    $sym48$_CACHED_ALL_GENL_MTS_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-GENL-MTS-CACHING-STATE*" );
    $sym49$CLEAR_CACHED_ALL_GENL_MTS = makeSymbol( "CLEAR-CACHED-ALL-GENL-MTS" );
    $const50$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $kw51$GENLMT = makeKeyword( "GENLMT" );
    $kw52$FORWARD_NOT_GENLMT = makeKeyword( "FORWARD-NOT-GENLMT" );
    $list53 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-NOT-GENLMT-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NOT-GENLMT-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NOT-GENLMT-EXPAND" )
    } );
    $sym54$CACHED_ALL_SPEC_MTS = makeSymbol( "CACHED-ALL-SPEC-MTS" );
    $sym55$_CACHED_ALL_SPEC_MTS_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-SPEC-MTS-CACHING-STATE*" );
    $sym56$CLEAR_CACHED_ALL_SPEC_MTS = makeSymbol( "CLEAR-CACHED-ALL-SPEC-MTS" );
    $kw57$FORWARD_SYMMETRIC_POS = makeKeyword( "FORWARD-SYMMETRIC-POS" );
    $list58 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SYMMETRIC-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "RULE-SELECT" ), makeSymbol( "FORWARD-SYMMETRIC-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-SYMMETRIC-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
                "FORWARD-SYMMETRIC-POS-EXPAND" )
    } );
    $kw59$ISA = makeKeyword( "ISA" );
    $list60 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SymmetricBinaryPredicate" ) ) );
    $kw61$FORWARD_SYMMETRIC_NEG = makeKeyword( "FORWARD-SYMMETRIC-NEG" );
    $list62 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SYMMETRIC-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "RULE-SELECT" ), makeSymbol( "FORWARD-SYMMETRIC-NEG-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-SYMMETRIC-NEG-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
                "FORWARD-SYMMETRIC-NEG-EXPAND" )
    } );
    $kw63$FORWARD_ASYMMETRIC = makeKeyword( "FORWARD-ASYMMETRIC" );
    $list64 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-ASYMMETRIC-REQUIRED" ), makeKeyword( "RULE-SELECT" ), makeSymbol(
        "FORWARD-ASYMMETRIC-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-ASYMMETRIC-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-ASYMMETRIC-EXPAND" )
    } );
    $list65 = ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "INFERENCE-ASYMMETRIC-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) );
    $list66 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AsymmetricBinaryPredicate" ) ) );
    $kw67$FORWARD_COMMUTATIVE_POS = makeKeyword( "FORWARD-COMMUTATIVE-POS" );
    $list68 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS( ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-COMMUTATIVE-POS-RULE-SELECT" ), makeKeyword(
                "RULE-FILTER" ), makeSymbol( "FORWARD-COMMUTATIVE-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-COMMUTATIVE-POS-EXPAND" )
    } );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CommutativePredicate" ) ) );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PartiallyCommutativePredicate" ) ) );
    $kw71$FORWARD_COMMUTATIVE_NEG = makeKeyword( "FORWARD-COMMUTATIVE-NEG" );
    $list72 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS( ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-COMMUTATIVE-NEG-RULE-SELECT" ), makeKeyword(
                "RULE-FILTER" ), makeSymbol( "FORWARD-COMMUTATIVE-NEG-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-COMMUTATIVE-NEG-EXPAND" )
    } );
    $kw73$FORWARD_GENLPREDS_GAF = makeKeyword( "FORWARD-GENLPREDS-GAF" );
    $list74 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FORT" ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ) ) ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-GENLPREDS-GAF-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ),
      makeSymbol( "FORWARD-GENLPREDS-GAF-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-GENLPREDS-GAF-EXPAND" )
    } );
    $const75$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const76$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym77$CACHED_ALL_GENL_PREDS = makeSymbol( "CACHED-ALL-GENL-PREDS" );
    $sym78$_CACHED_ALL_GENL_PREDS_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-GENL-PREDS-CACHING-STATE*" );
    $sym79$CLEAR_CACHED_ALL_GENL_PREDS = makeSymbol( "CLEAR-CACHED-ALL-GENL-PREDS" );
    $sym80$CACHED_ALL_GENL_INVERSES = makeSymbol( "CACHED-ALL-GENL-INVERSES" );
    $sym81$_CACHED_ALL_GENL_INVERSES_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-GENL-INVERSES-CACHING-STATE*" );
    $sym82$CLEAR_CACHED_ALL_GENL_INVERSES = makeSymbol( "CLEAR-CACHED-ALL-GENL-INVERSES" );
    $kw83$GENLPREDS = makeKeyword( "GENLPREDS" );
    $kw84$FORWARD_NOT_GENLPREDS_GAF = makeKeyword( "FORWARD-NOT-GENLPREDS-GAF" );
    $list85 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
            "FORWARD-NOT-GENLPREDS-GAF-EXPAND" )
    } );
    $kw86$FORWARD_GENLPREDS_POS = makeKeyword( "FORWARD-GENLPREDS-POS" );
    $list87 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "RULE-SELECT" ),
      makeSymbol( "FORWARD-GENLPREDS-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-GENLPREDS-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-GENLPREDS-POS-EXPAND" )
    } );
    $kw88$FORWARD_GENLINVERSE_GAF = makeKeyword( "FORWARD-GENLINVERSE-GAF" );
    $list89 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FORT" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ) ) ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-GENLINVERSE-GAF-RULE-SELECT" ), makeKeyword(
                "RULE-FILTER" ), makeSymbol( "FORWARD-GENLINVERSE-GAF-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-GENLINVERSE-GAF-EXPAND" )
    } );
    $kw90$FORWARD_NOT_GENLINVERSE_GAF = makeKeyword( "FORWARD-NOT-GENLINVERSE-GAF" );
    $list91 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
            "FORWARD-NOT-GENLINVERSE-GAF-EXPAND" )
    } );
    $kw92$FORWARD_GENLINVERSE_POS = makeKeyword( "FORWARD-GENLINVERSE-POS" );
    $list93 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-GENLINVERSE-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-GENLINVERSE-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
          "FORWARD-GENLINVERSE-POS-EXPAND" )
    } );
    $kw94$FORWARD_NEGATIONPREDS = makeKeyword( "FORWARD-NEGATIONPREDS" );
    $list95 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-NEGATIONPREDS-REQUIRED" ), makeKeyword( "RULE-SELECT" ), makeSymbol(
        "FORWARD-NEGATIONPREDS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NEGATIONPREDS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NEGATIONPREDS-EXPAND" )
    } );
    $sym96$CACHED_ALL_NEGATION_PREDS = makeSymbol( "CACHED-ALL-NEGATION-PREDS" );
    $sym97$_CACHED_ALL_NEGATION_PREDS_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-NEGATION-PREDS-CACHING-STATE*" );
    $sym98$CLEAR_CACHED_ALL_NEGATION_PREDS = makeSymbol( "CLEAR-CACHED-ALL-NEGATION-PREDS" );
    $list99 = ConsesLow.cons( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?" ) ) ), makeKeyword( "ANYTHING" ) );
    $kw100$NEGATIONPREDS = makeKeyword( "NEGATIONPREDS" );
    $const101$negationPreds = constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) );
    $kw102$FORWARD_NEGATIONINVERSE = makeKeyword( "FORWARD-NEGATIONINVERSE" );
    $list103 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-NEGATIONINVERSE-REQUIRED" ), makeKeyword( "RULE-SELECT" ), makeSymbol(
        "FORWARD-NEGATIONINVERSE-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NEGATIONINVERSE-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-NEGATIONINVERSE-EXPAND" )
    } );
    $sym104$CACHED_ALL_NEGATION_INVERSES = makeSymbol( "CACHED-ALL-NEGATION-INVERSES" );
    $sym105$_CACHED_ALL_NEGATION_INVERSES_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-NEGATION-INVERSES-CACHING-STATE*" );
    $sym106$CLEAR_CACHED_ALL_NEGATION_INVERSES = makeSymbol( "CLEAR-CACHED-ALL-NEGATION-INVERSES" );
    $list107 = ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) );
    $const108$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
    $kw109$FORWARD_EVAL_POS = makeKeyword( "FORWARD-EVAL-POS" );
    $list110 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "FORWARD-EVAL-EXCLUSIVE-POS" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-EVAL-EXPAND-POS" ) );
    $list111 = ConsesLow.cons( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "INFERENCE-EVALUATABLE-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ) );
    $kw112$FORWARD_EVAL_NEG = makeKeyword( "FORWARD-EVAL-NEG" );
    $list113 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "FORWARD-EVAL-EXCLUSIVE-NEG" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-EVAL-EXPAND-NEG" ) );
    $kw114$FORWARD_TERM_OF_UNIT = makeKeyword( "FORWARD-TERM-OF-UNIT" );
    $list115 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-TERM-OF-UNIT-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-TERM-OF-UNIT-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
            "FORWARD-TERM-OF-UNIT-EXPAND" )
    } );
    $const116$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw117$FORWARD_NAT_FUNCTION = makeKeyword( "FORWARD-NAT-FUNCTION" );
    $list118 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ), makeKeyword(
        "RULE-SELECT" ), makeSymbol( "FORWARD-NAT-FUNCTION-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-NAT-FUNCTION-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
            "FORWARD-NAT-FUNCTION-EXPAND" )
    } );
    $const119$natFunction = constant_handles.reader_make_constant_shell( makeString( "natFunction" ) );
    $kw120$FORWARD_GAF_PREDICATE = makeKeyword( "FORWARD-GAF-PREDICATE" );
    $list121 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-GAF-PREDICATE-REQUIRED" ), makeKeyword( "RULE-SELECT" ), makeSymbol(
        "FORWARD-GAF-PREDICATE-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-GAF-PREDICATE-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-GAF-PREDICATE-EXPAND" )
    } );
    $const122$gafPredicate = constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) );
    $kw123$GAF = makeKeyword( "GAF" );
    $kw124$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw125$FORWARD_UNBOUND_PRED_POS = makeKeyword( "FORWARD-UNBOUND-PRED-POS" );
    $list126 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-UNBOUND-PRED-POS-REQUIRED" ), makeKeyword( "RULE-SELECT" ), makeSymbol(
        "FORWARD-UNBOUND-PRED-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-UNBOUND-PRED-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-UNBOUND-PRED-POS-EXPAND" )
    } );
    $kw127$FORWARD_UNBOUND_PRED_NEG = makeKeyword( "FORWARD-UNBOUND-PRED-NEG" );
    $list128 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-UNBOUND-PRED-NEG-REQUIRED" ), makeKeyword( "RULE-SELECT" ), makeSymbol(
        "FORWARD-UNBOUND-PRED-NEG-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-UNBOUND-PRED-NEG-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-UNBOUND-PRED-NEG-EXPAND" )
    } );
    $kw129$FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS = makeKeyword( "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS" );
    $list130 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-REQUIRED" ), makeKeyword( "RULE-SELECT" ),
      makeSymbol( "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol( "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol(
          "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-EXPAND" )
    } );
    $kw131$FORWARD_IST_POS = makeKeyword( "FORWARD-IST-POS" );
    $list132 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-IST-POS-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol(
        "FORWARD-IST-POS-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-IST-POS-EXPAND" ) );
    $const133$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw134$FORWARD_IST_NEG = makeKeyword( "FORWARD-IST-NEG" );
    $list135 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "RULE-SELECT" ), makeSymbol( "FORWARD-IST-NEG-RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeSymbol(
        "FORWARD-IST-NEG-RULE-FILTER" ), makeKeyword( "EXPAND" ), makeSymbol( "FORWARD-IST-NEG-EXPAND" ) );
    $const136$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
  }

  public static final class $forward_normal_pos_rule_select$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_normal_pos_rule_select$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-NORMAL-POS-RULE-SELECT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_normal_pos_rule_select( arg1 );
    }
  }

  public static final class $forward_normal_pos_expand$BinaryFunction
      extends
        BinaryFunction
  {
    public $forward_normal_pos_expand$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-NORMAL-POS-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return forward_normal_pos_expand( arg1, arg2 );
    }
  }

  public static final class $forward_isa_rule_select$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_isa_rule_select$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-ISA-RULE-SELECT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_isa_rule_select( arg1 );
    }
  }

  public static final class $forward_isa_expand$BinaryFunction
      extends
        BinaryFunction
  {
    public $forward_isa_expand$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-ISA-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return forward_isa_expand( arg1, arg2 );
    }
  }

  public static final class $forward_symmetric_pos_rule_select$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_symmetric_pos_rule_select$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-SYMMETRIC-POS-RULE-SELECT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_symmetric_pos_rule_select( arg1 );
    }
  }

  public static final class $forward_asymmetric_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_asymmetric_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-ASYMMETRIC-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_asymmetric_required( arg1 );
    }
  }

  public static final class $forward_genlpreds_pos_rule_select$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_genlpreds_pos_rule_select$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-GENLPREDS-POS-RULE-SELECT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_genlpreds_pos_rule_select( arg1 );
    }
  }

  public static final class $forward_genlinverse_pos_rule_select$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_genlinverse_pos_rule_select$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-GENLINVERSE-POS-RULE-SELECT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_genlinverse_pos_rule_select( arg1 );
    }
  }

  public static final class $forward_negationpreds_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_negationpreds_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-NEGATIONPREDS-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_negationpreds_required( arg1 );
    }
  }

  public static final class $forward_negationinverse_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_negationinverse_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-NEGATIONINVERSE-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_negationinverse_required( arg1 );
    }
  }

  public static final class $forward_eval_exclusive_pos$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_eval_exclusive_pos$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-EVAL-EXCLUSIVE-POS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_eval_exclusive_pos( arg1 );
    }
  }

  public static final class $forward_unbound_pred_pos_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_unbound_pred_pos_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-UNBOUND-PRED-POS-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_unbound_pred_pos_required( arg1 );
    }
  }

  public static final class $forward_ist_pos_rule_select$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_ist_pos_rule_select$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-IST-POS-RULE-SELECT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_ist_pos_rule_select( arg1 );
    }
  }

  public static final class $forward_ist_pos_expand$BinaryFunction
      extends
        BinaryFunction
  {
    public $forward_ist_pos_expand$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-IST-POS-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return forward_ist_pos_expand( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 1238 ms
 * 
 */