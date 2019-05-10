package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_import_concept_name
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name";
  public static final String myFingerPrint = "6a6b87680c1a2493b699651e13984938104f7b9e737498b32d89d8cd5fcb58da";
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 2620L)
  public static SubLSymbol $wni_name_input_width$;
  private static final SubLSymbol $sym0$LISTP;
  private static final SubLString $str1$WordNet_Import___Name;
  private static final SubLSymbol $sym2$WNI_CONCEPT_NAME;
  private static final SubLSymbol $kw3$HTML_HANDLER;
  private static final SubLString $str4$synset_id;
  private static final SubLString $str5$genl_terms;
  private static final SubLString $str6$auto_suffix;
  private static final SubLString $str7$name;
  private static final SubLString $str8$workflow_alist;
  private static final SubLSymbol $sym9$WNI_CONCEPT_NAME_INPUT;
  private static final SubLInteger $int10$80;
  private static final SubLSymbol $sym11$NAUT_P;
  private static final SubLSymbol $sym12$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym13$FORT_P;
  private static final SubLSymbol $sym14$BOOLEANP;
  private static final SubLString $str15$Is_this_a_good_name_for_the_;
  private static final SubLString $str16$_Synonym_Set__;
  private static final SubLString $str17$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str18$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw19$UNINITIALIZED;
  private static final SubLSymbol $kw20$CB_CYC;
  private static final SubLSymbol $kw21$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw22$SHA1;
  private static final SubLString $str23$yui_skin_sam;
  private static final SubLString $str24$reloadFrameButton;
  private static final SubLString $str25$button;
  private static final SubLString $str26$reload;
  private static final SubLString $str27$Refresh_Frames;
  private static final SubLString $str28$post;
  private static final SubLString $str29$wni_concept_name_input;
  private static final SubLString $str30$_S;
  private static final SubLSymbol $kw31$GENLS;
  private static final SubLSymbol $kw32$ISA;
  private static final SubLString $str33$Verify_This_Name___;
  private static final SubLString $str34$Auto_Suffix;
  private static final SubLString $str35$Next;
  private static final SubLString $str36$next;
  private static final SubLSymbol $kw37$CB_WORDNET_IMPORT_CONCEPT_NAME;
  private static final SubLSymbol $sym38$STRINGP;
  private static final SubLString $str39$_;
  private static final SubLString $str40$Something;
  private static final SubLString $str41$Someone;
  private static final SubLObject $const42$Verb;
  private static final SubLString $str43$;
  private static final SubLObject $const44$WNVerbFrame_8;
  private static final SubLString $str45$_Something;
  private static final SubLObject $const46$WNVerbFrame_2;
  private static final SubLObject $const47$WNVerbFrame_1;
  private static final SubLObject $const48$WNVerbFrame_9;
  private static final SubLString $str49$_Someone;
  private static final SubLObject $const50$WNVerbFrame_11;
  private static final SubLObject $const51$WNVerbFrame_22;
  private static final SubLObject $const52$WNVerbFrame_4;
  private static final SubLSymbol $kw53$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym54$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str55$_make_me_unique_;
  private static final SubLSymbol $sym56$CONSTANT_P;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 969L)
  public static SubLObject wni_concept_name(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str1$WordNet_Import___Name );
    }
    else
    {
      final SubLObject synset = args.first();
      final SubLObject genl_terms = conses_high.second( args );
      final SubLObject workflow_alist = conses_high.third( args );
      wni_concept_name_internal( synset, genl_terms, workflow_alist, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 1731L)
  public static SubLObject wni_concept_name_input(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string( html_utilities.html_extract_input( $str4$synset_id, args ) );
    final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input( html_utilities.html_extract_input( $str5$genl_terms, args ) );
    final SubLObject auto_suffixP = list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str6$auto_suffix, args ) );
    final SubLObject name = html_utilities.html_extract_input( $str7$name, args );
    final SubLObject workflow_alist = reader.read_from_string( html_utilities.html_extract_input( $str8$workflow_alist, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != auto_suffixP )
    {
      wni_concept_name_internal( synset, genl_terms, workflow_alist, auto_suffixP );
    }
    else
    {
      cb_wordnet_import_comment.wni_concept_comment( ConsesLow.list( synset, genl_terms, name, workflow_alist ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 3228L)
  public static SubLObject wni_concept_name_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject workflow_alist, final SubLObject auto_suffixP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( auto_suffixP ) : auto_suffixP;
    if( NIL != agenda.agenda_running() )
    {
      agenda.halt_agenda( UNPROVIDED );
    }
    final SubLObject pos_desc = conses_high.assoc( wordnet_import.wni_synset_pos( synset ), wordnet_import.$wni_pos_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject title = Sequences.cconcatenate( $str15$Is_this_a_good_name_for_the_, new SubLObject[] { pos_desc, $str16$_Synonym_Set__, wordnet_import.wni_synset_wXo_links( synset )
    } );
    final SubLObject name = wni_suggest_name( synset, genl_terms, auto_suffixP );
    final SubLObject title_var = title;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str17$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str18$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw19$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw20$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw21$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str23$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str24$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str25$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str26$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str27$Refresh_Frames );
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
            html_utilities.html_markup( $str28$post );
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
              html_utilities.html_hidden_input( $str29$wni_concept_name_input, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str4$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( synset ) ), UNPROVIDED );
              html_utilities.html_hidden_input( $str5$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input( genl_terms ), UNPROVIDED );
              html_utilities.html_hidden_input( $str8$workflow_alist, PrintLow.format( NIL, $str30$_S, workflow_alist ), UNPROVIDED );
              SubLObject cdolist_list_var2 = genl_terms;
              SubLObject genl_term = NIL;
              genl_term = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                cb_wordnet_utilities.wni_html_termXcomment( genl_term, T );
                cdolist_list_var2 = cdolist_list_var2.rest();
                genl_term = cdolist_list_var2.first();
              }
              cb_wordnet_utilities.wni_html_up_arrow( ( NIL != wordnet_import.wni_synset_collectionP( synset ) ) ? $kw31$GENLS : $kw32$ISA );
              cb_wordnet_utilities.wni_html_synset_words_gloss_examples( synset, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str33$Verify_This_Name___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_script_utilities.html_clear_input_button( $str7$name, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              if( NIL == string_utilities.ends_with( name, wni_best_genl_name( genl_terms ), UNPROVIDED ) )
              {
                html_utilities.html_submit_input( $str34$Auto_Suffix, $str6$auto_suffix, UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
              }
              html_utilities.html_submit_input( $str35$Next, $str36$next, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_text_input( $str7$name, name, $wni_name_input_width$.getDynamicValue( thread ) );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw37$CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED );
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
    agenda.ensure_agenda_running();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 5118L)
  public static SubLObject wni_suggest_name(final SubLObject synset, final SubLObject genl_terms, final SubLObject auto_suffixP)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( auto_suffixP ) : auto_suffixP;
    SubLObject name = ( NIL != wordnet_import.wni_synset_collectionP( synset ) ) ? wni_suggest_name_for_collection( synset, genl_terms ) : wni_suggest_name_for_individual( synset, genl_terms );
    if( NIL != auto_suffixP )
    {
      name = wni_auto_suffix( name, genl_terms );
    }
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 5877L)
  public static SubLObject wni_auto_suffix(SubLObject name, final SubLObject genl_terms)
  {
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject suffixed_name = NIL;
    final SubLObject suffix = Sequences.cconcatenate( $str39$_, wni_best_genl_name( genl_terms ) );
    if( NIL != string_utilities.ends_with( name, suffix, UNPROVIDED ) )
    {
      suffixed_name = name;
    }
    else
    {
      final SubLObject name_last_word = wni_last_word( name );
      final SubLObject suffix_last_word = wni_last_word( suffix );
      if( NIL != Strings.stringE( name_last_word, suffix_last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        name = string_utilities.post_remove( name, name_last_word, UNPROVIDED );
      }
      if( NIL != string_utilities.ends_with( name, $str40$Something, UNPROVIDED ) )
      {
        name = string_utilities.post_remove( name, $str40$Something, UNPROVIDED );
      }
      if( NIL != string_utilities.ends_with( name, $str41$Someone, UNPROVIDED ) )
      {
        name = string_utilities.post_remove( name, $str41$Someone, UNPROVIDED );
      }
      suffixed_name = Sequences.cconcatenate( name, suffix );
    }
    assert NIL != Types.stringp( suffixed_name ) : suffixed_name;
    return suffixed_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 6767L)
  public static SubLObject wni_last_word(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    SubLObject last_word = NIL;
    final SubLObject words = string_utilities.relevant_substrings( name );
    if( NIL != list_utilities.singletonP( words ) )
    {
      last_word = name;
    }
    else
    {
      last_word = string_utilities.capitalize_first( list_utilities.last_one( words ) );
    }
    assert NIL != Types.stringp( last_word ) : last_word;
    return last_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 7238L)
  public static SubLObject wni_suggest_name_for_collection(final SubLObject synset, final SubLObject genl_terms)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject pos = wordnet_import.wni_synset_pos( synset );
    final SubLObject name = pos.eql( $const42$Verb ) ? wni_suggest_name_for_verb( synset, genl_terms ) : wni_suggest_name_for_noun_collection( synset, genl_terms );
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 7797L)
  public static SubLObject wni_suggest_name_for_noun_collection(final SubLObject synset, final SubLObject genl_terms)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject name = wni_unique_constant_name( wordnet_import.wni_synset_words( synset ).first(), synset, genl_terms );
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 8276L)
  public static SubLObject wni_suggest_name_for_verb(final SubLObject synset, final SubLObject genl_terms)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject words = string_utilities.split_string( wordnet_import.wni_synset_words( synset ).first(), UNPROVIDED );
    final SubLObject first_word = wni_infinitive_to_pres_participle( words.first() );
    SubLObject name = string_utilities.bunge( ConsesLow.append( ConsesLow.list( first_word ), words.rest() ), UNPROVIDED );
    final SubLObject verb_frame = wordnet_import.wni_most_general_synset_verb_frame( synset );
    SubLObject suffix = $str43$;
    final SubLObject pcase_var = verb_frame;
    if( pcase_var.eql( $const44$WNVerbFrame_8 ) )
    {
      suffix = $str45$_Something;
    }
    else if( pcase_var.eql( $const46$WNVerbFrame_2 ) )
    {
      suffix = $str43$;
    }
    else if( pcase_var.eql( $const47$WNVerbFrame_1 ) )
    {
      suffix = $str43$;
    }
    else if( pcase_var.eql( $const48$WNVerbFrame_9 ) )
    {
      suffix = $str49$_Someone;
    }
    else if( pcase_var.eql( $const50$WNVerbFrame_11 ) )
    {
      suffix = $str45$_Something;
    }
    else if( pcase_var.eql( $const51$WNVerbFrame_22 ) )
    {
      suffix = $str43$;
    }
    else if( pcase_var.eql( $const52$WNVerbFrame_4 ) )
    {
      suffix = $str43$;
    }
    name = wni_unique_constant_name( Sequences.cconcatenate( name, suffix ), synset, genl_terms );
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 9623L)
  public static SubLObject wni_infinitive_to_pres_participle(final SubLObject word)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( word ) : word;
    SubLObject pres_participle = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw53$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym54$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          pres_participle = morphology.infinitive_to_pres_participle( word );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw53$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == pres_participle )
    {
      pres_participle = word;
    }
    assert NIL != Types.stringp( pres_participle ) : pres_participle;
    return pres_participle;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 10043L)
  public static SubLObject wni_suggest_name_for_individual(final SubLObject synset, final SubLObject genl_terms)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject name = NIL;
    final SubLObject synset_words = wordnet_import.wni_synset_words( synset );
    SubLObject longest_word = $str43$;
    SubLObject cdolist_list_var2 = synset_words;
    SubLObject synset_word = NIL;
    synset_word = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( Sequences.length( synset_word ).numG( Sequences.length( longest_word ) ) )
      {
        longest_word = synset_word;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      synset_word = cdolist_list_var2.first();
    }
    name = wni_unique_constant_name( longest_word, synset, genl_terms );
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 10690L)
  public static SubLObject wni_unique_constant_name(final SubLObject name, final SubLObject synset, final SubLObject genl_terms)
  {
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject best_genl_name = wni_best_genl_name( genl_terms );
    SubLObject unique_name = string_utilities.make_valid_constant_name( name, T );
    unique_name = string_utilities.remove_substring( unique_name, $str39$_ );
    unique_name = wni_suggest_name_checking_word_sense_frequency( unique_name, synset, best_genl_name );
    if( NIL == constant_completion_high.constant_name_available( unique_name ) && NIL == string_utilities.ends_with( name, best_genl_name, UNPROVIDED ) )
    {
      unique_name = Sequences.cconcatenate( unique_name, new SubLObject[] { $str39$_, wni_best_genl_name( genl_terms )
      } );
    }
    if( NIL == constant_completion_high.constant_name_available( unique_name ) )
    {
      unique_name = Sequences.cconcatenate( unique_name, new SubLObject[] { $str39$_, $str55$_make_me_unique_
      } );
    }
    unique_name = string_utilities.capitalize_first( unique_name );
    assert NIL != Types.stringp( unique_name ) : unique_name;
    return unique_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 11575L)
  public static SubLObject wni_suggest_name_checking_word_sense_frequency(SubLObject name, final SubLObject synset, final SubLObject best_genl_name)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.stringp( best_genl_name ) : best_genl_name;
    if( NIL != string_utilities.ends_with( name, best_genl_name, UNPROVIDED ) )
    {
      return name;
    }
    final SubLObject first_synset_word = wordnet_import.wni_synset_words( synset ).first();
    SubLObject word_sense_synsets = wordnet_import.wni_synsets_for_english_word_stringXpos( first_synset_word, wordnet_import.wni_synset_pos( synset ) );
    SubLObject word_sense_synset = NIL;
    SubLObject inferior_word_senseP = NIL;
    SubLObject doneP = NIL;
    if( NIL != list_utilities.singletonP( word_sense_synsets ) )
    {
      return name;
    }
    while ( NIL == doneP)
    {
      if( NIL != word_sense_synsets )
      {
        word_sense_synset = word_sense_synsets.first();
        word_sense_synsets = word_sense_synsets.rest();
        if( NIL != wordnet_import.wni_synsets_equal( synset, word_sense_synset ) )
        {
          doneP = T;
        }
        else
        {
          if( NIL == Strings.stringE( first_synset_word, wordnet_import.wni_synset_words( word_sense_synset ).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            continue;
          }
          inferior_word_senseP = T;
          doneP = T;
        }
      }
      else
      {
        doneP = T;
      }
    }
    if( NIL != inferior_word_senseP )
    {
      name = Sequences.cconcatenate( name, new SubLObject[] { $str39$_, best_genl_name
      } );
    }
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 13315L)
  public static SubLObject wni_best_genl_name(final SubLObject genl_terms)
  {
    assert NIL != Types.listp( genl_terms ) : genl_terms;
    SubLObject name = NIL;
    name = constants_high.constant_name( genls.min_col( wni_non_constants_replaced_with_genl_constants( genl_terms ), UNPROVIDED, UNPROVIDED ) );
    assert NIL != Types.stringp( name ) : name;
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-concept-name.lisp", position = 13749L)
  public static SubLObject wni_non_constants_replaced_with_genl_constants(final SubLObject terms)
  {
    assert NIL != Types.listp( terms ) : terms;
    SubLObject constant_terms = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constant_handles.constant_p( v_term ) )
      {
        constant_terms = ConsesLow.cons( v_term, constant_terms );
      }
      else
      {
        constant_terms = ConsesLow.append( wni_non_constants_replaced_with_genl_constants( genls.genls( v_term, UNPROVIDED, UNPROVIDED ) ), constant_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    final SubLObject list_var = constant_terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != constant_handles.constant_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return constant_terms;
  }

  public static SubLObject declare_cb_wordnet_import_concept_name_file()
  {
    SubLFiles.declareFunction( me, "wni_concept_name", "WNI-CONCEPT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_name_input", "WNI-CONCEPT-NAME-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_name_internal", "WNI-CONCEPT-NAME-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_name", "WNI-SUGGEST-NAME", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_auto_suffix", "WNI-AUTO-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_last_word", "WNI-LAST-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_name_for_collection", "WNI-SUGGEST-NAME-FOR-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_name_for_noun_collection", "WNI-SUGGEST-NAME-FOR-NOUN-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_name_for_verb", "WNI-SUGGEST-NAME-FOR-VERB", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_infinitive_to_pres_participle", "WNI-INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_name_for_individual", "WNI-SUGGEST-NAME-FOR-INDIVIDUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_unique_constant_name", "WNI-UNIQUE-CONSTANT-NAME", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_name_checking_word_sense_frequency", "WNI-SUGGEST-NAME-CHECKING-WORD-SENSE-FREQUENCY", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_best_genl_name", "WNI-BEST-GENL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_non_constants_replaced_with_genl_constants", "WNI-NON-CONSTANTS-REPLACED-WITH-GENL-CONSTANTS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_wordnet_import_concept_name_file()
  {
    $wni_name_input_width$ = SubLFiles.defparameter( "*WNI-NAME-INPUT-WIDTH*", $int10$80 );
    return NIL;
  }

  public static SubLObject setup_cb_wordnet_import_concept_name_file()
  {
    html_macros.note_cgi_handler_function( $sym2$WNI_CONCEPT_NAME, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym9$WNI_CONCEPT_NAME_INPUT, $kw3$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_wordnet_import_concept_name_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_wordnet_import_concept_name_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_wordnet_import_concept_name_file();
  }
  static
  {
    me = new cb_wordnet_import_concept_name();
    $wni_name_input_width$ = null;
    $sym0$LISTP = makeSymbol( "LISTP" );
    $str1$WordNet_Import___Name = makeString( "WordNet Import - Name" );
    $sym2$WNI_CONCEPT_NAME = makeSymbol( "WNI-CONCEPT-NAME" );
    $kw3$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str4$synset_id = makeString( "synset-id" );
    $str5$genl_terms = makeString( "genl-terms" );
    $str6$auto_suffix = makeString( "auto-suffix" );
    $str7$name = makeString( "name" );
    $str8$workflow_alist = makeString( "workflow-alist" );
    $sym9$WNI_CONCEPT_NAME_INPUT = makeSymbol( "WNI-CONCEPT-NAME-INPUT" );
    $int10$80 = makeInteger( 80 );
    $sym11$NAUT_P = makeSymbol( "NAUT-P" );
    $sym12$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym13$FORT_P = makeSymbol( "FORT-P" );
    $sym14$BOOLEANP = makeSymbol( "BOOLEANP" );
    $str15$Is_this_a_good_name_for_the_ = makeString( "Is this a good name for the " );
    $str16$_Synonym_Set__ = makeString( " Synonym Set  " );
    $str17$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str18$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw19$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw20$CB_CYC = makeKeyword( "CB-CYC" );
    $kw21$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw22$SHA1 = makeKeyword( "SHA1" );
    $str23$yui_skin_sam = makeString( "yui-skin-sam" );
    $str24$reloadFrameButton = makeString( "reloadFrameButton" );
    $str25$button = makeString( "button" );
    $str26$reload = makeString( "reload" );
    $str27$Refresh_Frames = makeString( "Refresh Frames" );
    $str28$post = makeString( "post" );
    $str29$wni_concept_name_input = makeString( "wni-concept-name-input" );
    $str30$_S = makeString( "~S" );
    $kw31$GENLS = makeKeyword( "GENLS" );
    $kw32$ISA = makeKeyword( "ISA" );
    $str33$Verify_This_Name___ = makeString( "Verify This Name:  " );
    $str34$Auto_Suffix = makeString( "Auto Suffix" );
    $str35$Next = makeString( "Next" );
    $str36$next = makeString( "next" );
    $kw37$CB_WORDNET_IMPORT_CONCEPT_NAME = makeKeyword( "CB-WORDNET-IMPORT-CONCEPT-NAME" );
    $sym38$STRINGP = makeSymbol( "STRINGP" );
    $str39$_ = makeString( "-" );
    $str40$Something = makeString( "Something" );
    $str41$Someone = makeString( "Someone" );
    $const42$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $str43$ = makeString( "" );
    $const44$WNVerbFrame_8 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-8" ) );
    $str45$_Something = makeString( " Something" );
    $const46$WNVerbFrame_2 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-2" ) );
    $const47$WNVerbFrame_1 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-1" ) );
    $const48$WNVerbFrame_9 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-9" ) );
    $str49$_Someone = makeString( " Someone" );
    $const50$WNVerbFrame_11 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-11" ) );
    $const51$WNVerbFrame_22 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-22" ) );
    $const52$WNVerbFrame_4 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-4" ) );
    $kw53$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym54$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str55$_make_me_unique_ = makeString( "<make-me-unique>" );
    $sym56$CONSTANT_P = makeSymbol( "CONSTANT-P" );
  }
}
/*
 * 
 * Total time: 227 ms
 * 
 */