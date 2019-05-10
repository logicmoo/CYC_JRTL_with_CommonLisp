package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_random_thoughts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_random_thoughts";
  public static final String myFingerPrint = "6a01f7c660586c6cc381d730523892c59ce5655047ca12a8ca2335896cf8f60b";
  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5062L)
  private static SubLSymbol $random_thought_cyclists$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5329L)
  private static SubLSymbol $random_thought_refresh_rate$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 6993L)
  private static SubLSymbol $cb_random_thoughts_evaluation_options$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 8574L)
  private static SubLSymbol $assert_random_thought_judgmentsP$;
  private static final SubLString $str0$_Random_Thought_;
  private static final SubLSymbol $kw1$MAIN;
  private static final SubLString $str2$cb_random_thoughts;
  private static final SubLSymbol $kw3$RANDOM_THOUGHT;
  private static final SubLSymbol $sym4$CB_LINK_RANDOM_THOUGHT;
  private static final SubLSymbol $sym5$CB_RANDOM_THOUGHTS;
  private static final SubLSymbol $kw6$HTML_HANDLER;
  private static final SubLObject $const7$Guest;
  private static final SubLString $str8$the_Random_Thought_Generator;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLString $str11$Random_Thoughts;
  private static final SubLString $str12$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str13$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw14$UNINITIALIZED;
  private static final SubLSymbol $kw15$CB_CYC;
  private static final SubLSymbol $kw16$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw17$SHA1;
  private static final SubLString $str18$yui_skin_sam;
  private static final SubLString $str19$reloadFrameButton;
  private static final SubLString $str20$button;
  private static final SubLString $str21$reload;
  private static final SubLString $str22$Refresh_Frames;
  private static final SubLString $str23$post;
  private static final SubLString $str24$cb_handle_random_thoughts;
  private static final SubLString $str25$term;
  private static final SubLString $str26$assertion_id;
  private static final SubLString $str27$CycL__;
  private static final SubLSymbol $kw28$NEW;
  private static final SubLString $str29$New_;
  private static final SubLSymbol $kw30$RELATED;
  private static final SubLString $str31$Related_;
  private static final SubLSymbol $kw32$SAME;
  private static final SubLString $str33$Same_;
  private static final SubLString $str34$;
  private static final SubLString $str35$Topic__;
  private static final SubLString $str36$New_Thought;
  private static final SubLString $str37$new_thought;
  private static final SubLSymbol $kw38$DARK_GRAY;
  private static final SubLString $str39$_I_have_shared__S_random_thoughts;
  private static final SubLString $str40$_I_have_thought_of__S_more_things;
  private static final SubLSymbol $kw41$UNKNOWN;
  private static final SubLSymbol $sym42$CB_HANDLE_RANDOM_THOUGHTS;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$CB_RANDOM_THOUGHT_FRAME;
  private static final SubLSymbol $kw46$TOPIC;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLString $str49$cb_handle_random_thought_frame;
  private static final SubLString $str50$cyclist;
  private static final SubLString $str51$paraphrase;
  private static final SubLString $str52$topic;
  private static final SubLString $str53$position__absolute__bottom__0pt;
  private static final SubLList $list54;
  private static final SubLString $str55$100_;
  private static final SubLString $str56$center;
  private static final SubLList $list57;
  private static final SubLString $str58$Skip;
  private static final SubLSymbol $kw59$CENTER;
  private static final SubLString $str60$right;
  private static final SubLString $str61$Your_evaluation__;
  private static final SubLString $str62$left;
  private static final SubLSymbol $kw63$RANDOM_THOUGHT_FRAME;
  private static final SubLString $str64$_New_Random_Thought_;
  private static final SubLSymbol $kw65$SELF;
  private static final SubLString $str66$cb_random_thought_frame__A__A;
  private static final SubLSymbol $sym67$CB_LINK_RANDOM_THOUGHT_FRAME;
  private static final SubLList $list68;
  private static final SubLObject $const69$CycRandomThoughtEvaluationTool;
  private static final SubLObject $const70$EvaluationOfByOnFn;
  private static final SubLObject $const71$evaluationInput;
  private static final SubLObject $const72$evaluationOfAs;
  private static final SubLObject $const73$EvaluatedSentencesFromRandomThoug;
  private static final SubLSymbol $sym74$CB_HANDLE_RANDOM_THOUGHT_FRAME;
  private static final SubLInteger $int75$3600;
  private static final SubLString $str76$cb_random_thought_frame_;
  private static final SubLString $str77$_;
  private static final SubLString $str78$random_thought;
  private static final SubLInteger $int79$75;
  private static final SubLSymbol $kw80$RIGHT;
  private static final SubLString $str81$no;

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 877L)
  public static SubLObject cb_link_random_thought(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$_Random_Thought_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str2$cb_random_thoughts );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 1218L)
  public static SubLObject cb_random_thoughts(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_random_thought_for_cyclist( operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 1347L)
  public static SubLObject cb_random_thought_for_cyclist(final SubLObject cyclist, SubLObject last_term, SubLObject last_assertion_id)
  {
    if( last_term == UNPROVIDED )
    {
      last_term = NIL;
    }
    if( last_assertion_id == UNPROVIDED )
    {
      last_assertion_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_utilities.kbeq( cyclist, $const7$Guest ) )
    {
      cyc_navigator_internals.guest_warn( $str8$the_Random_Thought_Generator );
      return NIL;
    }
    final SubLObject thought = random_thought_generator.next_random_thought_for_user( cyclist, $list9 );
    SubLObject current;
    final SubLObject datum = current = thought;
    SubLObject v_term = NIL;
    SubLObject assertion = NIL;
    SubLObject javalist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    javalist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject assertion_paraphrase = pph_utilities.pph_javalist_string( javalist );
      html_script_utilities.cb_hoverover_page_init();
      final SubLObject title_var = $str11$Random_Thoughts;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str12$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str13$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw14$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw15$CB_CYC );
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
                html_utilities.html_princ( $str22$Refresh_Frames );
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
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str24$cb_handle_random_thoughts, T, UNPROVIDED );
                html_utilities.html_hidden_input( $str25$term, cb_utilities.cb_fort_identifier( v_term ), UNPROVIDED );
                if( NIL != assertion )
                {
                  html_utilities.html_hidden_input( $str26$assertion_id, assertion_handles.assertion_id( assertion ), UNPROVIDED );
                }
                final SubLObject connection_to_last = cb_random_thought_connection_type( v_term, last_term, last_assertion_id );
                SubLObject hoverover_html = NIL;
                SubLObject stream = NIL;
                try
                {
                  stream = streams_high.make_private_string_output_stream();
                  final SubLObject _prev_bind_0_$6 = html_macros.$html_stream$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_stream$.bind( stream, thread );
                    html_utilities.html_princ( $str27$CycL__ );
                    cb_utilities.cb_form( v_term, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_stream$.rebind( _prev_bind_0_$6, thread );
                  }
                  hoverover_html = streams_high.get_output_stream_string( stream );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close( stream, UNPROVIDED );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                  }
                }
                cb_query.cb_princ_strong_with_explanation( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( ( connection_to_last == $kw28$NEW ) ? $str29$New_
                    : ( ( connection_to_last == $kw30$RELATED ) ? $str31$Related_ : ( ( connection_to_last == $kw32$SAME ) ? $str33$Same_ : $str34$ ) ) ), new SubLObject[]
                    { $str35$Topic__, format_nil.format_nil_s_no_copy( pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                } ), hoverover_html, NIL, NIL, T );
                html_utilities.html_newline( TWO_INTEGER );
                SubLObject hoverover_html2 = NIL;
                SubLObject stream2 = NIL;
                try
                {
                  stream2 = streams_high.make_private_string_output_stream();
                  final SubLObject _prev_bind_0_$8 = html_macros.$html_stream$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_stream$.bind( stream2, thread );
                    html_utilities.html_princ( $str27$CycL__ );
                    cb_utilities.cb_form( assertion, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_stream$.rebind( _prev_bind_0_$8, thread );
                  }
                  hoverover_html2 = streams_high.get_output_stream_string( stream2 );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    streams_high.close( stream2, UNPROVIDED );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                  }
                }
                html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
                cb_query.cb_princ_with_explanation( assertion_paraphrase, hoverover_html2, NIL, NIL, T );
                html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_submit_input( $str36$New_Thought, $str37$new_thought, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                SubLObject color_val = $kw38$DARK_GRAY;
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != color_val )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( color_val ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str39$_I_have_shared__S_random_thoughts, random_thought_generator.number_of_used_random_thoughts_for_user( cyclist ) );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                color_val = $kw38$DARK_GRAY;
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != color_val )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( color_val ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str40$_I_have_thought_of__S_more_things, random_thought_generator.number_of_queued_random_thoughts_for_user( cyclist ) );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
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
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 3676L)
  public static SubLObject cb_show_random_thought(final SubLObject assertion, final SubLObject assertion_paraphrase, SubLObject linksP, SubLObject sticky_hoveroverP)
  {
    if( linksP == UNPROVIDED )
    {
      linksP = T;
    }
    if( sticky_hoveroverP == UNPROVIDED )
    {
      sticky_hoveroverP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hoverover_html = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        html_utilities.html_princ( $str27$CycL__ );
        if( NIL != linksP )
        {
          cb_utilities.cb_form( assertion, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          html_utilities.html_princ( assertions_high.assertion_ist_formula( assertion ) );
        }
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      hoverover_html = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
    cb_query.cb_princ_with_explanation( assertion_paraphrase, hoverover_html, NIL, NIL, sticky_hoveroverP );
    html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 4165L)
  public static SubLObject cb_random_thought_connection_type(final SubLObject v_term, final SubLObject last_term, final SubLObject last_assertion_id)
  {
    if( NIL == last_term )
    {
      return $kw41$UNKNOWN;
    }
    if( v_term.eql( last_term ) )
    {
      return $kw32$SAME;
    }
    if( NIL == last_assertion_id )
    {
      return $kw28$NEW;
    }
    if( NIL != cycl_utilities.expression_find( v_term, assertion_handles.find_assertion_by_id( last_assertion_id ), T, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw30$RELATED;
    }
    return $kw28$NEW;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 4498L)
  public static SubLObject cb_handle_random_thoughts(final SubLObject args)
  {
    final SubLObject term_id = html_utilities.html_extract_input( $str25$term, args );
    final SubLObject v_term = term_id.isString() ? cb_utilities.cb_guess_fort( term_id, UNPROVIDED ) : NIL;
    final SubLObject assertion_id_string = html_utilities.html_extract_input( $str26$assertion_id, args );
    final SubLObject assertion_id = assertion_id_string.isString() ? reader.read_from_string( assertion_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    return cb_random_thought_for_cyclist( operation_communication.the_cyclist(), v_term, assertion_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5187L)
  public static SubLObject show_random_thought_for_user_and_topic_p(final SubLObject user, final SubLObject topic)
  {
    return makeBoolean( NIL != forts.fort_p( topic ) && NIL != conses_high.member( user, $random_thought_cyclists$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5384L)
  public static SubLObject cb_random_thought_frame(final SubLObject args)
  {
    SubLObject cyclist_string = NIL;
    SubLObject topic_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list44 );
    cyclist_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list44 );
    topic_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject cyclist = cb_utilities.cb_guess_fort( cyclist_string, UNPROVIDED );
      final SubLObject topic = cb_utilities.cb_guess_fort( topic_string, UNPROVIDED );
      return cb_random_thought_retrieve_and_display( cyclist, topic );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5659L)
  public static SubLObject cb_random_thought_retrieve_and_display(final SubLObject cyclist, final SubLObject topic)
  {
    SubLObject thought = NIL;
    html_utilities.html_refresh( $random_thought_refresh_rate$.getGlobalValue(), UNPROVIDED );
    thought = random_thought_generator.next_random_thought_for_user( cyclist, ConsesLow.listS( $kw46$TOPIC, topic, $list47 ) );
    if( NIL != random_thought_generator.non_empty_random_thought_p( thought ) )
    {
      SubLObject current;
      final SubLObject datum = current = thought;
      SubLObject topic_$12 = NIL;
      SubLObject assertion = NIL;
      SubLObject assertion_paraphrase = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
      topic_$12 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
      assertion = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
      assertion_paraphrase = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return cb_random_thought_frame_internal( cyclist, topic_$12, assertion, assertion_paraphrase, UNPROVIDED );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 6148L)
  public static SubLObject cb_random_thought_frame_internal(final SubLObject cyclist, final SubLObject topic, final SubLObject assertion, final SubLObject assertion_paraphrase, SubLObject evaluation)
  {
    if( evaluation == UNPROVIDED )
    {
      evaluation = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str12$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str13$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw14$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
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
          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str49$cb_handle_random_thought_frame, T, UNPROVIDED );
            html_utilities.html_hidden_input( $str26$assertion_id, assertion_handles.assertion_id( assertion ), UNPROVIDED );
            html_utilities.html_hidden_input( $str50$cyclist, cb_utilities.cb_string_for_fort( cyclist ), UNPROVIDED );
            html_utilities.html_hidden_input( $str51$paraphrase, assertion_paraphrase, UNPROVIDED );
            html_utilities.html_hidden_input( $str52$topic, topic, UNPROVIDED );
            html_script_utilities.cb_hoverover_page_init();
            html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
            cb_show_random_thought( assertion, assertion_paraphrase, NIL, NIL );
            html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str53$position__absolute__bottom__0pt );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != evaluation )
              {
                cb_random_thoughts_evaluation( evaluation, cyclist, topic );
              }
              else
              {
                cb_random_thoughts_button_bar();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$13, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 7293L)
  public static SubLObject cb_random_thoughts_button_bar()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str55$100_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str56$center ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject cdolist_list_var = $cb_random_thoughts_evaluation_options$.getGlobalValue();
          SubLObject cons = NIL;
          cons = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject label = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
            key = current.first();
            current = ( label = current.rest() );
            html_utilities.html_submit_input( label, label, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
          }
          html_utilities.html_submit_input( $str58$Skip, $str58$Skip, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 7599L)
  public static SubLObject cb_random_thoughts_evaluation(final SubLObject evaluation, final SubLObject cyclist, final SubLObject topic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject evaluation_string = list_utilities.alist_lookup_without_values( $cb_random_thoughts_evaluation_options$.getGlobalValue(), evaluation, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw59$CENTER ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( FIVE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str60$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str61$Your_evaluation__ );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( evaluation_string );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str62$left ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != html_macros.$html_color_white$.getGlobalValue() )
        {
          html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_color_white$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_link( $kw63$RANDOM_THOUGHT_FRAME, cyclist, topic, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 8134L)
  public static SubLObject cb_link_random_thought_frame(final SubLObject cyclist, final SubLObject topic, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str64$_New_Random_Thought_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw65$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str66$cb_random_thought_frame__A__A, cb_utilities.cb_string_for_fort( cyclist ), cb_utilities.cb_string_for_fort( topic ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 8633L)
  public static SubLObject cb_handle_random_thought_frame(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cyclist = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str50$cyclist, args ), UNPROVIDED );
    final SubLObject topic = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str52$topic, args ), UNPROVIDED );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( html_utilities.html_extract_input( $str26$assertion_id, args ) );
    final SubLObject paraphrase = html_utilities.html_extract_input( $str51$paraphrase, args );
    SubLObject judgment;
    SubLObject rest;
    SubLObject cons;
    SubLObject current;
    SubLObject datum;
    SubLObject candidate;
    SubLObject string;
    for( judgment = NIL, rest = NIL, rest = $cb_random_thoughts_evaluation_options$.getGlobalValue(); NIL == judgment && NIL != rest; rest = rest.rest() )
    {
      cons = rest.first();
      datum = ( current = cons );
      candidate = NIL;
      string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
      candidate = current.first();
      current = ( string = current.rest() );
      if( NIL != html_utilities.html_extract_input( string, args ) )
      {
        judgment = candidate;
      }
    }
    if( NIL != judgment && NIL != $assert_random_thought_judgmentsP$.getGlobalValue() )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( $const69$CycRandomThoughtEvaluationTool, thread );
        final SubLObject evaluation = el_utilities.make_ternary_formula( $const70$EvaluationOfByOnFn, assertion, cyclist, date_utilities.indexical_seconds_since_1970() );
        final SubLObject evaluation_input_sentence = el_utilities.make_binary_formula( $const71$evaluationInput, evaluation, paraphrase );
        final SubLObject judgment_sentence = el_utilities.make_ternary_formula( $const72$evaluationOfAs, evaluation, assertion, judgment );
        final SubLObject mt = $const73$EvaluatedSentencesFromRandomThoug;
        ke.ke_assert( evaluation_input_sentence, mt, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    return cb_random_thought_frame_internal( cyclist, topic, assertion, paraphrase, judgment );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 10007L)
  public static SubLObject cb_maybe_show_random_thought(final SubLObject topic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cyclist = operation_communication.the_cyclist();
    if( NIL != show_random_thought_for_user_and_topic_p( cyclist, topic ) )
    {
      thread.resetMultipleValues();
      final SubLObject host = random_thought_generator.random_thought_server_hostXport();
      final SubLObject port = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != host && NIL != port )
      {
        final SubLObject port_offset = Numbers.subtract( port, $int75$3600 );
        final SubLObject handler = Sequences.cconcatenate( $str76$cb_random_thought_frame_, new SubLObject[] { format_nil.format_nil_a_no_copy( cb_utilities.cb_string_for_fort( cyclist ) ), $str77$_, format_nil
            .format_nil_a_no_copy( cb_utilities.cb_string_for_fort( topic ) )
        } );
        final SubLObject url = cb_tools.cyc_server_url( host, port_offset, handler );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_iframe_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( url );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str78$random_thought );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_width$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str55$100_ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_height$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $int79$75 );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw80$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_frameborder$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ONE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_marginwidth$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_marginheight$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_iframe_scrolling$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str81$no );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_iframe_tail$.getGlobalValue() );
      }
    }
    return NIL;
  }

  public static SubLObject declare_cb_random_thoughts_file()
  {
    SubLFiles.declareFunction( me, "cb_link_random_thought", "CB-LINK-RANDOM-THOUGHT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_random_thoughts", "CB-RANDOM-THOUGHTS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_random_thought_for_cyclist", "CB-RANDOM-THOUGHT-FOR-CYCLIST", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_show_random_thought", "CB-SHOW-RANDOM-THOUGHT", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_random_thought_connection_type", "CB-RANDOM-THOUGHT-CONNECTION-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_random_thoughts", "CB-HANDLE-RANDOM-THOUGHTS", 1, 0, false );
    SubLFiles.declareFunction( me, "show_random_thought_for_user_and_topic_p", "SHOW-RANDOM-THOUGHT-FOR-USER-AND-TOPIC-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_random_thought_frame", "CB-RANDOM-THOUGHT-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_random_thought_retrieve_and_display", "CB-RANDOM-THOUGHT-RETRIEVE-AND-DISPLAY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_random_thought_frame_internal", "CB-RANDOM-THOUGHT-FRAME-INTERNAL", 4, 1, false );
    SubLFiles.declareFunction( me, "cb_random_thoughts_button_bar", "CB-RANDOM-THOUGHTS-BUTTON-BAR", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_random_thoughts_evaluation", "CB-RANDOM-THOUGHTS-EVALUATION", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_link_random_thought_frame", "CB-LINK-RANDOM-THOUGHT-FRAME", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_random_thought_frame", "CB-HANDLE-RANDOM-THOUGHT-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_maybe_show_random_thought", "CB-MAYBE-SHOW-RANDOM-THOUGHT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_random_thoughts_file()
  {
    $random_thought_cyclists$ = SubLFiles.deflexical( "*RANDOM-THOUGHT-CYCLISTS*", $list43 );
    $random_thought_refresh_rate$ = SubLFiles.deflexical( "*RANDOM-THOUGHT-REFRESH-RATE*", TEN_INTEGER );
    $cb_random_thoughts_evaluation_options$ = SubLFiles.deflexical( "*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*", $list54 );
    $assert_random_thought_judgmentsP$ = SubLFiles.deflexical( "*ASSERT-RANDOM-THOUGHT-JUDGMENTS?*", T );
    return NIL;
  }

  public static SubLObject setup_cb_random_thoughts_file()
  {
    cb_utilities.setup_cb_link_method( $kw3$RANDOM_THOUGHT, $sym4$CB_LINK_RANDOM_THOUGHT, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym5$CB_RANDOM_THOUGHTS, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym42$CB_HANDLE_RANDOM_THOUGHTS, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym45$CB_RANDOM_THOUGHT_FRAME, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw63$RANDOM_THOUGHT_FRAME, $sym67$CB_LINK_RANDOM_THOUGHT_FRAME, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym74$CB_HANDLE_RANDOM_THOUGHT_FRAME, $kw6$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_random_thoughts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_random_thoughts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_random_thoughts_file();
  }
  static
  {
    me = new cb_random_thoughts();
    $random_thought_cyclists$ = null;
    $random_thought_refresh_rate$ = null;
    $cb_random_thoughts_evaluation_options$ = null;
    $assert_random_thought_judgmentsP$ = null;
    $str0$_Random_Thought_ = makeString( "[Random Thought]" );
    $kw1$MAIN = makeKeyword( "MAIN" );
    $str2$cb_random_thoughts = makeString( "cb-random-thoughts" );
    $kw3$RANDOM_THOUGHT = makeKeyword( "RANDOM-THOUGHT" );
    $sym4$CB_LINK_RANDOM_THOUGHT = makeSymbol( "CB-LINK-RANDOM-THOUGHT" );
    $sym5$CB_RANDOM_THOUGHTS = makeSymbol( "CB-RANDOM-THOUGHTS" );
    $kw6$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $const7$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
    $str8$the_Random_Thought_Generator = makeString( "the Random Thought Generator" );
    $list9 = ConsesLow.list( makeKeyword( "NOW" ), NIL );
    $list10 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "ASSERTION" ), makeSymbol( "JAVALIST" ) );
    $str11$Random_Thoughts = makeString( "Random Thoughts" );
    $str12$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str13$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw14$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw15$CB_CYC = makeKeyword( "CB-CYC" );
    $kw16$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw17$SHA1 = makeKeyword( "SHA1" );
    $str18$yui_skin_sam = makeString( "yui-skin-sam" );
    $str19$reloadFrameButton = makeString( "reloadFrameButton" );
    $str20$button = makeString( "button" );
    $str21$reload = makeString( "reload" );
    $str22$Refresh_Frames = makeString( "Refresh Frames" );
    $str23$post = makeString( "post" );
    $str24$cb_handle_random_thoughts = makeString( "cb-handle-random-thoughts" );
    $str25$term = makeString( "term" );
    $str26$assertion_id = makeString( "assertion-id" );
    $str27$CycL__ = makeString( "CycL: " );
    $kw28$NEW = makeKeyword( "NEW" );
    $str29$New_ = makeString( "New " );
    $kw30$RELATED = makeKeyword( "RELATED" );
    $str31$Related_ = makeString( "Related " );
    $kw32$SAME = makeKeyword( "SAME" );
    $str33$Same_ = makeString( "Same " );
    $str34$ = makeString( "" );
    $str35$Topic__ = makeString( "Topic: " );
    $str36$New_Thought = makeString( "New Thought" );
    $str37$new_thought = makeString( "new-thought" );
    $kw38$DARK_GRAY = makeKeyword( "DARK-GRAY" );
    $str39$_I_have_shared__S_random_thoughts = makeString( "(I have shared ~S random thoughts with you so far.)" );
    $str40$_I_have_thought_of__S_more_things = makeString( "(I have thought of ~S more things to say.)" );
    $kw41$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym42$CB_HANDLE_RANDOM_THOUGHTS = makeSymbol( "CB-HANDLE-RANDOM-THOUGHTS" );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Baxter" ) ), constant_handles.reader_make_constant_shell( makeString( "DaveS" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Witbrock" ) ) );
    $list44 = ConsesLow.list( makeSymbol( "CYCLIST-STRING" ), makeSymbol( "TOPIC-STRING" ) );
    $sym45$CB_RANDOM_THOUGHT_FRAME = makeSymbol( "CB-RANDOM-THOUGHT-FRAME" );
    $kw46$TOPIC = makeKeyword( "TOPIC" );
    $list47 = ConsesLow.list( makeKeyword( "REQUIRE-TOPICAL?" ), NIL, makeKeyword( "NOW" ), NIL );
    $list48 = ConsesLow.list( makeSymbol( "TOPIC" ), makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-PARAPHRASE" ) );
    $str49$cb_handle_random_thought_frame = makeString( "cb-handle-random-thought-frame" );
    $str50$cyclist = makeString( "cyclist" );
    $str51$paraphrase = makeString( "paraphrase" );
    $str52$topic = makeString( "topic" );
    $str53$position__absolute__bottom__0pt = makeString( "position: absolute; bottom: 0pt" );
    $list54 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TrueCycLSentence" ) ), makeString( "True" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
        makeString( "FalseCycLSentence" ) ), makeString( "False" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "BadlyParaphrasedCycLSentence" ) ), makeString( "Bad Paraphrase" ) ),
        ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "UninterestingCycLSentence" ) ), makeString( "Uninteresting" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
            "ProblematicCycLSentence" ) ), makeString( "Other" ) ) );
    $str55$100_ = makeString( "100%" );
    $str56$center = makeString( "center" );
    $list57 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "LABEL" ) );
    $str58$Skip = makeString( "Skip" );
    $kw59$CENTER = makeKeyword( "CENTER" );
    $str60$right = makeString( "right" );
    $str61$Your_evaluation__ = makeString( "Your evaluation: " );
    $str62$left = makeString( "left" );
    $kw63$RANDOM_THOUGHT_FRAME = makeKeyword( "RANDOM-THOUGHT-FRAME" );
    $str64$_New_Random_Thought_ = makeString( "[New Random Thought]" );
    $kw65$SELF = makeKeyword( "SELF" );
    $str66$cb_random_thought_frame__A__A = makeString( "cb-random-thought-frame&~A&~A" );
    $sym67$CB_LINK_RANDOM_THOUGHT_FRAME = makeSymbol( "CB-LINK-RANDOM-THOUGHT-FRAME" );
    $list68 = ConsesLow.cons( makeSymbol( "CANDIDATE" ), makeSymbol( "STRING" ) );
    $const69$CycRandomThoughtEvaluationTool = constant_handles.reader_make_constant_shell( makeString( "CycRandomThoughtEvaluationTool" ) );
    $const70$EvaluationOfByOnFn = constant_handles.reader_make_constant_shell( makeString( "EvaluationOfByOnFn" ) );
    $const71$evaluationInput = constant_handles.reader_make_constant_shell( makeString( "evaluationInput" ) );
    $const72$evaluationOfAs = constant_handles.reader_make_constant_shell( makeString( "evaluationOfAs" ) );
    $const73$EvaluatedSentencesFromRandomThoug = constant_handles.reader_make_constant_shell( makeString( "EvaluatedSentencesFromRandomThoughtServerMt" ) );
    $sym74$CB_HANDLE_RANDOM_THOUGHT_FRAME = makeSymbol( "CB-HANDLE-RANDOM-THOUGHT-FRAME" );
    $int75$3600 = makeInteger( 3600 );
    $str76$cb_random_thought_frame_ = makeString( "cb-random-thought-frame&" );
    $str77$_ = makeString( "&" );
    $str78$random_thought = makeString( "random_thought" );
    $int79$75 = makeInteger( 75 );
    $kw80$RIGHT = makeKeyword( "RIGHT" );
    $str81$no = makeString( "no" );
  }
}
/*
 * 
 * Total time: 476 ms
 * 
 */