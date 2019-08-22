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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyc_navigator_links extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_navigator_links();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_navigator_links";

    public static final String myFingerPrint = "357a02809754761a16dc84f8cf10607db2abc2a5c4f790935d9d8e33a9c9ddea";

    private static final SubLSymbol $COMPOSE_KE_TEXT = makeKeyword("COMPOSE-KE-TEXT");



    public static final SubLList $list2 = list(makeKeyword("BROWSING-AND-EDITING"));

    public static final SubLString $str3$ke_compose = makeString("ke-compose");



    public static final SubLString $$$Compose_KE_Text = makeString("Compose KE Text");

    private static final SubLSymbol $LOAD_KE_FILE = makeKeyword("LOAD-KE-FILE");

    public static final SubLList $list7 = list(makeKeyword("BROWSING-AND-EDITING"), makeKeyword("FILE-HANDLING"));

    public static final SubLString $str8$ke_name_file = makeString("ke-name-file");

    public static final SubLString $$$Load_KE_File = makeString("Load KE File");

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

    public static final SubLList $list54 = list(makeKeyword("STRING-IS-RELATIVE-URL"));



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

    public static SubLObject setup_cyc_navigator_links_file() {
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

    @Override
    public void declareFunctions() {
        declare_cyc_navigator_links_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_navigator_links_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_navigator_links_file();
    }

    
}

/**
 * Total time: 100 ms
 */
