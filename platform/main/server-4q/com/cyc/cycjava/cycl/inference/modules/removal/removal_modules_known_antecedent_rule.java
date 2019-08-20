package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.inference_iterators;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_known_antecedent_rule extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "58a5d06b0af3a2d421bf4315d315a6989c65f8591d063e3e730df514f785ac2a";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 1900L)
    public static SubLSymbol $known_antecedent_rule_enabledP$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3600L)
    private static SubLSymbol $via_known_antecedent_rule_string$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 6700L)
    private static SubLSymbol $within_removal_known_antecedent_rule_costP$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 9800L)
    private static SubLSymbol $known_antecedent_rule_hl_module_index$;
    private static SubLString $str0$__knownAntecedentRule_support_is_;
    private static SubLString $str1$_via_known_antecedent_rule;
    private static SubLSymbol $sym2$RULE_ASSERTION_;
    private static SubLString $str3$__knownAntecedentRule_currently_o;
    private static SubLString $str4$__knownAntecedentRule_cannot_hand;
    private static SubLSymbol $POS;
    private static SubLSymbol $SENSE;
    private static SubLSymbol $DIRECTION;
    private static SubLString $str8$__knownAntecedentRule_currently_o;
    private static SubLSymbol $PREDICATE;
    private static SubLSymbol $ARITY;
    private static SubLSymbol $REQUIRED_MT;
    private static SubLSymbol $UNIFY;
    private static SubLSymbol $REQUIRED_PATTERN;
    private static SubLSymbol $CALL;
    private static SubLSymbol $sym15$REMOVAL_KNOWN_ANTECEDENT_RULE_COST;
    private static SubLSymbol $INPUT;
    private static SubLSymbol $COST_PATTERN;
    private static SubLSymbol $sym18$REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR;
    private static SubLSymbol $NOT;
    private static SubLSymbol $OUTPUT_GENERATE_PATTERN;
    private static SubLSymbol $sym21$DESTROY_INFERENCE;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $RESULT_UNIQUENESS;
    private static SubLSymbol $PROOF;
    private static SubLSymbol $ALLOWED_RULES;
    private static SubLSymbol $ALLOWED_MODULES;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $TEMPLATE;
    private static SubLList $list31;
    private static SubLSymbol $ANSWER_LANGUAGE;
    private static SubLSymbol $HL;
    private static SubLSymbol $CACHE_INFERENCE_RESULTS_;
    private static SubLSymbol $sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 2200L)
    public static SubLObject declare_known_antecedent_rule_removal_module_for_rule(SubLObject rule, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $known_antecedent_rule_enabledP$.getDynamicValue(thread)) {
            Errors.warn($str0$__knownAntecedentRule_support_is_, rule);
            return NIL;
        }
        thread.resetMultipleValues();
        SubLObject plist = known_antecedent_rule_removal_module_plist(rule);
        SubLObject name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject hl_module = inference_modules.inference_removal_module(name, plist);
        note_hl_module_for_known_antecedent_rule(rule, hl_module);
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3000L)
    public static SubLObject undeclare_known_antecedent_rule_removal_module_for_rule(SubLObject rule, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        clear_hl_module_for_known_antecedent_rule(rule);
        if (NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject plist = known_antecedent_rule_removal_module_plist(rule);
            SubLObject name = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return inference_modules.undeclare_inference_removal_module(name, reclassifyP);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3400L)
    public static SubLObject redeclare_known_antecedent_rule_removal_module_for_rule(SubLObject rule) {
        undeclare_known_antecedent_rule_removal_module_for_rule(rule, UNPROVIDED);
        return declare_known_antecedent_rule_removal_module_for_rule(rule, T);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3900L)
    public static SubLObject undeclare_all_known_antecedent_rule_removal_modules() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdohash_table = inference_modules.hl_module_store();
        SubLObject name_var = NIL;
        SubLObject hl_module = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                name_var = Hashtables.getEntryKey(cdohash_entry);
                hl_module = Hashtables.getEntryValue(cdohash_entry);
                SubLObject name = inference_modules.hl_module_name(hl_module);
                if (NIL != string_utilities.substringP($via_known_antecedent_rule_string$.getGlobalValue(), string_utilities.str(name), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    count = Numbers.add(count, ONE_INTEGER);
                    inference_modules.undeclare_inference_removal_module(name, NIL);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        inference_modules.reclassify_removal_modules();
        return count;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 4300L)
    public static SubLObject known_antecedent_rule_removal_module_plist(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : rule;
        SubLObject plist = NIL;
        SubLObject name = NIL;
        SubLObject cnf = assertions_high.assertion_cnf(rule);
        SubLObject pos_lits = clauses.pos_lits(cnf);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !ONE_INTEGER.numE(Sequences.length(pos_lits))) {
            Errors.error($str3$__knownAntecedentRule_currently_o, rule);
        }
        SubLObject pos_lit = pos_lits.first();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != el_utilities.sequence_var(pos_lit, UNPROVIDED)) {
            Errors.error($str4$__knownAntecedentRule_cannot_hand, rule);
        }
        SubLObject sense = $POS;
        plist = conses_high.putf(plist, $SENSE, sense);
        SubLObject direction = assertions_high.assertion_direction(rule);
        plist = conses_high.putf(plist, $DIRECTION, direction);
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(pos_lit);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == forts.fort_p(predicate)) {
            Errors.error($str8$__knownAntecedentRule_currently_o, rule);
        }
        plist = conses_high.putf(plist, $PREDICATE, predicate);
        name = known_antecedent_rule_hl_module_name(rule);
        SubLObject v_arity = el_utilities.formula_arity(pos_lit, UNPROVIDED);
        plist = conses_high.putf(plist, $ARITY, v_arity);
        SubLObject mt = assertions_high.assertion_mt(rule);
        plist = conses_high.putf(plist, $REQUIRED_MT, mt);
        SubLObject required_pattern = list($UNIFY, pos_lit);
        plist = conses_high.putf(plist, $REQUIRED_PATTERN, required_pattern);
        SubLObject cost_pattern = list($CALL, $sym15$REMOVAL_KNOWN_ANTECEDENT_RULE_COST, $INPUT, rule);
        plist = conses_high.putf(plist, $COST_PATTERN, cost_pattern);
        SubLObject output_generate_pattern = list($CALL, $sym18$REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR, $INPUT, rule, list($NOT, name));
        plist = conses_high.putf(plist, $OUTPUT_GENERATE_PATTERN, output_generate_pattern);
        return Values.values(plist, name);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 6500L)
    public static SubLObject known_antecedent_rule_removal_module_name(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject plist = known_antecedent_rule_removal_module_plist(rule);
        SubLObject name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return name;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 6800L)
    public static SubLObject removal_known_antecedent_rule_cost(SubLObject asent, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = NIL;
        if (NIL == $within_removal_known_antecedent_rule_costP$.getDynamicValue(thread)) {
            SubLObject _prev_bind_0 = $within_removal_known_antecedent_rule_costP$.currentBinding(thread);
            try {
                $within_removal_known_antecedent_rule_costP$.bind(T, thread);
                SubLObject store = inference_worker.currently_active_problem_store();
                if (NIL != store) {
                    SubLObject meta_store = inference_datastructures_problem_store.problem_store_meta_problem_store(store);
                    SubLObject mt = mt_relevance_macros.inference_relevant_mt();
                    SubLObject name = known_antecedent_rule_removal_module_name(rule);
                    SubLObject query_static_properties = removal_known_antecedent_rule_static_properties(asent, rule, meta_store, list($NOT, name));
                    SubLObject removal_inference = inference_utilities.new_continuable_antecedent_inference(asent, mt, rule, meta_store, query_static_properties);
                    SubLObject transformed_problem = inference_datastructures_inference.inference_root_problem(removal_inference);
                    if (NIL != transformed_problem && NIL != inference_datastructures_inference.simplest_inference_p(removal_inference)) {
                        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(removal_inference);
                        cost = inference_datastructures_enumerated_types.number_of_children_for_productivity(inference_lookahead_productivity.memoized_problem_max_removal_productivity(transformed_problem, strategy));
                    }
                    inference_datastructures_inference.destroy_inference(removal_inference);
                }
            } finally {
                $within_removal_known_antecedent_rule_costP$.rebind(_prev_bind_0, thread);
            }
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 8000L)
    public static SubLObject removal_known_antecedent_rule_inference(SubLObject sentence, SubLObject mt, SubLObject rule, SubLObject problem_store, SubLObject allowed_modules) {
        SubLObject query_static_properties = removal_known_antecedent_rule_static_properties(sentence, rule, problem_store, allowed_modules);
        SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 8400L)
    public static SubLObject removal_known_antecedent_rule_iterator(SubLObject sentence, SubLObject rule, SubLObject allowed_modules) {
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        SubLObject query_static_properties = removal_known_antecedent_rule_static_properties(sentence, rule, problem_store, allowed_modules);
        SubLObject inference = inference_utilities.new_continuable_antecedent_inference(sentence, mt_relevance_macros.inference_relevant_mt(), rule, problem_store, query_static_properties);
        SubLObject query_dynamic_properties = removal_known_antecedent_rule_dynamic_properties(sentence);
        SubLObject iterator = inference_iterators.new_inference_iterator(inference, query_dynamic_properties, $sym21$DESTROY_INFERENCE);
        return iterator;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 9000L)
    public static SubLObject removal_known_antecedent_rule_static_properties(SubLObject sentence, SubLObject rule, SubLObject problem_store, SubLObject allowed_modules) {
        SubLObject query_static_properties = list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $PROOF, $ALLOWED_RULES, list(rule), $ALLOWED_MODULES, allowed_modules);
        return query_static_properties;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 9500L)
    public static SubLObject removal_known_antecedent_rule_dynamic_properties(SubLObject sentence) {
        SubLObject query_dynamic_properties = ConsesLow.list(new SubLObject[] { $CONTINUABLE_, NIL, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $RETURN, list($TEMPLATE, reader.bq_cons(sentence, $list31)), $ANSWER_LANGUAGE, $HL, $CACHE_INFERENCE_RESULTS_, NIL });
        return query_dynamic_properties;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10100L)
    public static SubLObject note_hl_module_for_known_antecedent_rule(SubLObject rule, SubLObject hl_module) {
        return dictionary.dictionary_enter($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, hl_module);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10200L)
    public static SubLObject clear_hl_module_for_known_antecedent_rule(SubLObject rule) {
        return dictionary.dictionary_remove($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10400L)
    public static SubLObject hl_module_for_known_antecedent_rule(SubLObject rule) {
        return dictionary.dictionary_lookup($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10500L)
    public static SubLObject known_antecedent_rule_hl_module_name(SubLObject rule) {
        SubLObject existing_hl_module = hl_module_for_known_antecedent_rule(rule);
        if (NIL != existing_hl_module) {
            return inference_modules.hl_module_name(existing_hl_module);
        }
        SubLObject pos_lit = clauses.pos_lits(assertions_high.assertion_cnf(rule)).first();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(pos_lit);
        SubLObject sense = $POS;
        SubLObject string = Sequences.cconcatenate(string_utilities.str(predicate), $via_known_antecedent_rule_string$.getGlobalValue());
        return removal_module_utilities.determine_hl_module_name(string, sense);
    }

    public static SubLObject declare_removal_modules_known_antecedent_rule_file() {
        declareFunction("declare_known_antecedent_rule_removal_module_for_rule", "DECLARE-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-FOR-RULE", 1, 1, false);
        declareFunction("undeclare_known_antecedent_rule_removal_module_for_rule", "UNDECLARE-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-FOR-RULE", 1, 1, false);
        declareFunction("redeclare_known_antecedent_rule_removal_module_for_rule", "REDECLARE-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-FOR-RULE", 1, 0, false);
        declareFunction("undeclare_all_known_antecedent_rule_removal_modules", "UNDECLARE-ALL-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULES", 0, 0, false);
        declareFunction("known_antecedent_rule_removal_module_plist", "KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-PLIST", 1, 0, false);
        declareFunction("known_antecedent_rule_removal_module_name", "KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-NAME", 1, 0, false);
        declareFunction("removal_known_antecedent_rule_cost", "REMOVAL-KNOWN-ANTECEDENT-RULE-COST", 2, 0, false);
        declareFunction("removal_known_antecedent_rule_inference", "REMOVAL-KNOWN-ANTECEDENT-RULE-INFERENCE", 5, 0, false);
        declareFunction("removal_known_antecedent_rule_iterator", "REMOVAL-KNOWN-ANTECEDENT-RULE-ITERATOR", 3, 0, false);
        declareFunction("removal_known_antecedent_rule_static_properties", "REMOVAL-KNOWN-ANTECEDENT-RULE-STATIC-PROPERTIES", 4, 0, false);
        declareFunction("removal_known_antecedent_rule_dynamic_properties", "REMOVAL-KNOWN-ANTECEDENT-RULE-DYNAMIC-PROPERTIES", 1, 0, false);
        declareFunction("note_hl_module_for_known_antecedent_rule", "NOTE-HL-MODULE-FOR-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        declareFunction("clear_hl_module_for_known_antecedent_rule", "CLEAR-HL-MODULE-FOR-KNOWN-ANTECEDENT-RULE", 1, 0, false);
        declareFunction("hl_module_for_known_antecedent_rule", "HL-MODULE-FOR-KNOWN-ANTECEDENT-RULE", 1, 0, false);
        declareFunction("known_antecedent_rule_hl_module_name", "KNOWN-ANTECEDENT-RULE-HL-MODULE-NAME", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_known_antecedent_rule_file() {
        $known_antecedent_rule_enabledP$ = defvar("*KNOWN-ANTECEDENT-RULE-ENABLED?*", NIL);
        $via_known_antecedent_rule_string$ = deflexical("*VIA-KNOWN-ANTECEDENT-RULE-STRING*", $str1$_via_known_antecedent_rule);
        $within_removal_known_antecedent_rule_costP$ = SubLFiles.defparameter("*WITHIN-REMOVAL-KNOWN-ANTECEDENT-RULE-COST?*", NIL);
        $known_antecedent_rule_hl_module_index$ = deflexical("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*", maybeDefault($sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_, $known_antecedent_rule_hl_module_index$, () -> (dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED))));
        return NIL;
    }

    public static SubLObject setup_removal_modules_known_antecedent_rule_file() {
        subl_macro_promotions.declare_defglobal($sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_known_antecedent_rule_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_known_antecedent_rule_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_known_antecedent_rule_file();
    }

    static {
        me = new removal_modules_known_antecedent_rule();
        $known_antecedent_rule_enabledP$ = null;
        $via_known_antecedent_rule_string$ = null;
        $within_removal_known_antecedent_rule_costP$ = null;
        $known_antecedent_rule_hl_module_index$ = null;
        $str0$__knownAntecedentRule_support_is_ = makeString("#$knownAntecedentRule support is disabled.  Asserting #$knownAntecedentRule on ~s will have no effect.~%");
        $str1$_via_known_antecedent_rule = makeString("-via-known-antecedent-rule");
        $sym2$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $str3$__knownAntecedentRule_currently_o = makeString("#$knownAntecedentRule currently only applies to rules with exactly one poslit, but was applied to ~s");
        $str4$__knownAntecedentRule_cannot_hand = makeString("#$knownAntecedentRule cannot handle poslits with sequence variables, but was applied to ~s");
        $POS = makeKeyword("POS");
        $SENSE = makeKeyword("SENSE");
        $DIRECTION = makeKeyword("DIRECTION");
        $str8$__knownAntecedentRule_currently_o = makeString("#$knownAntecedentRule currently only applies to rules with a fort as the predicate of their single pos-lit, but was applied to ~s");
        $PREDICATE = makeKeyword("PREDICATE");
        $ARITY = makeKeyword("ARITY");
        $REQUIRED_MT = makeKeyword("REQUIRED-MT");
        $UNIFY = makeKeyword("UNIFY");
        $REQUIRED_PATTERN = makeKeyword("REQUIRED-PATTERN");
        $CALL = makeKeyword("CALL");
        $sym15$REMOVAL_KNOWN_ANTECEDENT_RULE_COST = makeSymbol("REMOVAL-KNOWN-ANTECEDENT-RULE-COST");
        $INPUT = makeKeyword("INPUT");
        $COST_PATTERN = makeKeyword("COST-PATTERN");
        $sym18$REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR = makeSymbol("REMOVAL-KNOWN-ANTECEDENT-RULE-ITERATOR");
        $NOT = makeKeyword("NOT");
        $OUTPUT_GENERATE_PATTERN = makeKeyword("OUTPUT-GENERATE-PATTERN");
        $sym21$DESTROY_INFERENCE = makeSymbol("DESTROY-INFERENCE");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
        $PROOF = makeKeyword("PROOF");
        $ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
        $ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $RETURN = makeKeyword("RETURN");
        $TEMPLATE = makeKeyword("TEMPLATE");
        $list31 = list(makeKeyword("SUPPORTS"));
        $ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
        $HL = makeKeyword("HL");
        $CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_ = makeSymbol("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*");
    }
}
/*
 *
 * Total time: 113 ms
 *
 */