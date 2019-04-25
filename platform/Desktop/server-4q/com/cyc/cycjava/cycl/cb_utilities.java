package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_fractions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_utilities";
  public static final String myFingerPrint = "de22c07dc6ce5c655d6fbadab32b8e8c345bbc47d8b9b41f2dfb3bd64bbffab8";
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
  private static SubLSymbol $cb_html_for_cyclist_in_nl_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7041L)
  private static SubLSymbol $cb_available_tools$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 9052L)
  private static SubLSymbol $cb_c_definitional_type_pred_map$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 12688L)
  private static SubLSymbol $cb_max_mts_to_sort_temporally$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 16624L)
  private static SubLSymbol $cb_back_button_predefined_script$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 16822L)
  private static SubLSymbol $cb_back_button_script$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 17482L)
  private static SubLSymbol $cb_frame_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 21732L)
  private static SubLSymbol $max_cb_link_arg_count$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22886L)
  public static SubLSymbol $cb_default_fort_handler$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22994L)
  public static SubLSymbol $cb_default_fort_link_emitter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 23221L)
  public static SubLSymbol $cb_show_constant_hash_dollar_prefixP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 24744L)
  public static SubLSymbol $cb_term_id$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 25987L)
  public static SubLSymbol $cb_default_naut_handler$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
  private static SubLSymbol $html_saturated_red_color_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
  private static SubLSymbol $html_saturated_green_color_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
  private static SubLSymbol $generate_phrase_for_cyclist_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36776L)
  public static SubLSymbol $cb_just_did_nat$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36849L)
  public static SubLSymbol $cb_just_did_quote$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36888L)
  public static SubLSymbol $cb_inside_quoteP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36926L)
  public static SubLSymbol $cb_inside_naut$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36962L)
  public static SubLSymbol $cb_inside_naut_support_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37057L)
  public static SubLSymbol $cb_form_cons_suppress_newline$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37109L)
  public static SubLSymbol $cb_form_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37386L)
  public static SubLSymbol $rule_unlabelled_dont_care_variables$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 39068L)
  public static SubLSymbol $allow_cb_assertion_for_the_assertion_sentence_replacementP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 39178L)
  public static SubLSymbol $cb_assertion_for_the_assertion_sentence_replacement$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41303L)
  private static SubLSymbol $cb_string_length_wrap$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41764L)
  private static SubLSymbol $cb_wrap_after_arg_1$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41831L)
  public static SubLSymbol $cb_form_cons_methods_active$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42285L)
  private static SubLSymbol $cb_form_cons_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42438L)
  private static SubLSymbol $cb_form_cons_methods_by_keyword$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLSymbol $dtp_cb_form_cons_method$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44465L)
  private static SubLSymbol $always_active_cb_form_cons_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 46684L)
  private static SubLSymbol $cb_form_suppress_naut_link_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47027L)
  private static SubLSymbol $cb_just_did_naut$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47113L)
  public static SubLSymbol $cb_formula_argument_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52026L)
  public static SubLSymbol $cb_display_dates_as_stringsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 53582L)
  public static SubLSymbol $cb_display_decimals_as_decimalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55055L)
  public static SubLSymbol $cb_display_fractions_as_fractionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 61965L)
  public static SubLSymbol $assertion_filter_hook$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72747L)
  public static SubLSymbol $cb_constant_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72796L)
  public static SubLSymbol $cb_nart_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72843L)
  public static SubLSymbol $cb_assertion_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72892L)
  private static SubLSymbol $cb_assertion_id_prefix_length$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72979L)
  public static SubLSymbol $cb_image_independent_fort_identifiersP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 73178L)
  public static SubLSymbol $cb_image_independent_id_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 73359L)
  public static SubLSymbol $cb_image_independent_constant_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 73554L)
  public static SubLSymbol $cb_image_independent_nart_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82286L)
  private static SubLSymbol $cb_naut_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82345L)
  private static SubLSymbol $cb_naut_id_prefix_length$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83908L)
  private static SubLSymbol $cb_sentence_id_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83979L)
  private static SubLSymbol $cb_sentence_id_prefix_length$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 92387L)
  private static SubLSymbol $html_unmatched_parenthesis_color$;
  private static final SubLString $str0$_a__a;
  private static final SubLString $str1$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str2$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw3$UNINITIALIZED;
  private static final SubLString $str4$Cyc_error;
  private static final SubLString $str5$_A;
  private static final SubLInteger $int6$2000;
  private static final SubLSymbol $kw7$SELF;
  private static final SubLString $str8$Back_to_previous__stale__page;
  private static final SubLString $str9$Back_to_previous_page;
  private static final SubLSymbol $kw10$CB_CYC;
  private static final SubLSymbol $kw11$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw12$SHA1;
  private static final SubLString $str13$yui_skin_sam;
  private static final SubLString $str14$reloadFrameButton;
  private static final SubLString $str15$button;
  private static final SubLString $str16$reload;
  private static final SubLString $str17$Refresh_Frames;
  private static final SubLString $str18$Back_to__stale__;
  private static final SubLString $str19$_page;
  private static final SubLSymbol $kw20$TRUE;
  private static final SubLString $str21$True;
  private static final SubLSymbol $kw22$FALSE;
  private static final SubLString $str23$False;
  private static final SubLSymbol $kw24$UNKNOWN;
  private static final SubLString $str25$Unknown;
  private static final SubLString $str26$___;
  private static final SubLSymbol $kw27$DEFAULT;
  private static final SubLString $str28$Default;
  private static final SubLSymbol $kw29$MONOTONIC;
  private static final SubLString $str30$Monotonic;
  private static final SubLSymbol $kw31$FORWARD;
  private static final SubLString $str32$Forward;
  private static final SubLSymbol $kw33$BACKWARD;
  private static final SubLString $str34$Backward;
  private static final SubLSymbol $kw35$CODE;
  private static final SubLString $str36$Code;
  private static final SubLString $str37$_S;
  private static final SubLInteger $int38$30;
  private static final SubLString $str39$_A__A___A;
  private static final SubLSymbol $sym40$CB_HTML_FOR_CYCLIST_IN_NL;
  private static final SubLSymbol $sym41$HTML_GENERATE_PHRASE;
  private static final SubLSymbol $sym42$_CB_HTML_FOR_CYCLIST_IN_NL_CACHING_STATE_;
  private static final SubLString $str43$ref_renames_kills_html;
  private static final SubLString $str44$ref_cycl_syntax_html_naming_conve;
  private static final SubLString $str45$toc_html;
  private static final SubLString $str46$__For_detailed_help_and_warnings_;
  private static final SubLString $str47$_;
  private static final SubLString $str48$_documentation_;
  private static final SubLString $str49$Yes;
  private static final SubLString $str50$No;
  private static final SubLSymbol $sym51$_CB_AVAILABLE_TOOLS_;
  private static final SubLSymbol $kw52$DEPRECATED;
  private static final SubLSymbol $sym53$NOT_EQL;
  private static final SubLSymbol $sym54$FIFTH;
  private static final SubLSymbol $kw55$STANDARD;
  private static final SubLSymbol $sym56$CAR;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const59$EverythingPSC;
  private static final SubLSymbol $sym60$VALID_FORT_;
  private static final SubLSymbol $sym61$POTENTIALLY_INFINITE_INTEGER__;
  private static final SubLSymbol $sym62$MT_START_UNIVERSAL_TIME_EXTENDED;
  private static final SubLSymbol $sym63$MT_END_UNIVERSAL_TIME_EXTENDED;
  private static final SubLSymbol $kw64$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym65$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym66$_EXIT;
  private static final SubLSymbol $sym67$GET_MT_TIME_INTERVAL_MEMOIZED;
  private static final SubLSymbol $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED;
  private static final SubLObject $const69$Now;
  private static final SubLList $list70;
  private static final SubLObject $const71$SecondsDuration;
  private static final SubLSymbol $sym72$_;
  private static final SubLString $str73$onClick___A_history_back____;
  private static final SubLString $str74$onClick__var_frame_name_____A___i;
  private static final SubLString $str75$Back;
  private static final SubLSymbol $kw76$TOP;
  private static final SubLString $str77$top;
  private static final SubLSymbol $kw78$PARENT;
  private static final SubLString $str79$parent;
  private static final SubLSymbol $sym80$_CB_FRAME_TABLE_;
  private static final SubLSymbol $sym81$KEYWORDP;
  private static final SubLSymbol $sym82$STRINGP;
  private static final SubLString $str83$no;
  private static final SubLSymbol $sym84$FIRST;
  private static final SubLSymbol $kw85$MAIN;
  private static final SubLString $str86$cb_login;
  private static final SubLString $str87$cb_history;
  private static final SubLString $str88$;
  private static final SubLList $list89;
  private static final SubLString $str90$_;
  private static final SubLString $str91$_;
  private static final SubLList $list92;
  private static final SubLString $str93$_self;
  private static final SubLString $str94$_parent;
  private static final SubLString $str95$_top;
  private static final SubLSymbol $kw96$BLANK;
  private static final SubLString $str97$_blank;
  private static final SubLSymbol $kw98$NEW;
  private static final SubLString $str99$_new;
  private static final SubLSymbol $kw100$DOC;
  private static final SubLString $str101$doc;
  private static final SubLSymbol $kw102$COMPLETION;
  private static final SubLString $str103$completion;
  private static final SubLSymbol $kw104$TOOLBAR;
  private static final SubLString $str105$toolbar;
  private static final SubLString $str106$cb_toolbar_frame;
  private static final SubLString $str107$cyc_main;
  private static final SubLString $str108$cb_main_frame;
  private static final SubLString $str109$__a;
  private static final SubLSymbol $kw110$STATUS;
  private static final SubLString $str111$status;
  private static final SubLString $str112$cb_status_frame;
  private static final SubLSymbol $kw113$INDEX;
  private static final SubLString $str114$index;
  private static final SubLString $str115$cb_index_frame;
  private static final SubLSymbol $kw116$CONTENT;
  private static final SubLString $str117$content;
  private static final SubLString $str118$cb_content_frame;
  private static final SubLSymbol $kw119$EMPTY;
  private static final SubLString $str120$empty;
  private static final SubLString $str121$cb_empty_frame;
  private static final SubLSymbol $kw122$SETUP;
  private static final SubLString $str123$setup;
  private static final SubLString $str124$cb_setup_frame;
  private static final SubLSymbol $kw125$INF_INDEX;
  private static final SubLString $str126$inf_index;
  private static final SubLString $str127$cb_inf_index_frame;
  private static final SubLSymbol $kw128$INF_CONTENT;
  private static final SubLString $str129$inf_content;
  private static final SubLString $str130$cb_inf_content_frame;
  private static final SubLString $str131$No_cb_link_method_for__S_defined;
  private static final SubLSymbol $sym132$SYMBOLP;
  private static final SubLSymbol $sym133$FIXNUMP;
  private static final SubLString $str134$Too_many_args_in__S___max_of__S_a;
  private static final SubLSymbol $kw135$CB_LINK_METHOD;
  private static final SubLSymbol $kw136$CB_LINK_MAX_ARGS;
  private static final SubLString $str137$cb_cf;
  private static final SubLSymbol $sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__;
  private static final SubLString $str139$const;
  private static final SubLSymbol $kw140$FORT;
  private static final SubLSymbol $kw141$CONSTANT;
  private static final SubLString $str142$cb_start_;
  private static final SubLString $str143$_a__a;
  private static final SubLString $str144$obsolete;
  private static final SubLString $str145$__;
  private static final SubLSymbol $kw146$TERM_CONTEXT_MENU;
  private static final SubLSymbol $sym147$CB_LINK_CONSTANT;
  private static final SubLSymbol $kw148$NAT;
  private static final SubLString $str149$nat_png;
  private static final SubLSymbol $kw150$NART;
  private static final SubLString $str151$nart_png;
  private static final SubLString $str152$_;
  private static final SubLString $str153$_;
  private static final SubLString $str154$absmiddle;
  private static final SubLString $str155$cycl;
  private static final SubLSymbol $sym156$CB_LINK_NART;
  private static final SubLSymbol $sym157$CB_LINK_NAT;
  private static final SubLString $str158$cb_naut_frame;
  private static final SubLSymbol $kw159$NAUT;
  private static final SubLSymbol $sym160$CB_LINK_NAUT;
  private static final SubLString $str161$href;
  private static final SubLSymbol $kw162$LEXICON;
  private static final SubLSymbol $sym163$CB_LINK_LEXICON;
  private static final SubLString $str164$_NART_;
  private static final SubLString $str165$_NART_;
  private static final SubLString $str166$_;
  private static final SubLSymbol $kw167$UNNAMED;
  private static final SubLSymbol $sym168$CB_LINK_UNNAMED;
  private static final SubLString $str169$cb_af;
  private static final SubLString $str170$cb_start_cb_af;
  private static final SubLSymbol $kw171$ASSERTION;
  private static final SubLSymbol $sym172$CB_LINK_ASSERTION;
  private static final SubLString $str173$_cycid_;
  private static final SubLString $str174$_id_;
  private static final SubLInteger $int175$_30;
  private static final SubLInteger $int176$100;
  private static final SubLInteger $int177$256;
  private static final SubLSymbol $sym178$HTML_SATURATED_RED_COLOR;
  private static final SubLInteger $int179$255;
  private static final SubLString $str180$_C_C0000;
  private static final SubLSymbol $sym181$_HTML_SATURATED_RED_COLOR_CACHING_STATE_;
  private static final SubLSymbol $sym182$HTML_SATURATED_GREEN_COLOR;
  private static final SubLString $str183$00_C_C00;
  private static final SubLSymbol $sym184$_HTML_SATURATED_GREEN_COLOR_CACHING_STATE_;
  private static final SubLString $str185$yellow_gif;
  private static final SubLString $str186$_Def_;
  private static final SubLString $str187$white_gif;
  private static final SubLString $str188$_Mon_;
  private static final SubLSymbol $kw189$DERIVED;
  private static final SubLString $str190$green_gif;
  private static final SubLString $str191$_Inf_;
  private static final SubLString $str192$purple_gif;
  private static final SubLString $str193$_B_;
  private static final SubLString $str194$blue_gif;
  private static final SubLString $str195$_F_;
  private static final SubLSymbol $kw196$REDUNDANT;
  private static final SubLString $str197$cyan_gif;
  private static final SubLString $str198$_R_;
  private static final SubLString $str199$red_gif;
  private static final SubLString $str200$_False_;
  private static final SubLString $str201$pink_gif;
  private static final SubLString $str202$_Code_;
  private static final SubLString $str203$gray_gif;
  private static final SubLString $str204$_Unknown_;
  private static final SubLSymbol $kw205$BACKWARD_GAF;
  private static final SubLString $str206$orange_gif;
  private static final SubLString $str207$_BackwardGAF_;
  private static final SubLString $str208$_monotonic;
  private static final SubLString $str209$_forward;
  private static final SubLString $str210$_backward;
  private static final SubLString $str211$_rule;
  private static final SubLString $str212$_GAF;
  private static final SubLString $str213$_asserted_locally_in_;
  private static final SubLString $str214$_by_;
  private static final SubLString $str215$_on_;
  private static final SubLString $str216$_;
  private static final SubLString $str217$__;
  private static final SubLString $str218$_at_;
  private static final SubLString $str219$_for_;
  private static final SubLString $str220$_and_inferred_by_Cyc;
  private static final SubLString $str221$_inferred_in_;
  private static final SubLSymbol $sym222$CCONCATENATE;
  private static final SubLSymbol $sym223$GENERATE_PHRASE_FOR_CYCLIST;
  private static final SubLSymbol $sym224$_GENERATE_PHRASE_FOR_CYCLIST_CACHING_STATE_;
  private static final SubLSymbol $sym225$CLEAR_GENERATE_PHRASE_FOR_CYCLIST;
  private static final SubLString $str226$cb_sentence;
  private static final SubLString $str227$cb_start_cb_sentence;
  private static final SubLString $str228$_a__a_t;
  private static final SubLSymbol $kw229$SENTENCE;
  private static final SubLSymbol $sym230$CB_LINK_SENTENCE;
  private static final SubLSymbol $kw231$SENTENCE_MARKER;
  private static final SubLString $str232$cyc_logo_3_t_gif;
  private static final SubLString $str233$_CycL_;
  private static final SubLSymbol $kw234$HELP;
  private static final SubLString $str235$help_btn_s_gif;
  private static final SubLString $str236$_Help_;
  private static final SubLString $str237$Use_of_unsupported_legacy_help_sy;
  private static final SubLString $str238$dont_care;
  private static final SubLString $str239$hl_var_dont_care;
  private static final SubLString $str240$hl_var;
  private static final SubLSymbol $sym241$CB_FORM_VARIABLE_METHOD;
  private static final SubLString $str242$el_var_dont_care;
  private static final SubLString $str243$el_var;
  private static final SubLString $str244$keyword;
  private static final SubLString $str245$symbol;
  private static final SubLSymbol $sym246$CB_FORM_SYMBOL_METHOD;
  private static final SubLSymbol $sym247$CB_FORM_CONSTANT_METHOD;
  private static final SubLSymbol $sym248$CB_FORM_NART_METHOD;
  private static final SubLSymbol $sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__;
  private static final SubLObject $const250$TheAssertionSentence;
  private static final SubLSymbol $sym251$CB_FORM_ASSERTION_METHOD;
  private static final SubLString $str252$__INVALID_ASSERTION_;
  private static final SubLInteger $int253$60;
  private static final SubLSymbol $sym254$CB_FORM_STRING_METHOD;
  private static final SubLList $list255;
  private static final SubLSymbol $sym256$_CB_FORM_CONS_METHODS_;
  private static final SubLSymbol $sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_;
  private static final SubLSymbol $sym258$CB_FORM_CONS_METHOD;
  private static final SubLSymbol $sym259$CB_FORM_CONS_METHOD_P;
  private static final SubLList $list260;
  private static final SubLList $list261;
  private static final SubLList $list262;
  private static final SubLList $list263;
  private static final SubLSymbol $sym264$PRINT_CB_FORM_CONS_METHODS;
  private static final SubLSymbol $sym265$CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list266;
  private static final SubLSymbol $sym267$CB_FORM_CONS_METHOD_NAME;
  private static final SubLSymbol $sym268$_CSETF_CB_FORM_CONS_METHOD_NAME;
  private static final SubLSymbol $sym269$CB_FORM_CONS_METHOD_KEYWORD;
  private static final SubLSymbol $sym270$_CSETF_CB_FORM_CONS_METHOD_KEYWORD;
  private static final SubLSymbol $sym271$CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN;
  private static final SubLSymbol $sym272$_CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN;
  private static final SubLSymbol $sym273$CB_FORM_CONS_METHOD_HTML_OUTPUT_FN;
  private static final SubLSymbol $sym274$_CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN;
  private static final SubLSymbol $kw275$NAME;
  private static final SubLSymbol $kw276$KEYWORD;
  private static final SubLSymbol $kw277$APPLICABILITY_TEST_FN;
  private static final SubLSymbol $kw278$HTML_OUTPUT_FN;
  private static final SubLString $str279$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw280$BEGIN;
  private static final SubLSymbol $sym281$MAKE_CB_FORM_CONS_METHOD;
  private static final SubLSymbol $kw282$SLOT;
  private static final SubLSymbol $kw283$END;
  private static final SubLSymbol $sym284$VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD;
  private static final SubLList $list285;
  private static final SubLSymbol $sym286$REGISTER_CB_FORM_CONS_METHOD;
  private static final SubLSymbol $sym287$QUOTE;
  private static final SubLSymbol $sym288$DEFCB_FORM_CONS_METHOD;
  private static final SubLList $list289;
  private static final SubLSymbol $sym290$CLET;
  private static final SubLSymbol $sym291$_CB_FORM_CONS_METHODS_ACTIVE_;
  private static final SubLSymbol $sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE;
  private static final SubLSymbol $sym293$WITH_CB_FORM_CONS_METHODS;
  private static final SubLString $str294$cg_cb_start_;
  private static final SubLSymbol $kw295$RELATIVE;
  private static final SubLSymbol $sym296$CYC_CGI_RELATIVE_URL;
  private static final SubLSymbol $kw297$KEA;
  private static final SubLSymbol $sym298$CYC_CGI_KEA_URL;
  private static final SubLSymbol $kw299$CB;
  private static final SubLSymbol $sym300$CYC_CGI_ABSOLUTE_CB_FRAMED_URL;
  private static final SubLSymbol $sym301$_CB_FORMULA_ARGUMENT_LIMIT_;
  private static final SubLString $str302$_;
  private static final SubLString $str303$____;
  private static final SubLString $str304$___;
  private static final SubLString $str305$font_weight_900;
  private static final SubLString $str306$_;
  private static final SubLSymbol $sym307$DATE;
  private static final SubLList $list308;
  private static final SubLSymbol $kw309$DATE;
  private static final SubLSymbol $sym310$_CB_DISPLAY_DATES_AS_STRINGS__;
  private static final SubLSymbol $sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_;
  private static final SubLSymbol $sym312$CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY;
  private static final SubLString $str313$DateFromStringFn_datetime;
  private static final SubLObject $const314$DateFromStringFn;
  private static final SubLSymbol $sym315$DECIMAL;
  private static final SubLList $list316;
  private static final SubLSymbol $kw317$DECIMAL;
  private static final SubLSymbol $sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__;
  private static final SubLSymbol $sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_;
  private static final SubLSymbol $sym320$CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY;
  private static final SubLSymbol $sym321$FRACTION;
  private static final SubLList $list322;
  private static final SubLSymbol $kw323$FRACTION;
  private static final SubLSymbol $sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__;
  private static final SubLSymbol $sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_;
  private static final SubLSymbol $sym326$CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY;
  private static final SubLSymbol $kw327$THIN_SPACE;
  private static final SubLSymbol $kw328$MINUS;
  private static final SubLSymbol $kw329$FRASL;
  private static final SubLSymbol $sym330$CB_HL_SUPPORT_TO_DISPLAY_;
  private static final SubLSymbol $sym331$CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD;
  private static final SubLList $list332;
  private static final SubLString $str333$Unimplemented_Link;
  private static final SubLString $str334$The_page_for_;
  private static final SubLString $str335$_has_not_yet_been_implemented_;
  private static final SubLSymbol $sym336$CB_UNIMPLEMENTED;
  private static final SubLSymbol $kw337$HTML_HANDLER;
  private static final SubLString $str338$cb_unimplemented__A;
  private static final SubLSymbol $kw339$UNIMPLEMENTED;
  private static final SubLSymbol $sym340$CB_LINK_UNIMPLEMENTED;
  private static final SubLString $str341$_and_;
  private static final SubLString $str342$and_;
  private static final SubLSymbol $sym343$HTML_GENERATE_TEXT;
  private static final SubLSymbol $sym344$HTML_GENERATE_QUESTION;
  private static final SubLInteger $int345$300;
  private static final SubLSymbol $sym346$CB_CF;
  private static final SubLObject $const347$Cyc;
  private static final SubLSymbol $kw348$NL;
  private static final SubLSymbol $kw349$CYCL;
  private static final SubLString $str350$f__;
  private static final SubLString $str351$__;
  private static final SubLString $str352$___;
  private static final SubLString $str353$_in_;
  private static final SubLList $list354;
  private static final SubLSymbol $sym355$PWHEN;
  private static final SubLSymbol $sym356$COR;
  private static final SubLList $list357;
  private static final SubLSymbol $sym358$FUNCALL;
  private static final SubLSymbol $sym359$_ASSERTION_FILTER_HOOK_;
  private static final SubLList $list360;
  private static final SubLSymbol $sym361$PROGN;
  private static final SubLInteger $int362$40;
  private static final SubLSymbol $kw363$NONE;
  private static final SubLString $str364$__claimed_by_;
  private static final SubLSymbol $kw365$HL_SUPPORT;
  private static final SubLString $str366$_module_;
  private static final SubLSymbol $kw367$SILK;
  private static final SubLSymbol $kw368$LEFT;
  private static final SubLSymbol $kw369$MINI_LOGO;
  private static final SubLSymbol $kw370$NBSP;
  private static final SubLString $str371$claimed_by_;
  private static final SubLString $str372$EL_Formula___Mt_Identical_to_Asse;
  private static final SubLString $str373$EL_Formula_Identical_to_Assertion;
  private static final SubLSymbol $sym374$ASSERTION_P;
  private static final SubLString $str375$c;
  private static final SubLString $str376$nart;
  private static final SubLString $str377$a;
  private static final SubLSymbol $sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__;
  private static final SubLString $str379$NIL;
  private static final SubLSymbol $sym380$CB_GUESS_NAT;
  private static final SubLList $list381;
  private static final SubLSymbol $sym382$FORT_P;
  private static final SubLSymbol $sym383$DIGIT_CHAR_P;
  private static final SubLString $str384$_;
  private static final SubLString $str385$naut;
  private static final SubLString $str386$sentence;
  private static final SubLString $str387$_day;
  private static final SubLInteger $int388$10000;
  private static final SubLString $str389$_month;
  private static final SubLString $str390$_year;
  private static final SubLString $str391$Month;
  private static final SubLString $str392$Day;
  private static final SubLString $str393$Year;
  private static final SubLSymbol $kw394$EOF;
  private static final SubLSymbol $kw395$ERROR;
  private static final SubLObject $const396$myReviewer;
  private static final SubLObject $const397$BookkeepingMt;
  private static final SubLSymbol $kw398$RED;
  private static final SubLString $str399$The_following_parentheses_are_unm;
  private static final SubLString $str400$The_following_constants_are_inval;
  private static final SubLString $str401$This_is_unreadable__because_more_;
  private static final SubLString $str402$Trying_to_read_this_generated_an_;
  private static final SubLSymbol $sym403$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P;
  private static final SubLString $str404$The_following_references_to_const;
  private static final SubLSymbol $sym405$CHAR_EQUAL;
  private static final SubLString $str406$in_the_following_string__;
  private static final SubLString $str407$Also__the_following_extra_string_;
  private static final SubLString $str408$The_following_string_did_not_spec;
  private static final SubLString $str409$because__;
  private static final SubLString $str410$____none_selected____;
  private static final SubLSymbol $sym411$_THE_CYCLIST_;
  private static final SubLSymbol $sym412$_CB_NAT_HISTORY_;
  private static final SubLSymbol $sym413$_CB_CONSTANT_HISTORY_;
  private static final SubLSymbol $kw414$ACTIVE_LEFT_ARROW;
  private static final SubLString $str415$back_12_png;
  private static final SubLString $str416$Active_left_arrow;
  private static final SubLSymbol $kw417$INACTIVE_LEFT_ARROW;
  private static final SubLString $str418$back_12_disabled_png;
  private static final SubLString $str419$Inactive_left_arrow;
  private static final SubLSymbol $kw420$ACTIVE_RIGHT_ARROW;
  private static final SubLString $str421$forward_12_png;
  private static final SubLString $str422$Active_right_arrow;
  private static final SubLSymbol $kw423$INACTIVE_RIGHT_ARROW;
  private static final SubLString $str424$forward_12_disabled_png;
  private static final SubLString $str425$Inactive_right_arrow;
  private static final SubLString $str426$_a;
  private static final SubLSymbol $sym427$CB_GUESS_CONSTANT;
  private static final SubLSymbol $kw428$TEST;
  private static final SubLSymbol $kw429$OWNER;
  private static final SubLSymbol $kw430$CLASSES;
  private static final SubLSymbol $kw431$KB;
  private static final SubLSymbol $kw432$TINY;
  private static final SubLSymbol $kw433$WORKING_;
  private static final SubLList $list434;
  private static final SubLSymbol $sym435$CB_GUESS_DATE;
  private static final SubLSymbol $kw436$FULL;
  private static final SubLList $list437;

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 915L)
  public static SubLObject cb_url(final SubLObject handler, SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    if( control_string == UNPROVIDED )
    {
      control_string = NIL;
    }
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str0$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue( thread ), handler );
    if( NIL != control_string )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), control_string, new SubLObject[] { arg1, arg2, arg3, arg4
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1191L)
  public static SubLObject cb_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str4$Cyc_error );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( $str4$Cyc_error );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_macros.verify_not_within_html_pre();
          html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
          final SubLObject _prev_bind_0_$3 = html_macros.$within_html_pre$.currentBinding( thread );
          try
          {
            html_macros.$within_html_pre$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), format_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5
            } );
          }
          finally
          {
            html_macros.$within_html_pre$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
          cb_back_button( UNPROVIDED, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1407L)
  public static SubLObject cb_show_fi_error(final SubLObject fi_error)
  {
    final SubLObject error_string = fi.fi_error_string( fi_error );
    return cb_error( $str5$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1537L)
  public static SubLObject cb_simple_message_page(final SubLObject message, SubLObject back, SubLObject delay)
  {
    if( back == UNPROVIDED )
    {
      back = ONE_INTEGER;
    }
    if( delay == UNPROVIDED )
    {
      delay = $int6$2000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_space, UNPROVIDED );
        if( back.isInteger() )
        {
          html_script_utilities.html_back_onload_script( delay );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( message );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$4, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1856L)
  public static SubLObject cb_history_with_back_link(SubLObject back_staleP)
  {
    if( back_staleP == UNPROVIDED )
    {
      back_staleP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      if( NIL != back_staleP )
      {
        cb_back_button( $kw7$SELF, $str8$Back_to_previous__stale__page );
      }
      else
      {
        cb_back_button( $kw7$SELF, $str9$Back_to_previous_page );
      }
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      cb_tools.cb_show_history_info( UNPROVIDED );
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 2223L)
  public static SubLObject cb_message_page_with_history(final SubLObject message, SubLObject back_staleP)
  {
    if( back_staleP == UNPROVIDED )
    {
      back_staleP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != message )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( message );
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
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
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
            if( NIL != message )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( message );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            cb_history_with_back_link( back_staleP );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 2533L)
  public static SubLObject cb_titled_message_page_with_history(final SubLObject title, final SubLObject messages, SubLObject back_staleP)
  {
    if( back_staleP == UNPROVIDED )
    {
      back_staleP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
            final SubLObject _prev_bind_0_$14 = html_macros.$within_html_pre$.currentBinding( thread );
            try
            {
              html_macros.$within_html_pre$.bind( T, thread );
              SubLObject cdolist_list_var = messages;
              SubLObject message = NIL;
              message = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_princ( message );
                html_utilities.html_terpri( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                message = cdolist_list_var.first();
              }
            }
            finally
            {
              html_macros.$within_html_pre$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
            cb_history_with_back_link( back_staleP );
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
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$10, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 2999L)
  public static SubLObject cb_frame_update_message_page_info(final SubLObject page_name)
  {
    html_utilities.html_newline( TWO_INTEGER );
    final SubLObject message = Sequences.cconcatenate( $str18$Back_to__stale__, new SubLObject[] { format_nil.format_nil_a_no_copy( page_name ), $str19$_page
    } );
    cb_back_button( $kw7$SELF, message );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    cb_tools.cb_show_history_info( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3228L)
  public static SubLObject cb_show_truth(final SubLObject truth)
  {
    if( truth.eql( $kw20$TRUE ) )
    {
      html_utilities.html_princ( $str21$True );
    }
    else if( truth.eql( $kw22$FALSE ) )
    {
      html_utilities.html_princ( $str23$False );
    }
    else if( truth.eql( $kw24$UNKNOWN ) )
    {
      html_utilities.html_princ( $str25$Unknown );
    }
    else
    {
      html_utilities.html_princ( $str26$___ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3435L)
  public static SubLObject cb_show_strength(final SubLObject strength)
  {
    if( strength.eql( $kw27$DEFAULT ) )
    {
      html_utilities.html_princ( $str28$Default );
    }
    else if( strength.eql( $kw29$MONOTONIC ) )
    {
      html_utilities.html_princ( $str30$Monotonic );
    }
    else if( strength.eql( $kw24$UNKNOWN ) )
    {
      html_utilities.html_princ( $str25$Unknown );
    }
    else
    {
      html_utilities.html_princ( $str26$___ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3662L)
  public static SubLObject cb_show_direction(final SubLObject direction)
  {
    if( direction.eql( $kw31$FORWARD ) )
    {
      html_utilities.html_princ( $str32$Forward );
    }
    else if( direction.eql( $kw33$BACKWARD ) )
    {
      html_utilities.html_princ( $str34$Backward );
    }
    else if( direction.eql( $kw35$CODE ) )
    {
      html_utilities.html_princ( $str36$Code );
    }
    else
    {
      html_utilities.html_princ( $str26$___ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3884L)
  public static SubLObject cb_show_support_module(final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str37$_S, module );
    html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3980L)
  public static SubLObject cb_term_font_size(final SubLObject v_term, SubLObject baseline, SubLObject allowed_width)
  {
    if( baseline == UNPROVIDED )
    {
      baseline = THREE_INTEGER;
    }
    if( allowed_width == UNPROVIDED )
    {
      allowed_width = $int38$30;
    }
    if( NIL != nart_handles.nart_p( v_term ) )
    {
      return number_utilities.f_1_( baseline );
    }
    if( NIL != constant_handles.constant_p( v_term ) && Sequences.length( constants_high.constant_name( v_term ) ).numG( allowed_width ) )
    {
      return number_utilities.f_1_( baseline );
    }
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      return baseline;
    }
    if( v_term.isString() && Sequences.length( v_term ).numG( allowed_width ) )
    {
      return number_utilities.f_1_( baseline );
    }
    if( v_term.isString() )
    {
      return baseline;
    }
    return baseline;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 4607L)
  public static SubLObject cb_show_date(final SubLObject universal_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject day = numeric_date_utilities.decode_universal_date( universal_date );
    SubLObject month = thread.secondMultipleValue();
    final SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    month = numeric_date_utilities.abbreviation_for_month_number( month );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str39$_A__A___A, new SubLObject[] { month, day, year
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 4841L)
  public static SubLObject cb_show_second(final SubLObject universal_second)
  {
    html_utilities.html_princ( numeric_date_utilities.secondstring( universal_second ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 4944L)
  public static SubLObject cb_show_cyclist(final SubLObject cyclist)
  {
    if( NIL != kb_control_vars.lexicon_kb_loaded_p() )
    {
      final SubLObject html = cb_html_for_cyclist_in_nl( cyclist, UNPROVIDED, UNPROVIDED );
      return html_utilities.html_markup( html );
    }
    return cb_form( cyclist, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
  public static SubLObject clear_cb_html_for_cyclist_in_nl()
  {
    final SubLObject cs = $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
  public static SubLObject remove_cb_html_for_cyclist_in_nl(final SubLObject cyclist, SubLObject addressee, SubLObject domain_mt)
  {
    if( addressee == UNPROVIDED )
    {
      addressee = operation_communication.the_cyclist();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue(), ConsesLow.list( cyclist, addressee, domain_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
  public static SubLObject cb_html_for_cyclist_in_nl_internal(final SubLObject cyclist, final SubLObject addressee, final SubLObject domain_mt)
  {
    return cb_html_for_obj_in_nl( cyclist, domain_mt, $sym41$HTML_GENERATE_PHRASE, addressee );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
  public static SubLObject cb_html_for_cyclist_in_nl(final SubLObject cyclist, SubLObject addressee, SubLObject domain_mt)
  {
    if( addressee == UNPROVIDED )
    {
      addressee = operation_communication.the_cyclist();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    SubLObject caching_state = $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym40$CB_HTML_FOR_CYCLIST_IN_NL, $sym42$_CB_HTML_FOR_CYCLIST_IN_NL_CACHING_STATE_, TWENTY_INTEGER, EQL, THREE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( cyclist, addressee, domain_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( cyclist.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( addressee.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cb_html_for_cyclist_in_nl_internal( cyclist, addressee, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( cyclist, addressee, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5433L)
  public static SubLObject cyc_system_doc_rename_kill()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( system_parameters.$cyc_documentation_url$.getDynamicValue( thread ) ), $str43$ref_renames_kills_html );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5703L)
  public static SubLObject cyc_system_doc_naming_conventions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( system_parameters.$cyc_documentation_url$.getDynamicValue( thread ) ), $str44$ref_cycl_syntax_html_naming_conve );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5918L)
  public static SubLObject cyc_documentation_toc()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( system_parameters.$cyc_documentation_url$.getDynamicValue( thread ) ), $str45$toc_html );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 6011L)
  public static SubLObject cb_doc_link(final SubLObject about, final SubLObject link_text, final SubLObject html_file, SubLObject anchor)
  {
    if( anchor == UNPROVIDED )
    {
      anchor = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_indent( THREE_INTEGER );
    html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str46$__For_detailed_help_and_warnings_, about );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( html_file );
    if( NIL != anchor )
    {
      html_utilities.html_princ( $str47$_ );
      html_utilities.html_princ( anchor );
    }
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( link_text );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_princ( $str48$_documentation_ );
    html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 6863L)
  public static SubLObject cb_show_boolean(final SubLObject v_boolean)
  {
    return html_utilities.html_princ( boolean_yes_no_string( v_boolean ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 6959L)
  public static SubLObject boolean_yes_no_string(final SubLObject v_boolean)
  {
    return ( NIL != v_boolean ) ? $str49$Yes : $str50$No;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7195L)
  public static SubLObject cb_available_tools()
  {
    return conses_high.copy_list( $cb_available_tools$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7278L)
  public static SubLObject cb_standard_tools()
  {
    return conses_high.set_difference( cb_available_tools(), cb_deprecated_tools(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7387L)
  public static SubLObject cb_deprecated_tools()
  {
    return Sequences.remove( $kw52$DEPRECATED, $cb_available_tools$.getGlobalValue(), Symbols.symbol_function( $sym53$NOT_EQL ), Symbols.symbol_function( $sym54$FIFTH ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7498L)
  public static SubLObject cb_clear_available_tools()
  {
    $cb_available_tools$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7593L)
  public static SubLObject declare_cb_tool(final SubLObject tool, final SubLObject pretty_name, final SubLObject abbreviation, final SubLObject description)
  {
    undeclare_cb_tool( tool );
    $cb_available_tools$.setGlobalValue( ConsesLow.cons( ConsesLow.list( tool, pretty_name, abbreviation, description, $kw55$STANDARD ), $cb_available_tools$.getGlobalValue() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8148L)
  public static SubLObject declare_deprecated_cb_tool(final SubLObject tool, final SubLObject pretty_name, final SubLObject abbreviation, final SubLObject description)
  {
    undeclare_cb_tool( tool );
    $cb_available_tools$.setGlobalValue( ConsesLow.cons( ConsesLow.list( tool, pretty_name, abbreviation, description, $kw52$DEPRECATED ), $cb_available_tools$.getGlobalValue() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8731L)
  public static SubLObject undeclare_cb_tool(final SubLObject tool)
  {
    $cb_available_tools$.setGlobalValue( Sequences.delete( tool, $cb_available_tools$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym56$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return tool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8869L)
  public static SubLObject cb_tool_name(final SubLObject tool)
  {
    return conses_high.second( conses_high.assoc( tool, $cb_available_tools$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8957L)
  public static SubLObject cb_tool_abbreviation(final SubLObject tool)
  {
    return conses_high.third( conses_high.assoc( tool, $cb_available_tools$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 11888L)
  public static SubLObject cb_definitional_preds_for_type(final SubLObject type)
  {
    return conses_high.assoc( type, $cb_c_definitional_type_pred_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 11997L)
  public static SubLObject cb_definitional_preds_for_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      final SubLObject type = fort_types_interface.definitional_fort_type( fort, NIL );
      preds = cb_definitional_preds_for_type( type );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 12216L)
  public static SubLObject cb_sort_preds_for_display(final SubLObject fort, SubLObject predicates, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    predicates = list_utilities.delete_if_not( Symbols.symbol_function( $sym60$VALID_FORT_ ), predicates, key, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    predicates = kb_utilities.sort_terms( predicates, NIL, NIL, T, T, key, UNPROVIDED );
    if( NIL == forts.fort_p( fort ) )
    {
      return predicates;
    }
    SubLObject type = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      type = fort_types_interface.definitional_fort_type( fort, NIL );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject guide_seq = cb_definitional_preds_for_type( type );
    return list_utilities.stable_sort_via_position( predicates, guide_seq, Symbols.symbol_function( EQL ), key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 12749L)
  public static SubLObject cb_sort_mts_for_display(SubLObject mts, SubLObject max_to_temporally_sort)
  {
    if( max_to_temporally_sort == UNPROVIDED )
    {
      max_to_temporally_sort = $cb_max_mts_to_sort_temporally$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    mts = kb_utilities.sort_terms( mts, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    mts = kb_utilities.sort_terms( mts, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == cb_parameters.$cb_fastP$.getDynamicValue( thread ) && NIL == list_utilities.lengthG( mts, max_to_temporally_sort, UNPROVIDED ) )
    {
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0_$15 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            mts = Sort.stable_sort( mts, $sym61$POTENTIALLY_INFINITE_INTEGER__, $sym62$MT_START_UNIVERSAL_TIME_EXTENDED );
            mts = Sort.stable_sort( mts, $sym61$POTENTIALLY_INFINITE_INTEGER__, $sym63$MT_END_UNIVERSAL_TIME_EXTENDED );
          }
          finally
          {
            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$15, thread );
        }
      }
      finally
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
      }
    }
    mts = mt_vars.push_core_mts_to_beginning( mts );
    return mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject mt_start_universal_time_extended(final SubLObject mt, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw64$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym65$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject time_interval = get_mt_time_interval_memoized( mt );
          return maybe_cycl_second_to_universal_time_extended( time_interval_utilities.cycl_interval_initial_second( time_interval ), default_value );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw64$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject mt_end_universal_time_extended(final SubLObject mt, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw64$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym65$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject time_interval = get_mt_time_interval_memoized( mt );
          return maybe_cycl_second_to_universal_time_extended( time_interval_utilities.cycl_interval_final_second( time_interval ), default_value );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw64$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject get_mt_time_interval_memoized_internal(final SubLObject mt)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), hlmt.explode_hlmt_temporal_facets_with_defaults( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject get_mt_time_interval_memoized(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_mt_time_interval_memoized_internal( mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym67$GET_MT_TIME_INTERVAL_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym67$GET_MT_TIME_INTERVAL_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym67$GET_MT_TIME_INTERVAL_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_mt_time_interval_memoized_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject maybe_cycl_second_to_universal_time_extended_internal(final SubLObject second, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = ZERO_INTEGER;
    }
    SubLObject utx = maybe_cycl_second_to_universal_time_extended_low( second, default_value );
    if( NIL == number_utilities.potentially_infinite_integer_p( utx ) )
    {
      utx = default_value;
    }
    return utx;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject maybe_cycl_second_to_universal_time_extended(final SubLObject second, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return maybe_cycl_second_to_universal_time_extended_internal( second, default_value );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( second, default_value );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( second.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && default_value.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( maybe_cycl_second_to_universal_time_extended_internal( second, default_value ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( second, default_value ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
  public static SubLObject maybe_cycl_second_to_universal_time_extended_low(final SubLObject second, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = ZERO_INTEGER;
    }
    if( NIL == second )
    {
      return default_value;
    }
    if( second.eql( $const69$Now ) )
    {
      return Time.get_universal_time();
    }
    if( NIL != date_utilities.beginning_of_timeP( second ) )
    {
      return number_utilities.negative_infinity();
    }
    if( NIL != date_utilities.end_of_timeP( second ) )
    {
      return number_utilities.positive_infinity();
    }
    if( NIL != sbhl_time_modules.starts_after_starting_ofP( $list70, second, UNPROVIDED ) )
    {
      return Numbers.minus( date_utilities.convert_time_quant_to_seconds( date_utilities.time_elapsed( second, $list70, $const71$SecondsDuration ) ) );
    }
    if( NIL != date_utilities.date_p( second ) )
    {
      return date_utilities.cycl_date_to_universal_time( second );
    }
    return default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 15848L)
  public static SubLObject cb_sort_args_for_display(final SubLObject args)
  {
    return Sort.sort( args, Symbols.symbol_function( $sym72$_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 15917L)
  public static SubLObject cb_group_hlmts_by_monad_mt(final SubLObject hlmts)
  {
    SubLObject groups = NIL;
    final SubLObject dict = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = hlmts;
    SubLObject v_hlmt = NIL;
    v_hlmt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject monad_mt = hlmt.hlmt_monad_mt( v_hlmt );
      dictionary_utilities.dictionary_push( dict, monad_mt, v_hlmt );
      cdolist_list_var = cdolist_list_var.rest();
      v_hlmt = cdolist_list_var.first();
    }
    final SubLObject monad_mts = dictionary.dictionary_keys( dict );
    SubLObject cdolist_list_var2;
    final SubLObject sorted_monad_mts = cdolist_list_var2 = cb_sort_mts_for_display( monad_mts, UNPROVIDED );
    SubLObject monad_mt2 = NIL;
    monad_mt2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject hlmt_list = dictionary.dictionary_lookup( dict, monad_mt2, UNPROVIDED );
      groups = ConsesLow.cons( hlmt_list, groups );
      cdolist_list_var2 = cdolist_list_var2.rest();
      monad_mt2 = cdolist_list_var2.first();
    }
    return Sequences.nreverse( groups );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 16974L)
  public static SubLObject cb_back_button(SubLObject target, SubLObject value)
  {
    if( target == UNPROVIDED )
    {
      target = $kw7$SELF;
    }
    if( value == UNPROVIDED )
    {
      value = $str75$Back;
    }
    if( target.eql( $kw7$SELF ) )
    {
      return html_script_utilities.html_back_button( value );
    }
    final SubLObject pcase_var = target;
    if( pcase_var.eql( $kw76$TOP ) )
    {
      return html_script_utilities.html_simple_script_button( value, $cb_back_button_predefined_script$.getGlobalValue(), $str77$top, UNPROVIDED );
    }
    if( pcase_var.eql( $kw78$PARENT ) )
    {
      return html_script_utilities.html_simple_script_button( value, $cb_back_button_predefined_script$.getGlobalValue(), $str79$parent, UNPROVIDED );
    }
    final SubLObject frame = cb_frame_name( target );
    if( NIL != frame )
    {
      return html_script_utilities.html_simple_script_button( value, $cb_back_button_script$.getGlobalValue(), frame, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 17636L)
  public static SubLObject register_cb_frame(final SubLObject frame_spec, final SubLObject name, SubLObject src, SubLObject src_format, SubLObject noresize, SubLObject scrolling)
  {
    if( src == UNPROVIDED )
    {
      src = NIL;
    }
    if( src_format == UNPROVIDED )
    {
      src_format = NIL;
    }
    if( noresize == UNPROVIDED )
    {
      noresize = NIL;
    }
    if( scrolling == UNPROVIDED )
    {
      scrolling = T;
    }
    assert NIL != Types.keywordp( frame_spec ) : frame_spec;
    assert NIL != Types.stringp( name ) : name;
    if( NIL != src && !assertionsDisabledInClass && NIL == Types.stringp( src ) )
    {
      throw new AssertionError( src );
    }
    if( NIL != src_format && !assertionsDisabledInClass && NIL == Types.stringp( src_format ) )
    {
      throw new AssertionError( src_format );
    }
    SubLObject existing = cb_frame_info( frame_spec );
    if( NIL == existing )
    {
      existing = ConsesLow.list( frame_spec, NIL, NIL, NIL, NIL, NIL );
      $cb_frame_table$.setGlobalValue( ConsesLow.cons( existing, $cb_frame_table$.getGlobalValue() ) );
    }
    ConsesLow.set_nth( ONE_INTEGER, existing, name );
    ConsesLow.set_nth( TWO_INTEGER, existing, src );
    ConsesLow.set_nth( THREE_INTEGER, existing, src_format );
    ConsesLow.set_nth( FOUR_INTEGER, existing, list_utilities.sublisp_boolean( noresize ) );
    if( NIL != scrolling )
    {
      ConsesLow.set_nth( FIVE_INTEGER, existing, NIL );
    }
    else
    {
      ConsesLow.set_nth( FIVE_INTEGER, existing, $str83$no );
    }
    return frame_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 18587L)
  public static SubLObject deregister_cb_frame(final SubLObject frame_spec)
  {
    assert NIL != Types.keywordp( frame_spec ) : frame_spec;
    $cb_frame_table$.setGlobalValue( Sequences.delete( frame_spec, $cb_frame_table$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym84$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return frame_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 18816L)
  public static SubLObject cb_frame_info(final SubLObject frame_spec)
  {
    assert NIL != Types.keywordp( frame_spec ) : frame_spec;
    return conses_high.assoc( frame_spec, $cb_frame_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 18940L)
  public static SubLObject cb_frame_name(final SubLObject frame_spec)
  {
    if( frame_spec.isKeyword() )
    {
      return conses_high.second( cb_frame_info( frame_spec ) );
    }
    if( frame_spec.isString() )
    {
      return frame_spec;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 19147L)
  public static SubLObject cb_frame(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( type.eql( $kw85$MAIN ) )
    {
      final SubLObject name = cb_frame_name( $kw85$MAIN );
      SubLObject handler = ( NIL != ke.cyclist_is_guest() ) ? $str86$cb_login : $str87$cb_history;
      SubLObject new_arg_string = $str88$;
      if( arg1.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = arg1;
        SubLObject indirect_handler = NIL;
        SubLObject indirect_args = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
        indirect_handler = current.first();
        current = ( indirect_args = current.rest() );
        if( indirect_handler.isString() )
        {
          final SubLObject function_symbol = Packages.find_symbol( Strings.string_upcase( indirect_handler, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
          if( function_symbol.isSymbol() && NIL != Symbols.fboundp( function_symbol ) && NIL != html_macros.html_handler_functionP( function_symbol ) )
          {
            handler = indirect_handler;
            SubLObject cdolist_list_var = indirect_args;
            SubLObject indirect_arg = NIL;
            indirect_arg = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( indirect_arg.isCons() )
              {
                new_arg_string = Sequences.cconcatenate( new_arg_string, Sequences.cconcatenate( $str90$_, new SubLObject[] { format_nil.format_nil_a_no_copy( indirect_arg.first() ), $str91$_, format_nil
                    .format_nil_a_no_copy( conses_high.second( indirect_arg ) )
                } ) );
              }
              else
              {
                new_arg_string = Sequences.cconcatenate( new_arg_string, Sequences.cconcatenate( $str90$_, format_nil.format_nil_a_no_copy( indirect_arg ) ) );
              }
              cdolist_list_var = cdolist_list_var.rest();
              indirect_arg = cdolist_list_var.first();
            }
          }
        }
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_frame_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_frame_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_frame_src$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_url( handler, $str5$_A, new_arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    }
    else
    {
      final SubLObject simple_info = cb_frame_info( type );
      if( NIL != simple_info )
      {
        SubLObject current2;
        final SubLObject datum2 = current2 = simple_info;
        SubLObject keyword = NIL;
        SubLObject name2 = NIL;
        SubLObject handler2 = NIL;
        SubLObject control_string = NIL;
        SubLObject noresize = NIL;
        SubLObject scrolling = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
        keyword = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
        name2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
        handler2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
        control_string = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
        noresize = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
        scrolling = current2.first();
        current2 = current2.rest();
        if( NIL == current2 )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_frame_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_frame_name$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( name2 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != noresize )
          {
            html_utilities.html_simple_attribute( html_macros.$html_frame_noresize$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_frame_src$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          cb_url( handler2, control_string, arg1, arg2, arg3, arg4 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != scrolling )
          {
            html_utilities.html_markup( html_macros.$html_frame_scrolling$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( scrolling );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum2, $list92 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 21814L)
  public static SubLObject cb_link(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    final SubLObject method = cb_link_method( type );
    if( NIL != method )
    {
      final SubLObject pcase_var;
      final SubLObject max_args = pcase_var = cb_link_max_args( type );
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        Functions.funcall( method );
      }
      else if( pcase_var.eql( ONE_INTEGER ) )
      {
        Functions.funcall( method, arg1 );
      }
      else if( pcase_var.eql( TWO_INTEGER ) )
      {
        Functions.funcall( method, arg1, arg2 );
      }
      else if( pcase_var.eql( THREE_INTEGER ) )
      {
        Functions.funcall( method, arg1, arg2, arg3 );
      }
      else if( pcase_var.eql( FOUR_INTEGER ) )
      {
        Functions.funcall( method, arg1, arg2, arg3, arg4 );
      }
      else
      {
        Functions.funcall( method, arg1, arg2, arg3, arg4, arg5 );
      }
    }
    else
    {
      Errors.error( $str131$No_cb_link_method_for__S_defined, type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22356L)
  public static SubLObject setup_cb_link_method(final SubLObject type, final SubLObject method_func, final SubLObject max_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( type ) : type;
    assert NIL != Types.symbolp( method_func ) : method_func;
    assert NIL != Types.fixnump( max_args ) : max_args;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !max_args.numLE( $max_cb_link_arg_count$.getGlobalValue() ) )
    {
      Errors.error( $str134$Too_many_args_in__S___max_of__S_a, method_func, max_args );
    }
    Symbols.put( type, $kw135$CB_LINK_METHOD, method_func );
    Symbols.put( type, $kw136$CB_LINK_MAX_ARGS, max_args );
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22748L)
  public static SubLObject cb_link_method(final SubLObject type)
  {
    return Symbols.get( type, $kw135$CB_LINK_METHOD, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22815L)
  public static SubLObject cb_link_max_args(final SubLObject type)
  {
    return Symbols.get( type, $kw136$CB_LINK_MAX_ARGS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 23295L)
  public static SubLObject cb_link_constant(final SubLObject constant, SubLObject linktext, SubLObject image_keyword)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( image_keyword == UNPROVIDED )
    {
      image_keyword = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constant_name = constants_high.constant_name( constant );
    if( NIL == linktext )
    {
      linktext = constant_name;
    }
    SubLObject handler = $cb_default_fort_handler$.getDynamicValue( thread );
    final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue( thread );
    final SubLObject html_class = $str139$const;
    cb_adornments.handle_adornments( $kw140$FORT, frame, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cb_adornments.handle_adornments( $kw141$CONSTANT, frame, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != $cb_default_fort_link_emitter$.getDynamicValue( thread ) && NIL != Symbols.fboundp( $cb_default_fort_link_emitter$.getDynamicValue( thread ) ) )
    {
      Functions.funcall( $cb_default_fort_link_emitter$.getDynamicValue( thread ), constant, linktext, frame );
      return constant;
    }
    if( frame == $kw76$TOP )
    {
      handler = Sequences.cconcatenate( $str142$cb_start_, format_nil.format_nil_a_no_copy( $cb_default_fort_handler$.getDynamicValue( thread ) ) );
    }
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str143$_a__a, handler, cb_fort_identifier( constant ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != constant_name )
    {
      html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( constant_name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_class )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_class );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != image_keyword )
      {
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( image_keyword );
        final SubLObject align = $kw76$TOP;
        final SubLObject alt = ( NIL != linktext ) ? linktext : cyc_file_dependencies.cb_get_icon_alt_string( image_keyword );
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
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      else if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
      {
        if( NIL != fort_types_interface.obsolete_constantP( constant ) )
        {
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str144$obsolete );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != $cb_show_constant_hash_dollar_prefixP$.getDynamicValue( thread ) )
            {
              html_utilities.html_princ( $str145$__ );
            }
            html_utilities.html_princ( linktext );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        }
        else
        {
          if( NIL != $cb_show_constant_hash_dollar_prefixP$.getDynamicValue( thread ) )
          {
            html_utilities.html_princ( $str145$__ );
          }
          html_utilities.html_princ( linktext );
        }
      }
      else
      {
        html_utilities.html_stale_constant_reference( linktext, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    cyc_file_dependencies.javascript( $kw146$TERM_CONTEXT_MENU );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 24844L)
  public static SubLObject cb_nat_span_id(final SubLObject nat, SubLObject uniquifier)
  {
    if( uniquifier == UNPROVIDED )
    {
      uniquifier = $cb_term_id$.getDynamicValue();
    }
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( cb_naut_identifier( cycl_utilities.hl_to_el( nat ) ) ), new SubLObject[] { $str152$_, format_nil.format_nil_a_no_copy( uniquifier )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 24995L)
  public static SubLObject cb_link_nart(final SubLObject nart, SubLObject linktext, SubLObject image_keyword)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( image_keyword == UNPROVIDED )
    {
      image_keyword = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str153$_;
    }
    SubLObject handler = $cb_default_fort_handler$.getDynamicValue( thread );
    final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue( thread );
    final SubLObject v_class = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( cb_html_parameters.$cb_html_nat_class$.getDynamicValue( thread ) ), format_nil.format_nil_a_no_copy( cb_nat_span_id( nart,
        UNPROVIDED ) ) );
    cb_adornments.handle_adornments( $kw140$FORT, frame, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cb_adornments.handle_adornments( $kw150$NART, frame, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( frame == $kw76$TOP )
    {
      handler = Sequences.cconcatenate( $str142$cb_start_, format_nil.format_nil_a_no_copy( $cb_default_fort_handler$.getDynamicValue( thread ) ) );
    }
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str143$_a__a, handler, cb_fort_identifier( nart ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str88$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_class )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( v_class );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != image_keyword )
      {
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( image_keyword );
        final SubLObject align = $str154$absmiddle;
        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( image_keyword );
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
        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str155$cycl );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( linktext );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str155$cycl );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( linktext );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    cyc_file_dependencies.javascript( $kw146$TERM_CONTEXT_MENU );
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 25880L)
  public static SubLObject cb_link_nat(final SubLObject nart, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    return cb_link( $kw150$NART, nart, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 26059L)
  public static SubLObject cb_link_naut(final SubLObject naut, SubLObject linktext, SubLObject image_keyword)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( image_keyword == UNPROVIDED )
    {
      image_keyword = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str153$_;
    }
    SubLObject handler = $cb_default_naut_handler$.getDynamicValue( thread );
    final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue( thread );
    final SubLObject v_class = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( cb_html_parameters.$cb_html_nat_class$.getDynamicValue( thread ) ), format_nil.format_nil_a_no_copy( cb_nat_span_id( naut,
        UNPROVIDED ) ) );
    cb_adornments.handle_adornments( $kw159$NAUT, frame, naut, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( frame == $kw76$TOP )
    {
      handler = Sequences.cconcatenate( $str142$cb_start_, format_nil.format_nil_a_no_copy( $cb_default_naut_handler$.getDynamicValue( thread ) ) );
    }
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str143$_a__a, handler, cb_naut_identifier( naut ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str88$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_class )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( v_class );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != image_keyword )
      {
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( image_keyword );
        final SubLObject align = $str154$absmiddle;
        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( image_keyword );
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
        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str155$cycl );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( linktext );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str155$cycl );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( linktext );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return naut;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 26886L)
  public static SubLObject cb_naut_href(final SubLObject naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject html = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        cb_link_naut( naut, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      html = streams_high.get_output_stream_string( stream );
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
    final SubLObject start = number_utilities.f_1X( Sequences.position( Characters.CHAR_quotation, html, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Sequences.search( $str161$href, html, Symbols
        .symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
    final SubLObject end = Sequences.position( Characters.CHAR_quotation, html, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), start, UNPROVIDED );
    return string_utilities.substring( html, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 27184L)
  public static SubLObject cb_link_lexicon(final SubLObject constant)
  {
    final SubLObject linktext = pph_main.generate_phrase( constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return cb_link( $kw141$CONSTANT, constant, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 27328L)
  public static SubLObject cb_link_unnamed(final SubLObject nart)
  {
    final SubLObject id = nart_handles.nart_id( nart );
    if( !id.isInteger() )
    {
      return html_utilities.html_princ( $str164$_NART_ );
    }
    final SubLObject linktext = Sequences.cconcatenate( $str165$_NART_, new SubLObject[] { format_nil.format_nil_s_no_copy( id ), $str166$_
    } );
    return cb_link( $kw150$NART, nart, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 27556L)
  public static SubLObject cb_link_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_parameters.$cb_assertion_link_hook$.getDynamicValue( thread ) )
    {
      Functions.funcall( cb_parameters.$cb_assertion_link_hook$.getDynamicValue( thread ), assertion );
    }
    SubLObject handler = $str169$cb_af;
    final SubLObject frame = cb_parameters.$cb_default_assertion_frame$.getDynamicValue( thread );
    SubLObject tooltip_text = NIL;
    if( frame == $kw76$TOP )
    {
      handler = $str170$cb_start_cb_af;
    }
    if( NIL != cb_parameters.$cb_more_assertion_marker_image_text$.getDynamicValue( thread ) )
    {
      tooltip_text = html_assertion_marker_tooltip_text( assertion );
    }
    cb_link_method_assertion_internal( assertion, handler, frame, tooltip_text );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 28072L)
  public static SubLObject cb_link_method_assertion_internal(final SubLObject assertion, final SubLObject handler, final SubLObject frame, final SubLObject tooltip_text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion_id = assertion_handles.assertion_id( assertion );
    final SubLObject editability = ( NIL != assertions_high.asserted_assertionP( assertion ) && NIL != cb_assertion_editor.assertion_modification_permittedP( assertion ) ) ? cb_html_parameters.$cb_html_edit_class$
        .getDynamicValue( thread )
        : ( ( NIL != cb_assertion_editor.assertion_modification_permittedP( assertion ) ) ? cb_html_parameters.$cb_html_no_edit_class$.getDynamicValue( thread )
            : cb_html_parameters.$cb_html_no_modification_class$.getDynamicValue( thread ) );
    final SubLObject rule_class = ( NIL != assertions_high.rule_assertionP( assertion ) ) ? cb_html_parameters.$cb_html_rule_class$.getDynamicValue( thread ) : $str88$;
    final SubLObject v_class = Sequences.cconcatenate( cb_html_parameters.$cb_html_assert_class$.getDynamicValue( thread ), new SubLObject[] { editability, rule_class
    } );
    final SubLObject clean_tooltip = ( NIL != tooltip_text ) ? html_utilities.html_escape( tooltip_text, T ) : NIL;
    final SubLObject elt_id = ( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) ) ? html_macros.next_html_id( UNPROVIDED ) : $str88$;
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str143$_a__a, handler, assertion_id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != clean_tooltip )
    {
      html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( clean_tooltip );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_class )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( v_class );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( $str173$_cycid_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( assertion_id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str174$_id_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( elt_id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_assertion_marker( assertion, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    cb_adornments.handle_adornments( $kw171$ASSERTION, frame, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29402L)
  public static SubLObject cb_assertion_utility_color(final SubLObject assertion)
  {
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      final SubLObject utility = inference_analysis.transformation_rule_historical_utility( assertion );
      if( utility.numLE( $int175$_30 ) )
      {
        return html_saturated_red_color( Numbers.minus( utility ), $int176$100 );
      }
      if( utility.numGE( $int38$30 ) )
      {
        return html_saturated_green_color( utility, $int176$100 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
  public static SubLObject clear_html_saturated_red_color()
  {
    final SubLObject cs = $html_saturated_red_color_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
  public static SubLObject remove_html_saturated_red_color(final SubLObject value, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = $int177$256;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $html_saturated_red_color_caching_state$.getGlobalValue(), ConsesLow.list( value, max ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
  public static SubLObject html_saturated_red_color_internal(final SubLObject value, final SubLObject max)
  {
    final SubLObject red_level = Numbers.min( $int179$255, Numbers.integerDivide( Numbers.multiply( $int177$256, value ), max ) );
    final SubLObject color = PrintLow.format( NIL, $str180$_C_C0000, string_utilities.hex_char( Numbers.integerDivide( red_level, SIXTEEN_INTEGER ) ), string_utilities.hex_char( Numbers.mod( red_level,
        SIXTEEN_INTEGER ) ) );
    return color;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
  public static SubLObject html_saturated_red_color(final SubLObject value, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = $int177$256;
    }
    SubLObject caching_state = $html_saturated_red_color_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym178$HTML_SATURATED_RED_COLOR, $sym181$_HTML_SATURATED_RED_COLOR_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( value, max );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( value.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && max.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( html_saturated_red_color_internal( value, max ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( value, max ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
  public static SubLObject clear_html_saturated_green_color()
  {
    final SubLObject cs = $html_saturated_green_color_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
  public static SubLObject remove_html_saturated_green_color(final SubLObject value, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = $int177$256;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $html_saturated_green_color_caching_state$.getGlobalValue(), ConsesLow.list( value, max ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
  public static SubLObject html_saturated_green_color_internal(final SubLObject value, final SubLObject max)
  {
    final SubLObject green_level = Numbers.min( $int179$255, Numbers.integerDivide( Numbers.multiply( $int177$256, value ), max ) );
    final SubLObject color = PrintLow.format( NIL, $str183$00_C_C00, string_utilities.hex_char( Numbers.integerDivide( green_level, SIXTEEN_INTEGER ) ), string_utilities.hex_char( Numbers.mod( green_level,
        SIXTEEN_INTEGER ) ) );
    return color;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
  public static SubLObject html_saturated_green_color(final SubLObject value, SubLObject max)
  {
    if( max == UNPROVIDED )
    {
      max = $int177$256;
    }
    SubLObject caching_state = $html_saturated_green_color_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym182$HTML_SATURATED_GREEN_COLOR, $sym184$_HTML_SATURATED_GREEN_COLOR_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( value, max );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( value.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && max.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( html_saturated_green_color_internal( value, max ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( value, max ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30983L)
  public static SubLObject cb_assertion_ball(final SubLObject assertion, SubLObject align)
  {
    if( align == UNPROVIDED )
    {
      align = $kw76$TOP;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_parameters.$cb_assertion_link_hook$.getDynamicValue( thread ) )
    {
      Functions.funcall( cb_parameters.$cb_assertion_link_hook$.getDynamicValue( thread ), assertion );
    }
    SubLObject handler = $str169$cb_af;
    final SubLObject frame = cb_parameters.$cb_default_assertion_frame$.getDynamicValue( thread );
    SubLObject tooltip_text = NIL;
    if( frame == $kw76$TOP )
    {
      handler = $str170$cb_start_cb_af;
    }
    if( NIL != cb_parameters.$cb_more_assertion_marker_image_text$.getDynamicValue( thread ) )
    {
      tooltip_text = html_assertion_marker_tooltip_text( assertion );
    }
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str143$_a__a, handler, assertion_handles.assertion_id( assertion ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != tooltip_text )
    {
      html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( tooltip_text );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
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
      html_assertion_marker( assertion, align );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 31649L)
  public static SubLObject assertion_marker(final SubLObject assertion)
  {
    SubLObject marker_type = NIL;
    if( NIL != assertions_high.code_assertionP( assertion ) )
    {
      marker_type = $kw35$CODE;
    }
    else if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      if( NIL != assertions_high.forward_assertionP( assertion ) )
      {
        marker_type = $kw31$FORWARD;
      }
      else
      {
        marker_type = $kw33$BACKWARD;
      }
    }
    else if( NIL != assertions_high.backward_assertionP( assertion ) )
    {
      marker_type = $kw205$BACKWARD_GAF;
    }
    else if( NIL != assertions_high.assertion_has_truth( assertion, $kw22$FALSE ) )
    {
      marker_type = $kw22$FALSE;
    }
    else if( $kw24$UNKNOWN == assertions_high.assertion_truth( assertion ) )
    {
      marker_type = $kw24$UNKNOWN;
    }
    else if( NIL == assertions_high.asserted_assertionP( assertion ) )
    {
      marker_type = $kw189$DERIVED;
    }
    else if( NIL == list_utilities.singletonP( assertions_high.assertion_arguments( assertion ) ) )
    {
      marker_type = $kw196$REDUNDANT;
    }
    else if( assertions_high.assertion_strength( assertion ) == $kw29$MONOTONIC )
    {
      marker_type = $kw29$MONOTONIC;
    }
    else
    {
      marker_type = $kw27$DEFAULT;
    }
    return marker_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 32537L)
  public static SubLObject html_assertion_marker(final SubLObject assertion, SubLObject align)
  {
    if( align == UNPROVIDED )
    {
      align = $kw76$TOP;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject marker_type = assertion_marker( assertion );
    if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
    {
      final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( marker_type );
      final SubLObject align_$25 = ( NIL != align ) ? align : $kw76$TOP;
      final SubLObject alt = $str88$;
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
      if( NIL != align_$25 )
      {
        html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( align_$25 ) );
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
    else
    {
      final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( marker_type );
      final SubLObject align_$26 = ( NIL != align ) ? align : $kw76$TOP;
      final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( marker_type );
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
      if( NIL != align_$26 )
      {
        html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( align_$26 ) );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 32830L)
  public static SubLObject html_assertion_marker_tooltip_text(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cyclist = assertions_high.asserted_by( assertion );
    final SubLObject date = assertions_high.asserted_when( assertion );
    final SubLObject purpose = assertions_high.asserted_why( assertion );
    final SubLObject second = assertions_high.asserted_second( assertion );
    final SubLObject assertedP = assertions_high.asserted_assertionP( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject ruleP = assertions_high.rule_assertionP( assertion );
    final SubLObject forwardP = assertions_high.forward_assertionP( assertion );
    final SubLObject monotonicP = Equality.eq( assertions_high.assertion_strength( assertion ), $kw29$MONOTONIC );
    SubLObject tooltip_text_list = NIL;
    if( NIL != monotonicP )
    {
      tooltip_text_list = ConsesLow.cons( $str208$_monotonic, tooltip_text_list );
    }
    if( NIL != forwardP )
    {
      tooltip_text_list = ConsesLow.cons( $str209$_forward, tooltip_text_list );
    }
    else
    {
      tooltip_text_list = ConsesLow.cons( $str210$_backward, tooltip_text_list );
    }
    if( NIL != ruleP )
    {
      tooltip_text_list = ConsesLow.cons( $str211$_rule, tooltip_text_list );
    }
    else
    {
      tooltip_text_list = ConsesLow.cons( $str212$_GAF, tooltip_text_list );
    }
    if( NIL != assertedP )
    {
      tooltip_text_list = ConsesLow.cons( $str213$_asserted_locally_in_, tooltip_text_list );
      tooltip_text_list = ConsesLow.cons( cb_term_display_string( mt ), tooltip_text_list );
      if( NIL != forts.valid_fortP( cyclist ) )
      {
        tooltip_text_list = ConsesLow.cons( $str214$_by_, tooltip_text_list );
        tooltip_text_list = ConsesLow.cons( ( NIL != kb_control_vars.lexicon_kb_loaded_p() ) ? generate_phrase_for_cyclist( cyclist ) : constants_high.constant_name( cyclist ), tooltip_text_list );
        if( NIL != date )
        {
          tooltip_text_list = ConsesLow.cons( $str215$_on_, tooltip_text_list );
          thread.resetMultipleValues();
          final SubLObject day = numeric_date_utilities.decode_universal_date( date );
          SubLObject month = thread.secondMultipleValue();
          final SubLObject year = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          month = numeric_date_utilities.abbreviation_for_month_number( month );
          tooltip_text_list = ConsesLow.cons( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( month ), new SubLObject[] { $str216$_, format_nil.format_nil_a_no_copy( day ), $str217$__, format_nil
              .format_nil_a_no_copy( year )
          } ), tooltip_text_list );
        }
        if( NIL != second )
        {
          tooltip_text_list = ConsesLow.cons( $str218$_at_, tooltip_text_list );
          tooltip_text_list = ConsesLow.cons( numeric_date_utilities.secondstring( second ), tooltip_text_list );
        }
        if( NIL != forts.valid_fortP( purpose ) )
        {
          tooltip_text_list = ConsesLow.cons( $str219$_for_, tooltip_text_list );
          tooltip_text_list = ConsesLow.cons( constants_high.constant_name( purpose ), tooltip_text_list );
        }
        if( NIL != assertions_high.deduced_assertionP( assertion ) )
        {
          tooltip_text_list = ConsesLow.cons( $str220$_and_inferred_by_Cyc, tooltip_text_list );
        }
      }
    }
    else
    {
      tooltip_text_list = ConsesLow.cons( $str221$_inferred_in_, tooltip_text_list );
      tooltip_text_list = ConsesLow.cons( cb_term_display_string( mt ), tooltip_text_list );
    }
    return string_utilities.upcase_leading( string_utilities.trim_whitespace( Functions.apply( Symbols.symbol_function( $sym222$CCONCATENATE ), unicode_nauts.convert_unicode_nauts_to_utf8_strings( Sequences.nreverse(
        tooltip_text_list ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
  public static SubLObject clear_generate_phrase_for_cyclist()
  {
    final SubLObject cs = $generate_phrase_for_cyclist_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
  public static SubLObject remove_generate_phrase_for_cyclist(final SubLObject cyclist)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $generate_phrase_for_cyclist_caching_state$.getGlobalValue(), ConsesLow.list( cyclist ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
  public static SubLObject generate_phrase_for_cyclist_internal(final SubLObject cyclist)
  {
    return pph_main.generate_phrase( cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
  public static SubLObject generate_phrase_for_cyclist(final SubLObject cyclist)
  {
    SubLObject caching_state = $generate_phrase_for_cyclist_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym223$GENERATE_PHRASE_FOR_CYCLIST, $sym224$_GENERATE_PHRASE_FOR_CYCLIST_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym225$CLEAR_GENERATE_PHRASE_FOR_CYCLIST );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( generate_phrase_for_cyclist_internal( cyclist ) ) );
      memoization_state.caching_state_put( caching_state, cyclist, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34979L)
  public static SubLObject cb_link_sentence(final SubLObject sentence, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject handler = $str226$cb_sentence;
    final SubLObject frame = cb_parameters.$cb_default_assertion_frame$.getDynamicValue( thread );
    if( frame == $kw76$TOP )
    {
      handler = $str227$cb_start_cb_sentence;
    }
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), ( NIL != justifyP ) ? $str228$_a__a_t : $str143$_a__a, handler, cb_parameters.cb_glob_id( sentence ) );
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
      html_sentence_marker( sentence );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 35429L)
  public static SubLObject html_sentence_marker(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $kw231$SENTENCE_MARKER );
    final SubLObject align = $kw76$TOP;
    final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( $kw231$SENTENCE_MARKER );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 35674L)
  public static SubLObject cb_determine_help_target(SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == target )
    {
      if( NIL != cb_parameters.$cb_separate_doc_frame$.getDynamicValue( thread ) )
      {
        target = $kw100$DOC;
      }
      else
      {
        target = $kw85$MAIN;
      }
    }
    return target;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 35839L)
  public static SubLObject cb_help(final SubLObject help_keyword, SubLObject target, SubLObject desc_override)
  {
    if( target == UNPROVIDED )
    {
      target = NIL;
    }
    if( desc_override == UNPROVIDED )
    {
      desc_override = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_parameters.$cb_include_help$.getDynamicValue( thread ) )
    {
      final SubLObject target_var = cb_determine_help_target( target );
      final SubLObject frame_name = cb_frame_name( target_var );
      final SubLObject help_file_path = cyc_file_dependencies.cb_help_file_path( help_keyword );
      final SubLObject desc_string = ( NIL != desc_override ) ? desc_override : cyc_file_dependencies.cb_get_help_desc_string( help_keyword );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( help_file_path );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $kw234$HELP );
        final SubLObject align = $kw76$TOP;
        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( $kw234$HELP );
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
        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36365L)
  public static SubLObject cb_help_preamble(final SubLObject help, SubLObject back_target, SubLObject message)
  {
    if( back_target == UNPROVIDED )
    {
      back_target = $kw7$SELF;
    }
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_parameters.$cb_include_help$.getDynamicValue( thread ) )
    {
      if( help.isKeyword() )
      {
        cb_help( help, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        Errors.warn( $str237$Use_of_unsupported_legacy_help_sy, help );
      }
      html_utilities.html_indent( UNPROVIDED );
    }
    if( NIL != message )
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( message );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37109L)
  public static SubLObject cb_form(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject method_function = Structures.method_func( v_object, $cb_form_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object, depth, wrap_axiomsP );
    }
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    if( NIL != subl_promotions.memberP( v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str238$dont_care );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_prin1( v_object );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_prin1( v_object );
    }
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37466L)
  public static SubLObject cb_form_variable_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    final SubLObject v_class = ( NIL != subl_promotions.memberP( v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? $str239$hl_var_dont_care : $str240$hl_var;
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != v_class )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( v_class );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_prin1( v_object );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37788L)
  public static SubLObject cb_form_symbol_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    if( NIL != cycl_grammar.el_variable_p( v_object ) )
    {
      final SubLObject v_class = ( NIL != subl_promotions.memberP( v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? $str242$el_var_dont_care : $str243$el_var;
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != v_class )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( v_class );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_prin1( v_object );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    else if( v_object.isKeyword() )
    {
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str244$keyword );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_prin1( v_object );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str245$symbol );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_prin1( v_object );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 38350L)
  public static SubLObject cb_form_constant_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    cb_link( $kw141$CONSTANT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 38508L)
  public static SubLObject cb_form_nart_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == depth )
    {
      depth = ZERO_INTEGER;
    }
    final SubLObject nart_hl_formula = narts_high.nart_hl_formula( v_object );
    if( NIL != nart_hl_formula )
    {
      final SubLObject _prev_bind_0 = $cb_just_did_nat$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $cb_term_id$.currentBinding( thread );
      try
      {
        $cb_just_did_nat$.bind( v_object, thread );
        $cb_term_id$.bind( ( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) ) ? html_macros.next_html_id( UNPROVIDED ) : NIL, thread );
        final SubLObject span_id = cb_nat_span_id( v_object, UNPROVIDED );
        if( NIL != $cb_term_id$.getDynamicValue( thread ) )
        {
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          if( NIL != span_id )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( span_id );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != cb_html_parameters.$cb_html_nat_class$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( cb_html_parameters.$cb_html_nat_class$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_form( nart_hl_formula, depth, wrap_axiomsP );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        }
        else
        {
          cb_form( nart_hl_formula, depth, wrap_axiomsP );
        }
      }
      finally
      {
        $cb_term_id$.rebind( _prev_bind_2, thread );
        $cb_just_did_nat$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cb_link( $kw167$UNNAMED, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 39262L)
  public static SubLObject cb_form_assertion_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == depth )
    {
      depth = ZERO_INTEGER;
    }
    if( NIL != $allow_cb_assertion_for_the_assertion_sentence_replacementP$.getDynamicValue( thread ) && NIL != kb_utilities.kbeq( v_object, $cb_assertion_for_the_assertion_sentence_replacement$.getDynamicValue(
        thread ) ) )
    {
      return cb_form( $const250$TheAssertionSentence, depth, NIL );
    }
    if( NIL != wrap_axiomsP )
    {
      if( !depth.numE( ZERO_INTEGER ) )
      {
        html_utilities.html_newline( UNPROVIDED );
      }
      html_utilities.html_indent( depth );
    }
    if( NIL != assertions_high.valid_assertion( v_object, UNPROVIDED ) )
    {
      cb_form_assertion_hl_formula( v_object, depth, wrap_axiomsP );
    }
    else
    {
      cb_form_invalid_assertion( v_object, depth, wrap_axiomsP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 39859L)
  public static SubLObject cb_form_assertion_hl_formula(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = control_vars.$variable_names$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $rule_unlabelled_dont_care_variables$.currentBinding( thread );
    try
    {
      control_vars.$variable_names$.bind( assertions_high.assertion_variable_names( assertion ), thread );
      $rule_unlabelled_dont_care_variables$.bind( ( NIL != assertions_high.rule_assertionP( assertion ) ) ? assertion_utilities.rule_unlabelled_dont_care_variables( assertion ) : NIL, thread );
      final SubLObject additional_class_string = ( NIL != assertion_utilities.obsolete_ruleP( assertion ) ) ? cb_html_parameters.$cb_html_obsolete_class$.getDynamicValue( thread ) : $str88$;
      cb_form_assertion_formula( assertion, assertions_high.assertion_formula( assertion ), depth, wrap_axiomsP, additional_class_string );
    }
    finally
    {
      $rule_unlabelled_dont_care_variables$.rebind( _prev_bind_2, thread );
      control_vars.$variable_names$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 40368L)
  public static SubLObject cb_form_invalid_assertion(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    html_utilities.html_princ( $str252$__INVALID_ASSERTION_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 40547L)
  public static SubLObject cb_form_assertion_formula(final SubLObject assertion, final SubLObject formula, SubLObject depth, SubLObject wrap_axiomsP, SubLObject additional_class_string)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    if( additional_class_string == UNPROVIDED )
    {
      additional_class_string = $str88$;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = Sequences.cconcatenate( additional_class_string, cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue( thread ) );
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != v_class )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( v_class );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = $cb_just_did_quote$.currentBinding( thread );
      try
      {
        $cb_just_did_quote$.bind( T, thread );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( assertions_high.assertion_mt( assertion ) );
        final SubLObject _prev_bind_0_$30 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          cb_form( formula, Numbers.add( depth, ONE_INTEGER ), wrap_axiomsP );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$30, thread );
        }
      }
      finally
      {
        $cb_just_did_quote$.rebind( _prev_bind_0_$29, thread );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41101L)
  public static SubLObject cb_form_assertion_edit_formula(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    return cb_form_assertion_formula( assertion, ke.ke_assertion_edit_formula( assertion ), depth, wrap_axiomsP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41365L)
  public static SubLObject cb_form_string_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != cb_html_parameters.$cb_html_string_class$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( cb_html_parameters.$cb_html_string_class$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != wrap_axiomsP && NIL != html_macros.$within_html_pre$.getDynamicValue( thread ) && Sequences.length( v_object ).numG( $cb_string_length_wrap$.getDynamicValue( thread ) ) )
      {
        html_macros.verify_within_html_pre();
        html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
        final SubLObject _prev_bind_0_$31 = html_macros.$within_html_pre$.currentBinding( thread );
        try
        {
          html_macros.$within_html_pre$.bind( NIL, thread );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$32 = html_macros.$html_preserve_breaks$.currentBinding( thread );
          try
          {
            html_macros.$html_preserve_breaks$.bind( T, thread );
            html_utilities.html_print_doc_string( v_object );
          }
          finally
          {
            html_macros.$html_preserve_breaks$.rebind( _prev_bind_0_$32, thread );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$within_html_pre$.rebind( _prev_bind_0_$31, thread );
        }
        html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_print_doc_string( v_object );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42682L)
  public static SubLObject print_cb_form_cons_methods(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_level$.getDynamicValue( thread ) && depth.numG( print_high.$print_level$.getDynamicValue( thread ) ) )
    {
      print_high.princ( $str47$_, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( cb_form_cons_method_name( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject cb_form_cons_method_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_cb_form_cons_methods( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject cb_form_cons_method_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cb_form_cons_method_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject cb_form_cons_method_name(final SubLObject v_object)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject cb_form_cons_method_keyword(final SubLObject v_object)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject cb_form_cons_method_applicability_test_fn(final SubLObject v_object)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject cb_form_cons_method_html_output_fn(final SubLObject v_object)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject _csetf_cb_form_cons_method_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject _csetf_cb_form_cons_method_keyword(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject _csetf_cb_form_cons_method_applicability_test_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject _csetf_cb_form_cons_method_html_output_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_form_cons_method_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject make_cb_form_cons_method(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cb_form_cons_method_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw275$NAME ) )
      {
        _csetf_cb_form_cons_method_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw276$KEYWORD ) )
      {
        _csetf_cb_form_cons_method_keyword( v_new, current_value );
      }
      else if( pcase_var.eql( $kw277$APPLICABILITY_TEST_FN ) )
      {
        _csetf_cb_form_cons_method_applicability_test_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw278$HTML_OUTPUT_FN ) )
      {
        _csetf_cb_form_cons_method_html_output_fn( v_new, current_value );
      }
      else
      {
        Errors.error( $str279$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject visit_defstruct_cb_form_cons_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw280$BEGIN, $sym281$MAKE_CB_FORM_CONS_METHOD, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw282$SLOT, $kw275$NAME, cb_form_cons_method_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw282$SLOT, $kw276$KEYWORD, cb_form_cons_method_keyword( obj ) );
    Functions.funcall( visitor_fn, obj, $kw282$SLOT, $kw277$APPLICABILITY_TEST_FN, cb_form_cons_method_applicability_test_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw282$SLOT, $kw278$HTML_OUTPUT_FN, cb_form_cons_method_html_output_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw283$END, $sym281$MAKE_CB_FORM_CONS_METHOD, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
  public static SubLObject visit_defstruct_object_cb_form_cons_method_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cb_form_cons_method( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43099L)
  public static SubLObject defcb_form_cons_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list285 );
    name = current.first();
    final SubLObject arglist;
    current = ( arglist = current.rest() );
    return ConsesLow.list( $sym286$REGISTER_CB_FORM_CONS_METHOD, ConsesLow.list( $sym287$QUOTE, name ), ConsesLow.list( $sym287$QUOTE, arglist ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43256L)
  public static SubLObject register_cb_form_cons_method(final SubLObject name, final SubLObject arglist)
  {
    final SubLObject new_cb_form_cons_method = make_cb_form_cons_method( arglist );
    _csetf_cb_form_cons_method_name( new_cb_form_cons_method, name );
    Hashtables.sethash( cb_form_cons_method_keyword( new_cb_form_cons_method ), $cb_form_cons_methods_by_keyword$.getGlobalValue(), new_cb_form_cons_method );
    $cb_form_cons_methods$.setGlobalValue( ConsesLow.cons( new_cb_form_cons_method, Sequences.delete( name, $cb_form_cons_methods$.getGlobalValue(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function(
        $sym267$CB_FORM_CONS_METHOD_NAME ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    return new_cb_form_cons_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43802L)
  public static SubLObject with_cb_form_cons_methods(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list289 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_keywords = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list289 );
    method_keywords = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym290$CLET, ConsesLow.list( ConsesLow.list( $sym291$_CB_FORM_CONS_METHODS_ACTIVE_, ConsesLow.list( $sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, method_keywords ) ) ), ConsesLow.append(
          body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list289 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43995L)
  public static SubLObject compute_cb_form_cons_methods_active(final SubLObject method_keywords)
  {
    SubLObject v_methods = NIL;
    SubLObject cdolist_list_var = method_keywords;
    SubLObject method_keyword = NIL;
    method_keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method( method_keyword );
      if( NIL != method )
      {
        v_methods = ConsesLow.cons( method, v_methods );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method_keyword = cdolist_list_var.first();
    }
    return v_methods;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44332L)
  public static SubLObject cb_form_cons_methods_active()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.append( $cb_form_cons_methods_active$.getDynamicValue( thread ), always_active_cb_form_cons_methods() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44654L)
  public static SubLObject declare_cb_form_cons_method_always_active(final SubLObject method_keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method( method_keyword );
    if( NIL != method )
    {
      $always_active_cb_form_cons_methods$.setDynamicValue( ConsesLow.cons( method, $always_active_cb_form_cons_methods$.getDynamicValue( thread ) ), thread );
    }
    return $always_active_cb_form_cons_methods$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44940L)
  public static SubLObject always_active_cb_form_cons_methods()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $always_active_cb_form_cons_methods$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 45041L)
  public static SubLObject cb_form_cons_method_keyword_to_cb_form_cons_method(final SubLObject keyword)
  {
    return Hashtables.gethash( keyword, $cb_form_cons_methods_by_keyword$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 45180L)
  public static SubLObject top_level_cb_form_url(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject base_url = Sequences.cconcatenate( http_kernel.http_server_cgi_base_url(), $str294$cg_cb_start_ );
    final SubLObject fortified_term = narts_high.nart_substitute( v_term );
    final SubLObject fortP = forts.fort_p( fortified_term );
    final SubLObject handler = ( NIL != fortP ) ? $cb_default_fort_handler$.getDynamicValue( thread ) : $cb_default_naut_handler$.getDynamicValue( thread );
    final SubLObject term_identifier = ( NIL != fortP ) ? cb_fort_identifier( fortified_term ) : cb_naut_identifier( fortified_term );
    return Sequences.cconcatenate( base_url, new SubLObject[] { handler, $str90$_, term_identifier
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 45823L)
  public static SubLObject cb_form_string(final SubLObject obj, SubLObject url_type)
  {
    if( url_type == UNPROVIDED )
    {
      url_type = $kw295$RELATIVE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cb_form_string = NIL;
    final SubLObject _prev_bind_0 = cb_parameters.$cb_form_url_prefix_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = cb_parameters.$cb_default_term_frame$.currentBinding( thread );
    final SubLObject _prev_bind_3 = cb_parameters.$cb_default_assertion_frame$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_form_url_prefix_print$.bind( get_url_prefix_for_url_type( url_type ), thread );
      cb_parameters.$cb_default_term_frame$.bind( $str97$_blank, thread );
      cb_parameters.$cb_default_assertion_frame$.bind( $str97$_blank, thread );
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_0_$33 = html_macros.$html_stream$.currentBinding( thread );
        try
        {
          html_macros.$html_stream$.bind( stream, thread );
          cb_form( obj, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_stream$.rebind( _prev_bind_0_$33, thread );
        }
        cb_form_string = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
        }
      }
      return cb_form_string;
    }
    finally
    {
      cb_parameters.$cb_default_assertion_frame$.rebind( _prev_bind_3, thread );
      cb_parameters.$cb_default_term_frame$.rebind( _prev_bind_2, thread );
      cb_parameters.$cb_form_url_prefix_print$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 46427L)
  public static SubLObject get_url_prefix_for_url_type(final SubLObject url_type)
  {
    if( url_type.eql( $kw295$RELATIVE ) )
    {
      return $sym296$CYC_CGI_RELATIVE_URL;
    }
    if( url_type.eql( $kw297$KEA ) )
    {
      return $sym298$CYC_CGI_KEA_URL;
    }
    if( url_type.eql( $kw299$CB ) )
    {
      return $sym300$CYC_CGI_ABSOLUTE_CB_FRAMED_URL;
    }
    return $sym296$CYC_CGI_RELATIVE_URL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47306L)
  public static SubLObject cb_formula_argument_limit_exceededP(final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $cb_formula_argument_limit$.getDynamicValue( thread ) )
    {
      return Numbers.numG( argnum, $cb_formula_argument_limit$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47456L)
  public static SubLObject cb_form_cons_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != cb_html_parameters.$cb_html_cons_class$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( cb_html_parameters.$cb_html_cons_class$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_form_cons_internal( v_object, depth, wrap_axiomsP );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47645L)
  public static SubLObject cb_form_cons_internal(SubLObject v_object, SubLObject depth, final SubLObject wrap_axiomsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == depth )
    {
      depth = ZERO_INTEGER;
    }
    if( NIL != term.closed_nautP( v_object, UNPROVIDED ) && !v_object.equal( $cb_just_did_naut$.getDynamicValue( thread ) ) )
    {
      final SubLObject _prev_bind_0 = $cb_inside_naut$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $cb_inside_quoteP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = $cb_just_did_naut$.currentBinding( thread );
      final SubLObject _prev_bind_4 = $cb_term_id$.currentBinding( thread );
      try
      {
        $cb_inside_naut$.bind( $cb_inside_naut$.getDynamicValue( thread ), thread );
        $cb_inside_quoteP$.bind( ( NIL != cycl_grammar.fast_cycl_quoted_term_p( v_object ) ) ? T : ( ( NIL != cycl_grammar.fast_escape_quote_term_p( v_object ) ) ? NIL : $cb_inside_quoteP$.getDynamicValue( thread ) ),
            thread );
        $cb_just_did_naut$.bind( v_object, thread );
        $cb_term_id$.bind( ( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) ) ? html_macros.next_html_id( UNPROVIDED ) : NIL, thread );
        final SubLObject span_id = cb_nat_span_id( v_object, UNPROVIDED );
        if( NIL != $cb_term_id$.getDynamicValue( thread ) )
        {
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          if( NIL != span_id )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( span_id );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != cb_html_parameters.$cb_html_nat_class$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( cb_html_parameters.$cb_html_nat_class$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_form_cons_internal( v_object, depth, wrap_axiomsP );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        }
        else
        {
          cb_form_cons_internal( v_object, depth, wrap_axiomsP );
        }
      }
      finally
      {
        $cb_term_id$.rebind( _prev_bind_4, thread );
        $cb_just_did_naut$.rebind( _prev_bind_3, thread );
        $cb_inside_quoteP$.rebind( _prev_bind_2, thread );
        $cb_inside_naut$.rebind( _prev_bind_0, thread );
      }
    }
    else if( v_object.first().eql( $sym287$QUOTE ) )
    {
      if( NIL != wrap_axiomsP && !conses_high.second( v_object ).isAtom() )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_indent( depth );
      }
      html_utilities.html_princ( $str302$_ );
      final SubLObject _prev_bind_0 = $cb_just_did_quote$.currentBinding( thread );
      try
      {
        $cb_just_did_quote$.bind( T, thread );
        cb_form( conses_high.second( v_object ), depth, wrap_axiomsP );
      }
      finally
      {
        $cb_just_did_quote$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = $cb_inside_naut$.currentBinding( thread );
      try
      {
        $cb_inside_naut$.bind( $cb_inside_naut$.getDynamicValue( thread ), thread );
        SubLObject used_cb_form_cons_methodP = NIL;
        SubLObject close_paren_is_for_nartP = NIL;
        if( NIL == used_cb_form_cons_methodP )
        {
          SubLObject csome_list_var = cb_form_cons_methods_active();
          SubLObject cb_form_cons_method = NIL;
          cb_form_cons_method = csome_list_var.first();
          while ( NIL == used_cb_form_cons_methodP && NIL != csome_list_var)
          {
            final SubLObject cb_form_cons_method_applicability_test_fn = cb_form_cons_method_applicability_test_fn( cb_form_cons_method );
            final SubLObject cb_form_cons_method_html_output_fn = cb_form_cons_method_html_output_fn( cb_form_cons_method );
            if( cb_form_cons_method_applicability_test_fn.isFunctionSpec() && NIL != Functions.funcall( cb_form_cons_method_applicability_test_fn, v_object ) && cb_form_cons_method_html_output_fn.isFunctionSpec() )
            {
              Functions.funcall( cb_form_cons_method_html_output_fn, v_object, depth, wrap_axiomsP );
              used_cb_form_cons_methodP = T;
            }
            csome_list_var = csome_list_var.rest();
            cb_form_cons_method = csome_list_var.first();
          }
        }
        if( NIL == used_cb_form_cons_methodP )
        {
          if( NIL == $cb_form_cons_suppress_newline$.getDynamicValue( thread ) && NIL != wrap_axiomsP && NIL == $cb_just_did_quote$.getDynamicValue( thread ) )
          {
            if( !depth.numE( ZERO_INTEGER ) )
            {
              html_utilities.html_newline( UNPROVIDED );
            }
            html_utilities.html_indent( depth );
          }
          $cb_just_did_quote$.setDynamicValue( NIL, thread );
          if( NIL != $cb_inside_naut$.getDynamicValue( thread ) || NIL != subl_promotions.memberP( v_object.first(), $cb_form_suppress_naut_link_functions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str155$cycl );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str153$_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
          else if( NIL != $cb_just_did_nat$.getDynamicValue( thread ) )
          {
            close_paren_is_for_nartP = T;
            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
            cb_link( $kw150$NART, $cb_just_did_nat$.getDynamicValue( thread ), $str153$_, $kw150$NART, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            $cb_inside_naut$.setDynamicValue( NIL, thread );
            $cb_just_did_nat$.setDynamicValue( NIL, thread );
          }
          else if( NIL != $cb_just_did_naut$.getDynamicValue( thread ) )
          {
            cb_link( $kw159$NAUT, $cb_just_did_naut$.getDynamicValue( thread ), $str153$_, $kw148$NAT, UNPROVIDED, UNPROVIDED );
            if( NIL != $cb_inside_naut_support_enabledP$.getDynamicValue( thread ) )
            {
              $cb_inside_naut$.setDynamicValue( T, thread );
            }
            $cb_just_did_naut$.setDynamicValue( NIL, thread );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str155$cycl );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str153$_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
          SubLObject argnum = ZERO_INTEGER;
          final SubLObject _prev_bind_0_$38 = $cb_form_cons_suppress_newline$.currentBinding( thread );
          try
          {
            $cb_form_cons_suppress_newline$.bind( T, thread );
            cb_form( v_object.first(), depth, wrap_axiomsP );
            argnum = Numbers.add( argnum, ONE_INTEGER );
          }
          finally
          {
            $cb_form_cons_suppress_newline$.rebind( _prev_bind_0_$38, thread );
          }
          if( NIL != $cb_form_cons_suppress_newline$.getDynamicValue( thread ) )
          {
            $cb_form_cons_suppress_newline$.setDynamicValue( NIL, thread );
          }
          if( NIL != subl_promotions.memberP( v_object.first(), $cb_wrap_after_arg_1$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            cb_form_cons_inter_arg_space();
            cb_form( conses_high.second( v_object ), depth, NIL );
            v_object = v_object.rest();
            argnum = Numbers.add( argnum, ONE_INTEGER );
          }
          SubLObject rest;
          for( rest = NIL, rest = v_object.rest(); NIL == cb_formula_argument_limit_exceededP( argnum ) && rest.isCons(); argnum = Numbers.add( argnum, ONE_INTEGER ), rest = rest.rest() )
          {
            cb_form_cons_inter_arg_space();
            cb_form( rest.first(), Numbers.add( depth, ONE_INTEGER ), wrap_axiomsP );
          }
          if( NIL != cb_formula_argument_limit_exceededP( argnum ) )
          {
            html_utilities.html_princ_strong( $str303$____ );
          }
          else if( NIL != rest )
          {
            html_utilities.html_princ( $str304$___ );
            cb_form( rest, Numbers.add( depth, ONE_INTEGER ), wrap_axiomsP );
          }
          if( NIL != close_paren_is_for_nartP )
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str155$cycl );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str305$font_weight_900 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str306$_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str155$cycl );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str306$_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          }
        }
      }
      finally
      {
        $cb_inside_naut$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 51504L)
  public static SubLObject cb_form_cons_inter_arg_space()
  {
    html_utilities.html_princ( $str216$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52176L)
  public static SubLObject cb_date_to_optimize_for_displayP(final SubLObject cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $cb_display_dates_as_stringsP$.getDynamicValue( thread ) && NIL == $cb_inside_quoteP$.getDynamicValue( thread ) && NIL != date_utilities.simple_el_date_p( cons ) && NIL == date_utilities
        .el_date_year_p( cons ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52456L)
  public static SubLObject cb_show_date_optimized_for_display(final SubLObject simple_date, final SubLObject depth, final SubLObject wrap_axiomsP)
  {
    final SubLObject optimized_date = cb_optimize_date_for_display( simple_date );
    return cb_form( optimized_date, depth, wrap_axiomsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52675L)
  public static SubLObject cb_possibly_optimize_date_for_display(SubLObject date)
  {
    if( NIL != cb_date_to_optimize_for_displayP( date ) )
    {
      date = cb_optimize_date_for_display( date );
    }
    return date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52856L)
  public static SubLObject cb_optimize_date_for_display(final SubLObject simple_date)
  {
    final SubLObject date_as_string = date_utilities.cyc_date_encode_string_internal( $str313$DateFromStringFn_datetime, simple_date );
    return el_utilities.make_unary_formula( $const314$DateFromStringFn, date_as_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 53738L)
  public static SubLObject cb_decimal_to_optimize_for_displayP(final SubLObject cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $cb_display_decimals_as_decimalsP$.getDynamicValue( thread ) && NIL == cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) && NIL != kb_control_vars.fraction_kb_loaded_p()
        && NIL != simple_el_decimal_p( cons ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 53950L)
  public static SubLObject cb_show_decimal_optimized_for_display(final SubLObject simple_decimal, final SubLObject depth, final SubLObject wrap_axiomsP)
  {
    final SubLObject optimized_decimal = cb_optimize_decimal_for_display( simple_decimal );
    return cb_link_naut( simple_decimal, string_utilities.to_string( optimized_decimal ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 54230L)
  public static SubLObject cb_optimize_decimal_for_display(final SubLObject simple_decimal)
  {
    return extended_numbers.extended_number_to_subl_real( simple_decimal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 54402L)
  public static SubLObject simple_el_decimal_p(final SubLObject obj)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( obj ) && NIL != el_utilities.groundP( obj, UNPROVIDED ) && NIL != el_utilities.formula_arityE( obj, TWO_INTEGER, UNPROVIDED ) && NIL != collection_defns
        .decimal_fractionP( obj, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55212L)
  public static SubLObject cb_fraction_to_optimize_for_displayP(final SubLObject cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $cb_display_fractions_as_fractionsP$.getDynamicValue( thread ) && NIL == cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) && NIL != kb_control_vars.fraction_kb_loaded_p()
        && NIL != collection_defns.fractionP( cons, UNPROVIDED ) && NIL != el_utilities.groundP( cons, UNPROVIDED ) && NIL == collection_defns.decimal_fractionP( cons, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55476L)
  public static SubLObject cb_show_fraction_optimized_for_display(final SubLObject fraction, final SubLObject depth, final SubLObject wrap_axiomsP)
  {
    final SubLObject linktext = optimized_html_for_fraction( fraction );
    cb_link_naut( fraction, linktext, UNPROVIDED );
    return fraction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55716L)
  public static SubLObject optimized_html_for_fraction(final SubLObject fraction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject linktext = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        if( NIL != collection_defns.mixed_fractionP( fraction, UNPROVIDED ) )
        {
          html_utilities.html_princ( cycl_utilities.nat_arg1( fraction, UNPROVIDED ) );
          html_utilities.html_glyph( $kw327$THIN_SPACE, UNPROVIDED );
        }
        else if( NIL != collection_defns.negative_mixed_fractionP( fraction, UNPROVIDED ) )
        {
          html_utilities.html_glyph( $kw328$MINUS, UNPROVIDED );
          html_utilities.html_princ( cycl_utilities.nat_arg1( fraction, UNPROVIDED ) );
          html_utilities.html_glyph( $kw327$THIN_SPACE, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_superscript_head$.getGlobalValue() );
        html_utilities.html_princ( removal_modules_fractions.el_fraction_numerator( fraction, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_superscript_tail$.getGlobalValue() );
        html_utilities.html_glyph( $kw329$FRASL, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_subscript_head$.getGlobalValue() );
        html_utilities.html_princ( removal_modules_fractions.el_fraction_denominator( fraction, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_subscript_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      linktext = streams_high.get_output_stream_string( stream );
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
    return linktext;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 56263L)
  public static SubLObject cb_hl_support_to_displayP(final SubLObject cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $cb_inside_quoteP$.getDynamicValue( thread ) && NIL != arguments.hl_support_p( cons ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 56724L)
  public static SubLObject cb_show_hl_support_for_cons_method(final SubLObject hl_support, final SubLObject depth, final SubLObject wrap_axiomsP)
  {
    return cb_show_hl_support_readably( hl_support, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 56896L)
  public static SubLObject cb_unimplemented(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list332 );
    arg = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        html_utilities.html_princ( $str333$Unimplemented_Link );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str333$Unimplemented_Link );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str334$The_page_for_ );
            html_utilities.html_princ_strong( arg );
            html_utilities.html_princ( $str335$_has_not_yet_been_implemented_ );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$41, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list332 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 57237L)
  public static SubLObject cb_link_unimplemented(final SubLObject linktext)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( linktext ) : linktext;
    final SubLObject frame_name_var = cb_frame_name( $kw7$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str338$cb_unimplemented__A, web_utilities.html_url_encode( linktext, UNPROVIDED ) );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 57447L)
  public static SubLObject cb_form_item_list(final SubLObject list)
  {
    final SubLObject pcase_var = Sequences.length( list );
    if( !pcase_var.eql( ZERO_INTEGER ) )
    {
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        cb_form( list.first(), UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( TWO_INTEGER ) )
      {
        cb_form( list.first(), UNPROVIDED, UNPROVIDED );
        html_utilities.html_princ( $str341$_and_ );
        cb_form( conses_high.second( list ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        final SubLObject last = list_utilities.last_one( list );
        SubLObject cdolist_list_var;
        final SubLObject butlast = cdolist_list_var = conses_high.butlast( list, UNPROVIDED );
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cb_form( item, UNPROVIDED, UNPROVIDED );
          html_utilities.html_princ( $str217$__ );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
        html_utilities.html_princ( $str342$and_ );
        cb_form( last, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_show_assertion_in_nl(final SubLObject assertion)
  {
    final SubLObject domain_mt = assertions_high.assertion_mt( assertion );
    cb_show_in_nl_int( assertion, domain_mt, $sym343$HTML_GENERATE_TEXT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_show_sentence_in_nl(final SubLObject sentence, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    cb_show_in_nl_int( sentence, domain_mt, $sym343$HTML_GENERATE_TEXT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_show_question_in_nl(final SubLObject sentence, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    cb_show_in_nl_int( sentence, domain_mt, $sym344$HTML_GENERATE_QUESTION );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_show_term_in_nl(final SubLObject v_term, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    cb_show_in_nl_int( v_term, domain_mt, $sym41$HTML_GENERATE_PHRASE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_show_in_nl_int(final SubLObject obj, final SubLObject domain_mt, final SubLObject paraphrase_fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds( pph_phrase.pph_phrase_destroyer() );
    pph_phrase.set_pph_phrase_destruction_grace_period( Numbers.max( old_grace_period, $int345$300 ) );
    final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding( thread );
    try
    {
      pph_vars.$bypass_pph_phrase_destroyerP$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject html = cb_html_for_obj_in_nl( obj, domain_mt, paraphrase_fn, UNPROVIDED );
      final SubLObject v_pph_phrase = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_pph_phrase && NIL != control_vars.$generated_phrases_browsableP$.getDynamicValue( thread ) )
      {
        cb_form( v_pph_phrase, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        html_utilities.html_markup( html );
      }
    }
    finally
    {
      pph_vars.$bypass_pph_phrase_destroyerP$.rebind( _prev_bind_0, thread );
    }
    pph_phrase.set_pph_phrase_destruction_grace_period( old_grace_period );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_html_for_obj_in_nl(final SubLObject obj, final SubLObject domain_mt, final SubLObject paraphrase_fn, SubLObject addressee)
  {
    if( addressee == UNPROVIDED )
    {
      addressee = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject paraphrase = NIL;
    SubLObject v_pph_phrase = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
      final SubLObject target = cb_frame_name( $kw85$MAIN );
      final SubLObject _prev_bind_0_$43 = pph_vars.$constant_link_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding( thread );
      try
      {
        pph_vars.$constant_link_function$.bind( $sym346$CB_CF, thread );
        pph_vars.$html_generation_target$.bind( ( NIL != target ) ? target : pph_vars.$html_generation_target$.getDynamicValue( thread ), thread );
        if( NIL != control_vars.$assume_cyc_cyclist_dialogP$.getDynamicValue( thread ) )
        {
          final SubLObject _prev_bind_0_$44 = pph_vars.$pph_speaker$.currentBinding( thread );
          final SubLObject _prev_bind_1_$45 = pph_vars.$pph_addressee$.currentBinding( thread );
          try
          {
            pph_vars.$pph_speaker$.bind( $const347$Cyc, thread );
            pph_vars.$pph_addressee$.bind( addressee, thread );
            thread.resetMultipleValues();
            final SubLObject paraphrase_$46 = cb_html_for_obj_in_nl_values( paraphrase_fn, obj );
            final SubLObject v_pph_phrase_$47 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            paraphrase = paraphrase_$46;
            v_pph_phrase = v_pph_phrase_$47;
          }
          finally
          {
            pph_vars.$pph_addressee$.rebind( _prev_bind_1_$45, thread );
            pph_vars.$pph_speaker$.rebind( _prev_bind_0_$44, thread );
          }
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject paraphrase_$47 = cb_html_for_obj_in_nl_values( paraphrase_fn, obj );
          final SubLObject v_pph_phrase_$48 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          paraphrase = paraphrase_$47;
          v_pph_phrase = v_pph_phrase_$48;
        }
      }
      finally
      {
        pph_vars.$html_generation_target$.rebind( _prev_bind_2, thread );
        pph_vars.$constant_link_function$.rebind( _prev_bind_0_$43, thread );
      }
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( paraphrase, v_pph_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
  public static SubLObject cb_html_for_obj_in_nl_values(final SubLObject paraphrase_fn, final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_language_mt$.bind( cb_tools.cb_paraphrase_mt(), thread );
      thread.resetMultipleValues();
      final SubLObject ret_string = Functions.funcall( paraphrase_fn, obj );
      final SubLObject pred = thread.secondMultipleValue();
      final SubLObject justifications = thread.thirdMultipleValue();
      final SubLObject output_list = thread.fourthMultipleValue();
      final SubLObject demerits = thread.fifthMultipleValue();
      final SubLObject v_pph_phrase = thread.sixthMultipleValue();
      thread.resetMultipleValues();
      return Values.values( ret_string, v_pph_phrase );
    }
    finally
    {
      pph_vars.$pph_language_mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 60081L)
  public static SubLObject cb_show_term(final SubLObject v_term, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
    {
      return cb_show_term_in_nl( v_term, UNPROVIDED );
    }
    return cb_form( v_term, depth, wrap_axiomsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 60735L)
  public static SubLObject cb_show_assertion_readably(final SubLObject assertion, SubLObject wrap, SubLObject include_mtP)
  {
    if( wrap == UNPROVIDED )
    {
      wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
    }
    if( include_mtP == UNPROVIDED )
    {
      include_mtP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
    {
      cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cb_show_assertion_in_nl( assertion );
    }
    else if( NIL != wrap && $kw349$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_princ( $str350$f__ );
        }
        cb_form( assertion, ZERO_INTEGER, T );
        if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_princ( $str351$__ );
        }
        if( NIL != include_mtP )
        {
          final SubLObject mt = assertions_high.assertion_mt( assertion );
          if( NIL == constant_handles.constant_p( mt ) )
          {
            html_utilities.html_newline( UNPROVIDED );
          }
          if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_princ( $str352$___ );
          }
          html_utilities.html_princ( $str353$_in_ );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          if( NIL != constant_handles.constant_p( mt ) )
          {
            cb_form( mt, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
            cb_form( mt, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_form( assertion, ZERO_INTEGER, NIL );
        if( NIL != include_mtP )
        {
          html_utilities.html_princ( $str353$_in_ );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          cb_form( assertions_high.assertion_mt( assertion ), UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62085L)
  public static SubLObject when_filtered_assertion(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list354 );
    assertion = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym355$PWHEN, ConsesLow.list( $sym356$COR, $list357, ConsesLow.list( $sym358$FUNCALL, $sym359$_ASSERTION_FILTER_HOOK_, assertion ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62280L)
  public static SubLObject without_assertion_filters(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym290$CLET, $list360, reader.bq_cons( $sym361$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62404L)
  public static SubLObject cb_assertion_link(final SubLObject assertion, SubLObject wrap)
  {
    if( wrap == UNPROVIDED )
    {
      wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assertion_filter_hook$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_filter_hook$.getDynamicValue( thread ), assertion ) )
    {
      cb_show_assertion_readably( assertion, wrap, NIL );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62605L)
  public static SubLObject cb_assertion_link_with_mt(final SubLObject assertion, SubLObject wrap)
  {
    if( wrap == UNPROVIDED )
    {
      wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assertion_filter_hook$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_filter_hook$.getDynamicValue( thread ), assertion ) )
    {
      cb_show_assertion_readably( assertion, wrap, T );
    }
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62810L)
  public static SubLObject cb_assertion_link_binary(final SubLObject assertion, SubLObject show_negatedP)
  {
    if( show_negatedP == UNPROVIDED )
    {
      show_negatedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assertion_filter_hook$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_filter_hook$.getDynamicValue( thread ), assertion ) )
    {
      if( NIL == show_negatedP && $kw22$FALSE == assertions_high.assertion_truth( assertion ) )
      {
        return cb_browser.cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated( assertion );
      }
      final SubLObject arg2 = assertions_high.gaf_arg2( assertion );
      final SubLObject depth = ZERO_INTEGER;
      SubLObject wrapP = NIL;
      SubLObject newlineP = NIL;
      if( NIL != constant_handles.constant_p( arg2 ) )
      {
        wrapP = NIL;
      }
      else if( NIL != nart_handles.nart_p( arg2 ) )
      {
        wrapP = T;
      }
      else if( NIL != assertion_handles.assertion_p( arg2 ) )
      {
        wrapP = T;
        newlineP = T;
      }
      else if( arg2.isString() && Sequences.length( arg2 ).numG( $int362$40 ) )
      {
        wrapP = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread );
      }
      else if( arg2.isAtom() )
      {
        wrapP = NIL;
      }
      else
      {
        wrapP = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread );
        newlineP = T;
      }
      if( NIL != wrapP )
      {
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        if( NIL != cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue( thread ) )
        {
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cb_show_term( arg2, depth, wrapP );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        if( NIL != cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue( thread ) )
        {
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cb_show_term( arg2, depth, wrapP );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      if( NIL != newlineP )
      {
        html_utilities.html_newline( UNPROVIDED );
      }
      html_utilities.html_indent( ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 64016L)
  public static SubLObject cb_show_hl_support_readably(final SubLObject support, SubLObject validation_level)
  {
    if( validation_level == UNPROVIDED )
    {
      validation_level = $kw363$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject module = arguments.support_module( support );
    final SubLObject formula = arguments.support_formula( support );
    final SubLObject mt = arguments.support_mt( support );
    if( $kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
    {
      cb_show_hl_support_formula_readably( formula );
      html_utilities.html_princ( $str364$__claimed_by_ );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
      cb_link( $kw365$HL_SUPPORT, support, validation_level, module, UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_princ( $str366$_module_ );
    }
    else
    {
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
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw368$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw76$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            cb_link( $kw365$HL_SUPPORT, support, validation_level, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
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
            html_utilities.html_glyph( $kw370$NBSP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw368$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw76$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_form( formula, ZERO_INTEGER, T );
            if( NIL == constant_handles.constant_p( mt ) )
            {
              html_utilities.html_newline( UNPROVIDED );
            }
            html_utilities.html_princ( $str353$_in_ );
            if( NIL != constant_handles.constant_p( mt ) )
            {
              cb_form( mt, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
              cb_form( mt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
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
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 65942L)
  public static SubLObject cb_show_hl_support_formula_readably(final SubLObject formula)
  {
    return cb_show_sentence_in_nl( formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 66039L)
  public static SubLObject cb_show_el_assertion_readably(final SubLObject assertion, SubLObject wrap, SubLObject include_mtP, SubLObject check_for_redundant_el_formulasP)
  {
    if( wrap == UNPROVIDED )
    {
      wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
    }
    if( include_mtP == UNPROVIDED )
    {
      include_mtP = T;
    }
    if( check_for_redundant_el_formulasP == UNPROVIDED )
    {
      check_for_redundant_el_formulasP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
    {
      cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cb_show_assertion_in_nl( assertion );
      return assertion;
    }
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject hl_formula = fi.assertion_hl_formula( assertion, UNPROVIDED );
    SubLObject formula = NIL;
    SubLObject already_shownP = NIL;
    thread.resetMultipleValues();
    final SubLObject el_formula = cb_assertion_el_formula( assertion, hl_formula );
    final SubLObject el_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( fi.assertion_expand( narts_high.nart_expand( el_formula ) ).equal( fi.assertion_expand( narts_high.nart_expand( hl_formula ) ) ) )
    {
      formula = hl_formula;
    }
    else if( NIL != check_for_redundant_el_formulasP && el_formula.equal( cb_parameters.$cb_show_el_assertion_readably_last_formula$.getDynamicValue( thread ) ) && ( NIL == include_mtP || NIL != hlmt.hlmt_equal( mt,
        cb_parameters.$cb_show_el_assertion_readably_last_mt$.getDynamicValue( thread ) ) ) )
    {
      already_shownP = T;
    }
    else if( NIL != hlmt.hlmt_equalP( mt, el_mt ) || NIL != include_mtP )
    {
      formula = el_formula;
    }
    else
    {
      formula = el_utilities.make_ist_sentence( el_mt, el_formula );
    }
    if( NIL != check_for_redundant_el_formulasP && NIL == already_shownP )
    {
      cb_parameters.$cb_show_el_assertion_readably_last_formula$.setDynamicValue( formula, thread );
      if( NIL != include_mtP )
      {
        cb_parameters.$cb_show_el_assertion_readably_last_mt$.setDynamicValue( mt, thread );
      }
    }
    if( NIL != already_shownP )
    {
      cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != include_mtP )
      {
        html_utilities.html_princ( $str372$EL_Formula___Mt_Identical_to_Asse );
      }
      else
      {
        html_utilities.html_princ( $str373$EL_Formula_Identical_to_Assertion );
      }
    }
    else if( NIL != wrap )
    {
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_form_assertion_formula( assertion, formula, ZERO_INTEGER, T, UNPROVIDED );
        if( NIL != include_mtP )
        {
          html_utilities.html_princ( $str353$_in_ );
          cb_form( el_mt, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cb_html_parameters.$cb_html_assertion_class$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_form_assertion_formula( assertion, formula, ZERO_INTEGER, NIL, UNPROVIDED );
        if( NIL != include_mtP )
        {
          html_utilities.html_princ( $str353$_in_ );
          cb_form( el_mt, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 68567L)
  public static SubLObject cb_assertion_el_formula(final SubLObject assertion, SubLObject hl_formula)
  {
    if( hl_formula == UNPROVIDED )
    {
      hl_formula = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == dictionary.dictionary_p( cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue( thread ) ) )
    {
      cb_parameters.$cb_assertion_el_formula_cache$.setDynamicValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
    }
    final SubLObject el_formula_mt_pair = dictionary.dictionary_lookup( cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue( thread ), assertion, UNPROVIDED );
    SubLObject el_formula = el_formula_mt_pair.first();
    SubLObject el_mt = conses_high.second( el_formula_mt_pair );
    if( NIL != el_formula )
    {
      return Values.values( el_formula, el_mt );
    }
    thread.resetMultipleValues();
    final SubLObject el_formula_$54 = uncanonicalizer.assertion_el_formula( assertion );
    final SubLObject el_mt_$55 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    el_formula = el_formula_$54;
    el_mt = el_mt_$55;
    if( NIL == hl_formula )
    {
      hl_formula = fi.assertion_hl_formula( assertion, UNPROVIDED );
    }
    if( !el_formula.equal( hl_formula ) )
    {
      dictionary.dictionary_enter( cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue( thread ), assertion, ConsesLow.list( el_formula, el_mt ) );
    }
    return Values.values( el_formula, el_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 69619L)
  public static SubLObject cb_el_assertion_link_checking_redundancy(final SubLObject assertion, SubLObject wrap)
  {
    if( wrap == UNPROVIDED )
    {
      wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assertion_filter_hook$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_filter_hook$.getDynamicValue( thread ), assertion ) )
    {
      cb_show_el_assertion_readably( assertion, wrap, NIL, T );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 70142L)
  public static SubLObject cb_el_assertion_link_with_mt_checking_redundancy(final SubLObject assertion, SubLObject wrap)
  {
    if( wrap == UNPROVIDED )
    {
      wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assertion_filter_hook$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_filter_hook$.getDynamicValue( thread ), assertion ) )
    {
      cb_show_el_assertion_readably( assertion, wrap, T, T );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 70680L)
  public static SubLObject cb_el_assertion_link_binary_checking_redundancy(final SubLObject assertion, SubLObject show_negatedP)
  {
    if( show_negatedP == UNPROVIDED )
    {
      show_negatedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $assertion_filter_hook$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_filter_hook$.getDynamicValue( thread ), assertion ) )
    {
      cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject arg2 = assertions_high.gaf_arg2( assertion );
      if( NIL != assertion_handles.assertion_p( arg2 ) )
      {
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_show_el_assertion_readably( arg2, T, NIL, T );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
      }
      else
      {
        cb_parameters.$cb_show_el_assertion_readably_last_formula$.setDynamicValue( NIL, thread );
        cb_parameters.$cb_show_el_assertion_readably_last_mt$.setDynamicValue( NIL, thread );
        if( NIL != constant_handles.constant_p( arg2 ) )
        {
          cb_form( arg2, ZERO_INTEGER, NIL );
        }
        else if( NIL != nart_handles.nart_p( arg2 ) )
        {
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_form( arg2, ZERO_INTEGER, T );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        else if( arg2.isString() )
        {
          cb_form( arg2, ZERO_INTEGER, NIL );
        }
        else if( arg2.isAtom() )
        {
          cb_form( arg2, ZERO_INTEGER, NIL );
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_form( arg2, ZERO_INTEGER, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ) );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
        }
      }
      html_utilities.html_indent( ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72105L)
  public static SubLObject cb_term_of_unit_link(final SubLObject assertion, SubLObject wrapP)
  {
    if( wrapP == UNPROVIDED )
    {
      wrapP = NIL;
    }
    cb_link( $kw171$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cb_form( cycl_utilities.sentence_arg1( assertion, UNPROVIDED ), NIL, wrapP );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72311L)
  public static SubLObject cb_index_hook_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) || NIL != assertion_handles.assertion_p( v_object ) || NIL != auxiliary_indexing.auxiliary_index_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72480L)
  public static SubLObject cb_index_identifier(final SubLObject index_hook)
  {
    if( NIL != forts.fort_p( index_hook ) )
    {
      return cb_fort_identifier( index_hook );
    }
    if( NIL != auxiliary_indexing.auxiliary_index_p( index_hook ) )
    {
      return index_hook;
    }
    if( NIL != term.closed_nautP( index_hook, UNPROVIDED ) )
    {
      return cb_naut_identifier( index_hook );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 73739L)
  public static SubLObject cb_fort_identifier(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( $cb_constant_id_prefix$.getGlobalValue() ), format_nil.format_nil_a_no_copy( ( NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() )
          ? kb_utilities.cached_compact_hl_external_id_string( fort )
          : constants_high.constant_internal_id( fort ) ) );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( $cb_nart_id_prefix$.getGlobalValue() ), format_nil.format_nil_a_no_copy( ( NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() )
          ? kb_utilities.cached_compact_hl_external_id_string( fort )
          : nart_handles.nart_id( fort ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 74336L)
  public static SubLObject cb_assertion_identifier(final SubLObject v_assert)
  {
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( $cb_assertion_id_prefix$.getGlobalValue() ), format_nil.format_nil_a_no_copy( ( NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() )
        ? kb_utilities.cached_compact_hl_external_id_string( v_assert )
        : assertion_handles.assertion_id( v_assert ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 74569L)
  public static SubLObject cb_term_identifier(final SubLObject v_term)
  {
    if( NIL != forts.fort_p( v_term ) )
    {
      return cb_fort_identifier( v_term );
    }
    if( NIL != term.closed_nautP( v_term, UNPROVIDED ) )
    {
      return cb_naut_identifier( v_term );
    }
    if( NIL != auxiliary_indexing.auxiliary_index_p( v_term ) )
    {
      return print_high.prin1_to_string( v_term );
    }
    if( NIL != assertion_handles.assertion_p( v_term ) )
    {
      return cb_assertion_identifier( v_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 74890L)
  public static SubLObject cb_valid_fort_identifierP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && ( ( NIL != string_utilities.starts_with( v_object, $cb_constant_id_prefix$.getGlobalValue() ) && NIL != ( ( NIL != $cb_image_independent_fort_identifiersP$
        .getGlobalValue() ) ? kb_utilities.compact_hl_external_id_string_p( string_utilities.pre_remove( v_object, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED ) )
            : string_utilities.integer_string_p( string_utilities.pre_remove( v_object, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED ) ) ) ) || ( NIL != string_utilities.starts_with( v_object, $cb_nart_id_prefix$
                .getGlobalValue() ) && NIL != ( ( NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() ) ? kb_utilities.compact_hl_external_id_string_p( string_utilities.pre_remove( v_object,
                    $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED ) ) : string_utilities.integer_string_p( string_utilities.pre_remove( v_object, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 75566L)
  public static SubLObject cb_hlmt_identifier(final SubLObject v_hlmt)
  {
    if( NIL != forts.fort_p( v_hlmt ) )
    {
      return cb_fort_identifier( v_hlmt );
    }
    return cb_string_for_hlmt( v_hlmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 75737L)
  public static SubLObject cb_valid_hlmt_identifierP(final SubLObject v_object)
  {
    return makeBoolean( NIL != cb_valid_fort_identifierP( v_object ) || v_object.isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 75863L)
  public static SubLObject cb_guess_constant(final SubLObject args)
  {
    if( args.isInteger() )
    {
      return constants_high.find_constant_by_internal_id( args );
    }
    if( NIL != constant_handles.constant_p( args ) )
    {
      return args;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() )
    {
      return cb_guess_constant_from_string( args );
    }
    if( args.isCons() && NIL != forts.fort_p( args.first() ) )
    {
      return narts_high.find_nart( args );
    }
    if( args.isCons() )
    {
      return cb_guess_constant( args.first() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 76834L)
  public static SubLObject cb_guess_constant_from_string(final SubLObject args)
  {
    SubLObject constant = NIL;
    if( !args.equalp( $str379$NIL ) )
    {
      constant = ke_utilities.fort_from_string( args );
      if( NIL == constant_handles.constant_p( constant ) && NIL != string_utilities.starts_with( args, $cb_constant_id_prefix$.getGlobalValue() ) )
      {
        constant = cb_guess_constant( reader.read_from_string_ignoring_errors( string_utilities.pre_remove( args, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED ), NIL, NIL, UNPROVIDED, UNPROVIDED ) );
      }
      if( NIL == constant && NIL != string_utilities.digit_stringP( args ) )
      {
        constant = cb_guess_constant( reader.read_from_string_ignoring_errors( args, NIL, NIL, UNPROVIDED, UNPROVIDED ) );
      }
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 77374L)
  public static SubLObject cb_guess_nart(final SubLObject args)
  {
    if( args.isInteger() )
    {
      return nart_handles.find_nart_by_id( args );
    }
    if( NIL != nart_handles.nart_p( args ) )
    {
      return args;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() && NIL != string_utilities.starts_with( args, $cb_nart_id_prefix$.getGlobalValue() ) )
    {
      return cb_guess_nart( reader.read_from_string_ignoring_errors( string_utilities.pre_remove( args, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED ), NIL, NIL, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != string_utilities.digit_stringP( args ) )
    {
      return cb_guess_nart( reader.read_from_string_ignoring_errors( args, NIL, NIL, UNPROVIDED, UNPROVIDED ) );
    }
    if( args.isString() && args.equalp( $str379$NIL ) )
    {
      return NIL;
    }
    if( args.isString() )
    {
      final SubLObject v_term = ke_utilities.fort_from_string( args );
      return ( NIL != nart_handles.nart_p( v_term ) ) ? v_term : NIL;
    }
    if( args.isCons() && NIL != forts.fort_p( args.first() ) )
    {
      return narts_high.find_nart( args );
    }
    if( args.isCons() )
    {
      return cb_guess_nart( args.first() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 78539L)
  public static SubLObject cb_guess_nat(final SubLObject args)
  {
    return cb_guess_nart( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 78639L)
  public static SubLObject cb_fort_display_string(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_name( fort );
    }
    return string_utilities.string_remove_constant_reader_prefixes( cb_string_for_fort( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 79066L)
  public static SubLObject cb_string_for_fort(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    final SubLObject el_formula = forts.fort_el_formula( fort );
    if( NIL != constant_handles.constant_p( el_formula ) )
    {
      final SubLObject name = constants_high.constant_name( el_formula );
      if( name.isString() )
      {
        return name;
      }
    }
    return format_nil.format_nil_s( el_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 79417L)
  public static SubLObject cb_guess_fort(final SubLObject args, SubLObject interpret_idsP)
  {
    if( interpret_idsP == UNPROVIDED )
    {
      interpret_idsP = T;
    }
    if( NIL != interpret_idsP )
    {
      final SubLObject fort = cb_guess_fort_from_id( args );
      if( NIL != fort )
      {
        return fort;
      }
    }
    return cb_guess_fort_from_non_id( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 79632L)
  public static SubLObject cb_guess_fort_from_id(final SubLObject args)
  {
    if( args.isInteger() && !args.isNegative() )
    {
      return constants_high.find_constant_by_internal_id( args );
    }
    if( args.isInteger() && args.isNegative() )
    {
      return nart_handles.find_nart_by_id( Numbers.minus( args ) );
    }
    if( NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() && args.isString() && NIL != string_utilities.starts_with( args, $cb_image_independent_constant_id_prefix$.getGlobalValue() ) )
    {
      return cb_guess_constant( string_utilities.pre_remove( args, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED ) );
    }
    if( args.isString() && NIL != string_utilities.starts_with( args, $cb_constant_id_prefix$.getGlobalValue() ) )
    {
      return cb_guess_constant( reader.read_from_string_ignoring_errors( args, NIL, NIL, Sequences.length( $cb_constant_id_prefix$.getGlobalValue() ), UNPROVIDED ) );
    }
    if( NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() && args.isString() && NIL != string_utilities.starts_with( args, $cb_image_independent_nart_id_prefix$.getGlobalValue() ) )
    {
      return cb_guess_constant( string_utilities.pre_remove( args, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED ) );
    }
    if( args.isString() && NIL != string_utilities.starts_with( args, $cb_nart_id_prefix$.getGlobalValue() ) )
    {
      return cb_guess_nart( reader.read_from_string_ignoring_errors( args, NIL, NIL, Sequences.length( $cb_nart_id_prefix$.getGlobalValue() ), UNPROVIDED ) );
    }
    if( NIL != string_utilities.digit_stringP( args ) )
    {
      return cb_guess_fort_from_id( reader.read_from_string_ignoring_errors( args, NIL, NIL, UNPROVIDED, UNPROVIDED ) );
    }
    if( args.isString() && Sequences.length( args ).numG( ONE_INTEGER ) && NIL != Characters.charE( Strings.sublisp_char( args, ZERO_INTEGER ), Characters.CHAR_hyphen ) && NIL == list_utilities.find_if_not( Symbols
        .symbol_function( $sym383$DIGIT_CHAR_P ), args, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED ) )
    {
      return cb_guess_fort_from_id( reader.read_from_string_ignoring_errors( args, NIL, NIL, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 81273L)
  public static SubLObject cb_guess_fort_from_non_id(final SubLObject args)
  {
    if( NIL != constant_handles.constant_p( args ) )
    {
      return args;
    }
    if( NIL != nart_handles.nart_p( args ) )
    {
      return args;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() && args.equalp( $str379$NIL ) )
    {
      return NIL;
    }
    if( args.isString() )
    {
      return ke_utilities.fort_from_string( args );
    }
    if( args.isCons() && NIL != forts.fort_p( args.first() ) )
    {
      return narts_high.find_nart( args );
    }
    if( args.isCons() )
    {
      return cb_guess_fort( args.first(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82422L)
  public static SubLObject cb_naut_identifierP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, $cb_naut_id_prefix_length$.getGlobalValue(), UNPROVIDED ) && NIL != Strings.stringE( $cb_naut_id_prefix$.getGlobalValue(), string_utilities.substring(
        string, ZERO_INTEGER, $cb_naut_id_prefix_length$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82612L)
  public static SubLObject cb_naut_identifier(final SubLObject naut)
  {
    return cb_string_for_naut( naut );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82692L)
  public static SubLObject cb_naut_identifier_string(final SubLObject string)
  {
    return string_utilities.substring( string, $cb_naut_id_prefix_length$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82799L)
  public static SubLObject cb_naut_display_string(final SubLObject naut)
  {
    return string_utilities.string_remove_constant_reader_prefixes( string_utilities.to_lisp_string( cycl_utilities.hl_to_el( naut ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83033L)
  public static SubLObject cb_string_for_naut(final SubLObject naut)
  {
    return Sequences.cconcatenate( $cb_naut_id_prefix$.getGlobalValue(), string_utilities.str( cb_parameters.cb_glob_id( naut ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83146L)
  public static SubLObject cb_guess_naut(final SubLObject args, SubLObject interpret_idsP)
  {
    if( interpret_idsP == UNPROVIDED )
    {
      interpret_idsP = T;
    }
    SubLObject result = NIL;
    if( NIL != term.closed_nautP( args, UNPROVIDED ) )
    {
      result = args;
    }
    else if( args.isString() && NIL != interpret_idsP && NIL != cb_naut_identifierP( args ) )
    {
      result = cb_parameters.cb_glob_lookup_by_string( cb_naut_identifier_string( args ) );
    }
    else if( NIL != interpret_idsP && NIL != kb_utilities.hl_external_id_string_p( args ) )
    {
      result = kb_utilities.find_object_by_hl_external_id_string( args );
    }
    else if( args.isCons() )
    {
      result = cb_guess_naut( args.first(), interpret_idsP );
    }
    else
    {
      result = ke_utilities.cycl_from_string( args );
    }
    return czer_main.canonicalize_term( result, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83770L)
  public static SubLObject cb_guess_naut_spec(final SubLObject naut_spec)
  {
    return ( NIL != term.closed_nautP( naut_spec, UNPROVIDED ) ) ? naut_spec : cb_guess_naut( naut_spec, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84064L)
  public static SubLObject cb_sentence_identifierP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, $cb_sentence_id_prefix_length$.getGlobalValue(), UNPROVIDED ) && NIL != Strings.stringE( $cb_sentence_id_prefix$.getGlobalValue(), string_utilities
        .substring( string, ZERO_INTEGER, $cb_sentence_id_prefix_length$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84270L)
  public static SubLObject cb_sentence_identifier_string(final SubLObject string)
  {
    return string_utilities.substring( string, $cb_sentence_id_prefix_length$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84385L)
  public static SubLObject cb_string_for_sentence(final SubLObject sentence)
  {
    return Sequences.cconcatenate( $cb_sentence_id_prefix$.getGlobalValue(), string_utilities.str( cb_parameters.cb_glob_id( sentence ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84514L)
  public static SubLObject cb_guess_sentence(final SubLObject args)
  {
    if( NIL != cb_sentence_identifierP( args ) )
    {
      return cb_parameters.cb_glob_lookup_by_string( cb_sentence_identifier_string( args ) );
    }
    return ke_utilities.cycl_from_string( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84714L)
  public static SubLObject cb_assertion_identifierP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, $cb_assertion_id_prefix_length$.getGlobalValue(), UNPROVIDED ) && NIL != Strings.stringE( $cb_assertion_id_prefix$.getGlobalValue(), string_utilities
        .substring( string, ZERO_INTEGER, $cb_assertion_id_prefix_length$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84940L)
  public static SubLObject cb_assertion_identifier_string(final SubLObject string)
  {
    return string_utilities.substring( string, $cb_assertion_id_prefix_length$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85057L)
  public static SubLObject cb_string_for_assertion(final SubLObject assertion)
  {
    return cb_assertion_identifier_string( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85164L)
  public static SubLObject cb_term_display_string(final SubLObject v_term)
  {
    if( NIL != forts.fort_p( v_term ) )
    {
      return cb_fort_display_string( v_term );
    }
    return cb_naut_display_string( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85331L)
  public static SubLObject cb_string_for_term(final SubLObject v_term)
  {
    if( NIL != assertion_handles.assertion_p( v_term ) )
    {
      return cb_string_for_assertion( v_term );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return cb_string_for_fort( v_term );
    }
    return cb_string_for_naut( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85613L)
  public static SubLObject cb_guess_term(final SubLObject args, SubLObject interpret_idsP)
  {
    if( interpret_idsP == UNPROVIDED )
    {
      interpret_idsP = T;
    }
    if( NIL != cb_guess_fort( args, interpret_idsP ) )
    {
      return cb_guess_fort( args, interpret_idsP );
    }
    if( NIL != cb_assertion_identifierP( args ) )
    {
      return cb_guess_assertion( args );
    }
    return cb_guess_naut( args, interpret_idsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86002L)
  public static SubLObject cb_hlmt_display_string(final SubLObject v_hlmt)
  {
    return cb_term_display_string( v_hlmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86100L)
  public static SubLObject cb_string_for_hlmt(final SubLObject v_hlmt)
  {
    return cb_string_for_term( v_hlmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86180L)
  public static SubLObject cb_guess_hlmt(final SubLObject args)
  {
    return cb_guess_term( args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86250L)
  public static SubLObject cb_guess_date(final SubLObject string)
  {
    if( NIL != string_utilities.empty_stringP( string ) )
    {
      return hlmt.$default_mt_time_interval$.getGlobalValue();
    }
    return date_utilities.temporal_object_from_string( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86637L)
  public static SubLObject cb_guess_time_parameter(final SubLObject string)
  {
    if( NIL != string_utilities.empty_stringP( string ) )
    {
      return hlmt.$default_atemporal_time_parameter$.getGlobalValue();
    }
    return cb_guess_term( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86839L)
  public static SubLObject cb_time_interval_display_string(final SubLObject time_interval)
  {
    return ( NIL != time_interval ) ? string_utilities.string_remove_constant_reader_prefixes( format_cycl_expression.format_cycl_expression_to_string( time_interval, UNPROVIDED ) ) : $str88$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 87142L)
  public static SubLObject cb_time_parameter_display_string(final SubLObject time_parameter)
  {
    return ( NIL != time_parameter ) ? cb_term_display_string( time_parameter ) : $str88$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 87389L)
  public static SubLObject cb_show_assertion_hlmt_readably(final SubLObject v_hlmt)
  {
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( v_hlmt );
    html_utilities.html_princ( cb_fort_display_string( monad_mt ) );
    if( NIL != hlmt.interesting_hlmtP( v_hlmt ) )
    {
      html_utilities.html_princ( $str217$__ );
      cb_show_assertion_hlmt_time_interval_and_parameter( v_hlmt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 87679L)
  public static SubLObject cb_show_assertion_hlmt_time_interval_and_parameter(final SubLObject v_hlmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( v_hlmt );
    SubLObject time_interval = NIL;
    SubLObject time_parameter = NIL;
    thread.resetMultipleValues();
    final SubLObject time_interval_$56 = hlmt.explode_hlmt_temporal_facets_with_defaults( v_hlmt );
    final SubLObject time_parameter_$57 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    time_interval = time_interval_$56;
    time_parameter = time_parameter_$57;
    html_utilities.html_princ( cb_time_interval_display_string( time_interval ) );
    html_utilities.html_princ( $str217$__ );
    html_utilities.html_princ( cb_time_parameter_display_string( time_parameter ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88032L)
  public static SubLObject cb_mt_display_string(final SubLObject mt)
  {
    return cb_term_display_string( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88161L)
  public static SubLObject cb_string_for_mt(final SubLObject mt)
  {
    return cb_string_for_term( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88235L)
  public static SubLObject cb_guess_mt(final SubLObject args)
  {
    return cb_guess_term( args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88303L)
  public static SubLObject cb_guess_index(SubLObject args)
  {
    final SubLObject fort = cb_guess_fort( args, UNPROVIDED );
    if( NIL != forts.fort_p( fort ) )
    {
      return fort;
    }
    if( args.isCons() )
    {
      args = args.first();
    }
    if( args.isString() )
    {
      args = Packages.find_symbol( args, control_vars.$keyword_package$.getGlobalValue() );
    }
    if( !args.isSymbol() )
    {
      return NIL;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( kb_indexing.num_index( args ).numG( ZERO_INTEGER ) )
    {
      return args;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88764L)
  public static SubLObject cb_guess_assertion(final SubLObject args)
  {
    if( args.isInteger() )
    {
      return assertion_handles.find_assertion_by_id( args );
    }
    if( NIL != assertion_handles.assertion_p( args ) )
    {
      return args;
    }
    if( NIL != cb_assertion_identifierP( args ) && reader.read_from_string_ignoring_errors( cb_assertion_identifier_string( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).isInteger() )
    {
      return assertion_handles.find_assertion_by_id( reader.read_from_string_ignoring_errors( cb_assertion_identifier_string( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != cb_assertion_identifierP( args ) && NIL != kb_utilities.compact_hl_external_id_string_p( cb_assertion_identifier_string( args ) ) )
    {
      return kb_utilities.find_object_by_compact_hl_external_id_string( cb_assertion_identifier_string( args ) );
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() )
    {
      final SubLObject id = reader.read_from_string_ignoring_errors( args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( id.isInteger() )
      {
        return assertion_handles.find_assertion_by_id( id );
      }
      return NIL;
    }
    else
    {
      if( args.isCons() )
      {
        return cb_guess_assertion( args.first() );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 89658L)
  public static SubLObject cb_guess_deduction(final SubLObject args)
  {
    if( args.isInteger() )
    {
      return deduction_handles.find_deduction_by_id( args );
    }
    if( NIL != deduction_handles.deduction_p( args ) )
    {
      return args;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() )
    {
      final SubLObject id = reader.read_from_string_ignoring_errors( args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( id.isInteger() )
      {
        return deduction_handles.find_deduction_by_id( id );
      }
      return NIL;
    }
    else
    {
      if( args.isCons() )
      {
        return cb_guess_deduction( args.first() );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 90107L)
  public static SubLObject prompt_for_simple_date(final SubLObject date, final SubLObject data_prefix)
  {
    final SubLObject day = Numbers.mod( date, $int176$100 );
    final SubLObject dayprompt = Sequences.cconcatenate( data_prefix, $str387$_day );
    final SubLObject month = Numbers.floor( Numbers.divide( Numbers.mod( date, $int388$10000 ), $int176$100 ), UNPROVIDED );
    final SubLObject monthprompt = Sequences.cconcatenate( data_prefix, $str389$_month );
    final SubLObject year = Numbers.floor( Numbers.divide( date, $int388$10000 ), UNPROVIDED );
    final SubLObject yearprompt = Sequences.cconcatenate( data_prefix, $str390$_year );
    html_utilities.html_indent( THREE_INTEGER );
    html_utilities.html_princ( $str391$Month );
    html_utilities.html_text_input( monthprompt, month, TWO_INTEGER );
    html_utilities.html_indent( THREE_INTEGER );
    html_utilities.html_princ( $str392$Day );
    html_utilities.html_text_input( dayprompt, day, TWO_INTEGER );
    html_utilities.html_indent( THREE_INTEGER );
    html_utilities.html_princ( $str393$Year );
    html_utilities.html_text_input( yearprompt, year, FOUR_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 90803L)
  public static SubLObject read_args_for_simple_date(final SubLObject data_prefix, final SubLObject args)
  {
    final SubLObject dayprompt = Sequences.cconcatenate( data_prefix, $str387$_day );
    final SubLObject monthprompt = Sequences.cconcatenate( data_prefix, $str389$_month );
    final SubLObject yearprompt = Sequences.cconcatenate( data_prefix, $str390$_year );
    final SubLObject day = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( dayprompt, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject month = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( monthprompt, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject year = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( yearprompt, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Numbers.add( Numbers.multiply( $int388$10000, year ), Numbers.multiply( $int176$100, month ), day );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 91390L)
  public static SubLObject read_multiple_terms_from_string(final SubLObject str)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject terms = NIL;
    SubLObject index = ZERO_INTEGER;
    while ( index.numL( Sequences.length( str ) ))
    {
      thread.resetMultipleValues();
      SubLObject v_object = reader.read_from_string_ignoring_errors( str, NIL, $kw394$EOF, index, UNPROVIDED );
      final SubLObject next_index = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( v_object == $kw394$EOF )
      {
        index = Sequences.length( str );
      }
      else
      {
        if( next_index == $kw395$ERROR )
        {
          return Values.values( NIL, $kw395$ERROR );
        }
        if( v_object.isSymbol() )
        {
          v_object = constant_completion_high.constant_complete( Symbols.symbol_name( v_object ), NIL, T, UNPROVIDED, UNPROVIDED ).first();
        }
        if( NIL != constant_handles.constant_p( v_object ) )
        {
          final SubLObject item_var = v_object;
          if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            terms = ConsesLow.cons( item_var, terms );
          }
        }
        if( next_index.isInteger() )
        {
          index = next_index;
        }
        else
        {
          index = Sequences.length( str );
        }
      }
    }
    return Values.values( terms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 92172L)
  public static SubLObject asserted_reviewer(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return kb_mapping_utilities.pred_values_in_mt( assertion, $const396$myReviewer, $const397$BookkeepingMt, ONE_INTEGER, TWO_INTEGER, $kw20$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 92456L)
  public static SubLObject cb_show_unmatched_parentheses(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject unmatched_paren_positions = string_utilities.unmatched_parentheses( string, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ_strong( $str399$The_following_parentheses_are_unm );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      SubLObject end_var_$58;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      SubLObject color_val;
      SubLObject _prev_bind_0_$59;
      for( end_var = ( end_var_$58 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$58 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL != subl_promotions.memberP( char_num, unmatched_paren_positions, UNPROVIDED, UNPROVIDED ) )
        {
          html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
          color_val = $html_unmatched_parenthesis_color$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != color_val )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( color_val ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ_strong( v_char );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
        }
        else
        {
          html_utilities.html_princ( v_char );
        }
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93040L)
  public static SubLObject cb_show_invalid_constants(final SubLObject string, SubLObject require_exactP)
  {
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_princ_strong( $str400$The_following_constants_are_inval );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_show_string_with_invalid_constants_highlighted( string, require_exactP );
      html_utilities.html_newline( UNPROVIDED );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93529L)
  public static SubLObject cb_show_eof_explanation(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_princ_strong( $str401$This_is_unreadable__because_more_ );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_princ( string );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93728L)
  public static SubLObject cb_show_reader_error_explanation(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_princ_strong( $str402$Trying_to_read_this_generated_an_ );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_princ( string );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93927L)
  public static SubLObject cb_show_symbols_for_invalid_constants(SubLObject sentence_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sentence_string = string_utilities.trim_whitespace( sentence_string );
    thread.resetMultipleValues();
    final SubLObject sentence = reader.read_from_string_ignoring_errors( sentence_string, NIL, $kw394$EOF, UNPROVIDED, UNPROVIDED );
    final SubLObject end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject read_sequence = string_utilities.substring( sentence_string, ZERO_INTEGER, end );
    final SubLObject unread_sequence = string_utilities.substring( sentence_string, end, Sequences.length( sentence_string ) );
    final SubLObject symbols_for_invalid_constants = cycl_utilities.expression_gather( sentence, $sym403$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ_strong( $str404$The_following_references_to_const );
    html_utilities.html_markup( html_macros.$html_blockquote_head$.getGlobalValue() );
    SubLObject cdolist_list_var = symbols_for_invalid_constants;
    SubLObject symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject invalid_name = Symbols.symbol_name( symbol );
      final SubLObject position = Sequences.search( invalid_name, sentence_string, Symbols.symbol_function( $sym405$CHAR_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject invalid_constant_name = Sequences.subseq( sentence_string, position, Numbers.add( position, Sequences.length( invalid_name ) ) );
      if( !symbol.eql( symbols_for_invalid_constants.first() ) )
      {
        html_utilities.html_newline( UNPROVIDED );
      }
      html_utilities.html_princ( invalid_constant_name );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    html_utilities.html_markup( html_macros.$html_blockquote_tail$.getGlobalValue() );
    html_utilities.html_princ_strong( $str406$in_the_following_string__ );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_show_string_with_invalid_constants_highlighted( read_sequence, T );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    if( NIL == string_utilities.empty_stringP( unread_sequence ) )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_princ_strong( $str407$Also__the_following_extra_string_ );
      html_utilities.html_newline( UNPROVIDED );
      html_macros.verify_not_within_html_pre();
      html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
      _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
      try
      {
        html_macros.$within_html_pre$.bind( T, thread );
        html_utilities.html_princ( unread_sequence );
      }
      finally
      {
        html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 95440L)
  public static SubLObject cb_show_non_sentence_explanation(SubLObject sentence_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    sentence_string = string_utilities.trim_whitespace( sentence_string );
    thread.resetMultipleValues();
    final SubLObject sentence = reader.read_from_string_ignoring_errors( sentence_string, NIL, $kw394$EOF, UNPROVIDED, UNPROVIDED );
    final SubLObject end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject read_sequence = string_utilities.substring( sentence_string, ZERO_INTEGER, end );
    final SubLObject unread_sequence = string_utilities.substring( sentence_string, end, Sequences.length( sentence_string ) );
    html_utilities.html_princ_strong( $str408$The_following_string_did_not_spec );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_princ( read_sequence );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    html_utilities.html_princ_strong( $str409$because__ );
    html_utilities.html_newline( UNPROVIDED );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_princ( el_grammar.why_not_el_sentence( sentence ) );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    if( NIL == string_utilities.empty_stringP( unread_sequence ) )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_princ_strong( $str407$Also__the_following_extra_string_ );
      html_utilities.html_newline( UNPROVIDED );
      html_macros.verify_not_within_html_pre();
      html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
      _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
      try
      {
        html_macros.$within_html_pre$.bind( T, thread );
        html_utilities.html_princ( unread_sequence );
      }
      finally
      {
        html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 96304L)
  public static SubLObject cb_fort_encoding_id(final SubLObject fort)
  {
    return cb_fort_identifier( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 96407L)
  public static SubLObject cb_fort_list_selector(final SubLObject label, final SubLObject v_forts, SubLObject selected_instance, SubLObject size, SubLObject filterfn, SubLObject choice_not_required,
      SubLObject none_selected_text)
  {
    if( selected_instance == UNPROVIDED )
    {
      selected_instance = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = ONE_INTEGER;
    }
    if( filterfn == UNPROVIDED )
    {
      filterfn = Symbols.symbol_function( IDENTITY );
    }
    if( choice_not_required == UNPROVIDED )
    {
      choice_not_required = NIL;
    }
    if( none_selected_text == UNPROVIDED )
    {
      none_selected_text = $str410$____none_selected____;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( label );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != size )
    {
      html_utilities.html_markup( html_macros.$html_select_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != choice_not_required )
      {
        html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( none_selected_text );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
        }
        html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
      }
      SubLObject cdolist_list_var = v_forts;
      SubLObject curr = NIL;
      curr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != Functions.funcall( filterfn, curr ) )
        {
          final SubLObject encoding_id = cb_fort_encoding_id( curr );
          final SubLObject selectedP = Equality.eql( curr, selected_instance );
          html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
          if( NIL != selectedP )
          {
            html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
          }
          if( NIL != encoding_id )
          {
            html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( encoding_id );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( kb_paths.fort_name( curr ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
          }
          html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
        }
        cdolist_list_var = cdolist_list_var.rest();
        curr = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
    return v_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 97590L)
  public static SubLObject cb_decode_fort_list_selector_result(final SubLObject label, final SubLObject html_args)
  {
    return cb_guess_fort( html_utilities.html_extract_input( label, html_args ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 97798L)
  public static SubLObject cb_fort_list_none_selected_p(final SubLObject v_object)
  {
    return Types.sublisp_null( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 98014L)
  public static SubLObject cb_instances_of_collection_selector(final SubLObject label, final SubLObject collection, SubLObject selected_instance, SubLObject size, SubLObject filterfn)
  {
    if( selected_instance == UNPROVIDED )
    {
      selected_instance = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = ONE_INTEGER;
    }
    if( filterfn == UNPROVIDED )
    {
      filterfn = Symbols.symbol_function( IDENTITY );
    }
    return cb_fort_list_selector( label, isa.all_fort_instances( collection, UNPROVIDED, UNPROVIDED ), selected_instance, size, filterfn, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 98489L)
  public static SubLObject cb_decode_instances_of_collection_selector(final SubLObject label, final SubLObject html_args)
  {
    return cb_decode_fort_list_selector_result( label, html_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 98710L)
  public static SubLObject cyclist_recent_terms(final SubLObject cyclist)
  {
    final SubLObject machines = html_kernel.machines_with_html_state();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = machines;
    SubLObject machine = NIL;
    machine = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject this_cyclist = html_kernel.html_var_value( $sym411$_THE_CYCLIST_, machine );
      if( this_cyclist.eql( cyclist ) )
      {
        result = ConsesLow.cons( html_kernel.html_var_value( $sym412$_CB_NAT_HISTORY_, machine ), result );
        result = ConsesLow.cons( html_kernel.html_var_value( $sym413$_CB_CONSTANT_HISTORY_, machine ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      machine = cdolist_list_var.first();
    }
    if( NIL != result )
    {
      result = Functions.apply( Symbols.symbol_function( $sym222$CCONCATENATE ), Sequences.nreverse( result ) );
    }
    return list_utilities.hash_remove_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 99665L)
  public static SubLObject cb_inactive_left_arrow()
  {
    return cb_directional_arrow_marker( $kw417$INACTIVE_LEFT_ARROW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 99771L)
  public static SubLObject cb_inactive_right_arrow()
  {
    return cb_directional_arrow_marker( $kw423$INACTIVE_RIGHT_ARROW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 99878L)
  public static SubLObject cb_left_arrow(final SubLObject url, final SubLObject link_text, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = $kw76$TOP;
    }
    return cb_directional_arrow( $kw414$ACTIVE_LEFT_ARROW, url, link_text, frame );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 100022L)
  public static SubLObject cb_right_arrow(final SubLObject url, final SubLObject link_text, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = $kw76$TOP;
    }
    return cb_directional_arrow( $kw420$ACTIVE_RIGHT_ARROW, url, link_text, frame );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 100167L)
  public static SubLObject cb_directional_arrow(final SubLObject arrow_icon, SubLObject url, final SubLObject link_text, final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw76$TOP == frame )
    {
      url = Sequences.cconcatenate( $str142$cb_start_, url );
    }
    final SubLObject frame_name_var = cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str426$_a, url );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != link_text )
    {
      html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( link_text );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
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
      cb_directional_arrow_marker( arrow_icon );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 100440L)
  public static SubLObject cb_directional_arrow_marker(final SubLObject arrow_icon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( arrow_icon );
    final SubLObject align = $kw76$TOP;
    final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( arrow_icon );
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
    return NIL;
  }

  public static SubLObject declare_cb_utilities_file()
  {
    SubLFiles.declareFunction( me, "cb_url", "CB-URL", 1, 5, false );
    SubLFiles.declareFunction( me, "cb_error", "CB-ERROR", 1, 5, false );
    SubLFiles.declareFunction( me, "cb_show_fi_error", "CB-SHOW-FI-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_simple_message_page", "CB-SIMPLE-MESSAGE-PAGE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_history_with_back_link", "CB-HISTORY-WITH-BACK-LINK", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_message_page_with_history", "CB-MESSAGE-PAGE-WITH-HISTORY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_titled_message_page_with_history", "CB-TITLED-MESSAGE-PAGE-WITH-HISTORY", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_frame_update_message_page_info", "CB-FRAME-UPDATE-MESSAGE-PAGE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_truth", "CB-SHOW-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_strength", "CB-SHOW-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_direction", "CB-SHOW-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_support_module", "CB-SHOW-SUPPORT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_term_font_size", "CB-TERM-FONT-SIZE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_show_date", "CB-SHOW-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_second", "CB-SHOW-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_cyclist", "CB-SHOW-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cb_html_for_cyclist_in_nl", "CLEAR-CB-HTML-FOR-CYCLIST-IN-NL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cb_html_for_cyclist_in_nl", "REMOVE-CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_html_for_cyclist_in_nl_internal", "CB-HTML-FOR-CYCLIST-IN-NL-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_html_for_cyclist_in_nl", "CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false );
    SubLFiles.declareFunction( me, "cyc_system_doc_rename_kill", "CYC-SYSTEM-DOC-RENAME-KILL", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_system_doc_naming_conventions", "CYC-SYSTEM-DOC-NAMING-CONVENTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_documentation_toc", "CYC-DOCUMENTATION-TOC", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_doc_link", "CB-DOC-LINK", 3, 1, false );
    SubLFiles.declareFunction( me, "cb_show_boolean", "CB-SHOW-BOOLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "boolean_yes_no_string", "BOOLEAN-YES-NO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_available_tools", "CB-AVAILABLE-TOOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_standard_tools", "CB-STANDARD-TOOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_deprecated_tools", "CB-DEPRECATED-TOOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_available_tools", "CB-CLEAR-AVAILABLE-TOOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_cb_tool", "DECLARE-CB-TOOL", 4, 0, false );
    SubLFiles.declareFunction( me, "declare_deprecated_cb_tool", "DECLARE-DEPRECATED-CB-TOOL", 4, 0, false );
    SubLFiles.declareFunction( me, "undeclare_cb_tool", "UNDECLARE-CB-TOOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_tool_name", "CB-TOOL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_tool_abbreviation", "CB-TOOL-ABBREVIATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_definitional_preds_for_type", "CB-DEFINITIONAL-PREDS-FOR-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_definitional_preds_for_fort", "CB-DEFINITIONAL-PREDS-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_sort_preds_for_display", "CB-SORT-PREDS-FOR-DISPLAY", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_sort_mts_for_display", "CB-SORT-MTS-FOR-DISPLAY", 1, 1, false );
    SubLFiles.declareFunction( me, "mt_start_universal_time_extended", "MT-START-UNIVERSAL-TIME-EXTENDED", 1, 1, false );
    SubLFiles.declareFunction( me, "mt_end_universal_time_extended", "MT-END-UNIVERSAL-TIME-EXTENDED", 1, 1, false );
    SubLFiles.declareFunction( me, "get_mt_time_interval_memoized_internal", "GET-MT-TIME-INTERVAL-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_mt_time_interval_memoized", "GET-MT-TIME-INTERVAL-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_cycl_second_to_universal_time_extended_internal", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "maybe_cycl_second_to_universal_time_extended", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED", 1, 1, false );
    SubLFiles.declareFunction( me, "maybe_cycl_second_to_universal_time_extended_low", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-LOW", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_sort_args_for_display", "CB-SORT-ARGS-FOR-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_group_hlmts_by_monad_mt", "CB-GROUP-HLMTS-BY-MONAD-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_back_button", "CB-BACK-BUTTON", 0, 2, false );
    SubLFiles.declareFunction( me, "register_cb_frame", "REGISTER-CB-FRAME", 2, 4, false );
    SubLFiles.declareFunction( me, "deregister_cb_frame", "DEREGISTER-CB-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_frame_info", "CB-FRAME-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_frame_name", "CB-FRAME-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_frame", "CB-FRAME", 1, 4, false );
    SubLFiles.declareFunction( me, "cb_link", "CB-LINK", 1, 5, false );
    SubLFiles.declareFunction( me, "setup_cb_link_method", "SETUP-CB-LINK-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_link_method", "CB-LINK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_max_args", "CB-LINK-MAX-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_constant", "CB-LINK-CONSTANT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_nat_span_id", "CB-NAT-SPAN-ID", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_nart", "CB-LINK-NART", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_link_nat", "CB-LINK-NAT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_naut", "CB-LINK-NAUT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_naut_href", "CB-NAUT-HREF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_lexicon", "CB-LINK-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_unnamed", "CB-LINK-UNNAMED", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assertion", "CB-LINK-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_method_assertion_internal", "CB-LINK-METHOD-ASSERTION-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_utility_color", "CB-ASSERTION-UTILITY-COLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_html_saturated_red_color", "CLEAR-HTML-SATURATED-RED-COLOR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_html_saturated_red_color", "REMOVE-HTML-SATURATED-RED-COLOR", 1, 1, false );
    SubLFiles.declareFunction( me, "html_saturated_red_color_internal", "HTML-SATURATED-RED-COLOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "html_saturated_red_color", "HTML-SATURATED-RED-COLOR", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_html_saturated_green_color", "CLEAR-HTML-SATURATED-GREEN-COLOR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_html_saturated_green_color", "REMOVE-HTML-SATURATED-GREEN-COLOR", 1, 1, false );
    SubLFiles.declareFunction( me, "html_saturated_green_color_internal", "HTML-SATURATED-GREEN-COLOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "html_saturated_green_color", "HTML-SATURATED-GREEN-COLOR", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_ball", "CB-ASSERTION-BALL", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_marker", "ASSERTION-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "html_assertion_marker", "HTML-ASSERTION-MARKER", 1, 1, false );
    SubLFiles.declareFunction( me, "html_assertion_marker_tooltip_text", "HTML-ASSERTION-MARKER-TOOLTIP-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_generate_phrase_for_cyclist", "CLEAR-GENERATE-PHRASE-FOR-CYCLIST", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_generate_phrase_for_cyclist", "REMOVE-GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_phrase_for_cyclist_internal", "GENERATE-PHRASE-FOR-CYCLIST-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_phrase_for_cyclist", "GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_sentence", "CB-LINK-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "html_sentence_marker", "HTML-SENTENCE-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_determine_help_target", "CB-DETERMINE-HELP-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_help", "CB-HELP", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_help_preamble", "CB-HELP-PREAMBLE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form", "CB-FORM", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_variable_method", "CB-FORM-VARIABLE-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_symbol_method", "CB-FORM-SYMBOL-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_constant_method", "CB-FORM-CONSTANT-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_nart_method", "CB-FORM-NART-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_assertion_method", "CB-FORM-ASSERTION-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_assertion_hl_formula", "CB-FORM-ASSERTION-HL-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_invalid_assertion", "CB-FORM-INVALID-ASSERTION", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_assertion_formula", "CB-FORM-ASSERTION-FORMULA", 2, 3, false );
    SubLFiles.declareFunction( me, "cb_form_assertion_edit_formula", "CB-FORM-ASSERTION-EDIT-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_string_method", "CB-FORM-STRING-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "print_cb_form_cons_methods", "PRINT-CB-FORM-CONS-METHODS", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method_print_function_trampoline", "CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method_p", "CB-FORM-CONS-METHOD-P", 1, 0, false );
    new $cb_form_cons_method_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cb_form_cons_method_name", "CB-FORM-CONS-METHOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method_keyword", "CB-FORM-CONS-METHOD-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method_applicability_test_fn", "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method_html_output_fn", "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_form_cons_method_name", "_CSETF-CB-FORM-CONS-METHOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_form_cons_method_keyword", "_CSETF-CB-FORM-CONS-METHOD-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_form_cons_method_applicability_test_fn", "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_form_cons_method_html_output_fn", "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cb_form_cons_method", "MAKE-CB-FORM-CONS-METHOD", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cb_form_cons_method", "VISIT-DEFSTRUCT-CB-FORM-CONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cb_form_cons_method_method", "VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "defcb_form_cons_method", "DEFCB-FORM-CONS-METHOD" );
    SubLFiles.declareFunction( me, "register_cb_form_cons_method", "REGISTER-CB-FORM-CONS-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_cb_form_cons_methods", "WITH-CB-FORM-CONS-METHODS" );
    SubLFiles.declareFunction( me, "compute_cb_form_cons_methods_active", "COMPUTE-CB-FORM-CONS-METHODS-ACTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_methods_active", "CB-FORM-CONS-METHODS-ACTIVE", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_cb_form_cons_method_always_active", "DECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "always_active_cb_form_cons_methods", "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method_keyword_to_cb_form_cons_method", "CB-FORM-CONS-METHOD-KEYWORD-TO-CB-FORM-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "top_level_cb_form_url", "TOP-LEVEL-CB-FORM-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_string", "CB-FORM-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "get_url_prefix_for_url_type", "GET-URL-PREFIX-FOR-URL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_formula_argument_limit_exceededP", "CB-FORMULA-ARGUMENT-LIMIT-EXCEEDED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_method", "CB-FORM-CONS-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_form_cons_internal", "CB-FORM-CONS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_form_cons_inter_arg_space", "CB-FORM-CONS-INTER-ARG-SPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_date_to_optimize_for_displayP", "CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_date_optimized_for_display", "CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_possibly_optimize_date_for_display", "CB-POSSIBLY-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_optimize_date_for_display", "CB-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_decimal_to_optimize_for_displayP", "CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_decimal_optimized_for_display", "CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_optimize_decimal_for_display", "CB-OPTIMIZE-DECIMAL-FOR-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_el_decimal_p", "SIMPLE-EL-DECIMAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_fraction_to_optimize_for_displayP", "CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_fraction_optimized_for_display", "CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY", 3, 0, false );
    SubLFiles.declareFunction( me, "optimized_html_for_fraction", "OPTIMIZED-HTML-FOR-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_to_displayP", "CB-HL-SUPPORT-TO-DISPLAY?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_hl_support_for_cons_method", "CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_unimplemented", "CB-UNIMPLEMENTED", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_unimplemented", "CB-LINK-UNIMPLEMENTED", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_item_list", "CB-FORM-ITEM-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_assertion_in_nl", "CB-SHOW-ASSERTION-IN-NL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_sentence_in_nl", "CB-SHOW-SENTENCE-IN-NL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_question_in_nl", "CB-SHOW-QUESTION-IN-NL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_term_in_nl", "CB-SHOW-TERM-IN-NL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_in_nl_int", "CB-SHOW-IN-NL-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_html_for_obj_in_nl", "CB-HTML-FOR-OBJ-IN-NL", 3, 1, false );
    SubLFiles.declareFunction( me, "cb_html_for_obj_in_nl_values", "CB-HTML-FOR-OBJ-IN-NL-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_term", "CB-SHOW-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_show_assertion_readably", "CB-SHOW-ASSERTION-READABLY", 1, 2, false );
    SubLFiles.declareMacro( me, "when_filtered_assertion", "WHEN-FILTERED-ASSERTION" );
    SubLFiles.declareMacro( me, "without_assertion_filters", "WITHOUT-ASSERTION-FILTERS" );
    SubLFiles.declareFunction( me, "cb_assertion_link", "CB-ASSERTION-LINK", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_link_with_mt", "CB-ASSERTION-LINK-WITH-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_link_binary", "CB-ASSERTION-LINK-BINARY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_hl_support_readably", "CB-SHOW-HL-SUPPORT-READABLY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_hl_support_formula_readably", "CB-SHOW-HL-SUPPORT-FORMULA-READABLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_el_assertion_readably", "CB-SHOW-EL-ASSERTION-READABLY", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_assertion_el_formula", "CB-ASSERTION-EL-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_el_assertion_link_checking_redundancy", "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_el_assertion_link_with_mt_checking_redundancy", "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_el_assertion_link_binary_checking_redundancy", "CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_term_of_unit_link", "CB-TERM-OF-UNIT-LINK", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_index_hook_p", "CB-INDEX-HOOK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_index_identifier", "CB-INDEX-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_fort_identifier", "CB-FORT-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_identifier", "CB-ASSERTION-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_term_identifier", "CB-TERM-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_valid_fort_identifierP", "CB-VALID-FORT-IDENTIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hlmt_identifier", "CB-HLMT-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_valid_hlmt_identifierP", "CB-VALID-HLMT-IDENTIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_constant", "CB-GUESS-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_constant_from_string", "CB-GUESS-CONSTANT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_nart", "CB-GUESS-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_nat", "CB-GUESS-NAT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_fort_display_string", "CB-FORT-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_fort", "CB-STRING-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_fort", "CB-GUESS-FORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_guess_fort_from_id", "CB-GUESS-FORT-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_fort_from_non_id", "CB-GUESS-FORT-FROM-NON-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_naut_identifierP", "CB-NAUT-IDENTIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_naut_identifier", "CB-NAUT-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_naut_identifier_string", "CB-NAUT-IDENTIFIER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_naut_display_string", "CB-NAUT-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_naut", "CB-STRING-FOR-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_naut", "CB-GUESS-NAUT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_guess_naut_spec", "CB-GUESS-NAUT-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_sentence_identifierP", "CB-SENTENCE-IDENTIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_sentence_identifier_string", "CB-SENTENCE-IDENTIFIER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_sentence", "CB-STRING-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_sentence", "CB-GUESS-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_identifierP", "CB-ASSERTION-IDENTIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_identifier_string", "CB-ASSERTION-IDENTIFIER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_assertion", "CB-STRING-FOR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_term_display_string", "CB-TERM-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_term", "CB-STRING-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_term", "CB-GUESS-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_hlmt_display_string", "CB-HLMT-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_hlmt", "CB-STRING-FOR-HLMT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_hlmt", "CB-GUESS-HLMT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_date", "CB-GUESS-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_time_parameter", "CB-GUESS-TIME-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_time_interval_display_string", "CB-TIME-INTERVAL-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_time_parameter_display_string", "CB-TIME-PARAMETER-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_assertion_hlmt_readably", "CB-SHOW-ASSERTION-HLMT-READABLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_assertion_hlmt_time_interval_and_parameter", "CB-SHOW-ASSERTION-HLMT-TIME-INTERVAL-AND-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mt_display_string", "CB-MT-DISPLAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_string_for_mt", "CB-STRING-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_mt", "CB-GUESS-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_index", "CB-GUESS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_assertion", "CB-GUESS-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_deduction", "CB-GUESS-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "prompt_for_simple_date", "PROMPT-FOR-SIMPLE-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "read_args_for_simple_date", "READ-ARGS-FOR-SIMPLE-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "read_multiple_terms_from_string", "READ-MULTIPLE-TERMS-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_reviewer", "ASSERTED-REVIEWER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_unmatched_parentheses", "CB-SHOW-UNMATCHED-PARENTHESES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_invalid_constants", "CB-SHOW-INVALID-CONSTANTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_eof_explanation", "CB-SHOW-EOF-EXPLANATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_reader_error_explanation", "CB-SHOW-READER-ERROR-EXPLANATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_symbols_for_invalid_constants", "CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_non_sentence_explanation", "CB-SHOW-NON-SENTENCE-EXPLANATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_fort_encoding_id", "CB-FORT-ENCODING-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_fort_list_selector", "CB-FORT-LIST-SELECTOR", 2, 5, false );
    SubLFiles.declareFunction( me, "cb_decode_fort_list_selector_result", "CB-DECODE-FORT-LIST-SELECTOR-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_fort_list_none_selected_p", "CB-FORT-LIST-NONE-SELECTED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_instances_of_collection_selector", "CB-INSTANCES-OF-COLLECTION-SELECTOR", 2, 3, false );
    SubLFiles.declareFunction( me, "cb_decode_instances_of_collection_selector", "CB-DECODE-INSTANCES-OF-COLLECTION-SELECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclist_recent_terms", "CYCLIST-RECENT-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inactive_left_arrow", "CB-INACTIVE-LEFT-ARROW", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_inactive_right_arrow", "CB-INACTIVE-RIGHT-ARROW", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_left_arrow", "CB-LEFT-ARROW", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_right_arrow", "CB-RIGHT-ARROW", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_directional_arrow", "CB-DIRECTIONAL-ARROW", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_directional_arrow_marker", "CB-DIRECTIONAL-ARROW-MARKER", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_utilities_file()
  {
    $cb_html_for_cyclist_in_nl_caching_state$ = SubLFiles.deflexical( "*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*", NIL );
    $cb_available_tools$ = SubLFiles.deflexical( "*CB-AVAILABLE-TOOLS*", ( maybeDefault( $sym51$_CB_AVAILABLE_TOOLS_, $cb_available_tools$, NIL ) ) );
    $cb_c_definitional_type_pred_map$ = SubLFiles.deflexical( "*CB-C-DEFINITIONAL-TYPE-PRED-MAP*", $list57 );
    $cb_max_mts_to_sort_temporally$ = SubLFiles.defparameter( "*CB-MAX-MTS-TO-SORT-TEMPORALLY*", $int6$2000 );
    $cb_back_button_predefined_script$ = SubLFiles.deflexical( "*CB-BACK-BUTTON-PREDEFINED-SCRIPT*", $str73$onClick___A_history_back____ );
    $cb_back_button_script$ = SubLFiles.deflexical( "*CB-BACK-BUTTON-SCRIPT*", $str74$onClick__var_frame_name_____A___i );
    $cb_frame_table$ = SubLFiles.deflexical( "*CB-FRAME-TABLE*", ( maybeDefault( $sym80$_CB_FRAME_TABLE_, $cb_frame_table$, NIL ) ) );
    $max_cb_link_arg_count$ = SubLFiles.deflexical( "*MAX-CB-LINK-ARG-COUNT*", FIVE_INTEGER );
    $cb_default_fort_handler$ = SubLFiles.defparameter( "*CB-DEFAULT-FORT-HANDLER*", $str137$cb_cf );
    $cb_default_fort_link_emitter$ = SubLFiles.defparameter( "*CB-DEFAULT-FORT-LINK-EMITTER*", NIL );
    $cb_show_constant_hash_dollar_prefixP$ = SubLFiles.defparameter( "*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*", NIL );
    $cb_term_id$ = SubLFiles.defparameter( "*CB-TERM-ID*", NIL );
    $cb_default_naut_handler$ = SubLFiles.defparameter( "*CB-DEFAULT-NAUT-HANDLER*", $str158$cb_naut_frame );
    $html_saturated_red_color_caching_state$ = SubLFiles.deflexical( "*HTML-SATURATED-RED-COLOR-CACHING-STATE*", NIL );
    $html_saturated_green_color_caching_state$ = SubLFiles.deflexical( "*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*", NIL );
    $generate_phrase_for_cyclist_caching_state$ = SubLFiles.deflexical( "*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*", NIL );
    $cb_just_did_nat$ = SubLFiles.defparameter( "*CB-JUST-DID-NAT*", NIL );
    $cb_just_did_quote$ = SubLFiles.defparameter( "*CB-JUST-DID-QUOTE*", NIL );
    $cb_inside_quoteP$ = SubLFiles.defparameter( "*CB-INSIDE-QUOTE?*", NIL );
    $cb_inside_naut$ = SubLFiles.defparameter( "*CB-INSIDE-NAUT*", NIL );
    $cb_inside_naut_support_enabledP$ = SubLFiles.defparameter( "*CB-INSIDE-NAUT-SUPPORT-ENABLED?*", NIL );
    $cb_form_cons_suppress_newline$ = SubLFiles.defparameter( "*CB-FORM-CONS-SUPPRESS-NEWLINE*", NIL );
    $cb_form_method_table$ = SubLFiles.deflexical( "*CB-FORM-METHOD-TABLE*", Vectors.make_vector( $int177$256, NIL ) );
    $rule_unlabelled_dont_care_variables$ = SubLFiles.defparameter( "*RULE-UNLABELLED-DONT-CARE-VARIABLES*", NIL );
    $allow_cb_assertion_for_the_assertion_sentence_replacementP$ = SubLFiles.defparameter( "*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*", NIL );
    $cb_assertion_for_the_assertion_sentence_replacement$ = SubLFiles.defparameter( "*CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT*", NIL );
    $cb_string_length_wrap$ = SubLFiles.defparameter( "*CB-STRING-LENGTH-WRAP*", $int253$60 );
    $cb_wrap_after_arg_1$ = SubLFiles.defparameter( "*CB-WRAP-AFTER-ARG-1*", $list255 );
    $cb_form_cons_methods_active$ = SubLFiles.defparameter( "*CB-FORM-CONS-METHODS-ACTIVE*", NIL );
    $cb_form_cons_methods$ = SubLFiles.deflexical( "*CB-FORM-CONS-METHODS*", ( maybeDefault( $sym256$_CB_FORM_CONS_METHODS_, $cb_form_cons_methods$, NIL ) ) );
    $cb_form_cons_methods_by_keyword$ = SubLFiles.deflexical( "*CB-FORM-CONS-METHODS-BY-KEYWORD*", maybeDefault( $sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_, $cb_form_cons_methods_by_keyword$, () -> ( Hashtables
        .make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_cb_form_cons_method$ = SubLFiles.defconstant( "*DTP-CB-FORM-CONS-METHOD*", $sym258$CB_FORM_CONS_METHOD );
    $always_active_cb_form_cons_methods$ = SubLFiles.defparameter( "*ALWAYS-ACTIVE-CB-FORM-CONS-METHODS*", NIL );
    $cb_form_suppress_naut_link_functions$ = SubLFiles.defvar( "*CB-FORM-SUPPRESS-NAUT-LINK-FUNCTIONS*", NIL );
    $cb_just_did_naut$ = SubLFiles.defparameter( "*CB-JUST-DID-NAUT*", NIL );
    $cb_formula_argument_limit$ = SubLFiles.defparameter( "*CB-FORMULA-ARGUMENT-LIMIT*", NIL );
    $cb_display_dates_as_stringsP$ = SubLFiles.defparameter( "*CB-DISPLAY-DATES-AS-STRINGS?*", T );
    $cb_display_decimals_as_decimalsP$ = SubLFiles.defparameter( "*CB-DISPLAY-DECIMALS-AS-DECIMALS?*", T );
    $cb_display_fractions_as_fractionsP$ = SubLFiles.defparameter( "*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*", T );
    $assertion_filter_hook$ = SubLFiles.defparameter( "*ASSERTION-FILTER-HOOK*", NIL );
    $cb_constant_id_prefix$ = SubLFiles.deflexical( "*CB-CONSTANT-ID-PREFIX*", $str375$c );
    $cb_nart_id_prefix$ = SubLFiles.deflexical( "*CB-NART-ID-PREFIX*", $str376$nart );
    $cb_assertion_id_prefix$ = SubLFiles.deflexical( "*CB-ASSERTION-ID-PREFIX*", $str377$a );
    $cb_assertion_id_prefix_length$ = SubLFiles.deflexical( "*CB-ASSERTION-ID-PREFIX-LENGTH*", Sequences.length( $cb_assertion_id_prefix$.getGlobalValue() ) );
    $cb_image_independent_fort_identifiersP$ = SubLFiles.deflexical( "*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*", ( maybeDefault( $sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__, $cb_image_independent_fort_identifiersP$,
        NIL ) ) );
    $cb_image_independent_id_marker$ = SubLFiles.deflexical( "*CB-IMAGE-INDEPENDENT-ID-MARKER*", string_utilities.substring( kb_utilities.compact_hl_external_id_string( ONE_INTEGER ), ZERO_INTEGER, ONE_INTEGER ) );
    $cb_image_independent_constant_id_prefix$ = SubLFiles.deflexical( "*CB-IMAGE-INDEPENDENT-CONSTANT-ID-PREFIX*", Sequences.cconcatenate( $cb_constant_id_prefix$.getGlobalValue(), $cb_image_independent_id_marker$
        .getGlobalValue() ) );
    $cb_image_independent_nart_id_prefix$ = SubLFiles.deflexical( "*CB-IMAGE-INDEPENDENT-NART-ID-PREFIX*", Sequences.cconcatenate( $cb_nart_id_prefix$.getGlobalValue(), $cb_image_independent_id_marker$
        .getGlobalValue() ) );
    $cb_naut_id_prefix$ = SubLFiles.deflexical( "*CB-NAUT-ID-PREFIX*", $str385$naut );
    $cb_naut_id_prefix_length$ = SubLFiles.deflexical( "*CB-NAUT-ID-PREFIX-LENGTH*", Sequences.length( $cb_naut_id_prefix$.getGlobalValue() ) );
    $cb_sentence_id_prefix$ = SubLFiles.deflexical( "*CB-SENTENCE-ID-PREFIX*", $str386$sentence );
    $cb_sentence_id_prefix_length$ = SubLFiles.deflexical( "*CB-SENTENCE-ID-PREFIX-LENGTH*", Sequences.length( $cb_sentence_id_prefix$.getGlobalValue() ) );
    $html_unmatched_parenthesis_color$ = SubLFiles.defparameter( "*HTML-UNMATCHED-PARENTHESIS-COLOR*", $kw398$RED );
    return NIL;
  }

  public static SubLObject setup_cb_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym40$CB_HTML_FOR_CYCLIST_IN_NL );
    subl_macro_promotions.declare_defglobal( $sym51$_CB_AVAILABLE_TOOLS_ );
    memoization_state.note_memoized_function( $sym67$GET_MT_TIME_INTERVAL_MEMOIZED );
    memoization_state.note_memoized_function( $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED );
    subl_macro_promotions.declare_defglobal( $sym80$_CB_FRAME_TABLE_ );
    register_cb_frame( $kw7$SELF, $str93$_self, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw78$PARENT, $str94$_parent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw76$TOP, $str95$_top, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw96$BLANK, $str97$_blank, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw98$NEW, $str99$_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw100$DOC, $str101$doc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw102$COMPLETION, $str103$completion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw104$TOOLBAR, $str105$toolbar, $str106$cb_toolbar_frame, NIL, NIL, NIL );
    register_cb_frame( $kw85$MAIN, $str107$cyc_main, $str108$cb_main_frame, $str109$__a, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw110$STATUS, $str111$status, $str112$cb_status_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw113$INDEX, $str114$index, $str115$cb_index_frame, $str109$__a, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw116$CONTENT, $str117$content, $str118$cb_content_frame, $str109$__a, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw119$EMPTY, $str120$empty, $str121$cb_empty_frame, NIL, T, NIL );
    register_cb_frame( $kw122$SETUP, $str123$setup, $str124$cb_setup_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw125$INF_INDEX, $str126$inf_index, $str127$cb_inf_index_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    register_cb_frame( $kw128$INF_CONTENT, $str129$inf_content, $str130$cb_inf_content_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    utilities_macros.register_html_state_variable( $sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__ );
    utilities_macros.register_html_interface_variable( $sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__ );
    setup_cb_link_method( $kw141$CONSTANT, $sym147$CB_LINK_CONSTANT, THREE_INTEGER );
    Hashtables.sethash( $kw148$NAT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str149$nat_png, $str88$ ) );
    Hashtables.sethash( $kw150$NART, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str151$nart_png, $str88$ ) );
    setup_cb_link_method( $kw150$NART, $sym156$CB_LINK_NART, THREE_INTEGER );
    setup_cb_link_method( $kw148$NAT, $sym157$CB_LINK_NAT, TWO_INTEGER );
    setup_cb_link_method( $kw159$NAUT, $sym160$CB_LINK_NAUT, THREE_INTEGER );
    setup_cb_link_method( $kw162$LEXICON, $sym163$CB_LINK_LEXICON, ONE_INTEGER );
    setup_cb_link_method( $kw167$UNNAMED, $sym168$CB_LINK_UNNAMED, ONE_INTEGER );
    setup_cb_link_method( $kw171$ASSERTION, $sym172$CB_LINK_ASSERTION, ONE_INTEGER );
    memoization_state.note_globally_cached_function( $sym178$HTML_SATURATED_RED_COLOR );
    memoization_state.note_globally_cached_function( $sym182$HTML_SATURATED_GREEN_COLOR );
    Hashtables.sethash( $kw27$DEFAULT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str185$yellow_gif, $str186$_Def_ ) );
    Hashtables.sethash( $kw29$MONOTONIC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str187$white_gif, $str188$_Mon_ ) );
    Hashtables.sethash( $kw189$DERIVED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str190$green_gif, $str191$_Inf_ ) );
    Hashtables.sethash( $kw33$BACKWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str192$purple_gif, $str193$_B_ ) );
    Hashtables.sethash( $kw31$FORWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str194$blue_gif, $str195$_F_ ) );
    Hashtables.sethash( $kw196$REDUNDANT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str197$cyan_gif, $str198$_R_ ) );
    Hashtables.sethash( $kw22$FALSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str199$red_gif, $str200$_False_ ) );
    Hashtables.sethash( $kw35$CODE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str201$pink_gif, $str202$_Code_ ) );
    Hashtables.sethash( $kw24$UNKNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str203$gray_gif, $str204$_Unknown_ ) );
    Hashtables.sethash( $kw205$BACKWARD_GAF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str206$orange_gif, $str207$_BackwardGAF_ ) );
    memoization_state.note_globally_cached_function( $sym223$GENERATE_PHRASE_FOR_CYCLIST );
    setup_cb_link_method( $kw229$SENTENCE, $sym230$CB_LINK_SENTENCE, TWO_INTEGER );
    Hashtables.sethash( $kw231$SENTENCE_MARKER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str232$cyc_logo_3_t_gif, $str233$_CycL_ ) );
    Hashtables.sethash( $kw234$HELP, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str235$help_btn_s_gif, $str236$_Help_ ) );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function( $sym241$CB_FORM_VARIABLE_METHOD ) );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function( $sym246$CB_FORM_SYMBOL_METHOD ) );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym247$CB_FORM_CONSTANT_METHOD ) );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function( $sym248$CB_FORM_NART_METHOD ) );
    utilities_macros.register_html_state_variable( $sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__ );
    utilities_macros.register_html_interface_variable( $sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__ );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function( $sym251$CB_FORM_ASSERTION_METHOD ) );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function( $sym254$CB_FORM_STRING_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym256$_CB_FORM_CONS_METHODS_ );
    subl_macro_promotions.declare_defglobal( $sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), Symbols.symbol_function( $sym265$CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list266 );
    Structures.def_csetf( $sym267$CB_FORM_CONS_METHOD_NAME, $sym268$_CSETF_CB_FORM_CONS_METHOD_NAME );
    Structures.def_csetf( $sym269$CB_FORM_CONS_METHOD_KEYWORD, $sym270$_CSETF_CB_FORM_CONS_METHOD_KEYWORD );
    Structures.def_csetf( $sym271$CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN, $sym272$_CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN );
    Structures.def_csetf( $sym273$CB_FORM_CONS_METHOD_HTML_OUTPUT_FN, $sym274$_CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN );
    Equality.identity( $sym258$CB_FORM_CONS_METHOD );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), Symbols.symbol_function(
        $sym284$VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD ) );
    access_macros.register_macro_helper( $sym286$REGISTER_CB_FORM_CONS_METHOD, $sym288$DEFCB_FORM_CONS_METHOD );
    access_macros.register_macro_helper( $sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, $sym293$WITH_CB_FORM_CONS_METHODS );
    utilities_macros.register_html_state_variable( $sym301$_CB_FORMULA_ARGUMENT_LIMIT_ );
    utilities_macros.register_html_interface_variable( $sym301$_CB_FORMULA_ARGUMENT_LIMIT_ );
    Structures.register_method( $cb_form_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym258$CB_FORM_CONS_METHOD ) );
    register_cb_form_cons_method( $sym307$DATE, $list308 );
    declare_cb_form_cons_method_always_active( $kw309$DATE );
    utilities_macros.register_html_state_variable( $sym310$_CB_DISPLAY_DATES_AS_STRINGS__ );
    utilities_macros.register_html_interface_variable( $sym310$_CB_DISPLAY_DATES_AS_STRINGS__ );
    utilities_macros.note_funcall_helper_function( $sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_ );
    utilities_macros.note_funcall_helper_function( $sym312$CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY );
    register_cb_form_cons_method( $sym315$DECIMAL, $list316 );
    declare_cb_form_cons_method_always_active( $kw317$DECIMAL );
    utilities_macros.register_html_state_variable( $sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ );
    utilities_macros.register_html_interface_variable( $sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ );
    utilities_macros.note_funcall_helper_function( $sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_ );
    utilities_macros.note_funcall_helper_function( $sym320$CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY );
    register_cb_form_cons_method( $sym321$FRACTION, $list322 );
    declare_cb_form_cons_method_always_active( $kw323$FRACTION );
    utilities_macros.register_html_state_variable( $sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ );
    utilities_macros.register_html_interface_variable( $sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ );
    utilities_macros.note_funcall_helper_function( $sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_ );
    utilities_macros.note_funcall_helper_function( $sym326$CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY );
    utilities_macros.note_funcall_helper_function( $sym330$CB_HL_SUPPORT_TO_DISPLAY_ );
    utilities_macros.note_funcall_helper_function( $sym331$CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD );
    html_macros.note_cgi_handler_function( $sym336$CB_UNIMPLEMENTED, $kw337$HTML_HANDLER );
    setup_cb_link_method( $kw339$UNIMPLEMENTED, $sym340$CB_LINK_UNIMPLEMENTED, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__ );
    access_macros.define_obsolete_register( $sym380$CB_GUESS_NAT, $list381 );
    Hashtables.sethash( $kw414$ACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str415$back_12_png, $str416$Active_left_arrow ) );
    Hashtables.sethash( $kw417$INACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str418$back_12_disabled_png, $str419$Inactive_left_arrow ) );
    Hashtables.sethash( $kw420$ACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str421$forward_12_png, $str422$Active_right_arrow ) );
    Hashtables.sethash( $kw423$INACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str424$forward_12_disabled_png, $str425$Inactive_right_arrow ) );
    generic_testing.define_test_case_table_int( $sym427$CB_GUESS_CONSTANT, ConsesLow.list( new SubLObject[] { $kw428$TEST, NIL, $kw429$OWNER, NIL, $kw430$CLASSES, NIL, $kw431$KB, $kw432$TINY, $kw433$WORKING_, T
    } ), $list434 );
    generic_testing.define_test_case_table_int( $sym435$CB_GUESS_DATE, ConsesLow.list( new SubLObject[] { $kw428$TEST, NIL, $kw429$OWNER, NIL, $kw430$CLASSES, NIL, $kw431$KB, $kw436$FULL, $kw433$WORKING_, T
    } ), $list437 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_utilities_file();
  }
  static
  {
    me = new cb_utilities();
    $cb_html_for_cyclist_in_nl_caching_state$ = null;
    $cb_available_tools$ = null;
    $cb_c_definitional_type_pred_map$ = null;
    $cb_max_mts_to_sort_temporally$ = null;
    $cb_back_button_predefined_script$ = null;
    $cb_back_button_script$ = null;
    $cb_frame_table$ = null;
    $max_cb_link_arg_count$ = null;
    $cb_default_fort_handler$ = null;
    $cb_default_fort_link_emitter$ = null;
    $cb_show_constant_hash_dollar_prefixP$ = null;
    $cb_term_id$ = null;
    $cb_default_naut_handler$ = null;
    $html_saturated_red_color_caching_state$ = null;
    $html_saturated_green_color_caching_state$ = null;
    $generate_phrase_for_cyclist_caching_state$ = null;
    $cb_just_did_nat$ = null;
    $cb_just_did_quote$ = null;
    $cb_inside_quoteP$ = null;
    $cb_inside_naut$ = null;
    $cb_inside_naut_support_enabledP$ = null;
    $cb_form_cons_suppress_newline$ = null;
    $cb_form_method_table$ = null;
    $rule_unlabelled_dont_care_variables$ = null;
    $allow_cb_assertion_for_the_assertion_sentence_replacementP$ = null;
    $cb_assertion_for_the_assertion_sentence_replacement$ = null;
    $cb_string_length_wrap$ = null;
    $cb_wrap_after_arg_1$ = null;
    $cb_form_cons_methods_active$ = null;
    $cb_form_cons_methods$ = null;
    $cb_form_cons_methods_by_keyword$ = null;
    $dtp_cb_form_cons_method$ = null;
    $always_active_cb_form_cons_methods$ = null;
    $cb_form_suppress_naut_link_functions$ = null;
    $cb_just_did_naut$ = null;
    $cb_formula_argument_limit$ = null;
    $cb_display_dates_as_stringsP$ = null;
    $cb_display_decimals_as_decimalsP$ = null;
    $cb_display_fractions_as_fractionsP$ = null;
    $assertion_filter_hook$ = null;
    $cb_constant_id_prefix$ = null;
    $cb_nart_id_prefix$ = null;
    $cb_assertion_id_prefix$ = null;
    $cb_assertion_id_prefix_length$ = null;
    $cb_image_independent_fort_identifiersP$ = null;
    $cb_image_independent_id_marker$ = null;
    $cb_image_independent_constant_id_prefix$ = null;
    $cb_image_independent_nart_id_prefix$ = null;
    $cb_naut_id_prefix$ = null;
    $cb_naut_id_prefix_length$ = null;
    $cb_sentence_id_prefix$ = null;
    $cb_sentence_id_prefix_length$ = null;
    $html_unmatched_parenthesis_color$ = null;
    $str0$_a__a = makeString( "~a?~a" );
    $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str2$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw3$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str4$Cyc_error = makeString( "Cyc error" );
    $str5$_A = makeString( "~A" );
    $int6$2000 = makeInteger( 2000 );
    $kw7$SELF = makeKeyword( "SELF" );
    $str8$Back_to_previous__stale__page = makeString( "Back to previous (stale) page" );
    $str9$Back_to_previous_page = makeString( "Back to previous page" );
    $kw10$CB_CYC = makeKeyword( "CB-CYC" );
    $kw11$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw12$SHA1 = makeKeyword( "SHA1" );
    $str13$yui_skin_sam = makeString( "yui-skin-sam" );
    $str14$reloadFrameButton = makeString( "reloadFrameButton" );
    $str15$button = makeString( "button" );
    $str16$reload = makeString( "reload" );
    $str17$Refresh_Frames = makeString( "Refresh Frames" );
    $str18$Back_to__stale__ = makeString( "Back to (stale) " );
    $str19$_page = makeString( " page" );
    $kw20$TRUE = makeKeyword( "TRUE" );
    $str21$True = makeString( "True" );
    $kw22$FALSE = makeKeyword( "FALSE" );
    $str23$False = makeString( "False" );
    $kw24$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str25$Unknown = makeString( "Unknown" );
    $str26$___ = makeString( "???" );
    $kw27$DEFAULT = makeKeyword( "DEFAULT" );
    $str28$Default = makeString( "Default" );
    $kw29$MONOTONIC = makeKeyword( "MONOTONIC" );
    $str30$Monotonic = makeString( "Monotonic" );
    $kw31$FORWARD = makeKeyword( "FORWARD" );
    $str32$Forward = makeString( "Forward" );
    $kw33$BACKWARD = makeKeyword( "BACKWARD" );
    $str34$Backward = makeString( "Backward" );
    $kw35$CODE = makeKeyword( "CODE" );
    $str36$Code = makeString( "Code" );
    $str37$_S = makeString( "~S" );
    $int38$30 = makeInteger( 30 );
    $str39$_A__A___A = makeString( "~A ~A, ~A" );
    $sym40$CB_HTML_FOR_CYCLIST_IN_NL = makeSymbol( "CB-HTML-FOR-CYCLIST-IN-NL" );
    $sym41$HTML_GENERATE_PHRASE = makeSymbol( "HTML-GENERATE-PHRASE" );
    $sym42$_CB_HTML_FOR_CYCLIST_IN_NL_CACHING_STATE_ = makeSymbol( "*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*" );
    $str43$ref_renames_kills_html = makeString( "ref/renames-kills.html" );
    $str44$ref_cycl_syntax_html_naming_conve = makeString( "ref/cycl-syntax.html#naming conventions" );
    $str45$toc_html = makeString( "toc.html" );
    $str46$__For_detailed_help_and_warnings_ = makeString( "--For detailed help and warnings about ~A, please read the " );
    $str47$_ = makeString( "#" );
    $str48$_documentation_ = makeString( " documentation." );
    $str49$Yes = makeString( "Yes" );
    $str50$No = makeString( "No" );
    $sym51$_CB_AVAILABLE_TOOLS_ = makeSymbol( "*CB-AVAILABLE-TOOLS*" );
    $kw52$DEPRECATED = makeKeyword( "DEPRECATED" );
    $sym53$NOT_EQL = makeSymbol( "NOT-EQL" );
    $sym54$FIFTH = makeSymbol( "FIFTH" );
    $kw55$STANDARD = makeKeyword( "STANDARD" );
    $sym56$CAR = makeSymbol( "CAR" );
    $list57 = ConsesLow.list( ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
      constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString(
          "disjointWith" ) ), constant_handles.reader_make_constant_shell( makeString( "defnIff" ) ), constant_handles.reader_make_constant_shell( makeString( "quotedDefnIff" ) ), constant_handles
              .reader_make_constant_shell( makeString( "defnSufficient" ) ), constant_handles.reader_make_constant_shell( makeString( "quotedDefnSufficient" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "defnNecessary" ) ), constant_handles.reader_make_constant_shell( makeString( "quotedDefnNecessary" ) ), constant_handles.reader_make_constant_shell( makeString( "comment" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "cyclistNotes" ) ), constant_handles.reader_make_constant_shell( makeString( "sharedNotes" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "userDocComment" ) )
    } ), ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
        .reader_make_constant_shell( makeString( "quotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ),
      constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), constant_handles.reader_make_constant_shell( makeString(
          "arity" ) ), constant_handles.reader_make_constant_shell( makeString( "arityMin" ) ), constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) ), constant_handles.reader_make_constant_shell(
              makeString( "argAndRestIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argsQuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestQuotedIsa" ) ),
      constant_handles.reader_make_constant_shell( makeString( "argsGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestGenl" ) ), constant_handles.reader_make_constant_shell( makeString(
          "argIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "argQuotedIsa" ) ), constant_handles.reader_make_constant_shell(
              makeString( "arg1Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "arg2Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg3QuotedIsa" ) ), constant_handles
                          .reader_make_constant_shell( makeString( "arg3Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "arg4QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "arg5QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) ), constant_handles.reader_make_constant_shell(
                                      makeString( "arg6Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg6QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg6Genl" ) ),
      constant_handles.reader_make_constant_shell( makeString( "arg7Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg7QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString(
          "arg7Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg8Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg8QuotedIsa" ) ), constant_handles.reader_make_constant_shell(
              makeString( "arg8Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg9Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg9QuotedIsa" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "arg9Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg10Isa" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "arg10QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg10Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg11Isa" ) ), constant_handles
                          .reader_make_constant_shell( makeString( "arg11QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg11Genl" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "arg12Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg12QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg12Genl" ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "fanOutArg" ) ), constant_handles.reader_make_constant_shell( makeString( "evaluationDefn" ) ), constant_handles.reader_make_constant_shell(
                                      makeString( "afterAdding" ) ), constant_handles.reader_make_constant_shell( makeString( "afterRemoving" ) ), constant_handles.reader_make_constant_shell( makeString( "comment" ) ),
      constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) ), constant_handles.reader_make_constant_shell( makeString( "sharedNotes" ) ), constant_handles.reader_make_constant_shell( makeString(
          "userDocComment" ) )
    } ), ConsesLow.list( NIL, constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), constant_handles.reader_make_constant_shell(
        makeString( "comment" ) ), constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) ), constant_handles.reader_make_constant_shell( makeString( "sharedNotes" ) ), constant_handles
            .reader_make_constant_shell( makeString( "userDocComment" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), constant_handles.reader_make_constant_shell(
                makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "comment" ) ), constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) ), constant_handles.reader_make_constant_shell( makeString(
                        "sharedNotes" ) ), constant_handles.reader_make_constant_shell( makeString( "userDocComment" ) ) ), ConsesLow.list( new SubLObject[]
                        { constant_handles.reader_make_constant_shell( makeString( "Function-Denotational" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                            .reader_make_constant_shell( makeString( "quotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "genlFuncs" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "genlFunctions" ) ), constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) ), constant_handles
                                    .reader_make_constant_shell( makeString( "resultIsaArgIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) ), constant_handles.reader_make_constant_shell(
                                        makeString( "resultGenlArg" ) ), constant_handles.reader_make_constant_shell( makeString( "arity" ) ), constant_handles.reader_make_constant_shell( makeString( "arityMin" ) ),
                          constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestIsa" ) ), constant_handles.reader_make_constant_shell(
                              makeString( "argsQuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argAndRestQuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argsGenl" ) ),
                          constant_handles.reader_make_constant_shell( makeString( "argAndRestGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "argIsa" ) ), constant_handles.reader_make_constant_shell(
                              makeString( "argGenl" ) ), constant_handles.reader_make_constant_shell( makeString( "argQuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ),
                          constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString(
                                  "arg2Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg3QuotedIsa" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "arg3Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) ), constant_handles.reader_make_constant_shell(
                                          makeString( "arg4QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) ),
                          constant_handles.reader_make_constant_shell( makeString( "arg5QuotedIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "comment" ) ), constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) ), constant_handles.reader_make_constant_shell( makeString(
                                  "sharedNotes" ) ), constant_handles.reader_make_constant_shell( makeString( "userDocComment" ) )
    } ) );
    $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const59$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym60$VALID_FORT_ = makeSymbol( "VALID-FORT?" );
    $sym61$POTENTIALLY_INFINITE_INTEGER__ = makeSymbol( "POTENTIALLY-INFINITE-INTEGER-<" );
    $sym62$MT_START_UNIVERSAL_TIME_EXTENDED = makeSymbol( "MT-START-UNIVERSAL-TIME-EXTENDED" );
    $sym63$MT_END_UNIVERSAL_TIME_EXTENDED = makeSymbol( "MT-END-UNIVERSAL-TIME-EXTENDED" );
    $kw64$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym65$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym66$_EXIT = makeSymbol( "%EXIT" );
    $sym67$GET_MT_TIME_INTERVAL_MEMOIZED = makeSymbol( "GET-MT-TIME-INTERVAL-MEMOIZED" );
    $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED = makeSymbol( "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED" );
    $const69$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1900 ) );
    $const71$SecondsDuration = constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) );
    $sym72$_ = makeSymbol( "<" );
    $str73$onClick___A_history_back____ = makeString( "onClick=\"~A.history.back();\"" );
    $str74$onClick__var_frame_name_____A___i = makeString( "onClick=\"var frame_name = '~A'; if (top.frames[frame_name]) top.frames[frame_name].history.back();\"" );
    $str75$Back = makeString( "Back" );
    $kw76$TOP = makeKeyword( "TOP" );
    $str77$top = makeString( "top" );
    $kw78$PARENT = makeKeyword( "PARENT" );
    $str79$parent = makeString( "parent" );
    $sym80$_CB_FRAME_TABLE_ = makeSymbol( "*CB-FRAME-TABLE*" );
    $sym81$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym82$STRINGP = makeSymbol( "STRINGP" );
    $str83$no = makeString( "no" );
    $sym84$FIRST = makeSymbol( "FIRST" );
    $kw85$MAIN = makeKeyword( "MAIN" );
    $str86$cb_login = makeString( "cb-login" );
    $str87$cb_history = makeString( "cb-history" );
    $str88$ = makeString( "" );
    $list89 = ConsesLow.cons( makeSymbol( "INDIRECT-HANDLER" ), makeSymbol( "INDIRECT-ARGS" ) );
    $str90$_ = makeString( "&" );
    $str91$_ = makeString( "=" );
    $list92 = ConsesLow.list( makeSymbol( "KEYWORD" ), makeSymbol( "NAME" ), makeSymbol( "HANDLER" ), makeSymbol( "CONTROL-STRING" ), makeSymbol( "NORESIZE" ), makeSymbol( "SCROLLING" ) );
    $str93$_self = makeString( "_self" );
    $str94$_parent = makeString( "_parent" );
    $str95$_top = makeString( "_top" );
    $kw96$BLANK = makeKeyword( "BLANK" );
    $str97$_blank = makeString( "_blank" );
    $kw98$NEW = makeKeyword( "NEW" );
    $str99$_new = makeString( "_new" );
    $kw100$DOC = makeKeyword( "DOC" );
    $str101$doc = makeString( "doc" );
    $kw102$COMPLETION = makeKeyword( "COMPLETION" );
    $str103$completion = makeString( "completion" );
    $kw104$TOOLBAR = makeKeyword( "TOOLBAR" );
    $str105$toolbar = makeString( "toolbar" );
    $str106$cb_toolbar_frame = makeString( "cb-toolbar-frame" );
    $str107$cyc_main = makeString( "cyc-main" );
    $str108$cb_main_frame = makeString( "cb-main-frame" );
    $str109$__a = makeString( "&~a" );
    $kw110$STATUS = makeKeyword( "STATUS" );
    $str111$status = makeString( "status" );
    $str112$cb_status_frame = makeString( "cb-status-frame" );
    $kw113$INDEX = makeKeyword( "INDEX" );
    $str114$index = makeString( "index" );
    $str115$cb_index_frame = makeString( "cb-index-frame" );
    $kw116$CONTENT = makeKeyword( "CONTENT" );
    $str117$content = makeString( "content" );
    $str118$cb_content_frame = makeString( "cb-content-frame" );
    $kw119$EMPTY = makeKeyword( "EMPTY" );
    $str120$empty = makeString( "empty" );
    $str121$cb_empty_frame = makeString( "cb-empty-frame" );
    $kw122$SETUP = makeKeyword( "SETUP" );
    $str123$setup = makeString( "setup" );
    $str124$cb_setup_frame = makeString( "cb-setup-frame" );
    $kw125$INF_INDEX = makeKeyword( "INF-INDEX" );
    $str126$inf_index = makeString( "inf-index" );
    $str127$cb_inf_index_frame = makeString( "cb-inf-index-frame" );
    $kw128$INF_CONTENT = makeKeyword( "INF-CONTENT" );
    $str129$inf_content = makeString( "inf-content" );
    $str130$cb_inf_content_frame = makeString( "cb-inf-content-frame" );
    $str131$No_cb_link_method_for__S_defined = makeString( "No cb-link method for ~S defined" );
    $sym132$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym133$FIXNUMP = makeSymbol( "FIXNUMP" );
    $str134$Too_many_args_in__S___max_of__S_a = makeString( "Too many args in ~S:  max of ~S allowed" );
    $kw135$CB_LINK_METHOD = makeKeyword( "CB-LINK-METHOD" );
    $kw136$CB_LINK_MAX_ARGS = makeKeyword( "CB-LINK-MAX-ARGS" );
    $str137$cb_cf = makeString( "cb-cf" );
    $sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__ = makeSymbol( "*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*" );
    $str139$const = makeString( "const" );
    $kw140$FORT = makeKeyword( "FORT" );
    $kw141$CONSTANT = makeKeyword( "CONSTANT" );
    $str142$cb_start_ = makeString( "cb-start|" );
    $str143$_a__a = makeString( "~a&~a" );
    $str144$obsolete = makeString( "obsolete" );
    $str145$__ = makeString( "#$" );
    $kw146$TERM_CONTEXT_MENU = makeKeyword( "TERM-CONTEXT-MENU" );
    $sym147$CB_LINK_CONSTANT = makeSymbol( "CB-LINK-CONSTANT" );
    $kw148$NAT = makeKeyword( "NAT" );
    $str149$nat_png = makeString( "nat.png" );
    $kw150$NART = makeKeyword( "NART" );
    $str151$nart_png = makeString( "nart.png" );
    $str152$_ = makeString( "-" );
    $str153$_ = makeString( "(" );
    $str154$absmiddle = makeString( "absmiddle" );
    $str155$cycl = makeString( "cycl" );
    $sym156$CB_LINK_NART = makeSymbol( "CB-LINK-NART" );
    $sym157$CB_LINK_NAT = makeSymbol( "CB-LINK-NAT" );
    $str158$cb_naut_frame = makeString( "cb-naut-frame" );
    $kw159$NAUT = makeKeyword( "NAUT" );
    $sym160$CB_LINK_NAUT = makeSymbol( "CB-LINK-NAUT" );
    $str161$href = makeString( "href" );
    $kw162$LEXICON = makeKeyword( "LEXICON" );
    $sym163$CB_LINK_LEXICON = makeSymbol( "CB-LINK-LEXICON" );
    $str164$_NART_ = makeString( "<NART>" );
    $str165$_NART_ = makeString( "<NART " );
    $str166$_ = makeString( ">" );
    $kw167$UNNAMED = makeKeyword( "UNNAMED" );
    $sym168$CB_LINK_UNNAMED = makeSymbol( "CB-LINK-UNNAMED" );
    $str169$cb_af = makeString( "cb-af" );
    $str170$cb_start_cb_af = makeString( "cb-start|cb-af" );
    $kw171$ASSERTION = makeKeyword( "ASSERTION" );
    $sym172$CB_LINK_ASSERTION = makeSymbol( "CB-LINK-ASSERTION" );
    $str173$_cycid_ = makeString( " cycid=" );
    $str174$_id_ = makeString( " id=" );
    $int175$_30 = makeInteger( -30 );
    $int176$100 = makeInteger( 100 );
    $int177$256 = makeInteger( 256 );
    $sym178$HTML_SATURATED_RED_COLOR = makeSymbol( "HTML-SATURATED-RED-COLOR" );
    $int179$255 = makeInteger( 255 );
    $str180$_C_C0000 = makeString( "~C~C0000" );
    $sym181$_HTML_SATURATED_RED_COLOR_CACHING_STATE_ = makeSymbol( "*HTML-SATURATED-RED-COLOR-CACHING-STATE*" );
    $sym182$HTML_SATURATED_GREEN_COLOR = makeSymbol( "HTML-SATURATED-GREEN-COLOR" );
    $str183$00_C_C00 = makeString( "00~C~C00" );
    $sym184$_HTML_SATURATED_GREEN_COLOR_CACHING_STATE_ = makeSymbol( "*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*" );
    $str185$yellow_gif = makeString( "yellow.gif" );
    $str186$_Def_ = makeString( "[Def]" );
    $str187$white_gif = makeString( "white.gif" );
    $str188$_Mon_ = makeString( "[Mon]" );
    $kw189$DERIVED = makeKeyword( "DERIVED" );
    $str190$green_gif = makeString( "green.gif" );
    $str191$_Inf_ = makeString( "[Inf]" );
    $str192$purple_gif = makeString( "purple.gif" );
    $str193$_B_ = makeString( "[B]" );
    $str194$blue_gif = makeString( "blue.gif" );
    $str195$_F_ = makeString( "[F]" );
    $kw196$REDUNDANT = makeKeyword( "REDUNDANT" );
    $str197$cyan_gif = makeString( "cyan.gif" );
    $str198$_R_ = makeString( "[R]" );
    $str199$red_gif = makeString( "red.gif" );
    $str200$_False_ = makeString( "[False]" );
    $str201$pink_gif = makeString( "pink.gif" );
    $str202$_Code_ = makeString( "[Code]" );
    $str203$gray_gif = makeString( "gray.gif" );
    $str204$_Unknown_ = makeString( "[Unknown]" );
    $kw205$BACKWARD_GAF = makeKeyword( "BACKWARD-GAF" );
    $str206$orange_gif = makeString( "orange.gif" );
    $str207$_BackwardGAF_ = makeString( "[BackwardGAF]" );
    $str208$_monotonic = makeString( " monotonic" );
    $str209$_forward = makeString( " forward" );
    $str210$_backward = makeString( " backward" );
    $str211$_rule = makeString( " rule" );
    $str212$_GAF = makeString( " GAF" );
    $str213$_asserted_locally_in_ = makeString( " asserted locally in " );
    $str214$_by_ = makeString( " by " );
    $str215$_on_ = makeString( " on " );
    $str216$_ = makeString( " " );
    $str217$__ = makeString( ", " );
    $str218$_at_ = makeString( " at " );
    $str219$_for_ = makeString( " for " );
    $str220$_and_inferred_by_Cyc = makeString( " and inferred by Cyc" );
    $str221$_inferred_in_ = makeString( " inferred in " );
    $sym222$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym223$GENERATE_PHRASE_FOR_CYCLIST = makeSymbol( "GENERATE-PHRASE-FOR-CYCLIST" );
    $sym224$_GENERATE_PHRASE_FOR_CYCLIST_CACHING_STATE_ = makeSymbol( "*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*" );
    $sym225$CLEAR_GENERATE_PHRASE_FOR_CYCLIST = makeSymbol( "CLEAR-GENERATE-PHRASE-FOR-CYCLIST" );
    $str226$cb_sentence = makeString( "cb-sentence" );
    $str227$cb_start_cb_sentence = makeString( "cb-start|cb-sentence" );
    $str228$_a__a_t = makeString( "~a&~a&t" );
    $kw229$SENTENCE = makeKeyword( "SENTENCE" );
    $sym230$CB_LINK_SENTENCE = makeSymbol( "CB-LINK-SENTENCE" );
    $kw231$SENTENCE_MARKER = makeKeyword( "SENTENCE-MARKER" );
    $str232$cyc_logo_3_t_gif = makeString( "cyc-logo-3-t.gif" );
    $str233$_CycL_ = makeString( "[CycL]" );
    $kw234$HELP = makeKeyword( "HELP" );
    $str235$help_btn_s_gif = makeString( "help_btn_s.gif" );
    $str236$_Help_ = makeString( "[Help]" );
    $str237$Use_of_unsupported_legacy_help_sy = makeString( "Use of unsupported legacy help system for ~A.  Add and use def-cb-help definition." );
    $str238$dont_care = makeString( "dont-care" );
    $str239$hl_var_dont_care = makeString( "hl-var dont-care" );
    $str240$hl_var = makeString( "hl-var" );
    $sym241$CB_FORM_VARIABLE_METHOD = makeSymbol( "CB-FORM-VARIABLE-METHOD" );
    $str242$el_var_dont_care = makeString( "el-var dont-care" );
    $str243$el_var = makeString( "el-var" );
    $str244$keyword = makeString( "keyword" );
    $str245$symbol = makeString( "symbol" );
    $sym246$CB_FORM_SYMBOL_METHOD = makeSymbol( "CB-FORM-SYMBOL-METHOD" );
    $sym247$CB_FORM_CONSTANT_METHOD = makeSymbol( "CB-FORM-CONSTANT-METHOD" );
    $sym248$CB_FORM_NART_METHOD = makeSymbol( "CB-FORM-NART-METHOD" );
    $sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__ = makeSymbol( "*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*" );
    $const250$TheAssertionSentence = constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) );
    $sym251$CB_FORM_ASSERTION_METHOD = makeSymbol( "CB-FORM-ASSERTION-METHOD" );
    $str252$__INVALID_ASSERTION_ = makeString( "#<INVALID ASSERTION>" );
    $int253$60 = makeInteger( 60 );
    $sym254$CB_FORM_STRING_METHOD = makeSymbol( "CB-FORM-STRING-METHOD" );
    $list255 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "holdsIn" ) ) );
    $sym256$_CB_FORM_CONS_METHODS_ = makeSymbol( "*CB-FORM-CONS-METHODS*" );
    $sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_ = makeSymbol( "*CB-FORM-CONS-METHODS-BY-KEYWORD*" );
    $sym258$CB_FORM_CONS_METHOD = makeSymbol( "CB-FORM-CONS-METHOD" );
    $sym259$CB_FORM_CONS_METHOD_P = makeSymbol( "CB-FORM-CONS-METHOD-P" );
    $list260 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "KEYWORD" ), makeSymbol( "APPLICABILITY-TEST-FN" ), makeSymbol( "HTML-OUTPUT-FN" ) );
    $list261 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "KEYWORD" ), makeKeyword( "APPLICABILITY-TEST-FN" ), makeKeyword( "HTML-OUTPUT-FN" ) );
    $list262 = ConsesLow.list( makeSymbol( "CB-FORM-CONS-METHOD-NAME" ), makeSymbol( "CB-FORM-CONS-METHOD-KEYWORD" ), makeSymbol( "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN" ), makeSymbol(
        "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN" ) );
    $list263 = ConsesLow.list( makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-NAME" ), makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-KEYWORD" ), makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN" ), makeSymbol(
        "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN" ) );
    $sym264$PRINT_CB_FORM_CONS_METHODS = makeSymbol( "PRINT-CB-FORM-CONS-METHODS" );
    $sym265$CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE" );
    $list266 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CB-FORM-CONS-METHOD-P" ) );
    $sym267$CB_FORM_CONS_METHOD_NAME = makeSymbol( "CB-FORM-CONS-METHOD-NAME" );
    $sym268$_CSETF_CB_FORM_CONS_METHOD_NAME = makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-NAME" );
    $sym269$CB_FORM_CONS_METHOD_KEYWORD = makeSymbol( "CB-FORM-CONS-METHOD-KEYWORD" );
    $sym270$_CSETF_CB_FORM_CONS_METHOD_KEYWORD = makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-KEYWORD" );
    $sym271$CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN = makeSymbol( "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN" );
    $sym272$_CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN = makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN" );
    $sym273$CB_FORM_CONS_METHOD_HTML_OUTPUT_FN = makeSymbol( "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN" );
    $sym274$_CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN = makeSymbol( "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN" );
    $kw275$NAME = makeKeyword( "NAME" );
    $kw276$KEYWORD = makeKeyword( "KEYWORD" );
    $kw277$APPLICABILITY_TEST_FN = makeKeyword( "APPLICABILITY-TEST-FN" );
    $kw278$HTML_OUTPUT_FN = makeKeyword( "HTML-OUTPUT-FN" );
    $str279$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw280$BEGIN = makeKeyword( "BEGIN" );
    $sym281$MAKE_CB_FORM_CONS_METHOD = makeSymbol( "MAKE-CB-FORM-CONS-METHOD" );
    $kw282$SLOT = makeKeyword( "SLOT" );
    $kw283$END = makeKeyword( "END" );
    $sym284$VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD" );
    $list285 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGLIST" ) );
    $sym286$REGISTER_CB_FORM_CONS_METHOD = makeSymbol( "REGISTER-CB-FORM-CONS-METHOD" );
    $sym287$QUOTE = makeSymbol( "QUOTE" );
    $sym288$DEFCB_FORM_CONS_METHOD = makeSymbol( "DEFCB-FORM-CONS-METHOD" );
    $list289 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-KEYWORDS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym290$CLET = makeSymbol( "CLET" );
    $sym291$_CB_FORM_CONS_METHODS_ACTIVE_ = makeSymbol( "*CB-FORM-CONS-METHODS-ACTIVE*" );
    $sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE = makeSymbol( "COMPUTE-CB-FORM-CONS-METHODS-ACTIVE" );
    $sym293$WITH_CB_FORM_CONS_METHODS = makeSymbol( "WITH-CB-FORM-CONS-METHODS" );
    $str294$cg_cb_start_ = makeString( "cg?cb-start|" );
    $kw295$RELATIVE = makeKeyword( "RELATIVE" );
    $sym296$CYC_CGI_RELATIVE_URL = makeSymbol( "CYC-CGI-RELATIVE-URL" );
    $kw297$KEA = makeKeyword( "KEA" );
    $sym298$CYC_CGI_KEA_URL = makeSymbol( "CYC-CGI-KEA-URL" );
    $kw299$CB = makeKeyword( "CB" );
    $sym300$CYC_CGI_ABSOLUTE_CB_FRAMED_URL = makeSymbol( "CYC-CGI-ABSOLUTE-CB-FRAMED-URL" );
    $sym301$_CB_FORMULA_ARGUMENT_LIMIT_ = makeSymbol( "*CB-FORMULA-ARGUMENT-LIMIT*" );
    $str302$_ = makeString( "'" );
    $str303$____ = makeString( " ..." );
    $str304$___ = makeString( " . " );
    $str305$font_weight_900 = makeString( "font-weight:900" );
    $str306$_ = makeString( ")" );
    $sym307$DATE = makeSymbol( "DATE" );
    $list308 = ConsesLow.list( makeKeyword( "NAME" ), makeString( "date" ), makeKeyword( "KEYWORD" ), makeKeyword( "DATE" ), makeKeyword( "APPLICABILITY-TEST-FN" ), makeSymbol( "CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?" ),
        makeKeyword( "HTML-OUTPUT-FN" ), makeSymbol( "CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY" ) );
    $kw309$DATE = makeKeyword( "DATE" );
    $sym310$_CB_DISPLAY_DATES_AS_STRINGS__ = makeSymbol( "*CB-DISPLAY-DATES-AS-STRINGS?*" );
    $sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_ = makeSymbol( "CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?" );
    $sym312$CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY = makeSymbol( "CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY" );
    $str313$DateFromStringFn_datetime = makeString( "DateFromStringFn-datetime" );
    $const314$DateFromStringFn = constant_handles.reader_make_constant_shell( makeString( "DateFromStringFn" ) );
    $sym315$DECIMAL = makeSymbol( "DECIMAL" );
    $list316 = ConsesLow.list( makeKeyword( "NAME" ), makeString( "decimal" ), makeKeyword( "KEYWORD" ), makeKeyword( "DECIMAL" ), makeKeyword( "APPLICABILITY-TEST-FN" ), makeSymbol(
        "CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?" ), makeKeyword( "HTML-OUTPUT-FN" ), makeSymbol( "CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY" ) );
    $kw317$DECIMAL = makeKeyword( "DECIMAL" );
    $sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ = makeSymbol( "*CB-DISPLAY-DECIMALS-AS-DECIMALS?*" );
    $sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_ = makeSymbol( "CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?" );
    $sym320$CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY = makeSymbol( "CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY" );
    $sym321$FRACTION = makeSymbol( "FRACTION" );
    $list322 = ConsesLow.list( makeKeyword( "NAME" ), makeString( "fraction" ), makeKeyword( "KEYWORD" ), makeKeyword( "FRACTION" ), makeKeyword( "APPLICABILITY-TEST-FN" ), makeSymbol(
        "CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?" ), makeKeyword( "HTML-OUTPUT-FN" ), makeSymbol( "CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY" ) );
    $kw323$FRACTION = makeKeyword( "FRACTION" );
    $sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ = makeSymbol( "*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*" );
    $sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_ = makeSymbol( "CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?" );
    $sym326$CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY = makeSymbol( "CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY" );
    $kw327$THIN_SPACE = makeKeyword( "THIN-SPACE" );
    $kw328$MINUS = makeKeyword( "MINUS" );
    $kw329$FRASL = makeKeyword( "FRASL" );
    $sym330$CB_HL_SUPPORT_TO_DISPLAY_ = makeSymbol( "CB-HL-SUPPORT-TO-DISPLAY?" );
    $sym331$CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD = makeSymbol( "CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD" );
    $list332 = ConsesLow.list( makeSymbol( "ARG" ) );
    $str333$Unimplemented_Link = makeString( "Unimplemented Link" );
    $str334$The_page_for_ = makeString( "The page for " );
    $str335$_has_not_yet_been_implemented_ = makeString( " has not yet been implemented." );
    $sym336$CB_UNIMPLEMENTED = makeSymbol( "CB-UNIMPLEMENTED" );
    $kw337$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str338$cb_unimplemented__A = makeString( "cb-unimplemented&~A" );
    $kw339$UNIMPLEMENTED = makeKeyword( "UNIMPLEMENTED" );
    $sym340$CB_LINK_UNIMPLEMENTED = makeSymbol( "CB-LINK-UNIMPLEMENTED" );
    $str341$_and_ = makeString( " and " );
    $str342$and_ = makeString( "and " );
    $sym343$HTML_GENERATE_TEXT = makeSymbol( "HTML-GENERATE-TEXT" );
    $sym344$HTML_GENERATE_QUESTION = makeSymbol( "HTML-GENERATE-QUESTION" );
    $int345$300 = makeInteger( 300 );
    $sym346$CB_CF = makeSymbol( "CB-CF" );
    $const347$Cyc = constant_handles.reader_make_constant_shell( makeString( "Cyc" ) );
    $kw348$NL = makeKeyword( "NL" );
    $kw349$CYCL = makeKeyword( "CYCL" );
    $str350$f__ = makeString( "f: " );
    $str351$__ = makeString( " ." );
    $str352$___ = makeString( " ;;" );
    $str353$_in_ = makeString( " in " );
    $list354 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym355$PWHEN = makeSymbol( "PWHEN" );
    $sym356$COR = makeSymbol( "COR" );
    $list357 = ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "*ASSERTION-FILTER-HOOK*" ) );
    $sym358$FUNCALL = makeSymbol( "FUNCALL" );
    $sym359$_ASSERTION_FILTER_HOOK_ = makeSymbol( "*ASSERTION-FILTER-HOOK*" );
    $list360 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ASSERTION-FILTER-HOOK*" ), NIL ) );
    $sym361$PROGN = makeSymbol( "PROGN" );
    $int362$40 = makeInteger( 40 );
    $kw363$NONE = makeKeyword( "NONE" );
    $str364$__claimed_by_ = makeString( " (claimed by " );
    $kw365$HL_SUPPORT = makeKeyword( "HL-SUPPORT" );
    $str366$_module_ = makeString( " module)" );
    $kw367$SILK = makeKeyword( "SILK" );
    $kw368$LEFT = makeKeyword( "LEFT" );
    $kw369$MINI_LOGO = makeKeyword( "MINI-LOGO" );
    $kw370$NBSP = makeKeyword( "NBSP" );
    $str371$claimed_by_ = makeString( "claimed by " );
    $str372$EL_Formula___Mt_Identical_to_Asse = makeString( "EL Formula & Mt Identical to Assertion Above" );
    $str373$EL_Formula_Identical_to_Assertion = makeString( "EL Formula Identical to Assertion Above" );
    $sym374$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str375$c = makeString( "c" );
    $str376$nart = makeString( "nart" );
    $str377$a = makeString( "a" );
    $sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__ = makeSymbol( "*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*" );
    $str379$NIL = makeString( "NIL" );
    $sym380$CB_GUESS_NAT = makeSymbol( "CB-GUESS-NAT" );
    $list381 = ConsesLow.list( makeSymbol( "CB-GUESS-NART" ) );
    $sym382$FORT_P = makeSymbol( "FORT-P" );
    $sym383$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $str384$_ = makeString( ";" );
    $str385$naut = makeString( "naut" );
    $str386$sentence = makeString( "sentence" );
    $str387$_day = makeString( "-day" );
    $int388$10000 = makeInteger( 10000 );
    $str389$_month = makeString( "-month" );
    $str390$_year = makeString( "-year" );
    $str391$Month = makeString( "Month" );
    $str392$Day = makeString( "Day" );
    $str393$Year = makeString( "Year" );
    $kw394$EOF = makeKeyword( "EOF" );
    $kw395$ERROR = makeKeyword( "ERROR" );
    $const396$myReviewer = constant_handles.reader_make_constant_shell( makeString( "myReviewer" ) );
    $const397$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $kw398$RED = makeKeyword( "RED" );
    $str399$The_following_parentheses_are_unm = makeString( "The following parentheses are unmatched:" );
    $str400$The_following_constants_are_inval = makeString( "The following constants are invalid:" );
    $str401$This_is_unreadable__because_more_ = makeString( "This is unreadable, because more was expected at the end :" );
    $str402$Trying_to_read_this_generated_an_ = makeString( "Trying to read this generated an internal error :" );
    $sym403$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol( "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P" );
    $str404$The_following_references_to_const = makeString( "The following references to constants are invalid:" );
    $sym405$CHAR_EQUAL = makeSymbol( "CHAR-EQUAL" );
    $str406$in_the_following_string__ = makeString( "in the following string :" );
    $str407$Also__the_following_extra_string_ = makeString( "Also, the following extra string at the end was ignored :" );
    $str408$The_following_string_did_not_spec = makeString( "The following string did not specify a sentence :" );
    $str409$because__ = makeString( "because: " );
    $str410$____none_selected____ = makeString( " -- none selected -- " );
    $sym411$_THE_CYCLIST_ = makeSymbol( "*THE-CYCLIST*" );
    $sym412$_CB_NAT_HISTORY_ = makeSymbol( "*CB-NAT-HISTORY*" );
    $sym413$_CB_CONSTANT_HISTORY_ = makeSymbol( "*CB-CONSTANT-HISTORY*" );
    $kw414$ACTIVE_LEFT_ARROW = makeKeyword( "ACTIVE-LEFT-ARROW" );
    $str415$back_12_png = makeString( "back-12.png" );
    $str416$Active_left_arrow = makeString( "Active left arrow" );
    $kw417$INACTIVE_LEFT_ARROW = makeKeyword( "INACTIVE-LEFT-ARROW" );
    $str418$back_12_disabled_png = makeString( "back-12-disabled.png" );
    $str419$Inactive_left_arrow = makeString( "Inactive left arrow" );
    $kw420$ACTIVE_RIGHT_ARROW = makeKeyword( "ACTIVE-RIGHT-ARROW" );
    $str421$forward_12_png = makeString( "forward-12.png" );
    $str422$Active_right_arrow = makeString( "Active right arrow" );
    $kw423$INACTIVE_RIGHT_ARROW = makeKeyword( "INACTIVE-RIGHT-ARROW" );
    $str424$forward_12_disabled_png = makeString( "forward-12-disabled.png" );
    $str425$Inactive_right_arrow = makeString( "Inactive right arrow" );
    $str426$_a = makeString( "~a" );
    $sym427$CB_GUESS_CONSTANT = makeSymbol( "CB-GUESS-CONSTANT" );
    $kw428$TEST = makeKeyword( "TEST" );
    $kw429$OWNER = makeKeyword( "OWNER" );
    $kw430$CLASSES = makeKeyword( "CLASSES" );
    $kw431$KB = makeKeyword( "KB" );
    $kw432$TINY = makeKeyword( "TINY" );
    $kw433$WORKING_ = makeKeyword( "WORKING?" );
    $list434 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list( ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list( ConsesLow.list( makeString(
            "bd588104-9c29-11b1-9dad-c379636f7270" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "Mx4rvViBBJwpEbGdrcN5Y29ycA" ) ), constant_handles
                .reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "331E2BBD5881049C2911B19DADC379636F7270" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "isa" ) ) ), ConsesLow.list( ConsesLow.list( NIL ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "isa" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                        "isa" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "bd588104-9c29-11b1-9dad-c379636f7270" ) ) ),
                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Mx4rvViBBJwpEbGdrcN5Y29ycA" ) ) ), constant_handles
                                .reader_make_constant_shell( makeString( "isa" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "331E2BBD5881049C2911B19DADC379636F7270" ) ) ), constant_handles
                                    .reader_make_constant_shell( makeString( "isa" ) ) )
    } );
    $sym435$CB_GUESS_DATE = makeSymbol( "CB-GUESS-DATE" );
    $kw436$FULL = makeKeyword( "FULL" );
    $list437 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2064 ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "from October 1977 to February 2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "October" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "YearFn" ) ), makeInteger( 1977 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2064 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "from 1977 to February 2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "YearFn" ) ), makeInteger( 1977 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2064 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "from 1977 to 2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1977 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                          2064 ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "February 2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                  2064 ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "February, 2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                      constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                          makeInteger( 2064 ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "February 29, 2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "DayFn" ) ), makeInteger( 29 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                  .reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                      makeInteger( 2064 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "February 29th, 2064" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 29 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2064 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "February 29xx, 2064" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "February 29foo, 2064" ) ), NIL ), ConsesLow.list(
                                                                                          ConsesLow.list( makeString( "2/29/2064" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                              makeInteger( 29 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "YearFn" ) ), makeInteger( 2064 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "2-29-2064" ) ),
                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 29 ), ConsesLow
                                                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2064 ) ) ) ) ), ConsesLow.list(
                                                                                                                          ConsesLow.list( makeString( "2:12 2-29-2064" ) ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "MinuteFn" ) ), TWELVE_INTEGER, ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), TWO_INTEGER,
                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                                                                      makeInteger( 29 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                          makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "February" ) ), ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                                      2064 ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                          "2-29-2064 2:12" ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                                                              TWELVE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                                                  TWO_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                                                                                                      makeInteger( 29 ), ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "MonthFn" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "February" ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger( 2064 ) ) ) ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "2-29-2064, 2:12" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "HourFn" ) ), TWO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 29 ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "YearFn" ) ), makeInteger( 2064 ) ) ) ) ) ) )
    } );
  }

  public static final class $cb_form_cons_method_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $keyword;
    public SubLObject $applicability_test_fn;
    public SubLObject $html_output_fn;
    private static final SubLStructDeclNative structDecl;

    public $cb_form_cons_method_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$keyword = CommonSymbols.NIL;
      this.$applicability_test_fn = CommonSymbols.NIL;
      this.$html_output_fn = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cb_form_cons_method_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$keyword;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$applicability_test_fn;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$html_output_fn;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$keyword = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$applicability_test_fn = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$html_output_fn = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cb_form_cons_method_native.class, $sym258$CB_FORM_CONS_METHOD, $sym259$CB_FORM_CONS_METHOD_P, $list260, $list261, new String[] { "$name", "$keyword",
        "$applicability_test_fn", "$html_output_fn"
      }, $list262, $list263, $sym264$PRINT_CB_FORM_CONS_METHODS );
    }
  }

  public static final class $cb_form_cons_method_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cb_form_cons_method_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CB-FORM-CONS-METHOD-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cb_form_cons_method_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2563 ms synthetic
 */