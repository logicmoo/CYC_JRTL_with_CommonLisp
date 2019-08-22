package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_confirm_kills$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_editing_enabled$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_ke_text_mode$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$show_kb_monitor_links$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_definitional_preds_for_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_index;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_index_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_display_string;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_font_size;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_inferred_index extends SubLTranslatedFile {
    public static final SubLFile me = new cb_inferred_index();

    public static final String myName = "com.cyc.cycjava.cycl.cb_inferred_index";

    public static final String myFingerPrint = "7133c6a831460df2b0a87f7409aa3e4394efaa5fb1979c158caf258cd12f3eea";







    // deflexical
    private static final SubLSymbol $predicate_support_module_map$ = makeSymbol("*PREDICATE-SUPPORT-MODULE-MAP*");



    public static final SubLSymbol $cb_inferred_index_order_by$ = makeSymbol("*CB-INFERRED-INDEX-ORDER-BY*");

    public static final SubLSymbol $cb_inferred_index_filters$ = makeSymbol("*CB-INFERRED-INDEX-FILTERS*");



    public static final SubLSymbol $cb_inferred_index_visibility$ = makeSymbol("*CB-INFERRED-INDEX-VISIBILITY*");

    public static final SubLList $list5 = list(makeSymbol("INDEX-ID"));

    public static final SubLString $str6$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    public static final SubLSymbol CB_INFERRED_INDEX_FRAME = makeSymbol("CB-INFERRED-INDEX-FRAME");





    private static final SubLString $str10$_Inferred_ = makeString("[Inferred]");

    private static final SubLString $str11$cb_inferred_index_frame__A = makeString("cb-inferred-index-frame&~A");



    private static final SubLSymbol CB_LINK_INFERRED_INDEX = makeSymbol("CB-LINK-INFERRED-INDEX");

    private static final SubLSymbol CB_LEGACY_INDEX_FRAME = makeSymbol("CB-LEGACY-INDEX-FRAME");

    private static final SubLString $str15$_Legacy_ = makeString("[Legacy]");

    private static final SubLString $str16$cb_legacy_index_frame__A = makeString("cb-legacy-index-frame&~A");



    private static final SubLSymbol CB_LINK_LEGACY_INDEX = makeSymbol("CB-LINK-LEGACY-INDEX");

    private static final SubLString $str19$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str20$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str23$Browsing___ = makeString("Browsing : ");



    private static final SubLString $$$documentation = makeString("documentation");

    private static final SubLString $str26$___ = makeString(" | ");



    private static final SubLString $$$definitional = makeString("definitional");



    private static final SubLString $$$lexical = makeString("lexical");

    private static final SubLString $str31$Editing___ = makeString("Editing : ");

    private static final SubLSymbol $EDIT_IN_SMT = makeKeyword("EDIT-IN-SMT");

    private static final SubLString $$$edit_in_SMT = makeString("edit in SMT");



    private static final SubLString $$$copy = makeString("copy");



    private static final SubLString $$$rename = makeString("rename");



    private static final SubLString $$$lexify = makeString("lexify");



    private static final SubLString $$$merge = makeString("merge");





    private static final SubLString $$$kill = makeString("kill");



    public static final SubLString $$$create_instance = makeString("create instance");



    public static final SubLString $$$create_spec = makeString("create spec");

    private static final SubLString $str49$Advanced___ = makeString("Advanced : ");



    private static final SubLString $$$history = makeString("history");







    private static final SubLString $$$take_test = makeString("take test");



    private static final SubLString $$$run_test = makeString("run test");



    private static final SubLString $$$ask_query = makeString("ask query");

    private static final SubLSymbol $KBQ_ASK_IN_PROOF_CHECKER = makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");

    private static final SubLString $str61$proof_check_query = makeString("proof-check query");



    private static final SubLString $$$edit_test = makeString("edit test");



    private static final SubLString $$$edit_query = makeString("edit query");

    private static final SubLSymbol $KB_MONITOR_INDEX_HOOK = makeKeyword("KB-MONITOR-INDEX-HOOK");

    private static final SubLString $$$monitor = makeString("monitor");

    private static final SubLSymbol $KCT_TEST_SET = makeKeyword("KCT-TEST-SET");

    private static final SubLString $$$run_test_set = makeString("run test set");

    private static final SubLString $$$more_filters = makeString("more filters");



    private static final SubLSymbol CB_C_PERTINENT_QUERY_LINKS = makeSymbol("CB-C-PERTINENT-QUERY-LINKS");



    private static final SubLString $$$term = makeString("term");



    private static final SubLString $str76$Checking_for_Pertinent_Queries___ = makeString("Checking for Pertinent Queries...");



    private static final SubLString $$$div = makeString("div");



    private static final SubLInteger $int$50 = makeInteger(50);



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    private static final SubLString $$$as_seen_from = makeString("as seen from");

    private static final SubLString $str86$100_ = makeString("100%");







    private static final SubLString $str90$40_ = makeString("40%");

    private static final SubLString $str91$order_by__ = makeString("order by :");



    private static final SubLString $$$predicate = makeString("predicate");

    private static final SubLSymbol $INFERRED_INDEX_ORDER_BY = makeKeyword("INFERRED-INDEX-ORDER-BY");

    private static final SubLString $$$ontology = makeString("ontology");

    private static final SubLString $str96$filters__ = makeString("filters :");

    private static final SubLSymbol $INFERRED_INDEX_PREDICATE_FILTERS = makeKeyword("INFERRED-INDEX-PREDICATE-FILTERS");

    private static final SubLSymbol $INFERRED_INDEX_ONTOLOGY_FILTERS = makeKeyword("INFERRED-INDEX-ONTOLOGY-FILTERS");

    private static final SubLSymbol $INFERRED_INDEX_MICROTHEORY_FILTERS = makeKeyword("INFERRED-INDEX-MICROTHEORY-FILTERS");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $str101$index_view__ = makeString("index view :");

    private static final SubLString $$$inferred = makeString("inferred");

    private static final SubLString $$$legacy = makeString("legacy");

    private static final SubLString $str104$Unexpected_order_by____S = makeString("Unexpected order-by : ~S");

    private static final SubLString $str105$ = makeString("");

    private static final SubLString $$$via_ = makeString("via ");

    private static final SubLSymbol $INFERRED_GAF_ARG_ASSERTIONS = makeKeyword("INFERRED-GAF-ARG-ASSERTIONS");







    private static final SubLList $list111 = list(makeSymbol("INFER-PRED"), makeSymbol("QUA"), makeSymbol("ARGNUM"), makeSymbol("PRED"));

    private static final SubLString $str112$_arg_S = makeString(" arg~S");





    private static final SubLString $$$All_Assertions = makeString("All Assertions");



    private static final SubLSymbol $INFERRED_INDEX_TOGGLE_VISIBILITY = makeKeyword("INFERRED-INDEX-TOGGLE-VISIBILITY");

    private static final SubLString $str118$__A_ = makeString("(~A)");

    private static final SubLString $str119$color__red__background_color_yell = makeString("color: red; background-color:yellow; font-family:monospace");

    private static final SubLString $str120$_ = makeString("!");

    private static final SubLString $str121$igai_ = makeString("igai_");



    private static final SubLString $str123$cb_lq__A__A__A__A = makeString("cb-lq&~A&~A&~A&~A");

    private static final SubLString $str124$cb_lq__A__A__A = makeString("cb-lq&~A&~A&~A");



    private static final SubLSymbol CB_LINK_LITERAL_QUERY = makeSymbol("CB-LINK-LITERAL-QUERY");

    private static final SubLString $str127$cb_hier__A__A__A__A = makeString("cb-hier&~A&~A&~A&~A");

    private static final SubLString $str128$cb_hier__A__A__A = makeString("cb-hier&~A&~A&~A");



    private static final SubLSymbol CB_LINK_HIER_BROW = makeSymbol("CB-LINK-HIER-BROW");

    private static final SubLList $list131 = list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genlMt")));

    private static final SubLList $list132 = list(makeSymbol("INDEX-ID"), makeSymbol("ORDER-BY-STRING"));

    private static final SubLSymbol CB_INFERRED_INDEX_ORDER_BY = makeSymbol("CB-INFERRED-INDEX-ORDER-BY");

    private static final SubLString $str134$cb_inferred_index_order_by__A__A = makeString("cb-inferred-index-order-by&~A&~A");

    private static final SubLSymbol CB_LINK_INFERRED_INDEX_ORDER_BY = makeSymbol("CB-LINK-INFERRED-INDEX-ORDER-BY");

    private static final SubLList $list136 = list(makeSymbol("INDEX-ID"), makeSymbol("VISIBILITY-STRING"));

    private static final SubLSymbol CB_INFERRED_INDEX_VISIBILITY = makeSymbol("CB-INFERRED-INDEX-VISIBILITY");

    private static final SubLString $$$close_all = makeString("close all");

    private static final SubLString $$$open_all = makeString("open all");

    private static final SubLSymbol $DOWN_TRIANGLE_V = makeKeyword("DOWN-TRIANGLE-V");

    private static final SubLSymbol $RIGHT_TRIANGLE_V = makeKeyword("RIGHT-TRIANGLE-V");

    private static final SubLString $str142$cb_inferred_index_visibility__A__ = makeString("cb-inferred-index-visibility&~A&~S");



    private static final SubLSymbol CB_LINK_INFERRED_INDEX_TOGGLE_VISIBILITY = makeSymbol("CB-LINK-INFERRED-INDEX-TOGGLE-VISIBILITY");

    private static final SubLList $list145 = list(makeSymbol("ID-STRING"));

    private static final SubLString $str146$_S_did_not_specify_a_term = makeString("~S did not specify a term");

    private static final SubLSymbol CB_INFERRED_INDEX_PREDICATE_FILTERS = makeSymbol("CB-INFERRED-INDEX-PREDICATE-FILTERS");

    private static final SubLString $str148$_Predicate_Filters_ = makeString("[Predicate Filters]");

    private static final SubLString $str149$cb_inferred_index_predicate_filte = makeString("cb-inferred-index-predicate-filters&~A");

    private static final SubLSymbol CB_LINK_INFERRED_INDEX_PREDICATE_FILTERS = makeSymbol("CB-LINK-INFERRED-INDEX-PREDICATE-FILTERS");

    private static final SubLString $$$Inferred_Index_Predicate_Filters = makeString("Inferred Index Predicate Filters");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str153$cb_handle_inferred_index_predicat = makeString("cb-handle-inferred-index-predicate-filters");

    private static final SubLString $$$relevant_to_ = makeString("relevant to ");

    private static final SubLString $$$Update_Filters = makeString("Update Filters");

    private static final SubLString $$$update = makeString("update");

    private static final SubLString $$$Reset_Values = makeString("Reset Values");

    private static final SubLString $$$Remove_All_Filters = makeString("Remove All Filters");

    private static final SubLString $$$clear = makeString("clear");



    private static final SubLSymbol $ALLOW_PREDICATE_TYPES = makeKeyword("ALLOW-PREDICATE-TYPES");



    private static final SubLSymbol $FORBID_PREDICATE_TYPES = makeKeyword("FORBID-PREDICATE-TYPES");

    private static final SubLString $$$Allowed_Types = makeString("Allowed Types");

    private static final SubLString $$$check_to_remove = makeString("check to remove");

    private static final SubLString $$$add_ = makeString("add ");

    private static final SubLString $str167$type_allow = makeString("type_allow");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLString $$$Forbidden_Types = makeString("Forbidden Types");

    private static final SubLString $str172$type_forbid = makeString("type_forbid");

    private static final SubLString $$$Allowed_Predicates = makeString("Allowed Predicates");



    private static final SubLString $str175$None_ = makeString("None!");

    private static final SubLString $$$check_to_forbid = makeString("check to forbid");

    private static final SubLString $$$Forbidden_Predicates = makeString("Forbidden Predicates");

    private static final SubLString $$$check_to_allow = makeString("check to allow");

    private static final SubLString $str179$remove_type_allow_ = makeString("remove_type_allow_");

    private static final SubLString $$$T = makeString("T");

    private static final SubLString $str181$remove_type_forbid_ = makeString("remove_type_forbid_");

    private static final SubLString $str182$forbid_ = makeString("forbid_");

    private static final SubLString $str183$allow_ = makeString("allow_");

    private static final SubLSymbol CB_HANDLE_INFERRED_INDEX_PREDICATE_FILTERS = makeSymbol("CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS");

    public static final SubLList $list185 = list(makeSymbol("NAME"), makeSymbol("VALUE"));

    private static final SubLSymbol CB_INFERRED_INDEX_ONTOLOGY_FILTERS = makeSymbol("CB-INFERRED-INDEX-ONTOLOGY-FILTERS");

    private static final SubLString $str187$_Ontology_Filters_ = makeString("[Ontology Filters]");

    private static final SubLString $str188$cb_inferred_index_ontology_filter = makeString("cb-inferred-index-ontology-filters&~A");

    private static final SubLSymbol CB_LINK_INFERRED_INDEX_ONTOLOGY_FILTERS = makeSymbol("CB-LINK-INFERRED-INDEX-ONTOLOGY-FILTERS");

    private static final SubLString $$$Inferred_Index_Ontology_Filters = makeString("Inferred Index Ontology Filters");

    private static final SubLString $str191$cb_handle_inferred_index_ontology = makeString("cb-handle-inferred-index-ontology-filters");



    private static final SubLString $$$Generality_Horizon = makeString("Generality Horizon");

    private static final SubLString $$$select_a_qualitative_boundary = makeString("select a qualitative boundary");

    public static final SubLList $list195 = list(makeKeyword("SELF"), makeKeyword("LOWER"), makeKeyword("MIDDLE"), makeKeyword("ALL"));

    private static final SubLString $$$or_a_generalization = makeString("or a generalization");



    private static final SubLString $str198$ontology_horizon = makeString("ontology-horizon");

    private static final SubLSymbol CB_HANDLE_INFERRED_INDEX_ONTOLOGY_FILTERS = makeSymbol("CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS");

    private static final SubLString $$$Just_on_the_term = makeString("Just on the term");



    private static final SubLString $$$Also_from_the_lower_ontology = makeString("Also from the lower ontology");



    private static final SubLString $str204$Also_up_through_the_middle_ontolo = makeString("Also up through the middle ontology");

    private static final SubLString $$$Everything = makeString("Everything");

    private static final SubLString $str206$Time_to_implement_cb_inferred_ind = makeString("Time to implement cb-inferred-index-microtheory-filters-guts");

    private static final SubLSymbol CB_INFERRED_INDEX_MICROTHEORY_FILTERS = makeSymbol("CB-INFERRED-INDEX-MICROTHEORY-FILTERS");

    private static final SubLString $str208$_Microtheory_Filters_ = makeString("[Microtheory Filters]");

    private static final SubLSymbol CB_LINK_INFERRED_INDEX_MICROTHEORY_FILTERS = makeSymbol("CB-LINK-INFERRED-INDEX-MICROTHEORY-FILTERS");



    private static final SubLString $str211$cb_inferred_gaf_arg_assertions__A = makeString("cb-inferred-gaf-arg-assertions&~A&~A&~A&~A");

    private static final SubLString $str212$cb_inferred_gaf_arg_assertions__A = makeString("cb-inferred-gaf-arg-assertions&~A&~A");

    private static final SubLString $str213$cb_inferred_gaf_arg_assertions__A = makeString("cb-inferred-gaf-arg-assertions&~A");

    private static final SubLSymbol CB_LINK_INFERRED_GAF_ARG_ASSERTIONS = makeSymbol("CB-LINK-INFERRED-GAF-ARG-ASSERTIONS");

    private static final SubLList $list215 = list(makeSymbol("TERM-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("QUA-SPEC"), makeSymbol("ARGNUM-SPEC"), makeSymbol("PRED-SPEC"));

    private static final SubLString $str216$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLString $str218$Could_not_determine_an_argnum_fro = makeString("Could not determine an argnum from ~a");

    private static final SubLSymbol CB_INFERRED_GAF_ARG_ASSERTIONS = makeSymbol("CB-INFERRED-GAF-ARG-ASSERTIONS");

    private static final SubLString $str220$Inferred_GAF_arg_index_for__S = makeString("Inferred GAF arg index for ~S");

    private static final SubLString $str221$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str226$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");



    private static final SubLString $$$_query = makeString(" query");

    private static final SubLList $list229 = list(cons(reader_make_constant_shell(makeString("isa")), makeKeyword("ISA")), cons(reader_make_constant_shell(makeString("genls")), makeKeyword("GENLS")), cons(reader_make_constant_shell(makeString("equals")), makeKeyword("EQUALITY")));



    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLString $$$on_ = makeString("on ");

    private static final SubLString $$$the_term = makeString("the term");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));





    private static final SubLString $str237$___ = makeString("[?]");

    private static final SubLList $list238 = list(reader_make_constant_shell(makeString("Thing")));



    private static final SubLString $str240$red_x_close_15_gif = makeString("red-x-close-15.gif");

    private static final SubLSymbol $CLOSE_RED_DIM = makeKeyword("CLOSE-RED-DIM");

    private static final SubLString $str242$dim_red_x_close_15_gif = makeString("dim-red-x-close-15.gif");

    private static final SubLString $str243$gaf_entry = makeString("gaf_entry");

    private static final SubLString $str244$___ = makeString("[+]");

    private static final SubLString $str245$___ = makeString("[-]");

    private static final SubLString $$$Open_the_CURE_on_ = makeString("Open the CURE on ");

    private static final SubLString $str247$_to_add_more_facts_ = makeString(" to add more facts.");

    private static final SubLString $str248$___ = makeString(" : ");

    private static final SubLString $str249$__ = makeString(" .");

    private static final SubLList $list250 = list(makeSymbol("&KEY"), list(makeSymbol("NAME"), makeString("gaf_entry")), makeSymbol("PRED"), makeSymbol("ARGNUM"));

    private static final SubLList $list251 = list(makeKeyword("NAME"), makeKeyword("PRED"), makeKeyword("ARGNUM"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLInteger $int$200 = makeInteger(200);



    private static final SubLString $str258$unary_frame = makeString("unary_frame");

    private static final SubLString $str259$cb_handle_gaf_entry = makeString("cb-handle-gaf-entry");

    private static final SubLString $str260$implicit_arg1 = makeString("implicit_arg1");

    private static final SubLString $str261$unary_frame_pred = makeString("unary_frame_pred");

    private static final SubLString $$$unary_predicate = makeString("unary predicate");

    private static final SubLObject $$UnaryPredicate = reader_make_constant_shell(makeString("UnaryPredicate"));

    private static final SubLString $str264$binary_frame = makeString("binary_frame");

    private static final SubLString $str265$_arg2 = makeString("+arg2");



    private static final SubLString $$$Assert = makeString("Assert");











    private static final SubLString $str273$binary_frame_pred = makeString("binary_frame_pred");

    private static final SubLString $$$binary_predicate = makeString("binary predicate");

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    private static final SubLString $$$binary = makeString("binary");

    private static final SubLString $str277$_arg1 = makeString("+arg1");

    private static final SubLString $str278$binary_frame_arg2 = makeString("binary_frame_arg2");

    private static final SubLString $$$arg2 = makeString("arg2");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLString $$$ternary = makeString("ternary");

    private static final SubLString $str282$_arg3 = makeString("+arg3");

    private static final SubLString $str283$binary_pred = makeString("binary_pred");

    private static final SubLString $str284$binary_arg1 = makeString("binary_arg1");

    private static final SubLString $$$arg1 = makeString("arg1");

    private static final SubLString $str286$binary_arg2 = makeString("binary_arg2");

    private static final SubLString $str287$ternary_pred = makeString("ternary_pred");

    private static final SubLString $$$ternary_predicate = makeString("ternary predicate");

    private static final SubLObject $$TernaryPredicate = reader_make_constant_shell(makeString("TernaryPredicate"));

    private static final SubLString $str290$ternary_arg1 = makeString("ternary_arg1");

    private static final SubLString $str291$ternary_arg2 = makeString("ternary_arg2");

    private static final SubLString $str292$ternary_arg3 = makeString("ternary_arg3");

    private static final SubLString $$$arg3 = makeString("arg3");

    private static final SubLString $str294$_arg4 = makeString("+arg4");



    private static final SubLSymbol CB_HANDLE_GAF_ENTRY = makeSymbol("CB-HANDLE-GAF-ENTRY");

    private static final SubLString $$$_did_not_specify_a_term = makeString(" did not specify a term");

    private static final SubLString $$$Unexpected_sentence_entry_method = makeString("Unexpected sentence entry method");

    private static final SubLString $str299$_A = makeString("~A");

    private static final SubLString $str300$dim_ = makeString("dim_");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $str302$setVisibility__ = makeString("setVisibility('");

    private static final SubLString $str303$___inline___setVisibility__ = makeString("','inline');setVisibility('");

    private static final SubLString $str304$___none___ = makeString("','none');");

    public static SubLObject cb_inferred_index_frame(final SubLObject args) {
        SubLObject index_id = NIL;
        destructuring_bind_must_consp(args, args, $list5);
        index_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list5);
            return NIL;
        }
        final SubLObject index_hook = cb_guess_index(index_id);
        if (NIL == index_hook) {
            return cb_error($str6$Unable_to_determine_a_term_from__, index_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inferred_index(index_hook);
    }

    public static SubLObject cb_link_inferred_index(final SubLObject v_term, SubLObject linktext, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str10$_Inferred_;
        }
        final SubLObject index_id = cb_index_identifier(v_term);
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$cb_inferred_index_frame__A, index_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }

    public static SubLObject cb_legacy_index_frame(final SubLObject args) {
        SubLObject index_id = NIL;
        destructuring_bind_must_consp(args, args, $list5);
        index_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list5);
            return NIL;
        }
        final SubLObject index_hook = cb_guess_index(index_id);
        if (NIL == index_hook) {
            return cb_error($str6$Unable_to_determine_a_term_from__, index_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_browser.cb_c_index(index_hook);
    }

    public static SubLObject cb_link_legacy_index(final SubLObject v_term, SubLObject linktext, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str15$_Legacy_;
        }
        final SubLObject index_id = cb_index_identifier(v_term);
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str16$cb_legacy_index_frame__A, index_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }

    public static SubLObject cb_inferred_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject order_by = $cb_inferred_index_order_by$.getDynamicValue(thread);
        final SubLObject filters = $cb_inferred_index_filters$.getDynamicValue(thread);
        html_markup($str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str20$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            final SubLObject _prev_bind_0_$1 = dhtml_macros.$html_element_id$.currentBinding(thread);
            try {
                dhtml_macros.$html_element_id$.bind(ZERO_INTEGER, thread);
                dhtml_macros.basic_ajax_scripts();
                html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
            } finally {
                dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$1, thread);
            }
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(browsing_mt);
                    final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        cb_show_inferred_gaf_arg_index_header(v_term, filters, order_by);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_show_inferred_gaf_arg_index_utilities_section(v_term);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_show_inferred_gaf_arg_index(v_term, filters, order_by);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
            }
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_index_utilities_section(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject modification_permittedP = cb_editor.term_modification_permittedP(v_term);
        final SubLObject not_modifiableP = makeBoolean(NIL == modification_permittedP);
        html_princ_strong($str23$Browsing___);
        cb_link($DOCUMENTATION, v_term, $$$documentation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str26$___);
        cb_link($DEFINITIONAL, v_term, $$$definitional, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str26$___);
        cb_link($LEXICAL, v_term, NIL, $$$lexical, UNPROVIDED, UNPROVIDED);
        if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
            html_newline(UNPROVIDED);
            html_princ_strong($str31$Editing___);
            if (((NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue(thread)) && (NIL != sksi_kb_accessors.sk_source_in_any_mt_p(v_term))) && (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(v_term))) {
                cb_link($EDIT_IN_SMT, v_term, $$$edit_in_SMT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_princ($str26$___);
            }
            cb_link($CREATE_SIMILAR, v_term, $$$copy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != constant_p(v_term)) {
                html_princ($str26$___);
                cb_link($RENAME, v_term, $$$rename, not_modifiableP, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject unlexifiedP = lexification_utilities.unlexifiedP(v_term, UNPROVIDED);
            html_princ($str26$___);
            if (NIL != unlexifiedP) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_link($LEXIFY_TERM, v_term, $$$lexify, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } else {
                cb_link($LEXIFY_TERM, v_term, $$$lexify, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != cb_editor.term_as_merge_source_permittedP(v_term)) {
                html_princ($str26$___);
                cb_link($MERGE, v_term, $$$merge, not_modifiableP, UNPROVIDED, UNPROVIDED);
            }
            html_princ($str26$___);
            cb_link(NIL != $cb_confirm_kills$.getDynamicValue(thread) ? $CONFIRM_KILL : $KILL, v_term, $$$kill, not_modifiableP, UNPROVIDED, UNPROVIDED);
            if (NIL != fort_types_interface.collectionP(v_term)) {
                html_princ($str26$___);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($CREATE_INSTANCE, v_term, $$$create_instance, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_princ($str26$___);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($CREATE_SPEC, v_term, $$$create_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        }
        html_newline(UNPROVIDED);
        html_princ_strong($str49$Advanced___);
        if (NIL != forts.fort_p(v_term)) {
            cb_link($CHRONOLOGICAL_ORDER, v_term, $$$history, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_princ($str26$___);
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            cb_link($DESCRIBE_NART, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_princ($str26$___);
        } else
            if (NIL != constant_p(v_term)) {
                cb_link($DESCRIBE_CONSTANT, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_princ($str26$___);
            }

        if (NIL != kct_utils.kct_test_spec_p(v_term, UNPROVIDED)) {
            final SubLObject ttt_linkP = NIL;
            html_princ($str26$___);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (NIL != ttt_linkP) {
                cb_link($TTT_TEST, v_term, $$$take_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_link($KCT_TEST, v_term, $$$run_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        if ((NIL != kb_query.kbq_query_spec_p(v_term)) || (NIL != kct_utils.kct_test_spec_p(v_term, UNPROVIDED))) {
            final SubLObject query = (NIL != kct_utils.kct_test_spec_p(v_term, UNPROVIDED)) ? kct_utils.kct_query_specification(v_term, UNPROVIDED) : v_term;
            if (NIL != forts.fort_p(query)) {
                html_princ($str26$___);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KBQ_ASK, query, $$$ask_query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                if (NIL != cb_kb_query.kbq_query_practice_rules(query)) {
                    html_princ($str26$___);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_link($KBQ_ASK_IN_PROOF_CHECKER, query, $str61$proof_check_query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
            }
            html_princ($str26$___);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (NIL != kct_utils.kct_test_spec_p(v_term, UNPROVIDED)) {
                cb_link($KCT_EDIT, v_term, $$$edit_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_link($KBQ_EDIT, query, $$$edit_query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        if (NIL != $show_kb_monitor_links$.getDynamicValue(thread)) {
            html_princ($str26$___);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_link($KB_MONITOR_INDEX_HOOK, v_term, $$$monitor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        if (NIL != kct_utils.kct_test_collection_p(v_term, UNPROVIDED)) {
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_link($KCT_TEST_SET, v_term, $$$run_test_set, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        html_princ($str26$___);
        cb_browser.cb_c_index_views(v_term, $$$more_filters);
        if (NIL == cb_tools.cb_fastP()) {
            dhtml_macros.js_delayed_load_int(list(new SubLObject[]{ $HANDLER, CB_C_PERTINENT_QUERY_LINKS, $ARGS, list(bq_cons($$$term, v_term)), $MESSAGE, $str76$Checking_for_Pertinent_Queries___, $TAG, $$$div, $DELAY, $int$50 }));
        }
        return NIL;
    }

    public static SubLObject cb_possibly_show_term_as_seen_from_mt_header(final SubLObject mt, SubLObject newline_mode) {
        if (newline_mode == UNPROVIDED) {
            newline_mode = $BEFORE;
        }
        if (NIL == kb_utilities.kbeq(mt, $$EverythingPSC)) {
            SubLObject pcase_var = newline_mode;
            if (pcase_var.eql($BEFORE) || pcase_var.eql($BOTH)) {
                html_newline(UNPROVIDED);
            }
            cb_show_term_as_seen_from_mt_header(mt);
            pcase_var = newline_mode;
            if (pcase_var.eql($AFTER) || pcase_var.eql($BOTH)) {
                html_newline(UNPROVIDED);
            }
            return mt;
        }
        return NIL;
    }

    public static SubLObject cb_show_term_as_seen_from_mt_header(final SubLObject mt) {
        html_markup(html_macros.$html_italic_head$.getGlobalValue());
        html_markup(html_macros.$html_small_head$.getGlobalValue());
        html_princ($$$as_seen_from);
        html_markup(html_macros.$html_small_tail$.getGlobalValue());
        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        cb_browser.cb_c_mt_header(mt, NIL, T, UNPROVIDED);
        return mt;
    }

    public static SubLObject cb_show_inferred_gaf_arg_index_header(final SubLObject v_term, final SubLObject filters, final SubLObject order_by) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str86$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size = cb_term_font_size(v_term, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    final SubLObject size_val = size;
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_show_term(v_term, ZERO_INTEGER, T);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
                    cb_possibly_show_term_as_seen_from_mt_header(browsing_mt, $BEFORE);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str90$40_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_small_head$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str91$order_by__);
                    html_indent(UNPROVIDED);
                    if (order_by == $PREDICATE) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$predicate);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } else {
                        cb_link($INFERRED_INDEX_ORDER_BY, v_term, $PREDICATE, $$$predicate, UNPROVIDED, UNPROVIDED);
                    }
                    html_indent(UNPROVIDED);
                    if (order_by == $ONTOLOGY) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$ontology);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } else {
                        cb_link($INFERRED_INDEX_ORDER_BY, v_term, $ONTOLOGY, $$$ontology, UNPROVIDED, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str96$filters__);
                    html_indent(UNPROVIDED);
                    cb_link($INFERRED_INDEX_PREDICATE_FILTERS, v_term, $$$predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($INFERRED_INDEX_ONTOLOGY_FILTERS, v_term, $$$ontology, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($INFERRED_INDEX_MICROTHEORY_FILTERS, v_term, $$$mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str101$index_view__);
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_link($INFERRED_INDEX, v_term, $$$inferred, $SELF, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_indent(UNPROVIDED);
                    cb_link($LEGACY_INDEX, v_term, $$$legacy, $SELF, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_markup(html_macros.$html_small_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_index(final SubLObject v_term, SubLObject filters, SubLObject order_by) {
        if (filters == UNPROVIDED) {
            filters = NIL;
        }
        if (order_by == UNPROVIDED) {
            order_by = $PREDICATE;
        }
        final SubLObject tuples = inferred_indexing.all_inferred_gaf_arg_index_tuples(v_term, filters, order_by);
        final SubLObject tuple_groups = inferred_indexing.categorize_inferred_gaf_arg_index_tuples(v_term, tuples, order_by);
        final SubLObject pcase_var = order_by;
        if (pcase_var.eql($ONTOLOGY)) {
            return cb_show_inferred_gaf_arg_index_by_ontology(v_term, tuple_groups);
        }
        if (pcase_var.eql($PREDICATE)) {
            return cb_show_inferred_gaf_arg_index_by_predicate(v_term, tuple_groups);
        }
        return cb_error($str104$Unexpected_order_by____S, order_by, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_show_inferred_gaf_arg_index_by_ontology(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tuple_groups) {
            cb_show_inferred_gaf_arg_index_all_assertions_line(v_term, tuple_groups);
            html_newline(UNPROVIDED);
        }
        SubLObject cdolist_list_var = tuple_groups;
        SubLObject tuples = NIL;
        tuples = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject first_tuple = tuples.first();
            final SubLObject group_qua = second(first_tuple);
            final SubLObject dhtml_object_id = cb_make_inferred_gaf_arg_index_tuples_object_id(group_qua, UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str105$);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_princ($$$via_);
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
            cb_link($INFERRED_GAF_ARG_ASSERTIONS, v_term, group_qua, group_qua, UNPROVIDED, UNPROVIDED);
            final SubLObject count = inferred_indexing.num_inferred_gaf_arg_index_tuples(tuples, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_show_inferred_index_count(count, $int$100);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, group_qua.eql(v_term) ? $VISIBLE : $cb_inferred_index_visibility$.getDynamicValue(thread), $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != dhtml_object_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(dhtml_object_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var_$10 = tuples;
                SubLObject tuple = NIL;
                tuple = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject infer_pred = NIL;
                    SubLObject qua = NIL;
                    SubLObject argnum = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list111);
                    infer_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    qua = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_indent(FOUR_INTEGER);
                        cb_link($INFERRED_GAF_ARG_ASSERTIONS, v_term, pred, qua, argnum, pred);
                        if (!argnum.numE(ONE_INTEGER)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str112$_arg_S, argnum);
                        }
                        final SubLObject count2 = inferred_indexing.num_inferred_gaf_arg_index_tuple(tuple, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        cb_show_inferred_index_count(count2, $int$100);
                        final SubLObject literal_queryP = cb_show_inferred_index_literal_query_linkP(v_term, argnum, pred);
                        final SubLObject hierarchy_browserP = cb_show_inferred_index_hierarchy_browser_linkP(v_term, argnum, pred);
                        if (NIL != literal_queryP) {
                            html_indent(UNPROVIDED);
                            cb_link($LITERAL_QUERY, v_term, argnum, pred, $$EverythingPSC, UNPROVIDED);
                        }
                        if (NIL != hierarchy_browserP) {
                            html_indent(UNPROVIDED);
                            cb_link($HIER_BROW, v_term, argnum, pred, $$EverythingPSC, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list111);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    tuple = cdolist_list_var_$10.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            tuples = cdolist_list_var.first();
        } 
        cb_browser.cb_show_term_index_besides_gaf_arg(v_term);
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_index_by_predicate(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tuple_groups) {
            cb_show_inferred_gaf_arg_index_all_assertions_line(v_term, tuple_groups);
            html_newline(UNPROVIDED);
        }
        SubLObject cdolist_list_var = tuple_groups;
        SubLObject tuples = NIL;
        tuples = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject first_tuple = tuples.first();
            final SubLObject first_qua = second(first_tuple);
            final SubLObject group_pred = fourth(first_tuple);
            final SubLObject group_argnum = third(first_tuple);
            final SubLObject dhtml_object_id = cb_make_inferred_gaf_arg_index_tuples_object_id(group_pred, group_argnum);
            final SubLObject only_selfP = makeBoolean((NIL != list_utilities.singletonP(tuples)) && v_term.equal(first_qua));
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (NIL != only_selfP) {
                dhtml_macros.dhtml_switch_visibility_no_arrow();
            } else {
                dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str105$);
            }
            final SubLObject size_val;
            final SubLObject size = size_val = cb_term_font_size(group_pred, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != size_val) {
                html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size_val);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_link($INFERRED_GAF_ARG_ASSERTIONS, v_term, group_pred, NIL, group_argnum, group_pred);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            if (!group_argnum.numE(ONE_INTEGER)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str112$_arg_S, group_argnum);
            }
            final SubLObject count = inferred_indexing.num_inferred_gaf_arg_index_tuples(tuples, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_show_inferred_index_count(count, $int$100);
            final SubLObject literal_queryP = makeBoolean((NIL == only_selfP) || (NIL != cb_show_inferred_index_literal_query_linkP(v_term, group_argnum, group_pred)));
            if (NIL != literal_queryP) {
                html_indent(UNPROVIDED);
                cb_link($LITERAL_QUERY, v_term, group_argnum, group_pred, $$EverythingPSC, UNPROVIDED);
            }
            final SubLObject hierarchy_browserP = cb_show_inferred_index_hierarchy_browser_linkP(v_term, group_argnum, group_pred);
            if (NIL != hierarchy_browserP) {
                html_indent(UNPROVIDED);
                cb_link($HIER_BROW, v_term, group_argnum, group_pred, $$EverythingPSC, UNPROVIDED);
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            if ((NIL == list_utilities.singletonP(tuples)) || (!v_term.equal(first_qua))) {
                dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $cb_inferred_index_visibility$.getDynamicValue(thread), $TEXT);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != dhtml_object_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(dhtml_object_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var_$11 = tuples;
                    SubLObject tuple = NIL;
                    tuple = cdolist_list_var_$11.first();
                    while (NIL != cdolist_list_var_$11) {
                        SubLObject current;
                        final SubLObject datum = current = tuple;
                        SubLObject infer_pred = NIL;
                        SubLObject qua = NIL;
                        SubLObject argnum = NIL;
                        SubLObject pred = NIL;
                        destructuring_bind_must_consp(current, datum, $list111);
                        infer_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list111);
                        qua = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list111);
                        argnum = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list111);
                        pred = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                            html_indent(FOUR_INTEGER);
                            html_princ($$$via_);
                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            cb_link($INFERRED_GAF_ARG_ASSERTIONS, v_term, qua, qua, argnum, pred);
                            final SubLObject count2 = inferred_indexing.num_inferred_gaf_arg_index_tuple(tuple, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            cb_show_inferred_index_count(count2, $int$100);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list111);
                        }
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        tuple = cdolist_list_var_$11.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuples = cdolist_list_var.first();
        } 
        cb_browser.cb_show_term_index_besides_gaf_arg(v_term);
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_index_all_assertions_line(final SubLObject v_term, final SubLObject tuple_groups) {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_link($INFERRED_GAF_ARG_ASSERTIONS, v_term, $$$All_Assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject count = inferred_indexing.num_inferred_gaf_arg_index_tuple_groups(tuple_groups, UNPROVIDED);
        html_indent(TWO_INTEGER);
        cb_show_inferred_index_count(count, $int$1000);
        html_indent(FOUR_INTEGER);
        cb_link($INFERRED_INDEX_TOGGLE_VISIBILITY, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_inferred_index_count(final SubLObject count, SubLObject warning_limit) {
        if (warning_limit == UNPROVIDED) {
            warning_limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!ONE_INTEGER.numE(count)) {
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str118$__A_, count);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
            if ((NIL != warning_limit) && count.numG(warning_limit)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (NIL != cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str119$color__red__background_color_yell);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str120$_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject cb_make_inferred_gaf_arg_index_tuples_object_id(final SubLObject v_term, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        final SubLObject id = cb_term_identifier(v_term);
        return cconcatenate($str121$igai_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), format_nil.format_nil_a_no_copy(NIL != argnum ? argnum : $str105$) });
    }

    public static SubLObject cb_link_literal_query(final SubLObject v_term, final SubLObject argnum, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        if (NIL != mt) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str123$cb_lq__A__A__A__A, new SubLObject[]{ cb_fort_identifier(v_term), argnum, cb_fort_identifier(pred), cb_fort_identifier(mt) });
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str124$cb_lq__A__A__A, new SubLObject[]{ cb_fort_identifier(v_term), argnum, cb_fort_identifier(pred) });
        }
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($PLUS_GREEN);
            final SubLObject align = $TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($PLUS_GREEN);
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_inferred_index_literal_query_linkP(final SubLObject v_term, final SubLObject argnum, final SubLObject pred) {
        return makeBoolean((((NIL != hl_supports.hl_predicate_p(pred)) || (NIL != inference_trampolines.inference_symmetric_predicateP(pred))) || (NIL != inference_trampolines.inference_transitive_predicateP(pred))) || (NIL != inference_trampolines.inference_reflexive_predicateP(pred)));
    }

    public static SubLObject cb_link_hier_brow(final SubLObject v_term, final SubLObject argnum, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        if (NIL != mt) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str127$cb_hier__A__A__A__A, new SubLObject[]{ cb_fort_identifier(v_term), argnum, cb_fort_identifier(pred), cb_fort_identifier(mt) });
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str128$cb_hier__A__A__A, new SubLObject[]{ cb_fort_identifier(v_term), argnum, cb_fort_identifier(pred) });
        }
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($RED_DIAMOND);
            final SubLObject align = $TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($RED_DIAMOND);
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_inferred_index_hierarchy_browser_linkP(final SubLObject v_term, final SubLObject argnum, final SubLObject pred) {
        return makeBoolean((NIL != genl_predicates.any_genl_predP(pred, $list131, UNPROVIDED, UNPROVIDED)) && argnum.eql(ONE_INTEGER));
    }

    public static SubLObject cb_inferred_index_order_by(final SubLObject args) {
        SubLObject index_id = NIL;
        SubLObject order_by_string = NIL;
        destructuring_bind_must_consp(args, args, $list132);
        index_id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list132);
        order_by_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list132);
            return NIL;
        }
        final SubLObject index_hook = cb_guess_index(index_id);
        if (NIL == index_hook) {
            return cb_error($str6$Unable_to_determine_a_term_from__, index_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject order_by = make_keyword(order_by_string);
        $cb_inferred_index_order_by$.setDynamicValue(order_by);
        return cb_inferred_index(index_hook);
    }

    public static SubLObject cb_link_inferred_index_order_by(final SubLObject v_term, final SubLObject order_by, final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_id = cb_index_identifier(v_term);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str134$cb_inferred_index_order_by__A__A, index_id, order_by);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }

    public static SubLObject cb_inferred_index_visibility(final SubLObject args) {
        SubLObject index_id = NIL;
        SubLObject visibility_string = NIL;
        destructuring_bind_must_consp(args, args, $list136);
        index_id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list136);
        visibility_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list136);
            return NIL;
        }
        final SubLObject index_hook = cb_guess_index(index_id);
        final SubLObject visibility = read_from_string_ignoring_errors(visibility_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == index_hook) {
            return cb_error($str6$Unable_to_determine_a_term_from__, index_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        $cb_inferred_index_visibility$.setDynamicValue(visibility);
        return cb_inferred_index(index_hook);
    }

    public static SubLObject cb_link_inferred_index_toggle_visibility(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_id = cb_index_identifier(v_term);
        final SubLObject toggled_visibility = ($cb_inferred_index_visibility$.getDynamicValue(thread) == $VISIBLE) ? $INVISIBLE : $VISIBLE;
        final SubLObject linktext = ($cb_inferred_index_visibility$.getDynamicValue(thread) == $VISIBLE) ? $$$close_all : $$$open_all;
        final SubLObject icon = ($cb_inferred_index_visibility$.getDynamicValue(thread) == $VISIBLE) ? $DOWN_TRIANGLE_V : $RIGHT_TRIANGLE_V;
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str142$cb_inferred_index_visibility__A__, index_id, toggled_visibility);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(icon));
            final SubLObject align = $TOP;
            final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(icon);
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
            html_princ(linktext);
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }

    public static SubLObject cb_inferred_index_predicate_filters(final SubLObject args) {
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list145);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list145);
            return NIL;
        }
        final SubLObject v_term = cb_guess_term(id_string, UNPROVIDED);
        if (NIL == indexed_term_p(v_term)) {
            return cb_error($str146$_S_did_not_specify_a_term, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inferred_index_predicate_filters_guts(v_term);
    }

    public static SubLObject cb_link_inferred_index_predicate_filters(SubLObject v_term, SubLObject linktext) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str148$_Predicate_Filters_;
        }
        final SubLObject id = cb_term_identifier(v_term);
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str149$cb_inferred_index_predicate_filte, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_inferred_index_predicate_filters_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = $$$Inferred_Index_Predicate_Filters;
        html_markup($str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str20$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str153$cb_handle_inferred_index_predicat, T, UNPROVIDED);
                        final SubLObject size_val = FIVE_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong(title);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_princ($$$relevant_to_);
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_show_term(v_term, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        html_submit_input($$$Update_Filters, $$$update, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        html_reset_input($$$Reset_Values);
                        html_indent(FOUR_INTEGER);
                        html_submit_input($$$Remove_All_Filters, $$$clear, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        final SubLObject current;
                        final SubLObject datum = current = $cb_inferred_index_filters$.getDynamicValue(thread);
                        final SubLObject allow_predicates_tail = property_list_member($ALLOW_PREDICATES, current);
                        final SubLObject allow_predicates = (NIL != allow_predicates_tail) ? cadr(allow_predicates_tail) : NIL;
                        final SubLObject allow_predicate_types_tail = property_list_member($ALLOW_PREDICATE_TYPES, current);
                        final SubLObject allow_predicate_types = (NIL != allow_predicate_types_tail) ? cadr(allow_predicate_types_tail) : NIL;
                        final SubLObject forbid_predicates_tail = property_list_member($FORBID_PREDICATES, current);
                        final SubLObject forbid_predicates = (NIL != forbid_predicates_tail) ? cadr(forbid_predicates_tail) : NIL;
                        final SubLObject forbid_predicate_types_tail = property_list_member($FORBID_PREDICATE_TYPES, current);
                        final SubLObject forbid_predicate_types = (NIL != forbid_predicate_types_tail) ? cadr(forbid_predicate_types_tail) : NIL;
                        final SubLObject term_predicates = inferred_indexing.all_inferred_gaf_arg_index_predicates(v_term);
                        thread.resetMultipleValues();
                        SubLObject term_allow_predicates = inferred_indexing.categorize_via_pred_filters(term_predicates, $cb_inferred_index_filters$.getDynamicValue(thread));
                        SubLObject term_forbid_predicates = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        term_allow_predicates = union(allow_predicates, term_allow_predicates, symbol_function(EQ), UNPROVIDED);
                        term_forbid_predicates = union(forbid_predicates, term_forbid_predicates, symbol_function(EQ), UNPROVIDED);
                        html_hidden_input($$$term, cb_term_identifier(v_term), UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject size_val2 = FIVE_INTEGER;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val2) {
                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(size_val2);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Allowed_Types);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (NIL != allow_predicate_types) {
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$check_to_remove);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = allow_predicate_types;
                                        SubLObject type = NIL;
                                        type = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_newline(UNPROVIDED);
                                            cb_inferred_index_predicate_type_filter_remove_allow_checkbox(type);
                                            html_indent(UNPROVIDED);
                                            cb_show_term(type, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            type = cdolist_list_var.first();
                                        } 
                                    }
                                    html_newline(UNPROVIDED);
                                    html_princ($$$add_);
                                    html_text_input($str167$type_allow, $str105$, $int$30);
                                    html_indent(ONE_INTEGER);
                                    html_complete.html_complete_button($str167$type_allow, $$$Complete, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(FOUR_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject size_val2 = FIVE_INTEGER;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val2) {
                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(size_val2);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Forbidden_Types);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (NIL != forbid_predicate_types) {
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$check_to_remove);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = forbid_predicate_types;
                                        SubLObject type = NIL;
                                        type = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_newline(UNPROVIDED);
                                            cb_inferred_index_predicate_type_filter_remove_forbid_checkbox(type);
                                            html_indent(UNPROVIDED);
                                            cb_show_term(type, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            type = cdolist_list_var.first();
                                        } 
                                    }
                                    html_newline(UNPROVIDED);
                                    html_princ($$$add_);
                                    html_text_input($str172$type_forbid, $str105$, $int$30);
                                    html_indent(ONE_INTEGER);
                                    html_complete.html_complete_button($str172$type_forbid, $$$Complete, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject size_val2 = FIVE_INTEGER;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val2) {
                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(size_val2);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Allowed_Predicates);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (NIL == term_allow_predicates) {
                                        html_newline(UNPROVIDED);
                                        final SubLObject color_val = $RED;
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != color_val) {
                                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_color(color_val));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str175$None_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                    if (NIL != term_allow_predicates) {
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$check_to_forbid);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = term_allow_predicates;
                                        SubLObject predicate = NIL;
                                        predicate = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_newline(UNPROVIDED);
                                            cb_inferred_index_predicate_filter_forbid_checkbox(predicate);
                                            html_indent(UNPROVIDED);
                                            cb_show_term(predicate, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            predicate = cdolist_list_var.first();
                                        } 
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(FOUR_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject size_val2 = FIVE_INTEGER;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val2) {
                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(size_val2);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Forbidden_Predicates);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (NIL == term_forbid_predicates) {
                                        html_newline(UNPROVIDED);
                                        html_princ($str175$None_);
                                    }
                                    if (NIL != term_forbid_predicates) {
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$check_to_allow);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = term_forbid_predicates;
                                        SubLObject predicate = NIL;
                                        predicate = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_newline(UNPROVIDED);
                                            cb_inferred_index_predicate_filter_allow_checkbox(predicate);
                                            html_indent(UNPROVIDED);
                                            cb_show_term(predicate, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            predicate = cdolist_list_var.first();
                                        } 
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$15, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_inferred_index_predicate_type_filter_remove_allow_checkbox(final SubLObject type) {
        return html_checkbox_input(cconcatenate($str179$remove_type_allow_, format_nil.format_nil_a_no_copy(cb_term_identifier(type))), $$$T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_inferred_index_predicate_type_filter_remove_forbid_checkbox(final SubLObject type) {
        return html_checkbox_input(cconcatenate($str181$remove_type_forbid_, format_nil.format_nil_a_no_copy(cb_term_identifier(type))), $$$T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_inferred_index_predicate_filter_forbid_checkbox(final SubLObject predicate) {
        return html_checkbox_input(cconcatenate($str182$forbid_, format_nil.format_nil_a_no_copy(cb_term_identifier(predicate))), $$$T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_inferred_index_predicate_filter_allow_checkbox(final SubLObject predicate) {
        return html_checkbox_input(cconcatenate($str183$allow_, format_nil.format_nil_a_no_copy(cb_term_identifier(predicate))), $$$T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_handle_inferred_index_predicate_filters(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_string = html_extract_input($$$term, args);
        final SubLObject v_term = cb_guess_term(term_string, UNPROVIDED);
        if (NIL != html_extract_input($$$clear, args)) {
            cb_clear_inferred_index_predicate_filters();
        } else {
            thread.resetMultipleValues();
            final SubLObject new_type_allow = cb_extract_inferred_index_predicate_filters(args);
            final SubLObject type_allows_to_remove = thread.secondMultipleValue();
            final SubLObject new_type_forbid = thread.thirdMultipleValue();
            final SubLObject type_forbids_to_remove = thread.fourthMultipleValue();
            final SubLObject new_predicates_to_allow = thread.fifthMultipleValue();
            final SubLObject new_predicates_to_forbid = thread.sixthMultipleValue();
            thread.resetMultipleValues();
            cb_update_inferred_index_predicate_filters(new_type_allow, type_allows_to_remove, new_type_forbid, type_forbids_to_remove, new_predicates_to_allow, new_predicates_to_forbid);
        }
        return cb_inferred_index_predicate_filters_guts(v_term);
    }

    public static SubLObject cb_extract_inferred_index_predicate_filters(final SubLObject args) {
        SubLObject new_type_allow = NIL;
        SubLObject type_allows_to_remove = NIL;
        SubLObject new_type_forbid = NIL;
        SubLObject type_forbids_to_remove = NIL;
        SubLObject new_predicates_to_allow = NIL;
        SubLObject new_predicates_to_forbid = NIL;
        final SubLObject type_allow_string = html_extract_input($str167$type_allow, args);
        if (NIL == string_utilities.empty_string_p(type_allow_string)) {
            final SubLObject v_term = cb_guess_term(type_allow_string, UNPROVIDED);
            if (NIL != v_term) {
                new_type_allow = v_term;
            }
        }
        final SubLObject type_forbid_string = html_extract_input($str172$type_forbid, args);
        if (NIL == string_utilities.empty_string_p(type_forbid_string)) {
            final SubLObject v_term2 = cb_guess_term(type_forbid_string, UNPROVIDED);
            if (NIL != v_term2) {
                new_type_forbid = v_term2;
            }
        }
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject name = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list185);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list185);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != string_utilities.starts_with(name, $str182$forbid_)) {
                        final SubLObject id_string = string_utilities.substring(name, SEVEN_INTEGER, UNPROVIDED);
                        final SubLObject var;
                        final SubLObject v_term3 = var = cb_guess_term(id_string, UNPROVIDED);
                        if (NIL != var) {
                            new_predicates_to_forbid = cons(var, new_predicates_to_forbid);
                        }
                    } else
                        if (NIL != string_utilities.starts_with(name, $str183$allow_)) {
                            final SubLObject id_string = string_utilities.substring(name, SIX_INTEGER, UNPROVIDED);
                            final SubLObject var;
                            final SubLObject v_term3 = var = cb_guess_term(id_string, UNPROVIDED);
                            if (NIL != var) {
                                new_predicates_to_allow = cons(var, new_predicates_to_allow);
                            }
                        } else
                            if (NIL != string_utilities.starts_with(name, $str181$remove_type_forbid_)) {
                                final SubLObject id_string = string_utilities.substring(name, NINETEEN_INTEGER, UNPROVIDED);
                                final SubLObject var;
                                final SubLObject v_term3 = var = cb_guess_term(id_string, UNPROVIDED);
                                if (NIL != var) {
                                    type_forbids_to_remove = cons(var, type_forbids_to_remove);
                                }
                            } else
                                if (NIL != string_utilities.starts_with(name, $str179$remove_type_allow_)) {
                                    final SubLObject id_string = string_utilities.substring(name, EIGHTEEN_INTEGER, UNPROVIDED);
                                    final SubLObject var;
                                    final SubLObject v_term3 = var = cb_guess_term(id_string, UNPROVIDED);
                                    if (NIL != var) {
                                        type_allows_to_remove = cons(var, type_allows_to_remove);
                                    }
                                }



                } else {
                    cdestructuring_bind_error(datum, $list185);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return values(new_type_allow, type_allows_to_remove, new_type_forbid, type_forbids_to_remove, new_predicates_to_allow, new_predicates_to_forbid);
    }

    public static SubLObject cb_clear_inferred_index_predicate_filters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_inferred_index_filters$.setDynamicValue(remprop($ALLOW_PREDICATE_TYPES, $cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        $cb_inferred_index_filters$.setDynamicValue(remprop($FORBID_PREDICATE_TYPES, $cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        $cb_inferred_index_filters$.setDynamicValue(remprop($ALLOW_PREDICATES, $cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        $cb_inferred_index_filters$.setDynamicValue(remprop($FORBID_PREDICATES, $cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject cb_update_inferred_index_predicate_filters(final SubLObject new_type_allow, final SubLObject type_allows_to_remove, final SubLObject new_type_forbid, final SubLObject type_forbids_to_remove, final SubLObject new_predicates_to_allow, final SubLObject new_predicates_to_forbid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != new_type_allow) || (NIL != type_allows_to_remove)) {
            SubLObject types = getf($cb_inferred_index_filters$.getDynamicValue(thread), $ALLOW_PREDICATE_TYPES, NIL);
            if ((NIL != new_type_allow) && (NIL == member(new_type_allow, types, symbol_function(EQL), symbol_function(IDENTITY)))) {
                types = cons(new_type_allow, types);
            }
            SubLObject cdolist_list_var = type_allows_to_remove;
            SubLObject type = NIL;
            type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                types = list_utilities.delete_first(type, types, symbol_function(EQ));
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            } 
            $cb_inferred_index_filters$.setDynamicValue(putf($cb_inferred_index_filters$.getDynamicValue(thread), $ALLOW_PREDICATE_TYPES, types), thread);
        }
        if ((NIL != new_type_forbid) || (NIL != type_forbids_to_remove)) {
            SubLObject types = getf($cb_inferred_index_filters$.getDynamicValue(thread), $FORBID_PREDICATE_TYPES, NIL);
            if ((NIL != new_type_forbid) && (NIL == member(new_type_forbid, types, symbol_function(EQL), symbol_function(IDENTITY)))) {
                types = cons(new_type_forbid, types);
            }
            SubLObject cdolist_list_var = type_forbids_to_remove;
            SubLObject type = NIL;
            type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                types = list_utilities.delete_first(type, types, symbol_function(EQ));
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            } 
            $cb_inferred_index_filters$.setDynamicValue(putf($cb_inferred_index_filters$.getDynamicValue(thread), $FORBID_PREDICATE_TYPES, types), thread);
        }
        if ((NIL != new_predicates_to_allow) || (NIL != new_predicates_to_forbid)) {
            SubLObject allow = getf($cb_inferred_index_filters$.getDynamicValue(thread), $ALLOW_PREDICATES, NIL);
            SubLObject forbid = getf($cb_inferred_index_filters$.getDynamicValue(thread), $FORBID_PREDICATES, NIL);
            SubLObject cdolist_list_var = new_predicates_to_allow;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forbid = list_utilities.delete_first(pred, forbid, symbol_function(EQ));
                final SubLObject item_var = pred;
                if (NIL == member(item_var, allow, symbol_function(EQ), symbol_function(IDENTITY))) {
                    allow = cons(item_var, allow);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            cdolist_list_var = new_predicates_to_forbid;
            pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                allow = list_utilities.delete_first(pred, allow, symbol_function(EQ));
                final SubLObject item_var = pred;
                if (NIL == member(item_var, forbid, symbol_function(EQ), symbol_function(IDENTITY))) {
                    forbid = cons(item_var, forbid);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            $cb_inferred_index_filters$.setDynamicValue(putf($cb_inferred_index_filters$.getDynamicValue(thread), $ALLOW_PREDICATES, allow), thread);
            $cb_inferred_index_filters$.setDynamicValue(putf($cb_inferred_index_filters$.getDynamicValue(thread), $FORBID_PREDICATES, forbid), thread);
        }
        return NIL;
    }

    public static SubLObject cb_inferred_index_ontology_filters(final SubLObject args) {
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list145);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list145);
            return NIL;
        }
        final SubLObject v_term = cb_guess_term(id_string, UNPROVIDED);
        if (NIL == indexed_term_p(v_term)) {
            return cb_error($str146$_S_did_not_specify_a_term, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_inferred_index_ontology_filters_guts(v_term);
    }

    public static SubLObject cb_link_inferred_index_ontology_filters(SubLObject v_term, SubLObject linktext) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str187$_Ontology_Filters_;
        }
        final SubLObject id = cb_term_identifier(v_term);
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str188$cb_inferred_index_ontology_filter, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_inferred_index_ontology_filters_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = $$$Inferred_Index_Ontology_Filters;
        html_markup($str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str20$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str191$cb_handle_inferred_index_ontology, T, UNPROVIDED);
                        final SubLObject size_val = FIVE_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong(title);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_princ($$$relevant_to_);
                        html_indent(UNPROVIDED);
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_show_term(v_term, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        html_submit_input($$$Update_Filters, $$$update, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        html_reset_input($$$Reset_Values);
                        html_newline(TWO_INTEGER);
                        final SubLObject current;
                        final SubLObject datum = current = $cb_inferred_index_filters$.getDynamicValue(thread);
                        final SubLObject ontology_horizon_tail = property_list_member($ONTOLOGY_HORIZON, current);
                        final SubLObject ontology_horizon = (NIL != ontology_horizon_tail) ? cadr(ontology_horizon_tail) : NIL;
                        final SubLObject ontology_terms = inferred_indexing.all_inferred_gaf_arg_index_ontology_terms(v_term);
                        html_hidden_input($$$term, cb_term_identifier(v_term), UNPROVIDED);
                        final SubLObject size_val2 = FIVE_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val2) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val2);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Generality_Horizon);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$select_a_qualitative_boundary);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        SubLObject cdolist_list_var = $list195;
                        SubLObject qua = NIL;
                        qua = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_newline(UNPROVIDED);
                            cb_inferred_index_ontology_horizon_radio_button(qua, ontology_horizon);
                            html_indent(UNPROVIDED);
                            cb_show_ontology_horizon_term(qua);
                            cdolist_list_var = cdolist_list_var.rest();
                            qua = cdolist_list_var.first();
                        } 
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$or_a_generalization);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        cdolist_list_var = ontology_terms;
                        qua = NIL;
                        qua = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (!qua.equal(v_term)) {
                                html_newline(UNPROVIDED);
                                cb_inferred_index_ontology_horizon_radio_button(qua, ontology_horizon);
                                html_indent(UNPROVIDED);
                                cb_show_ontology_horizon_term(qua);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            qua = cdolist_list_var.first();
                        } 
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$33, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_inferred_index_ontology_horizon_radio_button(final SubLObject qua, final SubLObject ontology_horizon) {
        final SubLObject checkedP = makeBoolean(((NIL == ontology_horizon) && (qua == $ALL)) || qua.eql(ontology_horizon));
        final SubLObject value = (NIL != forts.fort_p(qua)) ? cb_fort_identifier(qua) : prin1_to_string(qua);
        return html_radio_input($str198$ontology_horizon, value, checkedP, UNPROVIDED);
    }

    public static SubLObject cb_handle_inferred_index_ontology_filters(final SubLObject args) {
        final SubLObject term_string = html_extract_input($$$term, args);
        final SubLObject v_term = cb_guess_term(term_string, UNPROVIDED);
        final SubLObject ontology_horizon = cb_extract_inferred_index_ontology_horizon(args);
        cb_update_inferred_index_ontology_filters(ontology_horizon);
        return cb_inferred_index_ontology_filters_guts(v_term);
    }

    public static SubLObject cb_show_ontology_horizon_term(final SubLObject qua) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (qua.eql($SELF)) {
            html_princ($$$Just_on_the_term);
        } else
            if (qua.eql($LOWER)) {
                html_princ($$$Also_from_the_lower_ontology);
            } else
                if (qua.eql($MIDDLE)) {
                    html_princ($str204$Also_up_through_the_middle_ontolo);
                } else
                    if (qua.eql($ALL)) {
                        html_princ($$$Everything);
                    } else {
                        final SubLObject size_val;
                        final SubLObject size = size_val = cb_term_font_size(qua, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_term(qua, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }



        return NIL;
    }

    public static SubLObject cb_extract_inferred_index_ontology_horizon(final SubLObject args) {
        final SubLObject identifier_string = html_extract_input($str198$ontology_horizon, args);
        final SubLObject fort = cb_guess_fort(identifier_string, UNPROVIDED);
        if (NIL != forts.fort_p(fort)) {
            return fort;
        }
        return read_from_string_ignoring_errors(identifier_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_update_inferred_index_ontology_filters(SubLObject ontology_horizon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ontology_horizon == $ALL) {
            ontology_horizon = NIL;
        }
        $cb_inferred_index_filters$.setDynamicValue(putf($cb_inferred_index_filters$.getDynamicValue(thread), $ONTOLOGY_HORIZON, ontology_horizon), thread);
        return NIL;
    }

    public static SubLObject cb_inferred_index_microtheory_filters(final SubLObject args) {
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list145);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list145);
            return NIL;
        }
        final SubLObject v_term = cb_guess_term(id_string, UNPROVIDED);
        if (NIL == indexed_term_p(v_term)) {
            return cb_error($str146$_S_did_not_specify_a_term, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_error($str206$Time_to_implement_cb_inferred_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_link_inferred_index_microtheory_filters(SubLObject v_term, SubLObject linktext) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (NIL == linktext) {
            linktext = $str208$_Microtheory_Filters_;
        }
        final SubLObject id = cb_term_identifier(v_term);
        html_princ(linktext);
        return NIL;
    }

    public static SubLObject cb_set_microtheory_browsing_filter(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_inferred_index_filters$.setDynamicValue(putf($cb_inferred_index_filters$.getDynamicValue(thread), $MICROTHEORY, mt), thread);
        cb_viewpoint.cb_set_microtheory_browsing_filter_viewpoint(mt);
        return mt;
    }

    public static SubLObject cb_link_inferred_gaf_arg_assertions(final SubLObject v_term, final SubLObject display_term, SubLObject qua, SubLObject argnum, SubLObject pred) {
        if (qua == UNPROVIDED) {
            qua = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject display_string = (display_term.isString()) ? display_term : cb_term_display_string(display_term);
        final SubLObject size = cb_term_font_size(display_term, UNPROVIDED, UNPROVIDED);
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        if (((NIL != qua) && (NIL != argnum)) && (NIL != pred)) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str211$cb_inferred_gaf_arg_assertions__A, new SubLObject[]{ cb_index_identifier(v_term), cb_index_identifier(qua), argnum, cb_index_identifier(pred) });
        } else
            if (((NIL == qua) && (NIL != argnum)) && (NIL != pred)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str211$cb_inferred_gaf_arg_assertions__A, new SubLObject[]{ cb_index_identifier(v_term), NIL, argnum, cb_index_identifier(pred) });
            } else
                if (((NIL != qua) && (NIL == argnum)) && (NIL == pred)) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str212$cb_inferred_gaf_arg_assertions__A, cb_index_identifier(v_term), cb_index_identifier(qua));
                } else
                    if (((NIL == qua) && (NIL == argnum)) && (NIL == pred)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str213$cb_inferred_gaf_arg_assertions__A, cb_index_identifier(v_term));
                    }



        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject size_val = size;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != size_val) {
                html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size_val);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(display_string);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return display_term;
    }

    public static SubLObject cb_inferred_gaf_arg_assertions(final SubLObject args) {
        SubLObject term_spec = NIL;
        destructuring_bind_must_consp(args, args, $list215);
        term_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject qua_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list215);
        current = current.rest();
        final SubLObject argnum_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list215);
        current = current.rest();
        final SubLObject pred_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list215);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list215);
            return NIL;
        }
        SubLObject v_term = NIL;
        SubLObject qua = NIL;
        SubLObject argnum = NIL;
        SubLObject predicate = NIL;
        v_term = cb_guess_index(term_spec);
        if (NIL == indexed_term_p(v_term)) {
            return cb_error($str216$Could_not_determine_a_term_from__, term_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL != qua_spec) && (!$$$NIL.equal(qua_spec))) {
            qua = cb_guess_index(qua_spec);
            if (NIL == indexed_term_p(qua)) {
                return cb_error($str216$Could_not_determine_a_term_from__, qua_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != argnum_spec) {
            argnum = read_from_string_ignoring_errors(argnum_spec, NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (!argnum.isInteger()) {
                return cb_error($str218$Could_not_determine_an_argnum_fro, argnum_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != pred_spec) {
            predicate = cb_guess_fort(pred_spec, UNPROVIDED);
            if (NIL == forts.fort_p(predicate)) {
                return cb_error($str216$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return cb_inferred_gaf_arg_assertions_guts(v_term, qua, argnum, predicate);
    }

    public static SubLObject cb_inferred_gaf_arg_assertions_guts(final SubLObject v_term, final SubLObject qua, final SubLObject argnum, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filters = $cb_inferred_index_filters$.getDynamicValue(thread);
        final SubLObject mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
        final SubLObject order_by = $cb_inferred_index_order_by$.getDynamicValue(thread);
        final SubLObject raw_tuples = inferred_indexing.all_inferred_gaf_arg_index_tuples(v_term, filters, order_by);
        final SubLObject filtered_tuples = filter_gaf_arg_index_tuples(raw_tuples, qua, argnum, predicate);
        final SubLObject tuple_groups = inferred_indexing.categorize_inferred_gaf_arg_index_tuples(v_term, filtered_tuples, order_by);
        final SubLObject title_var;
        final SubLObject title = title_var = format(NIL, $str220$Inferred_GAF_arg_index_for__S, v_term);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str20$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str221$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str226$reloadCurrentFrame__reloadFrameBu);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cb_browser.cb_possibly_show_followup_widget(v_term);
                        cb_term_type_header_with_gaf_entry(v_term, UNPROVIDED);
                        cb_possibly_show_term_as_seen_from_mt_header(mt, $AFTER);
                        final SubLObject pcase_var = order_by;
                        if (pcase_var.eql($ONTOLOGY)) {
                            cb_show_inferred_gaf_arg_assertions_by_ontology(v_term, tuple_groups);
                        } else
                            if (pcase_var.eql($PREDICATE)) {
                                cb_show_inferred_gaf_arg_assertions_by_predicate(v_term, tuple_groups);
                            } else {
                                cb_error($str104$Unexpected_order_by____S, order_by, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }

                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$40, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$39, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_assertions_by_ontology(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_browser.$cb_c_gaf_arg_show_arg_headerP$.currentBinding(thread);
        try {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.bind(NIL, thread);
            SubLObject list_var = NIL;
            SubLObject tuples = NIL;
            SubLObject index = NIL;
            list_var = tuple_groups;
            tuples = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuples = list_var.first() , index = add(ONE_INTEGER, index)) {
                if (!index.isZero()) {
                    html_newline(UNPROVIDED);
                }
                final SubLObject first_tuple = tuples.first();
                final SubLObject infer_pred = first_tuple.first();
                final SubLObject group_qua = second(first_tuple);
                cb_show_qua_justification(infer_pred, v_term, group_qua);
                html_newline(TWO_INTEGER);
                SubLObject cdolist_list_var = tuples;
                SubLObject tuple = NIL;
                tuple = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject infer_pred_$43 = NIL;
                    SubLObject qua = NIL;
                    SubLObject argnum = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list111);
                    infer_pred_$43 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    qua = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        cb_show_inferred_gaf_arg_index_assertions_final(v_term, infer_pred_$43, qua, argnum, pred);
                    } else {
                        cdestructuring_bind_error(datum, $list111);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    tuple = cdolist_list_var.first();
                } 
            }
        } finally {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_assertions_by_predicate(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_browser.$cb_c_gaf_arg_show_arg_headerP$.currentBinding(thread);
        try {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.bind(NIL, thread);
            final SubLObject ontology_horizon = getf($cb_inferred_index_filters$.getDynamicValue(thread), $ONTOLOGY_HORIZON, UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject tuples = NIL;
            SubLObject index = NIL;
            list_var = tuple_groups;
            tuples = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuples = list_var.first() , index = add(ONE_INTEGER, index)) {
                SubLObject last_qua = NIL;
                SubLObject list_var_$44 = NIL;
                SubLObject tuple = NIL;
                SubLObject tuple_index = NIL;
                list_var_$44 = tuples;
                tuple = list_var_$44.first();
                for (tuple_index = ZERO_INTEGER; NIL != list_var_$44; list_var_$44 = list_var_$44.rest() , tuple = list_var_$44.first() , tuple_index = add(ONE_INTEGER, tuple_index)) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject infer_pred = NIL;
                    SubLObject qua = NIL;
                    SubLObject argnum = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list111);
                    infer_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    qua = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list111);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (!qua.equal(last_qua)) {
                            if ((!index.isZero()) || (!tuple_index.isZero())) {
                                html_newline(UNPROVIDED);
                            }
                            if ($SELF != ontology_horizon) {
                                cb_show_qua_justification(infer_pred, v_term, qua);
                                html_newline(UNPROVIDED);
                            }
                        }
                        cb_show_inferred_gaf_arg_index_assertions_final(v_term, infer_pred, qua, argnum, pred);
                        last_qua = qua;
                    } else {
                        cdestructuring_bind_error(datum, $list111);
                    }
                }
            }
        } finally {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_inferred_gaf_arg_index_assertions_final(final SubLObject v_term, final SubLObject infer_pred, final SubLObject qua, final SubLObject argnum, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (infer_pred.eql($QUERY_ISA)) {
            cb_show_term(pred, UNPROVIDED, UNPROVIDED);
            if (!argnum.numE(ONE_INTEGER)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str112$_arg_S, argnum);
            }
            html_princ($$$_query);
            html_indent(UNPROVIDED);
            cb_link($LITERAL_QUERY, v_term, argnum, pred, $$EverythingPSC, UNPROVIDED);
            html_newline(UNPROVIDED);
        } else {
            final SubLObject filters = $cb_inferred_index_filters$.getDynamicValue(thread);
            final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(browsing_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                cb_browser.cb_c_gaf_arg_internal(qua, argnum, pred, NIL);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject hl_support_module_for_predicate(final SubLObject predicate) {
        return list_utilities.alist_lookup_without_values($predicate_support_module_map$.getGlobalValue(), predicate, symbol_function(EQUAL), $QUERY);
    }

    public static SubLObject cb_show_qua_justification(SubLObject infer_pred, final SubLObject v_term, final SubLObject qua) {
        final SubLObject leader = (NIL != kb_utilities.kbeq(infer_pred, $$equals)) ? $$$on_ : $$$via_;
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(leader);
        html_indent(UNPROVIDED);
        if (NIL != kb_utilities.kbeq(infer_pred, $$equals)) {
            html_princ($$$the_term);
        } else {
            cb_show_term(qua, ZERO_INTEGER, NIL);
        }
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL == kb_utilities.kbeq(infer_pred, $$equals)) {
            if (infer_pred == $QUERY_ISA) {
                infer_pred = $$isa;
            }
            final SubLObject sentence = make_binary_formula(infer_pred, v_term, qua);
            final SubLObject module = hl_support_module_for_predicate(infer_pred);
            final SubLObject support = arguments.make_hl_support(module, sentence, $$EverythingPSC, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_superscript_head$.getGlobalValue());
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_link($HL_SUPPORT, support, $NONE, $str237$___, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
            return support;
        }
        return NIL;
    }

    public static SubLObject filter_gaf_arg_index_tuples(final SubLObject tuples, SubLObject match_qua, SubLObject match_argnum, SubLObject match_pred) {
        if (match_qua == UNPROVIDED) {
            match_qua = NIL;
        }
        if (match_argnum == UNPROVIDED) {
            match_argnum = NIL;
        }
        if (match_pred == UNPROVIDED) {
            match_pred = NIL;
        }
        if (((NIL == match_qua) && (NIL == match_argnum)) && (NIL == match_pred)) {
            return tuples;
        }
        SubLObject result_tuples = NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject infer_pred = NIL;
            SubLObject qua = NIL;
            SubLObject argnum = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list111);
            infer_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list111);
            qua = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list111);
            argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list111);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((((NIL == match_qua) || qua.equal(match_qua)) && ((NIL == match_argnum) || argnum.equal(match_argnum))) && ((NIL == match_pred) || pred.equal(match_pred))) {
                    result_tuples = cons(tuple, result_tuples);
                }
            } else {
                cdestructuring_bind_error(datum, $list111);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(result_tuples);
    }

    public static SubLObject cb_inferred_index_definitional_information(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_inferred_index_filters$.currentBinding(thread);
        try {
            $cb_inferred_index_filters$.bind(inferred_index_definitional_information_override($cb_inferred_index_filters$.getDynamicValue(thread), fort), thread);
            cb_inferred_gaf_arg_assertions_guts(fort, fort, NIL, NIL);
        } finally {
            $cb_inferred_index_filters$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject inferred_index_definitional_information_override(SubLObject filters, final SubLObject fort) {
        filters = copy_list(filters);
        final SubLObject predicates = cb_definitional_preds_for_fort(fort);
        filters = putf(filters, $ALLOW_PREDICATES, predicates);
        filters = putf(filters, $ALLOW_PREDICATE_TYPES, NIL);
        filters = putf(filters, $FORBID_PREDICATES, NIL);
        filters = putf(filters, $FORBID_PREDICATE_TYPES, $list238);
        return filters;
    }

    public static SubLObject cb_term_type_header_with_gaf_entry(final SubLObject v_term, SubLObject gaf_entry_properties) {
        if (gaf_entry_properties == UNPROVIDED) {
            gaf_entry_properties = NIL;
        }
        cb_term_type_header(v_term, FIVE_INTEGER);
        if (NIL != forts.fort_p(v_term)) {
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_superscript_head$.getGlobalValue());
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_gaf_entry_widget_links($str243$gaf_entry, $str244$___, $str245$___);
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
            if (NIL != cure_api.$cb_show_cure_link$.getGlobalValue()) {
                html_indent(UNPROVIDED);
                cure_api.cb_possibly_add_cure_link(v_term, cconcatenate($$$Open_the_CURE_on_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(v_term)), $str247$_to_add_more_facts_ }), UNPROVIDED);
            }
            html_newline(TWO_INTEGER);
            cb_gaf_entry_widget(v_term, gaf_entry_properties);
        }
        return NIL;
    }

    public static SubLObject cb_term_type_header(final SubLObject v_term, SubLObject baseline_size) {
        if (baseline_size == UNPROVIDED) {
            baseline_size = FIVE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cb_tools.cb_bookmarks_supported_for_current_user()) {
            cb_browser.cb_add_bookmark_term_link(v_term);
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        final SubLObject size_val = baseline_size;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_browser.cb_c_type(v_term);
            html_princ($str248$___);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL != nart_handles.nart_p(v_term)) {
            html_newline(UNPROVIDED);
        }
        final SubLObject size = cb_term_font_size(v_term, baseline_size, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        final SubLObject size_val2 = size;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val2) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val2);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_show_term(v_term, ZERO_INTEGER, T);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
            html_princ($str249$__);
        }
        return v_term;
    }

    public static SubLObject cb_gaf_entry_widget_links(SubLObject name, SubLObject show_text, SubLObject hide_text) {
        if (name == UNPROVIDED) {
            name = $str243$gaf_entry;
        }
        if (show_text == UNPROVIDED) {
            show_text = $str244$___;
        }
        if (hide_text == UNPROVIDED) {
            hide_text = $str245$___;
        }
        dhtml_macros.dhtml_switch_visibility_links(name, show_text, hide_text);
        return NIL;
    }

    public static SubLObject cb_gaf_entry_widget(final SubLObject fort, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$45 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list250);
            current_$45 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list250);
            if (NIL == member(current_$45, $list251, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$45 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list250);
        }
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : $str243$gaf_entry;
        final SubLObject pred_tail = property_list_member($PRED, current);
        final SubLObject pred = (NIL != pred_tail) ? cadr(pred_tail) : NIL;
        final SubLObject argnum_tail = property_list_member($ARGNUM, current);
        final SubLObject argnum = (NIL != argnum_tail) ? cadr(argnum_tail) : NIL;
        final SubLObject text_width = $int$200;
        dhtml_macros.dhtml_set_switched_visibility(name, $INVISIBLE, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            dhtml_macros.dhtml_set_switched_visibility($str258$unary_frame, $INVISIBLE, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str258$unary_frame);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject frame_name_var = cb_frame_name(NIL);
                html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$post);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str259$cb_handle_gaf_entry, T, UNPROVIDED);
                    html_hidden_input($str260$implicit_arg1, cb_fort_identifier(fort), UNPROVIDED);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($MIDDLE));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link($str261$unary_frame_pred, $$$unary_predicate, $$UnaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str86$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($str264$binary_frame, $str258$unary_frame));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str265$_arg2);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($BOTTOM));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_submit_input($$$Assert, $str258$unary_frame, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list(new SubLObject[]{ $INPUT_NAME, $str261$unary_frame_pred, $COMPLETE_TYPE, $$UnaryPredicate, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width }));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility($str264$binary_frame, $VISIBLE, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str264$binary_frame);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject frame_name_var = cb_frame_name(NIL);
                html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$post);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str259$cb_handle_gaf_entry, T, UNPROVIDED);
                    html_hidden_input($str260$implicit_arg1, cb_fort_identifier(fort), UNPROVIDED);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($MIDDLE));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link($str273$binary_frame_pred, $$$binary_predicate, $$BinaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($$$binary, $str264$binary_frame));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str277$_arg1);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_complete.html_complete_link($str278$binary_frame_arg2, $$$arg2, $$Thing, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str86$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($str258$unary_frame, $str264$binary_frame));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($CLOSE_RED);
                                                final SubLObject align = $TOP;
                                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($CLOSE_RED);
                                                final SubLObject border = ZERO_INTEGER;
                                                html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(image_src);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != alt) {
                                                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(alt);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != align) {
                                                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align(align));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != border) {
                                                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(border);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($$$ternary, $str264$binary_frame));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str282$_arg3);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($RIGHT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($BOTTOM));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_submit_input($$$Assert, $str264$binary_frame, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list(new SubLObject[]{ $INPUT_NAME, $str273$binary_frame_pred, $COMPLETE_TYPE, $$BinaryPredicate, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width }));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, $str278$binary_frame_arg2, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility($$$binary, $INVISIBLE, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$binary);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject frame_name_var = cb_frame_name(NIL);
                html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$post);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str259$cb_handle_gaf_entry, T, UNPROVIDED);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($MIDDLE));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link($str283$binary_pred, $$$binary_predicate, $$BinaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str86$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_complete.html_complete_link($str284$binary_arg1, $$$arg1, $$Thing, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str86$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($str264$binary_frame, $$$binary));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($CLOSE_RED);
                                                final SubLObject align = $TOP;
                                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($CLOSE_RED);
                                                final SubLObject border = ZERO_INTEGER;
                                                html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(image_src);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != alt) {
                                                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(alt);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != align) {
                                                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align(align));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != border) {
                                                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(border);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                                }
                                                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link($str286$binary_arg2, $$$arg2, $$Thing, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($$$ternary, $$$binary));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str282$_arg3);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($BOTTOM));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_submit_input($$$Assert, $$$binary, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list(new SubLObject[]{ $INPUT_NAME, $str283$binary_pred, $COMPLETE_TYPE, $$BinaryPredicate, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width }));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, $str284$binary_arg1, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, $str286$binary_arg2, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility($$$ternary, $INVISIBLE, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$ternary);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject frame_name_var = cb_frame_name(NIL);
                html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$post);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str259$cb_handle_gaf_entry, T, UNPROVIDED);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($MIDDLE));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link($str287$ternary_pred, $$$ternary_predicate, $$TernaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str86$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_complete.html_complete_link($str290$ternary_arg1, $$$arg1, $$Thing, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_complete.html_complete_link($str291$ternary_arg2, $$$arg2, $$Thing, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str86$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_complete.html_complete_link($str292$ternary_arg3, $$$arg3, $$Thing, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str86$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_complete.javascript_void_url());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(dhtml_macros.dhtml_change_visible_section_onclick($$$binary, $$$ternary));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($CLOSE_RED);
                                                final SubLObject align = $TOP;
                                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($CLOSE_RED);
                                                final SubLObject border = ZERO_INTEGER;
                                                html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(image_src);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != alt) {
                                                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(alt);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != align) {
                                                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align(align));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != border) {
                                                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(border);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                                }
                                                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_princ($str294$_arg4);
                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($BOTTOM));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_submit_input($$$Assert, $$$ternary, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list(new SubLObject[]{ $INPUT_NAME, $str287$ternary_pred, $COMPLETE_TYPE, $$TernaryPredicate, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width }));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, $str290$ternary_arg1, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, $str291$ternary_arg2, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, $str292$ternary_arg3, $CLEAR_LABEL, NIL, $COMPLETE_LABEL, NIL, $WIDTH, text_width));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return fort;
    }

    public static SubLObject cb_handle_gaf_entry(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = cb_extract_gaf_entry_sentence(args);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return cb_show_gaf_entry_error(error);
        }
        return cb_assertion_editor.cb_assert_internal($DEFAULT, NIL, sentence, UNPROVIDED);
    }

    public static SubLObject cb_extract_gaf_entry_sentence(final SubLObject args) {
        if (NIL != html_extract_input($str258$unary_frame, args)) {
            final SubLObject pred = cb_guess_term(html_extract_input($str261$unary_frame_pred, args), UNPROVIDED);
            final SubLObject arg1 = cb_guess_term(html_extract_input($str260$implicit_arg1, args), UNPROVIDED);
            if (NIL == pred) {
                return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str261$unary_frame_pred, args)), $$$_did_not_specify_a_term));
            }
            if (NIL == arg1) {
                return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str260$implicit_arg1, args)), $$$_did_not_specify_a_term));
            }
            final SubLObject sentence = make_unary_formula(pred, arg1);
            return values(sentence, NIL);
        } else
            if (NIL != html_extract_input($str264$binary_frame, args)) {
                final SubLObject pred = cb_guess_term(html_extract_input($str273$binary_frame_pred, args), UNPROVIDED);
                final SubLObject arg1 = cb_guess_term(html_extract_input($str260$implicit_arg1, args), UNPROVIDED);
                final SubLObject arg2 = cb_guess_term(html_extract_input($str278$binary_frame_arg2, args), UNPROVIDED);
                if (NIL == pred) {
                    return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str273$binary_frame_pred, args)), $$$_did_not_specify_a_term));
                }
                if (NIL == arg1) {
                    return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str260$implicit_arg1, args)), $$$_did_not_specify_a_term));
                }
                if (NIL == arg2) {
                    return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str278$binary_frame_arg2, args)), $$$_did_not_specify_a_term));
                }
                final SubLObject sentence2 = make_binary_formula(pred, arg1, arg2);
                return values(sentence2, NIL);
            } else
                if (NIL != html_extract_input($$$binary, args)) {
                    final SubLObject pred = cb_guess_term(html_extract_input($str283$binary_pred, args), UNPROVIDED);
                    final SubLObject arg1 = cb_guess_term(html_extract_input($str284$binary_arg1, args), UNPROVIDED);
                    final SubLObject arg2 = cb_guess_term(html_extract_input($str286$binary_arg2, args), UNPROVIDED);
                    if (NIL == pred) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str283$binary_pred, args)), $$$_did_not_specify_a_term));
                    }
                    if (NIL == arg1) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str284$binary_arg1, args)), $$$_did_not_specify_a_term));
                    }
                    if (NIL == arg2) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str286$binary_arg2, args)), $$$_did_not_specify_a_term));
                    }
                    final SubLObject sentence2 = make_binary_formula(pred, arg1, arg2);
                    return values(sentence2, NIL);
                } else {
                    if (NIL == html_extract_input($$$ternary, args)) {
                        return values(NIL, $$$Unexpected_sentence_entry_method);
                    }
                    final SubLObject pred = cb_guess_term(html_extract_input($str287$ternary_pred, args), UNPROVIDED);
                    final SubLObject arg1 = cb_guess_term(html_extract_input($str290$ternary_arg1, args), UNPROVIDED);
                    final SubLObject arg2 = cb_guess_term(html_extract_input($str291$ternary_arg2, args), UNPROVIDED);
                    final SubLObject arg3 = cb_guess_term(html_extract_input($str292$ternary_arg3, args), UNPROVIDED);
                    if (NIL == pred) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str287$ternary_pred, args)), $$$_did_not_specify_a_term));
                    }
                    if (NIL == arg1) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str290$ternary_arg1, args)), $$$_did_not_specify_a_term));
                    }
                    if (NIL == arg2) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str291$ternary_arg2, args)), $$$_did_not_specify_a_term));
                    }
                    if (NIL == arg3) {
                        return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(html_extract_input($str292$ternary_arg3, args)), $$$_did_not_specify_a_term));
                    }
                    final SubLObject sentence3 = make_ternary_formula(pred, arg1, arg2, arg3);
                    return values(sentence3, NIL);
                }


    }

    public static SubLObject cb_show_gaf_entry_error(final SubLObject error) {
        return cb_error($str299$_A, error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject dhtml_highlight_icon_on_mouseover(final SubLObject dim_icon, final SubLObject bright_icon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dim_id = cconcatenate($str300$dim_, format_nil.format_nil_a_no_copy(random.random($int$10000)));
        final SubLObject bright_id = cconcatenate($str300$dim_, format_nil.format_nil_a_no_copy(random.random($int$10000)));
        final SubLObject dim_src = cyc_file_dependencies.cb_icon_file_path(dim_icon);
        final SubLObject bright_src = cyc_file_dependencies.cb_icon_file_path(bright_icon);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_complete.javascript_void_url());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(cconcatenate($str302$setVisibility__, new SubLObject[]{ format_nil.format_nil_a_no_copy(bright_id), $str303$___inline___setVisibility__, format_nil.format_nil_a_no_copy(dim_id), $str304$___none___ }));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(cconcatenate($str302$setVisibility__, new SubLObject[]{ format_nil.format_nil_a_no_copy(dim_id), $str303$___inline___setVisibility__, format_nil.format_nil_a_no_copy(bright_id), $str304$___none___ }));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(dim_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != dim_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(dim_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(bright_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != bright_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(bright_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_cb_inferred_index_file() {
        declareFunction(me, "cb_inferred_index_frame", "CB-INFERRED-INDEX-FRAME", 1, 0, false);
        declareFunction(me, "cb_link_inferred_index", "CB-LINK-INFERRED-INDEX", 1, 2, false);
        declareFunction(me, "cb_legacy_index_frame", "CB-LEGACY-INDEX-FRAME", 1, 0, false);
        declareFunction(me, "cb_link_legacy_index", "CB-LINK-LEGACY-INDEX", 1, 2, false);
        declareFunction(me, "cb_inferred_index", "CB-INFERRED-INDEX", 1, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index_utilities_section", "CB-SHOW-INFERRED-GAF-ARG-INDEX-UTILITIES-SECTION", 1, 0, false);
        declareFunction(me, "cb_possibly_show_term_as_seen_from_mt_header", "CB-POSSIBLY-SHOW-TERM-AS-SEEN-FROM-MT-HEADER", 1, 1, false);
        declareFunction(me, "cb_show_term_as_seen_from_mt_header", "CB-SHOW-TERM-AS-SEEN-FROM-MT-HEADER", 1, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index_header", "CB-SHOW-INFERRED-GAF-ARG-INDEX-HEADER", 3, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index", "CB-SHOW-INFERRED-GAF-ARG-INDEX", 1, 2, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index_by_ontology", "CB-SHOW-INFERRED-GAF-ARG-INDEX-BY-ONTOLOGY", 2, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index_by_predicate", "CB-SHOW-INFERRED-GAF-ARG-INDEX-BY-PREDICATE", 2, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index_all_assertions_line", "CB-SHOW-INFERRED-GAF-ARG-INDEX-ALL-ASSERTIONS-LINE", 2, 0, false);
        declareFunction(me, "cb_show_inferred_index_count", "CB-SHOW-INFERRED-INDEX-COUNT", 1, 1, false);
        declareFunction(me, "cb_make_inferred_gaf_arg_index_tuples_object_id", "CB-MAKE-INFERRED-GAF-ARG-INDEX-TUPLES-OBJECT-ID", 1, 1, false);
        declareFunction(me, "cb_link_literal_query", "CB-LINK-LITERAL-QUERY", 3, 1, false);
        declareFunction(me, "cb_show_inferred_index_literal_query_linkP", "CB-SHOW-INFERRED-INDEX-LITERAL-QUERY-LINK?", 3, 0, false);
        declareFunction(me, "cb_link_hier_brow", "CB-LINK-HIER-BROW", 3, 1, false);
        declareFunction(me, "cb_show_inferred_index_hierarchy_browser_linkP", "CB-SHOW-INFERRED-INDEX-HIERARCHY-BROWSER-LINK?", 3, 0, false);
        declareFunction(me, "cb_inferred_index_order_by", "CB-INFERRED-INDEX-ORDER-BY", 1, 0, false);
        declareFunction(me, "cb_link_inferred_index_order_by", "CB-LINK-INFERRED-INDEX-ORDER-BY", 3, 0, false);
        declareFunction(me, "cb_inferred_index_visibility", "CB-INFERRED-INDEX-VISIBILITY", 1, 0, false);
        declareFunction(me, "cb_link_inferred_index_toggle_visibility", "CB-LINK-INFERRED-INDEX-TOGGLE-VISIBILITY", 1, 0, false);
        declareFunction(me, "cb_inferred_index_predicate_filters", "CB-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        declareFunction(me, "cb_link_inferred_index_predicate_filters", "CB-LINK-INFERRED-INDEX-PREDICATE-FILTERS", 0, 2, false);
        declareFunction(me, "cb_inferred_index_predicate_filters_guts", "CB-INFERRED-INDEX-PREDICATE-FILTERS-GUTS", 1, 0, false);
        declareFunction(me, "cb_inferred_index_predicate_type_filter_remove_allow_checkbox", "CB-INFERRED-INDEX-PREDICATE-TYPE-FILTER-REMOVE-ALLOW-CHECKBOX", 1, 0, false);
        declareFunction(me, "cb_inferred_index_predicate_type_filter_remove_forbid_checkbox", "CB-INFERRED-INDEX-PREDICATE-TYPE-FILTER-REMOVE-FORBID-CHECKBOX", 1, 0, false);
        declareFunction(me, "cb_inferred_index_predicate_filter_forbid_checkbox", "CB-INFERRED-INDEX-PREDICATE-FILTER-FORBID-CHECKBOX", 1, 0, false);
        declareFunction(me, "cb_inferred_index_predicate_filter_allow_checkbox", "CB-INFERRED-INDEX-PREDICATE-FILTER-ALLOW-CHECKBOX", 1, 0, false);
        declareFunction(me, "cb_handle_inferred_index_predicate_filters", "CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        declareFunction(me, "cb_extract_inferred_index_predicate_filters", "CB-EXTRACT-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        declareFunction(me, "cb_clear_inferred_index_predicate_filters", "CB-CLEAR-INFERRED-INDEX-PREDICATE-FILTERS", 0, 0, false);
        declareFunction(me, "cb_update_inferred_index_predicate_filters", "CB-UPDATE-INFERRED-INDEX-PREDICATE-FILTERS", 6, 0, false);
        declareFunction(me, "cb_inferred_index_ontology_filters", "CB-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        declareFunction(me, "cb_link_inferred_index_ontology_filters", "CB-LINK-INFERRED-INDEX-ONTOLOGY-FILTERS", 0, 2, false);
        declareFunction(me, "cb_inferred_index_ontology_filters_guts", "CB-INFERRED-INDEX-ONTOLOGY-FILTERS-GUTS", 1, 0, false);
        declareFunction(me, "cb_inferred_index_ontology_horizon_radio_button", "CB-INFERRED-INDEX-ONTOLOGY-HORIZON-RADIO-BUTTON", 2, 0, false);
        declareFunction(me, "cb_handle_inferred_index_ontology_filters", "CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        declareFunction(me, "cb_show_ontology_horizon_term", "CB-SHOW-ONTOLOGY-HORIZON-TERM", 1, 0, false);
        declareFunction(me, "cb_extract_inferred_index_ontology_horizon", "CB-EXTRACT-INFERRED-INDEX-ONTOLOGY-HORIZON", 1, 0, false);
        declareFunction(me, "cb_update_inferred_index_ontology_filters", "CB-UPDATE-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        declareFunction(me, "cb_inferred_index_microtheory_filters", "CB-INFERRED-INDEX-MICROTHEORY-FILTERS", 1, 0, false);
        declareFunction(me, "cb_link_inferred_index_microtheory_filters", "CB-LINK-INFERRED-INDEX-MICROTHEORY-FILTERS", 0, 2, false);
        declareFunction(me, "cb_set_microtheory_browsing_filter", "CB-SET-MICROTHEORY-BROWSING-FILTER", 1, 0, false);
        declareFunction(me, "cb_link_inferred_gaf_arg_assertions", "CB-LINK-INFERRED-GAF-ARG-ASSERTIONS", 2, 3, false);
        declareFunction(me, "cb_inferred_gaf_arg_assertions", "CB-INFERRED-GAF-ARG-ASSERTIONS", 1, 0, false);
        declareFunction(me, "cb_inferred_gaf_arg_assertions_guts", "CB-INFERRED-GAF-ARG-ASSERTIONS-GUTS", 4, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_assertions_by_ontology", "CB-SHOW-INFERRED-GAF-ARG-ASSERTIONS-BY-ONTOLOGY", 2, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_assertions_by_predicate", "CB-SHOW-INFERRED-GAF-ARG-ASSERTIONS-BY-PREDICATE", 2, 0, false);
        declareFunction(me, "cb_show_inferred_gaf_arg_index_assertions_final", "CB-SHOW-INFERRED-GAF-ARG-INDEX-ASSERTIONS-FINAL", 5, 0, false);
        declareFunction(me, "hl_support_module_for_predicate", "HL-SUPPORT-MODULE-FOR-PREDICATE", 1, 0, false);
        declareFunction(me, "cb_show_qua_justification", "CB-SHOW-QUA-JUSTIFICATION", 3, 0, false);
        declareFunction(me, "filter_gaf_arg_index_tuples", "FILTER-GAF-ARG-INDEX-TUPLES", 1, 3, false);
        declareFunction(me, "cb_inferred_index_definitional_information", "CB-INFERRED-INDEX-DEFINITIONAL-INFORMATION", 1, 0, false);
        declareFunction(me, "inferred_index_definitional_information_override", "INFERRED-INDEX-DEFINITIONAL-INFORMATION-OVERRIDE", 2, 0, false);
        declareFunction(me, "cb_term_type_header_with_gaf_entry", "CB-TERM-TYPE-HEADER-WITH-GAF-ENTRY", 1, 1, false);
        declareFunction(me, "cb_term_type_header", "CB-TERM-TYPE-HEADER", 1, 1, false);
        declareFunction(me, "cb_gaf_entry_widget_links", "CB-GAF-ENTRY-WIDGET-LINKS", 0, 3, false);
        declareFunction(me, "cb_gaf_entry_widget", "CB-GAF-ENTRY-WIDGET", 1, 1, false);
        declareFunction(me, "cb_handle_gaf_entry", "CB-HANDLE-GAF-ENTRY", 1, 0, false);
        declareFunction(me, "cb_extract_gaf_entry_sentence", "CB-EXTRACT-GAF-ENTRY-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_show_gaf_entry_error", "CB-SHOW-GAF-ENTRY-ERROR", 1, 0, false);
        declareFunction(me, "dhtml_highlight_icon_on_mouseover", "DHTML-HIGHLIGHT-ICON-ON-MOUSEOVER", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_inferred_index_file() {
        defvar("*CB-INFERRED-INDEX-ORDER-BY*", $ONTOLOGY);
        defvar("*CB-INFERRED-INDEX-FILTERS*", NIL);
        defvar("*CB-INFERRED-INDEX-VISIBILITY*", $INVISIBLE);
        deflexical("*PREDICATE-SUPPORT-MODULE-MAP*", $list229);
        return NIL;
    }

    public static SubLObject setup_cb_inferred_index_file() {
        register_html_state_variable($cb_inferred_index_order_by$);
        register_html_interface_variable($cb_inferred_index_order_by$);
        register_html_state_variable($cb_inferred_index_filters$);
        register_html_interface_variable($cb_inferred_index_filters$);
        register_html_state_variable($cb_inferred_index_visibility$);
        register_html_interface_variable($cb_inferred_index_visibility$);
        html_macros.note_cgi_handler_function(CB_INFERRED_INDEX_FRAME, $HTML_HANDLER);
        setup_cb_link_method($INFERRED_INDEX, CB_LINK_INFERRED_INDEX, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_LEGACY_INDEX_FRAME, $HTML_HANDLER);
        setup_cb_link_method($LEGACY_INDEX, CB_LINK_LEGACY_INDEX, THREE_INTEGER);
        setup_cb_link_method($LITERAL_QUERY, CB_LINK_LITERAL_QUERY, FOUR_INTEGER);
        setup_cb_link_method($HIER_BROW, CB_LINK_HIER_BROW, FOUR_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERRED_INDEX_ORDER_BY, $HTML_HANDLER);
        setup_cb_link_method($INFERRED_INDEX_ORDER_BY, CB_LINK_INFERRED_INDEX_ORDER_BY, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERRED_INDEX_VISIBILITY, $HTML_HANDLER);
        setup_cb_link_method($INFERRED_INDEX_TOGGLE_VISIBILITY, CB_LINK_INFERRED_INDEX_TOGGLE_VISIBILITY, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERRED_INDEX_PREDICATE_FILTERS, $HTML_HANDLER);
        setup_cb_link_method($INFERRED_INDEX_PREDICATE_FILTERS, CB_LINK_INFERRED_INDEX_PREDICATE_FILTERS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_INFERRED_INDEX_PREDICATE_FILTERS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_INFERRED_INDEX_ONTOLOGY_FILTERS, $HTML_HANDLER);
        setup_cb_link_method($INFERRED_INDEX_ONTOLOGY_FILTERS, CB_LINK_INFERRED_INDEX_ONTOLOGY_FILTERS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_INFERRED_INDEX_ONTOLOGY_FILTERS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_INFERRED_INDEX_MICROTHEORY_FILTERS, $HTML_HANDLER);
        setup_cb_link_method($INFERRED_INDEX_MICROTHEORY_FILTERS, CB_LINK_INFERRED_INDEX_MICROTHEORY_FILTERS, TWO_INTEGER);
        setup_cb_link_method($INFERRED_GAF_ARG_ASSERTIONS, CB_LINK_INFERRED_GAF_ARG_ASSERTIONS, FIVE_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERRED_GAF_ARG_ASSERTIONS, $HTML_HANDLER);
        sethash($CLOSE_RED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str240$red_x_close_15_gif, NIL));
        sethash($CLOSE_RED_DIM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str242$dim_red_x_close_15_gif, NIL));
        html_macros.note_cgi_handler_function(CB_HANDLE_GAF_ENTRY, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_inferred_index_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_inferred_index_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_inferred_index_file();
    }

    
}

/**
 * Total time: 9127 ms
 */
