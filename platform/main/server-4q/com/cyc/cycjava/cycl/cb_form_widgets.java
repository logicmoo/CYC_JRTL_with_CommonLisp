package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_form_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_form_widgets";
  public static final String myFingerPrint = "26928aec457599d9ad1e885ad2445f69523e5780f8bb66939dfe75493219d770";
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 1302L)
  public static SubLSymbol $legacy_sentence_editor_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 1618L)
  public static SubLSymbol $sentence_editor_textarea_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 1804L)
  public static SubLSymbol $cb_use_codemirror_sentence_editorP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 2002L)
  public static SubLSymbol $ke_text_code_editor_textarea_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 2192L)
  public static SubLSymbol $cb_use_ke_text_editorP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 2329L)
  public static SubLSymbol $subl_code_editor_textarea_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 2511L)
  public static SubLSymbol $cb_use_subl_code_editorP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 3956L)
  private static SubLSymbol $cb_mt_input_default_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 22789L)
  private static SubLSymbol $cb_el_formula_input_default_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 27546L)
  private static SubLSymbol $codemirror_editor_start_script$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 34693L)
  private static SubLSymbol $utf8_nbsp$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 34884L)
  private static SubLSymbol $return_string$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 39376L)
  private static SubLSymbol $cb_el_term_input_default_name$;
  private static final SubLString $str0$legacySentenceEditor;
  private static final SubLString $str1$CycLEditorArea;
  private static final SubLSymbol $sym2$_CB_USE_CODEMIRROR_SENTENCE_EDITOR__;
  private static final SubLString $str3$KETextEditorArea;
  private static final SubLSymbol $sym4$_CB_USE_KE_TEXT_EDITOR__;
  private static final SubLString $str5$SubLEditorArea;
  private static final SubLSymbol $sym6$_CB_USE_SUBL_CODE_EDITOR__;
  private static final SubLString $str7$;
  private static final SubLString $str8$mt;
  private static final SubLSymbol $sym9$STRINGP;
  private static final SubLString $str10$_A_monad_dimension_specified;
  private static final SubLSymbol $kw11$EDIT_ALLOWED_;
  private static final SubLSymbol $kw12$INPUT_NAME;
  private static final SubLSymbol $kw13$MONAD_CHOICES;
  private static final SubLString $str14$Complete;
  private static final SubLObject $const15$Microtheory;
  private static final SubLString $str16$Mt___;
  private static final SubLString $str17$Clear_Mt;
  private static final SubLSymbol $kw18$TOP;
  private static final SubLString $str19$t;
  private static final SubLSymbol $kw20$LEFT;
  private static final SubLString $str21$Monad_Dimension;
  private static final SubLSymbol $kw22$RIGHT;
  private static final SubLString $str23$Monad_Mt___;
  private static final SubLString $str24$autocomplete_;
  private static final SubLString $str25$input_;
  private static final SubLString $str26$autocomplete_results_;
  private static final SubLString $str27$yui_ac;
  private static final SubLString $str28$position_static;
  private static final SubLString $str29$yui_ac_input;
  private static final SubLString $str30$yui_ac_container;
  private static final SubLString $str31$_A_monad;
  private static final SubLString $str32$_A_time_dimension_specified;
  private static final SubLSymbol $kw33$ANYTIME_PSC_ALLOWED_;
  private static final SubLString $str34$na;
  private static final SubLString $str35$Time_Dimension;
  private static final SubLList $list36;
  private static final SubLObject $const37$TimeInterval;
  private static final SubLString $str38$Time_;
  private static final SubLString $str39$Interval___;
  private static final SubLString $str40$Clear_Interval;
  private static final SubLString $str41$_A_time_interval;
  private static final SubLList $list42;
  private static final SubLObject $const43$TimeParameter;
  private static final SubLString $str44$Parameter___;
  private static final SubLString $str45$Clear_Parameter;
  private static final SubLString $str46$_A_time_parameter;
  private static final SubLSymbol $kw47$ALLOW_VARIABLE_;
  private static final SubLSymbol $kw48$UNINITIALIZED;
  private static final SubLObject $const49$AnytimePSC;
  private static final SubLSymbol $kw50$MONAD_MT;
  private static final SubLSymbol $kw51$TIME_MT;
  private static final SubLSymbol $kw52$TIME_INTERVAL;
  private static final SubLSymbol $kw53$TIME_PARAMETER;
  private static final SubLSymbol $kw54$MT_ERROR;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$WHOLLY_UNSPECIFIED;
  private static final SubLString $str57$No_microtheory_was_specified_;
  private static final SubLSymbol $kw58$UNSPECIFIED;
  private static final SubLString $str59$No_monadic_microtheory_was_specif;
  private static final SubLString $str60$No_microtheory_time_dimension_was;
  private static final SubLString $str61$No_microtheory_time_interval_was_;
  private static final SubLString $str62$No_microtheory_time_parameter_was;
  private static final SubLString $str63$The_MT_part__A_was_not_specified_;
  private static final SubLSymbol $kw64$UNINTELLIGIBLE;
  private static final SubLString $str65$The_string__S_did_not_make_sense_;
  private static final SubLString $str66$The_string__S_did_not_make_sense_;
  private static final SubLString $str67$The_string__S_did_not_make_sense_;
  private static final SubLString $str68$The_string__S_did_not_make_sense_;
  private static final SubLString $str69$The_string__S_did_not_make_sense_;
  private static final SubLSymbol $kw70$UNMATCHED_PAREN;
  private static final SubLString $str71$Unmatched_Parentheses_in_microthe;
  private static final SubLString $str72$Unmatched_Parentheses_in_microthe;
  private static final SubLString $str73$Unmatched_Parentheses_in_time_int;
  private static final SubLString $str74$Unmatched_Parentheses_in_time_par;
  private static final SubLString $str75$Unmatched_Parentheses_in_mt_part_;
  private static final SubLSymbol $kw76$INCOMPLETELY_SPECIFIED;
  private static final SubLString $str77$MT_parts__S_were_unspecified_;
  private static final SubLSymbol $kw78$SEMANTIC;
  private static final SubLString $str79$_S_did_not_specify_a_monadic_micr;
  private static final SubLString $str80$_S_did_not_specify_a_microtheory_;
  private static final SubLString $str81$_S_did_not_specify_a_microtheory_;
  private static final SubLSymbol $kw82$NON_TIME_INTERVAL;
  private static final SubLString $str83$_S_did_not_specify_a_time_interva;
  private static final SubLSymbol $kw84$NON_TIME_PARAMETER;
  private static final SubLString $str85$_S_did_not_specify_a_time_paramet;
  private static final SubLString $str86$_S_did_not_specify_a_term_suitabl;
  private static final SubLString $str87$MT_ERROR__S____S__S__S;
  private static final SubLString $str88$_S____S;
  private static final SubLString $str89$sentence;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLSymbol $kw92$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw93$COMPLETE_LABEL;
  private static final SubLSymbol $kw94$CHOICES;
  private static final SubLSymbol $kw95$PRETTY_NAME;
  private static final SubLString $str96$EL_Sentence;
  private static final SubLSymbol $kw97$CLEAR_LABEL;
  private static final SubLString $str98$Clear_Sentence;
  private static final SubLSymbol $kw99$CYCLIFY_LABEL;
  private static final SubLSymbol $kw100$WIDTH;
  private static final SubLInteger $int101$80;
  private static final SubLSymbol $kw102$HEIGHT;
  private static final SubLSymbol $kw103$MODE;
  private static final SubLSymbol $kw104$ASSERT;
  private static final SubLSymbol $sym105$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym106$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym107$CONSTANT_P;
  private static final SubLSymbol $sym108$KEYWORDP;
  private static final SubLString $str109$__;
  private static final SubLSymbol $kw110$QUERY;
  private static final SubLSymbol $sym111$UNICODE_NAUT_P;
  private static final SubLSymbol $sym112$CYCL_STRING_TO_UTF8_STRING;
  private static final SubLString $str113$false;
  private static final SubLString $str114$true;
  private static final SubLString $str115$_script_Event_onDOMReady_function;
  private static final SubLString $str116$var_options____________var_editor;
  private static final SubLSymbol $kw117$HTML_EDITOR_SCRIPTS;
  private static final SubLString $str118$javascript;
  private static final SubLSymbol $kw119$REQUIRE_SENTENCE_;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLSymbol $kw122$REQUIRED_;
  private static final SubLSymbol $kw123$AUTO_CYCLIFY;
  private static final SubLSymbol $sym124$CB_EXTRACT_QUERY_FORMULA_FROM_STRING;
  private static final SubLList $list125;
  private static final SubLString $str126$Bad_formula__probably_due_to_a_mi;
  private static final SubLSymbol $kw127$INVALID_CONSTANTS;
  private static final SubLSymbol $kw128$EOF;
  private static final SubLSymbol $kw129$UNMATCHED_PARENTHESES;
  private static final SubLSymbol $kw130$ERROR;
  private static final SubLSymbol $kw131$READ_ERROR;
  private static final SubLSymbol $sym132$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P;
  private static final SubLSymbol $kw133$SYMBOLS_FOR_INVALID_CONSTANTS;
  private static final SubLSymbol $kw134$NON_SENTENCE;
  private static final SubLSymbol $sym135$CYCL_STRING_P;
  private static final SubLList $list136;
  private static final SubLString $str137$_;
  private static final SubLObject $ic138;
  private static final SubLString $str139$Unable_to_initialize__A__;
  private static final SubLString $str140$_;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$EL_FORMULA_ERROR_P;
  private static final SubLSymbol $kw143$LOCATION;
  private static final SubLList $list144;
  private static final SubLString $str145$No_sentence_was_specified_in_;
  private static final SubLString $str146$_;
  private static final SubLString $str147$No_sentence_was_specified_;
  private static final SubLString $str148$_A;
  private static final SubLString $str149$Invalid_Constant_References_in_;
  private static final SubLString $str150$Invalid_Constant_References;
  private static final SubLSymbol $sym151$CB_SHOW_INVALID_CONSTANTS;
  private static final SubLString $str152$Unmatched_Parentheses_in_;
  private static final SubLString $str153$Unmatched_Parentheses;
  private static final SubLSymbol $sym154$CB_SHOW_UNMATCHED_PARENTHESES;
  private static final SubLString $str155$Unfinished_Formula_in_;
  private static final SubLString $str156$Unfinished_Formula;
  private static final SubLSymbol $sym157$CB_SHOW_EOF_EXPLANATION;
  private static final SubLString $str158$Unreadable_Formula_in_;
  private static final SubLString $str159$Unreadable_Formula;
  private static final SubLSymbol $sym160$CB_SHOW_READER_ERROR_EXPLANATION;
  private static final SubLSymbol $sym161$CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS;
  private static final SubLString $str162$Not_a_Sentence_in_;
  private static final SubLString $str163$Not_a_Sentence;
  private static final SubLSymbol $sym164$CB_SHOW_NON_SENTENCE_EXPLANATION;
  private static final SubLSymbol $kw165$EL_FORMULA_ERROR;
  private static final SubLString $str166$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str167$_meta_http_equiv__X_UA_Compatible;
  private static final SubLString $str168$term;
  private static final SubLString $str169$Clear_Term;
  private static final SubLSymbol $kw170$COMPLETE_TYPE;
  private static final SubLInteger $int171$300;
  private static final SubLString $str172$completeContainer;
  private static final SubLString $str173$textArea;
  private static final SubLString $str174$width__;
  private static final SubLString $str175$px_;
  private static final SubLString $str176$px__position_static;
  private static final SubLString $str177$autocomplete;
  private static final SubLString $str178$cycAutocompleteContainer;
  private static final SubLList $list179;
  private static final SubLList $list180;
  private static final SubLSymbol $kw181$EL_TERM_ERROR;
  private static final SubLSymbol $sym182$EL_TERM_ERROR_P;
  private static final SubLList $list183;
  private static final SubLString $str184$No_term_was_specified_in_;
  private static final SubLString $str185$No_term_was_specified_;
  private static final SubLString $str186$Unfinished_Term_in_;
  private static final SubLString $str187$Unfinished_Term;
  private static final SubLString $str188$Unreadable_Term_in_;
  private static final SubLString $str189$Unreadable_Term;
  private static final SubLSymbol $sym190$CB_CONVERT_STRINGS_TO_CYCL;
  private static final SubLSymbol $kw191$TEST;
  private static final SubLSymbol $kw192$OWNER;
  private static final SubLSymbol $kw193$CLASSES;
  private static final SubLSymbol $kw194$KB;
  private static final SubLSymbol $kw195$FULL;
  private static final SubLSymbol $kw196$WORKING_;
  private static final SubLList $list197;

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 2654L)
  public static SubLObject cb_monad_mt_display_string(SubLObject monad_mt)
  {
    if( monad_mt == UNPROVIDED )
    {
      monad_mt = NIL;
    }
    return ( NIL != monad_mt ) ? cb_utilities.cb_term_display_string( monad_mt ) : $str7$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 2972L)
  public static SubLObject cb_mt_input_section(SubLObject mt, SubLObject display_options)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( mt );
    final SubLObject time_mt = hlmt.hlmt_temporal_mt( mt );
    if( NIL != hlmt.hlmts_supportedP() )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_mt_input_monad_dimension_section( monad_mt, display_options );
        cb_mt_input_time_dimension_section( time_mt, display_options );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    else
    {
      cb_mt_input_monad_mt_section( monad_mt, display_options );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 4110L)
  public static SubLObject cb_monad_dimension_specified_name(final SubLObject input_name)
  {
    assert NIL != Types.stringp( input_name ) : input_name;
    return PrintLow.format( NIL, $str10$_A_monad_dimension_specified, input_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 4292L)
  public static SubLObject cb_mt_input_monad_mt_section(SubLObject monad_mt, SubLObject display_options)
  {
    if( monad_mt == UNPROVIDED )
    {
      monad_mt = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    final SubLObject edit_allowedP_tail = cdestructuring_bind.property_list_member( $kw11$EDIT_ALLOWED_, current );
    final SubLObject edit_allowedP = ( NIL != edit_allowedP_tail ) ? conses_high.cadr( edit_allowedP_tail ) : T;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_mt_input_default_name$.getGlobalValue();
    final SubLObject monad_choices_tail = cdestructuring_bind.property_list_member( $kw13$MONAD_CHOICES, current );
    final SubLObject monad_choices = ( NIL != monad_choices_tail ) ? conses_high.cadr( monad_choices_tail ) : NIL;
    final SubLObject monad_mt_input_name = cb_monad_mt_input_name( input_name );
    if( NIL != edit_allowedP )
    {
      html_complete.html_complete_button( monad_mt_input_name, $str14$Complete, $const15$Microtheory, NIL, NIL, monad_choices, UNPROVIDED );
      html_utilities.html_indent( ONE_INTEGER );
    }
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str16$Mt___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    final SubLObject mt_string = cb_monad_mt_display_string( monad_mt );
    if( NIL != edit_allowedP )
    {
      html_utilities.html_text_input( monad_mt_input_name, mt_string, cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
      html_utilities.html_indent( ONE_INTEGER );
      html_script_utilities.html_clear_input_button( monad_mt_input_name, $str17$Clear_Mt, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_form( monad_mt, UNPROVIDED, UNPROVIDED );
      html_utilities.html_hidden_input( monad_mt_input_name, mt_string, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 5267L)
  public static SubLObject cb_mt_input_monad_dimension_section(SubLObject monad_mt, SubLObject display_options)
  {
    if( monad_mt == UNPROVIDED )
    {
      monad_mt = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    final SubLObject edit_allowedP_tail = cdestructuring_bind.property_list_member( $kw11$EDIT_ALLOWED_, current );
    final SubLObject edit_allowedP = ( NIL != edit_allowedP_tail ) ? conses_high.cadr( edit_allowedP_tail ) : T;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_mt_input_default_name$.getGlobalValue();
    final SubLObject monad_choices_tail = cdestructuring_bind.property_list_member( $kw13$MONAD_CHOICES, current );
    final SubLObject monad_choices = ( NIL != monad_choices_tail ) ? conses_high.cadr( monad_choices_tail ) : NIL;
    if( NIL != edit_allowedP )
    {
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject monad_dimension_specified_name = cb_monad_dimension_specified_name( input_name );
          html_utilities.html_checkbox_input( monad_dimension_specified_name, $str19$t, T, NIL, NIL, T );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str21$Monad_Dimension );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      final SubLObject monad_mt_input_name = cb_monad_mt_input_name( input_name );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != edit_allowedP )
        {
          html_complete.html_complete_button( monad_mt_input_name, $str14$Complete, $const15$Microtheory, NIL, NIL, monad_choices, UNPROVIDED );
          html_utilities.html_indent( ONE_INTEGER );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw22$RIGHT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str23$Monad_Mt___ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      final SubLObject mt_string = cb_monad_mt_display_string( monad_mt );
      if( NIL != edit_allowedP )
      {
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) )
          {
            final SubLObject id_num = html_macros.next_html_id( UNPROVIDED );
            final SubLObject autocomplete_id = Sequences.cconcatenate( $str24$autocomplete_, format_nil.format_nil_a_no_copy( id_num ) );
            final SubLObject input_id = Sequences.cconcatenate( $str25$input_, format_nil.format_nil_a_no_copy( id_num ) );
            final SubLObject result_id = Sequences.cconcatenate( $str26$autocomplete_results_, format_nil.format_nil_a_no_copy( id_num ) );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            if( NIL != autocomplete_id )
            {
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( autocomplete_id );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str27$yui_ac );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( monad_mt_input_name );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) )
              {
                html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              if( NIL != input_id )
              {
                html_utilities.html_markup( html_macros.$html_textarea_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( input_id );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_style$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str28$position_static );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str29$yui_ac_input );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( mt_string );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              if( NIL != result_id )
              {
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( result_id );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str30$yui_ac_container );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
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
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_complete.html_print_js_autocomplete_setup_int( input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, $const15$Microtheory );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( monad_mt_input_name );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( mt_string );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
            }
            html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_script_utilities.html_clear_input_button( monad_mt_input_name, $str17$Clear_Mt, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_form( monad_mt, UNPROVIDED, UNPROVIDED );
          html_utilities.html_hidden_input( monad_mt_input_name, mt_string, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 6925L)
  public static SubLObject cb_monad_mt_input_name(final SubLObject input_name)
  {
    assert NIL != Types.stringp( input_name ) : input_name;
    return PrintLow.format( NIL, $str31$_A_monad, Strings.string_downcase( input_name, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 7074L)
  public static SubLObject cb_time_dimension_specified_name(final SubLObject input_name)
  {
    assert NIL != Types.stringp( input_name ) : input_name;
    return PrintLow.format( NIL, $str32$_A_time_dimension_specified, input_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 7253L)
  public static SubLObject cb_mt_input_time_dimension_section(SubLObject time_mt, SubLObject display_options)
  {
    if( time_mt == UNPROVIDED )
    {
      time_mt = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    final SubLObject edit_allowedP_tail = cdestructuring_bind.property_list_member( $kw11$EDIT_ALLOWED_, current );
    final SubLObject edit_allowedP = ( NIL != edit_allowedP_tail ) ? conses_high.cadr( edit_allowedP_tail ) : T;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_mt_input_default_name$.getGlobalValue();
    final SubLObject anytime_psc_allowedP_tail = cdestructuring_bind.property_list_member( $kw33$ANYTIME_PSC_ALLOWED_, current );
    final SubLObject anytime_psc_allowedP = ( NIL != anytime_psc_allowedP_tail ) ? conses_high.cadr( anytime_psc_allowedP_tail ) : T;
    final SubLObject time_interval_input_name = cb_time_interval_input_name( input_name );
    final SubLObject time_parameter_input_name = cb_time_parameter_input_name( input_name );
    final SubLObject anytime_pscP = hlmt.anytime_psc_p( time_mt );
    SubLObject time_interval = NIL;
    SubLObject time_parameter = NIL;
    if( NIL == anytime_pscP )
    {
      thread.resetMultipleValues();
      final SubLObject time_interval_$13 = hlmt.explode_hlmt_temporal_facets_with_defaults( time_mt );
      final SubLObject time_parameter_$14 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      time_interval = time_interval_$13;
      time_parameter = time_parameter_$14;
    }
    final SubLObject time_dimension_specified_name = cb_time_dimension_specified_name( input_name );
    if( NIL == edit_allowedP )
    {
      html_utilities.html_hidden_input( time_dimension_specified_name, $str34$na, UNPROVIDED );
    }
    else if( NIL == anytime_psc_allowedP )
    {
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_checkbox_input( time_dimension_specified_name, $str19$t, T, NIL, NIL, T );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str35$Time_Dimension );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_hidden_input( time_dimension_specified_name, $str34$na, UNPROVIDED );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_checkbox_input( time_dimension_specified_name, $str19$t, makeBoolean( NIL == anytime_pscP ), NIL, NIL, makeBoolean( NIL == anytime_psc_allowedP ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str35$Time_Dimension );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      cb_mt_input_time_interval_section( time_interval, time_interval_input_name, edit_allowedP );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw18$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      cb_mt_input_time_parameter_section( time_parameter, time_parameter_input_name, edit_allowedP );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 9308L)
  public static SubLObject cb_mt_input_time_interval_section(SubLObject time_interval, SubLObject time_interval_input_name, SubLObject edit_allowedP)
  {
    if( time_interval == UNPROVIDED )
    {
      time_interval = NIL;
    }
    if( time_interval_input_name == UNPROVIDED )
    {
      time_interval_input_name = NIL;
    }
    if( edit_allowedP == UNPROVIDED )
    {
      edit_allowedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != edit_allowedP )
      {
        final SubLObject time_interval_choices = $list36;
        html_complete.html_complete_button( time_interval_input_name, $str14$Complete, $const37$TimeInterval, NIL, NIL, time_interval_choices, UNPROVIDED );
        html_utilities.html_indent( ONE_INTEGER );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw22$RIGHT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL == edit_allowedP )
      {
        html_utilities.html_princ_strong( $str38$Time_ );
      }
      html_utilities.html_princ_strong( $str39$Interval___ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    final SubLObject interval_string = cb_utilities.cb_time_interval_display_string( time_interval );
    if( NIL != edit_allowedP )
    {
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject time_interval_input_rows = FOUR_INTEGER;
        if( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) )
        {
          final SubLObject id_num = html_macros.next_html_id( UNPROVIDED );
          final SubLObject autocomplete_id = Sequences.cconcatenate( $str24$autocomplete_, format_nil.format_nil_a_no_copy( id_num ) );
          final SubLObject input_id = Sequences.cconcatenate( $str25$input_, format_nil.format_nil_a_no_copy( id_num ) );
          final SubLObject result_id = Sequences.cconcatenate( $str26$autocomplete_results_, format_nil.format_nil_a_no_copy( id_num ) );
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          if( NIL != autocomplete_id )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( autocomplete_id );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str27$yui_ac );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( time_interval_input_name );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != input_id )
            {
              html_utilities.html_markup( html_macros.$html_textarea_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( input_id );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != time_interval_input_rows )
            {
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( time_interval_input_rows );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_textarea_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str28$position_static );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str29$yui_ac_input );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( interval_string );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
            }
            html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            if( NIL != result_id )
            {
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( result_id );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str30$yui_ac_container );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          html_complete.html_print_js_autocomplete_setup_int( input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, $const37$TimeInterval );
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( time_interval_input_name );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != time_interval_input_rows )
          {
            html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( time_interval_input_rows );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( interval_string );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
          }
          html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_script_utilities.html_clear_input_button( time_interval_input_name, $str40$Clear_Interval, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_form( time_interval, UNPROVIDED, UNPROVIDED );
        html_utilities.html_hidden_input( time_interval_input_name, interval_string, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 10644L)
  public static SubLObject cb_time_interval_input_name(final SubLObject input_name)
  {
    assert NIL != Types.stringp( input_name ) : input_name;
    return PrintLow.format( NIL, $str41$_A_time_interval, Strings.string_downcase( input_name, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 10806L)
  public static SubLObject cb_mt_input_time_parameter_section(SubLObject time_parameter, SubLObject time_parameter_input_name, SubLObject edit_allowedP)
  {
    if( time_parameter == UNPROVIDED )
    {
      time_parameter = NIL;
    }
    if( time_parameter_input_name == UNPROVIDED )
    {
      time_parameter_input_name = NIL;
    }
    if( edit_allowedP == UNPROVIDED )
    {
      edit_allowedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != edit_allowedP )
      {
        final SubLObject time_parameter_choices = $list42;
        html_complete.html_complete_button( time_parameter_input_name, $str14$Complete, $const43$TimeParameter, NIL, NIL, time_parameter_choices, UNPROVIDED );
        html_utilities.html_indent( ONE_INTEGER );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw22$RIGHT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL == edit_allowedP )
      {
        html_utilities.html_princ_strong( $str38$Time_ );
      }
      html_utilities.html_princ_strong( $str44$Parameter___ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    final SubLObject parameter_string = cb_utilities.cb_time_parameter_display_string( time_parameter );
    if( NIL != edit_allowedP )
    {
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) )
        {
          final SubLObject id_num = html_macros.next_html_id( UNPROVIDED );
          final SubLObject autocomplete_id = Sequences.cconcatenate( $str24$autocomplete_, format_nil.format_nil_a_no_copy( id_num ) );
          final SubLObject input_id = Sequences.cconcatenate( $str25$input_, format_nil.format_nil_a_no_copy( id_num ) );
          final SubLObject result_id = Sequences.cconcatenate( $str26$autocomplete_results_, format_nil.format_nil_a_no_copy( id_num ) );
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          if( NIL != autocomplete_id )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( autocomplete_id );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str27$yui_ac );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( time_parameter_input_name );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != input_id )
            {
              html_utilities.html_markup( html_macros.$html_textarea_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( input_id );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_textarea_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str28$position_static );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str29$yui_ac_input );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( parameter_string );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
            }
            html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            if( NIL != result_id )
            {
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( result_id );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str30$yui_ac_container );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          html_complete.html_print_js_autocomplete_setup_int( input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, $const43$TimeParameter );
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( time_parameter_input_name );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( cb_parameters.$cb_hlmt_input_width$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ONE_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( parameter_string );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
          }
          html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_script_utilities.html_clear_input_button( time_parameter_input_name, $str45$Clear_Parameter, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw20$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_form( time_parameter, UNPROVIDED, UNPROVIDED );
        html_utilities.html_hidden_input( time_parameter_input_name, parameter_string, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 11987L)
  public static SubLObject cb_time_parameter_input_name(final SubLObject input_name)
  {
    assert NIL != Types.stringp( input_name ) : input_name;
    return PrintLow.format( NIL, $str46$_A_time_parameter, Strings.string_downcase( input_name, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 12151L)
  public static SubLObject cb_extract_mt_input(final SubLObject args, SubLObject default_mt, SubLObject input_options)
  {
    if( default_mt == UNPROVIDED )
    {
      default_mt = NIL;
    }
    if( input_options == UNPROVIDED )
    {
      input_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = input_options;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_mt_input_default_name$.getGlobalValue();
    final SubLObject allow_variableP_tail = cdestructuring_bind.property_list_member( $kw47$ALLOW_VARIABLE_, current );
    final SubLObject allow_variableP = ( NIL != allow_variableP_tail ) ? conses_high.cadr( allow_variableP_tail ) : NIL;
    final SubLObject default_monad_mt = hlmt.hlmt_monad_mt_without_default( default_mt );
    SubLObject default_time_interval = NIL;
    SubLObject default_time_parameter = NIL;
    thread.resetMultipleValues();
    final SubLObject default_time_interval_$29 = hlmt.explode_hlmt_temporal_facets( default_mt, NIL, NIL );
    final SubLObject default_time_parameter_$30 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    default_time_interval = default_time_interval_$29;
    default_time_parameter = default_time_parameter_$30;
    SubLObject monad_mt = $kw48$UNINITIALIZED;
    SubLObject time_mt = $kw48$UNINITIALIZED;
    SubLObject mt_error = $kw48$UNINITIALIZED;
    final SubLObject monad_mt_input_name = cb_monad_mt_input_name( input_name );
    final SubLObject monad_mt_string = html_utilities.html_extract_input( monad_mt_input_name, args );
    if( NIL != monad_mt_string )
    {
      thread.resetMultipleValues();
      final SubLObject monad_mt_$31 = cb_determine_monad_mt( monad_mt_string, default_monad_mt, allow_variableP );
      final SubLObject mt_error_$32 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      monad_mt = monad_mt_$31;
      mt_error = mt_error_$32;
    }
    else
    {
      mt_error = new_wholly_unspecified_mt_error();
    }
    if( NIL != mt_error )
    {
      return Values.values( NIL, mt_error, monad_mt_string );
    }
    if( NIL == hlmt.hlmts_supportedP() )
    {
      return Values.values( monad_mt, NIL, NIL );
    }
    final SubLObject time_dimension_specified_name = cb_time_dimension_specified_name( input_name );
    final SubLObject time_dimension_specifiedP = html_utilities.html_extract_input( time_dimension_specified_name, args );
    if( NIL != time_dimension_specifiedP )
    {
      SubLObject time_interval = $kw48$UNINITIALIZED;
      SubLObject time_parameter = $kw48$UNINITIALIZED;
      final SubLObject time_interval_input_name = cb_time_interval_input_name( input_name );
      final SubLObject time_interval_string = html_utilities.html_extract_input( time_interval_input_name, args );
      thread.resetMultipleValues();
      final SubLObject time_interval_$33 = cb_determine_time_interval( time_interval_string, default_time_interval, allow_variableP );
      final SubLObject mt_error_$33 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      time_interval = time_interval_$33;
      mt_error = mt_error_$33;
      if( NIL != mt_error )
      {
        return Values.values( NIL, mt_error, time_interval_string );
      }
      final SubLObject time_parameter_input_name = cb_time_parameter_input_name( input_name );
      final SubLObject time_parameter_string = html_utilities.html_extract_input( time_parameter_input_name, args );
      thread.resetMultipleValues();
      final SubLObject time_parameter_$35 = cb_determine_time_parameter( time_parameter_string, default_time_parameter, allow_variableP );
      final SubLObject mt_error_$34 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      time_parameter = time_parameter_$35;
      mt_error = mt_error_$34;
      if( NIL != mt_error )
      {
        return Values.values( NIL, mt_error, time_parameter_string );
      }
      time_mt = hlmt.new_time_dimension( time_interval, time_parameter );
    }
    else
    {
      time_mt = hlmt.new_time_dimension( $const49$AnytimePSC, UNPROVIDED );
    }
    if( NIL == monad_mt && NIL == time_mt )
    {
      final SubLObject mt_error_$35 = new_wholly_unspecified_mt_error();
      return Values.values( NIL, mt_error_$35, NIL );
    }
    if( NIL == monad_mt || NIL == time_mt )
    {
      final SubLObject missing_mt_parts = ConsesLow.nconc( ( NIL != monad_mt ) ? NIL : ConsesLow.list( $kw50$MONAD_MT ), ( NIL != time_mt ) ? NIL : ConsesLow.list( $kw51$TIME_MT ) );
      final SubLObject mt_error_$36 = new_incompletely_specified_mt_error( missing_mt_parts );
      return Values.values( NIL, mt_error_$36, NIL );
    }
    final SubLObject v_hlmt = hlmt.new_canonicalized_temporal_hlmt( monad_mt, time_mt );
    return Values.values( v_hlmt, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 15771L)
  public static SubLObject cb_determine_monad_mt(SubLObject input_string, final SubLObject default_monad_mt, final SubLObject allow_variableP)
  {
    assert NIL != Types.stringp( input_string ) : input_string;
    input_string = string_utilities.subst_whitespace( string_utilities.trim_whitespace( input_string ) );
    if( NIL != string_utilities.empty_string_p( input_string ) )
    {
      if( NIL != default_monad_mt )
      {
        return Values.values( default_monad_mt, NIL );
      }
      return Values.values( NIL, NIL );
    }
    else
    {
      final SubLObject monad_mt = cb_utilities.cb_guess_term( input_string, UNPROVIDED );
      if( NIL == monad_mt )
      {
        if( NIL != string_utilities.all_parens_matchedP( input_string, UNPROVIDED, UNPROVIDED ) )
        {
          return Values.values( NIL, new_unintelligible_mt_error( $kw50$MONAD_MT ) );
        }
        return Values.values( NIL, new_unmatched_paren_error( $kw50$MONAD_MT ) );
      }
      else
      {
        if( NIL == cb_assertion_editor.cb_valid_microtheoryP( monad_mt ) && ( NIL == allow_variableP || NIL == collection_defns.el_variableP( monad_mt ) ) )
        {
          return Values.values( NIL, new_semantic_mt_error( $kw50$MONAD_MT ) );
        }
        return Values.values( monad_mt, NIL );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 16560L)
  public static SubLObject cb_determine_time_interval(SubLObject input_string, final SubLObject default_time_interval, final SubLObject allow_variableP)
  {
    assert NIL != Types.stringp( input_string ) : input_string;
    input_string = string_utilities.subst_whitespace( string_utilities.trim_whitespace( input_string ) );
    if( NIL != string_utilities.empty_string_p( input_string ) )
    {
      if( NIL != default_time_interval )
      {
        return Values.values( default_time_interval, NIL );
      }
      return Values.values( NIL, NIL );
    }
    else
    {
      final SubLObject possible_variable = cb_utilities.cb_guess_term( input_string, UNPROVIDED );
      if( NIL != allow_variableP && NIL != collection_defns.el_variableP( possible_variable ) )
      {
        return Values.values( possible_variable, NIL );
      }
      final SubLObject time_interval = cb_utilities.cb_guess_date( input_string );
      if( NIL == time_interval )
      {
        if( NIL != string_utilities.all_parens_matchedP( input_string, UNPROVIDED, UNPROVIDED ) )
        {
          return Values.values( NIL, new_unintelligible_mt_error( $kw52$TIME_INTERVAL ) );
        }
        return Values.values( NIL, new_unmatched_paren_error( $kw52$TIME_INTERVAL ) );
      }
      else
      {
        if( NIL == hlmt.temporal_objectP( time_interval ) )
        {
          return Values.values( NIL, new_semantic_mt_error( $kw52$TIME_INTERVAL ) );
        }
        return Values.values( time_interval, NIL );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 17494L)
  public static SubLObject cb_determine_time_parameter(SubLObject input_string, final SubLObject default_time_parameter, final SubLObject allow_variableP)
  {
    assert NIL != Types.stringp( input_string ) : input_string;
    input_string = string_utilities.subst_whitespace( string_utilities.trim_whitespace( input_string ) );
    if( NIL != string_utilities.empty_string_p( input_string ) )
    {
      if( NIL != default_time_parameter )
      {
        return Values.values( default_time_parameter, NIL );
      }
      return Values.values( NIL, NIL );
    }
    else
    {
      final SubLObject possible_variable = cb_utilities.cb_guess_term( input_string, UNPROVIDED );
      if( NIL != allow_variableP && NIL != collection_defns.el_variableP( possible_variable ) )
      {
        return Values.values( possible_variable, NIL );
      }
      final SubLObject time_parameter = cb_utilities.cb_guess_time_parameter( input_string );
      if( NIL == time_parameter )
      {
        if( NIL != string_utilities.all_parens_matchedP( input_string, UNPROVIDED, UNPROVIDED ) )
        {
          return Values.values( NIL, new_unintelligible_mt_error( $kw53$TIME_PARAMETER ) );
        }
        return Values.values( NIL, new_unmatched_paren_error( $kw53$TIME_PARAMETER ) );
      }
      else
      {
        if( NIL == hlmt.time_parameterP( time_parameter ) )
        {
          return Values.values( NIL, new_semantic_mt_error( $kw53$TIME_PARAMETER ) );
        }
        return Values.values( time_parameter, NIL );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 18443L)
  public static SubLObject mt_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthGE( v_object, TWO_INTEGER, UNPROVIDED ) && $kw54$MT_ERROR == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 18780L)
  public static SubLObject cb_mt_error(final SubLObject mt_error, SubLObject input_string)
  {
    if( input_string == UNPROVIDED )
    {
      input_string = NIL;
    }
    if( NIL == mt_error_p( mt_error ) )
    {
      return cb_utilities.cb_error( $str88$_S____S, mt_error, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject mt_error_keyword = NIL;
    SubLObject error_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( mt_error, mt_error, $list55 );
    mt_error_keyword = mt_error.first();
    SubLObject current = mt_error.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, mt_error, $list55 );
    error_type = current.first();
    current = current.rest();
    final SubLObject part_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, mt_error, $list55 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( mt_error, $list55 );
      return NIL;
    }
    final SubLObject pcase_var = error_type;
    if( pcase_var.eql( $kw56$WHOLLY_UNSPECIFIED ) )
    {
      return cb_utilities.cb_error( $str57$No_microtheory_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $kw58$UNSPECIFIED ) )
    {
      final SubLObject pcase_var_$39 = part_type;
      if( pcase_var_$39.eql( $kw50$MONAD_MT ) )
      {
        if( NIL != hlmt.hlmts_supportedP() )
        {
          return cb_utilities.cb_error( $str59$No_monadic_microtheory_was_specif, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return cb_utilities.cb_error( $str57$No_microtheory_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        if( pcase_var_$39.eql( $kw51$TIME_MT ) )
        {
          return cb_utilities.cb_error( $str60$No_microtheory_time_dimension_was, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( pcase_var_$39.eql( $kw52$TIME_INTERVAL ) )
        {
          return cb_utilities.cb_error( $str61$No_microtheory_time_interval_was_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( pcase_var_$39.eql( $kw53$TIME_PARAMETER ) )
        {
          return cb_utilities.cb_error( $str62$No_microtheory_time_parameter_was, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return cb_utilities.cb_error( $str63$The_MT_part__A_was_not_specified_, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( pcase_var.eql( $kw64$UNINTELLIGIBLE ) )
    {
      final SubLObject pcase_var_$40 = part_type;
      if( pcase_var_$40.eql( $kw50$MONAD_MT ) )
      {
        return cb_utilities.cb_error( $str65$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var_$40.eql( $kw51$TIME_MT ) )
      {
        return cb_utilities.cb_error( $str66$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var_$40.eql( $kw52$TIME_INTERVAL ) )
      {
        return cb_utilities.cb_error( $str67$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var_$40.eql( $kw53$TIME_PARAMETER ) )
      {
        return cb_utilities.cb_error( $str68$The_string__S_did_not_make_sense_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return cb_utilities.cb_error( $str69$The_string__S_did_not_make_sense_, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( pcase_var.eql( $kw70$UNMATCHED_PAREN ) )
    {
      final SubLObject pcase_var_$41 = part_type;
      if( pcase_var_$41.eql( $kw50$MONAD_MT ) )
      {
        return cb_utilities.cb_error( $str71$Unmatched_Parentheses_in_microthe, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var_$41.eql( $kw51$TIME_MT ) )
      {
        return cb_utilities.cb_error( $str72$Unmatched_Parentheses_in_microthe, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var_$41.eql( $kw52$TIME_INTERVAL ) )
      {
        return cb_utilities.cb_error( $str73$Unmatched_Parentheses_in_time_int, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var_$41.eql( $kw53$TIME_PARAMETER ) )
      {
        return cb_utilities.cb_error( $str74$Unmatched_Parentheses_in_time_par, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return cb_utilities.cb_error( $str75$Unmatched_Parentheses_in_mt_part_, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      if( pcase_var.eql( $kw76$INCOMPLETELY_SPECIFIED ) )
      {
        final SubLObject missing_parts = part_type;
        return cb_utilities.cb_error( $str77$MT_parts__S_were_unspecified_, missing_parts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( !pcase_var.eql( $kw78$SEMANTIC ) )
      {
        return cb_utilities.cb_error( $str87$MT_ERROR__S____S__S__S, error_type, part_type, input_string, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject pcase_var_$42 = part_type;
      if( pcase_var_$42.eql( $kw50$MONAD_MT ) )
      {
        if( NIL != hlmt.hlmts_supportedP() )
        {
          return cb_utilities.cb_error( $str79$_S_did_not_specify_a_monadic_micr, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return cb_utilities.cb_error( $str80$_S_did_not_specify_a_microtheory_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        if( pcase_var_$42.eql( $kw51$TIME_MT ) )
        {
          return cb_utilities.cb_error( $str81$_S_did_not_specify_a_microtheory_, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( pcase_var_$42.eql( $kw82$NON_TIME_INTERVAL ) )
        {
          return cb_utilities.cb_error( $str83$_S_did_not_specify_a_time_interva, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( pcase_var_$42.eql( $kw84$NON_TIME_PARAMETER ) )
        {
          return cb_utilities.cb_error( $str85$_S_did_not_specify_a_time_paramet, input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return cb_utilities.cb_error( $str86$_S_did_not_specify_a_term_suitabl, input_string, part_type, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 21971L)
  public static SubLObject new_wholly_unspecified_mt_error()
  {
    return ConsesLow.list( $kw54$MT_ERROR, $kw56$WHOLLY_UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 22083L)
  public static SubLObject wholly_unspecified_mt_error_p(final SubLObject mt_error)
  {
    return makeBoolean( NIL != mt_error_p( mt_error ) && $kw56$WHOLLY_UNSPECIFIED == conses_high.second( mt_error ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 22227L)
  public static SubLObject new_unintelligible_mt_error(final SubLObject mt_part)
  {
    return ConsesLow.list( $kw54$MT_ERROR, $kw64$UNINTELLIGIBLE, mt_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 22332L)
  public static SubLObject new_unmatched_paren_error(final SubLObject mt_part)
  {
    return ConsesLow.list( $kw54$MT_ERROR, $kw70$UNMATCHED_PAREN, mt_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 22436L)
  public static SubLObject new_semantic_mt_error(final SubLObject mt_part)
  {
    return ConsesLow.list( $kw54$MT_ERROR, $kw78$SEMANTIC, mt_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 22529L)
  public static SubLObject new_incompletely_specified_mt_error(SubLObject missing_mt_parts)
  {
    if( missing_mt_parts == UNPROVIDED )
    {
      missing_mt_parts = NIL;
    }
    if( NIL != list_utilities.singletonP( missing_mt_parts ) )
    {
      return ConsesLow.list( $kw54$MT_ERROR, $kw58$UNSPECIFIED, missing_mt_parts.first() );
    }
    return ConsesLow.list( $kw54$MT_ERROR, $kw76$INCOMPLETELY_SPECIFIED, missing_mt_parts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 23175L)
  public static SubLObject use_js_el_sentence_editorP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return cb_parameters.$cb_js_sentence_editor_enabled$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 23262L)
  public static SubLObject cb_el_sentence_input_section(SubLObject sentence, SubLObject display_options)
  {
    if( sentence == UNPROVIDED )
    {
      sentence = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    return cb_el_formula_input_section_html( sentence, display_options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 23413L)
  public static SubLObject cb_el_formula_input_section(SubLObject formula, SubLObject display_options)
  {
    if( formula == UNPROVIDED )
    {
      formula = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    return cb_el_formula_input_section_html( formula, display_options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 23561L)
  public static SubLObject cb_el_formula_input_section_html(SubLObject sentence, SubLObject display_options)
  {
    if( sentence == UNPROVIDED )
    {
      sentence = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$43 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      current_$43 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      if( NIL == conses_high.member( current_$43, $list91, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$43 == $kw92$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
    }
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_el_formula_input_default_name$.getGlobalValue();
    final SubLObject complete_label_tail = cdestructuring_bind.property_list_member( $kw93$COMPLETE_LABEL, current );
    final SubLObject complete_label = ( NIL != complete_label_tail ) ? conses_high.cadr( complete_label_tail ) : $str14$Complete;
    final SubLObject choices_tail = cdestructuring_bind.property_list_member( $kw94$CHOICES, current );
    final SubLObject choices = ( NIL != choices_tail ) ? conses_high.cadr( choices_tail ) : NIL;
    final SubLObject pretty_name_tail = cdestructuring_bind.property_list_member( $kw95$PRETTY_NAME, current );
    final SubLObject pretty_name = ( NIL != pretty_name_tail ) ? conses_high.cadr( pretty_name_tail ) : $str96$EL_Sentence;
    final SubLObject clear_label_tail = cdestructuring_bind.property_list_member( $kw97$CLEAR_LABEL, current );
    final SubLObject clear_label = ( NIL != clear_label_tail ) ? conses_high.cadr( clear_label_tail ) : $str98$Clear_Sentence;
    final SubLObject cyclify_label_tail = cdestructuring_bind.property_list_member( $kw99$CYCLIFY_LABEL, current );
    final SubLObject cyclify_label = ( NIL != cyclify_label_tail ) ? conses_high.cadr( cyclify_label_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw100$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : $int101$80;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw102$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : TWENTY_INTEGER;
    final SubLObject mode_tail = cdestructuring_bind.property_list_member( $kw103$MODE, current );
    final SubLObject mode = ( NIL != mode_tail ) ? conses_high.cadr( mode_tail ) : $kw104$ASSERT;
    assert NIL != Types.stringp( input_name ) : input_name;
    assert NIL != subl_promotions.positive_integer_p( width ) : width;
    assert NIL != subl_promotions.positive_integer_p( height ) : height;
    if( NIL != complete_label && !assertionsDisabledInClass && NIL == Types.stringp( complete_label ) )
    {
      throw new AssertionError( complete_label );
    }
    final SubLObject list_var = choices;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != constant_handles.constant_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL != pretty_name && !assertionsDisabledInClass && NIL == Types.stringp( pretty_name ) )
    {
      throw new AssertionError( pretty_name );
    }
    if( NIL != cyclify_label && !assertionsDisabledInClass && NIL == Types.stringp( cyclify_label ) )
    {
      throw new AssertionError( cyclify_label );
    }
    if( NIL != clear_label && !assertionsDisabledInClass && NIL == Types.stringp( clear_label ) )
    {
      throw new AssertionError( clear_label );
    }
    if( NIL != mode && !assertionsDisabledInClass && NIL == Types.keywordp( mode ) )
    {
      throw new AssertionError( mode );
    }
    if( NIL != complete_label || NIL != pretty_name || NIL != cyclify_label || NIL != clear_label )
    {
      if( NIL != complete_label )
      {
        html_complete.html_complete_button( input_name, complete_label, NIL, NIL, NIL, choices, $legacy_sentence_editor_class$.getGlobalValue() );
        html_utilities.html_indent( ONE_INTEGER );
      }
      if( NIL != pretty_name )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( pretty_name );
        html_utilities.html_princ( $str109$__ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      if( NIL != cyclify_label && NIL != cb_parameters.$cb_show_cyclify_button$.getDynamicValue( thread ) )
      {
        html_utilities.html_indent( ONE_INTEGER );
        html_complete.html_cyclify_button( input_name, cyclify_label, $legacy_sentence_editor_class$.getGlobalValue() );
      }
      if( NIL != clear_label )
      {
        html_utilities.html_indent( FOUR_INTEGER );
        html_script_utilities.html_clear_input_button( input_name, clear_label, $legacy_sentence_editor_class$.getGlobalValue() );
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( input_name );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != width )
    {
      html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( width );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != input_name )
    {
      html_utilities.html_markup( html_macros.$html_textarea_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( input_name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != height )
    {
      html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( height );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != $sentence_editor_textarea_class$.getGlobalValue() )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $sentence_editor_textarea_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != sentence )
      {
        cb_format_sentence_editor_sentence( sentence, mode );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
    html_script_utilities.html_sentence_editor_enable_editors();
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 26079L)
  public static SubLObject cb_format_sentence_editor_sentence(final SubLObject sentence, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( sentence.isString() )
    {
      html_utilities.html_princ( sentence );
    }
    else
    {
      format_cycl_expression.format_cycl_expression( cycl_utilities.expression_transform( sentence, $sym111$UNICODE_NAUT_P, $sym112$CYCL_STRING_TO_UTF8_STRING, UNPROVIDED, UNPROVIDED ), html_macros.$html_stream$
          .getDynamicValue( thread ), ZERO_INTEGER );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 26821L)
  public static SubLObject cb_sentence_editor_start(final SubLObject input_name, final SubLObject width, SubLObject mode, SubLObject id)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw104$ASSERT;
    }
    if( id == UNPROVIDED )
    {
      id = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != use_js_el_sentence_editorP() )
    {
      if( NIL != $cb_use_codemirror_sentence_editorP$.getDynamicValue( thread ) )
      {
        cb_sentence_editor_start_codemirror( input_name, width, mode, id );
      }
      else
      {
        cb_sentence_editor_start_1( input_name, width, mode, id );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 27154L)
  public static SubLObject cb_sentence_editor_start_1(final SubLObject input_name, final SubLObject width, SubLObject mode, SubLObject id)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw104$ASSERT;
    }
    if( id == UNPROVIDED )
    {
      id = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject strict_wff_checking = ( mode == $kw110$QUERY ) ? $str113$false : $str114$true;
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str115$_script_Event_onDOMReady_function, new SubLObject[] { input_name, width, id, strict_wff_checking
    } );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 27712L)
  public static SubLObject cb_sentence_editor_start_codemirror(final SubLObject input_name, final SubLObject width, SubLObject mode, SubLObject id)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw104$ASSERT;
    }
    if( id == UNPROVIDED )
    {
      id = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyc_file_dependencies.javascript( $kw117$HTML_EDITOR_SCRIPTS );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str118$javascript );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $codemirror_editor_start_script$.getDynamicValue( thread ), input_name );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 28018L)
  public static SubLObject cb_extract_el_sentence_input(final SubLObject args, SubLObject input_options)
  {
    if( input_options == UNPROVIDED )
    {
      input_options = NIL;
    }
    return cb_extract_el_formula_input( args, conses_high.putf( list_utilities.merge_plist( ConsesLow.list( $kw12$INPUT_NAME, $str89$sentence ), input_options ), $kw119$REQUIRE_SENTENCE_, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 28343L)
  public static SubLObject cb_extract_el_formula_input(final SubLObject args, SubLObject input_options)
  {
    if( input_options == UNPROVIDED )
    {
      input_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = input_options;
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$44 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list120 );
      current_$44 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list120 );
      if( NIL == conses_high.member( current_$44, $list121, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$44 == $kw92$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
    }
    final SubLObject requiredP_tail = cdestructuring_bind.property_list_member( $kw122$REQUIRED_, current );
    final SubLObject requiredP = ( NIL != requiredP_tail ) ? conses_high.cadr( requiredP_tail ) : T;
    final SubLObject require_sentenceP_tail = cdestructuring_bind.property_list_member( $kw119$REQUIRE_SENTENCE_, current );
    final SubLObject require_sentenceP = ( NIL != require_sentenceP_tail ) ? conses_high.cadr( require_sentenceP_tail ) : NIL;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_el_formula_input_default_name$.getGlobalValue();
    final SubLObject auto_cyclify_tail = cdestructuring_bind.property_list_member( $kw123$AUTO_CYCLIFY, current );
    final SubLObject auto_cyclify = ( NIL != auto_cyclify_tail ) ? conses_high.cadr( auto_cyclify_tail ) : T;
    SubLObject formula_string = html_utilities.html_extract_input( input_name, args );
    if( NIL == formula_string )
    {
      final SubLObject el_formula_error = ( NIL != requiredP ) ? new_el_formula_error( $kw58$UNSPECIFIED ) : NIL;
      return Values.values( NIL, el_formula_error, NIL );
    }
    if( NIL != auto_cyclify )
    {
      formula_string = string_utilities.cyclify_string( formula_string );
    }
    thread.resetMultipleValues();
    final SubLObject formula = cb_determine_el_formula( cb_normalize_formula_string( formula_string ), requiredP, require_sentenceP );
    final SubLObject el_formula_error2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != el_formula_error2 )
    {
      return Values.values( NIL, el_formula_error2, formula_string );
    }
    return Values.values( formula, NIL, formula_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 30164L)
  public static SubLObject cb_extract_query_formula_from_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != Types.stringp( string ) : string;
    final SubLObject formula = reader.read_from_string_ignoring_errors( string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      cb_utilities.cb_error( $str126$Bad_formula__probably_due_to_a_mi, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    if( NIL != mt && NIL == wff.wff_queryP( formula, mt, UNPROVIDED ) )
    {
      cb_assertion_editor.cb_explain_why_not_wff( formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 30898L)
  public static SubLObject cb_determine_el_sentence(final SubLObject formula_string, final SubLObject requiredP)
  {
    return cb_determine_el_formula( formula_string, requiredP, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 31045L)
  public static SubLObject cb_determine_el_formula(SubLObject formula_string, final SubLObject requiredP, SubLObject require_sentenceP)
  {
    if( require_sentenceP == UNPROVIDED )
    {
      require_sentenceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( formula_string ) : formula_string;
    formula_string = string_utilities.trim_whitespace( formula_string );
    if( NIL != string_utilities.empty_string_p( formula_string ) )
    {
      final SubLObject el_formula_error = ( NIL != requiredP ) ? new_el_formula_error( $kw58$UNSPECIFIED ) : NIL;
      return Values.values( NIL, el_formula_error );
    }
    if( NIL != cb_invalid_constant_names_in_stringP( formula_string ) )
    {
      return Values.values( NIL, new_el_formula_error( $kw127$INVALID_CONSTANTS ) );
    }
    thread.resetMultipleValues();
    SubLObject formula = reader.read_from_string_ignoring_errors( formula_string, NIL, $kw128$EOF, UNPROVIDED, UNPROVIDED );
    final SubLObject end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    formula = cb_convert_strings_to_cycl( formula );
    if( $kw128$EOF == formula )
    {
      if( NIL == string_utilities.all_parens_matchedP( formula_string, UNPROVIDED, UNPROVIDED ) )
      {
        return Values.values( NIL, new_el_formula_error( $kw129$UNMATCHED_PARENTHESES ) );
      }
      return Values.values( NIL, new_el_formula_error( $kw128$EOF ) );
    }
    else
    {
      if( $kw130$ERROR == end )
      {
        return Values.values( NIL, new_el_formula_error( $kw131$READ_ERROR ) );
      }
      if( NIL != cycl_utilities.expression_gather( formula, $sym132$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return Values.values( NIL, new_el_formula_error( $kw133$SYMBOLS_FOR_INVALID_CONSTANTS ) );
      }
      if( NIL != require_sentenceP && NIL == el_grammar.el_sentence_p( formula ) )
      {
        return Values.values( NIL, new_el_formula_error( $kw134$NON_SENTENCE ) );
      }
      return Values.values( formula, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 32825L)
  public static SubLObject cb_convert_strings_to_cycl(SubLObject sexp)
  {
    if( sexp.isSymbol() )
    {
      return sexp;
    }
    SubLObject arg_positions = cycl_utilities.arg_positions_if_dfs( $sym135$CYCL_STRING_P, sexp, UNPROVIDED );
    SubLObject strings = NIL;
    if( NIL != cycl_string.cycl_string_p( sexp ) )
    {
      arg_positions = ConsesLow.cons( NIL, arg_positions );
    }
    SubLObject cdolist_list_var = arg_positions;
    SubLObject arg_position = NIL;
    arg_position = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( conses_high.butlast( arg_position, UNPROVIDED ), arg_positions, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == unicode_nauts.unicode_naut_p( cycl_utilities
          .formula_arg_position( sexp, conses_high.butlast( arg_position, UNPROVIDED ), UNPROVIDED ), UNPROVIDED ) )
      {
        strings = ConsesLow.cons( cycl_utilities.formula_arg_position( sexp, arg_position, UNPROVIDED ), strings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_position = cdolist_list_var.first();
    }
    cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject replacement = ( NIL != unicode_nauts.unicode_naut_p( string, UNPROVIDED ) ) ? cycl_string.canonicalize_cycl_string( string ) : cycl_string.convert_string_to_cycl( string );
      if( !replacement.equal( string ) )
      {
        sexp = cycl_utilities.expression_subst( replacement, string, sexp, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return sexp;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 33923L)
  public static SubLObject cb_invalid_constant_names_in_string(final SubLObject string)
  {
    final SubLObject sub_strings = string_utilities.string_tokenize( string, $list136, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject quoted_startP = NIL;
    SubLObject invalid_constants = NIL;
    SubLObject cdolist_list_var = sub_strings;
    SubLObject sub_string = NIL;
    sub_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != quoted_startP )
      {
        if( sub_string.equal( $str137$_ ) )
        {
          quoted_startP = NIL;
        }
      }
      else if( sub_string.equal( $str137$_ ) )
      {
        quoted_startP = T;
      }
      else
      {
        invalid_constants = ConsesLow.append( invalid_constants, string_utilities.invalid_constant_names_in_string( sub_string, T ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_string = cdolist_list_var.first();
    }
    return invalid_constants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 34693L)
  public static SubLObject utf8_nbsp()
  {
    if( $utf8_nbsp$.getGlobalValue() == $kw48$UNINITIALIZED )
    {
      final SubLObject init_value = unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( $ic138, UNPROVIDED, UNPROVIDED ) );
      if( init_value == $kw48$UNINITIALIZED )
      {
        Errors.error( $str139$Unable_to_initialize__A__, $utf8_nbsp$.getGlobalValue() );
      }
      $utf8_nbsp$.setGlobalValue( init_value );
    }
    return $utf8_nbsp$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 34884L)
  public static SubLObject return_string()
  {
    if( $return_string$.getGlobalValue() == $kw48$UNINITIALIZED )
    {
      final SubLObject init_value = Strings.make_string( ONE_INTEGER, Characters.CHAR_return );
      if( init_value == $kw48$UNINITIALIZED )
      {
        Errors.error( $str139$Unable_to_initialize__A__, $return_string$.getGlobalValue() );
      }
      $return_string$.setGlobalValue( init_value );
    }
    return $return_string$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 34978L)
  public static SubLObject cb_normalize_formula_string(final SubLObject formula_string)
  {
    SubLObject result = string_utilities.string_substitute( $str7$, return_string(), formula_string, UNPROVIDED );
    result = string_utilities.string_substitute( $str140$_, utf8_nbsp(), result, UNPROVIDED );
    result = string_utilities.normalize_spaces( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 35267L)
  public static SubLObject cb_invalid_constant_names_in_stringP(final SubLObject string)
  {
    return list_utilities.sublisp_boolean( cb_invalid_constant_names_in_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 35394L)
  public static SubLObject el_sentence_error_p(final SubLObject v_object)
  {
    return el_formula_error_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 35727L)
  public static SubLObject el_formula_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != conses_high.member( v_object.first(), $list141, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 36061L)
  public static SubLObject cb_el_sentence_error(final SubLObject el_formula_error, SubLObject formula_string, SubLObject error_options)
  {
    if( formula_string == UNPROVIDED )
    {
      formula_string = NIL;
    }
    if( error_options == UNPROVIDED )
    {
      error_options = NIL;
    }
    return cb_el_formula_error( el_formula_error, formula_string, error_options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 36233L)
  public static SubLObject cb_el_formula_error(final SubLObject el_formula_error, SubLObject formula_string, SubLObject error_options)
  {
    if( formula_string == UNPROVIDED )
    {
      formula_string = NIL;
    }
    if( error_options == UNPROVIDED )
    {
      error_options = NIL;
    }
    assert NIL != el_formula_error_p( el_formula_error ) : el_formula_error;
    if( NIL != formula_string && !assertionsDisabledInClass && NIL == Types.stringp( formula_string ) )
    {
      throw new AssertionError( formula_string );
    }
    final SubLObject current;
    final SubLObject datum = current = error_options;
    final SubLObject location_tail = cdestructuring_bind.property_list_member( $kw143$LOCATION, current );
    final SubLObject location = ( NIL != location_tail ) ? conses_high.cadr( location_tail ) : NIL;
    if( NIL != location && !assertionsDisabledInClass && NIL == Types.stringp( location ) )
    {
      throw new AssertionError( location );
    }
    SubLObject el_formula_error_keyword = NIL;
    SubLObject error_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( el_formula_error, el_formula_error, $list144 );
    el_formula_error_keyword = el_formula_error.first();
    SubLObject current_$46 = el_formula_error.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current_$46, el_formula_error, $list144 );
    error_type = current_$46.first();
    current_$46 = current_$46.rest();
    if( NIL == current_$46 )
    {
      final SubLObject pcase_var = error_type;
      if( pcase_var.eql( $kw58$UNSPECIFIED ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str145$No_sentence_was_specified_in_, new SubLObject[] { location, $str146$_
          } );
        }
        else
        {
          error_string = $str147$No_sentence_was_specified_;
        }
        cb_utilities.cb_error( $str148$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw127$INVALID_CONSTANTS ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str149$Invalid_Constant_References_in_, location );
        }
        else
        {
          error_string = $str150$Invalid_Constant_References;
        }
        cb_show_formula_error_page( error_string, $sym151$CB_SHOW_INVALID_CONSTANTS, formula_string );
      }
      else if( pcase_var.eql( $kw129$UNMATCHED_PARENTHESES ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str152$Unmatched_Parentheses_in_, location );
        }
        else
        {
          error_string = $str153$Unmatched_Parentheses;
        }
        cb_show_formula_error_page( error_string, $sym154$CB_SHOW_UNMATCHED_PARENTHESES, formula_string );
      }
      else if( pcase_var.eql( $kw128$EOF ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str155$Unfinished_Formula_in_, location );
        }
        else
        {
          error_string = $str156$Unfinished_Formula;
        }
        cb_show_formula_error_page( error_string, $sym157$CB_SHOW_EOF_EXPLANATION, formula_string );
      }
      else if( pcase_var.eql( $kw131$READ_ERROR ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str158$Unreadable_Formula_in_, location );
        }
        else
        {
          error_string = $str159$Unreadable_Formula;
        }
        cb_show_formula_error_page( error_string, $sym160$CB_SHOW_READER_ERROR_EXPLANATION, formula_string );
      }
      else if( pcase_var.eql( $kw133$SYMBOLS_FOR_INVALID_CONSTANTS ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str149$Invalid_Constant_References_in_, location );
        }
        else
        {
          error_string = $str150$Invalid_Constant_References;
        }
        cb_show_formula_error_page( error_string, $sym161$CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS, formula_string );
      }
      else if( pcase_var.eql( $kw134$NON_SENTENCE ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str162$Not_a_Sentence_in_, location );
        }
        else
        {
          error_string = $str163$Not_a_Sentence;
        }
        cb_show_formula_error_page( error_string, $sym164$CB_SHOW_NON_SENTENCE_EXPLANATION, formula_string );
      }
      else
      {
        cb_utilities.cb_error( $str148$_A, error_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( el_formula_error, $list144 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 39053L)
  public static SubLObject new_el_formula_error(final SubLObject error_type)
  {
    return ConsesLow.list( $kw165$EL_FORMULA_ERROR, error_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 39165L)
  public static SubLObject cb_show_formula_error_page(final SubLObject title_string, final SubLObject error_showing_func, final SubLObject error_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str166$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str167$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw48$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( title_string );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$47 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( title_string );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          Functions.funcall( error_showing_func, error_string );
          cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$47, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 39768L)
  public static SubLObject cb_el_term_input_section(SubLObject v_term, SubLObject display_options)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_el_term_input_default_name$.getGlobalValue();
    final SubLObject complete_label_tail = cdestructuring_bind.property_list_member( $kw93$COMPLETE_LABEL, current );
    final SubLObject complete_label = ( NIL != complete_label_tail ) ? conses_high.cadr( complete_label_tail ) : $str14$Complete;
    final SubLObject pretty_name_tail = cdestructuring_bind.property_list_member( $kw95$PRETTY_NAME, current );
    final SubLObject pretty_name = ( NIL != pretty_name_tail ) ? conses_high.cadr( pretty_name_tail ) : NIL;
    final SubLObject clear_label_tail = cdestructuring_bind.property_list_member( $kw97$CLEAR_LABEL, current );
    final SubLObject clear_label = ( NIL != clear_label_tail ) ? conses_high.cadr( clear_label_tail ) : $str169$Clear_Term;
    final SubLObject cyclify_label_tail = cdestructuring_bind.property_list_member( $kw99$CYCLIFY_LABEL, current );
    final SubLObject cyclify_label = ( NIL != cyclify_label_tail ) ? conses_high.cadr( cyclify_label_tail ) : NIL;
    assert NIL != Types.stringp( input_name ) : input_name;
    if( NIL != complete_label && !assertionsDisabledInClass && NIL == Types.stringp( complete_label ) )
    {
      throw new AssertionError( complete_label );
    }
    if( NIL != pretty_name && !assertionsDisabledInClass && NIL == Types.stringp( pretty_name ) )
    {
      throw new AssertionError( pretty_name );
    }
    if( NIL != cyclify_label && !assertionsDisabledInClass && NIL == Types.stringp( cyclify_label ) )
    {
      throw new AssertionError( cyclify_label );
    }
    if( NIL != clear_label && !assertionsDisabledInClass && NIL == Types.stringp( clear_label ) )
    {
      throw new AssertionError( clear_label );
    }
    if( NIL == complete_label && NIL == pretty_name && NIL == cyclify_label && NIL == clear_label )
    {
      return cb_el_term_input_section_internal( v_term, display_options );
    }
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( ( NIL != cyclify_label && NIL != cb_parameters.$cb_show_cyclify_button$.getDynamicValue( thread ) ) || NIL != clear_label )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != cyclify_label && NIL != cb_parameters.$cb_show_cyclify_button$.getDynamicValue( thread ) )
            {
              html_complete.html_cyclify_button( input_name, cyclify_label, UNPROVIDED );
            }
            if( NIL != clear_label )
            {
              html_utilities.html_indent( ONE_INTEGER );
              html_script_utilities.html_clear_input_button( input_name, clear_label, UNPROVIDED );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != pretty_name )
          {
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( pretty_name );
            html_utilities.html_princ( $str109$__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_el_term_input_section_internal( v_term, display_options );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 41845L)
  public static SubLObject cb_el_term_input_section_internal(SubLObject v_term, SubLObject display_options)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = NIL;
    }
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_el_term_input_default_name$.getGlobalValue();
    final SubLObject complete_type_tail = cdestructuring_bind.property_list_member( $kw170$COMPLETE_TYPE, current );
    final SubLObject complete_type = ( NIL != complete_type_tail ) ? conses_high.cadr( complete_type_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw100$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : $int171$300;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw102$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : ONE_INTEGER;
    assert NIL != Types.stringp( input_name ) : input_name;
    assert NIL != subl_promotions.positive_integer_p( width ) : width;
    assert NIL != subl_promotions.positive_integer_p( height ) : height;
    final SubLObject parent_div_id;
    final SubLObject html_id_suffix = parent_div_id = string_utilities.to_string( html_macros.next_html_id( UNPROVIDED ) );
    final SubLObject autocomplete_container_id = Sequences.cconcatenate( $str172$completeContainer, html_id_suffix );
    final SubLObject text_area_id = Sequences.cconcatenate( $str173$textArea, html_id_suffix );
    final SubLObject parent_style = Sequences.cconcatenate( $str174$width__, new SubLObject[] { format_nil.format_nil_a_no_copy( width ), $str175$px_
    } );
    final SubLObject input_style = Sequences.cconcatenate( $str174$width__, new SubLObject[] { format_nil.format_nil_a_no_copy( width ), $str176$px__position_static
    } );
    final SubLObject initial_value = ( NIL != v_term ) ? format_cycl_expression.format_cycl_expression_to_string( v_term, ZERO_INTEGER ) : $str7$;
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != parent_div_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( parent_div_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str177$autocomplete );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( parent_style );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( height.numG( ONE_INTEGER ) )
      {
        html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( input_name );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != text_area_id )
        {
          html_utilities.html_markup( html_macros.$html_textarea_id$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( text_area_id );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != height )
        {
          html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( height );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != input_style )
        {
          html_utilities.html_markup( html_macros.$html_textarea_style$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( input_style );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != v_term )
          {
            html_utilities.html_princ( initial_value );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
        }
        html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_input_text$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_input_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( input_style );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != text_area_id )
        {
          html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( text_area_id );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != input_name )
        {
          html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( input_name );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != initial_value )
        {
          html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_princ( initial_value );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
        {
          html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      if( NIL != autocomplete_container_id )
      {
        html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( autocomplete_container_id );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str178$cycAutocompleteContainer );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_complete.html_print_js_autocomplete_setup_int( text_area_id, autocomplete_container_id, TWENTY_INTEGER, TWO_INTEGER, NIL, complete_type );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 43394L)
  public static SubLObject cb_extract_el_term_input(final SubLObject args, SubLObject input_options)
  {
    if( input_options == UNPROVIDED )
    {
      input_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = input_options;
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$56 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list179 );
      current_$56 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list179 );
      if( NIL == conses_high.member( current_$56, $list180, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$56 == $kw92$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list179 );
    }
    final SubLObject requiredP_tail = cdestructuring_bind.property_list_member( $kw122$REQUIRED_, current );
    final SubLObject requiredP = ( NIL != requiredP_tail ) ? conses_high.cadr( requiredP_tail ) : T;
    final SubLObject input_name_tail = cdestructuring_bind.property_list_member( $kw12$INPUT_NAME, current );
    final SubLObject input_name = ( NIL != input_name_tail ) ? conses_high.cadr( input_name_tail ) : $cb_el_term_input_default_name$.getGlobalValue();
    final SubLObject auto_cyclify_tail = cdestructuring_bind.property_list_member( $kw123$AUTO_CYCLIFY, current );
    final SubLObject auto_cyclify = ( NIL != auto_cyclify_tail ) ? conses_high.cadr( auto_cyclify_tail ) : T;
    SubLObject term_string = html_utilities.html_extract_input( input_name, args );
    if( NIL == term_string )
    {
      final SubLObject el_term_error = ( NIL != requiredP ) ? new_el_term_error( $kw58$UNSPECIFIED ) : NIL;
      return Values.values( NIL, el_term_error );
    }
    if( NIL != auto_cyclify )
    {
      term_string = string_utilities.cyclify_string( term_string );
    }
    thread.resetMultipleValues();
    final SubLObject v_term = cb_determine_el_term( cb_normalize_formula_string( term_string ), requiredP );
    final SubLObject el_term_error2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != el_term_error2 )
    {
      return Values.values( NIL, el_term_error2, term_string );
    }
    return Values.values( v_term, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 44818L)
  public static SubLObject cb_determine_el_term(SubLObject term_string, final SubLObject requiredP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( term_string ) : term_string;
    term_string = string_utilities.trim_whitespace( term_string );
    if( NIL != string_utilities.empty_string_p( term_string ) )
    {
      final SubLObject el_term_error = ( NIL != requiredP ) ? new_el_term_error( $kw58$UNSPECIFIED ) : NIL;
      return Values.values( NIL, el_term_error );
    }
    if( NIL != cb_invalid_constant_names_in_stringP( term_string ) )
    {
      return Values.values( NIL, new_el_term_error( $kw127$INVALID_CONSTANTS ) );
    }
    thread.resetMultipleValues();
    final SubLObject v_term = reader.read_from_string_ignoring_errors( term_string, NIL, $kw128$EOF, UNPROVIDED, UNPROVIDED );
    final SubLObject end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( $kw128$EOF == v_term )
    {
      if( NIL == string_utilities.all_parens_matchedP( term_string, UNPROVIDED, UNPROVIDED ) )
      {
        return Values.values( NIL, new_el_term_error( $kw129$UNMATCHED_PARENTHESES ) );
      }
      return Values.values( NIL, new_el_term_error( $kw128$EOF ) );
    }
    else
    {
      if( $kw130$ERROR == end )
      {
        return Values.values( NIL, new_el_term_error( $kw131$READ_ERROR ) );
      }
      if( NIL != cycl_utilities.expression_gather( v_term, $sym132$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return Values.values( NIL, new_el_term_error( $kw133$SYMBOLS_FOR_INVALID_CONSTANTS ) );
      }
      return Values.values( v_term, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 46168L)
  public static SubLObject el_term_error_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && $kw181$EL_TERM_ERROR == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 46553L)
  public static SubLObject cb_el_term_error(final SubLObject el_term_error, SubLObject term_string, SubLObject error_options)
  {
    if( term_string == UNPROVIDED )
    {
      term_string = NIL;
    }
    if( error_options == UNPROVIDED )
    {
      error_options = NIL;
    }
    assert NIL != el_term_error_p( el_term_error ) : el_term_error;
    if( NIL != term_string && !assertionsDisabledInClass && NIL == Types.stringp( term_string ) )
    {
      throw new AssertionError( term_string );
    }
    final SubLObject current;
    final SubLObject datum = current = error_options;
    final SubLObject location_tail = cdestructuring_bind.property_list_member( $kw143$LOCATION, current );
    final SubLObject location = ( NIL != location_tail ) ? conses_high.cadr( location_tail ) : NIL;
    if( NIL != location && !assertionsDisabledInClass && NIL == Types.stringp( location ) )
    {
      throw new AssertionError( location );
    }
    SubLObject el_term_error_keyword = NIL;
    SubLObject error_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( el_term_error, el_term_error, $list183 );
    el_term_error_keyword = el_term_error.first();
    SubLObject current_$58 = el_term_error.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current_$58, el_term_error, $list183 );
    error_type = current_$58.first();
    current_$58 = current_$58.rest();
    if( NIL == current_$58 )
    {
      final SubLObject pcase_var = error_type;
      if( pcase_var.eql( $kw58$UNSPECIFIED ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str184$No_term_was_specified_in_, new SubLObject[] { location, $str146$_
          } );
        }
        else
        {
          error_string = $str185$No_term_was_specified_;
        }
        cb_utilities.cb_error( $str148$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw127$INVALID_CONSTANTS ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str149$Invalid_Constant_References_in_, location );
        }
        else
        {
          error_string = $str150$Invalid_Constant_References;
        }
        cb_show_term_error_page( error_string, $sym151$CB_SHOW_INVALID_CONSTANTS, term_string );
      }
      else if( pcase_var.eql( $kw129$UNMATCHED_PARENTHESES ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str152$Unmatched_Parentheses_in_, location );
        }
        else
        {
          error_string = $str153$Unmatched_Parentheses;
        }
        cb_show_term_error_page( error_string, $sym154$CB_SHOW_UNMATCHED_PARENTHESES, term_string );
      }
      else if( pcase_var.eql( $kw128$EOF ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str186$Unfinished_Term_in_, location );
        }
        else
        {
          error_string = $str187$Unfinished_Term;
        }
        cb_show_term_error_page( error_string, $sym157$CB_SHOW_EOF_EXPLANATION, term_string );
      }
      else if( pcase_var.eql( $kw131$READ_ERROR ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str188$Unreadable_Term_in_, location );
        }
        else
        {
          error_string = $str189$Unreadable_Term;
        }
        cb_show_term_error_page( error_string, $sym160$CB_SHOW_READER_ERROR_EXPLANATION, term_string );
      }
      else if( pcase_var.eql( $kw133$SYMBOLS_FOR_INVALID_CONSTANTS ) )
      {
        SubLObject error_string = NIL;
        if( NIL != location )
        {
          error_string = Sequences.cconcatenate( $str149$Invalid_Constant_References_in_, location );
        }
        else
        {
          error_string = $str150$Invalid_Constant_References;
        }
        cb_show_term_error_page( error_string, $sym161$CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS, term_string );
      }
      else
      {
        cb_utilities.cb_error( $str148$_A, error_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( el_term_error, $list183 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 49012L)
  public static SubLObject new_el_term_error(final SubLObject error_type)
  {
    return ConsesLow.list( $kw181$EL_TERM_ERROR, error_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-form-widgets.lisp", position = 49116L)
  public static SubLObject cb_show_term_error_page(final SubLObject title_string, final SubLObject error_showing_func, final SubLObject error_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str166$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str167$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw48$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( title_string );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$59 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( title_string );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          Functions.funcall( error_showing_func, error_string );
          cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$59, thread );
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

  public static SubLObject declare_cb_form_widgets_file()
  {
    SubLFiles.declareFunction( me, "cb_monad_mt_display_string", "CB-MONAD-MT-DISPLAY-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_mt_input_section", "CB-MT-INPUT-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_monad_dimension_specified_name", "CB-MONAD-DIMENSION-SPECIFIED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mt_input_monad_mt_section", "CB-MT-INPUT-MONAD-MT-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_mt_input_monad_dimension_section", "CB-MT-INPUT-MONAD-DIMENSION-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_monad_mt_input_name", "CB-MONAD-MT-INPUT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_time_dimension_specified_name", "CB-TIME-DIMENSION-SPECIFIED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mt_input_time_dimension_section", "CB-MT-INPUT-TIME-DIMENSION-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_mt_input_time_interval_section", "CB-MT-INPUT-TIME-INTERVAL-SECTION", 0, 3, false );
    SubLFiles.declareFunction( me, "cb_time_interval_input_name", "CB-TIME-INTERVAL-INPUT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mt_input_time_parameter_section", "CB-MT-INPUT-TIME-PARAMETER-SECTION", 0, 3, false );
    SubLFiles.declareFunction( me, "cb_time_parameter_input_name", "CB-TIME-PARAMETER-INPUT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_mt_input", "CB-EXTRACT-MT-INPUT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_determine_monad_mt", "CB-DETERMINE-MONAD-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_determine_time_interval", "CB-DETERMINE-TIME-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_determine_time_parameter", "CB-DETERMINE-TIME-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "mt_error_p", "MT-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mt_error", "CB-MT-ERROR", 1, 1, false );
    SubLFiles.declareFunction( me, "new_wholly_unspecified_mt_error", "NEW-WHOLLY-UNSPECIFIED-MT-ERROR", 0, 0, false );
    SubLFiles.declareFunction( me, "wholly_unspecified_mt_error_p", "WHOLLY-UNSPECIFIED-MT-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_unintelligible_mt_error", "NEW-UNINTELLIGIBLE-MT-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_unmatched_paren_error", "NEW-UNMATCHED-PAREN-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_semantic_mt_error", "NEW-SEMANTIC-MT-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_incompletely_specified_mt_error", "NEW-INCOMPLETELY-SPECIFIED-MT-ERROR", 0, 1, false );
    SubLFiles.declareFunction( me, "use_js_el_sentence_editorP", "USE-JS-EL-SENTENCE-EDITOR?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_el_sentence_input_section", "CB-EL-SENTENCE-INPUT-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_el_formula_input_section", "CB-EL-FORMULA-INPUT-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_el_formula_input_section_html", "CB-EL-FORMULA-INPUT-SECTION-HTML", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_format_sentence_editor_sentence", "CB-FORMAT-SENTENCE-EDITOR-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_sentence_editor_start", "CB-SENTENCE-EDITOR-START", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_sentence_editor_start_1", "CB-SENTENCE-EDITOR-START-1", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_sentence_editor_start_codemirror", "CB-SENTENCE-EDITOR-START-CODEMIRROR", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_extract_el_sentence_input", "CB-EXTRACT-EL-SENTENCE-INPUT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_extract_el_formula_input", "CB-EXTRACT-EL-FORMULA-INPUT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_extract_query_formula_from_string", "CB-EXTRACT-QUERY-FORMULA-FROM-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_determine_el_sentence", "CB-DETERMINE-EL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_determine_el_formula", "CB-DETERMINE-EL-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_convert_strings_to_cycl", "CB-CONVERT-STRINGS-TO-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_invalid_constant_names_in_string", "CB-INVALID-CONSTANT-NAMES-IN-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_nbsp", "UTF8-NBSP", 0, 0, false );
    SubLFiles.declareFunction( me, "return_string", "RETURN-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_normalize_formula_string", "CB-NORMALIZE-FORMULA-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_invalid_constant_names_in_stringP", "CB-INVALID-CONSTANT-NAMES-IN-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_sentence_error_p", "EL-SENTENCE-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_formula_error_p", "EL-FORMULA-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_el_sentence_error", "CB-EL-SENTENCE-ERROR", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_el_formula_error", "CB-EL-FORMULA-ERROR", 1, 2, false );
    SubLFiles.declareFunction( me, "new_el_formula_error", "NEW-EL-FORMULA-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_formula_error_page", "CB-SHOW-FORMULA-ERROR-PAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_el_term_input_section", "CB-EL-TERM-INPUT-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_el_term_input_section_internal", "CB-EL-TERM-INPUT-SECTION-INTERNAL", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_extract_el_term_input", "CB-EXTRACT-EL-TERM-INPUT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_determine_el_term", "CB-DETERMINE-EL-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "el_term_error_p", "EL-TERM-ERROR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_el_term_error", "CB-EL-TERM-ERROR", 1, 2, false );
    SubLFiles.declareFunction( me, "new_el_term_error", "NEW-EL-TERM-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_term_error_page", "CB-SHOW-TERM-ERROR-PAGE", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_form_widgets_file()
  {
    $legacy_sentence_editor_class$ = SubLFiles.defconstant( "*LEGACY-SENTENCE-EDITOR-CLASS*", $str0$legacySentenceEditor );
    $sentence_editor_textarea_class$ = SubLFiles.defconstant( "*SENTENCE-EDITOR-TEXTAREA-CLASS*", $str1$CycLEditorArea );
    $cb_use_codemirror_sentence_editorP$ = SubLFiles.defparameter( "*CB-USE-CODEMIRROR-SENTENCE-EDITOR?*", T );
    $ke_text_code_editor_textarea_class$ = SubLFiles.defconstant( "*KE-TEXT-CODE-EDITOR-TEXTAREA-CLASS*", $str3$KETextEditorArea );
    $cb_use_ke_text_editorP$ = SubLFiles.defparameter( "*CB-USE-KE-TEXT-EDITOR?*", T );
    $subl_code_editor_textarea_class$ = SubLFiles.defconstant( "*SUBL-CODE-EDITOR-TEXTAREA-CLASS*", $str5$SubLEditorArea );
    $cb_use_subl_code_editorP$ = SubLFiles.defparameter( "*CB-USE-SUBL-CODE-EDITOR?*", NIL );
    $cb_mt_input_default_name$ = SubLFiles.deflexical( "*CB-MT-INPUT-DEFAULT-NAME*", $str8$mt );
    $cb_el_formula_input_default_name$ = SubLFiles.deflexical( "*CB-EL-FORMULA-INPUT-DEFAULT-NAME*", $str89$sentence );
    $codemirror_editor_start_script$ = SubLFiles.defparameter( "*CODEMIRROR-EDITOR-START-SCRIPT*", $str116$var_options____________var_editor );
    $utf8_nbsp$ = SubLFiles.deflexical( "*UTF8-NBSP*", $kw48$UNINITIALIZED );
    $return_string$ = SubLFiles.deflexical( "*RETURN-STRING*", $kw48$UNINITIALIZED );
    $cb_el_term_input_default_name$ = SubLFiles.deflexical( "*CB-EL-TERM-INPUT-DEFAULT-NAME*", $str168$term );
    return NIL;
  }

  public static SubLObject setup_cb_form_widgets_file()
  {
    utilities_macros.register_html_state_variable( $sym2$_CB_USE_CODEMIRROR_SENTENCE_EDITOR__ );
    utilities_macros.register_html_state_variable( $sym4$_CB_USE_KE_TEXT_EDITOR__ );
    utilities_macros.register_html_state_variable( $sym6$_CB_USE_SUBL_CODE_EDITOR__ );
    access_macros.define_obsolete_register( $sym124$CB_EXTRACT_QUERY_FORMULA_FROM_STRING, $list125 );
    generic_testing.define_test_case_table_int( $sym190$CB_CONVERT_STRINGS_TO_CYCL, ConsesLow.list( new SubLObject[] { $kw191$TEST, EQUAL, $kw192$OWNER, NIL, $kw193$CLASSES, NIL, $kw194$KB, $kw195$FULL, $kw196$WORKING_,
      T
    } ), $list197 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_form_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_form_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_form_widgets_file();
  }
  static
  {
    me = new cb_form_widgets();
    $legacy_sentence_editor_class$ = null;
    $sentence_editor_textarea_class$ = null;
    $cb_use_codemirror_sentence_editorP$ = null;
    $ke_text_code_editor_textarea_class$ = null;
    $cb_use_ke_text_editorP$ = null;
    $subl_code_editor_textarea_class$ = null;
    $cb_use_subl_code_editorP$ = null;
    $cb_mt_input_default_name$ = null;
    $cb_el_formula_input_default_name$ = null;
    $codemirror_editor_start_script$ = null;
    $utf8_nbsp$ = null;
    $return_string$ = null;
    $cb_el_term_input_default_name$ = null;
    $str0$legacySentenceEditor = makeString( "legacySentenceEditor" );
    $str1$CycLEditorArea = makeString( "CycLEditorArea" );
    $sym2$_CB_USE_CODEMIRROR_SENTENCE_EDITOR__ = makeSymbol( "*CB-USE-CODEMIRROR-SENTENCE-EDITOR?*" );
    $str3$KETextEditorArea = makeString( "KETextEditorArea" );
    $sym4$_CB_USE_KE_TEXT_EDITOR__ = makeSymbol( "*CB-USE-KE-TEXT-EDITOR?*" );
    $str5$SubLEditorArea = makeString( "SubLEditorArea" );
    $sym6$_CB_USE_SUBL_CODE_EDITOR__ = makeSymbol( "*CB-USE-SUBL-CODE-EDITOR?*" );
    $str7$ = makeString( "" );
    $str8$mt = makeString( "mt" );
    $sym9$STRINGP = makeSymbol( "STRINGP" );
    $str10$_A_monad_dimension_specified = makeString( "~A-monad-dimension-specified" );
    $kw11$EDIT_ALLOWED_ = makeKeyword( "EDIT-ALLOWED?" );
    $kw12$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $kw13$MONAD_CHOICES = makeKeyword( "MONAD-CHOICES" );
    $str14$Complete = makeString( "Complete" );
    $const15$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str16$Mt___ = makeString( "Mt : " );
    $str17$Clear_Mt = makeString( "Clear Mt" );
    $kw18$TOP = makeKeyword( "TOP" );
    $str19$t = makeString( "t" );
    $kw20$LEFT = makeKeyword( "LEFT" );
    $str21$Monad_Dimension = makeString( "Monad Dimension" );
    $kw22$RIGHT = makeKeyword( "RIGHT" );
    $str23$Monad_Mt___ = makeString( "Monad Mt : " );
    $str24$autocomplete_ = makeString( "autocomplete-" );
    $str25$input_ = makeString( "input-" );
    $str26$autocomplete_results_ = makeString( "autocomplete-results-" );
    $str27$yui_ac = makeString( "yui-ac" );
    $str28$position_static = makeString( "position:static" );
    $str29$yui_ac_input = makeString( "yui-ac-input" );
    $str30$yui_ac_container = makeString( "yui-ac-container" );
    $str31$_A_monad = makeString( "~A-monad" );
    $str32$_A_time_dimension_specified = makeString( "~A-time-dimension-specified" );
    $kw33$ANYTIME_PSC_ALLOWED_ = makeKeyword( "ANYTIME-PSC-ALLOWED?" );
    $str34$na = makeString( "na" );
    $str35$Time_Dimension = makeString( "Time Dimension" );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Now-Indexical" ) ) );
    $const37$TimeInterval = constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) );
    $str38$Time_ = makeString( "Time " );
    $str39$Interval___ = makeString( "Interval : " );
    $str40$Clear_Interval = makeString( "Clear Interval" );
    $str41$_A_time_interval = makeString( "~A-time-interval" );
    $list42 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
    $const43$TimeParameter = constant_handles.reader_make_constant_shell( makeString( "TimeParameter" ) );
    $str44$Parameter___ = makeString( "Parameter : " );
    $str45$Clear_Parameter = makeString( "Clear Parameter" );
    $str46$_A_time_parameter = makeString( "~A-time-parameter" );
    $kw47$ALLOW_VARIABLE_ = makeKeyword( "ALLOW-VARIABLE?" );
    $kw48$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $const49$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $kw50$MONAD_MT = makeKeyword( "MONAD-MT" );
    $kw51$TIME_MT = makeKeyword( "TIME-MT" );
    $kw52$TIME_INTERVAL = makeKeyword( "TIME-INTERVAL" );
    $kw53$TIME_PARAMETER = makeKeyword( "TIME-PARAMETER" );
    $kw54$MT_ERROR = makeKeyword( "MT-ERROR" );
    $list55 = ConsesLow.list( makeSymbol( "MT-ERROR-KEYWORD" ), makeSymbol( "ERROR-TYPE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PART-TYPE" ) );
    $kw56$WHOLLY_UNSPECIFIED = makeKeyword( "WHOLLY-UNSPECIFIED" );
    $str57$No_microtheory_was_specified_ = makeString( "No microtheory was specified." );
    $kw58$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $str59$No_monadic_microtheory_was_specif = makeString( "No monadic microtheory was specified." );
    $str60$No_microtheory_time_dimension_was = makeString( "No microtheory time dimension was specified." );
    $str61$No_microtheory_time_interval_was_ = makeString( "No microtheory time interval was specified." );
    $str62$No_microtheory_time_parameter_was = makeString( "No microtheory time parameter was specified." );
    $str63$The_MT_part__A_was_not_specified_ = makeString( "The MT part ~A was not specified." );
    $kw64$UNINTELLIGIBLE = makeKeyword( "UNINTELLIGIBLE" );
    $str65$The_string__S_did_not_make_sense_ = makeString( "The string ~S did not make sense as a microtheory." );
    $str66$The_string__S_did_not_make_sense_ = makeString( "The string ~S did not make sense as a microtheory time dimension." );
    $str67$The_string__S_did_not_make_sense_ = makeString( "The string ~S did not make sense as a time interval." );
    $str68$The_string__S_did_not_make_sense_ = makeString( "The string ~S did not make sense as a time parameter." );
    $str69$The_string__S_did_not_make_sense_ = makeString( "The string ~S did not make sense for MT part ~A." );
    $kw70$UNMATCHED_PAREN = makeKeyword( "UNMATCHED-PAREN" );
    $str71$Unmatched_Parentheses_in_microthe = makeString( "Unmatched Parentheses in microtheory ~S." );
    $str72$Unmatched_Parentheses_in_microthe = makeString( "Unmatched Parentheses in microtheory time dimension ~S." );
    $str73$Unmatched_Parentheses_in_time_int = makeString( "Unmatched Parentheses in time interval ~S." );
    $str74$Unmatched_Parentheses_in_time_par = makeString( "Unmatched Parentheses in time parameter ~S." );
    $str75$Unmatched_Parentheses_in_mt_part_ = makeString( "Unmatched Parentheses in mt part ~S." );
    $kw76$INCOMPLETELY_SPECIFIED = makeKeyword( "INCOMPLETELY-SPECIFIED" );
    $str77$MT_parts__S_were_unspecified_ = makeString( "MT parts ~S were unspecified." );
    $kw78$SEMANTIC = makeKeyword( "SEMANTIC" );
    $str79$_S_did_not_specify_a_monadic_micr = makeString( "~S did not specify a monadic microtheory." );
    $str80$_S_did_not_specify_a_microtheory_ = makeString( "~S did not specify a microtheory." );
    $str81$_S_did_not_specify_a_microtheory_ = makeString( "~S did not specify a microtheory time dimension." );
    $kw82$NON_TIME_INTERVAL = makeKeyword( "NON-TIME-INTERVAL" );
    $str83$_S_did_not_specify_a_time_interva = makeString( "~S did not specify a time interval." );
    $kw84$NON_TIME_PARAMETER = makeKeyword( "NON-TIME-PARAMETER" );
    $str85$_S_did_not_specify_a_time_paramet = makeString( "~S did not specify a time parameter." );
    $str86$_S_did_not_specify_a_term_suitabl = makeString( "~S did not specify a term suitable for MT part ~A." );
    $str87$MT_ERROR__S____S__S__S = makeString( "MT ERROR ~S : ~S ~S ~S" );
    $str88$_S____S = makeString( "~S : ~S" );
    $str89$sentence = makeString( "sentence" );
    $list90 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INPUT-NAME" ), makeSymbol( "*CB-EL-FORMULA-INPUT-DEFAULT-NAME*" ) ), ConsesLow.list( makeSymbol( "COMPLETE-LABEL" ),
        makeString( "Complete" ) ), makeSymbol( "CHOICES" ), ConsesLow.list( makeSymbol( "PRETTY-NAME" ), makeString( "EL Sentence" ) ), ConsesLow.list( makeSymbol( "CLEAR-LABEL" ), makeString( "Clear Sentence" ) ),
      makeSymbol( "CYCLIFY-LABEL" ), ConsesLow.list( makeSymbol( "WIDTH" ), makeInteger( 80 ) ), ConsesLow.list( makeSymbol( "HEIGHT" ), TWENTY_INTEGER ), ConsesLow.list( makeSymbol( "MODE" ), makeKeyword( "ASSERT" ) )
    } );
    $list91 = ConsesLow.list( new SubLObject[] { makeKeyword( "INPUT-NAME" ), makeKeyword( "COMPLETE-LABEL" ), makeKeyword( "CHOICES" ), makeKeyword( "PRETTY-NAME" ), makeKeyword( "CLEAR-LABEL" ), makeKeyword(
        "CYCLIFY-LABEL" ), makeKeyword( "WIDTH" ), makeKeyword( "HEIGHT" ), makeKeyword( "MODE" )
    } );
    $kw92$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw93$COMPLETE_LABEL = makeKeyword( "COMPLETE-LABEL" );
    $kw94$CHOICES = makeKeyword( "CHOICES" );
    $kw95$PRETTY_NAME = makeKeyword( "PRETTY-NAME" );
    $str96$EL_Sentence = makeString( "EL Sentence" );
    $kw97$CLEAR_LABEL = makeKeyword( "CLEAR-LABEL" );
    $str98$Clear_Sentence = makeString( "Clear Sentence" );
    $kw99$CYCLIFY_LABEL = makeKeyword( "CYCLIFY-LABEL" );
    $kw100$WIDTH = makeKeyword( "WIDTH" );
    $int101$80 = makeInteger( 80 );
    $kw102$HEIGHT = makeKeyword( "HEIGHT" );
    $kw103$MODE = makeKeyword( "MODE" );
    $kw104$ASSERT = makeKeyword( "ASSERT" );
    $sym105$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym106$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym107$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym108$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str109$__ = makeString( " :" );
    $kw110$QUERY = makeKeyword( "QUERY" );
    $sym111$UNICODE_NAUT_P = makeSymbol( "UNICODE-NAUT-P" );
    $sym112$CYCL_STRING_TO_UTF8_STRING = makeSymbol( "CYCL-STRING-TO-UTF8-STRING" );
    $str113$false = makeString( "false" );
    $str114$true = makeString( "true" );
    $str115$_script_Event_onDOMReady_function = makeString( "<script>Event.onDOMReady(function() {setupSentenceEditor(~S, ~S, ~S, ~A);});</script>" );
    $str116$var_options____________var_editor = makeString( "var options = {};\n     var editor = CycCodeEditor.fromTextArea(document.getElementById(~S), options);" );
    $kw117$HTML_EDITOR_SCRIPTS = makeKeyword( "HTML-EDITOR-SCRIPTS" );
    $str118$javascript = makeString( "javascript" );
    $kw119$REQUIRE_SENTENCE_ = makeKeyword( "REQUIRE-SENTENCE?" );
    $list120 = ConsesLow.list( makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "REQUIRED?" ), T ), ConsesLow.list( makeSymbol( "REQUIRE-SENTENCE?" ), NIL ), ConsesLow.list( makeSymbol( "INPUT-NAME" ), makeSymbol(
        "*CB-EL-FORMULA-INPUT-DEFAULT-NAME*" ) ), ConsesLow.list( makeSymbol( "AUTO-CYCLIFY" ), T ) );
    $list121 = ConsesLow.list( makeKeyword( "REQUIRED?" ), makeKeyword( "REQUIRE-SENTENCE?" ), makeKeyword( "INPUT-NAME" ), makeKeyword( "AUTO-CYCLIFY" ) );
    $kw122$REQUIRED_ = makeKeyword( "REQUIRED?" );
    $kw123$AUTO_CYCLIFY = makeKeyword( "AUTO-CYCLIFY" );
    $sym124$CB_EXTRACT_QUERY_FORMULA_FROM_STRING = makeSymbol( "CB-EXTRACT-QUERY-FORMULA-FROM-STRING" );
    $list125 = ConsesLow.list( makeSymbol( "CB-EXTRACT-EL-FORMULA-INPUT" ) );
    $str126$Bad_formula__probably_due_to_a_mi = makeString( "Bad formula, probably due to a misspelling.~%Check these inputs:~%~%~S" );
    $kw127$INVALID_CONSTANTS = makeKeyword( "INVALID-CONSTANTS" );
    $kw128$EOF = makeKeyword( "EOF" );
    $kw129$UNMATCHED_PARENTHESES = makeKeyword( "UNMATCHED-PARENTHESES" );
    $kw130$ERROR = makeKeyword( "ERROR" );
    $kw131$READ_ERROR = makeKeyword( "READ-ERROR" );
    $sym132$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol( "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P" );
    $kw133$SYMBOLS_FOR_INVALID_CONSTANTS = makeKeyword( "SYMBOLS-FOR-INVALID-CONSTANTS" );
    $kw134$NON_SENTENCE = makeKeyword( "NON-SENTENCE" );
    $sym135$CYCL_STRING_P = makeSymbol( "CYCL-STRING-P" );
    $list136 = ConsesLow.list( makeString( "\"" ) );
    $str137$_ = makeString( "\"" );
    $ic138 = Vectors.vector( new SubLObject[] { makeInteger( 160 )
    } );
    $str139$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $str140$_ = makeString( " " );
    $list141 = ConsesLow.list( makeKeyword( "EL-FORMULA-ERROR" ), makeKeyword( "EL-SENTENCE-ERROR" ) );
    $sym142$EL_FORMULA_ERROR_P = makeSymbol( "EL-FORMULA-ERROR-P" );
    $kw143$LOCATION = makeKeyword( "LOCATION" );
    $list144 = ConsesLow.list( makeSymbol( "EL-FORMULA-ERROR-KEYWORD" ), makeSymbol( "ERROR-TYPE" ) );
    $str145$No_sentence_was_specified_in_ = makeString( "No sentence was specified in " );
    $str146$_ = makeString( "." );
    $str147$No_sentence_was_specified_ = makeString( "No sentence was specified." );
    $str148$_A = makeString( "~A" );
    $str149$Invalid_Constant_References_in_ = makeString( "Invalid Constant References in " );
    $str150$Invalid_Constant_References = makeString( "Invalid Constant References" );
    $sym151$CB_SHOW_INVALID_CONSTANTS = makeSymbol( "CB-SHOW-INVALID-CONSTANTS" );
    $str152$Unmatched_Parentheses_in_ = makeString( "Unmatched Parentheses in " );
    $str153$Unmatched_Parentheses = makeString( "Unmatched Parentheses" );
    $sym154$CB_SHOW_UNMATCHED_PARENTHESES = makeSymbol( "CB-SHOW-UNMATCHED-PARENTHESES" );
    $str155$Unfinished_Formula_in_ = makeString( "Unfinished Formula in " );
    $str156$Unfinished_Formula = makeString( "Unfinished Formula" );
    $sym157$CB_SHOW_EOF_EXPLANATION = makeSymbol( "CB-SHOW-EOF-EXPLANATION" );
    $str158$Unreadable_Formula_in_ = makeString( "Unreadable Formula in " );
    $str159$Unreadable_Formula = makeString( "Unreadable Formula" );
    $sym160$CB_SHOW_READER_ERROR_EXPLANATION = makeSymbol( "CB-SHOW-READER-ERROR-EXPLANATION" );
    $sym161$CB_SHOW_SYMBOLS_FOR_INVALID_CONSTANTS = makeSymbol( "CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS" );
    $str162$Not_a_Sentence_in_ = makeString( "Not a Sentence in " );
    $str163$Not_a_Sentence = makeString( "Not a Sentence" );
    $sym164$CB_SHOW_NON_SENTENCE_EXPLANATION = makeSymbol( "CB-SHOW-NON-SENTENCE-EXPLANATION" );
    $kw165$EL_FORMULA_ERROR = makeKeyword( "EL-FORMULA-ERROR" );
    $str166$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str167$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $str168$term = makeString( "term" );
    $str169$Clear_Term = makeString( "Clear Term" );
    $kw170$COMPLETE_TYPE = makeKeyword( "COMPLETE-TYPE" );
    $int171$300 = makeInteger( 300 );
    $str172$completeContainer = makeString( "completeContainer" );
    $str173$textArea = makeString( "textArea" );
    $str174$width__ = makeString( "width: " );
    $str175$px_ = makeString( "px;" );
    $str176$px__position_static = makeString( "px; position:static" );
    $str177$autocomplete = makeString( "autocomplete" );
    $str178$cycAutocompleteContainer = makeString( "cycAutocompleteContainer" );
    $list179 = ConsesLow.list( makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "REQUIRED?" ), T ), ConsesLow.list( makeSymbol( "INPUT-NAME" ), makeSymbol( "*CB-EL-TERM-INPUT-DEFAULT-NAME*" ) ), ConsesLow.list(
        makeSymbol( "AUTO-CYCLIFY" ), T ) );
    $list180 = ConsesLow.list( makeKeyword( "REQUIRED?" ), makeKeyword( "INPUT-NAME" ), makeKeyword( "AUTO-CYCLIFY" ) );
    $kw181$EL_TERM_ERROR = makeKeyword( "EL-TERM-ERROR" );
    $sym182$EL_TERM_ERROR_P = makeSymbol( "EL-TERM-ERROR-P" );
    $list183 = ConsesLow.list( makeSymbol( "EL-TERM-ERROR-KEYWORD" ), makeSymbol( "ERROR-TYPE" ) );
    $str184$No_term_was_specified_in_ = makeString( "No term was specified in " );
    $str185$No_term_was_specified_ = makeString( "No term was specified." );
    $str186$Unfinished_Term_in_ = makeString( "Unfinished Term in " );
    $str187$Unfinished_Term = makeString( "Unfinished Term" );
    $str188$Unreadable_Term_in_ = makeString( "Unreadable Term in " );
    $str189$Unreadable_Term = makeString( "Unreadable Term" );
    $sym190$CB_CONVERT_STRINGS_TO_CYCL = makeSymbol( "CB-CONVERT-STRINGS-TO-CYCL" );
    $kw191$TEST = makeKeyword( "TEST" );
    $kw192$OWNER = makeKeyword( "OWNER" );
    $kw193$CLASSES = makeKeyword( "CLASSES" );
    $kw194$KB = makeKeyword( "KB" );
    $kw195$FULL = makeKeyword( "FULL" );
    $kw196$WORKING_ = makeKeyword( "WORKING?" );
    $list197 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), constant_handles.reader_make_constant_shell( makeString(
        "CityOfBeijingChina" ) ), makeString( "&#21271;&#20140;&#24066;" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), constant_handles.reader_make_constant_shell(
            makeString( "CityOfBeijingChina" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u5317;&u4EAC;&u5E02;" ) ) ) ), ConsesLow.list( ConsesLow
                .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), constant_handles.reader_make_constant_shell( makeString( "CityOfBeijingChina" ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u5317;&u4eac;&u5e02;" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "nameString" ) ), constant_handles.reader_make_constant_shell( makeString( "CityOfBeijingChina" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ),
                            makeString( "&u5317;&u4EAC;&u5E02;" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "Thing" ) ), makeString( "The Big Thing" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ),
                                    constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), makeString( "The Big Thing" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "nameString" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "The Big Thing" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "nameString" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), makeString( "The Big Thing" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "mathRenderAs" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ), ConsesLow
                                                        .list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u2260;" ) ) ) ), ConsesLow.list( constant_handles
                                                            .reader_make_constant_shell( makeString( "mathRenderAs" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ), ConsesLow.list(
                                                                constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u2260;" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                    .list( constant_handles.reader_make_constant_shell( makeString( "mathRenderAs" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                        "InfixTimesFn" ) ), makeString( "&ne;" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mathRenderAs" ) ),
                                                                            constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                makeString( "UnicodeStringFn" ) ), makeString( "&u2260;" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                    .reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u2260;" ) ) ), ConsesLow.list( constant_handles
                                                                                        .reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u2260;" ) ) ) );
  }
}
/*
 * 
 * Total time: 1207 ms synthetic
 */