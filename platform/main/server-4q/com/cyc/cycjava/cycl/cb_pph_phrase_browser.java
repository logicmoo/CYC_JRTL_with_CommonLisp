package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_pph_phrase_browser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_pph_phrase_browser";
  public static final String myFingerPrint = "8ff6f27f560c1e8d3e2d8888bd8d9877f023b7f8f0cf7b9825cdfdb67abebe6f";
  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
  private static SubLSymbol $max_gen_template_phrase_id_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
  private static SubLSymbol $pph_phrase_id_demerits_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 10057L)
  private static SubLSymbol $cb_pph_category_abbreviations$;
  private static final SubLList $list0;
  private static final SubLString $str1$_A_did_not_specify_a_valid_pph_ph;
  private static final SubLSymbol $sym2$CB_PPH_PHRASE;
  private static final SubLSymbol $kw3$HTML_HANDLER;
  private static final SubLSymbol $sym4$CB_PPH_PHRASES;
  private static final SubLSymbol $sym5$CB_HANDLE_PPH_PHRASES;
  private static final SubLString $str6$max_count;
  private static final SubLInteger $int7$100;
  private static final SubLString $str8$category;
  private static final SubLSymbol $kw9$ALL;
  private static final SubLString $str10$nl_pred;
  private static final SubLString $str11$min_demerits;
  private static final SubLString $str12$max_demerits;
  private static final SubLString $str13$sort_field;
  private static final SubLSymbol $kw14$ID;
  private static final SubLString $str15$sort_order;
  private static final SubLSymbol $kw16$DESCENDING;
  private static final SubLString $str17$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str18$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw19$UNINITIALIZED;
  private static final SubLSymbol $kw20$CB_CYC;
  private static final SubLString $str21$PPH_Phrases;
  private static final SubLString $str22$post;
  private static final SubLString $str23$Max_count_;
  private static final SubLString $str24$5em;
  private static final SubLString $str25$Category_;
  private static final SubLObject $const26$Verb;
  private static final SubLObject $const27$Noun;
  private static final SubLObject $const28$Adjective;
  private static final SubLObject $const29$NounPhrase;
  private static final SubLObject $const30$PrepositionalPhrase;
  private static final SubLObject $const31$NLSentence;
  private static final SubLString $str32$Predicate_;
  private static final SubLObject $const33$tensed;
  private static final SubLObject $const34$gerund;
  private static final SubLObject $const35$nameString;
  private static final SubLObject $const36$nonPlural_Generic;
  private static final SubLObject $const37$nonSingular_Generic;
  private static final SubLString $str38$Min_demerits_;
  private static final SubLString $str39$Max_demerits_;
  private static final SubLString $str40$Sort_by_;
  private static final SubLSymbol $kw41$DEMERITS;
  private static final SubLSymbol $kw42$ASCENDING;
  private static final SubLString $str43$Refresh;
  private static final SubLString $str44$submit;
  private static final SubLSymbol $kw45$PPH_PHRASE;
  private static final SubLSymbol $sym46$MAX_GEN_TEMPLATE_PHRASE_ID;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$_MAX_GEN_TEMPLATE_PHRASE_ID_CACHING_STATE_;
  private static final SubLSymbol $sym49$PPH_PHRASE_ID_DEMERITS;
  private static final SubLSymbol $sym50$_PPH_PHRASE_ID_DEMERITS_CACHING_STATE_;
  private static final SubLInteger $int51$4096;
  private static final SubLSymbol $sym52$_;
  private static final SubLSymbol $sym53$_;
  private static final SubLSymbol $sym54$PPH_PHRASE_SUID;
  private static final SubLSymbol $sym55$PPH_PHRASE_DEMERITS;
  private static final SubLString $str56$pph_phrase_png;
  private static final SubLString $str57$;
  private static final SubLSymbol $kw58$TERSE;
  private static final SubLSymbol $kw59$SELF;
  private static final SubLString $str60$background_color_;
  private static final SubLList $list61;
  private static final SubLString $str62$cb_pph_phrase__A;
  private static final SubLString $str63$pphphraseicon;
  private static final SubLString $str64$absmiddle;
  private static final SubLSymbol $kw65$TOP;
  private static final SubLString $str66$_A;
  private static final SubLSymbol $kw67$MINIMAL;
  private static final SubLString $str68$_;
  private static final SubLString $str69$_;
  private static final SubLInteger $int70$30;
  private static final SubLString $str71$_;
  private static final SubLString $str72$_Phr_;
  private static final SubLSymbol $kw73$VERBOSE;
  private static final SubLString $str74$_PPH_Phrase_;
  private static final SubLString $str75$__;
  private static final SubLSymbol $sym76$CB_LINK_PPH_PHRASE;
  private static final SubLSymbol $sym77$CB_FORM_SIGN_METHOD;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$PPH_GENL_POS_;
  private static final SubLString $str80$PPH_Phrase;
  private static final SubLString $str81$phrase;
  private static final SubLSymbol $kw82$CENTER;
  private static final SubLString $str83$100_;
  private static final SubLString $str84$10_;
  private static final SubLString $str85$Alternative___D;
  private static final SubLString $str86$_PPH_error_level_;
  private static final SubLString $str87$__;
  private static final SubLString $str88$Done__S_alternatives_of__S;
  private static final SubLInteger $int89$255;
  private static final SubLString $str90$__2__0X_2__0X_2__0X;
  private static final SubLString $str91$head_dtr;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$HTML_FANCY_TABLE_ROW;
  private static final SubLSymbol $sym94$HTML_FANCY_TABLE_DATA;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$HTML_FORMAT;
  private static final SubLString $str97$_A_;
  private static final SubLString $str98$focal;
  private static final SubLSymbol $kw99$RIGHT;
  private static final SubLString $str100$SUID;
  private static final SubLString $str101$Special_Type;
  private static final SubLString $str102$Arg_Position;
  private static final SubLString $str103$Top_Level;
  private static final SubLString $str104$Category;
  private static final SubLString $str105$String;
  private static final SubLString $str106$Symbol;
  private static final SubLString $str107$Demerits;
  private static final SubLString $str108$___A_;
  private static final SubLString $str109$Word;
  private static final SubLString $str110$CycL;
  private static final SubLString $str111$Case;
  private static final SubLString $str112$Agreement;
  private static final SubLString $str113$Justification;
  private static final SubLSymbol $kw114$HL_SUPPORT;
  private static final SubLSymbol $kw115$NONE;
  private static final SubLString $str116$Inferences;
  private static final SubLSymbol $kw117$INFERENCE;
  private static final SubLSymbol $kw118$VERY_VERBOSE;
  private static final SubLString $str119$Output_List;
  private static final SubLString $str120$output_list;
  private static final SubLString $str121$Problems;
  private static final SubLString $str122$problems;
  private static final SubLList $list123;
  private static final SubLString $str124$__;
  private static final SubLString $str125$_;
  private static final SubLString $str126$ArgPos;
  private static final SubLString $str127$AgrPred;
  private static final SubLString $str128$__;
  private static final SubLString $str129$_;
  private static final SubLString $str130$Absolute___A;
  private static final SubLString $str131$Relative___A_to_;
  private static final SubLString $str132$___;
  private static final SubLString $str133$_No_Paraphrase_;

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 872L)
  public static SubLObject cb_pph_phrase(final SubLObject args)
  {
    SubLObject pph_phrase_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list0 );
    pph_phrase_id_string = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list0 );
      return NIL;
    }
    final SubLObject v_pph_phrase = cb_guess_pph_phrase( pph_phrase_id_string );
    if( NIL == pph_data_structures.valid_pph_phrase_p( v_pph_phrase ) )
    {
      return cb_utilities.cb_error( $str1$_A_did_not_specify_a_valid_pph_ph, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cb_pph_phrase_guts( v_pph_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 1223L)
  public static SubLObject cb_pph_phrases(final SubLObject args)
  {
    return cb_pph_phrases_internal( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 1348L)
  public static SubLObject cb_handle_pph_phrases(final SubLObject args)
  {
    return cb_pph_phrases_internal( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 1480L)
  public static SubLObject cb_pph_phrases_internal(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_count = html_utilities.html_extract_integer( $str6$max_count, args, $int7$100 );
    final SubLObject category_val = html_utilities.html_extract_value( $str8$category, args, $kw9$ALL );
    final SubLObject category_const = cb_utilities.cb_guess_constant( category_val );
    final SubLObject category = ( NIL != category_const ) ? category_const : $kw9$ALL;
    final SubLObject nl_pred_val = html_utilities.html_extract_value( $str10$nl_pred, args, $kw9$ALL );
    final SubLObject nl_pred_const = cb_utilities.cb_guess_constant( nl_pred_val );
    final SubLObject nl_pred = ( NIL != nl_pred_const ) ? nl_pred_const : $kw9$ALL;
    final SubLObject min_demerits = html_utilities.html_extract_integer( $str11$min_demerits, args, ZERO_INTEGER );
    final SubLObject max_demerits_val = html_utilities.html_extract_value( $str12$max_demerits, args, UNPROVIDED );
    final SubLObject max_demerits = ( NIL != string_utilities.non_empty_stringP( max_demerits_val ) && NIL != string_utilities.digit_stringP( max_demerits_val ) ) ? reader.parse_integer( max_demerits_val, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) : number_utilities.positive_infinity();
    final SubLObject sort_field = html_utilities.html_extract_keyword( $str13$sort_field, args, $kw14$ID );
    final SubLObject sort_order = html_utilities.html_extract_keyword( $str15$sort_order, args, $kw16$DESCENDING );
    final SubLObject phrases_to_view = gather_pph_phrases_int( max_count, category, nl_pred, min_demerits, max_demerits, sort_field, sort_order );
    html_utilities.html_markup( $str17$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str18$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
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
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str21$PPH_Phrases );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
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
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $sym5$CB_HANDLE_PPH_PHRASES, T, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_princ( $str23$Max_count_ );
            html_utilities.html_text_input( $str6$max_count, max_count, $str24$5em );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            html_utilities.html_princ( $str25$Category_ );
            html_utilities.html_create_simple_dropdown_list( $str8$category, ConsesLow.list( $kw9$ALL, $const26$Verb, $const27$Noun, $const28$Adjective, $const29$NounPhrase, $const30$PrepositionalPhrase,
                $const31$NLSentence ), category );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            html_utilities.html_princ( $str32$Predicate_ );
            html_utilities.html_create_simple_dropdown_list( $str10$nl_pred, ConsesLow.list( $kw9$ALL, $const33$tensed, $const34$gerund, $const35$nameString, $const36$nonPlural_Generic, $const37$nonSingular_Generic ),
                nl_pred );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            html_utilities.html_princ( $str38$Min_demerits_ );
            html_utilities.html_text_input( $str11$min_demerits, min_demerits, $str24$5em );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            html_utilities.html_princ( $str39$Max_demerits_ );
            html_utilities.html_text_input( $str12$max_demerits, max_demerits.isInteger() ? max_demerits : NIL, $str24$5em );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            html_utilities.html_princ( $str40$Sort_by_ );
            html_utilities.html_create_simple_dropdown_list( $str13$sort_field, ConsesLow.list( $kw14$ID, $kw41$DEMERITS ), sort_field );
            html_utilities.html_create_simple_dropdown_list( $str15$sort_order, ConsesLow.list( $kw42$ASCENDING, $kw16$DESCENDING ), sort_order );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            html_utilities.html_submit_input( $str43$Refresh, $str44$submit, UNPROVIDED );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = phrases_to_view;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_utilities.cb_link( $kw45$PPH_PHRASE, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              phrase = cdolist_list_var.first();
            }
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$1, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 3939L)
  public static SubLObject gather_pph_phrases_int(SubLObject max_count, SubLObject category, SubLObject nl_pred, SubLObject min_demerits, SubLObject max_demerits, SubLObject sort_field, SubLObject sort_order)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = $int7$100;
    }
    if( category == UNPROVIDED )
    {
      category = $kw9$ALL;
    }
    if( nl_pred == UNPROVIDED )
    {
      nl_pred = $kw9$ALL;
    }
    if( min_demerits == UNPROVIDED )
    {
      min_demerits = ZERO_INTEGER;
    }
    if( max_demerits == UNPROVIDED )
    {
      max_demerits = number_utilities.positive_infinity();
    }
    if( sort_field == UNPROVIDED )
    {
      sort_field = $kw14$ID;
    }
    if( sort_order == UNPROVIDED )
    {
      sort_order = $kw16$DESCENDING;
    }
    SubLObject phrases_to_view = NIL;
    final SubLObject min_id = max_gen_template_phrase_id();
    SubLObject enoughP = NIL;
    if( NIL == enoughP )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject phrase;
      for( end_var = min_id, i = NIL, i = id_index.id_index_next_id( pph_data_structures.pph_phrase_id_index() ); NIL == enoughP && !i.numLE( end_var ); i = Numbers.add( i, MINUS_ONE_INTEGER ) )
      {
        phrase = pph_data_structures.find_pph_phrase_by_id( i );
        if( NIL != pph_data_structures.valid_pph_phrase_p( phrase ) && NIL != pph_phrase_ok_for_categoryP( phrase, category ) && NIL != pph_phrase_ok_for_nl_predP( phrase, nl_pred ) && NIL != pph_phrase_ok_for_demeritsP(
            phrase, min_demerits, max_demerits ) )
        {
          phrases_to_view = ConsesLow.cons( phrase, phrases_to_view );
          enoughP = list_utilities.lengthGE( phrases_to_view, max_count, UNPROVIDED );
        }
      }
    }
    return sort_pph_phrases( phrases_to_view, sort_field, sort_order );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
  public static SubLObject clear_max_gen_template_phrase_id()
  {
    final SubLObject cs = $max_gen_template_phrase_id_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
  public static SubLObject remove_max_gen_template_phrase_id()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $max_gen_template_phrase_id_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
  public static SubLObject max_gen_template_phrase_id_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject max_id = ZERO_INTEGER;
    final SubLObject iterator_var = pph_data_structures.new_gen_template_store_iterator();
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject the_entry = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = the_entry;
        SubLObject the_reln = NIL;
        SubLObject all_its_templates = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
        the_reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
        all_its_templates = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject cdolist_list_var = all_its_templates;
          SubLObject all_of_this_kind = NIL;
          all_of_this_kind = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject iterator_var_$4 = set.new_set_iterator( all_of_this_kind );
            SubLObject valid_$6;
            for( SubLObject done_var_$5 = NIL; NIL == done_var_$5; done_var_$5 = makeBoolean( NIL == valid_$6 ) )
            {
              thread.resetMultipleValues();
              final SubLObject the_template = iteration.iteration_next( iterator_var_$4 );
              valid_$6 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid_$6 )
              {
                final SubLObject phrase = pph_data_structures.get_gen_template_phrase( the_template );
                final SubLObject id = pph_phrase.pph_phrase_suid( phrase );
                if( id.numG( max_id ) )
                {
                  max_id = id;
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            all_of_this_kind = cdolist_list_var.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
        }
      }
    }
    return max_id_of_pph_phrase_and_dtrs( pph_data_structures.find_pph_phrase_by_id( max_id ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
  public static SubLObject max_gen_template_phrase_id()
  {
    SubLObject caching_state = $max_gen_template_phrase_id_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym46$MAX_GEN_TEMPLATE_PHRASE_ID, $sym48$_MAX_GEN_TEMPLATE_PHRASE_ID_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( max_gen_template_phrase_id_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 5408L)
  public static SubLObject max_id_of_pph_phrase_and_dtrs(final SubLObject phrase, SubLObject max_id)
  {
    if( max_id == UNPROVIDED )
    {
      max_id = ZERO_INTEGER;
    }
    final SubLObject this_phrase_id = pph_phrase.pph_phrase_suid( phrase );
    if( this_phrase_id.numG( max_id ) )
    {
      max_id = this_phrase_id;
    }
    SubLObject dtr_num = ZERO_INTEGER;
    if( document.sign_constituents( phrase ).isVector() )
    {
      final SubLObject vector_var = document.sign_constituents( phrase );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject dtr;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        dtr = Vectors.aref( vector_var, element_num );
        max_id = max_id_of_pph_phrase_and_dtrs( dtr, max_id );
        dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
      }
    }
    return max_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 5738L)
  public static SubLObject pph_phrase_ok_for_categoryP(final SubLObject phrase, final SubLObject category)
  {
    return makeBoolean( $kw9$ALL.eql( category ) || NIL != pph_utilities.pph_genl_posP( pph_phrase.pph_phrase_category( phrase, UNPROVIDED ), category, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 5895L)
  public static SubLObject pph_phrase_ok_for_nl_predP(final SubLObject phrase, final SubLObject nl_pred)
  {
    return makeBoolean( $kw9$ALL.eql( nl_pred ) || NIL != pph_utilities.pph_genl_pos_predP( pph_phrase.pph_phrase_agr_pred( phrase ), nl_pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6053L)
  public static SubLObject pph_phrase_ok_for_demeritsP(final SubLObject phrase, final SubLObject min_demerits, final SubLObject max_demerits)
  {
    final SubLObject demerits = pph_phrase_id_demerits( pph_phrase.pph_phrase_suid( phrase ) );
    return makeBoolean( demerits.numGE( min_demerits ) && NIL != number_utilities.potentially_infinite_number_LE( demerits, max_demerits ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
  public static SubLObject clear_pph_phrase_id_demerits()
  {
    final SubLObject cs = $pph_phrase_id_demerits_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
  public static SubLObject remove_pph_phrase_id_demerits(final SubLObject id)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pph_phrase_id_demerits_caching_state$.getGlobalValue(), ConsesLow.list( id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
  public static SubLObject pph_phrase_id_demerits_internal(final SubLObject id)
  {
    final SubLObject phrase = pph_data_structures.find_pph_phrase_by_id( id );
    return ( NIL != phrase ) ? pph_phrase.pph_phrase_demerits( phrase ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
  public static SubLObject pph_phrase_id_demerits(final SubLObject id)
  {
    SubLObject caching_state = $pph_phrase_id_demerits_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym49$PPH_PHRASE_ID_DEMERITS, $sym50$_PPH_PHRASE_ID_DEMERITS_CACHING_STATE_, $int51$4096, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_phrase_id_demerits_internal( id ) ) );
      memoization_state.caching_state_put( caching_state, id, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6484L)
  public static SubLObject sort_pph_phrases(final SubLObject phrases, final SubLObject sort_field, final SubLObject sort_order)
  {
    if( sort_field.eql( $kw14$ID ) )
    {
      return sort_pph_phrases_by_id( phrases, sort_order );
    }
    if( sort_field.eql( $kw41$DEMERITS ) )
    {
      return sort_pph_phrases_by_demerits( phrases, sort_order );
    }
    return phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6749L)
  public static SubLObject sort_pph_phrases_by_id(final SubLObject phrases, final SubLObject sort_order)
  {
    return Sort.sort( phrases, sort_order.eql( $kw42$ASCENDING ) ? Symbols.symbol_function( $sym52$_ ) : Symbols.symbol_function( $sym53$_ ), $sym54$PPH_PHRASE_SUID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6893L)
  public static SubLObject sort_pph_phrases_by_demerits(final SubLObject phrases, final SubLObject sort_order)
  {
    return Sort.sort( phrases, sort_order.eql( $kw42$ASCENDING ) ? Symbols.symbol_function( $sym52$_ ) : Symbols.symbol_function( $sym53$_ ), $sym55$PPH_PHRASE_DEMERITS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 7094L)
  public static SubLObject cb_link_pph_phrase(final SubLObject v_pph_phrase, SubLObject verbosity, SubLObject linktext)
  {
    if( verbosity == UNPROVIDED )
    {
      verbosity = NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == verbosity )
    {
      verbosity = $kw58$TERSE;
    }
    if( NIL == pph_data_structures.valid_pph_phrase_p( v_pph_phrase ) )
    {
      return html_utilities.html_princ( print_high.princ_to_string( v_pph_phrase ) );
    }
    final SubLObject pph_phrase_id = pph_phrase.pph_phrase_suid( v_pph_phrase );
    final SubLObject frame = $kw59$SELF;
    cb_adornments.handle_adornments( $kw45$PPH_PHRASE, frame, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != pph_phrase.pph_phrase_doneP( v_pph_phrase ) )
    {
      final SubLObject bgcolor = pph_bgcolor_for_phrase( v_pph_phrase );
      final SubLObject style = Sequences.cconcatenate( $str60$background_color_, format_nil.format_nil_a_no_copy( bgcolor ) );
      final SubLObject string = cb_pph_phrase_string( v_pph_phrase, T, UNPROVIDED );
      SubLObject tokens;
      SubLObject first_word;
      for( tokens = string_utilities.string_tokenize( string, $list61, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED ), first_word = tokens.first(); NIL != list_utilities.lengthG( tokens, ONE_INTEGER, UNPROVIDED )
          && NIL != Sequences.find( Characters.CHAR_less, first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.find( Characters.CHAR_greater, first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ); tokens = tokens.rest(), first_word = Sequences.cconcatenate( first_word, tokens.first() ) )
      {
      }
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( style );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( frame );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str62$cb_pph_phrase__A, pph_phrase_id );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str63$pphphraseicon );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $kw45$PPH_PHRASE );
            final SubLObject align = $str64$absmiddle;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( $kw45$PPH_PHRASE );
            final SubLObject border = ZERO_INTEGER;
            html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( image_src );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != alt )
            {
              html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( alt );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != align )
            {
              html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( align ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != border )
            {
              html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( border );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str66$_A, first_word );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str66$_A, string_utilities.pre_remove( string, first_word, UNPROVIDED ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    else
    {
      final SubLObject category = pph_phrase.pph_phrase_category( v_pph_phrase, T );
      if( NIL == linktext )
      {
        final SubLObject pcase_var = verbosity;
        if( pcase_var.eql( $kw67$MINIMAL ) )
        {
          linktext = Sequences.cconcatenate( $str68$_, new SubLObject[] { format_nil.format_nil_a_no_copy( pph_phrase_id ), $str69$_
          } );
        }
        else if( pcase_var.eql( $kw58$TERSE ) )
        {
          if( NIL != pph_phrase.pph_phrase_doneP( v_pph_phrase ) )
          {
            linktext = Sequences.cconcatenate( $str68$_, new SubLObject[] { format_nil.format_nil_s_no_copy( cb_pph_phrase_string( v_pph_phrase, NIL, $int70$30 ) ), $str71$_, format_nil.format_nil_a_no_copy(
                pph_phrase_id ), $str69$_
            } );
          }
          else if( NIL != category )
          {
            linktext = Sequences.cconcatenate( $str68$_, new SubLObject[] { format_nil.format_nil_a_no_copy( cb_pph_phrase_category_string( v_pph_phrase ) ), $str71$_, format_nil.format_nil_a_no_copy( pph_phrase_id ),
              $str69$_
            } );
          }
          else if( NIL != pph_phrase.pph_symbol_phrase_p( v_pph_phrase ) )
          {
            linktext = Sequences.cconcatenate( $str68$_, new SubLObject[] { format_nil.format_nil_a_no_copy( pph_phrase.pph_symbol_phrase_symbol( v_pph_phrase ) ), $str71$_, format_nil.format_nil_a_no_copy(
                pph_phrase_id ), $str69$_
            } );
          }
          else if( NIL != pph_phrase.pph_known_cycl_p( pph_phrase.pph_phrase_cycl( v_pph_phrase, UNPROVIDED ) ) )
          {
            linktext = Sequences.cconcatenate( $str68$_, new SubLObject[] { format_nil.format_nil_s_no_copy( pph_phrase.pph_phrase_cycl( v_pph_phrase, UNPROVIDED ) ), $str71$_, format_nil.format_nil_a_no_copy(
                pph_phrase_id ), $str69$_
            } );
          }
          else
          {
            linktext = Sequences.cconcatenate( $str72$_Phr_, new SubLObject[] { format_nil.format_nil_a_no_copy( pph_phrase_id ), $str69$_
            } );
          }
        }
        else if( pcase_var.eql( $kw73$VERBOSE ) )
        {
          if( NIL != pph_phrase.pph_phrase_doneP( v_pph_phrase ) )
          {
            linktext = Sequences.cconcatenate( $str68$_, new SubLObject[] { format_nil.format_nil_s_no_copy( cb_pph_phrase_string( v_pph_phrase, NIL, UNPROVIDED ) ), $str71$_, format_nil.format_nil_a_no_copy(
                pph_phrase_id ), $str69$_
            } );
          }
          else
          {
            linktext = Sequences.cconcatenate( $str74$_PPH_Phrase_, new SubLObject[] { format_nil.format_nil_a_no_copy( pph_phrase_id ), $str75$__, format_nil.format_nil_a_no_copy( cb_pph_phrase_category_string(
                v_pph_phrase ) ), $str69$_
            } );
          }
        }
      }
      final SubLObject frame_name_var2 = cb_utilities.cb_frame_name( frame );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str62$cb_pph_phrase__A, pph_phrase_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var2 )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var2 );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject bgcolor2 = pph_bgcolor_for_phrase( v_pph_phrase );
        final SubLObject style2 = Sequences.cconcatenate( $str60$background_color_, format_nil.format_nil_a_no_copy( bgcolor2 ) );
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( style2 );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( linktext );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 9666L)
  public static SubLObject cb_form_sign_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    if( NIL != pph_phrase.pph_phrase_p( v_object, UNPROVIDED ) )
    {
      cb_utilities.cb_link( $kw45$PPH_PHRASE, v_object, $kw73$VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      html_utilities.html_princ( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 9880L)
  public static SubLObject cb_guess_pph_phrase(final SubLObject pph_phrase_id_string)
  {
    return ( NIL != string_utilities.digit_stringP( pph_phrase_id_string ) ) ? pph_data_structures.find_pph_phrase_by_id( reader.parse_integer( pph_phrase_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 10439L)
  public static SubLObject cb_pph_category_abbreviation(final SubLObject category)
  {
    return list_utilities.alist_lookup( $cb_pph_category_abbreviations$.getGlobalValue(), cycl_utilities.hl_to_el( category ), Symbols.symbol_function( $sym79$PPH_GENL_POS_ ), print_high.princ_to_string( category ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 10623L)
  public static SubLObject cb_pph_phrase_guts(final SubLObject v_pph_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str17$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str18$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
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
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str80$PPH_Phrase );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      dhtml_macros.dhtml_with_dom_script();
      dhtml_macros.dhtml_with_toggle_visibility_support();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_script_utilities.cb_hoverover_page_init();
          SubLObject dtr_cols = pph_phrase.pph_phrase_dtr_count( v_pph_phrase );
          SubLObject mother_stack = NIL;
          SubLObject ancestor;
          SubLObject mother;
          for( mother = ( ancestor = pph_phrase.pph_phrase_mother( v_pph_phrase ) ); NIL != pph_data_structures.valid_pph_phrase_p( ancestor ); ancestor = pph_phrase.pph_phrase_mother( ancestor ) )
          {
            mother_stack = ConsesLow.cons( ancestor, mother_stack );
          }
          if( ZERO_INTEGER.eql( dtr_cols ) )
          {
            dtr_cols = ONE_INTEGER;
          }
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str81$phrase );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var = mother_stack;
            SubLObject mother_$14 = NIL;
            mother_$14 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject bgcolor = pph_bgcolor_for_phrase( mother_$14 );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                if( NIL != dtr_cols )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( dtr_cols );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw82$CENTER ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != bgcolor )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( bgcolor );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  cb_utilities.cb_link( $kw45$PPH_PHRASE, mother_$14, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              mother_$14 = cdolist_list_var.first();
            }
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != pph_data_structures.valid_pph_phrase_p( mother ) )
              {
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                if( NIL != dtr_cols )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( dtr_cols );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str83$100_ );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      SubLObject dtr_num = ZERO_INTEGER;
                      if( document.sign_constituents( mother ).isVector() )
                      {
                        final SubLObject vector_var = document.sign_constituents( mother );
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject sibling;
                        SubLObject bgcolor2;
                        SubLObject _prev_bind_0_$20;
                        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                        {
                          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                          sibling = Vectors.aref( vector_var, element_num );
                          bgcolor2 = pph_bgcolor_for_phrase( sibling );
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw82$CENTER ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          if( NIL != bgcolor2 )
                          {
                            html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( bgcolor2 );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            if( sibling.eql( v_pph_phrase ) )
                            {
                              html_show_pph_phrase_details( v_pph_phrase );
                            }
                            else
                            {
                              cb_utilities.cb_link( $kw45$PPH_PHRASE, sibling, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                          dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
                        }
                      }
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
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              else
              {
                final SubLObject bgcolor3 = pph_bgcolor_for_phrase( v_pph_phrase );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                if( NIL != dtr_cols )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( dtr_cols );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                if( NIL != bgcolor3 )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( bgcolor3 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_show_pph_phrase_details( v_pph_phrase );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject dtr_num2 = ZERO_INTEGER;
              if( document.sign_constituents( v_pph_phrase ).isVector() )
              {
                final SubLObject vector_var2 = document.sign_constituents( v_pph_phrase );
                final SubLObject backwardP_var2 = NIL;
                SubLObject length2;
                SubLObject v_iteration2;
                SubLObject element_num2;
                SubLObject dtr;
                SubLObject bgcolor4;
                SubLObject v_class;
                SubLObject _prev_bind_0_$23;
                for( length2 = Sequences.length( vector_var2 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length2 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
                {
                  element_num2 = ( ( NIL != backwardP_var2 ) ? Numbers.subtract( length2, v_iteration2, ONE_INTEGER ) : v_iteration2 );
                  dtr = Vectors.aref( vector_var2, element_num2 );
                  bgcolor4 = pph_bgcolor_for_phrase( dtr );
                  v_class = pph_class_for_phrase( dtr );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  if( NIL != v_class )
                  {
                    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( v_class );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw82$CENTER ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != bgcolor4 )
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( bgcolor4 );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str84$10_ );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    cb_utilities.cb_link( $kw45$PPH_PHRASE, dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  dtr_num2 = Numbers.add( dtr_num2, ONE_INTEGER );
                }
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject i = ONE_INTEGER;
            final SubLObject queue = queues.create_queue( UNPROVIDED );
            SubLObject done_count = ZERO_INTEGER;
            queues.enqueue( v_pph_phrase, queue );
            while ( NIL == queues.queue_empty_p( queue ))
            {
              final SubLObject ignore_me = queues.dequeue( queue );
              SubLObject cdolist_list_var2 = pph_phrase.pph_phrase_local_alternatives( ignore_me );
              SubLObject alt_phrase = NIL;
              alt_phrase = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  if( NIL != dtr_cols )
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( dtr_cols );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str85$Alternative___D, i );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  final SubLObject bgcolor5 = pph_bgcolor_for_phrase( alt_phrase );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  if( NIL != dtr_cols )
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( dtr_cols );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  if( NIL != bgcolor5 )
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( bgcolor5 );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_show_pph_phrase_details( alt_phrase );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                done_count = Numbers.add( done_count, ONE_INTEGER );
                if( done_count.numGE( pph_phrase.$pph_do_alternatives_max$.getDynamicValue( thread ) ) )
                {
                  final SubLObject new_format_string = Sequences.cconcatenate( $str86$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str87$__, format_nil.format_nil_a_no_copy(
                      $str88$Done__S_alternatives_of__S )
                  } );
                  pph_error.pph_handle_error( new_format_string, ConsesLow.list( done_count, v_pph_phrase ) );
                }
                queues.enqueue( alt_phrase, queue );
                cdolist_list_var2 = cdolist_list_var2.rest();
                alt_phrase = cdolist_list_var2.first();
              }
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$11, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return v_pph_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 12932L)
  public static SubLObject pph_bgcolor_for_phrase(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$highlight_demerits_in_generated_phrasesP$.getDynamicValue( thread ) )
    {
      return $str57$;
    }
    final SubLObject r = $int89$255;
    final SubLObject demerits = Numbers.add( pph_phrase.pph_phrase_demerits( phrase ), pph_phrase_problem_count( phrase ) );
    final SubLObject scale_factor = TEN_INTEGER;
    final SubLObject b;
    final SubLObject g = b = Numbers.max( Numbers.subtract( $int89$255, Numbers.multiply( demerits, scale_factor ) ), ZERO_INTEGER );
    return demerits.isZero() ? $str57$ : PrintLow.format( NIL, $str90$__2__0X_2__0X_2__0X, new SubLObject[] { r, g, b
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 13302L)
  public static SubLObject pph_class_for_phrase(final SubLObject phrase)
  {
    if( NIL != pph_phrase.pph_phrase_mother( phrase ) && phrase.eql( pph_phrase.pph_phrase_head_dtr( pph_phrase.pph_phrase_mother( phrase ) ) ) )
    {
      return $str91$head_dtr;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 13497L)
  public static SubLObject pph_phrase_problem_count(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_dict = pph_phrase.pph_phrase_top_level_problem_dictionary( phrase );
    SubLObject count = ZERO_INTEGER;
    if( NIL != dictionary.dictionary_p( problem_dict ) )
    {
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( problem_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        count = Numbers.add( count, Sequences.length( problems ) );
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    SubLObject dtr_num = ZERO_INTEGER;
    if( document.sign_constituents( phrase ).isVector() )
    {
      final SubLObject vector_var = document.sign_constituents( phrase );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject dtr;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        dtr = Vectors.aref( vector_var, element_num );
        count = Numbers.add( count, pph_phrase_problem_count( dtr ) );
        dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 13873L)
  public static SubLObject html_show_pph_phrase_property(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject property = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    property = current.first();
    final SubLObject value_form;
    current = ( value_form = current.rest() );
    return ConsesLow.list( $sym93$HTML_FANCY_TABLE_ROW, NIL, ConsesLow.list( $sym94$HTML_FANCY_TABLE_DATA, $list95, ConsesLow.list( $sym96$HTML_FORMAT, $str97$_A_, property ) ), ConsesLow.listS(
        $sym94$HTML_FANCY_TABLE_DATA, NIL, ConsesLow.append( value_form, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 14125L)
  public static SubLObject html_show_pph_phrase_details(final SubLObject v_pph_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str98$focal );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw82$CENTER ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str100$SUID );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( pph_phrase.pph_phrase_suid( v_pph_phrase ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject special_type = pph_phrase.pph_phrase_special_type( v_pph_phrase );
      if( NIL != special_type )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str101$Special_Type );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( special_type );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      final SubLObject arg_position = pph_phrase.pph_phrase_arg_position( v_pph_phrase );
      if( NIL != pph_utilities.pph_known_arg_position_p( arg_position ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str102$Arg_Position );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL == arg_position )
            {
              html_utilities.html_princ( $str103$Top_Level );
            }
            else
            {
              html_utilities.html_princ( arg_position );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str104$Category );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( cb_pph_phrase_category_string( v_pph_phrase ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str105$String );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_show_pph_string( pph_phrase.pph_phrase_string( v_pph_phrase, UNPROVIDED ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != pph_phrase.pph_symbol_phrase_p( v_pph_phrase ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str106$Symbol );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( pph_phrase.pph_symbol_phrase_symbol( v_pph_phrase ), UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      final SubLObject demerits = pph_phrase.pph_phrase_demerits( v_pph_phrase );
      final SubLObject demerits_reason = pph_phrase.pph_phrase_top_level_demerits_reason( v_pph_phrase );
      if( NIL != subl_promotions.positive_integer_p( demerits ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str107$Demerits );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( demerits );
            if( NIL != demerits_reason )
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str108$___A_, demerits_reason );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != pph_phrase.pph_phrase_wu( v_pph_phrase, T ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str109$Word );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( pph_phrase.pph_phrase_wu( v_pph_phrase, T ), UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str110$CycL );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_show_pph_cycl( pph_phrase.pph_phrase_cycl( v_pph_phrase, UNPROVIDED ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != pph_phrase.pph_phrase_case( v_pph_phrase ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str111$Case );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( pph_phrase.pph_phrase_case( v_pph_phrase ), UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != pph_phrase.pph_phrase_agr( v_pph_phrase ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str112$Agreement );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_show_pph_agr( pph_phrase.pph_phrase_agr( v_pph_phrase ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != pph_phrase.pph_phrase_justification( v_pph_phrase ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str113$Justification );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_justification( v_pph_phrase );
            SubLObject just = NIL;
            just = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != arguments.hl_support_p( just ) )
              {
                cb_utilities.cb_link( $kw114$HL_SUPPORT, just, $kw115$NONE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else
              {
                cb_utilities.cb_form( just, ZERO_INTEGER, T );
              }
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              just = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != list_utilities.non_empty_list_p( pph_phrase.pph_phrase_inferences( v_pph_phrase ) ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str116$Inferences );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_inferences( v_pph_phrase );
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_utilities.cb_link( $kw117$INFERENCE, inference, $kw118$VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              inference = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      final SubLObject olist = pph_phrase.pph_phrase_output_list( v_pph_phrase );
      if( NIL != list_utilities.non_empty_list_p( olist ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str119$Output_List );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str120$output_list );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_show_pph_output_item_headers();
              SubLObject cdolist_list_var2 = olist;
              SubLObject item = NIL;
              item = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                html_show_pph_output_item( item );
                cdolist_list_var2 = cdolist_list_var2.rest();
                item = cdolist_list_var2.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      final SubLObject problem_dict = pph_phrase.pph_phrase_top_level_problem_dictionary( v_pph_phrase );
      if( NIL != dictionary.dictionary_p( problem_dict ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw99$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw65$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$_A_, $str121$Problems );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str122$problems );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject iteration_state;
                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( problem_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject reporter = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                  final SubLObject value = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    cb_utilities.cb_form( reporter, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                }
                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$76, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var3 = dictionary.dictionary_values( problem_dict );
                SubLObject problems = NIL;
                problems = cdolist_list_var3.first();
                while ( NIL != cdolist_list_var3)
                {
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    if( NIL != list_utilities.singletonP( problems ) )
                    {
                      html_output_pph_problem( list_utilities.only_one( problems ) );
                    }
                    else
                    {
                      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        SubLObject cdolist_list_var_$81 = problems;
                        SubLObject problem = NIL;
                        problem = cdolist_list_var_$81.first();
                        while ( NIL != cdolist_list_var_$81)
                        {
                          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_output_pph_problem( problem );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                          html_utilities.html_source_readability_terpri( UNPROVIDED );
                          cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                          problem = cdolist_list_var_$81.first();
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  cdolist_list_var3 = cdolist_list_var3.rest();
                  problems = cdolist_list_var3.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return v_pph_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 17476L)
  public static SubLObject html_output_pph_problem(final SubLObject problem)
  {
    SubLObject type = NIL;
    SubLObject other_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( problem, problem, $list123 );
    type = problem.first();
    final SubLObject current = other_info = problem.rest();
    html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
    html_utilities.html_princ_strong( type );
    if( NIL != other_info )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( other_info );
    }
    html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 17712L)
  public static SubLObject html_show_pph_cycl(final SubLObject cycl)
  {
    if( NIL != pph_phrase.pph_known_cycl_p( cycl ) )
    {
      cb_utilities.cb_form( cycl, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      html_utilities.html_princ( $str124$__ );
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 17848L)
  public static SubLObject html_show_pph_arg_position(final SubLObject arg_position)
  {
    if( NIL != pph_utilities.pph_known_arg_position_p( arg_position ) )
    {
      html_utilities.html_princ( arg_position );
    }
    else
    {
      html_utilities.html_princ( $str124$__ );
    }
    return arg_position;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 18035L)
  public static SubLObject html_show_pph_string(final SubLObject string)
  {
    if( NIL != pph_string.pph_string_p( string ) )
    {
      html_utilities.html_princ( $str125$_ );
      html_utilities.html_markup( pph_string.pph_string_to_html_escaped( string, UNPROVIDED ) );
      html_utilities.html_princ( $str125$_ );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 18228L)
  public static SubLObject html_show_pph_output_item_headers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str105$String );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str126$ArgPos );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str110$CycL );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str127$AgrPred );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 18578L)
  public static SubLObject html_show_pph_output_item(final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_show_pph_string( pph_data_structures.pph_phrase_output_item_string( item ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_show_pph_arg_position( pph_data_structures.pph_phrase_output_item_arg_position( item ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_show_pph_cycl( pph_data_structures.pph_phrase_output_item_cycl( item ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$90, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_form( pph_data_structures.pph_phrase_output_item_agr_pred( item ), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 19067L)
  public static SubLObject cb_pph_phrase_category_string(final SubLObject v_pph_phrase)
  {
    final SubLObject top_cat = pph_phrase.pph_phrase_category( v_pph_phrase, NIL );
    final SubLObject deep_cat = pph_phrase.pph_phrase_category( v_pph_phrase, T );
    final SubLObject cat_abbr = cb_pph_category_abbreviation( deep_cat );
    return top_cat.equal( deep_cat ) ? cat_abbr : Sequences.cconcatenate( format_nil.format_nil_s_no_copy( top_cat ), new SubLObject[] { $str128$__, format_nil.format_nil_a_no_copy( cat_abbr ), $str129$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 19399L)
  public static SubLObject html_show_pph_agr(final SubLObject agr)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject abs = pph_data_structures.pph_phrase_agr_absolute_constraint( agr );
    final SubLObject rel = pph_data_structures.pph_phrase_agr_relative_constraint( agr );
    if( NIL == pph_utilities.pph_dont_care_agr_constraint_p( abs ) )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str130$Absolute___A, abs );
    }
    if( NIL != pph_utilities.pph_relative_agr_constraint_p( rel ) )
    {
      final SubLObject type = pph_utilities.pph_agr_constraint_type( rel );
      final SubLObject target = pph_utilities.pph_agr_constraint_target( rel );
      if( NIL != type )
      {
        if( NIL == pph_utilities.pph_dont_care_agr_constraint_p( abs ) )
        {
          html_utilities.html_newline( UNPROVIDED );
        }
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str131$Relative___A_to_, type );
        if( NIL != pph_phrase.pph_phrase_p( target, UNPROVIDED ) )
        {
          cb_utilities.cb_link( $kw45$PPH_PHRASE, target, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_form( target, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return agr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 20016L)
  public static SubLObject cb_pph_phrase_string(final SubLObject v_pph_phrase, SubLObject add_tagsP, SubLObject max_length)
  {
    if( add_tagsP == UNPROVIDED )
    {
      add_tagsP = T;
    }
    if( max_length == UNPROVIDED )
    {
      max_length = NIL;
    }
    SubLObject v_pph_string = pph_phrase.pph_phrase_string( v_pph_phrase, add_tagsP );
    if( NIL != max_length && NIL != list_utilities.lengthG( v_pph_string, max_length, UNPROVIDED ) )
    {
      v_pph_string = pph_string.pph_string_concatenate( pph_string.pph_substring( v_pph_string, ZERO_INTEGER, max_length ), $str132$___ );
    }
    if( NIL != list_utilities.lengthE( v_pph_string, ZERO_INTEGER, UNPROVIDED ) )
    {
      v_pph_string = $str133$_No_Paraphrase_;
    }
    return pph_string.pph_string_if_non_null_to_output_format( v_pph_string, UNPROVIDED );
  }

  public static SubLObject declare_cb_pph_phrase_browser_file()
  {
    SubLFiles.declareFunction( me, "cb_pph_phrase", "CB-PPH-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_phrases", "CB-PPH-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_pph_phrases", "CB-HANDLE-PPH-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_phrases_internal", "CB-PPH-PHRASES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_pph_phrases_int", "GATHER-PPH-PHRASES-INT", 0, 7, false );
    SubLFiles.declareFunction( me, "clear_max_gen_template_phrase_id", "CLEAR-MAX-GEN-TEMPLATE-PHRASE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_max_gen_template_phrase_id", "REMOVE-MAX-GEN-TEMPLATE-PHRASE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "max_gen_template_phrase_id_internal", "MAX-GEN-TEMPLATE-PHRASE-ID-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "max_gen_template_phrase_id", "MAX-GEN-TEMPLATE-PHRASE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "max_id_of_pph_phrase_and_dtrs", "MAX-ID-OF-PPH-PHRASE-AND-DTRS", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_ok_for_categoryP", "PPH-PHRASE-OK-FOR-CATEGORY?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_ok_for_nl_predP", "PPH-PHRASE-OK-FOR-NL-PRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_ok_for_demeritsP", "PPH-PHRASE-OK-FOR-DEMERITS?", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_phrase_id_demerits", "CLEAR-PPH-PHRASE-ID-DEMERITS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_phrase_id_demerits", "REMOVE-PPH-PHRASE-ID-DEMERITS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_id_demerits_internal", "PPH-PHRASE-ID-DEMERITS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_id_demerits", "PPH-PHRASE-ID-DEMERITS", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_pph_phrases", "SORT-PPH-PHRASES", 3, 0, false );
    SubLFiles.declareFunction( me, "sort_pph_phrases_by_id", "SORT-PPH-PHRASES-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_pph_phrases_by_demerits", "SORT-PPH-PHRASES-BY-DEMERITS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_link_pph_phrase", "CB-LINK-PPH-PHRASE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_sign_method", "CB-FORM-SIGN-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_guess_pph_phrase", "CB-GUESS-PPH-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_category_abbreviation", "CB-PPH-CATEGORY-ABBREVIATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_phrase_guts", "CB-PPH-PHRASE-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_bgcolor_for_phrase", "PPH-BGCOLOR-FOR-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_class_for_phrase", "PPH-CLASS-FOR-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_problem_count", "PPH-PHRASE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareMacro( me, "html_show_pph_phrase_property", "HTML-SHOW-PPH-PHRASE-PROPERTY" );
    SubLFiles.declareFunction( me, "html_show_pph_phrase_details", "HTML-SHOW-PPH-PHRASE-DETAILS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_output_pph_problem", "HTML-OUTPUT-PPH-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "html_show_pph_cycl", "HTML-SHOW-PPH-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_show_pph_arg_position", "HTML-SHOW-PPH-ARG-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "html_show_pph_string", "HTML-SHOW-PPH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_show_pph_output_item_headers", "HTML-SHOW-PPH-OUTPUT-ITEM-HEADERS", 0, 0, false );
    SubLFiles.declareFunction( me, "html_show_pph_output_item", "HTML-SHOW-PPH-OUTPUT-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_phrase_category_string", "CB-PPH-PHRASE-CATEGORY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_show_pph_agr", "HTML-SHOW-PPH-AGR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_phrase_string", "CB-PPH-PHRASE-STRING", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_cb_pph_phrase_browser_file()
  {
    $max_gen_template_phrase_id_caching_state$ = SubLFiles.deflexical( "*MAX-GEN-TEMPLATE-PHRASE-ID-CACHING-STATE*", NIL );
    $pph_phrase_id_demerits_caching_state$ = SubLFiles.deflexical( "*PPH-PHRASE-ID-DEMERITS-CACHING-STATE*", NIL );
    $cb_pph_category_abbreviations$ = SubLFiles.deflexical( "*CB-PPH-CATEGORY-ABBREVIATIONS*", $list78 );
    return NIL;
  }

  public static SubLObject setup_cb_pph_phrase_browser_file()
  {
    html_macros.note_cgi_handler_function( $sym2$CB_PPH_PHRASE, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym4$CB_PPH_PHRASES, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym5$CB_HANDLE_PPH_PHRASES, $kw3$HTML_HANDLER );
    memoization_state.note_globally_cached_function( $sym46$MAX_GEN_TEMPLATE_PHRASE_ID );
    memoization_state.note_globally_cached_function( $sym49$PPH_PHRASE_ID_DEMERITS );
    Hashtables.sethash( $kw45$PPH_PHRASE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str56$pph_phrase_png, $str57$ ) );
    cb_utilities.setup_cb_link_method( $kw45$PPH_PHRASE, $sym76$CB_LINK_PPH_PHRASE, THREE_INTEGER );
    Structures.register_method( cb_utilities.$cb_form_method_table$.getGlobalValue(), document.$dtp_sign$.getGlobalValue(), Symbols.symbol_function( $sym77$CB_FORM_SIGN_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_pph_phrase_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_pph_phrase_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_pph_phrase_browser_file();
  }
  static
  {
    me = new cb_pph_phrase_browser();
    $max_gen_template_phrase_id_caching_state$ = null;
    $pph_phrase_id_demerits_caching_state$ = null;
    $cb_pph_category_abbreviations$ = null;
    $list0 = ConsesLow.list( makeSymbol( "PPH-PHRASE-ID-STRING" ) );
    $str1$_A_did_not_specify_a_valid_pph_ph = makeString( "~A did not specify a valid pph-phrase" );
    $sym2$CB_PPH_PHRASE = makeSymbol( "CB-PPH-PHRASE" );
    $kw3$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym4$CB_PPH_PHRASES = makeSymbol( "CB-PPH-PHRASES" );
    $sym5$CB_HANDLE_PPH_PHRASES = makeSymbol( "CB-HANDLE-PPH-PHRASES" );
    $str6$max_count = makeString( "max-count" );
    $int7$100 = makeInteger( 100 );
    $str8$category = makeString( "category" );
    $kw9$ALL = makeKeyword( "ALL" );
    $str10$nl_pred = makeString( "nl-pred" );
    $str11$min_demerits = makeString( "min-demerits" );
    $str12$max_demerits = makeString( "max-demerits" );
    $str13$sort_field = makeString( "sort-field" );
    $kw14$ID = makeKeyword( "ID" );
    $str15$sort_order = makeString( "sort-order" );
    $kw16$DESCENDING = makeKeyword( "DESCENDING" );
    $str17$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str18$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw19$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw20$CB_CYC = makeKeyword( "CB-CYC" );
    $str21$PPH_Phrases = makeString( "PPH-Phrases" );
    $str22$post = makeString( "post" );
    $str23$Max_count_ = makeString( "Max count:" );
    $str24$5em = makeString( "5em" );
    $str25$Category_ = makeString( "Category:" );
    $const26$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const27$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const28$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $const29$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $const30$PrepositionalPhrase = constant_handles.reader_make_constant_shell( makeString( "PrepositionalPhrase" ) );
    $const31$NLSentence = constant_handles.reader_make_constant_shell( makeString( "NLSentence" ) );
    $str32$Predicate_ = makeString( "Predicate:" );
    $const33$tensed = constant_handles.reader_make_constant_shell( makeString( "tensed" ) );
    $const34$gerund = constant_handles.reader_make_constant_shell( makeString( "gerund" ) );
    $const35$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $const36$nonPlural_Generic = constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) );
    $const37$nonSingular_Generic = constant_handles.reader_make_constant_shell( makeString( "nonSingular-Generic" ) );
    $str38$Min_demerits_ = makeString( "Min demerits:" );
    $str39$Max_demerits_ = makeString( "Max demerits:" );
    $str40$Sort_by_ = makeString( "Sort by:" );
    $kw41$DEMERITS = makeKeyword( "DEMERITS" );
    $kw42$ASCENDING = makeKeyword( "ASCENDING" );
    $str43$Refresh = makeString( "Refresh" );
    $str44$submit = makeString( "submit" );
    $kw45$PPH_PHRASE = makeKeyword( "PPH-PHRASE" );
    $sym46$MAX_GEN_TEMPLATE_PHRASE_ID = makeSymbol( "MAX-GEN-TEMPLATE-PHRASE-ID" );
    $list47 = ConsesLow.list( makeSymbol( "THE-RELN" ), makeSymbol( "ALL-ITS-TEMPLATES" ) );
    $sym48$_MAX_GEN_TEMPLATE_PHRASE_ID_CACHING_STATE_ = makeSymbol( "*MAX-GEN-TEMPLATE-PHRASE-ID-CACHING-STATE*" );
    $sym49$PPH_PHRASE_ID_DEMERITS = makeSymbol( "PPH-PHRASE-ID-DEMERITS" );
    $sym50$_PPH_PHRASE_ID_DEMERITS_CACHING_STATE_ = makeSymbol( "*PPH-PHRASE-ID-DEMERITS-CACHING-STATE*" );
    $int51$4096 = makeInteger( 4096 );
    $sym52$_ = makeSymbol( "<" );
    $sym53$_ = makeSymbol( ">" );
    $sym54$PPH_PHRASE_SUID = makeSymbol( "PPH-PHRASE-SUID" );
    $sym55$PPH_PHRASE_DEMERITS = makeSymbol( "PPH-PHRASE-DEMERITS" );
    $str56$pph_phrase_png = makeString( "pph-phrase.png" );
    $str57$ = makeString( "" );
    $kw58$TERSE = makeKeyword( "TERSE" );
    $kw59$SELF = makeKeyword( "SELF" );
    $str60$background_color_ = makeString( "background-color:" );
    $list61 = ConsesLow.list( Characters.CHAR_space );
    $str62$cb_pph_phrase__A = makeString( "cb-pph-phrase&~A" );
    $str63$pphphraseicon = makeString( "pphphraseicon" );
    $str64$absmiddle = makeString( "absmiddle" );
    $kw65$TOP = makeKeyword( "TOP" );
    $str66$_A = makeString( "~A" );
    $kw67$MINIMAL = makeKeyword( "MINIMAL" );
    $str68$_ = makeString( "[" );
    $str69$_ = makeString( "]" );
    $int70$30 = makeInteger( 30 );
    $str71$_ = makeString( " " );
    $str72$_Phr_ = makeString( "[Phr " );
    $kw73$VERBOSE = makeKeyword( "VERBOSE" );
    $str74$_PPH_Phrase_ = makeString( "[PPH-Phrase " );
    $str75$__ = makeString( ": " );
    $sym76$CB_LINK_PPH_PHRASE = makeSymbol( "CB-LINK-PPH-PHRASE" );
    $sym77$CB_FORM_SIGN_METHOD = makeSymbol( "CB-FORM-SIGN-METHOD" );
    $list78 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "AgentiveNoun" ) ) ), makeString( "NP-Agentive" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) ), makeString( "NP" ) ), ConsesLow.cons( ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ), makeString( "NP" ) ), ConsesLow.cons( constant_handles
                .reader_make_constant_shell( makeString( "NLSentence" ) ), makeString( "S" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ), makeString( "V" ) ), ConsesLow.cons(
                    constant_handles.reader_make_constant_shell( makeString( "PrepositionalPhrase" ) ), makeString( "PP" ) ), ConsesLow.cons( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ), makeString( "Nbar" ) ), ConsesLow.cons( ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) ), makeString( "Vbar" ) ), ConsesLow.cons( ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Determiner" ) ) ), makeString( "DetP" ) )
    } );
    $sym79$PPH_GENL_POS_ = makeSymbol( "PPH-GENL-POS?" );
    $str80$PPH_Phrase = makeString( "PPH-Phrase" );
    $str81$phrase = makeString( "phrase" );
    $kw82$CENTER = makeKeyword( "CENTER" );
    $str83$100_ = makeString( "100%" );
    $str84$10_ = makeString( "10%" );
    $str85$Alternative___D = makeString( "Alternative #~D" );
    $str86$_PPH_error_level_ = makeString( "(PPH error level " );
    $str87$__ = makeString( ") " );
    $str88$Done__S_alternatives_of__S = makeString( "Done ~S alternatives of ~S" );
    $int89$255 = makeInteger( 255 );
    $str90$__2__0X_2__0X_2__0X = makeString( "#~2,'0X~2,'0X~2,'0X" );
    $str91$head_dtr = makeString( "head-dtr" );
    $list92 = ConsesLow.list( makeSymbol( "PROPERTY" ), makeSymbol( "&BODY" ), makeSymbol( "VALUE-FORM" ) );
    $sym93$HTML_FANCY_TABLE_ROW = makeSymbol( "HTML-FANCY-TABLE-ROW" );
    $sym94$HTML_FANCY_TABLE_DATA = makeSymbol( "HTML-FANCY-TABLE-DATA" );
    $list95 = ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ), makeKeyword( "VALIGN" ), makeKeyword( "TOP" ) );
    $sym96$HTML_FORMAT = makeSymbol( "HTML-FORMAT" );
    $str97$_A_ = makeString( "~A:" );
    $str98$focal = makeString( "focal" );
    $kw99$RIGHT = makeKeyword( "RIGHT" );
    $str100$SUID = makeString( "SUID" );
    $str101$Special_Type = makeString( "Special Type" );
    $str102$Arg_Position = makeString( "Arg Position" );
    $str103$Top_Level = makeString( "Top Level" );
    $str104$Category = makeString( "Category" );
    $str105$String = makeString( "String" );
    $str106$Symbol = makeString( "Symbol" );
    $str107$Demerits = makeString( "Demerits" );
    $str108$___A_ = makeString( " (~A)" );
    $str109$Word = makeString( "Word" );
    $str110$CycL = makeString( "CycL" );
    $str111$Case = makeString( "Case" );
    $str112$Agreement = makeString( "Agreement" );
    $str113$Justification = makeString( "Justification" );
    $kw114$HL_SUPPORT = makeKeyword( "HL-SUPPORT" );
    $kw115$NONE = makeKeyword( "NONE" );
    $str116$Inferences = makeString( "Inferences" );
    $kw117$INFERENCE = makeKeyword( "INFERENCE" );
    $kw118$VERY_VERBOSE = makeKeyword( "VERY-VERBOSE" );
    $str119$Output_List = makeString( "Output List" );
    $str120$output_list = makeString( "output-list" );
    $str121$Problems = makeString( "Problems" );
    $str122$problems = makeString( "problems" );
    $list123 = ConsesLow.cons( makeSymbol( "TYPE" ), makeSymbol( "OTHER-INFO" ) );
    $str124$__ = makeString( "??" );
    $str125$_ = makeString( "\"" );
    $str126$ArgPos = makeString( "ArgPos" );
    $str127$AgrPred = makeString( "AgrPred" );
    $str128$__ = makeString( " (" );
    $str129$_ = makeString( ")" );
    $str130$Absolute___A = makeString( "Absolute: ~A" );
    $str131$Relative___A_to_ = makeString( "Relative: ~A to " );
    $str132$___ = makeString( "..." );
    $str133$_No_Paraphrase_ = makeString( "[No Paraphrase]" );
  }
}
/*
 * 
 * Total time: 2840 ms
 * 
 */