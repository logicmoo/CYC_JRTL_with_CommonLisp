package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_sksi_sentence extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi_sentence";
    public static String myFingerPrint = "281feab1d471ec7d1f07cb5dbf01c09788991ee65b6a5bd148217b4b3848f8ab";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 800L)
    private static SubLSymbol $default_sksi_sentence_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 900L)
    private static SubLSymbol $sksi_sentence_allowed_modules_spec$;
    private static SubLObject $$sksiSentence;
    private static SubLList $list1;
    private static SubLSymbol $REMOVAL_SKSI_SENTENCE_LOOKUP_POS;
    private static SubLList $list3;
    private static SubLSymbol $POS;
    private static SubLSymbol $STRICT;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLList $list9;
    private static SubLSymbol $REMOVAL_SKSI_SENTENCE_CHECK_NEG;
    private static SubLList $list11;
    private static SubLSymbol $OPAQUE;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 1900L)
    public static SubLObject removal_sksi_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject subsentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_sksi_sentence_lookup_pos_cost_int(subsentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 2100L)
    public static SubLObject removal_sksi_sentence_lookup_pos_cost_int(SubLObject sentence) {
        if (NIL != variables.fully_bound_p(sentence)) {
            return $default_sksi_sentence_check_cost$.getGlobalValue();
        }
        if (NIL != el_utilities.atomic_sentenceP(sentence)) {
            return sksi_query_utilities.sksi_sentence_cost(sentence, $POS, UNPROVIDED);
        }
        if (NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject conjuncts = cycl_utilities.formula_args(sentence, UNPROVIDED);
            SubLObject costs = NIL;
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject conjunct_cost = removal_sksi_sentence_lookup_pos_cost_int(conjunct);
                if (NIL != conjunct_cost) {
                    costs = cons(conjunct_cost, costs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return sksi_conjunctive_removal_modules_cost.guess_cost_from_literal_costs(costs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 2800L)
    public static SubLObject removal_sksi_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        SubLObject _prev_bind_0 = czer_vars.$canonicalize_gaf_commutative_termsP$.currentBinding(thread);
        SubLObject _prev_bind_2 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_gaf_commutative_termsP$.bind(NIL, thread);
            sksi_macros.$sksi_default_ms_type_check_strength$.bind($STRICT, thread);
            SubLObject cdolist_list_var;
            SubLObject result = cdolist_list_var = ask_utilities.inference_recursive_query(subsentence, mt, list($RETURN, $BINDINGS_AND_SUPPORTS, $ALLOWED_MODULES, $sksi_sentence_allowed_modules_spec$.getGlobalValue()));
            SubLObject bindings_and_supports = NIL;
            bindings_and_supports = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                SubLObject datum = current = bindings_and_supports;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list9);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list9);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    backward.removal_add_node(supports.first(), v_bindings, supports.rest());
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list9);
                }
                cdolist_list_var = cdolist_list_var.rest();
                bindings_and_supports = cdolist_list_var.first();
            }
        } finally {
            sksi_macros.$sksi_default_ms_type_check_strength$.rebind(_prev_bind_2, thread);
            czer_vars.$canonicalize_gaf_commutative_termsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 4200L)
    public static SubLObject removal_sksi_sentence_lookup_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return $default_sksi_sentence_check_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sksi-sentence.lisp", position = 4300L)
    public static SubLObject removal_sksi_sentence_lookup_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        SubLObject _prev_bind_0 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding(thread);
        try {
            sksi_macros.$sksi_default_ms_type_check_strength$.bind($STRICT, thread);
            SubLObject result = ask_utilities.inference_recursive_query(subsentence, mt, list($ALLOWED_MODULES, $sksi_sentence_allowed_modules_spec$.getGlobalValue()));
            if (NIL == result) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, el_utilities.make_negation(subsentence), mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } finally {
            sksi_macros.$sksi_default_ms_type_check_strength$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_sksi_sentence_file() {
        declareFunction(myName, "removal_sksi_sentence_lookup_pos_cost", "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_sksi_sentence_lookup_pos_cost_int", "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-COST-INT", 1, 0, false);
        declareFunction(myName, "removal_sksi_sentence_lookup_pos_expand", "REMOVAL-SKSI-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_sksi_sentence_lookup_neg_cost", "REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_sksi_sentence_lookup_neg_expand", "REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_sksi_sentence_file() {
        $default_sksi_sentence_check_cost$ = deflexical("*DEFAULT-SKSI-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        $sksi_sentence_allowed_modules_spec$ = deflexical("*SKSI-SENTENCE-ALLOWED-MODULES-SPEC*", $list1);
        return NIL;
    }

    public static SubLObject setup_removal_modules_sksi_sentence_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$sksiSentence);
        inference_modules.inference_removal_module($REMOVAL_SKSI_SENTENCE_LOOKUP_POS, $list3);
        inference_modules.inference_removal_module($REMOVAL_SKSI_SENTENCE_CHECK_NEG, $list11);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_sksi_sentence_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_sksi_sentence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_sksi_sentence_file();
    }

    static {
        me = new removal_modules_sksi_sentence();
        $default_sksi_sentence_check_cost$ = null;
        $sksi_sentence_allowed_modules_spec$ = null;
        $$sksiSentence = makeConstSym(("sksiSentence"));
        $list1 = list(makeKeyword("OR"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI")),
                list(makeKeyword("AND"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL"))), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL-CONJUNCTIVE")))));
        $REMOVAL_SKSI_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-SKSI-SENTENCE-LOOKUP-POS");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sksiSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("sksiSentence")), list(makeKeyword("OR"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(makeConstSym(("and")), makeKeyword("ANYTHING")))),
                makeKeyword("COST"), makeSymbol("REMOVAL-SKSI-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sksiSentence \n     (:or\n      (:fully-bound . :fully-bound)\n      ((:test inference-predicate-p) . :anything)\n      (#$and . :anything)))\n    using accessible virtual assertions"), makeKeyword("EXAMPLE"),
                makeString("(#$sksiSentence (#$weather #$CityOfLosAngelesCA ?WHAT))") });
        $POS = makeKeyword("POS");
        $STRICT = makeKeyword("STRICT");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $list9 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
        $REMOVAL_SKSI_SENTENCE_CHECK_NEG = makeKeyword("REMOVAL-SKSI-SENTENCE-CHECK-NEG");
        $list11 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("sksiSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("sksiSentence")), list(makeKeyword("OR"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"),
                makeSymbol("REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$sksiSentence <fully-bound>))\n    using the absence of accessible virtual assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$sksiSentence (#$weather #$CityOfLosAngelesCA #$Snowy)))") });
        $OPAQUE = makeKeyword("OPAQUE");
    }
}
/*
 *
 * Total time: 90 ms
 *
 */