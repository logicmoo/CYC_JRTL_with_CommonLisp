package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.pph_question;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.wff;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class quirk_removal_module
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_removal_module";
  public static final String myFingerPrint = "25ddb3acd0c4f176e2d64f9d2dd2dde19ff2124c4f02c6a35ad2294aa161fa38";
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 866L)
  public static SubLSymbol $tmp_results$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 900L)
  public static SubLSymbol $quirk_passages_num$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 940L)
  private static SubLSymbol $secretary_class$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1193L)
  private static SubLSymbol $secretary$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1498L)
  private static SubLSymbol $quirk_guruqa_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1545L)
  private static SubLSymbol $quirk_topic_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1633L)
  private static SubLSymbol $quirk_irrelevant_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1705L)
  private static SubLSymbol $quirk_irrelevant_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 2479L)
  private static SubLSymbol $sksi_enabled_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20285L)
  private static SubLSymbol $connecting_terms_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20517L)
  private static SubLSymbol $ask_qaga_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 22857L)
  private static SubLSymbol $answer_question_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28117L)
  private static SubLSymbol $get_word_graph_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28711L)
  private static SubLSymbol $fully_connected_graph_links_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 29281L)
  private static SubLSymbol $word_graph_links_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 30203L)
  private static SubLSymbol $qaga_link_result_caching_state$;
  private static final SubLInteger $int0$50;
  private static final SubLSymbol $sym1$SECRETARY;
  private static final SubLObject $const2$UIA_OpenEndedConversation_DemoEnv;
  private static final SubLInteger $int3$64;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const6$EverythingPSC;
  private static final SubLObject $const7$meaningSentenceOfSchema;
  private static final SubLString $str8$_______A;
  private static final SubLInteger $int9$100;
  private static final SubLSymbol $sym10$GURUQA_RETRIEVE_PASSAGE;
  private static final SubLString $str11$Not_well_formed___S_because__S;
  private static final SubLSymbol $sym12$TO_STRING;
  private static final SubLSymbol $sym13$RANKED_WEIGHT_LIST;
  private static final SubLSymbol $kw14$SCORE;
  private static final SubLSymbol $sym15$ASK;
  private static final SubLString $str16$______Index___S;
  private static final SubLString $str17$_________________________________;
  private static final SubLString $str18$___S;
  private static final SubLString $str19$___secretary__S_found_bindings__S;
  private static final SubLSymbol $sym20$BINDINGS;
  private static final SubLString $str21$__rejecting___A;
  private static final SubLSymbol $kw22$QUIRK_GURUQA;
  private static final SubLSymbol $kw23$REMOVAL_QUIRK_GURUQA;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLObject $const26$containsInfoStructure_CW;
  private static final SubLObject $const27$TREC_Mt;
  private static final SubLSymbol $kw28$FORWARD;
  private static final SubLSymbol $sym29$_VAR1;
  private static final SubLSymbol $sym30$_VAR2;
  private static final SubLObject $const31$TextStringPropositionalExtraction;
  private static final SubLObject $const32$DependencyParser;
  private static final SubLObject $const33$DependencyParserDefaultSetting;
  private static final SubLObject $const34$DocumentSentenceFn;
  private static final SubLObject $const35$CorpusDocumentFn;
  private static final SubLObject $const36$CNS_Corpus;
  private static final SubLObject $const37$DocumentNumberFn;
  private static final SubLObject $const38$SentenceNumberFn;
  private static final SubLSymbol $kw39$DOC;
  private static final SubLSymbol $kw40$SENT;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$MT_ASSERTS_SENTENCE;
  private static final SubLString $str43$_S_is_not_a_support_p;
  private static final SubLObject $const44$NGA_Gns_KS;
  private static final SubLList $list45;
  private static final SubLObject $const46$Usgs_Gnis_KS;
  private static final SubLList $list47;
  private static final SubLSymbol $kw48$REMOVAL_QUIRK_GURUQA_CONJUCTIVE;
  private static final SubLSymbol $kw49$REMOVAL_QUIRK_GURUQA_CONJUNCTIVE;
  private static final SubLString $str50$QUIRK_enabled_;
  private static final SubLString $str51$QUIRK_disabled_;
  private static final SubLList $list52;
  private static final SubLObject $const53$ActorSlot;
  private static final SubLObject $const54$TaxonomicSlot;
  private static final SubLList $list55;
  private static final SubLObject $const56$isa;
  private static final SubLObject $const57$Event;
  private static final SubLSymbol $sym58$CADR;
  private static final SubLSymbol $sym59$SINGLETON_;
  private static final SubLFloat $float60$0_9;
  private static final SubLString $str61$_______A;
  private static final SubLString $str62$_______A;
  private static final SubLObject $const63$and;
  private static final SubLSymbol $sym64$NUMBERP;
  private static final SubLSymbol $sym65$CONSP;
  private static final SubLSymbol $sym66$_;
  private static final SubLSymbol $sym67$ASK_QAGA_CACHED;
  private static final SubLSymbol $sym68$_ASK_QAGA_CACHED_CACHING_STATE_;
  private static final SubLSymbol $kw69$AUGMENT;
  private static final SubLSymbol $kw70$REMOVAL_CONNECTING_TERMS;
  private static final SubLList $list71;
  private static final SubLObject $const72$InstanceNamedFn;
  private static final SubLSymbol $kw73$DOCID;
  private static final SubLList $list74;
  private static final SubLSymbol $kw75$TEXT;
  private static final SubLSymbol $kw76$QAGA;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$ANSWER_QUESTION;
  private static final SubLSymbol $sym79$ANSWER;
  private static final SubLSymbol $sym80$_ANSWER_QUESTION_CACHING_STATE_;
  private static final SubLSymbol $sym81$GET_CONTENT;
  private static final SubLSymbol $sym82$JUSTIFY;
  private static final SubLSymbol $kw83$REMOVAL_TEXT_ANSWER;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$REMOVAL_QUIRK_CYCLIFY;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$XXXXXXXXXXXXXXXXXXXXXX;
  private static final SubLSymbol $kw89$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym90$IGNORE_ERRORS_HANDLER;
  private static final SubLObject $const91$implies;
  private static final SubLList $list92;
  private static final SubLSymbol $kw93$QUIRK;
  private static final SubLList $list94;
  private static final SubLSymbol $kw95$REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE;
  private static final SubLList $list96;
  private static final SubLSymbol $kw97$NEG;
  private static final SubLList $list98;
  private static final SubLSymbol $kw99$POS;
  private static final SubLString $str100$removal_quirk_conjunctive_expand_;
  private static final SubLSymbol $sym101$GET_WORD_GRAPH_CACHED;
  private static final SubLSymbol $sym102$_GET_WORD_GRAPH_CACHED_CACHING_STATE_;
  private static final SubLObject $const103$conceptuallyRelated;
  private static final SubLObject $const104$WordFn;
  private static final SubLSymbol $sym105$FULLY_CONNECTED_GRAPH_LINKS;
  private static final SubLSymbol $sym106$GET_PATH_LABELS;
  private static final SubLSymbol $sym107$_FULLY_CONNECTED_GRAPH_LINKS_CACHING_STATE_;
  private static final SubLSymbol $sym108$WORD_GRAPH_LINKS;
  private static final SubLSymbol $sym109$_WORD_GRAPH_LINKS_CACHING_STATE_;
  private static final SubLSymbol $kw110$REMOVAL_QAGA_LINK_FOR;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$QAGA_LINK_RESULT;
  private static final SubLSymbol $sym113$_QAGA_LINK_RESULT_CACHING_STATE_;
  private static final SubLSymbol $kw114$REMOVAL_QAGA_LINK_FOR_CURRIED;
  private static final SubLList $list115;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1232L)
  public static SubLObject get_secretary()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $secretary$.getDynamicValue( thread ) )
    {
      $secretary$.setDynamicValue( object.new_class_instance( $secretary_class$.getDynamicValue( thread ) ), thread );
    }
    return $secretary$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 1373L)
  public static SubLObject secretary_class(final SubLObject v_class)
  {
    $secretary_class$.setDynamicValue( v_class );
    $secretary$.setDynamicValue( NIL );
    return get_secretary();
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 2527L)
  public static SubLObject get_sksi_enabled_predicates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $sksi_enabled_predicates$.getDynamicValue( thread ) )
    {
      SubLObject assertions = NIL;
      SubLObject predicates = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const6$EverythingPSC, thread );
        assertions = kb_mapping.gather_predicate_extent_index( $const7$meaningSentenceOfSchema, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      SubLObject cdolist_list_var = assertions;
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject formula = cycl_utilities.formula_arg2( assertions_high.assertion_formula( ass ), UNPROVIDED );
        final SubLObject item_var;
        final SubLObject pred = item_var = cycl_utilities.formula_arg0( formula );
        if( NIL == conses_high.member( item_var, predicates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          predicates = ConsesLow.cons( item_var, predicates );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
      $sksi_enabled_predicates$.setDynamicValue( predicates, thread );
    }
    return $sksi_enabled_predicates$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 2992L)
  public static SubLObject sksi_enabled_predicate_p(final SubLObject pred)
  {
    return conses_high.member( pred, get_sksi_enabled_predicates(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 3094L)
  public static SubLObject quirk_irrelevant_add(final SubLObject cyc_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( cyc_term, $quirk_irrelevant_terms$.getDynamicValue( thread ), T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 3201L)
  public static SubLObject quirk_irrelevant_remove(final SubLObject cyc_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.remhash( cyc_term, $quirk_irrelevant_terms$.getDynamicValue( thread ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 3309L)
  public static SubLObject quirk_irrelevant_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Hashtables.gethash( v_term, $quirk_irrelevant_terms$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    SubLObject irrelevant = NIL;
    if( NIL == irrelevant )
    {
      SubLObject csome_list_var = $quirk_irrelevant_collections$.getGlobalValue();
      SubLObject coll = NIL;
      coll = csome_list_var.first();
      while ( NIL == irrelevant && NIL != csome_list_var)
      {
        if( NIL != isa.isa_in_any_mtP( v_term, coll ) )
        {
          quirk_irrelevant_add( v_term );
          irrelevant = T;
        }
        csome_list_var = csome_list_var.rest();
        coll = csome_list_var.first();
      }
    }
    return irrelevant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 3624L)
  public static SubLObject quirk_relevant_literal(final SubLObject literal)
  {
    SubLObject fail = NIL;
    if( NIL == fail )
    {
      SubLObject csome_list_var = literal;
      SubLObject v_term = NIL;
      v_term = csome_list_var.first();
      while ( NIL == fail && NIL != csome_list_var)
      {
        if( NIL != quirk_irrelevant_term( v_term ) )
        {
          fail = v_term;
        }
        csome_list_var = csome_list_var.rest();
        v_term = csome_list_var.first();
      }
    }
    if( NIL == fail )
    {
      PrintLow.format( T, $str8$_______A, literal );
    }
    return makeBoolean( NIL == fail );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 3963L)
  public static SubLObject removal_quirk_guruqa_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != control_vars.$ask_quirkP$.getDynamicValue( thread ) && NIL != quirk_relevant_literal( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 4115L)
  public static SubLObject removal_quirk_guruqa_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.formula_arg0( asent );
    if( NIL != sksi_enabled_predicate_p( pred ) )
    {
      return Numbers.multiply( $int9$100, $quirk_guruqa_cost$.getDynamicValue( thread ) );
    }
    return $quirk_guruqa_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 4493L)
  public static SubLObject index_retrieve_passage(final SubLObject index)
  {
    return Functions.apply( Symbols.symbol_function( $sym10$GURUQA_RETRIEVE_PASSAGE ), external_interfaces.guruqa_answer_coordinates( index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 4619L)
  public static SubLObject removal_quirk_guruqa_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject well_formed_query = NIL;
    well_formed_query = wff.query_okP( cycl_utilities.hl_to_el( asent ), UNPROVIDED );
    if( NIL == well_formed_query )
    {
      Errors.warn( $str11$Not_well_formed___S_because__S, asent, wff.why_not_wff_ask( cycl_utilities.hl_to_el( asent ), UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject _prev_bind_0 = control_vars.$ask_quirkP$.currentBinding( thread );
    try
    {
      control_vars.$ask_quirkP$.bind( NIL, thread );
      final SubLObject guruqa_query = external_interfaces.compute_guruqa_query( asent );
      final SubLObject guruqa_string = methods.funcall_instance_method_with_0_args( guruqa_query, $sym12$TO_STRING );
      final SubLObject guruqa_ranked_weights = methods.funcall_instance_method_with_0_args( guruqa_query, $sym13$RANKED_WEIGHT_LIST );
      final SubLObject indexes = external_interfaces.guruqa_answer_indexes( guruqa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject top_indices = Sequences.subseq( indexes, ZERO_INTEGER, $quirk_passages_num$.getDynamicValue( thread ) );
      final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      SubLObject cdolist_list_var = top_indices;
      SubLObject ind = NIL;
      ind = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject current;
        final SubLObject datum = current = ind;
        final SubLObject score_tail = cdestructuring_bind.property_list_member( $kw14$SCORE, current );
        final SubLObject score = ( NIL != score_tail ) ? conses_high.cadr( score_tail ) : NIL;
        if( NIL != acceptable_score_for_guruqa_weights( score, guruqa_ranked_weights ) )
        {
          final SubLObject passage = index_retrieve_passage( ind );
          final SubLObject passage_assignments = methods.funcall_instance_method_with_3_args( get_secretary(), $sym15$ASK, asent, passage, mt );
          PrintLow.format( T, $str16$______Index___S, ind );
          PrintLow.format( T, $str17$_________________________________ );
          PrintLow.format( T, $str18$___S, passage );
          PrintLow.format( T, $str17$_________________________________ );
          PrintLow.format( T, $str19$___secretary__S_found_bindings__S, new SubLObject[] { get_secretary(), passage_assignments, mt
          } );
          SubLObject cdolist_list_var_$1 = passage_assignments;
          SubLObject assignment = NIL;
          assignment = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            final SubLObject binding = instances.get_slot( assignment, $sym20$BINDINGS );
            final SubLObject v_answer = conses_high.sublis( binding, asent, UNPROVIDED, UNPROVIDED );
            if( NIL != quirk_relevant_literal( v_answer ) )
            {
              backward.removal_add_node( make_quirk_guruqa_support( v_answer, ind ), binding, UNPROVIDED );
            }
            else
            {
              PrintLow.format( T, $str21$__rejecting___A, v_answer );
            }
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            assignment = cdolist_list_var_$1.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        ind = cdolist_list_var.first();
      }
    }
    finally
    {
      control_vars.$ask_quirkP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 6503L)
  public static SubLObject make_quirk_guruqa_support(final SubLObject support_formula, final SubLObject ind)
  {
    return arguments.make_hl_support( $kw22$QUIRK_GURUQA, support_formula, document_index_mt( ind ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 6914L)
  public static SubLObject hl_justify_quirk_guruqa(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list25 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt2 = narts_high.nart_el_formula( mt );
      final SubLObject passage = Functions.apply( Symbols.symbol_function( $sym10$GURUQA_RETRIEVE_PASSAGE ), document_mt_coordinates( mt2 ) );
      return ConsesLow.list( assertions_high.create_gaf( ConsesLow.list( $const26$containsInfoStructure_CW, list_utilities.cadddr( mt2 ), passage ), $const27$TREC_Mt, $kw28$FORWARD, enumeration_types.tv_truth( tv ),
          enumeration_types.tv_strength( tv ), NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( support, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 7314L)
  public static SubLObject document_mt_coordinates(final SubLObject mt)
  {
    final SubLObject doc_var = variables.hl_var_for_default_el_var( $sym29$_VAR1 );
    final SubLObject sent_var = variables.hl_var_for_default_el_var( $sym30$_VAR2 );
    final SubLObject binding = unification.unify( mt, ConsesLow.list( $const31$TextStringPropositionalExtraction, $const32$DependencyParser, $const33$DependencyParserDefaultSetting, ConsesLow.list(
        $const34$DocumentSentenceFn, ConsesLow.list( $const35$CorpusDocumentFn, $const36$CNS_Corpus, ConsesLow.list( $const37$DocumentNumberFn, doc_var ) ), ConsesLow.list( $const38$SentenceNumberFn, sent_var ) ) ),
        UNPROVIDED, UNPROVIDED );
    final SubLObject doc = conses_high.assoc( doc_var, binding, Symbols.symbol_function( EQUALP ), UNPROVIDED ).rest();
    final SubLObject sent = conses_high.assoc( sent_var, binding, Symbols.symbol_function( EQUALP ), UNPROVIDED ).rest();
    return ConsesLow.list( doc, sent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 7988L)
  public static SubLObject document_index_mt(final SubLObject index)
  {
    final SubLObject doc_tail = cdestructuring_bind.property_list_member( $kw39$DOC, index );
    final SubLObject doc = ( NIL != doc_tail ) ? conses_high.cadr( doc_tail ) : NIL;
    final SubLObject sent_tail = cdestructuring_bind.property_list_member( $kw40$SENT, index );
    final SubLObject sent = ( NIL != sent_tail ) ? conses_high.cadr( sent_tail ) : NIL;
    return czer_main.cyc_find_or_create_nart( ConsesLow.list( $const31$TextStringPropositionalExtraction, $const32$DependencyParser, $const33$DependencyParserDefaultSetting, ConsesLow.list( $const34$DocumentSentenceFn,
        ConsesLow.list( $const35$CorpusDocumentFn, $const36$CNS_Corpus, ConsesLow.list( $const37$DocumentNumberFn, doc ) ), ConsesLow.list( $const38$SentenceNumberFn, sent ) ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 8475L)
  public static SubLObject ask_textually_justified(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject answers = ask_utilities.ask_justified( formula, mt, backchain, number, time, depth );
    SubLObject res = NIL;
    SubLObject cdolist_list_var = answers;
    SubLObject ans = NIL;
    ans = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject resn = NIL;
      SubLObject cdolist_list_var_$2 = ans.rest();
      SubLObject just = NIL;
      just = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        SubLObject resjust = NIL;
        SubLObject cdolist_list_var_$3 = just;
        SubLObject supp = NIL;
        supp = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          if( NIL != arguments.hl_support_p( supp ) )
          {
            if( supp.first() == $kw22$QUIRK_GURUQA )
            {
              resjust = ConsesLow.cons( assertions_high.assertion_formula( hl_supports.hl_justify( supp ).first() ), resjust );
            }
            else
            {
              resjust = ConsesLow.cons( ConsesLow.list( $kw42$MT_ASSERTS_SENTENCE, list_utilities.caddr( supp ), pph_main.generate_phrase( conses_high.cadr( supp ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED, UNPROVIDED, UNPROVIDED ), list_utilities.cadddr( supp ) ), resjust );
            }
          }
          else if( NIL != assertion_handles.assertion_p( supp ) )
          {
            resjust = ConsesLow.cons( ConsesLow.list( $kw42$MT_ASSERTS_SENTENCE, assertions_high.assertion_mt( supp ), pph_main.generate_phrase( supp, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED ), assertions_high.cyc_assertion_tv( supp ) ), resjust );
          }
          else
          {
            Errors.error( $str43$_S_is_not_a_support_p, supp );
          }
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          supp = cdolist_list_var_$3.first();
        }
        resjust = ConsesLow.cons( ans.first(), resjust );
        resn = ConsesLow.cons( resjust, resn );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        just = cdolist_list_var_$2.first();
      }
      res = ConsesLow.cons( resn, res );
      cdolist_list_var = cdolist_list_var.rest();
      ans = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 9433L)
  public static SubLObject register_nima_sks()
  {
    sksi_removal_module_generation.register_sksi_removal_modules_for_sks( $const44$NGA_Gns_KS, narts_high.find_nart( $list45 ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 9815L)
  public static SubLObject register_usgs_sks()
  {
    sksi_removal_module_generation.register_sksi_removal_modules_for_sks( $const46$Usgs_Gnis_KS, narts_high.find_nart( $list47 ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 9996L)
  public static SubLObject enable_quirk()
  {
    control_vars.$ask_quirkP$.setDynamicValue( T );
    inference_modules.undeclare_inference_conjunctive_removal_module( $kw23$REMOVAL_QUIRK_GURUQA );
    inference_modules.undeclare_inference_conjunctive_removal_module( $kw48$REMOVAL_QUIRK_GURUQA_CONJUCTIVE );
    inference_modules.undeclare_inference_conjunctive_removal_module( $kw49$REMOVAL_QUIRK_GURUQA_CONJUNCTIVE );
    PrintLow.format( T, $str50$QUIRK_enabled_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 10582L)
  public static SubLObject disable_quirk()
  {
    sksi_removal_module_generation.deregister_all_sksi_removal_modules();
    control_vars.$ask_quirkP$.setDynamicValue( NIL );
    PrintLow.format( T, $str51$QUIRK_disabled_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 11509L)
  public static SubLObject isa_actor_slotP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return isa.isaP( v_term, $const53$ActorSlot, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 11605L)
  public static SubLObject isa_taxonomic_slotP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return isa.isaP( v_term, $const54$TaxonomicSlot, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 11709L)
  public static SubLObject reconstruct_quirk_state_from_predicate_literal(final SubLObject predicate_literal, final SubLObject var_lit_hash)
  {
    SubLObject state_literals = ConsesLow.list( predicate_literal );
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = predicate_literal.rest();
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$4;
      final SubLObject arg_literals = cdolist_list_var_$4 = Hashtables.gethash( arg, var_lit_hash, UNPROVIDED );
      SubLObject arg_literal = NIL;
      arg_literal = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        if( NIL != isa_taxonomic_slotP( arg_literal.first(), UNPROVIDED ) && NIL != forts.fort_p( conses_high.third( arg_literal ) ) )
        {
          state_literals = ConsesLow.cons( arg_literal, state_literals );
        }
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        arg_literal = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return state_literals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 12166L)
  public static SubLObject compute_quirk_state_groups(final SubLObject contextualized_literals)
  {
    SubLObject state_literals = NIL;
    final SubLObject variable_hash = Hashtables.make_hash_table( FOUR_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject state_groups = NIL;
    SubLObject cdolist_list_var = contextualized_literals;
    SubLObject ctx_literal = NIL;
    ctx_literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = ctx_literal;
      SubLObject mt = NIL;
      SubLObject literal = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
      literal = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pred = literal.first();
        final SubLObject args = literal.rest();
        if( NIL == isa_taxonomic_slotP( pred, mt ) && NIL == isa_actor_slotP( pred, mt ) && NIL == cycl_variables.hl_varP( pred ) && NIL == cycl_variables.el_varP( pred ) )
        {
          state_literals = ConsesLow.cons( literal, state_literals );
        }
        SubLObject cdolist_list_var_$5 = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          if( NIL != cycl_variables.hl_varP( arg ) || NIL != cycl_variables.el_varP( arg ) )
          {
            Hashtables.sethash( arg, variable_hash, ConsesLow.cons( literal, Hashtables.gethash( arg, variable_hash, UNPROVIDED ) ) );
          }
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          arg = cdolist_list_var_$5.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ctx_literal = cdolist_list_var.first();
    }
    cdolist_list_var = state_literals;
    SubLObject state_literal = NIL;
    state_literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject group = reconstruct_quirk_state_from_predicate_literal( state_literal, variable_hash );
      if( NIL != group )
      {
        state_groups = ConsesLow.cons( group, state_groups );
      }
      cdolist_list_var = cdolist_list_var.rest();
      state_literal = cdolist_list_var.first();
    }
    return state_groups;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 13362L)
  public static SubLObject reconstruct_quirk_event_from_variable(final SubLObject variable, final SubLObject var_lit_hash)
  {
    final SubLObject variable_literals = Hashtables.gethash( variable, var_lit_hash, UNPROVIDED );
    SubLObject actor_variables = NIL;
    SubLObject event_literals = NIL;
    SubLObject cdolist_list_var = variable_literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( literal.first().eql( $const56$isa ) && NIL != genls.genl_in_any_mtP( conses_high.third( literal ), $const57$Event ) )
      {
        event_literals = ConsesLow.cons( literal, event_literals );
      }
      else if( NIL != isa_actor_slotP( literal.first(), UNPROVIDED ) && variable.eql( conses_high.second( literal ) ) )
      {
        final SubLObject actor = conses_high.second( literal );
        if( NIL != cycl_variables.hl_varP( actor ) || NIL != cycl_variables.el_varP( actor ) )
        {
          actor_variables = ConsesLow.cons( actor, actor_variables );
        }
        final SubLObject item_var = literal;
        if( NIL == conses_high.member( item_var, event_literals, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
        {
          event_literals = ConsesLow.cons( item_var, event_literals );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    cdolist_list_var = actor_variables;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$6;
      final SubLObject actor_variable_literals = cdolist_list_var_$6 = Hashtables.gethash( var, var_lit_hash, UNPROVIDED );
      SubLObject literal2 = NIL;
      literal2 = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        if( literal2.first().eql( $const56$isa ) && NIL != forts.fort_p( conses_high.third( literal2 ) ) )
        {
          final SubLObject item_var2 = literal2;
          if( NIL == conses_high.member( item_var2, event_literals, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
          {
            event_literals = ConsesLow.cons( item_var2, event_literals );
          }
        }
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        literal2 = cdolist_list_var_$6.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return event_literals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 14272L)
  public static SubLObject compute_quirk_event_groups(final SubLObject contextualized_literals)
  {
    SubLObject event_variables = NIL;
    SubLObject event_groups = NIL;
    SubLObject decontextualized_literals = NIL;
    final SubLObject variable_hash = Hashtables.make_hash_table( FOUR_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = contextualized_literals;
    SubLObject ctx_literal = NIL;
    ctx_literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = ctx_literal;
      SubLObject mt = NIL;
      SubLObject literal = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
      literal = current.first();
      current = current.rest();
      if( NIL == current )
      {
        decontextualized_literals = ConsesLow.cons( literal, decontextualized_literals );
        SubLObject cdolist_list_var_$7 = literal;
        SubLObject arg = NIL;
        arg = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          if( NIL != cycl_variables.hl_varP( arg ) || NIL != cycl_variables.el_varP( arg ) )
          {
            final SubLObject item_var = literal;
            if( NIL == conses_high.member( item_var, Hashtables.gethash( arg, variable_hash, UNPROVIDED ), Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
            {
              Hashtables.sethash( arg, variable_hash, ConsesLow.cons( item_var, Hashtables.gethash( arg, variable_hash, UNPROVIDED ) ) );
            }
          }
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          arg = cdolist_list_var_$7.first();
        }
        if( literal.first().eql( $const56$isa ) && NIL != term.el_fort_p( conses_high.third( literal ) ) && NIL != genls.genl_in_any_mtP( conses_high.third( literal ), $const57$Event ) )
        {
          final SubLObject item_var2 = conses_high.second( literal );
          if( NIL == conses_high.member( item_var2, event_variables, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
          {
            event_variables = ConsesLow.cons( item_var2, event_variables );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ctx_literal = cdolist_list_var.first();
    }
    cdolist_list_var = event_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject group = reconstruct_quirk_event_from_variable( variable, variable_hash );
      if( NIL != group )
      {
        event_groups = ConsesLow.cons( group, event_groups );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return event_groups;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 15441L)
  public static SubLObject compute_quirk_groups(final SubLObject contextualized_literals)
  {
    final SubLObject state_groups = compute_quirk_state_groups( contextualized_literals );
    final SubLObject event_groups = compute_quirk_event_groups( contextualized_literals );
    return ConsesLow.append( state_groups, event_groups );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 15955L)
  public static SubLObject build_subclause_specs_from_groups(final SubLObject groups, final SubLObject literals)
  {
    SubLObject subclause_specs = NIL;
    SubLObject cdolist_list_var = groups;
    SubLObject group = NIL;
    group = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject neglit_indices = NIL;
      SubLObject poslit_indices = NIL;
      SubLObject subclause_spec = NIL;
      SubLObject cdolist_list_var_$8 = group;
      SubLObject literal = NIL;
      literal = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        final SubLObject literal_index = Sequences.position( literal, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        poslit_indices = ConsesLow.cons( literal_index, poslit_indices );
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        literal = cdolist_list_var_$8.first();
      }
      subclause_spec = ConsesLow.list( neglit_indices, poslit_indices );
      subclause_specs = ConsesLow.cons( subclause_spec, subclause_specs );
      cdolist_list_var = cdolist_list_var.rest();
      group = cdolist_list_var.first();
    }
    return subclause_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 16801L)
  public static SubLObject removal_quirk_guruqa_conjunctive_applicability(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$ask_quirkP$.getDynamicValue( thread ) )
    {
      final SubLObject contextualized_literals = conses_high.cadr( contextualized_dnf_clause );
      final SubLObject literals = Mapping.mapcar( Symbols.symbol_function( $sym58$CADR ), contextualized_literals );
      final SubLObject groups = Sequences.remove_if( Symbols.symbol_function( $sym59$SINGLETON_ ), compute_quirk_groups( contextualized_literals ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return build_subclause_specs_from_groups( groups, literals );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 17212L)
  public static SubLObject removal_quirk_guruqa_conjunctive_cost(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.multiply( $quirk_guruqa_cost$.getDynamicValue( thread ), $float60$0_9 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 17368L)
  public static SubLObject map_make_quirk_guruqa_support(final SubLObject clause, final SubLObject ind)
  {
    SubLObject res = NIL;
    SubLObject cdolist_list_var = clause;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      res = ConsesLow.cons( ConsesLow.list( make_quirk_guruqa_support( lit, ind ) ), res );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return Sequences.nreverse( res );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 17569L)
  public static SubLObject removal_quirk_guruqa_conjunctive_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = control_vars.$ask_quirkP$.currentBinding( thread );
    try
    {
      control_vars.$ask_quirkP$.bind( NIL, thread );
      final SubLObject asent = Mapping.mapcar( Symbols.symbol_function( $sym58$CADR ), conses_high.cadr( contextualized_dnf_clause ) );
      final SubLObject guruqa_query = external_interfaces.compute_guruqa_query( asent );
      final SubLObject guruqa_string = methods.funcall_instance_method_with_0_args( guruqa_query, $sym12$TO_STRING );
      final SubLObject guruqa_ranked_weights = methods.funcall_instance_method_with_0_args( guruqa_query, $sym13$RANKED_WEIGHT_LIST );
      final SubLObject indexes = external_interfaces.guruqa_answer_indexes( guruqa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject top_indices = Sequences.subseq( indexes, ZERO_INTEGER, $quirk_passages_num$.getDynamicValue( thread ) );
      final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      SubLObject well_formed_query = NIL;
      PrintLow.format( T, $str61$_______A, asent );
      PrintLow.format( T, $str62$_______A, pph_question.generate_question( asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const6$EverythingPSC, thread );
        well_formed_query = wff.query_okP( cycl_utilities.hl_to_el( ConsesLow.cons( $const63$and, asent ) ), UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$9, thread );
      }
      if( NIL != well_formed_query )
      {
        SubLObject cdolist_list_var = top_indices;
        SubLObject ind = NIL;
        ind = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject current;
          final SubLObject datum = current = ind;
          final SubLObject score_tail = cdestructuring_bind.property_list_member( $kw14$SCORE, current );
          final SubLObject score = ( NIL != score_tail ) ? conses_high.cadr( score_tail ) : NIL;
          if( NIL != acceptable_score_for_guruqa_weights( score, guruqa_ranked_weights ) )
          {
            final SubLObject passage = index_retrieve_passage( ind );
            final SubLObject passage_assignments = methods.funcall_instance_method_with_3_args( get_secretary(), $sym15$ASK, ConsesLow.cons( $const63$and, asent ), passage, mt );
            PrintLow.format( T, $str16$______Index___S, ind );
            PrintLow.format( T, $str17$_________________________________ );
            PrintLow.format( T, $str18$___S, passage );
            PrintLow.format( T, $str17$_________________________________ );
            PrintLow.format( T, $str19$___secretary__S_found_bindings__S, new SubLObject[] { get_secretary(), passage_assignments, mt
            } );
            SubLObject cdolist_list_var_$10 = passage_assignments;
            SubLObject assignment = NIL;
            assignment = cdolist_list_var_$10.first();
            while ( NIL != cdolist_list_var_$10)
            {
              final SubLObject binding = instances.get_slot( assignment, $sym20$BINDINGS );
              final SubLObject v_answer = conses_high.sublis( binding, asent, UNPROVIDED, UNPROVIDED );
              inference_worker_removal.conjunctive_removal_callback( binding, map_make_quirk_guruqa_support( v_answer, ind ) );
              cdolist_list_var_$10 = cdolist_list_var_$10.rest();
              assignment = cdolist_list_var_$10.first();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          ind = cdolist_list_var.first();
        }
      }
      else
      {
        Errors.warn( $str11$Not_well_formed___S_because__S, ConsesLow.cons( $const63$and, asent ), wff.why_not_wff_ask( cycl_utilities.hl_to_el( ConsesLow.cons( $const63$and, asent ) ), UNPROVIDED, UNPROVIDED ) );
      }
    }
    finally
    {
      control_vars.$ask_quirkP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 19507L)
  public static SubLObject acceptable_score_for_guruqa_weights(final SubLObject score, final SubLObject guruqa_ranked_weights)
  {
    assert NIL != Types.numberp( score ) : score;
    assert NIL != Types.consp( guruqa_ranked_weights ) : guruqa_ranked_weights;
    final SubLObject len = Sequences.length( guruqa_ranked_weights );
    final SubLObject significant_weights = list_utilities.first_n( Numbers.ceiling( Numbers.divide( len, TWO_INTEGER ), UNPROVIDED ), guruqa_ranked_weights );
    final SubLObject grace_score = Functions.apply( Symbols.symbol_function( $sym66$_ ), significant_weights );
    return Numbers.numGE( score, grace_score );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20517L)
  public static SubLObject clear_ask_qaga_cached()
  {
    final SubLObject cs = $ask_qaga_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20517L)
  public static SubLObject remove_ask_qaga_cached(final SubLObject query)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $ask_qaga_cached_caching_state$.getGlobalValue(), ConsesLow.list( query ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20517L)
  public static SubLObject ask_qaga_cached_internal(final SubLObject query)
  {
    return external_interfaces.ask_qaga( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20517L)
  public static SubLObject ask_qaga_cached(final SubLObject query)
  {
    SubLObject caching_state = $ask_qaga_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym67$ASK_QAGA_CACHED, $sym68$_ASK_QAGA_CACHED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, query, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ask_qaga_cached_internal( query ) ) );
      memoization_state.caching_state_put( caching_state, query, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20603L)
  public static SubLObject removal_connecting_terms_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $connecting_terms_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 20742L)
  public static SubLObject connecting_terms(final SubLObject args)
  {
    return conses_high.getf( ask_qaga_cached( args ).first(), $kw69$AUGMENT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 22228L)
  public static SubLObject hl_justify_qaga(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list25 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject answers = ask_qaga_cached( ConsesLow.list( pph_main.generate_phrase( cycl_utilities.formula_arg1( literal, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), pph_main.generate_phrase( cycl_utilities.formula_arg2( literal, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      SubLObject res = NIL;
      SubLObject cdolist_list_var = answers;
      SubLObject ans = NIL;
      ans = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        res = ConsesLow.cons( assertions_high.create_gaf( ConsesLow.list( $const26$containsInfoStructure_CW, ConsesLow.listS( $const72$InstanceNamedFn, conses_high.getf( ans, $kw73$DOCID, UNPROVIDED ), $list74 ),
            conses_high.getf( ans, $kw75$TEXT, UNPROVIDED ) ), mt, $kw28$FORWARD, enumeration_types.tv_truth( tv ), enumeration_types.tv_strength( tv ), NIL ), res );
        cdolist_list_var = cdolist_list_var.rest();
        ans = cdolist_list_var.first();
      }
      return Sequences.reverse( res );
    }
    cdestructuring_bind.cdestructuring_bind_error( support, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 22857L)
  public static SubLObject clear_answer_question()
  {
    final SubLObject cs = $answer_question_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 22857L)
  public static SubLObject remove_answer_question(final SubLObject line)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $answer_question_caching_state$.getGlobalValue(), ConsesLow.list( line ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 22857L)
  public static SubLObject answer_question_internal(final SubLObject line)
  {
    final SubLObject q = question.new_question( line, UNPROVIDED, UNPROVIDED );
    return methods.funcall_instance_method_with_0_args( q, $sym79$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 22857L)
  public static SubLObject answer_question(final SubLObject line)
  {
    SubLObject caching_state = $answer_question_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym78$ANSWER_QUESTION, $sym80$_ANSWER_QUESTION_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, line, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( answer_question_internal( line ) ) );
      memoization_state.caching_state_put( caching_state, line, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 23155L)
  public static SubLObject answer_text(final SubLObject v_answer)
  {
    return methods.funcall_instance_method_with_0_args( v_answer, $sym81$GET_CONTENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 23251L)
  public static SubLObject answer_justification_text(final SubLObject v_answer)
  {
    final SubLObject j = methods.funcall_instance_method_with_0_args( v_answer, $sym82$JUSTIFY );
    return methods.funcall_instance_method_with_0_args( j, $sym81$GET_CONTENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 24070L)
  public static SubLObject hl_justify_text(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list25 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject answers = answer_question( pph_question.generate_question( cycl_utilities.formula_arg1( literal, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject res = NIL;
      SubLObject cdolist_list_var = answers;
      SubLObject ans = NIL;
      ans = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( answer_text( ans ).equal( cycl_utilities.formula_arg2( literal, UNPROVIDED ) ) )
        {
          res = ConsesLow.cons( assertions_high.create_gaf( ConsesLow.list( $const26$containsInfoStructure_CW, ConsesLow.listS( $const72$InstanceNamedFn, methods.funcall_instance_method_with_0_args( ans,
              $sym82$JUSTIFY ), $list74 ), answer_text( ans ) ), mt, $kw28$FORWARD, enumeration_types.tv_truth( tv ), enumeration_types.tv_strength( tv ), NIL ), res );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ans = cdolist_list_var.first();
      }
      return Sequences.reverse( res );
    }
    cdestructuring_bind.cdestructuring_bind_error( support, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 25087L)
  public static SubLObject removal_quirk_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = control_vars.$ask_quirkP$.currentBinding( thread );
    try
    {
      control_vars.$ask_quirkP$.bind( NIL, thread );
      final SubLObject closed_asent = parse_tree.quantify_existentially( asent, UNPROVIDED );
      final SubLObject question_string = pph_question.generate_question( closed_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject answers = answer_question( question_string );
      final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      SubLObject cdolist_list_var = answers;
      SubLObject v_answer = NIL;
      v_answer = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        print_high.print( $sym88$XXXXXXXXXXXXXXXXXXXXXX, UNPROVIDED );
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw89$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym90$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              SubLObject cdolist_list_var_$12;
              final SubLObject parses = cdolist_list_var_$12 = cyclifier.cyclify( answer_justification_text( v_answer ), UNPROVIDED );
              SubLObject parse = NIL;
              parse = cdolist_list_var_$12.first();
              while ( NIL != cdolist_list_var_$12)
              {
                SubLObject cdolist_list_var_$13;
                final SubLObject v_bindings = cdolist_list_var_$13 = inference_kernel.new_cyc_query( ConsesLow.list( $const91$implies, parse, asent ), mt, $list92 );
                SubLObject binding = NIL;
                binding = cdolist_list_var_$13.first();
                while ( NIL != cdolist_list_var_$13)
                {
                  final SubLObject ans = conses_high.sublis( binding, asent, UNPROVIDED, UNPROVIDED );
                  if( NIL != quirk_relevant_literal( ans ) )
                  {
                    backward.removal_add_node( make_quirk_support( ans ), binding, UNPROVIDED );
                  }
                  else
                  {
                    PrintLow.format( T, $str21$__rejecting___A, v_answer );
                  }
                  cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                  binding = cdolist_list_var_$13.first();
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                parse = cdolist_list_var_$12.first();
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$11, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw89$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_answer = cdolist_list_var.first();
      }
    }
    finally
    {
      control_vars.$ask_quirkP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 25886L)
  public static SubLObject make_quirk_support(final SubLObject ans)
  {
    return arguments.make_hl_support( $kw93$QUIRK, ans, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 25966L)
  public static SubLObject hl_justify_quirk(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list25 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list25 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject answers = answer_question( pph_question.generate_question( parse_tree.quantify_existentially( literal, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject res = NIL;
      SubLObject cdolist_list_var = answers;
      SubLObject ans = NIL;
      ans = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( answer_text( ans ).equal( cycl_utilities.formula_arg2( literal, UNPROVIDED ) ) )
        {
          res = ConsesLow.cons( assertions_high.create_gaf( ConsesLow.list( $const26$containsInfoStructure_CW, ConsesLow.listS( $const72$InstanceNamedFn, methods.funcall_instance_method_with_0_args( ans,
              $sym82$JUSTIFY ), $list74 ), answer_text( ans ) ), mt, $kw28$FORWARD, enumeration_types.tv_truth( tv ), enumeration_types.tv_strength( tv ), NIL ), res );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ans = cdolist_list_var.first();
      }
      return Sequences.reverse( res );
    }
    cdestructuring_bind.cdestructuring_bind_error( support, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 27289L)
  public static SubLObject removal_quirk_conjunctive_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject conjunction_mt = NIL;
    SubLObject asents = NIL;
    SubLObject sense = $kw97$NEG;
    SubLObject index_var = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( $kw99$POS == sense )
        {
          asents = ConsesLow.cons( asent, asents );
          if( NIL == conjunction_mt )
          {
            conjunction_mt = mt;
          }
          else if( NIL == hlmt.hlmt_equalP( mt, conjunction_mt ) )
          {
            Errors.error( $str100$removal_quirk_conjunctive_expand_ );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    sense = $kw99$POS;
    index_var = ZERO_INTEGER;
    cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( $kw99$POS == sense )
        {
          asents = ConsesLow.cons( asent, asents );
          if( NIL == conjunction_mt )
          {
            conjunction_mt = mt;
          }
          else if( NIL == hlmt.hlmt_equalP( mt, conjunction_mt ) )
          {
            Errors.error( $str100$removal_quirk_conjunctive_expand_ );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
      }
      index_var = Numbers.add( index_var, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( conjunction_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject sentence = simplifier.conjoin( asents, UNPROVIDED );
      removal_quirk_expand( sentence, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28117L)
  public static SubLObject clear_get_word_graph_cached()
  {
    final SubLObject cs = $get_word_graph_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28117L)
  public static SubLObject remove_get_word_graph_cached(final SubLObject query)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_word_graph_cached_caching_state$.getGlobalValue(), ConsesLow.list( query ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28117L)
  public static SubLObject get_word_graph_cached_internal(final SubLObject query)
  {
    return external_interfaces.get_word_graph( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28117L)
  public static SubLObject get_word_graph_cached(final SubLObject query)
  {
    SubLObject caching_state = $get_word_graph_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym101$GET_WORD_GRAPH_CACHED, $sym102$_GET_WORD_GRAPH_CACHED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, query, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_word_graph_cached_internal( query ) ) );
      memoization_state.caching_state_put( caching_state, query, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28394L)
  public static SubLObject assert_word_graph(final SubLObject query, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const27$TREC_Mt;
    }
    SubLObject cdolist_list_var;
    final SubLObject v_graph = cdolist_list_var = get_word_graph_cached( query );
    SubLObject nodes = NIL;
    nodes = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node1 = nodes.first();
      SubLObject cdolist_list_var_$14 = nodes.rest();
      SubLObject node2 = NIL;
      node2 = cdolist_list_var_$14.first();
      while ( NIL != cdolist_list_var_$14)
      {
        fi.fi_assert( ConsesLow.list( $const103$conceptuallyRelated, ConsesLow.list( $const104$WordFn, node1 ), ConsesLow.list( $const104$WordFn, node2 ) ), mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
        node2 = cdolist_list_var_$14.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      nodes = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28711L)
  public static SubLObject clear_fully_connected_graph_links()
  {
    final SubLObject cs = $fully_connected_graph_links_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28711L)
  public static SubLObject remove_fully_connected_graph_links(final SubLObject query_terms)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $fully_connected_graph_links_caching_state$.getGlobalValue(), ConsesLow.list( query_terms ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28711L)
  public static SubLObject fully_connected_graph_links_internal(final SubLObject query_terms)
  {
    final SubLObject string_lists = external_interfaces.get_word_graph( query_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject graph_object = graph.make_graph_from_string_lists( string_lists );
    final SubLObject connecting_terms = methods.funcall_instance_method_with_1_args( graph_object, $sym106$GET_PATH_LABELS, query_terms );
    final SubLObject filter = conses_high.union( connecting_terms, query_terms, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = string_lists;
    SubLObject nodes = NIL;
    nodes = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject out_node = nodes.first();
      if( NIL != subl_promotions.memberP( out_node, filter, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$15 = nodes.rest();
        SubLObject in_node = NIL;
        in_node = cdolist_list_var_$15.first();
        while ( NIL != cdolist_list_var_$15)
        {
          if( NIL != subl_promotions.memberP( in_node, filter, UNPROVIDED, UNPROVIDED ) )
          {
            result = ConsesLow.cons( ConsesLow.list( out_node, in_node ), result );
          }
          cdolist_list_var_$15 = cdolist_list_var_$15.rest();
          in_node = cdolist_list_var_$15.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      nodes = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 28711L)
  public static SubLObject fully_connected_graph_links(final SubLObject query_terms)
  {
    SubLObject caching_state = $fully_connected_graph_links_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym105$FULLY_CONNECTED_GRAPH_LINKS, $sym107$_FULLY_CONNECTED_GRAPH_LINKS_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, query_terms, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( fully_connected_graph_links_internal( query_terms ) ) );
      memoization_state.caching_state_put( caching_state, query_terms, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 29281L)
  public static SubLObject clear_word_graph_links()
  {
    final SubLObject cs = $word_graph_links_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 29281L)
  public static SubLObject remove_word_graph_links(final SubLObject query)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $word_graph_links_caching_state$.getGlobalValue(), ConsesLow.list( query ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 29281L)
  public static SubLObject word_graph_links_internal(final SubLObject query)
  {
    final SubLObject v_graph = external_interfaces.get_word_graph( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject res = NIL;
    SubLObject cdolist_list_var = v_graph;
    SubLObject nodes = NIL;
    nodes = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node1 = nodes.first();
      SubLObject cdolist_list_var_$16 = nodes.rest();
      SubLObject node2 = NIL;
      node2 = cdolist_list_var_$16.first();
      while ( NIL != cdolist_list_var_$16)
      {
        res = ConsesLow.cons( ConsesLow.list( node1, node2 ), res );
        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
        node2 = cdolist_list_var_$16.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      nodes = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 29281L)
  public static SubLObject word_graph_links(final SubLObject query)
  {
    SubLObject caching_state = $word_graph_links_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym108$WORD_GRAPH_LINKS, $sym109$_WORD_GRAPH_LINKS_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, query, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( word_graph_links_internal( query ) ) );
      memoization_state.caching_state_put( caching_state, query, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 30203L)
  public static SubLObject clear_qaga_link_result()
  {
    final SubLObject cs = $qaga_link_result_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 30203L)
  public static SubLObject remove_qaga_link_result(final SubLObject result)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $qaga_link_result_caching_state$.getGlobalValue(), ConsesLow.list( result ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 30203L)
  public static SubLObject qaga_link_result_internal(final SubLObject result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    fi.fi_assert( result, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-removal-module.lisp", position = 30203L)
  public static SubLObject qaga_link_result(final SubLObject result)
  {
    SubLObject caching_state = $qaga_link_result_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym112$QAGA_LINK_RESULT, $sym113$_QAGA_LINK_RESULT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, result, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( qaga_link_result_internal( result ) ) );
      memoization_state.caching_state_put( caching_state, result, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_quirk_removal_module_file()
  {
    SubLFiles.declareFunction( me, "get_secretary", "GET-SECRETARY", 0, 0, false );
    SubLFiles.declareFunction( me, "secretary_class", "SECRETARY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sksi_enabled_predicates", "GET-SKSI-ENABLED-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_enabled_predicate_p", "SKSI-ENABLED-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quirk_irrelevant_add", "QUIRK-IRRELEVANT-ADD", 1, 0, false );
    SubLFiles.declareFunction( me, "quirk_irrelevant_remove", "QUIRK-IRRELEVANT-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "quirk_irrelevant_term", "QUIRK-IRRELEVANT-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "quirk_relevant_literal", "QUIRK-RELEVANT-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quirk_guruqa_required", "REMOVAL-QUIRK-GURUQA-REQUIRED", 1, 1, false );
    new $removal_quirk_guruqa_required$UnaryFunction();
    new $removal_quirk_guruqa_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_quirk_guruqa_cost", "REMOVAL-QUIRK-GURUQA-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "index_retrieve_passage", "INDEX-RETRIEVE-PASSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quirk_guruqa_expand", "REMOVAL-QUIRK-GURUQA-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_quirk_guruqa_support", "MAKE-QUIRK-GURUQA-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_quirk_guruqa", "HL-JUSTIFY-QUIRK-GURUQA", 1, 0, false );
    SubLFiles.declareFunction( me, "document_mt_coordinates", "DOCUMENT-MT-COORDINATES", 1, 0, false );
    SubLFiles.declareFunction( me, "document_index_mt", "DOCUMENT-INDEX-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "ask_textually_justified", "ASK-TEXTUALLY-JUSTIFIED", 1, 5, false );
    SubLFiles.declareFunction( me, "register_nima_sks", "REGISTER-NIMA-SKS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_usgs_sks", "REGISTER-USGS-SKS", 0, 0, false );
    SubLFiles.declareFunction( me, "enable_quirk", "ENABLE-QUIRK", 0, 0, false );
    SubLFiles.declareFunction( me, "disable_quirk", "DISABLE-QUIRK", 0, 0, false );
    SubLFiles.declareFunction( me, "isa_actor_slotP", "ISA-ACTOR-SLOT?", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_taxonomic_slotP", "ISA-TAXONOMIC-SLOT?", 1, 1, false );
    SubLFiles.declareFunction( me, "reconstruct_quirk_state_from_predicate_literal", "RECONSTRUCT-QUIRK-STATE-FROM-PREDICATE-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_quirk_state_groups", "COMPUTE-QUIRK-STATE-GROUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "reconstruct_quirk_event_from_variable", "RECONSTRUCT-QUIRK-EVENT-FROM-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_quirk_event_groups", "COMPUTE-QUIRK-EVENT-GROUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_quirk_groups", "COMPUTE-QUIRK-GROUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "build_subclause_specs_from_groups", "BUILD-SUBCLAUSE-SPECS-FROM-GROUPS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_quirk_guruqa_conjunctive_applicability", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY", 1, 0, false );
    new $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_quirk_guruqa_conjunctive_cost", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "map_make_quirk_guruqa_support", "MAP-MAKE-QUIRK-GURUQA-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_quirk_guruqa_conjunctive_expand", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "acceptable_score_for_guruqa_weights", "ACCEPTABLE-SCORE-FOR-GURUQA-WEIGHTS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_ask_qaga_cached", "CLEAR-ASK-QAGA-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ask_qaga_cached", "REMOVE-ASK-QAGA-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "ask_qaga_cached_internal", "ASK-QAGA-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ask_qaga_cached", "ASK-QAGA-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_connecting_terms_cost", "REMOVAL-CONNECTING-TERMS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "connecting_terms", "CONNECTING-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_qaga", "HL-JUSTIFY-QAGA", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_answer_question", "CLEAR-ANSWER-QUESTION", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_answer_question", "REMOVE-ANSWER-QUESTION", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_question_internal", "ANSWER-QUESTION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_question", "ANSWER-QUESTION", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_text", "ANSWER-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_justification_text", "ANSWER-JUSTIFICATION-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_text", "HL-JUSTIFY-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quirk_expand", "REMOVAL-QUIRK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_quirk_support", "MAKE-QUIRK-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_quirk", "HL-JUSTIFY-QUIRK", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quirk_conjunctive_expand", "REMOVAL-QUIRK-CONJUNCTIVE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_word_graph_cached", "CLEAR-GET-WORD-GRAPH-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_word_graph_cached", "REMOVE-GET-WORD-GRAPH-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_word_graph_cached_internal", "GET-WORD-GRAPH-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_word_graph_cached", "GET-WORD-GRAPH-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_word_graph", "ASSERT-WORD-GRAPH", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_fully_connected_graph_links", "CLEAR-FULLY-CONNECTED-GRAPH-LINKS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_fully_connected_graph_links", "REMOVE-FULLY-CONNECTED-GRAPH-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "fully_connected_graph_links_internal", "FULLY-CONNECTED-GRAPH-LINKS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fully_connected_graph_links", "FULLY-CONNECTED-GRAPH-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_word_graph_links", "CLEAR-WORD-GRAPH-LINKS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_word_graph_links", "REMOVE-WORD-GRAPH-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "word_graph_links_internal", "WORD-GRAPH-LINKS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "word_graph_links", "WORD-GRAPH-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_qaga_link_result", "CLEAR-QAGA-LINK-RESULT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_qaga_link_result", "REMOVE-QAGA-LINK-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "qaga_link_result_internal", "QAGA-LINK-RESULT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "qaga_link_result", "QAGA-LINK-RESULT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_quirk_removal_module_file()
  {
    $tmp_results$ = SubLFiles.defparameter( "*TMP-RESULTS*", NIL );
    $quirk_passages_num$ = SubLFiles.defparameter( "*QUIRK-PASSAGES-NUM*", $int0$50 );
    $secretary_class$ = SubLFiles.defparameter( "*SECRETARY-CLASS*", $sym1$SECRETARY );
    $secretary$ = SubLFiles.defparameter( "*SECRETARY*", NIL );
    $quirk_guruqa_cost$ = SubLFiles.defparameter( "*QUIRK-GURUQA-COST*", TEN_INTEGER );
    $quirk_topic_mt$ = SubLFiles.defparameter( "*QUIRK-TOPIC-MT*", $const2$UIA_OpenEndedConversation_DemoEnv );
    $quirk_irrelevant_terms$ = SubLFiles.defvar( "*QUIRK-IRRELEVANT-TERMS*", Hashtables.make_hash_table( $int3$64, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $quirk_irrelevant_collections$ = SubLFiles.defconstant( "*QUIRK-IRRELEVANT-COLLECTIONS*", $list4 );
    $sksi_enabled_predicates$ = SubLFiles.defvar( "*SKSI-ENABLED-PREDICATES*", NIL );
    $connecting_terms_cost$ = SubLFiles.defparameter( "*CONNECTING-TERMS-COST*", TEN_INTEGER );
    $ask_qaga_cached_caching_state$ = SubLFiles.deflexical( "*ASK-QAGA-CACHED-CACHING-STATE*", NIL );
    $answer_question_caching_state$ = SubLFiles.deflexical( "*ANSWER-QUESTION-CACHING-STATE*", NIL );
    $get_word_graph_cached_caching_state$ = SubLFiles.deflexical( "*GET-WORD-GRAPH-CACHED-CACHING-STATE*", NIL );
    $fully_connected_graph_links_caching_state$ = SubLFiles.deflexical( "*FULLY-CONNECTED-GRAPH-LINKS-CACHING-STATE*", NIL );
    $word_graph_links_caching_state$ = SubLFiles.deflexical( "*WORD-GRAPH-LINKS-CACHING-STATE*", NIL );
    $qaga_link_result_caching_state$ = SubLFiles.deflexical( "*QAGA-LINK-RESULT-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_quirk_removal_module_file()
  {
    inference_modules.inference_removal_module( $kw23$REMOVAL_QUIRK_GURUQA, $list24 );
    hl_supports.setup_hl_support_module( $kw22$QUIRK_GURUQA, $list41 );
    inference_modules.inference_conjunctive_removal_module( $kw49$REMOVAL_QUIRK_GURUQA_CONJUNCTIVE, $list52 );
    memoization_state.note_globally_cached_function( $sym67$ASK_QAGA_CACHED );
    inference_modules.inference_removal_module( $kw70$REMOVAL_CONNECTING_TERMS, $list71 );
    hl_supports.setup_hl_support_module( $kw76$QAGA, $list77 );
    memoization_state.note_globally_cached_function( $sym78$ANSWER_QUESTION );
    inference_modules.inference_removal_module( $kw83$REMOVAL_TEXT_ANSWER, $list84 );
    hl_supports.setup_hl_support_module( $kw75$TEXT, $list85 );
    inference_modules.inference_removal_module( $kw86$REMOVAL_QUIRK_CYCLIFY, $list87 );
    hl_supports.setup_hl_support_module( $kw93$QUIRK, $list94 );
    inference_modules.inference_conjunctive_removal_module( $kw95$REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE, $list96 );
    memoization_state.note_globally_cached_function( $sym101$GET_WORD_GRAPH_CACHED );
    memoization_state.note_globally_cached_function( $sym105$FULLY_CONNECTED_GRAPH_LINKS );
    memoization_state.note_globally_cached_function( $sym108$WORD_GRAPH_LINKS );
    inference_modules.inference_removal_module( $kw110$REMOVAL_QAGA_LINK_FOR, $list111 );
    memoization_state.note_globally_cached_function( $sym112$QAGA_LINK_RESULT );
    inference_modules.inference_removal_module( $kw114$REMOVAL_QAGA_LINK_FOR_CURRIED, $list115 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_quirk_removal_module_file();
  }

  @Override
  public void initializeVariables()
  {
    init_quirk_removal_module_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_quirk_removal_module_file();
  }
  static
  {
    me = new quirk_removal_module();
    $tmp_results$ = null;
    $quirk_passages_num$ = null;
    $secretary_class$ = null;
    $secretary$ = null;
    $quirk_guruqa_cost$ = null;
    $quirk_topic_mt$ = null;
    $quirk_irrelevant_terms$ = null;
    $quirk_irrelevant_collections$ = null;
    $sksi_enabled_predicates$ = null;
    $connecting_terms_cost$ = null;
    $ask_qaga_cached_caching_state$ = null;
    $answer_question_caching_state$ = null;
    $get_word_graph_cached_caching_state$ = null;
    $fully_connected_graph_links_caching_state$ = null;
    $word_graph_links_caching_state$ = null;
    $qaga_link_result_caching_state$ = null;
    $int0$50 = makeInteger( 50 );
    $sym1$SECRETARY = makeSymbol( "SECRETARY" );
    $const2$UIA_OpenEndedConversation_DemoEnv = constant_handles.reader_make_constant_shell( makeString( "UIA-OpenEndedConversation-DemoEnvironmentMt" ) );
    $int3$64 = makeInteger( 64 );
    $list4 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "QuirkIrrelevantTerm" ) ), constant_handles.reader_make_constant_shell( makeString( "ImplementationConstant" ) ),
      constant_handles.reader_make_constant_shell( makeString( "CoreConstant" ) ), constant_handles.reader_make_constant_shell( makeString( "NLTerm" ) ), constant_handles.reader_make_constant_shell( makeString(
          "MicrotheoryPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), constant_handles.reader_make_constant_shell( makeString( "CycLExpressionType" ) ), constant_handles
              .reader_make_constant_shell( makeString( "MicrotheoryType" ) ), constant_handles.reader_make_constant_shell( makeString( "RelationshipType" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "CollectionType" ) ), constant_handles.reader_make_constant_shell( makeString( "MetaRelation" ) ), constant_handles.reader_make_constant_shell( makeString( "VocabularyDefiningPredicate" ) ),
      constant_handles.reader_make_constant_shell( makeString( "KFDInternalKRTerm" ) ), constant_handles.reader_make_constant_shell( makeString( "SubcategorizationFrame" ) ), constant_handles.reader_make_constant_shell(
          makeString( "LinguisticObjectType" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSIConstant" ) ), constant_handles.reader_make_constant_shell( makeString( "ExperimentalConstant" ) ),
      constant_handles.reader_make_constant_shell( makeString( "ActorSlot" ) )
    } );
    $sym5$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const6$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const7$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) );
    $str8$_______A = makeString( "~&??? ~A" );
    $int9$100 = makeInteger( 100 );
    $sym10$GURUQA_RETRIEVE_PASSAGE = makeSymbol( "GURUQA-RETRIEVE-PASSAGE" );
    $str11$Not_well_formed___S_because__S = makeString( "Not well formed: ~S because ~S" );
    $sym12$TO_STRING = makeSymbol( "TO-STRING" );
    $sym13$RANKED_WEIGHT_LIST = makeSymbol( "RANKED-WEIGHT-LIST" );
    $kw14$SCORE = makeKeyword( "SCORE" );
    $sym15$ASK = makeSymbol( "ASK" );
    $str16$______Index___S = makeString( "~%~%~%Index: ~S" );
    $str17$_________________________________ = makeString( "~%----------------------------------------------------------------------" );
    $str18$___S = makeString( "~%~S" );
    $str19$___secretary__S_found_bindings__S = makeString( "~% secretary ~S found bindings ~S in ~S" );
    $sym20$BINDINGS = makeSymbol( "BINDINGS" );
    $str21$__rejecting___A = makeString( "~&rejecting: ~A" );
    $kw22$QUIRK_GURUQA = makeKeyword( "QUIRK-GURUQA" );
    $kw23$REMOVAL_QUIRK_GURUQA = makeKeyword( "REMOVAL-QUIRK-GURUQA" );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-QUIRK-GURUQA-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-QUIRK-GURUQA-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUIRK-GURUQA-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "ask guruqa" ), makeKeyword( "EXAMPLE" ), makeString(
            "<any-literal>" )
    } );
    $list25 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "LITERAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $const26$containsInfoStructure_CW = constant_handles.reader_make_constant_shell( makeString( "containsInfoStructure-CW" ) );
    $const27$TREC_Mt = constant_handles.reader_make_constant_shell( makeString( "TREC-Mt" ) );
    $kw28$FORWARD = makeKeyword( "FORWARD" );
    $sym29$_VAR1 = makeSymbol( "?VAR1" );
    $sym30$_VAR2 = makeSymbol( "?VAR2" );
    $const31$TextStringPropositionalExtraction = constant_handles.reader_make_constant_shell( makeString( "TextStringPropositionalExtractionMtFn" ) );
    $const32$DependencyParser = constant_handles.reader_make_constant_shell( makeString( "DependencyParser" ) );
    $const33$DependencyParserDefaultSetting = constant_handles.reader_make_constant_shell( makeString( "DependencyParserDefaultSetting" ) );
    $const34$DocumentSentenceFn = constant_handles.reader_make_constant_shell( makeString( "DocumentSentenceFn" ) );
    $const35$CorpusDocumentFn = constant_handles.reader_make_constant_shell( makeString( "CorpusDocumentFn" ) );
    $const36$CNS_Corpus = constant_handles.reader_make_constant_shell( makeString( "CNS-Corpus" ) );
    $const37$DocumentNumberFn = constant_handles.reader_make_constant_shell( makeString( "DocumentNumberFn" ) );
    $const38$SentenceNumberFn = constant_handles.reader_make_constant_shell( makeString( "SentenceNumberFn" ) );
    $kw39$DOC = makeKeyword( "DOC" );
    $kw40$SENT = makeKeyword( "SENT" );
    $list41 = ConsesLow.list( makeKeyword( "JUSTIFY" ), makeSymbol( "HL-JUSTIFY-QUIRK-GURUQA" ) );
    $kw42$MT_ASSERTS_SENTENCE = makeKeyword( "MT-ASSERTS-SENTENCE" );
    $str43$_S_is_not_a_support_p = makeString( "~S is not a support-p" );
    $const44$NGA_Gns_KS = constant_handles.reader_make_constant_shell( makeString( "NGA-Gns-KS" ) );
    $list45 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MappingMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NGA-KS" ) ) );
    $const46$Usgs_Gnis_KS = constant_handles.reader_make_constant_shell( makeString( "Usgs-Gnis-KS" ) );
    $list47 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MappingMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Usgs-KS" ) ) );
    $kw48$REMOVAL_QUIRK_GURUQA_CONJUCTIVE = makeKeyword( "REMOVAL-QUIRK-GURUQA-CONJUCTIVE" );
    $kw49$REMOVAL_QUIRK_GURUQA_CONJUNCTIVE = makeKeyword( "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE" );
    $str50$QUIRK_enabled_ = makeString( "QUIRK enabled!" );
    $str51$QUIRK_disabled_ = makeString( "QUIRK disabled!" );
    $list52 = ConsesLow.list( new SubLObject[] { makeKeyword( "EVERY-PREDICATES" ), NIL, makeKeyword( "APPLICABILITY" ), makeSymbol( "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY" ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
            "submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction" ), makeKeyword( "EXAMPLE" ), makeString(
                "(#$and (#$isa <event1> <EventType>)\n\t     (#$<actorSlot1> <event1> <actor1>)\n\t     (#$<actorSlot2> <event1> <actor2>)\n\t     ...)" )
    } );
    $const53$ActorSlot = constant_handles.reader_make_constant_shell( makeString( "ActorSlot" ) );
    $const54$TaxonomicSlot = constant_handles.reader_make_constant_shell( makeString( "TaxonomicSlot" ) );
    $list55 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "LITERAL" ) );
    $const56$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const57$Event = constant_handles.reader_make_constant_shell( makeString( "Event" ) );
    $sym58$CADR = makeSymbol( "CADR" );
    $sym59$SINGLETON_ = makeSymbol( "SINGLETON?" );
    $float60$0_9 = makeDouble( 0.9 );
    $str61$_______A = makeString( "~%$$$ ~A" );
    $str62$_______A = makeString( "~%### ~A" );
    $const63$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $sym64$NUMBERP = makeSymbol( "NUMBERP" );
    $sym65$CONSP = makeSymbol( "CONSP" );
    $sym66$_ = makeSymbol( "+" );
    $sym67$ASK_QAGA_CACHED = makeSymbol( "ASK-QAGA-CACHED" );
    $sym68$_ASK_QAGA_CACHED_CACHING_STATE_ = makeSymbol( "*ASK-QAGA-CACHED-CACHING-STATE*" );
    $kw69$AUGMENT = makeKeyword( "AUGMENT" );
    $kw70$REMOVAL_CONNECTING_TERMS = makeKeyword( "REMOVAL-CONNECTING-TERMS" );
    $list71 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-CONNECTING-TERMS-COST" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "QAGA" ),
      makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "connectingTerms" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "connectingTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "connectingTerms" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM1" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                  makeSymbol( "TERM2" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TERM2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "MAPCAR" ), makeSymbol( "GENERATE-PHRASE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                          "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "STR1" ), makeSymbol( "STR2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                              "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CONNECTING-TERMS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STR1" ) ),
                                  ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STR2" ) ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                      makeString( "connectingTerms" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM2" ) ), ConsesLow.cons(
                                          constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "INPUT" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                              "interface to the QAGA connecting terms functionality" ), makeKeyword( "EXAMPLE" ), makeString(
                                                  "(#$connectingTerms \"valentina tereshkova\" \"astronaut sally ride\" (#$TheSet . ?X))" )
    } );
    $const72$InstanceNamedFn = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) );
    $kw73$DOCID = makeKeyword( "DOCID" );
    $list74 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GraphicalStructure" ) ) );
    $kw75$TEXT = makeKeyword( "TEXT" );
    $kw76$QAGA = makeKeyword( "QAGA" );
    $list77 = ConsesLow.list( makeKeyword( "JUSTIFY" ), makeSymbol( "HL-JUSTIFY-QAGA" ) );
    $sym78$ANSWER_QUESTION = makeSymbol( "ANSWER-QUESTION" );
    $sym79$ANSWER = makeSymbol( "ANSWER" );
    $sym80$_ANSWER_QUESTION_CACHING_STATE_ = makeSymbol( "*ANSWER-QUESTION-CACHING-STATE*" );
    $sym81$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym82$JUSTIFY = makeSymbol( "JUSTIFY" );
    $kw83$REMOVAL_TEXT_ANSWER = makeKeyword( "REMOVAL-TEXT-ANSWER" );
    $list84 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TEXT" ), makeKeyword( "PREDICATE" ), constant_handles
        .reader_make_constant_shell( makeString( "textAnswer" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "textAnswer" ) ), makeKeyword(
            "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "textAnswer" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "QUESTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUESTION" ) ) ), makeKeyword(
                    "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GENERATE-QUESTION" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "ANSWER-QUESTION" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TEXT" ), makeKeyword(
                            "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "textAnswer" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "QUESTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "run a query against the quirk-lite system" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$textAnswer \"Who is Havel\"  ?X)" )
    } );
    $list85 = ConsesLow.list( makeKeyword( "JUSTIFY" ), makeSymbol( "HL-JUSTIFY-TEXT" ) );
    $kw86$REMOVAL_QUIRK_CYCLIFY = makeKeyword( "REMOVAL-QUIRK-CYCLIFY" );
    $list87 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-QUIRK-GURUQA-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-QUIRK-GURUQA-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUIRK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "run a CycL  query against the quirk-lite system" ), makeKeyword(
            "EXAMPLE" ), makeString( " <Anything> " )
    } );
    $sym88$XXXXXXXXXXXXXXXXXXXXXX = makeSymbol( "XXXXXXXXXXXXXXXXXXXXXX" );
    $kw89$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym90$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $const91$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $list92 = ConsesLow.list( makeKeyword( "CONDITIONAL-SENTENCE?" ), T );
    $kw93$QUIRK = makeKeyword( "QUIRK" );
    $list94 = ConsesLow.list( makeKeyword( "JUSTIFY" ), makeSymbol( "HL-JUSTIFY-QUIRK" ) );
    $kw95$REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE = makeKeyword( "REMOVAL-QUIRK-CYCLIFY-CONJUNCTIVE" );
    $list96 = ConsesLow.list( new SubLObject[] { makeKeyword( "EVERY-PREDICATES" ), NIL, makeKeyword( "APPLICABILITY" ), makeSymbol( "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY" ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUIRK-CONJUNCTIVE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
            "submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction" ), makeKeyword( "EXAMPLE" ), makeString(
                "(#$and (#$isa <event1> <EventType>)\n           (#$<actorSlot1> <event1> <actor1>)\n           (#$<actorSlot2> <event1> <actor2>)\n           ...)" )
    } );
    $kw97$NEG = makeKeyword( "NEG" );
    $list98 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $kw99$POS = makeKeyword( "POS" );
    $str100$removal_quirk_conjunctive_expand_ = makeString( "removal-quirk-conjunctive-expand can't yet handle multiple mts in the conjunction" );
    $sym101$GET_WORD_GRAPH_CACHED = makeSymbol( "GET-WORD-GRAPH-CACHED" );
    $sym102$_GET_WORD_GRAPH_CACHED_CACHING_STATE_ = makeSymbol( "*GET-WORD-GRAPH-CACHED-CACHING-STATE*" );
    $const103$conceptuallyRelated = constant_handles.reader_make_constant_shell( makeString( "conceptuallyRelated" ) );
    $const104$WordFn = constant_handles.reader_make_constant_shell( makeString( "WordFn" ) );
    $sym105$FULLY_CONNECTED_GRAPH_LINKS = makeSymbol( "FULLY-CONNECTED-GRAPH-LINKS" );
    $sym106$GET_PATH_LABELS = makeSymbol( "GET-PATH-LABELS" );
    $sym107$_FULLY_CONNECTED_GRAPH_LINKS_CACHING_STATE_ = makeSymbol( "*FULLY-CONNECTED-GRAPH-LINKS-CACHING-STATE*" );
    $sym108$WORD_GRAPH_LINKS = makeSymbol( "WORD-GRAPH-LINKS" );
    $sym109$_WORD_GRAPH_LINKS_CACHING_STATE_ = makeSymbol( "*WORD-GRAPH-LINKS-CACHING-STATE*" );
    $kw110$REMOVAL_QAGA_LINK_FOR = makeKeyword( "REMOVAL-QAGA-LINK-FOR" );
    $list111 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-CONNECTING-TERMS-COST" ), makeKeyword( "PREDICATE" ), constant_handles
        .reader_make_constant_shell( makeString( "QAGALinkFor" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QAGALinkFor" ) ), makeKeyword(
            "FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "QAGALinkFor" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "QUERY" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
                    makeKeyword( "CALL" ), makeSymbol( "CDR" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUERY" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                        makeSymbol( "MAPCAR" ), makeSymbol( "GENERATE-PHRASE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                            "FULLY-CONNECTED-GRAPH-LINKS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "WORD1" ), makeSymbol(
                                "WORD2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QAGALinkFor" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUERY" ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "WORD1" ) ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "WordFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "WORD2" ) ) ) ) )
    } );
    $sym112$QAGA_LINK_RESULT = makeSymbol( "QAGA-LINK-RESULT" );
    $sym113$_QAGA_LINK_RESULT_CACHING_STATE_ = makeSymbol( "*QAGA-LINK-RESULT-CACHING-STATE*" );
    $kw114$REMOVAL_QAGA_LINK_FOR_CURRIED = makeKeyword( "REMOVAL-QAGA-LINK-FOR-CURRIED" );
    $list115 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-CONNECTING-TERMS-COST" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list(
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QAGALinkForCurried" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QAGALinkForCurried" ) ), ConsesLow.list(
                makeKeyword( "BIND" ), makeSymbol( "QUERY" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CDR" ), ConsesLow.list( makeKeyword(
                    "VALUE" ), makeSymbol( "QUERY" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "MAPCAR" ), makeSymbol( "GENERATE-PHRASE" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FULLY-CONNECTED-GRAPH-LINKS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "WORD1" ), makeSymbol( "WORD2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "QAGA-LINK-RESULT" ), ConsesLow.list( ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "QAGALinkForCurried" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUERY" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "WordFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "WORD1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), ConsesLow.list( makeKeyword(
                      "VALUE" ), makeSymbol( "WORD2" ) ) ) ) ) )
    } );
  }

  public static final class $removal_quirk_guruqa_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_quirk_guruqa_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUIRK-GURUQA-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_quirk_guruqa_required( arg1, $removal_quirk_guruqa_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_quirk_guruqa_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_quirk_guruqa_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUIRK-GURUQA-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_quirk_guruqa_required( arg1, arg2 );
    }
  }

  public static final class $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_quirk_guruqa_conjunctive_applicability( arg1 );
    }
  }
}
/*
 * 
 * Total time: 436 ms
 * 
 */