package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_navigator_links
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_navigator_links";
  public static final String myFingerPrint = "357a02809754761a16dc84f8cf10607db2abc2a5c4f790935d9d8e33a9c9ddea";
  private static final SubLSymbol $kw0$COMPOSE_KE_TEXT;
  private static final SubLSymbol $kw1$TEXT;
  private static final SubLList $list2;
  private static final SubLString $str3$ke_compose;
  private static final SubLSymbol $kw4$MAIN;
  private static final SubLString $str5$Compose_KE_Text;
  private static final SubLSymbol $kw6$LOAD_KE_FILE;
  private static final SubLList $list7;
  private static final SubLString $str8$ke_name_file;
  private static final SubLString $str9$Load_KE_File;
  private static final SubLSymbol $kw10$LOAD_API_FILE;
  private static final SubLList $list11;
  private static final SubLString $str12$cb_load_api;
  private static final SubLString $str13$Load_API_Expressions;
  private static final SubLSymbol $kw14$HB_START;
  private static final SubLList $list15;
  private static final SubLString $str16$hb_start;
  private static final SubLString $str17$Hierarchy_Browser;
  private static final SubLSymbol $kw18$CB_START;
  private static final SubLString $str19$cb_start;
  private static final SubLSymbol $kw20$TOP;
  private static final SubLString $str21$KB_Browser;
  private static final SubLSymbol $kw22$CB_ASK;
  private static final SubLList $list23;
  private static final SubLString $str24$cb_query;
  private static final SubLString $str25$Ask;
  private static final SubLSymbol $kw26$CB_ASSERT;
  private static final SubLString $str27$cb_assert;
  private static final SubLString $str28$Assert;
  private static final SubLSymbol $kw29$CB_CREATE;
  private static final SubLString $str30$cb_create;
  private static final SubLString $str31$Create;
  private static final SubLSymbol $kw32$CB_HANDLE_INTERACTOR;
  private static final SubLList $list33;
  private static final SubLString $str34$cb_handle_interactor;
  private static final SubLString $str35$SubL_Interactor;
  private static final SubLSymbol $kw36$CB_AUXILIARY_INDICES;
  private static final SubLString $str37$cb_auxiliary_indices;
  private static final SubLString $str38$Auxiliary_Index_List;
  private static final SubLSymbol $kw39$SIMILARITY;
  private static final SubLString $str40$st_similarity_entrance;
  private static final SubLString $str41$Similarity_Tool;
  private static final SubLSymbol $kw42$CB_SETUP;
  private static final SubLList $list43;
  private static final SubLString $str44$cb_setup;
  private static final SubLString $str45$Browser_Setup;
  private static final SubLSymbol $kw46$CB_LOGIN;
  private static final SubLString $str47$cb_login;
  private static final SubLString $str48$User_Login;
  private static final SubLSymbol $kw49$CYC_DOCUMENTATION;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CYC_DOCUMENTATION_TOC;
  private static final SubLSymbol $kw52$SELF;
  private static final SubLString $str53$Cyc_Documentation;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$CB_AGENDA;
  private static final SubLString $str56$cb_agenda;
  private static final SubLString $str57$Agenda_Control;
  private static final SubLSymbol $kw58$CB_MODE;
  private static final SubLString $str59$cb_mode;
  private static final SubLString $str60$Communication_Modes;
  private static final SubLSymbol $kw61$CB_SYSTEM;
  private static final SubLString $str62$cb_system;
  private static final SubLString $str63$System_Information;
  private static final SubLSymbol $kw64$LOAD_TRANSCRIPT_FILE;
  private static final SubLString $str65$html_load_transcript;
  private static final SubLString $str66$Load_Transcript_File;
  private static final SubLSymbol $kw67$LOAD_PARTITION;
  private static final SubLString $str68$cb_partition_load;
  private static final SubLString $str69$Load_Partition;
  private static final SubLSymbol $kw70$SWITCH_TO_ENGLISH;
  private static final SubLList $list71;
  private static final SubLString $str72$maybe_use_english;
  private static final SubLSymbol $sym73$MAYBE_USE_ENGLISH_TEXT;
  private static final SubLSymbol $kw74$PPH_PHRASES;
  private static final SubLString $str75$cb_pph_phrases;
  private static final SubLString $str76$Browse_Generated_Phrases;
  private static final SubLSymbol $kw77$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS;
  private static final SubLList $list78;
  private static final SubLString $str79$hb_handle_simple_choose_constants;
  private static final SubLSymbol $kw80$HB_SELECT_NODE_TEXT;
  private static final SubLString $str81$hb_select_node__a;
  private static final SubLSymbol $kw82$HB_SELECT_NODE_IMAGE;
  private static final SubLSymbol $kw83$IMAGE;
  private static final SubLSymbol $kw84$HB_COLORS_AND_SYMBOLS;
  private static final SubLString $str85$hb_colors_and_symbols;
  private static final SubLString $str86$Colors_and_Symbols;
  private static final SubLSymbol $kw87$CYC_NAVIGATOR;
  private static final SubLList $list88;
  private static final SubLString $str89$cb_start_cyc_navigator;
  private static final SubLString $str90$Cyc_Navigator;
  private static final SubLSymbol $kw91$TINY_CYCORP_SYMBOL_TO_NAVIGATOR;
  private static final SubLSymbol $kw92$CYCORP_SYMBOL_TINY;
  private static final SubLSymbol $kw93$CONSTANTIFY;
  private static final SubLString $str94$ke_constantify;
  private static final SubLString $str95$Make_Constants;
  private static final SubLSymbol $kw96$CHECK_AND_POLL;
  private static final SubLString $str97$ke_check_and_poll;
  private static final SubLString $str98$here;
  private static final SubLSymbol $kw99$KE_EVAL;
  private static final SubLString $str100$ke_eval;
  private static final SubLString $str101$Evaluate_Forms;

  public static SubLObject declare_cyc_navigator_links_file()
  {
    return NIL;
  }

  public static SubLObject init_cyc_navigator_links_file()
  {
    return NIL;
  }

  public static SubLObject setup_cyc_navigator_links_file()
  {
    cyc_navigator_internals.def_navigator_link( $kw0$COMPOSE_KE_TEXT, $kw1$TEXT, $list2, $str3$ke_compose, ZERO_INTEGER, $kw4$MAIN, $str5$Compose_KE_Text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw6$LOAD_KE_FILE, $kw1$TEXT, $list7, $str8$ke_name_file, ZERO_INTEGER, $kw4$MAIN, $str9$Load_KE_File, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw10$LOAD_API_FILE, $kw1$TEXT, $list11, $str12$cb_load_api, ZERO_INTEGER, $kw4$MAIN, $str13$Load_API_Expressions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw14$HB_START, $kw1$TEXT, $list15, $str16$hb_start, ZERO_INTEGER, $kw4$MAIN, $str17$Hierarchy_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw18$CB_START, $kw1$TEXT, $list15, $str19$cb_start, ZERO_INTEGER, $kw20$TOP, $str21$KB_Browser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw22$CB_ASK, $kw1$TEXT, $list23, $str24$cb_query, ZERO_INTEGER, $kw4$MAIN, $str25$Ask, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw26$CB_ASSERT, $kw1$TEXT, $list2, $str27$cb_assert, ZERO_INTEGER, $kw4$MAIN, $str28$Assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw29$CB_CREATE, $kw1$TEXT, $list2, $str30$cb_create, ZERO_INTEGER, $kw4$MAIN, $str31$Create, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw32$CB_HANDLE_INTERACTOR, $kw1$TEXT, $list33, $str34$cb_handle_interactor, ZERO_INTEGER, $kw4$MAIN, $str35$SubL_Interactor, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw36$CB_AUXILIARY_INDICES, $kw1$TEXT, $list2, $str37$cb_auxiliary_indices, ZERO_INTEGER, $kw4$MAIN, $str38$Auxiliary_Index_List, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw39$SIMILARITY, $kw1$TEXT, $list2, $str40$st_similarity_entrance, ZERO_INTEGER, $kw4$MAIN, $str41$Similarity_Tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw42$CB_SETUP, $kw1$TEXT, $list43, $str44$cb_setup, ZERO_INTEGER, $kw20$TOP, $str45$Browser_Setup, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw46$CB_LOGIN, $kw1$TEXT, $list43, $str47$cb_login, ZERO_INTEGER, $kw4$MAIN, $str48$User_Login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw49$CYC_DOCUMENTATION, $kw1$TEXT, $list50, $sym51$CYC_DOCUMENTATION_TOC, ZERO_INTEGER, $kw52$SELF, $str53$Cyc_Documentation, $list54, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw55$CB_AGENDA, $kw1$TEXT, $list33, $str56$cb_agenda, ZERO_INTEGER, $kw4$MAIN, $str57$Agenda_Control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw58$CB_MODE, $kw1$TEXT, $list33, $str59$cb_mode, ZERO_INTEGER, $kw4$MAIN, $str60$Communication_Modes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw61$CB_SYSTEM, $kw1$TEXT, $list33, $str62$cb_system, ZERO_INTEGER, $kw4$MAIN, $str63$System_Information, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw64$LOAD_TRANSCRIPT_FILE, $kw1$TEXT, $list11, $str65$html_load_transcript, ZERO_INTEGER, $kw4$MAIN, $str66$Load_Transcript_File, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw67$LOAD_PARTITION, $kw1$TEXT, $list11, $str68$cb_partition_load, ZERO_INTEGER, $kw4$MAIN, $str69$Load_Partition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw70$SWITCH_TO_ENGLISH, $kw1$TEXT, $list71, $str72$maybe_use_english, ZERO_INTEGER, $kw4$MAIN, $sym73$MAYBE_USE_ENGLISH_TEXT, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw74$PPH_PHRASES, $kw1$TEXT, $list71, $str75$cb_pph_phrases, ZERO_INTEGER, $kw4$MAIN, $str76$Browse_Generated_Phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw77$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $kw1$TEXT, $list78, $str79$hb_handle_simple_choose_constants, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw80$HB_SELECT_NODE_TEXT, $kw1$TEXT, $list78, $str81$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw82$HB_SELECT_NODE_IMAGE, $kw83$IMAGE, $list78, $str81$hb_select_node__a, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw84$HB_COLORS_AND_SYMBOLS, $kw1$TEXT, $list78, $str85$hb_colors_and_symbols, ZERO_INTEGER, $kw52$SELF, $str86$Colors_and_Symbols, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw87$CYC_NAVIGATOR, $kw1$TEXT, $list88, $str89$cb_start_cyc_navigator, ZERO_INTEGER, $kw20$TOP, $str90$Cyc_Navigator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw91$TINY_CYCORP_SYMBOL_TO_NAVIGATOR, $kw83$IMAGE, $list88, $str89$cb_start_cyc_navigator, ZERO_INTEGER, $kw20$TOP, NIL, NIL, $kw92$CYCORP_SYMBOL_TINY, NIL,
        $str90$Cyc_Navigator, UNPROVIDED, UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw93$CONSTANTIFY, $kw1$TEXT, $list88, $str94$ke_constantify, ZERO_INTEGER, $kw4$MAIN, $str95$Make_Constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw96$CHECK_AND_POLL, $kw1$TEXT, $list88, $str97$ke_check_and_poll, ZERO_INTEGER, $kw4$MAIN, $str98$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    cyc_navigator_internals.def_navigator_link( $kw99$KE_EVAL, $kw1$TEXT, $list88, $str100$ke_eval, ZERO_INTEGER, $kw4$MAIN, $str101$Evaluate_Forms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_navigator_links_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_navigator_links_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_navigator_links_file();
  }
  static
  {
    me = new cyc_navigator_links();
    $kw0$COMPOSE_KE_TEXT = makeKeyword( "COMPOSE-KE-TEXT" );
    $kw1$TEXT = makeKeyword( "TEXT" );
    $list2 = ConsesLow.list( makeKeyword( "BROWSING-AND-EDITING" ) );
    $str3$ke_compose = makeString( "ke-compose" );
    $kw4$MAIN = makeKeyword( "MAIN" );
    $str5$Compose_KE_Text = makeString( "Compose KE Text" );
    $kw6$LOAD_KE_FILE = makeKeyword( "LOAD-KE-FILE" );
    $list7 = ConsesLow.list( makeKeyword( "BROWSING-AND-EDITING" ), makeKeyword( "FILE-HANDLING" ) );
    $str8$ke_name_file = makeString( "ke-name-file" );
    $str9$Load_KE_File = makeString( "Load KE File" );
    $kw10$LOAD_API_FILE = makeKeyword( "LOAD-API-FILE" );
    $list11 = ConsesLow.list( makeKeyword( "FILE-HANDLING" ) );
    $str12$cb_load_api = makeString( "cb-load-api" );
    $str13$Load_API_Expressions = makeString( "Load API Expressions" );
    $kw14$HB_START = makeKeyword( "HB-START" );
    $list15 = ConsesLow.list( makeKeyword( "CYC-MAIN-MENU" ), makeKeyword( "BROWSING-AND-EDITING" ) );
    $str16$hb_start = makeString( "hb-start" );
    $str17$Hierarchy_Browser = makeString( "Hierarchy Browser" );
    $kw18$CB_START = makeKeyword( "CB-START" );
    $str19$cb_start = makeString( "cb-start" );
    $kw20$TOP = makeKeyword( "TOP" );
    $str21$KB_Browser = makeString( "KB Browser" );
    $kw22$CB_ASK = makeKeyword( "CB-ASK" );
    $list23 = ConsesLow.list( makeKeyword( "BROWSING-AND-EDITING" ), makeKeyword( "INFERENCE" ) );
    $str24$cb_query = makeString( "cb-query" );
    $str25$Ask = makeString( "Ask" );
    $kw26$CB_ASSERT = makeKeyword( "CB-ASSERT" );
    $str27$cb_assert = makeString( "cb-assert" );
    $str28$Assert = makeString( "Assert" );
    $kw29$CB_CREATE = makeKeyword( "CB-CREATE" );
    $str30$cb_create = makeString( "cb-create" );
    $str31$Create = makeString( "Create" );
    $kw32$CB_HANDLE_INTERACTOR = makeKeyword( "CB-HANDLE-INTERACTOR" );
    $list33 = ConsesLow.list( makeKeyword( "CYC-SYSTEM" ) );
    $str34$cb_handle_interactor = makeString( "cb-handle-interactor" );
    $str35$SubL_Interactor = makeString( "SubL Interactor" );
    $kw36$CB_AUXILIARY_INDICES = makeKeyword( "CB-AUXILIARY-INDICES" );
    $str37$cb_auxiliary_indices = makeString( "cb-auxiliary-indices" );
    $str38$Auxiliary_Index_List = makeString( "Auxiliary Index List" );
    $kw39$SIMILARITY = makeKeyword( "SIMILARITY" );
    $str40$st_similarity_entrance = makeString( "st-similarity-entrance" );
    $str41$Similarity_Tool = makeString( "Similarity Tool" );
    $kw42$CB_SETUP = makeKeyword( "CB-SETUP" );
    $list43 = ConsesLow.list( makeKeyword( "CYC-MAIN-MENU" ), makeKeyword( "CYC-SYSTEM" ) );
    $str44$cb_setup = makeString( "cb-setup" );
    $str45$Browser_Setup = makeString( "Browser Setup" );
    $kw46$CB_LOGIN = makeKeyword( "CB-LOGIN" );
    $str47$cb_login = makeString( "cb-login" );
    $str48$User_Login = makeString( "User Login" );
    $kw49$CYC_DOCUMENTATION = makeKeyword( "CYC-DOCUMENTATION" );
    $list50 = ConsesLow.list( makeKeyword( "CYC-MAIN-MENU" ) );
    $sym51$CYC_DOCUMENTATION_TOC = makeSymbol( "CYC-DOCUMENTATION-TOC" );
    $kw52$SELF = makeKeyword( "SELF" );
    $str53$Cyc_Documentation = makeString( "Cyc Documentation" );
    $list54 = ConsesLow.list( makeKeyword( "STRING-IS-RELATIVE-URL" ) );
    $kw55$CB_AGENDA = makeKeyword( "CB-AGENDA" );
    $str56$cb_agenda = makeString( "cb-agenda" );
    $str57$Agenda_Control = makeString( "Agenda Control" );
    $kw58$CB_MODE = makeKeyword( "CB-MODE" );
    $str59$cb_mode = makeString( "cb-mode" );
    $str60$Communication_Modes = makeString( "Communication Modes" );
    $kw61$CB_SYSTEM = makeKeyword( "CB-SYSTEM" );
    $str62$cb_system = makeString( "cb-system" );
    $str63$System_Information = makeString( "System Information" );
    $kw64$LOAD_TRANSCRIPT_FILE = makeKeyword( "LOAD-TRANSCRIPT-FILE" );
    $str65$html_load_transcript = makeString( "html-load-transcript" );
    $str66$Load_Transcript_File = makeString( "Load Transcript File" );
    $kw67$LOAD_PARTITION = makeKeyword( "LOAD-PARTITION" );
    $str68$cb_partition_load = makeString( "cb-partition-load" );
    $str69$Load_Partition = makeString( "Load Partition" );
    $kw70$SWITCH_TO_ENGLISH = makeKeyword( "SWITCH-TO-ENGLISH" );
    $list71 = ConsesLow.list( makeKeyword( "NL-TOOLS" ) );
    $str72$maybe_use_english = makeString( "maybe-use-english" );
    $sym73$MAYBE_USE_ENGLISH_TEXT = makeSymbol( "MAYBE-USE-ENGLISH-TEXT" );
    $kw74$PPH_PHRASES = makeKeyword( "PPH-PHRASES" );
    $str75$cb_pph_phrases = makeString( "cb-pph-phrases" );
    $str76$Browse_Generated_Phrases = makeString( "Browse Generated Phrases" );
    $kw77$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = makeKeyword( "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS" );
    $list78 = ConsesLow.list( makeKeyword( "HIERARCHY-BROWSER" ) );
    $str79$hb_handle_simple_choose_constants = makeString( "hb-handle-simple-choose-constants|~a|~a" );
    $kw80$HB_SELECT_NODE_TEXT = makeKeyword( "HB-SELECT-NODE-TEXT" );
    $str81$hb_select_node__a = makeString( "hb-select-node|~a" );
    $kw82$HB_SELECT_NODE_IMAGE = makeKeyword( "HB-SELECT-NODE-IMAGE" );
    $kw83$IMAGE = makeKeyword( "IMAGE" );
    $kw84$HB_COLORS_AND_SYMBOLS = makeKeyword( "HB-COLORS-AND-SYMBOLS" );
    $str85$hb_colors_and_symbols = makeString( "hb-colors-and-symbols" );
    $str86$Colors_and_Symbols = makeString( "Colors and Symbols" );
    $kw87$CYC_NAVIGATOR = makeKeyword( "CYC-NAVIGATOR" );
    $list88 = ConsesLow.list( makeKeyword( "OTHER" ) );
    $str89$cb_start_cyc_navigator = makeString( "cb-start|cyc-navigator" );
    $str90$Cyc_Navigator = makeString( "Cyc Navigator" );
    $kw91$TINY_CYCORP_SYMBOL_TO_NAVIGATOR = makeKeyword( "TINY-CYCORP-SYMBOL-TO-NAVIGATOR" );
    $kw92$CYCORP_SYMBOL_TINY = makeKeyword( "CYCORP-SYMBOL-TINY" );
    $kw93$CONSTANTIFY = makeKeyword( "CONSTANTIFY" );
    $str94$ke_constantify = makeString( "ke-constantify" );
    $str95$Make_Constants = makeString( "Make Constants" );
    $kw96$CHECK_AND_POLL = makeKeyword( "CHECK-AND-POLL" );
    $str97$ke_check_and_poll = makeString( "ke-check-and-poll" );
    $str98$here = makeString( "here" );
    $kw99$KE_EVAL = makeKeyword( "KE-EVAL" );
    $str100$ke_eval = makeString( "ke-eval" );
    $str101$Evaluate_Forms = makeString( "Evaluate Forms" );
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */