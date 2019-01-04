package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cb_web_services;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cb_sentence_browser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_forward_inference_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser";
    public static final String myFingerPrint = "8368e68f0fd4163486b424d23b32586af7078fc39f846b659c3620bcbdbd4dfd";
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1064L)
    private static SubLSymbol $cb_forward_inference_clump_id_index$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1340L)
    private static SubLSymbol $cb_forward_inference_browser_show_focus_sectionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1418L)
    private static SubLSymbol $cb_forward_inference_browser_show_el_queriesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLSymbol $dtp_forward_inference_clump$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLSymbol $dtp_forward_inference_info$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8480L)
    public static SubLSymbol $cb_current_forward_inference_clump$;
    private static final SubLSymbol $sym0$FORWARD_INFERENCE_CLUMP;
    private static final SubLSymbol $sym1$FORWARD_INFERENCE_CLUMP_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FWD_INF_CLUMP_ID;
    private static final SubLSymbol $sym10$_CSETF_FWD_INF_CLUMP_ID;
    private static final SubLSymbol $sym11$FWD_INF_CLUMP_TIMESTAMP;
    private static final SubLSymbol $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP;
    private static final SubLSymbol $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION;
    private static final SubLSymbol $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION;
    private static final SubLSymbol $sym15$FWD_INF_CLUMP_INFERENCE_INFOS;
    private static final SubLSymbol $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS;
    private static final SubLSymbol $kw17$ID;
    private static final SubLSymbol $kw18$TIMESTAMP;
    private static final SubLSymbol $kw19$TRIGGERING_ASSERTION;
    private static final SubLSymbol $kw20$INFERENCE_INFOS;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_FORWARD_INFERENCE_CLUMP;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD;
    private static final SubLSymbol $kw27$FREE;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw31$DONE;
    private static final SubLSymbol $sym32$DO_LIST;
    private static final SubLSymbol $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS;
    private static final SubLSymbol $sym34$FORWARD_INFERENCE_INFO_P;
    private static final SubLSymbol $sym35$FORWARD_INFERENCE_INFO;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$FWD_INF_INFO_INFERENCE;
    private static final SubLSymbol $sym43$_CSETF_FWD_INF_INFO_INFERENCE;
    private static final SubLSymbol $sym44$FWD_INF_INFO_RULE;
    private static final SubLSymbol $sym45$_CSETF_FWD_INF_INFO_RULE;
    private static final SubLSymbol $sym46$FWD_INF_INFO_MORE_INFO;
    private static final SubLSymbol $sym47$_CSETF_FWD_INF_INFO_MORE_INFO;
    private static final SubLSymbol $kw48$INFERENCE;
    private static final SubLSymbol $kw49$RULE;
    private static final SubLSymbol $kw50$MORE_INFO;
    private static final SubLSymbol $sym51$MAKE_FORWARD_INFERENCE_INFO;
    private static final SubLSymbol $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD;
    private static final SubLSymbol $sym53$INFERENCE_P;
    private static final SubLSymbol $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS;
    private static final SubLSymbol $sym57$CB_FORWARD_INFERENCE_BROWSER;
    private static final SubLSymbol $kw58$HTML_HANDLER;
    private static final SubLString $str59$FwdInf;
    private static final SubLSymbol $kw60$MAIN;
    private static final SubLString $str61$cb_forward_inference_browser;
    private static final SubLSymbol $kw62$FORWARD_INFERENCE_BROWSER;
    private static final SubLSymbol $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER;
    private static final SubLString $str64$Forward_Inference_Browser;
    private static final SubLString $str65$Browse_the_most_recent_browsable_;
    private static final SubLString $str66$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str67$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw68$UNINITIALIZED;
    private static final SubLSymbol $kw69$CB_CYC;
    private static final SubLSymbol $kw70$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw71$SHA1;
    private static final SubLString $str72$yui_skin_sam;
    private static final SubLString $str73$reloadFrameButton;
    private static final SubLString $str74$button;
    private static final SubLString $str75$reload;
    private static final SubLString $str76$Refresh_Frames;
    private static final SubLString $str77$No_forward_inferences_to_browse_;
    private static final SubLSymbol $sym78$_EXIT;
    private static final SubLString $str79$Last_browsable_forward_inference_;
    private static final SubLSymbol $kw80$ANSWER_COUNT;
    private static final SubLString $str81$Successful_and_watched_results_;
    private static final SubLString $str82$_all;
    private static final SubLString $str83$_Jump_to_all_results_;
    private static final SubLSymbol $kw84$FOCUS;
    private static final SubLString $str85$all;
    private static final SubLString $str86$All_results;
    private static final SubLSymbol $kw87$ALL;
    private static final SubLString $str88$_;
    private static final SubLSymbol $kw89$TRIGGER_SUPPORT;
    private static final SubLSymbol $kw90$REASON;
    private static final SubLString $str91$Propagating_rule__;
    private static final SubLString $str92$Propagating__;
    private static final SubLString $str93$_;
    private static final SubLString $str94$_Next_;
    private static final SubLSymbol $kw95$NBSP;
    private static final SubLString $str96$_Jump_to_all_rules_;
    private static final SubLSymbol $kw97$RARR;
    private static final SubLSymbol $kw98$VERY_VERBOSE;
    private static final SubLSymbol $kw99$TYPE;
    private static final SubLSymbol $kw100$ASENT;
    private static final SubLSymbol $kw101$PLACEMENT_MT;
    private static final SubLString $str102$;
    private static final SubLString $str103$_into_mt_;
    private static final SubLSymbol $kw104$INVISIBLE;
    private static final SubLSymbol $kw105$PARAGRAPH;
    private static final SubLList $list106;
    private static final SubLSymbol $kw107$TOP;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$BULL;
    private static final SubLSymbol $sym110$SUPPORT_MT;
    private static final SubLString $str111$_d_answer__P;
    private static final SubLSymbol $kw112$SKIP;
    private static final SubLString $str113$___d_justification__P;
    private static final SubLString $str114$__No_inference_was_performed_sinc;
    private static final SubLSymbol $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE;
    private static final SubLSymbol $sym116$BROWSING_NEW_FORWARD_INFERENCE;
    private static final SubLSymbol $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1211L)
    public static SubLObject cb_forward_inference_clump_lookup_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return id_index.id_index_lookup(cb_forward_inference_browser.$cb_forward_inference_clump_id_index$.getDynamicValue(thread), id, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject forward_inference_clump_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject forward_inference_clump_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $forward_inference_clump_native.class) ? cb_forward_inference_browser.T : cb_forward_inference_browser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject fwd_inf_clump_id(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject fwd_inf_clump_timestamp(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject fwd_inf_clump_triggering_assertion(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject fwd_inf_clump_inference_infos(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject _csetf_fwd_inf_clump_id(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject _csetf_fwd_inf_clump_timestamp(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject _csetf_fwd_inf_clump_triggering_assertion(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject _csetf_fwd_inf_clump_inference_infos(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject make_forward_inference_clump(SubLObject arglist) {
        if (arglist == cb_forward_inference_browser.UNPROVIDED) {
            arglist = (SubLObject)cb_forward_inference_browser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $forward_inference_clump_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_forward_inference_browser.NIL, next = arglist; cb_forward_inference_browser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw17$ID)) {
                _csetf_fwd_inf_clump_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw18$TIMESTAMP)) {
                _csetf_fwd_inf_clump_timestamp(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw19$TRIGGERING_ASSERTION)) {
                _csetf_fwd_inf_clump_triggering_assertion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw20$INFERENCE_INFOS)) {
                _csetf_fwd_inf_clump_inference_infos(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_forward_inference_browser.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject visit_defstruct_forward_inference_clump(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw22$BEGIN, (SubLObject)cb_forward_inference_browser.$sym23$MAKE_FORWARD_INFERENCE_CLUMP, (SubLObject)cb_forward_inference_browser.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw17$ID, fwd_inf_clump_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw18$TIMESTAMP, fwd_inf_clump_timestamp(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw19$TRIGGERING_ASSERTION, fwd_inf_clump_triggering_assertion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw20$INFERENCE_INFOS, fwd_inf_clump_inference_infos(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw25$END, (SubLObject)cb_forward_inference_browser.$sym23$MAKE_FORWARD_INFERENCE_CLUMP, (SubLObject)cb_forward_inference_browser.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
    public static SubLObject visit_defstruct_object_forward_inference_clump_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_inference_clump(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1721L)
    public static SubLObject valid_forward_inference_clump_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_forward_inference_browser.NIL != forward_inference_clump_p(v_object) && cb_forward_inference_browser.$kw27$FREE != fwd_inf_clump_timestamp(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1887L)
    public static SubLObject new_forward_inference_clump(final SubLObject triggering_assertion_or_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject clump = make_forward_inference_clump((SubLObject)cb_forward_inference_browser.UNPROVIDED);
        final SubLObject id = id_index.id_index_reserve(cb_forward_inference_browser.$cb_forward_inference_clump_id_index$.getDynamicValue(thread));
        _csetf_fwd_inf_clump_id(clump, id);
        id_index.id_index_enter(cb_forward_inference_browser.$cb_forward_inference_clump_id_index$.getDynamicValue(thread), id, clump);
        _csetf_fwd_inf_clump_timestamp(clump, Time.get_universal_time());
        _csetf_fwd_inf_clump_triggering_assertion(clump, triggering_assertion_or_sentence);
        _csetf_fwd_inf_clump_inference_infos(clump, (SubLObject)cb_forward_inference_browser.NIL);
        return clump;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 2431L)
    public static SubLObject do_forward_inference_clump_inference_infos(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_forward_inference_browser.$list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_info = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject clump = (SubLObject)cb_forward_inference_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_forward_inference_browser.$list28);
        inference_info = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_forward_inference_browser.$list28);
        clump = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject current_$1 = (SubLObject)cb_forward_inference_browser.NIL;
        while (cb_forward_inference_browser.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_forward_inference_browser.$list28);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_forward_inference_browser.$list28);
            if (cb_forward_inference_browser.NIL == conses_high.member(current_$1, (SubLObject)cb_forward_inference_browser.$list29, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED)) {
                bad = (SubLObject)cb_forward_inference_browser.T;
            }
            if (current_$1 == cb_forward_inference_browser.$kw30$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_forward_inference_browser.NIL != bad && cb_forward_inference_browser.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_forward_inference_browser.$list28);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)cb_forward_inference_browser.$kw31$DONE, current);
        final SubLObject done = (SubLObject)((cb_forward_inference_browser.NIL != done_tail) ? conses_high.cadr(done_tail) : cb_forward_inference_browser.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)cb_forward_inference_browser.$sym32$DO_LIST, (SubLObject)ConsesLow.list(inference_info, (SubLObject)ConsesLow.list((SubLObject)cb_forward_inference_browser.$sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, clump), (SubLObject)cb_forward_inference_browser.$kw31$DONE, done), ConsesLow.append(body, (SubLObject)cb_forward_inference_browser.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 2662L)
    public static SubLObject destroy_forward_inference_clump(final SubLObject clump) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_forward_inference_browser.NIL != valid_forward_inference_clump_p(clump)) {
            SubLObject cdolist_list_var = forward_inference_clump_inference_infos(clump);
            SubLObject inference_info = (SubLObject)cb_forward_inference_browser.NIL;
            inference_info = cdolist_list_var.first();
            while (cb_forward_inference_browser.NIL != cdolist_list_var) {
                destroy_inference_info(inference_info);
                cdolist_list_var = cdolist_list_var.rest();
                inference_info = cdolist_list_var.first();
            }
            id_index.id_index_remove(cb_forward_inference_browser.$cb_forward_inference_clump_id_index$.getDynamicValue(thread), fwd_inf_clump_id(clump));
            _csetf_fwd_inf_clump_timestamp(clump, (SubLObject)cb_forward_inference_browser.$kw27$FREE);
            _csetf_fwd_inf_clump_triggering_assertion(clump, (SubLObject)cb_forward_inference_browser.$kw27$FREE);
            _csetf_fwd_inf_clump_inference_infos(clump, (SubLObject)cb_forward_inference_browser.$kw27$FREE);
        }
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3287L)
    public static SubLObject forward_inference_clump_id(final SubLObject clump) {
        return fwd_inf_clump_id(clump);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3387L)
    public static SubLObject forward_inference_clump_timestamp(final SubLObject clump) {
        return fwd_inf_clump_timestamp(clump);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3489L)
    public static SubLObject forward_inference_clump_triggering_assertion(final SubLObject clump) {
        SubLObject assertion = fwd_inf_clump_triggering_assertion(clump);
        if (cb_forward_inference_browser.NIL == assertion_handles.assertion_p(assertion)) {
            final SubLObject found_assertion = czer_meta.find_assertion_cycl(assertion, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
            if (cb_forward_inference_browser.NIL != assertion_handles.assertion_p(found_assertion)) {
                assertion = found_assertion;
                _csetf_fwd_inf_clump_triggering_assertion(clump, assertion);
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3891L)
    public static SubLObject forward_inference_clump_inference_infos(final SubLObject clump) {
        return fwd_inf_clump_inference_infos(clump);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4005L)
    public static SubLObject add_forward_inference_info_to_clump(final SubLObject clump, final SubLObject inference_info) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(inference_info) : inference_info;
        SubLObject inference_infos = forward_inference_clump_inference_infos(clump);
        inference_infos = ConsesLow.append(inference_infos, (SubLObject)ConsesLow.list(inference_info));
        _csetf_fwd_inf_clump_inference_infos(clump, inference_infos);
        return clump;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4397L)
    public static SubLObject forward_inference_clump_total_answer_count(final SubLObject clump) {
        SubLObject count = (SubLObject)cb_forward_inference_browser.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject inference_infos = cdolist_list_var = forward_inference_clump_inference_infos(clump);
        SubLObject inference_info = (SubLObject)cb_forward_inference_browser.NIL;
        inference_info = cdolist_list_var.first();
        while (cb_forward_inference_browser.NIL != cdolist_list_var) {
            final SubLObject inference = forward_inference_info_inference(inference_info);
            final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
            if (answer_count.isInteger()) {
                count = Numbers.add(count, answer_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_info = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject forward_inference_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject forward_inference_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $forward_inference_info_native.class) ? cb_forward_inference_browser.T : cb_forward_inference_browser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject fwd_inf_info_inference(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject fwd_inf_info_rule(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject fwd_inf_info_more_info(final SubLObject v_object) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject _csetf_fwd_inf_info_inference(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject _csetf_fwd_inf_info_rule(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject _csetf_fwd_inf_info_more_info(final SubLObject v_object, final SubLObject value) {
        assert cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject make_forward_inference_info(SubLObject arglist) {
        if (arglist == cb_forward_inference_browser.UNPROVIDED) {
            arglist = (SubLObject)cb_forward_inference_browser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $forward_inference_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_forward_inference_browser.NIL, next = arglist; cb_forward_inference_browser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw48$INFERENCE)) {
                _csetf_fwd_inf_info_inference(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw49$RULE)) {
                _csetf_fwd_inf_info_rule(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_forward_inference_browser.$kw50$MORE_INFO)) {
                _csetf_fwd_inf_info_more_info(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_forward_inference_browser.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject visit_defstruct_forward_inference_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw22$BEGIN, (SubLObject)cb_forward_inference_browser.$sym51$MAKE_FORWARD_INFERENCE_INFO, (SubLObject)cb_forward_inference_browser.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw48$INFERENCE, fwd_inf_info_inference(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw49$RULE, fwd_inf_info_rule(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw24$SLOT, (SubLObject)cb_forward_inference_browser.$kw50$MORE_INFO, fwd_inf_info_more_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_forward_inference_browser.$kw25$END, (SubLObject)cb_forward_inference_browser.$sym51$MAKE_FORWARD_INFERENCE_INFO, (SubLObject)cb_forward_inference_browser.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
    public static SubLObject visit_defstruct_object_forward_inference_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_inference_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5016L)
    public static SubLObject valid_forward_inference_info_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_forward_inference_browser.NIL != forward_inference_info_p(v_object) && cb_forward_inference_browser.$kw27$FREE != fwd_inf_info_inference(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5179L)
    public static SubLObject new_forward_inference_info(final SubLObject possible_inference, final SubLObject rule, SubLObject more_info) {
        if (more_info == cb_forward_inference_browser.UNPROVIDED) {
            more_info = (SubLObject)cb_forward_inference_browser.NIL;
        }
        if (cb_forward_inference_browser.NIL != possible_inference && !cb_forward_inference_browser.assertionsDisabledInClass && cb_forward_inference_browser.NIL == inference_datastructures_inference.inference_p(possible_inference)) {
            throw new AssertionError(possible_inference);
        }
        final SubLObject forward_inference_info = make_forward_inference_info((SubLObject)cb_forward_inference_browser.UNPROVIDED);
        _csetf_fwd_inf_info_inference(forward_inference_info, possible_inference);
        _csetf_fwd_inf_info_rule(forward_inference_info, rule);
        _csetf_fwd_inf_info_more_info(forward_inference_info, more_info);
        return forward_inference_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5654L)
    public static SubLObject destroy_inference_info(final SubLObject inference_info) {
        if (cb_forward_inference_browser.NIL != valid_forward_inference_info_p(inference_info)) {
            final SubLObject inference = forward_inference_info_inference(inference_info);
            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
            _csetf_fwd_inf_info_inference(inference_info, (SubLObject)cb_forward_inference_browser.$kw27$FREE);
            _csetf_fwd_inf_info_rule(inference_info, (SubLObject)cb_forward_inference_browser.$kw27$FREE);
            _csetf_fwd_inf_info_more_info(inference_info, (SubLObject)cb_forward_inference_browser.$kw27$FREE);
        }
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6101L)
    public static SubLObject forward_inference_info_inference(final SubLObject inference_info) {
        return fwd_inf_info_inference(inference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6231L)
    public static SubLObject forward_inference_info_rule(final SubLObject inference_info) {
        return fwd_inf_info_rule(inference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6339L)
    public static SubLObject forward_inference_info_more_info(final SubLObject inference_info) {
        return fwd_inf_info_more_info(inference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6457L)
    public static SubLObject inference_info_G(final SubLObject info1, final SubLObject info2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!info1.eql(info2) && cb_forward_inference_browser.NIL == inference_info_L(info1, info2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6603L)
    public static SubLObject inference_info_L(final SubLObject info1, final SubLObject info2) {
        final SubLObject inference1 = forward_inference_info_inference(info1);
        final SubLObject inference2 = forward_inference_info_inference(info2);
        final SubLObject store1 = (SubLObject)((cb_forward_inference_browser.NIL != inference1) ? inference_datastructures_inference.inference_problem_store(inference1) : cb_forward_inference_browser.NIL);
        final SubLObject store2 = (SubLObject)((cb_forward_inference_browser.NIL != inference2) ? inference_datastructures_inference.inference_problem_store(inference2) : cb_forward_inference_browser.NIL);
        final SubLObject answer_count_1 = (SubLObject)((cb_forward_inference_browser.NIL != inference1) ? inference_datastructures_inference.inference_answer_count(inference1) : cb_forward_inference_browser.ONE_INTEGER);
        final SubLObject answer_count_2 = (SubLObject)((cb_forward_inference_browser.NIL != inference2) ? inference_datastructures_inference.inference_answer_count(inference2) : cb_forward_inference_browser.ONE_INTEGER);
        final SubLObject problem_count_1 = (SubLObject)((cb_forward_inference_browser.NIL != store1) ? inference_datastructures_problem_store.problem_store_size(store1) : cb_forward_inference_browser.NIL);
        final SubLObject problem_count_2 = (SubLObject)((cb_forward_inference_browser.NIL != store2) ? inference_datastructures_problem_store.problem_store_size(store2) : cb_forward_inference_browser.NIL);
        final SubLObject store_id1 = (SubLObject)((cb_forward_inference_browser.NIL != store1) ? inference_datastructures_problem_store.problem_store_suid(store1) : cb_forward_inference_browser.NIL);
        final SubLObject store_id2 = (SubLObject)((cb_forward_inference_browser.NIL != store2) ? inference_datastructures_problem_store.problem_store_suid(store2) : cb_forward_inference_browser.NIL);
        final SubLObject id1 = (SubLObject)((cb_forward_inference_browser.NIL != inference1) ? inference_datastructures_inference.inference_suid(inference1) : cb_forward_inference_browser.NIL);
        final SubLObject id2 = (SubLObject)((cb_forward_inference_browser.NIL != inference2) ? inference_datastructures_inference.inference_suid(inference2) : cb_forward_inference_browser.NIL);
        if (cb_forward_inference_browser.NIL != subl_promotions.positive_integer_p(answer_count_1) && answer_count_2.isZero()) {
            return (SubLObject)cb_forward_inference_browser.NIL;
        }
        if (answer_count_1.isZero() && cb_forward_inference_browser.NIL != subl_promotions.positive_integer_p(answer_count_2)) {
            return (SubLObject)cb_forward_inference_browser.T;
        }
        if (cb_forward_inference_browser.NIL == inference1 && cb_forward_inference_browser.NIL == inference2) {
            return Numbers.numL(assertion_handles.assertion_id(forward_inference_info_rule(info2)), assertion_handles.assertion_id(forward_inference_info_rule(info2)));
        }
        if (cb_forward_inference_browser.NIL == inference1) {
            return (SubLObject)cb_forward_inference_browser.T;
        }
        if (cb_forward_inference_browser.NIL == inference2) {
            return (SubLObject)cb_forward_inference_browser.NIL;
        }
        if (store_id1.numL(store_id2)) {
            return (SubLObject)cb_forward_inference_browser.NIL;
        }
        if (store_id1.numG(store_id2)) {
            return (SubLObject)cb_forward_inference_browser.T;
        }
        if (id1.numL(id2)) {
            return (SubLObject)cb_forward_inference_browser.NIL;
        }
        if (id1.numG(id2)) {
            return (SubLObject)cb_forward_inference_browser.T;
        }
        if (problem_count_1.numL(problem_count_2)) {
            return (SubLObject)cb_forward_inference_browser.T;
        }
        if (problem_count_1.numG(problem_count_2)) {
            return (SubLObject)cb_forward_inference_browser.NIL;
        }
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8668L)
    public static SubLObject cb_current_forward_inference_clump() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_forward_inference_browser.$cb_current_forward_inference_clump$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8771L)
    public static SubLObject do_current_forward_inference_infos(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_forward_inference_browser.$list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_info = (SubLObject)cb_forward_inference_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_forward_inference_browser.$list55);
        inference_info = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject current_$2 = (SubLObject)cb_forward_inference_browser.NIL;
        while (cb_forward_inference_browser.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_forward_inference_browser.$list55);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_forward_inference_browser.$list55);
            if (cb_forward_inference_browser.NIL == conses_high.member(current_$2, (SubLObject)cb_forward_inference_browser.$list29, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED)) {
                bad = (SubLObject)cb_forward_inference_browser.T;
            }
            if (current_$2 == cb_forward_inference_browser.$kw30$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_forward_inference_browser.NIL != bad && cb_forward_inference_browser.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_forward_inference_browser.$list55);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)cb_forward_inference_browser.$kw31$DONE, current);
        final SubLObject done = (SubLObject)((cb_forward_inference_browser.NIL != done_tail) ? conses_high.cadr(done_tail) : cb_forward_inference_browser.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)cb_forward_inference_browser.$sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, (SubLObject)ConsesLow.list(inference_info, (SubLObject)cb_forward_inference_browser.$sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_, (SubLObject)cb_forward_inference_browser.$kw31$DONE, done), ConsesLow.append(body, (SubLObject)cb_forward_inference_browser.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8997L)
    public static SubLObject cb_forward_inference_browser(SubLObject args) {
        if (args == cb_forward_inference_browser.UNPROVIDED) {
            args = (SubLObject)cb_forward_inference_browser.NIL;
        }
        final SubLObject browser_title = (SubLObject)((cb_forward_inference_browser.NIL != args) ? args.first() : cb_forward_inference_browser.NIL);
        if (cb_forward_inference_browser.NIL != browser_title) {
            return cb_forward_inference_browser_int(cb_current_forward_inference_clump(), browser_title);
        }
        return cb_forward_inference_browser_int(cb_current_forward_inference_clump(), (SubLObject)cb_forward_inference_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 9424L)
    public static SubLObject cb_link_forward_inference_browser(SubLObject linktext) {
        if (linktext == cb_forward_inference_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_forward_inference_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_forward_inference_browser.NIL == linktext) {
            linktext = (SubLObject)cb_forward_inference_browser.$str59$FwdInf;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_forward_inference_browser.$kw60$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str61$cb_forward_inference_browser);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
        if (cb_forward_inference_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 9794L)
    public static SubLObject cb_forward_inference_browser_int(final SubLObject clump, SubLObject message) {
        if (message == cb_forward_inference_browser.UNPROVIDED) {
            message = (SubLObject)cb_forward_inference_browser.$str64$Forward_Inference_Browser;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = message;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_forward_inference_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str66$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_forward_inference_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str67$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_forward_inference_browser.$kw68$UNINITIALIZED) ? ConsesLow.list(cb_forward_inference_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_forward_inference_browser.$kw69$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_forward_inference_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_forward_inference_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str72$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str73$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str74$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str75$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str76$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            if (cb_forward_inference_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_forward_inference_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_forward_inference_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_forward_inference_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        if (cb_forward_inference_browser.NIL == forward_inference_clump_p(clump) || !forward_inference_clump_inference_infos(clump).isCons()) {
                            html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str77$No_forward_inferences_to_browse_);
                            return (SubLObject)cb_forward_inference_browser.NIL;
                        }
                        final SubLObject universal_time = forward_inference_clump_timestamp(clump);
                        final SubLObject triggering_assertion = forward_inference_clump_triggering_assertion(clump);
                        final SubLObject inference_infos = forward_inference_clump_inference_infos(clump);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_forward_inference_browser.$str79$Last_browsable_forward_inference_, numeric_date_utilities.timestring(universal_time));
                        html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        if (cb_forward_inference_browser.NIL != assertion_handles.assertion_p(triggering_assertion)) {
                            cb_utilities.cb_show_assertion_readably(triggering_assertion, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        }
                        else {
                            cb_sentence_browser.cb_show_sentence_readably(triggering_assertion, (SubLObject)cb_forward_inference_browser.NIL, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        }
                        html_utilities.html_newline((SubLObject)cb_forward_inference_browser.TWO_INTEGER);
                        SubLObject focus_infos = (SubLObject)cb_forward_inference_browser.NIL;
                        SubLObject out_of_focus_infos = (SubLObject)cb_forward_inference_browser.NIL;
                        if (cb_forward_inference_browser.NIL != cb_forward_inference_browser.$cb_forward_inference_browser_show_focus_sectionsP$.getDynamicValue(thread)) {
                            SubLObject last_rule = (SubLObject)cb_forward_inference_browser.NIL;
                            SubLObject focusP = (SubLObject)cb_forward_inference_browser.NIL;
                            SubLObject cdolist_list_var = inference_infos;
                            SubLObject inference_info = (SubLObject)cb_forward_inference_browser.NIL;
                            inference_info = cdolist_list_var.first();
                            while (cb_forward_inference_browser.NIL != cdolist_list_var) {
                                final SubLObject inference = forward_inference_info_inference(inference_info);
                                final SubLObject rule = forward_inference_info_rule(inference_info);
                                final SubLObject more_info = forward_inference_info_more_info(inference_info);
                                final SubLObject answer_count = (SubLObject)((cb_forward_inference_browser.NIL != inference) ? inference_datastructures_inference.inference_answer_count(inference) : ((cb_forward_inference_browser.NIL != list_utilities.plist_lookup(more_info, (SubLObject)cb_forward_inference_browser.$kw80$ANSWER_COUNT, (SubLObject)cb_forward_inference_browser.UNPROVIDED)) ? list_utilities.plist_lookup(more_info, (SubLObject)cb_forward_inference_browser.$kw80$ANSWER_COUNT, (SubLObject)cb_forward_inference_browser.UNPROVIDED) : cb_forward_inference_browser.ONE_INTEGER));
                                if (cb_forward_inference_browser.NIL == kb_utilities.kbeq(rule, last_rule)) {
                                    focusP = (SubLObject)cb_forward_inference_browser.NIL;
                                }
                                if (cb_forward_inference_browser.NIL != subl_promotions.positive_integer_p(answer_count) || cb_forward_inference_browser.NIL != cb_web_services.currently_bookmarkedP(rule, (SubLObject)cb_forward_inference_browser.UNPROVIDED) || cb_forward_inference_browser.NIL != list_utilities.member_kbeqP(rule, cb_parameters.$cb_assertion_history$.getDynamicValue(thread))) {
                                    focusP = (SubLObject)cb_forward_inference_browser.T;
                                }
                                if (cb_forward_inference_browser.NIL != focusP) {
                                    focus_infos = (SubLObject)ConsesLow.cons(inference_info, focus_infos);
                                }
                                out_of_focus_infos = (SubLObject)ConsesLow.cons(inference_info, out_of_focus_infos);
                                last_rule = rule;
                                cdolist_list_var = cdolist_list_var.rest();
                                inference_info = cdolist_list_var.first();
                            }
                        }
                        else {
                            focus_infos = inference_infos;
                        }
                        focus_infos = Sequences.nreverse(focus_infos);
                        out_of_focus_infos = Sequences.nreverse(out_of_focus_infos);
                        if (cb_forward_inference_browser.NIL != out_of_focus_infos) {
                            html_utilities.html_hr((SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str81$Successful_and_watched_results_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            if (cb_forward_inference_browser.NIL != out_of_focus_infos) {
                                html_utilities.html_indent((SubLObject)cb_forward_inference_browser.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str82$_all);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str83$_Jump_to_all_results_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        }
                        cb_forward_inference_browser_show_infos(focus_infos, (SubLObject)cb_forward_inference_browser.$kw84$FOCUS);
                        if (cb_forward_inference_browser.NIL != out_of_focus_infos) {
                            html_utilities.html_newline((SubLObject)cb_forward_inference_browser.TWO_INTEGER);
                            html_utilities.html_hr((SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_forward_inference_browser.$str85$all);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str86$All_results);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        }
                        cb_forward_inference_browser_show_infos(out_of_focus_infos, (SubLObject)cb_forward_inference_browser.$kw87$ALL);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 12981L)
    public static SubLObject cb_fib_trigger_support_link_name(final SubLObject support, final SubLObject type_keyword) {
        final SubLObject assertion_id = (SubLObject)((cb_forward_inference_browser.NIL != assertion_handles.assertion_p(support)) ? assertion_handles.assertion_id(support) : cb_forward_inference_browser.NIL);
        final SubLObject type_string = Symbols.symbol_name(type_keyword);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(type_string), new SubLObject[] { cb_forward_inference_browser.$str88$_, format_nil.format_nil_a_no_copy(assertion_id) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 13233L)
    public static SubLObject cb_fib_next_trigger_support_link_name(final SubLObject number, final SubLObject type_keyword) {
        final SubLObject type_string = Symbols.symbol_name(type_keyword);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(type_string), new SubLObject[] { cb_forward_inference_browser.$str88$_, format_nil.format_nil_a_no_copy(number) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 13413L)
    public static SubLObject cb_forward_inference_browser_show_infos(final SubLObject inference_infos, final SubLObject type_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trigger_support_num = (SubLObject)cb_forward_inference_browser.ZERO_INTEGER;
        SubLObject last_trigger_support = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject last_rule = (SubLObject)cb_forward_inference_browser.NIL;
        SubLObject cdolist_list_var = inference_infos;
        SubLObject inference_info = (SubLObject)cb_forward_inference_browser.NIL;
        inference_info = cdolist_list_var.first();
        while (cb_forward_inference_browser.NIL != cdolist_list_var) {
            final SubLObject inference = forward_inference_info_inference(inference_info);
            final SubLObject rule = forward_inference_info_rule(inference_info);
            final SubLObject more_info = forward_inference_info_more_info(inference_info);
            final SubLObject trigger_support = list_utilities.plist_lookup(more_info, (SubLObject)cb_forward_inference_browser.$kw89$TRIGGER_SUPPORT, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
            final SubLObject answer_count = (SubLObject)((cb_forward_inference_browser.NIL != inference) ? inference_datastructures_inference.inference_answer_count(inference) : ((cb_forward_inference_browser.NIL != list_utilities.plist_lookup(more_info, (SubLObject)cb_forward_inference_browser.$kw80$ANSWER_COUNT, (SubLObject)cb_forward_inference_browser.UNPROVIDED)) ? list_utilities.plist_lookup(more_info, (SubLObject)cb_forward_inference_browser.$kw80$ANSWER_COUNT, (SubLObject)cb_forward_inference_browser.UNPROVIDED) : cb_forward_inference_browser.ONE_INTEGER));
            final SubLObject reason = list_utilities.plist_lookup(more_info, (SubLObject)cb_forward_inference_browser.$kw90$REASON, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
            if (cb_forward_inference_browser.NIL == trigger_support || !trigger_support.equal(last_trigger_support)) {
                html_utilities.html_hr((SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                if (cb_forward_inference_browser.NIL == trigger_support) {
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str91$Propagating_rule__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                else {
                    SubLObject trigger_name = cb_fib_trigger_support_link_name(trigger_support, type_keyword);
                    final SubLObject next_name = cb_fib_next_trigger_support_link_name(trigger_support_num, type_keyword);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    if (cb_forward_inference_browser.NIL != trigger_name) {
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(trigger_name);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    if (cb_forward_inference_browser.NIL != next_name) {
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(next_name);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str92$Propagating__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    final SubLObject next_name2 = Sequences.cconcatenate((SubLObject)cb_forward_inference_browser.$str93$_, cb_fib_next_trigger_support_link_name(Numbers.add((SubLObject)cb_forward_inference_browser.ONE_INTEGER, trigger_support_num), type_keyword));
                    html_utilities.html_indent((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    html_utilities.html_markup(next_name2);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                        html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str94$_Next_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    if (cb_forward_inference_browser.NIL != assertion_handles.assertion_p(trigger_support)) {
                        cb_utilities.cb_show_assertion_readably(trigger_support, (SubLObject)cb_forward_inference_browser.T, (SubLObject)cb_forward_inference_browser.T);
                    }
                    else {
                        cb_utilities.cb_form(trigger_support, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    }
                    if (type_keyword == cb_forward_inference_browser.$kw84$FOCUS) {
                        trigger_name = Sequences.cconcatenate((SubLObject)cb_forward_inference_browser.$str93$_, cb_fib_trigger_support_link_name(trigger_support, (SubLObject)cb_forward_inference_browser.$kw87$ALL));
                        html_utilities.html_glyph((SubLObject)cb_forward_inference_browser.$kw95$NBSP, (SubLObject)cb_forward_inference_browser.THREE_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(trigger_name);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                            html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str96$_Jump_to_all_rules_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                }
                html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                trigger_support_num = Numbers.add(trigger_support_num, (SubLObject)cb_forward_inference_browser.ONE_INTEGER);
                last_trigger_support = trigger_support;
            }
            if (cb_forward_inference_browser.NIL != last_trigger_support && cb_forward_inference_browser.NIL == kb_utilities.kbeq(rule, last_rule)) {
                html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                cb_utilities.cb_show_assertion_readably(rule, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_glyph((SubLObject)cb_forward_inference_browser.$kw97$RARR, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                last_rule = rule;
            }
            if (cb_forward_inference_browser.NIL != inference) {
                cb_utilities.cb_link((SubLObject)cb_forward_inference_browser.$kw48$INFERENCE, inference, (SubLObject)cb_forward_inference_browser.$kw98$VERY_VERBOSE, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_forward_inference_browser.UNPROVIDED);
            }
            if (cb_forward_inference_browser.NIL != reason) {
                final SubLObject type = conses_high.getf(reason, (SubLObject)cb_forward_inference_browser.$kw99$TYPE, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                final SubLObject asent = conses_high.getf(reason, (SubLObject)cb_forward_inference_browser.$kw100$ASENT, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                final SubLObject placement_mt = conses_high.getf(reason, (SubLObject)cb_forward_inference_browser.$kw101$PLACEMENT_MT, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                final SubLObject other_keys = Sequences.remove((SubLObject)cb_forward_inference_browser.$kw99$TYPE, Sequences.remove((SubLObject)cb_forward_inference_browser.$kw100$ASENT, list_utilities.plist_keys(reason), (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED), (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                final SubLObject id_string = (SubLObject)((cb_forward_inference_browser.NIL != other_keys) ? Symbols.symbol_name(Symbols.gensym((SubLObject)cb_forward_inference_browser.UNPROVIDED)) : cb_forward_inference_browser.NIL);
                if (cb_forward_inference_browser.NIL != other_keys) {
                    dhtml_macros.dhtml_switch_visibility_links_arrows(id_string, (SubLObject)cb_forward_inference_browser.$str102$);
                }
                cb_utilities.cb_form(type, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                cb_utilities.cb_form(asent, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                if (cb_forward_inference_browser.NIL != placement_mt) {
                    html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str103$_into_mt_);
                    cb_utilities.cb_form(placement_mt, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                }
                if (cb_forward_inference_browser.NIL != other_keys) {
                    dhtml_macros.dhtml_set_switched_visibility(id_string, (SubLObject)cb_forward_inference_browser.$kw104$INVISIBLE, (SubLObject)cb_forward_inference_browser.$kw105$PARAGRAPH);
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (cb_forward_inference_browser.NIL != id_string) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(id_string);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_forward_inference_browser.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
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
                            for (remainder = (SubLObject)cb_forward_inference_browser.NIL, remainder = reason; cb_forward_inference_browser.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                                property = remainder.first();
                                value = conses_high.cadr(remainder);
                                if (cb_forward_inference_browser.NIL == list_utilities.member_eqP(property, (SubLObject)cb_forward_inference_browser.$list106)) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                    _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_forward_inference_browser.$kw107$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                            cb_utilities.cb_form(property, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_forward_inference_browser.$kw107$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                        _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                            if (cb_forward_inference_browser.NIL != list_utilities.member_eqP(property, (SubLObject)cb_forward_inference_browser.$list108)) {
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_forward_inference_browser.ZERO_INTEGER);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                                    cdolist_list_var_$14 = value;
                                                    value_elem = (SubLObject)cb_forward_inference_browser.NIL;
                                                    value_elem = cdolist_list_var_$14.first();
                                                    while (cb_forward_inference_browser.NIL != cdolist_list_var_$14) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                        _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_forward_inference_browser.$kw107$TOP));
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                                                html_utilities.html_glyph((SubLObject)cb_forward_inference_browser.$kw109$BULL, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_forward_inference_browser.$kw107$TOP));
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                                                cb_utilities.cb_form(value_elem, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_forward_inference_browser.$kw107$TOP));
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                            _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
                                                                cdolist_list_var_$15 = Mapping.mapcar((SubLObject)cb_forward_inference_browser.$sym110$SUPPORT_MT, hl_supports.hl_forward_mt_combos(value_elem));
                                                                mt = (SubLObject)cb_forward_inference_browser.NIL;
                                                                mt = cdolist_list_var_$15.first();
                                                                while (cb_forward_inference_browser.NIL != cdolist_list_var_$15) {
                                                                    cb_utilities.cb_form(mt, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                                    html_utilities.html_indent((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                                                    mt = cdolist_list_var_$15.first();
                                                                }
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                        value_elem = cdolist_list_var_$14.first();
                                                    }
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            }
                                            else {
                                                cb_utilities.cb_form(value, (SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                }
                html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
            }
            else {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_forward_inference_browser.$str111$_d_answer__P, answer_count);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                if (cb_forward_inference_browser.NIL != inference) {
                    SubLObject justification_count = (SubLObject)cb_forward_inference_browser.ZERO_INTEGER;
                    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                    if (cb_forward_inference_browser.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)cb_forward_inference_browser.$kw112$SKIP)) {
                        final SubLObject idx_$20 = idx;
                        if (cb_forward_inference_browser.NIL == id_index.id_index_dense_objects_empty_p(idx_$20, (SubLObject)cb_forward_inference_browser.$kw112$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                            final SubLObject backwardP_var = (SubLObject)cb_forward_inference_browser.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject v_answer;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_forward_inference_browser.NIL, v_iteration = (SubLObject)cb_forward_inference_browser.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_forward_inference_browser.ONE_INTEGER)) {
                                id = ((cb_forward_inference_browser.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_forward_inference_browser.ONE_INTEGER) : v_iteration);
                                v_answer = Vectors.aref(vector_var, id);
                                if (cb_forward_inference_browser.NIL == id_index.id_index_tombstone_p(v_answer) || cb_forward_inference_browser.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_forward_inference_browser.$kw112$SKIP)) {
                                    if (cb_forward_inference_browser.NIL != id_index.id_index_tombstone_p(v_answer)) {
                                        v_answer = (SubLObject)cb_forward_inference_browser.$kw112$SKIP;
                                    }
                                    justification_count = Numbers.add(justification_count, inference_datastructures_inference.inference_answer_justification_count(v_answer));
                                }
                            }
                        }
                        final SubLObject idx_$21 = idx;
                        if (cb_forward_inference_browser.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                            final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                            SubLObject id2 = (SubLObject)cb_forward_inference_browser.NIL;
                            SubLObject v_answer2 = (SubLObject)cb_forward_inference_browser.NIL;
                            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                    id2 = Hashtables.getEntryKey(cdohash_entry);
                                    v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                    justification_count = Numbers.add(justification_count, inference_datastructures_inference.inference_answer_justification_count(v_answer2));
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                    if (justification_count.numG(answer_count)) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_forward_inference_browser.$str113$___d_justification__P, justification_count);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                }
                html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
                if (cb_forward_inference_browser.NIL == inference && answer_count.isZero() && cb_forward_inference_browser.NIL != assertions_high.single_literal_antecedent_ruleP(rule)) {
                    html_utilities.html_princ((SubLObject)cb_forward_inference_browser.$str114$__No_inference_was_performed_sinc);
                }
            }
            if (cb_forward_inference_browser.NIL != cb_forward_inference_browser.$cb_forward_inference_browser_show_el_queriesP$.getDynamicValue(thread) && cb_forward_inference_browser.NIL != inference) {
                cb_query_browser.cb_show_inference_el_query(inference, (SubLObject)cb_forward_inference_browser.NIL);
                html_utilities.html_newline((SubLObject)cb_forward_inference_browser.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_info = cdolist_list_var.first();
        }
        final SubLObject next_name3 = cb_fib_next_trigger_support_link_name(trigger_support_num, type_keyword);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        if (cb_forward_inference_browser.NIL != next_name3) {
            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
            html_utilities.html_markup(next_name3);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_forward_inference_browser.UNPROVIDED);
        final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_forward_inference_browser.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 18494L)
    public static SubLObject cb_note_new_forward_inference_for_browsing(final SubLObject inference, final SubLObject rule, SubLObject more_info) {
        if (more_info == cb_forward_inference_browser.UNPROVIDED) {
            more_info = (SubLObject)cb_forward_inference_browser.NIL;
        }
        if (cb_forward_inference_browser.NIL == cb_current_forward_inference_clump()) {
            return (SubLObject)cb_forward_inference_browser.NIL;
        }
        more_info = conses_high.putf(more_info, (SubLObject)cb_forward_inference_browser.$kw89$TRIGGER_SUPPORT, forward.current_forward_inference_gaf());
        final SubLObject inference_info = new_forward_inference_info(inference, rule, more_info);
        add_forward_inference_info_to_clump(cb_current_forward_inference_clump(), inference_info);
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 18931L)
    public static SubLObject prepare_to_browse_new_forward_inference(final SubLObject triggering_assertion_or_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        destroy_forward_inference_clump(cb_forward_inference_browser.$cb_current_forward_inference_clump$.getDynamicValue(thread));
        cb_forward_inference_browser.$cb_current_forward_inference_clump$.setDynamicValue(new_forward_inference_clump(triggering_assertion_or_sentence), thread);
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 19266L)
    public static SubLObject cleanup_from_browsing_new_forward_inference() {
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    public static SubLObject declare_cb_forward_inference_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_forward_inference_clump_lookup_by_id", "CB-FORWARD-INFERENCE-CLUMP-LOOKUP-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_print_function_trampoline", "FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_p", "FORWARD-INFERENCE-CLUMP-P", 1, 0, false);
        new $forward_inference_clump_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_clump_id", "FWD-INF-CLUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_clump_timestamp", "FWD-INF-CLUMP-TIMESTAMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_clump_triggering_assertion", "FWD-INF-CLUMP-TRIGGERING-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_clump_inference_infos", "FWD-INF-CLUMP-INFERENCE-INFOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_clump_id", "_CSETF-FWD-INF-CLUMP-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_clump_timestamp", "_CSETF-FWD-INF-CLUMP-TIMESTAMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_clump_triggering_assertion", "_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_clump_inference_infos", "_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "make_forward_inference_clump", "MAKE-FORWARD-INFERENCE-CLUMP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "visit_defstruct_forward_inference_clump", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-CLUMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "visit_defstruct_object_forward_inference_clump_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "valid_forward_inference_clump_p", "VALID-FORWARD-INFERENCE-CLUMP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "new_forward_inference_clump", "NEW-FORWARD-INFERENCE-CLUMP", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "do_forward_inference_clump_inference_infos", "DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "destroy_forward_inference_clump", "DESTROY-FORWARD-INFERENCE-CLUMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_id", "FORWARD-INFERENCE-CLUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_timestamp", "FORWARD-INFERENCE-CLUMP-TIMESTAMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_triggering_assertion", "FORWARD-INFERENCE-CLUMP-TRIGGERING-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_inference_infos", "FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "add_forward_inference_info_to_clump", "ADD-FORWARD-INFERENCE-INFO-TO-CLUMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_clump_total_answer_count", "FORWARD-INFERENCE-CLUMP-TOTAL-ANSWER-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_info_print_function_trampoline", "FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_info_p", "FORWARD-INFERENCE-INFO-P", 1, 0, false);
        new $forward_inference_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_info_inference", "FWD-INF-INFO-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_info_rule", "FWD-INF-INFO-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "fwd_inf_info_more_info", "FWD-INF-INFO-MORE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_info_inference", "_CSETF-FWD-INF-INFO-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_info_rule", "_CSETF-FWD-INF-INFO-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "_csetf_fwd_inf_info_more_info", "_CSETF-FWD-INF-INFO-MORE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "make_forward_inference_info", "MAKE-FORWARD-INFERENCE-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "visit_defstruct_forward_inference_info", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "visit_defstruct_object_forward_inference_info_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "valid_forward_inference_info_p", "VALID-FORWARD-INFERENCE-INFO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "new_forward_inference_info", "NEW-FORWARD-INFERENCE-INFO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "destroy_inference_info", "DESTROY-INFERENCE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_info_inference", "FORWARD-INFERENCE-INFO-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_info_rule", "FORWARD-INFERENCE-INFO-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "forward_inference_info_more_info", "FORWARD-INFERENCE-INFO-MORE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "inference_info_G", "INFERENCE-INFO->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "inference_info_L", "INFERENCE-INFO-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_current_forward_inference_clump", "CB-CURRENT-FORWARD-INFERENCE-CLUMP", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "do_current_forward_inference_infos", "DO-CURRENT-FORWARD-INFERENCE-INFOS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_forward_inference_browser", "CB-FORWARD-INFERENCE-BROWSER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_link_forward_inference_browser", "CB-LINK-FORWARD-INFERENCE-BROWSER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_forward_inference_browser_int", "CB-FORWARD-INFERENCE-BROWSER-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_fib_trigger_support_link_name", "CB-FIB-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_fib_next_trigger_support_link_name", "CB-FIB-NEXT-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_forward_inference_browser_show_infos", "CB-FORWARD-INFERENCE-BROWSER-SHOW-INFOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cb_note_new_forward_inference_for_browsing", "CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "prepare_to_browse_new_forward_inference", "PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser", "cleanup_from_browsing_new_forward_inference", "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE", 0, 0, false);
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    public static SubLObject init_cb_forward_inference_browser_file() {
        cb_forward_inference_browser.$cb_forward_inference_clump_id_index$ = SubLFiles.defparameter("*CB-FORWARD-INFERENCE-CLUMP-ID-INDEX*", id_index.new_id_index((SubLObject)cb_forward_inference_browser.UNPROVIDED, (SubLObject)cb_forward_inference_browser.UNPROVIDED));
        cb_forward_inference_browser.$cb_forward_inference_browser_show_focus_sectionsP$ = SubLFiles.defparameter("*CB-FORWARD-INFERENCE-BROWSER-SHOW-FOCUS-SECTIONS?*", (SubLObject)cb_forward_inference_browser.T);
        cb_forward_inference_browser.$cb_forward_inference_browser_show_el_queriesP$ = SubLFiles.defparameter("*CB-FORWARD-INFERENCE-BROWSER-SHOW-EL-QUERIES?*", (SubLObject)cb_forward_inference_browser.NIL);
        cb_forward_inference_browser.$dtp_forward_inference_clump$ = SubLFiles.defconstant("*DTP-FORWARD-INFERENCE-CLUMP*", (SubLObject)cb_forward_inference_browser.$sym0$FORWARD_INFERENCE_CLUMP);
        cb_forward_inference_browser.$dtp_forward_inference_info$ = SubLFiles.defconstant("*DTP-FORWARD-INFERENCE-INFO*", (SubLObject)cb_forward_inference_browser.$sym35$FORWARD_INFERENCE_INFO);
        cb_forward_inference_browser.$cb_current_forward_inference_clump$ = SubLFiles.defvar("*CB-CURRENT-FORWARD-INFERENCE-CLUMP*", (SubLObject)cb_forward_inference_browser.NIL);
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    public static SubLObject setup_cb_forward_inference_browser_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_forward_inference_browser.$dtp_forward_inference_clump$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_forward_inference_browser.$sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_forward_inference_browser.$list8);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym9$FWD_INF_CLUMP_ID, (SubLObject)cb_forward_inference_browser.$sym10$_CSETF_FWD_INF_CLUMP_ID);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym11$FWD_INF_CLUMP_TIMESTAMP, (SubLObject)cb_forward_inference_browser.$sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION, (SubLObject)cb_forward_inference_browser.$sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym15$FWD_INF_CLUMP_INFERENCE_INFOS, (SubLObject)cb_forward_inference_browser.$sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS);
        Equality.identity((SubLObject)cb_forward_inference_browser.$sym0$FORWARD_INFERENCE_CLUMP);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_forward_inference_browser.$dtp_forward_inference_clump$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_forward_inference_browser.$sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_forward_inference_browser.$dtp_forward_inference_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_forward_inference_browser.$sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_forward_inference_browser.$list41);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym42$FWD_INF_INFO_INFERENCE, (SubLObject)cb_forward_inference_browser.$sym43$_CSETF_FWD_INF_INFO_INFERENCE);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym44$FWD_INF_INFO_RULE, (SubLObject)cb_forward_inference_browser.$sym45$_CSETF_FWD_INF_INFO_RULE);
        Structures.def_csetf((SubLObject)cb_forward_inference_browser.$sym46$FWD_INF_INFO_MORE_INFO, (SubLObject)cb_forward_inference_browser.$sym47$_CSETF_FWD_INF_INFO_MORE_INFO);
        Equality.identity((SubLObject)cb_forward_inference_browser.$sym35$FORWARD_INFERENCE_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_forward_inference_browser.$dtp_forward_inference_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_forward_inference_browser.$sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD));
        utilities_macros.register_html_state_variable((SubLObject)cb_forward_inference_browser.$sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_);
        html_macros.note_cgi_handler_function((SubLObject)cb_forward_inference_browser.$sym57$CB_FORWARD_INFERENCE_BROWSER, (SubLObject)cb_forward_inference_browser.$kw58$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_forward_inference_browser.$kw62$FORWARD_INFERENCE_BROWSER, (SubLObject)cb_forward_inference_browser.$sym63$CB_LINK_FORWARD_INFERENCE_BROWSER, (SubLObject)cb_forward_inference_browser.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_forward_inference_browser.$kw62$FORWARD_INFERENCE_BROWSER, (SubLObject)cb_forward_inference_browser.$str64$Forward_Inference_Browser, (SubLObject)cb_forward_inference_browser.$str59$FwdInf, (SubLObject)cb_forward_inference_browser.$str65$Browse_the_most_recent_browsable_);
        access_macros.register_macro_helper((SubLObject)cb_forward_inference_browser.$sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, (SubLObject)cb_forward_inference_browser.$sym116$BROWSING_NEW_FORWARD_INFERENCE);
        access_macros.register_macro_helper((SubLObject)cb_forward_inference_browser.$sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE, (SubLObject)cb_forward_inference_browser.$sym116$BROWSING_NEW_FORWARD_INFERENCE);
        return (SubLObject)cb_forward_inference_browser.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_forward_inference_browser_file();
    }
    
    public void initializeVariables() {
        init_cb_forward_inference_browser_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_forward_inference_browser_file();
    }
    
    static {
        me = (SubLFile)new cb_forward_inference_browser();
        cb_forward_inference_browser.$cb_forward_inference_clump_id_index$ = null;
        cb_forward_inference_browser.$cb_forward_inference_browser_show_focus_sectionsP$ = null;
        cb_forward_inference_browser.$cb_forward_inference_browser_show_el_queriesP$ = null;
        cb_forward_inference_browser.$dtp_forward_inference_clump$ = null;
        cb_forward_inference_browser.$dtp_forward_inference_info$ = null;
        cb_forward_inference_browser.$cb_current_forward_inference_clump$ = null;
        $sym0$FORWARD_INFERENCE_CLUMP = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-CLUMP");
        $sym1$FORWARD_INFERENCE_CLUMP_P = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-CLUMP-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("TIMESTAMP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGERING-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-INFOS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("TIMESTAMP"), (SubLObject)SubLObjectFactory.makeKeyword("TRIGGERING-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-INFOS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-ID"), (SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-TIMESTAMP"), (SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-TRIGGERING-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-INFERENCE-INFOS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-TIMESTAMP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-CLUMP-P"));
        $sym9$FWD_INF_CLUMP_ID = SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-ID");
        $sym10$_CSETF_FWD_INF_CLUMP_ID = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-ID");
        $sym11$FWD_INF_CLUMP_TIMESTAMP = SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-TIMESTAMP");
        $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-TIMESTAMP");
        $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION = SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-TRIGGERING-ASSERTION");
        $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION");
        $sym15$FWD_INF_CLUMP_INFERENCE_INFOS = SubLObjectFactory.makeSymbol("FWD-INF-CLUMP-INFERENCE-INFOS");
        $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS");
        $kw17$ID = SubLObjectFactory.makeKeyword("ID");
        $kw18$TIMESTAMP = SubLObjectFactory.makeKeyword("TIMESTAMP");
        $kw19$TRIGGERING_ASSERTION = SubLObjectFactory.makeKeyword("TRIGGERING-ASSERTION");
        $kw20$INFERENCE_INFOS = SubLObjectFactory.makeKeyword("INFERENCE-INFOS");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_FORWARD_INFERENCE_CLUMP = SubLObjectFactory.makeSymbol("MAKE-FORWARD-INFERENCE-CLUMP");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD");
        $kw27$FREE = SubLObjectFactory.makeKeyword("FREE");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("CLUMP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw30$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw31$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym32$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        $sym34$FORWARD_INFERENCE_INFO_P = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-INFO-P");
        $sym35$FORWARD_INFERENCE_INFO = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-INFO");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-INFO"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeKeyword("MORE-INFO"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-INFO-INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-INFO-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("FWD-INF-INFO-MORE-INFO"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-INFO-INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-INFO-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-INFO-MORE-INFO"));
        $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-INFO-P"));
        $sym42$FWD_INF_INFO_INFERENCE = SubLObjectFactory.makeSymbol("FWD-INF-INFO-INFERENCE");
        $sym43$_CSETF_FWD_INF_INFO_INFERENCE = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-INFO-INFERENCE");
        $sym44$FWD_INF_INFO_RULE = SubLObjectFactory.makeSymbol("FWD-INF-INFO-RULE");
        $sym45$_CSETF_FWD_INF_INFO_RULE = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-INFO-RULE");
        $sym46$FWD_INF_INFO_MORE_INFO = SubLObjectFactory.makeSymbol("FWD-INF-INFO-MORE-INFO");
        $sym47$_CSETF_FWD_INF_INFO_MORE_INFO = SubLObjectFactory.makeSymbol("_CSETF-FWD-INF-INFO-MORE-INFO");
        $kw48$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $kw49$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw50$MORE_INFO = SubLObjectFactory.makeKeyword("MORE-INFO");
        $sym51$MAKE_FORWARD_INFERENCE_INFO = SubLObjectFactory.makeSymbol("MAKE-FORWARD-INFERENCE-INFO");
        $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD");
        $sym53$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_ = SubLObjectFactory.makeSymbol("*CB-CURRENT-FORWARD-INFERENCE-CLUMP*");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = SubLObjectFactory.makeSymbol("DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS");
        $sym57$CB_FORWARD_INFERENCE_BROWSER = SubLObjectFactory.makeSymbol("CB-FORWARD-INFERENCE-BROWSER");
        $kw58$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str59$FwdInf = SubLObjectFactory.makeString("FwdInf");
        $kw60$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str61$cb_forward_inference_browser = SubLObjectFactory.makeString("cb-forward-inference-browser");
        $kw62$FORWARD_INFERENCE_BROWSER = SubLObjectFactory.makeKeyword("FORWARD-INFERENCE-BROWSER");
        $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER = SubLObjectFactory.makeSymbol("CB-LINK-FORWARD-INFERENCE-BROWSER");
        $str64$Forward_Inference_Browser = SubLObjectFactory.makeString("Forward Inference Browser");
        $str65$Browse_the_most_recent_browsable_ = SubLObjectFactory.makeString("Browse the most recent browsable forward inference");
        $str66$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str67$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw68$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw69$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw70$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw71$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str72$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str73$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str74$button = SubLObjectFactory.makeString("button");
        $str75$reload = SubLObjectFactory.makeString("reload");
        $str76$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str77$No_forward_inferences_to_browse_ = SubLObjectFactory.makeString("No forward inferences to browse.");
        $sym78$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str79$Last_browsable_forward_inference_ = SubLObjectFactory.makeString("Last browsable forward inference clump was triggered at ~a by the forward propagation of");
        $kw80$ANSWER_COUNT = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $str81$Successful_and_watched_results_ = SubLObjectFactory.makeString("Successful and watched results:");
        $str82$_all = SubLObjectFactory.makeString("#all");
        $str83$_Jump_to_all_results_ = SubLObjectFactory.makeString("[Jump to all results]");
        $kw84$FOCUS = SubLObjectFactory.makeKeyword("FOCUS");
        $str85$all = SubLObjectFactory.makeString("all");
        $str86$All_results = SubLObjectFactory.makeString("All results");
        $kw87$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str88$_ = SubLObjectFactory.makeString("_");
        $kw89$TRIGGER_SUPPORT = SubLObjectFactory.makeKeyword("TRIGGER-SUPPORT");
        $kw90$REASON = SubLObjectFactory.makeKeyword("REASON");
        $str91$Propagating_rule__ = SubLObjectFactory.makeString("Propagating rule: ");
        $str92$Propagating__ = SubLObjectFactory.makeString("Propagating: ");
        $str93$_ = SubLObjectFactory.makeString("#");
        $str94$_Next_ = SubLObjectFactory.makeString("[Next]");
        $kw95$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str96$_Jump_to_all_rules_ = SubLObjectFactory.makeString("[Jump to all rules]");
        $kw97$RARR = SubLObjectFactory.makeKeyword("RARR");
        $kw98$VERY_VERBOSE = SubLObjectFactory.makeKeyword("VERY-VERBOSE");
        $kw99$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw100$ASENT = SubLObjectFactory.makeKeyword("ASENT");
        $kw101$PLACEMENT_MT = SubLObjectFactory.makeKeyword("PLACEMENT-MT");
        $str102$ = SubLObjectFactory.makeString("");
        $str103$_into_mt_ = SubLObjectFactory.makeString(" into mt ");
        $kw104$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw105$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("PLACEMENT-MT"));
        $kw107$TOP = SubLObjectFactory.makeKeyword("TOP");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS"));
        $kw109$BULL = SubLObjectFactory.makeKeyword("BULL");
        $sym110$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $str111$_d_answer__P = SubLObjectFactory.makeString("~d answer~:P");
        $kw112$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str113$___d_justification__P = SubLObjectFactory.makeString(", ~d justification~:P");
        $str114$__No_inference_was_performed_sinc = SubLObjectFactory.makeString(" (No inference was performed since rule is a single literal antecedent rule)");
        $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = SubLObjectFactory.makeSymbol("PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE");
        $sym116$BROWSING_NEW_FORWARD_INFERENCE = SubLObjectFactory.makeSymbol("BROWSING-NEW-FORWARD-INFERENCE");
        $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE = SubLObjectFactory.makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE");
    }
    
    public static final class $forward_inference_clump_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $timestamp;
        public SubLObject $triggering_assertion;
        public SubLObject $inference_infos;
        private static final SubLStructDeclNative structDecl;
        
        public $forward_inference_clump_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$timestamp = (SubLObject)CommonSymbols.NIL;
            this.$triggering_assertion = (SubLObject)CommonSymbols.NIL;
            this.$inference_infos = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$forward_inference_clump_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$timestamp;
        }
        
        public SubLObject getField4() {
            return this.$triggering_assertion;
        }
        
        public SubLObject getField5() {
            return this.$inference_infos;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$timestamp = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$triggering_assertion = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$inference_infos = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$forward_inference_clump_native.class, cb_forward_inference_browser.$sym0$FORWARD_INFERENCE_CLUMP, cb_forward_inference_browser.$sym1$FORWARD_INFERENCE_CLUMP_P, cb_forward_inference_browser.$list2, cb_forward_inference_browser.$list3, new String[] { "$id", "$timestamp", "$triggering_assertion", "$inference_infos" }, cb_forward_inference_browser.$list4, cb_forward_inference_browser.$list5, cb_forward_inference_browser.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $forward_inference_clump_p$UnaryFunction extends UnaryFunction
    {
        public $forward_inference_clump_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-INFERENCE-CLUMP-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cb_forward_inference_browser.forward_inference_clump_p(arg1);
        }
    }
    
    public static final class $forward_inference_info_native extends SubLStructNative
    {
        public SubLObject $inference;
        public SubLObject $rule;
        public SubLObject $more_info;
        private static final SubLStructDeclNative structDecl;
        
        public $forward_inference_info_native() {
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$rule = (SubLObject)CommonSymbols.NIL;
            this.$more_info = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$forward_inference_info_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$inference;
        }
        
        public SubLObject getField3() {
            return this.$rule;
        }
        
        public SubLObject getField4() {
            return this.$more_info;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$rule = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$more_info = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$forward_inference_info_native.class, cb_forward_inference_browser.$sym35$FORWARD_INFERENCE_INFO, cb_forward_inference_browser.$sym34$FORWARD_INFERENCE_INFO_P, cb_forward_inference_browser.$list36, cb_forward_inference_browser.$list37, new String[] { "$inference", "$rule", "$more_info" }, cb_forward_inference_browser.$list38, cb_forward_inference_browser.$list39, cb_forward_inference_browser.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $forward_inference_info_p$UnaryFunction extends UnaryFunction
    {
        public $forward_inference_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-INFERENCE-INFO-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cb_forward_inference_browser.forward_inference_info_p(arg1);
        }
    }
}

/*

	Total time: 817 ms
	 synthetic 
*/