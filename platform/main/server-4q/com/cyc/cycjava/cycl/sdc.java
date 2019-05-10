package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sdc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sdc";
  public static final String myFingerPrint = "5ff939e3c4ae68efa87b7c1431d11e8ce4b206dd6e8d126224faae579982db4a";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2023L)
  public static SubLSymbol $sdc_exception_transfers_thru_specsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2353L)
  public static SubLSymbol $sdc_common_spec_exceptionP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2576L)
  public static SubLSymbol $ignoring_sdcP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2735L)
  private static SubLSymbol $sd_c1_genls_space$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2819L)
  private static SubLSymbol $sd_c2_genls_space$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2902L)
  private static SubLSymbol $sd_genls_isas_space$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3000L)
  private static SubLSymbol $sd_candidate_store$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13218L)
  private static SubLSymbol $sd_c2_genl$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14573L)
  private static SubLSymbol $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17047L)
  private static SubLSymbol $sbhl_sd_genls_isas_goal$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20595L)
  private static SubLSymbol $cached_all_isa_sdct_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26369L)
  private static SubLSymbol $cached_sdc_exceptions_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37624L)
  public static SubLSymbol $sdw_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37754L)
  public static SubLSymbol $sdw_test_level$;
  private static final SubLSymbol $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR;
  private static final SubLSymbol $sym1$_SD_C1_GENLS_SPACE_;
  private static final SubLSymbol $sym2$_SD_C2_GENLS_SPACE_;
  private static final SubLSymbol $sym3$_SD_GENLS_ISAS_SPACE_;
  private static final SubLSymbol $sym4$_SD_CANDIDATE_STORE_;
  private static final SubLSymbol $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw6$ERROR;
  private static final SubLString $str7$_A_is_not_a__A;
  private static final SubLSymbol $sym8$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw9$CERROR;
  private static final SubLString $str10$continue_anyway;
  private static final SubLSymbol $kw11$WARN;
  private static final SubLString $str12$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const13$genls;
  private static final SubLSymbol $kw14$DO_HASH_TABLE;
  private static final SubLSymbol $sym15$SBHL_MARK_SD_GENLS_ISAS;
  private static final SubLObject $const16$isa;
  private static final SubLSymbol $sym17$SBHL_GATHER_SD_CANDIDATES;
  private static final SubLSymbol $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES;
  private static final SubLSymbol $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_;
  private static final SubLSymbol $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_;
  private static final SubLSymbol $sym21$SBHL_SD_GOAL_IN_GENLS_ISAS_P;
  private static final SubLSymbol $sym22$GATHER_SDCT_ISAS;
  private static final SubLSymbol $sym23$GATHER_IF_SDCT_;
  private static final SubLSymbol $sym24$CACHED_ALL_ISA_SDCT;
  private static final SubLSymbol $sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P;
  private static final SubLSymbol $sym26$_CACHED_ALL_ISA_SDCT_CACHING_STATE_;
  private static final SubLInteger $int27$512;
  private static final SubLSymbol $sym28$SAFE_SDCT_ELEMENT_;
  private static final SubLSymbol $sym29$CACHED_SDC_EXCEPTIONS;
  private static final SubLSymbol $sym30$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_;
  private static final SubLSymbol $sym31$GATHER_DIRECT_SDC_EXCEPTIONS;
  private static final SubLObject $const32$siblingDisjointExceptions;
  private static final SubLObject $const33$rewriteOf;
  private static final SubLSymbol $sym34$GATHER_DIRECT_SDC_EXCEPTION;
  private static final SubLSymbol $kw35$TRUE;
  private static final SubLSymbol $kw36$ASSERTION;
  private static final SubLSymbol $kw37$OPAQUE;
  private static final SubLObject $const38$SiblingDisjointCollectionType;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$C1;
  private static final SubLSymbol $sym41$C2;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3109L)
  public static SubLObject ignoring_sdcP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ignoring_sdcP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3240L)
  public static SubLObject relevant_sibling_disjoint_collection_p(final SubLObject col)
  {
    return ( NIL != control_vars.within_assertP() ) ? fort_types_interface.disjoint_collection_p( col ) : fort_types_interface.sibling_disjoint_collection_p( col );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3572L)
  public static SubLObject with_sbhl_sd_marking_spaces(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, ConsesLow.list( $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym2$_SD_C2_GENLS_SPACE_, ConsesLow.list(
        $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym3$_SD_GENLS_ISAS_SPACE_, ConsesLow.listS( $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym4$_SD_CANDIDATE_STORE_, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3924L)
  public static SubLObject with_sbhl_sd_genls_isas_spaces(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, ConsesLow.list( $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, ConsesLow.listS(
        $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym3$_SD_GENLS_ISAS_SPACE_, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4192L)
  public static SubLObject any_isa_common_sdct(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject exceptionP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject tv_var = tv;
      final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
      try
      {
        sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
        sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
        if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
        {
          final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
          if( pcase_var.eql( $kw6$ERROR ) )
          {
            sbhl_paranoia.sbhl_error( ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var.eql( $kw9$CERROR ) )
          {
            sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var.eql( $kw11$WARN ) )
          {
            Errors.warn( $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P );
          }
          else
          {
            Errors.warn( $str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
            Errors.cerror( $str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P );
          }
        }
        final SubLObject _prev_bind_0_$2 = $sd_c1_genls_space$.currentBinding( thread );
        try
        {
          $sd_c1_genls_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$3 = $sd_c2_genls_space$.currentBinding( thread );
            try
            {
              $sd_c2_genls_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$4 = $sd_genls_isas_space$.currentBinding( thread );
                try
                {
                  $sd_genls_isas_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                  try
                  {
                    final SubLObject _prev_bind_0_$5 = $sd_candidate_store$.currentBinding( thread );
                    try
                    {
                      $sd_candidate_store$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                      try
                      {
                        sbhl_mark_sd_c1_genls_and_non_c2_genls_isas( c1, c2 );
                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                        final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                        SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
                        SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                          sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                          sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(),
                              sbhl_search_vars.get_sbhl_tv() ), thread );
                          sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ),
                              thread );
                          exceptionP = makeBoolean( NIL != sbhl_marking_utilities.sbhl_search_path_termination_p( c1, $sd_c2_genls_space$.getDynamicValue( thread ) ) || NIL != sbhl_marking_utilities
                              .sbhl_search_path_termination_p( c2, $sd_c1_genls_space$.getDynamicValue( thread ) ) );
                        }
                        finally
                        {
                          sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_7, thread );
                          sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_6, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$9, thread );
                          sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$3, thread );
                          sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$6, thread );
                        }
                        if( NIL == exceptionP )
                        {
                          if( NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue( thread ) )
                          {
                            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
                            _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                              sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(),
                                  sbhl_search_vars.get_sbhl_tv() ), thread );
                              sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ),
                                  thread );
                              if( NIL == exceptionP )
                              {
                                SubLObject catch_var = NIL;
                                try
                                {
                                  thread.throwStack.push( $kw14$DO_HASH_TABLE );
                                  final SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue( thread );
                                  SubLObject c2_genl = NIL;
                                  SubLObject val = NIL;
                                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
                                  try
                                  {
                                    while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                                    {
                                      final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                                      c2_genl = Hashtables.getEntryKey( cdohash_entry );
                                      val = Hashtables.getEntryValue( cdohash_entry );
                                      subl_macros.do_hash_table_done_check( exceptionP );
                                      final SubLObject exceptions = direct_sdc_exceptions( c2_genl, UNPROVIDED );
                                      if( NIL == exceptionP )
                                      {
                                        SubLObject csome_list_var = exceptions;
                                        SubLObject exception = NIL;
                                        exception = csome_list_var.first();
                                        while ( NIL == exceptionP && NIL != csome_list_var)
                                        {
                                          if( NIL != sbhl_marking_utilities.sbhl_search_path_termination_p( exception, $sd_c1_genls_space$.getDynamicValue( thread ) ) )
                                          {
                                            exceptionP = T;
                                          }
                                          csome_list_var = csome_list_var.rest();
                                          exception = csome_list_var.first();
                                        }
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    Hashtables.releaseEntrySetIterator( cdohash_iterator );
                                  }
                                }
                                catch( final Throwable ccatch_env_var )
                                {
                                  catch_var = Errors.handleThrowable( ccatch_env_var, $kw14$DO_HASH_TABLE );
                                }
                                finally
                                {
                                  thread.throwStack.pop();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_7, thread );
                              sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_6, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$10, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$4, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$7, thread );
                            }
                          }
                          if( NIL == exceptionP )
                          {
                            result = sbhl_gather_first_sd_or_store_sd_candidates( c2 );
                            if( NIL == result )
                            {
                              result = sbhl_determine_sd_path_with_no_exceptions( c1 );
                            }
                          }
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          sbhl_marking_vars.free_sbhl_marking_space( $sd_candidate_store$.getDynamicValue( thread ) );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                        }
                      }
                    }
                    finally
                    {
                      $sd_candidate_store$.rebind( _prev_bind_0_$5, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      sbhl_marking_vars.free_sbhl_marking_space( $sd_genls_isas_space$.getDynamicValue( thread ) );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                }
                finally
                {
                  $sd_genls_isas_space$.rebind( _prev_bind_0_$4, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( $sd_c2_genls_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                }
              }
            }
            finally
            {
              $sd_c2_genls_space$.rebind( _prev_bind_0_$3, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( $sd_c1_genls_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
            }
          }
        }
        finally
        {
          $sd_c1_genls_space$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$2, thread );
        sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7914L)
  public static SubLObject any_isa_common_sdct_among(SubLObject c1s, final SubLObject c2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject result2 = NIL;
    SubLObject exceptionP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject tv_var = tv;
      final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
      final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
      try
      {
        sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
        sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
        if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
        {
          final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
          if( pcase_var.eql( $kw6$ERROR ) )
          {
            sbhl_paranoia.sbhl_error( ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var.eql( $kw9$CERROR ) )
          {
            sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var.eql( $kw11$WARN ) )
          {
            Errors.warn( $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P );
          }
          else
          {
            Errors.warn( $str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
            Errors.cerror( $str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P );
          }
        }
        final SubLObject _prev_bind_0_$18 = $sd_c1_genls_space$.currentBinding( thread );
        try
        {
          $sd_c1_genls_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$19 = $sd_c2_genls_space$.currentBinding( thread );
            try
            {
              $sd_c2_genls_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$20 = $sd_genls_isas_space$.currentBinding( thread );
                try
                {
                  $sd_genls_isas_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                  try
                  {
                    final SubLObject _prev_bind_0_$21 = $sd_candidate_store$.currentBinding( thread );
                    try
                    {
                      $sd_candidate_store$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                      try
                      {
                        c1s = sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas( c1s, c2 );
                        if( NIL == c1s )
                        {
                          exceptionP = T;
                        }
                        if( NIL == exceptionP )
                        {
                          if( NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue( thread ) )
                          {
                            final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
                            final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                              sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(),
                                  sbhl_search_vars.get_sbhl_tv() ), thread );
                              sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ),
                                  thread );
                              if( NIL == exceptionP )
                              {
                                SubLObject catch_var = NIL;
                                try
                                {
                                  thread.throwStack.push( $kw14$DO_HASH_TABLE );
                                  final SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue( thread );
                                  SubLObject c2_genl = NIL;
                                  SubLObject val = NIL;
                                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
                                  try
                                  {
                                    while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                                    {
                                      final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                                      c2_genl = Hashtables.getEntryKey( cdohash_entry );
                                      val = Hashtables.getEntryValue( cdohash_entry );
                                      subl_macros.do_hash_table_done_check( exceptionP );
                                      final SubLObject exceptions = direct_sdc_exceptions( c2_genl, UNPROVIDED );
                                      if( NIL == exceptionP )
                                      {
                                        SubLObject csome_list_var = exceptions;
                                        SubLObject exception = NIL;
                                        exception = csome_list_var.first();
                                        while ( NIL == exceptionP && NIL != csome_list_var)
                                        {
                                          if( NIL != sbhl_marking_utilities.sbhl_search_path_termination_p( exception, $sd_c1_genls_space$.getDynamicValue( thread ) ) )
                                          {
                                            exceptionP = T;
                                          }
                                          csome_list_var = csome_list_var.rest();
                                          exception = csome_list_var.first();
                                        }
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    Hashtables.releaseEntrySetIterator( cdohash_iterator );
                                  }
                                }
                                catch( final Throwable ccatch_env_var )
                                {
                                  catch_var = Errors.handleThrowable( ccatch_env_var, $kw14$DO_HASH_TABLE );
                                }
                                finally
                                {
                                  thread.throwStack.pop();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_7, thread );
                              sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_6, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$25, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$19, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$22, thread );
                            }
                          }
                          if( NIL == exceptionP )
                          {
                            result = sbhl_gather_first_sd_or_store_sd_candidates( c2 );
                            if( NIL == result )
                            {
                              thread.resetMultipleValues();
                              final SubLObject result_$26 = sbhl_determine_sd_path_with_no_exceptions_among( c1s );
                              final SubLObject result2_$27 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              result = result_$26;
                              result2 = result2_$27;
                            }
                          }
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          sbhl_marking_vars.free_sbhl_marking_space( $sd_candidate_store$.getDynamicValue( thread ) );
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
                      $sd_candidate_store$.rebind( _prev_bind_0_$21, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      sbhl_marking_vars.free_sbhl_marking_space( $sd_genls_isas_space$.getDynamicValue( thread ) );
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
                  $sd_genls_isas_space$.rebind( _prev_bind_0_$20, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( $sd_c2_genls_space$.getDynamicValue( thread ) );
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
              $sd_c2_genls_space$.rebind( _prev_bind_0_$19, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( $sd_c1_genls_space$.getDynamicValue( thread ) );
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
          $sd_c1_genls_space$.rebind( _prev_bind_0_$18, thread );
        }
      }
      finally
      {
        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$18, thread );
        sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$17, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, result2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9809L)
  public static SubLObject sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(final SubLObject c1, final SubLObject c2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space( sbhl_module_vars.get_sbhl_module( $const13$genls ), c2, $sd_c2_genls_space$.getDynamicValue( thread ), UNPROVIDED );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space( sbhl_module_vars.get_sbhl_module( $const13$genls ), c1, $sym15$SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue( thread ),
            UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10436L)
  public static SubLObject sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(final SubLObject c1s, final SubLObject c2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space( sbhl_module_vars.get_sbhl_module( $const13$genls ), c2, $sd_c2_genls_space$.getDynamicValue( thread ), UNPROVIDED );
    SubLObject new_c1s = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
    final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
    final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const13$genls ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
      sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars
          .get_sbhl_tv() ), thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject cdolist_list_var = c1s;
        SubLObject c3 = NIL;
        c3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( c3, $sd_c2_genls_space$.getDynamicValue( thread ) ) && NIL == genls.genlP( c3, c2, UNPROVIDED, UNPROVIDED ) )
          {
            sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space( sbhl_module_vars.get_sbhl_module( $const13$genls ), c3, $sym15$SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue( thread ),
                UNPROVIDED );
            new_c1s = ConsesLow.cons( c3, new_c1s );
          }
          cdolist_list_var = cdolist_list_var.rest();
          c3 = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_8, thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_7, thread );
      sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_6, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return new_c1s;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11324L)
  public static SubLObject sbhl_mark_sd_genls_isas(final SubLObject c1_genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( c1_genl, $sd_c2_genls_space$.getDynamicValue( thread ) ) )
    {
      sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space( sbhl_module_vars.get_sbhl_module( $const16$isa ), c1_genl, $sd_genls_isas_space$.getDynamicValue( thread ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11649L)
  public static SubLObject sbhl_gather_first_sd_or_store_sd_candidates(final SubLObject c2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject relevant_exceptions = NIL;
    SubLObject cdolist_list_var = sdc_exceptions( c2, UNPROVIDED );
    SubLObject exception = NIL;
    exception = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sbhl_marking_utilities.sbhl_marked_node_p( exception, $sd_c1_genls_space$.getDynamicValue( thread ) ) )
      {
        relevant_exceptions = ConsesLow.cons( exception, relevant_exceptions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      exception = cdolist_list_var.first();
    }
    result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const13$genls ), c2, $sym17$SBHL_GATHER_SD_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != relevant_exceptions )
    {
      if( NIL != hash_table_utilities.hash_table_empty_p( $sd_candidate_store$.getDynamicValue( thread ) ) )
      {
        hash_table_utilities.push_hash( result, relevant_exceptions, $sd_candidate_store$.getDynamicValue( thread ) );
      }
      else
      {
        final SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue( thread );
        SubLObject c2_genl_isa = NIL;
        SubLObject exception_lists = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            c2_genl_isa = Hashtables.getEntryKey( cdohash_entry );
            exception_lists = Hashtables.getEntryValue( cdohash_entry );
            SubLObject new_exceptions = NIL;
            SubLObject cdolist_list_var2 = exception_lists;
            SubLObject exceptions = NIL;
            exceptions = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              new_exceptions = ConsesLow.cons( conses_high.nunion( exceptions, relevant_exceptions, UNPROVIDED, UNPROVIDED ), new_exceptions );
              cdolist_list_var2 = cdolist_list_var2.rest();
              exceptions = cdolist_list_var2.first();
            }
            Hashtables.sethash( c2_genl_isa, $sd_candidate_store$.getDynamicValue( thread ), new_exceptions );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      return NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13334L)
  public static SubLObject sbhl_gather_sd_candidates(final SubLObject c2_genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( c2_genl, $sd_c1_genls_space$.getDynamicValue( thread ) ) )
    {
      final SubLObject _prev_bind_0 = $sd_c2_genl$.currentBinding( thread );
      try
      {
        $sd_c2_genl$.bind( c2_genl, thread );
        result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const16$isa ), c2_genl, $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
      }
      finally
      {
        $sd_c2_genl$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13900L)
  public static SubLObject sbhl_determine_sd_and_store_candidates(final SubLObject c2_genl_isa)
  {
    if( NIL != sbhl_sd_relevant_c2_genl_isa_candidateP( c2_genl_isa ) )
    {
      return sbhl_determine_sd_and_store_relevant_candidates( c2_genl_isa );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14573L)
  public static SubLObject clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP()
  {
    final SubLObject cs = $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14573L)
  public static SubLObject remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue(), ConsesLow.list( c2_genl_isa ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14573L)
  public static SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal(final SubLObject c2_genl_isa)
  {
    return sbhl_sd_relevant_c2_genl_isa_candidateP( c2_genl_isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14573L)
  public static SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa)
  {
    SubLObject caching_state = $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_, $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_, NIL, EQL,
          ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, c2_genl_isa, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal( c2_genl_isa ) ) );
      memoization_state.caching_state_put( caching_state, c2_genl_isa, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14747L)
  public static SubLObject sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != sbhl_marking_utilities.sbhl_search_path_termination_p( c2_genl_isa, $sd_genls_isas_space$.getDynamicValue( thread ) ) && NIL != relevant_sibling_disjoint_collection_p( c2_genl_isa ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14960L)
  public static SubLObject sbhl_determine_sd_and_store_relevant_candidates(final SubLObject c2_genl_isa)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject exceptions = sdc_exceptions( $sd_c2_genl$.getDynamicValue( thread ), UNPROVIDED );
    SubLObject relevant_exceptions = NIL;
    SubLObject cdolist_list_var = exceptions;
    SubLObject exception = NIL;
    exception = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sbhl_marking_utilities.sbhl_search_path_termination_p( exception, $sd_c1_genls_space$.getDynamicValue( thread ) ) )
      {
        relevant_exceptions = ConsesLow.cons( exception, relevant_exceptions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      exception = cdolist_list_var.first();
    }
    if( NIL != relevant_exceptions )
    {
      hash_table_utilities.push_hash( c2_genl_isa, relevant_exceptions, $sd_candidate_store$.getDynamicValue( thread ) );
      return NIL;
    }
    return c2_genl_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15486L)
  public static SubLObject sbhl_determine_sd_path_with_no_exceptions(final SubLObject c1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw14$DO_HASH_TABLE );
        final SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue( thread );
        SubLObject c1_genl_isa = NIL;
        SubLObject relevant_exceptions = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            c1_genl_isa = Hashtables.getEntryKey( cdohash_entry );
            relevant_exceptions = Hashtables.getEntryValue( cdohash_entry );
            subl_macros.do_hash_table_done_check( result );
            if( NIL == result )
            {
              SubLObject csome_list_var = relevant_exceptions;
              SubLObject c2_genl_exceptions = NIL;
              c2_genl_exceptions = csome_list_var.first();
              while ( NIL == result && NIL != csome_list_var)
              {
                if( NIL != any_sd_isa_path_excluding_exceptions_p( c1, c1_genl_isa, c2_genl_exceptions ) )
                {
                  result = c1_genl_isa;
                }
                csome_list_var = csome_list_var.rest();
                c2_genl_exceptions = csome_list_var.first();
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw14$DO_HASH_TABLE );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16081L)
  public static SubLObject sbhl_determine_sd_path_with_no_exceptions_among(final SubLObject c1s)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject result2 = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var = c1s;
      SubLObject c1 = NIL;
      c1 = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        if( NIL == result )
        {
          SubLObject catch_var = NIL;
          try
          {
            thread.throwStack.push( $kw14$DO_HASH_TABLE );
            final SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue( thread );
            SubLObject c1_genl_isa = NIL;
            SubLObject relevant_exceptions = NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
            try
            {
              while ( Hashtables.iteratorHasNext( cdohash_iterator ))
              {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                c1_genl_isa = Hashtables.getEntryKey( cdohash_entry );
                relevant_exceptions = Hashtables.getEntryValue( cdohash_entry );
                subl_macros.do_hash_table_done_check( result );
                SubLObject cdolist_list_var = relevant_exceptions;
                SubLObject c2_genl_exceptions = NIL;
                c2_genl_exceptions = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL != any_sd_isa_path_excluding_exceptions_p( c1, c1_genl_isa, c2_genl_exceptions ) )
                  {
                    result = c1_genl_isa;
                    result2 = ConsesLow.cons( c1, result2 );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  c2_genl_exceptions = cdolist_list_var.first();
                }
              }
            }
            finally
            {
              Hashtables.releaseEntrySetIterator( cdohash_iterator );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            catch_var = Errors.handleThrowable( ccatch_env_var, $kw14$DO_HASH_TABLE );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        csome_list_var = csome_list_var.rest();
        c1 = csome_list_var.first();
      }
    }
    return Values.values( result, result2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16712L)
  public static SubLObject any_sd_isa_path_excluding_exceptions_p(final SubLObject node, final SubLObject isa_node, final SubLObject exceptions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $sd_c1_genls_space$.currentBinding( thread );
    try
    {
      $sd_c1_genls_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject _prev_bind_0_$34 = $sd_c1_genls_space$.currentBinding( thread );
        try
        {
          $sd_c1_genls_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$35 = $sd_genls_isas_space$.currentBinding( thread );
            try
            {
              $sd_genls_isas_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$36 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const13$genls ), thread );
                  sbhl_marking_utilities.sbhl_mark_all_nodes_marked( exceptions, $sd_c1_genls_space$.getDynamicValue( thread ) );
                  result = sbhl_sd_genls_and_genls_isa_path_p( node, isa_node );
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$36, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( $sd_genls_isas_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
                }
              }
            }
            finally
            {
              $sd_genls_isas_space$.rebind( _prev_bind_0_$35, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( $sd_c1_genls_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
            }
          }
        }
        finally
        {
          $sd_c1_genls_space$.rebind( _prev_bind_0_$34, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( $sd_c1_genls_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
        }
      }
    }
    finally
    {
      $sd_c1_genls_space$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17157L)
  public static SubLObject sbhl_sd_genls_and_genls_isa_path_p(final SubLObject node, final SubLObject goal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $sbhl_sd_genls_isas_goal$.currentBinding( thread );
    try
    {
      $sbhl_sd_genls_isas_goal$.bind( goal, thread );
      result = sbhl_search_methods.sbhl_gather_first_among_forward_true_nodes_in_space( sbhl_module_vars.get_sbhl_module( $const13$genls ), node, $sym21$SBHL_SD_GOAL_IN_GENLS_ISAS_P, $sd_c1_genls_space$.getDynamicValue(
          thread ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $sbhl_sd_genls_isas_goal$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17459L)
  public static SubLObject sbhl_sd_goal_in_genls_isas_p(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    result = sbhl_search_methods.sbhl_predicate_relation_in_space_p( sbhl_module_vars.get_sbhl_module( $const16$isa ), node, $sbhl_sd_genls_isas_goal$.getDynamicValue( thread ), $sd_genls_isas_space$.getDynamicValue(
        thread ), UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17908L)
  public static SubLObject sdc(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return max_sdc( col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18255L)
  public static SubLObject max_sdc(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = max_sdc_int( col );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18490L)
  public static SubLObject all_sdc(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = all_sdc_int( col );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18737L)
  public static SubLObject max_sdc_int(final SubLObject col)
  {
    return genls.max_cols( all_sdc_int( col ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18873L)
  public static SubLObject all_sdc_int(final SubLObject col)
  {
    final SubLObject sdct = applicable_sdct( col, UNPROVIDED );
    SubLObject candidates = isa.union_all_instances( sdct, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    candidates = ( cdolist_list_var = genls.union_all_specs( candidates, UNPROVIDED, UNPROVIDED ) );
    SubLObject candidate = NIL;
    candidate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != any_isa_common_sdct( col, candidate, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( candidate, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19270L)
  public static SubLObject remote_sdc_wrt(final SubLObject col, final SubLObject sdct, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = genls.all_genls( col, mt, UNPROVIDED );
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isaP( genl, sdct, mt, UNPROVIDED ) )
      {
        result = ConsesLow.cons( genl, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19457L)
  public static SubLObject isa_sdct(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return max_isa_sdct( col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19647L)
  public static SubLObject max_isa_sdct(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.max_cols( applicable_sdct( col, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19818L)
  public static SubLObject applicable_sdct(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sdcts = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_result$.bind( NIL, thread );
      try
      {
        final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$sbhl_target_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_target_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            genls.map_all_genls( $sym22$GATHER_SDCT_ISAS, col, mt, UNPROVIDED );
          }
          finally
          {
            final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_target_space$.rebind( _prev_bind_0_$40, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sdcts = sbhl_search_vars.$sbhl_result$.getDynamicValue( thread );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
        }
      }
    }
    finally
    {
      sbhl_search_vars.$sbhl_result$.rebind( _prev_bind_0, thread );
    }
    return sdcts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20116L)
  public static SubLObject gather_sdct_isas(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ), thread );
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
      isa.map_all_isa( $sym23$GATHER_IF_SDCT_, col, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20267L)
  public static SubLObject gather_if_sdctP(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != relevant_sibling_disjoint_collection_p( collection ) )
    {
      sbhl_search_vars.$sbhl_result$.setDynamicValue( ConsesLow.cons( collection, sbhl_search_vars.$sbhl_result$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20425L)
  public static SubLObject all_isa_sdct(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return cached_all_isa_sdct( col, mt_relevance_macros.mt_info( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20595L)
  public static SubLObject clear_cached_all_isa_sdct()
  {
    final SubLObject cs = $cached_all_isa_sdct_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20595L)
  public static SubLObject remove_cached_all_isa_sdct(final SubLObject col, final SubLObject mt_info)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_all_isa_sdct_caching_state$.getGlobalValue(), ConsesLow.list( col, mt_info ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20595L)
  public static SubLObject cached_all_isa_sdct_internal(final SubLObject col, final SubLObject mt_info)
  {
    final SubLObject mt = ( NIL != fort_types_interface.mtP( mt_info ) ) ? mt_info : NIL;
    return isa.all_isa_if( $sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P, col, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20595L)
  public static SubLObject cached_all_isa_sdct(final SubLObject col, final SubLObject mt_info)
  {
    SubLObject caching_state = $cached_all_isa_sdct_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym24$CACHED_ALL_ISA_SDCT, $sym26$_CACHED_ALL_ISA_SDCT_CACHING_STATE_, NIL, EQL, TWO_INTEGER, $int27$512 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( col, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( col.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_all_isa_sdct_internal( col, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( col, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20797L)
  public static SubLObject union_all_isa_sdct(final SubLObject cols, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject isa_sdct = NIL;
    SubLObject cdolist_list_var = isa.union_all_isa( cols, mt, UNPROVIDED );
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != relevant_sibling_disjoint_collection_p( v_isa ) )
      {
        isa_sdct = ConsesLow.cons( v_isa, isa_sdct );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return isa_sdct;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21154L)
  public static SubLObject sdc_elementP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sdct_elementP( col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21435L)
  public static SubLObject sdct_elementP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( col, UNPROVIDED ) )
    {
      return sdct_elementP( narts_high.find_nart( col ), mt );
    }
    if( NIL != fort_types_interface.collectionP( col ) )
    {
      return isa.any_wrt_all_isa( $sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P, col, mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21738L)
  public static SubLObject safe_sdct_elementP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sdctP = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        sdctP = sdct_elementP( col, mt );
      }
      finally
      {
        final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return sdctP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21896L)
  public static SubLObject applicable_sdctP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( col, UNPROVIDED ) )
    {
      return sdct_elementP( narts_high.find_nart( col ), mt );
    }
    if( NIL != fort_types_interface.collectionP( col ) )
    {
      return genls.any_all_genls( Symbols.symbol_function( $sym28$SAFE_SDCT_ELEMENT_ ), col, mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22180L)
  public static SubLObject sdcP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( c1, UNPROVIDED ) )
    {
      return sdcP( narts_high.find_nart( c1 ), c2, mt );
    }
    if( NIL != term.ground_nautP( c2, UNPROVIDED ) )
    {
      return sdcP( c1, narts_high.find_nart( c2 ), mt );
    }
    if( NIL == fort_types_interface.collectionP( c1 ) )
    {
      return NIL;
    }
    if( NIL == fort_types_interface.collectionP( c2 ) )
    {
      return NIL;
    }
    SubLObject sdcP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      sdcP = sdc_intP( c1, c2 );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sdcP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22727L)
  public static SubLObject sdc_intP(final SubLObject c1, final SubLObject c2)
  {
    if( NIL != ignoring_sdcP() )
    {
      return NIL;
    }
    if( NIL == isa_common_sdctP( c1, c2, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != establishing_supersetP( c1, c2, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != establishing_supersetP( c2, c1, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != establishing_instance_ofP( c1, c2, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23140L)
  public static SubLObject any_sdc_wrtP(final SubLObject c1s, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != c1s && NIL != fort_types_interface.collectionP( c2 ) && NIL == ignoring_sdcP() )
    {
      thread.resetMultipleValues();
      final SubLObject sdcP = any_isa_common_sdct_among( c1s, c2, mt, UNPROVIDED );
      final SubLObject rel_c1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = c1s;
      SubLObject c3 = NIL;
      c3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == establishing_supersetP( c3, c2, mt, UNPROVIDED ) )
        {
          if( NIL == establishing_supersetP( c2, c3, mt, UNPROVIDED ) )
          {
            if( NIL != establishing_instance_ofP( c3, c2, mt, UNPROVIDED ) )
            {
              return NIL;
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        c3 = cdolist_list_var.first();
      }
      return list_utilities.sublisp_boolean( sdcP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23881L)
  public static SubLObject any_sdc_wrt(final SubLObject c1s, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != c1s && NIL != fort_types_interface.collectionP( c2 ) && NIL == ignoring_sdcP() )
    {
      SubLObject sdcP = NIL;
      if( NIL == sdcP )
      {
        SubLObject csome_list_var = c1s;
        SubLObject c3 = NIL;
        c3 = csome_list_var.first();
        while ( NIL == sdcP && NIL != csome_list_var)
        {
          if( NIL != isa_common_sdctP( c3, c2, mt ) )
          {
            if( NIL == establishing_supersetP( c3, c2, mt, UNPROVIDED ) )
            {
              if( NIL == establishing_supersetP( c2, c3, mt, UNPROVIDED ) )
              {
                if( NIL != establishing_instance_ofP( c3, c2, mt, UNPROVIDED ) )
                {
                  return NIL;
                }
                sdcP = T;
              }
            }
          }
          csome_list_var = csome_list_var.rest();
          c3 = csome_list_var.first();
        }
      }
      return sdcP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24621L)
  public static SubLObject any_sdc_anyP(final SubLObject c1s, final SubLObject c2s, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject c1_sdcts = cols_with_applicable_sdct( c1s, mt );
    if( NIL != c1_sdcts )
    {
      SubLObject sdcP = NIL;
      SubLObject rel_c1s = NIL;
      SubLObject rel_c2 = NIL;
      if( NIL == sdcP )
      {
        SubLObject csome_list_var = cols_with_applicable_sdct( c2s, mt );
        SubLObject sdct2 = NIL;
        sdct2 = csome_list_var.first();
        while ( NIL == sdcP && NIL != csome_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject sdcP_$44 = any_sdc_wrtP( c1_sdcts, sdct2, mt );
          final SubLObject rel_c1s_$45 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          sdcP = sdcP_$44;
          rel_c1s = rel_c1s_$45;
          if( NIL != sdcP )
          {
            rel_c2 = sdct2;
          }
          csome_list_var = csome_list_var.rest();
          sdct2 = csome_list_var.first();
        }
      }
      return list_utilities.sublisp_boolean( sdcP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25224L)
  public static SubLObject any_sdc_any(final SubLObject c1s, final SubLObject c2s, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject sdc_pair = NIL;
    if( NIL == sdc_pair )
    {
      SubLObject csome_list_var = cols_with_applicable_sdct( c1s, mt );
      SubLObject sdct1 = NIL;
      sdct1 = csome_list_var.first();
      while ( NIL == sdc_pair && NIL != csome_list_var)
      {
        if( NIL == sdc_pair )
        {
          SubLObject csome_list_var_$46 = cols_with_applicable_sdct( c2s, mt );
          SubLObject sdct2 = NIL;
          sdct2 = csome_list_var_$46.first();
          while ( NIL == sdc_pair && NIL != csome_list_var_$46)
          {
            if( NIL != sdcP( sdct1, sdct2, mt ) )
            {
              sdc_pair = ConsesLow.list( sdct1, sdct2 );
            }
            csome_list_var_$46 = csome_list_var_$46.rest();
            sdct2 = csome_list_var_$46.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        sdct1 = csome_list_var.first();
      }
    }
    return sdc_pair;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25751L)
  public static SubLObject sdc_exceptions(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != control_vars.within_assertP() )
    {
      return NIL;
    }
    return sdc_exceptions_int( collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26133L)
  public static SubLObject sdc_exceptions_int(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.remove_duplicate_forts( ConsesLow.nconc( direct_sdc_exceptions( collection, mt ), ( NIL != $sdc_common_spec_exceptionP$.getDynamicValue( thread ) ) ? collections_sharing_specs( collection, mt )
        : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26369L)
  public static SubLObject clear_cached_sdc_exceptions()
  {
    final SubLObject cs = $cached_sdc_exceptions_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26369L)
  public static SubLObject remove_cached_sdc_exceptions(final SubLObject collection)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_sdc_exceptions_caching_state$.getGlobalValue(), ConsesLow.list( collection ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26369L)
  public static SubLObject cached_sdc_exceptions_internal(final SubLObject collection)
  {
    return sdc_exceptions_int( collection, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26369L)
  public static SubLObject cached_sdc_exceptions(final SubLObject collection)
  {
    SubLObject caching_state = $cached_sdc_exceptions_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$CACHED_SDC_EXCEPTIONS, $sym30$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_sdc_exceptions_internal( collection ) ) );
      memoization_state.caching_state_put( caching_state, collection, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26911L)
  public static SubLObject declared_sdc_exceptions(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sdc_exceptions_of_genls( collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27130L)
  public static SubLObject sdc_exceptions_of_genls(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_search_methods.sbhl_gather_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const13$genls ), collection, $sym31$GATHER_DIRECT_SDC_EXCEPTIONS, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27370L)
  public static SubLObject gather_direct_sdc_exceptions(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sbhl_search_vars.$sbhl_result$.setDynamicValue( ConsesLow.nconc( sbhl_search_vars.$sbhl_result$.getDynamicValue( thread ), direct_sdc_exceptions( collection, UNPROVIDED ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27572L)
  public static SubLObject direct_sdc_exceptions(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return conses_high.nunion( conses_high.nunion( kb_mapping_utilities.pred_values_in_relevant_mts( collection, $const32$siblingDisjointExceptions, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED ), kb_mapping_utilities
        .pred_values_in_relevant_mts( collection, $const32$siblingDisjointExceptions, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), conses_high.nunion( kb_mapping_utilities
            .pred_values_in_relevant_mts( collection, $const33$rewriteOf, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED ), kb_mapping_utilities.pred_values_in_relevant_mts( collection, $const33$rewriteOf, mt, TWO_INTEGER,
                ONE_INTEGER, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28041L)
  public static SubLObject direct_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const32$siblingDisjointExceptions, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities
        .pred_u_v_holds_in_relevant_mts( $const32$siblingDisjointExceptions, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const33$rewriteOf, c1, c2, mt,
            UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const33$rewriteOf, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28466L)
  public static SubLObject collections_sharing_specs(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.union_all_genls( genls.collection_leaves( collection, mt, UNPROVIDED ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28814L)
  public static SubLObject sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != declared_sdc_exceptionP( c1, c2, mt ) || NIL != sdc_common_specP( c1, c2, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28986L)
  public static SubLObject declared_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue( thread ) )
    {
      return remote_sdc_exceptionP( c1, c2, mt );
    }
    return direct_sdc_exceptionP( c1, c2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29187L)
  public static SubLObject remote_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return Types.booleanp( any_remote_sdc_exception_pair( c1, c2, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29377L)
  public static SubLObject any_remote_sdc_exception_pair(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
      sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space_1$.currentBinding( thread );
        final SubLObject _prev_bind_1_$48 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space_1$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p, thread );
          sbhl_marking_methods.sbhl_mark_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const13$genls ), c1, mt, UNPROVIDED );
          final SubLObject resourcing_p_$49 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
          final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          final SubLObject _prev_bind_1_$49 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
            sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space_2$.currentBinding( thread );
              final SubLObject _prev_bind_1_$50 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_space_2$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p_$49, thread );
                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const13$genls ), c2, mt, UNPROVIDED );
                final SubLObject map_table = Hashtables.hash_table_count( sbhl_marking_vars.$sbhl_space_1$.getDynamicValue( thread ) ).numG( Hashtables.hash_table_count( sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(
                    thread ) ) ) ? sbhl_marking_vars.$sbhl_space_2$.getDynamicValue( thread ) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue( thread );
                final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_goal_table$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_goal_table$.bind( map_table.eql( sbhl_marking_vars.$sbhl_space_1$.getDynamicValue( thread ) ) ? sbhl_marking_vars.$sbhl_space_2$.getDynamicValue( thread )
                      : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue( thread ), thread );
                  if( NIL == result )
                  {
                    SubLObject catch_var = NIL;
                    try
                    {
                      thread.throwStack.push( $kw14$DO_HASH_TABLE );
                      SubLObject col = NIL;
                      SubLObject mark = NIL;
                      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( map_table );
                      try
                      {
                        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                        {
                          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                          col = Hashtables.getEntryKey( cdohash_entry );
                          mark = Hashtables.getEntryValue( cdohash_entry );
                          subl_macros.do_hash_table_done_check( result );
                          result = gather_any_genls_sdc_exception( col );
                        }
                      }
                      finally
                      {
                        Hashtables.releaseEntrySetIterator( cdohash_iterator );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      catch_var = Errors.handleThrowable( ccatch_env_var, $kw14$DO_HASH_TABLE );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_goal_table$.rebind( _prev_bind_0_$50, thread );
                }
              }
              finally
              {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$50, thread );
                sbhl_marking_vars.$sbhl_space_2$.rebind( _prev_bind_0_$49, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$49, thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$48, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$48, thread );
          sbhl_marking_vars.$sbhl_space_1$.rebind( _prev_bind_0_$47, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30195L)
  public static SubLObject gather_any_genls_sdc_exception(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject _prev_bind_0_$57 = control_vars.$mapping_gather_arg$.currentBinding( thread );
      try
      {
        control_vars.$mapping_gather_arg$.bind( TWO_INTEGER, thread );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym34$GATHER_DIRECT_SDC_EXCEPTION ), col, ONE_INTEGER, $const32$siblingDisjointExceptions, UNPROVIDED, UNPROVIDED );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym34$GATHER_DIRECT_SDC_EXCEPTION ), col, ONE_INTEGER, $const33$rewriteOf, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        control_vars.$mapping_gather_arg$.rebind( _prev_bind_0_$57, thread );
      }
      if( NIL == control_vars.$mapping_answer$.getDynamicValue( thread ) )
      {
        final SubLObject _prev_bind_0_$58 = control_vars.$mapping_gather_arg$.currentBinding( thread );
        try
        {
          control_vars.$mapping_gather_arg$.bind( ONE_INTEGER, thread );
          kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym34$GATHER_DIRECT_SDC_EXCEPTION ), col, TWO_INTEGER, $const32$siblingDisjointExceptions, UNPROVIDED, UNPROVIDED );
          kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym34$GATHER_DIRECT_SDC_EXCEPTION ), col, TWO_INTEGER, $const33$rewriteOf, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          control_vars.$mapping_gather_arg$.rebind( _prev_bind_0_$58, thread );
        }
      }
      if( NIL != control_vars.$mapping_answer$.getDynamicValue( thread ) )
      {
        result = ConsesLow.list( col, control_vars.$mapping_answer$.getDynamicValue( thread ) );
      }
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30810L)
  public static SubLObject gather_direct_sdc_exception(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = assertions_high.gaf_arg( assertion, control_vars.$mapping_gather_arg$.getDynamicValue( thread ) );
    if( NIL != sbhl_marking_methods.sbhl_recorded_node_p( col, sbhl_marking_vars.$sbhl_goal_table$.getDynamicValue( thread ) ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( col, thread );
      utilities_macros.mapping_finished();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31055L)
  public static SubLObject sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $sdc_common_spec_exceptionP$.getDynamicValue( thread ) )
    {
      return remote_sdc_common_specP( c1, c2, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31195L)
  public static SubLObject remote_sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return genls.floor_of_col_pairP( c1, c2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31366L)
  public static SubLObject sdct_elements(final SubLObject cols, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cols;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sdct_elementP( col, mt ) )
      {
        result = ConsesLow.cons( col, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31580L)
  public static SubLObject cols_with_applicable_sdct(final SubLObject cols, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cols;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != applicable_sdctP( col, mt ) )
      {
        result = ConsesLow.cons( col, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31775L)
  public static SubLObject establishing_supersetP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject assertion)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( assertion == UNPROVIDED )
    {
      assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
    }
    if( NIL != control_vars.within_assertP() )
    {
      return NIL;
    }
    if( NIL != assertion )
    {
      final SubLObject axiom = assertions_high.assertion_formula( assertion );
      final SubLObject truth = assertions_high.assertion_truth( assertion );
      final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
      final SubLObject a1 = conses_high.second( axiom );
      final SubLObject a2 = conses_high.third( axiom );
      return makeBoolean( NIL != el_utilities.genls_litP( axiom ) && truth == $kw35$TRUE && NIL != mt_relevance_macros.relevant_mtP( assertion_mt ) && NIL != genls.genlP( c1, a1, mt, UNPROVIDED ) && NIL != genls.genlP(
          a2, c2, mt, UNPROVIDED ) );
    }
    if( NIL != wff_macros.within_wffP() && NIL != control_vars.within_assertP() )
    {
      final SubLObject formula = wff_vars.wff_formula();
      return makeBoolean( NIL != el_utilities.genls_litP( formula ) && NIL == el_utilities.el_negation_p( formula ) && NIL != forts.fort_p( el_utilities.literal_arg1( formula, UNPROVIDED ) ) && NIL != forts.fort_p(
          el_utilities.literal_arg2( formula, UNPROVIDED ) ) && NIL != genls.genlP( c1, el_utilities.literal_arg1( formula, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && NIL != genls.genlP( el_utilities.literal_arg2(
              formula, UNPROVIDED ), c2, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32761L)
  public static SubLObject establishing_instance_ofP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject assertion)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( assertion == UNPROVIDED )
    {
      assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
    }
    if( NIL != control_vars.within_assertP() )
    {
      return NIL;
    }
    if( NIL != assertion )
    {
      final SubLObject axiom = assertions_high.assertion_formula( assertion );
      final SubLObject truth = assertions_high.assertion_truth( assertion );
      final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
      final SubLObject a1 = conses_high.second( axiom );
      final SubLObject a2 = conses_high.third( axiom );
      return makeBoolean( NIL != el_utilities.isa_litP( axiom ) && truth == $kw35$TRUE && NIL != mt_relevance_macros.relevant_mtP( assertion_mt ) && NIL != genls.genlP( a2, c1, mt, UNPROVIDED ) && NIL != genls.genlP( a2,
          c2, mt, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33391L)
  public static SubLObject why_sdcP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    if( behavior == $kw36$ASSERTION )
    {
      return assemble_sdc_just( why_sdcP( c1, c2, mt, UNPROVIDED ) );
    }
    return any_just_of_sdc( c1, c2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33701L)
  public static SubLObject assemble_sdc_just(final SubLObject justs)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = justs;
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != arguments.hl_support_p( just ) )
      {
        result = ConsesLow.cons( just, result );
      }
      else
      {
        final SubLObject gaf = just.first();
        SubLObject ass = NIL;
        if( NIL != gaf )
        {
          ass = kb_indexing.find_gaf_possibly_in_mt( gaf, UNPROVIDED );
        }
        if( NIL != ass )
        {
          result = ConsesLow.cons( ass, result );
        }
        else
        {
          result = ConsesLow.cons( arguments.make_hl_support( $kw37$OPAQUE, just.first(), UNPROVIDED, UNPROVIDED ), result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34079L)
  public static SubLObject any_just_of_sdc(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == forts.fort_p( c1 ) )
    {
      final SubLObject c1_nart = narts_high.find_nart( c1 );
      if( NIL != c1_nart )
      {
        return any_just_of_sdc( c1_nart, c2, mt );
      }
      return NIL;
    }
    else if( NIL == forts.fort_p( c2 ) )
    {
      final SubLObject c2_nart = narts_high.find_nart( c2 );
      if( NIL != c2_nart )
      {
        return any_just_of_sdc( c1, c2_nart, mt );
      }
      return NIL;
    }
    else
    {
      final SubLObject sdct = any_isa_common_sdct( c1, c2, mt, UNPROVIDED );
      if( NIL == sdct )
      {
        return NIL;
      }
      if( NIL != genls.genlP( c1, c2, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != genls.genlP( c2, c1, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != establishing_supersetP( c1, c2, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != establishing_supersetP( c2, c1, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != establishing_instance_ofP( c1, c2, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      return ConsesLow.nconc( any_just_of_isa_sdct( c1, sdct, mt ), any_just_of_isa_sdct( c2, sdct, mt ), isa.any_just_of_isa( sdct, $const38$SiblingDisjointCollectionType, mt ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35013L)
  public static SubLObject any_just_of_isa_sdct(final SubLObject col, final SubLObject sdct, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject genl = genls.any_genl_isa( col, sdct, mt, UNPROVIDED );
    if( genl.eql( col ) )
    {
      return isa.any_just_of_isa( col, sdct, mt );
    }
    return ConsesLow.nconc( genls.why_genlP( col, genl, mt, UNPROVIDED, UNPROVIDED ), isa.any_just_of_isa( genl, sdct, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35263L)
  public static SubLObject why_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject why = why_declared_sdc_exceptionP( c1, c2, mt );
    if( NIL == why )
    {
      why = why_sdc_common_specP( c1, c2, mt );
    }
    return why;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35459L)
  public static SubLObject why_declared_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue( thread ) )
    {
      return why_remote_sdc_exceptionP( c1, c2, mt );
    }
    return why_direct_sdc_exceptionP( c1, c2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35672L)
  public static SubLObject why_direct_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const32$siblingDisjointExceptions, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( ConsesLow.list( el_utilities.make_binary_formula( $const32$siblingDisjointExceptions, c1, c2 ), $kw35$TRUE ) );
    }
    if( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const32$siblingDisjointExceptions, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( ConsesLow.list( el_utilities.make_binary_formula( $const32$siblingDisjointExceptions, c2, c1 ), $kw35$TRUE ) );
    }
    if( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const33$rewriteOf, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( ConsesLow.list( el_utilities.make_binary_formula( $const33$rewriteOf, c1, c2 ), $kw35$TRUE ) );
    }
    if( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const33$rewriteOf, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( ConsesLow.list( el_utilities.make_binary_formula( $const33$rewriteOf, c2, c1 ), $kw35$TRUE ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36320L)
  public static SubLObject why_remote_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject source = genls.shallowest_col( c1, c2 );
    final SubLObject target = source.eql( c1 ) ? c2 : c1;
    final SubLObject remote_pair = any_remote_sdc_exception_pair( source, target, mt );
    if( NIL != remote_pair )
    {
      SubLObject current;
      final SubLObject datum = current = remote_pair;
      SubLObject spec1 = NIL;
      SubLObject spec2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      spec1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      spec2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.nconc( spec1.eql( source ) ? NIL : genls.why_genlP( source, spec1, mt, UNPROVIDED, UNPROVIDED ), spec2.eql( target ) ? NIL : genls.why_genlP( target, spec2, mt, UNPROVIDED, UNPROVIDED ),
            why_direct_sdc_exceptionP( spec1, spec2, mt ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36803L)
  public static SubLObject why_sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $sdc_common_spec_exceptionP$.getDynamicValue( thread ) )
    {
      return why_remote_common_specP( c1, c2, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36947L)
  public static SubLObject why_remote_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject pcase_var;
    final SubLObject spec = pcase_var = genls.any_floor_of_col_pair( c1, c2, mt, UNPROVIDED );
    if( pcase_var.eql( $sym40$C1 ) )
    {
      return genls.why_genlP( spec, c2, mt, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $sym41$C2 ) )
    {
      return genls.why_genlP( spec, c1, mt, UNPROVIDED, UNPROVIDED );
    }
    return ConsesLow.nconc( genls.why_genlP( spec, c1, mt, UNPROVIDED, UNPROVIDED ), genls.why_genlP( spec, c2, mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37332L)
  public static SubLObject isa_common_sdctP(final SubLObject c1, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( any_isa_common_sdct( c1, c2, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37503L)
  public static SubLObject isa_common_sdct_amongP(final SubLObject c1s, final SubLObject c2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( any_isa_common_sdct_among( c1s, c2, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37832L)
  public static SubLObject sdw_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $sdw_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      Errors.cerror( $str10$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5
      } );
    }
    else if( Numbers.add( TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue( thread ) ).numGE( level ) )
    {
      Errors.warn( format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5
      } );
    }
    return NIL;
  }

  public static SubLObject declare_sdc_file()
  {
    SubLFiles.declareFunction( me, "ignoring_sdcP", "IGNORING-SDC?", 0, 0, false );
    SubLFiles.declareFunction( me, "relevant_sibling_disjoint_collection_p", "RELEVANT-SIBLING-DISJOINT-COLLECTION-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sbhl_sd_marking_spaces", "WITH-SBHL-SD-MARKING-SPACES" );
    SubLFiles.declareMacro( me, "with_sbhl_sd_genls_isas_spaces", "WITH-SBHL-SD-GENLS-ISAS-SPACES" );
    SubLFiles.declareFunction( me, "any_isa_common_sdct", "ANY-ISA-COMMON-SDCT", 2, 2, false );
    SubLFiles.declareFunction( me, "any_isa_common_sdct_among", "ANY-ISA-COMMON-SDCT-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "sbhl_mark_sd_c1_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1S-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mark_sd_genls_isas", "SBHL-MARK-SD-GENLS-ISAS", 1, 0, false );
    new $sbhl_mark_sd_genls_isas$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_gather_first_sd_or_store_sd_candidates", "SBHL-GATHER-FIRST-SD-OR-STORE-SD-CANDIDATES", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_gather_sd_candidates", "SBHL-GATHER-SD-CANDIDATES", 1, 0, false );
    new $sbhl_gather_sd_candidates$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_determine_sd_and_store_candidates", "SBHL-DETERMINE-SD-AND-STORE-CANDIDATES", 1, 0, false );
    new $sbhl_determine_sd_and_store_candidates$UnaryFunction();
    SubLFiles.declareFunction( me, "clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CLEAR-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "REMOVE-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_sd_relevant_c2_genl_isa_candidateP", "SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_determine_sd_and_store_relevant_candidates", "SBHL-DETERMINE-SD-AND-STORE-RELEVANT-CANDIDATES", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_determine_sd_path_with_no_exceptions", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_determine_sd_path_with_no_exceptions_among", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS-AMONG", 1, 0, false );
    SubLFiles.declareFunction( me, "any_sd_isa_path_excluding_exceptions_p", "ANY-SD-ISA-PATH-EXCLUDING-EXCEPTIONS-P", 3, 0, false );
    SubLFiles.declareFunction( me, "sbhl_sd_genls_and_genls_isa_path_p", "SBHL-SD-GENLS-AND-GENLS-ISA-PATH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_sd_goal_in_genls_isas_p", "SBHL-SD-GOAL-IN-GENLS-ISAS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sdc", "SDC", 1, 1, false );
    SubLFiles.declareFunction( me, "max_sdc", "MAX-SDC", 1, 1, false );
    SubLFiles.declareFunction( me, "all_sdc", "ALL-SDC", 1, 1, false );
    SubLFiles.declareFunction( me, "max_sdc_int", "MAX-SDC-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "all_sdc_int", "ALL-SDC-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_sdc_wrt", "REMOTE-SDC-WRT", 2, 1, false );
    SubLFiles.declareFunction( me, "isa_sdct", "ISA-SDCT", 1, 1, false );
    SubLFiles.declareFunction( me, "max_isa_sdct", "MAX-ISA-SDCT", 1, 1, false );
    SubLFiles.declareFunction( me, "applicable_sdct", "APPLICABLE-SDCT", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_sdct_isas", "GATHER-SDCT-ISAS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_if_sdctP", "GATHER-IF-SDCT?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_isa_sdct", "ALL-ISA-SDCT", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_all_isa_sdct", "CLEAR-CACHED-ALL-ISA-SDCT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_all_isa_sdct", "REMOVE-CACHED-ALL-ISA-SDCT", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_all_isa_sdct_internal", "CACHED-ALL-ISA-SDCT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_all_isa_sdct", "CACHED-ALL-ISA-SDCT", 2, 0, false );
    SubLFiles.declareFunction( me, "union_all_isa_sdct", "UNION-ALL-ISA-SDCT", 1, 1, false );
    SubLFiles.declareFunction( me, "sdc_elementP", "SDC-ELEMENT?", 1, 1, false );
    SubLFiles.declareFunction( me, "sdct_elementP", "SDCT-ELEMENT?", 1, 1, false );
    SubLFiles.declareFunction( me, "safe_sdct_elementP", "SAFE-SDCT-ELEMENT?", 1, 1, false );
    SubLFiles.declareFunction( me, "applicable_sdctP", "APPLICABLE-SDCT?", 1, 1, false );
    SubLFiles.declareFunction( me, "sdcP", "SDC?", 2, 1, false );
    SubLFiles.declareFunction( me, "sdc_intP", "SDC-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "any_sdc_wrtP", "ANY-SDC-WRT?", 2, 1, false );
    new $any_sdc_wrtP$BinaryFunction();
    SubLFiles.declareFunction( me, "any_sdc_wrt", "ANY-SDC-WRT", 2, 1, false );
    SubLFiles.declareFunction( me, "any_sdc_anyP", "ANY-SDC-ANY?", 2, 1, false );
    SubLFiles.declareFunction( me, "any_sdc_any", "ANY-SDC-ANY", 2, 1, false );
    SubLFiles.declareFunction( me, "sdc_exceptions", "SDC-EXCEPTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "sdc_exceptions_int", "SDC-EXCEPTIONS-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_sdc_exceptions", "CLEAR-CACHED-SDC-EXCEPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_sdc_exceptions", "REMOVE-CACHED-SDC-EXCEPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_sdc_exceptions_internal", "CACHED-SDC-EXCEPTIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_sdc_exceptions", "CACHED-SDC-EXCEPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "declared_sdc_exceptions", "DECLARED-SDC-EXCEPTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "sdc_exceptions_of_genls", "SDC-EXCEPTIONS-OF-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_direct_sdc_exceptions", "GATHER-DIRECT-SDC-EXCEPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "direct_sdc_exceptions", "DIRECT-SDC-EXCEPTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "direct_sdc_exceptionP", "DIRECT-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "collections_sharing_specs", "COLLECTIONS-SHARING-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "sdc_exceptionP", "SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "declared_sdc_exceptionP", "DECLARED-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "remote_sdc_exceptionP", "REMOTE-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "any_remote_sdc_exception_pair", "ANY-REMOTE-SDC-EXCEPTION-PAIR", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_any_genls_sdc_exception", "GATHER-ANY-GENLS-SDC-EXCEPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_direct_sdc_exception", "GATHER-DIRECT-SDC-EXCEPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sdc_common_specP", "SDC-COMMON-SPEC?", 2, 1, false );
    SubLFiles.declareFunction( me, "remote_sdc_common_specP", "REMOTE-SDC-COMMON-SPEC?", 2, 1, false );
    SubLFiles.declareFunction( me, "sdct_elements", "SDCT-ELEMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cols_with_applicable_sdct", "COLS-WITH-APPLICABLE-SDCT", 1, 1, false );
    SubLFiles.declareFunction( me, "establishing_supersetP", "ESTABLISHING-SUPERSET?", 2, 2, false );
    SubLFiles.declareFunction( me, "establishing_instance_ofP", "ESTABLISHING-INSTANCE-OF?", 2, 2, false );
    SubLFiles.declareFunction( me, "why_sdcP", "WHY-SDC?", 2, 2, false );
    SubLFiles.declareFunction( me, "assemble_sdc_just", "ASSEMBLE-SDC-JUST", 1, 0, false );
    SubLFiles.declareFunction( me, "any_just_of_sdc", "ANY-JUST-OF-SDC", 2, 1, false );
    SubLFiles.declareFunction( me, "any_just_of_isa_sdct", "ANY-JUST-OF-ISA-SDCT", 2, 1, false );
    SubLFiles.declareFunction( me, "why_sdc_exceptionP", "WHY-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_declared_sdc_exceptionP", "WHY-DECLARED-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_direct_sdc_exceptionP", "WHY-DIRECT-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_remote_sdc_exceptionP", "WHY-REMOTE-SDC-EXCEPTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_sdc_common_specP", "WHY-SDC-COMMON-SPEC?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_remote_common_specP", "WHY-REMOTE-COMMON-SPEC?", 2, 1, false );
    SubLFiles.declareFunction( me, "isa_common_sdctP", "ISA-COMMON-SDCT?", 2, 1, false );
    SubLFiles.declareFunction( me, "isa_common_sdct_amongP", "ISA-COMMON-SDCT-AMONG?", 2, 1, false );
    SubLFiles.declareFunction( me, "sdw_error", "SDW-ERROR", 2, 5, false );
    return NIL;
  }

  public static SubLObject init_sdc_file()
  {
    $sdc_exception_transfers_thru_specsP$ = SubLFiles.defparameter( "*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*", NIL );
    $sdc_common_spec_exceptionP$ = SubLFiles.defparameter( "*SDC-COMMON-SPEC-EXCEPTION?*", NIL );
    $ignoring_sdcP$ = SubLFiles.defparameter( "*IGNORING-SDC?*", NIL );
    $sd_c1_genls_space$ = SubLFiles.defparameter( "*SD-C1-GENLS-SPACE*", NIL );
    $sd_c2_genls_space$ = SubLFiles.defparameter( "*SD-C2-GENLS-SPACE*", NIL );
    $sd_genls_isas_space$ = SubLFiles.defparameter( "*SD-GENLS-ISAS-SPACE*", NIL );
    $sd_candidate_store$ = SubLFiles.defparameter( "*SD-CANDIDATE-STORE*", NIL );
    $sd_c2_genl$ = SubLFiles.defparameter( "*SD-C2-GENL*", NIL );
    $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = SubLFiles.deflexical( "*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*", NIL );
    $sbhl_sd_genls_isas_goal$ = SubLFiles.defparameter( "*SBHL-SD-GENLS-ISAS-GOAL*", NIL );
    $cached_all_isa_sdct_caching_state$ = SubLFiles.deflexical( "*CACHED-ALL-ISA-SDCT-CACHING-STATE*", NIL );
    $cached_sdc_exceptions_caching_state$ = SubLFiles.deflexical( "*CACHED-SDC-EXCEPTIONS-CACHING-STATE*", NIL );
    $sdw_trace_level$ = SubLFiles.defvar( "*SDW-TRACE-LEVEL*", ONE_INTEGER );
    $sdw_test_level$ = SubLFiles.defvar( "*SDW-TEST-LEVEL*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_sdc_file()
  {
    memoization_state.note_globally_cached_function( $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_ );
    memoization_state.note_globally_cached_function( $sym24$CACHED_ALL_ISA_SDCT );
    memoization_state.note_globally_cached_function( $sym29$CACHED_SDC_EXCEPTIONS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sdc_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sdc_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sdc_file();
  }
  static
  {
    me = new sdc();
    $sdc_exception_transfers_thru_specsP$ = null;
    $sdc_common_spec_exceptionP$ = null;
    $ignoring_sdcP$ = null;
    $sd_c1_genls_space$ = null;
    $sd_c2_genls_space$ = null;
    $sd_genls_isas_space$ = null;
    $sd_candidate_store$ = null;
    $sd_c2_genl$ = null;
    $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = null;
    $sbhl_sd_genls_isas_goal$ = null;
    $cached_all_isa_sdct_caching_state$ = null;
    $cached_sdc_exceptions_caching_state$ = null;
    $sdw_trace_level$ = null;
    $sdw_test_level$ = null;
    $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol( "INSTANTIATE-SBHL-MARKING-SPACE-FOR" );
    $sym1$_SD_C1_GENLS_SPACE_ = makeSymbol( "*SD-C1-GENLS-SPACE*" );
    $sym2$_SD_C2_GENLS_SPACE_ = makeSymbol( "*SD-C2-GENLS-SPACE*" );
    $sym3$_SD_GENLS_ISAS_SPACE_ = makeSymbol( "*SD-GENLS-ISAS-SPACE*" );
    $sym4$_SD_CANDIDATE_STORE_ = makeSymbol( "*SD-CANDIDATE-STORE*" );
    $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw6$ERROR = makeKeyword( "ERROR" );
    $str7$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym8$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw9$CERROR = makeKeyword( "CERROR" );
    $str10$continue_anyway = makeString( "continue anyway" );
    $kw11$WARN = makeKeyword( "WARN" );
    $str12$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const13$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw14$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $sym15$SBHL_MARK_SD_GENLS_ISAS = makeSymbol( "SBHL-MARK-SD-GENLS-ISAS" );
    $const16$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym17$SBHL_GATHER_SD_CANDIDATES = makeSymbol( "SBHL-GATHER-SD-CANDIDATES" );
    $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES = makeSymbol( "SBHL-DETERMINE-SD-AND-STORE-CANDIDATES" );
    $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_ = makeSymbol( "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?" );
    $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_ = makeSymbol( "*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*" );
    $sym21$SBHL_SD_GOAL_IN_GENLS_ISAS_P = makeSymbol( "SBHL-SD-GOAL-IN-GENLS-ISAS-P" );
    $sym22$GATHER_SDCT_ISAS = makeSymbol( "GATHER-SDCT-ISAS" );
    $sym23$GATHER_IF_SDCT_ = makeSymbol( "GATHER-IF-SDCT?" );
    $sym24$CACHED_ALL_ISA_SDCT = makeSymbol( "CACHED-ALL-ISA-SDCT" );
    $sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P = makeSymbol( "RELEVANT-SIBLING-DISJOINT-COLLECTION-P" );
    $sym26$_CACHED_ALL_ISA_SDCT_CACHING_STATE_ = makeSymbol( "*CACHED-ALL-ISA-SDCT-CACHING-STATE*" );
    $int27$512 = makeInteger( 512 );
    $sym28$SAFE_SDCT_ELEMENT_ = makeSymbol( "SAFE-SDCT-ELEMENT?" );
    $sym29$CACHED_SDC_EXCEPTIONS = makeSymbol( "CACHED-SDC-EXCEPTIONS" );
    $sym30$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_ = makeSymbol( "*CACHED-SDC-EXCEPTIONS-CACHING-STATE*" );
    $sym31$GATHER_DIRECT_SDC_EXCEPTIONS = makeSymbol( "GATHER-DIRECT-SDC-EXCEPTIONS" );
    $const32$siblingDisjointExceptions = constant_handles.reader_make_constant_shell( makeString( "siblingDisjointExceptions" ) );
    $const33$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $sym34$GATHER_DIRECT_SDC_EXCEPTION = makeSymbol( "GATHER-DIRECT-SDC-EXCEPTION" );
    $kw35$TRUE = makeKeyword( "TRUE" );
    $kw36$ASSERTION = makeKeyword( "ASSERTION" );
    $kw37$OPAQUE = makeKeyword( "OPAQUE" );
    $const38$SiblingDisjointCollectionType = constant_handles.reader_make_constant_shell( makeString( "SiblingDisjointCollectionType" ) );
    $list39 = ConsesLow.list( makeSymbol( "SPEC1" ), makeSymbol( "SPEC2" ) );
    $sym40$C1 = makeSymbol( "C1" );
    $sym41$C2 = makeSymbol( "C2" );
  }

  public static final class $sbhl_mark_sd_genls_isas$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_mark_sd_genls_isas$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-MARK-SD-GENLS-ISAS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_mark_sd_genls_isas( arg1 );
    }
  }

  public static final class $sbhl_gather_sd_candidates$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_gather_sd_candidates$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-GATHER-SD-CANDIDATES" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_gather_sd_candidates( arg1 );
    }
  }

  public static final class $sbhl_determine_sd_and_store_candidates$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_determine_sd_and_store_candidates$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-DETERMINE-SD-AND-STORE-CANDIDATES" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_determine_sd_and_store_candidates( arg1 );
    }
  }

  public static final class $any_sdc_wrtP$BinaryFunction
      extends
        BinaryFunction
  {
    public $any_sdc_wrtP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ANY-SDC-WRT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return any_sdc_wrtP( arg1, arg2, UNPROVIDED );
    }
  }
}
/*
 * 
 * Total time: 1120 ms
 * 
 */