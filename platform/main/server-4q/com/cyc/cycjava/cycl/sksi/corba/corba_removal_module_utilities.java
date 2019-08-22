package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.backward;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class corba_removal_module_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new corba_removal_module_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_utilities";

    public static final String myFingerPrint = "01eed288164bd55a18d61f5b72b280470dcb63715192b329270d3d60d616a545";



    public static final SubLSymbol CORBA_REMOVAL_PREDICATE_P = makeSymbol("CORBA-REMOVAL-PREDICATE-P");



    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    public static final SubLSymbol CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN = makeSymbol("CORBA-REMOVAL-MODULE-GENERIC-EXPAND-FN");

    public static SubLObject corba_removal_module_generic_expand_fn(final SubLObject literal, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
        final SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
        final SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
        final SubLObject corba_predicate = literal_arg0(literal, UNPROVIDED);
        final SubLObject arg1_var = literal_arg1(literal, UNPROVIDED);
        SubLObject args = literal_args(literal, UNPROVIDED);
        if (NIL == corba_utilities.corba_storage_predicate_p(corba_predicate)) {
            args = args.rest();
        }
        final SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, args);
        if (NIL != result) {
            if (NIL != variables.variable_p(arg1_var)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, cons(corba_predicate, cons(result, args)), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                }
            } else {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, cons(corba_predicate, cons(result, args)), UNPROVIDED, UNPROVIDED), NIL, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject determine_corba_removal_module_required_pattern(final SubLObject pred) {
        assert NIL != corba_utilities.corba_removal_predicate_p(pred) : "corba_utilities.corba_removal_predicate_p(pred) " + "CommonSymbols.NIL != corba_utilities.corba_removal_predicate_p(pred) " + pred;
        SubLObject result = list(pred);
        if (NIL != corba_utilities.corba_storage_predicate_p(pred)) {
            result = cons($FULLY_BOUND, result);
        } else {
            result = cons($NOT_FULLY_BOUND, result);
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = subtract(arity.arity(pred), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            result = cons($FULLY_BOUND, result);
        }
        return nreverse(result);
    }

    public static SubLObject corba_pred_get_removal_module_expand_fn_symbol(final SubLObject pred) {
        assert NIL != corba_utilities.corba_removal_predicate_p(pred) : "corba_utilities.corba_removal_predicate_p(pred) " + "CommonSymbols.NIL != corba_utilities.corba_removal_predicate_p(pred) " + pred;
        return CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN;
    }

    public static SubLObject declare_corba_removal_module_utilities_file() {
        declareFunction(me, "corba_removal_module_generic_expand_fn", "CORBA-REMOVAL-MODULE-GENERIC-EXPAND-FN", 2, 0, false);
        declareFunction(me, "determine_corba_removal_module_required_pattern", "DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "corba_pred_get_removal_module_expand_fn_symbol", "CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_corba_removal_module_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_corba_removal_module_utilities_file() {
        return NIL;
    }

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

/**
 * Total time: 31 ms
 */
