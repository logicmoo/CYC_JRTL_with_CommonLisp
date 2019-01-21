package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_tools extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_tools";
    public static final String myFingerPrint = "6ffae31e03254b090e3c815ae41d736ce58ba0edc90eced65b27a81443ed8f7e";
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 708L)
    public static SubLSymbol $cb_tools_split_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4543L)
    private static SubLSymbol $cb_boolean_globals$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 11333L)
    private static SubLSymbol $cb_wff_strictP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 15857L)
    private static SubLSymbol $cb_option_section_names$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 44594L)
    public static SubLSymbol $cb_use_css_columns_for_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59415L)
    private static SubLSymbol $cb_history_max_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60765L)
    private static SubLSymbol $cb_history_max_nats$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62169L)
    private static SubLSymbol $cb_history_max_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
    private static SubLSymbol $cb_bookmarked_items_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 68883L)
    public static SubLSymbol $cb_interactor_width$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 69027L)
    public static SubLSymbol $cb_interactor_height$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 75723L)
    public static SubLSymbol $html_state_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 75821L)
    public static SubLSymbol $user_preference_file_extension$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 75877L)
    public static SubLSymbol $user_preference_directory_list$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 76337L)
    public static SubLSymbol $default_user_preference_filename$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78553L)
    public static SubLSymbol $cb_load_api_input_size$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78705L)
    public static SubLSymbol $cb_load_api_skip_input_size$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 83122L)
    public static SubLSymbol $cb_show_list$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 83295L)
    public static SubLSymbol $cb_show_constant_value$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 83519L)
    public static SubLSymbol $cb_show_assertion_value$;
    private static final SubLSymbol $kw0$CB_TOOLS;
    private static final SubLString $str1$cb_tools_html;
    private static final SubLString $str2$Browser_Tools;
    private static final SubLString $str3$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str4$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw5$UNINITIALIZED;
    private static final SubLSymbol $kw6$CB_CYC;
    private static final SubLSymbol $kw7$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw8$SHA1;
    private static final SubLString $str9$yui_skin_sam;
    private static final SubLString $str10$reloadFrameButton;
    private static final SubLString $str11$button;
    private static final SubLString $str12$reload;
    private static final SubLString $str13$Refresh_Frames;
    private static final SubLString $str14$post;
    private static final SubLString $str15$cb_tools_handler;
    private static final SubLSymbol $kw16$SELF;
    private static final SubLString $str17$Choose_a_tool__or_modify_the_tool;
    private static final SubLString $str18$Current_Values;
    private static final SubLString $str19$Update_Toolbar;
    private static final SubLString $str20$Update___Save;
    private static final SubLString $str21$save;
    private static final SubLString $str22$Deprecated_Tools;
    private static final SubLSymbol $sym23$CB_TOOLS;
    private static final SubLSymbol $kw24$HTML_HANDLER;
    private static final SubLSymbol $sym25$STRING_;
    private static final SubLSymbol $sym26$SECOND;
    private static final SubLSymbol $kw27$TOP;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$FIRST;
    private static final SubLString $str30$Toolbar_Modified;
    private static final SubLString $str31$Browser_Toolbar_Modified;
    private static final SubLString $str32$Tools;
    private static final SubLSymbol $sym33$CB_TOOLS_HANDLER;
    private static final SubLSymbol $kw34$MAIN;
    private static final SubLString $str35$cb_tools;
    private static final SubLSymbol $kw36$TOOLS;
    private static final SubLSymbol $sym37$CB_LINK_TOOLS;
    private static final SubLSymbol $kw38$TOOLBAR;
    private static final SubLSymbol $kw39$FIELD_NAME;
    private static final SubLSymbol $kw40$LEGEND_FORM;
    private static final SubLSymbol $kw41$CHECK_FN;
    private static final SubLSymbol $kw42$NEW_VALUE_FN;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$FIELD_NAME;
    private static final SubLSymbol $sym45$LEGEND_FORM;
    private static final SubLSymbol $sym46$CLET;
    private static final SubLSymbol $sym47$CB_BOOLEAN_OPTION_FIELD_NAME;
    private static final SubLSymbol $sym48$QUOTE;
    private static final SubLSymbol $sym49$CB_BOOLEAN_OPTION_LEGEND_FORM;
    private static final SubLSymbol $sym50$PWHEN;
    private static final SubLSymbol $sym51$CAND;
    private static final SubLSymbol $sym52$STRINGP;
    private static final SubLSymbol $sym53$LISTP;
    private static final SubLSymbol $sym54$CB_CHECKBOX_OPTION;
    private static final SubLSymbol $sym55$CB_BOOLEAN_OPTION_CHECK;
    private static final SubLSymbol $sym56$EVAL;
    private static final SubLSymbol $sym57$_CB_C_WRAP_ASSERTIONS_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$_CB_DISPLAY_DATES_AS_STRINGS__;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$_CB_WRAP_INTERACTOR_;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$_CB_SHOW_CYCLIFY_BUTTON_;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$_CB_ENABLE_INFERENCE_MONITORING_;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$_CB_SEPARATE_DOC_FRAME_;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$_CB_FAST__;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$_CB_USE_FRAMES_;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$_CB_SCRIPT_MODE_;
    private static final SubLList $list88;
    private static final SubLSymbol $kw89$JAVASCRIPT;
    private static final SubLSymbol $sym90$_CB_HOVEROVER_ENABLED_;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$_CB_A_SHOW_EL_FORMULA_;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$_CB_A_SHOW_HL_FORMULA_;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$_CB_A_SHOW_ENGLISH_;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$_CB_USE_CATEGORIZED_HISTORY__;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$_ASSUME_CYC_CYCLIST_DIALOG__;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$_GENERATED_PHRASES_BROWSABLE__;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$_SHOW_FET_EDIT_BUTTONS__;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$_CB_SHOW_FOLLOWUP_WIDGET_;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$_USE_SME_LEXWIZ_;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $kw133$CB_OPTIONS;
    private static final SubLString $str134$cb_options_html;
    private static final SubLString $str135$Browser_Preferences;
    private static final SubLString $str136$cb_options_handler;
    private static final SubLString $str137$Reset_Form;
    private static final SubLString $str138$Submit;
    private static final SubLString $str139$update;
    private static final SubLString $str140$Submit___Save;
    private static final SubLString $str141$update_and_save;
    private static final SubLString $str142$Load_Saved;
    private static final SubLString $str143$load_saved;
    private static final SubLSymbol $sym144$CB_OPTIONS;
    private static final SubLList $list145;
    private static final SubLString $str146$Jump_to_Section;
    private static final SubLList $list147;
    private static final SubLString $str148$_;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$NAME;
    private static final SubLSymbol $sym151$ALIST_LOOKUP_WITHOUT_VALUES;
    private static final SubLSymbol $sym152$_CB_OPTION_SECTION_NAMES_;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$HTML_HEADING;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$HTML_FANCY_DIV;
    private static final SubLSymbol $kw157$ID;
    private static final SubLSymbol $sym158$HTML_PRINC;
    private static final SubLSymbol $sym159$HTML_FANCY_TABLE;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$HTML_TABLE_ROW;
    private static final SubLSymbol $sym162$PROGN;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$HTML_FANCY_TABLE_DATA;
    private static final SubLList $list165;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$HTML_FORMAT;
    private static final SubLString $str169$_A__;
    private static final SubLSymbol $sym170$CB_OPTION_WITH_TITLE_ONLY;
    private static final SubLList $list171;
    private static final SubLSymbol $sym172$HTML_PRINC_STRONG;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER;
    private static final SubLSymbol $sym176$CB_OPTION_WITH_TITLE;
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$PIF;
    private static final SubLSymbol $sym179$HTML_PRINC_STRONG_WITH_EXPLANATION;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLSymbol $kw182$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw183$HOVEROVER;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$HTML_CHECKBOX_INPUT;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLString $str188$__;
    private static final SubLString $str189$Complete;
    private static final SubLString $str190$Clear;
    private static final SubLSymbol $kw191$GENERAL;
    private static final SubLSymbol $kw192$LEFT;
    private static final SubLSymbol $sym193$_HLMTS_SUPPORTED__;
    private static final SubLString $str194$Simple_transformations_to_make_co;
    private static final SubLString $str195$NAUT_Readability;
    private static final SubLString $str196$Miscellaneous;
    private static final SubLString $str197$Primary_Presentation_Language;
    private static final SubLString $str198$presentation_language;
    private static final SubLString $str199$_cycl;
    private static final SubLSymbol $kw200$CYCL;
    private static final SubLString $str201$CycL__default_;
    private static final SubLString $str202$_nl;
    private static final SubLSymbol $kw203$NL;
    private static final SubLString $str204$Natural_Language__slow_;
    private static final SubLString $str205$Status_Frame_Update;
    private static final SubLString $str206$Update_every_;
    private static final SubLString $str207$status_interval;
    private static final SubLString $str208$seconds__or_empty_to_disable_;
    private static final SubLSymbol $kw209$TERM_DISPLAY;
    private static final SubLString $str210$Default_Index_View;
    private static final SubLString $str211$index_view;
    private static final SubLString $str212$_inferred;
    private static final SubLSymbol $kw213$INFERRED;
    private static final SubLString $str214$Inferred;
    private static final SubLString $str215$_legacy;
    private static final SubLSymbol $kw216$LEGACY;
    private static final SubLString $str217$Legacy;
    private static final SubLString $str218$Default_Content;
    private static final SubLString $str219$content;
    private static final SubLString $str220$upper_bound;
    private static final SubLString $str221$_maximal;
    private static final SubLSymbol $kw222$MAXIMAL;
    private static final SubLString $str223$As_much_as_possible_up_to_;
    private static final SubLString $str224$_assertions;
    private static final SubLString $str225$_documentation;
    private static final SubLSymbol $kw226$DOCUMENTATION;
    private static final SubLString $str227$Documentation;
    private static final SubLString $str228$_definitional;
    private static final SubLSymbol $kw229$DEFINITIONAL;
    private static final SubLString $str230$Definitional_Information;
    private static final SubLString $str231$_lexical;
    private static final SubLSymbol $kw232$LEXICAL;
    private static final SubLString $str233$Lexical_Information;
    private static final SubLString $str234$Assertion_Formulas;
    private static final SubLString $str235$formulas_display;
    private static final SubLString $str236$_hl_formulas;
    private static final SubLSymbol $kw237$HL_FORMULAS;
    private static final SubLString $str238$HL_formulas__fast_;
    private static final SubLString $str239$_el_formulas;
    private static final SubLSymbol $kw240$EL_FORMULAS;
    private static final SubLString $str241$EL_formulas__slow_;
    private static final SubLString $str242$_el_formulas_except_when_browsing;
    private static final SubLSymbol $kw243$EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS;
    private static final SubLString $str244$EL_formulas_except_when_browsing_;
    private static final SubLString $str245$Literal_Queries;
    private static final SubLString $str246$Applicable_Relations;
    private static final SubLString $str247$Assertion_Display_Options;
    private static final SubLString $str248$Assertion_Editing_Options;
    private static final SubLString $str249$FET_Launching_Buttons;
    private static final SubLSymbol $kw250$HISTORY_AND_TOOLS;
    private static final SubLString $str251$History_Display_Options;
    private static final SubLString $str252$Display_no_more_than_;
    private static final SubLString $str253$constant_history_max;
    private static final SubLString $str254$_constants;
    private static final SubLString $str255$constant_history_chronological_ma;
    private static final SubLString $str256$_constants_chronologically;
    private static final SubLString $str257$nat_history_max;
    private static final SubLString $str258$_NARTs;
    private static final SubLString $str259$assertion_history_max;
    private static final SubLString $str260$sentence_history_max;
    private static final SubLString $str261$_sentences;
    private static final SubLString $str262$Browser_Tool_Options;
    private static final SubLString $str263$Default_Mt;
    private static final SubLString $str264$default_mt;
    private static final SubLObject $const265$Microtheory;
    private static final SubLString $str266$What_microtheory_should_be_used_a;
    private static final SubLSymbol $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__;
    private static final SubLList $list268;
    private static final SubLString $str269$NL_Generation;
    private static final SubLString $str270$Which_mt_should_be_used_for_gener;
    private static final SubLString $str271$Default_NL_Generation_Mt;
    private static final SubLList $list272;
    private static final SubLString $str273$Proof_Views;
    private static final SubLString $str274$Which_parameters_should_be_used_f;
    private static final SubLString $str275$Default_Parameters;
    private static final SubLString $str276$proof_view_params;
    private static final SubLSymbol $kw277$DEFAULT;
    private static final SubLList $list278;
    private static final SubLList $list279;
    private static final SubLString $str280$Lexification;
    private static final SubLString $str281$Reviewer;
    private static final SubLString $str282$lex_reviewer;
    private static final SubLObject $const283$Cyclist;
    private static final SubLString $str284$Which_Cyclist_is_to_reviewer_your;
    private static final SubLString $str285$Default_Microtheory;
    private static final SubLString $str286$lex_mt;
    private static final SubLString $str287$What_microtheory_should_your_lexi;
    private static final SubLString $str288$Default_Syntactic_Microtheory;
    private static final SubLString $str289$lex_syntactic_mt;
    private static final SubLString $str290$What_microtheory_should_your_synt;
    private static final SubLString $str291$Default_Paraphrase_Microtheory;
    private static final SubLString $str292$lex_pph_mt;
    private static final SubLString $str293$What_microtheory_should_your_para;
    private static final SubLString $str294$Default_Parse_Template_Microtheor;
    private static final SubLString $str295$lex_parse_template_mt;
    private static final SubLString $str296$What_microtheory_should_your_pars;
    private static final SubLSymbol $kw297$QUERY_TOOL;
    private static final SubLString $str298$Results_Display;
    private static final SubLString $str299$Automatically_Destroying_Inferenc;
    private static final SubLString $str300$destroy_inferences;
    private static final SubLString $str301$entry_destroy_inferences;
    private static final SubLString $str302$Keep_only_last_;
    private static final SubLString $str303$inferences__at_most__defaults_to_;
    private static final SubLString $str304$Keep_all;
    private static final SubLString $str305$Default_Query_Mt;
    private static final SubLList $list306;
    private static final SubLString $str307$Closed_Queries;
    private static final SubLString $str308$perform_argumentation_for_closed_;
    private static final SubLString $str309$t;
    private static final SubLString $str310$Gather_and_weigh_both_pro_and_con;
    private static final SubLString $str311$nil;
    private static final SubLString $str312$Attempt_to_prove_only_pro_argumen;
    private static final SubLSymbol $kw313$STRICT;
    private static final SubLSymbol $kw314$ASSERTIVE;
    private static final SubLSymbol $sym315$CB_OPTIONS_HANDLER;
    private static final SubLString $str316$Default_NL_Generation_Mt__The_inp;
    private static final SubLString $str317$DEFAULT;
    private static final SubLSymbol $kw318$POSITIVE_INFINITY;
    private static final SubLString $str319$Default_Query_Mt__The_input___A__;
    private static final SubLString $str320$Preferences;
    private static final SubLString $str321$cb_options;
    private static final SubLSymbol $kw322$OPTIONS;
    private static final SubLSymbol $sym323$CB_LINK_OPTIONS;
    private static final SubLString $str324$Prefs;
    private static final SubLString $str325$Your_new_settings_require_you_to_;
    private static final SubLString $str326$Click_;
    private static final SubLSymbol $kw327$START;
    private static final SubLString $str328$here;
    private static final SubLString $str329$_now_to_do_so_;
    private static final SubLString $str330$KB_Browser_Options_have_been_modi;
    private static final SubLString $str331$_and_saved;
    private static final SubLString $str332$_;
    private static final SubLSymbol $sym333$CB_HISTORY;
    private static final SubLSymbol $kw334$CB_HISTORY;
    private static final SubLString $str335$cb_history_html;
    private static final SubLSymbol $kw336$CATEGORIZED;
    private static final SubLSymbol $kw337$ALPHABETICAL;
    private static final SubLString $str338$categorized;
    private static final SubLString $str339$;
    private static final SubLSymbol $kw340$HISTORY_HL_FORMULAS;
    private static final SubLSymbol $kw341$HISTORY_EL_FORMULAS;
    private static final SubLSymbol $sym342$_CB_USE_CSS_COLUMNS_FOR_CATEGORIES_;
    private static final SubLString $str343$Recent_Constants__;
    private static final SubLSymbol $kw344$HISTORY;
    private static final SubLString $str345$_Show_Alphabetical_;
    private static final SubLString $str346$_Show_Categorized_;
    private static final SubLSymbol $kw347$CLEAR_CONSTANT_HISTORY;
    private static final SubLSymbol $sym348$TO_STRING;
    private static final SubLString $str349$history_constants_columnar;
    private static final SubLString $str350$history_constant;
    private static final SubLString $str351$None;
    private static final SubLSymbol $sym352$ISA_COLLECTION_;
    private static final SubLSymbol $sym353$ISA_RELATION_;
    private static final SubLSymbol $sym354$ASSERTION_P;
    private static final SubLString $str355$history_table;
    private static final SubLString $str356$history_categorized_column;
    private static final SubLString $str357$history_table_heading;
    private static final SubLString $str358$Most_nbsp_Recent;
    private static final SubLString $str359$Collections;
    private static final SubLString $str360$Individuals;
    private static final SubLString $str361$Relations;
    private static final SubLString $str362$columns__4__column_count__4____we;
    private static final SubLString $str363$display_block__break_after__colum;
    private static final SubLString $str364$display__block__break_after__colu;
    private static final SubLString $str365$display__block__break_after__colu;
    private static final SubLString $str366$Recent_NATs__;
    private static final SubLSymbol $kw367$CLEAR_NAT_HISTORY;
    private static final SubLString $str368$history_nats_columnar;
    private static final SubLString $str369$history_nat;
    private static final SubLString $str370$Recent_Sentences__;
    private static final SubLSymbol $kw371$CLEAR_SENTENCE_HISTORY;
    private static final SubLString $str372$cyclistReadilyAvailableTerms;
    private static final SubLSymbol $sym373$CONSTANT_P;
    private static final SubLString $str374$font_size__larger__font_weight_bo;
    private static final SubLString $str375$To_remove_a_bookmark__follow_the_;
    private static final SubLString $str376$Bookmarked_Constants__;
    private static final SubLString $str377$bookmarked_constants_columnar;
    private static final SubLString $str378$bookmarked_constant;
    private static final SubLSymbol $sym379$CYCL_NAT_P;
    private static final SubLString $str380$Bookmarked_NATs__;
    private static final SubLString $str381$bookmarked_nats_columnar;
    private static final SubLString $str382$bookmarked_nat;
    private static final SubLString $str383$Bookmarked_Assertions__;
    private static final SubLString $str384$bookmarked_asserts_columnar;
    private static final SubLString $str385$bookmarked_assert;
    private static final SubLString $str386$Recent_Assertions__;
    private static final SubLSymbol $kw387$CLEAR_ASSERTION_HISTORY;
    private static final SubLSymbol $sym388$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY;
    private static final SubLSymbol $sym389$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY;
    private static final SubLSymbol $sym390$CB_ASSERTION_LINK_WITH_MT;
    private static final SubLSymbol $sym391$CB_ASSERTION_LINK;
    private static final SubLSymbol $kw392$HTML;
    private static final SubLSymbol $kw393$NEW;
    private static final SubLString $str394$history_tool_gif;
    private static final SubLString $str395$History;
    private static final SubLString $str396$cb_history_categorized;
    private static final SubLString $str397$cb_history_alphabetical;
    private static final SubLSymbol $sym398$CB_LINK_HISTORY;
    private static final SubLString $str399$Hist;
    private static final SubLString $str400$Recent_Browser_History;
    private static final SubLList $list401;
    private static final SubLSymbol $kw402$CONSTANT;
    private static final SubLSymbol $kw403$NAT;
    private static final SubLSymbol $kw404$ASSERTION;
    private static final SubLSymbol $kw405$SENTENCE;
    private static final SubLSymbol $kw406$ALL;
    private static final SubLSymbol $sym407$CB_CLEAR_HISTORY;
    private static final SubLString $str408$_Clear_History_;
    private static final SubLString $str409$cb_clear_history_ALL;
    private static final SubLSymbol $kw410$CLEAR_HISTORY;
    private static final SubLSymbol $sym411$CB_LINK_CLEAR_HISTORY;
    private static final SubLString $str412$_Clear_Constant_History_;
    private static final SubLString $str413$cb_clear_history_CONSTANT__A;
    private static final SubLSymbol $sym414$CB_LINK_CLEAR_CONSTANT_HISTORY;
    private static final SubLString $str415$_Clear_NAT_History_;
    private static final SubLString $str416$cb_clear_history_NAT;
    private static final SubLSymbol $sym417$CB_LINK_CLEAR_NAT_HISTORY;
    private static final SubLString $str418$_Clear_Assertion_History_;
    private static final SubLString $str419$cb_clear_history_ASSERTION;
    private static final SubLSymbol $sym420$CB_LINK_CLEAR_ASSERTION_HISTORY;
    private static final SubLString $str421$_Clear_Sentence_History_;
    private static final SubLString $str422$cb_clear_history_SENTENCE;
    private static final SubLSymbol $sym423$CB_LINK_CLEAR_SENTENCE_HISTORY;
    private static final SubLSymbol $sym424$CB_HISTORY_EL_FORMULAS;
    private static final SubLString $str425$_EL_Formulas_;
    private static final SubLString $str426$cb_history_el_formulas;
    private static final SubLSymbol $sym427$CB_LINK_HISTORY_EL_FORMULAS;
    private static final SubLSymbol $sym428$CB_HISTORY_HL_FORMULAS;
    private static final SubLString $str429$_HL_Formulas_;
    private static final SubLString $str430$cb_history_hl_formulas;
    private static final SubLSymbol $sym431$CB_LINK_HISTORY_HL_FORMULAS;
    private static final SubLSymbol $sym432$FORT_P;
    private static final SubLString $str433$Unable_to_add__S_to_history;
    private static final SubLInteger $int434$50;
    private static final SubLSymbol $sym435$VALID_CONSTANT_;
    private static final SubLInteger $int436$25;
    private static final SubLSymbol $sym437$CB_VALID_NAT_P;
    private static final SubLSymbol $sym438$TREE_FIND;
    private static final SubLSymbol $sym439$TERM_OF_UNIT;
    private static final SubLSymbol $sym440$FIND;
    private static final SubLSymbol $sym441$EXPRESSION_FORTS_WITH_HL;
    private static final SubLSymbol $sym442$CYCL_SENTENCE_P;
    private static final SubLSymbol $sym443$EXPRESSION_FORTS;
    private static final SubLSymbol $sym444$CB_BOOKMARKED_ITEMS;
    private static final SubLSymbol $sym445$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const446$MtSpace;
    private static final SubLObject $const447$CyclistsMt;
    private static final SubLObject $const448$MtTimeWithGranularityDimFn;
    private static final SubLList $list449;
    private static final SubLSymbol $sym450$_EXIT;
    private static final SubLObject $const451$cyclistReadilyAvailableTerms;
    private static final SubLSymbol $sym452$NAME_FOR_ALPHA_SORT;
    private static final SubLSymbol $sym453$_CB_BOOKMARKED_ITEMS_CACHING_STATE_;
    private static final SubLSymbol $sym454$CLEAR_CB_BOOKMARKED_ITEMS;
    private static final SubLString $str455$_;
    private static final SubLString $str456$Recently_Added_KB_Content;
    private static final SubLString $str457$float__right;
    private static final SubLSymbol $kw458$RECENT_KB_ADDITIONS;
    private static final SubLString $str459$_Refresh_Page_;
    private static final SubLSymbol $sym460$CB_RECENT_KB_ADDITIONS;
    private static final SubLString $str461$_Recently_Added_KB_Content;
    private static final SubLString $str462$cb_recent_kb_additions;
    private static final SubLSymbol $sym463$CB_LINK_RECENT_KB_ADDITIONS;
    private static final SubLList $list464;
    private static final SubLString $str465$Recent_constants_;
    private static final SubLString $str466$mapping_constants_for_sweep;
    private static final SubLString $str467$cdolist;
    private static final SubLSymbol $kw468$SKIP;
    private static final SubLSymbol $kw469$NART;
    private static final SubLString $str470$Recent_NARTs_;
    private static final SubLString $str471$mapping_narts_for_sweep;
    private static final SubLString $str472$Recent_assertions_;
    private static final SubLString $str473$mapping_assertions_for_sweep;
    private static final SubLSymbol $kw474$DEDUCTION;
    private static final SubLString $str475$Recent_deductions_;
    private static final SubLString $str476$mapping_deductions_for_sweep;
    private static final SubLSymbol $kw477$KB_HL_SUPPORTS;
    private static final SubLString $str478$Recent_KB_HL_supports_;
    private static final SubLString $str479$mapping_kb_hl_supports_for_sweep;
    private static final SubLSymbol $kw480$TEXT;
    private static final SubLList $list481;
    private static final SubLInteger $int482$80;
    private static final SubLString $str483$the_SubLisp_Interactor;
    private static final SubLString $str484$interactor;
    private static final SubLString $str485$SubL_Interactor;
    private static final SubLString $str486$cb_handle_interactor;
    private static final SubLString $str487$document;
    private static final SubLString $str488$input_string;
    private static final SubLSymbol $sym489$CB_HANDLE_INTERACTOR;
    private static final SubLSymbol $kw490$CB_HANDLE_INTERACTOR;
    private static final SubLString $str491$cb_handle_interactor_html;
    private static final SubLSymbol $kw492$HTML_EDITOR_SCRIPTS;
    private static final SubLString $str493$Eval;
    private static final SubLString $str494$Enter_A_Form__;
    private static final SubLString $str495$Reset;
    private static final SubLString $str496$Cyclify;
    private static final SubLSymbol $kw497$ERROR;
    private static final SubLSymbol $kw498$RED;
    private static final SubLString $str499$Malformed_expression___;
    private static final SubLString $str500$Last_Form_Evaluated___;
    private static final SubLString $str501$Results___;
    private static final SubLSymbol $sym502$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym503$MULTIPLE_VALUE_LIST;
    private static final SubLString $str504$ERROR___;
    private static final SubLString $str505$Interactor;
    private static final SubLSymbol $kw506$INTERACTOR;
    private static final SubLSymbol $sym507$CB_LINK_INTERACTOR;
    private static final SubLString $str508$SubL;
    private static final SubLString $str509$_;
    private static final SubLString $str510$_;
    private static final SubLString $str511$_;
    private static final SubLSymbol $sym512$FUNCTION;
    private static final SubLString $str513$__;
    private static final SubLString $str514$_;
    private static final SubLString $str515$___;
    private static final SubLSymbol $sym516$_HTML_STATE_FILENAME_;
    private static final SubLString $str517$pref;
    private static final SubLString $str518$preferences;
    private static final SubLString $str519$users;
    private static final SubLString $str520$Save_Interface;
    private static final SubLString $str521$default;
    private static final SubLString $str522$Interface_Settings_Loaded_Success;
    private static final SubLString $str523$No_Interface_Settings_File_To_Loa;
    private static final SubLSymbol $sym524$CB_LOAD_USER_PREFERENCES;
    private static final SubLInteger $int525$70;
    private static final SubLSymbol $kw526$CB_LOAD_API;
    private static final SubLString $str527$cb_load_api_html;
    private static final SubLString $str528$the_KE_Load_Page;
    private static final SubLString $str529$Load_API_Expressions_Page;
    private static final SubLString $str530$cb_load_api_handler;
    private static final SubLString $str531$Please_type_in_the_name_of_the_fi;
    private static final SubLString $str532$_Load_File__;
    private static final SubLString $str533$button_;
    private static final SubLString $str534$load_api_file_name;
    private static final SubLString $str535$Load_File;
    private static final SubLSymbol $sym536$CB_LOAD_API;
    private static final SubLString $str537$cb_load_api_handler_called_with_n;
    private static final SubLString $str538$Load_API_Expressions_Results;
    private static final SubLString $str539$load_api_file_skip;
    private static final SubLString $str540$The_file__;
    private static final SubLString $str541$__was_loaded___Here_are_the_resul;
    private static final SubLSymbol $kw542$SUCCESS;
    private static final SubLString $str543$Successfully_and_completely_loade;
    private static final SubLString $str544$File__s_does_not_exist_;
    private static final SubLString $str545$KE_filename_was_not_a_string_;
    private static final SubLSymbol $sym546$CB_LOAD_API_HANDLER;
    private static final SubLSymbol $kw547$FILE_NOT_FOUND;
    private static final SubLString $str548$An_error_occurred_after_processin;
    private static final SubLString $str549$_forms_;
    private static final SubLString $str550$Form_Number;
    private static final SubLString $str551$You_may_continue_processing_this_;
    private static final SubLString $str552$KE_File_Name;
    private static final SubLString $str553$You_may_also_specify_a_new_file_t;
    private static final SubLSymbol $kw554$CB_SHOW_WHEN;
    private static final SubLString $str555$cb_show_when_html;
    private static final SubLString $str556$the_Display_by_Date;
    private static final SubLString $str557$Display_by_Date;
    private static final SubLString $str558$cb_show_when_handler;
    private static final SubLString $str559$What_kind_of_data_do_you_want_to_;
    private static final SubLString $str560$cb_show_type;
    private static final SubLString $str561$Constants;
    private static final SubLString $str562$Assertions;
    private static final SubLString $str563$Enter_in_the_start_date_;
    private static final SubLString $str564$Month;
    private static final SubLString $str565$cb_show_start_month;
    private static final SubLString $str566$Day;
    private static final SubLString $str567$cb_show_start_day;
    private static final SubLString $str568$Year;
    private static final SubLString $str569$cb_show_start_year;
    private static final SubLString $str570$Enter_in_the_ending_date_;
    private static final SubLString $str571$cb_show_end_month;
    private static final SubLString $str572$cb_show_end_day;
    private static final SubLString $str573$cb_show_end_year;
    private static final SubLString $str574$Enter_the_cyclist_to_examine__bla;
    private static final SubLString $str575$cb_show_cyclist;
    private static final SubLInteger $int576$24;
    private static final SubLString $str577$Enter_the_project_to_examine__bla;
    private static final SubLString $str578$cb_show_project;
    private static final SubLObject $const579$Cyc_BasedProject;
    private static final SubLSymbol $sym580$CB_SHOW_WHEN;
    private static final SubLSymbol $kw581$CB_SHOW_WHEN_HANDLER;
    private static final SubLString $str582$cb_show_when_handler_html;
    private static final SubLString $str583$Please_specify_either_a_Constant_;
    private static final SubLString $str584$Unknown_cyclist___S;
    private static final SubLString $str585$Unknown_project___S;
    private static final SubLString $str586$Date_Search_Results;
    private static final SubLString $str587$Listing_;
    private static final SubLString $str588$constants;
    private static final SubLString $str589$assertions;
    private static final SubLString $str590$_created_from_;
    private static final SubLString $str591$_to_;
    private static final SubLString $str592$_by_;
    private static final SubLString $str593$_for_;
    private static final SubLSymbol $sym594$CONSTANTS_FOR_PROJECTS_BETWEEN;
    private static final SubLSymbol $sym595$CONSTANTS_CREATED_BETWEEN;
    private static final SubLSymbol $sym596$ASSERTIONS_FOR_PROJECTS_BETWEEN;
    private static final SubLSymbol $sym597$ASSERTIONS_BETWEEN;
    private static final SubLSymbol $sym598$_CONSTANT;
    private static final SubLSymbol $sym599$_ASSERTION;
    private static final SubLObject $const600$thereExists;
    private static final SubLSymbol $sym601$_TERM_LIST;
    private static final SubLObject $const602$and;
    private static final SubLObject $const603$evaluate;
    private static final SubLObject $const604$EvaluateSubLFn;
    private static final SubLObject $const605$SubLQuoteFn;
    private static final SubLObject $const606$memberOfList;
    private static final SubLList $list607;
    private static final SubLObject $const608$BaseKB;
    private static final SubLList $list609;
    private static final SubLSymbol $kw610$EXHAUST_TOTAL;
    private static final SubLString $str611$Expected_When_Tool_inference_halt;
    private static final SubLSymbol $sym612$CB_SHOW_WHEN_HANDLER;
    private static final SubLString $str613$None_for_the_given_time_period_;
    private static final SubLString $str614$_a__a___;
    private static final SubLSymbol $kw615$SAVE_INFERENCE_ANSWERS;
    private static final SubLString $str616$_in_;
    private static final SubLString $str617$When;
    private static final SubLString $str618$cb_show_when;
    private static final SubLSymbol $kw619$SHOW_WHEN;
    private static final SubLSymbol $sym620$CB_LINK_SHOW_WHEN;
    private static final SubLString $str621$Display_assertions_constants_by_d;
    private static final SubLSymbol $kw622$CB_INDEX_OVERLAP;
    private static final SubLString $str623$cb_index_overlap_html;
    private static final SubLString $str624$Index_Overlap;
    private static final SubLString $str625$cb_handle_index_overlap;
    private static final SubLString $str626$Search;
    private static final SubLString $str627$Enter_required_terms_separated_by;
    private static final SubLString $str628$terms;
    private static final SubLString $str629$Enter_terms_to_exclude_separated_;
    private static final SubLString $str630$exclude_terms;
    private static final SubLSymbol $sym631$CB_INDEX_OVERLAP;
    private static final SubLString $str632$Error_reading_terms___Check_for_t;
    private static final SubLString $str633$Error_reading_exclude_terms___Che;
    private static final SubLString $str634$Index_Overlap_Results;
    private static final SubLString $str635$Search_Terms__;
    private static final SubLString $str636$Please_enter_some_valid_search_te;
    private static final SubLString $str637$Excluded_Terms__;
    private static final SubLString $str638$Please_enter_more_than_1_search_t;
    private static final SubLSymbol $sym639$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const640$EverythingPSC;
    private static final SubLString $str641$Index_Overlap___;
    private static final SubLString $str642$_assertions_found_;
    private static final SubLSymbol $sym643$CB_HANDLE_INDEX_OVERLAP;
    private static final SubLString $str644$Overlap;
    private static final SubLString $str645$cb_index_overlap;
    private static final SubLSymbol $kw646$INDEX_OVERLAP;
    private static final SubLSymbol $sym647$CB_LINK_INDEX_OVERLAP;
    private static final SubLString $str648$Ovlp;
    private static final SubLString $str649$Term_Index_Overlap;
    private static final SubLString $str650$OWL_Import;
    private static final SubLString $str651$cb_owl_import;
    private static final SubLSymbol $kw652$OWL_IMPORT;
    private static final SubLSymbol $sym653$CB_LINK_OWL_IMPORT;
    private static final SubLString $str654$OWL_I;
    private static final SubLString $str655$OWL_Ontology_Importer;
    private static final SubLString $str656$OWL_Export;
    private static final SubLString $str657$cb_owl_export;
    private static final SubLSymbol $kw658$OWL_EXPORT;
    private static final SubLSymbol $sym659$CB_LINK_OWL_EXPORT;
    private static final SubLString $str660$OWL_E;
    private static final SubLString $str661$OWL_Ontology_Exporter;
    private static final SubLSymbol $kw662$COMPOSE;
    private static final SubLString $str663$compose_tool_gif;
    private static final SubLString $str664$Compose;
    private static final SubLString $str665$ke_compose;
    private static final SubLSymbol $sym666$CB_LINK_COMPOSE;
    private static final SubLString $str667$Compose_KE_Text;
    private static final SubLString $str668$Comp;
    private static final SubLString $str669$Navigator;
    private static final SubLString $str670$cyc_navigator;
    private static final SubLSymbol $kw671$NAVIGATOR;
    private static final SubLSymbol $sym672$CB_LINK_NAVIGATOR;
    private static final SubLString $str673$Nav;
    private static final SubLString $str674$Cyc_Navigator;
    private static final SubLSymbol $kw675$DOC;
    private static final SubLString $str676$doc_tool_gif;
    private static final SubLString $str677$_Doc_;
    private static final SubLString $str678$Doc;
    private static final SubLSymbol $sym679$CB_LINK_DOC;
    private static final SubLString $str680$Cyc_Documentation;
    private static final SubLString $str681$cb_start;
    private static final SubLString $str682$http___;
    private static final SubLString $str683$_;
    private static final SubLInteger $int684$3602;
    private static final SubLString $str685$_cyccgi;
    private static final SubLString $str686$_localhost;
    private static final SubLString $str687$_Monitor_;
    private static final SubLString $str688$_kbmonitor_makequery_jsp_kbq_stri;
    private static final SubLString $str689$_cyc_host_string_;
    private static final SubLString $str690$_cyc_port_string_;
    private static final SubLString $str691$_kbmonitor;
    private static final SubLInteger $int692$600;
    private static final SubLInteger $int693$400;
    private static final SubLSymbol $kw694$KB_MONITOR_INDEX_HOOK;
    private static final SubLSymbol $sym695$CB_LINK_KB_MONITOR_INDEX_HOOK;
    private static final SubLString $str696$Jstack_for_process_;
    private static final SubLSymbol $sym697$CB_JSTACK_TRACE;
    private static final SubLString $str698$jstack_Trace;
    private static final SubLString $str699$cyc_jstack_trace;
    private static final SubLSymbol $kw700$JSTACK_TRACE;
    private static final SubLSymbol $sym701$CB_LINK_JSTACK_TRACE;
    private static final SubLList $list702;
    private static final SubLString $str703$cb_jstack_trace;
    private static final SubLString $str704$JRTL_jstack_Trace;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 832L)
    public static SubLObject cb_tools(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_tools.$str2$Browser_Tools;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        if (cb_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_tools.$str15$cb_tools_handler, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw0$CB_TOOLS, (SubLObject)cb_tools.$kw16$SELF, (SubLObject)cb_tools.$str17$Choose_a_tool__or_modify_the_tool);
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_tools.$str18$Current_Values);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str19$Update_Toolbar, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str20$Update___Save, (SubLObject)cb_tools.$str21$save, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            SubLObject tools = conses_high.set_difference(cb_utilities.cb_standard_tools(), cb_utilities.cb_deprecated_tools(), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            cb_tool_columns(tools);
                            tools = cb_utilities.cb_deprecated_tools();
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str22$Deprecated_Tools);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            cb_tool_columns(tools);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 1614L)
    public static SubLObject cb_tool_columns(SubLObject tools) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        tools = Sort.sort(tools, Symbols.symbol_function((SubLObject)cb_tools.$sym25$STRING_), Symbols.symbol_function((SubLObject)cb_tools.$sym26$SECOND));
        final SubLObject total = Sequences.length(tools);
        SubLObject first_column = tools;
        SubLObject second_column = (SubLObject)cb_tools.NIL;
        SubLObject third_column = (SubLObject)cb_tools.NIL;
        if (total.numGE(cb_tools.$cb_tools_split_threshold$.getDynamicValue(thread))) {
            final SubLObject column_size = Numbers.integerDivide(Numbers.add(total, (SubLObject)cb_tools.THREE_INTEGER), (SubLObject)cb_tools.THREE_INTEGER);
            second_column = Sequences.subseq(tools, column_size, Numbers.multiply(column_size, (SubLObject)cb_tools.TWO_INTEGER));
            third_column = Sequences.subseq(tools, Numbers.multiply(column_size, (SubLObject)cb_tools.TWO_INTEGER), (SubLObject)cb_tools.UNPROVIDED);
            first_column = Sequences.subseq(tools, (SubLObject)cb_tools.ZERO_INTEGER, column_size);
        }
        if (cb_tools.NIL != second_column) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        cb_tools_internal(first_column);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        cb_tools_internal(second_column);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        cb_tools_internal(third_column);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        else {
            cb_tools_internal(first_column);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 2566L)
    public static SubLObject cb_tools_internal(final SubLObject tools) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            SubLObject cdolist_list_var = tools;
            SubLObject tool = (SubLObject)cb_tools.NIL;
            tool = cdolist_list_var.first();
            while (cb_tools.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    SubLObject current;
                    final SubLObject datum = current = tool;
                    SubLObject name = (SubLObject)cb_tools.NIL;
                    SubLObject pretty_name = (SubLObject)cb_tools.NIL;
                    SubLObject abbreviation = (SubLObject)cb_tools.NIL;
                    SubLObject description = (SubLObject)cb_tools.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list28);
                    name = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list28);
                    pretty_name = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list28);
                    abbreviation = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list28);
                    description = current.first();
                    current = current.rest();
                    final SubLObject availability = (SubLObject)(current.isCons() ? current.first() : cb_tools.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_tools.$list28);
                    current = current.rest();
                    if (cb_tools.NIL == current) {
                        if (cb_utilities.cb_link_method(name).isFunctionSpec()) {
                            final SubLObject default_checkedP = conses_high.member(name, cb_parameters.$cb_user_toolbar_links$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                                html_utilities.html_checkbox_input(print_high.prin1_to_string(name), (SubLObject)cb_tools.T, default_checkedP, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                if (cb_tools.NIL != description) {
                                    html_utilities.html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                    html_utilities.html_markup(description);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                                    cb_utilities.cb_link(name, pretty_name, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list28);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                tool = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 3421L)
    public static SubLObject cb_tools_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject available_tools = cb_utilities.cb_available_tools();
        SubLObject save_settingsP = (SubLObject)cb_tools.NIL;
        SubLObject tools = (SubLObject)cb_tools.NIL;
        SubLObject cdolist_list_var = args.rest();
        SubLObject arg = (SubLObject)cb_tools.NIL;
        arg = cdolist_list_var.first();
        while (cb_tools.NIL != cdolist_list_var) {
            final SubLObject arg_string = arg.first();
            final SubLObject name = reader.read_from_string_ignoring_errors(arg_string, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL != Sequences.find(name, available_tools, Symbols.symbol_function((SubLObject)cb_tools.EQL), Symbols.symbol_function((SubLObject)cb_tools.$sym29$FIRST), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)) {
                tools = (SubLObject)ConsesLow.cons(name, tools);
            }
            else if (arg_string.equal((SubLObject)cb_tools.$str21$save)) {
                save_settingsP = (SubLObject)cb_tools.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        tools = Sequences.nreverse(tools);
        cb_parameters.$cb_user_toolbar_links$.setDynamicValue(tools, thread);
        if (cb_tools.NIL != save_settingsP) {
            cb_save_interface_state();
        }
        html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_tools.$str30$Toolbar_Modified);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_update_cb_toolbar_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_tools.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_tools.$str31$Browser_Toolbar_Modified);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    cb_utilities.cb_frame_update_message_page_info((SubLObject)cb_tools.$str32$Tools);
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4211L)
    public static SubLObject cb_link_tools(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str32$Tools;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str35$cb_tools);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4396L)
    public static SubLObject html_update_cb_toolbar_script() {
        return html_script_utilities.html_refresh_frame_script(cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw38$TOOLBAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4646L)
    public static SubLObject declare_cb_boolean_global(final SubLObject global, final SubLObject plist) {
        return dictionary.dictionary_enter(cb_tools.$cb_boolean_globals$.getGlobalValue(), global, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4766L)
    public static SubLObject cb_boolean_option_field_name(final SubLObject global) {
        return conses_high.getf(dictionary.dictionary_lookup(cb_tools.$cb_boolean_globals$.getGlobalValue(), global, (SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.$kw39$FIELD_NAME, (SubLObject)cb_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4897L)
    public static SubLObject cb_boolean_option_legend_form(final SubLObject global) {
        return conses_high.getf(dictionary.dictionary_lookup(cb_tools.$cb_boolean_globals$.getGlobalValue(), global, (SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.$kw40$LEGEND_FORM, (SubLObject)cb_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 5030L)
    public static SubLObject cb_boolean_option_check(final SubLObject global) {
        final SubLObject check_fn = conses_high.getf(dictionary.dictionary_lookup(cb_tools.$cb_boolean_globals$.getGlobalValue(), global, (SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.$kw41$CHECK_FN, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != Symbols.fboundp(check_fn)) {
            return Functions.funcall(check_fn);
        }
        return list_utilities.sublisp_boolean(Symbols.symbol_value(global));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 5359L)
    public static SubLObject cb_boolean_option_new_value(final SubLObject global, final SubLObject html_ans) {
        final SubLObject new_value_fn = conses_high.getf(dictionary.dictionary_lookup(cb_tools.$cb_boolean_globals$.getGlobalValue(), global, (SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.$kw42$NEW_VALUE_FN, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != Symbols.fboundp(new_value_fn)) {
            return Functions.funcall(new_value_fn, html_ans);
        }
        return list_utilities.sublisp_boolean(html_ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 5699L)
    public static SubLObject cb_show_boolean_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject global = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list43);
        global = current.first();
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject field_name = (SubLObject)cb_tools.$sym44$FIELD_NAME;
            final SubLObject legend_form = (SubLObject)cb_tools.$sym45$LEGEND_FORM;
            return (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym46$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(field_name, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym47$CB_BOOLEAN_OPTION_FIELD_NAME, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym48$QUOTE, global))), (SubLObject)ConsesLow.list(legend_form, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym49$CB_BOOLEAN_OPTION_LEGEND_FORM, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym48$QUOTE, global)))), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym50$PWHEN, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym51$CAND, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym52$STRINGP, field_name), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym53$LISTP, legend_form)), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym54$CB_CHECKBOX_OPTION, (SubLObject)ConsesLow.list(field_name, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym55$CB_BOOLEAN_OPTION_CHECK, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym48$QUOTE, global))), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym56$EVAL, legend_form))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list43);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 9581L)
    public static SubLObject cb_fastP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_parameters.$cb_fastP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 9983L)
    public static SubLObject cb_new_script_mode(final SubLObject html_ans) {
        return (SubLObject)((cb_tools.NIL != list_utilities.sublisp_boolean(html_ans)) ? cb_tools.$kw89$JAVASCRIPT : cb_tools.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 14762L)
    public static SubLObject cb_options_submit_bar(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (cb_tools.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.NIL);
        }
        return (SubLObject)cb_tools.$list132;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 15176L)
    public static SubLObject cb_options(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_tools.$str135$Browser_Preferences;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        if (cb_tools.NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                            html_script_utilities.cb_hoverover_page_init();
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        if (cb_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_tools.$str136$cb_options_handler, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw133$CB_OPTIONS, (SubLObject)cb_tools.$kw16$SELF, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_tools.$str137$Reset_Form);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str138$Submit, (SubLObject)cb_tools.$str139$update, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str140$Submit___Save, (SubLObject)cb_tools.$str141$update_and_save, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str142$Load_Saved, (SubLObject)cb_tools.$str143$load_saved, (SubLObject)cb_tools.UNPROVIDED);
                            cb_options_table_of_contents();
                            cb_options_general();
                            cb_options_term_display();
                            cb_options_history_and_browser_tool();
                            cb_options_nl();
                            cb_options_query_tool();
                            html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_tools.$str137$Reset_Form);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str138$Submit, (SubLObject)cb_tools.$str139$update, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str140$Submit___Save, (SubLObject)cb_tools.$str141$update_and_save, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str142$Load_Saved, (SubLObject)cb_tools.$str143$load_saved, (SubLObject)cb_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$18, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 16211L)
    public static SubLObject cb_options_table_of_contents() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_tools.$str146$Jump_to_Section);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            SubLObject cdolist_list_var = cb_tools.$cb_option_section_names$.getGlobalValue();
            SubLObject cons = (SubLObject)cb_tools.NIL;
            cons = cdolist_list_var.first();
            while (cb_tools.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = (SubLObject)cb_tools.NIL;
                SubLObject name = (SubLObject)cb_tools.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list147);
                key = current.first();
                current = (name = current.rest());
                final SubLObject url = Sequences.cconcatenate((SubLObject)cb_tools.$str148$_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(name, (SubLObject)cb_tools.UNPROVIDED)));
                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(url);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_princ_strong(name);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 16562L)
    public static SubLObject cb_options_section(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list149);
        key = current.first();
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject name = (SubLObject)cb_tools.$sym150$NAME;
            return (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym46$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(name, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym151$ALIST_LOOKUP_WITHOUT_VALUES, (SubLObject)cb_tools.$sym152$_CB_OPTION_SECTION_NAMES_, key))), (SubLObject)cb_tools.$list153, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym154$HTML_HEADING, (SubLObject)cb_tools.$list155, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym156$HTML_FANCY_DIV, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$kw157$ID, name), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym158$HTML_PRINC, name))), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym159$HTML_FANCY_TABLE, (SubLObject)cb_tools.$list160, reader.bq_cons((SubLObject)cb_tools.$sym161$HTML_TABLE_ROW, ConsesLow.append(body, (SubLObject)cb_tools.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list149);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 16985L)
    public static SubLObject cb_options_section_column(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym162$PROGN, (SubLObject)cb_tools.$list163, (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym164$HTML_FANCY_TABLE_DATA, (SubLObject)cb_tools.$list165, ConsesLow.append(body, (SubLObject)cb_tools.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 17233L)
    public static SubLObject cb_options_subsection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list166);
        name = current.first();
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym162$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym154$HTML_HEADING, (SubLObject)cb_tools.$list167, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym168$HTML_FORMAT, (SubLObject)cb_tools.$str169$_A__, name)), ConsesLow.append(body, (SubLObject)cb_tools.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list166);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 17433L)
    public static SubLObject cb_option_with_title_only(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list171);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list171);
        title = current.first();
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym162$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym172$HTML_PRINC_STRONG, title), (SubLObject)cb_tools.$list173, (SubLObject)cb_tools.$list174, ConsesLow.append(body, (SubLObject)cb_tools.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list171);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 17708L)
    public static SubLObject cb_option_with_title_and_hoverover(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list177);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)cb_tools.NIL;
        SubLObject hoverover = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list177);
        title = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list177);
        hoverover = current.first();
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym162$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym178$PIF, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym52$STRINGP, hoverover), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym179$HTML_PRINC_STRONG_WITH_EXPLANATION, title, hoverover), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym172$HTML_PRINC_STRONG, title)), (SubLObject)cb_tools.$list173, (SubLObject)cb_tools.$list174, ConsesLow.append(body, (SubLObject)cb_tools.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list177);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18098L)
    public static SubLObject cb_option_with_title(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list180);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list180);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_tools.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_tools.NIL;
        SubLObject current_$25 = (SubLObject)cb_tools.NIL;
        while (cb_tools.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_tools.$list180);
            current_$25 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_tools.$list180);
            if (cb_tools.NIL == conses_high.member(current_$25, (SubLObject)cb_tools.$list181, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)) {
                bad = (SubLObject)cb_tools.T;
            }
            if (current_$25 == cb_tools.$kw182$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_tools.NIL != bad && cb_tools.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list180);
        }
        final SubLObject hoverover_tail = cdestructuring_bind.property_list_member((SubLObject)cb_tools.$kw183$HOVEROVER, current);
        final SubLObject hoverover = (SubLObject)((cb_tools.NIL != hoverover_tail) ? conses_high.cadr(hoverover_tail) : cb_tools.NIL);
        final SubLObject body;
        current = (body = temp);
        if (cb_tools.NIL != hoverover) {
            return (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER, (SubLObject)ConsesLow.list(title, hoverover), ConsesLow.append(body, (SubLObject)cb_tools.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym170$CB_OPTION_WITH_TITLE_ONLY, (SubLObject)ConsesLow.list(title), ConsesLow.append(body, (SubLObject)cb_tools.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18367L)
    public static SubLObject cb_checkbox_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list184);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)cb_tools.NIL;
        SubLObject checkedP = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list184);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list184);
        checkedP = current.first();
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject legend_form;
            current = (legend_form = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_tools.$sym162$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym185$HTML_CHECKBOX_INPUT, name, (SubLObject)cb_tools.T, checkedP), (SubLObject)cb_tools.$list186, ConsesLow.append(legend_form, (SubLObject)cb_tools.$list187));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list184);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18607L)
    public static SubLObject cb_constant_entry_option(final SubLObject legend_text, final SubLObject name, final SubLObject v_default, SubLObject filter, SubLObject hoverover) {
        if (filter == cb_tools.UNPROVIDED) {
            filter = (SubLObject)cb_tools.NIL;
        }
        if (hoverover == cb_tools.UNPROVIDED) {
            hoverover = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hoverover.isString()) {
            cb_query.html_princ_strong_with_explanation(legend_text, hoverover, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        else {
            html_utilities.html_princ_strong(legend_text);
        }
        html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_text_input(name, v_default, cb_parameters.$cb_constant_input_width$.getDynamicValue(thread));
        html_complete.html_complete_button(name, (SubLObject)cb_tools.$str189$Complete, filter, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_script_utilities.html_clear_input_button(name, (SubLObject)cb_tools.$str190$Clear, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18961L)
    public static SubLObject cb_options_general() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values(cb_tools.$cb_option_section_names$.getGlobalValue(), (SubLObject)cb_tools.$kw191$GENERAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_tools.NIL != name) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(name);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    SubLObject field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym193$_HLMTS_SUPPORTED__);
                    SubLObject legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym193$_HLMTS_SUPPORTED__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym193$_HLMTS_SUPPORTED__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    if (cb_tools.$str194$Simple_transformations_to_make_co.isString()) {
                        cb_query.html_princ_strong_with_explanation((SubLObject)cb_tools.$str195$NAUT_Readability, (SubLObject)cb_tools.$str194$Simple_transformations_to_make_co, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_princ_strong((SubLObject)cb_tools.$str195$NAUT_Readability);
                    }
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym61$_CB_DISPLAY_DATES_AS_STRINGS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym61$_CB_DISPLAY_DATES_AS_STRINGS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym61$_CB_DISPLAY_DATES_AS_STRINGS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str196$Miscellaneous);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym57$_CB_C_WRAP_ASSERTIONS_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym57$_CB_C_WRAP_ASSERTIONS_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym57$_CB_C_WRAP_ASSERTIONS_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym67$_CB_WRAP_INTERACTOR_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym67$_CB_WRAP_INTERACTOR_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym67$_CB_WRAP_INTERACTOR_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym77$_CB_SEPARATE_DOC_FRAME_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym77$_CB_SEPARATE_DOC_FRAME_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym77$_CB_SEPARATE_DOC_FRAME_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym73$_CB_SHOW_CYCLIFY_BUTTON_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym73$_CB_SHOW_CYCLIFY_BUTTON_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym73$_CB_SHOW_CYCLIFY_BUTTON_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym75$_CB_ENABLE_INFERENCE_MONITORING_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym75$_CB_ENABLE_INFERENCE_MONITORING_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym75$_CB_ENABLE_INFERENCE_MONITORING_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym81$_CB_FAST__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym81$_CB_FAST__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym81$_CB_FAST__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym90$_CB_HOVEROVER_ENABLED_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym90$_CB_HOVEROVER_ENABLED_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym90$_CB_HOVEROVER_ENABLED_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str197$Primary_Presentation_Language);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str198$presentation_language, (SubLObject)cb_tools.$str199$_cycl, Equality.eq((SubLObject)cb_tools.$kw200$CYCL, control_vars.$cb_major_presentation_language$.getDynamicValue(thread)), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str201$CycL__default_);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str198$presentation_language, (SubLObject)cb_tools.$str202$_nl, Equality.eq((SubLObject)cb_tools.$kw203$NL, control_vars.$cb_major_presentation_language$.getDynamicValue(thread)), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str204$Natural_Language__slow_);
                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str205$Status_Frame_Update);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str206$Update_every_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str207$status_interval, cb_parameters.$cb_status_update_interval$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str208$seconds__or_empty_to_disable_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 21486L)
    public static SubLObject cb_options_term_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values(cb_tools.$cb_option_section_names$.getGlobalValue(), (SubLObject)cb_tools.$kw209$TERM_DISPLAY, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_tools.NIL != name) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(name);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str210$Default_Index_View);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str211$index_view, (SubLObject)cb_tools.$str212$_inferred, Equality.eq(cb_frames.$cb_default_index_view$.getDynamicValue(thread), (SubLObject)cb_tools.$kw213$INFERRED), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str214$Inferred);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str211$index_view, (SubLObject)cb_tools.$str215$_legacy, Equality.eq(cb_frames.$cb_default_index_view$.getDynamicValue(thread), (SubLObject)cb_tools.$kw216$LEGACY), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str217$Legacy);
                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str218$Default_Content);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_script_utilities.html_focus_radio_input((SubLObject)cb_tools.$str219$content, (SubLObject)cb_tools.$str220$upper_bound, (SubLObject)cb_tools.$str221$_maximal, Equality.eq(cb_parameters.$cb_c_default_content$.getDynamicValue(thread), (SubLObject)cb_tools.$kw222$MAXIMAL), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str223$As_much_as_possible_up_to_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str220$upper_bound, cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_tools.$str224$_assertions);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_script_utilities.html_clear_radio_input((SubLObject)cb_tools.$str219$content, (SubLObject)cb_tools.$str220$upper_bound, (SubLObject)cb_tools.$str225$_documentation, Equality.eq(cb_parameters.$cb_c_default_content$.getDynamicValue(thread), (SubLObject)cb_tools.$kw226$DOCUMENTATION), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str227$Documentation);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_script_utilities.html_clear_radio_input((SubLObject)cb_tools.$str219$content, (SubLObject)cb_tools.$str220$upper_bound, (SubLObject)cb_tools.$str228$_definitional, Equality.eq(cb_parameters.$cb_c_default_content$.getDynamicValue(thread), (SubLObject)cb_tools.$kw229$DEFINITIONAL), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str230$Definitional_Information);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_script_utilities.html_clear_radio_input((SubLObject)cb_tools.$str219$content, (SubLObject)cb_tools.$str220$upper_bound, (SubLObject)cb_tools.$str231$_lexical, Equality.eq(cb_parameters.$cb_c_default_content$.getDynamicValue(thread), (SubLObject)cb_tools.$kw232$LEXICAL), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str233$Lexical_Information);
                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str234$Assertion_Formulas);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str235$formulas_display, (SubLObject)cb_tools.$str236$_hl_formulas, Equality.eq(cb_parameters.$cb_c_assertion_formulas_display$.getDynamicValue(thread), (SubLObject)cb_tools.$kw237$HL_FORMULAS), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str238$HL_formulas__fast_);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str235$formulas_display, (SubLObject)cb_tools.$str239$_el_formulas, Equality.eq(cb_parameters.$cb_c_assertion_formulas_display$.getDynamicValue(thread), (SubLObject)cb_tools.$kw240$EL_FORMULAS), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str241$EL_formulas__slow_);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str235$formulas_display, (SubLObject)cb_tools.$str242$_el_formulas_except_when_browsing, Equality.eq(cb_parameters.$cb_c_assertion_formulas_display$.getDynamicValue(thread), (SubLObject)cb_tools.$kw243$EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str244$EL_formulas_except_when_browsing_);
                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str245$Literal_Queries);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
                    SubLObject legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str246$Applicable_Relations);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str247$Assertion_Display_Options);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym92$_CB_A_SHOW_EL_FORMULA_);
                    SubLObject legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym92$_CB_A_SHOW_EL_FORMULA_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym92$_CB_A_SHOW_EL_FORMULA_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym94$_CB_A_SHOW_HL_FORMULA_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym94$_CB_A_SHOW_HL_FORMULA_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym94$_CB_A_SHOW_HL_FORMULA_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym96$_CB_A_SHOW_ENGLISH_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym96$_CB_A_SHOW_ENGLISH_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym96$_CB_A_SHOW_ENGLISH_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str248$Assertion_Editing_Options);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str249$FET_Launching_Buttons);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym114$_SHOW_FET_EDIT_BUTTONS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym114$_SHOW_FET_EDIT_BUTTONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym114$_SHOW_FET_EDIT_BUTTONS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 25149L)
    public static SubLObject cb_options_history_and_browser_tool() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values(cb_tools.$cb_option_section_names$.getGlobalValue(), (SubLObject)cb_tools.$kw250$HISTORY_AND_TOOLS, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_tools.NIL != name) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(name);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str251$History_Display_Options);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym104$_CB_USE_CATEGORIZED_HISTORY__);
                    SubLObject legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym104$_CB_USE_CATEGORIZED_HISTORY__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym104$_CB_USE_CATEGORIZED_HISTORY__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_princ((SubLObject)cb_tools.$str252$Display_no_more_than_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str253$constant_history_max, cb_parameters.$cb_constant_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_tools.$str254$_constants);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str252$Display_no_more_than_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str255$constant_history_chronological_ma, cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_tools.$str256$_constants_chronologically);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str252$Display_no_more_than_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str257$nat_history_max, cb_parameters.$cb_nat_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_tools.$str258$_NARTs);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str252$Display_no_more_than_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str259$assertion_history_max, cb_parameters.$cb_assertion_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_tools.$str224$_assertions);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str252$Display_no_more_than_);
                    html_utilities.html_text_input((SubLObject)cb_tools.$str260$sentence_history_max, cb_parameters.$cb_sentence_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_tools.$str261$_sentences);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym106$_CB_HISTORY_SHOW_EL_FORMULAS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym106$_CB_HISTORY_SHOW_EL_FORMULAS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym106$_CB_HISTORY_SHOW_EL_FORMULAS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str262$Browser_Tool_Options);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    cb_constant_entry_option((SubLObject)cb_tools.$str263$Default_Mt, (SubLObject)cb_tools.$str264$default_mt, cb_parameters.$cb_default_mt$.getDynamicValue(thread), cb_tools.$const265$Microtheory, (SubLObject)cb_tools.$str266$What_microtheory_should_be_used_a);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 27119L)
    public static SubLObject cb_options_nl() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values(cb_tools.$cb_option_section_names$.getGlobalValue(), (SubLObject)cb_tools.$kw203$NL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_tools.NIL != name) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(name);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str269$NL_Generation);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    if (cb_tools.$str270$Which_mt_should_be_used_for_gener.isString()) {
                        cb_query.html_princ_strong_with_explanation((SubLObject)cb_tools.$str271$Default_NL_Generation_Mt, (SubLObject)cb_tools.$str270$Which_mt_should_be_used_for_gener, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_princ_strong((SubLObject)cb_tools.$str271$Default_NL_Generation_Mt);
                    }
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    cb_form_widgets.cb_mt_input_section(cb_paraphrase_mt(), (SubLObject)cb_tools.$list272);
                    SubLObject field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym108$_ASSUME_CYC_CYCLIST_DIALOG__);
                    SubLObject legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym108$_ASSUME_CYC_CYCLIST_DIALOG__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym108$_ASSUME_CYC_CYCLIST_DIALOG__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym110$_GENERATED_PHRASES_BROWSABLE__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym110$_GENERATED_PHRASES_BROWSABLE__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym110$_GENERATED_PHRASES_BROWSABLE__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str273$Proof_Views);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    if (cb_tools.$str274$Which_parameters_should_be_used_f.isString()) {
                        cb_query.html_princ_strong_with_explanation((SubLObject)cb_tools.$str275$Default_Parameters, (SubLObject)cb_tools.$str274$Which_parameters_should_be_used_f, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_princ_strong((SubLObject)cb_tools.$str275$Default_Parameters);
                    }
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_create_simple_dropdown_list((SubLObject)cb_tools.$str276$proof_view_params, (SubLObject)ConsesLow.cons((SubLObject)cb_tools.$kw277$DEFAULT, Sequences.remove(narts_high.find_nart((SubLObject)cb_tools.$list278), kb_utilities.sort_terms(isa.all_instances_in_all_mts(narts_high.find_nart((SubLObject)cb_tools.$list279)), (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)), cb_proof_view.$cb_proof_view_default_params$.getDynamicValue(thread));
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str169$_A__, (SubLObject)cb_tools.$str280$Lexification);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_tools.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    cb_constant_entry_option((SubLObject)cb_tools.$str281$Reviewer, (SubLObject)cb_tools.$str282$lex_reviewer, lexification_utilities.$lexification_reviewer$.getDynamicValue(thread), cb_tools.$const283$Cyclist, (SubLObject)cb_tools.$str284$Which_Cyclist_is_to_reviewer_your);
                    cb_constant_entry_option((SubLObject)cb_tools.$str285$Default_Microtheory, (SubLObject)cb_tools.$str286$lex_mt, lexicon_vars.$default_lexification_mt$.getDynamicValue(thread), cb_tools.$const265$Microtheory, (SubLObject)cb_tools.$str287$What_microtheory_should_your_lexi);
                    cb_constant_entry_option((SubLObject)cb_tools.$str288$Default_Syntactic_Microtheory, (SubLObject)cb_tools.$str289$lex_syntactic_mt, lexicon_vars.$default_syntactic_mt$.getDynamicValue(thread), cb_tools.$const265$Microtheory, (SubLObject)cb_tools.$str290$What_microtheory_should_your_synt);
                    cb_constant_entry_option((SubLObject)cb_tools.$str291$Default_Paraphrase_Microtheory, (SubLObject)cb_tools.$str292$lex_pph_mt, lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread), cb_tools.$const265$Microtheory, (SubLObject)cb_tools.$str293$What_microtheory_should_your_para);
                    cb_constant_entry_option((SubLObject)cb_tools.$str294$Default_Parse_Template_Microtheor, (SubLObject)cb_tools.$str295$lex_parse_template_mt, lexicon_vars.$default_lexification_template_mt$.getDynamicValue(thread), cb_tools.$const265$Microtheory, (SubLObject)cb_tools.$str296$What_microtheory_should_your_pars);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 30086L)
    public static SubLObject cb_paraphrase_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (cb_tools.NIL != control_vars.$cb_paraphrase_mt$.getDynamicValue(thread)) ? control_vars.$cb_paraphrase_mt$.getDynamicValue(thread) : pph_vars.pph_language_mt();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 30211L)
    public static SubLObject cb_options_query_tool() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values(cb_tools.$cb_option_section_names$.getGlobalValue(), (SubLObject)cb_tools.$kw297$QUERY_TOOL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_tools.NIL != name) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(name);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str298$Results_Display);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_);
                    SubLObject legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name((SubLObject)cb_tools.$sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__);
                    legend_form = cb_boolean_option_legend_form((SubLObject)cb_tools.$sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_utilities.html_checkbox_input(field_name, (SubLObject)cb_tools.T, cb_boolean_option_check((SubLObject)cb_tools.$sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                        Eval.eval(legend_form);
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str299$Automatically_Destroying_Inferenc);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    SubLObject entry_focus = (SubLObject)cb_tools.NIL;
                    if (cb_tools.NIL == number_utilities.positive_infinity_p(cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread))) {
                        entry_focus = (SubLObject)cb_tools.T;
                    }
                    else {
                        entry_focus = (SubLObject)cb_tools.NIL;
                    }
                    html_script_utilities.html_focus_radio_input((SubLObject)cb_tools.$str300$destroy_inferences, (SubLObject)cb_tools.$str301$entry_destroy_inferences, (SubLObject)cb_tools.ZERO_INTEGER, entry_focus, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str302$Keep_only_last_);
                    if (cb_tools.NIL != number_utilities.non_negative_number_p(cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread)) && cb_tools.NIL == number_utilities.positive_infinity_p(cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread))) {
                        html_utilities.html_text_input((SubLObject)cb_tools.$str301$entry_destroy_inferences, cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread), (SubLObject)cb_tools.THREE_INTEGER);
                    }
                    else {
                        html_utilities.html_text_input((SubLObject)cb_tools.$str301$entry_destroy_inferences, cb_parameters.$cb_destroy_all_inferences_but_last_n_default$.getGlobalValue(), (SubLObject)cb_tools.THREE_INTEGER);
                    }
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str303$inferences__at_most__defaults_to_);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str300$destroy_inferences, (SubLObject)cb_tools.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeBoolean(cb_tools.NIL == entry_focus), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str304$Keep_all);
                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str305$Default_Query_Mt);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    cb_form_widgets.cb_mt_input_section(cb_query.default_new_inference_mt(), (SubLObject)cb_tools.$list306);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw192$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_tools.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str307$Closed_Queries);
                    html_utilities.html_princ_strong((SubLObject)cb_tools.$str188$__);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str308$perform_argumentation_for_closed_, (SubLObject)cb_tools.$str309$t, cb_parameters.$cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str310$Gather_and_weigh_both_pro_and_con);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_tools.$str308$perform_argumentation_for_closed_, (SubLObject)cb_tools.$str311$nil, (SubLObject)SubLObjectFactory.makeBoolean(cb_tools.NIL == cb_parameters.$cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread)), (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_tools.$str312$Attempt_to_prove_only_pro_argumen);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 32613L)
    public static SubLObject cb_options_boolean_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = dictionary.dictionary_keys(cb_tools.$cb_boolean_globals$.getGlobalValue());
        SubLObject global = (SubLObject)cb_tools.NIL;
        global = cdolist_list_var.first();
        while (cb_tools.NIL != cdolist_list_var) {
            final SubLObject field_name = cb_boolean_option_field_name(global);
            if (field_name.isString()) {
                final SubLObject value = cb_boolean_option_new_value(global, html_utilities.html_extract_input(field_name, args));
                cb_options_set_boolean(global, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        }
        wff_vars.$wff_mode$.setDynamicValue((SubLObject)((cb_tools.NIL != cb_tools.$cb_wff_strictP$.getDynamicValue(thread)) ? cb_tools.$kw313$STRICT : cb_tools.$kw314$ASSERTIVE), thread);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 33101L)
    public static SubLObject cb_options_set_boolean(final SubLObject global, final SubLObject value) {
        Symbols.set(global, value);
        return Symbols.symbol_value(global);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 33258L)
    public static SubLObject cb_options_handler(final SubLObject args) {
        if (cb_tools.NIL != html_utilities.html_extract_input((SubLObject)cb_tools.$str143$load_saved, args)) {
            return cb_load_user_preferences(args);
        }
        final SubLObject default_mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_tools.$str264$default_mt, args), (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != forts.fort_p(default_mt)) {
            cb_parameters.$cb_default_mt$.setDynamicValue(default_mt);
        }
        cb_lexification_options_handler(args);
        cb_pph_options_handler(args);
        SubLObject presentation_language = html_utilities.html_extract_input((SubLObject)cb_tools.$str198$presentation_language, args);
        if (cb_tools.NIL != presentation_language) {
            presentation_language = reader.read_from_string_ignoring_errors(presentation_language, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == control_vars.cb_presentation_language_p(presentation_language)) {
            presentation_language = (SubLObject)cb_tools.$kw200$CYCL;
        }
        control_vars.$cb_major_presentation_language$.setDynamicValue(presentation_language);
        SubLObject status_interval = html_utilities.html_extract_input((SubLObject)cb_tools.$str207$status_interval, args);
        if (cb_tools.NIL != status_interval) {
            status_interval = reader.read_from_string_ignoring_errors(status_interval, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == status_interval || (status_interval.isInteger() && status_interval.isPositive())) {
            cb_parameters.$cb_status_update_interval$.setDynamicValue(status_interval);
        }
        cb_history_display_options_handler(args);
        cb_term_display_options_handler(args);
        cb_query_tool_options_handler(args);
        cb_options_handler_finish(args);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 34926L)
    public static SubLObject cb_history_display_options_handler(final SubLObject args) {
        SubLObject foo = html_utilities.html_extract_input((SubLObject)cb_tools.$str253$constant_history_max, args);
        if (cb_tools.NIL != foo) {
            foo = reader.read_from_string_ignoring_errors(foo, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == foo || (foo.isInteger() && foo.isPositive())) {
            cb_parameters.$cb_constant_history_max$.setDynamicValue(foo);
        }
        foo = html_utilities.html_extract_input((SubLObject)cb_tools.$str255$constant_history_chronological_ma, args);
        if (cb_tools.NIL != foo) {
            foo = reader.read_from_string_ignoring_errors(foo, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == foo || foo.isInteger()) {
            cb_parameters.$cb_constant_history_chronological_max$.setDynamicValue(foo);
        }
        foo = html_utilities.html_extract_input((SubLObject)cb_tools.$str257$nat_history_max, args);
        if (cb_tools.NIL != foo) {
            foo = reader.read_from_string_ignoring_errors(foo, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == foo || (foo.isInteger() && foo.isPositive())) {
            cb_parameters.$cb_nat_history_max$.setDynamicValue(foo);
        }
        foo = html_utilities.html_extract_input((SubLObject)cb_tools.$str259$assertion_history_max, args);
        if (cb_tools.NIL != foo) {
            foo = reader.read_from_string_ignoring_errors(foo, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == foo || (foo.isInteger() && foo.isPositive())) {
            cb_parameters.$cb_assertion_history_max$.setDynamicValue(foo);
        }
        foo = html_utilities.html_extract_input((SubLObject)cb_tools.$str260$sentence_history_max, args);
        if (cb_tools.NIL != foo) {
            foo = reader.read_from_string_ignoring_errors(foo, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == foo || (foo.isInteger() && foo.isPositive())) {
            cb_parameters.$cb_sentence_history_max$.setDynamicValue(foo);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 36327L)
    public static SubLObject cb_term_display_options_handler(final SubLObject args) {
        final SubLObject index_view = html_utilities.html_extract_input((SubLObject)cb_tools.$str211$index_view, args);
        cb_frames.$cb_default_index_view$.setDynamicValue(reader.read_from_string_ignoring_errors(index_view, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        SubLObject content = html_utilities.html_extract_input((SubLObject)cb_tools.$str219$content, args);
        if (cb_tools.NIL != content) {
            content = reader.read_from_string_ignoring_errors(content, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            if (content == cb_tools.$kw222$MAXIMAL) {
                final SubLObject upper_bound_string = html_utilities.html_extract_input((SubLObject)cb_tools.$str220$upper_bound, args);
                if (cb_tools.NIL != upper_bound_string) {
                    final SubLObject upper_bound = reader.read_from_string_ignoring_errors(upper_bound_string, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    if (upper_bound.isInteger()) {
                        cb_parameters.$cb_c_maximal_upper_bound$.setDynamicValue(upper_bound);
                    }
                    else {
                        cb_parameters.$cb_c_maximal_upper_bound$.setDynamicValue((SubLObject)cb_tools.NIL);
                    }
                }
                else {
                    cb_parameters.$cb_c_maximal_upper_bound$.setDynamicValue((SubLObject)cb_tools.NIL);
                }
            }
            cb_parameters.$cb_c_default_content$.setDynamicValue(content);
        }
        final SubLObject formulas_display = html_utilities.html_extract_input((SubLObject)cb_tools.$str235$formulas_display, args);
        cb_parameters.$cb_c_assertion_formulas_display$.setDynamicValue(reader.read_from_string_ignoring_errors(formulas_display, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        cb_parameters.$cb_c_formula_display_exception_index_hook$.setDynamicValue((SubLObject)cb_tools.NIL);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 37459L)
    public static SubLObject cb_lexification_options_handler(final SubLObject args) {
        final SubLObject lex_mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_tools.$str286$lex_mt, args), (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject lex_reviewer = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_tools.$str282$lex_reviewer, args), (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject lex_syntactic_mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_tools.$str289$lex_syntactic_mt, args), (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject lex_pph_mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_tools.$str292$lex_pph_mt, args), (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject lex_parse_template_mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_tools.$str295$lex_parse_template_mt, args), (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != forts.fort_p(lex_mt)) {
            lexicon_vars.$default_lexification_mt$.setDynamicValue(lex_mt);
        }
        if (cb_tools.NIL != forts.fort_p(lex_syntactic_mt)) {
            lexicon_vars.$default_syntactic_mt$.setDynamicValue(lex_syntactic_mt);
        }
        if (cb_tools.NIL == lex_reviewer || cb_tools.NIL != forts.fort_p(lex_reviewer)) {
            lexification_utilities.$lexification_reviewer$.setDynamicValue(lex_reviewer);
        }
        if (cb_tools.NIL != forts.fort_p(lex_pph_mt)) {
            lexicon_vars.$default_relational_lexification_mt$.setDynamicValue(lex_pph_mt);
        }
        if (cb_tools.NIL != forts.fort_p(lex_parse_template_mt)) {
            lexicon_vars.$default_lexification_template_mt$.setDynamicValue(lex_parse_template_mt);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 38991L)
    public static SubLObject cb_pph_options_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject default_pph_mt = cb_form_widgets.cb_extract_mt_input(args, control_vars.$cb_paraphrase_mt$.getDynamicValue(thread), (SubLObject)cb_tools.$list272);
        final SubLObject error = thread.secondMultipleValue();
        final SubLObject bad_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_tools.NIL != error) {
            return cb_utilities.cb_error((SubLObject)cb_tools.$str316$Default_NL_Generation_Mt__The_inp, bad_string, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        cb_set_default_pph_mt(default_pph_mt);
        final SubLObject proof_view_params = html_utilities.html_extract_input((SubLObject)cb_tools.$str276$proof_view_params, args);
        final SubLObject value = (SubLObject)(cb_tools.$str317$DEFAULT.equal(proof_view_params) ? cb_tools.$kw277$DEFAULT : cb_utilities.cb_guess_fort(proof_view_params, (SubLObject)cb_tools.UNPROVIDED));
        if (value.eql((SubLObject)cb_tools.$kw277$DEFAULT) || cb_tools.NIL != forts.fort_p(value)) {
            cb_proof_view.$cb_proof_view_default_params$.setDynamicValue(value, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 38991L)
    public static SubLObject cb_set_default_pph_mt(final SubLObject default_pph_mt) {
        control_vars.$cb_paraphrase_mt$.setDynamicValue(default_pph_mt);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 39775L)
    public static SubLObject cb_query_tool_options_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject destroy_inferences = html_utilities.html_extract_input((SubLObject)cb_tools.$str300$destroy_inferences, args);
        if (cb_tools.NIL != destroy_inferences) {
            destroy_inferences = reader.read_from_string_ignoring_errors(destroy_inferences, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        if (destroy_inferences.eql((SubLObject)cb_tools.ZERO_INTEGER)) {
            destroy_inferences = html_utilities.html_extract_input((SubLObject)cb_tools.$str301$entry_destroy_inferences, args);
            destroy_inferences = reader.read_from_string_ignoring_errors(destroy_inferences, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        else if (destroy_inferences.eql((SubLObject)cb_tools.ONE_INTEGER)) {
            destroy_inferences = (SubLObject)cb_tools.$kw318$POSITIVE_INFINITY;
        }
        if (cb_tools.NIL != number_utilities.non_negative_potentially_infinite_number_p(destroy_inferences)) {
            cb_parameters.$cb_destroy_all_inferences_but_last_n$.setDynamicValue(destroy_inferences, thread);
        }
        cb_query.cb_destroy_all_inferences_but_last_n();
        thread.resetMultipleValues();
        final SubLObject default_query_mt = cb_form_widgets.cb_extract_mt_input(args, cb_query.default_new_inference_mt(), (SubLObject)cb_tools.$list306);
        final SubLObject error = thread.secondMultipleValue();
        final SubLObject bad_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_tools.NIL != error) {
            return cb_utilities.cb_error((SubLObject)cb_tools.$str319$Default_Query_Mt__The_input___A__, bad_string, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        cb_query.set_default_new_inference_mt(default_query_mt);
        final SubLObject argumentation_str = html_utilities.html_extract_input((SubLObject)cb_tools.$str308$perform_argumentation_for_closed_, args);
        final SubLObject argumentationP = list_utilities.sublisp_boolean(reader.read_from_string_ignoring_errors(argumentation_str, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        cb_parameters.$cb_perform_argumentation_for_closed_queryP$.setDynamicValue(argumentationP, thread);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 41125L)
    public static SubLObject cb_options_handler_finish(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject use_hoverover = html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread);
        SubLObject savedP = (SubLObject)cb_tools.NIL;
        cb_options_boolean_handler(args);
        if (cb_tools.NIL == cb_parameters.$cb_a_show_el_formula$.getDynamicValue(thread) && cb_tools.NIL == cb_parameters.$cb_a_show_hl_formula$.getDynamicValue(thread) && cb_tools.NIL == cb_parameters.$cb_a_show_english$.getDynamicValue(thread)) {
            cb_parameters.$cb_a_show_hl_formula$.setDynamicValue((SubLObject)cb_tools.T, thread);
        }
        if (cb_tools.NIL != html_utilities.html_extract_input((SubLObject)cb_tools.$str141$update_and_save, args)) {
            savedP = cb_save_interface_state();
        }
        final SubLObject restart_requiredP = (SubLObject)cb_tools.NIL;
        final SubLObject _prev_bind_0 = html_script_utilities.$cb_hoverover_enabled$.currentBinding(thread);
        try {
            html_script_utilities.$cb_hoverover_enabled$.bind(use_hoverover, thread);
            cb_options_result_page(restart_requiredP, savedP);
        }
        finally {
            html_script_utilities.$cb_hoverover_enabled$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 42035L)
    public static SubLObject cb_link_options(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str320$Preferences;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str321$cb_options);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 42305L)
    public static SubLObject cb_options_result_page(SubLObject restart_linkP, SubLObject savedP) {
        if (restart_linkP == cb_tools.UNPROVIDED) {
            restart_linkP = (SubLObject)cb_tools.NIL;
        }
        if (savedP == cb_tools.UNPROVIDED) {
            savedP = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cb_options_result_message(savedP);
        if (cb_tools.NIL != restart_linkP) {
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(message);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != color_value) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_value));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_princ(message);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_tools.$str325$Your_new_settings_require_you_to_);
                        html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                        html_utilities.html_princ((SubLObject)cb_tools.$str326$Click_);
                        cb_utilities.cb_link((SubLObject)cb_tools.$kw327$START, (SubLObject)cb_tools.$str328$here, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_tools.$str329$_now_to_do_so_);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        else {
            cb_utilities.cb_message_page_with_history(message, (SubLObject)cb_tools.NIL);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 42740L)
    public static SubLObject cb_options_result_message(final SubLObject savedP) {
        SubLObject message = (SubLObject)cb_tools.NIL;
        SubLObject stream = (SubLObject)cb_tools.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            print_high.princ((SubLObject)cb_tools.$str330$KB_Browser_Options_have_been_modi, stream);
            if (cb_tools.NIL != savedP) {
                print_high.princ((SubLObject)cb_tools.$str331$_and_saved, stream);
            }
            print_high.princ((SubLObject)cb_tools.$str332$_, stream);
            message = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_tools.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cb_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 43018L)
    public static SubLObject cb_history(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        return cb_history_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 43195L)
    public static SubLObject cb_history_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject style = (SubLObject)((cb_tools.NIL == args && cb_tools.NIL != cb_parameters.$cb_use_categorized_historyP$.getDynamicValue(thread)) ? cb_tools.$kw336$CATEGORIZED : ((cb_tools.NIL == args) ? cb_tools.$kw337$ALPHABETICAL : ((cb_tools.NIL != args && cb_tools.NIL != subl_promotions.memberP((SubLObject)cb_tools.$str338$categorized, args, Symbols.symbol_function((SubLObject)cb_tools.EQUALP), (SubLObject)cb_tools.UNPROVIDED)) ? cb_tools.$kw336$CATEGORIZED : cb_tools.$kw337$ALPHABETICAL)));
        final SubLObject title_var = (SubLObject)cb_tools.$str339$;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$53 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw334$CB_HISTORY, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            if ((cb_tools.NIL != cb_assertion_history_items() || cb_tools.NIL != cb_sentence_history_items()) && cb_tools.$kw200$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
                                html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                if (cb_tools.NIL != cb_parameters.$cb_history_show_el_formulasP$.getDynamicValue(thread)) {
                                    cb_utilities.cb_link((SubLObject)cb_tools.$kw340$HISTORY_HL_FORMULAS, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                }
                                else {
                                    cb_utilities.cb_link((SubLObject)cb_tools.$kw341$HISTORY_EL_FORMULAS, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                            html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            cb_show_history_info(style);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$54, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$53, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 43921L)
    public static SubLObject cb_show_history_info(SubLObject style) {
        if (style == cb_tools.UNPROVIDED) {
            style = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == style) {
            style = (SubLObject)((cb_tools.NIL != cb_parameters.$cb_use_categorized_historyP$.getDynamicValue(thread)) ? cb_tools.$kw336$CATEGORIZED : cb_tools.$kw337$ALPHABETICAL);
        }
        cb_show_recent_history(style);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 44266L)
    public static SubLObject cb_show_recent_history(final SubLObject style) {
        cb_show_bookmarked_constants();
        cb_show_recent_constants(style);
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        cb_show_bookmarked_nats();
        cb_show_recent_nats();
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        cb_show_bookmarked_assertions();
        cb_show_recent_assertions();
        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        cb_show_recent_sentences();
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 44797L)
    public static SubLObject cb_show_recent_constants(final SubLObject style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str343$Recent_Constants__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
        if (style == cb_tools.$kw336$CATEGORIZED) {
            cb_utilities.cb_link((SubLObject)cb_tools.$kw344$HISTORY, (SubLObject)cb_tools.$str345$_Show_Alphabetical_, (SubLObject)cb_tools.$kw337$ALPHABETICAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        else {
            cb_utilities.cb_link((SubLObject)cb_tools.$kw344$HISTORY, (SubLObject)cb_tools.$str346$_Show_Categorized_, (SubLObject)cb_tools.$kw336$CATEGORIZED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
        cb_utilities.cb_link((SubLObject)cb_tools.$kw347$CLEAR_CONSTANT_HISTORY, (SubLObject)cb_tools.NIL, style, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject items = cb_constant_history_items();
        final SubLObject first_n = list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), items);
        final SubLObject sorted_items = Sort.sort(conses_high.copy_list(items), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        if (cb_tools.NIL != items) {
            if (style == cb_tools.$kw336$CATEGORIZED) {
                if (cb_tools.NIL != cb_tools.$cb_use_css_columns_for_categories$.getDynamicValue(thread)) {
                    cb_show_recent_constants_categorized_2();
                }
                else {
                    cb_show_recent_constants_categorized();
                }
            }
            else {
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str349$history_constants_columnar);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    SubLObject cdolist_list_var = first_n;
                    SubLObject item = (SubLObject)cb_tools.NIL;
                    item = cdolist_list_var.first();
                    while (cb_tools.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str350$history_constant);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_show_term(item, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                    if (cb_tools.NIL != list_utilities.lengthG(sorted_items, cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED)) {
                        if (cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread).numG((SubLObject)cb_tools.ZERO_INTEGER)) {
                            html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        cdolist_list_var = sorted_items;
                        item = (SubLObject)cb_tools.NIL;
                        item = cdolist_list_var.first();
                        while (cb_tools.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str350$history_constant);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                cb_utilities.cb_show_term(item, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            item = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            }
        }
        else {
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_princ((SubLObject)cb_tools.$str351$None);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 46109L)
    public static SubLObject cb_show_recent_constants_categorized() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = cb_constant_history_items();
        final SubLObject chronological = list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), items);
        final SubLObject collections = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_tools.$sym352$ISA_COLLECTION_), items, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject visible_collections = Sort.sort(list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), collections), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        final SubLObject relations = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_tools.$sym353$ISA_RELATION_), items, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject visible_relations = Sort.sort(list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), relations), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        final SubLObject assertions = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_tools.$sym354$ASSERTION_P), items, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject individuals = Sort.sort(list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), conses_high.set_difference(conses_high.set_difference(conses_high.set_difference(items, collections, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), relations, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), assertions, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        if (cb_tools.NIL != items) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str355$history_table);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup((SubLObject)cb_tools.$str358$Most_nbsp_Recent);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        SubLObject cdolist_list_var = chronological;
                        SubLObject chron = (SubLObject)cb_tools.NIL;
                        chron = cdolist_list_var.first();
                        while (cb_tools.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_show_term(chron, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            chron = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_princ((SubLObject)cb_tools.$str359$Collections);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        SubLObject cdolist_list_var = visible_collections;
                        SubLObject coll = (SubLObject)cb_tools.NIL;
                        coll = cdolist_list_var.first();
                        while (cb_tools.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_show_term(coll, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            coll = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_princ((SubLObject)cb_tools.$str360$Individuals);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        SubLObject cdolist_list_var = individuals;
                        SubLObject ind = (SubLObject)cb_tools.NIL;
                        ind = cdolist_list_var.first();
                        while (cb_tools.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_show_term(ind, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            ind = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_princ((SubLObject)cb_tools.$str361$Relations);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        SubLObject cdolist_list_var = visible_relations;
                        SubLObject relation = (SubLObject)cb_tools.NIL;
                        relation = cdolist_list_var.first();
                        while (cb_tools.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_show_term(relation, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            relation = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 48160L)
    public static SubLObject cb_show_recent_constants_categorized_2() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = cb_constant_history_items();
        final SubLObject chronological = list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), items);
        final SubLObject collections = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_tools.$sym352$ISA_COLLECTION_), items, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject visible_collections = Sort.sort(list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), collections), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        final SubLObject relations = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_tools.$sym353$ISA_RELATION_), items, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject visible_relations = Sort.sort(list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), relations), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        final SubLObject assertions = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_tools.$sym354$ASSERTION_P), items, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject individuals = Sort.sort(list_utilities.first_n(cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue(thread), conses_high.set_difference(conses_high.set_difference(conses_high.set_difference(items, collections, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), relations, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), assertions, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)), (SubLObject)cb_tools.$sym25$STRING_, (SubLObject)cb_tools.$sym348$TO_STRING);
        if (cb_tools.NIL != items) {
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str362$columns__4__column_count__4____we);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str363$display_block__break_after__colum);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup((SubLObject)cb_tools.$str358$Most_nbsp_Recent);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    SubLObject cdolist_list_var = chronological;
                    SubLObject chron = (SubLObject)cb_tools.NIL;
                    chron = cdolist_list_var.first();
                    while (cb_tools.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_utilities.cb_show_term(chron, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        chron = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str363$display_block__break_after__colum);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_tools.$str359$Collections);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    SubLObject cdolist_list_var = visible_collections;
                    SubLObject coll = (SubLObject)cb_tools.NIL;
                    coll = cdolist_list_var.first();
                    while (cb_tools.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_utilities.cb_show_term(coll, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        coll = cdolist_list_var.first();
                    }
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = Numbers.subtract(Sequences.length(chronological), Sequences.length(visible_collections)), n = (SubLObject)cb_tools.NIL, n = (SubLObject)cb_tools.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)cb_tools.ONE_INTEGER)) {
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str364$display__block__break_after__colu);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_tools.$str360$Individuals);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    SubLObject cdolist_list_var = individuals;
                    SubLObject ind = (SubLObject)cb_tools.NIL;
                    ind = cdolist_list_var.first();
                    while (cb_tools.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_utilities.cb_show_term(ind, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        ind = cdolist_list_var.first();
                    }
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = Numbers.subtract(Sequences.length(chronological), Sequences.length(individuals)), n = (SubLObject)cb_tools.NIL, n = (SubLObject)cb_tools.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)cb_tools.ONE_INTEGER)) {
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str356$history_categorized_column);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str365$display__block__break_after__colu);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str357$history_table_heading);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_tools.$str361$Relations);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    SubLObject cdolist_list_var = visible_relations;
                    SubLObject relation = (SubLObject)cb_tools.NIL;
                    relation = cdolist_list_var.first();
                    while (cb_tools.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_utilities.cb_show_term(relation, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        relation = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 50801L)
    public static SubLObject cb_show_recent_nats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str366$Recent_NATs__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject items = cb_nat_history_items();
        if (cb_tools.NIL != items) {
            html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_tools.$kw367$CLEAR_NAT_HISTORY, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str368$history_nats_columnar);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = (SubLObject)cb_tools.NIL;
                item = cdolist_list_var.first();
                while (cb_tools.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str369$history_nat);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_show_term(item, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.T);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_princ((SubLObject)cb_tools.$str351$None);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 51344L)
    public static SubLObject cb_show_recent_sentences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str370$Recent_Sentences__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject items = cb_sentence_history_items();
        if (cb_tools.NIL != items) {
            html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_tools.$kw371$CLEAR_SENTENCE_HISTORY, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            SubLObject cdolist_list_var = items;
            SubLObject item = (SubLObject)cb_tools.NIL;
            item = cdolist_list_var.first();
            while (cb_tools.NIL != cdolist_list_var) {
                if (cb_tools.NIL != el_utilities.ist_sentence_p(item, (SubLObject)cb_tools.UNPROVIDED)) {
                    final SubLObject mt = cycl_utilities.formula_arg1(item, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject sentence = cycl_utilities.formula_arg2(item, (SubLObject)cb_tools.UNPROVIDED);
                    if (cb_tools.NIL != sksi_external_browser_utilities.sksi_supported_browsing_registeredP() && cb_tools.NIL != sksi_kb_accessors.sksi_content_mt_p(mt)) {
                        cb_sentence_browser.cb_show_sentence_readably(sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_tools.T, (SubLObject)cb_tools.T);
                    }
                    else {
                        cb_sentence_browser.cb_show_sentence_readably(sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_tools.T, (SubLObject)cb_tools.NIL);
                    }
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
        }
        else {
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_tools.$str351$None);
            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 52280L)
    public static SubLObject cb_bookmarks_supported_for_current_user() {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_tools.NIL != kb_control_vars.date_kb_loaded_p() && cb_tools.NIL == ke.cyclist_is_guest() && cb_tools.NIL != constants_high.find_constant((SubLObject)cb_tools.$str372$cyclistReadilyAvailableTerms));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 52508L)
    public static SubLObject cb_show_bookmarked_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = list_utilities.remove_if_not((SubLObject)cb_tools.$sym373$CONSTANT_P, cb_bookmarked_items((SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str374$font_size__larger__font_weight_bo);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str375$To_remove_a_bookmark__follow_the_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ((SubLObject)cb_tools.$str376$Bookmarked_Constants__);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        if (cb_tools.NIL != items) {
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str377$bookmarked_constants_columnar);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = (SubLObject)cb_tools.NIL;
                item = cdolist_list_var.first();
                while (cb_tools.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str378$bookmarked_constant);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            cb_utilities.cb_show_term(item, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.T);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 53072L)
    public static SubLObject cb_show_bookmarked_nats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = list_utilities.remove_if_not((SubLObject)cb_tools.$sym379$CYCL_NAT_P, cb_bookmarked_items((SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str374$font_size__larger__font_weight_bo);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str375$To_remove_a_bookmark__follow_the_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ((SubLObject)cb_tools.$str380$Bookmarked_NATs__);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        if (cb_tools.NIL != items) {
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str381$bookmarked_nats_columnar);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = (SubLObject)cb_tools.NIL;
                item = cdolist_list_var.first();
                while (cb_tools.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str382$bookmarked_nat);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            cb_utilities.cb_show_term(item, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.T);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 53612L)
    public static SubLObject cb_show_bookmarked_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = list_utilities.remove_if_not((SubLObject)cb_tools.$sym354$ASSERTION_P, cb_bookmarked_items((SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str374$font_size__larger__font_weight_bo);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str375$To_remove_a_bookmark__follow_the_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ((SubLObject)cb_tools.$str383$Bookmarked_Assertions__);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        if (cb_tools.NIL != items) {
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str384$bookmarked_asserts_columnar);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = (SubLObject)cb_tools.NIL;
                item = cdolist_list_var.first();
                while (cb_tools.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str385$bookmarked_assert);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            cb_utilities.cb_show_term(item, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.T);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 54171L)
    public static SubLObject cb_show_recent_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str386$Recent_Assertions__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject items = cb_assertion_history_items();
        if (cb_tools.NIL != items) {
            html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_tools.$kw387$CLEAR_ASSERTION_HISTORY, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject assertion_link_fn = (cb_tools.NIL != cb_browser.cb_show_el_formulas_for_hookP((SubLObject)cb_tools.$kw344$HISTORY)) ? Symbols.symbol_function((SubLObject)cb_tools.$sym388$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY) : Symbols.symbol_function((SubLObject)cb_tools.$sym390$CB_ASSERTION_LINK_WITH_MT);
            final SubLObject _prev_bind_0 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind((SubLObject)cb_tools.NIL, thread);
                cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind((SubLObject)cb_tools.NIL, thread);
                cb_utilities.$assertion_filter_hook$.bind((SubLObject)cb_tools.NIL, thread);
                pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_tools.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$85 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$86 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$87 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$88 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject _prev_bind_0_$89 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$90 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_language_mt$.bind(cb_paraphrase_mt(), thread);
                                            pph_vars.$paraphrase_mode$.bind((SubLObject)cb_tools.$kw392$HTML, thread);
                                            SubLObject cdolist_list_var = items;
                                            SubLObject item = (SubLObject)cb_tools.NIL;
                                            item = cdolist_list_var.first();
                                            while (cb_tools.NIL != cdolist_list_var) {
                                                if (cb_tools.NIL != assertions_high.valid_assertion(item, (SubLObject)cb_tools.UNPROVIDED)) {
                                                    Functions.funcall(assertion_link_fn, item);
                                                }
                                                else if (cb_tools.NIL != assertion_handles.assertion_p(item)) {
                                                    cb_rem_from_assertion_history(item);
                                                }
                                                else {
                                                    final SubLObject mt = hlmt.reduce_hlmt(cycl_utilities.formula_arg1(item, (SubLObject)cb_tools.UNPROVIDED), (SubLObject)cb_tools.UNPROVIDED);
                                                    final SubLObject sentence = cycl_utilities.formula_arg2(item, (SubLObject)cb_tools.UNPROVIDED);
                                                    final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, mt);
                                                    if (cb_tools.NIL != list_utilities.non_empty_list_p(assertions)) {
                                                        SubLObject cdolist_list_var_$91 = assertions;
                                                        SubLObject v_assert = (SubLObject)cb_tools.NIL;
                                                        v_assert = cdolist_list_var_$91.first();
                                                        while (cb_tools.NIL != cdolist_list_var_$91) {
                                                            Functions.funcall(assertion_link_fn, v_assert);
                                                            cb_add_to_assertion_history(v_assert);
                                                            cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                            v_assert = cdolist_list_var_$91.first();
                                                        }
                                                        cb_rem_from_assertion_history(item);
                                                    }
                                                    else {
                                                        cb_sentence_browser.cb_show_sentence_readably(sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_tools.T, (SubLObject)cb_tools.NIL);
                                                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                item = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$90, thread);
                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$89, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$88, thread);
                                }
                            }
                            finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$87, thread);
                            }
                            if (new_or_reused == cb_tools.$kw393$NEW && cb_tools.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$86, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (cb_tools.NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$85, thread);
                }
            }
            finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_4, thread);
                cb_utilities.$assertion_filter_hook$.rebind(_prev_bind_3, thread);
                cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
                cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
        }
        else {
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_tools.$str351$None);
            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 55543L)
    public static SubLObject cb_link_history(SubLObject linktext, SubLObject categorization) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        if (categorization == cb_tools.UNPROVIDED) {
            categorization = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str395$History;
        }
        final SubLObject url = (SubLObject)((categorization == cb_tools.$kw336$CATEGORIZED || (cb_tools.NIL == categorization && cb_tools.NIL != cb_parameters.$cb_use_categorized_historyP$.getDynamicValue(thread))) ? cb_tools.$str396$cb_history_categorized : cb_tools.$str397$cb_history_alphabetical);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(url);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 56022L)
    public static SubLObject cb_clear_history(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject group = (SubLObject)cb_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_tools.$list401);
        group = current.first();
        current = current.rest();
        final SubLObject style = (SubLObject)(current.isCons() ? current.first() : cb_tools.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_tools.$list401);
        current = current.rest();
        if (cb_tools.NIL == current) {
            final SubLObject pcase_var = Symbols.make_keyword(group);
            if (pcase_var.eql((SubLObject)cb_tools.$kw402$CONSTANT)) {
                cb_clear_constant_history();
            }
            else if (pcase_var.eql((SubLObject)cb_tools.$kw403$NAT)) {
                cb_clear_nat_history();
            }
            else if (pcase_var.eql((SubLObject)cb_tools.$kw404$ASSERTION)) {
                cb_clear_assertion_history();
            }
            else if (pcase_var.eql((SubLObject)cb_tools.$kw405$SENTENCE)) {
                cb_clear_sentence_history();
            }
            else if (pcase_var.eql((SubLObject)cb_tools.$kw406$ALL)) {
                cb_clear_constant_history();
                cb_clear_nat_history();
                cb_clear_assertion_history();
                cb_clear_sentence_history();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_tools.$list401);
        }
        return cb_history_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 56593L)
    public static SubLObject cb_link_clear_history(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str408$_Clear_History_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str409$cb_clear_history_ALL);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 56807L)
    public static SubLObject cb_link_clear_constant_history(SubLObject linktext, SubLObject style) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        if (style == cb_tools.UNPROVIDED) {
            style = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str412$_Clear_Constant_History_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str413$cb_clear_history_CONSTANT__A, string_utilities.to_string(style));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57072L)
    public static SubLObject cb_link_clear_nat_history(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str415$_Clear_NAT_History_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str416$cb_clear_history_NAT);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57294L)
    public static SubLObject cb_link_clear_assertion_history(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str418$_Clear_Assertion_History_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str419$cb_clear_history_ASSERTION);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57534L)
    public static SubLObject cb_link_clear_sentence_history(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str421$_Clear_Sentence_History_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str422$cb_clear_history_SENTENCE);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57771L)
    public static SubLObject cb_history_el_formulas(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_history_show_el_formulasP$.currentBinding(thread);
        try {
            cb_parameters.$cb_history_show_el_formulasP$.bind((SubLObject)cb_tools.T, thread);
            cb_history_internal(args);
        }
        finally {
            cb_parameters.$cb_history_show_el_formulasP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58042L)
    public static SubLObject cb_link_history_el_formulas(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str425$_EL_Formulas_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str426$cb_history_el_formulas);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58262L)
    public static SubLObject cb_history_hl_formulas(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_history_show_el_formulasP$.currentBinding(thread);
        try {
            cb_parameters.$cb_history_show_el_formulasP$.bind((SubLObject)cb_tools.NIL, thread);
            cb_history_internal(args);
        }
        finally {
            cb_parameters.$cb_history_show_el_formulasP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58535L)
    public static SubLObject cb_link_history_hl_formulas(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str429$_HL_Formulas_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str430$cb_history_hl_formulas);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58755L)
    public static SubLObject cb_rem_fort_from_all_histories(final SubLObject fort) {
        assert cb_tools.NIL != forts.fort_p(fort) : fort;
        if (cb_tools.NIL != nart_handles.nart_p(fort)) {
            cb_rem_from_nat_history(fort);
        }
        else if (cb_tools.NIL != constant_handles.constant_p(fort)) {
            cb_rem_from_constant_history(fort);
        }
        cb_rem_fort_from_nat_history(fort);
        cb_rem_fort_from_assertion_history(fort);
        cb_rem_fort_from_sentence_history(fort);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59119L)
    public static SubLObject cb_add_to_history(final SubLObject obj) {
        if (cb_tools.NIL != assertion_handles.assertion_p(obj)) {
            cb_add_to_assertion_history(obj);
        }
        else if (cb_tools.NIL != constant_handles.constant_p(obj)) {
            cb_add_to_constant_history(obj);
        }
        else if (cb_tools.NIL != cycl_grammar.cycl_nat_p(obj)) {
            cb_add_to_nat_history(obj);
        }
        else {
            Errors.error((SubLObject)cb_tools.$str433$Unable_to_add__S_to_history, obj);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59492L)
    public static SubLObject cb_constant_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_constant_history$.setDynamicValue(list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_tools.$sym435$VALID_CONSTANT_), cb_parameters.$cb_constant_history$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        cb_parameters.$cb_constant_history$.setDynamicValue(list_utilities.first_n(cb_tools.$cb_history_max_constants$.getGlobalValue(), cb_parameters.$cb_constant_history$.getDynamicValue(thread)), thread);
        return conses_high.copy_list(cb_parameters.$cb_constant_history$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59764L)
    public static SubLObject cb_most_recent_constant() {
        return cb_constant_history_items().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59855L)
    public static SubLObject cb_add_to_constant_history(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_parameters.$cb_constant_history$.getDynamicValue(thread).first().eql(constant)) {
            return constant;
        }
        if (cb_tools.NIL != subl_promotions.memberP(constant, cb_parameters.$cb_constant_history$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)) {
            cb_parameters.$cb_constant_history$.setDynamicValue(Sequences.delete(constant, cb_parameters.$cb_constant_history$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        }
        cb_parameters.$cb_constant_history$.setDynamicValue((SubLObject)ConsesLow.cons(constant, cb_parameters.$cb_constant_history$.getDynamicValue(thread)), thread);
        if (cb_parameters.$cb_constant_history_max$.getDynamicValue(thread).isInteger() && cb_parameters.$cb_constant_history_max$.getDynamicValue(thread).numG((SubLObject)cb_tools.ZERO_INTEGER)) {
            final SubLObject last = conses_high.nthcdr(Numbers.subtract(cb_parameters.$cb_constant_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), cb_parameters.$cb_constant_history$.getDynamicValue(thread));
            if (cb_tools.NIL != last) {
                ConsesLow.rplacd(last, (SubLObject)cb_tools.NIL);
            }
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60411L)
    public static SubLObject cb_rem_from_constant_history(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_constant_history$.setDynamicValue(Sequences.delete(constant, cb_parameters.$cb_constant_history$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60555L)
    public static SubLObject cb_clear_constant_history() {
        cb_parameters.$cb_constant_history$.setDynamicValue((SubLObject)cb_tools.NIL);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60650L)
    public static SubLObject cb_valid_nat_p(final SubLObject nat) {
        if (cb_tools.NIL != nart_handles.valid_nartP(nat, (SubLObject)cb_tools.UNPROVIDED)) {
            return (SubLObject)cb_tools.T;
        }
        return term.closed_nautP(nat, (SubLObject)cb_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60812L)
    public static SubLObject cb_nat_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_nat_history$.setDynamicValue(list_utilities.delete_if_not((SubLObject)cb_tools.$sym437$CB_VALID_NAT_P, cb_parameters.$cb_nat_history$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        cb_parameters.$cb_nat_history$.setDynamicValue(list_utilities.first_n(cb_tools.$cb_history_max_nats$.getGlobalValue(), cb_parameters.$cb_nat_history$.getDynamicValue(thread)), thread);
        return conses_high.copy_list(cb_parameters.$cb_nat_history$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61047L)
    public static SubLObject cb_most_recent_nat() {
        return cb_nat_history_items().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61128L)
    public static SubLObject cb_add_to_nat_history(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_parameters.$cb_nat_history$.getDynamicValue(thread).first().equal(nat)) {
            return nat;
        }
        if (cb_tools.NIL != subl_promotions.memberP(nat, cb_parameters.$cb_nat_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED)) {
            cb_parameters.$cb_nat_history$.setDynamicValue(Sequences.delete(nat, cb_parameters.$cb_nat_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        }
        cb_parameters.$cb_nat_history$.setDynamicValue((SubLObject)ConsesLow.cons(nat, cb_parameters.$cb_nat_history$.getDynamicValue(thread)), thread);
        if (cb_parameters.$cb_nat_history_max$.getDynamicValue(thread).isInteger() && cb_parameters.$cb_nat_history_max$.getDynamicValue(thread).numG((SubLObject)cb_tools.ZERO_INTEGER)) {
            final SubLObject last = conses_high.nthcdr(Numbers.subtract(cb_parameters.$cb_nat_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), cb_parameters.$cb_nat_history$.getDynamicValue(thread));
            if (cb_tools.NIL != last) {
                ConsesLow.rplacd(last, (SubLObject)cb_tools.NIL);
            }
        }
        return nat;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61611L)
    public static SubLObject cb_rem_from_nat_history(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_nat_history$.setDynamicValue(Sequences.delete(nat, cb_parameters.$cb_nat_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61737L)
    public static SubLObject cb_rem_fort_from_nat_history(final SubLObject fort) {
        cb_parameters.$cb_nat_history$.setDynamicValue(Sequences.delete(fort, cb_nat_history_items(), Symbols.symbol_function((SubLObject)cb_tools.$sym438$TREE_FIND), Symbols.symbol_function((SubLObject)cb_tools.$sym439$TERM_OF_UNIT), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61901L)
    public static SubLObject cb_clear_nat_history() {
        cb_parameters.$cb_nat_history$.setDynamicValue((SubLObject)cb_tools.NIL);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61986L)
    public static SubLObject cb_assertion_history_valid_item_p(final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_tools.NIL != assertions_high.valid_assertion(item, (SubLObject)cb_tools.UNPROVIDED) || cb_tools.NIL != el_utilities.ist_sentence_p(item, (SubLObject)cb_tools.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62222L)
    public static SubLObject cb_assertion_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_assertion_history$.setDynamicValue(list_utilities.first_n(cb_tools.$cb_history_max_assertions$.getGlobalValue(), cb_parameters.$cb_assertion_history$.getDynamicValue(thread)), thread);
        return conses_high.copy_list(cb_parameters.$cb_assertion_history$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62409L)
    public static SubLObject cb_most_recent_assertion() {
        return cb_assertion_history_items().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62502L)
    public static SubLObject cb_add_to_assertion_history(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == cb_assertion_history_valid_item_p(assertion)) {
            return (SubLObject)cb_tools.NIL;
        }
        if (cb_parameters.$cb_assertion_history$.getDynamicValue(thread).first().eql(assertion)) {
            return assertion;
        }
        if (cb_tools.NIL != subl_promotions.memberP(assertion, cb_parameters.$cb_assertion_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED)) {
            cb_parameters.$cb_assertion_history$.setDynamicValue(Sequences.delete(assertion, cb_parameters.$cb_assertion_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        }
        if (cb_tools.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject ist_sentence = el_utilities.make_ist_sentence(assertions_high.assertion_mt(assertion), cycl_utilities.hl_to_el(assertions_high.assertion_formula(assertion)));
            if (cb_tools.NIL != subl_promotions.memberP(ist_sentence, cb_parameters.$cb_assertion_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED)) {
                cb_parameters.$cb_assertion_history$.setDynamicValue(Sequences.delete(ist_sentence, cb_parameters.$cb_assertion_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            }
        }
        cb_parameters.$cb_assertion_history$.setDynamicValue((SubLObject)ConsesLow.cons(assertion, cb_parameters.$cb_assertion_history$.getDynamicValue(thread)), thread);
        if (cb_parameters.$cb_assertion_history_max$.getDynamicValue(thread).isInteger() && cb_parameters.$cb_assertion_history_max$.getDynamicValue(thread).numG((SubLObject)cb_tools.ZERO_INTEGER)) {
            final SubLObject last = conses_high.nthcdr(Numbers.subtract(cb_parameters.$cb_assertion_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), cb_parameters.$cb_assertion_history$.getDynamicValue(thread));
            if (cb_tools.NIL != last) {
                ConsesLow.rplacd(last, (SubLObject)cb_tools.NIL);
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 63599L)
    public static SubLObject cb_add_sentence_in_mt_to_assertion_history(final SubLObject sentence, final SubLObject mt) {
        return (cb_tools.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)cb_tools.UNPROVIDED)) ? cb_add_to_assertion_history(sentence) : cb_add_to_assertion_history(el_utilities.make_ist_sentence(hlmt.reduce_hlmt(mt, (SubLObject)cb_tools.UNPROVIDED), sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 63841L)
    public static SubLObject cb_rem_from_assertion_history(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_assertion_history$.setDynamicValue(Sequences.delete(assertion, cb_parameters.$cb_assertion_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 63997L)
    public static SubLObject cb_rem_fort_from_assertion_history(final SubLObject fort) {
        cb_parameters.$cb_assertion_history$.setDynamicValue(Sequences.delete(fort, cb_assertion_history_items(), Symbols.symbol_function((SubLObject)cb_tools.$sym440$FIND), Symbols.symbol_function((SubLObject)cb_tools.$sym441$EXPRESSION_FORTS_WITH_HL), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64186L)
    public static SubLObject cb_clear_assertion_history() {
        cb_parameters.$cb_assertion_history$.setDynamicValue((SubLObject)cb_tools.NIL);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64284L)
    public static SubLObject expression_forts_with_hl(final SubLObject expression) {
        return cycl_utilities.expression_forts(expression, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64509L)
    public static SubLObject cb_sentence_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_sentence_history$.setDynamicValue(list_utilities.delete_if_not((SubLObject)cb_tools.$sym442$CYCL_SENTENCE_P, cb_parameters.$cb_sentence_history$.getDynamicValue(thread), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        return conses_high.copy_list(cb_parameters.$cb_sentence_history$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64704L)
    public static SubLObject cb_most_recent_sentence() {
        return cb_sentence_history_items().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64795L)
    public static SubLObject cb_add_to_sentence_history(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_parameters.$cb_sentence_history$.getDynamicValue(thread).first().equal(sentence)) {
            return sentence;
        }
        if (cb_tools.NIL != subl_promotions.memberP(sentence, cb_parameters.$cb_sentence_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED)) {
            cb_parameters.$cb_sentence_history$.setDynamicValue(Sequences.delete(sentence, cb_parameters.$cb_sentence_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        }
        cb_parameters.$cb_sentence_history$.setDynamicValue((SubLObject)ConsesLow.cons(sentence, cb_parameters.$cb_sentence_history$.getDynamicValue(thread)), thread);
        if (cb_parameters.$cb_sentence_history_max$.getDynamicValue(thread).isInteger() && cb_parameters.$cb_sentence_history_max$.getDynamicValue(thread).numG((SubLObject)cb_tools.ZERO_INTEGER)) {
            final SubLObject last = conses_high.nthcdr(Numbers.subtract(cb_parameters.$cb_sentence_history_max$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), cb_parameters.$cb_sentence_history$.getDynamicValue(thread));
            if (cb_tools.NIL != last) {
                ConsesLow.rplacd(last, (SubLObject)cb_tools.NIL);
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65368L)
    public static SubLObject cb_add_sentence_in_mt_to_sentence_history(final SubLObject sentence, final SubLObject mt) {
        return (cb_tools.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)cb_tools.UNPROVIDED)) ? cb_add_to_sentence_history(sentence) : cb_add_to_sentence_history(el_utilities.make_ist_sentence(mt, sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65594L)
    public static SubLObject cb_rem_from_sentence_history(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_sentence_history$.setDynamicValue(Sequences.delete(sentence, cb_parameters.$cb_sentence_history$.getDynamicValue(thread), (SubLObject)cb_tools.EQUAL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65745L)
    public static SubLObject cb_rem_fort_from_sentence_history(final SubLObject fort) {
        cb_parameters.$cb_sentence_history$.setDynamicValue(Sequences.delete(fort, cb_sentence_history_items(), (SubLObject)cb_tools.$sym440$FIND, (SubLObject)cb_tools.$sym443$EXPRESSION_FORTS, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65921L)
    public static SubLObject cb_clear_sentence_history() {
        cb_parameters.$cb_sentence_history$.setDynamicValue((SubLObject)cb_tools.NIL);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
    public static SubLObject clear_cb_bookmarked_items() {
        final SubLObject cs = cb_tools.$cb_bookmarked_items_caching_state$.getGlobalValue();
        if (cb_tools.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
    public static SubLObject remove_cb_bookmarked_items(SubLObject cyclist) {
        if (cyclist == cb_tools.UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(cb_tools.$cb_bookmarked_items_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cyclist), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
    public static SubLObject cb_bookmarked_items_internal(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL != control_vars.non_tiny_kb_loadedP() && cb_tools.NIL != forts.fort_p(cyclist)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_tools.$sym445$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind((SubLObject)((cb_tools.NIL != kb_control_vars.date_kb_loaded_p()) ? ConsesLow.list(cb_tools.$const446$MtSpace, cb_tools.$const447$CyclistsMt, (SubLObject)ConsesLow.listS(cb_tools.$const448$MtTimeWithGranularityDimFn, date_utilities.indexical_now(), (SubLObject)cb_tools.$list449)) : cb_tools.$const447$CyclistsMt), thread);
                return Sort.sort(kb_mapping_utilities.pred_values(cyclist, cb_tools.$const451$cyclistReadilyAvailableTerms, (SubLObject)cb_tools.ONE_INTEGER, (SubLObject)cb_tools.TWO_INTEGER, (SubLObject)cb_tools.UNPROVIDED), Symbols.symbol_function((SubLObject)cb_tools.$sym25$STRING_), (SubLObject)cb_tools.$sym452$NAME_FOR_ALPHA_SORT);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
    public static SubLObject cb_bookmarked_items(SubLObject cyclist) {
        if (cyclist == cb_tools.UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        SubLObject caching_state = cb_tools.$cb_bookmarked_items_caching_state$.getGlobalValue();
        if (cb_tools.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_tools.$sym444$CB_BOOKMARKED_ITEMS, (SubLObject)cb_tools.$sym453$_CB_BOOKMARKED_ITEMS_CACHING_STATE_, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.EQL, (SubLObject)cb_tools.ONE_INTEGER, (SubLObject)cb_tools.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)cb_tools.$sym454$CLEAR_CB_BOOKMARKED_ITEMS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cb_bookmarked_items_internal(cyclist)));
            memoization_state.caching_state_put(caching_state, cyclist, results, (SubLObject)cb_tools.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66466L)
    public static SubLObject name_for_alpha_sort(final SubLObject obj) {
        if (cb_tools.NIL != cycl_grammar.cycl_denotational_term_p(obj)) {
            return cycl_utilities.denotational_term_name_for_alpha_sort(obj);
        }
        if (cb_tools.NIL != assertion_handles.assertion_p(obj)) {
            return Sequences.cconcatenate((SubLObject)cb_tools.$str455$_, string_utilities.object_to_string(uncanonicalizer.assertion_el_formula(obj)));
        }
        return string_utilities.object_to_string(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66787L)
    public static SubLObject cb_current_relevant_terms() {
        return Sequences.cconcatenate(cb_bookmarked_items((SubLObject)cb_tools.UNPROVIDED), new SubLObject[] { cb_nat_history_items(), cb_constant_history_items() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66936L)
    public static SubLObject cb_recent_kb_additions(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_tools.$str456$Recently_Added_KB_Content;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$94 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$95 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str457$float__right);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_utilities.cb_link((SubLObject)cb_tools.$kw458$RECENT_KB_ADDITIONS, (SubLObject)cb_tools.$str459$_Refresh_Page_, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        links_to_recent_kb_additions((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$95, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$94, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 67301L)
    public static SubLObject cb_link_recent_kb_additions(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str461$_Recently_Added_KB_Content;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw16$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str462$cb_recent_kb_additions);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 67563L)
    public static SubLObject links_to_recent_kb_additions(SubLObject n, SubLObject types) {
        if (n == cb_tools.UNPROVIDED) {
            n = (SubLObject)cb_tools.SIXTEEN_INTEGER;
        }
        if (types == cb_tools.UNPROVIDED) {
            types = (SubLObject)cb_tools.$list464;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)cb_tools.T, thread);
            if (cb_tools.NIL != list_utilities.member_eqP((SubLObject)cb_tools.$kw402$CONSTANT, types)) {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str465$Recent_constants_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                if (cb_tools.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = constants_high.constants_around(constant_handles.next_constant_suid(), n, n, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$99 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)cb_tools.$str466$mapping_constants_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)cb_tools.NIL;
                            o = csome_list_var.first();
                            while (cb_tools.NIL != csome_list_var) {
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                cb_utilities.cb_form(o, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$99, thread);
                    }
                }
                else {
                    final SubLObject idx = constant_handles.do_constants_table();
                    final SubLObject mess = (SubLObject)cb_tools.$str466$mapping_constants_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)cb_tools.ZERO_INTEGER;
                    assert cb_tools.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$101 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$102 = idx;
                            if (cb_tools.NIL == id_index.id_index_objects_empty_p(idx_$102, (SubLObject)cb_tools.$kw468$SKIP)) {
                                final SubLObject idx_$103 = idx_$102;
                                if (cb_tools.NIL == id_index.id_index_dense_objects_empty_p(idx_$103, (SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$103);
                                    final SubLObject backwardP_var = (SubLObject)cb_tools.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_tools.NIL, v_iteration = (SubLObject)cb_tools.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_tools.ONE_INTEGER)) {
                                        id = ((cb_tools.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_tools.ONE_INTEGER) : v_iteration);
                                        o2 = Vectors.aref(vector_var, id);
                                        if (cb_tools.NIL == id_index.id_index_tombstone_p(o2) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                            if (cb_tools.NIL != id_index.id_index_tombstone_p(o2)) {
                                                o2 = (SubLObject)cb_tools.$kw468$SKIP;
                                            }
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o2, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$104 = idx_$102;
                                if (cb_tools.NIL == id_index.id_index_sparse_objects_empty_p(idx_$104) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$104);
                                    SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$104);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$104);
                                    final SubLObject v_default = (SubLObject)((cb_tools.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) ? cb_tools.NIL : cb_tools.$kw468$SKIP);
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                        if (cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP) || cb_tools.NIL == id_index.id_index_tombstone_p(o3)) {
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o3, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        id2 = Numbers.add(id2, (SubLObject)cb_tools.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$101, thread);
                    }
                }
            }
            if (cb_tools.NIL != list_utilities.member_eqP((SubLObject)cb_tools.$kw469$NART, types)) {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str470$Recent_NARTs_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                if (cb_tools.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = narts_high.narts_around(nart_handles.next_nart_id(), n, n, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$103 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)cb_tools.$str471$mapping_narts_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)cb_tools.NIL;
                            o = csome_list_var.first();
                            while (cb_tools.NIL != csome_list_var) {
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                cb_utilities.cb_form(o, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$103, thread);
                    }
                }
                else {
                    final SubLObject idx = nart_handles.do_narts_table();
                    final SubLObject mess = (SubLObject)cb_tools.$str471$mapping_narts_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)cb_tools.ZERO_INTEGER;
                    assert cb_tools.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$105 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$105 = idx;
                            if (cb_tools.NIL == id_index.id_index_objects_empty_p(idx_$105, (SubLObject)cb_tools.$kw468$SKIP)) {
                                final SubLObject idx_$106 = idx_$105;
                                if (cb_tools.NIL == id_index.id_index_dense_objects_empty_p(idx_$106, (SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$106);
                                    final SubLObject backwardP_var = (SubLObject)cb_tools.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_tools.NIL, v_iteration = (SubLObject)cb_tools.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_tools.ONE_INTEGER)) {
                                        id = ((cb_tools.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_tools.ONE_INTEGER) : v_iteration);
                                        o2 = Vectors.aref(vector_var, id);
                                        if (cb_tools.NIL == id_index.id_index_tombstone_p(o2) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                            if (cb_tools.NIL != id_index.id_index_tombstone_p(o2)) {
                                                o2 = (SubLObject)cb_tools.$kw468$SKIP;
                                            }
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o2, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$107 = idx_$105;
                                if (cb_tools.NIL == id_index.id_index_sparse_objects_empty_p(idx_$107) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$107);
                                    SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$107);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$107);
                                    final SubLObject v_default = (SubLObject)((cb_tools.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) ? cb_tools.NIL : cb_tools.$kw468$SKIP);
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                        if (cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP) || cb_tools.NIL == id_index.id_index_tombstone_p(o3)) {
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o3, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        id2 = Numbers.add(id2, (SubLObject)cb_tools.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$105, thread);
                    }
                }
            }
            if (cb_tools.NIL != list_utilities.member_eqP((SubLObject)cb_tools.$kw404$ASSERTION, types)) {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str472$Recent_assertions_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                if (cb_tools.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = assertions_high.assertions_around(assertion_handles.next_assertion_id(), n, n, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$107 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)cb_tools.$str473$mapping_assertions_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)cb_tools.NIL;
                            o = csome_list_var.first();
                            while (cb_tools.NIL != csome_list_var) {
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                cb_utilities.cb_show_assertion_readably(o, (SubLObject)cb_tools.T, (SubLObject)cb_tools.T);
                                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$107, thread);
                    }
                }
                else {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)cb_tools.$str473$mapping_assertions_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)cb_tools.ZERO_INTEGER;
                    assert cb_tools.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$109 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$108 = idx;
                            if (cb_tools.NIL == id_index.id_index_objects_empty_p(idx_$108, (SubLObject)cb_tools.$kw468$SKIP)) {
                                final SubLObject idx_$109 = idx_$108;
                                if (cb_tools.NIL == id_index.id_index_dense_objects_empty_p(idx_$109, (SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$109);
                                    final SubLObject backwardP_var = (SubLObject)cb_tools.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject o4;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_tools.NIL, v_iteration = (SubLObject)cb_tools.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_tools.ONE_INTEGER)) {
                                        a_id = ((cb_tools.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_tools.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (cb_tools.NIL == id_index.id_index_tombstone_p(a_handle) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                            if (cb_tools.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)cb_tools.$kw468$SKIP;
                                            }
                                            o4 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_show_assertion_readably(o4, (SubLObject)cb_tools.T, (SubLObject)cb_tools.T);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$110 = idx_$108;
                                if (cb_tools.NIL == id_index.id_index_sparse_objects_empty_p(idx_$110) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$110);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$110);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$110);
                                    final SubLObject v_default = (SubLObject)((cb_tools.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) ? cb_tools.NIL : cb_tools.$kw468$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP) || cb_tools.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject o2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_show_assertion_readably(o2, (SubLObject)cb_tools.T, (SubLObject)cb_tools.T);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)cb_tools.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$109, thread);
                    }
                }
            }
            if (cb_tools.NIL != list_utilities.member_eqP((SubLObject)cb_tools.$kw474$DEDUCTION, types)) {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str475$Recent_deductions_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                if (cb_tools.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = deductions_high.deductions_around(deduction_handles.next_deduction_id(), n, n, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$111 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)cb_tools.$str476$mapping_deductions_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)cb_tools.NIL;
                            o = csome_list_var.first();
                            while (cb_tools.NIL != csome_list_var) {
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                cb_utilities.cb_form(o, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values7 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values7);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$111, thread);
                    }
                }
                else {
                    final SubLObject idx = deduction_handles.do_deductions_table();
                    final SubLObject mess = (SubLObject)cb_tools.$str476$mapping_deductions_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)cb_tools.ZERO_INTEGER;
                    assert cb_tools.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$113 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$111 = idx;
                            if (cb_tools.NIL == id_index.id_index_objects_empty_p(idx_$111, (SubLObject)cb_tools.$kw468$SKIP)) {
                                final SubLObject idx_$112 = idx_$111;
                                if (cb_tools.NIL == id_index.id_index_dense_objects_empty_p(idx_$112, (SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$112);
                                    final SubLObject backwardP_var = (SubLObject)cb_tools.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject d_id;
                                    SubLObject d_handle;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_tools.NIL, v_iteration = (SubLObject)cb_tools.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_tools.ONE_INTEGER)) {
                                        d_id = ((cb_tools.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_tools.ONE_INTEGER) : v_iteration);
                                        d_handle = Vectors.aref(vector_var, d_id);
                                        if (cb_tools.NIL == id_index.id_index_tombstone_p(d_handle) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                            if (cb_tools.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                                d_handle = (SubLObject)cb_tools.$kw468$SKIP;
                                            }
                                            o4 = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o4, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$113 = idx_$111;
                                if (cb_tools.NIL == id_index.id_index_sparse_objects_empty_p(idx_$113) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$113);
                                    SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$113);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$113);
                                    final SubLObject v_default = (SubLObject)((cb_tools.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) ? cb_tools.NIL : cb_tools.$kw468$SKIP);
                                    while (d_id2.numL(end_id)) {
                                        final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                        if (cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP) || cb_tools.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                            final SubLObject o2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o2, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        d_id2 = Numbers.add(d_id2, (SubLObject)cb_tools.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$113, thread);
                    }
                }
            }
            if (cb_tools.NIL != list_utilities.member_eqP((SubLObject)cb_tools.$kw477$KB_HL_SUPPORTS, types)) {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str478$Recent_KB_HL_supports_);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                if (cb_tools.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = kb_hl_supports_high.kb_hl_supports_around(kb_hl_support_handles.next_kb_hl_support_id(), n, n, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$115 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)cb_tools.$str479$mapping_kb_hl_supports_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)cb_tools.NIL;
                            o = csome_list_var.first();
                            while (cb_tools.NIL != csome_list_var) {
                                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                cb_utilities.cb_form(o, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cb_tools.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values9 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values9);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$115, thread);
                    }
                }
                else {
                    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
                    final SubLObject mess = (SubLObject)cb_tools.$str479$mapping_kb_hl_supports_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)cb_tools.ZERO_INTEGER;
                    assert cb_tools.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$117 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_tools.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_tools.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_tools.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$114 = idx;
                            if (cb_tools.NIL == id_index.id_index_objects_empty_p(idx_$114, (SubLObject)cb_tools.$kw468$SKIP)) {
                                final SubLObject idx_$115 = idx_$114;
                                if (cb_tools.NIL == id_index.id_index_dense_objects_empty_p(idx_$115, (SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$115);
                                    final SubLObject backwardP_var = (SubLObject)cb_tools.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject s_id;
                                    SubLObject s_handle;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_tools.NIL, v_iteration = (SubLObject)cb_tools.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_tools.ONE_INTEGER)) {
                                        s_id = ((cb_tools.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_tools.ONE_INTEGER) : v_iteration);
                                        s_handle = Vectors.aref(vector_var, s_id);
                                        if (cb_tools.NIL == id_index.id_index_tombstone_p(s_handle) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                            if (cb_tools.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                                s_handle = (SubLObject)cb_tools.$kw468$SKIP;
                                            }
                                            o4 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o4, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$116 = idx_$114;
                                if (cb_tools.NIL == id_index.id_index_sparse_objects_empty_p(idx_$116) || cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$116);
                                    SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$116);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$116);
                                    final SubLObject v_default = (SubLObject)((cb_tools.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP)) ? cb_tools.NIL : cb_tools.$kw468$SKIP);
                                    while (s_id2.numL(end_id)) {
                                        final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                                        if (cb_tools.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_tools.$kw468$SKIP) || cb_tools.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                            final SubLObject o2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                                            cb_utilities.cb_form(o2, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            sofar = Numbers.add(sofar, (SubLObject)cb_tools.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        s_id2 = Numbers.add(s_id2, (SubLObject)cb_tools.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_tools.T, thread);
                                final SubLObject _values10 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values10);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$117, thread);
                    }
                }
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 69121L)
    public static SubLObject cb_handle_interactor(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_tools.$str483$the_SubLisp_Interactor);
        }
        else {
            SubLObject interactor_string = (SubLObject)cb_tools.NIL;
            SubLObject default_string = (SubLObject)cb_tools.NIL;
            if (cb_tools.NIL != args) {
                interactor_string = html_utilities.html_extract_input((SubLObject)cb_tools.$str484$interactor, args);
                if (interactor_string.isString()) {
                    interactor_string = cb_form_widgets.cb_normalize_formula_string(interactor_string);
                }
            }
            final SubLObject title_var = (SubLObject)cb_tools.$str485$SubL_Interactor;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$134 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_tools.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_tools.$kw7$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$135 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_tools.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_tools.$str486$cb_handle_interactor, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                                final SubLObject documentation_requestP = html_utilities.html_extract_input((SubLObject)cb_tools.$str487$document, args);
                                final SubLObject input_string = html_utilities.html_extract_input((SubLObject)cb_tools.$str488$input_string, args);
                                if (cb_tools.NIL != args) {
                                    if (cb_tools.NIL != input_string) {
                                        default_string = input_string;
                                    }
                                    else {
                                        default_string = cb_interactor_results(interactor_string, documentation_requestP);
                                        html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                    }
                                }
                                if (cb_tools.NIL != default_string && Sequences.length(default_string).numE((SubLObject)cb_tools.ZERO_INTEGER)) {
                                    default_string = (SubLObject)cb_tools.NIL;
                                }
                                cb_show_handle_interactor(default_string);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$135, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$134, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 70233L)
    public static SubLObject cb_show_handle_interactor(final SubLObject default_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL != cb_form_widgets.$cb_use_subl_code_editorP$.getDynamicValue(thread)) {
            cyc_file_dependencies.javascript((SubLObject)cb_tools.$kw492$HTML_EDITOR_SCRIPTS);
        }
        cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw490$CB_HANDLE_INTERACTOR, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_submit_input((SubLObject)cb_tools.$str493$Eval, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str494$Enter_A_Form__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
        if (cb_tools.NIL != default_string) {
            html_utilities.html_reset_input((SubLObject)cb_tools.$str495$Reset);
            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
        }
        if (cb_tools.NIL == cb_form_widgets.$cb_use_subl_code_editorP$.getDynamicValue(thread)) {
            html_script_utilities.html_clear_input_button((SubLObject)cb_tools.$str484$interactor, (SubLObject)cb_tools.$str190$Clear, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
            html_complete.html_complete_button((SubLObject)cb_tools.$str484$interactor, (SubLObject)cb_tools.$str189$Complete, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
            html_complete.html_cyclify_button((SubLObject)cb_tools.$str484$interactor, (SubLObject)cb_tools.$str496$Cyclify, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str484$interactor);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL != cb_tools.$cb_interactor_width$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(cb_tools.$cb_interactor_width$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            if (cb_tools.NIL != cb_tools.$cb_interactor_height$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(cb_tools.$cb_interactor_height$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            if (cb_tools.NIL != cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                if (cb_tools.NIL != default_string) {
                    html_utilities.html_princ(default_string);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str484$interactor);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL != cb_tools.$cb_interactor_width$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(cb_tools.$cb_interactor_width$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            if (cb_tools.NIL != cb_tools.$cb_interactor_height$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(cb_tools.$cb_interactor_height$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            if (cb_tools.NIL != cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                if (cb_tools.NIL != default_string) {
                    html_utilities.html_princ(default_string);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 71537L)
    public static SubLObject cb_interactor_results(final SubLObject interactor_string, final SubLObject documentation_requestP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (Sequences.length(interactor_string).numE((SubLObject)cb_tools.ZERO_INTEGER)) {
            return (SubLObject)cb_tools.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject form = reader.read_from_string_ignoring_errors(interactor_string, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject read_remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (read_remainder == cb_tools.$kw497$ERROR) {
            final SubLObject color_val = (SubLObject)cb_tools.$kw498$RED;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_tools.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_tools.$str499$Malformed_expression___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_princ(interactor_string);
            }
            finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            return interactor_string;
        }
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str500$Last_Form_Evaluated___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_string(interactor_string, (SubLObject)cb_tools.ZERO_INTEGER, read_remainder);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_tools.$str501$Results___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject results = (SubLObject)cb_tools.NIL;
        SubLObject error_message = (SubLObject)cb_tools.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cb_tools.$sym502$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$139 = StreamsLow.$standard_output$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = StreamsLow.$error_output$.currentBinding(thread);
                    try {
                        StreamsLow.$standard_output$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                        StreamsLow.$error_output$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                        process_utilities.current_process_note_form(form);
                        results = eval_in_api.cyc_api_eval((SubLObject)ConsesLow.list((SubLObject)cb_tools.$sym503$MULTIPLE_VALUE_LIST, form));
                    }
                    finally {
                        StreamsLow.$error_output$.rebind(_prev_bind_4, thread);
                        StreamsLow.$standard_output$.rebind(_prev_bind_0_$139, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_tools.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_3, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (cb_tools.NIL != error_message) {
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject color_val2 = (SubLObject)cb_tools.$kw498$RED;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_tools.NIL != color_val2) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val2));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_tools.$str504$ERROR___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_5, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_princ(error_message);
            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
        }
        if (cb_tools.NIL != error_message) {
            return interactor_string;
        }
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)cb_tools.NIL;
        result = cdolist_list_var.first();
        while (cb_tools.NIL != cdolist_list_var) {
            cb_utilities.cb_form(result, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.T);
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return string_utilities.substring(interactor_string, read_remainder, (SubLObject)cb_tools.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 73831L)
    public static SubLObject cb_link_interactor(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str505$Interactor;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str486$cb_handle_interactor);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 74110L)
    public static SubLObject cb_guess_function(final SubLObject string) {
        SubLObject position_stack = (SubLObject)cb_tools.NIL;
        SubLObject end_var_$140;
        SubLObject end_var;
        SubLObject i;
        SubLObject pcase_var;
        SubLObject v_char;
        for (end_var = (end_var_$140 = Sequences.length(string)), i = (SubLObject)cb_tools.NIL, i = (SubLObject)cb_tools.ZERO_INTEGER; !i.numGE(end_var_$140); i = number_utilities.f_1X(i)) {
            v_char = (pcase_var = Strings.sublisp_char(string, i));
            if (pcase_var.eql((SubLObject)Characters.CHAR_lparen)) {
                position_stack = (SubLObject)ConsesLow.cons(i, position_stack);
            }
            else if (pcase_var.eql((SubLObject)Characters.CHAR_rparen)) {
                position_stack = position_stack.rest();
            }
        }
        SubLObject cdolist_list_var = position_stack;
        SubLObject position = (SubLObject)cb_tools.NIL;
        position = cdolist_list_var.first();
        while (cb_tools.NIL != cdolist_list_var) {
            final SubLObject obj = reader.read_from_string_ignoring_errors(string, (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.NIL, Numbers.add(position, (SubLObject)cb_tools.ONE_INTEGER), (SubLObject)cb_tools.UNPROVIDED);
            if (obj.isSymbol() && cb_tools.NIL != Symbols.fboundp(obj)) {
                return obj;
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 74571L)
    public static SubLObject cb_arglist(final SubLObject args) {
        html_utilities.html_princ((SubLObject)cb_tools.$str509$_);
        if (cb_tools.NIL != args) {
            SubLObject cdolist_list_var = args;
            SubLObject arg = (SubLObject)cb_tools.NIL;
            arg = cdolist_list_var.first();
            while (cb_tools.NIL != cdolist_list_var) {
                if (!arg.eql(args.first())) {
                    html_utilities.html_princ((SubLObject)cb_tools.$str510$_);
                }
                cb_arglist_rec(arg);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        html_utilities.html_princ((SubLObject)cb_tools.$str511$_);
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 74773L)
    public static SubLObject cb_arglist_rec(final SubLObject obj) {
        if (cb_tools.NIL == obj) {
            html_utilities.html_princ((SubLObject)cb_tools.$str311$nil);
        }
        else if (obj.isKeyword()) {
            html_utilities.html_prin1(obj);
        }
        else if (obj.isSymbol()) {
            html_utilities.html_princ(Strings.string_downcase(Symbols.symbol_name(obj), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        }
        else if (obj.isAtom()) {
            html_utilities.html_prin1(obj);
        }
        else if (Sequences.length(obj).numE((SubLObject)cb_tools.TWO_INTEGER) && obj.first() == cb_tools.$sym512$FUNCTION && conses_high.second(obj).isSymbol() && cb_tools.NIL != Symbols.fboundp(conses_high.second(obj))) {
            html_utilities.html_princ((SubLObject)cb_tools.$str513$__);
            cb_arglist_rec(conses_high.second(obj));
        }
        else if (Sequences.length(obj).numE((SubLObject)cb_tools.TWO_INTEGER) && obj.first() == cb_tools.$sym48$QUOTE) {
            html_utilities.html_princ((SubLObject)cb_tools.$str514$_);
            cb_arglist_rec(conses_high.second(obj));
        }
        else {
            html_utilities.html_princ((SubLObject)cb_tools.$str509$_);
            SubLObject rest = (SubLObject)cb_tools.NIL;
            SubLObject next = (SubLObject)cb_tools.NIL;
            rest = obj;
            next = rest.first();
            while (rest.rest().isCons()) {
                if (!rest.eql(obj)) {
                    html_utilities.html_indent((SubLObject)cb_tools.ONE_INTEGER);
                }
                cb_arglist_rec(next);
                rest = rest.rest();
                next = rest.first();
            }
            if (!rest.eql(obj)) {
                html_utilities.html_indent((SubLObject)cb_tools.ONE_INTEGER);
            }
            cb_arglist_rec(next);
            if (cb_tools.NIL != rest.rest()) {
                html_utilities.html_princ((SubLObject)cb_tools.$str515$___);
                cb_arglist_rec(rest.rest());
            }
            html_utilities.html_princ((SubLObject)cb_tools.$str511$_);
        }
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 75954L)
    public static SubLObject cb_save_interface_state() {
        SubLObject savedP = (SubLObject)cb_tools.NIL;
        if (cb_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_tools.$str520$Save_Interface);
        }
        else {
            final SubLObject filename = user_preferences_file_name(operation_communication.the_cyclist());
            savedP = html_kernel.save_html_state_to_file(filename, utilities_macros.$html_interface_variables$.getGlobalValue());
            if (cb_tools.NIL != savedP) {
                cb_tools.$html_state_filename$.setDynamicValue(filename);
            }
        }
        return savedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 76465L)
    public static SubLObject cb_load_user_preferences(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLObject successP = load_user_preferences();
        if (cb_tools.NIL != successP) {
            cb_utilities.cb_message_page_with_history((SubLObject)cb_tools.$str522$Interface_Settings_Loaded_Success, (SubLObject)cb_tools.T);
        }
        else {
            cb_utilities.cb_simple_message_page((SubLObject)cb_tools.$str523$No_Interface_Settings_File_To_Loa, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 76899L)
    public static SubLObject load_user_preferences() {
        final SubLObject filename = user_preferences_file_name((SubLObject)cb_tools.UNPROVIDED);
        SubLObject preferences_loadedP = (SubLObject)cb_tools.NIL;
        clear_user_preferences();
        if (cb_tools.NIL != Filesys.probe_file(filename)) {
            html_kernel.restore_html_state_from_file(filename);
            preferences_loadedP = (SubLObject)cb_tools.T;
        }
        else if (cb_tools.NIL != default_preference_file_existsP()) {
            html_kernel.restore_html_state_from_file(default_preference_file());
            preferences_loadedP = (SubLObject)cb_tools.T;
        }
        return preferences_loadedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 77668L)
    public static SubLObject user_preferences_file_name(SubLObject cyclist) {
        if (cyclist == cb_tools.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_part = (SubLObject)((cb_tools.NIL != constant_handles.constant_p(cyclist)) ? constants_high.constant_name(cyclist) : ((cyclist == cb_tools.$kw277$DEFAULT) ? cb_tools.$str521$default : kb_utilities.compact_hl_external_id_string(cyclist)));
        return Strings.string_downcase(Filesys.construct_filename(cb_tools.$user_preference_directory_list$.getDynamicValue(thread), user_part, cb_tools.$user_preference_file_extension$.getDynamicValue(thread), (SubLObject)cb_tools.T), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78087L)
    public static SubLObject clear_user_preferences() {
        cb_query.$cb_default_query_parameters$.setDynamicValue((SubLObject)cb_tools.NIL);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78239L)
    public static SubLObject default_preference_file_existsP() {
        return list_utilities.sublisp_boolean(Filesys.probe_file(default_preference_file()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78416L)
    public static SubLObject default_preference_file() {
        return user_preferences_file_name((SubLObject)cb_tools.$kw277$DEFAULT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78868L)
    public static SubLObject cb_load_api(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_tools.$str528$the_KE_Load_Page);
            return (SubLObject)cb_tools.NIL;
        }
        final SubLObject title_var = (SubLObject)cb_tools.$str529$Load_API_Expressions_Page;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$141 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$142 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        if (cb_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_tools.$str530$cb_load_api_handler, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw526$CB_LOAD_API, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str531$Please_type_in_the_name_of_the_fi);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str532$_Load_File__);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str533$button_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str534$load_api_file_name, (SubLObject)cb_tools.NIL, cb_tools.$cb_load_api_input_size$.getDynamicValue(thread));
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_tools.$str190$Clear);
                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str535$Load_File, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$142, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$141, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 79758L)
    public static SubLObject cb_load_api_handler(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_tools.$str528$the_KE_Load_Page);
            return (SubLObject)cb_tools.NIL;
        }
        if (cb_tools.NIL == args) {
            cb_utilities.cb_error((SubLObject)cb_tools.$str537$cb_load_api_handler_called_with_n, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            return (SubLObject)cb_tools.NIL;
        }
        final SubLObject title_var = (SubLObject)cb_tools.$str538$Load_API_Expressions_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$146 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$147 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        if (cb_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_tools.$str530$cb_load_api_handler, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw526$CB_LOAD_API, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            SubLObject file_name = html_utilities.html_extract_input((SubLObject)cb_tools.$str534$load_api_file_name, args);
                            SubLObject skip_amount = html_utilities.html_extract_input((SubLObject)cb_tools.$str539$load_api_file_skip, args);
                            file_name = string_utilities.trim_whitespace(file_name);
                            if (cb_tools.NIL == skip_amount) {
                                skip_amount = (SubLObject)cb_tools.ZERO_INTEGER;
                            }
                            if (skip_amount.isString()) {
                                skip_amount = reader.read_from_string_ignoring_errors(skip_amount, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            if (file_name.isString()) {
                                if (cb_tools.NIL != Filesys.probe_file(file_name)) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = batch_ke.load_api_internal(file_name, skip_amount);
                                    final SubLObject count = thread.secondMultipleValue();
                                    final SubLObject position = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    html_utilities.html_princ((SubLObject)cb_tools.$str540$The_file__);
                                    html_utilities.html_princ(file_name);
                                    html_utilities.html_princ((SubLObject)cb_tools.$str541$__was_loaded___Here_are_the_resul);
                                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                                    if (status.equalp((SubLObject)cb_tools.$kw542$SUCCESS)) {
                                        html_utilities.html_indent((SubLObject)cb_tools.FOUR_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_tools.$str543$Successfully_and_completely_loade);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    else {
                                        cb_load_api_continue(file_name, status, count, position);
                                    }
                                }
                                else {
                                    cb_utilities.cb_error((SubLObject)cb_tools.$str544$File__s_does_not_exist_, file_name, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                }
                            }
                            else {
                                cb_utilities.cb_error((SubLObject)cb_tools.$str545$KE_filename_was_not_a_string_, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$147, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$146, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 81444L)
    public static SubLObject cb_load_api_continue(final SubLObject file_name, final SubLObject status, final SubLObject count, SubLObject position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (status.equalp((SubLObject)cb_tools.$kw547$FILE_NOT_FOUND)) {
            cb_utilities.cb_error((SubLObject)cb_tools.$str544$File__s_does_not_exist_, file_name, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_hidden_input((SubLObject)cb_tools.$str530$cb_load_api_handler, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_tools.$str548$An_error_occurred_after_processin);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ(count);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_tools.$str549$_forms_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                html_utilities.html_princ(status);
                html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_tools.$str550$Form_Number);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str551$You_may_continue_processing_this_);
                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_text_input((SubLObject)cb_tools.$str539$load_api_file_skip, count, cb_tools.$cb_load_api_skip_input_size$.getDynamicValue(thread));
                html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_tools.$str552$KE_File_Name);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_tools.$str553$You_may_also_specify_a_new_file_t);
                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_text_input((SubLObject)cb_tools.$str534$load_api_file_name, file_name, cb_tools.$cb_load_api_input_size$.getDynamicValue(thread));
                html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                html_utilities.html_reset_input((SubLObject)cb_tools.$str495$Reset);
                html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                html_utilities.html_submit_input((SubLObject)cb_tools.$str535$Load_File, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 83660L)
    public static SubLObject cb_show_when(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_tools.$str556$the_Display_by_Date);
            return (SubLObject)cb_tools.NIL;
        }
        final SubLObject title_var = (SubLObject)cb_tools.$str557$Display_by_Date;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$151 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$152 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        if (cb_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_tools.$str558$cb_show_when_handler, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw554$CB_SHOW_WHEN, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_tools.$str495$Reset);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str138$Submit, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str559$What_kind_of_data_do_you_want_to_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_radio_input((SubLObject)cb_tools.$str560$cb_show_type, cb_tools.$cb_show_constant_value$.getGlobalValue(), (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str561$Constants);
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_radio_input((SubLObject)cb_tools.$str560$cb_show_type, cb_tools.$cb_show_assertion_value$.getGlobalValue(), (SubLObject)cb_tools.NIL, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str562$Assertions);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            thread.resetMultipleValues();
                            final SubLObject day = numeric_date_utilities.decode_universal_date(numeric_date_utilities.get_universal_date((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
                            final SubLObject month = thread.secondMultipleValue();
                            final SubLObject year = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str563$Enter_in_the_start_date_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str564$Month);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str565$cb_show_start_month, month, (SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str566$Day);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str567$cb_show_start_day, day, (SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str568$Year);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str569$cb_show_start_year, year, (SubLObject)cb_tools.FOUR_INTEGER);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str570$Enter_in_the_ending_date_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str564$Month);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str571$cb_show_end_month, month, (SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str566$Day);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str572$cb_show_end_day, day, (SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_tools.$str568$Year);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str573$cb_show_end_year, year, (SubLObject)cb_tools.FOUR_INTEGER);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str574$Enter_the_cyclist_to_examine__bla);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_complete.html_complete_button((SubLObject)cb_tools.$str575$cb_show_cyclist, (SubLObject)cb_tools.$str189$Complete, cb_tools.$const283$Cyclist, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str575$cb_show_cyclist, operation_communication.the_cyclist(), (SubLObject)cb_tools.$int576$24);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_tools.$str575$cb_show_cyclist, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str577$Enter_the_project_to_examine__bla);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_complete.html_complete_button((SubLObject)cb_tools.$str578$cb_show_project, (SubLObject)cb_tools.$str189$Complete, cb_tools.$const579$Cyc_BasedProject, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_tools.$str578$cb_show_project, (SubLObject)cb_tools.$str339$, (SubLObject)cb_tools.$int576$24);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_tools.$str578$cb_show_project, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$152, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$151, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 86282L)
    public static SubLObject cb_show_check_values(final SubLObject args) {
        if (cb_tools.NIL != html_utilities.html_extract_input((SubLObject)cb_tools.$str560$cb_show_type, args)) {
            return (SubLObject)cb_tools.T;
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 86540L)
    public static SubLObject cb_show_when_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == cb_show_check_values(args)) {
            cb_utilities.cb_error((SubLObject)cb_tools.$str583$Please_specify_either_a_Constant_, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            return (SubLObject)cb_tools.NIL;
        }
        final SubLObject search_type = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str560$cb_show_type, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        SubLObject cyclist = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_tools.$str575$cb_show_cyclist, args));
        SubLObject project = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_tools.$str578$cb_show_project, args));
        final SubLObject start_day = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str567$cb_show_start_day, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject start_month = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str565$cb_show_start_month, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject start_year = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str569$cb_show_start_year, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject start_date = numeric_date_utilities.encode_universal_date(start_day, start_month, start_year);
        final SubLObject end_day = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str572$cb_show_end_day, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject end_month = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str571$cb_show_end_month, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject end_year = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_tools.$str573$cb_show_end_year, args), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject end_date = numeric_date_utilities.encode_universal_date(end_day, end_month, end_year);
        if (cb_tools.$str339$.equalp(cyclist)) {
            cyclist = (SubLObject)cb_tools.NIL;
        }
        else {
            cyclist = cb_utilities.cb_guess_fort(cyclist, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL == forts.fort_p(cyclist)) {
                cb_utilities.cb_error((SubLObject)cb_tools.$str584$Unknown_cyclist___S, cyclist, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                return (SubLObject)cb_tools.NIL;
            }
        }
        if (cb_tools.$str339$.equalp(project)) {
            project = (SubLObject)cb_tools.NIL;
        }
        else {
            project = cb_utilities.cb_guess_fort(project, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL == forts.fort_p(project)) {
                cb_utilities.cb_error((SubLObject)cb_tools.$str585$Unknown_project___S, project, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                return (SubLObject)cb_tools.NIL;
            }
        }
        final SubLObject title_var = (SubLObject)cb_tools.$str586$Date_Search_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$156 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$157 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw581$CB_SHOW_WHEN_HANDLER, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str587$Listing_);
                            if (search_type.equalp(cb_tools.$cb_show_constant_value$.getGlobalValue())) {
                                html_utilities.html_princ((SubLObject)cb_tools.$str588$constants);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_tools.$str589$assertions);
                            }
                            html_utilities.html_princ((SubLObject)cb_tools.$str590$_created_from_);
                            cb_utilities.cb_show_date(start_date);
                            html_utilities.html_princ((SubLObject)cb_tools.$str591$_to_);
                            cb_utilities.cb_show_date(end_date);
                            if (cb_tools.NIL != cyclist) {
                                html_utilities.html_princ((SubLObject)cb_tools.$str592$_by_);
                                cb_utilities.cb_show_term(cyclist, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            if (cb_tools.NIL != project) {
                                html_utilities.html_princ((SubLObject)cb_tools.$str593$_for_);
                                cb_utilities.cb_show_term(project, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            }
                            html_utilities.html_princ((SubLObject)cb_tools.$str188$__);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            final SubLObject form_to_eval = (SubLObject)(search_type.equalp(cb_tools.$cb_show_constant_value$.getGlobalValue()) ? ((cb_tools.NIL != project) ? ConsesLow.list((SubLObject)cb_tools.$sym594$CONSTANTS_FOR_PROJECTS_BETWEEN, project, start_date, end_date, cyclist) : ConsesLow.list((SubLObject)cb_tools.$sym595$CONSTANTS_CREATED_BETWEEN, start_date, end_date, cyclist)) : ((cb_tools.NIL != project) ? ConsesLow.list((SubLObject)cb_tools.$sym596$ASSERTIONS_FOR_PROJECTS_BETWEEN, project, start_date, end_date, cyclist) : ConsesLow.list((SubLObject)cb_tools.$sym597$ASSERTIONS_BETWEEN, start_date, end_date, cyclist)));
                            final SubLObject result_var = (SubLObject)(search_type.equalp(cb_tools.$cb_show_constant_value$.getGlobalValue()) ? cb_tools.$sym598$_CONSTANT : cb_tools.$sym599$_ASSERTION);
                            final SubLObject query = (SubLObject)ConsesLow.list(cb_tools.$const600$thereExists, (SubLObject)cb_tools.$sym601$_TERM_LIST, (SubLObject)ConsesLow.list(cb_tools.$const602$and, (SubLObject)ConsesLow.list(cb_tools.$const603$evaluate, (SubLObject)cb_tools.$sym601$_TERM_LIST, (SubLObject)ConsesLow.list(cb_tools.$const604$EvaluateSubLFn, (SubLObject)ConsesLow.list(cb_tools.$const605$SubLQuoteFn, form_to_eval))), (SubLObject)ConsesLow.listS(cb_tools.$const606$memberOfList, result_var, (SubLObject)cb_tools.$list607)));
                            thread.resetMultipleValues();
                            final SubLObject result = inference_kernel.new_cyc_query(query, cb_tools.$const608$BaseKB, (SubLObject)cb_tools.$list609);
                            final SubLObject halt_reason = thread.secondMultipleValue();
                            final SubLObject inference = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (halt_reason != cb_tools.$kw610$EXHAUST_TOTAL) {
                                Errors.warn((SubLObject)cb_tools.$str611$Expected_When_Tool_inference_halt, halt_reason);
                            }
                            SubLObject show_list = (SubLObject)cb_tools.NIL;
                            SubLObject cdolist_list_var = result;
                            SubLObject binding_list = (SubLObject)cb_tools.NIL;
                            binding_list = cdolist_list_var.first();
                            while (cb_tools.NIL != cdolist_list_var) {
                                final SubLObject binding = list_utilities.only_one(binding_list);
                                final SubLObject v_term = bindings.variable_binding_value(binding);
                                show_list = (SubLObject)ConsesLow.cons(v_term, show_list);
                                cdolist_list_var = cdolist_list_var.rest();
                                binding_list = cdolist_list_var.first();
                            }
                            show_list = Sequences.nreverse(show_list);
                            cb_show_display_results(search_type, show_list, inference);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$157, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$156, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 90487L)
    public static SubLObject cb_show_display_results(final SubLObject search_type, final SubLObject show_list, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == show_list) {
            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_tools.$str613$None_for_the_given_time_period_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
            return (SubLObject)cb_tools.NIL;
        }
        SubLObject last_cyclist = (SubLObject)cb_tools.NIL;
        SubLObject last_date = (SubLObject)cb_tools.NIL;
        SubLObject last_reviewer = (SubLObject)cb_tools.NIL;
        final SubLObject constant_searchP = Equality.equalp(search_type, cb_tools.$cb_show_constant_value$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_tools.$str614$_a__a___, Sequences.length(show_list), (SubLObject)((cb_tools.NIL != constant_searchP) ? cb_tools.$str588$constants : cb_tools.$str589$assertions));
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_tools.$kw615$SAVE_INFERENCE_ANSWERS, inference, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
        SubLObject cdolist_list_var = show_list;
        SubLObject listing = (SubLObject)cb_tools.NIL;
        listing = cdolist_list_var.first();
        while (cb_tools.NIL != cdolist_list_var) {
            if (cb_tools.NIL != constant_searchP) {
                if (!last_cyclist.equalp(bookkeeping_store.creator(listing, (SubLObject)cb_tools.UNPROVIDED))) {
                    last_cyclist = bookkeeping_store.creator(listing, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_utilities.cb_show_term(last_cyclist, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    last_date = (SubLObject)cb_tools.NIL;
                }
                if (!last_date.equalp(bookkeeping_store.creation_time(listing, (SubLObject)cb_tools.UNPROVIDED))) {
                    last_date = bookkeeping_store.creation_time(listing, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                    cb_utilities.cb_show_date(last_date);
                }
                if (!last_reviewer.equalp(kb_accessors.reviewer(listing, (SubLObject)cb_tools.UNPROVIDED))) {
                    last_reviewer = kb_accessors.reviewer(listing, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_utilities.cb_show_term(last_reviewer, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
            }
            else {
                if (!last_cyclist.equalp(assertions_high.asserted_by(listing))) {
                    last_cyclist = assertions_high.asserted_by(listing);
                    html_utilities.html_hr((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_utilities.cb_show_term(last_cyclist, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    last_date = (SubLObject)cb_tools.NIL;
                }
                if (!last_date.equalp(assertions_high.asserted_when(listing))) {
                    last_date = assertions_high.asserted_when(listing);
                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                    cb_utilities.cb_show_date(last_date);
                }
            }
            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_tools.SIX_INTEGER);
            cb_utilities.cb_form(listing, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            if (cb_tools.NIL != assertion_handles.assertion_p(listing)) {
                html_utilities.html_princ((SubLObject)cb_tools.$str616$_in_);
                cb_utilities.cb_show_term(assertions_high.assertion_mt(listing), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            listing = cdolist_list_var.first();
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 92516L)
    public static SubLObject cb_link_show_when(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str617$When;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str618$cb_show_when);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 92975L)
    public static SubLObject cb_index_overlap(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_tools.$str624$Index_Overlap;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        if (cb_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_tools.$str625$cb_handle_index_overlap, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw622$CB_INDEX_OVERLAP, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_tools.$str626$Search, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.THREE_INTEGER);
                            html_utilities.html_reset_input((SubLObject)cb_tools.$str190$Clear);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str627$Enter_required_terms_separated_by);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_complete.html_complete_button((SubLObject)cb_tools.$str628$terms, (SubLObject)cb_tools.$str189$Complete, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_complete.html_cyclify_button((SubLObject)cb_tools.$str628$terms, (SubLObject)cb_tools.$str496$Cyclify, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str628$terms);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$int482$80);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.TEN_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$166, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str629$Enter_terms_to_exclude_separated_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_complete.html_complete_button((SubLObject)cb_tools.$str630$exclude_terms, (SubLObject)cb_tools.$str189$Complete, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_tools.UNPROVIDED);
                            html_complete.html_cyclify_button((SubLObject)cb_tools.$str630$exclude_terms, (SubLObject)cb_tools.$str496$Cyclify, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str630$exclude_terms);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$int482$80);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.TEN_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$165, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$162, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$161, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 93899L)
    public static SubLObject cb_handle_index_overlap(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = (SubLObject)cb_tools.NIL;
        SubLObject exclude_constants = (SubLObject)cb_tools.NIL;
        SubLObject error = (SubLObject)cb_tools.NIL;
        thread.resetMultipleValues();
        final SubLObject constants_$168 = cb_utilities.read_multiple_terms_from_string(html_utilities.html_extract_input((SubLObject)cb_tools.$str628$terms, args));
        final SubLObject error_$169 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        constants = constants_$168;
        error = error_$169;
        if (cb_tools.NIL != error) {
            return cb_utilities.cb_error((SubLObject)cb_tools.$str632$Error_reading_terms___Check_for_t, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject exclude_constants_$170 = cb_utilities.read_multiple_terms_from_string(html_utilities.html_extract_input((SubLObject)cb_tools.$str630$exclude_terms, args));
        final SubLObject error_$170 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        exclude_constants = exclude_constants_$170;
        error = error_$170;
        if (cb_tools.NIL != error) {
            return cb_utilities.cb_error((SubLObject)cb_tools.$str633$Error_reading_exclude_terms___Che, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        }
        constants = Sequences.nreverse(constants);
        final SubLObject title_var = (SubLObject)cb_tools.$str634$Index_Overlap_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$172 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$173 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_tools.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_tools.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_tools.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_tools.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                            if (cb_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_tools.$kw622$CB_INDEX_OVERLAP, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_tools.$str635$Search_Terms__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (cb_tools.NIL == constants) {
                                html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_tools.$str351$None);
                                html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_tools.$str636$Please_enter_some_valid_search_te);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            else {
                                SubLObject cdolist_list_var = constants;
                                SubLObject constant = (SubLObject)cb_tools.NIL;
                                constant = cdolist_list_var.first();
                                while (cb_tools.NIL != cdolist_list_var) {
                                    html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                    cb_utilities.cb_show_term(constant, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    constant = cdolist_list_var.first();
                                }
                                html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                                if (cb_tools.NIL != exclude_constants) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_tools.$str637$Excluded_Terms__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    cdolist_list_var = exclude_constants;
                                    SubLObject exclude_constant = (SubLObject)cb_tools.NIL;
                                    exclude_constant = cdolist_list_var.first();
                                    while (cb_tools.NIL != cdolist_list_var) {
                                        html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                        cb_utilities.cb_show_term(exclude_constant, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        exclude_constant = cdolist_list_var.first();
                                    }
                                    html_utilities.html_newline((SubLObject)cb_tools.TWO_INTEGER);
                                }
                                if (cb_tools.NIL != list_utilities.singletonP(constants)) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_tools.$str638$Please_enter_more_than_1_search_t);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                                else {
                                    SubLObject assertions = (SubLObject)cb_tools.NIL;
                                    final SubLObject _prev_bind_0_$177 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$178 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_tools.$sym639$RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind(cb_tools.$const640$EverythingPSC, thread);
                                        assertions = virtual_indexing.assertions_mentioning_terms(constants, (SubLObject)cb_tools.T);
                                        if (cb_tools.NIL != exclude_constants) {
                                            SubLObject new_assertions = (SubLObject)cb_tools.NIL;
                                            SubLObject cdolist_list_var2 = assertions;
                                            SubLObject assertion = (SubLObject)cb_tools.NIL;
                                            assertion = cdolist_list_var2.first();
                                            while (cb_tools.NIL != cdolist_list_var2) {
                                                SubLObject excludeP = (SubLObject)cb_tools.NIL;
                                                if (cb_tools.NIL == excludeP) {
                                                    SubLObject csome_list_var = exclude_constants;
                                                    SubLObject exclude_constant2 = (SubLObject)cb_tools.NIL;
                                                    exclude_constant2 = csome_list_var.first();
                                                    while (cb_tools.NIL == excludeP && cb_tools.NIL != csome_list_var) {
                                                        if (cb_tools.NIL != list_utilities.tree_find(exclude_constant2, uncanonicalizer.assertion_el_formula(assertion), (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED)) {
                                                            excludeP = (SubLObject)cb_tools.T;
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        exclude_constant2 = csome_list_var.first();
                                                    }
                                                }
                                                if (cb_tools.NIL == excludeP) {
                                                    new_assertions = (SubLObject)ConsesLow.cons(assertion, new_assertions);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                assertion = cdolist_list_var2.first();
                                            }
                                            assertions = new_assertions;
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$178, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$177, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_tools.$str641$Index_Overlap___);
                                    html_utilities.html_princ(Sequences.length(assertions));
                                    html_utilities.html_princ((SubLObject)cb_tools.$str642$_assertions_found_);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    if (cb_tools.NIL != assertions) {
                                        SubLObject cdolist_list_var3 = assertions;
                                        SubLObject assertion2 = (SubLObject)cb_tools.NIL;
                                        assertion2 = cdolist_list_var3.first();
                                        while (cb_tools.NIL != cdolist_list_var3) {
                                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                                            cb_utilities.cb_show_assertion_readably(assertion2, (SubLObject)cb_tools.T, (SubLObject)cb_tools.UNPROVIDED);
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            assertion2 = cdolist_list_var3.first();
                                        }
                                    }
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$174, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$173, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$172, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 96075L)
    public static SubLObject cb_link_index_overlap(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str644$Overlap;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str645$cb_index_overlap);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 96363L)
    public static SubLObject cb_link_owl_import(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str650$OWL_Import;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str651$cb_owl_import);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 96363L)
    public static SubLObject cb_link_owl_export(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str656$OWL_Export;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str657$cb_owl_export);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 97416L)
    public static SubLObject cb_link_compose(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str664$Compose;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str665$ke_compose);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 98065L)
    public static SubLObject cb_link_navigator(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str669$Navigator;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str670$cyc_navigator);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 98800L)
    public static SubLObject cb_link_doc(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str678$Doc;
        }
        final SubLObject target = (SubLObject)((cb_tools.NIL != cb_parameters.$cb_separate_doc_frame$.getDynamicValue(thread)) ? cb_tools.$kw675$DOC : cb_tools.$kw34$MAIN);
        final SubLObject frame = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_princ(cb_utilities.cyc_documentation_toc());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 99984L)
    public static SubLObject cyc_server_url(final SubLObject host, final SubLObject port_offset, SubLObject handler) {
        if (handler == cb_tools.UNPROVIDED) {
            handler = (SubLObject)cb_tools.$str681$cb_start;
        }
        return Sequences.cconcatenate((SubLObject)cb_tools.$str682$http___, new SubLObject[] { host, cb_tools.$str683$_, print_high.princ_to_string(Numbers.add((SubLObject)cb_tools.$int684$3602, port_offset)), http_kernel.$http_cgi_bin_directory$.getGlobalValue(), cb_tools.$str685$_cyccgi, Sequences.cconcatenate((SubLObject)cb_tools.$str686$_localhost, format_nil.format_nil_a_no_copy(port_offset)), http_kernel.$http_cg_url$.getGlobalValue(), handler });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 103434L)
    public static SubLObject cb_link_kb_monitor_index_hook(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str687$_Monitor_;
        }
        final SubLObject href = Sequences.cconcatenate((SubLObject)cb_tools.$str682$http___, new SubLObject[] { format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_host()), cb_tools.$str683$_, format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_port()), cb_tools.$str688$_kbmonitor_makequery_jsp_kbq_stri, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(index_hook)), cb_tools.$str689$_cyc_host_string_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), cb_tools.$str690$_cyc_port_string_, format_nil.format_nil_a_no_copy(html_kernel.html_port()) });
        final SubLObject window_name = Sequences.cconcatenate(kb_utilities.compact_hl_external_id_string(index_hook), (SubLObject)cb_tools.$str691$_kbmonitor);
        final SubLObject onclick = html_script_utilities.html_popup_onclick(window_name, (SubLObject)cb_tools.$int692$600, (SubLObject)cb_tools.$int693$400, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_script_utilities.html_popup_script();
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(href);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_tools.$str339$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_markup(onclick);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 104228L)
    public static SubLObject cb_jstack_trace(SubLObject args) {
        if (args == cb_tools.UNPROVIDED) {
            args = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = Sequences.cconcatenate((SubLObject)cb_tools.$str696$Jstack_for_process_, format_nil.format_nil_s_no_copy(system_administration_utilities.get_process_id_in_jrtl()));
        final SubLObject refresh = (SubLObject)cb_tools.NIL;
        html_utilities.html_markup((SubLObject)cb_tools.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_tools.$str4$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_tools.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_tools.$kw6$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            if (cb_tools.NIL != refresh) {
                html_utilities.html_refresh(refresh, (SubLObject)cb_tools.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$179 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
                    SubLObject list_var = (SubLObject)cb_tools.NIL;
                    SubLObject line = (SubLObject)cb_tools.NIL;
                    SubLObject index = (SubLObject)cb_tools.NIL;
                    list_var = system_administration_utilities.jstack_trace((SubLObject)cb_tools.UNPROVIDED);
                    line = list_var.first();
                    for (index = (SubLObject)cb_tools.ZERO_INTEGER; cb_tools.NIL != list_var; list_var = list_var.rest(), line = list_var.first(), index = Numbers.add((SubLObject)cb_tools.ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_utilities.html_princ(line);
                            html_utilities.html_newline((SubLObject)cb_tools.UNPROVIDED);
                        }
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$179, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_tools.UNPROVIDED);
        return (SubLObject)cb_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 104228L)
    public static SubLObject cb_link_jstack_trace(SubLObject linktext) {
        if (linktext == cb_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_tools.NIL == linktext) {
            linktext = (SubLObject)cb_tools.$str698$jstack_Trace;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_tools.$kw34$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_tools.$str699$cyc_jstack_trace);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        if (cb_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_tools.NIL;
    }
    
    public static SubLObject declare_cb_tools_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_tools", "CB-TOOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_tool_columns", "CB-TOOL-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_tools_internal", "CB-TOOLS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_tools_handler", "CB-TOOLS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_tools", "CB-LINK-TOOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "html_update_cb_toolbar_script", "HTML-UPDATE-CB-TOOLBAR-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "declare_cb_boolean_global", "DECLARE-CB-BOOLEAN-GLOBAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_boolean_option_field_name", "CB-BOOLEAN-OPTION-FIELD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_boolean_option_legend_form", "CB-BOOLEAN-OPTION-LEGEND-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_boolean_option_check", "CB-BOOLEAN-OPTION-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_boolean_option_new_value", "CB-BOOLEAN-OPTION-NEW-VALUE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_show_boolean_option", "CB-SHOW-BOOLEAN-OPTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_fastP", "CB-FAST?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_new_script_mode", "CB-NEW-SCRIPT-MODE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_options_submit_bar", "CB-OPTIONS-SUBMIT-BAR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options", "CB-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_table_of_contents", "CB-OPTIONS-TABLE-OF-CONTENTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_options_section", "CB-OPTIONS-SECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_options_section_column", "CB-OPTIONS-SECTION-COLUMN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_options_subsection", "CB-OPTIONS-SUBSECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_option_with_title_only", "CB-OPTION-WITH-TITLE-ONLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_option_with_title_and_hoverover", "CB-OPTION-WITH-TITLE-AND-HOVEROVER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_option_with_title", "CB-OPTION-WITH-TITLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_tools", "cb_checkbox_option", "CB-CHECKBOX-OPTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_constant_entry_option", "CB-CONSTANT-ENTRY-OPTION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_general", "CB-OPTIONS-GENERAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_term_display", "CB-OPTIONS-TERM-DISPLAY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_history_and_browser_tool", "CB-OPTIONS-HISTORY-AND-BROWSER-TOOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_nl", "CB-OPTIONS-NL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_paraphrase_mt", "CB-PARAPHRASE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_query_tool", "CB-OPTIONS-QUERY-TOOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_boolean_handler", "CB-OPTIONS-BOOLEAN-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_set_boolean", "CB-OPTIONS-SET-BOOLEAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_handler", "CB-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_history_display_options_handler", "CB-HISTORY-DISPLAY-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_term_display_options_handler", "CB-TERM-DISPLAY-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_lexification_options_handler", "CB-LEXIFICATION-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_pph_options_handler", "CB-PPH-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_set_default_pph_mt", "CB-SET-DEFAULT-PPH-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_query_tool_options_handler", "CB-QUERY-TOOL-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_handler_finish", "CB-OPTIONS-HANDLER-FINISH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_options", "CB-LINK-OPTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_result_page", "CB-OPTIONS-RESULT-PAGE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_options_result_message", "CB-OPTIONS-RESULT-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_history", "CB-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_history_internal", "CB-HISTORY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_history_info", "CB-SHOW-HISTORY-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_history", "CB-SHOW-RECENT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_constants", "CB-SHOW-RECENT-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_constants_categorized", "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_constants_categorized_2", "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_nats", "CB-SHOW-RECENT-NATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_sentences", "CB-SHOW-RECENT-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_bookmarks_supported_for_current_user", "CB-BOOKMARKS-SUPPORTED-FOR-CURRENT-USER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_bookmarked_constants", "CB-SHOW-BOOKMARKED-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_bookmarked_nats", "CB-SHOW-BOOKMARKED-NATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_bookmarked_assertions", "CB-SHOW-BOOKMARKED-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_recent_assertions", "CB-SHOW-RECENT-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_history", "CB-LINK-HISTORY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_clear_history", "CB-CLEAR-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_clear_history", "CB-LINK-CLEAR-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_clear_constant_history", "CB-LINK-CLEAR-CONSTANT-HISTORY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_clear_nat_history", "CB-LINK-CLEAR-NAT-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_clear_assertion_history", "CB-LINK-CLEAR-ASSERTION-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_clear_sentence_history", "CB-LINK-CLEAR-SENTENCE-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_history_el_formulas", "CB-HISTORY-EL-FORMULAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_history_el_formulas", "CB-LINK-HISTORY-EL-FORMULAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_history_hl_formulas", "CB-HISTORY-HL-FORMULAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_history_hl_formulas", "CB-LINK-HISTORY-HL-FORMULAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_fort_from_all_histories", "CB-REM-FORT-FROM-ALL-HISTORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_to_history", "CB-ADD-TO-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_constant_history_items", "CB-CONSTANT-HISTORY-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_most_recent_constant", "CB-MOST-RECENT-CONSTANT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_to_constant_history", "CB-ADD-TO-CONSTANT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_from_constant_history", "CB-REM-FROM-CONSTANT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_clear_constant_history", "CB-CLEAR-CONSTANT-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_valid_nat_p", "CB-VALID-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_nat_history_items", "CB-NAT-HISTORY-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_most_recent_nat", "CB-MOST-RECENT-NAT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_to_nat_history", "CB-ADD-TO-NAT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_from_nat_history", "CB-REM-FROM-NAT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_fort_from_nat_history", "CB-REM-FORT-FROM-NAT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_clear_nat_history", "CB-CLEAR-NAT-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_assertion_history_valid_item_p", "CB-ASSERTION-HISTORY-VALID-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_assertion_history_items", "CB-ASSERTION-HISTORY-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_most_recent_assertion", "CB-MOST-RECENT-ASSERTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_to_assertion_history", "CB-ADD-TO-ASSERTION-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_sentence_in_mt_to_assertion_history", "CB-ADD-SENTENCE-IN-MT-TO-ASSERTION-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_from_assertion_history", "CB-REM-FROM-ASSERTION-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_fort_from_assertion_history", "CB-REM-FORT-FROM-ASSERTION-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_clear_assertion_history", "CB-CLEAR-ASSERTION-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "expression_forts_with_hl", "EXPRESSION-FORTS-WITH-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_sentence_history_items", "CB-SENTENCE-HISTORY-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_most_recent_sentence", "CB-MOST-RECENT-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_to_sentence_history", "CB-ADD-TO-SENTENCE-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_add_sentence_in_mt_to_sentence_history", "CB-ADD-SENTENCE-IN-MT-TO-SENTENCE-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_from_sentence_history", "CB-REM-FROM-SENTENCE-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_rem_fort_from_sentence_history", "CB-REM-FORT-FROM-SENTENCE-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_clear_sentence_history", "CB-CLEAR-SENTENCE-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "clear_cb_bookmarked_items", "CLEAR-CB-BOOKMARKED-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "remove_cb_bookmarked_items", "REMOVE-CB-BOOKMARKED-ITEMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_bookmarked_items_internal", "CB-BOOKMARKED-ITEMS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_bookmarked_items", "CB-BOOKMARKED-ITEMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "name_for_alpha_sort", "NAME-FOR-ALPHA-SORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_current_relevant_terms", "CB-CURRENT-RELEVANT-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_recent_kb_additions", "CB-RECENT-KB-ADDITIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_recent_kb_additions", "CB-LINK-RECENT-KB-ADDITIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "links_to_recent_kb_additions", "LINKS-TO-RECENT-KB-ADDITIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_handle_interactor", "CB-HANDLE-INTERACTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_handle_interactor", "CB-SHOW-HANDLE-INTERACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_interactor_results", "CB-INTERACTOR-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_interactor", "CB-LINK-INTERACTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_guess_function", "CB-GUESS-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_arglist", "CB-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_arglist_rec", "CB-ARGLIST-REC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_save_interface_state", "CB-SAVE-INTERFACE-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_load_user_preferences", "CB-LOAD-USER-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "load_user_preferences", "LOAD-USER-PREFERENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "user_preferences_file_name", "USER-PREFERENCES-FILE-NAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "clear_user_preferences", "CLEAR-USER-PREFERENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "default_preference_file_existsP", "DEFAULT-PREFERENCE-FILE-EXISTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "default_preference_file", "DEFAULT-PREFERENCE-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_load_api", "CB-LOAD-API", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_load_api_handler", "CB-LOAD-API-HANDLER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_load_api_continue", "CB-LOAD-API-CONTINUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_when", "CB-SHOW-WHEN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_check_values", "CB-SHOW-CHECK-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_when_handler", "CB-SHOW-WHEN-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_show_display_results", "CB-SHOW-DISPLAY-RESULTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_show_when", "CB-LINK-SHOW-WHEN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_index_overlap", "CB-INDEX-OVERLAP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_handle_index_overlap", "CB-HANDLE-INDEX-OVERLAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_index_overlap", "CB-LINK-INDEX-OVERLAP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_owl_import", "CB-LINK-OWL-IMPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_owl_export", "CB-LINK-OWL-EXPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_compose", "CB-LINK-COMPOSE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_navigator", "CB-LINK-NAVIGATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_doc", "CB-LINK-DOC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cyc_server_url", "CYC-SERVER-URL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_kb_monitor_index_hook", "CB-LINK-KB-MONITOR-INDEX-HOOK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_jstack_trace", "CB-JSTACK-TRACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_tools", "cb_link_jstack_trace", "CB-LINK-JSTACK-TRACE", 0, 1, false);
        return (SubLObject)cb_tools.NIL;
    }
    
    public static SubLObject init_cb_tools_file() {
        cb_tools.$cb_tools_split_threshold$ = SubLFiles.defparameter("*CB-TOOLS-SPLIT-THRESHOLD*", (SubLObject)cb_tools.TEN_INTEGER);
        cb_tools.$cb_boolean_globals$ = SubLFiles.deflexical("*CB-BOOLEAN-GLOBALS*", dictionary.new_dictionary((SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED));
        cb_tools.$cb_wff_strictP$ = SubLFiles.defparameter("*CB-WFF-STRICT?*", (SubLObject)cb_tools.NIL);
        cb_tools.$cb_option_section_names$ = SubLFiles.deflexical("*CB-OPTION-SECTION-NAMES*", (SubLObject)cb_tools.$list145);
        cb_tools.$cb_use_css_columns_for_categories$ = SubLFiles.defparameter("*CB-USE-CSS-COLUMNS-FOR-CATEGORIES*", (SubLObject)cb_tools.T);
        cb_tools.$cb_history_max_constants$ = SubLFiles.deflexical("*CB-HISTORY-MAX-CONSTANTS*", (SubLObject)cb_tools.$int434$50);
        cb_tools.$cb_history_max_nats$ = SubLFiles.deflexical("*CB-HISTORY-MAX-NATS*", (SubLObject)cb_tools.$int436$25);
        cb_tools.$cb_history_max_assertions$ = SubLFiles.deflexical("*CB-HISTORY-MAX-ASSERTIONS*", (SubLObject)cb_tools.TEN_INTEGER);
        cb_tools.$cb_bookmarked_items_caching_state$ = SubLFiles.deflexical("*CB-BOOKMARKED-ITEMS-CACHING-STATE*", (SubLObject)cb_tools.NIL);
        cb_tools.$cb_interactor_width$ = SubLFiles.defparameter("*CB-INTERACTOR-WIDTH*", (SubLObject)cb_tools.$int482$80);
        cb_tools.$cb_interactor_height$ = SubLFiles.defparameter("*CB-INTERACTOR-HEIGHT*", (SubLObject)cb_tools.$int436$25);
        cb_tools.$html_state_filename$ = SubLFiles.defparameter("*HTML-STATE-FILENAME*", (SubLObject)cb_tools.NIL);
        cb_tools.$user_preference_file_extension$ = SubLFiles.defparameter("*USER-PREFERENCE-FILE-EXTENSION*", (SubLObject)cb_tools.$str517$pref);
        cb_tools.$user_preference_directory_list$ = SubLFiles.defparameter("*USER-PREFERENCE-DIRECTORY-LIST*", (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str518$preferences, (SubLObject)cb_tools.$str519$users));
        cb_tools.$default_user_preference_filename$ = SubLFiles.defparameter("*DEFAULT-USER-PREFERENCE-FILENAME*", (SubLObject)cb_tools.$str521$default);
        cb_tools.$cb_load_api_input_size$ = SubLFiles.defparameter("*CB-LOAD-API-INPUT-SIZE*", (SubLObject)cb_tools.$int525$70);
        cb_tools.$cb_load_api_skip_input_size$ = SubLFiles.defparameter("*CB-LOAD-API-SKIP-INPUT-SIZE*", (SubLObject)cb_tools.SEVEN_INTEGER);
        cb_tools.$cb_show_list$ = SubLFiles.defparameter("*CB-SHOW-LIST*", (SubLObject)cb_tools.NIL);
        cb_tools.$cb_show_constant_value$ = SubLFiles.defconstant("*CB-SHOW-CONSTANT-VALUE*", (SubLObject)cb_tools.ONE_INTEGER);
        cb_tools.$cb_show_assertion_value$ = SubLFiles.defconstant("*CB-SHOW-ASSERTION-VALUE*", (SubLObject)cb_tools.TWO_INTEGER);
        return (SubLObject)cb_tools.NIL;
    }
    
    public static SubLObject setup_cb_tools_file() {
        Hashtables.sethash((SubLObject)cb_tools.$kw0$CB_TOOLS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str1$cb_tools_html, (SubLObject)cb_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym23$CB_TOOLS, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym33$CB_TOOLS_HANDLER, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw36$TOOLS, (SubLObject)cb_tools.$sym37$CB_LINK_TOOLS, (SubLObject)cb_tools.ONE_INTEGER);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym57$_CB_C_WRAP_ASSERTIONS_, (SubLObject)cb_tools.$list58);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__, (SubLObject)cb_tools.$list60);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym61$_CB_DISPLAY_DATES_AS_STRINGS__, (SubLObject)cb_tools.$list62);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__, (SubLObject)cb_tools.$list64);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__, (SubLObject)cb_tools.$list66);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym67$_CB_WRAP_INTERACTOR_, (SubLObject)cb_tools.$list68);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_, (SubLObject)cb_tools.$list70);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__, (SubLObject)cb_tools.$list72);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym73$_CB_SHOW_CYCLIFY_BUTTON_, (SubLObject)cb_tools.$list74);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym75$_CB_ENABLE_INFERENCE_MONITORING_, (SubLObject)cb_tools.$list76);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym77$_CB_SEPARATE_DOC_FRAME_, (SubLObject)cb_tools.$list78);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_, (SubLObject)cb_tools.$list80);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym81$_CB_FAST__, (SubLObject)cb_tools.$list82);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_, (SubLObject)cb_tools.$list84);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym85$_CB_USE_FRAMES_, (SubLObject)cb_tools.$list86);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym87$_CB_SCRIPT_MODE_, (SubLObject)cb_tools.$list88);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym90$_CB_HOVEROVER_ENABLED_, (SubLObject)cb_tools.$list91);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym92$_CB_A_SHOW_EL_FORMULA_, (SubLObject)cb_tools.$list93);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym94$_CB_A_SHOW_HL_FORMULA_, (SubLObject)cb_tools.$list95);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym96$_CB_A_SHOW_ENGLISH_, (SubLObject)cb_tools.$list97);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_, (SubLObject)cb_tools.$list99);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__, (SubLObject)cb_tools.$list101);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__, (SubLObject)cb_tools.$list103);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym104$_CB_USE_CATEGORIZED_HISTORY__, (SubLObject)cb_tools.$list105);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym106$_CB_HISTORY_SHOW_EL_FORMULAS__, (SubLObject)cb_tools.$list107);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym108$_ASSUME_CYC_CYCLIST_DIALOG__, (SubLObject)cb_tools.$list109);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym110$_GENERATED_PHRASES_BROWSABLE__, (SubLObject)cb_tools.$list111);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__, (SubLObject)cb_tools.$list113);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym114$_SHOW_FET_EDIT_BUTTONS__, (SubLObject)cb_tools.$list115);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__, (SubLObject)cb_tools.$list117);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__, (SubLObject)cb_tools.$list119);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym120$_CB_SHOW_FOLLOWUP_WIDGET_, (SubLObject)cb_tools.$list121);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__, (SubLObject)cb_tools.$list123);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__, (SubLObject)cb_tools.$list125);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__, (SubLObject)cb_tools.$list127);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__, (SubLObject)cb_tools.$list129);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym130$_USE_SME_LEXWIZ_, (SubLObject)cb_tools.$list131);
        Hashtables.sethash((SubLObject)cb_tools.$kw133$CB_OPTIONS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str134$cb_options_html, (SubLObject)cb_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym144$CB_OPTIONS, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        access_macros.register_macro_helper((SubLObject)cb_tools.$sym170$CB_OPTION_WITH_TITLE_ONLY, (SubLObject)cb_tools.$sym170$CB_OPTION_WITH_TITLE_ONLY);
        access_macros.register_macro_helper((SubLObject)cb_tools.$sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER, (SubLObject)cb_tools.$sym176$CB_OPTION_WITH_TITLE);
        declare_cb_boolean_global((SubLObject)cb_tools.$sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__, (SubLObject)cb_tools.$list268);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym315$CB_OPTIONS_HANDLER, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw322$OPTIONS, (SubLObject)cb_tools.$sym323$CB_LINK_OPTIONS, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw322$OPTIONS, (SubLObject)cb_tools.$str320$Preferences, (SubLObject)cb_tools.$str324$Prefs, (SubLObject)cb_tools.$str135$Browser_Preferences);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym333$CB_HISTORY, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_tools.$kw334$CB_HISTORY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str335$cb_history_html, (SubLObject)cb_tools.NIL));
        utilities_macros.register_html_state_variable((SubLObject)cb_tools.$sym342$_CB_USE_CSS_COLUMNS_FOR_CATEGORIES_);
        Hashtables.sethash((SubLObject)cb_tools.$kw344$HISTORY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str394$history_tool_gif, (SubLObject)cb_tools.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw344$HISTORY, (SubLObject)cb_tools.$sym398$CB_LINK_HISTORY, (SubLObject)cb_tools.TWO_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw344$HISTORY, (SubLObject)cb_tools.$str395$History, (SubLObject)cb_tools.$str399$Hist, (SubLObject)cb_tools.$str400$Recent_Browser_History);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym407$CB_CLEAR_HISTORY, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw410$CLEAR_HISTORY, (SubLObject)cb_tools.$sym411$CB_LINK_CLEAR_HISTORY, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw347$CLEAR_CONSTANT_HISTORY, (SubLObject)cb_tools.$sym414$CB_LINK_CLEAR_CONSTANT_HISTORY, (SubLObject)cb_tools.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw367$CLEAR_NAT_HISTORY, (SubLObject)cb_tools.$sym417$CB_LINK_CLEAR_NAT_HISTORY, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw387$CLEAR_ASSERTION_HISTORY, (SubLObject)cb_tools.$sym420$CB_LINK_CLEAR_ASSERTION_HISTORY, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw371$CLEAR_SENTENCE_HISTORY, (SubLObject)cb_tools.$sym423$CB_LINK_CLEAR_SENTENCE_HISTORY, (SubLObject)cb_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym424$CB_HISTORY_EL_FORMULAS, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw341$HISTORY_EL_FORMULAS, (SubLObject)cb_tools.$sym427$CB_LINK_HISTORY_EL_FORMULAS, (SubLObject)cb_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym428$CB_HISTORY_HL_FORMULAS, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw340$HISTORY_HL_FORMULAS, (SubLObject)cb_tools.$sym431$CB_LINK_HISTORY_HL_FORMULAS, (SubLObject)cb_tools.ONE_INTEGER);
        memoization_state.note_globally_cached_function((SubLObject)cb_tools.$sym444$CB_BOOKMARKED_ITEMS);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym460$CB_RECENT_KB_ADDITIONS, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw458$RECENT_KB_ADDITIONS, (SubLObject)cb_tools.$sym463$CB_LINK_RECENT_KB_ADDITIONS, (SubLObject)cb_tools.ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link((SubLObject)cb_tools.$kw458$RECENT_KB_ADDITIONS, (SubLObject)cb_tools.$kw480$TEXT, (SubLObject)cb_tools.$list481, (SubLObject)cb_tools.$str462$cb_recent_kb_additions, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.$kw34$MAIN, (SubLObject)cb_tools.$str456$Recently_Added_KB_Content, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym489$CB_HANDLE_INTERACTOR, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_tools.$kw490$CB_HANDLE_INTERACTOR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str491$cb_handle_interactor_html, (SubLObject)cb_tools.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw506$INTERACTOR, (SubLObject)cb_tools.$sym507$CB_LINK_INTERACTOR, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw506$INTERACTOR, (SubLObject)cb_tools.$str505$Interactor, (SubLObject)cb_tools.$str508$SubL, (SubLObject)cb_tools.$str485$SubL_Interactor);
        utilities_macros.register_html_state_variable((SubLObject)cb_tools.$sym516$_HTML_STATE_FILENAME_);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym524$CB_LOAD_USER_PREFERENCES, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_tools.$kw526$CB_LOAD_API, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str527$cb_load_api_html, (SubLObject)cb_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym536$CB_LOAD_API, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym546$CB_LOAD_API_HANDLER, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_tools.$kw554$CB_SHOW_WHEN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str555$cb_show_when_html, (SubLObject)cb_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym580$CB_SHOW_WHEN, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_tools.$kw581$CB_SHOW_WHEN_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str582$cb_show_when_handler_html, (SubLObject)cb_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym612$CB_SHOW_WHEN_HANDLER, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw619$SHOW_WHEN, (SubLObject)cb_tools.$sym620$CB_LINK_SHOW_WHEN, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw619$SHOW_WHEN, (SubLObject)cb_tools.$str617$When, (SubLObject)cb_tools.$str617$When, (SubLObject)cb_tools.$str621$Display_assertions_constants_by_d);
        Hashtables.sethash((SubLObject)cb_tools.$kw622$CB_INDEX_OVERLAP, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str623$cb_index_overlap_html, (SubLObject)cb_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym631$CB_INDEX_OVERLAP, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym643$CB_HANDLE_INDEX_OVERLAP, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw646$INDEX_OVERLAP, (SubLObject)cb_tools.$sym647$CB_LINK_INDEX_OVERLAP, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw646$INDEX_OVERLAP, (SubLObject)cb_tools.$str644$Overlap, (SubLObject)cb_tools.$str648$Ovlp, (SubLObject)cb_tools.$str649$Term_Index_Overlap);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw652$OWL_IMPORT, (SubLObject)cb_tools.$sym653$CB_LINK_OWL_IMPORT, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw652$OWL_IMPORT, (SubLObject)cb_tools.$str650$OWL_Import, (SubLObject)cb_tools.$str654$OWL_I, (SubLObject)cb_tools.$str655$OWL_Ontology_Importer);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw658$OWL_EXPORT, (SubLObject)cb_tools.$sym659$CB_LINK_OWL_EXPORT, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw658$OWL_EXPORT, (SubLObject)cb_tools.$str656$OWL_Export, (SubLObject)cb_tools.$str660$OWL_E, (SubLObject)cb_tools.$str661$OWL_Ontology_Exporter);
        Hashtables.sethash((SubLObject)cb_tools.$kw662$COMPOSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str663$compose_tool_gif, (SubLObject)cb_tools.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw662$COMPOSE, (SubLObject)cb_tools.$sym666$CB_LINK_COMPOSE, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw662$COMPOSE, (SubLObject)cb_tools.$str667$Compose_KE_Text, (SubLObject)cb_tools.$str668$Comp, (SubLObject)cb_tools.$str667$Compose_KE_Text);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw671$NAVIGATOR, (SubLObject)cb_tools.$sym672$CB_LINK_NAVIGATOR, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw671$NAVIGATOR, (SubLObject)cb_tools.$str669$Navigator, (SubLObject)cb_tools.$str673$Nav, (SubLObject)cb_tools.$str674$Cyc_Navigator);
        Hashtables.sethash((SubLObject)cb_tools.$kw675$DOC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_tools.$str676$doc_tool_gif, (SubLObject)cb_tools.$str677$_Doc_));
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw675$DOC, (SubLObject)cb_tools.$sym679$CB_LINK_DOC, (SubLObject)cb_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_tools.$kw675$DOC, (SubLObject)cb_tools.$str227$Documentation, (SubLObject)cb_tools.$str678$Doc, (SubLObject)cb_tools.$str680$Cyc_Documentation);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw694$KB_MONITOR_INDEX_HOOK, (SubLObject)cb_tools.$sym695$CB_LINK_KB_MONITOR_INDEX_HOOK, (SubLObject)cb_tools.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_tools.$sym697$CB_JSTACK_TRACE, (SubLObject)cb_tools.$kw24$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_tools.$kw700$JSTACK_TRACE, (SubLObject)cb_tools.$sym701$CB_LINK_JSTACK_TRACE, (SubLObject)cb_tools.ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link((SubLObject)cb_tools.$kw700$JSTACK_TRACE, (SubLObject)cb_tools.$kw480$TEXT, (SubLObject)cb_tools.$list702, (SubLObject)cb_tools.$str703$cb_jstack_trace, (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)cb_tools.$kw34$MAIN, (SubLObject)cb_tools.$str704$JRTL_jstack_Trace, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED, (SubLObject)cb_tools.UNPROVIDED);
        return (SubLObject)cb_tools.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_tools_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_tools_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_tools_file();
    }
    
    static {
        me = (SubLFile)new cb_tools();
        cb_tools.$cb_tools_split_threshold$ = null;
        cb_tools.$cb_boolean_globals$ = null;
        cb_tools.$cb_wff_strictP$ = null;
        cb_tools.$cb_option_section_names$ = null;
        cb_tools.$cb_use_css_columns_for_categories$ = null;
        cb_tools.$cb_history_max_constants$ = null;
        cb_tools.$cb_history_max_nats$ = null;
        cb_tools.$cb_history_max_assertions$ = null;
        cb_tools.$cb_bookmarked_items_caching_state$ = null;
        cb_tools.$cb_interactor_width$ = null;
        cb_tools.$cb_interactor_height$ = null;
        cb_tools.$html_state_filename$ = null;
        cb_tools.$user_preference_file_extension$ = null;
        cb_tools.$user_preference_directory_list$ = null;
        cb_tools.$default_user_preference_filename$ = null;
        cb_tools.$cb_load_api_input_size$ = null;
        cb_tools.$cb_load_api_skip_input_size$ = null;
        cb_tools.$cb_show_list$ = null;
        cb_tools.$cb_show_constant_value$ = null;
        cb_tools.$cb_show_assertion_value$ = null;
        $kw0$CB_TOOLS = SubLObjectFactory.makeKeyword("CB-TOOLS");
        $str1$cb_tools_html = SubLObjectFactory.makeString("cb-tools.html");
        $str2$Browser_Tools = SubLObjectFactory.makeString("Browser Tools");
        $str3$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str4$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw5$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw6$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw7$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw8$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str9$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str10$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str11$button = SubLObjectFactory.makeString("button");
        $str12$reload = SubLObjectFactory.makeString("reload");
        $str13$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str14$post = SubLObjectFactory.makeString("post");
        $str15$cb_tools_handler = SubLObjectFactory.makeString("cb-tools-handler");
        $kw16$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str17$Choose_a_tool__or_modify_the_tool = SubLObjectFactory.makeString("Choose a tool, or modify the toolbar.");
        $str18$Current_Values = SubLObjectFactory.makeString("Current Values");
        $str19$Update_Toolbar = SubLObjectFactory.makeString("Update Toolbar");
        $str20$Update___Save = SubLObjectFactory.makeString("Update & Save");
        $str21$save = SubLObjectFactory.makeString("save");
        $str22$Deprecated_Tools = SubLObjectFactory.makeString("Deprecated Tools");
        $sym23$CB_TOOLS = SubLObjectFactory.makeSymbol("CB-TOOLS");
        $kw24$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym25$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym26$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $kw27$TOP = SubLObjectFactory.makeKeyword("TOP");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PRETTY-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ABBREVIATION"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABILITY"));
        $sym29$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str30$Toolbar_Modified = SubLObjectFactory.makeString("Toolbar Modified");
        $str31$Browser_Toolbar_Modified = SubLObjectFactory.makeString("Browser Toolbar Modified");
        $str32$Tools = SubLObjectFactory.makeString("Tools");
        $sym33$CB_TOOLS_HANDLER = SubLObjectFactory.makeSymbol("CB-TOOLS-HANDLER");
        $kw34$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str35$cb_tools = SubLObjectFactory.makeString("cb-tools");
        $kw36$TOOLS = SubLObjectFactory.makeKeyword("TOOLS");
        $sym37$CB_LINK_TOOLS = SubLObjectFactory.makeSymbol("CB-LINK-TOOLS");
        $kw38$TOOLBAR = SubLObjectFactory.makeKeyword("TOOLBAR");
        $kw39$FIELD_NAME = SubLObjectFactory.makeKeyword("FIELD-NAME");
        $kw40$LEGEND_FORM = SubLObjectFactory.makeKeyword("LEGEND-FORM");
        $kw41$CHECK_FN = SubLObjectFactory.makeKeyword("CHECK-FN");
        $kw42$NEW_VALUE_FN = SubLObjectFactory.makeKeyword("NEW-VALUE-FN");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOBAL"));
        $sym44$FIELD_NAME = SubLObjectFactory.makeUninternedSymbol("FIELD-NAME");
        $sym45$LEGEND_FORM = SubLObjectFactory.makeUninternedSymbol("LEGEND-FORM");
        $sym46$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym47$CB_BOOLEAN_OPTION_FIELD_NAME = SubLObjectFactory.makeSymbol("CB-BOOLEAN-OPTION-FIELD-NAME");
        $sym48$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym49$CB_BOOLEAN_OPTION_LEGEND_FORM = SubLObjectFactory.makeSymbol("CB-BOOLEAN-OPTION-LEGEND-FORM");
        $sym50$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym51$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym52$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym53$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym54$CB_CHECKBOX_OPTION = SubLObjectFactory.makeSymbol("CB-CHECKBOX-OPTION");
        $sym55$CB_BOOLEAN_OPTION_CHECK = SubLObjectFactory.makeSymbol("CB-BOOLEAN-OPTION-CHECK");
        $sym56$EVAL = SubLObjectFactory.makeSymbol("EVAL");
        $sym57$_CB_C_WRAP_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*CB-C-WRAP-ASSERTIONS*");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("wrap-assertions"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Wrap Assertions (tries to tidy up assertion displays)")));
        $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("unicode-as-strings"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display Unicode NAUTs as strings (instead of as NAUTs)")));
        $sym61$_CB_DISPLAY_DATES_AS_STRINGS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-DATES-AS-STRINGS?*");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("dates-as-strings"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display dates as DateFromString NAUTs")));
        $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("decimals-as-decimals"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display decimal fractions as decimals")));
        $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fractions-as-fractions"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display fractions as fractions")));
        $sym67$_CB_WRAP_INTERACTOR_ = SubLObjectFactory.makeSymbol("*CB-WRAP-INTERACTOR*");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("wrap-interactor"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Wrap Interactor and Ask input boxes")));
        $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ = SubLObjectFactory.makeSymbol("*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-dynamic-table-for-inference-results"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show Final Inference Answers in Dynamic Table (Recommended: allows sorting)")));
        $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ = SubLObjectFactory.makeSymbol("*CB-SHOW-INFERENCE-RESULTS-IN-NL?*");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-inference-results-in-nl"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show Inference Answers in English")));
        $sym73$_CB_SHOW_CYCLIFY_BUTTON_ = SubLObjectFactory.makeSymbol("*CB-SHOW-CYCLIFY-BUTTON*");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-cyclify-button"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show Cyclify Button in Assertion and Query tools")));
        $sym75$_CB_ENABLE_INFERENCE_MONITORING_ = SubLObjectFactory.makeSymbol("*CB-ENABLE-INFERENCE-MONITORING*");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("enable-inference-monitoring"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Enable inference monitoring")));
        $sym77$_CB_SEPARATE_DOC_FRAME_ = SubLObjectFactory.makeSymbol("*CB-SEPARATE-DOC-FRAME*");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("doc-separate"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show documentation in separate window")));
        $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ = SubLObjectFactory.makeSymbol("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("more-marker-text"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show assertion ball tooltips")));
        $sym81$_CB_FAST__ = SubLObjectFactory.makeSymbol("*CB-FAST?*");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cyc-browser-fast"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Sacrifice some functionality for speed")));
        $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ = SubLObjectFactory.makeSymbol("*CB-SEARCH-AUTOCOMPLETE-ENABLED*");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("search-autocomplete-enabled"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Allow autocomplete in the search box")));
        $sym85$_CB_USE_FRAMES_ = SubLObjectFactory.makeSymbol("*CB-USE-FRAMES*");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-frames"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Use frames (recommended)")));
        $sym87$_CB_SCRIPT_MODE_ = SubLObjectFactory.makeSymbol("*CB-SCRIPT-MODE*");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-javascript"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Use JavaScript (recommended)")), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-USE-JAVASCRIPT?"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-VALUE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-NEW-SCRIPT-MODE"));
        $kw89$JAVASCRIPT = SubLObjectFactory.makeKeyword("JAVASCRIPT");
        $sym90$_CB_HOVEROVER_ENABLED_ = SubLObjectFactory.makeSymbol("*CB-HOVEROVER-ENABLED*");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-hoverover"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Use overLIB hoverover boxes (slow)")));
        $sym92$_CB_A_SHOW_EL_FORMULA_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-EL-FORMULA*");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-el-formula"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show EL formula (slow)")));
        $sym94$_CB_A_SHOW_HL_FORMULA_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-HL-FORMULA*");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-hl-formula"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show HL formula (fast)")));
        $sym96$_CB_A_SHOW_ENGLISH_ = SubLObjectFactory.makeSymbol("*CB-A-SHOW-ENGLISH*");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-english"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show English translation (slow)")));
        $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ = SubLObjectFactory.makeSymbol("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("access-diagnostics"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Always perform access diagnostics (slow)")));
        $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ = SubLObjectFactory.makeSymbol("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("preserve-meta-assertions"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Always preserve meta assertions by default")));
        $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ = SubLObjectFactory.makeSymbol("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("change-all-meta-assertions-mt"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Change Mt of all meta assertions (if all have same Mt as assertion), during change Mt of assertion, by default")));
        $sym104$_CB_USE_CATEGORIZED_HISTORY__ = SubLObjectFactory.makeSymbol("*CB-USE-CATEGORIZED-HISTORY?*");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-categorized-history"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Categorize constant history display?")));
        $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__ = SubLObjectFactory.makeSymbol("*CB-HISTORY-SHOW-EL-FORMULAS?*");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("history-show-el-formulas"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show EL assertion formulas")));
        $sym108$_ASSUME_CYC_CYCLIST_DIALOG__ = SubLObjectFactory.makeSymbol("*ASSUME-CYC-CYCLIST-DIALOG?*");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cyc-cyclist-dialog"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Assume Cyc is addressing the current cyclist")));
        $sym110$_GENERATED_PHRASES_BROWSABLE__ = SubLObjectFactory.makeSymbol("*GENERATED-PHRASES-BROWSABLE?*");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("generated-phrases-browsable"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Make generated phrases browsable?")));
        $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ = SubLObjectFactory.makeSymbol("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("highlight-demerits-in-generated-phrases"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Highlight phrases with demerits?")));
        $sym114$_SHOW_FET_EDIT_BUTTONS__ = SubLObjectFactory.makeSymbol("*SHOW-FET-EDIT-BUTTONS?*");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fet-edit-buttons"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show buttons for editing with FET")));
        $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ = SubLObjectFactory.makeSymbol("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fet-create-instance-buttons"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show buttons for creating instances with FET (semi-experimental)")));
        $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__ = SubLObjectFactory.makeSymbol("*SHOW-FET-CREATE-SPEC-BUTTONS?*");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fet-create-spec-buttons"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show buttons for creating specs with FET (experimental)")));
        $sym120$_CB_SHOW_FOLLOWUP_WIDGET_ = SubLObjectFactory.makeSymbol("*CB-SHOW-FOLLOWUP-WIDGET*");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("followup-widget"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show the Followup Widget (experimental)")));
        $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ = SubLObjectFactory.makeSymbol("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-literal-query-results-one-per-line"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display literal query results one per line")));
        $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__ = SubLObjectFactory.makeSymbol("*CB-SKOLEM-APPLICABLE-RELATIONS?*");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-skolem-applicable-relations"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display skolem functions")));
        $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ = SubLObjectFactory.makeSymbol("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-applicable-relations-one-per-line"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display applicable relations one per line")));
        $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ = SubLObjectFactory.makeSymbol("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-paraphrase-applicable-relations"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Display paraphrases (slow)")));
        $sym130$_USE_SME_LEXWIZ_ = SubLObjectFactory.makeSymbol("*USE-SME-LEXWIZ*");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-use-sme-lexwiz"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Use Dictionary Assistant (not Lexification Assistant)")));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-RESET-INPUT"), (SubLObject)SubLObjectFactory.makeString("Reset Form")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("Submit"), (SubLObject)SubLObjectFactory.makeString("update")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("Submit & Save"), (SubLObject)SubLObjectFactory.makeString("update_and_save")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("Load Saved"), (SubLObject)SubLObjectFactory.makeString("load_saved")));
        $kw133$CB_OPTIONS = SubLObjectFactory.makeKeyword("CB-OPTIONS");
        $str134$cb_options_html = SubLObjectFactory.makeString("cb-options.html");
        $str135$Browser_Preferences = SubLObjectFactory.makeString("Browser Preferences");
        $str136$cb_options_handler = SubLObjectFactory.makeString("cb-options-handler");
        $str137$Reset_Form = SubLObjectFactory.makeString("Reset Form");
        $str138$Submit = SubLObjectFactory.makeString("Submit");
        $str139$update = SubLObjectFactory.makeString("update");
        $str140$Submit___Save = SubLObjectFactory.makeString("Submit & Save");
        $str141$update_and_save = SubLObjectFactory.makeString("update_and_save");
        $str142$Load_Saved = SubLObjectFactory.makeString("Load Saved");
        $str143$load_saved = SubLObjectFactory.makeString("load_saved");
        $sym144$CB_OPTIONS = SubLObjectFactory.makeSymbol("CB-OPTIONS");
        $list145 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GENERAL"), (SubLObject)SubLObjectFactory.makeString("General Options")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TERM-DISPLAY"), (SubLObject)SubLObjectFactory.makeString("Term Display Options")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HISTORY-AND-TOOLS"), (SubLObject)SubLObjectFactory.makeString("History and Browser Tool Options")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NL"), (SubLObject)SubLObjectFactory.makeString("NL Options")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("QUERY-TOOL"), (SubLObject)SubLObjectFactory.makeString("Query Tool")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CZER"), (SubLObject)SubLObjectFactory.makeString("Canonicalizer Options")));
        $str146$Jump_to_Section = SubLObjectFactory.makeString("Jump to Section");
        $list147 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str148$_ = SubLObjectFactory.makeString("#");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym150$NAME = SubLObjectFactory.makeUninternedSymbol("NAME");
        $sym151$ALIST_LOOKUP_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("ALIST-LOOKUP-WITHOUT-VALUES");
        $sym152$_CB_OPTION_SECTION_NAMES_ = SubLObjectFactory.makeSymbol("*CB-OPTION-SECTION-NAMES*");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HR"));
        $sym154$HTML_HEADING = SubLObjectFactory.makeSymbol("HTML-HEADING");
        $list155 = ConsesLow.list((SubLObject)cb_tools.THREE_INTEGER);
        $sym156$HTML_FANCY_DIV = SubLObjectFactory.makeSymbol("HTML-FANCY-DIV");
        $kw157$ID = SubLObjectFactory.makeKeyword("ID");
        $sym158$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $sym159$HTML_FANCY_TABLE = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOFLOW"), (SubLObject)cb_tools.T, (SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLPADDING"), (SubLObject)cb_tools.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLSPACING"), (SubLObject)cb_tools.ZERO_INTEGER);
        $sym161$HTML_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-TABLE-ROW");
        $sym162$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)cb_tools.FOUR_INTEGER));
        $sym164$HTML_FANCY_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("LEFT"), (SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP"));
        $list166 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list167 = ConsesLow.list((SubLObject)cb_tools.FOUR_INTEGER);
        $sym168$HTML_FORMAT = SubLObjectFactory.makeSymbol("HTML-FORMAT");
        $str169$_A__ = SubLObjectFactory.makeString("~A :");
        $sym170$CB_OPTION_WITH_TITLE_ONLY = SubLObjectFactory.makeSymbol("CB-OPTION-WITH-TITLE-ONLY");
        $list171 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym172$HTML_PRINC_STRONG = SubLObjectFactory.makeSymbol("HTML-PRINC-STRONG");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC-STRONG"), (SubLObject)SubLObjectFactory.makeString(" :"));
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"));
        $sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER = SubLObjectFactory.makeSymbol("CB-OPTION-WITH-TITLE-AND-HOVEROVER");
        $sym176$CB_OPTION_WITH_TITLE = SubLObjectFactory.makeSymbol("CB-OPTION-WITH-TITLE");
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("HOVEROVER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym178$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym179$HTML_PRINC_STRONG_WITH_EXPLANATION = SubLObjectFactory.makeSymbol("HTML-PRINC-STRONG-WITH-EXPLANATION");
        $list180 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("HOVEROVER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOVEROVER"));
        $kw182$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw183$HOVEROVER = SubLObjectFactory.makeKeyword("HOVEROVER");
        $list184 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKED?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LEGEND-FORM"));
        $sym185$HTML_CHECKBOX_INPUT = SubLObjectFactory.makeSymbol("HTML-CHECKBOX-INPUT");
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)cb_tools.TWO_INTEGER);
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")));
        $str188$__ = SubLObjectFactory.makeString(" :");
        $str189$Complete = SubLObjectFactory.makeString("Complete");
        $str190$Clear = SubLObjectFactory.makeString("Clear");
        $kw191$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $kw192$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $sym193$_HLMTS_SUPPORTED__ = SubLObjectFactory.makeSymbol("*HLMTS-SUPPORTED?*");
        $str194$Simple_transformations_to_make_co = SubLObjectFactory.makeString("Simple transformations to make complex terms easier to read");
        $str195$NAUT_Readability = SubLObjectFactory.makeString("NAUT Readability");
        $str196$Miscellaneous = SubLObjectFactory.makeString("Miscellaneous");
        $str197$Primary_Presentation_Language = SubLObjectFactory.makeString("Primary Presentation Language");
        $str198$presentation_language = SubLObjectFactory.makeString("presentation-language");
        $str199$_cycl = SubLObjectFactory.makeString(":cycl");
        $kw200$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $str201$CycL__default_ = SubLObjectFactory.makeString("CycL (default)");
        $str202$_nl = SubLObjectFactory.makeString(":nl");
        $kw203$NL = SubLObjectFactory.makeKeyword("NL");
        $str204$Natural_Language__slow_ = SubLObjectFactory.makeString("Natural Language (slow)");
        $str205$Status_Frame_Update = SubLObjectFactory.makeString("Status Frame Update");
        $str206$Update_every_ = SubLObjectFactory.makeString("Update every ");
        $str207$status_interval = SubLObjectFactory.makeString("status-interval");
        $str208$seconds__or_empty_to_disable_ = SubLObjectFactory.makeString("seconds (or empty to disable)");
        $kw209$TERM_DISPLAY = SubLObjectFactory.makeKeyword("TERM-DISPLAY");
        $str210$Default_Index_View = SubLObjectFactory.makeString("Default Index View");
        $str211$index_view = SubLObjectFactory.makeString("index-view");
        $str212$_inferred = SubLObjectFactory.makeString(":inferred");
        $kw213$INFERRED = SubLObjectFactory.makeKeyword("INFERRED");
        $str214$Inferred = SubLObjectFactory.makeString("Inferred");
        $str215$_legacy = SubLObjectFactory.makeString(":legacy");
        $kw216$LEGACY = SubLObjectFactory.makeKeyword("LEGACY");
        $str217$Legacy = SubLObjectFactory.makeString("Legacy");
        $str218$Default_Content = SubLObjectFactory.makeString("Default Content");
        $str219$content = SubLObjectFactory.makeString("content");
        $str220$upper_bound = SubLObjectFactory.makeString("upper-bound");
        $str221$_maximal = SubLObjectFactory.makeString(":maximal");
        $kw222$MAXIMAL = SubLObjectFactory.makeKeyword("MAXIMAL");
        $str223$As_much_as_possible_up_to_ = SubLObjectFactory.makeString("As much as possible up to ");
        $str224$_assertions = SubLObjectFactory.makeString(" assertions");
        $str225$_documentation = SubLObjectFactory.makeString(":documentation");
        $kw226$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $str227$Documentation = SubLObjectFactory.makeString("Documentation");
        $str228$_definitional = SubLObjectFactory.makeString(":definitional");
        $kw229$DEFINITIONAL = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $str230$Definitional_Information = SubLObjectFactory.makeString("Definitional Information");
        $str231$_lexical = SubLObjectFactory.makeString(":lexical");
        $kw232$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $str233$Lexical_Information = SubLObjectFactory.makeString("Lexical Information");
        $str234$Assertion_Formulas = SubLObjectFactory.makeString("Assertion Formulas");
        $str235$formulas_display = SubLObjectFactory.makeString("formulas-display");
        $str236$_hl_formulas = SubLObjectFactory.makeString(":hl-formulas");
        $kw237$HL_FORMULAS = SubLObjectFactory.makeKeyword("HL-FORMULAS");
        $str238$HL_formulas__fast_ = SubLObjectFactory.makeString("HL formulas (fast)");
        $str239$_el_formulas = SubLObjectFactory.makeString(":el-formulas");
        $kw240$EL_FORMULAS = SubLObjectFactory.makeKeyword("EL-FORMULAS");
        $str241$EL_formulas__slow_ = SubLObjectFactory.makeString("EL formulas (slow)");
        $str242$_el_formulas_except_when_browsing = SubLObjectFactory.makeString(":el-formulas-except-when-browsing-skolems");
        $kw243$EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS = SubLObjectFactory.makeKeyword("EL-FORMULAS-EXCEPT-WHEN-BROWSING-SKOLEMS");
        $str244$EL_formulas_except_when_browsing_ = SubLObjectFactory.makeString("EL formulas except when browsing skolems (slow)");
        $str245$Literal_Queries = SubLObjectFactory.makeString("Literal Queries");
        $str246$Applicable_Relations = SubLObjectFactory.makeString("Applicable Relations");
        $str247$Assertion_Display_Options = SubLObjectFactory.makeString("Assertion Display Options");
        $str248$Assertion_Editing_Options = SubLObjectFactory.makeString("Assertion Editing Options");
        $str249$FET_Launching_Buttons = SubLObjectFactory.makeString("FET Launching Buttons");
        $kw250$HISTORY_AND_TOOLS = SubLObjectFactory.makeKeyword("HISTORY-AND-TOOLS");
        $str251$History_Display_Options = SubLObjectFactory.makeString("History Display Options");
        $str252$Display_no_more_than_ = SubLObjectFactory.makeString("Display no more than ");
        $str253$constant_history_max = SubLObjectFactory.makeString("constant-history-max");
        $str254$_constants = SubLObjectFactory.makeString(" constants");
        $str255$constant_history_chronological_ma = SubLObjectFactory.makeString("constant-history-chronological-max");
        $str256$_constants_chronologically = SubLObjectFactory.makeString(" constants chronologically");
        $str257$nat_history_max = SubLObjectFactory.makeString("nat-history-max");
        $str258$_NARTs = SubLObjectFactory.makeString(" NARTs");
        $str259$assertion_history_max = SubLObjectFactory.makeString("assertion-history-max");
        $str260$sentence_history_max = SubLObjectFactory.makeString("sentence-history-max");
        $str261$_sentences = SubLObjectFactory.makeString(" sentences");
        $str262$Browser_Tool_Options = SubLObjectFactory.makeString("Browser Tool Options");
        $str263$Default_Mt = SubLObjectFactory.makeString("Default Mt");
        $str264$default_mt = SubLObjectFactory.makeString("default-mt");
        $const265$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str266$What_microtheory_should_be_used_a = SubLObjectFactory.makeString("What microtheory should be used as a default in forms?");
        $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*");
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("proof-view-bug-report-links"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Show proof-view bug report links?")));
        $str269$NL_Generation = SubLObjectFactory.makeString("NL Generation");
        $str270$Which_mt_should_be_used_for_gener = SubLObjectFactory.makeString("Which mt should be used for generating NL in the Cyc Browser?");
        $str271$Default_NL_Generation_Mt = SubLObjectFactory.makeString("Default NL Generation Mt");
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("pph-mt"));
        $str273$Proof_Views = SubLObjectFactory.makeString("Proof Views");
        $str274$Which_parameters_should_be_used_f = SubLObjectFactory.makeString("Which parameters should be used for proof views generated from the browser?");
        $str275$Default_Parameters = SubLObjectFactory.makeString("Default Parameters");
        $str276$proof_view_params = SubLObjectFactory.makeString("proof-view-params");
        $kw277$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $list278 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultParameterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewGenerator")));
        $list279 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecificationTypeFromParameterTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParameterTypeOfProgramFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewGenerator"))));
        $str280$Lexification = SubLObjectFactory.makeString("Lexification");
        $str281$Reviewer = SubLObjectFactory.makeString("Reviewer");
        $str282$lex_reviewer = SubLObjectFactory.makeString("lex-reviewer");
        $const283$Cyclist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyclist"));
        $str284$Which_Cyclist_is_to_reviewer_your = SubLObjectFactory.makeString("Which Cyclist is to reviewer your lexical assertions? (Blank for none.)");
        $str285$Default_Microtheory = SubLObjectFactory.makeString("Default Microtheory");
        $str286$lex_mt = SubLObjectFactory.makeString("lex-mt");
        $str287$What_microtheory_should_your_lexi = SubLObjectFactory.makeString("What microtheory should your lexical-semantic assertions go in?");
        $str288$Default_Syntactic_Microtheory = SubLObjectFactory.makeString("Default Syntactic Microtheory");
        $str289$lex_syntactic_mt = SubLObjectFactory.makeString("lex-syntactic-mt");
        $str290$What_microtheory_should_your_synt = SubLObjectFactory.makeString("What microtheory should your syntactic assertions (e.g. #$singular) go in?");
        $str291$Default_Paraphrase_Microtheory = SubLObjectFactory.makeString("Default Paraphrase Microtheory");
        $str292$lex_pph_mt = SubLObjectFactory.makeString("lex-pph-mt");
        $str293$What_microtheory_should_your_para = SubLObjectFactory.makeString("What microtheory should your paraphrase assertions go in?");
        $str294$Default_Parse_Template_Microtheor = SubLObjectFactory.makeString("Default Parse Template Microtheory");
        $str295$lex_parse_template_mt = SubLObjectFactory.makeString("lex-parse-template-mt");
        $str296$What_microtheory_should_your_pars = SubLObjectFactory.makeString("What microtheory should your parse template assertions go in?");
        $kw297$QUERY_TOOL = SubLObjectFactory.makeKeyword("QUERY-TOOL");
        $str298$Results_Display = SubLObjectFactory.makeString("Results Display");
        $str299$Automatically_Destroying_Inferenc = SubLObjectFactory.makeString("Automatically Destroying Inferences");
        $str300$destroy_inferences = SubLObjectFactory.makeString("destroy-inferences");
        $str301$entry_destroy_inferences = SubLObjectFactory.makeString("entry-destroy-inferences");
        $str302$Keep_only_last_ = SubLObjectFactory.makeString("Keep only last ");
        $str303$inferences__at_most__defaults_to_ = SubLObjectFactory.makeString("inferences (at most, defaults to 10 if empty)");
        $str304$Keep_all = SubLObjectFactory.makeString("Keep all");
        $str305$Default_Query_Mt = SubLObjectFactory.makeString("Default Query Mt");
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("default-query-mt"));
        $str307$Closed_Queries = SubLObjectFactory.makeString("Closed Queries");
        $str308$perform_argumentation_for_closed_ = SubLObjectFactory.makeString("perform-argumentation-for-closed-query");
        $str309$t = SubLObjectFactory.makeString("t");
        $str310$Gather_and_weigh_both_pro_and_con = SubLObjectFactory.makeString("Gather and weigh both pro and con arguments");
        $str311$nil = SubLObjectFactory.makeString("nil");
        $str312$Attempt_to_prove_only_pro_argumen = SubLObjectFactory.makeString("Attempt to prove only pro arguments");
        $kw313$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $kw314$ASSERTIVE = SubLObjectFactory.makeKeyword("ASSERTIVE");
        $sym315$CB_OPTIONS_HANDLER = SubLObjectFactory.makeSymbol("CB-OPTIONS-HANDLER");
        $str316$Default_NL_Generation_Mt__The_inp = SubLObjectFactory.makeString("Default NL Generation Mt: The input, ~A, was not understood.");
        $str317$DEFAULT = SubLObjectFactory.makeString("DEFAULT");
        $kw318$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $str319$Default_Query_Mt__The_input___A__ = SubLObjectFactory.makeString("Default Query Mt: The input, ~A, was not understood.");
        $str320$Preferences = SubLObjectFactory.makeString("Preferences");
        $str321$cb_options = SubLObjectFactory.makeString("cb-options");
        $kw322$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $sym323$CB_LINK_OPTIONS = SubLObjectFactory.makeSymbol("CB-LINK-OPTIONS");
        $str324$Prefs = SubLObjectFactory.makeString("Prefs");
        $str325$Your_new_settings_require_you_to_ = SubLObjectFactory.makeString("Your new settings require you to restart your browser.");
        $str326$Click_ = SubLObjectFactory.makeString("Click ");
        $kw327$START = SubLObjectFactory.makeKeyword("START");
        $str328$here = SubLObjectFactory.makeString("here");
        $str329$_now_to_do_so_ = SubLObjectFactory.makeString(" now to do so.");
        $str330$KB_Browser_Options_have_been_modi = SubLObjectFactory.makeString("KB Browser Options have been modified");
        $str331$_and_saved = SubLObjectFactory.makeString(" and saved");
        $str332$_ = SubLObjectFactory.makeString(".");
        $sym333$CB_HISTORY = SubLObjectFactory.makeSymbol("CB-HISTORY");
        $kw334$CB_HISTORY = SubLObjectFactory.makeKeyword("CB-HISTORY");
        $str335$cb_history_html = SubLObjectFactory.makeString("cb-history.html");
        $kw336$CATEGORIZED = SubLObjectFactory.makeKeyword("CATEGORIZED");
        $kw337$ALPHABETICAL = SubLObjectFactory.makeKeyword("ALPHABETICAL");
        $str338$categorized = SubLObjectFactory.makeString("categorized");
        $str339$ = SubLObjectFactory.makeString("");
        $kw340$HISTORY_HL_FORMULAS = SubLObjectFactory.makeKeyword("HISTORY-HL-FORMULAS");
        $kw341$HISTORY_EL_FORMULAS = SubLObjectFactory.makeKeyword("HISTORY-EL-FORMULAS");
        $sym342$_CB_USE_CSS_COLUMNS_FOR_CATEGORIES_ = SubLObjectFactory.makeSymbol("*CB-USE-CSS-COLUMNS-FOR-CATEGORIES*");
        $str343$Recent_Constants__ = SubLObjectFactory.makeString("Recent Constants :");
        $kw344$HISTORY = SubLObjectFactory.makeKeyword("HISTORY");
        $str345$_Show_Alphabetical_ = SubLObjectFactory.makeString("[Show Alphabetical]");
        $str346$_Show_Categorized_ = SubLObjectFactory.makeString("[Show Categorized]");
        $kw347$CLEAR_CONSTANT_HISTORY = SubLObjectFactory.makeKeyword("CLEAR-CONSTANT-HISTORY");
        $sym348$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str349$history_constants_columnar = SubLObjectFactory.makeString("history-constants columnar");
        $str350$history_constant = SubLObjectFactory.makeString("history-constant");
        $str351$None = SubLObjectFactory.makeString("None");
        $sym352$ISA_COLLECTION_ = SubLObjectFactory.makeSymbol("ISA-COLLECTION?");
        $sym353$ISA_RELATION_ = SubLObjectFactory.makeSymbol("ISA-RELATION?");
        $sym354$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str355$history_table = SubLObjectFactory.makeString("history-table");
        $str356$history_categorized_column = SubLObjectFactory.makeString("history-categorized-column");
        $str357$history_table_heading = SubLObjectFactory.makeString("history-table-heading");
        $str358$Most_nbsp_Recent = SubLObjectFactory.makeString("Most&nbsp;Recent");
        $str359$Collections = SubLObjectFactory.makeString("Collections");
        $str360$Individuals = SubLObjectFactory.makeString("Individuals");
        $str361$Relations = SubLObjectFactory.makeString("Relations");
        $str362$columns__4__column_count__4____we = SubLObjectFactory.makeString("columns: 4; column-count: 4;  -webkit-columns: 4; -moz-columns:4;");
        $str363$display_block__break_after__colum = SubLObjectFactory.makeString("display:block; break-after: column; -webkit-column-break-after: always; overflow:hidden");
        $str364$display__block__break_after__colu = SubLObjectFactory.makeString("display: block; break-after: column; -webkit-column-break-after: always; overflow:hidden");
        $str365$display__block__break_after__colu = SubLObjectFactory.makeString("display: block; break-after: column; break-before: column; break-before: column; -webkit-column-break-after: always; overflow:hidden");
        $str366$Recent_NATs__ = SubLObjectFactory.makeString("Recent NATs :");
        $kw367$CLEAR_NAT_HISTORY = SubLObjectFactory.makeKeyword("CLEAR-NAT-HISTORY");
        $str368$history_nats_columnar = SubLObjectFactory.makeString("history-nats columnar");
        $str369$history_nat = SubLObjectFactory.makeString("history-nat");
        $str370$Recent_Sentences__ = SubLObjectFactory.makeString("Recent Sentences :");
        $kw371$CLEAR_SENTENCE_HISTORY = SubLObjectFactory.makeKeyword("CLEAR-SENTENCE-HISTORY");
        $str372$cyclistReadilyAvailableTerms = SubLObjectFactory.makeString("cyclistReadilyAvailableTerms");
        $sym373$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $str374$font_size__larger__font_weight_bo = SubLObjectFactory.makeString("font-size: larger; font-weight:bold");
        $str375$To_remove_a_bookmark__follow_the_ = SubLObjectFactory.makeString("To remove a bookmark, follow the link to the bookmarked item and click on the star.");
        $str376$Bookmarked_Constants__ = SubLObjectFactory.makeString("Bookmarked Constants :");
        $str377$bookmarked_constants_columnar = SubLObjectFactory.makeString("bookmarked-constants columnar");
        $str378$bookmarked_constant = SubLObjectFactory.makeString("bookmarked-constant");
        $sym379$CYCL_NAT_P = SubLObjectFactory.makeSymbol("CYCL-NAT-P");
        $str380$Bookmarked_NATs__ = SubLObjectFactory.makeString("Bookmarked NATs :");
        $str381$bookmarked_nats_columnar = SubLObjectFactory.makeString("bookmarked-nats columnar");
        $str382$bookmarked_nat = SubLObjectFactory.makeString("bookmarked-nat");
        $str383$Bookmarked_Assertions__ = SubLObjectFactory.makeString("Bookmarked Assertions :");
        $str384$bookmarked_asserts_columnar = SubLObjectFactory.makeString("bookmarked-asserts columnar");
        $str385$bookmarked_assert = SubLObjectFactory.makeString("bookmarked-assert");
        $str386$Recent_Assertions__ = SubLObjectFactory.makeString("Recent Assertions :");
        $kw387$CLEAR_ASSERTION_HISTORY = SubLObjectFactory.makeKeyword("CLEAR-ASSERTION-HISTORY");
        $sym388$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");
        $sym389$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");
        $sym390$CB_ASSERTION_LINK_WITH_MT = SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK-WITH-MT");
        $sym391$CB_ASSERTION_LINK = SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK");
        $kw392$HTML = SubLObjectFactory.makeKeyword("HTML");
        $kw393$NEW = SubLObjectFactory.makeKeyword("NEW");
        $str394$history_tool_gif = SubLObjectFactory.makeString("history-tool.gif");
        $str395$History = SubLObjectFactory.makeString("History");
        $str396$cb_history_categorized = SubLObjectFactory.makeString("cb-history&categorized");
        $str397$cb_history_alphabetical = SubLObjectFactory.makeString("cb-history&alphabetical");
        $sym398$CB_LINK_HISTORY = SubLObjectFactory.makeSymbol("CB-LINK-HISTORY");
        $str399$Hist = SubLObjectFactory.makeString("Hist");
        $str400$Recent_Browser_History = SubLObjectFactory.makeString("Recent Browser History");
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUP"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"));
        $kw402$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw403$NAT = SubLObjectFactory.makeKeyword("NAT");
        $kw404$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw405$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw406$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym407$CB_CLEAR_HISTORY = SubLObjectFactory.makeSymbol("CB-CLEAR-HISTORY");
        $str408$_Clear_History_ = SubLObjectFactory.makeString("[Clear History]");
        $str409$cb_clear_history_ALL = SubLObjectFactory.makeString("cb-clear-history&ALL");
        $kw410$CLEAR_HISTORY = SubLObjectFactory.makeKeyword("CLEAR-HISTORY");
        $sym411$CB_LINK_CLEAR_HISTORY = SubLObjectFactory.makeSymbol("CB-LINK-CLEAR-HISTORY");
        $str412$_Clear_Constant_History_ = SubLObjectFactory.makeString("[Clear Constant History]");
        $str413$cb_clear_history_CONSTANT__A = SubLObjectFactory.makeString("cb-clear-history&CONSTANT&~A");
        $sym414$CB_LINK_CLEAR_CONSTANT_HISTORY = SubLObjectFactory.makeSymbol("CB-LINK-CLEAR-CONSTANT-HISTORY");
        $str415$_Clear_NAT_History_ = SubLObjectFactory.makeString("[Clear NAT History]");
        $str416$cb_clear_history_NAT = SubLObjectFactory.makeString("cb-clear-history&NAT");
        $sym417$CB_LINK_CLEAR_NAT_HISTORY = SubLObjectFactory.makeSymbol("CB-LINK-CLEAR-NAT-HISTORY");
        $str418$_Clear_Assertion_History_ = SubLObjectFactory.makeString("[Clear Assertion History]");
        $str419$cb_clear_history_ASSERTION = SubLObjectFactory.makeString("cb-clear-history&ASSERTION");
        $sym420$CB_LINK_CLEAR_ASSERTION_HISTORY = SubLObjectFactory.makeSymbol("CB-LINK-CLEAR-ASSERTION-HISTORY");
        $str421$_Clear_Sentence_History_ = SubLObjectFactory.makeString("[Clear Sentence History]");
        $str422$cb_clear_history_SENTENCE = SubLObjectFactory.makeString("cb-clear-history&SENTENCE");
        $sym423$CB_LINK_CLEAR_SENTENCE_HISTORY = SubLObjectFactory.makeSymbol("CB-LINK-CLEAR-SENTENCE-HISTORY");
        $sym424$CB_HISTORY_EL_FORMULAS = SubLObjectFactory.makeSymbol("CB-HISTORY-EL-FORMULAS");
        $str425$_EL_Formulas_ = SubLObjectFactory.makeString("[EL Formulas]");
        $str426$cb_history_el_formulas = SubLObjectFactory.makeString("cb-history-el-formulas");
        $sym427$CB_LINK_HISTORY_EL_FORMULAS = SubLObjectFactory.makeSymbol("CB-LINK-HISTORY-EL-FORMULAS");
        $sym428$CB_HISTORY_HL_FORMULAS = SubLObjectFactory.makeSymbol("CB-HISTORY-HL-FORMULAS");
        $str429$_HL_Formulas_ = SubLObjectFactory.makeString("[HL Formulas]");
        $str430$cb_history_hl_formulas = SubLObjectFactory.makeString("cb-history-hl-formulas");
        $sym431$CB_LINK_HISTORY_HL_FORMULAS = SubLObjectFactory.makeSymbol("CB-LINK-HISTORY-HL-FORMULAS");
        $sym432$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str433$Unable_to_add__S_to_history = SubLObjectFactory.makeString("Unable to add ~S to history");
        $int434$50 = SubLObjectFactory.makeInteger(50);
        $sym435$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $int436$25 = SubLObjectFactory.makeInteger(25);
        $sym437$CB_VALID_NAT_P = SubLObjectFactory.makeSymbol("CB-VALID-NAT-P");
        $sym438$TREE_FIND = SubLObjectFactory.makeSymbol("TREE-FIND");
        $sym439$TERM_OF_UNIT = SubLObjectFactory.makeSymbol("TERM-OF-UNIT");
        $sym440$FIND = SubLObjectFactory.makeSymbol("FIND");
        $sym441$EXPRESSION_FORTS_WITH_HL = SubLObjectFactory.makeSymbol("EXPRESSION-FORTS-WITH-HL");
        $sym442$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $sym443$EXPRESSION_FORTS = SubLObjectFactory.makeSymbol("EXPRESSION-FORTS");
        $sym444$CB_BOOKMARKED_ITEMS = SubLObjectFactory.makeSymbol("CB-BOOKMARKED-ITEMS");
        $sym445$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const446$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $const447$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $const448$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
        $list449 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")));
        $sym450$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const451$cyclistReadilyAvailableTerms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistReadilyAvailableTerms"));
        $sym452$NAME_FOR_ALPHA_SORT = SubLObjectFactory.makeSymbol("NAME-FOR-ALPHA-SORT");
        $sym453$_CB_BOOKMARKED_ITEMS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CB-BOOKMARKED-ITEMS-CACHING-STATE*");
        $sym454$CLEAR_CB_BOOKMARKED_ITEMS = SubLObjectFactory.makeSymbol("CLEAR-CB-BOOKMARKED-ITEMS");
        $str455$_ = SubLObjectFactory.makeString("~");
        $str456$Recently_Added_KB_Content = SubLObjectFactory.makeString("Recently Added KB Content");
        $str457$float__right = SubLObjectFactory.makeString("float: right");
        $kw458$RECENT_KB_ADDITIONS = SubLObjectFactory.makeKeyword("RECENT-KB-ADDITIONS");
        $str459$_Refresh_Page_ = SubLObjectFactory.makeString("[Refresh Page]");
        $sym460$CB_RECENT_KB_ADDITIONS = SubLObjectFactory.makeSymbol("CB-RECENT-KB-ADDITIONS");
        $str461$_Recently_Added_KB_Content = SubLObjectFactory.makeString("[Recently Added KB Content");
        $str462$cb_recent_kb_additions = SubLObjectFactory.makeString("cb-recent-kb-additions");
        $sym463$CB_LINK_RECENT_KB_ADDITIONS = SubLObjectFactory.makeSymbol("CB-LINK-RECENT-KB-ADDITIONS");
        $list464 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)SubLObjectFactory.makeKeyword("KB-HL-SUPPORT"));
        $str465$Recent_constants_ = SubLObjectFactory.makeString("Recent constants:");
        $str466$mapping_constants_for_sweep = SubLObjectFactory.makeString("mapping constants for sweep");
        $str467$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw468$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw469$NART = SubLObjectFactory.makeKeyword("NART");
        $str470$Recent_NARTs_ = SubLObjectFactory.makeString("Recent NARTs:");
        $str471$mapping_narts_for_sweep = SubLObjectFactory.makeString("mapping narts for sweep");
        $str472$Recent_assertions_ = SubLObjectFactory.makeString("Recent assertions:");
        $str473$mapping_assertions_for_sweep = SubLObjectFactory.makeString("mapping assertions for sweep");
        $kw474$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $str475$Recent_deductions_ = SubLObjectFactory.makeString("Recent deductions:");
        $str476$mapping_deductions_for_sweep = SubLObjectFactory.makeString("mapping deductions for sweep");
        $kw477$KB_HL_SUPPORTS = SubLObjectFactory.makeKeyword("KB-HL-SUPPORTS");
        $str478$Recent_KB_HL_supports_ = SubLObjectFactory.makeString("Recent KB HL supports:");
        $str479$mapping_kb_hl_supports_for_sweep = SubLObjectFactory.makeString("mapping kb-hl-supports for sweep");
        $kw480$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list481 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"));
        $int482$80 = SubLObjectFactory.makeInteger(80);
        $str483$the_SubLisp_Interactor = SubLObjectFactory.makeString("the SubLisp Interactor");
        $str484$interactor = SubLObjectFactory.makeString("interactor");
        $str485$SubL_Interactor = SubLObjectFactory.makeString("SubL Interactor");
        $str486$cb_handle_interactor = SubLObjectFactory.makeString("cb-handle-interactor");
        $str487$document = SubLObjectFactory.makeString("document");
        $str488$input_string = SubLObjectFactory.makeString("input-string");
        $sym489$CB_HANDLE_INTERACTOR = SubLObjectFactory.makeSymbol("CB-HANDLE-INTERACTOR");
        $kw490$CB_HANDLE_INTERACTOR = SubLObjectFactory.makeKeyword("CB-HANDLE-INTERACTOR");
        $str491$cb_handle_interactor_html = SubLObjectFactory.makeString("cb-handle-interactor.html");
        $kw492$HTML_EDITOR_SCRIPTS = SubLObjectFactory.makeKeyword("HTML-EDITOR-SCRIPTS");
        $str493$Eval = SubLObjectFactory.makeString("Eval");
        $str494$Enter_A_Form__ = SubLObjectFactory.makeString("Enter A Form :");
        $str495$Reset = SubLObjectFactory.makeString("Reset");
        $str496$Cyclify = SubLObjectFactory.makeString("Cyclify");
        $kw497$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw498$RED = SubLObjectFactory.makeKeyword("RED");
        $str499$Malformed_expression___ = SubLObjectFactory.makeString("Malformed expression : ");
        $str500$Last_Form_Evaluated___ = SubLObjectFactory.makeString("Last Form Evaluated : ");
        $str501$Results___ = SubLObjectFactory.makeString("Results : ");
        $sym502$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym503$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $str504$ERROR___ = SubLObjectFactory.makeString("ERROR : ");
        $str505$Interactor = SubLObjectFactory.makeString("Interactor");
        $kw506$INTERACTOR = SubLObjectFactory.makeKeyword("INTERACTOR");
        $sym507$CB_LINK_INTERACTOR = SubLObjectFactory.makeSymbol("CB-LINK-INTERACTOR");
        $str508$SubL = SubLObjectFactory.makeString("SubL");
        $str509$_ = SubLObjectFactory.makeString("(");
        $str510$_ = SubLObjectFactory.makeString(" ");
        $str511$_ = SubLObjectFactory.makeString(")");
        $sym512$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
        $str513$__ = SubLObjectFactory.makeString("#'");
        $str514$_ = SubLObjectFactory.makeString("'");
        $str515$___ = SubLObjectFactory.makeString(" . ");
        $sym516$_HTML_STATE_FILENAME_ = SubLObjectFactory.makeSymbol("*HTML-STATE-FILENAME*");
        $str517$pref = SubLObjectFactory.makeString("pref");
        $str518$preferences = SubLObjectFactory.makeString("preferences");
        $str519$users = SubLObjectFactory.makeString("users");
        $str520$Save_Interface = SubLObjectFactory.makeString("Save Interface");
        $str521$default = SubLObjectFactory.makeString("default");
        $str522$Interface_Settings_Loaded_Success = SubLObjectFactory.makeString("Interface Settings Loaded Successfully.");
        $str523$No_Interface_Settings_File_To_Loa = SubLObjectFactory.makeString("No Interface Settings File To Load.");
        $sym524$CB_LOAD_USER_PREFERENCES = SubLObjectFactory.makeSymbol("CB-LOAD-USER-PREFERENCES");
        $int525$70 = SubLObjectFactory.makeInteger(70);
        $kw526$CB_LOAD_API = SubLObjectFactory.makeKeyword("CB-LOAD-API");
        $str527$cb_load_api_html = SubLObjectFactory.makeString("cb-load-api.html");
        $str528$the_KE_Load_Page = SubLObjectFactory.makeString("the KE Load Page");
        $str529$Load_API_Expressions_Page = SubLObjectFactory.makeString("Load API Expressions Page");
        $str530$cb_load_api_handler = SubLObjectFactory.makeString("cb-load-api-handler");
        $str531$Please_type_in_the_name_of_the_fi = SubLObjectFactory.makeString("Please type in the name of the file to load and evaluate in the space below and hit the ");
        $str532$_Load_File__ = SubLObjectFactory.makeString("[Load File] ");
        $str533$button_ = SubLObjectFactory.makeString("button.");
        $str534$load_api_file_name = SubLObjectFactory.makeString("load-api-file-name");
        $str535$Load_File = SubLObjectFactory.makeString("Load File");
        $sym536$CB_LOAD_API = SubLObjectFactory.makeSymbol("CB-LOAD-API");
        $str537$cb_load_api_handler_called_with_n = SubLObjectFactory.makeString("cb-load-api-handler called with no arguments");
        $str538$Load_API_Expressions_Results = SubLObjectFactory.makeString("Load API Expressions Results");
        $str539$load_api_file_skip = SubLObjectFactory.makeString("load-api-file-skip");
        $str540$The_file__ = SubLObjectFactory.makeString("The file '");
        $str541$__was_loaded___Here_are_the_resul = SubLObjectFactory.makeString("' was loaded.  Here are the results:");
        $kw542$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str543$Successfully_and_completely_loade = SubLObjectFactory.makeString("Successfully and completely loaded!");
        $str544$File__s_does_not_exist_ = SubLObjectFactory.makeString("File ~s does not exist!");
        $str545$KE_filename_was_not_a_string_ = SubLObjectFactory.makeString("KE filename was not a string.");
        $sym546$CB_LOAD_API_HANDLER = SubLObjectFactory.makeSymbol("CB-LOAD-API-HANDLER");
        $kw547$FILE_NOT_FOUND = SubLObjectFactory.makeKeyword("FILE-NOT-FOUND");
        $str548$An_error_occurred_after_processin = SubLObjectFactory.makeString("An error occurred after processing ");
        $str549$_forms_ = SubLObjectFactory.makeString(" forms.");
        $str550$Form_Number = SubLObjectFactory.makeString("Form Number");
        $str551$You_may_continue_processing_this_ = SubLObjectFactory.makeString("You may continue processing this file.  Enter the number of the form to start (so you may skip the already processed forms or forms that have errors in them).");
        $str552$KE_File_Name = SubLObjectFactory.makeString("KE File Name");
        $str553$You_may_also_specify_a_new_file_t = SubLObjectFactory.makeString("You may also specify a new file to load.  If you change this file, make sure to change the number of forms to skip (above) to 0 to start processing the new form from the beginning.");
        $kw554$CB_SHOW_WHEN = SubLObjectFactory.makeKeyword("CB-SHOW-WHEN");
        $str555$cb_show_when_html = SubLObjectFactory.makeString("cb-show-when.html");
        $str556$the_Display_by_Date = SubLObjectFactory.makeString("the Display by Date");
        $str557$Display_by_Date = SubLObjectFactory.makeString("Display by Date");
        $str558$cb_show_when_handler = SubLObjectFactory.makeString("cb-show-when-handler");
        $str559$What_kind_of_data_do_you_want_to_ = SubLObjectFactory.makeString("What kind of data do you want to display?");
        $str560$cb_show_type = SubLObjectFactory.makeString("cb-show-type");
        $str561$Constants = SubLObjectFactory.makeString("Constants");
        $str562$Assertions = SubLObjectFactory.makeString("Assertions");
        $str563$Enter_in_the_start_date_ = SubLObjectFactory.makeString("Enter in the start date:");
        $str564$Month = SubLObjectFactory.makeString("Month");
        $str565$cb_show_start_month = SubLObjectFactory.makeString("cb-show-start-month");
        $str566$Day = SubLObjectFactory.makeString("Day");
        $str567$cb_show_start_day = SubLObjectFactory.makeString("cb-show-start-day");
        $str568$Year = SubLObjectFactory.makeString("Year");
        $str569$cb_show_start_year = SubLObjectFactory.makeString("cb-show-start-year");
        $str570$Enter_in_the_ending_date_ = SubLObjectFactory.makeString("Enter in the ending date:");
        $str571$cb_show_end_month = SubLObjectFactory.makeString("cb-show-end-month");
        $str572$cb_show_end_day = SubLObjectFactory.makeString("cb-show-end-day");
        $str573$cb_show_end_year = SubLObjectFactory.makeString("cb-show-end-year");
        $str574$Enter_the_cyclist_to_examine__bla = SubLObjectFactory.makeString("Enter the cyclist to examine (blank indicates to examine ALL cyclists):");
        $str575$cb_show_cyclist = SubLObjectFactory.makeString("cb-show-cyclist");
        $int576$24 = SubLObjectFactory.makeInteger(24);
        $str577$Enter_the_project_to_examine__bla = SubLObjectFactory.makeString("Enter the project to examine (blank indicates to examine ALL projects):");
        $str578$cb_show_project = SubLObjectFactory.makeString("cb-show-project");
        $const579$Cyc_BasedProject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $sym580$CB_SHOW_WHEN = SubLObjectFactory.makeSymbol("CB-SHOW-WHEN");
        $kw581$CB_SHOW_WHEN_HANDLER = SubLObjectFactory.makeKeyword("CB-SHOW-WHEN-HANDLER");
        $str582$cb_show_when_handler_html = SubLObjectFactory.makeString("cb-show-when-handler.html");
        $str583$Please_specify_either_a_Constant_ = SubLObjectFactory.makeString("Please specify either a Constant or an Assertion search.");
        $str584$Unknown_cyclist___S = SubLObjectFactory.makeString("Unknown cyclist: ~S");
        $str585$Unknown_project___S = SubLObjectFactory.makeString("Unknown project: ~S");
        $str586$Date_Search_Results = SubLObjectFactory.makeString("Date Search Results");
        $str587$Listing_ = SubLObjectFactory.makeString("Listing ");
        $str588$constants = SubLObjectFactory.makeString("constants");
        $str589$assertions = SubLObjectFactory.makeString("assertions");
        $str590$_created_from_ = SubLObjectFactory.makeString(" created from ");
        $str591$_to_ = SubLObjectFactory.makeString(" to ");
        $str592$_by_ = SubLObjectFactory.makeString(" by ");
        $str593$_for_ = SubLObjectFactory.makeString(" for ");
        $sym594$CONSTANTS_FOR_PROJECTS_BETWEEN = SubLObjectFactory.makeSymbol("CONSTANTS-FOR-PROJECTS-BETWEEN");
        $sym595$CONSTANTS_CREATED_BETWEEN = SubLObjectFactory.makeSymbol("CONSTANTS-CREATED-BETWEEN");
        $sym596$ASSERTIONS_FOR_PROJECTS_BETWEEN = SubLObjectFactory.makeSymbol("ASSERTIONS-FOR-PROJECTS-BETWEEN");
        $sym597$ASSERTIONS_BETWEEN = SubLObjectFactory.makeSymbol("ASSERTIONS-BETWEEN");
        $sym598$_CONSTANT = SubLObjectFactory.makeSymbol("?CONSTANT");
        $sym599$_ASSERTION = SubLObjectFactory.makeSymbol("?ASSERTION");
        $const600$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym601$_TERM_LIST = SubLObjectFactory.makeSymbol("?TERM-LIST");
        $const602$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const603$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $const604$EvaluateSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluateSubLFn"));
        $const605$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $const606$memberOfList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $list607 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST")));
        $const608$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list609 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)cb_tools.T, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $kw610$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $str611$Expected_When_Tool_inference_halt = SubLObjectFactory.makeString("Expected When Tool inference halt reason to be :EXHAUST-TOTAL, but it was ~s");
        $sym612$CB_SHOW_WHEN_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOW-WHEN-HANDLER");
        $str613$None_for_the_given_time_period_ = SubLObjectFactory.makeString("None for the given time period.");
        $str614$_a__a___ = SubLObjectFactory.makeString("~a ~a.~%");
        $kw615$SAVE_INFERENCE_ANSWERS = SubLObjectFactory.makeKeyword("SAVE-INFERENCE-ANSWERS");
        $str616$_in_ = SubLObjectFactory.makeString(" in ");
        $str617$When = SubLObjectFactory.makeString("When");
        $str618$cb_show_when = SubLObjectFactory.makeString("cb-show-when");
        $kw619$SHOW_WHEN = SubLObjectFactory.makeKeyword("SHOW-WHEN");
        $sym620$CB_LINK_SHOW_WHEN = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-WHEN");
        $str621$Display_assertions_constants_by_d = SubLObjectFactory.makeString("Display assertions/constants by date");
        $kw622$CB_INDEX_OVERLAP = SubLObjectFactory.makeKeyword("CB-INDEX-OVERLAP");
        $str623$cb_index_overlap_html = SubLObjectFactory.makeString("cb-index-overlap.html");
        $str624$Index_Overlap = SubLObjectFactory.makeString("Index Overlap");
        $str625$cb_handle_index_overlap = SubLObjectFactory.makeString("cb-handle-index-overlap");
        $str626$Search = SubLObjectFactory.makeString("Search");
        $str627$Enter_required_terms_separated_by = SubLObjectFactory.makeString("Enter required terms separated by whitespace : ");
        $str628$terms = SubLObjectFactory.makeString("terms");
        $str629$Enter_terms_to_exclude_separated_ = SubLObjectFactory.makeString("Enter terms to exclude separated by whitespace : ");
        $str630$exclude_terms = SubLObjectFactory.makeString("exclude-terms");
        $sym631$CB_INDEX_OVERLAP = SubLObjectFactory.makeSymbol("CB-INDEX-OVERLAP");
        $str632$Error_reading_terms___Check_for_t = SubLObjectFactory.makeString("Error reading terms.  Check for typos.");
        $str633$Error_reading_exclude_terms___Che = SubLObjectFactory.makeString("Error reading exclude terms.  Check for typos.");
        $str634$Index_Overlap_Results = SubLObjectFactory.makeString("Index Overlap Results");
        $str635$Search_Terms__ = SubLObjectFactory.makeString("Search Terms: ");
        $str636$Please_enter_some_valid_search_te = SubLObjectFactory.makeString("Please enter some valid search terms.");
        $str637$Excluded_Terms__ = SubLObjectFactory.makeString("Excluded Terms: ");
        $str638$Please_enter_more_than_1_search_t = SubLObjectFactory.makeString("Please enter more than 1 search term.");
        $sym639$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const640$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str641$Index_Overlap___ = SubLObjectFactory.makeString("Index Overlap: (");
        $str642$_assertions_found_ = SubLObjectFactory.makeString(" assertions found)");
        $sym643$CB_HANDLE_INDEX_OVERLAP = SubLObjectFactory.makeSymbol("CB-HANDLE-INDEX-OVERLAP");
        $str644$Overlap = SubLObjectFactory.makeString("Overlap");
        $str645$cb_index_overlap = SubLObjectFactory.makeString("cb-index-overlap");
        $kw646$INDEX_OVERLAP = SubLObjectFactory.makeKeyword("INDEX-OVERLAP");
        $sym647$CB_LINK_INDEX_OVERLAP = SubLObjectFactory.makeSymbol("CB-LINK-INDEX-OVERLAP");
        $str648$Ovlp = SubLObjectFactory.makeString("Ovlp");
        $str649$Term_Index_Overlap = SubLObjectFactory.makeString("Term Index Overlap");
        $str650$OWL_Import = SubLObjectFactory.makeString("OWL Import");
        $str651$cb_owl_import = SubLObjectFactory.makeString("cb-owl-import");
        $kw652$OWL_IMPORT = SubLObjectFactory.makeKeyword("OWL-IMPORT");
        $sym653$CB_LINK_OWL_IMPORT = SubLObjectFactory.makeSymbol("CB-LINK-OWL-IMPORT");
        $str654$OWL_I = SubLObjectFactory.makeString("OWL-I");
        $str655$OWL_Ontology_Importer = SubLObjectFactory.makeString("OWL Ontology Importer");
        $str656$OWL_Export = SubLObjectFactory.makeString("OWL Export");
        $str657$cb_owl_export = SubLObjectFactory.makeString("cb-owl-export");
        $kw658$OWL_EXPORT = SubLObjectFactory.makeKeyword("OWL-EXPORT");
        $sym659$CB_LINK_OWL_EXPORT = SubLObjectFactory.makeSymbol("CB-LINK-OWL-EXPORT");
        $str660$OWL_E = SubLObjectFactory.makeString("OWL-E");
        $str661$OWL_Ontology_Exporter = SubLObjectFactory.makeString("OWL Ontology Exporter");
        $kw662$COMPOSE = SubLObjectFactory.makeKeyword("COMPOSE");
        $str663$compose_tool_gif = SubLObjectFactory.makeString("compose-tool.gif");
        $str664$Compose = SubLObjectFactory.makeString("Compose");
        $str665$ke_compose = SubLObjectFactory.makeString("ke-compose");
        $sym666$CB_LINK_COMPOSE = SubLObjectFactory.makeSymbol("CB-LINK-COMPOSE");
        $str667$Compose_KE_Text = SubLObjectFactory.makeString("Compose KE Text");
        $str668$Comp = SubLObjectFactory.makeString("Comp");
        $str669$Navigator = SubLObjectFactory.makeString("Navigator");
        $str670$cyc_navigator = SubLObjectFactory.makeString("cyc-navigator");
        $kw671$NAVIGATOR = SubLObjectFactory.makeKeyword("NAVIGATOR");
        $sym672$CB_LINK_NAVIGATOR = SubLObjectFactory.makeSymbol("CB-LINK-NAVIGATOR");
        $str673$Nav = SubLObjectFactory.makeString("Nav");
        $str674$Cyc_Navigator = SubLObjectFactory.makeString("Cyc Navigator");
        $kw675$DOC = SubLObjectFactory.makeKeyword("DOC");
        $str676$doc_tool_gif = SubLObjectFactory.makeString("doc-tool.gif");
        $str677$_Doc_ = SubLObjectFactory.makeString("[Doc]");
        $str678$Doc = SubLObjectFactory.makeString("Doc");
        $sym679$CB_LINK_DOC = SubLObjectFactory.makeSymbol("CB-LINK-DOC");
        $str680$Cyc_Documentation = SubLObjectFactory.makeString("Cyc Documentation");
        $str681$cb_start = SubLObjectFactory.makeString("cb-start");
        $str682$http___ = SubLObjectFactory.makeString("http://");
        $str683$_ = SubLObjectFactory.makeString(":");
        $int684$3602 = SubLObjectFactory.makeInteger(3602);
        $str685$_cyccgi = SubLObjectFactory.makeString("/cyccgi");
        $str686$_localhost = SubLObjectFactory.makeString("/localhost");
        $str687$_Monitor_ = SubLObjectFactory.makeString("[Monitor]");
        $str688$_kbmonitor_makequery_jsp_kbq_stri = SubLObjectFactory.makeString("/kbmonitor/makequery.jsp?kbq_string=");
        $str689$_cyc_host_string_ = SubLObjectFactory.makeString("&cyc_host_string=");
        $str690$_cyc_port_string_ = SubLObjectFactory.makeString("&cyc_port_string=");
        $str691$_kbmonitor = SubLObjectFactory.makeString("-kbmonitor");
        $int692$600 = SubLObjectFactory.makeInteger(600);
        $int693$400 = SubLObjectFactory.makeInteger(400);
        $kw694$KB_MONITOR_INDEX_HOOK = SubLObjectFactory.makeKeyword("KB-MONITOR-INDEX-HOOK");
        $sym695$CB_LINK_KB_MONITOR_INDEX_HOOK = SubLObjectFactory.makeSymbol("CB-LINK-KB-MONITOR-INDEX-HOOK");
        $str696$Jstack_for_process_ = SubLObjectFactory.makeString("Jstack for process ");
        $sym697$CB_JSTACK_TRACE = SubLObjectFactory.makeSymbol("CB-JSTACK-TRACE");
        $str698$jstack_Trace = SubLObjectFactory.makeString("jstack Trace");
        $str699$cyc_jstack_trace = SubLObjectFactory.makeString("cyc-jstack-trace");
        $kw700$JSTACK_TRACE = SubLObjectFactory.makeKeyword("JSTACK-TRACE");
        $sym701$CB_LINK_JSTACK_TRACE = SubLObjectFactory.makeSymbol("CB-LINK-JSTACK-TRACE");
        $list702 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-SYSTEM"));
        $str703$cb_jstack_trace = SubLObjectFactory.makeString("cb-jstack-trace");
        $str704$JRTL_jstack_Trace = SubLObjectFactory.makeString("JRTL jstack Trace");
    }
}

/*

	Total time: 5872 ms
	
*/