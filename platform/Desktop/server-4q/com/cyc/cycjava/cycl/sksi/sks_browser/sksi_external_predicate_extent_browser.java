package com.cyc.cycjava.cycl.sksi.sks_browser;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.cb_viewpoint;
import com.cyc.cycjava.cycl.cb_browser;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_external_predicate_extent_browser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_predicate_extent_browser";
  public static final String myFingerPrint = "b54d05b5a19ae377a78b9b96406769872e1d692454d7fa907783733dc8a7ba59";
  private static final SubLSymbol $sym0$WITH_PPH_MEMOIZATION;
  private static final SubLSymbol $kw1$CONTENT;
  private static final SubLString $str2$sksi_external_predicate_extent__A;
  private static final SubLString $str3$External_Predicate_Extent;
  private static final SubLList $list4;
  private static final SubLString $str5$__a;
  private static final SubLString $str6$___a_;
  private static final SubLString $str7$__N_A_;
  private static final SubLSymbol $kw8$SKSI_EXTERNAL_PREDICATE_EXTENT;
  private static final SubLSymbol $sym9$CB_LINK_SKSI_EXTERNAL_PREDICATE_EXTENT;
  private static final SubLList $list10;
  private static final SubLString $str11$Could_not_determine_an_index_hook;
  private static final SubLString $str12$Could_not_determine_a_term_from__;
  private static final SubLString $str13$Predicate_extent_index_for_;
  private static final SubLString $str14$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str15$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw16$UNINITIALIZED;
  private static final SubLSymbol $kw17$CB_CYC;
  private static final SubLString $str18$yui_skin_sam;
  private static final SubLString $str19$reloadFrameButton;
  private static final SubLString $str20$button;
  private static final SubLString $str21$reload;
  private static final SubLString $str22$Refresh;
  private static final SubLString $str23$reloadCurrentFrame__reloadFrameBu;
  private static final SubLSymbol $sym24$SKSI_EXTERNAL_PREDICATE_EXTENT;
  private static final SubLSymbol $kw25$HTML_HANDLER;
  private static final SubLString $str26$Predicate;
  private static final SubLString $str27$_Extent__External___;
  private static final SubLSymbol $kw28$NEW;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-predicate-extent-browser.lisp", position = 938L)
  public static SubLObject with_sksi_pph_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym0$WITH_PPH_MEMOIZATION, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-predicate-extent-browser.lisp", position = 1143L)
  public static SubLObject cb_link_sksi_external_predicate_extent(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$CONTENT );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str2$sksi_external_predicate_extent__A, cb_utilities.cb_index_identifier( predicate ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str3$External_Predicate_Extent );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    SubLObject cdolist_list_var;
    final SubLObject mt_count_pairs = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_mt_count_pairs( sksi_sks_predicate_indexing.sksi_supported_predicate_mt_count_pairs_for_predicate( predicate,
        UNPROVIDED ) );
    SubLObject mt_count_pair = NIL;
    mt_count_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = mt_count_pair;
      SubLObject mt = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
      count = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP( count ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          final SubLObject frame_name_var2 = cb_utilities.cb_frame_name( $kw1$CONTENT );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          cb_parameters.cyc_cgi_url_int();
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str2$sksi_external_predicate_extent__A, cb_utilities.cb_index_identifier( predicate ) );
          if( NIL != mt )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str5$__a, cb_utilities.cb_fort_identifier( mt ) );
          }
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var2 )
          {
            html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var2 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != mt )
            {
              html_utilities.html_princ( cb_utilities.cb_fort_display_string( mt ) );
            }
            else
            {
              html_utilities.html_princ( $str3$External_Predicate_Extent );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          if( count.isInteger() )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str6$___a_, count );
          }
          else
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str7$__N_A_ );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_count_pair = cdolist_list_var.first();
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-predicate-extent-browser.lisp", position = 2370L)
  public static SubLObject sksi_external_predicate_extent(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list10 );
    index_spec = args.first();
    SubLObject current = args.rest();
    final SubLObject mt_spec = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list10 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject predicate = cb_utilities.cb_guess_index( index_spec );
      SubLObject mt = NIL;
      if( NIL == cb_utilities.cb_index_hook_p( predicate ) )
      {
        return cb_utilities.cb_error( $str11$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != mt_spec )
      {
        mt = cb_utilities.cb_guess_fort( mt_spec, UNPROVIDED );
        if( NIL == forts.fort_p( mt ) )
        {
          return cb_utilities.cb_error( $str12$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      final SubLObject title_var;
      final SubLObject title = title_var = Sequences.cconcatenate( $str13$Predicate_extent_index_for_, format_nil.format_nil_s_no_copy( predicate ) );
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str14$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str15$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw16$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw17$CB_CYC );
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          dhtml_macros.html_basic_cb_scripts();
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str18$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str19$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str20$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str21$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str22$Refresh );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str23$reloadCurrentFrame__reloadFrameBu );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              cb_browser.cb_c_term_header( predicate );
              html_utilities.html_newline( TWO_INTEGER );
              sksi_external_predicate_extent_internal( predicate, mt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$2, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$1, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list10 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-predicate-extent-browser.lisp", position = 3101L)
  public static SubLObject sksi_external_predicate_extent_internal(final SubLObject predicate, final SubLObject mt, SubLObject external_termP, SubLObject visible_mt)
  {
    if( external_termP == UNPROVIDED )
    {
      external_termP = NIL;
    }
    if( visible_mt == UNPROVIDED )
    {
      visible_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_utilities.$assertion_filter_hook$.currentBinding( thread );
    try
    {
      cb_utilities.$assertion_filter_hook$.bind( cb_viewpoint.cb_calc_filter_hooks(), thread );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      if( NIL != external_termP )
      {
        html_utilities.html_princ( $str26$Predicate );
      }
      else
      {
        cb_browser.cb_c_type( predicate );
      }
      html_utilities.html_princ( $str27$_Extent__External___ );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject _prev_bind_0_$5 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
      try
      {
        pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0_$6 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
        try
        {
          pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
          final SubLObject reuseP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          try
          {
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$7 = pph_macros.$pph_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
              final SubLObject new_or_reused = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$8 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
              try
              {
                pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    if( NIL != mt )
                    {
                      sksi_external_predicate_extent_rec_mt( predicate, mt, external_termP );
                    }
                    else
                    {
                      sksi_external_predicate_extent_rec( predicate, external_termP, visible_mt );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
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
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$9, thread );
                }
              }
              finally
              {
                pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$8, thread );
              }
              if( new_or_reused == $kw28$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
              {
                memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$7, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL == reuseP )
              {
                pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
              }
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
          pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$6, thread );
        }
      }
      finally
      {
        pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      cb_utilities.$assertion_filter_hook$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-predicate-extent-browser.lisp", position = 3648L)
  public static SubLObject sksi_external_predicate_extent_rec(final SubLObject predicate, SubLObject external_termP, SubLObject visible_mt)
  {
    if( external_termP == UNPROVIDED )
    {
      external_termP = NIL;
    }
    if( visible_mt == UNPROVIDED )
    {
      visible_mt = NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject mts = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_mts_for_display( sksi_sks_predicate_indexing.sksi_supported_predicate_mt_list_for_pred( ( NIL != external_termP ) ? cycl_utilities
        .formula_arg1( predicate, UNPROVIDED ) : predicate, visible_mt ) );
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_external_predicate_extent_rec_mt( predicate, mt, external_termP );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-predicate-extent-browser.lisp", position = 4020L)
  public static SubLObject sksi_external_predicate_extent_rec_mt(final SubLObject predicate, final SubLObject mt, SubLObject external_termP)
  {
    if( external_termP == UNPROVIDED )
    {
      external_termP = NIL;
    }
    cb_browser.cb_c_mt_header( mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject query_form_module_list_pairs = sksi_sks_predicate_indexing.gather_query_form_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate_and_mt( ( NIL != external_termP )
        ? cycl_utilities.formula_arg1( predicate, UNPROVIDED )
        : predicate, mt );
    if( NIL != external_termP )
    {
      return sksi_external_browser_utilities.sksi_display_external_term_facts( predicate, ZERO_INTEGER, query_form_module_list_pairs, mt );
    }
    return sksi_external_browser_utilities.sksi_display_external_facts( query_form_module_list_pairs, mt );
  }

  public static SubLObject declare_sksi_external_predicate_extent_browser_file()
  {
    SubLFiles.declareMacro( me, "with_sksi_pph_memoization", "WITH-SKSI-PPH-MEMOIZATION" );
    SubLFiles.declareFunction( me, "cb_link_sksi_external_predicate_extent", "CB-LINK-SKSI-EXTERNAL-PREDICATE-EXTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_predicate_extent", "SKSI-EXTERNAL-PREDICATE-EXTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_predicate_extent_internal", "SKSI-EXTERNAL-PREDICATE-EXTENT-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "sksi_external_predicate_extent_rec", "SKSI-EXTERNAL-PREDICATE-EXTENT-REC", 1, 2, false );
    SubLFiles.declareFunction( me, "sksi_external_predicate_extent_rec_mt", "SKSI-EXTERNAL-PREDICATE-EXTENT-REC-MT", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_sksi_external_predicate_extent_browser_file()
  {
    return NIL;
  }

  public static SubLObject setup_sksi_external_predicate_extent_browser_file()
  {
    cb_utilities.setup_cb_link_method( $kw8$SKSI_EXTERNAL_PREDICATE_EXTENT, $sym9$CB_LINK_SKSI_EXTERNAL_PREDICATE_EXTENT, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym24$SKSI_EXTERNAL_PREDICATE_EXTENT, $kw25$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_external_predicate_extent_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_external_predicate_extent_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_external_predicate_extent_browser_file();
  }
  static
  {
    me = new sksi_external_predicate_extent_browser();
    $sym0$WITH_PPH_MEMOIZATION = makeSymbol( "WITH-PPH-MEMOIZATION" );
    $kw1$CONTENT = makeKeyword( "CONTENT" );
    $str2$sksi_external_predicate_extent__A = makeString( "sksi-external-predicate-extent&~A" );
    $str3$External_Predicate_Extent = makeString( "External Predicate Extent" );
    $list4 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "COUNT" ) );
    $str5$__a = makeString( "&~a" );
    $str6$___a_ = makeString( " (~a)" );
    $str7$__N_A_ = makeString( " (N/A)" );
    $kw8$SKSI_EXTERNAL_PREDICATE_EXTENT = makeKeyword( "SKSI-EXTERNAL-PREDICATE-EXTENT" );
    $sym9$CB_LINK_SKSI_EXTERNAL_PREDICATE_EXTENT = makeSymbol( "CB-LINK-SKSI-EXTERNAL-PREDICATE-EXTENT" );
    $list10 = ConsesLow.list( makeSymbol( "INDEX-SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-SPEC" ) );
    $str11$Could_not_determine_an_index_hook = makeString( "Could not determine an index-hook from ~a" );
    $str12$Could_not_determine_a_term_from__ = makeString( "Could not determine a term from ~a" );
    $str13$Predicate_extent_index_for_ = makeString( "Predicate extent index for " );
    $str14$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str15$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw16$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw17$CB_CYC = makeKeyword( "CB-CYC" );
    $str18$yui_skin_sam = makeString( "yui-skin-sam" );
    $str19$reloadFrameButton = makeString( "reloadFrameButton" );
    $str20$button = makeString( "button" );
    $str21$reload = makeString( "reload" );
    $str22$Refresh = makeString( "Refresh" );
    $str23$reloadCurrentFrame__reloadFrameBu = makeString( "reloadCurrentFrame('reloadFrameButton');" );
    $sym24$SKSI_EXTERNAL_PREDICATE_EXTENT = makeSymbol( "SKSI-EXTERNAL-PREDICATE-EXTENT" );
    $kw25$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str26$Predicate = makeString( "Predicate" );
    $str27$_Extent__External___ = makeString( " Extent (External) :" );
    $kw28$NEW = makeKeyword( "NEW" );
  }
}
/*
 * 
 * Total time: 149 ms
 * 
 */