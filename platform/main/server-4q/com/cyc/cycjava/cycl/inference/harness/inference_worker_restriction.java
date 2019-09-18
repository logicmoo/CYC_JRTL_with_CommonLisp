package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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


public final class inference_worker_restriction extends SubLTranslatedFile {
    public static final SubLFile me = new inference_worker_restriction();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction";

    public static final String myFingerPrint = "139c2c2a29122c6811adf3405fd3e349b633800c1bca122ce7959544975a16bc";

    // defconstant
    public static final SubLSymbol $dtp_restriction_link_data$ = makeSymbol("*DTP-RESTRICTION-LINK-DATA*");

    // defconstant
    public static final SubLSymbol $dtp_restriction_listening_link_data$ = makeSymbol("*DTP-RESTRICTION-LISTENING-LINK-DATA*");

    // defparameter
    /**
     * When T, simplification tactics are executed early (before backchain required
     * transformation tactics) and pass down T motivation.
     */
    public static final SubLSymbol $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = makeSymbol("*SIMPLIFICATION-TACTICS-EXECUTE-EARLY-AND-PASS-DOWN-TRANSFORMATION-MOTIVATION?*");

    // Internal Constants
    public static final SubLSymbol RESTRICTION_LINK_DATA = makeSymbol("RESTRICTION-LINK-DATA");

    public static final SubLSymbol RESTRICTION_LINK_DATA_P = makeSymbol("RESTRICTION-LINK-DATA-P");

    public static final SubLList $list2 = list(makeSymbol("BINDINGS"), makeSymbol("HL-MODULE"));

    public static final SubLList $list3 = list(makeKeyword("BINDINGS"), makeKeyword("HL-MODULE"));

    public static final SubLList $list4 = list(makeSymbol("RESTR-LINK-DATA-BINDINGS"), makeSymbol("RESTR-LINK-DATA-HL-MODULE"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RESTR-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RESTR-LINK-DATA-HL-MODULE"));



    public static final SubLSymbol RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RESTRICTION-LINK-DATA-P"));

    private static final SubLSymbol RESTR_LINK_DATA_BINDINGS = makeSymbol("RESTR-LINK-DATA-BINDINGS");

    private static final SubLSymbol _CSETF_RESTR_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RESTR-LINK-DATA-BINDINGS");

    private static final SubLSymbol RESTR_LINK_DATA_HL_MODULE = makeSymbol("RESTR-LINK-DATA-HL-MODULE");

    private static final SubLSymbol _CSETF_RESTR_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RESTR-LINK-DATA-HL-MODULE");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RESTRICTION_LINK_DATA = makeSymbol("MAKE-RESTRICTION-LINK-DATA");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LINK-DATA-METHOD");

    private static final SubLSymbol RESTRICTION_LISTENING_LINK_DATA = makeSymbol("RESTRICTION-LISTENING-LINK-DATA");

    private static final SubLSymbol RESTRICTION_LISTENING_LINK_DATA_P = makeSymbol("RESTRICTION-LISTENING-LINK-DATA-P");

    private static final SubLList $list23 = list(makeSymbol("BINDINGS"), makeSymbol("HL-MODULE"), makeSymbol("LISTENERS"));

    private static final SubLList $list24 = list(makeKeyword("BINDINGS"), makeKeyword("HL-MODULE"), makeKeyword("LISTENERS"));

    private static final SubLList $list25 = list(makeSymbol("RESTR-LISTEN-LINK-DATA-BINDINGS"), makeSymbol("RESTR-LISTEN-LINK-DATA-HL-MODULE"), makeSymbol("RESTR-LISTEN-LINK-DATA-LISTENERS"));

    private static final SubLList $list26 = list(makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS"));

    private static final SubLSymbol RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list28 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RESTRICTION-LISTENING-LINK-DATA-P"));

    private static final SubLSymbol RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol("RESTR-LISTEN-LINK-DATA-BINDINGS");

    private static final SubLSymbol _CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS");

    private static final SubLSymbol RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol("RESTR-LISTEN-LINK-DATA-HL-MODULE");

    private static final SubLSymbol _CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE");

    private static final SubLSymbol RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol("RESTR-LISTEN-LINK-DATA-LISTENERS");

    private static final SubLSymbol _CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS");



    private static final SubLSymbol MAKE_RESTRICTION_LISTENING_LINK_DATA = makeSymbol("MAKE-RESTRICTION-LISTENING-LINK-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LISTENING-LINK-DATA-METHOD");











    private static final SubLSymbol RESTRICTION_LINK_P = makeSymbol("RESTRICTION-LINK-P");

    private static final SubLSymbol BINDING_LIST_P = makeSymbol("BINDING-LIST-P");





    private static final SubLList $list47 = list(list(makeSymbol("LISTENER"), makeSymbol("RESTRICTION-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list48 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol RESTRICTION_LINK_LISTENERS = makeSymbol("RESTRICTION-LINK-LISTENERS");

    private static final SubLString $str53$No_tactic_found_for__S = makeString("No tactic found for ~S");

    private static final SubLSymbol RESTRICTION_PROOF_P = makeSymbol("RESTRICTION-PROOF-P");



    public static SubLObject restriction_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject restriction_link_data_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$restriction_link_data_native.class ? T : NIL;
    }

    public static SubLObject restr_link_data_bindings(final SubLObject v_object) {
        assert NIL != restriction_link_data_p(v_object) : "inference_worker_restriction.restriction_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject restr_link_data_hl_module(final SubLObject v_object) {
        assert NIL != restriction_link_data_p(v_object) : "inference_worker_restriction.restriction_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_restr_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != restriction_link_data_p(v_object) : "inference_worker_restriction.restriction_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_restr_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != restriction_link_data_p(v_object) : "inference_worker_restriction.restriction_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_restriction_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $restriction_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BINDINGS)) {
                _csetf_restr_link_data_bindings(v_new, current_value);
            } else
                if (pcase_var.eql($HL_MODULE)) {
                    _csetf_restr_link_data_hl_module(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_restriction_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RESTRICTION_LINK_DATA, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, restr_link_data_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, restr_link_data_hl_module(obj));
        funcall(visitor_fn, obj, $END, MAKE_RESTRICTION_LINK_DATA, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_restriction_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_restriction_link_data(obj, visitor_fn);
    }

    public static SubLObject restriction_listening_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject restriction_listening_link_data_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$restriction_listening_link_data_native.class ? T : NIL;
    }

    public static SubLObject restr_listen_link_data_bindings(final SubLObject v_object) {
        assert NIL != restriction_listening_link_data_p(v_object) : "inference_worker_restriction.restriction_listening_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject restr_listen_link_data_hl_module(final SubLObject v_object) {
        assert NIL != restriction_listening_link_data_p(v_object) : "inference_worker_restriction.restriction_listening_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject restr_listen_link_data_listeners(final SubLObject v_object) {
        assert NIL != restriction_listening_link_data_p(v_object) : "inference_worker_restriction.restriction_listening_link_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_restr_listen_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != restriction_listening_link_data_p(v_object) : "inference_worker_restriction.restriction_listening_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_restr_listen_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != restriction_listening_link_data_p(v_object) : "inference_worker_restriction.restriction_listening_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_restr_listen_link_data_listeners(final SubLObject v_object, final SubLObject value) {
        assert NIL != restriction_listening_link_data_p(v_object) : "inference_worker_restriction.restriction_listening_link_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_restriction_listening_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $restriction_listening_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BINDINGS)) {
                _csetf_restr_listen_link_data_bindings(v_new, current_value);
            } else
                if (pcase_var.eql($HL_MODULE)) {
                    _csetf_restr_listen_link_data_hl_module(v_new, current_value);
                } else
                    if (pcase_var.eql($LISTENERS)) {
                        _csetf_restr_listen_link_data_listeners(v_new, current_value);
                    } else {
                        Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_restriction_listening_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RESTRICTION_LISTENING_LINK_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, restr_listen_link_data_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, restr_listen_link_data_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $LISTENERS, restr_listen_link_data_listeners(obj));
        funcall(visitor_fn, obj, $END, MAKE_RESTRICTION_LISTENING_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_restriction_listening_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_restriction_listening_link_data(obj, visitor_fn);
    }

    public static SubLObject new_restriction_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject hl_module) {
        if (listening_linkP == UNPROVIDED) {
            listening_linkP = NIL;
        }
        if (hl_module == UNPROVIDED) {
            hl_module = NIL;
        }
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : "inference_datastructures_problem.problem_p(supported_problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(supported_problem) " + supported_problem;
        if (((NIL != supporting_mapped_problem) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem))) {
            throw new AssertionError(supporting_mapped_problem);
        }
        final SubLObject link = inference_datastructures_problem_link.new_problem_link($RESTRICTION, supported_problem);
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

    public static SubLObject new_restriction_link_data(final SubLObject restriction_link) {
        final SubLObject data = make_restriction_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(restriction_link, data);
        return restriction_link;
    }

    public static SubLObject new_restriction_listening_link_data(final SubLObject restriction_link) {
        final SubLObject data = make_restriction_listening_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(restriction_link, data);
        return restriction_link;
    }

    public static SubLObject destroy_restriction_link(final SubLObject restriction_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, jo_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED))) {
                inference_worker_join_ordered.remove_join_ordered_link_restricted_non_focal_link(jo_link, restriction_link);
            }
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
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

    public static SubLObject restriction_link_bindings(final SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            return restr_link_data_bindings(data);
        }
        return restr_listen_link_data_bindings(data);
    }

    public static SubLObject restriction_link_hl_module(final SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            return restr_link_data_hl_module(data);
        }
        return restr_listen_link_data_hl_module(data);
    }

    public static SubLObject restriction_link_listeners(final SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_listening_link_data_p(data)) {
            return restr_listen_link_data_listeners(data);
        }
        return NIL;
    }

    public static SubLObject set_restriction_link_bindings(final SubLObject restriction_link, final SubLObject v_bindings) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        assert NIL != bindings.binding_list_p(v_bindings) : "bindings.binding_list_p(v_bindings) " + "CommonSymbols.NIL != bindings.binding_list_p(v_bindings) " + v_bindings;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            _csetf_restr_link_data_bindings(data, v_bindings);
        } else {
            _csetf_restr_listen_link_data_bindings(data, v_bindings);
        }
        return restriction_link;
    }

    public static SubLObject set_restriction_link_hl_module(final SubLObject restriction_link, final SubLObject hl_module) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        assert NIL != inference_modules.hl_module_p(hl_module) : "inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) " + hl_module;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_link_data_p(data)) {
            _csetf_restr_link_data_hl_module(data, hl_module);
        } else {
            _csetf_restr_listen_link_data_hl_module(data, hl_module);
        }
        return restriction_link;
    }

    public static SubLObject clear_restriction_link_listeners(final SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if (NIL != restriction_listening_link_data_p(data)) {
            _csetf_restr_listen_link_data_listeners(data, NIL);
        }
        return restriction_link;
    }

    public static SubLObject add_restriction_link_listener(final SubLObject restriction_link, final SubLObject tactic) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
        if ((NIL != restriction_listening_link_data_p(data)) && (NIL == member(tactic, restr_listen_link_data_listeners(data), EQUAL, symbol_function(IDENTITY)))) {
            _csetf_restr_listen_link_data_listeners(data, cons(tactic, restr_listen_link_data_listeners(data)));
        }
        return restriction_link;
    }

    public static SubLObject do_restriction_link_listeners(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject listener = NIL;
        SubLObject restriction_link = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        listener = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        restriction_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$1, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(listener, list(RESTRICTION_LINK_LISTENERS, restriction_link), $DONE, done), append(body, NIL));
    }

    public static SubLObject restriction_listening_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL != restriction_listening_link_data_p(inference_datastructures_problem_link.problem_link_data(v_object))));
    }

    public static SubLObject restriction_link_supporting_mapped_problem(final SubLObject restriction_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(restriction_link);
    }

    public static SubLObject restriction_link_supporting_variable_map(final SubLObject restriction_link) {
        final SubLObject supporting_mapped_problem = restriction_link_supporting_mapped_problem(restriction_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return NIL;
    }

    public static SubLObject restriction_link_tactic(final SubLObject restriction_link) {
        assert NIL != restriction_link_p(restriction_link) : "inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) " + restriction_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        final SubLObject hl_module = restriction_link_hl_module(restriction_link);
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

    public static SubLObject restriction_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($RESTRICTION == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject maybe_new_restriction_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject tactic) {
        if (listening_linkP == UNPROVIDED) {
            listening_linkP = NIL;
        }
        if (tactic == UNPROVIDED) {
            tactic = NIL;
        }
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if ((((NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) && (NIL != restriction_link_p(dependent_link))) && supported_problem.eql(inference_datastructures_problem_link.problem_link_supported_problem(dependent_link))) && (NIL != bindings.bindings_equalP(restriction_bindings, restriction_link_bindings(dependent_link)))) {
                return dependent_link;
            }
        }
        final SubLObject hl_module = (NIL != tactic) ? inference_datastructures_tactic.tactic_hl_module(tactic) : NIL;
        return new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
    }

    public static SubLObject bubble_up_proof_to_restriction_link(final SubLObject restricted_proof, final SubLObject restricted_variable_map, final SubLObject restriction_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject restricted_bindings = inference_datastructures_proof.proof_bindings(restricted_proof);
        final SubLObject restriction_bindings = restriction_link_bindings(restriction_link);
        final SubLObject unrestricted_bindings = inference_worker.proof_bindings_from_constituents(restriction_bindings, restricted_bindings, restricted_variable_map);
        thread.resetMultipleValues();
        final SubLObject unrestricted_proof = new_restriction_proof(restriction_link, restricted_proof, unrestricted_bindings);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_worker_rewrite.trigger_restriction_link_listeners(restriction_link, restricted_proof);
        if (NIL != newP) {
            inference_worker.bubble_up_proof(unrestricted_proof);
        } else {
            inference_worker.possibly_note_proof_processed(restricted_proof);
        }
        return NIL;
    }

    public static SubLObject new_restriction_proof(final SubLObject restriction_link, final SubLObject restricted_proof, final SubLObject unrestricted_bindings) {
        final SubLObject subproofs = list(restricted_proof);
        return inference_worker.propose_new_proof_with_bindings(restriction_link, inference_worker.canonicalize_proof_bindings(unrestricted_bindings), subproofs);
    }

    public static SubLObject restriction_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($RESTRICTION == inference_datastructures_proof.proof_type(v_object)));
    }

    public static SubLObject problem_has_restriction_linkP(final SubLObject problem) {
        return inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $RESTRICTION);
    }

    public static SubLObject restriction_proof_hl_module(final SubLObject proof) {
        assert NIL != restriction_proof_p(proof) : "inference_worker_restriction.restriction_proof_p(proof) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_proof_p(proof) " + proof;
        return restriction_link_hl_module(inference_datastructures_proof.proof_link(proof));
    }

    public static SubLObject simplification_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && (NIL != simplification_modules.simplification_module_p(inference_datastructures_tactic.tactic_hl_module(tactic))));
    }

    public static SubLObject simplification_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != restriction_link_p(v_object)) && (NIL != simplification_modules.simplification_module_p(restriction_link_hl_module(v_object))));
    }

    public static SubLObject problem_is_a_simplificationP(final SubLObject problem) {
        return inference_datastructures_problem.problem_has_dependent_link_of_typeP(problem, $SIMPLIFICATION);
    }

    public static SubLObject problem_has_a_simplificationP(final SubLObject problem) {
        return inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $SIMPLIFICATION);
    }

    public static SubLObject problem_first_simplified_supporting_problem(final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject simp_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            simp_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, simp_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(simp_link, $SIMPLIFICATION))) {
                return inference_datastructures_problem_link.problem_link_sole_supporting_problem(simp_link);
            }
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_restriction_file() {
        declareFunction(me, "restriction_link_data_print_function_trampoline", "RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "restriction_link_data_p", "RESTRICTION-LINK-DATA-P", 1, 0, false);
        new inference_worker_restriction.$restriction_link_data_p$UnaryFunction();
        declareFunction(me, "restr_link_data_bindings", "RESTR-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction(me, "restr_link_data_hl_module", "RESTR-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction(me, "_csetf_restr_link_data_bindings", "_CSETF-RESTR-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_restr_link_data_hl_module", "_CSETF-RESTR-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction(me, "make_restriction_link_data", "MAKE-RESTRICTION-LINK-DATA", 0, 1, false);
        declareFunction(me, "visit_defstruct_restriction_link_data", "VISIT-DEFSTRUCT-RESTRICTION-LINK-DATA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_restriction_link_data_method", "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(me, "restriction_listening_link_data_print_function_trampoline", "RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "restriction_listening_link_data_p", "RESTRICTION-LISTENING-LINK-DATA-P", 1, 0, false);
        new inference_worker_restriction.$restriction_listening_link_data_p$UnaryFunction();
        declareFunction(me, "restr_listen_link_data_bindings", "RESTR-LISTEN-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction(me, "restr_listen_link_data_hl_module", "RESTR-LISTEN-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction(me, "restr_listen_link_data_listeners", "RESTR-LISTEN-LINK-DATA-LISTENERS", 1, 0, false);
        declareFunction(me, "_csetf_restr_listen_link_data_bindings", "_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_restr_listen_link_data_hl_module", "_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction(me, "_csetf_restr_listen_link_data_listeners", "_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS", 2, 0, false);
        declareFunction(me, "make_restriction_listening_link_data", "MAKE-RESTRICTION-LISTENING-LINK-DATA", 0, 1, false);
        declareFunction(me, "visit_defstruct_restriction_listening_link_data", "VISIT-DEFSTRUCT-RESTRICTION-LISTENING-LINK-DATA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_restriction_listening_link_data_method", "VISIT-DEFSTRUCT-OBJECT-RESTRICTION-LISTENING-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(me, "new_restriction_link", "NEW-RESTRICTION-LINK", 3, 2, false);
        declareFunction(me, "new_restriction_link_data", "NEW-RESTRICTION-LINK-DATA", 1, 0, false);
        declareFunction(me, "new_restriction_listening_link_data", "NEW-RESTRICTION-LISTENING-LINK-DATA", 1, 0, false);
        declareFunction(me, "destroy_restriction_link", "DESTROY-RESTRICTION-LINK", 1, 0, false);
        declareFunction(me, "restriction_link_bindings", "RESTRICTION-LINK-BINDINGS", 1, 0, false);
        declareFunction(me, "restriction_link_hl_module", "RESTRICTION-LINK-HL-MODULE", 1, 0, false);
        declareFunction(me, "restriction_link_listeners", "RESTRICTION-LINK-LISTENERS", 1, 0, false);
        declareFunction(me, "set_restriction_link_bindings", "SET-RESTRICTION-LINK-BINDINGS", 2, 0, false);
        declareFunction(me, "set_restriction_link_hl_module", "SET-RESTRICTION-LINK-HL-MODULE", 2, 0, false);
        declareFunction(me, "clear_restriction_link_listeners", "CLEAR-RESTRICTION-LINK-LISTENERS", 1, 0, false);
        declareFunction(me, "add_restriction_link_listener", "ADD-RESTRICTION-LINK-LISTENER", 2, 0, false);
        declareMacro(me, "do_restriction_link_listeners", "DO-RESTRICTION-LINK-LISTENERS");
        declareFunction(me, "restriction_listening_link_p", "RESTRICTION-LISTENING-LINK-P", 1, 0, false);
        declareFunction(me, "restriction_link_supporting_mapped_problem", "RESTRICTION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(me, "restriction_link_supporting_variable_map", "RESTRICTION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction(me, "restriction_link_tactic", "RESTRICTION-LINK-TACTIC", 1, 0, false);
        declareFunction(me, "restriction_link_p", "RESTRICTION-LINK-P", 1, 0, false);
        declareFunction(me, "maybe_new_restriction_link", "MAYBE-NEW-RESTRICTION-LINK", 3, 2, false);
        declareFunction(me, "bubble_up_proof_to_restriction_link", "BUBBLE-UP-PROOF-TO-RESTRICTION-LINK", 3, 0, false);
        declareFunction(me, "new_restriction_proof", "NEW-RESTRICTION-PROOF", 3, 0, false);
        declareFunction(me, "restriction_proof_p", "RESTRICTION-PROOF-P", 1, 0, false);
        declareFunction(me, "problem_has_restriction_linkP", "PROBLEM-HAS-RESTRICTION-LINK?", 1, 0, false);
        declareFunction(me, "restriction_proof_hl_module", "RESTRICTION-PROOF-HL-MODULE", 1, 0, false);
        declareFunction(me, "simplification_tactic_p", "SIMPLIFICATION-TACTIC-P", 1, 0, false);
        declareFunction(me, "simplification_link_p", "SIMPLIFICATION-LINK-P", 1, 0, false);
        declareFunction(me, "problem_is_a_simplificationP", "PROBLEM-IS-A-SIMPLIFICATION?", 1, 0, false);
        declareFunction(me, "problem_has_a_simplificationP", "PROBLEM-HAS-A-SIMPLIFICATION?", 1, 0, false);
        declareFunction(me, "problem_first_simplified_supporting_problem", "PROBLEM-FIRST-SIMPLIFIED-SUPPORTING-PROBLEM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_restriction_file() {
        defconstant("*DTP-RESTRICTION-LINK-DATA*", RESTRICTION_LINK_DATA);
        defconstant("*DTP-RESTRICTION-LISTENING-LINK-DATA*", RESTRICTION_LISTENING_LINK_DATA);
        defparameter("*SIMPLIFICATION-TACTICS-EXECUTE-EARLY-AND-PASS-DOWN-TRANSFORMATION-MOTIVATION?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_worker_restriction_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), symbol_function(RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RESTR_LINK_DATA_BINDINGS, _CSETF_RESTR_LINK_DATA_BINDINGS);
        def_csetf(RESTR_LINK_DATA_HL_MODULE, _CSETF_RESTR_LINK_DATA_HL_MODULE);
        identity(RESTRICTION_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LINK_DATA_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), symbol_function(RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list28);
        def_csetf(RESTR_LISTEN_LINK_DATA_BINDINGS, _CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS);
        def_csetf(RESTR_LISTEN_LINK_DATA_HL_MODULE, _CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE);
        def_csetf(RESTR_LISTEN_LINK_DATA_LISTENERS, _CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS);
        identity(RESTRICTION_LISTENING_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RESTRICTION_LISTENING_LINK_DATA_METHOD));
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

    

    public static final class $restriction_link_data_native extends SubLStructNative {
        public SubLObject $bindings;

        public SubLObject $hl_module;

        private static final SubLStructDeclNative structDecl;

        private $restriction_link_data_native() {
            this.$bindings = Lisp.NIL;
            this.$hl_module = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
        public SubLObject setField2(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$hl_module = value;
        }

        static {
            structDecl = makeStructDeclNative($restriction_link_data_native.class, RESTRICTION_LINK_DATA, RESTRICTION_LINK_DATA_P, $list2, $list3, new String[]{ "$bindings", "$hl_module" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $restriction_link_data_p$UnaryFunction extends UnaryFunction {
        public $restriction_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("RESTRICTION-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return restriction_link_data_p(arg1);
        }
    }

    public static final class $restriction_listening_link_data_native extends SubLStructNative {
        public SubLObject $bindings;

        public SubLObject $hl_module;

        public SubLObject $listeners;

        private static final SubLStructDeclNative structDecl;

        private $restriction_listening_link_data_native() {
            this.$bindings = Lisp.NIL;
            this.$hl_module = Lisp.NIL;
            this.$listeners = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
        public SubLObject setField2(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$hl_module = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$listeners = value;
        }

        static {
            structDecl = makeStructDeclNative($restriction_listening_link_data_native.class, RESTRICTION_LISTENING_LINK_DATA, RESTRICTION_LISTENING_LINK_DATA_P, $list23, $list24, new String[]{ "$bindings", "$hl_module", "$listeners" }, $list25, $list26, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $restriction_listening_link_data_p$UnaryFunction extends UnaryFunction {
        public $restriction_listening_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("RESTRICTION-LISTENING-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return restriction_listening_link_data_p(arg1);
        }
    }
}

/**
 * Total time: 394 ms synthetic
 */
