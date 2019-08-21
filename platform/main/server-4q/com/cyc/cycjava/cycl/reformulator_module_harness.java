package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.reformulator_module_harness;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.reformulator_module_harness.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.reformulator_module_harness.*; 
 public final class reformulator_module_harness extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_harness();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_harness";

    public static final String myFingerPrint = "21b3acfa90587f0a84528e320ee923de3d51d1c54ce57cbb1c334bd82ee3e0d6";

    // defconstant
    public static final SubLSymbol $dtp_rl_module$ = makeSymbol("*DTP-RL-MODULE*");



    // Internal Constants
    public static final SubLSymbol RL_MODULE = makeSymbol("RL-MODULE");

    public static final SubLSymbol RL_MODULE_P = makeSymbol("RL-MODULE-P");

    public static final SubLList $list2 = list(makeSymbol("NAME"), makeSymbol("REQUIRED"), makeSymbol("COST"), makeSymbol("REFORMULATE"), makeSymbol("DOCUMENTATION"), makeSymbol("EXAMPLE-SOURCE"), makeSymbol("EXAMPLE-TARGET"), makeSymbol("PLIST"));

    public static final SubLList $list3 = list(makeKeyword("NAME"), makeKeyword("REQUIRED"), makeKeyword("COST"), makeKeyword("REFORMULATE"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE-SOURCE"), makeKeyword("EXAMPLE-TARGET"), makeKeyword("PLIST"));

    public static final SubLList $list4 = list(makeSymbol("RLM-NAME"), makeSymbol("RLM-REQUIRED"), makeSymbol("RLM-COST"), makeSymbol("RLM-REFORMULATE"), makeSymbol("RLM-DOCUMENTATION"), makeSymbol("RLM-EXAMPLE-SOURCE"), makeSymbol("RLM-EXAMPLE-TARGET"), makeSymbol("RLM-PLIST"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RLM-NAME"), makeSymbol("_CSETF-RLM-REQUIRED"), makeSymbol("_CSETF-RLM-COST"), makeSymbol("_CSETF-RLM-REFORMULATE"), makeSymbol("_CSETF-RLM-DOCUMENTATION"), makeSymbol("_CSETF-RLM-EXAMPLE-SOURCE"), makeSymbol("_CSETF-RLM-EXAMPLE-TARGET"), makeSymbol("_CSETF-RLM-PLIST"));

    public static final SubLSymbol PRINT_RL_MODULE = makeSymbol("PRINT-RL-MODULE");

    public static final SubLSymbol RL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RL-MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RL-MODULE-P"));

    private static final SubLSymbol RLM_NAME = makeSymbol("RLM-NAME");

    private static final SubLSymbol _CSETF_RLM_NAME = makeSymbol("_CSETF-RLM-NAME");

    private static final SubLSymbol RLM_REQUIRED = makeSymbol("RLM-REQUIRED");

    private static final SubLSymbol _CSETF_RLM_REQUIRED = makeSymbol("_CSETF-RLM-REQUIRED");

    private static final SubLSymbol RLM_COST = makeSymbol("RLM-COST");

    private static final SubLSymbol _CSETF_RLM_COST = makeSymbol("_CSETF-RLM-COST");

    private static final SubLSymbol RLM_REFORMULATE = makeSymbol("RLM-REFORMULATE");

    private static final SubLSymbol _CSETF_RLM_REFORMULATE = makeSymbol("_CSETF-RLM-REFORMULATE");

    private static final SubLSymbol RLM_DOCUMENTATION = makeSymbol("RLM-DOCUMENTATION");

    private static final SubLSymbol _CSETF_RLM_DOCUMENTATION = makeSymbol("_CSETF-RLM-DOCUMENTATION");

    private static final SubLSymbol RLM_EXAMPLE_SOURCE = makeSymbol("RLM-EXAMPLE-SOURCE");

    private static final SubLSymbol _CSETF_RLM_EXAMPLE_SOURCE = makeSymbol("_CSETF-RLM-EXAMPLE-SOURCE");

    private static final SubLSymbol RLM_EXAMPLE_TARGET = makeSymbol("RLM-EXAMPLE-TARGET");

    private static final SubLSymbol _CSETF_RLM_EXAMPLE_TARGET = makeSymbol("_CSETF-RLM-EXAMPLE-TARGET");

    private static final SubLSymbol RLM_PLIST = makeSymbol("RLM-PLIST");

    private static final SubLSymbol _CSETF_RLM_PLIST = makeSymbol("_CSETF-RLM-PLIST");

















    private static final SubLString $str33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RL_MODULE = makeSymbol("MAKE-RL-MODULE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD");

    private static final SubLString $str39$__RL_Module__Name__________S__ = makeString("#<RL-Module: Name:        ~S~%");

    private static final SubLString $str40$_____________Required______S__ = makeString("             Required:    ~S~%");

    private static final SubLString $str41$_____________Cost__________S__ = makeString("             Cost:        ~S~%");

    private static final SubLString $str42$_____________Reformulate___S___ = makeString("             Reformulate: ~S>~%");

    private static final SubLString $str43$__Documentation___A = makeString("~%Documentation: ~A");

    private static final SubLString $str44$____Input_____S = makeString("~%~%Input: ~%~S");

    private static final SubLString $str45$_____ = makeString("~%==>");

    private static final SubLString $str46$____Desired_output_____S = makeString("~%~%Desired output: ~%~S");

    private static final SubLString $str47$__Missing__required_info__Abortin = makeString("~%Missing :required info. Aborting");

    private static final SubLString $str48$__Missing__cost_info__Aborting = makeString("~%Missing :cost info. Aborting");

    private static final SubLString $str49$__Missing__reformulate_info__Abor = makeString("~%Missing :reformulate info. Aborting");

    private static final SubLString $str50$__Missing__documentation_info__Ba = makeString("~%Missing :documentation info. Bad programmer!");

    private static final SubLString $str51$__Missing__example_source_info__B = makeString("~%Missing :example-source info. Bad programmer!");

    private static final SubLString $str52$__Missing__example_target_info__B = makeString("~%Missing :example-target info. Bad programmer!");

    private static final SubLList $list53 = list(list(makeSymbol("MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list55 = list(makeSymbol("MOD"), list(makeSymbol("RL-MODULE-STORE")));



    private static final SubLList $list57 = list(makeSymbol("MOD"));

    private static final SubLList $list58 = list(list(makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list61 = list(makeSymbol("RL-MODULE-STORE"));

    private static final SubLSymbol $rl_module_store$ = makeSymbol("*RL-MODULE-STORE*");

    private static final SubLSymbol RL_MODULE_NAME = makeSymbol("RL-MODULE-NAME");

    private static final SubLString $str64$RL_module_store_corrupt__clearing = makeString("RL module store corrupt; clearing...");

    private static final SubLString $str65$RL_module__S_already_exists_in_th = makeString("RL module ~S already exists in the store; replacing.");

    private static final SubLString $str66$__No_module_named__S_found_in_the = makeString("~%No module named ~S found in the store; could not remove.");

    public static SubLObject rl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rl_module_p(final SubLObject v_object) {
        return v_object.getClass() == $rl_module_native.class ? T : NIL;
    }

    public static SubLObject rlm_name(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rlm_required(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rlm_cost(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rlm_reformulate(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rlm_documentation(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rlm_example_source(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rlm_example_target(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rlm_plist(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_rlm_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rlm_required(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rlm_cost(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rlm_reformulate(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rlm_documentation(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rlm_example_source(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rlm_example_target(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rlm_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_rl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_rlm_name(v_new, current_value);
            } else
                if (pcase_var.eql($REQUIRED)) {
                    _csetf_rlm_required(v_new, current_value);
                } else
                    if (pcase_var.eql($COST)) {
                        _csetf_rlm_cost(v_new, current_value);
                    } else
                        if (pcase_var.eql($REFORMULATE)) {
                            _csetf_rlm_reformulate(v_new, current_value);
                        } else
                            if (pcase_var.eql($DOCUMENTATION)) {
                                _csetf_rlm_documentation(v_new, current_value);
                            } else
                                if (pcase_var.eql($EXAMPLE_SOURCE)) {
                                    _csetf_rlm_example_source(v_new, current_value);
                                } else
                                    if (pcase_var.eql($EXAMPLE_TARGET)) {
                                        _csetf_rlm_example_target(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PLIST)) {
                                            _csetf_rlm_plist(v_new, current_value);
                                        } else {
                                            Errors.error($str33$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rl_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RL_MODULE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, rlm_name(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED, rlm_required(obj));
        funcall(visitor_fn, obj, $SLOT, $COST, rlm_cost(obj));
        funcall(visitor_fn, obj, $SLOT, $REFORMULATE, rlm_reformulate(obj));
        funcall(visitor_fn, obj, $SLOT, $DOCUMENTATION, rlm_documentation(obj));
        funcall(visitor_fn, obj, $SLOT, $EXAMPLE_SOURCE, rlm_example_source(obj));
        funcall(visitor_fn, obj, $SLOT, $EXAMPLE_TARGET, rlm_example_target(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, rlm_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_RL_MODULE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rl_module(obj, visitor_fn);
    }

    public static SubLObject print_rl_module(final SubLObject rl_module, final SubLObject stream, final SubLObject depth) {
        format(stream, $str39$__RL_Module__Name__________S__, rl_module_name(rl_module));
        format(stream, $str40$_____________Required______S__, rl_module_required_function(rl_module));
        format(stream, $str41$_____________Cost__________S__, rl_module_cost_function(rl_module));
        format(stream, $str42$_____________Reformulate___S___, rl_module_reformulate_function(rl_module));
        return rl_module;
    }

    public static SubLObject print_rl_module_documentation(final SubLObject rl_module, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            format(stream, $str43$__Documentation___A, rl_module_documentation(rl_module));
            format(stream, $str44$____Input_____S, rl_module_example_source(rl_module));
            format(stream, $str45$_____);
            format(stream, $str46$____Desired_output_____S, rl_module_example_target(rl_module));
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject new_rl_module(final SubLObject module_keyword, final SubLObject plist) {
        final SubLObject rl_module = make_rl_module(UNPROVIDED);
        final SubLObject required_function = getf(plist, $REQUIRED, UNPROVIDED);
        final SubLObject cost_function = getf(plist, $COST, UNPROVIDED);
        final SubLObject reformulate_function = getf(plist, $REFORMULATE, UNPROVIDED);
        final SubLObject documentation = getf(plist, $DOCUMENTATION, UNPROVIDED);
        final SubLObject example_source = getf(plist, $EXAMPLE_SOURCE, UNPROVIDED);
        final SubLObject example_target = getf(plist, $EXAMPLE_TARGET, UNPROVIDED);
        if (NIL == required_function) {
            reformulator_hub.ref_warn(ZERO_INTEGER, $str47$__Missing__required_info__Abortin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        _csetf_rlm_required(rl_module, required_function);
        if (NIL == cost_function) {
            reformulator_hub.ref_warn(ZERO_INTEGER, $str48$__Missing__cost_info__Aborting, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        _csetf_rlm_cost(rl_module, cost_function);
        if (NIL == reformulate_function) {
            reformulator_hub.ref_warn(ZERO_INTEGER, $str49$__Missing__reformulate_info__Abor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        _csetf_rlm_reformulate(rl_module, reformulate_function);
        _csetf_rlm_name(rl_module, module_keyword);
        if (NIL == documentation) {
            reformulator_hub.ref_warn(TWO_INTEGER, $str50$__Missing__documentation_info__Ba, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        _csetf_rlm_documentation(rl_module, documentation);
        if (NIL == example_source) {
            reformulator_hub.ref_warn(TWO_INTEGER, $str51$__Missing__example_source_info__B, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        _csetf_rlm_example_source(rl_module, example_source);
        if (NIL == example_target) {
            reformulator_hub.ref_warn(TWO_INTEGER, $str52$__Missing__example_target_info__B, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        _csetf_rlm_example_target(rl_module, example_target);
        return rl_module;
    }

    public static SubLObject rl_module_name(final SubLObject rl_module) {
        return rlm_name(rl_module);
    }

    public static SubLObject rl_module_required_function(final SubLObject rl_module) {
        return rlm_required(rl_module);
    }

    public static SubLObject rl_module_cost_function(final SubLObject rl_module) {
        return rlm_cost(rl_module);
    }

    public static SubLObject rl_module_reformulate_function(final SubLObject rl_module) {
        return rlm_reformulate(rl_module);
    }

    public static SubLObject rl_module_documentation(final SubLObject rl_module) {
        return rlm_documentation(rl_module);
    }

    public static SubLObject rl_module_example_source(final SubLObject rl_module) {
        return rlm_example_source(rl_module);
    }

    public static SubLObject rl_module_example_target(final SubLObject rl_module) {
        return rlm_example_target(rl_module);
    }

    public static SubLObject rl_module_plist(final SubLObject rl_module) {
        return rlm_plist(rl_module);
    }

    public static SubLObject valid_rl_moduleP(final SubLObject v_object) {
        return makeBoolean(((((NIL != rl_module_p(v_object)) && (NIL != constant_p(rl_module_name(v_object)))) && rl_module_required_function(v_object).isFunctionSpec()) && rl_module_cost_function(v_object).isFunctionSpec()) && rl_module_reformulate_function(v_object).isFunctionSpec());
    }

    public static SubLObject do_rl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CDOLIST, $list55, listS(CLET, list(bq_cons(module, $list57)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list53);
        return NIL;
    }

    public static SubLObject some_rl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list58);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CSOME, list(MOD, $list61, done_var), listS(CLET, list(bq_cons(module, $list57)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static SubLObject declare_rl_module(final SubLObject module_constant, final SubLObject plist) {
        clear_rl_module_store_if_corrupt();
        final SubLObject module = new_rl_module(module_constant, plist);
        add_rl_module_to_store(module);
        return module;
    }

    public static SubLObject rl_module_store() {
        return $rl_module_store$.getGlobalValue();
    }

    public static SubLObject rl_module_names() {
        return Mapping.mapcar(RL_MODULE_NAME, rl_module_store());
    }

    public static SubLObject rl_module_store_size() {
        return length($rl_module_store$.getGlobalValue());
    }

    public static SubLObject clear_rl_module_store() {
        $rl_module_store$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject clear_rl_module_store_if_corrupt() {
        SubLObject cdolist_list_var = rl_module_store();
        SubLObject mod = NIL;
        mod = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rl_module = mod;
            if (NIL == valid_rl_moduleP(rl_module)) {
                reformulator_hub.ref_warn(ZERO_INTEGER, $str64$RL_module_store_corrupt__clearing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                clear_rl_module_store();
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            mod = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject get_rl_module_from_store(final SubLObject constant) {
        SubLObject module_found = NIL;
        if (NIL == module_found) {
            SubLObject csome_list_var = rl_module_store();
            SubLObject mod = NIL;
            mod = csome_list_var.first();
            while ((NIL == module_found) && (NIL != csome_list_var)) {
                final SubLObject rl_module = mod;
                if (constant.eql(rl_module_name(rl_module))) {
                    module_found = rl_module;
                }
                csome_list_var = csome_list_var.rest();
                mod = csome_list_var.first();
            } 
        }
        return module_found;
    }

    public static SubLObject add_rl_module_to_store(final SubLObject rl_module) {
        final SubLObject constant = rl_module_name(rl_module);
        if (NIL != get_rl_module_from_store(constant)) {
            reformulator_hub.ref_warn(FIVE_INTEGER, $str65$RL_module__S_already_exists_in_th, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            remove_rl_module_from_store(constant);
        }
        $rl_module_store$.setGlobalValue(cons(rl_module, $rl_module_store$.getGlobalValue()));
        return T;
    }

    public static SubLObject remove_rl_module_from_store(final SubLObject constant) {
        SubLObject others = NIL;
        SubLObject cdolist_list_var = rl_module_store();
        SubLObject mod = NIL;
        mod = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module = mod;
            if (!constant.eql(rl_module_name(module))) {
                others = cons(module, others);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mod = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.same_length_p(rl_module_store(), others)) {
            reformulator_hub.ref_warn(TWO_INTEGER, $str66$__No_module_named__S_found_in_the, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        $rl_module_store$.setGlobalValue(nreverse(others));
        return T;
    }

    public static SubLObject rl_module_applicableP(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return funcall(rl_module_required_function(rl_module), expression, mt, settings);
    }

    public static SubLObject rl_module_cost(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return funcall(rl_module_cost_function(rl_module), expression, mt, settings);
    }

    public static SubLObject rl_module_reformulate(final SubLObject rl_module, final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        return funcall(rl_module_reformulate_function(rl_module), expression, original_clause, mt, settings);
    }

    public static SubLObject declare_reformulator_module_harness_file() {
        declareFunction(me, "rl_module_print_function_trampoline", "RL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rl_module_p", "RL-MODULE-P", 1, 0, false);
        new reformulator_module_harness.$rl_module_p$UnaryFunction();
        declareFunction(me, "rlm_name", "RLM-NAME", 1, 0, false);
        declareFunction(me, "rlm_required", "RLM-REQUIRED", 1, 0, false);
        declareFunction(me, "rlm_cost", "RLM-COST", 1, 0, false);
        declareFunction(me, "rlm_reformulate", "RLM-REFORMULATE", 1, 0, false);
        declareFunction(me, "rlm_documentation", "RLM-DOCUMENTATION", 1, 0, false);
        declareFunction(me, "rlm_example_source", "RLM-EXAMPLE-SOURCE", 1, 0, false);
        declareFunction(me, "rlm_example_target", "RLM-EXAMPLE-TARGET", 1, 0, false);
        declareFunction(me, "rlm_plist", "RLM-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_rlm_name", "_CSETF-RLM-NAME", 2, 0, false);
        declareFunction(me, "_csetf_rlm_required", "_CSETF-RLM-REQUIRED", 2, 0, false);
        declareFunction(me, "_csetf_rlm_cost", "_CSETF-RLM-COST", 2, 0, false);
        declareFunction(me, "_csetf_rlm_reformulate", "_CSETF-RLM-REFORMULATE", 2, 0, false);
        declareFunction(me, "_csetf_rlm_documentation", "_CSETF-RLM-DOCUMENTATION", 2, 0, false);
        declareFunction(me, "_csetf_rlm_example_source", "_CSETF-RLM-EXAMPLE-SOURCE", 2, 0, false);
        declareFunction(me, "_csetf_rlm_example_target", "_CSETF-RLM-EXAMPLE-TARGET", 2, 0, false);
        declareFunction(me, "_csetf_rlm_plist", "_CSETF-RLM-PLIST", 2, 0, false);
        declareFunction(me, "make_rl_module", "MAKE-RL-MODULE", 0, 1, false);
        declareFunction(me, "visit_defstruct_rl_module", "VISIT-DEFSTRUCT-RL-MODULE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rl_module_method", "VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD", 2, 0, false);
        declareFunction(me, "print_rl_module", "PRINT-RL-MODULE", 3, 0, false);
        declareFunction(me, "print_rl_module_documentation", "PRINT-RL-MODULE-DOCUMENTATION", 1, 1, false);
        declareFunction(me, "new_rl_module", "NEW-RL-MODULE", 2, 0, false);
        declareFunction(me, "rl_module_name", "RL-MODULE-NAME", 1, 0, false);
        declareFunction(me, "rl_module_required_function", "RL-MODULE-REQUIRED-FUNCTION", 1, 0, false);
        declareFunction(me, "rl_module_cost_function", "RL-MODULE-COST-FUNCTION", 1, 0, false);
        declareFunction(me, "rl_module_reformulate_function", "RL-MODULE-REFORMULATE-FUNCTION", 1, 0, false);
        declareFunction(me, "rl_module_documentation", "RL-MODULE-DOCUMENTATION", 1, 0, false);
        declareFunction(me, "rl_module_example_source", "RL-MODULE-EXAMPLE-SOURCE", 1, 0, false);
        declareFunction(me, "rl_module_example_target", "RL-MODULE-EXAMPLE-TARGET", 1, 0, false);
        declareFunction(me, "rl_module_plist", "RL-MODULE-PLIST", 1, 0, false);
        declareFunction(me, "valid_rl_moduleP", "VALID-RL-MODULE?", 1, 0, false);
        declareMacro(me, "do_rl_modules", "DO-RL-MODULES");
        declareMacro(me, "some_rl_modules", "SOME-RL-MODULES");
        declareFunction(me, "declare_rl_module", "DECLARE-RL-MODULE", 2, 0, false);
        declareFunction(me, "rl_module_store", "RL-MODULE-STORE", 0, 0, false);
        declareFunction(me, "rl_module_names", "RL-MODULE-NAMES", 0, 0, false);
        declareFunction(me, "rl_module_store_size", "RL-MODULE-STORE-SIZE", 0, 0, false);
        declareFunction(me, "clear_rl_module_store", "CLEAR-RL-MODULE-STORE", 0, 0, false);
        declareFunction(me, "clear_rl_module_store_if_corrupt", "CLEAR-RL-MODULE-STORE-IF-CORRUPT", 0, 0, false);
        declareFunction(me, "get_rl_module_from_store", "GET-RL-MODULE-FROM-STORE", 1, 0, false);
        declareFunction(me, "add_rl_module_to_store", "ADD-RL-MODULE-TO-STORE", 1, 0, false);
        declareFunction(me, "remove_rl_module_from_store", "REMOVE-RL-MODULE-FROM-STORE", 1, 0, false);
        declareFunction(me, "rl_module_applicableP", "RL-MODULE-APPLICABLE?", 4, 0, false);
        declareFunction(me, "rl_module_cost", "RL-MODULE-COST", 4, 0, false);
        declareFunction(me, "rl_module_reformulate", "RL-MODULE-REFORMULATE", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_harness_file() {
        defconstant("*DTP-RL-MODULE*", RL_MODULE);
        deflexical("*RL-MODULE-STORE*", SubLTrampolineFile.maybeDefault($rl_module_store$, $rl_module_store$, NIL));
        return NIL;
    }

    public static SubLObject setup_reformulator_module_harness_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rl_module$.getGlobalValue(), symbol_function(RL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RLM_NAME, _CSETF_RLM_NAME);
        def_csetf(RLM_REQUIRED, _CSETF_RLM_REQUIRED);
        def_csetf(RLM_COST, _CSETF_RLM_COST);
        def_csetf(RLM_REFORMULATE, _CSETF_RLM_REFORMULATE);
        def_csetf(RLM_DOCUMENTATION, _CSETF_RLM_DOCUMENTATION);
        def_csetf(RLM_EXAMPLE_SOURCE, _CSETF_RLM_EXAMPLE_SOURCE);
        def_csetf(RLM_EXAMPLE_TARGET, _CSETF_RLM_EXAMPLE_TARGET);
        def_csetf(RLM_PLIST, _CSETF_RLM_PLIST);
        identity(RL_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rl_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD));
        declare_defglobal($rl_module_store$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_harness_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_harness_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_harness_file();
    }

    static {






































































    }

    public static final class $rl_module_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $required;

        public SubLObject $cost;

        public SubLObject $reformulate;

        public SubLObject $documentation;

        public SubLObject $example_source;

        public SubLObject $example_target;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        private $rl_module_native() {
            this.$name = Lisp.NIL;
            this.$required = Lisp.NIL;
            this.$cost = Lisp.NIL;
            this.$reformulate = Lisp.NIL;
            this.$documentation = Lisp.NIL;
            this.$example_source = Lisp.NIL;
            this.$example_target = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$required;
        }

        @Override
        public SubLObject getField4() {
            return this.$cost;
        }

        @Override
        public SubLObject getField5() {
            return this.$reformulate;
        }

        @Override
        public SubLObject getField6() {
            return this.$documentation;
        }

        @Override
        public SubLObject getField7() {
            return this.$example_source;
        }

        @Override
        public SubLObject getField8() {
            return this.$example_target;
        }

        @Override
        public SubLObject getField9() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$required = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$cost = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$reformulate = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$documentation = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$example_source = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$example_target = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative($rl_module_native.class, RL_MODULE, RL_MODULE_P, $list2, $list3, new String[]{ "$name", "$required", "$cost", "$reformulate", "$documentation", "$example_source", "$example_target", "$plist" }, $list4, $list5, PRINT_RL_MODULE);
        }
    }

    public static final class $rl_module_p$UnaryFunction extends UnaryFunction {
        public $rl_module_p$UnaryFunction() {
            super(extractFunctionNamed("RL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rl_module_p(arg1);
        }
    }
}

/**
 * Total time: 126 ms
 */
