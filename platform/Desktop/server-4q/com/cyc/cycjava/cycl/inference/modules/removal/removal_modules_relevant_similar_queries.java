package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.constraint_filters;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.query_library_utils;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_relevant_similar_queries
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries";
  public static final String myFingerPrint = "533e7a15ff2b19edd221092ce58c1e844a1ed6b4c074d1e66d20ddd06ac338f4";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 9169L)
  public static SubLSymbol $pertinent_query_sentence_with_terms_cost$;
  private static final SubLList $list0;
  private static final SubLFloat $float1$0_25;
  private static final SubLList $list2;
  private static final SubLFloat $float3$0_5;
  private static final SubLList $list4;
  private static final SubLFloat $float5$0_75;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLObject $const8$querySpecificationForFormulaTempl;
  private static final SubLSymbol $kw9$GAF;
  private static final SubLObject $const10$pertinentQuerySentenceWithTerms;
  private static final SubLSymbol $kw11$POS;
  private static final SubLSymbol $kw12$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$_X;
  private static final SubLObject $const15$elementOf;
  private static final SubLObject $const16$termInSentenceOfQuerySpecificatio;
  private static final SubLSymbol $kw17$TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2;
  private static final SubLList $list18;
  private static final SubLObject $const19$folderContainsResource;
  private static final SubLObject $const20$sentenceParameterValueInSpecifica;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$EQUALS_EL_;
  private static final SubLSymbol $sym25$FIRST;
  private static final SubLSymbol $sym26$SUBSTITUTION_GATHER_TERM;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 8343L)
  public static SubLObject relevance_for_query(final SubLObject query)
  {
    final SubLObject weight = query_library_utils.ql_parse_weight( query );
    if( ZERO_INTEGER.numE( weight ) )
    {
      return narts_high.nart_substitute( $list0 );
    }
    if( $float1$0_25.numGE( weight ) )
    {
      return narts_high.nart_substitute( $list2 );
    }
    if( $float3$0_5.numGE( weight ) )
    {
      return narts_high.nart_substitute( $list4 );
    }
    if( $float5$0_75.numGE( weight ) )
    {
      return narts_high.nart_substitute( $list6 );
    }
    return narts_high.nart_substitute( $list7 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 8917L)
  public static SubLObject formula_for_query(final SubLObject query)
  {
    SubLObject result = NIL;
    SubLObject query_spec = NIL;
    final SubLObject pred_var = $const8$querySpecificationForFormulaTempl;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query, ONE_INTEGER, pred_var );
      SubLObject done_var = result;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, NIL, NIL );
            SubLObject done_var_$1 = result;
            final SubLObject token_var_$2 = NIL;
            while ( NIL == done_var_$1)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
              final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
              if( NIL != valid_$3 )
              {
                query_spec = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                result = kb_query.kbq_sentence( query_spec );
              }
              done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != result );
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
        done_var = makeBoolean( NIL == valid || NIL != result );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 10821L)
  public static SubLObject pertinent_query_sentences_with_terms(final SubLObject sentence, final SubLObject term_set)
  {
    final SubLObject term_list = ask_utilities.query_variable( $sym14$_X, ConsesLow.list( $const15$elementOf, $sym14$_X, term_set ), UNPROVIDED, UNPROVIDED );
    final SubLObject raw_result = substitute_query_terms_into_cycl( el_utilities.possibly_unquote( sentence ), term_list, T );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = raw_result;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( el_utilities.possibly_quote( item.first() ), conses_high.third( item ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 13154L)
  public static SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_cost(final SubLObject asent)
  {
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 13320L)
  public static SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_iterator(final SubLObject v_term, final SubLObject folder_type)
  {
    return iteration.new_list_iterator( term_in_sentence_of_query_specification_of_type_pos_unify_arg2( v_term, folder_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 13539L)
  public static SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2(final SubLObject v_term, final SubLObject folder_type)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = isa.all_fort_instances( folder_type, UNPROVIDED, UNPROVIDED );
    SubLObject folder = NIL;
    folder = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_var = $const19$folderContainsResource;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( folder, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( folder, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, NIL, NIL );
              SubLObject done_var_$4 = NIL;
              final SubLObject token_var_$5 = NIL;
              while ( NIL == done_var_$4)
              {
                final SubLObject fcr_ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( fcr_ass ) );
                if( NIL != valid_$6 )
                {
                  final SubLObject template = cycl_utilities.formula_arg2( fcr_ass, UNPROVIDED );
                  final SubLObject pred_var_$7 = $const8$querySpecificationForFormulaTempl;
                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( template, ONE_INTEGER, pred_var_$7 ) )
                  {
                    final SubLObject iterator_var_$8 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( template, ONE_INTEGER, pred_var_$7 );
                    SubLObject done_var_$5 = NIL;
                    final SubLObject token_var_$6 = NIL;
                    while ( NIL == done_var_$5)
                    {
                      final SubLObject final_index_spec_$11 = iteration.iteration_next_without_values_macro_helper( iterator_var_$8, token_var_$6 );
                      final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( final_index_spec_$11 ) );
                      if( NIL != valid_$7 )
                      {
                        SubLObject final_index_iterator_$13 = NIL;
                        try
                        {
                          final_index_iterator_$13 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$11, $kw9$GAF, NIL, NIL );
                          SubLObject done_var_$6 = NIL;
                          final SubLObject token_var_$7 = NIL;
                          while ( NIL == done_var_$6)
                          {
                            final SubLObject qsfft_ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$13, token_var_$7 );
                            final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( qsfft_ass ) );
                            if( NIL != valid_$8 )
                            {
                              final SubLObject cycl_q_spec = cycl_utilities.formula_arg2( qsfft_ass, UNPROVIDED );
                              final SubLObject pred_var_$8 = $const20$sentenceParameterValueInSpecifica;
                              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( cycl_q_spec, TWO_INTEGER, pred_var_$8 ) )
                              {
                                final SubLObject iterator_var_$9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( cycl_q_spec, TWO_INTEGER, pred_var_$8 );
                                SubLObject done_var_$7 = NIL;
                                final SubLObject token_var_$8 = NIL;
                                while ( NIL == done_var_$7)
                                {
                                  final SubLObject final_index_spec_$12 = iteration.iteration_next_without_values_macro_helper( iterator_var_$9, token_var_$8 );
                                  final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( final_index_spec_$12 ) );
                                  if( NIL != valid_$9 )
                                  {
                                    SubLObject final_index_iterator_$14 = NIL;
                                    try
                                    {
                                      final_index_iterator_$14 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$12, $kw9$GAF, NIL, NIL );
                                      SubLObject done_var_$8 = NIL;
                                      final SubLObject token_var_$9 = NIL;
                                      while ( NIL == done_var_$8)
                                      {
                                        final SubLObject spvis_ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$14, token_var_$9 );
                                        final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( spvis_ass ) );
                                        if( NIL != valid_$10 && NIL != cycl_utilities.expression_find( v_term, cycl_utilities.formula_arg1( spvis_ass, UNPROVIDED ), T, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                                        {
                                          result = ConsesLow.cons( cycl_q_spec, result );
                                        }
                                        done_var_$8 = makeBoolean( NIL == valid_$10 );
                                      }
                                    }
                                    finally
                                    {
                                      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                                      try
                                      {
                                        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if( NIL != final_index_iterator_$14 )
                                        {
                                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$14 );
                                        }
                                        Values.restoreValuesFromVector( _values );
                                      }
                                      finally
                                      {
                                        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                                      }
                                    }
                                  }
                                  done_var_$7 = makeBoolean( NIL == valid_$9 );
                                }
                              }
                            }
                            done_var_$6 = makeBoolean( NIL == valid_$8 );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                          try
                          {
                            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if( NIL != final_index_iterator_$13 )
                            {
                              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$13 );
                            }
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
                          }
                        }
                      }
                      done_var_$5 = makeBoolean( NIL == valid_$7 );
                    }
                  }
                }
                done_var_$4 = makeBoolean( NIL == valid_$6 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_3 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values3 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_3 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      folder = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 14225L)
  public static SubLObject substitute_sentence_terms_into_query(final SubLObject cycl, final SubLObject sentence_string)
  {
    final SubLObject term_list = concept_tagger.all_tagged_concepts( sentence_string, UNPROVIDED );
    return substitute_query_terms_into_cycl( cycl, term_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 14544L)
  public static SubLObject substitute_query(final SubLObject cycl, final SubLObject strings, final SubLObject mt)
  {
    final SubLObject term_list = query_subst_string_denots( strings );
    return substitute_query_terms_into_cycl( cycl, term_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 14791L)
  public static SubLObject substitute_query_terms_into_cycl(final SubLObject cycl, final SubLObject term_list, SubLObject all_permutationsP)
  {
    if( all_permutationsP == UNPROVIDED )
    {
      all_permutationsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_poses_for_possible_subst = query_subst_find_substitutable_terms( cycl );
    SubLObject sub_list = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject cdolist_list_var = arg_poses_for_possible_subst;
      SubLObject argpos_to_replace = NIL;
      argpos_to_replace = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject possible_substitutions_for_argpos = NIL;
        SubLObject cdolist_list_var_$27 = term_list;
        SubLObject term_from_list = NIL;
        term_from_list = cdolist_list_var_$27.first();
        while ( NIL != cdolist_list_var_$27)
        {
          final SubLObject substitution_score = substitution_weight( cycl, argpos_to_replace, term_from_list, UNPROVIDED );
          if( substitution_score.numG( ZERO_INTEGER ) )
          {
            possible_substitutions_for_argpos = ConsesLow.cons( ConsesLow.list( term_from_list, substitution_score ), possible_substitutions_for_argpos );
          }
          cdolist_list_var_$27 = cdolist_list_var_$27.rest();
          term_from_list = cdolist_list_var_$27.first();
        }
        if( NIL != possible_substitutions_for_argpos )
        {
          sub_list = ConsesLow.cons( ConsesLow.list( argpos_to_replace, possible_substitutions_for_argpos ), sub_list );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argpos_to_replace = cdolist_list_var.first();
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    SubLObject current_cycls = NIL;
    SubLObject new_cycls = ConsesLow.list( ConsesLow.list( cycl, ONE_INTEGER, ZERO_INTEGER ) );
    SubLObject result = NIL;
    SubLObject final_round = NIL;
    final SubLObject final_subst = conses_high.last( sub_list, UNPROVIDED ).first();
    SubLObject cdolist_list_var2 = sub_list;
    SubLObject arg_pos_subst_options = NIL;
    arg_pos_subst_options = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( arg_pos_subst_options.equal( final_subst ) )
      {
        final_round = T;
      }
      SubLObject current;
      final SubLObject datum = current = arg_pos_subst_options;
      SubLObject arg_pos = NIL;
      SubLObject substitutions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      arg_pos = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      substitutions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$28;
        current_cycls = ( cdolist_list_var_$28 = new_cycls );
        SubLObject current_cycl = NIL;
        current_cycl = cdolist_list_var_$28.first();
        while ( NIL != cdolist_list_var_$28)
        {
          SubLObject current_$30;
          final SubLObject datum_$29 = current_$30 = current_cycl;
          SubLObject formula = NIL;
          SubLObject formula_weight = NIL;
          SubLObject substitution_count = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list22 );
          formula = current_$30.first();
          current_$30 = current_$30.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list22 );
          formula_weight = current_$30.first();
          current_$30 = current_$30.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list22 );
          substitution_count = current_$30.first();
          current_$30 = current_$30.rest();
          if( NIL == current_$30 )
          {
            SubLObject cdolist_list_var_$29 = substitutions;
            SubLObject substitution = NIL;
            substitution = cdolist_list_var_$29.first();
            while ( NIL != cdolist_list_var_$29)
            {
              SubLObject current_$31;
              final SubLObject datum_$30 = current_$31 = substitution;
              SubLObject v_term = NIL;
              SubLObject subst_weight = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list23 );
              v_term = current_$31.first();
              current_$31 = current_$31.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list23 );
              subst_weight = current_$31.first();
              current_$31 = current_$31.rest();
              if( NIL == current_$31 )
              {
                if( NIL == term_already_in_literalP( v_term, arg_pos, formula ) )
                {
                  final SubLObject substituted_entry = ConsesLow.list( cycl_utilities.formula_arg_position_subst( v_term, arg_pos, formula ), Numbers.multiply( subst_weight, formula_weight ), number_utilities.f_1X(
                      substitution_count ) );
                  new_cycls = ConsesLow.cons( substituted_entry, new_cycls );
                  if( NIL != final_round || NIL != all_permutationsP )
                  {
                    result = ConsesLow.cons( substituted_entry, result );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$30, $list23 );
              }
              cdolist_list_var_$29 = cdolist_list_var_$29.rest();
              substitution = cdolist_list_var_$29.first();
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$29, $list22 );
          }
          cdolist_list_var_$28 = cdolist_list_var_$28.rest();
          current_cycl = cdolist_list_var_$28.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      arg_pos_subst_options = cdolist_list_var2.first();
    }
    return Sequences.remove_duplicates( result, $sym24$EQUALS_EL_, $sym25$FIRST, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 16668L)
  public static SubLObject query_subst_string_denots(final SubLObject strings)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject denots = lexicon_accessors.denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != denots )
      {
        result = Sequences.cconcatenate( denots, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 16967L)
  public static SubLObject query_subst_find_substitutable_terms(final SubLObject cycl)
  {
    SubLObject result = NIL;
    final SubLObject free_vars = el_utilities.sentence_free_variables( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject terms = cycl_utilities.expression_gather( cycl, $sym26$SUBSTITUTION_GATHER_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = Sequences.cconcatenate( terms, free_vars );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = Sequences.cconcatenate( cycl_utilities.arg_positions_dfs( v_term, cycl, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 17467L)
  public static SubLObject substitution_gather_term(final SubLObject v_term)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_denotational_term_p( v_term ) && NIL == fort_types_interface.relation_p( v_term ) && !v_term.isString() && NIL == cycl_grammar.cycl_variable_p( v_term )
        && NIL == fort_types_interface.microtheory_p( v_term ) && NIL == hlmt.time_parameterP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 17736L)
  public static SubLObject substitution_weight(final SubLObject cycl, final SubLObject arg_pos, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject result = filter_unsubstitutable_terms_for_argpos( arg_pos, cycl, mt, ConsesLow.list( v_term ), T );
    if( NIL != result )
    {
      return ONE_INTEGER;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 18224L)
  public static SubLObject filter_unsubstitutable_terms_for_argpos(final SubLObject arg_pos, final SubLObject formula, final SubLObject mt, final SubLObject terms, SubLObject restrict_multiplesP)
  {
    if( restrict_multiplesP == UNPROVIDED )
    {
      restrict_multiplesP = NIL;
    }
    SubLObject heuristically_reasonable_terms = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != meets_heuristic_substitution_constraints( v_term, formula, arg_pos, mt, restrict_multiplesP ) )
      {
        heuristically_reasonable_terms = ConsesLow.cons( v_term, heuristically_reasonable_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return constraint_filters.filter_terms_for_arg_constraints_at_argpos( arg_pos, formula, mt, heuristically_reasonable_terms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 18661L)
  public static SubLObject meets_heuristic_substitution_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject arg_pos, final SubLObject mt, final SubLObject restrict_multiplesP)
  {
    final SubLObject original_term = cycl_utilities.formula_arg_position( formula, arg_pos, UNPROVIDED );
    if( NIL != cycl_grammar.cycl_variable_p( original_term ) )
    {
      return makeBoolean( NIL == restrict_multiplesP || NIL == term_already_in_literalP( v_term, arg_pos, formula ) );
    }
    return makeBoolean( NIL != terms_of_same_orderP( v_term, original_term ) && NIL == disjoint_with.disjoint_withP( v_term, original_term, mt, UNPROVIDED ) && ( NIL == restrict_multiplesP
        || NIL == term_already_in_literalP( v_term, arg_pos, formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 19198L)
  public static SubLObject term_already_in_literalP(final SubLObject v_term, final SubLObject arg_pos, final SubLObject sentence)
  {
    return subl_promotions.memberP( v_term, cycl_utilities.formula_arg_position( sentence, conses_high.butlast( arg_pos, UNPROVIDED ), UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 19338L)
  public static SubLObject terms_of_same_orderP(final SubLObject term1, final SubLObject term2)
  {
    return Equality.eql( my_term_order( term1 ), my_term_order( term2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp", position = 19449L)
  public static SubLObject my_term_order(final SubLObject v_term)
  {
    if( NIL != kb_accessors.individualP( v_term ) )
    {
      return ZERO_INTEGER;
    }
    return ONE_INTEGER;
  }

  public static SubLObject declare_removal_modules_relevant_similar_queries_file()
  {
    SubLFiles.declareFunction( me, "relevance_for_query", "RELEVANCE-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_for_query", "FORMULA-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "pertinent_query_sentences_with_terms", "PERTINENT-QUERY-SENTENCES-WITH-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "term_in_sentence_of_query_specification_of_type_pos_unify_arg2_cost", "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "term_in_sentence_of_query_specification_of_type_pos_unify_arg2_iterator", "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "term_in_sentence_of_query_specification_of_type_pos_unify_arg2", "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2", 2, 0, false );
    SubLFiles.declareFunction( me, "substitute_sentence_terms_into_query", "SUBSTITUTE-SENTENCE-TERMS-INTO-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "substitute_query", "SUBSTITUTE-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "substitute_query_terms_into_cycl", "SUBSTITUTE-QUERY-TERMS-INTO-CYCL", 2, 1, false );
    SubLFiles.declareFunction( me, "query_subst_string_denots", "QUERY-SUBST-STRING-DENOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "query_subst_find_substitutable_terms", "QUERY-SUBST-FIND-SUBSTITUTABLE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "substitution_gather_term", "SUBSTITUTION-GATHER-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "substitution_weight", "SUBSTITUTION-WEIGHT", 3, 1, false );
    SubLFiles.declareFunction( me, "filter_unsubstitutable_terms_for_argpos", "FILTER-UNSUBSTITUTABLE-TERMS-FOR-ARGPOS", 4, 1, false );
    SubLFiles.declareFunction( me, "meets_heuristic_substitution_constraints", "MEETS-HEURISTIC-SUBSTITUTION-CONSTRAINTS", 5, 0, false );
    SubLFiles.declareFunction( me, "term_already_in_literalP", "TERM-ALREADY-IN-LITERAL?", 3, 0, false );
    SubLFiles.declareFunction( me, "terms_of_same_orderP", "TERMS-OF-SAME-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "my_term_order", "MY-TERM-ORDER", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_relevant_similar_queries_file()
  {
    $pertinent_query_sentence_with_terms_cost$ = SubLFiles.defparameter( "*PERTINENT-QUERY-SENTENCE-WITH-TERMS-COST*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_relevant_similar_queries_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const10$pertinentQuerySentenceWithTerms );
    preference_modules.doomed_unless_arg_bindable( $kw11$POS, $const10$pertinentQuerySentenceWithTerms, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw11$POS, $const10$pertinentQuerySentenceWithTerms, TWO_INTEGER );
    inference_modules.inference_removal_module( $kw12$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4, $list13 );
    inference_modules.register_solely_specific_removal_module_predicate( $const16$termInSentenceOfQuerySpecificatio );
    preference_modules.doomed_unless_arg_bindable( $kw11$POS, $const16$termInSentenceOfQuerySpecificatio, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw11$POS, $const16$termInSentenceOfQuerySpecificatio, THREE_INTEGER );
    inference_modules.inference_removal_module( $kw17$TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2, $list18 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_relevant_similar_queries_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_relevant_similar_queries_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_relevant_similar_queries_file();
  }
  static
  {
    me = new removal_modules_relevant_similar_queries();
    $pertinent_query_sentence_with_terms_cost$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NoAmountFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Relevance" ) ) );
    $float1$0_25 = makeDouble( 0.25 );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LowAmountFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Relevance" ) ) );
    $float3$0_5 = makeDouble( 0.5 );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MediumAmountFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Relevance" ) ) );
    $float5$0_75 = makeDouble( 0.75 );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HighAmountFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Relevance" ) ) );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "VeryHighAmountFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Relevance" ) ) );
    $const8$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell( makeString( "querySpecificationForFormulaTemplate" ) );
    $kw9$GAF = makeKeyword( "GAF" );
    $const10$pertinentQuerySentenceWithTerms = constant_handles.reader_make_constant_shell( makeString( "pertinentQuerySentenceWithTerms" ) );
    $kw11$POS = makeKeyword( "POS" );
    $kw12$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4 = makeKeyword( "PERTINENT-QUERY-SENTENCE-WITH-TERMS-UNIFY-ARGS3&4" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "pertinentQuerySentenceWithTerms" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pertinentQuerySentenceWithTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*PERTINENT-QUERY-SENTENCE-WITH-TERMS-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "pertinentQuerySentenceWithTerms" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INPUT-SENTENCE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM-SET" ) ), makeKeyword(
                      "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INPUT-SENTENCE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "TERM-SET" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "PERTINENT-QUERY-SENTENCES-WITH-TERMS" ), ConsesLow.list( makeKeyword( "VALUE" ),
                              makeSymbol( "INPUT-SENTENCE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM-SET" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                                  ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeSymbol( "SUBST-COUNT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "pertinentQuerySentenceWithTerms" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INPUT-SENTENCE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM-SET" ) ),
                                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NEW-SENTENCE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBST-COUNT" ) ) ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$formulaForStringPertinentToDegreeFromFolderOfType <string> <not-fully-bound> <not-fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$formulaForStringPertinentToDegreeFromFolderOfType \"al Qaeda\" ?QUERY ?RELEVANCE #$FolderWithIntelligenceQueriesForSuggestion)" )
    } );
    $sym14$_X = makeSymbol( "?X" );
    $const15$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $const16$termInSentenceOfQuerySpecificatio = constant_handles.reader_make_constant_shell( makeString( "termInSentenceOfQuerySpecificationOfType" ) );
    $kw17$TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2 = makeKeyword( "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "termInSentenceOfQuerySpecificationOfType" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termInSentenceOfQuerySpecificationOfType" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-COST" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "termInSentenceOfQuerySpecificationOfType" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "FOLDER-TYPE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FOLDER-TYPE" ) ) ) ), makeKeyword(
                  "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-ITERATOR" ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FOLDER-TYPE" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "termInSentenceOfQuerySpecificationOfType" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), makeKeyword( "INPUT" ), ConsesLow.list(
                              makeKeyword( "VALUE" ), makeSymbol( "FOLDER-TYPE" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                  "(#$termInSentenceOfQuerySpecificationOfType <fully-bound> <not-fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                      "(#$termInSentenceOfQuerySpecificationOfType #$AlQaida ?CYCL-Q-SPEC #$FolderWithIntelligenceQueriesForSuggestion)" )
    } );
    $const19$folderContainsResource = constant_handles.reader_make_constant_shell( makeString( "folderContainsResource" ) );
    $const20$sentenceParameterValueInSpecifica = constant_handles.reader_make_constant_shell( makeString( "sentenceParameterValueInSpecification" ) );
    $list21 = ConsesLow.list( makeSymbol( "ARG-POS" ), makeSymbol( "SUBSTITUTIONS" ) );
    $list22 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "FORMULA-WEIGHT" ), makeSymbol( "SUBSTITUTION-COUNT" ) );
    $list23 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "SUBST-WEIGHT" ) );
    $sym24$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $sym25$FIRST = makeSymbol( "FIRST" );
    $sym26$SUBSTITUTION_GATHER_TERM = makeSymbol( "SUBSTITUTION-GATHER-TERM" );
  }
}
/*
 * 
 * Total time: 430 ms
 * 
 */