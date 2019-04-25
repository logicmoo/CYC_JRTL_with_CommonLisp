package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class predicate_suggestor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.predicate_suggestor";
  public static final String myFingerPrint = "1828abbb7cd8688032a13fcd730095a17e19aa2ccacc18c5c192fc556ff13f48";
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 3013L)
  private static SubLSymbol $fts_antecedent_index$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 3464L)
  private static SubLSymbol $fts_consequent_index$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 3517L)
  private static SubLSymbol $fts_joint_antecedent_index$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 6430L)
  private static SubLSymbol $fts_expert_term_coll$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 6844L)
  private static SubLSymbol $fts_expert_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 7653L)
  private static SubLSymbol $fts_excluded_term_coll$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 8011L)
  private static SubLSymbol $fts_excluded_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 20694L)
  private static SubLSymbol $suggested_predicate_sort_types$;
  private static final SubLSymbol $sym0$CAR;
  private static final SubLSymbol $sym1$_;
  private static final SubLSymbol $sym2$LISTP;
  private static final SubLSymbol $sym3$_FTS_ANTECEDENT_INDEX_;
  private static final SubLSymbol $sym4$_FTS_CONSEQUENT_INDEX_;
  private static final SubLSymbol $sym5$_FTS_JOINT_ANTECEDENT_INDEX_;
  private static final SubLObject $const6$TermSuggestorExpertOnlyTerm;
  private static final SubLInteger $int7$5000;
  private static final SubLObject $const8$quotedCollection;
  private static final SubLObject $const9$TermSuggestorNonIndexedTerm;
  private static final SubLInteger $int10$6000;
  private static final SubLString $str11$Initializing_predicate_connectivi;
  private static final SubLSymbol $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym15$CSETQ;
  private static final SubLString $str16$_A;
  private static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const18$EverythingPSC;
  private static final SubLObject $const19$RuleMacroPredicate;
  private static final SubLString $str20$Initializing_predicate_connectivi;
  private static final SubLSymbol $kw21$GAF;
  private static final SubLSymbol $kw22$TRUE;
  private static final SubLSymbol $sym23$FTS_UNUSABLE_TERM_;
  private static final SubLSymbol $kw24$SKIP;
  private static final SubLSymbol $sym25$STRING_LENGTH__;
  private static final SubLSymbol $sym26$CONSTANT_NAME;
  private static final SubLInteger $int27$10000;
  private static final SubLSymbol $kw28$BEST;
  private static final SubLInteger $int29$100;
  private static final SubLSymbol $sym30$LIST_OF_FORT_P;
  private static final SubLSymbol $kw31$INTERSECT;
  private static final SubLSymbol $kw32$OCCURRENCES;
  private static final SubLSymbol $kw33$LENGTH;
  private static final SubLSymbol $kw34$INTERSECT_COMPLEX;
  private static final SubLString $str35$Bad_sort_type__S_;
  private static final SubLSymbol $sym36$FTS_EXPERT_TERM_;
  private static final SubLSymbol $sym37$LIST_OF_PREDICATES_P;
  private static final SubLSymbol $sym38$PREDICATE_P;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES;
  private static final SubLSymbol $sym41$CREATE_SENTENCES_FOR_PREDICATES;
  private static final SubLSymbol $sym42$GET_SUGGESTED_FOLLOWUPS;
  private static final SubLSymbol $kw43$HTML_HANDLER;
  private static final SubLString $str44$Followup_Term_Suggestion;
  private static final SubLString $str45$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str46$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw47$UNINITIALIZED;
  private static final SubLSymbol $kw48$CB_CYC;
  private static final SubLSymbol $kw49$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw50$SHA1;
  private static final SubLString $str51$yui_skin_sam;
  private static final SubLString $str52$reloadFrameButton;
  private static final SubLString $str53$button;
  private static final SubLString $str54$reload;
  private static final SubLString $str55$Refresh_Frames;
  private static final SubLString $str56$post;
  private static final SubLString $str57$handle_get_followup_suggestions;
  private static final SubLString $str58$Enter_constants_separated_by_whit;
  private static final SubLString $str59$terms;
  private static final SubLString $str60$Complete;
  private static final SubLString $str61$Cyclify;
  private static final SubLString $str62$Clear;
  private static final SubLInteger $int63$80;
  private static final SubLString $str64$Submit;
  private static final SubLString $str65$Maximum_number_of_results__;
  private static final SubLSymbol $kw66$NBSP;
  private static final SubLString $str67$cap;
  private static final SubLInteger $int68$30;
  private static final SubLString $str69$Allow_non_predicate_outputs__;
  private static final SubLString $str70$allow_non_preds;
  private static final SubLString $str71$Show_expert_level_terms__;
  private static final SubLString $str72$expert;
  private static final SubLSymbol $sym73$STRINGP;
  private static final SubLString $str74$50_;
  private static final SubLSymbol $kw75$LEFT;
  private static final SubLSymbol $kw76$EOF;
  private static final SubLSymbol $kw77$ERROR;
  private static final SubLString $str78$Error_reading_terms___Check_for_t;
  private static final SubLString $str79$No_usable_input_constants_;
  private static final SubLString $str80$Terms_related_to_;
  private static final SubLSymbol $sym81$HANDLE_GET_FOLLOWUP_SUGGESTIONS;

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 1466L)
  public static SubLObject get_term_values_from_dict(final SubLObject dict)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym0$CAR ), dictionary_utilities.sort_dictionary_by_values( dict, Symbols.symbol_function( $sym1$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 1792L)
  public static SubLObject counted_alist_from_list(final SubLObject seq)
  {
    assert NIL != Types.listp( seq ) : seq;
    SubLObject retlist = NIL;
    SubLObject cdolist_list_var;
    final SubLObject modified_seq = cdolist_list_var = Sequences.remove_duplicates( seq, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      retlist = conses_high.acons( elem, Sequences.count( elem, seq, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), retlist );
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return retlist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 2576L)
  public static SubLObject sort_list_by_count(final SubLObject seq)
  {
    assert NIL != Types.listp( seq ) : seq;
    return Mapping.mapcar( Symbols.symbol_function( $sym0$CAR ), list_utilities.sort_alist_by_values( counted_alist_from_list( seq ), Symbols.symbol_function( $sym1$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 3570L)
  public static SubLObject fts_init_index()
  {
    return forts.new_fort_id_index();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 3779L)
  public static SubLObject fts_term_antecedents_raw(final SubLObject v_term)
  {
    return forts.fort_id_index_lookup( $fts_antecedent_index$.getGlobalValue(), v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 3945L)
  public static SubLObject fts_term_consequents_raw(final SubLObject v_term)
  {
    return forts.fort_id_index_lookup( $fts_consequent_index$.getGlobalValue(), v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4054L)
  public static SubLObject fts_term_joint_antecedents_raw(final SubLObject v_term)
  {
    return forts.fort_id_index_lookup( $fts_joint_antecedent_index$.getGlobalValue(), v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4175L)
  public static SubLObject fts_term_antecedents(final SubLObject v_term)
  {
    return fts_term_element_list( fts_term_antecedents_raw( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4324L)
  public static SubLObject fts_term_consequents(final SubLObject v_term)
  {
    return fts_term_element_list( fts_term_consequents_raw( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4434L)
  public static SubLObject fts_term_joint_antecedents(final SubLObject v_term)
  {
    return fts_term_element_list( fts_term_joint_antecedents_raw( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4556L)
  public static SubLObject fts_term_element_list(final SubLObject contents)
  {
    return ( NIL != bag.bag_p( contents ) ) ? bag.bag_element_list( contents ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4671L)
  public static SubLObject fts_term_antecedent_count(final SubLObject v_term)
  {
    return fts_term_element_count( fts_term_consequents_raw( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 4894L)
  public static SubLObject fts_term_consequent_count(final SubLObject v_term)
  {
    return fts_term_element_count( fts_term_antecedents_raw( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 5010L)
  public static SubLObject fts_term_joint_antecedent_count(final SubLObject v_term)
  {
    return fts_term_element_count( fts_term_joint_antecedents_raw( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 5138L)
  public static SubLObject fts_term_element_count(final SubLObject contents)
  {
    return ( NIL != bag.bag_p( contents ) ) ? bag.bag_size( contents ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 5243L)
  public static SubLObject fts_antecedent_index_push_list(final SubLObject v_term, final SubLObject term_list)
  {
    final SubLObject already_found_terms = fts_term_antecedents_raw( v_term );
    return forts.fort_id_index_enter( $fts_antecedent_index$.getGlobalValue(), v_term, fts_update_entry_with_new_terms( already_found_terms, term_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 5584L)
  public static SubLObject fts_consequent_index_push_list(final SubLObject v_term, final SubLObject term_list)
  {
    final SubLObject already_found_terms = fts_term_consequents_raw( v_term );
    return forts.fort_id_index_enter( $fts_consequent_index$.getGlobalValue(), v_term, fts_update_entry_with_new_terms( already_found_terms, term_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 5869L)
  public static SubLObject fts_joint_antecedent_index_push_list(final SubLObject v_term, final SubLObject term_list)
  {
    final SubLObject already_found_terms = fts_term_antecedents_raw( v_term );
    return forts.fort_id_index_enter( $fts_joint_antecedent_index$.getGlobalValue(), v_term, fts_update_entry_with_new_terms( already_found_terms, term_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 6169L)
  public static SubLObject fts_update_entry_with_new_terms(SubLObject already_found_terms, final SubLObject term_list)
  {
    if( NIL == bag.bag_p( already_found_terms ) )
    {
      already_found_terms = bag.new_bag( UNPROVIDED, UNPROVIDED );
    }
    SubLObject cdolist_list_var = term_list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      bag.bag_add( item, already_found_terms );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return already_found_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 6905L)
  public static SubLObject fts_expert_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ZERO_INTEGER.eql( keyhash.keyhash_count( $fts_expert_terms$.getDynamicValue( thread ) ) ) )
    {
      SubLObject cdolist_list_var = ConsesLow.append( isa.all_fort_instances_in_all_mts( $fts_expert_term_coll$.getGlobalValue() ), isa.all_quoted_instances_in_all_mts( $fts_expert_term_coll$.getGlobalValue() ) );
      SubLObject expert_term = NIL;
      expert_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        keyhash.setkeyhash( expert_term, $fts_expert_terms$.getDynamicValue( thread ) );
        cdolist_list_var = cdolist_list_var.rest();
        expert_term = cdolist_list_var.first();
      }
    }
    return keyhash.getkeyhash( v_term, $fts_expert_terms$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 7369L)
  public static SubLObject fts_additional_excluded_terms()
  {
    return kb_mapping_utilities.pred_refs_in_any_mt( $const8$quotedCollection, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 8074L)
  public static SubLObject fts_excluded_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ZERO_INTEGER.eql( keyhash.keyhash_count( $fts_excluded_terms$.getDynamicValue( thread ) ) ) )
    {
      SubLObject cdolist_list_var = conses_high.union( ConsesLow.append( isa.all_fort_instances_in_all_mts( $fts_excluded_term_coll$.getGlobalValue() ), isa.all_quoted_instances_in_all_mts( $fts_excluded_term_coll$
          .getGlobalValue() ) ), fts_additional_excluded_terms(), UNPROVIDED, UNPROVIDED );
      SubLObject excluded_term = NIL;
      excluded_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        keyhash.setkeyhash( excluded_term, $fts_excluded_terms$.getDynamicValue( thread ) );
        cdolist_list_var = cdolist_list_var.rest();
        excluded_term = cdolist_list_var.first();
      }
    }
    return keyhash.getkeyhash( v_term, $fts_excluded_terms$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 8483L)
  public static SubLObject fts_unusable_termP(final SubLObject v_term)
  {
    if( NIL != nart_handles.nart_p( v_term ) )
    {
      return T;
    }
    if( NIL != cycl_utilities.non_indexed_fort_p( v_term ) )
    {
      return T;
    }
    if( NIL != hl_supports.hl_predicate_p( v_term ) )
    {
      return T;
    }
    if( NIL != fts_excluded_termP( v_term ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 8821L)
  public static SubLObject rule_connectivity_graph_builtP()
  {
    return makeBoolean( NIL != forts.fort_id_index_p( $fts_antecedent_index$.getGlobalValue() ) && NIL == forts.fort_id_index_emptyP( $fts_antecedent_index$.getGlobalValue() ) && NIL != forts.fort_id_index_p(
        $fts_consequent_index$.getGlobalValue() ) && NIL == forts.fort_id_index_emptyP( $fts_consequent_index$.getGlobalValue() ) && NIL != forts.fort_id_index_p( $fts_joint_antecedent_index$.getGlobalValue() )
        && NIL == forts.fort_id_index_emptyP( $fts_joint_antecedent_index$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 9281L)
  public static SubLObject rebuild_rule_connectivity_graph()
  {
    $fts_antecedent_index$.setGlobalValue( fts_init_index() );
    $fts_consequent_index$.setGlobalValue( fts_init_index() );
    $fts_joint_antecedent_index$.setGlobalValue( fts_init_index() );
    fts_init_via_rules();
    fts_init_via_rmp_gafs();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 9745L)
  public static SubLObject fts_init_via_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject message_var = $str11$Initializing_predicate_connectivi;
    final SubLObject total_$1 = assertions_low.rule_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message_var );
        final SubLObject iterator_var = kb_iterators.new_rule_iterator();
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject rule = iteration.iteration_next( iterator_var );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            sofar = Numbers.add( sofar, ONE_INTEGER );
            utilities_macros.note_percent_progress( sofar, total_$1 );
            total = Numbers.add( total, ONE_INTEGER );
            SubLObject message_var_$2 = NIL;
            final SubLObject was_appendingP = Eval.eval( $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
            Eval.eval( $list13 );
            try
            {
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym14$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    fts_init_handle_rule( rule );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                message_var_$2 = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                Eval.eval( ConsesLow.list( $sym15$CSETQ, $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
            if( message_var_$2.isString() )
            {
              Errors.warn( $str16$_A, message_var_$2 );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 10005L)
  public static SubLObject fts_init_via_rmp_gafs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym17$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const18$EverythingPSC, thread );
      SubLObject cdolist_list_var;
      final SubLObject rmps = cdolist_list_var = isa.all_fort_instances( $const19$RuleMacroPredicate, UNPROVIDED, UNPROVIDED );
      SubLObject rmp = NIL;
      rmp = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        total = Numbers.add( total, kb_indexing.num_predicate_extent_index( rmp, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        rmp = cdolist_list_var.first();
      }
      final SubLObject _prev_bind_0_$6 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$7 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( $str20$Initializing_predicate_connectivi );
          SubLObject cdolist_list_var2 = rmps;
          SubLObject rmp2 = NIL;
          rmp2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            final SubLObject pred_var = rmp2;
            if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
            {
              final SubLObject str = NIL;
              final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_start_time$.currentBinding( thread );
              final SubLObject _prev_bind_1_$8 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
              final SubLObject _prev_bind_2_$10 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
              final SubLObject _prev_bind_3_$11 = utilities_macros.$progress_notification_count$.currentBinding( thread );
              final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
              final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
              final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
              final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
              try
              {
                utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
                utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
                utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
                utilities_macros.$is_noting_progressP$.bind( T, thread );
                utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
                utilities_macros.noting_progress_preamble( str );
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    utilities_macros.note_progress();
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, $kw22$TRUE, NIL );
                      SubLObject done_var_$12 = NIL;
                      final SubLObject token_var_$13 = NIL;
                      while ( NIL == done_var_$12)
                      {
                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$13 );
                        final SubLObject valid_$14 = makeBoolean( !token_var_$13.eql( gaf ) );
                        if( NIL != valid_$14 )
                        {
                          sofar = Numbers.add( sofar, ONE_INTEGER );
                          utilities_macros.note_percent_progress( sofar, total );
                          SubLObject message_var = NIL;
                          final SubLObject was_appendingP = Eval.eval( $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                          Eval.eval( $list13 );
                          try
                          {
                            try
                            {
                              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                              final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding( thread );
                              try
                              {
                                Errors.$error_handler$.bind( $sym14$CATCH_ERROR_MESSAGE_HANDLER, thread );
                                try
                                {
                                  fts_init_handle_rmp_gaf( gaf );
                                }
                                catch( final Throwable catch_var )
                                {
                                  Errors.handleThrowable( catch_var, NIL );
                                }
                              }
                              finally
                              {
                                Errors.$error_handler$.rebind( _prev_bind_0_$8, thread );
                              }
                            }
                            catch( final Throwable ccatch_env_var )
                            {
                              message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                            }
                            finally
                            {
                              thread.throwStack.pop();
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values = Values.getValuesAsVector();
                              Eval.eval( ConsesLow.list( $sym15$CSETQ, $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
                              Values.restoreValuesFromVector( _values );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                            }
                          }
                          if( message_var.isString() )
                          {
                            Errors.warn( $str16$_A, message_var );
                          }
                        }
                        done_var_$12 = makeBoolean( NIL == valid_$14 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
                utilities_macros.noting_progress_postamble();
              }
              finally
              {
                utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
                utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
                utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
                utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$11, thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$10, thread );
                utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$8, thread );
                utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$7, thread );
              }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            rmp2 = cdolist_list_var2.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$7, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$6, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 10628L)
  public static SubLObject fts_init_handle_rule(final SubLObject rule)
  {
    return fts_init_handle_rule_formula( assertions_high.assertion_formula( rule ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 10780L)
  public static SubLObject fts_init_handle_rmp_gaf(final SubLObject gaf)
  {
    final SubLObject gaf_formula = assertions_high.assertion_formula( gaf );
    final SubLObject rule_formula = uncanonicalizer.undo_implications( verbosifier.verbosify_cycl( gaf_formula, UNPROVIDED, UNPROVIDED ) );
    return fts_init_handle_rule_formula( rule_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 11042L)
  public static SubLObject fts_init_handle_rule_formula(final SubLObject formula)
  {
    if( NIL != el_utilities.el_implication_p( formula ) )
    {
      final SubLObject lhs = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      final SubLObject rhs = cycl_utilities.formula_arg2( formula, UNPROVIDED );
      final SubLObject antecedent_terms = Sequences.remove_if( $sym23$FTS_UNUSABLE_TERM_, cycl_utilities.formula_forts( lhs, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject consequent_terms = Sequences.remove_if( $sym23$FTS_UNUSABLE_TERM_, cycl_utilities.formula_forts( rhs, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = antecedent_terms;
      SubLObject antecedent_term = NIL;
      antecedent_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        fts_joint_antecedent_index_push_list( antecedent_term, antecedent_terms );
        cdolist_list_var = cdolist_list_var.rest();
        antecedent_term = cdolist_list_var.first();
      }
      cdolist_list_var = antecedent_terms;
      antecedent_term = NIL;
      antecedent_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        fts_consequent_index_push_list( antecedent_term, consequent_terms );
        cdolist_list_var = cdolist_list_var.rest();
        antecedent_term = cdolist_list_var.first();
      }
      cdolist_list_var = consequent_terms;
      SubLObject consequent_term = NIL;
      consequent_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        fts_antecedent_index_push_list( consequent_term, antecedent_terms );
        cdolist_list_var = cdolist_list_var.rest();
        consequent_term = cdolist_list_var.first();
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 11955L)
  public static SubLObject dump_rule_connectivity_graph_to_stream(final SubLObject stream)
  {
    dump_rule_connectivity_graph_to_stream_int( $fts_antecedent_index$.getGlobalValue(), stream );
    dump_rule_connectivity_graph_to_stream_int( $fts_consequent_index$.getGlobalValue(), stream );
    dump_rule_connectivity_graph_to_stream_int( $fts_joint_antecedent_index$.getGlobalValue(), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 12353L)
  public static SubLObject load_rule_connectivity_graph_from_stream(final SubLObject stream)
  {
    $fts_antecedent_index$.setGlobalValue( load_rule_connectivity_graph_from_stream_int( stream ) );
    $fts_consequent_index$.setGlobalValue( load_rule_connectivity_graph_from_stream_int( stream ) );
    $fts_joint_antecedent_index$.setGlobalValue( load_rule_connectivity_graph_from_stream_int( stream ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 12714L)
  public static SubLObject dump_rule_connectivity_graph_to_stream_int(final SubLObject index, final SubLObject stream)
  {
    cfasl.cfasl_output( forts.fort_id_index_count( index ), stream );
    SubLObject idx = forts.do_fii_get_constants( index );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw24$SKIP ) )
    {
      final SubLObject idx_$19 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$19, $kw24$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$19 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject value;
        SubLObject fort;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          value = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( value ) || NIL == id_index.id_index_skip_tombstones_p( $kw24$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( value ) )
            {
              value = $kw24$SKIP;
            }
            fort = constants_high.find_constant_by_internal_id( id );
            if( NIL != fort )
            {
              cfasl.cfasl_output( fort, stream );
              cfasl.cfasl_output( value, stream );
            }
          }
        }
      }
      final SubLObject idx_$20 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$20 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$20 );
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            value2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject fort2 = constants_high.find_constant_by_internal_id( id2 );
            if( NIL != fort2 )
            {
              cfasl.cfasl_output( fort2, stream );
              cfasl.cfasl_output( value2, stream );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    idx = forts.do_fii_get_narts( index );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw24$SKIP ) )
    {
      final SubLObject idx_$21 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$21, $kw24$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$21 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject value;
        SubLObject fort;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          value = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( value ) || NIL == id_index.id_index_skip_tombstones_p( $kw24$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( value ) )
            {
              value = $kw24$SKIP;
            }
            fort = nart_handles.find_nart_by_id( id );
            if( NIL != fort )
            {
              cfasl.cfasl_output( fort, stream );
              cfasl.cfasl_output( value, stream );
            }
          }
        }
      }
      final SubLObject idx_$22 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$22 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$22 );
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            value2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject fort2 = nart_handles.find_nart_by_id( id2 );
            if( NIL != fort2 )
            {
              cfasl.cfasl_output( fort2, stream );
              cfasl.cfasl_output( value2, stream );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 12972L)
  public static SubLObject load_rule_connectivity_graph_from_stream_int(final SubLObject stream)
  {
    final SubLObject index = fts_init_index();
    SubLObject count;
    SubLObject i;
    SubLObject fort;
    SubLObject value;
    for( count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ), i = NIL, i = ZERO_INTEGER; i.numL( count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      fort = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      value = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      forts.fort_id_index_enter( index, fort, value );
    }
    return index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 13271L)
  public static SubLObject fts_term_related_terms_with_counts(final SubLObject v_term)
  {
    return counted_alist_from_list( fts_term_related_terms( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 13454L)
  public static SubLObject fts_term_related_terms_by_relevance(final SubLObject v_term)
  {
    return list_utilities.ordered_merge( list_utilities.ordered_merge( sort_list_by_count( fts_term_joint_antecedents( v_term ) ), sort_list_by_count( fts_term_consequents( v_term ) ), Symbols.symbol_function( EQUAL ),
        UNPROVIDED ), sort_list_by_count( fts_term_antecedents( v_term ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 14195L)
  public static SubLObject fts_term_related_terms_by_count(final SubLObject v_term)
  {
    return sort_list_by_count( fts_term_related_terms( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 14496L)
  public static SubLObject fts_term_related_terms(final SubLObject v_term)
  {
    return Sequences.cconcatenate( fts_term_joint_antecedents( v_term ), new SubLObject[] { fts_term_antecedents( v_term ), fts_term_consequents( v_term )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 14720L)
  public static SubLObject weight_termlist_by_name(final SubLObject dict, final SubLObject n)
  {
    final SubLObject output_terms = dictionary.dictionary_keys( dict );
    final SubLObject outterms_ranked = Sequences.nreverse( Sort.sort( conses_high.copy_list( output_terms ), $sym25$STRING_LENGTH__, $sym26$CONSTANT_NAME ) );
    SubLObject current_rank = ZERO_INTEGER;
    SubLObject cdolist_list_var = outterms_ranked;
    SubLObject outterm = NIL;
    outterm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_increment( dict, outterm, Numbers.multiply( n, current_rank ) );
      current_rank = Numbers.add( current_rank, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      outterm = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 15536L)
  public static SubLObject weight_termlist_by_total_occurrences(final SubLObject dict, final SubLObject n, final SubLObject all_related_terms)
  {
    SubLObject cdolist_list_var = all_related_terms;
    SubLObject relterm = NIL;
    relterm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_increment( dict, relterm, n );
      cdolist_list_var = cdolist_list_var.rest();
      relterm = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 16119L)
  public static SubLObject weight_termlist_by_intersection_of_inputs(final SubLObject dict, final SubLObject n, final SubLObject output_terms, final SubLObject list_of_related_term_lists)
  {
    SubLObject cdolist_list_var = list_of_related_term_lists;
    SubLObject terms_related_to_one_interm = NIL;
    terms_related_to_one_interm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$23 = output_terms;
      SubLObject outterm = NIL;
      outterm = cdolist_list_var_$23.first();
      while ( NIL != cdolist_list_var_$23)
      {
        if( NIL != subl_promotions.memberP( outterm, terms_related_to_one_interm, UNPROVIDED, UNPROVIDED ) )
        {
          dictionary_utilities.dictionary_increment( dict, outterm, n );
        }
        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
        outterm = cdolist_list_var_$23.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      terms_related_to_one_interm = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 16955L)
  public static SubLObject terms_from_terms_sorted(final SubLObject input_terms, SubLObject intersect_wt, SubLObject occurrence_wt, SubLObject namelength_wt)
  {
    if( intersect_wt == UNPROVIDED )
    {
      intersect_wt = $int27$10000;
    }
    if( occurrence_wt == UNPROVIDED )
    {
      occurrence_wt = TEN_INTEGER;
    }
    if( namelength_wt == UNPROVIDED )
    {
      namelength_wt = ONE_INTEGER;
    }
    SubLObject output_terms = NIL;
    final SubLObject weighted_output_terms = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject all_related_terms = NIL;
    SubLObject list_of_lists_of_related_terms = NIL;
    SubLObject cdolist_list_var = input_terms;
    SubLObject interm = NIL;
    interm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject relterms = fts_term_related_terms( interm );
      list_of_lists_of_related_terms = ConsesLow.cons( relterms, list_of_lists_of_related_terms );
      SubLObject cdolist_list_var_$24 = relterms;
      SubLObject outterm = NIL;
      outterm = cdolist_list_var_$24.first();
      while ( NIL != cdolist_list_var_$24)
      {
        all_related_terms = ConsesLow.cons( outterm, all_related_terms );
        final SubLObject item_var = outterm;
        if( NIL == conses_high.member( item_var, output_terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          output_terms = ConsesLow.cons( item_var, output_terms );
        }
        dictionary.dictionary_enter( weighted_output_terms, outterm, ZERO_INTEGER );
        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
        outterm = cdolist_list_var_$24.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      interm = cdolist_list_var.first();
    }
    if( !intersect_wt.eql( ZERO_INTEGER ) )
    {
      weight_termlist_by_intersection_of_inputs( weighted_output_terms, intersect_wt, output_terms, list_of_lists_of_related_terms );
    }
    if( !occurrence_wt.eql( ZERO_INTEGER ) )
    {
      weight_termlist_by_total_occurrences( weighted_output_terms, occurrence_wt, all_related_terms );
    }
    if( !namelength_wt.eql( ZERO_INTEGER ) )
    {
      weight_termlist_by_name( weighted_output_terms, namelength_wt );
    }
    return get_term_values_from_dict( weighted_output_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 18652L)
  public static SubLObject suggested_terms_from_terms(final SubLObject input_terms, SubLObject sort_type, SubLObject cap, SubLObject expert)
  {
    if( sort_type == UNPROVIDED )
    {
      sort_type = $kw28$BEST;
    }
    if( cap == UNPROVIDED )
    {
      cap = $int29$100;
    }
    if( expert == UNPROVIDED )
    {
      expert = NIL;
    }
    assert NIL != forts.list_of_fort_p( input_terms ) : input_terms;
    SubLObject results = NIL;
    if( NIL != list_utilities.empty_list_p( input_terms ) )
    {
      return NIL;
    }
    if( sort_type == $kw31$INTERSECT )
    {
      results = terms_from_terms_sorted( input_terms, $int29$100, ZERO_INTEGER, ZERO_INTEGER );
    }
    else if( sort_type == $kw32$OCCURRENCES )
    {
      results = terms_from_terms_sorted( input_terms, ZERO_INTEGER, $int29$100, ZERO_INTEGER );
    }
    else if( sort_type == $kw33$LENGTH )
    {
      results = terms_from_terms_sorted( input_terms, ZERO_INTEGER, ZERO_INTEGER, $int29$100 );
    }
    else if( sort_type == $kw34$INTERSECT_COMPLEX )
    {
      results = terms_from_terms_sorted( input_terms, $int27$10000, $int29$100, ONE_INTEGER );
    }
    else if( sort_type == $kw28$BEST )
    {
      results = ( ONE_INTEGER.eql( Sequences.length( input_terms ) ) ? terms_from_terms_sorted( input_terms, ZERO_INTEGER, $int29$100, ZERO_INTEGER )
          : terms_from_terms_sorted( input_terms, $int27$10000, TEN_INTEGER, ONE_INTEGER ) );
    }
    else
    {
      Errors.error( $str35$Bad_sort_type__S_, sort_type );
    }
    results = list_utilities.remove_objects_from_list( input_terms, results, UNPROVIDED );
    if( NIL == expert )
    {
      results = Sequences.remove_if( $sym36$FTS_EXPERT_TERM_, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != list_utilities.lengthG( results, cap, UNPROVIDED ) )
    {
      return list_utilities.first_n( cap, results );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 20312L)
  public static SubLObject suggested_predicates_from_predicates(final SubLObject input_terms, SubLObject sort_type, SubLObject cap, SubLObject expert)
  {
    if( sort_type == UNPROVIDED )
    {
      sort_type = $kw28$BEST;
    }
    if( cap == UNPROVIDED )
    {
      cap = TWENTY_INTEGER;
    }
    if( expert == UNPROVIDED )
    {
      expert = NIL;
    }
    assert NIL != fort_types_interface.list_of_predicates_p( input_terms ) : input_terms;
    return list_utilities.remove_if_not( $sym38$PREDICATE_P, suggested_terms_from_terms( input_terms, sort_type, cap, expert ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 20889L)
  public static SubLObject suggested_predicate_sort_type_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( conses_high.member( v_object, $suggested_predicate_sort_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 21014L)
  public static SubLObject create_suggested_predicate_sentences_for_predicates(final SubLObject list_of_preds, SubLObject sort_type, SubLObject cap, SubLObject expert)
  {
    if( sort_type == UNPROVIDED )
    {
      sort_type = $kw28$BEST;
    }
    if( cap == UNPROVIDED )
    {
      cap = TWENTY_INTEGER;
    }
    if( expert == UNPROVIDED )
    {
      expert = NIL;
    }
    return create_sentences_for_predicates( suggested_predicates_from_predicates( list_of_preds, sort_type, cap, expert ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 21599L)
  public static SubLObject create_sentences_for_predicates(final SubLObject list_of_preds)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = list_of_preds;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject predicate_arity = arity.arity( predicate );
      SubLObject formula = ConsesLow.list( predicate );
      SubLObject index;
      for( index = NIL, index = ZERO_INTEGER; index.numL( predicate_arity ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        formula = ConsesLow.cons( variables.get_default_el_var( index ), formula );
      }
      result = ConsesLow.cons( el_utilities.optimize_el_formula_variable_names( Sequences.nreverse( formula ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 22954L)
  public static SubLObject get_suggested_followups(final SubLObject args)
  {
    get_suggested_followups_int( args );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 23175L)
  public static SubLObject get_suggested_followups_int(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str44$Followup_Term_Suggestion;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str45$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str46$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$25 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw47$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw48$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw49$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str51$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str52$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str54$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str55$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str56$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str57$handle_get_followup_suggestions, T, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str58$Enter_constants_separated_by_whit );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_complete.html_complete_button( $str59$terms, $str60$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_complete.html_cyclify_button( $str59$terms, $str61$Cyclify, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_script_utilities.html_clear_input_button( $str59$terms, $str62$Clear, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str59$terms );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int63$80 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TEN_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_submit_input( $str64$Submit, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str65$Maximum_number_of_results__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_glyph( $kw66$NBSP, ONE_INTEGER );
              html_utilities.html_text_input( $str67$cap, $int68$30, THREE_INTEGER );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str69$Allow_non_predicate_outputs__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_glyph( $kw66$NBSP, ONE_INTEGER );
              html_utilities.html_checkbox_input( $str70$allow_non_preds, $str70$allow_non_preds, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str71$Show_expert_level_terms__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_glyph( $kw66$NBSP, ONE_INTEGER );
              html_utilities.html_checkbox_input( $str72$expert, $str72$expert, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$26, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$25, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 24250L)
  public static SubLObject strip_parens(final SubLObject str)
  {
    assert NIL != Types.stringp( str ) : str;
    return Sequences.remove( Characters.CHAR_lparen, Sequences.remove( Characters.CHAR_rparen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 24352L)
  public static SubLObject draw_fts_output_table(final SubLObject output_terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ranking = ZERO_INTEGER;
    SubLObject bgcolor = NIL;
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str74$50_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject color_toggle = NIL;
      SubLObject list_var = NIL;
      SubLObject v_term = NIL;
      SubLObject ignore_me = NIL;
      list_var = output_terms;
      v_term = list_var.first();
      for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
      {
        if( NIL != color_toggle )
        {
          color_toggle = NIL;
        }
        else
        {
          color_toggle = T;
        }
        bgcolor = ( ( NIL != color_toggle ) ? html_macros.$html_color_light_cyan$.getGlobalValue() : html_macros.$html_color_lighter_blue$.getGlobalValue() );
        ranking = Numbers.add( ranking, ONE_INTEGER );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        if( NIL != bgcolor )
        {
          html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( bgcolor );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw75$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( ranking );
            html_utilities.html_glyph( $kw66$NBSP, THREE_INTEGER );
            cb_utilities.cb_form( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 24963L)
  public static SubLObject read_fts_term_inputs(final SubLObject terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constants = NIL;
    SubLObject index = ZERO_INTEGER;
    while ( index.numL( Sequences.length( terms ) ))
    {
      thread.resetMultipleValues();
      SubLObject v_object = reader.read_from_string_ignoring_errors( terms, NIL, $kw76$EOF, index, UNPROVIDED );
      final SubLObject next_index = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( v_object == $kw76$EOF )
      {
        index = Sequences.length( terms );
      }
      else
      {
        if( next_index == $kw77$ERROR )
        {
          return cb_utilities.cb_error( $str78$Error_reading_terms___Check_for_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( v_object.isSymbol() )
        {
          v_object = constant_completion_high.constant_complete( Symbols.symbol_name( v_object ), NIL, T, UNPROVIDED, UNPROVIDED ).first();
        }
        if( NIL != constant_handles.constant_p( v_object ) )
        {
          final SubLObject item_var = v_object;
          if( NIL == conses_high.member( item_var, constants, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            constants = ConsesLow.cons( item_var, constants );
          }
        }
        if( next_index.isInteger() )
        {
          index = next_index;
        }
        else
        {
          index = Sequences.length( terms );
        }
      }
    }
    return constants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-suggestor.lisp", position = 25673L)
  public static SubLObject handle_get_followup_suggestions(final SubLObject args)
  {
    final SubLObject terms = strip_parens( html_utilities.html_extract_input( $str59$terms, args ) );
    final SubLObject constants = read_fts_term_inputs( terms );
    SubLObject usable_inputs = NIL;
    final SubLObject sort_symbol = $kw28$BEST;
    final SubLObject cap = reader.read_from_string( html_utilities.html_extract_input( $str67$cap, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject expert = list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str72$expert, args ) );
    final SubLObject allow_non_preds = list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str70$allow_non_preds, args ) );
    SubLObject cdolist_list_var = constants;
    SubLObject v_const = NIL;
    v_const = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == fts_unusable_termP( v_const ) )
      {
        usable_inputs = ConsesLow.cons( v_const, usable_inputs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_const = cdolist_list_var.first();
    }
    if( NIL == usable_inputs )
    {
      html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str79$No_usable_input_constants_ );
      html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      return NIL;
    }
    final SubLObject output_terms = ( NIL == allow_non_preds ) ? list_utilities.remove_if_not( $sym38$PREDICATE_P, suggested_terms_from_terms( usable_inputs, sort_symbol, cap, expert ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) : suggested_terms_from_terms( usable_inputs, sort_symbol, cap, expert );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str80$Terms_related_to_ );
    html_utilities.html_princ( usable_inputs );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    draw_fts_output_table( output_terms );
    html_utilities.html_newline( UNPROVIDED );
    cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_predicate_suggestor_file()
  {
    SubLFiles.declareFunction( me, "get_term_values_from_dict", "GET-TERM-VALUES-FROM-DICT", 1, 0, false );
    SubLFiles.declareFunction( me, "counted_alist_from_list", "COUNTED-ALIST-FROM-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_list_by_count", "SORT-LIST-BY-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_init_index", "FTS-INIT-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "fts_term_antecedents_raw", "FTS-TERM-ANTECEDENTS-RAW", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_consequents_raw", "FTS-TERM-CONSEQUENTS-RAW", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_joint_antecedents_raw", "FTS-TERM-JOINT-ANTECEDENTS-RAW", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_antecedents", "FTS-TERM-ANTECEDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_consequents", "FTS-TERM-CONSEQUENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_joint_antecedents", "FTS-TERM-JOINT-ANTECEDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_element_list", "FTS-TERM-ELEMENT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_antecedent_count", "FTS-TERM-ANTECEDENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_consequent_count", "FTS-TERM-CONSEQUENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_joint_antecedent_count", "FTS-TERM-JOINT-ANTECEDENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_element_count", "FTS-TERM-ELEMENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_antecedent_index_push_list", "FTS-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "fts_consequent_index_push_list", "FTS-CONSEQUENT-INDEX-PUSH-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "fts_joint_antecedent_index_push_list", "FTS-JOINT-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "fts_update_entry_with_new_terms", "FTS-UPDATE-ENTRY-WITH-NEW-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "fts_expert_termP", "FTS-EXPERT-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_additional_excluded_terms", "FTS-ADDITIONAL-EXCLUDED-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "fts_excluded_termP", "FTS-EXCLUDED-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_unusable_termP", "FTS-UNUSABLE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_connectivity_graph_builtP", "RULE-CONNECTIVITY-GRAPH-BUILT?", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_rule_connectivity_graph", "REBUILD-RULE-CONNECTIVITY-GRAPH", 0, 0, false );
    SubLFiles.declareFunction( me, "fts_init_via_rules", "FTS-INIT-VIA-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "fts_init_via_rmp_gafs", "FTS-INIT-VIA-RMP-GAFS", 0, 0, false );
    SubLFiles.declareFunction( me, "fts_init_handle_rule", "FTS-INIT-HANDLE-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_init_handle_rmp_gaf", "FTS-INIT-HANDLE-RMP-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_init_handle_rule_formula", "FTS-INIT-HANDLE-RULE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_rule_connectivity_graph_to_stream", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_rule_connectivity_graph_from_stream", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_rule_connectivity_graph_to_stream_int", "DUMP-RULE-CONNECTIVITY-GRAPH-TO-STREAM-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "load_rule_connectivity_graph_from_stream_int", "LOAD-RULE-CONNECTIVITY-GRAPH-FROM-STREAM-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_related_terms_with_counts", "FTS-TERM-RELATED-TERMS-WITH-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_related_terms_by_relevance", "FTS-TERM-RELATED-TERMS-BY-RELEVANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_related_terms_by_count", "FTS-TERM-RELATED-TERMS-BY-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fts_term_related_terms", "FTS-TERM-RELATED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "weight_termlist_by_name", "WEIGHT-TERMLIST-BY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "weight_termlist_by_total_occurrences", "WEIGHT-TERMLIST-BY-TOTAL-OCCURRENCES", 3, 0, false );
    SubLFiles.declareFunction( me, "weight_termlist_by_intersection_of_inputs", "WEIGHT-TERMLIST-BY-INTERSECTION-OF-INPUTS", 4, 0, false );
    SubLFiles.declareFunction( me, "terms_from_terms_sorted", "TERMS-FROM-TERMS-SORTED", 1, 3, false );
    SubLFiles.declareFunction( me, "suggested_terms_from_terms", "SUGGESTED-TERMS-FROM-TERMS", 1, 3, false );
    SubLFiles.declareFunction( me, "suggested_predicates_from_predicates", "SUGGESTED-PREDICATES-FROM-PREDICATES", 1, 3, false );
    SubLFiles.declareFunction( me, "suggested_predicate_sort_type_p", "SUGGESTED-PREDICATE-SORT-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "create_suggested_predicate_sentences_for_predicates", "CREATE-SUGGESTED-PREDICATE-SENTENCES-FOR-PREDICATES", 1, 3, false );
    SubLFiles.declareFunction( me, "create_sentences_for_predicates", "CREATE-SENTENCES-FOR-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_suggested_followups", "GET-SUGGESTED-FOLLOWUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_suggested_followups_int", "GET-SUGGESTED-FOLLOWUPS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_parens", "STRIP-PARENS", 1, 0, false );
    SubLFiles.declareFunction( me, "draw_fts_output_table", "DRAW-FTS-OUTPUT-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "read_fts_term_inputs", "READ-FTS-TERM-INPUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_get_followup_suggestions", "HANDLE-GET-FOLLOWUP-SUGGESTIONS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_predicate_suggestor_file()
  {
    $fts_antecedent_index$ = SubLFiles.deflexical( "*FTS-ANTECEDENT-INDEX*", ( maybeDefault( $sym3$_FTS_ANTECEDENT_INDEX_, $fts_antecedent_index$, NIL ) ) );
    $fts_consequent_index$ = SubLFiles.deflexical( "*FTS-CONSEQUENT-INDEX*", ( maybeDefault( $sym4$_FTS_CONSEQUENT_INDEX_, $fts_consequent_index$, NIL ) ) );
    $fts_joint_antecedent_index$ = SubLFiles.deflexical( "*FTS-JOINT-ANTECEDENT-INDEX*", ( maybeDefault( $sym5$_FTS_JOINT_ANTECEDENT_INDEX_, $fts_joint_antecedent_index$, NIL ) ) );
    $fts_expert_term_coll$ = SubLFiles.defconstant( "*FTS-EXPERT-TERM-COLL*", $const6$TermSuggestorExpertOnlyTerm );
    $fts_expert_terms$ = SubLFiles.defparameter( "*FTS-EXPERT-TERMS*", keyhash.new_keyhash( $int7$5000, UNPROVIDED ) );
    $fts_excluded_term_coll$ = SubLFiles.defconstant( "*FTS-EXCLUDED-TERM-COLL*", $const9$TermSuggestorNonIndexedTerm );
    $fts_excluded_terms$ = SubLFiles.defparameter( "*FTS-EXCLUDED-TERMS*", keyhash.new_keyhash( $int10$6000, UNPROVIDED ) );
    $suggested_predicate_sort_types$ = SubLFiles.defparameter( "*SUGGESTED-PREDICATE-SORT-TYPES*", $list39 );
    return NIL;
  }

  public static SubLObject setup_predicate_suggestor_file()
  {
    subl_macro_promotions.declare_defglobal( $sym3$_FTS_ANTECEDENT_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym4$_FTS_CONSEQUENT_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym5$_FTS_JOINT_ANTECEDENT_INDEX_ );
    access_macros.register_external_symbol( $sym40$CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES );
    access_macros.register_external_symbol( $sym41$CREATE_SENTENCES_FOR_PREDICATES );
    html_macros.note_cgi_handler_function( $sym42$GET_SUGGESTED_FOLLOWUPS, $kw43$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym81$HANDLE_GET_FOLLOWUP_SUGGESTIONS, $kw43$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_predicate_suggestor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_predicate_suggestor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_predicate_suggestor_file();
  }
  static
  {
    me = new predicate_suggestor();
    $fts_antecedent_index$ = null;
    $fts_consequent_index$ = null;
    $fts_joint_antecedent_index$ = null;
    $fts_expert_term_coll$ = null;
    $fts_expert_terms$ = null;
    $fts_excluded_term_coll$ = null;
    $fts_excluded_terms$ = null;
    $suggested_predicate_sort_types$ = null;
    $sym0$CAR = makeSymbol( "CAR" );
    $sym1$_ = makeSymbol( ">" );
    $sym2$LISTP = makeSymbol( "LISTP" );
    $sym3$_FTS_ANTECEDENT_INDEX_ = makeSymbol( "*FTS-ANTECEDENT-INDEX*" );
    $sym4$_FTS_CONSEQUENT_INDEX_ = makeSymbol( "*FTS-CONSEQUENT-INDEX*" );
    $sym5$_FTS_JOINT_ANTECEDENT_INDEX_ = makeSymbol( "*FTS-JOINT-ANTECEDENT-INDEX*" );
    $const6$TermSuggestorExpertOnlyTerm = constant_handles.reader_make_constant_shell( makeString( "TermSuggestorExpertOnlyTerm" ) );
    $int7$5000 = makeInteger( 5000 );
    $const8$quotedCollection = constant_handles.reader_make_constant_shell( makeString( "quotedCollection" ) );
    $const9$TermSuggestorNonIndexedTerm = constant_handles.reader_make_constant_shell( makeString( "TermSuggestorNonIndexedTerm" ) );
    $int10$6000 = makeInteger( 6000 );
    $str11$Initializing_predicate_connectivi = makeString( "Initializing predicate connectivity from KB rules" );
    $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list13 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym14$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym15$CSETQ = makeSymbol( "CSETQ" );
    $str16$_A = makeString( "~A" );
    $sym17$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const18$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const19$RuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "RuleMacroPredicate" ) );
    $str20$Initializing_predicate_connectivi = makeString( "Initializing predicate connectivity from rule macro predicate GAFs" );
    $kw21$GAF = makeKeyword( "GAF" );
    $kw22$TRUE = makeKeyword( "TRUE" );
    $sym23$FTS_UNUSABLE_TERM_ = makeSymbol( "FTS-UNUSABLE-TERM?" );
    $kw24$SKIP = makeKeyword( "SKIP" );
    $sym25$STRING_LENGTH__ = makeSymbol( "STRING-LENGTH-<" );
    $sym26$CONSTANT_NAME = makeSymbol( "CONSTANT-NAME" );
    $int27$10000 = makeInteger( 10000 );
    $kw28$BEST = makeKeyword( "BEST" );
    $int29$100 = makeInteger( 100 );
    $sym30$LIST_OF_FORT_P = makeSymbol( "LIST-OF-FORT-P" );
    $kw31$INTERSECT = makeKeyword( "INTERSECT" );
    $kw32$OCCURRENCES = makeKeyword( "OCCURRENCES" );
    $kw33$LENGTH = makeKeyword( "LENGTH" );
    $kw34$INTERSECT_COMPLEX = makeKeyword( "INTERSECT-COMPLEX" );
    $str35$Bad_sort_type__S_ = makeString( "Bad sort-type ~S!" );
    $sym36$FTS_EXPERT_TERM_ = makeSymbol( "FTS-EXPERT-TERM?" );
    $sym37$LIST_OF_PREDICATES_P = makeSymbol( "LIST-OF-PREDICATES-P" );
    $sym38$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $list39 = ConsesLow.list( makeKeyword( "INTERSECT" ), makeKeyword( "OCCURRENCES" ), makeKeyword( "LENGTH" ), makeKeyword( "INTERSECT-COMPLEX" ), makeKeyword( "BEST" ) );
    $sym40$CREATE_SUGGESTED_PREDICATE_SENTENCES_FOR_PREDICATES = makeSymbol( "CREATE-SUGGESTED-PREDICATE-SENTENCES-FOR-PREDICATES" );
    $sym41$CREATE_SENTENCES_FOR_PREDICATES = makeSymbol( "CREATE-SENTENCES-FOR-PREDICATES" );
    $sym42$GET_SUGGESTED_FOLLOWUPS = makeSymbol( "GET-SUGGESTED-FOLLOWUPS" );
    $kw43$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str44$Followup_Term_Suggestion = makeString( "Followup Term Suggestion" );
    $str45$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str46$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw47$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw48$CB_CYC = makeKeyword( "CB-CYC" );
    $kw49$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw50$SHA1 = makeKeyword( "SHA1" );
    $str51$yui_skin_sam = makeString( "yui-skin-sam" );
    $str52$reloadFrameButton = makeString( "reloadFrameButton" );
    $str53$button = makeString( "button" );
    $str54$reload = makeString( "reload" );
    $str55$Refresh_Frames = makeString( "Refresh Frames" );
    $str56$post = makeString( "post" );
    $str57$handle_get_followup_suggestions = makeString( "handle-get-followup-suggestions" );
    $str58$Enter_constants_separated_by_whit = makeString( "Enter constants separated by whitespace: " );
    $str59$terms = makeString( "terms" );
    $str60$Complete = makeString( "Complete" );
    $str61$Cyclify = makeString( "Cyclify" );
    $str62$Clear = makeString( "Clear" );
    $int63$80 = makeInteger( 80 );
    $str64$Submit = makeString( "Submit" );
    $str65$Maximum_number_of_results__ = makeString( "Maximum number of results: " );
    $kw66$NBSP = makeKeyword( "NBSP" );
    $str67$cap = makeString( "cap" );
    $int68$30 = makeInteger( 30 );
    $str69$Allow_non_predicate_outputs__ = makeString( "Allow non-predicate outputs: " );
    $str70$allow_non_preds = makeString( "allow-non-preds" );
    $str71$Show_expert_level_terms__ = makeString( "Show expert-level terms: " );
    $str72$expert = makeString( "expert" );
    $sym73$STRINGP = makeSymbol( "STRINGP" );
    $str74$50_ = makeString( "50%" );
    $kw75$LEFT = makeKeyword( "LEFT" );
    $kw76$EOF = makeKeyword( "EOF" );
    $kw77$ERROR = makeKeyword( "ERROR" );
    $str78$Error_reading_terms___Check_for_t = makeString( "Error reading terms.  Check for typos." );
    $str79$No_usable_input_constants_ = makeString( "No usable input constants." );
    $str80$Terms_related_to_ = makeString( "Terms related to " );
    $sym81$HANDLE_GET_FOLLOWUP_SUGGESTIONS = makeSymbol( "HANDLE-GET-FOLLOWUP-SUGGESTIONS" );
  }
}
/*
 * 
 * Total time: 496 ms
 * 
 */