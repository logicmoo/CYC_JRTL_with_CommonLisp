package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.cb_assertion_editor;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.cb_tools;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.cb_editor;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query_browser;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.cyc_testing.ctest_utils;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.cb_form_widgets;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query_state;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_kct_test
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test";
  public static final String myFingerPrint = "109ed2b2c707701970e2ebf837cd62ef2090a97130ff272c0847c949cc6f68be";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 2321L)
  public static SubLSymbol $cb_kct_refreshP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 19580L)
  private static SubLSymbol $kct_inference_test_spec_map$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLSymbol $dtp_kct_test_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 27894L)
  public static SubLSymbol $cb_kct_test_being_saved$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLSymbol $dtp_kct_answer$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 51828L)
  public static SubLSymbol $cb_kct_rowcolor$;
  private static final SubLString $str0$_Run_Test_;
  private static final SubLSymbol $kw1$MAIN;
  private static final SubLString $str2$cb_kct_test_run__a;
  private static final SubLSymbol $kw3$KCT_TEST;
  private static final SubLSymbol $sym4$CB_LINK_KCT_TEST;
  private static final SubLSymbol $sym5$CB_KCT_TEST_RUN;
  private static final SubLSymbol $kw6$HTML_HANDLER;
  private static final SubLString $str7$_Run_Test_Set_;
  private static final SubLString $str8$cb_kct_test_set_run__a;
  private static final SubLSymbol $kw9$KCT_TEST_SET;
  private static final SubLSymbol $sym10$CB_LINK_KCT_TEST_SET;
  private static final SubLSymbol $sym11$CB_KCT_TEST_SET_RUN;
  private static final SubLSymbol $kw12$KCT;
  private static final SubLString $str13$KB_Content_Test_Monitor;
  private static final SubLString $str14$KCTRun;
  private static final SubLString $str15$View_status_of_running_and_comple;
  private static final SubLString $str16$_KCTRun_;
  private static final SubLString $str17$cb_kct_main;
  private static final SubLSymbol $sym18$CB_LINK_KCT;
  private static final SubLSymbol $sym19$_CB_KCT_REFRESH__;
  private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw22$UNINITIALIZED;
  private static final SubLSymbol $kw23$CB_CYC;
  private static final SubLString $str24$Refresh;
  private static final SubLString $str25$5__URL_cg_cb_kct_main;
  private static final SubLString $str26$_9999ff;
  private static final SubLString $str27$_ffffff;
  private static final SubLSymbol $kw28$TOP;
  private static final SubLSymbol $kw29$KCT_TOGGLE_REFRESH;
  private static final SubLList $list30;
  private static final SubLString $str31$None_running_;
  private static final SubLString $str32$Individual_Tests;
  private static final SubLString $str33$Test_Categories;
  private static final SubLString $str34$There_are_no_running_or_finished_;
  private static final SubLSymbol $sym35$CB_KCT_MAIN;
  private static final SubLString $str36$_99ccff;
  private static final SubLString $str37$TEST;
  private static final SubLString $str38$TASK_STATUS;
  private static final SubLString $str39$TASK_ACTIONS;
  private static final SubLString $str40$TEST_RESULT;
  private static final SubLString $str41$post;
  private static final SubLString $str42$cb_kct_start_test;
  private static final SubLString $str43$Enter_test_to_run___;
  private static final SubLString $str44$kct_test;
  private static final SubLString $str45$Complete;
  private static final SubLObject $const46$KBContentTest_FullySpecified;
  private static final SubLString $str47$Clear;
  private static final SubLInteger $int48$40;
  private static final SubLString $str49$Run_Test;
  private static final SubLString $str50$cb_kct_start_test_collection;
  private static final SubLString $str51$Enter_test_category_to_run___;
  private static final SubLString $str52$kct_coll;
  private static final SubLObject $const53$KBContentTestSpecificationType;
  private static final SubLString $str54$_A_is_not_the_name_of_a___KBConte;
  private static final SubLSymbol $sym55$CB_KCT_START_TEST;
  private static final SubLString $str56$_A_is_not_the_name_of_a___KBConte;
  private static final SubLSymbol $sym57$CB_KCT_START_TEST_COLLECTION;
  private static final SubLSymbol $kw58$RUNNING;
  private static final SubLSymbol $kw59$STARTED;
  private static final SubLString $str60$_99ffff;
  private static final SubLSymbol $kw61$STOPPED;
  private static final SubLSymbol $kw62$NONE;
  private static final SubLString $str63$_cccccc;
  private static final SubLSymbol $kw64$ERROR;
  private static final SubLString $str65$_ff6666;
  private static final SubLSymbol $kw66$FINISHED;
  private static final SubLSymbol $kw67$SUCCESS;
  private static final SubLSymbol $kw68$FAILURE;
  private static final SubLSymbol $kw69$PROBLEM;
  private static final SubLSymbol $kw70$SKIPPED;
  private static final SubLSymbol $kw71$COLLECTION;
  private static final SubLSymbol $kw72$KCT_EDIT;
  private static final SubLString $str73$_Edit_Test_;
  private static final SubLSymbol $kw74$KCT_MEMBERS;
  private static final SubLSymbol $kw75$INFERENCE;
  private static final SubLSymbol $kw76$KCT_ABORT;
  private static final SubLSymbol $kw77$KCT_FORGET;
  private static final SubLString $str78$_;
  private static final SubLString $str79$Task_is_just_starting_;
  private static final SubLString $str80$Test_halted_with_this_error___A;
  private static final SubLString $str81$Task_was_halted_before_completion;
  private static final SubLSymbol $kw82$SEVERE;
  private static final SubLString $str83$Test_is_un_executable_due_to_conf;
  private static final SubLSymbol $kw84$KCT_RESULTS;
  private static final SubLString $str85$Task_was_never_begun_;
  private static final SubLString $str86$Unknown_thinking_status__A;
  private static final SubLString $str87$_Halt_Auto_Refresh_;
  private static final SubLString $str88$_Start_Auto_Refresh_;
  private static final SubLString $str89$cb_kct_toggle_refresh;
  private static final SubLString $str90$_;
  private static final SubLSymbol $sym91$CB_LINK_KCT_TOGGLE_REFRESH;
  private static final SubLString $str92$main;
  private static final SubLString $str93$members;
  private static final SubLSymbol $sym94$CB_KCT_TOGGLE_REFRESH;
  private static final SubLString $str95$_Forget_;
  private static final SubLString $str96$cb_kct_thinking_forget__a;
  private static final SubLSymbol $sym97$CB_LINK_KCT_FORGET;
  private static final SubLSymbol $sym98$CB_KCT_THINKING_FORGET;
  private static final SubLString $str99$_Abort_;
  private static final SubLString $str100$cb_kct_thinking_abort__a;
  private static final SubLSymbol $sym101$CB_LINK_KCT_ABORT;
  private static final SubLSymbol $sym102$CB_KCT_THINKING_ABORT;
  private static final SubLString $str103$_View_Results_;
  private static final SubLString $str104$cb_kct_thinking_results__a;
  private static final SubLSymbol $sym105$CB_LINK_KCT_RESULTS;
  private static final SubLSymbol $kw106$INDIVIDUAL;
  private static final SubLSymbol $kw107$BRIEF;
  private static final SubLString $str108$Wrong_type_of_KCT_Thinking_Task__;
  private static final SubLSymbol $sym109$CB_KCT_THINKING_RESULTS;
  private static final SubLString $str110$_View_Member_Tests_;
  private static final SubLString $str111$cb_kct_thinking_members__a;
  private static final SubLSymbol $sym112$CB_LINK_KCT_MEMBERS;
  private static final SubLString $str113$Member_test_status_for__A;
  private static final SubLString $str114$5__URL_cg_cb_kct_thinking_members;
  private static final SubLString $str115$This_test_category_has_no_member_;
  private static final SubLString $str116$The_test_was_stopped_before_all_m;
  private static final SubLString $str117$All_member_tests_have_finished_;
  private static final SubLString $str118$_bbbbbb;
  private static final SubLSymbol $sym119$CB_KCT_THINKING_MEMBERS;
  private static final SubLSymbol $kw120$CB_KCT_TEST_SET;
  private static final SubLString $str121$cb_kct_test_set_html;
  private static final SubLString $str122$Test_Category_Results;
  private static final SubLSymbol $kw123$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw124$SHA1;
  private static final SubLString $str125$yui_skin_sam;
  private static final SubLString $str126$reloadFrameButton;
  private static final SubLString $str127$button;
  private static final SubLString $str128$reload;
  private static final SubLString $str129$Refresh_Frames;
  private static final SubLString $str130$Test_Category__;
  private static final SubLString $str131$First_test_in_set_started__;
  private static final SubLString $str132$_unimplemented_;
  private static final SubLString $str133$Last_test_in_set_ended__;
  private static final SubLString $str134$Overall_status__;
  private static final SubLString $str135$Explanation__;
  private static final SubLString $str136$Results_for_member_tests_;
  private static final SubLSymbol $sym137$KCT_RUNSTATE_P;
  private static final SubLString $str138$Test_Results_for_;
  private static final SubLString $str139$Query__;
  private static final SubLString $str140$Query_Formula__;
  private static final SubLString $str141$Test_Status__;
  private static final SubLString $str142$_B40000;
  private static final SubLString $str143$_228b22;
  private static final SubLInteger $int144$1024;
  private static final SubLSymbol $sym145$INFERENCE_P;
  private static final SubLSymbol $sym146$KCT_TEST_SPEC_P;
  private static final SubLSymbol $sym147$KCT_TEST_STATE;
  private static final SubLSymbol $sym148$KCT_TEST_STATE_P;
  private static final SubLList $list149;
  private static final SubLList $list150;
  private static final SubLList $list151;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym154$KCT_TEST_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list155;
  private static final SubLSymbol $sym156$KCT_TEST_STATE_TEST_SPEC;
  private static final SubLSymbol $sym157$_CSETF_KCT_TEST_STATE_TEST_SPEC;
  private static final SubLSymbol $sym158$KCT_TEST_STATE_NAME;
  private static final SubLSymbol $sym159$_CSETF_KCT_TEST_STATE_NAME;
  private static final SubLSymbol $sym160$KCT_TEST_STATE_COMMENTS;
  private static final SubLSymbol $sym161$_CSETF_KCT_TEST_STATE_COMMENTS;
  private static final SubLSymbol $sym162$KCT_TEST_STATE_QUERY_STATE;
  private static final SubLSymbol $sym163$_CSETF_KCT_TEST_STATE_QUERY_STATE;
  private static final SubLSymbol $sym164$KCT_TEST_STATE_SAVE_MT;
  private static final SubLSymbol $sym165$_CSETF_KCT_TEST_STATE_SAVE_MT;
  private static final SubLSymbol $sym166$KCT_TEST_STATE_ANSWER_STATUS;
  private static final SubLSymbol $sym167$_CSETF_KCT_TEST_STATE_ANSWER_STATUS;
  private static final SubLSymbol $sym168$KCT_TEST_STATE_ANSWER_OPTIONS_INDEX;
  private static final SubLSymbol $sym169$_CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_INDEX;
  private static final SubLSymbol $sym170$KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX;
  private static final SubLSymbol $sym171$_CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX;
  private static final SubLSymbol $sym172$KCT_TEST_STATE_CATEGORIES;
  private static final SubLSymbol $sym173$_CSETF_KCT_TEST_STATE_CATEGORIES;
  private static final SubLSymbol $sym174$KCT_TEST_STATE_METRICS;
  private static final SubLSymbol $sym175$_CSETF_KCT_TEST_STATE_METRICS;
  private static final SubLSymbol $sym176$KCT_TEST_STATE_CYCLISTS;
  private static final SubLSymbol $sym177$_CSETF_KCT_TEST_STATE_CYCLISTS;
  private static final SubLSymbol $sym178$KCT_TEST_STATE_NOTES;
  private static final SubLSymbol $sym179$_CSETF_KCT_TEST_STATE_NOTES;
  private static final SubLSymbol $sym180$KCT_TEST_STATE_ANSWER_CARDINALITY;
  private static final SubLSymbol $sym181$_CSETF_KCT_TEST_STATE_ANSWER_CARDINALITY;
  private static final SubLSymbol $kw182$TEST_SPEC;
  private static final SubLSymbol $kw183$NAME;
  private static final SubLSymbol $kw184$COMMENTS;
  private static final SubLSymbol $kw185$QUERY_STATE;
  private static final SubLSymbol $kw186$SAVE_MT;
  private static final SubLSymbol $kw187$ANSWER_STATUS;
  private static final SubLSymbol $kw188$ANSWER_OPTIONS_INDEX;
  private static final SubLSymbol $kw189$ANSWER_OPTIONS_BINDINGS_INDEX;
  private static final SubLSymbol $kw190$CATEGORIES;
  private static final SubLSymbol $kw191$METRICS;
  private static final SubLSymbol $kw192$CYCLISTS;
  private static final SubLSymbol $kw193$NOTES;
  private static final SubLSymbol $kw194$ANSWER_CARDINALITY;
  private static final SubLString $str195$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw196$BEGIN;
  private static final SubLSymbol $sym197$MAKE_KCT_TEST_STATE;
  private static final SubLSymbol $kw198$SLOT;
  private static final SubLSymbol $kw199$END;
  private static final SubLSymbol $sym200$VISIT_DEFSTRUCT_OBJECT_KCT_TEST_STATE_METHOD;
  private static final SubLSymbol $sym201$STRINGP;
  private static final SubLSymbol $sym202$INTEGERP;
  private static final SubLList $list203;
  private static final SubLString $str204$_A_is_not_a_known_answer_cardinal;
  private static final SubLList $list205;
  private static final SubLSymbol $kw206$N;
  private static final SubLSymbol $kw207$MIN;
  private static final SubLSymbol $kw208$MAX;
  private static final SubLSymbol $kw209$UNIMPORTANT;
  private static final SubLSymbol $kw210$EXACT;
  private static final SubLSymbol $kw211$WANTED;
  private static final SubLSymbol $kw212$INEXACT;
  private static final SubLString $str213$The_wanted_binding_set__;
  private static final SubLString $str214$__was_not_a_KB_BINDING_SET_P____d;
  private static final SubLSymbol $kw215$UNWANTED;
  private static final SubLString $str216$The_unwanted_binding_set__;
  private static final SubLSymbol $kw217$UNSPECIFIED;
  private static final SubLSymbol $kw218$SKIP;
  private static final SubLSymbol $sym219$_CB_KCT_TEST_BEING_SAVED_;
  private static final SubLSymbol $sym220$KCT_ANSWER;
  private static final SubLSymbol $sym221$KCT_ANSWER_P;
  private static final SubLList $list222;
  private static final SubLList $list223;
  private static final SubLList $list224;
  private static final SubLList $list225;
  private static final SubLSymbol $sym226$KCT_ANSWER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list227;
  private static final SubLSymbol $sym228$KCT_ANSWER_BINDING_SET;
  private static final SubLSymbol $sym229$_CSETF_KCT_ANSWER_BINDING_SET;
  private static final SubLSymbol $sym230$KCT_ANSWER_STATUS;
  private static final SubLSymbol $sym231$_CSETF_KCT_ANSWER_STATUS;
  private static final SubLSymbol $sym232$KCT_ANSWER_ID;
  private static final SubLSymbol $sym233$_CSETF_KCT_ANSWER_ID;
  private static final SubLSymbol $kw234$BINDING_SET;
  private static final SubLSymbol $kw235$STATUS;
  private static final SubLSymbol $kw236$ID;
  private static final SubLSymbol $sym237$MAKE_KCT_ANSWER;
  private static final SubLSymbol $sym238$VISIT_DEFSTRUCT_OBJECT_KCT_ANSWER_METHOD;
  private static final SubLSymbol $sym239$KB_BINDING_SET_P;
  private static final SubLSymbol $sym240$KEYWORDP;
  private static final SubLSymbol $kw241$OVERLIB;
  private static final SubLString $str242$Edit_this_instance_of___KBContent;
  private static final SubLString $str243$cb_edit_test__A;
  private static final SubLString $str244$nd___;
  private static final SubLSymbol $sym245$CB_LINK_KCT_EDIT;
  private static final SubLString $str246$_A_does_not_denote_a_test_specifi;
  private static final SubLSymbol $sym247$CB_EDIT_TEST;
  private static final SubLString $str248$_Save_As_Test_;
  private static final SubLSymbol $kw249$SELF;
  private static final SubLString $str250$Create_an_instance_of___KBContent;
  private static final SubLString $str251$cb_save_as_test__A__A;
  private static final SubLSymbol $kw252$KCT_SAVE;
  private static final SubLSymbol $sym253$CB_LINK_KCT_SAVE;
  private static final SubLList $list254;
  private static final SubLString $str255$Inference__S_in_problem_store__S_;
  private static final SubLSymbol $sym256$CB_SAVE_AS_TEST;
  private static final SubLString $str257$Edit_Test_Specification;
  private static final SubLString $str258$Save_Inference_Settings_and_Resul;
  private static final SubLString $str259$cb_handle_confirm_save_as_test;
  private static final SubLString $str260$An_interface_for_creating_and_edi;
  private static final SubLString $str261$Save_As_Test;
  private static final SubLString $str262$Goto_section__;
  private static final SubLString $str263$Shortcut_links_to_sections_that_a;
  private static final SubLString $str264$mt_section;
  private static final SubLString $str265$_Mt_;
  private static final SubLString $str266$Change_the_Microtheory_settings_t;
  private static final SubLString $str267$sentence_section;
  private static final SubLString $str268$_Sentence_;
  private static final SubLString $str269$Change_the_CycL_sentence_to_be_us;
  private static final SubLString $str270$parameters_section;
  private static final SubLString $str271$_Inference_Parameters_;
  private static final SubLString $str272$Adjust_the_inference_parameters_a;
  private static final SubLString $str273$categories_section;
  private static final SubLString $str274$_Test_Categories_;
  private static final SubLString $str275$Specify_instances_of_KBContentTes;
  private static final SubLString $str276$metrics_section;
  private static final SubLString $str277$_Test_Metrics_;
  private static final SubLString $str278$Specify_metrics_that_should_be_co;
  private static final SubLString $str279$cyclists_section;
  private static final SubLString $str280$_Responsible_Cyclists_;
  private static final SubLString $str281$Specify_cyclists_that_are_respons;
  private static final SubLString $str282$Notes_;
  private static final SubLString $str283$Test_Name__;
  private static final SubLString $str284$The_constant_name_to_save_the_tes;
  private static final SubLString $str285$name;
  private static final SubLString $str286$Next__Specify_Expected_Results_;
  private static final SubLString $str287$Store_the_specified_sentence__mt_;
  private static final SubLString $str288$new;
  private static final SubLString $str289$Reset_Values;
  private static final SubLString $str290$cb_kct_save_mt;
  private static final SubLString $str291$Show;
  private static final SubLString $str292$Hide;
  private static final SubLSymbol $kw293$INVISIBLE;
  private static final SubLString $str294$Save_In_Mt__;
  private static final SubLString $str295$The_microtheory_in_which_to_save_;
  private static final SubLSymbol $kw296$PARAGRAPH;
  private static final SubLList $list297;
  private static final SubLString $str298$test_categories;
  private static final SubLString $str299$Test_Categories__optional_;
  private static final SubLString $str300$Instances_of_KBContentTestSpecifi;
  private static final SubLSymbol $kw301$VISIBLE;
  private static final SubLObject $const302$KBContentRegressionTest;
  private static final SubLString $str303$category;
  private static final SubLInteger $int304$100;
  private static final SubLString $str305$category_name;
  private static final SubLString $str306$Add_a_Test_Category__;
  private static final SubLString $str307$category_id;
  private static final SubLSymbol $sym308$STRING_;
  private static final SubLSymbol $sym309$FORT_NAME;
  private static final SubLString $str310$test_metrics;
  private static final SubLString $str311$Test_Metrics_to_Gather;
  private static final SubLString $str312$The_metrics_that_should_be_gather;
  private static final SubLString $str313$None_selected_;
  private static final SubLString $str314$metric;
  private static final SubLString $str315$cyclists;
  private static final SubLString $str316$Responsible_Cyclists__required_;
  private static final SubLString $str317$The_cyclists_who_are_responsible_;
  private static final SubLSymbol $kw318$CENTER;
  private static final SubLString $str319$Selected_;
  private static final SubLString $str320$Cyclist;
  private static final SubLString $str321$cyclist;
  private static final SubLString $str322$cyclist_name;
  private static final SubLObject $const323$HumanCyclist;
  private static final SubLString $str324$Add_a_Cyclist__;
  private static final SubLString $str325$_A;
  private static final SubLList $list326;
  private static final SubLList $list327;
  private static final SubLList $list328;
  private static final SubLSymbol $sym329$CB_HANDLE_CONFIRM_SAVE_AS_TEST;
  private static final SubLString $str330$The_ID___A__did_not_yield_a_KBCon;
  private static final SubLString $str331$The_name___S__did_not_denote_a_KB;
  private static final SubLString $str332$The_object___S__extracted_from_th;
  private static final SubLString $str333$The_ID___A__did_not_yield_a_Test_;
  private static final SubLString $str334$The_ID___A__did_not_yield_a_Human;
  private static final SubLString $str335$The_name___A__did_not_denote_a_Hu;
  private static final SubLSymbol $sym336$_CB_KCT_ROWCOLOR_;
  private static final SubLString $str337$_ccccff;
  private static final SubLString $str338$Specify_Test_Expectations;
  private static final SubLString $str339$reloadCurrentFrame__reloadFrameBu;
  private static final SubLString $str340$cb_handle_specify_test_results;
  private static final SubLString $str341$The_interface_for_stating_test_ex;
  private static final SubLSymbol $kw342$RIGHT;
  private static final SubLString $str343$Exactly_;
  private static final SubLString $str344$cardinality;
  private static final SubLString $str345$_answers_should_be_found_;
  private static final SubLString $str346$At_least_;
  private static final SubLString $str347$min_cardinality;
  private static final SubLString $str348$At_most_;
  private static final SubLString $str349$max_cardinality;
  private static final SubLString $str350$bindings;
  private static final SubLString $str351$unimportant;
  private static final SubLString $str352$The_bindings_obtained_are_unimpor;
  private static final SubLString $str353$proven;
  private static final SubLString $str354$The_query__with_no_free_variables;
  private static final SubLString $str355$none;
  private static final SubLString $str356$No_bindings_should_be_found_;
  private static final SubLString $str357$The_query__with_no_free_variables;
  private static final SubLString $str358$exact;
  private static final SubLString $str359$Require_all_and_only_the_wanted_b;
  private static final SubLString $str360$inexact;
  private static final SubLString $str361$Specify_wanted_and_or_unwanted_bi;
  private static final SubLString $str362$Check_wanted_and_unwanted_binding;
  private static final SubLSymbol $kw363$LEFT;
  private static final SubLString $str364$Wanted;
  private static final SubLString $str365$Not_Wanted;
  private static final SubLString $str366$Unspecified;
  private static final SubLString $str367$Save_New_Test;
  private static final SubLString $str368$Creates_a_new___KBContentTest_Ful;
  private static final SubLString $str369$save_new;
  private static final SubLString $str370$Overwrite_Existing_Test;
  private static final SubLString $str371$Overwrites_the_existing_test_spec;
  private static final SubLString $str372$overwrite;
  private static final SubLString $str373$Test_Definition_So_Far;
  private static final SubLString $str374$The_currently_specified_propertie;
  private static final SubLString $str375$Specify_a_binding_set_;
  private static final SubLString $str376$Enter_values_for_each_free_variab;
  private static final SubLString $str377$Wanted_;
  private static final SubLString $str378$wanted;
  private static final SubLString $str379$Unwanted_;
  private static final SubLString $str380$unwanted;
  private static final SubLString $str381$Add_this_binding_set;
  private static final SubLString $str382$Updates_the_state_of_the_test_bei;
  private static final SubLString $str383$add;
  private static final SubLString $str384$new__A;
  private static final SubLString $str385$top;
  private static final SubLSymbol $kw386$INPUT_NAME;
  private static final SubLSymbol $kw387$COMPLETE_TYPE;
  private static final SubLString $str388$wanted__A;
  private static final SubLString $str389$yes;
  private static final SubLString $str390$no;
  private static final SubLString $str391$unspecified;
  private static final SubLSymbol $kw392$ADD;
  private static final SubLSymbol $kw393$SAVE_NEW;
  private static final SubLSymbol $kw394$OVERWRITE;
  private static final SubLString $str395$Unknown_test_save_method__A;
  private static final SubLSymbol $sym396$CB_HANDLE_SPECIFY_TEST_RESULTS;
  private static final SubLSymbol $kw397$UNKNOWN;
  private static final SubLSymbol $kw398$EOF;
  private static final SubLString $str399$_is_not_an_integer_;
  private static final SubLSymbol $kw400$REQUIRED_;
  private static final SubLList $list401;
  private static final SubLString $str402$The_value___A__is_not_a_known_exa;
  private static final SubLString $str403$test_spec;
  private static final SubLString $str404$_A_does_not_denote_a_test_specifi;
  private static final SubLString $str405$You_need_to_make_a_choice_for_Exp;
  private static final SubLString $str406$Problem_extracting_exact_answers_;
  private static final SubLString $str407$The_ID__A_does_not_denote_a_kct_a;
  private static final SubLString $str408$Save_Test_Specification;
  private static final SubLString $str409$_A_is_not_a_valid_constant_name_;
  private static final SubLString $str410$Already_a_constant_named__A;
  private static final SubLString $str411$Constant__S_already_exists_which_;
  private static final SubLObject $const412$TestQueryFn;
  private static final SubLString $str413$Save_New_Test_Specification_finis;
  private static final SubLString $str414$Save_New_Test_Specification_finis;
  private static final SubLString $str415$Overwrite_Test_Specification;
  private static final SubLString $str416$_A_is_not_the_name_of_a_KBContent;
  private static final SubLString $str417$Edit_Test_Specification_finished_;
  private static final SubLString $str418$Edit_Test_Specification_finished_;
  private static final SubLSymbol $sym419$CONSTANT_P;
  private static final SubLSymbol $sym420$LISTP;
  private static final SubLSymbol $sym421$POSSIBLY_MT_P;
  private static final SubLObject $const422$isa;
  private static final SubLList $list423;
  private static final SubLList $list424;
  private static final SubLObject $const425$testQuerySpecification;
  private static final SubLString $str426$Remember_to_state_expected_result;
  private static final SubLList $list427;
  private static final SubLString $str428$Some_item_in__A_was_not_a_KB_BIND;
  private static final SubLObject $const429$testAnswers_Cardinality_Exact;
  private static final SubLObject $const430$testAnswers_Cardinality_Min;
  private static final SubLObject $const431$testAnswers_Cardinality_Max;
  private static final SubLObject $const432$testAnswersCycL_Exact;
  private static final SubLObject $const433$testAnswersCycL_Wanted;
  private static final SubLObject $const434$testAnswersCycL_NotWanted;
  private static final SubLObject $const435$testAnswersCycLUnimportant;
  private static final SubLSymbol $sym436$FOURTH;
  private static final SubLObject $const437$MCQuestionNthOptionFn;
  private static final SubLObject $const438$testAnswer_MultipleChoice;
  private static final SubLObject $const439$testMetricsToGather;
  private static final SubLObject $const440$testResponsibleCyclist;
  private static final SubLSymbol $sym441$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const442$EverythingPSC;
  private static final SubLSymbol $kw443$GAF;
  private static final SubLSymbol $kw444$TRUE;
  private static final SubLObject $const445$StartFn;
  private static final SubLObject $const446$TimeIntervalInclusiveFn;
  private static final SubLList $list447;
  private static final SubLObject $const448$IntervalEndedByFn_Inclusive;
  private static final SubLSymbol $kw449$IGNORE;
  private static final SubLObject $const450$temporallyQualifiablePredicateInI;
  private static final SubLList $list451;
  private static final SubLObject $const452$Null_TimeParameter;
  private static final SubLObject $const453$TimePoint;
  private static final SubLList $list454;
  private static final SubLSymbol $kw455$KCT_CONTROL_PANEL;
  private static final SubLString $str456$KB_Content_Test_Control_Panel;
  private static final SubLString $str457$KCT;
  private static final SubLString $str458$View_and_edit_your_KB_Content_Tes;
  private static final SubLString $str459$_KCT_;
  private static final SubLString $str460$cb_kct_control_panel;
  private static final SubLSymbol $sym461$CB_LINK_KCT_CONTROL_PANEL;
  private static final SubLString $str462$cb_kct_control_panel_handler;
  private static final SubLString $str463$KB_Content_Tests_owned_by_;
  private static final SubLString $str464$_;
  private static final SubLString $str465$No_tests_;
  private static final SubLSymbol $sym466$CB_KCT_CONTROL_PANEL;
  private static final SubLString $str467$_Refresh_;
  private static final SubLString $str468$Submit;
  private static final SubLString $str469$save;
  private static final SubLString $str470$_Edit_;
  private static final SubLString $str471$_Run_;
  private static final SubLString $str472$Edit;
  private static final SubLString $str473$Run;
  private static final SubLString $str474$Name;
  private static final SubLString $str475$Regression_Test_;
  private static final SubLString $str476$Save_Interface;
  private static final SubLString $str477$Tests__Regression_Status_Modified;
  private static final SubLSymbol $sym478$CB_KCT_CONTROL_PANEL_HANDLER;
  private static final SubLList $list479;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 853L)
  public static SubLObject cb_link_kct_test(final SubLObject test_constant, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$_Run_Test_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str2$cb_kct_test_run__a, cb_utilities.cb_fort_identifier( test_constant ) );
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
    return test_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 1229L)
  public static SubLObject cb_kct_test_run(final SubLObject args)
  {
    final SubLObject test_constant = cb_utilities.cb_guess_fort( args, UNPROVIDED );
    kct_thinking.kct_run_test_in_thinker( test_constant, T );
    cb_kct_main( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 1401L)
  public static SubLObject cb_link_kct_test_set(final SubLObject test_collection, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str7$_Run_Test_Set_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str8$cb_kct_test_set_run__a, cb_utilities.cb_fort_identifier( test_collection ) );
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
    return test_collection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 1759L)
  public static SubLObject cb_kct_test_set_run(final SubLObject args)
  {
    final SubLObject test_collection = cb_utilities.cb_guess_fort( args, UNPROVIDED );
    kct_thinking.kct_run_test_set_in_thinker( test_collection, T );
    cb_kct_main( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 2126L)
  public static SubLObject cb_link_kct(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str16$_KCTRun_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str17$cb_kct_main );
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

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 2367L)
  public static SubLObject cb_kct_main(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title = $str13$KB_Content_Test_Monitor;
    html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw23$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( title );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_complete.html_complete_script();
      if( NIL != $cb_kct_refreshP$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_meta_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str24$Refresh );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_meta_content$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str25$5__URL_cg_cb_kct_main );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
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
          html_utilities.html_markup( ONE_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( title );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( ONE_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          cb_kct_enter_test_section( UNPROVIDED, UNPROVIDED );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          if( NIL != kct_thinking.kct_all_thinkings() )
          {
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( THREE_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str26$_9999ff );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str27$_ffffff );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( FOUR_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  if( NIL != kct_thinking.kct_any_thinking_runningP() )
                  {
                    cb_utilities.cb_link( $kw29$KCT_TOGGLE_REFRESH, $list30, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else
                  {
                    html_utilities.html_princ_strong( $str31$None_running_ );
                    $cb_kct_refreshP$.setDynamicValue( NIL, thread );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              thread.resetMultipleValues();
              final SubLObject individual_tests = kct_thinking.kct_classify_thinkings_by_type( kct_thinking.kct_all_thinkings() );
              final SubLObject collection_tests = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != individual_tests )
              {
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str27$_ffffff );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str32$Individual_Tests );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                cb_kct_status_table_header();
                SubLObject cdolist_list_var = individual_tests;
                SubLObject thinking = NIL;
                thinking = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  cb_kct_show_status( thinking );
                  cdolist_list_var = cdolist_list_var.rest();
                  thinking = cdolist_list_var.first();
                }
              }
              if( NIL != collection_tests )
              {
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str27$_ffffff );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str33$Test_Categories );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                cb_kct_status_table_header();
                SubLObject cdolist_list_var = collection_tests;
                SubLObject thinking = NIL;
                thinking = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  cb_kct_show_status( thinking );
                  cdolist_list_var = cdolist_list_var.rest();
                  thinking = cdolist_list_var.first();
                }
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str34$There_are_no_running_or_finished_ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
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

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 3999L)
  public static SubLObject cb_kct_status_table_header()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str36$_99ccff );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str37$TEST );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str38$TASK_STATUS );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str39$TASK_ACTIONS );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str40$TEST_RESULT );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 4431L)
  public static SubLObject cb_kct_enter_test_section(SubLObject last_kct, SubLObject last_kct_col)
  {
    if( last_kct == UNPROVIDED )
    {
      last_kct = NIL;
    }
    if( last_kct_col == UNPROVIDED )
    {
      last_kct_col = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str41$post );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str42$cb_kct_start_test, T, UNPROVIDED );
      html_utilities.html_princ_strong( $str43$Enter_test_to_run___ );
      html_utilities.html_newline( UNPROVIDED );
      html_complete.html_complete_button( $str44$kct_test, $str45$Complete, $const46$KBContentTest_FullySpecified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_script_utilities.html_clear_input_button( $str44$kct_test, $str47$Clear, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_text_input( $str44$kct_test, ( NIL != last_kct ) ? constants_high.constant_name( last_kct ) : NIL, $int48$40 );
      html_utilities.html_submit_input( $str49$Run_Test, UNPROVIDED, UNPROVIDED );
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str41$post );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str50$cb_kct_start_test_collection, T, UNPROVIDED );
      html_utilities.html_princ_strong( $str51$Enter_test_category_to_run___ );
      html_utilities.html_newline( UNPROVIDED );
      html_complete.html_complete_button( $str52$kct_coll, $str45$Complete, $const53$KBContentTestSpecificationType, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_script_utilities.html_clear_input_button( $str52$kct_coll, $str47$Clear, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_text_input( $str52$kct_coll, ( NIL != last_kct_col ) ? constants_high.constant_name( last_kct_col ) : NIL, $int48$40 );
      html_utilities.html_submit_input( $str49$Run_Test, UNPROVIDED, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 5367L)
  public static SubLObject cb_kct_start_test(final SubLObject args)
  {
    final SubLObject test_constant_name = html_utilities.html_extract_input( $str44$kct_test, args );
    final SubLObject test_constant = cb_utilities.cb_guess_term( test_constant_name, UNPROVIDED );
    if( NIL == kct_utils.kct_test_spec_p( test_constant, UNPROVIDED ) )
    {
      return cb_utilities.cb_error( $str54$_A_is_not_the_name_of_a___KBConte, test_constant_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    kct_thinking.kct_run_test_in_thinker( test_constant, T );
    return cb_kct_main( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 5761L)
  public static SubLObject cb_kct_start_test_collection(final SubLObject args)
  {
    final SubLObject test_constant_name = html_utilities.html_extract_input( $str52$kct_coll, args );
    final SubLObject test_constant = cb_utilities.cb_guess_term( test_constant_name, UNPROVIDED );
    if( NIL == kct_utils.kct_test_collection_p( test_constant, UNPROVIDED ) )
    {
      return cb_utilities.cb_error( $str56$_A_is_not_the_name_of_a___KBConte, test_constant_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    kct_thinking.kct_run_test_set_in_thinker( test_constant, T );
    return cb_kct_main( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 6178L)
  public static SubLObject cb_kct_thinking_status_row_color(final SubLObject thinking)
  {
    final SubLObject runstate = kct_thinking.kct_thinking_runstate( thinking );
    final SubLObject thinking_status = process_utilities.thinking_status( thinking );
    final SubLObject test_status = ( NIL != runstate ) ? kbq_query_run.runstate_result_status( runstate ) : NIL;
    SubLObject row_color = NIL;
    final SubLObject pcase_var = thinking_status;
    if( pcase_var.eql( $kw58$RUNNING ) || pcase_var.eql( $kw59$STARTED ) )
    {
      row_color = $str60$_99ffff;
    }
    else if( pcase_var.eql( $kw61$STOPPED ) || pcase_var.eql( $kw62$NONE ) )
    {
      row_color = $str63$_cccccc;
    }
    else if( pcase_var.eql( $kw64$ERROR ) )
    {
      row_color = $str65$_ff6666;
    }
    else if( pcase_var.eql( $kw66$FINISHED ) )
    {
      if( test_status.equal( $kw67$SUCCESS ) )
      {
        row_color = $str60$_99ffff;
      }
      else if( test_status.equal( $kw68$FAILURE ) || test_status.equal( $kw64$ERROR ) || test_status.equal( $kw69$PROBLEM ) )
      {
        row_color = $str65$_ff6666;
      }
      else if( test_status.equal( $kw70$SKIPPED ) )
      {
        row_color = $str63$_cccccc;
      }
    }
    return row_color;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 6950L)
  public static SubLObject cb_kct_show_status(final SubLObject thinking)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constant = kct_thinking.kct_thinking_test_constant( thinking );
    final SubLObject runstate = kct_thinking.kct_thinking_runstate( thinking );
    final SubLObject type = kct_thinking.kct_thinking_type( thinking );
    final SubLObject member_runstates = ( NIL != kbq_query_run.kct_set_runstate_p( runstate ) && type == $kw71$COLLECTION ) ? kbq_query_run.kct_set_runstate_test_runstates( runstate ) : NIL;
    final SubLObject status = process_utilities.thinking_status( thinking );
    final SubLObject row_color = cb_kct_thinking_status_row_color( thinking );
    SubLObject config_status = NIL;
    SubLObject config_text = NIL;
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    if( NIL != row_color )
    {
      html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( row_color );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_form( constant, UNPROVIDED, UNPROVIDED );
        if( NIL != kct_utils.kct_test_spec_p( constant, UNPROVIDED ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          cb_utilities.cb_link( $kw72$KCT_EDIT, constant, $str73$_Edit_Test_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( status );
        if( type == $kw71$COLLECTION )
        {
          html_utilities.html_br();
          cb_utilities.cb_link( $kw74$KCT_MEMBERS, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          final SubLObject inference = ( NIL != kbq_query_run.kct_runstate_p( runstate ) ) ? kbq_query_run.kct_runstate_inference( runstate ) : NIL;
          if( NIL != inference_datastructures_inference.valid_inference_p( inference ) )
          {
            html_utilities.html_br();
            cb_utilities.cb_link( $kw75$INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( status == $kw58$RUNNING || status == $kw59$STARTED )
        {
          cb_utilities.cb_link( $kw76$KCT_ABORT, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_link( $kw77$KCT_FORGET, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject pcase_var = status;
        if( pcase_var.eql( $kw58$RUNNING ) )
        {
          html_utilities.html_princ( $str78$_ );
        }
        else if( pcase_var.eql( $kw59$STARTED ) )
        {
          html_utilities.html_princ( $str79$Task_is_just_starting_ );
        }
        else if( pcase_var.eql( $kw64$ERROR ) )
        {
          final SubLObject error_message = process_utilities.thinking_error_message( thinking );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str80$Test_halted_with_this_error___A, error_message );
        }
        else if( pcase_var.eql( $kw61$STOPPED ) )
        {
          html_utilities.html_princ( $str81$Task_was_halted_before_completion );
        }
        else if( pcase_var.eql( $kw66$FINISHED ) )
        {
          if( NIL != kct_utils.kct_test_spec_p( constant, UNPROVIDED ) )
          {
            thread.resetMultipleValues();
            final SubLObject problem_status = kct_utils.why_not_kct_test_valid( constant );
            final SubLObject problem_text = thread.secondMultipleValue();
            thread.resetMultipleValues();
            config_status = problem_status;
            config_text = problem_text;
          }
          else if( NIL != kct_utils.kct_test_collection_p( constant, UNPROVIDED ) )
          {
            thread.resetMultipleValues();
            final SubLObject problem_status = kct_utils.why_not_kct_test_collection_valid( constant );
            final SubLObject problem_text = thread.secondMultipleValue();
            thread.resetMultipleValues();
            config_status = problem_status;
            config_text = problem_text;
          }
          if( config_status == $kw82$SEVERE )
          {
            html_utilities.html_princ( PrintLow.format( NIL, $str83$Test_is_un_executable_due_to_conf, config_text ) );
          }
          else
          {
            html_utilities.html_princ( kbq_query_run.runstate_result_status( runstate ) );
            html_utilities.html_indent( THREE_INTEGER );
            cb_utilities.cb_link( $kw84$KCT_RESULTS, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
        else if( pcase_var.eql( $kw62$NONE ) )
        {
          html_utilities.html_princ( $str85$Task_was_never_begun_ );
        }
        else
        {
          Errors.error( $str86$Unknown_thinking_status__A, status );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 9648L)
  public static SubLObject cb_link_kct_toggle_refresh(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject linktext = ( NIL != $cb_kct_refreshP$.getDynamicValue( thread ) ) ? $str87$_Halt_Auto_Refresh_ : $str88$_Start_Auto_Refresh_;
    final SubLObject arg1 = ConsesLow.nth( ZERO_INTEGER, args );
    final SubLObject arg2 = ConsesLow.nth( ONE_INTEGER, args );
    final SubLObject arg3 = ConsesLow.nth( TWO_INTEGER, args );
    SubLObject link = $str89$cb_kct_toggle_refresh;
    if( NIL != arg1 )
    {
      link = Sequences.cconcatenate( link, new SubLObject[] { $str90$_, PrintLow.format( NIL, arg1 )
      } );
      if( NIL != arg2 )
      {
        link = Sequences.cconcatenate( link, new SubLObject[] { $str90$_, PrintLow.format( NIL, arg2 )
        } );
        if( NIL != arg3 )
        {
          link = Sequences.cconcatenate( link, new SubLObject[] { $str90$_, PrintLow.format( NIL, arg3 )
          } );
        }
      }
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( link );
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

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 10273L)
  public static SubLObject cb_kct_toggle_refresh(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject page = args.first();
    if( NIL != $cb_kct_refreshP$.getDynamicValue( thread ) )
    {
      $cb_kct_refreshP$.setDynamicValue( NIL, thread );
    }
    else
    {
      $cb_kct_refreshP$.setDynamicValue( T, thread );
    }
    if( page.equal( $str92$main ) )
    {
      return cb_kct_main( UNPROVIDED );
    }
    if( page.equal( $str93$members ) )
    {
      return cb_kct_thinking_members( args.rest() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 10610L)
  public static SubLObject cb_link_kct_forget(final SubLObject thinking, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str95$_Forget_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str96$cb_kct_thinking_forget__a, kct_thinking.kct_thinking_id( thinking ) );
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
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 10924L)
  public static SubLObject cb_kct_thinking_forget(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject id_string = args.first();
    final SubLObject id = Sequences.length( string_utilities.trim_whitespace( id_string ) ).numG( ZERO_INTEGER ) ? reader.read_from_string_ignoring_errors( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : NIL;
    final SubLObject thinking = ( NIL != id ) ? kct_thinking.kct_lookup_thinking( id ) : NIL;
    if( NIL != process_utilities.thinking_task_p( thinking ) )
    {
      kct_thinking.kct_remove_thinking( thinking );
    }
    cb_kct_main( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 11294L)
  public static SubLObject cb_link_kct_abort(final SubLObject thinking, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str99$_Abort_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str100$cb_kct_thinking_abort__a, kct_thinking.kct_thinking_id( thinking ) );
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
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 11598L)
  public static SubLObject cb_kct_thinking_abort(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject id_string = args.first();
    final SubLObject id = Sequences.length( string_utilities.trim_whitespace( id_string ) ).numG( ZERO_INTEGER ) ? reader.read_from_string_ignoring_errors( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : NIL;
    final SubLObject thinking = ( NIL != id ) ? kct_thinking.kct_lookup_thinking( id ) : NIL;
    if( NIL != process_utilities.thinking_task_p( thinking ) )
    {
      kct_thinking.kct_thinking_stop( thinking );
    }
    cb_kct_main( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 11965L)
  public static SubLObject cb_link_kct_results(final SubLObject thinking, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str103$_View_Results_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str104$cb_kct_thinking_results__a, kct_thinking.kct_thinking_id( thinking ) );
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
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 12313L)
  public static SubLObject cb_kct_thinking_results(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject id_string = args.first();
    final SubLObject id = Sequences.length( string_utilities.trim_whitespace( id_string ) ).numG( ZERO_INTEGER ) ? reader.read_from_string_ignoring_errors( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : NIL;
    final SubLObject thinking = ( NIL != id ) ? kct_thinking.kct_lookup_thinking( id ) : NIL;
    if( NIL != process_utilities.thinking_task_p( thinking ) )
    {
      final SubLObject runstate = kct_thinking.kct_thinking_runstate( thinking );
      final SubLObject pcase_var;
      final SubLObject type = pcase_var = kct_thinking.kct_thinking_type( thinking );
      if( pcase_var.eql( $kw106$INDIVIDUAL ) )
      {
        return cb_kct_individual_runstate_results( runstate, $kw107$BRIEF );
      }
      if( pcase_var.eql( $kw71$COLLECTION ) )
      {
        return cb_kct_collection_results( runstate, $kw107$BRIEF );
      }
      Errors.error( $str108$Wrong_type_of_KCT_Thinking_Task__, type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 12937L)
  public static SubLObject cb_link_kct_members(final SubLObject thinking, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str110$_View_Member_Tests_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str111$cb_kct_thinking_members__a, kct_thinking.kct_thinking_id( thinking ) );
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
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 13286L)
  public static SubLObject cb_kct_thinking_members(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id_string = args.first();
    final SubLObject id = Sequences.length( string_utilities.trim_whitespace( id_string ) ).numG( ZERO_INTEGER ) ? reader.read_from_string_ignoring_errors( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : NIL;
    final SubLObject thinking = ( NIL != id ) ? kct_thinking.kct_lookup_thinking( id ) : NIL;
    if( NIL != process_utilities.thinking_task_p( thinking ) )
    {
      final SubLObject runstate = kct_thinking.kct_thinking_runstate( thinking );
      final SubLObject constant = kbq_query_run.runstate_constant( runstate );
      final SubLObject member_runstates = ( NIL != kbq_query_run.kct_set_runstate_p( runstate ) ) ? kbq_query_run.kct_set_runstate_test_runstates( runstate ) : NIL;
      final SubLObject title = PrintLow.format( NIL, $str113$Member_test_status_for__A, constant );
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        html_utilities.html_princ( title );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        if( NIL != $cb_kct_refreshP$.getDynamicValue( thread ) )
        {
          final SubLObject content_string = PrintLow.format( NIL, $str114$5__URL_cg_cb_kct_thinking_members, id );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_meta_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str24$Refresh );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != content_string )
          {
            html_utilities.html_markup( html_macros.$html_meta_content$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( content_string );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( title );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            if( NIL == member_runstates )
            {
              html_utilities.html_princ_strong( $str115$This_test_category_has_no_member_ );
            }
            else
            {
              html_utilities.html_terpri( UNPROVIDED );
              final SubLObject pcase_var = process_utilities.thinking_status( thinking );
              if( pcase_var.eql( $kw58$RUNNING ) || pcase_var.eql( $kw59$STARTED ) )
              {
                cb_utilities.cb_link( $kw29$KCT_TOGGLE_REFRESH, ConsesLow.cons( $str93$members, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw61$STOPPED ) )
              {
                html_utilities.html_princ_strong( $str116$The_test_was_stopped_before_all_m );
                $cb_kct_refreshP$.setDynamicValue( NIL, thread );
              }
              else
              {
                html_utilities.html_princ_strong( $str117$All_member_tests_have_finished_ );
                $cb_kct_refreshP$.setDynamicValue( NIL, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str26$_9999ff );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject bgcolor = NIL;
                SubLObject color_toggle = NIL;
                SubLObject list_var = NIL;
                SubLObject member_runstate = NIL;
                SubLObject ignore_me = NIL;
                list_var = member_runstates;
                member_runstate = list_var.first();
                for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), member_runstate = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
                {
                  if( NIL != color_toggle )
                  {
                    color_toggle = NIL;
                  }
                  else
                  {
                    color_toggle = T;
                  }
                  bgcolor = ( NIL != color_toggle ) ? $str118$_bbbbbb : $str27$_ffffff;
                  final SubLObject constant_$21 = kbq_query_run.kct_runstate_test_spec( member_runstate );
                  final SubLObject inference = kbq_query_run.kct_runstate_inference( member_runstate );
                  final SubLObject run_status = kbq_query_run.runstate_run_status( member_runstate );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  if( NIL != bgcolor )
                  {
                    html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( bgcolor );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_form( constant_$21, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( run_status );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      if( NIL != inference )
                      {
                        cb_utilities.cb_link( $kw75$INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  if( run_status == $kw66$FINISHED )
                  {
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    if( NIL != bgcolor )
                    {
                      html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( bgcolor );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( THREE_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        cb_kct_individual_runstate_results( member_runstate, $kw107$BRIEF );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                  }
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 15909L)
  public static SubLObject cb_kct_collection_results(final SubLObject runstate, final SubLObject output_style)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str122$Test_Category_Results;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$28 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
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
        final SubLObject _prev_bind_0_$29 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str125$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str126$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str127$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str128$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str129$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
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
            cb_utilities.cb_help_preamble( $kw120$CB_KCT_TEST_SET, UNPROVIDED, UNPROVIDED );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str130$Test_Category__ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( kbq_query_run.runstate_constant( runstate ) );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str131$First_test_in_set_started__ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str132$_unimplemented_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str133$Last_test_in_set_ended__ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str132$_unimplemented_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str134$Overall_status__ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( kbq_query_run.runstate_result_status( runstate ) );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str135$Explanation__ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( kbq_query_run.runstate_result_text( runstate ) );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str136$Results_for_member_tests_ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = kbq_query_run.kct_set_runstate_test_runstates( runstate );
            SubLObject kct_runstate = NIL;
            kct_runstate = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_kct_individual_runstate_results( kct_runstate, output_style );
              cdolist_list_var = cdolist_list_var.rest();
              kct_runstate = cdolist_list_var.first();
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$29, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$28, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 17545L)
  public static SubLObject cb_kct_individual_runstate_results(final SubLObject kct_runstate, final SubLObject output_style)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kbq_query_run.kct_runstate_p( kct_runstate ) : kct_runstate;
    final SubLObject test = kbq_query_run.runstate_constant( kct_runstate );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str138$Test_Results_for_ );
    cb_utilities.cb_form( test, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_br();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
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
      final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str139$Query__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_form( kct_utils.kct_query_specification( test, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str140$Query_Formula__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_form( kb_query.kbq_sentences( kct_utils.kct_query_specification( test, UNPROVIDED ) ).first(), UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str141$Test_Status__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject status = kbq_query_run.runstate_result_status( kct_runstate );
          if( $kw68$FAILURE == status )
          {
            final SubLObject color_val = $str142$_B40000;
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != color_val )
            {
              html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( color_val ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( status );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          else if( $kw67$SUCCESS == status )
          {
            final SubLObject color_val = $str143$_228b22;
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != color_val )
            {
              html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( color_val ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( status );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          else
          {
            html_utilities.html_princ( status );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( kbq_query_run.runstate_result_status( kct_runstate ) == $kw68$FAILURE )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str135$Explanation__ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
            final SubLObject _prev_bind_0_$62 = html_macros.$within_html_pre$.currentBinding( thread );
            try
            {
              html_macros.$within_html_pre$.bind( T, thread );
              html_utilities.html_princ( kbq_query_run.kct_runstate_failure_explanation( kct_runstate ) );
            }
            finally
            {
              html_macros.$within_html_pre$.rebind( _prev_bind_0_$62, thread );
            }
            html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      SubLObject cdolist_list_var = kbq_query_run.kb_test_metrics_to_query_metrics( kct_utils.kct_test_metrics( kbq_query_run.kct_runstate_test_spec( kct_runstate ), UNPROVIDED ) );
      SubLObject metric = NIL;
      metric = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject metric_value = kbq_query_run.kct_runstate_metric_value( kct_runstate, metric );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( metric );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( metric_value );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        metric = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 19760L)
  public static SubLObject kct_register_test_spec_of_inference(final SubLObject inference, final SubLObject test_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != kct_utils.kct_test_spec_p( test_spec, UNPROVIDED ) : test_spec;
    return Hashtables.sethash( inference, $kct_inference_test_spec_map$.getDynamicValue( thread ), test_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20068L)
  public static SubLObject kct_deregister_test_spec_of_inference(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    return Hashtables.remhash( inference, $kct_inference_test_spec_map$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20301L)
  public static SubLObject kct_lookup_test_spec_by_inference(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    return Hashtables.gethash( inference, $kct_inference_test_spec_map$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $kct_test_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_test_spec(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_name(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_comments(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_query_state(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_save_mt(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_answer_status(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_answer_options_index(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_answer_options_bindings_index(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_categories(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_metrics(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_cyclists(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_notes(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject kct_test_state_answer_cardinality(final SubLObject v_object)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_test_spec(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_comments(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_query_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_save_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_answer_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_answer_options_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_answer_options_bindings_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_categories(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_metrics(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_cyclists(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_notes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject _csetf_kct_test_state_answer_cardinality(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_test_state_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject make_kct_test_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $kct_test_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw182$TEST_SPEC ) )
      {
        _csetf_kct_test_state_test_spec( v_new, current_value );
      }
      else if( pcase_var.eql( $kw183$NAME ) )
      {
        _csetf_kct_test_state_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw184$COMMENTS ) )
      {
        _csetf_kct_test_state_comments( v_new, current_value );
      }
      else if( pcase_var.eql( $kw185$QUERY_STATE ) )
      {
        _csetf_kct_test_state_query_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw186$SAVE_MT ) )
      {
        _csetf_kct_test_state_save_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw187$ANSWER_STATUS ) )
      {
        _csetf_kct_test_state_answer_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw188$ANSWER_OPTIONS_INDEX ) )
      {
        _csetf_kct_test_state_answer_options_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw189$ANSWER_OPTIONS_BINDINGS_INDEX ) )
      {
        _csetf_kct_test_state_answer_options_bindings_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw190$CATEGORIES ) )
      {
        _csetf_kct_test_state_categories( v_new, current_value );
      }
      else if( pcase_var.eql( $kw191$METRICS ) )
      {
        _csetf_kct_test_state_metrics( v_new, current_value );
      }
      else if( pcase_var.eql( $kw192$CYCLISTS ) )
      {
        _csetf_kct_test_state_cyclists( v_new, current_value );
      }
      else if( pcase_var.eql( $kw193$NOTES ) )
      {
        _csetf_kct_test_state_notes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw194$ANSWER_CARDINALITY ) )
      {
        _csetf_kct_test_state_answer_cardinality( v_new, current_value );
      }
      else
      {
        Errors.error( $str195$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject visit_defstruct_kct_test_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw196$BEGIN, $sym197$MAKE_KCT_TEST_STATE, THIRTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw182$TEST_SPEC, kct_test_state_test_spec( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw183$NAME, kct_test_state_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw184$COMMENTS, kct_test_state_comments( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw185$QUERY_STATE, kct_test_state_query_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw186$SAVE_MT, kct_test_state_save_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw187$ANSWER_STATUS, kct_test_state_answer_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw188$ANSWER_OPTIONS_INDEX, kct_test_state_answer_options_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw189$ANSWER_OPTIONS_BINDINGS_INDEX, kct_test_state_answer_options_bindings_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw190$CATEGORIES, kct_test_state_categories( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw191$METRICS, kct_test_state_metrics( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw192$CYCLISTS, kct_test_state_cyclists( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw193$NOTES, kct_test_state_notes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw194$ANSWER_CARDINALITY, kct_test_state_answer_cardinality( obj ) );
    Functions.funcall( visitor_fn, obj, $kw199$END, $sym197$MAKE_KCT_TEST_STATE, THIRTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 20551L)
  public static SubLObject visit_defstruct_object_kct_test_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_kct_test_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 21405L)
  public static SubLObject kct_test_state_add_note(final SubLObject test_state, final SubLObject note)
  {
    assert NIL != kct_test_state_p( test_state ) : test_state;
    assert NIL != Types.stringp( note ) : note;
    _csetf_kct_test_state_notes( test_state, ConsesLow.cons( note, kct_test_state_notes( test_state ) ) );
    return kct_test_state_notes( test_state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 21672L)
  public static SubLObject kct_test_state_set_cardinality(final SubLObject test_state, final SubLObject type, final SubLObject num)
  {
    assert NIL != kct_test_state_p( test_state ) : test_state;
    if( NIL != num && !assertionsDisabledInClass && NIL == Types.integerp( num ) )
    {
      throw new AssertionError( num );
    }
    if( NIL == subl_promotions.memberP( type, $list203, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str204$_A_is_not_a_known_answer_cardinal, type );
    }
    _csetf_kct_test_state_answer_cardinality( test_state, conses_high.putf( kct_test_state_answer_cardinality( test_state ), type, num ) );
    return kct_test_state_answer_cardinality( test_state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 22108L)
  public static SubLObject cb_kct_new_test_state_from_test_spec(final SubLObject test_spec)
  {
    assert NIL != kct_utils.kct_test_spec_p( test_spec, UNPROVIDED ) : test_spec;
    final SubLObject test_state = make_kct_test_state( UNPROVIDED );
    final SubLObject query_spec = kct_utils.kct_query_specification( test_spec, UNPROVIDED );
    final SubLObject query_state = cb_kb_query_state.cb_kbq_new_query_state_from_query_spec( query_spec, test_state );
    final SubLObject defining_mt = kct_utils.kct_defining_mt( test_spec );
    _csetf_kct_test_state_test_spec( test_state, test_spec );
    _csetf_kct_test_state_name( test_state, cb_utilities.cb_string_for_fort( test_spec ) );
    _csetf_kct_test_state_comments( test_state, kct_utils.kct_comments( test_spec, UNPROVIDED ) );
    _csetf_kct_test_state_query_state( test_state, query_state );
    _csetf_kct_test_state_save_mt( test_state, defining_mt );
    _csetf_kct_test_state_answer_options_index( test_state, id_index.new_id_index( UNPROVIDED, UNPROVIDED ) );
    _csetf_kct_test_state_answer_options_bindings_index( test_state, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_kct_test_state_answer_cardinality( test_state, list_utilities.make_plist( $list203, $list205 ) );
    final SubLObject exact_bindings = kct_utils.kct_exact_binding_sets( test_spec, defining_mt );
    final SubLObject wanted_bindings = kct_utils.kct_wanted_binding_sets( test_spec, defining_mt );
    final SubLObject unwanted_bindings = kct_utils.kct_unwanted_binding_sets( test_spec, defining_mt );
    final SubLObject bindings_unimportantP = kct_utils.kct_bindings_unimportantP( test_spec, defining_mt );
    final SubLObject answers_cardinality = kct_utils.kct_binding_sets_cardinality( test_spec, defining_mt );
    final SubLObject answers_min_cardinality = kct_utils.kct_binding_sets_min_cardinality( test_spec, defining_mt );
    final SubLObject answers_max_cardinality = kct_utils.kct_binding_sets_max_cardinality( test_spec, defining_mt );
    kct_test_state_set_cardinality( test_state, $kw206$N, answers_cardinality );
    kct_test_state_set_cardinality( test_state, $kw207$MIN, answers_min_cardinality );
    kct_test_state_set_cardinality( test_state, $kw208$MAX, answers_max_cardinality );
    if( NIL != bindings_unimportantP )
    {
      _csetf_kct_test_state_answer_status( test_state, $kw209$UNIMPORTANT );
    }
    else if( NIL != exact_bindings || NIL != kct_utils.kct_exact_set_of_binding_sets( test_spec, defining_mt ) )
    {
      _csetf_kct_test_state_answer_status( test_state, $kw210$EXACT );
      SubLObject cdolist_list_var = exact_bindings;
      SubLObject binding_set = NIL;
      binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_kct_answer( binding_set, test_state, $kw211$WANTED );
        cdolist_list_var = cdolist_list_var.rest();
        binding_set = cdolist_list_var.first();
      }
    }
    else if( NIL != wanted_bindings || NIL != unwanted_bindings )
    {
      _csetf_kct_test_state_answer_status( test_state, $kw212$INEXACT );
      SubLObject cdolist_list_var = wanted_bindings;
      SubLObject binding_set = NIL;
      binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != bindings.kb_binding_set_p( binding_set ) )
        {
          new_kct_answer( binding_set, test_state, $kw211$WANTED );
        }
        else
        {
          kct_test_state_add_note( test_state, Sequences.cconcatenate( $str213$The_wanted_binding_set__, new SubLObject[] { format_nil.format_nil_a_no_copy( binding_set ), $str214$__was_not_a_KB_BINDING_SET_P____d
          } ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding_set = cdolist_list_var.first();
      }
      cdolist_list_var = unwanted_bindings;
      binding_set = NIL;
      binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != bindings.kb_binding_set_p( binding_set ) )
        {
          new_kct_answer( binding_set, test_state, $kw215$UNWANTED );
        }
        else
        {
          kct_test_state_add_note( test_state, Sequences.cconcatenate( $str216$The_unwanted_binding_set__, new SubLObject[] { format_nil.format_nil_a_no_copy( binding_set ), $str214$__was_not_a_KB_BINDING_SET_P____d
          } ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding_set = cdolist_list_var.first();
      }
    }
    else
    {
      _csetf_kct_test_state_answer_status( test_state, $kw217$UNSPECIFIED );
    }
    _csetf_kct_test_state_categories( test_state, kct_utils.kct_asserted_test_collections( test_spec, defining_mt ) );
    _csetf_kct_test_state_metrics( test_state, kct_utils.kct_test_metrics( test_spec, defining_mt ) );
    _csetf_kct_test_state_cyclists( test_state, kct_utils.kct_responsible_cyclists( test_spec, UNPROVIDED ) );
    return test_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 25423L)
  public static SubLObject cb_kct_new_test_state_from_inference(final SubLObject inference)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject test_state = make_kct_test_state( UNPROVIDED );
    final SubLObject query_state = cb_kb_query_state.cb_kbq_new_query_state_from_inference( inference, test_state );
    _csetf_kct_test_state_test_spec( test_state, kct_lookup_test_spec_by_inference( inference ) );
    _csetf_kct_test_state_query_state( test_state, query_state );
    _csetf_kct_test_state_save_mt( test_state, kct_variables.kct_mt() );
    _csetf_kct_test_state_answer_options_index( test_state, id_index.new_id_index( UNPROVIDED, UNPROVIDED ) );
    _csetf_kct_test_state_answer_options_bindings_index( test_state, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_kct_test_state_answer_cardinality( test_state, list_utilities.make_plist( $list203, $list205 ) );
    return test_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 26358L)
  public static SubLObject kct_test_state_exact_bindings(final SubLObject test_state)
  {
    return kct_test_state_bindings_of_type( test_state, $kw210$EXACT, $kw211$WANTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 26543L)
  public static SubLObject kct_test_state_wanted_bindings(final SubLObject test_state)
  {
    return kct_test_state_bindings_of_type( test_state, $kw212$INEXACT, $kw211$WANTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 26717L)
  public static SubLObject kct_test_state_unwanted_bindings(final SubLObject test_state)
  {
    return kct_test_state_bindings_of_type( test_state, $kw212$INEXACT, $kw215$UNWANTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 26895L)
  public static SubLObject kct_test_state_unspecified_bindings(final SubLObject test_state)
  {
    return kct_test_state_bindings_of_type( test_state, NIL, $kw217$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 27074L)
  public static SubLObject kct_test_state_bindings_unimportantP(final SubLObject test_state)
  {
    return Equality.eq( kct_test_state_answer_status( test_state ), $kw209$UNIMPORTANT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 27212L)
  public static SubLObject kct_test_state_no_answersP(final SubLObject test_state)
  {
    return makeBoolean( kct_test_state_answer_status( test_state ) == $kw210$EXACT && NIL == kct_test_state_exact_bindings( test_state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 27397L)
  public static SubLObject kct_test_state_bindings_of_type(final SubLObject test_state, final SubLObject exactness, final SubLObject wantedness)
  {
    if( NIL != exactness && !kct_test_state_answer_status( test_state ).eql( exactness ) )
    {
      return NIL;
    }
    SubLObject binding_sets = NIL;
    final SubLObject idx;
    final SubLObject v_id_index = idx = kct_test_state_answer_options_index( test_state );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw218$SKIP ) )
    {
      final SubLObject idx_$66 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$66, $kw218$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$66 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject kct_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          kct_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( kct_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw218$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( kct_answer ) )
            {
              kct_answer = $kw218$SKIP;
            }
            if( kct_answer_status( kct_answer ).eql( wantedness ) )
            {
              binding_sets = ConsesLow.cons( kct_answer_binding_set( kct_answer ), binding_sets );
            }
          }
        }
      }
      final SubLObject idx_$67 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$67 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$67 );
        SubLObject id2 = NIL;
        SubLObject kct_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            kct_answer2 = Hashtables.getEntryValue( cdohash_entry );
            if( kct_answer_status( kct_answer2 ).eql( wantedness ) )
            {
              binding_sets = ConsesLow.cons( kct_answer_binding_set( kct_answer2 ), binding_sets );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( binding_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28072L)
  public static SubLObject cb_clear_kct_test_being_saved()
  {
    $cb_kct_test_being_saved$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28177L)
  public static SubLObject cb_kct_test_being_saved()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_kct_test_being_saved$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28256L)
  public static SubLObject cb_set_kct_test_being_saved(final SubLObject kct_test_state)
  {
    $cb_kct_test_being_saved$.setDynamicValue( kct_test_state );
    return kct_test_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject kct_answer_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject kct_answer_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $kct_answer_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject kct_answer_binding_set(final SubLObject v_object)
  {
    assert NIL != kct_answer_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject kct_answer_status(final SubLObject v_object)
  {
    assert NIL != kct_answer_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject kct_answer_id(final SubLObject v_object)
  {
    assert NIL != kct_answer_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject _csetf_kct_answer_binding_set(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_answer_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject _csetf_kct_answer_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_answer_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject _csetf_kct_answer_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kct_answer_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject make_kct_answer(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $kct_answer_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw234$BINDING_SET ) )
      {
        _csetf_kct_answer_binding_set( v_new, current_value );
      }
      else if( pcase_var.eql( $kw235$STATUS ) )
      {
        _csetf_kct_answer_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw236$ID ) )
      {
        _csetf_kct_answer_id( v_new, current_value );
      }
      else
      {
        Errors.error( $str195$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject visit_defstruct_kct_answer(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw196$BEGIN, $sym237$MAKE_KCT_ANSWER, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw234$BINDING_SET, kct_answer_binding_set( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw235$STATUS, kct_answer_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw198$SLOT, $kw236$ID, kct_answer_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw199$END, $sym237$MAKE_KCT_ANSWER, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28393L)
  public static SubLObject visit_defstruct_object_kct_answer_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_kct_answer( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 28558L)
  public static SubLObject new_kct_answer(final SubLObject binding_set, final SubLObject test_state, SubLObject status)
  {
    if( status == UNPROVIDED )
    {
      status = $kw217$UNSPECIFIED;
    }
    assert NIL != bindings.kb_binding_set_p( binding_set ) : binding_set;
    assert NIL != kct_test_state_p( test_state ) : test_state;
    assert NIL != Types.keywordp( status ) : status;
    final SubLObject v_id_index = kct_test_state_answer_options_index( test_state );
    final SubLObject bindings_index = kct_test_state_answer_options_bindings_index( test_state );
    final SubLObject id = id_index.id_index_reserve( v_id_index );
    final SubLObject kct_answer = make_kct_answer( UNPROVIDED );
    _csetf_kct_answer_binding_set( kct_answer, binding_set );
    _csetf_kct_answer_status( kct_answer, status );
    _csetf_kct_answer_id( kct_answer, id );
    id_index.id_index_enter( v_id_index, id, kct_answer );
    dictionary.dictionary_enter( bindings_index, binding_set, kct_answer );
    return kct_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 29262L)
  public static SubLObject kct_answer_id_count(final SubLObject test_state)
  {
    assert NIL != kct_test_state_p( test_state ) : test_state;
    final SubLObject v_id_index = kct_test_state_answer_options_index( test_state );
    return id_index.id_index_count( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 29518L)
  public static SubLObject kct_answer_id_lookup(final SubLObject test_state, final SubLObject id)
  {
    assert NIL != kct_test_state_p( test_state ) : test_state;
    final SubLObject v_id_index = kct_test_state_answer_options_index( test_state );
    return id_index.id_index_lookup( v_id_index, id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 29777L)
  public static SubLObject kct_answer_bindings_lookup(final SubLObject test_state, final SubLObject binding_set)
  {
    assert NIL != kct_test_state_p( test_state ) : test_state;
    assert NIL != bindings.kb_binding_set_p( binding_set ) : binding_set;
    final SubLObject bindings_index = kct_test_state_answer_options_bindings_index( test_state );
    return dictionary.dictionary_lookup( bindings_index, binding_set, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 30135L)
  public static SubLObject kct_answer_id_remove(final SubLObject test_state, final SubLObject id)
  {
    assert NIL != kct_test_state_p( test_state ) : test_state;
    final SubLObject v_id_index = kct_test_state_answer_options_index( test_state );
    return id_index.id_index_remove( v_id_index, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 30419L)
  public static SubLObject set_kct_answer_status(final SubLObject kct_answer, final SubLObject status)
  {
    assert NIL != kct_answer_p( kct_answer ) : kct_answer;
    assert NIL != Types.keywordp( status ) : status;
    _csetf_kct_answer_status( kct_answer, status );
    return kct_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 30733L)
  public static SubLObject cb_link_kct_edit(final SubLObject test_spec, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str73$_Edit_Test_;
    }
    assert NIL != kct_utils.kct_test_spec_p( test_spec, UNPROVIDED ) : test_spec;
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    cyc_file_dependencies.javascript( $kw241$OVERLIB );
    if( $str242$Edit_this_instance_of___KBContent.isString() )
    {
      final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover( $str242$Edit_this_instance_of___KBContent, NIL, NIL, NIL );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str243$cb_edit_test__A, cb_utilities.cb_fort_identifier( test_spec ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( onmouseover );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str244$nd___ );
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
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 31120L)
  public static SubLObject cb_edit_test(final SubLObject args)
  {
    final SubLObject test_spec = cb_utilities.cb_guess_fort( args.first(), UNPROVIDED );
    if( NIL == kct_utils.kct_test_spec_p( test_spec, UNPROVIDED ) )
    {
      return cb_utilities.cb_error( $str246$_A_does_not_denote_a_test_specifi, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_set_kct_test_being_saved( cb_kct_new_test_state_from_test_spec( test_spec ) );
    cb_kb_query_state.cb_set_kb_query_being_saved( kct_test_state_query_state( cb_kct_test_being_saved() ) );
    cb_confirm_save_as_test( test_spec );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 31555L)
  public static SubLObject cb_link_kct_save(final SubLObject inference, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str248$_Save_As_Test_;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw249$SELF );
    cyc_file_dependencies.javascript( $kw241$OVERLIB );
    if( $str250$Create_an_instance_of___KBContent.isString() )
    {
      final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover( $str250$Create_an_instance_of___KBContent, NIL, NIL, NIL );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str251$cb_save_as_test__A__A, inference_datastructures_problem_store.problem_store_suid( inference_datastructures_inference
          .inference_problem_store( inference ) ), inference_datastructures_inference.inference_suid( inference ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( onmouseover );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str244$nd___ );
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
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 32169L)
  public static SubLObject cb_save_as_test(final SubLObject args)
  {
    SubLObject store_id_string = NIL;
    SubLObject inference_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list254 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list254 );
    inference_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list254 );
      return NIL;
    }
    final SubLObject store_id = reader.parse_integer( store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject inference_id = reader.parse_integer( inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( store_id, inference_id );
    final SubLObject test_spec = ( NIL != inference ) ? kct_lookup_test_spec_by_inference( inference ) : NIL;
    if( NIL == inference )
    {
      return cb_utilities.cb_error( $str255$Inference__S_in_problem_store__S_, inference_id, store_id, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_set_kct_test_being_saved( cb_kct_new_test_state_from_inference( inference ) );
    cb_kb_query_state.cb_set_kb_query_being_saved( kct_test_state_query_state( cb_kct_test_being_saved() ) );
    if( NIL != kct_utils.kct_test_spec_p( test_spec, UNPROVIDED ) )
    {
      _csetf_kct_test_state_test_spec( cb_kct_test_being_saved(), test_spec );
    }
    return cb_confirm_save_as_test( test_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 32999L)
  public static SubLObject cb_confirm_save_as_test(SubLObject test_spec)
  {
    if( test_spec == UNPROVIDED )
    {
      test_spec = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title = ( NIL != test_spec ) ? $str257$Edit_Test_Specification : $str258$Save_Inference_Settings_and_Resul;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$68 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        html_utilities.html_princ( title );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        html_complete.html_complete_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_script_utilities.cb_hoverover_page_init();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str41$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str259$cb_handle_confirm_save_as_test, NIL, UNPROVIDED );
              cb_show_save_as_test_header( title );
              html_utilities.html_newline( UNPROVIDED );
              cb_save_as_test_submit_section( UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_query.cb_query_new_inference_mt_section( cb_kb_query_state.kb_query_state_best_sentence( cb_kb_query_state.cb_kb_query_being_saved() ), cb_kb_query_state.kb_query_state_best_mt( cb_kb_query_state
                  .cb_kb_query_being_saved() ), NIL );
              html_utilities.html_newline( UNPROVIDED );
              cb_kb_query.cb_kb_query_warn_of_extra_mt();
              html_utilities.html_newline( UNPROVIDED );
              cb_query.cb_query_new_inference_sentence_section( cb_kb_query_state.kb_query_state_best_sentence( cb_kb_query_state.cb_kb_query_being_saved() ), NIL );
              html_utilities.html_newline( UNPROVIDED );
              cb_kb_query.cb_kb_query_warn_of_extra_sentence();
              html_utilities.html_newline( UNPROVIDED );
              cb_query.cb_query_new_inference_non_explanatory_sentence_section( cb_kb_query_state.kb_query_state_non_explanatory_sentence( cb_kb_query_state.cb_kb_query_being_saved() ), NIL );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_kb_query.cb_kb_query_parameters_section( UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_kct_test_categories_section( UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_kct_test_metrics_section( UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_kct_responsible_cyclists_section( UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$69, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$68, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 34866L)
  public static SubLObject cb_show_save_as_test_header(final SubLObject title)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject size_val = FIVE_INTEGER;
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != size_val )
    {
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size_val );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_query.cb_princ_strong_with_explanation( title, $str260$An_interface_for_creating_and_edi, $str261$Save_As_Test, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    cb_query.cb_princ_strong_with_explanation( $str262$Goto_section__, $str263$Shortcut_links_to_sections_that_a, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_with_target_reference_and_explanation( $str264$mt_section, $str265$_Mt_, $str266$Change_the_Microtheory_settings_t, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_with_target_reference_and_explanation( $str267$sentence_section, $str268$_Sentence_, $str269$Change_the_CycL_sentence_to_be_us, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_with_target_reference_and_explanation( $str270$parameters_section, $str271$_Inference_Parameters_, $str272$Adjust_the_inference_parameters_a, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_with_target_reference_and_explanation( $str273$categories_section, $str274$_Test_Categories_, $str275$Specify_instances_of_KBContentTes, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_with_target_reference_and_explanation( $str276$metrics_section, $str277$_Test_Metrics_, $str278$Specify_metrics_that_should_be_co, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_with_target_reference_and_explanation( $str279$cyclists_section, $str280$_Responsible_Cyclists_, $str281$Specify_cyclists_that_are_respons, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != kct_test_state_notes( cb_kct_test_being_saved() ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str282$Notes_ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      SubLObject cdolist_list_var = kct_test_state_notes( cb_kct_test_being_saved() );
      SubLObject note = NIL;
      note = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_princ( note );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        note = cdolist_list_var.first();
      }
    }
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 37251L)
  public static SubLObject cb_save_as_test_submit_section(SubLObject allow_editP)
  {
    if( allow_editP == UNPROVIDED )
    {
      allow_editP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_newline( UNPROVIDED );
    final SubLObject name = kct_test_state_name( cb_kct_test_being_saved() );
    final SubLObject test_spec = kct_test_state_test_spec( cb_kct_test_being_saved() );
    html_utilities.html_indent( UNPROVIDED );
    cb_query.cb_princ_strong_with_explanation( $str283$Test_Name__, $str284$The_constant_name_to_save_the_tes, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != allow_editP )
    {
      html_utilities.html_text_input( $str285$name, name, $int48$40 );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      if( NIL != test_spec )
      {
        cb_utilities.cb_form( test_spec, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        html_utilities.html_princ( name );
      }
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    if( NIL != allow_editP )
    {
      html_utilities.html_indent( UNPROVIDED );
      cb_query.cb_submit_input_with_explanation( $str286$Next__Specify_Expected_Results_, $str287$Store_the_specified_sentence__mt_, $str288$new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_newline( TWO_INTEGER );
    if( NIL != allow_editP )
    {
      html_utilities.html_reset_input( $str289$Reset_Values );
      html_utilities.html_newline( UNPROVIDED );
    }
    dhtml_macros.dhtml_switch_visibility_links( $str290$cb_kct_save_mt, $str291$Show, $str292$Hide );
    final SubLObject initial_visibility = $kw293$INVISIBLE;
    final SubLObject size_val = FOUR_INTEGER;
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != size_val )
    {
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size_val );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_query.cb_princ_strong_with_explanation( $str294$Save_In_Mt__, $str295$The_microtheory_in_which_to_save_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    dhtml_macros.dhtml_set_switched_visibility( $str290$cb_kct_save_mt, initial_visibility, $kw296$PARAGRAPH );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str290$cb_kct_save_mt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != allow_editP )
      {
        cb_form_widgets.cb_mt_input_section( kct_test_state_save_mt( cb_kct_test_being_saved() ), $list297 );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        cb_utilities.cb_form( kct_test_state_save_mt( cb_kct_test_being_saved() ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 39086L)
  public static SubLObject cb_kct_test_categories_section(SubLObject allow_editP)
  {
    if( allow_editP == UNPROVIDED )
    {
      allow_editP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_target_definition( $str273$categories_section );
    dhtml_macros.dhtml_switch_visibility_links( $str298$test_categories, $str291$Show, $str292$Hide );
    final SubLObject size_val = FOUR_INTEGER;
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != size_val )
    {
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size_val );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_query.cb_princ_strong_with_explanation( $str299$Test_Categories__optional_, $str300$Instances_of_KBContentTestSpecifi, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    dhtml_macros.dhtml_set_switched_visibility( $str298$test_categories, $kw301$VISIBLE, $kw296$PARAGRAPH );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str298$test_categories );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject current_categories = kct_test_state_categories( cb_kct_test_being_saved() );
      final SubLObject kct_regression_test_checkedP = list_utilities.member_eqP( $const302$KBContentRegressionTest, current_categories );
      if( NIL == kct_regression_test_checkedP )
      {
        current_categories = ConsesLow.cons( $const302$KBContentRegressionTest, current_categories );
      }
      SubLObject cdolist_list_var = current_categories;
      SubLObject category = NIL;
      category = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        if( NIL != allow_editP )
        {
          final SubLObject checkedP = makeBoolean( NIL == kb_utilities.kbeq( category, $const302$KBContentRegressionTest ) || NIL != kct_regression_test_checkedP );
          html_utilities.html_checkbox_input( $str303$category, cb_utilities.cb_fort_identifier( category ), checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          cb_utilities.cb_form( category, UNPROVIDED, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        category = cdolist_list_var.first();
      }
      if( NIL != allow_editP )
      {
        final SubLObject candidates = isa.all_fort_instances_in_all_mts( $const53$KBContentTestSpecificationType );
        if( Sequences.length( candidates ).numG( $int304$100 ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_complete.html_complete_button( $str305$category_name, $str45$Complete, $const53$KBContentTestSpecificationType, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ_strong( $str306$Add_a_Test_Category__ );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_text_input( $str305$category_name, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ_strong( $str306$Add_a_Test_Category__ );
          html_utilities.html_indent( UNPROVIDED );
          cb_utilities.cb_fort_list_selector( $str307$category_id, Sort.sort( candidates, Symbols.symbol_function( $sym308$STRING_ ), Symbols.symbol_function( $sym309$FORT_NAME ) ), NIL, ONE_INTEGER, Symbols
              .symbol_function( IDENTITY ), T, UNPROVIDED );
        }
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 40866L)
  public static SubLObject cb_kct_test_metrics_section(SubLObject allow_editP)
  {
    if( allow_editP == UNPROVIDED )
    {
      allow_editP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_target_definition( $str276$metrics_section );
    dhtml_macros.dhtml_switch_visibility_links( $str310$test_metrics, $str291$Show, $str292$Hide );
    final SubLObject size_val = FOUR_INTEGER;
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != size_val )
    {
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size_val );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_query.cb_princ_strong_with_explanation( $str311$Test_Metrics_to_Gather, $str312$The_metrics_that_should_be_gather, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    dhtml_macros.dhtml_set_switched_visibility( $str310$test_metrics, $kw301$VISIBLE, $kw296$PARAGRAPH );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str310$test_metrics );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject current_metrics = kct_test_state_metrics( cb_kct_test_being_saved() );
      if( NIL == current_metrics && NIL == allow_editP )
      {
        html_utilities.html_princ_strong( $str313$None_selected_ );
      }
      SubLObject cdolist_list_var = ctest_utils.ctest_all_kb_test_metric_constants();
      SubLObject metric_constant = NIL;
      metric_constant = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject selected = conses_high.member( metric_constant, current_metrics, UNPROVIDED, UNPROVIDED );
        if( NIL != allow_editP )
        {
          html_utilities.html_checkbox_input( $str314$metric, cb_utilities.cb_fort_identifier( metric_constant ), selected, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
        }
        if( NIL != allow_editP || NIL != selected )
        {
          cb_utilities.cb_form( metric_constant, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        metric_constant = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 41941L)
  public static SubLObject cb_kct_responsible_cyclists_section(SubLObject allow_editP)
  {
    if( allow_editP == UNPROVIDED )
    {
      allow_editP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_target_definition( $str279$cyclists_section );
    dhtml_macros.dhtml_switch_visibility_links( $str315$cyclists, $str291$Show, $str292$Hide );
    final SubLObject size_val = FOUR_INTEGER;
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != size_val )
    {
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size_val );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_query.cb_princ_strong_with_explanation( $str316$Responsible_Cyclists__required_, $str317$The_cyclists_who_are_responsible_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    dhtml_macros.dhtml_set_switched_visibility( $str315$cyclists, $kw301$VISIBLE, $kw296$PARAGRAPH );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str315$cyclists );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      final SubLObject cyclists = kct_test_state_cyclists( cb_kct_test_being_saved() );
      if( NIL != cyclists )
      {
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( TWO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( TWO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != allow_editP )
            {
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw318$CENTER ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ_strong( $str319$Selected_ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw318$CENTER ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str320$Cyclist );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          SubLObject cdolist_list_var = cyclists;
          SubLObject cyclist = NIL;
          cyclist = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != allow_editP )
              {
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw318$CENTER ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_checkbox_input( $str321$cyclist, cb_utilities.cb_fort_identifier( cyclist ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw318$CENTER ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_utilities.cb_form( cyclist, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$76, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            cyclist = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      }
      if( NIL != allow_editP )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_complete.html_complete_button( $str322$cyclist_name, $str45$Complete, $const323$HumanCyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_princ_strong( $str324$Add_a_Cyclist__ );
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_text_input( $str322$cyclist_name, ( NIL != cyclists ) ? NIL : operation_communication.the_cyclist(), UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 43385L)
  public static SubLObject cb_handle_confirm_save_as_test(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject glosses = cb_kb_query.cb_kb_query_extract_glosses( args );
    thread.resetMultipleValues();
    final SubLObject name = cb_kb_query.cb_kb_query_extract_name( args );
    final SubLObject name_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != name_error )
    {
      return cb_utilities.cb_error( $str325$_A, name_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject defining_mt = cb_kb_query.cb_kb_query_extract_defining_mt( args );
    final SubLObject defining_mt_error = thread.secondMultipleValue();
    final SubLObject defining_mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != defining_mt_error )
    {
      return cb_utilities.cb_error( $str325$_A, defining_mt_error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject v_inference_parameters = cb_query.cb_query_extract_parameters( args, NIL, UNPROVIDED );
    final SubLObject parameter_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != parameter_error )
    {
      return cb_utilities.cb_error( $str325$_A, parameter_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject mt = cb_form_widgets.cb_extract_mt_input( args, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list326 );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      return cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_error_string, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject non_explanatory_sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list327 );
    final SubLObject non_explanatory_sentence_error = thread.secondMultipleValue();
    final SubLObject non_explanatory_sentence_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != non_explanatory_sentence_error )
    {
      return cb_form_widgets.cb_el_sentence_error( non_explanatory_sentence_error, non_explanatory_sentence_error_string, $list328 );
    }
    thread.resetMultipleValues();
    final SubLObject test_categories = cb_kct_extract_test_categories( args );
    final SubLObject category_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != category_error )
    {
      return cb_utilities.cb_error( $str325$_A, category_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject metric_constants = cb_kct_extract_test_metrics( args );
    final SubLObject metric_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != metric_error )
    {
      return cb_utilities.cb_error( $str325$_A, metric_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject responsible_cyclists = cb_kct_extract_responsible_cyclists( args );
    final SubLObject cyclist_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != cyclist_error )
    {
      return cb_utilities.cb_error( $str325$_A, cyclist_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject folder_mt_pairs = cb_kb_query.cb_kb_query_extract_folder_mt_pairs( args );
    final SubLObject folder_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != folder_error )
    {
      return cb_utilities.cb_error( $str325$_A, folder_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    _csetf_kct_test_state_name( cb_kct_test_being_saved(), name );
    _csetf_kct_test_state_save_mt( cb_kct_test_being_saved(), defining_mt );
    _csetf_kct_test_state_categories( cb_kct_test_being_saved(), test_categories );
    _csetf_kct_test_state_metrics( cb_kct_test_being_saved(), metric_constants );
    _csetf_kct_test_state_cyclists( cb_kct_test_being_saved(), responsible_cyclists );
    cb_kb_query_state._csetf_kb_query_state_template_glosses( cb_kb_query_state.cb_kb_query_being_saved(), glosses );
    cb_kb_query_state._csetf_kb_query_state_save_mt( cb_kb_query_state.cb_kb_query_being_saved(), defining_mt );
    cb_kb_query_state._csetf_kb_query_state_query_properties( cb_kb_query_state.cb_kb_query_being_saved(), v_inference_parameters );
    cb_kb_query_state._csetf_kb_query_state_query_mts( cb_kb_query_state.cb_kb_query_being_saved(), ConsesLow.list( mt ) );
    cb_kb_query_state._csetf_kb_query_state_sentences( cb_kb_query_state.cb_kb_query_being_saved(), ConsesLow.list( sentence ) );
    cb_kb_query_state._csetf_kb_query_state_non_explanatory_sentence( cb_kb_query_state.cb_kb_query_being_saved(), non_explanatory_sentence );
    cb_kb_query_state._csetf_kb_query_state_template_folder_mt_pairs( cb_kb_query_state.cb_kb_query_being_saved(), folder_mt_pairs );
    _csetf_kct_test_state_query_state( cb_kct_test_being_saved(), cb_kb_query_state.cb_kb_query_being_saved() );
    cb_kb_query_state._csetf_kb_query_state_test_state( cb_kb_query_state.cb_kb_query_being_saved(), cb_kct_test_being_saved() );
    final SubLObject test_spec = kct_test_state_test_spec( cb_kct_test_being_saved() );
    final SubLObject existing_name = ( NIL != constant_handles.constant_p( test_spec ) ) ? constants_high.constant_name( test_spec ) : NIL;
    if( NIL != constant_completion_high.valid_constant_name_p( name ) && NIL != constant_completion_high.valid_constant_name_p( existing_name ) && !name.equal( existing_name ) )
    {
      _csetf_kct_test_state_test_spec( cb_kct_test_being_saved(), NIL );
    }
    final SubLObject inference = cb_kb_query_state.kb_query_state_inference( cb_kb_query_state.cb_kb_query_being_saved() );
    if( NIL != inference_datastructures_inference.inference_p( inference ) && inference_datastructures_inference.inference_input_el_query( inference ).equal( sentence ) )
    {
      thread.resetMultipleValues();
      final SubLObject current_answers = cb_query_browser.cb_inference_current_answers( inference );
      final SubLObject free = thread.secondMultipleValue();
      final SubLObject ignore = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = current_answers;
      SubLObject inference_answer = NIL;
      inference_answer = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject binding_set = bindings.kbify_inference_binding_set( inference_datastructures_inference.inference_answer_bindings( inference_answer ) );
        if( NIL == kct_answer_bindings_lookup( cb_kct_test_being_saved(), binding_set ) )
        {
          new_kct_answer( binding_set, cb_kct_test_being_saved(), UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        inference_answer = cdolist_list_var.first();
      }
    }
    cb_kct_prune_test_state_answers_for_sentence( cb_kct_test_being_saved() );
    return cb_kct_specify_test_results( cb_kct_test_being_saved() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 48131L)
  public static SubLObject cb_kct_prune_test_state_answers_for_sentence(final SubLObject test_state)
  {
    final SubLObject query_state = kct_test_state_query_state( test_state );
    final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence( query_state );
    final SubLObject free_variables = ( NIL != el_utilities.el_implication_p( sentence ) ) ? el_utilities.conditional_sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : el_utilities.sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject idx;
    final SubLObject answer_index = idx = kct_test_state_answer_options_index( test_state );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw218$SKIP ) )
    {
      final SubLObject idx_$79 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$79, $kw218$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$79 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject kct_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          kct_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( kct_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw218$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( kct_answer ) )
            {
              kct_answer = $kw218$SKIP;
            }
            if( NIL == list_utilities.sets_equalP( bindings.kb_binding_set_variables( kct_answer_binding_set( kct_answer ) ), free_variables, UNPROVIDED ) )
            {
              kct_answer_id_remove( test_state, id );
            }
          }
        }
      }
      final SubLObject idx_$80 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$80 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$80 );
        SubLObject id2 = NIL;
        SubLObject kct_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            kct_answer2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL == list_utilities.sets_equalP( bindings.kb_binding_set_variables( kct_answer_binding_set( kct_answer2 ) ), free_variables, UNPROVIDED ) )
            {
              kct_answer_id_remove( test_state, id2 );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return test_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 48861L)
  public static SubLObject cb_kct_extract_test_categories(final SubLObject args)
  {
    final SubLObject category_id_strings = html_utilities.html_extract_input_values( $str303$category, args );
    SubLObject category_name = html_utilities.html_extract_input( $str305$category_name, args );
    final SubLObject category_from_select = cb_utilities.cb_decode_fort_list_selector_result( $str307$category_id, args );
    SubLObject new_category = NIL;
    SubLObject all_categories = NIL;
    SubLObject error = NIL;
    if( NIL != string_utilities.empty_stringP( category_name ) )
    {
      category_name = NIL;
    }
    if( NIL != constant_completion_high.valid_constant_name_p( category_name ) )
    {
      new_category = constants_high.find_constant( category_name );
    }
    SubLObject cdolist_list_var = category_id_strings;
    SubLObject category_id_string = NIL;
    category_id_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_stringP( category_id_string ) )
      {
        final SubLObject category = cb_utilities.cb_guess_term( category_id_string, UNPROVIDED );
        if( NIL == kct_utils.kct_test_collection_p( category, UNPROVIDED ) )
        {
          error = PrintLow.format( NIL, $str330$The_ID___A__did_not_yield_a_KBCon, category_id_string );
        }
        if( NIL == error )
        {
          all_categories = ConsesLow.cons( category, all_categories );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      category_id_string = cdolist_list_var.first();
    }
    if( NIL != new_category && NIL != kct_utils.kct_test_collection_p( new_category, UNPROVIDED ) )
    {
      all_categories = ConsesLow.cons( new_category, all_categories );
    }
    else if( NIL != category_name )
    {
      error = PrintLow.format( NIL, $str331$The_name___S__did_not_denote_a_KB, category_name );
    }
    if( NIL == cb_utilities.cb_fort_list_none_selected_p( category_from_select ) )
    {
      if( NIL != kct_utils.kct_test_collection_p( category_from_select, UNPROVIDED ) )
      {
        all_categories = ConsesLow.cons( category_from_select, all_categories );
      }
      else
      {
        error = PrintLow.format( NIL, $str332$The_object___S__extracted_from_th, category_from_select );
      }
    }
    return Values.values( all_categories, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 50362L)
  public static SubLObject cb_kct_extract_test_metrics(final SubLObject args)
  {
    final SubLObject metric_id_strings = html_utilities.html_extract_input_values( $str314$metric, args );
    SubLObject metric_constants = NIL;
    SubLObject error = NIL;
    SubLObject cdolist_list_var = metric_id_strings;
    SubLObject metric_id_string = NIL;
    metric_id_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_stringP( metric_id_string ) )
      {
        final SubLObject metric_constant = cb_utilities.cb_guess_term( metric_id_string, UNPROVIDED );
        if( NIL == ctest_utils.ctest_kb_test_metric_p( metric_constant ) )
        {
          error = PrintLow.format( NIL, $str333$The_ID___A__did_not_yield_a_Test_, metric_id_string );
        }
        if( NIL == error )
        {
          metric_constants = ConsesLow.cons( metric_constant, metric_constants );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      metric_id_string = cdolist_list_var.first();
    }
    return Values.values( metric_constants, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 50947L)
  public static SubLObject cb_kct_extract_responsible_cyclists(final SubLObject args)
  {
    final SubLObject cyclist_id_strings = html_utilities.html_extract_input_values( $str321$cyclist, args );
    final SubLObject cyclist_name = html_utilities.html_extract_input( $str322$cyclist_name, args );
    final SubLObject new_cyclist = ( NIL != constant_completion_high.valid_constant_name_p( cyclist_name ) ) ? constants_high.find_constant( cyclist_name ) : NIL;
    SubLObject all_cyclists = NIL;
    SubLObject error = NIL;
    SubLObject cdolist_list_var = cyclist_id_strings;
    SubLObject cyclist_id_string = NIL;
    cyclist_id_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_stringP( cyclist_id_string ) )
      {
        final SubLObject cyclist = cb_utilities.cb_guess_term( cyclist_id_string, UNPROVIDED );
        if( NIL == kb_accessors.cyclistP( cyclist ) )
        {
          error = PrintLow.format( NIL, $str334$The_ID___A__did_not_yield_a_Human, cyclist_id_string );
        }
        if( NIL == error )
        {
          all_cyclists = ConsesLow.cons( cyclist, all_cyclists );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      cyclist_id_string = cdolist_list_var.first();
    }
    if( NIL != kb_accessors.cyclistP( new_cyclist ) )
    {
      all_cyclists = ConsesLow.cons( new_cyclist, all_cyclists );
    }
    else if( NIL == all_cyclists )
    {
      error = PrintLow.format( NIL, $str335$The_name___A__did_not_denote_a_Hu, cyclist_name );
    }
    return Values.values( all_cyclists, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 51911L)
  public static SubLObject cb_kct_toggle_rowcolor()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $cb_kct_rowcolor$.getDynamicValue( thread ).equal( $str337$_ccccff ) )
    {
      $cb_kct_rowcolor$.setDynamicValue( $str27$_ffffff, thread );
    }
    else
    {
      $cb_kct_rowcolor$.setDynamicValue( $str337$_ccccff, thread );
    }
    return $cb_kct_rowcolor$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 52134L)
  public static SubLObject cb_kct_specify_test_results(final SubLObject test_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_state = kct_test_state_query_state( test_state );
    final SubLObject exact_bindings = kct_test_state_exact_bindings( test_state );
    final SubLObject wanted_bindings = kct_test_state_wanted_bindings( test_state );
    final SubLObject unwanted_bindings = kct_test_state_unwanted_bindings( test_state );
    final SubLObject unspecified_bindings = kct_test_state_unspecified_bindings( test_state );
    final SubLObject bindings_unimportantP = kct_test_state_bindings_unimportantP( test_state );
    final SubLObject answer_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw206$N, UNPROVIDED );
    final SubLObject answer_min_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw207$MIN, UNPROVIDED );
    final SubLObject answer_max_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw208$MAX, UNPROVIDED );
    final SubLObject title = $str338$Specify_Test_Expectations;
    final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence( query_state );
    final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt( query_state );
    final SubLObject free_el_variables = ( NIL != el_utilities.el_implication_p( sentence ) ) ? el_utilities.conditional_sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : el_utilities.sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject no_free_vars_sentence = Types.sublisp_null( free_el_variables );
    final SubLObject title_var = title;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$81 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        dhtml_macros.html_basic_cb_scripts();
        html_complete.html_complete_script();
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str125$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str126$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str127$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str128$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str24$Refresh );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str339$reloadCurrentFrame__reloadFrameBu );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_script_utilities.cb_hoverover_page_init();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str41$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str340$cb_handle_specify_test_results, T, UNPROVIDED );
              final SubLObject size_val = FIVE_INTEGER;
              html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != size_val )
              {
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( size_val );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_query.cb_princ_strong_with_explanation( title, $str341$The_interface_for_stating_test_ex, $str338$Specify_Test_Expectations, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
              }
              html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str343$Exactly_ );
                    html_utilities.html_text_input( $str344$cardinality, answer_cardinality, FIVE_INTEGER );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str345$_answers_should_be_found_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$90, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str346$At_least_ );
                    html_utilities.html_text_input( $str347$min_cardinality, answer_min_cardinality, FIVE_INTEGER );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$92, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str345$_answers_should_be_found_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$93, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str348$At_most_ );
                    html_utilities.html_text_input( $str349$max_cardinality, answer_max_cardinality, FIVE_INTEGER );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$95, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str345$_answers_should_be_found_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$94, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_radio_input( $str350$bindings, $str351$unimportant, bindings_unimportantP, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str352$The_bindings_obtained_are_unimpor );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$99, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                if( NIL != no_free_vars_sentence )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_radio_input( $str350$bindings, $str353$proven, makeBoolean( Sequences.length( exact_bindings ).numE( ONE_INTEGER ) && NIL == bindings.kb_binding_set_values( exact_bindings
                          .first() ) ), UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str354$The_query__with_no_free_variables );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_radio_input( $str350$bindings, $str355$none, makeBoolean( NIL == exact_bindings && kct_test_state_answer_status( test_state ) == $kw210$EXACT ), UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$104, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    if( NIL != free_el_variables )
                    {
                      html_utilities.html_princ( $str356$No_bindings_should_be_found_ );
                    }
                    else
                    {
                      html_utilities.html_princ( $str357$The_query__with_no_free_variables );
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$103, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                if( NIL == no_free_vars_sentence )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_radio_input( $str350$bindings, $str358$exact, exact_bindings, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( TWO_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str359$Require_all_and_only_the_wanted_b );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$108, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  final SubLObject checkedP = makeBoolean( NIL != wanted_bindings || NIL != unwanted_bindings );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw342$RIGHT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_input_radio$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str350$bindings );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_princ( $str360$inexact );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      if( NIL != checkedP )
                      {
                        html_utilities.html_simple_attribute( html_macros.$html_input_checked$.getGlobalValue() );
                      }
                      if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                      {
                        html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$110, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( TWO_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str361$Specify_wanted_and_or_unwanted_bi );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$111, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$109, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  if( NIL != exact_bindings || NIL != wanted_bindings || NIL != unwanted_bindings || NIL != unspecified_bindings )
                  {
                    final SubLObject span = Numbers.add( THREE_INTEGER, Sequences.length( free_el_variables ) );
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      if( NIL != span )
                      {
                        html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( span );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ_strong( $str362$Check_wanted_and_unwanted_binding );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$113, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw363$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ_strong( $str364$Wanted );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw363$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ_strong( $str365$Not_Wanted );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw363$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ_strong( $str366$Unspecified );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      cb_query_browser.cb_show_bindings_horizontal_variable_row( free_el_variables, NIL, T );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$114, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                    $cb_kct_rowcolor$.setDynamicValue( $str337$_ccccff, thread );
                    cb_kct_show_wanted_answers( test_state, free_el_variables );
                    cb_kct_show_unwanted_answers( test_state, free_el_variables );
                    cb_kct_show_unspecified_answers( test_state, free_el_variables );
                  }
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              if( NIL != free_el_variables )
              {
                html_utilities.html_newline( UNPROVIDED );
                cb_kct_specify_new_binding_section( sentence, mt, free_el_variables );
              }
              html_utilities.html_newline( TWO_INTEGER );
              cb_query.cb_submit_input_with_explanation( $str367$Save_New_Test, $str368$Creates_a_new___KBContentTest_Ful, $str369$save_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( NIL != kct_test_state_test_spec( cb_kct_test_being_saved() ) )
              {
                cb_query.cb_submit_input_with_explanation( $str370$Overwrite_Existing_Test, $str371$Overwrites_the_existing_test_spec, $str372$overwrite, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_kb_query.cb_multiple_choice_query_options_section( cb_kb_query_state.cb_kb_query_being_saved() );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject size_val2 = FOUR_INTEGER;
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val2 )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val2 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_query.cb_princ_strong_with_explanation( $str373$Test_Definition_So_Far, $str374$The_currently_specified_propertie, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$118, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cb_save_as_test_submit_section( NIL );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kb_query.cb_kb_query_show_mt();
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kb_query.cb_kb_query_show_sentence();
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kb_query.cb_kb_query_show_pragmatics();
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kb_query.cb_kb_query_parameters_section( NIL );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kct_test_categories_section( NIL );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kct_test_metrics_section( NIL );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_kct_responsible_cyclists_section( NIL );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$82, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$81, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 58533L)
  public static SubLObject cb_kct_specify_new_binding_section(final SubLObject sentence, final SubLObject mt, final SubLObject free_el_variables)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_query.cb_princ_strong_with_explanation( $str375$Specify_a_binding_set_, $str376$Enter_values_for_each_free_variab, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_princ_strong( $str377$Wanted_ );
    html_utilities.html_indent( ONE_INTEGER );
    html_utilities.html_radio_input( $str288$new, $str378$wanted, NIL, UNPROVIDED );
    html_utilities.html_indent( FOUR_INTEGER );
    html_utilities.html_princ_strong( $str379$Unwanted_ );
    html_utilities.html_indent( ONE_INTEGER );
    html_utilities.html_radio_input( $str288$new, $str380$unwanted, NIL, UNPROVIDED );
    html_utilities.html_indent( FOUR_INTEGER );
    cb_query.cb_submit_input_with_explanation( $str381$Add_this_binding_set, $str382$Updates_the_state_of_the_test_bei, $str383$add, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject types_dictionary = at_var_types.formula_variables_arg_constraints_dict( sentence, mt, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdotimes_end_var;
      SubLObject i;
      SubLObject name;
      SubLObject variable;
      SubLObject types;
      SubLObject type;
      SubLObject _prev_bind_0_$119;
      SubLObject _prev_bind_0_$120;
      SubLObject _prev_bind_0_$121;
      for( cdotimes_end_var = Sequences.length( free_el_variables ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        name = PrintLow.format( NIL, $str384$new__A, i );
        variable = Sequences.elt( free_el_variables, i );
        types = genls.min_cols( dictionary.dictionary_lookup( types_dictionary, variable, UNPROVIDED ).first(), mt, UNPROVIDED );
        type = ( NIL != list_utilities.singletonP( types ) ) ? types.first() : NIL;
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $str385$top ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ_strong( variable );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$120, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $str385$top ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_form_widgets.cb_el_term_input_section( NIL, ConsesLow.list( $kw386$INPUT_NAME, name, $kw387$COMPLETE_TYPE, type ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$121, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$119, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 59936L)
  public static SubLObject cb_kct_show_answer_inputs(final SubLObject kct_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = kct_answer_id( kct_answer );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_radio_input( PrintLow.format( NIL, $str388$wanted__A, id ), $str389$yes, Equality.eq( kct_answer_status( kct_answer ), $kw211$WANTED ), UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_radio_input( PrintLow.format( NIL, $str388$wanted__A, id ), $str390$no, Equality.eq( kct_answer_status( kct_answer ), $kw215$UNWANTED ), UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_radio_input( PrintLow.format( NIL, $str388$wanted__A, id ), $str391$unspecified, Equality.eq( kct_answer_status( kct_answer ), $kw217$UNSPECIFIED ), UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 60454L)
  public static SubLObject cb_kct_show_wanted_answers(final SubLObject test_state, final SubLObject free_el_variables)
  {
    return cb_kct_show_answers_of_type( test_state, free_el_variables, $kw211$WANTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 60605L)
  public static SubLObject cb_kct_show_unwanted_answers(final SubLObject test_state, final SubLObject free_el_variables)
  {
    return cb_kct_show_answers_of_type( test_state, free_el_variables, $kw215$UNWANTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 60760L)
  public static SubLObject cb_kct_show_unspecified_answers(final SubLObject test_state, final SubLObject free_el_variables)
  {
    return cb_kct_show_answers_of_type( test_state, free_el_variables, $kw217$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 60921L)
  public static SubLObject cb_kct_show_answers_of_type(final SubLObject test_state, final SubLObject free_el_variables, final SubLObject status)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx;
    final SubLObject v_id_index = idx = kct_test_state_answer_options_index( test_state );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw218$SKIP ) )
    {
      final SubLObject idx_$122 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$122, $kw218$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$122 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject kct_answer;
        SubLObject binding_set;
        SubLObject _prev_bind_0;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          kct_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( kct_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw218$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( kct_answer ) )
            {
              kct_answer = $kw218$SKIP;
            }
            if( kct_answer_status( kct_answer ).eql( status ) )
            {
              binding_set = bindings.inferencify_kb_binding_set( kct_answer_binding_set( kct_answer ) );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              if( NIL != $cb_kct_rowcolor$.getDynamicValue( thread ) )
              {
                html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $cb_kct_rowcolor$.getDynamicValue( thread ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_kct_show_answer_inputs( kct_answer );
                cb_query_browser.cb_show_bindings_horizontal_value_row( binding_set, free_el_variables );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              cb_kct_toggle_rowcolor();
            }
          }
        }
      }
      final SubLObject idx_$123 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$123 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$123 );
        SubLObject id2 = NIL;
        SubLObject kct_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            kct_answer2 = Hashtables.getEntryValue( cdohash_entry );
            if( kct_answer_status( kct_answer2 ).eql( status ) )
            {
              final SubLObject binding_set2 = bindings.inferencify_kb_binding_set( kct_answer_binding_set( kct_answer2 ) );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              if( NIL != $cb_kct_rowcolor$.getDynamicValue( thread ) )
              {
                html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $cb_kct_rowcolor$.getDynamicValue( thread ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_kct_show_answer_inputs( kct_answer2 );
                cb_query_browser.cb_show_bindings_horizontal_value_row( binding_set2, free_el_variables );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              cb_kct_toggle_rowcolor();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 61491L)
  public static SubLObject cb_handle_specify_test_results(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence( cb_kb_query_state.cb_kb_query_being_saved() );
    final SubLObject mc_option_specs = cb_kb_query.cb_kb_query_extract_multiple_choice_option_specs( args, sentence );
    final SubLObject submit_mode = cb_kct_extract_submit_mode( args );
    cb_kb_query_state._csetf_kb_query_state_multiple_choice_option_specs( cb_kb_query_state.cb_kb_query_being_saved(), mc_option_specs );
    thread.resetMultipleValues();
    final SubLObject cardinality_successP = cb_kct_update_answer_cardinality( args );
    final SubLObject cardinality_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == cardinality_successP )
    {
      return cb_utilities.cb_error( $str325$_A, cardinality_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject successP = cb_kct_update_answer_options( args );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      return cb_utilities.cb_error( $str325$_A, error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject pcase_var = submit_mode;
    if( pcase_var.eql( $kw392$ADD ) )
    {
      cb_kct_specify_test_results( cb_kct_test_being_saved() );
      return NIL;
    }
    if( pcase_var.eql( $kw393$SAVE_NEW ) )
    {
      final SubLObject result = cb_kct_save_new_test( cb_kct_test_being_saved() );
      if( NIL != result )
      {
        cb_kb_query_state.cb_clear_kb_query_being_saved();
        cb_clear_kct_test_being_saved();
      }
      return result;
    }
    if( pcase_var.eql( $kw394$OVERWRITE ) )
    {
      final SubLObject result = cb_kct_overwrite_test( cb_kct_test_being_saved() );
      if( NIL != result )
      {
        cb_kb_query_state.cb_clear_kb_query_being_saved();
        cb_clear_kct_test_being_saved();
      }
      return result;
    }
    return cb_utilities.cb_error( $str395$Unknown_test_save_method__A, submit_mode, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 62825L)
  public static SubLObject cb_kct_extract_submit_mode(final SubLObject args)
  {
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str383$add, args ) ) )
    {
      return $kw392$ADD;
    }
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str369$save_new, args ) ) )
    {
      return $kw393$SAVE_NEW;
    }
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str372$overwrite, args ) ) )
    {
      return $kw394$OVERWRITE;
    }
    return $kw397$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 63117L)
  public static SubLObject cb_kct_update_answer_cardinality(final SubLObject args)
  {
    SubLObject answer_cardinality = html_utilities.html_extract_input( $str344$cardinality, args );
    SubLObject answer_min_cardinality = html_utilities.html_extract_input( $str347$min_cardinality, args );
    SubLObject answer_max_cardinality = html_utilities.html_extract_input( $str349$max_cardinality, args );
    if( NIL != string_utilities.empty_string_p( answer_cardinality ) )
    {
      kct_test_state_set_cardinality( cb_kct_test_being_saved(), $kw206$N, NIL );
    }
    else
    {
      answer_cardinality = reader.read_from_string_ignoring_errors( answer_cardinality, NIL, $kw398$EOF, UNPROVIDED, UNPROVIDED );
      if( !answer_cardinality.isInteger() )
      {
        return Values.values( NIL, Sequences.cconcatenate( format_nil.format_nil_a_no_copy( answer_cardinality ), $str399$_is_not_an_integer_ ) );
      }
      kct_test_state_set_cardinality( cb_kct_test_being_saved(), $kw206$N, answer_cardinality );
    }
    if( NIL != string_utilities.empty_string_p( answer_min_cardinality ) )
    {
      kct_test_state_set_cardinality( cb_kct_test_being_saved(), $kw207$MIN, NIL );
    }
    else
    {
      answer_min_cardinality = reader.read_from_string_ignoring_errors( answer_min_cardinality, NIL, $kw398$EOF, UNPROVIDED, UNPROVIDED );
      if( !answer_min_cardinality.isInteger() )
      {
        return Values.values( NIL, Sequences.cconcatenate( format_nil.format_nil_a_no_copy( answer_cardinality ), $str399$_is_not_an_integer_ ) );
      }
      kct_test_state_set_cardinality( cb_kct_test_being_saved(), $kw207$MIN, answer_min_cardinality );
    }
    if( NIL != string_utilities.empty_string_p( answer_max_cardinality ) )
    {
      kct_test_state_set_cardinality( cb_kct_test_being_saved(), $kw208$MAX, NIL );
    }
    else
    {
      answer_max_cardinality = reader.read_from_string_ignoring_errors( answer_max_cardinality, NIL, $kw398$EOF, UNPROVIDED, UNPROVIDED );
      if( !answer_max_cardinality.isInteger() )
      {
        return Values.values( NIL, Sequences.cconcatenate( format_nil.format_nil_a_no_copy( answer_cardinality ), $str399$_is_not_an_integer_ ) );
      }
      kct_test_state_set_cardinality( cb_kct_test_being_saved(), $kw208$MAX, answer_max_cardinality );
    }
    return Values.values( T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 64718L)
  public static SubLObject cb_kct_update_answer_options(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject exact = cb_kct_extract_answers( args );
    final SubLObject wanted = thread.secondMultipleValue();
    final SubLObject unwanted = thread.thirdMultipleValue();
    final SubLObject unimportantP = thread.fourthMultipleValue();
    final SubLObject answers_error = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != answers_error )
    {
      return Values.values( NIL, answers_error );
    }
    final SubLObject idx;
    final SubLObject v_id_index = idx = kct_test_state_answer_options_index( cb_kct_test_being_saved() );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw218$SKIP ) )
    {
      final SubLObject idx_$124 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$124, $kw218$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$124 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject kct_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          kct_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( kct_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw218$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( kct_answer ) )
            {
              kct_answer = $kw218$SKIP;
            }
            set_kct_answer_status( kct_answer, $kw217$UNSPECIFIED );
          }
        }
      }
      final SubLObject idx_$125 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$125 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$125 );
        SubLObject id2 = NIL;
        SubLObject kct_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            kct_answer2 = Hashtables.getEntryValue( cdohash_entry );
            set_kct_answer_status( kct_answer2, $kw217$UNSPECIFIED );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    if( NIL != unimportantP )
    {
      _csetf_kct_test_state_answer_status( cb_kct_test_being_saved(), $kw209$UNIMPORTANT );
    }
    else if( NIL != exact )
    {
      _csetf_kct_test_state_answer_status( cb_kct_test_being_saved(), $kw210$EXACT );
      if( exact != $kw62$NONE )
      {
        SubLObject cdolist_list_var = exact;
        SubLObject exact_answer = NIL;
        exact_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          set_kct_answer_status( exact_answer, $kw211$WANTED );
          cdolist_list_var = cdolist_list_var.rest();
          exact_answer = cdolist_list_var.first();
        }
      }
    }
    else if( NIL != wanted || NIL != unwanted )
    {
      _csetf_kct_test_state_answer_status( cb_kct_test_being_saved(), $kw212$INEXACT );
      SubLObject cdolist_list_var = wanted;
      SubLObject wanted_answer = NIL;
      wanted_answer = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set_kct_answer_status( wanted_answer, $kw211$WANTED );
        cdolist_list_var = cdolist_list_var.rest();
        wanted_answer = cdolist_list_var.first();
      }
      cdolist_list_var = unwanted;
      SubLObject unwanted_answer = NIL;
      unwanted_answer = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set_kct_answer_status( unwanted_answer, $kw215$UNWANTED );
        cdolist_list_var = cdolist_list_var.rest();
        unwanted_answer = cdolist_list_var.first();
      }
    }
    thread.resetMultipleValues();
    final SubLObject status = cb_kct_extract_new_binding_status( args );
    final SubLObject new_binding_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == status )
    {
      return Values.values( T, NIL );
    }
    if( NIL != new_binding_error )
    {
      return Values.values( NIL, new_binding_error );
    }
    thread.resetMultipleValues();
    final SubLObject exactness = cb_kct_extract_exactness( args );
    final SubLObject exactness_error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != exactness_error )
    {
      return Values.values( NIL, exactness_error );
    }
    _csetf_kct_test_state_answer_status( cb_kct_test_being_saved(), exactness );
    if( exactness == $kw209$UNIMPORTANT )
    {
      return Values.values( T, NIL );
    }
    final SubLObject query_state = kct_test_state_query_state( cb_kct_test_being_saved() );
    final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence( query_state );
    final SubLObject free_el_variables = ( NIL != el_utilities.el_implication_p( sentence ) ) ? el_utilities.conditional_sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : el_utilities.sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject v_bindings = NIL;
    SubLObject binding_set = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject value;
    SubLObject binding;
    for( cdotimes_end_var = Sequences.length( free_el_variables ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      value = cb_kct_extract_binding_value( PrintLow.format( NIL, $str384$new__A, i ), args );
      binding = ( NIL != value ) ? bindings.make_kb_binding( Sequences.elt( free_el_variables, i ), value ) : NIL;
      if( NIL != bindings.kb_binding_p( binding ) )
      {
        v_bindings = ConsesLow.cons( binding, v_bindings );
      }
    }
    if( NIL != list_utilities.same_length_p( v_bindings, free_el_variables ) )
    {
      binding_set = bindings.make_kb_binding_set( v_bindings );
      if( NIL == kct_answer_bindings_lookup( cb_kct_test_being_saved(), binding_set ) )
      {
        new_kct_answer( binding_set, cb_kct_test_being_saved(), status );
      }
    }
    return Values.values( T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 67352L)
  public static SubLObject cb_kct_extract_binding_value(final SubLObject html_key, final SubLObject args)
  {
    return cb_form_widgets.cb_extract_el_term_input( args, ConsesLow.listS( $kw400$REQUIRED_, T, $kw386$INPUT_NAME, html_key, $list401 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 67511L)
  public static SubLObject cb_kct_extract_new_binding_status(final SubLObject args)
  {
    final SubLObject v_new = html_utilities.html_extract_input( $str288$new, args );
    final SubLObject error = NIL;
    if( NIL != error )
    {
      return NIL;
    }
    if( v_new.equal( $str378$wanted ) )
    {
      return $kw211$WANTED;
    }
    if( v_new.equal( $str380$unwanted ) )
    {
      return $kw215$UNWANTED;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 67771L)
  public static SubLObject cb_kct_extract_exactness(final SubLObject args)
  {
    final SubLObject exactness = html_utilities.html_extract_input( $str350$bindings, args );
    if( exactness.equal( $str351$unimportant ) )
    {
      return Values.values( $kw209$UNIMPORTANT, NIL );
    }
    if( exactness.equal( $str355$none ) )
    {
      return Values.values( $kw210$EXACT, NIL );
    }
    if( exactness.equal( $str353$proven ) )
    {
      return Values.values( $kw210$EXACT, NIL );
    }
    if( exactness.equal( $str358$exact ) )
    {
      return Values.values( $kw210$EXACT, NIL );
    }
    if( exactness.equal( $str360$inexact ) )
    {
      return Values.values( $kw212$INEXACT, NIL );
    }
    return Values.values( NIL, PrintLow.format( NIL, $str402$The_value___A__is_not_a_known_exa, exactness ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 68315L)
  public static SubLObject cb_kct_extract_test_spec(final SubLObject args)
  {
    final SubLObject test_spec_id_string = html_utilities.html_extract_input( $str403$test_spec, args );
    final SubLObject test_spec = cb_utilities.cb_guess_fort( test_spec_id_string, UNPROVIDED );
    SubLObject error = NIL;
    if( NIL == kct_utils.kct_test_spec_p( test_spec, UNPROVIDED ) )
    {
      error = PrintLow.format( NIL, $str404$_A_does_not_denote_a_test_specifi, test_spec_id_string );
    }
    return Values.values( test_spec, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 68677L)
  public static SubLObject cb_kct_extract_answers(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject exactness = cb_kct_extract_exactness( args );
    SubLObject exact = NIL;
    SubLObject wanted = NIL;
    SubLObject unwanted = NIL;
    SubLObject unimportant = NIL;
    SubLObject error = NIL;
    final SubLObject pcase_var = exactness;
    if( pcase_var.eql( $kw210$EXACT ) )
    {
      thread.resetMultipleValues();
      final SubLObject ex = cb_kct_extract_exact_answers( args );
      final SubLObject er = thread.secondMultipleValue();
      thread.resetMultipleValues();
      exact = ex;
      error = er;
    }
    else if( pcase_var.eql( $kw212$INEXACT ) )
    {
      thread.resetMultipleValues();
      final SubLObject wan = cb_kct_extract_wanted_answers( args );
      SubLObject er = thread.secondMultipleValue();
      thread.resetMultipleValues();
      wanted = wan;
      error = er;
      thread.resetMultipleValues();
      final SubLObject unwan = cb_kct_extract_unwanted_answers( args );
      er = thread.secondMultipleValue();
      thread.resetMultipleValues();
      unwanted = unwan;
      error = er;
    }
    else if( pcase_var.eql( $kw209$UNIMPORTANT ) )
    {
      unimportant = T;
    }
    else
    {
      error = $str405$You_need_to_make_a_choice_for_Exp;
    }
    return Values.values( exact, wanted, unwanted, unimportant, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 69454L)
  public static SubLObject cb_kct_extract_exact_answers(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject exactness = html_utilities.html_extract_input( $str350$bindings, args );
    if( exactness.equalp( $str358$exact ) )
    {
      thread.resetMultipleValues();
      final SubLObject wanted_kct_answers = cb_kct_gather_answers_internal( $str389$yes, args );
      final SubLObject error = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( wanted_kct_answers, error );
    }
    if( exactness.equalp( $str353$proven ) )
    {
      SubLObject v_answer = kct_answer_bindings_lookup( cb_kct_test_being_saved(), bindings.proven_kb_binding_set() );
      if( NIL == v_answer )
      {
        v_answer = new_kct_answer( bindings.proven_kb_binding_set(), cb_kct_test_being_saved(), $kw211$WANTED );
      }
      return Values.values( ConsesLow.list( v_answer ), NIL );
    }
    if( exactness.equalp( $str355$none ) )
    {
      return Values.values( $kw62$NONE, NIL );
    }
    return Values.values( NIL, $str406$Problem_extracting_exact_answers_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 70202L)
  public static SubLObject cb_kct_extract_wanted_answers(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject wanted_kct_answers = cb_kct_gather_answers_internal( $str389$yes, args );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( wanted_kct_answers, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 70403L)
  public static SubLObject cb_kct_extract_unwanted_answers(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unwanted_kct_answers = cb_kct_gather_answers_internal( $str390$no, args );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( unwanted_kct_answers, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 70609L)
  public static SubLObject cb_kct_gather_answers_internal(final SubLObject value, final SubLObject args)
  {
    final SubLObject v_id_index = kct_test_state_answer_options_index( cb_kct_test_being_saved() );
    SubLObject error = NIL;
    SubLObject answers = NIL;
    final SubLObject idx = v_id_index;
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw218$SKIP ) )
    {
      final SubLObject idx_$126 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$126, $kw218$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$126 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject kct_answer;
        SubLObject wanted;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          kct_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( kct_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw218$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( kct_answer ) )
            {
              kct_answer = $kw218$SKIP;
            }
            wanted = html_utilities.html_extract_input( PrintLow.format( NIL, $str388$wanted__A, id ), args );
            if( wanted.equal( value ) )
            {
              if( NIL == kct_answer_p( kct_answer ) )
              {
                error = PrintLow.format( NIL, $str407$The_ID__A_does_not_denote_a_kct_a, id );
              }
              if( NIL == error )
              {
                answers = ConsesLow.cons( kct_answer, answers );
              }
            }
          }
        }
      }
      final SubLObject idx_$127 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$127 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$127 );
        SubLObject id2 = NIL;
        SubLObject kct_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            kct_answer2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject wanted2 = html_utilities.html_extract_input( PrintLow.format( NIL, $str388$wanted__A, id2 ), args );
            if( wanted2.equal( value ) )
            {
              if( NIL == kct_answer_p( kct_answer2 ) )
              {
                error = PrintLow.format( NIL, $str407$The_ID__A_does_not_denote_a_kct_a, id2 );
              }
              if( NIL != error )
              {
                continue;
              }
              answers = ConsesLow.cons( kct_answer2, answers );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Values.values( answers, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 71127L)
  public static SubLObject cb_kct_save_new_test(final SubLObject test_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str408$Save_Test_Specification );
      return NIL;
    }
    SubLObject successP = NIL;
    final SubLObject name = kct_test_state_name( test_state );
    final SubLObject defining_mt = kct_test_state_save_mt( test_state );
    final SubLObject exact_bindings = kct_test_state_exact_bindings( test_state );
    final SubLObject wanted_bindings = kct_test_state_wanted_bindings( test_state );
    final SubLObject unwanted_bindings = kct_test_state_unwanted_bindings( test_state );
    final SubLObject bindings_unimportantP = kct_test_state_bindings_unimportantP( test_state );
    final SubLObject no_answersP = kct_test_state_no_answersP( test_state );
    final SubLObject answer_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw206$N, UNPROVIDED );
    final SubLObject answer_min_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw207$MIN, UNPROVIDED );
    final SubLObject answer_max_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw208$MAX, UNPROVIDED );
    final SubLObject metric_constants = kct_test_state_metrics( test_state );
    final SubLObject responsible_cyclists = kct_test_state_cyclists( test_state );
    final SubLObject test_categories = kct_test_state_categories( test_state );
    final SubLObject query_state = kct_test_state_query_state( test_state );
    final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence( query_state );
    final SubLObject non_explanatory_sentence = cb_kb_query_state.kb_query_state_non_explanatory_sentence( query_state );
    final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt( query_state );
    final SubLObject v_inference_parameters = cb_kb_query_state.kb_query_state_query_properties( query_state );
    final SubLObject glosses = cb_kb_query_state.kb_query_state_template_glosses( query_state );
    final SubLObject folder_mt_pairs = cb_kb_query_state.kb_query_state_template_folder_mt_pairs( query_state );
    final SubLObject multiple_choice_option_specs = cb_kb_query_state.kb_query_state_multiple_choice_option_specs( query_state );
    if( NIL == constant_completion_high.valid_constant_name_p( name ) )
    {
      return cb_utilities.cb_error( $str409$_A_is_not_a_valid_constant_name_, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject exact_constant = constants_high.find_constant( name );
    SubLObject new_test_spec = NIL;
    SubLObject new_query_spec_nat = NIL;
    if( NIL != exact_constant )
    {
      return cb_utilities.cb_error( $str410$Already_a_constant_named__A, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject inexact_constants = constant_completion_high.constant_complete( name, NIL, T, UNPROVIDED, UNPROVIDED );
    if( NIL != inexact_constants )
    {
      return cb_utilities.cb_error( $str411$Constant__S_already_exists_which_, inexact_constants.first(), name, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    new_test_spec = cb_editor.cb_create_hook( name );
    new_query_spec_nat = el_utilities.make_formula( $const412$TestQueryFn, ConsesLow.list( new_test_spec ), UNPROVIDED );
    kct_assert_test_spec_definition( new_test_spec, new_query_spec_nat, answer_cardinality, answer_min_cardinality, answer_max_cardinality, exact_bindings, wanted_bindings, unwanted_bindings, bindings_unimportantP,
        no_answersP, metric_constants, responsible_cyclists, test_categories, defining_mt, multiple_choice_option_specs );
    new_query_spec_nat = narts_high.find_nart( new_query_spec_nat );
    kb_query.kbq_assert_query_spec_definition( new_query_spec_nat, sentence, mt, inference_parameters.explicify_query_tool_query_property_defaults( v_inference_parameters, sentence ), defining_mt,
        non_explanatory_sentence, multiple_choice_option_specs );
    kb_query.kbq_assert_template_definition( new_query_spec_nat, NIL, glosses, folder_mt_pairs, defining_mt );
    SubLObject cdolist_list_var = ConsesLow.list( new_test_spec, new_query_spec_nat );
    SubLObject new_term = NIL;
    new_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constant_handles.constant_p( new_term ) )
      {
        cb_tools.cb_add_to_constant_history( new_term );
      }
      else if( NIL != nart_handles.nart_p( new_term ) )
      {
        cb_tools.cb_add_to_nat_history( new_term );
      }
      cdolist_list_var = cdolist_list_var.rest();
      new_term = cdolist_list_var.first();
    }
    thread.resetMultipleValues();
    final SubLObject status = kct_utils.why_not_kct_test_valid( new_test_spec );
    final SubLObject problems = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject message = NIL;
    if( NIL != status )
    {
      message = PrintLow.format( NIL, $str413$Save_New_Test_Specification_finis, problems );
    }
    else
    {
      message = $str414$Save_New_Test_Specification_finis;
      successP = T;
    }
    cb_assertion_editor.cb_note_edit_change( message, NIL, UNPROVIDED, UNPROVIDED );
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 74745L)
  public static SubLObject cb_kct_overwrite_test(final SubLObject test_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str415$Overwrite_Test_Specification );
      return NIL;
    }
    SubLObject successP = NIL;
    final SubLObject name = kct_test_state_name( test_state );
    SubLObject test_spec = kct_test_state_test_spec( test_state );
    final SubLObject test_defining_mt = kct_test_state_save_mt( test_state );
    final SubLObject answer_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw206$N, UNPROVIDED );
    final SubLObject answer_min_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw207$MIN, UNPROVIDED );
    final SubLObject answer_max_cardinality = conses_high.getf( kct_test_state_answer_cardinality( test_state ), $kw208$MAX, UNPROVIDED );
    final SubLObject exact_bindings = kct_test_state_exact_bindings( test_state );
    final SubLObject wanted_bindings = kct_test_state_wanted_bindings( test_state );
    final SubLObject unwanted_bindings = kct_test_state_unwanted_bindings( test_state );
    final SubLObject bindings_unimportantP = kct_test_state_bindings_unimportantP( test_state );
    final SubLObject no_answersP = kct_test_state_no_answersP( test_state );
    final SubLObject metric_constants = kct_test_state_metrics( test_state );
    final SubLObject responsible_cyclists = kct_test_state_cyclists( test_state );
    final SubLObject test_categories = kct_test_state_categories( test_state );
    final SubLObject query_state = kct_test_state_query_state( test_state );
    SubLObject query_spec = cb_kb_query_state.kb_query_state_query_spec( query_state );
    final SubLObject query_defining_mt = cb_kb_query_state.kb_query_state_save_mt( query_state );
    final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence( query_state );
    final SubLObject non_explanatory_sentence = cb_kb_query_state.kb_query_state_non_explanatory_sentence( query_state );
    final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt( query_state );
    final SubLObject v_inference_parameters = cb_kb_query_state.kb_query_state_query_properties( query_state );
    final SubLObject template = cb_kb_query_state.kb_query_state_template( query_state );
    final SubLObject glosses = cb_kb_query_state.kb_query_state_template_glosses( query_state );
    final SubLObject folder_mt_pairs = cb_kb_query_state.kb_query_state_template_folder_mt_pairs( query_state );
    final SubLObject multiple_choice_option_specs = cb_kb_query_state.kb_query_state_multiple_choice_option_specs( query_state );
    if( NIL != name )
    {
      final SubLObject test_spec_to_edit = cb_utilities.cb_guess_term( name, UNPROVIDED );
      if( NIL == kct_utils.kct_test_spec_p( test_spec_to_edit, UNPROVIDED ) )
      {
        return cb_utilities.cb_error( $str416$_A_is_not_the_name_of_a_KBContent, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      test_spec = test_spec_to_edit;
    }
    query_spec = kct_utils.kct_query_specification( test_spec, test_defining_mt );
    if( NIL == query_spec )
    {
      query_spec = el_utilities.make_formula( $const412$TestQueryFn, ConsesLow.list( test_spec ), UNPROVIDED );
    }
    kb_query.kbq_ensure_query_spec_definition( query_spec, sentence, mt, inference_parameters.explicify_query_tool_query_property_defaults( v_inference_parameters, sentence ), query_defining_mt, non_explanatory_sentence,
        multiple_choice_option_specs );
    kb_query.kbq_ensure_template_definition( query_spec, template, glosses, folder_mt_pairs, query_defining_mt );
    kct_ensure_test_spec_definition( test_spec, query_spec, answer_cardinality, answer_min_cardinality, answer_max_cardinality, exact_bindings, wanted_bindings, unwanted_bindings, bindings_unimportantP, no_answersP,
        metric_constants, responsible_cyclists, test_categories, test_defining_mt, multiple_choice_option_specs );
    thread.resetMultipleValues();
    final SubLObject status = kct_utils.why_not_kct_test_valid( test_spec );
    final SubLObject problems = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject message = NIL;
    if( NIL != status )
    {
      message = PrintLow.format( NIL, $str417$Edit_Test_Specification_finished_, problems );
    }
    else
    {
      message = $str418$Edit_Test_Specification_finished_;
      successP = T;
    }
    cb_assertion_editor.cb_note_edit_change( message, NIL, UNPROVIDED, UNPROVIDED );
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 78332L)
  public static SubLObject kct_assert_test_spec_definition(final SubLObject test_spec, final SubLObject query_spec, final SubLObject answer_cardinality, final SubLObject answer_min_cardinality,
      final SubLObject answer_max_cardinality, final SubLObject exact_bindings, final SubLObject wanted_bindings, final SubLObject unwanted_bindings, final SubLObject unimportant_bindings, final SubLObject no_answers,
      final SubLObject metric_constants, final SubLObject responsible_cyclists, final SubLObject test_categories, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs)
  {
    assert NIL != constant_handles.constant_p( test_spec ) : test_spec;
    if( NIL != answer_cardinality && !assertionsDisabledInClass && NIL == Types.integerp( answer_cardinality ) )
    {
      throw new AssertionError( answer_cardinality );
    }
    if( NIL != answer_min_cardinality && !assertionsDisabledInClass && NIL == Types.integerp( answer_min_cardinality ) )
    {
      throw new AssertionError( answer_min_cardinality );
    }
    if( NIL != answer_max_cardinality && !assertionsDisabledInClass && NIL == Types.integerp( answer_max_cardinality ) )
    {
      throw new AssertionError( answer_max_cardinality );
    }
    if( NIL != exact_bindings && !assertionsDisabledInClass && NIL == Types.listp( exact_bindings ) )
    {
      throw new AssertionError( exact_bindings );
    }
    if( NIL != wanted_bindings && !assertionsDisabledInClass && NIL == Types.listp( wanted_bindings ) )
    {
      throw new AssertionError( wanted_bindings );
    }
    if( NIL != unwanted_bindings && !assertionsDisabledInClass && NIL == Types.listp( unwanted_bindings ) )
    {
      throw new AssertionError( unwanted_bindings );
    }
    assert NIL != Types.listp( metric_constants ) : metric_constants;
    assert NIL != Types.listp( responsible_cyclists ) : responsible_cyclists;
    assert NIL != hlmt.possibly_mt_p( defining_mt ) : defining_mt;
    if( NIL != multiple_choice_option_specs_non_trivialP( multiple_choice_option_specs ) )
    {
      ke.ke_assert_now( ConsesLow.listS( $const422$isa, test_spec, $list423 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      ke.ke_assert_now( ConsesLow.listS( $const422$isa, test_spec, $list424 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    ke.ke_assert_now( ConsesLow.list( $const425$testQuerySpecification, test_spec, query_spec ), defining_mt, UNPROVIDED, UNPROVIDED );
    SubLObject message = NIL;
    if( NIL != exact_bindings || NIL != no_answers )
    {
      kct_assert_exact_bindings( test_spec, exact_bindings, defining_mt, multiple_choice_option_specs );
    }
    else if( NIL != wanted_bindings || NIL != unwanted_bindings )
    {
      if( NIL != wanted_bindings )
      {
        SubLObject cdolist_list_var = wanted_bindings;
        SubLObject wanted_binding = NIL;
        wanted_binding = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          kct_assert_wanted_binding( test_spec, wanted_binding, defining_mt );
          cdolist_list_var = cdolist_list_var.rest();
          wanted_binding = cdolist_list_var.first();
        }
      }
      if( NIL != unwanted_bindings )
      {
        SubLObject cdolist_list_var = unwanted_bindings;
        SubLObject unwanted_binding = NIL;
        unwanted_binding = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          kct_assert_unwanted_binding( test_spec, unwanted_binding, defining_mt );
          cdolist_list_var = cdolist_list_var.rest();
          unwanted_binding = cdolist_list_var.first();
        }
      }
    }
    else if( NIL != unimportant_bindings )
    {
      kct_assert_unimportant_bindings( test_spec, defining_mt );
    }
    else
    {
      message = $str426$Remember_to_state_expected_result;
    }
    if( NIL != answer_cardinality )
    {
      kct_assert_answer_cardinality( test_spec, answer_cardinality, defining_mt );
    }
    if( NIL != answer_min_cardinality )
    {
      kct_assert_answer_min_cardinality( test_spec, answer_min_cardinality, defining_mt );
    }
    if( NIL != answer_max_cardinality )
    {
      kct_assert_answer_max_cardinality( test_spec, answer_max_cardinality, defining_mt );
    }
    SubLObject cdolist_list_var = test_categories;
    SubLObject test_category = NIL;
    test_category = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kct_assert_test_category( test_spec, test_category, defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      test_category = cdolist_list_var.first();
    }
    cdolist_list_var = metric_constants;
    SubLObject metric_constant = NIL;
    metric_constant = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kct_assert_test_metric( test_spec, metric_constant, defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      metric_constant = cdolist_list_var.first();
    }
    cdolist_list_var = responsible_cyclists;
    SubLObject cyclist = NIL;
    cyclist = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kct_assert_responsible_cyclist( test_spec, cyclist, defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      cyclist = cdolist_list_var.first();
    }
    return Values.values( test_spec, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 80995L)
  public static SubLObject multiple_choice_option_specs_non_trivialP(final SubLObject multiple_choice_option_specs)
  {
    SubLObject cdolist_list_var = multiple_choice_option_specs;
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = spec;
      SubLObject option_num = NIL;
      SubLObject full_label = NIL;
      SubLObject index_label = NIL;
      SubLObject kb_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list427 );
      option_num = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list427 );
      full_label = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list427 );
      index_label = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list427 );
      kb_bindings = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != kb_bindings )
        {
          return T;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list427 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 81311L)
  public static SubLObject kct_ensure_test_spec_definition(final SubLObject test_spec, final SubLObject query_spec, final SubLObject answer_cardinality, final SubLObject answer_min_cardinality,
      final SubLObject answer_max_cardinality, final SubLObject exact_bindings, final SubLObject wanted_bindings, final SubLObject unwanted_bindings, final SubLObject unimportant_bindings, final SubLObject no_answers,
      final SubLObject metric_constants, final SubLObject responsible_cyclists, final SubLObject test_categories, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != constant_handles.constant_p( test_spec ) : test_spec;
    if( NIL != answer_cardinality && !assertionsDisabledInClass && NIL == Types.integerp( answer_cardinality ) )
    {
      throw new AssertionError( answer_cardinality );
    }
    if( NIL != answer_min_cardinality && !assertionsDisabledInClass && NIL == Types.integerp( answer_min_cardinality ) )
    {
      throw new AssertionError( answer_min_cardinality );
    }
    if( NIL != answer_max_cardinality && !assertionsDisabledInClass && NIL == Types.integerp( answer_max_cardinality ) )
    {
      throw new AssertionError( answer_max_cardinality );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( $sym239$KB_BINDING_SET_P, wanted_bindings, UNPROVIDED ) )
    {
      Errors.error( $str428$Some_item_in__A_was_not_a_KB_BIND, exact_bindings );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( $sym239$KB_BINDING_SET_P, wanted_bindings, UNPROVIDED ) )
    {
      Errors.error( $str428$Some_item_in__A_was_not_a_KB_BIND, wanted_bindings );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( $sym239$KB_BINDING_SET_P, unwanted_bindings, UNPROVIDED ) )
    {
      Errors.error( $str428$Some_item_in__A_was_not_a_KB_BIND, unwanted_bindings );
    }
    assert NIL != Types.listp( metric_constants ) : metric_constants;
    assert NIL != Types.listp( responsible_cyclists ) : responsible_cyclists;
    assert NIL != hlmt.possibly_mt_p( defining_mt ) : defining_mt;
    if( NIL != multiple_choice_option_specs )
    {
      ke.ke_assert_now( ConsesLow.listS( $const422$isa, test_spec, $list423 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      ke.ke_assert_now( ConsesLow.listS( $const422$isa, test_spec, $list424 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    ke.ke_assert_now( ConsesLow.list( $const425$testQuerySpecification, test_spec, query_spec ), defining_mt, UNPROVIDED, UNPROVIDED );
    kct_ensure_answer_cardinality( test_spec, answer_cardinality, defining_mt );
    kct_ensure_answer_min_cardinality( test_spec, answer_min_cardinality, defining_mt );
    kct_ensure_answer_max_cardinality( test_spec, answer_max_cardinality, defining_mt );
    if( NIL != exact_bindings || NIL != no_answers )
    {
      kct_ensure_exact_bindings( test_spec, exact_bindings, defining_mt, multiple_choice_option_specs );
    }
    else if( NIL != wanted_bindings || NIL != unwanted_bindings )
    {
      kct_ensure_wanted_unwanted_bindings( test_spec, wanted_bindings, unwanted_bindings, defining_mt );
    }
    else if( NIL != unimportant_bindings )
    {
      kct_ensure_unimportant_bindings( test_spec, defining_mt );
    }
    kct_ensure_test_categories( test_spec, test_categories, defining_mt );
    kct_ensure_test_metrics( test_spec, metric_constants, defining_mt );
    kct_ensure_responsible_cyclists( test_spec, responsible_cyclists, defining_mt );
    return test_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 83509L)
  public static SubLObject kct_ensure_answer_cardinality(final SubLObject test_spec, final SubLObject answer_cardinality, final SubLObject defining_mt)
  {
    final SubLObject current = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const429$testAnswers_Cardinality_Exact ).first();
    final SubLObject current_val = ( NIL != current ) ? assertions_high.gaf_arg2( current ) : NIL;
    if( !current_val.eql( answer_cardinality ) )
    {
      if( NIL != assertion_handles.assertion_p( current ) )
      {
        ke.ke_unassert_assertion_now( current );
      }
      if( NIL != answer_cardinality )
      {
        return kct_assert_answer_cardinality( test_spec, answer_cardinality, defining_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 84046L)
  public static SubLObject kct_ensure_answer_min_cardinality(final SubLObject test_spec, final SubLObject answer_min_cardinality, final SubLObject defining_mt)
  {
    final SubLObject current = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const430$testAnswers_Cardinality_Min ).first();
    final SubLObject current_val = ( NIL != current ) ? assertions_high.gaf_arg2( current ) : NIL;
    if( !current_val.eql( answer_min_cardinality ) )
    {
      if( NIL != assertion_handles.assertion_p( current ) )
      {
        ke.ke_unassert_assertion_now( current );
      }
      if( NIL != answer_min_cardinality )
      {
        return kct_assert_answer_min_cardinality( test_spec, answer_min_cardinality, defining_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 84568L)
  public static SubLObject kct_ensure_answer_max_cardinality(final SubLObject test_spec, final SubLObject answer_max_cardinality, final SubLObject defining_mt)
  {
    final SubLObject current = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const431$testAnswers_Cardinality_Max ).first();
    final SubLObject current_val = ( NIL != current ) ? assertions_high.gaf_arg2( current ) : NIL;
    if( !current_val.eql( answer_max_cardinality ) )
    {
      if( NIL != assertion_handles.assertion_p( current ) )
      {
        ke.ke_unassert_assertion_now( current );
      }
      if( NIL != answer_max_cardinality )
      {
        return kct_assert_answer_max_cardinality( test_spec, answer_max_cardinality, defining_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 85090L)
  public static SubLObject kct_assert_answer_cardinality(final SubLObject test_spec, final SubLObject answer_cardinality, final SubLObject defining_mt)
  {
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const429$testAnswers_Cardinality_Exact, answer_cardinality, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 85318L)
  public static SubLObject kct_assert_answer_min_cardinality(final SubLObject test_spec, final SubLObject answer_min_cardinality, final SubLObject defining_mt)
  {
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const430$testAnswers_Cardinality_Min, answer_min_cardinality, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 85556L)
  public static SubLObject kct_assert_answer_max_cardinality(final SubLObject test_spec, final SubLObject answer_max_cardinality, final SubLObject defining_mt)
  {
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const431$testAnswers_Cardinality_Max, answer_max_cardinality, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 85794L)
  public static SubLObject kct_ensure_exact_bindings(final SubLObject test_spec, final SubLObject exact_bindings, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs)
  {
    final SubLObject current_exact_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const432$testAnswersCycL_Exact );
    final SubLObject current_wanted_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const433$testAnswersCycL_Wanted );
    final SubLObject current_unwanted_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const434$testAnswersCycL_NotWanted );
    final SubLObject current_unimportant_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const435$testAnswersCycLUnimportant );
    final SubLObject kb_set_of_binding_sets = bindings.make_kb_set_of_binding_sets( exact_bindings );
    SubLObject result = T;
    SubLObject cdolist_list_var = current_wanted_assertions;
    SubLObject wanted_assertion = NIL;
    wanted_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert_assertion_now( wanted_assertion );
      cdolist_list_var = cdolist_list_var.rest();
      wanted_assertion = cdolist_list_var.first();
    }
    cdolist_list_var = current_unwanted_assertions;
    SubLObject unwanted_assertion = NIL;
    unwanted_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert_assertion_now( unwanted_assertion );
      cdolist_list_var = cdolist_list_var.rest();
      unwanted_assertion = cdolist_list_var.first();
    }
    cdolist_list_var = current_exact_assertions;
    SubLObject exact_assertion = NIL;
    exact_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_exact_bindings = assertions_high.gaf_arg2( exact_assertion );
      final SubLObject current_exact_mt = assertions_high.assertion_mt( exact_assertion );
      if( !current_exact_mt.eql( defining_mt ) || !current_exact_bindings.equal( kb_set_of_binding_sets ) )
      {
        ke.ke_unassert_assertion_now( exact_assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      exact_assertion = cdolist_list_var.first();
    }
    cdolist_list_var = current_unimportant_assertions;
    SubLObject unimportant_assertion = NIL;
    unimportant_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert_assertion_now( unimportant_assertion );
      cdolist_list_var = cdolist_list_var.rest();
      unimportant_assertion = cdolist_list_var.first();
    }
    if( NIL == kb_mapping_utilities.tuple_holds_in_mt( ConsesLow.list( $const432$testAnswersCycL_Exact, test_spec, kb_set_of_binding_sets ), defining_mt, UNPROVIDED, UNPROVIDED ) )
    {
      result = kct_assert_exact_bindings( test_spec, exact_bindings, defining_mt, multiple_choice_option_specs );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 87476L)
  public static SubLObject kct_ensure_wanted_unwanted_bindings(final SubLObject test_spec, final SubLObject wanted_bindings, final SubLObject unwanted_bindings, final SubLObject defining_mt)
  {
    final SubLObject current_exact_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const432$testAnswersCycL_Exact );
    final SubLObject current_unimportant_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const435$testAnswersCycLUnimportant );
    SubLObject cdolist_list_var = current_exact_assertions;
    SubLObject exact_assertion = NIL;
    exact_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert_assertion_now( exact_assertion );
      cdolist_list_var = cdolist_list_var.rest();
      exact_assertion = cdolist_list_var.first();
    }
    cdolist_list_var = current_unimportant_assertions;
    SubLObject unimportant_assertion = NIL;
    unimportant_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert_assertion_now( unimportant_assertion );
      cdolist_list_var = cdolist_list_var.rest();
      unimportant_assertion = cdolist_list_var.first();
    }
    kct_ensure_test_spec_exact_arg2s_for_pred( test_spec, $const433$testAnswersCycL_Wanted, wanted_bindings, defining_mt );
    kct_ensure_test_spec_exact_arg2s_for_pred( test_spec, $const434$testAnswersCycL_NotWanted, unwanted_bindings, defining_mt );
    return test_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 88364L)
  public static SubLObject kct_ensure_unimportant_bindings(final SubLObject test_spec, final SubLObject defining_mt)
  {
    final SubLObject current_exact_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const432$testAnswersCycL_Exact );
    final SubLObject current_wanted_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const433$testAnswersCycL_Wanted );
    final SubLObject current_unwanted_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const434$testAnswersCycL_NotWanted );
    SubLObject cdolist_list_var;
    final SubLObject assertions_to_delete = cdolist_list_var = ConsesLow.append( current_exact_assertions, current_wanted_assertions, current_unwanted_assertions );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert_assertion_now( assertion );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    if( NIL == kb_mapping_utilities.tuple_holds_in_mt( ConsesLow.list( $const435$testAnswersCycLUnimportant, test_spec ), defining_mt, UNPROVIDED, UNPROVIDED ) )
    {
      kct_assert_unimportant_bindings( test_spec, defining_mt );
    }
    return test_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 89230L)
  public static SubLObject kct_assert_exact_bindings(final SubLObject test_spec, final SubLObject exact_bindings, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs)
  {
    final SubLObject kb_bindings = bindings.make_kb_set_of_binding_sets( exact_bindings );
    if( NIL != multiple_choice_option_specs )
    {
      final SubLObject pos = Sequences.position( kb_bindings, multiple_choice_option_specs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym436$FOURTH ), UNPROVIDED, UNPROVIDED );
      if( NIL != pos )
      {
        final SubLObject option_num = ConsesLow.nth( pos, multiple_choice_option_specs ).first();
        final SubLObject query_spec = kct_utils.kct_query_specification( test_spec, UNPROVIDED );
        final SubLObject option = ConsesLow.list( $const437$MCQuestionNthOptionFn, query_spec, option_num );
        kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const438$testAnswer_MultipleChoice, option, defining_mt );
      }
    }
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const432$testAnswersCycL_Exact, kb_bindings, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 90012L)
  public static SubLObject kct_assert_wanted_binding(final SubLObject test_spec, final SubLObject wanted_binding, final SubLObject defining_mt)
  {
    assert NIL != bindings.kb_binding_set_p( wanted_binding ) : wanted_binding;
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const433$testAnswersCycL_Wanted, wanted_binding, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 90293L)
  public static SubLObject kct_assert_unwanted_binding(final SubLObject test_spec, final SubLObject unwanted_binding, final SubLObject defining_mt)
  {
    assert NIL != bindings.kb_binding_set_p( unwanted_binding ) : unwanted_binding;
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const434$testAnswersCycL_NotWanted, unwanted_binding, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 90583L)
  public static SubLObject kct_assert_unimportant_bindings(final SubLObject test_spec, final SubLObject defining_mt)
  {
    return ke.ke_assert_now( ConsesLow.list( $const435$testAnswersCycLUnimportant, test_spec ), defining_mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 90759L)
  public static SubLObject kct_ensure_test_categories(final SubLObject test_spec, final SubLObject test_categories, final SubLObject defining_mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject current = cdolist_list_var = kct_current_test_spec_arg1_assertions_for_pred( test_spec, $const422$isa );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_category = assertions_high.gaf_arg2( assertion );
      final SubLObject current_mt = assertions_high.assertion_mt( assertion );
      if( NIL == kb_utilities.kbeq( current_category, $const46$KBContentTest_FullySpecified ) && ( ( NIL == kb_utilities.kbeq( current_mt, mt_vars.$anect_mt$.getGlobalValue() ) && NIL == kb_utilities.kbeq( current_mt,
          defining_mt ) ) || NIL == conses_high.member( current_category, test_categories, UNPROVIDED, UNPROVIDED ) ) )
      {
        ke.ke_unassert_assertion_now( assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    cdolist_list_var = test_categories;
    SubLObject category = NIL;
    category = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == kb_mapping_utilities.tuple_holds_in_relevant_mts( ConsesLow.list( $const422$isa, test_spec, category ), defining_mt, UNPROVIDED, UNPROVIDED ) )
      {
        kct_assert_test_category( test_spec, category, defining_mt );
      }
      cdolist_list_var = cdolist_list_var.rest();
      category = cdolist_list_var.first();
    }
    return test_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 91555L)
  public static SubLObject kct_assert_test_category(final SubLObject test_spec, final SubLObject test_category, final SubLObject defining_mt)
  {
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const422$isa, test_category, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 91742L)
  public static SubLObject kct_ensure_test_metrics(final SubLObject test_spec, final SubLObject metric_constants, final SubLObject defining_mt)
  {
    return kct_ensure_test_spec_exact_arg2s_for_pred( test_spec, $const439$testMetricsToGather, metric_constants, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 91960L)
  public static SubLObject kct_assert_test_metric(final SubLObject test_spec, final SubLObject metric_constant, final SubLObject defining_mt)
  {
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const439$testMetricsToGather, metric_constant, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 92165L)
  public static SubLObject kct_ensure_responsible_cyclists(final SubLObject test_spec, final SubLObject cyclists, final SubLObject defining_mt)
  {
    return kct_ensure_test_spec_exact_arg2s_for_pred( test_spec, $const440$testResponsibleCyclist, cyclists, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 92390L)
  public static SubLObject kct_assert_responsible_cyclist(final SubLObject test_spec, final SubLObject cyclist, final SubLObject defining_mt)
  {
    return kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, $const440$testResponsibleCyclist, cyclist, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 92591L)
  public static SubLObject kct_current_test_spec_arg1_assertions_for_pred(final SubLObject test_spec, final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym441$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const442$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( test_spec, ONE_INTEGER, predicate ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( test_spec, ONE_INTEGER, predicate );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw443$GAF, $kw444$TRUE, NIL );
              SubLObject done_var_$128 = NIL;
              final SubLObject token_var_$129 = NIL;
              while ( NIL == done_var_$128)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$129 );
                final SubLObject valid_$130 = makeBoolean( !token_var_$129.eql( assertion ) );
                if( NIL != valid_$130 )
                {
                  result = ConsesLow.cons( assertion, result );
                }
                done_var_$128 = makeBoolean( NIL == valid_$130 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$131, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 92902L)
  public static SubLObject kct_temporal_object_starting_point(final SubLObject temporal_object)
  {
    SubLObject start = ( NIL != time_interval_utilities.date_interval_p( temporal_object ) ) ? time_interval_utilities.cycl_interval_initial_second( temporal_object )
        : hlmt_relevance.starting_date( temporal_object, UNPROVIDED );
    if( NIL == start )
    {
      start = el_utilities.make_unary_formula( $const445$StartFn, temporal_object );
    }
    return start;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 93222L)
  public static SubLObject kct_interval_ending_now_started_by_temporal_object(final SubLObject temporal_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( kct_variables.kct_mt() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != hlmt.temporal_objectP( temporal_object ) )
      {
        result = el_utilities.make_binary_formula( $const446$TimeIntervalInclusiveFn, kct_temporal_object_starting_point( temporal_object ), $list447 );
      }
      else
      {
        result = el_utilities.make_unary_formula( $const448$IntervalEndedByFn_Inclusive, $list447 );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 93729L)
  public static SubLObject kct_temporally_qualifiable_predicateP(final SubLObject predicate)
  {
    return list_utilities.sublisp_boolean( ask_utilities.query_variable( $kw449$IGNORE, ConsesLow.listS( $const450$temporallyQualifiablePredicateInI, predicate, $list451 ), kct_variables.kct_mt(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 93956L)
  public static SubLObject kct_cycl_time_from_creation_time(final SubLObject fort)
  {
    final SubLObject creation_time = bookkeeping_store.creation_time( fort, UNPROVIDED );
    if( creation_time.isInteger() )
    {
      return date_utilities.universal_date_to_cycl_date( creation_time );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 94155L)
  public static SubLObject kct_ensure_test_spec_exact_arg2s_for_pred(final SubLObject test_spec, final SubLObject predicate, final SubLObject arg2s, final SubLObject defining_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject temporally_qualifiableP = kct_temporally_qualifiable_predicateP( predicate );
    final SubLObject current_arg2_assertions = kct_current_test_spec_arg1_assertions_for_pred( test_spec, predicate );
    final SubLObject mt_for_now = ( NIL != temporally_qualifiableP ) ? kct_variables.kct_mt_for_now( defining_mt ) : defining_mt;
    SubLObject cdolist_list_var = current_arg2_assertions;
    SubLObject arg2_assertion = NIL;
    arg2_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_arg2_term = assertions_high.gaf_arg2( arg2_assertion );
      final SubLObject current_mt = assertions_high.assertion_mt( arg2_assertion );
      final SubLObject current_monad_mt = hlmt.hlmt_monad_mt( current_mt );
      if( ( NIL == kb_utilities.kbeq( current_monad_mt, defining_mt ) || NIL == conses_high.member( current_arg2_term, arg2s, UNPROVIDED, UNPROVIDED ) ) && ( NIL == temporally_qualifiableP || NIL != ask_utilities
          .query_variable( $kw449$IGNORE, ConsesLow.list( predicate, test_spec, current_arg2_term ), mt_for_now, UNPROVIDED ) ) )
      {
        ke.ke_unassert_assertion_now( arg2_assertion );
        if( NIL != temporally_qualifiableP )
        {
          final SubLObject time_dim = hlmt.hlmt_temporal_mt( current_mt );
          SubLObject temporal_object = NIL;
          SubLObject time_param = NIL;
          thread.resetMultipleValues();
          final SubLObject temporal_object_$132 = hlmt.mt_time_dim_nat_temporal_values( time_dim );
          final SubLObject time_param_$133 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          temporal_object = temporal_object_$132;
          time_param = time_param_$133;
          if( NIL != kb_utilities.kbeq( time_param, $const452$Null_TimeParameter ) )
          {
            time_param = $const453$TimePoint;
          }
          final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( kct_variables.kct_mt() );
          final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject reference_object = ( NIL != hlmt.temporal_objectP( temporal_object ) ) ? temporal_object : kct_cycl_time_from_creation_time( test_spec );
            final SubLObject interval = kct_interval_ending_now_started_by_temporal_object( reference_object );
            final SubLObject restricted_mt = kct_utils.kct_new_hlmt( current_monad_mt, interval, time_param );
            kct_assert_test_spec_pred_arg2_basic( test_spec, predicate, current_arg2_term, restricted_mt );
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg2_assertion = cdolist_list_var.first();
    }
    cdolist_list_var = arg2s;
    SubLObject arg2_term = NIL;
    arg2_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == ask_utilities.query_variable( $kw449$IGNORE, ConsesLow.list( predicate, test_spec, arg2_term ), mt_for_now, UNPROVIDED ) )
      {
        kct_assert_test_spec_pred_arg2_possibly_starting_now( test_spec, predicate, arg2_term, defining_mt );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg2_term = cdolist_list_var.first();
    }
    return test_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 96397L)
  public static SubLObject kct_assert_test_spec_pred_arg2_possibly_starting_now(final SubLObject test_spec, final SubLObject predicate, final SubLObject arg2_term, SubLObject defining_mt)
  {
    if( NIL != kct_temporally_qualifiable_predicateP( predicate ) )
    {
      defining_mt = hlmt.new_hlmt( ConsesLow.list( defining_mt, hlmt.new_time_dimension( $list454, $const453$TimePoint ) ) );
    }
    return kct_assert_test_spec_pred_arg2_basic( test_spec, predicate, arg2_term, defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 96857L)
  public static SubLObject kct_assert_test_spec_pred_arg2_basic(final SubLObject test_spec, final SubLObject predicate, final SubLObject arg2_term, final SubLObject mt)
  {
    return ke.ke_assert_now( ConsesLow.list( predicate, test_spec, arg2_term ), mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 97195L)
  public static SubLObject cb_link_kct_control_panel(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str459$_KCT_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str460$cb_kct_control_panel );
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

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 97410L)
  public static SubLObject cb_kct_control_panel(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str456$KB_Content_Test_Control_Panel;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$134 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
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
          html_utilities.html_markup( $str125$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str126$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str127$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str128$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str129$Refresh_Frames );
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
            html_utilities.html_markup( $str41$post );
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
              html_utilities.html_hidden_input( $str462$cb_kct_control_panel_handler, T, UNPROVIDED );
              final SubLObject tests = sorted_kcts_owned_by( operation_communication.the_cyclist() );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str463$KB_Content_Tests_owned_by_ );
              cb_utilities.cb_form( operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str464$_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              if( NIL != tests )
              {
                kctcp_refresh_submit_helper();
                cb_kct_control_panel_table( tests );
                kctcp_refresh_submit_helper();
              }
              else
              {
                html_utilities.html_princ_strong( $str465$No_tests_ );
              }
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 98016L)
  public static SubLObject sorted_kcts_owned_by(final SubLObject cyclist)
  {
    return kb_utilities.sort_terms( kct_cyc_testing.kcts_owned_by( cyclist ), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 98120L)
  public static SubLObject kctcp_refresh_submit_helper()
  {
    cb_utilities.cb_link( $kw455$KCT_CONTROL_PANEL, $str467$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_submit_input( $str468$Submit, $str469$save, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 98314L)
  public static SubLObject cb_kct_control_panel_table(final SubLObject tests)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( THREE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_kct_control_panel_table_header();
      SubLObject cdolist_list_var = tests;
      SubLObject test = NIL;
      test = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject is_regression_testP = isa.isaP( test, $const302$KBContentRegressionTest, kct_variables.kct_mt(), UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_link( $kw72$KCT_EDIT, test, $str470$_Edit_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$140, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_link( $kw3$KCT_TEST, test, $str471$_Run_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$141, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( test, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$142, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw318$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject disabledP = makeBoolean( NIL != is_regression_testP && NIL == kct_asserted_regression_mts( test ) );
            html_utilities.html_checkbox_input( cb_utilities.cb_fort_identifier( test ), is_regression_testP, is_regression_testP, NIL, NIL, disabledP );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$143, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$139, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        test = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 99561L)
  public static SubLObject cb_kct_control_panel_table_header()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str472$Edit );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$144, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str473$Run );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$145, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str474$Name );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$146, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw28$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str475$Regression_Test_ );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$147, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 99971L)
  public static SubLObject cb_kct_control_panel_handler(SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    args = args.rest();
    final SubLObject all_kct_lst = sorted_kcts_owned_by( operation_communication.the_cyclist() );
    SubLObject save_settingsP = NIL;
    SubLObject are_regression_kcts = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject field = arg.first();
      if( field.equal( $str469$save ) )
      {
        save_settingsP = T;
      }
      else
      {
        final SubLObject kct = cb_utilities.cb_guess_fort( field, UNPROVIDED );
        if( NIL != kct )
        {
          are_regression_kcts = ConsesLow.cons( kct, are_regression_kcts );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    if( NIL != save_settingsP )
    {
      final SubLObject non_regression_kcts = list_utilities.fast_set_difference( all_kct_lst, are_regression_kcts, UNPROVIDED );
      if( NIL != ke.cyclist_is_guest() )
      {
        cyc_navigator_internals.guest_warn( $str476$Save_Interface );
      }
      else
      {
        SubLObject cdolist_list_var2 = are_regression_kcts;
        SubLObject kct2 = NIL;
        kct2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          update_regression_test_status( kct2, T );
          cdolist_list_var2 = cdolist_list_var2.rest();
          kct2 = cdolist_list_var2.first();
        }
        cdolist_list_var2 = non_regression_kcts;
        kct2 = NIL;
        kct2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          update_regression_test_status( kct2, NIL );
          cdolist_list_var2 = cdolist_list_var2.rest();
          kct2 = cdolist_list_var2.first();
        }
      }
      html_utilities.html_markup( $str20$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str21$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw22$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw23$CB_CYC );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        html_utilities.html_princ( $str477$Tests__Regression_Status_Modified );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$148 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
            html_utilities.html_princ_strong( $str477$Tests__Regression_Status_Modified );
            html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
            cb_utilities.cb_frame_update_message_page_info( $str456$KB_Content_Test_Control_Panel );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$149, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$148, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 101749L)
  public static SubLObject update_regression_test_status(final SubLObject kct, final SubLObject rt_desiredP)
  {
    final SubLObject mts = kct_asserted_regression_mts( kct );
    if( NIL != rt_desiredP )
    {
      if( NIL == mts )
      {
        ke.ke_assert( ConsesLow.listS( $const422$isa, kct, $list479 ), kct_variables.kct_mt(), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      SubLObject cdolist_list_var = mts;
      SubLObject mt = NIL;
      mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_unassert_now( ConsesLow.listS( $const422$isa, kct, $list479 ), mt );
        if( NIL == kct_utils.kct_test_spec_p( kct, UNPROVIDED ) )
        {
          ke.ke_assert( ConsesLow.listS( $const422$isa, kct, $list424 ), kct_variables.kct_mt(), UNPROVIDED, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        mt = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/cb-kct-test.lisp", position = 102534L)
  public static SubLObject kct_asserted_regression_mts(final SubLObject kct)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mts = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym441$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const442$EverythingPSC, thread );
      SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl( ConsesLow.listS( $const422$isa, kct, $list479 ), UNPROVIDED );
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertions_high.asserted_assertionP( ass ) )
        {
          mts = ConsesLow.cons( assertions_high.assertion_mt( ass ), mts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( mts );
  }

  public static SubLObject declare_cb_kct_test_file()
  {
    SubLFiles.declareFunction( me, "cb_link_kct_test", "CB-LINK-KCT-TEST", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_test_run", "CB-KCT-TEST-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kct_test_set", "CB-LINK-KCT-TEST-SET", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_test_set_run", "CB-KCT-TEST-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kct", "CB-LINK-KCT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_main", "CB-KCT-MAIN", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_status_table_header", "CB-KCT-STATUS-TABLE-HEADER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_enter_test_section", "CB-KCT-ENTER-TEST-SECTION", 0, 2, false );
    SubLFiles.declareFunction( me, "cb_kct_start_test", "CB-KCT-START-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_start_test_collection", "CB-KCT-START-TEST-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_thinking_status_row_color", "CB-KCT-THINKING-STATUS-ROW-COLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_show_status", "CB-KCT-SHOW-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kct_toggle_refresh", "CB-LINK-KCT-TOGGLE-REFRESH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_toggle_refresh", "CB-KCT-TOGGLE-REFRESH", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_kct_forget", "CB-LINK-KCT-FORGET", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_thinking_forget", "CB-KCT-THINKING-FORGET", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_kct_abort", "CB-LINK-KCT-ABORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_thinking_abort", "CB-KCT-THINKING-ABORT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_kct_results", "CB-LINK-KCT-RESULTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_thinking_results", "CB-KCT-THINKING-RESULTS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_kct_members", "CB-LINK-KCT-MEMBERS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_thinking_members", "CB-KCT-THINKING-MEMBERS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_collection_results", "CB-KCT-COLLECTION-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_individual_runstate_results", "CB-KCT-INDIVIDUAL-RUNSTATE-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_register_test_spec_of_inference", "KCT-REGISTER-TEST-SPEC-OF-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_deregister_test_spec_of_inference", "KCT-DEREGISTER-TEST-SPEC-OF-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_lookup_test_spec_by_inference", "KCT-LOOKUP-TEST-SPEC-BY-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_print_function_trampoline", "KCT-TEST-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_p", "KCT-TEST-STATE-P", 1, 0, false );
    new $kct_test_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "kct_test_state_test_spec", "KCT-TEST-STATE-TEST-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_name", "KCT-TEST-STATE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_comments", "KCT-TEST-STATE-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_query_state", "KCT-TEST-STATE-QUERY-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_save_mt", "KCT-TEST-STATE-SAVE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_answer_status", "KCT-TEST-STATE-ANSWER-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_answer_options_index", "KCT-TEST-STATE-ANSWER-OPTIONS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_answer_options_bindings_index", "KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_categories", "KCT-TEST-STATE-CATEGORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_metrics", "KCT-TEST-STATE-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_cyclists", "KCT-TEST-STATE-CYCLISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_notes", "KCT-TEST-STATE-NOTES", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_answer_cardinality", "KCT-TEST-STATE-ANSWER-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_test_spec", "_CSETF-KCT-TEST-STATE-TEST-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_name", "_CSETF-KCT-TEST-STATE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_comments", "_CSETF-KCT-TEST-STATE-COMMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_query_state", "_CSETF-KCT-TEST-STATE-QUERY-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_save_mt", "_CSETF-KCT-TEST-STATE-SAVE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_answer_status", "_CSETF-KCT-TEST-STATE-ANSWER-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_answer_options_index", "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_answer_options_bindings_index", "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_categories", "_CSETF-KCT-TEST-STATE-CATEGORIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_metrics", "_CSETF-KCT-TEST-STATE-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_cyclists", "_CSETF-KCT-TEST-STATE-CYCLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_notes", "_CSETF-KCT-TEST-STATE-NOTES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_test_state_answer_cardinality", "_CSETF-KCT-TEST-STATE-ANSWER-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_kct_test_state", "MAKE-KCT-TEST-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_kct_test_state", "VISIT-DEFSTRUCT-KCT-TEST-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_kct_test_state_method", "VISIT-DEFSTRUCT-OBJECT-KCT-TEST-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_add_note", "KCT-TEST-STATE-ADD-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_set_cardinality", "KCT-TEST-STATE-SET-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_new_test_state_from_test_spec", "CB-KCT-NEW-TEST-STATE-FROM-TEST-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_new_test_state_from_inference", "CB-KCT-NEW-TEST-STATE-FROM-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_exact_bindings", "KCT-TEST-STATE-EXACT-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_wanted_bindings", "KCT-TEST-STATE-WANTED-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_unwanted_bindings", "KCT-TEST-STATE-UNWANTED-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_unspecified_bindings", "KCT-TEST-STATE-UNSPECIFIED-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_bindings_unimportantP", "KCT-TEST-STATE-BINDINGS-UNIMPORTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_no_answersP", "KCT-TEST-STATE-NO-ANSWERS?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_state_bindings_of_type", "KCT-TEST-STATE-BINDINGS-OF-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_kct_test_being_saved", "CB-CLEAR-KCT-TEST-BEING-SAVED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_test_being_saved", "CB-KCT-TEST-BEING-SAVED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_set_kct_test_being_saved", "CB-SET-KCT-TEST-BEING-SAVED", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_print_function_trampoline", "KCT-ANSWER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_p", "KCT-ANSWER-P", 1, 0, false );
    new $kct_answer_p$UnaryFunction();
    SubLFiles.declareFunction( me, "kct_answer_binding_set", "KCT-ANSWER-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_status", "KCT-ANSWER-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_id", "KCT-ANSWER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_answer_binding_set", "_CSETF-KCT-ANSWER-BINDING-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_answer_status", "_CSETF-KCT-ANSWER-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kct_answer_id", "_CSETF-KCT-ANSWER-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "make_kct_answer", "MAKE-KCT-ANSWER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_kct_answer", "VISIT-DEFSTRUCT-KCT-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_kct_answer_method", "VISIT-DEFSTRUCT-OBJECT-KCT-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_kct_answer", "NEW-KCT-ANSWER", 2, 1, false );
    SubLFiles.declareFunction( me, "kct_answer_id_count", "KCT-ANSWER-ID-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_id_lookup", "KCT-ANSWER-ID-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_bindings_lookup", "KCT-ANSWER-BINDINGS-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_answer_id_remove", "KCT-ANSWER-ID-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_kct_answer_status", "SET-KCT-ANSWER-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kct_edit", "CB-LINK-KCT-EDIT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_edit_test", "CB-EDIT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kct_save", "CB-LINK-KCT-SAVE", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_save_as_test", "CB-SAVE-AS-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_confirm_save_as_test", "CB-CONFIRM-SAVE-AS-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_save_as_test_header", "CB-SHOW-SAVE-AS-TEST-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_save_as_test_submit_section", "CB-SAVE-AS-TEST-SUBMIT-SECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_test_categories_section", "CB-KCT-TEST-CATEGORIES-SECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_test_metrics_section", "CB-KCT-TEST-METRICS-SECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_responsible_cyclists_section", "CB-KCT-RESPONSIBLE-CYCLISTS-SECTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_confirm_save_as_test", "CB-HANDLE-CONFIRM-SAVE-AS-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_prune_test_state_answers_for_sentence", "CB-KCT-PRUNE-TEST-STATE-ANSWERS-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_test_categories", "CB-KCT-EXTRACT-TEST-CATEGORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_test_metrics", "CB-KCT-EXTRACT-TEST-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_responsible_cyclists", "CB-KCT-EXTRACT-RESPONSIBLE-CYCLISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_toggle_rowcolor", "CB-KCT-TOGGLE-ROWCOLOR", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_specify_test_results", "CB-KCT-SPECIFY-TEST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_specify_new_binding_section", "CB-KCT-SPECIFY-NEW-BINDING-SECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_show_answer_inputs", "CB-KCT-SHOW-ANSWER-INPUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_show_wanted_answers", "CB-KCT-SHOW-WANTED-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_show_unwanted_answers", "CB-KCT-SHOW-UNWANTED-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_show_unspecified_answers", "CB-KCT-SHOW-UNSPECIFIED-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_show_answers_of_type", "CB-KCT-SHOW-ANSWERS-OF-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_specify_test_results", "CB-HANDLE-SPECIFY-TEST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_submit_mode", "CB-KCT-EXTRACT-SUBMIT-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_update_answer_cardinality", "CB-KCT-UPDATE-ANSWER-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_update_answer_options", "CB-KCT-UPDATE-ANSWER-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_binding_value", "CB-KCT-EXTRACT-BINDING-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_new_binding_status", "CB-KCT-EXTRACT-NEW-BINDING-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_exactness", "CB-KCT-EXTRACT-EXACTNESS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_test_spec", "CB-KCT-EXTRACT-TEST-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_answers", "CB-KCT-EXTRACT-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_exact_answers", "CB-KCT-EXTRACT-EXACT-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_wanted_answers", "CB-KCT-EXTRACT-WANTED-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_extract_unwanted_answers", "CB-KCT-EXTRACT-UNWANTED-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_gather_answers_internal", "CB-KCT-GATHER-ANSWERS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_save_new_test", "CB-KCT-SAVE-NEW-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_overwrite_test", "CB-KCT-OVERWRITE-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_test_spec_definition", "KCT-ASSERT-TEST-SPEC-DEFINITION", 15, 0, false );
    SubLFiles.declareFunction( me, "multiple_choice_option_specs_non_trivialP", "MULTIPLE-CHOICE-OPTION-SPECS-NON-TRIVIAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_test_spec_definition", "KCT-ENSURE-TEST-SPEC-DEFINITION", 15, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_answer_cardinality", "KCT-ENSURE-ANSWER-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_answer_min_cardinality", "KCT-ENSURE-ANSWER-MIN-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_answer_max_cardinality", "KCT-ENSURE-ANSWER-MAX-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_answer_cardinality", "KCT-ASSERT-ANSWER-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_answer_min_cardinality", "KCT-ASSERT-ANSWER-MIN-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_answer_max_cardinality", "KCT-ASSERT-ANSWER-MAX-CARDINALITY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_exact_bindings", "KCT-ENSURE-EXACT-BINDINGS", 4, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_wanted_unwanted_bindings", "KCT-ENSURE-WANTED-UNWANTED-BINDINGS", 4, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_unimportant_bindings", "KCT-ENSURE-UNIMPORTANT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_exact_bindings", "KCT-ASSERT-EXACT-BINDINGS", 4, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_wanted_binding", "KCT-ASSERT-WANTED-BINDING", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_unwanted_binding", "KCT-ASSERT-UNWANTED-BINDING", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_unimportant_bindings", "KCT-ASSERT-UNIMPORTANT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_test_categories", "KCT-ENSURE-TEST-CATEGORIES", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_test_category", "KCT-ASSERT-TEST-CATEGORY", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_test_metrics", "KCT-ENSURE-TEST-METRICS", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_test_metric", "KCT-ASSERT-TEST-METRIC", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_responsible_cyclists", "KCT-ENSURE-RESPONSIBLE-CYCLISTS", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_responsible_cyclist", "KCT-ASSERT-RESPONSIBLE-CYCLIST", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_current_test_spec_arg1_assertions_for_pred", "KCT-CURRENT-TEST-SPEC-ARG1-ASSERTIONS-FOR-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_temporal_object_starting_point", "KCT-TEMPORAL-OBJECT-STARTING-POINT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_interval_ending_now_started_by_temporal_object", "KCT-INTERVAL-ENDING-NOW-STARTED-BY-TEMPORAL-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_temporally_qualifiable_predicateP", "KCT-TEMPORALLY-QUALIFIABLE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_cycl_time_from_creation_time", "KCT-CYCL-TIME-FROM-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_ensure_test_spec_exact_arg2s_for_pred", "KCT-ENSURE-TEST-SPEC-EXACT-ARG2S-FOR-PRED", 4, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_test_spec_pred_arg2_possibly_starting_now", "KCT-ASSERT-TEST-SPEC-PRED-ARG2-POSSIBLY-STARTING-NOW", 4, 0, false );
    SubLFiles.declareFunction( me, "kct_assert_test_spec_pred_arg2_basic", "KCT-ASSERT-TEST-SPEC-PRED-ARG2-BASIC", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kct_control_panel", "CB-LINK-KCT-CONTROL-PANEL", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_kct_control_panel", "CB-KCT-CONTROL-PANEL", 0, 1, false );
    SubLFiles.declareFunction( me, "sorted_kcts_owned_by", "SORTED-KCTS-OWNED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "kctcp_refresh_submit_helper", "KCTCP-REFRESH-SUBMIT-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_control_panel_table", "CB-KCT-CONTROL-PANEL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_control_panel_table_header", "CB-KCT-CONTROL-PANEL-TABLE-HEADER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_kct_control_panel_handler", "CB-KCT-CONTROL-PANEL-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "update_regression_test_status", "UPDATE-REGRESSION-TEST-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_asserted_regression_mts", "KCT-ASSERTED-REGRESSION-MTS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_kct_test_file()
  {
    $cb_kct_refreshP$ = SubLFiles.defparameter( "*CB-KCT-REFRESH?*", NIL );
    $kct_inference_test_spec_map$ = SubLFiles.defparameter( "*KCT-INFERENCE-TEST-SPEC-MAP*", Hashtables.make_hash_table( $int144$1024, UNPROVIDED, UNPROVIDED ) );
    $dtp_kct_test_state$ = SubLFiles.defconstant( "*DTP-KCT-TEST-STATE*", $sym147$KCT_TEST_STATE );
    $cb_kct_test_being_saved$ = SubLFiles.defvar( "*CB-KCT-TEST-BEING-SAVED*", NIL );
    $dtp_kct_answer$ = SubLFiles.defconstant( "*DTP-KCT-ANSWER*", $sym220$KCT_ANSWER );
    $cb_kct_rowcolor$ = SubLFiles.defparameter( "*CB-KCT-ROWCOLOR*", $str27$_ffffff );
    return NIL;
  }

  public static SubLObject setup_cb_kct_test_file()
  {
    cb_utilities.setup_cb_link_method( $kw3$KCT_TEST, $sym4$CB_LINK_KCT_TEST, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym5$CB_KCT_TEST_RUN, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw9$KCT_TEST_SET, $sym10$CB_LINK_KCT_TEST_SET, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym11$CB_KCT_TEST_SET_RUN, $kw6$HTML_HANDLER );
    cb_utilities.declare_cb_tool( $kw12$KCT, $str13$KB_Content_Test_Monitor, $str14$KCTRun, $str15$View_status_of_running_and_comple );
    cb_utilities.setup_cb_link_method( $kw12$KCT, $sym18$CB_LINK_KCT, ONE_INTEGER );
    utilities_macros.register_html_state_variable( $sym19$_CB_KCT_REFRESH__ );
    html_macros.note_cgi_handler_function( $sym35$CB_KCT_MAIN, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym55$CB_KCT_START_TEST, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym57$CB_KCT_START_TEST_COLLECTION, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw29$KCT_TOGGLE_REFRESH, $sym91$CB_LINK_KCT_TOGGLE_REFRESH, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym94$CB_KCT_TOGGLE_REFRESH, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw77$KCT_FORGET, $sym97$CB_LINK_KCT_FORGET, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym98$CB_KCT_THINKING_FORGET, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw76$KCT_ABORT, $sym101$CB_LINK_KCT_ABORT, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym102$CB_KCT_THINKING_ABORT, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw84$KCT_RESULTS, $sym105$CB_LINK_KCT_RESULTS, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym109$CB_KCT_THINKING_RESULTS, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw74$KCT_MEMBERS, $sym112$CB_LINK_KCT_MEMBERS, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym119$CB_KCT_THINKING_MEMBERS, $kw6$HTML_HANDLER );
    Hashtables.sethash( $kw120$CB_KCT_TEST_SET, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str121$cb_kct_test_set_html, NIL ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_kct_test_state$.getGlobalValue(), Symbols.symbol_function( $sym154$KCT_TEST_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list155 );
    Structures.def_csetf( $sym156$KCT_TEST_STATE_TEST_SPEC, $sym157$_CSETF_KCT_TEST_STATE_TEST_SPEC );
    Structures.def_csetf( $sym158$KCT_TEST_STATE_NAME, $sym159$_CSETF_KCT_TEST_STATE_NAME );
    Structures.def_csetf( $sym160$KCT_TEST_STATE_COMMENTS, $sym161$_CSETF_KCT_TEST_STATE_COMMENTS );
    Structures.def_csetf( $sym162$KCT_TEST_STATE_QUERY_STATE, $sym163$_CSETF_KCT_TEST_STATE_QUERY_STATE );
    Structures.def_csetf( $sym164$KCT_TEST_STATE_SAVE_MT, $sym165$_CSETF_KCT_TEST_STATE_SAVE_MT );
    Structures.def_csetf( $sym166$KCT_TEST_STATE_ANSWER_STATUS, $sym167$_CSETF_KCT_TEST_STATE_ANSWER_STATUS );
    Structures.def_csetf( $sym168$KCT_TEST_STATE_ANSWER_OPTIONS_INDEX, $sym169$_CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_INDEX );
    Structures.def_csetf( $sym170$KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX, $sym171$_CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX );
    Structures.def_csetf( $sym172$KCT_TEST_STATE_CATEGORIES, $sym173$_CSETF_KCT_TEST_STATE_CATEGORIES );
    Structures.def_csetf( $sym174$KCT_TEST_STATE_METRICS, $sym175$_CSETF_KCT_TEST_STATE_METRICS );
    Structures.def_csetf( $sym176$KCT_TEST_STATE_CYCLISTS, $sym177$_CSETF_KCT_TEST_STATE_CYCLISTS );
    Structures.def_csetf( $sym178$KCT_TEST_STATE_NOTES, $sym179$_CSETF_KCT_TEST_STATE_NOTES );
    Structures.def_csetf( $sym180$KCT_TEST_STATE_ANSWER_CARDINALITY, $sym181$_CSETF_KCT_TEST_STATE_ANSWER_CARDINALITY );
    Equality.identity( $sym147$KCT_TEST_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kct_test_state$.getGlobalValue(), Symbols.symbol_function( $sym200$VISIT_DEFSTRUCT_OBJECT_KCT_TEST_STATE_METHOD ) );
    utilities_macros.register_html_state_variable( $sym219$_CB_KCT_TEST_BEING_SAVED_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_kct_answer$.getGlobalValue(), Symbols.symbol_function( $sym226$KCT_ANSWER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list227 );
    Structures.def_csetf( $sym228$KCT_ANSWER_BINDING_SET, $sym229$_CSETF_KCT_ANSWER_BINDING_SET );
    Structures.def_csetf( $sym230$KCT_ANSWER_STATUS, $sym231$_CSETF_KCT_ANSWER_STATUS );
    Structures.def_csetf( $sym232$KCT_ANSWER_ID, $sym233$_CSETF_KCT_ANSWER_ID );
    Equality.identity( $sym220$KCT_ANSWER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kct_answer$.getGlobalValue(), Symbols.symbol_function( $sym238$VISIT_DEFSTRUCT_OBJECT_KCT_ANSWER_METHOD ) );
    cb_utilities.setup_cb_link_method( $kw72$KCT_EDIT, $sym245$CB_LINK_KCT_EDIT, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym247$CB_EDIT_TEST, $kw6$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw252$KCT_SAVE, $sym253$CB_LINK_KCT_SAVE, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym256$CB_SAVE_AS_TEST, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym329$CB_HANDLE_CONFIRM_SAVE_AS_TEST, $kw6$HTML_HANDLER );
    utilities_macros.register_html_state_variable( $sym336$_CB_KCT_ROWCOLOR_ );
    html_macros.note_cgi_handler_function( $sym396$CB_HANDLE_SPECIFY_TEST_RESULTS, $kw6$HTML_HANDLER );
    cb_utilities.declare_cb_tool( $kw455$KCT_CONTROL_PANEL, $str456$KB_Content_Test_Control_Panel, $str457$KCT, $str458$View_and_edit_your_KB_Content_Tes );
    cb_utilities.setup_cb_link_method( $kw455$KCT_CONTROL_PANEL, $sym461$CB_LINK_KCT_CONTROL_PANEL, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym466$CB_KCT_CONTROL_PANEL, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym478$CB_KCT_CONTROL_PANEL_HANDLER, $kw6$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_kct_test_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_kct_test_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_kct_test_file();
  }
  static
  {
    me = new cb_kct_test();
    $cb_kct_refreshP$ = null;
    $kct_inference_test_spec_map$ = null;
    $dtp_kct_test_state$ = null;
    $cb_kct_test_being_saved$ = null;
    $dtp_kct_answer$ = null;
    $cb_kct_rowcolor$ = null;
    $str0$_Run_Test_ = makeString( "[Run Test]" );
    $kw1$MAIN = makeKeyword( "MAIN" );
    $str2$cb_kct_test_run__a = makeString( "cb-kct-test-run&~a" );
    $kw3$KCT_TEST = makeKeyword( "KCT-TEST" );
    $sym4$CB_LINK_KCT_TEST = makeSymbol( "CB-LINK-KCT-TEST" );
    $sym5$CB_KCT_TEST_RUN = makeSymbol( "CB-KCT-TEST-RUN" );
    $kw6$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str7$_Run_Test_Set_ = makeString( "[Run Test Set]" );
    $str8$cb_kct_test_set_run__a = makeString( "cb-kct-test-set-run&~a" );
    $kw9$KCT_TEST_SET = makeKeyword( "KCT-TEST-SET" );
    $sym10$CB_LINK_KCT_TEST_SET = makeSymbol( "CB-LINK-KCT-TEST-SET" );
    $sym11$CB_KCT_TEST_SET_RUN = makeSymbol( "CB-KCT-TEST-SET-RUN" );
    $kw12$KCT = makeKeyword( "KCT" );
    $str13$KB_Content_Test_Monitor = makeString( "KB Content Test Monitor" );
    $str14$KCTRun = makeString( "KCTRun" );
    $str15$View_status_of_running_and_comple = makeString( "View status of running and completed KB Content Tests" );
    $str16$_KCTRun_ = makeString( "[KCTRun]" );
    $str17$cb_kct_main = makeString( "cb-kct-main" );
    $sym18$CB_LINK_KCT = makeSymbol( "CB-LINK-KCT" );
    $sym19$_CB_KCT_REFRESH__ = makeSymbol( "*CB-KCT-REFRESH?*" );
    $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str21$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw22$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw23$CB_CYC = makeKeyword( "CB-CYC" );
    $str24$Refresh = makeString( "Refresh" );
    $str25$5__URL_cg_cb_kct_main = makeString( "5; URL=cg?cb-kct-main" );
    $str26$_9999ff = makeString( "#9999ff" );
    $str27$_ffffff = makeString( "#ffffff" );
    $kw28$TOP = makeKeyword( "TOP" );
    $kw29$KCT_TOGGLE_REFRESH = makeKeyword( "KCT-TOGGLE-REFRESH" );
    $list30 = ConsesLow.list( makeString( "main" ) );
    $str31$None_running_ = makeString( "None running." );
    $str32$Individual_Tests = makeString( "Individual Tests" );
    $str33$Test_Categories = makeString( "Test Categories" );
    $str34$There_are_no_running_or_finished_ = makeString( "There are no running or finished tests at this time." );
    $sym35$CB_KCT_MAIN = makeSymbol( "CB-KCT-MAIN" );
    $str36$_99ccff = makeString( "#99ccff" );
    $str37$TEST = makeString( "TEST" );
    $str38$TASK_STATUS = makeString( "TASK STATUS" );
    $str39$TASK_ACTIONS = makeString( "TASK ACTIONS" );
    $str40$TEST_RESULT = makeString( "TEST RESULT" );
    $str41$post = makeString( "post" );
    $str42$cb_kct_start_test = makeString( "cb-kct-start-test" );
    $str43$Enter_test_to_run___ = makeString( "Enter test to run : " );
    $str44$kct_test = makeString( "kct-test" );
    $str45$Complete = makeString( "Complete" );
    $const46$KBContentTest_FullySpecified = constant_handles.reader_make_constant_shell( makeString( "KBContentTest-FullySpecified" ) );
    $str47$Clear = makeString( "Clear" );
    $int48$40 = makeInteger( 40 );
    $str49$Run_Test = makeString( "Run Test" );
    $str50$cb_kct_start_test_collection = makeString( "cb-kct-start-test-collection" );
    $str51$Enter_test_category_to_run___ = makeString( "Enter test category to run : " );
    $str52$kct_coll = makeString( "kct-coll" );
    $const53$KBContentTestSpecificationType = constant_handles.reader_make_constant_shell( makeString( "KBContentTestSpecificationType" ) );
    $str54$_A_is_not_the_name_of_a___KBConte = makeString( "~A is not the name of a #$KBContentTest-FullySpecified." );
    $sym55$CB_KCT_START_TEST = makeSymbol( "CB-KCT-START-TEST" );
    $str56$_A_is_not_the_name_of_a___KBConte = makeString( "~A is not the name of a #$KBContentTestSpecificationType." );
    $sym57$CB_KCT_START_TEST_COLLECTION = makeSymbol( "CB-KCT-START-TEST-COLLECTION" );
    $kw58$RUNNING = makeKeyword( "RUNNING" );
    $kw59$STARTED = makeKeyword( "STARTED" );
    $str60$_99ffff = makeString( "#99ffff" );
    $kw61$STOPPED = makeKeyword( "STOPPED" );
    $kw62$NONE = makeKeyword( "NONE" );
    $str63$_cccccc = makeString( "#cccccc" );
    $kw64$ERROR = makeKeyword( "ERROR" );
    $str65$_ff6666 = makeString( "#ff6666" );
    $kw66$FINISHED = makeKeyword( "FINISHED" );
    $kw67$SUCCESS = makeKeyword( "SUCCESS" );
    $kw68$FAILURE = makeKeyword( "FAILURE" );
    $kw69$PROBLEM = makeKeyword( "PROBLEM" );
    $kw70$SKIPPED = makeKeyword( "SKIPPED" );
    $kw71$COLLECTION = makeKeyword( "COLLECTION" );
    $kw72$KCT_EDIT = makeKeyword( "KCT-EDIT" );
    $str73$_Edit_Test_ = makeString( "[Edit Test]" );
    $kw74$KCT_MEMBERS = makeKeyword( "KCT-MEMBERS" );
    $kw75$INFERENCE = makeKeyword( "INFERENCE" );
    $kw76$KCT_ABORT = makeKeyword( "KCT-ABORT" );
    $kw77$KCT_FORGET = makeKeyword( "KCT-FORGET" );
    $str78$_ = makeString( " " );
    $str79$Task_is_just_starting_ = makeString( "Task is just starting." );
    $str80$Test_halted_with_this_error___A = makeString( "Test halted with this error: ~A" );
    $str81$Task_was_halted_before_completion = makeString( "Task was halted before completion." );
    $kw82$SEVERE = makeKeyword( "SEVERE" );
    $str83$Test_is_un_executable_due_to_conf = makeString( "Test is un-executable due to configuration errors.  Email detailing problems has been sent to the responsible cyclist.  Problems:  ~A" );
    $kw84$KCT_RESULTS = makeKeyword( "KCT-RESULTS" );
    $str85$Task_was_never_begun_ = makeString( "Task was never begun." );
    $str86$Unknown_thinking_status__A = makeString( "Unknown thinking status ~A" );
    $str87$_Halt_Auto_Refresh_ = makeString( "[Halt Auto Refresh]" );
    $str88$_Start_Auto_Refresh_ = makeString( "[Start Auto Refresh]" );
    $str89$cb_kct_toggle_refresh = makeString( "cb-kct-toggle-refresh" );
    $str90$_ = makeString( "|" );
    $sym91$CB_LINK_KCT_TOGGLE_REFRESH = makeSymbol( "CB-LINK-KCT-TOGGLE-REFRESH" );
    $str92$main = makeString( "main" );
    $str93$members = makeString( "members" );
    $sym94$CB_KCT_TOGGLE_REFRESH = makeSymbol( "CB-KCT-TOGGLE-REFRESH" );
    $str95$_Forget_ = makeString( "[Forget]" );
    $str96$cb_kct_thinking_forget__a = makeString( "cb-kct-thinking-forget&~a" );
    $sym97$CB_LINK_KCT_FORGET = makeSymbol( "CB-LINK-KCT-FORGET" );
    $sym98$CB_KCT_THINKING_FORGET = makeSymbol( "CB-KCT-THINKING-FORGET" );
    $str99$_Abort_ = makeString( "[Abort]" );
    $str100$cb_kct_thinking_abort__a = makeString( "cb-kct-thinking-abort&~a" );
    $sym101$CB_LINK_KCT_ABORT = makeSymbol( "CB-LINK-KCT-ABORT" );
    $sym102$CB_KCT_THINKING_ABORT = makeSymbol( "CB-KCT-THINKING-ABORT" );
    $str103$_View_Results_ = makeString( "[View Results]" );
    $str104$cb_kct_thinking_results__a = makeString( "cb-kct-thinking-results&~a" );
    $sym105$CB_LINK_KCT_RESULTS = makeSymbol( "CB-LINK-KCT-RESULTS" );
    $kw106$INDIVIDUAL = makeKeyword( "INDIVIDUAL" );
    $kw107$BRIEF = makeKeyword( "BRIEF" );
    $str108$Wrong_type_of_KCT_Thinking_Task__ = makeString( "Wrong type of KCT Thinking Task: ~A!" );
    $sym109$CB_KCT_THINKING_RESULTS = makeSymbol( "CB-KCT-THINKING-RESULTS" );
    $str110$_View_Member_Tests_ = makeString( "[View Member Tests]" );
    $str111$cb_kct_thinking_members__a = makeString( "cb-kct-thinking-members&~a" );
    $sym112$CB_LINK_KCT_MEMBERS = makeSymbol( "CB-LINK-KCT-MEMBERS" );
    $str113$Member_test_status_for__A = makeString( "Member test status for ~A" );
    $str114$5__URL_cg_cb_kct_thinking_members = makeString( "5; URL=cg?cb-kct-thinking-members&~A" );
    $str115$This_test_category_has_no_member_ = makeString( "This test category has no member tests!" );
    $str116$The_test_was_stopped_before_all_m = makeString( "The test was stopped before all member tests could finish." );
    $str117$All_member_tests_have_finished_ = makeString( "All member tests have finished." );
    $str118$_bbbbbb = makeString( "#bbbbbb" );
    $sym119$CB_KCT_THINKING_MEMBERS = makeSymbol( "CB-KCT-THINKING-MEMBERS" );
    $kw120$CB_KCT_TEST_SET = makeKeyword( "CB-KCT-TEST-SET" );
    $str121$cb_kct_test_set_html = makeString( "cb-kct-test-set.html" );
    $str122$Test_Category_Results = makeString( "Test Category Results" );
    $kw123$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw124$SHA1 = makeKeyword( "SHA1" );
    $str125$yui_skin_sam = makeString( "yui-skin-sam" );
    $str126$reloadFrameButton = makeString( "reloadFrameButton" );
    $str127$button = makeString( "button" );
    $str128$reload = makeString( "reload" );
    $str129$Refresh_Frames = makeString( "Refresh Frames" );
    $str130$Test_Category__ = makeString( "Test Category: " );
    $str131$First_test_in_set_started__ = makeString( "First test in set started: " );
    $str132$_unimplemented_ = makeString( "[unimplemented]" );
    $str133$Last_test_in_set_ended__ = makeString( "Last test in set ended: " );
    $str134$Overall_status__ = makeString( "Overall status: " );
    $str135$Explanation__ = makeString( "Explanation: " );
    $str136$Results_for_member_tests_ = makeString( "Results for member tests:" );
    $sym137$KCT_RUNSTATE_P = makeSymbol( "KCT-RUNSTATE-P" );
    $str138$Test_Results_for_ = makeString( "Test Results for " );
    $str139$Query__ = makeString( "Query: " );
    $str140$Query_Formula__ = makeString( "Query Formula: " );
    $str141$Test_Status__ = makeString( "Test Status: " );
    $str142$_B40000 = makeString( "#B40000" );
    $str143$_228b22 = makeString( "#228b22" );
    $int144$1024 = makeInteger( 1024 );
    $sym145$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym146$KCT_TEST_SPEC_P = makeSymbol( "KCT-TEST-SPEC-P" );
    $sym147$KCT_TEST_STATE = makeSymbol( "KCT-TEST-STATE" );
    $sym148$KCT_TEST_STATE_P = makeSymbol( "KCT-TEST-STATE-P" );
    $list149 = ConsesLow.list( new SubLObject[] { makeSymbol( "TEST-SPEC" ), makeSymbol( "NAME" ), makeSymbol( "COMMENTS" ), makeSymbol( "QUERY-STATE" ), makeSymbol( "SAVE-MT" ), makeSymbol( "ANSWER-STATUS" ),
      makeSymbol( "ANSWER-OPTIONS-INDEX" ), makeSymbol( "ANSWER-OPTIONS-BINDINGS-INDEX" ), makeSymbol( "CATEGORIES" ), makeSymbol( "METRICS" ), makeSymbol( "CYCLISTS" ), makeSymbol( "NOTES" ), makeSymbol(
          "ANSWER-CARDINALITY" )
    } );
    $list150 = ConsesLow.list( new SubLObject[] { makeKeyword( "TEST-SPEC" ), makeKeyword( "NAME" ), makeKeyword( "COMMENTS" ), makeKeyword( "QUERY-STATE" ), makeKeyword( "SAVE-MT" ), makeKeyword( "ANSWER-STATUS" ),
      makeKeyword( "ANSWER-OPTIONS-INDEX" ), makeKeyword( "ANSWER-OPTIONS-BINDINGS-INDEX" ), makeKeyword( "CATEGORIES" ), makeKeyword( "METRICS" ), makeKeyword( "CYCLISTS" ), makeKeyword( "NOTES" ), makeKeyword(
          "ANSWER-CARDINALITY" )
    } );
    $list151 = ConsesLow.list( new SubLObject[] { makeSymbol( "KCT-TEST-STATE-TEST-SPEC" ), makeSymbol( "KCT-TEST-STATE-NAME" ), makeSymbol( "KCT-TEST-STATE-COMMENTS" ), makeSymbol( "KCT-TEST-STATE-QUERY-STATE" ),
      makeSymbol( "KCT-TEST-STATE-SAVE-MT" ), makeSymbol( "KCT-TEST-STATE-ANSWER-STATUS" ), makeSymbol( "KCT-TEST-STATE-ANSWER-OPTIONS-INDEX" ), makeSymbol( "KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX" ), makeSymbol(
          "KCT-TEST-STATE-CATEGORIES" ), makeSymbol( "KCT-TEST-STATE-METRICS" ), makeSymbol( "KCT-TEST-STATE-CYCLISTS" ), makeSymbol( "KCT-TEST-STATE-NOTES" ), makeSymbol( "KCT-TEST-STATE-ANSWER-CARDINALITY" )
    } );
    $list152 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-KCT-TEST-STATE-TEST-SPEC" ), makeSymbol( "_CSETF-KCT-TEST-STATE-NAME" ), makeSymbol( "_CSETF-KCT-TEST-STATE-COMMENTS" ), makeSymbol(
        "_CSETF-KCT-TEST-STATE-QUERY-STATE" ), makeSymbol( "_CSETF-KCT-TEST-STATE-SAVE-MT" ), makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-STATUS" ), makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-INDEX" ), makeSymbol(
            "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX" ), makeSymbol( "_CSETF-KCT-TEST-STATE-CATEGORIES" ), makeSymbol( "_CSETF-KCT-TEST-STATE-METRICS" ), makeSymbol( "_CSETF-KCT-TEST-STATE-CYCLISTS" ),
      makeSymbol( "_CSETF-KCT-TEST-STATE-NOTES" ), makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-CARDINALITY" )
    } );
    $sym153$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym154$KCT_TEST_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KCT-TEST-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list155 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KCT-TEST-STATE-P" ) );
    $sym156$KCT_TEST_STATE_TEST_SPEC = makeSymbol( "KCT-TEST-STATE-TEST-SPEC" );
    $sym157$_CSETF_KCT_TEST_STATE_TEST_SPEC = makeSymbol( "_CSETF-KCT-TEST-STATE-TEST-SPEC" );
    $sym158$KCT_TEST_STATE_NAME = makeSymbol( "KCT-TEST-STATE-NAME" );
    $sym159$_CSETF_KCT_TEST_STATE_NAME = makeSymbol( "_CSETF-KCT-TEST-STATE-NAME" );
    $sym160$KCT_TEST_STATE_COMMENTS = makeSymbol( "KCT-TEST-STATE-COMMENTS" );
    $sym161$_CSETF_KCT_TEST_STATE_COMMENTS = makeSymbol( "_CSETF-KCT-TEST-STATE-COMMENTS" );
    $sym162$KCT_TEST_STATE_QUERY_STATE = makeSymbol( "KCT-TEST-STATE-QUERY-STATE" );
    $sym163$_CSETF_KCT_TEST_STATE_QUERY_STATE = makeSymbol( "_CSETF-KCT-TEST-STATE-QUERY-STATE" );
    $sym164$KCT_TEST_STATE_SAVE_MT = makeSymbol( "KCT-TEST-STATE-SAVE-MT" );
    $sym165$_CSETF_KCT_TEST_STATE_SAVE_MT = makeSymbol( "_CSETF-KCT-TEST-STATE-SAVE-MT" );
    $sym166$KCT_TEST_STATE_ANSWER_STATUS = makeSymbol( "KCT-TEST-STATE-ANSWER-STATUS" );
    $sym167$_CSETF_KCT_TEST_STATE_ANSWER_STATUS = makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-STATUS" );
    $sym168$KCT_TEST_STATE_ANSWER_OPTIONS_INDEX = makeSymbol( "KCT-TEST-STATE-ANSWER-OPTIONS-INDEX" );
    $sym169$_CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_INDEX = makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-INDEX" );
    $sym170$KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX = makeSymbol( "KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX" );
    $sym171$_CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX = makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX" );
    $sym172$KCT_TEST_STATE_CATEGORIES = makeSymbol( "KCT-TEST-STATE-CATEGORIES" );
    $sym173$_CSETF_KCT_TEST_STATE_CATEGORIES = makeSymbol( "_CSETF-KCT-TEST-STATE-CATEGORIES" );
    $sym174$KCT_TEST_STATE_METRICS = makeSymbol( "KCT-TEST-STATE-METRICS" );
    $sym175$_CSETF_KCT_TEST_STATE_METRICS = makeSymbol( "_CSETF-KCT-TEST-STATE-METRICS" );
    $sym176$KCT_TEST_STATE_CYCLISTS = makeSymbol( "KCT-TEST-STATE-CYCLISTS" );
    $sym177$_CSETF_KCT_TEST_STATE_CYCLISTS = makeSymbol( "_CSETF-KCT-TEST-STATE-CYCLISTS" );
    $sym178$KCT_TEST_STATE_NOTES = makeSymbol( "KCT-TEST-STATE-NOTES" );
    $sym179$_CSETF_KCT_TEST_STATE_NOTES = makeSymbol( "_CSETF-KCT-TEST-STATE-NOTES" );
    $sym180$KCT_TEST_STATE_ANSWER_CARDINALITY = makeSymbol( "KCT-TEST-STATE-ANSWER-CARDINALITY" );
    $sym181$_CSETF_KCT_TEST_STATE_ANSWER_CARDINALITY = makeSymbol( "_CSETF-KCT-TEST-STATE-ANSWER-CARDINALITY" );
    $kw182$TEST_SPEC = makeKeyword( "TEST-SPEC" );
    $kw183$NAME = makeKeyword( "NAME" );
    $kw184$COMMENTS = makeKeyword( "COMMENTS" );
    $kw185$QUERY_STATE = makeKeyword( "QUERY-STATE" );
    $kw186$SAVE_MT = makeKeyword( "SAVE-MT" );
    $kw187$ANSWER_STATUS = makeKeyword( "ANSWER-STATUS" );
    $kw188$ANSWER_OPTIONS_INDEX = makeKeyword( "ANSWER-OPTIONS-INDEX" );
    $kw189$ANSWER_OPTIONS_BINDINGS_INDEX = makeKeyword( "ANSWER-OPTIONS-BINDINGS-INDEX" );
    $kw190$CATEGORIES = makeKeyword( "CATEGORIES" );
    $kw191$METRICS = makeKeyword( "METRICS" );
    $kw192$CYCLISTS = makeKeyword( "CYCLISTS" );
    $kw193$NOTES = makeKeyword( "NOTES" );
    $kw194$ANSWER_CARDINALITY = makeKeyword( "ANSWER-CARDINALITY" );
    $str195$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw196$BEGIN = makeKeyword( "BEGIN" );
    $sym197$MAKE_KCT_TEST_STATE = makeSymbol( "MAKE-KCT-TEST-STATE" );
    $kw198$SLOT = makeKeyword( "SLOT" );
    $kw199$END = makeKeyword( "END" );
    $sym200$VISIT_DEFSTRUCT_OBJECT_KCT_TEST_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KCT-TEST-STATE-METHOD" );
    $sym201$STRINGP = makeSymbol( "STRINGP" );
    $sym202$INTEGERP = makeSymbol( "INTEGERP" );
    $list203 = ConsesLow.list( makeKeyword( "N" ), makeKeyword( "MIN" ), makeKeyword( "MAX" ) );
    $str204$_A_is_not_a_known_answer_cardinal = makeString( "~A is not a known answer cardinality type." );
    $list205 = ConsesLow.list( NIL, NIL, NIL );
    $kw206$N = makeKeyword( "N" );
    $kw207$MIN = makeKeyword( "MIN" );
    $kw208$MAX = makeKeyword( "MAX" );
    $kw209$UNIMPORTANT = makeKeyword( "UNIMPORTANT" );
    $kw210$EXACT = makeKeyword( "EXACT" );
    $kw211$WANTED = makeKeyword( "WANTED" );
    $kw212$INEXACT = makeKeyword( "INEXACT" );
    $str213$The_wanted_binding_set__ = makeString( "The wanted binding set, " );
    $str214$__was_not_a_KB_BINDING_SET_P____d = makeString( ", was not a KB-BINDING-SET-P -- dropping it." );
    $kw215$UNWANTED = makeKeyword( "UNWANTED" );
    $str216$The_unwanted_binding_set__ = makeString( "The unwanted binding set, " );
    $kw217$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $kw218$SKIP = makeKeyword( "SKIP" );
    $sym219$_CB_KCT_TEST_BEING_SAVED_ = makeSymbol( "*CB-KCT-TEST-BEING-SAVED*" );
    $sym220$KCT_ANSWER = makeSymbol( "KCT-ANSWER" );
    $sym221$KCT_ANSWER_P = makeSymbol( "KCT-ANSWER-P" );
    $list222 = ConsesLow.list( makeSymbol( "BINDING-SET" ), makeSymbol( "STATUS" ), makeSymbol( "ID" ) );
    $list223 = ConsesLow.list( makeKeyword( "BINDING-SET" ), makeKeyword( "STATUS" ), makeKeyword( "ID" ) );
    $list224 = ConsesLow.list( makeSymbol( "KCT-ANSWER-BINDING-SET" ), makeSymbol( "KCT-ANSWER-STATUS" ), makeSymbol( "KCT-ANSWER-ID" ) );
    $list225 = ConsesLow.list( makeSymbol( "_CSETF-KCT-ANSWER-BINDING-SET" ), makeSymbol( "_CSETF-KCT-ANSWER-STATUS" ), makeSymbol( "_CSETF-KCT-ANSWER-ID" ) );
    $sym226$KCT_ANSWER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KCT-ANSWER-PRINT-FUNCTION-TRAMPOLINE" );
    $list227 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KCT-ANSWER-P" ) );
    $sym228$KCT_ANSWER_BINDING_SET = makeSymbol( "KCT-ANSWER-BINDING-SET" );
    $sym229$_CSETF_KCT_ANSWER_BINDING_SET = makeSymbol( "_CSETF-KCT-ANSWER-BINDING-SET" );
    $sym230$KCT_ANSWER_STATUS = makeSymbol( "KCT-ANSWER-STATUS" );
    $sym231$_CSETF_KCT_ANSWER_STATUS = makeSymbol( "_CSETF-KCT-ANSWER-STATUS" );
    $sym232$KCT_ANSWER_ID = makeSymbol( "KCT-ANSWER-ID" );
    $sym233$_CSETF_KCT_ANSWER_ID = makeSymbol( "_CSETF-KCT-ANSWER-ID" );
    $kw234$BINDING_SET = makeKeyword( "BINDING-SET" );
    $kw235$STATUS = makeKeyword( "STATUS" );
    $kw236$ID = makeKeyword( "ID" );
    $sym237$MAKE_KCT_ANSWER = makeSymbol( "MAKE-KCT-ANSWER" );
    $sym238$VISIT_DEFSTRUCT_OBJECT_KCT_ANSWER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KCT-ANSWER-METHOD" );
    $sym239$KB_BINDING_SET_P = makeSymbol( "KB-BINDING-SET-P" );
    $sym240$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw241$OVERLIB = makeKeyword( "OVERLIB" );
    $str242$Edit_this_instance_of___KBContent = makeString( "Edit this instance of #$KBContentTest-FullySpecified." );
    $str243$cb_edit_test__A = makeString( "cb-edit-test&~A" );
    $str244$nd___ = makeString( "nd();" );
    $sym245$CB_LINK_KCT_EDIT = makeSymbol( "CB-LINK-KCT-EDIT" );
    $str246$_A_does_not_denote_a_test_specifi = makeString( "~A does not denote a test specification" );
    $sym247$CB_EDIT_TEST = makeSymbol( "CB-EDIT-TEST" );
    $str248$_Save_As_Test_ = makeString( "[Save As Test]" );
    $kw249$SELF = makeKeyword( "SELF" );
    $str250$Create_an_instance_of___KBContent = makeString(
        "Create an instance of #$KBContentTest-FullySpecified having a query specification with the sentence, microtheory and inference settings of the focal inference, and with expected results based on those obtained by the focal inference." );
    $str251$cb_save_as_test__A__A = makeString( "cb-save-as-test&~A&~A" );
    $kw252$KCT_SAVE = makeKeyword( "KCT-SAVE" );
    $sym253$CB_LINK_KCT_SAVE = makeSymbol( "CB-LINK-KCT-SAVE" );
    $list254 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "INFERENCE-ID-STRING" ) );
    $str255$Inference__S_in_problem_store__S_ = makeString( "Inference ~S in problem store ~S is no longer available." );
    $sym256$CB_SAVE_AS_TEST = makeSymbol( "CB-SAVE-AS-TEST" );
    $str257$Edit_Test_Specification = makeString( "Edit Test Specification" );
    $str258$Save_Inference_Settings_and_Resul = makeString( "Save Inference Settings and Results as Test Specification" );
    $str259$cb_handle_confirm_save_as_test = makeString( "cb-handle-confirm-save-as-test" );
    $str260$An_interface_for_creating_and_edi = makeString( "An interface for creating and editing KBContentTest-FullySpecified instances.  Hover over the various headers for context-sensitive help." );
    $str261$Save_As_Test = makeString( "Save As Test" );
    $str262$Goto_section__ = makeString( "Goto section :" );
    $str263$Shortcut_links_to_sections_that_a = makeString( "Shortcut links to sections that appear further down on this page." );
    $str264$mt_section = makeString( "mt-section" );
    $str265$_Mt_ = makeString( "[Mt]" );
    $str266$Change_the_Microtheory_settings_t = makeString( "Change the Microtheory settings to be used for the saved test's query." );
    $str267$sentence_section = makeString( "sentence-section" );
    $str268$_Sentence_ = makeString( "[Sentence]" );
    $str269$Change_the_CycL_sentence_to_be_us = makeString( "Change the CycL sentence to be used for the saved test's query." );
    $str270$parameters_section = makeString( "parameters-section" );
    $str271$_Inference_Parameters_ = makeString( "[Inference Parameters]" );
    $str272$Adjust_the_inference_parameters_a = makeString( "Adjust the inference parameters and resource constraints that will be used when saving the query for this test." );
    $str273$categories_section = makeString( "categories-section" );
    $str274$_Test_Categories_ = makeString( "[Test Categories]" );
    $str275$Specify_instances_of_KBContentTes = makeString( "Specify instances of KBContentTestSpecificationType that this test belongs to." );
    $str276$metrics_section = makeString( "metrics-section" );
    $str277$_Test_Metrics_ = makeString( "[Test Metrics]" );
    $str278$Specify_metrics_that_should_be_co = makeString( "Specify metrics that should be collected for this test." );
    $str279$cyclists_section = makeString( "cyclists-section" );
    $str280$_Responsible_Cyclists_ = makeString( "[Responsible Cyclists]" );
    $str281$Specify_cyclists_that_are_respons = makeString( "Specify cyclists that are responsible for this test." );
    $str282$Notes_ = makeString( "Notes:" );
    $str283$Test_Name__ = makeString( "Test Name: " );
    $str284$The_constant_name_to_save_the_tes = makeString( "The constant name to save the test specification as." );
    $str285$name = makeString( "name" );
    $str286$Next__Specify_Expected_Results_ = makeString( "Next (Specify Expected Results)" );
    $str287$Store_the_specified_sentence__mt_ = makeString(
        "Store the specified sentence, mt, inference settings and so on in a temporary area, and then take you to a page where you can specify the bindings the test query should return." );
    $str288$new = makeString( "new" );
    $str289$Reset_Values = makeString( "Reset Values" );
    $str290$cb_kct_save_mt = makeString( "cb-kct-save-mt" );
    $str291$Show = makeString( "Show" );
    $str292$Hide = makeString( "Hide" );
    $kw293$INVISIBLE = makeKeyword( "INVISIBLE" );
    $str294$Save_In_Mt__ = makeString( "Save In Mt: " );
    $str295$The_microtheory_in_which_to_save_ = makeString( "The microtheory in which to save the assertions about the test specification.  Should be a spec-mt of #$TestVocabularyMt." );
    $kw296$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $list297 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "defining-mt" ) );
    $str298$test_categories = makeString( "test-categories" );
    $str299$Test_Categories__optional_ = makeString( "Test Categories (optional)" );
    $str300$Instances_of_KBContentTestSpecifi = makeString( "Instances of KBContentTestSpecificationType which the test should be an instance of." );
    $kw301$VISIBLE = makeKeyword( "VISIBLE" );
    $const302$KBContentRegressionTest = constant_handles.reader_make_constant_shell( makeString( "KBContentRegressionTest" ) );
    $str303$category = makeString( "category" );
    $int304$100 = makeInteger( 100 );
    $str305$category_name = makeString( "category-name" );
    $str306$Add_a_Test_Category__ = makeString( "Add a Test Category: " );
    $str307$category_id = makeString( "category-id" );
    $sym308$STRING_ = makeSymbol( "STRING<" );
    $sym309$FORT_NAME = makeSymbol( "FORT-NAME" );
    $str310$test_metrics = makeString( "test-metrics" );
    $str311$Test_Metrics_to_Gather = makeString( "Test Metrics to Gather" );
    $str312$The_metrics_that_should_be_gather = makeString( "The metrics that should be gathered and reported when the test is run." );
    $str313$None_selected_ = makeString( "None selected." );
    $str314$metric = makeString( "metric" );
    $str315$cyclists = makeString( "cyclists" );
    $str316$Responsible_Cyclists__required_ = makeString( "Responsible Cyclists (required)" );
    $str317$The_cyclists_who_are_responsible_ = makeString( "The cyclists who are responsible for this test." );
    $kw318$CENTER = makeKeyword( "CENTER" );
    $str319$Selected_ = makeString( "Selected?" );
    $str320$Cyclist = makeString( "Cyclist" );
    $str321$cyclist = makeString( "cyclist" );
    $str322$cyclist_name = makeString( "cyclist-name" );
    $const323$HumanCyclist = constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) );
    $str324$Add_a_Cyclist__ = makeString( "Add a Cyclist: " );
    $str325$_A = makeString( "~A" );
    $list326 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "sentence" ) );
    $list327 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "non_exp_sentence" ), makeKeyword( "REQUIRED?" ), NIL );
    $list328 = ConsesLow.list( makeKeyword( "LOCATION" ), makeString( "Pragmatics" ) );
    $sym329$CB_HANDLE_CONFIRM_SAVE_AS_TEST = makeSymbol( "CB-HANDLE-CONFIRM-SAVE-AS-TEST" );
    $str330$The_ID___A__did_not_yield_a_KBCon = makeString( "The ID, ~A, did not yield a KBContentTestSpecificationType." );
    $str331$The_name___S__did_not_denote_a_KB = makeString( "The name, ~S, did not denote a KBContentTestSpecificationType." );
    $str332$The_object___S__extracted_from_th = makeString( "The object, ~S, extracted from the test category selector, is not a KBContentTestSpecificationType." );
    $str333$The_ID___A__did_not_yield_a_Test_ = makeString( "The ID, ~A, did not yield a Test Metric constant." );
    $str334$The_ID___A__did_not_yield_a_Human = makeString( "The ID, ~A, did not yield a HumanCyclist." );
    $str335$The_name___A__did_not_denote_a_Hu = makeString( "The name, ~A, did not denote a HumanCyclist." );
    $sym336$_CB_KCT_ROWCOLOR_ = makeSymbol( "*CB-KCT-ROWCOLOR*" );
    $str337$_ccccff = makeString( "#ccccff" );
    $str338$Specify_Test_Expectations = makeString( "Specify Test Expectations" );
    $str339$reloadCurrentFrame__reloadFrameBu = makeString( "reloadCurrentFrame('reloadFrameButton');" );
    $str340$cb_handle_specify_test_results = makeString( "cb-handle-specify-test-results" );
    $str341$The_interface_for_stating_test_ex = makeString( "The interface for stating test expectations for a KB Content Test" );
    $kw342$RIGHT = makeKeyword( "RIGHT" );
    $str343$Exactly_ = makeString( "Exactly " );
    $str344$cardinality = makeString( "cardinality" );
    $str345$_answers_should_be_found_ = makeString( " answers should be found." );
    $str346$At_least_ = makeString( "At least " );
    $str347$min_cardinality = makeString( "min-cardinality" );
    $str348$At_most_ = makeString( "At most " );
    $str349$max_cardinality = makeString( "max-cardinality" );
    $str350$bindings = makeString( "bindings" );
    $str351$unimportant = makeString( "unimportant" );
    $str352$The_bindings_obtained_are_unimpor = makeString( "The bindings obtained are unimportant." );
    $str353$proven = makeString( "proven" );
    $str354$The_query__with_no_free_variables = makeString( "The query (with no free variables) should be proven." );
    $str355$none = makeString( "none" );
    $str356$No_bindings_should_be_found_ = makeString( "No bindings should be found." );
    $str357$The_query__with_no_free_variables = makeString( "The query (with no free variables) should not be proven." );
    $str358$exact = makeString( "exact" );
    $str359$Require_all_and_only_the_wanted_b = makeString( "Require all and only the wanted bindings below (exact match)." );
    $str360$inexact = makeString( "inexact" );
    $str361$Specify_wanted_and_or_unwanted_bi = makeString( "Specify wanted and/or unwanted bindings below (inexact match)." );
    $str362$Check_wanted_and_unwanted_binding = makeString( "Check wanted and unwanted bindings:" );
    $kw363$LEFT = makeKeyword( "LEFT" );
    $str364$Wanted = makeString( "Wanted" );
    $str365$Not_Wanted = makeString( "Not Wanted" );
    $str366$Unspecified = makeString( "Unspecified" );
    $str367$Save_New_Test = makeString( "Save New Test" );
    $str368$Creates_a_new___KBContentTest_Ful = makeString(
        "Creates a new #$KBContentTest-FullySpecified instance and associated #$CycLQuerySpecification, having the specified sentence, mt, inference settings and expected results." );
    $str369$save_new = makeString( "save-new" );
    $str370$Overwrite_Existing_Test = makeString( "Overwrite Existing Test" );
    $str371$Overwrites_the_existing_test_spec = makeString( "Overwrites the existing test specification with the sentence, mt, inference settings and expected results specified here." );
    $str372$overwrite = makeString( "overwrite" );
    $str373$Test_Definition_So_Far = makeString( "Test Definition So Far" );
    $str374$The_currently_specified_propertie = makeString(
        "The currently specified properties of the test being saved.  These values will be stored in the KB when you finish specifying results and choose either \"Save New Test\" or \"Overwrite Existing Test\"." );
    $str375$Specify_a_binding_set_ = makeString( "Specify a binding set:" );
    $str376$Enter_values_for_each_free_variab = makeString( "Enter values for each free variable, choose Wanted or Unwanted, and click Add to add the binding set to the expected results." );
    $str377$Wanted_ = makeString( "Wanted:" );
    $str378$wanted = makeString( "wanted" );
    $str379$Unwanted_ = makeString( "Unwanted:" );
    $str380$unwanted = makeString( "unwanted" );
    $str381$Add_this_binding_set = makeString( "Add this binding set" );
    $str382$Updates_the_state_of_the_test_bei = makeString( "Updates the state of the test being defined or edited, and displays this page again so another binding set may be added to the expected results." );
    $str383$add = makeString( "add" );
    $str384$new__A = makeString( "new-~A" );
    $str385$top = makeString( "top" );
    $kw386$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $kw387$COMPLETE_TYPE = makeKeyword( "COMPLETE-TYPE" );
    $str388$wanted__A = makeString( "wanted-~A" );
    $str389$yes = makeString( "yes" );
    $str390$no = makeString( "no" );
    $str391$unspecified = makeString( "unspecified" );
    $kw392$ADD = makeKeyword( "ADD" );
    $kw393$SAVE_NEW = makeKeyword( "SAVE-NEW" );
    $kw394$OVERWRITE = makeKeyword( "OVERWRITE" );
    $str395$Unknown_test_save_method__A = makeString( "Unknown test save method ~A" );
    $sym396$CB_HANDLE_SPECIFY_TEST_RESULTS = makeSymbol( "CB-HANDLE-SPECIFY-TEST-RESULTS" );
    $kw397$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw398$EOF = makeKeyword( "EOF" );
    $str399$_is_not_an_integer_ = makeString( " is not an integer." );
    $kw400$REQUIRED_ = makeKeyword( "REQUIRED?" );
    $list401 = ConsesLow.list( makeKeyword( "AUTO-CYCLIFY" ), T );
    $str402$The_value___A__is_not_a_known_exa = makeString( "The value, ~A, is not a known exactness." );
    $str403$test_spec = makeString( "test-spec" );
    $str404$_A_does_not_denote_a_test_specifi = makeString( "~A does not denote a test specification." );
    $str405$You_need_to_make_a_choice_for_Exp = makeString( "You need to make a choice for Expected Test Results." );
    $str406$Problem_extracting_exact_answers_ = makeString( "Problem extracting exact answers." );
    $str407$The_ID__A_does_not_denote_a_kct_a = makeString( "The ID ~A does not denote a kct answer." );
    $str408$Save_Test_Specification = makeString( "Save Test Specification" );
    $str409$_A_is_not_a_valid_constant_name_ = makeString( "~A is not a valid constant name." );
    $str410$Already_a_constant_named__A = makeString( "Already a constant named ~A" );
    $str411$Constant__S_already_exists_which_ = makeString( "Constant ~S already exists which differs from ~S only by case" );
    $const412$TestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TestQueryFn" ) );
    $str413$Save_New_Test_Specification_finis = makeString( "Save New Test Specification finished with these problems: ~A" );
    $str414$Save_New_Test_Specification_finis = makeString( "Save New Test Specification finished successfully." );
    $str415$Overwrite_Test_Specification = makeString( "Overwrite Test Specification" );
    $str416$_A_is_not_the_name_of_a_KBContent = makeString( "~A is not the name of a KBContentTest-FullySpecified." );
    $str417$Edit_Test_Specification_finished_ = makeString( "Edit Test Specification finished with these problems: ~A" );
    $str418$Edit_Test_Specification_finished_ = makeString( "Edit Test Specification finished successfully." );
    $sym419$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym420$LISTP = makeSymbol( "LISTP" );
    $sym421$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $const422$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list423 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MultipleChoiceKBContentTest" ) ) );
    $list424 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KBContentTest-FullySpecified" ) ) );
    $const425$testQuerySpecification = constant_handles.reader_make_constant_shell( makeString( "testQuerySpecification" ) );
    $str426$Remember_to_state_expected_result = makeString( "Remember to state expected results using the Cyc Browser." );
    $list427 = ConsesLow.list( makeSymbol( "OPTION-NUM" ), makeSymbol( "FULL-LABEL" ), makeSymbol( "INDEX-LABEL" ), makeSymbol( "KB-BINDINGS" ) );
    $str428$Some_item_in__A_was_not_a_KB_BIND = makeString( "Some item in ~A was not a KB-BINDING-SET-P" );
    $const429$testAnswers_Cardinality_Exact = constant_handles.reader_make_constant_shell( makeString( "testAnswers-Cardinality-Exact" ) );
    $const430$testAnswers_Cardinality_Min = constant_handles.reader_make_constant_shell( makeString( "testAnswers-Cardinality-Min" ) );
    $const431$testAnswers_Cardinality_Max = constant_handles.reader_make_constant_shell( makeString( "testAnswers-Cardinality-Max" ) );
    $const432$testAnswersCycL_Exact = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-Exact" ) );
    $const433$testAnswersCycL_Wanted = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-Wanted" ) );
    $const434$testAnswersCycL_NotWanted = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-NotWanted" ) );
    $const435$testAnswersCycLUnimportant = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycLUnimportant" ) );
    $sym436$FOURTH = makeSymbol( "FOURTH" );
    $const437$MCQuestionNthOptionFn = constant_handles.reader_make_constant_shell( makeString( "MCQuestionNthOptionFn" ) );
    $const438$testAnswer_MultipleChoice = constant_handles.reader_make_constant_shell( makeString( "testAnswer-MultipleChoice" ) );
    $const439$testMetricsToGather = constant_handles.reader_make_constant_shell( makeString( "testMetricsToGather" ) );
    $const440$testResponsibleCyclist = constant_handles.reader_make_constant_shell( makeString( "testResponsibleCyclist" ) );
    $sym441$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const442$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw443$GAF = makeKeyword( "GAF" );
    $kw444$TRUE = makeKeyword( "TRUE" );
    $const445$StartFn = constant_handles.reader_make_constant_shell( makeString( "StartFn" ) );
    $const446$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $list447 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IndexicalReferentFn-EvaluateAtEL" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) );
    $const448$IntervalEndedByFn_Inclusive = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn-Inclusive" ) );
    $kw449$IGNORE = makeKeyword( "IGNORE" );
    $const450$temporallyQualifiablePredicateInI = constant_handles.reader_make_constant_shell( makeString( "temporallyQualifiablePredicateInInterface" ) );
    $list451 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycTestAndQuerySavingAndEditingTool" ) ) );
    $const452$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
    $const453$TimePoint = constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) );
    $list454 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "IndexicalReferentFn-EvaluateAtEL" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) );
    $kw455$KCT_CONTROL_PANEL = makeKeyword( "KCT-CONTROL-PANEL" );
    $str456$KB_Content_Test_Control_Panel = makeString( "KB Content Test Control Panel" );
    $str457$KCT = makeString( "KCT" );
    $str458$View_and_edit_your_KB_Content_Tes = makeString( "View and edit your KB Content Tests" );
    $str459$_KCT_ = makeString( "[KCT]" );
    $str460$cb_kct_control_panel = makeString( "cb-kct-control-panel" );
    $sym461$CB_LINK_KCT_CONTROL_PANEL = makeSymbol( "CB-LINK-KCT-CONTROL-PANEL" );
    $str462$cb_kct_control_panel_handler = makeString( "cb-kct-control-panel-handler" );
    $str463$KB_Content_Tests_owned_by_ = makeString( "KB Content Tests owned by " );
    $str464$_ = makeString( ":" );
    $str465$No_tests_ = makeString( "No tests." );
    $sym466$CB_KCT_CONTROL_PANEL = makeSymbol( "CB-KCT-CONTROL-PANEL" );
    $str467$_Refresh_ = makeString( "[Refresh]" );
    $str468$Submit = makeString( "Submit" );
    $str469$save = makeString( "save" );
    $str470$_Edit_ = makeString( "[Edit]" );
    $str471$_Run_ = makeString( "[Run]" );
    $str472$Edit = makeString( "Edit" );
    $str473$Run = makeString( "Run" );
    $str474$Name = makeString( "Name" );
    $str475$Regression_Test_ = makeString( "Regression Test?" );
    $str476$Save_Interface = makeString( "Save Interface" );
    $str477$Tests__Regression_Status_Modified = makeString( "Tests' Regression Status Modified" );
    $sym478$CB_KCT_CONTROL_PANEL_HANDLER = makeSymbol( "CB-KCT-CONTROL-PANEL-HANDLER" );
    $list479 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KBContentRegressionTest" ) ) );
  }

  public static final class $kct_test_state_native
      extends
        SubLStructNative
  {
    public SubLObject $test_spec;
    public SubLObject $name;
    public SubLObject $comments;
    public SubLObject $query_state;
    public SubLObject $save_mt;
    public SubLObject $answer_status;
    public SubLObject $answer_options_index;
    public SubLObject $answer_options_bindings_index;
    public SubLObject $categories;
    public SubLObject $metrics;
    public SubLObject $cyclists;
    public SubLObject $notes;
    public SubLObject $answer_cardinality;
    private static final SubLStructDeclNative structDecl;

    public $kct_test_state_native()
    {
      this.$test_spec = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
      this.$comments = CommonSymbols.NIL;
      this.$query_state = CommonSymbols.NIL;
      this.$save_mt = CommonSymbols.NIL;
      this.$answer_status = CommonSymbols.NIL;
      this.$answer_options_index = CommonSymbols.NIL;
      this.$answer_options_bindings_index = CommonSymbols.NIL;
      this.$categories = CommonSymbols.NIL;
      this.$metrics = CommonSymbols.NIL;
      this.$cyclists = CommonSymbols.NIL;
      this.$notes = CommonSymbols.NIL;
      this.$answer_cardinality = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $kct_test_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$test_spec;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$comments;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$query_state;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$save_mt;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$answer_status;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$answer_options_index;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$answer_options_bindings_index;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$categories;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$metrics;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$cyclists;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$notes;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$answer_cardinality;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$test_spec = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$comments = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$query_state = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$save_mt = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$answer_status = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$answer_options_index = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$answer_options_bindings_index = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$categories = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$metrics = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$cyclists = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$notes = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$answer_cardinality = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $kct_test_state_native.class, $sym147$KCT_TEST_STATE, $sym148$KCT_TEST_STATE_P, $list149, $list150, new String[] { "$test_spec", "$name", "$comments", "$query_state",
        "$save_mt", "$answer_status", "$answer_options_index", "$answer_options_bindings_index", "$categories", "$metrics", "$cyclists", "$notes", "$answer_cardinality"
      }, $list151, $list152, $sym153$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $kct_test_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $kct_test_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KCT-TEST-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return kct_test_state_p( arg1 );
    }
  }

  public static final class $kct_answer_native
      extends
        SubLStructNative
  {
    public SubLObject $binding_set;
    public SubLObject $status;
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $kct_answer_native()
    {
      this.$binding_set = CommonSymbols.NIL;
      this.$status = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $kct_answer_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$binding_set;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$status;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$binding_set = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$status = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $kct_answer_native.class, $sym220$KCT_ANSWER, $sym221$KCT_ANSWER_P, $list222, $list223, new String[] { "$binding_set", "$status", "$id"
      }, $list224, $list225, $sym153$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $kct_answer_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $kct_answer_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KCT-ANSWER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return kct_answer_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3933 ms synthetic
 */