package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$ask_quirkP$;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class rkf_solution_finder extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_solution_finder();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_solution_finder";

    public static final String myFingerPrint = "2a802afa986ae2efdd34146b9a3736ecde89b2fcc3562d3dde6055ef7d522c32";

    // defconstant
    private static final SubLSymbol $sf_backchain_default$ = makeSymbol("*SF-BACKCHAIN-DEFAULT*");

    // defconstant
    private static final SubLSymbol $sf_number_default$ = makeSymbol("*SF-NUMBER-DEFAULT*");

    // defconstant
    private static final SubLSymbol $sf_time_default$ = makeSymbol("*SF-TIME-DEFAULT*");

    // deflexical
    private static final SubLSymbol $sf_lock$ = makeSymbol("*SF-LOCK*");





    // defconstant
    public static final SubLSymbol $dtp_sf_solution_set$ = makeSymbol("*DTP-SF-SOLUTION-SET*");

    // defconstant
    public static final SubLSymbol $dtp_sf_state$ = makeSymbol("*DTP-SF-STATE*");







    // deflexical
    private static final SubLSymbol $sf_default_dynamic_properties$ = makeSymbol("*SF-DEFAULT-DYNAMIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $sf_last_inference$ = makeSymbol("*SF-LAST-INFERENCE*");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLString $$$Solution_Finder_Lock = makeString("Solution Finder Lock");



    public static final SubLList $list3 = list(makeSymbol("*SF-LOCK*"));

    public static final SubLSymbol $sf_isg$ = makeSymbol("*SF-ISG*");

    public static final SubLSymbol $sf_index$ = makeSymbol("*SF-INDEX*");

    public static final SubLSymbol SF_SOLUTION_SET = makeSymbol("SF-SOLUTION-SET");

    public static final SubLSymbol SF_SOLUTION_SET_P = makeSymbol("SF-SOLUTION-SET-P");

    public static final SubLList $list8 = list(makeSymbol("ID"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    public static final SubLList $list9 = list(makeKeyword("ID"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));

    public static final SubLList $list10 = list(makeSymbol("SF-SOLUTION-SET-ID"), makeSymbol("SF-SOLUTION-SET-BINDINGS"), makeSymbol("SF-SOLUTION-SET-SUPPORTS"));

    public static final SubLList $list11 = list(makeSymbol("_CSETF-SF-SOLUTION-SET-ID"), makeSymbol("_CSETF-SF-SOLUTION-SET-BINDINGS"), makeSymbol("_CSETF-SF-SOLUTION-SET-SUPPORTS"));



    public static final SubLSymbol SF_SOLUTION_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SF-SOLUTION-SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SF-SOLUTION-SET-P"));

    private static final SubLSymbol SF_SOLUTION_SET_ID = makeSymbol("SF-SOLUTION-SET-ID");

    private static final SubLSymbol _CSETF_SF_SOLUTION_SET_ID = makeSymbol("_CSETF-SF-SOLUTION-SET-ID");

    private static final SubLSymbol SF_SOLUTION_SET_BINDINGS = makeSymbol("SF-SOLUTION-SET-BINDINGS");

    private static final SubLSymbol _CSETF_SF_SOLUTION_SET_BINDINGS = makeSymbol("_CSETF-SF-SOLUTION-SET-BINDINGS");

    private static final SubLSymbol SF_SOLUTION_SET_SUPPORTS = makeSymbol("SF-SOLUTION-SET-SUPPORTS");

    private static final SubLSymbol _CSETF_SF_SOLUTION_SET_SUPPORTS = makeSymbol("_CSETF-SF-SOLUTION-SET-SUPPORTS");







    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SF_SOLUTION_SET = makeSymbol("MAKE-SF-SOLUTION-SET");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SF_SOLUTION_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SF-SOLUTION-SET-METHOD");



    private static final SubLSymbol SF_STATE = makeSymbol("SF-STATE");

    private static final SubLSymbol SF_STATE_P = makeSymbol("SF-STATE-P");

    private static final SubLList $list33 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("INTERACTION"), makeSymbol("TEXT"), makeSymbol("QUERY"), makeSymbol("INFERENCE-PARAMS"), makeSymbol("INFERENCE"), makeSymbol("SOLUTION-QUEUE"), makeSymbol("STATUS"), makeSymbol("PROS-CONS"), makeSymbol("BINDING-INDEX") });

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("INTERACTION"), makeKeyword("TEXT"), makeKeyword("QUERY"), makeKeyword("INFERENCE-PARAMS"), makeKeyword("INFERENCE"), makeKeyword("SOLUTION-QUEUE"), makeKeyword("STATUS"), makeKeyword("PROS-CONS"), makeKeyword("BINDING-INDEX") });

    private static final SubLList $list35 = list(new SubLObject[]{ makeSymbol("SF-STATE-ID"), makeSymbol("SF-STATE-INTERACTION"), makeSymbol("SF-STATE-TEXT"), makeSymbol("SF-STATE-QUERY"), makeSymbol("SF-STATE-INFERENCE-PARAMS"), makeSymbol("SF-STATE-INFERENCE"), makeSymbol("SF-STATE-SOLUTION-QUEUE"), makeSymbol("SF-STATE-STATUS"), makeSymbol("SF-STATE-PROS-CONS"), makeSymbol("SF-STATE-BINDING-INDEX") });

    private static final SubLList $list36 = list(new SubLObject[]{ makeSymbol("_CSETF-SF-STATE-ID"), makeSymbol("_CSETF-SF-STATE-INTERACTION"), makeSymbol("_CSETF-SF-STATE-TEXT"), makeSymbol("_CSETF-SF-STATE-QUERY"), makeSymbol("_CSETF-SF-STATE-INFERENCE-PARAMS"), makeSymbol("_CSETF-SF-STATE-INFERENCE"), makeSymbol("_CSETF-SF-STATE-SOLUTION-QUEUE"), makeSymbol("_CSETF-SF-STATE-STATUS"), makeSymbol("_CSETF-SF-STATE-PROS-CONS"), makeSymbol("_CSETF-SF-STATE-BINDING-INDEX") });

    private static final SubLSymbol SF_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SF-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list38 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SF-STATE-P"));

    private static final SubLSymbol SF_STATE_ID = makeSymbol("SF-STATE-ID");

    private static final SubLSymbol _CSETF_SF_STATE_ID = makeSymbol("_CSETF-SF-STATE-ID");

    private static final SubLSymbol SF_STATE_INTERACTION = makeSymbol("SF-STATE-INTERACTION");

    private static final SubLSymbol _CSETF_SF_STATE_INTERACTION = makeSymbol("_CSETF-SF-STATE-INTERACTION");

    private static final SubLSymbol SF_STATE_TEXT = makeSymbol("SF-STATE-TEXT");

    private static final SubLSymbol _CSETF_SF_STATE_TEXT = makeSymbol("_CSETF-SF-STATE-TEXT");

    private static final SubLSymbol SF_STATE_QUERY = makeSymbol("SF-STATE-QUERY");

    private static final SubLSymbol _CSETF_SF_STATE_QUERY = makeSymbol("_CSETF-SF-STATE-QUERY");

    private static final SubLSymbol SF_STATE_INFERENCE_PARAMS = makeSymbol("SF-STATE-INFERENCE-PARAMS");

    private static final SubLSymbol _CSETF_SF_STATE_INFERENCE_PARAMS = makeSymbol("_CSETF-SF-STATE-INFERENCE-PARAMS");

    private static final SubLSymbol SF_STATE_INFERENCE = makeSymbol("SF-STATE-INFERENCE");

    private static final SubLSymbol _CSETF_SF_STATE_INFERENCE = makeSymbol("_CSETF-SF-STATE-INFERENCE");

    private static final SubLSymbol SF_STATE_SOLUTION_QUEUE = makeSymbol("SF-STATE-SOLUTION-QUEUE");

    private static final SubLSymbol _CSETF_SF_STATE_SOLUTION_QUEUE = makeSymbol("_CSETF-SF-STATE-SOLUTION-QUEUE");

    private static final SubLSymbol SF_STATE_STATUS = makeSymbol("SF-STATE-STATUS");

    private static final SubLSymbol _CSETF_SF_STATE_STATUS = makeSymbol("_CSETF-SF-STATE-STATUS");

    private static final SubLSymbol SF_STATE_PROS_CONS = makeSymbol("SF-STATE-PROS-CONS");

    private static final SubLSymbol _CSETF_SF_STATE_PROS_CONS = makeSymbol("_CSETF-SF-STATE-PROS-CONS");

    private static final SubLSymbol SF_STATE_BINDING_INDEX = makeSymbol("SF-STATE-BINDING-INDEX");

    private static final SubLSymbol _CSETF_SF_STATE_BINDING_INDEX = makeSymbol("_CSETF-SF-STATE-BINDING-INDEX");



















    private static final SubLSymbol MAKE_SF_STATE = makeSymbol("MAKE-SF-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SF_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SF-STATE-METHOD");

    public static final SubLList $list70 = list(list(makeSymbol("&KEY"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list71 = list(makeKeyword("BACKCHAIN"), makeKeyword("NUMBER"), makeKeyword("TIME"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    public static final SubLSymbol $sf_typical_backchain_default$ = makeSymbol("*SF-TYPICAL-BACKCHAIN-DEFAULT*");



    private static final SubLList $list79 = list(makeSymbol("*SF-TYPICAL-BACKCHAIN-DEFAULT*"));

    public static final SubLSymbol $sf_typical_number_default$ = makeSymbol("*SF-TYPICAL-NUMBER-DEFAULT*");

    private static final SubLList $list81 = list(makeSymbol("*SF-TYPICAL-NUMBER-DEFAULT*"));

    public static final SubLSymbol $sf_typical_time_default$ = makeSymbol("*SF-TYPICAL-TIME-DEFAULT*");

    private static final SubLList $list83 = list(makeSymbol("*SF-TYPICAL-TIME-DEFAULT*"));









    private static final SubLSymbol QC_QUERY_P = makeSymbol("QC-QUERY-P");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");







    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");











    private static final SubLSymbol QUERY_DYNAMIC_PROPERTY_P = makeSymbol("QUERY-DYNAMIC-PROPERTY-P");

    private static final SubLSymbol QUERY_STATIC_PROPERTY_P = makeSymbol("QUERY-STATIC-PROPERTY-P");

    private static final SubLSymbol $kw102$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");









    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $kw108$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");











    public static final SubLList $list114 = list(makeKeyword("TAUTOLOGY"), makeKeyword("TAUTOLOGY"));

    private static final SubLList $list115 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORT-SET"));

    private static final SubLList $list116 = list(makeSymbol("PROS"), makeSymbol("CONS"));

    public static SubLObject with_sf_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list3, append(body, NIL));
    }

    public static SubLObject sf_find_solution_set_by_id(final SubLObject id) {
        return sf_find_object_by_id(id);
    }

    public static SubLObject sf_find_solution_set_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject query = sf_find_solution_set_by_id(id);
        return query;
    }

    public static SubLObject sf_find_state_by_id(final SubLObject id) {
        return sf_find_object_by_id(id);
    }

    public static SubLObject sf_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject state = sf_find_state_by_id(id);
        return state;
    }

    public static SubLObject sf_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next($sf_isg$.getGlobalValue());
    }

    public static SubLObject sf_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter($sf_index$.getGlobalValue(), id, v_object);
    }

    public static SubLObject sf_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove($sf_index$.getGlobalValue(), id);
    }

    public static SubLObject sf_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup($sf_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject sf_solution_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sf_solution_set_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sf_solution_set_native.class ? T : NIL;
    }

    public static SubLObject sf_solution_set_id(final SubLObject v_object) {
        assert NIL != sf_solution_set_p(v_object) : "rkf_solution_finder.sf_solution_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sf_solution_set_bindings(final SubLObject v_object) {
        assert NIL != sf_solution_set_p(v_object) : "rkf_solution_finder.sf_solution_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sf_solution_set_supports(final SubLObject v_object) {
        assert NIL != sf_solution_set_p(v_object) : "rkf_solution_finder.sf_solution_set_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sf_solution_set_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_solution_set_p(v_object) : "rkf_solution_finder.sf_solution_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sf_solution_set_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_solution_set_p(v_object) : "rkf_solution_finder.sf_solution_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sf_solution_set_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_solution_set_p(v_object) : "rkf_solution_finder.sf_solution_set_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sf_solution_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sf_solution_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sf_solution_set_id(v_new, current_value);
            } else
                if (pcase_var.eql($BINDINGS)) {
                    _csetf_sf_solution_set_bindings(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPPORTS)) {
                        _csetf_sf_solution_set_supports(v_new, current_value);
                    } else {
                        Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sf_solution_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SF_SOLUTION_SET, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sf_solution_set_id(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, sf_solution_set_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, sf_solution_set_supports(obj));
        funcall(visitor_fn, obj, $END, MAKE_SF_SOLUTION_SET, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sf_solution_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sf_solution_set(obj, visitor_fn);
    }

    public static SubLObject sf_new_solution_set() {
        final SubLObject solution_set = make_sf_solution_set(UNPROVIDED);
        final SubLObject id = sf_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_solution_set_id(solution_set, id);
            sf_add_object(id, solution_set);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return solution_set;
    }

    public static SubLObject sf_cleanup_solution_set(final SubLObject solution_set) {
        assert NIL != sf_solution_set_p(solution_set) : "rkf_solution_finder.sf_solution_set_p(solution_set) " + "CommonSymbols.NIL != rkf_solution_finder.sf_solution_set_p(solution_set) " + solution_set;
        final SubLObject id = sf_solution_set_id(solution_set);
        final SubLObject success = sf_rem_object(id);
        return success;
    }

    public static SubLObject sf_set_solution_set_bindings(final SubLObject solution_set, final SubLObject v_bindings) {
        assert NIL != sf_solution_set_p(solution_set) : "rkf_solution_finder.sf_solution_set_p(solution_set) " + "CommonSymbols.NIL != rkf_solution_finder.sf_solution_set_p(solution_set) " + solution_set;
        assert NIL != listp(v_bindings) : "Types.listp(v_bindings) " + "CommonSymbols.NIL != Types.listp(v_bindings) " + v_bindings;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_solution_set_bindings(solution_set, v_bindings);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return solution_set;
    }

    public static SubLObject sf_add_solution_set_support_set(final SubLObject solution_set, final SubLObject support_set) {
        assert NIL != sf_solution_set_p(solution_set) : "rkf_solution_finder.sf_solution_set_p(solution_set) " + "CommonSymbols.NIL != rkf_solution_finder.sf_solution_set_p(solution_set) " + solution_set;
        assert NIL != listp(support_set) : "Types.listp(support_set) " + "CommonSymbols.NIL != Types.listp(support_set) " + support_set;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            if (NIL == member(support_set, sf_solution_set_supports(solution_set), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_sf_solution_set_supports(solution_set, cons(support_set, sf_solution_set_supports(solution_set)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return solution_set;
    }

    public static SubLObject sf_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sf_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sf_state_native.class ? T : NIL;
    }

    public static SubLObject sf_state_id(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sf_state_interaction(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sf_state_text(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sf_state_query(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sf_state_inference_params(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sf_state_inference(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sf_state_solution_queue(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sf_state_status(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject sf_state_pros_cons(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject sf_state_binding_index(final SubLObject v_object) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_sf_state_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sf_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sf_state_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sf_state_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sf_state_inference_params(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sf_state_inference(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sf_state_solution_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sf_state_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sf_state_pros_cons(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sf_state_binding_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != sf_state_p(v_object) : "rkf_solution_finder.sf_state_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_sf_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sf_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sf_state_id(v_new, current_value);
            } else
                if (pcase_var.eql($INTERACTION)) {
                    _csetf_sf_state_interaction(v_new, current_value);
                } else
                    if (pcase_var.eql($TEXT)) {
                        _csetf_sf_state_text(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERY)) {
                            _csetf_sf_state_query(v_new, current_value);
                        } else
                            if (pcase_var.eql($INFERENCE_PARAMS)) {
                                _csetf_sf_state_inference_params(v_new, current_value);
                            } else
                                if (pcase_var.eql($INFERENCE)) {
                                    _csetf_sf_state_inference(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SOLUTION_QUEUE)) {
                                        _csetf_sf_state_solution_queue(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($STATUS)) {
                                            _csetf_sf_state_status(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PROS_CONS)) {
                                                _csetf_sf_state_pros_cons(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($BINDING_INDEX)) {
                                                    _csetf_sf_state_binding_index(v_new, current_value);
                                                } else {
                                                    Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sf_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SF_STATE, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sf_state_id(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERACTION, sf_state_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $TEXT, sf_state_text(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY, sf_state_query(obj));
        funcall(visitor_fn, obj, $SLOT, $INFERENCE_PARAMS, sf_state_inference_params(obj));
        funcall(visitor_fn, obj, $SLOT, $INFERENCE, sf_state_inference(obj));
        funcall(visitor_fn, obj, $SLOT, $SOLUTION_QUEUE, sf_state_solution_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, sf_state_status(obj));
        funcall(visitor_fn, obj, $SLOT, $PROS_CONS, sf_state_pros_cons(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDING_INDEX, sf_state_binding_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_SF_STATE, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sf_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sf_state(obj, visitor_fn);
    }

    public static SubLObject with_different_sf_state_defaults(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list70);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list70);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list70);
            if (NIL == member(current_$1, $list71, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list70);
        }
        final SubLObject backchain_tail = property_list_member($BACKCHAIN, current);
        final SubLObject backchain = (NIL != backchain_tail) ? cadr(backchain_tail) : NIL;
        final SubLObject number_tail = property_list_member($NUMBER, current);
        final SubLObject number = (NIL != number_tail) ? cadr(number_tail) : NIL;
        final SubLObject time_tail = property_list_member($TIME, current);
        final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(list($sf_typical_backchain_default$, listS(FIRST_OF, backchain, $list79)), list($sf_typical_number_default$, listS(FIRST_OF, number, $list81)), list($sf_typical_time_default$, listS(FIRST_OF, time, $list83))), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject sf_new_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = make_sf_state(UNPROVIDED);
        final SubLObject id = sf_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_id(state, id);
            sf_add_object(id, state);
            _csetf_sf_state_solution_queue(state, queues.create_queue(UNPROVIDED));
            _csetf_sf_state_binding_index(state, make_hash_table($int$64, symbol_function(EQUALP), UNPROVIDED));
            _csetf_sf_state_inference_params(state, ask_utilities.query_properties_from_legacy_ask_parameters($sf_typical_backchain_default$.getDynamicValue(thread), $sf_typical_number_default$.getDynamicValue(thread), $sf_typical_time_default$.getDynamicValue(thread), UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_cleanup_state(final SubLObject state) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        final SubLObject id = sf_state_id(state);
        final SubLObject success = sf_rem_object(id);
        final SubLObject solution_queue = sf_state_solution_queue(state);
        while (NIL == queues.queue_empty_p(solution_queue)) {
            final SubLObject solution_set = queues.dequeue(solution_queue);
            sf_cleanup_solution_set(solution_set);
        } 
        return success;
    }

    public static SubLObject sf_set_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != user_interaction_agenda.user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_interaction(state, interaction);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_text(final SubLObject state, final SubLObject text) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_text(state, text);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_query(final SubLObject state, final SubLObject query) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != rkf_query_constructor.qc_query_p(query) : "rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) " + query;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_query(state, query);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_backchain(final SubLObject state, final SubLObject backchain) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != atom(backchain) : "Types.atom(backchain) " + "CommonSymbols.NIL != Types.atom(backchain) " + backchain;
        SubLObject v_properties = sf_state_inference_params(state);
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, backchain);
            _csetf_sf_state_inference_params(state, v_properties);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_number(final SubLObject state, final SubLObject number) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        if (((NIL != number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(number))) {
            throw new AssertionError(number);
        }
        SubLObject v_properties = sf_state_inference_params(state);
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            v_properties = putf(v_properties, $MAX_NUMBER, number);
            _csetf_sf_state_inference_params(state, v_properties);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_time(final SubLObject state, final SubLObject time) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        if (((NIL != time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(time))) {
            throw new AssertionError(time);
        }
        SubLObject v_properties = sf_state_inference_params(state);
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            v_properties = putf(v_properties, $MAX_TIME, time);
            _csetf_sf_state_inference_params(state, v_properties);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_depth(final SubLObject state, final SubLObject depth) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        if (((NIL != depth) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(depth))) {
            throw new AssertionError(depth);
        }
        SubLObject v_properties = sf_state_inference_params(state);
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            v_properties = putf(v_properties, $MAX_PROOF_DEPTH, depth);
            _csetf_sf_state_inference_params(state, v_properties);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_inference_params(final SubLObject state, final SubLObject inference_params) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != list_utilities.property_list_p(inference_params) : "list_utilities.property_list_p(inference_params) " + "CommonSymbols.NIL != list_utilities.property_list_p(inference_params) " + inference_params;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = inference_params; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_inference_params(state, inference_params);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_inference(final SubLObject state, final SubLObject inference) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_inference(state, inference);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_clear_state_inference(final SubLObject state) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_inference(state, NIL);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_enqueue_state_solution_set(final SubLObject state, final SubLObject solution_set) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != sf_solution_set_p(solution_set) : "rkf_solution_finder.sf_solution_set_p(solution_set) " + "CommonSymbols.NIL != rkf_solution_finder.sf_solution_set_p(solution_set) " + solution_set;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            queues.enqueue(solution_set, sf_state_solution_queue(state));
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_clear_state_solution_queue(final SubLObject state) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            final SubLObject solution_queue = sf_state_solution_queue(state);
            if (NIL != queues.queue_p(solution_queue)) {
                while (NIL == queues.queue_empty_p(solution_queue)) {
                    final SubLObject solution_set = queues.dequeue(solution_queue);
                    sf_cleanup_solution_set(solution_set);
                } 
            }
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_note_status(final SubLObject state, final SubLObject status) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_status(state, status);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_set_state_pros_cons(final SubLObject state, final SubLObject pros_cons) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != consp(pros_cons) : "Types.consp(pros_cons) " + "CommonSymbols.NIL != Types.consp(pros_cons) " + pros_cons;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_pros_cons(state, pros_cons);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_clear_state_pros_cons(final SubLObject state) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            _csetf_sf_state_pros_cons(state, NIL);
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_add_state_pro(final SubLObject state, final SubLObject argument) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != consp(argument) : "Types.consp(argument) " + "CommonSymbols.NIL != Types.consp(argument) " + argument;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            if (NIL == sf_state_pros_cons(state)) {
                sf_set_state_pros_cons(state, list(NIL, NIL));
            }
            set_nth(ZERO_INTEGER, sf_state_pros_cons(state), cons(argument, nth(ZERO_INTEGER, sf_state_pros_cons(state))));
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_add_state_con(final SubLObject state, final SubLObject argument) {
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        assert NIL != consp(argument) : "Types.consp(argument) " + "CommonSymbols.NIL != Types.consp(argument) " + argument;
        SubLObject release = NIL;
        try {
            release = seize_lock($sf_lock$.getGlobalValue());
            if (NIL == sf_state_pros_cons(state)) {
                sf_set_state_pros_cons(state, list(NIL, NIL));
            }
            set_nth(ONE_INTEGER, sf_state_pros_cons(state), cons(argument, nth(ONE_INTEGER, sf_state_pros_cons(state))));
        } finally {
            if (NIL != release) {
                release_lock($sf_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject sf_state_pros(final SubLObject state) {
        return nth(ZERO_INTEGER, sf_state_pros_cons(state));
    }

    public static SubLObject sf_state_cons(final SubLObject state) {
        return nth(ONE_INTEGER, sf_state_pros_cons(state));
    }

    public static SubLObject sf_state_cycl(final SubLObject state) {
        return rkf_query_constructor.qc_query_cycl(sf_state_query(state));
    }

    public static SubLObject sf_state_halt_reason(final SubLObject state) {
        if (NIL != sf_state_tautology_p(state)) {
            return $TAUTOLOGY;
        }
        final SubLObject inference = sf_state_inference(state);
        if (NIL != inference_datastructures_inference.suspended_inference_p(inference)) {
            final SubLObject status = inference_datastructures_inference.inference_suspend_status(inference);
            return status;
        }
        return NIL;
    }

    public static SubLObject sf_var_indexical_record(final SubLObject state, final SubLObject var) {
        return second(assoc(var, rkf_query_constructor.qc_query_var_map(sf_state_query(state)), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sf_state_dynamic_inference_properties(final SubLObject state) {
        return list_utilities.filter_plist(sf_state_inference_params(state), symbol_function(QUERY_DYNAMIC_PROPERTY_P));
    }

    public static SubLObject sf_state_static_inference_properties(final SubLObject state) {
        return list_utilities.filter_plist(sf_state_inference_params(state), symbol_function(QUERY_STATIC_PROPERTY_P));
    }

    public static SubLObject sf_state_backchain(final SubLObject state) {
        return getf(sf_state_inference_params(state), $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
    }

    public static SubLObject sf_state_number(final SubLObject state) {
        return getf(sf_state_inference_params(state), $MAX_NUMBER, UNPROVIDED);
    }

    public static SubLObject sf_state_time(final SubLObject state) {
        return getf(sf_state_inference_params(state), $MAX_TIME, UNPROVIDED);
    }

    public static SubLObject sf_state_depth(final SubLObject state) {
        return getf(sf_state_inference_params(state), $MAX_PROOF_DEPTH, UNPROVIDED);
    }

    public static SubLObject sf_declare_state_backchain(final SubLObject state, final SubLObject backchain) {
        return sf_set_state_backchain(state, backchain);
    }

    public static SubLObject sf_declare_state_number(final SubLObject state, final SubLObject number) {
        return sf_set_state_number(state, number);
    }

    public static SubLObject sf_declare_state_time(final SubLObject state, final SubLObject time) {
        return sf_set_state_time(state, time);
    }

    public static SubLObject sf_declare_state_depth(final SubLObject state, final SubLObject depth) {
        return sf_set_state_depth(state, depth);
    }

    public static SubLObject sf_declare_state_inference_params(final SubLObject state, final SubLObject v_properties) {
        assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        return sf_set_state_inference_params(state, v_properties);
    }

    public static SubLObject sf_update_state_inference_params(final SubLObject state, final SubLObject v_properties) {
        assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        return sf_set_state_inference_params(state, list_utilities.merge_plist(sf_state_inference_params(state), v_properties));
    }

    public static SubLObject sf_state_query_static_properties(final SubLObject state, final SubLObject ref_cycl) {
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(ref_cycl);
        SubLObject query_static_properties = ask_utilities.query_static_properties_from_legacy_ask_parameters();
        query_static_properties = list_utilities.merge_plist(query_static_properties, sf_state_static_inference_properties(state));
        query_static_properties = putf(query_static_properties, $kw102$CONDITIONAL_SENTENCE_, conditionalP);
        return query_static_properties;
    }

    public static SubLObject sf_state_query_dynamic_properties(final SubLObject state) {
        final SubLObject query_dynamic_properties = sf_state_dynamic_inference_properties(state);
        return list_utilities.merge_plist(query_dynamic_properties, $sf_default_dynamic_properties$.getGlobalValue());
    }

    public static SubLObject sf_state_using_remembered_resources_p(final SubLObject state) {
        final SubLObject interaction = sf_state_interaction(state);
        final SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
        final SubLObject remembered_resources = user_interaction_agenda.uia_state_lookup(v_agenda, $SF_RESOURCES, UNPROVIDED);
        final SubLObject local_resources = sf_state_inference_params(state);
        return equal(remembered_resources, local_resources);
    }

    public static SubLObject sf_status_update(final SubLObject state, final SubLObject property, final SubLObject value) {
        return sf_note_status(state, putf(sf_state_status(state), property, value));
    }

    public static SubLObject sf_status_lookup(final SubLObject state, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != sf_state_p(state) : "rkf_solution_finder.sf_state_p(state) " + "CommonSymbols.NIL != rkf_solution_finder.sf_state_p(state) " + state;
        return getf(sf_state_status(state), property, v_default);
    }

    public static SubLObject sf_status_clear(final SubLObject state, final SubLObject property) {
        return sf_note_status(state, remf(sf_state_status(state), property));
    }

    public static SubLObject sf_status_clear_all(final SubLObject state) {
        return sf_note_status(state, NIL);
    }

    public static SubLObject sf_state_keep_looking_p(final SubLObject state) {
        return sf_status_lookup(state, $KEEP_LOOKING, UNPROVIDED);
    }

    public static SubLObject sf_set_state_keep_looking(final SubLObject state, final SubLObject v_boolean) {
        return sf_status_update(state, $KEEP_LOOKING, v_boolean);
    }

    public static SubLObject sf_state_ask_quirk_p(final SubLObject state) {
        return sf_status_lookup(state, $ASK_QUIRK, UNPROVIDED);
    }

    public static SubLObject sf_set_state_ask_quirk(final SubLObject state, final SubLObject v_boolean) {
        return sf_status_update(state, $ASK_QUIRK, v_boolean);
    }

    public static SubLObject sf_state_try_again_p(final SubLObject state) {
        return sf_status_lookup(state, $TRY_AGAIN, UNPROVIDED);
    }

    public static SubLObject sf_set_state_try_again(final SubLObject state, final SubLObject v_boolean) {
        return sf_status_update(state, $TRY_AGAIN, v_boolean);
    }

    public static SubLObject sf_state_show_resources_p(final SubLObject state) {
        return sf_status_lookup(state, $SHOW_RESOURCES, UNPROVIDED);
    }

    public static SubLObject sf_set_state_show_resources(final SubLObject state, final SubLObject v_boolean) {
        return sf_status_update(state, $SHOW_RESOURCES, v_boolean);
    }

    public static SubLObject sf_state_tautology_p(final SubLObject state) {
        return sf_status_lookup(state, $TAUTOLOGY, UNPROVIDED);
    }

    public static SubLObject sf_set_state_tautology(final SubLObject state, final SubLObject v_boolean) {
        return sf_status_update(state, $TAUTOLOGY, v_boolean);
    }

    public static SubLObject sf_act_new_state() {
        final SubLObject state = sf_new_state();
        sf_set_state_keep_looking(state, NIL);
        sf_set_state_try_again(state, NIL);
        sf_set_state_show_resources(state, NIL);
        return state;
    }

    public static SubLObject sf_act_new_state_with_text(final SubLObject text) {
        final SubLObject state = sf_act_new_state();
        sf_set_state_text(state, text);
        return state;
    }

    public static SubLObject sf_act_note_state_interaction(final SubLObject state, final SubLObject interaction) {
        return sf_set_state_interaction(state, interaction);
    }

    public static SubLObject sf_act_initialize_state_from_query(final SubLObject state, final SubLObject query) {
        sf_clear_state_solution_queue(state);
        sf_clear_state_inference(state);
        sf_clear_state_pros_cons(state);
        return sf_set_state_query(state, query);
    }

    public static SubLObject sf_act_set_state_backchain(final SubLObject state, final SubLObject backchain) {
        if (NIL != sf_state_inference(state)) {
            sf_set_state_keep_looking(state, T);
        }
        if (NIL != sf_state_pros_cons(state)) {
            sf_set_state_try_again(state, T);
        }
        return sf_set_state_backchain(state, backchain);
    }

    public static SubLObject sf_act_set_state_number(final SubLObject state, final SubLObject number) {
        if (NIL != sf_state_inference(state)) {
            sf_set_state_keep_looking(state, T);
        }
        if (NIL != sf_state_pros_cons(state)) {
            sf_set_state_try_again(state, T);
        }
        return sf_set_state_number(state, number);
    }

    public static SubLObject sf_act_set_state_time(final SubLObject state, final SubLObject time) {
        if (NIL != sf_state_inference(state)) {
            sf_set_state_keep_looking(state, T);
        }
        if (NIL != sf_state_pros_cons(state)) {
            sf_set_state_try_again(state, T);
        }
        return sf_set_state_time(state, time);
    }

    public static SubLObject sf_act_set_state_depth(final SubLObject state, final SubLObject depth) {
        if (NIL != sf_state_inference(state)) {
            sf_set_state_keep_looking(state, T);
        }
        if (NIL != sf_state_pros_cons(state)) {
            sf_set_state_try_again(state, T);
        }
        return sf_set_state_depth(state, depth);
    }

    public static SubLObject sf_act_perform_ask(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = sf_state_interaction(state);
        final SubLObject cycl = sf_state_cycl(state);
        final SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
        final SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
        try {
            $ask_quirkP$.bind(sf_state_ask_quirk_p(state), thread);
            result = sf_act_perform_ask_int(state, cycl, mt);
        } finally {
            $ask_quirkP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sf_act_perform_ask_int(final SubLObject state, final SubLObject ref_cycl, final SubLObject mt) {
        if (NIL != sf_yes_no_query_p(ref_cycl)) {
            return sf_perform_yes_no_ask(state, ref_cycl, mt);
        }
        return sf_perform_find_bindings_ask(state, ref_cycl, mt);
    }

    public static SubLObject sf_yes_no_query_p(final SubLObject cycl_sentence) {
        return makeBoolean(NIL == sentence_free_variables(cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sf_perform_find_bindings_ask(final SubLObject state, final SubLObject ref_cycl, final SubLObject mt) {
        sf_set_state_show_resources(state, NIL);
        final SubLObject query_static_properties = sf_state_query_static_properties(state, ref_cycl);
        final SubLObject inference = inference_kernel.new_continuable_inference(ref_cycl, mt, query_static_properties);
        $sf_last_inference$.setGlobalValue(inference);
        if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
            sf_set_state_inference(state, inference);
            sf_continue_inference(state);
        } else {
            sf_set_state_keep_looking(state, NIL);
            sf_set_state_show_resources(state, T);
            final SubLObject pcase_var = inference_datastructures_inference.inference_status(inference);
            if (pcase_var.eql($TAUTOLOGY)) {
                sf_set_state_tautology(state, T);
                sf_set_state_pros_cons(state, $list114);
            }
        }
        return state;
    }

    public static SubLObject sf_record_inference_results(final SubLObject state, final SubLObject results) {
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject v_bindings = NIL;
            SubLObject support_set = NIL;
            destructuring_bind_must_consp(current, datum, $list115);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list115);
            support_set = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject binding_index = sf_state_binding_index(state);
                final SubLObject ss_id = gethash(v_bindings, binding_index, UNPROVIDED);
                SubLObject solution_set = NIL;
                if (NIL != ss_id) {
                    solution_set = sf_find_solution_set_by_id(ss_id);
                }
                if (NIL == solution_set) {
                    if (NIL != ss_id) {
                        remhash(v_bindings, binding_index);
                    }
                    solution_set = sf_new_solution_set();
                    sf_set_solution_set_bindings(solution_set, v_bindings);
                    sethash(v_bindings, binding_index, sf_solution_set_id(solution_set));
                    sf_enqueue_state_solution_set(state, solution_set);
                }
                sf_add_solution_set_support_set(solution_set, support_set);
            } else {
                cdestructuring_bind_error(datum, $list115);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return state;
    }

    public static SubLObject sf_perform_yes_no_ask(final SubLObject state, final SubLObject ref_cycl, final SubLObject mt) {
        final SubLObject backchain = sf_state_backchain(state);
        final SubLObject number = sf_state_number(state);
        final SubLObject time = sf_state_time(state);
        final SubLObject depth = sf_state_depth(state);
        sf_set_state_show_resources(state, NIL);
        SubLObject current;
        final SubLObject datum = current = rkf_query_utilities.rkf_truth(ref_cycl, mt, backchain, number, time, depth);
        SubLObject pros = NIL;
        SubLObject cons = NIL;
        destructuring_bind_must_consp(current, datum, $list116);
        pros = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list116);
        cons = current.first();
        current = current.rest();
        if (NIL == current) {
            sf_set_state_keep_looking(state, NIL);
            sf_set_state_try_again(state, NIL);
            if ((NIL == pros) && (NIL == cons)) {
                sf_set_state_show_resources(state, T);
            }
            sf_set_state_pros_cons(state, list(pros, cons));
        } else {
            cdestructuring_bind_error(datum, $list116);
        }
        return NIL;
    }

    public static SubLObject sf_act_resume_ask(final SubLObject state) {
        final SubLObject interaction = sf_state_interaction(state);
        final SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
        sf_continue_inference(state);
        return state;
    }

    public static SubLObject sf_continue_inference(final SubLObject state) {
        final SubLObject inference = sf_state_inference(state);
        if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
            final SubLObject query_dynamic_properties = sf_state_query_dynamic_properties(state);
            final SubLObject results = inference_kernel.continue_inference(inference, query_dynamic_properties);
            if ((NIL != inference_datastructures_inference.exhausted_inference_p(inference)) && (NIL == inference_datastructures_inference.continuable_inference_p(inference))) {
                sf_set_state_keep_looking(state, NIL);
            } else {
                sf_set_state_keep_looking(state, T);
            }
            if (NIL == results) {
                sf_set_state_show_resources(state, T);
            }
            sf_record_inference_results(state, results);
        }
        return state;
    }

    public static SubLObject declare_rkf_solution_finder_file() {
        declareMacro(me, "with_sf_lock", "WITH-SF-LOCK");
        declareFunction(me, "sf_find_solution_set_by_id", "SF-FIND-SOLUTION-SET-BY-ID", 1, 0, false);
        declareFunction(me, "sf_find_solution_set_by_id_string", "SF-FIND-SOLUTION-SET-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sf_find_state_by_id", "SF-FIND-STATE-BY-ID", 1, 0, false);
        declareFunction(me, "sf_find_state_by_id_string", "SF-FIND-STATE-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sf_next_id", "SF-NEXT-ID", 0, 0, false);
        declareFunction(me, "sf_add_object", "SF-ADD-OBJECT", 2, 0, false);
        declareFunction(me, "sf_rem_object", "SF-REM-OBJECT", 1, 0, false);
        declareFunction(me, "sf_find_object_by_id", "SF-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction(me, "sf_solution_set_print_function_trampoline", "SF-SOLUTION-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sf_solution_set_p", "SF-SOLUTION-SET-P", 1, 0, false);
        new rkf_solution_finder.$sf_solution_set_p$UnaryFunction();
        declareFunction(me, "sf_solution_set_id", "SF-SOLUTION-SET-ID", 1, 0, false);
        declareFunction(me, "sf_solution_set_bindings", "SF-SOLUTION-SET-BINDINGS", 1, 0, false);
        declareFunction(me, "sf_solution_set_supports", "SF-SOLUTION-SET-SUPPORTS", 1, 0, false);
        declareFunction(me, "_csetf_sf_solution_set_id", "_CSETF-SF-SOLUTION-SET-ID", 2, 0, false);
        declareFunction(me, "_csetf_sf_solution_set_bindings", "_CSETF-SF-SOLUTION-SET-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_sf_solution_set_supports", "_CSETF-SF-SOLUTION-SET-SUPPORTS", 2, 0, false);
        declareFunction(me, "make_sf_solution_set", "MAKE-SF-SOLUTION-SET", 0, 1, false);
        declareFunction(me, "visit_defstruct_sf_solution_set", "VISIT-DEFSTRUCT-SF-SOLUTION-SET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sf_solution_set_method", "VISIT-DEFSTRUCT-OBJECT-SF-SOLUTION-SET-METHOD", 2, 0, false);
        declareFunction(me, "sf_new_solution_set", "SF-NEW-SOLUTION-SET", 0, 0, false);
        declareFunction(me, "sf_cleanup_solution_set", "SF-CLEANUP-SOLUTION-SET", 1, 0, false);
        declareFunction(me, "sf_set_solution_set_bindings", "SF-SET-SOLUTION-SET-BINDINGS", 2, 0, false);
        declareFunction(me, "sf_add_solution_set_support_set", "SF-ADD-SOLUTION-SET-SUPPORT-SET", 2, 0, false);
        declareFunction(me, "sf_state_print_function_trampoline", "SF-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sf_state_p", "SF-STATE-P", 1, 0, false);
        new rkf_solution_finder.$sf_state_p$UnaryFunction();
        declareFunction(me, "sf_state_id", "SF-STATE-ID", 1, 0, false);
        declareFunction(me, "sf_state_interaction", "SF-STATE-INTERACTION", 1, 0, false);
        declareFunction(me, "sf_state_text", "SF-STATE-TEXT", 1, 0, false);
        declareFunction(me, "sf_state_query", "SF-STATE-QUERY", 1, 0, false);
        declareFunction(me, "sf_state_inference_params", "SF-STATE-INFERENCE-PARAMS", 1, 0, false);
        declareFunction(me, "sf_state_inference", "SF-STATE-INFERENCE", 1, 0, false);
        declareFunction(me, "sf_state_solution_queue", "SF-STATE-SOLUTION-QUEUE", 1, 0, false);
        declareFunction(me, "sf_state_status", "SF-STATE-STATUS", 1, 0, false);
        declareFunction(me, "sf_state_pros_cons", "SF-STATE-PROS-CONS", 1, 0, false);
        declareFunction(me, "sf_state_binding_index", "SF-STATE-BINDING-INDEX", 1, 0, false);
        declareFunction(me, "_csetf_sf_state_id", "_CSETF-SF-STATE-ID", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_interaction", "_CSETF-SF-STATE-INTERACTION", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_text", "_CSETF-SF-STATE-TEXT", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_query", "_CSETF-SF-STATE-QUERY", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_inference_params", "_CSETF-SF-STATE-INFERENCE-PARAMS", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_inference", "_CSETF-SF-STATE-INFERENCE", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_solution_queue", "_CSETF-SF-STATE-SOLUTION-QUEUE", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_status", "_CSETF-SF-STATE-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_pros_cons", "_CSETF-SF-STATE-PROS-CONS", 2, 0, false);
        declareFunction(me, "_csetf_sf_state_binding_index", "_CSETF-SF-STATE-BINDING-INDEX", 2, 0, false);
        declareFunction(me, "make_sf_state", "MAKE-SF-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sf_state", "VISIT-DEFSTRUCT-SF-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sf_state_method", "VISIT-DEFSTRUCT-OBJECT-SF-STATE-METHOD", 2, 0, false);
        declareMacro(me, "with_different_sf_state_defaults", "WITH-DIFFERENT-SF-STATE-DEFAULTS");
        declareFunction(me, "sf_new_state", "SF-NEW-STATE", 0, 0, false);
        declareFunction(me, "sf_cleanup_state", "SF-CLEANUP-STATE", 1, 0, false);
        declareFunction(me, "sf_set_state_interaction", "SF-SET-STATE-INTERACTION", 2, 0, false);
        declareFunction(me, "sf_set_state_text", "SF-SET-STATE-TEXT", 2, 0, false);
        declareFunction(me, "sf_set_state_query", "SF-SET-STATE-QUERY", 2, 0, false);
        declareFunction(me, "sf_set_state_backchain", "SF-SET-STATE-BACKCHAIN", 2, 0, false);
        declareFunction(me, "sf_set_state_number", "SF-SET-STATE-NUMBER", 2, 0, false);
        declareFunction(me, "sf_set_state_time", "SF-SET-STATE-TIME", 2, 0, false);
        declareFunction(me, "sf_set_state_depth", "SF-SET-STATE-DEPTH", 2, 0, false);
        declareFunction(me, "sf_set_state_inference_params", "SF-SET-STATE-INFERENCE-PARAMS", 2, 0, false);
        declareFunction(me, "sf_set_state_inference", "SF-SET-STATE-INFERENCE", 2, 0, false);
        declareFunction(me, "sf_clear_state_inference", "SF-CLEAR-STATE-INFERENCE", 1, 0, false);
        declareFunction(me, "sf_enqueue_state_solution_set", "SF-ENQUEUE-STATE-SOLUTION-SET", 2, 0, false);
        declareFunction(me, "sf_clear_state_solution_queue", "SF-CLEAR-STATE-SOLUTION-QUEUE", 1, 0, false);
        declareFunction(me, "sf_note_status", "SF-NOTE-STATUS", 2, 0, false);
        declareFunction(me, "sf_set_state_pros_cons", "SF-SET-STATE-PROS-CONS", 2, 0, false);
        declareFunction(me, "sf_clear_state_pros_cons", "SF-CLEAR-STATE-PROS-CONS", 1, 0, false);
        declareFunction(me, "sf_add_state_pro", "SF-ADD-STATE-PRO", 2, 0, false);
        declareFunction(me, "sf_add_state_con", "SF-ADD-STATE-CON", 2, 0, false);
        declareFunction(me, "sf_state_pros", "SF-STATE-PROS", 1, 0, false);
        declareFunction(me, "sf_state_cons", "SF-STATE-CONS", 1, 0, false);
        declareFunction(me, "sf_state_cycl", "SF-STATE-CYCL", 1, 0, false);
        declareFunction(me, "sf_state_halt_reason", "SF-STATE-HALT-REASON", 1, 0, false);
        declareFunction(me, "sf_var_indexical_record", "SF-VAR-INDEXICAL-RECORD", 2, 0, false);
        declareFunction(me, "sf_state_dynamic_inference_properties", "SF-STATE-DYNAMIC-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "sf_state_static_inference_properties", "SF-STATE-STATIC-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "sf_state_backchain", "SF-STATE-BACKCHAIN", 1, 0, false);
        declareFunction(me, "sf_state_number", "SF-STATE-NUMBER", 1, 0, false);
        declareFunction(me, "sf_state_time", "SF-STATE-TIME", 1, 0, false);
        declareFunction(me, "sf_state_depth", "SF-STATE-DEPTH", 1, 0, false);
        declareFunction(me, "sf_declare_state_backchain", "SF-DECLARE-STATE-BACKCHAIN", 2, 0, false);
        declareFunction(me, "sf_declare_state_number", "SF-DECLARE-STATE-NUMBER", 2, 0, false);
        declareFunction(me, "sf_declare_state_time", "SF-DECLARE-STATE-TIME", 2, 0, false);
        declareFunction(me, "sf_declare_state_depth", "SF-DECLARE-STATE-DEPTH", 2, 0, false);
        declareFunction(me, "sf_declare_state_inference_params", "SF-DECLARE-STATE-INFERENCE-PARAMS", 2, 0, false);
        declareFunction(me, "sf_update_state_inference_params", "SF-UPDATE-STATE-INFERENCE-PARAMS", 2, 0, false);
        declareFunction(me, "sf_state_query_static_properties", "SF-STATE-QUERY-STATIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "sf_state_query_dynamic_properties", "SF-STATE-QUERY-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "sf_state_using_remembered_resources_p", "SF-STATE-USING-REMEMBERED-RESOURCES-P", 1, 0, false);
        declareFunction(me, "sf_status_update", "SF-STATUS-UPDATE", 3, 0, false);
        declareFunction(me, "sf_status_lookup", "SF-STATUS-LOOKUP", 2, 1, false);
        declareFunction(me, "sf_status_clear", "SF-STATUS-CLEAR", 2, 0, false);
        declareFunction(me, "sf_status_clear_all", "SF-STATUS-CLEAR-ALL", 1, 0, false);
        declareFunction(me, "sf_state_keep_looking_p", "SF-STATE-KEEP-LOOKING-P", 1, 0, false);
        declareFunction(me, "sf_set_state_keep_looking", "SF-SET-STATE-KEEP-LOOKING", 2, 0, false);
        declareFunction(me, "sf_state_ask_quirk_p", "SF-STATE-ASK-QUIRK-P", 1, 0, false);
        declareFunction(me, "sf_set_state_ask_quirk", "SF-SET-STATE-ASK-QUIRK", 2, 0, false);
        declareFunction(me, "sf_state_try_again_p", "SF-STATE-TRY-AGAIN-P", 1, 0, false);
        declareFunction(me, "sf_set_state_try_again", "SF-SET-STATE-TRY-AGAIN", 2, 0, false);
        declareFunction(me, "sf_state_show_resources_p", "SF-STATE-SHOW-RESOURCES-P", 1, 0, false);
        declareFunction(me, "sf_set_state_show_resources", "SF-SET-STATE-SHOW-RESOURCES", 2, 0, false);
        declareFunction(me, "sf_state_tautology_p", "SF-STATE-TAUTOLOGY-P", 1, 0, false);
        declareFunction(me, "sf_set_state_tautology", "SF-SET-STATE-TAUTOLOGY", 2, 0, false);
        declareFunction(me, "sf_act_new_state", "SF-ACT-NEW-STATE", 0, 0, false);
        declareFunction(me, "sf_act_new_state_with_text", "SF-ACT-NEW-STATE-WITH-TEXT", 1, 0, false);
        declareFunction(me, "sf_act_note_state_interaction", "SF-ACT-NOTE-STATE-INTERACTION", 2, 0, false);
        declareFunction(me, "sf_act_initialize_state_from_query", "SF-ACT-INITIALIZE-STATE-FROM-QUERY", 2, 0, false);
        declareFunction(me, "sf_act_set_state_backchain", "SF-ACT-SET-STATE-BACKCHAIN", 2, 0, false);
        declareFunction(me, "sf_act_set_state_number", "SF-ACT-SET-STATE-NUMBER", 2, 0, false);
        declareFunction(me, "sf_act_set_state_time", "SF-ACT-SET-STATE-TIME", 2, 0, false);
        declareFunction(me, "sf_act_set_state_depth", "SF-ACT-SET-STATE-DEPTH", 2, 0, false);
        declareFunction(me, "sf_act_perform_ask", "SF-ACT-PERFORM-ASK", 1, 0, false);
        declareFunction(me, "sf_act_perform_ask_int", "SF-ACT-PERFORM-ASK-INT", 3, 0, false);
        declareFunction(me, "sf_yes_no_query_p", "SF-YES-NO-QUERY-P", 1, 0, false);
        declareFunction(me, "sf_perform_find_bindings_ask", "SF-PERFORM-FIND-BINDINGS-ASK", 3, 0, false);
        declareFunction(me, "sf_record_inference_results", "SF-RECORD-INFERENCE-RESULTS", 2, 0, false);
        declareFunction(me, "sf_perform_yes_no_ask", "SF-PERFORM-YES-NO-ASK", 3, 0, false);
        declareFunction(me, "sf_act_resume_ask", "SF-ACT-RESUME-ASK", 1, 0, false);
        declareFunction(me, "sf_continue_inference", "SF-CONTINUE-INFERENCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_solution_finder_file() {
        defconstant("*SF-BACKCHAIN-DEFAULT*", NIL);
        defconstant("*SF-NUMBER-DEFAULT*", TEN_INTEGER);
        defconstant("*SF-TIME-DEFAULT*", $int$30);
        deflexical("*SF-LOCK*", make_lock($$$Solution_Finder_Lock));
        deflexical("*SF-ISG*", SubLTrampolineFile.maybeDefault($sf_isg$, $sf_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*SF-INDEX*", SubLTrampolineFile.maybeDefault($sf_index$, $sf_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-SF-SOLUTION-SET*", SF_SOLUTION_SET);
        defconstant("*DTP-SF-STATE*", SF_STATE);
        defparameter("*SF-TYPICAL-BACKCHAIN-DEFAULT*", $sf_backchain_default$.getGlobalValue());
        defparameter("*SF-TYPICAL-NUMBER-DEFAULT*", $sf_number_default$.getGlobalValue());
        defparameter("*SF-TYPICAL-TIME-DEFAULT*", $sf_time_default$.getGlobalValue());
        deflexical("*SF-DEFAULT-DYNAMIC-PROPERTIES*", list($CONTINUABLE_, T, $ANSWER_LANGUAGE, $HL, $RETURN, $BINDINGS_AND_SUPPORTS, $kw108$FORGET_EXTRA_RESULTS_, NIL));
        deflexical("*SF-LAST-INFERENCE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_solution_finder_file() {
        declare_defglobal($sf_isg$);
        declare_defglobal($sf_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sf_solution_set$.getGlobalValue(), symbol_function(SF_SOLUTION_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(SF_SOLUTION_SET_ID, _CSETF_SF_SOLUTION_SET_ID);
        def_csetf(SF_SOLUTION_SET_BINDINGS, _CSETF_SF_SOLUTION_SET_BINDINGS);
        def_csetf(SF_SOLUTION_SET_SUPPORTS, _CSETF_SF_SOLUTION_SET_SUPPORTS);
        identity(SF_SOLUTION_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sf_solution_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SF_SOLUTION_SET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sf_state$.getGlobalValue(), symbol_function(SF_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list38);
        def_csetf(SF_STATE_ID, _CSETF_SF_STATE_ID);
        def_csetf(SF_STATE_INTERACTION, _CSETF_SF_STATE_INTERACTION);
        def_csetf(SF_STATE_TEXT, _CSETF_SF_STATE_TEXT);
        def_csetf(SF_STATE_QUERY, _CSETF_SF_STATE_QUERY);
        def_csetf(SF_STATE_INFERENCE_PARAMS, _CSETF_SF_STATE_INFERENCE_PARAMS);
        def_csetf(SF_STATE_INFERENCE, _CSETF_SF_STATE_INFERENCE);
        def_csetf(SF_STATE_SOLUTION_QUEUE, _CSETF_SF_STATE_SOLUTION_QUEUE);
        def_csetf(SF_STATE_STATUS, _CSETF_SF_STATE_STATUS);
        def_csetf(SF_STATE_PROS_CONS, _CSETF_SF_STATE_PROS_CONS);
        def_csetf(SF_STATE_BINDING_INDEX, _CSETF_SF_STATE_BINDING_INDEX);
        identity(SF_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sf_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SF_STATE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_solution_finder_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_solution_finder_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_solution_finder_file();
    }

    

    public static final class $sf_solution_set_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $bindings;

        public SubLObject $supports;

        private static final SubLStructDeclNative structDecl;

        private $sf_solution_set_native() {
            this.$id = Lisp.NIL;
            this.$bindings = Lisp.NIL;
            this.$supports = Lisp.NIL;
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
            return this.$bindings;
        }

        @Override
        public SubLObject getField4() {
            return this.$supports;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }

        static {
            structDecl = makeStructDeclNative($sf_solution_set_native.class, SF_SOLUTION_SET, SF_SOLUTION_SET_P, $list8, $list9, new String[]{ "$id", "$bindings", "$supports" }, $list10, $list11, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sf_solution_set_p$UnaryFunction extends UnaryFunction {
        public $sf_solution_set_p$UnaryFunction() {
            super(extractFunctionNamed("SF-SOLUTION-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sf_solution_set_p(arg1);
        }
    }

    public static final class $sf_state_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $interaction;

        public SubLObject $text;

        public SubLObject $query;

        public SubLObject $inference_params;

        public SubLObject $inference;

        public SubLObject $solution_queue;

        public SubLObject $status;

        public SubLObject $pros_cons;

        public SubLObject $binding_index;

        private static final SubLStructDeclNative structDecl;

        private $sf_state_native() {
            this.$id = Lisp.NIL;
            this.$interaction = Lisp.NIL;
            this.$text = Lisp.NIL;
            this.$query = Lisp.NIL;
            this.$inference_params = Lisp.NIL;
            this.$inference = Lisp.NIL;
            this.$solution_queue = Lisp.NIL;
            this.$status = Lisp.NIL;
            this.$pros_cons = Lisp.NIL;
            this.$binding_index = Lisp.NIL;
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
            return this.$interaction;
        }

        @Override
        public SubLObject getField4() {
            return this.$text;
        }

        @Override
        public SubLObject getField5() {
            return this.$query;
        }

        @Override
        public SubLObject getField6() {
            return this.$inference_params;
        }

        @Override
        public SubLObject getField7() {
            return this.$inference;
        }

        @Override
        public SubLObject getField8() {
            return this.$solution_queue;
        }

        @Override
        public SubLObject getField9() {
            return this.$status;
        }

        @Override
        public SubLObject getField10() {
            return this.$pros_cons;
        }

        @Override
        public SubLObject getField11() {
            return this.$binding_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$interaction = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$text = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$query = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$inference_params = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$solution_queue = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$pros_cons = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$binding_index = value;
        }

        static {
            structDecl = makeStructDeclNative($sf_state_native.class, SF_STATE, SF_STATE_P, $list33, $list34, new String[]{ "$id", "$interaction", "$text", "$query", "$inference_params", "$inference", "$solution_queue", "$status", "$pros_cons", "$binding_index" }, $list35, $list36, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sf_state_p$UnaryFunction extends UnaryFunction {
        public $sf_state_p$UnaryFunction() {
            super(extractFunctionNamed("SF-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sf_state_p(arg1);
        }
    }
}

/**
 * Total time: 359 ms synthetic
 */
