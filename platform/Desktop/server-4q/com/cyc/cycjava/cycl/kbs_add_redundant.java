package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbs_add_redundant
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kbs_add_redundant";
  public static final String myFingerPrint = "8782fbf57599ba0e8ee00b50b9716d0796b2acd7bae8f9948820c39a112efc3f";
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 880L)
  private static SubLSymbol $kbs_add_redundant_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 2948L)
  private static SubLSymbol $kbs_add_redundant_definitional_info_backwardP$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 4309L)
  private static SubLSymbol $defining_predicates_info$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 5984L)
  private static SubLSymbol $arg2_defining_predicates_info$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 6227L)
  private static SubLSymbol $cached_kbs_additional_redundant_definitional_info_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 9889L)
  public static SubLSymbol $kbs_cycle_size_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 12912L)
  private static SubLSymbol $kbs_broader_term_gafs$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 16463L)
  private static SubLSymbol $get_broader_mt_support_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17103L)
  private static SubLSymbol $broader_term_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 18147L)
  private static SubLSymbol $kbs_additional_redundant_asserted_arguments$;
  private static final SubLString $str0$Computing_additional_redundant_de;
  private static final SubLString $str1$cdolist;
  private static final SubLString $str2$Adding_;
  private static final SubLString $str3$_additional_redundant_definitiona;
  private static final SubLString $str4$_FORTs;
  private static final SubLString $str5$Adding_additional_redundant_defin;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym11$CSETQ;
  private static final SubLString $str12$_A;
  private static final SubLString $str13$Turning_backward_GAFs_forward;
  private static final SubLSymbol $sym14$STRINGP;
  private static final SubLSymbol $kw15$SKIP;
  private static final SubLSymbol $sym16$FIRST;
  private static final SubLSymbol $kw17$FORWARD;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO;
  private static final SubLSymbol $sym21$_CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO_CACHING_STATE_;
  private static final SubLInteger $int22$2000;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const25$EverythingPSC;
  private static final SubLSymbol $kw26$TRUE;
  private static final SubLObject $const27$isa;
  private static final SubLList $list28;
  private static final SubLObject $const29$Individual;
  private static final SubLObject $const30$UniversalVocabularyMt;
  private static final SubLString $str31$__Additions__;
  private static final SubLString $str32$_____S_in__S;
  private static final SubLSymbol $sym33$KBS_FORT_P;
  private static final SubLString $str34$__Cycle___S__S__S;
  private static final SubLSymbol $sym35$MIN_COLS;
  private static final SubLSymbol $sym36$MIN_PREDICATES;
  private static final SubLSymbol $sym37$MIN_MTS;
  private static final SubLString $str38$__Given___S__Minimal___S;
  private static final SubLSymbol $sym39$FORT_P;
  private static final SubLObject $const40$quotedIsa;
  private static final SubLObject $const41$genls;
  private static final SubLSymbol $sym42$_KBS_BROADER_TERM_GAFS_;
  private static final SubLString $str43$Computing___broaderTerm_additions;
  private static final SubLString $str44$_terms;
  private static final SubLString $str45$Spent__A_computing_spec_preds_and;
  private static final SubLSymbol $sym46$KBS_BROADER_TERM_CANDIDATE_FORT_;
  private static final SubLSymbol $sym47$SKOLEM_NART_;
  private static final SubLString $str48$Computing___broaderTerm_additions;
  private static final SubLObject $const49$broaderTerm_NonTaxonomic;
  private static final SubLSymbol $sym50$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const51$InferencePSC;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$DEFAULT;
  private static final SubLSymbol $sym54$SUPPORT_STRENGTH;
  private static final SubLSymbol $kw55$MONOTONIC;
  private static final SubLObject $const56$broaderTerm;
  private static final SubLSymbol $sym57$BROADER_TERM_PREDS;
  private static final SubLSymbol $sym58$_BROADER_TERM_PREDS_CACHING_STATE_;
  private static final SubLString $str59$___broaderTerm_assertions;
  private static final SubLString $str60$Adding_some___broaderTerm_asserti;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$STRENGTH;
  private static final SubLString $str63$Computing_additional_redundant_as;
  private static final SubLSymbol $sym64$KBS_DEDUCTION_P;
  private static final SubLString $str65$__Addition__;
  private static final SubLString $str66$_additional_redundant_asserted_ar;
  private static final SubLObject $const67$geographicalSubRegions;

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 937L)
  public static SubLObject compute_and_add_kbs_additional_redundant_definitional_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( TEN_INTEGER );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
      try
      {
        kbs_partition.clear_kbs_splicing_assertions();
        final SubLObject count = compute_kbs_additional_redundant_definitional_info();
        add_kbs_additional_redundant_definitional_info( count );
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 1362L)
  public static SubLObject compute_and_add_kbs_broader_term_gafs()
  {
    compute_kbs_broader_term_gafs();
    add_kbs_broader_term_gafs();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 1496L)
  public static SubLObject compute_and_add_kbs_additional_redundant_asserted_arguments()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( TEN_INTEGER );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
      try
      {
        compute_kbs_additional_redundant_asserted_arguments();
        add_kbs_additional_redundant_asserted_arguments();
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
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
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 1751L)
  public static SubLObject compute_kbs_additional_redundant_definitional_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_cached_kbs_additional_redundant_definitional_info();
    final SubLObject v_forts = kbs_identification.kbs_forts();
    SubLObject total = ZERO_INTEGER;
    final SubLObject list_var = v_forts;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str0$Computing_additional_redundant_de, thread );
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
        SubLObject fort = NIL;
        fort = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject additions = cached_kbs_additional_redundant_definitional_info( fort );
          if( NIL != additions )
          {
            total = Numbers.add( total, Sequences.length( additions ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          fort = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 2381L)
  public static SubLObject add_kbs_additional_redundant_definitional_info(SubLObject total_assertion_count)
  {
    if( total_assertion_count == UNPROVIDED )
    {
      total_assertion_count = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_forts = kbs_identification.kbs_forts();
    final SubLObject message = total_assertion_count.isInteger() ? Sequences.cconcatenate( $str2$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy( total_assertion_count ),
      $str3$_additional_redundant_definitiona, format_nil.format_nil_a_no_copy( Sequences.length( v_forts ) ), $str4$_FORTs
    } ) : Sequences.cconcatenate( $str5$Adding_additional_redundant_defin, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( v_forts ) ), $str4$_FORTs
    } );
    final SubLObject list_var = v_forts;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str1$cdolist, thread );
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
        SubLObject fort = NIL;
        fort = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          add_kbs_additional_redundant_definitional_info_for_fort( fort );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          fort = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 3171L)
  public static SubLObject add_kbs_additional_redundant_definitional_info_for_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject additions = cached_kbs_additional_redundant_definitional_info( fort );
    final SubLObject v_properties = ( NIL != $kbs_add_redundant_definitional_info_backwardP$.getDynamicValue( thread ) ) ? $list6 : NIL;
    SubLObject cdolist_list_var = additions;
    SubLObject addition = NIL;
    addition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = addition;
      SubLObject sentence = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
      sentence = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject message_var = NIL;
        final SubLObject was_appendingP = Eval.eval( $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
        Eval.eval( $list9 );
        try
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym10$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                cyc_kernel.cyc_assert_wff( sentence, mt, v_properties );
                kbs_partition.add_kbs_splicing_assertion( czer_meta.find_assertion_cycl( sentence, mt ) );
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
            message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            Eval.eval( ConsesLow.list( $sym11$CSETQ, $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
        if( message_var.isString() )
        {
          Errors.warn( $str12$_A, message_var );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      addition = cdolist_list_var.first();
    }
    return Sequences.length( additions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 3677L)
  public static SubLObject kbs_reassert_redundant_definitional_info_forward(SubLObject timeout, SubLObject traceP)
  {
    if( timeout == UNPROVIDED )
    {
      timeout = NIL;
    }
    if( traceP == UNPROVIDED )
    {
      traceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str13$Turning_backward_GAFs_forward;
    final SubLObject total_$5 = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
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
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$6 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$6, $kw15$SKIP ) )
        {
          final SubLObject idx_$7 = idx_$6;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$7, $kw15$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$7 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject gaf;
            SubLObject predicate;
            SubLObject timed_outP;
            SubLObject tag;
            SubLObject _prev_bind_0_$8;
            SubLObject timer;
            SubLObject _prev_bind_0_$9;
            SubLObject _prev_bind_0_$10;
            SubLObject _values;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw15$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw15$SKIP;
                }
                gaf = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertions_high.gaf_assertionP( gaf ) && NIL != assertions_high.backward_assertionP( gaf ) )
                {
                  predicate = assertions_high.gaf_predicate( gaf );
                  if( NIL != Sequences.find( predicate, $defining_predicates_info$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym16$FIRST ), UNPROVIDED, UNPROVIDED ) )
                  {
                    timed_outP = NIL;
                    if( NIL != timeout )
                    {
                      tag = subl_macro_promotions.with_timeout_make_tag();
                      try
                      {
                        thread.throwStack.push( tag );
                        _prev_bind_0_$8 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                        try
                        {
                          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                          timer = NIL;
                          try
                          {
                            _prev_bind_0_$9 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                            try
                            {
                              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                              timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                              if( NIL != traceP )
                              {
                                print_high.print( gaf, StreamsLow.$standard_output$.getDynamicValue( thread ) );
                                streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
                              }
                              ke.ke_reassert_assertion_now_int( gaf, assertions_high.assertion_strength( gaf ), $kw17$FORWARD );
                              total = Numbers.add( total, ONE_INTEGER );
                            }
                            finally
                            {
                              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$9, thread );
                            }
                          }
                          finally
                          {
                            _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              _values = Values.getValuesAsVector();
                              subl_macro_promotions.with_timeout_stop_timer( timer );
                              Values.restoreValuesFromVector( _values );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                            }
                          }
                        }
                        finally
                        {
                          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$8, thread );
                        }
                      }
                      catch( final Throwable ccatch_env_var )
                      {
                        timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
                      }
                      finally
                      {
                        thread.throwStack.pop();
                      }
                    }
                    else
                    {
                      if( NIL != traceP )
                      {
                        print_high.print( gaf, StreamsLow.$standard_output$.getDynamicValue( thread ) );
                        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
                      }
                      ke.ke_reassert_assertion_now_int( gaf, assertions_high.assertion_strength( gaf ), $kw17$FORWARD );
                      total = Numbers.add( total, ONE_INTEGER );
                    }
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total_$5 );
              }
            }
          }
          final SubLObject idx_$8 = idx_$6;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$8 ) || NIL == id_index.id_index_skip_tombstones_p( $kw15$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$8 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$8 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$8 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw15$SKIP ) ) ? NIL : $kw15$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw15$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject gaf2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertions_high.gaf_assertionP( gaf2 ) && NIL != assertions_high.backward_assertionP( gaf2 ) )
                {
                  final SubLObject predicate2 = assertions_high.gaf_predicate( gaf2 );
                  if( NIL != Sequences.find( predicate2, $defining_predicates_info$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym16$FIRST ), UNPROVIDED, UNPROVIDED ) )
                  {
                    SubLObject timed_outP2 = NIL;
                    if( NIL != timeout )
                    {
                      final SubLObject tag2 = subl_macro_promotions.with_timeout_make_tag();
                      try
                      {
                        thread.throwStack.push( tag2 );
                        final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                        try
                        {
                          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                          SubLObject timer2 = NIL;
                          try
                          {
                            final SubLObject _prev_bind_0_$12 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                            try
                            {
                              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                              timer2 = subl_macro_promotions.with_timeout_start_timer( timeout, tag2 );
                              if( NIL != traceP )
                              {
                                print_high.print( gaf2, StreamsLow.$standard_output$.getDynamicValue( thread ) );
                                streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
                              }
                              ke.ke_reassert_assertion_now_int( gaf2, assertions_high.assertion_strength( gaf2 ), $kw17$FORWARD );
                              total = Numbers.add( total, ONE_INTEGER );
                            }
                            finally
                            {
                              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$12, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values2 = Values.getValuesAsVector();
                              subl_macro_promotions.with_timeout_stop_timer( timer2 );
                              Values.restoreValuesFromVector( _values2 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                            }
                          }
                        }
                        finally
                        {
                          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$11, thread );
                        }
                      }
                      catch( final Throwable ccatch_env_var2 )
                      {
                        timed_outP2 = Errors.handleThrowable( ccatch_env_var2, tag2 );
                      }
                      finally
                      {
                        thread.throwStack.pop();
                      }
                    }
                    else
                    {
                      if( NIL != traceP )
                      {
                        print_high.print( gaf2, StreamsLow.$standard_output$.getDynamicValue( thread ) );
                        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
                      }
                      ke.ke_reassert_assertion_now_int( gaf2, assertions_high.assertion_strength( gaf2 ), $kw17$FORWARD );
                      total = Numbers.add( total, ONE_INTEGER );
                    }
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total_$5 );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 6227L)
  public static SubLObject clear_cached_kbs_additional_redundant_definitional_info()
  {
    final SubLObject cs = $cached_kbs_additional_redundant_definitional_info_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 6227L)
  public static SubLObject remove_cached_kbs_additional_redundant_definitional_info(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_kbs_additional_redundant_definitional_info_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 6227L)
  public static SubLObject cached_kbs_additional_redundant_definitional_info_internal(final SubLObject fort)
  {
    return kbs_additional_redundant_definitional_info( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 6227L)
  public static SubLObject cached_kbs_additional_redundant_definitional_info(final SubLObject fort)
  {
    SubLObject caching_state = $cached_kbs_additional_redundant_definitional_info_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym20$CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO, $sym21$_CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO_CACHING_STATE_, NIL, EQ,
          ONE_INTEGER, $int22$2000 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_kbs_additional_redundant_definitional_info_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 6388L)
  public static SubLObject kbs_additional_redundant_definitional_info(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.skolem_constantP( fort ) )
    {
      return NIL;
    }
    SubLObject additions = NIL;
    SubLObject has_isa_assertionP = NIL;
    SubLObject cdolist_list_var = $defining_predicates_info$.getDynamicValue( thread );
    SubLObject pred_info = NIL;
    pred_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_info;
      SubLObject pred = NIL;
      SubLObject all_func = NIL;
      SubLObject test_func = NIL;
      SubLObject min_func = NIL;
      SubLObject reflexive = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      all_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      test_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      min_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      reflexive = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject fort_types = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym24$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const25$EverythingPSC, thread );
          fort_types = fort_types_interface.fort_types( fort, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        if( kb_indexing.num_gaf_arg_index( fort, ONE_INTEGER, pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
        {
          SubLObject cdolist_list_var_$16;
          final SubLObject mts = cdolist_list_var_$16 = kb_indexing.key_gaf_arg_index( fort, ONE_INTEGER, pred );
          SubLObject mt = NIL;
          mt = cdolist_list_var_$16.first();
          while ( NIL != cdolist_list_var_$16)
          {
            final SubLObject true_values = kb_mapping_utilities.pred_values_in_mt( fort, pred, mt, ONE_INTEGER, TWO_INTEGER, $kw26$TRUE );
            final SubLObject additional_value_mt_pairs = kbs_splicing_value_mt_pairs( fort, mt, true_values, pred, all_func, test_func, min_func, reflexive );
            if( NIL == has_isa_assertionP && pred.eql( $const27$isa ) && NIL != true_values && NIL == has_isa_assertionP )
            {
              SubLObject csome_list_var = true_values;
              SubLObject true_value = NIL;
              true_value = csome_list_var.first();
              while ( NIL == has_isa_assertionP && NIL != csome_list_var)
              {
                if( NIL != kbs_identification.kbs_fort_p( true_value ) )
                {
                  has_isa_assertionP = T;
                }
                csome_list_var = csome_list_var.rest();
                true_value = csome_list_var.first();
              }
            }
            if( NIL != additional_value_mt_pairs )
            {
              SubLObject cdolist_list_var_$17 = additional_value_mt_pairs;
              SubLObject additional_value_mt_pair = NIL;
              additional_value_mt_pair = cdolist_list_var_$17.first();
              while ( NIL != cdolist_list_var_$17)
              {
                SubLObject current_$19;
                final SubLObject datum_$18 = current_$19 = additional_value_mt_pair;
                SubLObject add_mt = NIL;
                SubLObject add_value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$19, datum_$18, $list28 );
                add_mt = current_$19.first();
                current_$19 = current_$19.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$19, datum_$18, $list28 );
                add_value = current_$19.first();
                current_$19 = current_$19.rest();
                if( NIL == current_$19 )
                {
                  if( NIL == list_utilities.member_eqP( add_value, fort_types ) )
                  {
                    final SubLObject var;
                    final SubLObject addition = var = kbs_make_redundant_addition( pred, fort, add_value, add_mt );
                    if( NIL != var )
                    {
                      additions = ConsesLow.cons( var, additions );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$18, $list28 );
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                additional_value_mt_pair = cdolist_list_var_$17.first();
              }
            }
            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
            mt = cdolist_list_var_$16.first();
          }
          if( NIL == additions && NIL == has_isa_assertionP )
          {
            if( NIL == fort_types )
            {
              fort_types = ConsesLow.list( $const29$Individual );
            }
            SubLObject cdolist_list_var_$18 = fort_types;
            SubLObject fort_type = NIL;
            fort_type = cdolist_list_var_$18.first();
            while ( NIL != cdolist_list_var_$18)
            {
              additions = ConsesLow.cons( kbs_make_redundant_addition_forced( $const27$isa, fort, fort_type, $const30$UniversalVocabularyMt ), additions );
              cdolist_list_var_$18 = cdolist_list_var_$18.rest();
              fort_type = cdolist_list_var_$18.first();
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_info = cdolist_list_var.first();
    }
    cdolist_list_var = $arg2_defining_predicates_info$.getDynamicValue( thread );
    pred_info = NIL;
    pred_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_info;
      SubLObject pred = NIL;
      SubLObject all_func = NIL;
      SubLObject test_func = NIL;
      SubLObject min_func = NIL;
      SubLObject reflexive = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      all_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      test_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      min_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      reflexive = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( kb_indexing.num_gaf_arg_index( fort, TWO_INTEGER, pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
        {
          SubLObject cdolist_list_var_$19;
          final SubLObject mts2 = cdolist_list_var_$19 = kb_indexing.key_gaf_arg_index( fort, TWO_INTEGER, pred );
          SubLObject mt2 = NIL;
          mt2 = cdolist_list_var_$19.first();
          while ( NIL != cdolist_list_var_$19)
          {
            final SubLObject true_values2 = kb_mapping_utilities.pred_values_in_mt( fort, pred, mt2, TWO_INTEGER, ONE_INTEGER, $kw26$TRUE );
            final SubLObject additional_value_mt_pairs2 = kbs_splicing_value_mt_pairs( fort, mt2, true_values2, pred, all_func, test_func, min_func, reflexive );
            if( NIL != additional_value_mt_pairs2 )
            {
              SubLObject cdolist_list_var_$20 = additional_value_mt_pairs2;
              SubLObject additional_value_mt_pair2 = NIL;
              additional_value_mt_pair2 = cdolist_list_var_$20.first();
              while ( NIL != cdolist_list_var_$20)
              {
                SubLObject current_$20;
                final SubLObject datum_$19 = current_$20 = additional_value_mt_pair2;
                SubLObject add_mt2 = NIL;
                SubLObject add_value2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$20, datum_$19, $list28 );
                add_mt2 = current_$20.first();
                current_$20 = current_$20.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$20, datum_$19, $list28 );
                add_value2 = current_$20.first();
                current_$20 = current_$20.rest();
                if( NIL == current_$20 )
                {
                  final SubLObject var2;
                  final SubLObject addition2 = var2 = kbs_make_redundant_addition( pred, add_value2, fort, add_mt2 );
                  if( NIL != var2 )
                  {
                    additions = ConsesLow.cons( var2, additions );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$19, $list28 );
                }
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                additional_value_mt_pair2 = cdolist_list_var_$20.first();
              }
            }
            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
            mt2 = cdolist_list_var_$19.first();
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_info = cdolist_list_var.first();
    }
    if( NIL != additions )
    {
      additions = Sequences.nreverse( additions );
      if( NIL != $kbs_add_redundant_verboseP$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str31$__Additions__ );
        cdolist_list_var = additions;
        SubLObject addition3 = NIL;
        addition3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = addition3;
          SubLObject sentence = NIL;
          SubLObject mt3 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
          sentence = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
          mt3 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            PrintLow.format( T, $str32$_____S_in__S, sentence, mt3 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          addition3 = cdolist_list_var.first();
        }
      }
    }
    return additions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 9045L)
  public static SubLObject kbs_splicing_value_mt_pairs(final SubLObject fort, final SubLObject mt, final SubLObject given_values, final SubLObject pred, final SubLObject all_func, final SubLObject test_func,
      final SubLObject min_func, final SubLObject reflexive)
  {
    if( NIL == kbs_identification.kbs_fort_p( mt ) )
    {
      return NIL;
    }
    SubLObject do_splicingP = NIL;
    if( NIL == do_splicingP )
    {
      SubLObject csome_list_var = given_values;
      SubLObject given_value = NIL;
      given_value = csome_list_var.first();
      while ( NIL == do_splicingP && NIL != csome_list_var)
      {
        if( NIL != kbs_identification.compute_non_kbs_assertion_p( kb_indexing.find_gaf( ConsesLow.list( pred, fort, given_value ), mt ) ) )
        {
          do_splicingP = T;
        }
        csome_list_var = csome_list_var.rest();
        given_value = csome_list_var.first();
      }
    }
    if( NIL == do_splicingP )
    {
      return NIL;
    }
    final SubLObject minimal_values = minimal_implied_kbs_values_in_mt( fort, mt, given_values, pred, all_func, test_func, min_func, reflexive );
    final SubLObject additional_values = conses_high.nset_difference( minimal_values, given_values, UNPROVIDED, UNPROVIDED );
    SubLObject additional_value_mt_pairs = NIL;
    SubLObject cdolist_list_var = additional_values;
    SubLObject additional_value = NIL;
    additional_value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      additional_value_mt_pairs = ConsesLow.cons( ConsesLow.list( mt, additional_value ), additional_value_mt_pairs );
      cdolist_list_var = cdolist_list_var.rest();
      additional_value = cdolist_list_var.first();
    }
    return additional_value_mt_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 10111L)
  public static SubLObject minimal_implied_kbs_values_in_mt(final SubLObject fort, final SubLObject mt, final SubLObject given_values, final SubLObject pred, final SubLObject all_func, final SubLObject test_func,
      final SubLObject min_func, final SubLObject reflexive)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject full_values = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = given_values;
      SubLObject value = NIL;
      value = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        full_values = conses_high.nunion( full_values, ( NIL != forts.fort_p( value ) ) ? Functions.funcall( all_func, value ) : NIL, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        value = cdolist_list_var.first();
      }
      full_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym33$KBS_FORT_P ), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      full_values = remove_definitionally_restricted_values( full_values, pred );
      SubLObject cycle_set = NIL;
      if( NIL != reflexive )
      {
        full_values = Sequences.delete( fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cycle_set = kbs_cycle_set( fort, full_values, test_func );
        if( NIL != cycle_set )
        {
          if( NIL != $kbs_add_redundant_verboseP$.getDynamicValue( thread ) )
          {
            Errors.warn( $str34$__Cycle___S__S__S, test_func, fort, cycle_set );
          }
          full_values = conses_high.nset_difference( full_values, cycle_set, UNPROVIDED, UNPROVIDED );
        }
      }
      full_values = ( ( NIL != min_func ) ? ( ( min_func == $sym35$MIN_COLS ) ? genls.min_cols( full_values, UNPROVIDED, UNPROVIDED )
          : ( ( min_func == $sym36$MIN_PREDICATES ) ? genl_predicates.min_predicates( full_values, UNPROVIDED, UNPROVIDED )
              : ( ( min_func == $sym37$MIN_MTS ) ? genl_mts.min_mts( full_values, UNPROVIDED ) : Functions.funcall( min_func, full_values ) ) ) )
          : list_utilities.delete_subsumed_items( full_values, test_func, UNPROVIDED ) );
      if( NIL != cycle_set && ( NIL == $kbs_cycle_size_threshold$.getDynamicValue( thread ) || Sequences.length( cycle_set ).numLE( $kbs_cycle_size_threshold$.getDynamicValue( thread ) ) ) )
      {
        full_values = conses_high.nunion( cycle_set, full_values, UNPROVIDED, UNPROVIDED );
        if( NIL != $kbs_add_redundant_verboseP$.getDynamicValue( thread ) )
        {
          Errors.warn( $str38$__Given___S__Minimal___S, given_values, full_values );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return full_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 11591L)
  public static SubLObject remove_definitionally_restricted_values(final SubLObject full_values, final SubLObject pred)
  {
    final SubLObject predicate_predicate_sets = kbs_identification.kbs_predicate_definitional_predicate_sets( pred );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = full_values;
    SubLObject value = NIL;
    value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg2_predicate_set = kbs_identification.kbs_definitional_constant_predicate_sets( value );
      if( NIL == arg2_predicate_set || NIL != subl_promotions.memberP( arg2_predicate_set, predicate_predicate_sets, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( value, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      value = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 12047L)
  public static SubLObject kbs_cycle_set(final SubLObject fort, final SubLObject full_values, final SubLObject test_func)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject cycle_set = NIL;
    SubLObject cdolist_list_var = full_values;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.fort_p( v_term ) && NIL != Functions.funcall( test_func, v_term, fort ) )
      {
        cycle_set = ConsesLow.cons( v_term, cycle_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return cycle_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 12310L)
  public static SubLObject kbs_make_redundant_addition(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt)
  {
    if( predicate.eql( $const27$isa ) )
    {
      if( NIL != sbhl_cache.valid_cached_fort_type_p( arg2 ) )
      {
        return NIL;
      }
    }
    else if( predicate.eql( $const40$quotedIsa ) )
    {
      if( NIL != at_defns.quiet_quoted_defns_admitP( arg2, arg1, mt ) )
      {
        return NIL;
      }
    }
    else if( predicate.eql( $const41$genls ) && NIL != sbhl_cache.valid_cached_genl_p( arg2 ) )
    {
      return NIL;
    }
    return kbs_make_redundant_addition_forced( predicate, arg1, arg2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 12774L)
  public static SubLObject kbs_make_redundant_addition_forced(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt)
  {
    return ConsesLow.list( el_utilities.make_binary_formula( predicate, arg1, arg2 ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 13143L)
  public static SubLObject kbs_broader_term_gafs()
  {
    return $kbs_broader_term_gafs$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 13218L)
  public static SubLObject compute_kbs_broader_term_gafs()
  {
    final SubLObject accumulator = accumulation.new_list_accumulator( UNPROVIDED );
    final SubLObject fort_set = set_utilities.construct_set_from_list( kbs_broader_term_candidate_forts(), UNPROVIDED, UNPROVIDED );
    compute_some_kbs_broader_term_gafs( fort_set, accumulator );
    $kbs_broader_term_gafs$.setGlobalValue( accumulation.accumulation_contents( accumulator, UNPROVIDED ) );
    return accumulation.accumulation_size( accumulator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 13574L)
  public static SubLObject compute_some_kbs_broader_term_gafs(final SubLObject term_set, final SubLObject accumulator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.currentBinding( thread );
    try
    {
      tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.bind( T, thread );
      final SubLObject message = Sequences.cconcatenate( $str43$Computing___broaderTerm_additions, new SubLObject[] { format_nil.format_nil_a_no_copy( set.set_size( term_set ) ), $str44$_terms
      } );
      tva_cache.reset_tva_cache_spec_pred_stats();
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$25 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject message_$26 = message;
          final SubLObject total = forts.fort_count();
          SubLObject sofar = ZERO_INTEGER;
          final SubLObject _prev_bind_0_$26 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
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
              utilities_macros.noting_percent_progress_preamble( message_$26 );
              SubLObject cdolist_list_var = forts.do_forts_tables();
              SubLObject table_var = NIL;
              table_var = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject idx = table_var;
                if( NIL == id_index.id_index_objects_empty_p( idx, $kw15$SKIP ) )
                {
                  final SubLObject idx_$28 = idx;
                  if( NIL == id_index.id_index_dense_objects_empty_p( idx_$28, $kw15$SKIP ) )
                  {
                    final SubLObject vector_var = id_index.id_index_dense_objects( idx_$28 );
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject fort;
                    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                    {
                      id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                      fort = Vectors.aref( vector_var, id );
                      if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw15$SKIP ) )
                      {
                        if( NIL != id_index.id_index_tombstone_p( fort ) )
                        {
                          fort = $kw15$SKIP;
                        }
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                        if( NIL != set.set_memberP( fort, term_set ) )
                        {
                          accumulation.accumulation_add_all( accumulator, compute_kbs_broader_terms_for_fort( fort ) );
                        }
                      }
                    }
                  }
                  final SubLObject idx_$29 = idx;
                  if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$29 ) || NIL == id_index.id_index_skip_tombstones_p( $kw15$SKIP ) )
                  {
                    final SubLObject sparse = id_index.id_index_sparse_objects( idx_$29 );
                    SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$29 );
                    final SubLObject end_id = id_index.id_index_next_id( idx_$29 );
                    final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw15$SKIP ) ) ? NIL : $kw15$SKIP;
                    while ( id2.numL( end_id ))
                    {
                      final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                      if( NIL == id_index.id_index_skip_tombstones_p( $kw15$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                      {
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                        if( NIL != set.set_memberP( fort2, term_set ) )
                        {
                          accumulation.accumulation_add_all( accumulator, compute_kbs_broader_terms_for_fort( fort2 ) );
                        }
                      }
                      id2 = Numbers.add( id2, ONE_INTEGER );
                    }
                  }
                }
                cdolist_list_var = cdolist_list_var.rest();
                table_var = cdolist_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$26, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$25, thread );
      }
    }
    finally
    {
      tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.rebind( _prev_bind_0, thread );
    }
    format_nil.force_format( T, $str45$Spent__A_computing_spec_preds_and, numeric_date_utilities.readable_elapsed_time_string( tva_cache.tva_cache_spec_preds_total_time(), UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return accumulation.accumulation_size( accumulator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 14290L)
  public static SubLObject kbs_broader_term_candidate_forts()
  {
    return list_utilities.remove_if_not( $sym46$KBS_BROADER_TERM_CANDIDATE_FORT_, kbs_identification.kbs_forts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 14494L)
  public static SubLObject kbs_broader_term_candidate_fortP(final SubLObject fort)
  {
    if( NIL == forts.fort_p( fort ) )
    {
      return NIL;
    }
    if( NIL != cycl_utilities.expression_find_if( $sym47$SKOLEM_NART_, fort, T, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 14678L)
  public static SubLObject compute_specified_kbs_broader_term_gafs(final SubLObject iterator, final SubLObject accumulator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.currentBinding( thread );
    try
    {
      tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.bind( T, thread );
      final SubLObject message = $str48$Computing___broaderTerm_additions;
      tva_cache.reset_tva_cache_spec_pred_stats();
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$32 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject str = message;
          final SubLObject _prev_bind_0_$33 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
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
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject fort = iteration.iteration_next( iterator );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                accumulation.accumulation_add_all( accumulator, compute_kbs_broader_terms_for_fort( fort ) );
              }
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$33, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$32, thread );
      }
      format_nil.print_one_per_line( memoization_state.gather_memoization_state_statistics( state ), StreamsLow.$standard_output$.getDynamicValue( thread ) );
    }
    finally
    {
      tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.rebind( _prev_bind_0, thread );
    }
    format_nil.force_format( T, $str45$Spent__A_computing_spec_preds_and, numeric_date_utilities.readable_elapsed_time_string( tva_cache.tva_cache_spec_preds_total_time(), UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return accumulation.accumulation_size( accumulator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 15308L)
  public static SubLObject compute_kbs_broader_terms_for_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    tva_cache.ensure_tva_cache_created( $const49$broaderTerm_NonTaxonomic, ONE_INTEGER );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym50$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const51$InferencePSC, thread );
      SubLObject cdolist_list_var = tva_cache.tva_cache_get_values( fort, $const49$broaderTerm_NonTaxonomic, ONE_INTEGER, T );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject broader_term = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
        broader_term = current.first();
        current = ( supports = current.rest() );
        if( ( NIL == kbs_identification.kbs_forts() || NIL != kbs_identification.kbs_fort_p( broader_term ) ) && NIL == cycl_utilities.expression_find_if( $sym47$SKOLEM_NART_, broader_term, T, UNPROVIDED ) && !fort.eql(
            broader_term ) )
        {
          final SubLObject strength = ( NIL != Sequences.find( $kw53$DEFAULT, supports, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym54$SUPPORT_STRENGTH ), UNPROVIDED, UNPROVIDED ) ) ? $kw53$DEFAULT
              : $kw55$MONOTONIC;
          final SubLObject mt = get_broader_term_mt( supports, fort );
          if( NIL != hlmt.hlmt_p( mt ) )
          {
            ans = ConsesLow.cons( ConsesLow.list( el_utilities.make_binary_formula( $const56$broaderTerm, fort, broader_term ), mt, strength ), ans );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 16016L)
  public static SubLObject get_broader_term_mt(final SubLObject supports, final SubLObject focal_term)
  {
    SubLObject mt = NIL;
    if( NIL == mt )
    {
      SubLObject csome_list_var;
      SubLObject support;
      for( csome_list_var = supports, support = NIL, support = csome_list_var.first(); NIL == mt && NIL != csome_list_var; mt = get_broader_term_mt_from_support( support, focal_term ), csome_list_var = csome_list_var
          .rest(), support = csome_list_var.first() )
      {
      }
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 16521L)
  public static SubLObject get_broader_term_mt_from_support(final SubLObject support, final SubLObject focal_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != conses_high.member( support, $get_broader_mt_support_stack$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return ( NIL != cycl_utilities.expression_find( focal_term, support, T, UNPROVIDED, UNPROVIDED ) && NIL == cycl_utilities.expression_find_if( $sym47$SKOLEM_NART_, arguments.support_mt( support ), T, UNPROVIDED ) )
          ? arguments.support_mt( support )
          : NIL;
    }
    if( NIL != arguments.hl_support_p( support ) )
    {
      SubLObject mt = NIL;
      final SubLObject _prev_bind_0 = $get_broader_mt_support_stack$.currentBinding( thread );
      try
      {
        $get_broader_mt_support_stack$.bind( ConsesLow.cons( support, $get_broader_mt_support_stack$.getDynamicValue( thread ) ), thread );
        mt = get_broader_term_mt( hl_supports.hl_justify( support ), focal_term );
      }
      finally
      {
        $get_broader_mt_support_stack$.rebind( _prev_bind_0, thread );
      }
      return mt;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17103L)
  public static SubLObject clear_broader_term_preds()
  {
    final SubLObject cs = $broader_term_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17103L)
  public static SubLObject remove_broader_term_preds()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $broader_term_preds_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17103L)
  public static SubLObject broader_term_preds_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym24$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const25$EverythingPSC, thread );
      ans = genl_predicates.all_spec_predicates_and_inverses( $const49$broaderTerm_NonTaxonomic, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17103L)
  public static SubLObject broader_term_preds()
  {
    SubLObject caching_state = $broader_term_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym57$BROADER_TERM_PREDS, $sym58$_BROADER_TERM_PREDS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( broader_term_preds_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17295L)
  public static SubLObject add_kbs_broader_term_gafs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject additions = kbs_broader_term_gafs();
    final SubLObject message = Sequences.cconcatenate( $str2$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( additions ) ), $str59$___broaderTerm_assertions
    } );
    final SubLObject list_var = additions;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str1$cdolist, thread );
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
        SubLObject addition = NIL;
        addition = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          add_kbs_broader_term_gaf( addition );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          addition = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return Sequences.length( additions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17595L)
  public static SubLObject add_some_kbs_broader_term_gafs(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject str = $str60$Adding_some___broaderTerm_asserti;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
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
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject addition = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          add_kbs_broader_term_gaf( addition );
          count = Numbers.add( count, ONE_INTEGER );
        }
      }
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 17860L)
  public static SubLObject add_kbs_broader_term_gaf(final SubLObject addition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
      SubLObject sentence = NIL;
      SubLObject mt = NIL;
      SubLObject strength = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( addition, addition, $list61 );
      sentence = addition.first();
      SubLObject current = addition.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, addition, $list61 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, addition, $list61 );
      strength = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject message_var = NIL;
        final SubLObject was_appendingP = Eval.eval( $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
        Eval.eval( $list9 );
        try
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$36 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym10$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                cyc_kernel.cyc_assert_wff( sentence, mt, ConsesLow.list( $kw62$STRENGTH, strength ) );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$36, thread );
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
          final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            Eval.eval( ConsesLow.list( $sym11$CSETQ, $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
          }
        }
        if( message_var.isString() )
        {
          Errors.warn( $str12$_A, message_var );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( addition, $list61 );
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
    }
    return addition;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 18757L)
  public static SubLObject kbs_additional_redundant_asserted_arguments()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $kbs_additional_redundant_asserted_arguments$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 18876L)
  public static SubLObject compute_kbs_additional_redundant_asserted_arguments()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $kbs_additional_redundant_asserted_arguments$.setDynamicValue( NIL, thread );
    final SubLObject list_var;
    final SubLObject assertions = list_var = keyhash_utilities.keyhash_element_list( kbs_identification.kbs_assertion_table() );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str63$Computing_additional_redundant_as, thread );
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
        SubLObject assertion = NIL;
        assertion = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL == assertions_high.asserted_assertionP( assertion ) && NIL != assertions_high.deduced_assertionP( assertion ) )
          {
            final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
            if( NIL == Sequences.find_if( Symbols.symbol_function( $sym64$KBS_DEDUCTION_P ), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL != $kbs_add_redundant_verboseP$.getDynamicValue( thread ) )
              {
                PrintLow.format( T, $str65$__Addition__ );
                PrintLow.format( T, $str32$_____S_in__S, fi.assertion_hl_formula( assertion, UNPROVIDED ), assertions_high.assertion_mt( assertion ) );
              }
              $kbs_additional_redundant_asserted_arguments$.setDynamicValue( ConsesLow.cons( assertion, $kbs_additional_redundant_asserted_arguments$.getDynamicValue( thread ) ), thread );
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          assertion = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return Sequences.length( $kbs_additional_redundant_asserted_arguments$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 19691L)
  public static SubLObject add_kbs_additional_redundant_asserted_arguments()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertions = kbs_additional_redundant_asserted_arguments();
    final SubLObject message = Sequences.cconcatenate( $str2$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( assertions ) ), $str66$_additional_redundant_asserted_ar
    } );
    final SubLObject list_var = assertions;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str1$cdolist, thread );
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
        SubLObject assertion = NIL;
        assertion = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject truth = assertions_high.assertion_truth( assertion );
          final SubLObject strength = assertions_high.assertion_strength( assertion );
          SubLObject message_var = NIL;
          final SubLObject was_appendingP = Eval.eval( $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
          Eval.eval( $list9 );
          try
          {
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym10$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  assertions_interface.kb_create_asserted_argument( assertion, truth, strength );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$39, thread );
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
            final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              Eval.eval( ConsesLow.list( $sym11$CSETQ, $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
            }
          }
          if( message_var.isString() )
          {
            Errors.warn( $str12$_A, message_var );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          assertion = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 20283L)
  public static SubLObject all_geographical_super_regions(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      ans = removal_modules_transitivity.inference_transitivity_gather_arg1( $const67$geographicalSubRegions, fort );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-add-redundant.lisp", position = 20543L)
  public static SubLObject geographical_super_regionP(final SubLObject sub_region, final SubLObject super_region, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return removal_modules_transitivity.inference_transitivity_check( $const67$geographicalSubRegions, super_region, sub_region, mt, UNPROVIDED );
  }

  public static SubLObject declare_kbs_add_redundant_file()
  {
    SubLFiles.declareFunction( me, "compute_and_add_kbs_additional_redundant_definitional_info", "COMPUTE-AND-ADD-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_and_add_kbs_broader_term_gafs", "COMPUTE-AND-ADD-KBS-BROADER-TERM-GAFS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_and_add_kbs_additional_redundant_asserted_arguments", "COMPUTE-AND-ADD-KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_kbs_additional_redundant_definitional_info", "COMPUTE-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "add_kbs_additional_redundant_definitional_info", "ADD-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "add_kbs_additional_redundant_definitional_info_for_fort", "ADD-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_reassert_redundant_definitional_info_forward", "KBS-REASSERT-REDUNDANT-DEFINITIONAL-INFO-FORWARD", 0, 2, false );
    SubLFiles.declareFunction( me, "clear_cached_kbs_additional_redundant_definitional_info", "CLEAR-CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_kbs_additional_redundant_definitional_info", "REMOVE-CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_kbs_additional_redundant_definitional_info_internal", "CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_kbs_additional_redundant_definitional_info", "CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_additional_redundant_definitional_info", "KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_splicing_value_mt_pairs", "KBS-SPLICING-VALUE-MT-PAIRS", 8, 0, false );
    SubLFiles.declareFunction( me, "minimal_implied_kbs_values_in_mt", "MINIMAL-IMPLIED-KBS-VALUES-IN-MT", 8, 0, false );
    SubLFiles.declareFunction( me, "remove_definitionally_restricted_values", "REMOVE-DEFINITIONALLY-RESTRICTED-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "kbs_cycle_set", "KBS-CYCLE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "kbs_make_redundant_addition", "KBS-MAKE-REDUNDANT-ADDITION", 4, 0, false );
    SubLFiles.declareFunction( me, "kbs_make_redundant_addition_forced", "KBS-MAKE-REDUNDANT-ADDITION-FORCED", 4, 0, false );
    SubLFiles.declareFunction( me, "kbs_broader_term_gafs", "KBS-BROADER-TERM-GAFS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_kbs_broader_term_gafs", "COMPUTE-KBS-BROADER-TERM-GAFS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_some_kbs_broader_term_gafs", "COMPUTE-SOME-KBS-BROADER-TERM-GAFS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbs_broader_term_candidate_forts", "KBS-BROADER-TERM-CANDIDATE-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "kbs_broader_term_candidate_fortP", "KBS-BROADER-TERM-CANDIDATE-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_specified_kbs_broader_term_gafs", "COMPUTE-SPECIFIED-KBS-BROADER-TERM-GAFS", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_kbs_broader_terms_for_fort", "COMPUTE-KBS-BROADER-TERMS-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_broader_term_mt", "GET-BROADER-TERM-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_broader_term_mt_from_support", "GET-BROADER-TERM-MT-FROM-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_broader_term_preds", "CLEAR-BROADER-TERM-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_broader_term_preds", "REMOVE-BROADER-TERM-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "broader_term_preds_internal", "BROADER-TERM-PREDS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "broader_term_preds", "BROADER-TERM-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_kbs_broader_term_gafs", "ADD-KBS-BROADER-TERM-GAFS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_some_kbs_broader_term_gafs", "ADD-SOME-KBS-BROADER-TERM-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_kbs_broader_term_gaf", "ADD-KBS-BROADER-TERM-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_additional_redundant_asserted_arguments", "KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_kbs_additional_redundant_asserted_arguments", "COMPUTE-KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_kbs_additional_redundant_asserted_arguments", "ADD-KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_geographical_super_regions", "ALL-GEOGRAPHICAL-SUPER-REGIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "geographical_super_regionP", "GEOGRAPHICAL-SUPER-REGION?", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_kbs_add_redundant_file()
  {
    $kbs_add_redundant_verboseP$ = SubLFiles.defparameter( "*KBS-ADD-REDUNDANT-VERBOSE?*", NIL );
    $kbs_add_redundant_definitional_info_backwardP$ = SubLFiles.defparameter( "*KBS-ADD-REDUNDANT-DEFINITIONAL-INFO-BACKWARD?*", NIL );
    $defining_predicates_info$ = SubLFiles.defparameter( "*DEFINING-PREDICATES-INFO*", $list18 );
    $arg2_defining_predicates_info$ = SubLFiles.defparameter( "*ARG2-DEFINING-PREDICATES-INFO*", $list19 );
    $cached_kbs_additional_redundant_definitional_info_caching_state$ = SubLFiles.deflexical( "*CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO-CACHING-STATE*", NIL );
    $kbs_cycle_size_threshold$ = SubLFiles.defparameter( "*KBS-CYCLE-SIZE-THRESHOLD*", TWENTY_INTEGER );
    $kbs_broader_term_gafs$ = SubLFiles.deflexical( "*KBS-BROADER-TERM-GAFS*", ( maybeDefault( $sym42$_KBS_BROADER_TERM_GAFS_, $kbs_broader_term_gafs$, NIL ) ) );
    $get_broader_mt_support_stack$ = SubLFiles.defparameter( "*GET-BROADER-MT-SUPPORT-STACK*", NIL );
    $broader_term_preds_caching_state$ = SubLFiles.deflexical( "*BROADER-TERM-PREDS-CACHING-STATE*", NIL );
    $kbs_additional_redundant_asserted_arguments$ = SubLFiles.defparameter( "*KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_kbs_add_redundant_file()
  {
    memoization_state.note_globally_cached_function( $sym20$CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO );
    subl_macro_promotions.declare_defglobal( $sym42$_KBS_BROADER_TERM_GAFS_ );
    memoization_state.note_globally_cached_function( $sym57$BROADER_TERM_PREDS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kbs_add_redundant_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kbs_add_redundant_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kbs_add_redundant_file();
  }
  static
  {
    me = new kbs_add_redundant();
    $kbs_add_redundant_verboseP$ = null;
    $kbs_add_redundant_definitional_info_backwardP$ = null;
    $defining_predicates_info$ = null;
    $arg2_defining_predicates_info$ = null;
    $cached_kbs_additional_redundant_definitional_info_caching_state$ = null;
    $kbs_cycle_size_threshold$ = null;
    $kbs_broader_term_gafs$ = null;
    $get_broader_mt_support_stack$ = null;
    $broader_term_preds_caching_state$ = null;
    $kbs_additional_redundant_asserted_arguments$ = null;
    $str0$Computing_additional_redundant_de = makeString( "Computing additional redundant definitional info" );
    $str1$cdolist = makeString( "cdolist" );
    $str2$Adding_ = makeString( "Adding " );
    $str3$_additional_redundant_definitiona = makeString( " additional redundant definitional info assertions for " );
    $str4$_FORTs = makeString( " FORTs" );
    $str5$Adding_additional_redundant_defin = makeString( "Adding additional redundant definitional info for " );
    $list6 = ConsesLow.list( makeKeyword( "DIRECTION" ), makeKeyword( "BACKWARD" ) );
    $list7 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ) );
    $sym8$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list9 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym10$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym11$CSETQ = makeSymbol( "CSETQ" );
    $str12$_A = makeString( "~A" );
    $str13$Turning_backward_GAFs_forward = makeString( "Turning backward GAFs forward" );
    $sym14$STRINGP = makeSymbol( "STRINGP" );
    $kw15$SKIP = makeKeyword( "SKIP" );
    $sym16$FIRST = makeSymbol( "FIRST" );
    $kw17$FORWARD = makeKeyword( "FORWARD" );
    $list18 = ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), T ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "arg1Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), makeSymbol(
                  "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol(
                      "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg2Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol(
                          "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg3Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "arg4Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "arg4Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) ),
                  makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) ), makeSymbol( "ALL-GENLS" ),
                      makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg6Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ),
                          makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg6Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol(
                              "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ),
                                  NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argsQuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argsGenl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "resultIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "resultGenl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ),
                  makeSymbol( "ALL-GENL-PREDS" ), makeSymbol( "GENL-PRED?" ), makeSymbol( "MIN-PREDICATES" ), T ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeSymbol(
                      "ALL-GENL-PREDS" ), makeSymbol( "GENL-PRED?" ), makeSymbol( "MIN-PREDICATES" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeSymbol(
                          "ALL-GENL-MTS" ), makeSymbol( "GENL-MT?" ), makeSymbol( "MIN-MTS" ), T ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ),
                              makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol(
                                  "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg3QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol(
                                      "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg4QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol(
                                          "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg5QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol(
                                              "GENL?" ), makeSymbol( "MIN-COLS" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg6QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ),
                                                  makeSymbol( "GENL?" ), makeSymbol( "MIN-COLS" ), NIL )
    } );
    $list19 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegions" ) ), makeSymbol( "ALL-GEOGRAPHICAL-SUPER-REGIONS" ), makeSymbol(
        "GEOGRAPHICAL-SUPER-REGION?" ), NIL, T ) );
    $sym20$CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO = makeSymbol( "CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO" );
    $sym21$_CACHED_KBS_ADDITIONAL_REDUNDANT_DEFINITIONAL_INFO_CACHING_STATE_ = makeSymbol( "*CACHED-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO-CACHING-STATE*" );
    $int22$2000 = makeInteger( 2000 );
    $list23 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ALL-FUNC" ), makeSymbol( "TEST-FUNC" ), makeSymbol( "MIN-FUNC" ), makeSymbol( "REFLEXIVE" ) );
    $sym24$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const25$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw26$TRUE = makeKeyword( "TRUE" );
    $const27$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list28 = ConsesLow.list( makeSymbol( "ADD-MT" ), makeSymbol( "ADD-VALUE" ) );
    $const29$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const30$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $str31$__Additions__ = makeString( "~%Additions :" );
    $str32$_____S_in__S = makeString( "~%  ~S in ~S" );
    $sym33$KBS_FORT_P = makeSymbol( "KBS-FORT-P" );
    $str34$__Cycle___S__S__S = makeString( "~%Cycle: ~S ~S ~S" );
    $sym35$MIN_COLS = makeSymbol( "MIN-COLS" );
    $sym36$MIN_PREDICATES = makeSymbol( "MIN-PREDICATES" );
    $sym37$MIN_MTS = makeSymbol( "MIN-MTS" );
    $str38$__Given___S__Minimal___S = makeString( "~%Given: ~S~%Minimal: ~S" );
    $sym39$FORT_P = makeSymbol( "FORT-P" );
    $const40$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const41$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym42$_KBS_BROADER_TERM_GAFS_ = makeSymbol( "*KBS-BROADER-TERM-GAFS*" );
    $str43$Computing___broaderTerm_additions = makeString( "Computing #$broaderTerm additions for " );
    $str44$_terms = makeString( " terms" );
    $str45$Spent__A_computing_spec_preds_and = makeString( "Spent ~A computing spec-preds and inverses.~%" );
    $sym46$KBS_BROADER_TERM_CANDIDATE_FORT_ = makeSymbol( "KBS-BROADER-TERM-CANDIDATE-FORT?" );
    $sym47$SKOLEM_NART_ = makeSymbol( "SKOLEM-NART?" );
    $str48$Computing___broaderTerm_additions = makeString( "Computing #$broaderTerm additions" );
    $const49$broaderTerm_NonTaxonomic = constant_handles.reader_make_constant_shell( makeString( "broaderTerm-NonTaxonomic" ) );
    $sym50$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const51$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list52 = ConsesLow.cons( makeSymbol( "BROADER-TERM" ), makeSymbol( "SUPPORTS" ) );
    $kw53$DEFAULT = makeKeyword( "DEFAULT" );
    $sym54$SUPPORT_STRENGTH = makeSymbol( "SUPPORT-STRENGTH" );
    $kw55$MONOTONIC = makeKeyword( "MONOTONIC" );
    $const56$broaderTerm = constant_handles.reader_make_constant_shell( makeString( "broaderTerm" ) );
    $sym57$BROADER_TERM_PREDS = makeSymbol( "BROADER-TERM-PREDS" );
    $sym58$_BROADER_TERM_PREDS_CACHING_STATE_ = makeSymbol( "*BROADER-TERM-PREDS-CACHING-STATE*" );
    $str59$___broaderTerm_assertions = makeString( " #$broaderTerm assertions" );
    $str60$Adding_some___broaderTerm_asserti = makeString( "Adding some #$broaderTerm assertions" );
    $list61 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "STRENGTH" ) );
    $kw62$STRENGTH = makeKeyword( "STRENGTH" );
    $str63$Computing_additional_redundant_as = makeString( "Computing additional redundant asserted arguments" );
    $sym64$KBS_DEDUCTION_P = makeSymbol( "KBS-DEDUCTION-P" );
    $str65$__Addition__ = makeString( "~%Addition :" );
    $str66$_additional_redundant_asserted_ar = makeString( " additional redundant asserted arguments" );
    $const67$geographicalSubRegions = constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegions" ) );
  }
}
/*
 * 
 * Total time: 1034 ms
 * 
 */