/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-REMOVAL-MODULE-UTILITIES
 *  source file: /cyc/top/cycl/sksi/corba/corba-removal-module-utilities.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class corba_removal_module_utilities extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_removal_module_utilities() {
    }

    public static final SubLFile me = new corba_removal_module_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.corba.corba_removal_module_utilities";

    // // Definitions
    public static final SubLObject corba_removal_module_generic_expand_fn(SubLObject literal, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
                SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
                SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
                SubLObject corba_predicate = el_utilities.literal_arg0(literal, UNPROVIDED);
                SubLObject arg1_var = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject args = el_utilities.literal_args(literal, UNPROVIDED);
                if (NIL == corba_utilities.corba_storage_predicate_p(corba_predicate)) {
                    args = args.rest();
                }
                {
                    SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, args);
                    if (NIL != result) {
                        if (NIL != variables.variable_p(arg1_var)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result, T, T);
                                SubLObject unify_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings) {
                                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, cons(corba_predicate, cons(result, args)), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                                }
                            }
                        } else {
                            backward.removal_add_node(arguments.make_hl_support($OPAQUE, cons(corba_predicate, cons(result, args)), UNPROVIDED, UNPROVIDED), NIL, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject determine_corba_removal_module_required_pattern(SubLObject pred) {
        SubLTrampolineFile.checkType(pred, CORBA_REMOVAL_PREDICATE_P);
        {
            SubLObject result = list(pred);
            if (NIL != corba_utilities.corba_storage_predicate_p(pred)) {
                result = cons($FULLY_BOUND, result);
            } else {
                result = cons($NOT_FULLY_BOUND, result);
            }
            {
                SubLObject cdotimes_end_var = subtract(arity.arity(pred), ONE_INTEGER);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    result = cons($FULLY_BOUND, result);
                }
            }
            return nreverse(result);
        }
    }

    public static final SubLObject corba_pred_get_removal_module_expand_fn_symbol(SubLObject pred) {
        SubLTrampolineFile.checkType(pred, CORBA_REMOVAL_PREDICATE_P);
        return CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN;
    }

    public static final SubLObject declare_corba_removal_module_utilities_file() {
        declareFunction("corba_removal_module_generic_expand_fn", "CORBA-REMOVAL-MODULE-GENERIC-EXPAND-FN", 2, 0, false);
        declareFunction("determine_corba_removal_module_required_pattern", "DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("corba_pred_get_removal_module_expand_fn_symbol", "CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_corba_removal_module_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_corba_removal_module_utilities_file() {
                return NIL;
    }



    private static final SubLSymbol CORBA_REMOVAL_PREDICATE_P = makeSymbol("CORBA-REMOVAL-PREDICATE-P");



    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    private static final SubLSymbol CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN = makeSymbol("CORBA-REMOVAL-MODULE-GENERIC-EXPAND-FN");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_corba_removal_module_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_removal_module_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_removal_module_utilities_file();
    }
}

