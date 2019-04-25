package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_noun_compound
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_noun_compound";
  public static final String myFingerPrint = "f1744f7afba865ba5467c60e9f580f60666de89480326f93cba2a5a842e93799";
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
  private static SubLSymbol $pph_nc_rule_list_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2096L)
  private static SubLSymbol $nc_pos_constraint_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2207L)
  private static SubLSymbol $nc_pos_pred_constraint_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2281L)
  private static SubLSymbol $nc_equals_constraint_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2352L)
  private static SubLSymbol $nc_genls_constraint_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2421L)
  private static SubLSymbol $nc_isa_constraint_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2486L)
  private static SubLSymbol $the_nc_modifier$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2542L)
  private static SubLSymbol $the_nc_head$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2590L)
  private static SubLSymbol $noun_compound_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2652L)
  private static SubLSymbol $nc_rule_template$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2710L)
  private static SubLSymbol $nc_rule_constraint$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2772L)
  private static SubLSymbol $nc_mt$;
  private static final SubLSymbol $sym0$PPH_NC_RULE_LIST;
  private static final SubLObject $const1$isa;
  private static final SubLSymbol $kw2$BREADTH;
  private static final SubLSymbol $kw3$QUEUE;
  private static final SubLSymbol $kw4$STACK;
  private static final SubLObject $const5$True_JustificationTruth;
  private static final SubLSymbol $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw7$ERROR;
  private static final SubLString $str8$_A_is_not_a__A;
  private static final SubLSymbol $sym9$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw10$CERROR;
  private static final SubLString $str11$continue_anyway;
  private static final SubLSymbol $kw12$WARN;
  private static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str14$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str15$attempting_to_bind_direction_link;
  private static final SubLList $list16;
  private static final SubLString $str17$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym18$_PPH_NC_RULE_LIST_CACHING_STATE_;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$RULE;
  private static final SubLSymbol $sym21$CSOME;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym24$PROGN;
  private static final SubLObject $const25$NCPOSConstraintFn;
  private static final SubLObject $const26$NCPOSPredConstraintFn;
  private static final SubLObject $const27$NCEqualsConstraintFn;
  private static final SubLObject $const28$NCGenlsConstraintFn;
  private static final SubLObject $const29$NCIsaConstraintFn;
  private static final SubLObject $const30$TheNCModifier;
  private static final SubLObject $const31$TheNCHead;
  private static final SubLObject $const32$NounCompoundRule;
  private static final SubLObject $const33$ncRuleTemplate;
  private static final SubLObject $const34$ncRuleConstraint;
  private static final SubLObject $const35$GeneralLexiconMt;
  private static final SubLSymbol $sym36$GENERATE_NOUN_COMPOUND_PHRASE;
  private static final SubLSymbol $kw37$COLLECTION_DENOTING_NAT;
  private static final SubLSymbol $kw38$BEST;
  private static final SubLSymbol $sym39$PPH_FIND_NC_RULE_FOR_NAUT;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLObject $const42$CountNoun;
  private static final SubLString $str43$_PPH_error_level_;
  private static final SubLString $str44$__;
  private static final SubLString $str45$___S_isn_t_a_semantic_constraint_;
  private static final SubLSymbol $sym46$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const47$EverythingPSC;
  private static final SubLString $str48$___S_isn_t_a_recognized_noun_comp;

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
  public static SubLObject clear_pph_nc_rule_list()
  {
    final SubLObject cs = $pph_nc_rule_list_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
  public static SubLObject remove_pph_nc_rule_list(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $nc_mt$.getGlobalValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pph_nc_rule_list_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
  public static SubLObject pph_nc_rule_list_internal(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject node_var = $noun_compound_rule$.getGlobalValue();
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$1 = node_var;
        final SubLObject deck_type = $kw4$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
              final SubLObject tv_var = $const5$True_JustificationTruth;
              final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw7$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw10$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str11$continue_anyway, $str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw12$WARN ) )
                  {
                    Errors.warn( $str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str11$continue_anyway, $str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const1$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const1$isa ) ) ),
                      thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const1$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const1$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$7 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const1$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$1, UNPROVIDED );
                      while ( NIL != node_var_$1)
                      {
                        final SubLObject tt_node_var = node_var_$1;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const1$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const1$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$15 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$15 ) )
                                    {
                                      final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$15, thread );
                                        SubLObject iteration_state_$17;
                                        for( iteration_state_$17 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$17 ); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next( iteration_state_$17 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$17 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject rule;
                                                SubLObject template;
                                                SubLObject constraints;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  rule = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, rule ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( rule, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( rule ) )
                                                    {
                                                      template = kb_mapping_utilities.fpred_value( rule, $nc_rule_template$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                      constraints = kb_mapping_utilities.pred_values( rule, $nc_rule_constraint$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                      result = ConsesLow.cons( ConsesLow.list( rule, template, constraints ), result );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject rule2 = NIL;
                                                rule2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( rule2 ) )
                                                    {
                                                      final SubLObject template2 = kb_mapping_utilities.fpred_value( rule2, $nc_rule_template$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                      final SubLObject constraints2 = kb_mapping_utilities.pred_values( rule2, $nc_rule_constraint$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                      result = ConsesLow.cons( ConsesLow.list( rule2, template2, constraints2 ), result );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  rule2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str14$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$17 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$8, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str15$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt_$16 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
                                  mt_$16 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$16 ) )
                                    {
                                      final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$16, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject rule;
                                              SubLObject template;
                                              SubLObject constraints;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                rule = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, rule ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( rule, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( rule ) )
                                                  {
                                                    template = kb_mapping_utilities.fpred_value( rule, $nc_rule_template$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                    constraints = kb_mapping_utilities.pred_values( rule, $nc_rule_constraint$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                    result = ConsesLow.cons( ConsesLow.list( rule, template, constraints ), result );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$22 = sol;
                                              SubLObject rule2 = NIL;
                                              rule2 = csome_list_var_$22.first();
                                              while ( NIL != csome_list_var_$22)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( rule2 ) )
                                                  {
                                                    final SubLObject template2 = kb_mapping_utilities.fpred_value( rule2, $nc_rule_template$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                    final SubLObject constraints2 = kb_mapping_utilities.pred_values( rule2, $nc_rule_constraint$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                    result = ConsesLow.cons( ConsesLow.list( rule2, template2, constraints2 ), result );
                                                  }
                                                }
                                                csome_list_var_$22 = csome_list_var_$22.rest();
                                                rule2 = csome_list_var_$22.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str14$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$11, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$10, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$23;
                              final SubLObject new_list = cdolist_list_var_$23 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const1$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const1$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$23.first();
                              while ( NIL != cdolist_list_var_$23)
                              {
                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject rule3;
                                    SubLObject template3;
                                    SubLObject constraints3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      rule3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, rule3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( rule3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( rule3 ) )
                                        {
                                          template3 = kb_mapping_utilities.fpred_value( rule3, $nc_rule_template$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          constraints3 = kb_mapping_utilities.pred_values( rule3, $nc_rule_constraint$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          result = ConsesLow.cons( ConsesLow.list( rule3, template3, constraints3 ), result );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject rule4 = NIL;
                                    rule4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( rule4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( rule4 ) )
                                        {
                                          final SubLObject template4 = kb_mapping_utilities.fpred_value( rule4, $nc_rule_template$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          final SubLObject constraints4 = kb_mapping_utilities.pred_values( rule4, $nc_rule_constraint$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          result = ConsesLow.cons( ConsesLow.list( rule4, template4, constraints4 ), result );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      rule4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str14$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$12, thread );
                                }
                                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                generating_fn = cdolist_list_var_$23.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$8, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const1$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$1 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$17 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$17 ) )
                                    {
                                      final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$17, thread );
                                        SubLObject iteration_state_$18;
                                        for( iteration_state_$18 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$18 ); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next( iteration_state_$18 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$18 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str14$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$15, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$18 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$14, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str15$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$24;
                              final SubLObject new_list2 = cdolist_list_var_$24 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$24.first();
                              while ( NIL != cdolist_list_var_$24)
                              {
                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str14$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$16, thread );
                                }
                                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                generating_fn2 = cdolist_list_var_$24.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$9, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$13, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$1 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$10, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$7, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str17$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$9, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$6, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$5, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$5, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$4, thread );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$4, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
  public static SubLObject pph_nc_rule_list(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $nc_mt$.getGlobalValue();
    }
    SubLObject caching_state = $pph_nc_rule_list_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym0$PPH_NC_RULE_LIST, $sym18$_PPH_NC_RULE_LIST_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_nc_rule_list_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1488L)
  public static SubLObject do_nc_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rule_var = NIL;
    SubLObject template_var = NIL;
    SubLObject constraints_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    rule_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    template_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    constraints_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list19 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject rule = $sym20$RULE;
      return ConsesLow.list( $sym21$CSOME, ConsesLow.list( rule, $list22, done_var ), ConsesLow.list( $sym23$CDESTRUCTURING_BIND, ConsesLow.list( rule_var, template_var, constraints_var ), rule, reader.bq_cons(
          $sym24$PROGN, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2954L)
  public static SubLObject generate_noun_compound_phrase(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_utilities.pph_current_precision() )
    {
      return NIL;
    }
    final SubLObject naut = function_terms.nart_to_naut( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
    thread.resetMultipleValues();
    final SubLObject rule = pph_find_nc_rule_for_naut( naut );
    final SubLObject mod_cycl = thread.secondMultipleValue();
    final SubLObject head_cycl = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != forts.fort_p( rule ) )
    {
      final SubLObject syn_constraints = organize_rule_syntactic_constraints( rule );
      final SubLObject mod_phrase = pph_phrase.new_pph_phrase_for_cycl( mod_cycl, UNPROVIDED, UNPROVIDED );
      final SubLObject head_phrase = pph_phrase.new_pph_phrase_for_cycl( head_cycl, UNPROVIDED, UNPROVIDED );
      set_nc_phrase_constraints( syn_constraints, head_phrase, mod_phrase );
      pph_phrase.set_pph_phrase_dtrs_from_list( phrase, ConsesLow.list( mod_phrase, head_phrase ), ONE_INTEGER );
      pph_phrase_resolution.pph_phrase_get_string( phrase, UNPROVIDED, UNPROVIDED );
      pph_phrase.pph_phrase_add_justification( phrase, rule );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 3717L)
  public static SubLObject pph_find_nc_rule_for_naut_internal(final SubLObject naut)
  {
    SubLObject found_rule = NIL;
    SubLObject mod_cycl = NIL;
    SubLObject head_cycl = NIL;
    if( NIL == found_rule )
    {
      SubLObject csome_list_var = pph_nc_rule_list( UNPROVIDED );
      SubLObject rule = NIL;
      rule = csome_list_var.first();
      while ( NIL == found_rule && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = rule;
        SubLObject rule_$35 = NIL;
        SubLObject template = NIL;
        SubLObject constraints = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
        rule_$35 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
        template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
        constraints = current.first();
        current = current.rest();
        if( NIL == current )
        {
          template = function_terms.nart_to_naut( template );
          final SubLObject v_bindings = nc_rule_match_template( template, naut, constraints );
          if( NIL != nc_rule_bindings_completeP( v_bindings ) )
          {
            mod_cycl = bindings_get_modifier_target( v_bindings );
            head_cycl = bindings_get_head_target( v_bindings );
            found_rule = rule_$35;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
        }
        csome_list_var = csome_list_var.rest();
        rule = csome_list_var.first();
      }
    }
    return Values.values( found_rule, mod_cycl, head_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 3717L)
  public static SubLObject pph_find_nc_rule_for_naut(final SubLObject naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_find_nc_rule_for_naut_internal( naut );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym39$PPH_FIND_NC_RULE_FOR_NAUT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym39$PPH_FIND_NC_RULE_FOR_NAUT, ONE_INTEGER, NIL, EQUALP, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym39$PPH_FIND_NC_RULE_FOR_NAUT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, naut, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_find_nc_rule_for_naut_internal( naut ) ) );
      memoization_state.caching_state_put( caching_state, naut, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 4321L)
  public static SubLObject generate_noun_compound(final SubLObject cycl)
  {
    final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl( cycl, UNPROVIDED, UNPROVIDED );
    generate_noun_compound_phrase( phrase );
    return pph_phrase.pph_phrase_string( phrase, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 4647L)
  public static SubLObject all_noun_compounds_for_term(final SubLObject cycl)
  {
    SubLObject noun_compounds = NIL;
    SubLObject csome_list_var = pph_nc_rule_list( UNPROVIDED );
    SubLObject rule = NIL;
    rule = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = rule;
      SubLObject rule_$36 = NIL;
      SubLObject template = NIL;
      SubLObject constraints = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      rule_$36 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      template = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      constraints = current.first();
      current = current.rest();
      if( NIL == current )
      {
        template = function_terms.nart_to_naut( template );
        final SubLObject v_bindings = nc_rule_match_template( template, cycl, constraints );
        if( NIL != nc_rule_bindings_completeP( v_bindings ) )
        {
          final SubLObject syn_constraints = organize_rule_syntactic_constraints( rule_$36 );
          final SubLObject mod_phrase = pph_phrase.new_pph_phrase_for_cycl( bindings_get_modifier_target( v_bindings ), UNPROVIDED, UNPROVIDED );
          final SubLObject head_phrase = pph_phrase.new_pph_phrase_for_cycl( bindings_get_head_target( v_bindings ), UNPROVIDED, UNPROVIDED );
          final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl( cycl, UNPROVIDED, UNPROVIDED );
          set_nc_phrase_constraints( syn_constraints, head_phrase, mod_phrase );
          pph_phrase.set_pph_phrase_dtrs_from_list( phrase, ConsesLow.list( mod_phrase, head_phrase ), UNPROVIDED );
          pph_phrase.pph_phrase_set_head_dtr_num( phrase, ONE_INTEGER );
          pph_phrase_resolution.pph_phrase_get_string( phrase, UNPROVIDED, UNPROVIDED );
          if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
          {
            noun_compounds = ConsesLow.cons( pph_phrase.pph_phrase_string( phrase, UNPROVIDED ), noun_compounds );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
      }
      csome_list_var = csome_list_var.rest();
      rule = csome_list_var.first();
    }
    return noun_compounds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 5656L)
  public static SubLObject nc_rule_pos_constraint_p(final SubLObject constraint)
  {
    return Equality.eq( nc_constraint_op( constraint ), $nc_pos_constraint_fn$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 5831L)
  public static SubLObject nc_rule_pos_pred_constraint_p(final SubLObject constraint)
  {
    return Equality.eq( nc_constraint_op( constraint ), $nc_pos_pred_constraint_fn$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 5963L)
  public static SubLObject nc_rule_modifier_constraint_p(final SubLObject constraint)
  {
    return Equality.eq( nc_constraint_subject( constraint ), $the_nc_modifier$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6090L)
  public static SubLObject nc_rule_head_constraint_p(final SubLObject constraint)
  {
    return Equality.eq( nc_constraint_subject( constraint ), $the_nc_head$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6209L)
  public static SubLObject nc_rule_indexical_p(final SubLObject base)
  {
    return subl_promotions.memberP( base, ConsesLow.list( $the_nc_head$.getGlobalValue(), $the_nc_modifier$.getGlobalValue() ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6314L)
  public static SubLObject nc_rule_semantic_constraint_p(final SubLObject constraint)
  {
    return conses_high.member( nc_constraint_op( constraint ), ConsesLow.list( $nc_isa_constraint_fn$.getGlobalValue(), $nc_genls_constraint_fn$.getGlobalValue(), $nc_equals_constraint_fn$.getGlobalValue() ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6516L)
  public static SubLObject nc_constraint_op(final SubLObject constraint)
  {
    return cycl_utilities.nat_arg0( constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6662L)
  public static SubLObject nc_constraint_subject(final SubLObject constraint)
  {
    return cycl_utilities.nat_arg1( constraint, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6745L)
  public static SubLObject nc_constraint_object(final SubLObject constraint)
  {
    return cycl_utilities.nat_arg2( constraint, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6827L)
  public static SubLObject binding_base(final SubLObject binding)
  {
    return binding.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6904L)
  public static SubLObject binding_target(final SubLObject binding)
  {
    return binding.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6969L)
  public static SubLObject nc_rule_bindings_completeP(final SubLObject v_bindings)
  {
    return makeBoolean( v_bindings.isList() && NIL != list_utilities.lengthE( v_bindings, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 7101L)
  public static SubLObject bindings_get_modifier_target(final SubLObject v_bindings)
  {
    final SubLObject binding = conses_high.assoc( $the_nc_modifier$.getGlobalValue(), v_bindings, UNPROVIDED, UNPROVIDED );
    return binding_target( binding );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 7376L)
  public static SubLObject bindings_get_head_target(final SubLObject v_bindings)
  {
    final SubLObject binding = conses_high.assoc( $the_nc_head$.getGlobalValue(), v_bindings, UNPROVIDED, UNPROVIDED );
    return binding_target( binding );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 7639L)
  public static SubLObject set_nc_phrase_constraints(final SubLObject constraints, final SubLObject head_phrase, final SubLObject mod_phrase)
  {
    SubLObject head_pos_constraint = NIL;
    SubLObject mod_pos_constraint = NIL;
    SubLObject head_pos_pred_constraint = NIL;
    SubLObject mod_pos_pred_constraint = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraints, constraints, $list41 );
    head_pos_constraint = constraints.first();
    SubLObject current = constraints.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraints, $list41 );
    mod_pos_constraint = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraints, $list41 );
    head_pos_pred_constraint = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraints, $list41 );
    mod_pos_pred_constraint = current.first();
    current = current.rest();
    if( NIL == current )
    {
      pph_phrase.pph_phrase_set_category( head_phrase, ( NIL != head_pos_constraint ) ? head_pos_constraint : $const42$CountNoun, UNPROVIDED );
      pph_phrase.pph_phrase_set_category( mod_phrase, mod_pos_constraint, UNPROVIDED );
      pph_phrase.pph_phrase_set_agr_pred_unless_nil( head_phrase, head_pos_pred_constraint );
      pph_phrase.pph_phrase_set_agr_pred_unless_nil( mod_phrase, mod_pos_pred_constraint );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( constraints, $list41 );
    }
    return Values.values( head_phrase, mod_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 8476L)
  public static SubLObject organize_rule_syntactic_constraints(final SubLObject rule)
  {
    final SubLObject constraints = kb_mapping_utilities.pred_values_in_mt( rule, $nc_rule_constraint$.getGlobalValue(), $nc_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return organize_syntactic_constraints( constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 8736L)
  public static SubLObject organize_syntactic_constraints(final SubLObject constraints)
  {
    SubLObject head_pos = NIL;
    SubLObject head_pos_pred = NIL;
    SubLObject mod_pos = NIL;
    SubLObject mod_pos_pred = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject obj = nc_constraint_object( constraint );
      if( NIL != nc_rule_pos_constraint_p( constraint ) )
      {
        if( NIL != nc_rule_head_constraint_p( constraint ) )
        {
          head_pos = obj;
        }
        else if( NIL != nc_rule_modifier_constraint_p( constraint ) )
        {
          mod_pos = obj;
        }
      }
      else if( NIL != nc_rule_pos_pred_constraint_p( constraint ) )
      {
        if( NIL != nc_rule_head_constraint_p( constraint ) )
        {
          head_pos_pred = obj;
        }
        else if( NIL != nc_rule_modifier_constraint_p( constraint ) )
        {
          mod_pos_pred = obj;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return ConsesLow.list( head_pos, head_pos_pred, mod_pos, mod_pos_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 9557L)
  public static SubLObject nc_rule_match_template(SubLObject template, final SubLObject nat, final SubLObject constraints)
  {
    template = function_terms.nart_to_naut( template );
    if( NIL == el_utilities.el_formula_without_sequence_termP( template ) || NIL == el_utilities.el_formula_without_sequence_termP( nat ) || NIL == list_utilities.same_length_p( template, nat ) )
    {
      return NIL;
    }
    SubLObject v_bindings = NIL;
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject base = NIL;
      SubLObject base_$37 = NIL;
      SubLObject target = NIL;
      SubLObject target_$38 = NIL;
      base = template;
      base_$37 = base.first();
      target = nat;
      target_$38 = target.first();
      while ( NIL == failP && ( NIL != target || NIL != base ))
      {
        if( NIL != el_utilities.el_formula_p( base_$37 ) || NIL != el_utilities.el_formula_p( target_$38 ) )
        {
          final SubLObject match = nc_rule_match_template( base_$37, target_$38, constraints );
          if( NIL != match )
          {
            if( match.isList() )
            {
              v_bindings = ConsesLow.append( match, v_bindings );
            }
          }
          else
          {
            failP = T;
          }
        }
        else
        {
          final SubLObject match = nc_rule_pat_match( base_$37, target_$38, constraints );
          if( NIL != match )
          {
            if( match.isCons() )
            {
              v_bindings = ConsesLow.cons( match, v_bindings );
            }
          }
          else
          {
            failP = T;
          }
        }
        base = base.rest();
        base_$37 = base.first();
        target = target.rest();
        target_$38 = target.first();
      }
    }
    if( NIL != failP )
    {
      return NIL;
    }
    return ( NIL != v_bindings ) ? v_bindings : T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 10504L)
  public static SubLObject nc_rule_pat_match(final SubLObject base, final SubLObject target, final SubLObject constraints)
  {
    if( NIL != nc_rule_indexical_p( base ) )
    {
      return ( NIL != binding_satisfies_nc_rule_semantic_constraintsP( base, target, constraints ) ) ? ConsesLow.cons( base, target ) : NIL;
    }
    if( base.eql( target ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 10866L)
  public static SubLObject binding_satisfies_nc_rule_semantic_constraintsP(final SubLObject base, final SubLObject target, final SubLObject constraints)
  {
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var;
      SubLObject constraint;
      for( csome_list_var = constraints, constraint = NIL, constraint = csome_list_var.first(); NIL == failP && NIL != csome_list_var; failP = makeBoolean( NIL != nc_rule_semantic_constraint_p( constraint )
          && NIL != nc_constraint_appliesP( constraint, base ) && NIL == target_satisfies_nc_rule_semantic_constraintP( target, constraint ) ), csome_list_var = csome_list_var.rest(), constraint = csome_list_var
              .first() )
      {
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 11320L)
  public static SubLObject target_satisfies_nc_rule_semantic_constraintP(final SubLObject target, final SubLObject constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == nc_rule_semantic_constraint_p( constraint ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str43$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str44$__, format_nil.format_nil_a_no_copy(
          $str45$___S_isn_t_a_semantic_constraint_ )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( constraint ) );
    }
    SubLObject ans = T;
    final SubLObject obj = nc_constraint_object( constraint );
    final SubLObject op = nc_constraint_op( constraint );
    if( op.eql( $nc_equals_constraint_fn$.getGlobalValue() ) )
    {
      return Equality.equal( target, obj );
    }
    if( op.eql( $nc_genls_constraint_fn$.getGlobalValue() ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym46$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const47$EverythingPSC, thread );
        ans = pph_utilities.pph_genlP( target, obj, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( op.eql( $nc_isa_constraint_fn$.getGlobalValue() ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym46$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const47$EverythingPSC, thread );
        ans = pph_utilities.pph_isaP( target, obj, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject new_format_string2 = Sequences.cconcatenate( $str43$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str44$__, format_nil.format_nil_a_no_copy(
          $str48$___S_isn_t_a_recognized_noun_comp )
      } );
      pph_error.pph_handle_error( new_format_string2, ConsesLow.list( op ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 12127L)
  public static SubLObject nc_constraint_appliesP(final SubLObject constraint, final SubLObject base)
  {
    return Equality.eq( nc_constraint_subject( constraint ), base );
  }

  public static SubLObject declare_pph_noun_compound_file()
  {
    SubLFiles.declareFunction( me, "clear_pph_nc_rule_list", "CLEAR-PPH-NC-RULE-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_nc_rule_list", "REMOVE-PPH-NC-RULE-LIST", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_nc_rule_list_internal", "PPH-NC-RULE-LIST-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_nc_rule_list", "PPH-NC-RULE-LIST", 0, 1, false );
    SubLFiles.declareMacro( me, "do_nc_rules", "DO-NC-RULES" );
    SubLFiles.declareFunction( me, "generate_noun_compound_phrase", "GENERATE-NOUN-COMPOUND-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_find_nc_rule_for_naut_internal", "PPH-FIND-NC-RULE-FOR-NAUT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_find_nc_rule_for_naut", "PPH-FIND-NC-RULE-FOR-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_noun_compound", "GENERATE-NOUN-COMPOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "all_noun_compounds_for_term", "ALL-NOUN-COMPOUNDS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_pos_constraint_p", "NC-RULE-POS-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_pos_pred_constraint_p", "NC-RULE-POS-PRED-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_modifier_constraint_p", "NC-RULE-MODIFIER-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_head_constraint_p", "NC-RULE-HEAD-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_indexical_p", "NC-RULE-INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_semantic_constraint_p", "NC-RULE-SEMANTIC-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_constraint_op", "NC-CONSTRAINT-OP", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_constraint_subject", "NC-CONSTRAINT-SUBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_constraint_object", "NC-CONSTRAINT-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "binding_base", "BINDING-BASE", 1, 0, false );
    SubLFiles.declareFunction( me, "binding_target", "BINDING-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_bindings_completeP", "NC-RULE-BINDINGS-COMPLETE?", 1, 0, false );
    SubLFiles.declareFunction( me, "bindings_get_modifier_target", "BINDINGS-GET-MODIFIER-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "bindings_get_head_target", "BINDINGS-GET-HEAD-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "set_nc_phrase_constraints", "SET-NC-PHRASE-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "organize_rule_syntactic_constraints", "ORGANIZE-RULE-SYNTACTIC-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "organize_syntactic_constraints", "ORGANIZE-SYNTACTIC-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_match_template", "NC-RULE-MATCH-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "nc_rule_pat_match", "NC-RULE-PAT-MATCH", 3, 0, false );
    SubLFiles.declareFunction( me, "binding_satisfies_nc_rule_semantic_constraintsP", "BINDING-SATISFIES-NC-RULE-SEMANTIC-CONSTRAINTS?", 3, 0, false );
    SubLFiles.declareFunction( me, "target_satisfies_nc_rule_semantic_constraintP", "TARGET-SATISFIES-NC-RULE-SEMANTIC-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "nc_constraint_appliesP", "NC-CONSTRAINT-APPLIES?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_noun_compound_file()
  {
    $pph_nc_rule_list_caching_state$ = SubLFiles.deflexical( "*PPH-NC-RULE-LIST-CACHING-STATE*", NIL );
    $nc_pos_constraint_fn$ = SubLFiles.defconstant( "*NC-POS-CONSTRAINT-FN*", $const25$NCPOSConstraintFn );
    $nc_pos_pred_constraint_fn$ = SubLFiles.defconstant( "*NC-POS-PRED-CONSTRAINT-FN*", $const26$NCPOSPredConstraintFn );
    $nc_equals_constraint_fn$ = SubLFiles.defconstant( "*NC-EQUALS-CONSTRAINT-FN*", $const27$NCEqualsConstraintFn );
    $nc_genls_constraint_fn$ = SubLFiles.defconstant( "*NC-GENLS-CONSTRAINT-FN*", $const28$NCGenlsConstraintFn );
    $nc_isa_constraint_fn$ = SubLFiles.defconstant( "*NC-ISA-CONSTRAINT-FN*", $const29$NCIsaConstraintFn );
    $the_nc_modifier$ = SubLFiles.defconstant( "*THE-NC-MODIFIER*", $const30$TheNCModifier );
    $the_nc_head$ = SubLFiles.defconstant( "*THE-NC-HEAD*", $const31$TheNCHead );
    $noun_compound_rule$ = SubLFiles.defconstant( "*NOUN-COMPOUND-RULE*", $const32$NounCompoundRule );
    $nc_rule_template$ = SubLFiles.defconstant( "*NC-RULE-TEMPLATE*", $const33$ncRuleTemplate );
    $nc_rule_constraint$ = SubLFiles.defconstant( "*NC-RULE-CONSTRAINT*", $const34$ncRuleConstraint );
    $nc_mt$ = SubLFiles.deflexical( "*NC-MT*", $const35$GeneralLexiconMt );
    return NIL;
  }

  public static SubLObject setup_pph_noun_compound_file()
  {
    memoization_state.note_globally_cached_function( $sym0$PPH_NC_RULE_LIST );
    pph_types.pph_register_method( $sym36$GENERATE_NOUN_COMPOUND_PHRASE, $kw37$COLLECTION_DENOTING_NAT, $kw38$BEST );
    memoization_state.note_memoized_function( $sym39$PPH_FIND_NC_RULE_FOR_NAUT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_noun_compound_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_noun_compound_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_noun_compound_file();
  }
  static
  {
    me = new pph_noun_compound();
    $pph_nc_rule_list_caching_state$ = null;
    $nc_pos_constraint_fn$ = null;
    $nc_pos_pred_constraint_fn$ = null;
    $nc_equals_constraint_fn$ = null;
    $nc_genls_constraint_fn$ = null;
    $nc_isa_constraint_fn$ = null;
    $the_nc_modifier$ = null;
    $the_nc_head$ = null;
    $noun_compound_rule$ = null;
    $nc_rule_template$ = null;
    $nc_rule_constraint$ = null;
    $nc_mt$ = null;
    $sym0$PPH_NC_RULE_LIST = makeSymbol( "PPH-NC-RULE-LIST" );
    $const1$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw2$BREADTH = makeKeyword( "BREADTH" );
    $kw3$QUEUE = makeKeyword( "QUEUE" );
    $kw4$STACK = makeKeyword( "STACK" );
    $const5$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw7$ERROR = makeKeyword( "ERROR" );
    $str8$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym9$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw10$CERROR = makeKeyword( "CERROR" );
    $str11$continue_anyway = makeString( "continue anyway" );
    $kw12$WARN = makeKeyword( "WARN" );
    $str13$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str14$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str15$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list16 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str17$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym18$_PPH_NC_RULE_LIST_CACHING_STATE_ = makeSymbol( "*PPH-NC-RULE-LIST-CACHING-STATE*" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "RULE-VAR" ), makeSymbol( "TEMPLATE-VAR" ), makeSymbol( "CONSTRAINTS-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym20$RULE = makeUninternedSymbol( "RULE" );
    $sym21$CSOME = makeSymbol( "CSOME" );
    $list22 = ConsesLow.list( makeSymbol( "PPH-NC-RULE-LIST" ) );
    $sym23$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym24$PROGN = makeSymbol( "PROGN" );
    $const25$NCPOSConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCPOSConstraintFn" ) );
    $const26$NCPOSPredConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCPOSPredConstraintFn" ) );
    $const27$NCEqualsConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCEqualsConstraintFn" ) );
    $const28$NCGenlsConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCGenlsConstraintFn" ) );
    $const29$NCIsaConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCIsaConstraintFn" ) );
    $const30$TheNCModifier = constant_handles.reader_make_constant_shell( makeString( "TheNCModifier" ) );
    $const31$TheNCHead = constant_handles.reader_make_constant_shell( makeString( "TheNCHead" ) );
    $const32$NounCompoundRule = constant_handles.reader_make_constant_shell( makeString( "NounCompoundRule" ) );
    $const33$ncRuleTemplate = constant_handles.reader_make_constant_shell( makeString( "ncRuleTemplate" ) );
    $const34$ncRuleConstraint = constant_handles.reader_make_constant_shell( makeString( "ncRuleConstraint" ) );
    $const35$GeneralLexiconMt = constant_handles.reader_make_constant_shell( makeString( "GeneralLexiconMt" ) );
    $sym36$GENERATE_NOUN_COMPOUND_PHRASE = makeSymbol( "GENERATE-NOUN-COMPOUND-PHRASE" );
    $kw37$COLLECTION_DENOTING_NAT = makeKeyword( "COLLECTION-DENOTING-NAT" );
    $kw38$BEST = makeKeyword( "BEST" );
    $sym39$PPH_FIND_NC_RULE_FOR_NAUT = makeSymbol( "PPH-FIND-NC-RULE-FOR-NAUT" );
    $list40 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "TEMPLATE" ), makeSymbol( "CONSTRAINTS" ) );
    $list41 = ConsesLow.list( makeSymbol( "HEAD-POS-CONSTRAINT" ), makeSymbol( "MOD-POS-CONSTRAINT" ), makeSymbol( "HEAD-POS-PRED-CONSTRAINT" ), makeSymbol( "MOD-POS-PRED-CONSTRAINT" ) );
    $const42$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $str43$_PPH_error_level_ = makeString( "(PPH error level " );
    $str44$__ = makeString( ") " );
    $str45$___S_isn_t_a_semantic_constraint_ = makeString( "~&~S isn't a semantic constraint.~%" );
    $sym46$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const47$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str48$___S_isn_t_a_recognized_noun_comp = makeString( "~&~S isn't a recognized noun-compound constraint function.~%" );
  }
}
/*
 * 
 * Total time: 1090 ms
 * 
 */