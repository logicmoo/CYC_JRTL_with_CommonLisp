package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.assertion_marker;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link_method;
import static com.cyc.cycjava.cycl.cb_utilities.cb_tool_abbreviation;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.utilities_macros.$html_interface_variables$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class web_services_browser extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new web_services_browser();



    private static final SubLString $$$userName = makeString("userName");

    private static final SubLString $$$password = makeString("password");

    private static final SubLString $$$Guest = makeString("Guest");



    private static final SubLString $str4$__xml_version__1_0__encoding__UTF = makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    private static final SubLString $$$login = makeString("login");



    private static final SubLString $$$sessionId = makeString("sessionId");

    private static final SubLString $$$Result = makeString("Result");

    private static final SubLSymbol XML_LOGIN = makeSymbol("XML-LOGIN");





    private static final SubLString $$$logout = makeString("logout");

    private static final SubLSymbol XML_LOGOUT = makeSymbol("XML-LOGOUT");

    private static final SubLString $$$cycServerDefaults = makeString("cycServerDefaults");

    private static final SubLString $$$defaultCyclist = makeString("defaultCyclist");

    private static final SubLSymbol XML_SERVER_DEFAULTS = makeSymbol("XML-SERVER-DEFAULTS");

    private static final SubLString $$$fast = makeString("fast");

    private static final SubLString $$$cycServerStatus = makeString("cycServerStatus");

    private static final SubLString $$$hostName = makeString("hostName");

    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLString $$$basePort = makeString("basePort");

    private static final SubLString $str22$_d = makeString("~d");

    private static final SubLString $$$agendaMode = makeString("agendaMode");

    private static final SubLString $$$agendaModeString = makeString("agendaModeString");

    private static final SubLString $$$agendaState = makeString("agendaState");

    private static final SubLString $$$kbBaseNum = makeString("kbBaseNum");

    private static final SubLString $$$kbNum = makeString("kbNum");

    private static final SubLString $str28$_d__d = makeString("~d.~d");

    private static final SubLString $$$cycRevisionString = makeString("cycRevisionString");

    private static final SubLString $$$remoteQueue = makeString("remoteQueue");

    private static final SubLString $$$processedCount = makeString("processedCount");

    private static final SubLString $$$pendingCount = makeString("pendingCount");

    private static final SubLString $$$totalCount = makeString("totalCount");

    private static final SubLString $$$localQueue = makeString("localQueue");

    private static final SubLString $$$pendingDiskWriteCount = makeString("pendingDiskWriteCount");

    private static final SubLString $$$auxQueue = makeString("auxQueue");

    private static final SubLString $$$transmitQueue = makeString("transmitQueue");

    private static final SubLString $$$transmitQueueSize = makeString("transmitQueueSize");

    private static final SubLString $$$userActions = makeString("userActions");

    private static final SubLString $$$actionsPendingCount = makeString("actionsPendingCount");

    private static final SubLString $str41$_a = makeString("~a");

    private static final SubLString $$$users = makeString("users");

    private static final SubLList $list43 = list(makeSymbol("MACHINE-NAME"), makeSymbol("USER-NAME"));

    private static final SubLString $$$userInfo = makeString("userInfo");

    private static final SubLString $$$machineName = makeString("machineName");

    private static final SubLString $$$you = makeString("you");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLSymbol XML_SERVER_STATUS = makeSymbol("XML-SERVER-STATUS");

    private static final SubLString $$$item = makeString("item");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $$$html = makeString("html");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $$$subl = makeString("subl");

    private static final SubLString $$$separator = makeString("separator");

    private static final SubLString $$$toolList = makeString("toolList");

    private static final SubLString $$$category = makeString("category");

    private static final SubLList $list58 = list(makeString("name"), makeString("File"));

    private static final SubLString $str59$ke_compose = makeString("ke-compose");

    private static final SubLString $$$Compose_KE_Text = makeString("Compose KE Text");

    private static final SubLString $str61$ke_name_file = makeString("ke-name-file");

    private static final SubLString $$$Load_KE_File = makeString("Load KE File");

    private static final SubLString $str63$cb_load_transcript = makeString("cb-load-transcript");

    private static final SubLString $$$Load_Transcript = makeString("Load Transcript");

    private static final SubLString $str65$cb_transcript_viewer = makeString("cb-transcript-viewer");

    private static final SubLString $$$View_Transcript = makeString("View Transcript");

    private static final SubLString $str67$cb_owl_import = makeString("cb-owl-import");

    private static final SubLString $$$OWL_Import = makeString("OWL Import");

    private static final SubLString $str69$cb_owl_export = makeString("cb-owl-export");

    private static final SubLString $$$OWL_Export = makeString("OWL Export");

    private static final SubLString $str71$cb_partition_load = makeString("cb-partition-load");

    private static final SubLString $$$Load_Partition = makeString("Load Partition");

    private static final SubLString $str73$cb_partition_save = makeString("cb-partition-save");

    private static final SubLString $$$Save_Partition = makeString("Save Partition");

    private static final SubLList $list75 = list(makeString("name"), makeString("Browse"));

    private static final SubLString $str76$cb_history = makeString("cb-history");

    private static final SubLString $$$History = makeString("History");

    private static final SubLString $str78$cb_recent_kb_additions = makeString("cb-recent-kb-additions");

    private static final SubLString $$$Recently_Added_KB_Content = makeString("Recently Added KB Content");

    private static final SubLString $str80$cb_find_assertion = makeString("cb-find-assertion");

    private static final SubLString $$$Find_Assertion = makeString("Find Assertion");

    private static final SubLString $str82$cb_index_overlap = makeString("cb-index-overlap");

    private static final SubLString $$$Index_Overlap = makeString("Index Overlap");

    private static final SubLString $str84$hb_start = makeString("hb-start");

    private static final SubLString $$$Hierarchy_Browser = makeString("Hierarchy Browser");

    private static final SubLString $str86$st_similarity_entrance = makeString("st-similarity-entrance");

    private static final SubLString $$$Similarity_Tool = makeString("Similarity Tool");

    private static final SubLString $str88$get_suggested_followups = makeString("get-suggested-followups");

    private static final SubLString $$$Followup_Term_Suggestor = makeString("Followup Term Suggestor");

    private static final SubLString $str90$cb_gaf_suggestor = makeString("cb-gaf-suggestor");

    private static final SubLString $$$GAF_Suggestor = makeString("GAF Suggestor");

    private static final SubLList $list92 = list(makeString("name"), makeString("Query"));

    private static final SubLString $str93$cb_query = makeString("cb-query");

    private static final SubLString $$$Query_Tool = makeString("Query Tool");

    private static final SubLString $str95$cb_show_when = makeString("cb-show-when");

    private static final SubLString $$$When_Tool = makeString("When Tool");

    private static final SubLString $str97$test_taking_tool = makeString("test-taking-tool");

    private static final SubLString $str98$Test_Taking_Tool = makeString("Test-Taking Tool");

    private static final SubLString $str99$cb_rtv = makeString("cb-rtv");

    private static final SubLString $$$relatedToVia_Tool = makeString("relatedToVia Tool");

    private static final SubLString $str101$cb_disjointness_preliminary_scree = makeString("cb-disjointness-preliminary-screen");

    private static final SubLString $$$Disjointness_Tool = makeString("Disjointness Tool");

    private static final SubLString $str103$cb_handle_query_search = makeString("cb-handle-query-search");

    private static final SubLString $$$Query_Search = makeString("Query Search");

    private static final SubLList $list105 = list(makeString("name"), makeString("Inference"));

    private static final SubLString $str106$cb_latest_inference = makeString("cb-latest-inference");

    private static final SubLString $$$Latest_Inference = makeString("Latest Inference");

    private static final SubLString $str108$cb_all_inferences = makeString("cb-all-inferences");

    private static final SubLString $$$All_Inferences = makeString("All Inferences");

    private static final SubLString $str110$cb_all_problem_stores = makeString("cb-all-problem-stores");

    private static final SubLString $$$All_Problem_Stores = makeString("All Problem Stores");

    private static final SubLString $str112$cb_forward_inference_browser = makeString("cb-forward-inference-browser");

    private static final SubLString $$$Forward_Inference_Browser = makeString("Forward Inference Browser");

    private static final SubLString $str114$cb_forward_propagate_mt = makeString("cb-forward-propagate-mt");

    private static final SubLString $$$Forward_Propagate_Mt = makeString("Forward Propagate Mt");

    private static final SubLString $str116$cb_wff = makeString("cb-wff");

    private static final SubLString $$$WFF_Check = makeString("WFF Check");

    private static final SubLString $str118$cb_hypothesize_handler = makeString("cb-hypothesize-handler");

    private static final SubLString $$$Hypothesize = makeString("Hypothesize");

    private static final SubLString $str120$cb_hc = makeString("cb-hc");

    private static final SubLString $$$Hypothesis_Corroboration_Tool = makeString("Hypothesis Corroboration Tool");

    private static final SubLString $str122$cb_transformation_rule_statistics = makeString("cb-transformation-rule-statistics");

    private static final SubLString $$$Experience_Control_Panel = makeString("Experience Control Panel");

    private static final SubLString $str124$cb_forward_inference_metrics = makeString("cb-forward-inference-metrics");

    private static final SubLString $$$Forward_Inference_Metrics = makeString("Forward Inference Metrics");

    private static final SubLString $str126$cb_hl_module_summary = makeString("cb-hl-module-summary");

    private static final SubLString $$$HL_Module_Summary = makeString("HL Module Summary");

    private static final SubLString $str128$cb_kct_control_panel = makeString("cb-kct-control-panel");

    private static final SubLString $$$KB_Content_Test_Control_Panel = makeString("KB Content Test Control Panel");

    private static final SubLString $str130$cb_kct_main = makeString("cb-kct-main");

    private static final SubLString $$$KB_Content_Test_Monitor = makeString("KB Content Test Monitor");

    private static final SubLList $list132 = list(makeString("name"), makeString("NL"));

    private static final SubLString $str133$maybe_use_english = makeString("maybe-use-english");

    private static final SubLString $str134$cb_invoke_oe_lexification_wizard = makeString("cb-invoke-oe-lexification-wizard");

    private static final SubLString $$$Lexification_Assistant = makeString("Lexification Assistant");

    private static final SubLString $str136$cb_invoke_sme_lexification_wizard = makeString("cb-invoke-sme-lexification-wizard");

    private static final SubLString $$$Dictionary_Assistant = makeString("Dictionary Assistant");

    private static final SubLString $str138$cb_phrase_structure_parsing = makeString("cb-phrase-structure-parsing");

    private static final SubLString $$$Phrase_Structure_Parse = makeString("Phrase Structure Parse");

    private static final SubLString $str140$cb_view_webstore = makeString("cb-view-webstore");

    private static final SubLString $$$WebStore_Viewer = makeString("WebStore Viewer");

    private static final SubLString $str142$clear_pg_caches = makeString("clear-pg-caches");

    private static final SubLString $$$Clear_Paraphrase_Caches = makeString("Clear Paraphrase Caches");

    private static final SubLString $str144$cb_show_nl_trie = makeString("cb-show-nl-trie");

    private static final SubLString $$$NL_Trie_Browser = makeString("NL Trie Browser");

    private static final SubLList $list146 = list(makeString("name"), makeString("Create"));

    private static final SubLString $str147$cb_create_term = makeString("cb-create-term");

    private static final SubLString $$$Create_Term = makeString("Create Term");

    private static final SubLString $str149$cb_assert = makeString("cb-assert");

    private static final SubLString $$$Assert_Sentence = makeString("Assert Sentence");

    private static final SubLString $str151$cb_restart_precision_suggestor = makeString("cb-restart-precision-suggestor");

    private static final SubLString $$$Precision_Suggestor = makeString("Precision Suggestor");

    private static final SubLList $list153 = list(makeString("name"), makeString("Expert"));

    private static final SubLString $str154$cb_handle_interactor = makeString("cb-handle-interactor");

    private static final SubLString $$$SubL_Interactor = makeString("SubL Interactor");

    private static final SubLString $str156$cb_jstack_trace = makeString("cb-jstack-trace");

    private static final SubLString $$$JRTL_jstack_Trace = makeString("JRTL jstack Trace");

    private static final SubLString $str158$sksi_sks_manager = makeString("sksi-sks-manager");

    private static final SubLString $$$SKS_Manager = makeString("SKS Manager");

    private static final SubLString $str160$sksi_smt = makeString("sksi-smt");

    private static final SubLString $$$Schema_Modeling_Tool = makeString("Schema Modeling Tool");

    private static final SubLString $str162$cb_all_sksi_conjunctive_removals = makeString("cb-all-sksi-conjunctive-removals");

    private static final SubLString $$$All_SKSI_Conjunctive_Removals = makeString("All SKSI Conjunctive Removals");

    private static final SubLString $str164$cb_load_api = makeString("cb-load-api");

    private static final SubLString $$$Load_API_Expressions = makeString("Load API Expressions");

    private static final SubLString $str166$sg_cb_main = makeString("sg-cb-main");

    private static final SubLString $$$Scenario_Generation_Tool = makeString("Scenario Generation Tool");

    private static final SubLString $str168$cb_random_thoughts = makeString("cb-random-thoughts");

    private static final SubLString $$$Random_Thought_Generator = makeString("Random Thought Generator");

    private static final SubLString $str170$cb_classes_display_hierarchy_in_h = makeString("cb-classes-display-hierarchy-in-html");

    private static final SubLString $$$Browse_SubLOOP = makeString("Browse SubLOOP");

    private static final SubLString $str172$cb_uia_forwarding_handler = makeString("cb-uia-forwarding-handler");

    private static final SubLString $$$UIA_Forwarding = makeString("UIA Forwarding");

    private static final SubLString $str174$cyc_nav_clear_el_formulas_cache = makeString("cyc-nav-clear-el-formulas-cache");

    private static final SubLString $$$Clear_EL_Formulas_Cache = makeString("Clear EL Formulas Cache");

    private static final SubLString $str176$plan_finder = makeString("plan-finder");

    private static final SubLString $$$Planner = makeString("Planner");

    private static final SubLString $str178$cb_td_tool = makeString("cb-td-tool");

    private static final SubLString $$$SL2C_Browser = makeString("SL2C Browser");

    private static final SubLString $str180$cb_auxiliary_indices = makeString("cb-auxiliary-indices");

    private static final SubLString $$$Auxiliary_Index_List = makeString("Auxiliary Index List");

    private static final SubLString $str182$cyc_navigator = makeString("cyc-navigator");

    private static final SubLString $$$Navigator = makeString("Navigator");

    private static final SubLString $str184$set_navigator_preferences = makeString("set-navigator-preferences");

    private static final SubLString $$$Navigator_Preferences = makeString("Navigator Preferences");

    private static final SubLString $str186$cb_tools = makeString("cb-tools");

    private static final SubLString $$$Tools = makeString("Tools");

    private static final SubLList $list188 = list(makeString("name"), makeString("Help"));

    private static final SubLString $str189$cb_options = makeString("cb-options");

    private static final SubLString $$$Preferences = makeString("Preferences");

    private static final SubLString $str191$cb_system = makeString("cb-system");

    private static final SubLString $$$System_Information = makeString("System Information");

    private static final SubLString $str193$_cycdoc_toc_html = makeString("/cycdoc/toc.html");

    private static final SubLString $$$Documentation = makeString("Documentation");

    private static final SubLString $str195$cb_login = makeString("cb-login");

    private static final SubLString $$$User_Login = makeString("User Login");

    private static final SubLString $str197$cb_set_password = makeString("cb-set-password");

    private static final SubLString $$$Set_Password = makeString("Set Password");

    private static final SubLString $str199$cb_agenda = makeString("cb-agenda");

    private static final SubLString $$$Agenda_Control = makeString("Agenda Control");

    private static final SubLString $str201$cb_mode = makeString("cb-mode");

    private static final SubLString $$$Communication_Modes = makeString("Communication Modes");

    private static final SubLSymbol XML_TOOLS = makeSymbol("XML-TOOLS");

    private static final SubLList $list204 = list(CHAR_quotation);

    private static final SubLList $list205 = list(CHAR_question);

    private static final SubLString $$$bookmarkedTools = makeString("bookmarkedTools");

    private static final SubLSymbol XML_BOOKMARKED_TOOLS = makeSymbol("XML-BOOKMARKED-TOOLS");

    private static final SubLString $$$history = makeString("history");

    private static final SubLString $$$constants = makeString("constants");

    private static final SubLString $$$constant = makeString("constant");

    private static final SubLString $$$nats = makeString("nats");

    private static final SubLString $$$nat = makeString("nat");

    private static final SubLString $$$assertions = makeString("assertions");

    private static final SubLString $$$assertion = makeString("assertion");

    private static final SubLString $$$sentences = makeString("sentences");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLSymbol XML_HISTORY = makeSymbol("XML-HISTORY");

    private static final SubLString $$$userPreferences = makeString("userPreferences");

    private static final SubLString $$$user = makeString("user");

    private static final SubLString $str220$_S = makeString("~S");



    private static final SubLString $$$variable = makeString("variable");

    private static final SubLString $$$value = makeString("value");

    private static final SubLSymbol XML_USER_PREFERENCES = makeSymbol("XML-USER-PREFERENCES");

    private static final SubLString $$$setUserPreference = makeString("setUserPreference");

    private static final SubLString $$$result = makeString("result");

    private static final SubLSymbol XML_SET_USER_PREFERENCE_VARIABLE = makeSymbol("XML-SET-USER-PREFERENCE-VARIABLE");

    private static final SubLString $$$saveUserPreferences = makeString("saveUserPreferences");

    private static final SubLSymbol XML_SAVE_USER_PREFERENCES = makeSymbol("XML-SAVE-USER-PREFERENCES");

    private static final SubLString $$$resultCount = makeString("resultCount");



    private static final SubLString $$$sublEvaluation = makeString("sublEvaluation");

    private static final SubLString $$$time = makeString("time");

    private static final SubLString $$$evaluatedForm = makeString("evaluatedForm");

    private static final SubLString $$$n = makeString("n");

    private static final SubLSymbol XML_SUBL_EVAL = makeSymbol("XML-SUBL-EVAL");

    private static final SubLString $$$term = makeString("term");

    private static final SubLString $$$Ack = makeString("Ack");

    private static final SubLSymbol JSON_CONTEXT_MENU_DATA = makeSymbol("JSON-CONTEXT-MENU-DATA");



    private static final SubLSymbol $markers = makeKeyword("markers");

    private static final SubLSymbol $bookmarked = makeKeyword("bookmarked");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLSymbol $asserted = makeKeyword("asserted");

    private static final SubLSymbol $modifiable = makeKeyword("modifiable");

    private static final SubLSymbol $rule = makeKeyword("rule");

    private static final SubLSymbol $sym248$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$thereExistVars = reader_make_constant_shell(makeString("thereExistVars"));

    private static final SubLList $list250 = list(makeSymbol("?PROJECT"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list252 = list(reader_make_constant_shell(makeString("annotationSentenceForAssertionForProject")), makeSymbol("?PROJECT"), makeSymbol("?MT"), makeSymbol("?SENTENCE-TEMPLATE"));

    private static final SubLList $list253 = list(reader_make_constant_shell(makeString("displayStringForAnnotationSentenceForProject")), makeSymbol("?PROJECT"), makeSymbol("?SENTENCE-TEMPLATE"), makeSymbol("?STRING"));

    private static final SubLObject $$projectParticipants = reader_make_constant_shell(makeString("projectParticipants"));

    private static final SubLSymbol $sym255$_PROJECT = makeSymbol("?PROJECT");

    private static final SubLList $list256 = list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("GenericKRWorkflowMt")), list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), reader_make_constant_shell(makeString("Now")), reader_make_constant_shell(makeString("TimePoint"))));

    private static final SubLList $list257 = list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("CycLAssertion")));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol $sym259$_MT = makeSymbol("?MT");

    private static final SubLSymbol $sym260$_SENTENCE_TEMPLATE = makeSymbol("?SENTENCE-TEMPLATE");

    private static final SubLSymbol $sym261$_STRING = makeSymbol("?STRING");

    private static final SubLSymbol $termName = makeKeyword("termName");

    private static final SubLSymbol $assertionCount = makeKeyword("assertionCount");

    private static final SubLSymbol $notRenamable = makeKeyword("notRenamable");

    private static final SubLSymbol $mergable = makeKeyword("mergable");

    private static final SubLSymbol $EMPTY_OBJECT = makeKeyword("EMPTY-OBJECT");

    private static final SubLList $list267 = list(makeSymbol("?PROJECT"), makeSymbol("?COLL"));

    private static final SubLList $list268 = list(reader_make_constant_shell(makeString("annotationSentenceForInstancesForProject")), makeSymbol("?PROJECT"), makeSymbol("?MT"), makeSymbol("?SENTENCE-TEMPLATE"), makeSymbol("?COLL"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list270 = list(makeSymbol("?COLL"));

    private static final SubLObject $$TheFocalTerm = reader_make_constant_shell(makeString("TheFocalTerm"));

    private static final SubLSymbol $name = makeKeyword("name");

    private static final SubLList $list273 = list(makeKeyword("items"), NIL);

    private static final SubLSymbol $items = makeKeyword("items");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLSymbol $id = makeKeyword("id");

    private static final SubLSymbol $sentence = makeKeyword("sentence");

    private static final SubLSymbol $icon = makeKeyword("icon");

    private static final SubLSymbol $disabled = makeKeyword("disabled");

    private static final SubLString $$$known = makeString("known");

    private static final SubLString $$$assert = makeString("assert");

    public static SubLObject xml_login(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject user_name_string = string_utilities.trim_whitespace(html_extract_input($$$userName, args));
            final SubLObject dwimmed_cyclist = cb_system_tools.dwim_cyclist_name_to_cyclist(user_name_string);
            final SubLObject user_name = (NIL != operation_communication.image_requires_authenticationP()) ? user_name_string : NIL != dwimmed_cyclist ? kb_paths.fort_name(dwimmed_cyclist) : user_name_string;
            final SubLObject password = html_extract_input($$$password, args);
            SubLObject login_result = cb_system_tools.cyc_login(user_name, password);
            SubLObject session_id = NIL;
            SubLObject html_state = NIL;
            if (user_name.equal($$$Guest)) {
                operation_communication.set_the_cyclist($$$Guest);
                login_result = $SUCCESS;
            }
            if (login_result == $SUCCESS) {
                session_id = web_utilities.make_html_cyc_login_session();
                html_state = html_kernel.html_machine_state(session_id);
            }
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$login, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        if (NIL != user_name) {
                            try {
                                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$userName, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_utilities.xml_markup(user_name);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$userName);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        if (NIL != session_id) {
                            try {
                                final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$sessionId, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_utilities.xml_markup(session_id);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$sessionId);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$Result, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(login_result));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$Result);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$login);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_logout(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject http_state_key = html_kernel.http_state_key_for_request();
            final SubLObject logout_result = (NIL != html_kernel.clear_html_state_for_machine(http_state_key)) ? $SUCCESS : $FAILURE;
            web_utilities.destroy_cyc_login_session(http_state_key);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$logout, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$Result, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(logout_result));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$Result);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$logout);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_server_defaults(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$cycServerDefaults, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$defaultCyclist, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    if (NIL != constant_p(operation_communication.the_cyclist())) {
                                        xml_utilities.xml_markup(constants_high.constant_name(operation_communication.the_cyclist()));
                                    } else {
                                        xml_utilities.xml_markup(operation_communication.the_cyclist());
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$defaultCyclist);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$cycServerDefaults);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_server_status(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject fastP = html_extract_input($$$fast, args);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$cycServerStatus, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$32 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$hostName, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(Environment.get_machine_name($$$unknown));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$32, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$hostName);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$basePort, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, system_parameters.$base_tcp_port$.getDynamicValue(thread));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$basePort);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$agendaMode, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(operation_communication.communication_mode()));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$agendaMode);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$agendaModeString, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(operation_communication.communication_mode_name(operation_communication.communication_mode()));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$agendaModeString);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$agendaState, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(agenda.agenda_state());
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$agendaState);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$kbBaseNum, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, kb_loaded());
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$kbBaseNum);
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$39 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$kbNum, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str28$_d__d, kb_loaded(), operation_communication.kb_op_number());
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$39, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values7 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$kbNum);
                                restoreValuesFromVector(_values7);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cycRevisionString, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(system_info.cyc_revision_string());
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$40, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$cycRevisionString);
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$remoteQueue, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$processedCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_communication.kb_op_number());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$58, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values9 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$processedCount);
                                            restoreValuesFromVector(_values9);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$61 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$pendingCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$62 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_queues.remote_queue_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$43, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$61, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values10 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$pendingCount);
                                            restoreValuesFromVector(_values10);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                        }
                                    }
                                    if (NIL == fastP) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$totalCount, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, transcript_utilities.total_master_transcript_operations(UNPROVIDED));
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$44, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$64, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values11 = getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal($$$totalCount);
                                                restoreValuesFromVector(_values11);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$56, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values12 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$remoteQueue);
                                restoreValuesFromVector(_values12);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$68 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$localQueue, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$69 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$70 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$processedCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$71 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_queues.local_operation_storage_queue_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$71, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$46, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$70, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values13 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$processedCount);
                                            restoreValuesFromVector(_values13);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$47 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$pendingCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_queues.local_queue_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$74, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$47, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$73, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values14 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$pendingCount);
                                            restoreValuesFromVector(_values14);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$pendingDiskWriteCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_queues.transcript_queue_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$77, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$48, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$76, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values15 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$pendingDiskWriteCount);
                                            restoreValuesFromVector(_values15);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$79 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$totalCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$80 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, add(operation_queues.local_operation_storage_queue_size(), operation_queues.local_queue_size()));
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$80, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$49, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$79, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values16 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$totalCount);
                                            restoreValuesFromVector(_values16);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$69, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$45, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$68, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values17 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$localQueue);
                                restoreValuesFromVector(_values17);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$83 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$auxQueue, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$85 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$processedCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_communication.total_auxiliary_operations_run());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$86, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$51, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$85, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values18 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$processedCount);
                                            restoreValuesFromVector(_values18);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$88 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$52 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$pendingCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$89 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_queues.auxiliary_queue_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$89, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$52, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$88, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values19 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$pendingCount);
                                            restoreValuesFromVector(_values19);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$totalCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, add(operation_communication.total_auxiliary_operations_run(), operation_queues.auxiliary_queue_size()));
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$53, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values20 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$totalCount);
                                            restoreValuesFromVector(_values20);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$84, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$50, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$83, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values21 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$auxQueue);
                                restoreValuesFromVector(_values21);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$transmitQueue, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$97 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$transmitQueueSize, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$98 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str22$_d, operation_queues.transmit_queue_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$98, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$55, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$97, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values22 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$transmitQueueSize);
                                            restoreValuesFromVector(_values22);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$54, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values23 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$transmitQueue);
                                restoreValuesFromVector(_values23);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$56 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$userActions, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$57 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$actionsPendingCount, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, user_actions.user_actions_size());
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$57, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$103, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values24 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$actionsPendingCount);
                                            restoreValuesFromVector(_values24);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$56, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values25 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$userActions);
                                restoreValuesFromVector(_values25);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$107 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$58 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$users, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = html_kernel.html_interface_users();
                                    SubLObject a_user = NIL;
                                    a_user = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = a_user;
                                        SubLObject machine_name = NIL;
                                        SubLObject user_name = NIL;
                                        destructuring_bind_must_consp(current, datum, $list43);
                                        machine_name = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list43);
                                        user_name = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            final SubLObject session_id = (NIL != web_utilities.current_html_cyc_login_session_idP(machine_name)) ? machine_name : NIL;
                                            SubLObject youP = NIL;
                                            if (NIL != session_id) {
                                                machine_name = web_utilities.cyc_login_session_id_machine_name(session_id);
                                            }
                                            youP = equal(machine_name, html_kernel.http_state_key_for_request());
                                            xml_utilities.xml_terpri();
                                            try {
                                                final SubLObject _prev_bind_0_$109 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$userInfo, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        xml_utilities.xml_terpri();
                                                        try {
                                                            final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$userName, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, user_name);
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$60, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values26 = getValuesAsVector();
                                                                xml_utilities.xml_end_tag_internal($$$userName);
                                                                restoreValuesFromVector(_values26);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                                            }
                                                        }
                                                        xml_utilities.xml_terpri();
                                                        try {
                                                            final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$machineName, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, machine_name);
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$61, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values27 = getValuesAsVector();
                                                                xml_utilities.xml_end_tag_internal($$$machineName);
                                                                restoreValuesFromVector(_values27);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                                            }
                                                        }
                                                        if (NIL != session_id) {
                                                            xml_utilities.xml_terpri();
                                                            try {
                                                                final SubLObject _prev_bind_0_$117 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$sessionId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$118 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, session_id);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$118, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$62, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$117, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values28 = getValuesAsVector();
                                                                    xml_utilities.xml_end_tag_internal($$$sessionId);
                                                                    restoreValuesFromVector(_values28);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                                                                }
                                                            }
                                                        }
                                                        if (NIL != youP) {
                                                            xml_utilities.xml_terpri();
                                                            try {
                                                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$you, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        xml_utilities.xml_print($$$yes, UNPROVIDED);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$63, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$120, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values29 = getValuesAsVector();
                                                                    xml_utilities.xml_end_tag_internal($$$you);
                                                                    restoreValuesFromVector(_values29);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$110, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$59, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$109, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$123 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values30 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$userInfo);
                                                    restoreValuesFromVector(_values30);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list43);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        a_user = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$108, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$58, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$107, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values31 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$users);
                                restoreValuesFromVector(_values31);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$125 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values32 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$cycServerStatus);
                    restoreValuesFromVector(_values32);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject valid_cb_command_string_p(final SubLObject url) {
        return function_spec_p(intern(Strings.string_upcase(string_utilities.substring(url, ZERO_INTEGER, position(CHAR_ampersand, url, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject xml_html_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal($$$item, list($$$id, url, $$$type, $$$html, $$$name, name), T, NIL, $UNINITIALIZED);
            final SubLObject _prev_bind_0_$157 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$157, thread);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_tool_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_cb_command_string_p(url)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$item, list($$$id, url, $$$type, $$$subl, $$$name, name), T, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$158 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$158, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_nav_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_cb_command_string_p(url)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$item, list($$$id, url, $$$type, $$$subl, $$$name, name), T, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$159 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$159, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_bookmarked_tool_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_cb_command_string_p(url)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$item, list($$$id, url, $$$type, $$$subl, $$$name, name), T, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$160 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$160, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_bookmarked_html_item(final SubLObject url, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal($$$item, list($$$id, url, $$$type, $$$html, $$$name, name), T, NIL, $UNINITIALIZED);
            final SubLObject _prev_bind_0_$161 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$161, thread);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_item_separator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal($$$item, list($$$type, $$$separator), T, NIL, $UNINITIALIZED);
            final SubLObject _prev_bind_0_$162 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$162, thread);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_tools(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$163 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$toolList, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$164 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$165 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$166 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list58, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$166 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_tool_item($str59$ke_compose, $$$Compose_KE_Text);
                                    xml_tool_item($str61$ke_name_file, $$$Load_KE_File);
                                    xml_item_separator();
                                    xml_tool_item($str63$cb_load_transcript, $$$Load_Transcript);
                                    xml_tool_item($str65$cb_transcript_viewer, $$$View_Transcript);
                                    xml_item_separator();
                                    xml_tool_item($str67$cb_owl_import, $$$OWL_Import);
                                    xml_tool_item($str69$cb_owl_export, $$$OWL_Export);
                                    xml_item_separator();
                                    xml_tool_item($str71$cb_partition_load, $$$Load_Partition);
                                    xml_tool_item($str73$cb_partition_save, $$$Save_Partition);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$166, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$166, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$165, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$167 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$168 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$167 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list75, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$169 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_tool_item($str76$cb_history, $$$History);
                                    xml_nav_item($str78$cb_recent_kb_additions, $$$Recently_Added_KB_Content);
                                    xml_item_separator();
                                    xml_tool_item($str80$cb_find_assertion, $$$Find_Assertion);
                                    xml_tool_item($str82$cb_index_overlap, $$$Index_Overlap);
                                    xml_item_separator();
                                    xml_tool_item($str84$hb_start, $$$Hierarchy_Browser);
                                    xml_nav_item($str86$st_similarity_entrance, $$$Similarity_Tool);
                                    xml_tool_item($str88$get_suggested_followups, $$$Followup_Term_Suggestor);
                                    xml_tool_item($str90$cb_gaf_suggestor, $$$GAF_Suggestor);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$169, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$167, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$168, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$170 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$171 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$168 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list92, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$172 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_tool_item($str93$cb_query, $$$Query_Tool);
                                    xml_item_separator();
                                    xml_tool_item($str95$cb_show_when, $$$When_Tool);
                                    xml_tool_item($str97$test_taking_tool, $str98$Test_Taking_Tool);
                                    xml_tool_item($str99$cb_rtv, $$$relatedToVia_Tool);
                                    xml_item_separator();
                                    xml_nav_item($str101$cb_disjointness_preliminary_scree, $$$Disjointness_Tool);
                                    xml_tool_item($str103$cb_handle_query_search, $$$Query_Search);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$172, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$168, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$171, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$173 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$174 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$169 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list105, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$175 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_nav_item($str106$cb_latest_inference, $$$Latest_Inference);
                                    xml_nav_item($str108$cb_all_inferences, $$$All_Inferences);
                                    xml_nav_item($str110$cb_all_problem_stores, $$$All_Problem_Stores);
                                    xml_item_separator();
                                    xml_tool_item($str112$cb_forward_inference_browser, $$$Forward_Inference_Browser);
                                    xml_tool_item($str114$cb_forward_propagate_mt, $$$Forward_Propagate_Mt);
                                    xml_item_separator();
                                    xml_tool_item($str116$cb_wff, $$$WFF_Check);
                                    xml_item_separator();
                                    xml_tool_item($str118$cb_hypothesize_handler, $$$Hypothesize);
                                    xml_tool_item($str120$cb_hc, $$$Hypothesis_Corroboration_Tool);
                                    xml_item_separator();
                                    xml_nav_item($str122$cb_transformation_rule_statistics, $$$Experience_Control_Panel);
                                    xml_nav_item($str124$cb_forward_inference_metrics, $$$Forward_Inference_Metrics);
                                    xml_nav_item($str126$cb_hl_module_summary, $$$HL_Module_Summary);
                                    xml_item_separator();
                                    xml_tool_item($str128$cb_kct_control_panel, $$$KB_Content_Test_Control_Panel);
                                    xml_tool_item($str130$cb_kct_main, $$$KB_Content_Test_Monitor);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$175, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$169, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$174, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$176 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$176, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$177 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$170 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list132, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$178 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_nav_item($str133$maybe_use_english, cyc_navigator_internals.maybe_use_english_text());
                                    xml_tool_item($str134$cb_invoke_oe_lexification_wizard, $$$Lexification_Assistant);
                                    xml_tool_item($str136$cb_invoke_sme_lexification_wizard, $$$Dictionary_Assistant);
                                    xml_tool_item($str138$cb_phrase_structure_parsing, $$$Phrase_Structure_Parse);
                                    xml_tool_item($str140$cb_view_webstore, $$$WebStore_Viewer);
                                    xml_nav_item($str142$clear_pg_caches, $$$Clear_Paraphrase_Caches);
                                    xml_tool_item($str144$cb_show_nl_trie, $$$NL_Trie_Browser);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$178, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$170, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$177, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$180 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$171 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list146, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$181 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_tool_item($str147$cb_create_term, $$$Create_Term);
                                    xml_tool_item($str149$cb_assert, $$$Assert_Sentence);
                                    xml_tool_item($str151$cb_restart_precision_suggestor, $$$Precision_Suggestor);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$181, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$171, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$180, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$182 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$183 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$172 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list153, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$184 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_nav_item($str154$cb_handle_interactor, $$$SubL_Interactor);
                                    xml_nav_item($str156$cb_jstack_trace, $$$JRTL_jstack_Trace);
                                    xml_item_separator();
                                    xml_tool_item($str158$sksi_sks_manager, $$$SKS_Manager);
                                    xml_tool_item($str160$sksi_smt, $$$Schema_Modeling_Tool);
                                    xml_nav_item($str162$cb_all_sksi_conjunctive_removals, $$$All_SKSI_Conjunctive_Removals);
                                    xml_item_separator();
                                    xml_nav_item($str164$cb_load_api, $$$Load_API_Expressions);
                                    xml_item_separator();
                                    xml_tool_item($str166$sg_cb_main, $$$Scenario_Generation_Tool);
                                    xml_tool_item($str168$cb_random_thoughts, $$$Random_Thought_Generator);
                                    xml_item_separator();
                                    xml_tool_item($str170$cb_classes_display_hierarchy_in_h, $$$Browse_SubLOOP);
                                    xml_tool_item($str172$cb_uia_forwarding_handler, $$$UIA_Forwarding);
                                    xml_nav_item($str174$cyc_nav_clear_el_formulas_cache, $$$Clear_EL_Formulas_Cache);
                                    xml_tool_item($str176$plan_finder, $$$Planner);
                                    xml_tool_item($str178$cb_td_tool, $$$SL2C_Browser);
                                    xml_nav_item($str180$cb_auxiliary_indices, $$$Auxiliary_Index_List);
                                    xml_nav_item($str182$cyc_navigator, $$$Navigator);
                                    xml_nav_item($str184$set_navigator_preferences, $$$Navigator_Preferences);
                                    xml_nav_item($str186$cb_tools, $$$Tools);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$184, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$172, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$183, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$185 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values7 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values7);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$185, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$186 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$173 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$category, $list188, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$187 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_tool_item($str189$cb_options, $$$Preferences);
                                    xml_nav_item($str191$cb_system, $$$System_Information);
                                    xml_item_separator();
                                    xml_html_item($str193$_cycdoc_toc_html, $$$Documentation);
                                    xml_item_separator();
                                    xml_nav_item($str195$cb_login, $$$User_Login);
                                    xml_tool_item($str197$cb_set_password, $$$Set_Password);
                                    xml_item_separator();
                                    xml_nav_item($str199$cb_agenda, $$$Agenda_Control);
                                    xml_nav_item($str201$cb_mode, $$$Communication_Modes);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$187, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$173, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$186, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$188 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$category);
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$164, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$163, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$189 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values9 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$toolList);
                    restoreValuesFromVector(_values9);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$189, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_bookmarked_tool_url_hack(final SubLObject tool_link_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind(NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                funcall(tool_link_method);
                output_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$198 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                }
            }
        } finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        output_string = second(string_utilities.string_tokenize(output_string, $list204, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL != position(CHAR_question, output_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            output_string = second(string_utilities.string_tokenize(output_string, $list205, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return output_string;
    }

    public static SubLObject xml_bookmarked_tools(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$199 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$bookmarkedTools, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$200 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = cb_frames.user_toolbar_links();
                        SubLObject tool = NIL;
                        tool = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (cb_link_method(tool).isFunctionSpec()) {
                                final SubLObject tool_url_hack = xml_bookmarked_tool_url_hack(cb_link_method(tool));
                                xml_utilities.xml_terpri();
                                if (CHAR_slash.eql(Strings.sublisp_char(tool_url_hack, ZERO_INTEGER))) {
                                    xml_bookmarked_html_item(tool_url_hack, cb_tool_abbreviation(tool));
                                } else {
                                    xml_bookmarked_tool_item(tool_url_hack, cb_tool_abbreviation(tool));
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            tool = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$200, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$199, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$201 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$bookmarkedTools);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_history(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$202 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$history, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$203 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$204 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$205 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$constants, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$205 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_constant_history_items();
                                    SubLObject constant = NIL;
                                    constant = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$206 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$206 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$constant, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$207 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, constants_high.constant_name(constant));
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$207, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$206, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$206, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$208 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal($$$constant);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        constant = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$205, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$205, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$204, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$209 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$constants);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$210 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$207 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$nats, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$211 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_nat_history_items();
                                    SubLObject nat = NIL;
                                    nat = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$212 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$208 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$nat, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$213 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, NIL != nart_handles.nart_p(nat) ? narts_high.nart_el_formula(nat) : nat);
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$213, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$208, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$212, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$214 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal($$$nat);
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$214, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        nat = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$211, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$207, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$210, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$215 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$nats);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$215, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$216 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$209 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$assertions, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$217 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_assertion_history_items();
                                    SubLObject assertion = NIL;
                                    assertion = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$218 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$210 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$assertion, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$219 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, uncanonicalizer.assertion_el_ist_formula(assertion));
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$219, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$210, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$218, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$220 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values5 = getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal($$$assertion);
                                                restoreValuesFromVector(_values5);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$220, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$217, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$209, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$216, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$221 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$assertions);
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$221, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$222 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$211 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$sentences, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$223 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = cb_tools.cb_sentence_history_items();
                                    SubLObject sentence = NIL;
                                    sentence = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        try {
                                            final SubLObject _prev_bind_0_$224 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$212 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$sentence, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$225 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, cycl_utilities.hl_to_el(sentence));
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$225, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$212, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$224, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$226 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values7 = getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal($$$sentence);
                                                restoreValuesFromVector(_values7);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$226, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        sentence = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$223, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$211, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$222, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$227 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$sentences);
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$227, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$203, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$202, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$228 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values9 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$history);
                    restoreValuesFromVector(_values9);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_user_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$237 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$userPreferences, list($$$user, kb_paths.fort_name(operation_communication.the_cyclist())), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$238 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = $html_interface_variables$.getGlobalValue();
                        SubLObject var = NIL;
                        var = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            xml_utilities.xml_terpri();
                            if (var.isSymbol()) {
                                final SubLObject value = eval(var);
                                final SubLObject printed_value = format(NIL, $str220$_S, value);
                                thread.resetMultipleValues();
                                final SubLObject re_read_value = read_from_string_ignoring_errors(printed_value, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                final SubLObject error = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((!error.eql($ERROR)) && re_read_value.equal(value)) {
                                    try {
                                        final SubLObject _prev_bind_0_$239 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$240 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$variable, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$240 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                xml_utilities.xml_terpri();
                                                try {
                                                    final SubLObject _prev_bind_0_$241 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$241 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$name, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$242 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, var);
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$242, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$241, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$241, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$243 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        xml_utilities.xml_end_tag_internal($$$name);
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$243, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                try {
                                                    final SubLObject _prev_bind_0_$244 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$242 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$value, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$245 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            xml_utilities.xml_cdata(printed_value);
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$245, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$242, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$244, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$246 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        xml_utilities.xml_end_tag_internal($$$value);
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$246, thread);
                                                    }
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$240, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$240, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$239, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$247 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$variable);
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$247, thread);
                                        }
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            var = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$238, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$237, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$248 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$userPreferences);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$248, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_set_user_preference_variable(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject name_string = string_utilities.trim_whitespace(html_extract_input($$$name, args));
            final SubLObject name_symbol = read_from_string_ignoring_errors(name_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject values_string = string_utilities.trim_whitespace(html_extract_input($$$value, args));
            final SubLObject value = (NIL != xml_parsing_utilities.xml_cdata_tagP(values_string)) ? read_from_string_ignoring_errors(xml_parsing_utilities.xml_cdata_tag_text(values_string), NIL, NIL, UNPROVIDED, UNPROVIDED) : values_string;
            final SubLObject setP = makeBoolean((NIL != boundp(name_symbol)) && (NIL != member(name_symbol, $html_interface_variables$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
            if (NIL != setP) {
                set(name_symbol, value);
            }
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$252 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$setUserPreference, list($$$user, kb_paths.fort_name(operation_communication.the_cyclist())), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$253 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$254 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$255 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$result, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$255 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.string_from_keyword(NIL != setP ? $SUCCESS : $FAILURE));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$255, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$255, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$254, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$256 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$result);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$256, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$257 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$256 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$variable, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$258 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$259 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$257 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$name, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$260 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$_a, name_symbol);
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$260, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$257, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$259, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$261 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$name);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$261, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$262 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$258 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$value, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$263 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                xml_utilities.xml_cdata(format(NIL, $str220$_S, value));
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$263, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$258, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$262, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$264 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$value);
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$264, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$258, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$256, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$257, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$265 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$variable);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$265, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$253, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$252, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$266 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$setUserPreference);
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$266, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_save_user_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
        xml_utilities.xml_terpri();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$saveUserPreferences, list($$$user, kb_paths.fort_name(operation_communication.the_cyclist())), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$271 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    try {
                        final SubLObject _prev_bind_0_$272 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$273 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$result, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$273 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                xml_utilities.xml_markup(string_utilities.string_from_keyword(NIL != cb_tools.cb_save_interface_state() ? $SUCCESS : $FAILURE));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$273, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$273, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$272, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$274 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_end_tag_internal($$$result);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$274, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$271, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$saveUserPreferences);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_subl_eval(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject result_count_string = html_extract_input($$$resultCount, args);
            final SubLObject result_count = (result_count_string.isString() && (NIL != subl_promotions.positive_integer_p(read_from_string_ignoring_errors(string_utilities.trim_whitespace(result_count_string), NIL, NIL, UNPROVIDED, UNPROVIDED)))) ? read_from_string_ignoring_errors(string_utilities.trim_whitespace(result_count_string), NIL, NIL, UNPROVIDED, UNPROVIDED) : NIL;
            final SubLObject subl_string = string_utilities.trim_whitespace(html_extract_input($$$subl, args));
            final SubLObject subl = read_from_string_ignoring_errors(subl_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
            final SubLObject start_time = get_internal_real_time();
            SubLObject actual_time = NIL;
            SubLObject result = NIL;
            SubLObject result2 = NIL;
            SubLObject result3 = NIL;
            SubLObject result4 = NIL;
            SubLObject result5 = NIL;
            final SubLObject datum_evaluated_var = eval_in_api.cyc_api_eval(list(MULTIPLE_VALUE_LIST, subl));
            result = datum_evaluated_var.first();
            result2 = cadr(datum_evaluated_var);
            result3 = cddr(datum_evaluated_var).first();
            result4 = cadr(cddr(datum_evaluated_var));
            result5 = cddr(cddr(datum_evaluated_var)).first();
            actual_time = floor(multiply(numeric_date_utilities.$microseconds_in_a_second$.getGlobalValue(), numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(numeric_date_utilities.elapsed_internal_real_time(start_time, get_internal_real_time()))), UNPROVIDED);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            try {
                final SubLObject _prev_bind_0_$276 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$sublEvaluation, list($$$time, actual_time), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$277 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$278 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$279 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$evaluatedForm, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$279 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_cdata(format(NIL, $str220$_S, subl));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$279, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$279, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$278, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$280 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$evaluatedForm);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$280, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$281 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$280 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$result, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$282 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_cdata(format(NIL, $str220$_S, result));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$282, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$280, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$281, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$283 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$result);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$283, thread);
                            }
                        }
                        if (NIL != subl_promotions.positive_integer_p(result_count)) {
                            SubLObject list_var = NIL;
                            SubLObject another_result = NIL;
                            SubLObject n = NIL;
                            list_var = list(result2, result3, result4, result5);
                            another_result = list_var.first();
                            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , another_result = list_var.first() , n = add(ONE_INTEGER, n)) {
                                if (result_count.numG(add(n, ONE_INTEGER))) {
                                    xml_utilities.xml_terpri();
                                    try {
                                        final SubLObject _prev_bind_0_$284 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$281 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$result, list($$$n, add(n, ONE_INTEGER)), NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$285 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                xml_utilities.xml_cdata(format(NIL, $str220$_S, another_result));
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$285, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$281, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$284, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$286 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            xml_utilities.xml_end_tag_internal($$$result);
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$286, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$277, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$276, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$287 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$sublEvaluation);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$287, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject json_context_menu_data(final SubLObject args) {
        if (NIL != html_extract_input($$$term, args)) {
            return json_term_context_menu_data(args);
        }
        if (NIL != html_extract_input($$$assertion, args)) {
            return json_assertion_context_menu_data(args);
        }
        Errors.error($$$Ack);
        return NIL;
    }

    public static SubLObject json_assertion_context_menu_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding(thread);
        try {
            json.$json_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject assertion = cb_guess_term(html_extract_input($$$assertion, args), UNPROVIDED);
            final SubLObject user = api_control_vars.$the_cyclist$.getDynamicValue(thread);
            SubLObject v_json = NIL;
            thread.resetMultipleValues();
            final SubLObject sentences = user_assertion_meta_assertion_sentences(user, assertion);
            final SubLObject descriptions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_json = putf(v_json, $markers, meta_assertion_marker_data(sentences, descriptions));
            v_json = putf(v_json, $bookmarked, NIL != cb_web_services.currently_bookmarkedP(assertion, UNPROVIDED) ? $$True : $$False);
            v_json = putf(v_json, $asserted, NIL != assertions_high.asserted_assertionP(assertion) ? $$True : $$False);
            v_json = putf(v_json, $modifiable, NIL != cb_assertion_editor.assertion_modification_permittedP(assertion) ? $$True : $$False);
            v_json = putf(v_json, $rule, NIL != assertions_high.rule_assertionP(assertion) ? $$True : $$False);
            json.json_serialize(v_json);
            return v_json;
        } finally {
            json.$json_stream$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject user_assertion_meta_assertion_sentences(final SubLObject user, final SubLObject assertion) {
        final SubLObject query_results = inference_kernel.new_cyc_query(list($$thereExistVars, $list250, list($$and, $list252, $list253, list($$projectParticipants, $sym255$_PROJECT, user))), $list256, UNPROVIDED);
        SubLObject sentences = NIL;
        SubLObject display_strings = NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentences = cons(subst(assertions_high.assertion_ist_sentence(assertion), $list257, list($$ist, bindings.variable_binding_value(bindings.get_variable_binding($sym259$_MT, binding_set)), bindings.variable_binding_value(bindings.get_variable_binding($sym260$_SENTENCE_TEMPLATE, binding_set))), symbol_function(EQUAL), UNPROVIDED), sentences);
            display_strings = cons(bindings.variable_binding_value(bindings.get_variable_binding($sym261$_STRING, binding_set)), display_strings);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return values(sentences, display_strings);
    }

    public static SubLObject json_term_context_menu_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding(thread);
        try {
            json.$json_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject v_term = cb_guess_fort(html_extract_input($$$term, args), UNPROVIDED);
            SubLObject v_json = list($termName, cycl_utilities.denotational_term_name(v_term));
            if (NIL != cb_web_services.currently_bookmarkedP(v_term, UNPROVIDED)) {
                v_json = putf(v_json, $bookmarked, $$True);
            }
            if (NIL == cb_editor.term_modification_forbiddenP(v_term)) {
                v_json = putf(v_json, $modifiable, $$True);
                v_json = putf(v_json, $assertionCount, kb_indexing.num_index(v_term));
            }
            if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
                v_json = putf(v_json, $notRenamable, $$True);
            }
            if ((NIL == cb_editor.term_modification_forbiddenP(v_term)) && (NIL != cb_editor.term_as_merge_source_permittedP(v_term))) {
                v_json = putf(v_json, $mergable, $$True);
            }
            thread.resetMultipleValues();
            final SubLObject sentences = user_term_meta_assertion_sentences(api_control_vars.$the_cyclist$.getDynamicValue(thread), v_term);
            final SubLObject descriptions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sentences) {
                v_json = putf(v_json, $markers, meta_assertion_marker_data(sentences, descriptions));
            }
            json.json_serialize(NIL != v_json ? v_json : $EMPTY_OBJECT);
        } finally {
            json.$json_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject user_term_meta_assertion_sentences(final SubLObject user, final SubLObject v_term) {
        final SubLObject query_results = inference_kernel.new_cyc_query(list($$thereExistVars, $list267, list($$and, $list268, listS($$isa, v_term, $list270), $list253, list($$projectParticipants, $sym255$_PROJECT, user))), $list256, UNPROVIDED);
        SubLObject sentences = NIL;
        SubLObject display_strings = NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentences = cons(subst(v_term, $$TheFocalTerm, list($$ist, bindings.variable_binding_value(bindings.get_variable_binding($sym259$_MT, binding_set)), bindings.variable_binding_value(bindings.get_variable_binding($sym260$_SENTENCE_TEMPLATE, binding_set))), symbol_function(EQUAL), UNPROVIDED), sentences);
            display_strings = cons(bindings.variable_binding_value(bindings.get_variable_binding($sym261$_STRING, binding_set)), display_strings);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return values(sentences, display_strings);
    }

    public static SubLObject meta_assertion_marker_data(final SubLObject sentences, final SubLObject descriptions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject markers = NIL;
        SubLObject n = ZERO_INTEGER;
        SubLObject sentence = NIL;
        SubLObject sentence_$291 = NIL;
        SubLObject description = NIL;
        SubLObject description_$292 = NIL;
        sentence = sentences;
        sentence_$291 = sentence.first();
        description = descriptions;
        description_$292 = description.first();
        while ((NIL != description) || (NIL != sentence)) {
            final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                final SubLObject decontextualized = cycl_utilities.formula_arg2(sentence_$291, UNPROVIDED);
                final SubLObject pred = cycl_utilities.formula_arg0(decontextualized);
                final SubLObject pred_indicator = make_keyword(cycl_utilities.denotational_term_name(pred));
                final SubLObject current_value_for_pred = getf(markers, pred_indicator, listS($name, cycl_utilities.denotational_term_name(pred), $list273));
                SubLObject items = getf(current_value_for_pred, $items, UNPROVIDED);
                final SubLObject knownP = ask_utilities.query_boolean(decontextualized, $$InferencePSC, UNPROVIDED);
                final SubLObject assertion = czer_meta.find_visible_assertion_cycl(decontextualized, $$InferencePSC);
                final SubLObject assertedP = list_utilities.sublisp_boolean(assertion);
                final SubLObject unassertable_assertionP = makeBoolean((NIL != assertedP) && (NIL == assertions_high.asserted_assertionP(assertion)));
                final SubLObject final_sentence = (NIL != knownP) ? list($$unknownSentence, sentence_$291) : sentence_$291;
                SubLObject marker_data = list($id, kb_utilities.compact_hl_external_id_string(final_sentence), $name, description_$292, $sentence, format_nil.format_nil_s(cycl_utilities.hl_to_el(final_sentence)));
                if (NIL != assertion) {
                    marker_data = putf(marker_data, $icon, Strings.string_downcase(format_nil.format_nil_a(assertion_marker(assertion)), UNPROVIDED, UNPROVIDED));
                } else
                    if (NIL != unassertable_assertionP) {
                        marker_data = putf(marker_data, $disabled, $$True);
                    } else
                        if ((NIL == assertedP) && (NIL != knownP)) {
                            marker_data = putf(marker_data, $icon, $$$known);
                        }


                items = putf(items, make_keyword(cconcatenate($$$assert, format_nil.format_nil_a_no_copy(n))), marker_data);
                markers = putf(markers, pred_indicator, list($name, cycl_utilities.denotational_term_name(pred), $items, items));
                n = add(n, ONE_INTEGER);
            } finally {
                $print_pretty$.rebind(_prev_bind_0, thread);
            }
            sentence = sentence.rest();
            sentence_$291 = sentence.first();
            description = description.rest();
            description_$292 = description.first();
        } 
        return markers;
    }

    public static SubLObject declare_web_services_browser_file() {
        declareFunction("xml_login", "XML-LOGIN", 0, 1, false);
        declareFunction("xml_logout", "XML-LOGOUT", 0, 1, false);
        declareFunction("xml_server_defaults", "XML-SERVER-DEFAULTS", 0, 1, false);
        declareFunction("xml_server_status", "XML-SERVER-STATUS", 0, 1, false);
        declareFunction("valid_cb_command_string_p", "VALID-CB-COMMAND-STRING-P", 1, 0, false);
        declareFunction("xml_html_item", "XML-HTML-ITEM", 2, 0, false);
        declareFunction("xml_tool_item", "XML-TOOL-ITEM", 2, 0, false);
        declareFunction("xml_nav_item", "XML-NAV-ITEM", 2, 0, false);
        declareFunction("xml_bookmarked_tool_item", "XML-BOOKMARKED-TOOL-ITEM", 2, 0, false);
        declareFunction("xml_bookmarked_html_item", "XML-BOOKMARKED-HTML-ITEM", 2, 0, false);
        declareFunction("xml_item_separator", "XML-ITEM-SEPARATOR", 0, 0, false);
        declareFunction("xml_tools", "XML-TOOLS", 0, 1, false);
        declareFunction("xml_bookmarked_tool_url_hack", "XML-BOOKMARKED-TOOL-URL-HACK", 1, 0, false);
        declareFunction("xml_bookmarked_tools", "XML-BOOKMARKED-TOOLS", 0, 1, false);
        declareFunction("xml_history", "XML-HISTORY", 0, 1, false);
        declareFunction("xml_user_preferences", "XML-USER-PREFERENCES", 0, 1, false);
        declareFunction("xml_set_user_preference_variable", "XML-SET-USER-PREFERENCE-VARIABLE", 0, 1, false);
        declareFunction("xml_save_user_preferences", "XML-SAVE-USER-PREFERENCES", 0, 1, false);
        declareFunction("xml_subl_eval", "XML-SUBL-EVAL", 0, 1, false);
        declareFunction("json_context_menu_data", "JSON-CONTEXT-MENU-DATA", 1, 0, false);
        declareFunction("json_assertion_context_menu_data", "JSON-ASSERTION-CONTEXT-MENU-DATA", 1, 0, false);
        declareFunction("user_assertion_meta_assertion_sentences", "USER-ASSERTION-META-ASSERTION-SENTENCES", 2, 0, false);
        declareFunction("json_term_context_menu_data", "JSON-TERM-CONTEXT-MENU-DATA", 1, 0, false);
        declareFunction("user_term_meta_assertion_sentences", "USER-TERM-META-ASSERTION-SENTENCES", 2, 0, false);
        declareFunction("meta_assertion_marker_data", "META-ASSERTION-MARKER-DATA", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_web_services_browser_file() {
        return NIL;
    }

    public static SubLObject setup_web_services_browser_file() {
        html_macros.note_cgi_handler_function(XML_LOGIN, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_LOGOUT, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SERVER_DEFAULTS, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SERVER_STATUS, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_TOOLS, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_BOOKMARKED_TOOLS, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_HISTORY, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_USER_PREFERENCES, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SET_USER_PREFERENCE_VARIABLE, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SAVE_USER_PREFERENCES, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SUBL_EVAL, $XML_HANDLER);
        html_macros.note_cgi_handler_function(JSON_CONTEXT_MENU_DATA, $JSON_HANDLER);
        return NIL;
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




























































































































































































































































































    }
}

/**
 * Total time: 13850 ms
 */
