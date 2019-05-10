package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_html
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_html";
  public static final String myFingerPrint = "7cbcc8ce67ab0daac953d2f189e57a8ecd0127233681f7b6b58e3fcc006025dd";
  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 12248L)
  private static SubLSymbol $pph_old_citation_method_visual_indicator_html_color$;
  private static final SubLSymbol $kw0$ANY;
  private static final SubLSymbol $sym1$HLMT_;
  private static final SubLSymbol $kw2$HTML_GENERATE_PHRASE;
  private static final SubLSymbol $kw3$HTML;
  private static final SubLSymbol $kw4$DECLARATIVE;
  private static final SubLSymbol $kw5$INTERROGATIVE;
  private static final SubLString $str6$cb_cf;
  private static final SubLSymbol $sym7$PARAPHRASE_LINK_TO_CB_START;
  private static final SubLSymbol $kw8$HTML_HANDLER;
  private static final SubLSymbol $sym9$HTML_PG_ANCHOR_TEXT;
  private static final SubLList $list10;
  private static final SubLString $str11$paraphrase;
  private static final SubLString $str12$string;
  private static final SubLSymbol $kw13$UNINITIALIZED;
  private static final SubLString $str14$sub_paraphrase;
  private static final SubLString $str15$open_tag;
  private static final SubLString $str16$close_tag;
  private static final SubLString $str17$arg_position;
  private static final SubLString $str18$cycl_id;
  private static final SubLString $str19$offset;
  private static final SubLString $str20$_a_href_;
  private static final SubLString $str21$_;
  private static final SubLString $str22$__a_;
  private static final SubLString $str23$naut;
  private static final SubLSymbol $sym24$PPH_NAUT_ID_FN;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$_URL;
  private static final SubLObject $const27$salientURL;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$GET_TERM_ID;
  private static final SubLSymbol $kw30$NONE;
  private static final SubLString $str31$_a_href__;
  private static final SubLString $str32$_;
  private static final SubLString $str33$_;
  private static final SubLString $str34$__target__;
  private static final SubLString $str35$__;
  private static final SubLString $str36$__Adding_tag_to__S_for__S___;
  private static final SubLString $str37$href;
  private static final SubLString $str38$_PPH_error_level_;
  private static final SubLString $str39$__;
  private static final SubLString $str40$__Adding_tag_to_string_containing;
  private static final SubLSymbol $sym41$_;
  private static final SubLSymbol $sym42$CAR;
  private static final SubLSymbol $sym43$PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS;
  private static final SubLList $list44;
  private static final SubLString $str45$__;
  private static final SubLString $str46$Source__;
  private static final SubLString $str47$_;
  private static final SubLString $str48$_;
  private static final SubLObject $const49$CycorpStyleSpecificationStandard;
  private static final SubLObject $const50$HypertextMarkupLanguage;
  private static final SubLSymbol $kw51$SUPERSCRIPTS;
  private static final SubLString $str52$__strengthened_by_Cyc_;
  private static final SubLString $str53$_;
  private static final SubLString $str54$sourcefootnote;
  private static final SubLSymbol $kw55$SQUARE_BRACKETS;
  private static final SubLString $str56$__D_;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$HTML_GENERATE_EXPONENT_NAUT;
  private static final SubLSymbol $kw60$EXPONENT_NAUT;
  private static final SubLSymbol $kw61$BEST;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$ARG1;
  private static final SubLSymbol $kw64$ARG2;

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 922L)
  public static SubLObject html_generate_phrase(final SubLObject v_object, SubLObject nl_preds, SubLObject determiner, SubLObject language_mt, SubLObject domain_mt)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$ANY;
    }
    if( determiner == UNPROVIDED )
    {
      determiner = NIL;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmtP( language_mt ) : language_mt;
    assert NIL != hlmt.hlmtP( domain_mt ) : domain_mt;
    SubLObject ans = NIL;
    SubLObject pred = NIL;
    SubLObject justifications = NIL;
    SubLObject output_list = NIL;
    SubLObject demerits = NIL;
    SubLObject v_pph_phrase = NIL;
    final SubLObject _prev_bind_0 = pph_utilities.$pph_current_environment$.currentBinding( thread );
    try
    {
      pph_utilities.$pph_current_environment$.bind( pph_utilities.find_or_create_pph_context(), thread );
      pph_utilities.pph_push_environment( $kw2$HTML_GENERATE_PHRASE );
      try
      {
        thread.resetMultipleValues();
        final SubLObject ans_$1 = pph_main.generate_phrase_no_checks( v_object, nl_preds, determiner, language_mt, domain_mt, $kw3$HTML, UNPROVIDED, UNPROVIDED );
        final SubLObject pred_$2 = thread.secondMultipleValue();
        final SubLObject justifications_$3 = thread.thirdMultipleValue();
        final SubLObject output_list_$4 = thread.fourthMultipleValue();
        final SubLObject demerits_$5 = thread.fifthMultipleValue();
        final SubLObject v_pph_phrase_$6 = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        ans = ans_$1;
        pred = pred_$2;
        justifications = justifications_$3;
        output_list = output_list_$4;
        demerits = demerits_$5;
        v_pph_phrase = v_pph_phrase_$6;
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          pph_utilities.pph_pop_environment();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      pph_utilities.$pph_current_environment$.rebind( _prev_bind_0, thread );
    }
    return Values.values( ans, pred, justifications, output_list, demerits, v_pph_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 1604L)
  public static SubLObject html_generate_text(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$ANY;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    assert NIL != hlmt.hlmtP( language_mt ) : language_mt;
    assert NIL != hlmt.hlmtP( domain_mt ) : domain_mt;
    return pph_main.generate_text_wXsentential_force( v_object, $kw4$DECLARATIVE, nl_preds, language_mt, domain_mt, $kw3$HTML, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 2018L)
  public static SubLObject html_generate_question(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$ANY;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    assert NIL != hlmt.hlmtP( language_mt ) : language_mt;
    assert NIL != hlmt.hlmtP( domain_mt ) : domain_mt;
    return pph_main.generate_text_wXsentential_force( v_object, $kw5$INTERROGATIVE, nl_preds, language_mt, domain_mt, $kw3$HTML, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 2453L)
  public static SubLObject paraphrase_link_to_cb_start(final SubLObject arg)
  {
    final SubLObject id_string = arg.first();
    return cb_frames.cb_start( ConsesLow.list( $str6$cb_cf, id_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 2586L)
  public static SubLObject html_generate_anchor_phrase(final SubLObject cycl_object, SubLObject function, SubLObject target)
  {
    if( function == UNPROVIDED )
    {
      function = $sym7$PARAPHRASE_LINK_TO_CB_START;
    }
    if( target == UNPROVIDED )
    {
      target = html_macros.$html_top_target$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject phrase = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding( thread );
    try
    {
      pph_vars.$constant_link_function$.bind( ( NIL != function ) ? function : pph_vars.$constant_link_function$.getDynamicValue( thread ), thread );
      pph_vars.$html_generation_target$.bind( ( NIL != target ) ? target : pph_vars.$html_generation_target$.getDynamicValue( thread ), thread );
      phrase = html_generate_phrase( cycl_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$html_generation_target$.rebind( _prev_bind_2, thread );
      pph_vars.$constant_link_function$.rebind( _prev_bind_0, thread );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 3073L)
  public static SubLObject html_phrase_with_target(final SubLObject cycl_object, SubLObject function, SubLObject target)
  {
    if( function == UNPROVIDED )
    {
      function = $sym7$PARAPHRASE_LINK_TO_CB_START;
    }
    if( target == UNPROVIDED )
    {
      target = html_macros.$html_top_target$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !target.isString() )
    {
      target = cb_utilities.cb_frame_name( target );
    }
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( NIL, thread );
      html_utilities.html_string( string_utilities.str( html_generate_anchor_phrase( cycl_object, function, target ) ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 3624L)
  public static SubLObject html_pg_anchor_text(final SubLObject cycl_object, SubLObject function, SubLObject target)
  {
    if( function == UNPROVIDED )
    {
      function = $sym7$PARAPHRASE_LINK_TO_CB_START;
    }
    if( target == UNPROVIDED )
    {
      target = html_macros.$html_top_target$.getGlobalValue();
    }
    return html_generate_anchor_text( cycl_object, function, target, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 3977L)
  public static SubLObject html_generate_anchor_text(final SubLObject cycl_object, SubLObject function, SubLObject target, SubLObject language_mt, SubLObject domain_mt)
  {
    if( function == UNPROVIDED )
    {
      function = $sym7$PARAPHRASE_LINK_TO_CB_START;
    }
    if( target == UNPROVIDED )
    {
      target = html_macros.$html_top_target$.getGlobalValue();
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject text = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding( thread );
    try
    {
      pph_vars.$constant_link_function$.bind( ( NIL != function ) ? function : pph_vars.$constant_link_function$.getDynamicValue( thread ), thread );
      pph_vars.$html_generation_target$.bind( ( NIL != target ) ? target : pph_vars.$html_generation_target$.getDynamicValue( thread ), thread );
      text = html_generate_text( cycl_object, $kw0$ANY, language_mt, domain_mt );
    }
    finally
    {
      pph_vars.$html_generation_target$.rebind( _prev_bind_2, thread );
      pph_vars.$constant_link_function$.rebind( _prev_bind_0, thread );
    }
    return text;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 4690L)
  public static SubLObject html_text_with_target(final SubLObject cycl_object, SubLObject function, SubLObject target, SubLObject language_mt, SubLObject domain_mt)
  {
    if( function == UNPROVIDED )
    {
      function = $sym7$PARAPHRASE_LINK_TO_CB_START;
    }
    if( target == UNPROVIDED )
    {
      target = html_macros.$html_top_target$.getGlobalValue();
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !target.isString() )
    {
      target = cb_utilities.cb_frame_name( target );
    }
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( NIL, thread );
      pph_vars.$pph_language_mt$.bind( language_mt, thread );
      pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
      html_utilities.html_princ_doc_string( string_utilities.str( html_generate_anchor_text( cycl_object, function, target, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_3, thread );
      pph_vars.$pph_language_mt$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 5511L)
  public static SubLObject xml_output_pph_javalist(final SubLObject javalist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str11$paraphrase, ConsesLow.list( $str12$string, pph_utilities.pph_javalist_string( javalist ) ), NIL, NIL, $kw13$UNINITIALIZED );
        final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw13$UNINITIALIZED, thread );
          SubLObject cdolist_list_var = pph_utilities.pph_javalist_items( javalist );
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            xml_utilities.xml_terpri();
            xml_output_pph_javalist_item( item );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str11$paraphrase );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 5811L)
  public static SubLObject xml_output_pph_javalist_item(final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
    try
    {
      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
      xml_utilities.xml_start_tag_internal( $str14$sub_paraphrase, pph_javalist_item_xml_attributes( item ), T, NIL, $kw13$UNINITIALIZED );
      final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
      try
      {
        xml_vars.$xml_default_namespace$.bind( $kw13$UNINITIALIZED, thread );
      }
      finally
      {
        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
      }
    }
    finally
    {
      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
    }
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 5955L)
  public static SubLObject pph_javalist_item_xml_attributes(final SubLObject item)
  {
    SubLObject attributes = ConsesLow.list( $str12$string, pph_utilities.pph_javalist_item_string( item ) );
    final SubLObject open_tag = pph_utilities.pph_javalist_item_open_tag( item );
    if( NIL != open_tag )
    {
      attributes = ConsesLow.append( attributes, ConsesLow.list( $str15$open_tag, open_tag ) );
    }
    final SubLObject close_tag = pph_utilities.pph_javalist_item_close_tag( item );
    if( NIL != close_tag )
    {
      attributes = ConsesLow.append( attributes, ConsesLow.list( $str16$close_tag, close_tag ) );
    }
    final SubLObject arg_position = pph_utilities.pph_javalist_item_arg_position( item );
    if( NIL == pph_utilities.pph_unknown_arg_position_p( arg_position ) )
    {
      attributes = ConsesLow.append( attributes, ConsesLow.list( $str17$arg_position, arg_position ) );
    }
    final SubLObject cycl = pph_utilities.pph_javalist_item_cycl( item );
    if( NIL == pph_phrase.pph_empty_cycl_p( cycl ) )
    {
      attributes = ConsesLow.append( attributes, ConsesLow.list( $str18$cycl_id, kb_utilities.compact_hl_external_id_string( cycl ) ) );
    }
    attributes = ConsesLow.append( attributes, ConsesLow.list( $str19$offset, pph_utilities.pph_javalist_item_start_char( item ) ) );
    return attributes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 6903L)
  public static SubLObject pph_use_anchor_tags_for_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw3$HTML && NIL == pph_utilities.pph_nl_tagP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 7093L)
  public static SubLObject pph_use_anchor_tags_for_arg_positionP(final SubLObject arg_position)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == pph_utilities.pph_unknown_arg_position_p( arg_position ) && ( NIL == pph_phrase.pph_arg0_position_p( arg_position ) || NIL != pph_vars.$pph_link_arg0P$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 7299L)
  public static SubLObject pph_anchor_tags_for_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_vars.$pph_use_salient_urlP$.getDynamicValue( thread ) )
    {
      final SubLObject salient_url = pph_get_salient_url( v_term );
      if( NIL != salient_url )
      {
        return Values.values( Sequences.cconcatenate( $str20$_a_href_, new SubLObject[] { format_nil.format_nil_s_no_copy( salient_url ), $str21$_
        } ), $str22$__a_ );
      }
    }
    final SubLObject open_tag = pph_html_open_tag_for_term( v_term );
    final SubLObject close_tag = ( NIL != open_tag ) ? pph_html_close_tag_for_term( v_term ) : NIL;
    return Values.values( open_tag, close_tag );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 7686L)
  public static SubLObject pph_naut_id_fn(final SubLObject naut)
  {
    return ( NIL != narts_high.naut_p( naut ) ) ? Sequences.cconcatenate( $str23$naut, format_nil.format_nil_a_no_copy( cb_parameters.cb_glob_id( naut ) ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 7804L)
  public static SubLObject pph_get_salient_url(final SubLObject v_term)
  {
    SubLObject url_string = NIL;
    if( NIL == url_string )
    {
      SubLObject csome_list_var = pph_utilities.pph_ask_variable_new( $sym26$_URL, ConsesLow.listS( $const27$salientURL, v_term, $list28 ), UNPROVIDED, UNPROVIDED );
      SubLObject url = NIL;
      url = csome_list_var.first();
      while ( NIL == url_string && NIL != csome_list_var)
      {
        if( NIL != web_utilities.url_p( url ) )
        {
          url_string = url;
        }
        else if( NIL != formula_pattern_match.formula_matches_pattern( url, $list25 ) )
        {
          url_string = cycl_utilities.nat_arg1( url, UNPROVIDED );
        }
        csome_list_var = csome_list_var.rest();
        url = csome_list_var.first();
      }
    }
    return url_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 8141L)
  public static SubLObject pph_get_term_id(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id_fn = pph_vars.$html_generation_term_id_function$.getDynamicValue( thread ).isFunctionSpec() ? pph_vars.$html_generation_term_id_function$.getDynamicValue( thread ) : $sym29$GET_TERM_ID;
    return Functions.funcall( id_fn, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 8346L)
  public static SubLObject pph_html_open_tag_for_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = pph_get_term_id( v_term );
    if( $kw30$NONE == pph_vars.$constant_link_function$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL != fact_sheets.within_fact_sheet_paraphraseP() )
    {
      if( NIL == id )
      {
        return NIL;
      }
      return fact_sheets.fact_sheet_bogus_hyperlink_open_tag_for_term( v_term, id );
    }
    else
    {
      if( NIL != id )
      {
        return Sequences.cconcatenate( $str31$_a_href__, new SubLObject[] { format_nil.format_nil_a_no_copy( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) ), $str32$_, format_nil.format_nil_a_no_copy(
            pph_vars.$constant_link_function$.getDynamicValue( thread ) ), $str33$_, format_nil.format_nil_a_no_copy( id ), $str34$__target__, format_nil.format_nil_a_no_copy( pph_vars.$html_generation_target$
                .getDynamicValue( thread ) ), $str35$__
        } );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 8844L)
  public static SubLObject pph_html_close_tag_for_term(final SubLObject v_term)
  {
    return html_macros.$html_anchor_tail$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 8942L)
  public static SubLObject pph_html_includes_anchor_open_tagP(final SubLObject html)
  {
    return makeBoolean( html.isString() && NIL != string_utilities.substringP( html_macros.$html_anchor_head$.getGlobalValue(), html, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 9077L)
  public static SubLObject pph_html_includes_anchor_close_tagP(final SubLObject html)
  {
    return makeBoolean( html.isString() && NIL != string_utilities.substringP( html_macros.$html_anchor_tail$.getGlobalValue(), html, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 9213L)
  public static SubLObject string_term_anchor(final SubLObject string, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str36$__Adding_tag_to__S_for__S___, string, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != string_utilities.substringP( $str37$href, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str39$__, format_nil.format_nil_a_no_copy(
          $str40$__Adding_tag_to_string_containing )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( v_term, string ) );
    }
    SubLObject ans = string;
    final SubLObject id = misc_kb_utilities.get_term_id( v_term );
    if( NIL == parsing_utilities.nl_tagP( v_term, UNPROVIDED ) && id.isInteger() )
    {
      ans = Sequences.cconcatenate( $str31$_a_href__, new SubLObject[] { format_nil.format_nil_a_no_copy( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) ), $str32$_, format_nil.format_nil_a_no_copy(
          pph_vars.$constant_link_function$.getDynamicValue( thread ) ), $str33$_, format_nil.format_nil_a_no_copy( id ), $str34$__target__, format_nil.format_nil_a_no_copy( pph_vars.$html_generation_target$
              .getDynamicValue( thread ) ), $str35$__, format_nil.format_nil_a_no_copy( string ), $str22$__a_
      } );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 9954L)
  public static SubLObject pph_footnote_string_for_source_ids(final SubLObject source_ids)
  {
    final SubLObject sorted_ids = Sort.sort( conses_high.copy_list( source_ids ), Symbols.symbol_function( $sym41$_ ), Symbols.symbol_function( $sym42$CAR ) );
    return pph_footnote_string_for_sorted_source_ids( sorted_ids );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 10151L)
  public static SubLObject pph_footnote_string_for_sorted_source_ids_internal(final SubLObject sorted_ids)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sorted_ids )
    {
      return string_utilities.$empty_string$.getGlobalValue();
    }
    SubLObject done_a_sourceP = NIL;
    SubLObject footnote_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        SubLObject cdolist_list_var = sorted_ids;
        SubLObject source_id_and_source = NIL;
        source_id_and_source = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = source_id_and_source;
          SubLObject source_id = NIL;
          SubLObject source = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
          source_id = current.first();
          current = ( source = current.rest() );
          if( NIL != done_a_sourceP )
          {
            html_utilities.html_princ( $str45$__ );
          }
          final SubLObject superscriptP = T;
          pph_maybe_show_source_icon( source, $str46$Source__, superscriptP );
          pph_html_citation_id_string( source_id, pph_vars.$pph_citation_format$.getDynamicValue( thread ) );
          done_a_sourceP = T;
          cdolist_list_var = cdolist_list_var.rest();
          source_id_and_source = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      footnote_string = streams_high.get_output_stream_string( stream );
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
    return footnote_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 10151L)
  public static SubLObject pph_footnote_string_for_sorted_source_ids(final SubLObject sorted_ids)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_footnote_string_for_sorted_source_ids_internal( sorted_ids );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym43$PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym43$PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym43$PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sorted_ids, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_footnote_string_for_sorted_source_ids_internal( sorted_ids ) ) );
      memoization_state.caching_state_put( caching_state, sorted_ids, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 10969L)
  public static SubLObject pph_maybe_show_source_icon(SubLObject source, SubLObject alt_intro, SubLObject superscriptP)
  {
    if( alt_intro == UNPROVIDED )
    {
      alt_intro = string_utilities.$empty_string$.getGlobalValue();
    }
    if( superscriptP == UNPROVIDED )
    {
      superscriptP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject icon_path = sources.icon_path_for_source( source, UNPROVIDED );
    final SubLObject provenance = thread.secondMultipleValue();
    final SubLObject source_type = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != icon_path )
    {
      final SubLObject alternate_text = pph_alternate_text_for_source( source, provenance, source_type, alt_intro );
      if( NIL != superscriptP )
      {
        html_utilities.html_markup( html_macros.$html_superscript_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( icon_path );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alternate_text )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alternate_text );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
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
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_superscript_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( icon_path );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alternate_text )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alternate_text );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
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
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
    }
    return source;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 11479L)
  public static SubLObject pph_alternate_text_for_source(SubLObject source, final SubLObject provenance, final SubLObject source_type, SubLObject intro)
  {
    if( intro == UNPROVIDED )
    {
      intro = string_utilities.$empty_string$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != source )
    {
      final SubLObject source_result = sources.source_citation_string( source, $kw0$ANY, $kw0$ANY );
      if( NIL != source_result )
      {
        return source_result;
      }
    }
    final SubLObject content = ( NIL != source ) ? source : ( ( NIL != provenance ) ? provenance : source_type );
    SubLObject alternate_text = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    try
    {
      pph_vars.$pph_terse_modeP$.bind( T, thread );
      pph_vars.$pph_demerit_cutoff$.bind( TWO_INTEGER, thread );
      alternate_text = pph_main.generate_phrase( content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_terse_modeP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != alternate_text )
    {
      alternate_text = html_utilities.html_escape( cycl_string.cycl_string_to_utf8_string( alternate_text ), T );
    }
    return Sequences.cconcatenate( $str47$_, new SubLObject[] { format_nil.format_nil_a_no_copy( intro ), format_nil.format_nil_a_no_copy( ( NIL != alternate_text ) ? alternate_text
        : string_utilities.$empty_string$.getGlobalValue() ), $str48$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 12354L)
  public static SubLObject pph_citation_string_new(SubLObject source)
  {
    return sources.source_citation_string( source, $const49$CycorpStyleSpecificationStandard, $const50$HypertextMarkupLanguage );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 12506L)
  public static SubLObject pph_html_citation_string(final SubLObject citation, SubLObject type, SubLObject allow_web_linksP)
  {
    if( type == UNPROVIDED )
    {
      type = $kw51$SUPERSCRIPTS;
    }
    if( allow_web_linksP == UNPROVIDED )
    {
      allow_web_linksP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject source = pph_source_citation_source( citation );
    SubLObject citation_id_string = NIL;
    SubLObject citation_body_string = NIL;
    SubLObject new_implementation_succeededP = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        new_implementation_succeededP = pph_html_citation_string_int( source, allow_web_linksP );
        if( NIL != pph_source_citation_strengthenedP( citation ) )
        {
          html_utilities.html_princ( $str52$__strengthened_by_Cyc_ );
        }
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      citation_body_string = streams_high.get_output_stream_string( stream );
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
    stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        final SubLObject id = pph_source_citation_id( citation );
        if( NIL != new_implementation_succeededP || NIL == deprecate_old_source_citation_formatP() )
        {
          pph_html_citation_id_string( id, type );
        }
        else
        {
          final SubLObject color_val = $pph_old_citation_method_visual_indicator_html_color$.getGlobalValue();
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
            pph_html_citation_id_string( id, type );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        pph_maybe_show_source_icon( source, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      citation_id_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return Sequences.cconcatenate( citation_id_string, new SubLObject[] { $str53$_, citation_body_string
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 13562L)
  public static SubLObject deprecate_old_source_citation_formatP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( pph_vars.$pph_deprecate_old_source_citation_formatP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 13683L)
  public static SubLObject pph_html_citation_id_string(final SubLObject id, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str54$sourcefootnote );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( type.eql( $kw51$SUPERSCRIPTS ) )
      {
        html_utilities.html_markup( html_macros.$html_superscript_head$.getGlobalValue() );
        html_utilities.html_princ( id );
        html_utilities.html_markup( html_macros.$html_superscript_tail$.getGlobalValue() );
      }
      else if( type.eql( $kw55$SQUARE_BRACKETS ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str56$__D_, id );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 13935L)
  public static SubLObject pph_html_citation_string_int(SubLObject source, final SubLObject allow_web_linksP)
  {
    final SubLObject new_implementation_succeededP = pph_html_citation_string_int_new( source, allow_web_linksP );
    if( NIL == new_implementation_succeededP )
    {
      pph_html_citation_string_int_old( source, allow_web_linksP );
    }
    return new_implementation_succeededP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 14259L)
  public static SubLObject pph_html_citation_string_int_new(SubLObject source, final SubLObject allow_web_linksP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject citation_string = pph_citation_string_new( source );
    if( NIL != unicode_nauts.unicode_naut_p( citation_string, UNPROVIDED ) )
    {
      citation_string = unicode_strings.unicode_display_to_html( cycl_utilities.nat_arg1( citation_string, UNPROVIDED ) );
    }
    if( citation_string.isString() )
    {
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( NIL, thread );
        if( NIL != allow_web_linksP )
        {
          html_utilities.html_princ_cycl_string( citation_string, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          html_utilities.html_princ( citation_string );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
    }
    return citation_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 14803L)
  public static SubLObject pph_html_citation_string_int_old(SubLObject source, final SubLObject allow_web_linksP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = pph_vars.$pph_use_salient_urlP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_use_salient_urlP$.bind( allow_web_linksP, thread );
      pph_proof.pph_show_term( source, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_use_salient_urlP$.rebind( _prev_bind_0, thread );
    }
    return source;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15058L)
  public static SubLObject pph_source_citation_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && NIL != pattern_match.tree_matches_pattern( v_object, $list57 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15256L)
  public static SubLObject new_pph_source_citation(SubLObject source, final SubLObject id, SubLObject strengthenedP)
  {
    if( strengthenedP == UNPROVIDED )
    {
      strengthenedP = NIL;
    }
    return ConsesLow.list( id, source, strengthenedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15375L)
  public static SubLObject pph_source_citation_id(final SubLObject citation)
  {
    return citation.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15454L)
  public static SubLObject pph_source_citation_source(final SubLObject citation)
  {
    return conses_high.second( citation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15538L)
  public static SubLObject pph_source_citation_strengthenedP(final SubLObject citation)
  {
    return conses_high.third( citation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15628L)
  public static SubLObject pph_phrase_italicize(final SubLObject phrase)
  {
    return pph_phrase.pph_phrase_add_html_tags( phrase, html_macros.$html_italic_head$.getGlobalValue(), html_macros.$html_italic_tail$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 15758L)
  public static SubLObject pph_phrase_output_item_italicize(final SubLObject output_item)
  {
    SubLObject current;
    final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags( output_item );
    SubLObject open_tag = NIL;
    SubLObject close_tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    open_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    close_tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject new_open_tag = open_tag.isString() ? Sequences.cconcatenate( html_macros.$html_italic_head$.getGlobalValue(), open_tag ) : html_macros.$html_italic_head$.getGlobalValue();
      final SubLObject new_close_tag = close_tag.isString() ? Sequences.cconcatenate( close_tag, html_macros.$html_italic_tail$.getGlobalValue() ) : html_macros.$html_italic_tail$.getGlobalValue();
      pph_data_structures.pph_phrase_output_item_set_html_tags( output_item, new_open_tag, new_close_tag );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    }
    return output_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 16283L)
  public static SubLObject pph_phrase_output_item_superscript(final SubLObject output_item)
  {
    SubLObject current;
    final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags( output_item );
    SubLObject open_tag = NIL;
    SubLObject close_tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    open_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    close_tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject new_open_tag = open_tag.isString() ? Sequences.cconcatenate( html_macros.$html_superscript_head$.getGlobalValue(), open_tag ) : html_macros.$html_superscript_head$.getGlobalValue();
      final SubLObject new_close_tag = close_tag.isString() ? Sequences.cconcatenate( close_tag, html_macros.$html_superscript_tail$.getGlobalValue() ) : html_macros.$html_superscript_tail$.getGlobalValue();
      pph_data_structures.pph_phrase_output_item_set_html_tags( output_item, new_open_tag, new_close_tag );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    }
    return output_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 16830L)
  public static SubLObject pph_phrase_output_item_subscript(final SubLObject output_item)
  {
    SubLObject current;
    final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags( output_item );
    SubLObject open_tag = NIL;
    SubLObject close_tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    open_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    close_tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject new_open_tag = open_tag.isString() ? Sequences.cconcatenate( html_macros.$html_subscript_head$.getGlobalValue(), open_tag ) : html_macros.$html_subscript_head$.getGlobalValue();
      final SubLObject new_close_tag = close_tag.isString() ? Sequences.cconcatenate( close_tag, html_macros.$html_subscript_tail$.getGlobalValue() ) : html_macros.$html_subscript_tail$.getGlobalValue();
      pph_data_structures.pph_phrase_output_item_set_html_tags( output_item, new_open_tag, new_close_tag );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    }
    return output_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 17367L)
  public static SubLObject term_anchor(final SubLObject v_term)
  {
    final SubLObject name = misc_kb_utilities.coerce_name( v_term );
    return string_term_anchor( name, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-html.lisp", position = 17634L)
  public static SubLObject html_generate_exponent_naut(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw3$HTML.eql( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) ) )
    {
      final SubLObject naut = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( naut, UNPROVIDED );
      SubLObject base = NIL;
      SubLObject exponent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      base = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      exponent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject output_list = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( pph_main.generate_phrase_no_checks( base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ), pph_utilities.pph_arg_position_from_template( $kw63$ARG1 ), base, UNPROVIDED, UNPROVIDED, UNPROVIDED ), pph_phrase_output_item_superscript( pph_data_structures.new_pph_phrase_output_item(
                pph_main.generate_phrase_no_checks( exponent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), pph_utilities.pph_arg_position_from_template( $kw64$ARG2 ), exponent,
                UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        pph_phrase.pph_phrase_set_output_list( phrase, output_list, UNPROVIDED );
        pph_phrase.pph_phrase_note_done( phrase );
        return output_list;
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
    }
    return NIL;
  }

  public static SubLObject declare_pph_html_file()
  {
    SubLFiles.declareFunction( me, "html_generate_phrase", "HTML-GENERATE-PHRASE", 1, 4, false );
    SubLFiles.declareFunction( me, "html_generate_text", "HTML-GENERATE-TEXT", 1, 3, false );
    SubLFiles.declareFunction( me, "html_generate_question", "HTML-GENERATE-QUESTION", 1, 3, false );
    SubLFiles.declareFunction( me, "paraphrase_link_to_cb_start", "PARAPHRASE-LINK-TO-CB-START", 1, 0, false );
    SubLFiles.declareFunction( me, "html_generate_anchor_phrase", "HTML-GENERATE-ANCHOR-PHRASE", 1, 2, false );
    SubLFiles.declareFunction( me, "html_phrase_with_target", "HTML-PHRASE-WITH-TARGET", 1, 2, false );
    SubLFiles.declareFunction( me, "html_pg_anchor_text", "HTML-PG-ANCHOR-TEXT", 1, 2, false );
    SubLFiles.declareFunction( me, "html_generate_anchor_text", "HTML-GENERATE-ANCHOR-TEXT", 1, 4, false );
    SubLFiles.declareFunction( me, "html_text_with_target", "HTML-TEXT-WITH-TARGET", 1, 4, false );
    SubLFiles.declareFunction( me, "xml_output_pph_javalist", "XML-OUTPUT-PPH-JAVALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_pph_javalist_item", "XML-OUTPUT-PPH-JAVALIST-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_javalist_item_xml_attributes", "PPH-JAVALIST-ITEM-XML-ATTRIBUTES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_use_anchor_tags_for_termP", "PPH-USE-ANCHOR-TAGS-FOR-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_use_anchor_tags_for_arg_positionP", "PPH-USE-ANCHOR-TAGS-FOR-ARG-POSITION?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_anchor_tags_for_term", "PPH-ANCHOR-TAGS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_naut_id_fn", "PPH-NAUT-ID-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_get_salient_url", "PPH-GET-SALIENT-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_get_term_id", "PPH-GET-TERM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_html_open_tag_for_term", "PPH-HTML-OPEN-TAG-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_html_close_tag_for_term", "PPH-HTML-CLOSE-TAG-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_html_includes_anchor_open_tagP", "PPH-HTML-INCLUDES-ANCHOR-OPEN-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_html_includes_anchor_close_tagP", "PPH-HTML-INCLUDES-ANCHOR-CLOSE-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "string_term_anchor", "STRING-TERM-ANCHOR", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_footnote_string_for_source_ids", "PPH-FOOTNOTE-STRING-FOR-SOURCE-IDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_footnote_string_for_sorted_source_ids_internal", "PPH-FOOTNOTE-STRING-FOR-SORTED-SOURCE-IDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_footnote_string_for_sorted_source_ids", "PPH-FOOTNOTE-STRING-FOR-SORTED-SOURCE-IDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_maybe_show_source_icon", "PPH-MAYBE-SHOW-SOURCE-ICON", 1, 2, false );
    SubLFiles.declareFunction( me, "pph_alternate_text_for_source", "PPH-ALTERNATE-TEXT-FOR-SOURCE", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_citation_string_new", "PPH-CITATION-STRING-NEW", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_html_citation_string", "PPH-HTML-CITATION-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "deprecate_old_source_citation_formatP", "DEPRECATE-OLD-SOURCE-CITATION-FORMAT?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_html_citation_id_string", "PPH-HTML-CITATION-ID-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_html_citation_string_int", "PPH-HTML-CITATION-STRING-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_html_citation_string_int_new", "PPH-HTML-CITATION-STRING-INT-NEW", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_html_citation_string_int_old", "PPH-HTML-CITATION-STRING-INT-OLD", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_source_citation_p", "PPH-SOURCE-CITATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_pph_source_citation", "NEW-PPH-SOURCE-CITATION", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_source_citation_id", "PPH-SOURCE-CITATION-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_source_citation_source", "PPH-SOURCE-CITATION-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_source_citation_strengthenedP", "PPH-SOURCE-CITATION-STRENGTHENED?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_italicize", "PPH-PHRASE-ITALICIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_output_item_italicize", "PPH-PHRASE-OUTPUT-ITEM-ITALICIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_output_item_superscript", "PPH-PHRASE-OUTPUT-ITEM-SUPERSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_output_item_subscript", "PPH-PHRASE-OUTPUT-ITEM-SUBSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_anchor", "TERM-ANCHOR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_generate_exponent_naut", "HTML-GENERATE-EXPONENT-NAUT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_html_file()
  {
    $pph_old_citation_method_visual_indicator_html_color$ = SubLFiles.defconstant( "*PPH-OLD-CITATION-METHOD-VISUAL-INDICATOR-HTML-COLOR*", html_macros.$html_color_medium_dark_red$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_pph_html_file()
  {
    html_macros.note_cgi_handler_function( $sym7$PARAPHRASE_LINK_TO_CB_START, $kw8$HTML_HANDLER );
    access_macros.define_obsolete_register( $sym9$HTML_PG_ANCHOR_TEXT, $list10 );
    utilities_macros.note_funcall_helper_function( $sym24$PPH_NAUT_ID_FN );
    memoization_state.note_memoized_function( $sym43$PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS );
    pph_types.pph_register_method( $sym59$HTML_GENERATE_EXPONENT_NAUT, $kw60$EXPONENT_NAUT, $kw61$BEST );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_html_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_html_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_html_file();
  }
  static
  {
    me = new pph_html();
    $pph_old_citation_method_visual_indicator_html_color$ = null;
    $kw0$ANY = makeKeyword( "ANY" );
    $sym1$HLMT_ = makeSymbol( "HLMT?" );
    $kw2$HTML_GENERATE_PHRASE = makeKeyword( "HTML-GENERATE-PHRASE" );
    $kw3$HTML = makeKeyword( "HTML" );
    $kw4$DECLARATIVE = makeKeyword( "DECLARATIVE" );
    $kw5$INTERROGATIVE = makeKeyword( "INTERROGATIVE" );
    $str6$cb_cf = makeString( "cb-cf" );
    $sym7$PARAPHRASE_LINK_TO_CB_START = makeSymbol( "PARAPHRASE-LINK-TO-CB-START" );
    $kw8$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym9$HTML_PG_ANCHOR_TEXT = makeSymbol( "HTML-PG-ANCHOR-TEXT" );
    $list10 = ConsesLow.list( makeSymbol( "HTML-GENERATE-ANCHOR-TEXT" ) );
    $str11$paraphrase = makeString( "paraphrase" );
    $str12$string = makeString( "string" );
    $kw13$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str14$sub_paraphrase = makeString( "sub-paraphrase" );
    $str15$open_tag = makeString( "open-tag" );
    $str16$close_tag = makeString( "close-tag" );
    $str17$arg_position = makeString( "arg-position" );
    $str18$cycl_id = makeString( "cycl-id" );
    $str19$offset = makeString( "offset" );
    $str20$_a_href_ = makeString( "<a href=" );
    $str21$_ = makeString( ">" );
    $str22$__a_ = makeString( "</a>" );
    $str23$naut = makeString( "naut" );
    $sym24$PPH_NAUT_ID_FN = makeSymbol( "PPH-NAUT-ID-FN" );
    $list25 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "URLFn" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "URL-P" ) ) );
    $sym26$_URL = makeSymbol( "?URL" );
    $const27$salientURL = constant_handles.reader_make_constant_shell( makeString( "salientURL" ) );
    $list28 = ConsesLow.list( makeSymbol( "?URL" ) );
    $sym29$GET_TERM_ID = makeSymbol( "GET-TERM-ID" );
    $kw30$NONE = makeKeyword( "NONE" );
    $str31$_a_href__ = makeString( "<a href=\"" );
    $str32$_ = makeString( "?" );
    $str33$_ = makeString( "&" );
    $str34$__target__ = makeString( "\" target=\"" );
    $str35$__ = makeString( "\">" );
    $str36$__Adding_tag_to__S_for__S___ = makeString( "~&Adding tag to ~S for ~S.~%" );
    $str37$href = makeString( "href" );
    $str38$_PPH_error_level_ = makeString( "(PPH error level " );
    $str39$__ = makeString( ") " );
    $str40$__Adding_tag_to_string_containing = makeString( "~&Adding tag to string containing tag: ~S ~S~%" );
    $sym41$_ = makeSymbol( "<" );
    $sym42$CAR = makeSymbol( "CAR" );
    $sym43$PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS = makeSymbol( "PPH-FOOTNOTE-STRING-FOR-SORTED-SOURCE-IDS" );
    $list44 = ConsesLow.cons( makeSymbol( "SOURCE-ID" ), makeSymbol( "SOURCE" ) );
    $str45$__ = makeString( ", " );
    $str46$Source__ = makeString( "Source: " );
    $str47$_ = makeString( "[" );
    $str48$_ = makeString( "]" );
    $const49$CycorpStyleSpecificationStandard = constant_handles.reader_make_constant_shell( makeString( "CycorpStyleSpecificationStandard" ) );
    $const50$HypertextMarkupLanguage = constant_handles.reader_make_constant_shell( makeString( "HypertextMarkupLanguage" ) );
    $kw51$SUPERSCRIPTS = makeKeyword( "SUPERSCRIPTS" );
    $str52$__strengthened_by_Cyc_ = makeString( " (strengthened by Cyc)" );
    $str53$_ = makeString( " " );
    $str54$sourcefootnote = makeString( "sourcefootnote" );
    $kw55$SQUARE_BRACKETS = makeKeyword( "SQUARE-BRACKETS" );
    $str56$__D_ = makeString( "[~D]" );
    $list57 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSITIVE-INTEGER-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-TERM-P" ) ), ConsesLow.list( makeKeyword( "TEST" ),
        makeSymbol( "BOOLEANP" ) ) );
    $list58 = ConsesLow.list( makeSymbol( "OPEN-TAG" ), makeSymbol( "CLOSE-TAG" ) );
    $sym59$HTML_GENERATE_EXPONENT_NAUT = makeSymbol( "HTML-GENERATE-EXPONENT-NAUT" );
    $kw60$EXPONENT_NAUT = makeKeyword( "EXPONENT-NAUT" );
    $kw61$BEST = makeKeyword( "BEST" );
    $list62 = ConsesLow.list( makeSymbol( "BASE" ), makeSymbol( "EXPONENT" ) );
    $kw63$ARG1 = makeKeyword( "ARG1" );
    $kw64$ARG2 = makeKeyword( "ARG2" );
  }
}
/*
 * 
 * Total time: 594 ms
 * 
 */