package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_ke_reviewer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_ke_reviewer";
  public static final String myFingerPrint = "080ee9c85ce1692d1bf8340ee3b6d126663d4c7a8ec020204bff12bf8ddfd86a";
  private static final SubLList $list0;
  private static final SubLString $str1$Could_not_determine_an_assertion_;
  private static final SubLSymbol $sym2$CB_KE_EDIT;
  private static final SubLSymbol $kw3$HTML_HANDLER;
  private static final SubLSymbol $sym4$CB_KEC_EDIT;
  private static final SubLSymbol $sym5$CB_CONSTANT_REVIEW_HANDLER;
  private static final SubLSymbol $sym6$CB_ASSERTION_REVIEW_HANDLER;
  private static final SubLSymbol $sym7$CB_TAF;
  private static final SubLSymbol $sym8$CB_TCF;
  private static final SubLString $str9$Approve_Constant;
  private static final SubLString $str10$Email_Comments;
  private static final SubLString $str11$Assert_Comments;
  private static final SubLString $str12$comment;
  private static final SubLObject $const13$myReviewer;
  private static final SubLObject $const14$BookkeepingMt;
  private static final SubLSymbol $kw15$MONOTONIC;
  private static final SubLSymbol $kw16$BACKWARD;
  private static final SubLObject $const17$cyclistNotes;
  private static final SubLSymbol $kw18$DEFAULT;
  private static final SubLSymbol $kw19$FORWARD;
  private static final SubLString $str20$Approved_Constant;
  private static final SubLSymbol $kw21$CB_CONSTANT_REVIEW;
  private static final SubLString $str22$cb_constant_review_html;
  private static final SubLString $str23$post;
  private static final SubLString $str24$cb_constant_review_handler;
  private static final SubLSymbol $kw25$SELF;
  private static final SubLString $str26$Review_the_Cyc_Constant;
  private static final SubLString $str27$Cancel;
  private static final SubLString $str28$Current_Values;
  private static final SubLString $str29$Submit_Values;
  private static final SubLString $str30$Cyc_Constant__A__ID____A;
  private static final SubLString $str31$Approve_the_Constant_for_Addition;
  private static final SubLString $str32$Copy_the_Comment_Field_to_myCreat;
  private static final SubLString $str33$Assert_the_Comments_as_a___cyclis;
  private static final SubLInteger $int34$80;
  private static final SubLString $str35$virtual;
  private static final SubLString $str36$The_requested_term_is_not_availab;
  private static final SubLString $str37$cb_assertion_review_handler;
  private static final SubLString $str38$cb_assertion_review;
  private static final SubLString $str39$Review_the_Cyc_Assertion;
  private static final SubLString $str40$Cyc_Assertion__ID____A;
  private static final SubLString $str41$Meta_Assertions__;
  private static final SubLString $str42$Approve_Assertion;
  private static final SubLString $str43$Approve_the_Assertion_for_Additio;
  private static final SubLObject $const44$ist;
  private static final SubLString $str45$;
  private static final SubLString $str46$Approved_Assertion;
  private static final SubLSymbol $kw47$KE_REVIEW;
  private static final SubLString $str48$ke_review_html;
  private static final SubLString $str49$Knowledge_Entry_Review_Tools;
  private static final SubLString $str50$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str51$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw52$UNINITIALIZED;
  private static final SubLSymbol $kw53$CB_CYC;
  private static final SubLSymbol $kw54$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw55$SHA1;
  private static final SubLString $str56$yui_skin_sam;
  private static final SubLString $str57$reloadFrameButton;
  private static final SubLString $str58$button;
  private static final SubLString $str59$reload;
  private static final SubLString $str60$Refresh_Frames;
  private static final SubLString $str61$ke_review_handler;
  private static final SubLString $str62$Knowledge_Entry_Review_Options;
  private static final SubLString $str63$Change_KE_Options;
  private static final SubLString $str64$General_KE_Review_Options;
  private static final SubLString $str65$Allow_KE_Review_Tags_and_links;
  private static final SubLSymbol $kw66$LEFT;
  private static final SubLSymbol $kw67$TOP;
  private static final SubLSymbol $sym68$ASSERTION_REVIEW;
  private static final SubLString $str69$enable_ke_assertion_review;
  private static final SubLString $str70$on_assertions;
  private static final SubLSymbol $sym71$CONSTANT_REVIEW;
  private static final SubLString $str72$enable_ke_constant_review;
  private static final SubLString $str73$on_constants;
  private static final SubLString $str74$Enter_in_the_start_date_;
  private static final SubLString $str75$Tools_will_be_limited_to_constant;
  private static final SubLString $str76$cb_show_start;
  private static final SubLString $str77$Enter_in_the_ending_date_;
  private static final SubLString $str78$cb_show_end;
  private static final SubLString $str79$Enter_the_cyclist_s__to_examine__;
  private static final SubLString $str80$Tools_will_be_limited_to_constant;
  private static final SubLSymbol $sym81$CB_PROMPT_CYCLISTS;
  private static final SubLString $str82$foo;
  private static final SubLString $str83$narrow_filter_too;
  private static final SubLString $str84$Also_narrow_our_viewpoint_to_incl;
  private static final SubLSymbol $sym85$KE_REVIEW;
  private static final SubLSymbol $sym86$MYCREATOR;
  private static final SubLSymbol $sym87$KE_REVIEW_HANDLER;
  private static final SubLString $str88$KE_Review_Options_have_been_modif;

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 590L)
  public static SubLObject cb_ke_edit(final SubLObject args)
  {
    SubLObject assertion_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list0 );
    assertion_id = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( assertion_id );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        return cb_utilities.cb_error( $str1$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cb_ke_edit_internal( assertion );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list0 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 945L)
  public static SubLObject cb_kec_edit(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_ke_term_internal( args.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1040L)
  public static SubLObject cb_constant_review_handler(final SubLObject args)
  {
    return cb_constant_review( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1131L)
  public static SubLObject cb_assertion_review_handler(final SubLObject args)
  {
    return cb_assertion_review( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1224L)
  public static SubLObject cb_taf(final SubLObject args)
  {
    return cb_ke_edit( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1298L)
  public static SubLObject cb_tcf(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_kec_edit( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1370L)
  public static SubLObject cb_constant_review(final SubLObject args)
  {
    final SubLObject approve_p = html_utilities.html_extract_input( $str9$Approve_Constant, args );
    final SubLObject fort = ( NIL != approve_p ) ? cb_utilities.cb_guess_fort( approve_p, UNPROVIDED ) : NIL;
    final SubLObject email_p = html_utilities.html_extract_input( $str10$Email_Comments, args );
    final SubLObject assert_p = html_utilities.html_extract_input( $str11$Assert_Comments, args );
    final SubLObject comment_text = html_utilities.html_extract_input( $str12$comment, args );
    if( NIL != approve_p )
    {
      ke.ke_assert( ConsesLow.list( $const13$myReviewer, fort, operation_communication.the_cyclist() ), $const14$BookkeepingMt, $kw15$MONOTONIC, $kw16$BACKWARD );
    }
    if( NIL != comment_text && NIL != approve_p && NIL != assert_p )
    {
      ke.ke_assert( ConsesLow.list( $const17$cyclistNotes, fort, comment_text ), mt_vars.$default_comment_mt$.getGlobalValue(), $kw18$DEFAULT, $kw19$FORWARD );
    }
    cb_assertion_editor.cb_note_edit_change( $str20$Approved_Constant, T, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 2252L)
  public static SubLObject cb_ke_term_internal(final SubLObject fort_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    ke.ensure_cyclist_ok();
    final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
    if( NIL != forts.fort_p( fort ) )
    {
      if( NIL != nart_handles.nart_p( fort ) )
      {
        cb_tools.cb_add_to_nat_history( fort );
      }
      else
      {
        cb_tools.cb_add_to_constant_history( fort );
      }
      final SubLObject identifier = cb_utilities.cb_fort_identifier( fort );
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
      html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str23$post );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
      final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_macros.$within_html_form$.bind( T, thread );
        html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
        html_utilities.html_hidden_input( $str24$cb_constant_review_handler, T, UNPROVIDED );
        cb_utilities.cb_help_preamble( $kw21$CB_CONSTANT_REVIEW, $kw25$SELF, $str26$Review_the_Cyc_Constant );
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_back_button( $kw25$SELF, $str27$Cancel );
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_reset_input( $str28$Current_Values );
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_submit_input( $str29$Submit_Values, UNPROVIDED, UNPROVIDED );
        html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str30$Cyc_Constant__A__ID____A, fort, identifier );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
        html_utilities.html_newline( TWO_INTEGER );
        html_utilities.html_checkbox_input( $str9$Approve_Constant, fort, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        html_utilities.html_princ( $str31$Approve_the_Constant_for_Addition );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_checkbox_input( $str10$Email_Comments, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        html_utilities.html_princ( $str32$Copy_the_Comment_Field_to_myCreat );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_checkbox_input( $str11$Assert_Comments, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        html_utilities.html_princ( $str33$Assert_the_Comments_as_a___cyclis );
        html_utilities.html_newline( TWO_INTEGER );
        if( NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue( thread ) )
        {
          html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$comment );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $int34$80 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( TWENTY_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str35$virtual );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
          }
          html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$comment );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $int34$80 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( TWENTY_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
          }
          html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
        }
        html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
      }
      finally
      {
        html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
        html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    }
    else
    {
      cb_utilities.cb_error( $str36$The_requested_term_is_not_availab, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 4641L)
  public static SubLObject cb_ke_edit_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    ke.ensure_cyclist_ok();
    cb_tools.cb_add_to_assertion_history( assertion );
    final SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str23$post );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str37$cb_assertion_review_handler, T, UNPROVIDED );
      cb_utilities.cb_help_preamble( $str38$cb_assertion_review, $kw25$SELF, $str39$Review_the_Cyc_Assertion );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_back_button( $kw25$SELF, $str27$Cancel );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_reset_input( $str28$Current_Values );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_submit_input( $str29$Submit_Values, UNPROVIDED, UNPROVIDED );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str40$Cyc_Assertion__ID____A, id );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      cb_assertion_browser.cb_assertion_info( assertion );
      cb_assertion_browser.cb_assertion_diagnostics( assertion );
      if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
      {
        html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str41$Meta_Assertions__ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
        html_utilities.html_newline( TWO_INTEGER );
        cb_browser.cb_c_total_internal( assertion );
      }
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_checkbox_input( $str42$Approve_Assertion, id, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str43$Approve_the_Assertion_for_Additio );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_checkbox_input( $str10$Email_Comments, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str32$Copy_the_Comment_Field_to_myCreat );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_checkbox_input( $str11$Assert_Comments, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str33$Assert_the_Comments_as_a___cyclis );
      html_utilities.html_newline( TWO_INTEGER );
      if( NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str12$comment );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $int34$80 );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( TWENTY_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str35$virtual );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
        }
        html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str12$comment );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $int34$80 );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( TWENTY_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
      }
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 7214L)
  public static SubLObject cb_assertion_review(final SubLObject args)
  {
    final SubLObject approve_p = html_utilities.html_extract_input( $str42$Approve_Assertion, args );
    final SubLObject assertion = ( NIL != approve_p ) ? assertion_handles.find_assertion_by_id( reader.parse_integer( approve_p, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) : NIL;
    final SubLObject formula = ( NIL != assertion ) ? uncanonicalizer.assertion_el_formula( assertion ) : NIL;
    final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
    final SubLObject assert_p = html_utilities.html_extract_input( $str11$Assert_Comments, args );
    final SubLObject comment_text = html_utilities.html_extract_input( $str12$comment, args );
    if( NIL != approve_p && NIL != assertion )
    {
      ke.ke_assert( ConsesLow.list( $const13$myReviewer, ConsesLow.list( $const44$ist, assertion_mt, formula ), operation_communication.the_cyclist() ), $const14$BookkeepingMt, $kw15$MONOTONIC, $kw19$FORWARD );
    }
    if( NIL != comment_text && !comment_text.equal( $str45$ ) && NIL != approve_p && NIL != assert_p )
    {
      ke.ke_assert( ConsesLow.list( $const17$cyclistNotes, formula, comment_text ), assertion_mt, $kw18$DEFAULT, $kw19$FORWARD );
    }
    cb_assertion_editor.cb_note_edit_change( $str46$Approved_Assertion, T, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 8307L)
  public static SubLObject constant_needs_review_p(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject time = bookkeeping_store.creation_time( constant, UNPROVIDED );
    return makeBoolean( NIL == kb_accessors.reviewer( constant, UNPROVIDED ) && NIL != time && cb_parameters.$cb_ke_review_start_date$.getDynamicValue( thread ).numLE( time ) && time.numLE(
        cb_parameters.$cb_ke_review_end_date$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 8577L)
  public static SubLObject assertion_needs_review_p(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == cb_adornments.bookkeeping_assertion_p( assertion ) && NIL == subl_promotions.memberP( cb_utilities.assertion_marker( assertion ), cb_parameters.$cb_nonreviewable_assertion_markers$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) && NIL != assertions_high.asserted_when( assertion ) && cb_parameters.$cb_ke_review_start_date$.getDynamicValue( thread ).numLE( assertions_high.asserted_when(
            assertion ) ) && assertions_high.asserted_when( assertion ).numLE( cb_parameters.$cb_ke_review_end_date$.getDynamicValue( thread ) ) && NIL == cb_utilities.asserted_reviewer( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 9457L)
  public static SubLObject ke_review(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str49$Knowledge_Entry_Review_Tools;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str50$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str51$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw52$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw53$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw54$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str56$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str57$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str58$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str59$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str60$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
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
            html_utilities.html_markup( $str23$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str61$ke_review_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw47$KE_REVIEW, $kw25$SELF, $str62$Knowledge_Entry_Review_Options );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_back_button( $kw25$SELF, $str27$Cancel );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_reset_input( $str28$Current_Values );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str63$Change_KE_Options, UNPROVIDED, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str64$General_KE_Review_Options );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str65$Allow_KE_Review_Tags_and_links );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw66$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw67$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    final SubLObject assertion_adornment_active_p = cb_adornments.active_adornment_p( $sym68$ASSERTION_REVIEW );
                    html_utilities.html_checkbox_input( $str69$enable_ke_assertion_review, T, assertion_adornment_active_p, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_indent( TWO_INTEGER );
                    html_utilities.html_princ( $str70$on_assertions );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw66$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw67$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    final SubLObject constant_adornment_active_p = cb_adornments.active_adornment_p( $sym71$CONSTANT_REVIEW );
                    html_utilities.html_checkbox_input( $str72$enable_ke_constant_review, T, constant_adornment_active_p, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_indent( TWO_INTEGER );
                    html_utilities.html_princ( $str73$on_constants );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str74$Enter_in_the_start_date_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str75$Tools_will_be_limited_to_constant );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.prompt_for_simple_date( cb_parameters.$cb_ke_review_start_date$.getDynamicValue( thread ), $str76$cb_show_start );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str77$Enter_in_the_ending_date_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.prompt_for_simple_date( cb_parameters.$cb_ke_review_end_date$.getDynamicValue( thread ), $str78$cb_show_end );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str79$Enter_the_cyclist_s__to_examine__ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str80$Tools_will_be_limited_to_constant );
              Functions.apply( Symbols.symbol_function( $sym81$CB_PROMPT_CYCLISTS ), $str82$foo, cb_parameters.cb_ke_review_creators() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_checkbox_input( $str83$narrow_filter_too, NIL, makeBoolean( NIL != cb_parameters.cb_ke_review_creators() && NIL == cb_viewpoint.cb_mycreator_filter() ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
              html_utilities.html_princ( $str84$Also_narrow_our_viewpoint_to_incl );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$6, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$5, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 12324L)
  public static SubLObject ke_review_handler(final SubLObject args)
  {
    final SubLObject enable_assertions = html_utilities.html_extract_input( $str69$enable_ke_assertion_review, args );
    final SubLObject enable_constants = html_utilities.html_extract_input( $str72$enable_ke_constant_review, args );
    cb_adornments.enable_adornment( $sym68$ASSERTION_REVIEW, enable_assertions );
    cb_adornments.enable_adornment( $sym71$CONSTANT_REVIEW, enable_constants );
    cb_parameters.$cb_ke_review_start_date$.setDynamicValue( cb_utilities.read_args_for_simple_date( $str76$cb_show_start, args ) );
    cb_parameters.$cb_ke_review_end_date$.setDynamicValue( cb_utilities.read_args_for_simple_date( $str78$cb_show_end, args ) );
    cb_parameters.set_cb_ke_review_creators( cb_viewpoint.cb_get_cyclists( $str82$foo, args ) );
    if( NIL != cb_parameters.cb_ke_review_creators() && NIL != html_utilities.html_extract_input( $str83$narrow_filter_too, args ) )
    {
      cb_viewpoint.enable_filter( $sym86$MYCREATOR, UNPROVIDED );
      cb_viewpoint.set_cb_mycreator_filter( cb_parameters.cb_ke_review_creators() );
    }
    cb_ke_review_result_page();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 13146L)
  public static SubLObject cb_ke_review_result_page()
  {
    cb_utilities.cb_message_page_with_history( $str88$KE_Review_Options_have_been_modif, T );
    return NIL;
  }

  public static SubLObject declare_cb_ke_reviewer_file()
  {
    SubLFiles.declareFunction( me, "cb_ke_edit", "CB-KE-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kec_edit", "CB-KEC-EDIT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_constant_review_handler", "CB-CONSTANT-REVIEW-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_review_handler", "CB-ASSERTION-REVIEW-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_taf", "CB-TAF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_tcf", "CB-TCF", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_constant_review", "CB-CONSTANT-REVIEW", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_ke_term_internal", "CB-KE-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_ke_edit_internal", "CB-KE-EDIT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_review", "CB-ASSERTION-REVIEW", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_needs_review_p", "CONSTANT-NEEDS-REVIEW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_needs_review_p", "ASSERTION-NEEDS-REVIEW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_review", "KE-REVIEW", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_review_handler", "KE-REVIEW-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_ke_review_result_page", "CB-KE-REVIEW-RESULT-PAGE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_ke_reviewer_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_ke_reviewer_file()
  {
    html_macros.note_cgi_handler_function( $sym2$CB_KE_EDIT, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym4$CB_KEC_EDIT, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym5$CB_CONSTANT_REVIEW_HANDLER, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym6$CB_ASSERTION_REVIEW_HANDLER, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym7$CB_TAF, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym8$CB_TCF, $kw3$HTML_HANDLER );
    Hashtables.sethash( $kw21$CB_CONSTANT_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str22$cb_constant_review_html, NIL ) );
    Hashtables.sethash( $kw47$KE_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str48$ke_review_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym85$KE_REVIEW, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym87$KE_REVIEW_HANDLER, $kw3$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_ke_reviewer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_ke_reviewer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_ke_reviewer_file();
  }
  static
  {
    me = new cb_ke_reviewer();
    $list0 = ConsesLow.list( makeSymbol( "ASSERTION-ID" ) );
    $str1$Could_not_determine_an_assertion_ = makeString( "Could not determine an assertion from ~a" );
    $sym2$CB_KE_EDIT = makeSymbol( "CB-KE-EDIT" );
    $kw3$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym4$CB_KEC_EDIT = makeSymbol( "CB-KEC-EDIT" );
    $sym5$CB_CONSTANT_REVIEW_HANDLER = makeSymbol( "CB-CONSTANT-REVIEW-HANDLER" );
    $sym6$CB_ASSERTION_REVIEW_HANDLER = makeSymbol( "CB-ASSERTION-REVIEW-HANDLER" );
    $sym7$CB_TAF = makeSymbol( "CB-TAF" );
    $sym8$CB_TCF = makeSymbol( "CB-TCF" );
    $str9$Approve_Constant = makeString( "Approve-Constant" );
    $str10$Email_Comments = makeString( "Email-Comments" );
    $str11$Assert_Comments = makeString( "Assert-Comments" );
    $str12$comment = makeString( "comment" );
    $const13$myReviewer = constant_handles.reader_make_constant_shell( makeString( "myReviewer" ) );
    $const14$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $kw15$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw16$BACKWARD = makeKeyword( "BACKWARD" );
    $const17$cyclistNotes = constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) );
    $kw18$DEFAULT = makeKeyword( "DEFAULT" );
    $kw19$FORWARD = makeKeyword( "FORWARD" );
    $str20$Approved_Constant = makeString( "Approved Constant" );
    $kw21$CB_CONSTANT_REVIEW = makeKeyword( "CB-CONSTANT-REVIEW" );
    $str22$cb_constant_review_html = makeString( "cb-constant-review.html" );
    $str23$post = makeString( "post" );
    $str24$cb_constant_review_handler = makeString( "cb-constant-review-handler" );
    $kw25$SELF = makeKeyword( "SELF" );
    $str26$Review_the_Cyc_Constant = makeString( "Review the Cyc Constant" );
    $str27$Cancel = makeString( "Cancel" );
    $str28$Current_Values = makeString( "Current Values" );
    $str29$Submit_Values = makeString( "Submit Values" );
    $str30$Cyc_Constant__A__ID____A = makeString( "Cyc Constant ~A, ID: #~A" );
    $str31$Approve_the_Constant_for_Addition = makeString( "Approve the Constant for Addition to Cyc" );
    $str32$Copy_the_Comment_Field_to_myCreat = makeString( "Copy the Comment Field to myCreator via Email" );
    $str33$Assert_the_Comments_as_a___cyclis = makeString( "Assert the Comments as a #$cyclistNotes" );
    $int34$80 = makeInteger( 80 );
    $str35$virtual = makeString( "virtual" );
    $str36$The_requested_term_is_not_availab = makeString( "The requested term is not available." );
    $str37$cb_assertion_review_handler = makeString( "cb-assertion-review-handler" );
    $str38$cb_assertion_review = makeString( "cb-assertion-review" );
    $str39$Review_the_Cyc_Assertion = makeString( "Review the Cyc Assertion" );
    $str40$Cyc_Assertion__ID____A = makeString( "Cyc Assertion  ID: #~A" );
    $str41$Meta_Assertions__ = makeString( "Meta Assertions :" );
    $str42$Approve_Assertion = makeString( "Approve-Assertion" );
    $str43$Approve_the_Assertion_for_Additio = makeString( "Approve the Assertion for Addition to Cyc" );
    $const44$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $str45$ = makeString( "" );
    $str46$Approved_Assertion = makeString( "Approved Assertion" );
    $kw47$KE_REVIEW = makeKeyword( "KE-REVIEW" );
    $str48$ke_review_html = makeString( "ke-review.html" );
    $str49$Knowledge_Entry_Review_Tools = makeString( "Knowledge Entry Review Tools" );
    $str50$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str51$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw52$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw53$CB_CYC = makeKeyword( "CB-CYC" );
    $kw54$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw55$SHA1 = makeKeyword( "SHA1" );
    $str56$yui_skin_sam = makeString( "yui-skin-sam" );
    $str57$reloadFrameButton = makeString( "reloadFrameButton" );
    $str58$button = makeString( "button" );
    $str59$reload = makeString( "reload" );
    $str60$Refresh_Frames = makeString( "Refresh Frames" );
    $str61$ke_review_handler = makeString( "ke-review-handler" );
    $str62$Knowledge_Entry_Review_Options = makeString( "Knowledge Entry Review Options" );
    $str63$Change_KE_Options = makeString( "Change KE Options" );
    $str64$General_KE_Review_Options = makeString( "General KE Review Options" );
    $str65$Allow_KE_Review_Tags_and_links = makeString( "Allow KE Review Tags and links" );
    $kw66$LEFT = makeKeyword( "LEFT" );
    $kw67$TOP = makeKeyword( "TOP" );
    $sym68$ASSERTION_REVIEW = makeSymbol( "ASSERTION-REVIEW" );
    $str69$enable_ke_assertion_review = makeString( "enable-ke-assertion-review" );
    $str70$on_assertions = makeString( "on assertions" );
    $sym71$CONSTANT_REVIEW = makeSymbol( "CONSTANT-REVIEW" );
    $str72$enable_ke_constant_review = makeString( "enable-ke-constant-review" );
    $str73$on_constants = makeString( "on constants" );
    $str74$Enter_in_the_start_date_ = makeString( "Enter in the start date:" );
    $str75$Tools_will_be_limited_to_constant = makeString( "Tools will be limited to constants and assertions for which #$myCreationTime is between the start and end date." );
    $str76$cb_show_start = makeString( "cb-show-start" );
    $str77$Enter_in_the_ending_date_ = makeString( "Enter in the ending date:" );
    $str78$cb_show_end = makeString( "cb-show-end" );
    $str79$Enter_the_cyclist_s__to_examine__ = makeString( "Enter the cyclist(s) to examine (blank indicates to examine ALL cyclists):" );
    $str80$Tools_will_be_limited_to_constant = makeString( "Tools will be limited to constants and assertions which the below cyclists are the #$myCreator for." );
    $sym81$CB_PROMPT_CYCLISTS = makeSymbol( "CB-PROMPT-CYCLISTS" );
    $str82$foo = makeString( "foo" );
    $str83$narrow_filter_too = makeString( "narrow-filter-too" );
    $str84$Also_narrow_our_viewpoint_to_incl = makeString( "Also narrow our viewpoint to include only these cyclists as the myCreator" );
    $sym85$KE_REVIEW = makeSymbol( "KE-REVIEW" );
    $sym86$MYCREATOR = makeSymbol( "MYCREATOR" );
    $sym87$KE_REVIEW_HANDLER = makeSymbol( "KE-REVIEW-HANDLER" );
    $str88$KE_Review_Options_have_been_modif = makeString( "KE Review Options have been modified" );
  }
}
/*
 * 
 * Total time: 290 ms
 * 
 */