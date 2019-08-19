package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_source_sentence extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_sentence";
    public static String myFingerPrint = "d1d990d34b4d5902ba6d51b765f0af2938c0d6ce38cf598b342384f760f86471";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 800L)
    private static SubLSymbol $default_source_sentence_check_cost$;
    private static SubLObject $$sourceSentence;
    private static SubLSymbol $REMOVAL_SOURCE_SENTENCE_LOOKUP_POS;
    private static SubLList $list2;
    private static SubLObject $$TheCurrentCycKB;
    private static SubLSymbol $POS;
    private static SubLSymbol $STRICT;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLList $list9;
    private static SubLSymbol $REMOVAL_SOURCE_SENTENCE_CHECK_NEG;
    private static SubLList $list11;
    private static SubLSymbol $OPAQUE;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 1700L)
    public static SubLObject removal_source_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return removal_source_sentence_lookup_pos_cost_int(source, subsentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 2000L)
    public static SubLObject removal_source_sentence_lookup_pos_cost_int(SubLObject source, SubLObject sentence) {
        if (NIL != variables.fully_bound_p(sentence)) {
            return $default_source_sentence_check_cost$.getGlobalValue();
        }
        if (NIL != el_utilities.atomic_sentenceP(sentence)) {
            if (source.eql($$TheCurrentCycKB)) {
                return inference_utilities.literal_removal_cost(sentence, $POS, UNPROVIDED, UNPROVIDED);
            }
            return sksi_query_utilities.sksi_sentence_cost(sentence, $POS, source);
        } else {
            if (NIL == el_utilities.el_conjunction_p(sentence)) {
                return NIL;
            }
            if (source.eql($$TheCurrentCycKB)) {
                return removal_modules_kb_sentence.removal_kb_sentence_lookup_pos_conjunction_cost(sentence);
            }
            SubLObject mt = inference_datastructures_inference.inference_mt(inference_macros.current_controlling_inference());
            SubLObject contextualized_dnf_clause = inference_czer.inference_canonicalize_ask_memoized(sentence, mt, NIL).first();
            SubLObject cost = sksi_conjunctive_removal_modules_cost.sksi_query_cost_contextualized_dnf(contextualized_dnf_clause, source);
            return cost;
        }
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 2900L)
    public static SubLObject removal_source_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        if (source.eql($$TheCurrentCycKB)) {
            return removal_modules_kb_sentence.removal_kb_sentence_lookup_pos_expand_subsentence(subsentence, mt, sense);
        }
        return removal_source_sentence_lookup_pos_expand_int(source, subsentence, mt, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 3400L)
    public static SubLObject removal_source_sentence_lookup_pos_expand_int(SubLObject sks, SubLObject subsentence, SubLObject mt, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sks);
        SubLObject _prev_bind_0 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding(thread);
        try {
            sksi_macros.$sksi_default_ms_type_check_strength$.bind($STRICT, thread);
            SubLObject cdolist_list_var;
            SubLObject result = cdolist_list_var = ask_utilities.inference_recursive_query(subsentence, mt, list($RETURN, $BINDINGS_AND_SUPPORTS, $ALLOWED_MODULES, allowed_modules_list));
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
            sksi_macros.$sksi_default_ms_type_check_strength$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 4700L)
    public static SubLObject removal_source_sentence_lookup_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return $default_source_sentence_check_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 4900L)
    public static SubLObject removal_source_sentence_lookup_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        if (source.eql($$TheCurrentCycKB)) {
            return removal_modules_kb_sentence.removal_kb_sentence_check_neg_expand_subsentence(subsentence, mt, sense);
        }
        return removal_source_sentence_lookup_neg_expand_int(source, subsentence, mt, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-sentence.lisp", position = 5400L)
    public static SubLObject removal_source_sentence_lookup_neg_expand_int(SubLObject sks, SubLObject subsentence, SubLObject mt, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sks);
        SubLObject _prev_bind_0 = sksi_macros.$sksi_default_ms_type_check_strength$.currentBinding(thread);
        try {
            sksi_macros.$sksi_default_ms_type_check_strength$.bind($STRICT, thread);
            SubLObject result = ask_utilities.inference_recursive_query(subsentence, mt, list($ALLOWED_MODULES, allowed_modules_list));
            if (NIL == result) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, el_utilities.make_negation(subsentence), mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } finally {
            sksi_macros.$sksi_default_ms_type_check_strength$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_source_sentence_file() {
        declareFunction(myName, "removal_source_sentence_lookup_pos_cost", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_source_sentence_lookup_pos_cost_int", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-COST-INT", 2, 0, false);
        declareFunction(myName, "removal_source_sentence_lookup_pos_expand", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_source_sentence_lookup_pos_expand_int", "REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-EXPAND-INT", 4, 0, false);
        declareFunction(myName, "removal_source_sentence_lookup_neg_cost", "REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_source_sentence_lookup_neg_expand", "REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_source_sentence_lookup_neg_expand_int", "REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-EXPAND-INT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_source_sentence_file() {
        $default_source_sentence_check_cost$ = deflexical("*DEFAULT-SOURCE-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_source_sentence_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$sourceSentence);
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SENTENCE_LOOKUP_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SENTENCE_CHECK_NEG, $list11);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_source_sentence_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_source_sentence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_source_sentence_file();
    }

    static {
        me = new removal_modules_source_sentence();
        $default_source_sentence_check_cost$ = null;
        $$sourceSentence = makeConstSym(("sourceSentence"));
        $REMOVAL_SOURCE_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS");
        $list2 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sourceSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("sourceSentence")), makeKeyword("FULLY-BOUND"),
                        list(makeKeyword("OR"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(makeConstSym(("and")), makeKeyword("ANYTHING")))),
                makeKeyword("COST"), makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sourceSentence <SOURCE> \n                      (:or\n                        (:fully-bound . :fully-bound)\n                        ((:test inference-predicate-p) . :anything)\n                        (#$and . :anything)\n                      ))"),
                makeKeyword("EXAMPLE"), makeString("(#$sourceSentence #$NWS-KS (#$weather #$CityOfLosAngelesCA ?WHAT))") });
        $$TheCurrentCycKB = makeConstSym(("TheCurrentCycKB"));
        $POS = makeKeyword("POS");
        $STRICT = makeKeyword("STRICT");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $list9 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
        $REMOVAL_SOURCE_SENTENCE_CHECK_NEG = makeKeyword("REMOVAL-SOURCE-SENTENCE-CHECK-NEG");
        $list11 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("sourceSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("sourceSentence")), makeKeyword("FULLY-BOUND"), list(makeKeyword("OR"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"),
                makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SOURCE-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$sourceSentence <fully-bound> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$sourceSentence #$NWS-KS (#$weather #$CityOfLosAngelesCA #$Snowy)))") });
        $OPAQUE = makeKeyword("OPAQUE");
    }
}
/*
 *
 * Total time: 95 ms
 *
 */