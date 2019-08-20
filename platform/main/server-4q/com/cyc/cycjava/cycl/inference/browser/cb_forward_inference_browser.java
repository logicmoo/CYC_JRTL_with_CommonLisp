package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_sentence_browser;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cb_web_services;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_forward_inference_browser extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "8368e68f0fd4163486b424d23b32586af7078fc39f846b659c3620bcbdbd4dfd";
    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1000L)
    private static SubLSymbol $cb_forward_inference_clump_id_index$;
    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1300L)
    private static SubLSymbol $cb_forward_inference_browser_show_focus_sectionsP$;
    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    private static SubLSymbol $cb_forward_inference_browser_show_el_queriesP$;
    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLSymbol $dtp_forward_inference_clump$;
    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLSymbol $dtp_forward_inference_info$;
    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8400L)
    public static SubLSymbol $cb_current_forward_inference_clump$;
    private static SubLSymbol $sym0$FORWARD_INFERENCE_CLUMP;
    private static SubLSymbol $sym1$FORWARD_INFERENCE_CLUMP_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$FWD_INF_CLUMP_ID;
    private static SubLSymbol $sym10$_CSETF_FWD_INF_CLUMP_ID;
    private static SubLSymbol $sym11$FWD_INF_CLUMP_TIMESTAMP;
    private static SubLSymbol $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP;
    private static SubLSymbol $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION;
    private static SubLSymbol $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION;
    private static SubLSymbol $sym15$FWD_INF_CLUMP_INFERENCE_INFOS;
    private static SubLSymbol $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS;
    private static SubLSymbol $ID;
    private static SubLSymbol $TIMESTAMP;
    private static SubLSymbol $TRIGGERING_ASSERTION;
    private static SubLSymbol $INFERENCE_INFOS;
    private static SubLString $str21$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym23$MAKE_FORWARD_INFERENCE_CLUMP;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD;
    private static SubLSymbol $FREE;
    private static SubLList $list28;
    private static SubLList $list29;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym32$DO_LIST;
    private static SubLSymbol $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS;
    private static SubLSymbol $sym34$FORWARD_INFERENCE_INFO_P;
    private static SubLSymbol $sym35$FORWARD_INFERENCE_INFO;
    private static SubLList $list36;
    private static SubLList $list37;
    private static SubLList $list38;
    private static SubLList $list39;
    private static SubLSymbol $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list41;
    private static SubLSymbol $sym42$FWD_INF_INFO_INFERENCE;
    private static SubLSymbol $sym43$_CSETF_FWD_INF_INFO_INFERENCE;
    private static SubLSymbol $sym44$FWD_INF_INFO_RULE;
    private static SubLSymbol $sym45$_CSETF_FWD_INF_INFO_RULE;
    private static SubLSymbol $sym46$FWD_INF_INFO_MORE_INFO;
    private static SubLSymbol $sym47$_CSETF_FWD_INF_INFO_MORE_INFO;
    private static SubLSymbol $INFERENCE;
    private static SubLSymbol $RULE;
    private static SubLSymbol $MORE_INFO;
    private static SubLSymbol $sym51$MAKE_FORWARD_INFERENCE_INFO;
    private static SubLSymbol $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD;
    private static SubLSymbol $sym53$INFERENCE_P;
    private static SubLSymbol $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_;
    private static SubLList $list55;
    private static SubLSymbol $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS;
    private static SubLSymbol $sym57$CB_FORWARD_INFERENCE_BROWSER;
    private static SubLSymbol $HTML_HANDLER;
    private static SubLString $str59$FwdInf;
    private static SubLSymbol $MAIN;
    private static SubLString $str61$cb_forward_inference_browser;
    private static SubLSymbol $FORWARD_INFERENCE_BROWSER;
    private static SubLSymbol $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER;
    private static SubLString $str64$Forward_Inference_Browser;
    private static SubLString $str65$Browse_the_most_recent_browsable_;
    private static SubLString $str66$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static SubLString $str67$_meta_http_equiv__X_UA_Compatible;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLSymbol $CB_CYC;
    private static SubLSymbol $SAM_AUTOCOMPLETE_CSS;
    private static SubLSymbol $SHA1;
    private static SubLString $str72$yui_skin_sam;
    private static SubLString $str73$reloadFrameButton;
    private static SubLString $str74$button;
    private static SubLString $str75$reload;
    private static SubLString $str76$Refresh_Frames;
    private static SubLString $str77$No_forward_inferences_to_browse_;
    private static SubLSymbol $sym78$_EXIT;
    private static SubLString $str79$Last_browsable_forward_inference_;
    private static SubLSymbol $ANSWER_COUNT;
    private static SubLString $str81$Successful_and_watched_results_;
    private static SubLString $str82$_all;
    private static SubLString $str83$_Jump_to_all_results_;
    private static SubLSymbol $FOCUS;
    private static SubLString $str85$all;
    private static SubLString $str86$All_results;
    private static SubLSymbol $ALL;
    private static SubLString $str88$_;
    private static SubLSymbol $TRIGGER_SUPPORT;
    private static SubLSymbol $REASON;
    private static SubLString $str91$Propagating_rule__;
    private static SubLString $str92$Propagating__;
    private static SubLString $str93$_;
    private static SubLString $str94$_Next_;
    private static SubLSymbol $NBSP;
    private static SubLString $str96$_Jump_to_all_rules_;
    private static SubLSymbol $RARR;
    private static SubLSymbol $VERY_VERBOSE;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $ASENT;
    private static SubLSymbol $PLACEMENT_MT;
    private static SubLString $str102$;
    private static SubLString $str103$_into_mt_;
    private static SubLSymbol $INVISIBLE;
    private static SubLSymbol $PARAGRAPH;
    private static SubLList $list106;
    private static SubLSymbol $TOP;
    private static SubLList $list108;
    private static SubLSymbol $BULL;
    private static SubLSymbol $sym110$SUPPORT_MT;
    private static SubLString $str111$_d_answer__P;
    private static SubLSymbol $SKIP;
    private static SubLString $str113$___d_justification__P;
    private static SubLString $str114$__No_inference_was_performed_sinc;
    private static SubLSymbol $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE;
    private static SubLSymbol $sym116$BROWSING_NEW_FORWARD_INFERENCE;
    private static SubLSymbol $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE;

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1200L)
    public static SubLObject cb_forward_inference_clump_lookup_by_id(SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return id_index.id_index_lookup($cb_forward_inference_clump_id_index$.getDynamicValue(thread), id, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject forward_inference_clump_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject forward_inference_clump_p(SubLObject v_object) {
        return (v_object.getClass() == $forward_inference_clump_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject fwd_inf_clump_id(SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject fwd_inf_clump_timestamp(SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject fwd_inf_clump_triggering_assertion(SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject fwd_inf_clump_inference_infos(SubLObject v_object) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject _csetf_fwd_inf_clump_id(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject _csetf_fwd_inf_clump_timestamp(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject _csetf_fwd_inf_clump_triggering_assertion(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject _csetf_fwd_inf_clump_inference_infos(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject make_forward_inference_clump(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $forward_inference_clump_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_fwd_inf_clump_id(v_new, current_value);
            } else if (pcase_var.eql($TIMESTAMP)) {
                _csetf_fwd_inf_clump_timestamp(v_new, current_value);
            } else if (pcase_var.eql($TRIGGERING_ASSERTION)) {
                _csetf_fwd_inf_clump_triggering_assertion(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE_INFOS)) {
                _csetf_fwd_inf_clump_inference_infos(v_new, current_value);
            } else {
                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject visit_defstruct_forward_inference_clump(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym23$MAKE_FORWARD_INFERENCE_CLUMP, FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $ID, fwd_inf_clump_id(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TIMESTAMP, fwd_inf_clump_timestamp(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TRIGGERING_ASSERTION, fwd_inf_clump_triggering_assertion(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE_INFOS, fwd_inf_clump_inference_infos(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym23$MAKE_FORWARD_INFERENCE_CLUMP, FOUR_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1400L)
    public static SubLObject visit_defstruct_object_forward_inference_clump_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_forward_inference_clump(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1700L)
    public static SubLObject valid_forward_inference_clump_p(SubLObject v_object) {
        return makeBoolean(NIL != forward_inference_clump_p(v_object) && $FREE != fwd_inf_clump_timestamp(v_object));
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1800L)
    public static SubLObject new_forward_inference_clump(SubLObject triggering_assertion_or_sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject clump = make_forward_inference_clump(UNPROVIDED);
        SubLObject id = id_index.id_index_reserve($cb_forward_inference_clump_id_index$.getDynamicValue(thread));
        _csetf_fwd_inf_clump_id(clump, id);
        id_index.id_index_enter($cb_forward_inference_clump_id_index$.getDynamicValue(thread), id, clump);
        _csetf_fwd_inf_clump_timestamp(clump, Time.get_universal_time());
        _csetf_fwd_inf_clump_triggering_assertion(clump, triggering_assertion_or_sentence);
        _csetf_fwd_inf_clump_inference_infos(clump, NIL);
        return clump;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 2400L)
    public static SubLObject do_forward_inference_clump_inference_infos(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_info = NIL;
        SubLObject clump = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
        inference_info = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
        clump = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list28);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list28);
            if (NIL == conses_high.member(current_$1, $list29, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list28);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym32$DO_LIST, list(inference_info, list($sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, clump), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 2600L)
    public static SubLObject destroy_forward_inference_clump(SubLObject clump) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_forward_inference_clump_p(clump)) {
            SubLObject cdolist_list_var = forward_inference_clump_inference_infos(clump);
            SubLObject inference_info = NIL;
            inference_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                destroy_inference_info(inference_info);
                cdolist_list_var = cdolist_list_var.rest();
                inference_info = cdolist_list_var.first();
            }
            id_index.id_index_remove($cb_forward_inference_clump_id_index$.getDynamicValue(thread), fwd_inf_clump_id(clump));
            _csetf_fwd_inf_clump_timestamp(clump, $FREE);
            _csetf_fwd_inf_clump_triggering_assertion(clump, $FREE);
            _csetf_fwd_inf_clump_inference_infos(clump, $FREE);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3200L)
    public static SubLObject forward_inference_clump_id(SubLObject clump) {
        return fwd_inf_clump_id(clump);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3300L)
    public static SubLObject forward_inference_clump_timestamp(SubLObject clump) {
        return fwd_inf_clump_timestamp(clump);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3400L)
    public static SubLObject forward_inference_clump_triggering_assertion(SubLObject clump) {
        SubLObject assertion = fwd_inf_clump_triggering_assertion(clump);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            SubLObject found_assertion = czer_meta.find_assertion_cycl(assertion, UNPROVIDED);
            if (NIL != assertion_handles.assertion_p(found_assertion)) {
                assertion = found_assertion;
                _csetf_fwd_inf_clump_triggering_assertion(clump, assertion);
            }
        }
        return assertion;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3800L)
    public static SubLObject forward_inference_clump_inference_infos(SubLObject clump) {
        return fwd_inf_clump_inference_infos(clump);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4000L)
    public static SubLObject add_forward_inference_info_to_clump(SubLObject clump, SubLObject inference_info) {
        assert NIL != forward_inference_info_p(inference_info) : inference_info;
        SubLObject inference_infos = forward_inference_clump_inference_infos(clump);
        inference_infos = append(inference_infos, list(inference_info));
        _csetf_fwd_inf_clump_inference_infos(clump, inference_infos);
        return clump;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4300L)
    public static SubLObject forward_inference_clump_total_answer_count(SubLObject clump) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        SubLObject inference_infos = cdolist_list_var = forward_inference_clump_inference_infos(clump);
        SubLObject inference_info = NIL;
        inference_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject inference = forward_inference_info_inference(inference_info);
            SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
            if (answer_count.isInteger()) {
                count = Numbers.add(count, answer_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_info = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject forward_inference_info_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject forward_inference_info_p(SubLObject v_object) {
        return (v_object.getClass() == $forward_inference_info_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject fwd_inf_info_inference(SubLObject v_object) {
        assert NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject fwd_inf_info_rule(SubLObject v_object) {
        assert NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject fwd_inf_info_more_info(SubLObject v_object) {
        assert NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject _csetf_fwd_inf_info_inference(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject _csetf_fwd_inf_info_rule(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject _csetf_fwd_inf_info_more_info(SubLObject v_object, SubLObject value) {
        assert NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject make_forward_inference_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $forward_inference_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INFERENCE)) {
                _csetf_fwd_inf_info_inference(v_new, current_value);
            } else if (pcase_var.eql($RULE)) {
                _csetf_fwd_inf_info_rule(v_new, current_value);
            } else if (pcase_var.eql($MORE_INFO)) {
                _csetf_fwd_inf_info_more_info(v_new, current_value);
            } else {
                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject visit_defstruct_forward_inference_info(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym51$MAKE_FORWARD_INFERENCE_INFO, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE, fwd_inf_info_inference(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RULE, fwd_inf_info_rule(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MORE_INFO, fwd_inf_info_more_info(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym51$MAKE_FORWARD_INFERENCE_INFO, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4800L)
    public static SubLObject visit_defstruct_object_forward_inference_info_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_forward_inference_info(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5000L)
    public static SubLObject valid_forward_inference_info_p(SubLObject v_object) {
        return makeBoolean(NIL != forward_inference_info_p(v_object) && $FREE != fwd_inf_info_inference(v_object));
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5100L)
    public static SubLObject new_forward_inference_info(SubLObject possible_inference, SubLObject rule, SubLObject more_info) {
        if (more_info == UNPROVIDED) {
            more_info = NIL;
        }
        if (NIL != possible_inference && !assertionsDisabledInClass && NIL == inference_datastructures_inference.inference_p(possible_inference)) {
            throw new AssertionError(possible_inference);
        }
        SubLObject forward_inference_info = make_forward_inference_info(UNPROVIDED);
        _csetf_fwd_inf_info_inference(forward_inference_info, possible_inference);
        _csetf_fwd_inf_info_rule(forward_inference_info, rule);
        _csetf_fwd_inf_info_more_info(forward_inference_info, more_info);
        return forward_inference_info;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5600L)
    public static SubLObject destroy_inference_info(SubLObject inference_info) {
        if (NIL != valid_forward_inference_info_p(inference_info)) {
            SubLObject inference = forward_inference_info_inference(inference_info);
            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
            _csetf_fwd_inf_info_inference(inference_info, $FREE);
            _csetf_fwd_inf_info_rule(inference_info, $FREE);
            _csetf_fwd_inf_info_more_info(inference_info, $FREE);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6100L)
    public static SubLObject forward_inference_info_inference(SubLObject inference_info) {
        return fwd_inf_info_inference(inference_info);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6200L)
    public static SubLObject forward_inference_info_rule(SubLObject inference_info) {
        return fwd_inf_info_rule(inference_info);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6300L)
    public static SubLObject forward_inference_info_more_info(SubLObject inference_info) {
        return fwd_inf_info_more_info(inference_info);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6400L)
    public static SubLObject inference_info_G(SubLObject info1, SubLObject info2) {
        return makeBoolean(!info1.eql(info2) && NIL == inference_info_L(info1, info2));
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6600L)
    public static SubLObject inference_info_L(SubLObject info1, SubLObject info2) {
        SubLObject inference1 = forward_inference_info_inference(info1);
        SubLObject inference2 = forward_inference_info_inference(info2);
        SubLObject store1 = (NIL != inference1) ? inference_datastructures_inference.inference_problem_store(inference1) : NIL;
        SubLObject store2 = (NIL != inference2) ? inference_datastructures_inference.inference_problem_store(inference2) : NIL;
        SubLObject answer_count_1 = (NIL != inference1) ? inference_datastructures_inference.inference_answer_count(inference1) : ONE_INTEGER;
        SubLObject answer_count_2 = (NIL != inference2) ? inference_datastructures_inference.inference_answer_count(inference2) : ONE_INTEGER;
        SubLObject problem_count_1 = (NIL != store1) ? inference_datastructures_problem_store.problem_store_size(store1) : NIL;
        SubLObject problem_count_2 = (NIL != store2) ? inference_datastructures_problem_store.problem_store_size(store2) : NIL;
        SubLObject store_id1 = (NIL != store1) ? inference_datastructures_problem_store.problem_store_suid(store1) : NIL;
        SubLObject store_id2 = (NIL != store2) ? inference_datastructures_problem_store.problem_store_suid(store2) : NIL;
        SubLObject id1 = (NIL != inference1) ? inference_datastructures_inference.inference_suid(inference1) : NIL;
        SubLObject id2 = (NIL != inference2) ? inference_datastructures_inference.inference_suid(inference2) : NIL;
        if (NIL != subl_promotions.positive_integer_p(answer_count_1) && answer_count_2.isZero()) {
            return NIL;
        }
        if (answer_count_1.isZero() && NIL != subl_promotions.positive_integer_p(answer_count_2)) {
            return T;
        }
        if (NIL == inference1 && NIL == inference2) {
            return Numbers.numL(assertion_handles.assertion_id(forward_inference_info_rule(info2)), assertion_handles.assertion_id(forward_inference_info_rule(info2)));
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

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8600L)
    public static SubLObject cb_current_forward_inference_clump() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_current_forward_inference_clump$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8700L)
    public static SubLObject do_current_forward_inference_infos(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_info = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        inference_info = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list55);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == conses_high.member(current_$2, $list29, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list55);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, list(inference_info, $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8900L)
    public static SubLObject cb_forward_inference_browser(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject browser_title = (NIL != args) ? args.first() : NIL;
        if (NIL != browser_title) {
            return cb_forward_inference_browser_int(cb_current_forward_inference_clump(), browser_title);
        }
        return cb_forward_inference_browser_int(cb_current_forward_inference_clump(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 9400L)
    public static SubLObject cb_link_forward_inference_browser(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str59$FwdInf;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str61$cb_forward_inference_browser);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 9700L)
    public static SubLObject cb_forward_inference_browser_int(SubLObject clump, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $str64$Forward_Inference_Browser;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject title_var = message;
        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
                    : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_utilities.html_markup($str66$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup($str67$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str72$yui_skin_sam);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str73$reloadFrameButton);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str74$button);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str75$reload);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_princ($str76$Refresh_Frames);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        if (NIL == forward_inference_clump_p(clump) || !forward_inference_clump_inference_infos(clump).isCons()) {
                            html_utilities.html_princ($str77$No_forward_inferences_to_browse_);
                            return NIL;
                        }
                        SubLObject universal_time = forward_inference_clump_timestamp(clump);
                        SubLObject triggering_assertion = forward_inference_clump_triggering_assertion(clump);
                        SubLObject inference_infos = forward_inference_clump_inference_infos(clump);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str79$Last_browsable_forward_inference_, numeric_date_utilities.timestring(universal_time));
                        html_utilities.html_newline(UNPROVIDED);
                        if (NIL != assertion_handles.assertion_p(triggering_assertion)) {
                            cb_utilities.cb_show_assertion_readably(triggering_assertion, UNPROVIDED, UNPROVIDED);
                        } else {
                            cb_sentence_browser.cb_show_sentence_readably(triggering_assertion, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_newline(TWO_INTEGER);
                        SubLObject focus_infos = NIL;
                        SubLObject out_of_focus_infos = NIL;
                        if (NIL != $cb_forward_inference_browser_show_focus_sectionsP$.getDynamicValue(thread)) {
                            SubLObject last_rule = NIL;
                            SubLObject focusP = NIL;
                            SubLObject cdolist_list_var = inference_infos;
                            SubLObject inference_info = NIL;
                            inference_info = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject inference = forward_inference_info_inference(inference_info);
                                SubLObject rule = forward_inference_info_rule(inference_info);
                                SubLObject more_info = forward_inference_info_more_info(inference_info);
                                SubLObject answer_count = (NIL != inference) ? inference_datastructures_inference.inference_answer_count(inference)
                                        : ((NIL != list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED)) ? list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED) : ONE_INTEGER);
                                if (NIL == kb_utilities.kbeq(rule, last_rule)) {
                                    focusP = NIL;
                                }
                                if (NIL != subl_promotions.positive_integer_p(answer_count) || NIL != cb_web_services.currently_bookmarkedP(rule, UNPROVIDED) || NIL != list_utilities.member_kbeqP(rule, cb_parameters.$cb_assertion_history$.getDynamicValue(thread))) {
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
                        focus_infos = Sequences.nreverse(focus_infos);
                        out_of_focus_infos = Sequences.nreverse(out_of_focus_infos);
                        if (NIL != out_of_focus_infos) {
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($str81$Successful_and_watched_results_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            if (NIL != out_of_focus_infos) {
                                html_utilities.html_indent(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str82$_all);
                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($str83$_Jump_to_all_results_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline(UNPROVIDED);
                        }
                        cb_forward_inference_browser_show_infos(focus_infos, $FOCUS);
                        if (NIL != out_of_focus_infos) {
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str85$all);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ($str86$All_results);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                        }
                        cb_forward_inference_browser_show_infos(out_of_focus_infos, $ALL);
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 12900L)
    public static SubLObject cb_fib_trigger_support_link_name(SubLObject support, SubLObject type_keyword) {
        SubLObject assertion_id = (NIL != assertion_handles.assertion_p(support)) ? assertion_handles.assertion_id(support) : NIL;
        SubLObject type_string = Symbols.symbol_name(type_keyword);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(type_string), new SubLObject[] { $str88$_, format_nil.format_nil_a_no_copy(assertion_id) });
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 13200L)
    public static SubLObject cb_fib_next_trigger_support_link_name(SubLObject number, SubLObject type_keyword) {
        SubLObject type_string = Symbols.symbol_name(type_keyword);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(type_string), new SubLObject[] { $str88$_, format_nil.format_nil_a_no_copy(number) });
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 13400L)
    public static SubLObject cb_forward_inference_browser_show_infos(SubLObject inference_infos, SubLObject type_keyword) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trigger_support_num = ZERO_INTEGER;
        SubLObject last_trigger_support = NIL;
        SubLObject last_rule = NIL;
        SubLObject cdolist_list_var = inference_infos;
        SubLObject inference_info = NIL;
        inference_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject inference = forward_inference_info_inference(inference_info);
            SubLObject rule = forward_inference_info_rule(inference_info);
            SubLObject more_info = forward_inference_info_more_info(inference_info);
            SubLObject trigger_support = list_utilities.plist_lookup(more_info, $TRIGGER_SUPPORT, UNPROVIDED);
            SubLObject answer_count = (NIL != inference) ? inference_datastructures_inference.inference_answer_count(inference) : ((NIL != list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED)) ? list_utilities.plist_lookup(more_info, $ANSWER_COUNT, UNPROVIDED) : ONE_INTEGER);
            SubLObject reason = list_utilities.plist_lookup(more_info, $REASON, UNPROVIDED);
            if (NIL == trigger_support || !trigger_support.equal(last_trigger_support)) {
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                if (NIL == trigger_support) {
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ($str91$Propagating_rule__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } else {
                    SubLObject trigger_name = cb_fib_trigger_support_link_name(trigger_support, type_keyword);
                    SubLObject next_name = cb_fib_next_trigger_support_link_name(trigger_support_num, type_keyword);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    if (NIL != trigger_name) {
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(trigger_name);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    if (NIL != next_name) {
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(next_name);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ($str92$Propagating__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    SubLObject next_name2 = Sequences.cconcatenate($str93$_, cb_fib_next_trigger_support_link_name(Numbers.add(ONE_INTEGER, trigger_support_num), type_keyword));
                    html_utilities.html_indent(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(next_name2);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str94$_Next_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_newline(UNPROVIDED);
                    if (NIL != assertion_handles.assertion_p(trigger_support)) {
                        cb_utilities.cb_show_assertion_readably(trigger_support, T, T);
                    } else {
                        cb_utilities.cb_form(trigger_support, UNPROVIDED, UNPROVIDED);
                    }
                    if (type_keyword == $FOCUS) {
                        trigger_name = Sequences.cconcatenate($str93$_, cb_fib_trigger_support_link_name(trigger_support, $ALL));
                        html_utilities.html_glyph($NBSP, THREE_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(trigger_name);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str96$_Jump_to_all_rules_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                }
                html_utilities.html_newline(UNPROVIDED);
                trigger_support_num = Numbers.add(trigger_support_num, ONE_INTEGER);
                last_trigger_support = trigger_support;
            }
            if (NIL != last_trigger_support && NIL == kb_utilities.kbeq(rule, last_rule)) {
                html_utilities.html_newline(UNPROVIDED);
                cb_utilities.cb_show_assertion_readably(rule, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_glyph($RARR, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_indent(UNPROVIDED);
                last_rule = rule;
            }
            if (NIL != inference) {
                cb_utilities.cb_link($INFERENCE, inference, $VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(UNPROVIDED);
            }
            if (NIL != reason) {
                SubLObject type = conses_high.getf(reason, $TYPE, UNPROVIDED);
                SubLObject asent = conses_high.getf(reason, $ASENT, UNPROVIDED);
                SubLObject placement_mt = conses_high.getf(reason, $PLACEMENT_MT, UNPROVIDED);
                SubLObject other_keys = Sequences.remove($TYPE, Sequences.remove($ASENT, list_utilities.plist_keys(reason), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject id_string = (NIL != other_keys) ? Symbols.symbol_name(Symbols.gensym(UNPROVIDED)) : NIL;
                if (NIL != other_keys) {
                    dhtml_macros.dhtml_switch_visibility_links_arrows(id_string, $str102$);
                }
                cb_utilities.cb_form(type, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(UNPROVIDED);
                cb_utilities.cb_form(asent, UNPROVIDED, UNPROVIDED);
                if (NIL != placement_mt) {
                    html_utilities.html_princ($str103$_into_mt_);
                    cb_utilities.cb_form(placement_mt, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != other_keys) {
                    dhtml_macros.dhtml_set_switched_visibility(id_string, $INVISIBLE, $PARAGRAPH);
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != id_string) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(id_string);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ONE_INTEGER);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ZERO_INTEGER);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ZERO_INTEGER);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            for (remainder = NIL, remainder = reason; NIL != remainder; remainder = conses_high.cddr(remainder)) {
                                property = remainder.first();
                                value = conses_high.cadr(remainder);
                                if (NIL == list_utilities.member_eqP(property, $list106)) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_form(property, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != list_utilities.member_eqP(property, $list108)) {
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                                _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cdolist_list_var_$14 = value;
                                                    value_elem = NIL;
                                                    value_elem = cdolist_list_var_$14.first();
                                                    while (NIL != cdolist_list_var_$14) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                                        _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                                            _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_glyph($BULL, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                                            _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_form(value_elem, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                                            _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cdolist_list_var_$15 = Mapping.mapcar($sym110$SUPPORT_MT, hl_supports.hl_forward_mt_combos(value_elem));
                                                                mt = NIL;
                                                                mt = cdolist_list_var_$15.first();
                                                                while (NIL != cdolist_list_var_$15) {
                                                                    cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_indent(UNPROVIDED);
                                                                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                                                    mt = cdolist_list_var_$15.first();
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                        value_elem = cdolist_list_var_$14.first();
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } else {
                                                cb_utilities.cb_form(value, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
                html_utilities.html_newline(UNPROVIDED);
            } else {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str111$_d_answer__P, answer_count);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                if (NIL != inference) {
                    SubLObject justification_count = ZERO_INTEGER;
                    SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                    if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                        SubLObject idx_$20 = idx;
                        if (NIL == id_index.id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                            SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                            SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject v_answer;
                            for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                v_answer = Vectors.aref(vector_var, id);
                                if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                    if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                                        v_answer = $SKIP;
                                    }
                                    justification_count = Numbers.add(justification_count, inference_datastructures_inference.inference_answer_justification_count(v_answer));
                                }
                            }
                        }
                        SubLObject idx_$21 = idx;
                        if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                            SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                            SubLObject id2 = NIL;
                            SubLObject v_answer2 = NIL;
                            Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                    Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                    id2 = Hashtables.getEntryKey(cdohash_entry);
                                    v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                    justification_count = Numbers.add(justification_count, inference_datastructures_inference.inference_answer_justification_count(v_answer2));
                                }
                            } finally {
                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                    if (justification_count.numG(answer_count)) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str113$___d_justification__P, justification_count);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                }
                html_utilities.html_newline(UNPROVIDED);
                if (NIL == inference && answer_count.isZero() && NIL != assertions_high.single_literal_antecedent_ruleP(rule)) {
                    html_utilities.html_princ($str114$__No_inference_was_performed_sinc);
                }
            }
            if (NIL != $cb_forward_inference_browser_show_el_queriesP$.getDynamicValue(thread) && NIL != inference) {
                cb_query_browser.cb_show_inference_el_query(inference, NIL);
                html_utilities.html_newline(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_info = cdolist_list_var.first();
        }
        SubLObject next_name3 = cb_fib_next_trigger_support_link_name(trigger_support_num, type_keyword);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        if (NIL != next_name3) {
            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(next_name3);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 18400L)
    public static SubLObject cb_note_new_forward_inference_for_browsing(SubLObject inference, SubLObject rule, SubLObject more_info) {
        if (more_info == UNPROVIDED) {
            more_info = NIL;
        }
        if (NIL == cb_current_forward_inference_clump()) {
            return NIL;
        }
        more_info = conses_high.putf(more_info, $TRIGGER_SUPPORT, forward.current_forward_inference_gaf());
        SubLObject inference_info = new_forward_inference_info(inference, rule, more_info);
        add_forward_inference_info_to_clump(cb_current_forward_inference_clump(), inference_info);
        return inference;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 18900L)
    public static SubLObject prepare_to_browse_new_forward_inference(SubLObject triggering_assertion_or_sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        destroy_forward_inference_clump($cb_current_forward_inference_clump$.getDynamicValue(thread));
        $cb_current_forward_inference_clump$.setDynamicValue(new_forward_inference_clump(triggering_assertion_or_sentence), thread);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 19200L)
    public static SubLObject cleanup_from_browsing_new_forward_inference() {
        return NIL;
    }

    public static SubLObject declare_cb_forward_inference_browser_file() {
        declareFunction("cb_forward_inference_clump_lookup_by_id", "CB-FORWARD-INFERENCE-CLUMP-LOOKUP-BY-ID", 1, 0, false);
        declareFunction("forward_inference_clump_print_function_trampoline", "FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("forward_inference_clump_p", "FORWARD-INFERENCE-CLUMP-P", 1, 0, false);
        new $forward_inference_clump_p$UnaryFunction();
        declareFunction("fwd_inf_clump_id", "FWD-INF-CLUMP-ID", 1, 0, false);
        declareFunction("fwd_inf_clump_timestamp", "FWD-INF-CLUMP-TIMESTAMP", 1, 0, false);
        declareFunction("fwd_inf_clump_triggering_assertion", "FWD-INF-CLUMP-TRIGGERING-ASSERTION", 1, 0, false);
        declareFunction("fwd_inf_clump_inference_infos", "FWD-INF-CLUMP-INFERENCE-INFOS", 1, 0, false);
        declareFunction("_csetf_fwd_inf_clump_id", "_CSETF-FWD-INF-CLUMP-ID", 2, 0, false);
        declareFunction("_csetf_fwd_inf_clump_timestamp", "_CSETF-FWD-INF-CLUMP-TIMESTAMP", 2, 0, false);
        declareFunction("_csetf_fwd_inf_clump_triggering_assertion", "_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION", 2, 0, false);
        declareFunction("_csetf_fwd_inf_clump_inference_infos", "_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS", 2, 0, false);
        declareFunction("make_forward_inference_clump", "MAKE-FORWARD-INFERENCE-CLUMP", 0, 1, false);
        declareFunction("visit_defstruct_forward_inference_clump", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-CLUMP", 2, 0, false);
        declareFunction("visit_defstruct_object_forward_inference_clump_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD", 2, 0, false);
        declareFunction("valid_forward_inference_clump_p", "VALID-FORWARD-INFERENCE-CLUMP-P", 1, 0, false);
        declareFunction("new_forward_inference_clump", "NEW-FORWARD-INFERENCE-CLUMP", 1, 0, false);
        declareMacro("do_forward_inference_clump_inference_infos", "DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        declareFunction("destroy_forward_inference_clump", "DESTROY-FORWARD-INFERENCE-CLUMP", 1, 0, false);
        declareFunction("forward_inference_clump_id", "FORWARD-INFERENCE-CLUMP-ID", 1, 0, false);
        declareFunction("forward_inference_clump_timestamp", "FORWARD-INFERENCE-CLUMP-TIMESTAMP", 1, 0, false);
        declareFunction("forward_inference_clump_triggering_assertion", "FORWARD-INFERENCE-CLUMP-TRIGGERING-ASSERTION", 1, 0, false);
        declareFunction("forward_inference_clump_inference_infos", "FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS", 1, 0, false);
        declareFunction("add_forward_inference_info_to_clump", "ADD-FORWARD-INFERENCE-INFO-TO-CLUMP", 2, 0, false);
        declareFunction("forward_inference_clump_total_answer_count", "FORWARD-INFERENCE-CLUMP-TOTAL-ANSWER-COUNT", 1, 0, false);
        declareFunction("forward_inference_info_print_function_trampoline", "FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("forward_inference_info_p", "FORWARD-INFERENCE-INFO-P", 1, 0, false);
        new $forward_inference_info_p$UnaryFunction();
        declareFunction("fwd_inf_info_inference", "FWD-INF-INFO-INFERENCE", 1, 0, false);
        declareFunction("fwd_inf_info_rule", "FWD-INF-INFO-RULE", 1, 0, false);
        declareFunction("fwd_inf_info_more_info", "FWD-INF-INFO-MORE-INFO", 1, 0, false);
        declareFunction("_csetf_fwd_inf_info_inference", "_CSETF-FWD-INF-INFO-INFERENCE", 2, 0, false);
        declareFunction("_csetf_fwd_inf_info_rule", "_CSETF-FWD-INF-INFO-RULE", 2, 0, false);
        declareFunction("_csetf_fwd_inf_info_more_info", "_CSETF-FWD-INF-INFO-MORE-INFO", 2, 0, false);
        declareFunction("make_forward_inference_info", "MAKE-FORWARD-INFERENCE-INFO", 0, 1, false);
        declareFunction("visit_defstruct_forward_inference_info", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_forward_inference_info_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD", 2, 0, false);
        declareFunction("valid_forward_inference_info_p", "VALID-FORWARD-INFERENCE-INFO-P", 1, 0, false);
        declareFunction("new_forward_inference_info", "NEW-FORWARD-INFERENCE-INFO", 2, 1, false);
        declareFunction("destroy_inference_info", "DESTROY-INFERENCE-INFO", 1, 0, false);
        declareFunction("forward_inference_info_inference", "FORWARD-INFERENCE-INFO-INFERENCE", 1, 0, false);
        declareFunction("forward_inference_info_rule", "FORWARD-INFERENCE-INFO-RULE", 1, 0, false);
        declareFunction("forward_inference_info_more_info", "FORWARD-INFERENCE-INFO-MORE-INFO", 1, 0, false);
        declareFunction("inference_info_G", "INFERENCE-INFO->", 2, 0, false);
        declareFunction("inference_info_L", "INFERENCE-INFO-<", 2, 0, false);
        declareFunction("cb_current_forward_inference_clump", "CB-CURRENT-FORWARD-INFERENCE-CLUMP", 0, 0, false);
        declareMacro("do_current_forward_inference_infos", "DO-CURRENT-FORWARD-INFERENCE-INFOS");
        declareFunction("cb_forward_inference_browser", "CB-FORWARD-INFERENCE-BROWSER", 0, 1, false);
        declareFunction("cb_link_forward_inference_browser", "CB-LINK-FORWARD-INFERENCE-BROWSER", 0, 1, false);
        declareFunction("cb_forward_inference_browser_int", "CB-FORWARD-INFERENCE-BROWSER-INT", 1, 1, false);
        declareFunction("cb_fib_trigger_support_link_name", "CB-FIB-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false);
        declareFunction("cb_fib_next_trigger_support_link_name", "CB-FIB-NEXT-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false);
        declareFunction("cb_forward_inference_browser_show_infos", "CB-FORWARD-INFERENCE-BROWSER-SHOW-INFOS", 2, 0, false);
        declareFunction("cb_note_new_forward_inference_for_browsing", "CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING", 2, 1, false);
        declareFunction("prepare_to_browse_new_forward_inference", "PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE", 1, 0, false);
        declareFunction("cleanup_from_browsing_new_forward_inference", "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_forward_inference_browser_file() {
        $cb_forward_inference_clump_id_index$ = defparameter("*CB-FORWARD-INFERENCE-CLUMP-ID-INDEX*", id_index.new_id_index(UNPROVIDED, UNPROVIDED));
        $cb_forward_inference_browser_show_focus_sectionsP$ = SubLFiles.defparameter("*CB-FORWARD-INFERENCE-BROWSER-SHOW-FOCUS-SECTIONS?*", T);
        $cb_forward_inference_browser_show_el_queriesP$ = SubLFiles.defparameter("*CB-FORWARD-INFERENCE-BROWSER-SHOW-EL-QUERIES?*", NIL);
        $dtp_forward_inference_clump$ = defconstant("*DTP-FORWARD-INFERENCE-CLUMP*", $sym0$FORWARD_INFERENCE_CLUMP);
        $dtp_forward_inference_info$ = defconstant("*DTP-FORWARD-INFERENCE-INFO*", $sym35$FORWARD_INFERENCE_INFO);
        $cb_current_forward_inference_clump$ = defvar("*CB-CURRENT-FORWARD-INFERENCE-CLUMP*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_forward_inference_browser_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_inference_clump$.getGlobalValue(), Symbols.symbol_function($sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$FWD_INF_CLUMP_ID, $sym10$_CSETF_FWD_INF_CLUMP_ID);
        Structures.def_csetf($sym11$FWD_INF_CLUMP_TIMESTAMP, $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP);
        Structures.def_csetf($sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION, $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION);
        Structures.def_csetf($sym15$FWD_INF_CLUMP_INFERENCE_INFOS, $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS);
        Equality.identity($sym0$FORWARD_INFERENCE_CLUMP);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_inference_clump$.getGlobalValue(), Symbols.symbol_function($sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_inference_info$.getGlobalValue(), Symbols.symbol_function($sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list41);
        Structures.def_csetf($sym42$FWD_INF_INFO_INFERENCE, $sym43$_CSETF_FWD_INF_INFO_INFERENCE);
        Structures.def_csetf($sym44$FWD_INF_INFO_RULE, $sym45$_CSETF_FWD_INF_INFO_RULE);
        Structures.def_csetf($sym46$FWD_INF_INFO_MORE_INFO, $sym47$_CSETF_FWD_INF_INFO_MORE_INFO);
        Equality.identity($sym35$FORWARD_INFERENCE_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_inference_info$.getGlobalValue(), Symbols.symbol_function($sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD));
        utilities_macros.register_html_state_variable($sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_);
        html_macros.note_cgi_handler_function($sym57$CB_FORWARD_INFERENCE_BROWSER, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($FORWARD_INFERENCE_BROWSER, $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER, ONE_INTEGER);
        cb_utilities.declare_cb_tool($FORWARD_INFERENCE_BROWSER, $str64$Forward_Inference_Browser, $str59$FwdInf, $str65$Browse_the_most_recent_browsable_);
        access_macros.register_macro_helper($sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, $sym116$BROWSING_NEW_FORWARD_INFERENCE);
        access_macros.register_macro_helper($sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE, $sym116$BROWSING_NEW_FORWARD_INFERENCE);
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

    static {
        me = new cb_forward_inference_browser();
        $cb_forward_inference_clump_id_index$ = null;
        $cb_forward_inference_browser_show_focus_sectionsP$ = null;
        $cb_forward_inference_browser_show_el_queriesP$ = null;
        $dtp_forward_inference_clump$ = null;
        $dtp_forward_inference_info$ = null;
        $cb_current_forward_inference_clump$ = null;
        $sym0$FORWARD_INFERENCE_CLUMP = makeSymbol("FORWARD-INFERENCE-CLUMP");
        $sym1$FORWARD_INFERENCE_CLUMP_P = makeSymbol("FORWARD-INFERENCE-CLUMP-P");
        $list2 = list(makeSymbol("ID"), makeSymbol("TIMESTAMP"), makeSymbol("TRIGGERING-ASSERTION"), makeSymbol("INFERENCE-INFOS"));
        $list3 = list(makeKeyword("ID"), makeKeyword("TIMESTAMP"), makeKeyword("TRIGGERING-ASSERTION"), makeKeyword("INFERENCE-INFOS"));
        $list4 = list(makeSymbol("FWD-INF-CLUMP-ID"), makeSymbol("FWD-INF-CLUMP-TIMESTAMP"), makeSymbol("FWD-INF-CLUMP-TRIGGERING-ASSERTION"), makeSymbol("FWD-INF-CLUMP-INFERENCE-INFOS"));
        $list5 = list(makeSymbol("_CSETF-FWD-INF-CLUMP-ID"), makeSymbol("_CSETF-FWD-INF-CLUMP-TIMESTAMP"), makeSymbol("_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION"), makeSymbol("_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-INFERENCE-CLUMP-P"));
        $sym9$FWD_INF_CLUMP_ID = makeSymbol("FWD-INF-CLUMP-ID");
        $sym10$_CSETF_FWD_INF_CLUMP_ID = makeSymbol("_CSETF-FWD-INF-CLUMP-ID");
        $sym11$FWD_INF_CLUMP_TIMESTAMP = makeSymbol("FWD-INF-CLUMP-TIMESTAMP");
        $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP = makeSymbol("_CSETF-FWD-INF-CLUMP-TIMESTAMP");
        $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION = makeSymbol("FWD-INF-CLUMP-TRIGGERING-ASSERTION");
        $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION = makeSymbol("_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION");
        $sym15$FWD_INF_CLUMP_INFERENCE_INFOS = makeSymbol("FWD-INF-CLUMP-INFERENCE-INFOS");
        $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS = makeSymbol("_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS");
        $ID = makeKeyword("ID");
        $TIMESTAMP = makeKeyword("TIMESTAMP");
        $TRIGGERING_ASSERTION = makeKeyword("TRIGGERING-ASSERTION");
        $INFERENCE_INFOS = makeKeyword("INFERENCE-INFOS");
        $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym23$MAKE_FORWARD_INFERENCE_CLUMP = makeSymbol("MAKE-FORWARD-INFERENCE-CLUMP");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD");
        $FREE = makeKeyword("FREE");
        $list28 = list(list(makeSymbol("INFERENCE-INFO"), makeSymbol("CLUMP"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list29 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym32$DO_LIST = makeSymbol("DO-LIST");
        $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = makeSymbol("FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        $sym34$FORWARD_INFERENCE_INFO_P = makeSymbol("FORWARD-INFERENCE-INFO-P");
        $sym35$FORWARD_INFERENCE_INFO = makeSymbol("FORWARD-INFERENCE-INFO");
        $list36 = list(makeSymbol("INFERENCE"), makeSymbol("RULE"), makeSymbol("MORE-INFO"));
        $list37 = list(makeKeyword("INFERENCE"), makeKeyword("RULE"), makeKeyword("MORE-INFO"));
        $list38 = list(makeSymbol("FWD-INF-INFO-INFERENCE"), makeSymbol("FWD-INF-INFO-RULE"), makeSymbol("FWD-INF-INFO-MORE-INFO"));
        $list39 = list(makeSymbol("_CSETF-FWD-INF-INFO-INFERENCE"), makeSymbol("_CSETF-FWD-INF-INFO-RULE"), makeSymbol("_CSETF-FWD-INF-INFO-MORE-INFO"));
        $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list41 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-INFERENCE-INFO-P"));
        $sym42$FWD_INF_INFO_INFERENCE = makeSymbol("FWD-INF-INFO-INFERENCE");
        $sym43$_CSETF_FWD_INF_INFO_INFERENCE = makeSymbol("_CSETF-FWD-INF-INFO-INFERENCE");
        $sym44$FWD_INF_INFO_RULE = makeSymbol("FWD-INF-INFO-RULE");
        $sym45$_CSETF_FWD_INF_INFO_RULE = makeSymbol("_CSETF-FWD-INF-INFO-RULE");
        $sym46$FWD_INF_INFO_MORE_INFO = makeSymbol("FWD-INF-INFO-MORE-INFO");
        $sym47$_CSETF_FWD_INF_INFO_MORE_INFO = makeSymbol("_CSETF-FWD-INF-INFO-MORE-INFO");
        $INFERENCE = makeKeyword("INFERENCE");
        $RULE = makeKeyword("RULE");
        $MORE_INFO = makeKeyword("MORE-INFO");
        $sym51$MAKE_FORWARD_INFERENCE_INFO = makeSymbol("MAKE-FORWARD-INFERENCE-INFO");
        $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD");
        $sym53$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_ = makeSymbol("*CB-CURRENT-FORWARD-INFERENCE-CLUMP*");
        $list55 = list(list(makeSymbol("INFERENCE-INFO"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = makeSymbol("DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        $sym57$CB_FORWARD_INFERENCE_BROWSER = makeSymbol("CB-FORWARD-INFERENCE-BROWSER");
        $HTML_HANDLER = makeKeyword("HTML-HANDLER");
        $str59$FwdInf = makeString("FwdInf");
        $MAIN = makeKeyword("MAIN");
        $str61$cb_forward_inference_browser = makeString("cb-forward-inference-browser");
        $FORWARD_INFERENCE_BROWSER = makeKeyword("FORWARD-INFERENCE-BROWSER");
        $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER = makeSymbol("CB-LINK-FORWARD-INFERENCE-BROWSER");
        $str64$Forward_Inference_Browser = makeString("Forward Inference Browser");
        $str65$Browse_the_most_recent_browsable_ = makeString("Browse the most recent browsable forward inference");
        $str66$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str67$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $CB_CYC = makeKeyword("CB-CYC");
        $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $SHA1 = makeKeyword("SHA1");
        $str72$yui_skin_sam = makeString("yui-skin-sam");
        $str73$reloadFrameButton = makeString("reloadFrameButton");
        $str74$button = makeString("button");
        $str75$reload = makeString("reload");
        $str76$Refresh_Frames = makeString("Refresh Frames");
        $str77$No_forward_inferences_to_browse_ = makeString("No forward inferences to browse.");
        $sym78$_EXIT = makeSymbol("%EXIT");
        $str79$Last_browsable_forward_inference_ = makeString("Last browsable forward inference clump was triggered at ~a by the forward propagation of");
        $ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
        $str81$Successful_and_watched_results_ = makeString("Successful and watched results:");
        $str82$_all = makeString("#all");
        $str83$_Jump_to_all_results_ = makeString("[Jump to all results]");
        $FOCUS = makeKeyword("FOCUS");
        $str85$all = makeString("all");
        $str86$All_results = makeString("All results");
        $ALL = makeKeyword("ALL");
        $str88$_ = makeString("_");
        $TRIGGER_SUPPORT = makeKeyword("TRIGGER-SUPPORT");
        $REASON = makeKeyword("REASON");
        $str91$Propagating_rule__ = makeString("Propagating rule: ");
        $str92$Propagating__ = makeString("Propagating: ");
        $str93$_ = makeString("#");
        $str94$_Next_ = makeString("[Next]");
        $NBSP = makeKeyword("NBSP");
        $str96$_Jump_to_all_rules_ = makeString("[Jump to all rules]");
        $RARR = makeKeyword("RARR");
        $VERY_VERBOSE = makeKeyword("VERY-VERBOSE");
        $TYPE = makeKeyword("TYPE");
        $ASENT = makeKeyword("ASENT");
        $PLACEMENT_MT = makeKeyword("PLACEMENT-MT");
        $str102$ = makeString("");
        $str103$_into_mt_ = makeString(" into mt ");
        $INVISIBLE = makeKeyword("INVISIBLE");
        $PARAGRAPH = makeKeyword("PARAGRAPH");
        $list106 = list(makeKeyword("TYPE"), makeKeyword("ASENT"), makeKeyword("PLACEMENT-MT"));
        $TOP = makeKeyword("TOP");
        $list108 = list(makeKeyword("SUPPORTS"), makeKeyword("PRAGMATIC-SUPPORTS"));
        $BULL = makeKeyword("BULL");
        $sym110$SUPPORT_MT = makeSymbol("SUPPORT-MT");
        $str111$_d_answer__P = makeString("~d answer~:P");
        $SKIP = makeKeyword("SKIP");
        $str113$___d_justification__P = makeString(", ~d justification~:P");
        $str114$__No_inference_was_performed_sinc = makeString(" (No inference was performed since rule is a single literal antecedent rule)");
        $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = makeSymbol("PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE");
        $sym116$BROWSING_NEW_FORWARD_INFERENCE = makeSymbol("BROWSING-NEW-FORWARD-INFERENCE");
        $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE = makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE");
    }

    public static class $forward_inference_clump_native extends SubLStructNative {
        public SubLObject $id;
        public SubLObject $timestamp;
        public SubLObject $triggering_assertion;
        public SubLObject $inference_infos;
        private static SubLStructDeclNative structDecl;

        public $forward_inference_clump_native() {
            this.$id = CommonSymbols.NIL;
            this.$timestamp = CommonSymbols.NIL;
            this.$triggering_assertion = CommonSymbols.NIL;
            this.$inference_infos = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $forward_inference_clump_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$timestamp = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$triggering_assertion = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$inference_infos = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($forward_inference_clump_native.class, $sym0$FORWARD_INFERENCE_CLUMP, $sym1$FORWARD_INFERENCE_CLUMP_P, $list2, $list3, new String[] { "$id", "$timestamp", "$triggering_assertion", "$inference_infos" }, $list4, $list5,
                    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $forward_inference_clump_p$UnaryFunction extends UnaryFunction {
        public $forward_inference_clump_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-INFERENCE-CLUMP-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return forward_inference_clump_p(arg1);
        }
    }

    public static class $forward_inference_info_native extends SubLStructNative {
        public SubLObject $inference;
        public SubLObject $rule;
        public SubLObject $more_info;
        private static SubLStructDeclNative structDecl;

        public $forward_inference_info_native() {
            this.$inference = CommonSymbols.NIL;
            this.$rule = CommonSymbols.NIL;
            this.$more_info = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $forward_inference_info_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$rule = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$more_info = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($forward_inference_info_native.class, $sym35$FORWARD_INFERENCE_INFO, $sym34$FORWARD_INFERENCE_INFO_P, $list36, $list37, new String[] { "$inference", "$rule", "$more_info" }, $list38, $list39, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $forward_inference_info_p$UnaryFunction extends UnaryFunction {
        public $forward_inference_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-INFERENCE-INFO-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return forward_inference_info_p(arg1);
        }
    }
}
/*
 *
 * Total time: 817 ms synthetic
 */