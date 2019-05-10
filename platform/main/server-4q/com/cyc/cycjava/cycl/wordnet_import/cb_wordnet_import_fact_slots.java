package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_import_fact_slots
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_fact_slots";
  public static final String myFingerPrint = "871912a33e067ea8a8498cdbc835401df8458056fbf280248f87831171472729";
  private static final SubLString $str0$WordNet_Import___Actor_Fact_Slots;
  private static final SubLSymbol $sym1$WNI_REVIEW_FACT_SLOTS;
  private static final SubLSymbol $kw2$HTML_HANDLER;
  private static final SubLSymbol $sym3$LISTP;
  private static final SubLSymbol $sym4$WNI_REVIEW_FACT_SLOTS_INPUT;
  private static final SubLString $str5$Review_the_Role_and_Fact_Predicat;
  private static final SubLString $str6$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str7$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw8$UNINITIALIZED;
  private static final SubLSymbol $kw9$CB_CYC;
  private static final SubLSymbol $kw10$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw11$SHA1;
  private static final SubLString $str12$yui_skin_sam;
  private static final SubLString $str13$reloadFrameButton;
  private static final SubLString $str14$button;
  private static final SubLString $str15$reload;
  private static final SubLString $str16$Refresh_Frames;
  private static final SubLString $str17$post;
  private static final SubLString $str18$wni_review_fact_slots_input;
  private static final SubLString $str19$cb_wordnet_import_fact_slots;
  private static final SubLString $str20$Back;
  private static final SubLString $str21$back;
  private static final SubLString $str22$Submit;
  private static final SubLString $str23$submit;
  private static final SubLString $str24$Next;
  private static final SubLString $str25$next;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-fact-slots.lisp", position = 1025L)
  public static SubLObject wni_review_fact_slots(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str0$WordNet_Import___Actor_Fact_Slots );
    }
    else
    {
      wni_review_fact_slots_internal();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-fact-slots.lisp", position = 1646L)
  public static SubLObject wni_review_fact_slots_input(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-fact-slots.lisp", position = 2026L)
  public static SubLObject wni_review_fact_slots_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str5$Review_the_Role_and_Fact_Predicat;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
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
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
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
            html_utilities.html_markup( $str17$post );
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
              html_utilities.html_hidden_input( $str18$wni_review_fact_slots_input, T, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_help_preamble( $str19$cb_wordnet_import_fact_slots, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str20$Back, $str21$back, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str22$Submit, $str23$submit, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str24$Next, $str25$next, UNPROVIDED );
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

  public static SubLObject declare_cb_wordnet_import_fact_slots_file()
  {
    SubLFiles.declareFunction( me, "wni_review_fact_slots", "WNI-REVIEW-FACT-SLOTS", 0, 1, false );
    SubLFiles.declareFunction( me, "wni_review_fact_slots_input", "WNI-REVIEW-FACT-SLOTS-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_review_fact_slots_internal", "WNI-REVIEW-FACT-SLOTS-INTERNAL", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_wordnet_import_fact_slots_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_wordnet_import_fact_slots_file()
  {
    html_macros.note_cgi_handler_function( $sym1$WNI_REVIEW_FACT_SLOTS, $kw2$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym4$WNI_REVIEW_FACT_SLOTS_INPUT, $kw2$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_wordnet_import_fact_slots_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_wordnet_import_fact_slots_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_wordnet_import_fact_slots_file();
  }
  static
  {
    me = new cb_wordnet_import_fact_slots();
    $str0$WordNet_Import___Actor_Fact_Slots = makeString( "WordNet Import - Actor/Fact Slots" );
    $sym1$WNI_REVIEW_FACT_SLOTS = makeSymbol( "WNI-REVIEW-FACT-SLOTS" );
    $kw2$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym3$LISTP = makeSymbol( "LISTP" );
    $sym4$WNI_REVIEW_FACT_SLOTS_INPUT = makeSymbol( "WNI-REVIEW-FACT-SLOTS-INPUT" );
    $str5$Review_the_Role_and_Fact_Predicat = makeString( "Review the Role and Fact Predicates for the Term" );
    $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str7$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw8$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw9$CB_CYC = makeKeyword( "CB-CYC" );
    $kw10$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw11$SHA1 = makeKeyword( "SHA1" );
    $str12$yui_skin_sam = makeString( "yui-skin-sam" );
    $str13$reloadFrameButton = makeString( "reloadFrameButton" );
    $str14$button = makeString( "button" );
    $str15$reload = makeString( "reload" );
    $str16$Refresh_Frames = makeString( "Refresh Frames" );
    $str17$post = makeString( "post" );
    $str18$wni_review_fact_slots_input = makeString( "wni-review-fact-slots-input" );
    $str19$cb_wordnet_import_fact_slots = makeString( "cb-wordnet-import-fact-slots" );
    $str20$Back = makeString( "Back" );
    $str21$back = makeString( "back" );
    $str22$Submit = makeString( "Submit" );
    $str23$submit = makeString( "submit" );
    $str24$Next = makeString( "Next" );
    $str25$next = makeString( "next" );
  }
}
/*
 * 
 * Total time: 126 ms
 * 
 */