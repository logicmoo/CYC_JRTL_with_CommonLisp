package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.narts_high;
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

public final class cb_wordnet_import_comment
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment";
  public static final String myFingerPrint = "dfd67c23c949edf0c95aa4c7e03d27d32ff5851b47cc6a8d66af04059f5d960c";
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 5602L)
  private static SubLSymbol $wni_comment_textarea_width$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 6179L)
  private static SubLSymbol $wni_comment_textarea_height$;
  private static final SubLSymbol $sym0$LISTP;
  private static final SubLString $str1$WordNet_Import___Comment;
  private static final SubLSymbol $sym2$NAUT_P;
  private static final SubLSymbol $sym3$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym4$FORT_P;
  private static final SubLSymbol $sym5$STRINGP;
  private static final SubLSymbol $sym6$ALIST_P;
  private static final SubLSymbol $sym7$WNI_CONCEPT_COMMENT;
  private static final SubLSymbol $kw8$HTML_HANDLER;
  private static final SubLString $str9$synset_id;
  private static final SubLString $str10$genl_terms;
  private static final SubLString $str11$name;
  private static final SubLString $str12$workflow_alist;
  private static final SubLString $str13$comment;
  private static final SubLString $str14$finish;
  private static final SubLString $str15$unmapped_hypernym_chain;
  private static final SubLString $str16$in_workflow_;
  private static final SubLString $str17$t;
  private static final SubLSymbol $sym18$WNI_CONCEPT_COMMENT_INPUT;
  private static final SubLSymbol $sym19$WNI_CONCEPT_COMMENT_EXISTING_TERM;
  private static final SubLString $str20$term;
  private static final SubLSymbol $sym21$BOOLEANP;
  private static final SubLSymbol $sym22$WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT;
  private static final SubLInteger $int23$80;
  private static final SubLSymbol $kw24$CB_WORDNET_IMPORT_CONCEPT_NAME;
  private static final SubLString $str25$cb_wordnet_import_concept_name_ht;
  private static final SubLString $str26$Is_this_a_good_comment_for_;
  private static final SubLString $str27$_;
  private static final SubLString $str28$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str29$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw30$UNINITIALIZED;
  private static final SubLSymbol $kw31$CB_CYC;
  private static final SubLSymbol $kw32$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw33$SHA1;
  private static final SubLString $str34$yui_skin_sam;
  private static final SubLString $str35$reloadFrameButton;
  private static final SubLString $str36$button;
  private static final SubLString $str37$reload;
  private static final SubLString $str38$Refresh_Frames;
  private static final SubLString $str39$post;
  private static final SubLString $str40$wni_concept_comment_input;
  private static final SubLString $str41$_S;
  private static final SubLString $str42$Clear;
  private static final SubLString $str43$Continue_Workflow;
  private static final SubLString $str44$next;
  private static final SubLString $str45$Finish;
  private static final SubLString $str46$Next_Workflow;
  private static final SubLString $str47$virtual;
  private static final SubLString $str48$__;
  private static final SubLSymbol $kw49$GENLS;
  private static final SubLSymbol $kw50$ISA;
  private static final SubLString $str51$Is_this_a_good_comment_for_the_ex;
  private static final SubLObject $const52$EverythingPSC;
  private static final SubLString $str53$wni_concept_comment_existing_term;
  private static final SubLObject $const54$Noun;
  private static final SubLObject $const55$Verb;
  private static final SubLObject $const56$Adjective;
  private static final SubLString $str57$A_sub_collection_of_;
  private static final SubLString $str58$___Each_instance_is_;
  private static final SubLString $str59$_;
  private static final SubLString $str60$An_instance_of_;
  private static final SubLString $str61$__;
  private static final SubLString $str62$any;
  private static final SubLString $str63$any_;
  private static final SubLObject $const64$Determiner;
  private static final SubLString $str65$anything;
  private static final SubLString $str66$something;
  private static final SubLString $str67$someone;
  private static final SubLObject $const68$Event;
  private static final SubLString $str69$A_collection_of_events__;
  private static final SubLString $str70$A_collection_of_situations__;
  private static final SubLString $str71$a_subcollection_of_;
  private static final SubLString $str72$to_;
  private static final SubLObject $const73$WNVerbFrame_8;
  private static final SubLObject $const74$WNVerbFrame_2;
  private static final SubLString $str75$;
  private static final SubLObject $const76$WNVerbFrame_1;
  private static final SubLObject $const77$WNVerbFrame_9;
  private static final SubLObject $const78$WNVerbFrame_11;
  private static final SubLObject $const79$WNVerbFrame_22;
  private static final SubLObject $const80$WNVerbFrame_4;
  private static final SubLString $str81$_;
  private static final SubLString $str82$__;
  private static final SubLString $str83$_with_respect_to_;
  private static final SubLString $str84$__of_;
  private static final SubLString $str85$__as_of_;
  private static final SubLString $str86$_someone__of_;
  private static final SubLString $str87$_they_are_;
  private static final SubLString $str88$_one_is_;
  private static final SubLString $str89$_their;
  private static final SubLString $str90$_one_s;
  private static final SubLString $str91$_one_s_;
  private static final SubLString $str92$_your_;
  private static final SubLString $str93$_of_;
  private static final SubLString $str94$_ofs_;
  private static final SubLString $str95$theirself;
  private static final SubLString $str96$oneself;
  private static final SubLString $str97$_his_;
  private static final SubLString $str98$_be_;
  private static final SubLString $str99$_is_;
  private static final SubLString $str100$In_each_;
  private static final SubLString $str101$__;
  private static final SubLString $str102$__;
  private static final SubLString $str103$_;
  private static final SubLString $str104$be;
  private static final SubLString $str105$is;
  private static final SubLString $str106$else;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 991L)
  public static SubLObject wni_concept_comment(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str1$WordNet_Import___Comment );
    }
    else
    {
      final SubLObject synset = args.first();
      final SubLObject genl_terms = conses_high.second( args );
      final SubLObject name = conses_high.third( args );
      final SubLObject workflow_alist = conses_high.fourth( args );
      assert NIL != narts_high.naut_p( synset ) : synset;
      final SubLObject list_var = genl_terms;
      assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
      SubLObject cdolist_list_var = list_var;
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        assert NIL != forts.fort_p( elem ) : elem;
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      assert NIL != Types.stringp( name ) : name;
      assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
      wni_concept_comment_internal( synset, genl_terms, name, workflow_alist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 1871L)
  public static SubLObject wni_concept_comment_input(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string( html_utilities.html_extract_input( $str9$synset_id, args ) );
    final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input( html_utilities.html_extract_input( $str10$genl_terms, args ) );
    final SubLObject name = html_utilities.html_extract_input( $str11$name, args );
    final SubLObject workflow_alist = reader.read_from_string( html_utilities.html_extract_input( $str12$workflow_alist, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject comment = html_utilities.html_extract_input( $str13$comment, args );
    final SubLObject finishP = list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str14$finish, args ) );
    final SubLObject nowP = NIL;
    SubLObject v_term = NIL;
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject list_var = genl_terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.stringp( comment ) : comment;
    v_term = cb_wordnet_utilities.wni_complete_after_comment( synset, genl_terms, name, workflow_alist, comment, nowP );
    if( NIL != finishP )
    {
      agenda.ensure_agenda_running();
      cb_frames.cb_term_frame_internal( cb_utilities.cb_term_identifier( v_term ) );
    }
    else
    {
      final SubLObject unmapped_hypernym_chain = list_utilities.alist_lookup( workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED );
      final SubLObject in_workflowP = Strings.stringE( list_utilities.alist_lookup( workflow_alist, $str16$in_workflow_, EQUAL, UNPROVIDED ), $str17$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != unmapped_hypernym_chain )
      {
        cb_wordnet_import_concept_match.wni_try_concept_match_internal( wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain( unmapped_hypernym_chain, in_workflowP ) );
      }
      else if( NIL != in_workflowP )
      {
        cb_wordnet_import_concept_match.wni_concept_match( UNPROVIDED );
      }
      else
      {
        agenda.ensure_agenda_running();
        cb_frames.cb_term_frame_internal( cb_utilities.cb_term_identifier( v_term ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 3437L)
  public static SubLObject wni_concept_comment_existing_term(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str1$WordNet_Import___Comment );
    }
    else
    {
      final SubLObject synset = args.first();
      final SubLObject genl_terms = conses_high.second( args );
      final SubLObject v_term = conses_high.third( args );
      final SubLObject workflow_alist = conses_high.fourth( args );
      assert NIL != narts_high.naut_p( synset ) : synset;
      final SubLObject list_var = genl_terms;
      assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
      SubLObject cdolist_list_var = list_var;
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        assert NIL != forts.fort_p( elem ) : elem;
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      assert NIL != forts.fort_p( v_term ) : v_term;
      assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
      wni_concept_comment_existing_term_internal( synset, genl_terms, v_term, workflow_alist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 4092L)
  public static SubLObject wni_concept_comment_existing_term_input(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string( html_utilities.html_extract_input( $str9$synset_id, args ) );
    final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input( html_utilities.html_extract_input( $str10$genl_terms, args ) );
    final SubLObject v_term = cb_wordnet_utilities.wni_decode_terms_from_hidden_input( html_utilities.html_extract_input( $str20$term, args ) ).first();
    final SubLObject workflow_alist = reader.read_from_string( html_utilities.html_extract_input( $str12$workflow_alist, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject finishP = list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str14$finish, args ) );
    final SubLObject comment = html_utilities.html_extract_input( $str13$comment, args );
    final SubLObject nowP = NIL;
    final SubLObject list_var = genl_terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.stringp( comment ) : comment;
    assert NIL != Types.booleanp( finishP ) : finishP;
    cb_wordnet_utilities.wni_complete_after_comment_existing_term( synset, genl_terms, v_term, workflow_alist, comment, nowP );
    if( NIL != finishP )
    {
      agenda.ensure_agenda_running();
      cb_frames.cb_term_frame_internal( cb_utilities.cb_term_identifier( v_term ) );
    }
    else
    {
      final SubLObject unmapped_hypernym_chain = list_utilities.alist_lookup( workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED );
      final SubLObject in_workflowP = Strings.stringE( list_utilities.alist_lookup( workflow_alist, $str16$in_workflow_, EQUAL, UNPROVIDED ), $str17$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != unmapped_hypernym_chain )
      {
        cb_wordnet_import_concept_match.wni_try_concept_match_internal( wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain( unmapped_hypernym_chain, in_workflowP ) );
      }
      else
      {
        cb_wordnet_import_concept_match.wni_concept_match( UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 6351L)
  public static SubLObject wni_concept_comment_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist)
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
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    final SubLObject title_var;
    final SubLObject title = title_var = Sequences.cconcatenate( $str26$Is_this_a_good_comment_for_, new SubLObject[] { name, $str27$_
    } );
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str28$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str29$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw30$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw31$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw32$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str34$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str35$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str36$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str37$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str38$Refresh_Frames );
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
            html_utilities.html_markup( $str39$post );
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
              html_utilities.html_hidden_input( $str40$wni_concept_comment_input, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str9$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( synset ) ), UNPROVIDED );
              html_utilities.html_hidden_input( $str10$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input( genl_terms ), UNPROVIDED );
              html_utilities.html_hidden_input( $str11$name, name, UNPROVIDED );
              html_utilities.html_hidden_input( $str12$workflow_alist, PrintLow.format( NIL, $str41$_S, workflow_alist ), UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw24$CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_script_utilities.html_clear_input_button( $str13$comment, $str42$Clear, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              if( NIL != list_utilities.alist_lookup( workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED ) )
              {
                html_utilities.html_submit_input( $str43$Continue_Workflow, $str44$next, UNPROVIDED );
              }
              else
              {
                html_utilities.html_submit_input( $str45$Finish, $str14$finish, UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str46$Next_Workflow, $str44$next, UNPROVIDED );
              }
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$comment );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != $wni_comment_textarea_width$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $wni_comment_textarea_width$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              if( NIL != $wni_comment_textarea_height$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $wni_comment_textarea_height$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$virtual );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( wni_suggest_comment( synset, Sequences.cconcatenate( $str48$__, name ), genls.min_col( genl_terms, UNPROVIDED, UNPROVIDED ) ) );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              SubLObject cdolist_list_var2 = genl_terms;
              SubLObject genl_term = NIL;
              genl_term = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                cb_wordnet_utilities.wni_html_termXcomment( genl_term, T );
                cdolist_list_var2 = cdolist_list_var2.rest();
                genl_term = cdolist_list_var2.first();
              }
              cb_wordnet_utilities.wni_html_up_arrow( ( NIL != wordnet_import.wni_synset_collectionP( synset ) ) ? $kw49$GENLS : $kw50$ISA );
              cb_wordnet_utilities.wni_html_synset_words_gloss_examples( synset, UNPROVIDED, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 8137L)
  public static SubLObject wni_concept_comment_existing_term_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist)
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
    assert NIL != forts.fort_p( v_term ) : v_term;
    final SubLObject title = Sequences.cconcatenate( $str51$Is_this_a_good_comment_for_the_ex, string_utilities.to_string( forts.fort_el_formula( v_term ) ) );
    final SubLObject genl_term = genls.min_col( ConsesLow.append( genl_terms, ( NIL != wordnet_import.wni_synset_collectionP( synset ) ) ? genls.genls( v_term, $const52$EverythingPSC, UNPROVIDED )
        : isa.isa( v_term, $const52$EverythingPSC, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
    final SubLObject title_var = title;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str28$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str29$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw30$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw31$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw32$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str34$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str35$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str36$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str37$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str38$Refresh_Frames );
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
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str39$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str53$wni_concept_comment_existing_term, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str9$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( synset ) ), UNPROVIDED );
              html_utilities.html_hidden_input( $str10$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input( genl_terms ), UNPROVIDED );
              html_utilities.html_hidden_input( $str20$term, cb_wordnet_utilities.wni_encode_terms_for_hidden_input( ConsesLow.list( v_term ) ), UNPROVIDED );
              html_utilities.html_hidden_input( $str12$workflow_alist, PrintLow.format( NIL, $str41$_S, workflow_alist ), UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw24$CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_script_utilities.html_clear_input_button( $str13$comment, $str42$Clear, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              if( NIL != list_utilities.alist_lookup( workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED ) )
              {
                html_utilities.html_submit_input( $str43$Continue_Workflow, $str44$next, UNPROVIDED );
              }
              else
              {
                html_utilities.html_submit_input( $str45$Finish, $str14$finish, UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str46$Next_Workflow, $str44$next, UNPROVIDED );
              }
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$comment );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != $wni_comment_textarea_width$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $wni_comment_textarea_width$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              if( NIL != $wni_comment_textarea_height$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $wni_comment_textarea_height$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$virtual );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( wni_suggest_comment( synset, string_utilities.to_string( forts.fort_el_formula( v_term ) ), genl_term ) );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
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
    agenda.ensure_agenda_running();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 9873L)
  public static SubLObject wni_suggest_comment(final SubLObject synset, final SubLObject name, final SubLObject genl_term)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.stringp( name ) : name;
    assert NIL != forts.fort_p( genl_term ) : genl_term;
    SubLObject comment = NIL;
    final SubLObject pos = wordnet_import.wni_synset_pos( synset );
    if( pos.eql( $const54$Noun ) )
    {
      comment = wni_suggest_noun_comment( synset, genl_term );
    }
    else if( pos.eql( $const55$Verb ) )
    {
      comment = wni_suggest_verb_comment( synset, name, genl_term );
    }
    else if( pos.eql( $const56$Adjective ) )
    {
      comment = wni_suggest_adjective_comment( synset, genl_term );
    }
    else
    {
      comment = wni_suggest_adverb_comment( synset, genl_term );
    }
    comment = wni_common_comment_substitutions( comment );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 10731L)
  public static SubLObject wni_suggest_noun_comment(final SubLObject synset, final SubLObject genl_term)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( genl_term ) : genl_term;
    SubLObject comment = NIL;
    final SubLObject gloss = wordnet_import.wni_synset_gloss( synset );
    comment = ( ( NIL != wordnet_import.wni_synset_collectionP( synset ) ) ? Sequences.cconcatenate( $str57$A_sub_collection_of_, new SubLObject[] { string_utilities.to_string( forts.fort_el_formula( genl_term ) ),
      $str58$___Each_instance_is_, wni_gloss_with_determiner( gloss ), $str59$_
    } ) : Sequences.cconcatenate( $str60$An_instance_of_, new SubLObject[] { string_utilities.to_string( forts.fort_el_formula( genl_term ) ), $str61$__, string_utilities.capitalize_first( gloss ), $str59$_
    } ) );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 11482L)
  public static SubLObject wni_gloss_with_determiner(final SubLObject gloss)
  {
    assert NIL != Types.stringp( gloss ) : gloss;
    final SubLObject first_gloss_word = string_utilities.split_string( gloss, UNPROVIDED ).first();
    if( NIL != Strings.stringE( first_gloss_word, $str62$any, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return string_utilities.bunge( pph_utilities.add_determiner( string_utilities.pre_remove( gloss, $str63$any_, UNPROVIDED ) ), UNPROVIDED );
    }
    if( NIL != lexicon_accessors.string_is_posP( first_gloss_word, $const64$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.stringE( first_gloss_word, $str65$anything, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) || NIL != Strings.stringE( first_gloss_word, $str66$something, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.stringE( first_gloss_word, $str67$someone, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return gloss;
    }
    return string_utilities.bunge( pph_utilities.add_determiner( gloss ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 12082L)
  public static SubLObject wni_suggest_adjective_comment(final SubLObject synset, final SubLObject genl_term)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( genl_term ) : genl_term;
    SubLObject comment = NIL;
    final SubLObject gloss = wordnet_import.wni_synset_gloss( synset );
    comment = ( ( NIL != wordnet_import.wni_synset_collectionP( synset ) ) ? Sequences.cconcatenate( $str57$A_sub_collection_of_, new SubLObject[] { string_utilities.to_string( forts.fort_el_formula( genl_term ) ),
      $str58$___Each_instance_is_, wni_gloss_with_determiner( gloss ), $str59$_
    } ) : Sequences.cconcatenate( $str60$An_instance_of_, new SubLObject[] { string_utilities.to_string( forts.fort_el_formula( genl_term ) ), $str61$__, string_utilities.capitalize_first( gloss ), $str59$_
    } ) );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 12841L)
  public static SubLObject wni_suggest_verb_comment(final SubLObject synset, final SubLObject name, final SubLObject genl_term)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( genl_term ) : genl_term;
    SubLObject comment = NIL;
    final SubLObject first_phrase = ( NIL != genls.genlP( genl_term, $const68$Event, UNPROVIDED, UNPROVIDED ) ) ? $str69$A_collection_of_events__ : $str70$A_collection_of_situations__;
    final SubLObject second_phrase = Sequences.cconcatenate( $str71$a_subcollection_of_, new SubLObject[] { string_utilities.to_string( forts.fort_el_formula( genl_term ) ), $str61$__
    } );
    SubLObject third_phrase = NIL;
    final SubLObject gloss = string_utilities.strip_header( wordnet_import.wni_synset_gloss( synset ), $str72$to_ );
    final SubLObject pcase_var;
    final SubLObject verb_frame = pcase_var = wordnet_import.wni_most_general_synset_verb_frame( synset );
    if( pcase_var.eql( $const73$WNVerbFrame_8 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str67$someone, $str66$something );
    }
    else if( pcase_var.eql( $const74$WNVerbFrame_2 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str67$someone, $str75$ );
    }
    else if( pcase_var.eql( $const76$WNVerbFrame_1 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str66$something, $str75$ );
    }
    else if( pcase_var.eql( $const77$WNVerbFrame_9 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str67$someone, $str67$someone );
    }
    else if( pcase_var.eql( $const78$WNVerbFrame_11 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str66$something, $str66$something );
    }
    else if( pcase_var.eql( $const79$WNVerbFrame_22 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str67$someone, $str75$ );
    }
    else if( pcase_var.eql( $const80$WNVerbFrame_4 ) )
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str67$someone, $str75$ );
    }
    else
    {
      third_phrase = wni_suggest_verb_frame( name, gloss, $str66$something, $str66$something );
    }
    comment = Sequences.cconcatenate( first_phrase, new SubLObject[] { second_phrase, third_phrase, $str59$_
    } );
    comment = wni_verb_comment_substitutions( comment );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 14588L)
  public static SubLObject wni_common_comment_substitutions(SubLObject comment)
  {
    assert NIL != Types.stringp( comment ) : comment;
    comment = string_utilities.string_substitute( $str81$_, $str82$__, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str83$_with_respect_to_, $str84$__of_, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str83$_with_respect_to_, $str85$__as_of_, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str81$_, $str86$_someone__of_, comment, UNPROVIDED );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 15131L)
  public static SubLObject wni_verb_comment_substitutions(SubLObject comment)
  {
    assert NIL != Types.stringp( comment ) : comment;
    comment = string_utilities.string_substitute( $str87$_they_are_, $str88$_one_is_, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str89$_their, $str90$_one_s, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str91$_one_s_, $str92$_your_, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str93$_of_, $str94$_ofs_, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str95$theirself, $str96$oneself, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str89$_their, $str97$_his_, comment, UNPROVIDED );
    comment = string_utilities.string_substitute( $str98$_be_, $str99$_is_, comment, UNPROVIDED );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 15864L)
  public static SubLObject wni_suggest_verb_frame(final SubLObject name, final SubLObject gloss, final SubLObject subject, final SubLObject v_object)
  {
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.stringp( gloss ) : gloss;
    assert NIL != Types.stringp( subject ) : subject;
    assert NIL != Types.stringp( v_object ) : v_object;
    SubLObject phrase = NIL;
    phrase = Sequences.cconcatenate( $str100$In_each_, new SubLObject[] { name, $str101$__, subject, $str81$_, wni_pluralize( gloss, v_object, Strings.stringE( subject, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    } );
    assert NIL != Types.stringp( phrase ) : phrase;
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 16514L)
  public static SubLObject wni_pluralize(final SubLObject gloss, SubLObject suffix_word, SubLObject else_wordP)
  {
    if( suffix_word == UNPROVIDED )
    {
      suffix_word = NIL;
    }
    if( else_wordP == UNPROVIDED )
    {
      else_wordP = NIL;
    }
    assert NIL != Types.stringp( gloss ) : gloss;
    if( NIL != suffix_word && !assertionsDisabledInClass && NIL == Types.stringp( suffix_word ) )
    {
      throw new AssertionError( suffix_word );
    }
    SubLObject phrase = NIL;
    final SubLObject semicolon_index = string_utilities.char_position( Characters.CHAR_semicolon, gloss, UNPROVIDED );
    if( NIL != semicolon_index )
    {
      phrase = Sequences.cconcatenate( wni_pluralize( Sequences.subseq( gloss, ZERO_INTEGER, semicolon_index ), suffix_word, UNPROVIDED ), new SubLObject[] { $str102$__, wni_pluralize( string_utilities
          .left_trim_whitespace( Sequences.subseq( gloss, Numbers.add( semicolon_index, ONE_INTEGER ), UNPROVIDED ) ), suffix_word, UNPROVIDED )
      } );
    }
    else
    {
      SubLObject words = string_utilities.split_string( gloss, UNPROVIDED );
      final SubLObject first_word = words.first();
      final SubLObject last_word = list_utilities.last_one( words );
      ConsesLow.rplaca( words, ( NIL != string_utilities.ends_with( first_word, $str103$_, UNPROVIDED ) ) ? Sequences.cconcatenate( morphology.infinitive_to_third_sing( string_utilities.post_remove( first_word,
          $str103$_, UNPROVIDED ) ), $str103$_ )
          : ( ( NIL != Strings.stringE( first_word, $str104$be, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? $str105$is : morphology.infinitive_to_third_sing( first_word ) ) );
      if( NIL != suffix_word )
      {
        if( NIL != lexicon_accessors.preposition_stringP( last_word, UNPROVIDED ) )
        {
          list_utilities.nadd_to_end( suffix_word, words );
        }
        else if( Sequences.length( words ).numG( ONE_INTEGER ) && NIL != lexicon_accessors.preposition_stringP( conses_high.second( words ), UNPROVIDED ) )
        {
          words = ( ( NIL != else_wordP ) ? ConsesLow.append( ConsesLow.list( words.first(), suffix_word, $str106$else ), words.rest() ) : ConsesLow.append( ConsesLow.list( words.first(), suffix_word ), words.rest() ) );
        }
        phrase = string_utilities.bunge( words, UNPROVIDED );
      }
    }
    assert NIL != Types.stringp( phrase ) : phrase;
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-comment.lisp", position = 18046L)
  public static SubLObject wni_suggest_adverb_comment(final SubLObject synset, final SubLObject genl_term)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( genl_term ) : genl_term;
    SubLObject comment = NIL;
    final SubLObject gloss = comment = wordnet_import.wni_synset_gloss( synset );
    assert NIL != Types.stringp( comment ) : comment;
    return comment;
  }

  public static SubLObject declare_cb_wordnet_import_comment_file()
  {
    SubLFiles.declareFunction( me, "wni_concept_comment", "WNI-CONCEPT-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_comment_input", "WNI-CONCEPT-COMMENT-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_comment_existing_term", "WNI-CONCEPT-COMMENT-EXISTING-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_comment_existing_term_input", "WNI-CONCEPT-COMMENT-EXISTING-TERM-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_comment_internal", "WNI-CONCEPT-COMMENT-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "wni_concept_comment_existing_term_internal", "WNI-CONCEPT-COMMENT-EXISTING-TERM-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_comment", "WNI-SUGGEST-COMMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_noun_comment", "WNI-SUGGEST-NOUN-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_gloss_with_determiner", "WNI-GLOSS-WITH-DETERMINER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_adjective_comment", "WNI-SUGGEST-ADJECTIVE-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_verb_comment", "WNI-SUGGEST-VERB-COMMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_common_comment_substitutions", "WNI-COMMON-COMMENT-SUBSTITUTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_verb_comment_substitutions", "WNI-VERB-COMMENT-SUBSTITUTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_suggest_verb_frame", "WNI-SUGGEST-VERB-FRAME", 4, 0, false );
    SubLFiles.declareFunction( me, "wni_pluralize", "WNI-PLURALIZE", 1, 2, false );
    SubLFiles.declareFunction( me, "wni_suggest_adverb_comment", "WNI-SUGGEST-ADVERB-COMMENT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_wordnet_import_comment_file()
  {
    $wni_comment_textarea_width$ = SubLFiles.defconstant( "*WNI-COMMENT-TEXTAREA-WIDTH*", $int23$80 );
    $wni_comment_textarea_height$ = SubLFiles.defconstant( "*WNI-COMMENT-TEXTAREA-HEIGHT*", FIVE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_cb_wordnet_import_comment_file()
  {
    html_macros.note_cgi_handler_function( $sym7$WNI_CONCEPT_COMMENT, $kw8$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym18$WNI_CONCEPT_COMMENT_INPUT, $kw8$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym19$WNI_CONCEPT_COMMENT_EXISTING_TERM, $kw8$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym22$WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT, $kw8$HTML_HANDLER );
    Hashtables.sethash( $kw24$CB_WORDNET_IMPORT_CONCEPT_NAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str25$cb_wordnet_import_concept_name_ht, NIL ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_wordnet_import_comment_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_wordnet_import_comment_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_wordnet_import_comment_file();
  }
  static
  {
    me = new cb_wordnet_import_comment();
    $wni_comment_textarea_width$ = null;
    $wni_comment_textarea_height$ = null;
    $sym0$LISTP = makeSymbol( "LISTP" );
    $str1$WordNet_Import___Comment = makeString( "WordNet Import - Comment" );
    $sym2$NAUT_P = makeSymbol( "NAUT-P" );
    $sym3$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym4$FORT_P = makeSymbol( "FORT-P" );
    $sym5$STRINGP = makeSymbol( "STRINGP" );
    $sym6$ALIST_P = makeSymbol( "ALIST-P" );
    $sym7$WNI_CONCEPT_COMMENT = makeSymbol( "WNI-CONCEPT-COMMENT" );
    $kw8$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str9$synset_id = makeString( "synset-id" );
    $str10$genl_terms = makeString( "genl-terms" );
    $str11$name = makeString( "name" );
    $str12$workflow_alist = makeString( "workflow-alist" );
    $str13$comment = makeString( "comment" );
    $str14$finish = makeString( "finish" );
    $str15$unmapped_hypernym_chain = makeString( "unmapped-hypernym-chain" );
    $str16$in_workflow_ = makeString( "in-workflow?" );
    $str17$t = makeString( "t" );
    $sym18$WNI_CONCEPT_COMMENT_INPUT = makeSymbol( "WNI-CONCEPT-COMMENT-INPUT" );
    $sym19$WNI_CONCEPT_COMMENT_EXISTING_TERM = makeSymbol( "WNI-CONCEPT-COMMENT-EXISTING-TERM" );
    $str20$term = makeString( "term" );
    $sym21$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym22$WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT = makeSymbol( "WNI-CONCEPT-COMMENT-EXISTING-TERM-INPUT" );
    $int23$80 = makeInteger( 80 );
    $kw24$CB_WORDNET_IMPORT_CONCEPT_NAME = makeKeyword( "CB-WORDNET-IMPORT-CONCEPT-NAME" );
    $str25$cb_wordnet_import_concept_name_ht = makeString( "cb-wordnet-import-concept-name.html" );
    $str26$Is_this_a_good_comment_for_ = makeString( "Is this a good comment for " );
    $str27$_ = makeString( "?" );
    $str28$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str29$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw30$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw31$CB_CYC = makeKeyword( "CB-CYC" );
    $kw32$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw33$SHA1 = makeKeyword( "SHA1" );
    $str34$yui_skin_sam = makeString( "yui-skin-sam" );
    $str35$reloadFrameButton = makeString( "reloadFrameButton" );
    $str36$button = makeString( "button" );
    $str37$reload = makeString( "reload" );
    $str38$Refresh_Frames = makeString( "Refresh Frames" );
    $str39$post = makeString( "post" );
    $str40$wni_concept_comment_input = makeString( "wni-concept-comment-input" );
    $str41$_S = makeString( "~S" );
    $str42$Clear = makeString( "Clear" );
    $str43$Continue_Workflow = makeString( "Continue Workflow" );
    $str44$next = makeString( "next" );
    $str45$Finish = makeString( "Finish" );
    $str46$Next_Workflow = makeString( "Next Workflow" );
    $str47$virtual = makeString( "virtual" );
    $str48$__ = makeString( "#$" );
    $kw49$GENLS = makeKeyword( "GENLS" );
    $kw50$ISA = makeKeyword( "ISA" );
    $str51$Is_this_a_good_comment_for_the_ex = makeString( "Is this a good comment for the existing term " );
    $const52$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str53$wni_concept_comment_existing_term = makeString( "wni-concept-comment-existing-term-input" );
    $const54$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const55$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const56$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $str57$A_sub_collection_of_ = makeString( "A sub-collection of " );
    $str58$___Each_instance_is_ = makeString( ".  Each instance is " );
    $str59$_ = makeString( "." );
    $str60$An_instance_of_ = makeString( "An instance of " );
    $str61$__ = makeString( ". " );
    $str62$any = makeString( "any" );
    $str63$any_ = makeString( "any " );
    $const64$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $str65$anything = makeString( "anything" );
    $str66$something = makeString( "something" );
    $str67$someone = makeString( "someone" );
    $const68$Event = constant_handles.reader_make_constant_shell( makeString( "Event" ) );
    $str69$A_collection_of_events__ = makeString( "A collection of events; " );
    $str70$A_collection_of_situations__ = makeString( "A collection of situations; " );
    $str71$a_subcollection_of_ = makeString( "a subcollection of " );
    $str72$to_ = makeString( "to " );
    $const73$WNVerbFrame_8 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-8" ) );
    $const74$WNVerbFrame_2 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-2" ) );
    $str75$ = makeString( "" );
    $const76$WNVerbFrame_1 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-1" ) );
    $const77$WNVerbFrame_9 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-9" ) );
    $const78$WNVerbFrame_11 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-11" ) );
    $const79$WNVerbFrame_22 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-22" ) );
    $const80$WNVerbFrame_4 = constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-4" ) );
    $str81$_ = makeString( " " );
    $str82$__ = makeString( "  " );
    $str83$_with_respect_to_ = makeString( " with respect to " );
    $str84$__of_ = makeString( ", of " );
    $str85$__as_of_ = makeString( ", as of " );
    $str86$_someone__of_ = makeString( " someone; of " );
    $str87$_they_are_ = makeString( " they are " );
    $str88$_one_is_ = makeString( " one is " );
    $str89$_their = makeString( " their" );
    $str90$_one_s = makeString( " one's" );
    $str91$_one_s_ = makeString( " one's " );
    $str92$_your_ = makeString( " your " );
    $str93$_of_ = makeString( " of " );
    $str94$_ofs_ = makeString( " ofs " );
    $str95$theirself = makeString( "theirself" );
    $str96$oneself = makeString( "oneself" );
    $str97$_his_ = makeString( " his " );
    $str98$_be_ = makeString( " be " );
    $str99$_is_ = makeString( " is " );
    $str100$In_each_ = makeString( "In each " );
    $str101$__ = makeString( ", " );
    $str102$__ = makeString( "; " );
    $str103$_ = makeString( "," );
    $str104$be = makeString( "be" );
    $str105$is = makeString( "is" );
    $str106$else = makeString( "else" );
  }
}
/*
 * 
 * Total time: 415 ms synthetic
 */