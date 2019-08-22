package com.cyc.cycjava.cycl.owl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_owl_importer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.owl.cb_owl_importer";
  public static final String myFingerPrint = "0b5699993fe7cf96a7865f643b04eaa0fc6904660e81e6a0008f43ecc4f41f18";
  private static final SubLString $str0$OWL_Importer;
  private static final SubLSymbol $sym1$CB_OWL_IMPORT;
  private static final SubLSymbol $kw2$HTML_HANDLER;
  private static final SubLSymbol $sym3$FORT_TO_STRING;
  private static final SubLSymbol $sym4$TERMS_FOR_BROWSING;
  private static final SubLSymbol $kw5$TYPE;
  private static final SubLSymbol $kw6$IMPORT_FROM_FILE;
  private static final SubLSymbol $kw7$TERM_NAME_FORMAT;
  private static final SubLSymbol $kw8$SHORT;
  private static final SubLSymbol $kw9$ONTOLOGY_TERM;
  private static final SubLObject $const10$Ontology;
  private static final SubLSymbol $kw11$IMPORT_FILENAME;
  private static final SubLSymbol $kw12$IMPORT_FROM_URI;
  private static final SubLSymbol $kw13$IMPORT_URI;
  private static final SubLString $str14$Import_an_OWL_ontology;
  private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw17$UNINITIALIZED;
  private static final SubLSymbol $kw18$CB_CYC;
  private static final SubLSymbol $kw19$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw20$SHA1;
  private static final SubLString $str21$yui_skin_sam;
  private static final SubLString $str22$reloadFrameButton;
  private static final SubLString $str23$button;
  private static final SubLString $str24$reload;
  private static final SubLString $str25$Refresh_Frames;
  private static final SubLString $str26$post;
  private static final SubLString $str27$cb_owl_import;
  private static final SubLSymbol $kw28$CB_OWL_TO_CYCL;
  private static final SubLSymbol $kw29$SELF;
  private static final SubLString $str30$Back;
  private static final SubLString $str31$Clear;
  private static final SubLString $str32$Import;
  private static final SubLSymbol $kw33$IMPORT;
  private static final SubLString $str34$Choose_the_method_for_determining;
  private static final SubLString $str35$Import_an_ontology_from_a_file_;
  private static final SubLString $str36$_2;
  private static final SubLString $str37$_;
  private static final SubLInteger $int38$60;
  private static final SubLString $str39$_File_not_found_;
  private static final SubLString $str40$Import_an_ontology_from_accessibl;
  private static final SubLString $str41$_Invalid_URI;
  private static final SubLString $str42$Format_for_term_names_in___synony;
  private static final SubLString $str43$Short__local_names_only_;
  private static final SubLSymbol $kw44$MEDIUM;
  private static final SubLString $str45$Medium__prefixed_names__using_pre;
  private static final SubLSymbol $kw46$SYNONYMOUS_CONCEPT_PREFIX;
  private static final SubLSymbol $kw47$LONG;
  private static final SubLString $str48$Long__full_URIs_;
  private static final SubLString $str49$Use_an_existing_Cyc_term_to_repre;
  private static final SubLString $str50$Create_constants_for_OWL_terms_us;
  private static final SubLString $str51$Newly_created_constants_for_terms;
  private static final SubLSymbol $kw52$CONSTANT_PREFIX;
  private static final SubLString $str53$Create_constants_for_OWL_terms_us;
  private static final SubLString $str54$Newly_created_constants_for_terms;
  private static final SubLSymbol $kw55$CONSTANT_SUFFIX;
  private static final SubLSymbol $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES;
  private static final SubLString $str57$Use_namespace_prefixes_as_constan;
  private static final SubLString $str58$When_importing_OWL_that_creates_t;
  private static final SubLString $str59$Override_the_URI_;
  private static final SubLSymbol $kw60$ONTOLOGY_URI;
  private static final SubLString $str61$;
  private static final SubLString $str62$Please_fill_out_the_starred_field;
  private static final SubLSymbol $kw63$VERBOSE_;
  private static final SubLSymbol $kw64$PROGRESS_STREAM;
  private static final SubLString $str65$Importing_an_OWL_ontology;
  private static final SubLSymbol $sym66$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str67$Error_during_import_;
  private static final SubLSymbol $sym68$_EXIT;

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-importer.lisp", position = 872L)
  public static SubLObject cb_owl_import(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str0$OWL_Importer );
    }
    return cb_owl_import_internal( html_arghash.arglist_to_arghash( args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-importer.lisp", position = 1052L)
  public static SubLObject cb_owl_import_internal(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject debug = NIL;
    final SubLObject generation_fn = Symbols.symbol_function( $sym3$FORT_TO_STRING );
    final SubLObject parse_fn = Symbols.symbol_function( $sym4$TERMS_FOR_BROWSING );
    SubLObject initial_entryP = NIL;
    SubLObject errors_foundP = NIL;
    if( NIL == html_arghash.get_arghash_value( $kw5$TYPE, arghash ) )
    {
      initial_entryP = T;
      html_arghash.set_arghash_value( $kw5$TYPE, arghash, $kw6$IMPORT_FROM_FILE );
      html_arghash.set_arghash_value( $kw7$TERM_NAME_FORMAT, arghash, $kw8$SHORT );
    }
    html_arghash.html_arghash_nl_fort_input_validate( arghash, $kw9$ONTOLOGY_TERM, debug, generation_fn, parse_fn, $const10$Ontology, UNPROVIDED );
    if( NIL == initial_entryP && ( ( $kw6$IMPORT_FROM_FILE == html_arghash.get_arghash_value( $kw5$TYPE, arghash ) && NIL != string_utilities.non_empty_stringP( html_arghash.get_arghash_value( $kw11$IMPORT_FILENAME,
        arghash ) ) && NIL != file_utilities.file_existsP( html_arghash.get_arghash_value( $kw11$IMPORT_FILENAME, arghash ) ) ) || ( $kw12$IMPORT_FROM_URI == html_arghash.get_arghash_value( $kw5$TYPE, arghash )
            && NIL != string_utilities.non_empty_stringP( html_arghash.get_arghash_value( $kw13$IMPORT_URI, arghash ) ) && NIL != web_utilities.uri_p( html_arghash.get_arghash_value( $kw13$IMPORT_URI, arghash ),
                UNPROVIDED ) ) ) )
    {
      return cb_owl_perform_import( arghash );
    }
    final SubLObject title_var = $str14$Import_an_OWL_ontology;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str15$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str16$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw17$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw18$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw19$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str21$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str22$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str23$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str24$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str25$Refresh_Frames );
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
            html_utilities.html_markup( $str26$post );
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
              html_utilities.html_hidden_input( $str27$cb_owl_import, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw28$CB_OWL_TO_CYCL, NIL, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              cb_utilities.cb_back_button( $kw29$SELF, $str30$Back );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_reset_input( $str31$Clear );
              html_utilities.html_newline( TWO_INTEGER );
              html_arghash.html_arghash_submit_input( arghash, $str32$Import, $kw33$IMPORT, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str34$Choose_the_method_for_determining );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_arghash.html_arghash_radio_input( arghash, $kw5$TYPE, $kw6$IMPORT_FROM_FILE );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( $str35$Import_an_ontology_from_a_file_ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              SubLObject requiredP = makeBoolean( NIL == initial_entryP && $kw6$IMPORT_FROM_FILE == html_arghash.get_arghash_value( $kw5$TYPE, arghash ) );
              if( NIL != requiredP )
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str36$_2 );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                  {
                    html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str37$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                errors_foundP = T;
              }
              html_arghash.html_arghash_text_input( arghash, $kw11$IMPORT_FILENAME, string_utilities.$empty_string$.getGlobalValue(), $int38$60, UNPROVIDED );
              if( NIL != requiredP )
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str39$_File_not_found_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_arghash.html_arghash_radio_input( arghash, $kw5$TYPE, $kw12$IMPORT_FROM_URI );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( $str40$Import_an_ontology_from_accessibl );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              requiredP = makeBoolean( NIL == initial_entryP && $kw12$IMPORT_FROM_URI == html_arghash.get_arghash_value( $kw5$TYPE, arghash ) );
              if( NIL != requiredP )
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str36$_2 );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                  {
                    html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str37$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                errors_foundP = T;
              }
              html_arghash.html_arghash_text_input( arghash, $kw13$IMPORT_URI, string_utilities.$empty_string$.getGlobalValue(), $int38$60, UNPROVIDED );
              if( NIL != requiredP )
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str41$_Invalid_URI );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_newline( ONE_INTEGER );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ_strong( $str42$Format_for_term_names_in___synony );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_arghash.html_arghash_radio_input( arghash, $kw7$TERM_NAME_FORMAT, $kw8$SHORT );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( $str43$Short__local_names_only_ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_arghash.html_arghash_radio_input( arghash, $kw7$TERM_NAME_FORMAT, $kw44$MEDIUM );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( $str45$Medium__prefixed_names__using_pre );
              html_arghash.html_arghash_text_input( arghash, $kw46$SYNONYMOUS_CONCEPT_PREFIX, string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_arghash.html_arghash_radio_input( arghash, $kw7$TERM_NAME_FORMAT, $kw47$LONG );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( $str48$Long__full_URIs_ );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str49$Use_an_existing_Cyc_term_to_repre );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_arghash.html_arghash_nl_fort_input( arghash, $kw9$ONTOLOGY_TERM, debug, generation_fn, NIL, T, $const10$Ontology );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              cb_query.html_princ_with_explanation( $str50$Create_constants_for_OWL_terms_us, $str51$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_arghash.html_arghash_text_input( arghash, $kw52$CONSTANT_PREFIX, string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              cb_query.html_princ_with_explanation( $str53$Create_constants_for_OWL_terms_us, $str54$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_arghash.html_arghash_text_input( arghash, $kw55$CONSTANT_SUFFIX, string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_arghash.html_arghash_checkbox_input( arghash, $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, T, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              cb_query.html_princ_with_explanation( $str57$Use_namespace_prefixes_as_constan, $str58$When_importing_OWL_that_creates_t, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str59$Override_the_URI_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_arghash.html_arghash_text_input( arghash, $kw60$ONTOLOGY_URI, $str61$, $int38$60, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              if( NIL == initial_entryP || NIL != errors_foundP )
              {
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str62$Please_fill_out_the_starred_field );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_arghash.html_arghash_submit_input( arghash, $str32$Import, $kw33$IMPORT, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-importer.lisp", position = 7064L)
  public static SubLObject cb_owl_perform_import(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ontology_uri = html_arghash.get_arghash_value( $kw13$IMPORT_URI, arghash );
    final SubLObject filename = html_arghash.get_arghash_value( $kw11$IMPORT_FILENAME, arghash );
    final SubLObject constant_prefix = html_arghash.get_arghash_value( $kw52$CONSTANT_PREFIX, arghash );
    final SubLObject constant_suffix = html_arghash.get_arghash_value( $kw55$CONSTANT_SUFFIX, arghash );
    final SubLObject ontology_term = html_arghash.get_arghash_value( $kw9$ONTOLOGY_TERM, arghash );
    final SubLObject term_name_format = html_arghash.get_arghash_value( $kw7$TERM_NAME_FORMAT, arghash );
    final SubLObject synonymous_concept_prefix = html_arghash.get_arghash_value( $kw46$SYNONYMOUS_CONCEPT_PREFIX, arghash );
    final SubLObject use_namespace_prefixes_as_constant_prefixes = html_arghash.get_arghash_value( $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, arghash );
    SubLObject options = ConsesLow.list( $kw63$VERBOSE_, T, $kw64$PROGRESS_STREAM, html_macros.$html_stream$.getDynamicValue( thread ) );
    SubLObject importer = NIL;
    if( NIL != string_utilities.non_empty_stringP( ontology_uri ) )
    {
      options = conses_high.putf( options, $kw60$ONTOLOGY_URI, ontology_uri );
    }
    if( NIL != string_utilities.non_empty_stringP( constant_prefix ) )
    {
      options = conses_high.putf( options, $kw52$CONSTANT_PREFIX, constant_prefix );
    }
    if( NIL != string_utilities.non_empty_stringP( constant_suffix ) )
    {
      options = conses_high.putf( options, $kw55$CONSTANT_SUFFIX, constant_suffix );
    }
    if( NIL != forts.fort_p( ontology_term ) )
    {
      options = conses_high.putf( options, $kw9$ONTOLOGY_TERM, ontology_term );
    }
    if( term_name_format == $kw8$SHORT )
    {
      options = conses_high.putf( options, $kw46$SYNONYMOUS_CONCEPT_PREFIX, $str61$ );
    }
    else if( term_name_format == $kw44$MEDIUM )
    {
      if( NIL != string_utilities.non_empty_stringP( synonymous_concept_prefix ) )
      {
        options = conses_high.putf( options, $kw46$SYNONYMOUS_CONCEPT_PREFIX, synonymous_concept_prefix );
      }
    }
    else if( term_name_format == $kw47$LONG )
    {
      options = conses_high.putf( options, $kw46$SYNONYMOUS_CONCEPT_PREFIX, T );
    }
    if( NIL != use_namespace_prefixes_as_constant_prefixes )
    {
      options = conses_high.putf( options, $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, T );
    }
    final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding( thread );
    try
    {
      StreamsLow.$standard_output$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      SubLObject error_string = NIL;
      final SubLObject title_var = $str65$Importing_an_OWL_ontology;
      final SubLObject _prev_bind_0_$13 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str15$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str16$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$14 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw17$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw18$CB_CYC );
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
          final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str21$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str22$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str23$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str24$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str25$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
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
              html_macros.verify_not_within_html_pre();
              html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
              final SubLObject _prev_bind_0_$18 = html_macros.$within_html_pre$.currentBinding( thread );
              try
              {
                html_macros.$within_html_pre$.bind( T, thread );
                html_utilities.html_flush();
                try
                {
                  thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$19 = Errors.$error_handler$.currentBinding( thread );
                  try
                  {
                    Errors.$error_handler$.bind( $sym66$CATCH_ERROR_MESSAGE_HANDLER, thread );
                    try
                    {
                      if( NIL != file_utilities.file_existsP( filename ) )
                      {
                        if( NIL != string_utilities.non_empty_stringP( ontology_uri ) )
                        {
                          importer = owl_importer2.owl_import_uri_from_file( ontology_uri, filename, options );
                        }
                        else
                        {
                          importer = owl_importer2.owl_import_file( filename, options );
                        }
                      }
                      else
                      {
                        importer = owl_importer2.owl_import_uri( ontology_uri, options );
                      }
                    }
                    catch( final Throwable catch_var )
                    {
                      Errors.handleThrowable( catch_var, NIL );
                    }
                  }
                  finally
                  {
                    Errors.$error_handler$.rebind( _prev_bind_0_$19, thread );
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  error_string = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                }
                finally
                {
                  thread.throwStack.pop();
                }
                if( NIL != error_string )
                {
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                  {
                    html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str67$Error_during_import_ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( error_string );
                }
              }
              finally
              {
                html_macros.$within_html_pre$.rebind( _prev_bind_0_$18, thread );
              }
              html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$15, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$14, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0_$13, thread );
      }
      return importer;
    }
    finally
    {
      StreamsLow.$standard_output$.rebind( _prev_bind_0, thread );
    }
  }

  public static SubLObject declare_cb_owl_importer_file()
  {
    SubLFiles.declareFunction( me, "cb_owl_import", "CB-OWL-IMPORT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_owl_import_internal", "CB-OWL-IMPORT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_owl_perform_import", "CB-OWL-PERFORM-IMPORT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_owl_importer_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_owl_importer_file()
  {
    html_macros.note_cgi_handler_function( $sym1$CB_OWL_IMPORT, $kw2$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_owl_importer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_owl_importer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_owl_importer_file();
  }
  static
  {
    me = new cb_owl_importer();
    $str0$OWL_Importer = makeString( "OWL Importer" );
    $sym1$CB_OWL_IMPORT = makeSymbol( "CB-OWL-IMPORT" );
    $kw2$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym3$FORT_TO_STRING = makeSymbol( "FORT-TO-STRING" );
    $sym4$TERMS_FOR_BROWSING = makeSymbol( "TERMS-FOR-BROWSING" );
    $kw5$TYPE = makeKeyword( "TYPE" );
    $kw6$IMPORT_FROM_FILE = makeKeyword( "IMPORT-FROM-FILE" );
    $kw7$TERM_NAME_FORMAT = makeKeyword( "TERM-NAME-FORMAT" );
    $kw8$SHORT = makeKeyword( "SHORT" );
    $kw9$ONTOLOGY_TERM = makeKeyword( "ONTOLOGY-TERM" );
    $const10$Ontology = constant_handles.reader_make_constant_shell( makeString( "Ontology" ) );
    $kw11$IMPORT_FILENAME = makeKeyword( "IMPORT-FILENAME" );
    $kw12$IMPORT_FROM_URI = makeKeyword( "IMPORT-FROM-URI" );
    $kw13$IMPORT_URI = makeKeyword( "IMPORT-URI" );
    $str14$Import_an_OWL_ontology = makeString( "Import an OWL ontology" );
    $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str16$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw17$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw18$CB_CYC = makeKeyword( "CB-CYC" );
    $kw19$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw20$SHA1 = makeKeyword( "SHA1" );
    $str21$yui_skin_sam = makeString( "yui-skin-sam" );
    $str22$reloadFrameButton = makeString( "reloadFrameButton" );
    $str23$button = makeString( "button" );
    $str24$reload = makeString( "reload" );
    $str25$Refresh_Frames = makeString( "Refresh Frames" );
    $str26$post = makeString( "post" );
    $str27$cb_owl_import = makeString( "cb-owl-import" );
    $kw28$CB_OWL_TO_CYCL = makeKeyword( "CB-OWL-TO-CYCL" );
    $kw29$SELF = makeKeyword( "SELF" );
    $str30$Back = makeString( "Back" );
    $str31$Clear = makeString( "Clear" );
    $str32$Import = makeString( "Import" );
    $kw33$IMPORT = makeKeyword( "IMPORT" );
    $str34$Choose_the_method_for_determining = makeString( "Choose the method for determining the import OWL:" );
    $str35$Import_an_ontology_from_a_file_ = makeString( "Import an ontology from a file:" );
    $str36$_2 = makeString( "+2" );
    $str37$_ = makeString( "*" );
    $int38$60 = makeInteger( 60 );
    $str39$_File_not_found_ = makeString( " File not found." );
    $str40$Import_an_ontology_from_accessibl = makeString( "Import an ontology from accessible URI:" );
    $str41$_Invalid_URI = makeString( " Invalid URI" );
    $str42$Format_for_term_names_in___synony = makeString( "Format for term names in #$synonymousExternalConcept assertions:" );
    $str43$Short__local_names_only_ = makeString( "Short (local names only)" );
    $kw44$MEDIUM = makeKeyword( "MEDIUM" );
    $str45$Medium__prefixed_names__using_pre = makeString( "Medium (prefixed names) using prefix: " );
    $kw46$SYNONYMOUS_CONCEPT_PREFIX = makeKeyword( "SYNONYMOUS-CONCEPT-PREFIX" );
    $kw47$LONG = makeKeyword( "LONG" );
    $str48$Long__full_URIs_ = makeString( "Long (full URIs)" );
    $str49$Use_an_existing_Cyc_term_to_repre = makeString( "Use an existing Cyc term to represent the ontology:" );
    $str50$Create_constants_for_OWL_terms_us = makeString( "Create constants for OWL terms using prefix:" );
    $str51$Newly_created_constants_for_terms = makeString( "Newly created constants for terms in the imported ontology will have names that start with this prefix." );
    $kw52$CONSTANT_PREFIX = makeKeyword( "CONSTANT-PREFIX" );
    $str53$Create_constants_for_OWL_terms_us = makeString( "Create constants for OWL terms using suffix:" );
    $str54$Newly_created_constants_for_terms = makeString( "Newly created constants for terms in the imported ontology will have names that end with this suffix" );
    $kw55$CONSTANT_SUFFIX = makeKeyword( "CONSTANT-SUFFIX" );
    $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES = makeKeyword( "USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES" );
    $str57$Use_namespace_prefixes_as_constan = makeString( "Use namespace prefixes as constant prefixes" );
    $str58$When_importing_OWL_that_creates_t = makeString( "When importing OWL that creates terms in multiple namespaces, use the namespace prefix from the OWL to create Cyc constants." );
    $str59$Override_the_URI_ = makeString( "Override the URI:" );
    $kw60$ONTOLOGY_URI = makeKeyword( "ONTOLOGY-URI" );
    $str61$ = makeString( "" );
    $str62$Please_fill_out_the_starred_field = makeString( "Please fill out the starred fields" );
    $kw63$VERBOSE_ = makeKeyword( "VERBOSE?" );
    $kw64$PROGRESS_STREAM = makeKeyword( "PROGRESS-STREAM" );
    $str65$Importing_an_OWL_ontology = makeString( "Importing an OWL ontology" );
    $sym66$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str67$Error_during_import_ = makeString( "Error during import:" );
    $sym68$_EXIT = makeSymbol( "%EXIT" );
  }
}
/*
 * 
 * Total time: 498 ms
 * 
 */