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

public final class cb_parameters extends SubLTranslatedFile
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
    public static SubLObject cb_editing_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$cb_editing_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9188L)
    public static SubLObject cb_mts_filter_use_genlmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_parameters.$cb_mts_filter_use_genlmt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9188L)
    public static SubLObject set_cb_mts_filter_use_genlmt(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_mts_filter_use_genlmt$.setDynamicValue(new_value, thread);
        return cb_parameters.$cb_mts_filter_use_genlmt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
    public static SubLObject cb_use_ke_review_creators() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_parameters.$cb_use_ke_review_creators$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
    public static SubLObject set_cb_use_ke_review_creators(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_use_ke_review_creators$.setDynamicValue(new_value, thread);
        return cb_parameters.$cb_use_ke_review_creators$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
    public static SubLObject cb_ke_review_creators() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_parameters.$cb_ke_review_creators$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 9333L)
    public static SubLObject set_cb_ke_review_creators(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_ke_review_creators$.setDynamicValue(new_value, thread);
        return cb_parameters.$cb_ke_review_creators$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12637L)
    public static SubLObject cb_glob_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = cb_parameters.$cb_glob$.getDynamicValue(thread);
        if (cb_parameters.NIL == v_glob) {
            return Values.values((SubLObject)cb_parameters.NIL, (SubLObject)cb_parameters.NIL);
        }
        return glob.glob_lookup(v_glob, id, (SubLObject)cb_parameters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12835L)
    public static SubLObject cb_glob_lookup_by_string(final SubLObject id_string) {
        return cb_glob_lookup(string_utilities.string_to_integer(id_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 12944L)
    public static SubLObject cb_glob_id(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_glob = cb_parameters.$cb_glob$.getDynamicValue(thread);
        if (cb_parameters.NIL == v_glob) {
            v_glob = glob.new_glob(Symbols.symbol_function((SubLObject)cb_parameters.EQUAL), (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED);
            cb_parameters.$cb_glob$.setDynamicValue(v_glob, thread);
        }
        return glob.glob_enter(v_glob, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13181L)
    public static SubLObject cb_glob_remove(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = cb_parameters.$cb_glob$.getDynamicValue(thread);
        if (cb_parameters.NIL == v_glob) {
            return (SubLObject)cb_parameters.NIL;
        }
        return glob.glob_remove(v_glob, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13364L)
    public static SubLObject cb_glob_remove_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = cb_parameters.$cb_glob$.getDynamicValue(thread);
        if (cb_parameters.NIL == v_glob) {
            return (SubLObject)cb_parameters.NIL;
        }
        return glob.glob_remove_id(v_glob, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13557L)
    public static SubLObject cb_glob_reset() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = cb_parameters.$cb_glob$.getDynamicValue(thread);
        if (cb_parameters.NIL == v_glob) {
            return (SubLObject)cb_parameters.NIL;
        }
        return glob.glob_reset(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 13739L)
    public static SubLObject do_cb_glob(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)cb_parameters.NIL;
        SubLObject v_object = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list72);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list72);
        v_object = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_parameters.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_parameters.NIL;
        SubLObject current_$1 = (SubLObject)cb_parameters.NIL;
        while (cb_parameters.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_parameters.$list72);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_parameters.$list72);
            if (cb_parameters.NIL == conses_high.member(current_$1, (SubLObject)cb_parameters.$list73, (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED)) {
                bad = (SubLObject)cb_parameters.T;
            }
            if (current_$1 == cb_parameters.$kw74$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_parameters.NIL != bad && cb_parameters.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list72);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw75$DONE, current);
        final SubLObject done = (SubLObject)((cb_parameters.NIL != done_tail) ? conses_high.cadr(done_tail) : cb_parameters.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym76$DO_GLOB, (SubLObject)ConsesLow.list(id, v_object, (SubLObject)cb_parameters.$sym71$_CB_GLOB_, (SubLObject)cb_parameters.$kw75$DONE, done), ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14005L)
    public static SubLObject cb_glob_find_all_if(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_parameters.NIL != Types.function_spec_p(pred) : pred;
        SubLObject result = (SubLObject)cb_parameters.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(glob.do_glob_index(cb_parameters.$cb_glob$.getDynamicValue(thread)))); cb_parameters.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject v_object = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_parameters.NIL != Functions.funcall(pred, v_object)) {
                result = (SubLObject)ConsesLow.cons(v_object, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14377L)
    public static SubLObject cb_head(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym78$HTML_HEAD, (SubLObject)cb_parameters.$list79, (SubLObject)cb_parameters.$list80, (SubLObject)cb_parameters.$list81, ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14725L)
    public static SubLObject cb_head_shortcut_icon() {
        final SubLObject shortcut_icon = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_parameters.$kw82$MINI_LOGO);
        html_utilities.html_source_readability_terpri((SubLObject)cb_parameters.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_link_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_link_rel$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_parameters.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_parameters.$str86$SHORTCUT_ICON);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_parameters.UNPROVIDED);
        if (cb_parameters.NIL != shortcut_icon) {
            html_utilities.html_markup(html_macros.$html_link_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_parameters.UNPROVIDED);
            html_utilities.html_markup(shortcut_icon);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_parameters.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_parameters.UNPROVIDED);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 14927L)
    public static SubLObject cyc_cgi_url(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym87$PROGN, (SubLObject)cb_parameters.$list88, ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15071L)
    public static SubLObject cyc_cgi_url_string(final SubLObject handler_and_args_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(system_parameters.$cyc_cgi_program$.getDynamicValue(thread), new SubLObject[] { cb_parameters.$str89$_, handler_and_args_string });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15552L)
    public static SubLObject cyc_cgi_url_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Functions.funcall(cb_parameters.$cb_form_url_prefix_print$.getDynamicValue(thread));
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15668L)
    public static SubLObject cyc_cgi_relative_url() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_markup((SubLObject)cb_parameters.$str89$_);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 15845L)
    public static SubLObject cyc_cgi_absolute_cb_framed_url() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(http_kernel.http_server_cgi_base_url());
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_markup((SubLObject)cb_parameters.$str93$_cb_start_);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 16238L)
    public static SubLObject cyc_cgi_kea_url() {
        html_utilities.html_markup(web_utilities.effective_servlet_container_host());
        html_utilities.html_markup((SubLObject)cb_parameters.$str94$_);
        html_utilities.html_markup(web_utilities.effective_servlet_container_port());
        html_utilities.html_markup((SubLObject)cb_parameters.$str95$_a_);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 16534L)
    public static SubLObject cb_basic_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list96);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list96);
        current = current.rest();
        final SubLObject script = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list96);
        current = current.rest();
        final SubLObject method = current.isCons() ? current.first() : html_macros.$html_form_method_post$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list96);
        current = current.rest();
        final SubLObject id = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list96);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject frame_name_var = (SubLObject)cb_parameters.$sym97$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym99$CB_FRAME_NAME, target))), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym100$HTML_FANCY_FORM, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym101$_CYC_CGI_PROGRAM_, method, frame_name_var, (SubLObject)cb_parameters.NIL, script, id), ConsesLow.append(body, (SubLObject)cb_parameters.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list96);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 16831L)
    public static SubLObject cb_basic_form_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler_name = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list102);
        handler_name = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list102);
        current = current.rest();
        final SubLObject value = (SubLObject)(current.isCons() ? current.first() : cb_parameters.T);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list102);
        current = current.rest();
        final SubLObject script = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list102);
        current = current.rest();
        final SubLObject method = current.isCons() ? current.first() : html_macros.$html_form_method_post$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list102);
        current = current.rest();
        final SubLObject id = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list102);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym103$CB_BASIC_FORM, (SubLObject)ConsesLow.list(target, script, method, id), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym104$HTML_HIDDEN_INPUT, handler_name, value), ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list102);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 17084L)
    public static SubLObject frame_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list105);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list105);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.$kw62$MAIN);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list105);
        current = current.rest();
        final SubLObject title = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list105);
        current = current.rest();
        final SubLObject v_class = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list105);
        current = current.rest();
        final SubLObject attrs = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list105);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject frame_name_var = (SubLObject)cb_parameters.$sym106$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym99$CB_FRAME_NAME, target))), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list(new SubLObject[] { cb_parameters.$kw108$TARGET, frame_name_var, cb_parameters.$kw109$TITLE, title, cb_parameters.$kw110$HREF, ConsesLow.list((SubLObject)cb_parameters.$sym92$CYC_CGI_URL, url_body), cb_parameters.$kw111$CLASS, v_class, cb_parameters.$kw112$ATTRS, attrs }), link_body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list105);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 17869L)
    public static SubLObject page_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list113);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list113);
        link_body = current.first();
        current = current.rest();
        final SubLObject title = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list113);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym114$FRAME_LINK, url_body, link_body, (SubLObject)cb_parameters.$kw115$TOP, title);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list113);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 18287L)
    public static SubLObject absolute_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list116);
        url = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list116);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.$kw62$MAIN);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list116);
        current = current.rest();
        final SubLObject title = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list116);
        current = current.rest();
        final SubLObject id = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list116);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject frame_name_var = (SubLObject)cb_parameters.$sym117$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym99$CB_FRAME_NAME, target))), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$kw108$TARGET, frame_name_var, (SubLObject)cb_parameters.$kw109$TITLE, title, (SubLObject)cb_parameters.$kw110$HREF, url, (SubLObject)cb_parameters.$kw118$ID, id), link_body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list116);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 19049L)
    public static SubLObject new_window_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list119);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list119);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list119);
        current = current.rest();
        final SubLObject options = (SubLObject)(current.isCons() ? current.first() : cb_parameters.$str120$);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list119);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject frame_name_var = (SubLObject)cb_parameters.$sym121$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym122$FWHEN, target, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym99$CB_FRAME_NAME, target)))), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$kw108$TARGET, frame_name_var, (SubLObject)cb_parameters.$kw110$HREF, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym92$CYC_CGI_URL, url_body), (SubLObject)cb_parameters.$kw123$ONCLICK, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym87$PROGN, new SubLObject[] { cb_parameters.$list124, ConsesLow.list((SubLObject)cb_parameters.$sym92$CYC_CGI_URL, url_body), cb_parameters.$list125, ConsesLow.listS((SubLObject)cb_parameters.$sym126$PIF, target, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym127$HTML_FORMAT, (SubLObject)cb_parameters.$str128$__A_, target), (SubLObject)cb_parameters.$list129), ConsesLow.list((SubLObject)cb_parameters.$sym127$HTML_FORMAT, (SubLObject)cb_parameters.$str130$___A____, options), cb_parameters.$list131 })), link_body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list119);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 19883L)
    public static SubLObject new_external_window_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list119);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list119);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list119);
        current = current.rest();
        final SubLObject options = (SubLObject)(current.isCons() ? current.first() : cb_parameters.$str120$);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list119);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject frame_name_var = (SubLObject)cb_parameters.$sym132$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym122$FWHEN, target, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym99$CB_FRAME_NAME, target)))), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$kw108$TARGET, frame_name_var, (SubLObject)cb_parameters.$kw110$HREF, url_body, (SubLObject)cb_parameters.$kw123$ONCLICK, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym87$PROGN, new SubLObject[] { cb_parameters.$list124, url_body, cb_parameters.$list125, ConsesLow.listS((SubLObject)cb_parameters.$sym126$PIF, target, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym127$HTML_FORMAT, (SubLObject)cb_parameters.$str128$__A_, target), (SubLObject)cb_parameters.$list129), ConsesLow.list((SubLObject)cb_parameters.$sym127$HTML_FORMAT, (SubLObject)cb_parameters.$str130$___A____, options), cb_parameters.$list131 })), link_body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list119);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 20697L)
    public static SubLObject frame_link_hoverover(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list133);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list133);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.$kw62$MAIN);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list133);
        current = current.rest();
        final SubLObject hoverover_html = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list133);
        current = current.rest();
        final SubLObject caption = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list133);
        current = current.rest();
        final SubLObject width = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list133);
        current = current.rest();
        final SubLObject sticky = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list133);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject frame_name_var = (SubLObject)cb_parameters.$sym134$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym99$CB_FRAME_NAME, target))), (SubLObject)cb_parameters.$list135, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym136$HTML_HOVEROVER_ANCHOR, (SubLObject)ConsesLow.list(new SubLObject[] { cb_parameters.$kw108$TARGET, frame_name_var, cb_parameters.$kw110$HREF, ConsesLow.list((SubLObject)cb_parameters.$sym92$CYC_CGI_URL, url_body), cb_parameters.$kw137$HOVEROVER_HTML, hoverover_html, cb_parameters.$kw138$CAPTION, caption, cb_parameters.$kw139$WIDTH, width, cb_parameters.$kw140$STICKY, sticky }), link_body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list133);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 21183L)
    public static SubLObject define_cb_link_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject link_type = (SubLObject)cb_parameters.NIL;
        SubLObject arglist = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list141);
        link_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list141);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject type_name = Symbols.symbol_name(link_type);
        final SubLObject method_func_name = PrintLow.format((SubLObject)cb_parameters.NIL, (SubLObject)cb_parameters.$str142$CB_LINK__A, type_name);
        final SubLObject method_func = Packages.intern(method_func_name, (SubLObject)cb_parameters.UNPROVIDED);
        final SubLObject max_args = list_utilities.function_arglist_max_args(arglist);
        return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym87$PROGN, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym143$DEFINE, method_func, arglist, ConsesLow.append(body, (SubLObject)cb_parameters.NIL)), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym144$SETUP_CB_LINK_METHOD, link_type, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym145$QUOTE, method_func), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym145$QUOTE, max_args)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 21576L)
    public static SubLObject cb_tool_frame_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tool_link_type = (SubLObject)cb_parameters.NIL;
        SubLObject url_body = (SubLObject)cb_parameters.NIL;
        SubLObject link_body = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list146);
        tool_link_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list146);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list146);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : cb_parameters.$kw62$MAIN);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list146);
        current = current.rest();
        final SubLObject title = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list146);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym114$FRAME_LINK, url_body, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym87$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym147$PWHEN_FEATURE, (SubLObject)cb_parameters.$kw148$CYC_OPENCYC, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym150$CB_ICON_EXISTS_, tool_link_type), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym151$CB_ICON, tool_link_type), (SubLObject)cb_parameters.$list152)), link_body), target, title);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list146);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 21978L)
    public static SubLObject cb_clet_assertion_link_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list153);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)cb_parameters.NIL;
        SubLObject hook = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list153);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list153);
        hook = current.first();
        current = current.rest();
        final SubLObject include_mtP = (SubLObject)(current.isCons() ? current.first() : cb_parameters.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_parameters.$list153);
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym98$CLET, reader.bq_cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym154$FIF, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym154$FIF, include_mtP, (SubLObject)cb_parameters.$list156), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym154$FIF, include_mtP, (SubLObject)cb_parameters.$list157))), (SubLObject)cb_parameters.$list158), ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list153);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 22830L)
    public static SubLObject cb_clet_assertion_link_binary_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list159);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)cb_parameters.NIL;
        SubLObject hook = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list159);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list159);
        hook = current.first();
        current = current.rest();
        if (cb_parameters.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym98$CLET, reader.bq_cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym154$FIF, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook), (SubLObject)cb_parameters.$list160)), (SubLObject)cb_parameters.$list158), ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list159);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 23376L)
    public static SubLObject cb_simple_main_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list161);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list161);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_parameters.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_parameters.NIL;
        SubLObject current_$2 = (SubLObject)cb_parameters.NIL;
        while (cb_parameters.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_parameters.$list161);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_parameters.$list161);
            if (cb_parameters.NIL == conses_high.member(current_$2, (SubLObject)cb_parameters.$list162, (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED)) {
                bad = (SubLObject)cb_parameters.T;
            }
            if (current_$2 == cb_parameters.$kw74$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_parameters.NIL != bad && cb_parameters.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list161);
        }
        final SubLObject completionP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw163$COMPLETION_, current);
        final SubLObject completionP = (SubLObject)((cb_parameters.NIL != completionP_tail) ? conses_high.cadr(completionP_tail) : cb_parameters.NIL);
        final SubLObject passwordP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw164$PASSWORD_, current);
        final SubLObject passwordP = (SubLObject)((cb_parameters.NIL != passwordP_tail) ? conses_high.cadr(passwordP_tail) : cb_parameters.NIL);
        final SubLObject dhtmlP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw165$DHTML_, current);
        final SubLObject dhtmlP = (SubLObject)((cb_parameters.NIL != dhtmlP_tail) ? conses_high.cadr(dhtmlP_tail) : cb_parameters.NIL);
        final SubLObject help_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw166$HELP, current);
        final SubLObject help = (SubLObject)((cb_parameters.NIL != help_tail) ? conses_high.cadr(help_tail) : cb_parameters.NIL);
        final SubLObject color_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw167$COLOR, current);
        final SubLObject color = (SubLObject)((cb_parameters.NIL != color_tail) ? conses_high.cadr(color_tail) : cb_parameters.$sym168$_HTML_DEFAULT_BGCOLOR_);
        final SubLObject show_copyright_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw169$SHOW_COPYRIGHT, current);
        final SubLObject show_copyright = (SubLObject)((cb_parameters.NIL != show_copyright_tail) ? conses_high.cadr(show_copyright_tail) : cb_parameters.T);
        final SubLObject omit_headingP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw170$OMIT_HEADING_, current);
        final SubLObject omit_headingP = (SubLObject)((cb_parameters.NIL != omit_headingP_tail) ? conses_high.cadr(omit_headingP_tail) : cb_parameters.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject title_var = (SubLObject)cb_parameters.$sym171$TITLE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(title_var, title)), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym172$WITH_HTML_ID_SPACE, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym173$HTML_DOCUMENT, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym85$CB_HEAD, (SubLObject)cb_parameters.$list174, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym149$PWHEN, title_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym175$HTML_TITLE, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym176$HTML_PRINC, title_var))), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, completionP, (SubLObject)cb_parameters.$list177), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, passwordP, (SubLObject)cb_parameters.$list178), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, dhtmlP, (SubLObject)cb_parameters.$list179)), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym180$HTML_FANCY_BODY, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$kw181$BACKGROUND_COLOR, color, (SubLObject)cb_parameters.$kw111$CLASS, html_macros.$basic_skin_class$.getGlobalValue(), (SubLObject)cb_parameters.$kw169$SHOW_COPYRIGHT, show_copyright), (SubLObject)cb_parameters.$list182, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym149$PWHEN, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym183$CAND, title_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym184$CNOT, omit_headingP)), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym185$HTML_HEADING, (SubLObject)cb_parameters.$list186, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, help, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym187$CB_HELP_PREAMBLE, help), (SubLObject)cb_parameters.$list188), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym176$HTML_PRINC, title_var))), ConsesLow.append(body, (SubLObject)cb_parameters.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 24678L)
    public static SubLObject cb_c_content_page(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject index = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list189);
        index = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return reader.bq_cons((SubLObject)cb_parameters.$sym87$PROGN, ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 24825L)
    public static SubLObject cb_simple_c_content_document(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list190);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject index = (SubLObject)cb_parameters.NIL;
        SubLObject title = (SubLObject)cb_parameters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list190);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_parameters.$list190);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_parameters.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_parameters.NIL;
        SubLObject current_$3 = (SubLObject)cb_parameters.NIL;
        while (cb_parameters.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_parameters.$list190);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_parameters.$list190);
            if (cb_parameters.NIL == conses_high.member(current_$3, (SubLObject)cb_parameters.$list191, (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED)) {
                bad = (SubLObject)cb_parameters.T;
            }
            if (current_$3 == cb_parameters.$kw74$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_parameters.NIL != bad && cb_parameters.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_parameters.$list190);
        }
        final SubLObject completionP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw163$COMPLETION_, current);
        final SubLObject completionP = (SubLObject)((cb_parameters.NIL != completionP_tail) ? conses_high.cadr(completionP_tail) : cb_parameters.NIL);
        final SubLObject dhtmlP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw165$DHTML_, current);
        final SubLObject dhtmlP = (SubLObject)((cb_parameters.NIL != dhtmlP_tail) ? conses_high.cadr(dhtmlP_tail) : cb_parameters.NIL);
        final SubLObject color_tail = cdestructuring_bind.property_list_member((SubLObject)cb_parameters.$kw167$COLOR, current);
        final SubLObject color = (SubLObject)((cb_parameters.NIL != color_tail) ? conses_high.cadr(color_tail) : cb_parameters.$sym168$_HTML_DEFAULT_BGCOLOR_);
        final SubLObject body;
        current = (body = temp);
        if (cb_parameters.NIL != cb_parameters.$cb_c_suppress_body_level_elements$.getDynamicValue(thread)) {
            return (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)cb_parameters.NIL, ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
        }
        final SubLObject title_var = (SubLObject)cb_parameters.$sym192$TITLE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(title_var, title)), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym172$WITH_HTML_ID_SPACE, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym173$HTML_DOCUMENT, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym85$CB_HEAD, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym149$PWHEN, title_var, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym175$HTML_TITLE, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym176$HTML_PRINC, title_var))), (SubLObject)cb_parameters.$list174, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, completionP, (SubLObject)cb_parameters.$list193), (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym149$PWHEN, dhtmlP, (SubLObject)cb_parameters.$list194)), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym180$HTML_FANCY_BODY, (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$kw181$BACKGROUND_COLOR, color, (SubLObject)cb_parameters.$kw111$CLASS, html_macros.$basic_skin_class$.getGlobalValue()), (SubLObject)cb_parameters.$list195, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym196$CB_C_CONTENT_PAGE, index, ConsesLow.append(body, (SubLObject)cb_parameters.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-parameters.lisp", position = 25715L)
    public static SubLObject cb_with_pph_assumptions(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (cb_parameters.NIL != Sequences.find((SubLObject)cb_parameters.$kw197$CYC_PPH, reader.$features$.getDynamicValue(thread), (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$sym198$WITH_PPH_MEMOIZATION, (SubLObject)ConsesLow.listS((SubLObject)cb_parameters.$sym98$CLET, (SubLObject)cb_parameters.$list199, ConsesLow.append(body, (SubLObject)cb_parameters.NIL)));
        }
        return reader.bq_cons((SubLObject)cb_parameters.$sym87$PROGN, ConsesLow.append(body, (SubLObject)cb_parameters.NIL));
    }
    
    public static SubLObject declare_cb_parameters_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_editing_enabled_p", "CB-EDITING-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_mts_filter_use_genlmt", "CB-MTS-FILTER-USE-GENLMT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "set_cb_mts_filter_use_genlmt", "SET-CB-MTS-FILTER-USE-GENLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_use_ke_review_creators", "CB-USE-KE-REVIEW-CREATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "set_cb_use_ke_review_creators", "SET-CB-USE-KE-REVIEW-CREATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_ke_review_creators", "CB-KE-REVIEW-CREATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "set_cb_ke_review_creators", "SET-CB-KE-REVIEW-CREATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_lookup", "CB-GLOB-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_lookup_by_string", "CB-GLOB-LOOKUP-BY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_id", "CB-GLOB-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_remove", "CB-GLOB-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_remove_id", "CB-GLOB-REMOVE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_reset", "CB-GLOB-RESET", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "do_cb_glob", "DO-CB-GLOB");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_glob_find_all_if", "CB-GLOB-FIND-ALL-IF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_head", "CB-HEAD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cb_head_shortcut_icon", "CB-HEAD-SHORTCUT-ICON", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cyc_cgi_url", "CYC-CGI-URL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cyc_cgi_url_string", "CYC-CGI-URL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cyc_cgi_url_int", "CYC-CGI-URL-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cyc_cgi_relative_url", "CYC-CGI-RELATIVE-URL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cyc_cgi_absolute_cb_framed_url", "CYC-CGI-ABSOLUTE-CB-FRAMED-URL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_parameters", "cyc_cgi_kea_url", "CYC-CGI-KEA-URL", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_basic_form", "CB-BASIC-FORM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_basic_form_handler", "CB-BASIC-FORM-HANDLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "frame_link", "FRAME-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "page_link", "PAGE-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "absolute_link", "ABSOLUTE-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "new_window_link", "NEW-WINDOW-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "new_external_window_link", "NEW-EXTERNAL-WINDOW-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "frame_link_hoverover", "FRAME-LINK-HOVEROVER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "define_cb_link_method", "DEFINE-CB-LINK-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_tool_frame_link", "CB-TOOL-FRAME-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_clet_assertion_link_fn", "CB-CLET-ASSERTION-LINK-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_clet_assertion_link_binary_fn", "CB-CLET-ASSERTION-LINK-BINARY-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_simple_main_document", "CB-SIMPLE-MAIN-DOCUMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_c_content_page", "CB-C-CONTENT-PAGE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_simple_c_content_document", "CB-SIMPLE-C-CONTENT-DOCUMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_parameters", "cb_with_pph_assumptions", "CB-WITH-PPH-ASSUMPTIONS");
        return (SubLObject)cb_parameters.NIL;
    }
    
    public static SubLObject init_cb_parameters_file() {
        cb_parameters.$transcript_file_shorthand$ = SubLFiles.defparameter("*TRANSCRIPT-FILE-SHORTHAND*", (SubLObject)cb_parameters.$list0);
        cb_parameters.$cb_include_help$ = SubLFiles.defparameter("*CB-INCLUDE-HELP*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_include_inference_helpP$ = SubLFiles.defparameter("*CB-INCLUDE-INFERENCE-HELP?*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_c_default_content$ = SubLFiles.defparameter("*CB-C-DEFAULT-CONTENT*", (SubLObject)cb_parameters.$kw3$MAXIMAL);
        cb_parameters.$cb_c_maximal_upper_bound$ = SubLFiles.defparameter("*CB-C-MAXIMAL-UPPER-BOUND*", (SubLObject)cb_parameters.$int5$30);
        cb_parameters.$cb_c_assertion_formulas_display$ = SubLFiles.defparameter("*CB-C-ASSERTION-FORMULAS-DISPLAY*", (SubLObject)cb_parameters.$kw7$HL_FORMULAS);
        cb_parameters.$cb_constant_history_max$ = SubLFiles.defparameter("*CB-CONSTANT-HISTORY-MAX*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_use_categorized_historyP$ = SubLFiles.defparameter("*CB-USE-CATEGORIZED-HISTORY?*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_constant_history_chronological_max$ = SubLFiles.defparameter("*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*", (SubLObject)cb_parameters.FIFTEEN_INTEGER);
        cb_parameters.$cb_constant_history$ = SubLFiles.defparameter("*CB-CONSTANT-HISTORY*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_nat_history_max$ = SubLFiles.defparameter("*CB-NAT-HISTORY-MAX*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_nat_history$ = SubLFiles.defparameter("*CB-NAT-HISTORY*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_assertion_history_max$ = SubLFiles.defparameter("*CB-ASSERTION-HISTORY-MAX*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_assertion_history$ = SubLFiles.defparameter("*CB-ASSERTION-HISTORY*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_sentence_history_max$ = SubLFiles.defparameter("*CB-SENTENCE-HISTORY-MAX*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_sentence_history$ = SubLFiles.defparameter("*CB-SENTENCE-HISTORY*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_history_show_el_formulasP$ = SubLFiles.defparameter("*CB-HISTORY-SHOW-EL-FORMULAS?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_status_update_interval$ = SubLFiles.defparameter("*CB-STATUS-UPDATE-INTERVAL*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_destroy_all_inferences_but_last_n_default$ = SubLFiles.deflexical("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N-DEFAULT*", (SubLObject)cb_parameters.TEN_INTEGER);
        cb_parameters.$cb_destroy_all_inferences_but_last_n$ = SubLFiles.defparameter("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*", cb_parameters.$cb_destroy_all_inferences_but_last_n_default$.getGlobalValue());
        cb_parameters.$cb_perform_argumentation_for_closed_queryP$ = SubLFiles.defparameter("*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_c_wrap_assertions$ = SubLFiles.defparameter("*CB-C-WRAP-ASSERTIONS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_a_show_el_formula$ = SubLFiles.defparameter("*CB-A-SHOW-EL-FORMULA*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_a_show_hl_formula$ = SubLFiles.defparameter("*CB-A-SHOW-HL-FORMULA*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_a_edit_preserve_meta_assertions_by_defaultP$ = SubLFiles.defparameter("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_a_change_all_meta_assertions_mt_by_defaultP$ = SubLFiles.defparameter("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_a_perform_access_diagnostics$ = SubLFiles.defparameter("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_a_show_english$ = SubLFiles.defparameter("*CB-A-SHOW-ENGLISH*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_wrap_interactor$ = SubLFiles.defparameter("*CB-WRAP-INTERACTOR*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_a_show_newlines_in_string_args$ = SubLFiles.defparameter("*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_use_gke_to_edit_el_sentences$ = SubLFiles.defparameter("*CB-USE-GKE-TO-EDIT-EL-SENTENCES*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_use_dynamic_table_for_inference_results$ = SubLFiles.defparameter("*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_show_cyclify_button$ = SubLFiles.defparameter("*CB-SHOW-CYCLIFY-BUTTON*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_enable_inference_monitoring$ = SubLFiles.defparameter("*CB-ENABLE-INFERENCE-MONITORING*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_assert_queue_default$ = SubLFiles.defparameter("*CB-ASSERT-QUEUE-DEFAULT*", (SubLObject)cb_parameters.$kw36$LOCAL);
        cb_parameters.$cb_separate_assertion_frame$ = SubLFiles.defparameter("*CB-SEPARATE-ASSERTION-FRAME*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_user_toolbar_links$ = SubLFiles.defparameter("*CB-USER-TOOLBAR-LINKS*", red_infrastructure_macros.red_def_helper((SubLObject)(cb_parameters.$list39.isSymbol() ? Symbols.symbol_value((SubLObject)cb_parameters.$list39) : cb_parameters.$list39), (SubLObject)cb_parameters.$sym40$_CB_USER_TOOLBAR_LINKS_, (SubLObject)(cb_parameters.$list41.isSymbol() ? Symbols.symbol_value((SubLObject)cb_parameters.$list41) : cb_parameters.$list41), (SubLObject)cb_parameters.$kw42$PARAMETER, (SubLObject)cb_parameters.UNPROVIDED));
        cb_parameters.$cb_separate_doc_frame$ = SubLFiles.defparameter("*CB-SEPARATE-DOC-FRAME*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_more_assertion_marker_image_text$ = SubLFiles.defparameter("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_ke_text_mode$ = SubLFiles.defparameter("*CB-KE-TEXT-MODE*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_fastP$ = SubLFiles.defparameter("*CB-FAST?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_max_assertions_non_collapsed$ = SubLFiles.defparameter("*CB-MAX-ASSERTIONS-NON-COLLAPSED*", (SubLObject)cb_parameters.$int47$50);
        cb_parameters.$cb_default_mt$ = SubLFiles.defparameter("*CB-DEFAULT-MT*", cb_parameters.$const49$BaseKB);
        cb_parameters.$cb_editing_enabled$ = SubLFiles.defparameter("*CB-EDITING-ENABLED*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_js_sentence_editor_enabled$ = SubLFiles.defparameter("*CB-JS-SENTENCE-EDITOR-ENABLED*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$show_kb_monitor_links$ = SubLFiles.defparameter("*SHOW-KB-MONITOR-LINKS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_confirm_kills$ = SubLFiles.defparameter("*CB-CONFIRM-KILLS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_assertion_indexical$ = SubLFiles.deflexical("*CB-ASSERTION-INDEXICAL*", cb_parameters.$const55$TheAssertionSentence);
        cb_parameters.$cb_specify_show_gloss$ = SubLFiles.defparameter("*CB-SPECIFY-SHOW-GLOSS*", (SubLObject)cb_parameters.$sym56$NONE);
        cb_parameters.$cb_lucky_term_searchP$ = SubLFiles.defparameter("*CB-LUCKY-TERM-SEARCH?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_mts_filter_use_genlmt$ = SubLFiles.defparameter("*CB-MTS-FILTER-USE-GENLMT*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_use_ke_review_creators$ = SubLFiles.defparameter("*CB-USE-KE-REVIEW-CREATORS*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_ke_review_creators$ = SubLFiles.defparameter("*CB-KE-REVIEW-CREATORS*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_c_suppress_body_level_elements$ = SubLFiles.defparameter("*CB-C-SUPPRESS-BODY-LEVEL-ELEMENTS*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_c_gaf_arg_last_mt$ = SubLFiles.defparameter("*CB-C-GAF-ARG-LAST-MT*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_c_gaf_arg_use_binary$ = SubLFiles.defparameter("*CB-C-GAF-ARG-USE-BINARY*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_c_nart_arg_use_binary$ = SubLFiles.defparameter("*CB-C-NART-ARG-USE-BINARY*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_c_formula_display_exception_index_hook$ = SubLFiles.defparameter("*CB-C-FORMULA-DISPLAY-EXCEPTION-INDEX-HOOK*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_show_el_assertion_readably_last_formula$ = SubLFiles.defparameter("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_show_el_assertion_readably_last_mt$ = SubLFiles.defparameter("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_assertion_el_formula_cache$ = SubLFiles.defparameter("*CB-ASSERTION-EL-FORMULA-CACHE*", dictionary.new_dictionary((SubLObject)cb_parameters.UNPROVIDED, (SubLObject)cb_parameters.UNPROVIDED));
        cb_parameters.$cb_default_term_frame$ = SubLFiles.defparameter("*CB-DEFAULT-TERM-FRAME*", (SubLObject)cb_parameters.$kw62$MAIN);
        cb_parameters.$cb_default_assertion_frame$ = SubLFiles.defparameter("*CB-DEFAULT-ASSERTION-FRAME*", (SubLObject)cb_parameters.$kw62$MAIN);
        cb_parameters.$cb_assertion_link_hook$ = SubLFiles.defparameter("*CB-ASSERTION-LINK-HOOK*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_constant_input_width$ = SubLFiles.defparameter("*CB-CONSTANT-INPUT-WIDTH*", (SubLObject)cb_parameters.$int63$40);
        cb_parameters.$cb_hlmt_input_width$ = SubLFiles.defparameter("*CB-HLMT-INPUT-WIDTH*", (SubLObject)cb_parameters.$int47$50);
        cb_parameters.$cb_nonreviewable_assertion_markers$ = SubLFiles.defparameter("*CB-NONREVIEWABLE-ASSERTION-MARKERS*", (SubLObject)cb_parameters.$list64);
        cb_parameters.$cb_ke_review_start_date$ = SubLFiles.defparameter("*CB-KE-REVIEW-START-DATE*", (SubLObject)cb_parameters.$int65$19990921);
        cb_parameters.$cb_ke_review_end_date$ = SubLFiles.defparameter("*CB-KE-REVIEW-END-DATE*", (SubLObject)cb_parameters.$int67$29991231);
        cb_parameters.$cb_viewpoint_show_doc_preds$ = SubLFiles.defparameter("*CB-VIEWPOINT-SHOW-DOC-PREDS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_viewpoint_show_book_preds$ = SubLFiles.defparameter("*CB-VIEWPOINT-SHOW-BOOK-PREDS*", (SubLObject)cb_parameters.T);
        cb_parameters.$cb_permit_robots_to_followP$ = SubLFiles.defparameter("*CB-PERMIT-ROBOTS-TO-FOLLOW?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_permit_robots_to_indexP$ = SubLFiles.defparameter("*CB-PERMIT-ROBOTS-TO-INDEX?*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_glob$ = SubLFiles.defparameter("*CB-GLOB*", (SubLObject)cb_parameters.NIL);
        cb_parameters.$cb_form_url_prefix_print$ = SubLFiles.defparameter("*CB-FORM-URL-PREFIX-PRINT*", (SubLObject)cb_parameters.$sym90$CYC_CGI_RELATIVE_URL);
        return (SubLObject)cb_parameters.NIL;
    }
    
    public static SubLObject setup_cb_parameters_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym1$_CB_INCLUDE_HELP_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym2$_CB_INCLUDE_INFERENCE_HELP__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym4$_CB_C_DEFAULT_CONTENT_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym4$_CB_C_DEFAULT_CONTENT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym6$_CB_C_MAXIMAL_UPPER_BOUND_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym6$_CB_C_MAXIMAL_UPPER_BOUND_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym9$_CB_CONSTANT_HISTORY_MAX_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym9$_CB_CONSTANT_HISTORY_MAX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym10$_CB_USE_CATEGORIZED_HISTORY__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym10$_CB_USE_CATEGORIZED_HISTORY__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym12$_CB_CONSTANT_HISTORY_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym12$_CB_CONSTANT_HISTORY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym13$_CB_NAT_HISTORY_MAX_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym13$_CB_NAT_HISTORY_MAX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym14$_CB_NAT_HISTORY_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym14$_CB_NAT_HISTORY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym15$_CB_ASSERTION_HISTORY_MAX_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym15$_CB_ASSERTION_HISTORY_MAX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym16$_CB_ASSERTION_HISTORY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym17$_CB_SENTENCE_HISTORY_MAX_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym17$_CB_SENTENCE_HISTORY_MAX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym18$_CB_SENTENCE_HISTORY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym19$_CB_HISTORY_SHOW_EL_FORMULAS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym19$_CB_HISTORY_SHOW_EL_FORMULAS__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym20$_CB_STATUS_UPDATE_INTERVAL_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym20$_CB_STATUS_UPDATE_INTERVAL_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym23$_CB_C_WRAP_ASSERTIONS_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym23$_CB_C_WRAP_ASSERTIONS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym24$_CB_A_SHOW_EL_FORMULA_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym24$_CB_A_SHOW_EL_FORMULA_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym25$_CB_A_SHOW_HL_FORMULA_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym25$_CB_A_SHOW_HL_FORMULA_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym29$_CB_A_SHOW_ENGLISH_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym29$_CB_A_SHOW_ENGLISH_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym30$_CB_WRAP_INTERACTOR_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym30$_CB_WRAP_INTERACTOR_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym34$_CB_SHOW_CYCLIFY_BUTTON_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym34$_CB_SHOW_CYCLIFY_BUTTON_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym35$_CB_ENABLE_INFERENCE_MONITORING_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym35$_CB_ENABLE_INFERENCE_MONITORING_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym37$_CB_ASSERT_QUEUE_DEFAULT_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym37$_CB_ASSERT_QUEUE_DEFAULT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym38$_CB_SEPARATE_ASSERTION_FRAME_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym40$_CB_USER_TOOLBAR_LINKS_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym40$_CB_USER_TOOLBAR_LINKS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym43$_CB_SEPARATE_DOC_FRAME_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym43$_CB_SEPARATE_DOC_FRAME_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym45$_CB_KE_TEXT_MODE_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym45$_CB_KE_TEXT_MODE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym46$_CB_FAST__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym46$_CB_FAST__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym50$_CB_DEFAULT_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym50$_CB_DEFAULT_MT_);
        mt_vars.note_mt_var((SubLObject)cb_parameters.$sym50$_CB_DEFAULT_MT_, (SubLObject)cb_parameters.UNPROVIDED);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym51$_CB_EDITING_ENABLED_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_parameters.$sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym53$_SHOW_KB_MONITOR_LINKS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym54$_CB_CONFIRM_KILLS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym57$_CB_SPECIFY_SHOW_GLOSS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym58$_CB_LUCKY_TERM_SEARCH__);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym59$_CB_MTS_FILTER_USE_GENLMT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym60$_CB_USE_KE_REVIEW_CREATORS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym61$_CB_KE_REVIEW_CREATORS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym66$_CB_KE_REVIEW_START_DATE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym68$_CB_KE_REVIEW_END_DATE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym69$_CB_VIEWPOINT_SHOW_DOC_PREDS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym70$_CB_VIEWPOINT_SHOW_BOOK_PREDS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_parameters.$sym71$_CB_GLOB_);
        Hashtables.sethash((SubLObject)cb_parameters.$kw82$MINI_LOGO, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_parameters.$str83$mini_logo_gif, (SubLObject)cb_parameters.NIL));
        access_macros.register_macro_helper((SubLObject)cb_parameters.$sym84$CB_HEAD_SHORTCUT_ICON, (SubLObject)cb_parameters.$sym85$CB_HEAD);
        access_macros.register_macro_helper((SubLObject)cb_parameters.$sym91$CYC_CGI_URL_INT, (SubLObject)cb_parameters.$sym92$CYC_CGI_URL);
        return (SubLObject)cb_parameters.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_parameters_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_parameters_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_parameters_file();
    }
    
    static {
        me = (SubLFile)new cb_parameters();
        cb_parameters.$transcript_file_shorthand$ = null;
        cb_parameters.$cb_include_help$ = null;
        cb_parameters.$cb_include_inference_helpP$ = null;
        cb_parameters.$cb_c_default_content$ = null;
        cb_parameters.$cb_c_maximal_upper_bound$ = null;
        cb_parameters.$cb_c_assertion_formulas_display$ = null;
        cb_parameters.$cb_constant_history_max$ = null;
        cb_parameters.$cb_use_categorized_historyP$ = null;
        cb_parameters.$cb_constant_history_chronological_max$ = null;
        cb_parameters.$cb_constant_history$ = null;
        cb_parameters.$cb_nat_history_max$ = null;
        cb_parameters.$cb_nat_history$ = null;
        cb_parameters.$cb_assertion_history_max$ = null;
        cb_parameters.$cb_assertion_history$ = null;
        cb_parameters.$cb_sentence_history_max$ = null;
        cb_parameters.$cb_sentence_history$ = null;
        cb_parameters.$cb_history_show_el_formulasP$ = null;
        cb_parameters.$cb_status_update_interval$ = null;
        cb_parameters.$cb_destroy_all_inferences_but_last_n_default$ = null;
        cb_parameters.$cb_destroy_all_inferences_but_last_n$ = null;
        cb_parameters.$cb_perform_argumentation_for_closed_queryP$ = null;
        cb_parameters.$cb_c_wrap_assertions$ = null;
        cb_parameters.$cb_a_show_el_formula$ = null;
        cb_parameters.$cb_a_show_hl_formula$ = null;
        cb_parameters.$cb_a_edit_preserve_meta_assertions_by_defaultP$ = null;
        cb_parameters.$cb_a_change_all_meta_assertions_mt_by_defaultP$ = null;
        cb_parameters.$cb_a_perform_access_diagnostics$ = null;
        cb_parameters.$cb_a_show_english$ = null;
        cb_parameters.$cb_wrap_interactor$ = null;
        cb_parameters.$cb_a_show_newlines_in_string_args$ = null;
        cb_parameters.$cb_use_gke_to_edit_el_sentences$ = null;
        cb_parameters.$cb_use_dynamic_table_for_inference_results$ = null;
        cb_parameters.$cb_show_cyclify_button$ = null;
        cb_parameters.$cb_enable_inference_monitoring$ = null;
        cb_parameters.$cb_assert_queue_default$ = null;
        cb_parameters.$cb_separate_assertion_frame$ = null;
        cb_parameters.$cb_user_toolbar_links$ = null;
        cb_parameters.$cb_separate_doc_frame$ = null;
        cb_parameters.$cb_more_assertion_marker_image_text$ = null;
        cb_parameters.$cb_ke_text_mode$ = null;
        cb_parameters.$cb_fastP$ = null;
        cb_parameters.$cb_max_assertions_non_collapsed$ = null;
        cb_parameters.$cb_default_mt$ = null;
        cb_parameters.$cb_editing_enabled$ = null;
        cb_parameters.$cb_js_sentence_editor_enabled$ = null;
        cb_parameters.$show_kb_monitor_links$ = null;
        cb_parameters.$cb_confirm_kills$ = null;
        cb_parameters.$cb_assertion_indexical$ = null;
        cb_parameters.$cb_specify_show_gloss$ = null;
        cb_parameters.$cb_lucky_term_searchP$ = null;
        cb_parameters.$cb_mts_filter_use_genlmt$ = null;
        cb_parameters.$cb_use_ke_review_creators$ = null;
        cb_parameters.$cb_ke_review_creators$ = null;
        cb_parameters.$cb_c_suppress_body_level_elements$ = null;
        cb_parameters.$cb_c_gaf_arg_last_mt$ = null;
        cb_parameters.$cb_c_gaf_arg_use_binary$ = null;
        cb_parameters.$cb_c_nart_arg_use_binary$ = null;
        cb_parameters.$cb_c_formula_display_exception_index_hook$ = null;
        cb_parameters.$cb_show_el_assertion_readably_last_formula$ = null;
        cb_parameters.$cb_show_el_assertion_readably_last_mt$ = null;
        cb_parameters.$cb_assertion_el_formula_cache$ = null;
        cb_parameters.$cb_default_term_frame$ = null;
        cb_parameters.$cb_default_assertion_frame$ = null;
        cb_parameters.$cb_assertion_link_hook$ = null;
        cb_parameters.$cb_constant_input_width$ = null;
        cb_parameters.$cb_hlmt_input_width$ = null;
        cb_parameters.$cb_nonreviewable_assertion_markers$ = null;
        cb_parameters.$cb_ke_review_start_date$ = null;
        cb_parameters.$cb_ke_review_end_date$ = null;
        cb_parameters.$cb_viewpoint_show_doc_preds$ = null;
        cb_parameters.$cb_viewpoint_show_book_preds$ = null;
        cb_parameters.$cb_permit_robots_to_followP$ = null;
        cb_parameters.$cb_permit_robots_to_indexP$ = null;
        cb_parameters.$cb_glob$ = null;
        cb_parameters.$cb_form_url_prefix_print$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("read"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-TRANSCRIPT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("write"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-TRANSCRIPT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("local"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-TRANSCRIPT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("master"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MASTER-TRANSCRIPT"))));
        $sym1$_CB_INCLUDE_HELP_ = SubLObjectFactory.makeSymbol("*CB-INCLUDE-HELP*");
        $sym2$_CB_INCLUDE_INFERENCE_HELP__ = SubLObjectFactory.makeSymbol("*CB-INCLUDE-INFERENCE-HELP?*");
        $kw3$MAXIMAL = SubLObjectFactory.makeKeyword("MAXIMAL");
        $sym4$_CB_C_DEFAULT_CONTENT_ = SubLObjectFactory.makeSymbol("*CB-C-DEFAULT-CONTENT*");
        $int5$30 = SubLObjectFactory.makeInteger(30);
        $sym6$_CB_C_MAXIMAL_UPPER_BOUND_ = SubLObjectFactory.makeSymbol("*CB-C-MAXIMAL-UPPER-BOUND*");
        $kw7$HL_FORMULAS = SubLObjectFactory.makeKeyword("HL-FORMULAS");
        $sym8$_CB_C_ASSERTION_FORMULAS_DISPLAY_ = SubLObjectFactory.makeSymbol("*CB-C-ASSERTION-FORMULAS-DISPLAY*");
        $sym9$_CB_CONSTANT_HISTORY_MAX_ = SubLObjectFactory.makeSymbol("*CB-CONSTANT-HISTORY-MAX*");
        $sym10$_CB_USE_CATEGORIZED_HISTORY__ = SubLObjectFactory.makeSymbol("*CB-USE-CATEGORIZED-HISTORY?*");
        $sym11$_CB_CONSTANT_HISTORY_CHRONOLOGICAL_MAX_ = SubLObjectFactory.makeSymbol("*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*");
        $sym12$_CB_CONSTANT_HISTORY_ = SubLObjectFactory.makeSymbol("*CB-CONSTANT-HISTORY*");
        $sym13$_CB_NAT_HISTORY_MAX_ = SubLObjectFactory.makeSymbol("*CB-NAT-HISTORY-MAX*");
        $sym14$_CB_NAT_HISTORY_ = SubLObjectFactory.makeSymbol("*CB-NAT-HISTORY*");
        $sym15$_CB_ASSERTION_HISTORY_MAX_ = SubLObjectFactory.makeSymbol("*CB-ASSERTION-HISTORY-MAX*");
        $sym16$_CB_ASSERTION_HISTORY_ = SubLObjectFactory.makeSymbol("*CB-ASSERTION-HISTORY*");
        $sym17$_CB_SENTENCE_HISTORY_MAX_ = SubLObjectFactory.makeSymbol("*CB-SENTENCE-HISTORY-MAX*");
        $sym18$_CB_SENTENCE_HISTORY_ = SubLObjectFactory.makeSymbol("*CB-SENTENCE-HISTORY*");
        $sym19$_CB_HISTORY_SHOW_EL_FORMULAS__ = SubLObjectFactory.makeSymbol("*CB-HISTORY-SHOW-EL-FORMULAS?*");
        $sym20$_CB_STATUS_UPDATE_INTERVAL_ = SubLObjectFactory.makeSymbol("*CB-STATUS-UPDATE-INTERVAL*");
        $sym21$_CB_DESTROY_ALL_INFERENCES_BUT_LAST_N_ = SubLObjectFactory.makeSymbol("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*");
        $sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__ = SubLObjectFactory.makeSymbol("*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*");
        $sym23$_CB_C_WRAP_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*CB-C-WRAP-ASSERTIONS*");
        $sym24$_CB_A_SHOW_EL_FORMULA_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-EL-FORMULA*");
        $sym25$_CB_A_SHOW_HL_FORMULA_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-HL-FORMULA*");
        $sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ = SubLObjectFactory.makeSymbol("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*");
        $sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ = SubLObjectFactory.makeSymbol("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*");
        $sym28$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ = SubLObjectFactory.makeSymbol("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*");
        $sym29$_CB_A_SHOW_ENGLISH_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-ENGLISH*");
        $sym30$_CB_WRAP_INTERACTOR_ = SubLObjectFactory.makeSymbol("*CB-WRAP-INTERACTOR*");
        $sym31$_CB_A_SHOW_NEWLINES_IN_STRING_ARGS_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*");
        $sym32$_CB_USE_GKE_TO_EDIT_EL_SENTENCES_ = SubLObjectFactory.makeSymbol("*CB-USE-GKE-TO-EDIT-EL-SENTENCES*");
        $sym33$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ = SubLObjectFactory.makeSymbol("*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*");
        $sym34$_CB_SHOW_CYCLIFY_BUTTON_ = SubLObjectFactory.makeSymbol("*CB-SHOW-CYCLIFY-BUTTON*");
        $sym35$_CB_ENABLE_INFERENCE_MONITORING_ = SubLObjectFactory.makeSymbol("*CB-ENABLE-INFERENCE-MONITORING*");
        $kw36$LOCAL = SubLObjectFactory.makeKeyword("LOCAL");
        $sym37$_CB_ASSERT_QUEUE_DEFAULT_ = SubLObjectFactory.makeSymbol("*CB-ASSERT-QUEUE-DEFAULT*");
        $sym38$_CB_SEPARATE_ASSERTION_FRAME_ = SubLObjectFactory.makeSymbol("*CB-SEPARATE-ASSERTION-FRAME*");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("system.common.browser.tools.cb-user-toolbar-links"));
        $sym40$_CB_USER_TOOLBAR_LINKS_ = SubLObjectFactory.makeSymbol("*CB-USER-TOOLBAR-LINKS*");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HISTORY"), (SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeKeyword("COMPOSE"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeKeyword("NAVIGATOR"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"));
        $kw42$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $sym43$_CB_SEPARATE_DOC_FRAME_ = SubLObjectFactory.makeSymbol("*CB-SEPARATE-DOC-FRAME*");
        $sym44$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ = SubLObjectFactory.makeSymbol("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*");
        $sym45$_CB_KE_TEXT_MODE_ = SubLObjectFactory.makeSymbol("*CB-KE-TEXT-MODE*");
        $sym46$_CB_FAST__ = SubLObjectFactory.makeSymbol("*CB-FAST?*");
        $int47$50 = SubLObjectFactory.makeInteger(50);
        $sym48$_CB_MAX_ASSERTIONS_NON_COLLAPSED_ = SubLObjectFactory.makeSymbol("*CB-MAX-ASSERTIONS-NON-COLLAPSED*");
        $const49$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym50$_CB_DEFAULT_MT_ = SubLObjectFactory.makeSymbol("*CB-DEFAULT-MT*");
        $sym51$_CB_EDITING_ENABLED_ = SubLObjectFactory.makeSymbol("*CB-EDITING-ENABLED*");
        $sym52$_CB_JS_SENTENCE_EDITOR_ENABLED_ = SubLObjectFactory.makeSymbol("*CB-JS-SENTENCE-EDITOR-ENABLED*");
        $sym53$_SHOW_KB_MONITOR_LINKS_ = SubLObjectFactory.makeSymbol("*SHOW-KB-MONITOR-LINKS*");
        $sym54$_CB_CONFIRM_KILLS_ = SubLObjectFactory.makeSymbol("*CB-CONFIRM-KILLS*");
        $const55$TheAssertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheAssertionSentence"));
        $sym56$NONE = SubLObjectFactory.makeSymbol("NONE");
        $sym57$_CB_SPECIFY_SHOW_GLOSS_ = SubLObjectFactory.makeSymbol("*CB-SPECIFY-SHOW-GLOSS*");
        $sym58$_CB_LUCKY_TERM_SEARCH__ = SubLObjectFactory.makeSymbol("*CB-LUCKY-TERM-SEARCH?*");
        $sym59$_CB_MTS_FILTER_USE_GENLMT_ = SubLObjectFactory.makeSymbol("*CB-MTS-FILTER-USE-GENLMT*");
        $sym60$_CB_USE_KE_REVIEW_CREATORS_ = SubLObjectFactory.makeSymbol("*CB-USE-KE-REVIEW-CREATORS*");
        $sym61$_CB_KE_REVIEW_CREATORS_ = SubLObjectFactory.makeSymbol("*CB-KE-REVIEW-CREATORS*");
        $kw62$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $int63$40 = SubLObjectFactory.makeInteger(40);
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DERIVED"), (SubLObject)SubLObjectFactory.makeKeyword("CODE"));
        $int65$19990921 = SubLObjectFactory.makeInteger(19990921);
        $sym66$_CB_KE_REVIEW_START_DATE_ = SubLObjectFactory.makeSymbol("*CB-KE-REVIEW-START-DATE*");
        $int67$29991231 = SubLObjectFactory.makeInteger(29991231);
        $sym68$_CB_KE_REVIEW_END_DATE_ = SubLObjectFactory.makeSymbol("*CB-KE-REVIEW-END-DATE*");
        $sym69$_CB_VIEWPOINT_SHOW_DOC_PREDS_ = SubLObjectFactory.makeSymbol("*CB-VIEWPOINT-SHOW-DOC-PREDS*");
        $sym70$_CB_VIEWPOINT_SHOW_BOOK_PREDS_ = SubLObjectFactory.makeSymbol("*CB-VIEWPOINT-SHOW-BOOK-PREDS*");
        $sym71$_CB_GLOB_ = SubLObjectFactory.makeSymbol("*CB-GLOB*");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw74$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw75$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym76$DO_GLOB = SubLObjectFactory.makeSymbol("DO-GLOB");
        $sym77$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym78$HTML_HEAD = SubLObjectFactory.makeSymbol("HTML-HEAD");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-HEAD-SHORTCUT-ICON"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-META-ROBOT-INSTRUCTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-PERMIT-ROBOTS-TO-INDEX?*"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-PERMIT-ROBOTS-TO-FOLLOW?*"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSS"), (SubLObject)SubLObjectFactory.makeKeyword("CB-CYC"));
        $kw82$MINI_LOGO = SubLObjectFactory.makeKeyword("MINI-LOGO");
        $str83$mini_logo_gif = SubLObjectFactory.makeString("mini-logo.gif");
        $sym84$CB_HEAD_SHORTCUT_ICON = SubLObjectFactory.makeSymbol("CB-HEAD-SHORTCUT-ICON");
        $sym85$CB_HEAD = SubLObjectFactory.makeSymbol("CB-HEAD");
        $str86$SHORTCUT_ICON = SubLObjectFactory.makeString("SHORTCUT ICON");
        $sym87$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-CGI-URL-INT"));
        $str89$_ = SubLObjectFactory.makeString("?");
        $sym90$CYC_CGI_RELATIVE_URL = SubLObjectFactory.makeSymbol("CYC-CGI-RELATIVE-URL");
        $sym91$CYC_CGI_URL_INT = SubLObjectFactory.makeSymbol("CYC-CGI-URL-INT");
        $sym92$CYC_CGI_URL = SubLObjectFactory.makeSymbol("CYC-CGI-URL");
        $str93$_cb_start_ = SubLObjectFactory.makeString("?cb-start|");
        $str94$_ = SubLObjectFactory.makeString(":");
        $str95$_a_ = SubLObjectFactory.makeString("/a/");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-METHOD-POST*")), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym97$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $sym98$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym99$CB_FRAME_NAME = SubLObjectFactory.makeSymbol("CB-FRAME-NAME");
        $sym100$HTML_FANCY_FORM = SubLObjectFactory.makeSymbol("HTML-FANCY-FORM");
        $sym101$_CYC_CGI_PROGRAM_ = SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)cb_parameters.T), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-METHOD-POST*")), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym103$CB_BASIC_FORM = SubLObjectFactory.makeSymbol("CB-BASIC-FORM");
        $sym104$HTML_HIDDEN_INPUT = SubLObjectFactory.makeSymbol("HTML-HIDDEN-INPUT");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("MAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)cb_parameters.NIL), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRS"));
        $sym106$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $sym107$HTML_FANCY_ANCHOR = SubLObjectFactory.makeSymbol("HTML-FANCY-ANCHOR");
        $kw108$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw109$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $kw110$HREF = SubLObjectFactory.makeKeyword("HREF");
        $kw111$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $kw112$ATTRS = SubLObjectFactory.makeKeyword("ATTRS");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)cb_parameters.NIL));
        $sym114$FRAME_LINK = SubLObjectFactory.makeSymbol("FRAME-LINK");
        $kw115$TOP = SubLObjectFactory.makeKeyword("TOP");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("MAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)cb_parameters.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)cb_parameters.NIL));
        $sym117$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $kw118$ID = SubLObjectFactory.makeKeyword("ID");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeString("")));
        $str120$ = SubLObjectFactory.makeString("");
        $sym121$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $sym122$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $kw123$ONCLICK = SubLObjectFactory.makeKeyword("ONCLICK");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("window.open('"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("',"));
        $sym126$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym127$HTML_FORMAT = SubLObjectFactory.makeSymbol("HTML-FORMAT");
        $str128$__A_ = SubLObjectFactory.makeString("'~A'");
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("null")));
        $str130$___A____ = SubLObjectFactory.makeString(",'~A'); ");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("return false;")));
        $sym132$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("MAIN")), (SubLObject)SubLObjectFactory.makeSymbol("HOVEROVER-HTML"), (SubLObject)SubLObjectFactory.makeSymbol("CAPTION"), (SubLObject)SubLObjectFactory.makeSymbol("WIDTH"), (SubLObject)SubLObjectFactory.makeSymbol("STICKY"));
        $sym134$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JAVASCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("OVERLIB"));
        $sym136$HTML_HOVEROVER_ANCHOR = SubLObjectFactory.makeSymbol("HTML-HOVEROVER-ANCHOR");
        $kw137$HOVEROVER_HTML = SubLObjectFactory.makeKeyword("HOVEROVER-HTML");
        $kw138$CAPTION = SubLObjectFactory.makeKeyword("CAPTION");
        $kw139$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw140$STICKY = SubLObjectFactory.makeKeyword("STICKY");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str142$CB_LINK__A = SubLObjectFactory.makeString("CB-LINK-~A");
        $sym143$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym144$SETUP_CB_LINK_METHOD = SubLObjectFactory.makeSymbol("SETUP-CB-LINK-METHOD");
        $sym145$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOOL-LINK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("URL-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("MAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)cb_parameters.NIL));
        $sym147$PWHEN_FEATURE = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $kw148$CYC_OPENCYC = SubLObjectFactory.makeKeyword("CYC-OPENCYC");
        $sym149$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym150$CB_ICON_EXISTS_ = SubLObjectFactory.makeSymbol("CB-ICON-EXISTS?");
        $sym151$CB_ICON = SubLObjectFactory.makeSymbol("CB-ICON");
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-BR")));
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HOOK"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-MT?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym154$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_ = SubLObjectFactory.makeSymbol("CB-SHOW-EL-FORMULAS-FOR-HOOK?");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY")));
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK-WITH-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK")));
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*"), (SubLObject)cb_parameters.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*"), (SubLObject)cb_parameters.NIL));
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HOOK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list160 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK-BINARY")));
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TITLE"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("COMPLETION?"), SubLObjectFactory.makeSymbol("PASSWORD?"), SubLObjectFactory.makeSymbol("DHTML?"), SubLObjectFactory.makeSymbol("HELP"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOW-COPYRIGHT"), (SubLObject)cb_parameters.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OMIT-HEADING?"), (SubLObject)cb_parameters.NIL) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETION?"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD?"), (SubLObject)SubLObjectFactory.makeKeyword("DHTML?"), (SubLObject)SubLObjectFactory.makeKeyword("HELP"), (SubLObject)SubLObjectFactory.makeKeyword("COLOR"), (SubLObject)SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("OMIT-HEADING?"));
        $kw163$COMPLETION_ = SubLObjectFactory.makeKeyword("COMPLETION?");
        $kw164$PASSWORD_ = SubLObjectFactory.makeKeyword("PASSWORD?");
        $kw165$DHTML_ = SubLObjectFactory.makeKeyword("DHTML?");
        $kw166$HELP = SubLObjectFactory.makeKeyword("HELP");
        $kw167$COLOR = SubLObjectFactory.makeKeyword("COLOR");
        $sym168$_HTML_DEFAULT_BGCOLOR_ = SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*");
        $kw169$SHOW_COPYRIGHT = SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT");
        $kw170$OMIT_HEADING_ = SubLObjectFactory.makeKeyword("OMIT-HEADING?");
        $sym171$TITLE_VAR = SubLObjectFactory.makeUninternedSymbol("TITLE-VAR");
        $sym172$WITH_HTML_ID_SPACE = SubLObjectFactory.makeSymbol("WITH-HTML-ID-SPACE");
        $sym173$HTML_DOCUMENT = SubLObjectFactory.makeSymbol("HTML-DOCUMENT");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-BASIC-CB-SCRIPTS"));
        $sym175$HTML_TITLE = SubLObjectFactory.makeSymbol("HTML-TITLE");
        $sym176$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-COMPLETE-SCRIPT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSS"), (SubLObject)SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS")));
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JAVASCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("SHA1")));
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));
        $sym180$HTML_FANCY_BODY = SubLObjectFactory.makeSymbol("HTML-FANCY-BODY");
        $kw181$BACKGROUND_COLOR = SubLObjectFactory.makeKeyword("BACKGROUND-COLOR");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-DIV"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeString("reloadFrameButton")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-INPUT"), (SubLObject)SubLObjectFactory.makeString("button"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("reload"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("Refresh Frames")));
        $sym183$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym184$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym185$HTML_HEADING = SubLObjectFactory.makeSymbol("HTML-HEADING");
        $list186 = ConsesLow.list((SubLObject)cb_parameters.TWO_INTEGER);
        $sym187$CB_HELP_PREAMBLE = SubLObjectFactory.makeSymbol("CB-HELP-PREAMBLE");
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT")));
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETION?"), (SubLObject)SubLObjectFactory.makeSymbol("DHTML?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETION?"), (SubLObject)SubLObjectFactory.makeKeyword("DHTML?"), (SubLObject)SubLObjectFactory.makeKeyword("COLOR"));
        $sym192$TITLE_VAR = SubLObjectFactory.makeUninternedSymbol("TITLE-VAR");
        $list193 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-COMPLETE-SCRIPT")));
        $list194 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-DOM-SCRIPT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-DIV"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeString("reloadFrameButton")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-INPUT"), (SubLObject)SubLObjectFactory.makeString("button"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("reload"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("Refresh"), (SubLObject)SubLObjectFactory.makeKeyword("ONCLICK"), (SubLObject)SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');")));
        $sym196$CB_C_CONTENT_PAGE = SubLObjectFactory.makeSymbol("CB-C-CONTENT-PAGE");
        $kw197$CYC_PPH = SubLObjectFactory.makeKeyword("CYC-PPH");
        $sym198$WITH_PPH_MEMOIZATION = SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-PARAPHRASE-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARAPHRASE-MODE*"), (SubLObject)SubLObjectFactory.makeKeyword("HTML")));
    }
}

/*

	Total time: 401 ms
	
*/