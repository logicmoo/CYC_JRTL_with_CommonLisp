package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_rkf_irrelevant_fort_cache extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rkf_irrelevant_fort_cache";
    public static String myFingerPrint = "10e0f1ae852209ba629c8f9720e0ed382815f1d6aa9ab1205cac741bee39aeb8";
    private static SubLSymbol $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS;
    private static SubLList $list1;
    private static SubLSymbol $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG;
    private static SubLList $list3;
    private static SubLSymbol $POS;
    private static SubLSymbol $IRRELEVANT_EVERYWHERE;
    private static SubLSymbol $RKF_IRRELEVANT_FORT_CACHE;
    private static SubLSymbol $NEG;
    private static SubLSymbol $IRRELEVANT_NOWHERE;
    private static SubLSymbol $sym9$HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE;
    private static SubLList $list10;
    private static SubLSymbol $sym11$HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE;
    private static SubLSymbol $sym12$SUPPORT_MT;
    private static SubLList $list13;
    private static SubLSymbol $sym14$HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 500L)
    public static SubLObject removal_rkf_irrelevant_fort_cache_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 2000L)
    public static SubLObject removal_rkf_irrelevant_fort_cache_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject result = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort);
        if (sense == $POS && result == $IRRELEVANT_EVERYWHERE) {
            backward.removal_add_node(arguments.make_hl_support($RKF_IRRELEVANT_FORT_CACHE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (sense == $NEG && result == $IRRELEVANT_NOWHERE) {
            backward.removal_add_node(arguments.make_hl_support($RKF_IRRELEVANT_FORT_CACHE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 2600L)
    public static SubLObject hl_justify_rkf_irrelevant_fort_cache(SubLObject support) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject literal = arguments.support_sentence(support);
        SubLObject negatedP = cycl_utilities.negatedP(literal);
        SubLObject sentence = el_utilities.literal_atomic_sentence(literal);
        SubLObject truth = (NIL != negatedP) ? enumeration_types.inverse_truth(arguments.support_truth(support)) : arguments.support_truth(support);
        SubLObject supports = NIL;
        SubLObject _prev_bind_0 = rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.currentBinding(thread);
        try {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.bind(NIL, thread);
            SubLObject bindings_and_supports = backward.removal_ask(sentence, arguments.support_mt(support), truth, UNPROVIDED);
            supports = conses_high.second(bindings_and_supports.first());
        } finally {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 3100L)
    public static SubLObject hl_verify_rkf_irrelevant_fort_cache(SubLObject support) {
        return list_utilities.sublisp_boolean(backward.removal_ask(arguments.support_sentence(support), arguments.support_mt(support), arguments.support_truth(support), $list10));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 3400L)
    public static SubLObject hl_forward_mt_combos_rkf_irrelevant_fort_cache(SubLObject support) {
        SubLObject supports = NIL;
        SubLObject mts = Mapping.mapcar($sym12$SUPPORT_MT, hl_justify_rkf_irrelevant_fort_cache(support));
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list13);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list13);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list13);
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
            cdestructuring_bind.cdestructuring_bind_error(support, $list13);
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-rkf-irrelevant-fort-cache.lisp", position = 3800L)
    public static SubLObject removal_rkf_irrelevant_fort_cache_required(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fort = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject pcase_var;
        SubLObject value = pcase_var = (NIL != rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.getDynamicValue(thread) && NIL != forts.fort_p(fort)) ? rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(fort) : NIL;
        if (pcase_var.eql($IRRELEVANT_EVERYWHERE) || pcase_var.eql($IRRELEVANT_NOWHERE)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_rkf_irrelevant_fort_cache_file() {
        declareFunction(myName, "removal_rkf_irrelevant_fort_cache_check_cost", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST", 1, 1, false);
        declareFunction(myName, "removal_rkf_irrelevant_fort_cache_check_expand", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "hl_justify_rkf_irrelevant_fort_cache", "HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        declareFunction(myName, "hl_verify_rkf_irrelevant_fort_cache", "HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        declareFunction(myName, "hl_forward_mt_combos_rkf_irrelevant_fort_cache", "HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE", 1, 0, false);
        declareFunction(myName, "removal_rkf_irrelevant_fort_cache_required", "REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rkf_irrelevant_fort_cache_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_rkf_irrelevant_fort_cache_file() {
        inference_modules.inference_removal_module($REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS, $list1);
        inference_modules.inference_removal_module($REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG, $list3);
        utilities_macros.note_funcall_helper_function($sym9$HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE);
        utilities_macros.note_funcall_helper_function($sym11$HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE);
        utilities_macros.note_funcall_helper_function($sym14$HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE);
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
        me = new removal_modules_rkf_irrelevant_fort_cache();
        $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS = makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS");
        $list1 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("keIrrelevantTerm")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("keIrrelevantTerm")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"),
                makeKeyword("DOCUMENTATION"), makeString("(#$keIrrelevantTerm <fort>) using the irrelevance cache"), makeKeyword("EXAMPLE"), makeString("(#$keIrrelevantTerm #$Poodle)\n    (#$keIrrelevantTerm (#$GovernmentFn #$France))") });
        $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_NEG = makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-NEG");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("keIrrelevantTerm")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-REQUIRED"), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("keIrrelevantTerm")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-EXPAND"),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$keIrrelevantTerm <fort>)) using the irrelevance cache"), makeKeyword("EXAMPLE"), makeString("(#$not (#$keIrrelevantTerm #$Poodle))\n    (#$not (#$keIrrelevantTerm (#$GovernmentFn #$France)))") });
        $POS = makeKeyword("POS");
        $IRRELEVANT_EVERYWHERE = makeKeyword("IRRELEVANT-EVERYWHERE");
        $RKF_IRRELEVANT_FORT_CACHE = makeKeyword("RKF-IRRELEVANT-FORT-CACHE");
        $NEG = makeKeyword("NEG");
        $IRRELEVANT_NOWHERE = makeKeyword("IRRELEVANT-NOWHERE");
        $sym9$HL_JUSTIFY_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE");
        $list10 = list(makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS")), makeKeyword("MAX-NUMBER"), ONE_INTEGER);
        $sym11$HL_VERIFY_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE");
        $sym12$SUPPORT_MT = makeSymbol("SUPPORT-MT");
        $list13 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));
        $sym14$HL_FORWARD_MT_COMBOS_RKF_IRRELEVANT_FORT_CACHE = makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE");
    }
}
/*
 *
 * Total time: 140 ms
 *
 */