package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
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

public class inference_worker_restriction extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction";
    public static String myFingerPrint = "139c2c2a29122c6811adf3405fd3e349b633800c1bca122ce7959544975a16bc";
    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLSymbol $dtp_restriction_link_data$;
    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLSymbol $dtp_restriction_listening_link_data$;
    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12000L)
    public static SubLSymbol $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$;
    private static SubLSymbol $sym0$RESTRICTION_LINK_DATA;
    private static SubLSymbol $sym1$RESTRICTION_LINK_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$RESTR_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym10$_CSETF_RESTR_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym11$RESTR_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym12$_CSETF_RESTR_LINK_DATA_HL_MODULE;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $HL_MODULE;
    private static SubLString $str15$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym17$MAKE_RESTRICTION_LINK_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD;
    private static SubLSymbol $sym21$RESTRICTION_LISTENING_LINK_DATA;
    private static SubLSymbol $sym22$RESTRICTION_LISTENING_LINK_DATA_P;
    private static SubLList $list23;
    private static SubLList $list24;
    private static SubLList $list25;
    private static SubLList $list26;
    private static SubLSymbol $sym27$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list28;
    private static SubLSymbol $sym29$RESTR_LISTEN_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym30$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS;
    private static SubLSymbol $sym31$RESTR_LISTEN_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym32$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE;
    private static SubLSymbol $sym33$RESTR_LISTEN_LINK_DATA_LISTENERS;
    private static SubLSymbol $sym34$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS;
    private static SubLSymbol $LISTENERS;
    private static SubLSymbol $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA;
    private static SubLSymbol $sym37$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD;
    private static SubLSymbol $sym38$PROBLEM_P;
    private static SubLSymbol $sym39$MAPPED_PROBLEM_P;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $FREE;
    private static SubLSymbol $sym43$RESTRICTION_LINK_P;
    private static SubLSymbol $sym44$BINDING_LIST_P;
    private static SubLSymbol $sym45$HL_MODULE_P;
    private static SubLSymbol $sym46$TACTIC_P;
    private static SubLList $list47;
    private static SubLList $list48;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym51$DO_LIST;
    private static SubLSymbol $sym52$RESTRICTION_LINK_LISTENERS;
    private static SubLString $str53$No_tactic_found_for__S;
    private static SubLSymbol $sym54$RESTRICTION_PROOF_P;
    private static SubLSymbol $SIMPLIFICATION;

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject restriction_link_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject restriction_link_data_p(SubLObject v_object) {
        return (v_object.getClass() == $restriction_link_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject restr_link_data_bindings(SubLObject v_object) {
        assert NIL != restriction_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject restr_link_data_hl_module(SubLObject v_object) {
        assert NIL != restriction_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject _csetf_restr_link_data_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != restriction_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject _csetf_restr_link_data_hl_module(SubLObject v_object, SubLObject value) {
        assert NIL != restriction_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject make_restriction_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $restriction_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BINDINGS)) {
                _csetf_restr_link_data_bindings(v_new, current_value);
            } else if (pcase_var.eql($HL_MODULE)) {
                _csetf_restr_link_data_hl_module(v_new, current_value);
            } else {
                Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject visit_defstruct_restriction_link_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym17$MAKE_RESTRICTION_LINK_DATA, TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, restr_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_MODULE, restr_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym17$MAKE_RESTRICTION_LINK_DATA, TWO_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1200L)
    public static SubLObject visit_defstruct_object_restriction_link_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_restriction_link_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject restriction_listening_link_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject restriction_listening_link_data_p(SubLObject v_object) {
        return (v_object.getClass() == $restriction_listening_link_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject restr_listen_link_data_bindings(SubLObject v_object) {
        assert NIL != restriction_listening_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject restr_listen_link_data_hl_module(SubLObject v_object) {
        assert NIL != restriction_listening_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject restr_listen_link_data_listeners(SubLObject v_object) {
        assert NIL != restriction_listening_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject _csetf_restr_listen_link_data_bindings(SubLObject v_object, SubLObject value) {
        assert NIL != restriction_listening_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject _csetf_restr_listen_link_data_hl_module(SubLObject v_object, SubLObject value) {
        assert NIL != restriction_listening_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject _csetf_restr_listen_link_data_listeners(SubLObject v_object, SubLObject value) {
        assert NIL != restriction_listening_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject make_restriction_listening_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $restriction_listening_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BINDINGS)) {
                _csetf_restr_listen_link_data_bindings(v_new, current_value);
            } else if (pcase_var.eql($HL_MODULE)) {
                _csetf_restr_listen_link_data_hl_module(v_new, current_value);
            } else if (pcase_var.eql($LISTENERS)) {
                _csetf_restr_listen_link_data_listeners(v_new, current_value);
            } else {
                Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject visit_defstruct_restriction_listening_link_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $BINDINGS, restr_listen_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_MODULE, restr_listen_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LISTENERS, restr_listen_link_data_listeners(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1600L)
    public static SubLObject visit_defstruct_object_restriction_listening_link_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_restriction_listening_link_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 2300L)
    public static SubLObject new_restriction_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject hl_module) {
        if (listening_linkP == UNPROVIDED) {
            listening_linkP = NIL;
        }
        if (hl_module == UNPROVIDED) {
            hl_module = NIL;
        }
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : supported_problem;
        if (NIL != supporting_mapped_problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem)) {
            throw new AssertionError(supporting_mapped_problem);
        }
        SubLObject link = inference_datastructures_problem_link.new_problem_link($RESTRICTION, supported_problem);
        if (NIL != listening_linkP) {
            new_restriction_listening_link_data(link);
        } else {
            new_restriction_link_data(link);
        }
        if (NIL != hl_module) {
            set_restriction_link_hl_module(link, hl_module);
        }
        set_restriction_link_bindings(link, restriction_bindings);
        clear_restriction_link_listeners(link);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, link);
        inference_datastructures_problem_link.problem_link_open_all(link);
        inference_worker.propagate_problem_link(link);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3300L)
    public static SubLObject new_restriction_link_data(SubLObject restriction_link) {
        SubLObject data = make_restriction_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(restriction_link, data);
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3500L)
    public static SubLObject new_restriction_listening_link_data(SubLObject restriction_link) {
        SubLObject data = make_restriction_listening_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(restriction_link, data);
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3700L)
    public static SubLObject destroy_restriction_link(SubLObject restriction_link) {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) {
                inference_worker_join_ordered.remove_join_ordered_link_restricted_non_focal_link(jo_link, restriction_link);
            }
        }
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            _csetf_restr_link_data_bindings(data, $FREE);
            _csetf_restr_link_data_hl_module(data, $FREE);
        } else {
            _csetf_restr_listen_link_data_bindings(data, $FREE);
            _csetf_restr_listen_link_data_hl_module(data, $FREE);
            _csetf_restr_listen_link_data_listeners(data, $FREE);
        }
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 4400L)
    public static SubLObject restriction_link_bindings(SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            return restr_link_data_bindings(data);
        }
        return restr_listen_link_data_bindings(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 4900L)
    public static SubLObject restriction_link_hl_module(SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            return restr_link_data_hl_module(data);
        }
        return restr_listen_link_data_hl_module(data);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5200L)
    public static SubLObject restriction_link_listeners(SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_listening_link_data_p(data)) {
            return restr_listen_link_data_listeners(data);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5400L)
    public static SubLObject set_restriction_link_bindings(SubLObject restriction_link, SubLObject v_bindings) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        assert NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            _csetf_restr_link_data_bindings(data, v_bindings);
        } else {
            _csetf_restr_listen_link_data_bindings(data, v_bindings);
        }
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5900L)
    public static SubLObject set_restriction_link_hl_module(SubLObject restriction_link, SubLObject hl_module) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            _csetf_restr_link_data_hl_module(data, hl_module);
        } else {
            _csetf_restr_listen_link_data_hl_module(data, hl_module);
        }
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 6400L)
    public static SubLObject clear_restriction_link_listeners(SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_listening_link_data_p(data)) {
            _csetf_restr_listen_link_data_listeners(data, NIL);
        }
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 6700L)
    public static SubLObject add_restriction_link_listener(SubLObject restriction_link, SubLObject tactic) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_listening_link_data_p(data) && NIL == conses_high.member(tactic, restr_listen_link_data_listeners(data), EQUAL, Symbols.symbol_function(IDENTITY))) {
            _csetf_restr_listen_link_data_listeners(data, cons(tactic, restr_listen_link_data_listeners(data)));
        }
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7000L)
    public static SubLObject do_restriction_link_listeners(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject listener = NIL;
        SubLObject restriction_link = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        listener = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
        restriction_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == conses_high.member(current_$1, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list47);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym51$DO_LIST, list(listener, list($sym52$RESTRICTION_LINK_LISTENERS, restriction_link), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7300L)
    public static SubLObject restriction_listening_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && NIL != restriction_listening_link_data_p(inference_datastructures_problem_link.problem_link_data(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7600L)
    public static SubLObject restriction_link_supporting_mapped_problem(SubLObject restriction_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(restriction_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7800L)
    public static SubLObject restriction_link_supporting_variable_map(SubLObject restriction_link) {
        SubLObject supporting_mapped_problem = restriction_link_supporting_mapped_problem(restriction_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8100L)
    public static SubLObject restriction_link_tactic(SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : restriction_link;
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        SubLObject hl_module = restriction_link_hl_module(restriction_link);
        if (NIL != hl_module) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = NIL;
            candidate_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (hl_module.eql(inference_datastructures_tactic.tactic_hl_module(candidate_tactic))) {
                    return candidate_tactic;
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_tactic = cdolist_list_var.first();
            }
            if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
                return Errors.error($str53$No_tactic_found_for__S, restriction_link);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8600L)
    public static SubLObject restriction_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $RESTRICTION == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8800L)
    public static SubLObject maybe_new_restriction_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject tactic) {
        if (listening_linkP == UNPROVIDED) {
            listening_linkP = NIL;
        }
        if (tactic == UNPROVIDED) {
            tactic = NIL;
        }
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && NIL != restriction_link_p(dependent_link) && supported_problem.eql(inference_datastructures_problem_link.problem_link_supported_problem(dependent_link))
                    && NIL != bindings.bindings_equalP(restriction_bindings, restriction_link_bindings(dependent_link))) {
                return dependent_link;
            }
        }
        SubLObject hl_module = (NIL != tactic) ? inference_datastructures_tactic.tactic_hl_module(tactic) : NIL;
        return new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 9700L)
    public static SubLObject bubble_up_proof_to_restriction_link(SubLObject restricted_proof, SubLObject restricted_variable_map, SubLObject restriction_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject restricted_bindings = inference_datastructures_proof.proof_bindings(restricted_proof);
        SubLObject restriction_bindings = restriction_link_bindings(restriction_link);
        SubLObject unrestricted_bindings = inference_worker.proof_bindings_from_constituents(restriction_bindings, restricted_bindings, restricted_variable_map);
        thread.resetMultipleValues();
        SubLObject unrestricted_proof = new_restriction_proof(restriction_link, restricted_proof, unrestricted_bindings);
        SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_worker_rewrite.trigger_restriction_link_listeners(restriction_link, restricted_proof);
        if (NIL != newP) {
            inference_worker.bubble_up_proof(unrestricted_proof);
        } else {
            inference_worker.possibly_note_proof_processed(restricted_proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11100L)
    public static SubLObject new_restriction_proof(SubLObject restriction_link, SubLObject restricted_proof, SubLObject unrestricted_bindings) {
        SubLObject subproofs = list(restricted_proof);
        return inference_worker.propose_new_proof_with_bindings(restriction_link, inference_worker.canonicalize_proof_bindings(unrestricted_bindings), subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11600L)
    public static SubLObject restriction_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && $RESTRICTION == inference_datastructures_proof.proof_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11700L)
    public static SubLObject problem_has_restriction_linkP(SubLObject problem) {
        return inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $RESTRICTION);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11900L)
    public static SubLObject restriction_proof_hl_module(SubLObject proof) {
        assert NIL != restriction_proof_p(proof) : proof;
        return restriction_link_hl_module(inference_datastructures_proof.proof_link(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12300L)
    public static SubLObject simplification_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(tactic) && NIL != simplification_modules.simplification_module_p(inference_datastructures_tactic.tactic_hl_module(tactic)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12500L)
    public static SubLObject simplification_link_p(SubLObject v_object) {
        return makeBoolean(NIL != restriction_link_p(v_object) && NIL != simplification_modules.simplification_module_p(restriction_link_hl_module(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12600L)
    public static SubLObject problem_is_a_simplificationP(SubLObject problem) {
        return inference_datastructures_problem.problem_has_dependent_link_of_typeP(problem, $SIMPLIFICATION);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12800L)
    public static SubLObject problem_has_a_simplificationP(SubLObject problem) {
        return inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $SIMPLIFICATION);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12900L)
    public static SubLObject problem_first_simplified_supporting_problem(SubLObject problem) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject simp_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            simp_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, simp_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(simp_link, $SIMPLIFICATION)) {
                return inference_datastructures_problem_link.problem_link_sole_supporting_problem(simp_link);
            }
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_restriction_file() {
        declareFunction(myName, "restriction_link_data_print_function_trampoline", "RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "restriction_link_data_p", "RESTRICTION-LINK-DATA-P", 1, 0, false);
        new $restriction_link_data_p$UnaryFunction();
        declareFunction(myName, "restr_link_data_bindings", "RESTR-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction(myName, "restr_link_data_hl_module", "RESTR-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction(myName, "_csetf_restr_link_data_bindings", "_CSETF-RESTR-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_restr_link_data_hl_module", "_CSETF-RESTR-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction(myName, "make_restriction_link_data", "MAKE-RESTRICTION-LINK-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_restriction_link_data", "VISIT-DEFSTRUCT-RESTRICTION-LINK-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_restriction_link_data_method", "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "restriction_listening_link_data_print_function_trampoline", "RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "restriction_listening_link_data_p", "RESTRICTION-LISTENING-LINK-DATA-P", 1, 0, false);
        new $restriction_listening_link_data_p$UnaryFunction();
        declareFunction(myName, "restr_listen_link_data_bindings", "RESTR-LISTEN-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction(myName, "restr_listen_link_data_hl_module", "RESTR-LISTEN-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction(myName, "restr_listen_link_data_listeners", "RESTR-LISTEN-LINK-DATA-LISTENERS", 1, 0, false);
        declareFunction(myName, "_csetf_restr_listen_link_data_bindings", "_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction(myName, "_csetf_restr_listen_link_data_hl_module", "_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction(myName, "_csetf_restr_listen_link_data_listeners", "_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS", 2, 0, false);
        declareFunction(myName, "make_restriction_listening_link_data", "MAKE-RESTRICTION-LISTENING-LINK-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_restriction_listening_link_data", "VISIT-DEFSTRUCT-RESTRICTION-LISTENING-LINK-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_restriction_listening_link_data_method", "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LISTENING-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "new_restriction_link", "NEW-RESTRICTION-LINK", 3, 2, false);
        declareFunction(myName, "new_restriction_link_data", "NEW-RESTRICTION-LINK-DATA", 1, 0, false);
        declareFunction(myName, "new_restriction_listening_link_data", "NEW-RESTRICTION-LISTENING-LINK-DATA", 1, 0, false);
        declareFunction(myName, "destroy_restriction_link", "DESTROY-RESTRICTION-LINK", 1, 0, false);
        declareFunction(myName, "restriction_link_bindings", "RESTRICTION-LINK-BINDINGS", 1, 0, false);
        declareFunction(myName, "restriction_link_hl_module", "RESTRICTION-LINK-HL-MODULE", 1, 0, false);
        declareFunction(myName, "restriction_link_listeners", "RESTRICTION-LINK-LISTENERS", 1, 0, false);
        declareFunction(myName, "set_restriction_link_bindings", "SET-RESTRICTION-LINK-BINDINGS", 2, 0, false);
        declareFunction(myName, "set_restriction_link_hl_module", "SET-RESTRICTION-LINK-HL-MODULE", 2, 0, false);
        declareFunction(myName, "clear_restriction_link_listeners", "CLEAR-RESTRICTION-LINK-LISTENERS", 1, 0, false);
        declareFunction(myName, "add_restriction_link_listener", "ADD-RESTRICTION-LINK-LISTENER", 2, 0, false);
        declareMacro(me, "do_restriction_link_listeners", "DO-RESTRICTION-LINK-LISTENERS");
        declareFunction(myName, "restriction_listening_link_p", "RESTRICTION-LISTENING-LINK-P", 1, 0, false);
        declareFunction(myName, "restriction_link_supporting_mapped_problem", "RESTRICTION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "restriction_link_supporting_variable_map", "RESTRICTION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "restriction_link_tactic", "RESTRICTION-LINK-TACTIC", 1, 0, false);
        declareFunction(myName, "restriction_link_p", "RESTRICTION-LINK-P", 1, 0, false);
        declareFunction(myName, "maybe_new_restriction_link", "MAYBE-NEW-RESTRICTION-LINK", 3, 2, false);
        declareFunction(myName, "bubble_up_proof_to_restriction_link", "BUBBLE-UP-PROOF-TO-RESTRICTION-LINK", 3, 0, false);
        declareFunction(myName, "new_restriction_proof", "NEW-RESTRICTION-PROOF", 3, 0, false);
        declareFunction(myName, "restriction_proof_p", "RESTRICTION-PROOF-P", 1, 0, false);
        declareFunction(myName, "problem_has_restriction_linkP", "PROBLEM-HAS-RESTRICTION-LINK?", 1, 0, false);
        declareFunction(myName, "restriction_proof_hl_module", "RESTRICTION-PROOF-HL-MODULE", 1, 0, false);
        declareFunction(myName, "simplification_tactic_p", "SIMPLIFICATION-TACTIC-P", 1, 0, false);
        declareFunction(myName, "simplification_link_p", "SIMPLIFICATION-LINK-P", 1, 0, false);
        declareFunction(myName, "problem_is_a_simplificationP", "PROBLEM-IS-A-SIMPLIFICATION?", 1, 0, false);
        declareFunction(myName, "problem_has_a_simplificationP", "PROBLEM-HAS-A-SIMPLIFICATION?", 1, 0, false);
        declareFunction(myName, "problem_first_simplified_supporting_problem", "PROBLEM-FIRST-SIMPLIFIED-SUPPORTING-PROBLEM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_restriction_file() {
        $dtp_restriction_link_data$ = defconstant("*DTP-RESTRICTION-LINK-DATA*", $sym0$RESTRICTION_LINK_DATA);
        $dtp_restriction_listening_link_data$ = defconstant("*DTP-RESTRICTION-LISTENING-LINK-DATA*", $sym21$RESTRICTION_LISTENING_LINK_DATA);
        $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = SubLFiles.defparameter("*SIMPLIFICATION-TACTICS-EXECUTE-EARLY-AND-PASS-DOWN-TRANSFORMATION-MOTIVATION?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_worker_restriction_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$RESTR_LINK_DATA_BINDINGS, $sym10$_CSETF_RESTR_LINK_DATA_BINDINGS);
        Structures.def_csetf($sym11$RESTR_LINK_DATA_HL_MODULE, $sym12$_CSETF_RESTR_LINK_DATA_HL_MODULE);
        Equality.identity($sym0$RESTRICTION_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), Symbols.symbol_function($sym20$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), Symbols.symbol_function($sym27$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list28);
        Structures.def_csetf($sym29$RESTR_LISTEN_LINK_DATA_BINDINGS, $sym30$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS);
        Structures.def_csetf($sym31$RESTR_LISTEN_LINK_DATA_HL_MODULE, $sym32$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE);
        Structures.def_csetf($sym33$RESTR_LISTEN_LINK_DATA_LISTENERS, $sym34$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS);
        Equality.identity($sym21$RESTRICTION_LISTENING_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), Symbols.symbol_function($sym37$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_restriction_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_restriction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_restriction_file();
    }

    static {
        me = new inference_worker_restriction();
        $dtp_restriction_link_data$ = null;
        $dtp_restriction_listening_link_data$ = null;
        $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = null;
        $sym0$RESTRICTION_LINK_DATA = makeSymbol("RESTRICTION-LINK-DATA");
        $sym1$RESTRICTION_LINK_DATA_P = makeSymbol("RESTRICTION-LINK-DATA-P");
        $list2 = list(makeSymbol("BINDINGS"), makeSymbol("HL-MODULE"));
        $list3 = list(makeKeyword("BINDINGS"), makeKeyword("HL-MODULE"));
        $list4 = list(makeSymbol("RESTR-LINK-DATA-BINDINGS"), makeSymbol("RESTR-LINK-DATA-HL-MODULE"));
        $list5 = list(makeSymbol("_CSETF-RESTR-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RESTR-LINK-DATA-HL-MODULE"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RESTRICTION-LINK-DATA-P"));
        $sym9$RESTR_LINK_DATA_BINDINGS = makeSymbol("RESTR-LINK-DATA-BINDINGS");
        $sym10$_CSETF_RESTR_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RESTR-LINK-DATA-BINDINGS");
        $sym11$RESTR_LINK_DATA_HL_MODULE = makeSymbol("RESTR-LINK-DATA-HL-MODULE");
        $sym12$_CSETF_RESTR_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RESTR-LINK-DATA-HL-MODULE");
        $BINDINGS = makeKeyword("BINDINGS");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym17$MAKE_RESTRICTION_LINK_DATA = makeSymbol("MAKE-RESTRICTION-LINK-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LINK-DATA-METHOD");
        $sym21$RESTRICTION_LISTENING_LINK_DATA = makeSymbol("RESTRICTION-LISTENING-LINK-DATA");
        $sym22$RESTRICTION_LISTENING_LINK_DATA_P = makeSymbol("RESTRICTION-LISTENING-LINK-DATA-P");
        $list23 = list(makeSymbol("BINDINGS"), makeSymbol("HL-MODULE"), makeSymbol("LISTENERS"));
        $list24 = list(makeKeyword("BINDINGS"), makeKeyword("HL-MODULE"), makeKeyword("LISTENERS"));
        $list25 = list(makeSymbol("RESTR-LISTEN-LINK-DATA-BINDINGS"), makeSymbol("RESTR-LISTEN-LINK-DATA-HL-MODULE"), makeSymbol("RESTR-LISTEN-LINK-DATA-LISTENERS"));
        $list26 = list(makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS"));
        $sym27$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list28 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RESTRICTION-LISTENING-LINK-DATA-P"));
        $sym29$RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol("RESTR-LISTEN-LINK-DATA-BINDINGS");
        $sym30$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS");
        $sym31$RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol("RESTR-LISTEN-LINK-DATA-HL-MODULE");
        $sym32$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE");
        $sym33$RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol("RESTR-LISTEN-LINK-DATA-LISTENERS");
        $sym34$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS");
        $LISTENERS = makeKeyword("LISTENERS");
        $sym36$MAKE_RESTRICTION_LISTENING_LINK_DATA = makeSymbol("MAKE-RESTRICTION-LISTENING-LINK-DATA");
        $sym37$VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LISTENING-LINK-DATA-METHOD");
        $sym38$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym39$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $FREE = makeKeyword("FREE");
        $sym43$RESTRICTION_LINK_P = makeSymbol("RESTRICTION-LINK-P");
        $sym44$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
        $sym45$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $sym46$TACTIC_P = makeSymbol("TACTIC-P");
        $list47 = list(list(makeSymbol("LISTENER"), makeSymbol("RESTRICTION-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list48 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym51$DO_LIST = makeSymbol("DO-LIST");
        $sym52$RESTRICTION_LINK_LISTENERS = makeSymbol("RESTRICTION-LINK-LISTENERS");
        $str53$No_tactic_found_for__S = makeString("No tactic found for ~S");
        $sym54$RESTRICTION_PROOF_P = makeSymbol("RESTRICTION-PROOF-P");
        $SIMPLIFICATION = makeKeyword("SIMPLIFICATION");
    }

    public static class $restriction_link_data_native extends SubLStructNative {
        public SubLObject $bindings;
        public SubLObject $hl_module;
        private static SubLStructDeclNative structDecl;

        public $restriction_link_data_native() {
            this.$bindings = CommonSymbols.NIL;
            this.$hl_module = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $restriction_link_data_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField3() {
            return this.$hl_module;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$hl_module = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($restriction_link_data_native.class, $sym0$RESTRICTION_LINK_DATA, $sym1$RESTRICTION_LINK_DATA_P, $list2, $list3, new String[] { "$bindings", "$hl_module" }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $restriction_link_data_p$UnaryFunction extends UnaryFunction {
        public $restriction_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RESTRICTION-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return restriction_link_data_p(arg1);
        }
    }

    public static class $restriction_listening_link_data_native extends SubLStructNative {
        public SubLObject $bindings;
        public SubLObject $hl_module;
        public SubLObject $listeners;
        private static SubLStructDeclNative structDecl;

        public $restriction_listening_link_data_native() {
            this.$bindings = CommonSymbols.NIL;
            this.$hl_module = CommonSymbols.NIL;
            this.$listeners = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $restriction_listening_link_data_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField3() {
            return this.$hl_module;
        }

        @Override
        public SubLObject getField4() {
            return this.$listeners;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$hl_module = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$listeners = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($restriction_listening_link_data_native.class, $sym21$RESTRICTION_LISTENING_LINK_DATA, $sym22$RESTRICTION_LISTENING_LINK_DATA_P, $list23, $list24, new String[] { "$bindings", "$hl_module", "$listeners" }, $list25, $list26,
                    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $restriction_listening_link_data_p$UnaryFunction extends UnaryFunction {
        public $restriction_listening_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RESTRICTION-LISTENING-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return restriction_listening_link_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 394 ms synthetic
 */