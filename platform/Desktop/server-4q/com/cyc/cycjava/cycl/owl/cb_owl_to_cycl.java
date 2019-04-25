package com.cyc.cycjava.cycl.owl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_owl_to_cycl
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.owl.cb_owl_to_cycl";
  public static final String myFingerPrint = "8dddd3db5573e3b4d2046fd1c642dc9711b474ac41c6c437374a0f87cc2fe05f";
  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6031L)
  private static SubLSymbol $owl_importer_stage_descriptions$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6641L)
  private static SubLSymbol $cb_owl_import_refresh_interval$;
  private static final SubLSymbol $kw0$CB_OWL_TO_CYCL;
  private static final SubLString $str1$cb_owl_to_cycl_html;
  private static final SubLString $str2$OWL_Importer;
  private static final SubLString $str3$Import_an_OWL_ontology;
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
  private static final SubLString $str16$handle_owl_to_cycl_input;
  private static final SubLSymbol $kw17$SELF;
  private static final SubLString $str18$Back;
  private static final SubLString $str19$Clear;
  private static final SubLString $str20$Submit;
  private static final SubLString $str21$import_owl_file;
  private static final SubLString $str22$Enter_the_URI_you_wish_to_use_to_;
  private static final SubLString $str23$uri;
  private static final SubLInteger $int24$60;
  private static final SubLString $str25$Format_for_term_names_in___synony;
  private static final SubLString $str26$term_name_format;
  private static final SubLString $str27$short;
  private static final SubLString $str28$Short__local_names_only_;
  private static final SubLString $str29$medium;
  private static final SubLString $str30$Medium__prefixed_names__using_pre;
  private static final SubLString $str31$uri_prefix;
  private static final SubLString $str32$long;
  private static final SubLString $str33$Long__full_URIs_;
  private static final SubLString $str34$_Optional__enter_pathname_of_a_fi;
  private static final SubLString $str35$pathname;
  private static final SubLString $str36$;
  private static final SubLString $str37$Enter_a_prefix_for_new_constant_n;
  private static final SubLString $str38$Newly_created_constants_for_terms;
  private static final SubLString $str39$constant_prefix;
  private static final SubLString $str40$Enter_a_suffix_for_new_constant_n;
  private static final SubLString $str41$Newly_created_constants_for_terms;
  private static final SubLString $str42$constant_suffix;
  private static final SubLString $str43$_Optional__Enter_an_existing_Cyc_;
  private static final SubLString $str44$ontology;
  private static final SubLString $str45$Complete;
  private static final SubLObject $const46$owl_Ontology;
  private static final SubLSymbol $sym47$CB_OWL_IMPORT_OLD;
  private static final SubLSymbol $kw48$HTML_HANDLER;
  private static final SubLString $str49$Bad_source__;
  private static final SubLString $str50$Can_only_import_OWL_ontologies_fr;
  private static final SubLString $str51$_does_not_appear_to_be_a_URI_;
  private static final SubLString $str52$Enter_a_prefix_for_Medium_format_;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$HANDLE_OWL_TO_CYCL_INPUT;
  private static final SubLSymbol $kw55$ONTOLOGY;
  private static final SubLString $str56$Importing_;
  private static final SubLString $str57$OWL_Ontology;
  private static final SubLString $str58$_Display_Importer_Progress_;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLString $str61$Can_t_interpret__S_as_the_ID_of_a;
  private static final SubLString $str62$T;
  private static final SubLSymbol $sym63$CB_SHOW_OWL_IMPORTER;
  private static final SubLString $str64$Status___A_;
  private static final SubLString $str65$Done;
  private static final SubLString $str66$Working;
  private static final SubLString $str67$_Total_time___A_;
  private static final SubLSymbol $sym68$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const69$EverythingPSC;
  private static final SubLObject $const70$synonymousExternalConcept;
  private static final SubLString $str71$Term_count___D_;
  private static final SubLList $list72;
  private static final SubLString $str73$_A_;
  private static final SubLInteger $int74$100;
  private static final SubLString $str75$Started_at__A__Elapsed_time___A_;
  private static final SubLString $str76$Estimated_finish_time___A__after_;
  private static final SubLString $str77$Error_Messages___D__;
  private static final SubLList $list78;
  private static final SubLString $str79$_Refresh_;
  private static final SubLString $str80$_Halt_Auto_Refresh_;
  private static final SubLString $str81$_Start_Auto_Refresh_;
  private static final SubLString $str82$__Last_refresh___A_;
  private static final SubLSymbol $sym83$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str84$_OWL_Importer_;
  private static final SubLString $str85$_;
  private static final SubLSymbol $kw86$MAIN;
  private static final SubLString $str87$cb_show_owl_importer__D__A;
  private static final SubLSymbol $kw88$SHOW_OWL_IMPORTER;
  private static final SubLSymbol $sym89$CB_LINK_SHOW_OWL_IMPORTER;

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 905L)
  public static SubLObject cb_owl_import_old(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str2$OWL_Importer );
    }
    else
    {
      final SubLObject title_var = $str3$Import_an_OWL_ontology;
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
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw6$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
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
              html_script_utilities.cb_hoverover_page_init();
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
                html_utilities.html_hidden_input( $str16$handle_owl_to_cycl_input, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw0$CB_OWL_TO_CYCL, NIL, UNPROVIDED );
                cb_utilities.cb_back_button( $kw17$SELF, $str18$Back );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_reset_input( $str19$Clear );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str20$Submit, $str21$import_owl_file, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str22$Enter_the_URI_you_wish_to_use_to_ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_text_input( html_utilities.get_encoded_form_field_name( $str23$uri ), string_utilities.$empty_string$.getGlobalValue(), $int24$60 );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_princ_strong( $str25$Format_for_term_names_in___synony );
                final SubLObject name = html_utilities.get_encoded_form_field_name( $str26$term_name_format );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_radio_input( name, $str27$short, T, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_princ( $str28$Short__local_names_only_ );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_radio_input( name, $str29$medium, NIL, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_princ( $str30$Medium__prefixed_names__using_pre );
                html_utilities.html_text_input( html_utilities.get_encoded_form_field_name( $str31$uri_prefix ), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_radio_input( name, $str32$long, NIL, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_princ( $str33$Long__full_URIs_ );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str34$_Optional__enter_pathname_of_a_fi );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_filename_input( html_utilities.get_encoded_form_field_name( $str35$pathname ), $str36$, $int24$60 );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                cb_query.html_princ_with_explanation( $str37$Enter_a_prefix_for_new_constant_n, $str38$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_text_input( html_utilities.get_encoded_form_field_name( $str39$constant_prefix ), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                cb_query.html_princ_with_explanation( $str40$Enter_a_suffix_for_new_constant_n, $str41$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_text_input( html_utilities.get_encoded_form_field_name( $str42$constant_suffix ), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str43$_Optional__Enter_an_existing_Cyc_ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                final SubLObject encoded_name = html_utilities.get_encoded_form_field_name( $str44$ontology );
                html_complete.html_complete_button( encoded_name, $str45$Complete, $const46$owl_Ontology, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_text_input( encoded_name, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 3855L)
  public static SubLObject handle_owl_to_cycl_input(final SubLObject args)
  {
    final SubLObject pathname_field = $str35$pathname;
    final SubLObject pathname = string_utilities.trim_whitespace( html_utilities.extract_encoded_form_field_value( pathname_field, args ) );
    final SubLObject uri = html_utilities.extract_encoded_form_field_value( $str23$uri, args );
    final SubLObject source = ( NIL != string_utilities.non_empty_string_p( pathname ) ) ? pathname : uri;
    final SubLObject constant_prefix = html_utilities.extract_encoded_form_field_value( $str39$constant_prefix, args );
    final SubLObject constant_suffix = html_utilities.extract_encoded_form_field_value( $str42$constant_suffix, args );
    final SubLObject ontology_name = html_utilities.extract_encoded_form_field_value( $str44$ontology, args );
    final SubLObject ontology = ( NIL != string_utilities.non_empty_string_p( ontology_name ) ) ? cb_utilities.cb_guess_fort( ontology_name, UNPROVIDED ) : NIL;
    final SubLObject term_name_format = html_utilities.extract_encoded_form_field_value( $str26$term_name_format, args );
    final SubLObject prefix_external_namesP = makeBoolean( !term_name_format.equal( $str27$short ) );
    final SubLObject abbreviate_prefixesP = Equality.equal( term_name_format, $str29$medium );
    final SubLObject uri_prefix = html_utilities.extract_encoded_form_field_value( $str31$uri_prefix, args );
    SubLObject error_message = NIL;
    if( NIL == web_utilities.url_p( source ) && ( NIL == string_utilities.non_empty_string_p( source ) || NIL == file_utilities.file_existsP( source ) ) )
    {
      error_message = Sequences.cconcatenate( $str49$Bad_source__, new SubLObject[] { format_nil.format_nil_s_no_copy( source ), format_nil.$format_nil_percent$.getGlobalValue(), $str50$Can_only_import_OWL_ontologies_fr
      } );
    }
    else if( NIL == string_utilities.non_empty_string_p( uri ) )
    {
      error_message = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( uri ), $str51$_does_not_appear_to_be_a_URI_ );
    }
    else if( NIL != abbreviate_prefixesP && NIL != string_utilities.empty_string_p( uri_prefix ) )
    {
      error_message = Sequences.copy_seq( $str52$Enter_a_prefix_for_Medium_format_ );
    }
    if( NIL != error_message )
    {
      cb_utilities.cb_error( error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cb_start_owl_import( list_utilities.make_plist( $list53, ConsesLow.list( uri, source, constant_prefix, constant_suffix, ontology, prefix_external_namesP, abbreviate_prefixesP, uri_prefix ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 5601L)
  public static SubLObject cb_start_owl_import(final SubLObject import_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ontology = conses_high.getf( import_info, $kw55$ONTOLOGY, UNPROVIDED );
    final SubLObject importer_id = owl_to_cycl.import_owl_ontology_with_importer_from_info( import_info );
    final SubLObject title_var = NIL;
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
      final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str11$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
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
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
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
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str56$Importing_ );
            if( NIL != ontology )
            {
              cb_utilities.cb_form( ontology, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              html_utilities.html_princ( $str57$OWL_Ontology );
            }
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            cb_link_show_owl_importer( importer_id, $str58$_Display_Importer_Progress_, T );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$6, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6261L)
  public static SubLObject cb_show_owl_importer(final SubLObject args)
  {
    SubLObject id_string = NIL;
    SubLObject refresh_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list60 );
    id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list60 );
    refresh_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject id = string_utilities.string_to_integer( id_string );
      if( NIL == owl_to_cycl.owl_importer_exists_p( id ) )
      {
        cb_utilities.cb_error( $str61$Can_t_interpret__S_as_the_ID_of_a, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_show_owl_importer_internal( id, Equality.equalp( refresh_string, $str62$T ) );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list60 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6700L)
  public static SubLObject cb_show_owl_importer_internal(final SubLObject id, final SubLObject refreshP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject doneP = owl_to_cycl.owl_importer_done_p( id );
    final SubLObject progress = owl_to_cycl.get_owl_importer_progress( id );
    final SubLObject error_info = owl_to_cycl.get_owl_importer_error_info( id );
    final SubLObject ontology = narts_high.nart_substitute( owl_to_cycl.get_owl_importer_ontology( id ) );
    final SubLObject total_time = owl_importer_time_so_far( id );
    html_utilities.html_markup( $str4$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str5$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
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
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str2$OWL_Importer );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_refresh( ( NIL != refreshP && NIL == doneP ) ? $cb_owl_import_refresh_interval$.getDynamicValue( thread ) : NIL, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          if( NIL == doneP )
          {
            html_utilities.html_princ( $str56$Importing_ );
          }
          if( NIL != ontology )
          {
            cb_utilities.cb_form( ontology, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            html_utilities.html_princ( $str57$OWL_Ontology );
          }
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str64$Status___A_, ( NIL != doneP ) ? $str65$Done : $str66$Working );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str67$_Total_time___A_, numeric_date_utilities.readable_elapsed_time_string( total_time, ZERO_INTEGER ) );
          if( NIL != kb_indexing_datastructures.indexed_term_p( ontology ) )
          {
            final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym68$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const69$EverythingPSC, thread );
              final SubLObject term_count = Sequences.length( kb_mapping.gather_gaf_arg_index( ontology, TWO_INTEGER, $const70$synonymousExternalConcept, UNPROVIDED, UNPROVIDED ) );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str71$Term_count___D_, term_count );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$12, thread );
            }
          }
          html_utilities.html_newline( TWO_INTEGER );
          if( NIL != number_utilities.positive_number_p( total_time ) )
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_style_font_size_smaller$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject list_var = NIL;
              SubLObject item = NIL;
              SubLObject item_num = NIL;
              list_var = Sequences.reverse( progress );
              item = list_var.first();
              for( item_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), item_num = Numbers.add( ONE_INTEGER, item_num ) )
              {
                if( NIL != list_utilities.proper_list_p( item ) )
                {
                  SubLObject current;
                  final SubLObject datum = current = item;
                  SubLObject start_time = NIL;
                  SubLObject percent_done = NIL;
                  SubLObject elapsed_seconds = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
                  start_time = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
                  percent_done = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
                  elapsed_seconds = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str73$_A_, ConsesLow.nth( item_num, $owl_importer_stage_descriptions$.getGlobalValue() ) );
                    html_utilities.html_newline( UNPROVIDED );
                    html_utilities.html_percent_progress_bar( Numbers.truncate( Numbers.multiply( $int74$100, percent_done ), UNPROVIDED ), $int74$100, number_utilities.integer_percent( elapsed_seconds, total_time,
                        UNPROVIDED ), UNPROVIDED, UNPROVIDED );
                    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str75$Started_at__A__Elapsed_time___A_, numeric_date_utilities.timestring( start_time ), numeric_date_utilities
                        .readable_elapsed_time_string( elapsed_seconds, ZERO_INTEGER ) );
                    if( percent_done.isPositive() )
                    {
                      final SubLObject projected_total_time = Numbers.truncate( Numbers.divide( elapsed_seconds, percent_done ), UNPROVIDED );
                      if( !Numbers.subtract( projected_total_time, elapsed_seconds ).numLE( $cb_owl_import_refresh_interval$.getDynamicValue( thread ) ) )
                      {
                        html_utilities.html_newline( UNPROVIDED );
                        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str76$Estimated_finish_time___A__after_, numeric_date_utilities.timestring( Numbers.add( start_time,
                            projected_total_time ) ), numeric_date_utilities.readable_elapsed_time_string( projected_total_time, ZERO_INTEGER ) );
                      }
                    }
                    html_utilities.html_newline( TWO_INTEGER );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
                  }
                }
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
          html_utilities.html_newline( UNPROVIDED );
          if( NIL != error_info )
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_style_font_size_larger$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str77$Error_Messages___D__, Sequences.length( error_info ) );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            SubLObject cdolist_list_var = error_info;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = item2;
              SubLObject v_object = NIL;
              SubLObject message = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list78 );
              v_object = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list78 );
              message = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                cb_utilities.cb_form( v_object, ZERO_INTEGER, T );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_princ( message );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list78 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              item2 = cdolist_list_var.first();
            }
            html_utilities.html_newline( UNPROVIDED );
          }
          if( NIL != doneP )
          {
            cb_link_show_owl_importer( id, $str79$_Refresh_, NIL );
          }
          else if( NIL != refreshP )
          {
            cb_link_show_owl_importer( id, $str80$_Halt_Auto_Refresh_, NIL );
          }
          else
          {
            cb_link_show_owl_importer( id, $str81$_Start_Auto_Refresh_, T );
          }
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_style_font_size_smaller$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str82$__Last_refresh___A_, numeric_date_utilities.timestring( UNPROVIDED ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$10, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 9369L)
  public static SubLObject owl_importer_time_so_far(final SubLObject id)
  {
    final SubLObject doneP = owl_to_cycl.owl_importer_done_p( id );
    final SubLObject progress = owl_to_cycl.get_owl_importer_progress( id );
    SubLObject total_time = ZERO_INTEGER;
    if( NIL != progress )
    {
      SubLObject cdolist_list_var = ( NIL != doneP ) ? progress.rest() : progress;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        total_time = Numbers.add( total_time, conses_high.third( item ) );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
    }
    return total_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 9656L)
  public static SubLObject cb_link_show_owl_importer(final SubLObject id, SubLObject linktext, SubLObject auto_refreshP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( auto_refreshP == UNPROVIDED )
    {
      auto_refreshP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( id ) : id;
    if( NIL == linktext )
    {
      linktext = Sequences.cconcatenate( $str84$_OWL_Importer_, new SubLObject[] { format_nil.format_nil_d_no_copy( id ), $str85$_
      } );
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw86$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str87$cb_show_owl_importer__D__A, id, auto_refreshP );
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
    return id;
  }

  public static SubLObject declare_cb_owl_to_cycl_file()
  {
    SubLFiles.declareFunction( me, "cb_owl_import_old", "CB-OWL-IMPORT-OLD", 0, 1, false );
    SubLFiles.declareFunction( me, "handle_owl_to_cycl_input", "HANDLE-OWL-TO-CYCL-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_start_owl_import", "CB-START-OWL-IMPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_owl_importer", "CB-SHOW-OWL-IMPORTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_owl_importer_internal", "CB-SHOW-OWL-IMPORTER-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_importer_time_so_far", "OWL-IMPORTER-TIME-SO-FAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_show_owl_importer", "CB-LINK-SHOW-OWL-IMPORTER", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_cb_owl_to_cycl_file()
  {
    $owl_importer_stage_descriptions$ = SubLFiles.deflexical( "*OWL-IMPORTER-STAGE-DESCRIPTIONS*", $list59 );
    $cb_owl_import_refresh_interval$ = SubLFiles.defparameter( "*CB-OWL-IMPORT-REFRESH-INTERVAL*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_cb_owl_to_cycl_file()
  {
    Hashtables.sethash( $kw0$CB_OWL_TO_CYCL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str1$cb_owl_to_cycl_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym47$CB_OWL_IMPORT_OLD, $kw48$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym54$HANDLE_OWL_TO_CYCL_INPUT, $kw48$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym63$CB_SHOW_OWL_IMPORTER, $kw48$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw88$SHOW_OWL_IMPORTER, $sym89$CB_LINK_SHOW_OWL_IMPORTER, THREE_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_owl_to_cycl_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_owl_to_cycl_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_owl_to_cycl_file();
  }
  static
  {
    me = new cb_owl_to_cycl();
    $owl_importer_stage_descriptions$ = null;
    $cb_owl_import_refresh_interval$ = null;
    $kw0$CB_OWL_TO_CYCL = makeKeyword( "CB-OWL-TO-CYCL" );
    $str1$cb_owl_to_cycl_html = makeString( "cb-owl-to-cycl.html" );
    $str2$OWL_Importer = makeString( "OWL Importer" );
    $str3$Import_an_OWL_ontology = makeString( "Import an OWL ontology" );
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
    $str16$handle_owl_to_cycl_input = makeString( "handle-owl-to-cycl-input" );
    $kw17$SELF = makeKeyword( "SELF" );
    $str18$Back = makeString( "Back" );
    $str19$Clear = makeString( "Clear" );
    $str20$Submit = makeString( "Submit" );
    $str21$import_owl_file = makeString( "import-owl-file" );
    $str22$Enter_the_URI_you_wish_to_use_to_ = makeString( "Enter the URI you wish to use to identify the ontology:" );
    $str23$uri = makeString( "uri" );
    $int24$60 = makeInteger( 60 );
    $str25$Format_for_term_names_in___synony = makeString( "Format for term names in #$synonymousExternalConcept assertions:" );
    $str26$term_name_format = makeString( "term-name-format" );
    $str27$short = makeString( "short" );
    $str28$Short__local_names_only_ = makeString( "Short (local names only)" );
    $str29$medium = makeString( "medium" );
    $str30$Medium__prefixed_names__using_pre = makeString( "Medium (prefixed names) using prefix: " );
    $str31$uri_prefix = makeString( "uri-prefix" );
    $str32$long = makeString( "long" );
    $str33$Long__full_URIs_ = makeString( "Long (full URIs)" );
    $str34$_Optional__enter_pathname_of_a_fi = makeString( "(Optional) enter pathname of a file to load the ontology from (if not from the URI):" );
    $str35$pathname = makeString( "pathname" );
    $str36$ = makeString( "" );
    $str37$Enter_a_prefix_for_new_constant_n = makeString( "Enter a prefix for new constant names:" );
    $str38$Newly_created_constants_for_terms = makeString( "Newly created constants for terms in the imported ontology will have names that start with this prefix." );
    $str39$constant_prefix = makeString( "constant-prefix" );
    $str40$Enter_a_suffix_for_new_constant_n = makeString( "Enter a suffix for new constant names:" );
    $str41$Newly_created_constants_for_terms = makeString( "Newly created constants for terms in the imported ontology will have names that start with this suffix" );
    $str42$constant_suffix = makeString( "constant-suffix" );
    $str43$_Optional__Enter_an_existing_Cyc_ = makeString( "(Optional) Enter an existing Cyc term that represents the ontology:" );
    $str44$ontology = makeString( "ontology" );
    $str45$Complete = makeString( "Complete" );
    $const46$owl_Ontology = constant_handles.reader_make_constant_shell( makeString( "owl:Ontology" ) );
    $sym47$CB_OWL_IMPORT_OLD = makeSymbol( "CB-OWL-IMPORT-OLD" );
    $kw48$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str49$Bad_source__ = makeString( "Bad source: " );
    $str50$Can_only_import_OWL_ontologies_fr = makeString( "Can only import OWL ontologies from valid files or URLs." );
    $str51$_does_not_appear_to_be_a_URI_ = makeString( " does not appear to be a URI." );
    $str52$Enter_a_prefix_for_Medium_format_ = makeString( "Enter a prefix for Medium format names" );
    $list53 = ConsesLow.list( makeKeyword( "URI" ), makeKeyword( "SOURCE" ), makeKeyword( "CONSTANT-PREFIX" ), makeKeyword( "CONSTANT-SUFFIX" ), makeKeyword( "ONTOLOGY" ), makeKeyword( "PREFIX-EXTERNAL-NAMES?" ),
        makeKeyword( "ABBREVIATE-PREFIXES?" ), makeKeyword( "URI-PREFIX" ) );
    $sym54$HANDLE_OWL_TO_CYCL_INPUT = makeSymbol( "HANDLE-OWL-TO-CYCL-INPUT" );
    $kw55$ONTOLOGY = makeKeyword( "ONTOLOGY" );
    $str56$Importing_ = makeString( "Importing " );
    $str57$OWL_Ontology = makeString( "OWL Ontology" );
    $str58$_Display_Importer_Progress_ = makeString( "[Display Importer Progress]" );
    $list59 = ConsesLow.list( makeString( "Processing Class Definitions" ), makeString( "Processing Property Definitions" ), makeString( "Processing Instance Definitions" ), makeString(
        "Waiting for Enqueued Operations to be Processed" ) );
    $list60 = ConsesLow.list( makeSymbol( "ID-STRING" ), makeSymbol( "REFRESH-STRING" ) );
    $str61$Can_t_interpret__S_as_the_ID_of_a = makeString( "Can't interpret ~S as the ID of an exising OWL importer." );
    $str62$T = makeString( "T" );
    $sym63$CB_SHOW_OWL_IMPORTER = makeSymbol( "CB-SHOW-OWL-IMPORTER" );
    $str64$Status___A_ = makeString( "Status: ~A." );
    $str65$Done = makeString( "Done" );
    $str66$Working = makeString( "Working" );
    $str67$_Total_time___A_ = makeString( " Total time: ~A." );
    $sym68$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const69$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const70$synonymousExternalConcept = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) );
    $str71$Term_count___D_ = makeString( "Term count: ~D." );
    $list72 = ConsesLow.list( makeSymbol( "START-TIME" ), makeSymbol( "PERCENT-DONE" ), makeSymbol( "ELAPSED-SECONDS" ) );
    $str73$_A_ = makeString( "~A:" );
    $int74$100 = makeInteger( 100 );
    $str75$Started_at__A__Elapsed_time___A_ = makeString( "Started at ~A. Elapsed time: ~A." );
    $str76$Estimated_finish_time___A__after_ = makeString( "Estimated finish time: ~A (after ~A)" );
    $str77$Error_Messages___D__ = makeString( "Error Messages (~D):" );
    $list78 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "MESSAGE" ) );
    $str79$_Refresh_ = makeString( "[Refresh]" );
    $str80$_Halt_Auto_Refresh_ = makeString( "[Halt Auto Refresh]" );
    $str81$_Start_Auto_Refresh_ = makeString( "[Start Auto Refresh]" );
    $str82$__Last_refresh___A_ = makeString( " (Last refresh: ~A)" );
    $sym83$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str84$_OWL_Importer_ = makeString( "[OWL Importer " );
    $str85$_ = makeString( "]" );
    $kw86$MAIN = makeKeyword( "MAIN" );
    $str87$cb_show_owl_importer__D__A = makeString( "cb-show-owl-importer&~D&~A" );
    $kw88$SHOW_OWL_IMPORTER = makeKeyword( "SHOW-OWL-IMPORTER" );
    $sym89$CB_LINK_SHOW_OWL_IMPORTER = makeSymbol( "CB-LINK-SHOW-OWL-IMPORTER" );
  }
}
/*
 * 
 * Total time: 347 ms
 * 
 */