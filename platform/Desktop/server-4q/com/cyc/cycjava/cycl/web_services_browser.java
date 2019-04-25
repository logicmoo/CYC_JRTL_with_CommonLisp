package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class web_services_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.web_services_browser";
    public static final String myFingerPrint = "04c1b54a4de5cacae2a530e59be2ca85d30a02b7fdc4d3fbcbdd8f617c082d2a";
    private static final SubLString $str0$userName;
    private static final SubLString $str1$password;
    private static final SubLString $str2$Guest;
    private static final SubLSymbol $kw3$SUCCESS;
    private static final SubLString $str4$__xml_version__1_0__encoding__UTF;
    private static final SubLString $str5$login;
    private static final SubLSymbol $kw6$UNINITIALIZED;
    private static final SubLString $str7$sessionId;
    private static final SubLString $str8$Result;
    private static final SubLSymbol $sym9$XML_LOGIN;
    private static final SubLSymbol $kw10$XML_HANDLER;
    private static final SubLSymbol $kw11$FAILURE;
    private static final SubLString $str12$logout;
    private static final SubLSymbol $sym13$XML_LOGOUT;
    private static final SubLString $str14$cycServerDefaults;
    private static final SubLString $str15$defaultCyclist;
    private static final SubLSymbol $sym16$XML_SERVER_DEFAULTS;
    private static final SubLString $str17$fast;
    private static final SubLString $str18$cycServerStatus;
    private static final SubLString $str19$hostName;
    private static final SubLString $str20$unknown;
    private static final SubLString $str21$basePort;
    private static final SubLString $str22$_d;
    private static final SubLString $str23$agendaMode;
    private static final SubLString $str24$agendaModeString;
    private static final SubLString $str25$agendaState;
    private static final SubLString $str26$kbBaseNum;
    private static final SubLString $str27$kbNum;
    private static final SubLString $str28$_d__d;
    private static final SubLString $str29$cycRevisionString;
    private static final SubLString $str30$remoteQueue;
    private static final SubLString $str31$processedCount;
    private static final SubLString $str32$pendingCount;
    private static final SubLString $str33$totalCount;
    private static final SubLString $str34$localQueue;
    private static final SubLString $str35$pendingDiskWriteCount;
    private static final SubLString $str36$auxQueue;
    private static final SubLString $str37$transmitQueue;
    private static final SubLString $str38$transmitQueueSize;
    private static final SubLString $str39$userActions;
    private static final SubLString $str40$actionsPendingCount;
    private static final SubLString $str41$_a;
    private static final SubLString $str42$users;
    private static final SubLList $list43;
    private static final SubLString $str44$userInfo;
    private static final SubLString $str45$machineName;
    private static final SubLString $str46$you;
    private static final SubLString $str47$yes;
    private static final SubLSymbol $sym48$XML_SERVER_STATUS;
    private static final SubLString $str49$item;
    private static final SubLString $str50$id;
    private static final SubLString $str51$type;
    private static final SubLString $str52$html;
    private static final SubLString $str53$name;
    private static final SubLString $str54$subl;
    private static final SubLString $str55$separator;
    private static final SubLString $str56$toolList;
    private static final SubLString $str57$category;
    private static final SubLList $list58;
    private static final SubLString $str59$ke_compose;
    private static final SubLString $str60$Compose_KE_Text;
    private static final SubLString $str61$ke_name_file;
    private static final SubLString $str62$Load_KE_File;
    private static final SubLString $str63$cb_load_transcript;
    private static final SubLString $str64$Load_Transcript;
    private static final SubLString $str65$cb_transcript_viewer;
    private static final SubLString $str66$View_Transcript;
    private static final SubLString $str67$cb_owl_import;
    private static final SubLString $str68$OWL_Import;
    private static final SubLString $str69$cb_owl_export;
    private static final SubLString $str70$OWL_Export;
    private static final SubLString $str71$cb_partition_load;
    private static final SubLString $str72$Load_Partition;
    private static final SubLString $str73$cb_partition_save;
    private static final SubLString $str74$Save_Partition;
    private static final SubLList $list75;
    private static final SubLString $str76$cb_history;
    private static final SubLString $str77$History;
    private static final SubLString $str78$cb_recent_kb_additions;
    private static final SubLString $str79$Recently_Added_KB_Content;
    private static final SubLString $str80$cb_find_assertion;
    private static final SubLString $str81$Find_Assertion;
    private static final SubLString $str82$cb_index_overlap;
    private static final SubLString $str83$Index_Overlap;
    private static final SubLString $str84$hb_start;
    private static final SubLString $str85$Hierarchy_Browser;
    private static final SubLString $str86$st_similarity_entrance;
    private static final SubLString $str87$Similarity_Tool;
    private static final SubLString $str88$get_suggested_followups;
    private static final SubLString $str89$Followup_Term_Suggestor;
    private static final SubLString $str90$cb_gaf_suggestor;
    private static final SubLString $str91$GAF_Suggestor;
    private static final SubLList $list92;
    private static final SubLString $str93$cb_query;
    private static final SubLString $str94$Query_Tool;
    private static final SubLString $str95$cb_show_when;
    private static final SubLString $str96$When_Tool;
    private static final SubLString $str97$test_taking_tool;
    private static final SubLString $str98$Test_Taking_Tool;
    private static final SubLString $str99$cb_rtv;
    private static final SubLString $str100$relatedToVia_Tool;
    private static final SubLString $str101$cb_disjointness_preliminary_scree;
    private static final SubLString $str102$Disjointness_Tool;
    private static final SubLString $str103$cb_handle_query_search;
    private static final SubLString $str104$Query_Search;
    private static final SubLList $list105;
    private static final SubLString $str106$cb_latest_inference;
    private static final SubLString $str107$Latest_Inference;
    private static final SubLString $str108$cb_all_inferences;
    private static final SubLString $str109$All_Inferences;
    private static final SubLString $str110$cb_all_problem_stores;
    private static final SubLString $str111$All_Problem_Stores;
    private static final SubLString $str112$cb_forward_inference_browser;
    private static final SubLString $str113$Forward_Inference_Browser;
    private static final SubLString $str114$cb_forward_propagate_mt;
    private static final SubLString $str115$Forward_Propagate_Mt;
    private static final SubLString $str116$cb_wff;
    private static final SubLString $str117$WFF_Check;
    private static final SubLString $str118$cb_hypothesize_handler;
    private static final SubLString $str119$Hypothesize;
    private static final SubLString $str120$cb_hc;
    private static final SubLString $str121$Hypothesis_Corroboration_Tool;
    private static final SubLString $str122$cb_transformation_rule_statistics;
    private static final SubLString $str123$Experience_Control_Panel;
    private static final SubLString $str124$cb_forward_inference_metrics;
    private static final SubLString $str125$Forward_Inference_Metrics;
    private static final SubLString $str126$cb_hl_module_summary;
    private static final SubLString $str127$HL_Module_Summary;
    private static final SubLString $str128$cb_kct_control_panel;
    private static final SubLString $str129$KB_Content_Test_Control_Panel;
    private static final SubLString $str130$cb_kct_main;
    private static final SubLString $str131$KB_Content_Test_Monitor;
    private static final SubLList $list132;
    private static final SubLString $str133$maybe_use_english;
    private static final SubLString $str134$cb_invoke_oe_lexification_wizard;
    private static final SubLString $str135$Lexification_Assistant;
    private static final SubLString $str136$cb_invoke_sme_lexification_wizard;
    private static final SubLString $str137$Dictionary_Assistant;
    private static final SubLString $str138$cb_phrase_structure_parsing;
    private static final SubLString $str139$Phrase_Structure_Parse;
    private static final SubLString $str140$cb_view_webstore;
    private static final SubLString $str141$WebStore_Viewer;
    private static final SubLString $str142$clear_pg_caches;
    private static final SubLString $str143$Clear_Paraphrase_Caches;
    private static final SubLString $str144$cb_show_nl_trie;
    private static final SubLString $str145$NL_Trie_Browser;
    private static final SubLList $list146;
    private static final SubLString $str147$cb_create_term;
    private static final SubLString $str148$Create_Term;
    private static final SubLString $str149$cb_assert;
    private static final SubLString $str150$Assert_Sentence;
    private static final SubLString $str151$cb_restart_precision_suggestor;
    private static final SubLString $str152$Precision_Suggestor;
    private static final SubLList $list153;
    private static final SubLString $str154$cb_handle_interactor;
    private static final SubLString $str155$SubL_Interactor;
    private static final SubLString $str156$cb_jstack_trace;
    private static final SubLString $str157$JRTL_jstack_Trace;
    private static final SubLString $str158$sksi_sks_manager;
    private static final SubLString $str159$SKS_Manager;
    private static final SubLString $str160$sksi_smt;
    private static final SubLString $str161$Schema_Modeling_Tool;
    private static final SubLString $str162$cb_all_sksi_conjunctive_removals;
    private static final SubLString $str163$All_SKSI_Conjunctive_Removals;
    private static final SubLString $str164$cb_load_api;
    private static final SubLString $str165$Load_API_Expressions;
    private static final SubLString $str166$sg_cb_main;
    private static final SubLString $str167$Scenario_Generation_Tool;
    private static final SubLString $str168$cb_random_thoughts;
    private static final SubLString $str169$Random_Thought_Generator;
    private static final SubLString $str170$cb_classes_display_hierarchy_in_h;
    private static final SubLString $str171$Browse_SubLOOP;
    private static final SubLString $str172$cb_uia_forwarding_handler;
    private static final SubLString $str173$UIA_Forwarding;
    private static final SubLString $str174$cyc_nav_clear_el_formulas_cache;
    private static final SubLString $str175$Clear_EL_Formulas_Cache;
    private static final SubLString $str176$plan_finder;
    private static final SubLString $str177$Planner;
    private static final SubLString $str178$cb_td_tool;
    private static final SubLString $str179$SL2C_Browser;
    private static final SubLString $str180$cb_auxiliary_indices;
    private static final SubLString $str181$Auxiliary_Index_List;
    private static final SubLString $str182$cyc_navigator;
    private static final SubLString $str183$Navigator;
    private static final SubLString $str184$set_navigator_preferences;
    private static final SubLString $str185$Navigator_Preferences;
    private static final SubLString $str186$cb_tools;
    private static final SubLString $str187$Tools;
    private static final SubLList $list188;
    private static final SubLString $str189$cb_options;
    private static final SubLString $str190$Preferences;
    private static final SubLString $str191$cb_system;
    private static final SubLString $str192$System_Information;
    private static final SubLString $str193$_cycdoc_toc_html;
    private static final SubLString $str194$Documentation;
    private static final SubLString $str195$cb_login;
    private static final SubLString $str196$User_Login;
    private static final SubLString $str197$cb_set_password;
    private static final SubLString $str198$Set_Password;
    private static final SubLString $str199$cb_agenda;
    private static final SubLString $str200$Agenda_Control;
    private static final SubLString $str201$cb_mode;
    private static final SubLString $str202$Communication_Modes;
    private static final SubLSymbol $sym203$XML_TOOLS;
    private static final SubLList $list204;
    private static final SubLList $list205;
    private static final SubLString $str206$bookmarkedTools;
    private static final SubLSymbol $sym207$XML_BOOKMARKED_TOOLS;
    private static final SubLString $str208$history;
    private static final SubLString $str209$constants;
    private static final SubLString $str210$constant;
    private static final SubLString $str211$nats;
    private static final SubLString $str212$nat;
    private static final SubLString $str213$assertions;
    private static final SubLString $str214$assertion;
    private static final SubLString $str215$sentences;
    private static final SubLString $str216$sentence;
    private static final SubLSymbol $sym217$XML_HISTORY;
    private static final SubLString $str218$userPreferences;
    private static final SubLString $str219$user;
    private static final SubLString $str220$_S;
    private static final SubLSymbol $kw221$ERROR;
    private static final SubLString $str222$variable;
    private static final SubLString $str223$value;
    private static final SubLSymbol $sym224$XML_USER_PREFERENCES;
    private static final SubLString $str225$setUserPreference;
    private static final SubLString $str226$result;
    private static final SubLSymbol $sym227$XML_SET_USER_PREFERENCE_VARIABLE;
    private static final SubLString $str228$saveUserPreferences;
    private static final SubLSymbol $sym229$XML_SAVE_USER_PREFERENCES;
    private static final SubLString $str230$resultCount;
    private static final SubLSymbol $sym231$MULTIPLE_VALUE_LIST;
    private static final SubLString $str232$sublEvaluation;
    private static final SubLString $str233$time;
    private static final SubLString $str234$evaluatedForm;
    private static final SubLString $str235$n;
    private static final SubLSymbol $sym236$XML_SUBL_EVAL;
    private static final SubLString $str237$term;
    private static final SubLString $str238$Ack;
    private static final SubLSymbol $sym239$JSON_CONTEXT_MENU_DATA;
    private static final SubLSymbol $kw240$JSON_HANDLER;
    private static final SubLSymbol $kw241$markers;
    private static final SubLSymbol $kw242$bookmarked;
    private static final SubLObject $const243$True;
    private static final SubLObject $const244$False;
    private static final SubLSymbol $kw245$asserted;
    private static final SubLSymbol $kw246$modifiable;
    private static final SubLSymbol $kw247$rule;
    private static final SubLSymbol $sym248$_EXIT;
    private static final SubLObject $const249$thereExistVars;
    private static final SubLList $list250;
    private static final SubLObject $const251$and;
    private static final SubLList $list252;
    private static final SubLList $list253;
    private static final SubLObject $const254$projectParticipants;
    private static final SubLSymbol $sym255$_PROJECT;
    private static final SubLList $list256;
    private static final SubLList $list257;
    private static final SubLObject $const258$ist;
    private static final SubLSymbol $sym259$_MT;
    private static final SubLSymbol $sym260$_SENTENCE_TEMPLATE;
    private static final SubLSymbol $sym261$_STRING;
    private static final SubLSymbol $kw262$termName;
    private static final SubLSymbol $kw263$assertionCount;
    private static final SubLSymbol $kw264$notRenamable;
    private static final SubLSymbol $kw265$mergable;
    private static final SubLSymbol $kw266$EMPTY_OBJECT;
    private static final SubLList $list267;
    private static final SubLList $list268;
    private static final SubLObject $const269$isa;
    private static final SubLList $list270;
    private static final SubLObject $const271$TheFocalTerm;
    private static final SubLSymbol $kw272$name;
    private static final SubLList $list273;
    private static final SubLSymbol $kw274$items;
    private static final SubLObject $const275$InferencePSC;
    private static final SubLObject $const276$unknownSentence;
    private static final SubLSymbol $kw277$id;
    private static final SubLSymbol $kw278$sentence;
    private static final SubLSymbol $kw279$icon;
    private static final SubLSymbol $kw280$disabled;
    private static final SubLString $str281$known;
    private static final SubLString $str282$assert;
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 926L)
    public static SubLObject xml_login(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject user_name_string = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)web_services_browser.$str0$userName, args));
            final SubLObject dwimmed_cyclist = cb_system_tools.dwim_cyclist_name_to_cyclist(user_name_string);
            final SubLObject user_name = (web_services_browser.NIL != operation_communication.image_requires_authenticationP()) ? user_name_string : ((web_services_browser.NIL != dwimmed_cyclist) ? kb_paths.fort_name(dwimmed_cyclist) : user_name_string);
            final SubLObject password = html_utilities.html_extract_input((SubLObject)web_services_browser.$str1$password, args);
            SubLObject login_result = cb_system_tools.cyc_login(user_name, password);
            SubLObject session_id = (SubLObject)web_services_browser.NIL;
            SubLObject html_state = (SubLObject)web_services_browser.NIL;
            if (user_name.equal((SubLObject)web_services_browser.$str2$Guest)) {
                operation_communication.set_the_cyclist((SubLObject)web_services_browser.$str2$Guest);
                login_result = (SubLObject)web_services_browser.$kw3$SUCCESS;
            }
            if (login_result == web_services_browser.$kw3$SUCCESS) {
                session_id = web_utilities.make_html_cyc_login_session();
                html_state = html_kernel.html_machine_state(session_id);
            }
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str5$login, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        if (web_services_browser.NIL != user_name) {
                            try {
                                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str0$userName, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                        xml_utilities.xml_markup(user_name);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str0$userName);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        if (web_services_browser.NIL != session_id) {
                            try {
                                final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str7$sessionId, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                        xml_utilities.xml_markup(session_id);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str7$sessionId);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str8$Result, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(login_result));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str8$Result);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str5$login);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 2225L)
    public static SubLObject xml_logout(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject http_state_key = html_kernel.http_state_key_for_request();
            final SubLObject logout_result = (SubLObject)((web_services_browser.NIL != html_kernel.clear_html_state_for_machine(http_state_key)) ? web_services_browser.$kw3$SUCCESS : web_services_browser.$kw11$FAILURE);
            web_utilities.destroy_cyc_login_session(http_state_key);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str12$logout, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str8$Result, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(logout_result));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str8$Result);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str12$logout);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 2723L)
    public static SubLObject xml_server_defaults(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str14$cycServerDefaults, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str15$defaultCyclist, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    if (web_services_browser.NIL != constant_handles.constant_p(operation_communication.the_cyclist())) {
                                        xml_utilities.xml_markup(constants_high.constant_name(operation_communication.the_cyclist()));
                                    }
                                    else {
                                        xml_utilities.xml_markup(operation_communication.the_cyclist());
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str15$defaultCyclist);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str14$cycServerDefaults);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 3148L)
    public static SubLObject xml_server_status(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject fastP = html_utilities.html_extract_input((SubLObject)web_services_browser.$str17$fast, args);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str18$cycServerStatus, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$32 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str19$hostName, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(Environment.get_machine_name((SubLObject)web_services_browser.$str20$unknown));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str19$hostName);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str21$basePort, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, system_parameters.$base_tcp_port$.getDynamicValue(thread));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str21$basePort);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str23$agendaMode, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(operation_communication.communication_mode()));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str23$agendaMode);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str24$agendaModeString, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(operation_communication.communication_mode_name(operation_communication.communication_mode()));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str24$agendaModeString);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str25$agendaState, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(agenda.agenda_state());
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str25$agendaState);
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str26$kbBaseNum, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, control_vars.kb_loaded());
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str26$kbBaseNum);
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$39 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str27$kbNum, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str28$_d__d, control_vars.kb_loaded(), operation_communication.kb_op_number());
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$39, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values7 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str27$kbNum);
                                Values.restoreValuesFromVector(_values7);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str29$cycRevisionString, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(system_info.cyc_revision_string());
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$40, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str29$cycRevisionString);
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str30$remoteQueue, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str31$processedCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_communication.kb_op_number());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$58, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values9 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str31$processedCount);
                                            Values.restoreValuesFromVector(_values9);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$61 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str32$pendingCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$62 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_queues.remote_queue_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$43, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$61, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values10 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str32$pendingCount);
                                            Values.restoreValuesFromVector(_values10);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                        }
                                    }
                                    if (web_services_browser.NIL == fastP) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str33$totalCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, transcript_utilities.total_master_transcript_operations((SubLObject)web_services_browser.UNPROVIDED));
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$44, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$64, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                final SubLObject _values11 = Values.getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str33$totalCount);
                                                Values.restoreValuesFromVector(_values11);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$56, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values12 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str30$remoteQueue);
                                Values.restoreValuesFromVector(_values12);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$68 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str34$localQueue, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$69 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$70 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str31$processedCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$71 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_queues.local_operation_storage_queue_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$71, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$46, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$70, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values13 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str31$processedCount);
                                            Values.restoreValuesFromVector(_values13);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$47 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str32$pendingCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_queues.local_queue_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$74, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$47, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$73, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values14 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str32$pendingCount);
                                            Values.restoreValuesFromVector(_values14);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str35$pendingDiskWriteCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_queues.transcript_queue_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$77, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$48, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$76, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values15 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str35$pendingDiskWriteCount);
                                            Values.restoreValuesFromVector(_values15);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$79 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str33$totalCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$80 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, Numbers.add(operation_queues.local_operation_storage_queue_size(), operation_queues.local_queue_size()));
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$80, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$49, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$79, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values16 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str33$totalCount);
                                            Values.restoreValuesFromVector(_values16);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$69, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$45, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$68, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values17 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str34$localQueue);
                                Values.restoreValuesFromVector(_values17);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$83 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str36$auxQueue, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$85 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str31$processedCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_communication.total_auxiliary_operations_run());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$86, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$51, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$85, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values18 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str31$processedCount);
                                            Values.restoreValuesFromVector(_values18);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$88 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$52 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str32$pendingCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$89 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_queues.auxiliary_queue_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$89, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$52, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$88, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values19 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str32$pendingCount);
                                            Values.restoreValuesFromVector(_values19);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str33$totalCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, Numbers.add(operation_communication.total_auxiliary_operations_run(), operation_queues.auxiliary_queue_size()));
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$53, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values20 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str33$totalCount);
                                            Values.restoreValuesFromVector(_values20);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$84, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$50, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$83, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values21 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str36$auxQueue);
                                Values.restoreValuesFromVector(_values21);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str37$transmitQueue, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$97 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str38$transmitQueueSize, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$98 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str22$_d, operation_queues.transmit_queue_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$98, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$55, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$97, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values22 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str38$transmitQueueSize);
                                            Values.restoreValuesFromVector(_values22);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$54, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values23 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str37$transmitQueue);
                                Values.restoreValuesFromVector(_values23);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$56 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str39$userActions, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$57 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str40$actionsPendingCount, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, user_actions.user_actions_size());
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$57, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$103, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values24 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str40$actionsPendingCount);
                                            Values.restoreValuesFromVector(_values24);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$56, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values25 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str39$userActions);
                                Values.restoreValuesFromVector(_values25);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$107 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$58 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str42$users, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = html_kernel.html_interface_users();
                                    SubLObject a_user = (SubLObject)web_services_browser.NIL;
                                    a_user = cdolist_list_var.first();
                                    while (web_services_browser.NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = a_user;
                                        SubLObject machine_name = (SubLObject)web_services_browser.NIL;
                                        SubLObject user_name = (SubLObject)web_services_browser.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_services_browser.$list43);
                                        machine_name = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_services_browser.$list43);
                                        user_name = current.first();
                                        current = current.rest();
                                        if (web_services_browser.NIL == current) {
                                            final SubLObject session_id = (SubLObject)((web_services_browser.NIL != web_utilities.current_html_cyc_login_session_idP(machine_name)) ? machine_name : web_services_browser.NIL);
                                            SubLObject youP = (SubLObject)web_services_browser.NIL;
                                            if (web_services_browser.NIL != session_id) {
                                                machine_name = web_utilities.cyc_login_session_id_machine_name(session_id);
                                            }
                                            youP = Equality.equal(machine_name, html_kernel.http_state_key_for_request());
                                            xml_utilities.xml_terpri();
                                            try {
                                                final SubLObject _prev_bind_0_$109 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str44$userInfo, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                        xml_utilities.xml_terpri();
                                                        try {
                                                            final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str0$userName, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, user_name);
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$60, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                                final SubLObject _values26 = Values.getValuesAsVector();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str0$userName);
                                                                Values.restoreValuesFromVector(_values26);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                                            }
                                                        }
                                                        xml_utilities.xml_terpri();
                                                        try {
                                                            final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str45$machineName, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, machine_name);
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$61, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                                final SubLObject _values27 = Values.getValuesAsVector();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str45$machineName);
                                                                Values.restoreValuesFromVector(_values27);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                                            }
                                                        }
                                                        if (web_services_browser.NIL != session_id) {
                                                            xml_utilities.xml_terpri();
                                                            try {
                                                                final SubLObject _prev_bind_0_$117 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str7$sessionId, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$118 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, session_id);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$118, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$62, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$117, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                                    final SubLObject _values28 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str7$sessionId);
                                                                    Values.restoreValuesFromVector(_values28);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                                                                }
                                                            }
                                                        }
                                                        if (web_services_browser.NIL != youP) {
                                                            xml_utilities.xml_terpri();
                                                            try {
                                                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str46$you, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                                        xml_utilities.xml_print((SubLObject)web_services_browser.$str47$yes, (SubLObject)web_services_browser.UNPROVIDED);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$63, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$120, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                                    final SubLObject _values29 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str46$you);
                                                                    Values.restoreValuesFromVector(_values29);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$110, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$59, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$109, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$123 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                    final SubLObject _values30 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str44$userInfo);
                                                    Values.restoreValuesFromVector(_values30);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_services_browser.$list43);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        a_user = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$108, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$58, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values31 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str42$users);
                                Values.restoreValuesFromVector(_values31);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$125 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values32 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str18$cycServerStatus);
                    Values.restoreValuesFromVector(_values32);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 6812L)
    public static SubLObject valid_cb_command_string_p(final SubLObject url) {
        return Types.function_spec_p(Packages.intern(Strings.string_upcase(string_utilities.substring(url, (SubLObject)web_services_browser.ZERO_INTEGER, Sequences.position((SubLObject)Characters.CHAR_ampersand, url, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED)), (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED), (SubLObject)web_services_browser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 7151L)
    public static SubLObject xml_html_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str49$item, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str50$id, url, (SubLObject)web_services_browser.$str51$type, (SubLObject)web_services_browser.$str52$html, (SubLObject)web_services_browser.$str53$name, name), (SubLObject)web_services_browser.T, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
            final SubLObject _prev_bind_0_$157 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$157, thread);
            }
        }
        finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 7286L)
    public static SubLObject xml_tool_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_services_browser.NIL != valid_cb_command_string_p(url)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str49$item, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str50$id, url, (SubLObject)web_services_browser.$str51$type, (SubLObject)web_services_browser.$str54$subl, (SubLObject)web_services_browser.$str53$name, name), (SubLObject)web_services_browser.T, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                final SubLObject _prev_bind_0_$158 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$158, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 7467L)
    public static SubLObject xml_nav_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_services_browser.NIL != valid_cb_command_string_p(url)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str49$item, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str50$id, url, (SubLObject)web_services_browser.$str51$type, (SubLObject)web_services_browser.$str54$subl, (SubLObject)web_services_browser.$str53$name, name), (SubLObject)web_services_browser.T, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                final SubLObject _prev_bind_0_$159 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$159, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 7647L)
    public static SubLObject xml_bookmarked_tool_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_services_browser.NIL != valid_cb_command_string_p(url)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str49$item, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str50$id, url, (SubLObject)web_services_browser.$str51$type, (SubLObject)web_services_browser.$str54$subl, (SubLObject)web_services_browser.$str53$name, name), (SubLObject)web_services_browser.T, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                final SubLObject _prev_bind_0_$160 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$160, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 7839L)
    public static SubLObject xml_bookmarked_html_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str49$item, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str50$id, url, (SubLObject)web_services_browser.$str51$type, (SubLObject)web_services_browser.$str52$html, (SubLObject)web_services_browser.$str53$name, name), (SubLObject)web_services_browser.T, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
            final SubLObject _prev_bind_0_$161 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$161, thread);
            }
        }
        finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 7985L)
    public static SubLObject xml_item_separator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str49$item, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str51$type, (SubLObject)web_services_browser.$str55$separator), (SubLObject)web_services_browser.T, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
            final SubLObject _prev_bind_0_$162 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$162, thread);
            }
        }
        finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 8103L)
    public static SubLObject xml_tools(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$163 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str56$toolList, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$164 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$165 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$166 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list58, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$166 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_tool_item((SubLObject)web_services_browser.$str59$ke_compose, (SubLObject)web_services_browser.$str60$Compose_KE_Text);
                                    xml_tool_item((SubLObject)web_services_browser.$str61$ke_name_file, (SubLObject)web_services_browser.$str62$Load_KE_File);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str63$cb_load_transcript, (SubLObject)web_services_browser.$str64$Load_Transcript);
                                    xml_tool_item((SubLObject)web_services_browser.$str65$cb_transcript_viewer, (SubLObject)web_services_browser.$str66$View_Transcript);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str67$cb_owl_import, (SubLObject)web_services_browser.$str68$OWL_Import);
                                    xml_tool_item((SubLObject)web_services_browser.$str69$cb_owl_export, (SubLObject)web_services_browser.$str70$OWL_Export);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str71$cb_partition_load, (SubLObject)web_services_browser.$str72$Load_Partition);
                                    xml_tool_item((SubLObject)web_services_browser.$str73$cb_partition_save, (SubLObject)web_services_browser.$str74$Save_Partition);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$166, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$166, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$165, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$167 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$168 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$167 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list75, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$169 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_tool_item((SubLObject)web_services_browser.$str76$cb_history, (SubLObject)web_services_browser.$str77$History);
                                    xml_nav_item((SubLObject)web_services_browser.$str78$cb_recent_kb_additions, (SubLObject)web_services_browser.$str79$Recently_Added_KB_Content);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str80$cb_find_assertion, (SubLObject)web_services_browser.$str81$Find_Assertion);
                                    xml_tool_item((SubLObject)web_services_browser.$str82$cb_index_overlap, (SubLObject)web_services_browser.$str83$Index_Overlap);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str84$hb_start, (SubLObject)web_services_browser.$str85$Hierarchy_Browser);
                                    xml_nav_item((SubLObject)web_services_browser.$str86$st_similarity_entrance, (SubLObject)web_services_browser.$str87$Similarity_Tool);
                                    xml_tool_item((SubLObject)web_services_browser.$str88$get_suggested_followups, (SubLObject)web_services_browser.$str89$Followup_Term_Suggestor);
                                    xml_tool_item((SubLObject)web_services_browser.$str90$cb_gaf_suggestor, (SubLObject)web_services_browser.$str91$GAF_Suggestor);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$169, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$167, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$168, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$170 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$171 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$168 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list92, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$172 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_tool_item((SubLObject)web_services_browser.$str93$cb_query, (SubLObject)web_services_browser.$str94$Query_Tool);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str95$cb_show_when, (SubLObject)web_services_browser.$str96$When_Tool);
                                    xml_tool_item((SubLObject)web_services_browser.$str97$test_taking_tool, (SubLObject)web_services_browser.$str98$Test_Taking_Tool);
                                    xml_tool_item((SubLObject)web_services_browser.$str99$cb_rtv, (SubLObject)web_services_browser.$str100$relatedToVia_Tool);
                                    xml_item_separator();
                                    xml_nav_item((SubLObject)web_services_browser.$str101$cb_disjointness_preliminary_scree, (SubLObject)web_services_browser.$str102$Disjointness_Tool);
                                    xml_tool_item((SubLObject)web_services_browser.$str103$cb_handle_query_search, (SubLObject)web_services_browser.$str104$Query_Search);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$172, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$168, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$171, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$173 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$174 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$169 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list105, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$175 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_nav_item((SubLObject)web_services_browser.$str106$cb_latest_inference, (SubLObject)web_services_browser.$str107$Latest_Inference);
                                    xml_nav_item((SubLObject)web_services_browser.$str108$cb_all_inferences, (SubLObject)web_services_browser.$str109$All_Inferences);
                                    xml_nav_item((SubLObject)web_services_browser.$str110$cb_all_problem_stores, (SubLObject)web_services_browser.$str111$All_Problem_Stores);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str112$cb_forward_inference_browser, (SubLObject)web_services_browser.$str113$Forward_Inference_Browser);
                                    xml_tool_item((SubLObject)web_services_browser.$str114$cb_forward_propagate_mt, (SubLObject)web_services_browser.$str115$Forward_Propagate_Mt);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str116$cb_wff, (SubLObject)web_services_browser.$str117$WFF_Check);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str118$cb_hypothesize_handler, (SubLObject)web_services_browser.$str119$Hypothesize);
                                    xml_tool_item((SubLObject)web_services_browser.$str120$cb_hc, (SubLObject)web_services_browser.$str121$Hypothesis_Corroboration_Tool);
                                    xml_item_separator();
                                    xml_nav_item((SubLObject)web_services_browser.$str122$cb_transformation_rule_statistics, (SubLObject)web_services_browser.$str123$Experience_Control_Panel);
                                    xml_nav_item((SubLObject)web_services_browser.$str124$cb_forward_inference_metrics, (SubLObject)web_services_browser.$str125$Forward_Inference_Metrics);
                                    xml_nav_item((SubLObject)web_services_browser.$str126$cb_hl_module_summary, (SubLObject)web_services_browser.$str127$HL_Module_Summary);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str128$cb_kct_control_panel, (SubLObject)web_services_browser.$str129$KB_Content_Test_Control_Panel);
                                    xml_tool_item((SubLObject)web_services_browser.$str130$cb_kct_main, (SubLObject)web_services_browser.$str131$KB_Content_Test_Monitor);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$175, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$169, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$174, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$176 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$176, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$177 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$170 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list132, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$178 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_nav_item((SubLObject)web_services_browser.$str133$maybe_use_english, cyc_navigator_internals.maybe_use_english_text());
                                    xml_tool_item((SubLObject)web_services_browser.$str134$cb_invoke_oe_lexification_wizard, (SubLObject)web_services_browser.$str135$Lexification_Assistant);
                                    xml_tool_item((SubLObject)web_services_browser.$str136$cb_invoke_sme_lexification_wizard, (SubLObject)web_services_browser.$str137$Dictionary_Assistant);
                                    xml_tool_item((SubLObject)web_services_browser.$str138$cb_phrase_structure_parsing, (SubLObject)web_services_browser.$str139$Phrase_Structure_Parse);
                                    xml_tool_item((SubLObject)web_services_browser.$str140$cb_view_webstore, (SubLObject)web_services_browser.$str141$WebStore_Viewer);
                                    xml_nav_item((SubLObject)web_services_browser.$str142$clear_pg_caches, (SubLObject)web_services_browser.$str143$Clear_Paraphrase_Caches);
                                    xml_tool_item((SubLObject)web_services_browser.$str144$cb_show_nl_trie, (SubLObject)web_services_browser.$str145$NL_Trie_Browser);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$178, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$170, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$177, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$180 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$171 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list146, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$181 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_tool_item((SubLObject)web_services_browser.$str147$cb_create_term, (SubLObject)web_services_browser.$str148$Create_Term);
                                    xml_tool_item((SubLObject)web_services_browser.$str149$cb_assert, (SubLObject)web_services_browser.$str150$Assert_Sentence);
                                    xml_tool_item((SubLObject)web_services_browser.$str151$cb_restart_precision_suggestor, (SubLObject)web_services_browser.$str152$Precision_Suggestor);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$181, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$171, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$180, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$182 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$183 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$172 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list153, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$184 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_nav_item((SubLObject)web_services_browser.$str154$cb_handle_interactor, (SubLObject)web_services_browser.$str155$SubL_Interactor);
                                    xml_nav_item((SubLObject)web_services_browser.$str156$cb_jstack_trace, (SubLObject)web_services_browser.$str157$JRTL_jstack_Trace);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str158$sksi_sks_manager, (SubLObject)web_services_browser.$str159$SKS_Manager);
                                    xml_tool_item((SubLObject)web_services_browser.$str160$sksi_smt, (SubLObject)web_services_browser.$str161$Schema_Modeling_Tool);
                                    xml_nav_item((SubLObject)web_services_browser.$str162$cb_all_sksi_conjunctive_removals, (SubLObject)web_services_browser.$str163$All_SKSI_Conjunctive_Removals);
                                    xml_item_separator();
                                    xml_nav_item((SubLObject)web_services_browser.$str164$cb_load_api, (SubLObject)web_services_browser.$str165$Load_API_Expressions);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str166$sg_cb_main, (SubLObject)web_services_browser.$str167$Scenario_Generation_Tool);
                                    xml_tool_item((SubLObject)web_services_browser.$str168$cb_random_thoughts, (SubLObject)web_services_browser.$str169$Random_Thought_Generator);
                                    xml_item_separator();
                                    xml_tool_item((SubLObject)web_services_browser.$str170$cb_classes_display_hierarchy_in_h, (SubLObject)web_services_browser.$str171$Browse_SubLOOP);
                                    xml_tool_item((SubLObject)web_services_browser.$str172$cb_uia_forwarding_handler, (SubLObject)web_services_browser.$str173$UIA_Forwarding);
                                    xml_nav_item((SubLObject)web_services_browser.$str174$cyc_nav_clear_el_formulas_cache, (SubLObject)web_services_browser.$str175$Clear_EL_Formulas_Cache);
                                    xml_tool_item((SubLObject)web_services_browser.$str176$plan_finder, (SubLObject)web_services_browser.$str177$Planner);
                                    xml_tool_item((SubLObject)web_services_browser.$str178$cb_td_tool, (SubLObject)web_services_browser.$str179$SL2C_Browser);
                                    xml_nav_item((SubLObject)web_services_browser.$str180$cb_auxiliary_indices, (SubLObject)web_services_browser.$str181$Auxiliary_Index_List);
                                    xml_nav_item((SubLObject)web_services_browser.$str182$cyc_navigator, (SubLObject)web_services_browser.$str183$Navigator);
                                    xml_nav_item((SubLObject)web_services_browser.$str184$set_navigator_preferences, (SubLObject)web_services_browser.$str185$Navigator_Preferences);
                                    xml_nav_item((SubLObject)web_services_browser.$str186$cb_tools, (SubLObject)web_services_browser.$str187$Tools);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$184, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$172, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$183, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$185 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values7 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values7);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$185, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$186 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$173 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str57$category, (SubLObject)web_services_browser.$list188, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$187 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_tool_item((SubLObject)web_services_browser.$str189$cb_options, (SubLObject)web_services_browser.$str190$Preferences);
                                    xml_nav_item((SubLObject)web_services_browser.$str191$cb_system, (SubLObject)web_services_browser.$str192$System_Information);
                                    xml_item_separator();
                                    xml_html_item((SubLObject)web_services_browser.$str193$_cycdoc_toc_html, (SubLObject)web_services_browser.$str194$Documentation);
                                    xml_item_separator();
                                    xml_nav_item((SubLObject)web_services_browser.$str195$cb_login, (SubLObject)web_services_browser.$str196$User_Login);
                                    xml_tool_item((SubLObject)web_services_browser.$str197$cb_set_password, (SubLObject)web_services_browser.$str198$Set_Password);
                                    xml_item_separator();
                                    xml_nav_item((SubLObject)web_services_browser.$str199$cb_agenda, (SubLObject)web_services_browser.$str200$Agenda_Control);
                                    xml_nav_item((SubLObject)web_services_browser.$str201$cb_mode, (SubLObject)web_services_browser.$str202$Communication_Modes);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$187, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$173, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$186, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$188 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str57$category);
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$164, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$163, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$189 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values9 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str56$toolList);
                    Values.restoreValuesFromVector(_values9);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$189, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 14463L)
    public static SubLObject xml_bookmarked_tool_url_hack(final SubLObject tool_link_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = (SubLObject)web_services_browser.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind((SubLObject)web_services_browser.NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                Functions.funcall(tool_link_method);
                output_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$198 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                }
            }
        }
        finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        output_string = conses_high.second(string_utilities.string_tokenize(output_string, (SubLObject)web_services_browser.$list204, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED));
        if (web_services_browser.NIL != Sequences.position((SubLObject)Characters.CHAR_question, output_string, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED)) {
            output_string = conses_high.second(string_utilities.string_tokenize(output_string, (SubLObject)web_services_browser.$list205, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED));
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 14861L)
    public static SubLObject xml_bookmarked_tools(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$199 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str206$bookmarkedTools, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$200 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = cb_frames.user_toolbar_links();
                        SubLObject tool = (SubLObject)web_services_browser.NIL;
                        tool = cdolist_list_var.first();
                        while (web_services_browser.NIL != cdolist_list_var) {
                            if (cb_utilities.cb_link_method(tool).isFunctionSpec()) {
                                final SubLObject tool_url_hack = xml_bookmarked_tool_url_hack(cb_utilities.cb_link_method(tool));
                                xml_utilities.xml_terpri();
                                if (Characters.CHAR_slash.eql(Strings.sublisp_char(tool_url_hack, (SubLObject)web_services_browser.ZERO_INTEGER))) {
                                    xml_bookmarked_html_item(tool_url_hack, cb_utilities.cb_tool_abbreviation(tool));
                                }
                                else {
                                    xml_bookmarked_tool_item(tool_url_hack, cb_utilities.cb_tool_abbreviation(tool));
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            tool = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$200, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$199, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$201 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str206$bookmarkedTools);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 15484L)
    public static SubLObject xml_history(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$202 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str208$history, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$203 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$204 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$205 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str209$constants, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$205 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_constant_history_items();
                                    SubLObject constant = (SubLObject)web_services_browser.NIL;
                                    constant = cdolist_list_var.first();
                                    while (web_services_browser.NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$206 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$206 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str210$constant, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$207 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, constants_high.constant_name(constant));
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$207, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$206, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$206, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$208 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str210$constant);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        constant = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$205, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$205, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$204, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$209 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str209$constants);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$210 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$207 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str211$nats, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$211 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_nat_history_items();
                                    SubLObject nat = (SubLObject)web_services_browser.NIL;
                                    nat = cdolist_list_var.first();
                                    while (web_services_browser.NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$212 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$208 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str212$nat, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$213 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, (web_services_browser.NIL != nart_handles.nart_p(nat)) ? narts_high.nart_el_formula(nat) : nat);
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$213, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$208, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$212, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$214 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                final SubLObject _values3 = Values.getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str212$nat);
                                                Values.restoreValuesFromVector(_values3);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$214, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        nat = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$211, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$207, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$210, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$215 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str211$nats);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$215, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$216 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$209 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str213$assertions, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$217 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_assertion_history_items();
                                    SubLObject assertion = (SubLObject)web_services_browser.NIL;
                                    assertion = cdolist_list_var.first();
                                    while (web_services_browser.NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$218 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$210 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str214$assertion, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$219 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, uncanonicalizer.assertion_el_ist_formula(assertion));
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$219, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$210, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$218, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$220 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str214$assertion);
                                                Values.restoreValuesFromVector(_values5);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$220, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$217, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$209, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$216, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$221 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str213$assertions);
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$221, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$222 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$211 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str215$sentences, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$223 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_sentence_history_items();
                                    SubLObject sentence = (SubLObject)web_services_browser.NIL;
                                    sentence = cdolist_list_var.first();
                                    while (web_services_browser.NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$224 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$212 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str216$sentence, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$225 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, cycl_utilities.hl_to_el(sentence));
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$225, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$212, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$224, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$226 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                final SubLObject _values7 = Values.getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str216$sentence);
                                                Values.restoreValuesFromVector(_values7);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$226, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        sentence = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$223, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$211, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$222, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$227 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str215$sentences);
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$227, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$203, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$202, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$228 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values9 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str208$history);
                    Values.restoreValuesFromVector(_values9);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 16502L)
    public static SubLObject xml_user_preferences(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$237 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str218$userPreferences, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str219$user, kb_paths.fort_name(operation_communication.the_cyclist())), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$238 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = utilities_macros.$html_interface_variables$.getGlobalValue();
                        SubLObject var = (SubLObject)web_services_browser.NIL;
                        var = cdolist_list_var.first();
                        while (web_services_browser.NIL != cdolist_list_var) {
                            xml_utilities.xml_terpri();
                            if (var.isSymbol()) {
                                final SubLObject value = Eval.eval(var);
                                final SubLObject printed_value = PrintLow.format((SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$str220$_S, value);
                                thread.resetMultipleValues();
                                final SubLObject re_read_value = reader.read_from_string_ignoring_errors(printed_value, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED);
                                final SubLObject error = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (!error.eql((SubLObject)web_services_browser.$kw221$ERROR) && re_read_value.equal(value)) {
                                    try {
                                        final SubLObject _prev_bind_0_$239 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$240 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str222$variable, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$240 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                xml_utilities.xml_terpri();
                                                try {
                                                    final SubLObject _prev_bind_0_$241 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$241 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str53$name, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$242 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, var);
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$242, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$241, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$241, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$243 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str53$name);
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$243, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                try {
                                                    final SubLObject _prev_bind_0_$244 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$242 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str223$value, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$245 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                            xml_utilities.xml_cdata(printed_value);
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$245, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$242, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$244, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$246 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                                        final SubLObject _values2 = Values.getValuesAsVector();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str223$value);
                                                        Values.restoreValuesFromVector(_values2);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$246, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$240, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$240, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$239, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$247 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str222$variable);
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$247, thread);
                                        }
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            var = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$238, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$237, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$248 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str218$userPreferences);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$248, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 17425L)
    public static SubLObject xml_set_user_preference_variable(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject name_string = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)web_services_browser.$str53$name, args));
            final SubLObject name_symbol = reader.read_from_string_ignoring_errors(name_string, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED);
            final SubLObject values_string = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)web_services_browser.$str223$value, args));
            final SubLObject value = (web_services_browser.NIL != xml_parsing_utilities.xml_cdata_tagP(values_string)) ? reader.read_from_string_ignoring_errors(xml_parsing_utilities.xml_cdata_tag_text(values_string), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED) : values_string;
            final SubLObject setP = (SubLObject)SubLObjectFactory.makeBoolean(web_services_browser.NIL != Symbols.boundp(name_symbol) && web_services_browser.NIL != conses_high.member(name_symbol, utilities_macros.$html_interface_variables$.getGlobalValue(), (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED));
            if (web_services_browser.NIL != setP) {
                Symbols.set(name_symbol, value);
            }
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$252 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str225$setUserPreference, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str219$user, kb_paths.fort_name(operation_communication.the_cyclist())), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$253 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$254 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$255 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str226$result, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$255 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword((SubLObject)((web_services_browser.NIL != setP) ? web_services_browser.$kw3$SUCCESS : web_services_browser.$kw11$FAILURE)));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$255, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$255, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$254, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$256 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str226$result);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$256, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$257 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$256 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str222$variable, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$258 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$259 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$257 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str53$name, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$260 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)web_services_browser.$str41$_a, name_symbol);
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$260, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$257, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$259, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$261 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str53$name);
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$261, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$262 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$258 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str223$value, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$263 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                xml_utilities.xml_cdata(PrintLow.format((SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$str220$_S, value));
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$263, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$258, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$262, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$264 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str223$value);
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$264, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$258, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$256, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$257, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$265 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str222$variable);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$265, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$253, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$252, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$266 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values5 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str225$setUserPreference);
                    Values.restoreValuesFromVector(_values5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$266, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 18507L)
    public static SubLObject xml_save_user_preferences(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
        xml_utilities.xml_terpri();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str228$saveUserPreferences, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str219$user, kb_paths.fort_name(operation_communication.the_cyclist())), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                final SubLObject _prev_bind_0_$271 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    try {
                        final SubLObject _prev_bind_0_$272 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$273 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str226$result, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$273 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                xml_utilities.xml_markup(string_utilities.string_from_keyword((SubLObject)((web_services_browser.NIL != cb_tools.cb_save_interface_state()) ? web_services_browser.$kw3$SUCCESS : web_services_browser.$kw11$FAILURE)));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$273, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$273, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$272, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$274 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str226$result);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$274, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$271, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str228$saveUserPreferences);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 18894L)
    public static SubLObject xml_subl_eval(SubLObject args) {
        if (args == web_services_browser.UNPROVIDED) {
            args = (SubLObject)web_services_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject result_count_string = html_utilities.html_extract_input((SubLObject)web_services_browser.$str230$resultCount, args);
            final SubLObject result_count = (SubLObject)((result_count_string.isString() && web_services_browser.NIL != subl_promotions.positive_integer_p(reader.read_from_string_ignoring_errors(string_utilities.trim_whitespace(result_count_string), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED))) ? reader.read_from_string_ignoring_errors(string_utilities.trim_whitespace(result_count_string), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED) : web_services_browser.NIL);
            final SubLObject subl_string = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)web_services_browser.$str54$subl, args));
            final SubLObject subl = reader.read_from_string_ignoring_errors(subl_string, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED);
            final SubLObject start_time = Time.get_internal_real_time();
            SubLObject actual_time = (SubLObject)web_services_browser.NIL;
            SubLObject result = (SubLObject)web_services_browser.NIL;
            SubLObject result2 = (SubLObject)web_services_browser.NIL;
            SubLObject result3 = (SubLObject)web_services_browser.NIL;
            SubLObject result4 = (SubLObject)web_services_browser.NIL;
            SubLObject result5 = (SubLObject)web_services_browser.NIL;
            final SubLObject datum_evaluated_var = eval_in_api.cyc_api_eval((SubLObject)ConsesLow.list((SubLObject)web_services_browser.$sym231$MULTIPLE_VALUE_LIST, subl));
            result = datum_evaluated_var.first();
            result2 = conses_high.cadr(datum_evaluated_var);
            result3 = conses_high.cddr(datum_evaluated_var).first();
            result4 = conses_high.cadr(conses_high.cddr(datum_evaluated_var));
            result5 = conses_high.cddr(conses_high.cddr(datum_evaluated_var)).first();
            actual_time = Numbers.floor(Numbers.multiply(numeric_date_utilities.$microseconds_in_a_second$.getGlobalValue(), numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(numeric_date_utilities.elapsed_internal_real_time(start_time, Time.get_internal_real_time()))), (SubLObject)web_services_browser.UNPROVIDED);
            xml_utilities.xml_markup((SubLObject)web_services_browser.$str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$276 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str232$sublEvaluation, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str233$time, actual_time), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$277 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$278 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$279 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str234$evaluatedForm, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$279 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_cdata(PrintLow.format((SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$str220$_S, subl));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$279, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$279, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$278, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$280 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str234$evaluatedForm);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$280, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$281 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$280 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str226$result, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$282 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                    xml_utilities.xml_cdata(PrintLow.format((SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$str220$_S, result));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$282, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$280, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$281, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$283 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str226$result);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$283, thread);
                            }
                        }
                        if (web_services_browser.NIL != subl_promotions.positive_integer_p(result_count)) {
                            SubLObject list_var = (SubLObject)web_services_browser.NIL;
                            SubLObject another_result = (SubLObject)web_services_browser.NIL;
                            SubLObject n = (SubLObject)web_services_browser.NIL;
                            list_var = (SubLObject)ConsesLow.list(result2, result3, result4, result5);
                            another_result = list_var.first();
                            for (n = (SubLObject)web_services_browser.ZERO_INTEGER; web_services_browser.NIL != list_var; list_var = list_var.rest(), another_result = list_var.first(), n = Numbers.add((SubLObject)web_services_browser.ONE_INTEGER, n)) {
                                if (result_count.numG(Numbers.add(n, (SubLObject)web_services_browser.ONE_INTEGER))) {
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$284 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$281 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)web_services_browser.$str226$result, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$str235$n, Numbers.add(n, (SubLObject)web_services_browser.ONE_INTEGER)), (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$kw6$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$285 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)web_services_browser.$kw6$UNINITIALIZED, thread);
                                                xml_utilities.xml_cdata(PrintLow.format((SubLObject)web_services_browser.NIL, (SubLObject)web_services_browser.$str220$_S, another_result));
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$285, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$281, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$284, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$286 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str226$result);
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$286, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$277, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$276, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$287 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_services_browser.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)web_services_browser.$str232$sublEvaluation);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$287, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 20479L)
    public static SubLObject json_context_menu_data(final SubLObject args) {
        if (web_services_browser.NIL != html_utilities.html_extract_input((SubLObject)web_services_browser.$str237$term, args)) {
            return json_term_context_menu_data(args);
        }
        if (web_services_browser.NIL != html_utilities.html_extract_input((SubLObject)web_services_browser.$str214$assertion, args)) {
            return json_assertion_context_menu_data(args);
        }
        Errors.error((SubLObject)web_services_browser.$str238$Ack);
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 20953L)
    public static SubLObject json_assertion_context_menu_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding(thread);
        try {
            json.$json_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject assertion = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)web_services_browser.$str214$assertion, args), (SubLObject)web_services_browser.UNPROVIDED);
            final SubLObject user = api_control_vars.$the_cyclist$.getDynamicValue(thread);
            SubLObject v_json = (SubLObject)web_services_browser.NIL;
            thread.resetMultipleValues();
            final SubLObject sentences = user_assertion_meta_assertion_sentences(user, assertion);
            final SubLObject descriptions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw241$markers, meta_assertion_marker_data(sentences, descriptions));
            v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw242$bookmarked, (web_services_browser.NIL != cb_web_services.currently_bookmarkedP(assertion, (SubLObject)web_services_browser.UNPROVIDED)) ? web_services_browser.$const243$True : web_services_browser.$const244$False);
            v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw245$asserted, (web_services_browser.NIL != assertions_high.asserted_assertionP(assertion)) ? web_services_browser.$const243$True : web_services_browser.$const244$False);
            v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw246$modifiable, (web_services_browser.NIL != cb_assertion_editor.assertion_modification_permittedP(assertion)) ? web_services_browser.$const243$True : web_services_browser.$const244$False);
            v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw247$rule, (web_services_browser.NIL != assertions_high.rule_assertionP(assertion)) ? web_services_browser.$const243$True : web_services_browser.$const244$False);
            json.json_serialize(v_json);
            return v_json;
        }
        finally {
            json.$json_stream$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 21789L)
    public static SubLObject user_assertion_meta_assertion_sentences(final SubLObject user, final SubLObject assertion) {
        final SubLObject query_results = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(web_services_browser.$const249$thereExistVars, (SubLObject)web_services_browser.$list250, (SubLObject)ConsesLow.list(web_services_browser.$const251$and, (SubLObject)web_services_browser.$list252, (SubLObject)web_services_browser.$list253, (SubLObject)ConsesLow.list(web_services_browser.$const254$projectParticipants, (SubLObject)web_services_browser.$sym255$_PROJECT, user))), (SubLObject)web_services_browser.$list256, (SubLObject)web_services_browser.UNPROVIDED);
        SubLObject sentences = (SubLObject)web_services_browser.NIL;
        SubLObject display_strings = (SubLObject)web_services_browser.NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject binding_set = (SubLObject)web_services_browser.NIL;
        binding_set = cdolist_list_var.first();
        while (web_services_browser.NIL != cdolist_list_var) {
            sentences = (SubLObject)ConsesLow.cons(conses_high.subst(assertions_high.assertion_ist_sentence(assertion), (SubLObject)web_services_browser.$list257, (SubLObject)ConsesLow.list(web_services_browser.$const258$ist, bindings.variable_binding_value(bindings.get_variable_binding((SubLObject)web_services_browser.$sym259$_MT, binding_set)), bindings.variable_binding_value(bindings.get_variable_binding((SubLObject)web_services_browser.$sym260$_SENTENCE_TEMPLATE, binding_set))), Symbols.symbol_function((SubLObject)web_services_browser.EQUAL), (SubLObject)web_services_browser.UNPROVIDED), sentences);
            display_strings = (SubLObject)ConsesLow.cons(bindings.variable_binding_value(bindings.get_variable_binding((SubLObject)web_services_browser.$sym261$_STRING, binding_set)), display_strings);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Values.values(sentences, display_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 22775L)
    public static SubLObject json_term_context_menu_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding(thread);
        try {
            json.$json_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject v_term = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)web_services_browser.$str237$term, args), (SubLObject)web_services_browser.UNPROVIDED);
            SubLObject v_json = (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$kw262$termName, cycl_utilities.denotational_term_name(v_term));
            if (web_services_browser.NIL != cb_web_services.currently_bookmarkedP(v_term, (SubLObject)web_services_browser.UNPROVIDED)) {
                v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw242$bookmarked, web_services_browser.$const243$True);
            }
            if (web_services_browser.NIL == cb_editor.term_modification_forbiddenP(v_term)) {
                v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw246$modifiable, web_services_browser.$const243$True);
                v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw263$assertionCount, kb_indexing.num_index(v_term));
            }
            if (web_services_browser.NIL != cycl_grammar.cycl_nat_p(v_term)) {
                v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw264$notRenamable, web_services_browser.$const243$True);
            }
            if (web_services_browser.NIL == cb_editor.term_modification_forbiddenP(v_term) && web_services_browser.NIL != cb_editor.term_as_merge_source_permittedP(v_term)) {
                v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw265$mergable, web_services_browser.$const243$True);
            }
            thread.resetMultipleValues();
            final SubLObject sentences = user_term_meta_assertion_sentences(api_control_vars.$the_cyclist$.getDynamicValue(thread), v_term);
            final SubLObject descriptions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (web_services_browser.NIL != sentences) {
                v_json = conses_high.putf(v_json, (SubLObject)web_services_browser.$kw241$markers, meta_assertion_marker_data(sentences, descriptions));
            }
            json.json_serialize((SubLObject)((web_services_browser.NIL != v_json) ? v_json : web_services_browser.$kw266$EMPTY_OBJECT));
        }
        finally {
            json.$json_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)web_services_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 23743L)
    public static SubLObject user_term_meta_assertion_sentences(final SubLObject user, final SubLObject v_term) {
        final SubLObject query_results = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(web_services_browser.$const249$thereExistVars, (SubLObject)web_services_browser.$list267, (SubLObject)ConsesLow.list(web_services_browser.$const251$and, (SubLObject)web_services_browser.$list268, (SubLObject)ConsesLow.listS(web_services_browser.$const269$isa, v_term, (SubLObject)web_services_browser.$list270), (SubLObject)web_services_browser.$list253, (SubLObject)ConsesLow.list(web_services_browser.$const254$projectParticipants, (SubLObject)web_services_browser.$sym255$_PROJECT, user))), (SubLObject)web_services_browser.$list256, (SubLObject)web_services_browser.UNPROVIDED);
        SubLObject sentences = (SubLObject)web_services_browser.NIL;
        SubLObject display_strings = (SubLObject)web_services_browser.NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject binding_set = (SubLObject)web_services_browser.NIL;
        binding_set = cdolist_list_var.first();
        while (web_services_browser.NIL != cdolist_list_var) {
            sentences = (SubLObject)ConsesLow.cons(conses_high.subst(v_term, web_services_browser.$const271$TheFocalTerm, (SubLObject)ConsesLow.list(web_services_browser.$const258$ist, bindings.variable_binding_value(bindings.get_variable_binding((SubLObject)web_services_browser.$sym259$_MT, binding_set)), bindings.variable_binding_value(bindings.get_variable_binding((SubLObject)web_services_browser.$sym260$_SENTENCE_TEMPLATE, binding_set))), Symbols.symbol_function((SubLObject)web_services_browser.EQUAL), (SubLObject)web_services_browser.UNPROVIDED), sentences);
            display_strings = (SubLObject)ConsesLow.cons(bindings.variable_binding_value(bindings.get_variable_binding((SubLObject)web_services_browser.$sym261$_STRING, binding_set)), display_strings);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Values.values(sentences, display_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-services-browser.lisp", position = 24723L)
    public static SubLObject meta_assertion_marker_data(final SubLObject sentences, final SubLObject descriptions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject markers = (SubLObject)web_services_browser.NIL;
        SubLObject n = (SubLObject)web_services_browser.ZERO_INTEGER;
        SubLObject sentence = (SubLObject)web_services_browser.NIL;
        SubLObject sentence_$291 = (SubLObject)web_services_browser.NIL;
        SubLObject description = (SubLObject)web_services_browser.NIL;
        SubLObject description_$292 = (SubLObject)web_services_browser.NIL;
        sentence = sentences;
        sentence_$291 = sentence.first();
        description = descriptions;
        description_$292 = description.first();
        while (web_services_browser.NIL != description || web_services_browser.NIL != sentence) {
            final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)web_services_browser.NIL, thread);
                final SubLObject decontextualized = cycl_utilities.formula_arg2(sentence_$291, (SubLObject)web_services_browser.UNPROVIDED);
                final SubLObject pred = cycl_utilities.formula_arg0(decontextualized);
                final SubLObject pred_indicator = Symbols.make_keyword(cycl_utilities.denotational_term_name(pred));
                final SubLObject current_value_for_pred = conses_high.getf(markers, pred_indicator, (SubLObject)ConsesLow.listS((SubLObject)web_services_browser.$kw272$name, cycl_utilities.denotational_term_name(pred), (SubLObject)web_services_browser.$list273));
                SubLObject items = conses_high.getf(current_value_for_pred, (SubLObject)web_services_browser.$kw274$items, (SubLObject)web_services_browser.UNPROVIDED);
                final SubLObject knownP = ask_utilities.query_boolean(decontextualized, web_services_browser.$const275$InferencePSC, (SubLObject)web_services_browser.UNPROVIDED);
                final SubLObject assertion = czer_meta.find_visible_assertion_cycl(decontextualized, web_services_browser.$const275$InferencePSC);
                final SubLObject assertedP = list_utilities.sublisp_boolean(assertion);
                final SubLObject unassertable_assertionP = (SubLObject)SubLObjectFactory.makeBoolean(web_services_browser.NIL != assertedP && web_services_browser.NIL == assertions_high.asserted_assertionP(assertion));
                final SubLObject final_sentence = (SubLObject)((web_services_browser.NIL != knownP) ? ConsesLow.list(web_services_browser.$const276$unknownSentence, sentence_$291) : sentence_$291);
                SubLObject marker_data = (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$kw277$id, kb_utilities.compact_hl_external_id_string(final_sentence), (SubLObject)web_services_browser.$kw272$name, description_$292, (SubLObject)web_services_browser.$kw278$sentence, format_nil.format_nil_s(cycl_utilities.hl_to_el(final_sentence)));
                if (web_services_browser.NIL != assertion) {
                    marker_data = conses_high.putf(marker_data, (SubLObject)web_services_browser.$kw279$icon, Strings.string_downcase(format_nil.format_nil_a(cb_utilities.assertion_marker(assertion)), (SubLObject)web_services_browser.UNPROVIDED, (SubLObject)web_services_browser.UNPROVIDED));
                }
                else if (web_services_browser.NIL != unassertable_assertionP) {
                    marker_data = conses_high.putf(marker_data, (SubLObject)web_services_browser.$kw280$disabled, web_services_browser.$const243$True);
                }
                else if (web_services_browser.NIL == assertedP && web_services_browser.NIL != knownP) {
                    marker_data = conses_high.putf(marker_data, (SubLObject)web_services_browser.$kw279$icon, (SubLObject)web_services_browser.$str281$known);
                }
                items = conses_high.putf(items, Symbols.make_keyword(Sequences.cconcatenate((SubLObject)web_services_browser.$str282$assert, format_nil.format_nil_a_no_copy(n))), marker_data);
                markers = conses_high.putf(markers, pred_indicator, (SubLObject)ConsesLow.list((SubLObject)web_services_browser.$kw272$name, cycl_utilities.denotational_term_name(pred), (SubLObject)web_services_browser.$kw274$items, items));
                n = Numbers.add(n, (SubLObject)web_services_browser.ONE_INTEGER);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_0, thread);
            }
            sentence = sentence.rest();
            sentence_$291 = sentence.first();
            description = description.rest();
            description_$292 = description.first();
        }
        return markers;
    }
    
    public static SubLObject declare_web_services_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_login", "XML-LOGIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_logout", "XML-LOGOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_server_defaults", "XML-SERVER-DEFAULTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_server_status", "XML-SERVER-STATUS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "valid_cb_command_string_p", "VALID-CB-COMMAND-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_html_item", "XML-HTML-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_tool_item", "XML-TOOL-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_nav_item", "XML-NAV-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_bookmarked_tool_item", "XML-BOOKMARKED-TOOL-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_bookmarked_html_item", "XML-BOOKMARKED-HTML-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_item_separator", "XML-ITEM-SEPARATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_tools", "XML-TOOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_bookmarked_tool_url_hack", "XML-BOOKMARKED-TOOL-URL-HACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_bookmarked_tools", "XML-BOOKMARKED-TOOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_history", "XML-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_user_preferences", "XML-USER-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_set_user_preference_variable", "XML-SET-USER-PREFERENCE-VARIABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_save_user_preferences", "XML-SAVE-USER-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "xml_subl_eval", "XML-SUBL-EVAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "json_context_menu_data", "JSON-CONTEXT-MENU-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "json_assertion_context_menu_data", "JSON-ASSERTION-CONTEXT-MENU-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "user_assertion_meta_assertion_sentences", "USER-ASSERTION-META-ASSERTION-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "json_term_context_menu_data", "JSON-TERM-CONTEXT-MENU-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "user_term_meta_assertion_sentences", "USER-TERM-META-ASSERTION-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_services_browser", "meta_assertion_marker_data", "META-ASSERTION-MARKER-DATA", 2, 0, false);
        return (SubLObject)web_services_browser.NIL;
    }
    
    public static SubLObject init_web_services_browser_file() {
        return (SubLObject)web_services_browser.NIL;
    }
    
    public static SubLObject setup_web_services_browser_file() {
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym9$XML_LOGIN, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym13$XML_LOGOUT, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym16$XML_SERVER_DEFAULTS, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym48$XML_SERVER_STATUS, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym203$XML_TOOLS, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym207$XML_BOOKMARKED_TOOLS, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym217$XML_HISTORY, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym224$XML_USER_PREFERENCES, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym227$XML_SET_USER_PREFERENCE_VARIABLE, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym229$XML_SAVE_USER_PREFERENCES, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym236$XML_SUBL_EVAL, (SubLObject)web_services_browser.$kw10$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)web_services_browser.$sym239$JSON_CONTEXT_MENU_DATA, (SubLObject)web_services_browser.$kw240$JSON_HANDLER);
        return (SubLObject)web_services_browser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_web_services_browser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_web_services_browser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_web_services_browser_file();
    }
    
    static {
        me = (SubLFile)new web_services_browser();
        $str0$userName = SubLObjectFactory.makeString("userName");
        $str1$password = SubLObjectFactory.makeString("password");
        $str2$Guest = SubLObjectFactory.makeString("Guest");
        $kw3$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str4$__xml_version__1_0__encoding__UTF = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $str5$login = SubLObjectFactory.makeString("login");
        $kw6$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str7$sessionId = SubLObjectFactory.makeString("sessionId");
        $str8$Result = SubLObjectFactory.makeString("Result");
        $sym9$XML_LOGIN = SubLObjectFactory.makeSymbol("XML-LOGIN");
        $kw10$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $kw11$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $str12$logout = SubLObjectFactory.makeString("logout");
        $sym13$XML_LOGOUT = SubLObjectFactory.makeSymbol("XML-LOGOUT");
        $str14$cycServerDefaults = SubLObjectFactory.makeString("cycServerDefaults");
        $str15$defaultCyclist = SubLObjectFactory.makeString("defaultCyclist");
        $sym16$XML_SERVER_DEFAULTS = SubLObjectFactory.makeSymbol("XML-SERVER-DEFAULTS");
        $str17$fast = SubLObjectFactory.makeString("fast");
        $str18$cycServerStatus = SubLObjectFactory.makeString("cycServerStatus");
        $str19$hostName = SubLObjectFactory.makeString("hostName");
        $str20$unknown = SubLObjectFactory.makeString("unknown");
        $str21$basePort = SubLObjectFactory.makeString("basePort");
        $str22$_d = SubLObjectFactory.makeString("~d");
        $str23$agendaMode = SubLObjectFactory.makeString("agendaMode");
        $str24$agendaModeString = SubLObjectFactory.makeString("agendaModeString");
        $str25$agendaState = SubLObjectFactory.makeString("agendaState");
        $str26$kbBaseNum = SubLObjectFactory.makeString("kbBaseNum");
        $str27$kbNum = SubLObjectFactory.makeString("kbNum");
        $str28$_d__d = SubLObjectFactory.makeString("~d.~d");
        $str29$cycRevisionString = SubLObjectFactory.makeString("cycRevisionString");
        $str30$remoteQueue = SubLObjectFactory.makeString("remoteQueue");
        $str31$processedCount = SubLObjectFactory.makeString("processedCount");
        $str32$pendingCount = SubLObjectFactory.makeString("pendingCount");
        $str33$totalCount = SubLObjectFactory.makeString("totalCount");
        $str34$localQueue = SubLObjectFactory.makeString("localQueue");
        $str35$pendingDiskWriteCount = SubLObjectFactory.makeString("pendingDiskWriteCount");
        $str36$auxQueue = SubLObjectFactory.makeString("auxQueue");
        $str37$transmitQueue = SubLObjectFactory.makeString("transmitQueue");
        $str38$transmitQueueSize = SubLObjectFactory.makeString("transmitQueueSize");
        $str39$userActions = SubLObjectFactory.makeString("userActions");
        $str40$actionsPendingCount = SubLObjectFactory.makeString("actionsPendingCount");
        $str41$_a = SubLObjectFactory.makeString("~a");
        $str42$users = SubLObjectFactory.makeString("users");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("USER-NAME"));
        $str44$userInfo = SubLObjectFactory.makeString("userInfo");
        $str45$machineName = SubLObjectFactory.makeString("machineName");
        $str46$you = SubLObjectFactory.makeString("you");
        $str47$yes = SubLObjectFactory.makeString("yes");
        $sym48$XML_SERVER_STATUS = SubLObjectFactory.makeSymbol("XML-SERVER-STATUS");
        $str49$item = SubLObjectFactory.makeString("item");
        $str50$id = SubLObjectFactory.makeString("id");
        $str51$type = SubLObjectFactory.makeString("type");
        $str52$html = SubLObjectFactory.makeString("html");
        $str53$name = SubLObjectFactory.makeString("name");
        $str54$subl = SubLObjectFactory.makeString("subl");
        $str55$separator = SubLObjectFactory.makeString("separator");
        $str56$toolList = SubLObjectFactory.makeString("toolList");
        $str57$category = SubLObjectFactory.makeString("category");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("File"));
        $str59$ke_compose = SubLObjectFactory.makeString("ke-compose");
        $str60$Compose_KE_Text = SubLObjectFactory.makeString("Compose KE Text");
        $str61$ke_name_file = SubLObjectFactory.makeString("ke-name-file");
        $str62$Load_KE_File = SubLObjectFactory.makeString("Load KE File");
        $str63$cb_load_transcript = SubLObjectFactory.makeString("cb-load-transcript");
        $str64$Load_Transcript = SubLObjectFactory.makeString("Load Transcript");
        $str65$cb_transcript_viewer = SubLObjectFactory.makeString("cb-transcript-viewer");
        $str66$View_Transcript = SubLObjectFactory.makeString("View Transcript");
        $str67$cb_owl_import = SubLObjectFactory.makeString("cb-owl-import");
        $str68$OWL_Import = SubLObjectFactory.makeString("OWL Import");
        $str69$cb_owl_export = SubLObjectFactory.makeString("cb-owl-export");
        $str70$OWL_Export = SubLObjectFactory.makeString("OWL Export");
        $str71$cb_partition_load = SubLObjectFactory.makeString("cb-partition-load");
        $str72$Load_Partition = SubLObjectFactory.makeString("Load Partition");
        $str73$cb_partition_save = SubLObjectFactory.makeString("cb-partition-save");
        $str74$Save_Partition = SubLObjectFactory.makeString("Save Partition");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("Browse"));
        $str76$cb_history = SubLObjectFactory.makeString("cb-history");
        $str77$History = SubLObjectFactory.makeString("History");
        $str78$cb_recent_kb_additions = SubLObjectFactory.makeString("cb-recent-kb-additions");
        $str79$Recently_Added_KB_Content = SubLObjectFactory.makeString("Recently Added KB Content");
        $str80$cb_find_assertion = SubLObjectFactory.makeString("cb-find-assertion");
        $str81$Find_Assertion = SubLObjectFactory.makeString("Find Assertion");
        $str82$cb_index_overlap = SubLObjectFactory.makeString("cb-index-overlap");
        $str83$Index_Overlap = SubLObjectFactory.makeString("Index Overlap");
        $str84$hb_start = SubLObjectFactory.makeString("hb-start");
        $str85$Hierarchy_Browser = SubLObjectFactory.makeString("Hierarchy Browser");
        $str86$st_similarity_entrance = SubLObjectFactory.makeString("st-similarity-entrance");
        $str87$Similarity_Tool = SubLObjectFactory.makeString("Similarity Tool");
        $str88$get_suggested_followups = SubLObjectFactory.makeString("get-suggested-followups");
        $str89$Followup_Term_Suggestor = SubLObjectFactory.makeString("Followup Term Suggestor");
        $str90$cb_gaf_suggestor = SubLObjectFactory.makeString("cb-gaf-suggestor");
        $str91$GAF_Suggestor = SubLObjectFactory.makeString("GAF Suggestor");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("Query"));
        $str93$cb_query = SubLObjectFactory.makeString("cb-query");
        $str94$Query_Tool = SubLObjectFactory.makeString("Query Tool");
        $str95$cb_show_when = SubLObjectFactory.makeString("cb-show-when");
        $str96$When_Tool = SubLObjectFactory.makeString("When Tool");
        $str97$test_taking_tool = SubLObjectFactory.makeString("test-taking-tool");
        $str98$Test_Taking_Tool = SubLObjectFactory.makeString("Test-Taking Tool");
        $str99$cb_rtv = SubLObjectFactory.makeString("cb-rtv");
        $str100$relatedToVia_Tool = SubLObjectFactory.makeString("relatedToVia Tool");
        $str101$cb_disjointness_preliminary_scree = SubLObjectFactory.makeString("cb-disjointness-preliminary-screen");
        $str102$Disjointness_Tool = SubLObjectFactory.makeString("Disjointness Tool");
        $str103$cb_handle_query_search = SubLObjectFactory.makeString("cb-handle-query-search");
        $str104$Query_Search = SubLObjectFactory.makeString("Query Search");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("Inference"));
        $str106$cb_latest_inference = SubLObjectFactory.makeString("cb-latest-inference");
        $str107$Latest_Inference = SubLObjectFactory.makeString("Latest Inference");
        $str108$cb_all_inferences = SubLObjectFactory.makeString("cb-all-inferences");
        $str109$All_Inferences = SubLObjectFactory.makeString("All Inferences");
        $str110$cb_all_problem_stores = SubLObjectFactory.makeString("cb-all-problem-stores");
        $str111$All_Problem_Stores = SubLObjectFactory.makeString("All Problem Stores");
        $str112$cb_forward_inference_browser = SubLObjectFactory.makeString("cb-forward-inference-browser");
        $str113$Forward_Inference_Browser = SubLObjectFactory.makeString("Forward Inference Browser");
        $str114$cb_forward_propagate_mt = SubLObjectFactory.makeString("cb-forward-propagate-mt");
        $str115$Forward_Propagate_Mt = SubLObjectFactory.makeString("Forward Propagate Mt");
        $str116$cb_wff = SubLObjectFactory.makeString("cb-wff");
        $str117$WFF_Check = SubLObjectFactory.makeString("WFF Check");
        $str118$cb_hypothesize_handler = SubLObjectFactory.makeString("cb-hypothesize-handler");
        $str119$Hypothesize = SubLObjectFactory.makeString("Hypothesize");
        $str120$cb_hc = SubLObjectFactory.makeString("cb-hc");
        $str121$Hypothesis_Corroboration_Tool = SubLObjectFactory.makeString("Hypothesis Corroboration Tool");
        $str122$cb_transformation_rule_statistics = SubLObjectFactory.makeString("cb-transformation-rule-statistics");
        $str123$Experience_Control_Panel = SubLObjectFactory.makeString("Experience Control Panel");
        $str124$cb_forward_inference_metrics = SubLObjectFactory.makeString("cb-forward-inference-metrics");
        $str125$Forward_Inference_Metrics = SubLObjectFactory.makeString("Forward Inference Metrics");
        $str126$cb_hl_module_summary = SubLObjectFactory.makeString("cb-hl-module-summary");
        $str127$HL_Module_Summary = SubLObjectFactory.makeString("HL Module Summary");
        $str128$cb_kct_control_panel = SubLObjectFactory.makeString("cb-kct-control-panel");
        $str129$KB_Content_Test_Control_Panel = SubLObjectFactory.makeString("KB Content Test Control Panel");
        $str130$cb_kct_main = SubLObjectFactory.makeString("cb-kct-main");
        $str131$KB_Content_Test_Monitor = SubLObjectFactory.makeString("KB Content Test Monitor");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("NL"));
        $str133$maybe_use_english = SubLObjectFactory.makeString("maybe-use-english");
        $str134$cb_invoke_oe_lexification_wizard = SubLObjectFactory.makeString("cb-invoke-oe-lexification-wizard");
        $str135$Lexification_Assistant = SubLObjectFactory.makeString("Lexification Assistant");
        $str136$cb_invoke_sme_lexification_wizard = SubLObjectFactory.makeString("cb-invoke-sme-lexification-wizard");
        $str137$Dictionary_Assistant = SubLObjectFactory.makeString("Dictionary Assistant");
        $str138$cb_phrase_structure_parsing = SubLObjectFactory.makeString("cb-phrase-structure-parsing");
        $str139$Phrase_Structure_Parse = SubLObjectFactory.makeString("Phrase Structure Parse");
        $str140$cb_view_webstore = SubLObjectFactory.makeString("cb-view-webstore");
        $str141$WebStore_Viewer = SubLObjectFactory.makeString("WebStore Viewer");
        $str142$clear_pg_caches = SubLObjectFactory.makeString("clear-pg-caches");
        $str143$Clear_Paraphrase_Caches = SubLObjectFactory.makeString("Clear Paraphrase Caches");
        $str144$cb_show_nl_trie = SubLObjectFactory.makeString("cb-show-nl-trie");
        $str145$NL_Trie_Browser = SubLObjectFactory.makeString("NL Trie Browser");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("Create"));
        $str147$cb_create_term = SubLObjectFactory.makeString("cb-create-term");
        $str148$Create_Term = SubLObjectFactory.makeString("Create Term");
        $str149$cb_assert = SubLObjectFactory.makeString("cb-assert");
        $str150$Assert_Sentence = SubLObjectFactory.makeString("Assert Sentence");
        $str151$cb_restart_precision_suggestor = SubLObjectFactory.makeString("cb-restart-precision-suggestor");
        $str152$Precision_Suggestor = SubLObjectFactory.makeString("Precision Suggestor");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("Expert"));
        $str154$cb_handle_interactor = SubLObjectFactory.makeString("cb-handle-interactor");
        $str155$SubL_Interactor = SubLObjectFactory.makeString("SubL Interactor");
        $str156$cb_jstack_trace = SubLObjectFactory.makeString("cb-jstack-trace");
        $str157$JRTL_jstack_Trace = SubLObjectFactory.makeString("JRTL jstack Trace");
        $str158$sksi_sks_manager = SubLObjectFactory.makeString("sksi-sks-manager");
        $str159$SKS_Manager = SubLObjectFactory.makeString("SKS Manager");
        $str160$sksi_smt = SubLObjectFactory.makeString("sksi-smt");
        $str161$Schema_Modeling_Tool = SubLObjectFactory.makeString("Schema Modeling Tool");
        $str162$cb_all_sksi_conjunctive_removals = SubLObjectFactory.makeString("cb-all-sksi-conjunctive-removals");
        $str163$All_SKSI_Conjunctive_Removals = SubLObjectFactory.makeString("All SKSI Conjunctive Removals");
        $str164$cb_load_api = SubLObjectFactory.makeString("cb-load-api");
        $str165$Load_API_Expressions = SubLObjectFactory.makeString("Load API Expressions");
        $str166$sg_cb_main = SubLObjectFactory.makeString("sg-cb-main");
        $str167$Scenario_Generation_Tool = SubLObjectFactory.makeString("Scenario Generation Tool");
        $str168$cb_random_thoughts = SubLObjectFactory.makeString("cb-random-thoughts");
        $str169$Random_Thought_Generator = SubLObjectFactory.makeString("Random Thought Generator");
        $str170$cb_classes_display_hierarchy_in_h = SubLObjectFactory.makeString("cb-classes-display-hierarchy-in-html");
        $str171$Browse_SubLOOP = SubLObjectFactory.makeString("Browse SubLOOP");
        $str172$cb_uia_forwarding_handler = SubLObjectFactory.makeString("cb-uia-forwarding-handler");
        $str173$UIA_Forwarding = SubLObjectFactory.makeString("UIA Forwarding");
        $str174$cyc_nav_clear_el_formulas_cache = SubLObjectFactory.makeString("cyc-nav-clear-el-formulas-cache");
        $str175$Clear_EL_Formulas_Cache = SubLObjectFactory.makeString("Clear EL Formulas Cache");
        $str176$plan_finder = SubLObjectFactory.makeString("plan-finder");
        $str177$Planner = SubLObjectFactory.makeString("Planner");
        $str178$cb_td_tool = SubLObjectFactory.makeString("cb-td-tool");
        $str179$SL2C_Browser = SubLObjectFactory.makeString("SL2C Browser");
        $str180$cb_auxiliary_indices = SubLObjectFactory.makeString("cb-auxiliary-indices");
        $str181$Auxiliary_Index_List = SubLObjectFactory.makeString("Auxiliary Index List");
        $str182$cyc_navigator = SubLObjectFactory.makeString("cyc-navigator");
        $str183$Navigator = SubLObjectFactory.makeString("Navigator");
        $str184$set_navigator_preferences = SubLObjectFactory.makeString("set-navigator-preferences");
        $str185$Navigator_Preferences = SubLObjectFactory.makeString("Navigator Preferences");
        $str186$cb_tools = SubLObjectFactory.makeString("cb-tools");
        $str187$Tools = SubLObjectFactory.makeString("Tools");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name"), (SubLObject)SubLObjectFactory.makeString("Help"));
        $str189$cb_options = SubLObjectFactory.makeString("cb-options");
        $str190$Preferences = SubLObjectFactory.makeString("Preferences");
        $str191$cb_system = SubLObjectFactory.makeString("cb-system");
        $str192$System_Information = SubLObjectFactory.makeString("System Information");
        $str193$_cycdoc_toc_html = SubLObjectFactory.makeString("/cycdoc/toc.html");
        $str194$Documentation = SubLObjectFactory.makeString("Documentation");
        $str195$cb_login = SubLObjectFactory.makeString("cb-login");
        $str196$User_Login = SubLObjectFactory.makeString("User Login");
        $str197$cb_set_password = SubLObjectFactory.makeString("cb-set-password");
        $str198$Set_Password = SubLObjectFactory.makeString("Set Password");
        $str199$cb_agenda = SubLObjectFactory.makeString("cb-agenda");
        $str200$Agenda_Control = SubLObjectFactory.makeString("Agenda Control");
        $str201$cb_mode = SubLObjectFactory.makeString("cb-mode");
        $str202$Communication_Modes = SubLObjectFactory.makeString("Communication Modes");
        $sym203$XML_TOOLS = SubLObjectFactory.makeSymbol("XML-TOOLS");
        $list204 = ConsesLow.list((SubLObject)Characters.CHAR_quotation);
        $list205 = ConsesLow.list((SubLObject)Characters.CHAR_question);
        $str206$bookmarkedTools = SubLObjectFactory.makeString("bookmarkedTools");
        $sym207$XML_BOOKMARKED_TOOLS = SubLObjectFactory.makeSymbol("XML-BOOKMARKED-TOOLS");
        $str208$history = SubLObjectFactory.makeString("history");
        $str209$constants = SubLObjectFactory.makeString("constants");
        $str210$constant = SubLObjectFactory.makeString("constant");
        $str211$nats = SubLObjectFactory.makeString("nats");
        $str212$nat = SubLObjectFactory.makeString("nat");
        $str213$assertions = SubLObjectFactory.makeString("assertions");
        $str214$assertion = SubLObjectFactory.makeString("assertion");
        $str215$sentences = SubLObjectFactory.makeString("sentences");
        $str216$sentence = SubLObjectFactory.makeString("sentence");
        $sym217$XML_HISTORY = SubLObjectFactory.makeSymbol("XML-HISTORY");
        $str218$userPreferences = SubLObjectFactory.makeString("userPreferences");
        $str219$user = SubLObjectFactory.makeString("user");
        $str220$_S = SubLObjectFactory.makeString("~S");
        $kw221$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str222$variable = SubLObjectFactory.makeString("variable");
        $str223$value = SubLObjectFactory.makeString("value");
        $sym224$XML_USER_PREFERENCES = SubLObjectFactory.makeSymbol("XML-USER-PREFERENCES");
        $str225$setUserPreference = SubLObjectFactory.makeString("setUserPreference");
        $str226$result = SubLObjectFactory.makeString("result");
        $sym227$XML_SET_USER_PREFERENCE_VARIABLE = SubLObjectFactory.makeSymbol("XML-SET-USER-PREFERENCE-VARIABLE");
        $str228$saveUserPreferences = SubLObjectFactory.makeString("saveUserPreferences");
        $sym229$XML_SAVE_USER_PREFERENCES = SubLObjectFactory.makeSymbol("XML-SAVE-USER-PREFERENCES");
        $str230$resultCount = SubLObjectFactory.makeString("resultCount");
        $sym231$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $str232$sublEvaluation = SubLObjectFactory.makeString("sublEvaluation");
        $str233$time = SubLObjectFactory.makeString("time");
        $str234$evaluatedForm = SubLObjectFactory.makeString("evaluatedForm");
        $str235$n = SubLObjectFactory.makeString("n");
        $sym236$XML_SUBL_EVAL = SubLObjectFactory.makeSymbol("XML-SUBL-EVAL");
        $str237$term = SubLObjectFactory.makeString("term");
        $str238$Ack = SubLObjectFactory.makeString("Ack");
        $sym239$JSON_CONTEXT_MENU_DATA = SubLObjectFactory.makeSymbol("JSON-CONTEXT-MENU-DATA");
        $kw240$JSON_HANDLER = SubLObjectFactory.makeKeyword("JSON-HANDLER");
        $kw241$markers = SubLObjectFactory.makeKeyword("markers");
        $kw242$bookmarked = SubLObjectFactory.makeKeyword("bookmarked");
        $const243$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const244$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw245$asserted = SubLObjectFactory.makeKeyword("asserted");
        $kw246$modifiable = SubLObjectFactory.makeKeyword("modifiable");
        $kw247$rule = SubLObjectFactory.makeKeyword("rule");
        $sym248$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const249$thereExistVars = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistVars"));
        $list250 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"));
        $const251$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list252 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("annotationSentenceForAssertionForProject")), (SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE-TEMPLATE"));
        $list253 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("displayStringForAnnotationSentenceForProject")), (SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $const254$projectParticipants = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("projectParticipants"));
        $sym255$_PROJECT = SubLObjectFactory.makeSymbol("?PROJECT");
        $list256 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericKRWorkflowMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"))));
        $list257 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion")));
        $const258$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym259$_MT = SubLObjectFactory.makeSymbol("?MT");
        $sym260$_SENTENCE_TEMPLATE = SubLObjectFactory.makeSymbol("?SENTENCE-TEMPLATE");
        $sym261$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $kw262$termName = SubLObjectFactory.makeKeyword("termName");
        $kw263$assertionCount = SubLObjectFactory.makeKeyword("assertionCount");
        $kw264$notRenamable = SubLObjectFactory.makeKeyword("notRenamable");
        $kw265$mergable = SubLObjectFactory.makeKeyword("mergable");
        $kw266$EMPTY_OBJECT = SubLObjectFactory.makeKeyword("EMPTY-OBJECT");
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL"));
        $list268 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("annotationSentenceForInstancesForProject")), (SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL"));
        $const269$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list270 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COLL"));
        $const271$TheFocalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFocalTerm"));
        $kw272$name = SubLObjectFactory.makeKeyword("name");
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("items"), (SubLObject)web_services_browser.NIL);
        $kw274$items = SubLObjectFactory.makeKeyword("items");
        $const275$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const276$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw277$id = SubLObjectFactory.makeKeyword("id");
        $kw278$sentence = SubLObjectFactory.makeKeyword("sentence");
        $kw279$icon = SubLObjectFactory.makeKeyword("icon");
        $kw280$disabled = SubLObjectFactory.makeKeyword("disabled");
        $str281$known = SubLObjectFactory.makeString("known");
        $str282$assert = SubLObjectFactory.makeString("assert");
    }
}

/*

	Total time: 13850 ms
	
*/