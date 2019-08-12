/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_rkf_irrelevant_fort_cache extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_rkf_irrelevant_fort_cache();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache";


    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS = makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS");

    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("keIrrelevantTerm"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("keIrrelevantTerm"), $FORT), $COST, makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keIrrelevantTerm <fort>) using the irrelevance cache"), makeKeyword("EXAMPLE"), makeString("(#$keIrrelevantTerm #$Poodle)\n    (#$keIrrelevantTerm (#$GovernmentFn #$France))") });

    private static final SubLSymbol $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG = makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-NEG");

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("keIrrelevantTerm"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("keIrrelevantTerm"), $FORT), $COST, makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$keIrrelevantTerm <fort>)) using the irrelevance cache"), makeKeyword("EXAMPLE"), makeString("(#$not (#$keIrrelevantTerm #$Poodle))\n    (#$not (#$keIrrelevantTerm (#$GovernmentFn #$France)))") });

    private static final SubLSymbol $RKF_IRRELEVANT_FORT_CACHE = makeKeyword("RKF-IRRELEVANT-FORT-CACHE");

    private static final SubLSymbol HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE");

    static private final SubLList $list10 = list(makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS")), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE");

    static private final SubLList $list13 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLSymbol HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE");

    // Definitions
    public static final SubLObject removal_rkf_irrelevant_fort_cache_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return $cheap_hl_module_check_cost$.getGlobalValue();
    }

    // Definitions
    public static SubLObject removal_rkf_irrelevant_fort_cache_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return $cheap_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_rkf_irrelevant_fort_cache_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject result = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort);
            if ((sense == $POS) && (result == $IRRELEVANT_EVERYWHERE)) {
                backward.removal_add_node(arguments.make_hl_support($RKF_IRRELEVANT_FORT_CACHE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else {
                if ((sense == $NEG) && (result == $IRRELEVANT_NOWHERE)) {
                    backward.removal_add_node(arguments.make_hl_support($RKF_IRRELEVANT_FORT_CACHE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_rkf_irrelevant_fort_cache_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject result = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort);
        if ((sense == $POS) && (result == $IRRELEVANT_EVERYWHERE)) {
            backward.removal_add_node(arguments.make_hl_support($RKF_IRRELEVANT_FORT_CACHE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if ((sense == $NEG) && (result == $IRRELEVANT_NOWHERE)) {
                backward.removal_add_node(arguments.make_hl_support($RKF_IRRELEVANT_FORT_CACHE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static final SubLObject hl_justify_rkf_irrelevant_fort_cache_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject literal = arguments.support_sentence(support);
                SubLObject negatedP = cycl_utilities.negatedP(literal);
                SubLObject sentence = literal_atomic_sentence(literal);
                SubLObject truth = (NIL != negatedP) ? ((SubLObject) (enumeration_types.inverse_truth(arguments.support_truth(support)))) : arguments.support_truth(support);
                SubLObject supports = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.currentBinding(thread);
                    try {
                        rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.bind(NIL, thread);
                        {
                            SubLObject bindings_and_supports = backward.removal_ask(sentence, arguments.support_mt(support), truth, UNPROVIDED);
                            supports = second(bindings_and_supports.first());
                        }
                    } finally {
                        rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.rebind(_prev_bind_0, thread);
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject hl_justify_rkf_irrelevant_fort_cache(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject literal = arguments.support_sentence(support);
        final SubLObject negatedP = cycl_utilities.negatedP(literal);
        final SubLObject sentence = literal_atomic_sentence(literal);
        final SubLObject truth = (NIL != negatedP) ? enumeration_types.inverse_truth(arguments.support_truth(support)) : arguments.support_truth(support);
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.currentBinding(thread);
        try {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.bind(NIL, thread);
            final SubLObject bindings_and_supports = backward.removal_ask(sentence, arguments.support_mt(support), truth, UNPROVIDED);
            supports = second(bindings_and_supports.first());
        } finally {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static final SubLObject hl_verify_rkf_irrelevant_fort_cache_alt(SubLObject support) {
        return list_utilities.sublisp_boolean(backward.removal_ask(arguments.support_sentence(support), arguments.support_mt(support), arguments.support_truth(support), $list_alt10));
    }

    public static SubLObject hl_verify_rkf_irrelevant_fort_cache(final SubLObject support) {
        return list_utilities.sublisp_boolean(backward.removal_ask(arguments.support_sentence(support), arguments.support_mt(support), arguments.support_truth(support), $list10));
    }

    public static final SubLObject hl_forward_mt_combos_rkf_irrelevant_fort_cache_alt(SubLObject support) {
        {
            SubLObject supports = NIL;
            SubLObject mts = Mapping.mapcar(SUPPORT_MT, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache.hl_justify_rkf_irrelevant_fort_cache(support));
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject el_sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            el_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cdolist_list_var = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
                    SubLObject mt_1 = NIL;
                    for (mt_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_1 = cdolist_list_var.first()) {
                        supports = cons(arguments.make_hl_support(hl_module, el_sentence, mt_1, tv), supports);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt13);
            }
            return supports;
        }
    }

    public static SubLObject hl_forward_mt_combos_rkf_irrelevant_fort_cache(final SubLObject support) {
        SubLObject supports = NIL;
        final SubLObject mts = Mapping.mapcar(SUPPORT_MT, hl_justify_rkf_irrelevant_fort_cache(support));
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list13);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list13);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list13);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list13);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
            SubLObject mt_$1 = NIL;
            mt_$1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                supports = cons(arguments.make_hl_support(hl_module, el_sentence, mt_$1, tv), supports);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$1 = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(support, $list13);
        }
        return supports;
    }

    public static final SubLObject removal_rkf_irrelevant_fort_cache_required_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject value = ((NIL != rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.getDynamicValue(thread)) && (NIL != forts.fort_p(fort))) ? ((SubLObject) (rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort))) : NIL;
                SubLObject pcase_var = value;
                if (pcase_var.eql($IRRELEVANT_EVERYWHERE) || pcase_var.eql($IRRELEVANT_NOWHERE)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject removal_rkf_irrelevant_fort_cache_required(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject value = pcase_var = ((NIL != rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.getDynamicValue(thread)) && (NIL != forts.fort_p(fort))) ? rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort) : NIL;
        if (pcase_var.eql($IRRELEVANT_EVERYWHERE) || pcase_var.eql($IRRELEVANT_NOWHERE)) {
            return T;
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("keIrrelevantTerm"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("keIrrelevantTerm"), $FORT), $COST, makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keIrrelevantTerm <fort>) using the irrelevance cache"), makeKeyword("EXAMPLE"), makeString("(#$keIrrelevantTerm #$Poodle)\n    (#$keIrrelevantTerm (#$GovernmentFn #$France))") });

    public static SubLObject declare_removal_modules_rkf_irrelevant_fort_cache_file() {
        declareFunction("removal_rkf_irrelevant_fort_cache_check_cost", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST", 1, 1, false);
        declareFunction("removal_rkf_irrelevant_fort_cache_check_expand", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND", 1, 1, false);
        declareFunction("hl_justify_rkf_irrelevant_fort_cache", "HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        declareFunction("hl_verify_rkf_irrelevant_fort_cache", "HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_rkf_irrelevant_fort_cache", "HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        declareFunction("removal_rkf_irrelevant_fort_cache_required", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rkf_irrelevant_fort_cache_file() {
        return NIL;
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("keIrrelevantTerm"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("keIrrelevantTerm"), $FORT), $COST, makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$keIrrelevantTerm <fort>)) using the irrelevance cache"), makeKeyword("EXAMPLE"), makeString("(#$not (#$keIrrelevantTerm #$Poodle))\n    (#$not (#$keIrrelevantTerm (#$GovernmentFn #$France)))") });

    public static SubLObject setup_removal_modules_rkf_irrelevant_fort_cache_file() {
        inference_modules.inference_removal_module($REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS, $list1);
        inference_modules.inference_removal_module($REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG, $list3);
        note_funcall_helper_function(HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE);
        note_funcall_helper_function(HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE);
        note_funcall_helper_function(HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_rkf_irrelevant_fort_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_rkf_irrelevant_fort_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_rkf_irrelevant_fort_cache_file();
    }

    static {
    }

    static private final SubLList $list_alt10 = list(makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS")), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLList $list_alt13 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));
}

/**
 * Total time: 140 ms
 */
