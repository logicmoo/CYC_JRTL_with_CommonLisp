package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_import_new_words
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_new_words";
  public static final String myFingerPrint = "ddab6f5e0be1c3015f22a5c2addfe2a0439453bea0a05600975d9f3c45f2f1c9";
  private static final SubLSymbol $sym0$LISTP;
  private static final SubLString $str1$WordNet_Import___New_Words;
  private static final SubLSymbol $sym2$WNI_NEW_WORDS;
  private static final SubLSymbol $kw3$HTML_HANDLER;
  private static final SubLString $str4$synset_id;
  private static final SubLString $str5$genl_terms;
  private static final SubLString $str6$matched_term_name;
  private static final SubLString $str7$finish;
  private static final SubLString $str8$workflow_alist;
  private static final SubLSymbol $sym9$WNI_NEW_WORDS_INPUT;
  private static final SubLSymbol $sym10$NAUT_P;
  private static final SubLSymbol $sym11$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym12$FORT_P;
  private static final SubLSymbol $sym13$STRINGP;
  private static final SubLSymbol $sym14$ALIST_P;
  private static final SubLSymbol $sym15$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const16$EverythingPSC;
  private static final SubLString $str17$Characterize_the_words_of_the_;
  private static final SubLString $str18$_Synonym_Set__;
  private static final SubLString $str19$unmapped_hypernym_chain;
  private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw22$UNINITIALIZED;
  private static final SubLSymbol $kw23$CB_CYC;
  private static final SubLSymbol $kw24$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw25$SHA1;
  private static final SubLString $str26$yui_skin_sam;
  private static final SubLString $str27$reloadFrameButton;
  private static final SubLString $str28$button;
  private static final SubLString $str29$reload;
  private static final SubLString $str30$Refresh_Frames;
  private static final SubLString $str31$post;
  private static final SubLString $str32$wni_new_words_input;
  private static final SubLString $str33$_S;
  private static final SubLString $str34$cb_wordnet_import_new_words;
  private static final SubLString $str35$Finish;
  private static final SubLString $str36$Next;
  private static final SubLString $str37$next;
  private static final SubLSymbol $sym38$SME_LI_DENOTATIONAL;
  private static final SubLSymbol $sym39$NEW;
  private static final SubLString $str40$left;
  private static final SubLString $str41$1_;
  private static final SubLSymbol $kw42$NBSP;
  private static final SubLString $str43$right;
  private static final SubLString $str44$99_;
  private static final SubLString $str45$_included;
  private static final SubLString $str46$t;
  private static final SubLString $str47$Include_this_word_as_a_denotation;
  private static final SubLObject $const48$Noun;
  private static final SubLString $str49$Which_of_the_following_sounds_bes;
  private static final SubLString $str50$_count_noun;
  private static final SubLString $str51$_;
  private static final SubLString $str52$headword_is_first;
  private static final SubLString $str53$nil;
  private static final SubLString $str54$_formality;
  private static final SubLString $str55$standard;
  private static final SubLString $str56$_standard__;
  private static final SubLString $str57$formal;
  private static final SubLString $str58$_formal__;
  private static final SubLString $str59$informal;
  private static final SubLString $str60$_informal__;
  private static final SubLString $str61$slang;
  private static final SubLString $str62$_slang__;
  private static final SubLString $str63$technical_jargon;
  private static final SubLString $str64$_technical_jargon__;
  private static final SubLString $str65$archaic;
  private static final SubLString $str66$_archaic__;
  private static final SubLString $str67$baby_talk;
  private static final SubLString $str68$_baby_talk;
  private static final SubLString $str69$_politeness;
  private static final SubLString $str70$polite;
  private static final SubLString $str71$_polite__;
  private static final SubLString $str72$rude;
  private static final SubLString $str73$_rude__;
  private static final SubLString $str74$vulgar;
  private static final SubLString $str75$_vulgar__;
  private static final SubLString $str76$_rhetorical_device;
  private static final SubLString $str77$literal;
  private static final SubLString $str78$_literal__;
  private static final SubLString $str79$metaphor;
  private static final SubLString $str80$_metaphor__;
  private static final SubLString $str81$simile;
  private static final SubLString $str82$_simile__;
  private static final SubLString $str83$euphemism;
  private static final SubLString $str84$_euphemism__;
  private static final SubLString $str85$literal___the_exact_meaning_of_th;
  private static final SubLString $str86$metaphor___a_figure_of_speech_in_;
  private static final SubLString $str87$simile___a_figure_of_speech_that_;
  private static final SubLString $str88$euphemism___an_inoffensive_expres;
  private static final SubLString $str89$ism;
  private static final SubLString $str90$ief;
  private static final SubLString $str91$cor;
  private static final SubLString $str92$cour;
  private static final SubLString $str93$ion;
  private static final SubLString $str94$are;
  private static final SubLString $str95$aid;
  private static final SubLString $str96$ing;
  private static final SubLString $str97$al;
  private static final SubLString $str98$ence;
  private static final SubLString $str99$ance;
  private static final SubLString $str100$iny;
  private static final SubLString $str101$ness;
  private static final SubLSymbol $sym102$DERIVE_PART_OF_SPEECH_EXAMPLE;
  private static final SubLObject $const103$CountNoun;
  private static final SubLObject $const104$Thing;
  private static final SubLString $str105$_;
  private static final SubLString $str106$_is_a_count_noun_;
  private static final SubLObject $const107$MassNoun;
  private static final SubLString $str108$_is_a_mass_noun_;
  private static final SubLSymbol $sym109$CONSP;
  private static final SubLSymbol $sym110$BOOLEANP;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 952L)
  public static SubLObject wni_new_words(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str1$WordNet_Import___New_Words );
    }
    else
    {
      final SubLObject synset = args.first();
      final SubLObject genl_terms = conses_high.second( args );
      final SubLObject matched_term_name = conses_high.third( args );
      final SubLObject workflow_alist = conses_high.fourth( args );
      wni_new_words_internal( synset, genl_terms, matched_term_name, workflow_alist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 1706L)
  public static SubLObject wni_new_words_input(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string( html_utilities.html_extract_input( $str4$synset_id, args ) );
    final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input( html_utilities.html_extract_input( $str5$genl_terms, args ) );
    final SubLObject matched_term_name = html_utilities.html_extract_input( $str6$matched_term_name, args );
    final SubLObject finishP = list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str7$finish, args ) );
    SubLObject workflow_alist = reader.read_from_string( html_utilities.html_extract_input( $str8$workflow_alist, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    workflow_alist = wni_augment_workflow_alist_with_lexical_annotations( synset, args, workflow_alist );
    wni_new_words_input_internal( synset, genl_terms, matched_term_name, workflow_alist, finishP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 2477L)
  public static SubLObject wni_new_words_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term_name, final SubLObject workflow_alist)
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
    if( NIL != matched_term_name && !assertionsDisabledInClass && NIL == Types.stringp( matched_term_name ) )
    {
      throw new AssertionError( matched_term_name );
    }
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    if( NIL != agenda.agenda_running() )
    {
      agenda.halt_agenda( UNPROVIDED );
    }
    SubLObject comment = NIL;
    if( NIL != matched_term_name && NIL == string_utilities.empty_string_p( matched_term_name ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym15$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const16$EverythingPSC, thread );
        comment = kb_accessors.comment( czer_main.canonicalize_term_assert( cb_utilities.cb_guess_term( matched_term_name, UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject pos_desc = conses_high.assoc( wordnet_import.wni_synset_pos( synset ), wordnet_import.$wni_pos_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject title = Sequences.cconcatenate( $str17$Characterize_the_words_of_the_, new SubLObject[] { pos_desc, $str18$_Synonym_Set__, wordnet_import.wni_synset_wXo_links( synset )
    } );
    final SubLObject synset_words = wordnet_import.wni_synset_words( synset );
    final SubLObject finish_buttonP = makeBoolean( NIL != list_utilities.sublisp_boolean( comment ) && NIL == list_utilities.alist_lookup( workflow_alist, $str19$unmapped_hypernym_chain, EQUAL, UNPROVIDED ) );
    final SubLObject any_hyponym_an_individualP = wordnet_import.wni_any_hyponym_an_individual( synset );
    final SubLObject title_var = title;
    final SubLObject _prev_bind_3 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
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
          html_utilities.html_markup( $str26$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str27$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str28$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str29$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str30$Refresh_Frames );
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
            html_utilities.html_markup( $str31$post );
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
            final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str32$wni_new_words_input, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str4$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( synset ) ), UNPROVIDED );
              html_utilities.html_hidden_input( $str5$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input( genl_terms ), UNPROVIDED );
              html_utilities.html_hidden_input( $str6$matched_term_name, matched_term_name, UNPROVIDED );
              html_utilities.html_hidden_input( $str8$workflow_alist, PrintLow.format( NIL, $str33$_S, workflow_alist ), UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_help_preamble( $str34$cb_wordnet_import_new_words, UNPROVIDED, UNPROVIDED );
              if( NIL != finish_buttonP )
              {
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str35$Finish, $str7$finish, UNPROVIDED );
              }
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str36$Next, $str37$next, UNPROVIDED );
              final SubLObject sme_li_denotational = methods.funcall_class_method_with_0_args( $sym38$SME_LI_DENOTATIONAL, $sym39$NEW );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ONE_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var2 = synset_words;
                SubLObject synset_word = NIL;
                synset_word = cdolist_list_var2.first();
                while ( NIL != cdolist_list_var2)
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( ZERO_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( FIVE_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( ZERO_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $str40$left ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( $str41$1_ );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_glyph( $kw42$NBSP, UNPROVIDED );
                            html_utilities.html_princ_formatted_string( synset_word );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $str43$right ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( $str44$99_ );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_checkbox_input( Sequences.cconcatenate( synset_word, $str45$_included ), $str46$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            html_utilities.html_indent( TWO_INTEGER );
                            html_utilities.html_princ( $str47$Include_this_word_as_a_denotation );
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
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                      html_utilities.html_newline( UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( ZERO_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( FIVE_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( ZERO_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_indent( TWO_INTEGER );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            if( NIL != wordnet_import.wni_synset_collectionP( synset ) && $const48$Noun.eql( wordnet_import.wni_synset_pos( synset ) ) )
                            {
                              final SubLObject likely_count_nounP = makeBoolean( NIL != any_hyponym_an_individualP || NIL != wni_likely_count_noun( synset_word ) );
                              html_utilities.html_newline( UNPROVIDED );
                              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                              html_utilities.html_princ( $str49$Which_of_the_following_sounds_bes );
                              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                              html_utilities.html_newline( UNPROVIDED );
                              html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str50$_count_noun ), $str46$t, likely_count_nounP, UNPROVIDED );
                              html_utilities.html_princ( $str51$_ );
                              html_utilities.html_princ( wni_example_count_noun_phrase( sme_li_denotational, synset_word ) );
                              html_utilities.html_newline( UNPROVIDED );
                              if( NIL != string_utilities.multi_word_string( synset_word ) )
                              {
                                html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str50$_count_noun ), $str52$headword_is_first, UNPROVIDED, UNPROVIDED );
                                html_utilities.html_princ( $str51$_ );
                                html_utilities.html_princ( wni_example_count_noun_phrase_when_headword_is_first( sme_li_denotational, synset_word ) );
                                html_utilities.html_newline( UNPROVIDED );
                              }
                              html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str50$_count_noun ), $str53$nil, makeBoolean( NIL == likely_count_nounP ), UNPROVIDED );
                              html_utilities.html_princ( $str51$_ );
                              html_utilities.html_princ( wni_example_mass_noun_phrase( sme_li_denotational, synset_word ) );
                              html_utilities.html_newline( UNPROVIDED );
                              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                            }
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str55$standard, T, UNPROVIDED );
                            html_utilities.html_princ( $str56$_standard__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str57$formal, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str58$_formal__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str59$informal, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str60$_informal__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str61$slang, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str62$_slang__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str63$technical_jargon, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str64$_technical_jargon__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str65$archaic, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str66$_archaic__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str54$_formality ), $str67$baby_talk, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str68$_baby_talk );
                            html_utilities.html_newline( UNPROVIDED );
                            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str69$_politeness ), $str55$standard, T, UNPROVIDED );
                            html_utilities.html_princ( $str56$_standard__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str69$_politeness ), $str70$polite, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str71$_polite__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str69$_politeness ), $str72$rude, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str73$_rude__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str69$_politeness ), $str74$vulgar, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str75$_vulgar__ );
                            html_utilities.html_newline( UNPROVIDED );
                            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str76$_rhetorical_device ), $str77$literal, T, UNPROVIDED );
                            html_utilities.html_princ( $str78$_literal__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str76$_rhetorical_device ), $str79$metaphor, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str80$_metaphor__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str76$_rhetorical_device ), $str81$simile, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str82$_simile__ );
                            html_utilities.html_radio_input( Sequences.cconcatenate( synset_word, $str76$_rhetorical_device ), $str83$euphemism, NIL, UNPROVIDED );
                            html_utilities.html_princ( $str84$_euphemism__ );
                            html_utilities.html_newline( UNPROVIDED );
                            html_utilities.html_newline( UNPROVIDED );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                        html_utilities.html_source_readability_terpri( UNPROVIDED );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  cdolist_list_var2 = cdolist_list_var2.rest();
                  synset_word = cdolist_list_var2.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              if( NIL != finish_buttonP )
              {
                html_utilities.html_submit_input( $str35$Finish, $str7$finish, UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
              }
              html_utilities.html_submit_input( $str36$Next, $str37$next, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_5, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_4, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ( $str85$literal___the_exact_meaning_of_th );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ( $str86$metaphor___a_figure_of_speech_in_ );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ( $str87$simile___a_figure_of_speech_that_ );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ( $str88$euphemism___an_inoffensive_expres );
            html_utilities.html_newline( UNPROVIDED );
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
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_3, thread );
    }
    agenda.ensure_agenda_running();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 9340L)
  public static SubLObject wni_likely_count_noun(final SubLObject word)
  {
    assert NIL != Types.stringp( word ) : word;
    if( NIL != string_utilities.ends_with( word, $str89$ism, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str90$ief, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str91$cor, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str92$cour, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str93$ion, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str94$are, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str95$aid, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str96$ing, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str97$al, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str98$ence, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str99$ance, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str100$iny, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( word, $str101$ness, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 10141L)
  public static SubLObject wni_example_count_noun_phrase(final SubLObject sme_li_denotational, final SubLObject synset_word)
  {
    assert NIL != Types.stringp( synset_word ) : synset_word;
    SubLObject example_count_noun_phrase = methods.funcall_instance_method_with_5_args( sme_li_denotational, $sym102$DERIVE_PART_OF_SPEECH_EXAMPLE, synset_word, ConsesLow.list( synset_word ), ZERO_INTEGER,
        $const103$CountNoun, $const104$Thing );
    if( NIL == example_count_noun_phrase )
    {
      example_count_noun_phrase = Sequences.cconcatenate( $str105$_, new SubLObject[] { synset_word, $str106$_is_a_count_noun_
      } );
    }
    assert NIL != Types.stringp( example_count_noun_phrase ) : example_count_noun_phrase;
    return example_count_noun_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 10695L)
  public static SubLObject wni_example_count_noun_phrase_when_headword_is_first(final SubLObject sme_li_denotational, final SubLObject synset_word)
  {
    assert NIL != Types.stringp( synset_word ) : synset_word;
    final SubLObject phrase_words = string_utilities.split_string( synset_word, UNPROVIDED );
    final SubLObject head_word = phrase_words.first();
    SubLObject example_count_noun_phrase = methods.funcall_instance_method_with_5_args( sme_li_denotational, $sym102$DERIVE_PART_OF_SPEECH_EXAMPLE, head_word, phrase_words, ZERO_INTEGER, $const103$CountNoun,
        $const104$Thing );
    if( NIL == example_count_noun_phrase )
    {
      example_count_noun_phrase = Sequences.cconcatenate( $str105$_, new SubLObject[] { synset_word, $str106$_is_a_count_noun_
      } );
    }
    assert NIL != Types.stringp( example_count_noun_phrase ) : example_count_noun_phrase;
    return example_count_noun_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 11342L)
  public static SubLObject wni_example_mass_noun_phrase(final SubLObject sme_li_denotational, final SubLObject synset_word)
  {
    assert NIL != Types.stringp( synset_word ) : synset_word;
    SubLObject example_count_noun_phrase = methods.funcall_instance_method_with_5_args( sme_li_denotational, $sym102$DERIVE_PART_OF_SPEECH_EXAMPLE, synset_word, ConsesLow.list( synset_word ), ZERO_INTEGER,
        $const107$MassNoun, $const104$Thing );
    if( NIL == example_count_noun_phrase )
    {
      example_count_noun_phrase = Sequences.cconcatenate( $str105$_, new SubLObject[] { synset_word, $str108$_is_a_mass_noun_
      } );
    }
    assert NIL != Types.stringp( example_count_noun_phrase ) : example_count_noun_phrase;
    return example_count_noun_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 11893L)
  public static SubLObject wni_new_words_input_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term_name, final SubLObject workflow_alist, final SubLObject finishP)
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
    if( NIL != matched_term_name && !assertionsDisabledInClass && NIL == Types.stringp( matched_term_name ) )
    {
      throw new AssertionError( matched_term_name );
    }
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.booleanp( finishP ) : finishP;
    if( NIL == string_utilities.empty_string_p( matched_term_name ) )
    {
      final SubLObject matched_term = czer_main.canonicalize_term_assert( cb_utilities.cb_guess_term( matched_term_name, UNPROVIDED ), UNPROVIDED );
      SubLObject comment = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym15$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const16$EverythingPSC, thread );
        comment = kb_accessors.comment( matched_term, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != comment )
      {
        final SubLObject nowP = NIL;
        cb_wordnet_utilities.wni_complete_after_concept_match( synset, genl_terms, matched_term, workflow_alist, nowP );
        if( NIL != finishP )
        {
          agenda.ensure_agenda_running();
          cb_frames.cb_term_frame_internal( cb_utilities.cb_term_identifier( matched_term ) );
        }
        else
        {
          final SubLObject continue_this_workflow_itemP = list_utilities.alist_lookup( workflow_alist, $str19$unmapped_hypernym_chain, EQUAL, UNPROVIDED );
          if( NIL != continue_this_workflow_itemP )
          {
            cb_wordnet_import_concept_match.wni_try_concept_match_internal( workflow_alist );
          }
          else
          {
            cb_wordnet_import_concept_match.wni_concept_match( UNPROVIDED );
          }
        }
      }
      else
      {
        cb_wordnet_import_comment.wni_concept_comment_existing_term( ConsesLow.list( synset, genl_terms, matched_term, workflow_alist ) );
      }
      return NIL;
    }
    cb_wordnet_import_concept_name.wni_concept_name( ConsesLow.list( synset, genl_terms, workflow_alist ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-new-words.lisp", position = 13543L)
  public static SubLObject wni_augment_workflow_alist_with_lexical_annotations(final SubLObject synset, final SubLObject args, SubLObject workflow_alist)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.listp( args ) : args;
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject cdolist_list_var;
    final SubLObject synset_words = cdolist_list_var = wordnet_import.wni_synset_words( synset );
    SubLObject synset_word = NIL;
    synset_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      key = Sequences.cconcatenate( synset_word, $str45$_included );
      value = html_utilities.html_extract_input( key, args );
      if( NIL != value )
      {
        workflow_alist = ConsesLow.cons( ConsesLow.cons( key, value ), workflow_alist );
      }
      key = Sequences.cconcatenate( synset_word, $str50$_count_noun );
      value = html_utilities.html_extract_input( key, args );
      if( NIL != value )
      {
        workflow_alist = ConsesLow.cons( ConsesLow.cons( key, value ), workflow_alist );
      }
      key = Sequences.cconcatenate( synset_word, $str54$_formality );
      value = html_utilities.html_extract_input( key, args );
      workflow_alist = ConsesLow.cons( ConsesLow.cons( key, value ), workflow_alist );
      key = Sequences.cconcatenate( synset_word, $str69$_politeness );
      value = html_utilities.html_extract_input( key, args );
      workflow_alist = ConsesLow.cons( ConsesLow.cons( key, value ), workflow_alist );
      key = Sequences.cconcatenate( synset_word, $str76$_rhetorical_device );
      value = html_utilities.html_extract_input( key, args );
      workflow_alist = ConsesLow.cons( ConsesLow.cons( key, value ), workflow_alist );
      cdolist_list_var = cdolist_list_var.rest();
      synset_word = cdolist_list_var.first();
    }
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    return workflow_alist;
  }

  public static SubLObject declare_cb_wordnet_import_new_words_file()
  {
    SubLFiles.declareFunction( me, "wni_new_words", "WNI-NEW-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_new_words_input", "WNI-NEW-WORDS-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_new_words_internal", "WNI-NEW-WORDS-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "wni_likely_count_noun", "WNI-LIKELY-COUNT-NOUN", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_example_count_noun_phrase", "WNI-EXAMPLE-COUNT-NOUN-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_example_count_noun_phrase_when_headword_is_first", "WNI-EXAMPLE-COUNT-NOUN-PHRASE-WHEN-HEADWORD-IS-FIRST", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_example_mass_noun_phrase", "WNI-EXAMPLE-MASS-NOUN-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_new_words_input_internal", "WNI-NEW-WORDS-INPUT-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "wni_augment_workflow_alist_with_lexical_annotations", "WNI-AUGMENT-WORKFLOW-ALIST-WITH-LEXICAL-ANNOTATIONS", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_wordnet_import_new_words_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_wordnet_import_new_words_file()
  {
    html_macros.note_cgi_handler_function( $sym2$WNI_NEW_WORDS, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym9$WNI_NEW_WORDS_INPUT, $kw3$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_wordnet_import_new_words_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_wordnet_import_new_words_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_wordnet_import_new_words_file();
  }
  static
  {
    me = new cb_wordnet_import_new_words();
    $sym0$LISTP = makeSymbol( "LISTP" );
    $str1$WordNet_Import___New_Words = makeString( "WordNet Import - New Words" );
    $sym2$WNI_NEW_WORDS = makeSymbol( "WNI-NEW-WORDS" );
    $kw3$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str4$synset_id = makeString( "synset-id" );
    $str5$genl_terms = makeString( "genl-terms" );
    $str6$matched_term_name = makeString( "matched-term-name" );
    $str7$finish = makeString( "finish" );
    $str8$workflow_alist = makeString( "workflow-alist" );
    $sym9$WNI_NEW_WORDS_INPUT = makeSymbol( "WNI-NEW-WORDS-INPUT" );
    $sym10$NAUT_P = makeSymbol( "NAUT-P" );
    $sym11$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym12$FORT_P = makeSymbol( "FORT-P" );
    $sym13$STRINGP = makeSymbol( "STRINGP" );
    $sym14$ALIST_P = makeSymbol( "ALIST-P" );
    $sym15$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const16$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str17$Characterize_the_words_of_the_ = makeString( "Characterize the words of the " );
    $str18$_Synonym_Set__ = makeString( " Synonym Set  " );
    $str19$unmapped_hypernym_chain = makeString( "unmapped-hypernym-chain" );
    $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str21$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw22$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw23$CB_CYC = makeKeyword( "CB-CYC" );
    $kw24$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw25$SHA1 = makeKeyword( "SHA1" );
    $str26$yui_skin_sam = makeString( "yui-skin-sam" );
    $str27$reloadFrameButton = makeString( "reloadFrameButton" );
    $str28$button = makeString( "button" );
    $str29$reload = makeString( "reload" );
    $str30$Refresh_Frames = makeString( "Refresh Frames" );
    $str31$post = makeString( "post" );
    $str32$wni_new_words_input = makeString( "wni-new-words-input" );
    $str33$_S = makeString( "~S" );
    $str34$cb_wordnet_import_new_words = makeString( "cb-wordnet-import-new-words" );
    $str35$Finish = makeString( "Finish" );
    $str36$Next = makeString( "Next" );
    $str37$next = makeString( "next" );
    $sym38$SME_LI_DENOTATIONAL = makeSymbol( "SME-LI-DENOTATIONAL" );
    $sym39$NEW = makeSymbol( "NEW" );
    $str40$left = makeString( "left" );
    $str41$1_ = makeString( "1%" );
    $kw42$NBSP = makeKeyword( "NBSP" );
    $str43$right = makeString( "right" );
    $str44$99_ = makeString( "99%" );
    $str45$_included = makeString( "-included" );
    $str46$t = makeString( "t" );
    $str47$Include_this_word_as_a_denotation = makeString( "Include this word as a denotation" );
    $const48$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $str49$Which_of_the_following_sounds_bes = makeString( "Which of the following sounds best?" );
    $str50$_count_noun = makeString( "-count-noun" );
    $str51$_ = makeString( " " );
    $str52$headword_is_first = makeString( "headword-is-first" );
    $str53$nil = makeString( "nil" );
    $str54$_formality = makeString( "-formality" );
    $str55$standard = makeString( "standard" );
    $str56$_standard__ = makeString( " standard  " );
    $str57$formal = makeString( "formal" );
    $str58$_formal__ = makeString( " formal  " );
    $str59$informal = makeString( "informal" );
    $str60$_informal__ = makeString( " informal  " );
    $str61$slang = makeString( "slang" );
    $str62$_slang__ = makeString( " slang  " );
    $str63$technical_jargon = makeString( "technical jargon" );
    $str64$_technical_jargon__ = makeString( " technical jargon  " );
    $str65$archaic = makeString( "archaic" );
    $str66$_archaic__ = makeString( " archaic  " );
    $str67$baby_talk = makeString( "baby talk" );
    $str68$_baby_talk = makeString( " baby talk" );
    $str69$_politeness = makeString( "-politeness" );
    $str70$polite = makeString( "polite" );
    $str71$_polite__ = makeString( " polite  " );
    $str72$rude = makeString( "rude" );
    $str73$_rude__ = makeString( " rude  " );
    $str74$vulgar = makeString( "vulgar" );
    $str75$_vulgar__ = makeString( " vulgar  " );
    $str76$_rhetorical_device = makeString( "-rhetorical-device" );
    $str77$literal = makeString( "literal" );
    $str78$_literal__ = makeString( " literal  " );
    $str79$metaphor = makeString( "metaphor" );
    $str80$_metaphor__ = makeString( " metaphor  " );
    $str81$simile = makeString( "simile" );
    $str82$_simile__ = makeString( " simile  " );
    $str83$euphemism = makeString( "euphemism" );
    $str84$_euphemism__ = makeString( " euphemism  " );
    $str85$literal___the_exact_meaning_of_th = makeString( "literal - the exact meaning of the expression" );
    $str86$metaphor___a_figure_of_speech_in_ = makeString( "metaphor - a figure of speech in which an expression is used to refer to something that it does not literally denote in order to suggest a similarity" );
    $str87$simile___a_figure_of_speech_that_ = makeString( "simile - a figure of speech that expresses a resemblance between things of different kinds (usually formed with `like' or `as')" );
    $str88$euphemism___an_inoffensive_expres = makeString( "euphemism - an inoffensive expression that is substituted for one that is considered offensive " );
    $str89$ism = makeString( "ism" );
    $str90$ief = makeString( "ief" );
    $str91$cor = makeString( "cor" );
    $str92$cour = makeString( "cour" );
    $str93$ion = makeString( "ion" );
    $str94$are = makeString( "are" );
    $str95$aid = makeString( "aid" );
    $str96$ing = makeString( "ing" );
    $str97$al = makeString( "al" );
    $str98$ence = makeString( "ence" );
    $str99$ance = makeString( "ance" );
    $str100$iny = makeString( "iny" );
    $str101$ness = makeString( "ness" );
    $sym102$DERIVE_PART_OF_SPEECH_EXAMPLE = makeSymbol( "DERIVE-PART-OF-SPEECH-EXAMPLE" );
    $const103$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $const104$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str105$_ = makeString( "(" );
    $str106$_is_a_count_noun_ = makeString( " is a count noun)" );
    $const107$MassNoun = constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) );
    $str108$_is_a_mass_noun_ = makeString( " is a mass noun)" );
    $sym109$CONSP = makeSymbol( "CONSP" );
    $sym110$BOOLEANP = makeSymbol( "BOOLEANP" );
  }
}
/*
 * 
 * Total time: 556 ms synthetic
 */