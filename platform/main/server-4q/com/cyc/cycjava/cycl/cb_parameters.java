package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_parameters
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_parameters";
  public static final String myFingerPrint = "ba09963dec2a6fbe29cea6856a299e38430592be83ab04033854c12ba4794cf3";
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 540L)
  public static SubLSymbol $transcript_file_shorthand$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 797L)
  public static SubLSymbol $cb_include_help$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 942L)
  public static SubLSymbol $cb_include_inference_helpP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 1053L)
  public static SubLSymbol $cb_c_default_content$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 1187L)
  public static SubLSymbol $cb_c_maximal_upper_bound$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 1403L)
  public static SubLSymbol $cb_c_assertion_formulas_display$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 1595L)
  public static SubLSymbol $cb_constant_history_max$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 1720L)
  public static SubLSymbol $cb_use_categorized_historyP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 1872L)
  public static SubLSymbol $cb_constant_history_chronological_max$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2035L)
  public static SubLSymbol $cb_constant_history$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2135L)
  public static SubLSymbol $cb_nat_history_max$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2250L)
  public static SubLSymbol $cb_nat_history$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2340L)
  public static SubLSymbol $cb_assertion_history_max$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2467L)
  public static SubLSymbol $cb_assertion_history$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2554L)
  public static SubLSymbol $cb_sentence_history_max$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2679L)
  public static SubLSymbol $cb_sentence_history$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2764L)
  public static SubLSymbol $cb_history_show_el_formulasP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 2894L)
  public static SubLSymbol $cb_status_update_interval$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 3011L)
  public static SubLSymbol $cb_destroy_all_inferences_but_last_n_default$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 3163L)
  public static SubLSymbol $cb_destroy_all_inferences_but_last_n$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 3329L)
  public static SubLSymbol $cb_perform_argumentation_for_closed_queryP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 3593L)
  public static SubLSymbol $cb_c_wrap_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 3765L)
  public static SubLSymbol $cb_a_show_el_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 3893L)
  public static SubLSymbol $cb_a_show_hl_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 4019L)
  public static SubLSymbol $cb_a_edit_preserve_meta_assertions_by_defaultP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 4204L)
  public static SubLSymbol $cb_a_change_all_meta_assertions_mt_by_defaultP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 4499L)
  public static SubLSymbol $cb_a_perform_access_diagnostics$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 4837L)
  public static SubLSymbol $cb_a_show_english$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 4971L)
  public static SubLSymbol $cb_wrap_interactor$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 5210L)
  public static SubLSymbol $cb_a_show_newlines_in_string_args$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 5358L)
  public static SubLSymbol $cb_use_gke_to_edit_el_sentences$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 5501L)
  public static SubLSymbol $cb_use_dynamic_table_for_inference_results$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 5684L)
  public static SubLSymbol $cb_show_cyclify_button$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 5830L)
  public static SubLSymbol $cb_enable_inference_monitoring$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 6014L)
  public static SubLSymbol $cb_assert_queue_default$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 6159L)
  public static SubLSymbol $cb_separate_assertion_frame$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 6343L)
  public static SubLSymbol $cb_user_toolbar_links$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 6710L)
  public static SubLSymbol $cb_separate_doc_frame$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 6911L)
  public static SubLSymbol $cb_more_assertion_marker_image_text$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 7119L)
  public static SubLSymbol $cb_ke_text_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 7305L)
  public static SubLSymbol $cb_fastP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 7415L)
  public static SubLSymbol $cb_max_assertions_non_collapsed$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 7723L)
  public static SubLSymbol $cb_default_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 7892L)
  public static SubLSymbol $cb_editing_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 8258L)
  public static SubLSymbol $cb_js_sentence_editor_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 8467L)
  public static SubLSymbol $show_kb_monitor_links$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 8614L)
  public static SubLSymbol $cb_confirm_kills$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 8720L)
  public static SubLSymbol $cb_assertion_indexical$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 8935L)
  public static SubLSymbol $cb_specify_show_gloss$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9073L)
  public static SubLSymbol $cb_lucky_term_searchP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9188L)
  public static SubLSymbol $cb_mts_filter_use_genlmt$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
  public static SubLSymbol $cb_use_ke_review_creators$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
  public static SubLSymbol $cb_ke_review_creators$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9441L)
  public static SubLSymbol $cb_c_suppress_body_level_elements$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9740L)
  public static SubLSymbol $cb_c_gaf_arg_last_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9783L)
  public static SubLSymbol $cb_c_gaf_arg_use_binary$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9826L)
  public static SubLSymbol $cb_c_nart_arg_use_binary$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9870L)
  public static SubLSymbol $cb_c_formula_display_exception_index_hook$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 10151L)
  public static SubLSymbol $cb_show_el_assertion_readably_last_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 10387L)
  public static SubLSymbol $cb_show_el_assertion_readably_last_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 10624L)
  public static SubLSymbol $cb_assertion_el_formula_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 10833L)
  public static SubLSymbol $cb_default_term_frame$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 10937L)
  public static SubLSymbol $cb_default_assertion_frame$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11051L)
  public static SubLSymbol $cb_assertion_link_hook$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11189L)
  public static SubLSymbol $cb_constant_input_width$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11308L)
  public static SubLSymbol $cb_hlmt_input_width$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11396L)
  public static SubLSymbol $cb_nonreviewable_assertion_markers$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11545L)
  public static SubLSymbol $cb_ke_review_start_date$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11679L)
  public static SubLSymbol $cb_ke_review_end_date$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11810L)
  public static SubLSymbol $cb_viewpoint_show_doc_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 11951L)
  public static SubLSymbol $cb_viewpoint_show_book_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12091L)
  public static SubLSymbol $cb_permit_robots_to_followP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12269L)
  public static SubLSymbol $cb_permit_robots_to_indexP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12389L)
  public static SubLSymbol $cb_glob$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15288L)
  public static SubLSymbol $cb_form_url_prefix_print$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$_CB_INCLUDE_HELP_;
  private static final SubLSymbol $sym2$_CB_INCLUDE_INFERENCE_HELP__;
  private static final SubLSymbol $kw3$MAXIMAL;
  private static final SubLSymbol $sym4$_CB_C_DEFAULT_CONTENT_;
  private static final SubLInteger $int5$30;
  private static final SubLSymbol $sym6$_CB_C_MAXIMAL_UPPER_BOUND_;
  private static final SubLSymbol $kw7$HL_FORMULAS;
  private static final SubLSymbol $sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_;
  private static final SubLSymbol $sym9$_CB_CONSTANT_HISTORY_MAX_;
  private static final SubLSymbol $sym10$_CB_USE_CATEGORIZED_HISTORY__;
  private static final SubLSymbol $sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_;
  private static final SubLSymbol $sym12$_CB_CONSTANT_HISTORY_;
  private static final SubLSymbol $sym13$_CB_NAT_HISTORY_MAX_;
  private static final SubLSymbol $sym14$_CB_NAT_HISTORY_;
  private static final SubLSymbol $sym15$_CB_ASSERTION_HISTORY_MAX_;
  private static final SubLSymbol $sym16$_CB_ASSERTION_HISTORY_;
  private static final SubLSymbol $sym17$_CB_SENTENCE_HISTORY_MAX_;
  private static final SubLSymbol $sym18$_CB_SENTENCE_HISTORY_;
  private static final SubLSymbol $sym19$_CB_HISTORY_SHOW_EL_FORMULAS__;
  private static final SubLSymbol $sym20$_CB_STATUS_UPDATE_INTERVAL_;
  private static final SubLSymbol $sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_;
  private static final SubLSymbol $sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__;
  private static final SubLSymbol $sym23$_CB_C_WRAP_ASSERTIONS_;
  private static final SubLSymbol $sym24$_CB_A_SHOW_EL_FORMULA_;
  private static final SubLSymbol $sym25$_CB_A_SHOW_HL_FORMULA_;
  private static final SubLSymbol $sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__;
  private static final SubLSymbol $sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__;
  private static final SubLSymbol $sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_;
  private static final SubLSymbol $sym29$_CB_A_SHOW_ENGLISH_;
  private static final SubLSymbol $sym30$_CB_WRAP_INTERACTOR_;
  private static final SubLSymbol $sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_;
  private static final SubLSymbol $sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_;
  private static final SubLSymbol $sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_;
  private static final SubLSymbol $sym34$_CB_SHOW_CYCLIFY_BUTTON_;
  private static final SubLSymbol $sym35$_CB_ENABLE_INFERENCE_MONITORING_;
  private static final SubLSymbol $kw36$LOCAL;
  private static final SubLSymbol $sym37$_CB_ASSERT_QUEUE_DEFAULT_;
  private static final SubLSymbol $sym38$_CB_SEPARATE_ASSERTION_FRAME_;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$_CB_USER_TOOLBAR_LINKS_;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$PARAMETER;
  private static final SubLSymbol $sym43$_CB_SEPARATE_DOC_FRAME_;
  private static final SubLSymbol $sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_;
  private static final SubLSymbol $sym45$_CB_KE_TEXT_MODE_;
  private static final SubLSymbol $sym46$_CB_FAST__;
  private static final SubLInteger $int47$50;
  private static final SubLSymbol $sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_;
  private static final SubLObject $const49$BaseKB;
  private static final SubLSymbol $sym50$_CB_DEFAULT_MT_;
  private static final SubLSymbol $sym51$_CB_EDITING_ENABLED_;
  private static final SubLSymbol $sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_;
  private static final SubLSymbol $sym53$_SHOW_KB_MONITOR_LINKS_;
  private static final SubLSymbol $sym54$_CB_CONFIRM_KILLS_;
  private static final SubLObject $const55$TheAssertionSentence;
  private static final SubLSymbol $sym56$NONE;
  private static final SubLSymbol $sym57$_CB_SPECIFY_SHOW_GLOSS_;
  private static final SubLSymbol $sym58$_CB_LUCKY_TERM_SEARCH__;
  private static final SubLSymbol $sym59$_CB_MTS_FILTER_USE_GENLMT_;
  private static final SubLSymbol $sym60$_CB_USE_KE_REVIEW_CREATORS_;
  private static final SubLSymbol $sym61$_CB_KE_REVIEW_CREATORS_;
  private static final SubLSymbol $kw62$MAIN;
  private static final SubLInteger $int63$40;
  private static final SubLList $list64;
  private static final SubLInteger $int65$19990921;
  private static final SubLSymbol $sym66$_CB_KE_REVIEW_START_DATE_;
  private static final SubLInteger $int67$29991231;
  private static final SubLSymbol $sym68$_CB_KE_REVIEW_END_DATE_;
  private static final SubLSymbol $sym69$_CB_VIEWPOINT_SHOW_DOC_PREDS_;
  private static final SubLSymbol $sym70$_CB_VIEWPOINT_SHOW_BOOK_PREDS_;
  private static final SubLSymbol $sym71$_CB_GLOB_;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLSymbol $kw74$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw75$DONE;
  private static final SubLSymbol $sym76$DO_GLOB;
  private static final SubLSymbol $sym77$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym78$HTML_HEAD;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $kw82$MINI_LOGO;
  private static final SubLString $str83$mini_logo_gif;
  private static final SubLSymbol $sym84$CB_HEAD_SHORTCUT_ICON;
  private static final SubLSymbol $sym85$CB_HEAD;
  private static final SubLString $str86$SHORTCUT_ICON;
  private static final SubLSymbol $sym87$PROGN;
  private static final SubLList $list88;
  private static final SubLString $str89$_;
  private static final SubLSymbol $sym90$CYC_CGI_RELATIVE_URL;
  private static final SubLSymbol $sym91$CYC_CGI_URL_INT;
  private static final SubLSymbol $sym92$CYC_CGI_URL;
  private static final SubLString $str93$_cb_start_;
  private static final SubLString $str94$_;
  private static final SubLString $str95$_a_;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$FRAME_NAME_VAR;
  private static final SubLSymbol $sym98$CLET;
  private static final SubLSymbol $sym99$CB_FRAME_NAME;
  private static final SubLSymbol $sym100$HTML_FANCY_FORM;
  private static final SubLSymbol $sym101$_CYC_CGI_PROGRAM_;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$CB_BASIC_FORM;
  private static final SubLSymbol $sym104$HTML_HIDDEN_INPUT;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$FRAME_NAME_VAR;
  private static final SubLSymbol $sym107$HTML_FANCY_ANCHOR;
  private static final SubLSymbol $kw108$TARGET;
  private static final SubLSymbol $kw109$TITLE;
  private static final SubLSymbol $kw110$HREF;
  private static final SubLSymbol $kw111$CLASS;
  private static final SubLSymbol $kw112$ATTRS;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$FRAME_LINK;
  private static final SubLSymbol $kw115$TOP;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$FRAME_NAME_VAR;
  private static final SubLSymbol $kw118$ID;
  private static final SubLList $list119;
  private static final SubLString $str120$;
  private static final SubLSymbol $sym121$FRAME_NAME_VAR;
  private static final SubLSymbol $sym122$FWHEN;
  private static final SubLSymbol $kw123$ONCLICK;
  private static final SubLList $list124;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$PIF;
  private static final SubLSymbol $sym127$HTML_FORMAT;
  private static final SubLString $str128$__A_;
  private static final SubLList $list129;
  private static final SubLString $str130$___A____;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$FRAME_NAME_VAR;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$FRAME_NAME_VAR;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$HTML_HOVEROVER_ANCHOR;
  private static final SubLSymbol $kw137$HOVEROVER_HTML;
  private static final SubLSymbol $kw138$CAPTION;
  private static final SubLSymbol $kw139$WIDTH;
  private static final SubLSymbol $kw140$STICKY;
  private static final SubLList $list141;
  private static final SubLString $str142$CB_LINK__A;
  private static final SubLSymbol $sym143$DEFINE;
  private static final SubLSymbol $sym144$SETUP_CB_LINK_METHOD;
  private static final SubLSymbol $sym145$QUOTE;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$PWHEN_FEATURE;
  private static final SubLSymbol $kw148$CYC_OPENCYC;
  private static final SubLSymbol $sym149$PWHEN;
  private static final SubLSymbol $sym150$CB_ICON_EXISTS_;
  private static final SubLSymbol $sym151$CB_ICON;
  private static final SubLList $list152;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$FIF;
  private static final SubLSymbol $sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLSymbol $kw163$COMPLETION_;
  private static final SubLSymbol $kw164$PASSWORD_;
  private static final SubLSymbol $kw165$DHTML_;
  private static final SubLSymbol $kw166$HELP;
  private static final SubLSymbol $kw167$COLOR;
  private static final SubLSymbol $sym168$_HTML_DEFAULT_BGCOLOR_;
  private static final SubLSymbol $kw169$SHOW_COPYRIGHT;
  private static final SubLSymbol $kw170$OMIT_HEADING_;
  private static final SubLSymbol $sym171$TITLE_VAR;
  private static final SubLSymbol $sym172$WITH_HTML_ID_SPACE;
  private static final SubLSymbol $sym173$HTML_DOCUMENT;
  private static final SubLList $list174;
  private static final SubLSymbol $sym175$HTML_TITLE;
  private static final SubLSymbol $sym176$HTML_PRINC;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$HTML_FANCY_BODY;
  private static final SubLSymbol $kw181$BACKGROUND_COLOR;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$CAND;
  private static final SubLSymbol $sym184$CNOT;
  private static final SubLSymbol $sym185$HTML_HEADING;
  private static final SubLList $list186;
  private static final SubLSymbol $sym187$CB_HELP_PREAMBLE;
  private static final SubLList $list188;
  private static final SubLList $list189;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLSymbol $sym192$TITLE_VAR;
  private static final SubLList $list193;
  private static final SubLList $list194;
  private static final SubLList $list195;
  private static final SubLSymbol $sym196$CB_C_CONTENT_PAGE;
  private static final SubLSymbol $kw197$CYC_PPH;
  private static final SubLSymbol $sym198$WITH_PPH_MEMOIZATION;
  private static final SubLList $list199;

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 8542L)
  public static SubLObject cb_editing_enabled_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return system_parameters.$cb_editing_enabledP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9188L)
  public static SubLObject cb_mts_filter_use_genlmt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_mts_filter_use_genlmt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9188L)
  public static SubLObject set_cb_mts_filter_use_genlmt(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_mts_filter_use_genlmt$.setDynamicValue( new_value, thread );
    return $cb_mts_filter_use_genlmt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
  public static SubLObject cb_use_ke_review_creators()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_ke_review_creators$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
  public static SubLObject set_cb_use_ke_review_creators(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_ke_review_creators$.setDynamicValue( new_value, thread );
    return $cb_use_ke_review_creators$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
  public static SubLObject cb_ke_review_creators()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_ke_review_creators$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
  public static SubLObject set_cb_ke_review_creators(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_ke_review_creators$.setDynamicValue( new_value, thread );
    return $cb_ke_review_creators$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12637L)
  public static SubLObject cb_glob_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_glob = $cb_glob$.getDynamicValue( thread );
    if( NIL == v_glob )
    {
      return Values.values( NIL, NIL );
    }
    return glob.glob_lookup( v_glob, id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12835L)
  public static SubLObject cb_glob_lookup_by_string(final SubLObject id_string)
  {
    return cb_glob_lookup( string_utilities.string_to_integer( id_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12944L)
  public static SubLObject cb_glob_id(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_glob = $cb_glob$.getDynamicValue( thread );
    if( NIL == v_glob )
    {
      v_glob = glob.new_glob( Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
      $cb_glob$.setDynamicValue( v_glob, thread );
    }
    return glob.glob_enter( v_glob, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13181L)
  public static SubLObject cb_glob_remove(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_glob = $cb_glob$.getDynamicValue( thread );
    if( NIL == v_glob )
    {
      return NIL;
    }
    return glob.glob_remove( v_glob, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13364L)
  public static SubLObject cb_glob_remove_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_glob = $cb_glob$.getDynamicValue( thread );
    if( NIL == v_glob )
    {
      return NIL;
    }
    return glob.glob_remove_id( v_glob, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13557L)
  public static SubLObject cb_glob_reset()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_glob = $cb_glob$.getDynamicValue( thread );
    if( NIL == v_glob )
    {
      return NIL;
    }
    return glob.glob_reset( v_glob );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13739L)
  public static SubLObject do_cb_glob(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    v_object = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list72 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list72 );
      if( NIL == conses_high.member( current_$1, $list73, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw74$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw75$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym76$DO_GLOB, ConsesLow.list( id, v_object, $sym71$_CB_GLOB_, $kw75$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14005L)
  public static SubLObject cb_glob_find_all_if(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( pred ) : pred;
    SubLObject result = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( glob.do_glob_index( $cb_glob$.getDynamicValue( thread ) ) ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject id = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject v_object = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != Functions.funcall( pred, v_object ) )
      {
        result = ConsesLow.cons( v_object, result );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14377L)
  public static SubLObject cb_head(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym78$HTML_HEAD, $list79, $list80, $list81, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14725L)
  public static SubLObject cb_head_shortcut_icon()
  {
    final SubLObject shortcut_icon = cyc_file_dependencies.cb_icon_file_path( $kw82$MINI_LOGO );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_link_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_link_rel$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str86$SHORTCUT_ICON );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != shortcut_icon )
    {
      html_utilities.html_markup( html_macros.$html_link_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( shortcut_icon );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14927L)
  public static SubLObject cyc_cgi_url(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym87$PROGN, $list88, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15071L)
  public static SubLObject cyc_cgi_url_string(final SubLObject handler_and_args_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ), new SubLObject[] { $str89$_, handler_and_args_string
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15552L)
  public static SubLObject cyc_cgi_url_int()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Functions.funcall( $cb_form_url_prefix_print$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15668L)
  public static SubLObject cyc_cgi_relative_url()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_markup( $str89$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15845L)
  public static SubLObject cyc_cgi_absolute_cb_framed_url()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( http_kernel.http_server_cgi_base_url() );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_markup( $str93$_cb_start_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 16238L)
  public static SubLObject cyc_cgi_kea_url()
  {
    html_utilities.html_markup( web_utilities.effective_servlet_container_host() );
    html_utilities.html_markup( $str94$_ );
    html_utilities.html_markup( web_utilities.effective_servlet_container_port() );
    html_utilities.html_markup( $str95$_a_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 16534L)
  public static SubLObject cb_basic_form(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject target = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list96 );
    current = current.rest();
    final SubLObject script = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list96 );
    current = current.rest();
    final SubLObject method = current.isCons() ? current.first() : html_macros.$html_form_method_post$.getGlobalValue();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list96 );
    current = current.rest();
    final SubLObject id = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list96 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject frame_name_var = $sym97$FRAME_NAME_VAR;
      return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym99$CB_FRAME_NAME, target ) ) ), ConsesLow.listS( $sym100$HTML_FANCY_FORM, ConsesLow.list(
          $sym101$_CYC_CGI_PROGRAM_, method, frame_name_var, NIL, script, id ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 16831L)
  public static SubLObject cb_basic_form_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject handler_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    handler_name = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list102 );
    current = current.rest();
    final SubLObject value = current.isCons() ? current.first() : T;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list102 );
    current = current.rest();
    final SubLObject script = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list102 );
    current = current.rest();
    final SubLObject method = current.isCons() ? current.first() : html_macros.$html_form_method_post$.getGlobalValue();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list102 );
    current = current.rest();
    final SubLObject id = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list102 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym103$CB_BASIC_FORM, ConsesLow.list( target, script, method, id ), ConsesLow.list( $sym104$HTML_HIDDEN_INPUT, handler_name, value ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list102 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 17084L)
  public static SubLObject frame_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    link_body = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : $kw62$MAIN;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list105 );
    current = current.rest();
    final SubLObject title = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list105 );
    current = current.rest();
    final SubLObject v_class = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list105 );
    current = current.rest();
    final SubLObject attrs = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list105 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject frame_name_var = $sym106$FRAME_NAME_VAR;
      return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym99$CB_FRAME_NAME, target ) ) ), ConsesLow.list( $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( new SubLObject[] {
        $kw108$TARGET, frame_name_var, $kw109$TITLE, title, $kw110$HREF, ConsesLow.list( $sym92$CYC_CGI_URL, url_body ), $kw111$CLASS, v_class, $kw112$ATTRS, attrs
      } ), link_body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list105 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 17869L)
  public static SubLObject page_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    link_body = current.first();
    current = current.rest();
    final SubLObject title = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list113 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym114$FRAME_LINK, url_body, link_body, $kw115$TOP, title );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 18287L)
  public static SubLObject absolute_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    url = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    link_body = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : $kw62$MAIN;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list116 );
    current = current.rest();
    final SubLObject title = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list116 );
    current = current.rest();
    final SubLObject id = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list116 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject frame_name_var = $sym117$FRAME_NAME_VAR;
      return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym99$CB_FRAME_NAME, target ) ) ), ConsesLow.list( $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$TARGET,
          frame_name_var, $kw109$TITLE, title, $kw110$HREF, url, $kw118$ID, id ), link_body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 19049L)
  public static SubLObject new_window_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    link_body = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list119 );
    current = current.rest();
    final SubLObject options = current.isCons() ? current.first() : $str120$;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list119 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject frame_name_var = $sym121$FRAME_NAME_VAR;
      return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym122$FWHEN, target, ConsesLow.list( $sym99$CB_FRAME_NAME, target ) ) ) ), ConsesLow.list(
          $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$TARGET, frame_name_var, $kw110$HREF, ConsesLow.list( $sym92$CYC_CGI_URL, url_body ), $kw123$ONCLICK, ConsesLow.listS( $sym87$PROGN, new SubLObject[]
          { $list124, ConsesLow.list( $sym92$CYC_CGI_URL, url_body ), $list125, ConsesLow.listS( $sym126$PIF, target, ConsesLow.list( $sym127$HTML_FORMAT, $str128$__A_, target ), $list129 ), ConsesLow.list(
              $sym127$HTML_FORMAT, $str130$___A____, options ), $list131
          } ) ), link_body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list119 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 19883L)
  public static SubLObject new_external_window_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    link_body = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list119 );
    current = current.rest();
    final SubLObject options = current.isCons() ? current.first() : $str120$;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list119 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject frame_name_var = $sym132$FRAME_NAME_VAR;
      return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym122$FWHEN, target, ConsesLow.list( $sym99$CB_FRAME_NAME, target ) ) ) ), ConsesLow.list(
          $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$TARGET, frame_name_var, $kw110$HREF, url_body, $kw123$ONCLICK, ConsesLow.listS( $sym87$PROGN, new SubLObject[]
          { $list124, url_body, $list125, ConsesLow.listS( $sym126$PIF, target, ConsesLow.list( $sym127$HTML_FORMAT, $str128$__A_, target ), $list129 ), ConsesLow.list( $sym127$HTML_FORMAT, $str130$___A____, options ),
            $list131
          } ) ), link_body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list119 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 20697L)
  public static SubLObject frame_link_hoverover(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
    link_body = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : $kw62$MAIN;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list133 );
    current = current.rest();
    final SubLObject hoverover_html = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list133 );
    current = current.rest();
    final SubLObject caption = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list133 );
    current = current.rest();
    final SubLObject width = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list133 );
    current = current.rest();
    final SubLObject sticky = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list133 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject frame_name_var = $sym134$FRAME_NAME_VAR;
      return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym99$CB_FRAME_NAME, target ) ) ), $list135, ConsesLow.list( $sym136$HTML_HOVEROVER_ANCHOR, ConsesLow.list(
          new SubLObject[]
          { $kw108$TARGET, frame_name_var, $kw110$HREF, ConsesLow.list( $sym92$CYC_CGI_URL, url_body ), $kw137$HOVEROVER_HTML, hoverover_html, $kw138$CAPTION, caption, $kw139$WIDTH, width, $kw140$STICKY, sticky
          } ), link_body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list133 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 21183L)
  public static SubLObject define_cb_link_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject link_type = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
    link_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject type_name = Symbols.symbol_name( link_type );
    final SubLObject method_func_name = PrintLow.format( NIL, $str142$CB_LINK__A, type_name );
    final SubLObject method_func = Packages.intern( method_func_name, UNPROVIDED );
    final SubLObject max_args = list_utilities.function_arglist_max_args( arglist );
    return ConsesLow.list( $sym87$PROGN, ConsesLow.listS( $sym143$DEFINE, method_func, arglist, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym144$SETUP_CB_LINK_METHOD, link_type, ConsesLow.list( $sym145$QUOTE,
        method_func ), ConsesLow.list( $sym145$QUOTE, max_args ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 21576L)
  public static SubLObject cb_tool_frame_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tool_link_type = NIL;
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    tool_link_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    link_body = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : $kw62$MAIN;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list146 );
    current = current.rest();
    final SubLObject title = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list146 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym114$FRAME_LINK, url_body, ConsesLow.list( $sym87$PROGN, ConsesLow.list( $sym147$PWHEN_FEATURE, $kw148$CYC_OPENCYC, ConsesLow.listS( $sym149$PWHEN, ConsesLow.list( $sym150$CB_ICON_EXISTS_,
          tool_link_type ), ConsesLow.list( $sym151$CB_ICON, tool_link_type ), $list152 ) ), link_body ), target, title );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list146 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 21978L)
  public static SubLObject cb_clet_assertion_link_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject hook = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    hook = current.first();
    current = current.rest();
    final SubLObject include_mtP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list153 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym98$CLET, reader.bq_cons( ConsesLow.list( var, ConsesLow.list( $sym154$FIF, ConsesLow.list( $sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook ), ConsesLow.listS( $sym154$FIF, include_mtP,
          $list156 ), ConsesLow.listS( $sym154$FIF, include_mtP, $list157 ) ) ), $list158 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list153 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 22830L)
  public static SubLObject cb_clet_assertion_link_binary_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject hook = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
    hook = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym98$CLET, reader.bq_cons( ConsesLow.list( var, ConsesLow.listS( $sym154$FIF, ConsesLow.list( $sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook ), $list160 ) ), $list158 ), ConsesLow.append(
          body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list159 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 23376L)
  public static SubLObject cb_simple_main_document(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list161 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list161 );
    title = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list161 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list161 );
      if( NIL == conses_high.member( current_$2, $list162, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw74$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list161 );
    }
    final SubLObject completionP_tail = cdestructuring_bind.property_list_member( $kw163$COMPLETION_, current );
    final SubLObject completionP = ( NIL != completionP_tail ) ? conses_high.cadr( completionP_tail ) : NIL;
    final SubLObject passwordP_tail = cdestructuring_bind.property_list_member( $kw164$PASSWORD_, current );
    final SubLObject passwordP = ( NIL != passwordP_tail ) ? conses_high.cadr( passwordP_tail ) : NIL;
    final SubLObject dhtmlP_tail = cdestructuring_bind.property_list_member( $kw165$DHTML_, current );
    final SubLObject dhtmlP = ( NIL != dhtmlP_tail ) ? conses_high.cadr( dhtmlP_tail ) : NIL;
    final SubLObject help_tail = cdestructuring_bind.property_list_member( $kw166$HELP, current );
    final SubLObject help = ( NIL != help_tail ) ? conses_high.cadr( help_tail ) : NIL;
    final SubLObject color_tail = cdestructuring_bind.property_list_member( $kw167$COLOR, current );
    final SubLObject color = ( NIL != color_tail ) ? conses_high.cadr( color_tail ) : $sym168$_HTML_DEFAULT_BGCOLOR_;
    final SubLObject show_copyright_tail = cdestructuring_bind.property_list_member( $kw169$SHOW_COPYRIGHT, current );
    final SubLObject show_copyright = ( NIL != show_copyright_tail ) ? conses_high.cadr( show_copyright_tail ) : T;
    final SubLObject omit_headingP_tail = cdestructuring_bind.property_list_member( $kw170$OMIT_HEADING_, current );
    final SubLObject omit_headingP = ( NIL != omit_headingP_tail ) ? conses_high.cadr( omit_headingP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject title_var = $sym171$TITLE_VAR;
    return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( title_var, title ) ), ConsesLow.list( $sym172$WITH_HTML_ID_SPACE, ConsesLow.list( $sym173$HTML_DOCUMENT, ConsesLow.list( $sym85$CB_HEAD, $list174,
        ConsesLow.list( $sym149$PWHEN, title_var, ConsesLow.list( $sym175$HTML_TITLE, ConsesLow.list( $sym176$HTML_PRINC, title_var ) ) ), ConsesLow.listS( $sym149$PWHEN, completionP, $list177 ), ConsesLow.listS(
            $sym149$PWHEN, passwordP, $list178 ), ConsesLow.listS( $sym149$PWHEN, dhtmlP, $list179 ) ), ConsesLow.listS( $sym180$HTML_FANCY_BODY, ConsesLow.list( $kw181$BACKGROUND_COLOR, color, $kw111$CLASS,
                html_macros.$basic_skin_class$.getGlobalValue(), $kw169$SHOW_COPYRIGHT, show_copyright ), $list182, ConsesLow.list( $sym149$PWHEN, ConsesLow.list( $sym183$CAND, title_var, ConsesLow.list( $sym184$CNOT,
                    omit_headingP ) ), ConsesLow.list( $sym185$HTML_HEADING, $list186, ConsesLow.listS( $sym149$PWHEN, help, ConsesLow.list( $sym187$CB_HELP_PREAMBLE, help ), $list188 ), ConsesLow.list(
                        $sym176$HTML_PRINC, title_var ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 24678L)
  public static SubLObject cb_c_content_page(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list189 );
    index = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return reader.bq_cons( $sym87$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 24825L)
  public static SubLObject cb_simple_c_content_document(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list190 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject index = NIL;
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list190 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list190 );
    title = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list190 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list190 );
      if( NIL == conses_high.member( current_$3, $list191, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw74$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list190 );
    }
    final SubLObject completionP_tail = cdestructuring_bind.property_list_member( $kw163$COMPLETION_, current );
    final SubLObject completionP = ( NIL != completionP_tail ) ? conses_high.cadr( completionP_tail ) : NIL;
    final SubLObject dhtmlP_tail = cdestructuring_bind.property_list_member( $kw165$DHTML_, current );
    final SubLObject dhtmlP = ( NIL != dhtmlP_tail ) ? conses_high.cadr( dhtmlP_tail ) : NIL;
    final SubLObject color_tail = cdestructuring_bind.property_list_member( $kw167$COLOR, current );
    final SubLObject color = ( NIL != color_tail ) ? conses_high.cadr( color_tail ) : $sym168$_HTML_DEFAULT_BGCOLOR_;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != $cb_c_suppress_body_level_elements$.getDynamicValue( thread ) )
    {
      return ConsesLow.listS( $sym98$CLET, NIL, ConsesLow.append( body, NIL ) );
    }
    final SubLObject title_var = $sym192$TITLE_VAR;
    return ConsesLow.list( $sym98$CLET, ConsesLow.list( ConsesLow.list( title_var, title ) ), ConsesLow.list( $sym172$WITH_HTML_ID_SPACE, ConsesLow.list( $sym173$HTML_DOCUMENT, ConsesLow.list( $sym85$CB_HEAD, ConsesLow
        .list( $sym149$PWHEN, title_var, ConsesLow.list( $sym175$HTML_TITLE, ConsesLow.list( $sym176$HTML_PRINC, title_var ) ) ), $list174, ConsesLow.listS( $sym149$PWHEN, completionP, $list193 ), ConsesLow.listS(
            $sym149$PWHEN, dhtmlP, $list194 ) ), ConsesLow.list( $sym180$HTML_FANCY_BODY, ConsesLow.list( $kw181$BACKGROUND_COLOR, color, $kw111$CLASS, html_macros.$basic_skin_class$.getGlobalValue() ), $list195,
                ConsesLow.listS( $sym196$CB_C_CONTENT_PAGE, index, ConsesLow.append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 25715L)
  public static SubLObject cb_with_pph_assumptions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    if( NIL != Sequences.find( $kw197$CYC_PPH, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( $sym198$WITH_PPH_MEMOIZATION, ConsesLow.listS( $sym98$CLET, $list199, ConsesLow.append( body, NIL ) ) );
    }
    return reader.bq_cons( $sym87$PROGN, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_cb_parameters_file()
  {
    SubLFiles.declareFunction( me, "cb_editing_enabled_p", "CB-EDITING-ENABLED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_mts_filter_use_genlmt", "CB-MTS-FILTER-USE-GENLMT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_mts_filter_use_genlmt", "SET-CB-MTS-FILTER-USE-GENLMT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_ke_review_creators", "CB-USE-KE-REVIEW-CREATORS", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_ke_review_creators", "SET-CB-USE-KE-REVIEW-CREATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_ke_review_creators", "CB-KE-REVIEW-CREATORS", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_ke_review_creators", "SET-CB-KE-REVIEW-CREATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_glob_lookup", "CB-GLOB-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_glob_lookup_by_string", "CB-GLOB-LOOKUP-BY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_glob_id", "CB-GLOB-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_glob_remove", "CB-GLOB-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_glob_remove_id", "CB-GLOB-REMOVE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_glob_reset", "CB-GLOB-RESET", 0, 0, false );
    SubLFiles.declareMacro( me, "do_cb_glob", "DO-CB-GLOB" );
    SubLFiles.declareFunction( me, "cb_glob_find_all_if", "CB-GLOB-FIND-ALL-IF", 1, 0, false );
    SubLFiles.declareMacro( me, "cb_head", "CB-HEAD" );
    SubLFiles.declareFunction( me, "cb_head_shortcut_icon", "CB-HEAD-SHORTCUT-ICON", 0, 0, false );
    SubLFiles.declareMacro( me, "cyc_cgi_url", "CYC-CGI-URL" );
    SubLFiles.declareFunction( me, "cyc_cgi_url_string", "CYC-CGI-URL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_cgi_url_int", "CYC-CGI-URL-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_cgi_relative_url", "CYC-CGI-RELATIVE-URL", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_cgi_absolute_cb_framed_url", "CYC-CGI-ABSOLUTE-CB-FRAMED-URL", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_cgi_kea_url", "CYC-CGI-KEA-URL", 0, 0, false );
    SubLFiles.declareMacro( me, "cb_basic_form", "CB-BASIC-FORM" );
    SubLFiles.declareMacro( me, "cb_basic_form_handler", "CB-BASIC-FORM-HANDLER" );
    SubLFiles.declareMacro( me, "frame_link", "FRAME-LINK" );
    SubLFiles.declareMacro( me, "page_link", "PAGE-LINK" );
    SubLFiles.declareMacro( me, "absolute_link", "ABSOLUTE-LINK" );
    SubLFiles.declareMacro( me, "new_window_link", "NEW-WINDOW-LINK" );
    SubLFiles.declareMacro( me, "new_external_window_link", "NEW-EXTERNAL-WINDOW-LINK" );
    SubLFiles.declareMacro( me, "frame_link_hoverover", "FRAME-LINK-HOVEROVER" );
    SubLFiles.declareMacro( me, "define_cb_link_method", "DEFINE-CB-LINK-METHOD" );
    SubLFiles.declareMacro( me, "cb_tool_frame_link", "CB-TOOL-FRAME-LINK" );
    SubLFiles.declareMacro( me, "cb_clet_assertion_link_fn", "CB-CLET-ASSERTION-LINK-FN" );
    SubLFiles.declareMacro( me, "cb_clet_assertion_link_binary_fn", "CB-CLET-ASSERTION-LINK-BINARY-FN" );
    SubLFiles.declareMacro( me, "cb_simple_main_document", "CB-SIMPLE-MAIN-DOCUMENT" );
    SubLFiles.declareMacro( me, "cb_c_content_page", "CB-C-CONTENT-PAGE" );
    SubLFiles.declareMacro( me, "cb_simple_c_content_document", "CB-SIMPLE-C-CONTENT-DOCUMENT" );
    SubLFiles.declareMacro( me, "cb_with_pph_assumptions", "CB-WITH-PPH-ASSUMPTIONS" );
    return NIL;
  }

  public static SubLObject init_cb_parameters_file()
  {
    $transcript_file_shorthand$ = SubLFiles.defparameter( "*TRANSCRIPT-FILE-SHORTHAND*", $list0 );
    $cb_include_help$ = SubLFiles.defparameter( "*CB-INCLUDE-HELP*", T );
    $cb_include_inference_helpP$ = SubLFiles.defparameter( "*CB-INCLUDE-INFERENCE-HELP?*", T );
    $cb_c_default_content$ = SubLFiles.defparameter( "*CB-C-DEFAULT-CONTENT*", $kw3$MAXIMAL );
    $cb_c_maximal_upper_bound$ = SubLFiles.defparameter( "*CB-C-MAXIMAL-UPPER-BOUND*", $int5$30 );
    $cb_c_assertion_formulas_display$ = SubLFiles.defparameter( "*CB-C-ASSERTION-FORMULAS-DISPLAY*", $kw7$HL_FORMULAS );
    $cb_constant_history_max$ = SubLFiles.defparameter( "*CB-CONSTANT-HISTORY-MAX*", NIL );
    $cb_use_categorized_historyP$ = SubLFiles.defparameter( "*CB-USE-CATEGORIZED-HISTORY?*", T );
    $cb_constant_history_chronological_max$ = SubLFiles.defparameter( "*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*", FIFTEEN_INTEGER );
    $cb_constant_history$ = SubLFiles.defparameter( "*CB-CONSTANT-HISTORY*", NIL );
    $cb_nat_history_max$ = SubLFiles.defparameter( "*CB-NAT-HISTORY-MAX*", NIL );
    $cb_nat_history$ = SubLFiles.defparameter( "*CB-NAT-HISTORY*", NIL );
    $cb_assertion_history_max$ = SubLFiles.defparameter( "*CB-ASSERTION-HISTORY-MAX*", NIL );
    $cb_assertion_history$ = SubLFiles.defparameter( "*CB-ASSERTION-HISTORY*", NIL );
    $cb_sentence_history_max$ = SubLFiles.defparameter( "*CB-SENTENCE-HISTORY-MAX*", NIL );
    $cb_sentence_history$ = SubLFiles.defparameter( "*CB-SENTENCE-HISTORY*", NIL );
    $cb_history_show_el_formulasP$ = SubLFiles.defparameter( "*CB-HISTORY-SHOW-EL-FORMULAS?*", NIL );
    $cb_status_update_interval$ = SubLFiles.defparameter( "*CB-STATUS-UPDATE-INTERVAL*", NIL );
    $cb_destroy_all_inferences_but_last_n_default$ = SubLFiles.deflexical( "*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N-DEFAULT*", TEN_INTEGER );
    $cb_destroy_all_inferences_but_last_n$ = SubLFiles.defparameter( "*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*", $cb_destroy_all_inferences_but_last_n_default$.getGlobalValue() );
    $cb_perform_argumentation_for_closed_queryP$ = SubLFiles.defparameter( "*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*", NIL );
    $cb_c_wrap_assertions$ = SubLFiles.defparameter( "*CB-C-WRAP-ASSERTIONS*", T );
    $cb_a_show_el_formula$ = SubLFiles.defparameter( "*CB-A-SHOW-EL-FORMULA*", NIL );
    $cb_a_show_hl_formula$ = SubLFiles.defparameter( "*CB-A-SHOW-HL-FORMULA*", T );
    $cb_a_edit_preserve_meta_assertions_by_defaultP$ = SubLFiles.defparameter( "*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*", T );
    $cb_a_change_all_meta_assertions_mt_by_defaultP$ = SubLFiles.defparameter( "*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*", NIL );
    $cb_a_perform_access_diagnostics$ = SubLFiles.defparameter( "*CB-A-PERFORM-ACCESS-DIAGNOSTICS*", NIL );
    $cb_a_show_english$ = SubLFiles.defparameter( "*CB-A-SHOW-ENGLISH*", NIL );
    $cb_wrap_interactor$ = SubLFiles.defparameter( "*CB-WRAP-INTERACTOR*", NIL );
    $cb_a_show_newlines_in_string_args$ = SubLFiles.defparameter( "*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*", T );
    $cb_use_gke_to_edit_el_sentences$ = SubLFiles.defparameter( "*CB-USE-GKE-TO-EDIT-EL-SENTENCES*", NIL );
    $cb_use_dynamic_table_for_inference_results$ = SubLFiles.defparameter( "*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*", T );
    $cb_show_cyclify_button$ = SubLFiles.defparameter( "*CB-SHOW-CYCLIFY-BUTTON*", T );
    $cb_enable_inference_monitoring$ = SubLFiles.defparameter( "*CB-ENABLE-INFERENCE-MONITORING*", NIL );
    $cb_assert_queue_default$ = SubLFiles.defparameter( "*CB-ASSERT-QUEUE-DEFAULT*", $kw36$LOCAL );
    $cb_separate_assertion_frame$ = SubLFiles.defparameter( "*CB-SEPARATE-ASSERTION-FRAME*", NIL );
    $cb_user_toolbar_links$ = SubLFiles.defparameter( "*CB-USER-TOOLBAR-LINKS*", red_infrastructure_macros.red_def_helper( $list39.isSymbol() ? Symbols.symbol_value( $list39 ) : $list39, $sym40$_CB_USER_TOOLBAR_LINKS_,
        $list41.isSymbol() ? Symbols.symbol_value( $list41 ) : $list41, $kw42$PARAMETER, UNPROVIDED ) );
    $cb_separate_doc_frame$ = SubLFiles.defparameter( "*CB-SEPARATE-DOC-FRAME*", NIL );
    $cb_more_assertion_marker_image_text$ = SubLFiles.defparameter( "*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*", NIL );
    $cb_ke_text_mode$ = SubLFiles.defparameter( "*CB-KE-TEXT-MODE*", NIL );
    $cb_fastP$ = SubLFiles.defparameter( "*CB-FAST?*", NIL );
    $cb_max_assertions_non_collapsed$ = SubLFiles.defparameter( "*CB-MAX-ASSERTIONS-NON-COLLAPSED*", $int47$50 );
    $cb_default_mt$ = SubLFiles.defparameter( "*CB-DEFAULT-MT*", $const49$BaseKB );
    $cb_editing_enabled$ = SubLFiles.defparameter( "*CB-EDITING-ENABLED*", T );
    $cb_js_sentence_editor_enabled$ = SubLFiles.defparameter( "*CB-JS-SENTENCE-EDITOR-ENABLED*", NIL );
    $show_kb_monitor_links$ = SubLFiles.defparameter( "*SHOW-KB-MONITOR-LINKS*", T );
    $cb_confirm_kills$ = SubLFiles.defparameter( "*CB-CONFIRM-KILLS*", T );
    $cb_assertion_indexical$ = SubLFiles.deflexical( "*CB-ASSERTION-INDEXICAL*", $const55$TheAssertionSentence );
    $cb_specify_show_gloss$ = SubLFiles.defparameter( "*CB-SPECIFY-SHOW-GLOSS*", $sym56$NONE );
    $cb_lucky_term_searchP$ = SubLFiles.defparameter( "*CB-LUCKY-TERM-SEARCH?*", NIL );
    $cb_mts_filter_use_genlmt$ = SubLFiles.defparameter( "*CB-MTS-FILTER-USE-GENLMT*", T );
    $cb_use_ke_review_creators$ = SubLFiles.defparameter( "*CB-USE-KE-REVIEW-CREATORS*", NIL );
    $cb_ke_review_creators$ = SubLFiles.defparameter( "*CB-KE-REVIEW-CREATORS*", NIL );
    $cb_c_suppress_body_level_elements$ = SubLFiles.defparameter( "*CB-C-SUPPRESS-BODY-LEVEL-ELEMENTS*", NIL );
    $cb_c_gaf_arg_last_mt$ = SubLFiles.defparameter( "*CB-C-GAF-ARG-LAST-MT*", NIL );
    $cb_c_gaf_arg_use_binary$ = SubLFiles.defparameter( "*CB-C-GAF-ARG-USE-BINARY*", T );
    $cb_c_nart_arg_use_binary$ = SubLFiles.defparameter( "*CB-C-NART-ARG-USE-BINARY*", T );
    $cb_c_formula_display_exception_index_hook$ = SubLFiles.defparameter( "*CB-C-FORMULA-DISPLAY-EXCEPTION-INDEX-HOOK*", NIL );
    $cb_show_el_assertion_readably_last_formula$ = SubLFiles.defparameter( "*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*", NIL );
    $cb_show_el_assertion_readably_last_mt$ = SubLFiles.defparameter( "*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*", NIL );
    $cb_assertion_el_formula_cache$ = SubLFiles.defparameter( "*CB-ASSERTION-EL-FORMULA-CACHE*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $cb_default_term_frame$ = SubLFiles.defparameter( "*CB-DEFAULT-TERM-FRAME*", $kw62$MAIN );
    $cb_default_assertion_frame$ = SubLFiles.defparameter( "*CB-DEFAULT-ASSERTION-FRAME*", $kw62$MAIN );
    $cb_assertion_link_hook$ = SubLFiles.defparameter( "*CB-ASSERTION-LINK-HOOK*", NIL );
    $cb_constant_input_width$ = SubLFiles.defparameter( "*CB-CONSTANT-INPUT-WIDTH*", $int63$40 );
    $cb_hlmt_input_width$ = SubLFiles.defparameter( "*CB-HLMT-INPUT-WIDTH*", $int47$50 );
    $cb_nonreviewable_assertion_markers$ = SubLFiles.defparameter( "*CB-NONREVIEWABLE-ASSERTION-MARKERS*", $list64 );
    $cb_ke_review_start_date$ = SubLFiles.defparameter( "*CB-KE-REVIEW-START-DATE*", $int65$19990921 );
    $cb_ke_review_end_date$ = SubLFiles.defparameter( "*CB-KE-REVIEW-END-DATE*", $int67$29991231 );
    $cb_viewpoint_show_doc_preds$ = SubLFiles.defparameter( "*CB-VIEWPOINT-SHOW-DOC-PREDS*", T );
    $cb_viewpoint_show_book_preds$ = SubLFiles.defparameter( "*CB-VIEWPOINT-SHOW-BOOK-PREDS*", T );
    $cb_permit_robots_to_followP$ = SubLFiles.defparameter( "*CB-PERMIT-ROBOTS-TO-FOLLOW?*", NIL );
    $cb_permit_robots_to_indexP$ = SubLFiles.defparameter( "*CB-PERMIT-ROBOTS-TO-INDEX?*", NIL );
    $cb_glob$ = SubLFiles.defparameter( "*CB-GLOB*", NIL );
    $cb_form_url_prefix_print$ = SubLFiles.defparameter( "*CB-FORM-URL-PREFIX-PRINT*", $sym90$CYC_CGI_RELATIVE_URL );
    return NIL;
  }

  public static SubLObject setup_cb_parameters_file()
  {
    utilities_macros.register_html_state_variable( $sym1$_CB_INCLUDE_HELP_ );
    utilities_macros.register_html_state_variable( $sym2$_CB_INCLUDE_INFERENCE_HELP__ );
    utilities_macros.register_html_state_variable( $sym4$_CB_C_DEFAULT_CONTENT_ );
    utilities_macros.register_html_interface_variable( $sym4$_CB_C_DEFAULT_CONTENT_ );
    utilities_macros.register_html_state_variable( $sym6$_CB_C_MAXIMAL_UPPER_BOUND_ );
    utilities_macros.register_html_interface_variable( $sym6$_CB_C_MAXIMAL_UPPER_BOUND_ );
    utilities_macros.register_html_state_variable( $sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_ );
    utilities_macros.register_html_interface_variable( $sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_ );
    utilities_macros.register_html_state_variable( $sym9$_CB_CONSTANT_HISTORY_MAX_ );
    utilities_macros.register_html_interface_variable( $sym9$_CB_CONSTANT_HISTORY_MAX_ );
    utilities_macros.register_html_state_variable( $sym10$_CB_USE_CATEGORIZED_HISTORY__ );
    utilities_macros.register_html_interface_variable( $sym10$_CB_USE_CATEGORIZED_HISTORY__ );
    utilities_macros.register_html_state_variable( $sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_ );
    utilities_macros.register_html_interface_variable( $sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_ );
    utilities_macros.register_html_state_variable( $sym12$_CB_CONSTANT_HISTORY_ );
    utilities_macros.register_html_interface_variable( $sym12$_CB_CONSTANT_HISTORY_ );
    utilities_macros.register_html_state_variable( $sym13$_CB_NAT_HISTORY_MAX_ );
    utilities_macros.register_html_interface_variable( $sym13$_CB_NAT_HISTORY_MAX_ );
    utilities_macros.register_html_state_variable( $sym14$_CB_NAT_HISTORY_ );
    utilities_macros.register_html_interface_variable( $sym14$_CB_NAT_HISTORY_ );
    utilities_macros.register_html_state_variable( $sym15$_CB_ASSERTION_HISTORY_MAX_ );
    utilities_macros.register_html_interface_variable( $sym15$_CB_ASSERTION_HISTORY_MAX_ );
    utilities_macros.register_html_state_variable( $sym16$_CB_ASSERTION_HISTORY_ );
    utilities_macros.register_html_state_variable( $sym17$_CB_SENTENCE_HISTORY_MAX_ );
    utilities_macros.register_html_interface_variable( $sym17$_CB_SENTENCE_HISTORY_MAX_ );
    utilities_macros.register_html_state_variable( $sym18$_CB_SENTENCE_HISTORY_ );
    utilities_macros.register_html_state_variable( $sym19$_CB_HISTORY_SHOW_EL_FORMULAS__ );
    utilities_macros.register_html_interface_variable( $sym19$_CB_HISTORY_SHOW_EL_FORMULAS__ );
    utilities_macros.register_html_state_variable( $sym20$_CB_STATUS_UPDATE_INTERVAL_ );
    utilities_macros.register_html_interface_variable( $sym20$_CB_STATUS_UPDATE_INTERVAL_ );
    utilities_macros.register_html_state_variable( $sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_ );
    utilities_macros.register_html_interface_variable( $sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_ );
    utilities_macros.register_html_state_variable( $sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__ );
    utilities_macros.register_html_interface_variable( $sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__ );
    utilities_macros.register_html_state_variable( $sym23$_CB_C_WRAP_ASSERTIONS_ );
    utilities_macros.register_html_interface_variable( $sym23$_CB_C_WRAP_ASSERTIONS_ );
    utilities_macros.register_html_state_variable( $sym24$_CB_A_SHOW_EL_FORMULA_ );
    utilities_macros.register_html_interface_variable( $sym24$_CB_A_SHOW_EL_FORMULA_ );
    utilities_macros.register_html_state_variable( $sym25$_CB_A_SHOW_HL_FORMULA_ );
    utilities_macros.register_html_interface_variable( $sym25$_CB_A_SHOW_HL_FORMULA_ );
    utilities_macros.register_html_state_variable( $sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ );
    utilities_macros.register_html_interface_variable( $sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ );
    utilities_macros.register_html_state_variable( $sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ );
    utilities_macros.register_html_interface_variable( $sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ );
    utilities_macros.register_html_state_variable( $sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ );
    utilities_macros.register_html_interface_variable( $sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ );
    utilities_macros.register_html_state_variable( $sym29$_CB_A_SHOW_ENGLISH_ );
    utilities_macros.register_html_interface_variable( $sym29$_CB_A_SHOW_ENGLISH_ );
    utilities_macros.register_html_state_variable( $sym30$_CB_WRAP_INTERACTOR_ );
    utilities_macros.register_html_interface_variable( $sym30$_CB_WRAP_INTERACTOR_ );
    utilities_macros.register_html_state_variable( $sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_ );
    utilities_macros.register_html_interface_variable( $sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_ );
    utilities_macros.register_html_state_variable( $sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_ );
    utilities_macros.register_html_interface_variable( $sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_ );
    utilities_macros.register_html_state_variable( $sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ );
    utilities_macros.register_html_interface_variable( $sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ );
    utilities_macros.register_html_state_variable( $sym34$_CB_SHOW_CYCLIFY_BUTTON_ );
    utilities_macros.register_html_interface_variable( $sym34$_CB_SHOW_CYCLIFY_BUTTON_ );
    utilities_macros.register_html_state_variable( $sym35$_CB_ENABLE_INFERENCE_MONITORING_ );
    utilities_macros.register_html_interface_variable( $sym35$_CB_ENABLE_INFERENCE_MONITORING_ );
    utilities_macros.register_html_state_variable( $sym37$_CB_ASSERT_QUEUE_DEFAULT_ );
    utilities_macros.register_html_interface_variable( $sym37$_CB_ASSERT_QUEUE_DEFAULT_ );
    utilities_macros.register_html_state_variable( $sym38$_CB_SEPARATE_ASSERTION_FRAME_ );
    utilities_macros.register_html_state_variable( $sym40$_CB_USER_TOOLBAR_LINKS_ );
    utilities_macros.register_html_interface_variable( $sym40$_CB_USER_TOOLBAR_LINKS_ );
    utilities_macros.register_html_state_variable( $sym43$_CB_SEPARATE_DOC_FRAME_ );
    utilities_macros.register_html_interface_variable( $sym43$_CB_SEPARATE_DOC_FRAME_ );
    utilities_macros.register_html_state_variable( $sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ );
    utilities_macros.register_html_interface_variable( $sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ );
    utilities_macros.register_html_state_variable( $sym45$_CB_KE_TEXT_MODE_ );
    utilities_macros.register_html_interface_variable( $sym45$_CB_KE_TEXT_MODE_ );
    utilities_macros.register_html_state_variable( $sym46$_CB_FAST__ );
    utilities_macros.register_html_interface_variable( $sym46$_CB_FAST__ );
    utilities_macros.register_html_state_variable( $sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_ );
    utilities_macros.register_html_interface_variable( $sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_ );
    utilities_macros.register_html_state_variable( $sym50$_CB_DEFAULT_MT_ );
    utilities_macros.register_html_interface_variable( $sym50$_CB_DEFAULT_MT_ );
    mt_vars.note_mt_var( $sym50$_CB_DEFAULT_MT_, UNPROVIDED );
    utilities_macros.register_html_state_variable( $sym51$_CB_EDITING_ENABLED_ );
    utilities_macros.register_html_state_variable( $sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_ );
    utilities_macros.register_html_interface_variable( $sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_ );
    utilities_macros.register_html_state_variable( $sym53$_SHOW_KB_MONITOR_LINKS_ );
    utilities_macros.register_html_state_variable( $sym54$_CB_CONFIRM_KILLS_ );
    utilities_macros.register_html_state_variable( $sym57$_CB_SPECIFY_SHOW_GLOSS_ );
    utilities_macros.register_html_state_variable( $sym58$_CB_LUCKY_TERM_SEARCH__ );
    utilities_macros.register_html_state_variable( $sym59$_CB_MTS_FILTER_USE_GENLMT_ );
    utilities_macros.register_html_state_variable( $sym60$_CB_USE_KE_REVIEW_CREATORS_ );
    utilities_macros.register_html_state_variable( $sym61$_CB_KE_REVIEW_CREATORS_ );
    utilities_macros.register_html_state_variable( $sym66$_CB_KE_REVIEW_START_DATE_ );
    utilities_macros.register_html_state_variable( $sym68$_CB_KE_REVIEW_END_DATE_ );
    utilities_macros.register_html_state_variable( $sym69$_CB_VIEWPOINT_SHOW_DOC_PREDS_ );
    utilities_macros.register_html_state_variable( $sym70$_CB_VIEWPOINT_SHOW_BOOK_PREDS_ );
    utilities_macros.register_html_state_variable( $sym71$_CB_GLOB_ );
    Hashtables.sethash( $kw82$MINI_LOGO, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str83$mini_logo_gif, NIL ) );
    access_macros.register_macro_helper( $sym84$CB_HEAD_SHORTCUT_ICON, $sym85$CB_HEAD );
    access_macros.register_macro_helper( $sym91$CYC_CGI_URL_INT, $sym92$CYC_CGI_URL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_parameters_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_parameters_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_parameters_file();
  }
  static
  {
    me = new cb_parameters();
    $transcript_file_shorthand$ = null;
    $cb_include_help$ = null;
    $cb_include_inference_helpP$ = null;
    $cb_c_default_content$ = null;
    $cb_c_maximal_upper_bound$ = null;
    $cb_c_assertion_formulas_display$ = null;
    $cb_constant_history_max$ = null;
    $cb_use_categorized_historyP$ = null;
    $cb_constant_history_chronological_max$ = null;
    $cb_constant_history$ = null;
    $cb_nat_history_max$ = null;
    $cb_nat_history$ = null;
    $cb_assertion_history_max$ = null;
    $cb_assertion_history$ = null;
    $cb_sentence_history_max$ = null;
    $cb_sentence_history$ = null;
    $cb_history_show_el_formulasP$ = null;
    $cb_status_update_interval$ = null;
    $cb_destroy_all_inferences_but_last_n_default$ = null;
    $cb_destroy_all_inferences_but_last_n$ = null;
    $cb_perform_argumentation_for_closed_queryP$ = null;
    $cb_c_wrap_assertions$ = null;
    $cb_a_show_el_formula$ = null;
    $cb_a_show_hl_formula$ = null;
    $cb_a_edit_preserve_meta_assertions_by_defaultP$ = null;
    $cb_a_change_all_meta_assertions_mt_by_defaultP$ = null;
    $cb_a_perform_access_diagnostics$ = null;
    $cb_a_show_english$ = null;
    $cb_wrap_interactor$ = null;
    $cb_a_show_newlines_in_string_args$ = null;
    $cb_use_gke_to_edit_el_sentences$ = null;
    $cb_use_dynamic_table_for_inference_results$ = null;
    $cb_show_cyclify_button$ = null;
    $cb_enable_inference_monitoring$ = null;
    $cb_assert_queue_default$ = null;
    $cb_separate_assertion_frame$ = null;
    $cb_user_toolbar_links$ = null;
    $cb_separate_doc_frame$ = null;
    $cb_more_assertion_marker_image_text$ = null;
    $cb_ke_text_mode$ = null;
    $cb_fastP$ = null;
    $cb_max_assertions_non_collapsed$ = null;
    $cb_default_mt$ = null;
    $cb_editing_enabled$ = null;
    $cb_js_sentence_editor_enabled$ = null;
    $show_kb_monitor_links$ = null;
    $cb_confirm_kills$ = null;
    $cb_assertion_indexical$ = null;
    $cb_specify_show_gloss$ = null;
    $cb_lucky_term_searchP$ = null;
    $cb_mts_filter_use_genlmt$ = null;
    $cb_use_ke_review_creators$ = null;
    $cb_ke_review_creators$ = null;
    $cb_c_suppress_body_level_elements$ = null;
    $cb_c_gaf_arg_last_mt$ = null;
    $cb_c_gaf_arg_use_binary$ = null;
    $cb_c_nart_arg_use_binary$ = null;
    $cb_c_formula_display_exception_index_hook$ = null;
    $cb_show_el_assertion_readably_last_formula$ = null;
    $cb_show_el_assertion_readably_last_mt$ = null;
    $cb_assertion_el_formula_cache$ = null;
    $cb_default_term_frame$ = null;
    $cb_default_assertion_frame$ = null;
    $cb_assertion_link_hook$ = null;
    $cb_constant_input_width$ = null;
    $cb_hlmt_input_width$ = null;
    $cb_nonreviewable_assertion_markers$ = null;
    $cb_ke_review_start_date$ = null;
    $cb_ke_review_end_date$ = null;
    $cb_viewpoint_show_doc_preds$ = null;
    $cb_viewpoint_show_book_preds$ = null;
    $cb_permit_robots_to_followP$ = null;
    $cb_permit_robots_to_indexP$ = null;
    $cb_glob$ = null;
    $cb_form_url_prefix_print$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeString( "read" ), ConsesLow.list( makeSymbol( "READ-TRANSCRIPT" ) ) ), ConsesLow.list( makeString( "write" ), ConsesLow.list( makeSymbol( "LOCAL-TRANSCRIPT" ) ) ),
        ConsesLow.list( makeString( "local" ), ConsesLow.list( makeSymbol( "LOCAL-TRANSCRIPT" ) ) ), ConsesLow.list( makeString( "master" ), ConsesLow.list( makeSymbol( "MASTER-TRANSCRIPT" ) ) ) );
    $sym1$_CB_INCLUDE_HELP_ = makeSymbol( "*CB-INCLUDE-HELP*" );
    $sym2$_CB_INCLUDE_INFERENCE_HELP__ = makeSymbol( "*CB-INCLUDE-INFERENCE-HELP?*" );
    $kw3$MAXIMAL = makeKeyword( "MAXIMAL" );
    $sym4$_CB_C_DEFAULT_CONTENT_ = makeSymbol( "*CB-C-DEFAULT-CONTENT*" );
    $int5$30 = makeInteger( 30 );
    $sym6$_CB_C_MAXIMAL_UPPER_BOUND_ = makeSymbol( "*CB-C-MAXIMAL-UPPER-BOUND*" );
    $kw7$HL_FORMULAS = makeKeyword( "HL-FORMULAS" );
    $sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_ = makeSymbol( "*CB-C-ASSERTION-FORMULAS-DISPLAY*" );
    $sym9$_CB_CONSTANT_HISTORY_MAX_ = makeSymbol( "*CB-CONSTANT-HISTORY-MAX*" );
    $sym10$_CB_USE_CATEGORIZED_HISTORY__ = makeSymbol( "*CB-USE-CATEGORIZED-HISTORY?*" );
    $sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_ = makeSymbol( "*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*" );
    $sym12$_CB_CONSTANT_HISTORY_ = makeSymbol( "*CB-CONSTANT-HISTORY*" );
    $sym13$_CB_NAT_HISTORY_MAX_ = makeSymbol( "*CB-NAT-HISTORY-MAX*" );
    $sym14$_CB_NAT_HISTORY_ = makeSymbol( "*CB-NAT-HISTORY*" );
    $sym15$_CB_ASSERTION_HISTORY_MAX_ = makeSymbol( "*CB-ASSERTION-HISTORY-MAX*" );
    $sym16$_CB_ASSERTION_HISTORY_ = makeSymbol( "*CB-ASSERTION-HISTORY*" );
    $sym17$_CB_SENTENCE_HISTORY_MAX_ = makeSymbol( "*CB-SENTENCE-HISTORY-MAX*" );
    $sym18$_CB_SENTENCE_HISTORY_ = makeSymbol( "*CB-SENTENCE-HISTORY*" );
    $sym19$_CB_HISTORY_SHOW_EL_FORMULAS__ = makeSymbol( "*CB-HISTORY-SHOW-EL-FORMULAS?*" );
    $sym20$_CB_STATUS_UPDATE_INTERVAL_ = makeSymbol( "*CB-STATUS-UPDATE-INTERVAL*" );
    $sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_ = makeSymbol( "*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*" );
    $sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__ = makeSymbol( "*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*" );
    $sym23$_CB_C_WRAP_ASSERTIONS_ = makeSymbol( "*CB-C-WRAP-ASSERTIONS*" );
    $sym24$_CB_A_SHOW_EL_FORMULA_ = makeSymbol( "*CB-A-SHOW-EL-FORMULA*" );
    $sym25$_CB_A_SHOW_HL_FORMULA_ = makeSymbol( "*CB-A-SHOW-HL-FORMULA*" );
    $sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ = makeSymbol( "*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*" );
    $sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ = makeSymbol( "*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*" );
    $sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ = makeSymbol( "*CB-A-PERFORM-ACCESS-DIAGNOSTICS*" );
    $sym29$_CB_A_SHOW_ENGLISH_ = makeSymbol( "*CB-A-SHOW-ENGLISH*" );
    $sym30$_CB_WRAP_INTERACTOR_ = makeSymbol( "*CB-WRAP-INTERACTOR*" );
    $sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_ = makeSymbol( "*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*" );
    $sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_ = makeSymbol( "*CB-USE-GKE-TO-EDIT-EL-SENTENCES*" );
    $sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ = makeSymbol( "*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*" );
    $sym34$_CB_SHOW_CYCLIFY_BUTTON_ = makeSymbol( "*CB-SHOW-CYCLIFY-BUTTON*" );
    $sym35$_CB_ENABLE_INFERENCE_MONITORING_ = makeSymbol( "*CB-ENABLE-INFERENCE-MONITORING*" );
    $kw36$LOCAL = makeKeyword( "LOCAL" );
    $sym37$_CB_ASSERT_QUEUE_DEFAULT_ = makeSymbol( "*CB-ASSERT-QUEUE-DEFAULT*" );
    $sym38$_CB_SEPARATE_ASSERTION_FRAME_ = makeSymbol( "*CB-SEPARATE-ASSERTION-FRAME*" );
    $list39 = ConsesLow.list( makeString( "system.common.browser.tools.cb-user-toolbar-links" ) );
    $sym40$_CB_USER_TOOLBAR_LINKS_ = makeSymbol( "*CB-USER-TOOLBAR-LINKS*" );
    $list41 = ConsesLow.list( makeKeyword( "HISTORY" ), makeKeyword( "CREATE" ), makeKeyword( "ASSERT" ), makeKeyword( "COMPOSE" ), makeKeyword( "QUERY" ), makeKeyword( "DOC" ), makeKeyword( "NAVIGATOR" ), makeKeyword(
        "OPTIONS" ) );
    $kw42$PARAMETER = makeKeyword( "PARAMETER" );
    $sym43$_CB_SEPARATE_DOC_FRAME_ = makeSymbol( "*CB-SEPARATE-DOC-FRAME*" );
    $sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ = makeSymbol( "*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*" );
    $sym45$_CB_KE_TEXT_MODE_ = makeSymbol( "*CB-KE-TEXT-MODE*" );
    $sym46$_CB_FAST__ = makeSymbol( "*CB-FAST?*" );
    $int47$50 = makeInteger( 50 );
    $sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_ = makeSymbol( "*CB-MAX-ASSERTIONS-NON-COLLAPSED*" );
    $const49$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym50$_CB_DEFAULT_MT_ = makeSymbol( "*CB-DEFAULT-MT*" );
    $sym51$_CB_EDITING_ENABLED_ = makeSymbol( "*CB-EDITING-ENABLED*" );
    $sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_ = makeSymbol( "*CB-JS-SENTENCE-EDITOR-ENABLED*" );
    $sym53$_SHOW_KB_MONITOR_LINKS_ = makeSymbol( "*SHOW-KB-MONITOR-LINKS*" );
    $sym54$_CB_CONFIRM_KILLS_ = makeSymbol( "*CB-CONFIRM-KILLS*" );
    $const55$TheAssertionSentence = constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) );
    $sym56$NONE = makeSymbol( "NONE" );
    $sym57$_CB_SPECIFY_SHOW_GLOSS_ = makeSymbol( "*CB-SPECIFY-SHOW-GLOSS*" );
    $sym58$_CB_LUCKY_TERM_SEARCH__ = makeSymbol( "*CB-LUCKY-TERM-SEARCH?*" );
    $sym59$_CB_MTS_FILTER_USE_GENLMT_ = makeSymbol( "*CB-MTS-FILTER-USE-GENLMT*" );
    $sym60$_CB_USE_KE_REVIEW_CREATORS_ = makeSymbol( "*CB-USE-KE-REVIEW-CREATORS*" );
    $sym61$_CB_KE_REVIEW_CREATORS_ = makeSymbol( "*CB-KE-REVIEW-CREATORS*" );
    $kw62$MAIN = makeKeyword( "MAIN" );
    $int63$40 = makeInteger( 40 );
    $list64 = ConsesLow.list( makeKeyword( "DERIVED" ), makeKeyword( "CODE" ) );
    $int65$19990921 = makeInteger( 19990921 );
    $sym66$_CB_KE_REVIEW_START_DATE_ = makeSymbol( "*CB-KE-REVIEW-START-DATE*" );
    $int67$29991231 = makeInteger( 29991231 );
    $sym68$_CB_KE_REVIEW_END_DATE_ = makeSymbol( "*CB-KE-REVIEW-END-DATE*" );
    $sym69$_CB_VIEWPOINT_SHOW_DOC_PREDS_ = makeSymbol( "*CB-VIEWPOINT-SHOW-DOC-PREDS*" );
    $sym70$_CB_VIEWPOINT_SHOW_BOOK_PREDS_ = makeSymbol( "*CB-VIEWPOINT-SHOW-BOOK-PREDS*" );
    $sym71$_CB_GLOB_ = makeSymbol( "*CB-GLOB*" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "OBJECT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list73 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw74$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw75$DONE = makeKeyword( "DONE" );
    $sym76$DO_GLOB = makeSymbol( "DO-GLOB" );
    $sym77$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym78$HTML_HEAD = makeSymbol( "HTML-HEAD" );
    $list79 = ConsesLow.list( makeSymbol( "CB-HEAD-SHORTCUT-ICON" ) );
    $list80 = ConsesLow.list( makeSymbol( "HTML-META-ROBOT-INSTRUCTIONS" ), makeSymbol( "*CB-PERMIT-ROBOTS-TO-INDEX?*" ), makeSymbol( "*CB-PERMIT-ROBOTS-TO-FOLLOW?*" ) );
    $list81 = ConsesLow.list( makeSymbol( "CSS" ), makeKeyword( "CB-CYC" ) );
    $kw82$MINI_LOGO = makeKeyword( "MINI-LOGO" );
    $str83$mini_logo_gif = makeString( "mini-logo.gif" );
    $sym84$CB_HEAD_SHORTCUT_ICON = makeSymbol( "CB-HEAD-SHORTCUT-ICON" );
    $sym85$CB_HEAD = makeSymbol( "CB-HEAD" );
    $str86$SHORTCUT_ICON = makeString( "SHORTCUT ICON" );
    $sym87$PROGN = makeSymbol( "PROGN" );
    $list88 = ConsesLow.list( makeSymbol( "CYC-CGI-URL-INT" ) );
    $str89$_ = makeString( "?" );
    $sym90$CYC_CGI_RELATIVE_URL = makeSymbol( "CYC-CGI-RELATIVE-URL" );
    $sym91$CYC_CGI_URL_INT = makeSymbol( "CYC-CGI-URL-INT" );
    $sym92$CYC_CGI_URL = makeSymbol( "CYC-CGI-URL" );
    $str93$_cb_start_ = makeString( "?cb-start|" );
    $str94$_ = makeString( ":" );
    $str95$_a_ = makeString( "/a/" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "TARGET" ), makeSymbol( "SCRIPT" ), ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "*HTML-FORM-METHOD-POST*" ) ), makeSymbol(
        "ID" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym97$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $sym98$CLET = makeSymbol( "CLET" );
    $sym99$CB_FRAME_NAME = makeSymbol( "CB-FRAME-NAME" );
    $sym100$HTML_FANCY_FORM = makeSymbol( "HTML-FANCY-FORM" );
    $sym101$_CYC_CGI_PROGRAM_ = makeSymbol( "*CYC-CGI-PROGRAM*" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "HANDLER-NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "VALUE" ), T ), makeSymbol( "SCRIPT" ), ConsesLow.list(
        makeSymbol( "METHOD" ), makeSymbol( "*HTML-FORM-METHOD-POST*" ) ), makeSymbol( "ID" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym103$CB_BASIC_FORM = makeSymbol( "CB-BASIC-FORM" );
    $sym104$HTML_HIDDEN_INPUT = makeSymbol( "HTML-HIDDEN-INPUT" );
    $list105 = ConsesLow.list( makeSymbol( "URL-BODY" ), makeSymbol( "LINK-BODY" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET" ), makeKeyword( "MAIN" ) ), ConsesLow.list( makeSymbol( "TITLE" ),
        NIL ), makeSymbol( "CLASS" ), makeSymbol( "ATTRS" ) );
    $sym106$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $sym107$HTML_FANCY_ANCHOR = makeSymbol( "HTML-FANCY-ANCHOR" );
    $kw108$TARGET = makeKeyword( "TARGET" );
    $kw109$TITLE = makeKeyword( "TITLE" );
    $kw110$HREF = makeKeyword( "HREF" );
    $kw111$CLASS = makeKeyword( "CLASS" );
    $kw112$ATTRS = makeKeyword( "ATTRS" );
    $list113 = ConsesLow.list( makeSymbol( "URL-BODY" ), makeSymbol( "LINK-BODY" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TITLE" ), NIL ) );
    $sym114$FRAME_LINK = makeSymbol( "FRAME-LINK" );
    $kw115$TOP = makeKeyword( "TOP" );
    $list116 = ConsesLow.list( makeSymbol( "URL" ), makeSymbol( "LINK-BODY" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET" ), makeKeyword( "MAIN" ) ), ConsesLow.list( makeSymbol( "TITLE" ), NIL ),
        ConsesLow.list( makeSymbol( "ID" ), NIL ) );
    $sym117$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $kw118$ID = makeKeyword( "ID" );
    $list119 = ConsesLow.list( makeSymbol( "URL-BODY" ), makeSymbol( "LINK-BODY" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "OPTIONS" ), makeString( "" ) ) );
    $str120$ = makeString( "" );
    $sym121$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $sym122$FWHEN = makeSymbol( "FWHEN" );
    $kw123$ONCLICK = makeKeyword( "ONCLICK" );
    $list124 = ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "window.open('" ) );
    $list125 = ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "'," ) );
    $sym126$PIF = makeSymbol( "PIF" );
    $sym127$HTML_FORMAT = makeSymbol( "HTML-FORMAT" );
    $str128$__A_ = makeString( "'~A'" );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "null" ) ) );
    $str130$___A____ = makeString( ",'~A'); " );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "return false;" ) ) );
    $sym132$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $list133 = ConsesLow.list( makeSymbol( "URL-BODY" ), makeSymbol( "LINK-BODY" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET" ), makeKeyword( "MAIN" ) ), makeSymbol( "HOVEROVER-HTML" ), makeSymbol(
        "CAPTION" ), makeSymbol( "WIDTH" ), makeSymbol( "STICKY" ) );
    $sym134$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $list135 = ConsesLow.list( makeSymbol( "JAVASCRIPT" ), makeKeyword( "OVERLIB" ) );
    $sym136$HTML_HOVEROVER_ANCHOR = makeSymbol( "HTML-HOVEROVER-ANCHOR" );
    $kw137$HOVEROVER_HTML = makeKeyword( "HOVEROVER-HTML" );
    $kw138$CAPTION = makeKeyword( "CAPTION" );
    $kw139$WIDTH = makeKeyword( "WIDTH" );
    $kw140$STICKY = makeKeyword( "STICKY" );
    $list141 = ConsesLow.list( makeSymbol( "LINK-TYPE" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str142$CB_LINK__A = makeString( "CB-LINK-~A" );
    $sym143$DEFINE = makeSymbol( "DEFINE" );
    $sym144$SETUP_CB_LINK_METHOD = makeSymbol( "SETUP-CB-LINK-METHOD" );
    $sym145$QUOTE = makeSymbol( "QUOTE" );
    $list146 = ConsesLow.list( makeSymbol( "TOOL-LINK-TYPE" ), makeSymbol( "URL-BODY" ), makeSymbol( "LINK-BODY" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET" ), makeKeyword( "MAIN" ) ), ConsesLow
        .list( makeSymbol( "TITLE" ), NIL ) );
    $sym147$PWHEN_FEATURE = makeSymbol( "PWHEN-FEATURE" );
    $kw148$CYC_OPENCYC = makeKeyword( "CYC-OPENCYC" );
    $sym149$PWHEN = makeSymbol( "PWHEN" );
    $sym150$CB_ICON_EXISTS_ = makeSymbol( "CB-ICON-EXISTS?" );
    $sym151$CB_ICON = makeSymbol( "CB-ICON" );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-BR" ) ) );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "HOOK" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INCLUDE-MT?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym154$FIF = makeSymbol( "FIF" );
    $sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_ = makeSymbol( "CB-SHOW-EL-FORMULAS-FOR-HOOK?" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY" ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
        "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY" ) ) );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CB-ASSERTION-LINK-WITH-MT" ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CB-ASSERTION-LINK" ) ) );
    $list158 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*" ), NIL ), ConsesLow.list( makeSymbol( "*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*" ), NIL ) );
    $list159 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "HOOK" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list160 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY" ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
        "CB-ASSERTION-LINK-BINARY" ) ) );
    $list161 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "TITLE" ), makeSymbol( "&KEY" ), makeSymbol( "COMPLETION?" ), makeSymbol( "PASSWORD?" ), makeSymbol( "DHTML?" ), makeSymbol( "HELP" ),
      ConsesLow.list( makeSymbol( "COLOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*HTML-DEFAULT-BGCOLOR*" ) ) ), ConsesLow.list( makeSymbol( "SHOW-COPYRIGHT" ), T ), ConsesLow.list( makeSymbol(
          "OMIT-HEADING?" ), NIL )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list162 = ConsesLow.list( makeKeyword( "COMPLETION?" ), makeKeyword( "PASSWORD?" ), makeKeyword( "DHTML?" ), makeKeyword( "HELP" ), makeKeyword( "COLOR" ), makeKeyword( "SHOW-COPYRIGHT" ), makeKeyword(
        "OMIT-HEADING?" ) );
    $kw163$COMPLETION_ = makeKeyword( "COMPLETION?" );
    $kw164$PASSWORD_ = makeKeyword( "PASSWORD?" );
    $kw165$DHTML_ = makeKeyword( "DHTML?" );
    $kw166$HELP = makeKeyword( "HELP" );
    $kw167$COLOR = makeKeyword( "COLOR" );
    $sym168$_HTML_DEFAULT_BGCOLOR_ = makeSymbol( "*HTML-DEFAULT-BGCOLOR*" );
    $kw169$SHOW_COPYRIGHT = makeKeyword( "SHOW-COPYRIGHT" );
    $kw170$OMIT_HEADING_ = makeKeyword( "OMIT-HEADING?" );
    $sym171$TITLE_VAR = makeUninternedSymbol( "TITLE-VAR" );
    $sym172$WITH_HTML_ID_SPACE = makeSymbol( "WITH-HTML-ID-SPACE" );
    $sym173$HTML_DOCUMENT = makeSymbol( "HTML-DOCUMENT" );
    $list174 = ConsesLow.list( makeSymbol( "HTML-BASIC-CB-SCRIPTS" ) );
    $sym175$HTML_TITLE = makeSymbol( "HTML-TITLE" );
    $sym176$HTML_PRINC = makeSymbol( "HTML-PRINC" );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-COMPLETE-SCRIPT" ) ), ConsesLow.list( makeSymbol( "CSS" ), makeKeyword( "SAM-AUTOCOMPLETE-CSS" ) ) );
    $list178 = ConsesLow.list( ConsesLow.list( makeSymbol( "JAVASCRIPT" ), makeKeyword( "SHA1" ) ) );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ) ) );
    $sym180$HTML_FANCY_BODY = makeSymbol( "HTML-FANCY-BODY" );
    $kw181$BACKGROUND_COLOR = makeKeyword( "BACKGROUND-COLOR" );
    $list182 = ConsesLow.list( makeSymbol( "HTML-FANCY-DIV" ), ConsesLow.list( makeKeyword( "ID" ), makeString( "reloadFrameButton" ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-INPUT" ), makeString( "button" ),
        makeKeyword( "NAME" ), makeString( "reload" ), makeKeyword( "VALUE" ), makeString( "Refresh Frames" ) ) );
    $sym183$CAND = makeSymbol( "CAND" );
    $sym184$CNOT = makeSymbol( "CNOT" );
    $sym185$HTML_HEADING = makeSymbol( "HTML-HEADING" );
    $list186 = ConsesLow.list( TWO_INTEGER );
    $sym187$CB_HELP_PREAMBLE = makeSymbol( "CB-HELP-PREAMBLE" );
    $list188 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-INDENT" ) ) );
    $list189 = ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list190 = ConsesLow.list( ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "TITLE" ), makeSymbol( "&KEY" ), makeSymbol( "COMPLETION?" ), makeSymbol( "DHTML?" ), ConsesLow.list( makeSymbol( "COLOR" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "*HTML-DEFAULT-BGCOLOR*" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list191 = ConsesLow.list( makeKeyword( "COMPLETION?" ), makeKeyword( "DHTML?" ), makeKeyword( "COLOR" ) );
    $sym192$TITLE_VAR = makeUninternedSymbol( "TITLE-VAR" );
    $list193 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-COMPLETE-SCRIPT" ) ) );
    $list194 = ConsesLow.list( ConsesLow.list( makeSymbol( "DHTML-WITH-DOM-SCRIPT" ) ), ConsesLow.list( makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ) ) );
    $list195 = ConsesLow.list( makeSymbol( "HTML-FANCY-DIV" ), ConsesLow.list( makeKeyword( "ID" ), makeString( "reloadFrameButton" ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-INPUT" ), makeString( "button" ),
        makeKeyword( "NAME" ), makeString( "reload" ), makeKeyword( "VALUE" ), makeString( "Refresh" ), makeKeyword( "ONCLICK" ), makeString( "reloadCurrentFrame('reloadFrameButton');" ) ) );
    $sym196$CB_C_CONTENT_PAGE = makeSymbol( "CB-C-CONTENT-PAGE" );
    $kw197$CYC_PPH = makeKeyword( "CYC-PPH" );
    $sym198$WITH_PPH_MEMOIZATION = makeSymbol( "WITH-PPH-MEMOIZATION" );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-LANGUAGE-MT*" ), ConsesLow.list( makeSymbol( "CB-PARAPHRASE-MT" ) ) ), ConsesLow.list( makeSymbol( "*PARAPHRASE-MODE*" ), makeKeyword( "HTML" ) ) );
  }
}
/*
 * 
 * Total time: 401 ms
 * 
 */