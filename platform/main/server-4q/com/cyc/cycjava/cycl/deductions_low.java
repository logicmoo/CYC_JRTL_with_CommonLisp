package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class deductions_low extends SubLTranslatedFile {
    public static final SubLFile me = new deductions_low();

    public static final String myName = "com.cyc.cycjava.cycl.deductions_low";

    public static final String myFingerPrint = "d677bf9b954711f473d3f0d657bc3c192f74045ecfd62b74b755df6b5249ddc9";

    // defconstant
    public static final SubLSymbol $dtp_deduction_content$ = makeSymbol("*DTP-DEDUCTION-CONTENT*");

    // defparameter
    private static final SubLSymbol $bug_34058_backward_compatibility_deduction_dump_support_enabledP$ = makeSymbol("*BUG-34058-BACKWARD-COMPATIBILITY-DEDUCTION-DUMP-SUPPORT-ENABLED?*");

    // Internal Constants
    public static final SubLSymbol DEDUCTION_CONTENT = makeSymbol("DEDUCTION-CONTENT");

    public static final SubLSymbol DEDUCTION_CONTENT_P = makeSymbol("DEDUCTION-CONTENT-P");

    private static final SubLInteger $int$149 = makeInteger(149);

    public static final SubLList $list3 = list(makeSymbol("TV"), makeSymbol("SUPPORTED-OBJECT"), makeSymbol("SUPPORTS"), makeSymbol("BINDINGS"), makeSymbol("PRAGMATIC-SUPPORT-MTS"));

    public static final SubLList $list4 = list(makeKeyword("TV"), makeKeyword("SUPPORTED-OBJECT"), makeKeyword("SUPPORTS"), makeKeyword("BINDINGS"), makeKeyword("PRAGMATIC-SUPPORT-MTS"));

    public static final SubLList $list5 = list(makeSymbol("D-CONTENT-TV"), makeSymbol("D-CONTENT-SUPPORTED-OBJECT"), makeSymbol("D-CONTENT-SUPPORTS"), makeSymbol("D-CONTENT-BINDINGS"), makeSymbol("D-CONTENT-PRAGMATIC-SUPPORT-MTS"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-D-CONTENT-TV"), makeSymbol("_CSETF-D-CONTENT-SUPPORTED-OBJECT"), makeSymbol("_CSETF-D-CONTENT-SUPPORTS"), makeSymbol("_CSETF-D-CONTENT-BINDINGS"), makeSymbol("_CSETF-D-CONTENT-PRAGMATIC-SUPPORT-MTS"));



    public static final SubLSymbol DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DEDUCTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DEDUCTION-CONTENT-P"));

    private static final SubLSymbol D_CONTENT_TV = makeSymbol("D-CONTENT-TV");

    private static final SubLSymbol _CSETF_D_CONTENT_TV = makeSymbol("_CSETF-D-CONTENT-TV");

    private static final SubLSymbol D_CONTENT_SUPPORTED_OBJECT = makeSymbol("D-CONTENT-SUPPORTED-OBJECT");

    private static final SubLSymbol _CSETF_D_CONTENT_SUPPORTED_OBJECT = makeSymbol("_CSETF-D-CONTENT-SUPPORTED-OBJECT");

    private static final SubLSymbol D_CONTENT_SUPPORTS = makeSymbol("D-CONTENT-SUPPORTS");

    private static final SubLSymbol _CSETF_D_CONTENT_SUPPORTS = makeSymbol("_CSETF-D-CONTENT-SUPPORTS");

    private static final SubLSymbol D_CONTENT_BINDINGS = makeSymbol("D-CONTENT-BINDINGS");

    private static final SubLSymbol _CSETF_D_CONTENT_BINDINGS = makeSymbol("_CSETF-D-CONTENT-BINDINGS");

    private static final SubLSymbol D_CONTENT_PRAGMATIC_SUPPORT_MTS = makeSymbol("D-CONTENT-PRAGMATIC-SUPPORT-MTS");

    private static final SubLSymbol _CSETF_D_CONTENT_PRAGMATIC_SUPPORT_MTS = makeSymbol("_CSETF-D-CONTENT-PRAGMATIC-SUPPORT-MTS");









    private static final SubLSymbol $PRAGMATIC_SUPPORT_MTS = makeKeyword("PRAGMATIC-SUPPORT-MTS");

    private static final SubLString $str25$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_DEDUCTION_CONTENT = makeSymbol("MAKE-DEDUCTION-CONTENT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DEDUCTION_CONTENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DEDUCTION-CONTENT-METHOD");







    public static SubLObject deduction_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject deduction_content_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$deduction_content_native.class ? T : NIL;
    }

    public static SubLObject d_content_tv(final SubLObject v_object) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject d_content_supported_object(final SubLObject v_object) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject d_content_supports(final SubLObject v_object) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject d_content_bindings(final SubLObject v_object) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject d_content_pragmatic_support_mts(final SubLObject v_object) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_d_content_tv(final SubLObject v_object, final SubLObject value) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_d_content_supported_object(final SubLObject v_object, final SubLObject value) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_d_content_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_d_content_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_d_content_pragmatic_support_mts(final SubLObject v_object, final SubLObject value) {
        assert NIL != deduction_content_p(v_object) : "deductions_low.deduction_content_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_deduction_content(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $deduction_content_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TV)) {
                _csetf_d_content_tv(v_new, current_value);
            } else
                if (pcase_var.eql($SUPPORTED_OBJECT)) {
                    _csetf_d_content_supported_object(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPPORTS)) {
                        _csetf_d_content_supports(v_new, current_value);
                    } else
                        if (pcase_var.eql($BINDINGS)) {
                            _csetf_d_content_bindings(v_new, current_value);
                        } else
                            if (pcase_var.eql($PRAGMATIC_SUPPORT_MTS)) {
                                _csetf_d_content_pragmatic_support_mts(v_new, current_value);
                            } else {
                                Errors.error($str25$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_deduction_content(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DEDUCTION_CONTENT, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TV, d_content_tv(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTED_OBJECT, d_content_supported_object(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, d_content_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, d_content_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $PRAGMATIC_SUPPORT_MTS, d_content_pragmatic_support_mts(obj));
        funcall(visitor_fn, obj, $END, MAKE_DEDUCTION_CONTENT, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_deduction_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_deduction_content(obj, visitor_fn);
    }

    public static SubLObject create_deduction_content(final SubLObject id, final SubLObject supported_object, final SubLObject supports, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        SubLObject deduction_content = NIL;
        deduction_content = make_deduction_content(UNPROVIDED);
        _csetf_d_content_supported_object(deduction_content, supported_object);
        _csetf_d_content_supports(deduction_content, supports);
        _csetf_d_content_tv(deduction_content, $UNKNOWN);
        _csetf_d_content_bindings(deduction_content, v_bindings);
        _csetf_d_content_pragmatic_support_mts(deduction_content, pragmatic_support_mts);
        deduction_manager.register_deduction_content(id, deduction_content);
        return deduction_content;
    }

    public static SubLObject destroy_deduction_content(final SubLObject id) {
        final SubLObject deduction_content = deduction_manager.lookup_deduction_content(id);
        if (NIL != deduction_content_p(deduction_content)) {
            deduction_manager.deregister_deduction_content(id);
            _csetf_d_content_tv(deduction_content, NIL);
            _csetf_d_content_supported_object(deduction_content, NIL);
            _csetf_d_content_supports(deduction_content, NIL);
            _csetf_d_content_bindings(deduction_content, NIL);
            _csetf_d_content_pragmatic_support_mts(deduction_content, NIL);
            return T;
        }
        return NIL;
    }

    public static SubLObject lookup_deduction_tv(final SubLObject id) {
        return d_content_tv(deduction_manager.lookup_deduction_content(id));
    }

    public static SubLObject lookup_deduction_supported_object(final SubLObject id) {
        return d_content_supported_object(deduction_manager.lookup_deduction_content(id));
    }

    public static SubLObject lookup_deduction_supports(final SubLObject id) {
        return d_content_supports(deduction_manager.lookup_deduction_content(id));
    }

    public static SubLObject lookup_deduction_bindings(final SubLObject id) {
        return d_content_bindings(deduction_manager.lookup_deduction_content(id));
    }

    public static SubLObject lookup_deduction_pragmatic_support_mts(final SubLObject id) {
        return d_content_pragmatic_support_mts(deduction_manager.lookup_deduction_content(id));
    }

    public static SubLObject set_deduction_tv(final SubLObject id, final SubLObject new_tv) {
        _csetf_d_content_tv(deduction_manager.lookup_deduction_content(id), new_tv);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }

    public static SubLObject set_deduction_supports(final SubLObject id, final SubLObject new_supports) {
        _csetf_d_content_supports(deduction_manager.lookup_deduction_content(id), new_supports);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }

    public static SubLObject set_deduction_bindings(final SubLObject id, final SubLObject new_supports) {
        _csetf_d_content_bindings(deduction_manager.lookup_deduction_content(id), new_supports);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }

    public static SubLObject set_deduction_pragmatic_support_mts(final SubLObject id, final SubLObject new_supports) {
        _csetf_d_content_pragmatic_support_mts(deduction_manager.lookup_deduction_content(id), new_supports);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }

    public static SubLObject dump_deduction_content(final SubLObject deduction, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output(deduction_tv(deduction), stream);
        cfasl_output(deductions_high.deduction_supported_object(deduction), stream);
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject v_bindings = deduction_bindings_internal(deduction);
        final SubLObject pragmatic_support_mts = deduction_pragmatic_support_mts_internal(deduction);
        if ((NIL != $bug_34058_backward_compatibility_deduction_dump_support_enabledP$.getDynamicValue(thread)) || ((NIL == v_bindings) && (NIL == pragmatic_support_mts))) {
            cfasl_output(deductions_high.deduction_supports(deduction), stream);
        } else {
            final SubLObject support_details_vector = make_vector(THREE_INTEGER, UNPROVIDED);
            set_aref(support_details_vector, ZERO_INTEGER, supports);
            set_aref(support_details_vector, ONE_INTEGER, v_bindings);
            set_aref(support_details_vector, TWO_INTEGER, pragmatic_support_mts);
            cfasl_output(support_details_vector, stream);
        }
        return deduction;
    }

    public static SubLObject load_deduction_content(final SubLObject deduction, final SubLObject stream) {
        final SubLObject id = deduction_handles.deduction_id(deduction);
        final SubLObject tv = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject support_details = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject supports = NIL;
        SubLObject v_bindings = NIL;
        SubLObject pragmatic_support_mts = NIL;
        if (support_details.isVector()) {
            supports = aref(support_details, ZERO_INTEGER);
            v_bindings = aref(support_details, ONE_INTEGER);
            pragmatic_support_mts = aref(support_details, TWO_INTEGER);
        } else {
            supports = support_details;
        }
        load_deduction_content_int(id, assertion, supports, v_bindings, pragmatic_support_mts, tv);
        return deduction;
    }

    public static SubLObject load_deduction_content_int(final SubLObject id, final SubLObject assertion, final SubLObject supports, final SubLObject v_bindings, final SubLObject pragmatic_support_mts, final SubLObject tv) {
        final SubLObject deduction_content = create_deduction_content(id, assertion, supports, v_bindings, pragmatic_support_mts);
        _csetf_d_content_tv(deduction_content, tv);
        return id;
    }

    public static SubLObject kb_create_deduction_kb_store(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject internal_id = deduction_handles.make_deduction_id();
        final SubLObject deduction = deduction_handles.make_deduction_shell(internal_id);
        kb_create_deduction_int(deduction, internal_id, assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
        return internal_id;
    }

    public static SubLObject kb_create_deduction_int(final SubLObject deduction, final SubLObject internal_id, final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject tv = enumeration_types.tv_from_truth_strength(truth, strength);
        create_deduction_content(internal_id, assertion, supports, v_bindings, pragmatic_support_mts);
        reset_deduction_tv(deduction, tv);
        if (NIL != assertion_handles.assertion_p(assertion)) {
            assertions_low.add_new_assertion_argument(assertion, deduction);
        }
        add_deduction_dependents(deduction);
        return NIL;
    }

    public static SubLObject kb_create_deduction_cyc(final SubLObject internal_id) {
        return deduction_handles.make_deduction_shell(internal_id);
    }

    public static SubLObject kb_manifest_deduction(final SubLObject deduction, final SubLObject internal_id, final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject tv = enumeration_types.tv_from_truth_strength(truth, strength);
        create_deduction_content(internal_id, assertion, supports, v_bindings, pragmatic_support_mts);
        reset_deduction_tv(deduction, tv);
        if (NIL != assertion_handles.assertion_p(assertion)) {
            assertions_low.add_new_assertion_argument(assertion, deduction);
        }
        add_deduction_dependents(deduction);
        return NIL;
    }

    public static SubLObject add_deduction_dependents(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        SubLObject cdolist_list_var = deduction_supports_internal(deduction);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(support)) {
                assertions_low.add_assertion_dependent(support, deduction);
            } else
                if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                    kb_hl_supports_low.kb_hl_support_add_dependent_int(support, deduction);
                }

            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return deduction;
    }

    public static SubLObject kb_remove_deduction_internal(final SubLObject deduction) {
        final SubLObject id = deduction_handles.deduction_id(deduction);
        destroy_deduction_content(id);
        deduction_handles.deregister_deduction_id(id);
        deduction_handles.free_deduction(deduction);
        return T;
    }

    public static SubLObject remove_deduction_dependents(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        SubLObject cdolist_list_var = deduction_supports_internal(deduction);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.valid_assertionP(support, UNPROVIDED)) {
                assertions_low.remove_assertion_dependent(support, deduction);
            } else
                if (NIL != kb_hl_support_handles.valid_kb_hl_supportP(support, UNPROVIDED)) {
                    kb_hl_supports_low.kb_hl_support_remove_dependent_int(support, deduction);
                }

            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return deduction;
    }

    public static SubLObject reset_deduction_tv(final SubLObject deduction, final SubLObject new_tv) {
        set_deduction_tv(deduction_handles.deduction_id(deduction), new_tv);
        return deduction;
    }

    public static SubLObject kb_set_deduction_strength_internal(final SubLObject deduction, final SubLObject new_strength) {
        final SubLObject truth = arguments.argument_truth(deduction);
        final SubLObject new_tv = enumeration_types.tv_from_truth_strength(truth, new_strength);
        return reset_deduction_tv(deduction, new_tv);
    }

    public static SubLObject reset_deduction_supports(final SubLObject deduction, final SubLObject new_supports) {
        set_deduction_supports(deduction_handles.deduction_id(deduction), new_supports);
        return deduction;
    }

    public static SubLObject reset_deduction_bindings(final SubLObject deduction, final SubLObject new_bindings) {
        set_deduction_bindings(deduction_handles.deduction_id(deduction), new_bindings);
        return deduction;
    }

    public static SubLObject reset_deduction_pragmatic_support_mts(final SubLObject deduction, final SubLObject new_pragmatic_support_mts) {
        set_deduction_pragmatic_support_mts(deduction_handles.deduction_id(deduction), new_pragmatic_support_mts);
        return deduction;
    }

    public static SubLObject find_deduction_internal(SubLObject supported_object, final SubLObject supports, final SubLObject truth) {
        SubLObject deduction = NIL;
        if (NIL != arguments.hl_support_p(supported_object)) {
            final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(supported_object);
            if (NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                supported_object = kb_hl_support;
            }
        }
        if (NIL != assertion_handles.assertion_p(supported_object)) {
            SubLObject rest;
            SubLObject argument;
            for (rest = NIL, rest = assertions_high.assertion_arguments(supported_object); (NIL == deduction) && (NIL != rest); rest = rest.rest()) {
                argument = rest.first();
                if ((NIL != deduction_handles.deduction_p(argument)) && (NIL != deduction_matches_specification(argument, supported_object, supports, truth))) {
                    deduction = argument;
                }
            }
        } else
            if (NIL != kb_hl_support_handles.kb_hl_support_p(supported_object)) {
                SubLObject rest;
                SubLObject argument;
                SubLObject hl_support;
                for (rest = NIL, rest = kb_hl_supports_interface.kb_kb_hl_support_arguments(supported_object); (NIL == deduction) && (NIL != rest); rest = rest.rest()) {
                    argument = rest.first();
                    if (NIL != deduction_handles.deduction_p(argument)) {
                        hl_support = kb_hl_supports_low.kb_hl_support_hl_support_int(supported_object);
                        if (NIL != deduction_matches_specification(argument, hl_support, supports, truth)) {
                            deduction = argument;
                        }
                    }
                }
            }

        return deduction;
    }

    public static SubLObject deduction_matches_specification(final SubLObject deduction, final SubLObject supported_object, final SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        return makeBoolean((supported_object.equal(deductions_high.deduction_supported_object(deduction)) && truth.eql(arguments.argument_truth(deduction))) && (NIL != deductions_high.deduction_supports_equal(supports, deductions_high.deduction_supports(deduction))));
    }

    public static SubLObject deduction_supported_object_internal(final SubLObject deduction) {
        return lookup_deduction_supported_object(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject deduction_tv(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        return lookup_deduction_tv(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject deduction_supports_internal(final SubLObject deduction) {
        return lookup_deduction_supports(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject deduction_truth_internal(final SubLObject deduction) {
        return enumeration_types.tv_truth(deduction_tv(deduction));
    }

    public static SubLObject deduction_strength_internal(final SubLObject deduction) {
        return enumeration_types.tv_strength(deduction_tv(deduction));
    }

    public static SubLObject deduction_bindings_internal(final SubLObject deduction) {
        return lookup_deduction_bindings(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject deduction_pragmatic_support_mts_internal(final SubLObject deduction) {
        return lookup_deduction_pragmatic_support_mts(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject declare_deductions_low_file() {
        declareFunction(me, "deduction_content_print_function_trampoline", "DEDUCTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "deduction_content_p", "DEDUCTION-CONTENT-P", 1, 0, false);
        new deductions_low.$deduction_content_p$UnaryFunction();
        declareFunction(me, "d_content_tv", "D-CONTENT-TV", 1, 0, false);
        declareFunction(me, "d_content_supported_object", "D-CONTENT-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction(me, "d_content_supports", "D-CONTENT-SUPPORTS", 1, 0, false);
        declareFunction(me, "d_content_bindings", "D-CONTENT-BINDINGS", 1, 0, false);
        declareFunction(me, "d_content_pragmatic_support_mts", "D-CONTENT-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        declareFunction(me, "_csetf_d_content_tv", "_CSETF-D-CONTENT-TV", 2, 0, false);
        declareFunction(me, "_csetf_d_content_supported_object", "_CSETF-D-CONTENT-SUPPORTED-OBJECT", 2, 0, false);
        declareFunction(me, "_csetf_d_content_supports", "_CSETF-D-CONTENT-SUPPORTS", 2, 0, false);
        declareFunction(me, "_csetf_d_content_bindings", "_CSETF-D-CONTENT-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_d_content_pragmatic_support_mts", "_CSETF-D-CONTENT-PRAGMATIC-SUPPORT-MTS", 2, 0, false);
        declareFunction(me, "make_deduction_content", "MAKE-DEDUCTION-CONTENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_deduction_content", "VISIT-DEFSTRUCT-DEDUCTION-CONTENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_deduction_content_method", "VISIT-DEFSTRUCT-OBJECT-DEDUCTION-CONTENT-METHOD", 2, 0, false);
        declareFunction(me, "create_deduction_content", "CREATE-DEDUCTION-CONTENT", 3, 2, false);
        declareFunction(me, "destroy_deduction_content", "DESTROY-DEDUCTION-CONTENT", 1, 0, false);
        declareFunction(me, "lookup_deduction_tv", "LOOKUP-DEDUCTION-TV", 1, 0, false);
        declareFunction(me, "lookup_deduction_supported_object", "LOOKUP-DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction(me, "lookup_deduction_supports", "LOOKUP-DEDUCTION-SUPPORTS", 1, 0, false);
        declareFunction(me, "lookup_deduction_bindings", "LOOKUP-DEDUCTION-BINDINGS", 1, 0, false);
        declareFunction(me, "lookup_deduction_pragmatic_support_mts", "LOOKUP-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        declareFunction(me, "set_deduction_tv", "SET-DEDUCTION-TV", 2, 0, false);
        declareFunction(me, "set_deduction_supports", "SET-DEDUCTION-SUPPORTS", 2, 0, false);
        declareFunction(me, "set_deduction_bindings", "SET-DEDUCTION-BINDINGS", 2, 0, false);
        declareFunction(me, "set_deduction_pragmatic_support_mts", "SET-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 2, 0, false);
        declareFunction(me, "dump_deduction_content", "DUMP-DEDUCTION-CONTENT", 2, 0, false);
        declareFunction(me, "load_deduction_content", "LOAD-DEDUCTION-CONTENT", 2, 0, false);
        declareFunction(me, "load_deduction_content_int", "LOAD-DEDUCTION-CONTENT-INT", 6, 0, false);
        declareFunction(me, "kb_create_deduction_kb_store", "KB-CREATE-DEDUCTION-KB-STORE", 4, 2, false);
        declareFunction(me, "kb_create_deduction_int", "KB-CREATE-DEDUCTION-INT", 6, 2, false);
        declareFunction(me, "kb_create_deduction_cyc", "KB-CREATE-DEDUCTION-CYC", 1, 0, false);
        declareFunction(me, "kb_manifest_deduction", "KB-MANIFEST-DEDUCTION", 6, 2, false);
        declareFunction(me, "add_deduction_dependents", "ADD-DEDUCTION-DEPENDENTS", 1, 0, false);
        declareFunction(me, "kb_remove_deduction_internal", "KB-REMOVE-DEDUCTION-INTERNAL", 1, 0, false);
        declareFunction(me, "remove_deduction_dependents", "REMOVE-DEDUCTION-DEPENDENTS", 1, 0, false);
        declareFunction(me, "reset_deduction_tv", "RESET-DEDUCTION-TV", 2, 0, false);
        declareFunction(me, "kb_set_deduction_strength_internal", "KB-SET-DEDUCTION-STRENGTH-INTERNAL", 2, 0, false);
        declareFunction(me, "reset_deduction_supports", "RESET-DEDUCTION-SUPPORTS", 2, 0, false);
        declareFunction(me, "reset_deduction_bindings", "RESET-DEDUCTION-BINDINGS", 2, 0, false);
        declareFunction(me, "reset_deduction_pragmatic_support_mts", "RESET-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 2, 0, false);
        declareFunction(me, "find_deduction_internal", "FIND-DEDUCTION-INTERNAL", 3, 0, false);
        declareFunction(me, "deduction_matches_specification", "DEDUCTION-MATCHES-SPECIFICATION", 3, 1, false);
        declareFunction(me, "deduction_supported_object_internal", "DEDUCTION-SUPPORTED-OBJECT-INTERNAL", 1, 0, false);
        declareFunction(me, "deduction_tv", "DEDUCTION-TV", 1, 0, false);
        declareFunction(me, "deduction_supports_internal", "DEDUCTION-SUPPORTS-INTERNAL", 1, 0, false);
        declareFunction(me, "deduction_truth_internal", "DEDUCTION-TRUTH-INTERNAL", 1, 0, false);
        declareFunction(me, "deduction_strength_internal", "DEDUCTION-STRENGTH-INTERNAL", 1, 0, false);
        declareFunction(me, "deduction_bindings_internal", "DEDUCTION-BINDINGS-INTERNAL", 1, 0, false);
        declareFunction(me, "deduction_pragmatic_support_mts_internal", "DEDUCTION-PRAGMATIC-SUPPORT-MTS-INTERNAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_deductions_low_file() {
        defconstant("*DTP-DEDUCTION-CONTENT*", DEDUCTION_CONTENT);
        defparameter("*BUG-34058-BACKWARD-COMPATIBILITY-DEDUCTION-DUMP-SUPPORT-ENABLED?*", NIL);
        return NIL;
    }

    public static SubLObject setup_deductions_low_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_deduction_content$.getGlobalValue(), symbol_function(DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(D_CONTENT_TV, _CSETF_D_CONTENT_TV);
        def_csetf(D_CONTENT_SUPPORTED_OBJECT, _CSETF_D_CONTENT_SUPPORTED_OBJECT);
        def_csetf(D_CONTENT_SUPPORTS, _CSETF_D_CONTENT_SUPPORTS);
        def_csetf(D_CONTENT_BINDINGS, _CSETF_D_CONTENT_BINDINGS);
        def_csetf(D_CONTENT_PRAGMATIC_SUPPORT_MTS, _CSETF_D_CONTENT_PRAGMATIC_SUPPORT_MTS);
        identity(DEDUCTION_CONTENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_deduction_content$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DEDUCTION_CONTENT_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_deductions_low_file();
    }

    @Override
    public void initializeVariables() {
        init_deductions_low_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_deductions_low_file();
    }

    

    public static final class $deduction_content_native extends SubLStructNative {
        public SubLObject $tv;

        public SubLObject $supported_object;

        public SubLObject $supports;

        public SubLObject $bindings;

        public SubLObject $pragmatic_support_mts;

        private static final SubLStructDeclNative structDecl;

        private $deduction_content_native() {
            this.$tv = Lisp.NIL;
            this.$supported_object = Lisp.NIL;
            this.$supports = Lisp.NIL;
            this.$bindings = Lisp.NIL;
            this.$pragmatic_support_mts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$tv;
        }

        @Override
        public SubLObject getField3() {
            return this.$supported_object;
        }

        @Override
        public SubLObject getField4() {
            return this.$supports;
        }

        @Override
        public SubLObject getField5() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField6() {
            return this.$pragmatic_support_mts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$tv = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$supported_object = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$pragmatic_support_mts = value;
        }

        static {
            structDecl = makeStructDeclNative($deduction_content_native.class, DEDUCTION_CONTENT, DEDUCTION_CONTENT_P, $list3, $list4, new String[]{ "$tv", "$supported_object", "$supports", "$bindings", "$pragmatic_support_mts" }, $list5, $list6, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $deduction_content_p$UnaryFunction extends UnaryFunction {
        public $deduction_content_p$UnaryFunction() {
            super(extractFunctionNamed("DEDUCTION-CONTENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return deduction_content_p(arg1);
        }
    }
}

/**
 * Total time: 175 ms
 */
