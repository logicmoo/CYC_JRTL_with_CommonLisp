package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_functions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_functions";
  public static final String myFingerPrint = "2739018a12f0b5b4d9098968b8a61fafe4d0fef5145d7b614a427e01898a23f7";
  private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const1$EverythingPSC;
  private static final SubLObject $const2$SententialConstituent;
  private static final SubLSymbol $kw3$BREADTH;
  private static final SubLSymbol $kw4$QUEUE;
  private static final SubLSymbol $kw5$STACK;
  private static final SubLSymbol $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw7$ERROR;
  private static final SubLString $str8$_A_is_not_a__A;
  private static final SubLSymbol $sym9$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw10$CERROR;
  private static final SubLString $str11$continue_anyway;
  private static final SubLSymbol $kw12$WARN;
  private static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const14$genls;
  private static final SubLSymbol $sym15$RELEVANT_PRED_IS_EQ;
  private static final SubLObject $const16$resultIsa;
  private static final SubLSymbol $kw17$GAF;
  private static final SubLString $str18$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str19$attempting_to_bind_direction_link;
  private static final SubLString $str20$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym21$INIT_STATE;
  private static final SubLSymbol $kw22$INITIALIZED;
  private static final SubLSymbol $kw23$ANY;
  private static final SubLString $str24$Mx4rhDMb43qFEdeIbwACs6hcjQ;
  private static final SubLString $str25$Mx4rl7_8Pp0jQdiBO4ycSvStiw;
  private static final SubLString $str26$Mx4rv9etYZwpEbGdrcN5Y29ycA;
  private static final SubLString $str27$Mx4r4qYf0c5cEdechAACs71DBA;
  private static final SubLString $str28$Mx4rm6wfdNKHQdeUh8wvM5gGAw;
  private static final SubLString $str29$Mx4r4GwYjHW_QdeHh6EhyfXStQ;
  private static final SubLString $str30$Mx4reSyRUdcUEdaFyAACs2TnIQ;
  private static final SubLString $str31$Mx4rvs_o2pwpEbGdrcN5Y29ycA;
  private static final SubLString $str32$Mx4rv4kOOZwpEbGdrcN5Y29ycA;
  private static final SubLString $str33$Mx4rmBlTDEU5Qdif8plYg4lJxA;
  private static final SubLString $str34$Mx4rsyk2ttk0S22jYvB1JuNDkQ;
  private static final SubLString $str35$Mx4r6pWikBjUEduZTwAg7ZIttw;
  private static final SubLString $str36$Mx4rdOh8h_CHEeGRmQAhm0Q2sg;
  private static final SubLString $str37$Mx4rwAhK5JwpEbGdrcN5Y29ycA;
  private static final SubLString $str38$Mx4rKLzg4D3eEdeQMwACs6hcjQ;
  private static final SubLString $str39$Mx4rspGR8KevR3q9OyimHyW1Ug;
  private static final SubLString $str40$Mx4rThyQkSGJEdeT7AACs6hcjQ;
  private static final SubLString $str41$Mx4rVa_rlhgKEduAAAAOpmP6tw;
  private static final SubLString $str42$Mx4rguFyVjInQdeb2uIGDYLy5g;
  private static final SubLString $str43$Mx4rThvNRSGJEdeT7AACs6hcjQ;
  private static final SubLString $str44$Mx4rFJWzcCmKQded_KkEW7JuSg;
  private static final SubLString $str45$Mx4rNtu0kedwEdaLcQACs6hcjQ;
  private static final SubLString $str46$Mx4rK5PGEao_EdqHBAACs4kcHw;
  private static final SubLString $str47$Mx4rN6cLwHc3EdeG6QACs6hcsw;
  private static final SubLString $str48$Mx4rgW_8inXFQdefRuyaDCbnaw;
  private static final SubLString $str49$Mx4rnojpEn_lEdedQQCQJw5drg;
  private static final SubLString $str50$Mx4rZMze3MphEd6DUAAhm0QyzA;
  private static final SubLString $str51$Mx4rwHtux5wpEbGdrcN5Y29ycA;
  private static final SubLString $str52$Mx4rXWtZQyZKEdaUJQCQJ0LyHA;
  private static final SubLString $str53$Mx4ru2wgcRKdEdeSiwACs6hcjQ;
  private static final SubLString $str54$Mx4rlniqtHXKQdeMA_lnrY70Fw;
  private static final SubLString $str55$Mx4rzTlFrBH5QdebNKKWlazJMw;
  private static final SubLString $str56$Mx4rvrENgpwpEbGdrcN5Y29ycA;
  private static final SubLString $str57$Mx4rvyFfh5wpEbGdrcN5Y29ycA;
  private static final SubLString $str58$Mx4rgd3ECRNoEdedHAACs2TnIQ;
  private static final SubLString $str59$Mx4rvmnxkpwpEbGdrcN5Y29ycA;
  private static final SubLString $str60$Mx4r9kbKUBH5QdeJXOGeo_7kPQ;
  private static final SubLString $str61$Mx4rieoqVwG4Tf6jsUnHfhvR0A;
  private static final SubLString $str62$Mx4ryIoV0qs4EdeOWAACs6hcsw;
  private static final SubLString $str63$Mx4re_lCGqpIEdaAAABQ2sS97g;
  private static final SubLString $str64$Mx4rgd3ECBNoEdedHAACs2TnIQ;
  private static final SubLString $str65$Mx4rvriei5wpEbGdrcN5Y29ycA;
  private static final SubLString $str66$Mx4rwVUUNpwpEbGdrcN5Y29ycA;
  private static final SubLString $str67$Mx4reW2Q9KpIEdaAAABQ2sS97g;
  private static final SubLString $str68$Mx4rPmTuNUCxEdeXYQACs6hcjQ;
  private static final SubLString $str69$Mx4rv2M475wpEbGdrcN5Y29ycA;
  private static final SubLString $str70$Mx4rwKmyGZwpEbGdrcN5Y29ycA;
  private static final SubLString $str71$Mx4rwIsbdJwpEbGdrcN5Y29ycA;
  private static final SubLString $str72$Mx4rliHQJipEQdefpKOhvJ8kEA;
  private static final SubLString $str73$Mx4ruabZ1C51EdeLxQACs2TnIQ;
  private static final SubLString $str74$Mx4rv6urFZwpEbGdrcN5Y29ycA;
  private static final SubLString $str75$Mx4r7ZfvYjVnEdeRXQACs6hcjQ;
  private static final SubLString $str76$Mx4rvgAOxZwpEbGdrcN5Y29ycA;
  private static final SubLString $str77$Mx4rvzZuvJwpEbGdrcN5Y29ycA;
  private static final SubLString $str78$Mx4rv4d5RJwpEbGdrcN5Y29ycA;
  private static final SubLString $str79$Mx4rvdYMW5wpEbGdrcN5Y29ycA;
  private static final SubLString $str80$Mx4rvxCAuJwpEbGdrcN5Y29ycA;
  private static final SubLString $str81$Mx4rbsiYBe3iEdaLcQACs6hcjQ;
  private static final SubLString $str82$Mx4rqvJCpipEQdeYU9FDU1LZTA;
  private static final SubLString $str83$Mx4rviW1MZwpEbGdrcN5Y29ycA;
  private static final SubLString $str84$Mx4rTM6_q2uxQumO6o0j5w146Q;
  private static final SubLString $str85$Mx4rmf6HonchEdeE6gACs6hcsw;
  private static final SubLString $str86$Mx4rvYIU_JwpEbGdrcN5Y29ycA;
  private static final SubLString $str87$Mx4rR_asowkkEdeeTwACs6hcjQ;
  private static final SubLString $str88$Mx4rwUngQZwpEbGdrcN5Y29ycA;
  private static final SubLString $str89$Mx4r4mEaVOntSZGbWN2s9Fz9Qg;
  private static final SubLString $str90$Mx4rmf6Ho3chEdeE6gACs6hcsw;
  private static final SubLString $str91$Mx4rvYM7ypwpEbGdrcN5Y29ycA;
  private static final SubLString $str92$Mx4rThy3oyGJEdeT7AACs6hcjQ;
  private static final SubLString $str93$Mx4rIwA6HEEvTwSmjNm_7LzJgg;
  private static final SubLString $str94$Mx4rvmBi3JwpEbGdrcN5Y29ycA;
  private static final SubLString $str95$Mx4rLWcT_MdiRQ67wEzzFk_1Zw;
  private static final SubLString $str96$Mx4rk12jpbxjEdaEXAACs2TnIQ;
  private static final SubLString $str97$Mx4rmf6HpHchEdeE6gACs6hcsw;
  private static final SubLString $str98$Mx4r9X3Iju_dQdiD0Yfo3BsIMg;
  private static final SubLString $str99$Mx4rvezhZZwpEbGdrcN5Y29ycA;
  private static final SubLString $str100$Mx4rSQlLEUvoEdaYSgCgycbRww;
  private static final SubLString $str101$Mx4rvxuta5wpEbGdrcN5Y29ycA;
  private static final SubLString $str102$Mx4r_uX_2AefEdaAAACQJ5rCAA;
  private static final SubLString $str103$Mx4rICUpQkp_EdeKpgACs6hcjQ;
  private static final SubLString $str104$Mx4roceTcryxEeGWhAAhm0Q2sg;
  private static final SubLString $str105$Mx4rmf6HpXchEdeE6gACs6hcsw;
  private static final SubLString $str106$Mx4rvmTAxJwpEbGdrcN5Y29ycA;
  private static final SubLString $str107$Mx4rYoozUNBZEdedGwACs71DBA;
  private static final SubLString $str108$Mx4rSQlLE0voEdaYSgCgycbRww;
  private static final SubLString $str109$Mx4rICUpQ0p_EdeKpgACs6hcjQ;
  private static final SubLString $str110$Mx4rlkm1bqSzRiSyLBUbHH3FUA;
  private static final SubLString $str111$Mx4r3U_iUjRxSWiPrxg6ncLKcw;
  private static final SubLString $str112$Mx4r7GGXUnxEEdqaswACs4kcHw;
  private static final SubLString $str113$Mx4rgj_R0OB_EdaX8QACs2TnIQ;
  private static final SubLString $str114$Mx4roqwPmQNuRgGulm6Ka5Q5NA;
  private static final SubLString $str115$Mx4rKLy51T3eEdeQMwACs6hcjQ;
  private static final SubLString $str116$Mx4ra1OkhKSqEdaAAACgycbRww;

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 518L)
  public static SubLObject initialize_pph_phrase_fns()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary.clear_dictionary( pph_vars.$pph_phrase_fns$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      SubLObject node_var = $const2$SententialConstituent;
      final SubLObject deck_type = $kw5$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
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
            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const14$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const14$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const14$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const14$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const2$SententialConstituent, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const14$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject phrase_type = node_var;
                    final SubLObject _prev_bind_0_$5 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$6 = pred_relevance_macros.$pred$.currentBinding( thread );
                    try
                    {
                      pred_relevance_macros.$relevant_pred_function$.bind( $sym15$RELEVANT_PRED_IS_EQ, thread );
                      pred_relevance_macros.$pred$.bind( $const16$resultIsa, thread );
                      final SubLObject pred_var = NIL;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( phrase_type, TWO_INTEGER, pred_var ) )
                      {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( phrase_type, TWO_INTEGER, pred_var );
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw17$GAF, NIL, NIL );
                              SubLObject done_var_$11 = NIL;
                              final SubLObject token_var_$12 = NIL;
                              while ( NIL == done_var_$11)
                              {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$12 );
                                final SubLObject valid_$13 = makeBoolean( !token_var_$12.eql( as ) );
                                if( NIL != valid_$13 )
                                {
                                  dictionary_utilities.dictionary_push( pph_vars.$pph_phrase_fns$.getDynamicValue( thread ), assertions_high.gaf_arg1( as ), assertions_high.assertion_mt( as ) );
                                }
                                done_var_$11 = makeBoolean( NIL == valid_$13 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                              }
                            }
                          }
                          done_var = makeBoolean( NIL == valid );
                        }
                      }
                    }
                    finally
                    {
                      pred_relevance_macros.$pred$.rebind( _prev_bind_1_$6, thread );
                      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$5, thread );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const14$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$18;
                                    for( iteration_state_$18 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$18 ); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next( iteration_state_$18 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$18 );
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
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str18$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$18 );
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
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str19$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$20;
                          final SubLObject new_list = cdolist_list_var_$20 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$20.first();
                          while ( NIL != cdolist_list_var_$20)
                          {
                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str18$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$10, thread );
                            }
                            cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                            generating_fn = cdolist_list_var_$20.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$7, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$8, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$5, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$4, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str20$Node__a_does_not_pass_sbhl_type_t, $const2$SententialConstituent, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$4, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$3, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$3, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    dictionary.dictionary_enter( pph_vars.$pph_phrase_fns$.getDynamicValue( thread ), $sym21$INIT_STATE, T );
    return $kw22$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 908L)
  public static SubLObject pph_phrase_fns_initializedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_lookup( pph_vars.$pph_phrase_fns$.getDynamicValue( thread ), $sym21$INIT_STATE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 1016L)
  public static SubLObject pph_phrase_fnP(final SubLObject fn, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw23$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( fn ) )
    {
      return NIL;
    }
    if( NIL == pph_phrase_fns_initializedP() )
    {
      initialize_pph_phrase_fns();
    }
    final SubLObject mts = dictionary.dictionary_lookup( pph_vars.$pph_phrase_fns$.getDynamicValue( thread ), fn, UNPROVIDED );
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var;
      SubLObject fn_mt;
      for( csome_list_var = mts, fn_mt = NIL, fn_mt = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = makeBoolean( mt == $kw23$ANY || NIL != pph_utilities.pph_genl_mtP( fn_mt,
          mt ) ), csome_list_var = csome_list_var.rest(), fn_mt = csome_list_var.first() )
      {
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 1446L)
  public static SubLObject latitudeorlongitudeparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str24$Mx4rhDMb43qFEdeIbwACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 1585L)
  public static SubLObject bestevaluatedifevaluatablephrasefn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str25$Mx4rl7_8Pp0jQdiBO4ycSvStiw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 1738L)
  public static SubLObject definitenounppfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str26$Mx4rv9etYZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 1861L)
  public static SubLObject basictransitivesentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str27$Mx4r4qYf0c5cEdechAACs71DBA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 1993L)
  public static SubLObject termparaphrasefn_countywithstateorprovinceabbreviation()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str28$Mx4rm6wfdNKHQdeUh8wvM5gGAw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2154L)
  public static SubLObject termparaphrasefn_citywithstateorprovincename()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str29$Mx4r4GwYjHW_QdeHh6EhyfXStQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2305L)
  public static SubLObject terseparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str30$Mx4reSyRUdcUEdaFyAACs2TnIQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2429L)
  public static SubLObject npisxp_nlsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str31$Mx4rvs_o2pwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2555L)
  public static SubLObject termparaphrasefn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str32$Mx4rv4kOOZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2690L)
  public static SubLObject nldisjunctionfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str33$Mx4rmBlTDEU5Qdif8plYg4lJxA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2812L)
  public static SubLObject formulaargpositionparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str34$Mx4rsyk2ttk0S22jYvB1JuNDkQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 2949L)
  public static SubLObject ndecimalplaceparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str35$Mx4r6pWikBjUEduZTwAg7ZIttw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3081L)
  public static SubLObject termparaphrasefn_physicallocationtype()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str36$Mx4rdOh8h_CHEeGRmQAhm0Q2sg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3225L)
  public static SubLObject bestdetnbarfn_definite()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str37$Mx4rwAhK5JwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3354L)
  public static SubLObject bestmathformulaoperandfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str38$Mx4rKLzg4D3eEdeQMwACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3485L)
  public static SubLObject unlinkedsubparaphrasewithhtmlfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str39$Mx4rspGR8KevR3q9OyimHyW1Ug );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3623L)
  public static SubLObject bestlistparaphrasewithseparatorfn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str40$Mx4rThyQkSGJEdeT7AACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3775L)
  public static SubLObject twodigityearparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str41$Mx4rVa_rlhgKEduAAAAOpmP6tw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 3906L)
  public static SubLObject termparaphrasefn_citywithstateorprovinceabbreviation()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str42$Mx4rguFyVjInQdeb2uIGDYLy5g );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4065L)
  public static SubLObject bestsymbolphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str43$Mx4rThvNRSGJEdeT7AACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4190L)
  public static SubLObject xactsasayinz_nlsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str44$Mx4rFJWzcCmKQded_KkEW7JuSg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4322L)
  public static SubLObject tensedphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str45$Mx4rNtu0kedwEdaLcQACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4443L)
  public static SubLObject termparaphrasefn_np_quatype()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str46$Mx4rK5PGEao_EdqHBAACs4kcHw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4577L)
  public static SubLObject gentemplaterecipeomitsargfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str47$Mx4rN6cLwHc3EdeG6QACs6hcsw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4711L)
  public static SubLObject termparaphrasefn_citywithcountryname()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str48$Mx4rgW_8inXFQdefRuyaDCbnaw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 4854L)
  public static SubLObject termparaphrasefn_countywithstateorprovincename()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str49$Mx4rnojpEn_lEdedQQCQJw5drg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5007L)
  public static SubLObject typeclarifyingphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str50$Mx4rZMze3MphEd6DUAAhm0QyzA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5136L)
  public static SubLObject xhasyasaz_nlsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str51$Mx4rwHtux5wpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5265L)
  public static SubLObject termparaphrasefn_possessive()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str52$Mx4rXWtZQyZKEdaUJQCQJ0LyHA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5399L)
  public static SubLObject bestchemicalformulafn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str53$Mx4ru2wgcRKdEdeSiwACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5527L)
  public static SubLObject termparaphrasefn_citywithcountryabbreviation()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str54$Mx4rlniqtHXKQdeMA_lnrY70Fw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5678L)
  public static SubLObject indefinitenbarppfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str55$Mx4rzTlFrBH5QdebNKKWlazJMw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5803L)
  public static SubLObject concatenatephrasesfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str56$Mx4rvrENgpwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 5930L)
  public static SubLObject indefinitenounppfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str57$Mx4rvyFfh5wpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6055L)
  public static SubLObject nbarheadedbynounformfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str58$Mx4rgd3ECRNoEdedHAACs2TnIQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6184L)
  public static SubLObject termparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str59$Mx4rvmnxkpwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6307L)
  public static SubLObject definitenbarppfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str60$Mx4r9kbKUBH5QdeJXOGeo_7kPQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6430L)
  public static SubLObject termparaphrasefn_temporallocation_day()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str61$Mx4rieoqVwG4Tf6jsUnHfhvR0A );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6574L)
  public static SubLObject basictransitive_passivesentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str62$Mx4ryIoV0qs4EdeOWAACs6hcsw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6714L)
  public static SubLObject documentsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str63$Mx4re_lCGqpIEdaAAABQ2sS97g );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6839L)
  public static SubLObject postmodifier_edformfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str64$Mx4rgd3ECBNoEdedHAACs2TnIQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 6967L)
  public static SubLObject bestheadverbforinitialsubjectfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str65$Mx4rvriei5wpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7105L)
  public static SubLObject bestnlphraseofstringfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str66$Mx4rwVUUNpwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7234L)
  public static SubLObject paragraphsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str67$Mx4reW2Q9KpIEdaAAABQ2sS97g );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7360L)
  public static SubLObject bestnumberedlistparaphrasefn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str68$Mx4rPmTuNUCxEdeXYQACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7507L)
  public static SubLObject bestnlwordformoflexemefn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str69$Mx4rv2M475wpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7650L)
  public static SubLObject bestnlwordformoflexemefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str70$Mx4rwKmyGZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7781L)
  public static SubLObject preciseparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str71$Mx4rwIsbdJwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 7907L)
  public static SubLObject termparaphrasefn_pp()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str72$Mx4rliHQJipEQdefpKOhvJ8kEA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8033L)
  public static SubLObject bestppfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str73$Mx4ruabZ1C51EdeLxQACs2TnIQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8148L)
  public static SubLObject genvalueparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str74$Mx4rv6urFZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8275L)
  public static SubLObject bestbindingsphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str75$Mx4r7ZfvYjVnEdeRXQACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8402L)
  public static SubLObject phraseformfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str76$Mx4rvgAOxZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8521L)
  public static SubLObject stringmentionfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str77$Mx4rvzZuvJwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8643L)
  public static SubLObject bestcyclphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str78$Mx4rv4d5RJwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8766L)
  public static SubLObject bestdetnbarfn_indefinite()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str79$Mx4rvdYMW5wpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 8897L)
  public static SubLObject bestdetnbarfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str80$Mx4rvxCAuJwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9017L)
  public static SubLObject tensedphrasefn_defaultpast()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str81$Mx4rbsiYBe3iEdaLcQACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9150L)
  public static SubLObject termparaphrasefn_pp_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str82$Mx4rqvJCpipEQdeYU9FDU1LZTA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9288L)
  public static SubLObject explicitifcollection_nlphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str83$Mx4rviW1MZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9426L)
  public static SubLObject generategkeglosswrtmtfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str84$Mx4rTM6_q2uxQumO6o0j5w146Q );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9556L)
  public static SubLObject pluralparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str85$Mx4rmf6HonchEdeE6gACs6hcsw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9681L)
  public static SubLObject bestverbformforsubjectfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str86$Mx4rvYIU_JwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9812L)
  public static SubLObject concatenatephrasesfn_nospaces()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str87$Mx4rR_asowkkEdeeTwACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 9948L)
  public static SubLObject nlsimplebinaryconjunctionfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str88$Mx4rwUngQZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10082L)
  public static SubLObject structuredparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str89$Mx4r4mEaVOntSZGbWN2s9Fz9Qg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10211L)
  public static SubLObject pluralparaphrasefn_pp()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str90$Mx4rmf6Ho3chEdeE6gACs6hcsw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10339L)
  public static SubLObject headwordofphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str91$Mx4rvYM7ypwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10464L)
  public static SubLObject bestlistparaphrasewithseparatorandcoefficientsfn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str92$Mx4rThy3oyGJEdeT7AACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10631L)
  public static SubLObject nlconjunctionfn_but()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str93$Mx4rIwA6HEEvTwSmjNm_7LzJgg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10757L)
  public static SubLObject termparaphrasefn_npandnp()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str94$Mx4rvmBi3JwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 10888L)
  public static SubLObject subparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str95$Mx4rLWcT_MdiRQ67wEzzFk_1Zw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11010L)
  public static SubLObject percentparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str96$Mx4rk12jpbxjEdaEXAACs2TnIQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11136L)
  public static SubLObject bestpluraloflexemefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str97$Mx4rmf6HpHchEdeE6gACs6hcsw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11263L)
  public static SubLObject termparaphrasefn_physicallocation()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str98$Mx4r9X3Iju_dQdiD0Yfo3BsIMg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11403L)
  public static SubLObject nthphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str99$Mx4rvezhZZwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11521L)
  public static SubLObject nlconjunctionfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str100$Mx4rSQlLEUvoEdaYSgCgycbRww );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11643L)
  public static SubLObject termparaphrasefn_np()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str101$Mx4rvxuta5wpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11769L)
  public static SubLObject quotedparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str102$Mx4r_uX_2AefEdaAAACQJ5rCAA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 11894L)
  public static SubLObject bestsetparaphrasewithseparatorandcoefficientsfn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str103$Mx4rICUpQkp_EdeKpgACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12060L)
  public static SubLObject oclockfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str104$Mx4roceTcryxEeGWhAAhm0Q2sg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12175L)
  public static SubLObject nbarwithpluralheadfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str105$Mx4rmf6HpXchEdeE6gACs6hcsw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12302L)
  public static SubLObject conditionalphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str106$Mx4rvmTAxJwpEbGdrcN5Y29ycA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12428L)
  public static SubLObject phrasecyclfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str107$Mx4rYoozUNBZEdedGwACs71DBA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12547L)
  public static SubLObject repeatforsubsequentargsfn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str108$Mx4rSQlLE0voEdaYSgCgycbRww );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12679L)
  public static SubLObject bestcoefficientitemphrasefn_constrained()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str109$Mx4rICUpQ0p_EdeKpgACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12825L)
  public static SubLObject termparaphrasefn_prenominalmodifier()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str110$Mx4rlkm1bqSzRiSyLBUbHH3FUA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 12967L)
  public static SubLObject unlinkedsubparaphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str111$Mx4r3U_iUjRxSWiPrxg6ncLKcw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 13097L)
  public static SubLObject termparaphrasefn_temporallocation_date()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str112$Mx4r7GGXUnxEEdqaswACs4kcHw );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 13242L)
  public static SubLObject termparaphrasefn_temporallocation()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str113$Mx4rgj_R0OB_EdaX8QACs2TnIQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 13382L)
  public static SubLObject nphasxp_nlsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str114$Mx4roqwPmQNuRgGulm6Ka5Q5NA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 13509L)
  public static SubLObject bestparentheticalphrasefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str115$Mx4rKLy51T3eEdeQMwACs6hcjQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-functions.lisp", position = 13641L)
  public static SubLObject bestnlstringforsentencefn()
  {
    return kb_utilities.find_object_by_compact_hl_external_id_string( $str116$Mx4ra1OkhKSqEdaAAACgycbRww );
  }

  public static SubLObject declare_pph_functions_file()
  {
    SubLFiles.declareFunction( me, "initialize_pph_phrase_fns", "INITIALIZE-PPH-PHRASE-FNS", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_fns_initializedP", "PPH-PHRASE-FNS-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_fnP", "PPH-PHRASE-FN?", 1, 1, false );
    SubLFiles.declareFunction( me, "latitudeorlongitudeparaphrasefn", "LATITUDEORLONGITUDEPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestevaluatedifevaluatablephrasefn_constrained", "BESTEVALUATEDIFEVALUATABLEPHRASEFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "definitenounppfn", "DEFINITENOUNPPFN", 0, 0, false );
    SubLFiles.declareFunction( me, "basictransitivesentencefn", "BASICTRANSITIVESENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_countywithstateorprovinceabbreviation", "TERMPARAPHRASEFN-COUNTYWITHSTATEORPROVINCEABBREVIATION", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_citywithstateorprovincename", "TERMPARAPHRASEFN-CITYWITHSTATEORPROVINCENAME", 0, 0, false );
    SubLFiles.declareFunction( me, "terseparaphrasefn", "TERSEPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "npisxp_nlsentencefn", "NPISXP-NLSENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_constrained", "TERMPARAPHRASEFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "nldisjunctionfn", "NLDISJUNCTIONFN", 0, 0, false );
    SubLFiles.declareFunction( me, "formulaargpositionparaphrasefn", "FORMULAARGPOSITIONPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "ndecimalplaceparaphrasefn", "NDECIMALPLACEPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_physicallocationtype", "TERMPARAPHRASEFN-PHYSICALLOCATIONTYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "bestdetnbarfn_definite", "BESTDETNBARFN-DEFINITE", 0, 0, false );
    SubLFiles.declareFunction( me, "bestmathformulaoperandfn", "BESTMATHFORMULAOPERANDFN", 0, 0, false );
    SubLFiles.declareFunction( me, "unlinkedsubparaphrasewithhtmlfn", "UNLINKEDSUBPARAPHRASEWITHHTMLFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestlistparaphrasewithseparatorfn_constrained", "BESTLISTPARAPHRASEWITHSEPARATORFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "twodigityearparaphrasefn", "TWODIGITYEARPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_citywithstateorprovinceabbreviation", "TERMPARAPHRASEFN-CITYWITHSTATEORPROVINCEABBREVIATION", 0, 0, false );
    SubLFiles.declareFunction( me, "bestsymbolphrasefn", "BESTSYMBOLPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "xactsasayinz_nlsentencefn", "XACTSASAYINZ-NLSENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "tensedphrasefn", "TENSEDPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_np_quatype", "TERMPARAPHRASEFN-NP-QUATYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "gentemplaterecipeomitsargfn", "GENTEMPLATERECIPEOMITSARGFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_citywithcountryname", "TERMPARAPHRASEFN-CITYWITHCOUNTRYNAME", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_countywithstateorprovincename", "TERMPARAPHRASEFN-COUNTYWITHSTATEORPROVINCENAME", 0, 0, false );
    SubLFiles.declareFunction( me, "typeclarifyingphrasefn", "TYPECLARIFYINGPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "xhasyasaz_nlsentencefn", "XHASYASAZ-NLSENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_possessive", "TERMPARAPHRASEFN-POSSESSIVE", 0, 0, false );
    SubLFiles.declareFunction( me, "bestchemicalformulafn", "BESTCHEMICALFORMULAFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_citywithcountryabbreviation", "TERMPARAPHRASEFN-CITYWITHCOUNTRYABBREVIATION", 0, 0, false );
    SubLFiles.declareFunction( me, "indefinitenbarppfn", "INDEFINITENBARPPFN", 0, 0, false );
    SubLFiles.declareFunction( me, "concatenatephrasesfn", "CONCATENATEPHRASESFN", 0, 0, false );
    SubLFiles.declareFunction( me, "indefinitenounppfn", "INDEFINITENOUNPPFN", 0, 0, false );
    SubLFiles.declareFunction( me, "nbarheadedbynounformfn", "NBARHEADEDBYNOUNFORMFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn", "TERMPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "definitenbarppfn", "DEFINITENBARPPFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_temporallocation_day", "TERMPARAPHRASEFN-TEMPORALLOCATION-DAY", 0, 0, false );
    SubLFiles.declareFunction( me, "basictransitive_passivesentencefn", "BASICTRANSITIVE-PASSIVESENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "documentsentencefn", "DOCUMENTSENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "postmodifier_edformfn", "POSTMODIFIER_EDFORMFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestheadverbforinitialsubjectfn", "BESTHEADVERBFORINITIALSUBJECTFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestnlphraseofstringfn", "BESTNLPHRASEOFSTRINGFN", 0, 0, false );
    SubLFiles.declareFunction( me, "paragraphsentencefn", "PARAGRAPHSENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestnumberedlistparaphrasefn_constrained", "BESTNUMBEREDLISTPARAPHRASEFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "bestnlwordformoflexemefn_constrained", "BESTNLWORDFORMOFLEXEMEFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "bestnlwordformoflexemefn", "BESTNLWORDFORMOFLEXEMEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "preciseparaphrasefn", "PRECISEPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_pp", "TERMPARAPHRASEFN-PP", 0, 0, false );
    SubLFiles.declareFunction( me, "bestppfn", "BESTPPFN", 0, 0, false );
    SubLFiles.declareFunction( me, "genvalueparaphrasefn", "GENVALUEPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestbindingsphrasefn", "BESTBINDINGSPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "phraseformfn", "PHRASEFORMFN", 0, 0, false );
    SubLFiles.declareFunction( me, "stringmentionfn", "STRINGMENTIONFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestcyclphrasefn", "BESTCYCLPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestdetnbarfn_indefinite", "BESTDETNBARFN-INDEFINITE", 0, 0, false );
    SubLFiles.declareFunction( me, "bestdetnbarfn", "BESTDETNBARFN", 0, 0, false );
    SubLFiles.declareFunction( me, "tensedphrasefn_defaultpast", "TENSEDPHRASEFN-DEFAULTPAST", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_pp_constrained", "TERMPARAPHRASEFN-PP-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "explicitifcollection_nlphrasefn", "EXPLICITIFCOLLECTION-NLPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "generategkeglosswrtmtfn", "GENERATEGKEGLOSSWRTMTFN", 0, 0, false );
    SubLFiles.declareFunction( me, "pluralparaphrasefn", "PLURALPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestverbformforsubjectfn", "BESTVERBFORMFORSUBJECTFN", 0, 0, false );
    SubLFiles.declareFunction( me, "concatenatephrasesfn_nospaces", "CONCATENATEPHRASESFN-NOSPACES", 0, 0, false );
    SubLFiles.declareFunction( me, "nlsimplebinaryconjunctionfn", "NLSIMPLEBINARYCONJUNCTIONFN", 0, 0, false );
    SubLFiles.declareFunction( me, "structuredparaphrasefn", "STRUCTUREDPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "pluralparaphrasefn_pp", "PLURALPARAPHRASEFN-PP", 0, 0, false );
    SubLFiles.declareFunction( me, "headwordofphrasefn", "HEADWORDOFPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestlistparaphrasewithseparatorandcoefficientsfn_constrained", "BESTLISTPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "nlconjunctionfn_but", "NLCONJUNCTIONFN-BUT", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_npandnp", "TERMPARAPHRASEFN-NPANDNP", 0, 0, false );
    SubLFiles.declareFunction( me, "subparaphrasefn", "SUBPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "percentparaphrasefn", "PERCENTPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestpluraloflexemefn", "BESTPLURALOFLEXEMEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_physicallocation", "TERMPARAPHRASEFN-PHYSICALLOCATION", 0, 0, false );
    SubLFiles.declareFunction( me, "nthphrasefn", "NTHPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "nlconjunctionfn", "NLCONJUNCTIONFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_np", "TERMPARAPHRASEFN-NP", 0, 0, false );
    SubLFiles.declareFunction( me, "quotedparaphrasefn", "QUOTEDPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestsetparaphrasewithseparatorandcoefficientsfn_constrained", "BESTSETPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "oclockfn", "OCLOCKFN", 0, 0, false );
    SubLFiles.declareFunction( me, "nbarwithpluralheadfn", "NBARWITHPLURALHEADFN", 0, 0, false );
    SubLFiles.declareFunction( me, "conditionalphrasefn", "CONDITIONALPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "phrasecyclfn", "PHRASECYCLFN", 0, 0, false );
    SubLFiles.declareFunction( me, "repeatforsubsequentargsfn", "REPEATFORSUBSEQUENTARGSFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestcoefficientitemphrasefn_constrained", "BESTCOEFFICIENTITEMPHRASEFN-CONSTRAINED", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_prenominalmodifier", "TERMPARAPHRASEFN-PRENOMINALMODIFIER", 0, 0, false );
    SubLFiles.declareFunction( me, "unlinkedsubparaphrasefn", "UNLINKEDSUBPARAPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_temporallocation_date", "TERMPARAPHRASEFN-TEMPORALLOCATION-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "termparaphrasefn_temporallocation", "TERMPARAPHRASEFN-TEMPORALLOCATION", 0, 0, false );
    SubLFiles.declareFunction( me, "nphasxp_nlsentencefn", "NPHASXP-NLSENTENCEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestparentheticalphrasefn", "BESTPARENTHETICALPHRASEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "bestnlstringforsentencefn", "BESTNLSTRINGFORSENTENCEFN", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_functions_file()
  {
    return NIL;
  }

  public static SubLObject setup_pph_functions_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_functions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_functions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_functions_file();
  }
  static
  {
    me = new pph_functions();
    $sym0$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const1$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const2$SententialConstituent = constant_handles.reader_make_constant_shell( makeString( "SententialConstituent" ) );
    $kw3$BREADTH = makeKeyword( "BREADTH" );
    $kw4$QUEUE = makeKeyword( "QUEUE" );
    $kw5$STACK = makeKeyword( "STACK" );
    $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw7$ERROR = makeKeyword( "ERROR" );
    $str8$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym9$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw10$CERROR = makeKeyword( "CERROR" );
    $str11$continue_anyway = makeString( "continue anyway" );
    $kw12$WARN = makeKeyword( "WARN" );
    $str13$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const14$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym15$RELEVANT_PRED_IS_EQ = makeSymbol( "RELEVANT-PRED-IS-EQ" );
    $const16$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $kw17$GAF = makeKeyword( "GAF" );
    $str18$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str19$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str20$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym21$INIT_STATE = makeSymbol( "INIT-STATE" );
    $kw22$INITIALIZED = makeKeyword( "INITIALIZED" );
    $kw23$ANY = makeKeyword( "ANY" );
    $str24$Mx4rhDMb43qFEdeIbwACs6hcjQ = makeString( "Mx4rhDMb43qFEdeIbwACs6hcjQ" );
    $str25$Mx4rl7_8Pp0jQdiBO4ycSvStiw = makeString( "Mx4rl7_8Pp0jQdiBO4ycSvStiw" );
    $str26$Mx4rv9etYZwpEbGdrcN5Y29ycA = makeString( "Mx4rv9etYZwpEbGdrcN5Y29ycA" );
    $str27$Mx4r4qYf0c5cEdechAACs71DBA = makeString( "Mx4r4qYf0c5cEdechAACs71DBA" );
    $str28$Mx4rm6wfdNKHQdeUh8wvM5gGAw = makeString( "Mx4rm6wfdNKHQdeUh8wvM5gGAw" );
    $str29$Mx4r4GwYjHW_QdeHh6EhyfXStQ = makeString( "Mx4r4GwYjHW_QdeHh6EhyfXStQ" );
    $str30$Mx4reSyRUdcUEdaFyAACs2TnIQ = makeString( "Mx4reSyRUdcUEdaFyAACs2TnIQ" );
    $str31$Mx4rvs_o2pwpEbGdrcN5Y29ycA = makeString( "Mx4rvs-o2pwpEbGdrcN5Y29ycA" );
    $str32$Mx4rv4kOOZwpEbGdrcN5Y29ycA = makeString( "Mx4rv4kOOZwpEbGdrcN5Y29ycA" );
    $str33$Mx4rmBlTDEU5Qdif8plYg4lJxA = makeString( "Mx4rmBlTDEU5Qdif8plYg4lJxA" );
    $str34$Mx4rsyk2ttk0S22jYvB1JuNDkQ = makeString( "Mx4rsyk2ttk0S22jYvB1JuNDkQ" );
    $str35$Mx4r6pWikBjUEduZTwAg7ZIttw = makeString( "Mx4r6pWikBjUEduZTwAg7ZIttw" );
    $str36$Mx4rdOh8h_CHEeGRmQAhm0Q2sg = makeString( "Mx4rdOh8h_CHEeGRmQAhm0Q2sg" );
    $str37$Mx4rwAhK5JwpEbGdrcN5Y29ycA = makeString( "Mx4rwAhK5JwpEbGdrcN5Y29ycA" );
    $str38$Mx4rKLzg4D3eEdeQMwACs6hcjQ = makeString( "Mx4rKLzg4D3eEdeQMwACs6hcjQ" );
    $str39$Mx4rspGR8KevR3q9OyimHyW1Ug = makeString( "Mx4rspGR8KevR3q9OyimHyW1Ug" );
    $str40$Mx4rThyQkSGJEdeT7AACs6hcjQ = makeString( "Mx4rThyQkSGJEdeT7AACs6hcjQ" );
    $str41$Mx4rVa_rlhgKEduAAAAOpmP6tw = makeString( "Mx4rVa-rlhgKEduAAAAOpmP6tw" );
    $str42$Mx4rguFyVjInQdeb2uIGDYLy5g = makeString( "Mx4rguFyVjInQdeb2uIGDYLy5g" );
    $str43$Mx4rThvNRSGJEdeT7AACs6hcjQ = makeString( "Mx4rThvNRSGJEdeT7AACs6hcjQ" );
    $str44$Mx4rFJWzcCmKQded_KkEW7JuSg = makeString( "Mx4rFJWzcCmKQded-KkEW7JuSg" );
    $str45$Mx4rNtu0kedwEdaLcQACs6hcjQ = makeString( "Mx4rNtu0kedwEdaLcQACs6hcjQ" );
    $str46$Mx4rK5PGEao_EdqHBAACs4kcHw = makeString( "Mx4rK5PGEao-EdqHBAACs4kcHw" );
    $str47$Mx4rN6cLwHc3EdeG6QACs6hcsw = makeString( "Mx4rN6cLwHc3EdeG6QACs6hcsw" );
    $str48$Mx4rgW_8inXFQdefRuyaDCbnaw = makeString( "Mx4rgW_8inXFQdefRuyaDCbnaw" );
    $str49$Mx4rnojpEn_lEdedQQCQJw5drg = makeString( "Mx4rnojpEn_lEdedQQCQJw5drg" );
    $str50$Mx4rZMze3MphEd6DUAAhm0QyzA = makeString( "Mx4rZMze3MphEd6DUAAhm0QyzA" );
    $str51$Mx4rwHtux5wpEbGdrcN5Y29ycA = makeString( "Mx4rwHtux5wpEbGdrcN5Y29ycA" );
    $str52$Mx4rXWtZQyZKEdaUJQCQJ0LyHA = makeString( "Mx4rXWtZQyZKEdaUJQCQJ0LyHA" );
    $str53$Mx4ru2wgcRKdEdeSiwACs6hcjQ = makeString( "Mx4ru2wgcRKdEdeSiwACs6hcjQ" );
    $str54$Mx4rlniqtHXKQdeMA_lnrY70Fw = makeString( "Mx4rlniqtHXKQdeMA-lnrY70Fw" );
    $str55$Mx4rzTlFrBH5QdebNKKWlazJMw = makeString( "Mx4rzTlFrBH5QdebNKKWlazJMw" );
    $str56$Mx4rvrENgpwpEbGdrcN5Y29ycA = makeString( "Mx4rvrENgpwpEbGdrcN5Y29ycA" );
    $str57$Mx4rvyFfh5wpEbGdrcN5Y29ycA = makeString( "Mx4rvyFfh5wpEbGdrcN5Y29ycA" );
    $str58$Mx4rgd3ECRNoEdedHAACs2TnIQ = makeString( "Mx4rgd3ECRNoEdedHAACs2TnIQ" );
    $str59$Mx4rvmnxkpwpEbGdrcN5Y29ycA = makeString( "Mx4rvmnxkpwpEbGdrcN5Y29ycA" );
    $str60$Mx4r9kbKUBH5QdeJXOGeo_7kPQ = makeString( "Mx4r9kbKUBH5QdeJXOGeo_7kPQ" );
    $str61$Mx4rieoqVwG4Tf6jsUnHfhvR0A = makeString( "Mx4rieoqVwG4Tf6jsUnHfhvR0A" );
    $str62$Mx4ryIoV0qs4EdeOWAACs6hcsw = makeString( "Mx4ryIoV0qs4EdeOWAACs6hcsw" );
    $str63$Mx4re_lCGqpIEdaAAABQ2sS97g = makeString( "Mx4re-lCGqpIEdaAAABQ2sS97g" );
    $str64$Mx4rgd3ECBNoEdedHAACs2TnIQ = makeString( "Mx4rgd3ECBNoEdedHAACs2TnIQ" );
    $str65$Mx4rvriei5wpEbGdrcN5Y29ycA = makeString( "Mx4rvriei5wpEbGdrcN5Y29ycA" );
    $str66$Mx4rwVUUNpwpEbGdrcN5Y29ycA = makeString( "Mx4rwVUUNpwpEbGdrcN5Y29ycA" );
    $str67$Mx4reW2Q9KpIEdaAAABQ2sS97g = makeString( "Mx4reW2Q9KpIEdaAAABQ2sS97g" );
    $str68$Mx4rPmTuNUCxEdeXYQACs6hcjQ = makeString( "Mx4rPmTuNUCxEdeXYQACs6hcjQ" );
    $str69$Mx4rv2M475wpEbGdrcN5Y29ycA = makeString( "Mx4rv2M475wpEbGdrcN5Y29ycA" );
    $str70$Mx4rwKmyGZwpEbGdrcN5Y29ycA = makeString( "Mx4rwKmyGZwpEbGdrcN5Y29ycA" );
    $str71$Mx4rwIsbdJwpEbGdrcN5Y29ycA = makeString( "Mx4rwIsbdJwpEbGdrcN5Y29ycA" );
    $str72$Mx4rliHQJipEQdefpKOhvJ8kEA = makeString( "Mx4rliHQJipEQdefpKOhvJ8kEA" );
    $str73$Mx4ruabZ1C51EdeLxQACs2TnIQ = makeString( "Mx4ruabZ1C51EdeLxQACs2TnIQ" );
    $str74$Mx4rv6urFZwpEbGdrcN5Y29ycA = makeString( "Mx4rv6urFZwpEbGdrcN5Y29ycA" );
    $str75$Mx4r7ZfvYjVnEdeRXQACs6hcjQ = makeString( "Mx4r7ZfvYjVnEdeRXQACs6hcjQ" );
    $str76$Mx4rvgAOxZwpEbGdrcN5Y29ycA = makeString( "Mx4rvgAOxZwpEbGdrcN5Y29ycA" );
    $str77$Mx4rvzZuvJwpEbGdrcN5Y29ycA = makeString( "Mx4rvzZuvJwpEbGdrcN5Y29ycA" );
    $str78$Mx4rv4d5RJwpEbGdrcN5Y29ycA = makeString( "Mx4rv4d5RJwpEbGdrcN5Y29ycA" );
    $str79$Mx4rvdYMW5wpEbGdrcN5Y29ycA = makeString( "Mx4rvdYMW5wpEbGdrcN5Y29ycA" );
    $str80$Mx4rvxCAuJwpEbGdrcN5Y29ycA = makeString( "Mx4rvxCAuJwpEbGdrcN5Y29ycA" );
    $str81$Mx4rbsiYBe3iEdaLcQACs6hcjQ = makeString( "Mx4rbsiYBe3iEdaLcQACs6hcjQ" );
    $str82$Mx4rqvJCpipEQdeYU9FDU1LZTA = makeString( "Mx4rqvJCpipEQdeYU9FDU1LZTA" );
    $str83$Mx4rviW1MZwpEbGdrcN5Y29ycA = makeString( "Mx4rviW1MZwpEbGdrcN5Y29ycA" );
    $str84$Mx4rTM6_q2uxQumO6o0j5w146Q = makeString( "Mx4rTM6_q2uxQumO6o0j5w146Q" );
    $str85$Mx4rmf6HonchEdeE6gACs6hcsw = makeString( "Mx4rmf6HonchEdeE6gACs6hcsw" );
    $str86$Mx4rvYIU_JwpEbGdrcN5Y29ycA = makeString( "Mx4rvYIU_JwpEbGdrcN5Y29ycA" );
    $str87$Mx4rR_asowkkEdeeTwACs6hcjQ = makeString( "Mx4rR_asowkkEdeeTwACs6hcjQ" );
    $str88$Mx4rwUngQZwpEbGdrcN5Y29ycA = makeString( "Mx4rwUngQZwpEbGdrcN5Y29ycA" );
    $str89$Mx4r4mEaVOntSZGbWN2s9Fz9Qg = makeString( "Mx4r4mEaVOntSZGbWN2s9Fz9Qg" );
    $str90$Mx4rmf6Ho3chEdeE6gACs6hcsw = makeString( "Mx4rmf6Ho3chEdeE6gACs6hcsw" );
    $str91$Mx4rvYM7ypwpEbGdrcN5Y29ycA = makeString( "Mx4rvYM7ypwpEbGdrcN5Y29ycA" );
    $str92$Mx4rThy3oyGJEdeT7AACs6hcjQ = makeString( "Mx4rThy3oyGJEdeT7AACs6hcjQ" );
    $str93$Mx4rIwA6HEEvTwSmjNm_7LzJgg = makeString( "Mx4rIwA6HEEvTwSmjNm-7LzJgg" );
    $str94$Mx4rvmBi3JwpEbGdrcN5Y29ycA = makeString( "Mx4rvmBi3JwpEbGdrcN5Y29ycA" );
    $str95$Mx4rLWcT_MdiRQ67wEzzFk_1Zw = makeString( "Mx4rLWcT-MdiRQ67wEzzFk_1Zw" );
    $str96$Mx4rk12jpbxjEdaEXAACs2TnIQ = makeString( "Mx4rk12jpbxjEdaEXAACs2TnIQ" );
    $str97$Mx4rmf6HpHchEdeE6gACs6hcsw = makeString( "Mx4rmf6HpHchEdeE6gACs6hcsw" );
    $str98$Mx4r9X3Iju_dQdiD0Yfo3BsIMg = makeString( "Mx4r9X3Iju-dQdiD0Yfo3BsIMg" );
    $str99$Mx4rvezhZZwpEbGdrcN5Y29ycA = makeString( "Mx4rvezhZZwpEbGdrcN5Y29ycA" );
    $str100$Mx4rSQlLEUvoEdaYSgCgycbRww = makeString( "Mx4rSQlLEUvoEdaYSgCgycbRww" );
    $str101$Mx4rvxuta5wpEbGdrcN5Y29ycA = makeString( "Mx4rvxuta5wpEbGdrcN5Y29ycA" );
    $str102$Mx4r_uX_2AefEdaAAACQJ5rCAA = makeString( "Mx4r-uX-2AefEdaAAACQJ5rCAA" );
    $str103$Mx4rICUpQkp_EdeKpgACs6hcjQ = makeString( "Mx4rICUpQkp-EdeKpgACs6hcjQ" );
    $str104$Mx4roceTcryxEeGWhAAhm0Q2sg = makeString( "Mx4roceTcryxEeGWhAAhm0Q2sg" );
    $str105$Mx4rmf6HpXchEdeE6gACs6hcsw = makeString( "Mx4rmf6HpXchEdeE6gACs6hcsw" );
    $str106$Mx4rvmTAxJwpEbGdrcN5Y29ycA = makeString( "Mx4rvmTAxJwpEbGdrcN5Y29ycA" );
    $str107$Mx4rYoozUNBZEdedGwACs71DBA = makeString( "Mx4rYoozUNBZEdedGwACs71DBA" );
    $str108$Mx4rSQlLE0voEdaYSgCgycbRww = makeString( "Mx4rSQlLE0voEdaYSgCgycbRww" );
    $str109$Mx4rICUpQ0p_EdeKpgACs6hcjQ = makeString( "Mx4rICUpQ0p-EdeKpgACs6hcjQ" );
    $str110$Mx4rlkm1bqSzRiSyLBUbHH3FUA = makeString( "Mx4rlkm1bqSzRiSyLBUbHH3FUA" );
    $str111$Mx4r3U_iUjRxSWiPrxg6ncLKcw = makeString( "Mx4r3U-iUjRxSWiPrxg6ncLKcw" );
    $str112$Mx4r7GGXUnxEEdqaswACs4kcHw = makeString( "Mx4r7GGXUnxEEdqaswACs4kcHw" );
    $str113$Mx4rgj_R0OB_EdaX8QACs2TnIQ = makeString( "Mx4rgj_R0OB-EdaX8QACs2TnIQ" );
    $str114$Mx4roqwPmQNuRgGulm6Ka5Q5NA = makeString( "Mx4roqwPmQNuRgGulm6Ka5Q5NA" );
    $str115$Mx4rKLy51T3eEdeQMwACs6hcjQ = makeString( "Mx4rKLy51T3eEdeQMwACs6hcjQ" );
    $str116$Mx4ra1OkhKSqEdaAAACgycbRww = makeString( "Mx4ra1OkhKSqEdaAAACgycbRww" );
  }
}
/*
 * 
 * Total time: 491 ms
 * 
 */