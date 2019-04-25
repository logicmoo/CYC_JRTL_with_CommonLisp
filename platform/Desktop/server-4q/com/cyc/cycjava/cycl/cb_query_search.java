package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_query_search
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_query_search";
  public static final String myFingerPrint = "6d0806ad4e231372b21a1a2fd2e68239aa86b23a3f054418d051bb440834701b";
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 924L)
  public static SubLSymbol $cb_query_search_width$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1028L)
  public static SubLSymbol $cb_query_search_height$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1132L)
  public static SubLSymbol $cb_query_search_return_fragmentsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1203L)
  public static SubLSymbol $cb_query_search_return_kbqsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1266L)
  public static SubLSymbol $cb_query_search_kbq_info_to_show$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1367L)
  public static SubLSymbol $cb_query_search_query_type$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1451L)
  public static SubLSymbol $cb_query_search_task$;
  private static final SubLInteger $int0$80;
  private static final SubLSymbol $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__;
  private static final SubLSymbol $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_;
  private static final SubLObject $const5$CycLQuerySpecification;
  private static final SubLSymbol $sym6$_CB_QUERY_SEARCH_QUERY_TYPE_;
  private static final SubLObject $const7$GeneralCycKETask_Allotment;
  private static final SubLSymbol $sym8$_CB_QUERY_SEARCH_TASK_;
  private static final SubLString $str9$Query_Search;
  private static final SubLString $str10$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str11$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw12$UNINITIALIZED;
  private static final SubLSymbol $kw13$CB_CYC;
  private static final SubLSymbol $kw14$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw15$SHA1;
  private static final SubLString $str16$yui_skin_sam;
  private static final SubLString $str17$reloadFrameButton;
  private static final SubLString $str18$button;
  private static final SubLString $str19$reload;
  private static final SubLString $str20$Refresh_Frames;
  private static final SubLString $str21$post;
  private static final SubLString $str22$cb_handle_query_search;
  private static final SubLString $str23$default_task;
  private static final SubLString $str24$kbqs_;
  private static final SubLString $str25$fragments_;
  private static final SubLString $str26$query_type;
  private static final SubLString $str27$show_kbq_sentence_;
  private static final SubLSymbol $kw28$QUERY_SENTENCE;
  private static final SubLString $str29$show_kbq_gloss_;
  private static final SubLSymbol $kw30$GLOSS;
  private static final SubLString $str31$show_kbq_supports_;
  private static final SubLSymbol $kw32$SUPPORTS;
  private static final SubLString $str33$search_string;
  private static final SubLSymbol $sym34$CB_HANDLE_QUERY_SEARCH;
  private static final SubLSymbol $kw35$HTML_HANDLER;
  private static final SubLString $str36$Results_for__S_;
  private static final SubLSymbol $kw37$RED;
  private static final SubLString $str38$Please_select_Fragments_and_or_Re;
  private static final SubLList $list39;
  private static final SubLString $str40$No_reified_queries_found_;
  private static final SubLList $list41;
  private static final SubLString $str42$Filter_collection;
  private static final SubLString $str43$A_query_type_for_reified_queries_;
  private static final SubLInteger $int44$300;
  private static final SubLString $str45$nd___;
  private static final SubLSymbol $kw46$INPUT_NAME;
  private static final SubLSymbol $kw47$COMPLETE_LABEL;
  private static final SubLSymbol $kw48$WIDTH;
  private static final SubLInteger $int49$500;
  private static final SubLSymbol $kw50$PRETTY_NAME;
  private static final SubLSymbol $kw51$CLEAR_LABEL;
  private static final SubLSymbol $kw52$COMPLETE_TYPE;
  private static final SubLObject $const53$SpecsFn;
  private static final SubLString $str54$Query_types__;
  private static final SubLString $str55$Should_we_construct_fragments_;
  private static final SubLString $str56$Fragments__;
  private static final SubLString $str57$t;
  private static final SubLString $str58$Should_we_retrieve_reified_querie;
  private static final SubLString $str59$Reified_Queries__;
  private static final SubLString $str60$__Show_query_sentence__;
  private static final SubLString $str61$_Gloss__;
  private static final SubLString $str62$_Supports__;
  private static final SubLString $str63$_;
  private static final SubLString $str64$Enter_A_Search_String__;
  private static final SubLString $str65$Eval;
  private static final SubLString $str66$Clear;
  private static final SubLSymbol $kw67$CENTER;
  private static final SubLString $str68$Reified_Query;
  private static final SubLString $str69$Score;
  private static final SubLList $list70;
  private static final SubLString $str71$Gloss__;
  private static final SubLString $str72$cycl_;
  private static final SubLString $str73$;
  private static final SubLString $str74$Query_Sentence__;
  private static final SubLSymbol $kw75$INVISIBLE;
  private static final SubLSymbol $kw76$TEXT;
  private static final SubLString $str77$Supports__;
  private static final SubLList $list78;
  private static final SubLString $str79$_is_mapped_to_;
  private static final SubLString $str80$_with_a_score_of_;
  private static final SubLString $str81$_;
  private static final SubLString $str82$_S____;
  private static final SubLString $str83$___D_;
  private static final SubLObject $const84$queryContentString;
  private static final SubLObject $const85$formulaTemplateGloss;
  private static final SubLSymbol $sym86$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw87$MAIN;
  private static final SubLSymbol $kw88$QUERY_SEARCH;
  private static final SubLSymbol $sym89$CB_LINK_QUERY_SEARCH;

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1666L)
  public static SubLObject cb_handle_query_search(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str9$Query_Search;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str10$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str11$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw12$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw13$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw14$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str16$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str17$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str18$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str19$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str20$Refresh_Frames );
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
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw13$CB_CYC );
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_script_utilities.cb_hoverover_page_init();
            html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str21$post );
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
              html_utilities.html_hidden_input( $str22$cb_handle_query_search, T, UNPROVIDED );
              if( NIL != args )
              {
                $cb_query_search_task$.setDynamicValue( cb_utilities.cb_guess_term( html_utilities.html_extract_input( $str23$default_task, args ), UNPROVIDED ), thread );
                $cb_query_search_return_kbqsP$.setDynamicValue( list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str24$kbqs_, args ) ), thread );
                $cb_query_search_return_fragmentsP$.setDynamicValue( list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str25$fragments_, args ) ), thread );
                $cb_query_search_query_type$.setDynamicValue( cb_utilities.cb_guess_term( html_utilities.html_extract_input( $str26$query_type, args ), UNPROVIDED ), thread );
                $cb_query_search_kbq_info_to_show$.setDynamicValue( NIL, thread );
                if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str27$show_kbq_sentence_, args ) ) )
                {
                  $cb_query_search_kbq_info_to_show$.setDynamicValue( ConsesLow.cons( $kw28$QUERY_SENTENCE, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ) ), thread );
                }
                if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str29$show_kbq_gloss_, args ) ) )
                {
                  $cb_query_search_kbq_info_to_show$.setDynamicValue( ConsesLow.cons( $kw30$GLOSS, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ) ), thread );
                }
                if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str31$show_kbq_supports_, args ) ) )
                {
                  $cb_query_search_kbq_info_to_show$.setDynamicValue( ConsesLow.cons( $kw32$SUPPORTS, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ) ), thread );
                }
              }
              final SubLObject input_string = html_utilities.html_extract_input( $str33$search_string, args );
              final SubLObject _prev_bind_0_$6 = cae_query_search.$current_cae_task$.currentBinding( thread );
              try
              {
                cae_query_search.$current_cae_task$.bind( $cb_query_search_task$.getDynamicValue( thread ), thread );
                final SubLObject results = cb_query_search_results( input_string );
                cb_show_handle_query_search( input_string, results );
              }
              finally
              {
                cae_query_search.$current_cae_task$.rebind( _prev_bind_0_$6, thread );
              }
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 2995L)
  public static SubLObject cb_show_handle_query_search(final SubLObject input_string, final SubLObject results)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_show_handle_query_search_form( input_string );
    if( NIL != input_string )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str36$Results_for__S_, input_string );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      if( NIL == $cb_query_search_return_kbqsP$.getDynamicValue( thread ) && NIL == $cb_query_search_return_fragmentsP$.getDynamicValue( thread ) )
      {
        final SubLObject color_val = $kw37$RED;
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != color_val )
        {
          html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_val ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str38$Please_select_Fragments_and_or_Re );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      }
      SubLObject result_string = NIL;
      SubLObject result_kbqs = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( results, results, $list39 );
      result_string = results.first();
      SubLObject current = results.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, results, $list39 );
      result_kbqs = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != result_string )
        {
          html_macros.verify_not_within_html_pre();
          html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
          final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding( thread );
          try
          {
            html_macros.$within_html_pre$.bind( T, thread );
            html_utilities.html_princ( result_string );
          }
          finally
          {
            html_macros.$within_html_pre$.rebind( _prev_bind_2, thread );
          }
          html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
        }
        if( NIL != $cb_query_search_return_kbqsP$.getDynamicValue( thread ) )
        {
          if( NIL != list_utilities.empty_list_p( result_kbqs ) )
          {
            html_utilities.html_princ( $str40$No_reified_queries_found_ );
          }
          else
          {
            show_reified_query_search_results( result_kbqs );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( results, $list39 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 3746L)
  public static SubLObject cb_show_handle_query_search_form(final SubLObject input_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    cb_form_widgets.cb_el_term_input_section( $cb_query_search_task$.getDynamicValue( thread ), $list41 );
    final SubLObject complete_genl = $const5$CycLQuerySpecification;
    final SubLObject pretty_name = $str42$Filter_collection;
    if( $str43$A_query_type_for_reified_queries_.isString() )
    {
      final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover( $str43$A_query_type_for_reified_queries_, NIL, $int44$300, NIL );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( onmouseover );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str45$nd___ );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_form_widgets.cb_el_term_input_section( $cb_query_search_query_type$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] { $kw46$INPUT_NAME, $str26$query_type, $kw47$COMPLETE_LABEL, NIL, $kw48$WIDTH,
          $int49$500, $kw50$PRETTY_NAME, pretty_name, $kw51$CLEAR_LABEL, NIL, $kw52$COMPLETE_TYPE, ConsesLow.list( $const53$SpecsFn, complete_genl )
        } ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    html_utilities.html_princ_strong( $str54$Query_types__ );
    html_utilities.html_indent( THREE_INTEGER );
    if( $str55$Should_we_construct_fragments_.isString() )
    {
      final SubLObject onmouseover2 = html_script_utilities.html_hoverover_anchor_onmouseover( $str55$Should_we_construct_fragments_, NIL, $int44$300, NIL );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( onmouseover2 );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str45$nd___ );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str56$Fragments__ );
        html_utilities.html_checkbox_input( $str25$fragments_, $str57$t, $cb_query_search_return_fragmentsP$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    html_utilities.html_indent( THREE_INTEGER );
    final SubLObject return_kbqsP = $cb_query_search_return_kbqsP$.getDynamicValue( thread );
    if( $str58$Should_we_retrieve_reified_querie.isString() )
    {
      final SubLObject onmouseover3 = html_script_utilities.html_hoverover_anchor_onmouseover( $str58$Should_we_retrieve_reified_querie, NIL, $int44$300, NIL );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( onmouseover3 );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str45$nd___ );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str59$Reified_Queries__ );
        html_utilities.html_checkbox_input( $str24$kbqs_, $str57$t, return_kbqsP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_3, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    html_utilities.html_princ( $str60$__Show_query_sentence__ );
    html_utilities.html_checkbox_input( $str27$show_kbq_sentence_, $str57$t, subl_promotions.memberP( $kw28$QUERY_SENTENCE, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str61$_Gloss__ );
    html_utilities.html_checkbox_input( $str29$show_kbq_gloss_, $str57$t, subl_promotions.memberP( $kw30$GLOSS, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str62$_Supports__ );
    html_utilities.html_checkbox_input( $str31$show_kbq_supports_, $str57$t, subl_promotions.memberP( $kw32$SUPPORTS, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str63$_ );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str64$Enter_A_Search_String__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_submit_input( $str65$Eval, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_script_utilities.html_clear_input_button( $str33$search_string, $str66$Clear, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str33$search_string );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != $cb_query_search_width$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $cb_query_search_width$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != $cb_query_search_height$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $cb_query_search_height$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != input_string )
      {
        html_utilities.html_princ( input_string );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_4, thread );
    }
    html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 5922L)
  public static SubLObject show_reified_query_search_results(final SubLObject result_kbqs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      if( NIL != bgcolor )
      {
        html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( bgcolor );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw67$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str68$Reified_Query );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw67$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str69$Score );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      SubLObject color_toggle = NIL;
      SubLObject list_var = NIL;
      SubLObject pair = NIL;
      SubLObject index = NIL;
      list_var = result_kbqs;
      pair = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), pair = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        if( NIL != color_toggle )
        {
          color_toggle = NIL;
        }
        else
        {
          color_toggle = T;
        }
        bgcolor = ( ( NIL != color_toggle ) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue() );
        SubLObject current;
        final SubLObject datum = current = pair;
        SubLObject kbq = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
        kbq = current.first();
        current = ( supports = current.rest() );
        final SubLObject score = cae_query_search.reified_query_search_score_from_supports( supports );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        if( NIL != bgcolor )
        {
          html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( bgcolor );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( kbq, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw67$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( score );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        if( NIL != subl_promotions.memberP( $kw30$GLOSS, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject gloss = get_kbq_gloss( kbq );
          if( NIL != gloss )
          {
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            if( NIL != bgcolor )
            {
              html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( bgcolor );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str71$Gloss__ );
                html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
                html_utilities.html_princ( gloss );
                html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
        }
        if( NIL != subl_promotions.memberP( $kw28$QUERY_SENTENCE, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          if( NIL != bgcolor )
          {
            html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( bgcolor );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              final SubLObject dhtml_object_id = Sequences.cconcatenate( $str72$cycl_, format_nil.format_nil_d_no_copy( index ) );
              dhtml_macros.dhtml_switch_visibility_links_arrows( dhtml_object_id, $str73$ );
              html_utilities.html_princ( $str74$Query_Sentence__ );
              dhtml_macros.dhtml_set_switched_visibility( dhtml_object_id, $kw75$INVISIBLE, $kw76$TEXT );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              if( NIL != dhtml_object_id )
              {
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( dhtml_object_id );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_utilities.cb_form( kb_query.kbq_sentence( kbq ), ONE_INTEGER, T );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        if( NIL != subl_promotions.memberP( $kw32$SUPPORTS, $cb_query_search_kbq_info_to_show$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          if( NIL != bgcolor )
          {
            html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( bgcolor );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str77$Supports__ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          SubLObject cdolist_list_var = supports;
          SubLObject support = NIL;
          support = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current_$21;
            final SubLObject datum_$20 = current_$21 = support;
            SubLObject token_record = NIL;
            SubLObject v_term = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list78 );
            token_record = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list78 );
            v_term = current_$21.first();
            current_$21 = current_$21.rest();
            if( NIL == current_$21 )
            {
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              if( NIL != bgcolor )
              {
                html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( bgcolor );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  final SubLObject focal_string = cae_query_search.token_record_focal_string( token_record );
                  final SubLObject score_$24 = cae_query_search.reified_query_search_score_from_support( support );
                  final SubLObject explanation = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( focal_string ), new SubLObject[] { $str79$_is_mapped_to_, format_nil.format_nil_s_no_copy( v_term ),
                    $str80$_with_a_score_of_, format_nil.format_nil_d_no_copy( score_$24 ), $str81$_
                  } );
                  if( explanation.isString() )
                  {
                    final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover( explanation, NIL, $int44$300, NIL );
                    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( onmouseover );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str45$nd___ );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_indent( THREE_INTEGER );
                      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str82$_S____, focal_string );
                      cb_utilities.cb_form( v_term, UNPROVIDED, UNPROVIDED );
                      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str83$___D_, score_$24 );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$20, $list78 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
          }
        }
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 8218L)
  public static SubLObject get_kbq_gloss(final SubLObject kbq)
  {
    SubLObject gloss = kb_mapping_utilities.fpred_value_in_any_mt( kbq, $const84$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == gloss )
    {
      final SubLObject formula_template = kb_query.kbq_template( kbq );
      if( NIL != formula_template )
      {
        gloss = kb_mapping_utilities.fpred_value_in_any_mt( formula_template, $const85$formulaTemplateGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 8517L)
  public static SubLObject cb_query_search_results(final SubLObject search_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_string = NIL;
    SubLObject kbqs = NIL;
    SubLObject err = NIL;
    if( NIL != string_utilities.non_empty_string_p( search_string ) )
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym86$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != $cb_query_search_return_fragmentsP$.getDynamicValue( thread ) )
            {
              SubLObject stream = NIL;
              try
              {
                stream = streams_high.make_private_string_output_stream();
                cae_query_search.debug_query_search_string( search_string, $cb_query_search_task$.getDynamicValue( thread ), NIL, stream, UNPROVIDED );
                result_string = streams_high.get_output_stream_string( stream );
              }
              finally
              {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  streams_high.close( stream, UNPROVIDED );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                }
              }
            }
            if( NIL != $cb_query_search_return_kbqsP$.getDynamicValue( thread ) )
            {
              kbqs = cae_query_search.get_reified_queries_from_string( search_string, $cb_query_search_task$.getDynamicValue( thread ), $cb_query_search_query_type$.getDynamicValue( thread ) );
            }
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
        err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != err )
      {
        result_string = err;
      }
    }
    return ConsesLow.list( result_string, kbqs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 9119L)
  public static SubLObject cb_link_query_search(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str9$Query_Search;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw87$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str22$cb_handle_query_search );
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

  public static SubLObject declare_cb_query_search_file()
  {
    SubLFiles.declareFunction( me, "cb_handle_query_search", "CB-HANDLE-QUERY-SEARCH", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_handle_query_search", "CB-SHOW-HANDLE-QUERY-SEARCH", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_handle_query_search_form", "CB-SHOW-HANDLE-QUERY-SEARCH-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "show_reified_query_search_results", "SHOW-REIFIED-QUERY-SEARCH-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_kbq_gloss", "GET-KBQ-GLOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_query_search_results", "CB-QUERY-SEARCH-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_query_search", "CB-LINK-QUERY-SEARCH", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_cb_query_search_file()
  {
    $cb_query_search_width$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-WIDTH*", $int0$80 );
    $cb_query_search_height$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-HEIGHT*", THREE_INTEGER );
    $cb_query_search_return_fragmentsP$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*", NIL );
    $cb_query_search_return_kbqsP$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-RETURN-KBQS?*", T );
    $cb_query_search_kbq_info_to_show$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-KBQ-INFO-TO-SHOW*", $list3 );
    $cb_query_search_query_type$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-QUERY-TYPE*", $const5$CycLQuerySpecification );
    $cb_query_search_task$ = SubLFiles.defparameter( "*CB-QUERY-SEARCH-TASK*", $const7$GeneralCycKETask_Allotment );
    return NIL;
  }

  public static SubLObject setup_cb_query_search_file()
  {
    utilities_macros.register_html_state_variable( $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__ );
    utilities_macros.register_html_interface_variable( $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__ );
    utilities_macros.register_html_state_variable( $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__ );
    utilities_macros.register_html_interface_variable( $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__ );
    utilities_macros.register_html_state_variable( $sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_ );
    utilities_macros.register_html_interface_variable( $sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_ );
    utilities_macros.register_html_state_variable( $sym6$_CB_QUERY_SEARCH_QUERY_TYPE_ );
    utilities_macros.register_html_interface_variable( $sym6$_CB_QUERY_SEARCH_QUERY_TYPE_ );
    utilities_macros.register_html_state_variable( $sym8$_CB_QUERY_SEARCH_TASK_ );
    utilities_macros.register_html_interface_variable( $sym8$_CB_QUERY_SEARCH_TASK_ );
    html_macros.note_cgi_handler_function( $sym34$CB_HANDLE_QUERY_SEARCH, $kw35$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw88$QUERY_SEARCH, $sym89$CB_LINK_QUERY_SEARCH, ONE_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_query_search_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_query_search_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_query_search_file();
  }
  static
  {
    me = new cb_query_search();
    $cb_query_search_width$ = null;
    $cb_query_search_height$ = null;
    $cb_query_search_return_fragmentsP$ = null;
    $cb_query_search_return_kbqsP$ = null;
    $cb_query_search_kbq_info_to_show$ = null;
    $cb_query_search_query_type$ = null;
    $cb_query_search_task$ = null;
    $int0$80 = makeInteger( 80 );
    $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__ = makeSymbol( "*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*" );
    $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__ = makeSymbol( "*CB-QUERY-SEARCH-RETURN-KBQS?*" );
    $list3 = ConsesLow.list( makeKeyword( "QUERY-SENTENCE" ), makeKeyword( "GLOSS" ), makeKeyword( "SUPPORTS" ) );
    $sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_ = makeSymbol( "*CB-QUERY-SEARCH-KBQ-INFO-TO-SHOW*" );
    $const5$CycLQuerySpecification = constant_handles.reader_make_constant_shell( makeString( "CycLQuerySpecification" ) );
    $sym6$_CB_QUERY_SEARCH_QUERY_TYPE_ = makeSymbol( "*CB-QUERY-SEARCH-QUERY-TYPE*" );
    $const7$GeneralCycKETask_Allotment = constant_handles.reader_make_constant_shell( makeString( "GeneralCycKETask-Allotment" ) );
    $sym8$_CB_QUERY_SEARCH_TASK_ = makeSymbol( "*CB-QUERY-SEARCH-TASK*" );
    $str9$Query_Search = makeString( "Query Search" );
    $str10$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str11$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw12$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw13$CB_CYC = makeKeyword( "CB-CYC" );
    $kw14$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw15$SHA1 = makeKeyword( "SHA1" );
    $str16$yui_skin_sam = makeString( "yui-skin-sam" );
    $str17$reloadFrameButton = makeString( "reloadFrameButton" );
    $str18$button = makeString( "button" );
    $str19$reload = makeString( "reload" );
    $str20$Refresh_Frames = makeString( "Refresh Frames" );
    $str21$post = makeString( "post" );
    $str22$cb_handle_query_search = makeString( "cb-handle-query-search" );
    $str23$default_task = makeString( "default-task" );
    $str24$kbqs_ = makeString( "kbqs?" );
    $str25$fragments_ = makeString( "fragments?" );
    $str26$query_type = makeString( "query-type" );
    $str27$show_kbq_sentence_ = makeString( "show-kbq-sentence?" );
    $kw28$QUERY_SENTENCE = makeKeyword( "QUERY-SENTENCE" );
    $str29$show_kbq_gloss_ = makeString( "show-kbq-gloss?" );
    $kw30$GLOSS = makeKeyword( "GLOSS" );
    $str31$show_kbq_supports_ = makeString( "show-kbq-supports?" );
    $kw32$SUPPORTS = makeKeyword( "SUPPORTS" );
    $str33$search_string = makeString( "search-string" );
    $sym34$CB_HANDLE_QUERY_SEARCH = makeSymbol( "CB-HANDLE-QUERY-SEARCH" );
    $kw35$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str36$Results_for__S_ = makeString( "Results for ~S:" );
    $kw37$RED = makeKeyword( "RED" );
    $str38$Please_select_Fragments_and_or_Re = makeString( "Please select Fragments and/or Reified Queries." );
    $list39 = ConsesLow.list( makeSymbol( "RESULT-STRING" ), makeSymbol( "RESULT-KBQS" ) );
    $str40$No_reified_queries_found_ = makeString( "No reified queries found." );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "INPUT-NAME" ), makeString( "default-task" ), makeKeyword( "COMPLETE-LABEL" ), NIL, makeKeyword( "WIDTH" ), makeInteger( 500 ), makeKeyword( "PRETTY-NAME" ),
      makeString( "Task" ), makeKeyword( "CLEAR-LABEL" ), NIL, makeKeyword( "COMPLETE-TYPE" ), constant_handles.reader_make_constant_shell( makeString( "CAEAnalysisTask" ) )
    } );
    $str42$Filter_collection = makeString( "Filter collection" );
    $str43$A_query_type_for_reified_queries_ = makeString( "A query type for reified queries." );
    $int44$300 = makeInteger( 300 );
    $str45$nd___ = makeString( "nd();" );
    $kw46$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $kw47$COMPLETE_LABEL = makeKeyword( "COMPLETE-LABEL" );
    $kw48$WIDTH = makeKeyword( "WIDTH" );
    $int49$500 = makeInteger( 500 );
    $kw50$PRETTY_NAME = makeKeyword( "PRETTY-NAME" );
    $kw51$CLEAR_LABEL = makeKeyword( "CLEAR-LABEL" );
    $kw52$COMPLETE_TYPE = makeKeyword( "COMPLETE-TYPE" );
    $const53$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $str54$Query_types__ = makeString( "Query types :" );
    $str55$Should_we_construct_fragments_ = makeString( "Should we construct fragments?" );
    $str56$Fragments__ = makeString( "Fragments? " );
    $str57$t = makeString( "t" );
    $str58$Should_we_retrieve_reified_querie = makeString( "Should we retrieve reified queries?" );
    $str59$Reified_Queries__ = makeString( "Reified Queries? " );
    $str60$__Show_query_sentence__ = makeString( " (Show query sentence? " );
    $str61$_Gloss__ = makeString( " Gloss? " );
    $str62$_Supports__ = makeString( " Supports? " );
    $str63$_ = makeString( ")" );
    $str64$Enter_A_Search_String__ = makeString( "Enter A Search String :" );
    $str65$Eval = makeString( "Eval" );
    $str66$Clear = makeString( "Clear" );
    $kw67$CENTER = makeKeyword( "CENTER" );
    $str68$Reified_Query = makeString( "Reified Query" );
    $str69$Score = makeString( "Score" );
    $list70 = ConsesLow.cons( makeSymbol( "KBQ" ), makeSymbol( "SUPPORTS" ) );
    $str71$Gloss__ = makeString( "Gloss: " );
    $str72$cycl_ = makeString( "cycl-" );
    $str73$ = makeString( "" );
    $str74$Query_Sentence__ = makeString( "Query Sentence: " );
    $kw75$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw76$TEXT = makeKeyword( "TEXT" );
    $str77$Supports__ = makeString( "Supports: " );
    $list78 = ConsesLow.list( makeSymbol( "TOKEN-RECORD" ), makeSymbol( "TERM" ) );
    $str79$_is_mapped_to_ = makeString( " is mapped to " );
    $str80$_with_a_score_of_ = makeString( " with a score of " );
    $str81$_ = makeString( "." );
    $str82$_S____ = makeString( "~S -> " );
    $str83$___D_ = makeString( " (~D)" );
    $const84$queryContentString = constant_handles.reader_make_constant_shell( makeString( "queryContentString" ) );
    $const85$formulaTemplateGloss = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateGloss" ) );
    $sym86$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw87$MAIN = makeKeyword( "MAIN" );
    $kw88$QUERY_SEARCH = makeKeyword( "QUERY-SEARCH" );
    $sym89$CB_LINK_QUERY_SEARCH = makeSymbol( "CB-LINK-QUERY-SEARCH" );
  }
}
/*
 * 
 * Total time: 623 ms
 * 
 */