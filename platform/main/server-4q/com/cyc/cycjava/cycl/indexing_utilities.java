package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class indexing_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.indexing_utilities";
  public static final String myFingerPrint = "d815a6d669d071fa9ee02018d7bd6118ae714a61ac31542196d5fff34e6d8cb2";
  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 5734L)
  private static SubLSymbol $term_being_removed$;
  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLSymbol $dtp_complex_index_visitor$;
  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 14910L)
  public static SubLSymbol $swap_out_intermediate_index_levelsP$;
  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28553L)
  private static SubLSymbol $precache_term_set$;
  private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const1$EverythingPSC;
  private static final SubLSymbol $kw2$RULE;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$FORT_P;
  private static final SubLSymbol $kw5$GAF;
  private static final SubLInteger $int6$_2;
  private static final SubLSymbol $kw7$IGNORE;
  private static final SubLSymbol $kw8$UNINITIALIZED;
  private static final SubLSymbol $sym9$_EXIT;
  private static final SubLSymbol $sym10$GAF_REMOVE_BEFORE_;
  private static final SubLObject $const11$termOfUnit;
  private static final SubLObject $const12$isa;
  private static final SubLObject $const13$genls;
  private static final SubLSymbol $sym14$COMPLEX_INDEX_VISITOR;
  private static final SubLSymbol $sym15$COMPLEX_INDEX_VISITOR_P;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$PRINT_COMPLEX_INDEX_VISITOR;
  private static final SubLSymbol $sym21$COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$COMPINX_VISIT_BEGIN_SUBINDEX_FN;
  private static final SubLSymbol $sym24$_CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN;
  private static final SubLSymbol $sym25$COMPINX_VISIT_END_SUBINDEX_FN;
  private static final SubLSymbol $sym26$_CSETF_COMPINX_VISIT_END_SUBINDEX_FN;
  private static final SubLSymbol $sym27$COMPINX_VISIT_NOTE_FINAL_INDEX_FN;
  private static final SubLSymbol $sym28$_CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN;
  private static final SubLSymbol $sym29$COMPINX_VISIT_BEGIN_VISIT_FN;
  private static final SubLSymbol $sym30$_CSETF_COMPINX_VISIT_BEGIN_VISIT_FN;
  private static final SubLSymbol $sym31$COMPINX_VISIT_END_VISIT_FN;
  private static final SubLSymbol $sym32$_CSETF_COMPINX_VISIT_END_VISIT_FN;
  private static final SubLSymbol $sym33$COMPINX_VISIT_PARAM;
  private static final SubLSymbol $sym34$_CSETF_COMPINX_VISIT_PARAM;
  private static final SubLSymbol $kw35$BEGIN_SUBINDEX_FN;
  private static final SubLSymbol $kw36$END_SUBINDEX_FN;
  private static final SubLSymbol $kw37$NOTE_FINAL_INDEX_FN;
  private static final SubLSymbol $kw38$BEGIN_VISIT_FN;
  private static final SubLSymbol $kw39$END_VISIT_FN;
  private static final SubLSymbol $kw40$PARAM;
  private static final SubLString $str41$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw42$BEGIN;
  private static final SubLSymbol $sym43$MAKE_COMPLEX_INDEX_VISITOR;
  private static final SubLSymbol $kw44$SLOT;
  private static final SubLSymbol $kw45$END;
  private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD;
  private static final SubLString $str47$__CompInxVisit__;
  private static final SubLString $str48$__SubIndex__;
  private static final SubLString $str49$_FinalIndex__;
  private static final SubLString $str50$_;
  private static final SubLString $str51$__;
  private static final SubLString $str52$__Param__;
  private static final SubLSymbol $kw53$INDEX_ROOT;
  private static final SubLList $list54;
  private static final SubLString $str55$Illegal_state_exception__Index_co;
  private static final SubLSymbol $kw56$ENTIRE;
  private static final SubLSymbol $kw57$CHANGED;
  private static final SubLSymbol $sym58$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT;
  private static final SubLSymbol $sym59$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX;
  private static final SubLSymbol $sym60$DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX;
  private static final SubLSymbol $sym61$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX;
  private static final SubLSymbol $sym62$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT;
  private static final SubLString $str63$The_swappable_KB_index_visitor_is;
  private static final SubLSymbol $kw64$FILE_VECTOR;
  private static final SubLSymbol $kw65$INDEX_STACK;
  private static final SubLSymbol $kw66$NEW_INDEX;
  private static final SubLSymbol $kw67$FVECTOR_INDEXICAL;
  private static final SubLSymbol $kw68$STYLE;
  private static final SubLSymbol $kw69$KEY_STACK;
  private static final SubLSymbol $kw70$NONE;
  private static final SubLString $str71$The_swappable_KB_index_visitor_di;
  private static final SubLString $str72$Invalid_state_transition__the_ind;
  private static final SubLSymbol $sym73$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str74$Failed_to_sanity_check_key__A_s_s;
  private static final SubLString $str75$Conversion_error__newly_created_m;
  private static final SubLSymbol $kw76$SWAPPED_OUT;
  private static final SubLSymbol $kw77$COMPACT;
  private static final SubLString $str78$Invalid_state_transition__index_d;
  private static final SubLString $str79$Dumpable_index_construction_faile;
  private static final SubLString $str80$____Key__A_was_not_copied_over_to;
  private static final SubLString $str81$_A__Key__A_is_in_write_out_map_bu;
  private static final SubLString $str82$Path_mis_alignment__trying_to_pop;
  private static final SubLSymbol $sym83$NOTE_PRECACHE_TERM;
  private static final SubLString $str84$Gathering_assertions;
  private static final SubLString $str85$Precaching_assertions_and_gatheri;
  private static final SubLString $str86$cdolist;
  private static final SubLSymbol $sym87$_;
  private static final SubLSymbol $sym88$CONSTANT_INTERNAL_ID;
  private static final SubLSymbol $sym89$NART_ID;
  private static final SubLSymbol $sym90$UNREPRESENTED_TERM_SUID;
  private static final SubLString $str91$Precaching_constant_indexes;
  private static final SubLString $str92$Precaching_NART_indexes_and_formu;
  private static final SubLString $str93$Precaching_unrepresented_term_ind;
  private static final SubLSymbol $kw94$ASSERTION_COUNT;
  private static final SubLSymbol $kw95$CONSTANT_COUNT;
  private static final SubLSymbol $kw96$NART_COUNT;
  private static final SubLSymbol $kw97$UNREPRESENTED_TERM_COUNT;

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 831L)
  public static SubLObject rule_with_some_pragmatic_somewhereP(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      result = rule_with_some_pragmaticP( rule, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 1243L)
  public static SubLObject rule_with_some_pragmaticP(final SubLObject rule, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pragmas_foundP = NIL;
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, NIL );
          SubLObject done_var = pragmas_foundP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw2$RULE, NIL, NIL );
                SubLObject done_var_$1 = pragmas_foundP;
                final SubLObject token_var_$2 = NIL;
                while ( NIL == done_var_$1)
                {
                  final SubLObject pragma = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                  final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( pragma ) );
                  if( NIL != valid_$3 )
                  {
                    final SubLObject pragma_pred = cycl_utilities.atomic_sentence_predicate( clauses.neg_lits( assertions_high.assertion_cnf( pragma ) ).first() );
                    if( NIL == list_utilities.member_kbeqP( pragma_pred, $list3 ) )
                    {
                      pragmas_foundP = T;
                    }
                  }
                  done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != pragmas_foundP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != pragmas_foundP );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return pragmas_foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 1942L)
  public static SubLObject rule_with_some_asserted_more_specifically_pragmaticP(final SubLObject rule, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pragmas_foundP = NIL;
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, NIL );
          SubLObject done_var = pragmas_foundP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw2$RULE, NIL, NIL );
                SubLObject done_var_$5 = pragmas_foundP;
                final SubLObject token_var_$6 = NIL;
                while ( NIL == done_var_$5)
                {
                  final SubLObject pragma = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                  final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( pragma ) );
                  if( NIL != valid_$7 )
                  {
                    pragmas_foundP = assertion_utilities.assertion_mentions_asserted_more_specificallyP( pragma );
                  }
                  done_var_$5 = makeBoolean( NIL == valid_$7 || NIL != pragmas_foundP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != pragmas_foundP );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return pragmas_foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 2601L)
  public static SubLObject find_all_assertions_genl_mts(final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_indexing.find_all_assertions( cnf );
    SubLObject visible_assertions = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = all_assertions;
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
        {
          visible_assertions = ConsesLow.cons( ass, visible_assertions );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( visible_assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 3147L)
  public static SubLObject dependent_narts(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_vars.$tou_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( fort, NIL, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( fort, NIL, NIL );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
              SubLObject done_var_$9 = NIL;
              final SubLObject token_var_$10 = NIL;
              while ( NIL == done_var_$9)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$10 );
                final SubLObject valid_$11 = makeBoolean( !token_var_$10.eql( assertion ) );
                if( NIL != valid_$11 )
                {
                  v_answer = ConsesLow.cons( assertions_high.gaf_arg1( assertion ), v_answer );
                }
                done_var_$9 = makeBoolean( NIL == valid_$11 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( fort ) )
      {
        final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec( fort );
        SubLObject final_index_iterator2 = NIL;
        try
        {
          final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw5$GAF, NIL, NIL );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( assertion2 ) );
            if( NIL != valid2 )
            {
              v_answer = ConsesLow.cons( assertions_high.gaf_arg1( assertion2 ), v_answer );
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL != final_index_iterator2 )
            {
              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
          }
        }
      }
      if( NIL != kb_mapping_macros.do_other_index_key_validator( fort, NIL ) )
      {
        final SubLObject final_index_spec2 = kb_mapping_macros.other_final_index_spec( fort );
        SubLObject final_index_iterator2 = NIL;
        try
        {
          final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, NIL, NIL, NIL );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( assertion2 ) );
            if( NIL != valid2 && NIL != kb_mapping_macros.do_other_index_assertion_match_p( assertion2 ) && NIL != term_of_unit_assertion_mentioning_fortP( assertion2, fort ) )
            {
              v_answer = ConsesLow.cons( assertions_high.gaf_arg1( assertion2 ), v_answer );
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            if( NIL != final_index_iterator2 )
            {
              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
            }
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.fast_delete_duplicates( v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 4107L)
  public static SubLObject term_of_unit_assertion_mentioning_fortP(final SubLObject assertion, final SubLObject fort)
  {
    return makeBoolean( NIL != function_terms.tou_assertionP( assertion ) && NIL != cycl_utilities.expression_find( fort, assertions_high.gaf_arg2( assertion ), T, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 4276L)
  public static SubLObject nested_non_atomic_terms(final SubLObject v_object, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = $int6$_2;
    }
    SubLObject result = NIL;
    if( NIL != assertions_high.rule_assertionP( v_object ) )
    {
      if( depth.numGE( ZERO_INTEGER ) && NIL == conses_high.member( v_object, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( v_object, result );
      }
      SubLObject cdolist_list_var = clauses.neg_lits( assertions_high.assertion_cnf( v_object ) );
      SubLObject lit = NIL;
      lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( depth.numGE( MINUS_ONE_INTEGER ) )
        {
          final SubLObject item_var = lit;
          if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
        }
        SubLObject cdolist_list_var_$15 = nested_non_atomic_terms( lit, depth );
        SubLObject nested_object = NIL;
        nested_object = cdolist_list_var_$15.first();
        while ( NIL != cdolist_list_var_$15)
        {
          final SubLObject item_var2 = nested_object;
          if( NIL == conses_high.member( item_var2, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var2, result );
          }
          cdolist_list_var_$15 = cdolist_list_var_$15.rest();
          nested_object = cdolist_list_var_$15.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        lit = cdolist_list_var.first();
      }
      cdolist_list_var = clauses.pos_lits( assertions_high.assertion_cnf( v_object ) );
      lit = NIL;
      lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( depth.numGE( MINUS_ONE_INTEGER ) )
        {
          final SubLObject item_var = lit;
          if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
        }
        SubLObject cdolist_list_var_$16 = nested_non_atomic_terms( lit, depth );
        SubLObject nested_object = NIL;
        nested_object = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          final SubLObject item_var2 = nested_object;
          if( NIL == conses_high.member( item_var2, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var2, result );
          }
          cdolist_list_var_$16 = cdolist_list_var_$16.rest();
          nested_object = cdolist_list_var_$16.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        lit = cdolist_list_var.first();
      }
    }
    else if( NIL != assertions_high.gaf_assertionP( v_object ) )
    {
      if( depth.numGE( ZERO_INTEGER ) && NIL == conses_high.member( v_object, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( v_object, result );
      }
      SubLObject cdolist_list_var2;
      final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args( assertions_high.gaf_hl_formula( v_object ), $kw7$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$17 = nested_non_atomic_terms( arg, Numbers.add( depth, ONE_INTEGER ) );
        SubLObject nested_object2 = NIL;
        nested_object2 = cdolist_list_var_$17.first();
        while ( NIL != cdolist_list_var_$17)
        {
          final SubLObject item_var3 = nested_object2;
          if( NIL == conses_high.member( item_var3, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var3, result );
          }
          cdolist_list_var_$17 = cdolist_list_var_$17.rest();
          nested_object2 = cdolist_list_var_$17.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        arg = cdolist_list_var2.first();
      }
    }
    else if( NIL != nart_handles.nart_p( v_object ) )
    {
      if( depth.numGE( ZERO_INTEGER ) && NIL == conses_high.member( v_object, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( v_object, result );
      }
      SubLObject cdolist_list_var2;
      final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args( narts_high.nart_hl_formula( v_object ), $kw7$IGNORE );
      SubLObject nart_arg = NIL;
      nart_arg = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$18 = nested_non_atomic_terms( nart_arg, Numbers.add( depth, ONE_INTEGER ) );
        SubLObject nested_object2 = NIL;
        nested_object2 = cdolist_list_var_$18.first();
        while ( NIL != cdolist_list_var_$18)
        {
          final SubLObject item_var3 = nested_object2;
          if( NIL == conses_high.member( item_var3, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var3, result );
          }
          cdolist_list_var_$18 = cdolist_list_var_$18.rest();
          nested_object2 = cdolist_list_var_$18.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        nart_arg = cdolist_list_var2.first();
      }
    }
    else if( v_object.isCons() )
    {
      if( depth.numGE( ZERO_INTEGER ) && NIL == conses_high.member( v_object, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( v_object, result );
      }
      SubLObject cdolist_list_var2;
      final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args( v_object, $kw7$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$19 = nested_non_atomic_terms( arg, Numbers.add( depth, ONE_INTEGER ) );
        SubLObject nested_object2 = NIL;
        nested_object2 = cdolist_list_var_$19.first();
        while ( NIL != cdolist_list_var_$19)
        {
          final SubLObject item_var3 = nested_object2;
          if( NIL == conses_high.member( item_var3, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var3, result );
          }
          cdolist_list_var_$19 = cdolist_list_var_$19.rest();
          nested_object2 = cdolist_list_var_$19.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        arg = cdolist_list_var2.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 5794L)
  public static SubLObject sort_gafs_for_removal(final SubLObject gafs, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $term_being_removed$.currentBinding( thread );
    try
    {
      $term_being_removed$.bind( v_term, thread );
      return Sort.sort( gafs, $sym10$GAF_REMOVE_BEFORE_, UNPROVIDED );
    }
    finally
    {
      $term_being_removed$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 6010L)
  public static SubLObject gaf_remove_beforeP(final SubLObject gaf1, final SubLObject gaf2)
  {
    return Numbers.numL( gaf_removal_order( gaf1 ), gaf_removal_order( gaf2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 6221L)
  public static SubLObject gaf_removal_order(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = assertions_high.gaf_arg1( gaf );
    if( NIL == kb_utilities.kbeq( arg1, $term_being_removed$.getDynamicValue( thread ) ) )
    {
      return ONE_INTEGER;
    }
    final SubLObject pcase_var;
    final SubLObject pred = pcase_var = assertions_high.gaf_predicate( gaf );
    if( pcase_var.eql( $const11$termOfUnit ) )
    {
      return FIVE_INTEGER;
    }
    if( pcase_var.eql( $const12$isa ) )
    {
      return FOUR_INTEGER;
    }
    if( pcase_var.eql( $const13$genls ) )
    {
      return THREE_INTEGER;
    }
    return TWO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject complex_index_visitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_complex_index_visitor( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject complex_index_visitor_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $complex_index_visitor_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject compinx_visit_begin_subindex_fn(final SubLObject v_object)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject compinx_visit_end_subindex_fn(final SubLObject v_object)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject compinx_visit_note_final_index_fn(final SubLObject v_object)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject compinx_visit_begin_visit_fn(final SubLObject v_object)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject compinx_visit_end_visit_fn(final SubLObject v_object)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject compinx_visit_param(final SubLObject v_object)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject _csetf_compinx_visit_begin_subindex_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject _csetf_compinx_visit_end_subindex_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject _csetf_compinx_visit_note_final_index_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject _csetf_compinx_visit_begin_visit_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject _csetf_compinx_visit_end_visit_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject _csetf_compinx_visit_param(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != complex_index_visitor_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject make_complex_index_visitor(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $complex_index_visitor_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw35$BEGIN_SUBINDEX_FN ) )
      {
        _csetf_compinx_visit_begin_subindex_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$END_SUBINDEX_FN ) )
      {
        _csetf_compinx_visit_end_subindex_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$NOTE_FINAL_INDEX_FN ) )
      {
        _csetf_compinx_visit_note_final_index_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$BEGIN_VISIT_FN ) )
      {
        _csetf_compinx_visit_begin_visit_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$END_VISIT_FN ) )
      {
        _csetf_compinx_visit_end_visit_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$PARAM ) )
      {
        _csetf_compinx_visit_param( v_new, current_value );
      }
      else
      {
        Errors.error( $str41$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject visit_defstruct_complex_index_visitor(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw42$BEGIN, $sym43$MAKE_COMPLEX_INDEX_VISITOR, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw35$BEGIN_SUBINDEX_FN, compinx_visit_begin_subindex_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw36$END_SUBINDEX_FN, compinx_visit_end_subindex_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw37$NOTE_FINAL_INDEX_FN, compinx_visit_note_final_index_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw38$BEGIN_VISIT_FN, compinx_visit_begin_visit_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw39$END_VISIT_FN, compinx_visit_end_visit_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw40$PARAM, compinx_visit_param( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$END, $sym43$MAKE_COMPLEX_INDEX_VISITOR, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7066L)
  public static SubLObject visit_defstruct_object_complex_index_visitor_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_complex_index_visitor( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 7574L)
  public static SubLObject print_complex_index_visitor(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      streams_high.write_string( $str47$__CompInxVisit__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( compinx_visit_begin_visit_fn( v_object ), stream );
      streams_high.write_string( $str48$__SubIndex__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( compinx_visit_begin_subindex_fn( v_object ), stream );
      streams_high.write_string( $str49$_FinalIndex__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( compinx_visit_note_final_index_fn( v_object ), stream );
      streams_high.write_string( $str50$_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( compinx_visit_end_subindex_fn( v_object ), stream );
      streams_high.write_string( $str51$__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( compinx_visit_end_visit_fn( v_object ), stream );
      streams_high.write_string( $str52$__Param__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( compinx_visit_param( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 8310L)
  public static SubLObject new_complex_index_visitor(final SubLObject begin_visit_fn, final SubLObject begin_subindex_fn, final SubLObject note_final_index_fn, final SubLObject end_subindex_fn,
      final SubLObject end_visit_fn, SubLObject param)
  {
    if( param == UNPROVIDED )
    {
      param = NIL;
    }
    final SubLObject compinx_visit = make_complex_index_visitor( UNPROVIDED );
    _csetf_compinx_visit_begin_visit_fn( compinx_visit, begin_visit_fn );
    _csetf_compinx_visit_begin_subindex_fn( compinx_visit, begin_subindex_fn );
    _csetf_compinx_visit_note_final_index_fn( compinx_visit, note_final_index_fn );
    _csetf_compinx_visit_end_subindex_fn( compinx_visit, end_subindex_fn );
    _csetf_compinx_visit_end_visit_fn( compinx_visit, end_visit_fn );
    _csetf_compinx_visit_param( compinx_visit, param );
    return compinx_visit;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 9069L)
  public static SubLObject complex_index_visitor_begin_visit(final SubLObject compinx_visitor, final SubLObject complex_index)
  {
    return Functions.funcall( compinx_visit_begin_visit_fn( compinx_visitor ), compinx_visitor, complex_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 9388L)
  public static SubLObject complex_index_visitor_end_visit(final SubLObject compinx_visitor, final SubLObject complex_index)
  {
    return Functions.funcall( compinx_visit_end_visit_fn( compinx_visitor ), compinx_visitor, complex_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 9703L)
  public static SubLObject show_complex_index_visitor_final_index(final SubLObject compinx_visitor, final SubLObject final_key, final SubLObject final_index)
  {
    return Functions.funcall( compinx_visit_note_final_index_fn( compinx_visitor ), compinx_visitor, final_key, final_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 10039L)
  public static SubLObject show_complex_index_visitor_subindex_begin(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index)
  {
    return Functions.funcall( compinx_visit_begin_subindex_fn( compinx_visitor ), compinx_visitor, sub_key, sub_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 10399L)
  public static SubLObject show_complex_index_visitor_subindex_end(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index)
  {
    return Functions.funcall( compinx_visit_end_subindex_fn( compinx_visitor ), compinx_visitor, sub_key, sub_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 10755L)
  public static SubLObject set_complex_index_visitor_parameter(final SubLObject compinx_visitor, final SubLObject new_param)
  {
    final SubLObject old_param = get_complex_index_visitor_parameter( compinx_visitor );
    _csetf_compinx_visit_param( compinx_visitor, new_param );
    return old_param;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 11267L)
  public static SubLObject get_complex_index_visitor_parameter(final SubLObject compinx_visitor)
  {
    return compinx_visit_param( compinx_visitor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 11616L)
  public static SubLObject visit_complex_index(final SubLObject complex_index, final SubLObject compinx_visitor)
  {
    complex_index_visitor_begin_visit( compinx_visitor, complex_index );
    visit_complex_subindex( compinx_visitor, $kw53$INDEX_ROOT, complex_index );
    complex_index_visitor_end_visit( compinx_visitor, complex_index );
    return compinx_visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 12023L)
  public static SubLObject visit_complex_subindex(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    show_complex_index_visitor_subindex_begin( compinx_visitor, sub_key, sub_index );
    if( NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p( sub_index ) )
    {
      final SubLObject iterator = map_utilities.new_map_iterator( kb_indexing_datastructures.intermediate_index_map( sub_index ) );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject i_key = NIL;
          SubLObject i_index = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
          i_key = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
          i_index = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != kb_indexing_datastructures.final_index_p( i_index ) )
            {
              show_complex_index_visitor_final_index( compinx_visitor, i_key, i_index );
            }
            else if( NIL != kb_indexing_datastructures.intermediate_index_p( i_index ) )
            {
              visit_complex_subindex( compinx_visitor, i_key, i_index );
            }
            else
            {
              Errors.error( $str55$Illegal_state_exception__Index_co, i_index, i_key );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
          }
        }
      }
    }
    show_complex_index_visitor_subindex_end( compinx_visitor, sub_key, sub_index );
    return compinx_visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 12907L)
  public static SubLObject visit_changed_complex_index(final SubLObject complex_index, final SubLObject compinx_visitor)
  {
    complex_index_visitor_begin_visit( compinx_visitor, complex_index );
    visit_changed_complex_subindex( compinx_visitor, $kw53$INDEX_ROOT, complex_index );
    complex_index_visitor_end_visit( compinx_visitor, complex_index );
    return compinx_visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 13376L)
  public static SubLObject visit_changed_complex_subindex(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject changed_keys = ZERO_INTEGER;
    SubLObject unchanged_sub_index = NIL;
    if( NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p( sub_index ) )
    {
      SubLObject key_set = NIL;
      thread.resetMultipleValues();
      final SubLObject key_set_$20 = kb_indexing_datastructures.segregate_index_changes_and_pristines( sub_index );
      final SubLObject unchanged_sub_index_$21 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      key_set = key_set_$20;
      unchanged_sub_index = unchanged_sub_index_$21;
      SubLObject csome_list_var = key_set;
      SubLObject i_key = NIL;
      i_key = csome_list_var.first();
      while ( NIL != csome_list_var)
      {
        final SubLObject i_index = kb_indexing_datastructures.intermediate_index_lookup( sub_index, i_key );
        if( changed_keys.isZero() )
        {
          show_complex_index_visitor_subindex_begin( compinx_visitor, sub_key, unchanged_sub_index );
        }
        changed_keys = Numbers.add( changed_keys, ONE_INTEGER );
        if( NIL != kb_indexing_datastructures.final_index_p( i_index ) )
        {
          show_complex_index_visitor_final_index( compinx_visitor, i_key, i_index );
        }
        else if( NIL != kb_indexing_datastructures.intermediate_index_p( i_index ) )
        {
          visit_changed_complex_subindex( compinx_visitor, i_key, i_index );
        }
        else
        {
          Errors.error( $str55$Illegal_state_exception__Index_co, i_index, i_key );
        }
        csome_list_var = csome_list_var.rest();
        i_key = csome_list_var.first();
      }
    }
    if( changed_keys.isZero() )
    {
      show_complex_index_visitor_subindex_begin( compinx_visitor, sub_key, unchanged_sub_index );
    }
    show_complex_index_visitor_subindex_end( compinx_visitor, sub_key, sub_index );
    return compinx_visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 15429L)
  public static SubLObject dump_entire_swappable_complex_index(final SubLObject complex_index, final SubLObject fvector, final SubLObject indexical)
  {
    final SubLObject v_context = dump_swappable_kb_index_new_context( fvector, indexical, $kw56$ENTIRE );
    final SubLObject visitor = new_swappable_kb_index_dump_visitor( v_context );
    visit_complex_index( complex_index, visitor );
    return dump_swappable_kb_index_get_final_result( v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 16074L)
  public static SubLObject dump_changed_swappable_complex_index(final SubLObject complex_index, final SubLObject fvector, final SubLObject indexical)
  {
    final SubLObject v_context = dump_swappable_kb_index_new_context( fvector, indexical, $kw57$CHANGED );
    final SubLObject visitor = new_swappable_kb_index_dump_visitor( v_context );
    visit_changed_complex_index( complex_index, visitor );
    return dump_swappable_kb_index_get_final_result( v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 16699L)
  public static SubLObject new_swappable_kb_index_dump_visitor(final SubLObject v_context)
  {
    return new_complex_index_visitor( $sym58$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT, $sym59$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX, $sym60$DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX,
        $sym61$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX, $sym62$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT, v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 17277L)
  public static SubLObject dump_swappable_kb_index_visitor_begin_visit(final SubLObject visitor, final SubLObject complex_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == dump_swappable_kb_index_valid_initial_context( v_context ) )
    {
      Errors.error( $str63$The_swappable_KB_index_visitor_is, v_context );
    }
    dump_swappable_kb_index_push_current_index( v_context, kb_indexing_datastructures.clone_intermediate_index( complex_index ) );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 17741L)
  public static SubLObject dump_swappable_kb_index_new_context(final SubLObject fvector, final SubLObject indexical, final SubLObject style)
  {
    return list_utilities.make_plist( ConsesLow.list( $kw64$FILE_VECTOR, $kw65$INDEX_STACK, $kw66$NEW_INDEX, $kw67$FVECTOR_INDEXICAL, $kw68$STYLE, $kw69$KEY_STACK ), ConsesLow.list( fvector, stacks.create_stack(),
        $kw70$NONE, indexical, style, stacks.create_stack() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18097L)
  public static SubLObject dump_swappable_kb_index_valid_initial_context(final SubLObject v_context)
  {
    return makeBoolean( NIL != list_utilities.property_list_p( v_context ) && NIL != file_vector.file_vector_p( conses_high.getf( v_context, $kw64$FILE_VECTOR, UNPROVIDED ) ) && NIL != stacks.stack_empty_p( conses_high
        .getf( v_context, $kw65$INDEX_STACK, UNPROVIDED ) ) && $kw70$NONE == conses_high.getf( v_context, $kw66$NEW_INDEX, UNPROVIDED ) && NIL != file_vector_utilities.file_vector_indexical_p( conses_high.getf(
            v_context, $kw67$FVECTOR_INDEXICAL, UNPROVIDED ) ) && ( NIL != dumping_swappable_changed_kb_indexP( v_context ) || NIL != dumping_swappable_entire_kb_indexP( v_context ) ) && NIL != stacks.stack_empty_p(
                conses_high.getf( v_context, $kw69$KEY_STACK, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18768L)
  public static SubLObject dumping_swappable_changed_kb_indexP(final SubLObject v_context)
  {
    return Equality.eq( $kw57$CHANGED, conses_high.getf( v_context, $kw68$STYLE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18876L)
  public static SubLObject dumping_swappable_entire_kb_indexP(final SubLObject v_context)
  {
    return Equality.eq( $kw56$ENTIRE, conses_high.getf( v_context, $kw68$STYLE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 18982L)
  public static SubLObject dump_swappable_kb_index_visitor_end_visit(final SubLObject visitor, final SubLObject complex_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == dump_swappable_kb_index_valid_final_context( v_context ) )
    {
      Errors.error( $str71$The_swappable_KB_index_visitor_di, v_context );
    }
    dump_swappable_kb_index_set_final_result( v_context );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 19505L)
  public static SubLObject dump_swappable_kb_index_valid_final_context(final SubLObject v_context)
  {
    return makeBoolean( NIL != list_utilities.property_list_p( v_context ) && NIL != file_vector.file_vector_p( conses_high.getf( v_context, $kw64$FILE_VECTOR, UNPROVIDED ) ) && ONE_INTEGER.numE( stacks.stack_size(
        conses_high.getf( v_context, $kw65$INDEX_STACK, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 19834L)
  public static SubLObject dump_swappable_kb_index_visitor_begin_subindex(final SubLObject visitor, final SubLObject sub_key, final SubLObject sub_index)
  {
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    dump_swappable_kb_index_push_current_key( v_context, sub_key );
    if( NIL != dumping_swappable_entire_kb_indexP( v_context ) )
    {
      dump_swappable_kb_index_push_current_index( v_context, kb_indexing_datastructures.clone_intermediate_index( sub_index ) );
    }
    else if( NIL != dumping_swappable_changed_kb_indexP( v_context ) )
    {
      dump_swappable_kb_index_push_current_index( v_context, sub_index );
    }
    else
    {
      Errors.error( $str72$Invalid_state_transition__the_ind );
    }
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 20704L)
  public static SubLObject dump_swappable_kb_index_visitor_note_final_index(final SubLObject visitor, final SubLObject final_key, SubLObject final_index)
  {
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    final SubLObject curr_index = dump_swappable_kb_index_get_current_index( v_context );
    if( NIL == kb_indexing_datastructures.final_topn_index_p( final_index ) )
    {
      if( NIL != kb_indexing_datastructures.final_sharded_index_p( final_index ) )
      {
        final SubLObject sharded_index = dump_swappable_kb_index_possibly_reshard_final_sharded_index( visitor, final_index );
        final_index = dump_swappable_kb_index_serialize_sharded_index( visitor, sharded_index );
      }
      else if( NIL != kb_indexing_datastructures.final_unified_index_p( final_index ) && NIL != kb_indexing_datastructures.final_unified_index_is_shardableP( final_index ) )
      {
        final SubLObject sharded_index = kb_indexing_datastructures.convert_final_simple_index_to_sharded_index( final_index );
        final_index = dump_swappable_kb_index_serialize_sharded_index( visitor, sharded_index );
      }
    }
    kb_indexing_datastructures.intermediate_index_set( curr_index, final_key, final_index );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 21951L)
  public static SubLObject dump_swappable_kb_index_visitor_end_subindex(final SubLObject visitor, final SubLObject sub_key, final SubLObject sub_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    final SubLObject curr_index = dump_swappable_kb_index_pop_current_index( v_context );
    final SubLObject fvector = dump_swappable_kb_index_get_file_vector( v_context );
    final SubLObject indexical = dump_swappable_kb_index_get_file_vector_indexical( v_context );
    dump_swappable_kb_index_pop_current_key( v_context, sub_key );
    SubLObject msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym73$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          sanity_check_constructed_index_equivalence( sub_index, curr_index );
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
      msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( msg.isString() )
    {
      Errors.error( $str74$Failed_to_sanity_check_key__A_s_s, sub_key, sub_index, curr_index );
    }
    if( NIL != $swap_out_intermediate_index_levelsP$.getDynamicValue( thread ) )
    {
      final SubLObject curr_map = kb_indexing_datastructures.intermediate_index_map( curr_index );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != file_vector_utilities.backed_map_p( curr_map ) )
      {
        Errors.error( $str75$Conversion_error__newly_created_m );
      }
      if( NIL != dumping_swappable_changed_kb_indexP( v_context ) )
      {
        file_vector_utilities.upgrade_map_to_file_vector_backed_map( curr_map, fvector, $kw76$SWAPPED_OUT );
      }
      else if( NIL != dumping_swappable_entire_kb_indexP( v_context ) )
      {
        file_vector_utilities.convert_map_to_file_vector_backed_map( curr_map, fvector, $kw76$SWAPPED_OUT, $kw77$COMPACT );
      }
      else
      {
        Errors.error( $str78$Invalid_state_transition__index_d );
      }
      final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map( curr_map, indexical );
      kb_indexing_datastructures.intermediate_index_replace_map( curr_index, backed_map );
    }
    final SubLObject parent_index = dump_swappable_kb_index_get_current_index( v_context );
    kb_indexing_datastructures.intermediate_index_set( parent_index, sub_key, curr_index );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 23999L)
  public static SubLObject dump_swappable_kb_index_serialize_sharded_index(final SubLObject visitor, final SubLObject sharded_index)
  {
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    final SubLObject fvector = dump_swappable_kb_index_get_file_vector( v_context );
    final SubLObject indexical = dump_swappable_kb_index_get_file_vector_indexical( v_context );
    if( NIL != dumping_swappable_entire_kb_indexP( v_context ) )
    {
      return kb_indexing_datastructures.final_sharded_index_to_fvector_backed_sharded_index( sharded_index, fvector, indexical );
    }
    if( NIL != dumping_swappable_changed_kb_indexP( v_context ) )
    {
      return kb_indexing_datastructures.update_fvector_backed_final_sharded_index( sharded_index, fvector, indexical );
    }
    Errors.error( $str78$Invalid_state_transition__index_d );
    return sharded_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 24743L)
  public static SubLObject dump_swappable_kb_index_possibly_reshard_final_sharded_index(final SubLObject visitor, final SubLObject final_index)
  {
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    if( NIL != dumping_swappable_entire_kb_indexP( v_context ) )
    {
      return kb_indexing_datastructures.reshard_final_sharded_index( final_index );
    }
    if( NIL != dumping_swappable_changed_kb_indexP( v_context ) )
    {
      return kb_indexing_datastructures.reorganize_modified_final_sharded_index( final_index );
    }
    Errors.error( $str78$Invalid_state_transition__index_d );
    return final_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 25268L)
  public static SubLObject sanity_check_constructed_index_equivalence(final SubLObject sub_index, final SubLObject curr_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject in_sub = map_utilities.maps_differ_in_keys( kb_indexing_datastructures.intermediate_index_map( sub_index ), kb_indexing_datastructures.intermediate_index_map( curr_index ), T );
    final SubLObject in_curr = thread.secondMultipleValue();
    final SubLObject shared = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == set.empty_set_p( in_sub ) || NIL == set.empty_set_p( in_curr ) )
    {
      SubLObject msg = NIL;
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        streams_high.write_string( $str79$Dumpable_index_construction_faile, stream, UNPROVIDED, UNPROVIDED );
        SubLObject set_contents_var = set.do_set_internal( in_sub );
        SubLObject basis_object;
        SubLObject state;
        SubLObject sub_key;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          sub_key = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, sub_key ) )
          {
            PrintLow.format( stream, $str80$____Key__A_was_not_copied_over_to, sub_key );
          }
        }
        set_contents_var = set.do_set_internal( in_curr );
        SubLObject curr_key;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          curr_key = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, curr_key ) )
          {
            PrintLow.format( stream, $str81$_A__Key__A_is_in_write_out_map_bu, curr_key );
          }
        }
        msg = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      Errors.error( msg );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26027L)
  public static SubLObject dump_swappable_kb_index_get_file_vector(final SubLObject v_context)
  {
    return conses_high.getf( v_context, $kw64$FILE_VECTOR, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26194L)
  public static SubLObject dump_swappable_kb_index_get_file_vector_indexical(final SubLObject v_context)
  {
    return conses_high.getf( v_context, $kw67$FVECTOR_INDEXICAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26389L)
  public static SubLObject dump_swappable_kb_index_pop_current_index(final SubLObject v_context)
  {
    final SubLObject index_stack = conses_high.getf( v_context, $kw65$INDEX_STACK, UNPROVIDED );
    return stacks.stack_pop( index_stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26587L)
  public static SubLObject dump_swappable_kb_index_push_current_index(final SubLObject v_context, final SubLObject sub_index_copy)
  {
    final SubLObject index_stack = conses_high.getf( v_context, $kw65$INDEX_STACK, UNPROVIDED );
    stacks.stack_push( sub_index_copy, index_stack );
    return v_context;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 26854L)
  public static SubLObject dump_swappable_kb_index_get_current_index(final SubLObject v_context)
  {
    final SubLObject index_stack = conses_high.getf( v_context, $kw65$INDEX_STACK, UNPROVIDED );
    return stacks.stack_peek( index_stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 27062L)
  public static SubLObject dump_swappable_kb_index_push_current_key(final SubLObject v_context, final SubLObject sub_key)
  {
    final SubLObject key_stack = conses_high.getf( v_context, $kw69$KEY_STACK, UNPROVIDED );
    stacks.stack_push( sub_key, key_stack );
    return v_context;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 27371L)
  public static SubLObject dump_swappable_kb_index_pop_current_key(final SubLObject v_context, final SubLObject sub_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject key_stack = conses_high.getf( v_context, $kw69$KEY_STACK, UNPROVIDED );
    final SubLObject curr_top = stacks.stack_peek( key_stack );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !sub_key.eql( curr_top ) )
    {
      Errors.error( $str82$Path_mis_alignment__trying_to_pop, sub_key, curr_top );
    }
    stacks.stack_pop( key_stack );
    return v_context;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 27831L)
  public static SubLObject dump_swappable_kb_index_get_current_key_path(final SubLObject v_context)
  {
    final SubLObject key_stack = conses_high.getf( v_context, $kw69$KEY_STACK, UNPROVIDED );
    final SubLObject contents = stacks.stack_elements( key_stack );
    return Sequences.nreverse( contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28036L)
  public static SubLObject dump_swappable_kb_index_get_final_result(final SubLObject v_context)
  {
    return conses_high.getf( v_context, $kw66$NEW_INDEX, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28178L)
  public static SubLObject dump_swappable_kb_index_set_final_result(final SubLObject v_context)
  {
    final SubLObject index_stack = conses_high.getf( v_context, $kw65$INDEX_STACK, UNPROVIDED );
    final SubLObject top_index = stacks.stack_peek( index_stack );
    conses_high.putf( v_context, $kw66$NEW_INDEX, kb_indexing_datastructures.intermediate_index_lookup( top_index, $kw53$INDEX_ROOT ) );
    return dump_swappable_kb_index_get_final_result( v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28761L)
  public static SubLObject note_precache_term(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_object ) || NIL != kb_indexing_datastructures.indexed_unrepresented_term_p( v_object ) )
    {
      return set.set_add( v_object, $precache_term_set$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/indexing-utilities.lisp", position = 28939L)
  public static SubLObject precache_predicate_extent(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      final SubLObject message_var = $str84$Gathering_assertions;
      final SubLObject start_time = utilities_macros.noting_elapsed_time_preamble( message_var );
      assertions = kb_mapping.gather_predicate_extent_index( predicate, UNPROVIDED, UNPROVIDED );
      assertions = assertion_utilities.sort_assertions( assertions );
      utilities_macros.noting_elapsed_time_postamble( message_var, start_time );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject term_set = set.new_set( Symbols.symbol_function( EQUAL ), number_utilities.f_2X( Sequences.length( assertions ) ) );
    final SubLObject _prev_bind_3 = $precache_term_set$.currentBinding( thread );
    try
    {
      $precache_term_set$.bind( term_set, thread );
      final SubLObject list_var = assertions;
      final SubLObject _prev_bind_0_$22 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str85$Precaching_assertions_and_gatheri, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject ass = NIL;
          ass = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            cycl_utilities.assertion_map( Symbols.symbol_function( $sym83$NOTE_PRECACHE_TERM ), ass, UNPROVIDED, UNPROVIDED );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            ass = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$22, thread );
      }
    }
    finally
    {
      $precache_term_set$.rebind( _prev_bind_3, thread );
    }
    SubLObject constants = NIL;
    SubLObject narts = NIL;
    SubLObject v_unrepresented_terms = NIL;
    final SubLObject set_contents_var = set.do_set_internal( term_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject v_term;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      v_term = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, v_term ) )
      {
        if( NIL != constant_handles.constant_p( v_term ) )
        {
          constants = ConsesLow.cons( v_term, constants );
        }
        else if( NIL != nart_handles.nart_p( v_term ) )
        {
          narts = ConsesLow.cons( v_term, narts );
        }
        else if( NIL != kb_indexing_datastructures.indexed_unrepresented_term_p( v_term ) )
        {
          v_unrepresented_terms = ConsesLow.cons( v_term, v_unrepresented_terms );
        }
      }
    }
    constants = Sort.sort( constants, Symbols.symbol_function( $sym87$_ ), Symbols.symbol_function( $sym88$CONSTANT_INTERNAL_ID ) );
    narts = Sort.sort( narts, Symbols.symbol_function( $sym87$_ ), Symbols.symbol_function( $sym89$NART_ID ) );
    v_unrepresented_terms = Sort.sort( v_unrepresented_terms, Symbols.symbol_function( $sym87$_ ), Symbols.symbol_function( $sym90$UNREPRESENTED_TERM_SUID ) );
    if( NIL != constants )
    {
      final SubLObject list_var2 = constants;
      final SubLObject _prev_bind_11 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_17 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_18 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str91$Precaching_constant_indexes, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var2 ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var2 = list_var2;
          SubLObject constant = NIL;
          constant = csome_list_var2.first();
          while ( NIL != csome_list_var2)
          {
            kb_indexing_datastructures.term_index( constant );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var2 = csome_list_var2.rest();
            constant = csome_list_var2.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_18, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_17, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_16, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_15, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_14, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_11, thread );
      }
    }
    if( NIL != narts )
    {
      final SubLObject list_var2 = narts;
      final SubLObject _prev_bind_11 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_17 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_18 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str92$Precaching_NART_indexes_and_formu, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var2 ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var2 = list_var2;
          SubLObject nart = NIL;
          nart = csome_list_var2.first();
          while ( NIL != csome_list_var2)
          {
            kb_indexing_datastructures.term_index( nart );
            narts_high.nart_hl_formula( nart );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var2 = csome_list_var2.rest();
            nart = csome_list_var2.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_18, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_17, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_16, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_15, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_14, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_11, thread );
      }
    }
    if( NIL != v_unrepresented_terms )
    {
      final SubLObject list_var2 = v_unrepresented_terms;
      final SubLObject _prev_bind_11 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_17 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_18 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str93$Precaching_unrepresented_term_ind, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var2 ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var2 = list_var2;
          SubLObject urt = NIL;
          urt = csome_list_var2.first();
          while ( NIL != csome_list_var2)
          {
            kb_indexing_datastructures.term_index( urt );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var2 = csome_list_var2.rest();
            urt = csome_list_var2.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_18, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_17, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_16, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_15, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_14, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_11, thread );
      }
    }
    return ConsesLow.list( $kw94$ASSERTION_COUNT, Sequences.length( assertions ), $kw95$CONSTANT_COUNT, Sequences.length( constants ), $kw96$NART_COUNT, Sequences.length( narts ), $kw97$UNREPRESENTED_TERM_COUNT,
        Sequences.length( v_unrepresented_terms ) );
  }

  public static SubLObject declare_indexing_utilities_file()
  {
    SubLFiles.declareFunction( me, "rule_with_some_pragmatic_somewhereP", "RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_with_some_pragmaticP", "RULE-WITH-SOME-PRAGMATIC?", 1, 1, false );
    SubLFiles.declareFunction( me, "rule_with_some_asserted_more_specifically_pragmaticP", "RULE-WITH-SOME-ASSERTED-MORE-SPECIFICALLY-PRAGMATIC?", 1, 1, false );
    SubLFiles.declareFunction( me, "find_all_assertions_genl_mts", "FIND-ALL-ASSERTIONS-GENL-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "dependent_narts", "DEPENDENT-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_of_unit_assertion_mentioning_fortP", "TERM-OF-UNIT-ASSERTION-MENTIONING-FORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "nested_non_atomic_terms", "NESTED-NON-ATOMIC-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "sort_gafs_for_removal", "SORT-GAFS-FOR-REMOVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_remove_beforeP", "GAF-REMOVE-BEFORE?", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_removal_order", "GAF-REMOVAL-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "complex_index_visitor_print_function_trampoline", "COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_index_visitor_p", "COMPLEX-INDEX-VISITOR-P", 1, 0, false );
    new $complex_index_visitor_p$UnaryFunction();
    SubLFiles.declareFunction( me, "compinx_visit_begin_subindex_fn", "COMPINX-VISIT-BEGIN-SUBINDEX-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "compinx_visit_end_subindex_fn", "COMPINX-VISIT-END-SUBINDEX-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "compinx_visit_note_final_index_fn", "COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "compinx_visit_begin_visit_fn", "COMPINX-VISIT-BEGIN-VISIT-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "compinx_visit_end_visit_fn", "COMPINX-VISIT-END-VISIT-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "compinx_visit_param", "COMPINX-VISIT-PARAM", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_compinx_visit_begin_subindex_fn", "_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_compinx_visit_end_subindex_fn", "_CSETF-COMPINX-VISIT-END-SUBINDEX-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_compinx_visit_note_final_index_fn", "_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_compinx_visit_begin_visit_fn", "_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_compinx_visit_end_visit_fn", "_CSETF-COMPINX-VISIT-END-VISIT-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_compinx_visit_param", "_CSETF-COMPINX-VISIT-PARAM", 2, 0, false );
    SubLFiles.declareFunction( me, "make_complex_index_visitor", "MAKE-COMPLEX-INDEX-VISITOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_complex_index_visitor", "VISIT-DEFSTRUCT-COMPLEX-INDEX-VISITOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_complex_index_visitor_method", "VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_complex_index_visitor", "PRINT-COMPLEX-INDEX-VISITOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_complex_index_visitor", "NEW-COMPLEX-INDEX-VISITOR", 5, 1, false );
    SubLFiles.declareFunction( me, "complex_index_visitor_begin_visit", "COMPLEX-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_index_visitor_end_visit", "COMPLEX-INDEX-VISITOR-END-VISIT", 2, 0, false );
    SubLFiles.declareFunction( me, "show_complex_index_visitor_final_index", "SHOW-COMPLEX-INDEX-VISITOR-FINAL-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "show_complex_index_visitor_subindex_begin", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-BEGIN", 3, 0, false );
    SubLFiles.declareFunction( me, "show_complex_index_visitor_subindex_end", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-END", 3, 0, false );
    SubLFiles.declareFunction( me, "set_complex_index_visitor_parameter", "SET-COMPLEX-INDEX-VISITOR-PARAMETER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_complex_index_visitor_parameter", "GET-COMPLEX-INDEX-VISITOR-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "visit_complex_index", "VISIT-COMPLEX-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_complex_subindex", "VISIT-COMPLEX-SUBINDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "visit_changed_complex_index", "VISIT-CHANGED-COMPLEX-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_changed_complex_subindex", "VISIT-CHANGED-COMPLEX-SUBINDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_entire_swappable_complex_index", "DUMP-ENTIRE-SWAPPABLE-COMPLEX-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_changed_swappable_complex_index", "DUMP-CHANGED-SWAPPABLE-COMPLEX-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "new_swappable_kb_index_dump_visitor", "NEW-SWAPPABLE-KB-INDEX-DUMP-VISITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_visitor_begin_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_new_context", "DUMP-SWAPPABLE-KB-INDEX-NEW-CONTEXT", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_valid_initial_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-INITIAL-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "dumping_swappable_changed_kb_indexP", "DUMPING-SWAPPABLE-CHANGED-KB-INDEX?", 1, 0, false );
    SubLFiles.declareFunction( me, "dumping_swappable_entire_kb_indexP", "DUMPING-SWAPPABLE-ENTIRE-KB-INDEX?", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_visitor_end_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_valid_final_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-FINAL-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_visitor_begin_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_visitor_note_final_index", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_visitor_end_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_serialize_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-SERIALIZE-SHARDED-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_possibly_reshard_final_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-POSSIBLY-RESHARD-FINAL-SHARDED-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "sanity_check_constructed_index_equivalence", "SANITY-CHECK-CONSTRUCTED-INDEX-EQUIVALENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_get_file_vector", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_get_file_vector_indexical", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_pop_current_index", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_push_current_index", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_get_current_index", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_push_current_key", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_pop_current_key", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_get_current_key_path", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-KEY-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_get_final_result", "DUMP-SWAPPABLE-KB-INDEX-GET-FINAL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_swappable_kb_index_set_final_result", "DUMP-SWAPPABLE-KB-INDEX-SET-FINAL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_precache_term", "NOTE-PRECACHE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "precache_predicate_extent", "PRECACHE-PREDICATE-EXTENT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_indexing_utilities_file()
  {
    $term_being_removed$ = SubLFiles.defparameter( "*TERM-BEING-REMOVED*", $kw8$UNINITIALIZED );
    $dtp_complex_index_visitor$ = SubLFiles.defconstant( "*DTP-COMPLEX-INDEX-VISITOR*", $sym14$COMPLEX_INDEX_VISITOR );
    $swap_out_intermediate_index_levelsP$ = SubLFiles.defparameter( "*SWAP-OUT-INTERMEDIATE-INDEX-LEVELS?*", T );
    $precache_term_set$ = SubLFiles.defparameter( "*PRECACHE-TERM-SET*", $kw8$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_indexing_utilities_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_complex_index_visitor$.getGlobalValue(), Symbols.symbol_function( $sym21$COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list22 );
    Structures.def_csetf( $sym23$COMPINX_VISIT_BEGIN_SUBINDEX_FN, $sym24$_CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN );
    Structures.def_csetf( $sym25$COMPINX_VISIT_END_SUBINDEX_FN, $sym26$_CSETF_COMPINX_VISIT_END_SUBINDEX_FN );
    Structures.def_csetf( $sym27$COMPINX_VISIT_NOTE_FINAL_INDEX_FN, $sym28$_CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN );
    Structures.def_csetf( $sym29$COMPINX_VISIT_BEGIN_VISIT_FN, $sym30$_CSETF_COMPINX_VISIT_BEGIN_VISIT_FN );
    Structures.def_csetf( $sym31$COMPINX_VISIT_END_VISIT_FN, $sym32$_CSETF_COMPINX_VISIT_END_VISIT_FN );
    Structures.def_csetf( $sym33$COMPINX_VISIT_PARAM, $sym34$_CSETF_COMPINX_VISIT_PARAM );
    Equality.identity( $sym14$COMPLEX_INDEX_VISITOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_complex_index_visitor$.getGlobalValue(), Symbols.symbol_function(
        $sym46$VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym83$NOTE_PRECACHE_TERM );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_indexing_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_indexing_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_indexing_utilities_file();
  }
  static
  {
    me = new indexing_utilities();
    $term_being_removed$ = null;
    $dtp_complex_index_visitor$ = null;
    $swap_out_intermediate_index_levelsP$ = null;
    $precache_term_set$ = null;
    $sym0$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const1$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw2$RULE = makeKeyword( "RULE" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forwardNonTriggerLiteral" ) ), constant_handles.reader_make_constant_shell( makeString( "forwardTriggerLiteral" ) ) );
    $sym4$FORT_P = makeSymbol( "FORT-P" );
    $kw5$GAF = makeKeyword( "GAF" );
    $int6$_2 = makeInteger( -2 );
    $kw7$IGNORE = makeKeyword( "IGNORE" );
    $kw8$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym9$_EXIT = makeSymbol( "%EXIT" );
    $sym10$GAF_REMOVE_BEFORE_ = makeSymbol( "GAF-REMOVE-BEFORE?" );
    $const11$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const12$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const13$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym14$COMPLEX_INDEX_VISITOR = makeSymbol( "COMPLEX-INDEX-VISITOR" );
    $sym15$COMPLEX_INDEX_VISITOR_P = makeSymbol( "COMPLEX-INDEX-VISITOR-P" );
    $list16 = ConsesLow.list( makeSymbol( "BEGIN-SUBINDEX-FN" ), makeSymbol( "END-SUBINDEX-FN" ), makeSymbol( "NOTE-FINAL-INDEX-FN" ), makeSymbol( "BEGIN-VISIT-FN" ), makeSymbol( "END-VISIT-FN" ), makeSymbol(
        "PARAM" ) );
    $list17 = ConsesLow.list( makeKeyword( "BEGIN-SUBINDEX-FN" ), makeKeyword( "END-SUBINDEX-FN" ), makeKeyword( "NOTE-FINAL-INDEX-FN" ), makeKeyword( "BEGIN-VISIT-FN" ), makeKeyword( "END-VISIT-FN" ), makeKeyword(
        "PARAM" ) );
    $list18 = ConsesLow.list( makeSymbol( "COMPINX-VISIT-BEGIN-SUBINDEX-FN" ), makeSymbol( "COMPINX-VISIT-END-SUBINDEX-FN" ), makeSymbol( "COMPINX-VISIT-NOTE-FINAL-INDEX-FN" ), makeSymbol(
        "COMPINX-VISIT-BEGIN-VISIT-FN" ), makeSymbol( "COMPINX-VISIT-END-VISIT-FN" ), makeSymbol( "COMPINX-VISIT-PARAM" ) );
    $list19 = ConsesLow.list( makeSymbol( "_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN" ), makeSymbol( "_CSETF-COMPINX-VISIT-END-SUBINDEX-FN" ), makeSymbol( "_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN" ), makeSymbol(
        "_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN" ), makeSymbol( "_CSETF-COMPINX-VISIT-END-VISIT-FN" ), makeSymbol( "_CSETF-COMPINX-VISIT-PARAM" ) );
    $sym20$PRINT_COMPLEX_INDEX_VISITOR = makeSymbol( "PRINT-COMPLEX-INDEX-VISITOR" );
    $sym21$COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list22 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "COMPLEX-INDEX-VISITOR-P" ) );
    $sym23$COMPINX_VISIT_BEGIN_SUBINDEX_FN = makeSymbol( "COMPINX-VISIT-BEGIN-SUBINDEX-FN" );
    $sym24$_CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN = makeSymbol( "_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN" );
    $sym25$COMPINX_VISIT_END_SUBINDEX_FN = makeSymbol( "COMPINX-VISIT-END-SUBINDEX-FN" );
    $sym26$_CSETF_COMPINX_VISIT_END_SUBINDEX_FN = makeSymbol( "_CSETF-COMPINX-VISIT-END-SUBINDEX-FN" );
    $sym27$COMPINX_VISIT_NOTE_FINAL_INDEX_FN = makeSymbol( "COMPINX-VISIT-NOTE-FINAL-INDEX-FN" );
    $sym28$_CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN = makeSymbol( "_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN" );
    $sym29$COMPINX_VISIT_BEGIN_VISIT_FN = makeSymbol( "COMPINX-VISIT-BEGIN-VISIT-FN" );
    $sym30$_CSETF_COMPINX_VISIT_BEGIN_VISIT_FN = makeSymbol( "_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN" );
    $sym31$COMPINX_VISIT_END_VISIT_FN = makeSymbol( "COMPINX-VISIT-END-VISIT-FN" );
    $sym32$_CSETF_COMPINX_VISIT_END_VISIT_FN = makeSymbol( "_CSETF-COMPINX-VISIT-END-VISIT-FN" );
    $sym33$COMPINX_VISIT_PARAM = makeSymbol( "COMPINX-VISIT-PARAM" );
    $sym34$_CSETF_COMPINX_VISIT_PARAM = makeSymbol( "_CSETF-COMPINX-VISIT-PARAM" );
    $kw35$BEGIN_SUBINDEX_FN = makeKeyword( "BEGIN-SUBINDEX-FN" );
    $kw36$END_SUBINDEX_FN = makeKeyword( "END-SUBINDEX-FN" );
    $kw37$NOTE_FINAL_INDEX_FN = makeKeyword( "NOTE-FINAL-INDEX-FN" );
    $kw38$BEGIN_VISIT_FN = makeKeyword( "BEGIN-VISIT-FN" );
    $kw39$END_VISIT_FN = makeKeyword( "END-VISIT-FN" );
    $kw40$PARAM = makeKeyword( "PARAM" );
    $str41$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw42$BEGIN = makeKeyword( "BEGIN" );
    $sym43$MAKE_COMPLEX_INDEX_VISITOR = makeSymbol( "MAKE-COMPLEX-INDEX-VISITOR" );
    $kw44$SLOT = makeKeyword( "SLOT" );
    $kw45$END = makeKeyword( "END" );
    $sym46$VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD" );
    $str47$__CompInxVisit__ = makeString( " (CompInxVisit: " );
    $str48$__SubIndex__ = makeString( " (SubIndex: " );
    $str49$_FinalIndex__ = makeString( " FinalIndex: " );
    $str50$_ = makeString( " " );
    $str51$__ = makeString( ") " );
    $str52$__Param__ = makeString( ") Param: " );
    $kw53$INDEX_ROOT = makeKeyword( "INDEX-ROOT" );
    $list54 = ConsesLow.list( makeSymbol( "I-KEY" ), makeSymbol( "I-INDEX" ) );
    $str55$Illegal_state_exception__Index_co = makeString( "Illegal state exception: Index contains object ~A under ~A, which is neither a FINAL nor an INTERMEDIATE index." );
    $kw56$ENTIRE = makeKeyword( "ENTIRE" );
    $kw57$CHANGED = makeKeyword( "CHANGED" );
    $sym58$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT = makeSymbol( "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT" );
    $sym59$DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX = makeSymbol( "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX" );
    $sym60$DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX = makeSymbol( "DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX" );
    $sym61$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX = makeSymbol( "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX" );
    $sym62$DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT = makeSymbol( "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT" );
    $str63$The_swappable_KB_index_visitor_is = makeString( "The swappable KB index visitor is not properly setup; initial context ~S is bogus." );
    $kw64$FILE_VECTOR = makeKeyword( "FILE-VECTOR" );
    $kw65$INDEX_STACK = makeKeyword( "INDEX-STACK" );
    $kw66$NEW_INDEX = makeKeyword( "NEW-INDEX" );
    $kw67$FVECTOR_INDEXICAL = makeKeyword( "FVECTOR-INDEXICAL" );
    $kw68$STYLE = makeKeyword( "STYLE" );
    $kw69$KEY_STACK = makeKeyword( "KEY-STACK" );
    $kw70$NONE = makeKeyword( "NONE" );
    $str71$The_swappable_KB_index_visitor_di = makeString( "The swappable KB index visitor did not complete properly; final context ~S is bogus." );
    $str72$Invalid_state_transition__the_ind = makeString( "Invalid state transition--the index dump style is neither changed nor entire???" );
    $sym73$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str74$Failed_to_sanity_check_key__A_s_s = makeString( "Failed to sanity check key ~A's sub-index ~A against recreated ~A.~%" );
    $str75$Conversion_error__newly_created_m = makeString( "Conversion error--newly created maps should not be backed already." );
    $kw76$SWAPPED_OUT = makeKeyword( "SWAPPED-OUT" );
    $kw77$COMPACT = makeKeyword( "COMPACT" );
    $str78$Invalid_state_transition__index_d = makeString( "Invalid state transition--index dump style is neither changed nor entire???" );
    $str79$Dumpable_index_construction_faile = makeString( "Dumpable index-construction failed:" );
    $str80$____Key__A_was_not_copied_over_to = makeString( "~&  Key ~A was not copied over to write-out map.~%" );
    $str81$_A__Key__A_is_in_write_out_map_bu = makeString( "~A  Key ~A is in write-out map but not in sub-index.~%" );
    $str82$Path_mis_alignment__trying_to_pop = makeString( "Path mis-alignment; trying to pop ~A but top of stack is ~A.~%" );
    $sym83$NOTE_PRECACHE_TERM = makeSymbol( "NOTE-PRECACHE-TERM" );
    $str84$Gathering_assertions = makeString( "Gathering assertions" );
    $str85$Precaching_assertions_and_gatheri = makeString( "Precaching assertions and gathering terms" );
    $str86$cdolist = makeString( "cdolist" );
    $sym87$_ = makeSymbol( "<" );
    $sym88$CONSTANT_INTERNAL_ID = makeSymbol( "CONSTANT-INTERNAL-ID" );
    $sym89$NART_ID = makeSymbol( "NART-ID" );
    $sym90$UNREPRESENTED_TERM_SUID = makeSymbol( "UNREPRESENTED-TERM-SUID" );
    $str91$Precaching_constant_indexes = makeString( "Precaching constant indexes" );
    $str92$Precaching_NART_indexes_and_formu = makeString( "Precaching NART indexes and formulas" );
    $str93$Precaching_unrepresented_term_ind = makeString( "Precaching unrepresented term indexes" );
    $kw94$ASSERTION_COUNT = makeKeyword( "ASSERTION-COUNT" );
    $kw95$CONSTANT_COUNT = makeKeyword( "CONSTANT-COUNT" );
    $kw96$NART_COUNT = makeKeyword( "NART-COUNT" );
    $kw97$UNREPRESENTED_TERM_COUNT = makeKeyword( "UNREPRESENTED-TERM-COUNT" );
  }

  public static final class $complex_index_visitor_native
      extends
        SubLStructNative
  {
    public SubLObject $begin_subindex_fn;
    public SubLObject $end_subindex_fn;
    public SubLObject $note_final_index_fn;
    public SubLObject $begin_visit_fn;
    public SubLObject $end_visit_fn;
    public SubLObject $param;
    private static final SubLStructDeclNative structDecl;

    public $complex_index_visitor_native()
    {
      this.$begin_subindex_fn = CommonSymbols.NIL;
      this.$end_subindex_fn = CommonSymbols.NIL;
      this.$note_final_index_fn = CommonSymbols.NIL;
      this.$begin_visit_fn = CommonSymbols.NIL;
      this.$end_visit_fn = CommonSymbols.NIL;
      this.$param = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $complex_index_visitor_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$begin_subindex_fn;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$end_subindex_fn;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$note_final_index_fn;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$begin_visit_fn;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$end_visit_fn;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$param;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$begin_subindex_fn = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$end_subindex_fn = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$note_final_index_fn = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$begin_visit_fn = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$end_visit_fn = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$param = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $complex_index_visitor_native.class, $sym14$COMPLEX_INDEX_VISITOR, $sym15$COMPLEX_INDEX_VISITOR_P, $list16, $list17, new String[] { "$begin_subindex_fn",
        "$end_subindex_fn", "$note_final_index_fn", "$begin_visit_fn", "$end_visit_fn", "$param"
      }, $list18, $list19, $sym20$PRINT_COMPLEX_INDEX_VISITOR );
    }
  }

  public static final class $complex_index_visitor_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $complex_index_visitor_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "COMPLEX-INDEX-VISITOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return complex_index_visitor_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 696 ms
 * 
 */