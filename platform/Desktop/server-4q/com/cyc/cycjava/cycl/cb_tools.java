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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class cb_tools
    extends
      SubLTranslatedFile
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
  public static SubLObject cb_tools(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str2$Browser_Tools;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
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
            html_utilities.html_markup( $str14$post );
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
              html_utilities.html_hidden_input( $str15$cb_tools_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw0$CB_TOOLS, $kw16$SELF, $str17$Choose_a_tool__or_modify_the_tool );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_reset_input( $str18$Current_Values );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str19$Update_Toolbar, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str20$Update___Save, $str21$save, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              SubLObject tools = conses_high.set_difference( cb_utilities.cb_standard_tools(), cb_utilities.cb_deprecated_tools(), UNPROVIDED, UNPROVIDED );
              cb_tool_columns( tools );
              tools = cb_utilities.cb_deprecated_tools();
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( $str22$Deprecated_Tools );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              cb_tool_columns( tools );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 1614L)
  public static SubLObject cb_tool_columns(SubLObject tools)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    tools = Sort.sort( tools, Symbols.symbol_function( $sym25$STRING_ ), Symbols.symbol_function( $sym26$SECOND ) );
    final SubLObject total = Sequences.length( tools );
    SubLObject first_column = tools;
    SubLObject second_column = NIL;
    SubLObject third_column = NIL;
    if( total.numGE( $cb_tools_split_threshold$.getDynamicValue( thread ) ) )
    {
      final SubLObject column_size = Numbers.integerDivide( Numbers.add( total, THREE_INTEGER ), THREE_INTEGER );
      second_column = Sequences.subseq( tools, column_size, Numbers.multiply( column_size, TWO_INTEGER ) );
      third_column = Sequences.subseq( tools, Numbers.multiply( column_size, TWO_INTEGER ), UNPROVIDED );
      first_column = Sequences.subseq( tools, ZERO_INTEGER, column_size );
    }
    if( NIL != second_column )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_tools_internal( first_column );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( FOUR_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_tools_internal( second_column );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( FOUR_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_tools_internal( third_column );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
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
    else
    {
      cb_tools_internal( first_column );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 2566L)
  public static SubLObject cb_tools_internal(final SubLObject tools)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
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
      SubLObject cdolist_list_var = tools;
      SubLObject tool = NIL;
      tool = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject current;
          final SubLObject datum = current = tool;
          SubLObject name = NIL;
          SubLObject pretty_name = NIL;
          SubLObject abbreviation = NIL;
          SubLObject description = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
          name = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
          pretty_name = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
          abbreviation = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
          description = current.first();
          current = current.rest();
          final SubLObject availability = current.isCons() ? current.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list28 );
          current = current.rest();
          if( NIL == current )
          {
            if( cb_utilities.cb_link_method( name ).isFunctionSpec() )
            {
              final SubLObject default_checkedP = conses_high.member( name, cb_parameters.$cb_user_toolbar_links$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( print_high.prin1_to_string( name ), T, default_checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
                if( NIL != description )
                {
                  html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( description );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  cb_utilities.cb_link( name, pretty_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                }
                html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
                html_utilities.html_indent( TWO_INTEGER );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        tool = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 3421L)
  public static SubLObject cb_tools_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject available_tools = cb_utilities.cb_available_tools();
    SubLObject save_settingsP = NIL;
    SubLObject tools = NIL;
    SubLObject cdolist_list_var = args.rest();
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg_string = arg.first();
      final SubLObject name = reader.read_from_string_ignoring_errors( arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != Sequences.find( name, available_tools, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym29$FIRST ), UNPROVIDED, UNPROVIDED ) )
      {
        tools = ConsesLow.cons( name, tools );
      }
      else if( arg_string.equal( $str21$save ) )
      {
        save_settingsP = T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    tools = Sequences.nreverse( tools );
    cb_parameters.$cb_user_toolbar_links$.setDynamicValue( tools, thread );
    if( NIL != save_settingsP )
    {
      cb_save_interface_state();
    }
    html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw6$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str30$Toolbar_Modified );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_update_cb_toolbar_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str31$Browser_Toolbar_Modified );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
          cb_utilities.cb_frame_update_message_page_info( $str32$Tools );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$16, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4211L)
  public static SubLObject cb_link_tools(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str32$Tools;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str35$cb_tools );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4396L)
  public static SubLObject html_update_cb_toolbar_script()
  {
    return html_script_utilities.html_refresh_frame_script( cb_utilities.cb_frame_name( $kw38$TOOLBAR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4646L)
  public static SubLObject declare_cb_boolean_global(final SubLObject global, final SubLObject plist)
  {
    return dictionary.dictionary_enter( $cb_boolean_globals$.getGlobalValue(), global, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4766L)
  public static SubLObject cb_boolean_option_field_name(final SubLObject global)
  {
    return conses_high.getf( dictionary.dictionary_lookup( $cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED ), $kw39$FIELD_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 4897L)
  public static SubLObject cb_boolean_option_legend_form(final SubLObject global)
  {
    return conses_high.getf( dictionary.dictionary_lookup( $cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED ), $kw40$LEGEND_FORM, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 5030L)
  public static SubLObject cb_boolean_option_check(final SubLObject global)
  {
    final SubLObject check_fn = conses_high.getf( dictionary.dictionary_lookup( $cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED ), $kw41$CHECK_FN, UNPROVIDED );
    if( NIL != Symbols.fboundp( check_fn ) )
    {
      return Functions.funcall( check_fn );
    }
    return list_utilities.sublisp_boolean( Symbols.symbol_value( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 5359L)
  public static SubLObject cb_boolean_option_new_value(final SubLObject global, final SubLObject html_ans)
  {
    final SubLObject new_value_fn = conses_high.getf( dictionary.dictionary_lookup( $cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED ), $kw42$NEW_VALUE_FN, UNPROVIDED );
    if( NIL != Symbols.fboundp( new_value_fn ) )
    {
      return Functions.funcall( new_value_fn, html_ans );
    }
    return list_utilities.sublisp_boolean( html_ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 5699L)
  public static SubLObject cb_show_boolean_option(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject global = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    global = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject field_name = $sym44$FIELD_NAME;
      final SubLObject legend_form = $sym45$LEGEND_FORM;
      return ConsesLow.list( $sym46$CLET, ConsesLow.list( ConsesLow.list( field_name, ConsesLow.list( $sym47$CB_BOOLEAN_OPTION_FIELD_NAME, ConsesLow.list( $sym48$QUOTE, global ) ) ), ConsesLow.list( legend_form,
          ConsesLow.list( $sym49$CB_BOOLEAN_OPTION_LEGEND_FORM, ConsesLow.list( $sym48$QUOTE, global ) ) ) ), ConsesLow.list( $sym50$PWHEN, ConsesLow.list( $sym51$CAND, ConsesLow.list( $sym52$STRINGP, field_name ),
              ConsesLow.list( $sym53$LISTP, legend_form ) ), ConsesLow.list( $sym54$CB_CHECKBOX_OPTION, ConsesLow.list( field_name, ConsesLow.list( $sym55$CB_BOOLEAN_OPTION_CHECK, ConsesLow.list( $sym48$QUOTE,
                  global ) ) ), ConsesLow.list( $sym56$EVAL, legend_form ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 9581L)
  public static SubLObject cb_fastP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return cb_parameters.$cb_fastP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 9983L)
  public static SubLObject cb_new_script_mode(final SubLObject html_ans)
  {
    return ( NIL != list_utilities.sublisp_boolean( html_ans ) ) ? $kw89$JAVASCRIPT : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 14762L)
  public static SubLObject cb_options_submit_bar(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    return $list132;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 15176L)
  public static SubLObject cb_options(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str135$Browser_Preferences;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$18 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$19 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
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
            if( NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue( thread ) )
            {
              html_script_utilities.cb_hoverover_page_init();
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str136$cb_options_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw133$CB_OPTIONS, $kw16$SELF, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_reset_input( $str137$Reset_Form );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str138$Submit, $str139$update, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str140$Submit___Save, $str141$update_and_save, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str142$Load_Saved, $str143$load_saved, UNPROVIDED );
              cb_options_table_of_contents();
              cb_options_general();
              cb_options_term_display();
              cb_options_history_and_browser_tool();
              cb_options_nl();
              cb_options_query_tool();
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_reset_input( $str137$Reset_Form );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str138$Submit, $str139$update, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str140$Submit___Save, $str141$update_and_save, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str142$Load_Saved, $str143$load_saved, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$19, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$18, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 16211L)
  public static SubLObject cb_options_table_of_contents()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_princ( $str146$Jump_to_Section );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_unordered_list_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = $cb_option_section_names$.getGlobalValue();
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject key = NIL;
        SubLObject name = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
        key = current.first();
        current = ( name = current.rest() );
        final SubLObject url = Sequences.cconcatenate( $str148$_, format_nil.format_nil_a_no_copy( web_utilities.html_url_encode( name, UNPROVIDED ) ) );
        html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( url );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ_strong( name );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
        }
        html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_unordered_list_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 16562L)
  public static SubLObject cb_options_section(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    key = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject name = $sym150$NAME;
      return ConsesLow.list( $sym46$CLET, ConsesLow.list( ConsesLow.list( name, ConsesLow.list( $sym151$ALIST_LOOKUP_WITHOUT_VALUES, $sym152$_CB_OPTION_SECTION_NAMES_, key ) ) ), $list153, ConsesLow.list(
          $sym154$HTML_HEADING, $list155, ConsesLow.list( $sym156$HTML_FANCY_DIV, ConsesLow.list( $kw157$ID, name ), ConsesLow.list( $sym158$HTML_PRINC, name ) ) ), ConsesLow.list( $sym159$HTML_FANCY_TABLE, $list160,
              reader.bq_cons( $sym161$HTML_TABLE_ROW, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list149 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 16985L)
  public static SubLObject cb_options_section_column(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym162$PROGN, $list163, ConsesLow.listS( $sym164$HTML_FANCY_TABLE_DATA, $list165, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 17233L)
  public static SubLObject cb_options_subsection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym162$PROGN, ConsesLow.list( $sym154$HTML_HEADING, $list167, ConsesLow.list( $sym168$HTML_FORMAT, $str169$_A__, name ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list166 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 17433L)
  public static SubLObject cb_option_with_title_only(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
    title = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym162$PROGN, ConsesLow.list( $sym172$HTML_PRINC_STRONG, title ), $list173, $list174, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list171 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 17708L)
  public static SubLObject cb_option_with_title_and_hoverover(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    SubLObject hoverover = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
    title = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
    hoverover = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym162$PROGN, ConsesLow.list( $sym178$PIF, ConsesLow.list( $sym52$STRINGP, hoverover ), ConsesLow.list( $sym179$HTML_PRINC_STRONG_WITH_EXPLANATION, title, hoverover ), ConsesLow.list(
          $sym172$HTML_PRINC_STRONG, title ) ), $list173, $list174, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list177 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18098L)
  public static SubLObject cb_option_with_title(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
    title = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$25 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list180 );
      current_$25 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list180 );
      if( NIL == conses_high.member( current_$25, $list181, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$25 == $kw182$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list180 );
    }
    final SubLObject hoverover_tail = cdestructuring_bind.property_list_member( $kw183$HOVEROVER, current );
    final SubLObject hoverover = ( NIL != hoverover_tail ) ? conses_high.cadr( hoverover_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != hoverover )
    {
      return ConsesLow.listS( $sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER, ConsesLow.list( title, hoverover ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym170$CB_OPTION_WITH_TITLE_ONLY, ConsesLow.list( title ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18367L)
  public static SubLObject cb_checkbox_option(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    SubLObject checkedP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
    checkedP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject legend_form;
      current = ( legend_form = temp );
      return ConsesLow.listS( $sym162$PROGN, ConsesLow.list( $sym185$HTML_CHECKBOX_INPUT, name, T, checkedP ), $list186, ConsesLow.append( legend_form, $list187 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list184 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18607L)
  public static SubLObject cb_constant_entry_option(final SubLObject legend_text, final SubLObject name, final SubLObject v_default, SubLObject filter, SubLObject hoverover)
  {
    if( filter == UNPROVIDED )
    {
      filter = NIL;
    }
    if( hoverover == UNPROVIDED )
    {
      hoverover = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( hoverover.isString() )
    {
      cb_query.html_princ_strong_with_explanation( legend_text, hoverover, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      html_utilities.html_princ_strong( legend_text );
    }
    html_utilities.html_princ_strong( $str188$__ );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_text_input( name, v_default, cb_parameters.$cb_constant_input_width$.getDynamicValue( thread ) );
    html_complete.html_complete_button( name, $str189$Complete, filter, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_script_utilities.html_clear_input_button( name, $str190$Clear, UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 18961L)
  public static SubLObject cb_options_general()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = list_utilities.alist_lookup_without_values( $cb_option_section_names$.getGlobalValue(), $kw191$GENERAL, UNPROVIDED, UNPROVIDED );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != name )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( name );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
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
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject field_name = cb_boolean_option_field_name( $sym193$_HLMTS_SUPPORTED__ );
          SubLObject legend_form = cb_boolean_option_legend_form( $sym193$_HLMTS_SUPPORTED__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym193$_HLMTS_SUPPORTED__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          if( $str194$Simple_transformations_to_make_co.isString() )
          {
            cb_query.html_princ_strong_with_explanation( $str195$NAUT_Readability, $str194$Simple_transformations_to_make_co, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            html_utilities.html_princ_strong( $str195$NAUT_Readability );
          }
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ );
          legend_form = cb_boolean_option_legend_form( $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym61$_CB_DISPLAY_DATES_AS_STRINGS__ );
          legend_form = cb_boolean_option_legend_form( $sym61$_CB_DISPLAY_DATES_AS_STRINGS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym61$_CB_DISPLAY_DATES_AS_STRINGS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ );
          legend_form = cb_boolean_option_legend_form( $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ );
          legend_form = cb_boolean_option_legend_form( $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ_strong( $str196$Miscellaneous );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym57$_CB_C_WRAP_ASSERTIONS_ );
          legend_form = cb_boolean_option_legend_form( $sym57$_CB_C_WRAP_ASSERTIONS_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym57$_CB_C_WRAP_ASSERTIONS_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym67$_CB_WRAP_INTERACTOR_ );
          legend_form = cb_boolean_option_legend_form( $sym67$_CB_WRAP_INTERACTOR_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym67$_CB_WRAP_INTERACTOR_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym77$_CB_SEPARATE_DOC_FRAME_ );
          legend_form = cb_boolean_option_legend_form( $sym77$_CB_SEPARATE_DOC_FRAME_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym77$_CB_SEPARATE_DOC_FRAME_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ );
          legend_form = cb_boolean_option_legend_form( $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym73$_CB_SHOW_CYCLIFY_BUTTON_ );
          legend_form = cb_boolean_option_legend_form( $sym73$_CB_SHOW_CYCLIFY_BUTTON_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym73$_CB_SHOW_CYCLIFY_BUTTON_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym75$_CB_ENABLE_INFERENCE_MONITORING_ );
          legend_form = cb_boolean_option_legend_form( $sym75$_CB_ENABLE_INFERENCE_MONITORING_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym75$_CB_ENABLE_INFERENCE_MONITORING_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym81$_CB_FAST__ );
          legend_form = cb_boolean_option_legend_form( $sym81$_CB_FAST__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym81$_CB_FAST__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym90$_CB_HOVEROVER_ENABLED_ );
          legend_form = cb_boolean_option_legend_form( $sym90$_CB_HOVEROVER_ENABLED_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym90$_CB_HOVEROVER_ENABLED_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ );
          legend_form = cb_boolean_option_legend_form( $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str197$Primary_Presentation_Language );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str198$presentation_language, $str199$_cycl, Equality.eq( $kw200$CYCL, control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str201$CycL__default_ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str198$presentation_language, $str202$_nl, Equality.eq( $kw203$NL, control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str204$Natural_Language__slow_ );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ_strong( $str205$Status_Frame_Update );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( $str206$Update_every_ );
          html_utilities.html_text_input( $str207$status_interval, cb_parameters.$cb_status_update_interval$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str208$seconds__or_empty_to_disable_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 21486L)
  public static SubLObject cb_options_term_display()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = list_utilities.alist_lookup_without_values( $cb_option_section_names$.getGlobalValue(), $kw209$TERM_DISPLAY, UNPROVIDED, UNPROVIDED );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != name )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( name );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
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
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str210$Default_Index_View );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str211$index_view, $str212$_inferred, Equality.eq( cb_frames.$cb_default_index_view$.getDynamicValue( thread ), $kw213$INFERRED ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str214$Inferred );
          html_utilities.html_indent( FOUR_INTEGER );
          html_utilities.html_radio_input( $str211$index_view, $str215$_legacy, Equality.eq( cb_frames.$cb_default_index_view$.getDynamicValue( thread ), $kw216$LEGACY ), UNPROVIDED );
          html_utilities.html_princ( $str217$Legacy );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ_strong( $str218$Default_Content );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_script_utilities.html_focus_radio_input( $str219$content, $str220$upper_bound, $str221$_maximal, Equality.eq( cb_parameters.$cb_c_default_content$.getDynamicValue( thread ), $kw222$MAXIMAL ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str223$As_much_as_possible_up_to_ );
          html_utilities.html_text_input( $str220$upper_bound, cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_princ( $str224$_assertions );
          html_utilities.html_newline( UNPROVIDED );
          html_script_utilities.html_clear_radio_input( $str219$content, $str220$upper_bound, $str225$_documentation, Equality.eq( cb_parameters.$cb_c_default_content$.getDynamicValue( thread ), $kw226$DOCUMENTATION ),
              UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str227$Documentation );
          html_utilities.html_newline( UNPROVIDED );
          html_script_utilities.html_clear_radio_input( $str219$content, $str220$upper_bound, $str228$_definitional, Equality.eq( cb_parameters.$cb_c_default_content$.getDynamicValue( thread ), $kw229$DEFINITIONAL ),
              UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str230$Definitional_Information );
          html_utilities.html_newline( UNPROVIDED );
          html_script_utilities.html_clear_radio_input( $str219$content, $str220$upper_bound, $str231$_lexical, Equality.eq( cb_parameters.$cb_c_default_content$.getDynamicValue( thread ), $kw232$LEXICAL ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str233$Lexical_Information );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ_strong( $str234$Assertion_Formulas );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str235$formulas_display, $str236$_hl_formulas, Equality.eq( cb_parameters.$cb_c_assertion_formulas_display$.getDynamicValue( thread ), $kw237$HL_FORMULAS ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str238$HL_formulas__fast_ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str235$formulas_display, $str239$_el_formulas, Equality.eq( cb_parameters.$cb_c_assertion_formulas_display$.getDynamicValue( thread ), $kw240$EL_FORMULAS ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str241$EL_formulas__slow_ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str235$formulas_display, $str242$_el_formulas_except_when_browsing, Equality.eq( cb_parameters.$cb_c_assertion_formulas_display$.getDynamicValue( thread ),
              $kw243$EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str244$EL_formulas_except_when_browsing_ );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ_strong( $str245$Literal_Queries );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject field_name = cb_boolean_option_field_name( $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ );
          SubLObject legend_form = cb_boolean_option_legend_form( $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ_strong( $str246$Applicable_Relations );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__ );
          legend_form = cb_boolean_option_legend_form( $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ );
          legend_form = cb_boolean_option_legend_form( $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ );
          legend_form = cb_boolean_option_legend_form( $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
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
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str247$Assertion_Display_Options );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          SubLObject field_name = cb_boolean_option_field_name( $sym92$_CB_A_SHOW_EL_FORMULA_ );
          SubLObject legend_form = cb_boolean_option_legend_form( $sym92$_CB_A_SHOW_EL_FORMULA_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym92$_CB_A_SHOW_EL_FORMULA_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym94$_CB_A_SHOW_HL_FORMULA_ );
          legend_form = cb_boolean_option_legend_form( $sym94$_CB_A_SHOW_HL_FORMULA_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym94$_CB_A_SHOW_HL_FORMULA_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym96$_CB_A_SHOW_ENGLISH_ );
          legend_form = cb_boolean_option_legend_form( $sym96$_CB_A_SHOW_ENGLISH_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym96$_CB_A_SHOW_ENGLISH_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ );
          legend_form = cb_boolean_option_legend_form( $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str248$Assertion_Editing_Options );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ );
          legend_form = cb_boolean_option_legend_form( $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ );
          legend_form = cb_boolean_option_legend_form( $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str249$FET_Launching_Buttons );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym114$_SHOW_FET_EDIT_BUTTONS__ );
          legend_form = cb_boolean_option_legend_form( $sym114$_SHOW_FET_EDIT_BUTTONS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym114$_SHOW_FET_EDIT_BUTTONS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ );
          legend_form = cb_boolean_option_legend_form( $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__ );
          legend_form = cb_boolean_option_legend_form( $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 25149L)
  public static SubLObject cb_options_history_and_browser_tool()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = list_utilities.alist_lookup_without_values( $cb_option_section_names$.getGlobalValue(), $kw250$HISTORY_AND_TOOLS, UNPROVIDED, UNPROVIDED );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != name )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( name );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
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
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str251$History_Display_Options );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          SubLObject field_name = cb_boolean_option_field_name( $sym104$_CB_USE_CATEGORIZED_HISTORY__ );
          SubLObject legend_form = cb_boolean_option_legend_form( $sym104$_CB_USE_CATEGORIZED_HISTORY__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym104$_CB_USE_CATEGORIZED_HISTORY__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_princ( $str252$Display_no_more_than_ );
          html_utilities.html_text_input( $str253$constant_history_max, cb_parameters.$cb_constant_history_max$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_princ( $str254$_constants );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( $str252$Display_no_more_than_ );
          html_utilities.html_text_input( $str255$constant_history_chronological_ma, cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_princ( $str256$_constants_chronologically );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str252$Display_no_more_than_ );
          html_utilities.html_text_input( $str257$nat_history_max, cb_parameters.$cb_nat_history_max$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_princ( $str258$_NARTs );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str252$Display_no_more_than_ );
          html_utilities.html_text_input( $str259$assertion_history_max, cb_parameters.$cb_assertion_history_max$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_princ( $str224$_assertions );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str252$Display_no_more_than_ );
          html_utilities.html_text_input( $str260$sentence_history_max, cb_parameters.$cb_sentence_history_max$.getDynamicValue( thread ), THREE_INTEGER );
          html_utilities.html_princ( $str261$_sentences );
          html_utilities.html_newline( UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__ );
          legend_form = cb_boolean_option_legend_form( $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str262$Browser_Tool_Options );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          cb_constant_entry_option( $str263$Default_Mt, $str264$default_mt, cb_parameters.$cb_default_mt$.getDynamicValue( thread ), $const265$Microtheory, $str266$What_microtheory_should_be_used_a );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 27119L)
  public static SubLObject cb_options_nl()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = list_utilities.alist_lookup_without_values( $cb_option_section_names$.getGlobalValue(), $kw203$NL, UNPROVIDED, UNPROVIDED );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != name )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( name );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
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
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str269$NL_Generation );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          if( $str270$Which_mt_should_be_used_for_gener.isString() )
          {
            cb_query.html_princ_strong_with_explanation( $str271$Default_NL_Generation_Mt, $str270$Which_mt_should_be_used_for_gener, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            html_utilities.html_princ_strong( $str271$Default_NL_Generation_Mt );
          }
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          cb_form_widgets.cb_mt_input_section( cb_paraphrase_mt(), $list272 );
          SubLObject field_name = cb_boolean_option_field_name( $sym108$_ASSUME_CYC_CYCLIST_DIALOG__ );
          SubLObject legend_form = cb_boolean_option_legend_form( $sym108$_ASSUME_CYC_CYCLIST_DIALOG__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym108$_ASSUME_CYC_CYCLIST_DIALOG__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym110$_GENERATED_PHRASES_BROWSABLE__ );
          legend_form = cb_boolean_option_legend_form( $sym110$_GENERATED_PHRASES_BROWSABLE__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym110$_GENERATED_PHRASES_BROWSABLE__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_indent( TWO_INTEGER );
          field_name = cb_boolean_option_field_name( $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ );
          legend_form = cb_boolean_option_legend_form( $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str273$Proof_Views );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          if( $str274$Which_parameters_should_be_used_f.isString() )
          {
            cb_query.html_princ_strong_with_explanation( $str275$Default_Parameters, $str274$Which_parameters_should_be_used_f, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            html_utilities.html_princ_strong( $str275$Default_Parameters );
          }
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_create_simple_dropdown_list( $str276$proof_view_params, ConsesLow.cons( $kw277$DEFAULT, Sequences.remove( narts_high.find_nart( $list278 ), kb_utilities.sort_terms( isa
              .all_instances_in_all_mts( narts_high.find_nart( $list279 ) ), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ),
              cb_proof_view.$cb_proof_view_default_params$.getDynamicValue( thread ) );
          html_utilities.html_newline( UNPROVIDED );
          field_name = cb_boolean_option_field_name( $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ );
          legend_form = cb_boolean_option_legend_form( $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$_A__, $str280$Lexification );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          cb_constant_entry_option( $str281$Reviewer, $str282$lex_reviewer, lexification_utilities.$lexification_reviewer$.getDynamicValue( thread ), $const283$Cyclist, $str284$Which_Cyclist_is_to_reviewer_your );
          cb_constant_entry_option( $str285$Default_Microtheory, $str286$lex_mt, lexicon_vars.$default_lexification_mt$.getDynamicValue( thread ), $const265$Microtheory, $str287$What_microtheory_should_your_lexi );
          cb_constant_entry_option( $str288$Default_Syntactic_Microtheory, $str289$lex_syntactic_mt, lexicon_vars.$default_syntactic_mt$.getDynamicValue( thread ), $const265$Microtheory,
              $str290$What_microtheory_should_your_synt );
          cb_constant_entry_option( $str291$Default_Paraphrase_Microtheory, $str292$lex_pph_mt, lexicon_vars.$default_relational_lexification_mt$.getDynamicValue( thread ), $const265$Microtheory,
              $str293$What_microtheory_should_your_para );
          cb_constant_entry_option( $str294$Default_Parse_Template_Microtheor, $str295$lex_parse_template_mt, lexicon_vars.$default_lexification_template_mt$.getDynamicValue( thread ), $const265$Microtheory,
              $str296$What_microtheory_should_your_pars );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 30086L)
  public static SubLObject cb_paraphrase_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != control_vars.$cb_paraphrase_mt$.getDynamicValue( thread ) ) ? control_vars.$cb_paraphrase_mt$.getDynamicValue( thread ) : pph_vars.pph_language_mt();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 30211L)
  public static SubLObject cb_options_query_tool()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = list_utilities.alist_lookup_without_values( $cb_option_section_names$.getGlobalValue(), $kw297$QUERY_TOOL, UNPROVIDED, UNPROVIDED );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != name )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( name );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( name );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
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
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str298$Results_Display );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject field_name = cb_boolean_option_field_name( $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ );
          SubLObject legend_form = cb_boolean_option_legend_form( $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          field_name = cb_boolean_option_field_name( $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ );
          legend_form = cb_boolean_option_legend_form( $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ );
          if( field_name.isString() && legend_form.isList() )
          {
            html_utilities.html_checkbox_input( field_name, T, cb_boolean_option_check( $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            Eval.eval( legend_form );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_princ_strong( $str299$Automatically_Destroying_Inferenc );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject entry_focus = NIL;
          if( NIL == number_utilities.positive_infinity_p( cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue( thread ) ) )
          {
            entry_focus = T;
          }
          else
          {
            entry_focus = NIL;
          }
          html_script_utilities.html_focus_radio_input( $str300$destroy_inferences, $str301$entry_destroy_inferences, ZERO_INTEGER, entry_focus, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str302$Keep_only_last_ );
          if( NIL != number_utilities.non_negative_number_p( cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue( thread ) ) && NIL == number_utilities.positive_infinity_p(
              cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue( thread ) ) )
          {
            html_utilities.html_text_input( $str301$entry_destroy_inferences, cb_parameters.$cb_destroy_all_inferences_but_last_n$.getDynamicValue( thread ), THREE_INTEGER );
          }
          else
          {
            html_utilities.html_text_input( $str301$entry_destroy_inferences, cb_parameters.$cb_destroy_all_inferences_but_last_n_default$.getGlobalValue(), THREE_INTEGER );
          }
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str303$inferences__at_most__defaults_to_ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str300$destroy_inferences, ONE_INTEGER, makeBoolean( NIL == entry_focus ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str304$Keep_all );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ_strong( $str305$Default_Query_Mt );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          cb_form_widgets.cb_mt_input_section( cb_query.default_new_inference_mt(), $list306 );
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
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw192$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw27$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str307$Closed_Queries );
          html_utilities.html_princ_strong( $str188$__ );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str308$perform_argumentation_for_closed_, $str309$t, cb_parameters.$cb_perform_argumentation_for_closed_queryP$.getDynamicValue( thread ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str310$Gather_and_weigh_both_pro_and_con );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str308$perform_argumentation_for_closed_, $str311$nil, makeBoolean( NIL == cb_parameters.$cb_perform_argumentation_for_closed_queryP$.getDynamicValue( thread ) ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str312$Attempt_to_prove_only_pro_argumen );
          html_utilities.html_newline( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 32613L)
  public static SubLObject cb_options_boolean_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = dictionary.dictionary_keys( $cb_boolean_globals$.getGlobalValue() );
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject field_name = cb_boolean_option_field_name( global );
      if( field_name.isString() )
      {
        final SubLObject value = cb_boolean_option_new_value( global, html_utilities.html_extract_input( field_name, args ) );
        cb_options_set_boolean( global, value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    wff_vars.$wff_mode$.setDynamicValue( ( NIL != $cb_wff_strictP$.getDynamicValue( thread ) ) ? $kw313$STRICT : $kw314$ASSERTIVE, thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 33101L)
  public static SubLObject cb_options_set_boolean(final SubLObject global, final SubLObject value)
  {
    Symbols.set( global, value );
    return Symbols.symbol_value( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 33258L)
  public static SubLObject cb_options_handler(final SubLObject args)
  {
    if( NIL != html_utilities.html_extract_input( $str143$load_saved, args ) )
    {
      return cb_load_user_preferences( args );
    }
    final SubLObject default_mt = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str264$default_mt, args ), UNPROVIDED );
    if( NIL != forts.fort_p( default_mt ) )
    {
      cb_parameters.$cb_default_mt$.setDynamicValue( default_mt );
    }
    cb_lexification_options_handler( args );
    cb_pph_options_handler( args );
    SubLObject presentation_language = html_utilities.html_extract_input( $str198$presentation_language, args );
    if( NIL != presentation_language )
    {
      presentation_language = reader.read_from_string_ignoring_errors( presentation_language, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == control_vars.cb_presentation_language_p( presentation_language ) )
    {
      presentation_language = $kw200$CYCL;
    }
    control_vars.$cb_major_presentation_language$.setDynamicValue( presentation_language );
    SubLObject status_interval = html_utilities.html_extract_input( $str207$status_interval, args );
    if( NIL != status_interval )
    {
      status_interval = reader.read_from_string_ignoring_errors( status_interval, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == status_interval || ( status_interval.isInteger() && status_interval.isPositive() ) )
    {
      cb_parameters.$cb_status_update_interval$.setDynamicValue( status_interval );
    }
    cb_history_display_options_handler( args );
    cb_term_display_options_handler( args );
    cb_query_tool_options_handler( args );
    cb_options_handler_finish( args );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 34926L)
  public static SubLObject cb_history_display_options_handler(final SubLObject args)
  {
    SubLObject foo = html_utilities.html_extract_input( $str253$constant_history_max, args );
    if( NIL != foo )
    {
      foo = reader.read_from_string_ignoring_errors( foo, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == foo || ( foo.isInteger() && foo.isPositive() ) )
    {
      cb_parameters.$cb_constant_history_max$.setDynamicValue( foo );
    }
    foo = html_utilities.html_extract_input( $str255$constant_history_chronological_ma, args );
    if( NIL != foo )
    {
      foo = reader.read_from_string_ignoring_errors( foo, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == foo || foo.isInteger() )
    {
      cb_parameters.$cb_constant_history_chronological_max$.setDynamicValue( foo );
    }
    foo = html_utilities.html_extract_input( $str257$nat_history_max, args );
    if( NIL != foo )
    {
      foo = reader.read_from_string_ignoring_errors( foo, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == foo || ( foo.isInteger() && foo.isPositive() ) )
    {
      cb_parameters.$cb_nat_history_max$.setDynamicValue( foo );
    }
    foo = html_utilities.html_extract_input( $str259$assertion_history_max, args );
    if( NIL != foo )
    {
      foo = reader.read_from_string_ignoring_errors( foo, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == foo || ( foo.isInteger() && foo.isPositive() ) )
    {
      cb_parameters.$cb_assertion_history_max$.setDynamicValue( foo );
    }
    foo = html_utilities.html_extract_input( $str260$sentence_history_max, args );
    if( NIL != foo )
    {
      foo = reader.read_from_string_ignoring_errors( foo, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == foo || ( foo.isInteger() && foo.isPositive() ) )
    {
      cb_parameters.$cb_sentence_history_max$.setDynamicValue( foo );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 36327L)
  public static SubLObject cb_term_display_options_handler(final SubLObject args)
  {
    final SubLObject index_view = html_utilities.html_extract_input( $str211$index_view, args );
    cb_frames.$cb_default_index_view$.setDynamicValue( reader.read_from_string_ignoring_errors( index_view, NIL, NIL, UNPROVIDED, UNPROVIDED ) );
    SubLObject content = html_utilities.html_extract_input( $str219$content, args );
    if( NIL != content )
    {
      content = reader.read_from_string_ignoring_errors( content, NIL, NIL, UNPROVIDED, UNPROVIDED );
      if( content == $kw222$MAXIMAL )
      {
        final SubLObject upper_bound_string = html_utilities.html_extract_input( $str220$upper_bound, args );
        if( NIL != upper_bound_string )
        {
          final SubLObject upper_bound = reader.read_from_string_ignoring_errors( upper_bound_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
          if( upper_bound.isInteger() )
          {
            cb_parameters.$cb_c_maximal_upper_bound$.setDynamicValue( upper_bound );
          }
          else
          {
            cb_parameters.$cb_c_maximal_upper_bound$.setDynamicValue( NIL );
          }
        }
        else
        {
          cb_parameters.$cb_c_maximal_upper_bound$.setDynamicValue( NIL );
        }
      }
      cb_parameters.$cb_c_default_content$.setDynamicValue( content );
    }
    final SubLObject formulas_display = html_utilities.html_extract_input( $str235$formulas_display, args );
    cb_parameters.$cb_c_assertion_formulas_display$.setDynamicValue( reader.read_from_string_ignoring_errors( formulas_display, NIL, NIL, UNPROVIDED, UNPROVIDED ) );
    cb_parameters.$cb_c_formula_display_exception_index_hook$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 37459L)
  public static SubLObject cb_lexification_options_handler(final SubLObject args)
  {
    final SubLObject lex_mt = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str286$lex_mt, args ), UNPROVIDED );
    final SubLObject lex_reviewer = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str282$lex_reviewer, args ), UNPROVIDED );
    final SubLObject lex_syntactic_mt = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str289$lex_syntactic_mt, args ), UNPROVIDED );
    final SubLObject lex_pph_mt = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str292$lex_pph_mt, args ), UNPROVIDED );
    final SubLObject lex_parse_template_mt = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( $str295$lex_parse_template_mt, args ), UNPROVIDED );
    if( NIL != forts.fort_p( lex_mt ) )
    {
      lexicon_vars.$default_lexification_mt$.setDynamicValue( lex_mt );
    }
    if( NIL != forts.fort_p( lex_syntactic_mt ) )
    {
      lexicon_vars.$default_syntactic_mt$.setDynamicValue( lex_syntactic_mt );
    }
    if( NIL == lex_reviewer || NIL != forts.fort_p( lex_reviewer ) )
    {
      lexification_utilities.$lexification_reviewer$.setDynamicValue( lex_reviewer );
    }
    if( NIL != forts.fort_p( lex_pph_mt ) )
    {
      lexicon_vars.$default_relational_lexification_mt$.setDynamicValue( lex_pph_mt );
    }
    if( NIL != forts.fort_p( lex_parse_template_mt ) )
    {
      lexicon_vars.$default_lexification_template_mt$.setDynamicValue( lex_parse_template_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 38991L)
  public static SubLObject cb_pph_options_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject default_pph_mt = cb_form_widgets.cb_extract_mt_input( args, control_vars.$cb_paraphrase_mt$.getDynamicValue( thread ), $list272 );
    final SubLObject error = thread.secondMultipleValue();
    final SubLObject bad_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return cb_utilities.cb_error( $str316$Default_NL_Generation_Mt__The_inp, bad_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_set_default_pph_mt( default_pph_mt );
    final SubLObject proof_view_params = html_utilities.html_extract_input( $str276$proof_view_params, args );
    final SubLObject value = $str317$DEFAULT.equal( proof_view_params ) ? $kw277$DEFAULT : cb_utilities.cb_guess_fort( proof_view_params, UNPROVIDED );
    if( value.eql( $kw277$DEFAULT ) || NIL != forts.fort_p( value ) )
    {
      cb_proof_view.$cb_proof_view_default_params$.setDynamicValue( value, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 38991L)
  public static SubLObject cb_set_default_pph_mt(final SubLObject default_pph_mt)
  {
    control_vars.$cb_paraphrase_mt$.setDynamicValue( default_pph_mt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 39775L)
  public static SubLObject cb_query_tool_options_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject destroy_inferences = html_utilities.html_extract_input( $str300$destroy_inferences, args );
    if( NIL != destroy_inferences )
    {
      destroy_inferences = reader.read_from_string_ignoring_errors( destroy_inferences, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( destroy_inferences.eql( ZERO_INTEGER ) )
    {
      destroy_inferences = html_utilities.html_extract_input( $str301$entry_destroy_inferences, args );
      destroy_inferences = reader.read_from_string_ignoring_errors( destroy_inferences, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    else if( destroy_inferences.eql( ONE_INTEGER ) )
    {
      destroy_inferences = $kw318$POSITIVE_INFINITY;
    }
    if( NIL != number_utilities.non_negative_potentially_infinite_number_p( destroy_inferences ) )
    {
      cb_parameters.$cb_destroy_all_inferences_but_last_n$.setDynamicValue( destroy_inferences, thread );
    }
    cb_query.cb_destroy_all_inferences_but_last_n();
    thread.resetMultipleValues();
    final SubLObject default_query_mt = cb_form_widgets.cb_extract_mt_input( args, cb_query.default_new_inference_mt(), $list306 );
    final SubLObject error = thread.secondMultipleValue();
    final SubLObject bad_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return cb_utilities.cb_error( $str319$Default_Query_Mt__The_input___A__, bad_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_query.set_default_new_inference_mt( default_query_mt );
    final SubLObject argumentation_str = html_utilities.html_extract_input( $str308$perform_argumentation_for_closed_, args );
    final SubLObject argumentationP = list_utilities.sublisp_boolean( reader.read_from_string_ignoring_errors( argumentation_str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    cb_parameters.$cb_perform_argumentation_for_closed_queryP$.setDynamicValue( argumentationP, thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 41125L)
  public static SubLObject cb_options_handler_finish(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject use_hoverover = html_script_utilities.$cb_hoverover_enabled$.getDynamicValue( thread );
    SubLObject savedP = NIL;
    cb_options_boolean_handler( args );
    if( NIL == cb_parameters.$cb_a_show_el_formula$.getDynamicValue( thread ) && NIL == cb_parameters.$cb_a_show_hl_formula$.getDynamicValue( thread ) && NIL == cb_parameters.$cb_a_show_english$.getDynamicValue(
        thread ) )
    {
      cb_parameters.$cb_a_show_hl_formula$.setDynamicValue( T, thread );
    }
    if( NIL != html_utilities.html_extract_input( $str141$update_and_save, args ) )
    {
      savedP = cb_save_interface_state();
    }
    final SubLObject restart_requiredP = NIL;
    final SubLObject _prev_bind_0 = html_script_utilities.$cb_hoverover_enabled$.currentBinding( thread );
    try
    {
      html_script_utilities.$cb_hoverover_enabled$.bind( use_hoverover, thread );
      cb_options_result_page( restart_requiredP, savedP );
    }
    finally
    {
      html_script_utilities.$cb_hoverover_enabled$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 42035L)
  public static SubLObject cb_link_options(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str320$Preferences;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str321$cb_options );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 42305L)
  public static SubLObject cb_options_result_page(SubLObject restart_linkP, SubLObject savedP)
  {
    if( restart_linkP == UNPROVIDED )
    {
      restart_linkP = NIL;
    }
    if( savedP == UNPROVIDED )
    {
      savedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = cb_options_result_message( savedP );
    if( NIL != restart_linkP )
    {
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        html_utilities.html_princ( message );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( message );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str325$Your_new_settings_require_you_to_ );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_princ( $str326$Click_ );
            cb_utilities.cb_link( $kw327$START, $str328$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_princ( $str329$_now_to_do_so_ );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$51, thread );
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
      cb_utilities.cb_message_page_with_history( message, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 42740L)
  public static SubLObject cb_options_result_message(final SubLObject savedP)
  {
    SubLObject message = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      print_high.princ( $str330$KB_Browser_Options_have_been_modi, stream );
      if( NIL != savedP )
      {
        print_high.princ( $str331$_and_saved, stream );
      }
      print_high.princ( $str332$_, stream );
      message = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 43018L)
  public static SubLObject cb_history(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_history_internal( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 43195L)
  public static SubLObject cb_history_internal(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject style = ( NIL == args && NIL != cb_parameters.$cb_use_categorized_historyP$.getDynamicValue( thread ) ) ? $kw336$CATEGORIZED
        : ( ( NIL == args ) ? $kw337$ALPHABETICAL
            : ( ( NIL != args && NIL != subl_promotions.memberP( $str338$categorized, args, Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) ? $kw336$CATEGORIZED : $kw337$ALPHABETICAL ) );
    final SubLObject title_var = $str339$;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$53 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$54 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
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
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw334$CB_HISTORY, UNPROVIDED, UNPROVIDED );
              if( ( NIL != cb_assertion_history_items() || NIL != cb_sentence_history_items() ) && $kw200$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
              {
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                if( NIL != cb_parameters.$cb_history_show_el_formulasP$.getDynamicValue( thread ) )
                {
                  cb_utilities.cb_link( $kw340$HISTORY_HL_FORMULAS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else
                {
                  cb_utilities.cb_link( $kw341$HISTORY_EL_FORMULAS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              }
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_show_history_info( style );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$54, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$53, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 43921L)
  public static SubLObject cb_show_history_info(SubLObject style)
  {
    if( style == UNPROVIDED )
    {
      style = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == style )
    {
      style = ( NIL != cb_parameters.$cb_use_categorized_historyP$.getDynamicValue( thread ) ) ? $kw336$CATEGORIZED : $kw337$ALPHABETICAL;
    }
    cb_show_recent_history( style );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 44266L)
  public static SubLObject cb_show_recent_history(final SubLObject style)
  {
    cb_show_bookmarked_constants();
    cb_show_recent_constants( style );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    cb_show_bookmarked_nats();
    cb_show_recent_nats();
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    cb_show_bookmarked_assertions();
    cb_show_recent_assertions();
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    cb_show_recent_sentences();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 44797L)
  public static SubLObject cb_show_recent_constants(final SubLObject style)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str343$Recent_Constants__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    html_utilities.html_indent( FOUR_INTEGER );
    if( style == $kw336$CATEGORIZED )
    {
      cb_utilities.cb_link( $kw344$HISTORY, $str345$_Show_Alphabetical_, $kw337$ALPHABETICAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_link( $kw344$HISTORY, $str346$_Show_Categorized_, $kw336$CATEGORIZED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_indent( FOUR_INTEGER );
    cb_utilities.cb_link( $kw347$CLEAR_CONSTANT_HISTORY, NIL, style, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject items = cb_constant_history_items();
    final SubLObject first_n = list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), items );
    final SubLObject sorted_items = Sort.sort( conses_high.copy_list( items ), $sym25$STRING_, $sym348$TO_STRING );
    if( NIL != items )
    {
      if( style == $kw336$CATEGORIZED )
      {
        if( NIL != $cb_use_css_columns_for_categories$.getDynamicValue( thread ) )
        {
          cb_show_recent_constants_categorized_2();
        }
        else
        {
          cb_show_recent_constants_categorized();
        }
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str349$history_constants_columnar );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject cdolist_list_var = first_n;
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str350$history_constant );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              cb_utilities.cb_show_term( item, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
          if( NIL != list_utilities.lengthG( sorted_items, cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), UNPROVIDED ) )
          {
            if( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
            {
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            }
            cdolist_list_var = sorted_items;
            item = NIL;
            item = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str350$history_constant );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                cb_utilities.cb_show_term( item, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              cdolist_list_var = cdolist_list_var.rest();
              item = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      }
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str351$None );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 46109L)
  public static SubLObject cb_show_recent_constants_categorized()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject items = cb_constant_history_items();
    final SubLObject chronological = list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), items );
    final SubLObject collections = list_utilities.find_all_if( Symbols.symbol_function( $sym352$ISA_COLLECTION_ ), items, UNPROVIDED );
    final SubLObject visible_collections = Sort.sort( list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), collections ), $sym25$STRING_, $sym348$TO_STRING );
    final SubLObject relations = list_utilities.find_all_if( Symbols.symbol_function( $sym353$ISA_RELATION_ ), items, UNPROVIDED );
    final SubLObject visible_relations = Sort.sort( list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), relations ), $sym25$STRING_, $sym348$TO_STRING );
    final SubLObject assertions = list_utilities.find_all_if( Symbols.symbol_function( $sym354$ASSERTION_P ), items, UNPROVIDED );
    final SubLObject individuals = Sort.sort( list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), conses_high.set_difference( conses_high.set_difference( conses_high
        .set_difference( items, collections, UNPROVIDED, UNPROVIDED ), relations, UNPROVIDED, UNPROVIDED ), assertions, UNPROVIDED, UNPROVIDED ) ), $sym25$STRING_, $sym348$TO_STRING );
    if( NIL != items )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str355$history_table );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str356$history_categorized_column );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str357$history_table_heading );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( $str358$Most_nbsp_Recent );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = chronological;
            SubLObject chron = NIL;
            chron = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              cb_utilities.cb_show_term( chron, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              chron = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str356$history_categorized_column );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str357$history_table_heading );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str359$Collections );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = visible_collections;
            SubLObject coll = NIL;
            coll = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              cb_utilities.cb_show_term( coll, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              coll = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str356$history_categorized_column );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str357$history_table_heading );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str360$Individuals );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = individuals;
            SubLObject ind = NIL;
            ind = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              cb_utilities.cb_show_term( ind, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              ind = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str356$history_categorized_column );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str357$history_table_heading );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str361$Relations );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = visible_relations;
            SubLObject relation = NIL;
            relation = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              cb_utilities.cb_show_term( relation, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              relation = cdolist_list_var.first();
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
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 48160L)
  public static SubLObject cb_show_recent_constants_categorized_2()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject items = cb_constant_history_items();
    final SubLObject chronological = list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), items );
    final SubLObject collections = list_utilities.find_all_if( Symbols.symbol_function( $sym352$ISA_COLLECTION_ ), items, UNPROVIDED );
    final SubLObject visible_collections = Sort.sort( list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), collections ), $sym25$STRING_, $sym348$TO_STRING );
    final SubLObject relations = list_utilities.find_all_if( Symbols.symbol_function( $sym353$ISA_RELATION_ ), items, UNPROVIDED );
    final SubLObject visible_relations = Sort.sort( list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), relations ), $sym25$STRING_, $sym348$TO_STRING );
    final SubLObject assertions = list_utilities.find_all_if( Symbols.symbol_function( $sym354$ASSERTION_P ), items, UNPROVIDED );
    final SubLObject individuals = Sort.sort( list_utilities.first_n( cb_parameters.$cb_constant_history_chronological_max$.getDynamicValue( thread ), conses_high.set_difference( conses_high.set_difference( conses_high
        .set_difference( items, collections, UNPROVIDED, UNPROVIDED ), relations, UNPROVIDED, UNPROVIDED ), assertions, UNPROVIDED, UNPROVIDED ) ), $sym25$STRING_, $sym348$TO_STRING );
    if( NIL != items )
    {
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str362$columns__4__column_count__4____we );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str356$history_categorized_column );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str363$display_block__break_after__colum );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str357$history_table_heading );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( $str358$Most_nbsp_Recent );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var = chronological;
          SubLObject chron = NIL;
          chron = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            cb_utilities.cb_show_term( chron, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            chron = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str356$history_categorized_column );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str363$display_block__break_after__colum );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str357$history_table_heading );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str359$Collections );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var = visible_collections;
          SubLObject coll = NIL;
          coll = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            cb_utilities.cb_show_term( coll, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            coll = cdolist_list_var.first();
          }
          SubLObject cdotimes_end_var;
          SubLObject n;
          for( cdotimes_end_var = Numbers.subtract( Sequences.length( chronological ), Sequences.length( visible_collections ) ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
          {
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str356$history_categorized_column );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str364$display__block__break_after__colu );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str357$history_table_heading );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str360$Individuals );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var = individuals;
          SubLObject ind = NIL;
          ind = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            cb_utilities.cb_show_term( ind, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            ind = cdolist_list_var.first();
          }
          SubLObject cdotimes_end_var;
          SubLObject n;
          for( cdotimes_end_var = Numbers.subtract( Sequences.length( chronological ), Sequences.length( individuals ) ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
          {
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str356$history_categorized_column );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str365$display__block__break_after__colu );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str357$history_table_heading );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str361$Relations );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$76, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var = visible_relations;
          SubLObject relation = NIL;
          relation = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            cb_utilities.cb_show_term( relation, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            relation = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
        }
        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 50801L)
  public static SubLObject cb_show_recent_nats()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str366$Recent_NATs__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    final SubLObject items = cb_nat_history_items();
    if( NIL != items )
    {
      html_utilities.html_indent( FOUR_INTEGER );
      cb_utilities.cb_link( $kw367$CLEAR_NAT_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str368$history_nats_columnar );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str369$history_nat );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              cb_utilities.cb_show_term( item, ZERO_INTEGER, T );
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str351$None );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 51344L)
  public static SubLObject cb_show_recent_sentences()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str370$Recent_Sentences__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    final SubLObject items = cb_sentence_history_items();
    if( NIL != items )
    {
      html_utilities.html_indent( FOUR_INTEGER );
      cb_utilities.cb_link( $kw371$CLEAR_SENTENCE_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      SubLObject cdolist_list_var = items;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.ist_sentence_p( item, UNPROVIDED ) )
        {
          final SubLObject mt = cycl_utilities.formula_arg1( item, UNPROVIDED );
          final SubLObject sentence = cycl_utilities.formula_arg2( item, UNPROVIDED );
          if( NIL != sksi_external_browser_utilities.sksi_supported_browsing_registeredP() && NIL != sksi_kb_accessors.sksi_content_mt_p( mt ) )
          {
            cb_sentence_browser.cb_show_sentence_readably( sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), T, T );
          }
          else
          {
            cb_sentence_browser.cb_show_sentence_readably( sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), T, NIL );
          }
          html_utilities.html_newline( UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str351$None );
      html_utilities.html_newline( TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 52280L)
  public static SubLObject cb_bookmarks_supported_for_current_user()
  {
    return makeBoolean( NIL != kb_control_vars.date_kb_loaded_p() && NIL == ke.cyclist_is_guest() && NIL != constants_high.find_constant( $str372$cyclistReadilyAvailableTerms ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 52508L)
  public static SubLObject cb_show_bookmarked_constants()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject items = list_utilities.remove_if_not( $sym373$CONSTANT_P, cb_bookmarked_items( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str374$font_size__larger__font_weight_bo );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str375$To_remove_a_bookmark__follow_the_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str376$Bookmarked_Constants__ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    if( NIL != items )
    {
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str377$bookmarked_constants_columnar );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str378$bookmarked_constant );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_show_term( item, ZERO_INTEGER, T );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 53072L)
  public static SubLObject cb_show_bookmarked_nats()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject items = list_utilities.remove_if_not( $sym379$CYCL_NAT_P, cb_bookmarked_items( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str374$font_size__larger__font_weight_bo );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str375$To_remove_a_bookmark__follow_the_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str380$Bookmarked_NATs__ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    if( NIL != items )
    {
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str381$bookmarked_nats_columnar );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str382$bookmarked_nat );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_show_term( item, ZERO_INTEGER, T );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 53612L)
  public static SubLObject cb_show_bookmarked_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject items = list_utilities.remove_if_not( $sym354$ASSERTION_P, cb_bookmarked_items( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str374$font_size__larger__font_weight_bo );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_div_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str375$To_remove_a_bookmark__follow_the_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str383$Bookmarked_Assertions__ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    if( NIL != items )
    {
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str384$bookmarked_asserts_columnar );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str385$bookmarked_assert );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_show_term( item, ZERO_INTEGER, T );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 54171L)
  public static SubLObject cb_show_recent_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str386$Recent_Assertions__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    final SubLObject items = cb_assertion_history_items();
    if( NIL != items )
    {
      html_utilities.html_indent( FOUR_INTEGER );
      cb_utilities.cb_link( $kw387$CLEAR_ASSERTION_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject assertion_link_fn = ( NIL != cb_browser.cb_show_el_formulas_for_hookP( $kw344$HISTORY ) ) ? Symbols.symbol_function( $sym388$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY )
          : Symbols.symbol_function( $sym390$CB_ASSERTION_LINK_WITH_MT );
      final SubLObject _prev_bind_0 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding( thread );
      final SubLObject _prev_bind_2 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding( thread );
      final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding( thread );
      final SubLObject _prev_bind_4 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
      try
      {
        cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind( NIL, thread );
        cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind( NIL, thread );
        cb_utilities.$assertion_filter_hook$.bind( NIL, thread );
        pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0_$85 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
        try
        {
          pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
          final SubLObject reuseP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          try
          {
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$86 = pph_macros.$pph_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
              final SubLObject new_or_reused = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$87 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
              try
              {
                pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                final SubLObject _prev_bind_0_$88 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    final SubLObject _prev_bind_0_$89 = pph_vars.$pph_language_mt$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$90 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                    try
                    {
                      pph_vars.$pph_language_mt$.bind( cb_paraphrase_mt(), thread );
                      pph_vars.$paraphrase_mode$.bind( $kw392$HTML, thread );
                      SubLObject cdolist_list_var = items;
                      SubLObject item = NIL;
                      item = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        if( NIL != assertions_high.valid_assertion( item, UNPROVIDED ) )
                        {
                          Functions.funcall( assertion_link_fn, item );
                        }
                        else if( NIL != assertion_handles.assertion_p( item ) )
                        {
                          cb_rem_from_assertion_history( item );
                        }
                        else
                        {
                          final SubLObject mt = hlmt.reduce_hlmt( cycl_utilities.formula_arg1( item, UNPROVIDED ), UNPROVIDED );
                          final SubLObject sentence = cycl_utilities.formula_arg2( item, UNPROVIDED );
                          final SubLObject assertions = czer_meta.find_assertions_cycl( sentence, mt );
                          if( NIL != list_utilities.non_empty_list_p( assertions ) )
                          {
                            SubLObject cdolist_list_var_$91 = assertions;
                            SubLObject v_assert = NIL;
                            v_assert = cdolist_list_var_$91.first();
                            while ( NIL != cdolist_list_var_$91)
                            {
                              Functions.funcall( assertion_link_fn, v_assert );
                              cb_add_to_assertion_history( v_assert );
                              cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                              v_assert = cdolist_list_var_$91.first();
                            }
                            cb_rem_from_assertion_history( item );
                          }
                          else
                          {
                            cb_sentence_browser.cb_show_sentence_readably( sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), T, NIL );
                            html_utilities.html_newline( UNPROVIDED );
                          }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      pph_vars.$paraphrase_mode$.rebind( _prev_bind_1_$90, thread );
                      pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$89, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$90, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$88, thread );
                }
              }
              finally
              {
                pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$87, thread );
              }
              if( new_or_reused == $kw393$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
              {
                memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$86, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL == reuseP )
              {
                pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
            }
          }
        }
        finally
        {
          pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$85, thread );
        }
      }
      finally
      {
        pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_4, thread );
        cb_utilities.$assertion_filter_hook$.rebind( _prev_bind_3, thread );
        cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind( _prev_bind_2, thread );
        cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str351$None );
      html_utilities.html_newline( TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 55543L)
  public static SubLObject cb_link_history(SubLObject linktext, SubLObject categorization)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( categorization == UNPROVIDED )
    {
      categorization = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str395$History;
    }
    final SubLObject url = ( categorization == $kw336$CATEGORIZED || ( NIL == categorization && NIL != cb_parameters.$cb_use_categorized_historyP$.getDynamicValue( thread ) ) ) ? $str396$cb_history_categorized
        : $str397$cb_history_alphabetical;
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( url );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 56022L)
  public static SubLObject cb_clear_history(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = args;
    SubLObject group = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list401 );
    group = current.first();
    current = current.rest();
    final SubLObject style = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list401 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject pcase_var = Symbols.make_keyword( group );
      if( pcase_var.eql( $kw402$CONSTANT ) )
      {
        cb_clear_constant_history();
      }
      else if( pcase_var.eql( $kw403$NAT ) )
      {
        cb_clear_nat_history();
      }
      else if( pcase_var.eql( $kw404$ASSERTION ) )
      {
        cb_clear_assertion_history();
      }
      else if( pcase_var.eql( $kw405$SENTENCE ) )
      {
        cb_clear_sentence_history();
      }
      else if( pcase_var.eql( $kw406$ALL ) )
      {
        cb_clear_constant_history();
        cb_clear_nat_history();
        cb_clear_assertion_history();
        cb_clear_sentence_history();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list401 );
    }
    return cb_history_internal( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 56593L)
  public static SubLObject cb_link_clear_history(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str408$_Clear_History_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str409$cb_clear_history_ALL );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 56807L)
  public static SubLObject cb_link_clear_constant_history(SubLObject linktext, SubLObject style)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( style == UNPROVIDED )
    {
      style = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str412$_Clear_Constant_History_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str413$cb_clear_history_CONSTANT__A, string_utilities.to_string( style ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57072L)
  public static SubLObject cb_link_clear_nat_history(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str415$_Clear_NAT_History_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str416$cb_clear_history_NAT );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57294L)
  public static SubLObject cb_link_clear_assertion_history(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str418$_Clear_Assertion_History_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str419$cb_clear_history_ASSERTION );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57534L)
  public static SubLObject cb_link_clear_sentence_history(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str421$_Clear_Sentence_History_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str422$cb_clear_history_SENTENCE );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 57771L)
  public static SubLObject cb_history_el_formulas(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_parameters.$cb_history_show_el_formulasP$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_history_show_el_formulasP$.bind( T, thread );
      cb_history_internal( args );
    }
    finally
    {
      cb_parameters.$cb_history_show_el_formulasP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58042L)
  public static SubLObject cb_link_history_el_formulas(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str425$_EL_Formulas_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str426$cb_history_el_formulas );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58262L)
  public static SubLObject cb_history_hl_formulas(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_parameters.$cb_history_show_el_formulasP$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_history_show_el_formulasP$.bind( NIL, thread );
      cb_history_internal( args );
    }
    finally
    {
      cb_parameters.$cb_history_show_el_formulasP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58535L)
  public static SubLObject cb_link_history_hl_formulas(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str429$_HL_Formulas_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str430$cb_history_hl_formulas );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 58755L)
  public static SubLObject cb_rem_fort_from_all_histories(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL != nart_handles.nart_p( fort ) )
    {
      cb_rem_from_nat_history( fort );
    }
    else if( NIL != constant_handles.constant_p( fort ) )
    {
      cb_rem_from_constant_history( fort );
    }
    cb_rem_fort_from_nat_history( fort );
    cb_rem_fort_from_assertion_history( fort );
    cb_rem_fort_from_sentence_history( fort );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59119L)
  public static SubLObject cb_add_to_history(final SubLObject obj)
  {
    if( NIL != assertion_handles.assertion_p( obj ) )
    {
      cb_add_to_assertion_history( obj );
    }
    else if( NIL != constant_handles.constant_p( obj ) )
    {
      cb_add_to_constant_history( obj );
    }
    else if( NIL != cycl_grammar.cycl_nat_p( obj ) )
    {
      cb_add_to_nat_history( obj );
    }
    else
    {
      Errors.error( $str433$Unable_to_add__S_to_history, obj );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59492L)
  public static SubLObject cb_constant_history_items()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_constant_history$.setDynamicValue( list_utilities.delete_if_not( Symbols.symbol_function( $sym435$VALID_CONSTANT_ ), cb_parameters.$cb_constant_history$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    cb_parameters.$cb_constant_history$.setDynamicValue( list_utilities.first_n( $cb_history_max_constants$.getGlobalValue(), cb_parameters.$cb_constant_history$.getDynamicValue( thread ) ), thread );
    return conses_high.copy_list( cb_parameters.$cb_constant_history$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59764L)
  public static SubLObject cb_most_recent_constant()
  {
    return cb_constant_history_items().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 59855L)
  public static SubLObject cb_add_to_constant_history(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cb_parameters.$cb_constant_history$.getDynamicValue( thread ).first().eql( constant ) )
    {
      return constant;
    }
    if( NIL != subl_promotions.memberP( constant, cb_parameters.$cb_constant_history$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      cb_parameters.$cb_constant_history$.setDynamicValue( Sequences.delete( constant, cb_parameters.$cb_constant_history$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
          thread );
    }
    cb_parameters.$cb_constant_history$.setDynamicValue( ConsesLow.cons( constant, cb_parameters.$cb_constant_history$.getDynamicValue( thread ) ), thread );
    if( cb_parameters.$cb_constant_history_max$.getDynamicValue( thread ).isInteger() && cb_parameters.$cb_constant_history_max$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      final SubLObject last = conses_high.nthcdr( Numbers.subtract( cb_parameters.$cb_constant_history_max$.getDynamicValue( thread ), ONE_INTEGER ), cb_parameters.$cb_constant_history$.getDynamicValue( thread ) );
      if( NIL != last )
      {
        ConsesLow.rplacd( last, NIL );
      }
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60411L)
  public static SubLObject cb_rem_from_constant_history(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_constant_history$.setDynamicValue( Sequences.delete( constant, cb_parameters.$cb_constant_history$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60555L)
  public static SubLObject cb_clear_constant_history()
  {
    cb_parameters.$cb_constant_history$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60650L)
  public static SubLObject cb_valid_nat_p(final SubLObject nat)
  {
    if( NIL != nart_handles.valid_nartP( nat, UNPROVIDED ) )
    {
      return T;
    }
    return term.closed_nautP( nat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 60812L)
  public static SubLObject cb_nat_history_items()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_nat_history$.setDynamicValue( list_utilities.delete_if_not( $sym437$CB_VALID_NAT_P, cb_parameters.$cb_nat_history$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
        thread );
    cb_parameters.$cb_nat_history$.setDynamicValue( list_utilities.first_n( $cb_history_max_nats$.getGlobalValue(), cb_parameters.$cb_nat_history$.getDynamicValue( thread ) ), thread );
    return conses_high.copy_list( cb_parameters.$cb_nat_history$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61047L)
  public static SubLObject cb_most_recent_nat()
  {
    return cb_nat_history_items().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61128L)
  public static SubLObject cb_add_to_nat_history(final SubLObject nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cb_parameters.$cb_nat_history$.getDynamicValue( thread ).first().equal( nat ) )
    {
      return nat;
    }
    if( NIL != subl_promotions.memberP( nat, cb_parameters.$cb_nat_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED ) )
    {
      cb_parameters.$cb_nat_history$.setDynamicValue( Sequences.delete( nat, cb_parameters.$cb_nat_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    }
    cb_parameters.$cb_nat_history$.setDynamicValue( ConsesLow.cons( nat, cb_parameters.$cb_nat_history$.getDynamicValue( thread ) ), thread );
    if( cb_parameters.$cb_nat_history_max$.getDynamicValue( thread ).isInteger() && cb_parameters.$cb_nat_history_max$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      final SubLObject last = conses_high.nthcdr( Numbers.subtract( cb_parameters.$cb_nat_history_max$.getDynamicValue( thread ), ONE_INTEGER ), cb_parameters.$cb_nat_history$.getDynamicValue( thread ) );
      if( NIL != last )
      {
        ConsesLow.rplacd( last, NIL );
      }
    }
    return nat;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61611L)
  public static SubLObject cb_rem_from_nat_history(final SubLObject nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_nat_history$.setDynamicValue( Sequences.delete( nat, cb_parameters.$cb_nat_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61737L)
  public static SubLObject cb_rem_fort_from_nat_history(final SubLObject fort)
  {
    cb_parameters.$cb_nat_history$.setDynamicValue( Sequences.delete( fort, cb_nat_history_items(), Symbols.symbol_function( $sym438$TREE_FIND ), Symbols.symbol_function( $sym439$TERM_OF_UNIT ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61901L)
  public static SubLObject cb_clear_nat_history()
  {
    cb_parameters.$cb_nat_history$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 61986L)
  public static SubLObject cb_assertion_history_valid_item_p(final SubLObject item)
  {
    return makeBoolean( NIL != assertions_high.valid_assertion( item, UNPROVIDED ) || NIL != el_utilities.ist_sentence_p( item, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62222L)
  public static SubLObject cb_assertion_history_items()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_assertion_history$.setDynamicValue( list_utilities.first_n( $cb_history_max_assertions$.getGlobalValue(), cb_parameters.$cb_assertion_history$.getDynamicValue( thread ) ), thread );
    return conses_high.copy_list( cb_parameters.$cb_assertion_history$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62409L)
  public static SubLObject cb_most_recent_assertion()
  {
    return cb_assertion_history_items().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 62502L)
  public static SubLObject cb_add_to_assertion_history(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cb_assertion_history_valid_item_p( assertion ) )
    {
      return NIL;
    }
    if( cb_parameters.$cb_assertion_history$.getDynamicValue( thread ).first().eql( assertion ) )
    {
      return assertion;
    }
    if( NIL != subl_promotions.memberP( assertion, cb_parameters.$cb_assertion_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED ) )
    {
      cb_parameters.$cb_assertion_history$.setDynamicValue( Sequences.delete( assertion, cb_parameters.$cb_assertion_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    }
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      final SubLObject ist_sentence = el_utilities.make_ist_sentence( assertions_high.assertion_mt( assertion ), cycl_utilities.hl_to_el( assertions_high.assertion_formula( assertion ) ) );
      if( NIL != subl_promotions.memberP( ist_sentence, cb_parameters.$cb_assertion_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED ) )
      {
        cb_parameters.$cb_assertion_history$.setDynamicValue( Sequences.delete( ist_sentence, cb_parameters.$cb_assertion_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
            thread );
      }
    }
    cb_parameters.$cb_assertion_history$.setDynamicValue( ConsesLow.cons( assertion, cb_parameters.$cb_assertion_history$.getDynamicValue( thread ) ), thread );
    if( cb_parameters.$cb_assertion_history_max$.getDynamicValue( thread ).isInteger() && cb_parameters.$cb_assertion_history_max$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      final SubLObject last = conses_high.nthcdr( Numbers.subtract( cb_parameters.$cb_assertion_history_max$.getDynamicValue( thread ), ONE_INTEGER ), cb_parameters.$cb_assertion_history$.getDynamicValue( thread ) );
      if( NIL != last )
      {
        ConsesLow.rplacd( last, NIL );
      }
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 63599L)
  public static SubLObject cb_add_sentence_in_mt_to_assertion_history(final SubLObject sentence, final SubLObject mt)
  {
    return ( NIL != el_utilities.ist_sentence_p( sentence, UNPROVIDED ) ) ? cb_add_to_assertion_history( sentence )
        : cb_add_to_assertion_history( el_utilities.make_ist_sentence( hlmt.reduce_hlmt( mt, UNPROVIDED ), sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 63841L)
  public static SubLObject cb_rem_from_assertion_history(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_assertion_history$.setDynamicValue( Sequences.delete( assertion, cb_parameters.$cb_assertion_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 63997L)
  public static SubLObject cb_rem_fort_from_assertion_history(final SubLObject fort)
  {
    cb_parameters.$cb_assertion_history$.setDynamicValue( Sequences.delete( fort, cb_assertion_history_items(), Symbols.symbol_function( $sym440$FIND ), Symbols.symbol_function( $sym441$EXPRESSION_FORTS_WITH_HL ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64186L)
  public static SubLObject cb_clear_assertion_history()
  {
    cb_parameters.$cb_assertion_history$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64284L)
  public static SubLObject expression_forts_with_hl(final SubLObject expression)
  {
    return cycl_utilities.expression_forts( expression, T, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64509L)
  public static SubLObject cb_sentence_history_items()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_sentence_history$.setDynamicValue( list_utilities.delete_if_not( $sym442$CYCL_SENTENCE_P, cb_parameters.$cb_sentence_history$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), thread );
    return conses_high.copy_list( cb_parameters.$cb_sentence_history$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64704L)
  public static SubLObject cb_most_recent_sentence()
  {
    return cb_sentence_history_items().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 64795L)
  public static SubLObject cb_add_to_sentence_history(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cb_parameters.$cb_sentence_history$.getDynamicValue( thread ).first().equal( sentence ) )
    {
      return sentence;
    }
    if( NIL != subl_promotions.memberP( sentence, cb_parameters.$cb_sentence_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED ) )
    {
      cb_parameters.$cb_sentence_history$.setDynamicValue( Sequences.delete( sentence, cb_parameters.$cb_sentence_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    }
    cb_parameters.$cb_sentence_history$.setDynamicValue( ConsesLow.cons( sentence, cb_parameters.$cb_sentence_history$.getDynamicValue( thread ) ), thread );
    if( cb_parameters.$cb_sentence_history_max$.getDynamicValue( thread ).isInteger() && cb_parameters.$cb_sentence_history_max$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      final SubLObject last = conses_high.nthcdr( Numbers.subtract( cb_parameters.$cb_sentence_history_max$.getDynamicValue( thread ), ONE_INTEGER ), cb_parameters.$cb_sentence_history$.getDynamicValue( thread ) );
      if( NIL != last )
      {
        ConsesLow.rplacd( last, NIL );
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65368L)
  public static SubLObject cb_add_sentence_in_mt_to_sentence_history(final SubLObject sentence, final SubLObject mt)
  {
    return ( NIL != el_utilities.ist_sentence_p( sentence, UNPROVIDED ) ) ? cb_add_to_sentence_history( sentence ) : cb_add_to_sentence_history( el_utilities.make_ist_sentence( mt, sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65594L)
  public static SubLObject cb_rem_from_sentence_history(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_sentence_history$.setDynamicValue( Sequences.delete( sentence, cb_parameters.$cb_sentence_history$.getDynamicValue( thread ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65745L)
  public static SubLObject cb_rem_fort_from_sentence_history(final SubLObject fort)
  {
    cb_parameters.$cb_sentence_history$.setDynamicValue( Sequences.delete( fort, cb_sentence_history_items(), $sym440$FIND, $sym443$EXPRESSION_FORTS, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 65921L)
  public static SubLObject cb_clear_sentence_history()
  {
    cb_parameters.$cb_sentence_history$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
  public static SubLObject clear_cb_bookmarked_items()
  {
    final SubLObject cs = $cb_bookmarked_items_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
  public static SubLObject remove_cb_bookmarked_items(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $cb_bookmarked_items_caching_state$.getGlobalValue(), ConsesLow.list( cyclist ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
  public static SubLObject cb_bookmarked_items_internal(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.non_tiny_kb_loadedP() && NIL != forts.fort_p( cyclist ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym445$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( ( NIL != kb_control_vars.date_kb_loaded_p() ) ? ConsesLow.list( $const446$MtSpace, $const447$CyclistsMt, ConsesLow.listS( $const448$MtTimeWithGranularityDimFn, date_utilities
            .indexical_now(), $list449 ) ) : $const447$CyclistsMt, thread );
        return Sort.sort( kb_mapping_utilities.pred_values( cyclist, $const451$cyclistReadilyAvailableTerms, ONE_INTEGER, TWO_INTEGER, UNPROVIDED ), Symbols.symbol_function( $sym25$STRING_ ),
            $sym452$NAME_FOR_ALPHA_SORT );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66016L)
  public static SubLObject cb_bookmarked_items(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    SubLObject caching_state = $cb_bookmarked_items_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym444$CB_BOOKMARKED_ITEMS, $sym453$_CB_BOOKMARKED_ITEMS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym454$CLEAR_CB_BOOKMARKED_ITEMS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cb_bookmarked_items_internal( cyclist ) ) );
      memoization_state.caching_state_put( caching_state, cyclist, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66466L)
  public static SubLObject name_for_alpha_sort(final SubLObject obj)
  {
    if( NIL != cycl_grammar.cycl_denotational_term_p( obj ) )
    {
      return cycl_utilities.denotational_term_name_for_alpha_sort( obj );
    }
    if( NIL != assertion_handles.assertion_p( obj ) )
    {
      return Sequences.cconcatenate( $str455$_, string_utilities.object_to_string( uncanonicalizer.assertion_el_formula( obj ) ) );
    }
    return string_utilities.object_to_string( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66787L)
  public static SubLObject cb_current_relevant_terms()
  {
    return Sequences.cconcatenate( cb_bookmarked_items( UNPROVIDED ), new SubLObject[] { cb_nat_history_items(), cb_constant_history_items()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 66936L)
  public static SubLObject cb_recent_kb_additions(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str456$Recently_Added_KB_Content;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$94 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$95 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
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
            html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str457$float__right );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              cb_utilities.cb_link( $kw458$RECENT_KB_ADDITIONS, $str459$_Refresh_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
            }
            html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
            links_to_recent_kb_additions( UNPROVIDED, UNPROVIDED );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$95, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$94, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 67301L)
  public static SubLObject cb_link_recent_kb_additions(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str461$_Recently_Added_KB_Content;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw16$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str462$cb_recent_kb_additions );
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
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      html_utilities.html_princ( linktext );
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 67563L)
  public static SubLObject links_to_recent_kb_additions(SubLObject n, SubLObject types)
  {
    if( n == UNPROVIDED )
    {
      n = SIXTEEN_INTEGER;
    }
    if( types == UNPROVIDED )
    {
      types = $list464;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( T, thread );
      if( NIL != list_utilities.member_eqP( $kw402$CONSTANT, types ) )
      {
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( $str465$Recent_constants_ );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        if( NIL != subl_promotions.positive_integer_p( n ) )
        {
          final SubLObject list_var = constants_high.constants_around( constant_handles.next_constant_suid(), n, n, UNPROVIDED );
          final SubLObject _prev_bind_0_$99 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str466$mapping_constants_for_sweep, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject o = NIL;
              o = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                html_utilities.html_indent( TWO_INTEGER );
                cb_utilities.cb_form( o, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                o = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$100, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$99, thread );
          }
        }
        else
        {
          final SubLObject idx = constant_handles.do_constants_table();
          final SubLObject mess = $str466$mapping_constants_for_sweep;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$101 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$102 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$102, $kw468$SKIP ) )
              {
                final SubLObject idx_$103 = idx_$102;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$103, $kw468$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$103 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject id;
                  SubLObject o2;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    o2 = Vectors.aref( vector_var, id );
                    if( NIL == id_index.id_index_tombstone_p( o2 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( o2 ) )
                      {
                        o2 = $kw468$SKIP;
                      }
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o2, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$104 = idx_$102;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$104 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$104 );
                  SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$104 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$104 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw468$SKIP ) ) ? NIL : $kw468$SKIP;
                  while ( id2.numL( end_id ))
                  {
                    final SubLObject o3 = Hashtables.gethash_without_values( id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) || NIL == id_index.id_index_tombstone_p( o3 ) )
                    {
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o3, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    id2 = Numbers.add( id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$102, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_11, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_9, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$101, thread );
          }
        }
      }
      if( NIL != list_utilities.member_eqP( $kw469$NART, types ) )
      {
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( $str470$Recent_NARTs_ );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        if( NIL != subl_promotions.positive_integer_p( n ) )
        {
          final SubLObject list_var = narts_high.narts_around( nart_handles.next_nart_id(), n, n, UNPROVIDED );
          final SubLObject _prev_bind_0_$103 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str471$mapping_narts_for_sweep, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject o = NIL;
              o = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                html_utilities.html_indent( TWO_INTEGER );
                cb_utilities.cb_form( o, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                o = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$104, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$103, thread );
          }
        }
        else
        {
          final SubLObject idx = nart_handles.do_narts_table();
          final SubLObject mess = $str471$mapping_narts_for_sweep;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$105 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$105 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$105, $kw468$SKIP ) )
              {
                final SubLObject idx_$106 = idx_$105;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$106, $kw468$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$106 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject id;
                  SubLObject o2;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    o2 = Vectors.aref( vector_var, id );
                    if( NIL == id_index.id_index_tombstone_p( o2 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( o2 ) )
                      {
                        o2 = $kw468$SKIP;
                      }
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o2, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$107 = idx_$105;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$107 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$107 );
                  SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$107 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$107 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw468$SKIP ) ) ? NIL : $kw468$SKIP;
                  while ( id2.numL( end_id ))
                  {
                    final SubLObject o3 = Hashtables.gethash_without_values( id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) || NIL == id_index.id_index_tombstone_p( o3 ) )
                    {
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o3, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    id2 = Numbers.add( id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_11, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_9, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$105, thread );
          }
        }
      }
      if( NIL != list_utilities.member_eqP( $kw404$ASSERTION, types ) )
      {
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( $str472$Recent_assertions_ );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        if( NIL != subl_promotions.positive_integer_p( n ) )
        {
          final SubLObject list_var = assertions_high.assertions_around( assertion_handles.next_assertion_id(), n, n, UNPROVIDED );
          final SubLObject _prev_bind_0_$107 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str473$mapping_assertions_for_sweep, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject o = NIL;
              o = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                html_utilities.html_indent( TWO_INTEGER );
                cb_utilities.cb_show_assertion_readably( o, T, T );
                html_utilities.html_newline( UNPROVIDED );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                o = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values5 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values5 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$108, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$107, thread );
          }
        }
        else
        {
          final SubLObject idx = assertion_handles.do_assertions_table();
          final SubLObject mess = $str473$mapping_assertions_for_sweep;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$109 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$108 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$108, $kw468$SKIP ) )
              {
                final SubLObject idx_$109 = idx_$108;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$109, $kw468$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$109 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject a_id;
                  SubLObject a_handle;
                  SubLObject o4;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    a_handle = Vectors.aref( vector_var, a_id );
                    if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                      {
                        a_handle = $kw468$SKIP;
                      }
                      o4 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_show_assertion_readably( o4, T, T );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$110 = idx_$108;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$110 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$110 );
                  SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$110 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$110 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw468$SKIP ) ) ? NIL : $kw468$SKIP;
                  while ( a_id2.numL( end_id ))
                  {
                    final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                    {
                      final SubLObject o2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_show_assertion_readably( o2, T, T );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values6 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values6 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$110, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_11, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_9, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$109, thread );
          }
        }
      }
      if( NIL != list_utilities.member_eqP( $kw474$DEDUCTION, types ) )
      {
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( $str475$Recent_deductions_ );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        if( NIL != subl_promotions.positive_integer_p( n ) )
        {
          final SubLObject list_var = deductions_high.deductions_around( deduction_handles.next_deduction_id(), n, n, UNPROVIDED );
          final SubLObject _prev_bind_0_$111 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str476$mapping_deductions_for_sweep, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject o = NIL;
              o = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                html_utilities.html_indent( TWO_INTEGER );
                cb_utilities.cb_form( o, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                o = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values7 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values7 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$112, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$111, thread );
          }
        }
        else
        {
          final SubLObject idx = deduction_handles.do_deductions_table();
          final SubLObject mess = $str476$mapping_deductions_for_sweep;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$113 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$111 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$111, $kw468$SKIP ) )
              {
                final SubLObject idx_$112 = idx_$111;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$112, $kw468$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$112 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject o4;
                  SubLObject d_id;
                  SubLObject d_handle;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    d_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    d_handle = Vectors.aref( vector_var, d_id );
                    if( NIL == id_index.id_index_tombstone_p( d_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( d_handle ) )
                      {
                        d_handle = $kw468$SKIP;
                      }
                      o4 = deduction_handles.resolve_deduction_id_value_pair( d_id, d_handle );
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o4, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$113 = idx_$111;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$113 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$113 );
                  SubLObject d_id2 = id_index.id_index_sparse_id_threshold( idx_$113 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$113 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw468$SKIP ) ) ? NIL : $kw468$SKIP;
                  while ( d_id2.numL( end_id ))
                  {
                    final SubLObject d_handle2 = Hashtables.gethash_without_values( d_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) || NIL == id_index.id_index_tombstone_p( d_handle2 ) )
                    {
                      final SubLObject o2 = deduction_handles.resolve_deduction_id_value_pair( d_id2, d_handle2 );
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o2, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    d_id2 = Numbers.add( d_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values8 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values8 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_11, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_9, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$113, thread );
          }
        }
      }
      if( NIL != list_utilities.member_eqP( $kw477$KB_HL_SUPPORTS, types ) )
      {
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( $str478$Recent_KB_HL_supports_ );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        if( NIL != subl_promotions.positive_integer_p( n ) )
        {
          final SubLObject list_var = kb_hl_supports_high.kb_hl_supports_around( kb_hl_support_handles.next_kb_hl_support_id(), n, n, UNPROVIDED );
          final SubLObject _prev_bind_0_$115 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str479$mapping_kb_hl_supports_for_sweep, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject o = NIL;
              o = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                html_utilities.html_indent( TWO_INTEGER );
                cb_utilities.cb_form( o, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                o = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values9 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values9 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$116, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$115, thread );
          }
        }
        else
        {
          final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
          final SubLObject mess = $str479$mapping_kb_hl_supports_for_sweep;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$117 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$114 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$114, $kw468$SKIP ) )
              {
                final SubLObject idx_$115 = idx_$114;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$115, $kw468$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$115 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject o4;
                  SubLObject s_id;
                  SubLObject s_handle;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    s_handle = Vectors.aref( vector_var, s_id );
                    if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                      {
                        s_handle = $kw468$SKIP;
                      }
                      o4 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o4, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$116 = idx_$114;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$116 ) || NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$116 );
                  SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$116 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$116 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw468$SKIP ) ) ? NIL : $kw468$SKIP;
                  while ( s_id2.numL( end_id ))
                  {
                    final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw468$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
                    {
                      final SubLObject o2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_form( o2, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_newline( UNPROVIDED );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    s_id2 = Numbers.add( s_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values10 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values10 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$118, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_11, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_10, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_9, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$117, thread );
          }
        }
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 69121L)
  public static SubLObject cb_handle_interactor(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str483$the_SubLisp_Interactor );
    }
    else
    {
      SubLObject interactor_string = NIL;
      SubLObject default_string = NIL;
      if( NIL != args )
      {
        interactor_string = html_utilities.html_extract_input( $str484$interactor, args );
        if( interactor_string.isString() )
        {
          interactor_string = cb_form_widgets.cb_normalize_formula_string( interactor_string );
        }
      }
      final SubLObject title_var = $str485$SubL_Interactor;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$134 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw6$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$135 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str9$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str10$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str11$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str12$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str13$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$137, thread );
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
              html_utilities.html_markup( $str14$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str486$cb_handle_interactor, T, UNPROVIDED );
                final SubLObject documentation_requestP = html_utilities.html_extract_input( $str487$document, args );
                final SubLObject input_string = html_utilities.html_extract_input( $str488$input_string, args );
                if( NIL != args )
                {
                  if( NIL != input_string )
                  {
                    default_string = input_string;
                  }
                  else
                  {
                    default_string = cb_interactor_results( interactor_string, documentation_requestP );
                    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  }
                }
                if( NIL != default_string && Sequences.length( default_string ).numE( ZERO_INTEGER ) )
                {
                  default_string = NIL;
                }
                cb_show_handle_interactor( default_string );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$138, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$136, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$135, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$134, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 70233L)
  public static SubLObject cb_show_handle_interactor(final SubLObject default_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_form_widgets.$cb_use_subl_code_editorP$.getDynamicValue( thread ) )
    {
      cyc_file_dependencies.javascript( $kw492$HTML_EDITOR_SCRIPTS );
    }
    cb_utilities.cb_help_preamble( $kw490$CB_HANDLE_INTERACTOR, UNPROVIDED, UNPROVIDED );
    html_utilities.html_submit_input( $str493$Eval, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str494$Enter_A_Form__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_indent( TWO_INTEGER );
    if( NIL != default_string )
    {
      html_utilities.html_reset_input( $str495$Reset );
      html_utilities.html_indent( UNPROVIDED );
    }
    if( NIL == cb_form_widgets.$cb_use_subl_code_editorP$.getDynamicValue( thread ) )
    {
      html_script_utilities.html_clear_input_button( $str484$interactor, $str190$Clear, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_complete.html_complete_button( $str484$interactor, $str189$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_complete.html_cyclify_button( $str484$interactor, $str496$Cyclify, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    if( NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str484$interactor );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != $cb_interactor_width$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $cb_interactor_width$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != $cb_interactor_height$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $cb_interactor_height$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue() )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != default_string )
        {
          html_utilities.html_princ( default_string );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str484$interactor );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != $cb_interactor_width$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $cb_interactor_width$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != $cb_interactor_height$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $cb_interactor_height$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue() )
      {
        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != default_string )
        {
          html_utilities.html_princ( default_string );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 71537L)
  public static SubLObject cb_interactor_results(final SubLObject interactor_string, final SubLObject documentation_requestP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( Sequences.length( interactor_string ).numE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject form = reader.read_from_string_ignoring_errors( interactor_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    final SubLObject read_remainder = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( read_remainder == $kw497$ERROR )
    {
      final SubLObject color_val = $kw498$RED;
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != color_val )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( color_val ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str499$Malformed_expression___ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_macros.verify_not_within_html_pre();
      html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
      _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
      try
      {
        html_macros.$within_html_pre$.bind( T, thread );
        html_utilities.html_princ( interactor_string );
      }
      finally
      {
        html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
      return interactor_string;
    }
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str500$Last_Form_Evaluated___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_macros.verify_not_within_html_pre();
    html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
    final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding( thread );
    try
    {
      html_macros.$within_html_pre$.bind( T, thread );
      html_utilities.html_string( interactor_string, ZERO_INTEGER, read_remainder );
    }
    finally
    {
      html_macros.$within_html_pre$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str501$Results___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    SubLObject results = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym502$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject _prev_bind_0_$139 = StreamsLow.$standard_output$.currentBinding( thread );
          final SubLObject _prev_bind_4 = StreamsLow.$error_output$.currentBinding( thread );
          try
          {
            StreamsLow.$standard_output$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
            StreamsLow.$error_output$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
            process_utilities.current_process_note_form( form );
            results = eval_in_api.cyc_api_eval( ConsesLow.list( $sym503$MULTIPLE_VALUE_LIST, form ) );
          }
          finally
          {
            StreamsLow.$error_output$.rebind( _prev_bind_4, thread );
            StreamsLow.$standard_output$.rebind( _prev_bind_0_$139, thread );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_3, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject color_val2 = $kw498$RED;
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != color_val2 )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( color_val2 ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_5 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str504$ERROR___ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_5, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( error_message );
      html_utilities.html_newline( TWO_INTEGER );
    }
    if( NIL != error_message )
    {
      return interactor_string;
    }
    SubLObject cdolist_list_var = results;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cb_utilities.cb_form( result, ZERO_INTEGER, T );
      html_utilities.html_newline( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return string_utilities.substring( interactor_string, read_remainder, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 73831L)
  public static SubLObject cb_link_interactor(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str505$Interactor;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str486$cb_handle_interactor );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 74110L)
  public static SubLObject cb_guess_function(final SubLObject string)
  {
    SubLObject position_stack = NIL;
    SubLObject end_var_$140;
    SubLObject end_var;
    SubLObject i;
    SubLObject pcase_var;
    SubLObject v_char;
    for( end_var = ( end_var_$140 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$140 ); i = number_utilities.f_1X( i ) )
    {
      v_char = ( pcase_var = Strings.sublisp_char( string, i ) );
      if( pcase_var.eql( Characters.CHAR_lparen ) )
      {
        position_stack = ConsesLow.cons( i, position_stack );
      }
      else if( pcase_var.eql( Characters.CHAR_rparen ) )
      {
        position_stack = position_stack.rest();
      }
    }
    SubLObject cdolist_list_var = position_stack;
    SubLObject position = NIL;
    position = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject obj = reader.read_from_string_ignoring_errors( string, NIL, NIL, Numbers.add( position, ONE_INTEGER ), UNPROVIDED );
      if( obj.isSymbol() && NIL != Symbols.fboundp( obj ) )
      {
        return obj;
      }
      cdolist_list_var = cdolist_list_var.rest();
      position = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 74571L)
  public static SubLObject cb_arglist(final SubLObject args)
  {
    html_utilities.html_princ( $str509$_ );
    if( NIL != args )
    {
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !arg.eql( args.first() ) )
        {
          html_utilities.html_princ( $str510$_ );
        }
        cb_arglist_rec( arg );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    html_utilities.html_princ( $str511$_ );
    return args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 74773L)
  public static SubLObject cb_arglist_rec(final SubLObject obj)
  {
    if( NIL == obj )
    {
      html_utilities.html_princ( $str311$nil );
    }
    else if( obj.isKeyword() )
    {
      html_utilities.html_prin1( obj );
    }
    else if( obj.isSymbol() )
    {
      html_utilities.html_princ( Strings.string_downcase( Symbols.symbol_name( obj ), UNPROVIDED, UNPROVIDED ) );
    }
    else if( obj.isAtom() )
    {
      html_utilities.html_prin1( obj );
    }
    else if( Sequences.length( obj ).numE( TWO_INTEGER ) && obj.first() == $sym512$FUNCTION && conses_high.second( obj ).isSymbol() && NIL != Symbols.fboundp( conses_high.second( obj ) ) )
    {
      html_utilities.html_princ( $str513$__ );
      cb_arglist_rec( conses_high.second( obj ) );
    }
    else if( Sequences.length( obj ).numE( TWO_INTEGER ) && obj.first() == $sym48$QUOTE )
    {
      html_utilities.html_princ( $str514$_ );
      cb_arglist_rec( conses_high.second( obj ) );
    }
    else
    {
      html_utilities.html_princ( $str509$_ );
      SubLObject rest = NIL;
      SubLObject next = NIL;
      rest = obj;
      next = rest.first();
      while ( rest.rest().isCons())
      {
        if( !rest.eql( obj ) )
        {
          html_utilities.html_indent( ONE_INTEGER );
        }
        cb_arglist_rec( next );
        rest = rest.rest();
        next = rest.first();
      }
      if( !rest.eql( obj ) )
      {
        html_utilities.html_indent( ONE_INTEGER );
      }
      cb_arglist_rec( next );
      if( NIL != rest.rest() )
      {
        html_utilities.html_princ( $str515$___ );
        cb_arglist_rec( rest.rest() );
      }
      html_utilities.html_princ( $str511$_ );
    }
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 75954L)
  public static SubLObject cb_save_interface_state()
  {
    SubLObject savedP = NIL;
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str520$Save_Interface );
    }
    else
    {
      final SubLObject filename = user_preferences_file_name( operation_communication.the_cyclist() );
      savedP = html_kernel.save_html_state_to_file( filename, utilities_macros.$html_interface_variables$.getGlobalValue() );
      if( NIL != savedP )
      {
        $html_state_filename$.setDynamicValue( filename );
      }
    }
    return savedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 76465L)
  public static SubLObject cb_load_user_preferences(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject successP = load_user_preferences();
    if( NIL != successP )
    {
      cb_utilities.cb_message_page_with_history( $str522$Interface_Settings_Loaded_Success, T );
    }
    else
    {
      cb_utilities.cb_simple_message_page( $str523$No_Interface_Settings_File_To_Loa, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 76899L)
  public static SubLObject load_user_preferences()
  {
    final SubLObject filename = user_preferences_file_name( UNPROVIDED );
    SubLObject preferences_loadedP = NIL;
    clear_user_preferences();
    if( NIL != Filesys.probe_file( filename ) )
    {
      html_kernel.restore_html_state_from_file( filename );
      preferences_loadedP = T;
    }
    else if( NIL != default_preference_file_existsP() )
    {
      html_kernel.restore_html_state_from_file( default_preference_file() );
      preferences_loadedP = T;
    }
    return preferences_loadedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 77668L)
  public static SubLObject user_preferences_file_name(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user_part = ( NIL != constant_handles.constant_p( cyclist ) ) ? constants_high.constant_name( cyclist )
        : ( ( cyclist == $kw277$DEFAULT ) ? $str521$default : kb_utilities.compact_hl_external_id_string( cyclist ) );
    return Strings.string_downcase( Filesys.construct_filename( $user_preference_directory_list$.getDynamicValue( thread ), user_part, $user_preference_file_extension$.getDynamicValue( thread ), T ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78087L)
  public static SubLObject clear_user_preferences()
  {
    cb_query.$cb_default_query_parameters$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78239L)
  public static SubLObject default_preference_file_existsP()
  {
    return list_utilities.sublisp_boolean( Filesys.probe_file( default_preference_file() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78416L)
  public static SubLObject default_preference_file()
  {
    return user_preferences_file_name( $kw277$DEFAULT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 78868L)
  public static SubLObject cb_load_api(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str528$the_KE_Load_Page );
      return NIL;
    }
    final SubLObject title_var = $str529$Load_API_Expressions_Page;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$141 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$142 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$144, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str530$cb_load_api_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw526$CB_LOAD_API, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( THREE_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str531$Please_type_in_the_name_of_the_fi );
              html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
              html_utilities.html_princ( $str532$_Load_File__ );
              html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
              html_utilities.html_princ( $str533$button_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_text_input( $str534$load_api_file_name, NIL, $cb_load_api_input_size$.getDynamicValue( thread ) );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_reset_input( $str190$Clear );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str535$Load_File, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$145, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$143, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$142, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$141, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 79758L)
  public static SubLObject cb_load_api_handler(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str528$the_KE_Load_Page );
      return NIL;
    }
    if( NIL == args )
    {
      cb_utilities.cb_error( $str537$cb_load_api_handler_called_with_n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject title_var = $str538$Load_API_Expressions_Results;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$146 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$147 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$149, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str530$cb_load_api_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw526$CB_LOAD_API, UNPROVIDED, UNPROVIDED );
              SubLObject file_name = html_utilities.html_extract_input( $str534$load_api_file_name, args );
              SubLObject skip_amount = html_utilities.html_extract_input( $str539$load_api_file_skip, args );
              file_name = string_utilities.trim_whitespace( file_name );
              if( NIL == skip_amount )
              {
                skip_amount = ZERO_INTEGER;
              }
              if( skip_amount.isString() )
              {
                skip_amount = reader.read_from_string_ignoring_errors( skip_amount, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              if( file_name.isString() )
              {
                if( NIL != Filesys.probe_file( file_name ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject status = batch_ke.load_api_internal( file_name, skip_amount );
                  final SubLObject count = thread.secondMultipleValue();
                  final SubLObject position = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  html_utilities.html_princ( $str540$The_file__ );
                  html_utilities.html_princ( file_name );
                  html_utilities.html_princ( $str541$__was_loaded___Here_are_the_resul );
                  html_utilities.html_newline( TWO_INTEGER );
                  if( status.equalp( $kw542$SUCCESS ) )
                  {
                    html_utilities.html_indent( FOUR_INTEGER );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str543$Successfully_and_completely_loade );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  else
                  {
                    cb_load_api_continue( file_name, status, count, position );
                  }
                }
                else
                {
                  cb_utilities.cb_error( $str544$File__s_does_not_exist_, file_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              else
              {
                cb_utilities.cb_error( $str545$KE_filename_was_not_a_string_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$150, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$148, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$147, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$146, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 81444L)
  public static SubLObject cb_load_api_continue(final SubLObject file_name, final SubLObject status, final SubLObject count, SubLObject position)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( status.equalp( $kw547$FILE_NOT_FOUND ) )
    {
      cb_utilities.cb_error( $str544$File__s_does_not_exist_, file_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
      html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str14$post );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
      final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_macros.$within_html_form$.bind( T, thread );
        html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
        html_utilities.html_hidden_input( $str530$cb_load_api_handler, T, UNPROVIDED );
        html_utilities.html_indent( THREE_INTEGER );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str548$An_error_occurred_after_processin );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( count );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str549$_forms_ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_indent( THREE_INTEGER );
        html_utilities.html_princ( status );
        html_utilities.html_newline( TWO_INTEGER );
        html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( $str550$Form_Number );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str551$You_may_continue_processing_this_ );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_text_input( $str539$load_api_file_skip, count, $cb_load_api_skip_input_size$.getDynamicValue( thread ) );
        html_utilities.html_newline( TWO_INTEGER );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( $str552$KE_File_Name );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str553$You_may_also_specify_a_new_file_t );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_text_input( $str534$load_api_file_name, file_name, $cb_load_api_input_size$.getDynamicValue( thread ) );
        html_utilities.html_newline( TWO_INTEGER );
        html_utilities.html_reset_input( $str495$Reset );
        html_utilities.html_indent( TWO_INTEGER );
        html_utilities.html_submit_input( $str535$Load_File, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( TWO_INTEGER );
        html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
      }
      finally
      {
        html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
        html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 83660L)
  public static SubLObject cb_show_when(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str556$the_Display_by_Date );
      return NIL;
    }
    final SubLObject title_var = $str557$Display_by_Date;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$151 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$152 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$154, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str558$cb_show_when_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw554$CB_SHOW_WHEN, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_reset_input( $str495$Reset );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str138$Submit, UNPROVIDED, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str559$What_kind_of_data_do_you_want_to_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_radio_input( $str560$cb_show_type, $cb_show_constant_value$.getGlobalValue(), T, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str561$Constants );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_radio_input( $str560$cb_show_type, $cb_show_assertion_value$.getGlobalValue(), NIL, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str562$Assertions );
              html_utilities.html_newline( TWO_INTEGER );
              thread.resetMultipleValues();
              final SubLObject day = numeric_date_utilities.decode_universal_date( numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ) );
              final SubLObject month = thread.secondMultipleValue();
              final SubLObject year = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str563$Enter_in_the_start_date_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str564$Month );
              html_utilities.html_text_input( $str565$cb_show_start_month, month, TWO_INTEGER );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str566$Day );
              html_utilities.html_text_input( $str567$cb_show_start_day, day, TWO_INTEGER );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str568$Year );
              html_utilities.html_text_input( $str569$cb_show_start_year, year, FOUR_INTEGER );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str570$Enter_in_the_ending_date_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str564$Month );
              html_utilities.html_text_input( $str571$cb_show_end_month, month, TWO_INTEGER );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str566$Day );
              html_utilities.html_text_input( $str572$cb_show_end_day, day, TWO_INTEGER );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_princ( $str568$Year );
              html_utilities.html_text_input( $str573$cb_show_end_year, year, FOUR_INTEGER );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str574$Enter_the_cyclist_to_examine__bla );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_complete.html_complete_button( $str575$cb_show_cyclist, $str189$Complete, $const283$Cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_text_input( $str575$cb_show_cyclist, operation_communication.the_cyclist(), $int576$24 );
              html_utilities.html_indent( UNPROVIDED );
              html_script_utilities.html_clear_input_button( $str575$cb_show_cyclist, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str577$Enter_the_project_to_examine__bla );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_complete.html_complete_button( $str578$cb_show_project, $str189$Complete, $const579$Cyc_BasedProject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_text_input( $str578$cb_show_project, $str339$, $int576$24 );
              html_utilities.html_indent( UNPROVIDED );
              html_script_utilities.html_clear_input_button( $str578$cb_show_project, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$155, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$153, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$152, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$151, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 86282L)
  public static SubLObject cb_show_check_values(final SubLObject args)
  {
    if( NIL != html_utilities.html_extract_input( $str560$cb_show_type, args ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 86540L)
  public static SubLObject cb_show_when_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cb_show_check_values( args ) )
    {
      cb_utilities.cb_error( $str583$Please_specify_either_a_Constant_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject search_type = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str560$cb_show_type, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cyclist = string_utilities.trim_whitespace( html_utilities.html_extract_input( $str575$cb_show_cyclist, args ) );
    SubLObject project = string_utilities.trim_whitespace( html_utilities.html_extract_input( $str578$cb_show_project, args ) );
    final SubLObject start_day = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str567$cb_show_start_day, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject start_month = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str565$cb_show_start_month, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject start_year = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str569$cb_show_start_year, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject start_date = numeric_date_utilities.encode_universal_date( start_day, start_month, start_year );
    final SubLObject end_day = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str572$cb_show_end_day, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject end_month = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str571$cb_show_end_month, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject end_year = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str573$cb_show_end_year, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject end_date = numeric_date_utilities.encode_universal_date( end_day, end_month, end_year );
    if( $str339$.equalp( cyclist ) )
    {
      cyclist = NIL;
    }
    else
    {
      cyclist = cb_utilities.cb_guess_fort( cyclist, UNPROVIDED );
      if( NIL == forts.fort_p( cyclist ) )
      {
        cb_utilities.cb_error( $str584$Unknown_cyclist___S, cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
    }
    if( $str339$.equalp( project ) )
    {
      project = NIL;
    }
    else
    {
      project = cb_utilities.cb_guess_fort( project, UNPROVIDED );
      if( NIL == forts.fort_p( project ) )
      {
        cb_utilities.cb_error( $str585$Unknown_project___S, project, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
    }
    final SubLObject title_var = $str586$Date_Search_Results;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$156 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$157 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$159, thread );
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
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw581$CB_SHOW_WHEN_HANDLER, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str587$Listing_ );
              if( search_type.equalp( $cb_show_constant_value$.getGlobalValue() ) )
              {
                html_utilities.html_princ( $str588$constants );
              }
              else
              {
                html_utilities.html_princ( $str589$assertions );
              }
              html_utilities.html_princ( $str590$_created_from_ );
              cb_utilities.cb_show_date( start_date );
              html_utilities.html_princ( $str591$_to_ );
              cb_utilities.cb_show_date( end_date );
              if( NIL != cyclist )
              {
                html_utilities.html_princ( $str592$_by_ );
                cb_utilities.cb_show_term( cyclist, UNPROVIDED, UNPROVIDED );
              }
              if( NIL != project )
              {
                html_utilities.html_princ( $str593$_for_ );
                cb_utilities.cb_show_term( project, UNPROVIDED, UNPROVIDED );
              }
              html_utilities.html_princ( $str188$__ );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject form_to_eval = search_type.equalp( $cb_show_constant_value$.getGlobalValue() ) ? ( ( NIL != project ) ? ConsesLow.list( $sym594$CONSTANTS_FOR_PROJECTS_BETWEEN, project, start_date,
                  end_date, cyclist ) : ConsesLow.list( $sym595$CONSTANTS_CREATED_BETWEEN, start_date, end_date, cyclist ) )
                  : ( ( NIL != project ) ? ConsesLow.list( $sym596$ASSERTIONS_FOR_PROJECTS_BETWEEN, project, start_date, end_date, cyclist )
                      : ConsesLow.list( $sym597$ASSERTIONS_BETWEEN, start_date, end_date, cyclist ) );
              final SubLObject result_var = search_type.equalp( $cb_show_constant_value$.getGlobalValue() ) ? $sym598$_CONSTANT : $sym599$_ASSERTION;
              final SubLObject query = ConsesLow.list( $const600$thereExists, $sym601$_TERM_LIST, ConsesLow.list( $const602$and, ConsesLow.list( $const603$evaluate, $sym601$_TERM_LIST, ConsesLow.list(
                  $const604$EvaluateSubLFn, ConsesLow.list( $const605$SubLQuoteFn, form_to_eval ) ) ), ConsesLow.listS( $const606$memberOfList, result_var, $list607 ) ) );
              thread.resetMultipleValues();
              final SubLObject result = inference_kernel.new_cyc_query( query, $const608$BaseKB, $list609 );
              final SubLObject halt_reason = thread.secondMultipleValue();
              final SubLObject inference = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if( halt_reason != $kw610$EXHAUST_TOTAL )
              {
                Errors.warn( $str611$Expected_When_Tool_inference_halt, halt_reason );
              }
              SubLObject show_list = NIL;
              SubLObject cdolist_list_var = result;
              SubLObject binding_list = NIL;
              binding_list = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject binding = list_utilities.only_one( binding_list );
                final SubLObject v_term = bindings.variable_binding_value( binding );
                show_list = ConsesLow.cons( v_term, show_list );
                cdolist_list_var = cdolist_list_var.rest();
                binding_list = cdolist_list_var.first();
              }
              show_list = Sequences.nreverse( show_list );
              cb_show_display_results( search_type, show_list, inference );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$160, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$158, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$157, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$156, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 90487L)
  public static SubLObject cb_show_display_results(final SubLObject search_type, final SubLObject show_list, final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == show_list )
    {
      html_utilities.html_indent( THREE_INTEGER );
      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_utilities.html_princ( $str613$None_for_the_given_time_period_ );
      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      html_utilities.html_newline( TWO_INTEGER );
      return NIL;
    }
    SubLObject last_cyclist = NIL;
    SubLObject last_date = NIL;
    SubLObject last_reviewer = NIL;
    final SubLObject constant_searchP = Equality.equalp( search_type, $cb_show_constant_value$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str614$_a__a___, Sequences.length( show_list ), ( NIL != constant_searchP ) ? $str588$constants : $str589$assertions );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cb_utilities.cb_link( $kw615$SAVE_INFERENCE_ANSWERS, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    SubLObject cdolist_list_var = show_list;
    SubLObject listing = NIL;
    listing = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constant_searchP )
      {
        if( !last_cyclist.equalp( bookkeeping_store.creator( listing, UNPROVIDED ) ) )
        {
          last_cyclist = bookkeeping_store.creator( listing, UNPROVIDED );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          cb_utilities.cb_show_term( last_cyclist, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
          last_date = NIL;
        }
        if( !last_date.equalp( bookkeeping_store.creation_time( listing, UNPROVIDED ) ) )
        {
          last_date = bookkeeping_store.creation_time( listing, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( THREE_INTEGER );
          cb_utilities.cb_show_date( last_date );
        }
        if( !last_reviewer.equalp( kb_accessors.reviewer( listing, UNPROVIDED ) ) )
        {
          last_reviewer = kb_accessors.reviewer( listing, UNPROVIDED );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          cb_utilities.cb_show_term( last_reviewer, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        }
      }
      else
      {
        if( !last_cyclist.equalp( assertions_high.asserted_by( listing ) ) )
        {
          last_cyclist = assertions_high.asserted_by( listing );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          cb_utilities.cb_show_term( last_cyclist, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
          last_date = NIL;
        }
        if( !last_date.equalp( assertions_high.asserted_when( listing ) ) )
        {
          last_date = assertions_high.asserted_when( listing );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( THREE_INTEGER );
          cb_utilities.cb_show_date( last_date );
        }
      }
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( SIX_INTEGER );
      cb_utilities.cb_form( listing, UNPROVIDED, UNPROVIDED );
      if( NIL != assertion_handles.assertion_p( listing ) )
      {
        html_utilities.html_princ( $str616$_in_ );
        cb_utilities.cb_show_term( assertions_high.assertion_mt( listing ), UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      listing = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 92516L)
  public static SubLObject cb_link_show_when(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str617$When;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str618$cb_show_when );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 92975L)
  public static SubLObject cb_index_overlap(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str624$Index_Overlap;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$164, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str625$cb_handle_index_overlap, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw622$CB_INDEX_OVERLAP, UNPROVIDED, UNPROVIDED );
              html_utilities.html_submit_input( $str626$Search, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_reset_input( $str190$Clear );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str627$Enter_required_terms_separated_by );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_complete.html_complete_button( $str628$terms, $str189$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_complete.html_cyclify_button( $str628$terms, $str496$Cyclify, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str628$terms );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int482$80 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TEN_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$166, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str629$Enter_terms_to_exclude_separated_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_complete.html_complete_button( $str630$exclude_terms, $str189$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_complete.html_cyclify_button( $str630$exclude_terms, $str496$Cyclify, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str630$exclude_terms );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int482$80 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TEN_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$167, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$165, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$163, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$162, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$161, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 93899L)
  public static SubLObject cb_handle_index_overlap(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constants = NIL;
    SubLObject exclude_constants = NIL;
    SubLObject error = NIL;
    thread.resetMultipleValues();
    final SubLObject constants_$168 = cb_utilities.read_multiple_terms_from_string( html_utilities.html_extract_input( $str628$terms, args ) );
    final SubLObject error_$169 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    constants = constants_$168;
    error = error_$169;
    if( NIL != error )
    {
      return cb_utilities.cb_error( $str632$Error_reading_terms___Check_for_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject exclude_constants_$170 = cb_utilities.read_multiple_terms_from_string( html_utilities.html_extract_input( $str630$exclude_terms, args ) );
    final SubLObject error_$170 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    exclude_constants = exclude_constants_$170;
    error = error_$170;
    if( NIL != error )
    {
      return cb_utilities.cb_error( $str633$Error_reading_exclude_terms___Che, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    constants = Sequences.nreverse( constants );
    final SubLObject title_var = $str634$Index_Overlap_Results;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$172 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$173 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$175, thread );
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
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw622$CB_INDEX_OVERLAP, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str635$Search_Terms__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              if( NIL == constants )
              {
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_princ( $str351$None );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str636$Please_enter_some_valid_search_te );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              }
              else
              {
                SubLObject cdolist_list_var = constants;
                SubLObject constant = NIL;
                constant = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  html_utilities.html_newline( UNPROVIDED );
                  cb_utilities.cb_show_term( constant, UNPROVIDED, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  constant = cdolist_list_var.first();
                }
                html_utilities.html_newline( TWO_INTEGER );
                if( NIL != exclude_constants )
                {
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str637$Excluded_Terms__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  cdolist_list_var = exclude_constants;
                  SubLObject exclude_constant = NIL;
                  exclude_constant = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    html_utilities.html_newline( UNPROVIDED );
                    cb_utilities.cb_show_term( exclude_constant, UNPROVIDED, UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    exclude_constant = cdolist_list_var.first();
                  }
                  html_utilities.html_newline( TWO_INTEGER );
                }
                if( NIL != list_utilities.singletonP( constants ) )
                {
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str638$Please_enter_more_than_1_search_t );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                }
                else
                {
                  SubLObject assertions = NIL;
                  final SubLObject _prev_bind_0_$177 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$178 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym639$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const640$EverythingPSC, thread );
                    assertions = virtual_indexing.assertions_mentioning_terms( constants, T );
                    if( NIL != exclude_constants )
                    {
                      SubLObject new_assertions = NIL;
                      SubLObject cdolist_list_var2 = assertions;
                      SubLObject assertion = NIL;
                      assertion = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        SubLObject excludeP = NIL;
                        if( NIL == excludeP )
                        {
                          SubLObject csome_list_var = exclude_constants;
                          SubLObject exclude_constant2 = NIL;
                          exclude_constant2 = csome_list_var.first();
                          while ( NIL == excludeP && NIL != csome_list_var)
                          {
                            if( NIL != list_utilities.tree_find( exclude_constant2, uncanonicalizer.assertion_el_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                            {
                              excludeP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            exclude_constant2 = csome_list_var.first();
                          }
                        }
                        if( NIL == excludeP )
                        {
                          new_assertions = ConsesLow.cons( assertion, new_assertions );
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion = cdolist_list_var2.first();
                      }
                      assertions = new_assertions;
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_1_$178, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$177, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str641$Index_Overlap___ );
                  html_utilities.html_princ( Sequences.length( assertions ) );
                  html_utilities.html_princ( $str642$_assertions_found_ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  if( NIL != assertions )
                  {
                    SubLObject cdolist_list_var3 = assertions;
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var3.first();
                    while ( NIL != cdolist_list_var3)
                    {
                      html_utilities.html_newline( UNPROVIDED );
                      cb_utilities.cb_show_assertion_readably( assertion2, T, UNPROVIDED );
                      cdolist_list_var3 = cdolist_list_var3.rest();
                      assertion2 = cdolist_list_var3.first();
                    }
                  }
                }
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$176, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$174, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$173, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$172, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 96075L)
  public static SubLObject cb_link_index_overlap(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str644$Overlap;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str645$cb_index_overlap );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 96363L)
  public static SubLObject cb_link_owl_import(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str650$OWL_Import;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str651$cb_owl_import );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 96363L)
  public static SubLObject cb_link_owl_export(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str656$OWL_Export;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str657$cb_owl_export );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 97416L)
  public static SubLObject cb_link_compose(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str664$Compose;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str665$ke_compose );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 98065L)
  public static SubLObject cb_link_navigator(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str669$Navigator;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str670$cyc_navigator );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 98800L)
  public static SubLObject cb_link_doc(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str678$Doc;
    }
    final SubLObject target = ( NIL != cb_parameters.$cb_separate_doc_frame$.getDynamicValue( thread ) ) ? $kw675$DOC : $kw34$MAIN;
    final SubLObject frame = cb_utilities.cb_frame_name( target );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( cb_utilities.cyc_documentation_toc() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 99984L)
  public static SubLObject cyc_server_url(final SubLObject host, final SubLObject port_offset, SubLObject handler)
  {
    if( handler == UNPROVIDED )
    {
      handler = $str681$cb_start;
    }
    return Sequences.cconcatenate( $str682$http___, new SubLObject[] { host, $str683$_, print_high.princ_to_string( Numbers.add( $int684$3602, port_offset ) ), http_kernel.$http_cgi_bin_directory$.getGlobalValue(),
      $str685$_cyccgi, Sequences.cconcatenate( $str686$_localhost, format_nil.format_nil_a_no_copy( port_offset ) ), http_kernel.$http_cg_url$.getGlobalValue(), handler
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 103434L)
  public static SubLObject cb_link_kb_monitor_index_hook(final SubLObject index_hook, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str687$_Monitor_;
    }
    final SubLObject href = Sequences.cconcatenate( $str682$http___, new SubLObject[] { format_nil.format_nil_a_no_copy( web_utilities.effective_servlet_container_host() ), $str683$_, format_nil.format_nil_a_no_copy(
        web_utilities.effective_servlet_container_port() ), $str688$_kbmonitor_makequery_jsp_kbq_stri, format_nil.format_nil_a_no_copy( cycl_utilities.denotational_term_name( index_hook ) ), $str689$_cyc_host_string_,
      format_nil.format_nil_a_no_copy( misc_utilities.hostname() ), $str690$_cyc_port_string_, format_nil.format_nil_a_no_copy( html_kernel.html_port() )
    } );
    final SubLObject window_name = Sequences.cconcatenate( kb_utilities.compact_hl_external_id_string( index_hook ), $str691$_kbmonitor );
    final SubLObject onclick = html_script_utilities.html_popup_onclick( window_name, $int692$600, $int693$400, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_script_utilities.html_popup_script();
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( href );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str339$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( onclick );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
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
    return index_hook;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 104228L)
  public static SubLObject cb_jstack_trace(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title = Sequences.cconcatenate( $str696$Jstack_for_process_, format_nil.format_nil_s_no_copy( system_administration_utilities.get_process_id_in_jrtl() ) );
    final SubLObject refresh = NIL;
    html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw6$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( title );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      if( NIL != refresh )
      {
        html_utilities.html_refresh( refresh, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$179 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject list_var = NIL;
          SubLObject line = NIL;
          SubLObject index = NIL;
          list_var = system_administration_utilities.jstack_trace( UNPROVIDED );
          line = list_var.first();
          for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), line = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
          {
            if( !index.isZero() )
            {
              html_utilities.html_princ( line );
              html_utilities.html_newline( UNPROVIDED );
            }
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$180, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$179, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-tools.lisp", position = 104228L)
  public static SubLObject cb_link_jstack_trace(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str698$jstack_Trace;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw34$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str699$cyc_jstack_trace );
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

  public static SubLObject declare_cb_tools_file()
  {
    SubLFiles.declareFunction( me, "cb_tools", "CB-TOOLS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_tool_columns", "CB-TOOL-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_tools_internal", "CB-TOOLS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_tools_handler", "CB-TOOLS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_tools", "CB-LINK-TOOLS", 0, 1, false );
    SubLFiles.declareFunction( me, "html_update_cb_toolbar_script", "HTML-UPDATE-CB-TOOLBAR-SCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_cb_boolean_global", "DECLARE-CB-BOOLEAN-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_boolean_option_field_name", "CB-BOOLEAN-OPTION-FIELD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_boolean_option_legend_form", "CB-BOOLEAN-OPTION-LEGEND-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_boolean_option_check", "CB-BOOLEAN-OPTION-CHECK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_boolean_option_new_value", "CB-BOOLEAN-OPTION-NEW-VALUE", 2, 0, false );
    SubLFiles.declareMacro( me, "cb_show_boolean_option", "CB-SHOW-BOOLEAN-OPTION" );
    SubLFiles.declareFunction( me, "cb_fastP", "CB-FAST?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_new_script_mode", "CB-NEW-SCRIPT-MODE", 1, 0, false );
    SubLFiles.declareMacro( me, "cb_options_submit_bar", "CB-OPTIONS-SUBMIT-BAR" );
    SubLFiles.declareFunction( me, "cb_options", "CB-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_options_table_of_contents", "CB-OPTIONS-TABLE-OF-CONTENTS", 0, 0, false );
    SubLFiles.declareMacro( me, "cb_options_section", "CB-OPTIONS-SECTION" );
    SubLFiles.declareMacro( me, "cb_options_section_column", "CB-OPTIONS-SECTION-COLUMN" );
    SubLFiles.declareMacro( me, "cb_options_subsection", "CB-OPTIONS-SUBSECTION" );
    SubLFiles.declareMacro( me, "cb_option_with_title_only", "CB-OPTION-WITH-TITLE-ONLY" );
    SubLFiles.declareMacro( me, "cb_option_with_title_and_hoverover", "CB-OPTION-WITH-TITLE-AND-HOVEROVER" );
    SubLFiles.declareMacro( me, "cb_option_with_title", "CB-OPTION-WITH-TITLE" );
    SubLFiles.declareMacro( me, "cb_checkbox_option", "CB-CHECKBOX-OPTION" );
    SubLFiles.declareFunction( me, "cb_constant_entry_option", "CB-CONSTANT-ENTRY-OPTION", 3, 2, false );
    SubLFiles.declareFunction( me, "cb_options_general", "CB-OPTIONS-GENERAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_options_term_display", "CB-OPTIONS-TERM-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_options_history_and_browser_tool", "CB-OPTIONS-HISTORY-AND-BROWSER-TOOL", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_options_nl", "CB-OPTIONS-NL", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_paraphrase_mt", "CB-PARAPHRASE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_options_query_tool", "CB-OPTIONS-QUERY-TOOL", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_options_boolean_handler", "CB-OPTIONS-BOOLEAN-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_options_set_boolean", "CB-OPTIONS-SET-BOOLEAN", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_options_handler", "CB-OPTIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_history_display_options_handler", "CB-HISTORY-DISPLAY-OPTIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_term_display_options_handler", "CB-TERM-DISPLAY-OPTIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_lexification_options_handler", "CB-LEXIFICATION-OPTIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pph_options_handler", "CB-PPH-OPTIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_set_default_pph_mt", "CB-SET-DEFAULT-PPH-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_query_tool_options_handler", "CB-QUERY-TOOL-OPTIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_options_handler_finish", "CB-OPTIONS-HANDLER-FINISH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_options", "CB-LINK-OPTIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_options_result_page", "CB-OPTIONS-RESULT-PAGE", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_options_result_message", "CB-OPTIONS-RESULT-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_history", "CB-HISTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_history_internal", "CB-HISTORY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_history_info", "CB-SHOW-HISTORY-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_recent_history", "CB-SHOW-RECENT-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_recent_constants", "CB-SHOW-RECENT-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_recent_constants_categorized", "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_recent_constants_categorized_2", "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_recent_nats", "CB-SHOW-RECENT-NATS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_recent_sentences", "CB-SHOW-RECENT-SENTENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_bookmarks_supported_for_current_user", "CB-BOOKMARKS-SUPPORTED-FOR-CURRENT-USER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_bookmarked_constants", "CB-SHOW-BOOKMARKED-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_bookmarked_nats", "CB-SHOW-BOOKMARKED-NATS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_bookmarked_assertions", "CB-SHOW-BOOKMARKED-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_recent_assertions", "CB-SHOW-RECENT-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_history", "CB-LINK-HISTORY", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_clear_history", "CB-CLEAR-HISTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_clear_history", "CB-LINK-CLEAR-HISTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_clear_constant_history", "CB-LINK-CLEAR-CONSTANT-HISTORY", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_link_clear_nat_history", "CB-LINK-CLEAR-NAT-HISTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_clear_assertion_history", "CB-LINK-CLEAR-ASSERTION-HISTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_clear_sentence_history", "CB-LINK-CLEAR-SENTENCE-HISTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_history_el_formulas", "CB-HISTORY-EL-FORMULAS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_history_el_formulas", "CB-LINK-HISTORY-EL-FORMULAS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_history_hl_formulas", "CB-HISTORY-HL-FORMULAS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_history_hl_formulas", "CB-LINK-HISTORY-HL-FORMULAS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_rem_fort_from_all_histories", "CB-REM-FORT-FROM-ALL-HISTORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_add_to_history", "CB-ADD-TO-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_constant_history_items", "CB-CONSTANT-HISTORY-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_most_recent_constant", "CB-MOST-RECENT-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_add_to_constant_history", "CB-ADD-TO-CONSTANT-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_from_constant_history", "CB-REM-FROM-CONSTANT-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_constant_history", "CB-CLEAR-CONSTANT-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_valid_nat_p", "CB-VALID-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_nat_history_items", "CB-NAT-HISTORY-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_most_recent_nat", "CB-MOST-RECENT-NAT", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_add_to_nat_history", "CB-ADD-TO-NAT-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_from_nat_history", "CB-REM-FROM-NAT-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_fort_from_nat_history", "CB-REM-FORT-FROM-NAT-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_nat_history", "CB-CLEAR-NAT-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_history_valid_item_p", "CB-ASSERTION-HISTORY-VALID-ITEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_history_items", "CB-ASSERTION-HISTORY-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_most_recent_assertion", "CB-MOST-RECENT-ASSERTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_add_to_assertion_history", "CB-ADD-TO-ASSERTION-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_add_sentence_in_mt_to_assertion_history", "CB-ADD-SENTENCE-IN-MT-TO-ASSERTION-HISTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_from_assertion_history", "CB-REM-FROM-ASSERTION-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_fort_from_assertion_history", "CB-REM-FORT-FROM-ASSERTION-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_assertion_history", "CB-CLEAR-ASSERTION-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "expression_forts_with_hl", "EXPRESSION-FORTS-WITH-HL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_sentence_history_items", "CB-SENTENCE-HISTORY-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_most_recent_sentence", "CB-MOST-RECENT-SENTENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_add_to_sentence_history", "CB-ADD-TO-SENTENCE-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_add_sentence_in_mt_to_sentence_history", "CB-ADD-SENTENCE-IN-MT-TO-SENTENCE-HISTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_from_sentence_history", "CB-REM-FROM-SENTENCE-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rem_fort_from_sentence_history", "CB-REM-FORT-FROM-SENTENCE-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_sentence_history", "CB-CLEAR-SENTENCE-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_cb_bookmarked_items", "CLEAR-CB-BOOKMARKED-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cb_bookmarked_items", "REMOVE-CB-BOOKMARKED-ITEMS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_bookmarked_items_internal", "CB-BOOKMARKED-ITEMS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_bookmarked_items", "CB-BOOKMARKED-ITEMS", 0, 1, false );
    SubLFiles.declareFunction( me, "name_for_alpha_sort", "NAME-FOR-ALPHA-SORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_current_relevant_terms", "CB-CURRENT-RELEVANT-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_recent_kb_additions", "CB-RECENT-KB-ADDITIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_recent_kb_additions", "CB-LINK-RECENT-KB-ADDITIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "links_to_recent_kb_additions", "LINKS-TO-RECENT-KB-ADDITIONS", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_handle_interactor", "CB-HANDLE-INTERACTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_handle_interactor", "CB-SHOW-HANDLE-INTERACTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_interactor_results", "CB-INTERACTOR-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_link_interactor", "CB-LINK-INTERACTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_guess_function", "CB-GUESS-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_arglist", "CB-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_arglist_rec", "CB-ARGLIST-REC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_save_interface_state", "CB-SAVE-INTERFACE-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_load_user_preferences", "CB-LOAD-USER-PREFERENCES", 0, 1, false );
    SubLFiles.declareFunction( me, "load_user_preferences", "LOAD-USER-PREFERENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "user_preferences_file_name", "USER-PREFERENCES-FILE-NAME", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_user_preferences", "CLEAR-USER-PREFERENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "default_preference_file_existsP", "DEFAULT-PREFERENCE-FILE-EXISTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "default_preference_file", "DEFAULT-PREFERENCE-FILE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_load_api", "CB-LOAD-API", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_load_api_handler", "CB-LOAD-API-HANDLER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_load_api_continue", "CB-LOAD-API-CONTINUE", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_show_when", "CB-SHOW-WHEN", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_check_values", "CB-SHOW-CHECK-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_when_handler", "CB-SHOW-WHEN-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_display_results", "CB-SHOW-DISPLAY-RESULTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_link_show_when", "CB-LINK-SHOW-WHEN", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_index_overlap", "CB-INDEX-OVERLAP", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_index_overlap", "CB-HANDLE-INDEX-OVERLAP", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_index_overlap", "CB-LINK-INDEX-OVERLAP", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_owl_import", "CB-LINK-OWL-IMPORT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_owl_export", "CB-LINK-OWL-EXPORT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_compose", "CB-LINK-COMPOSE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_navigator", "CB-LINK-NAVIGATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_doc", "CB-LINK-DOC", 0, 1, false );
    SubLFiles.declareFunction( me, "cyc_server_url", "CYC-SERVER-URL", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_link_kb_monitor_index_hook", "CB-LINK-KB-MONITOR-INDEX-HOOK", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_jstack_trace", "CB-JSTACK-TRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_jstack_trace", "CB-LINK-JSTACK-TRACE", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_cb_tools_file()
  {
    $cb_tools_split_threshold$ = SubLFiles.defparameter( "*CB-TOOLS-SPLIT-THRESHOLD*", TEN_INTEGER );
    $cb_boolean_globals$ = SubLFiles.deflexical( "*CB-BOOLEAN-GLOBALS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $cb_wff_strictP$ = SubLFiles.defparameter( "*CB-WFF-STRICT?*", NIL );
    $cb_option_section_names$ = SubLFiles.deflexical( "*CB-OPTION-SECTION-NAMES*", $list145 );
    $cb_use_css_columns_for_categories$ = SubLFiles.defparameter( "*CB-USE-CSS-COLUMNS-FOR-CATEGORIES*", T );
    $cb_history_max_constants$ = SubLFiles.deflexical( "*CB-HISTORY-MAX-CONSTANTS*", $int434$50 );
    $cb_history_max_nats$ = SubLFiles.deflexical( "*CB-HISTORY-MAX-NATS*", $int436$25 );
    $cb_history_max_assertions$ = SubLFiles.deflexical( "*CB-HISTORY-MAX-ASSERTIONS*", TEN_INTEGER );
    $cb_bookmarked_items_caching_state$ = SubLFiles.deflexical( "*CB-BOOKMARKED-ITEMS-CACHING-STATE*", NIL );
    $cb_interactor_width$ = SubLFiles.defparameter( "*CB-INTERACTOR-WIDTH*", $int482$80 );
    $cb_interactor_height$ = SubLFiles.defparameter( "*CB-INTERACTOR-HEIGHT*", $int436$25 );
    $html_state_filename$ = SubLFiles.defparameter( "*HTML-STATE-FILENAME*", NIL );
    $user_preference_file_extension$ = SubLFiles.defparameter( "*USER-PREFERENCE-FILE-EXTENSION*", $str517$pref );
    $user_preference_directory_list$ = SubLFiles.defparameter( "*USER-PREFERENCE-DIRECTORY-LIST*", ConsesLow.list( $str518$preferences, $str519$users ) );
    $default_user_preference_filename$ = SubLFiles.defparameter( "*DEFAULT-USER-PREFERENCE-FILENAME*", $str521$default );
    $cb_load_api_input_size$ = SubLFiles.defparameter( "*CB-LOAD-API-INPUT-SIZE*", $int525$70 );
    $cb_load_api_skip_input_size$ = SubLFiles.defparameter( "*CB-LOAD-API-SKIP-INPUT-SIZE*", SEVEN_INTEGER );
    $cb_show_list$ = SubLFiles.defparameter( "*CB-SHOW-LIST*", NIL );
    $cb_show_constant_value$ = SubLFiles.defconstant( "*CB-SHOW-CONSTANT-VALUE*", ONE_INTEGER );
    $cb_show_assertion_value$ = SubLFiles.defconstant( "*CB-SHOW-ASSERTION-VALUE*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_cb_tools_file()
  {
    Hashtables.sethash( $kw0$CB_TOOLS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str1$cb_tools_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym23$CB_TOOLS, $kw24$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym33$CB_TOOLS_HANDLER, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw36$TOOLS, $sym37$CB_LINK_TOOLS, ONE_INTEGER );
    declare_cb_boolean_global( $sym57$_CB_C_WRAP_ASSERTIONS_, $list58 );
    declare_cb_boolean_global( $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__, $list60 );
    declare_cb_boolean_global( $sym61$_CB_DISPLAY_DATES_AS_STRINGS__, $list62 );
    declare_cb_boolean_global( $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__, $list64 );
    declare_cb_boolean_global( $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__, $list66 );
    declare_cb_boolean_global( $sym67$_CB_WRAP_INTERACTOR_, $list68 );
    declare_cb_boolean_global( $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_, $list70 );
    declare_cb_boolean_global( $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__, $list72 );
    declare_cb_boolean_global( $sym73$_CB_SHOW_CYCLIFY_BUTTON_, $list74 );
    declare_cb_boolean_global( $sym75$_CB_ENABLE_INFERENCE_MONITORING_, $list76 );
    declare_cb_boolean_global( $sym77$_CB_SEPARATE_DOC_FRAME_, $list78 );
    declare_cb_boolean_global( $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_, $list80 );
    declare_cb_boolean_global( $sym81$_CB_FAST__, $list82 );
    declare_cb_boolean_global( $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_, $list84 );
    declare_cb_boolean_global( $sym85$_CB_USE_FRAMES_, $list86 );
    declare_cb_boolean_global( $sym87$_CB_SCRIPT_MODE_, $list88 );
    declare_cb_boolean_global( $sym90$_CB_HOVEROVER_ENABLED_, $list91 );
    declare_cb_boolean_global( $sym92$_CB_A_SHOW_EL_FORMULA_, $list93 );
    declare_cb_boolean_global( $sym94$_CB_A_SHOW_HL_FORMULA_, $list95 );
    declare_cb_boolean_global( $sym96$_CB_A_SHOW_ENGLISH_, $list97 );
    declare_cb_boolean_global( $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_, $list99 );
    declare_cb_boolean_global( $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__, $list101 );
    declare_cb_boolean_global( $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__, $list103 );
    declare_cb_boolean_global( $sym104$_CB_USE_CATEGORIZED_HISTORY__, $list105 );
    declare_cb_boolean_global( $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__, $list107 );
    declare_cb_boolean_global( $sym108$_ASSUME_CYC_CYCLIST_DIALOG__, $list109 );
    declare_cb_boolean_global( $sym110$_GENERATED_PHRASES_BROWSABLE__, $list111 );
    declare_cb_boolean_global( $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__, $list113 );
    declare_cb_boolean_global( $sym114$_SHOW_FET_EDIT_BUTTONS__, $list115 );
    declare_cb_boolean_global( $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__, $list117 );
    declare_cb_boolean_global( $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__, $list119 );
    declare_cb_boolean_global( $sym120$_CB_SHOW_FOLLOWUP_WIDGET_, $list121 );
    declare_cb_boolean_global( $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__, $list123 );
    declare_cb_boolean_global( $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__, $list125 );
    declare_cb_boolean_global( $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__, $list127 );
    declare_cb_boolean_global( $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__, $list129 );
    declare_cb_boolean_global( $sym130$_USE_SME_LEXWIZ_, $list131 );
    Hashtables.sethash( $kw133$CB_OPTIONS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str134$cb_options_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym144$CB_OPTIONS, $kw24$HTML_HANDLER );
    access_macros.register_macro_helper( $sym170$CB_OPTION_WITH_TITLE_ONLY, $sym170$CB_OPTION_WITH_TITLE_ONLY );
    access_macros.register_macro_helper( $sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER, $sym176$CB_OPTION_WITH_TITLE );
    declare_cb_boolean_global( $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__, $list268 );
    html_macros.note_cgi_handler_function( $sym315$CB_OPTIONS_HANDLER, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw322$OPTIONS, $sym323$CB_LINK_OPTIONS, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw322$OPTIONS, $str320$Preferences, $str324$Prefs, $str135$Browser_Preferences );
    html_macros.note_cgi_handler_function( $sym333$CB_HISTORY, $kw24$HTML_HANDLER );
    Hashtables.sethash( $kw334$CB_HISTORY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str335$cb_history_html, NIL ) );
    utilities_macros.register_html_state_variable( $sym342$_CB_USE_CSS_COLUMNS_FOR_CATEGORIES_ );
    Hashtables.sethash( $kw344$HISTORY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str394$history_tool_gif, NIL ) );
    cb_utilities.setup_cb_link_method( $kw344$HISTORY, $sym398$CB_LINK_HISTORY, TWO_INTEGER );
    cb_utilities.declare_cb_tool( $kw344$HISTORY, $str395$History, $str399$Hist, $str400$Recent_Browser_History );
    html_macros.note_cgi_handler_function( $sym407$CB_CLEAR_HISTORY, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw410$CLEAR_HISTORY, $sym411$CB_LINK_CLEAR_HISTORY, ONE_INTEGER );
    cb_utilities.setup_cb_link_method( $kw347$CLEAR_CONSTANT_HISTORY, $sym414$CB_LINK_CLEAR_CONSTANT_HISTORY, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw367$CLEAR_NAT_HISTORY, $sym417$CB_LINK_CLEAR_NAT_HISTORY, ONE_INTEGER );
    cb_utilities.setup_cb_link_method( $kw387$CLEAR_ASSERTION_HISTORY, $sym420$CB_LINK_CLEAR_ASSERTION_HISTORY, ONE_INTEGER );
    cb_utilities.setup_cb_link_method( $kw371$CLEAR_SENTENCE_HISTORY, $sym423$CB_LINK_CLEAR_SENTENCE_HISTORY, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym424$CB_HISTORY_EL_FORMULAS, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw341$HISTORY_EL_FORMULAS, $sym427$CB_LINK_HISTORY_EL_FORMULAS, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym428$CB_HISTORY_HL_FORMULAS, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw340$HISTORY_HL_FORMULAS, $sym431$CB_LINK_HISTORY_HL_FORMULAS, ONE_INTEGER );
    memoization_state.note_globally_cached_function( $sym444$CB_BOOKMARKED_ITEMS );
    html_macros.note_cgi_handler_function( $sym460$CB_RECENT_KB_ADDITIONS, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw458$RECENT_KB_ADDITIONS, $sym463$CB_LINK_RECENT_KB_ADDITIONS, ONE_INTEGER );
    cyc_navigator_internals.def_navigator_link( $kw458$RECENT_KB_ADDITIONS, $kw480$TEXT, $list481, $str462$cb_recent_kb_additions, ZERO_INTEGER, $kw34$MAIN, $str456$Recently_Added_KB_Content, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_macros.note_cgi_handler_function( $sym489$CB_HANDLE_INTERACTOR, $kw24$HTML_HANDLER );
    Hashtables.sethash( $kw490$CB_HANDLE_INTERACTOR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str491$cb_handle_interactor_html, NIL ) );
    cb_utilities.setup_cb_link_method( $kw506$INTERACTOR, $sym507$CB_LINK_INTERACTOR, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw506$INTERACTOR, $str505$Interactor, $str508$SubL, $str485$SubL_Interactor );
    utilities_macros.register_html_state_variable( $sym516$_HTML_STATE_FILENAME_ );
    html_macros.note_cgi_handler_function( $sym524$CB_LOAD_USER_PREFERENCES, $kw24$HTML_HANDLER );
    Hashtables.sethash( $kw526$CB_LOAD_API, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str527$cb_load_api_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym536$CB_LOAD_API, $kw24$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym546$CB_LOAD_API_HANDLER, $kw24$HTML_HANDLER );
    Hashtables.sethash( $kw554$CB_SHOW_WHEN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str555$cb_show_when_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym580$CB_SHOW_WHEN, $kw24$HTML_HANDLER );
    Hashtables.sethash( $kw581$CB_SHOW_WHEN_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str582$cb_show_when_handler_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym612$CB_SHOW_WHEN_HANDLER, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw619$SHOW_WHEN, $sym620$CB_LINK_SHOW_WHEN, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw619$SHOW_WHEN, $str617$When, $str617$When, $str621$Display_assertions_constants_by_d );
    Hashtables.sethash( $kw622$CB_INDEX_OVERLAP, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str623$cb_index_overlap_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym631$CB_INDEX_OVERLAP, $kw24$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym643$CB_HANDLE_INDEX_OVERLAP, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw646$INDEX_OVERLAP, $sym647$CB_LINK_INDEX_OVERLAP, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw646$INDEX_OVERLAP, $str644$Overlap, $str648$Ovlp, $str649$Term_Index_Overlap );
    cb_utilities.setup_cb_link_method( $kw652$OWL_IMPORT, $sym653$CB_LINK_OWL_IMPORT, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw652$OWL_IMPORT, $str650$OWL_Import, $str654$OWL_I, $str655$OWL_Ontology_Importer );
    cb_utilities.setup_cb_link_method( $kw658$OWL_EXPORT, $sym659$CB_LINK_OWL_EXPORT, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw658$OWL_EXPORT, $str656$OWL_Export, $str660$OWL_E, $str661$OWL_Ontology_Exporter );
    Hashtables.sethash( $kw662$COMPOSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str663$compose_tool_gif, NIL ) );
    cb_utilities.setup_cb_link_method( $kw662$COMPOSE, $sym666$CB_LINK_COMPOSE, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw662$COMPOSE, $str667$Compose_KE_Text, $str668$Comp, $str667$Compose_KE_Text );
    cb_utilities.setup_cb_link_method( $kw671$NAVIGATOR, $sym672$CB_LINK_NAVIGATOR, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw671$NAVIGATOR, $str669$Navigator, $str673$Nav, $str674$Cyc_Navigator );
    Hashtables.sethash( $kw675$DOC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str676$doc_tool_gif, $str677$_Doc_ ) );
    cb_utilities.setup_cb_link_method( $kw675$DOC, $sym679$CB_LINK_DOC, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw675$DOC, $str227$Documentation, $str678$Doc, $str680$Cyc_Documentation );
    cb_utilities.setup_cb_link_method( $kw694$KB_MONITOR_INDEX_HOOK, $sym695$CB_LINK_KB_MONITOR_INDEX_HOOK, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym697$CB_JSTACK_TRACE, $kw24$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw700$JSTACK_TRACE, $sym701$CB_LINK_JSTACK_TRACE, ONE_INTEGER );
    cyc_navigator_internals.def_navigator_link( $kw700$JSTACK_TRACE, $kw480$TEXT, $list702, $str703$cb_jstack_trace, ZERO_INTEGER, $kw34$MAIN, $str704$JRTL_jstack_Trace, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_tools_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_tools_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_tools_file();
  }
  static
  {
    me = new cb_tools();
    $cb_tools_split_threshold$ = null;
    $cb_boolean_globals$ = null;
    $cb_wff_strictP$ = null;
    $cb_option_section_names$ = null;
    $cb_use_css_columns_for_categories$ = null;
    $cb_history_max_constants$ = null;
    $cb_history_max_nats$ = null;
    $cb_history_max_assertions$ = null;
    $cb_bookmarked_items_caching_state$ = null;
    $cb_interactor_width$ = null;
    $cb_interactor_height$ = null;
    $html_state_filename$ = null;
    $user_preference_file_extension$ = null;
    $user_preference_directory_list$ = null;
    $default_user_preference_filename$ = null;
    $cb_load_api_input_size$ = null;
    $cb_load_api_skip_input_size$ = null;
    $cb_show_list$ = null;
    $cb_show_constant_value$ = null;
    $cb_show_assertion_value$ = null;
    $kw0$CB_TOOLS = makeKeyword( "CB-TOOLS" );
    $str1$cb_tools_html = makeString( "cb-tools.html" );
    $str2$Browser_Tools = makeString( "Browser Tools" );
    $str3$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str4$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw5$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw6$CB_CYC = makeKeyword( "CB-CYC" );
    $kw7$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw8$SHA1 = makeKeyword( "SHA1" );
    $str9$yui_skin_sam = makeString( "yui-skin-sam" );
    $str10$reloadFrameButton = makeString( "reloadFrameButton" );
    $str11$button = makeString( "button" );
    $str12$reload = makeString( "reload" );
    $str13$Refresh_Frames = makeString( "Refresh Frames" );
    $str14$post = makeString( "post" );
    $str15$cb_tools_handler = makeString( "cb-tools-handler" );
    $kw16$SELF = makeKeyword( "SELF" );
    $str17$Choose_a_tool__or_modify_the_tool = makeString( "Choose a tool, or modify the toolbar." );
    $str18$Current_Values = makeString( "Current Values" );
    $str19$Update_Toolbar = makeString( "Update Toolbar" );
    $str20$Update___Save = makeString( "Update & Save" );
    $str21$save = makeString( "save" );
    $str22$Deprecated_Tools = makeString( "Deprecated Tools" );
    $sym23$CB_TOOLS = makeSymbol( "CB-TOOLS" );
    $kw24$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym25$STRING_ = makeSymbol( "STRING<" );
    $sym26$SECOND = makeSymbol( "SECOND" );
    $kw27$TOP = makeKeyword( "TOP" );
    $list28 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PRETTY-NAME" ), makeSymbol( "ABBREVIATION" ), makeSymbol( "DESCRIPTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "AVAILABILITY" ) );
    $sym29$FIRST = makeSymbol( "FIRST" );
    $str30$Toolbar_Modified = makeString( "Toolbar Modified" );
    $str31$Browser_Toolbar_Modified = makeString( "Browser Toolbar Modified" );
    $str32$Tools = makeString( "Tools" );
    $sym33$CB_TOOLS_HANDLER = makeSymbol( "CB-TOOLS-HANDLER" );
    $kw34$MAIN = makeKeyword( "MAIN" );
    $str35$cb_tools = makeString( "cb-tools" );
    $kw36$TOOLS = makeKeyword( "TOOLS" );
    $sym37$CB_LINK_TOOLS = makeSymbol( "CB-LINK-TOOLS" );
    $kw38$TOOLBAR = makeKeyword( "TOOLBAR" );
    $kw39$FIELD_NAME = makeKeyword( "FIELD-NAME" );
    $kw40$LEGEND_FORM = makeKeyword( "LEGEND-FORM" );
    $kw41$CHECK_FN = makeKeyword( "CHECK-FN" );
    $kw42$NEW_VALUE_FN = makeKeyword( "NEW-VALUE-FN" );
    $list43 = ConsesLow.list( makeSymbol( "GLOBAL" ) );
    $sym44$FIELD_NAME = makeUninternedSymbol( "FIELD-NAME" );
    $sym45$LEGEND_FORM = makeUninternedSymbol( "LEGEND-FORM" );
    $sym46$CLET = makeSymbol( "CLET" );
    $sym47$CB_BOOLEAN_OPTION_FIELD_NAME = makeSymbol( "CB-BOOLEAN-OPTION-FIELD-NAME" );
    $sym48$QUOTE = makeSymbol( "QUOTE" );
    $sym49$CB_BOOLEAN_OPTION_LEGEND_FORM = makeSymbol( "CB-BOOLEAN-OPTION-LEGEND-FORM" );
    $sym50$PWHEN = makeSymbol( "PWHEN" );
    $sym51$CAND = makeSymbol( "CAND" );
    $sym52$STRINGP = makeSymbol( "STRINGP" );
    $sym53$LISTP = makeSymbol( "LISTP" );
    $sym54$CB_CHECKBOX_OPTION = makeSymbol( "CB-CHECKBOX-OPTION" );
    $sym55$CB_BOOLEAN_OPTION_CHECK = makeSymbol( "CB-BOOLEAN-OPTION-CHECK" );
    $sym56$EVAL = makeSymbol( "EVAL" );
    $sym57$_CB_C_WRAP_ASSERTIONS_ = makeSymbol( "*CB-C-WRAP-ASSERTIONS*" );
    $list58 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "wrap-assertions" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Wrap Assertions (tries to tidy up assertion displays)" ) ) );
    $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ = makeSymbol( "*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*" );
    $list60 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "unicode-as-strings" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display Unicode NAUTs as strings (instead of as NAUTs)" ) ) );
    $sym61$_CB_DISPLAY_DATES_AS_STRINGS__ = makeSymbol( "*CB-DISPLAY-DATES-AS-STRINGS?*" );
    $list62 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "dates-as-strings" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display dates as DateFromString NAUTs" ) ) );
    $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ = makeSymbol( "*CB-DISPLAY-DECIMALS-AS-DECIMALS?*" );
    $list64 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "decimals-as-decimals" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display decimal fractions as decimals" ) ) );
    $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ = makeSymbol( "*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*" );
    $list66 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "fractions-as-fractions" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display fractions as fractions" ) ) );
    $sym67$_CB_WRAP_INTERACTOR_ = makeSymbol( "*CB-WRAP-INTERACTOR*" );
    $list68 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "wrap-interactor" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Wrap Interactor and Ask input boxes" ) ) );
    $sym69$_CB_USE_DYNAMIC_TABLE_FOR_INFERENCE_RESULTS_ = makeSymbol( "*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*" );
    $list70 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "use-dynamic-table-for-inference-results" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show Final Inference Answers in Dynamic Table (Recommended: allows sorting)" ) ) );
    $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ = makeSymbol( "*CB-SHOW-INFERENCE-RESULTS-IN-NL?*" );
    $list72 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "show-inference-results-in-nl" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show Inference Answers in English" ) ) );
    $sym73$_CB_SHOW_CYCLIFY_BUTTON_ = makeSymbol( "*CB-SHOW-CYCLIFY-BUTTON*" );
    $list74 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "show-cyclify-button" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show Cyclify Button in Assertion and Query tools" ) ) );
    $sym75$_CB_ENABLE_INFERENCE_MONITORING_ = makeSymbol( "*CB-ENABLE-INFERENCE-MONITORING*" );
    $list76 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "enable-inference-monitoring" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Enable inference monitoring" ) ) );
    $sym77$_CB_SEPARATE_DOC_FRAME_ = makeSymbol( "*CB-SEPARATE-DOC-FRAME*" );
    $list78 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "doc-separate" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show documentation in separate window" ) ) );
    $sym79$_CB_MORE_ASSERTION_MARKER_IMAGE_TEXT_ = makeSymbol( "*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*" );
    $list80 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "more-marker-text" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Show assertion ball tooltips" ) ) );
    $sym81$_CB_FAST__ = makeSymbol( "*CB-FAST?*" );
    $list82 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cyc-browser-fast" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Sacrifice some functionality for speed" ) ) );
    $sym83$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ = makeSymbol( "*CB-SEARCH-AUTOCOMPLETE-ENABLED*" );
    $list84 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "search-autocomplete-enabled" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Allow autocomplete in the search box" ) ) );
    $sym85$_CB_USE_FRAMES_ = makeSymbol( "*CB-USE-FRAMES*" );
    $list86 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "use-frames" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Use frames (recommended)" ) ) );
    $sym87$_CB_SCRIPT_MODE_ = makeSymbol( "*CB-SCRIPT-MODE*" );
    $list88 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "use-javascript" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Use JavaScript (recommended)" ) ),
        makeKeyword( "CHECK-FN" ), makeSymbol( "CB-USE-JAVASCRIPT?" ), makeKeyword( "NEW-VALUE-FN" ), makeSymbol( "CB-NEW-SCRIPT-MODE" ) );
    $kw89$JAVASCRIPT = makeKeyword( "JAVASCRIPT" );
    $sym90$_CB_HOVEROVER_ENABLED_ = makeSymbol( "*CB-HOVEROVER-ENABLED*" );
    $list91 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "use-hoverover" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Use overLIB hoverover boxes (slow)" ) ) );
    $sym92$_CB_A_SHOW_EL_FORMULA_ = makeSymbol( "*CB-A-SHOW-EL-FORMULA*" );
    $list93 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "show-el-formula" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Show EL formula (slow)" ) ) );
    $sym94$_CB_A_SHOW_HL_FORMULA_ = makeSymbol( "*CB-A-SHOW-HL-FORMULA*" );
    $list95 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "show-hl-formula" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Show HL formula (fast)" ) ) );
    $sym96$_CB_A_SHOW_ENGLISH_ = makeSymbol( "*CB-A-SHOW-ENGLISH*" );
    $list97 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "show-english" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Show English translation (slow)" ) ) );
    $sym98$_CB_A_PERFORM_ACCESS_DIAGNOSTICS_ = makeSymbol( "*CB-A-PERFORM-ACCESS-DIAGNOSTICS*" );
    $list99 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "access-diagnostics" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Always perform access diagnostics (slow)" ) ) );
    $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ = makeSymbol( "*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*" );
    $list101 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "preserve-meta-assertions" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Always preserve meta assertions by default" ) ) );
    $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ = makeSymbol( "*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*" );
    $list103 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "change-all-meta-assertions-mt" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Change Mt of all meta assertions (if all have same Mt as assertion), during change Mt of assertion, by default" ) ) );
    $sym104$_CB_USE_CATEGORIZED_HISTORY__ = makeSymbol( "*CB-USE-CATEGORIZED-HISTORY?*" );
    $list105 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "show-categorized-history" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Categorize constant history display?" ) ) );
    $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__ = makeSymbol( "*CB-HISTORY-SHOW-EL-FORMULAS?*" );
    $list107 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "history-show-el-formulas" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show EL assertion formulas" ) ) );
    $sym108$_ASSUME_CYC_CYCLIST_DIALOG__ = makeSymbol( "*ASSUME-CYC-CYCLIST-DIALOG?*" );
    $list109 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cyc-cyclist-dialog" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Assume Cyc is addressing the current cyclist" ) ) );
    $sym110$_GENERATED_PHRASES_BROWSABLE__ = makeSymbol( "*GENERATED-PHRASES-BROWSABLE?*" );
    $list111 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "generated-phrases-browsable" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Make generated phrases browsable?" ) ) );
    $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ = makeSymbol( "*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*" );
    $list113 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "highlight-demerits-in-generated-phrases" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Highlight phrases with demerits?" ) ) );
    $sym114$_SHOW_FET_EDIT_BUTTONS__ = makeSymbol( "*SHOW-FET-EDIT-BUTTONS?*" );
    $list115 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "fet-edit-buttons" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show buttons for editing with FET" ) ) );
    $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ = makeSymbol( "*SHOW-FET-CREATE-INSTANCE-BUTTONS?*" );
    $list117 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "fet-create-instance-buttons" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show buttons for creating instances with FET (semi-experimental)" ) ) );
    $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__ = makeSymbol( "*SHOW-FET-CREATE-SPEC-BUTTONS?*" );
    $list119 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "fet-create-spec-buttons" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show buttons for creating specs with FET (experimental)" ) ) );
    $sym120$_CB_SHOW_FOLLOWUP_WIDGET_ = makeSymbol( "*CB-SHOW-FOLLOWUP-WIDGET*" );
    $list121 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "followup-widget" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show the Followup Widget (experimental)" ) ) );
    $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ = makeSymbol( "*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*" );
    $list123 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cb-literal-query-results-one-per-line" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display literal query results one per line" ) ) );
    $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__ = makeSymbol( "*CB-SKOLEM-APPLICABLE-RELATIONS?*" );
    $list125 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cb-skolem-applicable-relations" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display skolem functions" ) ) );
    $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ = makeSymbol( "*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*" );
    $list127 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cb-applicable-relations-one-per-line" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display applicable relations one per line" ) ) );
    $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ = makeSymbol( "*CB-PARAPHRASE-APPLICABLE-RELATIONS?*" );
    $list129 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cb-paraphrase-applicable-relations" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Display paraphrases (slow)" ) ) );
    $sym130$_USE_SME_LEXWIZ_ = makeSymbol( "*USE-SME-LEXWIZ*" );
    $list131 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "cb-use-sme-lexwiz" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Use Dictionary Assistant (not Lexification Assistant)" ) ) );
    $list132 = ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "HTML-RESET-INPUT" ), makeString( "Reset Form" ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ) ), ConsesLow.list( makeSymbol(
        "HTML-SUBMIT-INPUT" ), makeString( "Submit" ), makeString( "update" ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ) ), ConsesLow.list( makeSymbol( "HTML-SUBMIT-INPUT" ), makeString( "Submit & Save" ),
            makeString( "update_and_save" ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ) ), ConsesLow.list( makeSymbol( "HTML-SUBMIT-INPUT" ), makeString( "Load Saved" ), makeString( "load_saved" ) ) );
    $kw133$CB_OPTIONS = makeKeyword( "CB-OPTIONS" );
    $str134$cb_options_html = makeString( "cb-options.html" );
    $str135$Browser_Preferences = makeString( "Browser Preferences" );
    $str136$cb_options_handler = makeString( "cb-options-handler" );
    $str137$Reset_Form = makeString( "Reset Form" );
    $str138$Submit = makeString( "Submit" );
    $str139$update = makeString( "update" );
    $str140$Submit___Save = makeString( "Submit & Save" );
    $str141$update_and_save = makeString( "update_and_save" );
    $str142$Load_Saved = makeString( "Load Saved" );
    $str143$load_saved = makeString( "load_saved" );
    $sym144$CB_OPTIONS = makeSymbol( "CB-OPTIONS" );
    $list145 = ConsesLow.list( ConsesLow.cons( makeKeyword( "GENERAL" ), makeString( "General Options" ) ), ConsesLow.cons( makeKeyword( "TERM-DISPLAY" ), makeString( "Term Display Options" ) ), ConsesLow.cons(
        makeKeyword( "HISTORY-AND-TOOLS" ), makeString( "History and Browser Tool Options" ) ), ConsesLow.cons( makeKeyword( "NL" ), makeString( "NL Options" ) ), ConsesLow.cons( makeKeyword( "QUERY-TOOL" ), makeString(
            "Query Tool" ) ), ConsesLow.cons( makeKeyword( "CZER" ), makeString( "Canonicalizer Options" ) ) );
    $str146$Jump_to_Section = makeString( "Jump to Section" );
    $list147 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "NAME" ) );
    $str148$_ = makeString( "#" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym150$NAME = makeUninternedSymbol( "NAME" );
    $sym151$ALIST_LOOKUP_WITHOUT_VALUES = makeSymbol( "ALIST-LOOKUP-WITHOUT-VALUES" );
    $sym152$_CB_OPTION_SECTION_NAMES_ = makeSymbol( "*CB-OPTION-SECTION-NAMES*" );
    $list153 = ConsesLow.list( makeSymbol( "HTML-HR" ) );
    $sym154$HTML_HEADING = makeSymbol( "HTML-HEADING" );
    $list155 = ConsesLow.list( THREE_INTEGER );
    $sym156$HTML_FANCY_DIV = makeSymbol( "HTML-FANCY-DIV" );
    $kw157$ID = makeKeyword( "ID" );
    $sym158$HTML_PRINC = makeSymbol( "HTML-PRINC" );
    $sym159$HTML_FANCY_TABLE = makeSymbol( "HTML-FANCY-TABLE" );
    $list160 = ConsesLow.list( makeKeyword( "NOFLOW" ), T, makeKeyword( "BORDER" ), ZERO_INTEGER, makeKeyword( "CELLPADDING" ), ZERO_INTEGER, makeKeyword( "CELLSPACING" ), ZERO_INTEGER );
    $sym161$HTML_TABLE_ROW = makeSymbol( "HTML-TABLE-ROW" );
    $sym162$PROGN = makeSymbol( "PROGN" );
    $list163 = ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), FOUR_INTEGER ) );
    $sym164$HTML_FANCY_TABLE_DATA = makeSymbol( "HTML-FANCY-TABLE-DATA" );
    $list165 = ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "LEFT" ), makeKeyword( "VALIGN" ), makeKeyword( "TOP" ) );
    $list166 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list167 = ConsesLow.list( FOUR_INTEGER );
    $sym168$HTML_FORMAT = makeSymbol( "HTML-FORMAT" );
    $str169$_A__ = makeString( "~A :" );
    $sym170$CB_OPTION_WITH_TITLE_ONLY = makeSymbol( "CB-OPTION-WITH-TITLE-ONLY" );
    $list171 = ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym172$HTML_PRINC_STRONG = makeSymbol( "HTML-PRINC-STRONG" );
    $list173 = ConsesLow.list( makeSymbol( "HTML-PRINC-STRONG" ), makeString( " :" ) );
    $list174 = ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) );
    $sym175$CB_OPTION_WITH_TITLE_AND_HOVEROVER = makeSymbol( "CB-OPTION-WITH-TITLE-AND-HOVEROVER" );
    $sym176$CB_OPTION_WITH_TITLE = makeSymbol( "CB-OPTION-WITH-TITLE" );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "HOVEROVER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym178$PIF = makeSymbol( "PIF" );
    $sym179$HTML_PRINC_STRONG_WITH_EXPLANATION = makeSymbol( "HTML-PRINC-STRONG-WITH-EXPLANATION" );
    $list180 = ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "&KEY" ), makeSymbol( "HOVEROVER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list181 = ConsesLow.list( makeKeyword( "HOVEROVER" ) );
    $kw182$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw183$HOVEROVER = makeKeyword( "HOVEROVER" );
    $list184 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "CHECKED?" ) ), makeSymbol( "&BODY" ), makeSymbol( "LEGEND-FORM" ) );
    $sym185$HTML_CHECKBOX_INPUT = makeSymbol( "HTML-CHECKBOX-INPUT" );
    $list186 = ConsesLow.list( makeSymbol( "HTML-INDENT" ), TWO_INTEGER );
    $list187 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) );
    $str188$__ = makeString( " :" );
    $str189$Complete = makeString( "Complete" );
    $str190$Clear = makeString( "Clear" );
    $kw191$GENERAL = makeKeyword( "GENERAL" );
    $kw192$LEFT = makeKeyword( "LEFT" );
    $sym193$_HLMTS_SUPPORTED__ = makeSymbol( "*HLMTS-SUPPORTED?*" );
    $str194$Simple_transformations_to_make_co = makeString( "Simple transformations to make complex terms easier to read" );
    $str195$NAUT_Readability = makeString( "NAUT Readability" );
    $str196$Miscellaneous = makeString( "Miscellaneous" );
    $str197$Primary_Presentation_Language = makeString( "Primary Presentation Language" );
    $str198$presentation_language = makeString( "presentation-language" );
    $str199$_cycl = makeString( ":cycl" );
    $kw200$CYCL = makeKeyword( "CYCL" );
    $str201$CycL__default_ = makeString( "CycL (default)" );
    $str202$_nl = makeString( ":nl" );
    $kw203$NL = makeKeyword( "NL" );
    $str204$Natural_Language__slow_ = makeString( "Natural Language (slow)" );
    $str205$Status_Frame_Update = makeString( "Status Frame Update" );
    $str206$Update_every_ = makeString( "Update every " );
    $str207$status_interval = makeString( "status-interval" );
    $str208$seconds__or_empty_to_disable_ = makeString( "seconds (or empty to disable)" );
    $kw209$TERM_DISPLAY = makeKeyword( "TERM-DISPLAY" );
    $str210$Default_Index_View = makeString( "Default Index View" );
    $str211$index_view = makeString( "index-view" );
    $str212$_inferred = makeString( ":inferred" );
    $kw213$INFERRED = makeKeyword( "INFERRED" );
    $str214$Inferred = makeString( "Inferred" );
    $str215$_legacy = makeString( ":legacy" );
    $kw216$LEGACY = makeKeyword( "LEGACY" );
    $str217$Legacy = makeString( "Legacy" );
    $str218$Default_Content = makeString( "Default Content" );
    $str219$content = makeString( "content" );
    $str220$upper_bound = makeString( "upper-bound" );
    $str221$_maximal = makeString( ":maximal" );
    $kw222$MAXIMAL = makeKeyword( "MAXIMAL" );
    $str223$As_much_as_possible_up_to_ = makeString( "As much as possible up to " );
    $str224$_assertions = makeString( " assertions" );
    $str225$_documentation = makeString( ":documentation" );
    $kw226$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $str227$Documentation = makeString( "Documentation" );
    $str228$_definitional = makeString( ":definitional" );
    $kw229$DEFINITIONAL = makeKeyword( "DEFINITIONAL" );
    $str230$Definitional_Information = makeString( "Definitional Information" );
    $str231$_lexical = makeString( ":lexical" );
    $kw232$LEXICAL = makeKeyword( "LEXICAL" );
    $str233$Lexical_Information = makeString( "Lexical Information" );
    $str234$Assertion_Formulas = makeString( "Assertion Formulas" );
    $str235$formulas_display = makeString( "formulas-display" );
    $str236$_hl_formulas = makeString( ":hl-formulas" );
    $kw237$HL_FORMULAS = makeKeyword( "HL-FORMULAS" );
    $str238$HL_formulas__fast_ = makeString( "HL formulas (fast)" );
    $str239$_el_formulas = makeString( ":el-formulas" );
    $kw240$EL_FORMULAS = makeKeyword( "EL-FORMULAS" );
    $str241$EL_formulas__slow_ = makeString( "EL formulas (slow)" );
    $str242$_el_formulas_except_when_browsing = makeString( ":el-formulas-except-when-browsing-skolems" );
    $kw243$EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS = makeKeyword( "EL-FORMULAS-EXCEPT-WHEN-BROWSING-SKOLEMS" );
    $str244$EL_formulas_except_when_browsing_ = makeString( "EL formulas except when browsing skolems (slow)" );
    $str245$Literal_Queries = makeString( "Literal Queries" );
    $str246$Applicable_Relations = makeString( "Applicable Relations" );
    $str247$Assertion_Display_Options = makeString( "Assertion Display Options" );
    $str248$Assertion_Editing_Options = makeString( "Assertion Editing Options" );
    $str249$FET_Launching_Buttons = makeString( "FET Launching Buttons" );
    $kw250$HISTORY_AND_TOOLS = makeKeyword( "HISTORY-AND-TOOLS" );
    $str251$History_Display_Options = makeString( "History Display Options" );
    $str252$Display_no_more_than_ = makeString( "Display no more than " );
    $str253$constant_history_max = makeString( "constant-history-max" );
    $str254$_constants = makeString( " constants" );
    $str255$constant_history_chronological_ma = makeString( "constant-history-chronological-max" );
    $str256$_constants_chronologically = makeString( " constants chronologically" );
    $str257$nat_history_max = makeString( "nat-history-max" );
    $str258$_NARTs = makeString( " NARTs" );
    $str259$assertion_history_max = makeString( "assertion-history-max" );
    $str260$sentence_history_max = makeString( "sentence-history-max" );
    $str261$_sentences = makeString( " sentences" );
    $str262$Browser_Tool_Options = makeString( "Browser Tool Options" );
    $str263$Default_Mt = makeString( "Default Mt" );
    $str264$default_mt = makeString( "default-mt" );
    $const265$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str266$What_microtheory_should_be_used_a = makeString( "What microtheory should be used as a default in forms?" );
    $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ = makeSymbol( "*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*" );
    $list268 = ConsesLow.list( makeKeyword( "FIELD-NAME" ), makeString( "proof-view-bug-report-links" ), makeKeyword( "LEGEND-FORM" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
        "Show proof-view bug report links?" ) ) );
    $str269$NL_Generation = makeString( "NL Generation" );
    $str270$Which_mt_should_be_used_for_gener = makeString( "Which mt should be used for generating NL in the Cyc Browser?" );
    $str271$Default_NL_Generation_Mt = makeString( "Default NL Generation Mt" );
    $list272 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "pph-mt" ) );
    $str273$Proof_Views = makeString( "Proof Views" );
    $str274$Which_parameters_should_be_used_f = makeString( "Which parameters should be used for proof views generated from the browser?" );
    $str275$Default_Parameters = makeString( "Default Parameters" );
    $str276$proof_view_params = makeString( "proof-view-params" );
    $kw277$DEFAULT = makeKeyword( "DEFAULT" );
    $list278 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DefaultParameterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CycProofViewGenerator" ) ) );
    $list279 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SpecificationTypeFromParameterTypeFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "ParameterTypeOfProgramFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CycProofViewGenerator" ) ) ) );
    $str280$Lexification = makeString( "Lexification" );
    $str281$Reviewer = makeString( "Reviewer" );
    $str282$lex_reviewer = makeString( "lex-reviewer" );
    $const283$Cyclist = constant_handles.reader_make_constant_shell( makeString( "Cyclist" ) );
    $str284$Which_Cyclist_is_to_reviewer_your = makeString( "Which Cyclist is to reviewer your lexical assertions? (Blank for none.)" );
    $str285$Default_Microtheory = makeString( "Default Microtheory" );
    $str286$lex_mt = makeString( "lex-mt" );
    $str287$What_microtheory_should_your_lexi = makeString( "What microtheory should your lexical-semantic assertions go in?" );
    $str288$Default_Syntactic_Microtheory = makeString( "Default Syntactic Microtheory" );
    $str289$lex_syntactic_mt = makeString( "lex-syntactic-mt" );
    $str290$What_microtheory_should_your_synt = makeString( "What microtheory should your syntactic assertions (e.g. #$singular) go in?" );
    $str291$Default_Paraphrase_Microtheory = makeString( "Default Paraphrase Microtheory" );
    $str292$lex_pph_mt = makeString( "lex-pph-mt" );
    $str293$What_microtheory_should_your_para = makeString( "What microtheory should your paraphrase assertions go in?" );
    $str294$Default_Parse_Template_Microtheor = makeString( "Default Parse Template Microtheory" );
    $str295$lex_parse_template_mt = makeString( "lex-parse-template-mt" );
    $str296$What_microtheory_should_your_pars = makeString( "What microtheory should your parse template assertions go in?" );
    $kw297$QUERY_TOOL = makeKeyword( "QUERY-TOOL" );
    $str298$Results_Display = makeString( "Results Display" );
    $str299$Automatically_Destroying_Inferenc = makeString( "Automatically Destroying Inferences" );
    $str300$destroy_inferences = makeString( "destroy-inferences" );
    $str301$entry_destroy_inferences = makeString( "entry-destroy-inferences" );
    $str302$Keep_only_last_ = makeString( "Keep only last " );
    $str303$inferences__at_most__defaults_to_ = makeString( "inferences (at most, defaults to 10 if empty)" );
    $str304$Keep_all = makeString( "Keep all" );
    $str305$Default_Query_Mt = makeString( "Default Query Mt" );
    $list306 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "default-query-mt" ) );
    $str307$Closed_Queries = makeString( "Closed Queries" );
    $str308$perform_argumentation_for_closed_ = makeString( "perform-argumentation-for-closed-query" );
    $str309$t = makeString( "t" );
    $str310$Gather_and_weigh_both_pro_and_con = makeString( "Gather and weigh both pro and con arguments" );
    $str311$nil = makeString( "nil" );
    $str312$Attempt_to_prove_only_pro_argumen = makeString( "Attempt to prove only pro arguments" );
    $kw313$STRICT = makeKeyword( "STRICT" );
    $kw314$ASSERTIVE = makeKeyword( "ASSERTIVE" );
    $sym315$CB_OPTIONS_HANDLER = makeSymbol( "CB-OPTIONS-HANDLER" );
    $str316$Default_NL_Generation_Mt__The_inp = makeString( "Default NL Generation Mt: The input, ~A, was not understood." );
    $str317$DEFAULT = makeString( "DEFAULT" );
    $kw318$POSITIVE_INFINITY = makeKeyword( "POSITIVE-INFINITY" );
    $str319$Default_Query_Mt__The_input___A__ = makeString( "Default Query Mt: The input, ~A, was not understood." );
    $str320$Preferences = makeString( "Preferences" );
    $str321$cb_options = makeString( "cb-options" );
    $kw322$OPTIONS = makeKeyword( "OPTIONS" );
    $sym323$CB_LINK_OPTIONS = makeSymbol( "CB-LINK-OPTIONS" );
    $str324$Prefs = makeString( "Prefs" );
    $str325$Your_new_settings_require_you_to_ = makeString( "Your new settings require you to restart your browser." );
    $str326$Click_ = makeString( "Click " );
    $kw327$START = makeKeyword( "START" );
    $str328$here = makeString( "here" );
    $str329$_now_to_do_so_ = makeString( " now to do so." );
    $str330$KB_Browser_Options_have_been_modi = makeString( "KB Browser Options have been modified" );
    $str331$_and_saved = makeString( " and saved" );
    $str332$_ = makeString( "." );
    $sym333$CB_HISTORY = makeSymbol( "CB-HISTORY" );
    $kw334$CB_HISTORY = makeKeyword( "CB-HISTORY" );
    $str335$cb_history_html = makeString( "cb-history.html" );
    $kw336$CATEGORIZED = makeKeyword( "CATEGORIZED" );
    $kw337$ALPHABETICAL = makeKeyword( "ALPHABETICAL" );
    $str338$categorized = makeString( "categorized" );
    $str339$ = makeString( "" );
    $kw340$HISTORY_HL_FORMULAS = makeKeyword( "HISTORY-HL-FORMULAS" );
    $kw341$HISTORY_EL_FORMULAS = makeKeyword( "HISTORY-EL-FORMULAS" );
    $sym342$_CB_USE_CSS_COLUMNS_FOR_CATEGORIES_ = makeSymbol( "*CB-USE-CSS-COLUMNS-FOR-CATEGORIES*" );
    $str343$Recent_Constants__ = makeString( "Recent Constants :" );
    $kw344$HISTORY = makeKeyword( "HISTORY" );
    $str345$_Show_Alphabetical_ = makeString( "[Show Alphabetical]" );
    $str346$_Show_Categorized_ = makeString( "[Show Categorized]" );
    $kw347$CLEAR_CONSTANT_HISTORY = makeKeyword( "CLEAR-CONSTANT-HISTORY" );
    $sym348$TO_STRING = makeSymbol( "TO-STRING" );
    $str349$history_constants_columnar = makeString( "history-constants columnar" );
    $str350$history_constant = makeString( "history-constant" );
    $str351$None = makeString( "None" );
    $sym352$ISA_COLLECTION_ = makeSymbol( "ISA-COLLECTION?" );
    $sym353$ISA_RELATION_ = makeSymbol( "ISA-RELATION?" );
    $sym354$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str355$history_table = makeString( "history-table" );
    $str356$history_categorized_column = makeString( "history-categorized-column" );
    $str357$history_table_heading = makeString( "history-table-heading" );
    $str358$Most_nbsp_Recent = makeString( "Most&nbsp;Recent" );
    $str359$Collections = makeString( "Collections" );
    $str360$Individuals = makeString( "Individuals" );
    $str361$Relations = makeString( "Relations" );
    $str362$columns__4__column_count__4____we = makeString( "columns: 4; column-count: 4;  -webkit-columns: 4; -moz-columns:4;" );
    $str363$display_block__break_after__colum = makeString( "display:block; break-after: column; -webkit-column-break-after: always; overflow:hidden" );
    $str364$display__block__break_after__colu = makeString( "display: block; break-after: column; -webkit-column-break-after: always; overflow:hidden" );
    $str365$display__block__break_after__colu = makeString( "display: block; break-after: column; break-before: column; break-before: column; -webkit-column-break-after: always; overflow:hidden" );
    $str366$Recent_NATs__ = makeString( "Recent NATs :" );
    $kw367$CLEAR_NAT_HISTORY = makeKeyword( "CLEAR-NAT-HISTORY" );
    $str368$history_nats_columnar = makeString( "history-nats columnar" );
    $str369$history_nat = makeString( "history-nat" );
    $str370$Recent_Sentences__ = makeString( "Recent Sentences :" );
    $kw371$CLEAR_SENTENCE_HISTORY = makeKeyword( "CLEAR-SENTENCE-HISTORY" );
    $str372$cyclistReadilyAvailableTerms = makeString( "cyclistReadilyAvailableTerms" );
    $sym373$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $str374$font_size__larger__font_weight_bo = makeString( "font-size: larger; font-weight:bold" );
    $str375$To_remove_a_bookmark__follow_the_ = makeString( "To remove a bookmark, follow the link to the bookmarked item and click on the star." );
    $str376$Bookmarked_Constants__ = makeString( "Bookmarked Constants :" );
    $str377$bookmarked_constants_columnar = makeString( "bookmarked-constants columnar" );
    $str378$bookmarked_constant = makeString( "bookmarked-constant" );
    $sym379$CYCL_NAT_P = makeSymbol( "CYCL-NAT-P" );
    $str380$Bookmarked_NATs__ = makeString( "Bookmarked NATs :" );
    $str381$bookmarked_nats_columnar = makeString( "bookmarked-nats columnar" );
    $str382$bookmarked_nat = makeString( "bookmarked-nat" );
    $str383$Bookmarked_Assertions__ = makeString( "Bookmarked Assertions :" );
    $str384$bookmarked_asserts_columnar = makeString( "bookmarked-asserts columnar" );
    $str385$bookmarked_assert = makeString( "bookmarked-assert" );
    $str386$Recent_Assertions__ = makeString( "Recent Assertions :" );
    $kw387$CLEAR_ASSERTION_HISTORY = makeKeyword( "CLEAR-ASSERTION-HISTORY" );
    $sym388$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = makeSymbol( "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY" );
    $sym389$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = makeSymbol( "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY" );
    $sym390$CB_ASSERTION_LINK_WITH_MT = makeSymbol( "CB-ASSERTION-LINK-WITH-MT" );
    $sym391$CB_ASSERTION_LINK = makeSymbol( "CB-ASSERTION-LINK" );
    $kw392$HTML = makeKeyword( "HTML" );
    $kw393$NEW = makeKeyword( "NEW" );
    $str394$history_tool_gif = makeString( "history-tool.gif" );
    $str395$History = makeString( "History" );
    $str396$cb_history_categorized = makeString( "cb-history&categorized" );
    $str397$cb_history_alphabetical = makeString( "cb-history&alphabetical" );
    $sym398$CB_LINK_HISTORY = makeSymbol( "CB-LINK-HISTORY" );
    $str399$Hist = makeString( "Hist" );
    $str400$Recent_Browser_History = makeString( "Recent Browser History" );
    $list401 = ConsesLow.list( makeSymbol( "GROUP" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "STYLE" ) );
    $kw402$CONSTANT = makeKeyword( "CONSTANT" );
    $kw403$NAT = makeKeyword( "NAT" );
    $kw404$ASSERTION = makeKeyword( "ASSERTION" );
    $kw405$SENTENCE = makeKeyword( "SENTENCE" );
    $kw406$ALL = makeKeyword( "ALL" );
    $sym407$CB_CLEAR_HISTORY = makeSymbol( "CB-CLEAR-HISTORY" );
    $str408$_Clear_History_ = makeString( "[Clear History]" );
    $str409$cb_clear_history_ALL = makeString( "cb-clear-history&ALL" );
    $kw410$CLEAR_HISTORY = makeKeyword( "CLEAR-HISTORY" );
    $sym411$CB_LINK_CLEAR_HISTORY = makeSymbol( "CB-LINK-CLEAR-HISTORY" );
    $str412$_Clear_Constant_History_ = makeString( "[Clear Constant History]" );
    $str413$cb_clear_history_CONSTANT__A = makeString( "cb-clear-history&CONSTANT&~A" );
    $sym414$CB_LINK_CLEAR_CONSTANT_HISTORY = makeSymbol( "CB-LINK-CLEAR-CONSTANT-HISTORY" );
    $str415$_Clear_NAT_History_ = makeString( "[Clear NAT History]" );
    $str416$cb_clear_history_NAT = makeString( "cb-clear-history&NAT" );
    $sym417$CB_LINK_CLEAR_NAT_HISTORY = makeSymbol( "CB-LINK-CLEAR-NAT-HISTORY" );
    $str418$_Clear_Assertion_History_ = makeString( "[Clear Assertion History]" );
    $str419$cb_clear_history_ASSERTION = makeString( "cb-clear-history&ASSERTION" );
    $sym420$CB_LINK_CLEAR_ASSERTION_HISTORY = makeSymbol( "CB-LINK-CLEAR-ASSERTION-HISTORY" );
    $str421$_Clear_Sentence_History_ = makeString( "[Clear Sentence History]" );
    $str422$cb_clear_history_SENTENCE = makeString( "cb-clear-history&SENTENCE" );
    $sym423$CB_LINK_CLEAR_SENTENCE_HISTORY = makeSymbol( "CB-LINK-CLEAR-SENTENCE-HISTORY" );
    $sym424$CB_HISTORY_EL_FORMULAS = makeSymbol( "CB-HISTORY-EL-FORMULAS" );
    $str425$_EL_Formulas_ = makeString( "[EL Formulas]" );
    $str426$cb_history_el_formulas = makeString( "cb-history-el-formulas" );
    $sym427$CB_LINK_HISTORY_EL_FORMULAS = makeSymbol( "CB-LINK-HISTORY-EL-FORMULAS" );
    $sym428$CB_HISTORY_HL_FORMULAS = makeSymbol( "CB-HISTORY-HL-FORMULAS" );
    $str429$_HL_Formulas_ = makeString( "[HL Formulas]" );
    $str430$cb_history_hl_formulas = makeString( "cb-history-hl-formulas" );
    $sym431$CB_LINK_HISTORY_HL_FORMULAS = makeSymbol( "CB-LINK-HISTORY-HL-FORMULAS" );
    $sym432$FORT_P = makeSymbol( "FORT-P" );
    $str433$Unable_to_add__S_to_history = makeString( "Unable to add ~S to history" );
    $int434$50 = makeInteger( 50 );
    $sym435$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $int436$25 = makeInteger( 25 );
    $sym437$CB_VALID_NAT_P = makeSymbol( "CB-VALID-NAT-P" );
    $sym438$TREE_FIND = makeSymbol( "TREE-FIND" );
    $sym439$TERM_OF_UNIT = makeSymbol( "TERM-OF-UNIT" );
    $sym440$FIND = makeSymbol( "FIND" );
    $sym441$EXPRESSION_FORTS_WITH_HL = makeSymbol( "EXPRESSION-FORTS-WITH-HL" );
    $sym442$CYCL_SENTENCE_P = makeSymbol( "CYCL-SENTENCE-P" );
    $sym443$EXPRESSION_FORTS = makeSymbol( "EXPRESSION-FORTS" );
    $sym444$CB_BOOKMARKED_ITEMS = makeSymbol( "CB-BOOKMARKED-ITEMS" );
    $sym445$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $const446$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const447$CyclistsMt = constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) );
    $const448$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) );
    $list449 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
    $sym450$_EXIT = makeSymbol( "%EXIT" );
    $const451$cyclistReadilyAvailableTerms = constant_handles.reader_make_constant_shell( makeString( "cyclistReadilyAvailableTerms" ) );
    $sym452$NAME_FOR_ALPHA_SORT = makeSymbol( "NAME-FOR-ALPHA-SORT" );
    $sym453$_CB_BOOKMARKED_ITEMS_CACHING_STATE_ = makeSymbol( "*CB-BOOKMARKED-ITEMS-CACHING-STATE*" );
    $sym454$CLEAR_CB_BOOKMARKED_ITEMS = makeSymbol( "CLEAR-CB-BOOKMARKED-ITEMS" );
    $str455$_ = makeString( "~" );
    $str456$Recently_Added_KB_Content = makeString( "Recently Added KB Content" );
    $str457$float__right = makeString( "float: right" );
    $kw458$RECENT_KB_ADDITIONS = makeKeyword( "RECENT-KB-ADDITIONS" );
    $str459$_Refresh_Page_ = makeString( "[Refresh Page]" );
    $sym460$CB_RECENT_KB_ADDITIONS = makeSymbol( "CB-RECENT-KB-ADDITIONS" );
    $str461$_Recently_Added_KB_Content = makeString( "[Recently Added KB Content" );
    $str462$cb_recent_kb_additions = makeString( "cb-recent-kb-additions" );
    $sym463$CB_LINK_RECENT_KB_ADDITIONS = makeSymbol( "CB-LINK-RECENT-KB-ADDITIONS" );
    $list464 = ConsesLow.list( makeKeyword( "CONSTANT" ), makeKeyword( "NART" ), makeKeyword( "ASSERTION" ), makeKeyword( "DEDUCTION" ), makeKeyword( "KB-HL-SUPPORT" ) );
    $str465$Recent_constants_ = makeString( "Recent constants:" );
    $str466$mapping_constants_for_sweep = makeString( "mapping constants for sweep" );
    $str467$cdolist = makeString( "cdolist" );
    $kw468$SKIP = makeKeyword( "SKIP" );
    $kw469$NART = makeKeyword( "NART" );
    $str470$Recent_NARTs_ = makeString( "Recent NARTs:" );
    $str471$mapping_narts_for_sweep = makeString( "mapping narts for sweep" );
    $str472$Recent_assertions_ = makeString( "Recent assertions:" );
    $str473$mapping_assertions_for_sweep = makeString( "mapping assertions for sweep" );
    $kw474$DEDUCTION = makeKeyword( "DEDUCTION" );
    $str475$Recent_deductions_ = makeString( "Recent deductions:" );
    $str476$mapping_deductions_for_sweep = makeString( "mapping deductions for sweep" );
    $kw477$KB_HL_SUPPORTS = makeKeyword( "KB-HL-SUPPORTS" );
    $str478$Recent_KB_HL_supports_ = makeString( "Recent KB HL supports:" );
    $str479$mapping_kb_hl_supports_for_sweep = makeString( "mapping kb-hl-supports for sweep" );
    $kw480$TEXT = makeKeyword( "TEXT" );
    $list481 = ConsesLow.list( makeKeyword( "BROWSING-AND-EDITING" ) );
    $int482$80 = makeInteger( 80 );
    $str483$the_SubLisp_Interactor = makeString( "the SubLisp Interactor" );
    $str484$interactor = makeString( "interactor" );
    $str485$SubL_Interactor = makeString( "SubL Interactor" );
    $str486$cb_handle_interactor = makeString( "cb-handle-interactor" );
    $str487$document = makeString( "document" );
    $str488$input_string = makeString( "input-string" );
    $sym489$CB_HANDLE_INTERACTOR = makeSymbol( "CB-HANDLE-INTERACTOR" );
    $kw490$CB_HANDLE_INTERACTOR = makeKeyword( "CB-HANDLE-INTERACTOR" );
    $str491$cb_handle_interactor_html = makeString( "cb-handle-interactor.html" );
    $kw492$HTML_EDITOR_SCRIPTS = makeKeyword( "HTML-EDITOR-SCRIPTS" );
    $str493$Eval = makeString( "Eval" );
    $str494$Enter_A_Form__ = makeString( "Enter A Form :" );
    $str495$Reset = makeString( "Reset" );
    $str496$Cyclify = makeString( "Cyclify" );
    $kw497$ERROR = makeKeyword( "ERROR" );
    $kw498$RED = makeKeyword( "RED" );
    $str499$Malformed_expression___ = makeString( "Malformed expression : " );
    $str500$Last_Form_Evaluated___ = makeString( "Last Form Evaluated : " );
    $str501$Results___ = makeString( "Results : " );
    $sym502$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym503$MULTIPLE_VALUE_LIST = makeSymbol( "MULTIPLE-VALUE-LIST" );
    $str504$ERROR___ = makeString( "ERROR : " );
    $str505$Interactor = makeString( "Interactor" );
    $kw506$INTERACTOR = makeKeyword( "INTERACTOR" );
    $sym507$CB_LINK_INTERACTOR = makeSymbol( "CB-LINK-INTERACTOR" );
    $str508$SubL = makeString( "SubL" );
    $str509$_ = makeString( "(" );
    $str510$_ = makeString( " " );
    $str511$_ = makeString( ")" );
    $sym512$FUNCTION = makeSymbol( "FUNCTION" );
    $str513$__ = makeString( "#'" );
    $str514$_ = makeString( "'" );
    $str515$___ = makeString( " . " );
    $sym516$_HTML_STATE_FILENAME_ = makeSymbol( "*HTML-STATE-FILENAME*" );
    $str517$pref = makeString( "pref" );
    $str518$preferences = makeString( "preferences" );
    $str519$users = makeString( "users" );
    $str520$Save_Interface = makeString( "Save Interface" );
    $str521$default = makeString( "default" );
    $str522$Interface_Settings_Loaded_Success = makeString( "Interface Settings Loaded Successfully." );
    $str523$No_Interface_Settings_File_To_Loa = makeString( "No Interface Settings File To Load." );
    $sym524$CB_LOAD_USER_PREFERENCES = makeSymbol( "CB-LOAD-USER-PREFERENCES" );
    $int525$70 = makeInteger( 70 );
    $kw526$CB_LOAD_API = makeKeyword( "CB-LOAD-API" );
    $str527$cb_load_api_html = makeString( "cb-load-api.html" );
    $str528$the_KE_Load_Page = makeString( "the KE Load Page" );
    $str529$Load_API_Expressions_Page = makeString( "Load API Expressions Page" );
    $str530$cb_load_api_handler = makeString( "cb-load-api-handler" );
    $str531$Please_type_in_the_name_of_the_fi = makeString( "Please type in the name of the file to load and evaluate in the space below and hit the " );
    $str532$_Load_File__ = makeString( "[Load File] " );
    $str533$button_ = makeString( "button." );
    $str534$load_api_file_name = makeString( "load-api-file-name" );
    $str535$Load_File = makeString( "Load File" );
    $sym536$CB_LOAD_API = makeSymbol( "CB-LOAD-API" );
    $str537$cb_load_api_handler_called_with_n = makeString( "cb-load-api-handler called with no arguments" );
    $str538$Load_API_Expressions_Results = makeString( "Load API Expressions Results" );
    $str539$load_api_file_skip = makeString( "load-api-file-skip" );
    $str540$The_file__ = makeString( "The file '" );
    $str541$__was_loaded___Here_are_the_resul = makeString( "' was loaded.  Here are the results:" );
    $kw542$SUCCESS = makeKeyword( "SUCCESS" );
    $str543$Successfully_and_completely_loade = makeString( "Successfully and completely loaded!" );
    $str544$File__s_does_not_exist_ = makeString( "File ~s does not exist!" );
    $str545$KE_filename_was_not_a_string_ = makeString( "KE filename was not a string." );
    $sym546$CB_LOAD_API_HANDLER = makeSymbol( "CB-LOAD-API-HANDLER" );
    $kw547$FILE_NOT_FOUND = makeKeyword( "FILE-NOT-FOUND" );
    $str548$An_error_occurred_after_processin = makeString( "An error occurred after processing " );
    $str549$_forms_ = makeString( " forms." );
    $str550$Form_Number = makeString( "Form Number" );
    $str551$You_may_continue_processing_this_ = makeString(
        "You may continue processing this file.  Enter the number of the form to start (so you may skip the already processed forms or forms that have errors in them)." );
    $str552$KE_File_Name = makeString( "KE File Name" );
    $str553$You_may_also_specify_a_new_file_t = makeString(
        "You may also specify a new file to load.  If you change this file, make sure to change the number of forms to skip (above) to 0 to start processing the new form from the beginning." );
    $kw554$CB_SHOW_WHEN = makeKeyword( "CB-SHOW-WHEN" );
    $str555$cb_show_when_html = makeString( "cb-show-when.html" );
    $str556$the_Display_by_Date = makeString( "the Display by Date" );
    $str557$Display_by_Date = makeString( "Display by Date" );
    $str558$cb_show_when_handler = makeString( "cb-show-when-handler" );
    $str559$What_kind_of_data_do_you_want_to_ = makeString( "What kind of data do you want to display?" );
    $str560$cb_show_type = makeString( "cb-show-type" );
    $str561$Constants = makeString( "Constants" );
    $str562$Assertions = makeString( "Assertions" );
    $str563$Enter_in_the_start_date_ = makeString( "Enter in the start date:" );
    $str564$Month = makeString( "Month" );
    $str565$cb_show_start_month = makeString( "cb-show-start-month" );
    $str566$Day = makeString( "Day" );
    $str567$cb_show_start_day = makeString( "cb-show-start-day" );
    $str568$Year = makeString( "Year" );
    $str569$cb_show_start_year = makeString( "cb-show-start-year" );
    $str570$Enter_in_the_ending_date_ = makeString( "Enter in the ending date:" );
    $str571$cb_show_end_month = makeString( "cb-show-end-month" );
    $str572$cb_show_end_day = makeString( "cb-show-end-day" );
    $str573$cb_show_end_year = makeString( "cb-show-end-year" );
    $str574$Enter_the_cyclist_to_examine__bla = makeString( "Enter the cyclist to examine (blank indicates to examine ALL cyclists):" );
    $str575$cb_show_cyclist = makeString( "cb-show-cyclist" );
    $int576$24 = makeInteger( 24 );
    $str577$Enter_the_project_to_examine__bla = makeString( "Enter the project to examine (blank indicates to examine ALL projects):" );
    $str578$cb_show_project = makeString( "cb-show-project" );
    $const579$Cyc_BasedProject = constant_handles.reader_make_constant_shell( makeString( "Cyc-BasedProject" ) );
    $sym580$CB_SHOW_WHEN = makeSymbol( "CB-SHOW-WHEN" );
    $kw581$CB_SHOW_WHEN_HANDLER = makeKeyword( "CB-SHOW-WHEN-HANDLER" );
    $str582$cb_show_when_handler_html = makeString( "cb-show-when-handler.html" );
    $str583$Please_specify_either_a_Constant_ = makeString( "Please specify either a Constant or an Assertion search." );
    $str584$Unknown_cyclist___S = makeString( "Unknown cyclist: ~S" );
    $str585$Unknown_project___S = makeString( "Unknown project: ~S" );
    $str586$Date_Search_Results = makeString( "Date Search Results" );
    $str587$Listing_ = makeString( "Listing " );
    $str588$constants = makeString( "constants" );
    $str589$assertions = makeString( "assertions" );
    $str590$_created_from_ = makeString( " created from " );
    $str591$_to_ = makeString( " to " );
    $str592$_by_ = makeString( " by " );
    $str593$_for_ = makeString( " for " );
    $sym594$CONSTANTS_FOR_PROJECTS_BETWEEN = makeSymbol( "CONSTANTS-FOR-PROJECTS-BETWEEN" );
    $sym595$CONSTANTS_CREATED_BETWEEN = makeSymbol( "CONSTANTS-CREATED-BETWEEN" );
    $sym596$ASSERTIONS_FOR_PROJECTS_BETWEEN = makeSymbol( "ASSERTIONS-FOR-PROJECTS-BETWEEN" );
    $sym597$ASSERTIONS_BETWEEN = makeSymbol( "ASSERTIONS-BETWEEN" );
    $sym598$_CONSTANT = makeSymbol( "?CONSTANT" );
    $sym599$_ASSERTION = makeSymbol( "?ASSERTION" );
    $const600$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym601$_TERM_LIST = makeSymbol( "?TERM-LIST" );
    $const602$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const603$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $const604$EvaluateSubLFn = constant_handles.reader_make_constant_shell( makeString( "EvaluateSubLFn" ) );
    $const605$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $const606$memberOfList = constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) );
    $list607 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), makeSymbol( "?TERM-LIST" ) ) );
    $const608$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list609 = ConsesLow.list( makeKeyword( "BROWSABLE?" ), T, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $kw610$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $str611$Expected_When_Tool_inference_halt = makeString( "Expected When Tool inference halt reason to be :EXHAUST-TOTAL, but it was ~s" );
    $sym612$CB_SHOW_WHEN_HANDLER = makeSymbol( "CB-SHOW-WHEN-HANDLER" );
    $str613$None_for_the_given_time_period_ = makeString( "None for the given time period." );
    $str614$_a__a___ = makeString( "~a ~a.~%" );
    $kw615$SAVE_INFERENCE_ANSWERS = makeKeyword( "SAVE-INFERENCE-ANSWERS" );
    $str616$_in_ = makeString( " in " );
    $str617$When = makeString( "When" );
    $str618$cb_show_when = makeString( "cb-show-when" );
    $kw619$SHOW_WHEN = makeKeyword( "SHOW-WHEN" );
    $sym620$CB_LINK_SHOW_WHEN = makeSymbol( "CB-LINK-SHOW-WHEN" );
    $str621$Display_assertions_constants_by_d = makeString( "Display assertions/constants by date" );
    $kw622$CB_INDEX_OVERLAP = makeKeyword( "CB-INDEX-OVERLAP" );
    $str623$cb_index_overlap_html = makeString( "cb-index-overlap.html" );
    $str624$Index_Overlap = makeString( "Index Overlap" );
    $str625$cb_handle_index_overlap = makeString( "cb-handle-index-overlap" );
    $str626$Search = makeString( "Search" );
    $str627$Enter_required_terms_separated_by = makeString( "Enter required terms separated by whitespace : " );
    $str628$terms = makeString( "terms" );
    $str629$Enter_terms_to_exclude_separated_ = makeString( "Enter terms to exclude separated by whitespace : " );
    $str630$exclude_terms = makeString( "exclude-terms" );
    $sym631$CB_INDEX_OVERLAP = makeSymbol( "CB-INDEX-OVERLAP" );
    $str632$Error_reading_terms___Check_for_t = makeString( "Error reading terms.  Check for typos." );
    $str633$Error_reading_exclude_terms___Che = makeString( "Error reading exclude terms.  Check for typos." );
    $str634$Index_Overlap_Results = makeString( "Index Overlap Results" );
    $str635$Search_Terms__ = makeString( "Search Terms: " );
    $str636$Please_enter_some_valid_search_te = makeString( "Please enter some valid search terms." );
    $str637$Excluded_Terms__ = makeString( "Excluded Terms: " );
    $str638$Please_enter_more_than_1_search_t = makeString( "Please enter more than 1 search term." );
    $sym639$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const640$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str641$Index_Overlap___ = makeString( "Index Overlap: (" );
    $str642$_assertions_found_ = makeString( " assertions found)" );
    $sym643$CB_HANDLE_INDEX_OVERLAP = makeSymbol( "CB-HANDLE-INDEX-OVERLAP" );
    $str644$Overlap = makeString( "Overlap" );
    $str645$cb_index_overlap = makeString( "cb-index-overlap" );
    $kw646$INDEX_OVERLAP = makeKeyword( "INDEX-OVERLAP" );
    $sym647$CB_LINK_INDEX_OVERLAP = makeSymbol( "CB-LINK-INDEX-OVERLAP" );
    $str648$Ovlp = makeString( "Ovlp" );
    $str649$Term_Index_Overlap = makeString( "Term Index Overlap" );
    $str650$OWL_Import = makeString( "OWL Import" );
    $str651$cb_owl_import = makeString( "cb-owl-import" );
    $kw652$OWL_IMPORT = makeKeyword( "OWL-IMPORT" );
    $sym653$CB_LINK_OWL_IMPORT = makeSymbol( "CB-LINK-OWL-IMPORT" );
    $str654$OWL_I = makeString( "OWL-I" );
    $str655$OWL_Ontology_Importer = makeString( "OWL Ontology Importer" );
    $str656$OWL_Export = makeString( "OWL Export" );
    $str657$cb_owl_export = makeString( "cb-owl-export" );
    $kw658$OWL_EXPORT = makeKeyword( "OWL-EXPORT" );
    $sym659$CB_LINK_OWL_EXPORT = makeSymbol( "CB-LINK-OWL-EXPORT" );
    $str660$OWL_E = makeString( "OWL-E" );
    $str661$OWL_Ontology_Exporter = makeString( "OWL Ontology Exporter" );
    $kw662$COMPOSE = makeKeyword( "COMPOSE" );
    $str663$compose_tool_gif = makeString( "compose-tool.gif" );
    $str664$Compose = makeString( "Compose" );
    $str665$ke_compose = makeString( "ke-compose" );
    $sym666$CB_LINK_COMPOSE = makeSymbol( "CB-LINK-COMPOSE" );
    $str667$Compose_KE_Text = makeString( "Compose KE Text" );
    $str668$Comp = makeString( "Comp" );
    $str669$Navigator = makeString( "Navigator" );
    $str670$cyc_navigator = makeString( "cyc-navigator" );
    $kw671$NAVIGATOR = makeKeyword( "NAVIGATOR" );
    $sym672$CB_LINK_NAVIGATOR = makeSymbol( "CB-LINK-NAVIGATOR" );
    $str673$Nav = makeString( "Nav" );
    $str674$Cyc_Navigator = makeString( "Cyc Navigator" );
    $kw675$DOC = makeKeyword( "DOC" );
    $str676$doc_tool_gif = makeString( "doc-tool.gif" );
    $str677$_Doc_ = makeString( "[Doc]" );
    $str678$Doc = makeString( "Doc" );
    $sym679$CB_LINK_DOC = makeSymbol( "CB-LINK-DOC" );
    $str680$Cyc_Documentation = makeString( "Cyc Documentation" );
    $str681$cb_start = makeString( "cb-start" );
    $str682$http___ = makeString( "http://" );
    $str683$_ = makeString( ":" );
    $int684$3602 = makeInteger( 3602 );
    $str685$_cyccgi = makeString( "/cyccgi" );
    $str686$_localhost = makeString( "/localhost" );
    $str687$_Monitor_ = makeString( "[Monitor]" );
    $str688$_kbmonitor_makequery_jsp_kbq_stri = makeString( "/kbmonitor/makequery.jsp?kbq_string=" );
    $str689$_cyc_host_string_ = makeString( "&cyc_host_string=" );
    $str690$_cyc_port_string_ = makeString( "&cyc_port_string=" );
    $str691$_kbmonitor = makeString( "-kbmonitor" );
    $int692$600 = makeInteger( 600 );
    $int693$400 = makeInteger( 400 );
    $kw694$KB_MONITOR_INDEX_HOOK = makeKeyword( "KB-MONITOR-INDEX-HOOK" );
    $sym695$CB_LINK_KB_MONITOR_INDEX_HOOK = makeSymbol( "CB-LINK-KB-MONITOR-INDEX-HOOK" );
    $str696$Jstack_for_process_ = makeString( "Jstack for process " );
    $sym697$CB_JSTACK_TRACE = makeSymbol( "CB-JSTACK-TRACE" );
    $str698$jstack_Trace = makeString( "jstack Trace" );
    $str699$cyc_jstack_trace = makeString( "cyc-jstack-trace" );
    $kw700$JSTACK_TRACE = makeKeyword( "JSTACK-TRACE" );
    $sym701$CB_LINK_JSTACK_TRACE = makeSymbol( "CB-LINK-JSTACK-TRACE" );
    $list702 = ConsesLow.list( makeKeyword( "CYC-SYSTEM" ) );
    $str703$cb_jstack_trace = makeString( "cb-jstack-trace" );
    $str704$JRTL_jstack_Trace = makeString( "JRTL jstack Trace" );
  }
}
/*
 * 
 * Total time: 5872 ms
 * 
 */