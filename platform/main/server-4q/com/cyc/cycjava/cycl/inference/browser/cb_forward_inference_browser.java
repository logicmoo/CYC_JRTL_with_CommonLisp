package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_assertion_history$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_sentence_browser;
import com.cyc.cycjava.cycl.cb_web_services;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_forward_inference_browser extends SubLTranslatedFile {
    public static final SubLFile me = new cb_forward_inference_browser();

    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser";

    public static final String myFingerPrint = "8368e68f0fd4163486b424d23b32586af7078fc39f846b659c3620bcbdbd4dfd";

    // defparameter
    private static final SubLSymbol $cb_forward_inference_clump_id_index$ = makeSymbol("*CB-FORWARD-INFERENCE-CLUMP-ID-INDEX*");

    // defparameter
    private static final SubLSymbol $cb_forward_inference_browser_show_focus_sectionsP$ = makeSymbol("*CB-FORWARD-INFERENCE-BROWSER-SHOW-FOCUS-SECTIONS?*");

    // defparameter
    private static final SubLSymbol $cb_forward_inference_browser_show_el_queriesP$ = makeSymbol("*CB-FORWARD-INFERENCE-BROWSER-SHOW-EL-QUERIES?*");

    // defconstant
    public static final SubLSymbol $dtp_forward_inference_clump$ = makeSymbol("*DTP-FORWARD-INFERENCE-CLUMP*");

    // defconstant
    public static final SubLSymbol $dtp_forward_inference_info$ = makeSymbol("*DTP-FORWARD-INFERENCE-INFO*");



    // Internal Constants
    public static final SubLSymbol FORWARD_INFERENCE_CLUMP = makeSymbol("FORWARD-INFERENCE-CLUMP");

    public static final SubLSymbol FORWARD_INFERENCE_CLUMP_P = makeSymbol("FORWARD-INFERENCE-CLUMP-P");

    public static final SubLList $list2 = list(makeSymbol("ID"), makeSymbol("TIMESTAMP"), makeSymbol("TRIGGERING-ASSERTION"), makeSymbol("INFERENCE-INFOS"));

    public static final SubLList $list3 = list(makeKeyword("ID"), makeKeyword("TIMESTAMP"), makeKeyword("TRIGGERING-ASSERTION"), makeKeyword("INFERENCE-INFOS"));

    public static final SubLList $list4 = list(makeSymbol("FWD-INF-CLUMP-ID"), makeSymbol("FWD-INF-CLUMP-TIMESTAMP"), makeSymbol("FWD-INF-CLUMP-TRIGGERING-ASSERTION"), makeSymbol("FWD-INF-CLUMP-INFERENCE-INFOS"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FWD-INF-CLUMP-ID"), makeSymbol("_CSETF-FWD-INF-CLUMP-TIMESTAMP"), makeSymbol("_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION"), makeSymbol("_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS"));



    public static final SubLSymbol FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-INFERENCE-CLUMP-P"));

    private static final SubLSymbol FWD_INF_CLUMP_ID = makeSymbol("FWD-INF-CLUMP-ID");

    private static final SubLSymbol _CSETF_FWD_INF_CLUMP_ID = makeSymbol("_CSETF-FWD-INF-CLUMP-ID");

    private static final SubLSymbol FWD_INF_CLUMP_TIMESTAMP = makeSymbol("FWD-INF-CLUMP-TIMESTAMP");

    private static final SubLSymbol _CSETF_FWD_INF_CLUMP_TIMESTAMP = makeSymbol("_CSETF-FWD-INF-CLUMP-TIMESTAMP");

    private static final SubLSymbol FWD_INF_CLUMP_TRIGGERING_ASSERTION = makeSymbol("FWD-INF-CLUMP-TRIGGERING-ASSERTION");

    private static final SubLSymbol _CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION = makeSymbol("_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION");

    private static final SubLSymbol FWD_INF_CLUMP_INFERENCE_INFOS = makeSymbol("FWD-INF-CLUMP-INFERENCE-INFOS");

    private static final SubLSymbol _CSETF_FWD_INF_CLUMP_INFERENCE_INFOS = makeSymbol("_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FORWARD_INFERENCE_CLUMP = makeSymbol("MAKE-FORWARD-INFERENCE-CLUMP");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD");



    private static final SubLList $list28 = list(list(makeSymbol("INFERENCE-INFO"), makeSymbol("CLUMP"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list29 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = makeSymbol("FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");

    private static final SubLSymbol FORWARD_INFERENCE_INFO_P = makeSymbol("FORWARD-INFERENCE-INFO-P");

    private static final SubLSymbol FORWARD_INFERENCE_INFO = makeSymbol("FORWARD-INFERENCE-INFO");

    private static final SubLList $list36 = list(makeSymbol("INFERENCE"), makeSymbol("RULE"), makeSymbol("MORE-INFO"));

    private static final SubLList $list37 = list(makeKeyword("INFERENCE"), makeKeyword("RULE"), makeKeyword("MORE-INFO"));

    private static final SubLList $list38 = list(makeSymbol("FWD-INF-INFO-INFERENCE"), makeSymbol("FWD-INF-INFO-RULE"), makeSymbol("FWD-INF-INFO-MORE-INFO"));

    private static final SubLList $list39 = list(makeSymbol("_CSETF-FWD-INF-INFO-INFERENCE"), makeSymbol("_CSETF-FWD-INF-INFO-RULE"), makeSymbol("_CSETF-FWD-INF-INFO-MORE-INFO"));

    private static final SubLSymbol FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list41 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-INFERENCE-INFO-P"));

    private static final SubLSymbol FWD_INF_INFO_INFERENCE = makeSymbol("FWD-INF-INFO-INFERENCE");

    private static final SubLSymbol _CSETF_FWD_INF_INFO_INFERENCE = makeSymbol("_CSETF-FWD-INF-INFO-INFERENCE");

    private static final SubLSymbol FWD_INF_INFO_RULE = makeSymbol("FWD-INF-INFO-RULE");

    private static final SubLSymbol _CSETF_FWD_INF_INFO_RULE = makeSymbol("_CSETF-FWD-INF-INFO-RULE");

    private static final SubLSymbol FWD_INF_INFO_MORE_INFO = makeSymbol("FWD-INF-INFO-MORE-INFO");

    private static final SubLSymbol _CSETF_FWD_INF_INFO_MORE_INFO = makeSymbol("_CSETF-FWD-INF-INFO-MORE-INFO");







    private static final SubLSymbol MAKE_FORWARD_INFERENCE_INFO = makeSymbol("MAKE-FORWARD-INFERENCE-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD");



    public static final SubLSymbol $cb_current_forward_inference_clump$ = makeSymbol("*CB-CURRENT-FORWARD-INFERENCE-CLUMP*");

    private static final SubLList $list55 = list(list(makeSymbol("INFERENCE-INFO"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = makeSymbol("DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");

    private static final SubLSymbol CB_FORWARD_INFERENCE_BROWSER = makeSymbol("CB-FORWARD-INFERENCE-BROWSER");



    private static final SubLString $$$FwdInf = makeString("FwdInf");



    private static final SubLString $str61$cb_forward_inference_browser = makeString("cb-forward-inference-browser");

    private static final SubLSymbol $FORWARD_INFERENCE_BROWSER = makeKeyword("FORWARD-INFERENCE-BROWSER");

    private static final SubLSymbol CB_LINK_FORWARD_INFERENCE_BROWSER = makeSymbol("CB-LINK-FORWARD-INFERENCE-BROWSER");

    private static final SubLString $$$Forward_Inference_Browser = makeString("Forward Inference Browser");

    private static final SubLString $str65$Browse_the_most_recent_browsable_ = makeString("Browse the most recent browsable forward inference");

    private static final SubLString $str66$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str67$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str72$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str77$No_forward_inferences_to_browse_ = makeString("No forward inferences to browse.");

    private static final SubLSymbol $sym78$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str79$Last_browsable_forward_inference_ = makeString("Last browsable forward inference clump was triggered at ~a by the forward propagation of");



    private static final SubLString $str81$Successful_and_watched_results_ = makeString("Successful and watched results:");

    private static final SubLString $str82$_all = makeString("#all");

    private static final SubLString $str83$_Jump_to_all_results_ = makeString("[Jump to all results]");



    private static final SubLString $$$all = makeString("all");

    private static final SubLString $$$All_results = makeString("All results");



    private static final SubLString $str88$_ = makeString("_");





    private static final SubLString $str91$Propagating_rule__ = makeString("Propagating rule: ");

    private static final SubLString $str92$Propagating__ = makeString("Propagating: ");

    private static final SubLString $str93$_ = makeString("#");

    private static final SubLString $str94$_Next_ = makeString("[Next]");



    private static final SubLString $str96$_Jump_to_all_rules_ = makeString("[Jump to all rules]");











    private static final SubLString $str102$ = makeString("");

    private static final SubLString $$$_into_mt_ = makeString(" into mt ");





    private static final SubLList $list106 = list(makeKeyword("TYPE"), makeKeyword("ASENT"), makeKeyword("PLACEMENT-MT"));



    private static final SubLList $list108 = list(makeKeyword("SUPPORTS"), makeKeyword("PRAGMATIC-SUPPORTS"));





    private static final SubLString $str111$_d_answer__P = makeString("~d answer~:P");



    private static final SubLString $str113$___d_justification__P = makeString(", ~d justification~:P");

    private static final SubLString $str114$__No_inference_was_performed_sinc = makeString(" (No inference was performed since rule is a single literal antecedent rule)");

    private static final SubLSymbol PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = makeSymbol("PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE");

    private static final SubLSymbol BROWSING_NEW_FORWARD_INFERENCE = makeSymbol("BROWSING-NEW-FORWARD-INFERENCE");

    private static final SubLSymbol CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE = makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE");

    public static SubLObject cb_forward_inference_clump_lookup_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return id_index_lookup($cb_forward_inference_clump_id_index$.getDynamicValue(thread), id, UNPROVIDED);
    }

    public static SubLObject forward_inference_clump_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject forward_inference_clump_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$forward_inference_clump_native.class ? T : NIL;
    }

    public static SubLObject fwd_inf_clump_id(final SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fwd_inf_clump_timestamp(final SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject fwd_inf_clump_triggering_assertion(final SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject fwd_inf_clump_inference_infos(final SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_fwd_inf_clump_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fwd_inf_clump_timestamp(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fwd_inf_clump_triggering_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fwd_inf_clump_inference_infos(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : "cb_forward_inference_browser.forward_inference_clump_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_forward_inference_clump(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $forward_inference_clump_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_fwd_inf_clump_id(v_new, current_value);
            } else
                if (pcase_var.eql($TIMESTAMP)) {
                    _csetf_fwd_inf_clump_timestamp(v_new, current_value);
                } else
                    if (pcase_var.eql($TRIGGERING_ASSERTION)) {
                        _csetf_fwd_inf_clump_triggering_assertion(v_new, current_value);
                    } else
                        if (pcase_var.eql($INFERENCE_INFOS)) {
                            _csetf_fwd_inf_clump_inference_infos(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_forward_inference_clump(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORWARD_INFERENCE_CLUMP, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, fwd_inf_clump_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TIMESTAMP, fwd_inf_clump_timestamp(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIGGERING_ASSERTION, fwd_inf_clump_triggering_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $INFERENCE_INFOS, fwd_inf_clump_inference_infos(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORWARD_INFERENCE_CLUMP, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_forward_inference_clump_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_inference_clump(obj, visitor_fn);
    }

    public static SubLObject valid_forward_inference_clump_p(final SubLObject v_object) {
        return makeBoolean((NIL != forward_inference_clump_p(v_object)) && ($FREE != fwd_inf_clump_timestamp(v_object)));
    }

    public static SubLObject new_forward_inference_clump(final SubLObject triggering_assertion_or_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject clump = make_forward_inference_clump(UNPROVIDED);
        final SubLObject id = id_index_reserve($cb_forward_inference_clump_id_index$.getDynamicValue(thread));
        _csetf_fwd_inf_clump_id(clump, id);
        id_index_enter($cb_forward_inference_clump_id_index$.getDynamicValue(thread), id, clump);
        _csetf_fwd_inf_clump_timestamp(clump, get_universal_time());
        _csetf_fwd_inf_clump_triggering_assertion(clump, triggering_assertion_or_sentence);
        _csetf_fwd_inf_clump_inference_infos(clump, NIL);
        return clump;
    }

    public static SubLObject do_forward_inference_clump_inference_infos(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_info = NIL;
        SubLObject clump = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        inference_info = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        clump = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list28);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list28);
            if (NIL == member(current_$1, $list29, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list28);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(inference_info, list(FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, clump), $DONE, done), append(body, NIL));
    }

    public static SubLObject destroy_forward_inference_clump(final SubLObject clump) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_forward_inference_clump_p(clump)) {
            SubLObject cdolist_list_var = forward_inference_clump_inference_infos(clump);
            SubLObject inference_info = NIL;
            inference_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                destroy_inference_info(inference_info);
                cdolist_list_var = cdolist_list_var.rest();
                inference_info = cdolist_list_var.first();
            } 
            id_index_remove($cb_forward_inference_clump_id_index$.getDynamicValue(thread), fwd_inf_clump_id(clump));
            _csetf_fwd_inf_clump_timestamp(clump, $FREE);
            _csetf_fwd_inf_clump_triggering_assertion(clump, $FREE);
            _csetf_fwd_inf_clump_inference_infos(clump, $FREE);
        }
        return NIL;
    }

    public static SubLObject forward_inference_clump_id(final SubLObject clump) {
        return fwd_inf_clump_id(clump);
    }

    public static SubLObject forward_inference_clump_timestamp(final SubLObject clump) {
        return fwd_inf_clump_timestamp(clump);
    }

    public static SubLObject forward_inference_clump_triggering_assertion(final SubLObject clump) {
        SubLObject assertion = fwd_inf_clump_triggering_assertion(clump);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            final SubLObject found_assertion = czer_meta.find_assertion_cycl(assertion, UNPROVIDED);
            if (NIL != assertion_handles.assertion_p(found_assertion)) {
                assertion = found_assertion;
                _csetf_fwd_inf_clump_triggering_assertion(clump, assertion);
            }
        }
        return assertion;
    }

    public static SubLObject forward_inference_clump_inference_infos(final SubLObject clump) {
        return fwd_inf_clump_inference_infos(clump);
    }

    public static SubLObject add_forward_inference_info_to_clump(final SubLObject clump, final SubLObject inference_info) {
        assert NIL != forward_inference_info_p(inference_info) : "cb_forward_inference_browser.forward_inference_info_p(inference_info) " + "CommonSymbols.NIL != cb_forward_inference_browser.forward_inference_info_p(inference_info) " + inference_info;
        SubLObject inference_infos = forward_inference_clump_inference_infos(clump);
        inference_infos = append(inference_infos, list(inference_info));
        _csetf_fwd_inf_clump_inference_infos(clump, inference_infos);
        return clump;
    }

    public static SubLObject forward_inference_clump_total_answer_count(final SubLObject clump) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject inference_infos = cdolist_list_var = forward_inference_clump_inference_infos(clump);
        SubLObject inference_info = NIL;
        inference_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject inference = forward_inference_info_inference(inference_info);
            final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
            if (answer_count.isInteger()) {
                count = add(count, answer_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_info = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject forward_inference_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject forward_inference_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$forward_inference_info_native.class ? T : NIL;
    }

    public static SubLObject fwd_inf_info_inference(final SubLObject v_object) {
        assert NIL != forward_inference_info_p(v_object) : "cb_forward_inference_browser.forward_inference_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fwd_inf_info_rule(final SubLObject v_object) {
        assert NIL != forward_inference_info_p(v_object) : "cb_forward_inference_browser.forward_inference_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject fwd_inf_info_more_info(final SubLObject v_object) {
        assert NIL != forward_inference_info_p(v_object) : "cb_forward_inference_browser.forward_inference_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_fwd_inf_info_inference(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_info_p(v_object) : "cb_forward_inference_browser.forward_inference_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fwd_inf_info_rule(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_info_p(v_object) : "cb_forward_inference_browser.forward_inference_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fwd_inf_info_more_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_inference_info_p(v_object) : "cb_forward_inference_browser.forward_inference_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_forward_inference_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $forward_inference_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INFERENCE)) {
                _csetf_fwd_inf_info_inference(v_new, current_value);
            } else
                if (pcase_var.eql($RULE)) {
                    _csetf_fwd_inf_info_rule(v_new, current_value);
                } else
                    if (pcase_var.eql($MORE_INFO)) {
                        _csetf_fwd_inf_info_more_info(v_new, current_value);
                    } else {
                        Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_forward_inference_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORWARD_INFERENCE_INFO, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INFERENCE, fwd_inf_info_inference(obj));
        funcall(visitor_fn, obj, $SLOT, $RULE, fwd_inf_info_rule(obj));
        funcall(visitor_fn, obj, $SLOT, $MORE_INFO, fwd_inf_info_more_info(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORWARD_INFERENCE_INFO, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_forward_inference_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_inference_info(obj, visitor_fn);
    }

    public static SubLObject valid_forward_inference_info_p(final SubLObject v_object) {
        return makeBoolean((NIL != forward_inference_info_p(v_object)) && ($FREE != fwd_inf_info_inference(v_object)));
    }

    public static SubLObject new_forward_inference_info(final SubLObject possible_inference, final SubLObject rule, SubLObject more_info) {
        if (more_info == UNPROVIDED) {
            more_info = NIL;
        }
        if (((NIL != possible_inference) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_inference.inference_p(possible_inference))) {
            throw new AssertionError(possible_inference);
        }
        final SubLObject forward_inference_info = make_forward_inference_info(UNPROVIDED);
        _csetf_fwd_inf_info_inference(forward_inference_info, possible_inference);
        _csetf_fwd_inf_info_rule(forward_inference_info, rule);
        _csetf_fwd_inf_info_more_info(forward_inference_info, more_info);
        return forward_inference_info;
    }

    public static SubLObject destroy_inference_info(final SubLObject inference_info) {
        if (NIL != valid_forward_inference_info_p(inference_info)) {
            final SubLObject inference = forward_inference_info_inference(inference_info);
            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
            _csetf_fwd_inf_info_inference(inference_info, $FREE);
            _csetf_fwd_inf_info_rule(inference_info, $FREE);
            _csetf_fwd_inf_info_more_info(inference_info, $FREE);
        }
        return NIL;
    }

    public static SubLObject forward_inference_info_inference(final SubLObject inference_info) {
        return fwd_inf_info_inference(inference_info);
    }

    public static SubLObject forward_inference_info_rule(final SubLObject inference_info) {
        return fwd_inf_info_rule(inference_info);
    }

    public static SubLObject forward_inference_info_more_info(final SubLObject inference_info) {
        return fwd_inf_info_more_info(inference_info);
    }

    public static SubLObject inference_info_G(final SubLObject info1, final SubLObject info2) {
        return makeBoolean((!info1.eql(info2)) && (NIL == inference_info_L(info1, info2)));
    }

    public static SubLObject inference_info_L(final SubLObject info1, final SubLObject info2) {
        final SubLObject inference1 = forward_inference_info_inference(info1);
        final SubLObject inference2 = forward_inference_info_inference(info2);
        final SubLObject store1 = (NIL != inference1) ? inference_datastructures_inference.inference_problem_store(inference1) : NIL;
        final SubLObject store2 = (NIL != inference2) ? inference_datastructures_inference.inference_problem_store(inference2) : NIL;
        final SubLObject answer_count_1 = (NIL != inference1) ? inference_datastructures_inference.inference_answer_count(inference1) : ONE_INTEGER;
        final SubLObject answer_count_2 = (NIL != inference2) ? inference_datastructures_inference.inference_answer_count(inference2) : ONE_INTEGER;
        final SubLObject problem_count_1 = (NIL != store1) ? inference_datastructures_problem_store.problem_store_size(store1) : NIL;
        final SubLObject problem_count_2 = (NIL != store2) ? inference_datastructures_problem_store.problem_store_size(store2) : NIL;
        final SubLObject store_id1 = (NIL != store1) ? inference_datastructures_problem_store.problem_store_suid(store1) : NIL;
        final SubLObject store_id2 = (NIL != store2) ? inference_datastructures_problem_store.problem_store_suid(store2) : NIL;
        final SubLObject id1 = (NIL != inference1) ? inference_datastructures_inference.inference_suid(inference1) : NIL;
        final SubLObject id2 = (NIL != inference2) ? inference_datastructures_inference.inference_suid(inference2) : NIL;
        if ((NIL != subl_promotions.positive_integer_p(answer_count_1)) && answer_count_2.isZero()) {
            return NIL;
        }
        if (answer_count_1.isZero() && (NIL != subl_promotions.positive_integer_p(answer_count_2))) {
            return T;
        }
        if ((NIL == inference1) && (NIL == inference2)) {
            return numL(assertion_handles.assertion_id(forward_inference_info_rule(info2)), assertion_handles.assertion_id(forward_inference_info_rule(info2)));
        }
        if (NIL == inference1) {
            return T;
        }
        if (NIL == inference2) {
            return NIL;
        }
        if (store_id1.numL(store_id2)) {
            return NIL;
        }
        if (store_id1.numG(store_id2)) {
            return T;
        }
        if (id1.numL(id2)) {
            return NIL;
        }
        if (id1.numG(id2)) {
            return T;
        }
        if (problem_count_1.numL(problem_count_2)) {
            return T;
        }
        if (problem_count_1.numG(problem_count_2)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject cb_current_forward_inference_clump() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_current_forward_inference_clump$.getDynamicValue(thread);
    }

    public static SubLObject do_current_forward_inference_infos(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_info = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        inference_info = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$2, $list29, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list55);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, list(inference_info, $cb_current_forward_inference_clump$, $DONE, done), append(body, NIL));
    }

    public static SubLObject cb_forward_inference_browser(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject browser_title = (NIL != args) ? args.first() : NIL;
        if (NIL != browser_title) {
            return cb_forward_inference_browser_int(cb_current_forward_inference_clump(), browser_title);
        }
        return cb_forward_inference_browser_int(cb_current_forward_inference_clump(), UNPROVIDED);
    }

    public static SubLObject cb_link_forward_inference_browser(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$FwdInf;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str61$cb_forward_inference_browser);
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

    public static SubLObject cb_forward_inference_browser_int(final SubLObject clump, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Forward_Inference_Browser;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = message;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str66$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str67$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str72$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        if ((NIL == forward_inference_clump_p(clump)) || (!forward_inference_clump_inference_infos(clump).isCons())) {
                            html_princ($str77$No_forward_inferences_to_browse_);
                            return NIL;
                        }
                        final SubLObject universal_time = forward_inference_clump_timestamp(clump);
                        final SubLObject triggering_assertion = forward_inference_clump_triggering_assertion(clump);
                        final SubLObject inference_infos = forward_inference_clump_inference_infos(clump);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str79$Last_browsable_forward_inference_, numeric_date_utilities.timestring(universal_time));
                        html_newline(UNPROVIDED);
                        if (NIL != assertion_handles.assertion_p(triggering_assertion)) {
                            cb_show_assertion_readably(triggering_assertion, UNPROVIDED, UNPROVIDED);
                        } else {
                            cb_sentence_browser.cb_show_sentence_readably(triggering_assertion, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_newline(TWO_INTEGER);
                        SubLObject focus_infos = NIL;
                        SubLObject out_of_focus_infos = NIL;
                        if (NIL != $cb_forward_inference_browser_show_focus_sectionsP$.getDynamicValue(thread)) {
                            SubLObject last_rule = NIL;
                            SubLObject focusP = NIL;
                            SubLObject cdolist_list_var = inference_infos;
                            SubLObject inference_info = NIL;
                            inference_info = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject inference = forward_inference_info_inference(inference_info);
                                final SubLObject rule = forward_inference_info_rule(inference_info);
                                final SubLObject more_info = forward_inference_info_more_info(inference_info);
                                final SubLObject answer_count = (NIL != inference) ? inference_datastructures_inference.inference_answer_count(inference) : NIL != list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED) ? list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED) : ONE_INTEGER;
                                if (NIL == kb_utilities.kbeq(rule, last_rule)) {
                                    focusP = NIL;
                                }
                                if (((NIL != subl_promotions.positive_integer_p(answer_count)) || (NIL != cb_web_services.currently_bookmarkedP(rule, UNPROVIDED))) || (NIL != list_utilities.member_kbeqP(rule, $cb_assertion_history$.getDynamicValue(thread)))) {
                                    focusP = T;
                                }
                                if (NIL != focusP) {
                                    focus_infos = cons(inference_info, focus_infos);
                                }
                                out_of_focus_infos = cons(inference_info, out_of_focus_infos);
                                last_rule = rule;
                                cdolist_list_var = cdolist_list_var.rest();
                                inference_info = cdolist_list_var.first();
                            } 
                        } else {
                            focus_infos = inference_infos;
                        }
                        focus_infos = nreverse(focus_infos);
                        out_of_focus_infos = nreverse(out_of_focus_infos);
                        if (NIL != out_of_focus_infos) {
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str81$Successful_and_watched_results_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            if (NIL != out_of_focus_infos) {
                                html_indent(TWO_INTEGER);
                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str82$_all);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str83$_Jump_to_all_results_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            }
                            html_newline(UNPROVIDED);
                        }
                        cb_forward_inference_browser_show_infos(focus_infos, $FOCUS);
                        if (NIL != out_of_focus_infos) {
                            html_newline(TWO_INTEGER);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$all);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$All_results);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                        }
                        cb_forward_inference_browser_show_infos(out_of_focus_infos, $ALL);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$3, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_fib_trigger_support_link_name(final SubLObject support, final SubLObject type_keyword) {
        final SubLObject assertion_id = (NIL != assertion_handles.assertion_p(support)) ? assertion_handles.assertion_id(support) : NIL;
        final SubLObject type_string = symbol_name(type_keyword);
        return cconcatenate(format_nil.format_nil_a_no_copy(type_string), new SubLObject[]{ $str88$_, format_nil.format_nil_a_no_copy(assertion_id) });
    }

    public static SubLObject cb_fib_next_trigger_support_link_name(final SubLObject number, final SubLObject type_keyword) {
        final SubLObject type_string = symbol_name(type_keyword);
        return cconcatenate(format_nil.format_nil_a_no_copy(type_string), new SubLObject[]{ $str88$_, format_nil.format_nil_a_no_copy(number) });
    }

    public static SubLObject cb_forward_inference_browser_show_infos(final SubLObject inference_infos, final SubLObject type_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trigger_support_num = ZERO_INTEGER;
        SubLObject last_trigger_support = NIL;
        SubLObject last_rule = NIL;
        SubLObject cdolist_list_var = inference_infos;
        SubLObject inference_info = NIL;
        inference_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject inference = forward_inference_info_inference(inference_info);
            final SubLObject rule = forward_inference_info_rule(inference_info);
            final SubLObject more_info = forward_inference_info_more_info(inference_info);
            final SubLObject trigger_support = list_utilities.plist_lookup(more_info, $TRIGGER_SUPPORT, UNPROVIDED);
            final SubLObject answer_count = (NIL != inference) ? inference_datastructures_inference.inference_answer_count(inference) : NIL != list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED) ? list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED) : ONE_INTEGER;
            final SubLObject reason = list_utilities.plist_lookup(more_info, $REASON, UNPROVIDED);
            if ((NIL == trigger_support) || (!trigger_support.equal(last_trigger_support))) {
                html_hr(UNPROVIDED, UNPROVIDED);
                if (NIL == trigger_support) {
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str91$Propagating_rule__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } else {
                    SubLObject trigger_name = cb_fib_trigger_support_link_name(trigger_support, type_keyword);
                    final SubLObject next_name = cb_fib_next_trigger_support_link_name(trigger_support_num, type_keyword);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    if (NIL != trigger_name) {
                        html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(trigger_name);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    if (NIL != next_name) {
                        html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(next_name);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str92$Propagating__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    final SubLObject next_name2 = cconcatenate($str93$_, cb_fib_next_trigger_support_link_name(add(ONE_INTEGER, trigger_support_num), type_keyword));
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(next_name2);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str94$_Next_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    if (NIL != assertion_handles.assertion_p(trigger_support)) {
                        cb_show_assertion_readably(trigger_support, T, T);
                    } else {
                        cb_form(trigger_support, UNPROVIDED, UNPROVIDED);
                    }
                    if (type_keyword == $FOCUS) {
                        trigger_name = cconcatenate($str93$_, cb_fib_trigger_support_link_name(trigger_support, $ALL));
                        html_glyph($NBSP, THREE_INTEGER);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(trigger_name);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str96$_Jump_to_all_rules_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                }
                html_newline(UNPROVIDED);
                trigger_support_num = add(trigger_support_num, ONE_INTEGER);
                last_trigger_support = trigger_support;
            }
            if ((NIL != last_trigger_support) && (NIL == kb_utilities.kbeq(rule, last_rule))) {
                html_newline(UNPROVIDED);
                cb_show_assertion_readably(rule, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_glyph($RARR, UNPROVIDED);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
                last_rule = rule;
            }
            if (NIL != inference) {
                cb_link($INFERENCE, inference, $VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL != reason) {
                final SubLObject type = getf(reason, $TYPE, UNPROVIDED);
                final SubLObject asent = getf(reason, $ASENT, UNPROVIDED);
                final SubLObject placement_mt = getf(reason, $PLACEMENT_MT, UNPROVIDED);
                final SubLObject other_keys = remove($TYPE, remove($ASENT, list_utilities.plist_keys(reason), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject id_string = (NIL != other_keys) ? symbol_name(gensym(UNPROVIDED)) : NIL;
                if (NIL != other_keys) {
                    dhtml_macros.dhtml_switch_visibility_links_arrows(id_string, $str102$);
                }
                cb_form(type, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_form(asent, UNPROVIDED, UNPROVIDED);
                if (NIL != placement_mt) {
                    html_princ($$$_into_mt_);
                    cb_form(placement_mt, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != other_keys) {
                    dhtml_macros.dhtml_set_switched_visibility(id_string, $INVISIBLE, $PARAGRAPH);
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != id_string) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(id_string);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject remainder;
                            SubLObject property;
                            SubLObject value;
                            SubLObject _prev_bind_0_$10;
                            SubLObject _prev_bind_0_$11;
                            SubLObject _prev_bind_0_$12;
                            SubLObject _prev_bind_0_$13;
                            SubLObject cdolist_list_var_$14;
                            SubLObject value_elem;
                            SubLObject _prev_bind_0_$14;
                            SubLObject _prev_bind_0_$15;
                            SubLObject _prev_bind_0_$16;
                            SubLObject _prev_bind_0_$17;
                            SubLObject cdolist_list_var_$15;
                            SubLObject mt;
                            for (remainder = NIL, remainder = reason; NIL != remainder; remainder = cddr(remainder)) {
                                property = remainder.first();
                                value = cadr(remainder);
                                if (NIL == list_utilities.member_eqP(property, $list106)) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_form(property, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != list_utilities.member_eqP(property, $list108)) {
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
                                                html_char(CHAR_greater, UNPROVIDED);
                                                _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cdolist_list_var_$14 = value;
                                                    value_elem = NIL;
                                                    value_elem = cdolist_list_var_$14.first();
                                                    while (NIL != cdolist_list_var_$14) {
                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_glyph($BULL, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_form(value_elem, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cdolist_list_var_$15 = Mapping.mapcar(SUPPORT_MT, hl_supports.hl_forward_mt_combos(value_elem));
                                                                mt = NIL;
                                                                mt = cdolist_list_var_$15.first();
                                                                while (NIL != cdolist_list_var_$15) {
                                                                    cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                    html_indent(UNPROVIDED);
                                                                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                                                    mt = cdolist_list_var_$15.first();
                                                                } 
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                        value_elem = cdolist_list_var_$14.first();
                                                    } 
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                                }
                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } else {
                                                cb_form(value, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                html_newline(UNPROVIDED);
            } else {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str111$_d_answer__P, answer_count);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                if (NIL != inference) {
                    SubLObject justification_count = ZERO_INTEGER;
                    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$20 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$20);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject v_answer;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                v_answer = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(v_answer)) {
                                        v_answer = $SKIP;
                                    }
                                    justification_count = add(justification_count, inference_datastructures_inference.inference_answer_justification_count(v_answer));
                                }
                            }
                        }
                        final SubLObject idx_$21 = idx;
                        if (NIL == id_index_sparse_objects_empty_p(idx_$21)) {
                            final SubLObject cdohash_table = id_index_sparse_objects(idx_$21);
                            SubLObject id2 = NIL;
                            SubLObject v_answer2 = NIL;
                            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    id2 = getEntryKey(cdohash_entry);
                                    v_answer2 = getEntryValue(cdohash_entry);
                                    justification_count = add(justification_count, inference_datastructures_inference.inference_answer_justification_count(v_answer2));
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                    if (justification_count.numG(answer_count)) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str113$___d_justification__P, justification_count);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                }
                html_newline(UNPROVIDED);
                if (((NIL == inference) && answer_count.isZero()) && (NIL != assertions_high.single_literal_antecedent_ruleP(rule))) {
                    html_princ($str114$__No_inference_was_performed_sinc);
                }
            }
            if ((NIL != $cb_forward_inference_browser_show_el_queriesP$.getDynamicValue(thread)) && (NIL != inference)) {
                cb_query_browser.cb_show_inference_el_query(inference, NIL);
                html_newline(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_info = cdolist_list_var.first();
        } 
        final SubLObject next_name3 = cb_fib_next_trigger_support_link_name(trigger_support_num, type_keyword);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        if (NIL != next_name3) {
            html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(next_name3);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_note_new_forward_inference_for_browsing(final SubLObject inference, final SubLObject rule, SubLObject more_info) {
        if (more_info == UNPROVIDED) {
            more_info = NIL;
        }
        if (NIL == cb_current_forward_inference_clump()) {
            return NIL;
        }
        more_info = putf(more_info, $TRIGGER_SUPPORT, forward.current_forward_inference_gaf());
        final SubLObject inference_info = new_forward_inference_info(inference, rule, more_info);
        add_forward_inference_info_to_clump(cb_current_forward_inference_clump(), inference_info);
        return inference;
    }

    public static SubLObject prepare_to_browse_new_forward_inference(final SubLObject triggering_assertion_or_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        destroy_forward_inference_clump($cb_current_forward_inference_clump$.getDynamicValue(thread));
        $cb_current_forward_inference_clump$.setDynamicValue(new_forward_inference_clump(triggering_assertion_or_sentence), thread);
        return NIL;
    }

    public static SubLObject cleanup_from_browsing_new_forward_inference() {
        return NIL;
    }

    public static SubLObject declare_cb_forward_inference_browser_file() {
        declareFunction(me, "cb_forward_inference_clump_lookup_by_id", "CB-FORWARD-INFERENCE-CLUMP-LOOKUP-BY-ID", 1, 0, false);
        declareFunction(me, "forward_inference_clump_print_function_trampoline", "FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "forward_inference_clump_p", "FORWARD-INFERENCE-CLUMP-P", 1, 0, false);
        new cb_forward_inference_browser.$forward_inference_clump_p$UnaryFunction();
        declareFunction(me, "fwd_inf_clump_id", "FWD-INF-CLUMP-ID", 1, 0, false);
        declareFunction(me, "fwd_inf_clump_timestamp", "FWD-INF-CLUMP-TIMESTAMP", 1, 0, false);
        declareFunction(me, "fwd_inf_clump_triggering_assertion", "FWD-INF-CLUMP-TRIGGERING-ASSERTION", 1, 0, false);
        declareFunction(me, "fwd_inf_clump_inference_infos", "FWD-INF-CLUMP-INFERENCE-INFOS", 1, 0, false);
        declareFunction(me, "_csetf_fwd_inf_clump_id", "_CSETF-FWD-INF-CLUMP-ID", 2, 0, false);
        declareFunction(me, "_csetf_fwd_inf_clump_timestamp", "_CSETF-FWD-INF-CLUMP-TIMESTAMP", 2, 0, false);
        declareFunction(me, "_csetf_fwd_inf_clump_triggering_assertion", "_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION", 2, 0, false);
        declareFunction(me, "_csetf_fwd_inf_clump_inference_infos", "_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS", 2, 0, false);
        declareFunction(me, "make_forward_inference_clump", "MAKE-FORWARD-INFERENCE-CLUMP", 0, 1, false);
        declareFunction(me, "visit_defstruct_forward_inference_clump", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-CLUMP", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_forward_inference_clump_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD", 2, 0, false);
        declareFunction(me, "valid_forward_inference_clump_p", "VALID-FORWARD-INFERENCE-CLUMP-P", 1, 0, false);
        declareFunction(me, "new_forward_inference_clump", "NEW-FORWARD-INFERENCE-CLUMP", 1, 0, false);
        declareMacro(me, "do_forward_inference_clump_inference_infos", "DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        declareFunction(me, "destroy_forward_inference_clump", "DESTROY-FORWARD-INFERENCE-CLUMP", 1, 0, false);
        declareFunction(me, "forward_inference_clump_id", "FORWARD-INFERENCE-CLUMP-ID", 1, 0, false);
        declareFunction(me, "forward_inference_clump_timestamp", "FORWARD-INFERENCE-CLUMP-TIMESTAMP", 1, 0, false);
        declareFunction(me, "forward_inference_clump_triggering_assertion", "FORWARD-INFERENCE-CLUMP-TRIGGERING-ASSERTION", 1, 0, false);
        declareFunction(me, "forward_inference_clump_inference_infos", "FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS", 1, 0, false);
        declareFunction(me, "add_forward_inference_info_to_clump", "ADD-FORWARD-INFERENCE-INFO-TO-CLUMP", 2, 0, false);
        declareFunction(me, "forward_inference_clump_total_answer_count", "FORWARD-INFERENCE-CLUMP-TOTAL-ANSWER-COUNT", 1, 0, false);
        declareFunction(me, "forward_inference_info_print_function_trampoline", "FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "forward_inference_info_p", "FORWARD-INFERENCE-INFO-P", 1, 0, false);
        new cb_forward_inference_browser.$forward_inference_info_p$UnaryFunction();
        declareFunction(me, "fwd_inf_info_inference", "FWD-INF-INFO-INFERENCE", 1, 0, false);
        declareFunction(me, "fwd_inf_info_rule", "FWD-INF-INFO-RULE", 1, 0, false);
        declareFunction(me, "fwd_inf_info_more_info", "FWD-INF-INFO-MORE-INFO", 1, 0, false);
        declareFunction(me, "_csetf_fwd_inf_info_inference", "_CSETF-FWD-INF-INFO-INFERENCE", 2, 0, false);
        declareFunction(me, "_csetf_fwd_inf_info_rule", "_CSETF-FWD-INF-INFO-RULE", 2, 0, false);
        declareFunction(me, "_csetf_fwd_inf_info_more_info", "_CSETF-FWD-INF-INFO-MORE-INFO", 2, 0, false);
        declareFunction(me, "make_forward_inference_info", "MAKE-FORWARD-INFERENCE-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_forward_inference_info", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_forward_inference_info_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD", 2, 0, false);
        declareFunction(me, "valid_forward_inference_info_p", "VALID-FORWARD-INFERENCE-INFO-P", 1, 0, false);
        declareFunction(me, "new_forward_inference_info", "NEW-FORWARD-INFERENCE-INFO", 2, 1, false);
        declareFunction(me, "destroy_inference_info", "DESTROY-INFERENCE-INFO", 1, 0, false);
        declareFunction(me, "forward_inference_info_inference", "FORWARD-INFERENCE-INFO-INFERENCE", 1, 0, false);
        declareFunction(me, "forward_inference_info_rule", "FORWARD-INFERENCE-INFO-RULE", 1, 0, false);
        declareFunction(me, "forward_inference_info_more_info", "FORWARD-INFERENCE-INFO-MORE-INFO", 1, 0, false);
        declareFunction(me, "inference_info_G", "INFERENCE-INFO->", 2, 0, false);
        declareFunction(me, "inference_info_L", "INFERENCE-INFO-<", 2, 0, false);
        declareFunction(me, "cb_current_forward_inference_clump", "CB-CURRENT-FORWARD-INFERENCE-CLUMP", 0, 0, false);
        declareMacro(me, "do_current_forward_inference_infos", "DO-CURRENT-FORWARD-INFERENCE-INFOS");
        declareFunction(me, "cb_forward_inference_browser", "CB-FORWARD-INFERENCE-BROWSER", 0, 1, false);
        declareFunction(me, "cb_link_forward_inference_browser", "CB-LINK-FORWARD-INFERENCE-BROWSER", 0, 1, false);
        declareFunction(me, "cb_forward_inference_browser_int", "CB-FORWARD-INFERENCE-BROWSER-INT", 1, 1, false);
        declareFunction(me, "cb_fib_trigger_support_link_name", "CB-FIB-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false);
        declareFunction(me, "cb_fib_next_trigger_support_link_name", "CB-FIB-NEXT-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false);
        declareFunction(me, "cb_forward_inference_browser_show_infos", "CB-FORWARD-INFERENCE-BROWSER-SHOW-INFOS", 2, 0, false);
        declareFunction(me, "cb_note_new_forward_inference_for_browsing", "CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING", 2, 1, false);
        declareFunction(me, "prepare_to_browse_new_forward_inference", "PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE", 1, 0, false);
        declareFunction(me, "cleanup_from_browsing_new_forward_inference", "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_forward_inference_browser_file() {
        defparameter("*CB-FORWARD-INFERENCE-CLUMP-ID-INDEX*", new_id_index(UNPROVIDED, UNPROVIDED));
        defparameter("*CB-FORWARD-INFERENCE-BROWSER-SHOW-FOCUS-SECTIONS?*", T);
        defparameter("*CB-FORWARD-INFERENCE-BROWSER-SHOW-EL-QUERIES?*", NIL);
        defconstant("*DTP-FORWARD-INFERENCE-CLUMP*", FORWARD_INFERENCE_CLUMP);
        defconstant("*DTP-FORWARD-INFERENCE-INFO*", FORWARD_INFERENCE_INFO);
        defvar("*CB-CURRENT-FORWARD-INFERENCE-CLUMP*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_forward_inference_browser_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_forward_inference_clump$.getGlobalValue(), symbol_function(FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FWD_INF_CLUMP_ID, _CSETF_FWD_INF_CLUMP_ID);
        def_csetf(FWD_INF_CLUMP_TIMESTAMP, _CSETF_FWD_INF_CLUMP_TIMESTAMP);
        def_csetf(FWD_INF_CLUMP_TRIGGERING_ASSERTION, _CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION);
        def_csetf(FWD_INF_CLUMP_INFERENCE_INFOS, _CSETF_FWD_INF_CLUMP_INFERENCE_INFOS);
        identity(FORWARD_INFERENCE_CLUMP);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_inference_clump$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_forward_inference_info$.getGlobalValue(), symbol_function(FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list41);
        def_csetf(FWD_INF_INFO_INFERENCE, _CSETF_FWD_INF_INFO_INFERENCE);
        def_csetf(FWD_INF_INFO_RULE, _CSETF_FWD_INF_INFO_RULE);
        def_csetf(FWD_INF_INFO_MORE_INFO, _CSETF_FWD_INF_INFO_MORE_INFO);
        identity(FORWARD_INFERENCE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_inference_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD));
        register_html_state_variable($cb_current_forward_inference_clump$);
        html_macros.note_cgi_handler_function(CB_FORWARD_INFERENCE_BROWSER, $HTML_HANDLER);
        setup_cb_link_method($FORWARD_INFERENCE_BROWSER, CB_LINK_FORWARD_INFERENCE_BROWSER, ONE_INTEGER);
        declare_cb_tool($FORWARD_INFERENCE_BROWSER, $$$Forward_Inference_Browser, $$$FwdInf, $str65$Browse_the_most_recent_browsable_);
        register_macro_helper(PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, BROWSING_NEW_FORWARD_INFERENCE);
        register_macro_helper(CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE, BROWSING_NEW_FORWARD_INFERENCE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_forward_inference_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_forward_inference_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_forward_inference_browser_file();
    }

    

    public static final class $forward_inference_clump_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $timestamp;

        public SubLObject $triggering_assertion;

        public SubLObject $inference_infos;

        private static final SubLStructDeclNative structDecl;

        private $forward_inference_clump_native() {
            this.$id = Lisp.NIL;
            this.$timestamp = Lisp.NIL;
            this.$triggering_assertion = Lisp.NIL;
            this.$inference_infos = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$timestamp;
        }

        @Override
        public SubLObject getField4() {
            return this.$triggering_assertion;
        }

        @Override
        public SubLObject getField5() {
            return this.$inference_infos;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$timestamp = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$triggering_assertion = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$inference_infos = value;
        }

        static {
            structDecl = makeStructDeclNative($forward_inference_clump_native.class, FORWARD_INFERENCE_CLUMP, FORWARD_INFERENCE_CLUMP_P, $list2, $list3, new String[]{ "$id", "$timestamp", "$triggering_assertion", "$inference_infos" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $forward_inference_clump_p$UnaryFunction extends UnaryFunction {
        public $forward_inference_clump_p$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-INFERENCE-CLUMP-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_inference_clump_p(arg1);
        }
    }

    public static final class $forward_inference_info_native extends SubLStructNative {
        public SubLObject $inference;

        public SubLObject $rule;

        public SubLObject $more_info;

        private static final SubLStructDeclNative structDecl;

        private $forward_inference_info_native() {
            this.$inference = Lisp.NIL;
            this.$rule = Lisp.NIL;
            this.$more_info = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$inference;
        }

        @Override
        public SubLObject getField3() {
            return this.$rule;
        }

        @Override
        public SubLObject getField4() {
            return this.$more_info;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$rule = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$more_info = value;
        }

        static {
            structDecl = makeStructDeclNative($forward_inference_info_native.class, FORWARD_INFERENCE_INFO, FORWARD_INFERENCE_INFO_P, $list36, $list37, new String[]{ "$inference", "$rule", "$more_info" }, $list38, $list39, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $forward_inference_info_p$UnaryFunction extends UnaryFunction {
        public $forward_inference_info_p$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-INFERENCE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_inference_info_p(arg1);
        }
    }
}

/**
 * Total time: 817 ms synthetic
 */
