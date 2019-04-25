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

public final class cb_utilities extends SubLTranslatedFile
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
    public static SubLObject cb_url(final SubLObject handler, SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (control_string == cb_utilities.UNPROVIDED) {
            control_string = (SubLObject)cb_utilities.NIL;
        }
        if (arg1 == cb_utilities.UNPROVIDED) {
            arg1 = (SubLObject)cb_utilities.NIL;
        }
        if (arg2 == cb_utilities.UNPROVIDED) {
            arg2 = (SubLObject)cb_utilities.NIL;
        }
        if (arg3 == cb_utilities.UNPROVIDED) {
            arg3 = (SubLObject)cb_utilities.NIL;
        }
        if (arg4 == cb_utilities.UNPROVIDED) {
            arg4 = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str0$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), handler);
        if (cb_utilities.NIL != control_string) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), control_string, new SubLObject[] { arg1, arg2, arg3, arg4 });
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1191L)
    public static SubLObject cb_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == cb_utilities.UNPROVIDED) {
            arg1 = (SubLObject)cb_utilities.NIL;
        }
        if (arg2 == cb_utilities.UNPROVIDED) {
            arg2 = (SubLObject)cb_utilities.NIL;
        }
        if (arg3 == cb_utilities.UNPROVIDED) {
            arg3 = (SubLObject)cb_utilities.NIL;
        }
        if (arg4 == cb_utilities.UNPROVIDED) {
            arg4 = (SubLObject)cb_utilities.NIL;
        }
        if (arg5 == cb_utilities.UNPROVIDED) {
            arg5 = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_utilities.$str4$Cyc_error);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_utilities.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_utilities.$str4$Cyc_error);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    html_macros.verify_not_within_html_pre();
                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$3 = html_macros.$within_html_pre$.currentBinding(thread);
                    try {
                        html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), format_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
                    }
                    finally {
                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                    cb_back_button((SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1407L)
    public static SubLObject cb_show_fi_error(final SubLObject fi_error) {
        final SubLObject error_string = fi.fi_error_string(fi_error);
        return cb_error((SubLObject)cb_utilities.$str5$_A, error_string, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1537L)
    public static SubLObject cb_simple_message_page(final SubLObject message, SubLObject back, SubLObject delay) {
        if (back == cb_utilities.UNPROVIDED) {
            back = (SubLObject)cb_utilities.ONE_INTEGER;
        }
        if (delay == cb_utilities.UNPROVIDED) {
            delay = (SubLObject)cb_utilities.$int6$2000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)cb_utilities.UNPROVIDED);
                if (back.isInteger()) {
                    html_script_utilities.html_back_onload_script(delay);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(message);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 1856L)
    public static SubLObject cb_history_with_back_link(SubLObject back_staleP) {
        if (back_staleP == cb_utilities.UNPROVIDED) {
            back_staleP = (SubLObject)cb_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_utilities.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            if (cb_utilities.NIL != back_staleP) {
                cb_back_button((SubLObject)cb_utilities.$kw7$SELF, (SubLObject)cb_utilities.$str8$Back_to_previous__stale__page);
            }
            else {
                cb_back_button((SubLObject)cb_utilities.$kw7$SELF, (SubLObject)cb_utilities.$str9$Back_to_previous_page);
            }
            html_utilities.html_hr((SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            cb_tools.cb_show_history_info((SubLObject)cb_utilities.UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 2223L)
    public static SubLObject cb_message_page_with_history(final SubLObject message, SubLObject back_staleP) {
        if (back_staleP == cb_utilities.UNPROVIDED) {
            back_staleP = (SubLObject)cb_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_utilities.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_utilities.NIL != message) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(message);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_utilities.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_utilities.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_utilities.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_utilities.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            if (cb_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_utilities.NIL != message) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_princ(message);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        }
                        cb_history_with_back_link(back_staleP);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 2533L)
    public static SubLObject cb_titled_message_page_with_history(final SubLObject title, final SubLObject messages, SubLObject back_staleP) {
        if (back_staleP == cb_utilities.UNPROVIDED) {
            back_staleP = (SubLObject)cb_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_utilities.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_utilities.NIL != title) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_utilities.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_utilities.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_utilities.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_utilities.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                            if (cb_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_utilities.NIL != title) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        }
                        html_macros.verify_not_within_html_pre();
                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                        final SubLObject _prev_bind_0_$14 = html_macros.$within_html_pre$.currentBinding(thread);
                        try {
                            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
                            SubLObject cdolist_list_var = messages;
                            SubLObject message = (SubLObject)cb_utilities.NIL;
                            message = cdolist_list_var.first();
                            while (cb_utilities.NIL != cdolist_list_var) {
                                html_utilities.html_princ(message);
                                html_utilities.html_terpri((SubLObject)cb_utilities.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                message = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$within_html_pre$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        cb_history_with_back_link(back_staleP);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 2999L)
    public static SubLObject cb_frame_update_message_page_info(final SubLObject page_name) {
        html_utilities.html_newline((SubLObject)cb_utilities.TWO_INTEGER);
        final SubLObject message = Sequences.cconcatenate((SubLObject)cb_utilities.$str18$Back_to__stale__, new SubLObject[] { format_nil.format_nil_a_no_copy(page_name), cb_utilities.$str19$_page });
        cb_back_button((SubLObject)cb_utilities.$kw7$SELF, message);
        html_utilities.html_hr((SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        cb_tools.cb_show_history_info((SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3228L)
    public static SubLObject cb_show_truth(final SubLObject truth) {
        if (truth.eql((SubLObject)cb_utilities.$kw20$TRUE)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str21$True);
        }
        else if (truth.eql((SubLObject)cb_utilities.$kw22$FALSE)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str23$False);
        }
        else if (truth.eql((SubLObject)cb_utilities.$kw24$UNKNOWN)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str25$Unknown);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_utilities.$str26$___);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3435L)
    public static SubLObject cb_show_strength(final SubLObject strength) {
        if (strength.eql((SubLObject)cb_utilities.$kw27$DEFAULT)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str28$Default);
        }
        else if (strength.eql((SubLObject)cb_utilities.$kw29$MONOTONIC)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str30$Monotonic);
        }
        else if (strength.eql((SubLObject)cb_utilities.$kw24$UNKNOWN)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str25$Unknown);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_utilities.$str26$___);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3662L)
    public static SubLObject cb_show_direction(final SubLObject direction) {
        if (direction.eql((SubLObject)cb_utilities.$kw31$FORWARD)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str32$Forward);
        }
        else if (direction.eql((SubLObject)cb_utilities.$kw33$BACKWARD)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str34$Backward);
        }
        else if (direction.eql((SubLObject)cb_utilities.$kw35$CODE)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str36$Code);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_utilities.$str26$___);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3884L)
    public static SubLObject cb_show_support_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str37$_S, module);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 3980L)
    public static SubLObject cb_term_font_size(final SubLObject v_term, SubLObject baseline, SubLObject allowed_width) {
        if (baseline == cb_utilities.UNPROVIDED) {
            baseline = (SubLObject)cb_utilities.THREE_INTEGER;
        }
        if (allowed_width == cb_utilities.UNPROVIDED) {
            allowed_width = (SubLObject)cb_utilities.$int38$30;
        }
        if (cb_utilities.NIL != nart_handles.nart_p(v_term)) {
            return number_utilities.f_1_(baseline);
        }
        if (cb_utilities.NIL != constant_handles.constant_p(v_term) && Sequences.length(constants_high.constant_name(v_term)).numG(allowed_width)) {
            return number_utilities.f_1_(baseline);
        }
        if (cb_utilities.NIL != constant_handles.constant_p(v_term)) {
            return baseline;
        }
        if (v_term.isString() && Sequences.length(v_term).numG(allowed_width)) {
            return number_utilities.f_1_(baseline);
        }
        if (v_term.isString()) {
            return baseline;
        }
        return baseline;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 4607L)
    public static SubLObject cb_show_date(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
        SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        month = numeric_date_utilities.abbreviation_for_month_number(month);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str39$_A__A___A, new SubLObject[] { month, day, year });
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 4841L)
    public static SubLObject cb_show_second(final SubLObject universal_second) {
        html_utilities.html_princ(numeric_date_utilities.secondstring(universal_second));
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 4944L)
    public static SubLObject cb_show_cyclist(final SubLObject cyclist) {
        if (cb_utilities.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            final SubLObject html = cb_html_for_cyclist_in_nl(cyclist, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            return html_utilities.html_markup(html);
        }
        return cb_form(cyclist, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
    public static SubLObject clear_cb_html_for_cyclist_in_nl() {
        final SubLObject cs = cb_utilities.$cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
        if (cb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
    public static SubLObject remove_cb_html_for_cyclist_in_nl(final SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
        if (addressee == cb_utilities.UNPROVIDED) {
            addressee = operation_communication.the_cyclist();
        }
        if (domain_mt == cb_utilities.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(cb_utilities.$cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cyclist, addressee, domain_mt), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
    public static SubLObject cb_html_for_cyclist_in_nl_internal(final SubLObject cyclist, final SubLObject addressee, final SubLObject domain_mt) {
        return cb_html_for_obj_in_nl(cyclist, domain_mt, (SubLObject)cb_utilities.$sym41$HTML_GENERATE_PHRASE, addressee);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5151L)
    public static SubLObject cb_html_for_cyclist_in_nl(final SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
        if (addressee == cb_utilities.UNPROVIDED) {
            addressee = operation_communication.the_cyclist();
        }
        if (domain_mt == cb_utilities.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        SubLObject caching_state = cb_utilities.$cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
        if (cb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_utilities.$sym40$CB_HTML_FOR_CYCLIST_IN_NL, (SubLObject)cb_utilities.$sym42$_CB_HTML_FOR_CYCLIST_IN_NL_CACHING_STATE_, (SubLObject)cb_utilities.TWENTY_INTEGER, (SubLObject)cb_utilities.EQL, (SubLObject)cb_utilities.THREE_INTEGER, (SubLObject)cb_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cyclist, addressee, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cb_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cb_utilities.NIL;
            collision = cdolist_list_var.first();
            while (cb_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cyclist.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (addressee.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (cb_utilities.NIL != cached_args && cb_utilities.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cb_html_for_cyclist_in_nl_internal(cyclist, addressee, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cyclist, addressee, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5433L)
    public static SubLObject cyc_system_doc_rename_kill() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), (SubLObject)cb_utilities.$str43$ref_renames_kills_html);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5703L)
    public static SubLObject cyc_system_doc_naming_conventions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), (SubLObject)cb_utilities.$str44$ref_cycl_syntax_html_naming_conve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 5918L)
    public static SubLObject cyc_documentation_toc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), (SubLObject)cb_utilities.$str45$toc_html);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 6011L)
    public static SubLObject cb_doc_link(final SubLObject about, final SubLObject link_text, final SubLObject html_file, SubLObject anchor) {
        if (anchor == cb_utilities.UNPROVIDED) {
            anchor = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_indent((SubLObject)cb_utilities.THREE_INTEGER);
        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str46$__For_detailed_help_and_warnings_, about);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_princ(html_file);
        if (cb_utilities.NIL != anchor) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str47$_);
            html_utilities.html_princ(anchor);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_princ(link_text);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_utilities.$str48$_documentation_);
        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 6863L)
    public static SubLObject cb_show_boolean(final SubLObject v_boolean) {
        return html_utilities.html_princ(boolean_yes_no_string(v_boolean));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 6959L)
    public static SubLObject boolean_yes_no_string(final SubLObject v_boolean) {
        return (SubLObject)((cb_utilities.NIL != v_boolean) ? cb_utilities.$str49$Yes : cb_utilities.$str50$No);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7195L)
    public static SubLObject cb_available_tools() {
        return conses_high.copy_list(cb_utilities.$cb_available_tools$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7278L)
    public static SubLObject cb_standard_tools() {
        return conses_high.set_difference(cb_available_tools(), cb_deprecated_tools(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7387L)
    public static SubLObject cb_deprecated_tools() {
        return Sequences.remove((SubLObject)cb_utilities.$kw52$DEPRECATED, cb_utilities.$cb_available_tools$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym53$NOT_EQL), Symbols.symbol_function((SubLObject)cb_utilities.$sym54$FIFTH), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7498L)
    public static SubLObject cb_clear_available_tools() {
        cb_utilities.$cb_available_tools$.setGlobalValue((SubLObject)cb_utilities.NIL);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 7593L)
    public static SubLObject declare_cb_tool(final SubLObject tool, final SubLObject pretty_name, final SubLObject abbreviation, final SubLObject description) {
        undeclare_cb_tool(tool);
        cb_utilities.$cb_available_tools$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tool, pretty_name, abbreviation, description, (SubLObject)cb_utilities.$kw55$STANDARD), cb_utilities.$cb_available_tools$.getGlobalValue()));
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8148L)
    public static SubLObject declare_deprecated_cb_tool(final SubLObject tool, final SubLObject pretty_name, final SubLObject abbreviation, final SubLObject description) {
        undeclare_cb_tool(tool);
        cb_utilities.$cb_available_tools$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tool, pretty_name, abbreviation, description, (SubLObject)cb_utilities.$kw52$DEPRECATED), cb_utilities.$cb_available_tools$.getGlobalValue()));
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8731L)
    public static SubLObject undeclare_cb_tool(final SubLObject tool) {
        cb_utilities.$cb_available_tools$.setGlobalValue(Sequences.delete(tool, cb_utilities.$cb_available_tools$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.EQL), Symbols.symbol_function((SubLObject)cb_utilities.$sym56$CAR), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        return tool;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8869L)
    public static SubLObject cb_tool_name(final SubLObject tool) {
        return conses_high.second(conses_high.assoc(tool, cb_utilities.$cb_available_tools$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 8957L)
    public static SubLObject cb_tool_abbreviation(final SubLObject tool) {
        return conses_high.third(conses_high.assoc(tool, cb_utilities.$cb_available_tools$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 11888L)
    public static SubLObject cb_definitional_preds_for_type(final SubLObject type) {
        return conses_high.assoc(type, cb_utilities.$cb_c_definitional_type_pred_map$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 11997L)
    public static SubLObject cb_definitional_preds_for_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)cb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_utilities.$const59$EverythingPSC, thread);
            final SubLObject type = fort_types_interface.definitional_fort_type(fort, (SubLObject)cb_utilities.NIL);
            preds = cb_definitional_preds_for_type(type);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 12216L)
    public static SubLObject cb_sort_preds_for_display(final SubLObject fort, SubLObject predicates, SubLObject key) {
        if (key == cb_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        predicates = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_utilities.$sym60$VALID_FORT_), predicates, key, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        predicates = kb_utilities.sort_terms(predicates, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.T, key, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL == forts.fort_p(fort)) {
            return predicates;
        }
        SubLObject type = (SubLObject)cb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_utilities.$const59$EverythingPSC, thread);
            type = fort_types_interface.definitional_fort_type(fort, (SubLObject)cb_utilities.NIL);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject guide_seq = cb_definitional_preds_for_type(type);
        return list_utilities.stable_sort_via_position(predicates, guide_seq, Symbols.symbol_function((SubLObject)cb_utilities.EQL), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 12749L)
    public static SubLObject cb_sort_mts_for_display(SubLObject mts, SubLObject max_to_temporally_sort) {
        if (max_to_temporally_sort == cb_utilities.UNPROVIDED) {
            max_to_temporally_sort = cb_utilities.$cb_max_mts_to_sort_temporally$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        mts = kb_utilities.sort_terms(mts, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        mts = kb_utilities.sort_terms(mts, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL == cb_parameters.$cb_fastP$.getDynamicValue(thread) && cb_utilities.NIL == list_utilities.lengthG(mts, max_to_temporally_sort, (SubLObject)cb_utilities.UNPROVIDED)) {
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)cb_utilities.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)cb_utilities.T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$15 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        mts = Sort.stable_sort(mts, (SubLObject)cb_utilities.$sym61$POTENTIALLY_INFINITE_INTEGER__, (SubLObject)cb_utilities.$sym62$MT_START_UNIVERSAL_TIME_EXTENDED);
                        mts = Sort.stable_sort(mts, (SubLObject)cb_utilities.$sym61$POTENTIALLY_INFINITE_INTEGER__, (SubLObject)cb_utilities.$sym63$MT_END_UNIVERSAL_TIME_EXTENDED);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$15, thread);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
            }
        }
        mts = mt_vars.push_core_mts_to_beginning(mts);
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject mt_start_universal_time_extended(final SubLObject mt, SubLObject default_value) {
        if (default_value == cb_utilities.UNPROVIDED) {
            default_value = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)cb_utilities.NIL;
        try {
            thread.throwStack.push(cb_utilities.$kw64$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)cb_utilities.$sym65$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject time_interval = get_mt_time_interval_memoized(mt);
                    return maybe_cycl_second_to_universal_time_extended(time_interval_utilities.cycl_interval_initial_second(time_interval), default_value);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_utilities.$kw64$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject mt_end_universal_time_extended(final SubLObject mt, SubLObject default_value) {
        if (default_value == cb_utilities.UNPROVIDED) {
            default_value = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)cb_utilities.NIL;
        try {
            thread.throwStack.push(cb_utilities.$kw64$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)cb_utilities.$sym65$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject time_interval = get_mt_time_interval_memoized(mt);
                    return maybe_cycl_second_to_universal_time_extended(time_interval_utilities.cycl_interval_final_second(time_interval), default_value);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_utilities.$kw64$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject get_mt_time_interval_memoized_internal(final SubLObject mt) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)cb_utilities.ZERO_INTEGER), hlmt.explode_hlmt_temporal_facets_with_defaults(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject get_mt_time_interval_memoized(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)cb_utilities.NIL;
        if (cb_utilities.NIL == v_memoization_state) {
            return get_mt_time_interval_memoized_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)cb_utilities.$sym67$GET_MT_TIME_INTERVAL_MEMOIZED, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)cb_utilities.$sym67$GET_MT_TIME_INTERVAL_MEMOIZED, (SubLObject)cb_utilities.ONE_INTEGER, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.EQUAL, (SubLObject)cb_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)cb_utilities.$sym67$GET_MT_TIME_INTERVAL_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_mt_time_interval_memoized_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)cb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject maybe_cycl_second_to_universal_time_extended_internal(final SubLObject second, SubLObject default_value) {
        if (default_value == cb_utilities.UNPROVIDED) {
            default_value = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        SubLObject utx = maybe_cycl_second_to_universal_time_extended_low(second, default_value);
        if (cb_utilities.NIL == number_utilities.potentially_infinite_integer_p(utx)) {
            utx = default_value;
        }
        return utx;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject maybe_cycl_second_to_universal_time_extended(final SubLObject second, SubLObject default_value) {
        if (default_value == cb_utilities.UNPROVIDED) {
            default_value = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)cb_utilities.NIL;
        if (cb_utilities.NIL == v_memoization_state) {
            return maybe_cycl_second_to_universal_time_extended_internal(second, default_value);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)cb_utilities.$sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)cb_utilities.$sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.EQUAL, (SubLObject)cb_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)cb_utilities.$sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(second, default_value);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cb_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cb_utilities.NIL;
            collision = cdolist_list_var.first();
            while (cb_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (second.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cb_utilities.NIL != cached_args && cb_utilities.NIL == cached_args.rest() && default_value.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(maybe_cycl_second_to_universal_time_extended_internal(second, default_value)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(second, default_value));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 13539L)
    public static SubLObject maybe_cycl_second_to_universal_time_extended_low(final SubLObject second, SubLObject default_value) {
        if (default_value == cb_utilities.UNPROVIDED) {
            default_value = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (cb_utilities.NIL == second) {
            return default_value;
        }
        if (second.eql(cb_utilities.$const69$Now)) {
            return Time.get_universal_time();
        }
        if (cb_utilities.NIL != date_utilities.beginning_of_timeP(second)) {
            return number_utilities.negative_infinity();
        }
        if (cb_utilities.NIL != date_utilities.end_of_timeP(second)) {
            return number_utilities.positive_infinity();
        }
        if (cb_utilities.NIL != sbhl_time_modules.starts_after_starting_ofP((SubLObject)cb_utilities.$list70, second, (SubLObject)cb_utilities.UNPROVIDED)) {
            return Numbers.minus(date_utilities.convert_time_quant_to_seconds(date_utilities.time_elapsed(second, (SubLObject)cb_utilities.$list70, cb_utilities.$const71$SecondsDuration)));
        }
        if (cb_utilities.NIL != date_utilities.date_p(second)) {
            return date_utilities.cycl_date_to_universal_time(second);
        }
        return default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 15848L)
    public static SubLObject cb_sort_args_for_display(final SubLObject args) {
        return Sort.sort(args, Symbols.symbol_function((SubLObject)cb_utilities.$sym72$_), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 15917L)
    public static SubLObject cb_group_hlmts_by_monad_mt(final SubLObject hlmts) {
        SubLObject groups = (SubLObject)cb_utilities.NIL;
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_utilities.EQL), (SubLObject)cb_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = hlmts;
        SubLObject v_hlmt = (SubLObject)cb_utilities.NIL;
        v_hlmt = cdolist_list_var.first();
        while (cb_utilities.NIL != cdolist_list_var) {
            final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
            dictionary_utilities.dictionary_push(dict, monad_mt, v_hlmt);
            cdolist_list_var = cdolist_list_var.rest();
            v_hlmt = cdolist_list_var.first();
        }
        final SubLObject monad_mts = dictionary.dictionary_keys(dict);
        SubLObject cdolist_list_var2;
        final SubLObject sorted_monad_mts = cdolist_list_var2 = cb_sort_mts_for_display(monad_mts, (SubLObject)cb_utilities.UNPROVIDED);
        SubLObject monad_mt2 = (SubLObject)cb_utilities.NIL;
        monad_mt2 = cdolist_list_var2.first();
        while (cb_utilities.NIL != cdolist_list_var2) {
            final SubLObject hlmt_list = dictionary.dictionary_lookup(dict, monad_mt2, (SubLObject)cb_utilities.UNPROVIDED);
            groups = (SubLObject)ConsesLow.cons(hlmt_list, groups);
            cdolist_list_var2 = cdolist_list_var2.rest();
            monad_mt2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(groups);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 16974L)
    public static SubLObject cb_back_button(SubLObject target, SubLObject value) {
        if (target == cb_utilities.UNPROVIDED) {
            target = (SubLObject)cb_utilities.$kw7$SELF;
        }
        if (value == cb_utilities.UNPROVIDED) {
            value = (SubLObject)cb_utilities.$str75$Back;
        }
        if (target.eql((SubLObject)cb_utilities.$kw7$SELF)) {
            return html_script_utilities.html_back_button(value);
        }
        final SubLObject pcase_var = target;
        if (pcase_var.eql((SubLObject)cb_utilities.$kw76$TOP)) {
            return html_script_utilities.html_simple_script_button(value, cb_utilities.$cb_back_button_predefined_script$.getGlobalValue(), (SubLObject)cb_utilities.$str77$top, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)cb_utilities.$kw78$PARENT)) {
            return html_script_utilities.html_simple_script_button(value, cb_utilities.$cb_back_button_predefined_script$.getGlobalValue(), (SubLObject)cb_utilities.$str79$parent, (SubLObject)cb_utilities.UNPROVIDED);
        }
        final SubLObject frame = cb_frame_name(target);
        if (cb_utilities.NIL != frame) {
            return html_script_utilities.html_simple_script_button(value, cb_utilities.$cb_back_button_script$.getGlobalValue(), frame, (SubLObject)cb_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 17636L)
    public static SubLObject register_cb_frame(final SubLObject frame_spec, final SubLObject name, SubLObject src, SubLObject src_format, SubLObject noresize, SubLObject scrolling) {
        if (src == cb_utilities.UNPROVIDED) {
            src = (SubLObject)cb_utilities.NIL;
        }
        if (src_format == cb_utilities.UNPROVIDED) {
            src_format = (SubLObject)cb_utilities.NIL;
        }
        if (noresize == cb_utilities.UNPROVIDED) {
            noresize = (SubLObject)cb_utilities.NIL;
        }
        if (scrolling == cb_utilities.UNPROVIDED) {
            scrolling = (SubLObject)cb_utilities.T;
        }
        assert cb_utilities.NIL != Types.keywordp(frame_spec) : frame_spec;
        assert cb_utilities.NIL != Types.stringp(name) : name;
        if (cb_utilities.NIL != src && !cb_utilities.assertionsDisabledInClass && cb_utilities.NIL == Types.stringp(src)) {
            throw new AssertionError(src);
        }
        if (cb_utilities.NIL != src_format && !cb_utilities.assertionsDisabledInClass && cb_utilities.NIL == Types.stringp(src_format)) {
            throw new AssertionError(src_format);
        }
        SubLObject existing = cb_frame_info(frame_spec);
        if (cb_utilities.NIL == existing) {
            existing = (SubLObject)ConsesLow.list(frame_spec, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL);
            cb_utilities.$cb_frame_table$.setGlobalValue((SubLObject)ConsesLow.cons(existing, cb_utilities.$cb_frame_table$.getGlobalValue()));
        }
        ConsesLow.set_nth((SubLObject)cb_utilities.ONE_INTEGER, existing, name);
        ConsesLow.set_nth((SubLObject)cb_utilities.TWO_INTEGER, existing, src);
        ConsesLow.set_nth((SubLObject)cb_utilities.THREE_INTEGER, existing, src_format);
        ConsesLow.set_nth((SubLObject)cb_utilities.FOUR_INTEGER, existing, list_utilities.sublisp_boolean(noresize));
        if (cb_utilities.NIL != scrolling) {
            ConsesLow.set_nth((SubLObject)cb_utilities.FIVE_INTEGER, existing, (SubLObject)cb_utilities.NIL);
        }
        else {
            ConsesLow.set_nth((SubLObject)cb_utilities.FIVE_INTEGER, existing, (SubLObject)cb_utilities.$str83$no);
        }
        return frame_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 18587L)
    public static SubLObject deregister_cb_frame(final SubLObject frame_spec) {
        assert cb_utilities.NIL != Types.keywordp(frame_spec) : frame_spec;
        cb_utilities.$cb_frame_table$.setGlobalValue(Sequences.delete(frame_spec, cb_utilities.$cb_frame_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.EQL), Symbols.symbol_function((SubLObject)cb_utilities.$sym84$FIRST), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        return frame_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 18816L)
    public static SubLObject cb_frame_info(final SubLObject frame_spec) {
        assert cb_utilities.NIL != Types.keywordp(frame_spec) : frame_spec;
        return conses_high.assoc(frame_spec, cb_utilities.$cb_frame_table$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 18940L)
    public static SubLObject cb_frame_name(final SubLObject frame_spec) {
        if (frame_spec.isKeyword()) {
            return conses_high.second(cb_frame_info(frame_spec));
        }
        if (frame_spec.isString()) {
            return frame_spec;
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 19147L)
    public static SubLObject cb_frame(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == cb_utilities.UNPROVIDED) {
            arg1 = (SubLObject)cb_utilities.NIL;
        }
        if (arg2 == cb_utilities.UNPROVIDED) {
            arg2 = (SubLObject)cb_utilities.NIL;
        }
        if (arg3 == cb_utilities.UNPROVIDED) {
            arg3 = (SubLObject)cb_utilities.NIL;
        }
        if (arg4 == cb_utilities.UNPROVIDED) {
            arg4 = (SubLObject)cb_utilities.NIL;
        }
        if (type.eql((SubLObject)cb_utilities.$kw85$MAIN)) {
            final SubLObject name = cb_frame_name((SubLObject)cb_utilities.$kw85$MAIN);
            SubLObject handler = (SubLObject)((cb_utilities.NIL != ke.cyclist_is_guest()) ? cb_utilities.$str86$cb_login : cb_utilities.$str87$cb_history);
            SubLObject new_arg_string = (SubLObject)cb_utilities.$str88$;
            if (arg1.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg1;
                SubLObject indirect_handler = (SubLObject)cb_utilities.NIL;
                SubLObject indirect_args = (SubLObject)cb_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_utilities.$list89);
                indirect_handler = current.first();
                current = (indirect_args = current.rest());
                if (indirect_handler.isString()) {
                    final SubLObject function_symbol = Packages.find_symbol(Strings.string_upcase(indirect_handler, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED), (SubLObject)cb_utilities.UNPROVIDED);
                    if (function_symbol.isSymbol() && cb_utilities.NIL != Symbols.fboundp(function_symbol) && cb_utilities.NIL != html_macros.html_handler_functionP(function_symbol)) {
                        handler = indirect_handler;
                        SubLObject cdolist_list_var = indirect_args;
                        SubLObject indirect_arg = (SubLObject)cb_utilities.NIL;
                        indirect_arg = cdolist_list_var.first();
                        while (cb_utilities.NIL != cdolist_list_var) {
                            if (indirect_arg.isCons()) {
                                new_arg_string = Sequences.cconcatenate(new_arg_string, Sequences.cconcatenate((SubLObject)cb_utilities.$str90$_, new SubLObject[] { format_nil.format_nil_a_no_copy(indirect_arg.first()), cb_utilities.$str91$_, format_nil.format_nil_a_no_copy(conses_high.second(indirect_arg)) }));
                            }
                            else {
                                new_arg_string = Sequences.cconcatenate(new_arg_string, Sequences.cconcatenate((SubLObject)cb_utilities.$str90$_, format_nil.format_nil_a_no_copy(indirect_arg)));
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            indirect_arg = cdolist_list_var.first();
                        }
                    }
                }
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_frame_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_frame_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_frame_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            cb_url(handler, (SubLObject)cb_utilities.$str5$_A, new_arg_string, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        }
        else {
            final SubLObject simple_info = cb_frame_info(type);
            if (cb_utilities.NIL != simple_info) {
                SubLObject current2;
                final SubLObject datum2 = current2 = simple_info;
                SubLObject keyword = (SubLObject)cb_utilities.NIL;
                SubLObject name2 = (SubLObject)cb_utilities.NIL;
                SubLObject handler2 = (SubLObject)cb_utilities.NIL;
                SubLObject control_string = (SubLObject)cb_utilities.NIL;
                SubLObject noresize = (SubLObject)cb_utilities.NIL;
                SubLObject scrolling = (SubLObject)cb_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_utilities.$list92);
                keyword = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_utilities.$list92);
                name2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_utilities.$list92);
                handler2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_utilities.$list92);
                control_string = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_utilities.$list92);
                noresize = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_utilities.$list92);
                scrolling = current2.first();
                current2 = current2.rest();
                if (cb_utilities.NIL == current2) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_frame_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_frame_name$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(name2);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    if (cb_utilities.NIL != noresize) {
                        html_utilities.html_simple_attribute(html_macros.$html_frame_noresize$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_frame_src$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    cb_url(handler2, control_string, arg1, arg2, arg3, arg4);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    if (cb_utilities.NIL != scrolling) {
                        html_utilities.html_markup(html_macros.$html_frame_scrolling$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(scrolling);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)cb_utilities.$list92);
                }
            }
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 21814L)
    public static SubLObject cb_link(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == cb_utilities.UNPROVIDED) {
            arg1 = (SubLObject)cb_utilities.NIL;
        }
        if (arg2 == cb_utilities.UNPROVIDED) {
            arg2 = (SubLObject)cb_utilities.NIL;
        }
        if (arg3 == cb_utilities.UNPROVIDED) {
            arg3 = (SubLObject)cb_utilities.NIL;
        }
        if (arg4 == cb_utilities.UNPROVIDED) {
            arg4 = (SubLObject)cb_utilities.NIL;
        }
        if (arg5 == cb_utilities.UNPROVIDED) {
            arg5 = (SubLObject)cb_utilities.NIL;
        }
        final SubLObject method = cb_link_method(type);
        if (cb_utilities.NIL != method) {
            final SubLObject pcase_var;
            final SubLObject max_args = pcase_var = cb_link_max_args(type);
            if (pcase_var.eql((SubLObject)cb_utilities.ZERO_INTEGER)) {
                Functions.funcall(method);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.ONE_INTEGER)) {
                Functions.funcall(method, arg1);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.TWO_INTEGER)) {
                Functions.funcall(method, arg1, arg2);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.THREE_INTEGER)) {
                Functions.funcall(method, arg1, arg2, arg3);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.FOUR_INTEGER)) {
                Functions.funcall(method, arg1, arg2, arg3, arg4);
            }
            else {
                Functions.funcall(method, arg1, arg2, arg3, arg4, arg5);
            }
        }
        else {
            Errors.error((SubLObject)cb_utilities.$str131$No_cb_link_method_for__S_defined, type);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22356L)
    public static SubLObject setup_cb_link_method(final SubLObject type, final SubLObject method_func, final SubLObject max_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_utilities.NIL != Types.keywordp(type) : type;
        assert cb_utilities.NIL != Types.symbolp(method_func) : method_func;
        assert cb_utilities.NIL != Types.fixnump(max_args) : max_args;
        if (cb_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !max_args.numLE(cb_utilities.$max_cb_link_arg_count$.getGlobalValue())) {
            Errors.error((SubLObject)cb_utilities.$str134$Too_many_args_in__S___max_of__S_a, method_func, max_args);
        }
        Symbols.put(type, (SubLObject)cb_utilities.$kw135$CB_LINK_METHOD, method_func);
        Symbols.put(type, (SubLObject)cb_utilities.$kw136$CB_LINK_MAX_ARGS, max_args);
        return type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22748L)
    public static SubLObject cb_link_method(final SubLObject type) {
        return Symbols.get(type, (SubLObject)cb_utilities.$kw135$CB_LINK_METHOD, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 22815L)
    public static SubLObject cb_link_max_args(final SubLObject type) {
        return Symbols.get(type, (SubLObject)cb_utilities.$kw136$CB_LINK_MAX_ARGS, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 23295L)
    public static SubLObject cb_link_constant(final SubLObject constant, SubLObject linktext, SubLObject image_keyword) {
        if (linktext == cb_utilities.UNPROVIDED) {
            linktext = (SubLObject)cb_utilities.NIL;
        }
        if (image_keyword == cb_utilities.UNPROVIDED) {
            image_keyword = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant_name = constants_high.constant_name(constant);
        if (cb_utilities.NIL == linktext) {
            linktext = constant_name;
        }
        SubLObject handler = cb_utilities.$cb_default_fort_handler$.getDynamicValue(thread);
        final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue(thread);
        final SubLObject html_class = (SubLObject)cb_utilities.$str139$const;
        cb_adornments.handle_adornments((SubLObject)cb_utilities.$kw140$FORT, frame, constant, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        cb_adornments.handle_adornments((SubLObject)cb_utilities.$kw141$CONSTANT, frame, constant, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != cb_utilities.$cb_default_fort_link_emitter$.getDynamicValue(thread) && cb_utilities.NIL != Symbols.fboundp(cb_utilities.$cb_default_fort_link_emitter$.getDynamicValue(thread))) {
            Functions.funcall(cb_utilities.$cb_default_fort_link_emitter$.getDynamicValue(thread), constant, linktext, frame);
            return constant;
        }
        if (frame == cb_utilities.$kw76$TOP) {
            handler = Sequences.cconcatenate((SubLObject)cb_utilities.$str142$cb_start_, format_nil.format_nil_a_no_copy(cb_utilities.$cb_default_fort_handler$.getDynamicValue(thread)));
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str143$_a__a, handler, cb_fort_identifier(constant));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != constant_name) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(constant_name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != html_class) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_class);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            if (cb_utilities.NIL != image_keyword) {
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
                final SubLObject align = (SubLObject)cb_utilities.$kw76$TOP;
                final SubLObject alt = (cb_utilities.NIL != linktext) ? linktext : cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
                final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            else if (cb_utilities.NIL != constant_handles.valid_constantP(constant, (SubLObject)cb_utilities.UNPROVIDED)) {
                if (cb_utilities.NIL != fort_types_interface.obsolete_constantP(constant)) {
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_utilities.$str144$obsolete);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        if (cb_utilities.NIL != cb_utilities.$cb_show_constant_hash_dollar_prefixP$.getDynamicValue(thread)) {
                            html_utilities.html_princ((SubLObject)cb_utilities.$str145$__);
                        }
                        html_utilities.html_princ(linktext);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                else {
                    if (cb_utilities.NIL != cb_utilities.$cb_show_constant_hash_dollar_prefixP$.getDynamicValue(thread)) {
                        html_utilities.html_princ((SubLObject)cb_utilities.$str145$__);
                    }
                    html_utilities.html_princ(linktext);
                }
            }
            else {
                html_utilities.html_stale_constant_reference(linktext, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        cyc_file_dependencies.javascript((SubLObject)cb_utilities.$kw146$TERM_CONTEXT_MENU);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 24844L)
    public static SubLObject cb_nat_span_id(final SubLObject nat, SubLObject uniquifier) {
        if (uniquifier == cb_utilities.UNPROVIDED) {
            uniquifier = cb_utilities.$cb_term_id$.getDynamicValue();
        }
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cb_naut_identifier(cycl_utilities.hl_to_el(nat))), new SubLObject[] { cb_utilities.$str152$_, format_nil.format_nil_a_no_copy(uniquifier) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 24995L)
    public static SubLObject cb_link_nart(final SubLObject nart, SubLObject linktext, SubLObject image_keyword) {
        if (linktext == cb_utilities.UNPROVIDED) {
            linktext = (SubLObject)cb_utilities.NIL;
        }
        if (image_keyword == cb_utilities.UNPROVIDED) {
            image_keyword = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == linktext) {
            linktext = (SubLObject)cb_utilities.$str153$_;
        }
        SubLObject handler = cb_utilities.$cb_default_fort_handler$.getDynamicValue(thread);
        final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue(thread);
        final SubLObject v_class = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)), format_nil.format_nil_a_no_copy(cb_nat_span_id(nart, (SubLObject)cb_utilities.UNPROVIDED)));
        cb_adornments.handle_adornments((SubLObject)cb_utilities.$kw140$FORT, frame, nart, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        cb_adornments.handle_adornments((SubLObject)cb_utilities.$kw150$NART, frame, nart, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        if (frame == cb_utilities.$kw76$TOP) {
            handler = Sequences.cconcatenate((SubLObject)cb_utilities.$str142$cb_start_, format_nil.format_nil_a_no_copy(cb_utilities.$cb_default_fort_handler$.getDynamicValue(thread)));
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str143$_a__a, handler, cb_fort_identifier(nart));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_utilities.$str88$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != v_class) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(v_class);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            if (cb_utilities.NIL != image_keyword) {
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
                final SubLObject align = (SubLObject)cb_utilities.$str154$absmiddle;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
                final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_princ(linktext);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_princ(linktext);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        cyc_file_dependencies.javascript((SubLObject)cb_utilities.$kw146$TERM_CONTEXT_MENU);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 25880L)
    public static SubLObject cb_link_nat(final SubLObject nart, SubLObject linktext) {
        if (linktext == cb_utilities.UNPROVIDED) {
            linktext = (SubLObject)cb_utilities.NIL;
        }
        return cb_link((SubLObject)cb_utilities.$kw150$NART, nart, linktext, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 26059L)
    public static SubLObject cb_link_naut(final SubLObject naut, SubLObject linktext, SubLObject image_keyword) {
        if (linktext == cb_utilities.UNPROVIDED) {
            linktext = (SubLObject)cb_utilities.NIL;
        }
        if (image_keyword == cb_utilities.UNPROVIDED) {
            image_keyword = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == linktext) {
            linktext = (SubLObject)cb_utilities.$str153$_;
        }
        SubLObject handler = cb_utilities.$cb_default_naut_handler$.getDynamicValue(thread);
        final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue(thread);
        final SubLObject v_class = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)), format_nil.format_nil_a_no_copy(cb_nat_span_id(naut, (SubLObject)cb_utilities.UNPROVIDED)));
        cb_adornments.handle_adornments((SubLObject)cb_utilities.$kw159$NAUT, frame, naut, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        if (frame == cb_utilities.$kw76$TOP) {
            handler = Sequences.cconcatenate((SubLObject)cb_utilities.$str142$cb_start_, format_nil.format_nil_a_no_copy(cb_utilities.$cb_default_naut_handler$.getDynamicValue(thread)));
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str143$_a__a, handler, cb_naut_identifier(naut));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_utilities.$str88$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != v_class) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(v_class);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            if (cb_utilities.NIL != image_keyword) {
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
                final SubLObject align = (SubLObject)cb_utilities.$str154$absmiddle;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
                final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(linktext);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(linktext);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 26886L)
    public static SubLObject cb_naut_href(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject html = (SubLObject)cb_utilities.NIL;
        SubLObject stream = (SubLObject)cb_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                cb_link_naut(naut, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            html = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cb_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        final SubLObject start = number_utilities.f_1X(Sequences.position((SubLObject)Characters.CHAR_quotation, html, Symbols.symbol_function((SubLObject)cb_utilities.EQL), Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY), Sequences.search((SubLObject)cb_utilities.$str161$href, html, Symbols.symbol_function((SubLObject)cb_utilities.EQUAL), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED), (SubLObject)cb_utilities.UNPROVIDED));
        final SubLObject end = Sequences.position((SubLObject)Characters.CHAR_quotation, html, Symbols.symbol_function((SubLObject)cb_utilities.EQL), Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY), start, (SubLObject)cb_utilities.UNPROVIDED);
        return string_utilities.substring(html, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 27184L)
    public static SubLObject cb_link_lexicon(final SubLObject constant) {
        final SubLObject linktext = pph_main.generate_phrase(constant, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        return cb_link((SubLObject)cb_utilities.$kw141$CONSTANT, constant, linktext, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 27328L)
    public static SubLObject cb_link_unnamed(final SubLObject nart) {
        final SubLObject id = nart_handles.nart_id(nart);
        if (!id.isInteger()) {
            return html_utilities.html_princ((SubLObject)cb_utilities.$str164$_NART_);
        }
        final SubLObject linktext = Sequences.cconcatenate((SubLObject)cb_utilities.$str165$_NART_, new SubLObject[] { format_nil.format_nil_s_no_copy(id), cb_utilities.$str166$_ });
        return cb_link((SubLObject)cb_utilities.$kw150$NART, nart, linktext, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 27556L)
    public static SubLObject cb_link_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL != cb_parameters.$cb_assertion_link_hook$.getDynamicValue(thread)) {
            Functions.funcall(cb_parameters.$cb_assertion_link_hook$.getDynamicValue(thread), assertion);
        }
        SubLObject handler = (SubLObject)cb_utilities.$str169$cb_af;
        final SubLObject frame = cb_parameters.$cb_default_assertion_frame$.getDynamicValue(thread);
        SubLObject tooltip_text = (SubLObject)cb_utilities.NIL;
        if (frame == cb_utilities.$kw76$TOP) {
            handler = (SubLObject)cb_utilities.$str170$cb_start_cb_af;
        }
        if (cb_utilities.NIL != cb_parameters.$cb_more_assertion_marker_image_text$.getDynamicValue(thread)) {
            tooltip_text = html_assertion_marker_tooltip_text(assertion);
        }
        cb_link_method_assertion_internal(assertion, handler, frame, tooltip_text);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 28072L)
    public static SubLObject cb_link_method_assertion_internal(final SubLObject assertion, final SubLObject handler, final SubLObject frame, final SubLObject tooltip_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_id = assertion_handles.assertion_id(assertion);
        final SubLObject editability = (cb_utilities.NIL != assertions_high.asserted_assertionP(assertion) && cb_utilities.NIL != cb_assertion_editor.assertion_modification_permittedP(assertion)) ? cb_html_parameters.$cb_html_edit_class$.getDynamicValue(thread) : ((cb_utilities.NIL != cb_assertion_editor.assertion_modification_permittedP(assertion)) ? cb_html_parameters.$cb_html_no_edit_class$.getDynamicValue(thread) : cb_html_parameters.$cb_html_no_modification_class$.getDynamicValue(thread));
        final SubLObject rule_class = (SubLObject)((cb_utilities.NIL != assertions_high.rule_assertionP(assertion)) ? cb_html_parameters.$cb_html_rule_class$.getDynamicValue(thread) : cb_utilities.$str88$);
        final SubLObject v_class = Sequences.cconcatenate(cb_html_parameters.$cb_html_assert_class$.getDynamicValue(thread), new SubLObject[] { editability, rule_class });
        final SubLObject clean_tooltip = (SubLObject)((cb_utilities.NIL != tooltip_text) ? html_utilities.html_escape(tooltip_text, (SubLObject)cb_utilities.T) : cb_utilities.NIL);
        final SubLObject elt_id = (SubLObject)((cb_utilities.NIL != html_macros.next_html_id_definedP((SubLObject)cb_utilities.UNPROVIDED)) ? html_macros.next_html_id((SubLObject)cb_utilities.UNPROVIDED) : cb_utilities.$str88$);
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str143$_a__a, handler, assertion_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != clean_tooltip) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(clean_tooltip);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != v_class) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(v_class);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_markup((SubLObject)cb_utilities.$str173$_cycid_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(assertion_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_utilities.$str174$_id_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(elt_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_assertion_marker(assertion, (SubLObject)cb_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        cb_adornments.handle_adornments((SubLObject)cb_utilities.$kw171$ASSERTION, frame, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29402L)
    public static SubLObject cb_assertion_utility_color(final SubLObject assertion) {
        if (cb_utilities.NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject utility = inference_analysis.transformation_rule_historical_utility(assertion);
            if (utility.numLE((SubLObject)cb_utilities.$int175$_30)) {
                return html_saturated_red_color(Numbers.minus(utility), (SubLObject)cb_utilities.$int176$100);
            }
            if (utility.numGE((SubLObject)cb_utilities.$int38$30)) {
                return html_saturated_green_color(utility, (SubLObject)cb_utilities.$int176$100);
            }
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
    public static SubLObject clear_html_saturated_red_color() {
        final SubLObject cs = cb_utilities.$html_saturated_red_color_caching_state$.getGlobalValue();
        if (cb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
    public static SubLObject remove_html_saturated_red_color(final SubLObject value, SubLObject max) {
        if (max == cb_utilities.UNPROVIDED) {
            max = (SubLObject)cb_utilities.$int177$256;
        }
        return memoization_state.caching_state_remove_function_results_with_args(cb_utilities.$html_saturated_red_color_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(value, max), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
    public static SubLObject html_saturated_red_color_internal(final SubLObject value, final SubLObject max) {
        final SubLObject red_level = Numbers.min((SubLObject)cb_utilities.$int179$255, Numbers.integerDivide(Numbers.multiply((SubLObject)cb_utilities.$int177$256, value), max));
        final SubLObject color = PrintLow.format((SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.$str180$_C_C0000, string_utilities.hex_char(Numbers.integerDivide(red_level, (SubLObject)cb_utilities.SIXTEEN_INTEGER)), string_utilities.hex_char(Numbers.mod(red_level, (SubLObject)cb_utilities.SIXTEEN_INTEGER)));
        return color;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 29743L)
    public static SubLObject html_saturated_red_color(final SubLObject value, SubLObject max) {
        if (max == cb_utilities.UNPROVIDED) {
            max = (SubLObject)cb_utilities.$int177$256;
        }
        SubLObject caching_state = cb_utilities.$html_saturated_red_color_caching_state$.getGlobalValue();
        if (cb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_utilities.$sym178$HTML_SATURATED_RED_COLOR, (SubLObject)cb_utilities.$sym181$_HTML_SATURATED_RED_COLOR_CACHING_STATE_, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.EQUAL, (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)cb_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(value, max);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cb_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cb_utilities.NIL;
            collision = cdolist_list_var.first();
            while (cb_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (value.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cb_utilities.NIL != cached_args && cb_utilities.NIL == cached_args.rest() && max.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(html_saturated_red_color_internal(value, max)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(value, max));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
    public static SubLObject clear_html_saturated_green_color() {
        final SubLObject cs = cb_utilities.$html_saturated_green_color_caching_state$.getGlobalValue();
        if (cb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
    public static SubLObject remove_html_saturated_green_color(final SubLObject value, SubLObject max) {
        if (max == cb_utilities.UNPROVIDED) {
            max = (SubLObject)cb_utilities.$int177$256;
        }
        return memoization_state.caching_state_remove_function_results_with_args(cb_utilities.$html_saturated_green_color_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(value, max), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
    public static SubLObject html_saturated_green_color_internal(final SubLObject value, final SubLObject max) {
        final SubLObject green_level = Numbers.min((SubLObject)cb_utilities.$int179$255, Numbers.integerDivide(Numbers.multiply((SubLObject)cb_utilities.$int177$256, value), max));
        final SubLObject color = PrintLow.format((SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.$str183$00_C_C00, string_utilities.hex_char(Numbers.integerDivide(green_level, (SubLObject)cb_utilities.SIXTEEN_INTEGER)), string_utilities.hex_char(Numbers.mod(green_level, (SubLObject)cb_utilities.SIXTEEN_INTEGER)));
        return color;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30004L)
    public static SubLObject html_saturated_green_color(final SubLObject value, SubLObject max) {
        if (max == cb_utilities.UNPROVIDED) {
            max = (SubLObject)cb_utilities.$int177$256;
        }
        SubLObject caching_state = cb_utilities.$html_saturated_green_color_caching_state$.getGlobalValue();
        if (cb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_utilities.$sym182$HTML_SATURATED_GREEN_COLOR, (SubLObject)cb_utilities.$sym184$_HTML_SATURATED_GREEN_COLOR_CACHING_STATE_, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.EQUAL, (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)cb_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(value, max);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cb_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cb_utilities.NIL;
            collision = cdolist_list_var.first();
            while (cb_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (value.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cb_utilities.NIL != cached_args && cb_utilities.NIL == cached_args.rest() && max.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(html_saturated_green_color_internal(value, max)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(value, max));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 30983L)
    public static SubLObject cb_assertion_ball(final SubLObject assertion, SubLObject align) {
        if (align == cb_utilities.UNPROVIDED) {
            align = (SubLObject)cb_utilities.$kw76$TOP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL != cb_parameters.$cb_assertion_link_hook$.getDynamicValue(thread)) {
            Functions.funcall(cb_parameters.$cb_assertion_link_hook$.getDynamicValue(thread), assertion);
        }
        SubLObject handler = (SubLObject)cb_utilities.$str169$cb_af;
        final SubLObject frame = cb_parameters.$cb_default_assertion_frame$.getDynamicValue(thread);
        SubLObject tooltip_text = (SubLObject)cb_utilities.NIL;
        if (frame == cb_utilities.$kw76$TOP) {
            handler = (SubLObject)cb_utilities.$str170$cb_start_cb_af;
        }
        if (cb_utilities.NIL != cb_parameters.$cb_more_assertion_marker_image_text$.getDynamicValue(thread)) {
            tooltip_text = html_assertion_marker_tooltip_text(assertion);
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str143$_a__a, handler, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != tooltip_text) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(tooltip_text);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_assertion_marker(assertion, align);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 31649L)
    public static SubLObject assertion_marker(final SubLObject assertion) {
        SubLObject marker_type = (SubLObject)cb_utilities.NIL;
        if (cb_utilities.NIL != assertions_high.code_assertionP(assertion)) {
            marker_type = (SubLObject)cb_utilities.$kw35$CODE;
        }
        else if (cb_utilities.NIL != assertions_high.rule_assertionP(assertion)) {
            if (cb_utilities.NIL != assertions_high.forward_assertionP(assertion)) {
                marker_type = (SubLObject)cb_utilities.$kw31$FORWARD;
            }
            else {
                marker_type = (SubLObject)cb_utilities.$kw33$BACKWARD;
            }
        }
        else if (cb_utilities.NIL != assertions_high.backward_assertionP(assertion)) {
            marker_type = (SubLObject)cb_utilities.$kw205$BACKWARD_GAF;
        }
        else if (cb_utilities.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)cb_utilities.$kw22$FALSE)) {
            marker_type = (SubLObject)cb_utilities.$kw22$FALSE;
        }
        else if (cb_utilities.$kw24$UNKNOWN == assertions_high.assertion_truth(assertion)) {
            marker_type = (SubLObject)cb_utilities.$kw24$UNKNOWN;
        }
        else if (cb_utilities.NIL == assertions_high.asserted_assertionP(assertion)) {
            marker_type = (SubLObject)cb_utilities.$kw189$DERIVED;
        }
        else if (cb_utilities.NIL == list_utilities.singletonP(assertions_high.assertion_arguments(assertion))) {
            marker_type = (SubLObject)cb_utilities.$kw196$REDUNDANT;
        }
        else if (assertions_high.assertion_strength(assertion) == cb_utilities.$kw29$MONOTONIC) {
            marker_type = (SubLObject)cb_utilities.$kw29$MONOTONIC;
        }
        else {
            marker_type = (SubLObject)cb_utilities.$kw27$DEFAULT;
        }
        return marker_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 32537L)
    public static SubLObject html_assertion_marker(final SubLObject assertion, SubLObject align) {
        if (align == cb_utilities.UNPROVIDED) {
            align = (SubLObject)cb_utilities.$kw76$TOP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject marker_type = assertion_marker(assertion);
        if (cb_utilities.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(marker_type);
            final SubLObject align_$25 = (SubLObject)((cb_utilities.NIL != align) ? align : cb_utilities.$kw76$TOP);
            final SubLObject alt = (SubLObject)cb_utilities.$str88$;
            final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            if (cb_utilities.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            if (cb_utilities.NIL != align_$25) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align_$25));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            if (cb_utilities.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        else {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(marker_type);
            final SubLObject align_$26 = (SubLObject)((cb_utilities.NIL != align) ? align : cb_utilities.$kw76$TOP);
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(marker_type);
            final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            if (cb_utilities.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            if (cb_utilities.NIL != align_$26) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align_$26));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            if (cb_utilities.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 32830L)
    public static SubLObject html_assertion_marker_tooltip_text(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = assertions_high.asserted_by(assertion);
        final SubLObject date = assertions_high.asserted_when(assertion);
        final SubLObject purpose = assertions_high.asserted_why(assertion);
        final SubLObject second = assertions_high.asserted_second(assertion);
        final SubLObject assertedP = assertions_high.asserted_assertionP(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject ruleP = assertions_high.rule_assertionP(assertion);
        final SubLObject forwardP = assertions_high.forward_assertionP(assertion);
        final SubLObject monotonicP = Equality.eq(assertions_high.assertion_strength(assertion), (SubLObject)cb_utilities.$kw29$MONOTONIC);
        SubLObject tooltip_text_list = (SubLObject)cb_utilities.NIL;
        if (cb_utilities.NIL != monotonicP) {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str208$_monotonic, tooltip_text_list);
        }
        if (cb_utilities.NIL != forwardP) {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str209$_forward, tooltip_text_list);
        }
        else {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str210$_backward, tooltip_text_list);
        }
        if (cb_utilities.NIL != ruleP) {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str211$_rule, tooltip_text_list);
        }
        else {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str212$_GAF, tooltip_text_list);
        }
        if (cb_utilities.NIL != assertedP) {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str213$_asserted_locally_in_, tooltip_text_list);
            tooltip_text_list = (SubLObject)ConsesLow.cons(cb_term_display_string(mt), tooltip_text_list);
            if (cb_utilities.NIL != forts.valid_fortP(cyclist)) {
                tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str214$_by_, tooltip_text_list);
                tooltip_text_list = (SubLObject)ConsesLow.cons((cb_utilities.NIL != kb_control_vars.lexicon_kb_loaded_p()) ? generate_phrase_for_cyclist(cyclist) : constants_high.constant_name(cyclist), tooltip_text_list);
                if (cb_utilities.NIL != date) {
                    tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str215$_on_, tooltip_text_list);
                    thread.resetMultipleValues();
                    final SubLObject day = numeric_date_utilities.decode_universal_date(date);
                    SubLObject month = thread.secondMultipleValue();
                    final SubLObject year = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    month = numeric_date_utilities.abbreviation_for_month_number(month);
                    tooltip_text_list = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(month), new SubLObject[] { cb_utilities.$str216$_, format_nil.format_nil_a_no_copy(day), cb_utilities.$str217$__, format_nil.format_nil_a_no_copy(year) }), tooltip_text_list);
                }
                if (cb_utilities.NIL != second) {
                    tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str218$_at_, tooltip_text_list);
                    tooltip_text_list = (SubLObject)ConsesLow.cons(numeric_date_utilities.secondstring(second), tooltip_text_list);
                }
                if (cb_utilities.NIL != forts.valid_fortP(purpose)) {
                    tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str219$_for_, tooltip_text_list);
                    tooltip_text_list = (SubLObject)ConsesLow.cons(constants_high.constant_name(purpose), tooltip_text_list);
                }
                if (cb_utilities.NIL != assertions_high.deduced_assertionP(assertion)) {
                    tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str220$_and_inferred_by_Cyc, tooltip_text_list);
                }
            }
        }
        else {
            tooltip_text_list = (SubLObject)ConsesLow.cons((SubLObject)cb_utilities.$str221$_inferred_in_, tooltip_text_list);
            tooltip_text_list = (SubLObject)ConsesLow.cons(cb_term_display_string(mt), tooltip_text_list);
        }
        return string_utilities.upcase_leading(string_utilities.trim_whitespace(Functions.apply(Symbols.symbol_function((SubLObject)cb_utilities.$sym222$CCONCATENATE), unicode_nauts.convert_unicode_nauts_to_utf8_strings(Sequences.nreverse(tooltip_text_list)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
    public static SubLObject clear_generate_phrase_for_cyclist() {
        final SubLObject cs = cb_utilities.$generate_phrase_for_cyclist_caching_state$.getGlobalValue();
        if (cb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
    public static SubLObject remove_generate_phrase_for_cyclist(final SubLObject cyclist) {
        return memoization_state.caching_state_remove_function_results_with_args(cb_utilities.$generate_phrase_for_cyclist_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cyclist), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
    public static SubLObject generate_phrase_for_cyclist_internal(final SubLObject cyclist) {
        return pph_main.generate_phrase(cyclist, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34820L)
    public static SubLObject generate_phrase_for_cyclist(final SubLObject cyclist) {
        SubLObject caching_state = cb_utilities.$generate_phrase_for_cyclist_caching_state$.getGlobalValue();
        if (cb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_utilities.$sym223$GENERATE_PHRASE_FOR_CYCLIST, (SubLObject)cb_utilities.$sym224$_GENERATE_PHRASE_FOR_CYCLIST_CACHING_STATE_, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.EQUAL, (SubLObject)cb_utilities.ONE_INTEGER, (SubLObject)cb_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)cb_utilities.$sym225$CLEAR_GENERATE_PHRASE_FOR_CYCLIST);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_phrase_for_cyclist_internal(cyclist)));
            memoization_state.caching_state_put(caching_state, cyclist, results, (SubLObject)cb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 34979L)
    public static SubLObject cb_link_sentence(final SubLObject sentence, SubLObject justifyP) {
        if (justifyP == cb_utilities.UNPROVIDED) {
            justifyP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject handler = (SubLObject)cb_utilities.$str226$cb_sentence;
        final SubLObject frame = cb_parameters.$cb_default_assertion_frame$.getDynamicValue(thread);
        if (frame == cb_utilities.$kw76$TOP) {
            handler = (SubLObject)cb_utilities.$str227$cb_start_cb_sentence;
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)((cb_utilities.NIL != justifyP) ? cb_utilities.$str228$_a__a_t : cb_utilities.$str143$_a__a), handler, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_sentence_marker(sentence);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 35429L)
    public static SubLObject html_sentence_marker(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_utilities.$kw231$SENTENCE_MARKER);
        final SubLObject align = (SubLObject)cb_utilities.$kw76$TOP;
        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_utilities.$kw231$SENTENCE_MARKER);
        final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 35674L)
    public static SubLObject cb_determine_help_target(SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == target) {
            if (cb_utilities.NIL != cb_parameters.$cb_separate_doc_frame$.getDynamicValue(thread)) {
                target = (SubLObject)cb_utilities.$kw100$DOC;
            }
            else {
                target = (SubLObject)cb_utilities.$kw85$MAIN;
            }
        }
        return target;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 35839L)
    public static SubLObject cb_help(final SubLObject help_keyword, SubLObject target, SubLObject desc_override) {
        if (target == cb_utilities.UNPROVIDED) {
            target = (SubLObject)cb_utilities.NIL;
        }
        if (desc_override == cb_utilities.UNPROVIDED) {
            desc_override = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL != cb_parameters.$cb_include_help$.getDynamicValue(thread)) {
            final SubLObject target_var = cb_determine_help_target(target);
            final SubLObject frame_name = cb_frame_name(target_var);
            final SubLObject help_file_path = cyc_file_dependencies.cb_help_file_path(help_keyword);
            final SubLObject desc_string = (cb_utilities.NIL != desc_override) ? desc_override : cyc_file_dependencies.cb_get_help_desc_string(help_keyword);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(help_file_path);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            if (cb_utilities.NIL != frame_name) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(frame_name);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_utilities.$kw234$HELP);
                final SubLObject align = (SubLObject)cb_utilities.$kw76$TOP;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_utilities.$kw234$HELP);
                final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                if (cb_utilities.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 36365L)
    public static SubLObject cb_help_preamble(final SubLObject help, SubLObject back_target, SubLObject message) {
        if (back_target == cb_utilities.UNPROVIDED) {
            back_target = (SubLObject)cb_utilities.$kw7$SELF;
        }
        if (message == cb_utilities.UNPROVIDED) {
            message = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL != cb_parameters.$cb_include_help$.getDynamicValue(thread)) {
            if (help.isKeyword()) {
                cb_help(help, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
            else {
                Errors.warn((SubLObject)cb_utilities.$str237$Use_of_unsupported_legacy_help_sy, help);
            }
            html_utilities.html_indent((SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != message) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(message);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37109L)
    public static SubLObject cb_form(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject method_function = Structures.method_func(v_object, cb_utilities.$cb_form_method_table$.getGlobalValue());
        if (cb_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object, depth, wrap_axiomsP);
        }
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        if (cb_utilities.NIL != subl_promotions.memberP(v_object, cb_utilities.$rule_unlabelled_dont_care_variables$.getDynamicValue(thread), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)) {
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.$str238$dont_care);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_prin1(v_object);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_prin1(v_object);
        }
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37466L)
    public static SubLObject cb_form_variable_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        final SubLObject v_class = (SubLObject)((cb_utilities.NIL != subl_promotions.memberP(v_object, cb_utilities.$rule_unlabelled_dont_care_variables$.getDynamicValue(thread), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)) ? cb_utilities.$str239$hl_var_dont_care : cb_utilities.$str240$hl_var);
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (cb_utilities.NIL != v_class) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(v_class);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_prin1(v_object);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 37788L)
    public static SubLObject cb_form_symbol_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        if (cb_utilities.NIL != cycl_grammar.el_variable_p(v_object)) {
            final SubLObject v_class = (SubLObject)((cb_utilities.NIL != subl_promotions.memberP(v_object, cb_utilities.$rule_unlabelled_dont_care_variables$.getDynamicValue(thread), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)) ? cb_utilities.$str242$el_var_dont_care : cb_utilities.$str243$el_var);
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (cb_utilities.NIL != v_class) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(v_class);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_prin1(v_object);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        else if (v_object.isKeyword()) {
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.$str244$keyword);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_prin1(v_object);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.$str245$symbol);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_prin1(v_object);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 38350L)
    public static SubLObject cb_form_constant_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        cb_link((SubLObject)cb_utilities.$kw141$CONSTANT, v_object, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 38508L)
    public static SubLObject cb_form_nart_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == depth) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        final SubLObject nart_hl_formula = narts_high.nart_hl_formula(v_object);
        if (cb_utilities.NIL != nart_hl_formula) {
            final SubLObject _prev_bind_0 = cb_utilities.$cb_just_did_nat$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cb_utilities.$cb_term_id$.currentBinding(thread);
            try {
                cb_utilities.$cb_just_did_nat$.bind(v_object, thread);
                cb_utilities.$cb_term_id$.bind((SubLObject)((cb_utilities.NIL != html_macros.next_html_id_definedP((SubLObject)cb_utilities.UNPROVIDED)) ? html_macros.next_html_id((SubLObject)cb_utilities.UNPROVIDED) : cb_utilities.NIL), thread);
                final SubLObject span_id = cb_nat_span_id(v_object, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != cb_utilities.$cb_term_id$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    if (cb_utilities.NIL != span_id) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(span_id);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    if (cb_utilities.NIL != cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        cb_form(nart_hl_formula, depth, wrap_axiomsP);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                else {
                    cb_form(nart_hl_formula, depth, wrap_axiomsP);
                }
            }
            finally {
                cb_utilities.$cb_term_id$.rebind(_prev_bind_2, thread);
                cb_utilities.$cb_just_did_nat$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cb_link((SubLObject)cb_utilities.$kw167$UNNAMED, v_object, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 39262L)
    public static SubLObject cb_form_assertion_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == depth) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (cb_utilities.NIL != cb_utilities.$allow_cb_assertion_for_the_assertion_sentence_replacementP$.getDynamicValue(thread) && cb_utilities.NIL != kb_utilities.kbeq(v_object, cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.getDynamicValue(thread))) {
            return cb_form(cb_utilities.$const250$TheAssertionSentence, depth, (SubLObject)cb_utilities.NIL);
        }
        if (cb_utilities.NIL != wrap_axiomsP) {
            if (!depth.numE((SubLObject)cb_utilities.ZERO_INTEGER)) {
                html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_indent(depth);
        }
        if (cb_utilities.NIL != assertions_high.valid_assertion(v_object, (SubLObject)cb_utilities.UNPROVIDED)) {
            cb_form_assertion_hl_formula(v_object, depth, wrap_axiomsP);
        }
        else {
            cb_form_invalid_assertion(v_object, depth, wrap_axiomsP);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 39859L)
    public static SubLObject cb_form_assertion_hl_formula(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$variable_names$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_utilities.$rule_unlabelled_dont_care_variables$.currentBinding(thread);
        try {
            control_vars.$variable_names$.bind(assertions_high.assertion_variable_names(assertion), thread);
            cb_utilities.$rule_unlabelled_dont_care_variables$.bind((SubLObject)((cb_utilities.NIL != assertions_high.rule_assertionP(assertion)) ? assertion_utilities.rule_unlabelled_dont_care_variables(assertion) : cb_utilities.NIL), thread);
            final SubLObject additional_class_string = (SubLObject)((cb_utilities.NIL != assertion_utilities.obsolete_ruleP(assertion)) ? cb_html_parameters.$cb_html_obsolete_class$.getDynamicValue(thread) : cb_utilities.$str88$);
            cb_form_assertion_formula(assertion, assertions_high.assertion_formula(assertion), depth, wrap_axiomsP, additional_class_string);
        }
        finally {
            cb_utilities.$rule_unlabelled_dont_care_variables$.rebind(_prev_bind_2, thread);
            control_vars.$variable_names$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 40368L)
    public static SubLObject cb_form_invalid_assertion(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        html_utilities.html_princ((SubLObject)cb_utilities.$str252$__INVALID_ASSERTION_);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 40547L)
    public static SubLObject cb_form_assertion_formula(final SubLObject assertion, final SubLObject formula, SubLObject depth, SubLObject wrap_axiomsP, SubLObject additional_class_string) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        if (additional_class_string == cb_utilities.UNPROVIDED) {
            additional_class_string = (SubLObject)cb_utilities.$str88$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = Sequences.cconcatenate(additional_class_string, cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread));
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (cb_utilities.NIL != v_class) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(v_class);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = cb_utilities.$cb_just_did_quote$.currentBinding(thread);
            try {
                cb_utilities.$cb_just_did_quote$.bind((SubLObject)cb_utilities.T, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
                final SubLObject _prev_bind_0_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    cb_form(formula, Numbers.add(depth, (SubLObject)cb_utilities.ONE_INTEGER), wrap_axiomsP);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$30, thread);
                }
            }
            finally {
                cb_utilities.$cb_just_did_quote$.rebind(_prev_bind_0_$29, thread);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41101L)
    public static SubLObject cb_form_assertion_edit_formula(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        return cb_form_assertion_formula(assertion, ke.ke_assertion_edit_formula(assertion), depth, wrap_axiomsP, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 41365L)
    public static SubLObject cb_form_string_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (cb_utilities.NIL != cb_html_parameters.$cb_html_string_class$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(cb_html_parameters.$cb_html_string_class$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            if (cb_utilities.NIL != wrap_axiomsP && cb_utilities.NIL != html_macros.$within_html_pre$.getDynamicValue(thread) && Sequences.length(v_object).numG(cb_utilities.$cb_string_length_wrap$.getDynamicValue(thread))) {
                html_macros.verify_within_html_pre();
                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                final SubLObject _prev_bind_0_$31 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.NIL, thread);
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_preserve_breaks$.currentBinding(thread);
                    try {
                        html_macros.$html_preserve_breaks$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_print_doc_string(v_object);
                    }
                    finally {
                        html_macros.$html_preserve_breaks$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0_$31, thread);
                }
                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            }
            else {
                html_utilities.html_print_doc_string(v_object);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42682L)
    public static SubLObject print_cb_form_cons_methods(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL != print_high.$print_level$.getDynamicValue(thread) && depth.numG(print_high.$print_level$.getDynamicValue(thread))) {
            print_high.princ((SubLObject)cb_utilities.$str47$_, stream);
        }
        else if (cb_utilities.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.T);
            print_high.princ(cb_form_cons_method_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject cb_form_cons_method_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cb_form_cons_methods(v_object, stream, (SubLObject)cb_utilities.ZERO_INTEGER);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject cb_form_cons_method_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cb_form_cons_method_native.class) ? cb_utilities.T : cb_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject cb_form_cons_method_name(final SubLObject v_object) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject cb_form_cons_method_keyword(final SubLObject v_object) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject cb_form_cons_method_applicability_test_fn(final SubLObject v_object) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject cb_form_cons_method_html_output_fn(final SubLObject v_object) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject _csetf_cb_form_cons_method_name(final SubLObject v_object, final SubLObject value) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject _csetf_cb_form_cons_method_keyword(final SubLObject v_object, final SubLObject value) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject _csetf_cb_form_cons_method_applicability_test_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject _csetf_cb_form_cons_method_html_output_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_utilities.NIL != cb_form_cons_method_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject make_cb_form_cons_method(SubLObject arglist) {
        if (arglist == cb_utilities.UNPROVIDED) {
            arglist = (SubLObject)cb_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cb_form_cons_method_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_utilities.NIL, next = arglist; cb_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_utilities.$kw275$NAME)) {
                _csetf_cb_form_cons_method_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.$kw276$KEYWORD)) {
                _csetf_cb_form_cons_method_keyword(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.$kw277$APPLICABILITY_TEST_FN)) {
                _csetf_cb_form_cons_method_applicability_test_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.$kw278$HTML_OUTPUT_FN)) {
                _csetf_cb_form_cons_method_html_output_fn(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_utilities.$str279$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject visit_defstruct_cb_form_cons_method(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_utilities.$kw280$BEGIN, (SubLObject)cb_utilities.$sym281$MAKE_CB_FORM_CONS_METHOD, (SubLObject)cb_utilities.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_utilities.$kw282$SLOT, (SubLObject)cb_utilities.$kw275$NAME, cb_form_cons_method_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_utilities.$kw282$SLOT, (SubLObject)cb_utilities.$kw276$KEYWORD, cb_form_cons_method_keyword(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_utilities.$kw282$SLOT, (SubLObject)cb_utilities.$kw277$APPLICABILITY_TEST_FN, cb_form_cons_method_applicability_test_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_utilities.$kw282$SLOT, (SubLObject)cb_utilities.$kw278$HTML_OUTPUT_FN, cb_form_cons_method_html_output_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_utilities.$kw283$END, (SubLObject)cb_utilities.$sym281$MAKE_CB_FORM_CONS_METHOD, (SubLObject)cb_utilities.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 42958L)
    public static SubLObject visit_defstruct_object_cb_form_cons_method_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_form_cons_method(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43099L)
    public static SubLObject defcb_form_cons_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_utilities.$list285);
        name = current.first();
        final SubLObject arglist;
        current = (arglist = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym286$REGISTER_CB_FORM_CONS_METHOD, (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym287$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym287$QUOTE, arglist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43256L)
    public static SubLObject register_cb_form_cons_method(final SubLObject name, final SubLObject arglist) {
        final SubLObject new_cb_form_cons_method = make_cb_form_cons_method(arglist);
        _csetf_cb_form_cons_method_name(new_cb_form_cons_method, name);
        Hashtables.sethash(cb_form_cons_method_keyword(new_cb_form_cons_method), cb_utilities.$cb_form_cons_methods_by_keyword$.getGlobalValue(), new_cb_form_cons_method);
        cb_utilities.$cb_form_cons_methods$.setGlobalValue((SubLObject)ConsesLow.cons(new_cb_form_cons_method, Sequences.delete(name, cb_utilities.$cb_form_cons_methods$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.EQUAL), Symbols.symbol_function((SubLObject)cb_utilities.$sym267$CB_FORM_CONS_METHOD_NAME), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)));
        return new_cb_form_cons_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43802L)
    public static SubLObject with_cb_form_cons_methods(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_utilities.$list289);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_keywords = (SubLObject)cb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_utilities.$list289);
        method_keywords = current.first();
        current = current.rest();
        if (cb_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_utilities.$sym290$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym291$_CB_FORM_CONS_METHODS_ACTIVE_, (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, method_keywords))), ConsesLow.append(body, (SubLObject)cb_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_utilities.$list289);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 43995L)
    public static SubLObject compute_cb_form_cons_methods_active(final SubLObject method_keywords) {
        SubLObject v_methods = (SubLObject)cb_utilities.NIL;
        SubLObject cdolist_list_var = method_keywords;
        SubLObject method_keyword = (SubLObject)cb_utilities.NIL;
        method_keyword = cdolist_list_var.first();
        while (cb_utilities.NIL != cdolist_list_var) {
            final SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method(method_keyword);
            if (cb_utilities.NIL != method) {
                v_methods = (SubLObject)ConsesLow.cons(method, v_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method_keyword = cdolist_list_var.first();
        }
        return v_methods;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44332L)
    public static SubLObject cb_form_cons_methods_active() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ConsesLow.append(cb_utilities.$cb_form_cons_methods_active$.getDynamicValue(thread), always_active_cb_form_cons_methods());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44654L)
    public static SubLObject declare_cb_form_cons_method_always_active(final SubLObject method_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method(method_keyword);
        if (cb_utilities.NIL != method) {
            cb_utilities.$always_active_cb_form_cons_methods$.setDynamicValue((SubLObject)ConsesLow.cons(method, cb_utilities.$always_active_cb_form_cons_methods$.getDynamicValue(thread)), thread);
        }
        return cb_utilities.$always_active_cb_form_cons_methods$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 44940L)
    public static SubLObject always_active_cb_form_cons_methods() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_utilities.$always_active_cb_form_cons_methods$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 45041L)
    public static SubLObject cb_form_cons_method_keyword_to_cb_form_cons_method(final SubLObject keyword) {
        return Hashtables.gethash(keyword, cb_utilities.$cb_form_cons_methods_by_keyword$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 45180L)
    public static SubLObject top_level_cb_form_url(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject base_url = Sequences.cconcatenate(http_kernel.http_server_cgi_base_url(), (SubLObject)cb_utilities.$str294$cg_cb_start_);
        final SubLObject fortified_term = narts_high.nart_substitute(v_term);
        final SubLObject fortP = forts.fort_p(fortified_term);
        final SubLObject handler = (cb_utilities.NIL != fortP) ? cb_utilities.$cb_default_fort_handler$.getDynamicValue(thread) : cb_utilities.$cb_default_naut_handler$.getDynamicValue(thread);
        final SubLObject term_identifier = (cb_utilities.NIL != fortP) ? cb_fort_identifier(fortified_term) : cb_naut_identifier(fortified_term);
        return Sequences.cconcatenate(base_url, new SubLObject[] { handler, cb_utilities.$str90$_, term_identifier });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 45823L)
    public static SubLObject cb_form_string(final SubLObject obj, SubLObject url_type) {
        if (url_type == cb_utilities.UNPROVIDED) {
            url_type = (SubLObject)cb_utilities.$kw295$RELATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cb_form_string = (SubLObject)cb_utilities.NIL;
        final SubLObject _prev_bind_0 = cb_parameters.$cb_form_url_prefix_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_parameters.$cb_default_term_frame$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cb_parameters.$cb_default_assertion_frame$.currentBinding(thread);
        try {
            cb_parameters.$cb_form_url_prefix_print$.bind(get_url_prefix_for_url_type(url_type), thread);
            cb_parameters.$cb_default_term_frame$.bind((SubLObject)cb_utilities.$str97$_blank, thread);
            cb_parameters.$cb_default_assertion_frame$.bind((SubLObject)cb_utilities.$str97$_blank, thread);
            SubLObject stream = (SubLObject)cb_utilities.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0_$33 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_form(obj, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0_$33, thread);
                }
                cb_form_string = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)cb_utilities.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
            return cb_form_string;
        }
        finally {
            cb_parameters.$cb_default_assertion_frame$.rebind(_prev_bind_3, thread);
            cb_parameters.$cb_default_term_frame$.rebind(_prev_bind_2, thread);
            cb_parameters.$cb_form_url_prefix_print$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 46427L)
    public static SubLObject get_url_prefix_for_url_type(final SubLObject url_type) {
        if (url_type.eql((SubLObject)cb_utilities.$kw295$RELATIVE)) {
            return (SubLObject)cb_utilities.$sym296$CYC_CGI_RELATIVE_URL;
        }
        if (url_type.eql((SubLObject)cb_utilities.$kw297$KEA)) {
            return (SubLObject)cb_utilities.$sym298$CYC_CGI_KEA_URL;
        }
        if (url_type.eql((SubLObject)cb_utilities.$kw299$CB)) {
            return (SubLObject)cb_utilities.$sym300$CYC_CGI_ABSOLUTE_CB_FRAMED_URL;
        }
        return (SubLObject)cb_utilities.$sym296$CYC_CGI_RELATIVE_URL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47306L)
    public static SubLObject cb_formula_argument_limit_exceededP(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL != cb_utilities.$cb_formula_argument_limit$.getDynamicValue(thread)) {
            return Numbers.numG(argnum, cb_utilities.$cb_formula_argument_limit$.getDynamicValue(thread));
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47456L)
    public static SubLObject cb_form_cons_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.NIL;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (cb_utilities.NIL != cb_html_parameters.$cb_html_cons_class$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(cb_html_parameters.$cb_html_cons_class$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            cb_form_cons_internal(v_object, depth, wrap_axiomsP);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 47645L)
    public static SubLObject cb_form_cons_internal(SubLObject v_object, SubLObject depth, final SubLObject wrap_axiomsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == depth) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (cb_utilities.NIL != term.closed_nautP(v_object, (SubLObject)cb_utilities.UNPROVIDED) && !v_object.equal(cb_utilities.$cb_just_did_naut$.getDynamicValue(thread))) {
            final SubLObject _prev_bind_0 = cb_utilities.$cb_inside_naut$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cb_utilities.$cb_inside_quoteP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cb_utilities.$cb_just_did_naut$.currentBinding(thread);
            final SubLObject _prev_bind_4 = cb_utilities.$cb_term_id$.currentBinding(thread);
            try {
                cb_utilities.$cb_inside_naut$.bind(cb_utilities.$cb_inside_naut$.getDynamicValue(thread), thread);
                cb_utilities.$cb_inside_quoteP$.bind((SubLObject)((cb_utilities.NIL != cycl_grammar.fast_cycl_quoted_term_p(v_object)) ? cb_utilities.T : ((cb_utilities.NIL != cycl_grammar.fast_escape_quote_term_p(v_object)) ? cb_utilities.NIL : cb_utilities.$cb_inside_quoteP$.getDynamicValue(thread))), thread);
                cb_utilities.$cb_just_did_naut$.bind(v_object, thread);
                cb_utilities.$cb_term_id$.bind((SubLObject)((cb_utilities.NIL != html_macros.next_html_id_definedP((SubLObject)cb_utilities.UNPROVIDED)) ? html_macros.next_html_id((SubLObject)cb_utilities.UNPROVIDED) : cb_utilities.NIL), thread);
                final SubLObject span_id = cb_nat_span_id(v_object, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != cb_utilities.$cb_term_id$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    if (cb_utilities.NIL != span_id) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(span_id);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    if (cb_utilities.NIL != cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        cb_form_cons_internal(v_object, depth, wrap_axiomsP);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                else {
                    cb_form_cons_internal(v_object, depth, wrap_axiomsP);
                }
            }
            finally {
                cb_utilities.$cb_term_id$.rebind(_prev_bind_4, thread);
                cb_utilities.$cb_just_did_naut$.rebind(_prev_bind_3, thread);
                cb_utilities.$cb_inside_quoteP$.rebind(_prev_bind_2, thread);
                cb_utilities.$cb_inside_naut$.rebind(_prev_bind_0, thread);
            }
        }
        else if (v_object.first().eql((SubLObject)cb_utilities.$sym287$QUOTE)) {
            if (cb_utilities.NIL != wrap_axiomsP && !conses_high.second(v_object).isAtom()) {
                html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_indent(depth);
            }
            html_utilities.html_princ((SubLObject)cb_utilities.$str302$_);
            final SubLObject _prev_bind_0 = cb_utilities.$cb_just_did_quote$.currentBinding(thread);
            try {
                cb_utilities.$cb_just_did_quote$.bind((SubLObject)cb_utilities.T, thread);
                cb_form(conses_high.second(v_object), depth, wrap_axiomsP);
            }
            finally {
                cb_utilities.$cb_just_did_quote$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = cb_utilities.$cb_inside_naut$.currentBinding(thread);
            try {
                cb_utilities.$cb_inside_naut$.bind(cb_utilities.$cb_inside_naut$.getDynamicValue(thread), thread);
                SubLObject used_cb_form_cons_methodP = (SubLObject)cb_utilities.NIL;
                SubLObject close_paren_is_for_nartP = (SubLObject)cb_utilities.NIL;
                if (cb_utilities.NIL == used_cb_form_cons_methodP) {
                    SubLObject csome_list_var = cb_form_cons_methods_active();
                    SubLObject cb_form_cons_method = (SubLObject)cb_utilities.NIL;
                    cb_form_cons_method = csome_list_var.first();
                    while (cb_utilities.NIL == used_cb_form_cons_methodP && cb_utilities.NIL != csome_list_var) {
                        final SubLObject cb_form_cons_method_applicability_test_fn = cb_form_cons_method_applicability_test_fn(cb_form_cons_method);
                        final SubLObject cb_form_cons_method_html_output_fn = cb_form_cons_method_html_output_fn(cb_form_cons_method);
                        if (cb_form_cons_method_applicability_test_fn.isFunctionSpec() && cb_utilities.NIL != Functions.funcall(cb_form_cons_method_applicability_test_fn, v_object) && cb_form_cons_method_html_output_fn.isFunctionSpec()) {
                            Functions.funcall(cb_form_cons_method_html_output_fn, v_object, depth, wrap_axiomsP);
                            used_cb_form_cons_methodP = (SubLObject)cb_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        cb_form_cons_method = csome_list_var.first();
                    }
                }
                if (cb_utilities.NIL == used_cb_form_cons_methodP) {
                    if (cb_utilities.NIL == cb_utilities.$cb_form_cons_suppress_newline$.getDynamicValue(thread) && cb_utilities.NIL != wrap_axiomsP && cb_utilities.NIL == cb_utilities.$cb_just_did_quote$.getDynamicValue(thread)) {
                        if (!depth.numE((SubLObject)cb_utilities.ZERO_INTEGER)) {
                            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
                        }
                        html_utilities.html_indent(depth);
                    }
                    cb_utilities.$cb_just_did_quote$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                    if (cb_utilities.NIL != cb_utilities.$cb_inside_naut$.getDynamicValue(thread) || cb_utilities.NIL != subl_promotions.memberP(v_object.first(), cb_utilities.$cb_form_suppress_naut_link_functions$.getDynamicValue(thread), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                            html_utilities.html_princ((SubLObject)cb_utilities.$str153$_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    else if (cb_utilities.NIL != cb_utilities.$cb_just_did_nat$.getDynamicValue(thread)) {
                        close_paren_is_for_nartP = (SubLObject)cb_utilities.T;
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        cb_link((SubLObject)cb_utilities.$kw150$NART, cb_utilities.$cb_just_did_nat$.getDynamicValue(thread), (SubLObject)cb_utilities.$str153$_, (SubLObject)cb_utilities.$kw150$NART, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        cb_utilities.$cb_inside_naut$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                        cb_utilities.$cb_just_did_nat$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                    }
                    else if (cb_utilities.NIL != cb_utilities.$cb_just_did_naut$.getDynamicValue(thread)) {
                        cb_link((SubLObject)cb_utilities.$kw159$NAUT, cb_utilities.$cb_just_did_naut$.getDynamicValue(thread), (SubLObject)cb_utilities.$str153$_, (SubLObject)cb_utilities.$kw148$NAT, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                        if (cb_utilities.NIL != cb_utilities.$cb_inside_naut_support_enabledP$.getDynamicValue(thread)) {
                            cb_utilities.$cb_inside_naut$.setDynamicValue((SubLObject)cb_utilities.T, thread);
                        }
                        cb_utilities.$cb_just_did_naut$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                            html_utilities.html_princ((SubLObject)cb_utilities.$str153$_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    SubLObject argnum = (SubLObject)cb_utilities.ZERO_INTEGER;
                    final SubLObject _prev_bind_0_$38 = cb_utilities.$cb_form_cons_suppress_newline$.currentBinding(thread);
                    try {
                        cb_utilities.$cb_form_cons_suppress_newline$.bind((SubLObject)cb_utilities.T, thread);
                        cb_form(v_object.first(), depth, wrap_axiomsP);
                        argnum = Numbers.add(argnum, (SubLObject)cb_utilities.ONE_INTEGER);
                    }
                    finally {
                        cb_utilities.$cb_form_cons_suppress_newline$.rebind(_prev_bind_0_$38, thread);
                    }
                    if (cb_utilities.NIL != cb_utilities.$cb_form_cons_suppress_newline$.getDynamicValue(thread)) {
                        cb_utilities.$cb_form_cons_suppress_newline$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                    }
                    if (cb_utilities.NIL != subl_promotions.memberP(v_object.first(), cb_utilities.$cb_wrap_after_arg_1$.getDynamicValue(thread), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)) {
                        cb_form_cons_inter_arg_space();
                        cb_form(conses_high.second(v_object), depth, (SubLObject)cb_utilities.NIL);
                        v_object = v_object.rest();
                        argnum = Numbers.add(argnum, (SubLObject)cb_utilities.ONE_INTEGER);
                    }
                    SubLObject rest;
                    for (rest = (SubLObject)cb_utilities.NIL, rest = v_object.rest(); cb_utilities.NIL == cb_formula_argument_limit_exceededP(argnum) && rest.isCons(); argnum = Numbers.add(argnum, (SubLObject)cb_utilities.ONE_INTEGER), rest = rest.rest()) {
                        cb_form_cons_inter_arg_space();
                        cb_form(rest.first(), Numbers.add(depth, (SubLObject)cb_utilities.ONE_INTEGER), wrap_axiomsP);
                    }
                    if (cb_utilities.NIL != cb_formula_argument_limit_exceededP(argnum)) {
                        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str303$____);
                    }
                    else if (cb_utilities.NIL != rest) {
                        html_utilities.html_princ((SubLObject)cb_utilities.$str304$___);
                        cb_form(rest, Numbers.add(depth, (SubLObject)cb_utilities.ONE_INTEGER), wrap_axiomsP);
                    }
                    if (cb_utilities.NIL != close_paren_is_for_nartP) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str305$font_weight_900);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                            html_utilities.html_princ((SubLObject)cb_utilities.$str306$_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_utilities.$str155$cycl);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                            html_utilities.html_princ((SubLObject)cb_utilities.$str306$_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                }
            }
            finally {
                cb_utilities.$cb_inside_naut$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 51504L)
    public static SubLObject cb_form_cons_inter_arg_space() {
        html_utilities.html_princ((SubLObject)cb_utilities.$str216$_);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52176L)
    public static SubLObject cb_date_to_optimize_for_displayP(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != cb_utilities.$cb_display_dates_as_stringsP$.getDynamicValue(thread) && cb_utilities.NIL == cb_utilities.$cb_inside_quoteP$.getDynamicValue(thread) && cb_utilities.NIL != date_utilities.simple_el_date_p(cons) && cb_utilities.NIL == date_utilities.el_date_year_p(cons));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52456L)
    public static SubLObject cb_show_date_optimized_for_display(final SubLObject simple_date, final SubLObject depth, final SubLObject wrap_axiomsP) {
        final SubLObject optimized_date = cb_optimize_date_for_display(simple_date);
        return cb_form(optimized_date, depth, wrap_axiomsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52675L)
    public static SubLObject cb_possibly_optimize_date_for_display(SubLObject date) {
        if (cb_utilities.NIL != cb_date_to_optimize_for_displayP(date)) {
            date = cb_optimize_date_for_display(date);
        }
        return date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 52856L)
    public static SubLObject cb_optimize_date_for_display(final SubLObject simple_date) {
        final SubLObject date_as_string = date_utilities.cyc_date_encode_string_internal((SubLObject)cb_utilities.$str313$DateFromStringFn_datetime, simple_date);
        return el_utilities.make_unary_formula(cb_utilities.$const314$DateFromStringFn, date_as_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 53738L)
    public static SubLObject cb_decimal_to_optimize_for_displayP(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != cb_utilities.$cb_display_decimals_as_decimalsP$.getDynamicValue(thread) && cb_utilities.NIL == cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread) && cb_utilities.NIL != kb_control_vars.fraction_kb_loaded_p() && cb_utilities.NIL != simple_el_decimal_p(cons));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 53950L)
    public static SubLObject cb_show_decimal_optimized_for_display(final SubLObject simple_decimal, final SubLObject depth, final SubLObject wrap_axiomsP) {
        final SubLObject optimized_decimal = cb_optimize_decimal_for_display(simple_decimal);
        return cb_link_naut(simple_decimal, string_utilities.to_string(optimized_decimal), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 54230L)
    public static SubLObject cb_optimize_decimal_for_display(final SubLObject simple_decimal) {
        return extended_numbers.extended_number_to_subl_real(simple_decimal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 54402L)
    public static SubLObject simple_el_decimal_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != el_utilities.el_formula_p(obj) && cb_utilities.NIL != el_utilities.groundP(obj, (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL != el_utilities.formula_arityE(obj, (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL != collection_defns.decimal_fractionP(obj, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55212L)
    public static SubLObject cb_fraction_to_optimize_for_displayP(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != cb_utilities.$cb_display_fractions_as_fractionsP$.getDynamicValue(thread) && cb_utilities.NIL == cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread) && cb_utilities.NIL != kb_control_vars.fraction_kb_loaded_p() && cb_utilities.NIL != collection_defns.fractionP(cons, (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL != el_utilities.groundP(cons, (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL == collection_defns.decimal_fractionP(cons, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55476L)
    public static SubLObject cb_show_fraction_optimized_for_display(final SubLObject fraction, final SubLObject depth, final SubLObject wrap_axiomsP) {
        final SubLObject linktext = optimized_html_for_fraction(fraction);
        cb_link_naut(fraction, linktext, (SubLObject)cb_utilities.UNPROVIDED);
        return fraction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 55716L)
    public static SubLObject optimized_html_for_fraction(final SubLObject fraction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject linktext = (SubLObject)cb_utilities.NIL;
        SubLObject stream = (SubLObject)cb_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (cb_utilities.NIL != collection_defns.mixed_fractionP(fraction, (SubLObject)cb_utilities.UNPROVIDED)) {
                    html_utilities.html_princ(cycl_utilities.nat_arg1(fraction, (SubLObject)cb_utilities.UNPROVIDED));
                    html_utilities.html_glyph((SubLObject)cb_utilities.$kw327$THIN_SPACE, (SubLObject)cb_utilities.UNPROVIDED);
                }
                else if (cb_utilities.NIL != collection_defns.negative_mixed_fractionP(fraction, (SubLObject)cb_utilities.UNPROVIDED)) {
                    html_utilities.html_glyph((SubLObject)cb_utilities.$kw328$MINUS, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_princ(cycl_utilities.nat_arg1(fraction, (SubLObject)cb_utilities.UNPROVIDED));
                    html_utilities.html_glyph((SubLObject)cb_utilities.$kw327$THIN_SPACE, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_superscript_head$.getGlobalValue());
                html_utilities.html_princ(removal_modules_fractions.el_fraction_numerator(fraction, (SubLObject)cb_utilities.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
                html_utilities.html_glyph((SubLObject)cb_utilities.$kw329$FRASL, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_subscript_head$.getGlobalValue());
                html_utilities.html_princ(removal_modules_fractions.el_fraction_denominator(fraction, (SubLObject)cb_utilities.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            linktext = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cb_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return linktext;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 56263L)
    public static SubLObject cb_hl_support_to_displayP(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL == cb_utilities.$cb_inside_quoteP$.getDynamicValue(thread) && cb_utilities.NIL != arguments.hl_support_p(cons));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 56724L)
    public static SubLObject cb_show_hl_support_for_cons_method(final SubLObject hl_support, final SubLObject depth, final SubLObject wrap_axiomsP) {
        return cb_show_hl_support_readably(hl_support, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 56896L)
    public static SubLObject cb_unimplemented(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg = (SubLObject)cb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_utilities.$list332);
        arg = args.first();
        final SubLObject current = args.rest();
        if (cb_utilities.NIL == current) {
            html_utilities.html_markup((SubLObject)cb_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_utilities.$str333$Unimplemented_Link);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_utilities.NIL != color_value) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_value));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_utilities.$str333$Unimplemented_Link);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_utilities.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_utilities.$str334$The_page_for_);
                        html_utilities.html_princ_strong(arg);
                        html_utilities.html_princ((SubLObject)cb_utilities.$str335$_has_not_yet_been_implemented_);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_utilities.$list332);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 57237L)
    public static SubLObject cb_link_unimplemented(final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_utilities.NIL != Types.stringp(linktext) : linktext;
        final SubLObject frame_name_var = cb_frame_name((SubLObject)cb_utilities.$kw7$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str338$cb_unimplemented__A, web_utilities.html_url_encode(linktext, (SubLObject)cb_utilities.UNPROVIDED));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 57447L)
    public static SubLObject cb_form_item_list(final SubLObject list) {
        final SubLObject pcase_var = Sequences.length(list);
        if (!pcase_var.eql((SubLObject)cb_utilities.ZERO_INTEGER)) {
            if (pcase_var.eql((SubLObject)cb_utilities.ONE_INTEGER)) {
                cb_form(list.first(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)cb_utilities.TWO_INTEGER)) {
                cb_form(list.first(), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_utilities.$str341$_and_);
                cb_form(conses_high.second(list), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
            else {
                final SubLObject last = list_utilities.last_one(list);
                SubLObject cdolist_list_var;
                final SubLObject butlast = cdolist_list_var = conses_high.butlast(list, (SubLObject)cb_utilities.UNPROVIDED);
                SubLObject item = (SubLObject)cb_utilities.NIL;
                item = cdolist_list_var.first();
                while (cb_utilities.NIL != cdolist_list_var) {
                    cb_form(item, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_utilities.$str217$__);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                html_utilities.html_princ((SubLObject)cb_utilities.$str342$and_);
                cb_form(last, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_show_assertion_in_nl(final SubLObject assertion) {
        final SubLObject domain_mt = assertions_high.assertion_mt(assertion);
        cb_show_in_nl_int(assertion, domain_mt, (SubLObject)cb_utilities.$sym343$HTML_GENERATE_TEXT);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_show_sentence_in_nl(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == cb_utilities.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        cb_show_in_nl_int(sentence, domain_mt, (SubLObject)cb_utilities.$sym343$HTML_GENERATE_TEXT);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_show_question_in_nl(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == cb_utilities.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        cb_show_in_nl_int(sentence, domain_mt, (SubLObject)cb_utilities.$sym344$HTML_GENERATE_QUESTION);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_show_term_in_nl(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == cb_utilities.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        cb_show_in_nl_int(v_term, domain_mt, (SubLObject)cb_utilities.$sym41$HTML_GENERATE_PHRASE);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_show_in_nl_int(final SubLObject obj, final SubLObject domain_mt, final SubLObject paraphrase_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
        pph_phrase.set_pph_phrase_destruction_grace_period(Numbers.max(old_grace_period, (SubLObject)cb_utilities.$int345$300));
        final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
        try {
            pph_vars.$bypass_pph_phrase_destroyerP$.bind((SubLObject)cb_utilities.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject html = cb_html_for_obj_in_nl(obj, domain_mt, paraphrase_fn, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject v_pph_phrase = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_utilities.NIL != v_pph_phrase && cb_utilities.NIL != control_vars.$generated_phrases_browsableP$.getDynamicValue(thread)) {
                cb_form(v_pph_phrase, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            }
            else {
                html_utilities.html_markup(html);
            }
        }
        finally {
            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0, thread);
        }
        pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_html_for_obj_in_nl(final SubLObject obj, final SubLObject domain_mt, final SubLObject paraphrase_fn, SubLObject addressee) {
        if (addressee == cb_utilities.UNPROVIDED) {
            addressee = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paraphrase = (SubLObject)cb_utilities.NIL;
        SubLObject v_pph_phrase = (SubLObject)cb_utilities.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            final SubLObject target = cb_frame_name((SubLObject)cb_utilities.$kw85$MAIN);
            final SubLObject _prev_bind_0_$43 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind((SubLObject)cb_utilities.$sym346$CB_CF, thread);
                pph_vars.$html_generation_target$.bind((cb_utilities.NIL != target) ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                if (cb_utilities.NIL != control_vars.$assume_cyc_cyclist_dialogP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$44 = pph_vars.$pph_speaker$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$45 = pph_vars.$pph_addressee$.currentBinding(thread);
                    try {
                        pph_vars.$pph_speaker$.bind(cb_utilities.$const347$Cyc, thread);
                        pph_vars.$pph_addressee$.bind(addressee, thread);
                        thread.resetMultipleValues();
                        final SubLObject paraphrase_$46 = cb_html_for_obj_in_nl_values(paraphrase_fn, obj);
                        final SubLObject v_pph_phrase_$47 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        paraphrase = paraphrase_$46;
                        v_pph_phrase = v_pph_phrase_$47;
                    }
                    finally {
                        pph_vars.$pph_addressee$.rebind(_prev_bind_1_$45, thread);
                        pph_vars.$pph_speaker$.rebind(_prev_bind_0_$44, thread);
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject paraphrase_$47 = cb_html_for_obj_in_nl_values(paraphrase_fn, obj);
                    final SubLObject v_pph_phrase_$48 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    paraphrase = paraphrase_$47;
                    v_pph_phrase = v_pph_phrase_$48;
                }
            }
            finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$43, thread);
            }
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(paraphrase, v_pph_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 58027L)
    public static SubLObject cb_html_for_obj_in_nl_values(final SubLObject paraphrase_fn, final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
            thread.resetMultipleValues();
            final SubLObject ret_string = Functions.funcall(paraphrase_fn, obj);
            final SubLObject pred = thread.secondMultipleValue();
            final SubLObject justifications = thread.thirdMultipleValue();
            final SubLObject output_list = thread.fourthMultipleValue();
            final SubLObject demerits = thread.fifthMultipleValue();
            final SubLObject v_pph_phrase = thread.sixthMultipleValue();
            thread.resetMultipleValues();
            return Values.values(ret_string, v_pph_phrase);
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 60081L)
    public static SubLObject cb_show_term(final SubLObject v_term, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_utilities.UNPROVIDED) {
            depth = (SubLObject)cb_utilities.ZERO_INTEGER;
        }
        if (wrap_axiomsP == cb_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.$kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            return cb_show_term_in_nl(v_term, (SubLObject)cb_utilities.UNPROVIDED);
        }
        return cb_form(v_term, depth, wrap_axiomsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 60735L)
    public static SubLObject cb_show_assertion_readably(final SubLObject assertion, SubLObject wrap, SubLObject include_mtP) {
        if (wrap == cb_utilities.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        if (include_mtP == cb_utilities.UNPROVIDED) {
            include_mtP = (SubLObject)cb_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.$kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            cb_show_assertion_in_nl(assertion);
        }
        else if (cb_utilities.NIL != wrap && cb_utilities.$kw349$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (cb_utilities.NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                if (cb_utilities.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                    html_utilities.html_princ((SubLObject)cb_utilities.$str350$f__);
                }
                cb_form(assertion, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.T);
                if (cb_utilities.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                    html_utilities.html_princ((SubLObject)cb_utilities.$str351$__);
                }
                if (cb_utilities.NIL != include_mtP) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    if (cb_utilities.NIL == constant_handles.constant_p(mt)) {
                        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
                    }
                    if (cb_utilities.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                        html_utilities.html_princ((SubLObject)cb_utilities.$str352$___);
                    }
                    html_utilities.html_princ((SubLObject)cb_utilities.$str353$_in_);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    if (cb_utilities.NIL != constant_handles.constant_p(mt)) {
                        cb_form(mt, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        cb_form(mt, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (cb_utilities.NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                cb_form(assertion, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.NIL);
                if (cb_utilities.NIL != include_mtP) {
                    html_utilities.html_princ((SubLObject)cb_utilities.$str353$_in_);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_form(assertions_high.assertion_mt(assertion), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62085L)
    public static SubLObject when_filtered_assertion(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = (SubLObject)cb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_utilities.$list354);
        assertion = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)cb_utilities.$sym355$PWHEN, (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym356$COR, (SubLObject)cb_utilities.$list357, (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym358$FUNCALL, (SubLObject)cb_utilities.$sym359$_ASSERTION_FILTER_HOOK_, assertion)), ConsesLow.append(body, (SubLObject)cb_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62280L)
    public static SubLObject without_assertion_filters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$sym290$CLET, (SubLObject)cb_utilities.$list360, reader.bq_cons((SubLObject)cb_utilities.$sym361$PROGN, ConsesLow.append(body, (SubLObject)cb_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62404L)
    public static SubLObject cb_assertion_link(final SubLObject assertion, SubLObject wrap) {
        if (wrap == cb_utilities.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == cb_utilities.$assertion_filter_hook$.getDynamicValue(thread) || cb_utilities.NIL != Functions.funcall(cb_utilities.$assertion_filter_hook$.getDynamicValue(thread), assertion)) {
            cb_show_assertion_readably(assertion, wrap, (SubLObject)cb_utilities.NIL);
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62605L)
    public static SubLObject cb_assertion_link_with_mt(final SubLObject assertion, SubLObject wrap) {
        if (wrap == cb_utilities.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == cb_utilities.$assertion_filter_hook$.getDynamicValue(thread) || cb_utilities.NIL != Functions.funcall(cb_utilities.$assertion_filter_hook$.getDynamicValue(thread), assertion)) {
            cb_show_assertion_readably(assertion, wrap, (SubLObject)cb_utilities.T);
        }
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 62810L)
    public static SubLObject cb_assertion_link_binary(final SubLObject assertion, SubLObject show_negatedP) {
        if (show_negatedP == cb_utilities.UNPROVIDED) {
            show_negatedP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == cb_utilities.$assertion_filter_hook$.getDynamicValue(thread) || cb_utilities.NIL != Functions.funcall(cb_utilities.$assertion_filter_hook$.getDynamicValue(thread), assertion)) {
            if (cb_utilities.NIL == show_negatedP && cb_utilities.$kw22$FALSE == assertions_high.assertion_truth(assertion)) {
                return cb_browser.cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated(assertion);
            }
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            final SubLObject depth = (SubLObject)cb_utilities.ZERO_INTEGER;
            SubLObject wrapP = (SubLObject)cb_utilities.NIL;
            SubLObject newlineP = (SubLObject)cb_utilities.NIL;
            if (cb_utilities.NIL != constant_handles.constant_p(arg2)) {
                wrapP = (SubLObject)cb_utilities.NIL;
            }
            else if (cb_utilities.NIL != nart_handles.nart_p(arg2)) {
                wrapP = (SubLObject)cb_utilities.T;
            }
            else if (cb_utilities.NIL != assertion_handles.assertion_p(arg2)) {
                wrapP = (SubLObject)cb_utilities.T;
                newlineP = (SubLObject)cb_utilities.T;
            }
            else if (arg2.isString() && Sequences.length(arg2).numG((SubLObject)cb_utilities.$int362$40)) {
                wrapP = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread);
            }
            else if (arg2.isAtom()) {
                wrapP = (SubLObject)cb_utilities.NIL;
            }
            else {
                wrapP = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread);
                newlineP = (SubLObject)cb_utilities.T;
            }
            if (cb_utilities.NIL != wrapP) {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (cb_utilities.NIL != cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                    cb_show_term(arg2, depth, wrapP);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (cb_utilities.NIL != cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                    cb_show_term(arg2, depth, wrapP);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (cb_utilities.NIL != newlineP) {
                html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_indent((SubLObject)cb_utilities.ONE_INTEGER);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 64016L)
    public static SubLObject cb_show_hl_support_readably(final SubLObject support, SubLObject validation_level) {
        if (validation_level == cb_utilities.UNPROVIDED) {
            validation_level = (SubLObject)cb_utilities.$kw363$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = arguments.support_module(support);
        final SubLObject formula = arguments.support_formula(support);
        final SubLObject mt = arguments.support_mt(support);
        if (cb_utilities.$kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            cb_show_hl_support_formula_readably(formula);
            html_utilities.html_princ((SubLObject)cb_utilities.$str364$__claimed_by_);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_link((SubLObject)cb_utilities.$kw365$HL_SUPPORT, support, validation_level, module, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_utilities.$str366$_module_);
        }
        else {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_utilities.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_utilities.$kw368$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_utilities.$kw76$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_link((SubLObject)cb_utilities.$kw365$HL_SUPPORT, support, validation_level, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_glyph((SubLObject)cb_utilities.$kw370$NBSP, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_utilities.$kw368$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_utilities.$kw76$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        cb_form(formula, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.T);
                        if (cb_utilities.NIL == constant_handles.constant_p(mt)) {
                            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
                        }
                        html_utilities.html_princ((SubLObject)cb_utilities.$str353$_in_);
                        if (cb_utilities.NIL != constant_handles.constant_p(mt)) {
                            cb_form(mt, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                        }
                        else {
                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                            cb_form(mt, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 65942L)
    public static SubLObject cb_show_hl_support_formula_readably(final SubLObject formula) {
        return cb_show_sentence_in_nl(formula, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 66039L)
    public static SubLObject cb_show_el_assertion_readably(final SubLObject assertion, SubLObject wrap, SubLObject include_mtP, SubLObject check_for_redundant_el_formulasP) {
        if (wrap == cb_utilities.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        if (include_mtP == cb_utilities.UNPROVIDED) {
            include_mtP = (SubLObject)cb_utilities.T;
        }
        if (check_for_redundant_el_formulasP == cb_utilities.UNPROVIDED) {
            check_for_redundant_el_formulasP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.$kw348$NL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            cb_show_assertion_in_nl(assertion);
            return assertion;
        }
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject hl_formula = fi.assertion_hl_formula(assertion, (SubLObject)cb_utilities.UNPROVIDED);
        SubLObject formula = (SubLObject)cb_utilities.NIL;
        SubLObject already_shownP = (SubLObject)cb_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject el_formula = cb_assertion_el_formula(assertion, hl_formula);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula)))) {
            formula = hl_formula;
        }
        else if (cb_utilities.NIL != check_for_redundant_el_formulasP && el_formula.equal(cb_parameters.$cb_show_el_assertion_readably_last_formula$.getDynamicValue(thread)) && (cb_utilities.NIL == include_mtP || cb_utilities.NIL != hlmt.hlmt_equal(mt, cb_parameters.$cb_show_el_assertion_readably_last_mt$.getDynamicValue(thread)))) {
            already_shownP = (SubLObject)cb_utilities.T;
        }
        else if (cb_utilities.NIL != hlmt.hlmt_equalP(mt, el_mt) || cb_utilities.NIL != include_mtP) {
            formula = el_formula;
        }
        else {
            formula = el_utilities.make_ist_sentence(el_mt, el_formula);
        }
        if (cb_utilities.NIL != check_for_redundant_el_formulasP && cb_utilities.NIL == already_shownP) {
            cb_parameters.$cb_show_el_assertion_readably_last_formula$.setDynamicValue(formula, thread);
            if (cb_utilities.NIL != include_mtP) {
                cb_parameters.$cb_show_el_assertion_readably_last_mt$.setDynamicValue(mt, thread);
            }
        }
        if (cb_utilities.NIL != already_shownP) {
            cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            if (cb_utilities.NIL != include_mtP) {
                html_utilities.html_princ((SubLObject)cb_utilities.$str372$EL_Formula___Mt_Identical_to_Asse);
            }
            else {
                html_utilities.html_princ((SubLObject)cb_utilities.$str373$EL_Formula_Identical_to_Assertion);
            }
        }
        else if (cb_utilities.NIL != wrap) {
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (cb_utilities.NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                cb_form_assertion_formula(assertion, formula, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != include_mtP) {
                    html_utilities.html_princ((SubLObject)cb_utilities.$str353$_in_);
                    cb_form(el_mt, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (cb_utilities.NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                html_utilities.html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                cb_form_assertion_formula(assertion, formula, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED);
                if (cb_utilities.NIL != include_mtP) {
                    html_utilities.html_princ((SubLObject)cb_utilities.$str353$_in_);
                    cb_form(el_mt, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 68567L)
    public static SubLObject cb_assertion_el_formula(final SubLObject assertion, SubLObject hl_formula) {
        if (hl_formula == cb_utilities.UNPROVIDED) {
            hl_formula = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cb_utilities.NIL == dictionary.dictionary_p(cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue(thread))) {
            cb_parameters.$cb_assertion_el_formula_cache$.setDynamicValue(dictionary.new_dictionary((SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED), thread);
        }
        final SubLObject el_formula_mt_pair = dictionary.dictionary_lookup(cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue(thread), assertion, (SubLObject)cb_utilities.UNPROVIDED);
        SubLObject el_formula = el_formula_mt_pair.first();
        SubLObject el_mt = conses_high.second(el_formula_mt_pair);
        if (cb_utilities.NIL != el_formula) {
            return Values.values(el_formula, el_mt);
        }
        thread.resetMultipleValues();
        final SubLObject el_formula_$54 = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject el_mt_$55 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        el_formula = el_formula_$54;
        el_mt = el_mt_$55;
        if (cb_utilities.NIL == hl_formula) {
            hl_formula = fi.assertion_hl_formula(assertion, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (!el_formula.equal(hl_formula)) {
            dictionary.dictionary_enter(cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue(thread), assertion, (SubLObject)ConsesLow.list(el_formula, el_mt));
        }
        return Values.values(el_formula, el_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 69619L)
    public static SubLObject cb_el_assertion_link_checking_redundancy(final SubLObject assertion, SubLObject wrap) {
        if (wrap == cb_utilities.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == cb_utilities.$assertion_filter_hook$.getDynamicValue(thread) || cb_utilities.NIL != Functions.funcall(cb_utilities.$assertion_filter_hook$.getDynamicValue(thread), assertion)) {
            cb_show_el_assertion_readably(assertion, wrap, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T);
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 70142L)
    public static SubLObject cb_el_assertion_link_with_mt_checking_redundancy(final SubLObject assertion, SubLObject wrap) {
        if (wrap == cb_utilities.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == cb_utilities.$assertion_filter_hook$.getDynamicValue(thread) || cb_utilities.NIL != Functions.funcall(cb_utilities.$assertion_filter_hook$.getDynamicValue(thread), assertion)) {
            cb_show_el_assertion_readably(assertion, wrap, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.T);
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 70680L)
    public static SubLObject cb_el_assertion_link_binary_checking_redundancy(final SubLObject assertion, SubLObject show_negatedP) {
        if (show_negatedP == cb_utilities.UNPROVIDED) {
            show_negatedP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.NIL == cb_utilities.$assertion_filter_hook$.getDynamicValue(thread) || cb_utilities.NIL != Functions.funcall(cb_utilities.$assertion_filter_hook$.getDynamicValue(thread), assertion)) {
            cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            if (cb_utilities.NIL != assertion_handles.assertion_p(arg2)) {
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_show_el_assertion_readably(arg2, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
            }
            else {
                cb_parameters.$cb_show_el_assertion_readably_last_formula$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                cb_parameters.$cb_show_el_assertion_readably_last_mt$.setDynamicValue((SubLObject)cb_utilities.NIL, thread);
                if (cb_utilities.NIL != constant_handles.constant_p(arg2)) {
                    cb_form(arg2, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.NIL);
                }
                else if (cb_utilities.NIL != nart_handles.nart_p(arg2)) {
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_form(arg2, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.T);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                else if (arg2.isString()) {
                    cb_form(arg2, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.NIL);
                }
                else if (arg2.isAtom()) {
                    cb_form(arg2, (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.NIL);
                }
                else {
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_form(arg2, (SubLObject)cb_utilities.ZERO_INTEGER, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
                }
            }
            html_utilities.html_indent((SubLObject)cb_utilities.ONE_INTEGER);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72105L)
    public static SubLObject cb_term_of_unit_link(final SubLObject assertion, SubLObject wrapP) {
        if (wrapP == cb_utilities.UNPROVIDED) {
            wrapP = (SubLObject)cb_utilities.NIL;
        }
        cb_link((SubLObject)cb_utilities.$kw171$ASSERTION, assertion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        cb_form(cycl_utilities.sentence_arg1(assertion, (SubLObject)cb_utilities.UNPROVIDED), (SubLObject)cb_utilities.NIL, wrapP);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72311L)
    public static SubLObject cb_index_hook_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != forts.fort_p(v_object) || cb_utilities.NIL != assertion_handles.assertion_p(v_object) || cb_utilities.NIL != auxiliary_indexing.auxiliary_index_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 72480L)
    public static SubLObject cb_index_identifier(final SubLObject index_hook) {
        if (cb_utilities.NIL != forts.fort_p(index_hook)) {
            return cb_fort_identifier(index_hook);
        }
        if (cb_utilities.NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
            return index_hook;
        }
        if (cb_utilities.NIL != term.closed_nautP(index_hook, (SubLObject)cb_utilities.UNPROVIDED)) {
            return cb_naut_identifier(index_hook);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 73739L)
    public static SubLObject cb_fort_identifier(final SubLObject fort) {
        if (cb_utilities.NIL != constant_handles.constant_p(fort)) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cb_utilities.$cb_constant_id_prefix$.getGlobalValue()), format_nil.format_nil_a_no_copy((cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue()) ? kb_utilities.cached_compact_hl_external_id_string(fort) : constants_high.constant_internal_id(fort)));
        }
        if (cb_utilities.NIL != nart_handles.nart_p(fort)) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cb_utilities.$cb_nart_id_prefix$.getGlobalValue()), format_nil.format_nil_a_no_copy((cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue()) ? kb_utilities.cached_compact_hl_external_id_string(fort) : nart_handles.nart_id(fort)));
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 74336L)
    public static SubLObject cb_assertion_identifier(final SubLObject v_assert) {
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cb_utilities.$cb_assertion_id_prefix$.getGlobalValue()), format_nil.format_nil_a_no_copy((cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue()) ? kb_utilities.cached_compact_hl_external_id_string(v_assert) : assertion_handles.assertion_id(v_assert)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 74569L)
    public static SubLObject cb_term_identifier(final SubLObject v_term) {
        if (cb_utilities.NIL != forts.fort_p(v_term)) {
            return cb_fort_identifier(v_term);
        }
        if (cb_utilities.NIL != term.closed_nautP(v_term, (SubLObject)cb_utilities.UNPROVIDED)) {
            return cb_naut_identifier(v_term);
        }
        if (cb_utilities.NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
            return print_high.prin1_to_string(v_term);
        }
        if (cb_utilities.NIL != assertion_handles.assertion_p(v_term)) {
            return cb_assertion_identifier(v_term);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 74890L)
    public static SubLObject cb_valid_fort_identifierP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && ((cb_utilities.NIL != string_utilities.starts_with(v_object, cb_utilities.$cb_constant_id_prefix$.getGlobalValue()) && cb_utilities.NIL != ((cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue()) ? kb_utilities.compact_hl_external_id_string_p(string_utilities.pre_remove(v_object, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED)) : string_utilities.integer_string_p(string_utilities.pre_remove(v_object, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED)))) || (cb_utilities.NIL != string_utilities.starts_with(v_object, cb_utilities.$cb_nart_id_prefix$.getGlobalValue()) && cb_utilities.NIL != ((cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue()) ? kb_utilities.compact_hl_external_id_string_p(string_utilities.pre_remove(v_object, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED)) : string_utilities.integer_string_p(string_utilities.pre_remove(v_object, cb_utilities.$cb_nart_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 75566L)
    public static SubLObject cb_hlmt_identifier(final SubLObject v_hlmt) {
        if (cb_utilities.NIL != forts.fort_p(v_hlmt)) {
            return cb_fort_identifier(v_hlmt);
        }
        return cb_string_for_hlmt(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 75737L)
    public static SubLObject cb_valid_hlmt_identifierP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != cb_valid_fort_identifierP(v_object) || v_object.isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 75863L)
    public static SubLObject cb_guess_constant(final SubLObject args) {
        if (args.isInteger()) {
            return constants_high.find_constant_by_internal_id(args);
        }
        if (cb_utilities.NIL != constant_handles.constant_p(args)) {
            return args;
        }
        if (cb_utilities.NIL == args) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString()) {
            return cb_guess_constant_from_string(args);
        }
        if (args.isCons() && cb_utilities.NIL != forts.fort_p(args.first())) {
            return narts_high.find_nart(args);
        }
        if (args.isCons()) {
            return cb_guess_constant(args.first());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 76834L)
    public static SubLObject cb_guess_constant_from_string(final SubLObject args) {
        SubLObject constant = (SubLObject)cb_utilities.NIL;
        if (!args.equalp((SubLObject)cb_utilities.$str379$NIL)) {
            constant = ke_utilities.fort_from_string(args);
            if (cb_utilities.NIL == constant_handles.constant_p(constant) && cb_utilities.NIL != string_utilities.starts_with(args, cb_utilities.$cb_constant_id_prefix$.getGlobalValue())) {
                constant = cb_guess_constant(reader.read_from_string_ignoring_errors(string_utilities.pre_remove(args, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED), (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
            }
            if (cb_utilities.NIL == constant && cb_utilities.NIL != string_utilities.digit_stringP(args)) {
                constant = cb_guess_constant(reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
            }
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 77374L)
    public static SubLObject cb_guess_nart(final SubLObject args) {
        if (args.isInteger()) {
            return nart_handles.find_nart_by_id(args);
        }
        if (cb_utilities.NIL != nart_handles.nart_p(args)) {
            return args;
        }
        if (cb_utilities.NIL == args) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString() && cb_utilities.NIL != string_utilities.starts_with(args, cb_utilities.$cb_nart_id_prefix$.getGlobalValue())) {
            return cb_guess_nart(reader.read_from_string_ignoring_errors(string_utilities.pre_remove(args, cb_utilities.$cb_nart_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED), (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (cb_utilities.NIL != string_utilities.digit_stringP(args)) {
            return cb_guess_nart(reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (args.isString() && args.equalp((SubLObject)cb_utilities.$str379$NIL)) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString()) {
            final SubLObject v_term = ke_utilities.fort_from_string(args);
            return (SubLObject)((cb_utilities.NIL != nart_handles.nart_p(v_term)) ? v_term : cb_utilities.NIL);
        }
        if (args.isCons() && cb_utilities.NIL != forts.fort_p(args.first())) {
            return narts_high.find_nart(args);
        }
        if (args.isCons()) {
            return cb_guess_nart(args.first());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 78539L)
    public static SubLObject cb_guess_nat(final SubLObject args) {
        return cb_guess_nart(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 78639L)
    public static SubLObject cb_fort_display_string(final SubLObject fort) {
        assert cb_utilities.NIL != forts.fort_p(fort) : fort;
        if (cb_utilities.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return string_utilities.string_remove_constant_reader_prefixes(cb_string_for_fort(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 79066L)
    public static SubLObject cb_string_for_fort(final SubLObject fort) {
        assert cb_utilities.NIL != forts.fort_p(fort) : fort;
        final SubLObject el_formula = forts.fort_el_formula(fort);
        if (cb_utilities.NIL != constant_handles.constant_p(el_formula)) {
            final SubLObject name = constants_high.constant_name(el_formula);
            if (name.isString()) {
                return name;
            }
        }
        return format_nil.format_nil_s(el_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 79417L)
    public static SubLObject cb_guess_fort(final SubLObject args, SubLObject interpret_idsP) {
        if (interpret_idsP == cb_utilities.UNPROVIDED) {
            interpret_idsP = (SubLObject)cb_utilities.T;
        }
        if (cb_utilities.NIL != interpret_idsP) {
            final SubLObject fort = cb_guess_fort_from_id(args);
            if (cb_utilities.NIL != fort) {
                return fort;
            }
        }
        return cb_guess_fort_from_non_id(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 79632L)
    public static SubLObject cb_guess_fort_from_id(final SubLObject args) {
        if (args.isInteger() && !args.isNegative()) {
            return constants_high.find_constant_by_internal_id(args);
        }
        if (args.isInteger() && args.isNegative()) {
            return nart_handles.find_nart_by_id(Numbers.minus(args));
        }
        if (cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue() && args.isString() && cb_utilities.NIL != string_utilities.starts_with(args, cb_utilities.$cb_image_independent_constant_id_prefix$.getGlobalValue())) {
            return cb_guess_constant(string_utilities.pre_remove(args, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (args.isString() && cb_utilities.NIL != string_utilities.starts_with(args, cb_utilities.$cb_constant_id_prefix$.getGlobalValue())) {
            return cb_guess_constant(reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, Sequences.length(cb_utilities.$cb_constant_id_prefix$.getGlobalValue()), (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (cb_utilities.NIL != cb_utilities.$cb_image_independent_fort_identifiersP$.getGlobalValue() && args.isString() && cb_utilities.NIL != string_utilities.starts_with(args, cb_utilities.$cb_image_independent_nart_id_prefix$.getGlobalValue())) {
            return cb_guess_constant(string_utilities.pre_remove(args, cb_utilities.$cb_nart_id_prefix$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (args.isString() && cb_utilities.NIL != string_utilities.starts_with(args, cb_utilities.$cb_nart_id_prefix$.getGlobalValue())) {
            return cb_guess_nart(reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, Sequences.length(cb_utilities.$cb_nart_id_prefix$.getGlobalValue()), (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (cb_utilities.NIL != string_utilities.digit_stringP(args)) {
            return cb_guess_fort_from_id(reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (args.isString() && Sequences.length(args).numG((SubLObject)cb_utilities.ONE_INTEGER) && cb_utilities.NIL != Characters.charE(Strings.sublisp_char(args, (SubLObject)cb_utilities.ZERO_INTEGER), (SubLObject)Characters.CHAR_hyphen) && cb_utilities.NIL == list_utilities.find_if_not(Symbols.symbol_function((SubLObject)cb_utilities.$sym383$DIGIT_CHAR_P), args, Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY), (SubLObject)cb_utilities.ONE_INTEGER, (SubLObject)cb_utilities.UNPROVIDED)) {
            return cb_guess_fort_from_id(reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 81273L)
    public static SubLObject cb_guess_fort_from_non_id(final SubLObject args) {
        if (cb_utilities.NIL != constant_handles.constant_p(args)) {
            return args;
        }
        if (cb_utilities.NIL != nart_handles.nart_p(args)) {
            return args;
        }
        if (cb_utilities.NIL == args) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString() && args.equalp((SubLObject)cb_utilities.$str379$NIL)) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString()) {
            return ke_utilities.fort_from_string(args);
        }
        if (args.isCons() && cb_utilities.NIL != forts.fort_p(args.first())) {
            return narts_high.find_nart(args);
        }
        if (args.isCons()) {
            return cb_guess_fort(args.first(), (SubLObject)cb_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82422L)
    public static SubLObject cb_naut_identifierP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != list_utilities.lengthG(string, cb_utilities.$cb_naut_id_prefix_length$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL != Strings.stringE(cb_utilities.$cb_naut_id_prefix$.getGlobalValue(), string_utilities.substring(string, (SubLObject)cb_utilities.ZERO_INTEGER, cb_utilities.$cb_naut_id_prefix_length$.getGlobalValue()), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82612L)
    public static SubLObject cb_naut_identifier(final SubLObject naut) {
        return cb_string_for_naut(naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82692L)
    public static SubLObject cb_naut_identifier_string(final SubLObject string) {
        return string_utilities.substring(string, cb_utilities.$cb_naut_id_prefix_length$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 82799L)
    public static SubLObject cb_naut_display_string(final SubLObject naut) {
        return string_utilities.string_remove_constant_reader_prefixes(string_utilities.to_lisp_string(cycl_utilities.hl_to_el(naut)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83033L)
    public static SubLObject cb_string_for_naut(final SubLObject naut) {
        return Sequences.cconcatenate(cb_utilities.$cb_naut_id_prefix$.getGlobalValue(), string_utilities.str(cb_parameters.cb_glob_id(naut)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83146L)
    public static SubLObject cb_guess_naut(final SubLObject args, SubLObject interpret_idsP) {
        if (interpret_idsP == cb_utilities.UNPROVIDED) {
            interpret_idsP = (SubLObject)cb_utilities.T;
        }
        SubLObject result = (SubLObject)cb_utilities.NIL;
        if (cb_utilities.NIL != term.closed_nautP(args, (SubLObject)cb_utilities.UNPROVIDED)) {
            result = args;
        }
        else if (args.isString() && cb_utilities.NIL != interpret_idsP && cb_utilities.NIL != cb_naut_identifierP(args)) {
            result = cb_parameters.cb_glob_lookup_by_string(cb_naut_identifier_string(args));
        }
        else if (cb_utilities.NIL != interpret_idsP && cb_utilities.NIL != kb_utilities.hl_external_id_string_p(args)) {
            result = kb_utilities.find_object_by_hl_external_id_string(args);
        }
        else if (args.isCons()) {
            result = cb_guess_naut(args.first(), interpret_idsP);
        }
        else {
            result = ke_utilities.cycl_from_string(args);
        }
        return czer_main.canonicalize_term(result, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 83770L)
    public static SubLObject cb_guess_naut_spec(final SubLObject naut_spec) {
        return (cb_utilities.NIL != term.closed_nautP(naut_spec, (SubLObject)cb_utilities.UNPROVIDED)) ? naut_spec : cb_guess_naut(naut_spec, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84064L)
    public static SubLObject cb_sentence_identifierP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != list_utilities.lengthG(string, cb_utilities.$cb_sentence_id_prefix_length$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL != Strings.stringE(cb_utilities.$cb_sentence_id_prefix$.getGlobalValue(), string_utilities.substring(string, (SubLObject)cb_utilities.ZERO_INTEGER, cb_utilities.$cb_sentence_id_prefix_length$.getGlobalValue()), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84270L)
    public static SubLObject cb_sentence_identifier_string(final SubLObject string) {
        return string_utilities.substring(string, cb_utilities.$cb_sentence_id_prefix_length$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84385L)
    public static SubLObject cb_string_for_sentence(final SubLObject sentence) {
        return Sequences.cconcatenate(cb_utilities.$cb_sentence_id_prefix$.getGlobalValue(), string_utilities.str(cb_parameters.cb_glob_id(sentence)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84514L)
    public static SubLObject cb_guess_sentence(final SubLObject args) {
        if (cb_utilities.NIL != cb_sentence_identifierP(args)) {
            return cb_parameters.cb_glob_lookup_by_string(cb_sentence_identifier_string(args));
        }
        return ke_utilities.cycl_from_string(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84714L)
    public static SubLObject cb_assertion_identifierP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_utilities.NIL != list_utilities.lengthG(string, cb_utilities.$cb_assertion_id_prefix_length$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED) && cb_utilities.NIL != Strings.stringE(cb_utilities.$cb_assertion_id_prefix$.getGlobalValue(), string_utilities.substring(string, (SubLObject)cb_utilities.ZERO_INTEGER, cb_utilities.$cb_assertion_id_prefix_length$.getGlobalValue()), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 84940L)
    public static SubLObject cb_assertion_identifier_string(final SubLObject string) {
        return string_utilities.substring(string, cb_utilities.$cb_assertion_id_prefix_length$.getGlobalValue(), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85057L)
    public static SubLObject cb_string_for_assertion(final SubLObject assertion) {
        return cb_assertion_identifier_string(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85164L)
    public static SubLObject cb_term_display_string(final SubLObject v_term) {
        if (cb_utilities.NIL != forts.fort_p(v_term)) {
            return cb_fort_display_string(v_term);
        }
        return cb_naut_display_string(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85331L)
    public static SubLObject cb_string_for_term(final SubLObject v_term) {
        if (cb_utilities.NIL != assertion_handles.assertion_p(v_term)) {
            return cb_string_for_assertion(v_term);
        }
        if (cb_utilities.NIL != forts.fort_p(v_term)) {
            return cb_string_for_fort(v_term);
        }
        return cb_string_for_naut(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 85613L)
    public static SubLObject cb_guess_term(final SubLObject args, SubLObject interpret_idsP) {
        if (interpret_idsP == cb_utilities.UNPROVIDED) {
            interpret_idsP = (SubLObject)cb_utilities.T;
        }
        if (cb_utilities.NIL != cb_guess_fort(args, interpret_idsP)) {
            return cb_guess_fort(args, interpret_idsP);
        }
        if (cb_utilities.NIL != cb_assertion_identifierP(args)) {
            return cb_guess_assertion(args);
        }
        return cb_guess_naut(args, interpret_idsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86002L)
    public static SubLObject cb_hlmt_display_string(final SubLObject v_hlmt) {
        return cb_term_display_string(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86100L)
    public static SubLObject cb_string_for_hlmt(final SubLObject v_hlmt) {
        return cb_string_for_term(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86180L)
    public static SubLObject cb_guess_hlmt(final SubLObject args) {
        return cb_guess_term(args, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86250L)
    public static SubLObject cb_guess_date(final SubLObject string) {
        if (cb_utilities.NIL != string_utilities.empty_stringP(string)) {
            return hlmt.$default_mt_time_interval$.getGlobalValue();
        }
        return date_utilities.temporal_object_from_string(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86637L)
    public static SubLObject cb_guess_time_parameter(final SubLObject string) {
        if (cb_utilities.NIL != string_utilities.empty_stringP(string)) {
            return hlmt.$default_atemporal_time_parameter$.getGlobalValue();
        }
        return cb_guess_term(string, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 86839L)
    public static SubLObject cb_time_interval_display_string(final SubLObject time_interval) {
        return (SubLObject)((cb_utilities.NIL != time_interval) ? string_utilities.string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string(time_interval, (SubLObject)cb_utilities.UNPROVIDED)) : cb_utilities.$str88$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 87142L)
    public static SubLObject cb_time_parameter_display_string(final SubLObject time_parameter) {
        return (SubLObject)((cb_utilities.NIL != time_parameter) ? cb_term_display_string(time_parameter) : cb_utilities.$str88$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 87389L)
    public static SubLObject cb_show_assertion_hlmt_readably(final SubLObject v_hlmt) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        html_utilities.html_princ(cb_fort_display_string(monad_mt));
        if (cb_utilities.NIL != hlmt.interesting_hlmtP(v_hlmt)) {
            html_utilities.html_princ((SubLObject)cb_utilities.$str217$__);
            cb_show_assertion_hlmt_time_interval_and_parameter(v_hlmt);
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 87679L)
    public static SubLObject cb_show_assertion_hlmt_time_interval_and_parameter(final SubLObject v_hlmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        SubLObject time_interval = (SubLObject)cb_utilities.NIL;
        SubLObject time_parameter = (SubLObject)cb_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject time_interval_$56 = hlmt.explode_hlmt_temporal_facets_with_defaults(v_hlmt);
        final SubLObject time_parameter_$57 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        time_interval = time_interval_$56;
        time_parameter = time_parameter_$57;
        html_utilities.html_princ(cb_time_interval_display_string(time_interval));
        html_utilities.html_princ((SubLObject)cb_utilities.$str217$__);
        html_utilities.html_princ(cb_time_parameter_display_string(time_parameter));
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88032L)
    public static SubLObject cb_mt_display_string(final SubLObject mt) {
        return cb_term_display_string(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88161L)
    public static SubLObject cb_string_for_mt(final SubLObject mt) {
        return cb_string_for_term(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88235L)
    public static SubLObject cb_guess_mt(final SubLObject args) {
        return cb_guess_term(args, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88303L)
    public static SubLObject cb_guess_index(SubLObject args) {
        final SubLObject fort = cb_guess_fort(args, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != forts.fort_p(fort)) {
            return fort;
        }
        if (args.isCons()) {
            args = args.first();
        }
        if (args.isString()) {
            args = Packages.find_symbol(args, control_vars.$keyword_package$.getGlobalValue());
        }
        if (!args.isSymbol()) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (cb_utilities.NIL == args) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (kb_indexing.num_index(args).numG((SubLObject)cb_utilities.ZERO_INTEGER)) {
            return args;
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 88764L)
    public static SubLObject cb_guess_assertion(final SubLObject args) {
        if (args.isInteger()) {
            return assertion_handles.find_assertion_by_id(args);
        }
        if (cb_utilities.NIL != assertion_handles.assertion_p(args)) {
            return args;
        }
        if (cb_utilities.NIL != cb_assertion_identifierP(args) && reader.read_from_string_ignoring_errors(cb_assertion_identifier_string(args), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED).isInteger()) {
            return assertion_handles.find_assertion_by_id(reader.read_from_string_ignoring_errors(cb_assertion_identifier_string(args), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED));
        }
        if (cb_utilities.NIL != cb_assertion_identifierP(args) && cb_utilities.NIL != kb_utilities.compact_hl_external_id_string_p(cb_assertion_identifier_string(args))) {
            return kb_utilities.find_object_by_compact_hl_external_id_string(cb_assertion_identifier_string(args));
        }
        if (cb_utilities.NIL == args) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString()) {
            final SubLObject id = reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            if (id.isInteger()) {
                return assertion_handles.find_assertion_by_id(id);
            }
            return (SubLObject)cb_utilities.NIL;
        }
        else {
            if (args.isCons()) {
                return cb_guess_assertion(args.first());
            }
            return (SubLObject)cb_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 89658L)
    public static SubLObject cb_guess_deduction(final SubLObject args) {
        if (args.isInteger()) {
            return deduction_handles.find_deduction_by_id(args);
        }
        if (cb_utilities.NIL != deduction_handles.deduction_p(args)) {
            return args;
        }
        if (cb_utilities.NIL == args) {
            return (SubLObject)cb_utilities.NIL;
        }
        if (args.isString()) {
            final SubLObject id = reader.read_from_string_ignoring_errors(args, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            if (id.isInteger()) {
                return deduction_handles.find_deduction_by_id(id);
            }
            return (SubLObject)cb_utilities.NIL;
        }
        else {
            if (args.isCons()) {
                return cb_guess_deduction(args.first());
            }
            return (SubLObject)cb_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 90107L)
    public static SubLObject prompt_for_simple_date(final SubLObject date, final SubLObject data_prefix) {
        final SubLObject day = Numbers.mod(date, (SubLObject)cb_utilities.$int176$100);
        final SubLObject dayprompt = Sequences.cconcatenate(data_prefix, (SubLObject)cb_utilities.$str387$_day);
        final SubLObject month = Numbers.floor(Numbers.divide(Numbers.mod(date, (SubLObject)cb_utilities.$int388$10000), (SubLObject)cb_utilities.$int176$100), (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject monthprompt = Sequences.cconcatenate(data_prefix, (SubLObject)cb_utilities.$str389$_month);
        final SubLObject year = Numbers.floor(Numbers.divide(date, (SubLObject)cb_utilities.$int388$10000), (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject yearprompt = Sequences.cconcatenate(data_prefix, (SubLObject)cb_utilities.$str390$_year);
        html_utilities.html_indent((SubLObject)cb_utilities.THREE_INTEGER);
        html_utilities.html_princ((SubLObject)cb_utilities.$str391$Month);
        html_utilities.html_text_input(monthprompt, month, (SubLObject)cb_utilities.TWO_INTEGER);
        html_utilities.html_indent((SubLObject)cb_utilities.THREE_INTEGER);
        html_utilities.html_princ((SubLObject)cb_utilities.$str392$Day);
        html_utilities.html_text_input(dayprompt, day, (SubLObject)cb_utilities.TWO_INTEGER);
        html_utilities.html_indent((SubLObject)cb_utilities.THREE_INTEGER);
        html_utilities.html_princ((SubLObject)cb_utilities.$str393$Year);
        html_utilities.html_text_input(yearprompt, year, (SubLObject)cb_utilities.FOUR_INTEGER);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 90803L)
    public static SubLObject read_args_for_simple_date(final SubLObject data_prefix, final SubLObject args) {
        final SubLObject dayprompt = Sequences.cconcatenate(data_prefix, (SubLObject)cb_utilities.$str387$_day);
        final SubLObject monthprompt = Sequences.cconcatenate(data_prefix, (SubLObject)cb_utilities.$str389$_month);
        final SubLObject yearprompt = Sequences.cconcatenate(data_prefix, (SubLObject)cb_utilities.$str390$_year);
        final SubLObject day = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input(dayprompt, args), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject month = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input(monthprompt, args), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject year = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input(yearprompt, args), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        return Numbers.add(Numbers.multiply((SubLObject)cb_utilities.$int388$10000, year), Numbers.multiply((SubLObject)cb_utilities.$int176$100, month), day);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 91390L)
    public static SubLObject read_multiple_terms_from_string(final SubLObject str) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = (SubLObject)cb_utilities.NIL;
        SubLObject index = (SubLObject)cb_utilities.ZERO_INTEGER;
        while (index.numL(Sequences.length(str))) {
            thread.resetMultipleValues();
            SubLObject v_object = reader.read_from_string_ignoring_errors(str, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.$kw394$EOF, index, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject next_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (v_object == cb_utilities.$kw394$EOF) {
                index = Sequences.length(str);
            }
            else {
                if (next_index == cb_utilities.$kw395$ERROR) {
                    return Values.values((SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.$kw395$ERROR);
                }
                if (v_object.isSymbol()) {
                    v_object = constant_completion_high.constant_complete(Symbols.symbol_name(v_object), (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED).first();
                }
                if (cb_utilities.NIL != constant_handles.constant_p(v_object)) {
                    final SubLObject item_var = v_object;
                    if (cb_utilities.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)cb_utilities.EQL), Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var, terms);
                    }
                }
                if (next_index.isInteger()) {
                    index = next_index;
                }
                else {
                    index = Sequences.length(str);
                }
            }
        }
        return Values.values(terms, (SubLObject)cb_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 92172L)
    public static SubLObject asserted_reviewer(final SubLObject assertion) {
        assert cb_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return kb_mapping_utilities.pred_values_in_mt(assertion, cb_utilities.$const396$myReviewer, cb_utilities.$const397$BookkeepingMt, (SubLObject)cb_utilities.ONE_INTEGER, (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)cb_utilities.$kw20$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 92456L)
    public static SubLObject cb_show_unmatched_parentheses(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unmatched_paren_positions = string_utilities.unmatched_parentheses(string, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str399$The_following_parentheses_are_unm);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            SubLObject end_var_$58;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject color_val;
            SubLObject _prev_bind_0_$59;
            for (end_var = (end_var_$58 = Sequences.length(string)), char_num = (SubLObject)cb_utilities.NIL, char_num = (SubLObject)cb_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$58); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (cb_utilities.NIL != subl_promotions.memberP(char_num, unmatched_paren_positions, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED)) {
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    color_val = cb_utilities.$html_unmatched_parenthesis_color$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (cb_utilities.NIL != color_val) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_val));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_princ_strong(v_char);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                }
                else {
                    html_utilities.html_princ(v_char);
                }
            }
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93040L)
    public static SubLObject cb_show_invalid_constants(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == cb_utilities.UNPROVIDED) {
            require_exactP = (SubLObject)cb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str400$The_following_constants_are_inval);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_show_string_with_invalid_constants_highlighted(string, require_exactP);
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93529L)
    public static SubLObject cb_show_eof_explanation(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str401$This_is_unreadable__because_more_);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_princ(string);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93728L)
    public static SubLObject cb_show_reader_error_explanation(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str402$Trying_to_read_this_generated_an_);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_princ(string);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 93927L)
    public static SubLObject cb_show_symbols_for_invalid_constants(SubLObject sentence_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sentence_string = string_utilities.trim_whitespace(sentence_string);
        thread.resetMultipleValues();
        final SubLObject sentence = reader.read_from_string_ignoring_errors(sentence_string, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.$kw394$EOF, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject read_sequence = string_utilities.substring(sentence_string, (SubLObject)cb_utilities.ZERO_INTEGER, end);
        final SubLObject unread_sequence = string_utilities.substring(sentence_string, end, Sequences.length(sentence_string));
        final SubLObject symbols_for_invalid_constants = cycl_utilities.expression_gather(sentence, (SubLObject)cb_utilities.$sym403$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str404$The_following_references_to_const);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        SubLObject cdolist_list_var = symbols_for_invalid_constants;
        SubLObject symbol = (SubLObject)cb_utilities.NIL;
        symbol = cdolist_list_var.first();
        while (cb_utilities.NIL != cdolist_list_var) {
            final SubLObject invalid_name = Symbols.symbol_name(symbol);
            final SubLObject position = Sequences.search(invalid_name, sentence_string, Symbols.symbol_function((SubLObject)cb_utilities.$sym405$CHAR_EQUAL), (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
            final SubLObject invalid_constant_name = Sequences.subseq(sentence_string, position, Numbers.add(position, Sequences.length(invalid_name)));
            if (!symbol.eql(symbols_for_invalid_constants.first())) {
                html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
            }
            html_utilities.html_princ(invalid_constant_name);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str406$in_the_following_string__);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_show_string_with_invalid_constants_highlighted(read_sequence, (SubLObject)cb_utilities.T);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        if (cb_utilities.NIL == string_utilities.empty_stringP(unread_sequence)) {
            html_utilities.html_newline((SubLObject)cb_utilities.TWO_INTEGER);
            html_utilities.html_princ_strong((SubLObject)cb_utilities.$str407$Also__the_following_extra_string_);
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_princ(unread_sequence);
            }
            finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 95440L)
    public static SubLObject cb_show_non_sentence_explanation(SubLObject sentence_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sentence_string = string_utilities.trim_whitespace(sentence_string);
        thread.resetMultipleValues();
        final SubLObject sentence = reader.read_from_string_ignoring_errors(sentence_string, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.$kw394$EOF, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject read_sequence = string_utilities.substring(sentence_string, (SubLObject)cb_utilities.ZERO_INTEGER, end);
        final SubLObject unread_sequence = string_utilities.substring(sentence_string, end, Sequences.length(sentence_string));
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str408$The_following_string_did_not_spec);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_princ(read_sequence);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        html_utilities.html_princ_strong((SubLObject)cb_utilities.$str409$because__);
        html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
            html_utilities.html_princ(el_grammar.why_not_el_sentence(sentence));
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        if (cb_utilities.NIL == string_utilities.empty_stringP(unread_sequence)) {
            html_utilities.html_newline((SubLObject)cb_utilities.TWO_INTEGER);
            html_utilities.html_princ_strong((SubLObject)cb_utilities.$str407$Also__the_following_extra_string_);
            html_utilities.html_newline((SubLObject)cb_utilities.UNPROVIDED);
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind((SubLObject)cb_utilities.T, thread);
                html_utilities.html_princ(unread_sequence);
            }
            finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        }
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 96304L)
    public static SubLObject cb_fort_encoding_id(final SubLObject fort) {
        return cb_fort_identifier(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 96407L)
    public static SubLObject cb_fort_list_selector(final SubLObject label, final SubLObject v_forts, SubLObject selected_instance, SubLObject size, SubLObject filterfn, SubLObject choice_not_required, SubLObject none_selected_text) {
        if (selected_instance == cb_utilities.UNPROVIDED) {
            selected_instance = (SubLObject)cb_utilities.NIL;
        }
        if (size == cb_utilities.UNPROVIDED) {
            size = (SubLObject)cb_utilities.ONE_INTEGER;
        }
        if (filterfn == cb_utilities.UNPROVIDED) {
            filterfn = Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY);
        }
        if (choice_not_required == cb_utilities.UNPROVIDED) {
            choice_not_required = (SubLObject)cb_utilities.NIL;
        }
        if (none_selected_text == cb_utilities.UNPROVIDED) {
            none_selected_text = (SubLObject)cb_utilities.$str410$____none_selected____;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(label);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != size) {
            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(size);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            if (cb_utilities.NIL != choice_not_required) {
                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                    html_utilities.html_princ(none_selected_text);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                }
                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
            }
            SubLObject cdolist_list_var = v_forts;
            SubLObject curr = (SubLObject)cb_utilities.NIL;
            curr = cdolist_list_var.first();
            while (cb_utilities.NIL != cdolist_list_var) {
                if (cb_utilities.NIL != Functions.funcall(filterfn, curr)) {
                    final SubLObject encoding_id = cb_fort_encoding_id(curr);
                    final SubLObject selectedP = Equality.eql(curr, selected_instance);
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (cb_utilities.NIL != selectedP) {
                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                    }
                    if (cb_utilities.NIL != encoding_id) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                        html_utilities.html_markup(encoding_id);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
                        html_utilities.html_princ(kb_paths.fort_name(curr));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return v_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 97590L)
    public static SubLObject cb_decode_fort_list_selector_result(final SubLObject label, final SubLObject html_args) {
        return cb_guess_fort(html_utilities.html_extract_input(label, html_args), (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 97798L)
    public static SubLObject cb_fort_list_none_selected_p(final SubLObject v_object) {
        return Types.sublisp_null(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 98014L)
    public static SubLObject cb_instances_of_collection_selector(final SubLObject label, final SubLObject collection, SubLObject selected_instance, SubLObject size, SubLObject filterfn) {
        if (selected_instance == cb_utilities.UNPROVIDED) {
            selected_instance = (SubLObject)cb_utilities.NIL;
        }
        if (size == cb_utilities.UNPROVIDED) {
            size = (SubLObject)cb_utilities.ONE_INTEGER;
        }
        if (filterfn == cb_utilities.UNPROVIDED) {
            filterfn = Symbols.symbol_function((SubLObject)cb_utilities.IDENTITY);
        }
        return cb_fort_list_selector(label, isa.all_fort_instances(collection, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED), selected_instance, size, filterfn, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 98489L)
    public static SubLObject cb_decode_instances_of_collection_selector(final SubLObject label, final SubLObject html_args) {
        return cb_decode_fort_list_selector_result(label, html_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 98710L)
    public static SubLObject cyclist_recent_terms(final SubLObject cyclist) {
        final SubLObject machines = html_kernel.machines_with_html_state();
        SubLObject result = (SubLObject)cb_utilities.NIL;
        SubLObject cdolist_list_var = machines;
        SubLObject machine = (SubLObject)cb_utilities.NIL;
        machine = cdolist_list_var.first();
        while (cb_utilities.NIL != cdolist_list_var) {
            final SubLObject this_cyclist = html_kernel.html_var_value((SubLObject)cb_utilities.$sym411$_THE_CYCLIST_, machine);
            if (this_cyclist.eql(cyclist)) {
                result = (SubLObject)ConsesLow.cons(html_kernel.html_var_value((SubLObject)cb_utilities.$sym412$_CB_NAT_HISTORY_, machine), result);
                result = (SubLObject)ConsesLow.cons(html_kernel.html_var_value((SubLObject)cb_utilities.$sym413$_CB_CONSTANT_HISTORY_, machine), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            machine = cdolist_list_var.first();
        }
        if (cb_utilities.NIL != result) {
            result = Functions.apply(Symbols.symbol_function((SubLObject)cb_utilities.$sym222$CCONCATENATE), Sequences.nreverse(result));
        }
        return list_utilities.hash_remove_duplicates(result, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 99665L)
    public static SubLObject cb_inactive_left_arrow() {
        return cb_directional_arrow_marker((SubLObject)cb_utilities.$kw417$INACTIVE_LEFT_ARROW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 99771L)
    public static SubLObject cb_inactive_right_arrow() {
        return cb_directional_arrow_marker((SubLObject)cb_utilities.$kw423$INACTIVE_RIGHT_ARROW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 99878L)
    public static SubLObject cb_left_arrow(final SubLObject url, final SubLObject link_text, SubLObject frame) {
        if (frame == cb_utilities.UNPROVIDED) {
            frame = (SubLObject)cb_utilities.$kw76$TOP;
        }
        return cb_directional_arrow((SubLObject)cb_utilities.$kw414$ACTIVE_LEFT_ARROW, url, link_text, frame);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 100022L)
    public static SubLObject cb_right_arrow(final SubLObject url, final SubLObject link_text, SubLObject frame) {
        if (frame == cb_utilities.UNPROVIDED) {
            frame = (SubLObject)cb_utilities.$kw76$TOP;
        }
        return cb_directional_arrow((SubLObject)cb_utilities.$kw420$ACTIVE_RIGHT_ARROW, url, link_text, frame);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 100167L)
    public static SubLObject cb_directional_arrow(final SubLObject arrow_icon, SubLObject url, final SubLObject link_text, final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_utilities.$kw76$TOP == frame) {
            url = Sequences.cconcatenate((SubLObject)cb_utilities.$str142$cb_start_, url);
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_utilities.$str426$_a, url);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != link_text) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(link_text);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
            cb_directional_arrow_marker(arrow_icon);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-utilities.lisp", position = 100440L)
    public static SubLObject cb_directional_arrow_marker(final SubLObject arrow_icon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(arrow_icon);
        final SubLObject align = (SubLObject)cb_utilities.$kw76$TOP;
        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(arrow_icon);
        final SubLObject border = (SubLObject)cb_utilities.ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        if (cb_utilities.NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        if (cb_utilities.NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_utilities.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        return (SubLObject)cb_utilities.NIL;
    }
    
    public static SubLObject declare_cb_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_url", "CB-URL", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_error", "CB-ERROR", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_fi_error", "CB-SHOW-FI-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_simple_message_page", "CB-SIMPLE-MESSAGE-PAGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_history_with_back_link", "CB-HISTORY-WITH-BACK-LINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_message_page_with_history", "CB-MESSAGE-PAGE-WITH-HISTORY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_titled_message_page_with_history", "CB-TITLED-MESSAGE-PAGE-WITH-HISTORY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_frame_update_message_page_info", "CB-FRAME-UPDATE-MESSAGE-PAGE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_truth", "CB-SHOW-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_strength", "CB-SHOW-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_direction", "CB-SHOW-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_support_module", "CB-SHOW-SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_term_font_size", "CB-TERM-FONT-SIZE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_date", "CB-SHOW-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_second", "CB-SHOW-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_cyclist", "CB-SHOW-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "clear_cb_html_for_cyclist_in_nl", "CLEAR-CB-HTML-FOR-CYCLIST-IN-NL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "remove_cb_html_for_cyclist_in_nl", "REMOVE-CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_html_for_cyclist_in_nl_internal", "CB-HTML-FOR-CYCLIST-IN-NL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_html_for_cyclist_in_nl", "CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cyc_system_doc_rename_kill", "CYC-SYSTEM-DOC-RENAME-KILL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cyc_system_doc_naming_conventions", "CYC-SYSTEM-DOC-NAMING-CONVENTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cyc_documentation_toc", "CYC-DOCUMENTATION-TOC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_doc_link", "CB-DOC-LINK", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_boolean", "CB-SHOW-BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "boolean_yes_no_string", "BOOLEAN-YES-NO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_available_tools", "CB-AVAILABLE-TOOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_standard_tools", "CB-STANDARD-TOOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_deprecated_tools", "CB-DEPRECATED-TOOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_clear_available_tools", "CB-CLEAR-AVAILABLE-TOOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "declare_cb_tool", "DECLARE-CB-TOOL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "declare_deprecated_cb_tool", "DECLARE-DEPRECATED-CB-TOOL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "undeclare_cb_tool", "UNDECLARE-CB-TOOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_tool_name", "CB-TOOL-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_tool_abbreviation", "CB-TOOL-ABBREVIATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_definitional_preds_for_type", "CB-DEFINITIONAL-PREDS-FOR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_definitional_preds_for_fort", "CB-DEFINITIONAL-PREDS-FOR-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_sort_preds_for_display", "CB-SORT-PREDS-FOR-DISPLAY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_sort_mts_for_display", "CB-SORT-MTS-FOR-DISPLAY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "mt_start_universal_time_extended", "MT-START-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "mt_end_universal_time_extended", "MT-END-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "get_mt_time_interval_memoized_internal", "GET-MT-TIME-INTERVAL-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "get_mt_time_interval_memoized", "GET-MT-TIME-INTERVAL-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "maybe_cycl_second_to_universal_time_extended_internal", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "maybe_cycl_second_to_universal_time_extended", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "maybe_cycl_second_to_universal_time_extended_low", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-LOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_sort_args_for_display", "CB-SORT-ARGS-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_group_hlmts_by_monad_mt", "CB-GROUP-HLMTS-BY-MONAD-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_back_button", "CB-BACK-BUTTON", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "register_cb_frame", "REGISTER-CB-FRAME", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "deregister_cb_frame", "DEREGISTER-CB-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_frame_info", "CB-FRAME-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_frame_name", "CB-FRAME-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_frame", "CB-FRAME", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link", "CB-LINK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "setup_cb_link_method", "SETUP-CB-LINK-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_method", "CB-LINK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_max_args", "CB-LINK-MAX-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_constant", "CB-LINK-CONSTANT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_nat_span_id", "CB-NAT-SPAN-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_nart", "CB-LINK-NART", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_nat", "CB-LINK-NAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_naut", "CB-LINK-NAUT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_naut_href", "CB-NAUT-HREF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_lexicon", "CB-LINK-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_unnamed", "CB-LINK-UNNAMED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_assertion", "CB-LINK-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_method_assertion_internal", "CB-LINK-METHOD-ASSERTION-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_utility_color", "CB-ASSERTION-UTILITY-COLOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "clear_html_saturated_red_color", "CLEAR-HTML-SATURATED-RED-COLOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "remove_html_saturated_red_color", "REMOVE-HTML-SATURATED-RED-COLOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_saturated_red_color_internal", "HTML-SATURATED-RED-COLOR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_saturated_red_color", "HTML-SATURATED-RED-COLOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "clear_html_saturated_green_color", "CLEAR-HTML-SATURATED-GREEN-COLOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "remove_html_saturated_green_color", "REMOVE-HTML-SATURATED-GREEN-COLOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_saturated_green_color_internal", "HTML-SATURATED-GREEN-COLOR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_saturated_green_color", "HTML-SATURATED-GREEN-COLOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_ball", "CB-ASSERTION-BALL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "assertion_marker", "ASSERTION-MARKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_assertion_marker", "HTML-ASSERTION-MARKER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_assertion_marker_tooltip_text", "HTML-ASSERTION-MARKER-TOOLTIP-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "clear_generate_phrase_for_cyclist", "CLEAR-GENERATE-PHRASE-FOR-CYCLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "remove_generate_phrase_for_cyclist", "REMOVE-GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "generate_phrase_for_cyclist_internal", "GENERATE-PHRASE-FOR-CYCLIST-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "generate_phrase_for_cyclist", "GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_sentence", "CB-LINK-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "html_sentence_marker", "HTML-SENTENCE-MARKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_determine_help_target", "CB-DETERMINE-HELP-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_help", "CB-HELP", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_help_preamble", "CB-HELP-PREAMBLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form", "CB-FORM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_variable_method", "CB-FORM-VARIABLE-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_symbol_method", "CB-FORM-SYMBOL-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_constant_method", "CB-FORM-CONSTANT-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_nart_method", "CB-FORM-NART-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_assertion_method", "CB-FORM-ASSERTION-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_assertion_hl_formula", "CB-FORM-ASSERTION-HL-FORMULA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_invalid_assertion", "CB-FORM-INVALID-ASSERTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_assertion_formula", "CB-FORM-ASSERTION-FORMULA", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_assertion_edit_formula", "CB-FORM-ASSERTION-EDIT-FORMULA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_string_method", "CB-FORM-STRING-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "print_cb_form_cons_methods", "PRINT-CB-FORM-CONS-METHODS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_print_function_trampoline", "CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_p", "CB-FORM-CONS-METHOD-P", 1, 0, false);
        new $cb_form_cons_method_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_name", "CB-FORM-CONS-METHOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_keyword", "CB-FORM-CONS-METHOD-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_applicability_test_fn", "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_html_output_fn", "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "_csetf_cb_form_cons_method_name", "_CSETF-CB-FORM-CONS-METHOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "_csetf_cb_form_cons_method_keyword", "_CSETF-CB-FORM-CONS-METHOD-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "_csetf_cb_form_cons_method_applicability_test_fn", "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "_csetf_cb_form_cons_method_html_output_fn", "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "make_cb_form_cons_method", "MAKE-CB-FORM-CONS-METHOD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "visit_defstruct_cb_form_cons_method", "VISIT-DEFSTRUCT-CB-FORM-CONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "visit_defstruct_object_cb_form_cons_method_method", "VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_utilities", "defcb_form_cons_method", "DEFCB-FORM-CONS-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "register_cb_form_cons_method", "REGISTER-CB-FORM-CONS-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_utilities", "with_cb_form_cons_methods", "WITH-CB-FORM-CONS-METHODS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "compute_cb_form_cons_methods_active", "COMPUTE-CB-FORM-CONS-METHODS-ACTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_methods_active", "CB-FORM-CONS-METHODS-ACTIVE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "declare_cb_form_cons_method_always_active", "DECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "always_active_cb_form_cons_methods", "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method_keyword_to_cb_form_cons_method", "CB-FORM-CONS-METHOD-KEYWORD-TO-CB-FORM-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "top_level_cb_form_url", "TOP-LEVEL-CB-FORM-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_string", "CB-FORM-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "get_url_prefix_for_url_type", "GET-URL-PREFIX-FOR-URL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_formula_argument_limit_exceededP", "CB-FORMULA-ARGUMENT-LIMIT-EXCEEDED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_method", "CB-FORM-CONS-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_internal", "CB-FORM-CONS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_cons_inter_arg_space", "CB-FORM-CONS-INTER-ARG-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_date_to_optimize_for_displayP", "CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_date_optimized_for_display", "CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_possibly_optimize_date_for_display", "CB-POSSIBLY-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_optimize_date_for_display", "CB-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_decimal_to_optimize_for_displayP", "CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_decimal_optimized_for_display", "CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_optimize_decimal_for_display", "CB-OPTIMIZE-DECIMAL-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "simple_el_decimal_p", "SIMPLE-EL-DECIMAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_fraction_to_optimize_for_displayP", "CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_fraction_optimized_for_display", "CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "optimized_html_for_fraction", "OPTIMIZED-HTML-FOR-FRACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_hl_support_to_displayP", "CB-HL-SUPPORT-TO-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_hl_support_for_cons_method", "CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_unimplemented", "CB-UNIMPLEMENTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_link_unimplemented", "CB-LINK-UNIMPLEMENTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_form_item_list", "CB-FORM-ITEM-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_assertion_in_nl", "CB-SHOW-ASSERTION-IN-NL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_sentence_in_nl", "CB-SHOW-SENTENCE-IN-NL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_question_in_nl", "CB-SHOW-QUESTION-IN-NL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_term_in_nl", "CB-SHOW-TERM-IN-NL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_in_nl_int", "CB-SHOW-IN-NL-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_html_for_obj_in_nl", "CB-HTML-FOR-OBJ-IN-NL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_html_for_obj_in_nl_values", "CB-HTML-FOR-OBJ-IN-NL-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_term", "CB-SHOW-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_assertion_readably", "CB-SHOW-ASSERTION-READABLY", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_utilities", "when_filtered_assertion", "WHEN-FILTERED-ASSERTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_utilities", "without_assertion_filters", "WITHOUT-ASSERTION-FILTERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_link", "CB-ASSERTION-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_link_with_mt", "CB-ASSERTION-LINK-WITH-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_link_binary", "CB-ASSERTION-LINK-BINARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_hl_support_readably", "CB-SHOW-HL-SUPPORT-READABLY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_hl_support_formula_readably", "CB-SHOW-HL-SUPPORT-FORMULA-READABLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_el_assertion_readably", "CB-SHOW-EL-ASSERTION-READABLY", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_el_formula", "CB-ASSERTION-EL-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_el_assertion_link_checking_redundancy", "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_el_assertion_link_with_mt_checking_redundancy", "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_el_assertion_link_binary_checking_redundancy", "CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_term_of_unit_link", "CB-TERM-OF-UNIT-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_index_hook_p", "CB-INDEX-HOOK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_index_identifier", "CB-INDEX-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_fort_identifier", "CB-FORT-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_identifier", "CB-ASSERTION-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_term_identifier", "CB-TERM-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_valid_fort_identifierP", "CB-VALID-FORT-IDENTIFIER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_hlmt_identifier", "CB-HLMT-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_valid_hlmt_identifierP", "CB-VALID-HLMT-IDENTIFIER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_constant", "CB-GUESS-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_constant_from_string", "CB-GUESS-CONSTANT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_nart", "CB-GUESS-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_nat", "CB-GUESS-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_fort_display_string", "CB-FORT-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_fort", "CB-STRING-FOR-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_fort", "CB-GUESS-FORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_fort_from_id", "CB-GUESS-FORT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_fort_from_non_id", "CB-GUESS-FORT-FROM-NON-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_naut_identifierP", "CB-NAUT-IDENTIFIER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_naut_identifier", "CB-NAUT-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_naut_identifier_string", "CB-NAUT-IDENTIFIER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_naut_display_string", "CB-NAUT-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_naut", "CB-STRING-FOR-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_naut", "CB-GUESS-NAUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_naut_spec", "CB-GUESS-NAUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_sentence_identifierP", "CB-SENTENCE-IDENTIFIER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_sentence_identifier_string", "CB-SENTENCE-IDENTIFIER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_sentence", "CB-STRING-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_sentence", "CB-GUESS-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_identifierP", "CB-ASSERTION-IDENTIFIER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_assertion_identifier_string", "CB-ASSERTION-IDENTIFIER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_assertion", "CB-STRING-FOR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_term_display_string", "CB-TERM-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_term", "CB-STRING-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_term", "CB-GUESS-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_hlmt_display_string", "CB-HLMT-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_hlmt", "CB-STRING-FOR-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_hlmt", "CB-GUESS-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_date", "CB-GUESS-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_time_parameter", "CB-GUESS-TIME-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_time_interval_display_string", "CB-TIME-INTERVAL-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_time_parameter_display_string", "CB-TIME-PARAMETER-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_assertion_hlmt_readably", "CB-SHOW-ASSERTION-HLMT-READABLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_assertion_hlmt_time_interval_and_parameter", "CB-SHOW-ASSERTION-HLMT-TIME-INTERVAL-AND-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_mt_display_string", "CB-MT-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_string_for_mt", "CB-STRING-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_mt", "CB-GUESS-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_index", "CB-GUESS-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_assertion", "CB-GUESS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_guess_deduction", "CB-GUESS-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "prompt_for_simple_date", "PROMPT-FOR-SIMPLE-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "read_args_for_simple_date", "READ-ARGS-FOR-SIMPLE-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "read_multiple_terms_from_string", "READ-MULTIPLE-TERMS-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "asserted_reviewer", "ASSERTED-REVIEWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_unmatched_parentheses", "CB-SHOW-UNMATCHED-PARENTHESES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_invalid_constants", "CB-SHOW-INVALID-CONSTANTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_eof_explanation", "CB-SHOW-EOF-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_reader_error_explanation", "CB-SHOW-READER-ERROR-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_symbols_for_invalid_constants", "CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_show_non_sentence_explanation", "CB-SHOW-NON-SENTENCE-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_fort_encoding_id", "CB-FORT-ENCODING-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_fort_list_selector", "CB-FORT-LIST-SELECTOR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_decode_fort_list_selector_result", "CB-DECODE-FORT-LIST-SELECTOR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_fort_list_none_selected_p", "CB-FORT-LIST-NONE-SELECTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_instances_of_collection_selector", "CB-INSTANCES-OF-COLLECTION-SELECTOR", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_decode_instances_of_collection_selector", "CB-DECODE-INSTANCES-OF-COLLECTION-SELECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cyclist_recent_terms", "CYCLIST-RECENT-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_inactive_left_arrow", "CB-INACTIVE-LEFT-ARROW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_inactive_right_arrow", "CB-INACTIVE-RIGHT-ARROW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_left_arrow", "CB-LEFT-ARROW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_right_arrow", "CB-RIGHT-ARROW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_directional_arrow", "CB-DIRECTIONAL-ARROW", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_utilities", "cb_directional_arrow_marker", "CB-DIRECTIONAL-ARROW-MARKER", 1, 0, false);
        return (SubLObject)cb_utilities.NIL;
    }
    
    public static SubLObject init_cb_utilities_file() {
        cb_utilities.$cb_html_for_cyclist_in_nl_caching_state$ = SubLFiles.deflexical("*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_available_tools$ = SubLFiles.deflexical("*CB-AVAILABLE-TOOLS*", (SubLObject)(maybeDefault((SubLObject)cb_utilities.$sym51$_CB_AVAILABLE_TOOLS_, cb_utilities.$cb_available_tools$, cb_utilities.NIL)));
        cb_utilities.$cb_c_definitional_type_pred_map$ = SubLFiles.deflexical("*CB-C-DEFINITIONAL-TYPE-PRED-MAP*", (SubLObject)cb_utilities.$list57);
        cb_utilities.$cb_max_mts_to_sort_temporally$ = SubLFiles.defparameter("*CB-MAX-MTS-TO-SORT-TEMPORALLY*", (SubLObject)cb_utilities.$int6$2000);
        cb_utilities.$cb_back_button_predefined_script$ = SubLFiles.deflexical("*CB-BACK-BUTTON-PREDEFINED-SCRIPT*", (SubLObject)cb_utilities.$str73$onClick___A_history_back____);
        cb_utilities.$cb_back_button_script$ = SubLFiles.deflexical("*CB-BACK-BUTTON-SCRIPT*", (SubLObject)cb_utilities.$str74$onClick__var_frame_name_____A___i);
        cb_utilities.$cb_frame_table$ = SubLFiles.deflexical("*CB-FRAME-TABLE*", (SubLObject)(maybeDefault((SubLObject)cb_utilities.$sym80$_CB_FRAME_TABLE_, cb_utilities.$cb_frame_table$, cb_utilities.NIL)));
        cb_utilities.$max_cb_link_arg_count$ = SubLFiles.deflexical("*MAX-CB-LINK-ARG-COUNT*", (SubLObject)cb_utilities.FIVE_INTEGER);
        cb_utilities.$cb_default_fort_handler$ = SubLFiles.defparameter("*CB-DEFAULT-FORT-HANDLER*", (SubLObject)cb_utilities.$str137$cb_cf);
        cb_utilities.$cb_default_fort_link_emitter$ = SubLFiles.defparameter("*CB-DEFAULT-FORT-LINK-EMITTER*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_show_constant_hash_dollar_prefixP$ = SubLFiles.defparameter("*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_term_id$ = SubLFiles.defparameter("*CB-TERM-ID*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_default_naut_handler$ = SubLFiles.defparameter("*CB-DEFAULT-NAUT-HANDLER*", (SubLObject)cb_utilities.$str158$cb_naut_frame);
        cb_utilities.$html_saturated_red_color_caching_state$ = SubLFiles.deflexical("*HTML-SATURATED-RED-COLOR-CACHING-STATE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$html_saturated_green_color_caching_state$ = SubLFiles.deflexical("*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$generate_phrase_for_cyclist_caching_state$ = SubLFiles.deflexical("*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_just_did_nat$ = SubLFiles.defparameter("*CB-JUST-DID-NAT*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_just_did_quote$ = SubLFiles.defparameter("*CB-JUST-DID-QUOTE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_inside_quoteP$ = SubLFiles.defparameter("*CB-INSIDE-QUOTE?*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_inside_naut$ = SubLFiles.defparameter("*CB-INSIDE-NAUT*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_inside_naut_support_enabledP$ = SubLFiles.defparameter("*CB-INSIDE-NAUT-SUPPORT-ENABLED?*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_form_cons_suppress_newline$ = SubLFiles.defparameter("*CB-FORM-CONS-SUPPRESS-NEWLINE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_form_method_table$ = SubLFiles.deflexical("*CB-FORM-METHOD-TABLE*", Vectors.make_vector((SubLObject)cb_utilities.$int177$256, (SubLObject)cb_utilities.NIL));
        cb_utilities.$rule_unlabelled_dont_care_variables$ = SubLFiles.defparameter("*RULE-UNLABELLED-DONT-CARE-VARIABLES*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$allow_cb_assertion_for_the_assertion_sentence_replacementP$ = SubLFiles.defparameter("*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$ = SubLFiles.defparameter("*CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_string_length_wrap$ = SubLFiles.defparameter("*CB-STRING-LENGTH-WRAP*", (SubLObject)cb_utilities.$int253$60);
        cb_utilities.$cb_wrap_after_arg_1$ = SubLFiles.defparameter("*CB-WRAP-AFTER-ARG-1*", (SubLObject)cb_utilities.$list255);
        cb_utilities.$cb_form_cons_methods_active$ = SubLFiles.defparameter("*CB-FORM-CONS-METHODS-ACTIVE*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_form_cons_methods$ = SubLFiles.deflexical("*CB-FORM-CONS-METHODS*", (SubLObject)(maybeDefault((SubLObject)cb_utilities.$sym256$_CB_FORM_CONS_METHODS_, cb_utilities.$cb_form_cons_methods$, cb_utilities.NIL)));
        cb_utilities.$cb_form_cons_methods_by_keyword$ = SubLFiles.deflexical("*CB-FORM-CONS-METHODS-BY-KEYWORD*", maybeDefault((SubLObject)cb_utilities.$sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_, cb_utilities.$cb_form_cons_methods_by_keyword$, ()->(Hashtables.make_hash_table((SubLObject)cb_utilities.TEN_INTEGER, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED))));
        cb_utilities.$dtp_cb_form_cons_method$ = SubLFiles.defconstant("*DTP-CB-FORM-CONS-METHOD*", (SubLObject)cb_utilities.$sym258$CB_FORM_CONS_METHOD);
        cb_utilities.$always_active_cb_form_cons_methods$ = SubLFiles.defparameter("*ALWAYS-ACTIVE-CB-FORM-CONS-METHODS*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_form_suppress_naut_link_functions$ = SubLFiles.defvar("*CB-FORM-SUPPRESS-NAUT-LINK-FUNCTIONS*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_just_did_naut$ = SubLFiles.defparameter("*CB-JUST-DID-NAUT*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_formula_argument_limit$ = SubLFiles.defparameter("*CB-FORMULA-ARGUMENT-LIMIT*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_display_dates_as_stringsP$ = SubLFiles.defparameter("*CB-DISPLAY-DATES-AS-STRINGS?*", (SubLObject)cb_utilities.T);
        cb_utilities.$cb_display_decimals_as_decimalsP$ = SubLFiles.defparameter("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*", (SubLObject)cb_utilities.T);
        cb_utilities.$cb_display_fractions_as_fractionsP$ = SubLFiles.defparameter("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*", (SubLObject)cb_utilities.T);
        cb_utilities.$assertion_filter_hook$ = SubLFiles.defparameter("*ASSERTION-FILTER-HOOK*", (SubLObject)cb_utilities.NIL);
        cb_utilities.$cb_constant_id_prefix$ = SubLFiles.deflexical("*CB-CONSTANT-ID-PREFIX*", (SubLObject)cb_utilities.$str375$c);
        cb_utilities.$cb_nart_id_prefix$ = SubLFiles.deflexical("*CB-NART-ID-PREFIX*", (SubLObject)cb_utilities.$str376$nart);
        cb_utilities.$cb_assertion_id_prefix$ = SubLFiles.deflexical("*CB-ASSERTION-ID-PREFIX*", (SubLObject)cb_utilities.$str377$a);
        cb_utilities.$cb_assertion_id_prefix_length$ = SubLFiles.deflexical("*CB-ASSERTION-ID-PREFIX-LENGTH*", Sequences.length(cb_utilities.$cb_assertion_id_prefix$.getGlobalValue()));
        cb_utilities.$cb_image_independent_fort_identifiersP$ = SubLFiles.deflexical("*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*", (SubLObject)(maybeDefault((SubLObject)cb_utilities.$sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__, cb_utilities.$cb_image_independent_fort_identifiersP$, cb_utilities.NIL)));
        cb_utilities.$cb_image_independent_id_marker$ = SubLFiles.deflexical("*CB-IMAGE-INDEPENDENT-ID-MARKER*", string_utilities.substring(kb_utilities.compact_hl_external_id_string((SubLObject)cb_utilities.ONE_INTEGER), (SubLObject)cb_utilities.ZERO_INTEGER, (SubLObject)cb_utilities.ONE_INTEGER));
        cb_utilities.$cb_image_independent_constant_id_prefix$ = SubLFiles.deflexical("*CB-IMAGE-INDEPENDENT-CONSTANT-ID-PREFIX*", Sequences.cconcatenate(cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), cb_utilities.$cb_image_independent_id_marker$.getGlobalValue()));
        cb_utilities.$cb_image_independent_nart_id_prefix$ = SubLFiles.deflexical("*CB-IMAGE-INDEPENDENT-NART-ID-PREFIX*", Sequences.cconcatenate(cb_utilities.$cb_nart_id_prefix$.getGlobalValue(), cb_utilities.$cb_image_independent_id_marker$.getGlobalValue()));
        cb_utilities.$cb_naut_id_prefix$ = SubLFiles.deflexical("*CB-NAUT-ID-PREFIX*", (SubLObject)cb_utilities.$str385$naut);
        cb_utilities.$cb_naut_id_prefix_length$ = SubLFiles.deflexical("*CB-NAUT-ID-PREFIX-LENGTH*", Sequences.length(cb_utilities.$cb_naut_id_prefix$.getGlobalValue()));
        cb_utilities.$cb_sentence_id_prefix$ = SubLFiles.deflexical("*CB-SENTENCE-ID-PREFIX*", (SubLObject)cb_utilities.$str386$sentence);
        cb_utilities.$cb_sentence_id_prefix_length$ = SubLFiles.deflexical("*CB-SENTENCE-ID-PREFIX-LENGTH*", Sequences.length(cb_utilities.$cb_sentence_id_prefix$.getGlobalValue()));
        cb_utilities.$html_unmatched_parenthesis_color$ = SubLFiles.defparameter("*HTML-UNMATCHED-PARENTHESIS-COLOR*", (SubLObject)cb_utilities.$kw398$RED);
        return (SubLObject)cb_utilities.NIL;
    }
    
    public static SubLObject setup_cb_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)cb_utilities.$sym40$CB_HTML_FOR_CYCLIST_IN_NL);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_utilities.$sym51$_CB_AVAILABLE_TOOLS_);
        memoization_state.note_memoized_function((SubLObject)cb_utilities.$sym67$GET_MT_TIME_INTERVAL_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)cb_utilities.$sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_utilities.$sym80$_CB_FRAME_TABLE_);
        register_cb_frame((SubLObject)cb_utilities.$kw7$SELF, (SubLObject)cb_utilities.$str93$_self, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw78$PARENT, (SubLObject)cb_utilities.$str94$_parent, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw76$TOP, (SubLObject)cb_utilities.$str95$_top, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw96$BLANK, (SubLObject)cb_utilities.$str97$_blank, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw98$NEW, (SubLObject)cb_utilities.$str99$_new, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw100$DOC, (SubLObject)cb_utilities.$str101$doc, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw102$COMPLETION, (SubLObject)cb_utilities.$str103$completion, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw104$TOOLBAR, (SubLObject)cb_utilities.$str105$toolbar, (SubLObject)cb_utilities.$str106$cb_toolbar_frame, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.NIL);
        register_cb_frame((SubLObject)cb_utilities.$kw85$MAIN, (SubLObject)cb_utilities.$str107$cyc_main, (SubLObject)cb_utilities.$str108$cb_main_frame, (SubLObject)cb_utilities.$str109$__a, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw110$STATUS, (SubLObject)cb_utilities.$str111$status, (SubLObject)cb_utilities.$str112$cb_status_frame, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw113$INDEX, (SubLObject)cb_utilities.$str114$index, (SubLObject)cb_utilities.$str115$cb_index_frame, (SubLObject)cb_utilities.$str109$__a, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw116$CONTENT, (SubLObject)cb_utilities.$str117$content, (SubLObject)cb_utilities.$str118$cb_content_frame, (SubLObject)cb_utilities.$str109$__a, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw119$EMPTY, (SubLObject)cb_utilities.$str120$empty, (SubLObject)cb_utilities.$str121$cb_empty_frame, (SubLObject)cb_utilities.NIL, (SubLObject)cb_utilities.T, (SubLObject)cb_utilities.NIL);
        register_cb_frame((SubLObject)cb_utilities.$kw122$SETUP, (SubLObject)cb_utilities.$str123$setup, (SubLObject)cb_utilities.$str124$cb_setup_frame, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw125$INF_INDEX, (SubLObject)cb_utilities.$str126$inf_index, (SubLObject)cb_utilities.$str127$cb_inf_index_frame, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        register_cb_frame((SubLObject)cb_utilities.$kw128$INF_CONTENT, (SubLObject)cb_utilities.$str129$inf_content, (SubLObject)cb_utilities.$str130$cb_inf_content_frame, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED, (SubLObject)cb_utilities.UNPROVIDED);
        utilities_macros.register_html_state_variable((SubLObject)cb_utilities.$sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_utilities.$sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__);
        setup_cb_link_method((SubLObject)cb_utilities.$kw141$CONSTANT, (SubLObject)cb_utilities.$sym147$CB_LINK_CONSTANT, (SubLObject)cb_utilities.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_utilities.$kw148$NAT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str149$nat_png, (SubLObject)cb_utilities.$str88$));
        Hashtables.sethash((SubLObject)cb_utilities.$kw150$NART, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str151$nart_png, (SubLObject)cb_utilities.$str88$));
        setup_cb_link_method((SubLObject)cb_utilities.$kw150$NART, (SubLObject)cb_utilities.$sym156$CB_LINK_NART, (SubLObject)cb_utilities.THREE_INTEGER);
        setup_cb_link_method((SubLObject)cb_utilities.$kw148$NAT, (SubLObject)cb_utilities.$sym157$CB_LINK_NAT, (SubLObject)cb_utilities.TWO_INTEGER);
        setup_cb_link_method((SubLObject)cb_utilities.$kw159$NAUT, (SubLObject)cb_utilities.$sym160$CB_LINK_NAUT, (SubLObject)cb_utilities.THREE_INTEGER);
        setup_cb_link_method((SubLObject)cb_utilities.$kw162$LEXICON, (SubLObject)cb_utilities.$sym163$CB_LINK_LEXICON, (SubLObject)cb_utilities.ONE_INTEGER);
        setup_cb_link_method((SubLObject)cb_utilities.$kw167$UNNAMED, (SubLObject)cb_utilities.$sym168$CB_LINK_UNNAMED, (SubLObject)cb_utilities.ONE_INTEGER);
        setup_cb_link_method((SubLObject)cb_utilities.$kw171$ASSERTION, (SubLObject)cb_utilities.$sym172$CB_LINK_ASSERTION, (SubLObject)cb_utilities.ONE_INTEGER);
        memoization_state.note_globally_cached_function((SubLObject)cb_utilities.$sym178$HTML_SATURATED_RED_COLOR);
        memoization_state.note_globally_cached_function((SubLObject)cb_utilities.$sym182$HTML_SATURATED_GREEN_COLOR);
        Hashtables.sethash((SubLObject)cb_utilities.$kw27$DEFAULT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str185$yellow_gif, (SubLObject)cb_utilities.$str186$_Def_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw29$MONOTONIC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str187$white_gif, (SubLObject)cb_utilities.$str188$_Mon_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw189$DERIVED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str190$green_gif, (SubLObject)cb_utilities.$str191$_Inf_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw33$BACKWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str192$purple_gif, (SubLObject)cb_utilities.$str193$_B_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw31$FORWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str194$blue_gif, (SubLObject)cb_utilities.$str195$_F_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw196$REDUNDANT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str197$cyan_gif, (SubLObject)cb_utilities.$str198$_R_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw22$FALSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str199$red_gif, (SubLObject)cb_utilities.$str200$_False_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw35$CODE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str201$pink_gif, (SubLObject)cb_utilities.$str202$_Code_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw24$UNKNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str203$gray_gif, (SubLObject)cb_utilities.$str204$_Unknown_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw205$BACKWARD_GAF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str206$orange_gif, (SubLObject)cb_utilities.$str207$_BackwardGAF_));
        memoization_state.note_globally_cached_function((SubLObject)cb_utilities.$sym223$GENERATE_PHRASE_FOR_CYCLIST);
        setup_cb_link_method((SubLObject)cb_utilities.$kw229$SENTENCE, (SubLObject)cb_utilities.$sym230$CB_LINK_SENTENCE, (SubLObject)cb_utilities.TWO_INTEGER);
        Hashtables.sethash((SubLObject)cb_utilities.$kw231$SENTENCE_MARKER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str232$cyc_logo_3_t_gif, (SubLObject)cb_utilities.$str233$_CycL_));
        Hashtables.sethash((SubLObject)cb_utilities.$kw234$HELP, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str235$help_btn_s_gif, (SubLObject)cb_utilities.$str236$_Help_));
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym241$CB_FORM_VARIABLE_METHOD));
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym246$CB_FORM_SYMBOL_METHOD));
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym247$CB_FORM_CONSTANT_METHOD));
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym248$CB_FORM_NART_METHOD));
        utilities_macros.register_html_state_variable((SubLObject)cb_utilities.$sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_utilities.$sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym251$CB_FORM_ASSERTION_METHOD));
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym254$CB_FORM_STRING_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)cb_utilities.$sym256$_CB_FORM_CONS_METHODS_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_utilities.$sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_utilities.$dtp_cb_form_cons_method$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym265$CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_utilities.$list266);
        Structures.def_csetf((SubLObject)cb_utilities.$sym267$CB_FORM_CONS_METHOD_NAME, (SubLObject)cb_utilities.$sym268$_CSETF_CB_FORM_CONS_METHOD_NAME);
        Structures.def_csetf((SubLObject)cb_utilities.$sym269$CB_FORM_CONS_METHOD_KEYWORD, (SubLObject)cb_utilities.$sym270$_CSETF_CB_FORM_CONS_METHOD_KEYWORD);
        Structures.def_csetf((SubLObject)cb_utilities.$sym271$CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN, (SubLObject)cb_utilities.$sym272$_CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN);
        Structures.def_csetf((SubLObject)cb_utilities.$sym273$CB_FORM_CONS_METHOD_HTML_OUTPUT_FN, (SubLObject)cb_utilities.$sym274$_CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN);
        Equality.identity((SubLObject)cb_utilities.$sym258$CB_FORM_CONS_METHOD);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_utilities.$dtp_cb_form_cons_method$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym284$VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD));
        access_macros.register_macro_helper((SubLObject)cb_utilities.$sym286$REGISTER_CB_FORM_CONS_METHOD, (SubLObject)cb_utilities.$sym288$DEFCB_FORM_CONS_METHOD);
        access_macros.register_macro_helper((SubLObject)cb_utilities.$sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, (SubLObject)cb_utilities.$sym293$WITH_CB_FORM_CONS_METHODS);
        utilities_macros.register_html_state_variable((SubLObject)cb_utilities.$sym301$_CB_FORMULA_ARGUMENT_LIMIT_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_utilities.$sym301$_CB_FORMULA_ARGUMENT_LIMIT_);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_utilities.$sym258$CB_FORM_CONS_METHOD));
        register_cb_form_cons_method((SubLObject)cb_utilities.$sym307$DATE, (SubLObject)cb_utilities.$list308);
        declare_cb_form_cons_method_always_active((SubLObject)cb_utilities.$kw309$DATE);
        utilities_macros.register_html_state_variable((SubLObject)cb_utilities.$sym310$_CB_DISPLAY_DATES_AS_STRINGS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_utilities.$sym310$_CB_DISPLAY_DATES_AS_STRINGS__);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym312$CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY);
        register_cb_form_cons_method((SubLObject)cb_utilities.$sym315$DECIMAL, (SubLObject)cb_utilities.$list316);
        declare_cb_form_cons_method_always_active((SubLObject)cb_utilities.$kw317$DECIMAL);
        utilities_macros.register_html_state_variable((SubLObject)cb_utilities.$sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_utilities.$sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym320$CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY);
        register_cb_form_cons_method((SubLObject)cb_utilities.$sym321$FRACTION, (SubLObject)cb_utilities.$list322);
        declare_cb_form_cons_method_always_active((SubLObject)cb_utilities.$kw323$FRACTION);
        utilities_macros.register_html_state_variable((SubLObject)cb_utilities.$sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_utilities.$sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym326$CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym330$CB_HL_SUPPORT_TO_DISPLAY_);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_utilities.$sym331$CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD);
        html_macros.note_cgi_handler_function((SubLObject)cb_utilities.$sym336$CB_UNIMPLEMENTED, (SubLObject)cb_utilities.$kw337$HTML_HANDLER);
        setup_cb_link_method((SubLObject)cb_utilities.$kw339$UNIMPLEMENTED, (SubLObject)cb_utilities.$sym340$CB_LINK_UNIMPLEMENTED, (SubLObject)cb_utilities.ONE_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_utilities.$sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__);
        access_macros.define_obsolete_register((SubLObject)cb_utilities.$sym380$CB_GUESS_NAT, (SubLObject)cb_utilities.$list381);
        Hashtables.sethash((SubLObject)cb_utilities.$kw414$ACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str415$back_12_png, (SubLObject)cb_utilities.$str416$Active_left_arrow));
        Hashtables.sethash((SubLObject)cb_utilities.$kw417$INACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str418$back_12_disabled_png, (SubLObject)cb_utilities.$str419$Inactive_left_arrow));
        Hashtables.sethash((SubLObject)cb_utilities.$kw420$ACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str421$forward_12_png, (SubLObject)cb_utilities.$str422$Active_right_arrow));
        Hashtables.sethash((SubLObject)cb_utilities.$kw423$INACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.$str424$forward_12_disabled_png, (SubLObject)cb_utilities.$str425$Inactive_right_arrow));
        generic_testing.define_test_case_table_int((SubLObject)cb_utilities.$sym427$CB_GUESS_CONSTANT, (SubLObject)ConsesLow.list(new SubLObject[] { cb_utilities.$kw428$TEST, cb_utilities.NIL, cb_utilities.$kw429$OWNER, cb_utilities.NIL, cb_utilities.$kw430$CLASSES, cb_utilities.NIL, cb_utilities.$kw431$KB, cb_utilities.$kw432$TINY, cb_utilities.$kw433$WORKING_, cb_utilities.T }), (SubLObject)cb_utilities.$list434);
        generic_testing.define_test_case_table_int((SubLObject)cb_utilities.$sym435$CB_GUESS_DATE, (SubLObject)ConsesLow.list(new SubLObject[] { cb_utilities.$kw428$TEST, cb_utilities.NIL, cb_utilities.$kw429$OWNER, cb_utilities.NIL, cb_utilities.$kw430$CLASSES, cb_utilities.NIL, cb_utilities.$kw431$KB, cb_utilities.$kw436$FULL, cb_utilities.$kw433$WORKING_, cb_utilities.T }), (SubLObject)cb_utilities.$list437);
        return (SubLObject)cb_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_utilities_file();
    }
    
    static {
        me = (SubLFile)new cb_utilities();
        cb_utilities.$cb_html_for_cyclist_in_nl_caching_state$ = null;
        cb_utilities.$cb_available_tools$ = null;
        cb_utilities.$cb_c_definitional_type_pred_map$ = null;
        cb_utilities.$cb_max_mts_to_sort_temporally$ = null;
        cb_utilities.$cb_back_button_predefined_script$ = null;
        cb_utilities.$cb_back_button_script$ = null;
        cb_utilities.$cb_frame_table$ = null;
        cb_utilities.$max_cb_link_arg_count$ = null;
        cb_utilities.$cb_default_fort_handler$ = null;
        cb_utilities.$cb_default_fort_link_emitter$ = null;
        cb_utilities.$cb_show_constant_hash_dollar_prefixP$ = null;
        cb_utilities.$cb_term_id$ = null;
        cb_utilities.$cb_default_naut_handler$ = null;
        cb_utilities.$html_saturated_red_color_caching_state$ = null;
        cb_utilities.$html_saturated_green_color_caching_state$ = null;
        cb_utilities.$generate_phrase_for_cyclist_caching_state$ = null;
        cb_utilities.$cb_just_did_nat$ = null;
        cb_utilities.$cb_just_did_quote$ = null;
        cb_utilities.$cb_inside_quoteP$ = null;
        cb_utilities.$cb_inside_naut$ = null;
        cb_utilities.$cb_inside_naut_support_enabledP$ = null;
        cb_utilities.$cb_form_cons_suppress_newline$ = null;
        cb_utilities.$cb_form_method_table$ = null;
        cb_utilities.$rule_unlabelled_dont_care_variables$ = null;
        cb_utilities.$allow_cb_assertion_for_the_assertion_sentence_replacementP$ = null;
        cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$ = null;
        cb_utilities.$cb_string_length_wrap$ = null;
        cb_utilities.$cb_wrap_after_arg_1$ = null;
        cb_utilities.$cb_form_cons_methods_active$ = null;
        cb_utilities.$cb_form_cons_methods$ = null;
        cb_utilities.$cb_form_cons_methods_by_keyword$ = null;
        cb_utilities.$dtp_cb_form_cons_method$ = null;
        cb_utilities.$always_active_cb_form_cons_methods$ = null;
        cb_utilities.$cb_form_suppress_naut_link_functions$ = null;
        cb_utilities.$cb_just_did_naut$ = null;
        cb_utilities.$cb_formula_argument_limit$ = null;
        cb_utilities.$cb_display_dates_as_stringsP$ = null;
        cb_utilities.$cb_display_decimals_as_decimalsP$ = null;
        cb_utilities.$cb_display_fractions_as_fractionsP$ = null;
        cb_utilities.$assertion_filter_hook$ = null;
        cb_utilities.$cb_constant_id_prefix$ = null;
        cb_utilities.$cb_nart_id_prefix$ = null;
        cb_utilities.$cb_assertion_id_prefix$ = null;
        cb_utilities.$cb_assertion_id_prefix_length$ = null;
        cb_utilities.$cb_image_independent_fort_identifiersP$ = null;
        cb_utilities.$cb_image_independent_id_marker$ = null;
        cb_utilities.$cb_image_independent_constant_id_prefix$ = null;
        cb_utilities.$cb_image_independent_nart_id_prefix$ = null;
        cb_utilities.$cb_naut_id_prefix$ = null;
        cb_utilities.$cb_naut_id_prefix_length$ = null;
        cb_utilities.$cb_sentence_id_prefix$ = null;
        cb_utilities.$cb_sentence_id_prefix_length$ = null;
        cb_utilities.$html_unmatched_parenthesis_color$ = null;
        $str0$_a__a = SubLObjectFactory.makeString("~a?~a");
        $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str2$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw3$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str4$Cyc_error = SubLObjectFactory.makeString("Cyc error");
        $str5$_A = SubLObjectFactory.makeString("~A");
        $int6$2000 = SubLObjectFactory.makeInteger(2000);
        $kw7$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str8$Back_to_previous__stale__page = SubLObjectFactory.makeString("Back to previous (stale) page");
        $str9$Back_to_previous_page = SubLObjectFactory.makeString("Back to previous page");
        $kw10$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw11$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw12$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str13$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str14$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str15$button = SubLObjectFactory.makeString("button");
        $str16$reload = SubLObjectFactory.makeString("reload");
        $str17$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str18$Back_to__stale__ = SubLObjectFactory.makeString("Back to (stale) ");
        $str19$_page = SubLObjectFactory.makeString(" page");
        $kw20$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str21$True = SubLObjectFactory.makeString("True");
        $kw22$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str23$False = SubLObjectFactory.makeString("False");
        $kw24$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str25$Unknown = SubLObjectFactory.makeString("Unknown");
        $str26$___ = SubLObjectFactory.makeString("???");
        $kw27$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str28$Default = SubLObjectFactory.makeString("Default");
        $kw29$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $str30$Monotonic = SubLObjectFactory.makeString("Monotonic");
        $kw31$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str32$Forward = SubLObjectFactory.makeString("Forward");
        $kw33$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $str34$Backward = SubLObjectFactory.makeString("Backward");
        $kw35$CODE = SubLObjectFactory.makeKeyword("CODE");
        $str36$Code = SubLObjectFactory.makeString("Code");
        $str37$_S = SubLObjectFactory.makeString("~S");
        $int38$30 = SubLObjectFactory.makeInteger(30);
        $str39$_A__A___A = SubLObjectFactory.makeString("~A ~A, ~A");
        $sym40$CB_HTML_FOR_CYCLIST_IN_NL = SubLObjectFactory.makeSymbol("CB-HTML-FOR-CYCLIST-IN-NL");
        $sym41$HTML_GENERATE_PHRASE = SubLObjectFactory.makeSymbol("HTML-GENERATE-PHRASE");
        $sym42$_CB_HTML_FOR_CYCLIST_IN_NL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*");
        $str43$ref_renames_kills_html = SubLObjectFactory.makeString("ref/renames-kills.html");
        $str44$ref_cycl_syntax_html_naming_conve = SubLObjectFactory.makeString("ref/cycl-syntax.html#naming conventions");
        $str45$toc_html = SubLObjectFactory.makeString("toc.html");
        $str46$__For_detailed_help_and_warnings_ = SubLObjectFactory.makeString("--For detailed help and warnings about ~A, please read the ");
        $str47$_ = SubLObjectFactory.makeString("#");
        $str48$_documentation_ = SubLObjectFactory.makeString(" documentation.");
        $str49$Yes = SubLObjectFactory.makeString("Yes");
        $str50$No = SubLObjectFactory.makeString("No");
        $sym51$_CB_AVAILABLE_TOOLS_ = SubLObjectFactory.makeSymbol("*CB-AVAILABLE-TOOLS*");
        $kw52$DEPRECATED = SubLObjectFactory.makeKeyword("DEPRECATED");
        $sym53$NOT_EQL = SubLObjectFactory.makeSymbol("NOT-EQL");
        $sym54$FIFTH = SubLObjectFactory.makeSymbol("FIFTH");
        $kw55$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $sym56$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnNecessary")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userDocComment")) }), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg7Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg7QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg7Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg8Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg8QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg8Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg9Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg9QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg9Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg10Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg10QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg10Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg11Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg11QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg11Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg12Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg12QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg12Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fanOutArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("afterAdding")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("afterRemoving")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userDocComment")) }), (SubLObject)ConsesLow.list((SubLObject)cb_utilities.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userDocComment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userDocComment"))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFuncs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFunctions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArgIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userDocComment")) }));
        $sym58$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const59$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym60$VALID_FORT_ = SubLObjectFactory.makeSymbol("VALID-FORT?");
        $sym61$POTENTIALLY_INFINITE_INTEGER__ = SubLObjectFactory.makeSymbol("POTENTIALLY-INFINITE-INTEGER-<");
        $sym62$MT_START_UNIVERSAL_TIME_EXTENDED = SubLObjectFactory.makeSymbol("MT-START-UNIVERSAL-TIME-EXTENDED");
        $sym63$MT_END_UNIVERSAL_TIME_EXTENDED = SubLObjectFactory.makeSymbol("MT-END-UNIVERSAL-TIME-EXTENDED");
        $kw64$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym65$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym66$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym67$GET_MT_TIME_INTERVAL_MEMOIZED = SubLObjectFactory.makeSymbol("GET-MT-TIME-INTERVAL-MEMOIZED");
        $sym68$MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED = SubLObjectFactory.makeSymbol("MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED");
        $const69$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1900));
        $const71$SecondsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondsDuration"));
        $sym72$_ = SubLObjectFactory.makeSymbol("<");
        $str73$onClick___A_history_back____ = SubLObjectFactory.makeString("onClick=\"~A.history.back();\"");
        $str74$onClick__var_frame_name_____A___i = SubLObjectFactory.makeString("onClick=\"var frame_name = '~A'; if (top.frames[frame_name]) top.frames[frame_name].history.back();\"");
        $str75$Back = SubLObjectFactory.makeString("Back");
        $kw76$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str77$top = SubLObjectFactory.makeString("top");
        $kw78$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $str79$parent = SubLObjectFactory.makeString("parent");
        $sym80$_CB_FRAME_TABLE_ = SubLObjectFactory.makeSymbol("*CB-FRAME-TABLE*");
        $sym81$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym82$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str83$no = SubLObjectFactory.makeString("no");
        $sym84$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $kw85$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str86$cb_login = SubLObjectFactory.makeString("cb-login");
        $str87$cb_history = SubLObjectFactory.makeString("cb-history");
        $str88$ = SubLObjectFactory.makeString("");
        $list89 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-ARGS"));
        $str90$_ = SubLObjectFactory.makeString("&");
        $str91$_ = SubLObjectFactory.makeString("=");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NORESIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SCROLLING"));
        $str93$_self = SubLObjectFactory.makeString("_self");
        $str94$_parent = SubLObjectFactory.makeString("_parent");
        $str95$_top = SubLObjectFactory.makeString("_top");
        $kw96$BLANK = SubLObjectFactory.makeKeyword("BLANK");
        $str97$_blank = SubLObjectFactory.makeString("_blank");
        $kw98$NEW = SubLObjectFactory.makeKeyword("NEW");
        $str99$_new = SubLObjectFactory.makeString("_new");
        $kw100$DOC = SubLObjectFactory.makeKeyword("DOC");
        $str101$doc = SubLObjectFactory.makeString("doc");
        $kw102$COMPLETION = SubLObjectFactory.makeKeyword("COMPLETION");
        $str103$completion = SubLObjectFactory.makeString("completion");
        $kw104$TOOLBAR = SubLObjectFactory.makeKeyword("TOOLBAR");
        $str105$toolbar = SubLObjectFactory.makeString("toolbar");
        $str106$cb_toolbar_frame = SubLObjectFactory.makeString("cb-toolbar-frame");
        $str107$cyc_main = SubLObjectFactory.makeString("cyc-main");
        $str108$cb_main_frame = SubLObjectFactory.makeString("cb-main-frame");
        $str109$__a = SubLObjectFactory.makeString("&~a");
        $kw110$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $str111$status = SubLObjectFactory.makeString("status");
        $str112$cb_status_frame = SubLObjectFactory.makeString("cb-status-frame");
        $kw113$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $str114$index = SubLObjectFactory.makeString("index");
        $str115$cb_index_frame = SubLObjectFactory.makeString("cb-index-frame");
        $kw116$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str117$content = SubLObjectFactory.makeString("content");
        $str118$cb_content_frame = SubLObjectFactory.makeString("cb-content-frame");
        $kw119$EMPTY = SubLObjectFactory.makeKeyword("EMPTY");
        $str120$empty = SubLObjectFactory.makeString("empty");
        $str121$cb_empty_frame = SubLObjectFactory.makeString("cb-empty-frame");
        $kw122$SETUP = SubLObjectFactory.makeKeyword("SETUP");
        $str123$setup = SubLObjectFactory.makeString("setup");
        $str124$cb_setup_frame = SubLObjectFactory.makeString("cb-setup-frame");
        $kw125$INF_INDEX = SubLObjectFactory.makeKeyword("INF-INDEX");
        $str126$inf_index = SubLObjectFactory.makeString("inf-index");
        $str127$cb_inf_index_frame = SubLObjectFactory.makeString("cb-inf-index-frame");
        $kw128$INF_CONTENT = SubLObjectFactory.makeKeyword("INF-CONTENT");
        $str129$inf_content = SubLObjectFactory.makeString("inf-content");
        $str130$cb_inf_content_frame = SubLObjectFactory.makeString("cb-inf-content-frame");
        $str131$No_cb_link_method_for__S_defined = SubLObjectFactory.makeString("No cb-link method for ~S defined");
        $sym132$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym133$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $str134$Too_many_args_in__S___max_of__S_a = SubLObjectFactory.makeString("Too many args in ~S:  max of ~S allowed");
        $kw135$CB_LINK_METHOD = SubLObjectFactory.makeKeyword("CB-LINK-METHOD");
        $kw136$CB_LINK_MAX_ARGS = SubLObjectFactory.makeKeyword("CB-LINK-MAX-ARGS");
        $str137$cb_cf = SubLObjectFactory.makeString("cb-cf");
        $sym138$_CB_SHOW_CONSTANT_HASH_DOLLAR_PREFIX__ = SubLObjectFactory.makeSymbol("*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*");
        $str139$const = SubLObjectFactory.makeString("const");
        $kw140$FORT = SubLObjectFactory.makeKeyword("FORT");
        $kw141$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $str142$cb_start_ = SubLObjectFactory.makeString("cb-start|");
        $str143$_a__a = SubLObjectFactory.makeString("~a&~a");
        $str144$obsolete = SubLObjectFactory.makeString("obsolete");
        $str145$__ = SubLObjectFactory.makeString("#$");
        $kw146$TERM_CONTEXT_MENU = SubLObjectFactory.makeKeyword("TERM-CONTEXT-MENU");
        $sym147$CB_LINK_CONSTANT = SubLObjectFactory.makeSymbol("CB-LINK-CONSTANT");
        $kw148$NAT = SubLObjectFactory.makeKeyword("NAT");
        $str149$nat_png = SubLObjectFactory.makeString("nat.png");
        $kw150$NART = SubLObjectFactory.makeKeyword("NART");
        $str151$nart_png = SubLObjectFactory.makeString("nart.png");
        $str152$_ = SubLObjectFactory.makeString("-");
        $str153$_ = SubLObjectFactory.makeString("(");
        $str154$absmiddle = SubLObjectFactory.makeString("absmiddle");
        $str155$cycl = SubLObjectFactory.makeString("cycl");
        $sym156$CB_LINK_NART = SubLObjectFactory.makeSymbol("CB-LINK-NART");
        $sym157$CB_LINK_NAT = SubLObjectFactory.makeSymbol("CB-LINK-NAT");
        $str158$cb_naut_frame = SubLObjectFactory.makeString("cb-naut-frame");
        $kw159$NAUT = SubLObjectFactory.makeKeyword("NAUT");
        $sym160$CB_LINK_NAUT = SubLObjectFactory.makeSymbol("CB-LINK-NAUT");
        $str161$href = SubLObjectFactory.makeString("href");
        $kw162$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $sym163$CB_LINK_LEXICON = SubLObjectFactory.makeSymbol("CB-LINK-LEXICON");
        $str164$_NART_ = SubLObjectFactory.makeString("<NART>");
        $str165$_NART_ = SubLObjectFactory.makeString("<NART ");
        $str166$_ = SubLObjectFactory.makeString(">");
        $kw167$UNNAMED = SubLObjectFactory.makeKeyword("UNNAMED");
        $sym168$CB_LINK_UNNAMED = SubLObjectFactory.makeSymbol("CB-LINK-UNNAMED");
        $str169$cb_af = SubLObjectFactory.makeString("cb-af");
        $str170$cb_start_cb_af = SubLObjectFactory.makeString("cb-start|cb-af");
        $kw171$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym172$CB_LINK_ASSERTION = SubLObjectFactory.makeSymbol("CB-LINK-ASSERTION");
        $str173$_cycid_ = SubLObjectFactory.makeString(" cycid=");
        $str174$_id_ = SubLObjectFactory.makeString(" id=");
        $int175$_30 = SubLObjectFactory.makeInteger(-30);
        $int176$100 = SubLObjectFactory.makeInteger(100);
        $int177$256 = SubLObjectFactory.makeInteger(256);
        $sym178$HTML_SATURATED_RED_COLOR = SubLObjectFactory.makeSymbol("HTML-SATURATED-RED-COLOR");
        $int179$255 = SubLObjectFactory.makeInteger(255);
        $str180$_C_C0000 = SubLObjectFactory.makeString("~C~C0000");
        $sym181$_HTML_SATURATED_RED_COLOR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HTML-SATURATED-RED-COLOR-CACHING-STATE*");
        $sym182$HTML_SATURATED_GREEN_COLOR = SubLObjectFactory.makeSymbol("HTML-SATURATED-GREEN-COLOR");
        $str183$00_C_C00 = SubLObjectFactory.makeString("00~C~C00");
        $sym184$_HTML_SATURATED_GREEN_COLOR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*");
        $str185$yellow_gif = SubLObjectFactory.makeString("yellow.gif");
        $str186$_Def_ = SubLObjectFactory.makeString("[Def]");
        $str187$white_gif = SubLObjectFactory.makeString("white.gif");
        $str188$_Mon_ = SubLObjectFactory.makeString("[Mon]");
        $kw189$DERIVED = SubLObjectFactory.makeKeyword("DERIVED");
        $str190$green_gif = SubLObjectFactory.makeString("green.gif");
        $str191$_Inf_ = SubLObjectFactory.makeString("[Inf]");
        $str192$purple_gif = SubLObjectFactory.makeString("purple.gif");
        $str193$_B_ = SubLObjectFactory.makeString("[B]");
        $str194$blue_gif = SubLObjectFactory.makeString("blue.gif");
        $str195$_F_ = SubLObjectFactory.makeString("[F]");
        $kw196$REDUNDANT = SubLObjectFactory.makeKeyword("REDUNDANT");
        $str197$cyan_gif = SubLObjectFactory.makeString("cyan.gif");
        $str198$_R_ = SubLObjectFactory.makeString("[R]");
        $str199$red_gif = SubLObjectFactory.makeString("red.gif");
        $str200$_False_ = SubLObjectFactory.makeString("[False]");
        $str201$pink_gif = SubLObjectFactory.makeString("pink.gif");
        $str202$_Code_ = SubLObjectFactory.makeString("[Code]");
        $str203$gray_gif = SubLObjectFactory.makeString("gray.gif");
        $str204$_Unknown_ = SubLObjectFactory.makeString("[Unknown]");
        $kw205$BACKWARD_GAF = SubLObjectFactory.makeKeyword("BACKWARD-GAF");
        $str206$orange_gif = SubLObjectFactory.makeString("orange.gif");
        $str207$_BackwardGAF_ = SubLObjectFactory.makeString("[BackwardGAF]");
        $str208$_monotonic = SubLObjectFactory.makeString(" monotonic");
        $str209$_forward = SubLObjectFactory.makeString(" forward");
        $str210$_backward = SubLObjectFactory.makeString(" backward");
        $str211$_rule = SubLObjectFactory.makeString(" rule");
        $str212$_GAF = SubLObjectFactory.makeString(" GAF");
        $str213$_asserted_locally_in_ = SubLObjectFactory.makeString(" asserted locally in ");
        $str214$_by_ = SubLObjectFactory.makeString(" by ");
        $str215$_on_ = SubLObjectFactory.makeString(" on ");
        $str216$_ = SubLObjectFactory.makeString(" ");
        $str217$__ = SubLObjectFactory.makeString(", ");
        $str218$_at_ = SubLObjectFactory.makeString(" at ");
        $str219$_for_ = SubLObjectFactory.makeString(" for ");
        $str220$_and_inferred_by_Cyc = SubLObjectFactory.makeString(" and inferred by Cyc");
        $str221$_inferred_in_ = SubLObjectFactory.makeString(" inferred in ");
        $sym222$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym223$GENERATE_PHRASE_FOR_CYCLIST = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-FOR-CYCLIST");
        $sym224$_GENERATE_PHRASE_FOR_CYCLIST_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*");
        $sym225$CLEAR_GENERATE_PHRASE_FOR_CYCLIST = SubLObjectFactory.makeSymbol("CLEAR-GENERATE-PHRASE-FOR-CYCLIST");
        $str226$cb_sentence = SubLObjectFactory.makeString("cb-sentence");
        $str227$cb_start_cb_sentence = SubLObjectFactory.makeString("cb-start|cb-sentence");
        $str228$_a__a_t = SubLObjectFactory.makeString("~a&~a&t");
        $kw229$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $sym230$CB_LINK_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-SENTENCE");
        $kw231$SENTENCE_MARKER = SubLObjectFactory.makeKeyword("SENTENCE-MARKER");
        $str232$cyc_logo_3_t_gif = SubLObjectFactory.makeString("cyc-logo-3-t.gif");
        $str233$_CycL_ = SubLObjectFactory.makeString("[CycL]");
        $kw234$HELP = SubLObjectFactory.makeKeyword("HELP");
        $str235$help_btn_s_gif = SubLObjectFactory.makeString("help_btn_s.gif");
        $str236$_Help_ = SubLObjectFactory.makeString("[Help]");
        $str237$Use_of_unsupported_legacy_help_sy = SubLObjectFactory.makeString("Use of unsupported legacy help system for ~A.  Add and use def-cb-help definition.");
        $str238$dont_care = SubLObjectFactory.makeString("dont-care");
        $str239$hl_var_dont_care = SubLObjectFactory.makeString("hl-var dont-care");
        $str240$hl_var = SubLObjectFactory.makeString("hl-var");
        $sym241$CB_FORM_VARIABLE_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-VARIABLE-METHOD");
        $str242$el_var_dont_care = SubLObjectFactory.makeString("el-var dont-care");
        $str243$el_var = SubLObjectFactory.makeString("el-var");
        $str244$keyword = SubLObjectFactory.makeString("keyword");
        $str245$symbol = SubLObjectFactory.makeString("symbol");
        $sym246$CB_FORM_SYMBOL_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-SYMBOL-METHOD");
        $sym247$CB_FORM_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-CONSTANT-METHOD");
        $sym248$CB_FORM_NART_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-NART-METHOD");
        $sym249$_ALLOW_CB_ASSERTION_FOR_THE_ASSERTION_SENTENCE_REPLACEMENT__ = SubLObjectFactory.makeSymbol("*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*");
        $const250$TheAssertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheAssertionSentence"));
        $sym251$CB_FORM_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-ASSERTION-METHOD");
        $str252$__INVALID_ASSERTION_ = SubLObjectFactory.makeString("#<INVALID ASSERTION>");
        $int253$60 = SubLObjectFactory.makeInteger(60);
        $sym254$CB_FORM_STRING_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-STRING-METHOD");
        $list255 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("holdsIn")));
        $sym256$_CB_FORM_CONS_METHODS_ = SubLObjectFactory.makeSymbol("*CB-FORM-CONS-METHODS*");
        $sym257$_CB_FORM_CONS_METHODS_BY_KEYWORD_ = SubLObjectFactory.makeSymbol("*CB-FORM-CONS-METHODS-BY-KEYWORD*");
        $sym258$CB_FORM_CONS_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD");
        $sym259$CB_FORM_CONS_METHOD_P = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-P");
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-OUTPUT-FN"));
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN"));
        $list262 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-HTML-OUTPUT-FN"));
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN"));
        $sym264$PRINT_CB_FORM_CONS_METHODS = SubLObjectFactory.makeSymbol("PRINT-CB-FORM-CONS-METHODS");
        $sym265$CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE");
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-P"));
        $sym267$CB_FORM_CONS_METHOD_NAME = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-NAME");
        $sym268$_CSETF_CB_FORM_CONS_METHOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-NAME");
        $sym269$CB_FORM_CONS_METHOD_KEYWORD = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-KEYWORD");
        $sym270$_CSETF_CB_FORM_CONS_METHOD_KEYWORD = SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-KEYWORD");
        $sym271$CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN");
        $sym272$_CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN = SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN");
        $sym273$CB_FORM_CONS_METHOD_HTML_OUTPUT_FN = SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHOD-HTML-OUTPUT-FN");
        $sym274$_CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN");
        $kw275$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw276$KEYWORD = SubLObjectFactory.makeKeyword("KEYWORD");
        $kw277$APPLICABILITY_TEST_FN = SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN");
        $kw278$HTML_OUTPUT_FN = SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN");
        $str279$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw280$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym281$MAKE_CB_FORM_CONS_METHOD = SubLObjectFactory.makeSymbol("MAKE-CB-FORM-CONS-METHOD");
        $kw282$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw283$END = SubLObjectFactory.makeKeyword("END");
        $sym284$VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD");
        $list285 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $sym286$REGISTER_CB_FORM_CONS_METHOD = SubLObjectFactory.makeSymbol("REGISTER-CB-FORM-CONS-METHOD");
        $sym287$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym288$DEFCB_FORM_CONS_METHOD = SubLObjectFactory.makeSymbol("DEFCB-FORM-CONS-METHOD");
        $list289 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-KEYWORDS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym290$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym291$_CB_FORM_CONS_METHODS_ACTIVE_ = SubLObjectFactory.makeSymbol("*CB-FORM-CONS-METHODS-ACTIVE*");
        $sym292$COMPUTE_CB_FORM_CONS_METHODS_ACTIVE = SubLObjectFactory.makeSymbol("COMPUTE-CB-FORM-CONS-METHODS-ACTIVE");
        $sym293$WITH_CB_FORM_CONS_METHODS = SubLObjectFactory.makeSymbol("WITH-CB-FORM-CONS-METHODS");
        $str294$cg_cb_start_ = SubLObjectFactory.makeString("cg?cb-start|");
        $kw295$RELATIVE = SubLObjectFactory.makeKeyword("RELATIVE");
        $sym296$CYC_CGI_RELATIVE_URL = SubLObjectFactory.makeSymbol("CYC-CGI-RELATIVE-URL");
        $kw297$KEA = SubLObjectFactory.makeKeyword("KEA");
        $sym298$CYC_CGI_KEA_URL = SubLObjectFactory.makeSymbol("CYC-CGI-KEA-URL");
        $kw299$CB = SubLObjectFactory.makeKeyword("CB");
        $sym300$CYC_CGI_ABSOLUTE_CB_FRAMED_URL = SubLObjectFactory.makeSymbol("CYC-CGI-ABSOLUTE-CB-FRAMED-URL");
        $sym301$_CB_FORMULA_ARGUMENT_LIMIT_ = SubLObjectFactory.makeSymbol("*CB-FORMULA-ARGUMENT-LIMIT*");
        $str302$_ = SubLObjectFactory.makeString("'");
        $str303$____ = SubLObjectFactory.makeString(" ...");
        $str304$___ = SubLObjectFactory.makeString(" . ");
        $str305$font_weight_900 = SubLObjectFactory.makeString("font-weight:900");
        $str306$_ = SubLObjectFactory.makeString(")");
        $sym307$DATE = SubLObjectFactory.makeSymbol("DATE");
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("date"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("DATE"), (SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY"));
        $kw309$DATE = SubLObjectFactory.makeKeyword("DATE");
        $sym310$_CB_DISPLAY_DATES_AS_STRINGS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-DATES-AS-STRINGS?*");
        $sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_ = SubLObjectFactory.makeSymbol("CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?");
        $sym312$CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY = SubLObjectFactory.makeSymbol("CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY");
        $str313$DateFromStringFn_datetime = SubLObjectFactory.makeString("DateFromStringFn-datetime");
        $const314$DateFromStringFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateFromStringFn"));
        $sym315$DECIMAL = SubLObjectFactory.makeSymbol("DECIMAL");
        $list316 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("decimal"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("DECIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY"));
        $kw317$DECIMAL = SubLObjectFactory.makeKeyword("DECIMAL");
        $sym318$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*");
        $sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_ = SubLObjectFactory.makeSymbol("CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?");
        $sym320$CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY = SubLObjectFactory.makeSymbol("CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY");
        $sym321$FRACTION = SubLObjectFactory.makeSymbol("FRACTION");
        $list322 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("fraction"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("FRACTION"), (SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY"));
        $kw323$FRACTION = SubLObjectFactory.makeKeyword("FRACTION");
        $sym324$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*");
        $sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_ = SubLObjectFactory.makeSymbol("CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?");
        $sym326$CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY = SubLObjectFactory.makeSymbol("CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY");
        $kw327$THIN_SPACE = SubLObjectFactory.makeKeyword("THIN-SPACE");
        $kw328$MINUS = SubLObjectFactory.makeKeyword("MINUS");
        $kw329$FRASL = SubLObjectFactory.makeKeyword("FRASL");
        $sym330$CB_HL_SUPPORT_TO_DISPLAY_ = SubLObjectFactory.makeSymbol("CB-HL-SUPPORT-TO-DISPLAY?");
        $sym331$CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD = SubLObjectFactory.makeSymbol("CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD");
        $list332 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"));
        $str333$Unimplemented_Link = SubLObjectFactory.makeString("Unimplemented Link");
        $str334$The_page_for_ = SubLObjectFactory.makeString("The page for ");
        $str335$_has_not_yet_been_implemented_ = SubLObjectFactory.makeString(" has not yet been implemented.");
        $sym336$CB_UNIMPLEMENTED = SubLObjectFactory.makeSymbol("CB-UNIMPLEMENTED");
        $kw337$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str338$cb_unimplemented__A = SubLObjectFactory.makeString("cb-unimplemented&~A");
        $kw339$UNIMPLEMENTED = SubLObjectFactory.makeKeyword("UNIMPLEMENTED");
        $sym340$CB_LINK_UNIMPLEMENTED = SubLObjectFactory.makeSymbol("CB-LINK-UNIMPLEMENTED");
        $str341$_and_ = SubLObjectFactory.makeString(" and ");
        $str342$and_ = SubLObjectFactory.makeString("and ");
        $sym343$HTML_GENERATE_TEXT = SubLObjectFactory.makeSymbol("HTML-GENERATE-TEXT");
        $sym344$HTML_GENERATE_QUESTION = SubLObjectFactory.makeSymbol("HTML-GENERATE-QUESTION");
        $int345$300 = SubLObjectFactory.makeInteger(300);
        $sym346$CB_CF = SubLObjectFactory.makeSymbol("CB-CF");
        $const347$Cyc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc"));
        $kw348$NL = SubLObjectFactory.makeKeyword("NL");
        $kw349$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $str350$f__ = SubLObjectFactory.makeString("f: ");
        $str351$__ = SubLObjectFactory.makeString(" .");
        $str352$___ = SubLObjectFactory.makeString(" ;;");
        $str353$_in_ = SubLObjectFactory.makeString(" in ");
        $list354 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym355$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym356$COR = SubLObjectFactory.makeSymbol("COR");
        $list357 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("*ASSERTION-FILTER-HOOK*"));
        $sym358$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym359$_ASSERTION_FILTER_HOOK_ = SubLObjectFactory.makeSymbol("*ASSERTION-FILTER-HOOK*");
        $list360 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ASSERTION-FILTER-HOOK*"), (SubLObject)cb_utilities.NIL));
        $sym361$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $int362$40 = SubLObjectFactory.makeInteger(40);
        $kw363$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str364$__claimed_by_ = SubLObjectFactory.makeString(" (claimed by ");
        $kw365$HL_SUPPORT = SubLObjectFactory.makeKeyword("HL-SUPPORT");
        $str366$_module_ = SubLObjectFactory.makeString(" module)");
        $kw367$SILK = SubLObjectFactory.makeKeyword("SILK");
        $kw368$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw369$MINI_LOGO = SubLObjectFactory.makeKeyword("MINI-LOGO");
        $kw370$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str371$claimed_by_ = SubLObjectFactory.makeString("claimed by ");
        $str372$EL_Formula___Mt_Identical_to_Asse = SubLObjectFactory.makeString("EL Formula & Mt Identical to Assertion Above");
        $str373$EL_Formula_Identical_to_Assertion = SubLObjectFactory.makeString("EL Formula Identical to Assertion Above");
        $sym374$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str375$c = SubLObjectFactory.makeString("c");
        $str376$nart = SubLObjectFactory.makeString("nart");
        $str377$a = SubLObjectFactory.makeString("a");
        $sym378$_CB_IMAGE_INDEPENDENT_FORT_IDENTIFIERS__ = SubLObjectFactory.makeSymbol("*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*");
        $str379$NIL = SubLObjectFactory.makeString("NIL");
        $sym380$CB_GUESS_NAT = SubLObjectFactory.makeSymbol("CB-GUESS-NAT");
        $list381 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-GUESS-NART"));
        $sym382$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym383$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $str384$_ = SubLObjectFactory.makeString(";");
        $str385$naut = SubLObjectFactory.makeString("naut");
        $str386$sentence = SubLObjectFactory.makeString("sentence");
        $str387$_day = SubLObjectFactory.makeString("-day");
        $int388$10000 = SubLObjectFactory.makeInteger(10000);
        $str389$_month = SubLObjectFactory.makeString("-month");
        $str390$_year = SubLObjectFactory.makeString("-year");
        $str391$Month = SubLObjectFactory.makeString("Month");
        $str392$Day = SubLObjectFactory.makeString("Day");
        $str393$Year = SubLObjectFactory.makeString("Year");
        $kw394$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw395$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $const396$myReviewer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myReviewer"));
        $const397$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $kw398$RED = SubLObjectFactory.makeKeyword("RED");
        $str399$The_following_parentheses_are_unm = SubLObjectFactory.makeString("The following parentheses are unmatched:");
        $str400$The_following_constants_are_inval = SubLObjectFactory.makeString("The following constants are invalid:");
        $str401$This_is_unreadable__because_more_ = SubLObjectFactory.makeString("This is unreadable, because more was expected at the end :");
        $str402$Trying_to_read_this_generated_an_ = SubLObjectFactory.makeString("Trying to read this generated an internal error :");
        $sym403$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = SubLObjectFactory.makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
        $str404$The_following_references_to_const = SubLObjectFactory.makeString("The following references to constants are invalid:");
        $sym405$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $str406$in_the_following_string__ = SubLObjectFactory.makeString("in the following string :");
        $str407$Also__the_following_extra_string_ = SubLObjectFactory.makeString("Also, the following extra string at the end was ignored :");
        $str408$The_following_string_did_not_spec = SubLObjectFactory.makeString("The following string did not specify a sentence :");
        $str409$because__ = SubLObjectFactory.makeString("because: ");
        $str410$____none_selected____ = SubLObjectFactory.makeString(" -- none selected -- ");
        $sym411$_THE_CYCLIST_ = SubLObjectFactory.makeSymbol("*THE-CYCLIST*");
        $sym412$_CB_NAT_HISTORY_ = SubLObjectFactory.makeSymbol("*CB-NAT-HISTORY*");
        $sym413$_CB_CONSTANT_HISTORY_ = SubLObjectFactory.makeSymbol("*CB-CONSTANT-HISTORY*");
        $kw414$ACTIVE_LEFT_ARROW = SubLObjectFactory.makeKeyword("ACTIVE-LEFT-ARROW");
        $str415$back_12_png = SubLObjectFactory.makeString("back-12.png");
        $str416$Active_left_arrow = SubLObjectFactory.makeString("Active left arrow");
        $kw417$INACTIVE_LEFT_ARROW = SubLObjectFactory.makeKeyword("INACTIVE-LEFT-ARROW");
        $str418$back_12_disabled_png = SubLObjectFactory.makeString("back-12-disabled.png");
        $str419$Inactive_left_arrow = SubLObjectFactory.makeString("Inactive left arrow");
        $kw420$ACTIVE_RIGHT_ARROW = SubLObjectFactory.makeKeyword("ACTIVE-RIGHT-ARROW");
        $str421$forward_12_png = SubLObjectFactory.makeString("forward-12.png");
        $str422$Active_right_arrow = SubLObjectFactory.makeString("Active right arrow");
        $kw423$INACTIVE_RIGHT_ARROW = SubLObjectFactory.makeKeyword("INACTIVE-RIGHT-ARROW");
        $str424$forward_12_disabled_png = SubLObjectFactory.makeString("forward-12-disabled.png");
        $str425$Inactive_right_arrow = SubLObjectFactory.makeString("Inactive right arrow");
        $str426$_a = SubLObjectFactory.makeString("~a");
        $sym427$CB_GUESS_CONSTANT = SubLObjectFactory.makeSymbol("CB-GUESS-CONSTANT");
        $kw428$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw429$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw430$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw431$KB = SubLObjectFactory.makeKeyword("KB");
        $kw432$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw433$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list434 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bd588104-9c29-11b1-9dad-c379636f7270")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mx4rvViBBJwpEbGdrcN5Y29ycA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("331E2BBD5881049C2911B19DADC379636F7270")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_utilities.NIL), (SubLObject)cb_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("isa"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_utilities.NIL)), (SubLObject)cb_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bd588104-9c29-11b1-9dad-c379636f7270"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mx4rvViBBJwpEbGdrcN5Y29ycA"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("331E2BBD5881049C2911B19DADC379636F7270"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))) });
        $sym435$CB_GUESS_DATE = SubLObjectFactory.makeSymbol("CB-GUESS-DATE");
        $kw436$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list437 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("from October 1977 to February 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("October")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1977))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("from 1977 to February 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1977)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("from 1977 to 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1977)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February, 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February 29, 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February 29th, 2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February 29xx, 2064")), (SubLObject)cb_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February 29foo, 2064")), (SubLObject)cb_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2/29/2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2-29-2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2:12 2-29-2064")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)cb_utilities.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2-29-2064 2:12")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)cb_utilities.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2-29-2064, 2:12")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)cb_utilities.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)cb_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2064))))))) });
    }
    
    public static final class $cb_form_cons_method_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $applicability_test_fn;
        public SubLObject $html_output_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $cb_form_cons_method_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$applicability_test_fn = (SubLObject)CommonSymbols.NIL;
            this.$html_output_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cb_form_cons_method_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$keyword;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$applicability_test_fn;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$html_output_fn;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$applicability_test_fn = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$html_output_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cb_form_cons_method_native.class, cb_utilities.$sym258$CB_FORM_CONS_METHOD, cb_utilities.$sym259$CB_FORM_CONS_METHOD_P, cb_utilities.$list260, cb_utilities.$list261, new String[] { "$name", "$keyword", "$applicability_test_fn", "$html_output_fn" }, cb_utilities.$list262, cb_utilities.$list263, cb_utilities.$sym264$PRINT_CB_FORM_CONS_METHODS);
        }
    }
    
    public static final class $cb_form_cons_method_p$UnaryFunction extends UnaryFunction
    {
        public $cb_form_cons_method_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CB-FORM-CONS-METHOD-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_utilities.cb_form_cons_method_p(arg1);
        }
    }
}

/*

	Total time: 2563 ms
	 synthetic 
*/