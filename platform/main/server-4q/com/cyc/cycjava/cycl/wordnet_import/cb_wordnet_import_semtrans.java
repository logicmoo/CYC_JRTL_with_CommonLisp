package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_import_semtrans
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_semtrans";
  public static final String myFingerPrint = "c03fcda28a618219ba2bdbdf0790c984241ab2a6eb264390ab54d9f15ed9cdaa";
  private static final SubLString $str0$WordNet_Import___Review_Semtrans;
  private static final SubLSymbol $sym1$WNI_REVIEW_SEMTRANS;
  private static final SubLSymbol $kw2$HTML_HANDLER;
  private static final SubLSymbol $sym3$LISTP;
  private static final SubLSymbol $sym4$WNI_REVIEW_SEMTRANS_INPUT;
  private static final SubLString $str5$_WordNet___Review_Semtrans_;
  private static final SubLSymbol $kw6$MAIN;
  private static final SubLString $str7$wni_review_semtrans;
  private static final SubLSymbol $kw8$WNI_REVIEW_SEMATRANS;
  private static final SubLSymbol $sym9$CB_LINK_WNI_REVIEW_SEMATRANS;
  private static final SubLString $str10$Review_the_Semantic_Translations_;
  private static final SubLString $str11$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str12$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw13$UNINITIALIZED;
  private static final SubLSymbol $kw14$CB_CYC;
  private static final SubLSymbol $kw15$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw16$SHA1;
  private static final SubLString $str17$yui_skin_sam;
  private static final SubLString $str18$reloadFrameButton;
  private static final SubLString $str19$button;
  private static final SubLString $str20$reload;
  private static final SubLString $str21$Refresh_Frames;
  private static final SubLString $str22$post;
  private static final SubLString $str23$wni_review_semtrans_input;
  private static final SubLString $str24$cb_wordnet_import_semtrans;
  private static final SubLString $str25$Back;
  private static final SubLString $str26$back;
  private static final SubLString $str27$Next;
  private static final SubLString $str28$next;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-semtrans.lisp", position = 1004L)
  public static SubLObject wni_review_semtrans(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str0$WordNet_Import___Review_Semtrans );
    }
    else
    {
      wni_review_semtrans_internal();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-semtrans.lisp", position = 1679L)
  public static SubLObject wni_review_semtrans_input(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-semtrans.lisp", position = 1910L)
  public static SubLObject cb_link_wni_review_sematrans(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str5$_WordNet___Review_Semtrans_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw6$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str7$wni_review_semtrans );
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

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-semtrans.lisp", position = 2496L)
  public static SubLObject wni_review_semtrans_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str10$Review_the_Semantic_Translations_;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str11$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str12$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw13$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw14$CB_CYC );
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
          html_utilities.html_markup( $str17$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str18$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str19$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str20$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str21$Refresh_Frames );
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
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str22$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str23$wni_review_semtrans_input, T, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_help_preamble( $str24$cb_wordnet_import_semtrans, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str25$Back, $str26$back, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str27$Next, $str28$next, UNPROVIDED );
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

  public static SubLObject declare_cb_wordnet_import_semtrans_file()
  {
    SubLFiles.declareFunction( me, "wni_review_semtrans", "WNI-REVIEW-SEMTRANS", 0, 1, false );
    SubLFiles.declareFunction( me, "wni_review_semtrans_input", "WNI-REVIEW-SEMTRANS-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_wni_review_sematrans", "CB-LINK-WNI-REVIEW-SEMATRANS", 0, 1, false );
    SubLFiles.declareFunction( me, "wni_review_semtrans_internal", "WNI-REVIEW-SEMTRANS-INTERNAL", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_wordnet_import_semtrans_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_wordnet_import_semtrans_file()
  {
    html_macros.note_cgi_handler_function( $sym1$WNI_REVIEW_SEMTRANS, $kw2$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym4$WNI_REVIEW_SEMTRANS_INPUT, $kw2$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw8$WNI_REVIEW_SEMATRANS, $sym9$CB_LINK_WNI_REVIEW_SEMATRANS, ONE_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_wordnet_import_semtrans_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_wordnet_import_semtrans_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_wordnet_import_semtrans_file();
  }
  static
  {
    me = new cb_wordnet_import_semtrans();
    $str0$WordNet_Import___Review_Semtrans = makeString( "WordNet Import - Review Semtrans" );
    $sym1$WNI_REVIEW_SEMTRANS = makeSymbol( "WNI-REVIEW-SEMTRANS" );
    $kw2$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym3$LISTP = makeSymbol( "LISTP" );
    $sym4$WNI_REVIEW_SEMTRANS_INPUT = makeSymbol( "WNI-REVIEW-SEMTRANS-INPUT" );
    $str5$_WordNet___Review_Semtrans_ = makeString( "[WordNet - Review Semtrans]" );
    $kw6$MAIN = makeKeyword( "MAIN" );
    $str7$wni_review_semtrans = makeString( "wni-review-semtrans" );
    $kw8$WNI_REVIEW_SEMATRANS = makeKeyword( "WNI-REVIEW-SEMATRANS" );
    $sym9$CB_LINK_WNI_REVIEW_SEMATRANS = makeSymbol( "CB-LINK-WNI-REVIEW-SEMATRANS" );
    $str10$Review_the_Semantic_Translations_ = makeString( "Review the Semantic Translations for the Term" );
    $str11$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str12$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw13$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw14$CB_CYC = makeKeyword( "CB-CYC" );
    $kw15$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw16$SHA1 = makeKeyword( "SHA1" );
    $str17$yui_skin_sam = makeString( "yui-skin-sam" );
    $str18$reloadFrameButton = makeString( "reloadFrameButton" );
    $str19$button = makeString( "button" );
    $str20$reload = makeString( "reload" );
    $str21$Refresh_Frames = makeString( "Refresh Frames" );
    $str22$post = makeString( "post" );
    $str23$wni_review_semtrans_input = makeString( "wni-review-semtrans-input" );
    $str24$cb_wordnet_import_semtrans = makeString( "cb-wordnet-import-semtrans" );
    $str25$Back = makeString( "Back" );
    $str26$back = makeString( "back" );
    $str27$Next = makeString( "Next" );
    $str28$next = makeString( "next" );
  }
}
/*
 * 
 * Total time: 139 ms
 * 
 */