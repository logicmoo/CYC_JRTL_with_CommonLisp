package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_navigator_links extends SubLTranslatedFile
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
    
    public static SubLObject declare_cyc_navigator_links_file() {
        return (SubLObject)cyc_navigator_links.NIL;
    }
    
    public static SubLObject init_cyc_navigator_links_file() {
        return (SubLObject)cyc_navigator_links.NIL;
    }
    
    public static SubLObject setup_cyc_navigator_links_file() {
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw0$COMPOSE_KE_TEXT, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list2, (SubLObject)cyc_navigator_links.$str3$ke_compose, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str5$Compose_KE_Text, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw6$LOAD_KE_FILE, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list7, (SubLObject)cyc_navigator_links.$str8$ke_name_file, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str9$Load_KE_File, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw10$LOAD_API_FILE, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list11, (SubLObject)cyc_navigator_links.$str12$cb_load_api, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str13$Load_API_Expressions, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw14$HB_START, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list15, (SubLObject)cyc_navigator_links.$str16$hb_start, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str17$Hierarchy_Browser, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw18$CB_START, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list15, (SubLObject)cyc_navigator_links.$str19$cb_start, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw20$TOP, (SubLObject)cyc_navigator_links.$str21$KB_Browser, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw22$CB_ASK, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list23, (SubLObject)cyc_navigator_links.$str24$cb_query, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str25$Ask, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw26$CB_ASSERT, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list2, (SubLObject)cyc_navigator_links.$str27$cb_assert, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str28$Assert, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw29$CB_CREATE, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list2, (SubLObject)cyc_navigator_links.$str30$cb_create, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str31$Create, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw32$CB_HANDLE_INTERACTOR, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list33, (SubLObject)cyc_navigator_links.$str34$cb_handle_interactor, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str35$SubL_Interactor, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw36$CB_AUXILIARY_INDICES, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list2, (SubLObject)cyc_navigator_links.$str37$cb_auxiliary_indices, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str38$Auxiliary_Index_List, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw39$SIMILARITY, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list2, (SubLObject)cyc_navigator_links.$str40$st_similarity_entrance, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str41$Similarity_Tool, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw42$CB_SETUP, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list43, (SubLObject)cyc_navigator_links.$str44$cb_setup, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw20$TOP, (SubLObject)cyc_navigator_links.$str45$Browser_Setup, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw46$CB_LOGIN, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list43, (SubLObject)cyc_navigator_links.$str47$cb_login, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str48$User_Login, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw49$CYC_DOCUMENTATION, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list50, (SubLObject)cyc_navigator_links.$sym51$CYC_DOCUMENTATION_TOC, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw52$SELF, (SubLObject)cyc_navigator_links.$str53$Cyc_Documentation, (SubLObject)cyc_navigator_links.$list54, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw55$CB_AGENDA, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list33, (SubLObject)cyc_navigator_links.$str56$cb_agenda, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str57$Agenda_Control, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw58$CB_MODE, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list33, (SubLObject)cyc_navigator_links.$str59$cb_mode, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str60$Communication_Modes, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw61$CB_SYSTEM, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list33, (SubLObject)cyc_navigator_links.$str62$cb_system, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str63$System_Information, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw64$LOAD_TRANSCRIPT_FILE, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list11, (SubLObject)cyc_navigator_links.$str65$html_load_transcript, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str66$Load_Transcript_File, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw67$LOAD_PARTITION, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list11, (SubLObject)cyc_navigator_links.$str68$cb_partition_load, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str69$Load_Partition, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw70$SWITCH_TO_ENGLISH, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list71, (SubLObject)cyc_navigator_links.$str72$maybe_use_english, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$sym73$MAYBE_USE_ENGLISH_TEXT, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw74$PPH_PHRASES, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list71, (SubLObject)cyc_navigator_links.$str75$cb_pph_phrases, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str76$Browse_Generated_Phrases, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw77$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list78, (SubLObject)cyc_navigator_links.$str79$hb_handle_simple_choose_constants, (SubLObject)cyc_navigator_links.TWO_INTEGER, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw80$HB_SELECT_NODE_TEXT, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list78, (SubLObject)cyc_navigator_links.$str81$hb_select_node__a, (SubLObject)cyc_navigator_links.ONE_INTEGER, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw82$HB_SELECT_NODE_IMAGE, (SubLObject)cyc_navigator_links.$kw83$IMAGE, (SubLObject)cyc_navigator_links.$list78, (SubLObject)cyc_navigator_links.$str81$hb_select_node__a, (SubLObject)cyc_navigator_links.ONE_INTEGER, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw84$HB_COLORS_AND_SYMBOLS, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list78, (SubLObject)cyc_navigator_links.$str85$hb_colors_and_symbols, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw52$SELF, (SubLObject)cyc_navigator_links.$str86$Colors_and_Symbols, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw87$CYC_NAVIGATOR, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list88, (SubLObject)cyc_navigator_links.$str89$cb_start_cyc_navigator, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw20$TOP, (SubLObject)cyc_navigator_links.$str90$Cyc_Navigator, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw91$TINY_CYCORP_SYMBOL_TO_NAVIGATOR, (SubLObject)cyc_navigator_links.$kw83$IMAGE, (SubLObject)cyc_navigator_links.$list88, (SubLObject)cyc_navigator_links.$str89$cb_start_cyc_navigator, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw20$TOP, (SubLObject)cyc_navigator_links.NIL, (SubLObject)cyc_navigator_links.NIL, (SubLObject)cyc_navigator_links.$kw92$CYCORP_SYMBOL_TINY, (SubLObject)cyc_navigator_links.NIL, (SubLObject)cyc_navigator_links.$str90$Cyc_Navigator, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw93$CONSTANTIFY, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list88, (SubLObject)cyc_navigator_links.$str94$ke_constantify, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str95$Make_Constants, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw96$CHECK_AND_POLL, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list88, (SubLObject)cyc_navigator_links.$str97$ke_check_and_poll, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str98$here, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        cyc_navigator_internals.def_navigator_link((SubLObject)cyc_navigator_links.$kw99$KE_EVAL, (SubLObject)cyc_navigator_links.$kw1$TEXT, (SubLObject)cyc_navigator_links.$list88, (SubLObject)cyc_navigator_links.$str100$ke_eval, (SubLObject)cyc_navigator_links.ZERO_INTEGER, (SubLObject)cyc_navigator_links.$kw4$MAIN, (SubLObject)cyc_navigator_links.$str101$Evaluate_Forms, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED, (SubLObject)cyc_navigator_links.UNPROVIDED);
        return (SubLObject)cyc_navigator_links.NIL;
    }
    
    public void declareFunctions() {
        declare_cyc_navigator_links_file();
    }
    
    public void initializeVariables() {
        init_cyc_navigator_links_file();
    }
    
    public void runTopLevelForms() {
        setup_cyc_navigator_links_file();
    }
    
    static {
        me = (SubLFile)new cyc_navigator_links();
        $kw0$COMPOSE_KE_TEXT = SubLObjectFactory.makeKeyword("COMPOSE-KE-TEXT");
        $kw1$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"));
        $str3$ke_compose = SubLObjectFactory.makeString("ke-compose");
        $kw4$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str5$Compose_KE_Text = SubLObjectFactory.makeString("Compose KE Text");
        $kw6$LOAD_KE_FILE = SubLObjectFactory.makeKeyword("LOAD-KE-FILE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"), (SubLObject)SubLObjectFactory.makeKeyword("FILE-HANDLING"));
        $str8$ke_name_file = SubLObjectFactory.makeString("ke-name-file");
        $str9$Load_KE_File = SubLObjectFactory.makeString("Load KE File");
        $kw10$LOAD_API_FILE = SubLObjectFactory.makeKeyword("LOAD-API-FILE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE-HANDLING"));
        $str12$cb_load_api = SubLObjectFactory.makeString("cb-load-api");
        $str13$Load_API_Expressions = SubLObjectFactory.makeString("Load API Expressions");
        $kw14$HB_START = SubLObjectFactory.makeKeyword("HB-START");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-MAIN-MENU"), (SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"));
        $str16$hb_start = SubLObjectFactory.makeString("hb-start");
        $str17$Hierarchy_Browser = SubLObjectFactory.makeString("Hierarchy Browser");
        $kw18$CB_START = SubLObjectFactory.makeKeyword("CB-START");
        $str19$cb_start = SubLObjectFactory.makeString("cb-start");
        $kw20$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str21$KB_Browser = SubLObjectFactory.makeString("KB Browser");
        $kw22$CB_ASK = SubLObjectFactory.makeKeyword("CB-ASK");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"));
        $str24$cb_query = SubLObjectFactory.makeString("cb-query");
        $str25$Ask = SubLObjectFactory.makeString("Ask");
        $kw26$CB_ASSERT = SubLObjectFactory.makeKeyword("CB-ASSERT");
        $str27$cb_assert = SubLObjectFactory.makeString("cb-assert");
        $str28$Assert = SubLObjectFactory.makeString("Assert");
        $kw29$CB_CREATE = SubLObjectFactory.makeKeyword("CB-CREATE");
        $str30$cb_create = SubLObjectFactory.makeString("cb-create");
        $str31$Create = SubLObjectFactory.makeString("Create");
        $kw32$CB_HANDLE_INTERACTOR = SubLObjectFactory.makeKeyword("CB-HANDLE-INTERACTOR");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-SYSTEM"));
        $str34$cb_handle_interactor = SubLObjectFactory.makeString("cb-handle-interactor");
        $str35$SubL_Interactor = SubLObjectFactory.makeString("SubL Interactor");
        $kw36$CB_AUXILIARY_INDICES = SubLObjectFactory.makeKeyword("CB-AUXILIARY-INDICES");
        $str37$cb_auxiliary_indices = SubLObjectFactory.makeString("cb-auxiliary-indices");
        $str38$Auxiliary_Index_List = SubLObjectFactory.makeString("Auxiliary Index List");
        $kw39$SIMILARITY = SubLObjectFactory.makeKeyword("SIMILARITY");
        $str40$st_similarity_entrance = SubLObjectFactory.makeString("st-similarity-entrance");
        $str41$Similarity_Tool = SubLObjectFactory.makeString("Similarity Tool");
        $kw42$CB_SETUP = SubLObjectFactory.makeKeyword("CB-SETUP");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-MAIN-MENU"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-SYSTEM"));
        $str44$cb_setup = SubLObjectFactory.makeString("cb-setup");
        $str45$Browser_Setup = SubLObjectFactory.makeString("Browser Setup");
        $kw46$CB_LOGIN = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $str47$cb_login = SubLObjectFactory.makeString("cb-login");
        $str48$User_Login = SubLObjectFactory.makeString("User Login");
        $kw49$CYC_DOCUMENTATION = SubLObjectFactory.makeKeyword("CYC-DOCUMENTATION");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-MAIN-MENU"));
        $sym51$CYC_DOCUMENTATION_TOC = SubLObjectFactory.makeSymbol("CYC-DOCUMENTATION-TOC");
        $kw52$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str53$Cyc_Documentation = SubLObjectFactory.makeString("Cyc Documentation");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING-IS-RELATIVE-URL"));
        $kw55$CB_AGENDA = SubLObjectFactory.makeKeyword("CB-AGENDA");
        $str56$cb_agenda = SubLObjectFactory.makeString("cb-agenda");
        $str57$Agenda_Control = SubLObjectFactory.makeString("Agenda Control");
        $kw58$CB_MODE = SubLObjectFactory.makeKeyword("CB-MODE");
        $str59$cb_mode = SubLObjectFactory.makeString("cb-mode");
        $str60$Communication_Modes = SubLObjectFactory.makeString("Communication Modes");
        $kw61$CB_SYSTEM = SubLObjectFactory.makeKeyword("CB-SYSTEM");
        $str62$cb_system = SubLObjectFactory.makeString("cb-system");
        $str63$System_Information = SubLObjectFactory.makeString("System Information");
        $kw64$LOAD_TRANSCRIPT_FILE = SubLObjectFactory.makeKeyword("LOAD-TRANSCRIPT-FILE");
        $str65$html_load_transcript = SubLObjectFactory.makeString("html-load-transcript");
        $str66$Load_Transcript_File = SubLObjectFactory.makeString("Load Transcript File");
        $kw67$LOAD_PARTITION = SubLObjectFactory.makeKeyword("LOAD-PARTITION");
        $str68$cb_partition_load = SubLObjectFactory.makeString("cb-partition-load");
        $str69$Load_Partition = SubLObjectFactory.makeString("Load Partition");
        $kw70$SWITCH_TO_ENGLISH = SubLObjectFactory.makeKeyword("SWITCH-TO-ENGLISH");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NL-TOOLS"));
        $str72$maybe_use_english = SubLObjectFactory.makeString("maybe-use-english");
        $sym73$MAYBE_USE_ENGLISH_TEXT = SubLObjectFactory.makeSymbol("MAYBE-USE-ENGLISH-TEXT");
        $kw74$PPH_PHRASES = SubLObjectFactory.makeKeyword("PPH-PHRASES");
        $str75$cb_pph_phrases = SubLObjectFactory.makeString("cb-pph-phrases");
        $str76$Browse_Generated_Phrases = SubLObjectFactory.makeString("Browse Generated Phrases");
        $kw77$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = SubLObjectFactory.makeKeyword("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"));
        $str79$hb_handle_simple_choose_constants = SubLObjectFactory.makeString("hb-handle-simple-choose-constants|~a|~a");
        $kw80$HB_SELECT_NODE_TEXT = SubLObjectFactory.makeKeyword("HB-SELECT-NODE-TEXT");
        $str81$hb_select_node__a = SubLObjectFactory.makeString("hb-select-node|~a");
        $kw82$HB_SELECT_NODE_IMAGE = SubLObjectFactory.makeKeyword("HB-SELECT-NODE-IMAGE");
        $kw83$IMAGE = SubLObjectFactory.makeKeyword("IMAGE");
        $kw84$HB_COLORS_AND_SYMBOLS = SubLObjectFactory.makeKeyword("HB-COLORS-AND-SYMBOLS");
        $str85$hb_colors_and_symbols = SubLObjectFactory.makeString("hb-colors-and-symbols");
        $str86$Colors_and_Symbols = SubLObjectFactory.makeString("Colors and Symbols");
        $kw87$CYC_NAVIGATOR = SubLObjectFactory.makeKeyword("CYC-NAVIGATOR");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OTHER"));
        $str89$cb_start_cyc_navigator = SubLObjectFactory.makeString("cb-start|cyc-navigator");
        $str90$Cyc_Navigator = SubLObjectFactory.makeString("Cyc Navigator");
        $kw91$TINY_CYCORP_SYMBOL_TO_NAVIGATOR = SubLObjectFactory.makeKeyword("TINY-CYCORP-SYMBOL-TO-NAVIGATOR");
        $kw92$CYCORP_SYMBOL_TINY = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-TINY");
        $kw93$CONSTANTIFY = SubLObjectFactory.makeKeyword("CONSTANTIFY");
        $str94$ke_constantify = SubLObjectFactory.makeString("ke-constantify");
        $str95$Make_Constants = SubLObjectFactory.makeString("Make Constants");
        $kw96$CHECK_AND_POLL = SubLObjectFactory.makeKeyword("CHECK-AND-POLL");
        $str97$ke_check_and_poll = SubLObjectFactory.makeString("ke-check-and-poll");
        $str98$here = SubLObjectFactory.makeString("here");
        $kw99$KE_EVAL = SubLObjectFactory.makeKeyword("KE-EVAL");
        $str100$ke_eval = SubLObjectFactory.makeString("ke-eval");
        $str101$Evaluate_Forms = SubLObjectFactory.makeString("Evaluate Forms");
    }
}

/*

	Total time: 100 ms
	
*/