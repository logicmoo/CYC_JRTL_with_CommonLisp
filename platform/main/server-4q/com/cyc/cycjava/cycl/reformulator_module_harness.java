/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-MODULE-HARNESS
 * source file: /cyc/top/cycl/reformulator-module-harness.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_module_harness extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_module_harness();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_harness";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rl_module$ = makeSymbol("*DTP-RL-MODULE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RL_MODULE = makeSymbol("RL-MODULE");

    private static final SubLSymbol RL_MODULE_P = makeSymbol("RL-MODULE-P");

    static private final SubLList $list2 = list(makeSymbol("NAME"), makeSymbol("REQUIRED"), makeSymbol("COST"), makeSymbol("REFORMULATE"), makeSymbol("DOCUMENTATION"), makeSymbol("EXAMPLE-SOURCE"), makeSymbol("EXAMPLE-TARGET"), makeSymbol("PLIST"));

    static private final SubLList $list3 = list($NAME, makeKeyword("REQUIRED"), $COST, makeKeyword("REFORMULATE"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE-SOURCE"), makeKeyword("EXAMPLE-TARGET"), makeKeyword("PLIST"));

    static private final SubLList $list4 = list(makeSymbol("RLM-NAME"), makeSymbol("RLM-REQUIRED"), makeSymbol("RLM-COST"), makeSymbol("RLM-REFORMULATE"), makeSymbol("RLM-DOCUMENTATION"), makeSymbol("RLM-EXAMPLE-SOURCE"), makeSymbol("RLM-EXAMPLE-TARGET"), makeSymbol("RLM-PLIST"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-RLM-NAME"), makeSymbol("_CSETF-RLM-REQUIRED"), makeSymbol("_CSETF-RLM-COST"), makeSymbol("_CSETF-RLM-REFORMULATE"), makeSymbol("_CSETF-RLM-DOCUMENTATION"), makeSymbol("_CSETF-RLM-EXAMPLE-SOURCE"), makeSymbol("_CSETF-RLM-EXAMPLE-TARGET"), makeSymbol("_CSETF-RLM-PLIST"));

    private static final SubLSymbol PRINT_RL_MODULE = makeSymbol("PRINT-RL-MODULE");

    private static final SubLSymbol RL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RL-MODULE-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list55 = list(makeSymbol("MOD"), list(makeSymbol("RL-MODULE-STORE")));

    private static final SubLList $list57 = list(makeSymbol("MOD"));

    private static final SubLList $list58 = list(list(makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list61 = list(makeSymbol("RL-MODULE-STORE"));

    private static final SubLSymbol $rl_module_store$ = makeSymbol("*RL-MODULE-STORE*");

    private static final SubLSymbol RL_MODULE_NAME = makeSymbol("RL-MODULE-NAME");

    private static final SubLString $str64$RL_module_store_corrupt__clearing = makeString("RL module store corrupt; clearing...");

    private static final SubLString $str65$RL_module__S_already_exists_in_th = makeString("RL module ~S already exists in the store; replacing.");

    private static final SubLString $str66$__No_module_named__S_found_in_the = makeString("~%No module named ~S found in the store; could not remove.");

    public static final SubLObject rl_module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_rl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rl_module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.reformulator_module_harness.$rl_module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rl_module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.reformulator_module_harness.$rl_module_native.class ? T : NIL;
    }

    public static final SubLObject rlm_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject rlm_name(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rlm_required_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject rlm_required(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rlm_cost_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField4();
    }

    public static SubLObject rlm_cost(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rlm_reformulate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField5();
    }

    public static SubLObject rlm_reformulate(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rlm_documentation_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField6();
    }

    public static SubLObject rlm_documentation(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rlm_example_source_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField7();
    }

    public static SubLObject rlm_example_source(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rlm_example_target_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField8();
    }

    public static SubLObject rlm_example_target(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject rlm_plist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.getField9();
    }

    public static SubLObject rlm_plist(final SubLObject v_object) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_rlm_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rlm_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rlm_required_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rlm_required(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rlm_cost_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rlm_cost(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rlm_reformulate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rlm_reformulate(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rlm_documentation_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rlm_documentation(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rlm_example_source_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rlm_example_source(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rlm_example_target_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rlm_example_target(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_rlm_plist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_MODULE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rlm_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_module_p(v_object) : "! reformulator_module_harness.rl_module_p(v_object) " + "reformulator_module_harness.rl_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_rl_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.reformulator_module_harness.$rl_module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_rlm_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($REQUIRED)) {
                            _csetf_rlm_required(v_new, current_value);
                        } else {
                            if (pcase_var.eql($COST)) {
                                _csetf_rlm_cost(v_new, current_value);
                            } else {
                                if (pcase_var.eql($REFORMULATE)) {
                                    _csetf_rlm_reformulate(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DOCUMENTATION)) {
                                        _csetf_rlm_documentation(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($EXAMPLE_SOURCE)) {
                                            _csetf_rlm_example_source(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($EXAMPLE_TARGET)) {
                                                _csetf_rlm_example_target(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PLIST)) {
                                                    _csetf_rlm_plist(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt32$Invalid_slot__S_for_construction_, current_arg);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.reformulator_module_harness.$rl_module_native();
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

    public static final SubLObject print_rl_module_alt(SubLObject rl_module, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt33$__RL_Module__Name__________S__, rl_module_name(rl_module));
        format(stream, $str_alt34$_____________Required______S__, rl_module_required_function(rl_module));
        format(stream, $str_alt35$_____________Cost__________S__, rl_module_cost_function(rl_module));
        format(stream, $str_alt36$_____________Reformulate___S___, rl_module_reformulate_function(rl_module));
        return rl_module;
    }

    public static SubLObject print_rl_module(final SubLObject rl_module, final SubLObject stream, final SubLObject depth) {
        format(stream, $str39$__RL_Module__Name__________S__, rl_module_name(rl_module));
        format(stream, $str40$_____________Required______S__, rl_module_required_function(rl_module));
        format(stream, $str41$_____________Cost__________S__, rl_module_cost_function(rl_module));
        format(stream, $str42$_____________Reformulate___S___, rl_module_reformulate_function(rl_module));
        return rl_module;
    }

    public static final SubLObject print_rl_module_documentation_alt(SubLObject rl_module, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    format(stream, $str_alt37$__Documentation___A, rl_module_documentation(rl_module));
                    format(stream, $str_alt38$____Input_____S, rl_module_example_source(rl_module));
                    format(stream, $str_alt39$_____);
                    format(stream, $str_alt40$____Desired_output_____S, rl_module_example_target(rl_module));
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
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

    /**
     *
     *
     * @param module-keyword;
    KEYWORD
     * 		
     * @param plist;
    PLIST
     * 		
     * @return RL-MODULE/NIL
    Builds a RL-MODULE structure from a MODULE-KEYWORD and a PLIST,
    aborting -- with warning and return value NIL -- if the PLIST does
    not contain all the appropriate information and printing warnings if
    the PLIST does not contain complete documentation for the RL-MODULE.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param module-keyword;\nKEYWORD\r\n\t\t\r\n@param plist;\nPLIST\r\n\t\t\r\n@return RL-MODULE/NIL\r\nBuilds a RL-MODULE structure from a MODULE-KEYWORD and a PLIST,\r\naborting -- with warning and return value NIL -- if the PLIST does\r\nnot contain all the appropriate information and printing warnings if\r\nthe PLIST does not contain complete documentation for the RL-MODULE.\r\n@unknown bertolo")
    public static final SubLObject new_rl_module_alt(SubLObject module_keyword, SubLObject plist) {
        {
            SubLObject rl_module = make_rl_module(UNPROVIDED);
            SubLObject required_function = getf(plist, $REQUIRED, UNPROVIDED);
            SubLObject cost_function = getf(plist, $COST, UNPROVIDED);
            SubLObject reformulate_function = getf(plist, $REFORMULATE, UNPROVIDED);
            SubLObject documentation = getf(plist, $DOCUMENTATION, UNPROVIDED);
            SubLObject example_source = getf(plist, $EXAMPLE_SOURCE, UNPROVIDED);
            SubLObject example_target = getf(plist, $EXAMPLE_TARGET, UNPROVIDED);
            if (NIL == required_function) {
                reformulator_hub.ref_warn(ZERO_INTEGER, $str_alt41$__Missing__required_info__Abortin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            _csetf_rlm_required(rl_module, required_function);
            if (NIL == cost_function) {
                reformulator_hub.ref_warn(ZERO_INTEGER, $str_alt42$__Missing__cost_info__Aborting, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            _csetf_rlm_cost(rl_module, cost_function);
            if (NIL == reformulate_function) {
                reformulator_hub.ref_warn(ZERO_INTEGER, $str_alt43$__Missing__reformulate_info__Abor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            _csetf_rlm_reformulate(rl_module, reformulate_function);
            _csetf_rlm_name(rl_module, module_keyword);
            if (NIL == documentation) {
                reformulator_hub.ref_warn(TWO_INTEGER, $str_alt44$__Missing__documentation_info__Ba, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            _csetf_rlm_documentation(rl_module, documentation);
            if (NIL == example_source) {
                reformulator_hub.ref_warn(TWO_INTEGER, $str_alt45$__Missing__example_source_info__B, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            _csetf_rlm_example_source(rl_module, example_source);
            if (NIL == example_target) {
                reformulator_hub.ref_warn(TWO_INTEGER, $str_alt46$__Missing__example_target_info__B, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            _csetf_rlm_example_target(rl_module, example_target);
            return rl_module;
        }
    }

    /**
     *
     *
     * @param module-keyword;
    KEYWORD
     * 		
     * @param plist;
    PLIST
     * 		
     * @return RL-MODULE/NIL
    Builds a RL-MODULE structure from a MODULE-KEYWORD and a PLIST,
    aborting -- with warning and return value NIL -- if the PLIST does
    not contain all the appropriate information and printing warnings if
    the PLIST does not contain complete documentation for the RL-MODULE.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param module-keyword;\nKEYWORD\r\n\t\t\r\n@param plist;\nPLIST\r\n\t\t\r\n@return RL-MODULE/NIL\r\nBuilds a RL-MODULE structure from a MODULE-KEYWORD and a PLIST,\r\naborting -- with warning and return value NIL -- if the PLIST does\r\nnot contain all the appropriate information and printing warnings if\r\nthe PLIST does not contain complete documentation for the RL-MODULE.\r\n@unknown bertolo")
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

    public static final SubLObject rl_module_name_alt(SubLObject rl_module) {
        return rlm_name(rl_module);
    }

    public static SubLObject rl_module_name(final SubLObject rl_module) {
        return rlm_name(rl_module);
    }

    public static final SubLObject rl_module_required_function_alt(SubLObject rl_module) {
        return rlm_required(rl_module);
    }

    public static SubLObject rl_module_required_function(final SubLObject rl_module) {
        return rlm_required(rl_module);
    }

    public static final SubLObject rl_module_cost_function_alt(SubLObject rl_module) {
        return rlm_cost(rl_module);
    }

    public static SubLObject rl_module_cost_function(final SubLObject rl_module) {
        return rlm_cost(rl_module);
    }

    public static final SubLObject rl_module_reformulate_function_alt(SubLObject rl_module) {
        return rlm_reformulate(rl_module);
    }

    public static SubLObject rl_module_reformulate_function(final SubLObject rl_module) {
        return rlm_reformulate(rl_module);
    }

    public static final SubLObject rl_module_documentation_alt(SubLObject rl_module) {
        return rlm_documentation(rl_module);
    }

    public static SubLObject rl_module_documentation(final SubLObject rl_module) {
        return rlm_documentation(rl_module);
    }

    public static final SubLObject rl_module_example_source_alt(SubLObject rl_module) {
        return rlm_example_source(rl_module);
    }

    public static SubLObject rl_module_example_source(final SubLObject rl_module) {
        return rlm_example_source(rl_module);
    }

    public static final SubLObject rl_module_example_target_alt(SubLObject rl_module) {
        return rlm_example_target(rl_module);
    }

    public static SubLObject rl_module_example_target(final SubLObject rl_module) {
        return rlm_example_target(rl_module);
    }

    public static final SubLObject rl_module_plist_alt(SubLObject rl_module) {
        return rlm_plist(rl_module);
    }

    public static SubLObject rl_module_plist(final SubLObject rl_module) {
        return rlm_plist(rl_module);
    }

    public static final SubLObject valid_rl_moduleP_alt(SubLObject v_object) {
        return makeBoolean(((((NIL != rl_module_p(v_object)) && (NIL != constant_p(rl_module_name(v_object)))) && rl_module_required_function(v_object).isFunctionSpec()) && rl_module_cost_function(v_object).isFunctionSpec()) && rl_module_reformulate_function(v_object).isFunctionSpec());
    }

    public static SubLObject valid_rl_moduleP(final SubLObject v_object) {
        return makeBoolean(((((NIL != rl_module_p(v_object)) && (NIL != constant_p(rl_module_name(v_object)))) && rl_module_required_function(v_object).isFunctionSpec()) && rl_module_cost_function(v_object).isFunctionSpec()) && rl_module_reformulate_function(v_object).isFunctionSpec());
    }

    /**
     *
     *
     * @param module;
     * 		RL-MODULE
     * 		Execute BODY with MODULE  successively bound to each RL module in *rl-module-store*.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param module;\r\n\t\tRL-MODULE\r\n\t\tExecute BODY with MODULE  successively bound to each RL module in *rl-module-store*.\r\n@unknown bertolo")
    public static final SubLObject do_rl_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    module = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CDOLIST, $list_alt49, listS(CLET, list(bq_cons(module, $list_alt51)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt47);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param module;
     * 		RL-MODULE
     * 		Execute BODY with MODULE  successively bound to each RL module in *rl-module-store*.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param module;\r\n\t\tRL-MODULE\r\n\t\tExecute BODY with MODULE  successively bound to each RL module in *rl-module-store*.\r\n@unknown bertolo")
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

    /**
     *
     *
     * @param module;
     * 		RL-MODULE
     * 		Execute BODY with MODULE  successively bound to each RL module in *rl-module-store*.
     * 		Cease when DONE-VAR becomes non-nil.
     * @unknown zelal
     */
    @LispMethod(comment = "@param module;\r\n\t\tRL-MODULE\r\n\t\tExecute BODY with MODULE  successively bound to each RL module in *rl-module-store*.\r\n\t\tCease when DONE-VAR becomes non-nil.\r\n@unknown zelal")
    public static final SubLObject some_rl_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    module = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt52);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CSOME, list(MOD, $list_alt55, done_var), listS(CLET, list(bq_cons(module, $list_alt51)), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt52);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param module;
     * 		RL-MODULE
     * 		Execute BODY with MODULE  successively bound to each RL module in *rl-module-store*.
     * 		Cease when DONE-VAR becomes non-nil.
     * @unknown zelal
     */
    @LispMethod(comment = "@param module;\r\n\t\tRL-MODULE\r\n\t\tExecute BODY with MODULE  successively bound to each RL module in *rl-module-store*.\r\n\t\tCease when DONE-VAR becomes non-nil.\r\n@unknown zelal")
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

    /**
     *
     *
     * @param module-constant;
    CONSTANT
     * 		
     * @param plist;
    PLIST
     * 		
     * @return RL-MODULE/NIL
    Builds a new RL-MODULE from PLIST and adds it to the store, returning the module itself.
    {{{DOC
    Explanation of fields in PLIST:

    :required must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,
    and is a fast necessary condition check to determine whether the RL module might apply to EXPRESSION, given MT and SETTINGS.
    It must return a boolean.

    :cost must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,
    and is a fast computation of the expected cost (in microseconds) of reformulating EXPRESSION using this RL module, given MT and SETTINGS.
    It must return an integer.

    :reformulate must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,
    and performs the actual reformulation of EXPRESSION, given MT and SETTINGS.
    It may assume that the :required function returned t.
    It must return two values, the reformulated expression (or EXPRESSION unchanged), and a justification, which is nil iff
    EXPRESSION was not modified, t if the justification is 'because I say so', or possibly something more descriptive.

    :documentation must be a string explaining what the RL module does.

    :example-source must be a CycL expression in string form.

    :example-target must be a CycL expression in string form, the result of applying the :reformulate function to the :example-source expression.
    }}}EDOC
     * @unknown bertolo
     */
    @LispMethod(comment = "@param module-constant;\nCONSTANT\r\n\t\t\r\n@param plist;\nPLIST\r\n\t\t\r\n@return RL-MODULE/NIL\r\nBuilds a new RL-MODULE from PLIST and adds it to the store, returning the module itself.\r\n{{{DOC\r\nExplanation of fields in PLIST:\r\n\r\n:required must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,\r\nand is a fast necessary condition check to determine whether the RL module might apply to EXPRESSION, given MT and SETTINGS.\r\nIt must return a boolean.\r\n\r\n:cost must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,\r\nand is a fast computation of the expected cost (in microseconds) of reformulating EXPRESSION using this RL module, given MT and SETTINGS.\r\nIt must return an integer.\r\n\r\n:reformulate must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,\r\nand performs the actual reformulation of EXPRESSION, given MT and SETTINGS.\r\nIt may assume that the :required function returned t.\r\nIt must return two values, the reformulated expression (or EXPRESSION unchanged), and a justification, which is nil iff\r\nEXPRESSION was not modified, t if the justification is \'because I say so\', or possibly something more descriptive.\r\n\r\n:documentation must be a string explaining what the RL module does.\r\n\r\n:example-source must be a CycL expression in string form.\r\n\r\n:example-target must be a CycL expression in string form, the result of applying the :reformulate function to the :example-source expression.\r\n}}}EDOC\r\n@unknown bertolo")
    public static final SubLObject declare_rl_module_alt(SubLObject module_constant, SubLObject plist) {
        clear_rl_module_store_if_corrupt();
        {
            SubLObject module = new_rl_module(module_constant, plist);
            add_rl_module_to_store(module);
            return module;
        }
    }

    /**
     *
     *
     * @param module-constant;
    CONSTANT
     * 		
     * @param plist;
    PLIST
     * 		
     * @return RL-MODULE/NIL
    Builds a new RL-MODULE from PLIST and adds it to the store, returning the module itself.
    {{{DOC
    Explanation of fields in PLIST:

    :required must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,
    and is a fast necessary condition check to determine whether the RL module might apply to EXPRESSION, given MT and SETTINGS.
    It must return a boolean.

    :cost must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,
    and is a fast computation of the expected cost (in microseconds) of reformulating EXPRESSION using this RL module, given MT and SETTINGS.
    It must return an integer.

    :reformulate must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,
    and performs the actual reformulation of EXPRESSION, given MT and SETTINGS.
    It may assume that the :required function returned t.
    It must return two values, the reformulated expression (or EXPRESSION unchanged), and a justification, which is nil iff
    EXPRESSION was not modified, t if the justification is 'because I say so', or possibly something more descriptive.

    :documentation must be a string explaining what the RL module does.

    :example-source must be a CycL expression in string form.

    :example-target must be a CycL expression in string form, the result of applying the :reformulate function to the :example-source expression.
    }}}EDOC
     * @unknown bertolo
     */
    @LispMethod(comment = "@param module-constant;\nCONSTANT\r\n\t\t\r\n@param plist;\nPLIST\r\n\t\t\r\n@return RL-MODULE/NIL\r\nBuilds a new RL-MODULE from PLIST and adds it to the store, returning the module itself.\r\n{{{DOC\r\nExplanation of fields in PLIST:\r\n\r\n:required must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,\r\nand is a fast necessary condition check to determine whether the RL module might apply to EXPRESSION, given MT and SETTINGS.\r\nIt must return a boolean.\r\n\r\n:cost must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,\r\nand is a fast computation of the expected cost (in microseconds) of reformulating EXPRESSION using this RL module, given MT and SETTINGS.\r\nIt must return an integer.\r\n\r\n:reformulate must be a symbol bound to a function which takes three arguments, EXPRESSION, MT, and SETTINGS,\r\nand performs the actual reformulation of EXPRESSION, given MT and SETTINGS.\r\nIt may assume that the :required function returned t.\r\nIt must return two values, the reformulated expression (or EXPRESSION unchanged), and a justification, which is nil iff\r\nEXPRESSION was not modified, t if the justification is \'because I say so\', or possibly something more descriptive.\r\n\r\n:documentation must be a string explaining what the RL module does.\r\n\r\n:example-source must be a CycL expression in string form.\r\n\r\n:example-target must be a CycL expression in string form, the result of applying the :reformulate function to the :example-source expression.\r\n}}}EDOC\r\n@unknown bertolo")
    public static SubLObject declare_rl_module(final SubLObject module_constant, final SubLObject plist) {
        clear_rl_module_store_if_corrupt();
        final SubLObject module = new_rl_module(module_constant, plist);
        add_rl_module_to_store(module);
        return module;
    }

    public static final SubLObject rl_module_store_alt() {
        return $rl_module_store$.getGlobalValue();
    }

    public static SubLObject rl_module_store() {
        return $rl_module_store$.getGlobalValue();
    }

    public static final SubLObject rl_module_names_alt() {
        return Mapping.mapcar(RL_MODULE_NAME, rl_module_store());
    }

    public static SubLObject rl_module_names() {
        return Mapping.mapcar(RL_MODULE_NAME, rl_module_store());
    }

    /**
     *
     *
     * @return INTEGER
    Returns a count of all RL modules presently registered on the RL-module store
     * @unknown bertolo
     */
    @LispMethod(comment = "@return INTEGER\r\nReturns a count of all RL modules presently registered on the RL-module store\r\n@unknown bertolo")
    public static final SubLObject rl_module_store_size_alt() {
        return length($rl_module_store$.getGlobalValue());
    }

    /**
     *
     *
     * @return INTEGER
    Returns a count of all RL modules presently registered on the RL-module store
     * @unknown bertolo
     */
    @LispMethod(comment = "@return INTEGER\r\nReturns a count of all RL modules presently registered on the RL-module store\r\n@unknown bertolo")
    public static SubLObject rl_module_store_size() {
        return length($rl_module_store$.getGlobalValue());
    }

    public static final SubLObject clear_rl_module_store_alt() {
        $rl_module_store$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject clear_rl_module_store() {
        $rl_module_store$.setGlobalValue(NIL);
        return T;
    }

    /**
     *
     *
     * @return boolean; whether the RL module store was corrupt.
     * @unknown pace
     */
    @LispMethod(comment = "@return boolean; whether the RL module store was corrupt.\r\n@unknown pace")
    public static final SubLObject clear_rl_module_store_if_corrupt_alt() {
        {
            SubLObject cdolist_list_var = rl_module_store();
            SubLObject mod = NIL;
            for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                {
                    SubLObject rl_module = mod;
                    if (NIL == valid_rl_moduleP(rl_module)) {
                        reformulator_hub.ref_warn(ZERO_INTEGER, $str_alt58$RL_module_store_corrupt__clearing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        clear_rl_module_store();
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; whether the RL module store was corrupt.
     * @unknown pace
     */
    @LispMethod(comment = "@return boolean; whether the RL module store was corrupt.\r\n@unknown pace")
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

    /**
     *
     *
     * @param constant;
    CONSTANT
     * 		
     * @return RL-MODULE/NIL
    Returns the single RL module named CONSTANT from the RL module store,
    if such a module exists.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param constant;\nCONSTANT\r\n\t\t\r\n@return RL-MODULE/NIL\r\nReturns the single RL module named CONSTANT from the RL module store,\r\nif such a module exists.\r\n@unknown bertolo")
    public static final SubLObject get_rl_module_from_store_alt(SubLObject constant) {
        {
            SubLObject module_found = NIL;
            if (NIL == module_found) {
                {
                    SubLObject csome_list_var = rl_module_store();
                    SubLObject mod = NIL;
                    for (mod = csome_list_var.first(); !((NIL != module_found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mod = csome_list_var.first()) {
                        {
                            SubLObject rl_module = mod;
                            if (constant.eql(rl_module_name(rl_module))) {
                                module_found = rl_module;
                            }
                        }
                    }
                }
            }
            return module_found;
        }
    }

    /**
     *
     *
     * @param constant;
    CONSTANT
     * 		
     * @return RL-MODULE/NIL
    Returns the single RL module named CONSTANT from the RL module store,
    if such a module exists.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param constant;\nCONSTANT\r\n\t\t\r\n@return RL-MODULE/NIL\r\nReturns the single RL module named CONSTANT from the RL module store,\r\nif such a module exists.\r\n@unknown bertolo")
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

    /**
     *
     *
     * @param rl-module;
    RL-MODULE
     * 		
     * @return BOOLEAN
    Adds RL-MODULE to *rl-module-store*.  Replaces
    any existing RL module with the same name.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-module;\nRL-MODULE\r\n\t\t\r\n@return BOOLEAN\r\nAdds RL-MODULE to *rl-module-store*.  Replaces\r\nany existing RL module with the same name.\r\n@unknown bertolo")
    public static final SubLObject add_rl_module_to_store_alt(SubLObject rl_module) {
        {
            SubLObject constant = rl_module_name(rl_module);
            if (NIL != get_rl_module_from_store(constant)) {
                reformulator_hub.ref_warn(FIVE_INTEGER, $str_alt59$RL_module__S_already_exists_in_th, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                remove_rl_module_from_store(constant);
            }
            $rl_module_store$.setGlobalValue(cons(rl_module, $rl_module_store$.getGlobalValue()));
            return T;
        }
    }

    /**
     *
     *
     * @param rl-module;
    RL-MODULE
     * 		
     * @return BOOLEAN
    Adds RL-MODULE to *rl-module-store*.  Replaces
    any existing RL module with the same name.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-module;\nRL-MODULE\r\n\t\t\r\n@return BOOLEAN\r\nAdds RL-MODULE to *rl-module-store*.  Replaces\r\nany existing RL module with the same name.\r\n@unknown bertolo")
    public static SubLObject add_rl_module_to_store(final SubLObject rl_module) {
        final SubLObject constant = rl_module_name(rl_module);
        if (NIL != get_rl_module_from_store(constant)) {
            reformulator_hub.ref_warn(FIVE_INTEGER, $str65$RL_module__S_already_exists_in_th, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            remove_rl_module_from_store(constant);
        }
        $rl_module_store$.setGlobalValue(cons(rl_module, $rl_module_store$.getGlobalValue()));
        return T;
    }

    /**
     *
     *
     * @param constant;
    CONSTANT
     * 		
     * @return RL-MODULE/NIL
    Removes from the RL module store the single RL module named CONSTANT,
    if such a module exists.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param constant;\nCONSTANT\r\n\t\t\r\n@return RL-MODULE/NIL\r\nRemoves from the RL module store the single RL module named CONSTANT,\r\nif such a module exists.\r\n@unknown bertolo")
    public static final SubLObject remove_rl_module_from_store_alt(SubLObject constant) {
        {
            SubLObject others = NIL;
            SubLObject cdolist_list_var = rl_module_store();
            SubLObject mod = NIL;
            for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                {
                    SubLObject module = mod;
                    if (!constant.eql(rl_module_name(module))) {
                        others = cons(module, others);
                    }
                }
            }
            if (NIL != list_utilities.same_length_p(rl_module_store(), others)) {
                reformulator_hub.ref_warn(TWO_INTEGER, $str_alt60$__No_module_named__S_found_in_the, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            $rl_module_store$.setGlobalValue(nreverse(others));
            return T;
        }
    }

    /**
     *
     *
     * @param constant;
    CONSTANT
     * 		
     * @return RL-MODULE/NIL
    Removes from the RL module store the single RL module named CONSTANT,
    if such a module exists.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param constant;\nCONSTANT\r\n\t\t\r\n@return RL-MODULE/NIL\r\nRemoves from the RL module store the single RL module named CONSTANT,\r\nif such a module exists.\r\n@unknown bertolo")
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

    /**
     *
     *
     * @return boolean; whether RL-MODULE might apply to EXPRESSION, given SETTINGS.
     */
    @LispMethod(comment = "@return boolean; whether RL-MODULE might apply to EXPRESSION, given SETTINGS.")
    public static final SubLObject rl_module_applicableP_alt(SubLObject rl_module, SubLObject expression, SubLObject mt, SubLObject settings) {
        return funcall(rl_module_required_function(rl_module), expression, mt, settings);
    }

    /**
     *
     *
     * @return boolean; whether RL-MODULE might apply to EXPRESSION, given SETTINGS.
     */
    @LispMethod(comment = "@return boolean; whether RL-MODULE might apply to EXPRESSION, given SETTINGS.")
    public static SubLObject rl_module_applicableP(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return funcall(rl_module_required_function(rl_module), expression, mt, settings);
    }

    /**
     *
     *
     * @return integerp; compute an estimate of the cost to reformulate EXPRESSION
    using RL-MODULE, given SETTINGS.
     */
    @LispMethod(comment = "@return integerp; compute an estimate of the cost to reformulate EXPRESSION\r\nusing RL-MODULE, given SETTINGS.")
    public static final SubLObject rl_module_cost_alt(SubLObject rl_module, SubLObject expression, SubLObject mt, SubLObject settings) {
        return funcall(rl_module_cost_function(rl_module), expression, mt, settings);
    }

    /**
     *
     *
     * @return integerp; compute an estimate of the cost to reformulate EXPRESSION
    using RL-MODULE, given SETTINGS.
     */
    @LispMethod(comment = "@return integerp; compute an estimate of the cost to reformulate EXPRESSION\r\nusing RL-MODULE, given SETTINGS.")
    public static SubLObject rl_module_cost(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return funcall(rl_module_cost_function(rl_module), expression, mt, settings);
    }

    /**
     *
     *
     * @return 0 el-expression?; the result of using RL-MODULE to reformulate EXPRESSION,
    given SETTINGS.
     * @return 1 boolean; t iff EXPRESSION was modified.
     */
    @LispMethod(comment = "@return 0 el-expression?; the result of using RL-MODULE to reformulate EXPRESSION,\r\ngiven SETTINGS.\r\n@return 1 boolean; t iff EXPRESSION was modified.")
    public static final SubLObject rl_module_reformulate_alt(SubLObject rl_module, SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        return funcall(rl_module_reformulate_function(rl_module), expression, original_clause, mt, settings);
    }

    /**
     *
     *
     * @return 0 el-expression?; the result of using RL-MODULE to reformulate EXPRESSION,
    given SETTINGS.
     * @return 1 boolean; t iff EXPRESSION was modified.
     */
    @LispMethod(comment = "@return 0 el-expression?; the result of using RL-MODULE to reformulate EXPRESSION,\r\ngiven SETTINGS.\r\n@return 1 boolean; t iff EXPRESSION was modified.")
    public static SubLObject rl_module_reformulate(final SubLObject rl_module, final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        return funcall(rl_module_reformulate_function(rl_module), expression, original_clause, mt, settings);
    }

    public static SubLObject declare_reformulator_module_harness_file() {
        declareFunction("rl_module_print_function_trampoline", "RL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rl_module_p", "RL-MODULE-P", 1, 0, false);
        new reformulator_module_harness.$rl_module_p$UnaryFunction();
        declareFunction("rlm_name", "RLM-NAME", 1, 0, false);
        declareFunction("rlm_required", "RLM-REQUIRED", 1, 0, false);
        declareFunction("rlm_cost", "RLM-COST", 1, 0, false);
        declareFunction("rlm_reformulate", "RLM-REFORMULATE", 1, 0, false);
        declareFunction("rlm_documentation", "RLM-DOCUMENTATION", 1, 0, false);
        declareFunction("rlm_example_source", "RLM-EXAMPLE-SOURCE", 1, 0, false);
        declareFunction("rlm_example_target", "RLM-EXAMPLE-TARGET", 1, 0, false);
        declareFunction("rlm_plist", "RLM-PLIST", 1, 0, false);
        declareFunction("_csetf_rlm_name", "_CSETF-RLM-NAME", 2, 0, false);
        declareFunction("_csetf_rlm_required", "_CSETF-RLM-REQUIRED", 2, 0, false);
        declareFunction("_csetf_rlm_cost", "_CSETF-RLM-COST", 2, 0, false);
        declareFunction("_csetf_rlm_reformulate", "_CSETF-RLM-REFORMULATE", 2, 0, false);
        declareFunction("_csetf_rlm_documentation", "_CSETF-RLM-DOCUMENTATION", 2, 0, false);
        declareFunction("_csetf_rlm_example_source", "_CSETF-RLM-EXAMPLE-SOURCE", 2, 0, false);
        declareFunction("_csetf_rlm_example_target", "_CSETF-RLM-EXAMPLE-TARGET", 2, 0, false);
        declareFunction("_csetf_rlm_plist", "_CSETF-RLM-PLIST", 2, 0, false);
        declareFunction("make_rl_module", "MAKE-RL-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_rl_module", "VISIT-DEFSTRUCT-RL-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_rl_module_method", "VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD", 2, 0, false);
        declareFunction("print_rl_module", "PRINT-RL-MODULE", 3, 0, false);
        declareFunction("print_rl_module_documentation", "PRINT-RL-MODULE-DOCUMENTATION", 1, 1, false);
        declareFunction("new_rl_module", "NEW-RL-MODULE", 2, 0, false);
        declareFunction("rl_module_name", "RL-MODULE-NAME", 1, 0, false);
        declareFunction("rl_module_required_function", "RL-MODULE-REQUIRED-FUNCTION", 1, 0, false);
        declareFunction("rl_module_cost_function", "RL-MODULE-COST-FUNCTION", 1, 0, false);
        declareFunction("rl_module_reformulate_function", "RL-MODULE-REFORMULATE-FUNCTION", 1, 0, false);
        declareFunction("rl_module_documentation", "RL-MODULE-DOCUMENTATION", 1, 0, false);
        declareFunction("rl_module_example_source", "RL-MODULE-EXAMPLE-SOURCE", 1, 0, false);
        declareFunction("rl_module_example_target", "RL-MODULE-EXAMPLE-TARGET", 1, 0, false);
        declareFunction("rl_module_plist", "RL-MODULE-PLIST", 1, 0, false);
        declareFunction("valid_rl_moduleP", "VALID-RL-MODULE?", 1, 0, false);
        declareMacro("do_rl_modules", "DO-RL-MODULES");
        declareMacro("some_rl_modules", "SOME-RL-MODULES");
        declareFunction("declare_rl_module", "DECLARE-RL-MODULE", 2, 0, false);
        declareFunction("rl_module_store", "RL-MODULE-STORE", 0, 0, false);
        declareFunction("rl_module_names", "RL-MODULE-NAMES", 0, 0, false);
        declareFunction("rl_module_store_size", "RL-MODULE-STORE-SIZE", 0, 0, false);
        declareFunction("clear_rl_module_store", "CLEAR-RL-MODULE-STORE", 0, 0, false);
        declareFunction("clear_rl_module_store_if_corrupt", "CLEAR-RL-MODULE-STORE-IF-CORRUPT", 0, 0, false);
        declareFunction("get_rl_module_from_store", "GET-RL-MODULE-FROM-STORE", 1, 0, false);
        declareFunction("add_rl_module_to_store", "ADD-RL-MODULE-TO-STORE", 1, 0, false);
        declareFunction("remove_rl_module_from_store", "REMOVE-RL-MODULE-FROM-STORE", 1, 0, false);
        declareFunction("rl_module_applicableP", "RL-MODULE-APPLICABLE?", 4, 0, false);
        declareFunction("rl_module_cost", "RL-MODULE-COST", 4, 0, false);
        declareFunction("rl_module_reformulate", "RL-MODULE-REFORMULATE", 5, 0, false);
        return NIL;
    }

    public static final SubLObject init_reformulator_module_harness_file_alt() {
        defconstant("*DTP-RL-MODULE*", RL_MODULE);
        deflexical("*RL-MODULE-STORE*", NIL != boundp($rl_module_store$) ? ((SubLObject) ($rl_module_store$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_reformulator_module_harness_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-RL-MODULE*", RL_MODULE);
            deflexical("*RL-MODULE-STORE*", SubLTrampolineFile.maybeDefault($rl_module_store$, $rl_module_store$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RL-MODULE-STORE*", NIL != boundp($rl_module_store$) ? ((SubLObject) ($rl_module_store$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_reformulator_module_harness_file_Previous() {
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

    static private final SubLList $list_alt2 = list(makeSymbol("NAME"), makeSymbol("REQUIRED"), makeSymbol("COST"), makeSymbol("REFORMULATE"), makeSymbol("DOCUMENTATION"), makeSymbol("EXAMPLE-SOURCE"), makeSymbol("EXAMPLE-TARGET"), makeSymbol("PLIST"));

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

    static private final SubLList $list_alt3 = list($NAME, makeKeyword("REQUIRED"), $COST, makeKeyword("REFORMULATE"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE-SOURCE"), makeKeyword("EXAMPLE-TARGET"), makeKeyword("PLIST"));

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

        public $rl_module_native() {
            reformulator_module_harness.$rl_module_native.this.$name = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$required = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$cost = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$reformulate = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$documentation = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$example_source = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$example_target = Lisp.NIL;
            reformulator_module_harness.$rl_module_native.this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return reformulator_module_harness.$rl_module_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return reformulator_module_harness.$rl_module_native.this.$required;
        }

        @Override
        public SubLObject getField4() {
            return reformulator_module_harness.$rl_module_native.this.$cost;
        }

        @Override
        public SubLObject getField5() {
            return reformulator_module_harness.$rl_module_native.this.$reformulate;
        }

        @Override
        public SubLObject getField6() {
            return reformulator_module_harness.$rl_module_native.this.$documentation;
        }

        @Override
        public SubLObject getField7() {
            return reformulator_module_harness.$rl_module_native.this.$example_source;
        }

        @Override
        public SubLObject getField8() {
            return reformulator_module_harness.$rl_module_native.this.$example_target;
        }

        @Override
        public SubLObject getField9() {
            return reformulator_module_harness.$rl_module_native.this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$required = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$cost = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$reformulate = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$documentation = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$example_source = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$example_target = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return reformulator_module_harness.$rl_module_native.this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.reformulator_module_harness.$rl_module_native.class, RL_MODULE, RL_MODULE_P, $list2, $list3, new String[]{ "$name", "$required", "$cost", "$reformulate", "$documentation", "$example_source", "$example_target", "$plist" }, $list4, $list5, PRINT_RL_MODULE);
        }
    }

    static private final SubLList $list_alt4 = list(makeSymbol("RLM-NAME"), makeSymbol("RLM-REQUIRED"), makeSymbol("RLM-COST"), makeSymbol("RLM-REFORMULATE"), makeSymbol("RLM-DOCUMENTATION"), makeSymbol("RLM-EXAMPLE-SOURCE"), makeSymbol("RLM-EXAMPLE-TARGET"), makeSymbol("RLM-PLIST"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-RLM-NAME"), makeSymbol("_CSETF-RLM-REQUIRED"), makeSymbol("_CSETF-RLM-COST"), makeSymbol("_CSETF-RLM-REFORMULATE"), makeSymbol("_CSETF-RLM-DOCUMENTATION"), makeSymbol("_CSETF-RLM-EXAMPLE-SOURCE"), makeSymbol("_CSETF-RLM-EXAMPLE-TARGET"), makeSymbol("_CSETF-RLM-PLIST"));

    static private final SubLString $str_alt32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt33$__RL_Module__Name__________S__ = makeString("#<RL-Module: Name:        ~S~%");

    static private final SubLString $str_alt34$_____________Required______S__ = makeString("             Required:    ~S~%");

    static private final SubLString $str_alt35$_____________Cost__________S__ = makeString("             Cost:        ~S~%");

    static private final SubLString $str_alt36$_____________Reformulate___S___ = makeString("             Reformulate: ~S>~%");

    static private final SubLString $str_alt37$__Documentation___A = makeString("~%Documentation: ~A");

    static private final SubLString $str_alt38$____Input_____S = makeString("~%~%Input: ~%~S");

    public static final class $rl_module_p$UnaryFunction extends UnaryFunction {
        public $rl_module_p$UnaryFunction() {
            super(extractFunctionNamed("RL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rl_module_p(arg1);
        }
    }

    static private final SubLString $str_alt39$_____ = makeString("~%==>");

    static private final SubLString $str_alt40$____Desired_output_____S = makeString("~%~%Desired output: ~%~S");

    static private final SubLString $str_alt41$__Missing__required_info__Abortin = makeString("~%Missing :required info. Aborting");

    static private final SubLString $str_alt42$__Missing__cost_info__Aborting = makeString("~%Missing :cost info. Aborting");

    static private final SubLString $str_alt43$__Missing__reformulate_info__Abor = makeString("~%Missing :reformulate info. Aborting");

    static private final SubLString $str_alt44$__Missing__documentation_info__Ba = makeString("~%Missing :documentation info. Bad programmer!");

    static private final SubLString $str_alt45$__Missing__example_source_info__B = makeString("~%Missing :example-source info. Bad programmer!");

    static private final SubLString $str_alt46$__Missing__example_target_info__B = makeString("~%Missing :example-target info. Bad programmer!");

    static private final SubLList $list_alt47 = list(list(makeSymbol("MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt49 = list(makeSymbol("MOD"), list(makeSymbol("RL-MODULE-STORE")));

    static private final SubLList $list_alt51 = list(makeSymbol("MOD"));

    static private final SubLList $list_alt52 = list(list(makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt55 = list(makeSymbol("RL-MODULE-STORE"));

    static private final SubLString $str_alt58$RL_module_store_corrupt__clearing = makeString("RL module store corrupt; clearing...");

    static private final SubLString $str_alt59$RL_module__S_already_exists_in_th = makeString("RL module ~S already exists in the store; replacing.");

    static private final SubLString $str_alt60$__No_module_named__S_found_in_the = makeString("~%No module named ~S found in the store; could not remove.");
}

/**
 * Total time: 126 ms
 */
