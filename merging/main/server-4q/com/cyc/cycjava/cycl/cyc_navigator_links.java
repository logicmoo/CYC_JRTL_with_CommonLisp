/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-NAVIGATOR-LINKS
 * source file: /cyc/top/cycl/cyc-navigator-links.lisp
 * created:     2019/07/03 17:38:04
 */
public final class cyc_navigator_links extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyc_navigator_links();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_navigator_links";

    // Internal Constants
    private static final SubLSymbol $COMPOSE_KE_TEXT = makeKeyword("COMPOSE-KE-TEXT");

    static private final SubLList $list2 = list(makeKeyword("BROWSING-AND-EDITING"));

    static private final SubLString $str3$ke_compose = makeString("ke-compose");

    static private final SubLString $$$Compose_KE_Text = makeString("Compose KE Text");

    private static final SubLSymbol $LOAD_KE_FILE = makeKeyword("LOAD-KE-FILE");

    static private final SubLList $list7 = list(makeKeyword("BROWSING-AND-EDITING"), makeKeyword("FILE-HANDLING"));

    static private final SubLString $str8$ke_name_file = makeString("ke-name-file");

    static private final SubLString $$$Load_KE_File = makeString("Load KE File");

    private static final SubLSymbol $LOAD_API_FILE = makeKeyword("LOAD-API-FILE");

    private static final SubLList $list11 = list(makeKeyword("FILE-HANDLING"));

    private static final SubLString $str12$cb_load_api = makeString("cb-load-api");

    private static final SubLString $$$Load_API_Expressions = makeString("Load API Expressions");

    private static final SubLList $list15 = list(makeKeyword("CYC-MAIN-MENU"), makeKeyword("BROWSING-AND-EDITING"));

    private static final SubLString $str16$hb_start = makeString("hb-start");

    private static final SubLString $$$Hierarchy_Browser = makeString("Hierarchy Browser");

    private static final SubLString $str19$cb_start = makeString("cb-start");

    private static final SubLString $$$KB_Browser = makeString("KB Browser");

    private static final SubLList $list23 = list(makeKeyword("BROWSING-AND-EDITING"), makeKeyword("INFERENCE"));

    private static final SubLString $str24$cb_query = makeString("cb-query");

    private static final SubLString $$$Ask = makeString("Ask");

    private static final SubLString $str27$cb_assert = makeString("cb-assert");

    private static final SubLString $$$Assert = makeString("Assert");

    private static final SubLString $str30$cb_create = makeString("cb-create");

    private static final SubLString $$$Create = makeString("Create");

    private static final SubLSymbol $CB_HANDLE_INTERACTOR = makeKeyword("CB-HANDLE-INTERACTOR");

    private static final SubLList $list33 = list(makeKeyword("CYC-SYSTEM"));

    private static final SubLString $str34$cb_handle_interactor = makeString("cb-handle-interactor");

    private static final SubLString $$$SubL_Interactor = makeString("SubL Interactor");

    private static final SubLSymbol $CB_AUXILIARY_INDICES = makeKeyword("CB-AUXILIARY-INDICES");

    private static final SubLString $str37$cb_auxiliary_indices = makeString("cb-auxiliary-indices");

    private static final SubLString $$$Auxiliary_Index_List = makeString("Auxiliary Index List");

    private static final SubLString $str40$st_similarity_entrance = makeString("st-similarity-entrance");

    private static final SubLString $$$Similarity_Tool = makeString("Similarity Tool");

    private static final SubLList $list43 = list(makeKeyword("CYC-MAIN-MENU"), makeKeyword("CYC-SYSTEM"));

    private static final SubLString $str44$cb_setup = makeString("cb-setup");

    private static final SubLString $$$Browser_Setup = makeString("Browser Setup");

    private static final SubLString $str47$cb_login = makeString("cb-login");

    private static final SubLString $$$User_Login = makeString("User Login");

    private static final SubLList $list50 = list(makeKeyword("CYC-MAIN-MENU"));

    private static final SubLSymbol CYC_DOCUMENTATION_TOC = makeSymbol("CYC-DOCUMENTATION-TOC");

    private static final SubLString $$$Cyc_Documentation = makeString("Cyc Documentation");

    static private final SubLList $list54 = list(makeKeyword("STRING-IS-RELATIVE-URL"));

    private static final SubLString $str56$cb_agenda = makeString("cb-agenda");

    private static final SubLString $$$Agenda_Control = makeString("Agenda Control");

    private static final SubLString $str59$cb_mode = makeString("cb-mode");

    private static final SubLString $$$Communication_Modes = makeString("Communication Modes");

    private static final SubLString $str62$cb_system = makeString("cb-system");

    private static final SubLString $$$System_Information = makeString("System Information");

    private static final SubLSymbol $LOAD_TRANSCRIPT_FILE = makeKeyword("LOAD-TRANSCRIPT-FILE");

    private static final SubLString $str65$html_load_transcript = makeString("html-load-transcript");

    private static final SubLString $$$Load_Transcript_File = makeString("Load Transcript File");

    private static final SubLString $str68$cb_partition_load = makeString("cb-partition-load");

    private static final SubLString $$$Load_Partition = makeString("Load Partition");

    private static final SubLSymbol $SWITCH_TO_ENGLISH = makeKeyword("SWITCH-TO-ENGLISH");

    private static final SubLList $list71 = list(makeKeyword("NL-TOOLS"));

    private static final SubLString $str72$maybe_use_english = makeString("maybe-use-english");

    private static final SubLSymbol MAYBE_USE_ENGLISH_TEXT = makeSymbol("MAYBE-USE-ENGLISH-TEXT");

    private static final SubLString $str75$cb_pph_phrases = makeString("cb-pph-phrases");

    private static final SubLString $$$Browse_Generated_Phrases = makeString("Browse Generated Phrases");

    private static final SubLSymbol $HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = makeKeyword("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");

    private static final SubLList $list78 = list(makeKeyword("HIERARCHY-BROWSER"));

    private static final SubLString $str79$hb_handle_simple_choose_constants = makeString("hb-handle-simple-choose-constants|~a|~a");

    private static final SubLSymbol $HB_SELECT_NODE_TEXT = makeKeyword("HB-SELECT-NODE-TEXT");

    private static final SubLString $str81$hb_select_node__a = makeString("hb-select-node|~a");

    private static final SubLSymbol $HB_SELECT_NODE_IMAGE = makeKeyword("HB-SELECT-NODE-IMAGE");

    private static final SubLSymbol $HB_COLORS_AND_SYMBOLS = makeKeyword("HB-COLORS-AND-SYMBOLS");

    private static final SubLString $str85$hb_colors_and_symbols = makeString("hb-colors-and-symbols");

    private static final SubLString $$$Colors_and_Symbols = makeString("Colors and Symbols");

    private static final SubLList $list88 = list(makeKeyword("OTHER"));

    private static final SubLString $str89$cb_start_cyc_navigator = makeString("cb-start|cyc-navigator");

    private static final SubLString $$$Cyc_Navigator = makeString("Cyc Navigator");

    private static final SubLSymbol $TINY_CYCORP_SYMBOL_TO_NAVIGATOR = makeKeyword("TINY-CYCORP-SYMBOL-TO-NAVIGATOR");

    private static final SubLSymbol $CYCORP_SYMBOL_TINY = makeKeyword("CYCORP-SYMBOL-TINY");

    private static final SubLString $str94$ke_constantify = makeString("ke-constantify");

    private static final SubLString $$$Make_Constants = makeString("Make Constants");

    private static final SubLSymbol $CHECK_AND_POLL = makeKeyword("CHECK-AND-POLL");

    private static final SubLString $str97$ke_check_and_poll = makeString("ke-check-and-poll");

    private static final SubLString $$$here = makeString("here");

    private static final SubLString $str100$ke_eval = makeString("ke-eval");

    private static final SubLString $$$Evaluate_Forms = makeString("Evaluate Forms");

    public static SubLObject declare_cyc_navigator_links_file() {
        return NIL;
    }

    public static SubLObject init_cyc_navigator_links_file() {
        return NIL;
    }

    public static final SubLObject setup_cyc_navigator_links_file_alt() {
        cyc_navigator_internals.def_navigator_link($COMPOSE_KE_TEXT, $TEXT, $list_alt2, $str_alt3$ke_compose, ZERO_INTEGER, $MAIN, $$$Compose_KE_Text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_KE_FILE, $TEXT, $list_alt7, $str_alt8$ke_name_file, ZERO_INTEGER, $MAIN, $$$Load_KE_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_API_FILE, $TEXT, $list_alt7, $str_alt11$cb_load_api, ZERO_INTEGER, $MAIN, $$$Load_API_Expressions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_START, $TEXT, $list_alt14, $str_alt15$hb_start, ZERO_INTEGER, $MAIN, $$$Hierarchy_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_START, $TEXT, $list_alt14, $str_alt18$cb_start, ZERO_INTEGER, $TOP, $$$KB_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_ASK, $TEXT, $list_alt22, $str_alt23$cb_query, ZERO_INTEGER, $MAIN, $$$Ask, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_ASSERT, $TEXT, $list_alt2, $str_alt26$cb_assert, ZERO_INTEGER, $MAIN, $$$Assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_CREATE, $TEXT, $list_alt2, $str_alt29$cb_create, ZERO_INTEGER, $MAIN, $$$Create, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_HANDLE_INTERACTOR, $TEXT, $list_alt32, $str_alt33$cb_handle_interactor, ZERO_INTEGER, $MAIN, $$$SubL_Interactor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_AUXILIARY_INDICES, $TEXT, $list_alt2, $str_alt36$cb_auxiliary_indices, ZERO_INTEGER, $MAIN, $$$Auxiliary_Index_List, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($SIMILARITY, $TEXT, $list_alt2, $str_alt39$st_similarity_entrance, ZERO_INTEGER, $MAIN, $$$Similarity_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($DIALOG_SCRIPT, $TEXT, $list_alt2, $str_alt42$cb_dialog_script_entrance, ZERO_INTEGER, $MAIN, $$$Run_a_Dialog_Script, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($KE_REVIEW, $TEXT, $list_alt2, $str_alt45$ke_review, ZERO_INTEGER, $MAIN, $$$Knowledge_Entry_Review, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CLEAR_EL_FORMULAS_CACHE, $TEXT, $list_alt2, $str_alt48$cyc_nav_clear_el_formulas_cache, ZERO_INTEGER, $MAIN, $$$Clear_EL_Formulas_Cache, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($DISJOINTNESS_TOOL, $TEXT, $list_alt2, $str_alt51$cb_disjointness_preliminary_scree, ZERO_INTEGER, $MAIN, $$$Disjointness_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_SETUP, $TEXT, $list_alt54, $str_alt55$cb_setup, ZERO_INTEGER, $TOP, $$$Browser_Setup, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_LOGIN, $TEXT, $list_alt54, $str_alt58$cb_login, ZERO_INTEGER, $MAIN, $$$User_Login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CYC_DOCUMENTATION, $TEXT, $list_alt61, CYC_DOCUMENTATION_TOC, ZERO_INTEGER, $SELF, $$$Cyc_Documentation, $list_alt65, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($INFO_RETRIEVAL_PROTOTYPE, $TEXT, $list_alt61, $str_alt67$ir_start, ZERO_INTEGER, $TOP, $$$Info_Retrieval_Prototype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($WALES, $TEXT, $list_alt70, $str_alt71$c10_wales, ZERO_INTEGER, $MAIN, $$$Add_to_Lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($THESAURUS_MANAGER, $TEXT, $list_alt61, $str_alt74$tm_welcome_page, ZERO_INTEGER, $TOP, $$$Thesaurus_Manager, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($NAVIGATOR_PREFERENCES, $TEXT, $list_alt77, $str_alt78$set_navigator_preferences, ZERO_INTEGER, $MAIN, $$$Navigator_Preferences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_AGENDA, $TEXT, $list_alt77, $str_alt81$cb_agenda, ZERO_INTEGER, $MAIN, $$$Agenda_Control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($MAIN_MENU, $TEXT, $list_alt77, $$$menu, ZERO_INTEGER, $TOP, $$$Cyc_Main_Menu, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_MODE, $TEXT, $list_alt77, $str_alt87$cb_mode, ZERO_INTEGER, $MAIN, $$$Communication_Modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_SYSTEM, $TEXT, $list_alt77, $str_alt90$cb_system, ZERO_INTEGER, $MAIN, $$$System_Information, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_TRANSCRIPT_FILE, $TEXT, $list_alt93, $str_alt94$html_load_transcript, ZERO_INTEGER, $MAIN, $$$Load_Transcript_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_PARTITION, $TEXT, $list_alt93, $str_alt97$cb_partition_load, ZERO_INTEGER, $MAIN, $$$Load_Partition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HTML_GET_DIRECTORY_NAME, $TEXT, $list_alt93, $str_alt100$html_get_directory_name, ZERO_INTEGER, $MAIN, $$$Show_Directory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($SWITCH_TO_ENGLISH, $TEXT, $list_alt103, $str_alt104$maybe_use_english, ZERO_INTEGER, $MAIN, MAYBE_USE_ENGLISH_TEXT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CLEAR_GENERATION_CACHES, $TEXT, $list_alt103, $str_alt107$clear_pg_caches, ZERO_INTEGER, $MAIN, $$$Clear_Paraphrase_Caches, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($IR_USE_PARSE, $TEXT, $list_alt110, $str_alt111$ir_use_parse__a, ONE_INTEGER, $str_alt112$ir_bottom_right_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($IR_SWITCH_MODE, $TEXT, $list_alt110, $str_alt114$ir_switch_mode, ZERO_INTEGER, $str_alt115$ir_top_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($IR_PREFERENCES, $IMAGE, $list_alt110, $str_alt118$ir_preferences, ZERO_INTEGER, $str_alt112$ir_bottom_right_frame, NIL, NIL, $IR_PREFERENCES, NIL, $str_alt119$_Preferences_, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($IR_JUSTIFY, $TEXT, $list_alt110, $str_alt121$ir_justify__a, ONE_INTEGER, $str_alt122$ir_floating_pane, $str_alt123$_Show_Justification_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($IR_MAIN, $TEXT, $list_alt110, $str_alt125$ir_main_page, ZERO_INTEGER, $TOP, $str_alt126$_Refresh_Frames_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($IR_MT_CONTENT, $TEXT, $list_alt110, $str_alt128$ir_mt_content__a, ONE_INTEGER, $str_alt122$ir_floating_pane, $str_alt129$_View_Context_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $TEXT, $list_alt131, $str_alt132$hb_handle_simple_choose_constants, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_TEXT, $TEXT, $list_alt131, $str_alt134$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_IMAGE, $IMAGE, $list_alt131, $str_alt134$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_COLORS_AND_SYMBOLS, $TEXT, $list_alt131, $str_alt137$hb_colors_and_symbols, ZERO_INTEGER, $SELF, $$$Colors_and_Symbols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CYC_NAVIGATOR, $TEXT, $list_alt140, $str_alt141$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($TINY_CYCORP_SYMBOL_TO_NAVIGATOR, $IMAGE, $list_alt140, $str_alt141$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, NIL, NIL, $CYCORP_SYMBOL_TINY, NIL, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CONSTANTIFY, $TEXT, $list_alt140, $str_alt146$ke_constantify, ZERO_INTEGER, $MAIN, $$$Make_Constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CHECK_AND_POLL, $TEXT, $list_alt140, $str_alt149$ke_check_and_poll, ZERO_INTEGER, $MAIN, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($KE_EVAL, $TEXT, $list_alt140, $str_alt152$ke_eval, ZERO_INTEGER, $MAIN, $$$Evaluate_Forms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_cyc_navigator_links_file() {
        if (SubLFiles.USE_V1) {
            cyc_navigator_internals.def_navigator_link($COMPOSE_KE_TEXT, $TEXT, $list2, $str3$ke_compose, ZERO_INTEGER, $MAIN, $$$Compose_KE_Text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($LOAD_KE_FILE, $TEXT, $list7, $str8$ke_name_file, ZERO_INTEGER, $MAIN, $$$Load_KE_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($LOAD_API_FILE, $TEXT, $list11, $str12$cb_load_api, ZERO_INTEGER, $MAIN, $$$Load_API_Expressions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_START, $TEXT, $list15, $str16$hb_start, ZERO_INTEGER, $MAIN, $$$Hierarchy_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_START, $TEXT, $list15, $str19$cb_start, ZERO_INTEGER, $TOP, $$$KB_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_ASK, $TEXT, $list23, $str24$cb_query, ZERO_INTEGER, $MAIN, $$$Ask, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_ASSERT, $TEXT, $list2, $str27$cb_assert, ZERO_INTEGER, $MAIN, $$$Assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_CREATE, $TEXT, $list2, $str30$cb_create, ZERO_INTEGER, $MAIN, $$$Create, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_HANDLE_INTERACTOR, $TEXT, $list33, $str34$cb_handle_interactor, ZERO_INTEGER, $MAIN, $$$SubL_Interactor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_AUXILIARY_INDICES, $TEXT, $list2, $str37$cb_auxiliary_indices, ZERO_INTEGER, $MAIN, $$$Auxiliary_Index_List, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($SIMILARITY, $TEXT, $list2, $str40$st_similarity_entrance, ZERO_INTEGER, $MAIN, $$$Similarity_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_SETUP, $TEXT, $list43, $str44$cb_setup, ZERO_INTEGER, $TOP, $$$Browser_Setup, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_LOGIN, $TEXT, $list43, $str47$cb_login, ZERO_INTEGER, $MAIN, $$$User_Login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CYC_DOCUMENTATION, $TEXT, $list50, CYC_DOCUMENTATION_TOC, ZERO_INTEGER, $SELF, $$$Cyc_Documentation, $list54, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_AGENDA, $TEXT, $list33, $str56$cb_agenda, ZERO_INTEGER, $MAIN, $$$Agenda_Control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_MODE, $TEXT, $list33, $str59$cb_mode, ZERO_INTEGER, $MAIN, $$$Communication_Modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_SYSTEM, $TEXT, $list33, $str62$cb_system, ZERO_INTEGER, $MAIN, $$$System_Information, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($LOAD_TRANSCRIPT_FILE, $TEXT, $list11, $str65$html_load_transcript, ZERO_INTEGER, $MAIN, $$$Load_Transcript_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($LOAD_PARTITION, $TEXT, $list11, $str68$cb_partition_load, ZERO_INTEGER, $MAIN, $$$Load_Partition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($SWITCH_TO_ENGLISH, $TEXT, $list71, $str72$maybe_use_english, ZERO_INTEGER, $MAIN, MAYBE_USE_ENGLISH_TEXT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($PPH_PHRASES, $TEXT, $list71, $str75$cb_pph_phrases, ZERO_INTEGER, $MAIN, $$$Browse_Generated_Phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $TEXT, $list78, $str79$hb_handle_simple_choose_constants, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_TEXT, $TEXT, $list78, $str81$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_IMAGE, $IMAGE, $list78, $str81$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_COLORS_AND_SYMBOLS, $TEXT, $list78, $str85$hb_colors_and_symbols, ZERO_INTEGER, $SELF, $$$Colors_and_Symbols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CYC_NAVIGATOR, $TEXT, $list88, $str89$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($TINY_CYCORP_SYMBOL_TO_NAVIGATOR, $IMAGE, $list88, $str89$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, NIL, NIL, $CYCORP_SYMBOL_TINY, NIL, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CONSTANTIFY, $TEXT, $list88, $str94$ke_constantify, ZERO_INTEGER, $MAIN, $$$Make_Constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CHECK_AND_POLL, $TEXT, $list88, $str97$ke_check_and_poll, ZERO_INTEGER, $MAIN, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($KE_EVAL, $TEXT, $list88, $str100$ke_eval, ZERO_INTEGER, $MAIN, $$$Evaluate_Forms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            cyc_navigator_internals.def_navigator_link($LOAD_API_FILE, $TEXT, $list_alt7, $str_alt11$cb_load_api, ZERO_INTEGER, $MAIN, $$$Load_API_Expressions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_START, $TEXT, $list_alt14, $str_alt15$hb_start, ZERO_INTEGER, $MAIN, $$$Hierarchy_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_START, $TEXT, $list_alt14, $str_alt18$cb_start, ZERO_INTEGER, $TOP, $$$KB_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_ASK, $TEXT, $list_alt22, $str_alt23$cb_query, ZERO_INTEGER, $MAIN, $$$Ask, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_ASSERT, $TEXT, $list_alt2, $str_alt26$cb_assert, ZERO_INTEGER, $MAIN, $$$Assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_CREATE, $TEXT, $list_alt2, $str_alt29$cb_create, ZERO_INTEGER, $MAIN, $$$Create, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_HANDLE_INTERACTOR, $TEXT, $list_alt32, $str_alt33$cb_handle_interactor, ZERO_INTEGER, $MAIN, $$$SubL_Interactor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_AUXILIARY_INDICES, $TEXT, $list_alt2, $str_alt36$cb_auxiliary_indices, ZERO_INTEGER, $MAIN, $$$Auxiliary_Index_List, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($SIMILARITY, $TEXT, $list_alt2, $str_alt39$st_similarity_entrance, ZERO_INTEGER, $MAIN, $$$Similarity_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($DIALOG_SCRIPT, $TEXT, $list_alt2, $str_alt42$cb_dialog_script_entrance, ZERO_INTEGER, $MAIN, $$$Run_a_Dialog_Script, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($KE_REVIEW, $TEXT, $list_alt2, $str_alt45$ke_review, ZERO_INTEGER, $MAIN, $$$Knowledge_Entry_Review, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CLEAR_EL_FORMULAS_CACHE, $TEXT, $list_alt2, $str_alt48$cyc_nav_clear_el_formulas_cache, ZERO_INTEGER, $MAIN, $$$Clear_EL_Formulas_Cache, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($DISJOINTNESS_TOOL, $TEXT, $list_alt2, $str_alt51$cb_disjointness_preliminary_scree, ZERO_INTEGER, $MAIN, $$$Disjointness_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_SETUP, $TEXT, $list_alt54, $str_alt55$cb_setup, ZERO_INTEGER, $TOP, $$$Browser_Setup, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_LOGIN, $TEXT, $list_alt54, $str_alt58$cb_login, ZERO_INTEGER, $MAIN, $$$User_Login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CYC_DOCUMENTATION, $TEXT, $list_alt61, CYC_DOCUMENTATION_TOC, ZERO_INTEGER, $SELF, $$$Cyc_Documentation, $list_alt65, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($INFO_RETRIEVAL_PROTOTYPE, $TEXT, $list_alt61, $str_alt67$ir_start, ZERO_INTEGER, $TOP, $$$Info_Retrieval_Prototype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($WALES, $TEXT, $list_alt70, $str_alt71$c10_wales, ZERO_INTEGER, $MAIN, $$$Add_to_Lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($THESAURUS_MANAGER, $TEXT, $list_alt61, $str_alt74$tm_welcome_page, ZERO_INTEGER, $TOP, $$$Thesaurus_Manager, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($NAVIGATOR_PREFERENCES, $TEXT, $list_alt77, $str_alt78$set_navigator_preferences, ZERO_INTEGER, $MAIN, $$$Navigator_Preferences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_AGENDA, $TEXT, $list_alt77, $str_alt81$cb_agenda, ZERO_INTEGER, $MAIN, $$$Agenda_Control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($MAIN_MENU, $TEXT, $list_alt77, $$$menu, ZERO_INTEGER, $TOP, $$$Cyc_Main_Menu, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_MODE, $TEXT, $list_alt77, $str_alt87$cb_mode, ZERO_INTEGER, $MAIN, $$$Communication_Modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CB_SYSTEM, $TEXT, $list_alt77, $str_alt90$cb_system, ZERO_INTEGER, $MAIN, $$$System_Information, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($LOAD_TRANSCRIPT_FILE, $TEXT, $list_alt93, $str_alt94$html_load_transcript, ZERO_INTEGER, $MAIN, $$$Load_Transcript_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($LOAD_PARTITION, $TEXT, $list_alt93, $str_alt97$cb_partition_load, ZERO_INTEGER, $MAIN, $$$Load_Partition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HTML_GET_DIRECTORY_NAME, $TEXT, $list_alt93, $str_alt100$html_get_directory_name, ZERO_INTEGER, $MAIN, $$$Show_Directory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($SWITCH_TO_ENGLISH, $TEXT, $list_alt103, $str_alt104$maybe_use_english, ZERO_INTEGER, $MAIN, MAYBE_USE_ENGLISH_TEXT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CLEAR_GENERATION_CACHES, $TEXT, $list_alt103, $str_alt107$clear_pg_caches, ZERO_INTEGER, $MAIN, $$$Clear_Paraphrase_Caches, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($IR_USE_PARSE, $TEXT, $list_alt110, $str_alt111$ir_use_parse__a, ONE_INTEGER, $str_alt112$ir_bottom_right_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($IR_SWITCH_MODE, $TEXT, $list_alt110, $str_alt114$ir_switch_mode, ZERO_INTEGER, $str_alt115$ir_top_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($IR_PREFERENCES, $IMAGE, $list_alt110, $str_alt118$ir_preferences, ZERO_INTEGER, $str_alt112$ir_bottom_right_frame, NIL, NIL, $IR_PREFERENCES, NIL, $str_alt119$_Preferences_, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($IR_JUSTIFY, $TEXT, $list_alt110, $str_alt121$ir_justify__a, ONE_INTEGER, $str_alt122$ir_floating_pane, $str_alt123$_Show_Justification_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($IR_MAIN, $TEXT, $list_alt110, $str_alt125$ir_main_page, ZERO_INTEGER, $TOP, $str_alt126$_Refresh_Frames_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($IR_MT_CONTENT, $TEXT, $list_alt110, $str_alt128$ir_mt_content__a, ONE_INTEGER, $str_alt122$ir_floating_pane, $str_alt129$_View_Context_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $TEXT, $list_alt131, $str_alt132$hb_handle_simple_choose_constants, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_TEXT, $TEXT, $list_alt131, $str_alt134$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_IMAGE, $IMAGE, $list_alt131, $str_alt134$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($HB_COLORS_AND_SYMBOLS, $TEXT, $list_alt131, $str_alt137$hb_colors_and_symbols, ZERO_INTEGER, $SELF, $$$Colors_and_Symbols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CYC_NAVIGATOR, $TEXT, $list_alt140, $str_alt141$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($TINY_CYCORP_SYMBOL_TO_NAVIGATOR, $IMAGE, $list_alt140, $str_alt141$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, NIL, NIL, $CYCORP_SYMBOL_TINY, NIL, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CONSTANTIFY, $TEXT, $list_alt140, $str_alt146$ke_constantify, ZERO_INTEGER, $MAIN, $$$Make_Constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($CHECK_AND_POLL, $TEXT, $list_alt140, $str_alt149$ke_check_and_poll, ZERO_INTEGER, $MAIN, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cyc_navigator_internals.def_navigator_link($KE_EVAL, $TEXT, $list_alt140, $str_alt152$ke_eval, ZERO_INTEGER, $MAIN, $$$Evaluate_Forms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject setup_cyc_navigator_links_file_Previous() {
        cyc_navigator_internals.def_navigator_link($COMPOSE_KE_TEXT, $TEXT, $list2, $str3$ke_compose, ZERO_INTEGER, $MAIN, $$$Compose_KE_Text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_KE_FILE, $TEXT, $list7, $str8$ke_name_file, ZERO_INTEGER, $MAIN, $$$Load_KE_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_API_FILE, $TEXT, $list11, $str12$cb_load_api, ZERO_INTEGER, $MAIN, $$$Load_API_Expressions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_START, $TEXT, $list15, $str16$hb_start, ZERO_INTEGER, $MAIN, $$$Hierarchy_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_START, $TEXT, $list15, $str19$cb_start, ZERO_INTEGER, $TOP, $$$KB_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_ASK, $TEXT, $list23, $str24$cb_query, ZERO_INTEGER, $MAIN, $$$Ask, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_ASSERT, $TEXT, $list2, $str27$cb_assert, ZERO_INTEGER, $MAIN, $$$Assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_CREATE, $TEXT, $list2, $str30$cb_create, ZERO_INTEGER, $MAIN, $$$Create, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_HANDLE_INTERACTOR, $TEXT, $list33, $str34$cb_handle_interactor, ZERO_INTEGER, $MAIN, $$$SubL_Interactor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_AUXILIARY_INDICES, $TEXT, $list2, $str37$cb_auxiliary_indices, ZERO_INTEGER, $MAIN, $$$Auxiliary_Index_List, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($SIMILARITY, $TEXT, $list2, $str40$st_similarity_entrance, ZERO_INTEGER, $MAIN, $$$Similarity_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_SETUP, $TEXT, $list43, $str44$cb_setup, ZERO_INTEGER, $TOP, $$$Browser_Setup, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_LOGIN, $TEXT, $list43, $str47$cb_login, ZERO_INTEGER, $MAIN, $$$User_Login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CYC_DOCUMENTATION, $TEXT, $list50, CYC_DOCUMENTATION_TOC, ZERO_INTEGER, $SELF, $$$Cyc_Documentation, $list54, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_AGENDA, $TEXT, $list33, $str56$cb_agenda, ZERO_INTEGER, $MAIN, $$$Agenda_Control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_MODE, $TEXT, $list33, $str59$cb_mode, ZERO_INTEGER, $MAIN, $$$Communication_Modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CB_SYSTEM, $TEXT, $list33, $str62$cb_system, ZERO_INTEGER, $MAIN, $$$System_Information, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_TRANSCRIPT_FILE, $TEXT, $list11, $str65$html_load_transcript, ZERO_INTEGER, $MAIN, $$$Load_Transcript_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($LOAD_PARTITION, $TEXT, $list11, $str68$cb_partition_load, ZERO_INTEGER, $MAIN, $$$Load_Partition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($SWITCH_TO_ENGLISH, $TEXT, $list71, $str72$maybe_use_english, ZERO_INTEGER, $MAIN, MAYBE_USE_ENGLISH_TEXT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($PPH_PHRASES, $TEXT, $list71, $str75$cb_pph_phrases, ZERO_INTEGER, $MAIN, $$$Browse_Generated_Phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $TEXT, $list78, $str79$hb_handle_simple_choose_constants, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_TEXT, $TEXT, $list78, $str81$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_SELECT_NODE_IMAGE, $IMAGE, $list78, $str81$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($HB_COLORS_AND_SYMBOLS, $TEXT, $list78, $str85$hb_colors_and_symbols, ZERO_INTEGER, $SELF, $$$Colors_and_Symbols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CYC_NAVIGATOR, $TEXT, $list88, $str89$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($TINY_CYCORP_SYMBOL_TO_NAVIGATOR, $IMAGE, $list88, $str89$cb_start_cyc_navigator, ZERO_INTEGER, $TOP, NIL, NIL, $CYCORP_SYMBOL_TINY, NIL, $$$Cyc_Navigator, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CONSTANTIFY, $TEXT, $list88, $str94$ke_constantify, ZERO_INTEGER, $MAIN, $$$Make_Constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($CHECK_AND_POLL, $TEXT, $list88, $str97$ke_check_and_poll, ZERO_INTEGER, $MAIN, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cyc_navigator_internals.def_navigator_link($KE_EVAL, $TEXT, $list88, $str100$ke_eval, ZERO_INTEGER, $MAIN, $$$Evaluate_Forms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeKeyword("BROWSING-AND-EDITING"));

    static private final SubLString $str_alt3$ke_compose = makeString("ke-compose");

    static private final SubLList $list_alt7 = list(makeKeyword("BROWSING-AND-EDITING"), makeKeyword("FILE-HANDLING"));

    static private final SubLString $str_alt8$ke_name_file = makeString("ke-name-file");

    static private final SubLString $str_alt11$cb_load_api = makeString("cb-load-api");

    static private final SubLList $list_alt14 = list(makeKeyword("CYC-MAIN-MENU"), makeKeyword("BROWSING-AND-EDITING"));

    static private final SubLString $str_alt15$hb_start = makeString("hb-start");

    static private final SubLString $str_alt18$cb_start = makeString("cb-start");

    static private final SubLList $list_alt22 = list(makeKeyword("BROWSING-AND-EDITING"), makeKeyword("INFERENCE"));

    static private final SubLString $str_alt23$cb_query = makeString("cb-query");

    static private final SubLString $str_alt26$cb_assert = makeString("cb-assert");

    static private final SubLString $str_alt29$cb_create = makeString("cb-create");

    static private final SubLList $list_alt32 = list(makeKeyword("BROWSING-AND-EDITING"), makeKeyword("CYC-SYSTEM"));

    static private final SubLString $str_alt33$cb_handle_interactor = makeString("cb-handle-interactor");

    static private final SubLString $str_alt36$cb_auxiliary_indices = makeString("cb-auxiliary-indices");

    static private final SubLString $str_alt39$st_similarity_entrance = makeString("st-similarity-entrance");

    private static final SubLSymbol $DIALOG_SCRIPT = makeKeyword("DIALOG-SCRIPT");

    @Override
    public void declareFunctions() {
        declare_cyc_navigator_links_file();
    }

    static private final SubLString $str_alt42$cb_dialog_script_entrance = makeString("cb-dialog-script-entrance");

    @Override
    public void initializeVariables() {
        init_cyc_navigator_links_file();
    }

    static private final SubLString $$$Run_a_Dialog_Script = makeString("Run a Dialog Script");

    @Override
    public void runTopLevelForms() {
        setup_cyc_navigator_links_file();
    }

    static private final SubLString $str_alt45$ke_review = makeString("ke-review");

    

    static private final SubLString $$$Knowledge_Entry_Review = makeString("Knowledge Entry Review");

    private static final SubLSymbol $CLEAR_EL_FORMULAS_CACHE = makeKeyword("CLEAR-EL-FORMULAS-CACHE");

    static private final SubLString $str_alt48$cyc_nav_clear_el_formulas_cache = makeString("cyc-nav-clear-el-formulas-cache");

    static private final SubLString $$$Clear_EL_Formulas_Cache = makeString("Clear EL Formulas Cache");

    private static final SubLSymbol $DISJOINTNESS_TOOL = makeKeyword("DISJOINTNESS-TOOL");

    static private final SubLString $str_alt51$cb_disjointness_preliminary_scree = makeString("cb-disjointness-preliminary-screen");

    static private final SubLString $$$Disjointness_Tool = makeString("Disjointness Tool");

    static private final SubLList $list_alt54 = list(makeKeyword("CYC-MAIN-MENU"), makeKeyword("CYC-SYSTEM"));

    static private final SubLString $str_alt55$cb_setup = makeString("cb-setup");

    static private final SubLString $str_alt58$cb_login = makeString("cb-login");

    static private final SubLList $list_alt61 = list(makeKeyword("CYC-MAIN-MENU"));

    static private final SubLList $list_alt65 = list(makeKeyword("STRING-IS-RELATIVE-URL"));

    private static final SubLSymbol $INFO_RETRIEVAL_PROTOTYPE = makeKeyword("INFO-RETRIEVAL-PROTOTYPE");

    static private final SubLString $str_alt67$ir_start = makeString("ir-start");

    static private final SubLString $$$Info_Retrieval_Prototype = makeString("Info Retrieval Prototype");

    private static final SubLSymbol $WALES = makeKeyword("WALES");

    static private final SubLList $list_alt70 = list(makeKeyword("CYC-MAIN-MENU"), makeKeyword("NL-TOOLS"));

    static private final SubLString $str_alt71$c10_wales = makeString("c10-wales");

    static private final SubLString $$$Add_to_Lexicon = makeString("Add to Lexicon");

    private static final SubLSymbol $THESAURUS_MANAGER = makeKeyword("THESAURUS-MANAGER");

    static private final SubLString $str_alt74$tm_welcome_page = makeString("tm-welcome-page");

    static private final SubLString $$$Thesaurus_Manager = makeString("Thesaurus Manager");

    private static final SubLSymbol $NAVIGATOR_PREFERENCES = makeKeyword("NAVIGATOR-PREFERENCES");

    static private final SubLList $list_alt77 = list(makeKeyword("CYC-SYSTEM"));

    static private final SubLString $str_alt78$set_navigator_preferences = makeString("set-navigator-preferences");

    static private final SubLString $$$Navigator_Preferences = makeString("Navigator Preferences");

    static private final SubLString $str_alt81$cb_agenda = makeString("cb-agenda");

    static private final SubLString $$$menu = makeString("menu");

    static private final SubLString $$$Cyc_Main_Menu = makeString("Cyc Main Menu");

    static private final SubLString $str_alt87$cb_mode = makeString("cb-mode");

    static private final SubLString $str_alt90$cb_system = makeString("cb-system");

    static private final SubLList $list_alt93 = list(makeKeyword("FILE-HANDLING"));

    static private final SubLString $str_alt94$html_load_transcript = makeString("html-load-transcript");

    static private final SubLString $str_alt97$cb_partition_load = makeString("cb-partition-load");

    private static final SubLSymbol $HTML_GET_DIRECTORY_NAME = makeKeyword("HTML-GET-DIRECTORY-NAME");

    static private final SubLString $str_alt100$html_get_directory_name = makeString("html-get-directory-name");

    static private final SubLString $$$Show_Directory = makeString("Show Directory");

    static private final SubLList $list_alt103 = list(makeKeyword("NL-TOOLS"));

    static private final SubLString $str_alt104$maybe_use_english = makeString("maybe-use-english");

    private static final SubLSymbol $CLEAR_GENERATION_CACHES = makeKeyword("CLEAR-GENERATION-CACHES");

    static private final SubLString $str_alt107$clear_pg_caches = makeString("clear-pg-caches");

    static private final SubLString $$$Clear_Paraphrase_Caches = makeString("Clear Paraphrase Caches");

    private static final SubLSymbol $IR_USE_PARSE = makeKeyword("IR-USE-PARSE");

    static private final SubLList $list_alt110 = list(makeKeyword("INFO-RETRIEVAL"));

    static private final SubLString $str_alt111$ir_use_parse__a = makeString("ir-use-parse|~a");

    static private final SubLString $str_alt112$ir_bottom_right_frame = makeString("ir-bottom-right-frame");

    private static final SubLSymbol $IR_SWITCH_MODE = makeKeyword("IR-SWITCH-MODE");

    static private final SubLString $str_alt114$ir_switch_mode = makeString("ir-switch-mode");

    static private final SubLString $str_alt115$ir_top_frame = makeString("ir-top-frame");

    private static final SubLSymbol $IR_PREFERENCES = makeKeyword("IR-PREFERENCES");

    static private final SubLString $str_alt118$ir_preferences = makeString("ir-preferences");

    static private final SubLString $str_alt119$_Preferences_ = makeString("[Preferences]");

    private static final SubLSymbol $IR_JUSTIFY = makeKeyword("IR-JUSTIFY");

    static private final SubLString $str_alt121$ir_justify__a = makeString("ir-justify|~a");

    static private final SubLString $str_alt122$ir_floating_pane = makeString("ir-floating-pane");

    static private final SubLString $str_alt123$_Show_Justification_ = makeString("[Show Justification]");

    private static final SubLSymbol $IR_MAIN = makeKeyword("IR-MAIN");

    static private final SubLString $str_alt125$ir_main_page = makeString("ir-main-page");

    static private final SubLString $str_alt126$_Refresh_Frames_ = makeString("[Refresh Frames]");

    private static final SubLSymbol $IR_MT_CONTENT = makeKeyword("IR-MT-CONTENT");

    static private final SubLString $str_alt128$ir_mt_content__a = makeString("ir-mt-content|~a");

    static private final SubLString $str_alt129$_View_Context_ = makeString("[View Context]");

    static private final SubLList $list_alt131 = list(makeKeyword("HIERARCHY-BROWSER"));

    static private final SubLString $str_alt132$hb_handle_simple_choose_constants = makeString("hb-handle-simple-choose-constants|~a|~a");

    static private final SubLString $str_alt134$hb_select_node__a = makeString("hb-select-node|~a");

    static private final SubLString $str_alt137$hb_colors_and_symbols = makeString("hb-colors-and-symbols");

    static private final SubLList $list_alt140 = list(makeKeyword("OTHER"));

    static private final SubLString $str_alt141$cb_start_cyc_navigator = makeString("cb-start|cyc-navigator");

    static private final SubLString $str_alt146$ke_constantify = makeString("ke-constantify");

    static private final SubLString $str_alt149$ke_check_and_poll = makeString("ke-check-and-poll");

    static private final SubLString $str_alt152$ke_eval = makeString("ke-eval");
}

/**
 * Total time: 100 ms
 */
