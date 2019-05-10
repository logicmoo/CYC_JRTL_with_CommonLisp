package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_module_generation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation";
  public static final String myFingerPrint = "26501e8bce1f7e301b747df9db69913846555a6c3887c2f0f3f9b0739a4c14a3";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1096L)
  private static SubLSymbol $sksi_conjunctive_removal_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 12781L)
  private static SubLSymbol $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$;
  private static final SubLSymbol $sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$HL_MODULES;
  private static final SubLSymbol $sym3$DO_DICTIONARY;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$CDOLIST;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$SKS;
  private static final SubLSymbol $sym8$DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS;
  private static final SubLSymbol $sym9$IGNORE;
  private static final SubLObject $const10$sksDoesNotAllowConjunctiveRemoval;
  private static final SubLString $str11$SKSI_conjunctive_removal_module_f;
  private static final SubLString $str12$_;
  private static final SubLSymbol $kw13$MODULE_SUBTYPE;
  private static final SubLSymbol $kw14$SKSI;
  private static final SubLSymbol $kw15$MODULE_SOURCE;
  private static final SubLSymbol $kw16$DIRECTION;
  private static final SubLSymbol $kw17$APPLICABILITY_PATTERN;
  private static final SubLSymbol $kw18$CALL;
  private static final SubLSymbol $sym19$REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY;
  private static final SubLSymbol $kw20$INPUT;
  private static final SubLSymbol $kw21$COST_PATTERN;
  private static final SubLSymbol $sym22$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST;
  private static final SubLSymbol $kw23$COMPLETENESS_PATTERN;
  private static final SubLSymbol $sym24$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS;
  private static final SubLSymbol $kw25$EXPAND_ITERATIVE_PATTERN;
  private static final SubLSymbol $sym26$REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE;
  private static final SubLSymbol $kw27$DOCUMENTATION;
  private static final SubLSymbol $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME;
  private static final SubLString $str29$_;
  private static final SubLString $str30$_;
  private static final SubLString $str31$REMOVAL_SKSI_;
  private static final SubLString $str32$_CONJUNCTION_POS_LITS;
  private static final SubLSymbol $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI;
  private static final SubLSymbol $sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST;
  private static final SubLSymbol $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN;
  private static final SubLSymbol $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE;
  private static final SubLSymbol $kw37$EXCLUSIVE;
  private static final SubLSymbol $sym38$TRUE;
  private static final SubLSymbol $kw39$SUPPLANTS;
  private static final SubLString $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC;
  private static final SubLSymbol $kw41$NEG;
  private static final SubLList $list42;
  private static final SubLSymbol $kw43$POS;
  private static final SubLObject $const44$unknownSentence;
  private static final SubLSymbol $sym45$NEW_POS_SUBCLAUSE_SPEC;
  private static final SubLSymbol $kw46$INCOMPLETE;
  private static final SubLSymbol $kw47$ABORT;
  private static final SubLSymbol $sym48$BINDINGS_EQUAL_;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1295L)
  public static SubLObject note_sksi_conjunctive_removal_module(final SubLObject hl_module, final SubLObject sks)
  {
    return dictionary_utilities.dictionary_push( $sksi_conjunctive_removal_modules$.getGlobalValue(), sks, hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1441L)
  public static SubLObject un_note_sksi_conjunctive_removal_module(final SubLObject sks)
  {
    return dictionary_utilities.dictionary_pop( $sksi_conjunctive_removal_modules$.getGlobalValue(), sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1569L)
  public static SubLObject clear_sksi_conjunctive_removal_modules()
  {
    return dictionary.clear_dictionary( $sksi_conjunctive_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1691L)
  public static SubLObject look_up_sksi_conjunctive_removal_modules(final SubLObject sks)
  {
    return dictionary.dictionary_lookup( $sksi_conjunctive_removal_modules$.getGlobalValue(), sks, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1823L)
  public static SubLObject sksi_conjunctive_removal_modules_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $sksi_conjunctive_removal_modules$.getGlobalValue() ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject hl_modules = thread.secondMultipleValue();
      thread.resetMultipleValues();
      count = Numbers.add( count, Sequences.length( hl_modules ) );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2052L)
  public static SubLObject some_sksi_conjunctive_removal_module_registeredP()
  {
    return makeBoolean( NIL == dictionary.dictionary_empty_p( $sksi_conjunctive_removal_modules$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2195L)
  public static SubLObject do_sksi_conjunctive_removal_modules_by_sks(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sks = NIL;
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    hl_module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject hl_modules = $sym2$HL_MODULES;
      return ConsesLow.list( $sym3$DO_DICTIONARY, ConsesLow.listS( sks, hl_modules, $list4 ), ConsesLow.listS( $sym5$CDOLIST, ConsesLow.list( hl_module, hl_modules ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2454L)
  public static SubLObject do_sksi_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    hl_module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sks = $sym7$SKS;
      return ConsesLow.listS( $sym8$DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS, ConsesLow.list( sks, hl_module ), ConsesLow.list( $sym9$IGNORE, sks ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2665L)
  public static SubLObject register_sksi_conjunctive_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL == mapping_mt )
        {
          mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          SubLObject cdolist_list_var;
          final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
          SubLObject ks = NIL;
          ks = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            count = Numbers.add( count, register_sksi_conjunctive_removal_module_for_just_sks( ks, mapping_mt, NIL ) );
            cdolist_list_var = cdolist_list_var.rest();
            ks = cdolist_list_var.first();
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 3339L)
  public static SubLObject register_sksi_conjunctive_removal_module_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL == mapping_mt )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    deregister_sksi_conjunctive_removal_module_for_just_sks( sks, UNPROVIDED );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL != register_sksi_conjunctive_removal_module_for_just_sks_int( sks, mapping_mt ) )
        {
          count = ONE_INTEGER;
        }
        if( NIL != register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int( sks, mapping_mt ) )
        {
          count = ONE_INTEGER;
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
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
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 4151L)
  public static SubLObject deregister_sksi_conjunctive_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = NIL;
    }
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL == mapping_mt )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
      SubLObject ks = NIL;
      ks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, deregister_sksi_conjunctive_removal_module_for_just_sks( ks, NIL ) );
        cdolist_list_var = cdolist_list_var.rest();
        ks = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 4784L)
  public static SubLObject deregister_sksi_conjunctive_removal_module_for_just_sks(final SubLObject sks, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    SubLObject hl_modules = look_up_sksi_conjunctive_removal_modules( sks );
    SubLObject count = ZERO_INTEGER;
    if( NIL != hl_modules )
    {
      if( !hl_modules.isCons() )
      {
        hl_modules = ConsesLow.list( hl_modules );
      }
      SubLObject cdolist_list_var = hl_modules;
      SubLObject hl_module = NIL;
      hl_module = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject name = inference_modules.hl_module_name( hl_module );
        un_note_sksi_conjunctive_removal_module( sks );
        inference_modules.undeclare_inference_conjunctive_removal_module( name );
        if( NIL != reclassifyP )
        {
          inference_modules.reclassify_removal_modules();
        }
        count = ONE_INTEGER;
        cdolist_list_var = cdolist_list_var.rest();
        hl_module = cdolist_list_var.first();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 5514L)
  public static SubLObject deregister_all_sksi_conjunctive_removal_modules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $sksi_conjunctive_removal_modules$.getGlobalValue() ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject hl_modules = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = hl_modules;
      SubLObject hl_module = NIL;
      hl_module = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject name = inference_modules.hl_module_name( hl_module );
        inference_modules.undeclare_inference_conjunctive_removal_module( name );
        count = Numbers.add( count, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        hl_module = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    clear_sksi_conjunctive_removal_modules();
    inference_modules.reclassify_removal_modules();
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 5970L)
  public static SubLObject sks_does_not_allow_conjunctive_removalP(final SubLObject sks)
  {
    return list_utilities.sublisp_boolean( kb_mapping_utilities.fpred_value_gaf( sks, $const10$sksDoesNotAllowConjunctiveRemoval, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 6151L)
  public static SubLObject register_sksi_conjunctive_removal_module_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile( sks, mapping_mt, T );
    SubLObject hl_module = NIL;
    if( NIL != sksi_query_datastructures.valid_and_supported_sks_profile( sks_profile ) && NIL == sks_does_not_allow_conjunctive_removalP( sks ) )
    {
      SubLObject direction = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mapping_mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mapping_mt ), thread );
        direction = sksi_kb_accessors.get_sks_multi_literal_lookup_direction_from_kb( sks );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      final SubLObject name = determine_sksi_conjunctive_removal_module_name( sks );
      final SubLObject doc_string = Sequences.cconcatenate( $str11$SKSI_conjunctive_removal_module_f, new SubLObject[] { format_nil.format_nil_s_no_copy( sks ), $str12$_
      } );
      final SubLObject plist = ConsesLow.list( new SubLObject[] { $kw13$MODULE_SUBTYPE, $kw14$SKSI, $kw15$MODULE_SOURCE, sks, $kw16$DIRECTION, direction, $kw17$APPLICABILITY_PATTERN, ConsesLow.list( $kw18$CALL,
          $sym19$REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY, $kw20$INPUT, sks_profile ), $kw21$COST_PATTERN, ConsesLow.list( $kw18$CALL, $sym22$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST, $kw20$INPUT, sks_profile ),
        $kw23$COMPLETENESS_PATTERN, ConsesLow.list( $kw18$CALL, $sym24$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS, $kw20$INPUT, sks_profile ), $kw25$EXPAND_ITERATIVE_PATTERN, ConsesLow.list( $kw18$CALL,
            $sym26$REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE, $kw20$INPUT, sks_profile ), $kw27$DOCUMENTATION, doc_string
      } );
      hl_module = inference_modules.inference_conjunctive_removal_module( name, plist );
      note_sksi_conjunctive_removal_module( hl_module, sks );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 7526L)
  public static SubLObject determine_sksi_conjunctive_removal_module_name_internal(final SubLObject sks)
  {
    if( NIL == sks )
    {
      return NIL;
    }
    final SubLObject sks_name = sksi_kb_accessors.sk_source_name( sks );
    final SubLObject core_name_string = ( NIL != sks_name ) ? string_utilities.string_substitute( $str29$_, $str30$_, Strings.string_upcase( sks_name, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) : NIL;
    final SubLObject core_name_symbol = Symbols.gensym( core_name_string );
    final SubLObject name_string = Sequences.cconcatenate( $str31$REMOVAL_SKSI_, new SubLObject[] { format_nil.format_nil_a_no_copy( core_name_symbol ), $str32$_CONJUNCTION_POS_LITS
    } );
    final SubLObject name = Symbols.make_keyword( name_string );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 7526L)
  public static SubLObject determine_sksi_conjunctive_removal_module_name(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return determine_sksi_conjunctive_removal_module_name_internal( sks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sks, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( determine_sksi_conjunctive_removal_module_name_internal( sks ) ) );
      memoization_state.caching_state_put( caching_state, sks, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 8176L)
  public static SubLObject register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile( sks, mapping_mt, T );
    SubLObject hl_module = NIL;
    if( NIL != sksi_query_datastructures.valid_and_supported_sks_profile( sks_profile ) && NIL == sks_does_not_allow_conjunctive_removalP( sks ) )
    {
      SubLObject direction = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mapping_mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mapping_mt ), thread );
        direction = sksi_kb_accessors.get_sks_multi_literal_lookup_direction_from_kb( sks );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      final SubLObject name = determine_sksi_conjunctive_removal_with_unknown_sentence_module_name( sks );
      final SubLObject supplants_name = determine_sksi_conjunctive_removal_module_name( sks );
      final SubLObject doc_string = Sequences.cconcatenate( $str11$SKSI_conjunctive_removal_module_f, new SubLObject[] { format_nil.format_nil_s_no_copy( sks ), $str12$_
      } );
      final SubLObject plist = ConsesLow.list( new SubLObject[] { $kw13$MODULE_SUBTYPE, $kw14$SKSI, $kw15$MODULE_SOURCE, sks, $kw16$DIRECTION, direction, $kw17$APPLICABILITY_PATTERN, ConsesLow.list( $kw18$CALL,
          $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI, $kw20$INPUT, sks_profile ), $kw21$COST_PATTERN, ConsesLow.list( $kw18$CALL,
              $sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST, $kw20$INPUT, sks_profile ), $kw23$COMPLETENESS_PATTERN, ConsesLow.list( $kw18$CALL,
                  $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN, $kw20$INPUT, sks_profile ), $kw25$EXPAND_ITERATIVE_PATTERN, ConsesLow.list( $kw18$CALL,
                      $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE, $kw20$INPUT, sks_profile ), $kw37$EXCLUSIVE, $sym38$TRUE, $kw39$SUPPLANTS, ConsesLow.list( supplants_name ),
        $kw27$DOCUMENTATION, doc_string
      } );
      hl_module = inference_modules.inference_conjunctive_removal_module( name, plist );
      note_sksi_conjunctive_removal_module( hl_module, sks );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 9855L)
  public static SubLObject determine_sksi_conjunctive_removal_with_unknown_sentence_module_name(final SubLObject sks)
  {
    if( NIL == sks )
    {
      return NIL;
    }
    final SubLObject sks_name = sksi_kb_accessors.sk_source_name( sks );
    final SubLObject core_name_string = ( NIL != sks_name ) ? string_utilities.string_substitute( $str29$_, $str30$_, Strings.string_upcase( sks_name, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) : NIL;
    final SubLObject core_name_symbol = Symbols.gensym( core_name_string );
    final SubLObject name_string = Sequences.cconcatenate( $str31$REMOVAL_SKSI_, new SubLObject[] { format_nil.format_nil_a_no_copy( core_name_symbol ), $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC
    } );
    final SubLObject name = Symbols.make_keyword( name_string );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 10441L)
  public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_applicability(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_macros.current_controlling_inference() && NIL == sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL == inference_worker_split.all_literals_connected_by_shared_varsP( contextualized_dnf_clause ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject mt = NIL;
    SubLObject sense = $kw41$NEG;
    SubLObject index_var = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject this_mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      this_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != mt )
        {
          if( !this_mt.equal( mt ) )
          {
            return NIL;
          }
        }
        else
        {
          mt = this_mt;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    sense = $kw43$POS;
    index_var = ZERO_INTEGER;
    cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject this_mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      this_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != mt )
        {
          if( !this_mt.equal( mt ) )
          {
            return NIL;
          }
        }
        else
        {
          mt = this_mt;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    SubLObject unknown_sentence_literals = NIL;
    SubLObject other_literals = NIL;
    SubLObject sense2 = $kw41$NEG;
    SubLObject index_var2 = ZERO_INTEGER;
    SubLObject cdolist_list_var2 = clauses.neg_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent2 = NIL;
    contextualized_asent2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current2;
      final SubLObject datum2 = current2 = contextualized_asent2;
      SubLObject this_mt2 = NIL;
      SubLObject asent2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
      this_mt2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
      asent2 = current2.first();
      current2 = current2.rest();
      if( NIL == current2 )
      {
        if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent2, $const44$unknownSentence ) )
        {
          unknown_sentence_literals = ConsesLow.cons( asent2, unknown_sentence_literals );
        }
        else
        {
          other_literals = ConsesLow.cons( asent2, other_literals );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum2, $list42 );
      }
      index_var2 = Numbers.add( index_var2, ONE_INTEGER );
      cdolist_list_var2 = cdolist_list_var2.rest();
      contextualized_asent2 = cdolist_list_var2.first();
    }
    sense2 = $kw43$POS;
    index_var2 = ZERO_INTEGER;
    cdolist_list_var2 = clauses.pos_lits( contextualized_dnf_clause );
    contextualized_asent2 = NIL;
    contextualized_asent2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current2;
      final SubLObject datum2 = current2 = contextualized_asent2;
      SubLObject this_mt2 = NIL;
      SubLObject asent2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
      this_mt2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
      asent2 = current2.first();
      current2 = current2.rest();
      if( NIL == current2 )
      {
        if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent2, $const44$unknownSentence ) )
        {
          unknown_sentence_literals = ConsesLow.cons( asent2, unknown_sentence_literals );
        }
        else
        {
          other_literals = ConsesLow.cons( asent2, other_literals );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum2, $list42 );
      }
      index_var2 = Numbers.add( index_var2, ONE_INTEGER );
      cdolist_list_var2 = cdolist_list_var2.rest();
      contextualized_asent2 = cdolist_list_var2.first();
    }
    if( NIL == unknown_sentence_literals )
    {
      return NIL;
    }
    final SubLObject other_literals_free_vars = el_utilities.sentence_free_variables( el_utilities.make_conjunction( other_literals ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var3 = unknown_sentence_literals;
    SubLObject unknown_sentence_literal = NIL;
    unknown_sentence_literal = cdolist_list_var3.first();
    while ( NIL != cdolist_list_var3)
    {
      if( NIL != conses_high.set_difference( el_utilities.sentence_free_variables( unknown_sentence_literal, UNPROVIDED, UNPROVIDED, UNPROVIDED ), other_literals_free_vars, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var3 = cdolist_list_var3.rest();
      unknown_sentence_literal = cdolist_list_var3.first();
    }
    final SubLObject _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.currentBinding( thread );
    try
    {
      sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind( NIL, thread );
      sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.bind( ONE_INTEGER, thread );
      if( NIL != sksi_conjunctive_removal_modules_applicability.removal_sksi_conjunction_pos_lits_applicability( contextualized_dnf_clause, sks_profile ) )
      {
        SubLObject num = ZERO_INTEGER;
        cdolist_list_var3 = clauses.pos_lits( contextualized_dnf_clause );
        SubLObject lit = NIL;
        lit = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          result = ConsesLow.cons( num, result );
          num = Numbers.add( num, ONE_INTEGER );
          cdolist_list_var3 = cdolist_list_var3.rest();
          lit = cdolist_list_var3.first();
        }
        result = Mapping.mapcar( $sym45$NEW_POS_SUBCLAUSE_SPEC, ConsesLow.list( result ) );
      }
    }
    finally
    {
      sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.rebind( _prev_bind_2, thread );
      sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 13006L)
  public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile)
  {
    return $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 13398L)
  public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_completeness(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile)
  {
    return $kw46$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 13870L)
  public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_output_generate(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject non_unknown_sentence_query_lits = NIL;
    SubLObject unknown_sentence_asents_made_known_lits = NIL;
    SubLObject mt = NIL;
    SubLObject sense = $kw41$NEG;
    SubLObject index_var = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject this_mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      this_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == mt )
        {
          mt = this_mt;
        }
        if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const44$unknownSentence ) )
        {
          unknown_sentence_asents_made_known_lits = ConsesLow.cons( cycl_utilities.sentence_arg1( asent, UNPROVIDED ), unknown_sentence_asents_made_known_lits );
        }
        else
        {
          non_unknown_sentence_query_lits = ConsesLow.cons( asent, non_unknown_sentence_query_lits );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    sense = $kw43$POS;
    index_var = ZERO_INTEGER;
    cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject this_mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      this_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == mt )
        {
          mt = this_mt;
        }
        if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const44$unknownSentence ) )
        {
          unknown_sentence_asents_made_known_lits = ConsesLow.cons( cycl_utilities.sentence_arg1( asent, UNPROVIDED ), unknown_sentence_asents_made_known_lits );
        }
        else
        {
          non_unknown_sentence_query_lits = ConsesLow.cons( asent, non_unknown_sentence_query_lits );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    final SubLObject non_unknown_sentence_query = el_utilities.make_conjunction( non_unknown_sentence_query_lits );
    final SubLObject non_unknown_sentence_query_properties = inference_trampolines.determine_sentence_recursive_query_properties( non_unknown_sentence_query, mt );
    SubLObject raw_results = NIL;
    final SubLObject _prev_bind_0 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding( thread );
    try
    {
      inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject non_unknown_sentence_query_results = ask_utilities.inference_recursive_query_unique_bindings( non_unknown_sentence_query, mt, non_unknown_sentence_query_properties );
      final SubLObject non_unknown_sentence_query_halt_reason = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( non_unknown_sentence_query_halt_reason == $kw47$ABORT )
      {
        inference_strategist.query_abort();
      }
      raw_results = non_unknown_sentence_query_results;
      if( NIL != raw_results )
      {
        SubLObject cdolist_list_var2 = unknown_sentence_asents_made_known_lits;
        SubLObject unknown_sentence_asents_made_known_lit = NIL;
        unknown_sentence_asents_made_known_lit = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          final SubLObject unknown_sentence_asents_made_known_query = el_utilities.make_conjunction( ConsesLow.cons( unknown_sentence_asents_made_known_lit, non_unknown_sentence_query_lits ) );
          final SubLObject unknown_sentence_asents_made_known_query_properties = inference_trampolines.determine_sentence_recursive_query_properties( unknown_sentence_asents_made_known_query, mt );
          thread.resetMultipleValues();
          final SubLObject unknown_sentence_asents_made_known_results = ask_utilities.inference_recursive_query_unique_bindings( unknown_sentence_asents_made_known_query, mt,
              unknown_sentence_asents_made_known_query_properties );
          final SubLObject unknown_sentence_asents_made_known_halt_reason = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( unknown_sentence_asents_made_known_halt_reason == $kw47$ABORT )
          {
            inference_strategist.query_abort();
          }
          raw_results = conses_high.set_difference( raw_results, unknown_sentence_asents_made_known_results, Symbols.symbol_function( $sym48$BINDINGS_EQUAL_ ), UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          unknown_sentence_asents_made_known_lit = cdolist_list_var2.first();
        }
      }
    }
    finally
    {
      inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind( _prev_bind_0, thread );
    }
    SubLObject results = NIL;
    SubLObject cdolist_list_var3 = raw_results;
    SubLObject v_bindings = NIL;
    v_bindings = cdolist_list_var3.first();
    while ( NIL != cdolist_list_var3)
    {
      SubLObject supports = NIL;
      final SubLObject bound_clause = bindings.apply_bindings( v_bindings, contextualized_dnf_clause );
      SubLObject sense2 = $kw41$NEG;
      SubLObject index_var2 = ZERO_INTEGER;
      SubLObject cdolist_list_var_$4 = clauses.neg_lits( bound_clause );
      SubLObject contextualized_asent2 = NIL;
      contextualized_asent2 = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        SubLObject current2;
        final SubLObject datum2 = current2 = contextualized_asent2;
        SubLObject this_mt2 = NIL;
        SubLObject asent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
        this_mt2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
        asent2 = current2.first();
        current2 = current2.rest();
        if( NIL == current2 )
        {
          supports = ConsesLow.cons( ConsesLow.list( arguments.make_hl_support( $kw14$SKSI, asent2, mt, UNPROVIDED ) ), supports );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum2, $list42 );
        }
        index_var2 = Numbers.add( index_var2, ONE_INTEGER );
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        contextualized_asent2 = cdolist_list_var_$4.first();
      }
      sense2 = $kw43$POS;
      index_var2 = ZERO_INTEGER;
      SubLObject cdolist_list_var_$5 = clauses.pos_lits( bound_clause );
      contextualized_asent2 = NIL;
      contextualized_asent2 = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        SubLObject current2;
        final SubLObject datum2 = current2 = contextualized_asent2;
        SubLObject this_mt2 = NIL;
        SubLObject asent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
        this_mt2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list42 );
        asent2 = current2.first();
        current2 = current2.rest();
        if( NIL == current2 )
        {
          supports = ConsesLow.cons( ConsesLow.list( arguments.make_hl_support( $kw14$SKSI, asent2, mt, UNPROVIDED ) ), supports );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum2, $list42 );
        }
        index_var2 = Numbers.add( index_var2, ONE_INTEGER );
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        contextualized_asent2 = cdolist_list_var_$5.first();
      }
      results = ConsesLow.cons( ConsesLow.list( v_bindings, supports ), results );
      cdolist_list_var3 = cdolist_list_var3.rest();
      v_bindings = cdolist_list_var3.first();
    }
    return iteration.new_list_iterator( results );
  }

  public static SubLObject declare_sksi_conjunctive_removal_module_generation_file()
  {
    SubLFiles.declareFunction( me, "note_sksi_conjunctive_removal_module", "NOTE-SKSI-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "un_note_sksi_conjunctive_removal_module", "UN-NOTE-SKSI-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_conjunctive_removal_modules", "CLEAR-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "look_up_sksi_conjunctive_removal_modules", "LOOK-UP-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_conjunctive_removal_modules_count", "SKSI-CONJUNCTIVE-REMOVAL-MODULES-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "some_sksi_conjunctive_removal_module_registeredP", "SOME-SKSI-CONJUNCTIVE-REMOVAL-MODULE-REGISTERED?", 0, 0, false );
    SubLFiles.declareMacro( me, "do_sksi_conjunctive_removal_modules_by_sks", "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES-BY-SKS" );
    SubLFiles.declareMacro( me, "do_sksi_conjunctive_removal_modules", "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES" );
    SubLFiles.declareFunction( me, "register_sksi_conjunctive_removal_modules_for_sks", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULES-FOR-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "register_sksi_conjunctive_removal_module_for_just_sks", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "deregister_sksi_conjunctive_removal_modules_for_sks", "DEREGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULES-FOR-SKS", 1, 2, false );
    SubLFiles.declareFunction( me, "deregister_sksi_conjunctive_removal_module_for_just_sks", "DEREGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS", 1, 1, false );
    SubLFiles.declareFunction( me, "deregister_all_sksi_conjunctive_removal_modules", "DEREGISTER-ALL-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "sks_does_not_allow_conjunctive_removalP", "SKS-DOES-NOT-ALLOW-CONJUNCTIVE-REMOVAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_conjunctive_removal_module_for_just_sks_int", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_sksi_conjunctive_removal_module_name_internal", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_sksi_conjunctive_removal_module_name", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-WITH-UNKNOWN-SENTENCE-MODULE-FOR-JUST-SKS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_sksi_conjunctive_removal_with_unknown_sentence_module_name", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-WITH-UNKNOWN-SENTENCE-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_applicability", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-APPLICABILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_completeness", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_output_generate", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-OUTPUT-GENERATE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_conjunctive_removal_module_generation_file()
  {
    $sksi_conjunctive_removal_modules$ = SubLFiles.deflexical( "*SKSI-CONJUNCTIVE-REMOVAL-MODULES*", maybeDefault( $sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_, $sksi_conjunctive_removal_modules$, () -> ( dictionary
        .new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$ = SubLFiles.deflexical( "*REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST*", THREE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_sksi_conjunctive_removal_module_generation_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_ );
    memoization_state.note_memoized_function( $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME );
    utilities_macros.note_funcall_helper_function( $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI );
    utilities_macros.note_funcall_helper_function( $sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST );
    utilities_macros.note_funcall_helper_function( $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN );
    utilities_macros.note_funcall_helper_function( $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_conjunctive_removal_module_generation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_conjunctive_removal_module_generation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_conjunctive_removal_module_generation_file();
  }
  static
  {
    me = new sksi_conjunctive_removal_module_generation();
    $sksi_conjunctive_removal_modules$ = null;
    $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$ = null;
    $sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_ = makeSymbol( "*SKSI-CONJUNCTIVE-REMOVAL-MODULES*" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "SKS" ), makeSymbol( "HL-MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$HL_MODULES = makeUninternedSymbol( "HL-MODULES" );
    $sym3$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list4 = ConsesLow.list( makeSymbol( "*SKSI-CONJUNCTIVE-REMOVAL-MODULES*" ) );
    $sym5$CDOLIST = makeSymbol( "CDOLIST" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$SKS = makeUninternedSymbol( "SKS" );
    $sym8$DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS = makeSymbol( "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES-BY-SKS" );
    $sym9$IGNORE = makeSymbol( "IGNORE" );
    $const10$sksDoesNotAllowConjunctiveRemoval = constant_handles.reader_make_constant_shell( makeString( "sksDoesNotAllowConjunctiveRemoval" ) );
    $str11$SKSI_conjunctive_removal_module_f = makeString( "SKSI conjunctive removal module for " );
    $str12$_ = makeString( "." );
    $kw13$MODULE_SUBTYPE = makeKeyword( "MODULE-SUBTYPE" );
    $kw14$SKSI = makeKeyword( "SKSI" );
    $kw15$MODULE_SOURCE = makeKeyword( "MODULE-SOURCE" );
    $kw16$DIRECTION = makeKeyword( "DIRECTION" );
    $kw17$APPLICABILITY_PATTERN = makeKeyword( "APPLICABILITY-PATTERN" );
    $kw18$CALL = makeKeyword( "CALL" );
    $sym19$REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY" );
    $kw20$INPUT = makeKeyword( "INPUT" );
    $kw21$COST_PATTERN = makeKeyword( "COST-PATTERN" );
    $sym22$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COST" );
    $kw23$COMPLETENESS_PATTERN = makeKeyword( "COMPLETENESS-PATTERN" );
    $sym24$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS" );
    $kw25$EXPAND_ITERATIVE_PATTERN = makeKeyword( "EXPAND-ITERATIVE-PATTERN" );
    $sym26$REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-POS-LITS-OUTPUT-GENERATE" );
    $kw27$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME = makeSymbol( "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME" );
    $str29$_ = makeString( "-" );
    $str30$_ = makeString( "_" );
    $str31$REMOVAL_SKSI_ = makeString( "REMOVAL-SKSI-" );
    $str32$_CONJUNCTION_POS_LITS = makeString( "-CONJUNCTION-POS-LITS" );
    $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-APPLICABILITY" );
    $sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST" );
    $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COMPLETENESS" );
    $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE = makeSymbol( "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-OUTPUT-GENERATE" );
    $kw37$EXCLUSIVE = makeKeyword( "EXCLUSIVE" );
    $sym38$TRUE = makeSymbol( "TRUE" );
    $kw39$SUPPLANTS = makeKeyword( "SUPPLANTS" );
    $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC = makeString( "-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS" );
    $kw41$NEG = makeKeyword( "NEG" );
    $list42 = ConsesLow.list( makeSymbol( "THIS-MT" ), makeSymbol( "ASENT" ) );
    $kw43$POS = makeKeyword( "POS" );
    $const44$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $sym45$NEW_POS_SUBCLAUSE_SPEC = makeSymbol( "NEW-POS-SUBCLAUSE-SPEC" );
    $kw46$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw47$ABORT = makeKeyword( "ABORT" );
    $sym48$BINDINGS_EQUAL_ = makeSymbol( "BINDINGS-EQUAL?" );
  }
}
/*
 * 
 * Total time: 258 ms
 * 
 */