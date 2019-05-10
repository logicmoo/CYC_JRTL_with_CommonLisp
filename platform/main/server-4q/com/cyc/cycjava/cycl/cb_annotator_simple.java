package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.leader.parse_tree_gui;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_annotator_simple
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_annotator_simple";
  public static final String myFingerPrint = "b3bf7c7d71158b8f23a0596b165fa4eaa01b4aeaa9db1a1b7bd45c64b8b72599";
  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 803L)
  public static SubLSymbol $simple_annotator_text$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 951L)
  public static SubLSymbol $simple_annotator_url$;
  private static final SubLString $str0$;
  private static final SubLSymbol $sym1$_SIMPLE_ANNOTATOR_TEXT_;
  private static final SubLSymbol $sym2$_SIMPLE_ANNOTATOR_URL_;
  private static final SubLString $str3$Text_Annotator;
  private static final SubLString $str4$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str5$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw6$UNINITIALIZED;
  private static final SubLSymbol $kw7$CB_CYC;
  private static final SubLSymbol $kw8$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw9$SHA1;
  private static final SubLString $str10$yui_skin_sam;
  private static final SubLString $str11$reloadFrameButton;
  private static final SubLString $str12$button;
  private static final SubLString $str13$reload;
  private static final SubLString $str14$Refresh_Frames;
  private static final SubLString $str15$post;
  private static final SubLString $str16$cb_handle_simple_annotator;
  private static final SubLString $str17$Text__;
  private static final SubLString $str18$text;
  private static final SubLInteger $int19$80;
  private static final SubLString $str20$Annotate_Text;
  private static final SubLString $str21$annotate_text;
  private static final SubLString $str22$URL__;
  private static final SubLString $str23$url;
  private static final SubLString $str24$Annotate_URL;
  private static final SubLString $str25$annotate_url;
  private static final SubLSymbol $sym26$CB_SIMPLE_ANNOTATOR;
  private static final SubLSymbol $kw27$HTML_HANDLER;
  private static final SubLString $str28$Annotation_Results;
  private static final SubLSymbol $sym29$CB_HANDLE_SIMPLE_ANNOTATOR;
  private static final SubLString $str30$_p_Original_Sentence___S_br_;
  private static final SubLList $list31;
  private static final SubLString $str32$_A_;
  private static final SubLString $str33$_;
  private static final SubLString $str34$_A;
  private static final SubLString $str35$___A;
  private static final SubLString $str36$__;
  private static final SubLSymbol $sym37$CYCLIFY;
  private static final SubLString $str38$_br__sentence_cycl__br_;
  private static final SubLString $str39$_A_br_;
  private static final SubLString $str40$_br___sentence_cycl__br_;
  private static final SubLString $str41$Annot;
  private static final SubLSymbol $kw42$MAIN;
  private static final SubLString $str43$cb_simple_annotator;
  private static final SubLSymbol $kw44$SIMPLE_ANNOTATOR;
  private static final SubLSymbol $sym45$CB_LINK_SIMPLE_ANNOTATOR;
  private static final SubLString $str46$Simple_Text_Annotator;

  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 1040L)
  public static SubLObject cb_simple_annotator(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str3$Text_Annotator;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str4$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str5$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw6$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw7$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw8$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str10$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str11$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str14$Refresh_Frames );
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
            html_utilities.html_markup( $str15$post );
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
              html_utilities.html_hidden_input( $str16$cb_handle_simple_annotator, T, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str17$Text__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_script_utilities.html_clear_input_button( $str18$text, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str18$text );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int19$80 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TEN_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_submit_input( $str20$Annotate_Text, $str21$annotate_text, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str22$URL__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_script_utilities.html_clear_input_button( $str23$url, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_text_input( $str23$url, $simple_annotator_url$.getDynamicValue( thread ), $int19$80 );
              html_utilities.html_submit_input( $str24$Annotate_URL, $str25$annotate_url, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 1852L)
  public static SubLObject cb_handle_simple_annotator(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject text = html_utilities.html_extract_input( $str18$text, args );
    final SubLObject url = html_utilities.html_extract_input( $str23$url, args );
    final SubLObject annotate_urlP = html_utilities.html_extract_input( $str25$annotate_url, args );
    final SubLObject sentence_annotations = ( NIL != annotate_urlP ) ? annotate_simple_url( url ) : annotate_simple_text( text );
    final SubLObject title_var = $str28$Annotation_Results;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str4$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str5$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw6$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw7$CB_CYC );
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
          html_utilities.html_markup( $str10$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str11$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str14$Refresh_Frames );
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
              SubLObject cdolist_list_var = sentence_annotations;
              SubLObject sentence = NIL;
              sentence = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cb_utilities.cb_form( sentence, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
              }
              html_utilities.html_newline( UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 2365L)
  public static SubLObject annotate_simple_text(final SubLObject text)
  {
    final SubLObject sentences = document.sentencify_string( text );
    final SubLObject sentence_count = Sequences.length( sentences );
    final SubLObject ged = parse_tree_gui.new_gui_enabled_document( sentence_count, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject list_var = NIL;
    SubLObject sentence = NIL;
    SubLObject n = NIL;
    list_var = sentences;
    sentence = list_var.first();
    for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), sentence = list_var.first(), n = Numbers.add( ONE_INTEGER, n ) )
    {
      parse_tree_gui.add_sentence_to_ged( ged, sentence, n );
    }
    SubLObject n2;
    SubLObject sentence_result;
    SubLObject stream;
    SubLObject ges;
    SubLObject cdolist_list_var;
    SubLObject leaf;
    SubLObject current;
    SubLObject datum;
    SubLObject string;
    SubLObject cycls;
    SubLObject arg3;
    SubLObject cdolist_list_var_$12;
    SubLObject cycl;
    SubLObject tree;
    SubLObject parses;
    SubLObject cdolist_list_var2;
    SubLObject parse;
    SubLObject _prev_bind_0;
    SubLObject _values;
    for( n2 = NIL, n2 = ZERO_INTEGER; n2.numL( sentence_count ); n2 = Numbers.add( n2, ONE_INTEGER ) )
    {
      sentence_result = NIL;
      stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        ges = Vectors.aref( parse_tree_gui.ged_sentences( ged ), n2 );
        PrintLow.format( stream, $str30$_p_Original_Sentence___S_br_, ConsesLow.nth( n2, sentences ) );
        cdolist_list_var = parse_tree_gui.get_ges_annotated_leaves( ges );
        leaf = NIL;
        leaf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          datum = ( current = leaf );
          string = NIL;
          cycls = NIL;
          arg3 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
          string = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
          cycls = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
          arg3 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            PrintLow.format( stream, $str32$_A_, string );
            if( NIL != cycls )
            {
              PrintLow.format( stream, $str33$_ );
              PrintLow.format( stream, $str34$_A, cycls.first() );
              cdolist_list_var_$12 = cycls.rest();
              cycl = NIL;
              cycl = cdolist_list_var_$12.first();
              while ( NIL != cdolist_list_var_$12)
              {
                PrintLow.format( stream, $str35$___A, cycl );
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                cycl = cdolist_list_var_$12.first();
              }
              PrintLow.format( stream, $str36$__ );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          leaf = cdolist_list_var.first();
        }
        tree = parse_tree_gui.ges_current_parse_tree( ges );
        parses = methods.funcall_instance_method_with_0_args( tree, $sym37$CYCLIFY );
        PrintLow.format( stream, $str38$_br__sentence_cycl__br_ );
        cdolist_list_var2 = parses;
        parse = NIL;
        parse = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          PrintLow.format( stream, $str39$_A_br_, parse );
          cdolist_list_var2 = cdolist_list_var2.rest();
          parse = cdolist_list_var2.first();
        }
        PrintLow.format( stream, $str40$_br___sentence_cycl__br_ );
        sentence_result = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      result = ConsesLow.cons( sentence_result, result );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 3523L)
  public static SubLObject annotate_simple_url(final SubLObject url)
  {
    return annotate_simple_text( html_utilities.url_to_text( url ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-annotator-simple.lisp", position = 3616L)
  public static SubLObject cb_link_simple_annotator(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str41$Annot;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw42$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str43$cb_simple_annotator );
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

  public static SubLObject declare_cb_annotator_simple_file()
  {
    SubLFiles.declareFunction( me, "cb_simple_annotator", "CB-SIMPLE-ANNOTATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_simple_annotator", "CB-HANDLE-SIMPLE-ANNOTATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "annotate_simple_text", "ANNOTATE-SIMPLE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "annotate_simple_url", "ANNOTATE-SIMPLE-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_simple_annotator", "CB-LINK-SIMPLE-ANNOTATOR", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_cb_annotator_simple_file()
  {
    $simple_annotator_text$ = SubLFiles.defparameter( "*SIMPLE-ANNOTATOR-TEXT*", $str0$ );
    $simple_annotator_url$ = SubLFiles.defparameter( "*SIMPLE-ANNOTATOR-URL*", $str0$ );
    return NIL;
  }

  public static SubLObject setup_cb_annotator_simple_file()
  {
    utilities_macros.register_html_state_variable( $sym1$_SIMPLE_ANNOTATOR_TEXT_ );
    utilities_macros.register_html_state_variable( $sym2$_SIMPLE_ANNOTATOR_URL_ );
    html_macros.note_cgi_handler_function( $sym26$CB_SIMPLE_ANNOTATOR, $kw27$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym29$CB_HANDLE_SIMPLE_ANNOTATOR, $kw27$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw44$SIMPLE_ANNOTATOR, $sym45$CB_LINK_SIMPLE_ANNOTATOR, ONE_INTEGER );
    cb_utilities.declare_deprecated_cb_tool( $kw44$SIMPLE_ANNOTATOR, $str3$Text_Annotator, $str41$Annot, $str46$Simple_Text_Annotator );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_annotator_simple_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_annotator_simple_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_annotator_simple_file();
  }
  static
  {
    me = new cb_annotator_simple();
    $simple_annotator_text$ = null;
    $simple_annotator_url$ = null;
    $str0$ = makeString( "" );
    $sym1$_SIMPLE_ANNOTATOR_TEXT_ = makeSymbol( "*SIMPLE-ANNOTATOR-TEXT*" );
    $sym2$_SIMPLE_ANNOTATOR_URL_ = makeSymbol( "*SIMPLE-ANNOTATOR-URL*" );
    $str3$Text_Annotator = makeString( "Text Annotator" );
    $str4$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str5$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw6$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw7$CB_CYC = makeKeyword( "CB-CYC" );
    $kw8$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw9$SHA1 = makeKeyword( "SHA1" );
    $str10$yui_skin_sam = makeString( "yui-skin-sam" );
    $str11$reloadFrameButton = makeString( "reloadFrameButton" );
    $str12$button = makeString( "button" );
    $str13$reload = makeString( "reload" );
    $str14$Refresh_Frames = makeString( "Refresh Frames" );
    $str15$post = makeString( "post" );
    $str16$cb_handle_simple_annotator = makeString( "cb-handle-simple-annotator" );
    $str17$Text__ = makeString( "Text: " );
    $str18$text = makeString( "text" );
    $int19$80 = makeInteger( 80 );
    $str20$Annotate_Text = makeString( "Annotate Text" );
    $str21$annotate_text = makeString( "annotate_text" );
    $str22$URL__ = makeString( "URL: " );
    $str23$url = makeString( "url" );
    $str24$Annotate_URL = makeString( "Annotate URL" );
    $str25$annotate_url = makeString( "annotate_url" );
    $sym26$CB_SIMPLE_ANNOTATOR = makeSymbol( "CB-SIMPLE-ANNOTATOR" );
    $kw27$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str28$Annotation_Results = makeString( "Annotation Results" );
    $sym29$CB_HANDLE_SIMPLE_ANNOTATOR = makeSymbol( "CB-HANDLE-SIMPLE-ANNOTATOR" );
    $str30$_p_Original_Sentence___S_br_ = makeString( "<p>Original Sentence: ~S<br>" );
    $list31 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "CYCLS" ), makeSymbol( "ARG3" ) );
    $str32$_A_ = makeString( "~A " );
    $str33$_ = makeString( "{" );
    $str34$_A = makeString( "~A" );
    $str35$___A = makeString( ", ~A" );
    $str36$__ = makeString( "} " );
    $sym37$CYCLIFY = makeSymbol( "CYCLIFY" );
    $str38$_br__sentence_cycl__br_ = makeString( "<br><sentence_cycl><br>" );
    $str39$_A_br_ = makeString( "~A<br>" );
    $str40$_br___sentence_cycl__br_ = makeString( "<br></sentence_cycl><br>" );
    $str41$Annot = makeString( "Annot" );
    $kw42$MAIN = makeKeyword( "MAIN" );
    $str43$cb_simple_annotator = makeString( "cb-simple-annotator" );
    $kw44$SIMPLE_ANNOTATOR = makeKeyword( "SIMPLE-ANNOTATOR" );
    $sym45$CB_LINK_SIMPLE_ANNOTATOR = makeSymbol( "CB-LINK-SIMPLE-ANNOTATOR" );
    $str46$Simple_Text_Annotator = makeString( "Simple Text Annotator" );
  }
}
/*
 * 
 * Total time: 291 ms
 * 
 */