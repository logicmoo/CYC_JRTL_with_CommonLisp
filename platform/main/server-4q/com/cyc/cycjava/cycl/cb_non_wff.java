package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_non_wff
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_non_wff";
  public static final String myFingerPrint = "15ddc7b4d13336b4f325d45ce8fd5f36d27fedcb7b7c6e980119e1c83a62d3d0";
  private static final SubLSymbol $kw0$NONWFF;
  private static final SubLString $str1$nonwff_gif;
  private static final SubLString $str2$_Not_WFF__;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$NON_WFF;
  private static final SubLSymbol $sym5$ADORNMENT_NAME;
  private static final SubLSymbol $sym6$CB_ENW;
  private static final SubLSymbol $kw7$HTML_HANDLER;
  private static final SubLList $list8;
  private static final SubLString $str9$Could_not_determine_an_assertion_;
  private static final SubLSymbol $sym10$CB_EXPLAIN_NON_WFF;
  private static final SubLList $list11;
  private static final SubLString $str12$_a_does_not_specify_an_assertion;
  private static final SubLSymbol $sym13$CB_WFF_ASSERTION;
  private static final SubLString $str14$_WFF_Check_;
  private static final SubLSymbol $kw15$MAIN;
  private static final SubLString $str16$cb_wff_assertion__a;
  private static final SubLSymbol $kw17$WFF_ASSERTION;
  private static final SubLSymbol $sym18$CB_LINK_WFF_ASSERTION;
  private static final SubLSymbol $sym19$WFF_CHECK_ASSERTIONS_VIA_TL;
  private static final SubLSymbol $sym20$QUOTE;
  private static final SubLSymbol $kw21$CB_WFF_CHECK_FORMULA;
  private static final SubLString $str22$cb_wff_check_formula_html;
  private static final SubLString $str23$Assertion_not_Well_Formed;
  private static final SubLString $str24$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str25$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw26$UNINITIALIZED;
  private static final SubLSymbol $kw27$CB_CYC;
  private static final SubLSymbol $kw28$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw29$SHA1;
  private static final SubLString $str30$yui_skin_sam;
  private static final SubLString $str31$reloadFrameButton;
  private static final SubLString $str32$button;
  private static final SubLString $str33$reload;
  private static final SubLString $str34$Refresh_Frames;
  private static final SubLSymbol $kw35$SELF;
  private static final SubLString $str36$Back;
  private static final SubLString $str37$Assertion___;
  private static final SubLString $str38$Explanation___;
  private static final SubLString $str39$Assertion_is_Well_Formed;
  private static final SubLString $str40$WFF_Status___;
  private static final SubLString $str41$OK;

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 1278L)
  public static SubLObject cb_enw(final SubLObject args)
  {
    return cb_explain_non_wff( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 1349L)
  public static SubLObject cb_explain_non_wff(final SubLObject args)
  {
    SubLObject assertion_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list8 );
    assertion_id = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list8 );
      return NIL;
    }
    final SubLObject assertion = cb_utilities.cb_guess_assertion( assertion_id );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      return cb_utilities.cb_error( $str9$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cb_explain_non_wff_int( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 1662L)
  public static SubLObject cb_explain_non_wff_int(final SubLObject assertion)
  {
    cb_tools.cb_add_to_assertion_history( assertion );
    return cb_wff_check_assertion_int( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 1804L)
  public static SubLObject cb_wff_assertion(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = args;
    SubLObject id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        cb_utilities.cb_error( $str12$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      cb_wff_check_assertion_int( assertion );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 2163L)
  public static SubLObject cb_link_wff_assertion(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str14$_WFF_Check_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw15$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str16$cb_wff_assertion__a, assertion_handles.assertion_id( assertion ) );
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
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 2412L)
  public static SubLObject cb_wff_check_assertion_int(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence = canon_tl.assertion_tl_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    thread.resetMultipleValues();
    final SubLObject wffP = ke.ke_eval_now( canon_tl.tl_encapsulate( ConsesLow.list( $sym19$WFF_CHECK_ASSERTIONS_VIA_TL, ConsesLow.list( $sym20$QUOTE, sentence ), ConsesLow.list( $sym20$QUOTE, mt ) ) ) );
    final SubLObject fi_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != wffP )
    {
      return cb_wff_check_assertion_ok( assertion );
    }
    if( NIL != fi_error )
    {
      return cb_utilities.cb_show_fi_error( fi_error );
    }
    return cb_explain_why_assertion_not_wff( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 2942L)
  public static SubLObject cb_explain_why_assertion_not_wff(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence = uncanonicalizer.assertion_el_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject title_var = $str23$Assertion_not_Well_Formed;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str24$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str25$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw26$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw27$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
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
          html_utilities.html_markup( $str30$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str31$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str32$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str33$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str34$Refresh_Frames );
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
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw21$CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED );
              cb_utilities.cb_back_button( $kw35$SELF, $str36$Back );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str37$Assertion___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_show_assertion_readably( assertion, T, T );
              html_macros.verify_not_within_html_pre();
              html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
              final SubLObject _prev_bind_0_$6 = html_macros.$within_html_pre$.currentBinding( thread );
              try
              {
                html_macros.$within_html_pre$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str38$Explanation___ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_princ_doc_string( wff.explanation_of_why_not_wff( sentence, mt, UNPROVIDED ), UNPROVIDED );
              }
              finally
              {
                html_macros.$within_html_pre$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-non-wff.lisp", position = 3543L)
  public static SubLObject cb_wff_check_assertion_ok(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str39$Assertion_is_Well_Formed;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str24$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str25$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw26$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw27$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str30$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str31$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str32$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str33$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str34$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
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
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw21$CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED );
              cb_utilities.cb_back_button( $kw35$SELF, $str36$Back );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str37$Assertion___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_show_assertion_readably( assertion, T, T );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str40$WFF_Status___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( $str41$OK );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$8, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$7, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_cb_non_wff_file()
  {
    SubLFiles.declareFunction( me, "cb_enw", "CB-ENW", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_explain_non_wff", "CB-EXPLAIN-NON-WFF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_explain_non_wff_int", "CB-EXPLAIN-NON-WFF-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_assertion", "CB-WFF-ASSERTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_wff_assertion", "CB-LINK-WFF-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_wff_check_assertion_int", "CB-WFF-CHECK-ASSERTION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_explain_why_assertion_not_wff", "CB-EXPLAIN-WHY-ASSERTION-NOT-WFF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_check_assertion_ok", "CB-WFF-CHECK-ASSERTION-OK", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_non_wff_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_non_wff_file()
  {
    Hashtables.sethash( $kw0$NONWFF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str1$nonwff_gif, $str2$_Not_WFF__ ) );
    final SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
    final SubLObject v_new = cb_adornments.make_adornment( $list3 );
    cb_adornments._csetf_adornment_name( v_new, $sym4$NON_WFF );
    cb_adornments.$cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym4$NON_WFF, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym5$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    html_macros.note_cgi_handler_function( $sym6$CB_ENW, $kw7$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym10$CB_EXPLAIN_NON_WFF, $kw7$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym13$CB_WFF_ASSERTION, $kw7$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw17$WFF_ASSERTION, $sym18$CB_LINK_WFF_ASSERTION, TWO_INTEGER );
    Hashtables.sethash( $kw21$CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str22$cb_wff_check_formula_html, NIL ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_non_wff_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_non_wff_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_non_wff_file();
  }
  static
  {
    me = new cb_non_wff();
    $kw0$NONWFF = makeKeyword( "NONWFF" );
    $str1$nonwff_gif = makeString( "nonwff.gif" );
    $str2$_Not_WFF__ = makeString( "[Not WFF!]" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ASSERTION" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeKeyword( "NONWFF" ), makeKeyword( "IMAGE-ALT" ), makeString(
        "[Not WFF!]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "NON-WFF-CACHED-P" ), makeKeyword( "HANDLER" ), makeString( "cb-enw" ), makeKeyword( "COMMENT" ), makeString(
            "Links to an explanation of why this assertion is not WFF." )
    } );
    $sym4$NON_WFF = makeSymbol( "NON-WFF" );
    $sym5$ADORNMENT_NAME = makeSymbol( "ADORNMENT-NAME" );
    $sym6$CB_ENW = makeSymbol( "CB-ENW" );
    $kw7$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $list8 = ConsesLow.list( makeSymbol( "ASSERTION-ID" ) );
    $str9$Could_not_determine_an_assertion_ = makeString( "Could not determine an assertion from ~a" );
    $sym10$CB_EXPLAIN_NON_WFF = makeSymbol( "CB-EXPLAIN-NON-WFF" );
    $list11 = ConsesLow.list( makeSymbol( "ID" ) );
    $str12$_a_does_not_specify_an_assertion = makeString( "~a does not specify an assertion" );
    $sym13$CB_WFF_ASSERTION = makeSymbol( "CB-WFF-ASSERTION" );
    $str14$_WFF_Check_ = makeString( "[WFF Check]" );
    $kw15$MAIN = makeKeyword( "MAIN" );
    $str16$cb_wff_assertion__a = makeString( "cb-wff-assertion&~a" );
    $kw17$WFF_ASSERTION = makeKeyword( "WFF-ASSERTION" );
    $sym18$CB_LINK_WFF_ASSERTION = makeSymbol( "CB-LINK-WFF-ASSERTION" );
    $sym19$WFF_CHECK_ASSERTIONS_VIA_TL = makeSymbol( "WFF-CHECK-ASSERTIONS-VIA-TL" );
    $sym20$QUOTE = makeSymbol( "QUOTE" );
    $kw21$CB_WFF_CHECK_FORMULA = makeKeyword( "CB-WFF-CHECK-FORMULA" );
    $str22$cb_wff_check_formula_html = makeString( "cb-wff-check-formula.html" );
    $str23$Assertion_not_Well_Formed = makeString( "Assertion not Well-Formed" );
    $str24$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str25$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw26$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw27$CB_CYC = makeKeyword( "CB-CYC" );
    $kw28$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw29$SHA1 = makeKeyword( "SHA1" );
    $str30$yui_skin_sam = makeString( "yui-skin-sam" );
    $str31$reloadFrameButton = makeString( "reloadFrameButton" );
    $str32$button = makeString( "button" );
    $str33$reload = makeString( "reload" );
    $str34$Refresh_Frames = makeString( "Refresh Frames" );
    $kw35$SELF = makeKeyword( "SELF" );
    $str36$Back = makeString( "Back" );
    $str37$Assertion___ = makeString( "Assertion : " );
    $str38$Explanation___ = makeString( "Explanation : " );
    $str39$Assertion_is_Well_Formed = makeString( "Assertion is Well-Formed" );
    $str40$WFF_Status___ = makeString( "WFF-Status : " );
    $str41$OK = makeString( "OK" );
  }
}
/*
 * 
 * Total time: 137 ms
 * 
 */